package com.moon;


class qJ extends org.luaj.vm2.lib.ThreeArgFunction {

com.moon.jQ a;

private static long b;

private static java.lang.String[] c;

private static java.lang.String[] d;

private static java.util.Map e;

qJ(com.moon.jQ p0) { super(); }

private static void __sourceConstructorBody_8e702dff6bde1349(com.moon.qJ receiver, com.moon.jQ p0) throws Throwable {
((com.moon.qJ)(receiver)).a = ((com.moon.jQ)(p0));
    com.moon.qJ.__sourceConstructorInit_8e702dff6bde1349_0(((com.moon.qJ)(receiver)));
    return;
}


static {
javax.crypto.Cipher forestValue169_36_0;
    int forestValue169_36_1;
    javax.crypto.SecretKeyFactory forestValue169_36_2;
    byte[] forestValue169_36_3;
    javax.crypto.Cipher forestValue169_53_0;
    int forestValue169_53_1;
    javax.crypto.SecretKeyFactory forestValue169_53_2;
    byte[] forestValue169_53_3;
    java.lang.String forestValue169_86_0;
    int forestValue169_86_1;
    java.lang.String forestValue169_98_0;
    java.lang.String forestValue169_122_0;
    javax.crypto.Cipher spill169_0;
    int spill169_1;
    javax.crypto.SecretKeyFactory spill169_2;
    byte[] spill169_3;
    byte[] spill169_4;
    java.lang.String spill169_5;
    int spill169_6;
    java.lang.String spill169_7;
    java.lang.String[] spill169_8;
    java.lang.String[] spill169_9;
    java.lang.String spill169_10;
    java.lang.String spill169_11;
    int spill169_12;
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
    b = ((long)(((moom._a)(moom._c.a(((long)(7635190986720745861L)), ((long)(-654064714172799928L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(82245317699390L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    life0_16 = (com.moon.qJ.b ^ 46230163874752L);
    spill169_0 = (life2_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill169_1 = 2;
    spill169_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp169_9_0 = new byte[8];
    spill169_3 = __stackOp169_9_0;
    (__stackOp169_9_0)[0] = ((byte) ((int) (life0_16 >>> 56)));
    life3_35 = 1;
    forestValue169_36_0 = spill169_0;
    forestValue169_36_1 = spill169_1;
    forestValue169_36_2 = spill169_2;
    forestValue169_36_3 = spill169_3;
    forest_cycle_36: while (true) {
    if (!((life3_35 < 8))) {
        forestValue169_53_0 = forestValue169_36_0;
        forestValue169_53_1 = forestValue169_36_1;
        forestValue169_53_2 = forestValue169_36_2;
        forestValue169_53_3 = forestValue169_36_3;
        break forest_join_53;
    }
    byte[] __stackOp169_10_0 = forestValue169_36_3;
    spill169_4 = __stackOp169_10_0;
    (__stackOp169_10_0)[life3_35] = ((byte) ((int) ((life0_16 << (life3_35 * 8)) >>> 56)));
    life3_35 += 1;
    forestValue169_36_3 = spill169_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue169_53_0)).init(((int)(forestValue169_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue169_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue169_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life9_66 = new java.lang.String[4];
    life7_68 = 0;
    life8_73 = ((java.lang.String)((life6_71 = "ä¯´R\026£¯»º:\022&\0130ÃÁ\002Ç¶á\033\013÷PU¦Ï\027\003¹\003SH\\\036'C\021¼n.þ}Sà¹ÀK#Aª-¹×§»8¾dÁ&yqØ\027@½È×Ø\0069\002.W\002V%mtÇÜ\032\005Û\032â/{\002[:Ù\034,íDÖmì\002£¸\f8Î\016®LÂ)qù+ fäÄ9D)+\003\f^"))).length();
    life5_75 = 72;
    life4_77 = -1;
    forest_cycle_78: while (true) {
    forest_join_148: {
    life4_77 += 1;
    spill169_5 = life6_71;
    int __stackOp169_14_0 = life4_77;
    forestValue169_86_0 = ((java.lang.String)(spill169_5)).substring(((int)(__stackOp169_14_0)), ((int)((__stackOp169_14_0 + life5_75))));
    forestValue169_86_1 = -1;
    forest_cycle_86: while (true) {
    forest_join_139: {
    forest_join_122: {
    forest_join_112: {
    forest_join_98: {
    java.lang.String __stackOp169_16_0 = forestValue169_86_0;
    int __stackOp169_16_1 = forestValue169_86_1;
    spill169_6 = __stackOp169_16_1;
    byte[] __stackOp169_18_0 = ((java.lang.String)(__stackOp169_16_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp169_18_1 = life2_20;
    life10_93 = ((javax.crypto.Cipher)(__stackOp169_18_1)).doFinal(((byte[])(__stackOp169_18_0)));
    int __stackOp169_22_0 = spill169_6;
    java.lang.String __stackOp169_22_1 = ((java.lang.String)(com.moon.qJ.a(((byte[])(life10_93))))).intern();
    spill169_7 = __stackOp169_22_1;
    switch (__stackOp169_22_0) {
default:
{
        forestValue169_98_0 = spill169_7;
        break forest_join_98;
    }
case 0:
{
        forestValue169_122_0 = spill169_7;
        break forest_join_122;
    }
}
    }
    java.lang.String __stackOp169_23_0 = forestValue169_98_0;
    java.lang.String[] __stackOp169_23_1 = life9_66;
    spill169_8 = __stackOp169_23_1;
    java.lang.String __stackOp169_24_0 = __stackOp169_23_0;
    int __stackOp169_24_1 = (life7_68++);
    (spill169_8)[__stackOp169_24_1] = __stackOp169_24_0;
    if (!(((life4_77 = (life4_77 + life5_75)) < life8_73))) {
        break forest_join_112;
    }
    break forest_join_148;
    }
    life8_73 = ((java.lang.String)((life6_71 = "µnà\023}I\000jÖI-&g·²¦ñPV$um&ï!þÅøß»7i5M(|¼X5i\013\025 æ8¬<\034.Ä»­#qxKW°âh¬#<3\027rFÁù¹JSöK¤CÈH~aRâkTNÿ1 i3·éÒªõ"))).length();
    life5_75 = 48;
    life4_77 = -1;
    break forest_join_139;
    }
    java.lang.String __stackOp169_26_0 = forestValue169_122_0;
    java.lang.String[] __stackOp169_26_1 = life9_66;
    spill169_9 = __stackOp169_26_1;
    java.lang.String __stackOp169_27_0 = __stackOp169_26_0;
    int __stackOp169_27_1 = (life7_68++);
    (spill169_9)[__stackOp169_27_1] = __stackOp169_27_0;
    if (!(((life4_77 = (life4_77 + life5_75)) < life8_73))) {
        break forest_join_153;
    }
    life5_75 = ((int)(((java.lang.String)(life6_71)).charAt(((int)(life4_77)))));
    }
    life4_77 += 1;
    spill169_10 = life6_71;
    int __stackOp169_30_0 = life4_77;
    spill169_11 = ((java.lang.String)(spill169_10)).substring(((int)(__stackOp169_30_0)), ((int)((__stackOp169_30_0 + life5_75))));
    spill169_12 = 0;
    forestValue169_86_0 = spill169_11;
    forestValue169_86_1 = spill169_12;
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

private static native <E extends Throwable> void __sourceConstructorInit_8e702dff6bde1349_0(com.moon.qJ a0) throws E;
private static native <E extends Throwable> java.lang.String __sourceHandlerCall_c960d874141c876fec24(int a0, long a1) throws E;
private static final class __SourceHandler_c960d874141c876fec24 {

public static java.lang.String f149(int p0, long p1) throws Throwable {
    int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 17307);
    if (((__fieldRead149_0())[life5_8] == null)) {
        life3_16 = __call149_3(__call149_2(__call149_1()));
        life4_21 = __cast149_6(__call149_5(__fieldRead149_4(), life3_16));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = __call149_7("DES/CBC/PKCS5Padding");
        (life4_21)[1] = __call149_8("DES");
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        __call149_10(__fieldRead149_9(), life3_16, life4_21);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_63: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = __call149_12(__cast149_11((life4_21)[1]), life7_92);
        __call149_15(__cast149_13((life4_21)[0]), 2, life8_99, __cast149_14((life4_21)[2]));
        life9_116 = __call149_17((__fieldRead149_16())[life5_8], "ISO-8859-1");
        (__fieldRead149_18())[life5_8] = __call149_21(__call149_20(__cast149_19((life4_21)[0]), life9_116));
    }
    return (__fieldRead149_22())[life5_8];
}
public static java.lang.String h149_0(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    throw new java.lang.RuntimeException("com/moon/qJ", local1);
}
private static native java.lang.String[] __fieldRead149_0() throws Throwable;
private static native java.lang.Thread __call149_1() throws Throwable;
private static native long __call149_2(java.lang.Thread a0) throws Throwable;
private static native java.lang.Long __call149_3(long a0) throws Throwable;
private static native java.util.Map __fieldRead149_4() throws Throwable;
private static native java.lang.Object __call149_5(java.util.Map a0, java.lang.Long a1) throws Throwable;
private static native java.lang.Object[] __cast149_6(java.lang.Object a0) throws Throwable;
private static native javax.crypto.Cipher __call149_7(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call149_8(java.lang.String a0) throws Throwable;
private static native java.util.Map __fieldRead149_9() throws Throwable;
private static native java.lang.Object __call149_10(java.util.Map a0, java.lang.Long a1, java.lang.Object[] a2) throws Throwable;
private static native javax.crypto.SecretKeyFactory __cast149_11(java.lang.Object a0) throws Throwable;
private static native javax.crypto.SecretKey __call149_12(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native javax.crypto.Cipher __cast149_13(java.lang.Object a0) throws Throwable;
private static native javax.crypto.spec.IvParameterSpec __cast149_14(java.lang.Object a0) throws Throwable;
private static native void __call149_15(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native java.lang.String[] __fieldRead149_16() throws Throwable;
private static native byte[] __call149_17(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String[] __fieldRead149_18() throws Throwable;
private static native javax.crypto.Cipher __cast149_19(java.lang.Object a0) throws Throwable;
private static native byte[] __call149_20(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native java.lang.String __call149_21(byte[] a0) throws Throwable;
private static native java.lang.String[] __fieldRead149_22() throws Throwable;

}

private static native <E extends Throwable> java.lang.invoke.CallSite __sourceHandlerCall_a39d1c516c5cc1cd7eee(java.lang.invoke.MethodHandles.Lookup a0, java.lang.String a1, java.lang.invoke.MethodType a2) throws E;
private static final class __SourceHandler_a39d1c516c5cc1cd7eee {

public static java.lang.invoke.CallSite f150(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.invoke.MutableCallSite life3_4;
    life3_4 = new java.lang.invoke.MutableCallSite(p2);
    java.lang.invoke.MutableCallSite spill150_0 = life3_4;
    java.lang.invoke.MethodHandle spill150_1 = __call150_3(__methodHandleLiteral150_0(), __classLiteral150_1(), __call150_2(p2));
    int spill150_2 = 0;
    java.lang.Object[] __stackOp150_4_0 = new java.lang.Object[3];
    java.lang.Object[] spill150_3 = __stackOp150_4_0;
    (__stackOp150_4_0)[0] = p0;
    java.lang.Object[] __stackOp150_5_0 = spill150_3;
    java.lang.Object[] spill150_4 = __stackOp150_5_0;
    (__stackOp150_5_0)[1] = life3_4;
    java.lang.Object[] __stackOp150_6_0 = spill150_4;
    java.lang.Object[] spill150_5 = __stackOp150_6_0;
    (__stackOp150_6_0)[2] = p1;
    __call150_9(spill150_0, __call150_8(__call150_7(spill150_1, spill150_2, spill150_5), p2));
    return life3_4;
}
public static java.lang.invoke.CallSite h150_0(java.lang.Exception p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.Exception local3 = p0;
    throw new java.lang.RuntimeException(__call2015000_6(__call2015000_5(__call2015000_3(__call2015000_2(__call2015000_1(__call2015000_0(new java.lang.StringBuilder(), "com/moon/qJ"), " : "), p1), " : "), __call2015000_4(p2))), local3);
}
private static native java.lang.invoke.MethodHandle __methodHandleLiteral150_0() throws Throwable;
private static native java.lang.Object __classLiteral150_1() throws Throwable;
private static native int __call150_2(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.invoke.MethodHandle __call150_3(java.lang.invoke.MethodHandle a0, java.lang.Object a1, int a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call150_7(java.lang.invoke.MethodHandle a0, int a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call150_8(java.lang.invoke.MethodHandle a0, java.lang.invoke.MethodType a1) throws Throwable;
private static native void __call150_9(java.lang.invoke.MutableCallSite a0, java.lang.invoke.MethodHandle a1) throws Throwable;
private static native java.lang.StringBuilder __call2015000_0(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2015000_1(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2015000_2(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2015000_3(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2015000_4(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.StringBuilder __call2015000_5(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2015000_6(java.lang.StringBuilder a0) throws Throwable;

}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) { return __sourceHandlerCall_a39d1c516c5cc1cd7eee(p0, p1, p2); }


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.qJ.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.String a(int p0, long p1) { return __sourceHandlerCall_c960d874141c876fec24(p0, p1); }


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
        byte[] spill1274_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1274_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1274_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1274_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1274_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1274_2)[life4_9];
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
java.lang.Object forestValue175_25_0;
    java.lang.Object forestValue175_32_0;
    int forestValue175_67_0;
    org.luaj.vm2.LuaValue forestValue175_78_0;
    org.luaj.vm2.LuaValue spill175_0;
    java.lang.Object spill175_1;
    boolean spill175_2;
    org.luaj.vm2.LuaValue spill175_3;
    long life4_3;
    int life6_5;
    java.lang.Object life7_26;
    com.moon.scripting.api.enums.CustomFontType life8_36;
    forest_join_79: {
    forest_join_78: {
    forest_join_67: {
    forest_join_63: {
    forest_join_47: {
    forest_join_36: {
    forest_join_32: {
    forest_join_25: {
    forest_join_22: {
    life4_3 = (com.moon.qJ.b ^ 6298323272703L);
    life6_5 = com.moon.jN.c();
    spill175_0 = p0;
    if (!((life6_5 == 0))) {
        forestValue175_25_0 = spill175_0;
        break forest_join_25;
    }
    if (!(((org.luaj.vm2.LuaValue)(spill175_0)).isnil())) {
        break forest_join_22;
    }
    java.lang.String __stackOp175_5_0 = ((org.luaj.vm2.LuaValue)(p0)).typename();
    java.lang.String __stackOp175_5_1 = __sourceIntrinsic_a297060148ac_invokedynamic175_4(22798, (6999450411969166559L ^ life4_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_a297060148ac_invokedynamic175_6(__stackOp175_5_1, __stackOp175_5_0))));
    }
    forestValue175_25_0 = org.luaj.vm2.lib.jse.CoerceLuaToJava.coerce(((org.luaj.vm2.LuaValue)(p0)), ((java.lang.Class)(java.lang.Object.class)));
    }
    life7_26 = forestValue175_25_0;
    spill175_1 = life7_26;
    if (!((life6_5 == 0))) {
        forestValue175_32_0 = spill175_1;
        break forest_join_32;
    }
    if (!((((spill175_1 instanceof com.moon.scripting.api.enums.CustomFontType) ? 1 : 0) != 0))) {
        break forest_join_36;
    }
    forestValue175_32_0 = life7_26;
    }
    life8_36 = ((com.moon.scripting.api.enums.CustomFontType)(forestValue175_32_0));
    if (!((life6_5 != 0))) {
        break forest_join_47;
    }
    }
    java.lang.String __stackOp175_14_0 = ((org.luaj.vm2.LuaValue)(p0)).typename();
    java.lang.String __stackOp175_14_1 = __sourceIntrinsic_a297060148ac_invokedynamic175_13(13757, (5679346182925766765L ^ life4_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_a297060148ac_invokedynamic175_15(__stackOp175_14_1, __stackOp175_14_0))));
    }
    spill175_2 = ((org.luaj.vm2.LuaValue)(p1)).isnumber();
    if (!((life6_5 == 0))) {
        forestValue175_67_0 = ((spill175_2) ? 1 : 0);
        break forest_join_67;
    }
    if (!((!spill175_2))) {
        break forest_join_63;
    }
    java.lang.String __stackOp175_21_0 = ((org.luaj.vm2.LuaValue)(p0)).typename();
    java.lang.String __stackOp175_21_1 = __sourceIntrinsic_a297060148ac_invokedynamic175_20(4400, (4272009080261440738L ^ life4_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_a297060148ac_invokedynamic175_22(__stackOp175_21_1, __stackOp175_21_0))));
    }
    spill175_3 = p2;
    if (!((life6_5 == 0))) {
        forestValue175_78_0 = spill175_3;
        break forest_join_78;
    }
    forestValue175_67_0 = ((((org.luaj.vm2.LuaValue)(spill175_3)).isstring()) ? 1 : 0);
    }
    if (!((forestValue175_67_0 == 0))) {
        break forest_join_79;
    }
    java.lang.String __stackOp175_28_0 = ((org.luaj.vm2.LuaValue)(p0)).typename();
    java.lang.String __stackOp175_28_1 = __sourceIntrinsic_a297060148ac_invokedynamic175_27(30151, (3850830930614554644L ^ life4_3));
    forestValue175_78_0 = org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_a297060148ac_invokedynamic175_29(__stackOp175_28_1, __stackOp175_28_0))));
    }
    return forestValue175_78_0;
    }
    return org.luaj.vm2.LuaValue.valueOf(((double)(((double) ((com.moon.jZ)(((com.moon.jQ)(this.a)).c)).height(((com.moon.scripting.api.enums.CustomFontType)(life8_36)), ((float)(((org.luaj.vm2.LuaValue)(p1)).tofloat())), ((java.lang.String)(((org.luaj.vm2.LuaValue)(p2)).tojstring())))))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a297060148ac_invokedynamic175_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a297060148ac_invokedynamic175_6(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a297060148ac_invokedynamic175_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a297060148ac_invokedynamic175_15(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a297060148ac_invokedynamic175_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a297060148ac_invokedynamic175_22(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a297060148ac_invokedynamic175_27(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a297060148ac_invokedynamic175_29(java.lang.String a0, java.lang.String a1) throws E;
}
