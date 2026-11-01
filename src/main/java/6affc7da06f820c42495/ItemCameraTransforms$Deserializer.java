package net.minecraft.client.renderer.block.model;


class ItemCameraTransforms$Deserializer implements com.google.gson.JsonDeserializer<moom.lP> {

ItemCameraTransforms$Deserializer() {
super();
}


private static com.google.gson.JsonParseException a(com.google.gson.JsonParseException p0) {
return p0;
}


private moom.lV a(com.google.gson.JsonDeserializationContext p0, com.google.gson.JsonObject p1, java.lang.String p2) {
return ((__sourceIntrinsic_booleanComparison(((com.google.gson.JsonObject)(p1)).has(((java.lang.String)(p2)))) != 0) ? ((moom.lV)(((com.google.gson.JsonDeserializationContext)(p0)).deserialize(((com.google.gson.JsonElement)(((com.google.gson.JsonObject)(p1)).get(((java.lang.String)(p2))))), ((java.lang.reflect.Type)(moom.lV.class))))) : moom.lV.a);
}


public moom.lP a(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) throws com.google.gson.JsonParseException {
com.google.gson.JsonObject local4 = ((com.google.gson.JsonElement)(p0)).getAsJsonObject();
    moom.lV local5 = ((net.minecraft.client.renderer.block.model.ItemCameraTransforms$Deserializer)(this)).a(((com.google.gson.JsonDeserializationContext)(p2)), ((com.google.gson.JsonObject)(local4)), ((java.lang.String)("thirdperson")));
    moom.lV local6 = ((net.minecraft.client.renderer.block.model.ItemCameraTransforms$Deserializer)(this)).a(((com.google.gson.JsonDeserializationContext)(p2)), ((com.google.gson.JsonObject)(local4)), ((java.lang.String)("firstperson")));
    moom.lV local7 = ((net.minecraft.client.renderer.block.model.ItemCameraTransforms$Deserializer)(this)).a(((com.google.gson.JsonDeserializationContext)(p2)), ((com.google.gson.JsonObject)(local4)), ((java.lang.String)("head")));
    moom.lV local8 = ((net.minecraft.client.renderer.block.model.ItemCameraTransforms$Deserializer)(this)).a(((com.google.gson.JsonDeserializationContext)(p2)), ((com.google.gson.JsonObject)(local4)), ((java.lang.String)("gui")));
    moom.lV local9 = ((net.minecraft.client.renderer.block.model.ItemCameraTransforms$Deserializer)(this)).a(((com.google.gson.JsonDeserializationContext)(p2)), ((com.google.gson.JsonObject)(local4)), ((java.lang.String)("ground")));
    moom.lV local10 = ((net.minecraft.client.renderer.block.model.ItemCameraTransforms$Deserializer)(this)).a(((com.google.gson.JsonDeserializationContext)(p2)), ((com.google.gson.JsonObject)(local4)), ((java.lang.String)("fixed")));
    return new moom.lP(local5, local6, local7, local8, local9, local10);
}


public moom.lP deserialize(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) throws com.google.gson.JsonParseException {
return ((net.minecraft.client.renderer.block.model.ItemCameraTransforms$Deserializer)(this)).a(((com.google.gson.JsonElement)(p0)), ((java.lang.reflect.Type)(p1)), ((com.google.gson.JsonDeserializationContext)(p2)));
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
