package com.moon;


class qx extends org.luaj.vm2.lib.OneArgFunction {

com.moon.jW a;

private static long b;

private static java.lang.String c;

qx(com.moon.jW p0) { super(); }


private static void __sourceConstructorBody_94b7d0a2ce3bc120(com.moon.qx receiver, com.moon.jW p0) throws Throwable {

((com.moon.qx)(receiver)).a = ((com.moon.jW)(p0));

    com.moon.qx.__sourceConstructorInit_94b7d0a2ce3bc120_0(((com.moon.qx)(receiver)));

    return;

}



static {
javax.crypto.Cipher forestValue248_31_0;
    int forestValue248_31_1;
    javax.crypto.SecretKeyFactory forestValue248_31_2;
    byte[] forestValue248_31_3;
    javax.crypto.Cipher forestValue248_48_0;
    int forestValue248_48_1;
    javax.crypto.SecretKeyFactory forestValue248_48_2;
    byte[] forestValue248_48_3;
    javax.crypto.Cipher spill248_0;
    int spill248_1;
    javax.crypto.SecretKeyFactory spill248_2;
    byte[] spill248_3;
    byte[] spill248_4;
    int spill248_5;
    java.lang.String spill248_6;
    long life0_11;
    javax.crypto.Cipher life2_15;
    int life3_30;
    byte[] life4_68;
    forest_join_48: {
    b = ((long)(((moom._a)(moom._c.a(((long)(-5807884513888361956L)), ((long)(8952598633144693592L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(178695788389159L)))));
    life0_11 = (com.moon.qx.b ^ 95666998293856L);
    spill248_0 = (life2_15 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill248_1 = 2;
    spill248_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp248_8_0 = new byte[8];
    spill248_3 = __stackOp248_8_0;
    (__stackOp248_8_0)[0] = ((byte) ((int) (life0_11 >>> 56)));
    life3_30 = 1;
    forestValue248_31_0 = spill248_0;
    forestValue248_31_1 = spill248_1;
    forestValue248_31_2 = spill248_2;
    forestValue248_31_3 = spill248_3;
    forest_cycle_31: while (true) {
    if (!((life3_30 < 8))) {
        forestValue248_48_0 = forestValue248_31_0;
        forestValue248_48_1 = forestValue248_31_1;
        forestValue248_48_2 = forestValue248_31_2;
        forestValue248_48_3 = forestValue248_31_3;
        break forest_join_48;
    }
    byte[] __stackOp248_9_0 = forestValue248_31_3;
    spill248_4 = __stackOp248_9_0;
    (__stackOp248_9_0)[life3_30] = ((byte) ((int) ((life0_11 << (life3_30 * 8)) >>> 56)));
    life3_30 += 1;
    forestValue248_31_3 = spill248_4;
    continue forest_cycle_31;
    }
    }
    ((javax.crypto.Cipher)(forestValue248_48_0)).init(((int)(forestValue248_48_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue248_48_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue248_48_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String __stackOp248_12_0 = "æ³çªÚ+µÙe=dÍ\004\021\001\\\026\002o\bG£\020ª±ÛF\017";
    int __stackOp248_12_1 = -1;
    spill248_5 = __stackOp248_12_1;
    byte[] __stackOp248_14_0 = ((java.lang.String)(__stackOp248_12_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp248_14_1 = life2_15;
    life4_68 = ((javax.crypto.Cipher)(__stackOp248_14_1)).doFinal(((byte[])(__stackOp248_14_0)));
    int __stackOp248_18_0 = spill248_5;
    java.lang.String __stackOp248_18_1 = ((java.lang.String)(com.moon.qx.a(((byte[])(life4_68))))).intern();
    spill248_6 = __stackOp248_18_1;
    recovery.source.CarrierOps.discard(__stackOp248_18_0);
    c = ((java.lang.String)(spill248_6));
}

private static native <E extends Throwable> void __sourceConstructorInit_94b7d0a2ce3bc120_0(com.moon.qx a0) throws E;

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
        byte[] spill1350_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1350_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1350_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1350_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1350_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1350_2)[life4_9];
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
int forwardValue1351_20_0;
    boolean spill1351_0;
    long life2_3;
    int life4_5;
    int life5_25;
    forward_join_20: {
    forward_join_18: {
    life2_3 = (com.moon.qx.b ^ 92582264070908L);
    life4_5 = com.moon.jN.c();
    spill1351_0 = ((org.luaj.vm2.LuaValue)(p0)).isnumber();
    if (!((life4_5 == 0))) {
        forwardValue1351_20_0 = ((spill1351_0) ? 1 : 0);
        break forward_join_20;
    }
    if (!((!spill1351_0))) {
        break forward_join_18;
    }
    java.lang.String __stackOp1351_6_0 = ((org.luaj.vm2.LuaValue)(p0)).typename();
    java.lang.String __stackOp1351_6_1 = com.moon.qx.c;
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_2a79a5f862bb_invokedynamic1351_7(__stackOp1351_6_1, __stackOp1351_6_0))));
    }
    forwardValue1351_20_0 = ((org.luaj.vm2.LuaValue)(p0)).toint();
    }
    life5_25 = forwardValue1351_20_0;
    return org.luaj.vm2.lib.jse.CoerceJavaToLua.coerce(((java.lang.Object)(((com.moon.j5)(((com.moon.jW)(this.a)).c)).get_position(((int)(life5_25))))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2a79a5f862bb_invokedynamic1351_7(java.lang.String a0, java.lang.String a1) throws E;
}
