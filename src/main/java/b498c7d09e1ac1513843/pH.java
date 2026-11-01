package com.moon;


class pH extends org.luaj.vm2.lib.OneArgFunction {

com.moon.jP a;

private static long b;

private static java.lang.String c;

pH(com.moon.jP p0) { super(); }


private static void __sourceConstructorBody_f2e5adcdc504ab4c(com.moon.pH receiver, com.moon.jP p0) throws Throwable {

((com.moon.pH)(receiver)).a = ((com.moon.jP)(p0));

    com.moon.pH.__sourceConstructorInit_f2e5adcdc504ab4c_0(((com.moon.pH)(receiver)));

    return;

}



static {
javax.crypto.Cipher forestValue87_31_0;
    int forestValue87_31_1;
    javax.crypto.SecretKeyFactory forestValue87_31_2;
    byte[] forestValue87_31_3;
    javax.crypto.Cipher forestValue87_48_0;
    int forestValue87_48_1;
    javax.crypto.SecretKeyFactory forestValue87_48_2;
    byte[] forestValue87_48_3;
    javax.crypto.Cipher spill87_0;
    int spill87_1;
    javax.crypto.SecretKeyFactory spill87_2;
    byte[] spill87_3;
    byte[] spill87_4;
    int spill87_5;
    java.lang.String spill87_6;
    long life0_11;
    javax.crypto.Cipher life2_15;
    int life3_30;
    byte[] life4_68;
    forest_join_48: {
    b = ((long)(((moom._a)(moom._c.a(((long)(-6191989352634087878L)), ((long)(-4967286975678929139L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(229533077761233L)))));
    life0_11 = (com.moon.pH.b ^ 34847358797990L);
    spill87_0 = (life2_15 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill87_1 = 2;
    spill87_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp87_8_0 = new byte[8];
    spill87_3 = __stackOp87_8_0;
    (__stackOp87_8_0)[0] = ((byte) ((int) (life0_11 >>> 56)));
    life3_30 = 1;
    forestValue87_31_0 = spill87_0;
    forestValue87_31_1 = spill87_1;
    forestValue87_31_2 = spill87_2;
    forestValue87_31_3 = spill87_3;
    forest_cycle_31: while (true) {
    if (!((life3_30 < 8))) {
        forestValue87_48_0 = forestValue87_31_0;
        forestValue87_48_1 = forestValue87_31_1;
        forestValue87_48_2 = forestValue87_31_2;
        forestValue87_48_3 = forestValue87_31_3;
        break forest_join_48;
    }
    byte[] __stackOp87_9_0 = forestValue87_31_3;
    spill87_4 = __stackOp87_9_0;
    (__stackOp87_9_0)[life3_30] = ((byte) ((int) ((life0_11 << (life3_30 * 8)) >>> 56)));
    life3_30 += 1;
    forestValue87_31_3 = spill87_4;
    continue forest_cycle_31;
    }
    }
    ((javax.crypto.Cipher)(forestValue87_48_0)).init(((int)(forestValue87_48_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue87_48_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue87_48_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String __stackOp87_12_0 = "ÁEòmÄ4·\0258:k^úRÐQV7<55@kwl:iÏÀ®";
    int __stackOp87_12_1 = -1;
    spill87_5 = __stackOp87_12_1;
    byte[] __stackOp87_14_0 = ((java.lang.String)(__stackOp87_12_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp87_14_1 = life2_15;
    life4_68 = ((javax.crypto.Cipher)(__stackOp87_14_1)).doFinal(((byte[])(__stackOp87_14_0)));
    int __stackOp87_18_0 = spill87_5;
    java.lang.String __stackOp87_18_1 = ((java.lang.String)(com.moon.pH.a(((byte[])(life4_68))))).intern();
    spill87_6 = __stackOp87_18_1;
    recovery.source.CarrierOps.discard(__stackOp87_18_0);
    c = ((java.lang.String)(spill87_6));
}

private static native <E extends Throwable> void __sourceConstructorInit_f2e5adcdc504ab4c_0(com.moon.pH a0) throws E;

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
        byte[] spill1169_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1169_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1169_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1169_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1169_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1169_2)[life4_9];
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
org.luaj.vm2.LuaValue forwardValue1170_19_0;
    org.luaj.vm2.LuaValue spill1170_0;
    long life2_3;
    int life4_5;
    double life5_25;
    forward_join_19: {
    forward_join_18: {
    life2_3 = (com.moon.pH.b ^ 129955594352975L);
    life4_5 = com.moon.jN.b();
    spill1170_0 = p0;
    if (!((life4_5 != 0))) {
        forwardValue1170_19_0 = spill1170_0;
        break forward_join_19;
    }
    if (!((!((org.luaj.vm2.LuaValue)(spill1170_0)).isnumber()))) {
        break forward_join_18;
    }
    java.lang.String __stackOp1170_5_0 = ((org.luaj.vm2.LuaValue)(p0)).typename();
    java.lang.String __stackOp1170_5_1 = com.moon.pH.c;
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_2a79a5f862bb_invokedynamic1170_6(__stackOp1170_5_1, __stackOp1170_5_0))));
    }
    forwardValue1170_19_0 = p0;
    }
    life5_25 = ((org.luaj.vm2.LuaValue)(forwardValue1170_19_0)).todouble();
    ((com.moon.jY)(((com.moon.jP)(this.a)).c)).set_timer_speed(((double)(life5_25)));
    return org.luaj.vm2.LuaValue.NIL;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2a79a5f862bb_invokedynamic1170_6(java.lang.String a0, java.lang.String a1) throws E;
}
