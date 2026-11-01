package com.moon;


class p_ extends org.luaj.vm2.lib.OneArgFunction {

com.moon.jU a;

private static long b;

private static java.lang.String c;

p_(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_e7321aa80c358f18(com.moon.p_ receiver, com.moon.jU p0) throws Throwable {

((com.moon.p_)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.p_.__sourceConstructorInit_e7321aa80c358f18_0(((com.moon.p_)(receiver)));

    return;

}



static {
javax.crypto.Cipher forestValue123_31_0;
    int forestValue123_31_1;
    javax.crypto.SecretKeyFactory forestValue123_31_2;
    byte[] forestValue123_31_3;
    javax.crypto.Cipher forestValue123_48_0;
    int forestValue123_48_1;
    javax.crypto.SecretKeyFactory forestValue123_48_2;
    byte[] forestValue123_48_3;
    javax.crypto.Cipher spill123_0;
    int spill123_1;
    javax.crypto.SecretKeyFactory spill123_2;
    byte[] spill123_3;
    byte[] spill123_4;
    int spill123_5;
    java.lang.String spill123_6;
    long life0_11;
    javax.crypto.Cipher life2_15;
    int life3_30;
    byte[] life4_68;
    forest_join_48: {
    b = ((long)(((moom._a)(moom._c.a(((long)(4852834484526883252L)), ((long)(-6715899997782889007L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(224324888228843L)))));
    life0_11 = (com.moon.p_.b ^ 6856399963616L);
    spill123_0 = (life2_15 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill123_1 = 2;
    spill123_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp123_8_0 = new byte[8];
    spill123_3 = __stackOp123_8_0;
    (__stackOp123_8_0)[0] = ((byte) ((int) (life0_11 >>> 56)));
    life3_30 = 1;
    forestValue123_31_0 = spill123_0;
    forestValue123_31_1 = spill123_1;
    forestValue123_31_2 = spill123_2;
    forestValue123_31_3 = spill123_3;
    forest_cycle_31: while (true) {
    if (!((life3_30 < 8))) {
        forestValue123_48_0 = forestValue123_31_0;
        forestValue123_48_1 = forestValue123_31_1;
        forestValue123_48_2 = forestValue123_31_2;
        forestValue123_48_3 = forestValue123_31_3;
        break forest_join_48;
    }
    byte[] __stackOp123_9_0 = forestValue123_31_3;
    spill123_4 = __stackOp123_9_0;
    (__stackOp123_9_0)[life3_30] = ((byte) ((int) ((life0_11 << (life3_30 * 8)) >>> 56)));
    life3_30 += 1;
    forestValue123_31_3 = spill123_4;
    continue forest_cycle_31;
    }
    }
    ((javax.crypto.Cipher)(forestValue123_48_0)).init(((int)(forestValue123_48_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue123_48_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue123_48_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String __stackOp123_12_0 = "l§¤üy]([\000S\033¡n\024¦\037§ TÏ`ß\\J÷7Ô";
    int __stackOp123_12_1 = -1;
    spill123_5 = __stackOp123_12_1;
    byte[] __stackOp123_14_0 = ((java.lang.String)(__stackOp123_12_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp123_14_1 = life2_15;
    life4_68 = ((javax.crypto.Cipher)(__stackOp123_14_1)).doFinal(((byte[])(__stackOp123_14_0)));
    int __stackOp123_18_0 = spill123_5;
    java.lang.String __stackOp123_18_1 = ((java.lang.String)(com.moon.p_.a(((byte[])(life4_68))))).intern();
    spill123_6 = __stackOp123_18_1;
    recovery.source.CarrierOps.discard(__stackOp123_18_0);
    c = ((java.lang.String)(spill123_6));
}

private static native <E extends Throwable> void __sourceConstructorInit_e7321aa80c358f18_0(com.moon.p_ a0) throws E;

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
        byte[] spill1203_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1203_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1203_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1203_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1203_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1203_2)[life4_9];
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
org.luaj.vm2.LuaValue forwardValue1204_23_0;
    org.luaj.vm2.LuaValue forwardValue1204_33_0;
    org.luaj.vm2.LuaValue spill1204_0;
    org.luaj.vm2.LuaValue spill1204_1;
    long life2_3;
    int life4_5;
    forward_join_33: {
    forward_join_24: {
    forward_join_23: {
    forward_join_17: {
    life2_3 = (com.moon.p_.b ^ 96680804363901L);
    life4_5 = com.moon.jN.b();
    spill1204_0 = p0;
    if (!((life4_5 != 0))) {
        forwardValue1204_23_0 = spill1204_0;
        break forward_join_23;
    }
    if (!((!((org.luaj.vm2.LuaValue)(spill1204_0)).isnil()))) {
        break forward_join_17;
    }
    spill1204_1 = p0;
    if (!((life4_5 != 0))) {
        forwardValue1204_33_0 = spill1204_1;
        break forward_join_33;
    }
    if (!((!((org.luaj.vm2.LuaValue)(spill1204_1)).isuserdata(((java.lang.Class)(com.moon.scripting.api.types.Vec3d.class)))))) {
        break forward_join_24;
    }
    }
    java.lang.String __stackOp1204_7_0 = ((org.luaj.vm2.LuaValue)(p0)).typename();
    java.lang.String __stackOp1204_7_1 = com.moon.p_.c;
    forwardValue1204_23_0 = org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_2a79a5f862bb_invokedynamic1204_8(__stackOp1204_7_1, __stackOp1204_7_0))));
    }
    return forwardValue1204_23_0;
    }
    forwardValue1204_33_0 = org.luaj.vm2.lib.jse.CoerceJavaToLua.coerce(((java.lang.Object)(((com.moon.j3)(((com.moon.jU)(this.a)).c)).rotations_to(((com.moon.scripting.api.types.Vec3d)(((com.moon.scripting.api.types.Vec3d)(((org.luaj.vm2.LuaValue)(p0)).touserdata(((java.lang.Class)(com.moon.scripting.api.types.Vec3d.class)))))))))));
    }
    return forwardValue1204_33_0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2a79a5f862bb_invokedynamic1204_8(java.lang.String a0, java.lang.String a1) throws E;
}
