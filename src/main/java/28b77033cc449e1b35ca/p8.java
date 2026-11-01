package com.moon;


class p8 extends org.luaj.vm2.lib.OneArgFunction {

com.moon.jU a;

private static long b;

private static java.lang.String c;

p8(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_85c49e6a445f0ba8(com.moon.p8 receiver, com.moon.jU p0) throws Throwable {

((com.moon.p8)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.p8.__sourceConstructorInit_85c49e6a445f0ba8_0(((com.moon.p8)(receiver)));

    return;

}



static {
javax.crypto.Cipher forestValue81_31_0;
    int forestValue81_31_1;
    javax.crypto.SecretKeyFactory forestValue81_31_2;
    byte[] forestValue81_31_3;
    javax.crypto.Cipher forestValue81_48_0;
    int forestValue81_48_1;
    javax.crypto.SecretKeyFactory forestValue81_48_2;
    byte[] forestValue81_48_3;
    javax.crypto.Cipher spill81_0;
    int spill81_1;
    javax.crypto.SecretKeyFactory spill81_2;
    byte[] spill81_3;
    byte[] spill81_4;
    int spill81_5;
    java.lang.String spill81_6;
    long life0_11;
    javax.crypto.Cipher life2_15;
    int life3_30;
    byte[] life4_68;
    forest_join_48: {
    b = ((long)(((moom._a)(moom._c.a(((long)(5982402737081068669L)), ((long)(-5638499902017387000L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(189287396591651L)))));
    life0_11 = (com.moon.p8.b ^ 91494623321272L);
    spill81_0 = (life2_15 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill81_1 = 2;
    spill81_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp81_8_0 = new byte[8];
    spill81_3 = __stackOp81_8_0;
    (__stackOp81_8_0)[0] = ((byte) ((int) (life0_11 >>> 56)));
    life3_30 = 1;
    forestValue81_31_0 = spill81_0;
    forestValue81_31_1 = spill81_1;
    forestValue81_31_2 = spill81_2;
    forestValue81_31_3 = spill81_3;
    forest_cycle_31: while (true) {
    if (!((life3_30 < 8))) {
        forestValue81_48_0 = forestValue81_31_0;
        forestValue81_48_1 = forestValue81_31_1;
        forestValue81_48_2 = forestValue81_31_2;
        forestValue81_48_3 = forestValue81_31_3;
        break forest_join_48;
    }
    byte[] __stackOp81_9_0 = forestValue81_31_3;
    spill81_4 = __stackOp81_9_0;
    (__stackOp81_9_0)[life3_30] = ((byte) ((int) ((life0_11 << (life3_30 * 8)) >>> 56)));
    life3_30 += 1;
    forestValue81_31_3 = spill81_4;
    continue forest_cycle_31;
    }
    }
    ((javax.crypto.Cipher)(forestValue81_48_0)).init(((int)(forestValue81_48_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue81_48_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue81_48_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String __stackOp81_12_0 = "! ÔdsËà ØÜý¾0ªÄ3`#jô{OÝ\növÒ";
    int __stackOp81_12_1 = -1;
    spill81_5 = __stackOp81_12_1;
    byte[] __stackOp81_14_0 = ((java.lang.String)(__stackOp81_12_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp81_14_1 = life2_15;
    life4_68 = ((javax.crypto.Cipher)(__stackOp81_14_1)).doFinal(((byte[])(__stackOp81_14_0)));
    int __stackOp81_18_0 = spill81_5;
    java.lang.String __stackOp81_18_1 = ((java.lang.String)(com.moon.p8.a(((byte[])(life4_68))))).intern();
    spill81_6 = __stackOp81_18_1;
    recovery.source.CarrierOps.discard(__stackOp81_18_0);
    c = ((java.lang.String)(spill81_6));
}

private static native <E extends Throwable> void __sourceConstructorInit_85c49e6a445f0ba8_0(com.moon.p8 a0) throws E;

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
        byte[] spill1162_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1162_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1162_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1162_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1162_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1162_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public org.luaj.vm2.LuaValue call(org.luaj.vm2.LuaValue p0) {
org.luaj.vm2.LuaValue forestValue100038_27_0;
    int spill100038_0;
    org.luaj.vm2.LuaValue spill100038_1;
    org.luaj.vm2.LuaValue spill100038_2;
    long life2_3;
    org.luaj.vm2.LuaValue life5_8;
    int life4_9;
    forest_join_28: {
    forest_join_27: {
    forest_join_21: {
    life2_3 = (com.moon.p8.b ^ 95252849690344L);
    spill100038_0 = com.moon.jN.b();
    life5_8 = ((org.luaj.vm2.LuaValue)(p0)).arg(((int)(1)));
    life4_9 = spill100038_0;
    spill100038_1 = life5_8;
    if (!((life4_9 != 0))) {
        forestValue100038_27_0 = spill100038_1;
        break forest_join_27;
    }
    if (!((!((org.luaj.vm2.LuaValue)(spill100038_1)).isnil()))) {
        break forest_join_21;
    }
    spill100038_2 = life5_8;
    if (!((life4_9 != 0))) {
        forestValue100038_27_0 = spill100038_2;
        break forest_join_27;
    }
    if (!((!((org.luaj.vm2.LuaValue)(spill100038_2)).isuserdata(((java.lang.Class)(com.moon.scripting.api.types.Vec3d.class)))))) {
        break forest_join_28;
    }
    }
    java.lang.String __stackOp100038_8_0 = ((org.luaj.vm2.LuaValue)(life5_8)).typename();
    java.lang.String __stackOp100038_8_1 = com.moon.p8.c;
    forestValue100038_27_0 = org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_2a79a5f862bb_invokedynamic100038_9(__stackOp100038_8_1, __stackOp100038_8_0))));
    }
    return forestValue100038_27_0;
    }
    return org.luaj.vm2.LuaValue.valueOf(((double)(((com.moon.j3)(((com.moon.jU)(this.a)).c)).distance_to_vec(((com.moon.scripting.api.types.Vec3d)(((com.moon.scripting.api.types.Vec3d)(((org.luaj.vm2.LuaValue)(life5_8)).touserdata(((java.lang.Class)(com.moon.scripting.api.types.Vec3d.class)))))))))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2a79a5f862bb_invokedynamic100038_9(java.lang.String a0, java.lang.String a1) throws E;
}
