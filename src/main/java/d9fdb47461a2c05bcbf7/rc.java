package com.moon;


class rc extends org.luaj.vm2.lib.VarArgFunction {

com.moon.jR a;

private static long b;

private static java.lang.String[] c;

private static java.lang.String[] d;

private static java.util.Map e;

public org.luaj.vm2.Varargs invoke(org.luaj.vm2.Varargs p0) {
int forestValue100059_44_0;
    int forestValue100059_60_0;
    int forestValue100059_76_0;
    int forestValue100059_94_0;
    org.luaj.vm2.LuaValue forestValue100059_121_0;
    int spill100059_0;
    boolean spill100059_1;
    org.luaj.vm2.LuaValue spill100059_2;
    long life2_3;
    org.luaj.vm2.LuaValue life5_8;
    org.luaj.vm2.LuaValue life6_12;
    org.luaj.vm2.LuaValue life7_16;
    org.luaj.vm2.LuaValue life8_20;
    org.luaj.vm2.LuaValue life9_24;
    int life4_25;
    forest_join_121: {
    forest_join_106: {
    forest_join_94: {
    forest_join_90: {
    forest_join_76: {
    forest_join_74: {
    forest_join_60: {
    forest_join_58: {
    forest_join_44: {
    forest_join_42: {
    life2_3 = (com.moon.rc.b ^ 45207570232852L);
    spill100059_0 = com.moon.jN.b();
    life5_8 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(1)));
    life6_12 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(2)));
    life7_16 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(3)));
    life8_20 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(4)));
    life9_24 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(5)));
    life4_25 = spill100059_0;
    spill100059_1 = ((org.luaj.vm2.LuaValue)(life5_8)).isstring();
    if (!((life4_25 != 0))) {
        forestValue100059_44_0 = ((spill100059_1) ? 1 : 0);
        break forest_join_44;
    }
    if (!((!spill100059_1))) {
        break forest_join_42;
    }
    java.lang.String __stackOp100059_11_0 = ((org.luaj.vm2.LuaValue)(life5_8)).typename();
    java.lang.String __stackOp100059_11_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100059_10(3231, (7655035769452816303L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100059_12(__stackOp100059_11_1, __stackOp100059_11_0))));
    }
    forestValue100059_44_0 = ((((org.luaj.vm2.LuaValue)(life6_12)).isnumber()) ? 1 : 0);
    }
    if (!((life4_25 != 0))) {
        forestValue100059_60_0 = forestValue100059_44_0;
        break forest_join_60;
    }
    if (!((forestValue100059_44_0 == 0))) {
        break forest_join_58;
    }
    java.lang.String __stackOp100059_18_0 = ((org.luaj.vm2.LuaValue)(life6_12)).typename();
    java.lang.String __stackOp100059_18_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100059_17(15204, (7198717314040025173L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100059_19(__stackOp100059_18_1, __stackOp100059_18_0))));
    }
    forestValue100059_60_0 = ((((org.luaj.vm2.LuaValue)(life7_16)).isnumber()) ? 1 : 0);
    }
    if (!((life4_25 != 0))) {
        forestValue100059_76_0 = forestValue100059_60_0;
        break forest_join_76;
    }
    if (!((forestValue100059_60_0 == 0))) {
        break forest_join_74;
    }
    java.lang.String __stackOp100059_25_0 = ((org.luaj.vm2.LuaValue)(life7_16)).typename();
    java.lang.String __stackOp100059_25_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100059_24(11473, (4232310885906696162L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100059_26(__stackOp100059_25_1, __stackOp100059_25_0))));
    }
    forestValue100059_76_0 = ((((org.luaj.vm2.LuaValue)(life8_20)).isnumber()) ? 1 : 0);
    }
    if (!((life4_25 != 0))) {
        forestValue100059_94_0 = forestValue100059_76_0;
        break forest_join_94;
    }
    if (!((forestValue100059_76_0 == 0))) {
        break forest_join_90;
    }
    java.lang.String __stackOp100059_32_0 = ((org.luaj.vm2.LuaValue)(life8_20)).typename();
    java.lang.String __stackOp100059_32_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100059_31(4041, (1638426487688160509L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100059_33(__stackOp100059_32_1, __stackOp100059_32_0))));
    }
    spill100059_2 = life9_24;
    if (!((life4_25 != 0))) {
        forestValue100059_121_0 = spill100059_2;
        break forest_join_121;
    }
    forestValue100059_94_0 = ((((org.luaj.vm2.LuaValue)(spill100059_2)).isboolean()) ? 1 : 0);
    }
    if (!((forestValue100059_94_0 == 0))) {
        break forest_join_106;
    }
    java.lang.String __stackOp100059_39_0 = ((org.luaj.vm2.LuaValue)(life9_24)).typename();
    java.lang.String __stackOp100059_39_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100059_38(11024, (3998929887327764514L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100059_40(__stackOp100059_39_1, __stackOp100059_39_0))));
    }
    ((com.moon.j0)(((com.moon.jR)(this.a)).c)).minecraft_text(((java.lang.String)(((org.luaj.vm2.LuaValue)(life5_8)).tojstring())), ((float)(((org.luaj.vm2.LuaValue)(life6_12)).tofloat())), ((float)(((org.luaj.vm2.LuaValue)(life7_16)).tofloat())), ((int)(((org.luaj.vm2.LuaValue)(life8_20)).toint())), ((boolean)(((org.luaj.vm2.LuaValue)(life9_24)).toboolean())));
    forestValue100059_121_0 = com.moon.rc.NIL;
    }
    return forestValue100059_121_0;
}


rc(com.moon.jR p0) { super(); }

private static void __sourceConstructorBody_dd87b91ab1245793(com.moon.rc receiver, com.moon.jR p0) throws Throwable {
((com.moon.rc)(receiver)).a = ((com.moon.jR)(p0));
    com.moon.rc.__sourceConstructorInit_dd87b91ab1245793_0(((com.moon.rc)(receiver)));
    return;
}


static {
javax.crypto.Cipher forestValue295_36_0;
    int forestValue295_36_1;
    javax.crypto.SecretKeyFactory forestValue295_36_2;
    byte[] forestValue295_36_3;
    javax.crypto.Cipher forestValue295_53_0;
    int forestValue295_53_1;
    javax.crypto.SecretKeyFactory forestValue295_53_2;
    byte[] forestValue295_53_3;
    java.lang.String forestValue295_86_0;
    int forestValue295_86_1;
    java.lang.String forestValue295_98_0;
    java.lang.String forestValue295_122_0;
    javax.crypto.Cipher spill295_0;
    int spill295_1;
    javax.crypto.SecretKeyFactory spill295_2;
    byte[] spill295_3;
    byte[] spill295_4;
    java.lang.String spill295_5;
    int spill295_6;
    java.lang.String spill295_7;
    java.lang.String[] spill295_8;
    java.lang.String[] spill295_9;
    java.lang.String spill295_10;
    java.lang.String spill295_11;
    int spill295_12;
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
    b = ((long)(((moom._a)(moom._c.a(((long)(2387571219666334484L)), ((long)(5858280988745198269L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(24043562218543L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    life0_16 = (com.moon.rc.b ^ 121040655420819L);
    spill295_0 = (life2_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill295_1 = 2;
    spill295_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp295_9_0 = new byte[8];
    spill295_3 = __stackOp295_9_0;
    (__stackOp295_9_0)[0] = ((byte) ((int) (life0_16 >>> 56)));
    life3_35 = 1;
    forestValue295_36_0 = spill295_0;
    forestValue295_36_1 = spill295_1;
    forestValue295_36_2 = spill295_2;
    forestValue295_36_3 = spill295_3;
    forest_cycle_36: while (true) {
    if (!((life3_35 < 8))) {
        forestValue295_53_0 = forestValue295_36_0;
        forestValue295_53_1 = forestValue295_36_1;
        forestValue295_53_2 = forestValue295_36_2;
        forestValue295_53_3 = forestValue295_36_3;
        break forest_join_53;
    }
    byte[] __stackOp295_10_0 = forestValue295_36_3;
    spill295_4 = __stackOp295_10_0;
    (__stackOp295_10_0)[life3_35] = ((byte) ((int) ((life0_16 << (life3_35 * 8)) >>> 56)));
    life3_35 += 1;
    forestValue295_36_3 = spill295_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue295_53_0)).init(((int)(forestValue295_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue295_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue295_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life9_66 = new java.lang.String[5];
    life7_68 = 0;
    life8_73 = ((java.lang.String)((life6_71 = "1ûÔþ´\0216×EìãZ¥tÞºöh}©¯%è~´\035<²F@kØ»ú¡\"ËýõÞY%»Bw\nÙÃ {0Z,!î´ñ>\030­=²]0l*'t/\023»)\b½lÖgLµÒÖ_ÊmØÎÔ¿\"Ès\036Ï%@D~É¦kí´\022o\031ML[s N%x\002ÀåqIà+×5À1äÇý½«\002ê-Á Jä­a9&g\034³\030üGÔæ®"))).length();
    life5_75 = 56;
    life4_77 = -1;
    forest_cycle_78: while (true) {
    forest_join_148: {
    life4_77 += 1;
    spill295_5 = life6_71;
    int __stackOp295_14_0 = life4_77;
    forestValue295_86_0 = ((java.lang.String)(spill295_5)).substring(((int)(__stackOp295_14_0)), ((int)((__stackOp295_14_0 + life5_75))));
    forestValue295_86_1 = -1;
    forest_cycle_86: while (true) {
    forest_join_139: {
    forest_join_122: {
    forest_join_112: {
    forest_join_98: {
    java.lang.String __stackOp295_16_0 = forestValue295_86_0;
    int __stackOp295_16_1 = forestValue295_86_1;
    spill295_6 = __stackOp295_16_1;
    byte[] __stackOp295_18_0 = ((java.lang.String)(__stackOp295_16_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp295_18_1 = life2_20;
    life10_93 = ((javax.crypto.Cipher)(__stackOp295_18_1)).doFinal(((byte[])(__stackOp295_18_0)));
    int __stackOp295_22_0 = spill295_6;
    java.lang.String __stackOp295_22_1 = ((java.lang.String)(com.moon.rc.a(((byte[])(life10_93))))).intern();
    spill295_7 = __stackOp295_22_1;
    switch (__stackOp295_22_0) {
default:
{
        forestValue295_98_0 = spill295_7;
        break forest_join_98;
    }
case 0:
{
        forestValue295_122_0 = spill295_7;
        break forest_join_122;
    }
}
    }
    java.lang.String __stackOp295_23_0 = forestValue295_98_0;
    java.lang.String[] __stackOp295_23_1 = life9_66;
    spill295_8 = __stackOp295_23_1;
    java.lang.String __stackOp295_24_0 = __stackOp295_23_0;
    int __stackOp295_24_1 = (life7_68++);
    (spill295_8)[__stackOp295_24_1] = __stackOp295_24_0;
    if (!(((life4_77 = (life4_77 + life5_75)) < life8_73))) {
        break forest_join_112;
    }
    break forest_join_148;
    }
    life8_73 = ((java.lang.String)((life6_71 = "¿aê:¼þÓ^v«õè1\032WÛoK»C4\006\017¼ÇÔð©¿\003\"ÔþVÇ\003@Ü°¡î\016 m=Þ$À(Þ8ZÚçü\003'ñgåÎiNI7¸¬Jj¾%éO¤ÔjíQõãFP?0%s\001;±²ï\"æµ;\031]H~\002"))).length();
    life5_75 = 56;
    life4_77 = -1;
    break forest_join_139;
    }
    java.lang.String __stackOp295_26_0 = forestValue295_122_0;
    java.lang.String[] __stackOp295_26_1 = life9_66;
    spill295_9 = __stackOp295_26_1;
    java.lang.String __stackOp295_27_0 = __stackOp295_26_0;
    int __stackOp295_27_1 = (life7_68++);
    (spill295_9)[__stackOp295_27_1] = __stackOp295_27_0;
    if (!(((life4_77 = (life4_77 + life5_75)) < life8_73))) {
        break forest_join_153;
    }
    life5_75 = ((int)(((java.lang.String)(life6_71)).charAt(((int)(life4_77)))));
    }
    life4_77 += 1;
    spill295_10 = life6_71;
    int __stackOp295_30_0 = life4_77;
    spill295_11 = ((java.lang.String)(spill295_10)).substring(((int)(__stackOp295_30_0)), ((int)((__stackOp295_30_0 + life5_75))));
    spill295_12 = 0;
    forestValue295_86_0 = spill295_11;
    forestValue295_86_1 = spill295_12;
    continue forest_cycle_86;
    }
    }
    life5_75 = ((int)(((java.lang.String)(life6_71)).charAt(((int)(life4_77)))));
    continue forest_cycle_78;
    }
    }
    c = ((java.lang.String[])(life9_66));
    d = ((java.lang.String[])(new java.lang.String[5]));
}

private static native <E extends Throwable> void __sourceConstructorInit_dd87b91ab1245793_0(com.moon.rc a0) throws E;
private static native <E extends Throwable> java.lang.String __sourceHandlerCall_2d4f4b3c0bc70ca29c6f(int a0, long a1) throws E;
private static final class __SourceHandler_2d4f4b3c0bc70ca29c6f {

public static java.lang.String f184(int p0, long p1) throws Throwable {
    int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 12765);
    if (((__fieldRead184_0())[life5_8] == null)) {
        life3_16 = __call184_3(__call184_2(__call184_1()));
        life4_21 = __cast184_6(__call184_5(__fieldRead184_4(), life3_16));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = __call184_7("DES/CBC/PKCS5Padding");
        (life4_21)[1] = __call184_8("DES");
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        __call184_10(__fieldRead184_9(), life3_16, life4_21);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_63: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = __call184_12(__cast184_11((life4_21)[1]), life7_92);
        __call184_15(__cast184_13((life4_21)[0]), 2, life8_99, __cast184_14((life4_21)[2]));
        life9_116 = __call184_17((__fieldRead184_16())[life5_8], "ISO-8859-1");
        (__fieldRead184_18())[life5_8] = __call184_21(__call184_20(__cast184_19((life4_21)[0]), life9_116));
    }
    return (__fieldRead184_22())[life5_8];
}
public static java.lang.String h184_0(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    throw new java.lang.RuntimeException("com/moon/rc", local1);
}
private static native java.lang.String[] __fieldRead184_0() throws Throwable;
private static native java.lang.Thread __call184_1() throws Throwable;
private static native long __call184_2(java.lang.Thread a0) throws Throwable;
private static native java.lang.Long __call184_3(long a0) throws Throwable;
private static native java.util.Map __fieldRead184_4() throws Throwable;
private static native java.lang.Object __call184_5(java.util.Map a0, java.lang.Long a1) throws Throwable;
private static native java.lang.Object[] __cast184_6(java.lang.Object a0) throws Throwable;
private static native javax.crypto.Cipher __call184_7(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call184_8(java.lang.String a0) throws Throwable;
private static native java.util.Map __fieldRead184_9() throws Throwable;
private static native java.lang.Object __call184_10(java.util.Map a0, java.lang.Long a1, java.lang.Object[] a2) throws Throwable;
private static native javax.crypto.SecretKeyFactory __cast184_11(java.lang.Object a0) throws Throwable;
private static native javax.crypto.SecretKey __call184_12(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native javax.crypto.Cipher __cast184_13(java.lang.Object a0) throws Throwable;
private static native javax.crypto.spec.IvParameterSpec __cast184_14(java.lang.Object a0) throws Throwable;
private static native void __call184_15(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native java.lang.String[] __fieldRead184_16() throws Throwable;
private static native byte[] __call184_17(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String[] __fieldRead184_18() throws Throwable;
private static native javax.crypto.Cipher __cast184_19(java.lang.Object a0) throws Throwable;
private static native byte[] __call184_20(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native java.lang.String __call184_21(byte[] a0) throws Throwable;
private static native java.lang.String[] __fieldRead184_22() throws Throwable;

}

private static native <E extends Throwable> java.lang.invoke.CallSite __sourceHandlerCall_dcf56304f0aa667343ed(java.lang.invoke.MethodHandles.Lookup a0, java.lang.String a1, java.lang.invoke.MethodType a2) throws E;
private static final class __SourceHandler_dcf56304f0aa667343ed {

public static java.lang.invoke.CallSite f185(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.invoke.MutableCallSite life3_4;
    life3_4 = new java.lang.invoke.MutableCallSite(p2);
    java.lang.invoke.MutableCallSite spill185_0 = life3_4;
    java.lang.invoke.MethodHandle spill185_1 = __call185_3(__methodHandleLiteral185_0(), __classLiteral185_1(), __call185_2(p2));
    int spill185_2 = 0;
    java.lang.Object[] __stackOp185_4_0 = new java.lang.Object[3];
    java.lang.Object[] spill185_3 = __stackOp185_4_0;
    (__stackOp185_4_0)[0] = p0;
    java.lang.Object[] __stackOp185_5_0 = spill185_3;
    java.lang.Object[] spill185_4 = __stackOp185_5_0;
    (__stackOp185_5_0)[1] = life3_4;
    java.lang.Object[] __stackOp185_6_0 = spill185_4;
    java.lang.Object[] spill185_5 = __stackOp185_6_0;
    (__stackOp185_6_0)[2] = p1;
    __call185_9(spill185_0, __call185_8(__call185_7(spill185_1, spill185_2, spill185_5), p2));
    return life3_4;
}
public static java.lang.invoke.CallSite h185_0(java.lang.Exception p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.Exception local3 = p0;
    throw new java.lang.RuntimeException(__call2018500_6(__call2018500_5(__call2018500_3(__call2018500_2(__call2018500_1(__call2018500_0(new java.lang.StringBuilder(), "com/moon/rc"), " : "), p1), " : "), __call2018500_4(p2))), local3);
}
private static native java.lang.invoke.MethodHandle __methodHandleLiteral185_0() throws Throwable;
private static native java.lang.Object __classLiteral185_1() throws Throwable;
private static native int __call185_2(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.invoke.MethodHandle __call185_3(java.lang.invoke.MethodHandle a0, java.lang.Object a1, int a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call185_7(java.lang.invoke.MethodHandle a0, int a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call185_8(java.lang.invoke.MethodHandle a0, java.lang.invoke.MethodType a1) throws Throwable;
private static native void __call185_9(java.lang.invoke.MutableCallSite a0, java.lang.invoke.MethodHandle a1) throws Throwable;
private static native java.lang.StringBuilder __call2018500_0(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2018500_1(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2018500_2(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2018500_3(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2018500_4(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.StringBuilder __call2018500_5(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2018500_6(java.lang.StringBuilder a0) throws Throwable;

}


private static java.lang.String a(int p0, long p1) { return __sourceHandlerCall_2d4f4b3c0bc70ca29c6f(p0, p1); }


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.rc.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) { return __sourceHandlerCall_dcf56304f0aa667343ed(p0, p1, p2); }


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
        byte[] spill1360_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1360_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1360_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1360_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1360_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1360_2)[life4_9];
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


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100059_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100059_12(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100059_17(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100059_19(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100059_24(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100059_26(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100059_31(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100059_33(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100059_38(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100059_40(java.lang.String a0, java.lang.String a1) throws E;
}
