package com.moon;


class qo extends org.luaj.vm2.lib.OneArgFunction {

com.moon.jW a;

private static long b;

private static java.lang.String c;

qo(com.moon.jW p0) { super(); }


private static void __sourceConstructorBody_d277614e151ebcc6(com.moon.qo receiver, com.moon.jW p0) throws Throwable {

((com.moon.qo)(receiver)).a = ((com.moon.jW)(p0));

    com.moon.qo.__sourceConstructorInit_d277614e151ebcc6_0(((com.moon.qo)(receiver)));

    return;

}



static {
javax.crypto.Cipher forestValue230_31_0;
    int forestValue230_31_1;
    javax.crypto.SecretKeyFactory forestValue230_31_2;
    byte[] forestValue230_31_3;
    javax.crypto.Cipher forestValue230_48_0;
    int forestValue230_48_1;
    javax.crypto.SecretKeyFactory forestValue230_48_2;
    byte[] forestValue230_48_3;
    javax.crypto.Cipher spill230_0;
    int spill230_1;
    javax.crypto.SecretKeyFactory spill230_2;
    byte[] spill230_3;
    byte[] spill230_4;
    int spill230_5;
    java.lang.String spill230_6;
    long life0_11;
    javax.crypto.Cipher life2_15;
    int life3_30;
    byte[] life4_68;
    forest_join_48: {
    b = ((long)(((moom._a)(moom._c.a(((long)(-2754607921793212896L)), ((long)(514727753062505813L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(139867578543299L)))));
    life0_11 = (com.moon.qo.b ^ 83474485334832L);
    spill230_0 = (life2_15 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill230_1 = 2;
    spill230_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp230_8_0 = new byte[8];
    spill230_3 = __stackOp230_8_0;
    (__stackOp230_8_0)[0] = ((byte) ((int) (life0_11 >>> 56)));
    life3_30 = 1;
    forestValue230_31_0 = spill230_0;
    forestValue230_31_1 = spill230_1;
    forestValue230_31_2 = spill230_2;
    forestValue230_31_3 = spill230_3;
    forest_cycle_31: while (true) {
    if (!((life3_30 < 8))) {
        forestValue230_48_0 = forestValue230_31_0;
        forestValue230_48_1 = forestValue230_31_1;
        forestValue230_48_2 = forestValue230_31_2;
        forestValue230_48_3 = forestValue230_31_3;
        break forest_join_48;
    }
    byte[] __stackOp230_9_0 = forestValue230_31_3;
    spill230_4 = __stackOp230_9_0;
    (__stackOp230_9_0)[life3_30] = ((byte) ((int) ((life0_11 << (life3_30 * 8)) >>> 56)));
    life3_30 += 1;
    forestValue230_31_3 = spill230_4;
    continue forest_cycle_31;
    }
    }
    ((javax.crypto.Cipher)(forestValue230_48_0)).init(((int)(forestValue230_48_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue230_48_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue230_48_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String __stackOp230_12_0 = "Nð$uTÓÃiå(oÄþ\025ã\003wp\004dK<ººsKÊï";
    int __stackOp230_12_1 = -1;
    spill230_5 = __stackOp230_12_1;
    byte[] __stackOp230_14_0 = ((java.lang.String)(__stackOp230_12_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp230_14_1 = life2_15;
    life4_68 = ((javax.crypto.Cipher)(__stackOp230_14_1)).doFinal(((byte[])(__stackOp230_14_0)));
    int __stackOp230_18_0 = spill230_5;
    java.lang.String __stackOp230_18_1 = ((java.lang.String)(com.moon.qo.a(((byte[])(life4_68))))).intern();
    spill230_6 = __stackOp230_18_1;
    recovery.source.CarrierOps.discard(__stackOp230_18_0);
    c = ((java.lang.String)(spill230_6));
}

private static native <E extends Throwable> void __sourceConstructorInit_d277614e151ebcc6_0(com.moon.qo a0) throws E;

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
        byte[] spill1332_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1332_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1332_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1332_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1332_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1332_2)[life4_9];
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
int forestValue188_20_0;
    boolean spill188_0;
    long life2_3;
    int life4_5;
    int life5_21;
    forest_join_20: {
    forest_join_18: {
    life2_3 = (com.moon.qo.b ^ 65594591076163L);
    life4_5 = com.moon.jN.c();
    spill188_0 = ((org.luaj.vm2.LuaValue)(p0)).isnumber();
    if (!((life4_5 == 0))) {
        forestValue188_20_0 = ((spill188_0) ? 1 : 0);
        break forest_join_20;
    }
    if (!((!spill188_0))) {
        break forest_join_18;
    }
    java.lang.String __stackOp188_6_0 = ((org.luaj.vm2.LuaValue)(p0)).typename();
    java.lang.String __stackOp188_6_1 = com.moon.qo.c;
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_2a79a5f862bb_invokedynamic188_7(__stackOp188_6_1, __stackOp188_6_0))));
    }
    forestValue188_20_0 = ((org.luaj.vm2.LuaValue)(p0)).toint();
    }
    life5_21 = forestValue188_20_0;
    return org.luaj.vm2.LuaValue.valueOf(((boolean)(((com.moon.j5)(((com.moon.jW)(this.a)).c)).is_target(((int)(life5_21))))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2a79a5f862bb_invokedynamic188_7(java.lang.String a0, java.lang.String a1) throws E;
}
