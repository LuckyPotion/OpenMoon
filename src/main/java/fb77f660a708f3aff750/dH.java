package com.moon;


public class dH implements com.moon.oc {

private static int[] b;

private static final long a;

private static final java.lang.String c;

public dH() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(3817818886138685937L)), ((long)(6861984527065667668L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(225074700407394L)))));
    java.lang.Object __sourceSpill66_6 = null;
    long local0_life7 = (com.moon.dH.a ^ 135617712285166L);
    com.moon.dH.b(((int[])(__sourceSpill66_6)));
    javax.crypto.Cipher local2_life10;
    javax.crypto.Cipher __sourceSpill66_12 = (local2_life10 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill66_13 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill66_14 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill66_15 = new byte[8];
    (__sourceSpill66_15)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life16 = 1;
    while ((local3_life16 < 8)) {
        (__sourceSpill66_15)[local3_life16] = ((byte) ((int) ((local0_life7 << (local3_life16 * 8)) >>> 56)));
        local3_life16 += 1;
    }
    byte[] __sourcePreallocation66_17 = __sourceSpill66_15;
    ((javax.crypto.Cipher)(__sourceSpill66_12)).init(((int)(__sourceSpill66_13)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill66_14)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation66_17)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill66_21 = ((java.lang.String)("Å9Qè¤Ì9qÂ\bÈR&i¸p`ã0Â")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill66_22 = local2_life10;
    byte[] local4_life24 = ((javax.crypto.Cipher)(__sourceSpill66_22)).doFinal(((byte[])(__sourceSpill66_21)));
    c = ((java.lang.String)(((java.lang.String)(com.moon.dH.a(((byte[])(local4_life24))))).intern()));
}


public static int[] b() {
return com.moon.dH.b;
}


public static void b(int[] p0) {
com.moon.dH.b = ((int[])(p0));
    return;
}


private static java.lang.String a(byte[] p0) {
int life1_1;
    int life2_5;
    char[] life3_7;
    int life4_9;
    int life5_19;
    int life6_39;
    int life5_44;
    int life6_52;
    int life6_71;
    int life5_76;
    int life6_86;
    int life5_91;
    int life6_99;
    life1_1 = 0;
    life3_7 = new char[(life2_5 = (p0).length)];
    life4_9 = 0;
    loop_region_10: while ((life4_9 < life2_5)) {
        if (((life5_19 = (255 & (p0)[life4_9])) < 192)) {
        (life3_7)[(life1_1++)] = ((char) life5_19);
    } else {
        if ((life5_19 < 224)) {
        life6_39 = ((int)(((char) (((char) (life5_19 & 31)) << 6))));
        byte[] spill156_0 = p0;
        life4_9 += 1;
        life5_44 = (spill156_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill156_1 = p0;
        life4_9 += 1;
        life5_76 = (spill156_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill156_2 = p0;
        life4_9 += 1;
        life5_91 = (spill156_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public java.lang.String a() {
long life1_3;
    com.moon.fU life4_7;
    int[] life3_8;
    java.util.Collection life5_12;
    int life6_19;
    life1_3 = (com.moon.dH.a ^ 66255874482177L);
    int[] spill46_0 = com.moon.dH.b();
    life4_7 = ((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU();
    life3_8 = spill46_0;
    life5_12 = ((com.moon.fV)(((com.moon.fU)(life4_7)).a__fV())).a__Collection();
    life6_19 = ((int) ((java.util.stream.Stream)(((java.util.stream.Stream)(((java.util.Collection)(life5_12)).stream())).filter(((java.util.function.Predicate)(__sourceIntrinsic_63ef3276e4d3_invokedynamic46_7()))))).count());
    int spill46_1 = life6_19;
    int __stackOp46_11_0 = ((java.util.Collection)(life5_12)).size();
    java.lang.String __stackOp46_11_1 = "/";
    java.lang.String spill46_2 = __sourceIntrinsic_63ef3276e4d3_invokedynamic46_13(spill46_1, __stackOp46_11_1, __stackOp46_11_0, com.moon.dH.c);
    if ((life3_8 != null)) {
        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[2])));
    }
    return spill46_2;
}


private static native <E extends Throwable> java.util.function.Predicate __sourceIntrinsic_63ef3276e4d3_invokedynamic46_7() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_63ef3276e4d3_invokedynamic46_13(int a0, java.lang.String a1, int a2, java.lang.String a3) throws E;
}
