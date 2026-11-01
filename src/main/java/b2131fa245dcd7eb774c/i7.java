package com.moon;


public class i7 implements com.moon.iX {

private final float a;

private final float b;

private final float c;

private final float d;

private final float e;

private final float f;

private final float g;

private final float h;

private final int i;

private static net.minecraft.entity.Entity[] j;

private static final long k;

private static final long l;

private i7(float p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7, int p8) {
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
}


static {
k = ((long)(((moom._a)(moom._c.a(((long)(3710838855368466409L)), ((long)(-2045154734984509836L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(47875060094280L)))));
    java.lang.Object __sourceSpill155_6 = null;
    long local0_life7 = (com.moon.i7.k ^ 76046530174718L);
    com.moon.i7.b(((net.minecraft.entity.Entity[])(__sourceSpill155_6)));
    javax.crypto.Cipher local2_life10;
    javax.crypto.Cipher __sourceSpill155_12 = (local2_life10 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill155_13 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill155_14 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill155_15 = new byte[8];
    (__sourceSpill155_15)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life16 = 1;
    while ((local3_life16 < 8)) {
        (__sourceSpill155_15)[local3_life16] = ((byte) ((int) ((local0_life7 << (local3_life16 * 8)) >>> 56)));
        local3_life16 += 1;
    }
    byte[] __sourcePreallocation155_17 = __sourceSpill155_15;
    ((javax.crypto.Cipher)(__sourceSpill155_12)).init(((int)(__sourceSpill155_13)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill155_14)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation155_17)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life20 = 2120843063844182739L;
    byte[] __sourceSpill155_21 = new byte[8];
    (__sourceSpill155_21)[0] = ((byte) ((int) (local4_life20 >>> 56)));
    (__sourceSpill155_21)[1] = ((byte) ((int) (local4_life20 >>> 48)));
    (__sourceSpill155_21)[2] = ((byte) ((int) (local4_life20 >>> 40)));
    (__sourceSpill155_21)[3] = ((byte) ((int) (local4_life20 >>> 32)));
    (__sourceSpill155_21)[4] = ((byte) ((int) (local4_life20 >>> 24)));
    (__sourceSpill155_21)[5] = ((byte) ((int) (local4_life20 >>> 16)));
    (__sourceSpill155_21)[6] = ((byte) ((int) (local4_life20 >>> 8)));
    (__sourceSpill155_21)[7] = ((byte) ((int) local4_life20));
    javax.crypto.Cipher __sourceSpill155_22 = local2_life10;
    byte[] local6_life24 = ((javax.crypto.Cipher)(__sourceSpill155_22)).doFinal(((byte[])(__sourceSpill155_21)));
    l = ((long)((((((((((((long) (local6_life24)[0]) & 255L) << 56) | ((((long) (local6_life24)[1]) & 255L) << 48)) | ((((long) (local6_life24)[2]) & 255L) << 40)) | ((((long) (local6_life24)[3]) & 255L) << 32)) | ((((long) (local6_life24)[4]) & 255L) << 24)) | ((((long) (local6_life24)[5]) & 255L) << 16)) | ((((long) (local6_life24)[6]) & 255L) << 8)) | (((long) (local6_life24)[7]) & 255L))));
}


public static net.minecraft.entity.Entity[] b() {
return com.moon.i7.j;
}


public static void b(net.minecraft.entity.Entity[] p0) {
com.moon.i7.j = ((net.minecraft.entity.Entity[])(p0));
    return;
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
    net.minecraft.entity.Entity[] life6_38;
    life4_3 = (com.moon.i7.k ^ 21511675431933L);
    life7_8 = (this.a / p1);
    life8_13 = (this.c / p1);
    life9_18 = (this.b / p2);
    net.minecraft.entity.Entity[] spill1346_0 = com.moon.i7.b();
    life10_24 = (this.d / p2);
    ((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(p0)).a(((float)(life8_13)), ((float)(life9_18))))).b(((float)(this.g)), ((float)(this.f))))).a(((int)(this.i)));
    life6_38 = spill1346_0;
    ((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(p0)).a(((float)(life7_8)), ((float)(life9_18))))).b(((float)(this.e)), ((float)(this.f))))).a(((int)(this.i)));
    ((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(p0)).a(((float)(life7_8)), ((float)(life10_24))))).b(((float)(this.e)), ((float)(this.h))))).a(((int)(this.i)));
    ((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(p0)).a(((float)(life8_13)), ((float)(life10_24))))).b(((float)(this.g)), ((float)(this.h))))).a(((int)(this.i)));
    int spill1346_1 = 4;
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        com.moon.i7.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[2])));
    }
    return spill1346_1;
}


public static com.moon.i7 a(float p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7, int p8) {
return new com.moon.i7(p0, p1, p2, p3, p4, p5, p6, p7, p8);
}


public int a__Int() {
long local1 = (com.moon.i7.k ^ 52675009855737L);
    return ((int) com.moon.i7.l);
}

}
