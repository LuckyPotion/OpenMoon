package com.moon;


class ql extends org.luaj.vm2.lib.OneArgFunction {

com.moon.jW a;

private static long b;

private static java.lang.String c;

ql(com.moon.jW p0) { super(); }


private static void __sourceConstructorBody_0e0bde9280144660(com.moon.ql receiver, com.moon.jW p0) throws Throwable {

((com.moon.ql)(receiver)).a = ((com.moon.jW)(p0));

    com.moon.ql.__sourceConstructorInit_0e0bde9280144660_0(((com.moon.ql)(receiver)));

    return;

}



static {
javax.crypto.Cipher forestValue224_31_0;
    int forestValue224_31_1;
    javax.crypto.SecretKeyFactory forestValue224_31_2;
    byte[] forestValue224_31_3;
    javax.crypto.Cipher forestValue224_48_0;
    int forestValue224_48_1;
    javax.crypto.SecretKeyFactory forestValue224_48_2;
    byte[] forestValue224_48_3;
    javax.crypto.Cipher spill224_0;
    int spill224_1;
    javax.crypto.SecretKeyFactory spill224_2;
    byte[] spill224_3;
    byte[] spill224_4;
    int spill224_5;
    java.lang.String spill224_6;
    long life0_11;
    javax.crypto.Cipher life2_15;
    int life3_30;
    byte[] life4_68;
    forest_join_48: {
    b = ((long)(((moom._a)(moom._c.a(((long)(2517655949139307797L)), ((long)(-6440144271814279256L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(261101184650726L)))));
    life0_11 = (com.moon.ql.b ^ 135228827706663L);
    spill224_0 = (life2_15 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill224_1 = 2;
    spill224_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp224_8_0 = new byte[8];
    spill224_3 = __stackOp224_8_0;
    (__stackOp224_8_0)[0] = ((byte) ((int) (life0_11 >>> 56)));
    life3_30 = 1;
    forestValue224_31_0 = spill224_0;
    forestValue224_31_1 = spill224_1;
    forestValue224_31_2 = spill224_2;
    forestValue224_31_3 = spill224_3;
    forest_cycle_31: while (true) {
    if (!((life3_30 < 8))) {
        forestValue224_48_0 = forestValue224_31_0;
        forestValue224_48_1 = forestValue224_31_1;
        forestValue224_48_2 = forestValue224_31_2;
        forestValue224_48_3 = forestValue224_31_3;
        break forest_join_48;
    }
    byte[] __stackOp224_9_0 = forestValue224_31_3;
    spill224_4 = __stackOp224_9_0;
    (__stackOp224_9_0)[life3_30] = ((byte) ((int) ((life0_11 << (life3_30 * 8)) >>> 56)));
    life3_30 += 1;
    forestValue224_31_3 = spill224_4;
    continue forest_cycle_31;
    }
    }
    ((javax.crypto.Cipher)(forestValue224_48_0)).init(((int)(forestValue224_48_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue224_48_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue224_48_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String __stackOp224_12_0 = "\030Ñs¹T&zz,v\\j^Þs3fÿEëÈ\036-ì­i~é";
    int __stackOp224_12_1 = -1;
    spill224_5 = __stackOp224_12_1;
    byte[] __stackOp224_14_0 = ((java.lang.String)(__stackOp224_12_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp224_14_1 = life2_15;
    life4_68 = ((javax.crypto.Cipher)(__stackOp224_14_1)).doFinal(((byte[])(__stackOp224_14_0)));
    int __stackOp224_18_0 = spill224_5;
    java.lang.String __stackOp224_18_1 = ((java.lang.String)(com.moon.ql.a(((byte[])(life4_68))))).intern();
    spill224_6 = __stackOp224_18_1;
    recovery.source.CarrierOps.discard(__stackOp224_18_0);
    c = ((java.lang.String)(spill224_6));
}

private static native <E extends Throwable> void __sourceConstructorInit_0e0bde9280144660_0(com.moon.ql a0) throws E;

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
        byte[] spill1326_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1326_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1326_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1326_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1326_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1326_2)[life4_9];
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
int forestValue185_20_0;
    boolean spill185_0;
    long life2_3;
    int life4_5;
    int life5_21;
    forest_join_20: {
    forest_join_18: {
    life2_3 = (com.moon.ql.b ^ 114378871412965L);
    life4_5 = com.moon.jN.b();
    spill185_0 = ((org.luaj.vm2.LuaValue)(p0)).isnumber();
    if (!((life4_5 != 0))) {
        forestValue185_20_0 = ((spill185_0) ? 1 : 0);
        break forest_join_20;
    }
    if (!((!spill185_0))) {
        break forest_join_18;
    }
    java.lang.String __stackOp185_6_0 = ((org.luaj.vm2.LuaValue)(p0)).typename();
    java.lang.String __stackOp185_6_1 = com.moon.ql.c;
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_2a79a5f862bb_invokedynamic185_7(__stackOp185_6_1, __stackOp185_6_0))));
    }
    forestValue185_20_0 = ((org.luaj.vm2.LuaValue)(p0)).toint();
    }
    life5_21 = forestValue185_20_0;
    return org.luaj.vm2.LuaValue.valueOf(((int)(((com.moon.j5)(((com.moon.jW)(this.a)).c)).get_ticks_existed(((int)(life5_21))))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2a79a5f862bb_invokedynamic185_7(java.lang.String a0, java.lang.String a1) throws E;
}
