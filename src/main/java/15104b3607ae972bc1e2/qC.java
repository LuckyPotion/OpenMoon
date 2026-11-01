package com.moon;


class qC extends org.luaj.vm2.lib.OneArgFunction {

com.moon.jW a;

private static long b;

private static java.lang.String c;

qC(com.moon.jW p0) { super(); }


private static void __sourceConstructorBody_8ee64b5127b41b10(com.moon.qC receiver, com.moon.jW p0) throws Throwable {

((com.moon.qC)(receiver)).a = ((com.moon.jW)(p0));

    com.moon.qC.__sourceConstructorInit_8ee64b5127b41b10_0(((com.moon.qC)(receiver)));

    return;

}



static {
javax.crypto.Cipher forestValue155_31_0;
    int forestValue155_31_1;
    javax.crypto.SecretKeyFactory forestValue155_31_2;
    byte[] forestValue155_31_3;
    javax.crypto.Cipher forestValue155_48_0;
    int forestValue155_48_1;
    javax.crypto.SecretKeyFactory forestValue155_48_2;
    byte[] forestValue155_48_3;
    javax.crypto.Cipher spill155_0;
    int spill155_1;
    javax.crypto.SecretKeyFactory spill155_2;
    byte[] spill155_3;
    byte[] spill155_4;
    int spill155_5;
    java.lang.String spill155_6;
    long life0_11;
    javax.crypto.Cipher life2_15;
    int life3_30;
    byte[] life4_68;
    forest_join_48: {
    b = ((long)(((moom._a)(moom._c.a(((long)(-7675477388179919223L)), ((long)(2419568853312028113L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(54681825377764L)))));
    life0_11 = (com.moon.qC.b ^ 75306763605896L);
    spill155_0 = (life2_15 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill155_1 = 2;
    spill155_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp155_8_0 = new byte[8];
    spill155_3 = __stackOp155_8_0;
    (__stackOp155_8_0)[0] = ((byte) ((int) (life0_11 >>> 56)));
    life3_30 = 1;
    forestValue155_31_0 = spill155_0;
    forestValue155_31_1 = spill155_1;
    forestValue155_31_2 = spill155_2;
    forestValue155_31_3 = spill155_3;
    forest_cycle_31: while (true) {
    if (!((life3_30 < 8))) {
        forestValue155_48_0 = forestValue155_31_0;
        forestValue155_48_1 = forestValue155_31_1;
        forestValue155_48_2 = forestValue155_31_2;
        forestValue155_48_3 = forestValue155_31_3;
        break forest_join_48;
    }
    byte[] __stackOp155_9_0 = forestValue155_31_3;
    spill155_4 = __stackOp155_9_0;
    (__stackOp155_9_0)[life3_30] = ((byte) ((int) ((life0_11 << (life3_30 * 8)) >>> 56)));
    life3_30 += 1;
    forestValue155_31_3 = spill155_4;
    continue forest_cycle_31;
    }
    }
    ((javax.crypto.Cipher)(forestValue155_48_0)).init(((int)(forestValue155_48_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue155_48_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue155_48_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String __stackOp155_12_0 = "[¤ùÔÖÝ\035@\020mÏ¦3M\036¦ó-bçhíí`Ý";
    int __stackOp155_12_1 = -1;
    spill155_5 = __stackOp155_12_1;
    byte[] __stackOp155_14_0 = ((java.lang.String)(__stackOp155_12_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp155_14_1 = life2_15;
    life4_68 = ((javax.crypto.Cipher)(__stackOp155_14_1)).doFinal(((byte[])(__stackOp155_14_0)));
    int __stackOp155_18_0 = spill155_5;
    java.lang.String __stackOp155_18_1 = ((java.lang.String)(com.moon.qC.a(((byte[])(life4_68))))).intern();
    spill155_6 = __stackOp155_18_1;
    recovery.source.CarrierOps.discard(__stackOp155_18_0);
    c = ((java.lang.String)(spill155_6));
}

private static native <E extends Throwable> void __sourceConstructorInit_8ee64b5127b41b10_0(com.moon.qC a0) throws E;

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
        byte[] spill1260_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1260_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1260_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1260_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1260_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1260_2)[life4_9];
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
int forestValue171_20_0;
    org.luaj.vm2.LuaValue[] forestValue171_50_0;
    boolean spill171_0;
    org.luaj.vm2.LuaValue[] spill171_1;
    long life2_3;
    int life4_5;
    int life5_21;
    com.moon.scripting.api.types.Potion[] life6_27;
    org.luaj.vm2.LuaValue[] life7_31;
    int life8_33;
    forest_join_50: {
    forest_join_49: {
    forest_join_20: {
    forest_join_18: {
    life2_3 = (com.moon.qC.b ^ 25498772498511L);
    life4_5 = com.moon.jN.b();
    spill171_0 = ((org.luaj.vm2.LuaValue)(p0)).istable();
    if (!((life4_5 != 0))) {
        forestValue171_20_0 = ((spill171_0) ? 1 : 0);
        break forest_join_20;
    }
    if (!((!spill171_0))) {
        break forest_join_18;
    }
    java.lang.String __stackOp171_6_0 = ((org.luaj.vm2.LuaValue)(p0)).typename();
    java.lang.String __stackOp171_6_1 = com.moon.qC.c;
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_2a79a5f862bb_invokedynamic171_7(__stackOp171_6_1, __stackOp171_6_0))));
    }
    forestValue171_20_0 = ((org.luaj.vm2.LuaValue)(p0)).toint();
    }
    life5_21 = forestValue171_20_0;
    life6_27 = ((com.moon.j5)(((com.moon.jW)(this.a)).c)).get_active_effects(((int)(life5_21)));
    life7_31 = new org.luaj.vm2.LuaValue[(life6_27).length];
    life8_33 = 0;
    forest_cycle_33: while (true) {
    if (!((life8_33 < (life6_27).length))) {
        break forest_join_49;
    }
    spill171_1 = life7_31;
    if (!((life4_5 != 0))) {
        forestValue171_50_0 = spill171_1;
        break forest_join_50;
    }
    (spill171_1)[life8_33] = com.moon.j6.a__LuaValue(((java.lang.Object)((life6_27)[life8_33])));
    life8_33 += 1;
    if (!((life4_5 == 0))) {
        continue forest_cycle_33;
    }
    break forest_cycle_33;
    }
    }
    forestValue171_50_0 = life7_31;
    }
    return org.luaj.vm2.LuaTable.listOf(((org.luaj.vm2.LuaValue[])(forestValue171_50_0)));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2a79a5f862bb_invokedynamic171_7(java.lang.String a0, java.lang.String a1) throws E;
}
