package com.moon;


public class nX {

private float a;

private static boolean b;

private static final long c;

private static final long d;

public nX() {
super();
    this.a = 0x0.0p+0f;
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(4704055407490932312L)), ((long)(-8494379596252934572L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(36032020106108L)))));
    int __sourceSpill308_6 = 0;
    long local0_life7 = (com.moon.nX.c ^ 45620759795957L);
    com.moon.nX.b(((boolean)__sourceIntrinsic_integerToBoolean((__sourceSpill308_6))));
    javax.crypto.Cipher local2_life10;
    javax.crypto.Cipher __sourceSpill308_12 = (local2_life10 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill308_13 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill308_14 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill308_15 = new byte[8];
    (__sourceSpill308_15)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life16 = 1;
    while ((local3_life16 < 8)) {
        (__sourceSpill308_15)[local3_life16] = ((byte) ((int) ((local0_life7 << (local3_life16 * 8)) >>> 56)));
        local3_life16 += 1;
    }
    byte[] __sourcePreallocation308_17 = __sourceSpill308_15;
    ((javax.crypto.Cipher)(__sourceSpill308_12)).init(((int)(__sourceSpill308_13)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill308_14)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation308_17)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life20 = 5280838744090544060L;
    byte[] __sourceSpill308_21 = new byte[8];
    (__sourceSpill308_21)[0] = ((byte) ((int) (local4_life20 >>> 56)));
    (__sourceSpill308_21)[1] = ((byte) ((int) (local4_life20 >>> 48)));
    (__sourceSpill308_21)[2] = ((byte) ((int) (local4_life20 >>> 40)));
    (__sourceSpill308_21)[3] = ((byte) ((int) (local4_life20 >>> 32)));
    (__sourceSpill308_21)[4] = ((byte) ((int) (local4_life20 >>> 24)));
    (__sourceSpill308_21)[5] = ((byte) ((int) (local4_life20 >>> 16)));
    (__sourceSpill308_21)[6] = ((byte) ((int) (local4_life20 >>> 8)));
    (__sourceSpill308_21)[7] = ((byte) ((int) local4_life20));
    javax.crypto.Cipher __sourceSpill308_22 = local2_life10;
    byte[] local6_life24 = ((javax.crypto.Cipher)(__sourceSpill308_22)).doFinal(((byte[])(__sourceSpill308_21)));
    d = ((long)((((((((((((long) (local6_life24)[0]) & 255L) << 56) | ((((long) (local6_life24)[1]) & 255L) << 48)) | ((((long) (local6_life24)[2]) & 255L) << 40)) | ((((long) (local6_life24)[3]) & 255L) << 32)) | ((((long) (local6_life24)[4]) & 255L) << 24)) | ((((long) (local6_life24)[5]) & 255L) << 16)) | ((((long) (local6_life24)[6]) & 255L) << 8)) | (((long) (local6_life24)[7]) & 255L))));
}


public static void b(boolean p0) {
com.moon.nX.b = ((boolean)(p0));
    return;
}


public float b() {
return this.a;
}


public static boolean b__Boolean() {
return ((((com.moon.nX.b) ? 1 : 0)) != 0);
}


public static boolean c() {
int local0 = __sourceIntrinsic_booleanToInteger(com.moon.nX.b__Boolean());
    if ((local0 == 0)) {
        return ((1) != 0);
    }
    return ((0) != 0);
}


public static float a() {
long local0 = (com.moon.nX.c ^ 101738907598023L);
    int local2 = java.lang.Math.max(((int)(net.minecraft.client.Minecraft.b())), ((int)(((int) com.moon.nX.d))));
    return (0x1.ep5f / ((float) local2));
}


private double a(float p0, float p1, double p2) {
p2 = moom.Dr.a(((double)(p2)), ((double)(0x0.0p0d)), ((double)(0x1.0p0d)));
    return (((double) p1) + (((double) (p0 - p1)) * p2));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(float p0, double p1) {
this.a = ((float)(((float) this.a(((float)(p0)), ((float)(this.a)), ((double)((p1 * ((double) com.moon.nX.a()))))))));
    return;
}


public void a(float p0) {
this.a = ((float)(p0));
    return;
}


private static native int __sourceIntrinsic_booleanToInteger(boolean value);
private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
