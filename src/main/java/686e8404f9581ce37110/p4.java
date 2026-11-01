package com.moon;


class p4 extends org.luaj.vm2.lib.OneArgFunction {

com.moon.jU a;

private static long b;

private static java.lang.String c;

p4(com.moon.jU p0) { super(); }


private static void __sourceConstructorBody_a53500b44482ff47(com.moon.p4 receiver, com.moon.jU p0) throws Throwable {

((com.moon.p4)(receiver)).a = ((com.moon.jU)(p0));

    com.moon.p4.__sourceConstructorInit_a53500b44482ff47_0(((com.moon.p4)(receiver)));

    return;

}



static {
javax.crypto.Cipher forestValue73_31_0;
    int forestValue73_31_1;
    javax.crypto.SecretKeyFactory forestValue73_31_2;
    byte[] forestValue73_31_3;
    javax.crypto.Cipher forestValue73_48_0;
    int forestValue73_48_1;
    javax.crypto.SecretKeyFactory forestValue73_48_2;
    byte[] forestValue73_48_3;
    javax.crypto.Cipher spill73_0;
    int spill73_1;
    javax.crypto.SecretKeyFactory spill73_2;
    byte[] spill73_3;
    byte[] spill73_4;
    int spill73_5;
    java.lang.String spill73_6;
    long life0_11;
    javax.crypto.Cipher life2_15;
    int life3_30;
    byte[] life4_68;
    forest_join_48: {
    b = ((long)(((moom._a)(moom._c.a(((long)(861623170420469396L)), ((long)(-6132834208571030168L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(279633976794309L)))));
    life0_11 = (com.moon.p4.b ^ 2342811275797L);
    spill73_0 = (life2_15 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill73_1 = 2;
    spill73_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp73_8_0 = new byte[8];
    spill73_3 = __stackOp73_8_0;
    (__stackOp73_8_0)[0] = ((byte) ((int) (life0_11 >>> 56)));
    life3_30 = 1;
    forestValue73_31_0 = spill73_0;
    forestValue73_31_1 = spill73_1;
    forestValue73_31_2 = spill73_2;
    forestValue73_31_3 = spill73_3;
    forest_cycle_31: while (true) {
    if (!((life3_30 < 8))) {
        forestValue73_48_0 = forestValue73_31_0;
        forestValue73_48_1 = forestValue73_31_1;
        forestValue73_48_2 = forestValue73_31_2;
        forestValue73_48_3 = forestValue73_31_3;
        break forest_join_48;
    }
    byte[] __stackOp73_9_0 = forestValue73_31_3;
    spill73_4 = __stackOp73_9_0;
    (__stackOp73_9_0)[life3_30] = ((byte) ((int) ((life0_11 << (life3_30 * 8)) >>> 56)));
    life3_30 += 1;
    forestValue73_31_3 = spill73_4;
    continue forest_cycle_31;
    }
    }
    ((javax.crypto.Cipher)(forestValue73_48_0)).init(((int)(forestValue73_48_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue73_48_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue73_48_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String __stackOp73_12_0 = "¤\032\001ÞZñ6\023¡Ç÷\tÿe¦áSg¬ÓÁ^n¦a$Ç\001";
    int __stackOp73_12_1 = -1;
    spill73_5 = __stackOp73_12_1;
    byte[] __stackOp73_14_0 = ((java.lang.String)(__stackOp73_12_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp73_14_1 = life2_15;
    life4_68 = ((javax.crypto.Cipher)(__stackOp73_14_1)).doFinal(((byte[])(__stackOp73_14_0)));
    int __stackOp73_18_0 = spill73_5;
    java.lang.String __stackOp73_18_1 = ((java.lang.String)(com.moon.p4.a(((byte[])(life4_68))))).intern();
    spill73_6 = __stackOp73_18_1;
    recovery.source.CarrierOps.discard(__stackOp73_18_0);
    c = ((java.lang.String)(spill73_6));
}

private static native <E extends Throwable> void __sourceConstructorInit_a53500b44482ff47_0(com.moon.p4 a0) throws E;

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
        byte[] spill1154_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1154_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1154_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1154_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1154_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1154_2)[life4_9];
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
org.luaj.vm2.LuaValue forwardValue1155_27_0;
    org.luaj.vm2.LuaValue forwardValue1155_37_0;
    int spill1155_0;
    org.luaj.vm2.LuaValue spill1155_1;
    org.luaj.vm2.LuaValue spill1155_2;
    long life2_3;
    org.luaj.vm2.LuaValue life5_8;
    int life4_9;
    forward_join_37: {
    forward_join_28: {
    forward_join_27: {
    forward_join_21: {
    life2_3 = (com.moon.p4.b ^ 76084118564638L);
    spill1155_0 = com.moon.jN.c();
    life5_8 = ((org.luaj.vm2.LuaValue)(p0)).arg(((int)(1)));
    life4_9 = spill1155_0;
    spill1155_1 = life5_8;
    if (!((life4_9 == 0))) {
        forwardValue1155_27_0 = spill1155_1;
        break forward_join_27;
    }
    if (!((!((org.luaj.vm2.LuaValue)(spill1155_1)).isnil()))) {
        break forward_join_21;
    }
    spill1155_2 = life5_8;
    if (!((life4_9 == 0))) {
        forwardValue1155_37_0 = spill1155_2;
        break forward_join_37;
    }
    if (!((!((org.luaj.vm2.LuaValue)(spill1155_2)).isuserdata(((java.lang.Class)(com.moon.scripting.api.types.Vec3d.class)))))) {
        break forward_join_28;
    }
    }
    java.lang.String __stackOp1155_8_0 = ((org.luaj.vm2.LuaValue)(life5_8)).typename();
    java.lang.String __stackOp1155_8_1 = com.moon.p4.c;
    forwardValue1155_27_0 = org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_2a79a5f862bb_invokedynamic1155_9(__stackOp1155_8_1, __stackOp1155_8_0))));
    }
    return forwardValue1155_27_0;
    }
    ((com.moon.j3)(((com.moon.jU)(this.a)).c)).set_motion(((com.moon.scripting.api.types.Vec3d)(((com.moon.scripting.api.types.Vec3d)(((org.luaj.vm2.LuaValue)(life5_8)).touserdata(((java.lang.Class)(com.moon.scripting.api.types.Vec3d.class))))))));
    forwardValue1155_37_0 = org.luaj.vm2.LuaValue.NIL;
    }
    return forwardValue1155_37_0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2a79a5f862bb_invokedynamic1155_9(java.lang.String a0, java.lang.String a1) throws E;
}
