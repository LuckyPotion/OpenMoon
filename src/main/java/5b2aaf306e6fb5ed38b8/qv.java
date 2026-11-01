package com.moon;


class qv extends org.luaj.vm2.lib.OneArgFunction {

com.moon.jW a;

private static long b;

private static java.lang.String c;

qv(com.moon.jW p0) { super(); }


private static void __sourceConstructorBody_551296f27493143c(com.moon.qv receiver, com.moon.jW p0) throws Throwable {

((com.moon.qv)(receiver)).a = ((com.moon.jW)(p0));

    com.moon.qv.__sourceConstructorInit_551296f27493143c_0(((com.moon.qv)(receiver)));

    return;

}



static {
javax.crypto.Cipher forestValue244_31_0;
    int forestValue244_31_1;
    javax.crypto.SecretKeyFactory forestValue244_31_2;
    byte[] forestValue244_31_3;
    javax.crypto.Cipher forestValue244_48_0;
    int forestValue244_48_1;
    javax.crypto.SecretKeyFactory forestValue244_48_2;
    byte[] forestValue244_48_3;
    javax.crypto.Cipher spill244_0;
    int spill244_1;
    javax.crypto.SecretKeyFactory spill244_2;
    byte[] spill244_3;
    byte[] spill244_4;
    int spill244_5;
    java.lang.String spill244_6;
    long life0_11;
    javax.crypto.Cipher life2_15;
    int life3_30;
    byte[] life4_68;
    forest_join_48: {
    b = ((long)(((moom._a)(moom._c.a(((long)(9126669035116676642L)), ((long)(426003966045220004L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(138386309641732L)))));
    life0_11 = (com.moon.qv.b ^ 127422652829576L);
    spill244_0 = (life2_15 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill244_1 = 2;
    spill244_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp244_8_0 = new byte[8];
    spill244_3 = __stackOp244_8_0;
    (__stackOp244_8_0)[0] = ((byte) ((int) (life0_11 >>> 56)));
    life3_30 = 1;
    forestValue244_31_0 = spill244_0;
    forestValue244_31_1 = spill244_1;
    forestValue244_31_2 = spill244_2;
    forestValue244_31_3 = spill244_3;
    forest_cycle_31: while (true) {
    if (!((life3_30 < 8))) {
        forestValue244_48_0 = forestValue244_31_0;
        forestValue244_48_1 = forestValue244_31_1;
        forestValue244_48_2 = forestValue244_31_2;
        forestValue244_48_3 = forestValue244_31_3;
        break forest_join_48;
    }
    byte[] __stackOp244_9_0 = forestValue244_31_3;
    spill244_4 = __stackOp244_9_0;
    (__stackOp244_9_0)[life3_30] = ((byte) ((int) ((life0_11 << (life3_30 * 8)) >>> 56)));
    life3_30 += 1;
    forestValue244_31_3 = spill244_4;
    continue forest_cycle_31;
    }
    }
    ((javax.crypto.Cipher)(forestValue244_48_0)).init(((int)(forestValue244_48_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue244_48_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue244_48_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String __stackOp244_12_0 = "´\001+j»-=?\"ËÌ\004§\177ãÂn¨GfgÃ\t\025-E";
    int __stackOp244_12_1 = -1;
    spill244_5 = __stackOp244_12_1;
    byte[] __stackOp244_14_0 = ((java.lang.String)(__stackOp244_12_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp244_14_1 = life2_15;
    life4_68 = ((javax.crypto.Cipher)(__stackOp244_14_1)).doFinal(((byte[])(__stackOp244_14_0)));
    int __stackOp244_18_0 = spill244_5;
    java.lang.String __stackOp244_18_1 = ((java.lang.String)(com.moon.qv.a(((byte[])(life4_68))))).intern();
    spill244_6 = __stackOp244_18_1;
    recovery.source.CarrierOps.discard(__stackOp244_18_0);
    c = ((java.lang.String)(spill244_6));
}

private static native <E extends Throwable> void __sourceConstructorInit_551296f27493143c_0(com.moon.qv a0) throws E;

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
        byte[] spill1346_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1346_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1346_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1346_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1346_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1346_2)[life4_9];
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
org.luaj.vm2.LuaValue forwardValue1347_21_0;

    java.lang.Class forwardValue1347_21_1;

    org.luaj.vm2.LuaValue spill1347_0;

    java.lang.Class spill1347_1;

    long life2_3;

    int life4_5;

    com.moon.scripting.api.types.Vec3d life5_28;

    forward_join_21: {

    forward_join_19: {

    life2_3 = (com.moon.qv.b ^ 56988747036652L);

    life4_5 = com.moon.jN.c();

    spill1347_0 = p0;

    spill1347_1 = com.moon.scripting.api.types.Vec3d.class;

    if (!((life4_5 == 0))) {

        forwardValue1347_21_0 = spill1347_0;

        forwardValue1347_21_1 = spill1347_1;

        break forward_join_21;

    }

    if (!((!((org.luaj.vm2.LuaValue)(spill1347_0)).isuserdata(((java.lang.Class)(spill1347_1)))))) {

        break forward_join_19;

    }

    java.lang.String __stackOp1347_6_0 = ((org.luaj.vm2.LuaValue)(p0)).typename();

    java.lang.String __stackOp1347_6_1 = com.moon.qv.c;

    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_2a79a5f862bb_invokedynamic1347_7(__stackOp1347_6_1, __stackOp1347_6_0))));

    }

    forwardValue1347_21_0 = p0;

    forwardValue1347_21_1 = com.moon.scripting.api.types.Vec3d.class;

    }

    life5_28 = ((com.moon.scripting.api.types.Vec3d)(((org.luaj.vm2.LuaValue)(forwardValue1347_21_0)).touserdata(((java.lang.Class)(forwardValue1347_21_1)))));

    return com.moon.j6.a__LuaValue(((java.lang.Object)(((com.moon.j5)(((com.moon.jW)(this.a)).c)).get_block_at_vec(((com.moon.scripting.api.types.Vec3d)(life5_28))))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2a79a5f862bb_invokedynamic1347_7(java.lang.String a0, java.lang.String a1) throws E;
}
