package com.moon;


class pQ extends org.luaj.vm2.lib.OneArgFunction {

com.moon.jS a;

private static long b;

private static java.lang.String c;

pQ(com.moon.jS p0) { super(); }


private static void __sourceConstructorBody_a25e205193b2dbd6(com.moon.pQ receiver, com.moon.jS p0) throws Throwable {

((com.moon.pQ)(receiver)).a = ((com.moon.jS)(p0));

    com.moon.pQ.__sourceConstructorInit_a25e205193b2dbd6_0(((com.moon.pQ)(receiver)));

    return;

}



static {
javax.crypto.Cipher forestValue103_31_0;
    int forestValue103_31_1;
    javax.crypto.SecretKeyFactory forestValue103_31_2;
    byte[] forestValue103_31_3;
    javax.crypto.Cipher forestValue103_48_0;
    int forestValue103_48_1;
    javax.crypto.SecretKeyFactory forestValue103_48_2;
    byte[] forestValue103_48_3;
    javax.crypto.Cipher spill103_0;
    int spill103_1;
    javax.crypto.SecretKeyFactory spill103_2;
    byte[] spill103_3;
    byte[] spill103_4;
    int spill103_5;
    java.lang.String spill103_6;
    long life0_11;
    javax.crypto.Cipher life2_15;
    int life3_30;
    byte[] life4_68;
    forest_join_48: {
    b = ((long)(((moom._a)(moom._c.a(((long)(2730335213853341909L)), ((long)(-148428309699065791L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(279857895438760L)))));
    life0_11 = (com.moon.pQ.b ^ 7311717335191L);
    spill103_0 = (life2_15 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill103_1 = 2;
    spill103_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp103_8_0 = new byte[8];
    spill103_3 = __stackOp103_8_0;
    (__stackOp103_8_0)[0] = ((byte) ((int) (life0_11 >>> 56)));
    life3_30 = 1;
    forestValue103_31_0 = spill103_0;
    forestValue103_31_1 = spill103_1;
    forestValue103_31_2 = spill103_2;
    forestValue103_31_3 = spill103_3;
    forest_cycle_31: while (true) {
    if (!((life3_30 < 8))) {
        forestValue103_48_0 = forestValue103_31_0;
        forestValue103_48_1 = forestValue103_31_1;
        forestValue103_48_2 = forestValue103_31_2;
        forestValue103_48_3 = forestValue103_31_3;
        break forest_join_48;
    }
    byte[] __stackOp103_9_0 = forestValue103_31_3;
    spill103_4 = __stackOp103_9_0;
    (__stackOp103_9_0)[life3_30] = ((byte) ((int) ((life0_11 << (life3_30 * 8)) >>> 56)));
    life3_30 += 1;
    forestValue103_31_3 = spill103_4;
    continue forest_cycle_31;
    }
    }
    ((javax.crypto.Cipher)(forestValue103_48_0)).init(((int)(forestValue103_48_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue103_48_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue103_48_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String __stackOp103_12_0 = "KÿªßæC\017üµ¸Ib`øÔ\rÇÉó+ýãñ¿\0222";
    int __stackOp103_12_1 = -1;
    spill103_5 = __stackOp103_12_1;
    byte[] __stackOp103_14_0 = ((java.lang.String)(__stackOp103_12_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp103_14_1 = life2_15;
    life4_68 = ((javax.crypto.Cipher)(__stackOp103_14_1)).doFinal(((byte[])(__stackOp103_14_0)));
    int __stackOp103_18_0 = spill103_5;
    java.lang.String __stackOp103_18_1 = ((java.lang.String)(com.moon.pQ.a(((byte[])(life4_68))))).intern();
    spill103_6 = __stackOp103_18_1;
    recovery.source.CarrierOps.discard(__stackOp103_18_0);
    c = ((java.lang.String)(spill103_6));
}

private static native <E extends Throwable> void __sourceConstructorInit_a25e205193b2dbd6_0(com.moon.pQ a0) throws E;

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
        byte[] spill1183_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1183_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1183_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1183_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1183_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1183_2)[life4_9];
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
org.luaj.vm2.LuaValue forestValue158_22_0;
    int forestValue158_25_0;
    org.luaj.vm2.LuaValue spill158_0;
    boolean spill158_1;
    long life2_3;
    int life4_5;
    int life5_29;
    forest_join_25: {
    forest_join_23: {
    forest_join_22: {
    forest_join_16: {
    life2_3 = (com.moon.pQ.b ^ 51601016724663L);
    life4_5 = com.moon.jN.c();
    spill158_0 = p0;
    if (!((life4_5 == 0))) {
        forestValue158_22_0 = spill158_0;
        break forest_join_22;
    }
    if (!((!((org.luaj.vm2.LuaValue)(spill158_0)).isnil()))) {
        break forest_join_16;
    }
    spill158_1 = ((org.luaj.vm2.LuaValue)(p0)).isnumber();
    if (!((life4_5 == 0))) {
        forestValue158_25_0 = ((spill158_1) ? 1 : 0);
        break forest_join_25;
    }
    if (!((!spill158_1))) {
        break forest_join_23;
    }
    }
    java.lang.String __stackOp158_7_0 = ((org.luaj.vm2.LuaValue)(p0)).typename();
    java.lang.String __stackOp158_7_1 = com.moon.pQ.c;
    forestValue158_22_0 = org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_2a79a5f862bb_invokedynamic158_8(__stackOp158_7_1, __stackOp158_7_0))));
    }
    return forestValue158_22_0;
    }
    forestValue158_25_0 = ((org.luaj.vm2.LuaValue)(p0)).toint();
    }
    life5_29 = forestValue158_25_0;
    return org.luaj.vm2.LuaValue.valueOf(((double)(((com.moon.j1)(((com.moon.jS)(this.a)).c)).get_damage_amount(((int)(life5_29))))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2a79a5f862bb_invokedynamic158_8(java.lang.String a0, java.lang.String a1) throws E;
}
