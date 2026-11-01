package com.moon;


public class oo extends com.moon.ol<com.moon.E> {

private static java.lang.String d;

private static final long e;

private static final java.lang.String f;

public oo(com.moon.od p0) {
super(p0, ((byte) 2));
    return;
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(8476698464366106184L)), ((long)(-4180871825618305403L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(174630605857094L)))));
    java.lang.String __sourceSpill330_6 = "EMizLb";
    long local0_life7 = (com.moon.oo.e ^ 59791474430026L);
    com.moon.oo.b(((java.lang.String)(__sourceSpill330_6)));
    javax.crypto.Cipher local2_life10;
    javax.crypto.Cipher __sourceSpill330_12 = (local2_life10 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill330_13 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill330_14 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill330_15 = new byte[8];
    (__sourceSpill330_15)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life16 = 1;
    while ((local3_life16 < 8)) {
        (__sourceSpill330_15)[local3_life16] = ((byte) ((int) ((local0_life7 << (local3_life16 * 8)) >>> 56)));
        local3_life16 += 1;
    }
    byte[] __sourcePreallocation330_17 = __sourceSpill330_15;
    ((javax.crypto.Cipher)(__sourceSpill330_12)).init(((int)(__sourceSpill330_13)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill330_14)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation330_17)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill330_21 = ((java.lang.String)("M·\033õTñn")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill330_22 = local2_life10;
    byte[] local4_life24 = ((javax.crypto.Cipher)(__sourceSpill330_22)).doFinal(((byte[])(__sourceSpill330_21)));
    f = ((java.lang.String)(((java.lang.String)(com.moon.oo.a(((byte[])(local4_life24))))).intern()));
}


public static void b(java.lang.String p0) {
com.moon.oo.d = ((java.lang.String)(p0));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
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
        byte[] spill1461_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1461_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1461_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1461_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1461_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1461_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public static java.lang.String a__sourceReturn_0e30dfc966() {
return com.moon.oo.d;
}


public void a(java.nio.ByteBuffer p0) {
long life2_3;
    com.moon.E life5_10;
    java.lang.String life4_21;
    life2_3 = (com.moon.oo.e ^ 95711803738329L);
    java.lang.String spill1145_0 = __sourceExactCall_f8bf02dc76e4b3();
    life5_10 = ((com.moon.E)(((com.moon.oo)(this)).a(((java.nio.ByteBuffer)(p0)), ((com.google.protobuf.GeneratedMessageV3)(com.moon.E.a__E())))));
    java.util.function.Consumer spill1145_1 = ((com.moon.oe)(((com.moon.od)(((com.moon.oo)(this)).a__od())).a())).a__Consumer();
    java.lang.String __stackOp1145_10_0 = ((com.moon.E)(life5_10)).a__String();
    java.lang.String __stackOp1145_10_1 = com.moon.oo.f;
    ((java.util.function.Consumer)(spill1145_1)).accept(((java.lang.Object)(__sourceIntrinsic_ab9089d21ff4_invokedynamic1145_11(__stackOp1145_10_1, __stackOp1145_10_0))));
    life4_21 = spill1145_0;
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        com.moon.oo.b(((java.lang.String)("Rbgqh")));
    }
    return;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ab9089d21ff4_invokedynamic1145_11(java.lang.String a0, java.lang.String a1) throws E;

private static native java.lang.String __sourceExactCall_f8bf02dc76e4b3();
}
