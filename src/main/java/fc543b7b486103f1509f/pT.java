package com.moon;


class pT extends org.luaj.vm2.lib.OneArgFunction {

com.moon.jT a;

private static long b;

private static java.lang.String c;

pT(com.moon.jT p0) { super(); }


private static void __sourceConstructorBody_628a95ba0efb6e5f(com.moon.pT receiver, com.moon.jT p0) throws Throwable {

((com.moon.pT)(receiver)).a = ((com.moon.jT)(p0));

    com.moon.pT.__sourceConstructorInit_628a95ba0efb6e5f_0(((com.moon.pT)(receiver)));

    return;

}



static {
javax.crypto.Cipher forestValue109_31_0;
    int forestValue109_31_1;
    javax.crypto.SecretKeyFactory forestValue109_31_2;
    byte[] forestValue109_31_3;
    javax.crypto.Cipher forestValue109_48_0;
    int forestValue109_48_1;
    javax.crypto.SecretKeyFactory forestValue109_48_2;
    byte[] forestValue109_48_3;
    javax.crypto.Cipher spill109_0;
    int spill109_1;
    javax.crypto.SecretKeyFactory spill109_2;
    byte[] spill109_3;
    byte[] spill109_4;
    int spill109_5;
    java.lang.String spill109_6;
    long life0_11;
    javax.crypto.Cipher life2_15;
    int life3_30;
    byte[] life4_68;
    forest_join_48: {
    b = ((long)(((moom._a)(moom._c.a(((long)(6815468642846034631L)), ((long)(-5425908712303245492L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(72443710590316L)))));
    life0_11 = (com.moon.pT.b ^ 64449475854897L);
    spill109_0 = (life2_15 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill109_1 = 2;
    spill109_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp109_8_0 = new byte[8];
    spill109_3 = __stackOp109_8_0;
    (__stackOp109_8_0)[0] = ((byte) ((int) (life0_11 >>> 56)));
    life3_30 = 1;
    forestValue109_31_0 = spill109_0;
    forestValue109_31_1 = spill109_1;
    forestValue109_31_2 = spill109_2;
    forestValue109_31_3 = spill109_3;
    forest_cycle_31: while (true) {
    if (!((life3_30 < 8))) {
        forestValue109_48_0 = forestValue109_31_0;
        forestValue109_48_1 = forestValue109_31_1;
        forestValue109_48_2 = forestValue109_31_2;
        forestValue109_48_3 = forestValue109_31_3;
        break forest_join_48;
    }
    byte[] __stackOp109_9_0 = forestValue109_31_3;
    spill109_4 = __stackOp109_9_0;
    (__stackOp109_9_0)[life3_30] = ((byte) ((int) ((life0_11 << (life3_30 * 8)) >>> 56)));
    life3_30 += 1;
    forestValue109_31_3 = spill109_4;
    continue forest_cycle_31;
    }
    }
    ((javax.crypto.Cipher)(forestValue109_48_0)).init(((int)(forestValue109_48_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue109_48_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue109_48_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String __stackOp109_12_0 = "ó]9¼\fÄ%qHEÜïâ9WòÍ³ÿÀw\n5¡ÑÏ&\003R";
    int __stackOp109_12_1 = -1;
    spill109_5 = __stackOp109_12_1;
    byte[] __stackOp109_14_0 = ((java.lang.String)(__stackOp109_12_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp109_14_1 = life2_15;
    life4_68 = ((javax.crypto.Cipher)(__stackOp109_14_1)).doFinal(((byte[])(__stackOp109_14_0)));
    int __stackOp109_18_0 = spill109_5;
    java.lang.String __stackOp109_18_1 = ((java.lang.String)(com.moon.pT.a(((byte[])(life4_68))))).intern();
    spill109_6 = __stackOp109_18_1;
    recovery.source.CarrierOps.discard(__stackOp109_18_0);
    c = ((java.lang.String)(spill109_6));
}

private static native <E extends Throwable> void __sourceConstructorInit_628a95ba0efb6e5f_0(com.moon.pT a0) throws E;

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
        byte[] spill1189_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1189_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1189_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1189_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1189_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1189_2)[life4_9];
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
org.luaj.vm2.LuaValue forwardValue1190_19_0;
    org.luaj.vm2.LuaValue spill1190_0;
    long life2_3;
    int life4_5;
    java.lang.String life5_25;
    forward_join_19: {
    forward_join_18: {
    life2_3 = (com.moon.pT.b ^ 86981759261987L);
    life4_5 = com.moon.jN.c();
    spill1190_0 = p0;
    if (!((life4_5 == 0))) {
        forwardValue1190_19_0 = spill1190_0;
        break forward_join_19;
    }
    if (!((!((org.luaj.vm2.LuaValue)(spill1190_0)).isstring()))) {
        break forward_join_18;
    }
    java.lang.String __stackOp1190_5_0 = ((org.luaj.vm2.LuaValue)(p0)).typename();
    java.lang.String __stackOp1190_5_1 = com.moon.pT.c;
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_2a79a5f862bb_invokedynamic1190_6(__stackOp1190_5_1, __stackOp1190_5_0))));
    }
    forwardValue1190_19_0 = p0;
    }
    life5_25 = ((org.luaj.vm2.LuaValue)(forwardValue1190_19_0)).tojstring();
    ((com.moon.j2)(((com.moon.jT)(this.a)).c)).toggle(((java.lang.String)(life5_25)));
    return org.luaj.vm2.LuaValue.NIL;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2a79a5f862bb_invokedynamic1190_6(java.lang.String a0, java.lang.String a1) throws E;
}
