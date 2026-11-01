import com.google.gson.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;
import java.util.*;
import java.util.zip.*;
import java.io.*;
import java.time.LocalDateTime;

/** Restore original declaration flags after the compile-only access query view.
 * Implementation instructions are taken exclusively from this fresh build.
 */
public final class SourceDeclarationAdapter {
  static String s(JsonObject o,String k){return o.get(k).getAsString();}
  static String signature(JsonObject o){JsonElement a=o.get("attributes");return a!=null&&a.isJsonObject()&&a.getAsJsonObject().has("Signature")?s(a.getAsJsonObject(),"Signature"):null;}
  static void need(boolean ok,String message){if(!ok)throw new IllegalArgumentException(message);}
  static String nullable(JsonObject o,String key){return !o.has(key)||o.get(key).isJsonNull()?null:s(o,key);}
  static boolean absent(JsonObject row,String key){return !row.has(key)||row.get(key).isJsonNull();}
  static Object value(JsonElement e){
    if(e==null||e.isJsonNull())return null;if(e.isJsonPrimitive())return e.getAsString();
    if(e.isJsonArray()){List<Object> list=new ArrayList<>();for(var item:e.getAsJsonArray())list.add(value(item));return list;}
    JsonObject o=e.getAsJsonObject();if(o.has("class_descriptor"))return Type.getType(s(o,"class_descriptor"));
    if(o.has("enum_descriptor"))return new String[]{s(o,"enum_descriptor"),s(o,"name")};
    if(o.has("annotation"))return annotation(o.getAsJsonObject("annotation"));
    String data=s(o,"value");return switch(s(o,"primitive_type")){
      case "Integer"->Integer.valueOf(data);case "Long"->Long.valueOf(data);case "Short"->Short.valueOf(data);case "Byte"->Byte.valueOf(data);case "Character"->(char)Integer.parseInt(data);case "Boolean"->Boolean.valueOf(data);case "Float"->Float.intBitsToFloat(Integer.parseUnsignedInt(data));case "Double"->Double.longBitsToDouble(Long.parseUnsignedLong(data));default->throw new IllegalArgumentException("Unknown declaration value type");};
  }
  static AnnotationNode annotation(JsonObject row){
    AnnotationNode a=row.has("type_ref")?new TypeAnnotationNode(row.get("type_ref").getAsInt(),nullable(row,"type_path")==null?null:TypePath.fromString(s(row,"type_path")),s(row,"descriptor")):new AnnotationNode(s(row,"descriptor"));
    a.values=new ArrayList<>();for(var e:row.getAsJsonObject("values").entrySet()){a.values.add(e.getKey());a.values.add(value(e.getValue()));}return a;
  }
  static List<AnnotationNode> annotations(JsonObject row,String key){List<AnnotationNode> out=new ArrayList<>();for(var e:row.getAsJsonArray(key))out.add(annotation(e.getAsJsonObject()));return out.isEmpty()?null:out;}
  static List<TypeAnnotationNode> types(JsonObject row,String key){List<TypeAnnotationNode> out=new ArrayList<>();for(var e:row.getAsJsonArray(key))out.add((TypeAnnotationNode)annotation(e.getAsJsonObject()));return out.isEmpty()?null:out;}
  @SuppressWarnings("unchecked") static List<AnnotationNode>[] parameters(JsonObject row,String key){JsonArray input=row.getAsJsonArray(key);if(input.isEmpty())return null;List<AnnotationNode>[] out=(List<AnnotationNode>[])new List<?>[input.size()];for(int i=0;i<input.size();i++){List<AnnotationNode> values=new ArrayList<>();for(var a:input.get(i).getAsJsonArray())values.add(annotation(a.getAsJsonObject()));out[i]=values;}return out;}
  static SourceForwarderTypeProof forwarderTypeProof;
  static boolean pureForwarder(ClassNode owner,MethodNode method,Set<String> declaredMethods){
    if(forwarderTypeProof==null)throw new IllegalStateException("Explicit Code-free hierarchy proof context not initialized");
    return forwarderTypeProof.prove(owner,method,declaredMethods).accepted();
  }
  static boolean implicitDefaultConstructor(ClassNode owner,MethodNode method){
    if(!method.name.equals("<init>")||!method.desc.equals("()V")||!method.tryCatchBlocks.isEmpty())return false;
    List<AbstractInsnNode> ops=Arrays.stream(method.instructions.toArray()).filter(n->n.getOpcode()>=0).toList();
    if(ops.size()!=3||!(ops.get(0) instanceof VarInsnNode v&&v.getOpcode()==Opcodes.ALOAD&&v.var==0))return false;
    if(!(ops.get(1) instanceof MethodInsnNode call&&call.getOpcode()==Opcodes.INVOKESPECIAL&&call.owner.equals("java/lang/Object")&&call.name.equals("<init>")&&call.desc.equals("()V")))return false;
    return ops.get(2).getOpcode()==Opcodes.RETURN;
  }
  static final JsonArray enumBindings=new JsonArray();
  static Object enumReference(Object value,String owner,Map<String,String> fields,Map<String,String> methods,int[] counts){
    if(value instanceof Handle h){
      String name=(h.getTag()<=Opcodes.H_PUTSTATIC?fields:methods).get(h.getName()+h.getDesc());
      if(h.getOwner().equals(owner)&&name!=null){counts[2]++;return new Handle(h.getTag(),h.getOwner(),name,h.getDesc(),h.isInterface());}
    }else if(value instanceof ConstantDynamic d){
      Handle bootstrap=(Handle)enumReference(d.getBootstrapMethod(),owner,fields,methods,counts);
      Object[] arguments=new Object[d.getBootstrapMethodArgumentCount()];
      for(int i=0;i<arguments.length;i++)arguments[i]=enumReference(d.getBootstrapMethodArgument(i),owner,fields,methods,counts);
      return new ConstantDynamic(d.getName(),d.getDescriptor(),bootstrap,arguments);
    }
    return value;
  }
  static void normalizeEnumCompilerArtifacts(ClassNode c,JsonObject row){
    if((row.get("access").getAsInt()&Opcodes.ACC_ENUM)==0)return;
    JsonArray fields=row.getAsJsonArray("fields"), methods=row.getAsJsonArray("methods");
    Map<String,String> fieldNames=new HashMap<>(),methodNames=new HashMap<>();
    for(var e:fields){JsonObject f=e.getAsJsonObject();if(!s(f,"name").equals("a")||!s(f,"descriptor").equals("[L"+c.name+";"))continue;String desc=s(f,"descriptor");List<FieldNode> synthetic=c.fields.stream().filter(x->x.name.equals("$VALUES")&&x.desc.equals(desc)).toList();List<FieldNode> exact=c.fields.stream().filter(x->x.name.equals("a")&&x.desc.equals(desc)).toList();if(exact.isEmpty()&&synthetic.size()==1){FieldNode x=synthetic.get(0);need((x.access&(Opcodes.ACC_STATIC|Opcodes.ACC_FINAL|Opcodes.ACC_SYNTHETIC))==(Opcodes.ACC_STATIC|Opcodes.ACC_FINAL|Opcodes.ACC_SYNTHETIC),"enum synthetic values field flags differ");fieldNames.put(x.name+x.desc,"a");x.name="a";}}
    for(var e:methods){JsonObject m=e.getAsJsonObject();if(!s(m,"name").equals("a")||!s(m,"descriptor").equals("()[L"+c.name+";"))continue;String desc=s(m,"descriptor");List<MethodNode> synthetic=c.methods.stream().filter(x->x.name.equals("$values")&&x.desc.equals(desc)).toList();List<MethodNode> exact=c.methods.stream().filter(x->x.name.equals("a")&&x.desc.equals(desc)).toList();if(exact.isEmpty()&&synthetic.size()==1){MethodNode x=synthetic.get(0);need((x.access&(Opcodes.ACC_PRIVATE|Opcodes.ACC_STATIC|Opcodes.ACC_SYNTHETIC))==(Opcodes.ACC_PRIVATE|Opcodes.ACC_STATIC|Opcodes.ACC_SYNTHETIC),"enum synthetic values method flags differ");methodNames.put(x.name+x.desc,"a");x.name="a";}}
    int[] counts=new int[3];
    for(MethodNode m:c.methods)for(AbstractInsnNode n:m.instructions){
      if(n instanceof FieldInsnNode f&&f.owner.equals(c.name)&&fieldNames.containsKey(f.name+f.desc)){f.name=fieldNames.get(f.name+f.desc);counts[0]++;}
      else if(n instanceof MethodInsnNode call&&call.owner.equals(c.name)&&methodNames.containsKey(call.name+call.desc)){call.name=methodNames.get(call.name+call.desc);counts[1]++;}
      else if(n instanceof LdcInsnNode ldc)ldc.cst=enumReference(ldc.cst,c.name,fieldNames,methodNames,counts);
      else if(n instanceof InvokeDynamicInsnNode indy){indy.bsm=(Handle)enumReference(indy.bsm,c.name,fieldNames,methodNames,counts);for(int i=0;i<indy.bsmArgs.length;i++)indy.bsmArgs[i]=enumReference(indy.bsmArgs[i],c.name,fieldNames,methodNames,counts);}
    }
    if(!fieldNames.isEmpty()||!methodNames.isEmpty()){
      JsonObject binding=new JsonObject();binding.addProperty("owner",c.name);binding.addProperty("field_definitions",fieldNames.size());binding.addProperty("method_definitions",methodNames.size());binding.addProperty("field_instruction_references",counts[0]);binding.addProperty("method_instruction_references",counts[1]);binding.addProperty("handle_references",counts[2]);enumBindings.add(binding);
    }
  }
  public static void main(String[]args)throws Exception{
    need(args.length>=6,"SourceDeclarationAdapter fresh.jar Code-free-declarations.json new.jar REPORT.json decoded-runtime-declarations.json provider.jar...");
    Path output=Path.of(args[2]),reportPath=Path.of(args[3]);need(!Files.exists(output)&&!Files.exists(reportPath),"Outputs must be new");
    JsonObject metadata=JsonParser.parseString(Files.readString(Path.of(args[1]))).getAsJsonObject();Map<String,byte[]> entries=new TreeMap<>();
    JsonObject runtime=JsonParser.parseString(Files.readString(Path.of(args[4]))).getAsJsonObject();
    forwarderTypeProof=new SourceForwarderTypeProof(metadata,Arrays.stream(args).skip(5).map(Path::of).toList());
    try(var z=new ZipFile(args[0])){for(var e:Collections.list(z.entries()))if(!e.isDirectory()){need(!entries.containsKey(e.getName()),"Duplicate exact output identity");try(var in=z.getInputStream(e)){entries.put(e.getName(),in.readAllBytes());}}}
    int owners=0,fields=0,methods=0;JsonArray extras=new JsonArray(),implicitConstructors=new JsonArray();
    for(var e:metadata.entrySet()){
      JsonObject row=e.getValue().getAsJsonObject();String owner=s(row,"owner");byte[] fresh=entries.get(owner+".class");need(fresh!=null,"Missing source owner after lowering: "+owner);
      ClassNode c=new ClassNode();new ClassReader(fresh).accept(c,0);need(c.name.equals(owner),"Owner mismatch");
      normalizeEnumCompilerArtifacts(c,row);
      String parent=row.get("super").isJsonNull()?null:s(row,"super");need(Objects.equals(c.superName,parent),"Unrestored superclass: "+owner+" "+c.superName+" != "+parent);
      c.access=row.get("access").getAsInt();c.signature=signature(row);
      JsonObject declaredRuntime=runtime==null?null:runtime.getAsJsonObject(owner);
      if(declaredRuntime!=null){
        c.nestHostClass=nullable(declaredRuntime,"nest_host");c.nestMembers=new ArrayList<>();if(!absent(declaredRuntime,"nest_members"))for(var n:declaredRuntime.getAsJsonArray("nest_members"))c.nestMembers.add(n.getAsString());
        c.permittedSubclasses=new ArrayList<>();if(!absent(declaredRuntime,"permitted_subclasses"))for(var n:declaredRuntime.getAsJsonArray("permitted_subclasses"))c.permittedSubclasses.add(n.getAsString());
        c.outerClass=nullable(declaredRuntime,"outer_class");c.outerMethod=nullable(declaredRuntime,"outer_method");c.outerMethodDesc=nullable(declaredRuntime,"outer_method_descriptor");c.innerClasses=new ArrayList<>();for(var item:declaredRuntime.getAsJsonArray("inner_classes")){var inner=item.getAsJsonObject();c.innerClasses.add(new InnerClassNode(s(inner,"name"),nullable(inner,"outer_name"),nullable(inner,"inner_name"),inner.get("access").getAsInt()));}
        c.visibleAnnotations=annotations(declaredRuntime,"visible_annotations");c.invisibleAnnotations=annotations(declaredRuntime,"invisible_annotations");c.visibleTypeAnnotations=types(declaredRuntime,"visible_type_annotations");c.invisibleTypeAnnotations=types(declaredRuntime,"invisible_type_annotations");
      }
      Set<String> declaredFields=new HashSet<>(),declaredMethods=new HashSet<>();
      for(var item:row.getAsJsonArray("fields")){
        JsonObject field=item.getAsJsonObject();String key=s(field,"name")+s(field,"descriptor");declaredFields.add(key);
        var matches=c.fields.stream().filter(f->f.name.equals(s(field,"name"))&&f.desc.equals(s(field,"descriptor"))).toList();need(matches.size()==1,"Missing fresh field "+owner+"."+key);
        FieldNode target=matches.get(0);target.access=field.get("access").getAsInt();target.signature=signature(field);fields++;
        if(declaredRuntime!=null){var attributes=declaredRuntime.getAsJsonObject("fields").getAsJsonObject(key);need(attributes!=null,"Missing decoded field attributes");target.value=value(attributes.get("constant_value"));target.visibleAnnotations=annotations(attributes,"visible_annotations");target.invisibleAnnotations=annotations(attributes,"invisible_annotations");target.visibleTypeAnnotations=types(attributes,"visible_type_annotations");target.invisibleTypeAnnotations=types(attributes,"invisible_type_annotations");}
      }
      for(var item:row.getAsJsonArray("methods")){
        JsonObject method=item.getAsJsonObject();String key=s(method,"name")+s(method,"descriptor");declaredMethods.add(key);
        var matches=c.methods.stream().filter(m->m.name.equals(s(method,"name"))&&m.desc.equals(s(method,"descriptor"))).toList();need(matches.size()==1,"Missing fresh method "+owner+"."+key);
        MethodNode target=matches.get(0);int access=method.get("access").getAsInt();need(((access&(Opcodes.ACC_NATIVE|Opcodes.ACC_ABSTRACT))!=0)==(target.instructions.size()==0),"Declaration/implementation kind differs: "+owner+"."+key);
        target.access=access;target.signature=signature(method);target.exceptions=new ArrayList<>();for(var ex:method.getAsJsonArray("exceptions"))target.exceptions.add(ex.getAsString());methods++;
        if(declaredRuntime!=null){var attributes=declaredRuntime.getAsJsonObject("methods").getAsJsonObject(key);need(attributes!=null,"Missing decoded method attributes");target.visibleAnnotations=annotations(attributes,"visible_annotations");target.invisibleAnnotations=annotations(attributes,"invisible_annotations");target.visibleTypeAnnotations=types(attributes,"visible_type_annotations");target.invisibleTypeAnnotations=types(attributes,"invisible_type_annotations");target.annotationDefault=value(attributes.get("annotation_default"));target.visibleParameterAnnotations=parameters(attributes,"visible_parameter_annotations");target.invisibleParameterAnnotations=parameters(attributes,"invisible_parameter_annotations");target.visibleAnnotableParameterCount=attributes.get("visible_annotable_parameter_count").getAsInt();target.invisibleAnnotableParameterCount=attributes.get("invisible_annotable_parameter_count").getAsInt();target.parameters=new ArrayList<>();for(var p:attributes.getAsJsonArray("parameters")){var pp=p.getAsJsonObject();target.parameters.add(new ParameterNode(nullable(pp,"name"),pp.get("access").getAsInt()));}}
      }
      need(declaredFields.equals(new HashSet<>(c.fields.stream().map(f->f.name+f.desc).toList())),"Unlisted fresh field: "+owner);
      for(Iterator<MethodNode> it=c.methods.iterator();it.hasNext();){MethodNode m=it.next();if(!declaredMethods.contains(m.name+m.desc)&&implicitDefaultConstructor(c,m)){it.remove();JsonObject extra=new JsonObject();extra.addProperty("owner",owner);extra.addProperty("method",m.name+m.desc);extra.addProperty("role","implicit_javac_default_constructor_removed");implicitConstructors.add(extra);}}
      for(MethodNode m:c.methods)if(!declaredMethods.contains(m.name+m.desc)){
        // An explicit covariant Java forwarding method can accompany its
        // original erased bridge. Record this source-engineering difference;
        // it must forward directly and contain no handlers or side effects.
        var proof=forwarderTypeProof.prove(c,m,declaredMethods);
        need(proof.accepted(),"Unlisted or unproven forwarding method: "+owner+"."+m.name+m.desc+" : "+proof.reason());
        JsonObject extra=new JsonObject();extra.addProperty("owner",owner);extra.addProperty("method",m.name+m.desc);extra.addProperty("role","explicit_fresh_covariant_Java_forwarder");extra.addProperty("access",m.access);extra.addProperty("signature",m.signature);extra.add("forwarding_chain",new Gson().toJsonTree(proof.chain()));extras.add(extra);
      }
      ClassWriter writer=new ClassWriter(0);c.accept(writer);entries.put(owner+".class",writer.toByteArray());owners++;
    }
    try(var z=new ZipOutputStream(Files.newOutputStream(output,StandardOpenOption.CREATE_NEW))){for(var e:entries.entrySet()){var entry=new ZipEntry(e.getKey());entry.setTimeLocal(LocalDateTime.of(2000,1,1,0,0));z.putNextEntry(entry);z.write(e.getValue());z.closeEntry();}}
    JsonObject report=new JsonObject();report.add("enum_compiler_artifact_bindings",enumBindings);report.addProperty("owners",owners);report.addProperty("fields",fields);report.addProperty("methods",methods);report.addProperty("source_compile_access_projection_shipped",false);report.addProperty("old_implementation_inputs",0);report.addProperty("application_classes_loaded",0);report.add("extra_covariant_forwarders",extras);report.add("forwarder_type_proof",forwarderTypeProof.evidence());report.add("implicit_default_constructors_removed",implicitConstructors);Files.writeString(reportPath,new GsonBuilder().setPrettyPrinting().create().toJson(report));System.out.println(report);
  }
}
