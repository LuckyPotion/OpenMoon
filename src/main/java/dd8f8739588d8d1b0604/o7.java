package com.moon;


public class o7 implements com.viaversion.viabackwards.api.ViaBackwardsPlatform {

private java.io.File a;

private static long b;

private static java.lang.String[] c;

private static java.lang.String[] d;

private static java.util.Map e;

public o7(java.io.File p0) { super(); }

private static void __sourceConstructorBody_104e450725fe4e20(com.moon.o7 receiver, java.io.File p0) throws Throwable {
java.lang.String spill210009_0;
    com.moon.o7 spill210009_1;
    java.io.File spill210009_2;
    long life2_3;
    java.io.File life5_16;
    java.lang.String life4_17;
    life2_3 = (com.moon.o7.b ^ 110341157313822L);
    com.moon.o7.__sourceConstructorInit_104e450725fe4e20_0(((com.moon.o7)(receiver)));
    spill210009_0 = com.moon.o_.b();
    life5_16 = new java.io.File(p0, __sourceIntrinsic_104e450725fe4e20_invokedynamic210009_3(2946, (7121652033464320482L ^ life2_3)));
    life4_17 = spill210009_0;
    if ((life4_17 == null)) {
        if ((!((java.io.File)(life5_16)).exists())) {
        ((java.io.File)(life5_16)).mkdirs();
    } else {
        
    }
        spill210009_1 = receiver;
        com.moon.o7 __stackOp210009_6_0 = receiver;
        java.io.File __stackOp210009_6_1 = life5_16;
        spill210009_2 = __stackOp210009_6_1;
        ((com.moon.o7)(__stackOp210009_6_0)).a = ((java.io.File)(__stackOp210009_6_1));
        ((com.moon.o7)(spill210009_1)).init(((java.io.File)(spill210009_2)));
    } else {
        
    }
    return;
}


static {
javax.crypto.Cipher forestValue56_36_0;
    int forestValue56_36_1;
    javax.crypto.SecretKeyFactory forestValue56_36_2;
    byte[] forestValue56_36_3;
    javax.crypto.Cipher forestValue56_53_0;
    int forestValue56_53_1;
    javax.crypto.SecretKeyFactory forestValue56_53_2;
    byte[] forestValue56_53_3;
    java.lang.String forestValue56_86_0;
    int forestValue56_86_1;
    java.lang.String forestValue56_98_0;
    java.lang.String forestValue56_122_0;
    javax.crypto.Cipher spill56_0;
    int spill56_1;
    javax.crypto.SecretKeyFactory spill56_2;
    byte[] spill56_3;
    byte[] spill56_4;
    java.lang.String spill56_5;
    int spill56_6;
    java.lang.String spill56_7;
    java.lang.String[] spill56_8;
    java.lang.String[] spill56_9;
    java.lang.String spill56_10;
    java.lang.String spill56_11;
    int spill56_12;
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
    b = ((long)(((moom._a)(moom._c.a(((long)(-1945891701665522315L)), ((long)(3240575849807959720L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(103280738768491L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    life0_16 = (com.moon.o7.b ^ 28565273507965L);
    spill56_0 = (life2_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill56_1 = 2;
    spill56_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp56_9_0 = new byte[8];
    spill56_3 = __stackOp56_9_0;
    (__stackOp56_9_0)[0] = ((byte) ((int) (life0_16 >>> 56)));
    life3_35 = 1;
    forestValue56_36_0 = spill56_0;
    forestValue56_36_1 = spill56_1;
    forestValue56_36_2 = spill56_2;
    forestValue56_36_3 = spill56_3;
    forest_cycle_36: while (true) {
    if (!((life3_35 < 8))) {
        forestValue56_53_0 = forestValue56_36_0;
        forestValue56_53_1 = forestValue56_36_1;
        forestValue56_53_2 = forestValue56_36_2;
        forestValue56_53_3 = forestValue56_36_3;
        break forest_join_53;
    }
    byte[] __stackOp56_10_0 = forestValue56_36_3;
    spill56_4 = __stackOp56_10_0;
    (__stackOp56_10_0)[life3_35] = ((byte) ((int) ((life0_16 << (life3_35 * 8)) >>> 56)));
    life3_35 += 1;
    forestValue56_36_3 = spill56_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue56_53_0)).init(((int)(forestValue56_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue56_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue56_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life9_66 = new java.lang.String[5];
    life7_68 = 0;
    life8_73 = ((java.lang.String)((life6_71 = "g/#ö·=*dz 67#\007m\034å¸s§rÃýèåÇEÕË\002¢+\0275Ãß0{\013=ã)ðGM6·}ùI\\Õ\031Ü\036·Ô\b­}\026o,{\001åµx\f¨ÔM\025\r%¤áR½Vî 82 »Ø8ñ1U#è\032\037*hR{%ì\003\021GCÞ¶ï\""))).length();
    life5_75 = 40;
    life4_77 = -1;
    forest_cycle_78: while (true) {
    forest_join_148: {
    life4_77 += 1;
    spill56_5 = life6_71;
    int __stackOp56_14_0 = life4_77;
    forestValue56_86_0 = ((java.lang.String)(spill56_5)).substring(((int)(__stackOp56_14_0)), ((int)((__stackOp56_14_0 + life5_75))));
    forestValue56_86_1 = -1;
    forest_cycle_86: while (true) {
    forest_join_139: {
    forest_join_122: {
    forest_join_112: {
    forest_join_98: {
    java.lang.String __stackOp56_16_0 = forestValue56_86_0;
    int __stackOp56_16_1 = forestValue56_86_1;
    spill56_6 = __stackOp56_16_1;
    byte[] __stackOp56_18_0 = ((java.lang.String)(__stackOp56_16_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp56_18_1 = life2_20;
    life10_93 = ((javax.crypto.Cipher)(__stackOp56_18_1)).doFinal(((byte[])(__stackOp56_18_0)));
    int __stackOp56_22_0 = spill56_6;
    java.lang.String __stackOp56_22_1 = ((java.lang.String)(com.moon.o7.a(((byte[])(life10_93))))).intern();
    spill56_7 = __stackOp56_22_1;
    switch (__stackOp56_22_0) {
default:
{
        forestValue56_98_0 = spill56_7;
        break forest_join_98;
    }
case 0:
{
        forestValue56_122_0 = spill56_7;
        break forest_join_122;
    }
}
    }
    java.lang.String __stackOp56_23_0 = forestValue56_98_0;
    java.lang.String[] __stackOp56_23_1 = life9_66;
    spill56_8 = __stackOp56_23_1;
    java.lang.String __stackOp56_24_0 = __stackOp56_23_0;
    int __stackOp56_24_1 = (life7_68++);
    (spill56_8)[__stackOp56_24_1] = __stackOp56_24_0;
    if (!(((life4_77 = (life4_77 + life5_75)) < life8_73))) {
        break forest_join_112;
    }
    break forest_join_148;
    }
    life8_73 = ((java.lang.String)((life6_71 = "7\037\002=\r\nÑ÷,O\b\030àFu/\t~\034(ÇrÒÄ\006:r² \024RÇfÚA2ò°ãýQ\026\nî\000xI¿ÆÜáf¥\017óF"))).length();
    life5_75 = 32;
    life4_77 = -1;
    break forest_join_139;
    }
    java.lang.String __stackOp56_26_0 = forestValue56_122_0;
    java.lang.String[] __stackOp56_26_1 = life9_66;
    spill56_9 = __stackOp56_26_1;
    java.lang.String __stackOp56_27_0 = __stackOp56_26_0;
    int __stackOp56_27_1 = (life7_68++);
    (spill56_9)[__stackOp56_27_1] = __stackOp56_27_0;
    if (!(((life4_77 = (life4_77 + life5_75)) < life8_73))) {
        break forest_join_153;
    }
    life5_75 = ((int)(((java.lang.String)(life6_71)).charAt(((int)(life4_77)))));
    }
    life4_77 += 1;
    spill56_10 = life6_71;
    int __stackOp56_30_0 = life4_77;
    spill56_11 = ((java.lang.String)(spill56_10)).substring(((int)(__stackOp56_30_0)), ((int)((__stackOp56_30_0 + life5_75))));
    spill56_12 = 0;
    forestValue56_86_0 = spill56_11;
    forestValue56_86_1 = spill56_12;
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

private static native <E extends Throwable> void __sourceConstructorInit_104e450725fe4e20_0(com.moon.o7 a0) throws E;
private static native <E extends Throwable> java.lang.String __sourceHandlerCall_36bb0b80fa3ad073d4e0(int a0, long a1) throws E;
private static final class __SourceHandler_36bb0b80fa3ad073d4e0 {

public static java.lang.String f101(int p0, long p1) throws Throwable {
    int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 8);
    if (((__fieldRead101_0())[life5_8] == null)) {
        life3_16 = __call101_3(__call101_2(__call101_1()));
        life4_21 = __cast101_6(__call101_5(__fieldRead101_4(), life3_16));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = __call101_7("DES/CBC/PKCS5Padding");
        (life4_21)[1] = __call101_8("DES");
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        __call101_10(__fieldRead101_9(), life3_16, life4_21);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_63: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = __call101_12(__cast101_11((life4_21)[1]), life7_92);
        __call101_15(__cast101_13((life4_21)[0]), 2, life8_99, __cast101_14((life4_21)[2]));
        life9_116 = __call101_17((__fieldRead101_16())[life5_8], "ISO-8859-1");
        (__fieldRead101_18())[life5_8] = __call101_21(__call101_20(__cast101_19((life4_21)[0]), life9_116));
    }
    return (__fieldRead101_22())[life5_8];
}
public static java.lang.String h101_0(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    throw new java.lang.RuntimeException("com/moon/o7", local1);
}
private static native java.lang.String[] __fieldRead101_0() throws Throwable;
private static native java.lang.Thread __call101_1() throws Throwable;
private static native long __call101_2(java.lang.Thread a0) throws Throwable;
private static native java.lang.Long __call101_3(long a0) throws Throwable;
private static native java.util.Map __fieldRead101_4() throws Throwable;
private static native java.lang.Object __call101_5(java.util.Map a0, java.lang.Long a1) throws Throwable;
private static native java.lang.Object[] __cast101_6(java.lang.Object a0) throws Throwable;
private static native javax.crypto.Cipher __call101_7(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call101_8(java.lang.String a0) throws Throwable;
private static native java.util.Map __fieldRead101_9() throws Throwable;
private static native java.lang.Object __call101_10(java.util.Map a0, java.lang.Long a1, java.lang.Object[] a2) throws Throwable;
private static native javax.crypto.SecretKeyFactory __cast101_11(java.lang.Object a0) throws Throwable;
private static native javax.crypto.SecretKey __call101_12(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native javax.crypto.Cipher __cast101_13(java.lang.Object a0) throws Throwable;
private static native javax.crypto.spec.IvParameterSpec __cast101_14(java.lang.Object a0) throws Throwable;
private static native void __call101_15(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native java.lang.String[] __fieldRead101_16() throws Throwable;
private static native byte[] __call101_17(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String[] __fieldRead101_18() throws Throwable;
private static native javax.crypto.Cipher __cast101_19(java.lang.Object a0) throws Throwable;
private static native byte[] __call101_20(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native java.lang.String __call101_21(byte[] a0) throws Throwable;
private static native java.lang.String[] __fieldRead101_22() throws Throwable;

}

private static native <E extends Throwable> java.lang.invoke.CallSite __sourceHandlerCall_6c6f8f594601a5d5eb12(java.lang.invoke.MethodHandles.Lookup a0, java.lang.String a1, java.lang.invoke.MethodType a2) throws E;
private static final class __SourceHandler_6c6f8f594601a5d5eb12 {

public static java.lang.invoke.CallSite f102(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.invoke.MutableCallSite life3_4;
    life3_4 = new java.lang.invoke.MutableCallSite(p2);
    java.lang.invoke.MutableCallSite spill102_0 = life3_4;
    java.lang.invoke.MethodHandle spill102_1 = __call102_3(__methodHandleLiteral102_0(), __classLiteral102_1(), __call102_2(p2));
    int spill102_2 = 0;
    java.lang.Object[] __stackOp102_4_0 = new java.lang.Object[3];
    java.lang.Object[] spill102_3 = __stackOp102_4_0;
    (__stackOp102_4_0)[0] = p0;
    java.lang.Object[] __stackOp102_5_0 = spill102_3;
    java.lang.Object[] spill102_4 = __stackOp102_5_0;
    (__stackOp102_5_0)[1] = life3_4;
    java.lang.Object[] __stackOp102_6_0 = spill102_4;
    java.lang.Object[] spill102_5 = __stackOp102_6_0;
    (__stackOp102_6_0)[2] = p1;
    __call102_9(spill102_0, __call102_8(__call102_7(spill102_1, spill102_2, spill102_5), p2));
    return life3_4;
}
public static java.lang.invoke.CallSite h102_0(java.lang.Exception p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.Exception local3 = p0;
    throw new java.lang.RuntimeException(__call2010200_6(__call2010200_5(__call2010200_3(__call2010200_2(__call2010200_1(__call2010200_0(new java.lang.StringBuilder(), "com/moon/o7"), " : "), p1), " : "), __call2010200_4(p2))), local3);
}
private static native java.lang.invoke.MethodHandle __methodHandleLiteral102_0() throws Throwable;
private static native java.lang.Object __classLiteral102_1() throws Throwable;
private static native int __call102_2(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.invoke.MethodHandle __call102_3(java.lang.invoke.MethodHandle a0, java.lang.Object a1, int a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call102_7(java.lang.invoke.MethodHandle a0, int a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call102_8(java.lang.invoke.MethodHandle a0, java.lang.invoke.MethodType a1) throws Throwable;
private static native void __call102_9(java.lang.invoke.MutableCallSite a0, java.lang.invoke.MethodHandle a1) throws Throwable;
private static native java.lang.StringBuilder __call2010200_0(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2010200_1(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2010200_2(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2010200_3(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2010200_4(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.StringBuilder __call2010200_5(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2010200_6(java.lang.StringBuilder a0) throws Throwable;

}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) { return __sourceHandlerCall_6c6f8f594601a5d5eb12(p0, p1, p2); }


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
        byte[] spill1138_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1138_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1138_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1138_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1138_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1138_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.String a(int p0, long p1) { return __sourceHandlerCall_36bb0b80fa3ad073d4e0(p0, p1); }


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.o7.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void init(java.io.File p0) {
int forestValue151_41_0;
    java.lang.String spill151_0;
    boolean spill151_1;
    long life2_3;
    com.viaversion.viabackwards.ViaBackwardsConfig life5_17;
    java.lang.String life4_23;
    com.viaversion.viaversion.api.protocol.ProtocolManager life6_56;
    forest_join_250: {
    forest_join_41: {
    forest_join_33: {
    life2_3 = (com.moon.o7.b ^ 68395721522793L);
    spill151_0 = com.moon.o_.b();
    life5_17 = new com.viaversion.viabackwards.ViaBackwardsConfig(new java.io.File(p0, __sourceIntrinsic_f89bdeb6fe0f_invokedynamic151_2(3576, (7464359937839949033L ^ life2_3))));
    ((com.viaversion.viabackwards.ViaBackwardsConfig)(life5_17)).reloadConfig();
    com.viaversion.viabackwards.ViaBackwards.init(((com.viaversion.viabackwards.api.ViaBackwardsPlatform)(this)), ((com.viaversion.viabackwards.api.ViaBackwardsConfig)(life5_17)));
    life4_23 = spill151_0;
    spill151_1 = ((com.moon.o7)(this)).isOutdated();
    if (!((life4_23 == null))) {
        forestValue151_41_0 = ((spill151_1) ? 1 : 0);
        break forest_join_41;
    }
    if (!(spill151_1)) {
        break forest_join_33;
    }
    ((com.moon.o7)(this)).disable();
    if (!((life4_23 != null))) {
        break forest_join_250;
    }
    }
    forestValue151_41_0 = ((((java.util.Set)(((com.viaversion.viaversion.api.ViaManager)(com.viaversion.viaversion.api.Via.getManager())).getSubPlatforms())).add(((java.lang.Object)(__sourceIntrinsic_f89bdeb6fe0f_invokedynamic151_10(4181, (5141340745930963271L ^ life2_3)))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue151_41_0);
    ((java.util.logging.Logger)(((com.moon.o7)(this)).getLogger())).info(((java.lang.String)(__sourceIntrinsic_f89bdeb6fe0f_invokedynamic151_15(23634, (2380025325712061761L ^ life2_3)))));
    com.viaversion.viabackwards.api.rewriters.TranslatableRewriter.loadTranslatables();
    life6_56 = ((com.viaversion.viaversion.api.ViaManager)(com.viaversion.viaversion.api.Via.getManager())).getProtocolManager();
    ((com.viaversion.viaversion.api.protocol.ProtocolManager)(life6_56)).registerProtocol(((com.viaversion.viaversion.api.protocol.Protocol)(new com.viaversion.viabackwards.protocol.protocol1_9_4to1_10.Protocol1_9_4To1_10())), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_9_3)), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_10)));
    ((com.viaversion.viaversion.api.protocol.ProtocolManager)(life6_56)).registerProtocol(((com.viaversion.viaversion.api.protocol.Protocol)(new com.viaversion.viabackwards.protocol.protocol1_10to1_11.Protocol1_10To1_11())), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_10)), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_11)));
    ((com.viaversion.viaversion.api.protocol.ProtocolManager)(life6_56)).registerProtocol(((com.viaversion.viaversion.api.protocol.Protocol)(new com.viaversion.viabackwards.protocol.protocol1_11to1_11_1.Protocol1_11To1_11_1())), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_11)), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_11_1)));
    ((com.viaversion.viaversion.api.protocol.ProtocolManager)(life6_56)).registerProtocol(((com.viaversion.viaversion.api.protocol.Protocol)(new com.viaversion.viabackwards.protocol.protocol1_11_1to1_12.Protocol1_11_1To1_12())), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_11_1)), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_12)));
    ((com.viaversion.viaversion.api.protocol.ProtocolManager)(life6_56)).registerProtocol(((com.viaversion.viaversion.api.protocol.Protocol)(new com.viaversion.viabackwards.protocol.protocol1_12to1_12_1.Protocol1_12To1_12_1())), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_12)), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_12_1)));
    ((com.viaversion.viaversion.api.protocol.ProtocolManager)(life6_56)).registerProtocol(((com.viaversion.viaversion.api.protocol.Protocol)(new com.viaversion.viabackwards.protocol.protocol1_12_1to1_12_2.Protocol1_12_1To1_12_2())), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_12_1)), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_12_2)));
    ((com.viaversion.viaversion.api.protocol.ProtocolManager)(life6_56)).registerProtocol(((com.viaversion.viaversion.api.protocol.Protocol)(new com.viaversion.viabackwards.protocol.protocol1_12_2to1_13.Protocol1_12_2To1_13())), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_12_2)), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_13)));
    ((com.viaversion.viaversion.api.protocol.ProtocolManager)(life6_56)).registerProtocol(((com.viaversion.viaversion.api.protocol.Protocol)(new com.viaversion.viabackwards.protocol.protocol1_13to1_13_1.Protocol1_13To1_13_1())), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_13)), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_13_1)));
    ((com.viaversion.viaversion.api.protocol.ProtocolManager)(life6_56)).registerProtocol(((com.viaversion.viaversion.api.protocol.Protocol)(new com.viaversion.viabackwards.protocol.protocol1_13_1to1_13_2.Protocol1_13_1To1_13_2())), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_13_1)), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_13_2)));
    ((com.viaversion.viaversion.api.protocol.ProtocolManager)(life6_56)).registerProtocol(((com.viaversion.viaversion.api.protocol.Protocol)(new com.viaversion.viabackwards.protocol.protocol1_13_2to1_14.Protocol1_13_2To1_14())), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_13_2)), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_14)));
    ((com.viaversion.viaversion.api.protocol.ProtocolManager)(life6_56)).registerProtocol(((com.viaversion.viaversion.api.protocol.Protocol)(new com.viaversion.viabackwards.protocol.protocol1_14to1_14_1.Protocol1_14To1_14_1())), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_14)), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_14_1)));
    ((com.viaversion.viaversion.api.protocol.ProtocolManager)(life6_56)).registerProtocol(((com.viaversion.viaversion.api.protocol.Protocol)(new com.viaversion.viabackwards.protocol.protocol1_14_1to1_14_2.Protocol1_14_1To1_14_2())), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_14_1)), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_14_2)));
    ((com.viaversion.viaversion.api.protocol.ProtocolManager)(life6_56)).registerProtocol(((com.viaversion.viaversion.api.protocol.Protocol)(new com.viaversion.viabackwards.protocol.protocol1_14_2to1_14_3.Protocol1_14_2To1_14_3())), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_14_2)), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_14_3)));
    ((com.viaversion.viaversion.api.protocol.ProtocolManager)(life6_56)).registerProtocol(((com.viaversion.viaversion.api.protocol.Protocol)(new com.viaversion.viabackwards.protocol.protocol1_14_3to1_14_4.Protocol1_14_3To1_14_4())), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_14_3)), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_14_4)));
    ((com.viaversion.viaversion.api.protocol.ProtocolManager)(life6_56)).registerProtocol(((com.viaversion.viaversion.api.protocol.Protocol)(new com.viaversion.viabackwards.protocol.protocol1_14_4to1_15.Protocol1_14_4To1_15())), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_14_4)), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_15)));
    ((com.viaversion.viaversion.api.protocol.ProtocolManager)(life6_56)).registerProtocol(((com.viaversion.viaversion.api.protocol.Protocol)(new com.viaversion.viabackwards.protocol.protocol1_15to1_15_1.Protocol1_15To1_15_1())), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_15)), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_15_1)));
    ((com.viaversion.viaversion.api.protocol.ProtocolManager)(life6_56)).registerProtocol(((com.viaversion.viaversion.api.protocol.Protocol)(new com.viaversion.viabackwards.protocol.protocol1_15_1to1_15_2.Protocol1_15_1To1_15_2())), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_15_1)), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_15_2)));
    ((com.viaversion.viaversion.api.protocol.ProtocolManager)(life6_56)).registerProtocol(((com.viaversion.viaversion.api.protocol.Protocol)(new com.viaversion.viabackwards.protocol.protocol1_15_2to1_16.Protocol1_15_2To1_16())), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_15_2)), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_16)));
    ((com.viaversion.viaversion.api.protocol.ProtocolManager)(life6_56)).registerProtocol(((com.viaversion.viaversion.api.protocol.Protocol)(new com.viaversion.viabackwards.protocol.protocol1_16to1_16_1.Protocol1_16To1_16_1())), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_16)), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_16_1)));
    ((com.viaversion.viaversion.api.protocol.ProtocolManager)(life6_56)).registerProtocol(((com.viaversion.viaversion.api.protocol.Protocol)(new com.viaversion.viabackwards.protocol.protocol1_16_1to1_16_2.Protocol1_16_1To1_16_2())), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_16_1)), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_16_2)));
    ((com.viaversion.viaversion.api.protocol.ProtocolManager)(life6_56)).registerProtocol(((com.viaversion.viaversion.api.protocol.Protocol)(new com.viaversion.viabackwards.protocol.protocol1_16_2to1_16_3.Protocol1_16_2To1_16_3())), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_16_2)), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_16_3)));
    ((com.viaversion.viaversion.api.protocol.ProtocolManager)(life6_56)).registerProtocol(((com.viaversion.viaversion.api.protocol.Protocol)(new com.viaversion.viabackwards.protocol.protocol1_16_3to1_16_4.Protocol1_16_3To1_16_4())), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_16_3)), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_16_4)));
    ((com.viaversion.viaversion.api.protocol.ProtocolManager)(life6_56)).registerProtocol(((com.viaversion.viaversion.api.protocol.Protocol)(new com.viaversion.viabackwards.protocol.protocol1_16_4to1_17.Protocol1_16_4To1_17())), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_16_4)), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_17)));
    ((com.viaversion.viaversion.api.protocol.ProtocolManager)(life6_56)).registerProtocol(((com.viaversion.viaversion.api.protocol.Protocol)(new com.viaversion.viabackwards.protocol.protocol1_17to1_17_1.Protocol1_17To1_17_1())), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_17)), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_17_1)));
    ((com.viaversion.viaversion.api.protocol.ProtocolManager)(life6_56)).registerProtocol(((com.viaversion.viaversion.api.protocol.Protocol)(new com.viaversion.viabackwards.protocol.protocol1_17_1to1_18.Protocol1_17_1To1_18())), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_17_1)), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_18)));
    ((com.viaversion.viaversion.api.protocol.ProtocolManager)(life6_56)).registerProtocol(((com.viaversion.viaversion.api.protocol.Protocol)(new com.viaversion.viabackwards.protocol.protocol1_18to1_18_2.Protocol1_18To1_18_2())), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_18)), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_18_2)));
    ((com.viaversion.viaversion.api.protocol.ProtocolManager)(life6_56)).registerProtocol(((com.viaversion.viaversion.api.protocol.Protocol)(new com.viaversion.viabackwards.protocol.protocol1_18_2to1_19.Protocol1_18_2To1_19())), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_18_2)), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_19)));
    ((com.viaversion.viaversion.api.protocol.ProtocolManager)(life6_56)).registerProtocol(((com.viaversion.viaversion.api.protocol.Protocol)(new com.viaversion.viabackwards.protocol.protocol1_19to1_19_1.Protocol1_19To1_19_1())), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_19)), ((com.viaversion.viaversion.api.protocol.version.ProtocolVersion)(com.viaversion.viaversion.api.protocol.version.ProtocolVersion.v1_19_1)));
    }
    return;
}


public java.util.logging.Logger getLogger() {
return ((com.moon.o4)(com.moon.o4.a__o4())).a__Logger();
}


public void disable() {
return;
}


public java.io.File getDataFolder() {
long local1_life2 = (com.moon.o7.b ^ 79168956434098L);
    return new java.io.File(this.a, __sourceIntrinsic_db85b8ae914a_originalDynamicSite209_5(356, (6325298210162348207L ^ local1_life2)));
}


public boolean isOutdated() {
return ((0) != 0);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_104e450725fe4e20_invokedynamic210009_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_db85b8ae914a_originalDynamicSite209_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_f89bdeb6fe0f_invokedynamic151_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_f89bdeb6fe0f_invokedynamic151_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_f89bdeb6fe0f_invokedynamic151_15(int a0, long a1) throws E;
}
