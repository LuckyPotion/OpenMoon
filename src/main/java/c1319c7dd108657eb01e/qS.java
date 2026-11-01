package com.moon;


class qS extends org.luaj.vm2.lib.TwoArgFunction {

com.moon.jU a;

private static long b;

private static java.lang.String c;

qS(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_a08ee987c5f21141(com.moon.qS receiver, com.moon.jU p0) throws Throwable {

((com.moon.qS)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.qS.__sourceConstructorInit_a08ee987c5f21141_0(((com.moon.qS)(receiver)));

    return;

}



static {
javax.crypto.Cipher forestValue187_31_0;
    int forestValue187_31_1;
    javax.crypto.SecretKeyFactory forestValue187_31_2;
    byte[] forestValue187_31_3;
    javax.crypto.Cipher forestValue187_48_0;
    int forestValue187_48_1;
    javax.crypto.SecretKeyFactory forestValue187_48_2;
    byte[] forestValue187_48_3;
    javax.crypto.Cipher spill187_0;
    int spill187_1;
    javax.crypto.SecretKeyFactory spill187_2;
    byte[] spill187_3;
    byte[] spill187_4;
    int spill187_5;
    java.lang.String spill187_6;
    long life0_11;
    javax.crypto.Cipher life2_15;
    int life3_30;
    byte[] life4_68;
    forest_join_48: {
    b = ((long)(((moom._a)(moom._c.a(((long)(6697738485610135540L)), ((long)(1413721472301203825L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(94705765688060L)))));
    life0_11 = (com.moon.qS.b ^ 32496572466891L);
    spill187_0 = (life2_15 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill187_1 = 2;
    spill187_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp187_8_0 = new byte[8];
    spill187_3 = __stackOp187_8_0;
    (__stackOp187_8_0)[0] = ((byte) ((int) (life0_11 >>> 56)));
    life3_30 = 1;
    forestValue187_31_0 = spill187_0;
    forestValue187_31_1 = spill187_1;
    forestValue187_31_2 = spill187_2;
    forestValue187_31_3 = spill187_3;
    forest_cycle_31: while (true) {
    if (!((life3_30 < 8))) {
        forestValue187_48_0 = forestValue187_31_0;
        forestValue187_48_1 = forestValue187_31_1;
        forestValue187_48_2 = forestValue187_31_2;
        forestValue187_48_3 = forestValue187_31_3;
        break forest_join_48;
    }
    byte[] __stackOp187_9_0 = forestValue187_31_3;
    spill187_4 = __stackOp187_9_0;
    (__stackOp187_9_0)[life3_30] = ((byte) ((int) ((life0_11 << (life3_30 * 8)) >>> 56)));
    life3_30 += 1;
    forestValue187_31_3 = spill187_4;
    continue forest_cycle_31;
    }
    }
    ((javax.crypto.Cipher)(forestValue187_48_0)).init(((int)(forestValue187_48_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue187_48_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue187_48_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String __stackOp187_12_0 = "+EGò2Ö:Júäq\013P\026H,\031\023º©q¨&\032]U\"Y:";
    int __stackOp187_12_1 = -1;
    spill187_5 = __stackOp187_12_1;
    byte[] __stackOp187_14_0 = ((java.lang.String)(__stackOp187_12_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp187_14_1 = life2_15;
    life4_68 = ((javax.crypto.Cipher)(__stackOp187_14_1)).doFinal(((byte[])(__stackOp187_14_0)));
    int __stackOp187_18_0 = spill187_5;
    java.lang.String __stackOp187_18_1 = ((java.lang.String)(com.moon.qS.a(((byte[])(life4_68))))).intern();
    spill187_6 = __stackOp187_18_1;
    recovery.source.CarrierOps.discard(__stackOp187_18_0);
    c = ((java.lang.String)(spill187_6));
}

private static native <E extends Throwable> void __sourceConstructorInit_a08ee987c5f21141_0(com.moon.qS a0) throws E;

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
        byte[] spill1292_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1292_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1292_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1292_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1292_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1292_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public org.luaj.vm2.LuaValue call(org.luaj.vm2.LuaValue p0, org.luaj.vm2.LuaValue p1) {
org.luaj.vm2.LuaValue forwardValue1293_26_0;
    org.luaj.vm2.LuaValue forwardValue1293_36_0;
    int spill1293_0;
    org.luaj.vm2.LuaValue spill1293_1;
    org.luaj.vm2.LuaValue spill1293_2;
    long life3_3;
    org.luaj.vm2.LuaValue life6_8;
    int life5_9;
    forward_join_36: {
    forward_join_27: {
    forward_join_26: {
    forward_join_20: {
    life3_3 = (com.moon.qS.b ^ 121765467406864L);
    spill1293_0 = com.moon.jN.c();
    life6_8 = ((org.luaj.vm2.LuaValue)(p1)).arg(((int)(1)));
    life5_9 = spill1293_0;
    spill1293_1 = life6_8;
    if (!((life5_9 == 0))) {
        forwardValue1293_26_0 = spill1293_1;
        break forward_join_26;
    }
    if (!((!((org.luaj.vm2.LuaValue)(spill1293_1)).isnil()))) {
        break forward_join_20;
    }
    spill1293_2 = life6_8;
    if (!((life5_9 == 0))) {
        forwardValue1293_36_0 = spill1293_2;
        break forward_join_36;
    }
    if (!((!((org.luaj.vm2.LuaValue)(spill1293_2)).isnumber()))) {
        break forward_join_27;
    }
    }
    java.lang.String __stackOp1293_7_0 = ((org.luaj.vm2.LuaValue)(life6_8)).typename();
    java.lang.String __stackOp1293_7_1 = com.moon.qS.c;
    forwardValue1293_26_0 = org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_fc861287a8ca_invokedynamic1293_8(__stackOp1293_7_1, __stackOp1293_7_0))));
    }
    return forwardValue1293_26_0;
    }
    ((com.moon.j3)(((com.moon.jU)(this.a)).c)).set_speed(((org.luaj.vm2.LuaTable)(((org.luaj.vm2.LuaValue)(p0)).checktable())), ((double)(((org.luaj.vm2.LuaValue)(life6_8)).todouble())));
    forwardValue1293_36_0 = org.luaj.vm2.LuaValue.NIL;
    }
    return forwardValue1293_36_0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fc861287a8ca_invokedynamic1293_8(java.lang.String a0, java.lang.String a1) throws E;
}
