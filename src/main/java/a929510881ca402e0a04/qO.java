package com.moon;


class qO extends org.luaj.vm2.lib.TwoArgFunction {

com.moon.jS a;

private static long b;

private static java.lang.String[] c;

private static java.lang.String[] d;

private static java.util.Map e;

qO(com.moon.jS p0) { super(); }

private static void __sourceConstructorBody_44fd52a9b89eb7fc(com.moon.qO receiver, com.moon.jS p0) throws Throwable {
((com.moon.qO)(receiver)).a = ((com.moon.jS)(p0));
    com.moon.qO.__sourceConstructorInit_44fd52a9b89eb7fc_0(((com.moon.qO)(receiver)));
    return;
}


static {
javax.crypto.Cipher forestValue179_36_0;
    int forestValue179_36_1;
    javax.crypto.SecretKeyFactory forestValue179_36_2;
    byte[] forestValue179_36_3;
    javax.crypto.Cipher forestValue179_53_0;
    int forestValue179_53_1;
    javax.crypto.SecretKeyFactory forestValue179_53_2;
    byte[] forestValue179_53_3;
    javax.crypto.Cipher spill179_0;
    int spill179_1;
    javax.crypto.SecretKeyFactory spill179_2;
    byte[] spill179_3;
    byte[] spill179_4;
    java.lang.String spill179_5;
    int spill179_6;
    java.lang.String spill179_7;
    java.lang.String[] spill179_8;
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
    b = ((long)(((moom._a)(moom._c.a(((long)(-6264499622020864696L)), ((long)(-5336826592126931852L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(134518677267760L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    life0_16 = (com.moon.qO.b ^ 51391682192626L);
    spill179_0 = (life2_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill179_1 = 2;
    spill179_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp179_9_0 = new byte[8];
    spill179_3 = __stackOp179_9_0;
    (__stackOp179_9_0)[0] = ((byte) ((int) (life0_16 >>> 56)));
    life3_35 = 1;
    forestValue179_36_0 = spill179_0;
    forestValue179_36_1 = spill179_1;
    forestValue179_36_2 = spill179_2;
    forestValue179_36_3 = spill179_3;
    forest_cycle_36: while (true) {
    if (!((life3_35 < 8))) {
        forestValue179_53_0 = forestValue179_36_0;
        forestValue179_53_1 = forestValue179_36_1;
        forestValue179_53_2 = forestValue179_36_2;
        forestValue179_53_3 = forestValue179_36_3;
        break forest_join_53;
    }
    byte[] __stackOp179_10_0 = forestValue179_36_3;
    spill179_4 = __stackOp179_10_0;
    (__stackOp179_10_0)[life3_35] = ((byte) ((int) ((life0_16 << (life3_35 * 8)) >>> 56)));
    life3_35 += 1;
    forestValue179_36_3 = spill179_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue179_53_0)).init(((int)(forestValue179_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue179_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue179_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life9_66 = new java.lang.String[2];
    life7_68 = 0;
    life8_73 = ((java.lang.String)((life6_71 = "knïk/2gÃ½$Ì\021À\005é\007'élöÀ\003«µÇ<×\031Ì$Ì¤\035&ÀîÂ=Ú\"UH\"Û'ú¬éã±hÙolðÈ£ÿ9+\031ïóáæi\034²½÷!Ý\007®µS²ö,Ú¯Æþ\034Àä\025i\n'/khg\036\024¬\001_+!îÚG"))).length();
    life5_75 = 48;
    life4_77 = -1;
    forest_cycle_78: while (true) {
    life4_77 += 1;
    spill179_5 = life6_71;
    int __stackOp179_14_0 = life4_77;
    java.lang.String __stackOp179_16_0 = ((java.lang.String)(spill179_5)).substring(((int)(__stackOp179_14_0)), ((int)((__stackOp179_14_0 + life5_75))));
    int __stackOp179_16_1 = -1;
    spill179_6 = __stackOp179_16_1;
    byte[] __stackOp179_18_0 = ((java.lang.String)(__stackOp179_16_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp179_18_1 = life2_20;
    life10_93 = ((javax.crypto.Cipher)(__stackOp179_18_1)).doFinal(((byte[])(__stackOp179_18_0)));
    int __stackOp179_22_0 = spill179_6;
    java.lang.String __stackOp179_22_1 = ((java.lang.String)(com.moon.qO.a(((byte[])(life10_93))))).intern();
    spill179_7 = __stackOp179_22_1;
    recovery.source.CarrierOps.discard(__stackOp179_22_0);
    java.lang.String __stackOp179_24_0 = spill179_7;
    java.lang.String[] __stackOp179_24_1 = life9_66;
    spill179_8 = __stackOp179_24_1;
    java.lang.String __stackOp179_25_0 = __stackOp179_24_0;
    int __stackOp179_25_1 = (life7_68++);
    (spill179_8)[__stackOp179_25_1] = __stackOp179_25_0;
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

private static native <E extends Throwable> void __sourceConstructorInit_44fd52a9b89eb7fc_0(com.moon.qO a0) throws E;
private static native <E extends Throwable> java.lang.String __sourceHandlerCall_98b8da2f4391ddfe28c7(int a0, long a1) throws E;
private static final class __SourceHandler_98b8da2f4391ddfe28c7 {

public static java.lang.String f159(int p0, long p1) throws Throwable {
    int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 23922);
    if (((__fieldRead159_0())[life5_8] == null)) {
        life3_16 = __call159_3(__call159_2(__call159_1()));
        life4_21 = __cast159_6(__call159_5(__fieldRead159_4(), life3_16));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = __call159_7("DES/CBC/PKCS5Padding");
        (life4_21)[1] = __call159_8("DES");
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        __call159_10(__fieldRead159_9(), life3_16, life4_21);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_63: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = __call159_12(__cast159_11((life4_21)[1]), life7_92);
        __call159_15(__cast159_13((life4_21)[0]), 2, life8_99, __cast159_14((life4_21)[2]));
        life9_116 = __call159_17((__fieldRead159_16())[life5_8], "ISO-8859-1");
        (__fieldRead159_18())[life5_8] = __call159_21(__call159_20(__cast159_19((life4_21)[0]), life9_116));
    }
    return (__fieldRead159_22())[life5_8];
}
public static java.lang.String h159_0(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    throw new java.lang.RuntimeException("com/moon/qO", local1);
}
private static native java.lang.String[] __fieldRead159_0() throws Throwable;
private static native java.lang.Thread __call159_1() throws Throwable;
private static native long __call159_2(java.lang.Thread a0) throws Throwable;
private static native java.lang.Long __call159_3(long a0) throws Throwable;
private static native java.util.Map __fieldRead159_4() throws Throwable;
private static native java.lang.Object __call159_5(java.util.Map a0, java.lang.Long a1) throws Throwable;
private static native java.lang.Object[] __cast159_6(java.lang.Object a0) throws Throwable;
private static native javax.crypto.Cipher __call159_7(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call159_8(java.lang.String a0) throws Throwable;
private static native java.util.Map __fieldRead159_9() throws Throwable;
private static native java.lang.Object __call159_10(java.util.Map a0, java.lang.Long a1, java.lang.Object[] a2) throws Throwable;
private static native javax.crypto.SecretKeyFactory __cast159_11(java.lang.Object a0) throws Throwable;
private static native javax.crypto.SecretKey __call159_12(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native javax.crypto.Cipher __cast159_13(java.lang.Object a0) throws Throwable;
private static native javax.crypto.spec.IvParameterSpec __cast159_14(java.lang.Object a0) throws Throwable;
private static native void __call159_15(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native java.lang.String[] __fieldRead159_16() throws Throwable;
private static native byte[] __call159_17(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String[] __fieldRead159_18() throws Throwable;
private static native javax.crypto.Cipher __cast159_19(java.lang.Object a0) throws Throwable;
private static native byte[] __call159_20(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native java.lang.String __call159_21(byte[] a0) throws Throwable;
private static native java.lang.String[] __fieldRead159_22() throws Throwable;

}

private static native <E extends Throwable> java.lang.invoke.CallSite __sourceHandlerCall_71a46078ee3d89dc7dda(java.lang.invoke.MethodHandles.Lookup a0, java.lang.String a1, java.lang.invoke.MethodType a2) throws E;
private static final class __SourceHandler_71a46078ee3d89dc7dda {

public static java.lang.invoke.CallSite f160(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.invoke.MutableCallSite life3_4;
    life3_4 = new java.lang.invoke.MutableCallSite(p2);
    java.lang.invoke.MutableCallSite spill160_0 = life3_4;
    java.lang.invoke.MethodHandle spill160_1 = __call160_3(__methodHandleLiteral160_0(), __classLiteral160_1(), __call160_2(p2));
    int spill160_2 = 0;
    java.lang.Object[] __stackOp160_4_0 = new java.lang.Object[3];
    java.lang.Object[] spill160_3 = __stackOp160_4_0;
    (__stackOp160_4_0)[0] = p0;
    java.lang.Object[] __stackOp160_5_0 = spill160_3;
    java.lang.Object[] spill160_4 = __stackOp160_5_0;
    (__stackOp160_5_0)[1] = life3_4;
    java.lang.Object[] __stackOp160_6_0 = spill160_4;
    java.lang.Object[] spill160_5 = __stackOp160_6_0;
    (__stackOp160_6_0)[2] = p1;
    __call160_9(spill160_0, __call160_8(__call160_7(spill160_1, spill160_2, spill160_5), p2));
    return life3_4;
}
public static java.lang.invoke.CallSite h160_0(java.lang.Exception p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.Exception local3 = p0;
    throw new java.lang.RuntimeException(__call2016000_6(__call2016000_5(__call2016000_3(__call2016000_2(__call2016000_1(__call2016000_0(new java.lang.StringBuilder(), "com/moon/qO"), " : "), p1), " : "), __call2016000_4(p2))), local3);
}
private static native java.lang.invoke.MethodHandle __methodHandleLiteral160_0() throws Throwable;
private static native java.lang.Object __classLiteral160_1() throws Throwable;
private static native int __call160_2(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.invoke.MethodHandle __call160_3(java.lang.invoke.MethodHandle a0, java.lang.Object a1, int a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call160_7(java.lang.invoke.MethodHandle a0, int a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call160_8(java.lang.invoke.MethodHandle a0, java.lang.invoke.MethodType a1) throws Throwable;
private static native void __call160_9(java.lang.invoke.MutableCallSite a0, java.lang.invoke.MethodHandle a1) throws Throwable;
private static native java.lang.StringBuilder __call2016000_0(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2016000_1(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2016000_2(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2016000_3(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2016000_4(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.StringBuilder __call2016000_5(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2016000_6(java.lang.StringBuilder a0) throws Throwable;

}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) { return __sourceHandlerCall_71a46078ee3d89dc7dda(p0, p1, p2); }


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.qO.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.String a(int p0, long p1) { return __sourceHandlerCall_98b8da2f4391ddfe28c7(p0, p1); }


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
        byte[] spill1284_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1284_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1284_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1284_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1284_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1284_2)[life4_9];
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
org.luaj.vm2.LuaValue forwardValue1285_26_0;
    int forwardValue1285_31_0;
    org.luaj.vm2.LuaValue forwardValue1285_47_0;
    int forwardValue1285_50_0;
    org.luaj.vm2.LuaValue spill1285_0;
    boolean spill1285_1;
    org.luaj.vm2.LuaValue spill1285_2;
    boolean spill1285_3;
    long life3_3;
    int life5_5;
    int life6_74;
    int life7_77;
    forward_join_50: {
    forward_join_48: {
    forward_join_47: {
    forward_join_37: {
    forward_join_31: {
    forward_join_27: {
    forward_join_26: {
    forward_join_16: {
    life3_3 = (com.moon.qO.b ^ 171954273609L);
    life5_5 = com.moon.jN.c();
    spill1285_0 = p0;
    if (!((life5_5 == 0))) {
        forwardValue1285_26_0 = spill1285_0;
        break forward_join_26;
    }
    if (!((!((org.luaj.vm2.LuaValue)(spill1285_0)).isnil()))) {
        break forward_join_16;
    }
    spill1285_1 = ((org.luaj.vm2.LuaValue)(p0)).isnumber();
    if (!((life5_5 == 0))) {
        forwardValue1285_31_0 = ((spill1285_1) ? 1 : 0);
        break forward_join_31;
    }
    if (!((!spill1285_1))) {
        break forward_join_27;
    }
    }
    java.lang.String __stackOp1285_7_0 = ((org.luaj.vm2.LuaValue)(p0)).typename();
    java.lang.String __stackOp1285_7_1 = __sourceIntrinsic_fc861287a8ca_invokedynamic1285_6(24462, (5332215011079087749L ^ life3_3));
    forwardValue1285_26_0 = org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_fc861287a8ca_invokedynamic1285_8(__stackOp1285_7_1, __stackOp1285_7_0))));
    }
    return forwardValue1285_26_0;
    }
    spill1285_2 = p1;
    if (!((life5_5 == 0))) {
        forwardValue1285_47_0 = spill1285_2;
        break forward_join_47;
    }
    forwardValue1285_31_0 = ((((org.luaj.vm2.LuaValue)(spill1285_2)).isnil()) ? 1 : 0);
    }
    if (!((forwardValue1285_31_0 == 0))) {
        break forward_join_37;
    }
    spill1285_3 = ((org.luaj.vm2.LuaValue)(p1)).isboolean();
    if (!((life5_5 == 0))) {
        forwardValue1285_50_0 = ((spill1285_3) ? 1 : 0);
        break forward_join_50;
    }
    if (!((!spill1285_3))) {
        break forward_join_48;
    }
    }
    java.lang.String __stackOp1285_16_0 = ((org.luaj.vm2.LuaValue)(p1)).typename();
    java.lang.String __stackOp1285_16_1 = __sourceIntrinsic_fc861287a8ca_invokedynamic1285_15(9916, (268830145021321142L ^ life3_3));
    forwardValue1285_47_0 = org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_fc861287a8ca_invokedynamic1285_17(__stackOp1285_16_1, __stackOp1285_16_0))));
    }
    return forwardValue1285_47_0;
    }
    forwardValue1285_50_0 = ((org.luaj.vm2.LuaValue)(p0)).toint();
    }
    life6_74 = forwardValue1285_50_0;
    life7_77 = ((((org.luaj.vm2.LuaValue)(p1)).toboolean()) ? 1 : 0);
    ((com.moon.j1)(((com.moon.jS)(this.a)).c)).drop(((int)(life6_74)), ((boolean)__sourceIntrinsic_integerToBoolean((life7_77))));
    return org.luaj.vm2.LuaValue.NIL;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fc861287a8ca_invokedynamic1285_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fc861287a8ca_invokedynamic1285_8(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fc861287a8ca_invokedynamic1285_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fc861287a8ca_invokedynamic1285_17(java.lang.String a0, java.lang.String a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
