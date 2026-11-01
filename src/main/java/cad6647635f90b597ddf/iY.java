package com.moon;


public class iY implements com.moon.iX {

private final float a;

private final float b;

private final float c;

private final float d;

private final int e;

private static final long f;

private static final long g;

private iY(float p0, float p1, float p2, float p3, int p4) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
    this.d = p3;
    this.e = p4;
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(4736871155156246888L)), ((long)(-1033443842685807623L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(57973005327034L)))));
    long local0_life6 = (com.moon.iY.f ^ 7135854116587L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill169_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill169_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill169_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill169_13 = new byte[8];
    (__sourceSpill169_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill169_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation169_15 = __sourceSpill169_13;
    ((javax.crypto.Cipher)(__sourceSpill169_10)).init(((int)(__sourceSpill169_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill169_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation169_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 8930182837386553421L;
    byte[] __sourceSpill169_19 = new byte[8];
    (__sourceSpill169_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill169_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill169_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill169_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill169_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill169_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill169_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill169_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill169_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill169_20)).doFinal(((byte[])(__sourceSpill169_19)));
    g = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public static com.moon.iY a(float p0, float p1, float p2, float p3, int p4) {
return new com.moon.iY(p0, p1, p2, p3, p4);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int a__Int() {
long local1 = (com.moon.iY.f ^ 54620273185556L);
    return ((int) com.moon.iY.g);
}


public int a(com.moon.iv p0, float p1, float p2) {
long life4_3;
    float life7_8;
    float life8_13;
    float life9_19;
    float life10_24;
    int life6_55;
    life4_3 = (com.moon.iY.f ^ 15210853079056L);
    life7_8 = (this.a / p1);
    life8_13 = (this.c / p1);
    boolean spill1395_0 = com.moon.iZ.c();
    life9_19 = (this.b / p2);
    life10_24 = (this.d / p2);
    ((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(p0)).a(((float)(life8_13)), ((float)(life9_19))))).b(((float)(-0x1.0p0f)), ((float)(-0x1.0p0f))))).a(((float)(0x1.0p0f))))).a(((float)(0x1.0p0f))))).a(((int)(this.e)));
    ((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(p0)).a(((float)(life7_8)), ((float)(life9_19))))).b(((float)(-0x1.0p0f)), ((float)(-0x1.0p0f))))).a(((float)(0x1.0p0f))))).a(((float)(0x1.0p0f))))).a(((int)(this.e)));
    life6_55 = ((spill1395_0) ? 1 : 0);
    ((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(p0)).a(((float)(life7_8)), ((float)(life10_24))))).b(((float)(-0x1.0p0f)), ((float)(-0x1.0p0f))))).a(((float)(0x1.0p0f))))).a(((float)(0x1.0p0f))))).a(((int)(this.e)));
    ((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(p0)).a(((float)(life8_13)), ((float)(life10_24))))).b(((float)(-0x1.0p0f)), ((float)(-0x1.0p0f))))).a(((float)(0x1.0p0f))))).a(((float)(0x1.0p0f))))).a(((int)(this.e)));
    int spill1395_1 = 4;
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        com.moon.iZ.b(((boolean)__sourceIntrinsic_integerToBoolean((((life6_55 != 0) ? 0 : 1)))));
    }
    return spill1395_1;
}


private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
