package com.moon;


public class i0 implements com.moon.iX {

private final float a;

private final float b;

private final float c;

private final float d;

private final int e;

private final int f;

private final boolean g;

private static final long h;

private static final long i;

private i0(float p0, float p1, float p2, float p3, int p4, int p5, boolean p6) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
    this.d = p3;
    this.e = p4;
    this.f = p5;
    this.g = p6;
}


static {
h = ((long)(((moom._a)(moom._c.a(((long)(5666465293740421092L)), ((long)(4872176374305964797L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(39101730374341L)))));
    long local0_life6 = (com.moon.i0.h ^ 69306808178576L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill148_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill148_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill148_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill148_13 = new byte[8];
    (__sourceSpill148_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill148_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation148_15 = __sourceSpill148_13;
    ((javax.crypto.Cipher)(__sourceSpill148_10)).init(((int)(__sourceSpill148_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill148_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation148_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 8740832960424328429L;
    byte[] __sourceSpill148_19 = new byte[8];
    (__sourceSpill148_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill148_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill148_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill148_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill148_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill148_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill148_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill148_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill148_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill148_20)).doFinal(((byte[])(__sourceSpill148_19)));
    i = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public static com.moon.i0 a(float p0, float p1, float p2, float p3, int p4, int p5, boolean p6) {
return new com.moon.i0(p0, p1, p2, p3, p4, p5, p6);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int a__Int() {
long local1 = (com.moon.i0.h ^ 117664026455126L);
    return ((int) com.moon.i0.i);
}


public int a(com.moon.iv p0, float p1, float p2) {
long life4_3;
    float life7_9;
    java.lang.String[] life6_10;
    float life8_18;
    float life9_23;
    float life10_31;
    float life11_40;
    life4_3 = (com.moon.i0.h ^ 96185842558802L);
    java.lang.String[] spill1341_0 = com.moon.i3.b();
    life7_9 = (this.a / p1);
    life6_10 = spill1341_0;
    life8_18 = ((this.a + this.c) / p1);
    life9_23 = (this.b / p2);
    life10_31 = ((this.b + this.d) / p2);
    life11_40 = (this.g ? 0x1.0p0f : 0x0.0p0f);
    ((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(p0)).a(((float)(life8_18)), ((float)(life9_23))))).b(((float)(this.c)), ((float)(this.d))))).a(((float)(this.a)), ((float)(this.b))))).b(((float)(p1)), ((float)(p2))))).a(((float)(life11_40))))).a(((int)(this.e))))).a(((int)(this.f)));
    ((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(p0)).a(((float)(life7_9)), ((float)(life9_23))))).b(((float)(this.c)), ((float)(this.d))))).a(((float)(this.a)), ((float)(this.b))))).b(((float)(p1)), ((float)(p2))))).a(((float)(life11_40))))).a(((int)(this.e))))).a(((int)(this.f)));
    ((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(p0)).a(((float)(life7_9)), ((float)(life10_31))))).b(((float)(this.c)), ((float)(this.d))))).a(((float)(this.a)), ((float)(this.b))))).b(((float)(p1)), ((float)(p2))))).a(((float)(life11_40))))).a(((int)(this.e))))).a(((int)(this.f)));
    ((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(p0)).a(((float)(life8_18)), ((float)(life10_31))))).b(((float)(this.c)), ((float)(this.d))))).a(((float)(this.a)), ((float)(this.b))))).b(((float)(p1)), ((float)(p2))))).a(((float)(life11_40))))).a(((int)(this.e))))).a(((int)(this.f)));
    int spill1341_1 = 4;
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        com.moon.i3.b(((java.lang.String[])(new java.lang.String[5])));
    }
    return spill1341_1;
}

}
