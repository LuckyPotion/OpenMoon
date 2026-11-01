package com.moon;


class p9 extends org.luaj.vm2.lib.OneArgFunction {

com.moon.jU a;

private static long b;

private static java.lang.String c;

p9(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_4df1ff400db9019c(com.moon.p9 receiver, com.moon.jU p0) throws Throwable {

((com.moon.p9)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.p9.__sourceConstructorInit_4df1ff400db9019c_0(((com.moon.p9)(receiver)));

    return;

}



static {
javax.crypto.Cipher forestValue83_31_0;
    int forestValue83_31_1;
    javax.crypto.SecretKeyFactory forestValue83_31_2;
    byte[] forestValue83_31_3;
    javax.crypto.Cipher forestValue83_48_0;
    int forestValue83_48_1;
    javax.crypto.SecretKeyFactory forestValue83_48_2;
    byte[] forestValue83_48_3;
    javax.crypto.Cipher spill83_0;
    int spill83_1;
    javax.crypto.SecretKeyFactory spill83_2;
    byte[] spill83_3;
    byte[] spill83_4;
    int spill83_5;
    java.lang.String spill83_6;
    long life0_11;
    javax.crypto.Cipher life2_15;
    int life3_30;
    byte[] life4_68;
    forest_join_48: {
    b = ((long)(((moom._a)(moom._c.a(((long)(-8792418124833644331L)), ((long)(3299686013864789944L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(64509721669119L)))));
    life0_11 = (com.moon.p9.b ^ 64806408182241L);
    spill83_0 = (life2_15 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill83_1 = 2;
    spill83_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp83_8_0 = new byte[8];
    spill83_3 = __stackOp83_8_0;
    (__stackOp83_8_0)[0] = ((byte) ((int) (life0_11 >>> 56)));
    life3_30 = 1;
    forestValue83_31_0 = spill83_0;
    forestValue83_31_1 = spill83_1;
    forestValue83_31_2 = spill83_2;
    forestValue83_31_3 = spill83_3;
    forest_cycle_31: while (true) {
    if (!((life3_30 < 8))) {
        forestValue83_48_0 = forestValue83_31_0;
        forestValue83_48_1 = forestValue83_31_1;
        forestValue83_48_2 = forestValue83_31_2;
        forestValue83_48_3 = forestValue83_31_3;
        break forest_join_48;
    }
    byte[] __stackOp83_9_0 = forestValue83_31_3;
    spill83_4 = __stackOp83_9_0;
    (__stackOp83_9_0)[life3_30] = ((byte) ((int) ((life0_11 << (life3_30 * 8)) >>> 56)));
    life3_30 += 1;
    forestValue83_31_3 = spill83_4;
    continue forest_cycle_31;
    }
    }
    ((javax.crypto.Cipher)(forestValue83_48_0)).init(((int)(forestValue83_48_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue83_48_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue83_48_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String __stackOp83_12_0 = "Qz)î,K8u×ú%ÊyHø÷\023áÂ\ta\fá\000,¥Â9";
    int __stackOp83_12_1 = -1;
    spill83_5 = __stackOp83_12_1;
    byte[] __stackOp83_14_0 = ((java.lang.String)(__stackOp83_12_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp83_14_1 = life2_15;
    life4_68 = ((javax.crypto.Cipher)(__stackOp83_14_1)).doFinal(((byte[])(__stackOp83_14_0)));
    int __stackOp83_18_0 = spill83_5;
    java.lang.String __stackOp83_18_1 = ((java.lang.String)(com.moon.p9.a(((byte[])(life4_68))))).intern();
    spill83_6 = __stackOp83_18_1;
    recovery.source.CarrierOps.discard(__stackOp83_18_0);
    c = ((java.lang.String)(spill83_6));
}

private static native <E extends Throwable> void __sourceConstructorInit_4df1ff400db9019c_0(com.moon.p9 a0) throws E;

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
        byte[] spill1164_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1164_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1164_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1164_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1164_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1164_2)[life4_9];
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
org.luaj.vm2.LuaValue forestValue100039_22_0;
    org.luaj.vm2.LuaValue spill100039_0;
    org.luaj.vm2.LuaValue spill100039_1;
    long life2_3;
    int life4_5;
    forest_join_23: {
    forest_join_22: {
    forest_join_16: {
    life2_3 = (com.moon.p9.b ^ 68851396398211L);
    life4_5 = com.moon.jN.c();
    spill100039_0 = p0;
    if (!((life4_5 == 0))) {
        forestValue100039_22_0 = spill100039_0;
        break forest_join_22;
    }
    if (!((!((org.luaj.vm2.LuaValue)(spill100039_0)).isnil()))) {
        break forest_join_16;
    }
    spill100039_1 = p0;
    if (!((life4_5 == 0))) {
        forestValue100039_22_0 = spill100039_1;
        break forest_join_22;
    }
    if (!((!((org.luaj.vm2.LuaValue)(spill100039_1)).isnumber()))) {
        break forest_join_23;
    }
    }
    java.lang.String __stackOp100039_6_0 = ((org.luaj.vm2.LuaValue)(p0)).typename();
    java.lang.String __stackOp100039_6_1 = com.moon.p9.c;
    forestValue100039_22_0 = org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_2a79a5f862bb_invokedynamic100039_7(__stackOp100039_6_1, __stackOp100039_6_0))));
    }
    return forestValue100039_22_0;
    }
    return org.luaj.vm2.LuaValue.valueOf(((double)(((com.moon.j3)(((com.moon.jU)(this.a)).c)).distance_to_entity(((int)(((org.luaj.vm2.LuaValue)(p0)).toint()))))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2a79a5f862bb_invokedynamic100039_7(java.lang.String a0, java.lang.String a1) throws E;
}
