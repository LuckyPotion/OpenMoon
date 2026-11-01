package com.moon;


public class i5 implements com.moon.iX {

private final float a;

private final float b;

private final float c;

private final float d;

private final float e;

private final float f;

private final float g;

private final float h;

private static final long i;

private static final long j;

private i5(float p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
    this.d = p3;
    this.e = p4;
    this.f = p5;
    this.g = p6;
    this.h = p7;
}


static {
i = ((long)(((moom._a)(moom._c.a(((long)(-2512999389213146956L)), ((long)(6225687976704601872L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(192169572696449L)))));
    long local0_life6 = (com.moon.i5.i ^ 123955013899773L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill153_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill153_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill153_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill153_13 = new byte[8];
    (__sourceSpill153_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill153_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation153_15 = __sourceSpill153_13;
    ((javax.crypto.Cipher)(__sourceSpill153_10)).init(((int)(__sourceSpill153_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill153_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation153_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 1368795656950692547L;
    byte[] __sourceSpill153_19 = new byte[8];
    (__sourceSpill153_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill153_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill153_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill153_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill153_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill153_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill153_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill153_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill153_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill153_20)).doFinal(((byte[])(__sourceSpill153_19)));
    j = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public int a__Int() {
long local1 = (com.moon.i5.i ^ 130403445156031L);
    return ((int) com.moon.i5.j);
}


public static com.moon.i5 a(float p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7) {
return new com.moon.i5(p0, p1, p2, p3, p4, p5, p6, p7);
}


public int a(com.moon.iv p0, float p1, float p2) {
float local4 = (this.a / p1);
    float local5 = (this.c / p1);
    float local6 = (this.b / p2);
    float local7 = (this.d / p2);
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((float)(local5)), ((float)(local6))))).b(((float)(this.g)), ((float)(this.f)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((float)(local4)), ((float)(local6))))).b(((float)(this.e)), ((float)(this.f)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((float)(local4)), ((float)(local7))))).b(((float)(this.e)), ((float)(this.h)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((float)(local5)), ((float)(local7))))).b(((float)(this.g)), ((float)(this.h)));
    return 4;
}

}
