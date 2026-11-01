package com.moon;


class p7 extends org.luaj.vm2.lib.OneArgFunction {

com.moon.jU a;

private static long b;

private static java.lang.String c;

p7(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_53419291eaa5ecce(com.moon.p7 receiver, com.moon.jU p0) throws Throwable {

((com.moon.p7)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.p7.__sourceConstructorInit_53419291eaa5ecce_0(((com.moon.p7)(receiver)));

    return;

}



static {
javax.crypto.Cipher forestValue79_31_0;
    int forestValue79_31_1;
    javax.crypto.SecretKeyFactory forestValue79_31_2;
    byte[] forestValue79_31_3;
    javax.crypto.Cipher forestValue79_48_0;
    int forestValue79_48_1;
    javax.crypto.SecretKeyFactory forestValue79_48_2;
    byte[] forestValue79_48_3;
    javax.crypto.Cipher spill79_0;
    int spill79_1;
    javax.crypto.SecretKeyFactory spill79_2;
    byte[] spill79_3;
    byte[] spill79_4;
    int spill79_5;
    java.lang.String spill79_6;
    long life0_11;
    javax.crypto.Cipher life2_15;
    int life3_30;
    byte[] life4_68;
    forest_join_48: {
    b = ((long)(((moom._a)(moom._c.a(((long)(-6201084418931618632L)), ((long)(-3608857478830421704L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(213581792882249L)))));
    life0_11 = (com.moon.p7.b ^ 104808449813251L);
    spill79_0 = (life2_15 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill79_1 = 2;
    spill79_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp79_8_0 = new byte[8];
    spill79_3 = __stackOp79_8_0;
    (__stackOp79_8_0)[0] = ((byte) ((int) (life0_11 >>> 56)));
    life3_30 = 1;
    forestValue79_31_0 = spill79_0;
    forestValue79_31_1 = spill79_1;
    forestValue79_31_2 = spill79_2;
    forestValue79_31_3 = spill79_3;
    forest_cycle_31: while (true) {
    if (!((life3_30 < 8))) {
        forestValue79_48_0 = forestValue79_31_0;
        forestValue79_48_1 = forestValue79_31_1;
        forestValue79_48_2 = forestValue79_31_2;
        forestValue79_48_3 = forestValue79_31_3;
        break forest_join_48;
    }
    byte[] __stackOp79_9_0 = forestValue79_31_3;
    spill79_4 = __stackOp79_9_0;
    (__stackOp79_9_0)[life3_30] = ((byte) ((int) ((life0_11 << (life3_30 * 8)) >>> 56)));
    life3_30 += 1;
    forestValue79_31_3 = spill79_4;
    continue forest_cycle_31;
    }
    }
    ((javax.crypto.Cipher)(forestValue79_48_0)).init(((int)(forestValue79_48_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue79_48_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue79_48_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String __stackOp79_12_0 = "-°)\036FYò*\000)ÉÆÂT_\004 ¾;&z}/\033ÇØ9K\030Nîw\013";
    int __stackOp79_12_1 = -1;
    spill79_5 = __stackOp79_12_1;
    byte[] __stackOp79_14_0 = ((java.lang.String)(__stackOp79_12_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp79_14_1 = life2_15;
    life4_68 = ((javax.crypto.Cipher)(__stackOp79_14_1)).doFinal(((byte[])(__stackOp79_14_0)));
    int __stackOp79_18_0 = spill79_5;
    java.lang.String __stackOp79_18_1 = ((java.lang.String)(com.moon.p7.a(((byte[])(life4_68))))).intern();
    spill79_6 = __stackOp79_18_1;
    recovery.source.CarrierOps.discard(__stackOp79_18_0);
    c = ((java.lang.String)(spill79_6));
}

private static native <E extends Throwable> void __sourceConstructorInit_53419291eaa5ecce_0(com.moon.p7 a0) throws E;

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
        byte[] spill1160_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1160_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1160_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1160_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1160_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1160_2)[life4_9];
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
org.luaj.vm2.LuaValue forwardValue1161_29_0;
    int spill1161_0;
    org.luaj.vm2.LuaValue spill1161_1;
    long life2_3;
    org.luaj.vm2.LuaValue life5_8;
    int life4_9;
    forward_join_29: {
    forward_join_22: {
    life2_3 = (com.moon.p7.b ^ 38434926985006L);
    spill1161_0 = com.moon.jN.b();
    life5_8 = ((org.luaj.vm2.LuaValue)(p0)).arg(((int)(1)));
    life4_9 = spill1161_0;
    spill1161_1 = life5_8;
    if (!((life4_9 != 0))) {
        forwardValue1161_29_0 = spill1161_1;
        break forward_join_29;
    }
    if (!((!((org.luaj.vm2.LuaValue)(spill1161_1)).isboolean()))) {
        break forward_join_22;
    }
    java.lang.String __stackOp1161_6_0 = ((org.luaj.vm2.LuaValue)(life5_8)).typename();
    java.lang.String __stackOp1161_6_1 = com.moon.p7.c;
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_2a79a5f862bb_invokedynamic1161_7(__stackOp1161_6_1, __stackOp1161_6_0))));
    }
    ((com.moon.j3)(((com.moon.jU)(this.a)).c)).set_sneaking(((boolean)(((org.luaj.vm2.LuaValue)(life5_8)).toboolean())));
    forwardValue1161_29_0 = org.luaj.vm2.LuaValue.NIL;
    }
    return forwardValue1161_29_0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2a79a5f862bb_invokedynamic1161_7(java.lang.String a0, java.lang.String a1) throws E;
}
