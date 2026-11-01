package com.moon;


class qd extends org.luaj.vm2.lib.OneArgFunction {

com.moon.jW a;

private static long b;

private static java.lang.String c;

qd(com.moon.jW p0) { super(); }


private static void __sourceConstructorBody_e8ef5b578532934b(com.moon.qd receiver, com.moon.jW p0) throws Throwable {

((com.moon.qd)(receiver)).a = ((com.moon.jW)(p0));

    com.moon.qd.__sourceConstructorInit_e8ef5b578532934b_0(((com.moon.qd)(receiver)));

    return;

}



static {
javax.crypto.Cipher forestValue208_31_0;
    int forestValue208_31_1;
    javax.crypto.SecretKeyFactory forestValue208_31_2;
    byte[] forestValue208_31_3;
    javax.crypto.Cipher forestValue208_48_0;
    int forestValue208_48_1;
    javax.crypto.SecretKeyFactory forestValue208_48_2;
    byte[] forestValue208_48_3;
    javax.crypto.Cipher spill208_0;
    int spill208_1;
    javax.crypto.SecretKeyFactory spill208_2;
    byte[] spill208_3;
    byte[] spill208_4;
    int spill208_5;
    java.lang.String spill208_6;
    long life0_11;
    javax.crypto.Cipher life2_15;
    int life3_30;
    byte[] life4_68;
    forest_join_48: {
    b = ((long)(((moom._a)(moom._c.a(((long)(6820321852084106922L)), ((long)(-2984349018544467831L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(159266513913445L)))));
    life0_11 = (com.moon.qd.b ^ 70399381344999L);
    spill208_0 = (life2_15 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill208_1 = 2;
    spill208_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp208_8_0 = new byte[8];
    spill208_3 = __stackOp208_8_0;
    (__stackOp208_8_0)[0] = ((byte) ((int) (life0_11 >>> 56)));
    life3_30 = 1;
    forestValue208_31_0 = spill208_0;
    forestValue208_31_1 = spill208_1;
    forestValue208_31_2 = spill208_2;
    forestValue208_31_3 = spill208_3;
    forest_cycle_31: while (true) {
    if (!((life3_30 < 8))) {
        forestValue208_48_0 = forestValue208_31_0;
        forestValue208_48_1 = forestValue208_31_1;
        forestValue208_48_2 = forestValue208_31_2;
        forestValue208_48_3 = forestValue208_31_3;
        break forest_join_48;
    }
    byte[] __stackOp208_9_0 = forestValue208_31_3;
    spill208_4 = __stackOp208_9_0;
    (__stackOp208_9_0)[life3_30] = ((byte) ((int) ((life0_11 << (life3_30 * 8)) >>> 56)));
    life3_30 += 1;
    forestValue208_31_3 = spill208_4;
    continue forest_cycle_31;
    }
    }
    ((javax.crypto.Cipher)(forestValue208_48_0)).init(((int)(forestValue208_48_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue208_48_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue208_48_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String __stackOp208_12_0 = "s\n\001~\fZîáµ\004 ÔKª\002ï{M¬£ùJ6íN)=W÷";
    int __stackOp208_12_1 = -1;
    spill208_5 = __stackOp208_12_1;
    byte[] __stackOp208_14_0 = ((java.lang.String)(__stackOp208_12_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp208_14_1 = life2_15;
    life4_68 = ((javax.crypto.Cipher)(__stackOp208_14_1)).doFinal(((byte[])(__stackOp208_14_0)));
    int __stackOp208_18_0 = spill208_5;
    java.lang.String __stackOp208_18_1 = ((java.lang.String)(com.moon.qd.a(((byte[])(life4_68))))).intern();
    spill208_6 = __stackOp208_18_1;
    recovery.source.CarrierOps.discard(__stackOp208_18_0);
    c = ((java.lang.String)(spill208_6));
}

private static native <E extends Throwable> void __sourceConstructorInit_e8ef5b578532934b_0(com.moon.qd a0) throws E;

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
        byte[] spill1310_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1310_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1310_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1310_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1310_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1310_2)[life4_9];
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
int forestValue180_20_0;
    boolean spill180_0;
    long life2_3;
    int life4_5;
    int life5_21;
    forest_join_20: {
    forest_join_18: {
    life2_3 = (com.moon.qd.b ^ 66360697312485L);
    life4_5 = com.moon.jN.c();
    spill180_0 = ((org.luaj.vm2.LuaValue)(p0)).isnumber();
    if (!((life4_5 == 0))) {
        forestValue180_20_0 = ((spill180_0) ? 1 : 0);
        break forest_join_20;
    }
    if (!((!spill180_0))) {
        break forest_join_18;
    }
    java.lang.String __stackOp180_6_0 = ((org.luaj.vm2.LuaValue)(p0)).typename();
    java.lang.String __stackOp180_6_1 = com.moon.qd.c;
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_2a79a5f862bb_invokedynamic180_7(__stackOp180_6_1, __stackOp180_6_0))));
    }
    forestValue180_20_0 = ((org.luaj.vm2.LuaValue)(p0)).toint();
    }
    life5_21 = forestValue180_20_0;
    return org.luaj.vm2.LuaValue.valueOf(((boolean)(((com.moon.j5)(((com.moon.jW)(this.a)).c)).is_sprinting(((int)(life5_21))))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2a79a5f862bb_invokedynamic180_7(java.lang.String a0, java.lang.String a1) throws E;
}
