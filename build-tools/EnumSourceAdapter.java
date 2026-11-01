import java.nio.file.*;

import java.util.*;

import java.util.zip.*;

import com.google.gson.*;

import org.objectweb.asm.*;

import org.objectweb.asm.tree.*;



/** Editable Java enum carrier -> natural JVM enum, using fresh javac code only.

 * Input ABI consists solely of tracked declaration JSON; no old class/Code/frame.

 */

public final class EnumSourceAdapter implements Opcodes {

  static final String SYMBOL="sourcebuild/EnumConstructor";

  static void need(boolean b,String m){if(!b)throw new IllegalArgumentException(m);}

  static String s(JsonObject o,String k){return o.get(k).getAsString();}

  // Match complete class-name tokens only: bare internal names, descriptors and
  // parameterized signatures. A longer sibling name is never a match.
  static String remap(String value,String from,String to){
    if(value==null)return null;if(value.equals(from))return to;
    return value.replace("L"+from+";","L"+to+";").replace("L"+from+"<","L"+to+"<");
  }
  static Object remapConstant(Object value,String from,String to,boolean asInterface){
    if(value instanceof Type type){String mapped=remap(type.getDescriptor(),from,to);return mapped.equals(type.getDescriptor())?value:Type.getType(mapped);}
    if(value instanceof Handle handle){
      boolean own=handle.getOwner().equals(from);String descriptor=remap(handle.getDesc(),from,to);int tag=handle.getTag();boolean itf=handle.isInterface();
      if(own&&asInterface){
        need(tag!=H_NEWINVOKESPECIAL&&!handle.getName().equals("<init>"),"carrier constructor Handle cannot target an interface");
        if(tag==H_INVOKEVIRTUAL)tag=H_INVOKEINTERFACE;
        if(tag>=H_INVOKEVIRTUAL)itf=true;
      }
      if(!own&&descriptor.equals(handle.getDesc()))return value;
      return new Handle(tag,own?to:handle.getOwner(),handle.getName(),descriptor,itf);
    }
    if(value instanceof ConstantDynamic constant){
      Handle bootstrap=(Handle)remapConstant(constant.getBootstrapMethod(),from,to,asInterface);Object[] arguments=new Object[constant.getBootstrapMethodArgumentCount()];boolean changed=bootstrap!=constant.getBootstrapMethod();
      String descriptor=remap(constant.getDescriptor(),from,to);changed|=!descriptor.equals(constant.getDescriptor());
      for(int i=0;i<arguments.length;i++){Object before=constant.getBootstrapMethodArgument(i);arguments[i]=remapConstant(before,from,to,asInterface);changed|=arguments[i]!=before;}
      return changed?new ConstantDynamic(constant.getName(),descriptor,bootstrap,arguments):value;
    }
    return value;
  }
  static void remapAnnotations(List<? extends AnnotationNode> annotations,String from,String to,boolean asInterface){
    if(annotations==null)return;for(var annotation:annotations){annotation.desc=remap(annotation.desc,from,to);if(annotation.values!=null)for(int i=1;i<annotation.values.size();i+=2)annotation.values.set(i,remapAnnotationValue(annotation.values.get(i),from,to,asInterface));}
  }
  static Object remapAnnotationValue(Object value,String from,String to,boolean asInterface){
    if(value instanceof AnnotationNode annotation){remapAnnotations(List.of(annotation),from,to,asInterface);return value;}
    if(value instanceof String[] enumeration)return new String[]{remap(enumeration[0],from,to),enumeration[1]};
    if(value instanceof List<?> list){List<Object> mapped=new ArrayList<>();for(var item:list)mapped.add(remapAnnotationValue(item,from,to,asInterface));return mapped;}
    return remapConstant(value,from,to,asInterface);
  }
  static void remapCarrier(ClassNode c,String from,String to,boolean asInterface){
    c.name=to;c.signature=remap(c.signature,from,to);c.outerClass=remap(c.outerClass,from,to);c.outerMethodDesc=remap(c.outerMethodDesc,from,to);c.nestHostClass=remap(c.nestHostClass,from,to);
    if(c.nestMembers!=null)c.nestMembers.replaceAll(n->remap(n,from,to));if(c.permittedSubclasses!=null)c.permittedSubclasses.replaceAll(n->remap(n,from,to));
    for(var inner:c.innerClasses){inner.name=remap(inner.name,from,to);inner.outerName=remap(inner.outerName,from,to);}
    remapAnnotations(c.visibleAnnotations,from,to,asInterface);remapAnnotations(c.invisibleAnnotations,from,to,asInterface);remapAnnotations(c.visibleTypeAnnotations,from,to,asInterface);remapAnnotations(c.invisibleTypeAnnotations,from,to,asInterface);
    for(var field:c.fields){field.desc=remap(field.desc,from,to);field.signature=remap(field.signature,from,to);field.value=remapConstant(field.value,from,to,asInterface);remapAnnotations(field.visibleAnnotations,from,to,asInterface);remapAnnotations(field.invisibleAnnotations,from,to,asInterface);remapAnnotations(field.visibleTypeAnnotations,from,to,asInterface);remapAnnotations(field.invisibleTypeAnnotations,from,to,asInterface);}
    for(var method:c.methods){
      method.desc=remap(method.desc,from,to);method.signature=remap(method.signature,from,to);method.exceptions.replaceAll(n->remap(n,from,to));method.annotationDefault=remapAnnotationValue(method.annotationDefault,from,to,asInterface);
      remapAnnotations(method.visibleAnnotations,from,to,asInterface);remapAnnotations(method.invisibleAnnotations,from,to,asInterface);remapAnnotations(method.visibleTypeAnnotations,from,to,asInterface);remapAnnotations(method.invisibleTypeAnnotations,from,to,asInterface);remapAnnotations(method.visibleLocalVariableAnnotations,from,to,asInterface);remapAnnotations(method.invisibleLocalVariableAnnotations,from,to,asInterface);
      if(method.visibleParameterAnnotations!=null)for(var annotations:method.visibleParameterAnnotations)remapAnnotations(annotations,from,to,asInterface);if(method.invisibleParameterAnnotations!=null)for(var annotations:method.invisibleParameterAnnotations)remapAnnotations(annotations,from,to,asInterface);
      if(method.localVariables!=null)for(var local:method.localVariables){local.desc=remap(local.desc,from,to);local.signature=remap(local.signature,from,to);}
      for(var handler:method.tryCatchBlocks){handler.type=remap(handler.type,from,to);remapAnnotations(handler.visibleTypeAnnotations,from,to,asInterface);remapAnnotations(handler.invisibleTypeAnnotations,from,to,asInterface);}
      for(AbstractInsnNode node:method.instructions){
        if(node instanceof FieldInsnNode field){field.owner=remap(field.owner,from,to);field.desc=remap(field.desc,from,to);}
        else if(node instanceof MethodInsnNode call){boolean own=call.owner.equals(from);if(own){need(!asInterface||!call.name.equals("<init>"),"carrier constructor call cannot target an interface");call.owner=to;if(asInterface){if(call.getOpcode()==INVOKEVIRTUAL)call.setOpcode(INVOKEINTERFACE);call.itf=true;}}call.desc=remap(call.desc,from,to);}
        else if(node instanceof TypeInsnNode type){need(!asInterface||type.getOpcode()!=NEW||!type.desc.equals(from),"carrier allocation cannot target an interface");type.desc=remap(type.desc,from,to);}
        else if(node instanceof MultiANewArrayInsnNode array)array.desc=remap(array.desc,from,to);
        else if(node instanceof LdcInsnNode literal)literal.cst=remapConstant(literal.cst,from,to,asInterface);
        else if(node instanceof InvokeDynamicInsnNode indy){indy.desc=remap(indy.desc,from,to);indy.bsm=(Handle)remapConstant(indy.bsm,from,to,asInterface);for(int i=0;i<indy.bsmArgs.length;i++)indy.bsmArgs[i]=remapConstant(indy.bsmArgs[i],from,to,asInterface);}
        else if(node instanceof FrameNode frame){if(frame.local!=null)for(int i=0;i<frame.local.size();i++)if(frame.local.get(i) instanceof String name)frame.local.set(i,remap(name,from,to));if(frame.stack!=null)for(int i=0;i<frame.stack.size();i++)if(frame.stack.get(i) instanceof String name)frame.stack.set(i,remap(name,from,to));}
        remapAnnotations(node.visibleTypeAnnotations,from,to,asInterface);remapAnnotations(node.invisibleTypeAnnotations,from,to,asInterface);
      }
    }
  }

  static void symbol(Path output)throws Exception{

    // A declaration-only intermediate superclass exposes the actual inherited

    // Enum API and generic bounds to javac. It is removed from runtime output.

    ClassWriter w=new ClassWriter(0);w.visit(V17,ACC_PUBLIC|ACC_ABSTRACT|ACC_SUPER,SYMBOL,"<E:Ljava/lang/Enum<TE;>;>Ljava/lang/Enum<TE;>;","java/lang/Enum",null);

    w.visitMethod(ACC_PROTECTED,"<init>","(Ljava/lang/String;I)V",null,null).visitEnd();w.visitEnd();

    try(ZipOutputStream z=new ZipOutputStream(Files.newOutputStream(output,StandardOpenOption.CREATE_NEW))){z.putNextEntry(new ZipEntry(SYMBOL+".class"));z.write(w.toByteArray());z.closeEntry();}

  }

  static int plannedForwarders;
  static final JsonArray removedConstantBootstraps=new JsonArray();
  // This deliberately supports only integer ConstantValue entries: these are
  // the encodings actually present in this locked enum plan. Unsupported
  // metadata forms remain failures rather than being coerced or guessed.
  static Integer integerConstant(JsonObject field){
    if(!s(field,"descriptor").equals("I")||(field.get("access").getAsInt()&(ACC_STATIC|ACC_FINAL))!=(ACC_STATIC|ACC_FINAL))return null;
    if(!field.has("attributes")||!field.get("attributes").isJsonObject())return null;
    JsonElement value=field.getAsJsonObject("attributes").get("ConstantValue");
    if(value==null||!value.isJsonPrimitive()||!value.getAsJsonPrimitive().isNumber())return null;
    try{return value.getAsBigDecimal().toBigIntegerExact().intValueExact();}catch(ArithmeticException ex){return null;}
  }
  static Integer integerPush(AbstractInsnNode node){
    int op=node.getOpcode();if(op>=ICONST_M1&&op<=ICONST_5)return op-ICONST_0;
    if(node instanceof IntInsnNode value&&(op==BIPUSH||op==SIPUSH))return value.operand;
    if(node instanceof LdcInsnNode value&&value.cst instanceof Integer number)return number;
    return null;
  }
  static boolean constantBootstrap(ClassNode c,MethodNode extra,JsonObject meta,Set<MethodNode> bound){
    if(!extra.name.equals("<clinit>")||!extra.desc.equals("()V")||extra.access!=ACC_STATIC||!extra.tryCatchBlocks.isEmpty()||c.methods.stream().filter(m->m.name.equals("<clinit>")).count()!=1)return false;
    // An original initializer must already be bound to its explicit source
    // method; no unknown initializer is merged with or substituted for it.
    if(meta.getAsJsonArray("methods").asList().stream().map(JsonElement::getAsJsonObject).filter(m->s(m,"name").equals("<clinit>")&&s(m,"descriptor").equals("()V")).count()!=1||bound.stream().filter(m->m.name.equals("initialize")&&m.desc.equals("()V")&&(m.access&(ACC_STATIC|ACC_NATIVE|ACC_ABSTRACT))==ACC_STATIC&&m.instructions.size()>0).count()!=1)return false;
    Map<String,Integer> required=new LinkedHashMap<>();
    for(var item:meta.getAsJsonArray("fields")){
      JsonObject field=item.getAsJsonObject();Integer constant=integerConstant(field);if(constant==null)continue;
      String key=s(field,"name")+s(field,"descriptor");var matches=c.fields.stream().filter(f->f.name.equals(s(field,"name"))&&f.desc.equals(s(field,"descriptor"))).toList();
      if(matches.size()!=1||(matches.get(0).access&ACC_STATIC)==0)return false;
      Object freshValue=matches.get(0).value;
      if(freshValue==null){if(required.putIfAbsent(key,constant)!=null)return false;}
      else if(!(freshValue instanceof Integer number)||!number.equals(constant))return false;
    }
    if(required.isEmpty())return false;
    List<AbstractInsnNode> ops=Arrays.stream(extra.instructions.toArray()).filter(n->n.getOpcode()>=0).toList();
    if(ops.size()!=required.size()*2+1||ops.get(ops.size()-1).getOpcode()!=RETURN)return false;
    Set<String> seen=new HashSet<>();JsonArray proofs=new JsonArray();
    for(int i=0;i<ops.size()-1;i+=2){
      Integer constant=integerPush(ops.get(i));
      if(constant==null||!(ops.get(i+1) instanceof FieldInsnNode write)||write.getOpcode()!=PUTSTATIC||!write.owner.equals(c.name))return false;
      String key=write.name+write.desc;
      if(!required.containsKey(key)||!required.get(key).equals(constant)||!seen.add(key))return false;
      JsonObject proof=new JsonObject();proof.addProperty("field",key);proof.addProperty("ConstantValue",constant);proof.addProperty("push_opcode",ops.get(i).getOpcode());proofs.add(proof);
    }
    if(!seen.equals(required.keySet()))return false;
    JsonObject proof=new JsonObject();proof.addProperty("owner",c.name);proof.addProperty("removed_method","<clinit>()V");proof.addProperty("preserved_source_initializer","initialize()V");proof.addProperty("rule","exact_original_static_final_I_ConstantValue_assignment_only");proof.add("fields",proofs);removedConstantBootstraps.add(proof);return true;
  }
  static MethodInsnNode pureForwardCall(ClassNode owner,MethodNode m){
    if((m.access&(ACC_STATIC|ACC_NATIVE|ACC_ABSTRACT|ACC_SYNCHRONIZED))!=0||!m.tryCatchBlocks.isEmpty())return null;
    List<AbstractInsnNode> ops=Arrays.stream(m.instructions.toArray()).filter(n->n.getOpcode()>=0).toList();
    if(ops.isEmpty()||ops.stream().filter(n->n instanceof MethodInsnNode).count()!=1)return null;
    if(!ops.stream().allMatch(n->n instanceof VarInsnNode v&&v.getOpcode()>=ILOAD&&v.getOpcode()<=ALOAD||n instanceof TypeInsnNode t&&t.getOpcode()==CHECKCAST||n instanceof MethodInsnNode||n.getOpcode()>=IRETURN&&n.getOpcode()<=RETURN))return null;
    MethodInsnNode call=(MethodInsnNode)ops.stream().filter(n->n instanceof MethodInsnNode).findFirst().orElseThrow();
    if(call.getOpcode()!=INVOKEVIRTUAL||!call.owner.equals(owner.name)||call.itf)return null;
    // Verify ordered receiver/argument loads, preserving physical this and each
    // declared parameter exactly once. No stores, branches or side effects.
    List<VarInsnNode> loads=ops.stream().filter(n->n instanceof VarInsnNode).map(n->(VarInsnNode)n).toList();
    Type[] args=Type.getArgumentTypes(m.desc);if(loads.size()!=args.length+1||loads.get(0).getOpcode()!=ALOAD||loads.get(0).var!=0)return null;
    int slot=1;for(int i=0;i<args.length;i++){if(loads.get(i+1).var!=slot||loads.get(i+1).getOpcode()!=args[i].getOpcode(ILOAD))return null;slot+=args[i].getSize();}
    if(Type.getArgumentTypes(call.desc).length!=args.length||ops.get(ops.size()-1).getOpcode()!=Type.getReturnType(m.desc).getOpcode(IRETURN))return null;
    if(ops.indexOf(call)<ops.indexOf(loads.get(loads.size()-1))||ops.subList(0,ops.size()-1).stream().anyMatch(n->n.getOpcode()>=IRETURN&&n.getOpcode()<=RETURN))return null;
    return call;
  }
  static boolean plannedForwarder(ClassNode c,MethodNode extra,JsonObject alias,Set<MethodNode> bound,List<MethodNode> extras){
    String target=s(alias,"target_name"),desc=s(alias,"descriptor"),source=s(alias,"source_name");
    if(!extra.name.equals(target)||!alias.has("allow_replace_javac_bridge")||!alias.get("allow_replace_javac_bridge").getAsBoolean()||!alias.has("allow_replace_source_forwarder")||!alias.get("allow_replace_source_forwarder").getAsBoolean())return false;
    // The source plan must describe an original bridge body; arbitrary alias
    // rows do not authorize an extra method family.
    if(!alias.has("target_access")||(alias.get("target_access").getAsInt()&ACC_BRIDGE)==0)return false;
    if(extra.desc.equals(desc)&&(extra.access&(ACC_BRIDGE|ACC_SYNTHETIC))!=(ACC_BRIDGE|ACC_SYNTHETIC))return false;
    if(!extra.desc.equals(desc)){
      if(!alias.has("enum_source_forwarder_descriptors"))return false;
      boolean explicitlyListed=false;for(var item:alias.getAsJsonArray("enum_source_forwarder_descriptors"))if(item.getAsString().equals(extra.desc))explicitlyListed=true;
      if(!explicitlyListed)return false;
    }
    MethodNode current=extra;Set<MethodNode> seen=Collections.newSetFromMap(new IdentityHashMap<>());
    for(int depth=0;depth<2;depth++){
      if(!seen.add(current))return false;MethodInsnNode call=pureForwardCall(c,current);if(call==null)return false;
      if(call.name.equals(source)&&call.desc.equals(desc))return c.methods.stream().anyMatch(m->bound.contains(m)&&m.name.equals(source)&&m.desc.equals(desc));
      if(!call.name.equals(target))return false;var next=extras.stream().filter(m->m.name.equals(call.name)&&m.desc.equals(call.desc)).toList();if(next.size()!=1)return false;current=next.get(0);
    }
    return false;
  }

  static byte[] adapt(byte[] fresh,JsonObject meta,JsonObject abi){

    ClassNode c=new ClassNode();new ClassReader(fresh).accept(c,0);String owner=s(meta,"owner");

    boolean asInterface=(meta.get("access").getAsInt()&ACC_INTERFACE)!=0;

    String carrier=meta.has("source_carrier_owner")?s(meta,"source_carrier_owner"):owner;

    boolean enumSubclass=!asInterface&&!s(meta,"super").equals("java/lang/Enum");

    String sourceSuper=asInterface?"java/lang/Object":enumSubclass?s(meta,"super"):SYMBOL;

    need(c.name.equals(carrier)&&c.superName.equals(sourceSuper),"fresh owner/compiler structural superclass mismatch");

    if(!carrier.equals(owner)){

      c.methods.removeIf(m->m.name.startsWith("__sourceInterfaceCall_"));
      remapCarrier(c,carrier,owner,asInterface);
      c.interfaces=new ArrayList<>();for(var item:meta.getAsJsonArray("interfaces"))c.interfaces.add(item.getAsString());
    }

    need(asInterface||(meta.get("access").getAsInt()&ACC_ENUM)!=0,"metadata is not enum/interface");

    if(asInterface){

      Iterator<MethodNode> iterator=c.methods.iterator();

      while(iterator.hasNext()){

        MethodNode m=iterator.next();if(!m.name.equals("<init>"))continue;

        need(m.desc.equals("()V"),"interface compiler constructor is not default");

        List<AbstractInsnNode> nodes=new ArrayList<>();for(AbstractInsnNode i:m.instructions)if(i.getOpcode()>=0)nodes.add(i);

        need(nodes.size()==3&&nodes.get(0).getOpcode()==ALOAD&&((VarInsnNode)nodes.get(0)).var==0&&nodes.get(1) instanceof MethodInsnNode call&&call.getOpcode()==INVOKESPECIAL&&call.owner.equals("java/lang/Object")&&call.name.equals("<init>")&&call.desc.equals("()V")&&nodes.get(2).getOpcode()==RETURN,"interface compiler constructor has source effects");iterator.remove();

      }

    }

    need(c.fields.size()==meta.getAsJsonArray("fields").size(),"exact field coverage");

    for(JsonElement e:meta.getAsJsonArray("fields")){

      JsonObject f=e.getAsJsonObject();FieldNode target=c.fields.stream().filter(x->x.name.equals(s(f,"name"))&&x.desc.equals(s(f,"descriptor"))).findFirst().orElseThrow();target.access=f.get("access").getAsInt();

    }

    Map<String,JsonObject> aliases=new LinkedHashMap<>();
    if(abi!=null)for(var item:abi.getAsJsonArray("method_aliases")){
      JsonObject a=item.getAsJsonObject();need(s(a,"owner").equals(owner),"enum ABI owner mismatch");
      String key=s(a,"target_name")+s(a,"descriptor");
      need(aliases.putIfAbsent(key,a)==null,"duplicate enum target ABI alias");
      need(meta.getAsJsonArray("methods").asList().stream().anyMatch(e->s(e.getAsJsonObject(),"name").equals(s(a,"target_name"))&&s(e.getAsJsonObject(),"descriptor").equals(s(a,"descriptor"))),"enum ABI alias target absent from exact metadata");
      JsonObject original=meta.getAsJsonArray("methods").asList().stream().map(JsonElement::getAsJsonObject).filter(m->s(m,"name").equals(s(a,"target_name"))&&s(m,"descriptor").equals(s(a,"descriptor"))).findFirst().orElseThrow();
      need(a.has("target_access")&&a.get("target_access").getAsInt()==original.get("access").getAsInt(),"enum ABI access differs from original exact declaration");
      need(c.methods.stream().filter(m->m.name.equals(s(a,"source_name"))&&m.desc.equals(s(a,"descriptor"))).count()==1,"enum ABI source body missing/ambiguous");
    }
    Set<MethodNode> boundMethods=Collections.newSetFromMap(new IdentityHashMap<>());
    Set<MethodNode> helperMethods=Collections.newSetFromMap(new IdentityHashMap<>());
    for(MethodNode m:c.methods)if(m.name.startsWith("__sourceIntrinsic_")||m.name.startsWith("__sourceHandlerCall_")||m.name.startsWith("__sourceExactCall_")){
      need((m.access&(ACC_PRIVATE|ACC_STATIC|ACC_NATIVE))==(ACC_PRIVATE|ACC_STATIC|ACC_NATIVE),"structural compiler helper flags differ");helperMethods.add(m);
    }
    for(var item:meta.getAsJsonArray("methods")){
      JsonObject m=item.getAsJsonObject();String name=s(m,"name"),desc=s(m,"descriptor");JsonObject alias=aliases.get(name+desc);
      String sourceName=alias!=null?s(alias,"source_name"):name.equals("<clinit>")?"initialize":name;
      var matches=c.methods.stream().filter(x->x.name.equals(sourceName)&&x.desc.equals(desc)).toList();
      need(matches.size()==1&&boundMethods.add(matches.get(0)),"exact enum source method coverage differs: "+owner+"."+sourceName+desc);
    }
    List<MethodNode> extras=c.methods.stream().filter(m->!boundMethods.contains(m)&&!helperMethods.contains(m)).toList();
    Set<MethodNode> constantBootstraps=Collections.newSetFromMap(new IdentityHashMap<>());
    for(MethodNode extra:extras){
      boolean accepted=false;
      if(constantBootstrap(c,extra,meta,boundMethods)){accepted=true;constantBootstraps.add(extra);}
      for(JsonObject alias:aliases.values())if(plannedForwarder(c,extra,alias,boundMethods,extras)){
        accepted=true;plannedForwarders++;break;
      }
      need(accepted,"unplanned enum method or non-pure ABI forwarding extra: "+owner+"."+extra.name+extra.desc);
    }
    need(boundMethods.size()==meta.getAsJsonArray("methods").size()&&c.methods.size()==boundMethods.size()+helperMethods.size()+extras.size(),"exact method coverage plus planned ABI forwarders and compile helpers");
    // ConstantValue attributes are restored by SourceDeclarationAdapter from
    // the separately locked runtime declarations after all lowering passes.
    c.methods.removeAll(constantBootstraps);

    int initialized=0,supercalls=0;

    for(JsonElement e:meta.getAsJsonArray("methods")){

      JsonObject m=e.getAsJsonObject();String name=s(m,"name"),desc=s(m,"descriptor");JsonObject sourceAlias=aliases.get(name+desc);String sourceName=sourceAlias!=null?s(sourceAlias,"source_name"):name.equals("<clinit>")?"initialize":name;

      MethodNode body=c.methods.stream().filter(x->x.name.equals(sourceName)&&x.desc.equals(desc)).findFirst().orElseThrow();

      need(body.instructions.size()>0||(m.get("access").getAsInt()&(ACC_ABSTRACT|ACC_NATIVE))!=0,"missing fresh structural method");

      for(AbstractInsnNode node:body.instructions){

        if(node instanceof MethodInsnNode call && call.owner.equals(SYMBOL)){

          need(name.equals("<init>")&&call.getOpcode()==INVOKESPECIAL&&call.name.equals("<init>")&&call.desc.equals("(Ljava/lang/String;I)V"),"compiler symbol invocation mismatch");call.owner="java/lang/Enum";supercalls++;

        }

      }

      body.name=sourceAlias!=null?sourceName:name;body.access=m.get("access").getAsInt();

      body.signature=m.has("attributes")&&m.get("attributes").isJsonObject()&&m.getAsJsonObject("attributes").has("Signature")?s(m.getAsJsonObject("attributes"),"Signature"):null;

      if(name.equals("<clinit>")){need(desc.equals("()V"),"initializer descriptor");initialized++;}

      body.exceptions=new ArrayList<>();for(JsonElement ex:m.getAsJsonArray("exceptions"))body.exceptions.add(ex.getAsString());

    }

    long expectedInitializers=java.util.stream.StreamSupport.stream(meta.getAsJsonArray("methods").spliterator(),false).filter(e->s(e.getAsJsonObject(),"name").equals("<clinit>")).count();

    need(initialized==expectedInitializers && (asInterface||enumSubclass?supercalls==0:supercalls>=1),"exact initializer and structural super calls required");

    c.superName=asInterface?"java/lang/Object":enumSubclass?s(meta,"super"):"java/lang/Enum";c.access=meta.get("access").getAsInt();

    c.signature=meta.has("attributes")&&meta.get("attributes").isJsonObject()&&meta.getAsJsonObject("attributes").has("Signature")?s(meta.getAsJsonObject("attributes"),"Signature"):null;

    // Control-flow topology is unchanged; existing source frames refer to owner

    // after ctor super, and require only the superclass edge substitution.

    ClassWriter w=new ClassWriter(ClassWriter.COMPUTE_MAXS);c.accept(w);byte[] bytes=w.toByteArray();

    ClassNode check=new ClassNode();new ClassReader(bytes).accept(check,0);

    for(MethodNode m:check.methods)for(AbstractInsnNode i:m.instructions)if(i instanceof MethodInsnNode call)need(!call.owner.equals(SYMBOL),"compiler symbol call remains");

    return bytes;

  }

  public static void main(String[]args)throws Exception{

    if(args.length==2&&args[0].equals("--validate-final")){

      try(ZipFile z=new ZipFile(args[1])){for(ZipEntry e:Collections.list(z.entries()))if(e.getName().endsWith(".class")){

        need(!e.getName().equals(SYMBOL+".class"),"compile-only enum symbol shipped");ClassNode c=new ClassNode();new ClassReader(z.getInputStream(e).readAllBytes()).accept(c,ClassReader.SKIP_DEBUG|ClassReader.SKIP_FRAMES);

        need(!SYMBOL.equals(c.superName),"unadapted enum carrier shipped: "+c.name);

        for(MethodNode m:c.methods)for(AbstractInsnNode n:m.instructions)if(n instanceof MethodInsnNode call)need(!call.owner.equals(SYMBOL),"compile-only enum symbol call shipped");

      }}System.out.println("{\"enum_compiler_symbols\":0}");return;

    }

    if(args.length==2&&args[0].equals("symbol")){symbol(Path.of(args[1]));return;}

    if(args.length!=4&&args.length!=5)throw new IllegalArgumentException("EnumSourceAdapter fresh.jar ENUM_PLAN.json output.jar REPORT.json [ABI_ALIAS_PLAN.json] | symbol compile-only-symbol.jar");

    need(!Files.exists(Path.of(args[2]))&&!Files.exists(Path.of(args[3])),"enum outputs must be new");

    JsonArray plan=JsonParser.parseString(Files.readString(Path.of(args[1]))).getAsJsonArray();Map<String,JsonObject> metas=new LinkedHashMap<>();

    Map<String,JsonObject> abiByOwner=new LinkedHashMap<>();if(args.length==5)for(var item:JsonParser.parseString(Files.readString(Path.of(args[4]))).getAsJsonArray()){JsonObject row=item.getAsJsonObject();need(abiByOwner.putIfAbsent(s(row,"owner"),row)==null,"duplicate ABI owner row");}
    Set<String> shadowInterfaces=new HashSet<>();

    for(JsonElement e:plan){JsonObject m=e.getAsJsonObject();String key=m.has("source_carrier_owner")?s(m,"source_carrier_owner"):s(m,"owner");need(metas.put(key+".class",m)==null,"duplicate owner");if(m.has("source_carrier_owner"))shadowInterfaces.add(s(m,"owner")+".class");}

    Set<String> seen=new HashSet<>();int fields=0,methods=0;

    try(ZipFile input=new ZipFile(args[0]);ZipOutputStream output=new ZipOutputStream(Files.newOutputStream(Path.of(args[2]),StandardOpenOption.CREATE_NEW))){

      for(ZipEntry entry:Collections.list(input.entries())){

        if(entry.getName().equals(SYMBOL+".class"))continue;

        if(shadowInterfaces.contains(entry.getName()))continue;

        byte[] bytes=input.getInputStream(entry).readAllBytes();JsonObject meta=metas.get(entry.getName());

        if(meta!=null){bytes=adapt(bytes,meta,abiByOwner.get(s(meta,"owner")));seen.add(entry.getName());fields+=meta.getAsJsonArray("fields").size();methods+=meta.getAsJsonArray("methods").size();}

        ZipEntry out=new ZipEntry(meta!=null?s(meta,"owner")+".class":entry.getName());out.setTime(0);output.putNextEntry(out);output.write(bytes);output.closeEntry();

      }

    }

    need(seen.equals(metas.keySet()),"fresh enum owner missing");

    JsonObject r=new JsonObject();r.addProperty("enum_owners",seen.size());r.addProperty("planned_ABI_forwarders_retained",plannedForwarders);r.addProperty("fields",fields);r.addProperty("methods",methods);r.add("removed_exact_ConstantValue_bootstraps",removedConstantBootstraps);r.addProperty("old_Code_frame_inputs",0);r.addProperty("application_classes_loaded",0);Files.writeString(Path.of(args[3]),new GsonBuilder().setPrettyPrinting().create().toJson(r));System.out.println(r);

  }

}

