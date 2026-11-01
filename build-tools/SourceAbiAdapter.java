import com.google.gson.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;
import java.util.*;
import java.util.zip.*;
import java.io.*;
import java.time.LocalDateTime;
import java.security.MessageDigest;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/** Exact source declaration aliases -> runtime ABI. Only fresh Code is edited.
 * Does not infer call targets, alter strings or load application classes. The
 * sole clinit composition is the SHA-bound source helper plus javac's exact
 * zero serialVersionUID store; no original target Code or frames enter it.
 */
public final class SourceAbiAdapter {
  record Key(String owner,String name,String descriptor){}
  record Alias(Key key,String target,JsonObject row){}
  static String s(JsonObject o,String k){return o.get(k).getAsString();}
  static String sha(Path p)throws Exception{return HexFormat.of().withUpperCase().formatHex(MessageDigest.getInstance("SHA-256").digest(Files.readAllBytes(p)));}
  static void need(boolean b,String m){if(!b)throw new IllegalArgumentException(m);}
  static Map<String,byte[]> archive(Path path)throws Exception{
    Map<String,byte[]> out=new TreeMap<>();try(ZipFile z=new ZipFile(path.toFile())){for(var e:Collections.list(z.entries()))if(!e.isDirectory()){
      need(!out.containsKey(e.getName()),"duplicate archive identity: "+e.getName());try(var in=z.getInputStream(e)){out.put(e.getName(),in.readAllBytes());}
    }}return out;
  }
  static final class Resolver {
    final Map<Key,Alias> aliases;final Map<String,Set<String>> declared=new HashMap<>();final Map<String,String> parents=new HashMap<>();final Map<String,List<String>> interfaces=new HashMap<>();
    Resolver(Map<Key,Alias> aliases,Map<String,ClassNode> classes){this.aliases=aliases;for(var c:classes.values()){Set<String> methods=new HashSet<>();for(var m:c.methods)methods.add(m.name+m.desc);declared.put(c.name,methods);parents.put(c.name,c.superName);interfaces.put(c.name,c.interfaces);}}
    void declarations(JsonObject metadata){for(var e:metadata.entrySet()){
      var d=e.getValue().getAsJsonObject();String owner=s(d,"owner");if(declared.containsKey(owner))continue;
      Set<String> names=new HashSet<>();for(var m:d.getAsJsonArray("methods")){var x=m.getAsJsonObject();names.add(s(x,"name")+s(x,"descriptor"));}declared.put(owner,names);parents.put(owner,d.get("super").isJsonNull()?null:s(d,"super"));List<String> ints=new ArrayList<>();for(var i:d.getAsJsonArray("interfaces"))ints.add(i.getAsString());interfaces.put(owner,ints);
    }}
    Alias resolve(String owner,String name,String desc){return resolve(owner,name,desc,new HashSet<>());}
    Alias resolve(String owner,String name,String desc,Set<String> seen){
      if(owner==null||!seen.add(owner))return null;Key key=new Key(owner,name,desc);if(aliases.containsKey(key))return aliases.get(key);
      if(declared.getOrDefault(owner,Set.of()).contains(name+desc))return null;
      Alias parent=resolve(parents.get(owner),name,desc,seen);if(parent!=null)return parent;
      Alias found=null;for(String it:interfaces.getOrDefault(owner,List.of())){Alias a=resolve(it,name,desc,seen);if(a!=null){need(found==null||found.equals(a),"ambiguous inherited source alias: "+key);found=a;}}return found;
    }
  }
  static long calls,handles,condys;
  static Handle mapHandle(Handle h,Resolver resolver){
    if(h.getTag()<=Opcodes.H_PUTSTATIC)return h;
    Alias a=resolver.resolve(h.getOwner(),h.getName(),h.getDesc());if(a==null)return h;
    need(!a.target.equals("<clinit>"),"class initializer cannot be a method handle");handles++;return new Handle(h.getTag(),h.getOwner(),a.target,h.getDesc(),h.isInterface());
  }
  static Object constant(Object value,Resolver resolver){
    if(value instanceof Handle h)return mapHandle(h,resolver);
    if(value instanceof ConstantDynamic d){Object[] arguments=new Object[d.getBootstrapMethodArgumentCount()];for(int i=0;i<arguments.length;i++)arguments[i]=constant(d.getBootstrapMethodArgument(i),resolver);condys++;return new ConstantDynamic(d.getName(),d.getDescriptor(),mapHandle(d.getBootstrapMethod(),resolver),arguments);}
    return value; // Strings and all other literal payloads stay exact.
  }
  static Object instructionIdentity(AbstractInsnNode n){if(n instanceof VarInsnNode v)return List.of("var",n.getOpcode(),v.var);if(n instanceof TypeInsnNode t)return List.of("type",n.getOpcode(),t.desc);if(n instanceof MethodInsnNode m)return List.of("method",n.getOpcode(),m.owner,m.name,m.desc,m.itf);if(n instanceof FieldInsnNode f)return List.of("field",n.getOpcode(),f.owner,f.name,f.desc);if(n instanceof LdcInsnNode l)return Arrays.asList("ldc",l.cst);if(n instanceof IntInsnNode i)return List.of("int",n.getOpcode(),i.operand);if(n instanceof IincInsnNode i)return List.of("iinc",i.var,i.incr);return List.of("insn",n.getOpcode());}
  static boolean exactDuplicateForwarder(MethodNode alias,MethodNode existing){if(!alias.tryCatchBlocks.isEmpty()||!existing.tryCatchBlocks.isEmpty())return false;var a=Arrays.stream(alias.instructions.toArray()).filter(n->n.getOpcode()>=0).toList();var b=Arrays.stream(existing.instructions.toArray()).filter(n->n.getOpcode()>=0).toList();if(a.size()!=b.size()||a.isEmpty()||a.stream().filter(n->n instanceof MethodInsnNode).count()!=1)return false;for(int i=0;i<a.size();i++){int op=a.get(i).getOpcode();if(!(a.get(i) instanceof VarInsnNode||a.get(i) instanceof TypeInsnNode t&&t.getOpcode()==Opcodes.CHECKCAST||a.get(i) instanceof MethodInsnNode||op>=Opcodes.IRETURN&&op<=Opcodes.RETURN))return false;if(!instructionIdentity(a.get(i)).equals(instructionIdentity(b.get(i))))return false;}return true;}
  static boolean exactSourceForwarderToTarget(MethodNode alias,String owner,String target,String descriptor){
    if(!alias.tryCatchBlocks.isEmpty())return false;var ops=Arrays.stream(alias.instructions.toArray()).filter(n->n.getOpcode()>=0).toList();if(ops.size()!=3)return false;
    if(!(ops.get(0) instanceof VarInsnNode v&&v.getOpcode()==Opcodes.ALOAD&&v.var==0))return false;
    if(!(ops.get(1) instanceof MethodInsnNode call&&call.getOpcode()==Opcodes.INVOKEVIRTUAL&&call.owner.equals(owner)&&call.name.equals(target)&&call.desc.equals(descriptor)))return false;
    return ops.get(2).getOpcode()==Opcodes.ARETURN;
  }
  static void appendExactZeroSerialVersionUidInitializer(ClassNode owner,MethodNode target,MethodNode source,JsonObject abiRow,Path planDirectory)throws Exception{
    need(source.name.equals("__sourceInitializeParent")&&source.desc.equals("()V")&&(source.access&(Opcodes.ACC_PRIVATE|Opcodes.ACC_STATIC))==(Opcodes.ACC_PRIVATE|Opcodes.ACC_STATIC),"exact_saved_source_parent_initializer_helper_only");need(target.name.equals("<clinit>")&&target.desc.equals("()V")&&target.access==Opcodes.ACC_STATIC&&target.tryCatchBlocks.isEmpty()&&target.exceptions.isEmpty(),"existing_fresh_static_initializer_has_no_handlers_or_exceptions");
    need(abiRow.has("source_initializer_composition"),"explicit saved zero serialVersionUID source-order contract");JsonObject contract=abiRow.getAsJsonObject("source_initializer_composition");need(s(contract,"helper_name").equals(source.name)&&s(contract,"helper_descriptor").equals(source.desc)&&contract.getAsJsonArray("source_field_initializers_before_helper").size()==1,"one exact source field initializer precedes source helper");JsonObject savedField=contract.getAsJsonArray("source_field_initializers_before_helper").get(0).getAsJsonObject();need(s(savedField,"name").equals("serialVersionUID")&&s(savedField,"descriptor").equals("J")&&s(savedField,"expression").equals("0L"),"saved literal field initialization exact");Path rel=Path.of(s(contract,"source_path"));need(!rel.isAbsolute(),"source initializer source path is relative");Path root=planDirectory.toRealPath(),sourcePath=root.resolve(rel).normalize().toRealPath();need(sourcePath.startsWith(root)&&sha(sourcePath).equalsIgnoreCase(s(contract,"source_sha256")),"source initializer exact source-unit SHA");String savedJava=Files.readString(sourcePath);String helperDecl="private static void "+s(contract,"helper_name");int helperAt=savedJava.indexOf(helperDecl);Matcher literalField=Pattern.compile("(?m)^\\s*private\\s+static\\s+long\\s+serialVersionUID\\s*=\\s*0L\\s*;").matcher(savedJava);need(helperAt>0&&literalField.find()&&literalField.start()<helperAt,"exact saved Java field initializer text precedes helper in source order");String prefix=savedJava.substring(0,helperAt);Matcher otherInit=Pattern.compile("(?m)^\\s*(?:public|protected|private)\\s+static\\s+[^;=]+?\\s+[A-Za-z_$][\\w$]*\\s*=\\s*[^;]+;").matcher(prefix);int staticFieldInitializers=0;while(otherInit.find())staticFieldInitializers++;need(staticFieldInitializers==1,"only one supported static field initializer precedes restored helper");need(!Pattern.compile("(?m)^\\s*static\\s*\\{").matcher(prefix).find(),"no explicit static initializer block precedes helper");
    var ops=Arrays.stream(target.instructions.toArray()).filter(n->n.getOpcode()>=0).toList();need(ops.size()==3&&ops.get(0).getOpcode()==Opcodes.LCONST_0&&ops.get(1) instanceof FieldInsnNode&&ops.get(1).getOpcode()==Opcodes.PUTSTATIC&&ops.get(2).getOpcode()==Opcodes.RETURN,"only exact javac zero serialVersionUID field initialization may precede restored source initializer");FieldInsnNode write=(FieldInsnNode)ops.get(1);need(write.owner.equals(owner.name)&&write.name.equals(s(savedField,"name"))&&write.desc.equals(s(savedField,"descriptor")),"javac initializer writes only saved source field");var field=owner.fields.stream().filter(f->f.name.equals(s(savedField,"name"))&&f.desc.equals(s(savedField,"descriptor"))).toList();need(field.size()==1&&(field.get(0).access&(Opcodes.ACC_PRIVATE|Opcodes.ACC_STATIC|Opcodes.ACC_FINAL))==(Opcodes.ACC_PRIVATE|Opcodes.ACC_STATIC|Opcodes.ACC_FINAL),"exact source-owned private static final serialVersionUID field");
    target.instructions.remove(ops.get(2));target.instructions.add(source.instructions);for(var handler:source.tryCatchBlocks)target.tryCatchBlocks.add(handler);target.maxStack=Math.max(target.maxStack,source.maxStack);target.maxLocals=Math.max(target.maxLocals,source.maxLocals);target.exceptions.clear();target.signature=null;target.parameters=null;target.annotationDefault=null;target.visibleAnnotations=null;target.invisibleAnnotations=null;target.visibleTypeAnnotations=null;target.invisibleTypeAnnotations=null;target.visibleParameterAnnotations=null;target.invisibleParameterAnnotations=null;target.visibleAnnotableParameterCount=0;target.invisibleAnnotableParameterCount=0;owner.methods.remove(source);
  }
  static String sourceType(Type type){if(type.getSort()==Type.ARRAY)return sourceType(type.getElementType())+"[]".repeat(type.getDimensions());if(type.getSort()==Type.OBJECT)return type.getClassName().substring(type.getClassName().lastIndexOf('.')+1).replace('$','.');return Map.of(Type.BOOLEAN,"boolean",Type.BYTE,"byte",Type.CHAR,"char",Type.SHORT,"short",Type.INT,"int",Type.FLOAT,"float",Type.LONG,"long",Type.DOUBLE,"double").get(type.getSort());}
  static boolean exactExplicitSourceBridge(Path planDirectory,String owner,JsonObject row,MethodNode method)throws Exception{if(!row.has("source_declared_bridge_evidence"))return false;JsonObject proof=row.getAsJsonObject("source_declared_bridge_evidence");Path rel=Path.of(s(proof,"path"));if(rel.isAbsolute())return false;Path base=planDirectory.toRealPath(),src=base.resolve(rel).normalize();if(!src.startsWith(base)||!Files.isRegularFile(src)||!sha(src).equalsIgnoreCase(s(proof,"sha256")))return false;String text=Files.readString(src);String methodName=s(row,"name");Type[] arguments=Type.getArgumentTypes(s(row,"descriptor"));StringJoiner params=new StringJoiner("\\s*,\\s*");for(Type arg:arguments)params.add(Pattern.quote(sourceType(arg))+"\\s+[A-Za-z_$][\\w$]*");String args=params.toString();String declaration="(?s)/\\*\\s*bridge\\s*\\*/\\s*/\\*\\s*synthetic\\s*\\*/\\s*"+Pattern.quote(sourceType(Type.getReturnType(s(row,"descriptor"))))+"\\s+"+Pattern.quote(methodName)+"\\s*\\(\\s*"+args+"\\s*\\)";return Pattern.compile(declaration).matcher(text).find()&&method.name.equals(methodName)&&method.desc.equals(s(row,"descriptor"))&&method.access==Opcodes.ACC_PUBLIC;}
  static boolean exactSourceCompileAliasBridge(MethodNode method,String owner){
    if(!method.tryCatchBlocks.isEmpty())return false;var ops=Arrays.stream(method.instructions.toArray()).filter(n->n.getOpcode()>=0).toList();Type[] args=Type.getArgumentTypes(method.desc);Type ret=Type.getReturnType(method.desc);int expected=(((method.access&Opcodes.ACC_STATIC)==0)?1:0)+args.length+2;if(ops.size()!=expected)return false;int slot=0,at=0;
    if((method.access&Opcodes.ACC_STATIC)==0){AbstractInsnNode n=ops.get(at++);if(!(n instanceof VarInsnNode v)||n.getOpcode()!=Opcodes.ALOAD||v.var!=0)return false;slot=1;}
    for(Type t:args){AbstractInsnNode n=ops.get(at++);if(!(n instanceof VarInsnNode v)||n.getOpcode()!=t.getOpcode(Opcodes.ILOAD)||v.var!=slot)return false;slot+=t.getSize();}
    AbstractInsnNode callNode=ops.get(at++);if(!(callNode instanceof MethodInsnNode call)||call.getOpcode()!=Opcodes.INVOKESTATIC||!call.owner.equals(owner)||!call.name.startsWith("__sourceHandlerCall_")||!call.desc.equals(method.desc)&&!(call.desc.startsWith("("+((method.access&Opcodes.ACC_STATIC)==0?"L"+owner+";":""))&&call.desc.endsWith(")"+ret.getDescriptor())&&Type.getArgumentTypes(call.desc).length==args.length+(((method.access&Opcodes.ACC_STATIC)==0)?1:0)))return false;
    Type callReturn=Type.getReturnType(call.desc);if(!callReturn.equals(ret))return false;Type[] callArgs=Type.getArgumentTypes(call.desc);int p=0;if((method.access&Opcodes.ACC_STATIC)==0){if(!callArgs[p++].equals(Type.getObjectType(owner)))return false;}for(Type arg:args)if(!callArgs[p++].equals(arg))return false;
    AbstractInsnNode retNode=ops.get(at);return retNode.getOpcode()==ret.getOpcode(Opcodes.IRETURN);
  }
  static void noInitializerSource(Map<String,ClassNode> classes){for(var c:classes.values())for(var m:c.methods){
    need(!m.name.equals("__sourceInitializeParent"),"source initializer intermediary remains: "+c.name);
    for(var n:m.instructions)if(n instanceof MethodInsnNode call)need(!call.name.equals("__sourceInitializeParent"),"source initializer intermediary call remains");
  }}
  static Map<String,ClassNode> parse(Map<String,byte[]> entries){Map<String,ClassNode> classes=new TreeMap<>();for(var e:entries.entrySet())if(e.getKey().endsWith(".class")){ClassNode c=new ClassNode();new ClassReader(e.getValue()).accept(c,0);need(e.getKey().equals(c.name+".class"),"class entry/owner mismatch");classes.put(c.name,c);}return classes;}
  public static void main(String[]args)throws Exception{
    if(args.length==2&&args[0].equals("--validate-final")){noInitializerSource(parse(archive(Path.of(args[1]))));System.out.println("{\"source_ABI_initialization_intermediaries\":0}");return;}
    need(args.length>=4,"SourceAbiAdapter fresh.jar ABI_ALIAS_PLAN.json new.jar REPORT.json [Code-free-declarations.json]");
    Path output=Path.of(args[2]),reportPath=Path.of(args[3]);need(!Files.exists(output)&&!Files.exists(reportPath),"ABI outputs must be new");
    Map<String,byte[]> entries=archive(Path.of(args[0]));Map<String,ClassNode> classes=parse(entries);JsonArray plan=JsonParser.parseString(Files.readString(Path.of(args[1]))).getAsJsonArray();Map<Key,Alias> aliases=new LinkedHashMap<>();Set<Key> sourceInitializerMergeKeys=new HashSet<>(),duplicateForwarderKeys=new HashSet<>();Set<String> planOwners=new HashSet<>();
    for(var e:plan){JsonObject row=e.getAsJsonObject();String owner=s(row,"owner");need(planOwners.add(owner),"duplicate ABI owner row");ClassNode c=classes.get(owner);need(c!=null,"fresh ABI owner missing: "+owner);
      for(var a:row.getAsJsonArray("method_aliases")){JsonObject x=a.getAsJsonObject();need(s(x,"owner").equals(owner),"alias owner differs from plan row");Key key=new Key(owner,s(x,"source_name"),s(x,"descriptor"));String target=s(x,"target_name");need(!key.name.equals(target),"identity alias unnecessary");need(aliases.putIfAbsent(key,new Alias(key,target,x))==null,"duplicate exact alias");
        var methods=c.methods.stream().filter(m->m.name.equals(key.name)&&m.desc.equals(key.descriptor)).toList();need(methods.size()==1,"fresh exact source alias declaration missing: "+key);
        var collisions=c.methods.stream().filter(m->m.name.equals(target)&&m.desc.equals(key.descriptor)).toList();
        if(collisions.size()==1&&exactSourceCompileAliasBridge(methods.get(0),owner)){continue;}
        if(collisions.size()==1&&(exactDuplicateForwarder(methods.get(0),collisions.get(0))||x.has("allow_replace_source_forwarder")&&x.get("allow_replace_source_forwarder").getAsBoolean()&&exactSourceForwarderToTarget(methods.get(0),owner,target,key.descriptor))){duplicateForwarderKeys.add(key);continue;}
        if(target.equals("<clinit>")&&key.name.equals("__sourceInitializeParent")&&key.descriptor.equals("()V")&&collisions.size()==1){sourceInitializerMergeKeys.add(key);continue;}
        if(!collisions.isEmpty()){
          need(!target.equals("<clinit>")&&x.has("allow_replace_javac_bridge")&&x.get("allow_replace_javac_bridge").getAsBoolean()&&collisions.size()==1,"existing target ABI collision; initializer merging forbidden: "+owner+"."+target+key.descriptor);
          MethodNode collision=collisions.get(0);List<AbstractInsnNode> op=Arrays.stream(collision.instructions.toArray()).filter(n->n.getOpcode()>=0).toList();
          need(collision.tryCatchBlocks.isEmpty()&&op.stream().filter(n->n instanceof MethodInsnNode).count()==1&&op.stream().allMatch(n->n instanceof VarInsnNode||n instanceof TypeInsnNode t&&t.getOpcode()==Opcodes.CHECKCAST||n instanceof MethodInsnNode||n.getOpcode()>=Opcodes.IRETURN&&n.getOpcode()<=Opcodes.RETURN),"Existing ABI collision is not a pure fresh forwarding bridge");
          need((collision.access&(Opcodes.ACC_BRIDGE|Opcodes.ACC_SYNTHETIC))==(Opcodes.ACC_BRIDGE|Opcodes.ACC_SYNTHETIC)||x.has("allow_replace_source_forwarder")&&x.get("allow_replace_source_forwarder").getAsBoolean(),"Nonbridge ABI collision not explicitly allowed");
          c.methods.remove(collision);
        }
        if(target.equals("<clinit>"))need(key.descriptor.equals("()V")&&(methods.get(0).access&Opcodes.ACC_STATIC)!=0,"source initializer must be static ()V");
      }
    }
    Resolver resolver=new Resolver(aliases,classes);for(int i=4;i<args.length;i++)resolver.declarations(JsonParser.parseString(Files.readString(Path.of(args[i]))).getAsJsonObject());
    for(var c:classes.values())for(var m:c.methods)for(var n:m.instructions){
      if(n instanceof MethodInsnNode call){Alias a=resolver.resolve(call.owner,call.name,call.desc);if(a!=null){need(!a.target.equals("<clinit>"),"source initializer must not have callsites");call.name=a.target;calls++;}}
      else if(n instanceof LdcInsnNode ldc)ldc.cst=constant(ldc.cst,resolver);
      else if(n instanceof InvokeDynamicInsnNode indy){indy.bsm=mapHandle(indy.bsm,resolver);for(int i=0;i<indy.bsmArgs.length;i++)indy.bsmArgs[i]=constant(indy.bsmArgs[i],resolver);}
    }
    int definitions=0,fields=0,flags=0,removedSourceCompileAliases=0;JsonArray ownersReport=new JsonArray();
    for(var e:plan){JsonObject row=e.getAsJsonObject();String owner=s(row,"owner");ClassNode c=classes.get(owner);String signature=c.signature;
      for(var a:row.getAsJsonArray("method_aliases")){var x=a.getAsJsonObject();Key key=new Key(owner,s(x,"source_name"),s(x,"descriptor"));Alias alias=aliases.get(key);MethodNode m=c.methods.stream().filter(z->z.name.equals(key.name)&&z.desc.equals(key.descriptor)).findFirst().orElseThrow();List<MethodNode> implementedTargets=c.methods.stream().filter(z->z.name.equals(alias.target)&&z.desc.equals(key.descriptor)).toList();if(duplicateForwarderKeys.contains(key)){need(implementedTargets.size()==1,"exact duplicate forwarding target preserved");c.methods.remove(m);definitions++;removedSourceCompileAliases++;continue;}if(implementedTargets.size()==1&&exactSourceCompileAliasBridge(m,owner)){c.methods.remove(m);definitions++;removedSourceCompileAliases++;continue;}if(sourceInitializerMergeKeys.contains(key)){need(alias.target.equals("<clinit>")&&implementedTargets.size()==1,"exact saved source initializer target collision");appendExactZeroSerialVersionUidInitializer(c,implementedTargets.get(0),m,row,Path.of(args[1]).toAbsolutePath().normalize().getParent());definitions++;continue;}m.name=alias.target;
        if(x.has("target_access"))m.access=x.get("target_access").getAsInt();if(x.has("target_exceptions")){m.exceptions=new ArrayList<>();for(var exception:x.getAsJsonArray("target_exceptions"))m.exceptions.add(exception.getAsString());}if(m.name.equals("<clinit>")){m.exceptions.clear();need(m.access==Opcodes.ACC_STATIC,"clinit flags must be exact static");}definitions++;
      }
      if(row.has("defer_member_coverage_to_declaration_adapter")&&row.get("defer_member_coverage_to_declaration_adapter").getAsBoolean()){
        JsonObject deferred=new JsonObject();deferred.addProperty("owner",owner);deferred.addProperty("member_coverage_restoration_required",true);ownersReport.add(deferred);continue;
      }
      Set<String> expectedFields=new HashSet<>();for(var f:row.getAsJsonArray("restore_field_access")){var x=f.getAsJsonObject();String key=s(x,"name")+s(x,"descriptor");need(expectedFields.add(key),"duplicate field restore identity");var fs=c.fields.stream().filter(z->z.name.equals(s(x,"name"))&&z.desc.equals(s(x,"descriptor"))).toList();need(fs.size()==1,"exact field restore missing");fs.get(0).access=x.get("access").getAsInt();fields++;}
      need(expectedFields.equals(new HashSet<>(c.fields.stream().map(f->f.name+f.desc).toList())),"field coverage differs from explicit ABI plan: "+owner);
      Set<String> expectedMethods=new HashSet<>();for(var item:row.getAsJsonArray("restore_method_access")){var x=item.getAsJsonObject();String key=s(x,"name")+s(x,"descriptor");need(expectedMethods.add(key),"duplicate method restore identity");var ms=c.methods.stream().filter(z->z.name.equals(s(x,"name"))&&z.desc.equals(s(x,"descriptor"))).toList();need(ms.size()==1,"exact restored method missing: "+owner+"."+key);MethodNode m=ms.get(0);int access=x.get("access").getAsInt();if((access&Opcodes.ACC_BRIDGE)!=0)need((m.access&Opcodes.ACC_SYNTHETIC)!=0||exactExplicitSourceBridge(Path.of(args[1]).toAbsolutePath().normalize().getParent(),owner,x,m),"planned bridge must be fresh javac-generated or exact hashed explicit saved Java bridge: "+owner+"."+key+" access="+m.access);m.access=access;flags++;}
      need(expectedMethods.equals(new HashSet<>(c.methods.stream().map(m->m.name+m.desc).toList())),"method coverage differs from ABI plan; unlisted extra/bridge not permitted: "+owner);
      for(FieldNode field:c.fields)if((field.access&Opcodes.ACC_FINAL)!=0)for(ClassNode consumer:classes.values())for(MethodNode m:consumer.methods)for(AbstractInsnNode n:m.instructions)if(n instanceof FieldInsnNode write&&(write.getOpcode()==Opcodes.PUTSTATIC||write.getOpcode()==Opcodes.PUTFIELD)&&write.owner.equals(owner)&&write.name.equals(field.name)&&write.desc.equals(field.desc)){
        String required=(field.access&Opcodes.ACC_STATIC)!=0?"<clinit>":"<init>";need(consumer.name.equals(owner)&&m.name.equals(required),"final field write outside declaring owner initializer: "+owner+"."+field.name+field.desc);
      }
      need(Objects.equals(signature,c.signature),"class Signature changed");if(row.has("preserve_class_signature")&&!row.get("preserve_class_signature").isJsonNull())need(Objects.equals(signature,s(row,"preserve_class_signature")),"fresh class Signature differs from exact plan");JsonObject r=new JsonObject();r.addProperty("owner",owner);r.addProperty("fields",c.fields.size());r.addProperty("methods",c.methods.size());r.addProperty("class_signature_preserved",true);ownersReport.add(r);
    }
    noInitializerSource(classes);
    for(Alias alias:aliases.values())need(classes.get(alias.key.owner).methods.stream().noneMatch(m->m.name.equals(alias.key.name)&&m.desc.equals(alias.key.descriptor)),"source alias declaration remains after mapping");
    // Identity-only changes preserve control flow and fresh frames verbatim.
    // No class hierarchy computation or application class loading occurs.
    for(var c:classes.values()){ClassWriter w=new ClassWriter(0);c.accept(w);entries.put(c.name+".class",w.toByteArray());}
    Files.createDirectories(output.toAbsolutePath().getParent());try(var z=new ZipOutputStream(Files.newOutputStream(output,StandardOpenOption.CREATE_NEW))){for(var e:entries.entrySet()){var entry=new ZipEntry(e.getKey());entry.setTimeLocal(LocalDateTime.of(2000,1,1,0,0));z.putNextEntry(entry);z.write(e.getValue());z.closeEntry();}}
    JsonObject report=new JsonObject();report.addProperty("owners",planOwners.size());report.addProperty("renamed_definitions",definitions);report.addProperty("removed_source_alias_bridges",removedSourceCompileAliases);report.addProperty("renamed_calls",calls);report.addProperty("renamed_handles",handles);report.addProperty("constant_dynamic_values_visited",condys);report.addProperty("restored_fields",fields);report.addProperty("restored_method_flags",flags);report.addProperty("output_entries",entries.size());report.addProperty("strings_changed",0);report.addProperty("application_classes_loaded",0);report.addProperty("old_Code_frame_inputs",0);report.add("rows",ownersReport);Files.writeString(reportPath,new GsonBuilder().setPrettyPrinting().create().toJson(report));System.out.println(report);
  }
}
