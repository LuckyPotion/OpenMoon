package com.moon;


class pO extends org.luaj.vm2.lib.OneArgFunction {

com.moon.jS a;

private static long b;

private static java.lang.String c;

pO(com.moon.jS p0) { super(); }


private static void __sourceConstructorBody_200dc08b2ce99163(com.moon.pO receiver, com.moon.jS p0) throws Throwable {

((com.moon.pO)(receiver)).a = ((com.moon.jS)(p0));

    com.moon.pO.__sourceConstructorInit_200dc08b2ce99163_0(((com.moon.pO)(receiver)));

    return;

}



static {
javax.crypto.Cipher forestValue99_31_0;
    int forestValue99_31_1;
    javax.crypto.SecretKeyFactory forestValue99_31_2;
    byte[] forestValue99_31_3;
    javax.crypto.Cipher forestValue99_48_0;
    int forestValue99_48_1;
    javax.crypto.SecretKeyFactory forestValue99_48_2;
    byte[] forestValue99_48_3;
    javax.crypto.Cipher spill99_0;
    int spill99_1;
    javax.crypto.SecretKeyFactory spill99_2;
    byte[] spill99_3;
    byte[] spill99_4;
    int spill99_5;
    java.lang.String spill99_6;
    long life0_11;
    javax.crypto.Cipher life2_15;
    int life3_30;
    byte[] life4_68;
    forest_join_48: {
    b = ((long)(((moom._a)(moom._c.a(((long)(-4771869046523679104L)), ((long)(5512411628165438048L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(1645329007204L)))));
    life0_11 = (com.moon.pO.b ^ 78607344584304L);
    spill99_0 = (life2_15 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill99_1 = 2;
    spill99_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp99_8_0 = new byte[8];
    spill99_3 = __stackOp99_8_0;
    (__stackOp99_8_0)[0] = ((byte) ((int) (life0_11 >>> 56)));
    life3_30 = 1;
    forestValue99_31_0 = spill99_0;
    forestValue99_31_1 = spill99_1;
    forestValue99_31_2 = spill99_2;
    forestValue99_31_3 = spill99_3;
    forest_cycle_31: while (true) {
    if (!((life3_30 < 8))) {
        forestValue99_48_0 = forestValue99_31_0;
        forestValue99_48_1 = forestValue99_31_1;
        forestValue99_48_2 = forestValue99_31_2;
        forestValue99_48_3 = forestValue99_31_3;
        break forest_join_48;
    }
    byte[] __stackOp99_9_0 = forestValue99_31_3;
    spill99_4 = __stackOp99_9_0;
    (__stackOp99_9_0)[life3_30] = ((byte) ((int) ((life0_11 << (life3_30 * 8)) >>> 56)));
    life3_30 += 1;
    forestValue99_31_3 = spill99_4;
    continue forest_cycle_31;
    }
    }
    ((javax.crypto.Cipher)(forestValue99_48_0)).init(((int)(forestValue99_48_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue99_48_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue99_48_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String __stackOp99_12_0 = "\007-v©t±4·þCÐ²ÜÃ)RîR$\032ªøß\001\005í\000lÓ";
    int __stackOp99_12_1 = -1;
    spill99_5 = __stackOp99_12_1;
    byte[] __stackOp99_14_0 = ((java.lang.String)(__stackOp99_12_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp99_14_1 = life2_15;
    life4_68 = ((javax.crypto.Cipher)(__stackOp99_14_1)).doFinal(((byte[])(__stackOp99_14_0)));
    int __stackOp99_18_0 = spill99_5;
    java.lang.String __stackOp99_18_1 = ((java.lang.String)(com.moon.pO.a(((byte[])(life4_68))))).intern();
    spill99_6 = __stackOp99_18_1;
    recovery.source.CarrierOps.discard(__stackOp99_18_0);
    c = ((java.lang.String)(spill99_6));
}

private static native <E extends Throwable> void __sourceConstructorInit_200dc08b2ce99163_0(com.moon.pO a0) throws E;

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
        byte[] spill1179_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1179_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1179_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1179_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1179_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1179_2)[life4_9];
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
org.luaj.vm2.LuaValue forwardValue1180_22_0;
    int forwardValue1180_25_0;
    org.luaj.vm2.LuaValue spill1180_0;
    boolean spill1180_1;
    long life2_3;
    int life4_5;
    int life5_37;
    forward_join_25: {
    forward_join_23: {
    forward_join_22: {
    forward_join_16: {
    life2_3 = (com.moon.pO.b ^ 26165697848550L);
    life4_5 = com.moon.jN.c();
    spill1180_0 = p0;
    if (!((life4_5 == 0))) {
        forwardValue1180_22_0 = spill1180_0;
        break forward_join_22;
    }
    if (!((!((org.luaj.vm2.LuaValue)(spill1180_0)).isnil()))) {
        break forward_join_16;
    }
    spill1180_1 = ((org.luaj.vm2.LuaValue)(p0)).isnumber();
    if (!((life4_5 == 0))) {
        forwardValue1180_25_0 = ((spill1180_1) ? 1 : 0);
        break forward_join_25;
    }
    if (!((!spill1180_1))) {
        break forward_join_23;
    }
    }
    java.lang.String __stackOp1180_7_0 = ((org.luaj.vm2.LuaValue)(p0)).typename();
    java.lang.String __stackOp1180_7_1 = com.moon.pO.c;
    forwardValue1180_22_0 = org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_2a79a5f862bb_invokedynamic1180_8(__stackOp1180_7_1, __stackOp1180_7_0))));
    }
    return forwardValue1180_22_0;
    }
    forwardValue1180_25_0 = ((org.luaj.vm2.LuaValue)(p0)).toint();
    }
    life5_37 = forwardValue1180_25_0;
    return com.moon.j6.a__LuaValue(((java.lang.Object)(((com.moon.j1)(((com.moon.jS)(this.a)).c)).get_item(((int)(life5_37))))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2a79a5f862bb_invokedynamic1180_8(java.lang.String a0, java.lang.String a1) throws E;
}
