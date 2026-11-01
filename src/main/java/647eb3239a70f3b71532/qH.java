package com.moon;


class qH extends org.luaj.vm2.lib.OneArgFunction {

com.moon.scripting.api.types.render.RenderBatch a;

com.moon.kb b;

private static long c;

private static java.lang.String[] d;

private static java.lang.String[] e;

private static java.util.Map f;

qH(com.moon.kb p0, com.moon.scripting.api.types.render.RenderBatch p1) { super(); }

private static void __sourceConstructorBody_21edb6ac3483ab27(com.moon.qH receiver, com.moon.kb p0, com.moon.scripting.api.types.render.RenderBatch p1) throws Throwable {
((com.moon.qH)(receiver)).b = ((com.moon.kb)(p0));
    ((com.moon.qH)(receiver)).a = ((com.moon.scripting.api.types.render.RenderBatch)(p1));
    com.moon.qH.__sourceConstructorInit_21edb6ac3483ab27_0(((com.moon.qH)(receiver)));
    return;
}


static {
javax.crypto.Cipher forestValue165_36_0;
    int forestValue165_36_1;
    javax.crypto.SecretKeyFactory forestValue165_36_2;
    byte[] forestValue165_36_3;
    javax.crypto.Cipher forestValue165_53_0;
    int forestValue165_53_1;
    javax.crypto.SecretKeyFactory forestValue165_53_2;
    byte[] forestValue165_53_3;
    javax.crypto.Cipher spill165_0;
    int spill165_1;
    javax.crypto.SecretKeyFactory spill165_2;
    byte[] spill165_3;
    byte[] spill165_4;
    java.lang.String spill165_5;
    int spill165_6;
    java.lang.String spill165_7;
    java.lang.String[] spill165_8;
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
    c = ((long)(((moom._a)(moom._c.a(((long)(-5741532518926855560L)), ((long)(-6518050777219578803L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(83193682538210L)))));
    f = ((java.util.Map)(new java.util.HashMap(13)));
    life0_16 = (com.moon.qH.c ^ 43237140056257L);
    spill165_0 = (life2_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill165_1 = 2;
    spill165_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp165_9_0 = new byte[8];
    spill165_3 = __stackOp165_9_0;
    (__stackOp165_9_0)[0] = ((byte) ((int) (life0_16 >>> 56)));
    life3_35 = 1;
    forestValue165_36_0 = spill165_0;
    forestValue165_36_1 = spill165_1;
    forestValue165_36_2 = spill165_2;
    forestValue165_36_3 = spill165_3;
    forest_cycle_36: while (true) {
    if (!((life3_35 < 8))) {
        forestValue165_53_0 = forestValue165_36_0;
        forestValue165_53_1 = forestValue165_36_1;
        forestValue165_53_2 = forestValue165_36_2;
        forestValue165_53_3 = forestValue165_36_3;
        break forest_join_53;
    }
    byte[] __stackOp165_10_0 = forestValue165_36_3;
    spill165_4 = __stackOp165_10_0;
    (__stackOp165_10_0)[life3_35] = ((byte) ((int) ((life0_16 << (life3_35 * 8)) >>> 56)));
    life3_35 += 1;
    forestValue165_36_3 = spill165_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue165_53_0)).init(((int)(forestValue165_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue165_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue165_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life9_66 = new java.lang.String[2];
    life7_68 = 0;
    life8_73 = ((java.lang.String)((life6_71 = "©\002²\024.¨j\006UÃÇ±ö\035)iê5<-:DÖ·8Ë¶Ó\0257\b\002À9he@øJ]²Ï\r¼u©\036akrE(y²ÑkÿòéÁ¿\000\tÉ\023J¦Võø`Âå?/®¨4AÂlg\034ë¥»É¡\026u\016#>1sNçÝM#æê&Ñ\024\036¶Í>®\035^þn±áQ\"zëDL#íôy\177\t¢J\t3\177P¬GÌù\013yr?ÃFÔ\023;yáÕSo\001@"))).length();
    life5_75 = 80;
    life4_77 = -1;
    forest_cycle_78: while (true) {
    life4_77 += 1;
    spill165_5 = life6_71;
    int __stackOp165_14_0 = life4_77;
    java.lang.String __stackOp165_16_0 = ((java.lang.String)(spill165_5)).substring(((int)(__stackOp165_14_0)), ((int)((__stackOp165_14_0 + life5_75))));
    int __stackOp165_16_1 = -1;
    spill165_6 = __stackOp165_16_1;
    byte[] __stackOp165_18_0 = ((java.lang.String)(__stackOp165_16_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp165_18_1 = life2_20;
    life10_93 = ((javax.crypto.Cipher)(__stackOp165_18_1)).doFinal(((byte[])(__stackOp165_18_0)));
    int __stackOp165_22_0 = spill165_6;
    java.lang.String __stackOp165_22_1 = ((java.lang.String)(com.moon.qH.a(((byte[])(life10_93))))).intern();
    spill165_7 = __stackOp165_22_1;
    recovery.source.CarrierOps.discard(__stackOp165_22_0);
    java.lang.String __stackOp165_24_0 = spill165_7;
    java.lang.String[] __stackOp165_24_1 = life9_66;
    spill165_8 = __stackOp165_24_1;
    java.lang.String __stackOp165_25_0 = __stackOp165_24_0;
    int __stackOp165_25_1 = (life7_68++);
    (spill165_8)[__stackOp165_25_1] = __stackOp165_25_0;
    if (!(((life4_77 = (life4_77 + life5_75)) < life8_73))) {
        break forest_join_116;
    }
    life5_75 = ((int)(((java.lang.String)(life6_71)).charAt(((int)(life4_77)))));
    continue forest_cycle_78;
    }
    }
    d = ((java.lang.String[])(life9_66));
    e = ((java.lang.String[])(new java.lang.String[2]));
}

private static native <E extends Throwable> void __sourceConstructorInit_21edb6ac3483ab27_0(com.moon.qH a0) throws E;
private static native <E extends Throwable> java.lang.String __sourceHandlerCall_58a45e99a1130f96815e(int a0, long a1) throws E;
private static final class __SourceHandler_58a45e99a1130f96815e {

public static java.lang.String f145(int p0, long p1) throws Throwable {
    int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 19145);
    if (((__fieldRead145_0())[life5_8] == null)) {
        life3_16 = __call145_3(__call145_2(__call145_1()));
        life4_21 = __cast145_6(__call145_5(__fieldRead145_4(), life3_16));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = __call145_7("DES/CBC/PKCS5Padding");
        (life4_21)[1] = __call145_8("DES");
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        __call145_10(__fieldRead145_9(), life3_16, life4_21);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_63: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = __call145_12(__cast145_11((life4_21)[1]), life7_92);
        __call145_15(__cast145_13((life4_21)[0]), 2, life8_99, __cast145_14((life4_21)[2]));
        life9_116 = __call145_17((__fieldRead145_16())[life5_8], "ISO-8859-1");
        (__fieldRead145_18())[life5_8] = __call145_21(__call145_20(__cast145_19((life4_21)[0]), life9_116));
    }
    return (__fieldRead145_22())[life5_8];
}
public static java.lang.String h145_0(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    throw new java.lang.RuntimeException("com/moon/qH", local1);
}
private static native java.lang.String[] __fieldRead145_0() throws Throwable;
private static native java.lang.Thread __call145_1() throws Throwable;
private static native long __call145_2(java.lang.Thread a0) throws Throwable;
private static native java.lang.Long __call145_3(long a0) throws Throwable;
private static native java.util.Map __fieldRead145_4() throws Throwable;
private static native java.lang.Object __call145_5(java.util.Map a0, java.lang.Long a1) throws Throwable;
private static native java.lang.Object[] __cast145_6(java.lang.Object a0) throws Throwable;
private static native javax.crypto.Cipher __call145_7(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call145_8(java.lang.String a0) throws Throwable;
private static native java.util.Map __fieldRead145_9() throws Throwable;
private static native java.lang.Object __call145_10(java.util.Map a0, java.lang.Long a1, java.lang.Object[] a2) throws Throwable;
private static native javax.crypto.SecretKeyFactory __cast145_11(java.lang.Object a0) throws Throwable;
private static native javax.crypto.SecretKey __call145_12(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native javax.crypto.Cipher __cast145_13(java.lang.Object a0) throws Throwable;
private static native javax.crypto.spec.IvParameterSpec __cast145_14(java.lang.Object a0) throws Throwable;
private static native void __call145_15(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native java.lang.String[] __fieldRead145_16() throws Throwable;
private static native byte[] __call145_17(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String[] __fieldRead145_18() throws Throwable;
private static native javax.crypto.Cipher __cast145_19(java.lang.Object a0) throws Throwable;
private static native byte[] __call145_20(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native java.lang.String __call145_21(byte[] a0) throws Throwable;
private static native java.lang.String[] __fieldRead145_22() throws Throwable;

}

private static native <E extends Throwable> java.lang.invoke.CallSite __sourceHandlerCall_338fcd552b96e0a37b27(java.lang.invoke.MethodHandles.Lookup a0, java.lang.String a1, java.lang.invoke.MethodType a2) throws E;
private static final class __SourceHandler_338fcd552b96e0a37b27 {

public static java.lang.invoke.CallSite f146(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.invoke.MutableCallSite life3_4;
    life3_4 = new java.lang.invoke.MutableCallSite(p2);
    java.lang.invoke.MutableCallSite spill146_0 = life3_4;
    java.lang.invoke.MethodHandle spill146_1 = __call146_3(__methodHandleLiteral146_0(), __classLiteral146_1(), __call146_2(p2));
    int spill146_2 = 0;
    java.lang.Object[] __stackOp146_4_0 = new java.lang.Object[3];
    java.lang.Object[] spill146_3 = __stackOp146_4_0;
    (__stackOp146_4_0)[0] = p0;
    java.lang.Object[] __stackOp146_5_0 = spill146_3;
    java.lang.Object[] spill146_4 = __stackOp146_5_0;
    (__stackOp146_5_0)[1] = life3_4;
    java.lang.Object[] __stackOp146_6_0 = spill146_4;
    java.lang.Object[] spill146_5 = __stackOp146_6_0;
    (__stackOp146_6_0)[2] = p1;
    __call146_9(spill146_0, __call146_8(__call146_7(spill146_1, spill146_2, spill146_5), p2));
    return life3_4;
}
public static java.lang.invoke.CallSite h146_0(java.lang.Exception p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.Exception local3 = p0;
    throw new java.lang.RuntimeException(__call2014600_6(__call2014600_5(__call2014600_3(__call2014600_2(__call2014600_1(__call2014600_0(new java.lang.StringBuilder(), "com/moon/qH"), " : "), p1), " : "), __call2014600_4(p2))), local3);
}
private static native java.lang.invoke.MethodHandle __methodHandleLiteral146_0() throws Throwable;
private static native java.lang.Object __classLiteral146_1() throws Throwable;
private static native int __call146_2(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.invoke.MethodHandle __call146_3(java.lang.invoke.MethodHandle a0, java.lang.Object a1, int a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call146_7(java.lang.invoke.MethodHandle a0, int a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call146_8(java.lang.invoke.MethodHandle a0, java.lang.invoke.MethodType a1) throws Throwable;
private static native void __call146_9(java.lang.invoke.MutableCallSite a0, java.lang.invoke.MethodHandle a1) throws Throwable;
private static native java.lang.StringBuilder __call2014600_0(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2014600_1(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2014600_2(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2014600_3(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2014600_4(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.StringBuilder __call2014600_5(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2014600_6(java.lang.StringBuilder a0) throws Throwable;

}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) { return __sourceHandlerCall_338fcd552b96e0a37b27(p0, p1, p2); }


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.qH.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.String a(int p0, long p1) { return __sourceHandlerCall_58a45e99a1130f96815e(p0, p1); }


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
        byte[] spill1270_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1270_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1270_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1270_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1270_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1270_2)[life4_9];
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


public org.luaj.vm2.LuaValue call(org.luaj.vm2.LuaValue p0) {
java.lang.Object forwardValue100050_25_0;
    java.lang.Object forwardValue100050_32_0;
    org.luaj.vm2.LuaValue spill100050_0;
    java.lang.Object spill100050_1;
    long life2_3;
    java.lang.String[] life4_5;
    java.lang.Object life5_30;
    com.moon.scripting.api.types.templates.RenderTemplate life6_44;
    forward_join_47: {
    forward_join_36: {
    forward_join_32: {
    forward_join_25: {
    forward_join_22: {
    life2_3 = (com.moon.qH.c ^ 7454933610337L);
    life4_5 = com.moon.kb.a();
    spill100050_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue100050_25_0 = spill100050_0;
        break forward_join_25;
    }
    if (!(((org.luaj.vm2.LuaValue)(spill100050_0)).isnil())) {
        break forward_join_22;
    }
    java.lang.String __stackOp100050_5_0 = ((org.luaj.vm2.LuaValue)(p0)).typename();
    java.lang.String __stackOp100050_5_1 = __sourceIntrinsic_2a79a5f862bb_invokedynamic100050_4(5551, (1925642185031252770L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_2a79a5f862bb_invokedynamic100050_6(__stackOp100050_5_1, __stackOp100050_5_0))));
    }
    forwardValue100050_25_0 = org.luaj.vm2.lib.jse.CoerceLuaToJava.coerce(((org.luaj.vm2.LuaValue)(p0)), ((java.lang.Class)(java.lang.Object.class)));
    }
    life5_30 = forwardValue100050_25_0;
    spill100050_1 = life5_30;
    if (!((life4_5 == null))) {
        forwardValue100050_32_0 = spill100050_1;
        break forward_join_32;
    }
    if (!((((spill100050_1 instanceof com.moon.scripting.api.types.templates.RenderTemplate) ? 1 : 0) != 0))) {
        break forward_join_36;
    }
    forwardValue100050_32_0 = life5_30;
    }
    life6_44 = ((com.moon.scripting.api.types.templates.RenderTemplate)(forwardValue100050_32_0));
    if (!((life4_5 != null))) {
        break forward_join_47;
    }
    }
    java.lang.String __stackOp100050_14_0 = ((org.luaj.vm2.LuaValue)(p0)).typename();
    java.lang.String __stackOp100050_14_1 = __sourceIntrinsic_2a79a5f862bb_invokedynamic100050_13(22545, (1981829242381088413L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_2a79a5f862bb_invokedynamic100050_15(__stackOp100050_14_1, __stackOp100050_14_0))));
    }
    ((com.moon.scripting.api.types.render.RenderBatch)(this.a)).add(((com.moon.scripting.api.types.templates.RenderTemplate)(life6_44)));
    return com.moon.qH.NIL;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2a79a5f862bb_invokedynamic100050_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2a79a5f862bb_invokedynamic100050_6(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2a79a5f862bb_invokedynamic100050_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2a79a5f862bb_invokedynamic100050_15(java.lang.String a0, java.lang.String a1) throws E;
}
