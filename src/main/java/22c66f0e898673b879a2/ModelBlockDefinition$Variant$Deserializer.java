package net.minecraft.client.renderer.block.model;


public class ModelBlockDefinition$Variant$Deserializer implements com.google.gson.JsonDeserializer<moom.l2> {

public ModelBlockDefinition$Variant$Deserializer() {
super();
}


protected net.minecraft.client.resources.model.ModelRotation a__aL(com.google.gson.JsonObject p0) {
int local2 = moom.Dg.a(((com.google.gson.JsonObject)(p0)), ((java.lang.String)("x")), ((int)(0)));
    int local3 = moom.Dg.a(((com.google.gson.JsonObject)(p0)), ((java.lang.String)("y")), ((int)(0)));
    net.minecraft.client.resources.model.ModelRotation local4 = net.minecraft.client.resources.model.ModelRotation.a__aL(((int)(local2)), ((int)(local3)));
    if ((local4 == null)) {
        throw new com.google.gson.JsonParseException(__sourceIntrinsic_67a7afefd295_invokedynamic10737_3(local2, local3));
    }
    return local4;
}


protected java.lang.String a__String(com.google.gson.JsonObject p0) {
return moom.Dg.a__String(((com.google.gson.JsonObject)(p0)), ((java.lang.String)("model")));
}


protected int a(com.google.gson.JsonObject p0) {
return moom.Dg.a(((com.google.gson.JsonObject)(p0)), ((java.lang.String)("weight")), ((int)(1)));
}


private static com.google.gson.JsonParseException a(com.google.gson.JsonParseException p0) {
return p0;
}


public moom.l2 a(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) throws com.google.gson.JsonParseException {
com.google.gson.JsonObject local4 = ((com.google.gson.JsonElement)(p0)).getAsJsonObject();
    java.lang.String local5 = ((net.minecraft.client.renderer.block.model.ModelBlockDefinition$Variant$Deserializer)(this)).a__String(((com.google.gson.JsonObject)(local4)));
    net.minecraft.client.resources.model.ModelRotation local6 = ((net.minecraft.client.renderer.block.model.ModelBlockDefinition$Variant$Deserializer)(this)).a__aL(((com.google.gson.JsonObject)(local4)));
    boolean local7 = ((net.minecraft.client.renderer.block.model.ModelBlockDefinition$Variant$Deserializer)(this)).a__Boolean(((com.google.gson.JsonObject)(local4)));
    int local8 = ((net.minecraft.client.renderer.block.model.ModelBlockDefinition$Variant$Deserializer)(this)).a(((com.google.gson.JsonObject)(local4)));
    return new moom.l2(((net.minecraft.client.renderer.block.model.ModelBlockDefinition$Variant$Deserializer)(this)).a(((java.lang.String)(local5))), local6, local7, local8);
}


private moom.DD a(java.lang.String p0) {
moom.DD local2 = new moom.DD(p0);
    local2 = new moom.DD(((moom.DD)(local2)).b(), __sourceIntrinsic_c7b759ea0078_originalDynamicSite1830_2(((moom.DD)(local2)).a()));
    return local2;
}


private boolean a__Boolean(com.google.gson.JsonObject p0) {
return (__sourceIntrinsic_booleanComparison((moom.Dg.a(((com.google.gson.JsonObject)(p0)), ((java.lang.String)("uvlock")), ((boolean)(false))))) != 0);
}


public moom.l2 deserialize(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) throws com.google.gson.JsonParseException {
return ((net.minecraft.client.renderer.block.model.ModelBlockDefinition$Variant$Deserializer)(this)).a(((com.google.gson.JsonElement)(p0)), ((java.lang.reflect.Type)(p1)), ((com.google.gson.JsonDeserializationContext)(p2)));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_67a7afefd295_invokedynamic10737_3(int a0, int a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c7b759ea0078_originalDynamicSite1830_2(java.lang.String a0) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
