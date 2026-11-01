package com.moon;


class qb extends org.luaj.vm2.lib.OneArgFunction {

com.moon.jW a;

private static long b;

private static java.lang.String c;

qb(com.moon.jW p0) { super(); }


private static void __sourceConstructorBody_48bdf9ef5afcb87a(com.moon.qb receiver, com.moon.jW p0) throws Throwable {

((com.moon.qb)(receiver)).a = ((com.moon.jW)(p0));

    com.moon.qb.__sourceConstructorInit_48bdf9ef5afcb87a_0(((com.moon.qb)(receiver)));

    return;

}



static {
javax.crypto.Cipher forestValue204_31_0;
    int forestValue204_31_1;
    javax.crypto.SecretKeyFactory forestValue204_31_2;
    byte[] forestValue204_31_3;
    javax.crypto.Cipher forestValue204_48_0;
    int forestValue204_48_1;
    javax.crypto.SecretKeyFactory forestValue204_48_2;
    byte[] forestValue204_48_3;
    javax.crypto.Cipher spill204_0;
    int spill204_1;
    javax.crypto.SecretKeyFactory spill204_2;
    byte[] spill204_3;
    byte[] spill204_4;
    int spill204_5;
    java.lang.String spill204_6;
    long life0_11;
    javax.crypto.Cipher life2_15;
    int life3_30;
    byte[] life4_68;
    forest_join_48: {
    b = ((long)(((moom._a)(moom._c.a(((long)(-1201228608224483151L)), ((long)(-9093008220804390916L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(220850542148582L)))));
    life0_11 = (com.moon.qb.b ^ 104926159286046L);
    spill204_0 = (life2_15 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill204_1 = 2;
    spill204_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp204_8_0 = new byte[8];
    spill204_3 = __stackOp204_8_0;
    (__stackOp204_8_0)[0] = ((byte) ((int) (life0_11 >>> 56)));
    life3_30 = 1;
    forestValue204_31_0 = spill204_0;
    forestValue204_31_1 = spill204_1;
    forestValue204_31_2 = spill204_2;
    forestValue204_31_3 = spill204_3;
    forest_cycle_31: while (true) {
    if (!((life3_30 < 8))) {
        forestValue204_48_0 = forestValue204_31_0;
        forestValue204_48_1 = forestValue204_31_1;
        forestValue204_48_2 = forestValue204_31_2;
        forestValue204_48_3 = forestValue204_31_3;
        break forest_join_48;
    }
    byte[] __stackOp204_9_0 = forestValue204_31_3;
    spill204_4 = __stackOp204_9_0;
    (__stackOp204_9_0)[life3_30] = ((byte) ((int) ((life0_11 << (life3_30 * 8)) >>> 56)));
    life3_30 += 1;
    forestValue204_31_3 = spill204_4;
    continue forest_cycle_31;
    }
    }
    ((javax.crypto.Cipher)(forestValue204_48_0)).init(((int)(forestValue204_48_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue204_48_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue204_48_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String __stackOp204_12_0 = "w\033§\020³~Ø¿?×-éäe5ÑÉz$âêmÌÇ-«pÊ°";
    int __stackOp204_12_1 = -1;
    spill204_5 = __stackOp204_12_1;
    byte[] __stackOp204_14_0 = ((java.lang.String)(__stackOp204_12_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp204_14_1 = life2_15;
    life4_68 = ((javax.crypto.Cipher)(__stackOp204_14_1)).doFinal(((byte[])(__stackOp204_14_0)));
    int __stackOp204_18_0 = spill204_5;
    java.lang.String __stackOp204_18_1 = ((java.lang.String)(com.moon.qb.a(((byte[])(life4_68))))).intern();
    spill204_6 = __stackOp204_18_1;
    recovery.source.CarrierOps.discard(__stackOp204_18_0);
    c = ((java.lang.String)(spill204_6));
}

private static native <E extends Throwable> void __sourceConstructorInit_48bdf9ef5afcb87a_0(com.moon.qb a0) throws E;

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
        byte[] spill1306_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1306_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1306_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1306_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1306_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1306_2)[life4_9];
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
int forestValue178_20_0;
    boolean spill178_0;
    long life2_3;
    int life4_5;
    int life5_21;
    forest_join_20: {
    forest_join_18: {
    life2_3 = (com.moon.qb.b ^ 33844235808247L);
    life4_5 = com.moon.jN.c();
    spill178_0 = ((org.luaj.vm2.LuaValue)(p0)).isnumber();
    if (!((life4_5 == 0))) {
        forestValue178_20_0 = ((spill178_0) ? 1 : 0);
        break forest_join_20;
    }
    if (!((!spill178_0))) {
        break forest_join_18;
    }
    java.lang.String __stackOp178_6_0 = ((org.luaj.vm2.LuaValue)(p0)).typename();
    java.lang.String __stackOp178_6_1 = com.moon.qb.c;
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_2a79a5f862bb_invokedynamic178_7(__stackOp178_6_1, __stackOp178_6_0))));
    }
    forestValue178_20_0 = ((org.luaj.vm2.LuaValue)(p0)).toint();
    }
    life5_21 = forestValue178_20_0;
    return org.luaj.vm2.LuaValue.valueOf(((double)(((com.moon.j5)(((com.moon.jW)(this.a)).c)).get_health(((int)(life5_21))))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2a79a5f862bb_invokedynamic178_7(java.lang.String a0, java.lang.String a1) throws E;
}
