import com.google.gson.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import org.objectweb.asm.tree.analysis.*;
import java.nio.file.*;
import java.util.*;
import java.util.zip.*;
import java.security.*;
import java.io.*;

/** Read-only final fresh archive contract/dataflow audit; never loads application classes. */
public final class FinalArchiveAudit implements Opcodes {
  static JsonObject metadata;static final List<JsonObject> failures=new ArrayList<>();
  static final Map<String,ClassNode> classes=new TreeMap<>();static final Map<String,Set<String>> codeAttributes=new HashMap<>();
  static final Set<String> allowedExtras=new TreeSet<>(),seenExtras=new TreeSet<>();
  static long classEntries,resources,declaredFields,declaredMethods,analyzed,analysisFailures,abstractNative,extraMethods;
  static String s(JsonObject o,String k){return o.get(k).getAsString();}
  static String signature(JsonObject o){JsonElement a=o.get("attributes");return a!=null&&a.isJsonObject()&&a.getAsJsonObject().has("Signature")?s(a.getAsJsonObject(),"Signature"):null;}
  static List<String> strings(JsonArray a){List<String> r=new ArrayList<>();for(var x:a)r.add(x.getAsString());return r;}
  static String sha(Path p)throws Exception{MessageDigest d=MessageDigest.getInstance("SHA-256");try(var in=Files.newInputStream(p)){byte[] b=new byte[1048576];for(int n;(n=in.read(b))>=0;)d.update(b,0,n);}return HexFormat.of().withUpperCase().formatHex(d.digest());}
  static void fail(String code,String owner,String member,String detail){JsonObject e=new JsonObject();e.addProperty("code",code);e.addProperty("owner",owner);e.addProperty("member",member);e.addProperty("detail",detail);failures.add(e);}
  static void eq(boolean ok,String code,String owner,String member,String detail){if(!ok)fail(code,owner,member,detail);}
  // ASM pseudo flags (for example ACC_DEPRECATED) are attributes, not u2 access_flags.
  static boolean helperName(String name){return name.startsWith("__sourceIntrinsic")||name.startsWith("__sourceExactCall")||name.startsWith("__sourceHandlerCall")||name.startsWith("__sourceConstructorBody_")||name.startsWith("__sourceConstructorInit_")||name.equals("__sourceInitializeParent")||name.startsWith("__sourceInterfaceCall_")||name.startsWith("__sourceField")||name.startsWith("__sourceExactField")||name.matches("__(?:call|fieldRead|fieldWrite|cast|instanceOf|directSuperInit|integerCategory|originalNumericLdc)[0-9_].*")||name.startsWith("__q_");}
  static boolean helperType(String name){return name.contains("__SourceHandler")||name.contains("__SourceIntrinsics")||name.contains("__SourceInterface_")||name.equals("sourcebuild/EnumConstructor")||name.startsWith("sourcebuild/EnumConstructor$")||name.equals("recovery/source/CarrierOps")||name.startsWith("recovery/source/CarrierOps$");}
  static boolean originalMethod(String owner,String name,String desc,Set<String> seen){
    if(owner==null||!seen.add(owner)||!metadata.has(owner))return false;JsonObject c=metadata.getAsJsonObject(owner);
    for(var x:c.getAsJsonArray("methods")){JsonObject m=x.getAsJsonObject();if(s(m,"name").equals(name)&&s(m,"descriptor").equals(desc))return true;}
    String parent=c.get("super").isJsonNull()?null:s(c,"super");if(originalMethod(parent,name,desc,seen))return true;
    for(var i:c.getAsJsonArray("interfaces"))if(originalMethod(i.getAsString(),name,desc,seen))return true;return false;
  }
  static void typeName(String value,String owner,String member){if(value==null)return;if(helperType(value)&&!metadata.has(value))fail("residual_compiler_type",owner,member,value);}
  static void descriptor(String value,String owner,String member){
    if(value==null)return;try{if(value.startsWith("(")){for(Type t:Type.getArgumentTypes(value))type(t,owner,member);type(Type.getReturnType(value),owner,member);}else type(Type.getType(value),owner,member);}catch(IllegalArgumentException e){fail("invalid_descriptor",owner,member,value+": "+e.getMessage());}
  }
  static void type(Type t,String owner,String member){if(t.getSort()==Type.OBJECT)typeName(t.getInternalName(),owner,member);else if(t.getSort()==Type.ARRAY)type(t.getElementType(),owner,member);else if(t.getSort()==Type.METHOD)descriptor(t.getDescriptor(),owner,member);}
  static void textualTypeReferences(String v,String owner,String member){
    if(v==null)return;java.util.regex.Matcher m=java.util.regex.Pattern.compile("(?:[A-Za-z_$][A-Za-z0-9_$]*/)*(?:[A-Za-z0-9_$]*__Source(?:Handler|Intrinsics|Interface_)[A-Za-z0-9_$]*|CarrierOps(?:\\$[A-Za-z0-9_$]+)?|EnumConstructor(?:\\$[A-Za-z0-9_$]+)?)").matcher(v.replace('.','/'));
    while(m.find()){String n=m.group();if(n.startsWith("L"))n=n.substring(1);typeName(n,owner,member);}
  }
  static void constant(Object v,String owner,String member){
    if(v instanceof Type t)type(t,owner,member);
    else if(v instanceof Handle h){typeName(h.getOwner(),owner,member);descriptor(h.getDesc(),owner,member);if(h.getTag()>H_PUTSTATIC&&helperName(h.getName())&&!originalMethod(h.getOwner(),h.getName(),h.getDesc(),new HashSet<>()))fail("residual_helper_handle",owner,member,h.toString());}
    else if(v instanceof ConstantDynamic d){descriptor(d.getDescriptor(),owner,member);constant(d.getBootstrapMethod(),owner,member);for(int i=0;i<d.getBootstrapMethodArgumentCount();i++)constant(d.getBootstrapMethodArgument(i),owner,member);}
    else if(v instanceof AnnotationNode a){descriptor(a.desc,owner,member);if(a.values!=null)for(int i=1;i<a.values.size();i+=2)constant(a.values.get(i),owner,member);}
    else if(v instanceof List<?> l){for(var x:l)constant(x,owner,member);}
    else if(v instanceof String[] a){for(var x:a)textualTypeReferences(x,owner,member);}
    else if(v instanceof String a)textualTypeReferences(a,owner,member);
  }
  static void annotations(List<? extends AnnotationNode> list,String owner,String member){if(list!=null)for(var a:list)constant(a,owner,member);}
  static boolean reference(Type type){return type.getSort()==Type.OBJECT||type.getSort()==Type.ARRAY;}
  static boolean pureForwarder(ClassNode owner,MethodNode method,Set<String> declaredMethods){return pureForwarder(owner,method,declaredMethods,new HashSet<>());}
  static boolean pureForwarder(ClassNode owner,MethodNode method,Set<String> declaredMethods,Set<String> seen){
    if(!seen.add(method.name+method.desc))return false;
    if(method.name.startsWith("<")||(method.access&(ACC_ABSTRACT|ACC_NATIVE|ACC_SYNCHRONIZED))!=0||!method.tryCatchBlocks.isEmpty())return false;
    List<AbstractInsnNode> ops=Arrays.stream(method.instructions.toArray()).filter(n->n.getOpcode()>=0).toList();
    List<MethodInsnNode> invokes=ops.stream().filter(n->n instanceof MethodInsnNode).map(n->(MethodInsnNode)n).toList();
    if(invokes.size()!=1)return false;MethodInsnNode call=invokes.get(0);
    if(!call.owner.equals(owner.name)||!call.name.equals(method.name)||call.name.startsWith("<")||call.desc.equals(method.desc))return false;
    List<MethodNode> targets=owner.methods.stream().filter(m->m.name.equals(call.name)&&m.desc.equals(call.desc)).toList();if(targets.size()!=1)return false;
    if(!declaredMethods.contains(call.name+call.desc)&&!pureForwarder(owner,targets.get(0),declaredMethods,seen))return false;
    MethodNode target=targets.get(0);boolean isStatic=(method.access&ACC_STATIC)!=0;
    if(isStatic!=((target.access&ACC_STATIC)!=0))return false;
    int expectedOpcode=isStatic?INVOKESTATIC:(owner.access&ACC_INTERFACE)!=0?INVOKEINTERFACE:(target.access&ACC_PRIVATE)!=0?INVOKESPECIAL:INVOKEVIRTUAL;
    if(call.getOpcode()!=expectedOpcode||call.itf!=((owner.access&ACC_INTERFACE)!=0))return false;
    Type[] arguments=Type.getArgumentTypes(method.desc),called=Type.getArgumentTypes(call.desc);if(arguments.length!=called.length)return false;
    int cursor=0,slot=isStatic?0:1;
    if(!isStatic){if(cursor>=ops.size()||!(ops.get(cursor++) instanceof VarInsnNode v)||v.getOpcode()!=ALOAD||v.var!=0)return false;}
    for(int i=0;i<arguments.length;i++){
      Type from=arguments[i],to=called[i];if(cursor>=ops.size()||!(ops.get(cursor++) instanceof VarInsnNode v)||v.getOpcode()!=from.getOpcode(ILOAD)||v.var!=slot)return false;slot+=from.getSize();
      if(!from.equals(to)&&!(reference(from)&&reference(to)))return false;
      if(cursor<ops.size()&&ops.get(cursor) instanceof TypeInsnNode cast&&cast.getOpcode()==CHECKCAST){if(!reference(to)||!cast.desc.equals(to.getInternalName()))return false;cursor++;}
      else if(reference(from)&&reference(to)&&!from.equals(to)&&!to.equals(Type.getType(Object.class)))return false;
    }
    if(cursor>=ops.size()||ops.get(cursor++)!=call)return false;Type result=Type.getReturnType(call.desc),returned=Type.getReturnType(method.desc);
    if(!result.equals(returned)&&!(reference(result)&&reference(returned)))return false;
    if(cursor<ops.size()&&ops.get(cursor) instanceof TypeInsnNode cast&&cast.getOpcode()==CHECKCAST){if(!reference(returned)||!cast.desc.equals(returned.getInternalName()))return false;cursor++;}
    return cursor+1==ops.size()&&ops.get(cursor).getOpcode()==returned.getOpcode(IRETURN);
  }
  static void inspectReferences(ClassNode c){
    String owner=c.name;typeName(c.name,owner,null);typeName(c.superName,owner,null);for(String n:c.interfaces)typeName(n,owner,null);textualTypeReferences(c.signature,owner,null);typeName(c.outerClass,owner,null);descriptor(c.outerMethodDesc,owner,null);typeName(c.nestHostClass,owner,null);if(c.nestMembers!=null)for(String n:c.nestMembers)typeName(n,owner,null);if(c.permittedSubclasses!=null)for(String n:c.permittedSubclasses)typeName(n,owner,null);for(var n:c.innerClasses){typeName(n.name,owner,null);typeName(n.outerName,owner,null);}annotations(c.visibleAnnotations,owner,null);annotations(c.invisibleAnnotations,owner,null);annotations(c.visibleTypeAnnotations,owner,null);annotations(c.invisibleTypeAnnotations,owner,null);
    for(var f:c.fields){descriptor(f.desc,owner,f.name+f.desc);textualTypeReferences(f.signature,owner,f.name);constant(f.value,owner,f.name);annotations(f.visibleAnnotations,owner,f.name);annotations(f.invisibleAnnotations,owner,f.name);annotations(f.visibleTypeAnnotations,owner,f.name);annotations(f.invisibleTypeAnnotations,owner,f.name);}
    for(var m:c.methods){String key=m.name+m.desc;descriptor(m.desc,owner,key);textualTypeReferences(m.signature,owner,key);for(String n:m.exceptions)typeName(n,owner,key);constant(m.annotationDefault,owner,key);annotations(m.visibleAnnotations,owner,key);annotations(m.invisibleAnnotations,owner,key);annotations(m.visibleTypeAnnotations,owner,key);annotations(m.invisibleTypeAnnotations,owner,key);annotations(m.visibleLocalVariableAnnotations,owner,key);annotations(m.invisibleLocalVariableAnnotations,owner,key);if(m.visibleParameterAnnotations!=null)for(var a:m.visibleParameterAnnotations)annotations(a,owner,key);if(m.invisibleParameterAnnotations!=null)for(var a:m.invisibleParameterAnnotations)annotations(a,owner,key);if(m.localVariables!=null)for(var l:m.localVariables){descriptor(l.desc,owner,key);textualTypeReferences(l.signature,owner,key);}for(var h:m.tryCatchBlocks){typeName(h.type,owner,key);annotations(h.visibleTypeAnnotations,owner,key);annotations(h.invisibleTypeAnnotations,owner,key);}
      if(helperName(m.name)&&!originalMethod(owner,m.name,m.desc,new HashSet<>()))fail("residual_helper_declaration",owner,key,"No original exact declaration permits this helper prefix");
      for(var n:m.instructions){if(n instanceof MethodInsnNode call){typeName(call.owner,owner,key);descriptor(call.desc,owner,key);if(helperName(call.name)&&!originalMethod(call.owner,call.name,call.desc,new HashSet<>()))fail("residual_helper_invocation",owner,key,call.owner+"."+call.name+call.desc);}
        else if(n instanceof FieldInsnNode f){typeName(f.owner,owner,key);descriptor(f.desc,owner,key);}
        else if(n instanceof TypeInsnNode t){if(t.desc.startsWith("["))descriptor(t.desc,owner,key);else typeName(t.desc,owner,key);}
        else if(n instanceof MultiANewArrayInsnNode t)descriptor(t.desc,owner,key);
        else if(n instanceof LdcInsnNode l)constant(l.cst,owner,key);
        else if(n instanceof InvokeDynamicInsnNode d){descriptor(d.desc,owner,key);constant(d.bsm,owner,key);for(var a:d.bsmArgs)constant(a,owner,key);}
        else if(n instanceof FrameNode f){if(f.local!=null)for(var a:f.local)if(a instanceof String t){if(t.startsWith("["))descriptor(t,owner,key);else typeName(t,owner,key);}if(f.stack!=null)for(var a:f.stack)if(a instanceof String t){if(t.startsWith("["))descriptor(t,owner,key);else typeName(t,owner,key);}}
        annotations(n.visibleTypeAnnotations,owner,key);annotations(n.invisibleTypeAnnotations,owner,key);
      }
    }
  }
  static void contract(ClassNode c,JsonObject expected){
    String owner=c.name;eq((c.access&0xffff)==expected.get("access").getAsInt(),"class_access",owner,null,"actual="+c.access+" expected="+expected.get("access"));String parent=expected.get("super").isJsonNull()?null:s(expected,"super");eq(Objects.equals(c.superName,parent),"class_super",owner,null,String.valueOf(c.superName)+" != "+parent);eq(c.interfaces.equals(strings(expected.getAsJsonArray("interfaces"))),"class_interfaces",owner,null,c.interfaces.toString());eq(Objects.equals(c.signature,signature(expected)),"class_signature",owner,null,String.valueOf(c.signature));
    Map<String,FieldNode> fields=new TreeMap<>();for(var f:c.fields)eq(fields.putIfAbsent(f.name+f.desc,f)==null,"duplicate_field",owner,f.name+f.desc,"Duplicate exact field");Set<String> ef=new TreeSet<>();
    for(var x:expected.getAsJsonArray("fields")){JsonObject f=x.getAsJsonObject();String key=s(f,"name")+s(f,"descriptor");eq(ef.add(key),"duplicate_metadata_field",owner,key,"Duplicate metadata field");FieldNode actual=fields.get(key);if(actual==null){fail("missing_field",owner,key,"Original field absent");continue;}declaredFields++;eq((actual.access&0xffff)==f.get("access").getAsInt(),"field_access",owner,key,"actual="+actual.access+" expected="+f.get("access"));eq(Objects.equals(actual.signature,signature(f)),"field_signature",owner,key,String.valueOf(actual.signature));}
    for(String key:fields.keySet())eq(ef.contains(key),"unlisted_field",owner,key,"No original field declaration");
    Map<String,MethodNode> methods=new TreeMap<>();for(var m:c.methods)eq(methods.putIfAbsent(m.name+m.desc,m)==null,"duplicate_method",owner,m.name+m.desc,"Duplicate exact method");Set<String> em=new TreeSet<>();
    for(var x:expected.getAsJsonArray("methods")){JsonObject m=x.getAsJsonObject();String key=s(m,"name")+s(m,"descriptor");eq(em.add(key),"duplicate_metadata_method",owner,key,"Duplicate metadata method");MethodNode actual=methods.get(key);if(actual==null){fail("missing_method",owner,key,"Original method absent");continue;}declaredMethods++;eq((actual.access&0xffff)==m.get("access").getAsInt(),"method_access",owner,key,"actual="+actual.access+" expected="+m.get("access"));eq(Objects.equals(actual.signature,signature(m)),"method_signature",owner,key,String.valueOf(actual.signature));eq(actual.exceptions.equals(strings(m.getAsJsonArray("exceptions"))),"method_exceptions",owner,key,actual.exceptions.toString());}
    for(var m:c.methods)if(!em.contains(m.name+m.desc)){String key=owner+"."+m.name+m.desc;if(!allowedExtras.contains(key))fail("unlisted_method",owner,m.name+m.desc,"Not original and absent from exact declaration report");else{seenExtras.add(key);extraMethods++;eq(pureForwarder(c,m,em),"nonpure_reported_forwarder",owner,m.name+m.desc,"Reported extra must forward once to same owner/name original full descriptor with ordered arguments");}}
    Set<String> code=codeAttributes.getOrDefault(owner,Set.of());for(var m:c.methods){String key=m.name+m.desc;boolean declaredNoCode=(m.access&(ACC_ABSTRACT|ACC_NATIVE))!=0,hasCode=code.contains(key);eq(declaredNoCode?!hasCode:hasCode,"method_Code_kind",owner,key,"abstract/native="+declaredNoCode+" Code_attribute="+hasCode);if(declaredNoCode){abstractNative++;continue;}if(!hasCode)continue;try{new Analyzer<BasicValue>(new BasicVerifier()).analyze(owner,m);analyzed++;}catch(AnalyzerException|RuntimeException e){analysisFailures++;int at=e instanceof AnalyzerException a&&a.node!=null?m.instructions.indexOf(a.node):-1;fail("BasicVerifier_analysis_failure",owner,key,"instruction="+at+" "+e.getClass().getName()+": "+e.getMessage());}}
  }
  public static void main(String[]args)throws Exception{
    if(args.length!=4)throw new IllegalArgumentException("FinalArchiveAudit final-fresh.jar declarations.json DECLARATION_RESULT.json REPORT.json");Path archive=Path.of(args[0]),decl=Path.of(args[1]),extras=Path.of(args[2]),reportPath=Path.of(args[3]);if(Files.exists(reportPath))throw new IllegalArgumentException("New report path required");metadata=JsonParser.parseString(Files.readString(decl)).getAsJsonObject();JsonObject dr=JsonParser.parseString(Files.readString(extras)).getAsJsonObject();
    if(!dr.has("extra_covariant_forwarders")||!dr.get("extra_covariant_forwarders").isJsonArray())throw new IllegalArgumentException("Declaration report missing explicit extra_covariant_forwarders array");
    for(var x:dr.getAsJsonArray("extra_covariant_forwarders")){JsonObject e=x.getAsJsonObject();String owner=s(e,"owner"),method=s(e,"method");eq(metadata.has(owner),"extra_report_unknown_owner",owner,method,"Reported extra owner not metadata-owned");eq(s(e,"role").equals("explicit_fresh_covariant_Java_forwarder"),"extra_report_unknown_role",owner,method,s(e,"role"));eq(allowedExtras.add(owner+"."+method),"extra_report_duplicate",owner,method,"Duplicate extra identity");}
    Set<String> entries=new HashSet<>();try(var z=new ZipFile(archive.toFile())){for(var e:Collections.list(z.entries())){if(!entries.add(e.getName())){fail("duplicate_ZIP_entry",null,e.getName(),"Duplicate exact ZIP identity");continue;}if(e.isDirectory())continue;if(!e.getName().endsWith(".class")){resources++;continue;}classEntries++;byte[] bytes;try(var in=z.getInputStream(e)){bytes=in.readAllBytes();}try{
      ClassNode c=new ClassNode();ClassReader reader=new ClassReader(bytes);reader.accept(c,0);eq(e.getName().equals(c.name+".class"),"class_entry_identity",c.name,e.getName(),"ZIP entry must equal internal owner + .class");if(classes.putIfAbsent(c.name,c)!=null)fail("duplicate_class_owner",c.name,e.getName(),"Owner repeated under distinct entries");Set<String> code=new HashSet<>();reader.accept(new ClassVisitor(ASM9){@Override public MethodVisitor visitMethod(int access,String name,String desc,String signature,String[] exceptions){return new MethodVisitor(ASM9){@Override public void visitCode(){code.add(name+desc);}};}},ClassReader.SKIP_DEBUG|ClassReader.SKIP_FRAMES);codeAttributes.put(c.name,code);
      if(!metadata.has(c.name))fail("unknown_production_class",c.name,e.getName(),"Compiler/support or unexplained class cannot ship");
    }catch(RuntimeException ex){fail("class_parse_failure",null,e.getName(),ex.getClass().getName()+": "+ex.getMessage());}}}
    for(var e:metadata.entrySet()){String owner=e.getKey();JsonObject row=e.getValue().getAsJsonObject();eq(s(row,"owner").equals(owner),"metadata_owner_key",owner,null,s(row,"owner"));ClassNode c=classes.get(owner);if(c==null){fail("missing_owned_class",owner,null,"Metadata-owned class missing");continue;}try{contract(c,row);inspectReferences(c);}catch(RuntimeException ex){fail("class_audit_failure",owner,null,ex.getClass().getName()+": "+ex.getMessage());}}
    for(String key:allowedExtras)eq(seenExtras.contains(key),"extra_report_stale_or_missing",null,key,"Reported extra not present as an extra fresh method");
    JsonObject report=new JsonObject();report.addProperty("status",failures.isEmpty()?"passed_static_final_archive_contract_and_BasicVerifier":"failed_static_final_archive_audit");report.addProperty("metadata_owned_classes",metadata.size());report.addProperty("class_entries",classEntries);report.addProperty("present_owned_classes",metadata.keySet().stream().filter(classes::containsKey).count());report.addProperty("unknown_production_class_count",classes.keySet().stream().filter(k->!metadata.has(k)).count());report.addProperty("resource_entries",resources);report.addProperty("metadata_original_fields",metadata.entrySet().stream().mapToLong(e->e.getValue().getAsJsonObject().getAsJsonArray("fields").size()).sum());report.addProperty("metadata_original_methods",metadata.entrySet().stream().mapToLong(e->e.getValue().getAsJsonObject().getAsJsonArray("methods").size()).sum());report.addProperty("exact_original_fields_checked",declaredFields);report.addProperty("exact_original_methods_checked",declaredMethods);report.addProperty("reported_extra_forwarders_checked",extraMethods);report.addProperty("BasicVerifier_methods_passed",analyzed);report.addProperty("BasicVerifier_analysis_failures",analysisFailures);report.addProperty("abstract_native_methods_without_Code",abstractNative);report.addProperty("failure_count",failures.size());report.add("failures",new Gson().toJsonTree(failures));JsonObject locks=new JsonObject();for(int i=0;i<3;i++){JsonObject lock=new JsonObject();lock.addProperty("path",Path.of(args[i]).toAbsolutePath().toString());lock.addProperty("sha256",sha(Path.of(args[i])));lock.addProperty("size",Files.size(Path.of(args[i])));locks.add(i==0?"fresh_final_archive":i==1?"declarations":"declaration_result",lock);}report.add("inputs",locks);report.addProperty("application_classes_loaded",0);report.addProperty("native_or_application_execution",false);report.addProperty("old_Code_frame_donor_inputs",0);report.addProperty("dataflow_scope","ASM BasicVerifier instruction/stack/local analysis; no SimpleVerifier or external hierarchy class loading; not JVM linkage, StackMapTable equivalence, constructor uninitialized-this verification or functional runtime acceptance.");report.addProperty("access_comparison_policy","Exact classfile u2 access_flags (ASM pseudo attribute flags excluded); annotation/deprecation attributes are not access bits.");report.addProperty("source_compilation_policy","Final artifact audit follows reviewed saved-operation lowering, compile-only source query type/access projections and ABI/declaration restoration; it does not claim ordinary unmodified strict-javac source compilation.");Files.createDirectories(reportPath.toAbsolutePath().getParent());Files.writeString(reportPath,new GsonBuilder().setPrettyPrinting().create().toJson(report),StandardOpenOption.CREATE_NEW);System.out.println(new Gson().toJson(Map.of("status",s(report,"status"),"owned",metadata.size(),"methods_analyzed",analyzed,"analysis_failures",analysisFailures,"failure_count",failures.size(),"report",reportPath.toAbsolutePath().toString())));if(!failures.isEmpty())System.exit(2);
  }
}
