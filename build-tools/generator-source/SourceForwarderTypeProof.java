import com.google.gson.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.net.URL;
import java.nio.file.*;
import java.security.*;
import java.util.*;
import java.util.jar.*;
import java.util.zip.ZipFile;

/** Code-free, non-loading type proof for explicitly reported fresh forwarders.
 * Owned hierarchy comes only from original declarations. External hierarchy
 * comes only from ordered, explicit provider archives and JDK jrt resources.
 * No Class.forName, reflective linkage, application initialization or ambient
 * application-classpath fallback is permitted.
 */
public final class SourceForwarderTypeProof implements Opcodes {
  private record Header(String name,int access,String parent,List<String> interfaces,String source,String sha256){}
  public record Proof(boolean accepted,String reason,List<String> chain){}
  private final Map<String,Header> headers=new TreeMap<>();
  private final Map<String,Path> providers=new HashMap<>();
  private final Set<String> used=new TreeSet<>();
  private final JsonArray providerEvidence=new JsonArray();
  private final Set<String> unresolved=new TreeSet<>();
  private long proofs,accepted;
  private int providerDuplicateHeaders;
  private static String s(JsonObject o,String k){return o.get(k).getAsString();}
  private static String sha(byte[] value){try{return HexFormat.of().formatHex(MessageDigest.getInstance("SHA-256").digest(value));}catch(NoSuchAlgorithmException e){throw new AssertionError(e);}}
  private static String sha(Path path)throws IOException{try{var hash=MessageDigest.getInstance("SHA-256");try(var in=Files.newInputStream(path)){byte[] b=new byte[1024*1024];for(int n;(n=in.read(b))!=-1;)hash.update(b,0,n);}return HexFormat.of().formatHex(hash.digest());}catch(NoSuchAlgorithmException e){throw new AssertionError(e);}}
  private static JarFile jar(Path path)throws IOException{return new JarFile(path.toFile(),false,ZipFile.OPEN_READ,Runtime.version());}
  public SourceForwarderTypeProof(JsonObject declarations,List<Path> orderedProviders)throws IOException{
    if(orderedProviders.isEmpty())throw new IllegalArgumentException("Explicit locked provider list required for forwarding type proof");
    for(var entry:declarations.entrySet()){
      JsonObject row=entry.getValue().getAsJsonObject();String owner=s(row,"owner");
      if(!owner.equals(entry.getKey()))throw new IllegalArgumentException("Code-free declaration owner/key mismatch");
      List<String> ints=new ArrayList<>();for(var i:row.getAsJsonArray("interfaces"))ints.add(i.getAsString());
      headers.put(owner,new Header(owner,row.get("access").getAsInt(),row.get("super").isJsonNull()?null:s(row,"super"),List.copyOf(ints),"Code-free original declaration",sha(row.toString().getBytes(java.nio.charset.StandardCharsets.UTF_8))));
    }
    Set<Path> paths=new HashSet<>();
    for(Path input:orderedProviders){Path path=input.toRealPath();if(!Files.isRegularFile(path)||!paths.add(path))throw new IllegalArgumentException("Provider path missing or repeated: "+input);
      JsonObject evidence=new JsonObject();evidence.addProperty("index",providerEvidence.size());evidence.addProperty("path",path.toString());evidence.addProperty("size",Files.size(path));evidence.addProperty("sha256",sha(path));providerEvidence.add(evidence);
      try(var archive=jar(path)){for(var entries=archive.entries();entries.hasMoreElements();){var e=entries.nextElement();String name=e.getName();if(e.isDirectory()||!name.endsWith(".class")||name.startsWith("META-INF/"))continue;String owner=name.substring(0,name.length()-6);if(providers.putIfAbsent(owner,path)!=null)providerDuplicateHeaders++;}}
    }
  }
  private Header header(String name){
    used.add(name);if(headers.containsKey(name))return headers.get(name);
    try{
      byte[] bytes;String source;
      // Platform resource lookup reads bytes only and cannot fall back to an
      // application class loader. Require the jrt protocol explicitly.
      URL jdk=ClassLoader.getPlatformClassLoader().getResource(name+".class");
      if(jdk!=null&&jdk.getProtocol().equals("jrt")){try(var in=jdk.openStream()){bytes=in.readAllBytes();}source=jdk.toString();}
      else{Path provider=providers.get(name);if(provider==null){unresolved.add(name);return null;}
        try(var archive=jar(provider)){JarEntry entry=archive.getJarEntry(name+".class");if(entry==null){unresolved.add(name);return null;}try(var in=archive.getInputStream(entry)){bytes=in.readAllBytes();}source=provider+"!"+entry.getRealName();}}
      ClassNode c=new ClassNode();new ClassReader(bytes).accept(c,ClassReader.SKIP_CODE|ClassReader.SKIP_DEBUG|ClassReader.SKIP_FRAMES);
      if(!c.name.equals(name))throw new IllegalArgumentException("Provider header identity mismatch: "+name);
      Header h=new Header(name,c.access,c.superName,List.copyOf(c.interfaces),source,sha(bytes));headers.put(name,h);return h;
    }catch(IOException e){throw new UncheckedIOException("Cannot read explicit hierarchy header: "+name,e);}
  }
  private static boolean reference(Type type){return type.getSort()==Type.OBJECT||type.getSort()==Type.ARRAY;}
  private boolean known(Type type){if(type.getSort()==Type.OBJECT)return header(type.getInternalName())!=null;if(type.getSort()==Type.ARRAY)return known(type.getElementType());return true;}
  private boolean assignable(Type from,Type to){
    if(!known(from)||!known(to))return false;if(from.equals(to))return true;if(!reference(from)||!reference(to))return false;
    if(to.equals(Type.getObjectType("java/lang/Object")))return true;
    if(from.getSort()==Type.ARRAY){if(to.getSort()==Type.OBJECT)return Set.of("java/lang/Cloneable","java/io/Serializable").contains(to.getInternalName());if(to.getSort()!=Type.ARRAY)return false;return assignable(Type.getType(from.getDescriptor().substring(1)),Type.getType(to.getDescriptor().substring(1)));}
    if(to.getSort()==Type.ARRAY)return false;
    String target=to.getInternalName();ArrayDeque<String> pending=new ArrayDeque<>();Set<String> seen=new HashSet<>();pending.add(from.getInternalName());
    while(!pending.isEmpty()){String name=pending.removeFirst();if(!seen.add(name))continue;if(name.equals(target))return true;Header h=header(name);if(h==null)continue;if(h.parent()!=null)pending.add(h.parent());pending.addAll(h.interfaces());}
    return false;
  }
  private static String pkg(String owner){int at=owner.lastIndexOf('/');return at<0?"":owner.substring(0,at);}
  private boolean castTypeAccessible(String owner,Type type){if(!reference(type))return false;if(type.getSort()==Type.ARRAY){Type element=type.getElementType();return !reference(element)||castTypeAccessible(owner,element);}Header h=header(type.getInternalName());return h!=null&&((h.access()&ACC_PUBLIC)!=0||pkg(owner).equals(pkg(h.name())));}
  private static String identity(MethodNode m){return m.name+m.desc;}
  private static Proof reject(String reason,List<String> chain){return new Proof(false,reason,List.copyOf(chain));}
  public Proof prove(ClassNode owner,MethodNode method,Set<String> declaredMethods){proofs++;Proof proof=prove(owner,method,declaredMethods,new HashSet<>(),new ArrayList<>());if(proof.accepted())accepted++;return proof;}
  private Proof prove(ClassNode owner,MethodNode method,Set<String> declaredMethods,Set<String> seen,List<String> chain){
    String key=identity(method);chain.add(owner.name+"."+key);if(!seen.add(key))return reject("cyclic forwarding chain",chain);
    Header ownerHeader=header(owner.name);if(ownerHeader==null)return reject("owner absent from original Code-free declarations",chain);
    if(method.name.startsWith("<")||(method.access&(ACC_ABSTRACT|ACC_NATIVE|ACC_SYNCHRONIZED))!=0||!method.tryCatchBlocks.isEmpty())return reject("not an ordinary handler-free nonsynchronized implementation",chain);
    List<AbstractInsnNode> ops=Arrays.stream(method.instructions.toArray()).filter(n->n.getOpcode()>=0).toList();
    List<MethodInsnNode> invokes=ops.stream().filter(n->n instanceof MethodInsnNode).map(n->(MethodInsnNode)n).toList();
    if(invokes.size()!=1)return reject("forwarder must invoke exactly once",chain);MethodInsnNode call=invokes.get(0);
    if(!call.owner.equals(owner.name)||call.name.startsWith("<"))return reject("target must be an ordinary method on the same exact owner",chain);
    // Same descriptor with a distinct name is a valid saved source alias.
    // Compare complete name+descriptor identity to forbid direct recursion.
    if(call.name.equals(method.name)&&call.desc.equals(method.desc))return reject("exact name+descriptor self call",chain);
    List<MethodNode> targets=owner.methods.stream().filter(m->m.name.equals(call.name)&&m.desc.equals(call.desc)).toList();
    if(targets.size()!=1)return reject("target identity must have exactly one fresh definition",chain);MethodNode target=targets.get(0);
    boolean isStatic=(method.access&ACC_STATIC)!=0,isInterface=(ownerHeader.access()&ACC_INTERFACE)!=0;
    if(isStatic!=((target.access&ACC_STATIC)!=0))return reject("static/instance mismatch",chain);
    int expectedOpcode=isStatic?INVOKESTATIC:isInterface?INVOKEINTERFACE:(target.access&ACC_PRIVATE)!=0?INVOKESPECIAL:INVOKEVIRTUAL;
    if(call.getOpcode()!=expectedOpcode||call.itf!=isInterface)return reject("illegal or unsupported exact invocation opcode/interface tag",chain);
    Type[] args=Type.getArgumentTypes(method.desc),called=Type.getArgumentTypes(call.desc);if(args.length!=called.length)return reject("argument count differs",chain);
    int cursor=0,slot=isStatic?0:1;
    if(!isStatic){if(cursor>=ops.size()||!(ops.get(cursor++) instanceof VarInsnNode v)||v.getOpcode()!=ALOAD||v.var!=0)return reject("receiver must be this",chain);}
    for(int i=0;i<args.length;i++){
      Type from=args[i],to=called[i];if(!known(from)||!known(to))return reject("unresolved argument reference type",chain);
      if(cursor>=ops.size()||!(ops.get(cursor++) instanceof VarInsnNode v)||v.getOpcode()!=from.getOpcode(ILOAD)||v.var!=slot)return reject("arguments must load exactly once in declared slot order",chain);slot+=from.getSize();
      if(!from.equals(to)&&!(reference(from)&&reference(to)))return reject("primitive argument types differ",chain);
      if(cursor<ops.size()&&ops.get(cursor) instanceof TypeInsnNode cast&&cast.getOpcode()==CHECKCAST){if(!reference(from)||!reference(to)||!cast.desc.equals(to.getInternalName())||!castTypeAccessible(owner.name,to))return reject("argument CHECKCAST is not the exact accessible target type",chain);cursor++;}
      else if(!assignable(from,to))return reject("uncast argument is not hierarchy-assignable: "+from+" -> "+to,chain);
    }
    if(cursor>=ops.size()||ops.get(cursor++)!=call)return reject("unexpected instruction before invocation",chain);
    Type from=Type.getReturnType(call.desc),to=Type.getReturnType(method.desc);if(!known(from)||!known(to))return reject("unresolved return reference type",chain);
    if(!from.equals(to)&&!(reference(from)&&reference(to)))return reject("primitive return types differ",chain);
    if(cursor<ops.size()&&ops.get(cursor) instanceof TypeInsnNode cast&&cast.getOpcode()==CHECKCAST){if(!reference(from)||!reference(to)||!cast.desc.equals(to.getInternalName())||!castTypeAccessible(owner.name,to))return reject("return CHECKCAST is not the exact accessible declared return type",chain);cursor++;}
    else if(!assignable(from,to))return reject("uncast return is not hierarchy-assignable: "+from+" -> "+to,chain);
    if(cursor+1!=ops.size()||ops.get(cursor).getOpcode()!=to.getOpcode(IRETURN))return reject("unexpected instruction or incorrect return after invocation",chain);
    if(!declaredMethods.contains(identity(target)))return prove(owner,target,declaredMethods,seen,chain);
    chain.add(owner.name+"."+identity(target));return new Proof(true,"exact ordered forwarding chain reaches an original declaration; reference conversions proven from Code-free hierarchy",List.copyOf(chain));
  }
  public JsonObject evidence(){
    JsonObject result=new JsonObject();result.addProperty("policy","same-owner-single-invoke-ordered-arguments-exact-casts-Code-free-hierarchy-v1");result.addProperty("proof_attempts",proofs);result.addProperty("proofs_accepted",accepted);result.add("ordered_explicit_providers",providerEvidence.deepCopy());result.addProperty("duplicate_provider_headers_first_provider_wins",providerDuplicateHeaders);result.addProperty("java_home",System.getProperty("java.home"));result.addProperty("java_version",System.getProperty("java.version"));result.addProperty("runtime_feature",Runtime.version().feature());result.addProperty("application_classes_loaded",0);result.addProperty("ambient_application_classpath_used",false);result.addProperty("BasicVerifier_used_as_hierarchy_proof",false);
    JsonArray evidence=new JsonArray();for(String name:used){Header h=headers.get(name);if(h==null)continue;JsonObject row=new JsonObject();row.addProperty("name",name);row.addProperty("access",h.access());row.addProperty("super",h.parent());row.add("interfaces",new Gson().toJsonTree(h.interfaces()));row.addProperty("source",h.source());row.addProperty("sha256",h.sha256());evidence.add(row);}result.add("used_header_evidence",evidence);result.add("unresolved_hierarchy",new Gson().toJsonTree(unresolved));result.addProperty("limit","Accepted extra methods remain explicitly visible source-engineering additions, not byte-for-byte original method-set identity or whole-program/runtime equivalence.");return result;
  }
}
