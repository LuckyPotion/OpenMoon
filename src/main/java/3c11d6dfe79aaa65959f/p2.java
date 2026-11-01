package com.moon;


class p2 extends org.luaj.vm2.lib.OneArgFunction {

com.moon.jU a;

private static long b;

private static java.lang.String c;

p2(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_a91dce5b80f56e53(com.moon.p2 receiver, com.moon.jU p0) throws Throwable {

((com.moon.p2)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.p2.__sourceConstructorInit_a91dce5b80f56e53_0(((com.moon.p2)(receiver)));

    return;

}



static {
javax.crypto.Cipher forestValue69_31_0;
    int forestValue69_31_1;
    javax.crypto.SecretKeyFactory forestValue69_31_2;
    byte[] forestValue69_31_3;
    javax.crypto.Cipher forestValue69_48_0;
    int forestValue69_48_1;
    javax.crypto.SecretKeyFactory forestValue69_48_2;
    byte[] forestValue69_48_3;
    javax.crypto.Cipher spill69_0;
    int spill69_1;
    javax.crypto.SecretKeyFactory spill69_2;
    byte[] spill69_3;
    byte[] spill69_4;
    int spill69_5;
    java.lang.String spill69_6;
    long life0_11;
    javax.crypto.Cipher life2_15;
    int life3_30;
    byte[] life4_68;
    forest_join_48: {
    b = ((long)(((moom._a)(moom._c.a(((long)(-7321167211294491022L)), ((long)(8911989261514217585L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(247251819906106L)))));
    life0_11 = (com.moon.p2.b ^ 93469485717077L);
    spill69_0 = (life2_15 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill69_1 = 2;
    spill69_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp69_8_0 = new byte[8];
    spill69_3 = __stackOp69_8_0;
    (__stackOp69_8_0)[0] = ((byte) ((int) (life0_11 >>> 56)));
    life3_30 = 1;
    forestValue69_31_0 = spill69_0;
    forestValue69_31_1 = spill69_1;
    forestValue69_31_2 = spill69_2;
    forestValue69_31_3 = spill69_3;
    forest_cycle_31: while (true) {
    if (!((life3_30 < 8))) {
        forestValue69_48_0 = forestValue69_31_0;
        forestValue69_48_1 = forestValue69_31_1;
        forestValue69_48_2 = forestValue69_31_2;
        forestValue69_48_3 = forestValue69_31_3;
        break forest_join_48;
    }
    byte[] __stackOp69_9_0 = forestValue69_31_3;
    spill69_4 = __stackOp69_9_0;
    (__stackOp69_9_0)[life3_30] = ((byte) ((int) ((life0_11 << (life3_30 * 8)) >>> 56)));
    life3_30 += 1;
    forestValue69_31_3 = spill69_4;
    continue forest_cycle_31;
    }
    }
    ((javax.crypto.Cipher)(forestValue69_48_0)).init(((int)(forestValue69_48_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue69_48_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue69_48_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String __stackOp69_12_0 = "\004é\017\fG- ®ÏãÅ¯\t\025¯ç\030c\017ÓØ[Ý Î>%´0";
    int __stackOp69_12_1 = -1;
    spill69_5 = __stackOp69_12_1;
    byte[] __stackOp69_14_0 = ((java.lang.String)(__stackOp69_12_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp69_14_1 = life2_15;
    life4_68 = ((javax.crypto.Cipher)(__stackOp69_14_1)).doFinal(((byte[])(__stackOp69_14_0)));
    int __stackOp69_18_0 = spill69_5;
    java.lang.String __stackOp69_18_1 = ((java.lang.String)(com.moon.p2.a(((byte[])(life4_68))))).intern();
    spill69_6 = __stackOp69_18_1;
    recovery.source.CarrierOps.discard(__stackOp69_18_0);
    c = ((java.lang.String)(spill69_6));
}

private static native <E extends Throwable> void __sourceConstructorInit_a91dce5b80f56e53_0(com.moon.p2 a0) throws E;

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
        byte[] spill1150_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1150_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1150_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1150_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1150_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1150_2)[life4_9];
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
org.luaj.vm2.LuaValue forwardValue1151_26_0;
    org.luaj.vm2.LuaValue forwardValue1151_34_0;
    int spill1151_0;
    org.luaj.vm2.LuaValue spill1151_1;
    org.luaj.vm2.LuaValue spill1151_2;
    long life2_3;
    org.luaj.vm2.LuaValue life5_8;
    int life4_9;
    forward_join_34: {
    forward_join_27: {
    forward_join_26: {
    forward_join_20: {
    life2_3 = (com.moon.p2.b ^ 102056244106612L);
    spill1151_0 = com.moon.jN.b();
    life5_8 = ((org.luaj.vm2.LuaValue)(p0)).arg(((int)(1)));
    life4_9 = spill1151_0;
    spill1151_1 = life5_8;
    if (!((life4_9 != 0))) {
        forwardValue1151_26_0 = spill1151_1;
        break forward_join_26;
    }
    if (!((!((org.luaj.vm2.LuaValue)(spill1151_1)).isnil()))) {
        break forward_join_20;
    }
    spill1151_2 = life5_8;
    if (!((life4_9 != 0))) {
        forwardValue1151_34_0 = spill1151_2;
        break forward_join_34;
    }
    if (!((!((org.luaj.vm2.LuaValue)(spill1151_2)).isnumber()))) {
        break forward_join_27;
    }
    }
    java.lang.String __stackOp1151_7_0 = ((org.luaj.vm2.LuaValue)(life5_8)).typename();
    java.lang.String __stackOp1151_7_1 = com.moon.p2.c;
    forwardValue1151_26_0 = org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_2a79a5f862bb_invokedynamic1151_8(__stackOp1151_7_1, __stackOp1151_7_0))));
    }
    return forwardValue1151_26_0;
    }
    ((com.moon.j3)(((com.moon.jU)(this.a)).c)).set_motion_y(((double)(((org.luaj.vm2.LuaValue)(life5_8)).todouble())));
    forwardValue1151_34_0 = org.luaj.vm2.LuaValue.NIL;
    }
    return forwardValue1151_34_0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2a79a5f862bb_invokedynamic1151_8(java.lang.String a0, java.lang.String a1) throws E;
}
