package com.moon;


class qp extends org.luaj.vm2.lib.OneArgFunction {

com.moon.jW a;

private static long b;

private static java.lang.String c;

qp(com.moon.jW p0) { super(); }


private static void __sourceConstructorBody_c73f8bf813040503(com.moon.qp receiver, com.moon.jW p0) throws Throwable {

((com.moon.qp)(receiver)).a = ((com.moon.jW)(p0));

    com.moon.qp.__sourceConstructorInit_c73f8bf813040503_0(((com.moon.qp)(receiver)));

    return;

}



static {
javax.crypto.Cipher forestValue232_31_0;
    int forestValue232_31_1;
    javax.crypto.SecretKeyFactory forestValue232_31_2;
    byte[] forestValue232_31_3;
    javax.crypto.Cipher forestValue232_48_0;
    int forestValue232_48_1;
    javax.crypto.SecretKeyFactory forestValue232_48_2;
    byte[] forestValue232_48_3;
    javax.crypto.Cipher spill232_0;
    int spill232_1;
    javax.crypto.SecretKeyFactory spill232_2;
    byte[] spill232_3;
    byte[] spill232_4;
    int spill232_5;
    java.lang.String spill232_6;
    long life0_11;
    javax.crypto.Cipher life2_15;
    int life3_30;
    byte[] life4_68;
    forest_join_48: {
    b = ((long)(((moom._a)(moom._c.a(((long)(-7154100649936821307L)), ((long)(-1055101639112470236L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(80147376709141L)))));
    life0_11 = (com.moon.qp.b ^ 137908971525530L);
    spill232_0 = (life2_15 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill232_1 = 2;
    spill232_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp232_8_0 = new byte[8];
    spill232_3 = __stackOp232_8_0;
    (__stackOp232_8_0)[0] = ((byte) ((int) (life0_11 >>> 56)));
    life3_30 = 1;
    forestValue232_31_0 = spill232_0;
    forestValue232_31_1 = spill232_1;
    forestValue232_31_2 = spill232_2;
    forestValue232_31_3 = spill232_3;
    forest_cycle_31: while (true) {
    if (!((life3_30 < 8))) {
        forestValue232_48_0 = forestValue232_31_0;
        forestValue232_48_1 = forestValue232_31_1;
        forestValue232_48_2 = forestValue232_31_2;
        forestValue232_48_3 = forestValue232_31_3;
        break forest_join_48;
    }
    byte[] __stackOp232_9_0 = forestValue232_31_3;
    spill232_4 = __stackOp232_9_0;
    (__stackOp232_9_0)[life3_30] = ((byte) ((int) ((life0_11 << (life3_30 * 8)) >>> 56)));
    life3_30 += 1;
    forestValue232_31_3 = spill232_4;
    continue forest_cycle_31;
    }
    }
    ((javax.crypto.Cipher)(forestValue232_48_0)).init(((int)(forestValue232_48_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue232_48_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue232_48_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String __stackOp232_12_0 = "Ö·ßíªnçìé<ø¥\0250Möá0Lï3û\001\001Ð\034_A\021j2";
    int __stackOp232_12_1 = -1;
    spill232_5 = __stackOp232_12_1;
    byte[] __stackOp232_14_0 = ((java.lang.String)(__stackOp232_12_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp232_14_1 = life2_15;
    life4_68 = ((javax.crypto.Cipher)(__stackOp232_14_1)).doFinal(((byte[])(__stackOp232_14_0)));
    int __stackOp232_18_0 = spill232_5;
    java.lang.String __stackOp232_18_1 = ((java.lang.String)(com.moon.qp.a(((byte[])(life4_68))))).intern();
    spill232_6 = __stackOp232_18_1;
    recovery.source.CarrierOps.discard(__stackOp232_18_0);
    c = ((java.lang.String)(spill232_6));
}

private static native <E extends Throwable> void __sourceConstructorInit_c73f8bf813040503_0(com.moon.qp a0) throws E;

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
        byte[] spill1334_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1334_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1334_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1334_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1334_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1334_2)[life4_9];
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
int forestValue189_20_0;
    boolean spill189_0;
    long life2_3;
    int life4_5;
    int life5_21;
    forest_join_20: {
    forest_join_18: {
    life2_3 = (com.moon.qp.b ^ 89972738456072L);
    life4_5 = com.moon.jN.c();
    spill189_0 = ((org.luaj.vm2.LuaValue)(p0)).isnumber();
    if (!((life4_5 == 0))) {
        forestValue189_20_0 = ((spill189_0) ? 1 : 0);
        break forest_join_20;
    }
    if (!((!spill189_0))) {
        break forest_join_18;
    }
    java.lang.String __stackOp189_6_0 = ((org.luaj.vm2.LuaValue)(p0)).typename();
    java.lang.String __stackOp189_6_1 = com.moon.qp.c;
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_2a79a5f862bb_invokedynamic189_7(__stackOp189_6_1, __stackOp189_6_0))));
    }
    forestValue189_20_0 = ((org.luaj.vm2.LuaValue)(p0)).toint();
    }
    life5_21 = forestValue189_20_0;
    return org.luaj.vm2.LuaValue.valueOf(((boolean)(((com.moon.j5)(((com.moon.jW)(this.a)).c)).is_friend(((int)(life5_21))))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2a79a5f862bb_invokedynamic189_7(java.lang.String a0, java.lang.String a1) throws E;
}
