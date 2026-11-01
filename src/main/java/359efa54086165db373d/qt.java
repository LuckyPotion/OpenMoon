package com.moon;


class qt extends org.luaj.vm2.lib.OneArgFunction {

com.moon.jW a;

private static long b;

private static java.lang.String c;

qt(com.moon.jW p0) { super(); }


private static void __sourceConstructorBody_98c1a01a7c22dc81(com.moon.qt receiver, com.moon.jW p0) throws Throwable {

((com.moon.qt)(receiver)).a = ((com.moon.jW)(p0));

    com.moon.qt.__sourceConstructorInit_98c1a01a7c22dc81_0(((com.moon.qt)(receiver)));

    return;

}



static {
javax.crypto.Cipher forestValue240_31_0;
    int forestValue240_31_1;
    javax.crypto.SecretKeyFactory forestValue240_31_2;
    byte[] forestValue240_31_3;
    javax.crypto.Cipher forestValue240_48_0;
    int forestValue240_48_1;
    javax.crypto.SecretKeyFactory forestValue240_48_2;
    byte[] forestValue240_48_3;
    javax.crypto.Cipher spill240_0;
    int spill240_1;
    javax.crypto.SecretKeyFactory spill240_2;
    byte[] spill240_3;
    byte[] spill240_4;
    int spill240_5;
    java.lang.String spill240_6;
    long life0_11;
    javax.crypto.Cipher life2_15;
    int life3_30;
    byte[] life4_68;
    forest_join_48: {
    b = ((long)(((moom._a)(moom._c.a(((long)(3492235058837353685L)), ((long)(1264081804449829496L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(29298361828284L)))));
    life0_11 = (com.moon.qt.b ^ 88499377931608L);
    spill240_0 = (life2_15 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill240_1 = 2;
    spill240_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp240_8_0 = new byte[8];
    spill240_3 = __stackOp240_8_0;
    (__stackOp240_8_0)[0] = ((byte) ((int) (life0_11 >>> 56)));
    life3_30 = 1;
    forestValue240_31_0 = spill240_0;
    forestValue240_31_1 = spill240_1;
    forestValue240_31_2 = spill240_2;
    forestValue240_31_3 = spill240_3;
    forest_cycle_31: while (true) {
    if (!((life3_30 < 8))) {
        forestValue240_48_0 = forestValue240_31_0;
        forestValue240_48_1 = forestValue240_31_1;
        forestValue240_48_2 = forestValue240_31_2;
        forestValue240_48_3 = forestValue240_31_3;
        break forest_join_48;
    }
    byte[] __stackOp240_9_0 = forestValue240_31_3;
    spill240_4 = __stackOp240_9_0;
    (__stackOp240_9_0)[life3_30] = ((byte) ((int) ((life0_11 << (life3_30 * 8)) >>> 56)));
    life3_30 += 1;
    forestValue240_31_3 = spill240_4;
    continue forest_cycle_31;
    }
    }
    ((javax.crypto.Cipher)(forestValue240_48_0)).init(((int)(forestValue240_48_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue240_48_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue240_48_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String __stackOp240_12_0 = "\037Õ\f¨\021k\b(8í¼/H²?æ°\005`ÃðX\t\005_±";
    int __stackOp240_12_1 = -1;
    spill240_5 = __stackOp240_12_1;
    byte[] __stackOp240_14_0 = ((java.lang.String)(__stackOp240_12_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp240_14_1 = life2_15;
    life4_68 = ((javax.crypto.Cipher)(__stackOp240_14_1)).doFinal(((byte[])(__stackOp240_14_0)));
    int __stackOp240_18_0 = spill240_5;
    java.lang.String __stackOp240_18_1 = ((java.lang.String)(com.moon.qt.a(((byte[])(life4_68))))).intern();
    spill240_6 = __stackOp240_18_1;
    recovery.source.CarrierOps.discard(__stackOp240_18_0);
    c = ((java.lang.String)(spill240_6));
}

private static native <E extends Throwable> void __sourceConstructorInit_98c1a01a7c22dc81_0(com.moon.qt a0) throws E;

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
        byte[] spill1342_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1342_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1342_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1342_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1342_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1342_2)[life4_9];
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
int forestValue190_20_0;
    boolean spill190_0;
    long life2_3;
    int life4_5;
    int life5_21;
    forest_join_20: {
    forest_join_18: {
    life2_3 = (com.moon.qt.b ^ 57090919173176L);
    life4_5 = com.moon.jN.c();
    spill190_0 = ((org.luaj.vm2.LuaValue)(p0)).isnumber();
    if (!((life4_5 == 0))) {
        forestValue190_20_0 = ((spill190_0) ? 1 : 0);
        break forest_join_20;
    }
    if (!((!spill190_0))) {
        break forest_join_18;
    }
    java.lang.String __stackOp190_6_0 = ((org.luaj.vm2.LuaValue)(p0)).typename();
    java.lang.String __stackOp190_6_1 = com.moon.qt.c;
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_2a79a5f862bb_invokedynamic190_7(__stackOp190_6_1, __stackOp190_6_0))));
    }
    forestValue190_20_0 = ((org.luaj.vm2.LuaValue)(p0)).toint();
    }
    life5_21 = forestValue190_20_0;
    return org.luaj.vm2.LuaValue.valueOf(((double)(((com.moon.j5)(((com.moon.jW)(this.a)).c)).get_position_x(((int)(life5_21))))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2a79a5f862bb_invokedynamic190_7(java.lang.String a0, java.lang.String a1) throws E;
}
