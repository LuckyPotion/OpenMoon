package com.moon;


class pN extends org.luaj.vm2.lib.OneArgFunction {

com.moon.jS a;

private static long b;

private static java.lang.String c;

pN(com.moon.jS p0) { super(); }


private static void __sourceConstructorBody_0b720b73eb0b510c(com.moon.pN receiver, com.moon.jS p0) throws Throwable {

((com.moon.pN)(receiver)).a = ((com.moon.jS)(p0));

    com.moon.pN.__sourceConstructorInit_0b720b73eb0b510c_0(((com.moon.pN)(receiver)));

    return;

}



static {
javax.crypto.Cipher forestValue97_31_0;
    int forestValue97_31_1;
    javax.crypto.SecretKeyFactory forestValue97_31_2;
    byte[] forestValue97_31_3;
    javax.crypto.Cipher forestValue97_48_0;
    int forestValue97_48_1;
    javax.crypto.SecretKeyFactory forestValue97_48_2;
    byte[] forestValue97_48_3;
    javax.crypto.Cipher spill97_0;
    int spill97_1;
    javax.crypto.SecretKeyFactory spill97_2;
    byte[] spill97_3;
    byte[] spill97_4;
    int spill97_5;
    java.lang.String spill97_6;
    long life0_11;
    javax.crypto.Cipher life2_15;
    int life3_30;
    byte[] life4_68;
    forest_join_48: {
    b = ((long)(((moom._a)(moom._c.a(((long)(-5294510718205730178L)), ((long)(-7243945285617086520L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(153102103102426L)))));
    life0_11 = (com.moon.pN.b ^ 8405224377175L);
    spill97_0 = (life2_15 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill97_1 = 2;
    spill97_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp97_8_0 = new byte[8];
    spill97_3 = __stackOp97_8_0;
    (__stackOp97_8_0)[0] = ((byte) ((int) (life0_11 >>> 56)));
    life3_30 = 1;
    forestValue97_31_0 = spill97_0;
    forestValue97_31_1 = spill97_1;
    forestValue97_31_2 = spill97_2;
    forestValue97_31_3 = spill97_3;
    forest_cycle_31: while (true) {
    if (!((life3_30 < 8))) {
        forestValue97_48_0 = forestValue97_31_0;
        forestValue97_48_1 = forestValue97_31_1;
        forestValue97_48_2 = forestValue97_31_2;
        forestValue97_48_3 = forestValue97_31_3;
        break forest_join_48;
    }
    byte[] __stackOp97_9_0 = forestValue97_31_3;
    spill97_4 = __stackOp97_9_0;
    (__stackOp97_9_0)[life3_30] = ((byte) ((int) ((life0_11 << (life3_30 * 8)) >>> 56)));
    life3_30 += 1;
    forestValue97_31_3 = spill97_4;
    continue forest_cycle_31;
    }
    }
    ((javax.crypto.Cipher)(forestValue97_48_0)).init(((int)(forestValue97_48_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue97_48_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue97_48_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String __stackOp97_12_0 = "\006Îñ^Õ\"ö6\033O8µò¡í#°kãßèâû=\013¢";
    int __stackOp97_12_1 = -1;
    spill97_5 = __stackOp97_12_1;
    byte[] __stackOp97_14_0 = ((java.lang.String)(__stackOp97_12_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp97_14_1 = life2_15;
    life4_68 = ((javax.crypto.Cipher)(__stackOp97_14_1)).doFinal(((byte[])(__stackOp97_14_0)));
    int __stackOp97_18_0 = spill97_5;
    java.lang.String __stackOp97_18_1 = ((java.lang.String)(com.moon.pN.a(((byte[])(life4_68))))).intern();
    spill97_6 = __stackOp97_18_1;
    recovery.source.CarrierOps.discard(__stackOp97_18_0);
    c = ((java.lang.String)(spill97_6));
}

private static native <E extends Throwable> void __sourceConstructorInit_0b720b73eb0b510c_0(com.moon.pN a0) throws E;

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
        byte[] spill1177_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1177_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1177_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1177_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1177_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1177_2)[life4_9];
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
org.luaj.vm2.LuaValue forwardValue1178_22_0;
    int forwardValue1178_25_0;
    org.luaj.vm2.LuaValue spill1178_0;
    boolean spill1178_1;
    long life2_3;
    int life4_5;
    int life5_37;
    forward_join_25: {
    forward_join_23: {
    forward_join_22: {
    forward_join_16: {
    life2_3 = (com.moon.pN.b ^ 85093414846778L);
    life4_5 = com.moon.jN.c();
    spill1178_0 = p0;
    if (!((life4_5 == 0))) {
        forwardValue1178_22_0 = spill1178_0;
        break forward_join_22;
    }
    if (!((!((org.luaj.vm2.LuaValue)(spill1178_0)).isnil()))) {
        break forward_join_16;
    }
    spill1178_1 = ((org.luaj.vm2.LuaValue)(p0)).isnumber();
    if (!((life4_5 == 0))) {
        forwardValue1178_25_0 = ((spill1178_1) ? 1 : 0);
        break forward_join_25;
    }
    if (!((!spill1178_1))) {
        break forward_join_23;
    }
    }
    java.lang.String __stackOp1178_7_0 = ((org.luaj.vm2.LuaValue)(p0)).typename();
    java.lang.String __stackOp1178_7_1 = com.moon.pN.c;
    forwardValue1178_22_0 = org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_2a79a5f862bb_invokedynamic1178_8(__stackOp1178_7_1, __stackOp1178_7_0))));
    }
    return forwardValue1178_22_0;
    }
    forwardValue1178_25_0 = ((org.luaj.vm2.LuaValue)(p0)).toint();
    }
    life5_37 = forwardValue1178_25_0;
    ((com.moon.j1)(((com.moon.jS)(this.a)).c)).shift(((int)(life5_37)));
    return org.luaj.vm2.LuaValue.NIL;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2a79a5f862bb_invokedynamic1178_8(java.lang.String a0, java.lang.String a1) throws E;
}
