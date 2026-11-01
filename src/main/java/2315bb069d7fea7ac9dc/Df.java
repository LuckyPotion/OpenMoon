package moom;


public class Df {

private static final java.lang.Integer[] a;

private static final long b;

public Df() {
super();
}


static {
javax.crypto.Cipher forestValue387_31_0;
    int forestValue387_31_1;
    javax.crypto.SecretKeyFactory forestValue387_31_2;
    byte[] forestValue387_31_3;
    javax.crypto.Cipher forestValue387_48_0;
    int forestValue387_48_1;
    javax.crypto.SecretKeyFactory forestValue387_48_2;
    byte[] forestValue387_48_3;
    javax.crypto.Cipher spill387_0;
    int spill387_1;
    javax.crypto.SecretKeyFactory spill387_2;
    byte[] spill387_3;
    byte[] spill387_4;
    int spill387_5;
    long spill387_6;
    byte[] spill387_7;
    byte[] spill387_8;
    byte[] spill387_9;
    byte[] spill387_10;
    byte[] spill387_11;
    byte[] spill387_12;
    byte[] spill387_13;
    byte[] spill387_14;
    long spill387_15;
    int spill387_16;
    long life6_11;
    javax.crypto.Cipher life1_15;
    int life2_30;
    long life3_64;
    byte[] life5_132;
    long life0_206;
    int life8_213;
    int life9_216;
    forest_join_224: {
    forest_join_48: {
    b = ((long)(((moom._a)(moom._c.a(((long)(7592381571213512420L)), ((long)(-8923598026447208183L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(162231083524043L)))));
    life6_11 = (moom.Df.b ^ 47820110591674L);
    spill387_0 = (life1_15 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill387_1 = 2;
    spill387_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp387_8_0 = new byte[8];
    spill387_3 = __stackOp387_8_0;
    (__stackOp387_8_0)[0] = ((byte) ((int) (life6_11 >>> 56)));
    life2_30 = 1;
    forestValue387_31_0 = spill387_0;
    forestValue387_31_1 = spill387_1;
    forestValue387_31_2 = spill387_2;
    forestValue387_31_3 = spill387_3;
    forest_cycle_31: while (true) {
    if (!((life2_30 < 8))) {
        forestValue387_48_0 = forestValue387_31_0;
        forestValue387_48_1 = forestValue387_31_1;
        forestValue387_48_2 = forestValue387_31_2;
        forestValue387_48_3 = forestValue387_31_3;
        break forest_join_48;
    }
    byte[] __stackOp387_9_0 = forestValue387_31_3;
    spill387_4 = __stackOp387_9_0;
    (__stackOp387_9_0)[life2_30] = ((byte) ((int) ((life6_11 << (life2_30 * 8)) >>> 56)));
    life2_30 += 1;
    forestValue387_31_3 = spill387_4;
    continue forest_cycle_31;
    }
    }
    ((javax.crypto.Cipher)(forestValue387_48_0)).init(((int)(forestValue387_48_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue387_48_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue387_48_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long __stackOp387_12_0 = 6990960503019263442L;
    int __stackOp387_12_1 = -1;
    spill387_5 = __stackOp387_12_1;
    spill387_6 = __stackOp387_12_0;
    recovery.source.CarrierOps.discard(__stackOp387_12_1);
    life3_64 = spill387_6;
    byte[] __stackOp387_14_0 = new byte[8];
    spill387_7 = __stackOp387_14_0;
    (__stackOp387_14_0)[0] = ((byte) ((int) (life3_64 >>> 56)));
    byte[] __stackOp387_15_0 = spill387_7;
    spill387_8 = __stackOp387_15_0;
    (__stackOp387_15_0)[1] = ((byte) ((int) (life3_64 >>> 48)));
    byte[] __stackOp387_16_0 = spill387_8;
    spill387_9 = __stackOp387_16_0;
    (__stackOp387_16_0)[2] = ((byte) ((int) (life3_64 >>> 40)));
    byte[] __stackOp387_17_0 = spill387_9;
    spill387_10 = __stackOp387_17_0;
    (__stackOp387_17_0)[3] = ((byte) ((int) (life3_64 >>> 32)));
    byte[] __stackOp387_18_0 = spill387_10;
    spill387_11 = __stackOp387_18_0;
    (__stackOp387_18_0)[4] = ((byte) ((int) (life3_64 >>> 24)));
    byte[] __stackOp387_19_0 = spill387_11;
    spill387_12 = __stackOp387_19_0;
    (__stackOp387_19_0)[5] = ((byte) ((int) (life3_64 >>> 16)));
    byte[] __stackOp387_20_0 = spill387_12;
    spill387_13 = __stackOp387_20_0;
    (__stackOp387_20_0)[6] = ((byte) ((int) (life3_64 >>> 8)));
    byte[] __stackOp387_21_0 = spill387_13;
    spill387_14 = __stackOp387_21_0;
    (__stackOp387_21_0)[7] = ((byte) ((int) life3_64));
    byte[] __stackOp387_22_0 = spill387_14;
    javax.crypto.Cipher __stackOp387_22_1 = life1_15;
    life5_132 = ((javax.crypto.Cipher)(__stackOp387_22_1)).doFinal(((byte[])(__stackOp387_22_0)));
    int __stackOp387_24_0 = spill387_5;
    long __stackOp387_24_1 = (((((((((((long) (life5_132)[0]) & 255L) << 56) | ((((long) (life5_132)[1]) & 255L) << 48)) | ((((long) (life5_132)[2]) & 255L) << 40)) | ((((long) (life5_132)[3]) & 255L) << 32)) | ((((long) (life5_132)[4]) & 255L) << 24)) | ((((long) (life5_132)[5]) & 255L) << 16)) | ((((long) (life5_132)[6]) & 255L) << 8)) | (((long) (life5_132)[7]) & 255L));
    spill387_15 = __stackOp387_24_1;
    spill387_16 = __stackOp387_24_0;
    recovery.source.CarrierOps.discard(__stackOp387_24_1);
    recovery.source.CarrierOps.discard(spill387_16);
    life0_206 = spill387_15;
    a = ((java.lang.Integer[])(new java.lang.Integer[((int) life0_206)]));
    life8_213 = 0;
    life9_216 = (moom.Df.a).length;
    forest_cycle_214: while (true) {
    if (!((life8_213 < life9_216))) {
        break forest_join_224;
    }
    (moom.Df.a)[life8_213] = java.lang.Integer.valueOf(((int)(life8_213)));
    life8_213 += 1;
    continue forest_cycle_214;
    }
    }
}


public static java.lang.Integer a(int p0) {
int forwardValue1712_21_0;
    java.lang.Integer forwardValue1712_22_0;
    int spill1712_0;
    int spill1712_1;
    long life1_3;
    int life3_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    life1_3 = (moom.Df.b ^ 135590948422457L);
    life3_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill1712_0 = p0;
    if (!((life3_5 != 0))) {
        forwardValue1712_21_0 = spill1712_0;
        break forward_join_21;
    }
    if (!((spill1712_0 >= 0))) {
        break forward_join_20;
    }
    spill1712_1 = p0;
    if (!((life3_5 != 0))) {
        forwardValue1712_21_0 = spill1712_1;
        break forward_join_21;
    }
    if (!((spill1712_1 < (moom.Df.a).length))) {
        break forward_join_20;
    }
    forwardValue1712_22_0 = (moom.Df.a)[p0];
    break forward_join_22;
    }
    forwardValue1712_21_0 = p0;
    }
    forwardValue1712_22_0 = java.lang.Integer.valueOf(((int)(forwardValue1712_21_0)));
    }
    return forwardValue1712_22_0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
