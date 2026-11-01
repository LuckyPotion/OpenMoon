package com.moon;


class rl extends org.luaj.vm2.lib.VarArgFunction {

com.moon.jT a;

private static long b;

private static java.lang.String[] c;

private static java.lang.String[] d;

private static java.util.Map e;

public org.luaj.vm2.Varargs invoke(org.luaj.vm2.Varargs p0) {
org.luaj.vm2.LuaValue forestValue100066_42_0;
    int forestValue100066_47_0;
    org.luaj.vm2.LuaValue forestValue100066_63_0;
    int forestValue100066_68_0;
    org.luaj.vm2.LuaValue forestValue100066_84_0;
    int forestValue100066_89_0;
    org.luaj.vm2.LuaValue forestValue100066_105_0;
    org.luaj.vm2.LuaValue forestValue100066_119_0;
    int spill100066_0;
    org.luaj.vm2.LuaValue spill100066_1;
    boolean spill100066_2;
    org.luaj.vm2.LuaValue spill100066_3;
    boolean spill100066_4;
    org.luaj.vm2.LuaValue spill100066_5;
    boolean spill100066_6;
    org.luaj.vm2.LuaValue spill100066_7;
    org.luaj.vm2.LuaValue spill100066_8;
    long life2_3;
    org.luaj.vm2.LuaValue life5_8;
    org.luaj.vm2.LuaValue life6_12;
    int life4_13;
    org.luaj.vm2.LuaValue life7_17;
    org.luaj.vm2.LuaValue life8_21;
    forest_join_119: {
    forest_join_106: {
    forest_join_105: {
    forest_join_95: {
    forest_join_89: {
    forest_join_85: {
    forest_join_84: {
    forest_join_74: {
    forest_join_68: {
    forest_join_64: {
    forest_join_63: {
    forest_join_53: {
    forest_join_47: {
    forest_join_43: {
    forest_join_42: {
    forest_join_32: {
    life2_3 = (com.moon.rl.b ^ 131425169733250L);
    spill100066_0 = com.moon.jN.c();
    life5_8 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(1)));
    life6_12 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(2)));
    life4_13 = spill100066_0;
    life7_17 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(3)));
    life8_21 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(4)));
    spill100066_1 = life5_8;
    if (!((life4_13 == 0))) {
        forestValue100066_42_0 = spill100066_1;
        break forest_join_42;
    }
    if (!((!((org.luaj.vm2.LuaValue)(spill100066_1)).isnil()))) {
        break forest_join_32;
    }
    spill100066_2 = ((org.luaj.vm2.LuaValue)(life5_8)).isstring();
    if (!((life4_13 == 0))) {
        forestValue100066_47_0 = ((spill100066_2) ? 1 : 0);
        break forest_join_47;
    }
    if (!((!spill100066_2))) {
        break forest_join_43;
    }
    }
    java.lang.String __stackOp100066_11_0 = ((org.luaj.vm2.LuaValue)(life5_8)).typename();
    java.lang.String __stackOp100066_11_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100066_10(15941, (1321947224436979094L ^ life2_3));
    forestValue100066_42_0 = org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100066_12(__stackOp100066_11_1, __stackOp100066_11_0))));
    }
    return forestValue100066_42_0;
    }
    spill100066_3 = life6_12;
    if (!((life4_13 == 0))) {
        forestValue100066_63_0 = spill100066_3;
        break forest_join_63;
    }
    forestValue100066_47_0 = ((((org.luaj.vm2.LuaValue)(spill100066_3)).isnil()) ? 1 : 0);
    }
    if (!((forestValue100066_47_0 == 0))) {
        break forest_join_53;
    }
    spill100066_4 = ((org.luaj.vm2.LuaValue)(life6_12)).isstring();
    if (!((life4_13 == 0))) {
        forestValue100066_68_0 = ((spill100066_4) ? 1 : 0);
        break forest_join_68;
    }
    if (!((!spill100066_4))) {
        break forest_join_64;
    }
    }
    java.lang.String __stackOp100066_20_0 = ((org.luaj.vm2.LuaValue)(life6_12)).typename();
    java.lang.String __stackOp100066_20_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100066_19(3248, (5267932407731226465L ^ life2_3));
    forestValue100066_63_0 = org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100066_21(__stackOp100066_20_1, __stackOp100066_20_0))));
    }
    return forestValue100066_63_0;
    }
    spill100066_5 = life7_17;
    if (!((life4_13 == 0))) {
        forestValue100066_84_0 = spill100066_5;
        break forest_join_84;
    }
    forestValue100066_68_0 = ((((org.luaj.vm2.LuaValue)(spill100066_5)).isnil()) ? 1 : 0);
    }
    if (!((forestValue100066_68_0 == 0))) {
        break forest_join_74;
    }
    spill100066_6 = ((org.luaj.vm2.LuaValue)(life7_17)).isstring();
    if (!((life4_13 == 0))) {
        forestValue100066_89_0 = ((spill100066_6) ? 1 : 0);
        break forest_join_89;
    }
    if (!((!spill100066_6))) {
        break forest_join_85;
    }
    }
    java.lang.String __stackOp100066_29_0 = ((org.luaj.vm2.LuaValue)(life7_17)).typename();
    java.lang.String __stackOp100066_29_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100066_28(20070, (8740744168862500276L ^ life2_3));
    forestValue100066_84_0 = org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100066_30(__stackOp100066_29_1, __stackOp100066_29_0))));
    }
    return forestValue100066_84_0;
    }
    spill100066_7 = life8_21;
    if (!((life4_13 == 0))) {
        forestValue100066_105_0 = spill100066_7;
        break forest_join_105;
    }
    forestValue100066_89_0 = ((((org.luaj.vm2.LuaValue)(spill100066_7)).isnil()) ? 1 : 0);
    }
    if (!((forestValue100066_89_0 == 0))) {
        break forest_join_95;
    }
    spill100066_8 = life8_21;
    if (!((life4_13 == 0))) {
        forestValue100066_119_0 = spill100066_8;
        break forest_join_119;
    }
    if (!((!((org.luaj.vm2.LuaValue)(spill100066_8)).isnumber()))) {
        break forest_join_106;
    }
    }
    java.lang.String __stackOp100066_37_0 = ((org.luaj.vm2.LuaValue)(life8_21)).typename();
    java.lang.String __stackOp100066_37_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100066_36(3184, (5222255236578903968L ^ life2_3));
    forestValue100066_105_0 = org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100066_38(__stackOp100066_37_1, __stackOp100066_37_0))));
    }
    return forestValue100066_105_0;
    }
    ((com.moon.j2)(((com.moon.jT)(this.a)).c)).create_color_setting(((java.lang.String)(((org.luaj.vm2.LuaValue)(life5_8)).tojstring())), ((java.lang.String)(((org.luaj.vm2.LuaValue)(life6_12)).tojstring())), ((java.lang.String)(((org.luaj.vm2.LuaValue)(life7_17)).tojstring())), ((int)(((org.luaj.vm2.LuaValue)(life8_21)).toint())));
    forestValue100066_119_0 = org.luaj.vm2.LuaValue.NIL;
    }
    return forestValue100066_119_0;
}


rl(com.moon.jT p0) { super(); }

private static void __sourceConstructorBody_332d0b7249025e2d(com.moon.rl receiver, com.moon.jT p0) throws Throwable {
((com.moon.rl)(receiver)).a = ((com.moon.jT)(p0));
    com.moon.rl.__sourceConstructorInit_332d0b7249025e2d_0(((com.moon.rl)(receiver)));
    return;
}


static {
javax.crypto.Cipher forestValue313_36_0;
    int forestValue313_36_1;
    javax.crypto.SecretKeyFactory forestValue313_36_2;
    byte[] forestValue313_36_3;
    javax.crypto.Cipher forestValue313_53_0;
    int forestValue313_53_1;
    javax.crypto.SecretKeyFactory forestValue313_53_2;
    byte[] forestValue313_53_3;
    java.lang.String forestValue313_86_0;
    int forestValue313_86_1;
    java.lang.String forestValue313_98_0;
    java.lang.String forestValue313_122_0;
    javax.crypto.Cipher spill313_0;
    int spill313_1;
    javax.crypto.SecretKeyFactory spill313_2;
    byte[] spill313_3;
    byte[] spill313_4;
    java.lang.String spill313_5;
    int spill313_6;
    java.lang.String spill313_7;
    java.lang.String[] spill313_8;
    java.lang.String[] spill313_9;
    java.lang.String spill313_10;
    java.lang.String spill313_11;
    int spill313_12;
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
    b = ((long)(((moom._a)(moom._c.a(((long)(-571203766682576401L)), ((long)(-4163326179777185163L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(253156528864113L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    life0_16 = (com.moon.rl.b ^ 84020288869029L);
    spill313_0 = (life2_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill313_1 = 2;
    spill313_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp313_9_0 = new byte[8];
    spill313_3 = __stackOp313_9_0;
    (__stackOp313_9_0)[0] = ((byte) ((int) (life0_16 >>> 56)));
    life3_35 = 1;
    forestValue313_36_0 = spill313_0;
    forestValue313_36_1 = spill313_1;
    forestValue313_36_2 = spill313_2;
    forestValue313_36_3 = spill313_3;
    forest_cycle_36: while (true) {
    if (!((life3_35 < 8))) {
        forestValue313_53_0 = forestValue313_36_0;
        forestValue313_53_1 = forestValue313_36_1;
        forestValue313_53_2 = forestValue313_36_2;
        forestValue313_53_3 = forestValue313_36_3;
        break forest_join_53;
    }
    byte[] __stackOp313_10_0 = forestValue313_36_3;
    spill313_4 = __stackOp313_10_0;
    (__stackOp313_10_0)[life3_35] = ((byte) ((int) ((life0_16 << (life3_35 * 8)) >>> 56)));
    life3_35 += 1;
    forestValue313_36_3 = spill313_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue313_53_0)).init(((int)(forestValue313_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue313_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue313_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life9_66 = new java.lang.String[4];
    life7_68 = 0;
    life8_73 = ((java.lang.String)((life6_71 = "joÝðPð\"4\0350<êµI\007Øìî\021l°úDJ&\037l!pnS×¿#èæâ'©\"fÄBi\0269\002hÍ c8û9Í¼d©©Ä¾Ú8¼i%{9h\026'Ó(¼¬©²\022ýRW$BÐJf!©ìÛ\037ÀECÑ¾v\027å[³Ã4"))).length();
    life5_75 = 56;
    life4_77 = -1;
    forest_cycle_78: while (true) {
    forest_join_148: {
    life4_77 += 1;
    spill313_5 = life6_71;
    int __stackOp313_14_0 = life4_77;
    forestValue313_86_0 = ((java.lang.String)(spill313_5)).substring(((int)(__stackOp313_14_0)), ((int)((__stackOp313_14_0 + life5_75))));
    forestValue313_86_1 = -1;
    forest_cycle_86: while (true) {
    forest_join_139: {
    forest_join_122: {
    forest_join_112: {
    forest_join_98: {
    java.lang.String __stackOp313_16_0 = forestValue313_86_0;
    int __stackOp313_16_1 = forestValue313_86_1;
    spill313_6 = __stackOp313_16_1;
    byte[] __stackOp313_18_0 = ((java.lang.String)(__stackOp313_16_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp313_18_1 = life2_20;
    life10_93 = ((javax.crypto.Cipher)(__stackOp313_18_1)).doFinal(((byte[])(__stackOp313_18_0)));
    int __stackOp313_22_0 = spill313_6;
    java.lang.String __stackOp313_22_1 = ((java.lang.String)(com.moon.rl.a(((byte[])(life10_93))))).intern();
    spill313_7 = __stackOp313_22_1;
    switch (__stackOp313_22_0) {
default:
{
        forestValue313_98_0 = spill313_7;
        break forest_join_98;
    }
case 0:
{
        forestValue313_122_0 = spill313_7;
        break forest_join_122;
    }
}
    }
    java.lang.String __stackOp313_23_0 = forestValue313_98_0;
    java.lang.String[] __stackOp313_23_1 = life9_66;
    spill313_8 = __stackOp313_23_1;
    java.lang.String __stackOp313_24_0 = __stackOp313_23_0;
    int __stackOp313_24_1 = (life7_68++);
    (spill313_8)[__stackOp313_24_1] = __stackOp313_24_0;
    if (!(((life4_77 = (life4_77 + life5_75)) < life8_73))) {
        break forest_join_112;
    }
    break forest_join_148;
    }
    life8_73 = ((java.lang.String)((life6_71 = "\026\000é\031aO5ÇÝ¸\\ÿ(ú\024à·ºîB\177TÃàÝû\n\b\bkÉÅôZ%Ì¡G\fNñþ¦@cr0@©´¬æV¢4)MZ;wi÷¼Ñ½Iî\020b;#aíYñkå¡s¨ ëÍ¦NíÙ÷"))).length();
    life5_75 = 48;
    life4_77 = -1;
    break forest_join_139;
    }
    java.lang.String __stackOp313_26_0 = forestValue313_122_0;
    java.lang.String[] __stackOp313_26_1 = life9_66;
    spill313_9 = __stackOp313_26_1;
    java.lang.String __stackOp313_27_0 = __stackOp313_26_0;
    int __stackOp313_27_1 = (life7_68++);
    (spill313_9)[__stackOp313_27_1] = __stackOp313_27_0;
    if (!(((life4_77 = (life4_77 + life5_75)) < life8_73))) {
        break forest_join_153;
    }
    life5_75 = ((int)(((java.lang.String)(life6_71)).charAt(((int)(life4_77)))));
    }
    life4_77 += 1;
    spill313_10 = life6_71;
    int __stackOp313_30_0 = life4_77;
    spill313_11 = ((java.lang.String)(spill313_10)).substring(((int)(__stackOp313_30_0)), ((int)((__stackOp313_30_0 + life5_75))));
    spill313_12 = 0;
    forestValue313_86_0 = spill313_11;
    forestValue313_86_1 = spill313_12;
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

private static native <E extends Throwable> void __sourceConstructorInit_332d0b7249025e2d_0(com.moon.rl a0) throws E;
private static native <E extends Throwable> java.lang.String __sourceHandlerCall_b59e435f0ab7ed6914a3(int a0, long a1) throws E;
private static final class __SourceHandler_b59e435f0ab7ed6914a3 {

public static java.lang.String f205(int p0, long p1) throws Throwable {
    int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 13934);
    if (((__fieldRead205_0())[life5_8] == null)) {
        life3_16 = __call205_3(__call205_2(__call205_1()));
        life4_21 = __cast205_6(__call205_5(__fieldRead205_4(), life3_16));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = __call205_7("DES/CBC/PKCS5Padding");
        (life4_21)[1] = __call205_8("DES");
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        __call205_10(__fieldRead205_9(), life3_16, life4_21);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_63: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = __call205_12(__cast205_11((life4_21)[1]), life7_92);
        __call205_15(__cast205_13((life4_21)[0]), 2, life8_99, __cast205_14((life4_21)[2]));
        life9_116 = __call205_17((__fieldRead205_16())[life5_8], "ISO-8859-1");
        (__fieldRead205_18())[life5_8] = __call205_21(__call205_20(__cast205_19((life4_21)[0]), life9_116));
    }
    return (__fieldRead205_22())[life5_8];
}
public static java.lang.String h205_0(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    throw new java.lang.RuntimeException("com/moon/rl", local1);
}
private static native java.lang.String[] __fieldRead205_0() throws Throwable;
private static native java.lang.Thread __call205_1() throws Throwable;
private static native long __call205_2(java.lang.Thread a0) throws Throwable;
private static native java.lang.Long __call205_3(long a0) throws Throwable;
private static native java.util.Map __fieldRead205_4() throws Throwable;
private static native java.lang.Object __call205_5(java.util.Map a0, java.lang.Long a1) throws Throwable;
private static native java.lang.Object[] __cast205_6(java.lang.Object a0) throws Throwable;
private static native javax.crypto.Cipher __call205_7(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call205_8(java.lang.String a0) throws Throwable;
private static native java.util.Map __fieldRead205_9() throws Throwable;
private static native java.lang.Object __call205_10(java.util.Map a0, java.lang.Long a1, java.lang.Object[] a2) throws Throwable;
private static native javax.crypto.SecretKeyFactory __cast205_11(java.lang.Object a0) throws Throwable;
private static native javax.crypto.SecretKey __call205_12(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native javax.crypto.Cipher __cast205_13(java.lang.Object a0) throws Throwable;
private static native javax.crypto.spec.IvParameterSpec __cast205_14(java.lang.Object a0) throws Throwable;
private static native void __call205_15(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native java.lang.String[] __fieldRead205_16() throws Throwable;
private static native byte[] __call205_17(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String[] __fieldRead205_18() throws Throwable;
private static native javax.crypto.Cipher __cast205_19(java.lang.Object a0) throws Throwable;
private static native byte[] __call205_20(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native java.lang.String __call205_21(byte[] a0) throws Throwable;
private static native java.lang.String[] __fieldRead205_22() throws Throwable;

}

private static native <E extends Throwable> java.lang.invoke.CallSite __sourceHandlerCall_61f859cacd06db7ccf6d(java.lang.invoke.MethodHandles.Lookup a0, java.lang.String a1, java.lang.invoke.MethodType a2) throws E;
private static final class __SourceHandler_61f859cacd06db7ccf6d {

public static java.lang.invoke.CallSite f206(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.invoke.MutableCallSite life3_4;
    life3_4 = new java.lang.invoke.MutableCallSite(p2);
    java.lang.invoke.MutableCallSite spill206_0 = life3_4;
    java.lang.invoke.MethodHandle spill206_1 = __call206_3(__methodHandleLiteral206_0(), __classLiteral206_1(), __call206_2(p2));
    int spill206_2 = 0;
    java.lang.Object[] __stackOp206_4_0 = new java.lang.Object[3];
    java.lang.Object[] spill206_3 = __stackOp206_4_0;
    (__stackOp206_4_0)[0] = p0;
    java.lang.Object[] __stackOp206_5_0 = spill206_3;
    java.lang.Object[] spill206_4 = __stackOp206_5_0;
    (__stackOp206_5_0)[1] = life3_4;
    java.lang.Object[] __stackOp206_6_0 = spill206_4;
    java.lang.Object[] spill206_5 = __stackOp206_6_0;
    (__stackOp206_6_0)[2] = p1;
    __call206_9(spill206_0, __call206_8(__call206_7(spill206_1, spill206_2, spill206_5), p2));
    return life3_4;
}
public static java.lang.invoke.CallSite h206_0(java.lang.Exception p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.Exception local3 = p0;
    throw new java.lang.RuntimeException(__call2020600_6(__call2020600_5(__call2020600_3(__call2020600_2(__call2020600_1(__call2020600_0(new java.lang.StringBuilder(), "com/moon/rl"), " : "), p1), " : "), __call2020600_4(p2))), local3);
}
private static native java.lang.invoke.MethodHandle __methodHandleLiteral206_0() throws Throwable;
private static native java.lang.Object __classLiteral206_1() throws Throwable;
private static native int __call206_2(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.invoke.MethodHandle __call206_3(java.lang.invoke.MethodHandle a0, java.lang.Object a1, int a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call206_7(java.lang.invoke.MethodHandle a0, int a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call206_8(java.lang.invoke.MethodHandle a0, java.lang.invoke.MethodType a1) throws Throwable;
private static native void __call206_9(java.lang.invoke.MutableCallSite a0, java.lang.invoke.MethodHandle a1) throws Throwable;
private static native java.lang.StringBuilder __call2020600_0(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2020600_1(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2020600_2(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2020600_3(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2020600_4(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.StringBuilder __call2020600_5(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2020600_6(java.lang.StringBuilder a0) throws Throwable;

}


private static java.lang.String a(int p0, long p1) { return __sourceHandlerCall_b59e435f0ab7ed6914a3(p0, p1); }


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.rl.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) { return __sourceHandlerCall_61f859cacd06db7ccf6d(p0, p1, p2); }


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
        byte[] spill1378_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1378_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1378_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1378_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1378_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1378_2)[life4_9];
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


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100066_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100066_12(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100066_19(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100066_21(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100066_28(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100066_30(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100066_36(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100066_38(java.lang.String a0, java.lang.String a1) throws E;
}
