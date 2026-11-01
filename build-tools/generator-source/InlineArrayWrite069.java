import java.util.*;import com.google.gson.*;import org.objectweb.asm.*;import org.objectweb.asm.tree.*;import org.objectweb.asm.tree.analysis.*;
/** Explicit saved reference-array write, with one earlier duplicate array survivor. */
public final class InlineArrayWrite069 implements Opcodes {
 static void need(boolean b,String s){ExecutableVerify.need(b,"source_inline_array_write069_"+s);}
 static List<Integer> order(JsonObject r,List<JsonObject> rules){
  need(r.get("opcode").getAsInt()==AASTORE,"only_reference_array_write");
  for(String p:List.of("explicit_initialized_array_write","all_arguments_evaluated_in_original_stack_order","all_inputs_initialized","Object_is_compile_only_tuple_token_not_original_ancestry"))need(r.has(p)&&r.get(p).getAsBoolean(),"explicit_saved_"+p);
  need(!r.get("runtime_query_evaluated").getAsBoolean()&&!r.get("original_Code_frames_or_common_type_oracle_used").getAsBoolean(),"compile_only_without_reference_oracle");
  String array=r.get("array_descriptor").getAsString(),element=r.get("element_descriptor").getAsString();Type at=Type.getType(array),et=Type.getType(element);
  need(at.getSort()==Type.ARRAY&&at.getDimensions()==1&&at.getElementType().equals(et)&&et.getSort()==Type.OBJECT,"one_dimensional_exact_reference_element");
  var in=r.getAsJsonArray("inputs");need(in.size()==4,"one_survivor_and_three_write_operands");String[] types={array,array,"I",element};var args=Type.getArgumentTypes(r.get("pack_descriptor").getAsString());need(args.length==4&&Type.getReturnType(r.get("pack_descriptor").getAsString()).getDescriptor().equals("Ljava/lang/Object;"),"exact_compile_tuple_signature");
  for(int i=0;i<4;i++)need(in.get(i).getAsJsonObject().get("type").getAsString().equals(types[i])&&args[i].getDescriptor().equals(types[i]),"saved_and_actual_argument_descriptor_"+i);
  var first=in.get(0).getAsJsonObject().getAsJsonObject("value");var second=in.get(1).getAsJsonObject().getAsJsonObject("value");
  need(first.get("kind").getAsString().equals("source_inline_stack_projection")&&second.get("kind").getAsString().equals("source_inline_stack_projection")&&first.get("input_index").getAsInt()==0&&second.get("input_index").getAsInt()==0,"saved_same_array_projection_indexes");
  var matches=new ArrayList<JsonObject>();for(var prior:rules)if(prior.get("opcode").getAsInt()==DUP&&prior.getAsJsonArray("projections").size()==2){var p=prior.getAsJsonArray("projections");if(p.get(0).getAsJsonObject().get("name").equals(first.get("name"))&&p.get(1).getAsJsonObject().get("name").equals(second.get("name")))matches.add(prior);}
  need(matches.size()==1,"both_saved_projections_of_one_prior_DUP");var prior=matches.get(0);need(prior.getAsJsonArray("inputs").size()==1&&prior.getAsJsonArray("inputs").get(0).getAsJsonObject().get("type").getAsString().equals(array),"prior_DUP_exact_array_type");
  need(prior.getAsJsonArray("output_input_indexes").toString().equals("[0,0]"),"prior_DUP_preserves_same_array_twice");return List.of(0);
 }
 static Object actual(JsonObject r,MethodInsnNode call,Frame<SourceValue> before,Frame<SourceValue> after,Map<AbstractInsnNode,Integer> indexes){
  need(before!=null&&after!=null&&before.getStackSize()>=4&&after.getStackSize()>=4,"reachable_actual_write_arguments");int f=before.getStackSize()-4,g=after.getStackSize()-4;
  for(int i=0;i<4;i++)need(Objects.equals(before.getStack(f+i),after.getStack(g+i)),"each_actual_argument_producer_order_"+i);
  var survivor=before.getStack(f);need(survivor.equals(before.getStack(f+1))&&survivor.size==1,"actual_array_survivor_and_write_receiver_same_producer");
  need(survivor.insns.size()==1,"single_actual_array_allocation_producer");var allocation=survivor.insns.iterator().next();need(allocation instanceof TypeInsnNode t&&t.getOpcode()==ANEWARRAY&&("[L"+t.desc+";").equals(r.get("array_descriptor").getAsString()),"actual_exact_reference_array_allocation");
  need(before.getStack(f+2).size==1&&before.getStack(f+3).size==1,"actual_int_index_and_reference_value_widths");
  var result=new Frame<SourceValue>(after);try{result.execute(new InsnNode(AASTORE),new SourceInterpreter());}catch(AnalyzerException e){throw new AssertionError("source_inline_array_write069_actual_write_stack",e);}
  need(result.getStackSize()==after.getStackSize()-3&&result.getStack(result.getStackSize()-1).equals(after.getStack(g)),"actual_write_consumes_three_and_preserves_prior_array");
  return CFGSource.map("pack",call.name,"actual_pack_instruction",indexes.get(call),"actual_array_allocation_instruction",indexes.get(allocation),"all_four_argument_producers_exact",true,"same_prior_array_survives",true,"inserted_effectful_opcode",AASTORE,"effect_restored_after_all_argument_evaluations",true,"original_Code_or_frames_inputs",0);
 }
}
