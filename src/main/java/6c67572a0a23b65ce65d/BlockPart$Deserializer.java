package net.minecraft.client.renderer.block.model;


class BlockPart$Deserializer implements com.google.gson.JsonDeserializer<net.minecraft.client.renderer.block.model.BlockPart> {

BlockPart$Deserializer() {
super();
}


private org.lwjgl.util.vector.Vector3f b(com.google.gson.JsonObject p0) {
org.lwjgl.util.vector.Vector3f life2_4;
    life2_4 = ((net.minecraft.client.renderer.block.model.BlockPart$Deserializer)(this)).a(((com.google.gson.JsonObject)(p0)), ((java.lang.String)("from")));
    if ((recovery.source.CarrierOps.fcmpl(((float)(((org.lwjgl.util.vector.Vector3f)(life2_4)).x)), ((float)(-0x1.0p4f))) >= 0)) {
        if ((recovery.source.CarrierOps.fcmpl(((float)(((org.lwjgl.util.vector.Vector3f)(life2_4)).y)), ((float)(-0x1.0p4f))) >= 0)) {
        if ((recovery.source.CarrierOps.fcmpl(((float)(((org.lwjgl.util.vector.Vector3f)(life2_4)).z)), ((float)(-0x1.0p4f))) >= 0)) {
        if ((recovery.source.CarrierOps.fcmpg(((float)(((org.lwjgl.util.vector.Vector3f)(life2_4)).x)), ((float)(0x1.0p5f))) <= 0)) {
        if ((recovery.source.CarrierOps.fcmpg(((float)(((org.lwjgl.util.vector.Vector3f)(life2_4)).y)), ((float)(0x1.0p5f))) <= 0)) {
        if ((recovery.source.CarrierOps.fcmpg(((float)(((org.lwjgl.util.vector.Vector3f)(life2_4)).z)), ((float)(0x1.0p5f))) <= 0)) {
        return life2_4;
    }
    }
    }
    }
    }
    }
    throw new com.google.gson.JsonParseException(__sourceIntrinsic_5d669f3403c0_invokedynamic4817_13(life2_4));
}


private java.util.Map<moom.bs, net.minecraft.client.renderer.block.model.BlockPartFace> b(com.google.gson.JsonDeserializationContext p0, com.google.gson.JsonObject p1) {
java.util.EnumMap life3_2;
    com.google.gson.JsonObject life4_6;
    java.util.Iterator life5_10;
    java.util.Map.Entry life6_17;
    moom.bs life7_23;
    life3_2 = com.google.common.collect.Maps.newEnumMap(((java.lang.Class)(moom.bs.class)));
    life4_6 = moom.Dg.a__JsonObject(((com.google.gson.JsonObject)(p1)), ((java.lang.String)("faces")));
    life5_10 = ((java.util.Set)(((com.google.gson.JsonObject)(life4_6)).entrySet())).iterator();
    while (((java.util.Iterator)(life5_10)).hasNext()) {
        life6_17 = ((java.util.Map.Entry)(((java.util.Iterator)(life5_10)).next()));
        life7_23 = ((net.minecraft.client.renderer.block.model.BlockPart$Deserializer)(this)).a(((java.lang.String)(((java.lang.String)(((java.util.Map.Entry)(life6_17)).getKey())))));
        ((java.util.Map)(life3_2)).put(((java.lang.Object)(life7_23)), ((java.lang.Object)(((net.minecraft.client.renderer.block.model.BlockPartFace)(((com.google.gson.JsonDeserializationContext)(p0)).deserialize(((com.google.gson.JsonElement)(((com.google.gson.JsonElement)(((java.util.Map.Entry)(life6_17)).getValue())))), ((java.lang.reflect.Type)(net.minecraft.client.renderer.block.model.BlockPartFace.class))))))));
    }
    return life3_2;
}


private moom.bs a(java.lang.String p0) {
moom.bs local2 = moom.bs.a(((java.lang.String)(p0)));
    if ((local2 == null)) {
        throw new com.google.gson.JsonParseException(__sourceIntrinsic_da0974bc8d5d_invokedynamic10707_1(p0));
    }
    return local2;
}


private org.lwjgl.util.vector.Vector3f a__Vector3f(com.google.gson.JsonObject p0) {
org.lwjgl.util.vector.Vector3f life2_4;
    life2_4 = ((net.minecraft.client.renderer.block.model.BlockPart$Deserializer)(this)).a(((com.google.gson.JsonObject)(p0)), ((java.lang.String)("to")));
    if ((recovery.source.CarrierOps.fcmpl(((float)(((org.lwjgl.util.vector.Vector3f)(life2_4)).x)), ((float)(-0x1.0p4f))) >= 0)) {
        if ((recovery.source.CarrierOps.fcmpl(((float)(((org.lwjgl.util.vector.Vector3f)(life2_4)).y)), ((float)(-0x1.0p4f))) >= 0)) {
        if ((recovery.source.CarrierOps.fcmpl(((float)(((org.lwjgl.util.vector.Vector3f)(life2_4)).z)), ((float)(-0x1.0p4f))) >= 0)) {
        if ((recovery.source.CarrierOps.fcmpg(((float)(((org.lwjgl.util.vector.Vector3f)(life2_4)).x)), ((float)(0x1.0p5f))) <= 0)) {
        if ((recovery.source.CarrierOps.fcmpg(((float)(((org.lwjgl.util.vector.Vector3f)(life2_4)).y)), ((float)(0x1.0p5f))) <= 0)) {
        if ((recovery.source.CarrierOps.fcmpg(((float)(((org.lwjgl.util.vector.Vector3f)(life2_4)).z)), ((float)(0x1.0p5f))) <= 0)) {
        return life2_4;
    }
    }
    }
    }
    }
    }
    throw new com.google.gson.JsonParseException(__sourceIntrinsic_0e75f4e31338_invokedynamic4815_13(life2_4));
}


public net.minecraft.client.renderer.block.model.BlockPart a(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) throws com.google.gson.JsonParseException {
com.google.gson.JsonObject life4_2;
    org.lwjgl.util.vector.Vector3f life5_6;
    org.lwjgl.util.vector.Vector3f life6_10;
    net.minecraft.client.renderer.block.model.BlockPartRotation life7_14;
    java.util.Map life8_19;
    int life9_38;
    forest_join_33: {
    life4_2 = ((com.google.gson.JsonElement)(p0)).getAsJsonObject();
    life5_6 = ((net.minecraft.client.renderer.block.model.BlockPart$Deserializer)(this)).b(((com.google.gson.JsonObject)(life4_2)));
    life6_10 = ((net.minecraft.client.renderer.block.model.BlockPart$Deserializer)(this)).a__Vector3f(((com.google.gson.JsonObject)(life4_2)));
    life7_14 = ((net.minecraft.client.renderer.block.model.BlockPart$Deserializer)(this)).a__lL(((com.google.gson.JsonObject)(life4_2)));
    life8_19 = ((net.minecraft.client.renderer.block.model.BlockPart$Deserializer)(this)).a(((com.google.gson.JsonDeserializationContext)(p2)), ((com.google.gson.JsonObject)(life4_2)));
    if (!(((com.google.gson.JsonObject)(life4_2)).has(((java.lang.String)("shade"))))) {
        break forest_join_33;
    }
    if (!((!moom.Dg.b(((com.google.gson.JsonObject)(life4_2)), ((java.lang.String)("shade")))))) {
        break forest_join_33;
    }
    throw new com.google.gson.JsonParseException("Expected shade to be a Boolean");
    }
    life9_38 = ((moom.Dg.a(((com.google.gson.JsonObject)(life4_2)), ((java.lang.String)("shade")), ((boolean)(true)))) ? 1 : 0);
    return new net.minecraft.client.renderer.block.model.BlockPart(life5_6, life6_10, life8_19, life7_14, ((life9_38) != 0));
}


private org.lwjgl.util.vector.Vector3f a(com.google.gson.JsonObject p0, java.lang.String p1) {
com.google.gson.JsonArray life3_3;
    float[] life4_20;
    int life5_22;
    life3_3 = moom.Dg.a__JsonArray(((com.google.gson.JsonObject)(p0)), ((java.lang.String)(p1)));
    if ((((com.google.gson.JsonArray)(life3_3)).size() != 3)) {
        throw new com.google.gson.JsonParseException(__sourceIntrinsic_9d5c50003d6f_invokedynamic4814_3(p1, ((com.google.gson.JsonArray)(life3_3)).size()));
    }
    life4_20 = new float[3];
    life5_22 = 0;
    loop_region_21: while ((life5_22 < (life4_20).length)) {
        (life4_20)[life5_22] = moom.Dg.a(((com.google.gson.JsonElement)(((com.google.gson.JsonArray)(life3_3)).get(((int)(life5_22))))), ((java.lang.String)(__sourceIntrinsic_9d5c50003d6f_invokedynamic4814_5(p1, life5_22))));
        life5_22 += 1;
    }
    return new org.lwjgl.util.vector.Vector3f((life4_20)[0], (life4_20)[1], (life4_20)[2]);
}


private static com.google.gson.JsonParseException a(com.google.gson.JsonParseException p0) {
return p0;
}


private float a(com.google.gson.JsonObject p0) {
float local2 = moom.Dg.a(((com.google.gson.JsonObject)(p0)), ((java.lang.String)("angle")));
    if ((local2 != 0x0.0p0f)) {
        if ((moom.Dr.d(((float)(local2))) != 0x1.68p4f)) {
        if ((moom.Dr.d(((float)(local2))) != 0x1.68p5f)) {
        throw new com.google.gson.JsonParseException(__sourceIntrinsic_4e8326b5e07f_invokedynamic10711_3(local2));
    }
    }
    }
    return local2;
}


private net.minecraft.util.EnumFacing$Axis a__bt(com.google.gson.JsonObject p0) {
java.lang.String local2 = moom.Dg.a__String(((com.google.gson.JsonObject)(p0)), ((java.lang.String)("axis")));
    net.minecraft.util.EnumFacing$Axis local3 = net.minecraft.util.EnumFacing$Axis.a(((java.lang.String)(((java.lang.String)(local2)).toLowerCase())));
    if ((local3 == null)) {
        throw new com.google.gson.JsonParseException(__sourceIntrinsic_64fb5c4b5483_invokedynamic10712_3(local2));
    }
    return local3;
}


private java.util.Map<moom.bs, net.minecraft.client.renderer.block.model.BlockPartFace> a(com.google.gson.JsonDeserializationContext p0, com.google.gson.JsonObject p1) {
java.util.Map local3 = ((net.minecraft.client.renderer.block.model.BlockPart$Deserializer)(this)).b(((com.google.gson.JsonDeserializationContext)(p0)), ((com.google.gson.JsonObject)(p1)));
    if (((java.util.Map)(local3)).isEmpty()) {
        throw new com.google.gson.JsonParseException("Expected between 1 and 6 unique faces, got 0");
    }
    return local3;
}


private net.minecraft.client.renderer.block.model.BlockPartRotation a__lL(com.google.gson.JsonObject p0) {
net.minecraft.client.renderer.block.model.BlockPartRotation life2_1;
    com.google.gson.JsonObject life3_9;
    org.lwjgl.util.vector.Vector3f life4_14;
    net.minecraft.util.EnumFacing$Axis life5_22;
    float life6_26;
    int life7_31;
    forest_join_40: {
    life2_1 = null;
    if (!(((com.google.gson.JsonObject)(p0)).has(((java.lang.String)("rotation"))))) {
        break forest_join_40;
    }
    life3_9 = moom.Dg.a__JsonObject(((com.google.gson.JsonObject)(p0)), ((java.lang.String)("rotation")));
    life4_14 = ((net.minecraft.client.renderer.block.model.BlockPart$Deserializer)(this)).a(((com.google.gson.JsonObject)(life3_9)), ((java.lang.String)("origin")));
    ((org.lwjgl.util.vector.Vector3f)(life4_14)).scale(((float)(0x1.0p-4f)));
    life5_22 = ((net.minecraft.client.renderer.block.model.BlockPart$Deserializer)(this)).a__bt(((com.google.gson.JsonObject)(life3_9)));
    life6_26 = ((net.minecraft.client.renderer.block.model.BlockPart$Deserializer)(this)).a(((com.google.gson.JsonObject)(life3_9)));
    life7_31 = ((moom.Dg.a(((com.google.gson.JsonObject)(life3_9)), ((java.lang.String)("rescale")), ((boolean)(false)))) ? 1 : 0);
    life2_1 = new net.minecraft.client.renderer.block.model.BlockPartRotation(life4_14, life5_22, life6_26, ((life7_31) != 0));
    }
    return life2_1;
}


public net.minecraft.client.renderer.block.model.BlockPart deserialize(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) throws com.google.gson.JsonParseException {
return ((net.minecraft.client.renderer.block.model.BlockPart$Deserializer)(this)).a(((com.google.gson.JsonElement)(p0)), ((java.lang.reflect.Type)(p1)), ((com.google.gson.JsonDeserializationContext)(p2)));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4e8326b5e07f_invokedynamic10711_3(float a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9d5c50003d6f_invokedynamic4814_3(java.lang.String a0, int a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9d5c50003d6f_invokedynamic4814_5(java.lang.String a0, int a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_da0974bc8d5d_invokedynamic10707_1(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0e75f4e31338_invokedynamic4815_13(org.lwjgl.util.vector.Vector3f a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_64fb5c4b5483_invokedynamic10712_3(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_5d669f3403c0_invokedynamic4817_13(org.lwjgl.util.vector.Vector3f a0) throws E;
}
