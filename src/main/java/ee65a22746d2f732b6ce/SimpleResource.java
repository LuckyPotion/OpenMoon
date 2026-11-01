package net.minecraft.client.resources;


public class SimpleResource implements net.minecraft.client.resources.IResource {

private java.util.Map<java.lang.String, net.minecraft.client.resources.data.IMetadataSection> a;

private java.lang.String b;

private moom.DD c;

private java.io.InputStream d;

private java.io.InputStream e;

private net.minecraft.client.resources.data.IMetadataSerializer f;

private boolean g;

private com.google.gson.JsonObject h;

private static long i;

private static long j;

public SimpleResource(java.lang.String p0, moom.DD p1, java.io.InputStream p2, java.io.InputStream p3, net.minecraft.client.resources.data.IMetadataSerializer p4) {
super();
    this.a = com.google.common.collect.Maps.newHashMap();
    this.b = p0;
    this.c = p1;
    this.d = p2;
    this.e = p3;
    this.f = p4;
}


static {
i = ((long)(((moom._a)(moom._c.a(((long)(-1158825249719578120L)), ((long)(3569821048793258888L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(251051679966785L)))));
    long local0_life6 = (net.minecraft.client.resources.SimpleResource.i ^ 109925338806082L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1179_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1179_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1179_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1179_13 = new byte[8];
    (__sourceSpill1179_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1179_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1179_15 = __sourceSpill1179_13;
    ((javax.crypto.Cipher)(__sourceSpill1179_10)).init(((int)(__sourceSpill1179_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1179_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1179_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -750323560303142425L;
    byte[] __sourceSpill1179_19 = new byte[8];
    (__sourceSpill1179_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1179_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1179_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1179_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1179_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1179_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1179_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1179_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1179_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1179_20)).doFinal(((byte[])(__sourceSpill1179_19)));
    j = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}

private static native <E extends Throwable> net.minecraft.client.resources.data.IMetadataSection __sourceHandlerCall_2fa8836f29bc4cde028f(net.minecraft.client.resources.SimpleResource a0, java.lang.String a1) throws E;
private static final class __SourceHandler_2fa8836f29bc4cde028f {

public static net.minecraft.client.resources.data.IMetadataSection f626(net.minecraft.client.resources.SimpleResource receiver, java.lang.String p0) throws Throwable {
    net.minecraft.client.resources.SimpleResource forestValue626_14_0;
    java.lang.Object forestValue626_48_0;
    net.minecraft.client.resources.data.IMetadataSection forestValue626_62_0;
    net.minecraft.client.resources.SimpleResource spill626_0;
    com.google.gson.JsonObject spill626_1;
    net.minecraft.client.resources.SimpleResource spill626_2;
    net.minecraft.client.resources.data.IMetadataSection spill626_3;
    long life2_3;
    java.lang.String[] life4_5;
    java.lang.Object life5_31;
    java.io.BufferedReader life5_40;
    net.minecraft.client.resources.data.IMetadataSection life5_54;
    forest_join_62: {
    forest_join_61: {
    forest_join_48: {
    forest_join_44: {
    forest_join_14: {
    forest_join_13: {
    life2_3 = (__fieldRead626_0() ^ 13967702505414L);
    life4_5 = __call626_1();
    spill626_0 = receiver;
    if (!((life4_5 != null))) {
        forestValue626_14_0 = spill626_0;
        break forest_join_14;
    }
    if (!((!__call626_2(spill626_0)))) {
        break forest_join_13;
    }
    return null;
    }
    forestValue626_14_0 = receiver;
    }
    spill626_1 = __fieldRead626_3(forestValue626_14_0);
    if (!((life4_5 != null))) {
        forestValue626_48_0 = spill626_1;
        break forest_join_48;
    }
    if (!((spill626_1 == null))) {
        break forest_join_44;
    }
    spill626_2 = receiver;
    if (!((life4_5 != null))) {
        forestValue626_48_0 = spill626_2;
        break forest_join_48;
    }
    if (!((!__fieldRead626_4(spill626_2)))) {
        break forest_join_44;
    }
    __fieldWrite626_5(receiver, 1);
    life5_31 = null;
    life5_40 = new java.io.BufferedReader(new java.io.InputStreamReader(__fieldRead626_6(receiver)));
    __fieldWrite626_9(receiver, __call626_8(__call626_7(life5_40)));
    __call626_10(life5_40);
    }
    forestValue626_48_0 = __call626_12(__fieldRead626_11(receiver), p0);
    }
    life5_54 = __cast626_13(forestValue626_48_0);
    spill626_3 = life5_54;
    if (!((life4_5 != null))) {
        forestValue626_62_0 = spill626_3;
        break forest_join_62;
    }
    if (!((spill626_3 == null))) {
        break forest_join_61;
    }
    life5_54 = __call626_16(__fieldRead626_14(receiver), p0, __fieldRead626_15(receiver));
    }
    forestValue626_62_0 = life5_54;
    }
    return forestValue626_62_0;
}
public static net.minecraft.client.resources.data.IMetadataSection h626_0(moom.Oo p0) throws Throwable {
    throw __call3062600_0(p0);
}
public static net.minecraft.client.resources.data.IMetadataSection h626_1(moom.Oo p0) throws Throwable {
    throw __call3062601_0(p0);
}
public static net.minecraft.client.resources.data.IMetadataSection h626_2(moom.Oo p0) throws Throwable {
    throw __call3062602_0(p0);
}
public static net.minecraft.client.resources.data.IMetadataSection h626_3(moom.Oo p0) throws Throwable {
    throw __call3062603_0(p0);
}
public static net.minecraft.client.resources.data.IMetadataSection h626_4(moom.Oo p0) throws Throwable {
    throw __call3062604_0(p0);
}
public static net.minecraft.client.resources.data.IMetadataSection h626_5(java.lang.Throwable p0, java.io.BufferedReader p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3062605_0(p1);
    throw life2_2;
}
public static net.minecraft.client.resources.data.IMetadataSection h626_6(moom.Oo p0) throws Throwable {
    throw __call3062606_0(p0);
}
private static native long __fieldRead626_0() throws Throwable;
private static native java.lang.String[] __call626_1() throws Throwable;
private static native boolean __call626_2(net.minecraft.client.resources.SimpleResource a0) throws Throwable;
private static native com.google.gson.JsonObject __fieldRead626_3(net.minecraft.client.resources.SimpleResource a0) throws Throwable;
private static native boolean __fieldRead626_4(net.minecraft.client.resources.SimpleResource a0) throws Throwable;
private static native void __fieldWrite626_5(net.minecraft.client.resources.SimpleResource a0, int a1) throws Throwable;
private static native java.io.InputStream __fieldRead626_6(net.minecraft.client.resources.SimpleResource a0) throws Throwable;
private static native com.google.gson.JsonElement __call626_7(java.io.BufferedReader a0) throws Throwable;
private static native com.google.gson.JsonObject __call626_8(com.google.gson.JsonElement a0) throws Throwable;
private static native void __fieldWrite626_9(net.minecraft.client.resources.SimpleResource a0, com.google.gson.JsonObject a1) throws Throwable;
private static native void __call626_10(java.io.BufferedReader a0) throws Throwable;
private static native java.util.Map __fieldRead626_11(net.minecraft.client.resources.SimpleResource a0) throws Throwable;
private static native java.lang.Object __call626_12(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.resources.data.IMetadataSection __cast626_13(java.lang.Object a0) throws Throwable;
private static native net.minecraft.client.resources.data.IMetadataSerializer __fieldRead626_14(net.minecraft.client.resources.SimpleResource a0) throws Throwable;
private static native com.google.gson.JsonObject __fieldRead626_15(net.minecraft.client.resources.SimpleResource a0) throws Throwable;
private static native net.minecraft.client.resources.data.IMetadataSection __call626_16(net.minecraft.client.resources.data.IMetadataSerializer a0, java.lang.String a1, com.google.gson.JsonObject a2) throws Throwable;
private static native moom.Oo __call3062600_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call3062601_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call3062602_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call3062603_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call3062604_0(moom.Oo a0) throws Throwable;
private static native void __call3062605_0(java.io.BufferedReader a0) throws Throwable;
private static native moom.Oo __call3062606_0(moom.Oo a0) throws Throwable;

}


public boolean equals(java.lang.Object p0) {
java.lang.Object forwardValue4845_14_0;
    int forwardValue4845_24_0;
    moom.DD forwardValue4845_44_0;
    net.minecraft.client.resources.SimpleResource forwardValue4845_48_0;
    java.lang.String forwardValue4845_60_0;
    int forwardValue4845_64_0;
    net.minecraft.client.resources.SimpleResource spill4845_0;
    int spill4845_1;
    moom.DD spill4845_2;
    net.minecraft.client.resources.SimpleResource spill4845_3;
    net.minecraft.client.resources.SimpleResource spill4845_4;
    java.lang.String spill4845_5;
    long life2_3;
    java.lang.String[] life4_5;
    net.minecraft.client.resources.SimpleResource life5_28;
    forward_join_64: {
    forward_join_63: {
    forward_join_60: {
    forward_join_58: {
    forward_join_48: {
    forward_join_47: {
    forward_join_44: {
    forward_join_40: {
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (net.minecraft.client.resources.SimpleResource.i ^ 76973421757405L);
    life4_5 = moom.oO.b();
    spill4845_0 = this;
    if (!((life4_5 != null))) {
        forwardValue4845_14_0 = spill4845_0;
        break forward_join_14;
    }
    if (!((spill4845_0 == p0))) {
        break forward_join_13;
    }
    return ((1) != 0);
    }
    forwardValue4845_14_0 = p0;
    }
    spill4845_1 = ((forwardValue4845_14_0 instanceof net.minecraft.client.resources.SimpleResource) ? 1 : 0);
    if (!((life4_5 != null))) {
        forwardValue4845_24_0 = spill4845_1;
        break forward_join_24;
    }
    if (!((spill4845_1 != 0))) {
        break forward_join_23;
    }
    life5_28 = ((net.minecraft.client.resources.SimpleResource)(p0));
    if (!((life4_5 == null))) {
        break forward_join_25;
    }
    }
    forwardValue4845_24_0 = 0;
    }
    return ((forwardValue4845_24_0) != 0);
    }
    spill4845_2 = this.c;
    if (!((life4_5 != null))) {
        forwardValue4845_44_0 = spill4845_2;
        break forward_join_44;
    }
    if (!((spill4845_2 != null))) {
        break forward_join_40;
    }
    spill4845_3 = this;
    if (!((life4_5 != null))) {
        forwardValue4845_48_0 = spill4845_3;
        break forward_join_48;
    }
    if (!((!((moom.DD)(((net.minecraft.client.resources.SimpleResource)(spill4845_3)).c)).equals(((java.lang.Object)(((net.minecraft.client.resources.SimpleResource)(life5_28)).c)))))) {
        break forward_join_47;
    }
    return ((0) != 0);
    }
    spill4845_4 = life5_28;
    if (!((life4_5 != null))) {
        forwardValue4845_48_0 = spill4845_4;
        break forward_join_48;
    }
    forwardValue4845_44_0 = ((net.minecraft.client.resources.SimpleResource)(spill4845_4)).c;
    }
    if (!((forwardValue4845_44_0 != null))) {
        break forward_join_47;
    }
    return ((0) != 0);
    }
    forwardValue4845_48_0 = this;
    }
    spill4845_5 = ((net.minecraft.client.resources.SimpleResource)(forwardValue4845_48_0)).b;
    if (!((life4_5 != null))) {
        forwardValue4845_60_0 = spill4845_5;
        break forward_join_60;
    }
    if (!((spill4845_5 != null))) {
        break forward_join_58;
    }
    return ((java.lang.String)(this.b)).equals(((java.lang.Object)(((net.minecraft.client.resources.SimpleResource)(life5_28)).b)));
    }
    forwardValue4845_60_0 = ((net.minecraft.client.resources.SimpleResource)(life5_28)).b;
    }
    if (!((forwardValue4845_60_0 == null))) {
        break forward_join_63;
    }
    forwardValue4845_64_0 = 1;
    break forward_join_64;
    }
    forwardValue4845_64_0 = 0;
    }
    return ((forwardValue4845_64_0) != 0);
}


public int hashCode() {
java.lang.String forwardValue4846_13_0;
    int forwardValue4846_16_0;
    int forwardValue4846_28_0;
    moom.DD forwardValue4846_28_1;
    int forwardValue4846_30_0;
    int forwardValue4846_31_0;
    int forwardValue4846_31_1;
    java.lang.String spill4846_0;
    int spill4846_1;
    moom.DD spill4846_2;
    long life1_3;
    java.lang.String[] life3_5;
    int life4_22;
    int life4_44;
    forward_join_31: {
    forward_join_30: {
    forward_join_28: {
    forward_join_16: {
    forward_join_15: {
    forward_join_13: {
    life1_3 = (net.minecraft.client.resources.SimpleResource.i ^ 99789717884133L);
    life3_5 = moom.oO.b();
    spill4846_0 = this.b;
    if (!((life3_5 != null))) {
        forwardValue4846_13_0 = spill4846_0;
        break forward_join_13;
    }
    if (!((spill4846_0 != null))) {
        break forward_join_15;
    }
    forwardValue4846_13_0 = this.b;
    }
    forwardValue4846_16_0 = ((java.lang.String)(forwardValue4846_13_0)).hashCode();
    break forward_join_16;
    }
    forwardValue4846_16_0 = 0;
    }
    life4_22 = forwardValue4846_16_0;
    spill4846_1 = (((int) net.minecraft.client.resources.SimpleResource.j) * life4_22);
    spill4846_2 = this.c;
    if (!((life3_5 != null))) {
        forwardValue4846_28_0 = spill4846_1;
        forwardValue4846_28_1 = spill4846_2;
        break forward_join_28;
    }
    if (!((spill4846_2 != null))) {
        forwardValue4846_30_0 = spill4846_1;
        break forward_join_30;
    }
    forwardValue4846_28_0 = spill4846_1;
    forwardValue4846_28_1 = this.c;
    }
    forwardValue4846_31_0 = forwardValue4846_28_0;
    forwardValue4846_31_1 = ((moom.DD)(forwardValue4846_28_1)).hashCode();
    break forward_join_31;
    }
    forwardValue4846_31_0 = forwardValue4846_30_0;
    forwardValue4846_31_1 = 0;
    }
    life4_44 = (forwardValue4846_31_0 + forwardValue4846_31_1);
    return life4_44;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public java.lang.String a__String() {
return this.b;
}


public moom.DD a__DD() {
return this.c;
}


public java.io.InputStream a() {
return this.d;
}


public boolean a__Boolean() {
long local1 = (net.minecraft.client.resources.SimpleResource.i ^ 112686126931097L);
    return ((((this.e != null) ? 1 : 0)) != 0);
}


public <T extends net.minecraft.client.resources.data.IMetadataSection> T a(java.lang.String p0) { return ((T)(__sourceHandlerCall_2fa8836f29bc4cde028f(this, p0))); }

}
