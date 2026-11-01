import com.google.gson.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;
import java.util.*;
import java.util.zip.*;
import java.time.LocalDateTime;
import java.io.*;
import java.security.MessageDigest;
import java.util.regex.Pattern;

/** Compiles tracked source intrinsics to JVM operations in newly compiled classes.
 * Reads only the supplied fresh class directory and declarative JSON binding plan.
 * Does not load/initialize an application class or read an old implementation.
 */
public final class SourceIntrinsicAdapter {
  static String str(JsonObject o,String k) { return o.get(k).getAsString(); }
  static String sha(Path p)throws Exception{return HexFormat.of().withUpperCase().formatHex(MessageDigest.getInstance("SHA-256").digest(Files.readAllBytes(p)));}
  static Map<String,Set<String>> handlerBackedIntrinsicSites(Path methodPlan,Path handlerReceipt,JsonArray intrinsicPlan)throws Exception{
    JsonArray planned=JsonParser.parseString(Files.readString(methodPlan)).getAsJsonArray();JsonObject receipt=JsonParser.parseString(Files.readString(handlerReceipt)).getAsJsonObject();JsonArray completed=receipt.getAsJsonArray("rows");if(planned.size()!=completed.size()||receipt.get("methods").getAsInt()!=planned.size())throw new IllegalArgumentException("handler receipt/plan complete row count mismatch");Map<String,JsonObject> done=new HashMap<>();
    for(var item:completed){JsonObject row=item.getAsJsonObject();String key=str(row,"owner")+"."+str(row,"method");if(done.put(key,row)!=null)throw new IllegalArgumentException("duplicate completed handler ABI method");}
    Map<String,Set<String>> result=new HashMap<>();Pattern encoded=Pattern.compile("^__sourceIntrinsic_[0-9a-fA-F]+(_[A-Za-z]+[0-9]+_[0-9]+)$");
    for(var item:planned){JsonObject row=item.getAsJsonObject(),target=row.getAsJsonObject("target");String owner=str(row,"owner"),method=owner+"."+str(target,"name")+str(target,"descriptor");JsonObject completedRow=done.get(method);if(completedRow==null||!str(completedRow,"recipe_sha256").equalsIgnoreCase(str(row,"recipe_sha256"))||!str(completedRow,"recipe_path").equals(str(row,"recipe_path")))throw new IllegalArgumentException("completed handler method/recipe receipt mismatch: "+method);Path rel=Path.of(str(row,"recipe_path"));if(rel.isAbsolute())throw new IllegalArgumentException("handler operation recipe must be portable relative path");Path recipePath=methodPlan.toAbsolutePath().normalize().getParent().resolve(rel).normalize();if(!recipePath.startsWith(methodPlan.toAbsolutePath().normalize().getParent()))throw new IllegalArgumentException("handler recipe escapes plan directory");if(!sha(recipePath).equalsIgnoreCase(str(row,"recipe_sha256")))throw new IllegalArgumentException("saved handler source recipe SHA mismatch");JsonObject recipe=JsonParser.parseString(Files.readString(recipePath)).getAsJsonObject();if(!recipe.has("bindings"))continue;
      for(var bindingElement:recipe.getAsJsonArray("bindings")){JsonObject binding=bindingElement.getAsJsonObject();String handlerAlias=str(binding,"name");String aliasSuffix=handlerAlias.startsWith("__")?handlerAlias.substring(1):"!";JsonObject operation=binding.getAsJsonObject("operation");for(var ownerPlanElement:intrinsicPlan){JsonObject ownerPlan=ownerPlanElement.getAsJsonObject();if(!str(ownerPlan,"owner").equals(owner))continue;for(var intrinsicElement:ownerPlan.getAsJsonArray("intrinsics")){JsonObject intrinsic=intrinsicElement.getAsJsonObject();var match=encoded.matcher(str(intrinsic,"name"));if(!match.matches()||!match.group(1).equals(aliasSuffix)||!str(intrinsic,"query_descriptor").equals(str(binding,"query_descriptor"))||!operation.equals(intrinsic.getAsJsonObject("operation")))continue;result.computeIfAbsent(owner,k->new HashSet<>()).add(str(intrinsic,"name")+str(intrinsic,"query_descriptor"));}}
      }
    }
    return result;
  }
  static Object constant(JsonElement value) {
    if (!value.isJsonArray()) {
      if (value.isJsonPrimitive() && value.getAsJsonPrimitive().isString()) return value.getAsString();
      throw new IllegalArgumentException("Untyped bootstrap constant: "+value);
    }
    JsonArray a=value.getAsJsonArray();String tag=a.get(0).getAsString();
    switch(tag) {
      case "handle": return new Handle(a.get(1).getAsInt(),a.get(2).getAsString(),a.get(3).getAsString(),a.get(4).getAsString(),a.get(5).getAsBoolean());
      case "type": return Type.getType(a.get(1).getAsString());
      case "String": case "string": return a.get(1).getAsString();
      case "Integer": case "Int": return a.get(1).getAsInt();
      case "Long": return a.get(1).getAsLong();
      case "Float": return a.get(1).getAsFloat();
      case "Double": return a.get(1).getAsDouble();
      case "float_bits": return Float.intBitsToFloat(a.get(1).getAsInt());
      case "double_bits": return Double.longBitsToDouble(a.get(1).getAsLong());
      default: throw new IllegalArgumentException("Unsupported typed bootstrap constant "+tag);
    }
  }
  static boolean reference(Type t) { return t.getSort()==Type.OBJECT || t.getSort()==Type.ARRAY; }
  static void adapt(InsnList code,Type from,Type to) {
    if (from.equals(to))return;
    if (reference(from) && reference(to)) { code.add(new TypeInsnNode(Opcodes.CHECKCAST,to.getInternalName()));return; }
    if (from.getSort()>=Type.BOOLEAN && from.getSort()<=Type.INT && to.getSort()>=Type.BOOLEAN && to.getSort()<=Type.INT)return;
    throw new IllegalArgumentException("Incompatible intrinsic argument/result "+from+" -> "+to);
  }
  static InsnList lower(MethodNode method,JsonObject binding,String caller) {
    JsonObject op=binding.getAsJsonObject("operation");int opcode=op.get("opcode").getAsInt();
    String qd=str(binding,"query_descriptor");Type[] queryArgs=Type.getArgumentTypes(qd);InsnList code=new InsnList();
    if(str(binding,"kind").equals("integer_category_identity")){
      Type result=Type.getReturnType(qd);
      if(queryArgs.length!=1 || queryArgs[0].getSort()<Type.BOOLEAN || queryArgs[0].getSort()>Type.INT || result.getSort()<Type.BOOLEAN || result.getSort()>Type.INT)
        throw new IllegalArgumentException("Integer-category identity requires one JVM int-category value and result");
      // Java distinguishes boolean from int; the JVM verifier uses the same
      // integer category for both. Preserve the original stack value exactly.
      return code;
    }
    if(opcode==Opcodes.GETFIELD || opcode==Opcodes.GETSTATIC){
      boolean instance=opcode==Opcodes.GETFIELD;
      if(queryArgs.length!=(instance?1:0))throw new IllegalArgumentException("Exact field read query shape mismatch");
      if(instance){
        Type receiver=Type.getObjectType(str(op,"owner"));
        if(!reference(queryArgs[0]))throw new IllegalArgumentException("Field receiver is not a reference");
        adapt(code,queryArgs[0],receiver);
      }
      code.add(new FieldInsnNode(opcode,str(op,"owner"),str(op,"name"),str(op,"descriptor")));
      adapt(code,Type.getType(str(op,"descriptor")),Type.getReturnType(qd));return code;
    }
    if(opcode==Opcodes.MONITORENTER||opcode==Opcodes.MONITOREXIT){
      if(queryArgs.length!=1||!reference(queryArgs[0])||Type.getReturnType(qd)!=Type.VOID_TYPE)throw new IllegalArgumentException("Monitor intrinsic stack shape mismatch");
      code.add(new InsnNode(opcode));return code;
    }
    if(opcode==Opcodes.MULTIANEWARRAY){
      String descriptor=op.has("descriptor")?str(op,"descriptor"):str(op,"type");
      int dimensions=op.has("dimensions")?op.get("dimensions").getAsInt():op.has("dims")?op.get("dims").getAsInt():queryArgs.length;
      if(dimensions!=queryArgs.length||dimensions<1||!descriptor.startsWith("["))throw new IllegalArgumentException("Multianewarray intrinsic stack shape mismatch");
      for(Type t:queryArgs)if(t!=Type.INT_TYPE)throw new IllegalArgumentException("Multianewarray dimension is not int");
      code.add(new MultiANewArrayInsnNode(descriptor,dimensions));adapt(code,Type.getType(descriptor),Type.getReturnType(qd));return code;
    }
    if(opcode==Opcodes.INVOKESPECIAL || opcode==Opcodes.INVOKEVIRTUAL || opcode==Opcodes.INVOKEINTERFACE || opcode==Opcodes.INVOKESTATIC){
      if(str(op,"name").equals("<init>"))throw new IllegalArgumentException("Constructor intrinsic requires dedicated constructor adapter");
      String descriptor=str(op,"descriptor");Type[] realArgs=Type.getArgumentTypes(descriptor);
      boolean staticCall=opcode==Opcodes.INVOKESTATIC;int receiver=staticCall?0:1;
      if(queryArgs.length!=realArgs.length+receiver||!staticCall&&!reference(queryArgs[0]))throw new IllegalArgumentException("Exact invocation query shape mismatch");
      int[] slots=new int[queryArgs.length];int next=method.maxLocals;
      for(int i=0;i<queryArgs.length;i++){slots[i]=next;next+=queryArgs[i].getSize();}method.maxLocals=next;
      for(int i=queryArgs.length-1;i>=0;i--)code.add(new VarInsnNode(queryArgs[i].getOpcode(Opcodes.ISTORE),slots[i]));
      if(!staticCall)code.add(new VarInsnNode(Opcodes.ALOAD,slots[0]));
      // Restore the caller nominal type when a compiler query erased it. Casting
      // to the superclass instead can make legal invokespecial unverifiable.
      if(!staticCall){String nominal=opcode==Opcodes.INVOKESPECIAL?caller:str(op,"owner");if(!queryArgs[0].equals(Type.getObjectType(nominal)))code.add(new TypeInsnNode(Opcodes.CHECKCAST,nominal));}
      for(int i=receiver;i<queryArgs.length;i++){code.add(new VarInsnNode(queryArgs[i].getOpcode(Opcodes.ILOAD),slots[i]));adapt(code,queryArgs[i],realArgs[i-receiver]);}
      code.add(new MethodInsnNode(opcode,str(op,"owner"),str(op,"name"),descriptor,op.has("interface")&&op.get("interface").getAsBoolean()));
      adapt(code,Type.getReturnType(descriptor),Type.getReturnType(qd));return code;
    }
    if (opcode==Opcodes.INVOKEDYNAMIC) {
      String descriptor=str(op,"descriptor");Type[] realArgs=Type.getArgumentTypes(descriptor);
      if (realArgs.length!=queryArgs.length)throw new IllegalArgumentException("Indy argument count differs");
      int[] slots=new int[queryArgs.length];int next=method.maxLocals;
      for(int i=0;i<queryArgs.length;i++){slots[i]=next;next+=queryArgs[i].getSize();}
      method.maxLocals=next;
      for(int i=queryArgs.length-1;i>=0;i--)code.add(new VarInsnNode(queryArgs[i].getOpcode(Opcodes.ISTORE),slots[i]));
      for(int i=0;i<queryArgs.length;i++){
        code.add(new VarInsnNode(queryArgs[i].getOpcode(Opcodes.ILOAD),slots[i]));adapt(code,queryArgs[i],realArgs[i]);
      }
      JsonElement bootstrap=op.has("bootstrap")?op.get("bootstrap"):op.get("bootstrap_handle");
      if(bootstrap==null)throw new IllegalArgumentException("Missing indy bootstrap handle");
      JsonArray ba=op.has("bootstrap_arguments")?op.getAsJsonArray("bootstrap_arguments"):new JsonArray();Object[] arguments=new Object[ba.size()];
      for(int i=0;i<arguments.length;i++)arguments[i]=constant(ba.get(i));
      code.add(new InvokeDynamicInsnNode(str(op,"name"),descriptor,(Handle)constant(bootstrap),arguments));
      adapt(code,Type.getReturnType(descriptor),Type.getReturnType(qd));return code;
    }
    if(opcode==Opcodes.LDC && op.has("constant")) {
      if(queryArgs.length!=0)throw new IllegalArgumentException("LDC intrinsic takes arguments");
      code.add(new LdcInsnNode(constant(op.get("constant"))));return code;
    }
    throw new IllegalArgumentException("Unsupported portable intrinsic kind="+str(binding,"kind")+" opcode="+opcode);
  }
  static final String CARRIER="recovery/source/CarrierOps";
  static final Set<String> CARRIER_DISCARDS=Set.of("(Z)V","(B)V","(C)V","(S)V","(I)V","(J)V","(F)V","(D)V","(Ljava/lang/Object;)V");
  static final String CARRIER_STORE="([Ljava/lang/Object;ILjava/lang/Object;)[Ljava/lang/Object;";
  static Object op(int opcode){return List.of(opcode);}
  static Object var(int opcode,int slot){return List.of(opcode,slot);}
  static Object jump(int opcode,int target){return List.of(opcode,target);}
  static List<Object> helperGraph(MethodNode method){
    List<Object> graph=new ArrayList<>();
    for(var node:method.instructions)if(node.getOpcode()>=0){
      if(node instanceof VarInsnNode local)graph.add(var(local.getOpcode(),local.var));
      else if(node instanceof JumpInsnNode branch){int ordinal=0;for(var item:method.instructions){if(item==branch.label)break;if(item.getOpcode()>=0)ordinal++;}graph.add(jump(branch.getOpcode(),ordinal));}
      else if(node instanceof MethodInsnNode call)graph.add(List.of(call.getOpcode(),call.owner,call.name,call.desc,call.itf));
      else if(node instanceof InsnNode)graph.add(op(node.getOpcode()));
      else throw new IllegalArgumentException("Unknown executable CarrierOps declaration instruction");
    }return graph;
  }
  static List<Object> comparisonGraph(int load,int width,int compare,boolean greater){
    int equalCompare=compare==Opcodes.FCMPG?Opcodes.FCMPL:compare==Opcodes.DCMPG?Opcodes.DCMPL:compare;
    return List.of(var(load,0),var(load,width),op(compare),jump(greater?Opcodes.IFGE:Opcodes.IFLE,6),op(greater?Opcodes.ICONST_M1:Opcodes.ICONST_1),jump(Opcodes.GOTO,13),var(load,0),var(load,width),op(equalCompare),jump(Opcodes.IFNE,12),op(Opcodes.ICONST_0),jump(Opcodes.GOTO,13),op(greater?Opcodes.ICONST_1:Opcodes.ICONST_M1),op(Opcodes.IRETURN));
  }
  static int comparisonOpcode(String name,String descriptor){
    return switch(name+descriptor){case "lcmp(JJ)I"->Opcodes.LCMP;case "fcmpl(FF)I"->Opcodes.FCMPL;case "fcmpg(FF)I"->Opcodes.FCMPG;case "dcmpl(DD)I"->Opcodes.DCMPL;case "dcmpg(DD)I"->Opcodes.DCMPG;default->-1;};
  }
  static void validateCarrierDeclaration(byte[] bytes){
    ClassNode helper=new ClassNode();new ClassReader(bytes).accept(helper,0);
    if(!helper.name.equals(CARRIER)||helper.access!=(Opcodes.ACC_PUBLIC|Opcodes.ACC_FINAL|Opcodes.ACC_SUPER)||!helper.superName.equals("java/lang/Object")||!helper.interfaces.isEmpty()||!helper.fields.isEmpty()||helper.methods.size()!=16)throw new IllegalArgumentException("CarrierOps compiler declaration shape differs");
    Set<String> keys=new HashSet<>();
    for(var method:helper.methods){
      String key=method.name+method.desc;if(!keys.add(key)||!method.tryCatchBlocks.isEmpty()||method.exceptions!=null&&!method.exceptions.isEmpty())throw new IllegalArgumentException("CarrierOps executable declarations differ");
      List<Object> expected;int compare=comparisonOpcode(method.name,method.desc);
      if(key.equals("<init>()V")){if(method.access!=Opcodes.ACC_PRIVATE)throw new IllegalArgumentException("CarrierOps constructor flags differ");expected=List.of(var(Opcodes.ALOAD,0),List.of(Opcodes.INVOKESPECIAL,"java/lang/Object","<init>","()V",false),op(Opcodes.RETURN));}
      else{
        if(method.access!=(Opcodes.ACC_PUBLIC|Opcodes.ACC_STATIC))throw new IllegalArgumentException("CarrierOps method flags differ");
        if(compare>=0){Type type=Type.getArgumentTypes(method.desc)[0];expected=comparisonGraph(type.getOpcode(Opcodes.ILOAD),type.getSize(),compare,method.name.endsWith("g"));}
        else if(method.name.equals("discard")&&CARRIER_DISCARDS.contains(method.desc))expected=List.of(op(Opcodes.RETURN));
        else if(method.name.equals("store")&&method.desc.equals(CARRIER_STORE))expected=List.of(var(Opcodes.ALOAD,0),var(Opcodes.ILOAD,1),var(Opcodes.ALOAD,2),op(Opcodes.AASTORE),var(Opcodes.ALOAD,0),op(Opcodes.ARETURN));
        else throw new IllegalArgumentException("Unknown executable CarrierOps method: "+key);
      }
      if(!helperGraph(method).equals(expected))throw new IllegalArgumentException("CarrierOps executable helper was edited: "+key);
    }
  }
  static InsnList lowerCarrier(MethodNode method,MethodInsnNode call){
    if(call.getOpcode()!=Opcodes.INVOKESTATIC||call.itf)throw new IllegalArgumentException("CarrierOps must be an exact static compiler call");
    InsnList code=new InsnList();int compare=comparisonOpcode(call.name,call.desc);
    if(compare>=0){code.add(new InsnNode(compare));return code;}
    if(call.name.equals("discard")&&CARRIER_DISCARDS.contains(call.desc)){code.add(new InsnNode(Type.getArgumentTypes(call.desc)[0].getSize()==2?Opcodes.POP2:Opcodes.POP));return code;}
    if(call.name.equals("store")&&call.desc.equals(CARRIER_STORE)){
      // Arguments have already been evaluated left-to-right. Keep those exact
      // values, perform AASTORE once and leave the original array as the result.
      int array=method.maxLocals,index=array+1,value=array+2;method.maxLocals+=3;
      code.add(new VarInsnNode(Opcodes.ASTORE,value));code.add(new VarInsnNode(Opcodes.ISTORE,index));code.add(new VarInsnNode(Opcodes.ASTORE,array));
      code.add(new VarInsnNode(Opcodes.ALOAD,array));code.add(new VarInsnNode(Opcodes.ILOAD,index));code.add(new VarInsnNode(Opcodes.ALOAD,value));code.add(new InsnNode(Opcodes.AASTORE));code.add(new VarInsnNode(Opcodes.ALOAD,array));return code;
    }
    throw new IllegalArgumentException("Unknown CarrierOps compiler call: "+call.name+call.desc);
  }
  static long carrierSites,carrierOwners,carrierClassesRemoved;
  static void noCarrierReferences(Map<String,byte[]> entries){
    for(var entry:entries.entrySet())if(entry.getKey().endsWith(".class")){
      if(entry.getKey().equals(CARRIER+".class")||entry.getKey().startsWith(CARRIER+"$"))throw new IllegalArgumentException("Compiler CarrierOps class remains");
      // ASM fresh-writes every changed class: stale constant-pool entries do
      // not survive. Reject all remaining linkage or reflective references,
      // including Handles, recursive Condy, descriptors, Frame and metadata.
      String constants=new String(entry.getValue(),java.nio.charset.StandardCharsets.ISO_8859_1);
      if(constants.contains(CARRIER)||constants.contains(CARRIER.replace('/','.')))throw new IllegalArgumentException("Residual CarrierOps reference: "+entry.getKey());
    }
  }
  static void lowerCarrierGlobally(Map<String,byte[]> entries){
    byte[] helper=entries.get(CARRIER+".class");if(helper!=null)validateCarrierDeclaration(helper);
    for(var entry:new ArrayList<>(entries.entrySet()))if(entry.getKey().endsWith(".class")&&!entry.getKey().equals(CARRIER+".class")){
      ClassNode c=new ClassNode();new ClassReader(entry.getValue()).accept(c,0);if(!entry.getKey().equals(c.name+".class"))throw new IllegalArgumentException("Global compiler helper class identity mismatch");int changed=0;
      for(var method:c.methods)for(var node:method.instructions.toArray())if(node instanceof MethodInsnNode call&&call.owner.equals(CARRIER)){
        if(helper==null)throw new IllegalArgumentException("Fresh CarrierOps compiler declaration is missing");method.instructions.insertBefore(call,lowerCarrier(method,call));method.instructions.remove(call);changed++;
      }
      if(changed>0){ClassWriter writer=new ClassWriter(ClassWriter.COMPUTE_MAXS);c.accept(writer);entries.put(entry.getKey(),writer.toByteArray());carrierSites+=changed;carrierOwners++;}
    }
    if(helper!=null){entries.remove(CARRIER+".class");carrierClassesRemoved++;}
    noCarrierReferences(entries);
  }

  public static void main(String[] args)throws Exception {
    if(args.length==2&&args[0].equals("--validate-final")){
      Map<String,byte[]> entries=new TreeMap<>();try(var zip=new ZipFile(args[1])){for(var entry:Collections.list(zip.entries()))if(!entry.isDirectory())entries.put(entry.getName(),zip.getInputStream(entry).readAllBytes());}noCarrierReferences(entries);System.out.println("{\"CarrierOps_classes\":0,\"CarrierOps_references\":0}");return;
    }
    if(args.length!=3&&args.length!=5)throw new IllegalArgumentException("Usage: SourceIntrinsicAdapter fresh-classes-directory-or-JAR INTRINSIC_PLAN.json new-adapted-directory-or-JAR [HANDLER_PLAN.json HANDLER_RESULT.json]");
    Path input=Path.of(args[0]).toAbsolutePath(),output=Path.of(args[2]).toAbsolutePath();
    if(input.equals(output))throw new IllegalArgumentException("Input and output must be different fresh directories");
    boolean archive=Files.isRegularFile(input);
    if(Files.exists(output))throw new IllegalArgumentException("Output must be new: "+output);
    Map<String,byte[]> entries=new TreeMap<>();
    if(archive)try(ZipFile zip=new ZipFile(input.toFile())){
      var all=zip.entries();while(all.hasMoreElements()){
        var e=all.nextElement();if(e.isDirectory())continue;
        if(entries.containsKey(e.getName()))throw new IllegalArgumentException("Duplicate exact entry: "+e.getName());
        try(InputStream stream=zip.getInputStream(e)){entries.put(e.getName(),stream.readAllBytes());}
      }
    }
    if(!archive)try(var paths=Files.walk(input)){for(Path file:paths.filter(Files::isRegularFile).toList())if(file.toString().endsWith(".class"))entries.put(input.relativize(file).toString().replace('\\','/'),Files.readAllBytes(file));}
    JsonArray plan=JsonParser.parseString(Files.readString(Path.of(args[1]))).getAsJsonArray();Map<String,Set<String>> handlerLowered=args.length==5?handlerBackedIntrinsicSites(Path.of(args[3]),Path.of(args[4]),plan):Map.of();int ownerCount=0,sites=0,removed=0,handlerLoweredSites=0;
    Set<String> removeSupport=new HashSet<>();Set<String> seenOwners=new HashSet<>();
    for(JsonElement element:plan) {
      JsonObject row=element.getAsJsonObject();String owner=str(row,"owner");
      if(!seenOwners.add(owner))throw new IllegalArgumentException("Duplicate planned owner: "+owner);
      String intrinsicOwner=row.has("intrinsic_owner")?str(row,"intrinsic_owner"):owner;
      if(!intrinsicOwner.equals(owner)){
        if(!row.has("compile_support_must_not_ship") || !row.get("compile_support_must_not_ship").getAsBoolean())throw new IllegalArgumentException("External intrinsic helper requires non-shipping contract");
        removeSupport.add(intrinsicOwner+".class");
      }
      byte[] fresh=entries.get(owner+".class");
      if(fresh==null)throw new IllegalArgumentException("Missing fresh owner: "+owner);
      ClassNode cn=new ClassNode();new ClassReader(fresh).accept(cn,0);
      if(!cn.name.equals(owner))throw new IllegalArgumentException("Owner mismatch "+owner);
      Map<String,JsonObject> bindings=new LinkedHashMap<>();
      for(JsonElement e:row.getAsJsonArray("intrinsics")){JsonObject b=e.getAsJsonObject();String k=str(b,"name")+str(b,"query_descriptor");if(bindings.put(k,b)!=null)throw new IllegalArgumentException("Duplicate intrinsic "+k);}
      Set<String> used=new HashSet<>();
      for(MethodNode mn:cn.methods)for(AbstractInsnNode i=mn.instructions.getFirst();i!=null;){
        AbstractInsnNode next=i.getNext();
        if(i instanceof MethodInsnNode call && call.owner.equals(intrinsicOwner)) {
          String key=call.name+call.desc;JsonObject b=bindings.get(key);
          if(b!=null){
            if(call.getOpcode()!=Opcodes.INVOKESTATIC)throw new IllegalArgumentException("Intrinsic is not static");
            mn.instructions.insertBefore(call,lower(mn,b,owner));mn.instructions.remove(call);used.add(key);sites++;
          }
        }
        i=next;
      }
      Set<String> completedByHandler=new HashSet<>();for(String key:bindings.keySet())if(handlerLowered.getOrDefault(owner,Set.of()).contains(key))completedByHandler.add(key);
      if(!used.equals(bindings.keySet())){Set<String> missing=new HashSet<>(bindings.keySet());missing.removeAll(used);missing.removeAll(completedByHandler);if(!missing.isEmpty())throw new IllegalArgumentException("Planned intrinsic has no fresh source callsite or exact successful handler-lowering receipt "+missing);handlerLoweredSites+=completedByHandler.size();}
      Iterator<MethodNode> iterator=cn.methods.iterator();int n=0;
      while(iterator.hasNext()){
        MethodNode mn=iterator.next();if(bindings.containsKey(mn.name+mn.desc)){
          if((mn.access&(Opcodes.ACC_NATIVE|Opcodes.ACC_PRIVATE|Opcodes.ACC_STATIC))!=(Opcodes.ACC_NATIVE|Opcodes.ACC_PRIVATE|Opcodes.ACC_STATIC))throw new IllegalArgumentException("Intrinsic declaration flags changed");iterator.remove();n++;
        }
      }
      if(n!=(intrinsicOwner.equals(owner)?bindings.size():0))throw new IllegalArgumentException("Intrinsic declaration count mismatch");removed+=n;
      for(MethodNode mn:cn.methods)for(AbstractInsnNode i:mn.instructions)if(i instanceof MethodInsnNode call && call.owner.equals(intrinsicOwner) && bindings.containsKey(call.name+call.desc))throw new IllegalArgumentException("Residual intrinsic call");
      // No replacement introduces a branch. Fresh javac frames stay valid; scratch
      // locals are dead at original frame boundaries. COMPUTE_MAXS never loads types.
      ClassWriter cw=new ClassWriter(ClassWriter.COMPUTE_MAXS);cn.accept(cw);byte[] bytes=cw.toByteArray();
      entries.put(owner+".class",bytes);
      ownerCount++;
    }
    lowerCarrierGlobally(entries);
    int supportRemoved=0;
    {
      for(String helper:removeSupport){
        if(!entries.containsKey(helper))throw new IllegalArgumentException("Planned compile-support class missing from fresh JAR: "+helper);
        String nestedPrefix=helper.substring(0,helper.length()-6)+"$";
        for(String name:new ArrayList<>(entries.keySet()))if(name.equals(helper) || (name.startsWith(nestedPrefix) && name.endsWith(".class"))){entries.remove(name);supportRemoved++;}
      }
      for(var entry:entries.entrySet())if(entry.getKey().endsWith(".class")){
        ClassNode cn=new ClassNode();new ClassReader(entry.getValue()).accept(cn,ClassReader.SKIP_DEBUG|ClassReader.SKIP_FRAMES);
        for(MethodNode mn:cn.methods)for(AbstractInsnNode i:mn.instructions)if(i instanceof MethodInsnNode call && removeSupport.contains(call.owner+".class"))throw new IllegalArgumentException("Residual compile-support call: "+entry.getKey()+" -> "+call.owner);
      }
      if(archive){Files.createDirectories(output.getParent());
      try(ZipOutputStream zip=new ZipOutputStream(Files.newOutputStream(output,StandardOpenOption.CREATE_NEW))){
        for(var entry:entries.entrySet()){
          ZipEntry ze=new ZipEntry(entry.getKey());ze.setTimeLocal(LocalDateTime.of(2000,1,1,0,0));
          zip.putNextEntry(ze);zip.write(entry.getValue());zip.closeEntry();
        }
      }}else for(var entry:entries.entrySet())if(entry.getKey().endsWith(".class")){Path target=output.resolve(entry.getKey());Files.createDirectories(target.getParent());Files.write(target,entry.getValue(),StandardOpenOption.CREATE_NEW);}
    }
    System.out.println("{\"CarrierOps_lowered_sites\":"+carrierSites+",\"CarrierOps_owners\":"+carrierOwners+",\"CarrierOps_classes_removed\":"+carrierClassesRemoved+",\"owners\":"+ownerCount+",\"lowered_sites\":"+sites+",\"removed_intrinsic_declarations\":"+removed+",\"removed_compile_support_classes\":"+supportRemoved+",\"output_entries\":"+entries.size()+",\"application_classes_loaded\":0,\"old_Code_frame_inputs\":0}");
  }
}
