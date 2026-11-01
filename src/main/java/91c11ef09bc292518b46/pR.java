package com.moon;


class pR extends org.luaj.vm2.lib.OneArgFunction {

com.moon.jS a;

private static long b;

private static java.lang.String c;

pR(com.moon.jS p0) { super(); }


private static void __sourceConstructorBody_5a292a4ac3d21b30(com.moon.pR receiver, com.moon.jS p0) throws Throwable {

((com.moon.pR)(receiver)).a = ((com.moon.jS)(p0));

    com.moon.pR.__sourceConstructorInit_5a292a4ac3d21b30_0(((com.moon.pR)(receiver)));

    return;

}



static {
javax.crypto.Cipher forestValue105_31_0;
    int forestValue105_31_1;
    javax.crypto.SecretKeyFactory forestValue105_31_2;
    byte[] forestValue105_31_3;
    javax.crypto.Cipher forestValue105_48_0;
    int forestValue105_48_1;
    javax.crypto.SecretKeyFactory forestValue105_48_2;
    byte[] forestValue105_48_3;
    javax.crypto.Cipher spill105_0;
    int spill105_1;
    javax.crypto.SecretKeyFactory spill105_2;
    byte[] spill105_3;
    byte[] spill105_4;
    int spill105_5;
    java.lang.String spill105_6;
    long life0_11;
    javax.crypto.Cipher life2_15;
    int life3_30;
    byte[] life4_68;
    forest_join_48: {
    b = ((long)(((moom._a)(moom._c.a(((long)(-6727646044547908983L)), ((long)(1294407048598123401L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(172362085628826L)))));
    life0_11 = (com.moon.pR.b ^ 69940572006553L);
    spill105_0 = (life2_15 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill105_1 = 2;
    spill105_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp105_8_0 = new byte[8];
    spill105_3 = __stackOp105_8_0;
    (__stackOp105_8_0)[0] = ((byte) ((int) (life0_11 >>> 56)));
    life3_30 = 1;
    forestValue105_31_0 = spill105_0;
    forestValue105_31_1 = spill105_1;
    forestValue105_31_2 = spill105_2;
    forestValue105_31_3 = spill105_3;
    forest_cycle_31: while (true) {
    if (!((life3_30 < 8))) {
        forestValue105_48_0 = forestValue105_31_0;
        forestValue105_48_1 = forestValue105_31_1;
        forestValue105_48_2 = forestValue105_31_2;
        forestValue105_48_3 = forestValue105_31_3;
        break forest_join_48;
    }
    byte[] __stackOp105_9_0 = forestValue105_31_3;
    spill105_4 = __stackOp105_9_0;
    (__stackOp105_9_0)[life3_30] = ((byte) ((int) ((life0_11 << (life3_30 * 8)) >>> 56)));
    life3_30 += 1;
    forestValue105_31_3 = spill105_4;
    continue forest_cycle_31;
    }
    }
    ((javax.crypto.Cipher)(forestValue105_48_0)).init(((int)(forestValue105_48_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue105_48_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue105_48_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String __stackOp105_12_0 = "\025Ì\030é\017º¶\023TÆü¾ìäÑCÂbëc°\"\021a$\016Àçn";
    int __stackOp105_12_1 = -1;
    spill105_5 = __stackOp105_12_1;
    byte[] __stackOp105_14_0 = ((java.lang.String)(__stackOp105_12_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp105_14_1 = life2_15;
    life4_68 = ((javax.crypto.Cipher)(__stackOp105_14_1)).doFinal(((byte[])(__stackOp105_14_0)));
    int __stackOp105_18_0 = spill105_5;
    java.lang.String __stackOp105_18_1 = ((java.lang.String)(com.moon.pR.a(((byte[])(life4_68))))).intern();
    spill105_6 = __stackOp105_18_1;
    recovery.source.CarrierOps.discard(__stackOp105_18_0);
    c = ((java.lang.String)(spill105_6));
}

private static native <E extends Throwable> void __sourceConstructorInit_5a292a4ac3d21b30_0(com.moon.pR a0) throws E;

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
        byte[] spill1185_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1185_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1185_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1185_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1185_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1185_2)[life4_9];
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
org.luaj.vm2.LuaValue forestValue159_22_0;
    int forestValue159_25_0;
    org.luaj.vm2.LuaValue spill159_0;
    boolean spill159_1;
    long life2_3;
    int life4_5;
    int life5_29;
    forest_join_25: {
    forest_join_23: {
    forest_join_22: {
    forest_join_16: {
    life2_3 = (com.moon.pR.b ^ 113171993796663L);
    life4_5 = com.moon.jN.b();
    spill159_0 = p0;
    if (!((life4_5 != 0))) {
        forestValue159_22_0 = spill159_0;
        break forest_join_22;
    }
    if (!((!((org.luaj.vm2.LuaValue)(spill159_0)).isnil()))) {
        break forest_join_16;
    }
    spill159_1 = ((org.luaj.vm2.LuaValue)(p0)).isnumber();
    if (!((life4_5 != 0))) {
        forestValue159_25_0 = ((spill159_1) ? 1 : 0);
        break forest_join_25;
    }
    if (!((!spill159_1))) {
        break forest_join_23;
    }
    }
    java.lang.String __stackOp159_7_0 = ((org.luaj.vm2.LuaValue)(p0)).typename();
    java.lang.String __stackOp159_7_1 = com.moon.pR.c;
    forestValue159_22_0 = org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_2a79a5f862bb_invokedynamic159_8(__stackOp159_7_1, __stackOp159_7_0))));
    }
    return forestValue159_22_0;
    }
    forestValue159_25_0 = ((org.luaj.vm2.LuaValue)(p0)).toint();
    }
    life5_29 = forestValue159_25_0;
    return org.luaj.vm2.LuaValue.valueOf(((double)(((com.moon.j1)(((com.moon.jS)(this.a)).c)).get_harvest_level(((int)(life5_29))))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2a79a5f862bb_invokedynamic159_8(java.lang.String a0, java.lang.String a1) throws E;
}
