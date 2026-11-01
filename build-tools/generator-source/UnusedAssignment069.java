import java.util.*;import java.util.regex.*;import com.google.gson.*;import org.objectweb.asm.*;import org.objectweb.asm.tree.*;
/** Explicit saved assignment witnesses for javac's wholly unused, LVT-omitted local only. */
public final class UnusedAssignment069 implements Opcodes {
 record Fact(String name,String descriptor,int compiler,int physical,VarInsnNode store){}
 static final Map<MethodNode,IdentityHashMap<AbstractInsnNode,Fact>> facts=new IdentityHashMap<>();
 static void need(boolean b,String s){ExecutableVerify.need(b,"unused_assignment069_"+s);}
 static int count(String text,Pattern p){int n=0;var m=p.matcher(text);while(m.find())n++;return n;}
 static Fact prove(MethodNode q,JsonObject r,JsonObject w,MethodInsnNode call,VarInsnNode store){
  String name=w.get("source_name").getAsString(),alias=w.get("compiler_alias").getAsString(),desc=w.get("value_descriptor").getAsString();Type type=Type.getType(desc);int physical=w.get("original_slot").getAsInt();String text=r.get("method_source").getAsString();
  need(type.getSize()==1&&type.getSort()>=Type.BOOLEAN&&type.getSort()<=Type.INT&&desc.equals("I"),"bounded_int_only");
  need(count(text,Pattern.compile("\\b"+Pattern.quote(name)+"\\b"))==2,"exactly_declaration_and_single_assignment_no_reads");
  need(count(text,Pattern.compile("\\bint\\s+"+Pattern.quote(name)+"\\s*;"))==1,"one_explicit_uninitialized_int_declaration");
  need(count(text,Pattern.compile("\\b"+Pattern.quote(name)+"\\s*=\\s*"+Pattern.quote(alias)+"\\s*\\("))==1,"one_explicit_saved_witness_assignment");
  var names=new TreeMap<String,Integer>();AdaptCFG.nominalSlotNames(r.get("complete_expression_AST"),names);var descriptors=new TreeMap<String,Set<String>>();LifetimeLocalBinding.types(r.get("complete_expression_AST"),descriptors);
  need(Objects.equals(names.get(name),physical)&&descriptors.getOrDefault(name,Set.of()).equals(Set.of(desc)),"exact_saved_AST_name_type_and_physical_slot");
  need(q.localVariables!=null&&q.localVariables.stream().noneMatch(v->v.name.equals(name)||v.index==store.var),"actual_javac_omitted_name_and_no_other_LVT_alias");
  need(store.getOpcode()==ISTORE,"actual_javac_int_store");int accesses=0;for(var n:q.instructions){if(n instanceof VarInsnNode v&&v.var==store.var){need(n==store,"only_one_actual_store_and_no_raw_slot_reads");accesses++;}if(n instanceof IincInsnNode v)need(v.var!=store.var,"no_raw_slot_increment");}need(accesses==1,"one_actual_raw_slot_access");
  var ops=LeafSource.ops(q);int at=ops.indexOf(store);need(at>0&&ops.get(at-1)==call,"actual_adjacent_witness_call_and_assignment_store");
  for(var n:q.instructions){if(n instanceof JumpInsnNode j)need(ExecutableVerify.target(q,j.label)!=at,"store_is_not_branch_entry");if(n instanceof TableSwitchInsnNode s){need(ExecutableVerify.target(q,s.dflt)!=at,"store_not_switch_default");for(var l:s.labels)need(ExecutableVerify.target(q,l)!=at,"store_not_switch_target");}if(n instanceof LookupSwitchInsnNode s){need(ExecutableVerify.target(q,s.dflt)!=at,"store_not_switch_default");for(var l:s.labels)need(ExecutableVerify.target(q,l)!=at,"store_not_switch_target");}}for(var h:q.tryCatchBlocks)need(ExecutableVerify.target(q,h.handler)!=at,"store_not_exception_entry");
  var fact=new Fact(name,desc,store.var,physical,store);var existing=facts.computeIfAbsent(q,k->new IdentityHashMap<>()).putIfAbsent(store,fact);need(existing==null||existing.equals(fact),"unique_actual_store_witness");return fact;
 }
 static Collection<Fact> all(MethodNode q){return facts.getOrDefault(q,new IdentityHashMap<>()).values();}
 static Fact at(MethodNode q,AbstractInsnNode n){return facts.getOrDefault(q,new IdentityHashMap<>()).get(n);}
}
