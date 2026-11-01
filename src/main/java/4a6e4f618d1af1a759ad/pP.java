package com.moon;


class pP extends org.luaj.vm2.lib.OneArgFunction {

com.moon.jS a;

private static long b;

private static java.lang.String c;

pP(com.moon.jS p0) { super(); }


private static void __sourceConstructorBody_d4fd38d3c663bd3b(com.moon.pP receiver, com.moon.jS p0) throws Throwable {

((com.moon.pP)(receiver)).a = ((com.moon.jS)(p0));

    com.moon.pP.__sourceConstructorInit_d4fd38d3c663bd3b_0(((com.moon.pP)(receiver)));

    return;

}



static {
javax.crypto.Cipher forestValue101_31_0;
    int forestValue101_31_1;
    javax.crypto.SecretKeyFactory forestValue101_31_2;
    byte[] forestValue101_31_3;
    javax.crypto.Cipher forestValue101_48_0;
    int forestValue101_48_1;
    javax.crypto.SecretKeyFactory forestValue101_48_2;
    byte[] forestValue101_48_3;
    javax.crypto.Cipher spill101_0;
    int spill101_1;
    javax.crypto.SecretKeyFactory spill101_2;
    byte[] spill101_3;
    byte[] spill101_4;
    int spill101_5;
    java.lang.String spill101_6;
    long life0_11;
    javax.crypto.Cipher life2_15;
    int life3_30;
    byte[] life4_68;
    forest_join_48: {
    b = ((long)(((moom._a)(moom._c.a(((long)(4179274345426504073L)), ((long)(4295829956233516568L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(229671202724650L)))));
    life0_11 = (com.moon.pP.b ^ 60584978446719L);
    spill101_0 = (life2_15 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill101_1 = 2;
    spill101_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp101_8_0 = new byte[8];
    spill101_3 = __stackOp101_8_0;
    (__stackOp101_8_0)[0] = ((byte) ((int) (life0_11 >>> 56)));
    life3_30 = 1;
    forestValue101_31_0 = spill101_0;
    forestValue101_31_1 = spill101_1;
    forestValue101_31_2 = spill101_2;
    forestValue101_31_3 = spill101_3;
    forest_cycle_31: while (true) {
    if (!((life3_30 < 8))) {
        forestValue101_48_0 = forestValue101_31_0;
        forestValue101_48_1 = forestValue101_31_1;
        forestValue101_48_2 = forestValue101_31_2;
        forestValue101_48_3 = forestValue101_31_3;
        break forest_join_48;
    }
    byte[] __stackOp101_9_0 = forestValue101_31_3;
    spill101_4 = __stackOp101_9_0;
    (__stackOp101_9_0)[life3_30] = ((byte) ((int) ((life0_11 << (life3_30 * 8)) >>> 56)));
    life3_30 += 1;
    forestValue101_31_3 = spill101_4;
    continue forest_cycle_31;
    }
    }
    ((javax.crypto.Cipher)(forestValue101_48_0)).init(((int)(forestValue101_48_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue101_48_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue101_48_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String __stackOp101_12_0 = "ä7§7kÆ'ygáÉz|h6*ÌÝ*ÈõÆ{Ö¸\013ç+";
    int __stackOp101_12_1 = -1;
    spill101_5 = __stackOp101_12_1;
    byte[] __stackOp101_14_0 = ((java.lang.String)(__stackOp101_12_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp101_14_1 = life2_15;
    life4_68 = ((javax.crypto.Cipher)(__stackOp101_14_1)).doFinal(((byte[])(__stackOp101_14_0)));
    int __stackOp101_18_0 = spill101_5;
    java.lang.String __stackOp101_18_1 = ((java.lang.String)(com.moon.pP.a(((byte[])(life4_68))))).intern();
    spill101_6 = __stackOp101_18_1;
    recovery.source.CarrierOps.discard(__stackOp101_18_0);
    c = ((java.lang.String)(spill101_6));
}

private static native <E extends Throwable> void __sourceConstructorInit_d4fd38d3c663bd3b_0(com.moon.pP a0) throws E;

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
        byte[] spill1181_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1181_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1181_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1181_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1181_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1181_2)[life4_9];
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
org.luaj.vm2.LuaValue forestValue157_22_0;
    int forestValue157_25_0;
    org.luaj.vm2.LuaValue spill157_0;
    boolean spill157_1;
    long life2_3;
    int life4_5;
    int life5_29;
    forest_join_25: {
    forest_join_23: {
    forest_join_22: {
    forest_join_16: {
    life2_3 = (com.moon.pP.b ^ 58284915704191L);
    life4_5 = com.moon.jN.c();
    spill157_0 = p0;
    if (!((life4_5 == 0))) {
        forestValue157_22_0 = spill157_0;
        break forest_join_22;
    }
    if (!((!((org.luaj.vm2.LuaValue)(spill157_0)).isnil()))) {
        break forest_join_16;
    }
    spill157_1 = ((org.luaj.vm2.LuaValue)(p0)).isnumber();
    if (!((life4_5 == 0))) {
        forestValue157_25_0 = ((spill157_1) ? 1 : 0);
        break forest_join_25;
    }
    if (!((!spill157_1))) {
        break forest_join_23;
    }
    }
    java.lang.String __stackOp157_7_0 = ((org.luaj.vm2.LuaValue)(p0)).typename();
    java.lang.String __stackOp157_7_1 = com.moon.pP.c;
    forestValue157_22_0 = org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_2a79a5f862bb_invokedynamic157_8(__stackOp157_7_1, __stackOp157_7_0))));
    }
    return forestValue157_22_0;
    }
    forestValue157_25_0 = ((org.luaj.vm2.LuaValue)(p0)).toint();
    }
    life5_29 = forestValue157_25_0;
    return org.luaj.vm2.LuaValue.valueOf(((double)(((com.moon.j1)(((com.moon.jS)(this.a)).c)).get_damage_reduction(((int)(life5_29))))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2a79a5f862bb_invokedynamic157_8(java.lang.String a0, java.lang.String a1) throws E;
}
