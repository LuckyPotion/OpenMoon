import com.sun.source.tree.*;
import com.sun.source.util.JavacTask;
import com.sun.source.util.TreeScanner;
import com.sun.source.util.Trees;
import com.sun.source.util.SourcePositions;
import javax.lang.model.element.Modifier;
import java.io.*;
import java.net.URI;
import java.nio.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.security.MessageDigest;
import java.time.LocalDateTime;
import java.util.*;
import java.util.zip.*;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import javax.tools.*;

/** Explicit source ZIPs -> exact-case javac inputs -> exact-case deterministic class ZIP.
 * No archive source or class entry is materialized as a filesystem path.
 * inspect mode parses declarations only; it does not establish semantic recovery or build closure. */
public final class ZipSourceCompiler {
    static final class Source extends SimpleJavaFileObject {
        final String entry, archive, sha256;
        String text;
        String savedText;
        List<int[]> contextEdits=new ArrayList<>();
        Source(String entry, Path archive, byte[] bytes) throws Exception {
            super(new URI("memsrc", null, "/" + entry, null), Kind.SOURCE);
            this.entry=entry; this.archive=archive.toString(); sha256=hash(bytes);
            String decoded=StandardCharsets.UTF_8.newDecoder().onMalformedInput(CodingErrorAction.REPORT)
                .onUnmappableCharacter(CodingErrorAction.REPORT).decode(ByteBuffer.wrap(bytes)).toString();
            text=decoded.startsWith("\ufeff") ? decoded.substring(1) : decoded;
            savedText=text;
        }
        @Override public CharSequence getCharContent(boolean ignored) { return text; }
        long savedPosition(long value){
            if(value<0)return value;long delta=0;
            for(int[] edit:contextEdits){long a=edit[0]+delta,b=a+edit[2];if(value<a)break;if(value<=b)return edit[0]+Math.min(value-a,edit[1]-edit[0]);delta+=edit[2]-(edit[1]-edit[0]);}
            return value-delta;
        }
    }
    static final class Output extends SimpleJavaFileObject {
        final String binaryName;
        final ByteArrayOutputStream bytes=new ByteArrayOutputStream();
        boolean opened;
        Output(String name) {
            super(URI.create("memclass:///"+name.replace('.','/')+".class"), Kind.CLASS);
            binaryName=name;
        }
        @Override public OutputStream openOutputStream() throws IOException {
            if(opened) throw new IOException("Duplicate write: "+binaryName);
            opened=true; return bytes;
        }
    }
    static final class ClassInput extends SimpleJavaFileObject {
        final String binaryName, archive, entry, logicalEntry, sha256,compilerQuerySha256;
        final byte[] bytes;
        final int version, archiveIndex;
        final boolean unreadable;
        int reads;
        ClassInput(String entry, String logicalEntry, int version, int archiveIndex,
                Path archive, byte[] bytes) throws Exception {
            super(new URI("memclasspath", null, "/archive-" + archiveIndex + "/" + entry, null), Kind.CLASS);
            this.entry=entry; this.archive=archive.toString();
            this.bytes=Boolean.getBoolean("moon.sourceAccessProjection")&&bytes.length>=4&&ByteBuffer.wrap(bytes).getInt()==0xCAFEBABE?queryVisibility(bytes):bytes;
            this.logicalEntry=logicalEntry;this.version=version;this.archiveIndex=archiveIndex;
            unreadable=bytes.length<4 || ByteBuffer.wrap(bytes).getInt()!=0xCAFEBABE;
            String owner=unreadable ? logicalEntry.substring(0,logicalEntry.length()-6) : classOwner(bytes);
            validateEntry(owner);
            if(owner.contains(".") || owner.contains(";") || owner.contains("["))
                throw new IOException("Invalid class owner path: "+owner);
            if(!logicalEntry.equals(owner+".class"))
                throw new IOException("Class entry/owner mismatch: "+entry+" logical="+logicalEntry+" != "+owner+".class");
            binaryName=owner.replace('/','.'); sha256=hash(bytes);compilerQuerySha256=hash(this.bytes);
        }
        @Override public InputStream openInputStream() throws IOException {
            reads++;
            if(unreadable) throw new IOException("Unreadable classpath dependency (bad CAFEBABE): "+archive+"!"+entry+" sha256="+sha256);
            return new ByteArrayInputStream(bytes);
        }
        Map<String,Object> row() {
            return obj("binary_name",binaryName,"entry",entry,"logical_entry",logicalEntry,
                "archive",archive,"archive_index",archiveIndex,"version",version,"sha256",sha256,
                "identity_scope",unreadable?"entry_path_only_not_validated_owner":"this_class_exact",
                "unreadable",unreadable,"compiler_reads",reads,"compiler_query_visibility_view",!sha256.equals(compilerQuerySha256),"compiler_query_sha256",compilerQuerySha256);
        }
    }
    static final class MemoryManager extends ForwardingJavaFileManager<StandardJavaFileManager> {
        final Map<String,Output> output=new TreeMap<>();
        final Map<String,ClassInput> classpath;
        MemoryManager(StandardJavaFileManager standard,Map<String,ClassInput> classpath) {
            super(standard); this.classpath=classpath;
        }
        @Override public String inferBinaryName(Location where,JavaFileObject file) {
            return file instanceof ClassInput cl ? cl.binaryName : super.inferBinaryName(where,file);
        }
        @Override public boolean contains(Location where,FileObject file) throws IOException {
            if(file instanceof ClassInput) return where==StandardLocation.CLASS_PATH;
            return super.contains(where,file);
        }
        @Override public boolean hasLocation(Location where) {
            if(where==StandardLocation.CLASS_PATH) return true;
            return super.hasLocation(where);
        }
        @Override public boolean isSameFile(FileObject a,FileObject b) {
            if(a instanceof ClassInput || b instanceof ClassInput || a instanceof Source || b instanceof Source)
                return a.toUri().equals(b.toUri());
            return super.isSameFile(a,b);
        }
        @Override public JavaFileObject getJavaFileForOutput(Location where, String name,
                JavaFileObject.Kind kind, FileObject sibling) throws IOException {
            if(where!=StandardLocation.CLASS_OUTPUT || kind!=JavaFileObject.Kind.CLASS)
                throw new IOException("Unsupported output: "+where+" "+kind);
            Output file=new Output(name);
            if(output.putIfAbsent(name,file)!=null) throw new IOException("Duplicate exact class: "+name);
            return file;
        }
        @Override public FileObject getFileForOutput(Location where,String pkg,String name,FileObject sibling)
                throws IOException { throw new IOException("Resource/source output disabled"); }
        @Override public Iterable<JavaFileObject> list(Location where,String pkg,
                Set<JavaFileObject.Kind> kinds,boolean recurse) throws IOException {
            Set<JavaFileObject.Kind> allowed=new HashSet<>(kinds);
            allowed.remove(JavaFileObject.Kind.SOURCE);
            if(where==StandardLocation.CLASS_PATH) {
                if(!allowed.contains(JavaFileObject.Kind.CLASS)) return List.of();
                String prefix=pkg.isEmpty()?"":pkg+".";
                return classpath.values().stream().filter(cl->cl.binaryName.startsWith(prefix) &&
                    (recurse || cl.binaryName.substring(prefix.length()).indexOf('.')<0))
                    .map(cl->(JavaFileObject)cl).toList();
            }
            return super.list(where,pkg,allowed,recurse);
        }
        @Override public JavaFileObject getJavaFileForInput(Location where,String name,JavaFileObject.Kind kind)
                throws IOException {
            if(kind==JavaFileObject.Kind.SOURCE) return null;
            if(where==StandardLocation.CLASS_PATH) return kind==JavaFileObject.Kind.CLASS ? classpath.get(name) : null;
            return super.getJavaFileForInput(where,name,kind);
        }
        @Override public FileObject getFileForInput(Location where,String pkg,String name) throws IOException {
            return where==StandardLocation.CLASS_PATH ? null : super.getFileForInput(where,pkg,name);
        }
    }
    static Map<String,Object> obj(Object... pairs) {
        Map<String,Object> m=new LinkedHashMap<>();
        for(int i=0;i<pairs.length;i+=2) m.put((String)pairs[i],pairs[i+1]);
        return m;
    }
    static String hash(byte[] bytes) throws Exception {
        return HexFormat.of().withUpperCase().formatHex(MessageDigest.getInstance("SHA-256").digest(bytes));
    }
    static String hash(Path file) throws Exception {
        MessageDigest digest=MessageDigest.getInstance("SHA-256");
        try(InputStream in=Files.newInputStream(file)) {
            byte[] chunk=new byte[65536]; int count;
            while((count=in.read(chunk))!=-1) digest.update(chunk,0,count);
        }
        return HexFormat.of().withUpperCase().formatHex(digest.digest());
    }
    static void json(Object v,Writer w) throws IOException {
        if(v==null) { w.write("null"); return; }
        if(v instanceof Number || v instanceof Boolean) { w.write(v.toString()); return; }
        if(v instanceof Map<?,?> m) {
            w.write('{'); boolean comma=false;
            for(var e:m.entrySet()) { if(comma)w.write(','); comma=true;json(e.getKey().toString(),w);w.write(':');json(e.getValue(),w); }
            w.write('}'); return;
        }
        if(v instanceof Iterable<?> list) {
            w.write('[');boolean comma=false;
            for(Object x:list) { if(comma)w.write(',');comma=true;json(x,w); }
            w.write(']');return;
        }
        String s=v.toString();w.write('"');
        for(int i=0;i<s.length();i++) {
            char c=s.charAt(i);
            if(c=='"' || c=='\\') { w.write('\\');w.write(c); }
            else if(c<32 || Character.isSurrogate(c)) w.write(String.format(Locale.ROOT,"\\u%04x",(int)c));
            else w.write(c);
        }
        w.write('"');
    }
    static void write(Path p,Object value) throws IOException {
        try(Writer w=Files.newBufferedWriter(p,StandardCharsets.UTF_8,StandardOpenOption.CREATE_NEW)) {
            json(value,w);w.write('\n');
        }
    }
    static Path input(Path root,String name) throws IOException {
        Path p=Path.of(name).toRealPath();
        if(!p.startsWith(root)) throw new IOException("Input is outside project root: "+p);
        return p;
    }
    static void validateEntry(String entry) throws IOException {
        if(entry.startsWith("/") || entry.contains("\\") || entry.contains(":"))
            throw new IOException("Noncanonical source path: "+entry);
        for(String part:entry.split("/",-1)) if(part.isEmpty() || part.equals(".") || part.equals(".."))
            throw new IOException("Noncanonical source path: "+entry);
    }
    static void validateArchiveEntry(ZipEntry entry) throws IOException {
        String name=entry.getName();
        if(entry.isDirectory()) name=name.substring(0,name.length()-1);
        validateEntry(name);
    }
    // Read only this_class identity; javac remains responsible for complete classfile validation.
    static String classOwner(byte[] bytes) throws IOException {
        try(DataInputStream in=new DataInputStream(new ByteArrayInputStream(bytes))) {
            if(in.readInt()!=0xCAFEBABE) throw new IOException("Non-classfile input (bad CAFEBABE header)");
            in.readUnsignedShort();in.readUnsignedShort();
            int count=in.readUnsignedShort(); Object[] cp=new Object[count];
            for(int i=1;i<count;i++) {
                int tag=in.readUnsignedByte();
                switch(tag) {
                    case 1 -> cp[i]=in.readUTF();
                    case 7 -> cp[i]=in.readUnsignedShort();
                    case 3,4,9,10,11,12,17,18 -> in.skipNBytes(4);
                    case 5,6 -> { in.skipNBytes(8); i++; }
                    case 8,16,19,20 -> in.skipNBytes(2);
                    case 15 -> in.skipNBytes(3);
                    default -> throw new IOException("Unsupported class constant tag: "+tag);
                }
            }
            in.readUnsignedShort();int self=in.readUnsignedShort();
            if(self<=0 || self>=count || !(cp[self] instanceof Integer name) ||
                name<=0 || name>=count || !(cp[name] instanceof String owner))
                throw new IOException("Invalid this_class constant");
            validateEntry(owner);
            if(owner.contains(".") || owner.contains(";" ) || owner.contains("["))
                throw new IOException("Invalid class owner: "+owner);
            return owner;
        }
    }
    /** Classpath declaration visibility only. Instructions, descriptors and
     * original vendor files are unchanged and never copied into owned output. */
    static byte[] queryVisibility(byte[] original)throws IOException{
        byte[] bytes=original.clone();
        class Cursor{
            int p=8;String[] utf;
            int u2(){int v=(bytes[p]&255)<<8|(bytes[p+1]&255);p+=2;return v;}
            int u4(){int v=ByteBuffer.wrap(bytes,p,4).getInt();p+=4;return v;}
            void visible(int at){int flags=(bytes[at]&255)<<8|(bytes[at+1]&255);flags=(flags&~7)|1;bytes[at]=(byte)(flags>>>8);bytes[at+1]=(byte)flags;}
            void attributes(boolean classLevel)throws IOException{
                int count=u2();for(int i=0;i<count;i++){
                    int name=u2(),length=u4(),start=p;
                    if(classLevel&&"InnerClasses".equals(utf[name])){int n=u2();for(int j=0;j<n;j++){p+=6;visible(p);p+=2;}}
                    p=start+length;if(p<start||p>bytes.length)throw new IOException("Malformed query attribute");
                }
            }
            void run()throws IOException{
                int count=u2();utf=new String[count];for(int i=1;i<count;i++){
                    int tag=bytes[p++]&255;
                    switch(tag){
                        case 1->{int n=u2();utf[i]=new String(bytes,p,n,StandardCharsets.UTF_8);p+=n;}
                        case 3,4,9,10,11,12,17,18->p+=4;
                        case 5,6->{p+=8;i++;}
                        case 7,8,16,19,20->p+=2;
                        case 15->p+=3;
                        default->throw new IOException("Unknown query CP tag "+tag);
                    }
                }
                visible(p);p+=6;int interfaces=u2();p+=interfaces*2;
                for(int group=0;group<2;group++){int n=u2();for(int i=0;i<n;i++){int at=p;p+=2;int name=u2();p+=2;if(!"<clinit>".equals(utf[name]))visible(at);attributes(false);}}
                attributes(true);if(p!=bytes.length)throw new IOException("Query declaration length mismatch");
            }
        }
        new Cursor().run();return bytes;
    }
    static List<Object> parsedUnits(JavacTask task,Map<String,Source> sources,boolean identities) throws IOException {
        List<Object> units=new ArrayList<>();
        for(CompilationUnitTree unit:task.parse()) {
            String pkg=unit.getPackageName()==null?"":unit.getPackageName().toString().replace('.','/');
            List<Object> declarations=new ArrayList<>();
            boolean matched=false;
            String entry=unit.getSourceFile().toUri().getPath().substring(1);
            Source source=sources.get(entry);
            if(source==null) throw new IOException("Unexpected parsed source identity: "+unit.getSourceFile().toUri());
            for(Tree t:unit.getTypeDecls()) if(t instanceof ClassTree cl) {
                declaration(cl,pkg.isEmpty()?"":pkg+"/",true,declarations);
                String primary=(pkg.isEmpty()?"":pkg+"/")+cl.getSimpleName()+".java";
                if(primary.equals(source.entry)) matched=true;
            }
            String info=(pkg.isEmpty()?"":pkg+"/")+"package-info.java";
            if(source.entry.equals(info) && unit.getModule()==null) matched=true;
            // Modules are not part of this ordinary-classpath pilot.
            if(unit.getModule()!=null) throw new IOException("Module sources unsupported in this pilot: "+source.entry);
            if(identities && !matched) throw new IOException("Source entry/declaration owner mismatch: "+source.entry+" package="+pkg);
            units.add(obj("uri",source.toUri().toString(),"package",pkg,"declarations",declarations));
        }
        return units;
    }
    /** Compile-only visibility view. Saved source and final runtime flags remain
     * unchanged; the build must restore declaration flags after all lowering.
     * This supplies Java access queries for independently materialized nestmates.
     */
    static int projectSourceAccess(JavaCompiler compiler,MemoryManager manager,
            List<String> flags,Map<String,Source> sources,Path out)throws Exception {
        var sink=new DiagnosticCollector<JavaFileObject>();
        JavacTask task=(JavacTask)compiler.getTask(null,manager,sink,flags,null,sources.values());
        var parsed=task.parse();SourcePositions pos=Trees.instance(task).getSourcePositions();int count=0;
        List<Object> records=new ArrayList<>();
        for(var unit:parsed){
            Source source=sources.get(unit.getSourceFile().toUri().getPath().substring(1));
            if(source.entry.equals("recovery/source/CarrierOps.java"))continue;
            record Edit(int start,int end,String value){}
            List<Edit> edits=new ArrayList<>();
            new TreeScanner<Void,Boolean>(){
                void modifiers(Tree declaration,ModifiersTree modifiers,boolean field,boolean expose){
                    int start=(int)pos.getStartPosition(unit,declaration);
                    if(start<0)return;
                    int end=(int)pos.getEndPosition(unit,modifiers);
                    if(end<start)end=start;
                    String old=source.text.substring(start,end);
                    // Modifier tokens occur outside comments and literals. Javac
                    // records their range; source annotations are retained.
                    String fresh=old;
                    if(expose&&!modifiers.getFlags().contains(Modifier.PUBLIC)){
                        fresh=fresh.replaceFirst("\\b(?:private|protected)\\b", "public");
                        if(fresh.equals(old))fresh="public "+fresh;
                    }
                    if((field||declaration instanceof MethodTree)&&modifiers.getFlags().contains(Modifier.FINAL))fresh=fresh.replaceFirst("\\bfinal\\b", "");
                    if(!fresh.equals(old))edits.add(new Edit(start,end,fresh));
                }
                @Override public Void visitClass(ClassTree c,Boolean ignored){
                    if(c.getSimpleName().toString().startsWith("__Source"))return null;
                    if(c.getKind()==Tree.Kind.ENUM||c.getKind()==Tree.Kind.ANNOTATION_TYPE||c.getKind()==Tree.Kind.RECORD)return null;
                    if(!c.getSimpleName().toString().isEmpty())modifiers(c,c.getModifiers(),false,true);
                    boolean isInterface=c.getKind()==Tree.Kind.INTERFACE||c.getKind()==Tree.Kind.ANNOTATION_TYPE;
                    for(Tree member:c.getMembers()){
                        if(member instanceof VariableTree v)modifiers(v,v.getModifiers(),!isInterface,!isInterface);
                        else if(member instanceof MethodTree m){if(!m.getName().toString().startsWith("__source")&&!isInterface&&(!m.getModifiers().getFlags().contains(Modifier.PRIVATE)||m.getName().contentEquals("<init>")))modifiers(m,m.getModifiers(),false,true);}
                        else if(member instanceof ClassTree nested)scan(nested,false);
                    }return null;
                }
            }.scan(unit,false);
            Map<String,Edit> unique=new LinkedHashMap<>();for(Edit e:edits)unique.put(e.start+":"+e.end,e);List<Edit> selected=new ArrayList<>(unique.values());
            selected.sort(Comparator.comparingInt(Edit::start));for(Edit e:selected)source.contextEdits.add(new int[]{e.start,e.end,e.value.length()});
            selected.sort(Comparator.comparingInt(Edit::start).reversed());int previous=source.text.length()+1;
            for(Edit edit:selected){if(edit.end>previous)throw new IOException("Overlapping source access projection: "+source.entry);source.text=source.text.substring(0,edit.start)+edit.value+source.text.substring(edit.end);previous=edit.start;}
            if(!selected.isEmpty())records.add(obj("entry",source.entry,"saved_source_sha256",source.sha256,"compiler_view_sha256",hash(source.text.getBytes(StandardCharsets.UTF_8)),"visibility_or_final_query_edits",selected.size(),"runtime_declaration_restore_required",true,"source_offset_edits",source.contextEdits.stream().map(e->obj("start",e[0],"end",e[1],"compiler_text_length",e[2])).toList()));
            count+=selected.size();
        }
        if(sink.getDiagnostics().stream().anyMatch(d->d.getKind()==Diagnostic.Kind.ERROR))throw new IOException("Compile-context projection source parse failed");
        write(out.resolve("source-access-projection.json"),records);return count;
    }
    static void declaration(ClassTree tree,String prefix,boolean top,List<Object> rows) {
        String name=tree.getSimpleName().toString();
        if(name.isEmpty()) return;
        String owner=prefix+name;
        rows.add(obj("owner",owner,"kind",tree.getKind().name(),"top_level",top,
            "identity_scope",top?"parsed_top_level":"parsed_named_member",
            "flags",tree.getModifiers().getFlags().stream().map(Object::toString).sorted().toList()));
        // Local and anonymous class binary suffixes are compiler-assigned, not guessed here.
        for(Tree member:tree.getMembers()) if(member instanceof ClassTree nested)
            declaration(nested,owner+"$",false,rows);
    }
    static List<Object> diagnostics(DiagnosticCollector<JavaFileObject> collector) {
        List<Object> rows=new ArrayList<>();
        for(Diagnostic<? extends JavaFileObject> d:collector.getDiagnostics()) {Source s=d.getSource() instanceof Source source?source:null;rows.add(obj(
            "kind",d.getKind().name(),"code",d.getCode(),"source",d.getSource()==null?null:d.getSource().toUri().toString(),
            "line",d.getLineNumber(),"column",d.getColumnNumber(),"position",s==null?d.getPosition():s.savedPosition(d.getPosition()),
            "start",s==null?d.getStartPosition():s.savedPosition(d.getStartPosition()),"end",s==null?d.getEndPosition():s.savedPosition(d.getEndPosition()),"message",d.getMessage(Locale.ROOT),"positions_reference",s!=null&&!s.contextEdits.isEmpty()?"saved_source_offsets_compiler_line_column":"saved_source"));}
        return rows;
    }
    /** Use JDK17's JarFile effective view for canonical MR archives.
     * ZIP duplicate/path validation is stricter than javac and runs before selection.
     * Module descriptors remain provenance records, never ordinary classpath types. */
    static Map<String,ClassInput> classpath(Path root,Path out,List<String> names,int release,
            String unreadablePolicy,Map<String,Object> report) throws Exception {
        for(String prop:List.of("jdk.util.jar.enableMultiRelease","jdk.util.jar.version"))
            if(System.getProperty(prop)!=null) throw new IOException("Ambient MR override unsupported: "+prop);
        Map<String,ClassInput> cp=new TreeMap<>();List<Object> archives=new ArrayList<>();
        List<Object> entries=new ArrayList<>(),shadows=new ArrayList<>();
        List<ClassInput> unreadable=new ArrayList<>();
        int index=0;
        for(String name:names) {
            Path p=input(root,name);
            if(!Files.isRegularFile(p)) throw new IOException("Classpath must be an explicit project archive: "+p);
            Set<String> seen=new HashSet<>();Map<String,Map<String,Object>> rows=new LinkedHashMap<>();
            try(JarFile z=new JarFile(p.toFile(),false,ZipFile.OPEN_READ,
                    Runtime.Version.parse(Integer.toString(Math.max(8,release))))) {
                Manifest manifest=z.getManifest();
                String mr=manifest==null?null:manifest.getMainAttributes().getValue("Multi-Release");
                var raw=z.entries();
                while(raw.hasMoreElements()) {
                    var e=raw.nextElement();
                    if(!seen.add(e.getName())) throw new IOException("Duplicate exact archive entry: "+e.getName());
                    validateArchiveEntry(e);
                    if(e.isDirectory() || !e.getName().endsWith(".class")) continue;
                    // JarFile and javac's ZIP filesystem differ on malformed MR paths.
                    // Reject these layouts instead of claiming a compatible effective view.
                    if(z.isMultiRelease() && e.getName().startsWith("META-INF/versions/")) {
                        String rest=e.getName().substring("META-INF/versions/".length());
                        int slash=rest.indexOf('/');
                        String v=slash<0?rest:rest.substring(0,slash);
                        long number;
                        try { number=Long.parseLong(v); }
                        catch(NumberFormatException ex) { throw new IOException("Invalid multi-release class path: "+e.getName(),ex); }
                        if(slash<0 || !v.matches("[1-9][0-9]*") || number<9 || number>Integer.MAX_VALUE ||
                                rest.substring(slash+1).startsWith("META-INF/"))
                            throw new IOException("Invalid multi-release class path: "+e.getName());
                    }
                    byte[] bytes;
                    try(InputStream in=z.getInputStream(e)) { bytes=in.readAllBytes(); }
                    String rawLogical=e.getName();int rawVersion=0;
                    if(e.getName().startsWith("META-INF/versions/")) {
                        String rest=e.getName().substring("META-INF/versions/".length());
                        int slash=rest.indexOf('/');
                        if(slash>=0) {
                            rawLogical=rest.substring(slash+1);
                            try { rawVersion=Integer.parseInt(rest.substring(0,slash)); }
                            catch(NumberFormatException ignored) { rawVersion=-1; }
                        } else rawVersion=-1;
                    }
                    rows.put(e.getName(),obj("archive_index",index,"archive",p.toString(),"entry",e.getName(),
                        "logical_entry",rawLogical,"version",rawVersion,
                        "sha256",hash(bytes),"size",bytes.length,"disposition",
                        e.getName().startsWith("META-INF/versions/")?
                          (z.isMultiRelease()?"not_in_effective_MR_view":"ignored_non_MR_version_entry"):
                          "not_an_ordinary_classpath_type"));
                }
                int effectiveCount=0;
                Map<String,ClassInput> local=new TreeMap<>();
                for(var e:z.versionedStream().toList()) {
                    String logical=e.getName(),physical=e.getRealName();
                    if(e.isDirectory() || !logical.endsWith(".class")) continue;
                    Map<String,Object> row=rows.get(physical);
                    if(row==null) throw new IOException("Effective class not in raw archive: "+physical);
                    if(logical.equals("module-info.class")) {
                        row.put("logical_entry",logical);row.put("disposition","ignored_module_descriptor_on_classpath");
                        continue;
                    }
                    if(logical.startsWith("META-INF/")) continue;
                    validateEntry(logical);
                    int version=0;
                    if(physical.startsWith("META-INF/versions/")) {
                        String v=physical.substring("META-INF/versions/".length()).split("/",2)[0];
                        version=Integer.parseInt(v);
                    }
                    byte[] bytes;
                    try(InputStream in=z.getInputStream(e)) { bytes=in.readAllBytes(); }
                    ClassInput cl=new ClassInput(physical,logical,version,index,p,bytes);
                    if(local.putIfAbsent(cl.binaryName,cl)!=null)
                        throw new IOException("Duplicate effective binary identity: "+cl.binaryName);
                    effectiveCount++;
                    row.put("logical_entry",logical);row.put("version",version);
                    row.put("identity_scope",cl.unreadable?"entry_path_only_not_validated_owner":"this_class_exact");
                    row.put("disposition",cl.unreadable?"effective_unreadable":"effective_readable");
                    if(cl.unreadable) unreadable.add(cl);
                    ClassInput first=cp.putIfAbsent(cl.binaryName,cl);
                    if(first!=null) {
                        row.put("precedence","shadowed_by_earlier_archive");
                        shadows.add(obj("binary_name",cl.binaryName,"selected",first.row(),"shadow",cl.row()));
                    } else row.put("precedence","first_exact_binary_identity");
                }
                for(var row:rows.values()) {
                    String disposition=(String)row.get("disposition");
                    if(disposition.equals("not_in_effective_MR_view") || disposition.equals("not_an_ordinary_classpath_type")) {
                        String logical=(String)row.get("logical_entry");int version=(Integer)row.get("version");
                        if(version>release) row.put("disposition","ignored_future_version");
                        else if(logical.equals("module-info.class")) row.put("disposition","ignored_module_descriptor_on_classpath");
                        else {
                            ClassInput effective=local.get(logical.substring(0,logical.length()-6).replace('/','.'));
                            if(effective!=null && !effective.entry.equals(row.get("entry"))) {
                                row.put("disposition","superseded_by_MR_view");
                                row.put("effective_entry",effective.entry);
                            }
                        }
                    }
                }
                archives.add(obj("path",p.toString(),"sha256",hash(p),"index",index,
                    "manifest_multi_release",mr,"is_multi_release",z.isMultiRelease(),
                    "view_release",z.getVersion().feature(),"raw_class_entries",rows.size(),
                    "effective_class_entries",effectiveCount));
                entries.addAll(rows.values());
            }
            index++;
        }
        report.put("classpath",archives);
        report.put("classpath_selection","JDK17 JarFile.versionedStream at max(8,target release); module-info excluded from ordinary CLASS_PATH");
        report.put("classpath_precedence","first explicit archive wins by exact case-sensitive binary name; effective shadows identity-validated");
        report.put("classpath_shadows",shadows);
        report.put("unreadable_policy",unreadablePolicy);
        report.put("unreadable_entries",unreadable.size());
        report.put("effective_classpath_count",cp.size());
        write(out.resolve("classpath-archives.json"),archives);
        write(out.resolve("classpath-entry-provenance.json"),entries);
        write(out.resolve("classpath-classes.json"),cp.values().stream().map(ClassInput::row).toList());
        write(out.resolve("unreadable-dependencies.json"),unreadable.stream().map(ClassInput::row).toList());
        if(!unreadable.isEmpty() && unreadablePolicy.equals("fail"))
            throw new IOException("Unreadable classpath dependencies: "+unreadable.size()+"; no compile attempted; see unreadable-dependencies.json");
        return cp;
    }
    public static void main(String[] args) throws Exception {
        Map<String,List<String>> options=new LinkedHashMap<>();
        for(int i=0;i<args.length;i+=2) {
            if(i+1==args.length || !Set.of("--root","--sources","--classpath","--out","--mode","--debug","--release","--unreadable").contains(args[i]))
                throw new IllegalArgumentException("Options require values: --root ROOT --sources ZIP [repeat] --out NEW_DIR [--classpath PROJECT_JAR] [--mode compile|inspect] [--debug none|all] [--release 8|17]");
            options.computeIfAbsent(args[i],k->new ArrayList<>()).add(args[i+1]);
        }
        for(var e:options.entrySet()) if(!Set.of("--sources","--classpath").contains(e.getKey()) && e.getValue().size()!=1)
            throw new IllegalArgumentException("Repeated option "+e.getKey());
        if(!options.containsKey("--root") || !options.containsKey("--out"))
            throw new IllegalArgumentException("--root and --out are required");
        Path root=Path.of(options.get("--root").get(0)).toRealPath();
        Path work=root.resolve("build").toRealPath();
        Path out=Path.of(options.get("--out").get(0)).toAbsolutePath().normalize();
        if(!out.startsWith(work) || Files.exists(out)) throw new IOException("Use a fresh output directory strictly under repository build: "+out);
        Path existing=out.getParent(); while(!Files.exists(existing)) existing=existing.getParent();
        if(!existing.toRealPath().startsWith(work)) throw new IOException("Output resolves outside build");
        Files.createDirectories(out);
        if(!out.toRealPath().startsWith(work)) throw new IOException("Created output resolves outside build");
        String mode=options.getOrDefault("--mode",List.of("compile")).get(0);
        String debug=options.getOrDefault("--debug",List.of("none")).get(0);
        String unreadablePolicy=options.getOrDefault("--unreadable",List.of("register")).get(0);
        int release=Integer.parseInt(options.getOrDefault("--release",List.of("17")).get(0));
        if(Runtime.version().feature()!=17 || release<7 || release>17)
            throw new IllegalArgumentException("Requires JDK17; --release must be 7..17");
        if(!Set.of("compile","inspect").contains(mode) || !Set.of("none","all").contains(debug) ||
                !Set.of("fail","register").contains(unreadablePolicy))
            throw new IllegalArgumentException("Unsupported mode/debug");
        Map<String,Object> report=obj("schema",3,"mode",mode,"target_release",release,"java_version",System.getProperty("java.version"),
            "java_vendor",System.getProperty("java.vendor"),"root",root.toString(),"full_project_build_claim",false);
        DiagnosticCollector<JavaFileObject> collector=new DiagnosticCollector<>();
        Map<String,ClassInput> cp=new TreeMap<>();
        int exit=0;
        try {
            Map<String,Source> sources=new TreeMap<>();List<Object> archives=new ArrayList<>();
            for(String name:options.getOrDefault("--sources",List.of())) {
                Path archive=input(root,name); int count=0; Set<String> seen=new HashSet<>();
                try(ZipFile z=new ZipFile(archive.toFile(),StandardCharsets.UTF_8)) {
                    var entries=z.entries();
                    while(entries.hasMoreElements()) {
                        ZipEntry e=entries.nextElement();
                        if(!seen.add(e.getName())) throw new IOException("Duplicate exact archive entry: "+e.getName());
                        validateArchiveEntry(e);
                        if(e.isDirectory() || !e.getName().endsWith(".java")) continue;
                        validateEntry(e.getName()); Source s;
                        try(InputStream in=z.getInputStream(e)) { s=new Source(e.getName(),archive,in.readAllBytes()); }
                        if(sources.putIfAbsent(e.getName(),s)!=null) throw new IOException("Duplicate exact source entry across archives: "+e.getName());
                        count++;
                    }
                }
                archives.add(obj("path",archive.toString(),"sha256",hash(archive),"source_entries",count));
            }
            report.put("archives",archives);
            if(sources.isEmpty()) throw new IOException("No explicit Java sources");
            write(out.resolve("sources.json"),sources.values().stream().map(s->obj("entry",s.entry,"archive",s.archive,"sha256",s.sha256,"uri",s.toUri().toString())).toList());
            report.put("source_count",sources.size());
            cp=classpath(root,out,options.getOrDefault("--classpath",List.of()),release,unreadablePolicy,report);
            JavaCompiler compiler=ToolProvider.getSystemJavaCompiler();
            if(compiler==null) throw new IllegalStateException("A JDK with JavaCompiler is required");
            List<String> flags=new ArrayList<>(List.of("-encoding","UTF-8","-proc:none","-implicit:none",debug.equals("all")?"-g":"-g:none","-Xmaxerrs","100000","-Xmaxwarns","100000"));
            flags.add("--release");flags.add(Integer.toString(release));
            report.put("compiler_options",flags);report.put("implicit_sources",false);report.put("annotation_processing",false);
            StringWriter compilerOutput=new StringWriter();
            try(StandardJavaFileManager standard=compiler.getStandardFileManager(collector,Locale.ROOT,StandardCharsets.UTF_8);
                MemoryManager manager=new MemoryManager(standard,cp)) {
                standard.setLocationFromPaths(StandardLocation.CLASS_PATH,List.of());
                standard.setLocationFromPaths(StandardLocation.SOURCE_PATH,List.of());
                standard.setLocationFromPaths(StandardLocation.ANNOTATION_PROCESSOR_PATH,List.of());
                // A separate parse task establishes exact source path/declaration identity before compilation.
                JavacTask parser=(JavacTask)compiler.getTask(compilerOutput,manager,collector,flags,null,sources.values());
                List<Object> units=parsedUnits(parser,sources,true);
                write(out.resolve("declarations.json"),units);
                report.put("parsed_units",units.size());
                boolean projection=Boolean.getBoolean("moon.sourceAccessProjection");
                if(projection){report.put("source_context_projection",true);report.put("source_projection_edits",projectSourceAccess(compiler,manager,flags,sources,out));report.put("runtime_declaration_restoration_required",true);}
                JavacTask task=(JavacTask)compiler.getTask(compilerOutput,manager,collector,flags,null,sources.values());
                JvmExceptionSourcePolicy exceptionPolicy=mode.equals("compile")?JvmExceptionSourcePolicy.install(task):null;
                boolean ok;
                if(mode.equals("inspect")) {
                    report.put("declaration_scope","javac parse only; syntax-error recovery may contain partial declarations; no type resolution; local/anonymous binary names not inferred");
                    ok=collector.getDiagnostics().stream().noneMatch(d->d.getKind()==Diagnostic.Kind.ERROR);
                } else {
                    ok=task.call();
                    List<Object> exceptionRows=diagnostics(exceptionPolicy.recorded());
                    write(out.resolve("jvm-exception-source-diagnostics.json"),exceptionRows);
                    report.put("jvm_exception_source_policy","checked propagation and checked catch reachability only; no AST/Code/handler changes");
                    report.put("jvm_exception_source_diagnostic_count",exceptionRows.size());
                    if(cp.values().stream().anyMatch(cl->cl.unreadable && cl.reads>0)) ok=false;
                    List<Object> classes=new ArrayList<>();
                    for(var e:manager.output.entrySet()) {
                        String owner=classOwner(e.getValue().bytes.toByteArray());
                        if(!owner.equals(e.getKey().replace('.','/'))) throw new IOException("Output class owner mismatch: "+e.getKey()+" != "+owner);
                        classes.add(obj("binary_name",e.getKey(),"entry",owner+".class","sha256",hash(e.getValue().bytes.toByteArray()),"size",e.getValue().bytes.size()));
                    }
                    write(out.resolve("classes.json"),classes);
                    report.put("class_count",classes.size());
                    if(ok) {
                        Path jar=out.resolve("classes.jar");
                        try(ZipOutputStream z=new ZipOutputStream(Files.newOutputStream(jar,StandardOpenOption.CREATE_NEW))) {
                            for(var e:manager.output.entrySet().stream().sorted(Comparator.comparing(e->e.getKey().replace('.','/')+".class")).toList()) {
                                ZipEntry entry=new ZipEntry(e.getKey().replace('.','/')+".class");
                                // 1980-01-01 is ZipEntry's sentinel and adds timezone-dependent UT extras.
                                entry.setTimeLocal(LocalDateTime.of(2000,1,1,0,0));
                                z.putNextEntry(entry);z.write(e.getValue().bytes.toByteArray());z.closeEntry();
                            }
                        }
                        report.put("output_jar",jar.toString());report.put("output_sha256",hash(jar));
                    }
                }
                report.put("status",ok?(cp.values().stream().anyMatch(cl->cl.unreadable)?
                    "passed_with_unreadable_scope":"passed"):"diagnostics_errors");
                if(!ok) exit=1;
            }
            Files.writeString(out.resolve("compiler-output.txt"),compilerOutput.toString(),StandardOpenOption.CREATE_NEW);
        } catch(Exception ex) {
            report.put("status","rejected");report.put("exception",ex.getClass().getName());report.put("message",ex.getMessage());exit=2;
            StringWriter trace=new StringWriter();ex.printStackTrace(new PrintWriter(trace));
            Files.writeString(out.resolve("failure.txt"),trace.toString(),StandardOpenOption.CREATE_NEW);
        }
        write(out.resolve("compiler-read-classes.json"),cp.values().stream().filter(cl->cl.reads>0).map(ClassInput::row).toList());
        List<Object> usedUnreadable=cp.values().stream().filter(cl->cl.unreadable && cl.reads>0)
            .map(cl->(Object)cl.row()).toList();
        report.put("used_unreadable_dependencies",usedUnreadable);
        report.put("compile_scope","only explicit source units and the dependency classes actually read by javac; unreadable entry-path identities remain unresolved");
        List<Object> ds=diagnostics(collector);write(out.resolve("diagnostics.json"),ds);
        report.put("diagnostic_count",ds.size());report.put("errors",collector.getDiagnostics().stream().filter(d->d.getKind()==Diagnostic.Kind.ERROR).count());
        write(out.resolve("result.json"),report);
        System.out.println(report.get("status")+": "+out);
        if(exit!=0) System.exit(exit);
    }
}
