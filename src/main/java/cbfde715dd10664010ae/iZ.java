package com.moon;


public class iZ implements com.moon.iX {

private final float a;

private final float b;

private final float c;

private final float d;

private final float e;

private final float f;

private final float g;

private final float h;

private final float i;

private final float j;

private final float k;

private final int l;

private static boolean m;

private static final long n;

private static final long o;

private iZ(float p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7, float p8, float p9, float p10, int p11) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
    this.d = p3;
    this.e = p4;
    this.f = p5;
    this.g = p6;
    this.h = p7;
    this.i = p8;
    this.j = p9;
    this.k = p10;
    this.l = p11;
}


static {
n = ((long)(((moom._a)(moom._c.a(((long)(-7998351519596889835L)), ((long)(-1470322757723650683L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(103346445217150L)))));
    int __sourceSpill170_6 = 0;
    long local0_life7 = (com.moon.iZ.n ^ 102984528356627L);
    com.moon.iZ.b(((boolean)__sourceIntrinsic_integerToBoolean((__sourceSpill170_6))));
    javax.crypto.Cipher local2_life10;
    javax.crypto.Cipher __sourceSpill170_12 = (local2_life10 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill170_13 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill170_14 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill170_15 = new byte[8];
    (__sourceSpill170_15)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life16 = 1;
    while ((local3_life16 < 8)) {
        (__sourceSpill170_15)[local3_life16] = ((byte) ((int) ((local0_life7 << (local3_life16 * 8)) >>> 56)));
        local3_life16 += 1;
    }
    byte[] __sourcePreallocation170_17 = __sourceSpill170_15;
    ((javax.crypto.Cipher)(__sourceSpill170_12)).init(((int)(__sourceSpill170_13)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill170_14)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation170_17)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life20 = -6548406016559206917L;
    byte[] __sourceSpill170_21 = new byte[8];
    (__sourceSpill170_21)[0] = ((byte) ((int) (local4_life20 >>> 56)));
    (__sourceSpill170_21)[1] = ((byte) ((int) (local4_life20 >>> 48)));
    (__sourceSpill170_21)[2] = ((byte) ((int) (local4_life20 >>> 40)));
    (__sourceSpill170_21)[3] = ((byte) ((int) (local4_life20 >>> 32)));
    (__sourceSpill170_21)[4] = ((byte) ((int) (local4_life20 >>> 24)));
    (__sourceSpill170_21)[5] = ((byte) ((int) (local4_life20 >>> 16)));
    (__sourceSpill170_21)[6] = ((byte) ((int) (local4_life20 >>> 8)));
    (__sourceSpill170_21)[7] = ((byte) ((int) local4_life20));
    javax.crypto.Cipher __sourceSpill170_22 = local2_life10;
    byte[] local6_life24 = ((javax.crypto.Cipher)(__sourceSpill170_22)).doFinal(((byte[])(__sourceSpill170_21)));
    o = ((long)((((((((((((long) (local6_life24)[0]) & 255L) << 56) | ((((long) (local6_life24)[1]) & 255L) << 48)) | ((((long) (local6_life24)[2]) & 255L) << 40)) | ((((long) (local6_life24)[3]) & 255L) << 32)) | ((((long) (local6_life24)[4]) & 255L) << 24)) | ((((long) (local6_life24)[5]) & 255L) << 16)) | ((((long) (local6_life24)[6]) & 255L) << 8)) | (((long) (local6_life24)[7]) & 255L))));
}


public static boolean b() {
return ((((com.moon.iZ.m) ? 1 : 0)) != 0);
}


public static void b(boolean p0) {
com.moon.iZ.m = ((boolean)(p0));
    return;
}


public static boolean c() {
int local0 = __sourceIntrinsic_booleanToInteger(com.moon.iZ.b());
    if ((local0 == 0)) {
        return ((1) != 0);
    }
    return ((0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int a(com.moon.iv p0, float p1, float p2) {
long life4_3;
    float life7_8;
    float life8_13;
    float life9_18;
    float life10_24;
    int life6_25;
    float life11_30;
    life4_3 = (com.moon.iZ.n ^ 106839052683039L);
    life7_8 = (this.a / p1);
    life8_13 = (this.c / p1);
    life9_18 = (this.b / p2);
    boolean spill1396_0 = com.moon.iZ.b();
    life10_24 = (this.d / p2);
    life6_25 = ((spill1396_0) ? 1 : 0);
    life11_30 = (this.k / p1);
    ((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(p0)).a(((float)((life8_13 + life11_30))), ((float)(life9_18))))).b(((float)(this.g)), ((float)(this.f))))).a(((float)(this.i))))).a(((float)(this.j))))).a(((int)(this.l)));
    ((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(p0)).a(((float)((life7_8 + life11_30))), ((float)(life9_18))))).b(((float)(this.e)), ((float)(this.f))))).a(((float)(this.i))))).a(((float)(this.j))))).a(((int)(this.l)));
    ((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(p0)).a(((float)((life7_8 - life11_30))), ((float)(life10_24))))).b(((float)(this.e)), ((float)(this.h))))).a(((float)(this.i))))).a(((float)(this.j))))).a(((int)(this.l)));
    ((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(p0)).a(((float)((life8_13 - life11_30))), ((float)(life10_24))))).b(((float)(this.g)), ((float)(this.h))))).a(((float)(this.i))))).a(((float)(this.j))))).a(((int)(this.l)));
    int spill1396_1 = 4;
    if ((life6_25 != 0)) {
        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[4])));
    }
    return spill1396_1;
}


public static com.moon.iZ a(float p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7, float p8, float p9, float p10, int p11) {
return new com.moon.iZ(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11);
}


public int a__Int() {
long local1 = (com.moon.iZ.n ^ 102614004730907L);
    return ((int) com.moon.iZ.o);
}


private static native int __sourceIntrinsic_booleanToInteger(boolean value);
private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
