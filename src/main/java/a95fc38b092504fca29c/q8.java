package com.moon;


class q8 extends org.luaj.vm2.lib.VarArgFunction {

com.moon.jR a;

private static long b;

private static java.lang.String[] c;

private static java.lang.String[] d;

private static java.util.Map e;

public org.luaj.vm2.Varargs invoke(org.luaj.vm2.Varargs p0) {
int forestValue100047_44_0;
    int forestValue100047_60_0;
    int forestValue100047_76_0;
    int forestValue100047_94_0;
    org.luaj.vm2.LuaValue forestValue100047_121_0;
    int spill100047_0;
    boolean spill100047_1;
    org.luaj.vm2.LuaValue spill100047_2;
    long life2_3;
    org.luaj.vm2.LuaValue life5_7;
    org.luaj.vm2.LuaValue life6_11;
    org.luaj.vm2.LuaValue life7_16;
    int life4_17;
    org.luaj.vm2.LuaValue life8_21;
    org.luaj.vm2.LuaValue life9_25;
    forest_join_121: {
    forest_join_106: {
    forest_join_94: {
    forest_join_90: {
    forest_join_76: {
    forest_join_74: {
    forest_join_60: {
    forest_join_58: {
    forest_join_44: {
    forest_join_42: {
    life2_3 = (com.moon.q8.b ^ 19926947612912L);
    life5_7 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(1)));
    life6_11 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(2)));
    spill100047_0 = com.moon.jN.b();
    life7_16 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(3)));
    life4_17 = spill100047_0;
    life8_21 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(4)));
    life9_25 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(5)));
    spill100047_1 = ((org.luaj.vm2.LuaValue)(life5_7)).isnumber();
    if (!((life4_17 != 0))) {
        forestValue100047_44_0 = ((spill100047_1) ? 1 : 0);
        break forest_join_44;
    }
    if (!((!spill100047_1))) {
        break forest_join_42;
    }
    java.lang.String __stackOp100047_11_0 = ((org.luaj.vm2.LuaValue)(life5_7)).typename();
    java.lang.String __stackOp100047_11_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100047_10(6545, (1646045029535527870L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100047_12(__stackOp100047_11_1, __stackOp100047_11_0))));
    }
    forestValue100047_44_0 = ((((org.luaj.vm2.LuaValue)(life6_11)).isnumber()) ? 1 : 0);
    }
    if (!((life4_17 != 0))) {
        forestValue100047_60_0 = forestValue100047_44_0;
        break forest_join_60;
    }
    if (!((forestValue100047_44_0 == 0))) {
        break forest_join_58;
    }
    java.lang.String __stackOp100047_18_0 = ((org.luaj.vm2.LuaValue)(life6_11)).typename();
    java.lang.String __stackOp100047_18_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100047_17(27217, (1158519217111580796L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100047_19(__stackOp100047_18_1, __stackOp100047_18_0))));
    }
    forestValue100047_60_0 = ((((org.luaj.vm2.LuaValue)(life7_16)).isnumber()) ? 1 : 0);
    }
    if (!((life4_17 != 0))) {
        forestValue100047_76_0 = forestValue100047_60_0;
        break forest_join_76;
    }
    if (!((forestValue100047_60_0 == 0))) {
        break forest_join_74;
    }
    java.lang.String __stackOp100047_25_0 = ((org.luaj.vm2.LuaValue)(life7_16)).typename();
    java.lang.String __stackOp100047_25_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100047_24(27806, (6484148170469820080L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100047_26(__stackOp100047_25_1, __stackOp100047_25_0))));
    }
    forestValue100047_76_0 = ((((org.luaj.vm2.LuaValue)(life8_21)).isnumber()) ? 1 : 0);
    }
    if (!((life4_17 != 0))) {
        forestValue100047_94_0 = forestValue100047_76_0;
        break forest_join_94;
    }
    if (!((forestValue100047_76_0 == 0))) {
        break forest_join_90;
    }
    java.lang.String __stackOp100047_32_0 = ((org.luaj.vm2.LuaValue)(life8_21)).typename();
    java.lang.String __stackOp100047_32_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100047_31(24013, (4111396841308256230L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100047_33(__stackOp100047_32_1, __stackOp100047_32_0))));
    }
    spill100047_2 = life9_25;
    if (!((life4_17 != 0))) {
        forestValue100047_121_0 = spill100047_2;
        break forest_join_121;
    }
    forestValue100047_94_0 = ((((org.luaj.vm2.LuaValue)(spill100047_2)).isnumber()) ? 1 : 0);
    }
    if (!((forestValue100047_94_0 == 0))) {
        break forest_join_106;
    }
    java.lang.String __stackOp100047_39_0 = ((org.luaj.vm2.LuaValue)(life9_25)).typename();
    java.lang.String __stackOp100047_39_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100047_38(19337, (5251305915708465573L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100047_40(__stackOp100047_39_1, __stackOp100047_39_0))));
    }
    ((com.moon.j0)(((com.moon.jR)(this.a)).c)).rect(((float)(((org.luaj.vm2.LuaValue)(life5_7)).tofloat())), ((float)(((org.luaj.vm2.LuaValue)(life6_11)).tofloat())), ((float)(((org.luaj.vm2.LuaValue)(life7_16)).tofloat())), ((float)(((org.luaj.vm2.LuaValue)(life8_21)).tofloat())), ((int)(((org.luaj.vm2.LuaValue)(life9_25)).toint())));
    forestValue100047_121_0 = com.moon.q8.NIL;
    }
    return forestValue100047_121_0;
}


q8(com.moon.jR p0) { super(); }

private static void __sourceConstructorBody_841254d0411f2daa(com.moon.q8 receiver, com.moon.jR p0) throws Throwable {
((com.moon.q8)(receiver)).a = ((com.moon.jR)(p0));
    com.moon.q8.__sourceConstructorInit_841254d0411f2daa_0(((com.moon.q8)(receiver)));
    return;
}


static {
javax.crypto.Cipher forestValue147_36_0;
    int forestValue147_36_1;
    javax.crypto.SecretKeyFactory forestValue147_36_2;
    byte[] forestValue147_36_3;
    javax.crypto.Cipher forestValue147_53_0;
    int forestValue147_53_1;
    javax.crypto.SecretKeyFactory forestValue147_53_2;
    byte[] forestValue147_53_3;
    java.lang.String forestValue147_86_0;
    int forestValue147_86_1;
    java.lang.String forestValue147_98_0;
    java.lang.String forestValue147_122_0;
    javax.crypto.Cipher spill147_0;
    int spill147_1;
    javax.crypto.SecretKeyFactory spill147_2;
    byte[] spill147_3;
    byte[] spill147_4;
    java.lang.String spill147_5;
    int spill147_6;
    java.lang.String spill147_7;
    java.lang.String[] spill147_8;
    java.lang.String[] spill147_9;
    java.lang.String spill147_10;
    java.lang.String spill147_11;
    int spill147_12;
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
    b = ((long)(((moom._a)(moom._c.a(((long)(5402590215897314540L)), ((long)(1354650060272646809L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(195343578285646L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    life0_16 = (com.moon.q8.b ^ 47855688547755L);
    spill147_0 = (life2_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill147_1 = 2;
    spill147_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp147_9_0 = new byte[8];
    spill147_3 = __stackOp147_9_0;
    (__stackOp147_9_0)[0] = ((byte) ((int) (life0_16 >>> 56)));
    life3_35 = 1;
    forestValue147_36_0 = spill147_0;
    forestValue147_36_1 = spill147_1;
    forestValue147_36_2 = spill147_2;
    forestValue147_36_3 = spill147_3;
    forest_cycle_36: while (true) {
    if (!((life3_35 < 8))) {
        forestValue147_53_0 = forestValue147_36_0;
        forestValue147_53_1 = forestValue147_36_1;
        forestValue147_53_2 = forestValue147_36_2;
        forestValue147_53_3 = forestValue147_36_3;
        break forest_join_53;
    }
    byte[] __stackOp147_10_0 = forestValue147_36_3;
    spill147_4 = __stackOp147_10_0;
    (__stackOp147_10_0)[life3_35] = ((byte) ((int) ((life0_16 << (life3_35 * 8)) >>> 56)));
    life3_35 += 1;
    forestValue147_36_3 = spill147_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue147_53_0)).init(((int)(forestValue147_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue147_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue147_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life9_66 = new java.lang.String[5];
    life7_68 = 0;
    life8_73 = ((java.lang.String)((life6_71 = "\t\016Åo&`ÕI?\031«¼¹¡/\036Bäé\bíÔ\nHoAN\t )ì\023\025_à\017±·å&*¦\bjÜFÒHl8ºá\013ÿ¿ \t5¤\000Ôö¨s6¯øÑSÅ,GË\f\027vD&ð&ýî6\002p®êî´ÉrEÔlyaü0\002['aø\0019¨\bef-`ÆX§þ\026À­.Äè.ï[të\024tÃPBå\033¬þ~\r"))).length();
    life5_75 = 56;
    life4_77 = -1;
    forest_cycle_78: while (true) {
    forest_join_148: {
    life4_77 += 1;
    spill147_5 = life6_71;
    int __stackOp147_14_0 = life4_77;
    forestValue147_86_0 = ((java.lang.String)(spill147_5)).substring(((int)(__stackOp147_14_0)), ((int)((__stackOp147_14_0 + life5_75))));
    forestValue147_86_1 = -1;
    forest_cycle_86: while (true) {
    forest_join_139: {
    forest_join_122: {
    forest_join_112: {
    forest_join_98: {
    java.lang.String __stackOp147_16_0 = forestValue147_86_0;
    int __stackOp147_16_1 = forestValue147_86_1;
    spill147_6 = __stackOp147_16_1;
    byte[] __stackOp147_18_0 = ((java.lang.String)(__stackOp147_16_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp147_18_1 = life2_20;
    life10_93 = ((javax.crypto.Cipher)(__stackOp147_18_1)).doFinal(((byte[])(__stackOp147_18_0)));
    int __stackOp147_22_0 = spill147_6;
    java.lang.String __stackOp147_22_1 = ((java.lang.String)(com.moon.q8.a(((byte[])(life10_93))))).intern();
    spill147_7 = __stackOp147_22_1;
    switch (__stackOp147_22_0) {
default:
{
        forestValue147_98_0 = spill147_7;
        break forest_join_98;
    }
case 0:
{
        forestValue147_122_0 = spill147_7;
        break forest_join_122;
    }
}
    }
    java.lang.String __stackOp147_23_0 = forestValue147_98_0;
    java.lang.String[] __stackOp147_23_1 = life9_66;
    spill147_8 = __stackOp147_23_1;
    java.lang.String __stackOp147_24_0 = __stackOp147_23_0;
    int __stackOp147_24_1 = (life7_68++);
    (spill147_8)[__stackOp147_24_1] = __stackOp147_24_0;
    if (!(((life4_77 = (life4_77 + life5_75)) < life8_73))) {
        break forest_join_112;
    }
    break forest_join_148;
    }
    life8_73 = ((java.lang.String)((life6_71 = "ts\030\021Æ\037% \f1e K²Á0öò7%Ùj8Ço\1773¥\036çb`\fj\007_N¿à¬FÏy \032:0\036ÿ\016È6og\022<~\004õ5gÆ\002qEÇa\022\020#mFG\004]¬þ¼Ã\r\020\037?à\031rv\021Ç"))).length();
    life5_75 = 56;
    life4_77 = -1;
    break forest_join_139;
    }
    java.lang.String __stackOp147_26_0 = forestValue147_122_0;
    java.lang.String[] __stackOp147_26_1 = life9_66;
    spill147_9 = __stackOp147_26_1;
    java.lang.String __stackOp147_27_0 = __stackOp147_26_0;
    int __stackOp147_27_1 = (life7_68++);
    (spill147_9)[__stackOp147_27_1] = __stackOp147_27_0;
    if (!(((life4_77 = (life4_77 + life5_75)) < life8_73))) {
        break forest_join_153;
    }
    life5_75 = ((int)(((java.lang.String)(life6_71)).charAt(((int)(life4_77)))));
    }
    life4_77 += 1;
    spill147_10 = life6_71;
    int __stackOp147_30_0 = life4_77;
    spill147_11 = ((java.lang.String)(spill147_10)).substring(((int)(__stackOp147_30_0)), ((int)((__stackOp147_30_0 + life5_75))));
    spill147_12 = 0;
    forestValue147_86_0 = spill147_11;
    forestValue147_86_1 = spill147_12;
    continue forest_cycle_86;
    }
    }
    life5_75 = ((int)(((java.lang.String)(life6_71)).charAt(((int)(life4_77)))));
    continue forest_cycle_78;
    }
    }
    c = ((java.lang.String[])(life9_66));
    d = ((java.lang.String[])(new java.lang.String[5]));
}

private static native <E extends Throwable> void __sourceConstructorInit_841254d0411f2daa_0(com.moon.q8 a0) throws E;
private static native <E extends Throwable> java.lang.String __sourceHandlerCall_76b879188c43259f63f1(int a0, long a1) throws E;
private static final class __SourceHandler_76b879188c43259f63f1 {

public static java.lang.String f140(int p0, long p1) throws Throwable {
    int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 6334);
    if (((__fieldRead140_0())[life5_8] == null)) {
        life3_16 = __call140_3(__call140_2(__call140_1()));
        life4_21 = __cast140_6(__call140_5(__fieldRead140_4(), life3_16));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = __call140_7("DES/CBC/PKCS5Padding");
        (life4_21)[1] = __call140_8("DES");
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        __call140_10(__fieldRead140_9(), life3_16, life4_21);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_63: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = __call140_12(__cast140_11((life4_21)[1]), life7_92);
        __call140_15(__cast140_13((life4_21)[0]), 2, life8_99, __cast140_14((life4_21)[2]));
        life9_116 = __call140_17((__fieldRead140_16())[life5_8], "ISO-8859-1");
        (__fieldRead140_18())[life5_8] = __call140_21(__call140_20(__cast140_19((life4_21)[0]), life9_116));
    }
    return (__fieldRead140_22())[life5_8];
}
public static java.lang.String h140_0(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    throw new java.lang.RuntimeException("com/moon/q8", local1);
}
private static native java.lang.String[] __fieldRead140_0() throws Throwable;
private static native java.lang.Thread __call140_1() throws Throwable;
private static native long __call140_2(java.lang.Thread a0) throws Throwable;
private static native java.lang.Long __call140_3(long a0) throws Throwable;
private static native java.util.Map __fieldRead140_4() throws Throwable;
private static native java.lang.Object __call140_5(java.util.Map a0, java.lang.Long a1) throws Throwable;
private static native java.lang.Object[] __cast140_6(java.lang.Object a0) throws Throwable;
private static native javax.crypto.Cipher __call140_7(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call140_8(java.lang.String a0) throws Throwable;
private static native java.util.Map __fieldRead140_9() throws Throwable;
private static native java.lang.Object __call140_10(java.util.Map a0, java.lang.Long a1, java.lang.Object[] a2) throws Throwable;
private static native javax.crypto.SecretKeyFactory __cast140_11(java.lang.Object a0) throws Throwable;
private static native javax.crypto.SecretKey __call140_12(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native javax.crypto.Cipher __cast140_13(java.lang.Object a0) throws Throwable;
private static native javax.crypto.spec.IvParameterSpec __cast140_14(java.lang.Object a0) throws Throwable;
private static native void __call140_15(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native java.lang.String[] __fieldRead140_16() throws Throwable;
private static native byte[] __call140_17(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String[] __fieldRead140_18() throws Throwable;
private static native javax.crypto.Cipher __cast140_19(java.lang.Object a0) throws Throwable;
private static native byte[] __call140_20(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native java.lang.String __call140_21(byte[] a0) throws Throwable;
private static native java.lang.String[] __fieldRead140_22() throws Throwable;

}

private static native <E extends Throwable> java.lang.invoke.CallSite __sourceHandlerCall_f097e0e3bbd8b20fe500(java.lang.invoke.MethodHandles.Lookup a0, java.lang.String a1, java.lang.invoke.MethodType a2) throws E;
private static final class __SourceHandler_f097e0e3bbd8b20fe500 {

public static java.lang.invoke.CallSite f141(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.invoke.MutableCallSite life3_4;
    life3_4 = new java.lang.invoke.MutableCallSite(p2);
    java.lang.invoke.MutableCallSite spill141_0 = life3_4;
    java.lang.invoke.MethodHandle spill141_1 = __call141_3(__methodHandleLiteral141_0(), __classLiteral141_1(), __call141_2(p2));
    int spill141_2 = 0;
    java.lang.Object[] __stackOp141_4_0 = new java.lang.Object[3];
    java.lang.Object[] spill141_3 = __stackOp141_4_0;
    (__stackOp141_4_0)[0] = p0;
    java.lang.Object[] __stackOp141_5_0 = spill141_3;
    java.lang.Object[] spill141_4 = __stackOp141_5_0;
    (__stackOp141_5_0)[1] = life3_4;
    java.lang.Object[] __stackOp141_6_0 = spill141_4;
    java.lang.Object[] spill141_5 = __stackOp141_6_0;
    (__stackOp141_6_0)[2] = p1;
    __call141_9(spill141_0, __call141_8(__call141_7(spill141_1, spill141_2, spill141_5), p2));
    return life3_4;
}
public static java.lang.invoke.CallSite h141_0(java.lang.Exception p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.Exception local3 = p0;
    throw new java.lang.RuntimeException(__call2014100_6(__call2014100_5(__call2014100_3(__call2014100_2(__call2014100_1(__call2014100_0(new java.lang.StringBuilder(), "com/moon/q8"), " : "), p1), " : "), __call2014100_4(p2))), local3);
}
private static native java.lang.invoke.MethodHandle __methodHandleLiteral141_0() throws Throwable;
private static native java.lang.Object __classLiteral141_1() throws Throwable;
private static native int __call141_2(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.invoke.MethodHandle __call141_3(java.lang.invoke.MethodHandle a0, java.lang.Object a1, int a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call141_7(java.lang.invoke.MethodHandle a0, int a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call141_8(java.lang.invoke.MethodHandle a0, java.lang.invoke.MethodType a1) throws Throwable;
private static native void __call141_9(java.lang.invoke.MutableCallSite a0, java.lang.invoke.MethodHandle a1) throws Throwable;
private static native java.lang.StringBuilder __call2014100_0(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2014100_1(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2014100_2(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2014100_3(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2014100_4(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.StringBuilder __call2014100_5(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2014100_6(java.lang.StringBuilder a0) throws Throwable;

}


private static java.lang.String a(int p0, long p1) { return __sourceHandlerCall_76b879188c43259f63f1(p0, p1); }


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.q8.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) { return __sourceHandlerCall_f097e0e3bbd8b20fe500(p0, p1, p2); }


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
        byte[] spill1252_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1252_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1252_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1252_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1252_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1252_2)[life4_9];
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


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100047_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100047_12(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100047_17(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100047_19(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100047_24(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100047_26(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100047_31(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100047_33(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100047_38(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100047_40(java.lang.String a0, java.lang.String a1) throws E;
}
