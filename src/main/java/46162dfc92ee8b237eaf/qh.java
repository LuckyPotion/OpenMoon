package com.moon;


class qh extends org.luaj.vm2.lib.OneArgFunction {

com.moon.jW a;

private static long b;

private static java.lang.String c;

qh(com.moon.jW p0) { super(); }


private static void __sourceConstructorBody_2bf3e46da775d586(com.moon.qh receiver, com.moon.jW p0) throws Throwable {

((com.moon.qh)(receiver)).a = ((com.moon.jW)(p0));

    com.moon.qh.__sourceConstructorInit_2bf3e46da775d586_0(((com.moon.qh)(receiver)));

    return;

}



static {
javax.crypto.Cipher forestValue216_31_0;
    int forestValue216_31_1;
    javax.crypto.SecretKeyFactory forestValue216_31_2;
    byte[] forestValue216_31_3;
    javax.crypto.Cipher forestValue216_48_0;
    int forestValue216_48_1;
    javax.crypto.SecretKeyFactory forestValue216_48_2;
    byte[] forestValue216_48_3;
    javax.crypto.Cipher spill216_0;
    int spill216_1;
    javax.crypto.SecretKeyFactory spill216_2;
    byte[] spill216_3;
    byte[] spill216_4;
    int spill216_5;
    java.lang.String spill216_6;
    long life0_11;
    javax.crypto.Cipher life2_15;
    int life3_30;
    byte[] life4_68;
    forest_join_48: {
    b = ((long)(((moom._a)(moom._c.a(((long)(-3168296784622744910L)), ((long)(177753204667920488L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(105679219240131L)))));
    life0_11 = (com.moon.qh.b ^ 18947770392522L);
    spill216_0 = (life2_15 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill216_1 = 2;
    spill216_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp216_8_0 = new byte[8];
    spill216_3 = __stackOp216_8_0;
    (__stackOp216_8_0)[0] = ((byte) ((int) (life0_11 >>> 56)));
    life3_30 = 1;
    forestValue216_31_0 = spill216_0;
    forestValue216_31_1 = spill216_1;
    forestValue216_31_2 = spill216_2;
    forestValue216_31_3 = spill216_3;
    forest_cycle_31: while (true) {
    if (!((life3_30 < 8))) {
        forestValue216_48_0 = forestValue216_31_0;
        forestValue216_48_1 = forestValue216_31_1;
        forestValue216_48_2 = forestValue216_31_2;
        forestValue216_48_3 = forestValue216_31_3;
        break forest_join_48;
    }
    byte[] __stackOp216_9_0 = forestValue216_31_3;
    spill216_4 = __stackOp216_9_0;
    (__stackOp216_9_0)[life3_30] = ((byte) ((int) ((life0_11 << (life3_30 * 8)) >>> 56)));
    life3_30 += 1;
    forestValue216_31_3 = spill216_4;
    continue forest_cycle_31;
    }
    }
    ((javax.crypto.Cipher)(forestValue216_48_0)).init(((int)(forestValue216_48_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue216_48_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue216_48_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String __stackOp216_12_0 = "õ\034H\bu6C\177\034¦\001\002Jïàp\005¦d)á®w¸êë{ób";
    int __stackOp216_12_1 = -1;
    spill216_5 = __stackOp216_12_1;
    byte[] __stackOp216_14_0 = ((java.lang.String)(__stackOp216_12_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp216_14_1 = life2_15;
    life4_68 = ((javax.crypto.Cipher)(__stackOp216_14_1)).doFinal(((byte[])(__stackOp216_14_0)));
    int __stackOp216_18_0 = spill216_5;
    java.lang.String __stackOp216_18_1 = ((java.lang.String)(com.moon.qh.a(((byte[])(life4_68))))).intern();
    spill216_6 = __stackOp216_18_1;
    recovery.source.CarrierOps.discard(__stackOp216_18_0);
    c = ((java.lang.String)(spill216_6));
}

private static native <E extends Throwable> void __sourceConstructorInit_2bf3e46da775d586_0(com.moon.qh a0) throws E;

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
        byte[] spill1318_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1318_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1318_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1318_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1318_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1318_2)[life4_9];
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
int forestValue184_20_0;
    boolean spill184_0;
    long life2_3;
    int life4_5;
    int life5_21;
    forest_join_20: {
    forest_join_18: {
    life2_3 = (com.moon.qh.b ^ 68824732555712L);
    life4_5 = com.moon.jN.c();
    spill184_0 = ((org.luaj.vm2.LuaValue)(p0)).isnumber();
    if (!((life4_5 == 0))) {
        forestValue184_20_0 = ((spill184_0) ? 1 : 0);
        break forest_join_20;
    }
    if (!((!spill184_0))) {
        break forest_join_18;
    }
    java.lang.String __stackOp184_6_0 = ((org.luaj.vm2.LuaValue)(p0)).typename();
    java.lang.String __stackOp184_6_1 = com.moon.qh.c;
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_2a79a5f862bb_invokedynamic184_7(__stackOp184_6_1, __stackOp184_6_0))));
    }
    forestValue184_20_0 = ((org.luaj.vm2.LuaValue)(p0)).toint();
    }
    life5_21 = forestValue184_20_0;
    return org.luaj.vm2.LuaValue.valueOf(((boolean)(((com.moon.j5)(((com.moon.jW)(this.a)).c)).is_riding(((int)(life5_21))))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2a79a5f862bb_invokedynamic184_7(java.lang.String a0, java.lang.String a1) throws E;
}
