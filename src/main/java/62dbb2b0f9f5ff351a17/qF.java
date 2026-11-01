package com.moon;


class qF extends org.luaj.vm2.lib.OneArgFunction {

com.moon.jW a;

private static long b;

private static java.lang.String c;

qF(com.moon.jW p0) { super(); }


private static void __sourceConstructorBody_1c34c0ab0d018c68(com.moon.qF receiver, com.moon.jW p0) throws Throwable {

((com.moon.qF)(receiver)).a = ((com.moon.jW)(p0));

    com.moon.qF.__sourceConstructorInit_1c34c0ab0d018c68_0(((com.moon.qF)(receiver)));

    return;

}



static {
javax.crypto.Cipher forestValue161_31_0;
    int forestValue161_31_1;
    javax.crypto.SecretKeyFactory forestValue161_31_2;
    byte[] forestValue161_31_3;
    javax.crypto.Cipher forestValue161_48_0;
    int forestValue161_48_1;
    javax.crypto.SecretKeyFactory forestValue161_48_2;
    byte[] forestValue161_48_3;
    javax.crypto.Cipher spill161_0;
    int spill161_1;
    javax.crypto.SecretKeyFactory spill161_2;
    byte[] spill161_3;
    byte[] spill161_4;
    int spill161_5;
    java.lang.String spill161_6;
    long life0_11;
    javax.crypto.Cipher life2_15;
    int life3_30;
    byte[] life4_68;
    forest_join_48: {
    b = ((long)(((moom._a)(moom._c.a(((long)(2738123974037608511L)), ((long)(5726191341980737024L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(10968912073642L)))));
    life0_11 = (com.moon.qF.b ^ 87493780888939L);
    spill161_0 = (life2_15 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill161_1 = 2;
    spill161_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp161_8_0 = new byte[8];
    spill161_3 = __stackOp161_8_0;
    (__stackOp161_8_0)[0] = ((byte) ((int) (life0_11 >>> 56)));
    life3_30 = 1;
    forestValue161_31_0 = spill161_0;
    forestValue161_31_1 = spill161_1;
    forestValue161_31_2 = spill161_2;
    forestValue161_31_3 = spill161_3;
    forest_cycle_31: while (true) {
    if (!((life3_30 < 8))) {
        forestValue161_48_0 = forestValue161_31_0;
        forestValue161_48_1 = forestValue161_31_1;
        forestValue161_48_2 = forestValue161_31_2;
        forestValue161_48_3 = forestValue161_31_3;
        break forest_join_48;
    }
    byte[] __stackOp161_9_0 = forestValue161_31_3;
    spill161_4 = __stackOp161_9_0;
    (__stackOp161_9_0)[life3_30] = ((byte) ((int) ((life0_11 << (life3_30 * 8)) >>> 56)));
    life3_30 += 1;
    forestValue161_31_3 = spill161_4;
    continue forest_cycle_31;
    }
    }
    ((javax.crypto.Cipher)(forestValue161_48_0)).init(((int)(forestValue161_48_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue161_48_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue161_48_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String __stackOp161_12_0 = "\"£=à¶·z~;Ê*cQ5c÷$u)M¤/<lu?\020ç";
    int __stackOp161_12_1 = -1;
    spill161_5 = __stackOp161_12_1;
    byte[] __stackOp161_14_0 = ((java.lang.String)(__stackOp161_12_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp161_14_1 = life2_15;
    life4_68 = ((javax.crypto.Cipher)(__stackOp161_14_1)).doFinal(((byte[])(__stackOp161_14_0)));
    int __stackOp161_18_0 = spill161_5;
    java.lang.String __stackOp161_18_1 = ((java.lang.String)(com.moon.qF.a(((byte[])(life4_68))))).intern();
    spill161_6 = __stackOp161_18_1;
    recovery.source.CarrierOps.discard(__stackOp161_18_0);
    c = ((java.lang.String)(spill161_6));
}

private static native <E extends Throwable> void __sourceConstructorInit_1c34c0ab0d018c68_0(com.moon.qF a0) throws E;

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
        byte[] spill1266_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1266_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1266_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1266_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1266_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1266_2)[life4_9];
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
int forestValue172_20_0;
    boolean spill172_0;
    long life2_3;
    int life4_5;
    int life5_21;
    forest_join_20: {
    forest_join_18: {
    life2_3 = (com.moon.qF.b ^ 76186773205623L);
    life4_5 = com.moon.jN.c();
    spill172_0 = ((org.luaj.vm2.LuaValue)(p0)).isnumber();
    if (!((life4_5 == 0))) {
        forestValue172_20_0 = ((spill172_0) ? 1 : 0);
        break forest_join_20;
    }
    if (!((!spill172_0))) {
        break forest_join_18;
    }
    java.lang.String __stackOp172_6_0 = ((org.luaj.vm2.LuaValue)(p0)).typename();
    java.lang.String __stackOp172_6_1 = com.moon.qF.c;
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_2a79a5f862bb_invokedynamic172_7(__stackOp172_6_1, __stackOp172_6_0))));
    }
    forestValue172_20_0 = ((org.luaj.vm2.LuaValue)(p0)).toint();
    }
    life5_21 = forestValue172_20_0;
    return org.luaj.vm2.LuaValue.valueOf(((int)(((com.moon.j5)(((com.moon.jW)(this.a)).c)).get_hurt_time(((int)(life5_21))))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2a79a5f862bb_invokedynamic172_7(java.lang.String a0, java.lang.String a1) throws E;
}
