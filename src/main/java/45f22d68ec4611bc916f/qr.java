package com.moon;


class qr extends org.luaj.vm2.lib.OneArgFunction {

com.moon.jW a;

private static long b;

private static java.lang.String c;

qr(com.moon.jW p0) { super(); }


private static void __sourceConstructorBody_6e221145fbaef004(com.moon.qr receiver, com.moon.jW p0) throws Throwable {

((com.moon.qr)(receiver)).a = ((com.moon.jW)(p0));

    com.moon.qr.__sourceConstructorInit_6e221145fbaef004_0(((com.moon.qr)(receiver)));

    return;

}



static {
javax.crypto.Cipher forestValue236_31_0;
    int forestValue236_31_1;
    javax.crypto.SecretKeyFactory forestValue236_31_2;
    byte[] forestValue236_31_3;
    javax.crypto.Cipher forestValue236_48_0;
    int forestValue236_48_1;
    javax.crypto.SecretKeyFactory forestValue236_48_2;
    byte[] forestValue236_48_3;
    javax.crypto.Cipher spill236_0;
    int spill236_1;
    javax.crypto.SecretKeyFactory spill236_2;
    byte[] spill236_3;
    byte[] spill236_4;
    int spill236_5;
    java.lang.String spill236_6;
    long life0_11;
    javax.crypto.Cipher life2_15;
    int life3_30;
    byte[] life4_68;
    forest_join_48: {
    b = ((long)(((moom._a)(moom._c.a(((long)(5881835350130636312L)), ((long)(5752831398554492025L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(99295206966048L)))));
    life0_11 = (com.moon.qr.b ^ 27641527218204L);
    spill236_0 = (life2_15 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill236_1 = 2;
    spill236_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp236_8_0 = new byte[8];
    spill236_3 = __stackOp236_8_0;
    (__stackOp236_8_0)[0] = ((byte) ((int) (life0_11 >>> 56)));
    life3_30 = 1;
    forestValue236_31_0 = spill236_0;
    forestValue236_31_1 = spill236_1;
    forestValue236_31_2 = spill236_2;
    forestValue236_31_3 = spill236_3;
    forest_cycle_31: while (true) {
    if (!((life3_30 < 8))) {
        forestValue236_48_0 = forestValue236_31_0;
        forestValue236_48_1 = forestValue236_31_1;
        forestValue236_48_2 = forestValue236_31_2;
        forestValue236_48_3 = forestValue236_31_3;
        break forest_join_48;
    }
    byte[] __stackOp236_9_0 = forestValue236_31_3;
    spill236_4 = __stackOp236_9_0;
    (__stackOp236_9_0)[life3_30] = ((byte) ((int) ((life0_11 << (life3_30 * 8)) >>> 56)));
    life3_30 += 1;
    forestValue236_31_3 = spill236_4;
    continue forest_cycle_31;
    }
    }
    ((javax.crypto.Cipher)(forestValue236_48_0)).init(((int)(forestValue236_48_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue236_48_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue236_48_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String __stackOp236_12_0 = "\023HËk,9R,Ë3ÓíÒ\fUTõ;?r¡ÇÃ,¥ý¡zFI";
    int __stackOp236_12_1 = -1;
    spill236_5 = __stackOp236_12_1;
    byte[] __stackOp236_14_0 = ((java.lang.String)(__stackOp236_12_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp236_14_1 = life2_15;
    life4_68 = ((javax.crypto.Cipher)(__stackOp236_14_1)).doFinal(((byte[])(__stackOp236_14_0)));
    int __stackOp236_18_0 = spill236_5;
    java.lang.String __stackOp236_18_1 = ((java.lang.String)(com.moon.qr.a(((byte[])(life4_68))))).intern();
    spill236_6 = __stackOp236_18_1;
    recovery.source.CarrierOps.discard(__stackOp236_18_0);
    c = ((java.lang.String)(spill236_6));
}

private static native <E extends Throwable> void __sourceConstructorInit_6e221145fbaef004_0(com.moon.qr a0) throws E;

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
        byte[] spill1338_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1338_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1338_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1338_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1338_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1338_2)[life4_9];
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
int forestValue100057_20_0;
    boolean spill100057_0;
    long life2_3;
    int life4_5;
    int life5_21;
    forest_join_20: {
    forest_join_18: {
    life2_3 = (com.moon.qr.b ^ 115896568833569L);
    life4_5 = com.moon.jN.b();
    spill100057_0 = ((org.luaj.vm2.LuaValue)(p0)).isnumber();
    if (!((life4_5 != 0))) {
        forestValue100057_20_0 = ((spill100057_0) ? 1 : 0);
        break forest_join_20;
    }
    if (!((!spill100057_0))) {
        break forest_join_18;
    }
    java.lang.String __stackOp100057_6_0 = ((org.luaj.vm2.LuaValue)(p0)).typename();
    java.lang.String __stackOp100057_6_1 = com.moon.qr.c;
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_2a79a5f862bb_invokedynamic100057_7(__stackOp100057_6_1, __stackOp100057_6_0))));
    }
    forestValue100057_20_0 = ((org.luaj.vm2.LuaValue)(p0)).toint();
    }
    life5_21 = forestValue100057_20_0;
    return org.luaj.vm2.LuaValue.valueOf(((double)(((double) ((com.moon.j5)(((com.moon.jW)(this.a)).c)).get_width(((int)(life5_21)))))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2a79a5f862bb_invokedynamic100057_7(java.lang.String a0, java.lang.String a1) throws E;
}
