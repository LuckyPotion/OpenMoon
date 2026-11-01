package com.moon;


class qI extends org.luaj.vm2.lib.ThreeArgFunction {

com.moon.jQ a;

private static long b;

private static java.lang.String[] c;

private static java.lang.String[] d;

private static java.util.Map e;

qI(com.moon.jQ p0) { super(); }

private static void __sourceConstructorBody_05accd5d63452725(com.moon.qI receiver, com.moon.jQ p0) throws Throwable {
((com.moon.qI)(receiver)).a = ((com.moon.jQ)(p0));
    com.moon.qI.__sourceConstructorInit_05accd5d63452725_0(((com.moon.qI)(receiver)));
    return;
}


static {
javax.crypto.Cipher forestValue167_36_0;
    int forestValue167_36_1;
    javax.crypto.SecretKeyFactory forestValue167_36_2;
    byte[] forestValue167_36_3;
    javax.crypto.Cipher forestValue167_53_0;
    int forestValue167_53_1;
    javax.crypto.SecretKeyFactory forestValue167_53_2;
    byte[] forestValue167_53_3;
    java.lang.String forestValue167_86_0;
    int forestValue167_86_1;
    java.lang.String forestValue167_98_0;
    java.lang.String forestValue167_122_0;
    javax.crypto.Cipher spill167_0;
    int spill167_1;
    javax.crypto.SecretKeyFactory spill167_2;
    byte[] spill167_3;
    byte[] spill167_4;
    java.lang.String spill167_5;
    int spill167_6;
    java.lang.String spill167_7;
    java.lang.String[] spill167_8;
    java.lang.String[] spill167_9;
    java.lang.String spill167_10;
    java.lang.String spill167_11;
    int spill167_12;
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
    b = ((long)(((moom._a)(moom._c.a(((long)(7022144481405629690L)), ((long)(-475415046392241795L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(147927542710027L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    life0_16 = (com.moon.qI.b ^ 8783874026003L);
    spill167_0 = (life2_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill167_1 = 2;
    spill167_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp167_9_0 = new byte[8];
    spill167_3 = __stackOp167_9_0;
    (__stackOp167_9_0)[0] = ((byte) ((int) (life0_16 >>> 56)));
    life3_35 = 1;
    forestValue167_36_0 = spill167_0;
    forestValue167_36_1 = spill167_1;
    forestValue167_36_2 = spill167_2;
    forestValue167_36_3 = spill167_3;
    forest_cycle_36: while (true) {
    if (!((life3_35 < 8))) {
        forestValue167_53_0 = forestValue167_36_0;
        forestValue167_53_1 = forestValue167_36_1;
        forestValue167_53_2 = forestValue167_36_2;
        forestValue167_53_3 = forestValue167_36_3;
        break forest_join_53;
    }
    byte[] __stackOp167_10_0 = forestValue167_36_3;
    spill167_4 = __stackOp167_10_0;
    (__stackOp167_10_0)[life3_35] = ((byte) ((int) ((life0_16 << (life3_35 * 8)) >>> 56)));
    life3_35 += 1;
    forestValue167_36_3 = spill167_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue167_53_0)).init(((int)(forestValue167_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue167_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue167_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life9_66 = new java.lang.String[4];
    life7_68 = 0;
    life8_73 = ((java.lang.String)((life6_71 = "Ìô8)\007¤PÁð­:Î\020)äM+'Óc¡TýÜ¾'\024ÍbHFlCBÄmmµÅ9rh1°ÀÙ÷ ,¾%÷0µ#,mg6)Ì|GûÑûBr(ÆËm\030~O1¦ÀYP;iÊÜ\fÙ\026ËâÕÌ-£fK\t÷"))).length();
    life5_75 = 56;
    life4_77 = -1;
    forest_cycle_78: while (true) {
    forest_join_148: {
    life4_77 += 1;
    spill167_5 = life6_71;
    int __stackOp167_14_0 = life4_77;
    forestValue167_86_0 = ((java.lang.String)(spill167_5)).substring(((int)(__stackOp167_14_0)), ((int)((__stackOp167_14_0 + life5_75))));
    forestValue167_86_1 = -1;
    forest_cycle_86: while (true) {
    forest_join_139: {
    forest_join_122: {
    forest_join_112: {
    forest_join_98: {
    java.lang.String __stackOp167_16_0 = forestValue167_86_0;
    int __stackOp167_16_1 = forestValue167_86_1;
    spill167_6 = __stackOp167_16_1;
    byte[] __stackOp167_18_0 = ((java.lang.String)(__stackOp167_16_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp167_18_1 = life2_20;
    life10_93 = ((javax.crypto.Cipher)(__stackOp167_18_1)).doFinal(((byte[])(__stackOp167_18_0)));
    int __stackOp167_22_0 = spill167_6;
    java.lang.String __stackOp167_22_1 = ((java.lang.String)(com.moon.qI.a(((byte[])(life10_93))))).intern();
    spill167_7 = __stackOp167_22_1;
    switch (__stackOp167_22_0) {
default:
{
        forestValue167_98_0 = spill167_7;
        break forest_join_98;
    }
case 0:
{
        forestValue167_122_0 = spill167_7;
        break forest_join_122;
    }
}
    }
    java.lang.String __stackOp167_23_0 = forestValue167_98_0;
    java.lang.String[] __stackOp167_23_1 = life9_66;
    spill167_8 = __stackOp167_23_1;
    java.lang.String __stackOp167_24_0 = __stackOp167_23_0;
    int __stackOp167_24_1 = (life7_68++);
    (spill167_8)[__stackOp167_24_1] = __stackOp167_24_0;
    if (!(((life4_77 = (life4_77 + life5_75)) < life8_73))) {
        break forest_join_112;
    }
    break forest_join_148;
    }
    life8_73 = ((java.lang.String)((life6_71 = "ªëçË$SæX<è^|\013|NÍz@³I_\034´D¥X\027_MFE¤Ì¡ö´ï¤«úÙB1\005F:g\005-\033¼\f«OäÅW\033HÀ./g1ÿ¹LA\031\022^Ì:;r\026®2\r>\004Êªqó:\000ÈËÕ\006kw\027\f§A¡>Æl(?n\004õZ~éÐËº=tH\037½\025\030´ä½^ó"))).length();
    life5_75 = 64;
    life4_77 = -1;
    break forest_join_139;
    }
    java.lang.String __stackOp167_26_0 = forestValue167_122_0;
    java.lang.String[] __stackOp167_26_1 = life9_66;
    spill167_9 = __stackOp167_26_1;
    java.lang.String __stackOp167_27_0 = __stackOp167_26_0;
    int __stackOp167_27_1 = (life7_68++);
    (spill167_9)[__stackOp167_27_1] = __stackOp167_27_0;
    if (!(((life4_77 = (life4_77 + life5_75)) < life8_73))) {
        break forest_join_153;
    }
    life5_75 = ((int)(((java.lang.String)(life6_71)).charAt(((int)(life4_77)))));
    }
    life4_77 += 1;
    spill167_10 = life6_71;
    int __stackOp167_30_0 = life4_77;
    spill167_11 = ((java.lang.String)(spill167_10)).substring(((int)(__stackOp167_30_0)), ((int)((__stackOp167_30_0 + life5_75))));
    spill167_12 = 0;
    forestValue167_86_0 = spill167_11;
    forestValue167_86_1 = spill167_12;
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

private static native <E extends Throwable> void __sourceConstructorInit_05accd5d63452725_0(com.moon.qI a0) throws E;
private static native <E extends Throwable> java.lang.String __sourceHandlerCall_2aa7aa0566e1914d00bc(int a0, long a1) throws E;
private static final class __SourceHandler_2aa7aa0566e1914d00bc {

public static java.lang.String f147(int p0, long p1) throws Throwable {
    int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 23143);
    if (((__fieldRead147_0())[life5_8] == null)) {
        life3_16 = __call147_3(__call147_2(__call147_1()));
        life4_21 = __cast147_6(__call147_5(__fieldRead147_4(), life3_16));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = __call147_7("DES/CBC/PKCS5Padding");
        (life4_21)[1] = __call147_8("DES");
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        __call147_10(__fieldRead147_9(), life3_16, life4_21);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_63: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = __call147_12(__cast147_11((life4_21)[1]), life7_92);
        __call147_15(__cast147_13((life4_21)[0]), 2, life8_99, __cast147_14((life4_21)[2]));
        life9_116 = __call147_17((__fieldRead147_16())[life5_8], "ISO-8859-1");
        (__fieldRead147_18())[life5_8] = __call147_21(__call147_20(__cast147_19((life4_21)[0]), life9_116));
    }
    return (__fieldRead147_22())[life5_8];
}
public static java.lang.String h147_0(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    throw new java.lang.RuntimeException("com/moon/qI", local1);
}
private static native java.lang.String[] __fieldRead147_0() throws Throwable;
private static native java.lang.Thread __call147_1() throws Throwable;
private static native long __call147_2(java.lang.Thread a0) throws Throwable;
private static native java.lang.Long __call147_3(long a0) throws Throwable;
private static native java.util.Map __fieldRead147_4() throws Throwable;
private static native java.lang.Object __call147_5(java.util.Map a0, java.lang.Long a1) throws Throwable;
private static native java.lang.Object[] __cast147_6(java.lang.Object a0) throws Throwable;
private static native javax.crypto.Cipher __call147_7(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call147_8(java.lang.String a0) throws Throwable;
private static native java.util.Map __fieldRead147_9() throws Throwable;
private static native java.lang.Object __call147_10(java.util.Map a0, java.lang.Long a1, java.lang.Object[] a2) throws Throwable;
private static native javax.crypto.SecretKeyFactory __cast147_11(java.lang.Object a0) throws Throwable;
private static native javax.crypto.SecretKey __call147_12(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native javax.crypto.Cipher __cast147_13(java.lang.Object a0) throws Throwable;
private static native javax.crypto.spec.IvParameterSpec __cast147_14(java.lang.Object a0) throws Throwable;
private static native void __call147_15(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native java.lang.String[] __fieldRead147_16() throws Throwable;
private static native byte[] __call147_17(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String[] __fieldRead147_18() throws Throwable;
private static native javax.crypto.Cipher __cast147_19(java.lang.Object a0) throws Throwable;
private static native byte[] __call147_20(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native java.lang.String __call147_21(byte[] a0) throws Throwable;
private static native java.lang.String[] __fieldRead147_22() throws Throwable;

}

private static native <E extends Throwable> java.lang.invoke.CallSite __sourceHandlerCall_7a240b796b8bc4d54322(java.lang.invoke.MethodHandles.Lookup a0, java.lang.String a1, java.lang.invoke.MethodType a2) throws E;
private static final class __SourceHandler_7a240b796b8bc4d54322 {

public static java.lang.invoke.CallSite f148(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.invoke.MutableCallSite life3_4;
    life3_4 = new java.lang.invoke.MutableCallSite(p2);
    java.lang.invoke.MutableCallSite spill148_0 = life3_4;
    java.lang.invoke.MethodHandle spill148_1 = __call148_3(__methodHandleLiteral148_0(), __classLiteral148_1(), __call148_2(p2));
    int spill148_2 = 0;
    java.lang.Object[] __stackOp148_4_0 = new java.lang.Object[3];
    java.lang.Object[] spill148_3 = __stackOp148_4_0;
    (__stackOp148_4_0)[0] = p0;
    java.lang.Object[] __stackOp148_5_0 = spill148_3;
    java.lang.Object[] spill148_4 = __stackOp148_5_0;
    (__stackOp148_5_0)[1] = life3_4;
    java.lang.Object[] __stackOp148_6_0 = spill148_4;
    java.lang.Object[] spill148_5 = __stackOp148_6_0;
    (__stackOp148_6_0)[2] = p1;
    __call148_9(spill148_0, __call148_8(__call148_7(spill148_1, spill148_2, spill148_5), p2));
    return life3_4;
}
public static java.lang.invoke.CallSite h148_0(java.lang.Exception p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.Exception local3 = p0;
    throw new java.lang.RuntimeException(__call2014800_6(__call2014800_5(__call2014800_3(__call2014800_2(__call2014800_1(__call2014800_0(new java.lang.StringBuilder(), "com/moon/qI"), " : "), p1), " : "), __call2014800_4(p2))), local3);
}
private static native java.lang.invoke.MethodHandle __methodHandleLiteral148_0() throws Throwable;
private static native java.lang.Object __classLiteral148_1() throws Throwable;
private static native int __call148_2(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.invoke.MethodHandle __call148_3(java.lang.invoke.MethodHandle a0, java.lang.Object a1, int a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call148_7(java.lang.invoke.MethodHandle a0, int a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call148_8(java.lang.invoke.MethodHandle a0, java.lang.invoke.MethodType a1) throws Throwable;
private static native void __call148_9(java.lang.invoke.MutableCallSite a0, java.lang.invoke.MethodHandle a1) throws Throwable;
private static native java.lang.StringBuilder __call2014800_0(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2014800_1(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2014800_2(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2014800_3(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2014800_4(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.StringBuilder __call2014800_5(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2014800_6(java.lang.StringBuilder a0) throws Throwable;

}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) { return __sourceHandlerCall_7a240b796b8bc4d54322(p0, p1, p2); }


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.qI.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.String a(int p0, long p1) { return __sourceHandlerCall_2aa7aa0566e1914d00bc(p0, p1); }


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
        byte[] spill1272_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1272_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1272_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1272_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1272_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1272_2)[life4_9];
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
java.lang.Object forestValue174_25_0;
    java.lang.Object forestValue174_32_0;
    int forestValue174_67_0;
    org.luaj.vm2.LuaValue forestValue174_78_0;
    org.luaj.vm2.LuaValue spill174_0;
    java.lang.Object spill174_1;
    boolean spill174_2;
    org.luaj.vm2.LuaValue spill174_3;
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
    life4_3 = (com.moon.qI.b ^ 134472753077672L);
    life6_5 = com.moon.jN.c();
    spill174_0 = p0;
    if (!((life6_5 == 0))) {
        forestValue174_25_0 = spill174_0;
        break forest_join_25;
    }
    if (!(((org.luaj.vm2.LuaValue)(spill174_0)).isnil())) {
        break forest_join_22;
    }
    java.lang.String __stackOp174_5_0 = ((org.luaj.vm2.LuaValue)(p0)).typename();
    java.lang.String __stackOp174_5_1 = __sourceIntrinsic_a297060148ac_invokedynamic174_4(12176, (829101708010448017L ^ life4_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_a297060148ac_invokedynamic174_6(__stackOp174_5_1, __stackOp174_5_0))));
    }
    forestValue174_25_0 = org.luaj.vm2.lib.jse.CoerceLuaToJava.coerce(((org.luaj.vm2.LuaValue)(p0)), ((java.lang.Class)(java.lang.Object.class)));
    }
    life7_26 = forestValue174_25_0;
    spill174_1 = life7_26;
    if (!((life6_5 == 0))) {
        forestValue174_32_0 = spill174_1;
        break forest_join_32;
    }
    if (!((((spill174_1 instanceof com.moon.scripting.api.enums.CustomFontType) ? 1 : 0) != 0))) {
        break forest_join_36;
    }
    forestValue174_32_0 = life7_26;
    }
    life8_36 = ((com.moon.scripting.api.enums.CustomFontType)(forestValue174_32_0));
    if (!((life6_5 != 0))) {
        break forest_join_47;
    }
    }
    java.lang.String __stackOp174_14_0 = ((org.luaj.vm2.LuaValue)(p0)).typename();
    java.lang.String __stackOp174_14_1 = __sourceIntrinsic_a297060148ac_invokedynamic174_13(31458, (1527967386989146594L ^ life4_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_a297060148ac_invokedynamic174_15(__stackOp174_14_1, __stackOp174_14_0))));
    }
    spill174_2 = ((org.luaj.vm2.LuaValue)(p1)).isnumber();
    if (!((life6_5 == 0))) {
        forestValue174_67_0 = ((spill174_2) ? 1 : 0);
        break forest_join_67;
    }
    if (!((!spill174_2))) {
        break forest_join_63;
    }
    java.lang.String __stackOp174_21_0 = ((org.luaj.vm2.LuaValue)(p1)).typename();
    java.lang.String __stackOp174_21_1 = __sourceIntrinsic_a297060148ac_invokedynamic174_20(16533, (3242821406698998679L ^ life4_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_a297060148ac_invokedynamic174_22(__stackOp174_21_1, __stackOp174_21_0))));
    }
    spill174_3 = p2;
    if (!((life6_5 == 0))) {
        forestValue174_78_0 = spill174_3;
        break forest_join_78;
    }
    forestValue174_67_0 = ((((org.luaj.vm2.LuaValue)(spill174_3)).isstring()) ? 1 : 0);
    }
    if (!((forestValue174_67_0 == 0))) {
        break forest_join_79;
    }
    java.lang.String __stackOp174_28_0 = ((org.luaj.vm2.LuaValue)(p2)).typename();
    java.lang.String __stackOp174_28_1 = __sourceIntrinsic_a297060148ac_invokedynamic174_27(1132, (3164873944552918895L ^ life4_3));
    forestValue174_78_0 = org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_a297060148ac_invokedynamic174_29(__stackOp174_28_1, __stackOp174_28_0))));
    }
    return forestValue174_78_0;
    }
    return org.luaj.vm2.LuaValue.valueOf(((double)(((double) ((com.moon.jZ)(((com.moon.jQ)(this.a)).c)).width(((com.moon.scripting.api.enums.CustomFontType)(life8_36)), ((float)(((org.luaj.vm2.LuaValue)(p1)).tofloat())), ((java.lang.String)(((org.luaj.vm2.LuaValue)(p2)).tojstring())))))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a297060148ac_invokedynamic174_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a297060148ac_invokedynamic174_6(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a297060148ac_invokedynamic174_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a297060148ac_invokedynamic174_15(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a297060148ac_invokedynamic174_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a297060148ac_invokedynamic174_22(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a297060148ac_invokedynamic174_27(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a297060148ac_invokedynamic174_29(java.lang.String a0, java.lang.String a1) throws E;
}
