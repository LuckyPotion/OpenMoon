package com.moon;


class pX extends org.luaj.vm2.lib.OneArgFunction {

com.moon.jU a;

private static long b;

private static java.lang.String c;

pX(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_733cc4b22ab47577(com.moon.pX receiver, com.moon.jU p0) throws Throwable {

((com.moon.pX)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.pX.__sourceConstructorInit_733cc4b22ab47577_0(((com.moon.pX)(receiver)));

    return;

}



static {
javax.crypto.Cipher forestValue117_31_0;
    int forestValue117_31_1;
    javax.crypto.SecretKeyFactory forestValue117_31_2;
    byte[] forestValue117_31_3;
    javax.crypto.Cipher forestValue117_48_0;
    int forestValue117_48_1;
    javax.crypto.SecretKeyFactory forestValue117_48_2;
    byte[] forestValue117_48_3;
    javax.crypto.Cipher spill117_0;
    int spill117_1;
    javax.crypto.SecretKeyFactory spill117_2;
    byte[] spill117_3;
    byte[] spill117_4;
    int spill117_5;
    java.lang.String spill117_6;
    long life0_11;
    javax.crypto.Cipher life2_15;
    int life3_30;
    byte[] life4_68;
    forest_join_48: {
    b = ((long)(((moom._a)(moom._c.a(((long)(3396280855035195829L)), ((long)(-7550017521808273912L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(64707533509087L)))));
    life0_11 = (com.moon.pX.b ^ 127500359634318L);
    spill117_0 = (life2_15 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill117_1 = 2;
    spill117_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp117_8_0 = new byte[8];
    spill117_3 = __stackOp117_8_0;
    (__stackOp117_8_0)[0] = ((byte) ((int) (life0_11 >>> 56)));
    life3_30 = 1;
    forestValue117_31_0 = spill117_0;
    forestValue117_31_1 = spill117_1;
    forestValue117_31_2 = spill117_2;
    forestValue117_31_3 = spill117_3;
    forest_cycle_31: while (true) {
    if (!((life3_30 < 8))) {
        forestValue117_48_0 = forestValue117_31_0;
        forestValue117_48_1 = forestValue117_31_1;
        forestValue117_48_2 = forestValue117_31_2;
        forestValue117_48_3 = forestValue117_31_3;
        break forest_join_48;
    }
    byte[] __stackOp117_9_0 = forestValue117_31_3;
    spill117_4 = __stackOp117_9_0;
    (__stackOp117_9_0)[life3_30] = ((byte) ((int) ((life0_11 << (life3_30 * 8)) >>> 56)));
    life3_30 += 1;
    forestValue117_31_3 = spill117_4;
    continue forest_cycle_31;
    }
    }
    ((javax.crypto.Cipher)(forestValue117_48_0)).init(((int)(forestValue117_48_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue117_48_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue117_48_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String __stackOp117_12_0 = "fJ\024\021}r/l®1vïü¾\b\004èí\030¿(èl{NÑJ\016";
    int __stackOp117_12_1 = -1;
    spill117_5 = __stackOp117_12_1;
    byte[] __stackOp117_14_0 = ((java.lang.String)(__stackOp117_12_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp117_14_1 = life2_15;
    life4_68 = ((javax.crypto.Cipher)(__stackOp117_14_1)).doFinal(((byte[])(__stackOp117_14_0)));
    int __stackOp117_18_0 = spill117_5;
    java.lang.String __stackOp117_18_1 = ((java.lang.String)(com.moon.pX.a(((byte[])(life4_68))))).intern();
    spill117_6 = __stackOp117_18_1;
    recovery.source.CarrierOps.discard(__stackOp117_18_0);
    c = ((java.lang.String)(spill117_6));
}

private static native <E extends Throwable> void __sourceConstructorInit_733cc4b22ab47577_0(com.moon.pX a0) throws E;

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
        byte[] spill1197_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1197_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1197_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1197_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1197_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1197_2)[life4_9];
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
org.luaj.vm2.LuaValue forwardValue1198_26_0;
    org.luaj.vm2.LuaValue forwardValue1198_34_0;
    int spill1198_0;
    org.luaj.vm2.LuaValue spill1198_1;
    org.luaj.vm2.LuaValue spill1198_2;
    long life2_3;
    org.luaj.vm2.LuaValue life5_8;
    int life4_9;
    forward_join_34: {
    forward_join_27: {
    forward_join_26: {
    forward_join_20: {
    life2_3 = (com.moon.pX.b ^ 101429802339565L);
    spill1198_0 = com.moon.jN.c();
    life5_8 = ((org.luaj.vm2.LuaValue)(p0)).arg(((int)(1)));
    life4_9 = spill1198_0;
    spill1198_1 = life5_8;
    if (!((life4_9 == 0))) {
        forwardValue1198_26_0 = spill1198_1;
        break forward_join_26;
    }
    if (!((!((org.luaj.vm2.LuaValue)(spill1198_1)).isnil()))) {
        break forward_join_20;
    }
    spill1198_2 = life5_8;
    if (!((life4_9 == 0))) {
        forwardValue1198_34_0 = spill1198_2;
        break forward_join_34;
    }
    if (!((!((org.luaj.vm2.LuaValue)(spill1198_2)).isnumber()))) {
        break forward_join_27;
    }
    }
    java.lang.String __stackOp1198_7_0 = ((org.luaj.vm2.LuaValue)(life5_8)).typename();
    java.lang.String __stackOp1198_7_1 = com.moon.pX.c;
    forwardValue1198_26_0 = org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_2a79a5f862bb_invokedynamic1198_8(__stackOp1198_7_1, __stackOp1198_7_0))));
    }
    return forwardValue1198_26_0;
    }
    ((com.moon.j3)(((com.moon.jU)(this.a)).c)).set_yaw(((float)(((org.luaj.vm2.LuaValue)(life5_8)).tofloat())));
    forwardValue1198_34_0 = org.luaj.vm2.LuaValue.NIL;
    }
    return forwardValue1198_34_0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2a79a5f862bb_invokedynamic1198_8(java.lang.String a0, java.lang.String a1) throws E;
}
