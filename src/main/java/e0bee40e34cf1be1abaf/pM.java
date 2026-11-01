package com.moon;


class pM extends org.luaj.vm2.lib.OneArgFunction {

com.moon.jQ a;

private static long b;

private static java.lang.String c;

pM(com.moon.jQ p0) { super(); }


private static void __sourceConstructorBody_9a5a062f64417f75(com.moon.pM receiver, com.moon.jQ p0) throws Throwable {

((com.moon.pM)(receiver)).a = ((com.moon.jQ)(p0));

    com.moon.pM.__sourceConstructorInit_9a5a062f64417f75_0(((com.moon.pM)(receiver)));

    return;

}



static {
javax.crypto.Cipher forestValue95_31_0;
    int forestValue95_31_1;
    javax.crypto.SecretKeyFactory forestValue95_31_2;
    byte[] forestValue95_31_3;
    javax.crypto.Cipher forestValue95_48_0;
    int forestValue95_48_1;
    javax.crypto.SecretKeyFactory forestValue95_48_2;
    byte[] forestValue95_48_3;
    javax.crypto.Cipher spill95_0;
    int spill95_1;
    javax.crypto.SecretKeyFactory spill95_2;
    byte[] spill95_3;
    byte[] spill95_4;
    int spill95_5;
    java.lang.String spill95_6;
    long life0_11;
    javax.crypto.Cipher life2_15;
    int life3_30;
    byte[] life4_68;
    forest_join_48: {
    b = ((long)(((moom._a)(moom._c.a(((long)(-6476552328760591096L)), ((long)(-502259668713348292L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(162823618022640L)))));
    life0_11 = (com.moon.pM.b ^ 15803861770876L);
    spill95_0 = (life2_15 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill95_1 = 2;
    spill95_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp95_8_0 = new byte[8];
    spill95_3 = __stackOp95_8_0;
    (__stackOp95_8_0)[0] = ((byte) ((int) (life0_11 >>> 56)));
    life3_30 = 1;
    forestValue95_31_0 = spill95_0;
    forestValue95_31_1 = spill95_1;
    forestValue95_31_2 = spill95_2;
    forestValue95_31_3 = spill95_3;
    forest_cycle_31: while (true) {
    if (!((life3_30 < 8))) {
        forestValue95_48_0 = forestValue95_31_0;
        forestValue95_48_1 = forestValue95_31_1;
        forestValue95_48_2 = forestValue95_31_2;
        forestValue95_48_3 = forestValue95_31_3;
        break forest_join_48;
    }
    byte[] __stackOp95_9_0 = forestValue95_31_3;
    spill95_4 = __stackOp95_9_0;
    (__stackOp95_9_0)[life3_30] = ((byte) ((int) ((life0_11 << (life3_30 * 8)) >>> 56)));
    life3_30 += 1;
    forestValue95_31_3 = spill95_4;
    continue forest_cycle_31;
    }
    }
    ((javax.crypto.Cipher)(forestValue95_48_0)).init(((int)(forestValue95_48_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue95_48_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue95_48_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String __stackOp95_12_0 = "á\005=-àïÁ?\036Tm\\\0035V(­¥ÍX²$4VÐ$aÄÞ";
    int __stackOp95_12_1 = -1;
    spill95_5 = __stackOp95_12_1;
    byte[] __stackOp95_14_0 = ((java.lang.String)(__stackOp95_12_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp95_14_1 = life2_15;
    life4_68 = ((javax.crypto.Cipher)(__stackOp95_14_1)).doFinal(((byte[])(__stackOp95_14_0)));
    int __stackOp95_18_0 = spill95_5;
    java.lang.String __stackOp95_18_1 = ((java.lang.String)(com.moon.pM.a(((byte[])(life4_68))))).intern();
    spill95_6 = __stackOp95_18_1;
    recovery.source.CarrierOps.discard(__stackOp95_18_0);
    c = ((java.lang.String)(spill95_6));
}

private static native <E extends Throwable> void __sourceConstructorInit_9a5a062f64417f75_0(com.moon.pM a0) throws E;

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
        byte[] spill1175_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1175_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1175_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1175_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1175_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1175_2)[life4_9];
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
org.luaj.vm2.LuaValue forestValue100040_19_0;
    org.luaj.vm2.LuaValue spill100040_0;
    long life2_3;
    int life4_5;
    java.lang.String life5_21;
    forest_join_19: {
    forest_join_18: {
    life2_3 = (com.moon.pM.b ^ 88091315459058L);
    life4_5 = com.moon.jN.c();
    spill100040_0 = p0;
    if (!((life4_5 == 0))) {
        forestValue100040_19_0 = spill100040_0;
        break forest_join_19;
    }
    if (!((!((org.luaj.vm2.LuaValue)(spill100040_0)).isstring()))) {
        break forest_join_18;
    }
    java.lang.String __stackOp100040_5_0 = ((org.luaj.vm2.LuaValue)(p0)).typename();
    java.lang.String __stackOp100040_5_1 = com.moon.pM.c;
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_2a79a5f862bb_invokedynamic100040_6(__stackOp100040_5_1, __stackOp100040_5_0))));
    }
    forestValue100040_19_0 = p0;
    }
    life5_21 = ((org.luaj.vm2.LuaValue)(forestValue100040_19_0)).tojstring();
    return org.luaj.vm2.LuaValue.valueOf(((double)(((double) ((com.moon.jZ)(((com.moon.jQ)(this.a)).c)).minecraft_width(((java.lang.String)(life5_21)))))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2a79a5f862bb_invokedynamic100040_6(java.lang.String a0, java.lang.String a1) throws E;
}
