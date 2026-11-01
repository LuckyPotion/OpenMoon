import java.util.*;
import com.google.gson.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

/** Finite source-only monitor intrinsic. Never inserts implicit cleanup or balances a lock. */
public final class MonitorOperationRule implements Opcodes {
    static int opcode(JsonObject operation) {
        int opcode=operation.get("opcode").getAsInt();
        ExecutableVerify.need(opcode==MONITORENTER||opcode==MONITOREXIT,"one exact monitor operation");
        String descriptor=operation.get("monitor_exact_argument_descriptor").getAsString();
        Type[] args=Type.getArgumentTypes(descriptor);
        ExecutableVerify.need(args.length==1 && args[0].getSize()==1
            && (args[0].getSort()==Type.OBJECT||args[0].getSort()==Type.ARRAY)
            && Type.getReturnType(descriptor).equals(Type.VOID_TYPE),"one initialized category-one reference and void result");
        ExecutableVerify.need(operation.get("implicit_cleanup_inserted").isJsonPrimitive()
            && !operation.get("implicit_cleanup_inserted").getAsBoolean(),"no implicit cleanup inserted");
        return opcode;
    }
    static Map<String,Object> actual(ClassNode carrier,MethodInsnNode call,JsonObject binding) {
        JsonObject operation=binding.getAsJsonObject("operation");int opcode=opcode(operation);
        String kind=opcode==MONITORENTER?"monitorEnter":"monitorExit";
        ExecutableVerify.need(kind.equals(binding.get("kind").getAsString()),"exact source monitor kind");
        ExecutableVerify.need(call.getOpcode()==INVOKESTATIC && !call.itf && call.owner.equals(carrier.name)
            && call.name.equals(binding.get("name").getAsString())
            && call.desc.equals(binding.get("query_descriptor").getAsString())
            && call.desc.equals(operation.get("monitor_exact_argument_descriptor").getAsString()),"actual compiler monitor invocation and descriptor exact");
        MethodNode declaration=null;
        for(MethodNode method:carrier.methods) if(method.name.equals(call.name)&&method.desc.equals(call.desc)) {
            ExecutableVerify.need(declaration==null,"one actual helper declaration");declaration=method;
        }
        ExecutableVerify.need(declaration!=null && declaration.access==(ACC_PRIVATE|ACC_STATIC|ACC_NATIVE)
            && declaration.instructions.size()==0 && declaration.signature==null
            && declaration.exceptions.equals(List.of("java/lang/Throwable")),"compiler-only monitor helper exact ABI with no body");
        return LeafSource.map("compiler_alias",call.name,"actual_argument_descriptor",call.desc,"emitted_opcode",opcode,
            "reference_operand_count",1,"result_descriptor","V","actual_fresh_javac_helper_ABI_verified",true,
            "implicit_cleanup_or_lock_repair",false,"production_native_helper_emitted",false,
            "original_Code_frames_or_type_oracle_used",false);
    }
}
