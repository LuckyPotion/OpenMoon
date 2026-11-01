package com.moon;


class rn extends org.luaj.vm2.lib.VarArgFunction {

com.moon.jU a;

private static long b;

private static java.lang.String[] c;

private static java.lang.String[] d;

private static java.util.Map e;

public org.luaj.vm2.Varargs invoke(org.luaj.vm2.Varargs p0) {
org.luaj.vm2.LuaValue forestValue100068_35_0;
    int forestValue100068_40_0;
    org.luaj.vm2.LuaValue forestValue100068_56_0;
    java.lang.Object forestValue100068_60_0;
    int spill100068_0;
    org.luaj.vm2.LuaValue spill100068_1;
    boolean spill100068_2;
    org.luaj.vm2.LuaTable spill100068_3;
    org.luaj.vm2.LuaTable spill100068_4;
    long life2_3;
    org.luaj.vm2.LuaValue life5_8;
    org.luaj.vm2.LuaTable life6_13;
    int life4_14;
    java.lang.Object[] life7_69;
    forest_join_60: {
    forest_join_57: {
    forest_join_56: {
    forest_join_46: {
    forest_join_40: {
    forest_join_36: {
    forest_join_35: {
    forest_join_25: {
    life2_3 = (com.moon.rn.b ^ 58832569166898L);
    spill100068_0 = com.moon.jN.c();
    life5_8 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(1)));
    life6_13 = ((org.luaj.vm2.LuaValue)(((org.luaj.vm2.Varargs)(p0)).arg(((int)(2))))).checktable();
    life4_14 = spill100068_0;
    spill100068_1 = life5_8;
    if (!((life4_14 == 0))) {
        forestValue100068_35_0 = spill100068_1;
        break forest_join_35;
    }
    if (!((!((org.luaj.vm2.LuaValue)(spill100068_1)).isnil()))) {
        break forest_join_25;
    }
    spill100068_2 = ((org.luaj.vm2.LuaValue)(life5_8)).isnumber();
    if (!((life4_14 == 0))) {
        forestValue100068_40_0 = ((spill100068_2) ? 1 : 0);
        break forest_join_40;
    }
    if (!((!spill100068_2))) {
        break forest_join_36;
    }
    }
    java.lang.String __stackOp100068_10_0 = ((org.luaj.vm2.LuaValue)(life5_8)).typename();
    java.lang.String __stackOp100068_10_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100068_9(11766, (1348663423429221710L ^ life2_3));
    forestValue100068_35_0 = org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100068_11(__stackOp100068_10_1, __stackOp100068_10_0))));
    }
    return forestValue100068_35_0;
    }
    spill100068_3 = life6_13;
    if (!((life4_14 == 0))) {
        forestValue100068_56_0 = spill100068_3;
        break forest_join_56;
    }
    forestValue100068_40_0 = ((((org.luaj.vm2.LuaTable)(spill100068_3)).isnil()) ? 1 : 0);
    }
    if (!((forestValue100068_40_0 == 0))) {
        break forest_join_46;
    }
    spill100068_4 = life6_13;
    if (!((life4_14 == 0))) {
        forestValue100068_60_0 = spill100068_4;
        break forest_join_60;
    }
    if (!((!((org.luaj.vm2.LuaTable)(spill100068_4)).istable()))) {
        break forest_join_57;
    }
    }
    java.lang.String __stackOp100068_18_0 = ((org.luaj.vm2.LuaTable)(life6_13)).typename();
    java.lang.String __stackOp100068_18_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100068_17(1874, (6192716167277295595L ^ life2_3));
    forestValue100068_56_0 = org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100068_19(__stackOp100068_18_1, __stackOp100068_18_0))));
    }
    return forestValue100068_56_0;
    }
    forestValue100068_60_0 = org.luaj.vm2.lib.jse.CoerceLuaToJava.coerce(((org.luaj.vm2.LuaValue)(life6_13)), ((java.lang.Class)(java.lang.Object[].class)));
    }
    life7_69 = ((java.lang.Object[])(forestValue100068_60_0));
    ((com.moon.j3)(((com.moon.jU)(this.a)).c)).send_packet(((int)(((org.luaj.vm2.LuaValue)(life5_8)).toint())), ((java.lang.Object[])(life7_69)));
    return org.luaj.vm2.LuaValue.NIL;
}


rn(com.moon.jU p0) { super(); }

private static void __sourceConstructorBody_5b700e26809eb159(com.moon.rn receiver, com.moon.jU p0) throws Throwable {
((com.moon.rn)(receiver)).a = ((com.moon.jU)(p0));
    com.moon.rn.__sourceConstructorInit_5b700e26809eb159_0(((com.moon.rn)(receiver)));
    return;
}


static {
javax.crypto.Cipher forestValue317_36_0;
    int forestValue317_36_1;
    javax.crypto.SecretKeyFactory forestValue317_36_2;
    byte[] forestValue317_36_3;
    javax.crypto.Cipher forestValue317_53_0;
    int forestValue317_53_1;
    javax.crypto.SecretKeyFactory forestValue317_53_2;
    byte[] forestValue317_53_3;
    javax.crypto.Cipher spill317_0;
    int spill317_1;
    javax.crypto.SecretKeyFactory spill317_2;
    byte[] spill317_3;
    byte[] spill317_4;
    java.lang.String spill317_5;
    int spill317_6;
    java.lang.String spill317_7;
    java.lang.String[] spill317_8;
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
    b = ((long)(((moom._a)(moom._c.a(((long)(8018828985216945008L)), ((long)(-692441095941720103L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(150821953499771L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    life0_16 = (com.moon.rn.b ^ 122293849415971L);
    spill317_0 = (life2_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill317_1 = 2;
    spill317_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp317_9_0 = new byte[8];
    spill317_3 = __stackOp317_9_0;
    (__stackOp317_9_0)[0] = ((byte) ((int) (life0_16 >>> 56)));
    life3_35 = 1;
    forestValue317_36_0 = spill317_0;
    forestValue317_36_1 = spill317_1;
    forestValue317_36_2 = spill317_2;
    forestValue317_36_3 = spill317_3;
    forest_cycle_36: while (true) {
    if (!((life3_35 < 8))) {
        forestValue317_53_0 = forestValue317_36_0;
        forestValue317_53_1 = forestValue317_36_1;
        forestValue317_53_2 = forestValue317_36_2;
        forestValue317_53_3 = forestValue317_36_3;
        break forest_join_53;
    }
    byte[] __stackOp317_10_0 = forestValue317_36_3;
    spill317_4 = __stackOp317_10_0;
    (__stackOp317_10_0)[life3_35] = ((byte) ((int) ((life0_16 << (life3_35 * 8)) >>> 56)));
    life3_35 += 1;
    forestValue317_36_3 = spill317_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue317_53_0)).init(((int)(forestValue317_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue317_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue317_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life9_66 = new java.lang.String[2];
    life7_68 = 0;
    life8_73 = ((java.lang.String)((life6_71 = "\025Ù\001ùù÷ì´Që¹vñ¶¥¼µ,Ò$\007=´²f1þ&P\002\006®`F¯`?aîÙ8hëÕx\030óÌ+0ùÜèBW8q?ýÜ\023Ê\023U*Ê>)\020rß1ÙÅÃ\bÜ½Áu48\025«ÙK\ff\n"))).length();
    life5_75 = 56;
    life4_77 = -1;
    forest_cycle_78: while (true) {
    life4_77 += 1;
    spill317_5 = life6_71;
    int __stackOp317_14_0 = life4_77;
    java.lang.String __stackOp317_16_0 = ((java.lang.String)(spill317_5)).substring(((int)(__stackOp317_14_0)), ((int)((__stackOp317_14_0 + life5_75))));
    int __stackOp317_16_1 = -1;
    spill317_6 = __stackOp317_16_1;
    byte[] __stackOp317_18_0 = ((java.lang.String)(__stackOp317_16_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp317_18_1 = life2_20;
    life10_93 = ((javax.crypto.Cipher)(__stackOp317_18_1)).doFinal(((byte[])(__stackOp317_18_0)));
    int __stackOp317_22_0 = spill317_6;
    java.lang.String __stackOp317_22_1 = ((java.lang.String)(com.moon.rn.a(((byte[])(life10_93))))).intern();
    spill317_7 = __stackOp317_22_1;
    recovery.source.CarrierOps.discard(__stackOp317_22_0);
    java.lang.String __stackOp317_24_0 = spill317_7;
    java.lang.String[] __stackOp317_24_1 = life9_66;
    spill317_8 = __stackOp317_24_1;
    java.lang.String __stackOp317_25_0 = __stackOp317_24_0;
    int __stackOp317_25_1 = (life7_68++);
    (spill317_8)[__stackOp317_25_1] = __stackOp317_25_0;
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

private static native <E extends Throwable> void __sourceConstructorInit_5b700e26809eb159_0(com.moon.rn a0) throws E;
private static native <E extends Throwable> java.lang.String __sourceHandlerCall_eb808aaf12a04d9d7f25(int a0, long a1) throws E;
private static final class __SourceHandler_eb808aaf12a04d9d7f25 {

public static java.lang.String f209(int p0, long p1) throws Throwable {
    int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 25571);
    if (((__fieldRead209_0())[life5_8] == null)) {
        life3_16 = __call209_3(__call209_2(__call209_1()));
        life4_21 = __cast209_6(__call209_5(__fieldRead209_4(), life3_16));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = __call209_7("DES/CBC/PKCS5Padding");
        (life4_21)[1] = __call209_8("DES");
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        __call209_10(__fieldRead209_9(), life3_16, life4_21);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_63: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = __call209_12(__cast209_11((life4_21)[1]), life7_92);
        __call209_15(__cast209_13((life4_21)[0]), 2, life8_99, __cast209_14((life4_21)[2]));
        life9_116 = __call209_17((__fieldRead209_16())[life5_8], "ISO-8859-1");
        (__fieldRead209_18())[life5_8] = __call209_21(__call209_20(__cast209_19((life4_21)[0]), life9_116));
    }
    return (__fieldRead209_22())[life5_8];
}
public static java.lang.String h209_0(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    throw new java.lang.RuntimeException("com/moon/rn", local1);
}
private static native java.lang.String[] __fieldRead209_0() throws Throwable;
private static native java.lang.Thread __call209_1() throws Throwable;
private static native long __call209_2(java.lang.Thread a0) throws Throwable;
private static native java.lang.Long __call209_3(long a0) throws Throwable;
private static native java.util.Map __fieldRead209_4() throws Throwable;
private static native java.lang.Object __call209_5(java.util.Map a0, java.lang.Long a1) throws Throwable;
private static native java.lang.Object[] __cast209_6(java.lang.Object a0) throws Throwable;
private static native javax.crypto.Cipher __call209_7(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call209_8(java.lang.String a0) throws Throwable;
private static native java.util.Map __fieldRead209_9() throws Throwable;
private static native java.lang.Object __call209_10(java.util.Map a0, java.lang.Long a1, java.lang.Object[] a2) throws Throwable;
private static native javax.crypto.SecretKeyFactory __cast209_11(java.lang.Object a0) throws Throwable;
private static native javax.crypto.SecretKey __call209_12(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native javax.crypto.Cipher __cast209_13(java.lang.Object a0) throws Throwable;
private static native javax.crypto.spec.IvParameterSpec __cast209_14(java.lang.Object a0) throws Throwable;
private static native void __call209_15(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native java.lang.String[] __fieldRead209_16() throws Throwable;
private static native byte[] __call209_17(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String[] __fieldRead209_18() throws Throwable;
private static native javax.crypto.Cipher __cast209_19(java.lang.Object a0) throws Throwable;
private static native byte[] __call209_20(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native java.lang.String __call209_21(byte[] a0) throws Throwable;
private static native java.lang.String[] __fieldRead209_22() throws Throwable;

}

private static native <E extends Throwable> java.lang.invoke.CallSite __sourceHandlerCall_64703665990822837c6f(java.lang.invoke.MethodHandles.Lookup a0, java.lang.String a1, java.lang.invoke.MethodType a2) throws E;
private static final class __SourceHandler_64703665990822837c6f {

public static java.lang.invoke.CallSite f210(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.invoke.MutableCallSite life3_4;
    life3_4 = new java.lang.invoke.MutableCallSite(p2);
    java.lang.invoke.MutableCallSite spill210_0 = life3_4;
    java.lang.invoke.MethodHandle spill210_1 = __call210_3(__methodHandleLiteral210_0(), __classLiteral210_1(), __call210_2(p2));
    int spill210_2 = 0;
    java.lang.Object[] __stackOp210_4_0 = new java.lang.Object[3];
    java.lang.Object[] spill210_3 = __stackOp210_4_0;
    (__stackOp210_4_0)[0] = p0;
    java.lang.Object[] __stackOp210_5_0 = spill210_3;
    java.lang.Object[] spill210_4 = __stackOp210_5_0;
    (__stackOp210_5_0)[1] = life3_4;
    java.lang.Object[] __stackOp210_6_0 = spill210_4;
    java.lang.Object[] spill210_5 = __stackOp210_6_0;
    (__stackOp210_6_0)[2] = p1;
    __call210_9(spill210_0, __call210_8(__call210_7(spill210_1, spill210_2, spill210_5), p2));
    return life3_4;
}
public static java.lang.invoke.CallSite h210_0(java.lang.Exception p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.Exception local3 = p0;
    throw new java.lang.RuntimeException(__call2021000_6(__call2021000_5(__call2021000_3(__call2021000_2(__call2021000_1(__call2021000_0(new java.lang.StringBuilder(), "com/moon/rn"), " : "), p1), " : "), __call2021000_4(p2))), local3);
}
private static native java.lang.invoke.MethodHandle __methodHandleLiteral210_0() throws Throwable;
private static native java.lang.Object __classLiteral210_1() throws Throwable;
private static native int __call210_2(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.invoke.MethodHandle __call210_3(java.lang.invoke.MethodHandle a0, java.lang.Object a1, int a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call210_7(java.lang.invoke.MethodHandle a0, int a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call210_8(java.lang.invoke.MethodHandle a0, java.lang.invoke.MethodType a1) throws Throwable;
private static native void __call210_9(java.lang.invoke.MutableCallSite a0, java.lang.invoke.MethodHandle a1) throws Throwable;
private static native java.lang.StringBuilder __call2021000_0(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2021000_1(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2021000_2(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2021000_3(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2021000_4(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.StringBuilder __call2021000_5(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2021000_6(java.lang.StringBuilder a0) throws Throwable;

}


private static java.lang.String a(int p0, long p1) { return __sourceHandlerCall_eb808aaf12a04d9d7f25(p0, p1); }


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.rn.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) { return __sourceHandlerCall_64703665990822837c6f(p0, p1, p2); }


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
        byte[] spill1382_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1382_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1382_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1382_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1382_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1382_2)[life4_9];
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


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100068_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100068_11(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100068_17(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100068_19(java.lang.String a0, java.lang.String a1) throws E;
}
