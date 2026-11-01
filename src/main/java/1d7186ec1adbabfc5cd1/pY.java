package com.moon;


class pY extends org.luaj.vm2.lib.OneArgFunction {

com.moon.jU a;

private static long b;

private static java.lang.String c;

pY(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_acf6716b6992f4ab(com.moon.pY receiver, com.moon.jU p0) throws Throwable {

((com.moon.pY)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.pY.__sourceConstructorInit_acf6716b6992f4ab_0(((com.moon.pY)(receiver)));

    return;

}



static {
javax.crypto.Cipher forestValue119_31_0;
    int forestValue119_31_1;
    javax.crypto.SecretKeyFactory forestValue119_31_2;
    byte[] forestValue119_31_3;
    javax.crypto.Cipher forestValue119_48_0;
    int forestValue119_48_1;
    javax.crypto.SecretKeyFactory forestValue119_48_2;
    byte[] forestValue119_48_3;
    javax.crypto.Cipher spill119_0;
    int spill119_1;
    javax.crypto.SecretKeyFactory spill119_2;
    byte[] spill119_3;
    byte[] spill119_4;
    int spill119_5;
    java.lang.String spill119_6;
    long life0_11;
    javax.crypto.Cipher life2_15;
    int life3_30;
    byte[] life4_68;
    forest_join_48: {
    b = ((long)(((moom._a)(moom._c.a(((long)(-8479442258754974708L)), ((long)(-5452640916676677280L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(21262715653001L)))));
    life0_11 = (com.moon.pY.b ^ 116845363675366L);
    spill119_0 = (life2_15 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill119_1 = 2;
    spill119_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp119_8_0 = new byte[8];
    spill119_3 = __stackOp119_8_0;
    (__stackOp119_8_0)[0] = ((byte) ((int) (life0_11 >>> 56)));
    life3_30 = 1;
    forestValue119_31_0 = spill119_0;
    forestValue119_31_1 = spill119_1;
    forestValue119_31_2 = spill119_2;
    forestValue119_31_3 = spill119_3;
    forest_cycle_31: while (true) {
    if (!((life3_30 < 8))) {
        forestValue119_48_0 = forestValue119_31_0;
        forestValue119_48_1 = forestValue119_31_1;
        forestValue119_48_2 = forestValue119_31_2;
        forestValue119_48_3 = forestValue119_31_3;
        break forest_join_48;
    }
    byte[] __stackOp119_9_0 = forestValue119_31_3;
    spill119_4 = __stackOp119_9_0;
    (__stackOp119_9_0)[life3_30] = ((byte) ((int) ((life0_11 << (life3_30 * 8)) >>> 56)));
    life3_30 += 1;
    forestValue119_31_3 = spill119_4;
    continue forest_cycle_31;
    }
    }
    ((javax.crypto.Cipher)(forestValue119_48_0)).init(((int)(forestValue119_48_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue119_48_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue119_48_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String __stackOp119_12_0 = "ç»ÍÔ²\001ópÒÒ! 'ø°¤ÜwGØ²^Ï\f^_";
    int __stackOp119_12_1 = -1;
    spill119_5 = __stackOp119_12_1;
    byte[] __stackOp119_14_0 = ((java.lang.String)(__stackOp119_12_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp119_14_1 = life2_15;
    life4_68 = ((javax.crypto.Cipher)(__stackOp119_14_1)).doFinal(((byte[])(__stackOp119_14_0)));
    int __stackOp119_18_0 = spill119_5;
    java.lang.String __stackOp119_18_1 = ((java.lang.String)(com.moon.pY.a(((byte[])(life4_68))))).intern();
    spill119_6 = __stackOp119_18_1;
    recovery.source.CarrierOps.discard(__stackOp119_18_0);
    c = ((java.lang.String)(spill119_6));
}

private static native <E extends Throwable> void __sourceConstructorInit_acf6716b6992f4ab_0(com.moon.pY a0) throws E;

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
        byte[] spill1199_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1199_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1199_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1199_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1199_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1199_2)[life4_9];
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
org.luaj.vm2.LuaValue forwardValue1200_26_0;
    org.luaj.vm2.LuaValue forwardValue1200_34_0;
    int spill1200_0;
    org.luaj.vm2.LuaValue spill1200_1;
    org.luaj.vm2.LuaValue spill1200_2;
    long life2_3;
    org.luaj.vm2.LuaValue life5_8;
    int life4_9;
    forward_join_34: {
    forward_join_27: {
    forward_join_26: {
    forward_join_20: {
    life2_3 = (com.moon.pY.b ^ 90364376355231L);
    spill1200_0 = com.moon.jN.c();
    life5_8 = ((org.luaj.vm2.LuaValue)(p0)).arg(((int)(1)));
    life4_9 = spill1200_0;
    spill1200_1 = life5_8;
    if (!((life4_9 == 0))) {
        forwardValue1200_26_0 = spill1200_1;
        break forward_join_26;
    }
    if (!((!((org.luaj.vm2.LuaValue)(spill1200_1)).isnil()))) {
        break forward_join_20;
    }
    spill1200_2 = life5_8;
    if (!((life4_9 == 0))) {
        forwardValue1200_34_0 = spill1200_2;
        break forward_join_34;
    }
    if (!((!((org.luaj.vm2.LuaValue)(spill1200_2)).isnumber()))) {
        break forward_join_27;
    }
    }
    java.lang.String __stackOp1200_7_0 = ((org.luaj.vm2.LuaValue)(life5_8)).typename();
    java.lang.String __stackOp1200_7_1 = com.moon.pY.c;
    forwardValue1200_26_0 = org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_2a79a5f862bb_invokedynamic1200_8(__stackOp1200_7_1, __stackOp1200_7_0))));
    }
    return forwardValue1200_26_0;
    }
    ((com.moon.j3)(((com.moon.jU)(this.a)).c)).set_pitch(((float)(((org.luaj.vm2.LuaValue)(life5_8)).tofloat())));
    forwardValue1200_34_0 = org.luaj.vm2.LuaValue.NIL;
    }
    return forwardValue1200_34_0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2a79a5f862bb_invokedynamic1200_8(java.lang.String a0, java.lang.String a1) throws E;
}
