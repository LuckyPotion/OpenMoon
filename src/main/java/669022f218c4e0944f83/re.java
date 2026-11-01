package com.moon;


class re extends org.luaj.vm2.lib.VarArgFunction {

com.moon.jS a;

private static long b;

private static java.lang.String[] c;

private static java.lang.String[] d;

private static java.util.Map e;

public org.luaj.vm2.Varargs invoke(org.luaj.vm2.Varargs p0) {
org.luaj.vm2.LuaValue forestValue100061_42_0;
    int forestValue100061_47_0;
    org.luaj.vm2.LuaValue forestValue100061_63_0;
    int forestValue100061_68_0;
    org.luaj.vm2.LuaValue forestValue100061_84_0;
    int forestValue100061_89_0;
    org.luaj.vm2.LuaValue forestValue100061_105_0;
    int forestValue100061_108_0;
    int spill100061_0;
    org.luaj.vm2.LuaValue spill100061_1;
    boolean spill100061_2;
    org.luaj.vm2.LuaValue spill100061_3;
    boolean spill100061_4;
    org.luaj.vm2.LuaValue spill100061_5;
    boolean spill100061_6;
    org.luaj.vm2.LuaValue spill100061_7;
    boolean spill100061_8;
    long life2_3;
    org.luaj.vm2.LuaValue life5_8;
    org.luaj.vm2.LuaValue life6_12;
    org.luaj.vm2.LuaValue life7_16;
    int life4_17;
    org.luaj.vm2.LuaValue life8_21;
    int life9_124;
    int life10_127;
    int life11_130;
    int life12_133;
    forest_join_108: {
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
    life2_3 = (com.moon.re.b ^ 131094293274618L);
    spill100061_0 = com.moon.jN.c();
    life5_8 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(1)));
    life6_12 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(2)));
    life7_16 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(3)));
    life4_17 = spill100061_0;
    life8_21 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(4)));
    spill100061_1 = life5_8;
    if (!((life4_17 == 0))) {
        forestValue100061_42_0 = spill100061_1;
        break forest_join_42;
    }
    if (!((!((org.luaj.vm2.LuaValue)(spill100061_1)).isnil()))) {
        break forest_join_32;
    }
    spill100061_2 = ((org.luaj.vm2.LuaValue)(life5_8)).isnumber();
    if (!((life4_17 == 0))) {
        forestValue100061_47_0 = ((spill100061_2) ? 1 : 0);
        break forest_join_47;
    }
    if (!((!spill100061_2))) {
        break forest_join_43;
    }
    }
    java.lang.String __stackOp100061_11_0 = ((org.luaj.vm2.LuaValue)(life5_8)).typename();
    java.lang.String __stackOp100061_11_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100061_10(8096, (935520545819381944L ^ life2_3));
    forestValue100061_42_0 = org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100061_12(__stackOp100061_11_1, __stackOp100061_11_0))));
    }
    return forestValue100061_42_0;
    }
    spill100061_3 = life6_12;
    if (!((life4_17 == 0))) {
        forestValue100061_63_0 = spill100061_3;
        break forest_join_63;
    }
    forestValue100061_47_0 = ((((org.luaj.vm2.LuaValue)(spill100061_3)).isnil()) ? 1 : 0);
    }
    if (!((forestValue100061_47_0 == 0))) {
        break forest_join_53;
    }
    spill100061_4 = ((org.luaj.vm2.LuaValue)(life6_12)).isnumber();
    if (!((life4_17 == 0))) {
        forestValue100061_68_0 = ((spill100061_4) ? 1 : 0);
        break forest_join_68;
    }
    if (!((!spill100061_4))) {
        break forest_join_64;
    }
    }
    java.lang.String __stackOp100061_20_0 = ((org.luaj.vm2.LuaValue)(life6_12)).typename();
    java.lang.String __stackOp100061_20_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100061_19(6465, (856274134811727448L ^ life2_3));
    forestValue100061_63_0 = org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100061_21(__stackOp100061_20_1, __stackOp100061_20_0))));
    }
    return forestValue100061_63_0;
    }
    spill100061_5 = life7_16;
    if (!((life4_17 == 0))) {
        forestValue100061_84_0 = spill100061_5;
        break forest_join_84;
    }
    forestValue100061_68_0 = ((((org.luaj.vm2.LuaValue)(spill100061_5)).isnil()) ? 1 : 0);
    }
    if (!((forestValue100061_68_0 == 0))) {
        break forest_join_74;
    }
    spill100061_6 = ((org.luaj.vm2.LuaValue)(life7_16)).isnumber();
    if (!((life4_17 == 0))) {
        forestValue100061_89_0 = ((spill100061_6) ? 1 : 0);
        break forest_join_89;
    }
    if (!((!spill100061_6))) {
        break forest_join_85;
    }
    }
    java.lang.String __stackOp100061_29_0 = ((org.luaj.vm2.LuaValue)(life7_16)).typename();
    java.lang.String __stackOp100061_29_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100061_28(8801, (1005823339185794427L ^ life2_3));
    forestValue100061_84_0 = org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100061_30(__stackOp100061_29_1, __stackOp100061_29_0))));
    }
    return forestValue100061_84_0;
    }
    spill100061_7 = life8_21;
    if (!((life4_17 == 0))) {
        forestValue100061_105_0 = spill100061_7;
        break forest_join_105;
    }
    forestValue100061_89_0 = ((((org.luaj.vm2.LuaValue)(spill100061_7)).isnil()) ? 1 : 0);
    }
    if (!((forestValue100061_89_0 == 0))) {
        break forest_join_95;
    }
    spill100061_8 = ((org.luaj.vm2.LuaValue)(life8_21)).isnumber();
    if (!((life4_17 == 0))) {
        forestValue100061_108_0 = ((spill100061_8) ? 1 : 0);
        break forest_join_108;
    }
    if (!((!spill100061_8))) {
        break forest_join_106;
    }
    }
    java.lang.String __stackOp100061_38_0 = ((org.luaj.vm2.LuaValue)(life8_21)).typename();
    java.lang.String __stackOp100061_38_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100061_37(18656, (4337317884585379835L ^ life2_3));
    forestValue100061_105_0 = org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100061_39(__stackOp100061_38_1, __stackOp100061_38_0))));
    }
    return forestValue100061_105_0;
    }
    forestValue100061_108_0 = ((org.luaj.vm2.LuaValue)(life5_8)).toint();
    }
    life9_124 = forestValue100061_108_0;
    life10_127 = ((org.luaj.vm2.LuaValue)(life6_12)).toint();
    life11_130 = ((org.luaj.vm2.LuaValue)(life7_16)).toint();
    life12_133 = ((org.luaj.vm2.LuaValue)(life8_21)).toint();
    ((com.moon.j1)(((com.moon.jS)(this.a)).c)).window_click(((int)(life9_124)), ((int)(life10_127)), ((int)(life11_130)), ((int)(life12_133)));
    return org.luaj.vm2.LuaValue.NIL;
}


re(com.moon.jS p0) { super(); }

private static void __sourceConstructorBody_7c710d9c98f7bcfc(com.moon.re receiver, com.moon.jS p0) throws Throwable {
((com.moon.re)(receiver)).a = ((com.moon.jS)(p0));
    com.moon.re.__sourceConstructorInit_7c710d9c98f7bcfc_0(((com.moon.re)(receiver)));
    return;
}


static {
javax.crypto.Cipher forestValue299_36_0;
    int forestValue299_36_1;
    javax.crypto.SecretKeyFactory forestValue299_36_2;
    byte[] forestValue299_36_3;
    javax.crypto.Cipher forestValue299_53_0;
    int forestValue299_53_1;
    javax.crypto.SecretKeyFactory forestValue299_53_2;
    byte[] forestValue299_53_3;
    java.lang.String forestValue299_86_0;
    int forestValue299_86_1;
    java.lang.String forestValue299_98_0;
    java.lang.String forestValue299_122_0;
    javax.crypto.Cipher spill299_0;
    int spill299_1;
    javax.crypto.SecretKeyFactory spill299_2;
    byte[] spill299_3;
    byte[] spill299_4;
    java.lang.String spill299_5;
    int spill299_6;
    java.lang.String spill299_7;
    java.lang.String[] spill299_8;
    java.lang.String[] spill299_9;
    java.lang.String spill299_10;
    java.lang.String spill299_11;
    int spill299_12;
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
    b = ((long)(((moom._a)(moom._c.a(((long)(-7268411937546762515L)), ((long)(-8526304252066417016L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(155759590364543L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    life0_16 = (com.moon.re.b ^ 126193684791973L);
    spill299_0 = (life2_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill299_1 = 2;
    spill299_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp299_9_0 = new byte[8];
    spill299_3 = __stackOp299_9_0;
    (__stackOp299_9_0)[0] = ((byte) ((int) (life0_16 >>> 56)));
    life3_35 = 1;
    forestValue299_36_0 = spill299_0;
    forestValue299_36_1 = spill299_1;
    forestValue299_36_2 = spill299_2;
    forestValue299_36_3 = spill299_3;
    forest_cycle_36: while (true) {
    if (!((life3_35 < 8))) {
        forestValue299_53_0 = forestValue299_36_0;
        forestValue299_53_1 = forestValue299_36_1;
        forestValue299_53_2 = forestValue299_36_2;
        forestValue299_53_3 = forestValue299_36_3;
        break forest_join_53;
    }
    byte[] __stackOp299_10_0 = forestValue299_36_3;
    spill299_4 = __stackOp299_10_0;
    (__stackOp299_10_0)[life3_35] = ((byte) ((int) ((life0_16 << (life3_35 * 8)) >>> 56)));
    life3_35 += 1;
    forestValue299_36_3 = spill299_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue299_53_0)).init(((int)(forestValue299_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue299_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue299_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life9_66 = new java.lang.String[4];
    life7_68 = 0;
    life8_73 = ((java.lang.String)((life6_71 = "\036ì×9>èFz\001ºþt\023pÖN2\021ñ-hhÒæ]Ó\003ïE)¡ð¸c>®ì\"áIlMö1\027ê Eª\0168é+V¯µmÕãÒ(\001\177ïkã\n\001Å4xìLo2Ùºò\005\025\004?S²y¸[½PjF±&Çðãe]b¥/"))).length();
    life5_75 = 56;
    life4_77 = -1;
    forest_cycle_78: while (true) {
    forest_join_148: {
    life4_77 += 1;
    spill299_5 = life6_71;
    int __stackOp299_14_0 = life4_77;
    forestValue299_86_0 = ((java.lang.String)(spill299_5)).substring(((int)(__stackOp299_14_0)), ((int)((__stackOp299_14_0 + life5_75))));
    forestValue299_86_1 = -1;
    forest_cycle_86: while (true) {
    forest_join_139: {
    forest_join_122: {
    forest_join_112: {
    forest_join_98: {
    java.lang.String __stackOp299_16_0 = forestValue299_86_0;
    int __stackOp299_16_1 = forestValue299_86_1;
    spill299_6 = __stackOp299_16_1;
    byte[] __stackOp299_18_0 = ((java.lang.String)(__stackOp299_16_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp299_18_1 = life2_20;
    life10_93 = ((javax.crypto.Cipher)(__stackOp299_18_1)).doFinal(((byte[])(__stackOp299_18_0)));
    int __stackOp299_22_0 = spill299_6;
    java.lang.String __stackOp299_22_1 = ((java.lang.String)(com.moon.re.a(((byte[])(life10_93))))).intern();
    spill299_7 = __stackOp299_22_1;
    switch (__stackOp299_22_0) {
default:
{
        forestValue299_98_0 = spill299_7;
        break forest_join_98;
    }
case 0:
{
        forestValue299_122_0 = spill299_7;
        break forest_join_122;
    }
}
    }
    java.lang.String __stackOp299_23_0 = forestValue299_98_0;
    java.lang.String[] __stackOp299_23_1 = life9_66;
    spill299_8 = __stackOp299_23_1;
    java.lang.String __stackOp299_24_0 = __stackOp299_23_0;
    int __stackOp299_24_1 = (life7_68++);
    (spill299_8)[__stackOp299_24_1] = __stackOp299_24_0;
    if (!(((life4_77 = (life4_77 + life5_75)) < life8_73))) {
        break forest_join_112;
    }
    break forest_join_148;
    }
    life8_73 = ((java.lang.String)((life6_71 = "H]ÑHÏëòÛ5ã=\007ÛUÍl£P°´×LG\034]66ß\020Åÿ)Z'©\037ö,½û:ÑÀ¼8mgÖ Ôyuª¶ç&¾46\032¶]\027kª/ñ.ªÝ\002Zw\0211*URBdÛåý|7Y×(ø6è5#"))).length();
    life5_75 = 48;
    life4_77 = -1;
    break forest_join_139;
    }
    java.lang.String __stackOp299_26_0 = forestValue299_122_0;
    java.lang.String[] __stackOp299_26_1 = life9_66;
    spill299_9 = __stackOp299_26_1;
    java.lang.String __stackOp299_27_0 = __stackOp299_26_0;
    int __stackOp299_27_1 = (life7_68++);
    (spill299_9)[__stackOp299_27_1] = __stackOp299_27_0;
    if (!(((life4_77 = (life4_77 + life5_75)) < life8_73))) {
        break forest_join_153;
    }
    life5_75 = ((int)(((java.lang.String)(life6_71)).charAt(((int)(life4_77)))));
    }
    life4_77 += 1;
    spill299_10 = life6_71;
    int __stackOp299_30_0 = life4_77;
    spill299_11 = ((java.lang.String)(spill299_10)).substring(((int)(__stackOp299_30_0)), ((int)((__stackOp299_30_0 + life5_75))));
    spill299_12 = 0;
    forestValue299_86_0 = spill299_11;
    forestValue299_86_1 = spill299_12;
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

private static native <E extends Throwable> void __sourceConstructorInit_7c710d9c98f7bcfc_0(com.moon.re a0) throws E;
private static native <E extends Throwable> java.lang.String __sourceHandlerCall_a8cc919030f692271679(int a0, long a1) throws E;
private static final class __SourceHandler_a8cc919030f692271679 {

public static java.lang.String f189(int p0, long p1) throws Throwable {
    int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 32282);
    if (((__fieldRead189_0())[life5_8] == null)) {
        life3_16 = __call189_3(__call189_2(__call189_1()));
        life4_21 = __cast189_6(__call189_5(__fieldRead189_4(), life3_16));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = __call189_7("DES/CBC/PKCS5Padding");
        (life4_21)[1] = __call189_8("DES");
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        __call189_10(__fieldRead189_9(), life3_16, life4_21);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_63: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = __call189_12(__cast189_11((life4_21)[1]), life7_92);
        __call189_15(__cast189_13((life4_21)[0]), 2, life8_99, __cast189_14((life4_21)[2]));
        life9_116 = __call189_17((__fieldRead189_16())[life5_8], "ISO-8859-1");
        (__fieldRead189_18())[life5_8] = __call189_21(__call189_20(__cast189_19((life4_21)[0]), life9_116));
    }
    return (__fieldRead189_22())[life5_8];
}
public static java.lang.String h189_0(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    throw new java.lang.RuntimeException("com/moon/re", local1);
}
private static native java.lang.String[] __fieldRead189_0() throws Throwable;
private static native java.lang.Thread __call189_1() throws Throwable;
private static native long __call189_2(java.lang.Thread a0) throws Throwable;
private static native java.lang.Long __call189_3(long a0) throws Throwable;
private static native java.util.Map __fieldRead189_4() throws Throwable;
private static native java.lang.Object __call189_5(java.util.Map a0, java.lang.Long a1) throws Throwable;
private static native java.lang.Object[] __cast189_6(java.lang.Object a0) throws Throwable;
private static native javax.crypto.Cipher __call189_7(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call189_8(java.lang.String a0) throws Throwable;
private static native java.util.Map __fieldRead189_9() throws Throwable;
private static native java.lang.Object __call189_10(java.util.Map a0, java.lang.Long a1, java.lang.Object[] a2) throws Throwable;
private static native javax.crypto.SecretKeyFactory __cast189_11(java.lang.Object a0) throws Throwable;
private static native javax.crypto.SecretKey __call189_12(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native javax.crypto.Cipher __cast189_13(java.lang.Object a0) throws Throwable;
private static native javax.crypto.spec.IvParameterSpec __cast189_14(java.lang.Object a0) throws Throwable;
private static native void __call189_15(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native java.lang.String[] __fieldRead189_16() throws Throwable;
private static native byte[] __call189_17(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String[] __fieldRead189_18() throws Throwable;
private static native javax.crypto.Cipher __cast189_19(java.lang.Object a0) throws Throwable;
private static native byte[] __call189_20(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native java.lang.String __call189_21(byte[] a0) throws Throwable;
private static native java.lang.String[] __fieldRead189_22() throws Throwable;

}

private static native <E extends Throwable> java.lang.invoke.CallSite __sourceHandlerCall_ad26028294cab4f2ff9e(java.lang.invoke.MethodHandles.Lookup a0, java.lang.String a1, java.lang.invoke.MethodType a2) throws E;
private static final class __SourceHandler_ad26028294cab4f2ff9e {

public static java.lang.invoke.CallSite f190(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.invoke.MutableCallSite life3_4;
    life3_4 = new java.lang.invoke.MutableCallSite(p2);
    java.lang.invoke.MutableCallSite spill190_0 = life3_4;
    java.lang.invoke.MethodHandle spill190_1 = __call190_3(__methodHandleLiteral190_0(), __classLiteral190_1(), __call190_2(p2));
    int spill190_2 = 0;
    java.lang.Object[] __stackOp190_4_0 = new java.lang.Object[3];
    java.lang.Object[] spill190_3 = __stackOp190_4_0;
    (__stackOp190_4_0)[0] = p0;
    java.lang.Object[] __stackOp190_5_0 = spill190_3;
    java.lang.Object[] spill190_4 = __stackOp190_5_0;
    (__stackOp190_5_0)[1] = life3_4;
    java.lang.Object[] __stackOp190_6_0 = spill190_4;
    java.lang.Object[] spill190_5 = __stackOp190_6_0;
    (__stackOp190_6_0)[2] = p1;
    __call190_9(spill190_0, __call190_8(__call190_7(spill190_1, spill190_2, spill190_5), p2));
    return life3_4;
}
public static java.lang.invoke.CallSite h190_0(java.lang.Exception p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.Exception local3 = p0;
    throw new java.lang.RuntimeException(__call2019000_6(__call2019000_5(__call2019000_3(__call2019000_2(__call2019000_1(__call2019000_0(new java.lang.StringBuilder(), "com/moon/re"), " : "), p1), " : "), __call2019000_4(p2))), local3);
}
private static native java.lang.invoke.MethodHandle __methodHandleLiteral190_0() throws Throwable;
private static native java.lang.Object __classLiteral190_1() throws Throwable;
private static native int __call190_2(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.invoke.MethodHandle __call190_3(java.lang.invoke.MethodHandle a0, java.lang.Object a1, int a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call190_7(java.lang.invoke.MethodHandle a0, int a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call190_8(java.lang.invoke.MethodHandle a0, java.lang.invoke.MethodType a1) throws Throwable;
private static native void __call190_9(java.lang.invoke.MutableCallSite a0, java.lang.invoke.MethodHandle a1) throws Throwable;
private static native java.lang.StringBuilder __call2019000_0(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2019000_1(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2019000_2(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2019000_3(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2019000_4(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.StringBuilder __call2019000_5(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2019000_6(java.lang.StringBuilder a0) throws Throwable;

}


private static java.lang.String a(int p0, long p1) { return __sourceHandlerCall_a8cc919030f692271679(p0, p1); }


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.re.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) { return __sourceHandlerCall_ad26028294cab4f2ff9e(p0, p1, p2); }


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
        byte[] spill1364_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1364_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1364_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1364_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1364_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1364_2)[life4_9];
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


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100061_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100061_12(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100061_19(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100061_21(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100061_28(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100061_30(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100061_37(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100061_39(java.lang.String a0, java.lang.String a1) throws E;
}
