package com.moon;


class qU extends org.luaj.vm2.lib.TwoArgFunction {

com.moon.jW a;

private static long b;

private static java.lang.String[] c;

private static java.lang.String[] d;

private static java.util.Map e;

qU(com.moon.jW p0) { super(); }

private static void __sourceConstructorBody_701c2837fce622ac(com.moon.qU receiver, com.moon.jW p0) throws Throwable {
((com.moon.qU)(receiver)).a = ((com.moon.jW)(p0));
    com.moon.qU.__sourceConstructorInit_701c2837fce622ac_0(((com.moon.qU)(receiver)));
    return;
}


static {
javax.crypto.Cipher forestValue191_36_0;
    int forestValue191_36_1;
    javax.crypto.SecretKeyFactory forestValue191_36_2;
    byte[] forestValue191_36_3;
    javax.crypto.Cipher forestValue191_53_0;
    int forestValue191_53_1;
    javax.crypto.SecretKeyFactory forestValue191_53_2;
    byte[] forestValue191_53_3;
    javax.crypto.Cipher spill191_0;
    int spill191_1;
    javax.crypto.SecretKeyFactory spill191_2;
    byte[] spill191_3;
    byte[] spill191_4;
    java.lang.String spill191_5;
    int spill191_6;
    java.lang.String spill191_7;
    java.lang.String[] spill191_8;
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
    b = ((long)(((moom._a)(moom._c.a(((long)(-2545299896299141853L)), ((long)(-8453739356839384292L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(9704552477601L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    life0_16 = (com.moon.qU.b ^ 37020966209155L);
    spill191_0 = (life2_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill191_1 = 2;
    spill191_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp191_9_0 = new byte[8];
    spill191_3 = __stackOp191_9_0;
    (__stackOp191_9_0)[0] = ((byte) ((int) (life0_16 >>> 56)));
    life3_35 = 1;
    forestValue191_36_0 = spill191_0;
    forestValue191_36_1 = spill191_1;
    forestValue191_36_2 = spill191_2;
    forestValue191_36_3 = spill191_3;
    forest_cycle_36: while (true) {
    if (!((life3_35 < 8))) {
        forestValue191_53_0 = forestValue191_36_0;
        forestValue191_53_1 = forestValue191_36_1;
        forestValue191_53_2 = forestValue191_36_2;
        forestValue191_53_3 = forestValue191_36_3;
        break forest_join_53;
    }
    byte[] __stackOp191_10_0 = forestValue191_36_3;
    spill191_4 = __stackOp191_10_0;
    (__stackOp191_10_0)[life3_35] = ((byte) ((int) ((life0_16 << (life3_35 * 8)) >>> 56)));
    life3_35 += 1;
    forestValue191_36_3 = spill191_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue191_53_0)).init(((int)(forestValue191_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue191_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue191_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life9_66 = new java.lang.String[2];
    life7_68 = 0;
    life8_73 = ((java.lang.String)((life6_71 = "1°foyÅüðn¢yÔg´GU%>S¹¥9\020É\027@â\031Ë$ô\025S²úÂz0\001ã.\037?\0130âøVÊÝ ïÉlìo9Ý\023¿Eáiò£319ì\025Ô\005\030Ò?o"))).length();
    life5_75 = 48;
    life4_77 = -1;
    forest_cycle_78: while (true) {
    life4_77 += 1;
    spill191_5 = life6_71;
    int __stackOp191_14_0 = life4_77;
    java.lang.String __stackOp191_16_0 = ((java.lang.String)(spill191_5)).substring(((int)(__stackOp191_14_0)), ((int)((__stackOp191_14_0 + life5_75))));
    int __stackOp191_16_1 = -1;
    spill191_6 = __stackOp191_16_1;
    byte[] __stackOp191_18_0 = ((java.lang.String)(__stackOp191_16_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp191_18_1 = life2_20;
    life10_93 = ((javax.crypto.Cipher)(__stackOp191_18_1)).doFinal(((byte[])(__stackOp191_18_0)));
    int __stackOp191_22_0 = spill191_6;
    java.lang.String __stackOp191_22_1 = ((java.lang.String)(com.moon.qU.a(((byte[])(life10_93))))).intern();
    spill191_7 = __stackOp191_22_1;
    recovery.source.CarrierOps.discard(__stackOp191_22_0);
    java.lang.String __stackOp191_24_0 = spill191_7;
    java.lang.String[] __stackOp191_24_1 = life9_66;
    spill191_8 = __stackOp191_24_1;
    java.lang.String __stackOp191_25_0 = __stackOp191_24_0;
    int __stackOp191_25_1 = (life7_68++);
    (spill191_8)[__stackOp191_25_1] = __stackOp191_25_0;
    if (!(((life4_77 = (life4_77 + life5_75)) < life8_73))) {
        break forest_join_116;
    }
    life5_75 = ((int)(((java.lang.String)(life6_71)).charAt(((int)(life4_77)))));
    continue forest_cycle_78;
    }
    }
    c = ((java.lang.String[])(life9_66));
    d = ((java.lang.String[])(new java.lang.String[2]));
}

private static native <E extends Throwable> void __sourceConstructorInit_701c2837fce622ac_0(com.moon.qU a0) throws E;
private static native <E extends Throwable> java.lang.String __sourceHandlerCall_d2701a54f8eb963399f9(int a0, long a1) throws E;
private static final class __SourceHandler_d2701a54f8eb963399f9 {

public static java.lang.String f169(int p0, long p1) throws Throwable {
    int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 1677);
    if (((__fieldRead169_0())[life5_8] == null)) {
        life3_16 = __call169_3(__call169_2(__call169_1()));
        life4_21 = __cast169_6(__call169_5(__fieldRead169_4(), life3_16));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = __call169_7("DES/CBC/PKCS5Padding");
        (life4_21)[1] = __call169_8("DES");
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        __call169_10(__fieldRead169_9(), life3_16, life4_21);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_63: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = __call169_12(__cast169_11((life4_21)[1]), life7_92);
        __call169_15(__cast169_13((life4_21)[0]), 2, life8_99, __cast169_14((life4_21)[2]));
        life9_116 = __call169_17((__fieldRead169_16())[life5_8], "ISO-8859-1");
        (__fieldRead169_18())[life5_8] = __call169_21(__call169_20(__cast169_19((life4_21)[0]), life9_116));
    }
    return (__fieldRead169_22())[life5_8];
}
public static java.lang.String h169_0(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    throw new java.lang.RuntimeException("com/moon/qU", local1);
}
private static native java.lang.String[] __fieldRead169_0() throws Throwable;
private static native java.lang.Thread __call169_1() throws Throwable;
private static native long __call169_2(java.lang.Thread a0) throws Throwable;
private static native java.lang.Long __call169_3(long a0) throws Throwable;
private static native java.util.Map __fieldRead169_4() throws Throwable;
private static native java.lang.Object __call169_5(java.util.Map a0, java.lang.Long a1) throws Throwable;
private static native java.lang.Object[] __cast169_6(java.lang.Object a0) throws Throwable;
private static native javax.crypto.Cipher __call169_7(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call169_8(java.lang.String a0) throws Throwable;
private static native java.util.Map __fieldRead169_9() throws Throwable;
private static native java.lang.Object __call169_10(java.util.Map a0, java.lang.Long a1, java.lang.Object[] a2) throws Throwable;
private static native javax.crypto.SecretKeyFactory __cast169_11(java.lang.Object a0) throws Throwable;
private static native javax.crypto.SecretKey __call169_12(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native javax.crypto.Cipher __cast169_13(java.lang.Object a0) throws Throwable;
private static native javax.crypto.spec.IvParameterSpec __cast169_14(java.lang.Object a0) throws Throwable;
private static native void __call169_15(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native java.lang.String[] __fieldRead169_16() throws Throwable;
private static native byte[] __call169_17(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String[] __fieldRead169_18() throws Throwable;
private static native javax.crypto.Cipher __cast169_19(java.lang.Object a0) throws Throwable;
private static native byte[] __call169_20(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native java.lang.String __call169_21(byte[] a0) throws Throwable;
private static native java.lang.String[] __fieldRead169_22() throws Throwable;

}

private static native <E extends Throwable> java.lang.invoke.CallSite __sourceHandlerCall_41deec3af2168408ac5b(java.lang.invoke.MethodHandles.Lookup a0, java.lang.String a1, java.lang.invoke.MethodType a2) throws E;
private static final class __SourceHandler_41deec3af2168408ac5b {

public static java.lang.invoke.CallSite f170(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.invoke.MutableCallSite life3_4;
    life3_4 = new java.lang.invoke.MutableCallSite(p2);
    java.lang.invoke.MutableCallSite spill170_0 = life3_4;
    java.lang.invoke.MethodHandle spill170_1 = __call170_3(__methodHandleLiteral170_0(), __classLiteral170_1(), __call170_2(p2));
    int spill170_2 = 0;
    java.lang.Object[] __stackOp170_4_0 = new java.lang.Object[3];
    java.lang.Object[] spill170_3 = __stackOp170_4_0;
    (__stackOp170_4_0)[0] = p0;
    java.lang.Object[] __stackOp170_5_0 = spill170_3;
    java.lang.Object[] spill170_4 = __stackOp170_5_0;
    (__stackOp170_5_0)[1] = life3_4;
    java.lang.Object[] __stackOp170_6_0 = spill170_4;
    java.lang.Object[] spill170_5 = __stackOp170_6_0;
    (__stackOp170_6_0)[2] = p1;
    __call170_9(spill170_0, __call170_8(__call170_7(spill170_1, spill170_2, spill170_5), p2));
    return life3_4;
}
public static java.lang.invoke.CallSite h170_0(java.lang.Exception p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.Exception local3 = p0;
    throw new java.lang.RuntimeException(__call2017000_6(__call2017000_5(__call2017000_3(__call2017000_2(__call2017000_1(__call2017000_0(new java.lang.StringBuilder(), "com/moon/qU"), " : "), p1), " : "), __call2017000_4(p2))), local3);
}
private static native java.lang.invoke.MethodHandle __methodHandleLiteral170_0() throws Throwable;
private static native java.lang.Object __classLiteral170_1() throws Throwable;
private static native int __call170_2(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.invoke.MethodHandle __call170_3(java.lang.invoke.MethodHandle a0, java.lang.Object a1, int a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call170_7(java.lang.invoke.MethodHandle a0, int a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call170_8(java.lang.invoke.MethodHandle a0, java.lang.invoke.MethodType a1) throws Throwable;
private static native void __call170_9(java.lang.invoke.MutableCallSite a0, java.lang.invoke.MethodHandle a1) throws Throwable;
private static native java.lang.StringBuilder __call2017000_0(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2017000_1(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2017000_2(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2017000_3(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2017000_4(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.StringBuilder __call2017000_5(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2017000_6(java.lang.StringBuilder a0) throws Throwable;

}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) { return __sourceHandlerCall_41deec3af2168408ac5b(p0, p1, p2); }


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.qU.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.String a(int p0, long p1) { return __sourceHandlerCall_d2701a54f8eb963399f9(p0, p1); }


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
        byte[] spill1296_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1296_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1296_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1296_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1296_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1296_2)[life4_9];
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


public org.luaj.vm2.LuaValue call(org.luaj.vm2.LuaValue p0, org.luaj.vm2.LuaValue p1) {
int forestValue100051_24_0;
    int forestValue100051_40_0;
    boolean spill100051_0;
    long life3_3;
    int life5_5;
    int life6_42;
    int life7_45;
    forest_join_40: {
    forest_join_38: {
    forest_join_24: {
    forest_join_22: {
    life3_3 = (com.moon.qU.b ^ 139699570597814L);
    life5_5 = com.moon.jN.c();
    spill100051_0 = ((org.luaj.vm2.LuaValue)(p0)).istable();
    if (!((life5_5 == 0))) {
        forestValue100051_24_0 = ((spill100051_0) ? 1 : 0);
        break forest_join_24;
    }
    if (!((!spill100051_0))) {
        break forest_join_22;
    }
    java.lang.String __stackOp100051_6_0 = ((org.luaj.vm2.LuaValue)(p0)).typename();
    java.lang.String __stackOp100051_6_1 = __sourceIntrinsic_fc861287a8ca_invokedynamic100051_5(13401, (759605215313662044L ^ life3_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_fc861287a8ca_invokedynamic100051_7(__stackOp100051_6_1, __stackOp100051_6_0))));
    }
    forestValue100051_24_0 = ((((org.luaj.vm2.LuaValue)(p1)).isnumber()) ? 1 : 0);
    }
    if (!((life5_5 == 0))) {
        forestValue100051_40_0 = forestValue100051_24_0;
        break forest_join_40;
    }
    if (!((forestValue100051_24_0 == 0))) {
        break forest_join_38;
    }
    java.lang.String __stackOp100051_13_0 = ((org.luaj.vm2.LuaValue)(p1)).typename();
    java.lang.String __stackOp100051_13_1 = __sourceIntrinsic_fc861287a8ca_invokedynamic100051_12(30193, (4918768689889006069L ^ life3_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_fc861287a8ca_invokedynamic100051_14(__stackOp100051_13_1, __stackOp100051_13_0))));
    }
    forestValue100051_40_0 = ((org.luaj.vm2.LuaValue)(p0)).toint();
    }
    life6_42 = forestValue100051_40_0;
    life7_45 = ((org.luaj.vm2.LuaValue)(p1)).toint();
    return org.luaj.vm2.LuaValue.valueOf(((boolean)(((com.moon.j5)(((com.moon.jW)(this.a)).c)).has_effect(((int)(life6_42)), ((int)(life7_45))))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fc861287a8ca_invokedynamic100051_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fc861287a8ca_invokedynamic100051_7(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fc861287a8ca_invokedynamic100051_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fc861287a8ca_invokedynamic100051_14(java.lang.String a0, java.lang.String a1) throws E;
}
