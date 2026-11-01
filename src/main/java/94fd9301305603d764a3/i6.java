package com.moon;


public class i6 implements com.moon.iX {

private final float a;

private final float b;

private final float c;

private final float d;

private final float e;

private final float f;

private final float g;

private final float h;

private final float i;

private final int j;

private static final long k;

private static final long l;

private i6(float p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7, float p8, int p9) {
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
}


static {
k = ((long)(((moom._a)(moom._c.a(((long)(14062893506066600L)), ((long)(-7061135213966710439L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(244894956459584L)))));
    long local0_life6 = (com.moon.i6.k ^ 96058737258660L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill154_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill154_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill154_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill154_13 = new byte[8];
    (__sourceSpill154_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill154_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation154_15 = __sourceSpill154_13;
    ((javax.crypto.Cipher)(__sourceSpill154_10)).init(((int)(__sourceSpill154_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill154_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation154_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -1093494579393111337L;
    byte[] __sourceSpill154_19 = new byte[8];
    (__sourceSpill154_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill154_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill154_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill154_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill154_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill154_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill154_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill154_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill154_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill154_20)).doFinal(((byte[])(__sourceSpill154_19)));
    l = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public static com.moon.i6 a(float p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7, float p8, int p9) {
return new com.moon.i6(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int a__Int() {
long local1 = (com.moon.i6.k ^ 67261155685024L);
    return ((int) com.moon.i6.l);
}


public int a(com.moon.iv p0, float p1, float p2) {
long life4_3;
    float life7_8;
    float life8_14;
    float life9_19;
    float life10_24;
    float life11_30;
    float life12_36;
    net.minecraft.entity.Entity[] life6_37;
    life4_3 = (com.moon.i6.k ^ 1463473355172L);
    life7_8 = (this.a / p1);
    net.minecraft.entity.Entity[] spill1345_0 = com.moon.i7.b();
    life8_14 = (this.c / p1);
    life9_19 = (this.b / p2);
    life10_24 = (this.d / p2);
    life11_30 = (this.c - this.a);
    life12_36 = (this.d - this.b);
    life6_37 = spill1345_0;
    ((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(p0)).a(((float)(life8_14)), ((float)(life9_19))))).b(((float)(this.g)), ((float)(this.f))))).b(((float)(life11_30)), ((float)(life12_36))))).b(((float)(p1)), ((float)(p2))))).a(((float)(this.a)), ((float)(this.b))))).a(((float)(this.i))))).a(((int)(this.j)));
    ((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(p0)).a(((float)(life7_8)), ((float)(life9_19))))).b(((float)(this.e)), ((float)(this.f))))).b(((float)(life11_30)), ((float)(life12_36))))).b(((float)(p1)), ((float)(p2))))).a(((float)(this.a)), ((float)(this.b))))).a(((float)(this.i))))).a(((int)(this.j)));
    ((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(p0)).a(((float)(life7_8)), ((float)(life10_24))))).b(((float)(this.e)), ((float)(this.h))))).b(((float)(life11_30)), ((float)(life12_36))))).b(((float)(p1)), ((float)(p2))))).a(((float)(this.a)), ((float)(this.b))))).a(((float)(this.i))))).a(((int)(this.j)));
    ((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(p0)).a(((float)(life8_14)), ((float)(life10_24))))).b(((float)(this.g)), ((float)(this.h))))).b(((float)(life11_30)), ((float)(life12_36))))).b(((float)(p1)), ((float)(p2))))).a(((float)(this.a)), ((float)(this.b))))).a(((float)(this.i))))).a(((int)(this.j)));
    int spill1345_1 = 4;
    if ((life6_37 != null)) {
        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[2])));
    }
    return spill1345_1;
}

}
