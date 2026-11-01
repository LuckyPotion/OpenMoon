package com.moon;


class qV extends org.luaj.vm2.lib.TwoArgFunction {

com.moon.jW a;

private static long b;

private static java.lang.String[] c;

private static java.lang.String[] d;

private static java.util.Map e;

qV(com.moon.jW p0) { super(); }

private static void __sourceConstructorBody_86cca9bbb55f3134(com.moon.qV receiver, com.moon.jW p0) throws Throwable {
((com.moon.qV)(receiver)).a = ((com.moon.jW)(p0));
    com.moon.qV.__sourceConstructorInit_86cca9bbb55f3134_0(((com.moon.qV)(receiver)));
    return;
}


static {
javax.crypto.Cipher forestValue193_36_0;
    int forestValue193_36_1;
    javax.crypto.SecretKeyFactory forestValue193_36_2;
    byte[] forestValue193_36_3;
    javax.crypto.Cipher forestValue193_53_0;
    int forestValue193_53_1;
    javax.crypto.SecretKeyFactory forestValue193_53_2;
    byte[] forestValue193_53_3;
    javax.crypto.Cipher spill193_0;
    int spill193_1;
    javax.crypto.SecretKeyFactory spill193_2;
    byte[] spill193_3;
    byte[] spill193_4;
    java.lang.String spill193_5;
    int spill193_6;
    java.lang.String spill193_7;
    java.lang.String[] spill193_8;
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
    b = ((long)(((moom._a)(moom._c.a(((long)(377547793599291233L)), ((long)(-6356088122435628992L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(18474498209479L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    life0_16 = (com.moon.qV.b ^ 128402342265320L);
    spill193_0 = (life2_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill193_1 = 2;
    spill193_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp193_9_0 = new byte[8];
    spill193_3 = __stackOp193_9_0;
    (__stackOp193_9_0)[0] = ((byte) ((int) (life0_16 >>> 56)));
    life3_35 = 1;
    forestValue193_36_0 = spill193_0;
    forestValue193_36_1 = spill193_1;
    forestValue193_36_2 = spill193_2;
    forestValue193_36_3 = spill193_3;
    forest_cycle_36: while (true) {
    if (!((life3_35 < 8))) {
        forestValue193_53_0 = forestValue193_36_0;
        forestValue193_53_1 = forestValue193_36_1;
        forestValue193_53_2 = forestValue193_36_2;
        forestValue193_53_3 = forestValue193_36_3;
        break forest_join_53;
    }
    byte[] __stackOp193_10_0 = forestValue193_36_3;
    spill193_4 = __stackOp193_10_0;
    (__stackOp193_10_0)[life3_35] = ((byte) ((int) ((life0_16 << (life3_35 * 8)) >>> 56)));
    life3_35 += 1;
    forestValue193_36_3 = spill193_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue193_53_0)).init(((int)(forestValue193_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue193_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue193_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life9_66 = new java.lang.String[2];
    life7_68 = 0;
    life8_73 = ((java.lang.String)((life6_71 = "Àßàæ\027ßiôµ¢.ç{³\037ä²\017Á\r¬£C\037\\ÇËã¨\005[í\004îèÍÂÊj\004~¸Hs¡8 \023U·ê8'Ñ²Ì\n\021\020K\030\031ø\032\037¿:b?\006êï7V{J\023õ)¬Õ(t:[\026P\177^\bÈ;ZÞ[_ êù9r"))).length();
    life5_75 = 56;
    life4_77 = -1;
    forest_cycle_78: while (true) {
    life4_77 += 1;
    spill193_5 = life6_71;
    int __stackOp193_14_0 = life4_77;
    java.lang.String __stackOp193_16_0 = ((java.lang.String)(spill193_5)).substring(((int)(__stackOp193_14_0)), ((int)((__stackOp193_14_0 + life5_75))));
    int __stackOp193_16_1 = -1;
    spill193_6 = __stackOp193_16_1;
    byte[] __stackOp193_18_0 = ((java.lang.String)(__stackOp193_16_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp193_18_1 = life2_20;
    life10_93 = ((javax.crypto.Cipher)(__stackOp193_18_1)).doFinal(((byte[])(__stackOp193_18_0)));
    int __stackOp193_22_0 = spill193_6;
    java.lang.String __stackOp193_22_1 = ((java.lang.String)(com.moon.qV.a(((byte[])(life10_93))))).intern();
    spill193_7 = __stackOp193_22_1;
    recovery.source.CarrierOps.discard(__stackOp193_22_0);
    java.lang.String __stackOp193_24_0 = spill193_7;
    java.lang.String[] __stackOp193_24_1 = life9_66;
    spill193_8 = __stackOp193_24_1;
    java.lang.String __stackOp193_25_0 = __stackOp193_24_0;
    int __stackOp193_25_1 = (life7_68++);
    (spill193_8)[__stackOp193_25_1] = __stackOp193_25_0;
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

private static native <E extends Throwable> void __sourceConstructorInit_86cca9bbb55f3134_0(com.moon.qV a0) throws E;
private static native <E extends Throwable> java.lang.String __sourceHandlerCall_5f5a3efb700ea66fec29(int a0, long a1) throws E;
private static final class __SourceHandler_5f5a3efb700ea66fec29 {

public static java.lang.String f171(int p0, long p1) throws Throwable {
    int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 19882);
    if (((__fieldRead171_0())[life5_8] == null)) {
        life3_16 = __call171_3(__call171_2(__call171_1()));
        life4_21 = __cast171_6(__call171_5(__fieldRead171_4(), life3_16));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = __call171_7("DES/CBC/PKCS5Padding");
        (life4_21)[1] = __call171_8("DES");
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        __call171_10(__fieldRead171_9(), life3_16, life4_21);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_63: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = __call171_12(__cast171_11((life4_21)[1]), life7_92);
        __call171_15(__cast171_13((life4_21)[0]), 2, life8_99, __cast171_14((life4_21)[2]));
        life9_116 = __call171_17((__fieldRead171_16())[life5_8], "ISO-8859-1");
        (__fieldRead171_18())[life5_8] = __call171_21(__call171_20(__cast171_19((life4_21)[0]), life9_116));
    }
    return (__fieldRead171_22())[life5_8];
}
public static java.lang.String h171_0(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    throw new java.lang.RuntimeException("com/moon/qV", local1);
}
private static native java.lang.String[] __fieldRead171_0() throws Throwable;
private static native java.lang.Thread __call171_1() throws Throwable;
private static native long __call171_2(java.lang.Thread a0) throws Throwable;
private static native java.lang.Long __call171_3(long a0) throws Throwable;
private static native java.util.Map __fieldRead171_4() throws Throwable;
private static native java.lang.Object __call171_5(java.util.Map a0, java.lang.Long a1) throws Throwable;
private static native java.lang.Object[] __cast171_6(java.lang.Object a0) throws Throwable;
private static native javax.crypto.Cipher __call171_7(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call171_8(java.lang.String a0) throws Throwable;
private static native java.util.Map __fieldRead171_9() throws Throwable;
private static native java.lang.Object __call171_10(java.util.Map a0, java.lang.Long a1, java.lang.Object[] a2) throws Throwable;
private static native javax.crypto.SecretKeyFactory __cast171_11(java.lang.Object a0) throws Throwable;
private static native javax.crypto.SecretKey __call171_12(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native javax.crypto.Cipher __cast171_13(java.lang.Object a0) throws Throwable;
private static native javax.crypto.spec.IvParameterSpec __cast171_14(java.lang.Object a0) throws Throwable;
private static native void __call171_15(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native java.lang.String[] __fieldRead171_16() throws Throwable;
private static native byte[] __call171_17(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String[] __fieldRead171_18() throws Throwable;
private static native javax.crypto.Cipher __cast171_19(java.lang.Object a0) throws Throwable;
private static native byte[] __call171_20(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native java.lang.String __call171_21(byte[] a0) throws Throwable;
private static native java.lang.String[] __fieldRead171_22() throws Throwable;

}

private static native <E extends Throwable> java.lang.invoke.CallSite __sourceHandlerCall_6eccd267161b4ba19010(java.lang.invoke.MethodHandles.Lookup a0, java.lang.String a1, java.lang.invoke.MethodType a2) throws E;
private static final class __SourceHandler_6eccd267161b4ba19010 {

public static java.lang.invoke.CallSite f172(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.invoke.MutableCallSite life3_4;
    life3_4 = new java.lang.invoke.MutableCallSite(p2);
    java.lang.invoke.MutableCallSite spill172_0 = life3_4;
    java.lang.invoke.MethodHandle spill172_1 = __call172_3(__methodHandleLiteral172_0(), __classLiteral172_1(), __call172_2(p2));
    int spill172_2 = 0;
    java.lang.Object[] __stackOp172_4_0 = new java.lang.Object[3];
    java.lang.Object[] spill172_3 = __stackOp172_4_0;
    (__stackOp172_4_0)[0] = p0;
    java.lang.Object[] __stackOp172_5_0 = spill172_3;
    java.lang.Object[] spill172_4 = __stackOp172_5_0;
    (__stackOp172_5_0)[1] = life3_4;
    java.lang.Object[] __stackOp172_6_0 = spill172_4;
    java.lang.Object[] spill172_5 = __stackOp172_6_0;
    (__stackOp172_6_0)[2] = p1;
    __call172_9(spill172_0, __call172_8(__call172_7(spill172_1, spill172_2, spill172_5), p2));
    return life3_4;
}
public static java.lang.invoke.CallSite h172_0(java.lang.Exception p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.Exception local3 = p0;
    throw new java.lang.RuntimeException(__call2017200_6(__call2017200_5(__call2017200_3(__call2017200_2(__call2017200_1(__call2017200_0(new java.lang.StringBuilder(), "com/moon/qV"), " : "), p1), " : "), __call2017200_4(p2))), local3);
}
private static native java.lang.invoke.MethodHandle __methodHandleLiteral172_0() throws Throwable;
private static native java.lang.Object __classLiteral172_1() throws Throwable;
private static native int __call172_2(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.invoke.MethodHandle __call172_3(java.lang.invoke.MethodHandle a0, java.lang.Object a1, int a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call172_7(java.lang.invoke.MethodHandle a0, int a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call172_8(java.lang.invoke.MethodHandle a0, java.lang.invoke.MethodType a1) throws Throwable;
private static native void __call172_9(java.lang.invoke.MutableCallSite a0, java.lang.invoke.MethodHandle a1) throws Throwable;
private static native java.lang.StringBuilder __call2017200_0(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2017200_1(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2017200_2(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2017200_3(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2017200_4(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.StringBuilder __call2017200_5(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2017200_6(java.lang.StringBuilder a0) throws Throwable;

}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) { return __sourceHandlerCall_6eccd267161b4ba19010(p0, p1, p2); }


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.qV.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.String a(int p0, long p1) { return __sourceHandlerCall_5f5a3efb700ea66fec29(p0, p1); }


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
        byte[] spill1298_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1298_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1298_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1298_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1298_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1298_2)[life4_9];
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
int forwardValue1299_24_0;
    int forwardValue1299_40_0;
    boolean spill1299_0;
    long life3_3;
    int life5_5;
    int life6_50;
    int life7_53;
    forward_join_40: {
    forward_join_38: {
    forward_join_24: {
    forward_join_22: {
    life3_3 = (com.moon.qV.b ^ 89229125009280L);
    life5_5 = com.moon.jN.c();
    spill1299_0 = ((org.luaj.vm2.LuaValue)(p0)).istable();
    if (!((life5_5 == 0))) {
        forwardValue1299_24_0 = ((spill1299_0) ? 1 : 0);
        break forward_join_24;
    }
    if (!((!spill1299_0))) {
        break forward_join_22;
    }
    java.lang.String __stackOp1299_6_0 = ((org.luaj.vm2.LuaValue)(p0)).typename();
    java.lang.String __stackOp1299_6_1 = __sourceIntrinsic_fc861287a8ca_invokedynamic1299_5(26600, (5319346603487661723L ^ life3_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_fc861287a8ca_invokedynamic1299_7(__stackOp1299_6_1, __stackOp1299_6_0))));
    }
    forwardValue1299_24_0 = ((((org.luaj.vm2.LuaValue)(p1)).isnumber()) ? 1 : 0);
    }
    if (!((life5_5 == 0))) {
        forwardValue1299_40_0 = forwardValue1299_24_0;
        break forward_join_40;
    }
    if (!((forwardValue1299_24_0 == 0))) {
        break forward_join_38;
    }
    java.lang.String __stackOp1299_13_0 = ((org.luaj.vm2.LuaValue)(p1)).typename();
    java.lang.String __stackOp1299_13_1 = __sourceIntrinsic_fc861287a8ca_invokedynamic1299_12(3264, (2420980972533114290L ^ life3_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_fc861287a8ca_invokedynamic1299_14(__stackOp1299_13_1, __stackOp1299_13_0))));
    }
    forwardValue1299_40_0 = ((org.luaj.vm2.LuaValue)(p0)).toint();
    }
    life6_50 = forwardValue1299_40_0;
    life7_53 = ((org.luaj.vm2.LuaValue)(p1)).toint();
    return com.moon.j6.a__LuaValue(((java.lang.Object)(((com.moon.j5)(((com.moon.jW)(this.a)).c)).get_effect(((int)(life6_50)), ((int)(life7_53))))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fc861287a8ca_invokedynamic1299_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fc861287a8ca_invokedynamic1299_7(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fc861287a8ca_invokedynamic1299_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fc861287a8ca_invokedynamic1299_14(java.lang.String a0, java.lang.String a1) throws E;
}
