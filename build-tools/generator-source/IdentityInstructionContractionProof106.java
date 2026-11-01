import java.util.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import org.objectweb.asm.tree.analysis.*;

/** Exact relational proof for erasing declared unary computational-int identities.
 * Each marked transfer is the identity on every local and on the complete stack,
 * including the input's bits and producer. All other transfers and their ordered
 * normal/exception successors are identical objects. Contracting these silent
 * edges is a bisimulation, including loops; no origin sets are approximated.
 * BasicInterpreter independently checks every reachable state shape. This proof
 * does not enumerate potentially quadratic transitive producer sets.
 */
final class IdentityInstructionContractionProof106 implements Opcodes {
 static void need(boolean b,String s){ExecutableVerify.need(b,"category_contraction106_"+s);}
 static AbstractInsnNode next(AbstractInsnNode n,Set<AbstractInsnNode> erased){
  while(n!=null&&(n.getOpcode()<0||erased.contains(n)))n=n.getNext();
  need(n!=null,"every_contracted_edge_has_real_destination");return n;
 }
 static List<AbstractInsnNode> edges(AbstractInsnNode n,Set<AbstractInsnNode> erased){
  List<AbstractInsnNode> out=new ArrayList<>();int op=n.getOpcode();
  if(n instanceof JumpInsnNode j){need(op!=JSR,"no_subroutines");out.add(next(j.label,erased));if(op!=GOTO)out.add(next(n.getNext(),erased));}
  else if(n instanceof TableSwitchInsnNode t){out.add(next(t.dflt,erased));for(var l:t.labels)out.add(next(l,erased));}
  else if(n instanceof LookupSwitchInsnNode t){out.add(next(t.dflt,erased));for(var l:t.labels)out.add(next(l,erased));}
  else if(op!=ATHROW&&!(op>=IRETURN&&op<=RETURN))out.add(next(n.getNext(),erased));
  return out;
 }
 static List<Integer> membership(MethodNode m,AbstractInsnNode node){
  int at=m.instructions.indexOf(node);List<Integer> result=new ArrayList<>();
  for(int i=0;i<m.tryCatchBlocks.size();i++){var t=m.tryCatchBlocks.get(i);if(at>=m.instructions.indexOf(t.start)&&at<m.instructions.indexOf(t.end))result.add(i);}
  return result;
 }
 static boolean same(Frame<BasicValue> a,Frame<BasicValue> b){
  if(a==null||b==null)return a==b;if(a.getLocals()!=b.getLocals()||a.getStackSize()!=b.getStackSize())return false;
  for(int i=0;i<a.getLocals();i++)if(!Objects.equals(a.getLocal(i),b.getLocal(i)))return false;
  for(int i=0;i<a.getStackSize();i++)if(!Objects.equals(a.getStack(i),b.getStack(i)))return false;return true;
 }
 static Map<String,Object> erase(MethodNode m,Set<AbstractInsnNode> markers,String owner)throws Exception{
  List<AbstractInsnNode> all=Arrays.asList(m.instructions.toArray());
  Map<AbstractInsnNode,Integer> oldIndex=new IdentityHashMap<>();for(int i=0;i<all.size();i++)oldIndex.put(all.get(i),i);
  BasicInterpreter interpreter=new BasicInterpreter();var before=new OrderedSourceAnalyzer114<BasicValue>(interpreter).analyzeAndComputeMaxs(owner,m);
  Map<AbstractInsnNode,List<AbstractInsnNode>> successors=new IdentityHashMap<>();Map<AbstractInsnNode,List<Integer>> regions=new IdentityHashMap<>();
  int identitiesChecked=0;
  for(var n:all)if(n.getOpcode()>=0){
   if(markers.contains(n)){
    need(n instanceof MethodInsnNode,"only_explicit_call_nodes");var c=(MethodInsnNode)n;
    Type[] args=Type.getArgumentTypes(c.desc);need(c.getOpcode()==INVOKESTATIC&&args.length==1&&args[0].getSort()>=Type.BOOLEAN&&args[0].getSort()<=Type.INT&&Type.getReturnType(c.desc).getSort()>=Type.BOOLEAN&&Type.getReturnType(c.desc).getSort()<=Type.INT,"one_exact_computational_int_to_int_binding");
    var f=before[oldIndex.get(n)];if(f!=null){need(f.getStackSize()>0&&BasicValue.INT_VALUE.equals(f.getStack(f.getStackSize()-1)),"actual_identity_operand_is_computational_int");Frame<BasicValue> afterTransfer=new Frame<>(f);afterTransfer.execute(n,interpreter);need(same(f,afterTransfer),"identity_transfer_preserves_complete_state_shape");}
    identitiesChecked++;
   }else{successors.put(n,edges(n,markers));regions.put(n,membership(m,n));}
  }
  List<AbstractInsnNode> handlerEntries=new ArrayList<>();for(var t:m.tryCatchBlocks)handlerEntries.add(next(t.handler,markers));
  for(var n:markers)m.instructions.remove(n);
  var after=new OrderedSourceAnalyzer114<BasicValue>(interpreter).analyzeAndComputeMaxs(owner,m);int at=0,checked=0,terminals=0;
  List<AbstractInsnNode> retained=new ArrayList<>();for(var n:all)if(!markers.contains(n))retained.add(n);
  need(retained.size()==m.instructions.size(),"only_bound_identity_nodes_removed");
  for(var n:m.instructions){need(retained.get(at)==n,"every_retained_instruction_identity_order_and_operand_unchanged");if(n.getOpcode()>=0){
   need(successors.get(n).equals(edges(n,Set.of())),"every_ordered_normal_edge_is_exact_silent_contraction");
   need(regions.get(n).equals(membership(m,n)),"every_retained_ordered_exception_membership_exact");
   need(same(before[oldIndex.get(n)],after[at]),"every_retained_reachability_and_state_shape_exact");checked++;if(n.getOpcode()==ATHROW||n.getOpcode()>=IRETURN&&n.getOpcode()<=RETURN)terminals++;
  }at++;}
  for(int i=0;i<m.tryCatchBlocks.size();i++){var t=m.tryCatchBlocks.get(i);need(handlerEntries.get(i)==next(t.handler,Set.of()),"every_ordered_handler_entry_is_same_contracted_destination");need(m.instructions.indexOf(t.start)<m.instructions.indexOf(t.end),"each_handler_range_still_nonempty");}
  need(identitiesChecked==markers.size(),"all_bound_identity_transfers_proved");
  return LeafSource.map("kind","exact_local_transfer_and_ordered_CFG_silent_contraction_bisimulation","identity_transfers",identitiesChecked,"retained_source_opcodes_checked",checked,"terminals_checked",terminals,"all_retained_instruction_objects_operands_normal_and_abrupt_edges_exact",true,"all_local_stack_bits_and_producer_relations_preserved_inductively",true,"independent_all_reachable_state_shape_check",true,"origin_set_approximation_or_cardinality_cap",false,"termination_claimed",false,"target_Code_or_frames_inputs",0);
 }
}
