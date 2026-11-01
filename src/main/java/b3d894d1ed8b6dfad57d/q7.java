package com.moon;


class q7 extends org.luaj.vm2.lib.VarArgFunction {

com.moon.jO a;

private static long b;

private static java.lang.String[] c;

private static java.lang.String[] d;

private static java.util.Map e;

public org.luaj.vm2.Varargs invoke(org.luaj.vm2.Varargs p0) {
java.lang.Object forestValue100046_29_0;
    java.lang.Object forestValue100046_36_0;
    org.luaj.vm2.LuaValue forestValue100046_75_0;
    java.lang.Object forestValue100046_79_0;
    int spill100046_0;
    org.luaj.vm2.LuaValue spill100046_1;
    java.lang.Object spill100046_2;
    org.luaj.vm2.LuaValue spill100046_3;
    org.luaj.vm2.LuaValue spill100046_4;
    long life2_3;
    org.luaj.vm2.LuaValue life5_8;
    int life4_9;
    java.lang.Object life6_30;
    com.moon.scripting.api.enums.TemplateType life7_40;
    org.luaj.vm2.LuaValue life8_57;
    com.moon.scripting.api.types.templates.RenderTemplate[] life9_87;
    forest_join_79: {
    forest_join_76: {
    forest_join_75: {
    forest_join_65: {
    forest_join_51: {
    forest_join_40: {
    forest_join_36: {
    forest_join_29: {
    forest_join_26: {
    life2_3 = (com.moon.q7.b ^ 105796945163111L);
    spill100046_0 = com.moon.jN.b();
    life5_8 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(1)));
    life4_9 = spill100046_0;
    spill100046_1 = life5_8;
    if (!((life4_9 != 0))) {
        forestValue100046_29_0 = spill100046_1;
        break forest_join_29;
    }
    if (!(((org.luaj.vm2.LuaValue)(spill100046_1)).isnil())) {
        break forest_join_26;
    }
    java.lang.String __stackOp100046_6_0 = ((org.luaj.vm2.LuaValue)(life5_8)).typename();
    java.lang.String __stackOp100046_6_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100046_5(29930, (2575379048654622034L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100046_7(__stackOp100046_6_1, __stackOp100046_6_0))));
    }
    forestValue100046_29_0 = org.luaj.vm2.lib.jse.CoerceLuaToJava.coerce(((org.luaj.vm2.LuaValue)(life5_8)), ((java.lang.Class)(java.lang.Object.class)));
    }
    life6_30 = forestValue100046_29_0;
    spill100046_2 = life6_30;
    if (!((life4_9 != 0))) {
        forestValue100046_36_0 = spill100046_2;
        break forest_join_36;
    }
    if (!((((spill100046_2 instanceof com.moon.scripting.api.enums.TemplateType) ? 1 : 0) != 0))) {
        break forest_join_40;
    }
    forestValue100046_36_0 = life6_30;
    }
    life7_40 = ((com.moon.scripting.api.enums.TemplateType)(forestValue100046_36_0));
    if (!((life4_9 == 0))) {
        break forest_join_51;
    }
    }
    java.lang.String __stackOp100046_15_0 = ((org.luaj.vm2.LuaValue)(life5_8)).typename();
    java.lang.String __stackOp100046_15_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100046_14(12935, (701699339619207998L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100046_16(__stackOp100046_15_1, __stackOp100046_15_0))));
    }
    life8_57 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(2)));
    spill100046_3 = life8_57;
    if (!((life4_9 != 0))) {
        forestValue100046_75_0 = spill100046_3;
        break forest_join_75;
    }
    if (!((!((org.luaj.vm2.LuaValue)(spill100046_3)).isnil()))) {
        break forest_join_65;
    }
    spill100046_4 = life8_57;
    if (!((life4_9 != 0))) {
        forestValue100046_79_0 = spill100046_4;
        break forest_join_79;
    }
    if (!((!((org.luaj.vm2.LuaValue)(spill100046_4)).istable()))) {
        break forest_join_76;
    }
    }
    java.lang.String __stackOp100046_23_0 = ((org.luaj.vm2.LuaValue)(life8_57)).typename();
    java.lang.String __stackOp100046_23_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100046_22(16250, (88699517112616641L ^ life2_3));
    forestValue100046_75_0 = org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100046_24(__stackOp100046_23_1, __stackOp100046_23_0))));
    }
    return forestValue100046_75_0;
    }
    forestValue100046_79_0 = org.luaj.vm2.lib.jse.CoerceLuaToJava.coerce(((org.luaj.vm2.LuaValue)(life8_57)), ((java.lang.Class)(com.moon.scripting.api.types.templates.RenderTemplate[].class)));
    }
    life9_87 = ((com.moon.scripting.api.types.templates.RenderTemplate[])(forestValue100046_79_0));
    ((com.moon.jX)(((com.moon.jO)(this.a)).c)).render_batch(((com.moon.scripting.api.enums.TemplateType)(life7_40)), ((com.moon.scripting.api.types.templates.RenderTemplate[])(life9_87)));
    return com.moon.q7.NIL;
}


q7(com.moon.jO p0) { super(); }

private static void __sourceConstructorBody_bc9620b6f14fd675(com.moon.q7 receiver, com.moon.jO p0) throws Throwable {
((com.moon.q7)(receiver)).a = ((com.moon.jO)(p0));
    com.moon.q7.__sourceConstructorInit_bc9620b6f14fd675_0(((com.moon.q7)(receiver)));
    return;
}


static {
javax.crypto.Cipher forestValue145_36_0;
    int forestValue145_36_1;
    javax.crypto.SecretKeyFactory forestValue145_36_2;
    byte[] forestValue145_36_3;
    javax.crypto.Cipher forestValue145_53_0;
    int forestValue145_53_1;
    javax.crypto.SecretKeyFactory forestValue145_53_2;
    byte[] forestValue145_53_3;
    javax.crypto.Cipher spill145_0;
    int spill145_1;
    javax.crypto.SecretKeyFactory spill145_2;
    byte[] spill145_3;
    byte[] spill145_4;
    java.lang.String spill145_5;
    int spill145_6;
    java.lang.String spill145_7;
    java.lang.String[] spill145_8;
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
    b = ((long)(((moom._a)(moom._c.a(((long)(6481033711270383347L)), ((long)(-2855243668377918683L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(161739611408286L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    life0_16 = (com.moon.q7.b ^ 116654436839749L);
    spill145_0 = (life2_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill145_1 = 2;
    spill145_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp145_9_0 = new byte[8];
    spill145_3 = __stackOp145_9_0;
    (__stackOp145_9_0)[0] = ((byte) ((int) (life0_16 >>> 56)));
    life3_35 = 1;
    forestValue145_36_0 = spill145_0;
    forestValue145_36_1 = spill145_1;
    forestValue145_36_2 = spill145_2;
    forestValue145_36_3 = spill145_3;
    forest_cycle_36: while (true) {
    if (!((life3_35 < 8))) {
        forestValue145_53_0 = forestValue145_36_0;
        forestValue145_53_1 = forestValue145_36_1;
        forestValue145_53_2 = forestValue145_36_2;
        forestValue145_53_3 = forestValue145_36_3;
        break forest_join_53;
    }
    byte[] __stackOp145_10_0 = forestValue145_36_3;
    spill145_4 = __stackOp145_10_0;
    (__stackOp145_10_0)[life3_35] = ((byte) ((int) ((life0_16 << (life3_35 * 8)) >>> 56)));
    life3_35 += 1;
    forestValue145_36_3 = spill145_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue145_53_0)).init(((int)(forestValue145_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue145_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue145_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life9_66 = new java.lang.String[3];
    life7_68 = 0;
    life8_73 = ((java.lang.String)((life6_71 = "¿Ç\n«¯jkÑñú»î~\000-ò\032£DÄpÝY\037»ÄÛ$ºí¸/C\022 z\037É»nñä\035Ã\036Dc\030ûì\013\003¥Ò,E¬@ï\034bÆà³¤°oayñ!\032\000¨¡Úbß<Ê,ñ²Ø\024¡Í!/q\r¼²l]ÿ«®9\0160\r\022ÛÈ).{E¥8Ìb÷ý\005\007]·FÐ\035³mª$Ë'\036Zõ`=9ÄÖ-­\0321\017\033hj}.\024»\027Ê¢] \005 àYVBth"))).length();
    life5_75 = 64;
    life4_77 = -1;
    forest_cycle_78: while (true) {
    life4_77 += 1;
    spill145_5 = life6_71;
    int __stackOp145_14_0 = life4_77;
    java.lang.String __stackOp145_16_0 = ((java.lang.String)(spill145_5)).substring(((int)(__stackOp145_14_0)), ((int)((__stackOp145_14_0 + life5_75))));
    int __stackOp145_16_1 = -1;
    spill145_6 = __stackOp145_16_1;
    byte[] __stackOp145_18_0 = ((java.lang.String)(__stackOp145_16_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp145_18_1 = life2_20;
    life10_93 = ((javax.crypto.Cipher)(__stackOp145_18_1)).doFinal(((byte[])(__stackOp145_18_0)));
    int __stackOp145_22_0 = spill145_6;
    java.lang.String __stackOp145_22_1 = ((java.lang.String)(com.moon.q7.a(((byte[])(life10_93))))).intern();
    spill145_7 = __stackOp145_22_1;
    recovery.source.CarrierOps.discard(__stackOp145_22_0);
    java.lang.String __stackOp145_24_0 = spill145_7;
    java.lang.String[] __stackOp145_24_1 = life9_66;
    spill145_8 = __stackOp145_24_1;
    java.lang.String __stackOp145_25_0 = __stackOp145_24_0;
    int __stackOp145_25_1 = (life7_68++);
    (spill145_8)[__stackOp145_25_1] = __stackOp145_25_0;
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

private static native <E extends Throwable> void __sourceConstructorInit_bc9620b6f14fd675_0(com.moon.q7 a0) throws E;
private static native <E extends Throwable> java.lang.String __sourceHandlerCall_1a6df1b3663523537b4f(int a0, long a1) throws E;
private static final class __SourceHandler_1a6df1b3663523537b4f {

public static java.lang.String f138(int p0, long p1) throws Throwable {
    int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 16568);
    if (((__fieldRead138_0())[life5_8] == null)) {
        life3_16 = __call138_3(__call138_2(__call138_1()));
        life4_21 = __cast138_6(__call138_5(__fieldRead138_4(), life3_16));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = __call138_7("DES/CBC/PKCS5Padding");
        (life4_21)[1] = __call138_8("DES");
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        __call138_10(__fieldRead138_9(), life3_16, life4_21);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_63: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = __call138_12(__cast138_11((life4_21)[1]), life7_92);
        __call138_15(__cast138_13((life4_21)[0]), 2, life8_99, __cast138_14((life4_21)[2]));
        life9_116 = __call138_17((__fieldRead138_16())[life5_8], "ISO-8859-1");
        (__fieldRead138_18())[life5_8] = __call138_21(__call138_20(__cast138_19((life4_21)[0]), life9_116));
    }
    return (__fieldRead138_22())[life5_8];
}
public static java.lang.String h138_0(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    throw new java.lang.RuntimeException("com/moon/q7", local1);
}
private static native java.lang.String[] __fieldRead138_0() throws Throwable;
private static native java.lang.Thread __call138_1() throws Throwable;
private static native long __call138_2(java.lang.Thread a0) throws Throwable;
private static native java.lang.Long __call138_3(long a0) throws Throwable;
private static native java.util.Map __fieldRead138_4() throws Throwable;
private static native java.lang.Object __call138_5(java.util.Map a0, java.lang.Long a1) throws Throwable;
private static native java.lang.Object[] __cast138_6(java.lang.Object a0) throws Throwable;
private static native javax.crypto.Cipher __call138_7(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call138_8(java.lang.String a0) throws Throwable;
private static native java.util.Map __fieldRead138_9() throws Throwable;
private static native java.lang.Object __call138_10(java.util.Map a0, java.lang.Long a1, java.lang.Object[] a2) throws Throwable;
private static native javax.crypto.SecretKeyFactory __cast138_11(java.lang.Object a0) throws Throwable;
private static native javax.crypto.SecretKey __call138_12(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native javax.crypto.Cipher __cast138_13(java.lang.Object a0) throws Throwable;
private static native javax.crypto.spec.IvParameterSpec __cast138_14(java.lang.Object a0) throws Throwable;
private static native void __call138_15(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native java.lang.String[] __fieldRead138_16() throws Throwable;
private static native byte[] __call138_17(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String[] __fieldRead138_18() throws Throwable;
private static native javax.crypto.Cipher __cast138_19(java.lang.Object a0) throws Throwable;
private static native byte[] __call138_20(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native java.lang.String __call138_21(byte[] a0) throws Throwable;
private static native java.lang.String[] __fieldRead138_22() throws Throwable;

}

private static native <E extends Throwable> java.lang.invoke.CallSite __sourceHandlerCall_09c1fd354f809ec36702(java.lang.invoke.MethodHandles.Lookup a0, java.lang.String a1, java.lang.invoke.MethodType a2) throws E;
private static final class __SourceHandler_09c1fd354f809ec36702 {

public static java.lang.invoke.CallSite f139(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.invoke.MutableCallSite life3_4;
    life3_4 = new java.lang.invoke.MutableCallSite(p2);
    java.lang.invoke.MutableCallSite spill139_0 = life3_4;
    java.lang.invoke.MethodHandle spill139_1 = __call139_3(__methodHandleLiteral139_0(), __classLiteral139_1(), __call139_2(p2));
    int spill139_2 = 0;
    java.lang.Object[] __stackOp139_4_0 = new java.lang.Object[3];
    java.lang.Object[] spill139_3 = __stackOp139_4_0;
    (__stackOp139_4_0)[0] = p0;
    java.lang.Object[] __stackOp139_5_0 = spill139_3;
    java.lang.Object[] spill139_4 = __stackOp139_5_0;
    (__stackOp139_5_0)[1] = life3_4;
    java.lang.Object[] __stackOp139_6_0 = spill139_4;
    java.lang.Object[] spill139_5 = __stackOp139_6_0;
    (__stackOp139_6_0)[2] = p1;
    __call139_9(spill139_0, __call139_8(__call139_7(spill139_1, spill139_2, spill139_5), p2));
    return life3_4;
}
public static java.lang.invoke.CallSite h139_0(java.lang.Exception p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.Exception local3 = p0;
    throw new java.lang.RuntimeException(__call2013900_6(__call2013900_5(__call2013900_3(__call2013900_2(__call2013900_1(__call2013900_0(new java.lang.StringBuilder(), "com/moon/q7"), " : "), p1), " : "), __call2013900_4(p2))), local3);
}
private static native java.lang.invoke.MethodHandle __methodHandleLiteral139_0() throws Throwable;
private static native java.lang.Object __classLiteral139_1() throws Throwable;
private static native int __call139_2(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.invoke.MethodHandle __call139_3(java.lang.invoke.MethodHandle a0, java.lang.Object a1, int a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call139_7(java.lang.invoke.MethodHandle a0, int a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call139_8(java.lang.invoke.MethodHandle a0, java.lang.invoke.MethodType a1) throws Throwable;
private static native void __call139_9(java.lang.invoke.MutableCallSite a0, java.lang.invoke.MethodHandle a1) throws Throwable;
private static native java.lang.StringBuilder __call2013900_0(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2013900_1(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2013900_2(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2013900_3(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2013900_4(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.StringBuilder __call2013900_5(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2013900_6(java.lang.StringBuilder a0) throws Throwable;

}


private static java.lang.String a(int p0, long p1) { return __sourceHandlerCall_1a6df1b3663523537b4f(p0, p1); }


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.q7.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) { return __sourceHandlerCall_09c1fd354f809ec36702(p0, p1, p2); }


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
        byte[] spill1250_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1250_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1250_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1250_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1250_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1250_2)[life4_9];
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


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100046_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100046_7(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100046_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100046_16(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100046_22(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100046_24(java.lang.String a0, java.lang.String a1) throws E;
}
