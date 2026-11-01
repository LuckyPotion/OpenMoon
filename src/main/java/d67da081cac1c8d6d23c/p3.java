package com.moon;


class p3 extends org.luaj.vm2.lib.OneArgFunction {

com.moon.jU a;

private static long b;

private static java.lang.String c;

p3(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_e4d768296de67da6(com.moon.p3 receiver, com.moon.jU p0) throws Throwable {

((com.moon.p3)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.p3.__sourceConstructorInit_e4d768296de67da6_0(((com.moon.p3)(receiver)));

    return;

}



static {
javax.crypto.Cipher forestValue71_31_0;
    int forestValue71_31_1;
    javax.crypto.SecretKeyFactory forestValue71_31_2;
    byte[] forestValue71_31_3;
    javax.crypto.Cipher forestValue71_48_0;
    int forestValue71_48_1;
    javax.crypto.SecretKeyFactory forestValue71_48_2;
    byte[] forestValue71_48_3;
    javax.crypto.Cipher spill71_0;
    int spill71_1;
    javax.crypto.SecretKeyFactory spill71_2;
    byte[] spill71_3;
    byte[] spill71_4;
    int spill71_5;
    java.lang.String spill71_6;
    long life0_11;
    javax.crypto.Cipher life2_15;
    int life3_30;
    byte[] life4_68;
    forest_join_48: {
    b = ((long)(((moom._a)(moom._c.a(((long)(389132633017549118L)), ((long)(3508352839229781176L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(171444867264693L)))));
    life0_11 = (com.moon.p3.b ^ 54061194567793L);
    spill71_0 = (life2_15 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill71_1 = 2;
    spill71_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp71_8_0 = new byte[8];
    spill71_3 = __stackOp71_8_0;
    (__stackOp71_8_0)[0] = ((byte) ((int) (life0_11 >>> 56)));
    life3_30 = 1;
    forestValue71_31_0 = spill71_0;
    forestValue71_31_1 = spill71_1;
    forestValue71_31_2 = spill71_2;
    forestValue71_31_3 = spill71_3;
    forest_cycle_31: while (true) {
    if (!((life3_30 < 8))) {
        forestValue71_48_0 = forestValue71_31_0;
        forestValue71_48_1 = forestValue71_31_1;
        forestValue71_48_2 = forestValue71_31_2;
        forestValue71_48_3 = forestValue71_31_3;
        break forest_join_48;
    }
    byte[] __stackOp71_9_0 = forestValue71_31_3;
    spill71_4 = __stackOp71_9_0;
    (__stackOp71_9_0)[life3_30] = ((byte) ((int) ((life0_11 << (life3_30 * 8)) >>> 56)));
    life3_30 += 1;
    forestValue71_31_3 = spill71_4;
    continue forest_cycle_31;
    }
    }
    ((javax.crypto.Cipher)(forestValue71_48_0)).init(((int)(forestValue71_48_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue71_48_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue71_48_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String __stackOp71_12_0 = "èc¼÷k\037àoi\0363¼7Æ®³f-dÜ[+µ\035{¨\n<Ì";
    int __stackOp71_12_1 = -1;
    spill71_5 = __stackOp71_12_1;
    byte[] __stackOp71_14_0 = ((java.lang.String)(__stackOp71_12_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp71_14_1 = life2_15;
    life4_68 = ((javax.crypto.Cipher)(__stackOp71_14_1)).doFinal(((byte[])(__stackOp71_14_0)));
    int __stackOp71_18_0 = spill71_5;
    java.lang.String __stackOp71_18_1 = ((java.lang.String)(com.moon.p3.a(((byte[])(life4_68))))).intern();
    spill71_6 = __stackOp71_18_1;
    recovery.source.CarrierOps.discard(__stackOp71_18_0);
    c = ((java.lang.String)(spill71_6));
}

private static native <E extends Throwable> void __sourceConstructorInit_e4d768296de67da6_0(com.moon.p3 a0) throws E;

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
        byte[] spill1152_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1152_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1152_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1152_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1152_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1152_2)[life4_9];
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
org.luaj.vm2.LuaValue forwardValue1153_26_0;
    org.luaj.vm2.LuaValue forwardValue1153_34_0;
    int spill1153_0;
    org.luaj.vm2.LuaValue spill1153_1;
    org.luaj.vm2.LuaValue spill1153_2;
    long life2_3;
    org.luaj.vm2.LuaValue life5_8;
    int life4_9;
    forward_join_34: {
    forward_join_27: {
    forward_join_26: {
    forward_join_20: {
    life2_3 = (com.moon.p3.b ^ 132045148658972L);
    spill1153_0 = com.moon.jN.b();
    life5_8 = ((org.luaj.vm2.LuaValue)(p0)).arg(((int)(1)));
    life4_9 = spill1153_0;
    spill1153_1 = life5_8;
    if (!((life4_9 != 0))) {
        forwardValue1153_26_0 = spill1153_1;
        break forward_join_26;
    }
    if (!((!((org.luaj.vm2.LuaValue)(spill1153_1)).isnil()))) {
        break forward_join_20;
    }
    spill1153_2 = life5_8;
    if (!((life4_9 != 0))) {
        forwardValue1153_34_0 = spill1153_2;
        break forward_join_34;
    }
    if (!((!((org.luaj.vm2.LuaValue)(spill1153_2)).isnumber()))) {
        break forward_join_27;
    }
    }
    java.lang.String __stackOp1153_7_0 = ((org.luaj.vm2.LuaValue)(life5_8)).typename();
    java.lang.String __stackOp1153_7_1 = com.moon.p3.c;
    forwardValue1153_26_0 = org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_2a79a5f862bb_invokedynamic1153_8(__stackOp1153_7_1, __stackOp1153_7_0))));
    }
    return forwardValue1153_26_0;
    }
    ((com.moon.j3)(((com.moon.jU)(this.a)).c)).set_motion_z(((double)(((org.luaj.vm2.LuaValue)(life5_8)).todouble())));
    forwardValue1153_34_0 = org.luaj.vm2.LuaValue.NIL;
    }
    return forwardValue1153_34_0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2a79a5f862bb_invokedynamic1153_8(java.lang.String a0, java.lang.String a1) throws E;
}
