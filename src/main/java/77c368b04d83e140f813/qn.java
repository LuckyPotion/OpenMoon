package com.moon;


class qn extends org.luaj.vm2.lib.OneArgFunction {

com.moon.jW a;

private static long b;

private static java.lang.String c;

qn(com.moon.jW p0) { super(); }


private static void __sourceConstructorBody_04f091488b1d0e47(com.moon.qn receiver, com.moon.jW p0) throws Throwable {

((com.moon.qn)(receiver)).a = ((com.moon.jW)(p0));

    com.moon.qn.__sourceConstructorInit_04f091488b1d0e47_0(((com.moon.qn)(receiver)));

    return;

}



static {
javax.crypto.Cipher forestValue228_31_0;
    int forestValue228_31_1;
    javax.crypto.SecretKeyFactory forestValue228_31_2;
    byte[] forestValue228_31_3;
    javax.crypto.Cipher forestValue228_48_0;
    int forestValue228_48_1;
    javax.crypto.SecretKeyFactory forestValue228_48_2;
    byte[] forestValue228_48_3;
    javax.crypto.Cipher spill228_0;
    int spill228_1;
    javax.crypto.SecretKeyFactory spill228_2;
    byte[] spill228_3;
    byte[] spill228_4;
    int spill228_5;
    java.lang.String spill228_6;
    long life0_11;
    javax.crypto.Cipher life2_15;
    int life3_30;
    byte[] life4_68;
    forest_join_48: {
    b = ((long)(((moom._a)(moom._c.a(((long)(-1453016454002802352L)), ((long)(-2449346418845509487L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(196287756355069L)))));
    life0_11 = (com.moon.qn.b ^ 62728300878238L);
    spill228_0 = (life2_15 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill228_1 = 2;
    spill228_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp228_8_0 = new byte[8];
    spill228_3 = __stackOp228_8_0;
    (__stackOp228_8_0)[0] = ((byte) ((int) (life0_11 >>> 56)));
    life3_30 = 1;
    forestValue228_31_0 = spill228_0;
    forestValue228_31_1 = spill228_1;
    forestValue228_31_2 = spill228_2;
    forestValue228_31_3 = spill228_3;
    forest_cycle_31: while (true) {
    if (!((life3_30 < 8))) {
        forestValue228_48_0 = forestValue228_31_0;
        forestValue228_48_1 = forestValue228_31_1;
        forestValue228_48_2 = forestValue228_31_2;
        forestValue228_48_3 = forestValue228_31_3;
        break forest_join_48;
    }
    byte[] __stackOp228_9_0 = forestValue228_31_3;
    spill228_4 = __stackOp228_9_0;
    (__stackOp228_9_0)[life3_30] = ((byte) ((int) ((life0_11 << (life3_30 * 8)) >>> 56)));
    life3_30 += 1;
    forestValue228_31_3 = spill228_4;
    continue forest_cycle_31;
    }
    }
    ((javax.crypto.Cipher)(forestValue228_48_0)).init(((int)(forestValue228_48_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue228_48_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue228_48_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String __stackOp228_12_0 = "áæ\004lMTÜ_O]Î¢ [¶é\0372\030ûûU\\2Ã¿Ã\t";
    int __stackOp228_12_1 = -1;
    spill228_5 = __stackOp228_12_1;
    byte[] __stackOp228_14_0 = ((java.lang.String)(__stackOp228_12_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp228_14_1 = life2_15;
    life4_68 = ((javax.crypto.Cipher)(__stackOp228_14_1)).doFinal(((byte[])(__stackOp228_14_0)));
    int __stackOp228_18_0 = spill228_5;
    java.lang.String __stackOp228_18_1 = ((java.lang.String)(com.moon.qn.a(((byte[])(life4_68))))).intern();
    spill228_6 = __stackOp228_18_1;
    recovery.source.CarrierOps.discard(__stackOp228_18_0);
    c = ((java.lang.String)(spill228_6));
}

private static native <E extends Throwable> void __sourceConstructorInit_04f091488b1d0e47_0(com.moon.qn a0) throws E;

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
        byte[] spill1330_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1330_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1330_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1330_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1330_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1330_2)[life4_9];
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
int forestValue187_20_0;
    boolean spill187_0;
    long life2_3;
    int life4_5;
    int life5_21;
    forest_join_20: {
    forest_join_18: {
    life2_3 = (com.moon.qn.b ^ 117184919834690L);
    life4_5 = com.moon.jN.b();
    spill187_0 = ((org.luaj.vm2.LuaValue)(p0)).isnumber();
    if (!((life4_5 != 0))) {
        forestValue187_20_0 = ((spill187_0) ? 1 : 0);
        break forest_join_20;
    }
    if (!((!spill187_0))) {
        break forest_join_18;
    }
    java.lang.String __stackOp187_6_0 = ((org.luaj.vm2.LuaValue)(p0)).typename();
    java.lang.String __stackOp187_6_1 = com.moon.qn.c;
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_2a79a5f862bb_invokedynamic187_7(__stackOp187_6_1, __stackOp187_6_0))));
    }
    forestValue187_20_0 = ((org.luaj.vm2.LuaValue)(p0)).toint();
    }
    life5_21 = forestValue187_20_0;
    return org.luaj.vm2.LuaValue.valueOf(((boolean)(((com.moon.j5)(((com.moon.jW)(this.a)).c)).is_bot(((int)(life5_21))))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2a79a5f862bb_invokedynamic187_7(java.lang.String a0, java.lang.String a1) throws E;
}
