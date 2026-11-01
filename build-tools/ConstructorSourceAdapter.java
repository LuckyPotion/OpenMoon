import com.google.gson.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import org.objectweb.asm.tree.analysis.*;
import java.nio.file.*;
import java.util.*;
import java.util.zip.*;
import java.io.*;
import java.time.LocalDateTime;

/** Fresh static source query -> real constructor. No application loading,
 * original implementation, archived Code or archived frames are inputs.
 * CLI: fresh.jar PLAN.json new-runtime.jar [ordered external provider.jar ...]
 */
public final class ConstructorSourceAdapter {
  static final String ENUM_SYMBOL="sourcebuild/EnumConstructor";
  static String s(JsonObject o,String k){return o.get(k).getAsString();}
  static JsonArray list(JsonObject o,String k){return o.has(k)?o.getAsJsonArray(k):new JsonArray();}
  static void need(boolean x,String m){if(!x)throw new IllegalArgumentException(m);}
  static Map<String,byte[]> archive(Path p)throws Exception{
    Map<String,byte[]> r=new TreeMap<>();try(ZipFile z=new ZipFile(p.toFile())){
      var it=z.entries();while(it.hasMoreElements()){
        var e=it.nextElement();if(e.isDirectory())continue;
        need(!e.getName().startsWith("/")&&!e.getName().contains("\\")&&!e.getName().contains("../"),"noncanonical archive entry");
        try(InputStream in=z.getInputStream(e)){need(r.putIfAbsent(e.getName(),in.readAllBytes())==null,"duplicate exact archive entry");}
      }
    }return r;
  }
  record Shape(String name,String parent,List<String> interfaces,boolean itf){}
  static final class Hierarchy {
    final Map<String,Shape> shapes=new HashMap<>();
    void add(byte[] b){ClassReader r=new ClassReader(b);shapes.putIfAbsent(r.getClassName(),new Shape(r.getClassName(),r.getSuperName(),List.of(r.getInterfaces()),(r.getAccess()&Opcodes.ACC_INTERFACE)!=0));}
    Shape get(String n){
      if(shapes.containsKey(n))return shapes.get(n);
      try(InputStream in=ClassLoader.getPlatformClassLoader().getResourceAsStream(n+".class")){
        need(in!=null,"missing exact hierarchy declaration: "+n);add(in.readAllBytes());return shapes.get(n);
      }catch(IOException e){throw new IllegalStateException(e);}
    }
    boolean assign(String target,String source){
      if(target.equals(source)||target.equals("java/lang/Object"))return true;
      if(source.startsWith("[")){
        if(target.equals("java/lang/Cloneable")||target.equals("java/io/Serializable"))return true;
        if(!target.startsWith("["))return false;
        String a=target.substring(1),b=source.substring(1);
        if(a.length()==1||b.length()==1)return a.equals(b);
        return assign(component(a),component(b));
      }
      if(target.startsWith("["))return false;
      Set<String> seen=new HashSet<>();Deque<String> q=new ArrayDeque<>();q.add(source);
      while(!q.isEmpty()){String n=q.remove();if(!seen.add(n))continue;if(n.equals(target))return true;Shape d=get(n);if(d.parent()!=null)q.add(d.parent());q.addAll(d.interfaces());}return false;
    }
    String component(String d){return d.startsWith("L")?d.substring(1,d.length()-1):d;}
    String common(String a,String b){
      if(assign(a,b))return a;if(assign(b,a))return b;
      if(a.startsWith("[")&&b.startsWith("[")){
        String ac=a.substring(1),bc=b.substring(1);
        if(ac.length()>1&&bc.length()>1){String c=common(component(ac),component(bc));return c.startsWith("[")?"["+c:"[L"+c+";";}
      }
      if(a.startsWith("[")||b.startsWith("["))return "java/lang/Object";
      if(get(a).itf()||get(b).itf())return "java/lang/Object";
      for(String n=get(a).parent();n!=null;n=get(n).parent())if(assign(n,b))return n;
      throw new IllegalArgumentException("no hierarchy merge "+a+" "+b);
    }
  }
  static MethodNode method(ClassNode c,String name,String desc){
    var xs=c.methods.stream().filter(m->m.name.equals(name)&&m.desc.equals(desc)).toList();need(xs.size()==1,"exact method missing/duplicate: "+c.name+"."+name+desc);return xs.get(0);
  }
  static boolean reference(Type type){return type.getSort()==Type.OBJECT||type.getSort()==Type.ARRAY;}
  static boolean integerCategory(Type type){return type.getSort()>=Type.BOOLEAN&&type.getSort()<=Type.INT;}
  static Type[] initializerQueryArguments(String owner,String query,String target){
    Type queryType=Type.getMethodType(query),targetType=Type.getMethodType(target);
    need(queryType.getReturnType().equals(Type.VOID_TYPE)&&targetType.getReturnType().equals(Type.VOID_TYPE),"initializer descriptors must return void");
    Type[] queryArgs=queryType.getArgumentTypes(),targetArgs=targetType.getArgumentTypes();
    need(queryArgs.length==targetArgs.length+1,"initializer query argument arity differs from exact target");
    need(queryArgs[0].equals(Type.getObjectType(owner)),"initializer query receiver must be exact current owner; receiver adaptation forbidden");
    for(int i=0;i<targetArgs.length;i++){
      Type from=queryArgs[i+1],to=targetArgs[i];
      need(from.equals(to)||reference(from)&&reference(to)||integerCategory(from)&&integerCategory(to),"unsupported initializer argument adaptation at "+i+": "+from+" -> "+to);
    }
    return queryArgs;
  }
  static InsnList directInitializer(MethodNode query,String owner,String descriptor,JsonObject operation){
    String targetDescriptor=s(operation,"descriptor");Type[] queryArgs=initializerQueryArguments(owner,descriptor,targetDescriptor),targetArgs=Type.getArgumentTypes(targetDescriptor);
    InsnList result=new InsnList();boolean different=false;
    for(int i=0;i<targetArgs.length;i++)different|=!queryArgs[i+1].equals(targetArgs[i]);
    if(different){
      // All receiver/argument expressions have already run in the source order.
      // Store only arguments, in reverse stack order. The uninitialized-this
      // receiver remains untouched beneath them: no cast/store/reload on it.
      int[] slots=new int[targetArgs.length];int next=query.maxLocals;
      for(int i=0;i<slots.length;i++){slots[i]=next;next+=queryArgs[i+1].getSize();}
      need(next<=65535,"initializer argument scratch exceeds JVM max_locals");query.maxLocals=next;
      for(int i=slots.length-1;i>=0;i--)result.add(new VarInsnNode(queryArgs[i+1].getOpcode(Opcodes.ISTORE),slots[i]));
      for(int i=0;i<slots.length;i++){
        Type from=queryArgs[i+1],to=targetArgs[i];result.add(new VarInsnNode(from.getOpcode(Opcodes.ILOAD),slots[i]));
        if(reference(from)&&reference(to)&&!from.equals(to))result.add(new TypeInsnNode(Opcodes.CHECKCAST,to.getInternalName()));
        // B/C/S/Z/I share the JVM integer category. Preserve the original
        // stack value; no narrowing, masking, boxing, or width conversion.
      }
    }
    result.add(new MethodInsnNode(Opcodes.INVOKESPECIAL,s(operation,"owner"),"<init>",targetDescriptor,false));return result;
  }
  static void rejectIntermediates(Map<String,byte[]> entries){
    for(var e:entries.entrySet())if(e.getKey().endsWith(".class")){
      ClassNode c=new ClassNode();new ClassReader(e.getValue()).accept(c,ClassReader.SKIP_DEBUG|ClassReader.SKIP_FRAMES);
      for(MethodNode m:c.methods){
        need(!m.name.startsWith("__sourceConstructorBody_")&&!m.name.startsWith("__sourceConstructorInit_"),"unadapted constructor intermediary remains: "+c.name+"."+m.name+m.desc);
        for(AbstractInsnNode n:m.instructions)if(n instanceof MethodInsnNode call)need(!call.name.startsWith("__sourceConstructorBody_")&&!call.name.startsWith("__sourceConstructorInit_"),"residual constructor intermediary call");
      }
    }
  }
  static final class UninitializedThis extends BasicValue {
    UninitializedThis(String owner){super(Type.getObjectType(owner));}
    @Override public boolean equals(Object o){return o instanceof UninitializedThis&&super.equals(o);}
    @Override public int hashCode(){return super.hashCode()^0x517a;}
  }
  static void verifyInitialization(String owner,String parent,MethodNode method)throws AnalyzerException{
    BasicInterpreter interpreter=new BasicInterpreter(Opcodes.ASM9){
      @Override public BasicValue newParameterValue(boolean instance,int local,Type type){return instance&&local==0?new UninitializedThis(owner):super.newParameterValue(instance,local,type);}
      void reject(BasicValue value,AbstractInsnNode n)throws AnalyzerException{if(value instanceof UninitializedThis)throw new AnalyzerException(n,"Illegal uninitialized-this consumer");}
      @Override public BasicValue unaryOperation(AbstractInsnNode n,BasicValue v)throws AnalyzerException{reject(v,n);return super.unaryOperation(n,v);}
      @Override public BasicValue binaryOperation(AbstractInsnNode n,BasicValue a,BasicValue b)throws AnalyzerException{
        if(n instanceof FieldInsnNode f&&n.getOpcode()==Opcodes.PUTFIELD&&a instanceof UninitializedThis){if(!f.owner.equals(owner))throw new AnalyzerException(n,"pre-super putfield outside current owner");reject(b,n);return null;}
        reject(a,n);reject(b,n);return super.binaryOperation(n,a,b);
      }
      @Override public BasicValue ternaryOperation(AbstractInsnNode n,BasicValue a,BasicValue b,BasicValue c)throws AnalyzerException{reject(a,n);reject(b,n);reject(c,n);return super.ternaryOperation(n,a,b,c);}
      @Override public BasicValue naryOperation(AbstractInsnNode n,List<? extends BasicValue> vs)throws AnalyzerException{
        boolean init=n instanceof MethodInsnNode m&&m.getOpcode()==Opcodes.INVOKESPECIAL&&m.name.equals("<init>")&&(m.owner.equals(owner)||m.owner.equals(parent))&&!vs.isEmpty()&&vs.get(0) instanceof UninitializedThis;
        for(int i=0;i<vs.size();i++)if(!(init&&i==0))reject(vs.get(i),n);
        return super.naryOperation(n,vs);
      }
      @Override public BasicValue merge(BasicValue a,BasicValue b){if((a instanceof UninitializedThis)!=(b instanceof UninitializedThis))throw new IllegalArgumentException("initialized/uninitialized this merge");return super.merge(a,b);}
    };
    Analyzer<BasicValue> analyzer=new Analyzer<>(interpreter){
      @Override protected Frame<BasicValue> newFrame(int locals,int stack){return tracked(new Frame<>(locals,stack));}
      @Override protected Frame<BasicValue> newFrame(Frame<? extends BasicValue> src){return tracked(src);}
      private Frame<BasicValue> tracked(Frame<? extends BasicValue> src){return new Frame<BasicValue>(src){
        @Override public void execute(AbstractInsnNode n,Interpreter<BasicValue> interpreter)throws AnalyzerException{
          boolean initialize=false;
          if(n instanceof MethodInsnNode m&&m.getOpcode()==Opcodes.INVOKESPECIAL&&m.name.equals("<init>")){
            int at=getStackSize()-Type.getArgumentTypes(m.desc).length-1;
            initialize=at>=0&&getStack(at) instanceof UninitializedThis;
          }
          if(n.getOpcode()==Opcodes.RETURN&&getLocal(0) instanceof UninitializedThis)throw new AnalyzerException(n,"return before initialization");
          super.execute(n,interpreter);
          if(initialize){BasicValue ready=new BasicValue(Type.getObjectType(owner));for(int i=0;i<getLocals();i++)if(getLocal(i) instanceof UninitializedThis)setLocal(i,ready);for(int i=0;i<getStackSize();i++)if(getStack(i) instanceof UninitializedThis)setStack(i,ready);}
        }
      };}
    };
    analyzer.analyze(owner,method);
  }
  public static void main(String[] args)throws Exception{
    if(args.length==2&&args[0].equals("--validate-final")){rejectIntermediates(archive(Path.of(args[1])));System.out.println("{\"constructor_intermediates\":0}");return;}
    need(args.length>=3,"Usage: ConstructorSourceAdapter fresh.jar PLAN.json new-runtime.jar [--enum-plan ENUM_PLAN.json] [provider.jar ...]");
    Path input=Path.of(args[0]),output=Path.of(args[2]);need(!Files.exists(output),"output must be new");
    Map<String,byte[]> entries=archive(input);Hierarchy hierarchy=new Hierarchy();
    for(var e:entries.entrySet())if(e.getKey().endsWith(".class"))hierarchy.add(e.getValue());
    Map<String,JsonObject> enumMetadata=new HashMap<>();boolean enumPlanSeen=false;
    for(int i=3;i<args.length;i++){
      if(args[i].equals("--enum-plan")){
        need(!enumPlanSeen&&i+1<args.length,"one explicit enum plan path required");enumPlanSeen=true;
        JsonArray enumPlan=JsonParser.parseString(Files.readString(Path.of(args[++i]))).getAsJsonArray();
        for(var value:enumPlan){JsonObject meta=value.getAsJsonObject();need(enumMetadata.putIfAbsent(s(meta,"owner"),meta)==null,"duplicate enum metadata owner");}
      }else for(var e:archive(Path.of(args[i])).entrySet())if(e.getKey().endsWith(".class")&&!e.getKey().startsWith("META-INF/"))hierarchy.add(e.getValue());
    }
    JsonArray plan=JsonParser.parseString(Files.readString(Path.of(args[1]))).getAsJsonArray();
    int constructors=0,initializers=0,restored=0,enumInitializers=0;Set<String> owners=new HashSet<>();
    for(JsonElement element:plan){
      JsonObject row=element.getAsJsonObject();String owner=s(row,"owner");need(owners.add(owner),"duplicate owner plan: "+owner);
      byte[] fresh=entries.get(owner+".class");need(fresh!=null,"missing fresh owner: "+owner);ClassNode cn=new ClassNode();new ClassReader(fresh).accept(cn,0);need(cn.name.equals(owner),"owner mismatch");
      Set<String> remove=new HashSet<>();Set<String> changed=new HashSet<>();
      for(JsonElement ce:list(row,"constructors")){
        JsonObject spec=ce.getAsJsonObject();String desc=s(spec,"descriptor"),query=s(spec,"query_method"),qd=s(spec,"query_descriptor");
        need(changed.add(desc),"duplicate constructor descriptor");
        need(qd.equals("(L"+owner+";"+desc.substring(1)),"query ABI must be target receiver in slot0 then exact arguments");
        MethodNode q=method(cn,query,qd),target=method(cn,"<init>",desc);
        need((q.access&Opcodes.ACC_STATIC)!=0&&(q.access&(Opcodes.ACC_NATIVE|Opcodes.ACC_ABSTRACT))==0,"query must have fresh static Java Code");
        need((target.access&(Opcodes.ACC_STATIC|Opcodes.ACC_NATIVE|Opcodes.ACC_ABSTRACT))==0,"real signature compile-only constructor missing");
        Map<String,JsonObject> init=new HashMap<>();
        for(JsonElement be:list(spec,"initializers")){
          JsonObject b=be.getAsJsonObject(),op=b.getAsJsonObject("operation");String name=s(b,"name"),bd=s(b,"query_descriptor"),rd=s(op,"descriptor"),io=s(op,"owner");
          need(op.get("opcode").getAsInt()==Opcodes.INVOKESPECIAL&&s(op,"name").equals("<init>"),"only exact constructor invokespecial permitted");
          JsonObject effective=b;
          if(!io.equals(owner)&&!io.equals(cn.superName)){
            JsonObject meta=enumMetadata.get(owner);
            need(meta!=null&&s(meta,"super").equals("java/lang/Enum")&&(meta.get("access").getAsInt()&Opcodes.ACC_ENUM)!=0&&(meta.get("access").getAsInt()&Opcodes.ACC_INTERFACE)==0&&(!meta.has("source_carrier_owner")||s(meta,"source_carrier_owner").equals(owner))&&cn.superName.equals(ENUM_SYMBOL)&&io.equals("java/lang/Enum")&&rd.equals("(Ljava/lang/String;I)V"),"initializer must target current or direct superclass, or exact explicitly planned enum symbol: owner="+owner+" actual_parent="+cn.superName+" target="+io+" descriptor="+rd+" completed_owners="+(owners.size()-1)+" completed_constructors="+constructors);
            need(list(meta,"methods").asList().stream().map(JsonElement::getAsJsonObject).filter(m->s(m,"name").equals("<init>")&&s(m,"descriptor").equals(desc)).count()==1,"enum constructor descriptor absent/duplicate in explicit metadata");
            Shape symbol=hierarchy.get(ENUM_SYMBOL);need(symbol.parent().equals("java/lang/Enum")&&!symbol.itf(),"enum symbol must declare the exact Enum superclass edge");
            effective=b.deepCopy();effective.getAsJsonObject("operation").addProperty("owner",ENUM_SYMBOL);enumInitializers++;
          }
          need(!op.has("interface")||!op.get("interface").getAsBoolean(),"constructor initializer target cannot be an interface");
          initializerQueryArguments(owner,bd,rd);
          need(init.put(name+bd,effective)==null,"duplicate initializer binding");
          MethodNode declaration=method(cn,name,bd);need((declaration.access&(Opcodes.ACC_NATIVE|Opcodes.ACC_STATIC|Opcodes.ACC_PRIVATE))==(Opcodes.ACC_NATIVE|Opcodes.ACC_STATIC|Opcodes.ACC_PRIVATE),"initializer declaration not exact private static native intermediary");
          remove.add(name+bd);
        }
        need(!init.isEmpty(),"no initializer binding");int sites=0;Set<String> used=new HashSet<>();
        for(AbstractInsnNode n:q.instructions.toArray()){
          if(n instanceof FrameNode){q.instructions.remove(n);continue;}
          if(n instanceof MethodInsnNode call&&call.owner.equals(owner)&&init.containsKey(call.name+call.desc)){
            need(call.getOpcode()==Opcodes.INVOKESTATIC,"initializer query call must be static");JsonObject op=init.get(call.name+call.desc).getAsJsonObject("operation");used.add(call.name+call.desc);
            q.instructions.insertBefore(call,directInitializer(q,owner,call.desc,op));q.instructions.remove(call);sites++;
          }
        }
        need(sites==1&&used.equals(init.keySet()),"exactly one direct initialization site required, all bindings used");
        target.instructions=q.instructions;target.tryCatchBlocks=q.tryCatchBlocks;target.maxStack=q.maxStack;target.maxLocals=q.maxLocals;
        target.localVariables=q.localVariables;target.visibleLocalVariableAnnotations=q.visibleLocalVariableAnnotations;target.invisibleLocalVariableAnnotations=q.invisibleLocalVariableAnnotations;
        if(spec.has("access"))target.access=spec.get("access").getAsInt();
        if(spec.has("exceptions")){target.exceptions=new ArrayList<>();for(var x:spec.getAsJsonArray("exceptions"))target.exceptions.add(x.getAsString());}
        remove.add(query+qd);constructors++;initializers+=sites;
      }
      for(JsonElement fe:list(row,"restore_field_access")){
        JsonObject f=fe.getAsJsonObject();String n=s(f,"name"),d=s(f,"descriptor");int access=f.get("access").getAsInt();
        var fs=cn.fields.stream().filter(x->x.name.equals(n)&&x.desc.equals(d)).toList();need(fs.size()==1,"missing mutable field exact identity");
        int mutable=access&~Opcodes.ACC_FINAL;
        int visible=(mutable&~(Opcodes.ACC_PRIVATE|Opcodes.ACC_PROTECTED|Opcodes.ACC_PUBLIC))|Opcodes.ACC_PUBLIC;
        boolean plannedEnumConstant=false;JsonObject enumMeta=enumMetadata.get(owner);
        if((access&Opcodes.ACC_ENUM)!=0&&enumMeta!=null&&s(enumMeta,"super").equals("java/lang/Enum")&&(enumMeta.get("access").getAsInt()&Opcodes.ACC_ENUM)!=0&&cn.superName.equals(ENUM_SYMBOL)){
          need((access&(Opcodes.ACC_PUBLIC|Opcodes.ACC_STATIC|Opcodes.ACC_FINAL))==(Opcodes.ACC_PUBLIC|Opcodes.ACC_STATIC|Opcodes.ACC_FINAL)&&d.equals("L"+owner+";"),"enum constant restore must have exact owner descriptor and public static final flags");
          need(list(enumMeta,"fields").asList().stream().map(JsonElement::getAsJsonObject).filter(x->s(x,"name").equals(n)&&s(x,"descriptor").equals(d)&&(x.get("access").getAsInt()&~Opcodes.ACC_FINAL)==mutable).count()==1,"enum constant restore differs beyond tracked FINAL from explicit enum metadata: "+owner+"."+n+d);
          plannedEnumConstant=fs.get(0).access==(mutable&~Opcodes.ACC_ENUM);
        }
        need(fs.get(0).access==mutable||fs.get(0).access==visible||plannedEnumConstant,"temporary field flags changed beyond tracked visibility/FINAL query: "+owner+"."+n+d);fs.get(0).access=access;restored++;
      }
      for(JsonElement me:list(row,"remove_methods")){JsonObject m=me.getAsJsonObject();remove.add(s(m,"name")+s(m,"descriptor"));}
      for(String key:remove)need(cn.methods.stream().anyMatch(m->(m.name+m.desc).equals(key)),"planned intermediate method absent: "+key);
      cn.methods.removeIf(m->remove.contains(m.name+m.desc));
      for(MethodNode m:cn.methods)for(AbstractInsnNode n:m.instructions)if(n instanceof MethodInsnNode call&&call.owner.equals(owner))need(!remove.contains(call.name+call.desc),"residual intermediary invocation: "+call.name);
      // Frames are recomputed exclusively from fresh code and exact declaration
      // hierarchy. Platform resources are read as bytes; no application loading.
      ClassWriter writer=new ClassWriter(ClassWriter.COMPUTE_FRAMES|ClassWriter.COMPUTE_MAXS){@Override protected String getCommonSuperClass(String a,String b){return hierarchy.common(a,b);}};
      cn.accept(writer);byte[] result=writer.toByteArray();
      ClassNode checked=new ClassNode();new ClassReader(result).accept(checked,ClassReader.EXPAND_FRAMES);
      for(MethodNode m:checked.methods)if(m.name.equals("<init>")&&changed.contains(m.desc)){new Analyzer<BasicValue>(new BasicVerifier()).analyze(owner,m);verifyInitialization(owner,cn.superName,m);}
      entries.put(owner+".class",result);
    }
    rejectIntermediates(entries);
    Files.createDirectories(output.toAbsolutePath().getParent());try(ZipOutputStream zip=new ZipOutputStream(Files.newOutputStream(output,StandardOpenOption.CREATE_NEW))){
      for(var e:entries.entrySet()){ZipEntry ze=new ZipEntry(e.getKey());ze.setTimeLocal(LocalDateTime.of(2000,1,1,0,0));zip.putNextEntry(ze);zip.write(e.getValue());zip.closeEntry();}
    }
    System.out.println("{\"owners\":"+owners.size()+",\"constructors\":"+constructors+",\"direct_initializers\":"+initializers+",\"enum_symbol_initializers\":"+enumInitializers+",\"restored_fields\":"+restored+",\"output_entries\":"+entries.size()+",\"old_Code_frame_inputs\":0,\"application_classes_loaded\":0}");
  }
}
