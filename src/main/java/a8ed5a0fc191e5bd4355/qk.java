package com.moon;


class qk extends org.luaj.vm2.lib.OneArgFunction {

com.moon.jW a;

private static long b;

private static java.lang.String c;

qk(com.moon.jW p0) { super(); }


private static void __sourceConstructorBody_1fdf3ce9e1b3e09f(com.moon.qk receiver, com.moon.jW p0) throws Throwable {

((com.moon.qk)(receiver)).a = ((com.moon.jW)(p0));

    com.moon.qk.__sourceConstructorInit_1fdf3ce9e1b3e09f_0(((com.moon.qk)(receiver)));

    return;

}



static {
javax.crypto.Cipher forestValue222_31_0;
    int forestValue222_31_1;
    javax.crypto.SecretKeyFactory forestValue222_31_2;
    byte[] forestValue222_31_3;
    javax.crypto.Cipher forestValue222_48_0;
    int forestValue222_48_1;
    javax.crypto.SecretKeyFactory forestValue222_48_2;
    byte[] forestValue222_48_3;
    javax.crypto.Cipher spill222_0;
    int spill222_1;
    javax.crypto.SecretKeyFactory spill222_2;
    byte[] spill222_3;
    byte[] spill222_4;
    int spill222_5;
    java.lang.String spill222_6;
    long life0_11;
    javax.crypto.Cipher life2_15;
    int life3_30;
    byte[] life4_68;
    forest_join_48: {
    b = ((long)(((moom._a)(moom._c.a(((long)(-963336066152748895L)), ((long)(-7092071926224463448L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(237984918788761L)))));
    life0_11 = (com.moon.qk.b ^ 120112762991155L);
    spill222_0 = (life2_15 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill222_1 = 2;
    spill222_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp222_8_0 = new byte[8];
    spill222_3 = __stackOp222_8_0;
    (__stackOp222_8_0)[0] = ((byte) ((int) (life0_11 >>> 56)));
    life3_30 = 1;
    forestValue222_31_0 = spill222_0;
    forestValue222_31_1 = spill222_1;
    forestValue222_31_2 = spill222_2;
    forestValue222_31_3 = spill222_3;
    forest_cycle_31: while (true) {
    if (!((life3_30 < 8))) {
        forestValue222_48_0 = forestValue222_31_0;
        forestValue222_48_1 = forestValue222_31_1;
        forestValue222_48_2 = forestValue222_31_2;
        forestValue222_48_3 = forestValue222_31_3;
        break forest_join_48;
    }
    byte[] __stackOp222_9_0 = forestValue222_31_3;
    spill222_4 = __stackOp222_9_0;
    (__stackOp222_9_0)[life3_30] = ((byte) ((int) ((life0_11 << (life3_30 * 8)) >>> 56)));
    life3_30 += 1;
    forestValue222_31_3 = spill222_4;
    continue forest_cycle_31;
    }
    }
    ((javax.crypto.Cipher)(forestValue222_48_0)).init(((int)(forestValue222_48_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue222_48_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue222_48_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String __stackOp222_12_0 = "wè\037³\0241çß­xù3H\006\\qåÀqVÂó\034¦Ñ|db";
    int __stackOp222_12_1 = -1;
    spill222_5 = __stackOp222_12_1;
    byte[] __stackOp222_14_0 = ((java.lang.String)(__stackOp222_12_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp222_14_1 = life2_15;
    life4_68 = ((javax.crypto.Cipher)(__stackOp222_14_1)).doFinal(((byte[])(__stackOp222_14_0)));
    int __stackOp222_18_0 = spill222_5;
    java.lang.String __stackOp222_18_1 = ((java.lang.String)(com.moon.qk.a(((byte[])(life4_68))))).intern();
    spill222_6 = __stackOp222_18_1;
    recovery.source.CarrierOps.discard(__stackOp222_18_0);
    c = ((java.lang.String)(spill222_6));
}

private static native <E extends Throwable> void __sourceConstructorInit_1fdf3ce9e1b3e09f_0(com.moon.qk a0) throws E;

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
        byte[] spill1324_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1324_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1324_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1324_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1324_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1324_2)[life4_9];
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
int forestValue100055_20_0;
    boolean spill100055_0;
    long life2_3;
    int life4_5;
    int life5_21;
    forest_join_20: {
    forest_join_18: {
    life2_3 = (com.moon.qk.b ^ 8759293105712L);
    life4_5 = com.moon.jN.b();
    spill100055_0 = ((org.luaj.vm2.LuaValue)(p0)).isnumber();
    if (!((life4_5 != 0))) {
        forestValue100055_20_0 = ((spill100055_0) ? 1 : 0);
        break forest_join_20;
    }
    if (!((!spill100055_0))) {
        break forest_join_18;
    }
    java.lang.String __stackOp100055_6_0 = ((org.luaj.vm2.LuaValue)(p0)).typename();
    java.lang.String __stackOp100055_6_1 = com.moon.qk.c;
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_2a79a5f862bb_invokedynamic100055_7(__stackOp100055_6_1, __stackOp100055_6_0))));
    }
    forestValue100055_20_0 = ((org.luaj.vm2.LuaValue)(p0)).toint();
    }
    life5_21 = forestValue100055_20_0;
    return org.luaj.vm2.LuaValue.valueOf(((double)(((double) ((com.moon.j5)(((com.moon.jW)(this.a)).c)).get_pitch(((int)(life5_21)))))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2a79a5f862bb_invokedynamic100055_7(java.lang.String a0, java.lang.String a1) throws E;
}
