package com.moon;


class qT extends org.luaj.vm2.lib.TwoArgFunction {

com.moon.jV a;

private static long b;

private static java.lang.String[] c;

private static java.lang.String[] d;

private static java.util.Map e;

qT(com.moon.jV p0) { super(); }

private static void __sourceConstructorBody_5b66291e35634239(com.moon.qT receiver, com.moon.jV p0) throws Throwable {
((com.moon.qT)(receiver)).a = ((com.moon.jV)(p0));
    com.moon.qT.__sourceConstructorInit_5b66291e35634239_0(((com.moon.qT)(receiver)));
    return;
}


static {
javax.crypto.Cipher forestValue189_36_0;
    int forestValue189_36_1;
    javax.crypto.SecretKeyFactory forestValue189_36_2;
    byte[] forestValue189_36_3;
    javax.crypto.Cipher forestValue189_53_0;
    int forestValue189_53_1;
    javax.crypto.SecretKeyFactory forestValue189_53_2;
    byte[] forestValue189_53_3;
    javax.crypto.Cipher spill189_0;
    int spill189_1;
    javax.crypto.SecretKeyFactory spill189_2;
    byte[] spill189_3;
    byte[] spill189_4;
    java.lang.String spill189_5;
    int spill189_6;
    java.lang.String spill189_7;
    java.lang.String[] spill189_8;
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
    b = ((long)(((moom._a)(moom._c.a(((long)(4005041650341338066L)), ((long)(-7410697843801431324L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(143666726611995L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    life0_16 = (com.moon.qT.b ^ 80899503721346L);
    spill189_0 = (life2_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill189_1 = 2;
    spill189_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp189_9_0 = new byte[8];
    spill189_3 = __stackOp189_9_0;
    (__stackOp189_9_0)[0] = ((byte) ((int) (life0_16 >>> 56)));
    life3_35 = 1;
    forestValue189_36_0 = spill189_0;
    forestValue189_36_1 = spill189_1;
    forestValue189_36_2 = spill189_2;
    forestValue189_36_3 = spill189_3;
    forest_cycle_36: while (true) {
    if (!((life3_35 < 8))) {
        forestValue189_53_0 = forestValue189_36_0;
        forestValue189_53_1 = forestValue189_36_1;
        forestValue189_53_2 = forestValue189_36_2;
        forestValue189_53_3 = forestValue189_36_3;
        break forest_join_53;
    }
    byte[] __stackOp189_10_0 = forestValue189_36_3;
    spill189_4 = __stackOp189_10_0;
    (__stackOp189_10_0)[life3_35] = ((byte) ((int) ((life0_16 << (life3_35 * 8)) >>> 56)));
    life3_35 += 1;
    forestValue189_36_3 = spill189_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue189_53_0)).init(((int)(forestValue189_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue189_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue189_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life9_66 = new java.lang.String[2];
    life7_68 = 0;
    life8_73 = ((java.lang.String)((life6_71 = " /%\037B%\003¥òÜX±\036%ìÇ°ÄíÌ=¶ñõ_\030ÊH/\031R±3ê(NHonóÐ%0°ÆZ¨ÇÜé\000\036Q6P¥NÈ'm'Iç\017=_P\\lªb¯ÌÅ±-ÓÁÊÀ=ßvB1y"))).length();
    life5_75 = 48;
    life4_77 = -1;
    forest_cycle_78: while (true) {
    life4_77 += 1;
    spill189_5 = life6_71;
    int __stackOp189_14_0 = life4_77;
    java.lang.String __stackOp189_16_0 = ((java.lang.String)(spill189_5)).substring(((int)(__stackOp189_14_0)), ((int)((__stackOp189_14_0 + life5_75))));
    int __stackOp189_16_1 = -1;
    spill189_6 = __stackOp189_16_1;
    byte[] __stackOp189_18_0 = ((java.lang.String)(__stackOp189_16_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp189_18_1 = life2_20;
    life10_93 = ((javax.crypto.Cipher)(__stackOp189_18_1)).doFinal(((byte[])(__stackOp189_18_0)));
    int __stackOp189_22_0 = spill189_6;
    java.lang.String __stackOp189_22_1 = ((java.lang.String)(com.moon.qT.a(((byte[])(life10_93))))).intern();
    spill189_7 = __stackOp189_22_1;
    recovery.source.CarrierOps.discard(__stackOp189_22_0);
    java.lang.String __stackOp189_24_0 = spill189_7;
    java.lang.String[] __stackOp189_24_1 = life9_66;
    spill189_8 = __stackOp189_24_1;
    java.lang.String __stackOp189_25_0 = __stackOp189_24_0;
    int __stackOp189_25_1 = (life7_68++);
    (spill189_8)[__stackOp189_25_1] = __stackOp189_25_0;
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

private static native <E extends Throwable> void __sourceConstructorInit_5b66291e35634239_0(com.moon.qT a0) throws E;
private static native <E extends Throwable> java.lang.String __sourceHandlerCall_ea316ca9e4b3d4985e94(int a0, long a1) throws E;
private static final class __SourceHandler_ea316ca9e4b3d4985e94 {

public static java.lang.String f167(int p0, long p1) throws Throwable {
    int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 32518);
    if (((__fieldRead167_0())[life5_8] == null)) {
        life3_16 = __call167_3(__call167_2(__call167_1()));
        life4_21 = __cast167_6(__call167_5(__fieldRead167_4(), life3_16));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = __call167_7("DES/CBC/PKCS5Padding");
        (life4_21)[1] = __call167_8("DES");
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        __call167_10(__fieldRead167_9(), life3_16, life4_21);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_63: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = __call167_12(__cast167_11((life4_21)[1]), life7_92);
        __call167_15(__cast167_13((life4_21)[0]), 2, life8_99, __cast167_14((life4_21)[2]));
        life9_116 = __call167_17((__fieldRead167_16())[life5_8], "ISO-8859-1");
        (__fieldRead167_18())[life5_8] = __call167_21(__call167_20(__cast167_19((life4_21)[0]), life9_116));
    }
    return (__fieldRead167_22())[life5_8];
}
public static java.lang.String h167_0(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    throw new java.lang.RuntimeException("com/moon/qT", local1);
}
private static native java.lang.String[] __fieldRead167_0() throws Throwable;
private static native java.lang.Thread __call167_1() throws Throwable;
private static native long __call167_2(java.lang.Thread a0) throws Throwable;
private static native java.lang.Long __call167_3(long a0) throws Throwable;
private static native java.util.Map __fieldRead167_4() throws Throwable;
private static native java.lang.Object __call167_5(java.util.Map a0, java.lang.Long a1) throws Throwable;
private static native java.lang.Object[] __cast167_6(java.lang.Object a0) throws Throwable;
private static native javax.crypto.Cipher __call167_7(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call167_8(java.lang.String a0) throws Throwable;
private static native java.util.Map __fieldRead167_9() throws Throwable;
private static native java.lang.Object __call167_10(java.util.Map a0, java.lang.Long a1, java.lang.Object[] a2) throws Throwable;
private static native javax.crypto.SecretKeyFactory __cast167_11(java.lang.Object a0) throws Throwable;
private static native javax.crypto.SecretKey __call167_12(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native javax.crypto.Cipher __cast167_13(java.lang.Object a0) throws Throwable;
private static native javax.crypto.spec.IvParameterSpec __cast167_14(java.lang.Object a0) throws Throwable;
private static native void __call167_15(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native java.lang.String[] __fieldRead167_16() throws Throwable;
private static native byte[] __call167_17(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String[] __fieldRead167_18() throws Throwable;
private static native javax.crypto.Cipher __cast167_19(java.lang.Object a0) throws Throwable;
private static native byte[] __call167_20(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native java.lang.String __call167_21(byte[] a0) throws Throwable;
private static native java.lang.String[] __fieldRead167_22() throws Throwable;

}

private static native <E extends Throwable> java.lang.invoke.CallSite __sourceHandlerCall_1477e520b2f95aa3a168(java.lang.invoke.MethodHandles.Lookup a0, java.lang.String a1, java.lang.invoke.MethodType a2) throws E;
private static final class __SourceHandler_1477e520b2f95aa3a168 {

public static java.lang.invoke.CallSite f168(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.invoke.MutableCallSite life3_4;
    life3_4 = new java.lang.invoke.MutableCallSite(p2);
    java.lang.invoke.MutableCallSite spill168_0 = life3_4;
    java.lang.invoke.MethodHandle spill168_1 = __call168_3(__methodHandleLiteral168_0(), __classLiteral168_1(), __call168_2(p2));
    int spill168_2 = 0;
    java.lang.Object[] __stackOp168_4_0 = new java.lang.Object[3];
    java.lang.Object[] spill168_3 = __stackOp168_4_0;
    (__stackOp168_4_0)[0] = p0;
    java.lang.Object[] __stackOp168_5_0 = spill168_3;
    java.lang.Object[] spill168_4 = __stackOp168_5_0;
    (__stackOp168_5_0)[1] = life3_4;
    java.lang.Object[] __stackOp168_6_0 = spill168_4;
    java.lang.Object[] spill168_5 = __stackOp168_6_0;
    (__stackOp168_6_0)[2] = p1;
    __call168_9(spill168_0, __call168_8(__call168_7(spill168_1, spill168_2, spill168_5), p2));
    return life3_4;
}
public static java.lang.invoke.CallSite h168_0(java.lang.Exception p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.Exception local3 = p0;
    throw new java.lang.RuntimeException(__call2016800_6(__call2016800_5(__call2016800_3(__call2016800_2(__call2016800_1(__call2016800_0(new java.lang.StringBuilder(), "com/moon/qT"), " : "), p1), " : "), __call2016800_4(p2))), local3);
}
private static native java.lang.invoke.MethodHandle __methodHandleLiteral168_0() throws Throwable;
private static native java.lang.Object __classLiteral168_1() throws Throwable;
private static native int __call168_2(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.invoke.MethodHandle __call168_3(java.lang.invoke.MethodHandle a0, java.lang.Object a1, int a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call168_7(java.lang.invoke.MethodHandle a0, int a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call168_8(java.lang.invoke.MethodHandle a0, java.lang.invoke.MethodType a1) throws Throwable;
private static native void __call168_9(java.lang.invoke.MutableCallSite a0, java.lang.invoke.MethodHandle a1) throws Throwable;
private static native java.lang.StringBuilder __call2016800_0(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2016800_1(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2016800_2(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2016800_3(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2016800_4(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.StringBuilder __call2016800_5(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2016800_6(java.lang.StringBuilder a0) throws Throwable;

}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) { return __sourceHandlerCall_1477e520b2f95aa3a168(p0, p1, p2); }


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.qT.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.String a(int p0, long p1) { return __sourceHandlerCall_ea316ca9e4b3d4985e94(p0, p1); }


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
        byte[] spill1294_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1294_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1294_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1294_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1294_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1294_2)[life4_9];
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
int forwardValue1295_26_0;
    org.luaj.vm2.LuaValue forwardValue1295_47_0;
    boolean spill1295_0;
    org.luaj.vm2.LuaValue spill1295_1;
    long life3_3;
    int life5_5;
    forward_join_47: {
    forward_join_38: {
    forward_join_26: {
    forward_join_22: {
    life3_3 = (com.moon.qT.b ^ 126740230372810L);
    life5_5 = com.moon.jN.b();
    spill1295_0 = ((org.luaj.vm2.LuaValue)(p0)).isnumber();
    if (!((life5_5 != 0))) {
        forwardValue1295_26_0 = ((spill1295_0) ? 1 : 0);
        break forward_join_26;
    }
    if (!((!spill1295_0))) {
        break forward_join_22;
    }
    java.lang.String __stackOp1295_6_0 = ((org.luaj.vm2.LuaValue)(p0)).typename();
    java.lang.String __stackOp1295_6_1 = __sourceIntrinsic_fc861287a8ca_invokedynamic1295_5(25625, (5357951689665015342L ^ life3_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_fc861287a8ca_invokedynamic1295_7(__stackOp1295_6_1, __stackOp1295_6_0))));
    }
    spill1295_1 = p1;
    if (!((life5_5 != 0))) {
        forwardValue1295_47_0 = spill1295_1;
        break forward_join_47;
    }
    forwardValue1295_26_0 = ((((org.luaj.vm2.LuaValue)(spill1295_1)).isnumber()) ? 1 : 0);
    }
    if (!((forwardValue1295_26_0 == 0))) {
        break forward_join_38;
    }
    java.lang.String __stackOp1295_13_0 = ((org.luaj.vm2.LuaValue)(p1)).typename();
    java.lang.String __stackOp1295_13_1 = __sourceIntrinsic_fc861287a8ca_invokedynamic1295_12(20205, (8046493716056130779L ^ life3_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_fc861287a8ca_invokedynamic1295_14(__stackOp1295_13_1, __stackOp1295_13_0))));
    }
    ((com.moon.j4)(((com.moon.jV)(this.a)).c)).blend_func(((int)(((org.luaj.vm2.LuaValue)(p0)).toint())), ((int)(((org.luaj.vm2.LuaValue)(p1)).toint())));
    forwardValue1295_47_0 = com.moon.qT.NIL;
    }
    return forwardValue1295_47_0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fc861287a8ca_invokedynamic1295_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fc861287a8ca_invokedynamic1295_7(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fc861287a8ca_invokedynamic1295_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fc861287a8ca_invokedynamic1295_14(java.lang.String a0, java.lang.String a1) throws E;
}
