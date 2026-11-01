package com.moon;


class qP extends org.luaj.vm2.lib.TwoArgFunction {

com.moon.jS a;

private static long b;

private static java.lang.String[] c;

private static java.lang.String[] d;

private static java.util.Map e;

qP(com.moon.jS p0) { super(); }

private static void __sourceConstructorBody_da3b3d2c16398c04(com.moon.qP receiver, com.moon.jS p0) throws Throwable {
((com.moon.qP)(receiver)).a = ((com.moon.jS)(p0));
    com.moon.qP.__sourceConstructorInit_da3b3d2c16398c04_0(((com.moon.qP)(receiver)));
    return;
}


static {
javax.crypto.Cipher forestValue181_36_0;
    int forestValue181_36_1;
    javax.crypto.SecretKeyFactory forestValue181_36_2;
    byte[] forestValue181_36_3;
    javax.crypto.Cipher forestValue181_53_0;
    int forestValue181_53_1;
    javax.crypto.SecretKeyFactory forestValue181_53_2;
    byte[] forestValue181_53_3;
    javax.crypto.Cipher spill181_0;
    int spill181_1;
    javax.crypto.SecretKeyFactory spill181_2;
    byte[] spill181_3;
    byte[] spill181_4;
    java.lang.String spill181_5;
    int spill181_6;
    java.lang.String spill181_7;
    java.lang.String[] spill181_8;
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
    b = ((long)(((moom._a)(moom._c.a(((long)(-773590344140561183L)), ((long)(2822180302638212568L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(92351266219576L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    life0_16 = (com.moon.qP.b ^ 124472064157092L);
    spill181_0 = (life2_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill181_1 = 2;
    spill181_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp181_9_0 = new byte[8];
    spill181_3 = __stackOp181_9_0;
    (__stackOp181_9_0)[0] = ((byte) ((int) (life0_16 >>> 56)));
    life3_35 = 1;
    forestValue181_36_0 = spill181_0;
    forestValue181_36_1 = spill181_1;
    forestValue181_36_2 = spill181_2;
    forestValue181_36_3 = spill181_3;
    forest_cycle_36: while (true) {
    if (!((life3_35 < 8))) {
        forestValue181_53_0 = forestValue181_36_0;
        forestValue181_53_1 = forestValue181_36_1;
        forestValue181_53_2 = forestValue181_36_2;
        forestValue181_53_3 = forestValue181_36_3;
        break forest_join_53;
    }
    byte[] __stackOp181_10_0 = forestValue181_36_3;
    spill181_4 = __stackOp181_10_0;
    (__stackOp181_10_0)[life3_35] = ((byte) ((int) ((life0_16 << (life3_35 * 8)) >>> 56)));
    life3_35 += 1;
    forestValue181_36_3 = spill181_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue181_53_0)).init(((int)(forestValue181_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue181_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue181_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life9_66 = new java.lang.String[2];
    life7_68 = 0;
    life8_73 = ((java.lang.String)((life6_71 = "ö\tµ\000\001SgOÀoK±¬(ÖµöÚ\"\013æâä#4\"\007D?oK\006¼Ì\030Ä\03711Ú¬H¸¹î*ù-àn03\035ì&58/(»-tý*G9K\177:6$¿\034Ð×\035E¡®é)\ræÂ¬îÍ!\022ºô\001B-"))).length();
    life5_75 = 56;
    life4_77 = -1;
    forest_cycle_78: while (true) {
    life4_77 += 1;
    spill181_5 = life6_71;
    int __stackOp181_14_0 = life4_77;
    java.lang.String __stackOp181_16_0 = ((java.lang.String)(spill181_5)).substring(((int)(__stackOp181_14_0)), ((int)((__stackOp181_14_0 + life5_75))));
    int __stackOp181_16_1 = -1;
    spill181_6 = __stackOp181_16_1;
    byte[] __stackOp181_18_0 = ((java.lang.String)(__stackOp181_16_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp181_18_1 = life2_20;
    life10_93 = ((javax.crypto.Cipher)(__stackOp181_18_1)).doFinal(((byte[])(__stackOp181_18_0)));
    int __stackOp181_22_0 = spill181_6;
    java.lang.String __stackOp181_22_1 = ((java.lang.String)(com.moon.qP.a(((byte[])(life10_93))))).intern();
    spill181_7 = __stackOp181_22_1;
    recovery.source.CarrierOps.discard(__stackOp181_22_0);
    java.lang.String __stackOp181_24_0 = spill181_7;
    java.lang.String[] __stackOp181_24_1 = life9_66;
    spill181_8 = __stackOp181_24_1;
    java.lang.String __stackOp181_25_0 = __stackOp181_24_0;
    int __stackOp181_25_1 = (life7_68++);
    (spill181_8)[__stackOp181_25_1] = __stackOp181_25_0;
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

private static native <E extends Throwable> void __sourceConstructorInit_da3b3d2c16398c04_0(com.moon.qP a0) throws E;
private static native <E extends Throwable> java.lang.String __sourceHandlerCall_e55c3ae579e02779ba41(int a0, long a1) throws E;
private static final class __SourceHandler_e55c3ae579e02779ba41 {

public static java.lang.String f161(int p0, long p1) throws Throwable {
    int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 2299);
    if (((__fieldRead161_0())[life5_8] == null)) {
        life3_16 = __call161_3(__call161_2(__call161_1()));
        life4_21 = __cast161_6(__call161_5(__fieldRead161_4(), life3_16));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = __call161_7("DES/CBC/PKCS5Padding");
        (life4_21)[1] = __call161_8("DES");
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        __call161_10(__fieldRead161_9(), life3_16, life4_21);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_63: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = __call161_12(__cast161_11((life4_21)[1]), life7_92);
        __call161_15(__cast161_13((life4_21)[0]), 2, life8_99, __cast161_14((life4_21)[2]));
        life9_116 = __call161_17((__fieldRead161_16())[life5_8], "ISO-8859-1");
        (__fieldRead161_18())[life5_8] = __call161_21(__call161_20(__cast161_19((life4_21)[0]), life9_116));
    }
    return (__fieldRead161_22())[life5_8];
}
public static java.lang.String h161_0(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    throw new java.lang.RuntimeException("com/moon/qP", local1);
}
private static native java.lang.String[] __fieldRead161_0() throws Throwable;
private static native java.lang.Thread __call161_1() throws Throwable;
private static native long __call161_2(java.lang.Thread a0) throws Throwable;
private static native java.lang.Long __call161_3(long a0) throws Throwable;
private static native java.util.Map __fieldRead161_4() throws Throwable;
private static native java.lang.Object __call161_5(java.util.Map a0, java.lang.Long a1) throws Throwable;
private static native java.lang.Object[] __cast161_6(java.lang.Object a0) throws Throwable;
private static native javax.crypto.Cipher __call161_7(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call161_8(java.lang.String a0) throws Throwable;
private static native java.util.Map __fieldRead161_9() throws Throwable;
private static native java.lang.Object __call161_10(java.util.Map a0, java.lang.Long a1, java.lang.Object[] a2) throws Throwable;
private static native javax.crypto.SecretKeyFactory __cast161_11(java.lang.Object a0) throws Throwable;
private static native javax.crypto.SecretKey __call161_12(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native javax.crypto.Cipher __cast161_13(java.lang.Object a0) throws Throwable;
private static native javax.crypto.spec.IvParameterSpec __cast161_14(java.lang.Object a0) throws Throwable;
private static native void __call161_15(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native java.lang.String[] __fieldRead161_16() throws Throwable;
private static native byte[] __call161_17(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String[] __fieldRead161_18() throws Throwable;
private static native javax.crypto.Cipher __cast161_19(java.lang.Object a0) throws Throwable;
private static native byte[] __call161_20(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native java.lang.String __call161_21(byte[] a0) throws Throwable;
private static native java.lang.String[] __fieldRead161_22() throws Throwable;

}

private static native <E extends Throwable> java.lang.invoke.CallSite __sourceHandlerCall_f15c3555ff76055044e6(java.lang.invoke.MethodHandles.Lookup a0, java.lang.String a1, java.lang.invoke.MethodType a2) throws E;
private static final class __SourceHandler_f15c3555ff76055044e6 {

public static java.lang.invoke.CallSite f162(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.invoke.MutableCallSite life3_4;
    life3_4 = new java.lang.invoke.MutableCallSite(p2);
    java.lang.invoke.MutableCallSite spill162_0 = life3_4;
    java.lang.invoke.MethodHandle spill162_1 = __call162_3(__methodHandleLiteral162_0(), __classLiteral162_1(), __call162_2(p2));
    int spill162_2 = 0;
    java.lang.Object[] __stackOp162_4_0 = new java.lang.Object[3];
    java.lang.Object[] spill162_3 = __stackOp162_4_0;
    (__stackOp162_4_0)[0] = p0;
    java.lang.Object[] __stackOp162_5_0 = spill162_3;
    java.lang.Object[] spill162_4 = __stackOp162_5_0;
    (__stackOp162_5_0)[1] = life3_4;
    java.lang.Object[] __stackOp162_6_0 = spill162_4;
    java.lang.Object[] spill162_5 = __stackOp162_6_0;
    (__stackOp162_6_0)[2] = p1;
    __call162_9(spill162_0, __call162_8(__call162_7(spill162_1, spill162_2, spill162_5), p2));
    return life3_4;
}
public static java.lang.invoke.CallSite h162_0(java.lang.Exception p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.Exception local3 = p0;
    throw new java.lang.RuntimeException(__call2016200_6(__call2016200_5(__call2016200_3(__call2016200_2(__call2016200_1(__call2016200_0(new java.lang.StringBuilder(), "com/moon/qP"), " : "), p1), " : "), __call2016200_4(p2))), local3);
}
private static native java.lang.invoke.MethodHandle __methodHandleLiteral162_0() throws Throwable;
private static native java.lang.Object __classLiteral162_1() throws Throwable;
private static native int __call162_2(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.invoke.MethodHandle __call162_3(java.lang.invoke.MethodHandle a0, java.lang.Object a1, int a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call162_7(java.lang.invoke.MethodHandle a0, int a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call162_8(java.lang.invoke.MethodHandle a0, java.lang.invoke.MethodType a1) throws Throwable;
private static native void __call162_9(java.lang.invoke.MutableCallSite a0, java.lang.invoke.MethodHandle a1) throws Throwable;
private static native java.lang.StringBuilder __call2016200_0(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2016200_1(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2016200_2(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2016200_3(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2016200_4(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.StringBuilder __call2016200_5(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2016200_6(java.lang.StringBuilder a0) throws Throwable;

}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) { return __sourceHandlerCall_f15c3555ff76055044e6(p0, p1, p2); }


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.qP.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.String a(int p0, long p1) { return __sourceHandlerCall_e55c3ae579e02779ba41(p0, p1); }


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
        byte[] spill1286_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1286_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1286_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1286_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1286_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1286_2)[life4_9];
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
org.luaj.vm2.LuaValue forwardValue1287_26_0;
    int forwardValue1287_31_0;
    org.luaj.vm2.LuaValue forwardValue1287_47_0;
    int forwardValue1287_50_0;
    org.luaj.vm2.LuaValue spill1287_0;
    boolean spill1287_1;
    org.luaj.vm2.LuaValue spill1287_2;
    boolean spill1287_3;
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
    life3_3 = (com.moon.qP.b ^ 20025539562615L);
    life5_5 = com.moon.jN.c();
    spill1287_0 = p0;
    if (!((life5_5 == 0))) {
        forwardValue1287_26_0 = spill1287_0;
        break forward_join_26;
    }
    if (!((!((org.luaj.vm2.LuaValue)(spill1287_0)).isnil()))) {
        break forward_join_16;
    }
    spill1287_1 = ((org.luaj.vm2.LuaValue)(p0)).isnumber();
    if (!((life5_5 == 0))) {
        forwardValue1287_31_0 = ((spill1287_1) ? 1 : 0);
        break forward_join_31;
    }
    if (!((!spill1287_1))) {
        break forward_join_27;
    }
    }
    java.lang.String __stackOp1287_7_0 = ((org.luaj.vm2.LuaValue)(p0)).typename();
    java.lang.String __stackOp1287_7_1 = __sourceIntrinsic_fc861287a8ca_invokedynamic1287_6(5716, (6881437039686489992L ^ life3_3));
    forwardValue1287_26_0 = org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_fc861287a8ca_invokedynamic1287_8(__stackOp1287_7_1, __stackOp1287_7_0))));
    }
    return forwardValue1287_26_0;
    }
    spill1287_2 = p1;
    if (!((life5_5 == 0))) {
        forwardValue1287_47_0 = spill1287_2;
        break forward_join_47;
    }
    forwardValue1287_31_0 = ((((org.luaj.vm2.LuaValue)(spill1287_2)).isnil()) ? 1 : 0);
    }
    if (!((forwardValue1287_31_0 == 0))) {
        break forward_join_37;
    }
    spill1287_3 = ((org.luaj.vm2.LuaValue)(p1)).isnumber();
    if (!((life5_5 == 0))) {
        forwardValue1287_50_0 = ((spill1287_3) ? 1 : 0);
        break forward_join_50;
    }
    if (!((!spill1287_3))) {
        break forward_join_48;
    }
    }
    java.lang.String __stackOp1287_16_0 = ((org.luaj.vm2.LuaValue)(p1)).typename();
    java.lang.String __stackOp1287_16_1 = __sourceIntrinsic_fc861287a8ca_invokedynamic1287_15(583, (2578737680591618970L ^ life3_3));
    forwardValue1287_47_0 = org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_fc861287a8ca_invokedynamic1287_17(__stackOp1287_16_1, __stackOp1287_16_0))));
    }
    return forwardValue1287_47_0;
    }
    forwardValue1287_50_0 = ((org.luaj.vm2.LuaValue)(p0)).toint();
    }
    life6_74 = forwardValue1287_50_0;
    life7_77 = ((org.luaj.vm2.LuaValue)(p1)).toint();
    ((com.moon.j1)(((com.moon.jS)(this.a)).c)).swap(((int)(life6_74)), ((int)(life7_77)));
    return org.luaj.vm2.LuaValue.NIL;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fc861287a8ca_invokedynamic1287_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fc861287a8ca_invokedynamic1287_8(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fc861287a8ca_invokedynamic1287_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fc861287a8ca_invokedynamic1287_17(java.lang.String a0, java.lang.String a1) throws E;
}
