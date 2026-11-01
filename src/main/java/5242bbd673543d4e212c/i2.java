package com.moon;


public class i2 implements com.moon.iX {

private final float a;

private final float b;

private final float c;

private final float d;

private final int e;

private static final long f;

private static final long g;

private i2(float p0, float p1, float p2, float p3, int p4) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
    this.d = p3;
    this.e = p4;
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(5817485112347235393L)), ((long)(2500170948950100089L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(31463697710336L)))));
    long local0_life6 = (com.moon.i2.f ^ 94637274819548L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill150_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill150_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill150_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill150_13 = new byte[8];
    (__sourceSpill150_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill150_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation150_15 = __sourceSpill150_13;
    ((javax.crypto.Cipher)(__sourceSpill150_10)).init(((int)(__sourceSpill150_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill150_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation150_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 5514073678075630963L;
    byte[] __sourceSpill150_19 = new byte[8];
    (__sourceSpill150_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill150_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill150_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill150_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill150_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill150_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill150_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill150_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill150_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill150_20)).doFinal(((byte[])(__sourceSpill150_19)));
    g = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public float b() {
return this.b;
}


public int b__Int() {
return this.e;
}


public float c() {
return this.c;
}


public float d() {
return this.d;
}


public int a(com.moon.iv p0, float p1, float p2) {
float local4 = (this.a / p1);
    float local5 = ((this.a + this.c) / p1);
    float local6 = (this.b / p2);
    float local7 = ((this.b + this.d) / p2);
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((float)(local5)), ((float)(local6))))).a(((int)(this.e)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((float)(local4)), ((float)(local6))))).a(((int)(this.e)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((float)(local4)), ((float)(local7))))).a(((int)(this.e)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((float)(local5)), ((float)(local7))))).a(((int)(this.e)));
    return 4;
}


public static com.moon.i2 a(float p0, float p1, float p2, float p3, int p4) {
return new com.moon.i2(p0, p1, p2, p3, p4);
}


public int a__Int() {
long local1 = (com.moon.i2.f ^ 62552807299451L);
    return ((int) com.moon.i2.g);
}


public float a() {
return this.a;
}

}
