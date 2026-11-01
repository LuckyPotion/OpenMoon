package com.moon;


class qz extends org.luaj.vm2.lib.OneArgFunction {

com.moon.jW a;

private static long b;

private static java.lang.String c;

qz(com.moon.jW p0) { super(); }


private static void __sourceConstructorBody_26458b1f83448253(com.moon.qz receiver, com.moon.jW p0) throws Throwable {

((com.moon.qz)(receiver)).a = ((com.moon.jW)(p0));

    com.moon.qz.__sourceConstructorInit_26458b1f83448253_0(((com.moon.qz)(receiver)));

    return;

}



static {
javax.crypto.Cipher forestValue252_31_0;
    int forestValue252_31_1;
    javax.crypto.SecretKeyFactory forestValue252_31_2;
    byte[] forestValue252_31_3;
    javax.crypto.Cipher forestValue252_48_0;
    int forestValue252_48_1;
    javax.crypto.SecretKeyFactory forestValue252_48_2;
    byte[] forestValue252_48_3;
    javax.crypto.Cipher spill252_0;
    int spill252_1;
    javax.crypto.SecretKeyFactory spill252_2;
    byte[] spill252_3;
    byte[] spill252_4;
    int spill252_5;
    java.lang.String spill252_6;
    long life0_11;
    javax.crypto.Cipher life2_15;
    int life3_30;
    byte[] life4_68;
    forest_join_48: {
    b = ((long)(((moom._a)(moom._c.a(((long)(8350878929422009729L)), ((long)(-4957943014138242267L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(29656999237724L)))));
    life0_11 = (com.moon.qz.b ^ 37408386255923L);
    spill252_0 = (life2_15 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill252_1 = 2;
    spill252_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp252_8_0 = new byte[8];
    spill252_3 = __stackOp252_8_0;
    (__stackOp252_8_0)[0] = ((byte) ((int) (life0_11 >>> 56)));
    life3_30 = 1;
    forestValue252_31_0 = spill252_0;
    forestValue252_31_1 = spill252_1;
    forestValue252_31_2 = spill252_2;
    forestValue252_31_3 = spill252_3;
    forest_cycle_31: while (true) {
    if (!((life3_30 < 8))) {
        forestValue252_48_0 = forestValue252_31_0;
        forestValue252_48_1 = forestValue252_31_1;
        forestValue252_48_2 = forestValue252_31_2;
        forestValue252_48_3 = forestValue252_31_3;
        break forest_join_48;
    }
    byte[] __stackOp252_9_0 = forestValue252_31_3;
    spill252_4 = __stackOp252_9_0;
    (__stackOp252_9_0)[life3_30] = ((byte) ((int) ((life0_11 << (life3_30 * 8)) >>> 56)));
    life3_30 += 1;
    forestValue252_31_3 = spill252_4;
    continue forest_cycle_31;
    }
    }
    ((javax.crypto.Cipher)(forestValue252_48_0)).init(((int)(forestValue252_48_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue252_48_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue252_48_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String __stackOp252_12_0 = "Í\033½äÇ\032_\006ã©{¬JÛÙ\025\177ÀAT\\Ô\026ÝD0";
    int __stackOp252_12_1 = -1;
    spill252_5 = __stackOp252_12_1;
    byte[] __stackOp252_14_0 = ((java.lang.String)(__stackOp252_12_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp252_14_1 = life2_15;
    life4_68 = ((javax.crypto.Cipher)(__stackOp252_14_1)).doFinal(((byte[])(__stackOp252_14_0)));
    int __stackOp252_18_0 = spill252_5;
    java.lang.String __stackOp252_18_1 = ((java.lang.String)(com.moon.qz.a(((byte[])(life4_68))))).intern();
    spill252_6 = __stackOp252_18_1;
    recovery.source.CarrierOps.discard(__stackOp252_18_0);
    c = ((java.lang.String)(spill252_6));
}

private static native <E extends Throwable> void __sourceConstructorInit_26458b1f83448253_0(com.moon.qz a0) throws E;

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
        byte[] spill1354_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1354_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1354_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1354_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1354_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1354_2)[life4_9];
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
int forestValue194_20_0;
    boolean spill194_0;
    long life2_3;
    int life4_5;
    int life5_21;
    forest_join_20: {
    forest_join_18: {
    life2_3 = (com.moon.qz.b ^ 76000484285597L);
    life4_5 = com.moon.jN.c();
    spill194_0 = ((org.luaj.vm2.LuaValue)(p0)).isnumber();
    if (!((life4_5 == 0))) {
        forestValue194_20_0 = ((spill194_0) ? 1 : 0);
        break forest_join_20;
    }
    if (!((!spill194_0))) {
        break forest_join_18;
    }
    java.lang.String __stackOp194_6_0 = ((org.luaj.vm2.LuaValue)(p0)).typename();
    java.lang.String __stackOp194_6_1 = com.moon.qz.c;
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_2a79a5f862bb_invokedynamic194_7(__stackOp194_6_1, __stackOp194_6_0))));
    }
    forestValue194_20_0 = ((org.luaj.vm2.LuaValue)(p0)).toint();
    }
    life5_21 = forestValue194_20_0;
    return org.luaj.vm2.LuaValue.valueOf(((double)(((com.moon.j5)(((com.moon.jW)(this.a)).c)).get_prev_position_y(((int)(life5_21))))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2a79a5f862bb_invokedynamic194_7(java.lang.String a0, java.lang.String a1) throws E;
}
