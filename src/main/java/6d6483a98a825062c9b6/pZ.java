package com.moon;


class pZ extends org.luaj.vm2.lib.OneArgFunction {

com.moon.jU a;

private static long b;

private static java.lang.String c;

pZ(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_e770525b57eacdec(com.moon.pZ receiver, com.moon.jU p0) throws Throwable {

((com.moon.pZ)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.pZ.__sourceConstructorInit_e770525b57eacdec_0(((com.moon.pZ)(receiver)));

    return;

}



static {
javax.crypto.Cipher forestValue121_31_0;
    int forestValue121_31_1;
    javax.crypto.SecretKeyFactory forestValue121_31_2;
    byte[] forestValue121_31_3;
    javax.crypto.Cipher forestValue121_48_0;
    int forestValue121_48_1;
    javax.crypto.SecretKeyFactory forestValue121_48_2;
    byte[] forestValue121_48_3;
    javax.crypto.Cipher spill121_0;
    int spill121_1;
    javax.crypto.SecretKeyFactory spill121_2;
    byte[] spill121_3;
    byte[] spill121_4;
    int spill121_5;
    java.lang.String spill121_6;
    long life0_11;
    javax.crypto.Cipher life2_15;
    int life3_30;
    byte[] life4_68;
    forest_join_48: {
    b = ((long)(((moom._a)(moom._c.a(((long)(6590668115200687776L)), ((long)(1890510613321219413L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(154749030948140L)))));
    life0_11 = (com.moon.pZ.b ^ 43679456803879L);
    spill121_0 = (life2_15 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill121_1 = 2;
    spill121_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp121_8_0 = new byte[8];
    spill121_3 = __stackOp121_8_0;
    (__stackOp121_8_0)[0] = ((byte) ((int) (life0_11 >>> 56)));
    life3_30 = 1;
    forestValue121_31_0 = spill121_0;
    forestValue121_31_1 = spill121_1;
    forestValue121_31_2 = spill121_2;
    forestValue121_31_3 = spill121_3;
    forest_cycle_31: while (true) {
    if (!((life3_30 < 8))) {
        forestValue121_48_0 = forestValue121_31_0;
        forestValue121_48_1 = forestValue121_31_1;
        forestValue121_48_2 = forestValue121_31_2;
        forestValue121_48_3 = forestValue121_31_3;
        break forest_join_48;
    }
    byte[] __stackOp121_9_0 = forestValue121_31_3;
    spill121_4 = __stackOp121_9_0;
    (__stackOp121_9_0)[life3_30] = ((byte) ((int) ((life0_11 << (life3_30 * 8)) >>> 56)));
    life3_30 += 1;
    forestValue121_31_3 = spill121_4;
    continue forest_cycle_31;
    }
    }
    ((javax.crypto.Cipher)(forestValue121_48_0)).init(((int)(forestValue121_48_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue121_48_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue121_48_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String __stackOp121_12_0 = "6¼F\006Ü'·N+®ØrMD.½é*À³\034>Ù´;";
    int __stackOp121_12_1 = -1;
    spill121_5 = __stackOp121_12_1;
    byte[] __stackOp121_14_0 = ((java.lang.String)(__stackOp121_12_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp121_14_1 = life2_15;
    life4_68 = ((javax.crypto.Cipher)(__stackOp121_14_1)).doFinal(((byte[])(__stackOp121_14_0)));
    int __stackOp121_18_0 = spill121_5;
    java.lang.String __stackOp121_18_1 = ((java.lang.String)(com.moon.pZ.a(((byte[])(life4_68))))).intern();
    spill121_6 = __stackOp121_18_1;
    recovery.source.CarrierOps.discard(__stackOp121_18_0);
    c = ((java.lang.String)(spill121_6));
}

private static native <E extends Throwable> void __sourceConstructorInit_e770525b57eacdec_0(com.moon.pZ a0) throws E;

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
        byte[] spill1201_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1201_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1201_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1201_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1201_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1201_2)[life4_9];
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
org.luaj.vm2.LuaValue forwardValue1202_26_0;
    org.luaj.vm2.LuaValue forwardValue1202_34_0;
    int spill1202_0;
    org.luaj.vm2.LuaValue spill1202_1;
    org.luaj.vm2.LuaValue spill1202_2;
    long life2_3;
    org.luaj.vm2.LuaValue life5_8;
    int life4_9;
    forward_join_34: {
    forward_join_27: {
    forward_join_26: {
    forward_join_20: {
    life2_3 = (com.moon.pZ.b ^ 79240927633040L);
    spill1202_0 = com.moon.jN.c();
    life5_8 = ((org.luaj.vm2.LuaValue)(p0)).arg(((int)(1)));
    life4_9 = spill1202_0;
    spill1202_1 = life5_8;
    if (!((life4_9 == 0))) {
        forwardValue1202_26_0 = spill1202_1;
        break forward_join_26;
    }
    if (!((!((org.luaj.vm2.LuaValue)(spill1202_1)).isnil()))) {
        break forward_join_20;
    }
    spill1202_2 = life5_8;
    if (!((life4_9 == 0))) {
        forwardValue1202_34_0 = spill1202_2;
        break forward_join_34;
    }
    if (!((!((org.luaj.vm2.LuaValue)(spill1202_2)).isnumber()))) {
        break forward_join_27;
    }
    }
    java.lang.String __stackOp1202_7_0 = ((org.luaj.vm2.LuaValue)(life5_8)).typename();
    java.lang.String __stackOp1202_7_1 = com.moon.pZ.c;
    forwardValue1202_26_0 = org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_2a79a5f862bb_invokedynamic1202_8(__stackOp1202_7_1, __stackOp1202_7_0))));
    }
    return forwardValue1202_26_0;
    }
    ((com.moon.j3)(((com.moon.jU)(this.a)).c)).set_held_item(((int)(((org.luaj.vm2.LuaValue)(life5_8)).toint())));
    forwardValue1202_34_0 = org.luaj.vm2.LuaValue.NIL;
    }
    return forwardValue1202_34_0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2a79a5f862bb_invokedynamic1202_8(java.lang.String a0, java.lang.String a1) throws E;
}
