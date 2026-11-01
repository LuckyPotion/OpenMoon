package com.moon;


public class i1 implements com.moon.iX {

private final float a;

private final float b;

private final float c;

private final float d;

private final float e;

private final float f;

private final int g;

private static final long h;

private static final long i;

private i1(float p0, float p1, float p2, float p3, float p4, float p5, int p6) {
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
h = ((long)(((moom._a)(moom._c.a(((long)(-4694271896943927543L)), ((long)(-1569235401862366120L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(166690560492082L)))));
    long local0_life6 = (com.moon.i1.h ^ 32882085772143L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill149_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill149_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill149_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill149_13 = new byte[8];
    (__sourceSpill149_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill149_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation149_15 = __sourceSpill149_13;
    ((javax.crypto.Cipher)(__sourceSpill149_10)).init(((int)(__sourceSpill149_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill149_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation149_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -8116122161803857072L;
    byte[] __sourceSpill149_19 = new byte[8];
    (__sourceSpill149_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill149_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill149_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill149_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill149_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill149_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill149_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill149_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill149_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill149_20)).doFinal(((byte[])(__sourceSpill149_19)));
    i = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public int a__Int() {
long local1 = (com.moon.i1.h ^ 107414574805306L);
    return ((int) com.moon.i1.i);
}


public static com.moon.i1 a(float p0, float p1, float p2, float p3, float p4, float p5, int p6) {
return new com.moon.i1(p0, p1, p2, p3, p4, p5, p6);
}


public int a(com.moon.iv p0, float p1, float p2) {
float local4 = (this.a / p1);
    float local5 = ((this.a + this.c) / p1);
    float local6 = (this.b / p2);
    float local7 = ((this.b + this.d) / p2);
    ((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(p0)).a(((float)(local5)), ((float)(local6))))).b(((float)(this.c)), ((float)(this.d))))).b(((float)(p1)), ((float)(p2))))).a(((float)(this.a)), ((float)(this.b))))).a(((float)(this.e))))).a(((float)(this.f))))).a(((int)(this.g)));
    ((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(p0)).a(((float)(local4)), ((float)(local6))))).b(((float)(this.c)), ((float)(this.d))))).b(((float)(p1)), ((float)(p2))))).a(((float)(this.a)), ((float)(this.b))))).a(((float)(this.e))))).a(((float)(this.f))))).a(((int)(this.g)));
    ((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(p0)).a(((float)(local4)), ((float)(local7))))).b(((float)(this.c)), ((float)(this.d))))).b(((float)(p1)), ((float)(p2))))).a(((float)(this.a)), ((float)(this.b))))).a(((float)(this.e))))).a(((float)(this.f))))).a(((int)(this.g)));
    ((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(p0)).a(((float)(local5)), ((float)(local7))))).b(((float)(this.c)), ((float)(this.d))))).b(((float)(p1)), ((float)(p2))))).a(((float)(this.a)), ((float)(this.b))))).a(((float)(this.e))))).a(((float)(this.f))))).a(((int)(this.g)));
    return 4;
}

}
