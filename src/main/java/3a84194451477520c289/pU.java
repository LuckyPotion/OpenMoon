package com.moon;


class pU extends org.luaj.vm2.lib.OneArgFunction {

com.moon.jU a;

private static long b;

private static java.lang.String c;

pU(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_efe9411b940ef747(com.moon.pU receiver, com.moon.jU p0) throws Throwable {

((com.moon.pU)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.pU.__sourceConstructorInit_efe9411b940ef747_0(((com.moon.pU)(receiver)));

    return;

}



static {
javax.crypto.Cipher forestValue111_31_0;
    int forestValue111_31_1;
    javax.crypto.SecretKeyFactory forestValue111_31_2;
    byte[] forestValue111_31_3;
    javax.crypto.Cipher forestValue111_48_0;
    int forestValue111_48_1;
    javax.crypto.SecretKeyFactory forestValue111_48_2;
    byte[] forestValue111_48_3;
    javax.crypto.Cipher spill111_0;
    int spill111_1;
    javax.crypto.SecretKeyFactory spill111_2;
    byte[] spill111_3;
    byte[] spill111_4;
    int spill111_5;
    java.lang.String spill111_6;
    long life0_11;
    javax.crypto.Cipher life2_15;
    int life3_30;
    byte[] life4_68;
    forest_join_48: {
    b = ((long)(((moom._a)(moom._c.a(((long)(6553988943472109167L)), ((long)(-2811745485341583412L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(104075792524951L)))));
    life0_11 = (com.moon.pU.b ^ 45107166972741L);
    spill111_0 = (life2_15 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill111_1 = 2;
    spill111_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp111_8_0 = new byte[8];
    spill111_3 = __stackOp111_8_0;
    (__stackOp111_8_0)[0] = ((byte) ((int) (life0_11 >>> 56)));
    life3_30 = 1;
    forestValue111_31_0 = spill111_0;
    forestValue111_31_1 = spill111_1;
    forestValue111_31_2 = spill111_2;
    forestValue111_31_3 = spill111_3;
    forest_cycle_31: while (true) {
    if (!((life3_30 < 8))) {
        forestValue111_48_0 = forestValue111_31_0;
        forestValue111_48_1 = forestValue111_31_1;
        forestValue111_48_2 = forestValue111_31_2;
        forestValue111_48_3 = forestValue111_31_3;
        break forest_join_48;
    }
    byte[] __stackOp111_9_0 = forestValue111_31_3;
    spill111_4 = __stackOp111_9_0;
    (__stackOp111_9_0)[life3_30] = ((byte) ((int) ((life0_11 << (life3_30 * 8)) >>> 56)));
    life3_30 += 1;
    forestValue111_31_3 = spill111_4;
    continue forest_cycle_31;
    }
    }
    ((javax.crypto.Cipher)(forestValue111_48_0)).init(((int)(forestValue111_48_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue111_48_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue111_48_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String __stackOp111_12_0 = "\003ÇìkÂb3´à1ëÌ¶\031l1q\034D\035ÍAVØ¶ú\024®";
    int __stackOp111_12_1 = -1;
    spill111_5 = __stackOp111_12_1;
    byte[] __stackOp111_14_0 = ((java.lang.String)(__stackOp111_12_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp111_14_1 = life2_15;
    life4_68 = ((javax.crypto.Cipher)(__stackOp111_14_1)).doFinal(((byte[])(__stackOp111_14_0)));
    int __stackOp111_18_0 = spill111_5;
    java.lang.String __stackOp111_18_1 = ((java.lang.String)(com.moon.pU.a(((byte[])(life4_68))))).intern();
    spill111_6 = __stackOp111_18_1;
    recovery.source.CarrierOps.discard(__stackOp111_18_0);
    c = ((java.lang.String)(spill111_6));
}

private static native <E extends Throwable> void __sourceConstructorInit_efe9411b940ef747_0(com.moon.pU a0) throws E;

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
        byte[] spill1191_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1191_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1191_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1191_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1191_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1191_2)[life4_9];
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
org.luaj.vm2.LuaValue forestValue161_26_0;
    int forestValue161_33_0;
    int spill161_0;
    org.luaj.vm2.LuaValue spill161_1;
    boolean spill161_2;
    long life2_3;
    org.luaj.vm2.LuaValue life5_8;
    int life4_9;
    forest_join_33: {
    forest_join_27: {
    forest_join_26: {
    forest_join_20: {
    life2_3 = (com.moon.pU.b ^ 82406107302791L);
    spill161_0 = com.moon.jN.b();
    life5_8 = ((org.luaj.vm2.LuaValue)(p0)).arg(((int)(1)));
    life4_9 = spill161_0;
    spill161_1 = life5_8;
    if (!((life4_9 != 0))) {
        forestValue161_26_0 = spill161_1;
        break forest_join_26;
    }
    if (!((!((org.luaj.vm2.LuaValue)(spill161_1)).isnil()))) {
        break forest_join_20;
    }
    spill161_2 = ((org.luaj.vm2.LuaValue)(life5_8)).isnumber();
    if (!((life4_9 != 0))) {
        forestValue161_33_0 = ((spill161_2) ? 1 : 0);
        break forest_join_33;
    }
    if (!((!spill161_2))) {
        break forest_join_27;
    }
    }
    java.lang.String __stackOp161_8_0 = ((org.luaj.vm2.LuaValue)(life5_8)).typename();
    java.lang.String __stackOp161_8_1 = com.moon.pU.c;
    forestValue161_26_0 = org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_2a79a5f862bb_invokedynamic161_9(__stackOp161_8_1, __stackOp161_8_0))));
    }
    return forestValue161_26_0;
    }
    forestValue161_33_0 = ((((com.moon.j3)(((com.moon.jU)(this.a)).c)).has_effect(((int)(((org.luaj.vm2.LuaValue)(life5_8)).toint())))) ? 1 : 0);
    }
    return org.luaj.vm2.LuaValue.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forestValue161_33_0))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2a79a5f862bb_invokedynamic161_9(java.lang.String a0, java.lang.String a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
