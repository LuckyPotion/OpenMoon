package net.minecraft.client.renderer.block.model;


class ItemTransformVec3f$Deserializer implements com.google.gson.JsonDeserializer<moom.lV> {

private static final org.lwjgl.util.vector.Vector3f a;

private static final org.lwjgl.util.vector.Vector3f b;

private static final org.lwjgl.util.vector.Vector3f c;

ItemTransformVec3f$Deserializer() {
super();
}


static {
a = ((org.lwjgl.util.vector.Vector3f)(new org.lwjgl.util.vector.Vector3f(0x0.0p0f, 0x0.0p0f, 0x0.0p0f)));
    b = ((org.lwjgl.util.vector.Vector3f)(new org.lwjgl.util.vector.Vector3f(0x0.0p0f, 0x0.0p0f, 0x0.0p0f)));
    c = ((org.lwjgl.util.vector.Vector3f)(new org.lwjgl.util.vector.Vector3f(0x1.0p0f, 0x1.0p0f, 0x1.0p0f)));
}


private static com.google.gson.JsonParseException a(com.google.gson.JsonParseException p0) {
return p0;
}


private org.lwjgl.util.vector.Vector3f a(com.google.gson.JsonObject p0, java.lang.String p1, org.lwjgl.util.vector.Vector3f p2) {
com.google.gson.JsonArray life4_11;
    float[] life5_28;
    int life6_30;
    if ((!((com.google.gson.JsonObject)(p0)).has(((java.lang.String)(p1))))) {
        return p2;
    }
    life4_11 = moom.Dg.a__JsonArray(((com.google.gson.JsonObject)(p0)), ((java.lang.String)(p1)));
    if ((((com.google.gson.JsonArray)(life4_11)).size() != 3)) {
        throw new com.google.gson.JsonParseException(__sourceIntrinsic_2eb6e97f66ce_invokedynamic4823_4(p1, ((com.google.gson.JsonArray)(life4_11)).size()));
    }
    life5_28 = new float[3];
    life6_30 = 0;
    loop_region_27: while ((life6_30 < (life5_28).length)) {
        (life5_28)[life6_30] = moom.Dg.a(((com.google.gson.JsonElement)(((com.google.gson.JsonArray)(life4_11)).get(((int)(life6_30))))), ((java.lang.String)(__sourceIntrinsic_2eb6e97f66ce_invokedynamic4823_6(p1, life6_30))));
        life6_30 += 1;
    }
    return new org.lwjgl.util.vector.Vector3f((life5_28)[0], (life5_28)[1], (life5_28)[2]);
}


public moom.lV a(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) throws com.google.gson.JsonParseException {
com.google.gson.JsonObject local4_life1 = ((com.google.gson.JsonElement)(p0)).getAsJsonObject();
    org.lwjgl.util.vector.Vector3f local5_life4 = ((net.minecraft.client.renderer.block.model.ItemTransformVec3f$Deserializer)(this)).a(((com.google.gson.JsonObject)(local4_life1)), ((java.lang.String)("rotation")), ((org.lwjgl.util.vector.Vector3f)(net.minecraft.client.renderer.block.model.ItemTransformVec3f$Deserializer.a)));
    org.lwjgl.util.vector.Vector3f local6_life7 = ((net.minecraft.client.renderer.block.model.ItemTransformVec3f$Deserializer)(this)).a(((com.google.gson.JsonObject)(local4_life1)), ((java.lang.String)("translation")), ((org.lwjgl.util.vector.Vector3f)(net.minecraft.client.renderer.block.model.ItemTransformVec3f$Deserializer.b)));
    ((org.lwjgl.util.vector.Vector3f)(local6_life7)).scale(((float)(0x1.0000000000000p-4F)));
    ((org.lwjgl.util.vector.Vector3f)(local6_life7)).x = ((float)(moom.Dr.a(((float)(((org.lwjgl.util.vector.Vector3f)(local6_life7)).x)), ((float)(-0x1.8000000000000p+0F)), ((float)(0x1.8000000000000p+0F)))));
    ((org.lwjgl.util.vector.Vector3f)(local6_life7)).y = ((float)(moom.Dr.a(((float)(((org.lwjgl.util.vector.Vector3f)(local6_life7)).y)), ((float)(-0x1.8000000000000p+0F)), ((float)(0x1.8000000000000p+0F)))));
    ((org.lwjgl.util.vector.Vector3f)(local6_life7)).z = ((float)(moom.Dr.a(((float)(((org.lwjgl.util.vector.Vector3f)(local6_life7)).z)), ((float)(-0x1.8000000000000p+0F)), ((float)(0x1.8000000000000p+0F)))));
    org.lwjgl.util.vector.Vector3f local7_life27 = ((net.minecraft.client.renderer.block.model.ItemTransformVec3f$Deserializer)(this)).a(((com.google.gson.JsonObject)(local4_life1)), ((java.lang.String)("scale")), ((org.lwjgl.util.vector.Vector3f)(net.minecraft.client.renderer.block.model.ItemTransformVec3f$Deserializer.c)));
    ((org.lwjgl.util.vector.Vector3f)(local7_life27)).x = ((float)(moom.Dr.a(((float)(((org.lwjgl.util.vector.Vector3f)(local7_life27)).x)), ((float)(-0x1.0000000000000p+2F)), ((float)(0x1.0000000000000p+2F)))));
    ((org.lwjgl.util.vector.Vector3f)(local7_life27)).y = ((float)(moom.Dr.a(((float)(((org.lwjgl.util.vector.Vector3f)(local7_life27)).y)), ((float)(-0x1.0000000000000p+2F)), ((float)(0x1.0000000000000p+2F)))));
    ((org.lwjgl.util.vector.Vector3f)(local7_life27)).z = ((float)(moom.Dr.a(((float)(((org.lwjgl.util.vector.Vector3f)(local7_life27)).z)), ((float)(-0x1.0000000000000p+2F)), ((float)(0x1.0000000000000p+2F)))));
    return new moom.lV(local5_life4, local6_life7, local7_life27);
}


public moom.lV deserialize(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) throws com.google.gson.JsonParseException {
return ((net.minecraft.client.renderer.block.model.ItemTransformVec3f$Deserializer)(this)).a(((com.google.gson.JsonElement)(p0)), ((java.lang.reflect.Type)(p1)), ((com.google.gson.JsonDeserializationContext)(p2)));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2eb6e97f66ce_invokedynamic4823_4(java.lang.String a0, int a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2eb6e97f66ce_invokedynamic4823_6(java.lang.String a0, int a1) throws E;
}
