import java.util.*;import com.google.gson.*;import org.objectweb.asm.*;import org.objectweb.asm.tree.*;import org.objectweb.asm.tree.analysis.*;
/** Finite mandatory (Z/B/C/S/I)->(Z/B/C/S/I) compiler-only category identity, with whole source dataflow. */
public class SourceIntegerCategoryProof implements Opcodes {
 static class Values extends SourceLifetimeRemapProof.Values {
  final Set<AbstractInsnNode> identities;
  final ExactOrigins069 exactOrigins098=new ExactOrigins069();
  boolean suppressAnalysisTape=false;
  @Override public SourceValue merge(SourceValue a,SourceValue b){return exactOrigins098.merge(a,b);}
  @Override void consume(String kind,SourceValue...values){if(!suppressAnalysisTape)super.consume(kind,values);}
  Values(Set<AbstractInsnNode> ids){identities=ids;}
  public SourceValue naryOperation(AbstractInsnNode n,List<? extends SourceValue> vs){if(identities.contains(n)){ExecutableVerify.need(vs.size()==1&&vs.get(0).getSize()==1,"category actual one computational int-width input");consume("category_identity_input",vs.get(0));return vs.get(0);}return super.naryOperation(n,vs);}
 }
 static Map<String,Object> erase(MethodNode m,JsonObject recipe,String queryOwner)throws Exception{
  var bindings=new TreeMap<String,JsonObject>();for(var item:recipe.getAsJsonArray("bindings")){var b=item.getAsJsonObject();if(b.getAsJsonObject("operation").has("adapter"))bindings.put(b.get("name").getAsString(),b);}
  var markers=Collections.newSetFromMap(new IdentityHashMap<AbstractInsnNode,Boolean>());var nodes=new ArrayList<AbstractInsnNode>();var ord=new IdentityHashMap<AbstractInsnNode,Integer>();var rows=new ArrayList<Object>();var seen=new HashSet<String>();int ordinal=0;
  for(var n:m.instructions){nodes.add(n);if(n.getOpcode()>=0)ord.put(n,ordinal++);if(n instanceof MethodInsnNode call&&bindings.containsKey(call.name)){var b=bindings.get(call.name);var operation=b.getAsJsonObject("operation");Type input=Type.getType(operation.get("input_descriptor").getAsString()),output=Type.getType(operation.get("output_descriptor").getAsString());ExecutableVerify.need(operation.get("adapter").getAsString().equals("JVM_integer_category_identity")&&input.getSort()>=Type.BOOLEAN&&input.getSort()<=Type.INT&&output.getSort()>=Type.BOOLEAN&&output.getSort()<=Type.INT&&call.getOpcode()==INVOKESTATIC&&call.owner.equals(queryOwner)&&call.desc.equals(Type.getMethodDescriptor(output,input))&&call.desc.equals(b.get("query_descriptor").getAsString())&&seen.add(call.name),"category exact uniquely bound actual javac source call descriptor, computational int width and owner");markers.add(n);rows.add(LeafSource.map("alias",call.name,"actual_source_opcode_ordinal",ord.get(n),"original_source_input_descriptor",input.getDescriptor(),"source_output_descriptor",output.getDescriptor(),"actual_javac_invocation_descriptor",call.desc,"same_computational_int_width",1,"truth_normalization_branch_or_comparison_added",false,"native_or_source_query_executed",false));}}
  ExecutableVerify.need(seen.equals(bindings.keySet()),"all declared source category adapters consumed exactly once");if(markers.isEmpty())return LeafSource.map("sites",rows,"source_only",true,"retained_source_opcodes_checked",0);
  var proof=IdentityInstructionContractionProof106.erase(m,markers,queryOwner);return LeafSource.map("kind","source_only_finite_integer_category_identity_exact_relational_bisimulation","sites",rows,"source_only",true,"proof",proof,"boolean_domain_not_restricted_to_0_or_1",true,"query_native_intrinsic_never_executed",true);
 }
}
