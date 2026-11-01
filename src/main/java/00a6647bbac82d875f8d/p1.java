package com.moon;


class p1 extends org.luaj.vm2.lib.OneArgFunction {

com.moon.jU a;

private static long b;

private static java.lang.String c;

p1(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_f5ae72d75a59c5a7(com.moon.p1 receiver, com.moon.jU p0) throws Throwable {

((com.moon.p1)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.p1.__sourceConstructorInit_f5ae72d75a59c5a7_0(((com.moon.p1)(receiver)));

    return;

}



static {
javax.crypto.Cipher forestValue67_31_0;
    int forestValue67_31_1;
    javax.crypto.SecretKeyFactory forestValue67_31_2;
    byte[] forestValue67_31_3;
    javax.crypto.Cipher forestValue67_48_0;
    int forestValue67_48_1;
    javax.crypto.SecretKeyFactory forestValue67_48_2;
    byte[] forestValue67_48_3;
    javax.crypto.Cipher spill67_0;
    int spill67_1;
    javax.crypto.SecretKeyFactory spill67_2;
    byte[] spill67_3;
    byte[] spill67_4;
    int spill67_5;
    java.lang.String spill67_6;
    long life0_11;
    javax.crypto.Cipher life2_15;
    int life3_30;
    byte[] life4_68;
    forest_join_48: {
    b = ((long)(((moom._a)(moom._c.a(((long)(-7243630842986488653L)), ((long)(-241288888548658020L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(1645929147314L)))));
    life0_11 = (com.moon.p1.b ^ 86278419140076L);
    spill67_0 = (life2_15 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill67_1 = 2;
    spill67_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp67_8_0 = new byte[8];
    spill67_3 = __stackOp67_8_0;
    (__stackOp67_8_0)[0] = ((byte) ((int) (life0_11 >>> 56)));
    life3_30 = 1;
    forestValue67_31_0 = spill67_0;
    forestValue67_31_1 = spill67_1;
    forestValue67_31_2 = spill67_2;
    forestValue67_31_3 = spill67_3;
    forest_cycle_31: while (true) {
    if (!((life3_30 < 8))) {
        forestValue67_48_0 = forestValue67_31_0;
        forestValue67_48_1 = forestValue67_31_1;
        forestValue67_48_2 = forestValue67_31_2;
        forestValue67_48_3 = forestValue67_31_3;
        break forest_join_48;
    }
    byte[] __stackOp67_9_0 = forestValue67_31_3;
    spill67_4 = __stackOp67_9_0;
    (__stackOp67_9_0)[life3_30] = ((byte) ((int) ((life0_11 << (life3_30 * 8)) >>> 56)));
    life3_30 += 1;
    forestValue67_31_3 = spill67_4;
    continue forest_cycle_31;
    }
    }
    ((javax.crypto.Cipher)(forestValue67_48_0)).init(((int)(forestValue67_48_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue67_48_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue67_48_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String __stackOp67_12_0 = "Î0'SR\020â\0039.à'\020éræ[)\022ä\037ç¹ø4¼±\017²";
    int __stackOp67_12_1 = -1;
    spill67_5 = __stackOp67_12_1;
    byte[] __stackOp67_14_0 = ((java.lang.String)(__stackOp67_12_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp67_14_1 = life2_15;
    life4_68 = ((javax.crypto.Cipher)(__stackOp67_14_1)).doFinal(((byte[])(__stackOp67_14_0)));
    int __stackOp67_18_0 = spill67_5;
    java.lang.String __stackOp67_18_1 = ((java.lang.String)(com.moon.p1.a(((byte[])(life4_68))))).intern();
    spill67_6 = __stackOp67_18_1;
    recovery.source.CarrierOps.discard(__stackOp67_18_0);
    c = ((java.lang.String)(spill67_6));
}

private static native <E extends Throwable> void __sourceConstructorInit_f5ae72d75a59c5a7_0(com.moon.p1 a0) throws E;

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
        byte[] spill1148_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1148_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1148_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1148_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1148_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1148_2)[life4_9];
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
org.luaj.vm2.LuaValue forwardValue1149_26_0;
    org.luaj.vm2.LuaValue forwardValue1149_34_0;
    int spill1149_0;
    org.luaj.vm2.LuaValue spill1149_1;
    org.luaj.vm2.LuaValue spill1149_2;
    long life2_3;
    org.luaj.vm2.LuaValue life5_8;
    int life4_9;
    forward_join_34: {
    forward_join_27: {
    forward_join_26: {
    forward_join_20: {
    life2_3 = (com.moon.p1.b ^ 57611357810264L);
    spill1149_0 = com.moon.jN.b();
    life5_8 = ((org.luaj.vm2.LuaValue)(p0)).arg(((int)(1)));
    life4_9 = spill1149_0;
    spill1149_1 = life5_8;
    if (!((life4_9 != 0))) {
        forwardValue1149_26_0 = spill1149_1;
        break forward_join_26;
    }
    if (!((!((org.luaj.vm2.LuaValue)(spill1149_1)).isnil()))) {
        break forward_join_20;
    }
    spill1149_2 = life5_8;
    if (!((life4_9 != 0))) {
        forwardValue1149_34_0 = spill1149_2;
        break forward_join_34;
    }
    if (!((!((org.luaj.vm2.LuaValue)(spill1149_2)).isnumber()))) {
        break forward_join_27;
    }
    }
    java.lang.String __stackOp1149_7_0 = ((org.luaj.vm2.LuaValue)(life5_8)).typename();
    java.lang.String __stackOp1149_7_1 = com.moon.p1.c;
    forwardValue1149_26_0 = org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_2a79a5f862bb_invokedynamic1149_8(__stackOp1149_7_1, __stackOp1149_7_0))));
    }
    return forwardValue1149_26_0;
    }
    ((com.moon.j3)(((com.moon.jU)(this.a)).c)).set_motion_x(((double)(((org.luaj.vm2.LuaValue)(life5_8)).todouble())));
    forwardValue1149_34_0 = org.luaj.vm2.LuaValue.NIL;
    }
    return forwardValue1149_34_0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2a79a5f862bb_invokedynamic1149_8(java.lang.String a0, java.lang.String a1) throws E;
}
