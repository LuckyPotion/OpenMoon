package com.moon;


class qK extends org.luaj.vm2.lib.ThreeArgFunction {

com.moon.jT a;

private static long b;

private static java.lang.String[] c;

private static java.lang.String[] d;

private static java.util.Map e;

qK(com.moon.jT p0) { super(); }

private static void __sourceConstructorBody_af328d015491fd58(com.moon.qK receiver, com.moon.jT p0) throws Throwable {
((com.moon.qK)(receiver)).a = ((com.moon.jT)(p0));
    com.moon.qK.__sourceConstructorInit_af328d015491fd58_0(((com.moon.qK)(receiver)));
    return;
}


static {
javax.crypto.Cipher forestValue171_36_0;
    int forestValue171_36_1;
    javax.crypto.SecretKeyFactory forestValue171_36_2;
    byte[] forestValue171_36_3;
    javax.crypto.Cipher forestValue171_53_0;
    int forestValue171_53_1;
    javax.crypto.SecretKeyFactory forestValue171_53_2;
    byte[] forestValue171_53_3;
    javax.crypto.Cipher spill171_0;
    int spill171_1;
    javax.crypto.SecretKeyFactory spill171_2;
    byte[] spill171_3;
    byte[] spill171_4;
    java.lang.String spill171_5;
    int spill171_6;
    java.lang.String spill171_7;
    java.lang.String[] spill171_8;
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
    b = ((long)(((moom._a)(moom._c.a(((long)(-3028799989349795787L)), ((long)(-1893731167182832924L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(55194296944846L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    life0_16 = (com.moon.qK.b ^ 6493827056743L);
    spill171_0 = (life2_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill171_1 = 2;
    spill171_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp171_9_0 = new byte[8];
    spill171_3 = __stackOp171_9_0;
    (__stackOp171_9_0)[0] = ((byte) ((int) (life0_16 >>> 56)));
    life3_35 = 1;
    forestValue171_36_0 = spill171_0;
    forestValue171_36_1 = spill171_1;
    forestValue171_36_2 = spill171_2;
    forestValue171_36_3 = spill171_3;
    forest_cycle_36: while (true) {
    if (!((life3_35 < 8))) {
        forestValue171_53_0 = forestValue171_36_0;
        forestValue171_53_1 = forestValue171_36_1;
        forestValue171_53_2 = forestValue171_36_2;
        forestValue171_53_3 = forestValue171_36_3;
        break forest_join_53;
    }
    byte[] __stackOp171_10_0 = forestValue171_36_3;
    spill171_4 = __stackOp171_10_0;
    (__stackOp171_10_0)[life3_35] = ((byte) ((int) ((life0_16 << (life3_35 * 8)) >>> 56)));
    life3_35 += 1;
    forestValue171_36_3 = spill171_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue171_53_0)).init(((int)(forestValue171_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue171_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue171_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life9_66 = new java.lang.String[3];
    life7_68 = 0;
    life8_73 = ((java.lang.String)((life6_71 = "i±{+CHÌ\024Ù«Öa¯\013\013!ñ[É\037?Qñ\024#×>\001Ã¹ø­Ô\001\"\t#\r©<lüæSàp\023%ot\016V8\rYÕëB<\002U= W:Ñp%íD=´ºK.Ç\027¡Vø¡ej4ë©*\033-½Z¯Rz\036²§?Øqo§Mb0æ°1i\025j\027gU{U¬\nØ\030Á'\003ÃC\023¾è\026Jl'¸/v±\002l[\016¼²Rìth¢¶"))).length();
    life5_75 = 56;
    life4_77 = -1;
    forest_cycle_78: while (true) {
    life4_77 += 1;
    spill171_5 = life6_71;
    int __stackOp171_14_0 = life4_77;
    java.lang.String __stackOp171_16_0 = ((java.lang.String)(spill171_5)).substring(((int)(__stackOp171_14_0)), ((int)((__stackOp171_14_0 + life5_75))));
    int __stackOp171_16_1 = -1;
    spill171_6 = __stackOp171_16_1;
    byte[] __stackOp171_18_0 = ((java.lang.String)(__stackOp171_16_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp171_18_1 = life2_20;
    life10_93 = ((javax.crypto.Cipher)(__stackOp171_18_1)).doFinal(((byte[])(__stackOp171_18_0)));
    int __stackOp171_22_0 = spill171_6;
    java.lang.String __stackOp171_22_1 = ((java.lang.String)(com.moon.qK.a(((byte[])(life10_93))))).intern();
    spill171_7 = __stackOp171_22_1;
    recovery.source.CarrierOps.discard(__stackOp171_22_0);
    java.lang.String __stackOp171_24_0 = spill171_7;
    java.lang.String[] __stackOp171_24_1 = life9_66;
    spill171_8 = __stackOp171_24_1;
    java.lang.String __stackOp171_25_0 = __stackOp171_24_0;
    int __stackOp171_25_1 = (life7_68++);
    (spill171_8)[__stackOp171_25_1] = __stackOp171_25_0;
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

private static native <E extends Throwable> void __sourceConstructorInit_af328d015491fd58_0(com.moon.qK a0) throws E;
private static native <E extends Throwable> java.lang.String __sourceHandlerCall_b9d66d9aebbfa80b7f3b(int a0, long a1) throws E;
private static final class __SourceHandler_b9d66d9aebbfa80b7f3b {

public static java.lang.String f151(int p0, long p1) throws Throwable {
    int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 4297);
    if (((__fieldRead151_0())[life5_8] == null)) {
        life3_16 = __call151_3(__call151_2(__call151_1()));
        life4_21 = __cast151_6(__call151_5(__fieldRead151_4(), life3_16));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = __call151_7("DES/CBC/PKCS5Padding");
        (life4_21)[1] = __call151_8("DES");
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        __call151_10(__fieldRead151_9(), life3_16, life4_21);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_63: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = __call151_12(__cast151_11((life4_21)[1]), life7_92);
        __call151_15(__cast151_13((life4_21)[0]), 2, life8_99, __cast151_14((life4_21)[2]));
        life9_116 = __call151_17((__fieldRead151_16())[life5_8], "ISO-8859-1");
        (__fieldRead151_18())[life5_8] = __call151_21(__call151_20(__cast151_19((life4_21)[0]), life9_116));
    }
    return (__fieldRead151_22())[life5_8];
}
public static java.lang.String h151_0(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    throw new java.lang.RuntimeException("com/moon/qK", local1);
}
private static native java.lang.String[] __fieldRead151_0() throws Throwable;
private static native java.lang.Thread __call151_1() throws Throwable;
private static native long __call151_2(java.lang.Thread a0) throws Throwable;
private static native java.lang.Long __call151_3(long a0) throws Throwable;
private static native java.util.Map __fieldRead151_4() throws Throwable;
private static native java.lang.Object __call151_5(java.util.Map a0, java.lang.Long a1) throws Throwable;
private static native java.lang.Object[] __cast151_6(java.lang.Object a0) throws Throwable;
private static native javax.crypto.Cipher __call151_7(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call151_8(java.lang.String a0) throws Throwable;
private static native java.util.Map __fieldRead151_9() throws Throwable;
private static native java.lang.Object __call151_10(java.util.Map a0, java.lang.Long a1, java.lang.Object[] a2) throws Throwable;
private static native javax.crypto.SecretKeyFactory __cast151_11(java.lang.Object a0) throws Throwable;
private static native javax.crypto.SecretKey __call151_12(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native javax.crypto.Cipher __cast151_13(java.lang.Object a0) throws Throwable;
private static native javax.crypto.spec.IvParameterSpec __cast151_14(java.lang.Object a0) throws Throwable;
private static native void __call151_15(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native java.lang.String[] __fieldRead151_16() throws Throwable;
private static native byte[] __call151_17(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String[] __fieldRead151_18() throws Throwable;
private static native javax.crypto.Cipher __cast151_19(java.lang.Object a0) throws Throwable;
private static native byte[] __call151_20(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native java.lang.String __call151_21(byte[] a0) throws Throwable;
private static native java.lang.String[] __fieldRead151_22() throws Throwable;

}

private static native <E extends Throwable> java.lang.invoke.CallSite __sourceHandlerCall_abf64b6a9407b87596ff(java.lang.invoke.MethodHandles.Lookup a0, java.lang.String a1, java.lang.invoke.MethodType a2) throws E;
private static final class __SourceHandler_abf64b6a9407b87596ff {

public static java.lang.invoke.CallSite f152(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.invoke.MutableCallSite life3_4;
    life3_4 = new java.lang.invoke.MutableCallSite(p2);
    java.lang.invoke.MutableCallSite spill152_0 = life3_4;
    java.lang.invoke.MethodHandle spill152_1 = __call152_3(__methodHandleLiteral152_0(), __classLiteral152_1(), __call152_2(p2));
    int spill152_2 = 0;
    java.lang.Object[] __stackOp152_4_0 = new java.lang.Object[3];
    java.lang.Object[] spill152_3 = __stackOp152_4_0;
    (__stackOp152_4_0)[0] = p0;
    java.lang.Object[] __stackOp152_5_0 = spill152_3;
    java.lang.Object[] spill152_4 = __stackOp152_5_0;
    (__stackOp152_5_0)[1] = life3_4;
    java.lang.Object[] __stackOp152_6_0 = spill152_4;
    java.lang.Object[] spill152_5 = __stackOp152_6_0;
    (__stackOp152_6_0)[2] = p1;
    __call152_9(spill152_0, __call152_8(__call152_7(spill152_1, spill152_2, spill152_5), p2));
    return life3_4;
}
public static java.lang.invoke.CallSite h152_0(java.lang.Exception p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.Exception local3 = p0;
    throw new java.lang.RuntimeException(__call2015200_6(__call2015200_5(__call2015200_3(__call2015200_2(__call2015200_1(__call2015200_0(new java.lang.StringBuilder(), "com/moon/qK"), " : "), p1), " : "), __call2015200_4(p2))), local3);
}
private static native java.lang.invoke.MethodHandle __methodHandleLiteral152_0() throws Throwable;
private static native java.lang.Object __classLiteral152_1() throws Throwable;
private static native int __call152_2(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.invoke.MethodHandle __call152_3(java.lang.invoke.MethodHandle a0, java.lang.Object a1, int a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call152_7(java.lang.invoke.MethodHandle a0, int a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call152_8(java.lang.invoke.MethodHandle a0, java.lang.invoke.MethodType a1) throws Throwable;
private static native void __call152_9(java.lang.invoke.MutableCallSite a0, java.lang.invoke.MethodHandle a1) throws Throwable;
private static native java.lang.StringBuilder __call2015200_0(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2015200_1(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2015200_2(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2015200_3(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2015200_4(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.StringBuilder __call2015200_5(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2015200_6(java.lang.StringBuilder a0) throws Throwable;

}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) { return __sourceHandlerCall_abf64b6a9407b87596ff(p0, p1, p2); }


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.qK.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.String a(int p0, long p1) { return __sourceHandlerCall_b9d66d9aebbfa80b7f3b(p0, p1); }


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
        byte[] spill1276_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1276_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1276_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1276_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1276_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1276_2)[life4_9];
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
org.luaj.vm2.LuaValue forwardValue1277_26_0;
    int forwardValue1277_31_0;
    org.luaj.vm2.LuaValue forwardValue1277_47_0;
    int forwardValue1277_52_0;
    org.luaj.vm2.LuaValue forwardValue1277_65_0;
    org.luaj.vm2.LuaValue spill1277_0;
    boolean spill1277_1;
    org.luaj.vm2.LuaValue spill1277_2;
    boolean spill1277_3;
    org.luaj.vm2.LuaValue spill1277_4;
    long life4_3;
    int life6_5;
    java.lang.String life7_95;
    java.lang.String life8_98;
    java.lang.Object life9_102;
    forward_join_65: {
    forward_join_64: {
    forward_join_52: {
    forward_join_48: {
    forward_join_47: {
    forward_join_37: {
    forward_join_31: {
    forward_join_27: {
    forward_join_26: {
    forward_join_16: {
    life4_3 = (com.moon.qK.b ^ 33081387198887L);
    life6_5 = com.moon.jN.c();
    spill1277_0 = p0;
    if (!((life6_5 == 0))) {
        forwardValue1277_26_0 = spill1277_0;
        break forward_join_26;
    }
    if (!((!((org.luaj.vm2.LuaValue)(spill1277_0)).isnil()))) {
        break forward_join_16;
    }
    spill1277_1 = ((org.luaj.vm2.LuaValue)(p0)).isstring();
    if (!((life6_5 == 0))) {
        forwardValue1277_31_0 = ((spill1277_1) ? 1 : 0);
        break forward_join_31;
    }
    if (!((!spill1277_1))) {
        break forward_join_27;
    }
    }
    java.lang.String __stackOp1277_7_0 = ((org.luaj.vm2.LuaValue)(p0)).typename();
    java.lang.String __stackOp1277_7_1 = __sourceIntrinsic_a297060148ac_invokedynamic1277_6(20867, (7750963159581924926L ^ life4_3));
    forwardValue1277_26_0 = org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_a297060148ac_invokedynamic1277_8(__stackOp1277_7_1, __stackOp1277_7_0))));
    }
    return forwardValue1277_26_0;
    }
    spill1277_2 = p1;
    if (!((life6_5 == 0))) {
        forwardValue1277_47_0 = spill1277_2;
        break forward_join_47;
    }
    forwardValue1277_31_0 = ((((org.luaj.vm2.LuaValue)(spill1277_2)).isnil()) ? 1 : 0);
    }
    if (!((forwardValue1277_31_0 == 0))) {
        break forward_join_37;
    }
    spill1277_3 = ((org.luaj.vm2.LuaValue)(p1)).isstring();
    if (!((life6_5 == 0))) {
        forwardValue1277_52_0 = ((spill1277_3) ? 1 : 0);
        break forward_join_52;
    }
    if (!((!spill1277_3))) {
        break forward_join_48;
    }
    }
    java.lang.String __stackOp1277_16_0 = ((org.luaj.vm2.LuaValue)(p1)).typename();
    java.lang.String __stackOp1277_16_1 = __sourceIntrinsic_a297060148ac_invokedynamic1277_15(30264, (2463916793250724230L ^ life4_3));
    forwardValue1277_47_0 = org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_a297060148ac_invokedynamic1277_17(__stackOp1277_16_1, __stackOp1277_16_0))));
    }
    return forwardValue1277_47_0;
    }
    spill1277_4 = p2;
    if (!((life6_5 == 0))) {
        forwardValue1277_65_0 = spill1277_4;
        break forward_join_65;
    }
    forwardValue1277_52_0 = ((((org.luaj.vm2.LuaValue)(spill1277_4)).isnil()) ? 1 : 0);
    }
    if (!((forwardValue1277_52_0 != 0))) {
        break forward_join_64;
    }
    java.lang.String __stackOp1277_23_0 = ((org.luaj.vm2.LuaValue)(p2)).typename();
    java.lang.String __stackOp1277_23_1 = __sourceIntrinsic_a297060148ac_invokedynamic1277_22(5586, (4598055425013275246L ^ life4_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_a297060148ac_invokedynamic1277_24(__stackOp1277_23_1, __stackOp1277_23_0))));
    }
    forwardValue1277_65_0 = p0;
    }
    life7_95 = ((org.luaj.vm2.LuaValue)(forwardValue1277_65_0)).tojstring();
    life8_98 = ((org.luaj.vm2.LuaValue)(p1)).tojstring();
    life9_102 = org.luaj.vm2.lib.jse.CoerceLuaToJava.coerce(((org.luaj.vm2.LuaValue)(p2)), ((java.lang.Class)(java.lang.Object.class)));
    ((com.moon.j2)(((com.moon.jT)(this.a)).c)).set_setting(((java.lang.String)(life7_95)), ((java.lang.String)(life8_98)), ((java.lang.Object)(life9_102)));
    return org.luaj.vm2.LuaValue.NIL;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a297060148ac_invokedynamic1277_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a297060148ac_invokedynamic1277_8(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a297060148ac_invokedynamic1277_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a297060148ac_invokedynamic1277_17(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a297060148ac_invokedynamic1277_22(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a297060148ac_invokedynamic1277_24(java.lang.String a0, java.lang.String a1) throws E;
}
