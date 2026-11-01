import com.google.gson.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
/** The explicit NEW grammar is accepted only through an exact saved-source declaration. */
public final class ExplicitNewBindingProof implements Opcodes {
 static void verify(JsonObject b,MethodInsnNode call,MethodNode declaration){
  var op=b.getAsJsonObject("operation");String kind=b.get("kind").getAsString();
  boolean allocation=op.has("opcode")&&op.get("opcode").getAsInt()==NEW;
  if(!allocation&&!kind.equals("sourceUninitializedNEW")&&!kind.equals("explicitNewInit"))return;
  ExecutableVerify.need(call.getOpcode()==INVOKESTATIC&&call.name.equals(b.get("name").getAsString())&&call.desc.equals(b.get("query_descriptor").getAsString()),"explicit NEW source helper name/kind/declaration binding");
  ExecutableVerify.need(declaration.name.equals(call.name)&&declaration.desc.equals(call.desc)&&declaration.access==(ACC_PRIVATE|ACC_STATIC|ACC_NATIVE)&&declaration.instructions.size()==0,"explicit NEW compiler-only declaration has no executable body");
  if(allocation||kind.equals("sourceUninitializedNEW")){
   ExecutableVerify.need(allocation&&kind.equals("sourceUninitializedNEW")&&call.desc.equals("()L"+op.get("type").getAsString()+";"),"explicit NEW exact fresh allocation empty input and nominal result");
  }else{
   Type[] arguments=Type.getArgumentTypes(op.get("descriptor").getAsString());Type[] actual=new Type[arguments.length+1];actual[0]=Type.getObjectType(op.get("owner").getAsString());System.arraycopy(arguments,0,actual,1,arguments.length);
   ExecutableVerify.need(op.get("opcode").getAsInt()==INVOKESPECIAL&&op.get("name").getAsString().equals("<init>")&&!op.get("interface").getAsBoolean()&&Type.getReturnType(op.get("descriptor").getAsString()).equals(Type.VOID_TYPE)&&call.desc.equals(Type.getMethodDescriptor(Type.VOID_TYPE,actual)),"explicit NEW init exact invokespecial owner receiver arguments and void result");
  }
 }
}
