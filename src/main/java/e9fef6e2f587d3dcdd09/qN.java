package com.moon;


class qN extends org.luaj.vm2.lib.ThreeArgFunction {

com.moon.jW a;

private static long b;

private static java.lang.String[] c;

private static java.lang.String[] d;

private static java.util.Map e;

qN(com.moon.jW p0) { super(); }

private static void __sourceConstructorBody_34c6c4b39e1ad6fd(com.moon.qN receiver, com.moon.jW p0) throws Throwable {
((com.moon.qN)(receiver)).a = ((com.moon.jW)(p0));
    com.moon.qN.__sourceConstructorInit_34c6c4b39e1ad6fd_0(((com.moon.qN)(receiver)));
    return;
}


static {
javax.crypto.Cipher forestValue177_36_0;
    int forestValue177_36_1;
    javax.crypto.SecretKeyFactory forestValue177_36_2;
    byte[] forestValue177_36_3;
    javax.crypto.Cipher forestValue177_53_0;
    int forestValue177_53_1;
    javax.crypto.SecretKeyFactory forestValue177_53_2;
    byte[] forestValue177_53_3;
    javax.crypto.Cipher spill177_0;
    int spill177_1;
    javax.crypto.SecretKeyFactory spill177_2;
    byte[] spill177_3;
    byte[] spill177_4;
    java.lang.String spill177_5;
    int spill177_6;
    java.lang.String spill177_7;
    java.lang.String[] spill177_8;
    long life0_16;
    javax.crypto.Cipher life2_20;
    int life3_35;
    java.lang.String[] life9_66;
    int life7_68;
    java.lang.String life6_71;
    int life8_73;
    int life5_75;
    int life4_77;
    byte[] life10_93;
    forest_join_116: {
    forest_join_53: {
    b = ((long)(((moom._a)(moom._c.a(((long)(3232119833336298557L)), ((long)(-7211236726540302531L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(235288219340104L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    life0_16 = (com.moon.qN.b ^ 51083950943457L);
    spill177_0 = (life2_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill177_1 = 2;
    spill177_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp177_9_0 = new byte[8];
    spill177_3 = __stackOp177_9_0;
    (__stackOp177_9_0)[0] = ((byte) ((int) (life0_16 >>> 56)));
    life3_35 = 1;
    forestValue177_36_0 = spill177_0;
    forestValue177_36_1 = spill177_1;
    forestValue177_36_2 = spill177_2;
    forestValue177_36_3 = spill177_3;
    forest_cycle_36: while (true) {
    if (!((life3_35 < 8))) {
        forestValue177_53_0 = forestValue177_36_0;
        forestValue177_53_1 = forestValue177_36_1;
        forestValue177_53_2 = forestValue177_36_2;
        forestValue177_53_3 = forestValue177_36_3;
        break forest_join_53;
    }
    byte[] __stackOp177_10_0 = forestValue177_36_3;
    spill177_4 = __stackOp177_10_0;
    (__stackOp177_10_0)[life3_35] = ((byte) ((int) ((life0_16 << (life3_35 * 8)) >>> 56)));
    life3_35 += 1;
    forestValue177_36_3 = spill177_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue177_53_0)).init(((int)(forestValue177_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue177_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue177_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life9_66 = new java.lang.String[3];
    life7_68 = 0;
    life8_73 = ((java.lang.String)((life6_71 = "î¼Bù¸\bÇG+¯9b;2\025Aá1ÏC@L\037eãFÙ\rë¦®Ùl ÿèí´ðí­.øÄ\034*0KÇß¥`IKÏh.-'\b¾5irïï²È+qxõ<Ý\r¿¢C¨¤SÿÃÖí\0278\021\râ32ø+Úøì*¶ÿÚY\r\035\000¨P»\026¾y\\\005ï\006ça\037\017§û\016þY\016hXý\024\000Gõt0(o_r"))).length();
    life5_75 = 56;
    life4_77 = -1;
    forest_cycle_78: while (true) {
    life4_77 += 1;
    spill177_5 = life6_71;
    int __stackOp177_14_0 = life4_77;
    java.lang.String __stackOp177_16_0 = ((java.lang.String)(spill177_5)).substring(((int)(__stackOp177_14_0)), ((int)((__stackOp177_14_0 + life5_75))));
    int __stackOp177_16_1 = -1;
    spill177_6 = __stackOp177_16_1;
    byte[] __stackOp177_18_0 = ((java.lang.String)(__stackOp177_16_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp177_18_1 = life2_20;
    life10_93 = ((javax.crypto.Cipher)(__stackOp177_18_1)).doFinal(((byte[])(__stackOp177_18_0)));
    int __stackOp177_22_0 = spill177_6;
    java.lang.String __stackOp177_22_1 = ((java.lang.String)(com.moon.qN.a(((byte[])(life10_93))))).intern();
    spill177_7 = __stackOp177_22_1;
    recovery.source.CarrierOps.discard(__stackOp177_22_0);
    java.lang.String __stackOp177_24_0 = spill177_7;
    java.lang.String[] __stackOp177_24_1 = life9_66;
    spill177_8 = __stackOp177_24_1;
    java.lang.String __stackOp177_25_0 = __stackOp177_24_0;
    int __stackOp177_25_1 = (life7_68++);
    (spill177_8)[__stackOp177_25_1] = __stackOp177_25_0;
    if (!(((life4_77 = (life4_77 + life5_75)) < life8_73))) {
        break forest_join_116;
    }
    life5_75 = ((int)(((java.lang.String)(life6_71)).charAt(((int)(life4_77)))));
    continue forest_cycle_78;
    }
    }
    c = ((java.lang.String[])(life9_66));
    d = ((java.lang.String[])(new java.lang.String[3]));
}

private static native <E extends Throwable> void __sourceConstructorInit_34c6c4b39e1ad6fd_0(com.moon.qN a0) throws E;
private static native <E extends Throwable> java.lang.String __sourceHandlerCall_4fc14ea1ea0cb5adf51e(int a0, long a1) throws E;
private static final class __SourceHandler_4fc14ea1ea0cb5adf51e {

public static java.lang.String f157(int p0, long p1) throws Throwable {
    int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 8730);
    if (((__fieldRead157_0())[life5_8] == null)) {
        life3_16 = __call157_3(__call157_2(__call157_1()));
        life4_21 = __cast157_6(__call157_5(__fieldRead157_4(), life3_16));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = __call157_7("DES/CBC/PKCS5Padding");
        (life4_21)[1] = __call157_8("DES");
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        __call157_10(__fieldRead157_9(), life3_16, life4_21);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_63: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = __call157_12(__cast157_11((life4_21)[1]), life7_92);
        __call157_15(__cast157_13((life4_21)[0]), 2, life8_99, __cast157_14((life4_21)[2]));
        life9_116 = __call157_17((__fieldRead157_16())[life5_8], "ISO-8859-1");
        (__fieldRead157_18())[life5_8] = __call157_21(__call157_20(__cast157_19((life4_21)[0]), life9_116));
    }
    return (__fieldRead157_22())[life5_8];
}
public static java.lang.String h157_0(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    throw new java.lang.RuntimeException("com/moon/qN", local1);
}
private static native java.lang.String[] __fieldRead157_0() throws Throwable;
private static native java.lang.Thread __call157_1() throws Throwable;
private static native long __call157_2(java.lang.Thread a0) throws Throwable;
private static native java.lang.Long __call157_3(long a0) throws Throwable;
private static native java.util.Map __fieldRead157_4() throws Throwable;
private static native java.lang.Object __call157_5(java.util.Map a0, java.lang.Long a1) throws Throwable;
private static native java.lang.Object[] __cast157_6(java.lang.Object a0) throws Throwable;
private static native javax.crypto.Cipher __call157_7(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call157_8(java.lang.String a0) throws Throwable;
private static native java.util.Map __fieldRead157_9() throws Throwable;
private static native java.lang.Object __call157_10(java.util.Map a0, java.lang.Long a1, java.lang.Object[] a2) throws Throwable;
private static native javax.crypto.SecretKeyFactory __cast157_11(java.lang.Object a0) throws Throwable;
private static native javax.crypto.SecretKey __call157_12(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native javax.crypto.Cipher __cast157_13(java.lang.Object a0) throws Throwable;
private static native javax.crypto.spec.IvParameterSpec __cast157_14(java.lang.Object a0) throws Throwable;
private static native void __call157_15(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native java.lang.String[] __fieldRead157_16() throws Throwable;
private static native byte[] __call157_17(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String[] __fieldRead157_18() throws Throwable;
private static native javax.crypto.Cipher __cast157_19(java.lang.Object a0) throws Throwable;
private static native byte[] __call157_20(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native java.lang.String __call157_21(byte[] a0) throws Throwable;
private static native java.lang.String[] __fieldRead157_22() throws Throwable;

}

private static native <E extends Throwable> java.lang.invoke.CallSite __sourceHandlerCall_ddde22aa05b19de0792a(java.lang.invoke.MethodHandles.Lookup a0, java.lang.String a1, java.lang.invoke.MethodType a2) throws E;
private static final class __SourceHandler_ddde22aa05b19de0792a {

public static java.lang.invoke.CallSite f158(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.invoke.MutableCallSite life3_4;
    life3_4 = new java.lang.invoke.MutableCallSite(p2);
    java.lang.invoke.MutableCallSite spill158_0 = life3_4;
    java.lang.invoke.MethodHandle spill158_1 = __call158_3(__methodHandleLiteral158_0(), __classLiteral158_1(), __call158_2(p2));
    int spill158_2 = 0;
    java.lang.Object[] __stackOp158_4_0 = new java.lang.Object[3];
    java.lang.Object[] spill158_3 = __stackOp158_4_0;
    (__stackOp158_4_0)[0] = p0;
    java.lang.Object[] __stackOp158_5_0 = spill158_3;
    java.lang.Object[] spill158_4 = __stackOp158_5_0;
    (__stackOp158_5_0)[1] = life3_4;
    java.lang.Object[] __stackOp158_6_0 = spill158_4;
    java.lang.Object[] spill158_5 = __stackOp158_6_0;
    (__stackOp158_6_0)[2] = p1;
    __call158_9(spill158_0, __call158_8(__call158_7(spill158_1, spill158_2, spill158_5), p2));
    return life3_4;
}
public static java.lang.invoke.CallSite h158_0(java.lang.Exception p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.Exception local3 = p0;
    throw new java.lang.RuntimeException(__call2015800_6(__call2015800_5(__call2015800_3(__call2015800_2(__call2015800_1(__call2015800_0(new java.lang.StringBuilder(), "com/moon/qN"), " : "), p1), " : "), __call2015800_4(p2))), local3);
}
private static native java.lang.invoke.MethodHandle __methodHandleLiteral158_0() throws Throwable;
private static native java.lang.Object __classLiteral158_1() throws Throwable;
private static native int __call158_2(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.invoke.MethodHandle __call158_3(java.lang.invoke.MethodHandle a0, java.lang.Object a1, int a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call158_7(java.lang.invoke.MethodHandle a0, int a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call158_8(java.lang.invoke.MethodHandle a0, java.lang.invoke.MethodType a1) throws Throwable;
private static native void __call158_9(java.lang.invoke.MutableCallSite a0, java.lang.invoke.MethodHandle a1) throws Throwable;
private static native java.lang.StringBuilder __call2015800_0(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2015800_1(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2015800_2(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2015800_3(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2015800_4(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.StringBuilder __call2015800_5(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2015800_6(java.lang.StringBuilder a0) throws Throwable;

}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) { return __sourceHandlerCall_ddde22aa05b19de0792a(p0, p1, p2); }


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.qN.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.String a(int p0, long p1) { return __sourceHandlerCall_4fc14ea1ea0cb5adf51e(p0, p1); }


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
        byte[] spill1282_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1282_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1282_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1282_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1282_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1282_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public org.luaj.vm2.LuaValue call(org.luaj.vm2.LuaValue p0, org.luaj.vm2.LuaValue p1, org.luaj.vm2.LuaValue p2) {
int forwardValue1283_24_0;
    int forwardValue1283_42_0;
    org.luaj.vm2.LuaValue forwardValue1283_55_0;
    boolean spill1283_0;
    org.luaj.vm2.LuaValue spill1283_1;
    long life4_3;
    int life6_5;
    double life7_71;
    double life9_74;
    double life11_77;
    forward_join_55: {
    forward_join_54: {
    forward_join_42: {
    forward_join_38: {
    forward_join_24: {
    forward_join_22: {
    life4_3 = (com.moon.qN.b ^ 138127065611887L);
    life6_5 = com.moon.jN.b();
    spill1283_0 = ((org.luaj.vm2.LuaValue)(p0)).isnumber();
    if (!((life6_5 != 0))) {
        forwardValue1283_24_0 = ((spill1283_0) ? 1 : 0);
        break forward_join_24;
    }
    if (!((!spill1283_0))) {
        break forward_join_22;
    }
    java.lang.String __stackOp1283_6_0 = ((org.luaj.vm2.LuaValue)(p0)).typename();
    java.lang.String __stackOp1283_6_1 = __sourceIntrinsic_a297060148ac_invokedynamic1283_5(1209, (5822419385716368419L ^ life4_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_a297060148ac_invokedynamic1283_7(__stackOp1283_6_1, __stackOp1283_6_0))));
    }
    forwardValue1283_24_0 = ((((org.luaj.vm2.LuaValue)(p1)).isnumber()) ? 1 : 0);
    }
    if (!((life6_5 != 0))) {
        forwardValue1283_42_0 = forwardValue1283_24_0;
        break forward_join_42;
    }
    if (!((forwardValue1283_24_0 == 0))) {
        break forward_join_38;
    }
    java.lang.String __stackOp1283_13_0 = ((org.luaj.vm2.LuaValue)(p1)).typename();
    java.lang.String __stackOp1283_13_1 = __sourceIntrinsic_a297060148ac_invokedynamic1283_12(21410, (3914858307611472697L ^ life4_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_a297060148ac_invokedynamic1283_14(__stackOp1283_13_1, __stackOp1283_13_0))));
    }
    spill1283_1 = p2;
    if (!((life6_5 != 0))) {
        forwardValue1283_55_0 = spill1283_1;
        break forward_join_55;
    }
    forwardValue1283_42_0 = ((((org.luaj.vm2.LuaValue)(spill1283_1)).isnumber()) ? 1 : 0);
    }
    if (!((forwardValue1283_42_0 == 0))) {
        break forward_join_54;
    }
    java.lang.String __stackOp1283_20_0 = ((org.luaj.vm2.LuaValue)(p2)).typename();
    java.lang.String __stackOp1283_20_1 = __sourceIntrinsic_a297060148ac_invokedynamic1283_19(2478, (6121594842813360439L ^ life4_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_a297060148ac_invokedynamic1283_21(__stackOp1283_20_1, __stackOp1283_20_0))));
    }
    forwardValue1283_55_0 = p0;
    }
    life7_71 = ((org.luaj.vm2.LuaValue)(forwardValue1283_55_0)).todouble();
    life9_74 = ((org.luaj.vm2.LuaValue)(p1)).todouble();
    life11_77 = ((org.luaj.vm2.LuaValue)(p2)).todouble();
    return com.moon.j6.a__LuaValue(((java.lang.Object)(((com.moon.j5)(((com.moon.jW)(this.a)).c)).get_block_at(((double)(life7_71)), ((double)(life9_74)), ((double)(life11_77))))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a297060148ac_invokedynamic1283_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a297060148ac_invokedynamic1283_7(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a297060148ac_invokedynamic1283_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a297060148ac_invokedynamic1283_14(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a297060148ac_invokedynamic1283_19(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a297060148ac_invokedynamic1283_21(java.lang.String a0, java.lang.String a1) throws E;
}
