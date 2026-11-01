import com.google.gson.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;
import java.util.*;
import java.util.zip.*;
import java.io.*;

/** Fresh source carrier/handler union. Never opens original implementation/frames.
 * The retained toolchain dependency is generation-toolkit.zip, never an owned
 * implementation archive. This wrapper never invokes a historical comparison main.
 */
public final class PortableHandlerAdapter {
  static String s(JsonObject o,String k){return o.get(k).getAsString();}
  static Map<String,byte[]> archive(String path)throws Exception{
    Map<String,byte[]> data=new TreeMap<>();try(ZipFile z=new ZipFile(path)){for(ZipEntry e:Collections.list(z.entries()))if(!e.isDirectory()){
      if(data.containsKey(e.getName()))throw new IllegalArgumentException("duplicate exact JAR entry: "+e.getName());
      try(InputStream in=z.getInputStream(e)){data.put(e.getName(),in.readAllBytes());}
    }}return data;
  }
  static ClassNode parse(byte[] bytes){ClassNode c=new ClassNode();new ClassReader(bytes).accept(c,0);return c;}
  static MethodNode header(JsonObject row){
    String[] exceptions=new String[row.getAsJsonArray("exceptions").size()];int i=0;for(JsonElement e:row.getAsJsonArray("exceptions"))exceptions[i++]=e.getAsString();
    return new MethodNode(row.get("access").getAsInt(),s(row,"name"),s(row,"descriptor"),null,exceptions);
  }
  static void primitiveSavedDeclarationTypes108(JsonObject recipe,JsonElement value){if(value==null||value.isJsonNull())return;if(value.isJsonArray())for(var child:value.getAsJsonArray())primitiveSavedDeclarationTypes108(recipe,child);else if(value.isJsonObject()){JsonObject n=value.getAsJsonObject();if(n.has("catch_parameter_AST")){JsonObject parameter=n.getAsJsonObject("catch_parameter_AST");if(parameter.has("kind")&&s(parameter,"kind").equals("source_exception_stack_parameter")&&parameter.has("source_only_adjacent_store_load_erasure_required")&&parameter.get("source_only_adjacent_store_load_erasure_required").getAsBoolean()&&s(parameter,"name").equals(s(n,"catch_parameter"))&&s(parameter,"type").equals("L"+s(n,"catch_type")+";"))n.addProperty("source_only_rethrow_parameter",true);}if(n.has("kind")&&n.get("kind").getAsString().equals("local_declaration")&&n.has("name")&&!n.has("type")){String name=s(n,"name");var pattern=java.util.regex.Pattern.compile("\\b(boolean|byte|char|short|int|long|float|double)\\s+"+java.util.regex.Pattern.quote(name)+"\\s*=");var matcher=pattern.matcher(s(recipe,"method_source"));String type=null;int count=0;while(matcher.find()){type=matcher.group(1);count++;}if(count==1)n.addProperty("type",Map.of("boolean","Z","byte","B","char","C","short","S","int","I","long","J","float","F","double","D").get(type));}for(var child:n.entrySet())primitiveSavedDeclarationTypes108(recipe,child.getValue());}}
  static void bridgeCarrierQueryReceiver108(ClassNode raw,JsonObject r,JsonObject row){String name=row.has("query_method")?s(row,"query_method"):"f"+r.get("id").getAsInt(),expected=s(r,"query_descriptor");if(raw.methods.stream().anyMatch(m->m.name.equals(name)&&m.desc.equals(expected)))return;List<MethodNode> matches=raw.methods.stream().filter(m->m.name.equals(name)).toList();if(matches.size()!=1)throw new IllegalArgumentException("one actual compiler query projection required");var q=matches.get(0);String owner=s(row,"owner"),from="L"+owner+";",to="L"+raw.name+";";if(!s(row.getAsJsonObject("target"),"name").equals("<init>")||!raw.name.startsWith(owner+"$__SourceHandler_")||!expected.startsWith("("+from)||!q.desc.equals(expected.replace(from,to)))throw new IllegalArgumentException("only exact compiler carrier self type projection permitted");JsonArray saved=r.getAsJsonArray("bindings").deepCopy();for(var value:r.getAsJsonArray("bindings")){JsonObject b=value.getAsJsonObject();String descriptor=s(b,"query_descriptor"),projected=descriptor.replace(from,to);List<MethodNode> declarations=raw.methods.stream().filter(m->m.name.equals(s(b,"name"))).toList();if(declarations.size()!=1||!declarations.get(0).desc.equals(projected)||declarations.get(0).access!=(Opcodes.ACC_PRIVATE|Opcodes.ACC_STATIC|Opcodes.ACC_NATIVE))throw new IllegalArgumentException("carrier type bridge exact actual Code-free declaration projection");b.addProperty("query_descriptor",projected);}r.add("source_query_receiver_projection108",ExecutableVerify.JSON.toJsonTree(Map.of("saved_query_descriptor",expected,"actual_query_descriptor",q.desc,"saved_bindings",saved,"production_binding_operations_unchanged",true)));r.addProperty("query_descriptor",q.desc);}
  static void bindTrackedFragmentCategoryAliases118(ClassNode raw,JsonObject r){if(!r.has("all_fragment_bindings"))return;Map<String,JsonObject> tracked=new HashMap<>();for(var value:r.getAsJsonArray("all_fragment_bindings")){JsonObject b=value.getAsJsonObject();String name=s(b,"name");JsonObject prior=tracked.putIfAbsent(name,b);if(prior!=null&&!prior.equals(b))throw new IllegalArgumentException("distinct all-fragment binding records for same alias");}for(var value:r.getAsJsonArray("handler_fragment_recipes")){JsonObject h=value.getAsJsonObject();Set<String> bound=new HashSet<>();for(var b:h.getAsJsonArray("bindings"))bound.add(s(b.getAsJsonObject(),"name"));List<MethodNode> methods=raw.methods.stream().filter(m->m.name.equals(s(h,"query_name"))&&m.desc.equals(s(h,"query_descriptor"))).toList();if(methods.size()!=1)throw new IllegalArgumentException("one actual complete fragment query before tracked category binding");for(var node:methods.get(0).instructions)if(node instanceof MethodInsnNode call&&!bound.contains(call.name)&&tracked.containsKey(call.name)){JsonObject b=tracked.get(call.name),operation=b.getAsJsonObject("operation");if(!operation.has("adapter"))continue;if(!s(operation,"adapter").equals("JVM_integer_category_identity")||call.getOpcode()!=Opcodes.INVOKESTATIC||!call.owner.equals(raw.name)||!call.desc.equals(s(b,"query_descriptor")))throw new IllegalArgumentException("exact explicit tracked fragment category binding required");h.getAsJsonArray("bindings").add(b.deepCopy());bound.add(call.name);}}}
  static int sourceLocalBound(JsonElement value){
    int bound=0;
    if(value.isJsonObject()){
      JsonObject o=value.getAsJsonObject();
      for(String key:List.of("original_slot","physical_slot","catch_original_slot"))if(o.has(key)&&!o.get(key).isJsonNull())bound=Math.max(bound,o.get(key).getAsInt()+2);
      for(var e:o.entrySet())bound=Math.max(bound,sourceLocalBound(e.getValue()));
    }else if(value.isJsonArray())for(JsonElement e:value.getAsJsonArray())bound=Math.max(bound,sourceLocalBound(e));
    return bound;
  }
  /** Bridge only explicit saved handler-local bindings; never infer original slots from javac allocation. */
  static void bridgeLinearSpillLocalCoordinates(MethodNode query,JsonObject fragment){
    JsonArray saved=fragment.getAsJsonArray("source_local_bindings");boolean mismatch=false;
    for(var item:saved){var b=item.getAsJsonObject();if(s(b,"role").equals("real_handler_local")&&query.localVariables.stream().noneMatch(v->v.name.equals(s(b,"name"))&&v.desc.equals(s(b,"descriptor"))&&v.index==b.get("query_slot").getAsInt()))mismatch=true;}
    if(!mismatch)return;
    if(!fragment.has("method_source")||!fragment.has("complete_expression_AST"))throw new IllegalArgumentException("linear spill coordinate bridge needs saved Java and AST");
    Type[] args=Type.getArgumentTypes(query.desc);int abi=0;Map<String,JsonObject> bindings=new LinkedHashMap<>();
    for(var item:saved){var b=item.getAsJsonObject();if(bindings.put(s(b,"name"),b)!=null)throw new IllegalArgumentException("linear spill bridge unique saved name");String role=s(b,"role");if(!Set.of("exception_stack_query_only","original_caller_local_query_alias","real_handler_local").contains(role))throw new IllegalArgumentException("linear spill bridge unsupported real local role");}
    for(int i=0;i<args.length;i++){var b=bindings.get("p"+i);if(b==null||b.get("query_slot").getAsInt()!=abi||!s(b,"descriptor").equals(args[i].getDescriptor())||!s(b,"role").equals(i==0?"exception_stack_query_only":"original_caller_local_query_alias"))throw new IllegalArgumentException("linear spill bridge exact saved ABI coordinates");abi+=args[i].getSize();}
    int freshSlot=abi,virtualSlot=abi,spills=0;boolean declarationsClosed=false;Set<String> declarations=new LinkedHashSet<>();Map<Integer,Integer> relocation=new LinkedHashMap<>();List<Object> proof=new ArrayList<>();
    JsonArray explicitAllocation=new JsonArray();for(var value:fragment.getAsJsonArray("complete_expression_AST")){JsonObject node=value.getAsJsonObject();if(s(node,"kind").equals("source_scalar_stack_permutation")){JsonArray inputs=node.getAsJsonArray("inputs");if(inputs.isEmpty()||inputs.size()>4)throw new IllegalArgumentException("finite explicit scalar declaration inputs required");for(var input:inputs){JsonObject savedInput=input.getAsJsonObject(),declaration=new JsonObject();declaration.addProperty("kind","source_stack_spill_declaration");declaration.addProperty("name",s(savedInput,"name"));declaration.addProperty("type",s(savedInput,"descriptor"));explicitAllocation.add(declaration);}}else explicitAllocation.add(value);}
    for(var value:explicitAllocation){
      if(!value.isJsonObject())throw new IllegalArgumentException("linear spill bridge finite top-level AST");JsonObject node=value.getAsJsonObject();String kind=s(node,"kind");
      boolean temporary=kind.equals("source_stack_spill_declaration")||kind.equals("source_stack_transport_declaration"),real=kind.equals("local_declaration");
      if(!temporary&&!real){declarationsClosed=true;continue;}
      /* Intervening top-level effects do not allocate a local. Every actual declaration width, initializer store, LVT name and complete allocation bound below remains exact; the joint whole-CFG proof is still mandatory. */String name=s(node,"name");if(!declarations.add(name))throw new IllegalArgumentException("linear spill bridge unique declaration name");JsonObject binding=bindings.get(name);String descriptor;
      if(temporary){if(binding!=null)throw new IllegalArgumentException("linear spill cannot replace real saved binding");descriptor=s(node,"type");spills++;}
      else{
        if(binding==null||!s(binding,"role").equals("real_handler_local")||node.get("original_slot").getAsInt()!=virtualSlot||binding.get("query_slot").getAsInt()!=virtualSlot)throw new IllegalArgumentException("linear spill real virtual slot must match explicit AST and saved binding");
        descriptor=s(binding,"descriptor");String spelling=Type.getType(descriptor).getClassName().replace('$','.');if(!java.util.regex.Pattern.compile("\\b"+java.util.regex.Pattern.quote(spelling)+"\\s+"+java.util.regex.Pattern.quote(name)+"\\s*=").matcher(s(fragment,"method_source")).find())throw new IllegalArgumentException("linear spill saved real declaration exact type");
        if(node.has("type")&&!s(node,"type").equals(descriptor))throw new IllegalArgumentException("linear spill AST real descriptor mismatch");
      }
      Type type=Type.getType(descriptor);if(type.getSort()==Type.VOID||type.getSort()==Type.METHOD)throw new IllegalArgumentException("linear spill finite value descriptor");var lvs=query.localVariables.stream().filter(v->v.name.equals(name)).toList();
      if(lvs.size()!=1||!lvs.get(0).desc.equals(descriptor)||lvs.get(0).index!=freshSlot)throw new IllegalArgumentException("linear spill allocation must equal saved declaration prefix widths, not inferred LVT relocation");
      var lv=lvs.get(0);AbstractInsnNode store=lv.start.getPrevious();while(store!=null&&store.getOpcode()<0)store=store.getPrevious();if(!(store instanceof VarInsnNode v)||v.var!=freshSlot||v.getOpcode()!=type.getOpcode(Opcodes.ISTORE))throw new IllegalArgumentException("linear spill one actual initializer store before LVT");
      if(!temporary){relocation.put(virtualSlot,freshSlot);proof.add(Map.of("name",name,"descriptor",descriptor,"saved_virtual_query_slot",virtualSlot,"fresh_query_slot",freshSlot,"physical_slot_unchanged",binding.get("physical_slot").getAsInt()));virtualSlot+=type.getSize();}
      freshSlot+=type.getSize();
    }
    if(spills==0||relocation.isEmpty()||freshSlot!=query.maxLocals)throw new IllegalArgumentException("linear spill bridge exact complete fresh allocation bound");
    for(var b:bindings.values())if(s(b,"role").equals("real_handler_local")&&!declarations.contains(s(b,"name")))throw new IllegalArgumentException("linear spill every real binding explicitly declared");
    Set<String> names=new HashSet<>(declarations);for(int i=0;i<args.length;i++)names.add("p"+i);if(query.localVariables.size()!=names.size()||!query.localVariables.stream().allMatch(v->names.contains(v.name)))throw new IllegalArgumentException("linear spill no unrecorded actual LVT name");
    // Prove the complete actual fresh CFG before changing any source coordinate.
    // The original saved physical-slot mappings remain untouched.
    Object transportProof;
    try{MethodNode copy=new MethodNode(query.access,query.name,query.desc,query.signature,query.exceptions.toArray(String[]::new));query.accept(copy);transportProof=CombinedSourceTransportScalarProof.erase(copy,fragment).proof();}
    catch(Exception error){throw new IllegalArgumentException("linear spill joint producer/consumer proof failed",error);}
    fragment.add("source_only_saved_virtual_to_fresh_query_slot_bridge",ExecutableVerify.JSON.toJsonTree(Map.of("saved_bindings",saved.deepCopy(),"explicit_declaration_layout",proof,"actual_joint_transport_proof",transportProof,"original_physical_slots_changed",false)));
    remapLinearLocalAST(fragment.getAsJsonArray("complete_expression_AST"),relocation);
    for(var b:bindings.values())if(s(b,"role").equals("real_handler_local")){int old=b.get("query_slot").getAsInt();b.addProperty("query_slot",relocation.get(old));}
  }
  static void remapLinearLocalAST(JsonElement value,Map<Integer,Integer> relocation){
    if(value.isJsonArray())for(var item:value.getAsJsonArray())remapLinearLocalAST(item,relocation);
    else if(value.isJsonObject()){JsonObject node=value.getAsJsonObject();if(node.has("kind")&&Set.of("local","local_declaration").contains(s(node,"kind"))&&node.has("original_slot")){int old=node.get("original_slot").getAsInt();if(relocation.containsKey(old))node.addProperty("original_slot",relocation.get(old));}for(var entry:node.entrySet())remapLinearLocalAST(entry.getValue(),relocation);}
  }
  static void bindLegacyHandlerSource(ClassNode raw,JsonObject recipe,JsonObject fragment,String owner){
    if(fragment.has("query_physical_local_bound"))return;
    if(!fragment.has("source_local_bindings"))return;
    String name=s(fragment,"query_name"),descriptor=s(fragment,"query_descriptor");
    List<MethodNode> matches=raw.methods.stream().filter(m->m.name.equals(name)&&m.desc.equals(descriptor)).toList();
    if(matches.size()!=1)throw new IllegalArgumentException("one fresh saved handler query required");MethodNode query=matches.get(0);
    if((query.access&Opcodes.ACC_STATIC)==0||query.localVariables==null)throw new IllegalArgumentException("explicit handler query must be static with fresh LVT");
    bridgeLinearSpillLocalCoordinates(query,fragment);
    Type[] arguments=Type.getArgumentTypes(descriptor);Map<String,JsonObject> bindings=new TreeMap<>();Map<Integer,Integer> mapping=new TreeMap<>();
    for(var item:fragment.getAsJsonArray("source_local_bindings")){
      JsonObject binding=item.getAsJsonObject();String local=s(binding,"name"),type=s(binding,"descriptor"),role=s(binding,"role");int slot=binding.get("query_slot").getAsInt();
      if(bindings.put(local,binding)!=null||slot<0||slot+Type.getType(type).getSize()>query.maxLocals)throw new IllegalArgumentException("unique bounded explicit handler local binding required");
      if(query.localVariables.stream().noneMatch(v->v.name.equals(local)&&v.desc.equals(type)&&v.index==slot))throw new IllegalArgumentException("saved handler local must match actual fresh name/descriptor/query-slot");
      if(role.equals("exception_stack_query_only")){if(!local.equals("p0")||slot!=0||arguments.length==0||!type.equals(arguments[0].getDescriptor())||binding.has("physical_slot")&&!binding.get("physical_slot").isJsonNull())throw new IllegalArgumentException("one exact leading exception ABI input only");}
      else if(role.equals("original_caller_local_query_alias")||role.equals("real_catch_local")||role.equals("real_handler_local")){
        if(!binding.has("physical_slot"))throw new IllegalArgumentException("saved handler physical slot required");int physical=binding.get("physical_slot").getAsInt();
        if(physical<0||physical+Type.getType(type).getSize()>recipe.get("declared_physical_local_bound").getAsInt()||mapping.put(slot,physical)!=null)throw new IllegalArgumentException("unique bounded saved handler physical mapping required");
      }else throw new IllegalArgumentException("unsupported saved handler-local binding role");
    }
    int slot=0;for(int i=0;i<arguments.length;i++){var binding=bindings.get("p"+i);if(binding==null||binding.get("query_slot").getAsInt()!=slot||!s(binding,"descriptor").equals(arguments[i].getDescriptor())||!s(binding,"role").equals(i==0?"exception_stack_query_only":"original_caller_local_query_alias"))throw new IllegalArgumentException("each saved handler ABI parameter exactly bound");slot+=arguments[i].getSize();}
    if(!bindings.containsKey("p0"))throw new IllegalArgumentException("saved exception input binding required");
    Set<String> sourceTemporaries=new HashSet<>(SpillProof.names(fragment));sourceTemporaries.addAll(ScalarStackOperationProof.names(fragment));
    if(!Collections.disjoint(sourceTemporaries,bindings.keySet()))throw new IllegalArgumentException("handler source temporaries cannot replace saved real bindings");
    Set<String> actualLocals=new HashSet<>();
    for(var local:query.localVariables){
      if(!actualLocals.add(local.name))throw new IllegalArgumentException("one lexical source handler local name required");
      var binding=bindings.get(local.name);
      if(binding==null){if(!sourceTemporaries.contains(local.name))throw new IllegalArgumentException("handler LVT local has no saved real or temporary binding");}
      else if(!s(binding,"descriptor").equals(local.desc)||binding.get("query_slot").getAsInt()!=local.index)throw new IllegalArgumentException("every fresh real handler LVT must match explicit saved binding");
    }
    Set<String> expectedLocals=new HashSet<>(bindings.keySet());expectedLocals.addAll(sourceTemporaries);
    if(!actualLocals.equals(expectedLocals))throw new IllegalArgumentException("every saved real and temporary handler local must have actual fresh LVT");
    // Temporaries remain in the fresh query. AdaptCFG.lower must prove and erase
    // them with CombinedSourceTransportScalarProof before physical-local mapping.

    var ast=fragment.getAsJsonArray("complete_expression_AST");if(ast==null)throw new IllegalArgumentException("saved handler expression AST required");
    for(var binding:bindings.values())if(s(binding,"role").equals("real_handler_local")){
      String local=s(binding,"name"),type=s(binding,"descriptor");int querySlot=binding.get("query_slot").getAsInt();
      if(querySlot<slot)throw new IllegalArgumentException("real handler local cannot alias query ABI parameter");
      String spelling=Type.getType(type).getClassName().replace('$','.');
      if(!fragment.has("method_source")||!java.util.regex.Pattern.compile("\\b"+java.util.regex.Pattern.quote(spelling)+"\\s+"+java.util.regex.Pattern.quote(local)+"\\s*=").matcher(s(fragment,"method_source")).find())throw new IllegalArgumentException("saved real handler local declaration type required");
      if(bindRealHandlerLocalAST(ast,local,type,querySlot)!=1)throw new IllegalArgumentException("one explicit saved handler local AST declaration required");
    }
    for(var binding:bindings.values())if(s(binding,"role").equals("real_catch_local")){
      String local=s(binding,"name"),type=s(binding,"descriptor");int querySlot=binding.get("query_slot").getAsInt();
      if(querySlot<slot)throw new IllegalArgumentException("catch local cannot alias query ABI parameter");
      var recorded=new TreeMap<String,Integer>();AdaptCFG.nominalSlotNames(ast,recorded);
      if(recorded.containsKey(local))throw new IllegalArgumentException("legacy catch-local bridge requires no duplicate AST declaration");
      JsonObject declaration=new JsonObject();declaration.addProperty("kind","uninitialized_local_declaration");declaration.addProperty("name",local);declaration.addProperty("type",type);declaration.addProperty("original_slot",querySlot);declaration.addProperty("binding_origin","explicit_saved_source_local_binding_query_slot_validated_against_fresh_LVT");ast.add(declaration);
    }
    JsonArray identities=fragment.getAsJsonArray("source_operation_identities");if(identities==null||identities.isEmpty())throw new IllegalArgumentException("complete saved handler source identities required");String entry=identities.get(0).getAsString();
    if(fragment.has("entry_source_node_id")&&!s(fragment,"entry_source_node_id").equals(entry))throw new IllegalArgumentException("saved handler entry must be its first actual source identity");
    boolean used=false;for(var item:recipe.getAsJsonArray("ordered_source_exception_region_rules"))if(s(item.getAsJsonObject(),"entry_source_node_id").equals(entry))used=true;
    if(!used)throw new IllegalArgumentException("handler entry must be named by saved ordered exception regions");fragment.addProperty("entry_source_node_id",entry);
    JsonArray abi=new JsonArray();for(String value:List.of("source_query_only",owner,"method",name,descriptor))abi.add(value);fragment.add("source_query_ABI_identity",abi);
    JsonArray slots=new JsonArray();for(var e:mapping.entrySet()){JsonObject row=new JsonObject();row.addProperty("query_slot",e.getKey());row.addProperty("physical_slot",e.getValue());slots.add(row);}fragment.add("source_only_query_to_physical_local_slots",slots);fragment.addProperty("query_physical_local_bound",query.maxLocals);
  }
  static int bindRealHandlerLocalAST(JsonElement value,String name,String descriptor,int querySlot){
    int found=0;
    if(value.isJsonArray())for(var item:value.getAsJsonArray())found+=bindRealHandlerLocalAST(item,name,descriptor,querySlot);
    else if(value.isJsonObject()){
      JsonObject node=value.getAsJsonObject();
      if(node.has("kind")&&s(node,"kind").equals("local_declaration")&&node.has("name")&&s(node,"name").equals(name)){
        if(!node.has("original_slot")||node.get("original_slot").getAsInt()!=querySlot||node.has("type")&&!s(node,"type").equals(descriptor))throw new IllegalArgumentException("saved real handler AST local slot/type differs");
        node.addProperty("type",descriptor);found++;
      }
      for(var item:node.entrySet())found+=bindRealHandlerLocalAST(item.getValue(),name,descriptor,querySlot);
    }
    return found;
  }
  static void validateCarrierResiduals(Map<String,byte[]> entries){for(var entry:entries.entrySet())if(entry.getKey().endsWith(".class")){ClassNode c=parse(entry.getValue());if(c.name.contains("__SourceHandler_"))throw new IllegalArgumentException("unadapted source handler carrier remains: "+c.name);for(MethodNode m:c.methods)for(AbstractInsnNode n:m.instructions)if(n instanceof MethodInsnNode call&&call.owner.contains("__SourceHandler_"))throw new IllegalArgumentException("source handler carrier invocation remains: "+c.name+"."+m.name);}}
  static void validateFinal(Map<String,byte[]> entries,JsonArray abiPlan){
    Set<String> exactPlannedSourceAliasCallers=new HashSet<>();
    for(var item:abiPlan){JsonObject row=item.getAsJsonObject();String owner=s(row,"owner");for(var alias:row.getAsJsonArray("method_aliases")){JsonObject a=alias.getAsJsonObject();if(!s(a,"owner").equals(owner))throw new IllegalArgumentException("ABI alias owner differs from exact owning row");exactPlannedSourceAliasCallers.add(owner+"."+s(a,"source_name")+s(a,"descriptor"));}}
    for(var entry:entries.entrySet())if(entry.getKey().endsWith(".class")){
      ClassNode c=parse(entry.getValue());
      if(c.name.contains("__SourceHandler_"))throw new IllegalArgumentException("unadapted source handler carrier remains: "+c.name);
      for(MethodNode m:c.methods){
        if(m.name.startsWith("__sourceHandlerCall_"))throw new IllegalArgumentException("compile-only handler bridge declaration remains: "+c.name+"."+m.name+m.desc);
        String caller=c.name+"."+m.name+m.desc;boolean plannedSourceAlias=exactPlannedSourceAliasCallers.contains(caller);
        for(AbstractInsnNode n:m.instructions)if(n instanceof MethodInsnNode call){
          if(call.owner.contains("__SourceHandler_"))throw new IllegalArgumentException("source handler carrier invocation remains: "+c.name+"."+m.name);
          if(call.name.startsWith("__sourceHandlerCall_")&&!plannedSourceAlias)throw new IllegalArgumentException("handler compile bridge invocation outside exact planned ABI source alias: "+c.name+"."+m.name+m.desc);
        }
      }
    }
  }
  public static void main(String[] args)throws Exception{
    if((args.length==2||args.length==3)&&args[0].equals("--validate-final")){JsonArray aliases=args.length==3?JsonParser.parseString(Files.readString(Path.of(args[2]))).getAsJsonArray():new JsonArray();validateFinal(archive(args[1]),aliases);System.out.println("{\"handler_compiler_intermediaries\":0}");return;}
    if(args.length<4)throw new IllegalArgumentException("PortableHandlerAdapter fresh.jar METHOD_PLAN.json output.jar REPORT.json [fresh/provider hierarchy.jar...]");
    if(Files.exists(Path.of(args[2]))||Files.exists(Path.of(args[3])))throw new IllegalArgumentException("handler output and report must be new");
    Map<String,byte[]> entries=archive(args[0]);JsonArray plan=JsonParser.parseString(Files.readString(Path.of(args[1]))).getAsJsonArray();
    ConstructorSourceAdapter.Hierarchy hierarchy=new ConstructorSourceAdapter.Hierarchy();
    for(var e:entries.entrySet())if(e.getKey().endsWith(".class"))hierarchy.add(e.getValue());
    for(int i=4;i<args.length;i++){
      if(args[i].endsWith(".json")){
        JsonObject declarations=JsonParser.parseString(Files.readString(Path.of(args[i]))).getAsJsonObject();
        for(var entry:declarations.entrySet()){
          JsonObject d=entry.getValue().getAsJsonObject();List<String> interfaces=new ArrayList<>();for(JsonElement it:d.getAsJsonArray("interfaces"))interfaces.add(it.getAsString());
          hierarchy.shapes.putIfAbsent(s(d,"owner"),new ConstructorSourceAdapter.Shape(s(d,"owner"),d.get("super").isJsonNull()?null:s(d,"super"),interfaces,(d.get("access").getAsInt()&Opcodes.ACC_INTERFACE)!=0));
        }
      }else for(var e:archive(args[i]).entrySet())if(e.getKey().endsWith(".class")&&!e.getKey().startsWith("META-INF/"))hierarchy.add(e.getValue());
    }
    Path planDirectory=Path.of(args[1]).toAbsolutePath().normalize().getParent().toRealPath();
    SourceLexicalCycleDomain.root=planDirectory;Map<String,JsonObject> sourceUnits=new HashMap<>();for(var unit:JsonParser.parseString(Files.readString(planDirectory.resolve("source-units.json"))).getAsJsonObject().getAsJsonArray("units")){JsonObject u=unit.getAsJsonObject();if(sourceUnits.put(s(u,"owner"),u)!=null)throw new IllegalArgumentException("one current source unit per owner");}
    Map<String,ClassNode> outputs=new TreeMap<>();JsonArray reports=new JsonArray();Set<String> carriers=new HashSet<>();
    for(JsonElement e:plan){
      JsonObject row=e.getAsJsonObject();
      if(!row.has("recipe_path")||!row.has("recipe_sha256"))throw new IllegalArgumentException("compact handler plan requires relative recipe_path and SHA256");
      Path relative=Path.of(s(row,"recipe_path"));
      if(relative.isAbsolute())throw new IllegalArgumentException("handler recipe must be portable and relative to plan");
      Path recipePath=planDirectory.resolve(relative).normalize().toRealPath();
      if(!recipePath.startsWith(planDirectory))throw new IllegalArgumentException("handler recipe resolves outside plan directory");
      byte[] recipeBytes=Files.readAllBytes(recipePath);
      String recipeHash=HexFormat.of().withUpperCase().formatHex(java.security.MessageDigest.getInstance("SHA-256").digest(recipeBytes));
      if(!recipeHash.equalsIgnoreCase(s(row,"recipe_sha256")))throw new IllegalArgumentException("handler source-region recipe SHA mismatch");
      JsonObject r=JsonParser.parseString(new String(recipeBytes,java.nio.charset.StandardCharsets.UTF_8)).getAsJsonObject();
      String owner=s(row,"owner"),carrier=s(row,"carrier");System.err.println("HANDLER_BEGIN "+reports.size()+"/"+plan.size()+" "+owner+"."+s(row.getAsJsonObject("target"),"name")+s(row.getAsJsonObject("target"),"descriptor"));
      if(sourceUnits.containsKey(owner)){JsonObject unit=sourceUnits.get(owner),binding=new JsonObject();Path source=planDirectory.resolve(s(unit,"path")).normalize();if(!source.startsWith(planDirectory))throw new IllegalArgumentException("current compiler source escapes repository");binding.addProperty("path",s(unit,"path"));binding.addProperty("size",Files.size(source));binding.addProperty("sha256",s(unit,"source_sha256"));if(r.has("actual_saved_compiler_source_binding"))r.add("historical_compiler_source_binding_preserved",r.get("actual_saved_compiler_source_binding").deepCopy());r.add("actual_saved_compiler_source_binding",binding);}
      ClassNode raw=parse(Objects.requireNonNull(entries.get(carrier+".class"),"fresh carrier missing"));MethodNode targetHeader=header(row.getAsJsonObject("target"));
      carriers.add(carrier);
      // Older saved source schemas omit physical maxima. Use only fresh javac
      // bounds and explicit source local slots, never an original Code attribute.
      if(!r.has("declared_physical_stack_bound"))r.addProperty("declared_physical_stack_bound",raw.methods.stream().mapToInt(m->m.maxStack).max().orElse(0));
      if(!r.has("declared_physical_local_bound"))r.addProperty("declared_physical_local_bound",Math.max(sourceLocalBound(r),raw.methods.stream().mapToInt(m->m.maxLocals).max().orElse(0)));
      if(!r.has("ordered_source_exception_region_rules"))r.add("ordered_source_exception_region_rules",new JsonArray());
      if(!r.has("handler_fragment_recipes"))r.add("handler_fragment_recipes",new JsonArray());
      for(JsonElement region:r.getAsJsonArray("ordered_source_exception_region_rules")){
        JsonObject rule=region.getAsJsonObject();boolean catchall=!rule.has("exception_type")||rule.get("exception_type").isJsonNull();
        if(rule.has("catchall")&&rule.get("catchall").getAsBoolean()!=catchall)throw new IllegalArgumentException("source catchall/exception type disagreement");rule.addProperty("catchall",catchall);
      }
      bindTrackedFragmentCategoryAliases118(raw,r);
      for(JsonElement fragment:r.getAsJsonArray("handler_fragment_recipes")){
        JsonObject h=fragment.getAsJsonObject();bindLegacyHandlerSource(raw,r,h,owner);if(h.has("query_physical_local_bound"))continue;
        String hn=s(h,"query_name"),hd=s(h,"query_descriptor");MethodNode hm=raw.methods.stream().filter(m->m.name.equals(hn)&&m.desc.equals(hd)).findFirst().orElseThrow();
        if(Type.getArgumentTypes(hd).length!=1||hm.localVariables==null||hm.localVariables.size()!=1||!hm.localVariables.get(0).name.equals("p0"))throw new IllegalArgumentException("old handler schema needs explicit caller-local binding metadata");
        for(AbstractInsnNode n:hm.instructions)if(n instanceof VarInsnNode v&&v.var!=0||n instanceof IincInsnNode)throw new IllegalArgumentException("old handler schema has unmapped local access");
        h.addProperty("query_physical_local_bound",hm.maxLocals);
        JsonArray abi=new JsonArray();for(String v:List.of("source_query_only",owner,"method",hn,hd))abi.add(v);h.add("source_query_ABI_identity",abi);
        h.add("source_only_query_to_physical_local_slots",new JsonArray());
        JsonArray ids=new JsonArray();long count=Arrays.stream(hm.instructions.toArray()).filter(n->n.getOpcode()>=0&&n.getOpcode()!=Opcodes.GOTO).count()-1;
        String prefix=s(h,"entry_source_node_id");prefix=prefix.substring(0,prefix.lastIndexOf(':')+1);for(int i=0;i<count;i++)ids.add(prefix+i);h.add("source_operation_identities",ids);
      }
      primitiveSavedDeclarationTypes108(r,r.get("complete_expression_AST"));bridgeCarrierQueryReceiver108(raw,r,row);
      // This source-only API uses fresh compiler instructions, recorded source
      // operation identities, exact source-local bindings and ordered regions.
      MethodNode result;int sourceOperations;
      if(r.getAsJsonArray("handler_fragment_recipes").isEmpty()){
        String queryName=row.has("query_method")?s(row,"query_method"):"f"+r.get("id").getAsInt();String queryDescriptor=s(r,"query_descriptor");
        MethodNode query=raw.methods.stream().filter(m->m.name.equals(queryName)&&m.desc.equals(queryDescriptor)).findFirst().orElseThrow();
        targetHeader.maxStack=r.get("declared_physical_stack_bound").getAsInt();targetHeader.maxLocals=r.get("declared_physical_local_bound").getAsInt();
        result=AdaptCFG.lower(raw,query,targetHeader,r);sourceOperations=(int)Arrays.stream(result.instructions.toArray()).filter(n->n.getOpcode()>=0).count();
      }else{
        var generated=NestedHandlerCFGUnion.generate(raw,r,targetHeader);result=generated.method();sourceOperations=generated.ids().size();
      }
      ClassNode target=outputs.get(owner);
      if(target==null){
        byte[] existing=entries.get(owner+".class");
        if(existing==null)throw new IllegalArgumentException("fresh complete owner missing; declaration fallback forbidden: "+owner);
        target=parse(existing);
        outputs.put(owner,target);
      }
      if(result.name.equals("<init>"))ConstructorSourceAdapter.verifyInitialization(owner,target.superName,result);
      MethodNode existingMethod=target.methods.stream().filter(m->m.name.equals(result.name)&&m.desc.equals(result.desc)).findFirst().orElse(null);
      if(existingMethod!=null){result.signature=existingMethod.signature;result.visibleAnnotations=existingMethod.visibleAnnotations;result.invisibleAnnotations=existingMethod.invisibleAnnotations;result.visibleParameterAnnotations=existingMethod.visibleParameterAnnotations;result.invisibleParameterAnnotations=existingMethod.invisibleParameterAnnotations;}
      target.methods.removeIf(m->m.name.equals(result.name)&&m.desc.equals(result.desc));target.methods.add(result);
      if(row.has("compile_bridge")){
        JsonObject bridge=row.getAsJsonObject("compile_bridge");List<MethodNode> declarations=target.methods.stream().filter(m->m.name.equals(s(bridge,"name"))&&m.desc.equals(s(bridge,"descriptor"))).toList();
        if(declarations.size()!=1||(declarations.get(0).access&(Opcodes.ACC_NATIVE|Opcodes.ACC_STATIC))!=(Opcodes.ACC_NATIVE|Opcodes.ACC_STATIC))throw new IllegalArgumentException("exact compile-only handler bridge declaration missing");target.methods.remove(declarations.get(0));
      }
      if(row.has("restore_field_access"))for(JsonElement value:row.getAsJsonArray("restore_field_access")){
        JsonObject field=value.getAsJsonObject();FieldNode f=target.fields.stream().filter(x->x.name.equals(s(field,"name"))&&x.desc.equals(s(field,"descriptor"))).findFirst().orElseThrow();f.access=field.get("access").getAsInt();
      }
      JsonObject receipt=new JsonObject();receipt.addProperty("owner",owner);receipt.addProperty("method",result.name+result.desc);receipt.addProperty("recipe_path",s(row,"recipe_path"));receipt.addProperty("recipe_sha256",recipeHash);receipt.addProperty("source_operations",sourceOperations);receipt.addProperty("fresh_exception_regions",result.tryCatchBlocks.size());receipt.addProperty("old_Code_frame_inputs",0);reports.add(receipt);
    }
    for(var e:outputs.entrySet()){
      ClassNode c=e.getValue();if(c.nestMembers!=null)c.nestMembers.removeIf(carriers::contains);c.innerClasses.removeIf(i->carriers.contains(i.name));
      for(MethodNode m:c.methods){if(m.name.startsWith("__sourceHandlerCall_"))throw new IllegalArgumentException("unplanned source handler bridge declaration remains");for(AbstractInsnNode n:m.instructions)if(n instanceof MethodInsnNode call&&carriers.contains(call.owner))throw new IllegalArgumentException("source handler carrier invocation remains: "+c.name+"."+m.name); }
      ClassWriter writer=new ClassWriter(ClassWriter.COMPUTE_FRAMES|ClassWriter.COMPUTE_MAXS){@Override protected String getCommonSuperClass(String a,String b){return hierarchy.common(a,b);}};c.accept(writer);entries.put(e.getKey()+".class",writer.toByteArray());
    }
    for(String carrier:carriers)entries.keySet().removeIf(k->k.equals(carrier+".class")||k.startsWith(carrier+"$"));
    validateCarrierResiduals(entries);
    try(ZipOutputStream z=new ZipOutputStream(Files.newOutputStream(Path.of(args[2]),StandardOpenOption.CREATE_NEW))){for(var e:entries.entrySet()){ZipEntry ze=new ZipEntry(e.getKey());ze.setTime(0);z.putNextEntry(ze);z.write(e.getValue());z.closeEntry();}}
    JsonObject report=new JsonObject();report.addProperty("owners",outputs.size());report.addProperty("methods",plan.size());report.addProperty("output_entries",entries.size());report.addProperty("application_classes_loaded",0);report.addProperty("old_Code_frame_inputs",0);report.add("rows",reports);Files.writeString(Path.of(args[3]),new GsonBuilder().setPrettyPrinting().create().toJson(report));System.out.println(report);
  }
}
