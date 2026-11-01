package net.minecraft.client.renderer.block.model;


public class ModelBlock$Deserializer implements com.google.gson.JsonDeserializer<net.minecraft.client.renderer.block.model.ModelBlock> {

public ModelBlock$Deserializer() {
super();
}


protected boolean a__Boolean(com.google.gson.JsonObject p0) {
return (__sourceIntrinsic_booleanComparison((moom.Dg.a(((com.google.gson.JsonObject)(p0)), ((java.lang.String)("ambientocclusion")), ((boolean)(true))))) != 0);
}


protected java.util.List<net.minecraft.client.renderer.block.model.BlockPart> a(com.google.gson.JsonDeserializationContext p0, com.google.gson.JsonObject p1) {
java.util.ArrayList life3_1;
    java.util.Iterator life4_10;
    com.google.gson.JsonElement life5_17;
    life3_1 = com.google.common.collect.Lists.newArrayList();
    if (((com.google.gson.JsonObject)(p1)).has(((java.lang.String)("elements")))) {
        life4_10 = ((com.google.gson.JsonArray)(moom.Dg.a__JsonArray(((com.google.gson.JsonObject)(p1)), ((java.lang.String)("elements"))))).iterator();
        loop_region_11: while (((java.util.Iterator)(life4_10)).hasNext()) {
        life5_17 = ((com.google.gson.JsonElement)(((java.util.Iterator)(life4_10)).next()));
        ((java.util.List)(life3_1)).add(((java.lang.Object)(((net.minecraft.client.renderer.block.model.BlockPart)(((com.google.gson.JsonDeserializationContext)(p0)).deserialize(((com.google.gson.JsonElement)(life5_17)), ((java.lang.reflect.Type)(net.minecraft.client.renderer.block.model.BlockPart.class))))))));
    }
    }
    return life3_1;
}


private static com.google.gson.JsonParseException a(com.google.gson.JsonParseException p0) {
return p0;
}


public net.minecraft.client.renderer.block.model.ModelBlock a(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) throws com.google.gson.JsonParseException {
com.google.gson.JsonObject life4_2;
    java.util.List life5_7;
    java.lang.String life6_11;
    int life7_14;
    int life8_17;
    java.util.Map life9_49;
    int life10_53;
    moom.lP life11_55;
    com.google.gson.JsonObject life12_63;
    life4_2 = ((com.google.gson.JsonElement)(p0)).getAsJsonObject();
    life5_7 = ((net.minecraft.client.renderer.block.model.ModelBlock$Deserializer)(this)).a(((com.google.gson.JsonDeserializationContext)(p2)), ((com.google.gson.JsonObject)(life4_2)));
    life6_11 = ((net.minecraft.client.renderer.block.model.ModelBlock$Deserializer)(this)).a(((com.google.gson.JsonObject)(life4_2)));
    life7_14 = ((org.apache.commons.lang3.StringUtils.isEmpty(((java.lang.CharSequence)(life6_11)))) ? 1 : 0);
    life8_17 = ((((java.util.List)(life5_7)).isEmpty()) ? 1 : 0);
    if ((life8_17 != 0)) {
        if ((life7_14 != 0)) {
        throw new com.google.gson.JsonParseException("BlockModel requires either elements or parent, found neither");
    }
    }
    if ((life7_14 == 0)) {
        if ((life8_17 == 0)) {
        throw new com.google.gson.JsonParseException("BlockModel requires either elements or parent, found both");
    }
    }
    life9_49 = ((net.minecraft.client.renderer.block.model.ModelBlock$Deserializer)(this)).a__Map(((com.google.gson.JsonObject)(life4_2)));
    life10_53 = ((((net.minecraft.client.renderer.block.model.ModelBlock$Deserializer)(this)).a__Boolean(((com.google.gson.JsonObject)(life4_2)))) ? 1 : 0);
    life11_55 = moom.lP.a;
    if (((com.google.gson.JsonObject)(life4_2)).has(((java.lang.String)("display")))) {
        life12_63 = moom.Dg.a__JsonObject(((com.google.gson.JsonObject)(life4_2)), ((java.lang.String)("display")));
        life11_55 = ((moom.lP)(((com.google.gson.JsonDeserializationContext)(p2)).deserialize(((com.google.gson.JsonElement)(life12_63)), ((java.lang.reflect.Type)(moom.lP.class)))));
    }
    return ((life8_17 != 0) ? new net.minecraft.client.renderer.block.model.ModelBlock(new moom.DD(life6_11), life9_49, ((life10_53) != 0), true, life11_55) : new net.minecraft.client.renderer.block.model.ModelBlock(life5_7, life9_49, ((life10_53) != 0), true, life11_55));
}


private java.util.Map<java.lang.String, java.lang.String> a__Map(com.google.gson.JsonObject p0) {
java.util.HashMap life2_1;
    com.google.gson.JsonObject life3_9;
    java.util.Iterator life4_13;
    java.util.Map.Entry life5_20;
    life2_1 = com.google.common.collect.Maps.newHashMap();
    if (((com.google.gson.JsonObject)(p0)).has(((java.lang.String)("textures")))) {
        life3_9 = ((com.google.gson.JsonObject)(p0)).getAsJsonObject(((java.lang.String)("textures")));
        life4_13 = ((java.util.Set)(((com.google.gson.JsonObject)(life3_9)).entrySet())).iterator();
        loop_region_14: while (((java.util.Iterator)(life4_13)).hasNext()) {
        life5_20 = ((java.util.Map.Entry)(((java.util.Iterator)(life4_13)).next()));
        ((java.util.Map)(life2_1)).put(((java.lang.Object)(((java.lang.String)(((java.util.Map.Entry)(life5_20)).getKey())))), ((java.lang.Object)(((com.google.gson.JsonElement)(((com.google.gson.JsonElement)(((java.util.Map.Entry)(life5_20)).getValue())))).getAsString())));
    }
    }
    return life2_1;
}


private java.lang.String a(com.google.gson.JsonObject p0) {
return moom.Dg.a(((com.google.gson.JsonObject)(p0)), ((java.lang.String)("parent")), ((java.lang.String)("")));
}


public net.minecraft.client.renderer.block.model.ModelBlock deserialize(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) throws com.google.gson.JsonParseException {
return ((net.minecraft.client.renderer.block.model.ModelBlock$Deserializer)(this)).a(((com.google.gson.JsonElement)(p0)), ((java.lang.reflect.Type)(p1)), ((com.google.gson.JsonDeserializationContext)(p2)));
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
