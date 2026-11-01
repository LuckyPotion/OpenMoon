package com.moon;


class rp extends org.luaj.vm2.lib.VarArgFunction {

com.moon.jV a;

private static long b;

private static java.lang.String[] c;

private static java.lang.String[] d;

private static java.util.Map e;

public org.luaj.vm2.Varargs invoke(org.luaj.vm2.Varargs p0) {
int forestValue100070_40_0;
    int forestValue100070_56_0;
    int forestValue100070_74_0;
    org.luaj.vm2.LuaValue forestValue100070_99_0;
    int spill100070_0;
    boolean spill100070_1;
    org.luaj.vm2.LuaValue spill100070_2;
    long life2_3;
    org.luaj.vm2.LuaValue life5_8;
    org.luaj.vm2.LuaValue life6_12;
    org.luaj.vm2.LuaValue life7_16;
    org.luaj.vm2.LuaValue life8_20;
    int life4_21;
    forest_join_99: {
    forest_join_86: {
    forest_join_74: {
    forest_join_70: {
    forest_join_56: {
    forest_join_54: {
    forest_join_40: {
    forest_join_38: {
    life2_3 = (com.moon.rp.b ^ 134730869847610L);
    spill100070_0 = com.moon.jN.b();
    life5_8 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(1)));
    life6_12 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(2)));
    life7_16 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(3)));
    life8_20 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(4)));
    life4_21 = spill100070_0;
    spill100070_1 = ((org.luaj.vm2.LuaValue)(life5_8)).isnumber();
    if (!((life4_21 != 0))) {
        forestValue100070_40_0 = ((spill100070_1) ? 1 : 0);
        break forest_join_40;
    }
    if (!((!spill100070_1))) {
        break forest_join_38;
    }
    java.lang.String __stackOp100070_10_0 = ((org.luaj.vm2.LuaValue)(life5_8)).typename();
    java.lang.String __stackOp100070_10_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100070_9(10495, (7025067089340697746L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100070_11(__stackOp100070_10_1, __stackOp100070_10_0))));
    }
    forestValue100070_40_0 = ((((org.luaj.vm2.LuaValue)(life6_12)).isnumber()) ? 1 : 0);
    }
    if (!((life4_21 != 0))) {
        forestValue100070_56_0 = forestValue100070_40_0;
        break forest_join_56;
    }
    if (!((forestValue100070_40_0 == 0))) {
        break forest_join_54;
    }
    java.lang.String __stackOp100070_17_0 = ((org.luaj.vm2.LuaValue)(life6_12)).typename();
    java.lang.String __stackOp100070_17_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100070_16(31849, (1431541439211853829L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100070_18(__stackOp100070_17_1, __stackOp100070_17_0))));
    }
    forestValue100070_56_0 = ((((org.luaj.vm2.LuaValue)(life7_16)).isnumber()) ? 1 : 0);
    }
    if (!((life4_21 != 0))) {
        forestValue100070_74_0 = forestValue100070_56_0;
        break forest_join_74;
    }
    if (!((forestValue100070_56_0 == 0))) {
        break forest_join_70;
    }
    java.lang.String __stackOp100070_24_0 = ((org.luaj.vm2.LuaValue)(life7_16)).typename();
    java.lang.String __stackOp100070_24_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100070_23(14552, (1428503564327754935L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100070_25(__stackOp100070_24_1, __stackOp100070_24_0))));
    }
    spill100070_2 = life8_20;
    if (!((life4_21 != 0))) {
        forestValue100070_99_0 = spill100070_2;
        break forest_join_99;
    }
    forestValue100070_74_0 = ((((org.luaj.vm2.LuaValue)(spill100070_2)).isnumber()) ? 1 : 0);
    }
    if (!((forestValue100070_74_0 == 0))) {
        break forest_join_86;
    }
    java.lang.String __stackOp100070_31_0 = ((org.luaj.vm2.LuaValue)(life8_20)).typename();
    java.lang.String __stackOp100070_31_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100070_30(2878, (9009069103367499600L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100070_32(__stackOp100070_31_1, __stackOp100070_31_0))));
    }
    ((com.moon.j4)(((com.moon.jV)(this.a)).c)).blend_func_separate(((int)(((org.luaj.vm2.LuaValue)(life5_8)).toint())), ((int)(((org.luaj.vm2.LuaValue)(life6_12)).toint())), ((int)(((org.luaj.vm2.LuaValue)(life7_16)).toint())), ((int)(((org.luaj.vm2.LuaValue)(life8_20)).toint())));
    forestValue100070_99_0 = com.moon.rp.NIL;
    }
    return forestValue100070_99_0;
}


rp(com.moon.jV p0) { super(); }

private static void __sourceConstructorBody_bb82ff8035869ef4(com.moon.rp receiver, com.moon.jV p0) throws Throwable {
((com.moon.rp)(receiver)).a = ((com.moon.jV)(p0));
    com.moon.rp.__sourceConstructorInit_bb82ff8035869ef4_0(((com.moon.rp)(receiver)));
    return;
}


static {
javax.crypto.Cipher forestValue321_36_0;
    int forestValue321_36_1;
    javax.crypto.SecretKeyFactory forestValue321_36_2;
    byte[] forestValue321_36_3;
    javax.crypto.Cipher forestValue321_53_0;
    int forestValue321_53_1;
    javax.crypto.SecretKeyFactory forestValue321_53_2;
    byte[] forestValue321_53_3;
    java.lang.String forestValue321_86_0;
    int forestValue321_86_1;
    java.lang.String forestValue321_98_0;
    java.lang.String forestValue321_122_0;
    javax.crypto.Cipher spill321_0;
    int spill321_1;
    javax.crypto.SecretKeyFactory spill321_2;
    byte[] spill321_3;
    byte[] spill321_4;
    java.lang.String spill321_5;
    int spill321_6;
    java.lang.String spill321_7;
    java.lang.String[] spill321_8;
    java.lang.String[] spill321_9;
    java.lang.String spill321_10;
    java.lang.String spill321_11;
    int spill321_12;
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
    forest_join_153: {
    forest_join_53: {
    b = ((long)(((moom._a)(moom._c.a(((long)(-6766114374074091059L)), ((long)(-7910105812013083828L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(18139427362748L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    life0_16 = (com.moon.rp.b ^ 79966725501454L);
    spill321_0 = (life2_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill321_1 = 2;
    spill321_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp321_9_0 = new byte[8];
    spill321_3 = __stackOp321_9_0;
    (__stackOp321_9_0)[0] = ((byte) ((int) (life0_16 >>> 56)));
    life3_35 = 1;
    forestValue321_36_0 = spill321_0;
    forestValue321_36_1 = spill321_1;
    forestValue321_36_2 = spill321_2;
    forestValue321_36_3 = spill321_3;
    forest_cycle_36: while (true) {
    if (!((life3_35 < 8))) {
        forestValue321_53_0 = forestValue321_36_0;
        forestValue321_53_1 = forestValue321_36_1;
        forestValue321_53_2 = forestValue321_36_2;
        forestValue321_53_3 = forestValue321_36_3;
        break forest_join_53;
    }
    byte[] __stackOp321_10_0 = forestValue321_36_3;
    spill321_4 = __stackOp321_10_0;
    (__stackOp321_10_0)[life3_35] = ((byte) ((int) ((life0_16 << (life3_35 * 8)) >>> 56)));
    life3_35 += 1;
    forestValue321_36_3 = spill321_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue321_53_0)).init(((int)(forestValue321_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue321_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue321_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life9_66 = new java.lang.String[4];
    life7_68 = 0;
    life8_73 = ((java.lang.String)((life6_71 = "\031­\"[:Ý1y.¨:\000¶âÏooTîP ²\"\001þ 9õeËÝWÀYiHñ;\\\004AK\002\004AXþi\1778èSç À¡ºkÆ`ø\020n\023~\rd¤ÅÃ¬\033 :^²\036@[Je%ù<`¦\004u\0003)qï°A¿3Þ>\r_"))).length();
    life5_75 = 56;
    life4_77 = -1;
    forest_cycle_78: while (true) {
    forest_join_148: {
    life4_77 += 1;
    spill321_5 = life6_71;
    int __stackOp321_14_0 = life4_77;
    forestValue321_86_0 = ((java.lang.String)(spill321_5)).substring(((int)(__stackOp321_14_0)), ((int)((__stackOp321_14_0 + life5_75))));
    forestValue321_86_1 = -1;
    forest_cycle_86: while (true) {
    forest_join_139: {
    forest_join_122: {
    forest_join_112: {
    forest_join_98: {
    java.lang.String __stackOp321_16_0 = forestValue321_86_0;
    int __stackOp321_16_1 = forestValue321_86_1;
    spill321_6 = __stackOp321_16_1;
    byte[] __stackOp321_18_0 = ((java.lang.String)(__stackOp321_16_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp321_18_1 = life2_20;
    life10_93 = ((javax.crypto.Cipher)(__stackOp321_18_1)).doFinal(((byte[])(__stackOp321_18_0)));
    int __stackOp321_22_0 = spill321_6;
    java.lang.String __stackOp321_22_1 = ((java.lang.String)(com.moon.rp.a(((byte[])(life10_93))))).intern();
    spill321_7 = __stackOp321_22_1;
    switch (__stackOp321_22_0) {
default:
{
        forestValue321_98_0 = spill321_7;
        break forest_join_98;
    }
case 0:
{
        forestValue321_122_0 = spill321_7;
        break forest_join_122;
    }
}
    }
    java.lang.String __stackOp321_23_0 = forestValue321_98_0;
    java.lang.String[] __stackOp321_23_1 = life9_66;
    spill321_8 = __stackOp321_23_1;
    java.lang.String __stackOp321_24_0 = __stackOp321_23_0;
    int __stackOp321_24_1 = (life7_68++);
    (spill321_8)[__stackOp321_24_1] = __stackOp321_24_0;
    if (!(((life4_77 = (life4_77 + life5_75)) < life8_73))) {
        break forest_join_112;
    }
    break forest_join_148;
    }
    life8_73 = ((java.lang.String)((life6_71 = "®¨3S¾ÙÃöþHÄs×^¼ú\fÄ\004àr`\024bÁr\fx¹½~+¯v9eM\n\036´0`ëì!S6i­Ú4¦\017®zá\007\006ò\003 \022«+ÃdÇ7ª@\033Ò\t~¨·¹\002\030Ó\013E"))).length();
    life5_75 = 48;
    life4_77 = -1;
    break forest_join_139;
    }
    java.lang.String __stackOp321_26_0 = forestValue321_122_0;
    java.lang.String[] __stackOp321_26_1 = life9_66;
    spill321_9 = __stackOp321_26_1;
    java.lang.String __stackOp321_27_0 = __stackOp321_26_0;
    int __stackOp321_27_1 = (life7_68++);
    (spill321_9)[__stackOp321_27_1] = __stackOp321_27_0;
    if (!(((life4_77 = (life4_77 + life5_75)) < life8_73))) {
        break forest_join_153;
    }
    life5_75 = ((int)(((java.lang.String)(life6_71)).charAt(((int)(life4_77)))));
    }
    life4_77 += 1;
    spill321_10 = life6_71;
    int __stackOp321_30_0 = life4_77;
    spill321_11 = ((java.lang.String)(spill321_10)).substring(((int)(__stackOp321_30_0)), ((int)((__stackOp321_30_0 + life5_75))));
    spill321_12 = 0;
    forestValue321_86_0 = spill321_11;
    forestValue321_86_1 = spill321_12;
    continue forest_cycle_86;
    }
    }
    life5_75 = ((int)(((java.lang.String)(life6_71)).charAt(((int)(life4_77)))));
    continue forest_cycle_78;
    }
    }
    c = ((java.lang.String[])(life9_66));
    d = ((java.lang.String[])(new java.lang.String[4]));
}

private static native <E extends Throwable> void __sourceConstructorInit_bb82ff8035869ef4_0(com.moon.rp a0) throws E;
private static native <E extends Throwable> java.lang.String __sourceHandlerCall_50d12a45812cbe9fcc0c(int a0, long a1) throws E;
private static final class __SourceHandler_50d12a45812cbe9fcc0c {

public static java.lang.String f213(int p0, long p1) throws Throwable {
    int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 6052);
    if (((__fieldRead213_0())[life5_8] == null)) {
        life3_16 = __call213_3(__call213_2(__call213_1()));
        life4_21 = __cast213_6(__call213_5(__fieldRead213_4(), life3_16));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = __call213_7("DES/CBC/PKCS5Padding");
        (life4_21)[1] = __call213_8("DES");
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        __call213_10(__fieldRead213_9(), life3_16, life4_21);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_63: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = __call213_12(__cast213_11((life4_21)[1]), life7_92);
        __call213_15(__cast213_13((life4_21)[0]), 2, life8_99, __cast213_14((life4_21)[2]));
        life9_116 = __call213_17((__fieldRead213_16())[life5_8], "ISO-8859-1");
        (__fieldRead213_18())[life5_8] = __call213_21(__call213_20(__cast213_19((life4_21)[0]), life9_116));
    }
    return (__fieldRead213_22())[life5_8];
}
public static java.lang.String h213_0(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    throw new java.lang.RuntimeException("com/moon/rp", local1);
}
private static native java.lang.String[] __fieldRead213_0() throws Throwable;
private static native java.lang.Thread __call213_1() throws Throwable;
private static native long __call213_2(java.lang.Thread a0) throws Throwable;
private static native java.lang.Long __call213_3(long a0) throws Throwable;
private static native java.util.Map __fieldRead213_4() throws Throwable;
private static native java.lang.Object __call213_5(java.util.Map a0, java.lang.Long a1) throws Throwable;
private static native java.lang.Object[] __cast213_6(java.lang.Object a0) throws Throwable;
private static native javax.crypto.Cipher __call213_7(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call213_8(java.lang.String a0) throws Throwable;
private static native java.util.Map __fieldRead213_9() throws Throwable;
private static native java.lang.Object __call213_10(java.util.Map a0, java.lang.Long a1, java.lang.Object[] a2) throws Throwable;
private static native javax.crypto.SecretKeyFactory __cast213_11(java.lang.Object a0) throws Throwable;
private static native javax.crypto.SecretKey __call213_12(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native javax.crypto.Cipher __cast213_13(java.lang.Object a0) throws Throwable;
private static native javax.crypto.spec.IvParameterSpec __cast213_14(java.lang.Object a0) throws Throwable;
private static native void __call213_15(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native java.lang.String[] __fieldRead213_16() throws Throwable;
private static native byte[] __call213_17(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String[] __fieldRead213_18() throws Throwable;
private static native javax.crypto.Cipher __cast213_19(java.lang.Object a0) throws Throwable;
private static native byte[] __call213_20(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native java.lang.String __call213_21(byte[] a0) throws Throwable;
private static native java.lang.String[] __fieldRead213_22() throws Throwable;

}

private static native <E extends Throwable> java.lang.invoke.CallSite __sourceHandlerCall_4d989468d3a629e83345(java.lang.invoke.MethodHandles.Lookup a0, java.lang.String a1, java.lang.invoke.MethodType a2) throws E;
private static final class __SourceHandler_4d989468d3a629e83345 {

public static java.lang.invoke.CallSite f214(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.invoke.MutableCallSite life3_4;
    life3_4 = new java.lang.invoke.MutableCallSite(p2);
    java.lang.invoke.MutableCallSite spill214_0 = life3_4;
    java.lang.invoke.MethodHandle spill214_1 = __call214_3(__methodHandleLiteral214_0(), __classLiteral214_1(), __call214_2(p2));
    int spill214_2 = 0;
    java.lang.Object[] __stackOp214_4_0 = new java.lang.Object[3];
    java.lang.Object[] spill214_3 = __stackOp214_4_0;
    (__stackOp214_4_0)[0] = p0;
    java.lang.Object[] __stackOp214_5_0 = spill214_3;
    java.lang.Object[] spill214_4 = __stackOp214_5_0;
    (__stackOp214_5_0)[1] = life3_4;
    java.lang.Object[] __stackOp214_6_0 = spill214_4;
    java.lang.Object[] spill214_5 = __stackOp214_6_0;
    (__stackOp214_6_0)[2] = p1;
    __call214_9(spill214_0, __call214_8(__call214_7(spill214_1, spill214_2, spill214_5), p2));
    return life3_4;
}
public static java.lang.invoke.CallSite h214_0(java.lang.Exception p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.Exception local3 = p0;
    throw new java.lang.RuntimeException(__call2021400_6(__call2021400_5(__call2021400_3(__call2021400_2(__call2021400_1(__call2021400_0(new java.lang.StringBuilder(), "com/moon/rp"), " : "), p1), " : "), __call2021400_4(p2))), local3);
}
private static native java.lang.invoke.MethodHandle __methodHandleLiteral214_0() throws Throwable;
private static native java.lang.Object __classLiteral214_1() throws Throwable;
private static native int __call214_2(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.invoke.MethodHandle __call214_3(java.lang.invoke.MethodHandle a0, java.lang.Object a1, int a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call214_7(java.lang.invoke.MethodHandle a0, int a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call214_8(java.lang.invoke.MethodHandle a0, java.lang.invoke.MethodType a1) throws Throwable;
private static native void __call214_9(java.lang.invoke.MutableCallSite a0, java.lang.invoke.MethodHandle a1) throws Throwable;
private static native java.lang.StringBuilder __call2021400_0(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2021400_1(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2021400_2(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2021400_3(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2021400_4(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.StringBuilder __call2021400_5(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2021400_6(java.lang.StringBuilder a0) throws Throwable;

}


private static java.lang.String a(int p0, long p1) { return __sourceHandlerCall_50d12a45812cbe9fcc0c(p0, p1); }


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.rp.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) { return __sourceHandlerCall_4d989468d3a629e83345(p0, p1, p2); }


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
        byte[] spill1386_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1386_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1386_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1386_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1386_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1386_2)[life4_9];
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


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100070_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100070_11(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100070_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100070_18(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100070_23(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100070_25(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100070_30(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100070_32(java.lang.String a0, java.lang.String a1) throws E;
}
