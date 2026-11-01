package com.moon;


class qM extends org.luaj.vm2.lib.ThreeArgFunction {

com.moon.jU a;

private static long b;

private static java.lang.String[] c;

private static java.lang.String[] d;

private static java.util.Map e;

qM(com.moon.jU p0) { super(); }

private static void __sourceConstructorBody_82d61801013b4549(com.moon.qM receiver, com.moon.jU p0) throws Throwable {
((com.moon.qM)(receiver)).a = ((com.moon.jU)(p0));
    com.moon.qM.__sourceConstructorInit_82d61801013b4549_0(((com.moon.qM)(receiver)));
    return;
}


static {
javax.crypto.Cipher forestValue175_36_0;
    int forestValue175_36_1;
    javax.crypto.SecretKeyFactory forestValue175_36_2;
    byte[] forestValue175_36_3;
    javax.crypto.Cipher forestValue175_53_0;
    int forestValue175_53_1;
    javax.crypto.SecretKeyFactory forestValue175_53_2;
    byte[] forestValue175_53_3;
    javax.crypto.Cipher spill175_0;
    int spill175_1;
    javax.crypto.SecretKeyFactory spill175_2;
    byte[] spill175_3;
    byte[] spill175_4;
    java.lang.String spill175_5;
    int spill175_6;
    java.lang.String spill175_7;
    java.lang.String[] spill175_8;
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
    b = ((long)(((moom._a)(moom._c.a(((long)(2152788038203938268L)), ((long)(8201764579863091897L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(181073659976269L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    life0_16 = (com.moon.qM.b ^ 107398919652934L);
    spill175_0 = (life2_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill175_1 = 2;
    spill175_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp175_9_0 = new byte[8];
    spill175_3 = __stackOp175_9_0;
    (__stackOp175_9_0)[0] = ((byte) ((int) (life0_16 >>> 56)));
    life3_35 = 1;
    forestValue175_36_0 = spill175_0;
    forestValue175_36_1 = spill175_1;
    forestValue175_36_2 = spill175_2;
    forestValue175_36_3 = spill175_3;
    forest_cycle_36: while (true) {
    if (!((life3_35 < 8))) {
        forestValue175_53_0 = forestValue175_36_0;
        forestValue175_53_1 = forestValue175_36_1;
        forestValue175_53_2 = forestValue175_36_2;
        forestValue175_53_3 = forestValue175_36_3;
        break forest_join_53;
    }
    byte[] __stackOp175_10_0 = forestValue175_36_3;
    spill175_4 = __stackOp175_10_0;
    (__stackOp175_10_0)[life3_35] = ((byte) ((int) ((life0_16 << (life3_35 * 8)) >>> 56)));
    life3_35 += 1;
    forestValue175_36_3 = spill175_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue175_53_0)).init(((int)(forestValue175_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue175_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue175_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life9_66 = new java.lang.String[3];
    life7_68 = 0;
    life8_73 = ((java.lang.String)((life6_71 = "ãÌ¯m\t(L k\005q8\001\000Ü\023¢ti'\025Ü¢3ñe\rß\nG\022Ö\036S²qmÄï\035.S8\"ýZ-)\030oìªÛ\001¿\t?ÁãûÇ\né©º\006\036\033=Ö\034C=Ý¨ñ¦Ý\003\n/¦3ðõÆëw0ÚDav\026xpe{Ây5\\7¨-a¸`Üí\037Òù\034\trY¥_/¥h\0035ñÝÀ+uÕÅm"))).length();
    life5_75 = 48;
    life4_77 = -1;
    forest_cycle_78: while (true) {
    life4_77 += 1;
    spill175_5 = life6_71;
    int __stackOp175_14_0 = life4_77;
    java.lang.String __stackOp175_16_0 = ((java.lang.String)(spill175_5)).substring(((int)(__stackOp175_14_0)), ((int)((__stackOp175_14_0 + life5_75))));
    int __stackOp175_16_1 = -1;
    spill175_6 = __stackOp175_16_1;
    byte[] __stackOp175_18_0 = ((java.lang.String)(__stackOp175_16_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp175_18_1 = life2_20;
    life10_93 = ((javax.crypto.Cipher)(__stackOp175_18_1)).doFinal(((byte[])(__stackOp175_18_0)));
    int __stackOp175_22_0 = spill175_6;
    java.lang.String __stackOp175_22_1 = ((java.lang.String)(com.moon.qM.a(((byte[])(life10_93))))).intern();
    spill175_7 = __stackOp175_22_1;
    recovery.source.CarrierOps.discard(__stackOp175_22_0);
    java.lang.String __stackOp175_24_0 = spill175_7;
    java.lang.String[] __stackOp175_24_1 = life9_66;
    spill175_8 = __stackOp175_24_1;
    java.lang.String __stackOp175_25_0 = __stackOp175_24_0;
    int __stackOp175_25_1 = (life7_68++);
    (spill175_8)[__stackOp175_25_1] = __stackOp175_25_0;
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

private static native <E extends Throwable> void __sourceConstructorInit_82d61801013b4549_0(com.moon.qM a0) throws E;
private static native <E extends Throwable> java.lang.String __sourceHandlerCall_8283f27fc03421a476f2(int a0, long a1) throws E;
private static final class __SourceHandler_8283f27fc03421a476f2 {

public static java.lang.String f155(int p0, long p1) throws Throwable {
    int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 21046);
    if (((__fieldRead155_0())[life5_8] == null)) {
        life3_16 = __call155_3(__call155_2(__call155_1()));
        life4_21 = __cast155_6(__call155_5(__fieldRead155_4(), life3_16));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = __call155_7("DES/CBC/PKCS5Padding");
        (life4_21)[1] = __call155_8("DES");
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        __call155_10(__fieldRead155_9(), life3_16, life4_21);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_63: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = __call155_12(__cast155_11((life4_21)[1]), life7_92);
        __call155_15(__cast155_13((life4_21)[0]), 2, life8_99, __cast155_14((life4_21)[2]));
        life9_116 = __call155_17((__fieldRead155_16())[life5_8], "ISO-8859-1");
        (__fieldRead155_18())[life5_8] = __call155_21(__call155_20(__cast155_19((life4_21)[0]), life9_116));
    }
    return (__fieldRead155_22())[life5_8];
}
public static java.lang.String h155_0(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    throw new java.lang.RuntimeException("com/moon/qM", local1);
}
private static native java.lang.String[] __fieldRead155_0() throws Throwable;
private static native java.lang.Thread __call155_1() throws Throwable;
private static native long __call155_2(java.lang.Thread a0) throws Throwable;
private static native java.lang.Long __call155_3(long a0) throws Throwable;
private static native java.util.Map __fieldRead155_4() throws Throwable;
private static native java.lang.Object __call155_5(java.util.Map a0, java.lang.Long a1) throws Throwable;
private static native java.lang.Object[] __cast155_6(java.lang.Object a0) throws Throwable;
private static native javax.crypto.Cipher __call155_7(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call155_8(java.lang.String a0) throws Throwable;
private static native java.util.Map __fieldRead155_9() throws Throwable;
private static native java.lang.Object __call155_10(java.util.Map a0, java.lang.Long a1, java.lang.Object[] a2) throws Throwable;
private static native javax.crypto.SecretKeyFactory __cast155_11(java.lang.Object a0) throws Throwable;
private static native javax.crypto.SecretKey __call155_12(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native javax.crypto.Cipher __cast155_13(java.lang.Object a0) throws Throwable;
private static native javax.crypto.spec.IvParameterSpec __cast155_14(java.lang.Object a0) throws Throwable;
private static native void __call155_15(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native java.lang.String[] __fieldRead155_16() throws Throwable;
private static native byte[] __call155_17(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String[] __fieldRead155_18() throws Throwable;
private static native javax.crypto.Cipher __cast155_19(java.lang.Object a0) throws Throwable;
private static native byte[] __call155_20(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native java.lang.String __call155_21(byte[] a0) throws Throwable;
private static native java.lang.String[] __fieldRead155_22() throws Throwable;

}

private static native <E extends Throwable> java.lang.invoke.CallSite __sourceHandlerCall_ae0ba5437a2cc6b64afb(java.lang.invoke.MethodHandles.Lookup a0, java.lang.String a1, java.lang.invoke.MethodType a2) throws E;
private static final class __SourceHandler_ae0ba5437a2cc6b64afb {

public static java.lang.invoke.CallSite f156(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.invoke.MutableCallSite life3_4;
    life3_4 = new java.lang.invoke.MutableCallSite(p2);
    java.lang.invoke.MutableCallSite spill156_0 = life3_4;
    java.lang.invoke.MethodHandle spill156_1 = __call156_3(__methodHandleLiteral156_0(), __classLiteral156_1(), __call156_2(p2));
    int spill156_2 = 0;
    java.lang.Object[] __stackOp156_4_0 = new java.lang.Object[3];
    java.lang.Object[] spill156_3 = __stackOp156_4_0;
    (__stackOp156_4_0)[0] = p0;
    java.lang.Object[] __stackOp156_5_0 = spill156_3;
    java.lang.Object[] spill156_4 = __stackOp156_5_0;
    (__stackOp156_5_0)[1] = life3_4;
    java.lang.Object[] __stackOp156_6_0 = spill156_4;
    java.lang.Object[] spill156_5 = __stackOp156_6_0;
    (__stackOp156_6_0)[2] = p1;
    __call156_9(spill156_0, __call156_8(__call156_7(spill156_1, spill156_2, spill156_5), p2));
    return life3_4;
}
public static java.lang.invoke.CallSite h156_0(java.lang.Exception p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.Exception local3 = p0;
    throw new java.lang.RuntimeException(__call2015600_6(__call2015600_5(__call2015600_3(__call2015600_2(__call2015600_1(__call2015600_0(new java.lang.StringBuilder(), "com/moon/qM"), " : "), p1), " : "), __call2015600_4(p2))), local3);
}
private static native java.lang.invoke.MethodHandle __methodHandleLiteral156_0() throws Throwable;
private static native java.lang.Object __classLiteral156_1() throws Throwable;
private static native int __call156_2(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.invoke.MethodHandle __call156_3(java.lang.invoke.MethodHandle a0, java.lang.Object a1, int a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call156_7(java.lang.invoke.MethodHandle a0, int a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call156_8(java.lang.invoke.MethodHandle a0, java.lang.invoke.MethodType a1) throws Throwable;
private static native void __call156_9(java.lang.invoke.MutableCallSite a0, java.lang.invoke.MethodHandle a1) throws Throwable;
private static native java.lang.StringBuilder __call2015600_0(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2015600_1(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2015600_2(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2015600_3(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2015600_4(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.StringBuilder __call2015600_5(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2015600_6(java.lang.StringBuilder a0) throws Throwable;

}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) { return __sourceHandlerCall_ae0ba5437a2cc6b64afb(p0, p1, p2); }


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.qM.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.String a(int p0, long p1) { return __sourceHandlerCall_8283f27fc03421a476f2(p0, p1); }


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
        byte[] spill1280_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1280_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1280_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1280_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1280_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1280_2)[life4_9];
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
org.luaj.vm2.LuaValue forestValue176_26_0;
    int forestValue176_31_0;
    org.luaj.vm2.LuaValue forestValue176_47_0;
    int forestValue176_52_0;
    org.luaj.vm2.LuaValue forestValue176_68_0;
    org.luaj.vm2.LuaValue spill176_0;
    boolean spill176_1;
    org.luaj.vm2.LuaValue spill176_2;
    boolean spill176_3;
    org.luaj.vm2.LuaValue spill176_4;
    org.luaj.vm2.LuaValue spill176_5;
    long life4_3;
    int life6_5;
    forest_join_69: {
    forest_join_68: {
    forest_join_58: {
    forest_join_52: {
    forest_join_48: {
    forest_join_47: {
    forest_join_37: {
    forest_join_31: {
    forest_join_27: {
    forest_join_26: {
    forest_join_16: {
    life4_3 = (com.moon.qM.b ^ 19977386480749L);
    life6_5 = com.moon.jN.b();
    spill176_0 = p0;
    if (!((life6_5 != 0))) {
        forestValue176_26_0 = spill176_0;
        break forest_join_26;
    }
    if (!((!((org.luaj.vm2.LuaValue)(spill176_0)).isnil()))) {
        break forest_join_16;
    }
    spill176_1 = ((org.luaj.vm2.LuaValue)(p0)).isnumber();
    if (!((life6_5 != 0))) {
        forestValue176_31_0 = ((spill176_1) ? 1 : 0);
        break forest_join_31;
    }
    if (!((!spill176_1))) {
        break forest_join_27;
    }
    }
    java.lang.String __stackOp176_7_0 = ((org.luaj.vm2.LuaValue)(p0)).typename();
    java.lang.String __stackOp176_7_1 = __sourceIntrinsic_a297060148ac_invokedynamic176_6(18701, (718747302650741487L ^ life4_3));
    forestValue176_26_0 = org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_a297060148ac_invokedynamic176_8(__stackOp176_7_1, __stackOp176_7_0))));
    }
    return forestValue176_26_0;
    }
    spill176_2 = p1;
    if (!((life6_5 != 0))) {
        forestValue176_47_0 = spill176_2;
        break forest_join_47;
    }
    forestValue176_31_0 = ((((org.luaj.vm2.LuaValue)(spill176_2)).isnil()) ? 1 : 0);
    }
    if (!((forestValue176_31_0 == 0))) {
        break forest_join_37;
    }
    spill176_3 = ((org.luaj.vm2.LuaValue)(p1)).isnumber();
    if (!((life6_5 != 0))) {
        forestValue176_52_0 = ((spill176_3) ? 1 : 0);
        break forest_join_52;
    }
    if (!((!spill176_3))) {
        break forest_join_48;
    }
    }
    java.lang.String __stackOp176_16_0 = ((org.luaj.vm2.LuaValue)(p1)).typename();
    java.lang.String __stackOp176_16_1 = __sourceIntrinsic_a297060148ac_invokedynamic176_15(22187, (5036319829958237515L ^ life4_3));
    forestValue176_47_0 = org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_a297060148ac_invokedynamic176_17(__stackOp176_16_1, __stackOp176_16_0))));
    }
    return forestValue176_47_0;
    }
    spill176_4 = p2;
    if (!((life6_5 != 0))) {
        forestValue176_68_0 = spill176_4;
        break forest_join_68;
    }
    forestValue176_52_0 = ((((org.luaj.vm2.LuaValue)(spill176_4)).isnil()) ? 1 : 0);
    }
    if (!((forestValue176_52_0 == 0))) {
        break forest_join_58;
    }
    spill176_5 = p2;
    if (!((life6_5 != 0))) {
        forestValue176_68_0 = spill176_5;
        break forest_join_68;
    }
    if (!((!((org.luaj.vm2.LuaValue)(spill176_5)).isnumber()))) {
        break forest_join_69;
    }
    }
    java.lang.String __stackOp176_24_0 = ((org.luaj.vm2.LuaValue)(p2)).typename();
    java.lang.String __stackOp176_24_1 = __sourceIntrinsic_a297060148ac_invokedynamic176_23(18604, (463410589032907597L ^ life4_3));
    forestValue176_68_0 = org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_a297060148ac_invokedynamic176_25(__stackOp176_24_1, __stackOp176_24_0))));
    }
    return forestValue176_68_0;
    }
    return org.luaj.vm2.LuaValue.valueOf(((double)(((com.moon.j3)(((com.moon.jU)(this.a)).c)).distance_to(((float)(((org.luaj.vm2.LuaValue)(p0)).tofloat())), ((float)(((org.luaj.vm2.LuaValue)(p1)).tofloat())), ((float)(((org.luaj.vm2.LuaValue)(p2)).tofloat()))))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a297060148ac_invokedynamic176_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a297060148ac_invokedynamic176_8(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a297060148ac_invokedynamic176_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a297060148ac_invokedynamic176_17(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a297060148ac_invokedynamic176_23(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a297060148ac_invokedynamic176_25(java.lang.String a0, java.lang.String a1) throws E;
}
