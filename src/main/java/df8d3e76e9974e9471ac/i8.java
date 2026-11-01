package com.moon;


public class i8 implements com.moon.iX {

private final float a;

private final float b;

private final float c;

private final float d;

private final float e;

private final float f;

private final int g;

private static int[] h;

private static final long i;

private static final long j;

private i8(float p0, float p1, float p2, float p3, float p4, float p5, int p6) {
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
i = ((long)(((moom._a)(moom._c.a(((long)(-7651018754217974119L)), ((long)(-1423264665955873007L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(40512730451264L)))));
    java.lang.Object __sourceSpill156_6 = null;
    long local0_life7 = (com.moon.i8.i ^ 2516176076862L);
    com.moon.i8.b(((int[])(__sourceSpill156_6)));
    javax.crypto.Cipher local2_life10;
    javax.crypto.Cipher __sourceSpill156_12 = (local2_life10 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill156_13 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill156_14 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill156_15 = new byte[8];
    (__sourceSpill156_15)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life16 = 1;
    while ((local3_life16 < 8)) {
        (__sourceSpill156_15)[local3_life16] = ((byte) ((int) ((local0_life7 << (local3_life16 * 8)) >>> 56)));
        local3_life16 += 1;
    }
    byte[] __sourcePreallocation156_17 = __sourceSpill156_15;
    ((javax.crypto.Cipher)(__sourceSpill156_12)).init(((int)(__sourceSpill156_13)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill156_14)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation156_17)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life20 = 1734818785974133029L;
    byte[] __sourceSpill156_21 = new byte[8];
    (__sourceSpill156_21)[0] = ((byte) ((int) (local4_life20 >>> 56)));
    (__sourceSpill156_21)[1] = ((byte) ((int) (local4_life20 >>> 48)));
    (__sourceSpill156_21)[2] = ((byte) ((int) (local4_life20 >>> 40)));
    (__sourceSpill156_21)[3] = ((byte) ((int) (local4_life20 >>> 32)));
    (__sourceSpill156_21)[4] = ((byte) ((int) (local4_life20 >>> 24)));
    (__sourceSpill156_21)[5] = ((byte) ((int) (local4_life20 >>> 16)));
    (__sourceSpill156_21)[6] = ((byte) ((int) (local4_life20 >>> 8)));
    (__sourceSpill156_21)[7] = ((byte) ((int) local4_life20));
    javax.crypto.Cipher __sourceSpill156_22 = local2_life10;
    byte[] local6_life24 = ((javax.crypto.Cipher)(__sourceSpill156_22)).doFinal(((byte[])(__sourceSpill156_21)));
    j = ((long)((((((((((((long) (local6_life24)[0]) & 255L) << 56) | ((((long) (local6_life24)[1]) & 255L) << 48)) | ((((long) (local6_life24)[2]) & 255L) << 40)) | ((((long) (local6_life24)[3]) & 255L) << 32)) | ((((long) (local6_life24)[4]) & 255L) << 24)) | ((((long) (local6_life24)[5]) & 255L) << 16)) | ((((long) (local6_life24)[6]) & 255L) << 8)) | (((long) (local6_life24)[7]) & 255L))));
}


public static int[] b() {
return com.moon.i8.h;
}


public static void b(int[] p0) {
com.moon.i8.h = ((int[])(p0));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int a(com.moon.iv p0, float p1, float p2) {
long local4 = (com.moon.i8.i ^ 133111839603991L);
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((float)((this.a / p1))), ((float)((this.b / p2)))))).a(((int)(this.g)));
    int[] spill1359_0 = com.moon.i8.b();
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((float)((this.c / p1))), ((float)((this.d / p2)))))).a(((int)(this.g)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((float)((this.e / p1))), ((float)((this.f / p2)))))).a(((int)(this.g)));
    int[] local6 = spill1359_0;
    int spill1359_1 = 3;
    if ((local6 != null)) {
        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[1])));
    }
    return spill1359_1;
}


public static com.moon.i8 a(float p0, float p1, float p2, float p3, float p4, float p5, int p6) {
long life7_3;
    int[] life9_5;
    life7_3 = (com.moon.i8.i ^ 114626361551444L);
    life9_5 = com.moon.i8.b();
    com.moon.i8 spill31_0 = new com.moon.i8(p0, p1, p2, p3, p4, p5, p6);
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        com.moon.i8.b(((int[])(new int[1])));
    }
    return spill31_0;
}


public int a__Int() {
long local1 = (com.moon.i8.i ^ 76314244527635L);
    return ((int) com.moon.i8.j);
}

}
