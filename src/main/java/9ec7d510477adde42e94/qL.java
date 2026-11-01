package com.moon;


class qL extends org.luaj.vm2.lib.ThreeArgFunction {

com.moon.jU a;

private static long b;

private static java.lang.String[] c;

private static java.lang.String[] d;

private static java.util.Map e;

qL(com.moon.jU p0) { super(); }

private static void __sourceConstructorBody_c989a9d12776d680(com.moon.qL receiver, com.moon.jU p0) throws Throwable {
((com.moon.qL)(receiver)).a = ((com.moon.jU)(p0));
    com.moon.qL.__sourceConstructorInit_c989a9d12776d680_0(((com.moon.qL)(receiver)));
    return;
}


static {
javax.crypto.Cipher forestValue173_36_0;
    int forestValue173_36_1;
    javax.crypto.SecretKeyFactory forestValue173_36_2;
    byte[] forestValue173_36_3;
    javax.crypto.Cipher forestValue173_53_0;
    int forestValue173_53_1;
    javax.crypto.SecretKeyFactory forestValue173_53_2;
    byte[] forestValue173_53_3;
    javax.crypto.Cipher spill173_0;
    int spill173_1;
    javax.crypto.SecretKeyFactory spill173_2;
    byte[] spill173_3;
    byte[] spill173_4;
    java.lang.String spill173_5;
    int spill173_6;
    java.lang.String spill173_7;
    java.lang.String[] spill173_8;
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
    b = ((long)(((moom._a)(moom._c.a(((long)(14249024291809909L)), ((long)(8186663961702428181L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(173083452260825L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    life0_16 = (com.moon.qL.b ^ 13082159312626L);
    spill173_0 = (life2_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill173_1 = 2;
    spill173_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp173_9_0 = new byte[8];
    spill173_3 = __stackOp173_9_0;
    (__stackOp173_9_0)[0] = ((byte) ((int) (life0_16 >>> 56)));
    life3_35 = 1;
    forestValue173_36_0 = spill173_0;
    forestValue173_36_1 = spill173_1;
    forestValue173_36_2 = spill173_2;
    forestValue173_36_3 = spill173_3;
    forest_cycle_36: while (true) {
    if (!((life3_35 < 8))) {
        forestValue173_53_0 = forestValue173_36_0;
        forestValue173_53_1 = forestValue173_36_1;
        forestValue173_53_2 = forestValue173_36_2;
        forestValue173_53_3 = forestValue173_36_3;
        break forest_join_53;
    }
    byte[] __stackOp173_10_0 = forestValue173_36_3;
    spill173_4 = __stackOp173_10_0;
    (__stackOp173_10_0)[life3_35] = ((byte) ((int) ((life0_16 << (life3_35 * 8)) >>> 56)));
    life3_35 += 1;
    forestValue173_36_3 = spill173_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue173_53_0)).init(((int)(forestValue173_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue173_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue173_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life9_66 = new java.lang.String[3];
    life7_68 = 0;
    life8_73 = ((java.lang.String)((life6_71 = "qf\021oL{@d3UëZ4NÀ4²\016PÒ-°\r©Ú¨RÎÏ\024¬ÉrËÕ7\001$P\027u$·\005ëBÕP0\033 w\001·\016 \017\nÒÏ6FÇî3çøòËî¦é)ß^g4·÷'Ø×ä¨saRGÀ\bÆ8\0172tÚCbe3Ò¯'ÀáÈmYð\031\"CcÌvu\013aÍ@û¿ÙJ)\016\fðÐÅ#TÇÕn="))).length();
    life5_75 = 56;
    life4_77 = -1;
    forest_cycle_78: while (true) {
    life4_77 += 1;
    spill173_5 = life6_71;
    int __stackOp173_14_0 = life4_77;
    java.lang.String __stackOp173_16_0 = ((java.lang.String)(spill173_5)).substring(((int)(__stackOp173_14_0)), ((int)((__stackOp173_14_0 + life5_75))));
    int __stackOp173_16_1 = -1;
    spill173_6 = __stackOp173_16_1;
    byte[] __stackOp173_18_0 = ((java.lang.String)(__stackOp173_16_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp173_18_1 = life2_20;
    life10_93 = ((javax.crypto.Cipher)(__stackOp173_18_1)).doFinal(((byte[])(__stackOp173_18_0)));
    int __stackOp173_22_0 = spill173_6;
    java.lang.String __stackOp173_22_1 = ((java.lang.String)(com.moon.qL.a(((byte[])(life10_93))))).intern();
    spill173_7 = __stackOp173_22_1;
    recovery.source.CarrierOps.discard(__stackOp173_22_0);
    java.lang.String __stackOp173_24_0 = spill173_7;
    java.lang.String[] __stackOp173_24_1 = life9_66;
    spill173_8 = __stackOp173_24_1;
    java.lang.String __stackOp173_25_0 = __stackOp173_24_0;
    int __stackOp173_25_1 = (life7_68++);
    (spill173_8)[__stackOp173_25_1] = __stackOp173_25_0;
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

private static native <E extends Throwable> void __sourceConstructorInit_c989a9d12776d680_0(com.moon.qL a0) throws E;
private static native <E extends Throwable> java.lang.String __sourceHandlerCall_43ed2f2dfcc70b4af4ec(int a0, long a1) throws E;
private static final class __SourceHandler_43ed2f2dfcc70b4af4ec {

public static java.lang.String f153(int p0, long p1) throws Throwable {
    int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 14318);
    if (((__fieldRead153_0())[life5_8] == null)) {
        life3_16 = __call153_3(__call153_2(__call153_1()));
        life4_21 = __cast153_6(__call153_5(__fieldRead153_4(), life3_16));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = __call153_7("DES/CBC/PKCS5Padding");
        (life4_21)[1] = __call153_8("DES");
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        __call153_10(__fieldRead153_9(), life3_16, life4_21);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_63: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = __call153_12(__cast153_11((life4_21)[1]), life7_92);
        __call153_15(__cast153_13((life4_21)[0]), 2, life8_99, __cast153_14((life4_21)[2]));
        life9_116 = __call153_17((__fieldRead153_16())[life5_8], "ISO-8859-1");
        (__fieldRead153_18())[life5_8] = __call153_21(__call153_20(__cast153_19((life4_21)[0]), life9_116));
    }
    return (__fieldRead153_22())[life5_8];
}
public static java.lang.String h153_0(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    throw new java.lang.RuntimeException("com/moon/qL", local1);
}
private static native java.lang.String[] __fieldRead153_0() throws Throwable;
private static native java.lang.Thread __call153_1() throws Throwable;
private static native long __call153_2(java.lang.Thread a0) throws Throwable;
private static native java.lang.Long __call153_3(long a0) throws Throwable;
private static native java.util.Map __fieldRead153_4() throws Throwable;
private static native java.lang.Object __call153_5(java.util.Map a0, java.lang.Long a1) throws Throwable;
private static native java.lang.Object[] __cast153_6(java.lang.Object a0) throws Throwable;
private static native javax.crypto.Cipher __call153_7(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call153_8(java.lang.String a0) throws Throwable;
private static native java.util.Map __fieldRead153_9() throws Throwable;
private static native java.lang.Object __call153_10(java.util.Map a0, java.lang.Long a1, java.lang.Object[] a2) throws Throwable;
private static native javax.crypto.SecretKeyFactory __cast153_11(java.lang.Object a0) throws Throwable;
private static native javax.crypto.SecretKey __call153_12(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native javax.crypto.Cipher __cast153_13(java.lang.Object a0) throws Throwable;
private static native javax.crypto.spec.IvParameterSpec __cast153_14(java.lang.Object a0) throws Throwable;
private static native void __call153_15(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native java.lang.String[] __fieldRead153_16() throws Throwable;
private static native byte[] __call153_17(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String[] __fieldRead153_18() throws Throwable;
private static native javax.crypto.Cipher __cast153_19(java.lang.Object a0) throws Throwable;
private static native byte[] __call153_20(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native java.lang.String __call153_21(byte[] a0) throws Throwable;
private static native java.lang.String[] __fieldRead153_22() throws Throwable;

}

private static native <E extends Throwable> java.lang.invoke.CallSite __sourceHandlerCall_05a1af43da29543c23f0(java.lang.invoke.MethodHandles.Lookup a0, java.lang.String a1, java.lang.invoke.MethodType a2) throws E;
private static final class __SourceHandler_05a1af43da29543c23f0 {

public static java.lang.invoke.CallSite f154(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.invoke.MutableCallSite life3_4;
    life3_4 = new java.lang.invoke.MutableCallSite(p2);
    java.lang.invoke.MutableCallSite spill154_0 = life3_4;
    java.lang.invoke.MethodHandle spill154_1 = __call154_3(__methodHandleLiteral154_0(), __classLiteral154_1(), __call154_2(p2));
    int spill154_2 = 0;
    java.lang.Object[] __stackOp154_4_0 = new java.lang.Object[3];
    java.lang.Object[] spill154_3 = __stackOp154_4_0;
    (__stackOp154_4_0)[0] = p0;
    java.lang.Object[] __stackOp154_5_0 = spill154_3;
    java.lang.Object[] spill154_4 = __stackOp154_5_0;
    (__stackOp154_5_0)[1] = life3_4;
    java.lang.Object[] __stackOp154_6_0 = spill154_4;
    java.lang.Object[] spill154_5 = __stackOp154_6_0;
    (__stackOp154_6_0)[2] = p1;
    __call154_9(spill154_0, __call154_8(__call154_7(spill154_1, spill154_2, spill154_5), p2));
    return life3_4;
}
public static java.lang.invoke.CallSite h154_0(java.lang.Exception p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.Exception local3 = p0;
    throw new java.lang.RuntimeException(__call2015400_6(__call2015400_5(__call2015400_3(__call2015400_2(__call2015400_1(__call2015400_0(new java.lang.StringBuilder(), "com/moon/qL"), " : "), p1), " : "), __call2015400_4(p2))), local3);
}
private static native java.lang.invoke.MethodHandle __methodHandleLiteral154_0() throws Throwable;
private static native java.lang.Object __classLiteral154_1() throws Throwable;
private static native int __call154_2(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.invoke.MethodHandle __call154_3(java.lang.invoke.MethodHandle a0, java.lang.Object a1, int a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call154_7(java.lang.invoke.MethodHandle a0, int a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call154_8(java.lang.invoke.MethodHandle a0, java.lang.invoke.MethodType a1) throws Throwable;
private static native void __call154_9(java.lang.invoke.MutableCallSite a0, java.lang.invoke.MethodHandle a1) throws Throwable;
private static native java.lang.StringBuilder __call2015400_0(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2015400_1(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2015400_2(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2015400_3(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2015400_4(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.StringBuilder __call2015400_5(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2015400_6(java.lang.StringBuilder a0) throws Throwable;

}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) { return __sourceHandlerCall_05a1af43da29543c23f0(p0, p1, p2); }


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.qL.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.String a(int p0, long p1) { return __sourceHandlerCall_43ed2f2dfcc70b4af4ec(p0, p1); }


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
        byte[] spill1278_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1278_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1278_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1278_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1278_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1278_2)[life4_9];
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
org.luaj.vm2.LuaValue forwardValue1279_38_0;
    int forwardValue1279_43_0;
    org.luaj.vm2.LuaValue forwardValue1279_59_0;
    int forwardValue1279_64_0;
    org.luaj.vm2.LuaValue forwardValue1279_80_0;
    org.luaj.vm2.LuaValue forwardValue1279_92_0;
    int spill1279_0;
    org.luaj.vm2.LuaValue spill1279_1;
    boolean spill1279_2;
    org.luaj.vm2.LuaValue spill1279_3;
    boolean spill1279_4;
    org.luaj.vm2.LuaValue spill1279_5;
    org.luaj.vm2.LuaValue spill1279_6;
    long life4_3;
    org.luaj.vm2.LuaValue life7_8;
    org.luaj.vm2.LuaValue life8_12;
    int life6_13;
    org.luaj.vm2.LuaValue life9_17;
    forward_join_92: {
    forward_join_81: {
    forward_join_80: {
    forward_join_70: {
    forward_join_64: {
    forward_join_60: {
    forward_join_59: {
    forward_join_49: {
    forward_join_43: {
    forward_join_39: {
    forward_join_38: {
    forward_join_28: {
    life4_3 = (com.moon.qL.b ^ 43461392538340L);
    spill1279_0 = com.moon.jN.c();
    life7_8 = ((org.luaj.vm2.LuaValue)(p0)).arg(((int)(1)));
    life8_12 = ((org.luaj.vm2.LuaValue)(p1)).arg(((int)(1)));
    life6_13 = spill1279_0;
    life9_17 = ((org.luaj.vm2.LuaValue)(p2)).arg(((int)(1)));
    spill1279_1 = life7_8;
    if (!((life6_13 == 0))) {
        forwardValue1279_38_0 = spill1279_1;
        break forward_join_38;
    }
    if (!((!((org.luaj.vm2.LuaValue)(spill1279_1)).isnil()))) {
        break forward_join_28;
    }
    spill1279_2 = ((org.luaj.vm2.LuaValue)(life7_8)).isnumber();
    if (!((life6_13 == 0))) {
        forwardValue1279_43_0 = ((spill1279_2) ? 1 : 0);
        break forward_join_43;
    }
    if (!((!spill1279_2))) {
        break forward_join_39;
    }
    }
    java.lang.String __stackOp1279_10_0 = ((org.luaj.vm2.LuaValue)(life7_8)).typename();
    java.lang.String __stackOp1279_10_1 = __sourceIntrinsic_a297060148ac_invokedynamic1279_9(11217, (7115831571570342103L ^ life4_3));
    forwardValue1279_38_0 = org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_a297060148ac_invokedynamic1279_11(__stackOp1279_10_1, __stackOp1279_10_0))));
    }
    return forwardValue1279_38_0;
    }
    spill1279_3 = life8_12;
    if (!((life6_13 == 0))) {
        forwardValue1279_59_0 = spill1279_3;
        break forward_join_59;
    }
    forwardValue1279_43_0 = ((((org.luaj.vm2.LuaValue)(spill1279_3)).isnil()) ? 1 : 0);
    }
    if (!((forwardValue1279_43_0 == 0))) {
        break forward_join_49;
    }
    spill1279_4 = ((org.luaj.vm2.LuaValue)(life8_12)).isnumber();
    if (!((life6_13 == 0))) {
        forwardValue1279_64_0 = ((spill1279_4) ? 1 : 0);
        break forward_join_64;
    }
    if (!((!spill1279_4))) {
        break forward_join_60;
    }
    }
    java.lang.String __stackOp1279_19_0 = ((org.luaj.vm2.LuaValue)(life8_12)).typename();
    java.lang.String __stackOp1279_19_1 = __sourceIntrinsic_a297060148ac_invokedynamic1279_18(23148, (3486119736574658920L ^ life4_3));
    forwardValue1279_59_0 = org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_a297060148ac_invokedynamic1279_20(__stackOp1279_19_1, __stackOp1279_19_0))));
    }
    return forwardValue1279_59_0;
    }
    spill1279_5 = life9_17;
    if (!((life6_13 == 0))) {
        forwardValue1279_80_0 = spill1279_5;
        break forward_join_80;
    }
    forwardValue1279_64_0 = ((((org.luaj.vm2.LuaValue)(spill1279_5)).isnil()) ? 1 : 0);
    }
    if (!((forwardValue1279_64_0 == 0))) {
        break forward_join_70;
    }
    spill1279_6 = life9_17;
    if (!((life6_13 == 0))) {
        forwardValue1279_92_0 = spill1279_6;
        break forward_join_92;
    }
    if (!((!((org.luaj.vm2.LuaValue)(spill1279_6)).isnumber()))) {
        break forward_join_81;
    }
    }
    java.lang.String __stackOp1279_27_0 = ((org.luaj.vm2.LuaValue)(life9_17)).typename();
    java.lang.String __stackOp1279_27_1 = __sourceIntrinsic_a297060148ac_invokedynamic1279_26(3371, (937645154698993198L ^ life4_3));
    forwardValue1279_80_0 = org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_a297060148ac_invokedynamic1279_28(__stackOp1279_27_1, __stackOp1279_27_0))));
    }
    return forwardValue1279_80_0;
    }
    forwardValue1279_92_0 = com.moon.j6.a__LuaValue(((java.lang.Object)(((com.moon.j3)(((com.moon.jU)(this.a)).c)).ray_cast(((float)(((org.luaj.vm2.LuaValue)(life7_8)).tofloat())), ((float)(((org.luaj.vm2.LuaValue)(life8_12)).tofloat())), ((float)(((org.luaj.vm2.LuaValue)(life9_17)).tofloat()))))));
    }
    return forwardValue1279_92_0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a297060148ac_invokedynamic1279_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a297060148ac_invokedynamic1279_11(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a297060148ac_invokedynamic1279_18(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a297060148ac_invokedynamic1279_20(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a297060148ac_invokedynamic1279_26(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a297060148ac_invokedynamic1279_28(java.lang.String a0, java.lang.String a1) throws E;
}
