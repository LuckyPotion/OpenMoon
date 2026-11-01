package net.minecraft.client.renderer.block.model;


class BlockPartFace$Deserializer implements com.google.gson.JsonDeserializer<net.minecraft.client.renderer.block.model.BlockPartFace> {

BlockPartFace$Deserializer() {
super();
}


private moom.bs a__bs(com.google.gson.JsonObject p0) {
java.lang.Object local2 = moom.Dg.a(((com.google.gson.JsonObject)(p0)), ((java.lang.String)("cullface")), ((java.lang.String)("")));
    return moom.bs.a(((java.lang.String)(local2)));
}


private java.lang.String a__String(com.google.gson.JsonObject p0) {
return moom.Dg.a__String(((com.google.gson.JsonObject)(p0)), ((java.lang.String)("texture")));
}


protected int a(com.google.gson.JsonObject p0) {
return moom.Dg.a(((com.google.gson.JsonObject)(p0)), ((java.lang.String)("tintindex")), ((int)(-1)));
}


public net.minecraft.client.renderer.block.model.BlockPartFace a(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) throws com.google.gson.JsonParseException {
com.google.gson.JsonObject local4 = ((com.google.gson.JsonElement)(p0)).getAsJsonObject();
    moom.bs local5 = ((net.minecraft.client.renderer.block.model.BlockPartFace$Deserializer)(this)).a__bs(((com.google.gson.JsonObject)(local4)));
    int local6 = ((net.minecraft.client.renderer.block.model.BlockPartFace$Deserializer)(this)).a(((com.google.gson.JsonObject)(local4)));
    java.lang.String local7 = ((net.minecraft.client.renderer.block.model.BlockPartFace$Deserializer)(this)).a__String(((com.google.gson.JsonObject)(local4)));
    moom.lE local8 = ((moom.lE)(((com.google.gson.JsonDeserializationContext)(p2)).deserialize(((com.google.gson.JsonElement)(local4)), ((java.lang.reflect.Type)(moom.lE.class)))));
    return new net.minecraft.client.renderer.block.model.BlockPartFace(local5, local6, local7, local8);
}


public net.minecraft.client.renderer.block.model.BlockPartFace deserialize(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) throws com.google.gson.JsonParseException {
return ((net.minecraft.client.renderer.block.model.BlockPartFace$Deserializer)(this)).a(((com.google.gson.JsonElement)(p0)), ((java.lang.reflect.Type)(p1)), ((com.google.gson.JsonDeserializationContext)(p2)));
}

}
