package net.minecraft.client.renderer.block.model;


public class ModelBlockDefinition$Deserializer implements com.google.gson.JsonDeserializer<net.minecraft.client.renderer.block.model.ModelBlockDefinition> {

public ModelBlockDefinition$Deserializer() {
super();
}


protected moom.l4 a(com.google.gson.JsonDeserializationContext p0, java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement> p1) {
java.lang.String life3_3;
    java.util.ArrayList life4_5;
    com.google.gson.JsonElement life5_9;
    java.util.Iterator life6_16;
    com.google.gson.JsonElement life7_23;
    forest_join_42: {
    forest_join_34: {
    forest_join_33: {
    life3_3 = ((java.lang.String)(((java.util.Map.Entry)(p1)).getKey()));
    life4_5 = com.google.common.collect.Lists.newArrayList();
    life5_9 = ((com.google.gson.JsonElement)(((java.util.Map.Entry)(p1)).getValue()));
    if (!(((com.google.gson.JsonElement)(life5_9)).isJsonArray())) {
        break forest_join_34;
    }
    life6_16 = ((com.google.gson.JsonArray)(((com.google.gson.JsonElement)(life5_9)).getAsJsonArray())).iterator();
    forest_cycle_17: while (true) {
    if (!(((java.util.Iterator)(life6_16)).hasNext())) {
        break forest_join_33;
    }
    life7_23 = ((com.google.gson.JsonElement)(((java.util.Iterator)(life6_16)).next()));
    ((java.util.List)(life4_5)).add(((java.lang.Object)(((moom.l2)(((com.google.gson.JsonDeserializationContext)(p0)).deserialize(((com.google.gson.JsonElement)(life7_23)), ((java.lang.reflect.Type)(moom.l2.class))))))));
    continue forest_cycle_17;
    }
    }
    break forest_join_42;
    }
    ((java.util.List)(life4_5)).add(((java.lang.Object)(((moom.l2)(((com.google.gson.JsonDeserializationContext)(p0)).deserialize(((com.google.gson.JsonElement)(life5_9)), ((java.lang.reflect.Type)(moom.l2.class))))))));
    }
    return new moom.l4(life3_3, life4_5);
}


protected java.util.List<moom.l4> a(com.google.gson.JsonDeserializationContext p0, com.google.gson.JsonObject p1) {
com.google.gson.JsonObject life3_3;
    java.util.ArrayList life4_5;
    java.util.Iterator life5_9;
    java.util.Map.Entry life6_16;
    life3_3 = moom.Dg.a__JsonObject(((com.google.gson.JsonObject)(p1)), ((java.lang.String)("variants")));
    life4_5 = com.google.common.collect.Lists.newArrayList();
    life5_9 = ((java.util.Set)(((com.google.gson.JsonObject)(life3_3)).entrySet())).iterator();
    while (((java.util.Iterator)(life5_9)).hasNext()) {
        life6_16 = ((java.util.Map.Entry)(((java.util.Iterator)(life5_9)).next()));
        ((java.util.List)(life4_5)).add(((java.lang.Object)(((net.minecraft.client.renderer.block.model.ModelBlockDefinition$Deserializer)(this)).a(((com.google.gson.JsonDeserializationContext)(p0)), ((java.util.Map.Entry)(life6_16))))));
    }
    return life4_5;
}


public net.minecraft.client.renderer.block.model.ModelBlockDefinition a(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) throws com.google.gson.JsonParseException {
com.google.gson.JsonObject local4_life1 = ((com.google.gson.JsonElement)(p0)).getAsJsonObject();
    java.util.List local5_life3 = ((net.minecraft.client.renderer.block.model.ModelBlockDefinition$Deserializer)(this)).a(((com.google.gson.JsonDeserializationContext)(p2)), ((com.google.gson.JsonObject)(local4_life1)));
    return new net.minecraft.client.renderer.block.model.ModelBlockDefinition(((java.util.Collection) local5_life3));
}


public net.minecraft.client.renderer.block.model.ModelBlockDefinition deserialize(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) throws com.google.gson.JsonParseException {
return ((net.minecraft.client.renderer.block.model.ModelBlockDefinition$Deserializer)(this)).a(((com.google.gson.JsonElement)(p0)), ((java.lang.reflect.Type)(p1)), ((com.google.gson.JsonDeserializationContext)(p2)));
}

}
