package com.moon;


class q2 extends org.luaj.vm2.lib.VarArgFunction {

com.moon.jJ a;

private static long b;

private static java.lang.String[] c;

private static java.lang.String[] d;

private static java.util.Map e;

private static long f;

public org.luaj.vm2.Varargs invoke(org.luaj.vm2.Varargs p0) { return __sourceHandlerCall_c02680bee3668917591c(this, p0); }


q2(com.moon.jJ p0) { super(); }

private static void __sourceConstructorBody_1b75330d8a6c391c(com.moon.q2 receiver, com.moon.jJ p0) throws Throwable {
((com.moon.q2)(receiver)).a = ((com.moon.jJ)(p0));
    com.moon.q2.__sourceConstructorInit_1b75330d8a6c391c_0(((com.moon.q2)(receiver)));
    return;
}


static {
javax.crypto.Cipher forestValue136_36_0;
    int forestValue136_36_1;
    javax.crypto.SecretKeyFactory forestValue136_36_2;
    byte[] forestValue136_36_3;
    javax.crypto.Cipher forestValue136_53_0;
    int forestValue136_53_1;
    javax.crypto.SecretKeyFactory forestValue136_53_2;
    byte[] forestValue136_53_3;
    java.lang.String forestValue136_86_0;
    int forestValue136_86_1;
    java.lang.String forestValue136_98_0;
    java.lang.String forestValue136_122_0;
    javax.crypto.Cipher forestValue136_177_0;
    int forestValue136_177_1;
    javax.crypto.SecretKeyFactory forestValue136_177_2;
    byte[] forestValue136_177_3;
    javax.crypto.Cipher forestValue136_194_0;
    int forestValue136_194_1;
    javax.crypto.SecretKeyFactory forestValue136_194_2;
    byte[] forestValue136_194_3;
    javax.crypto.Cipher spill136_0;
    int spill136_1;
    javax.crypto.SecretKeyFactory spill136_2;
    byte[] spill136_3;
    byte[] spill136_4;
    java.lang.String spill136_5;
    int spill136_6;
    java.lang.String spill136_7;
    java.lang.String[] spill136_8;
    java.lang.String[] spill136_9;
    java.lang.String spill136_10;
    java.lang.String spill136_11;
    int spill136_12;
    javax.crypto.Cipher spill136_13;
    int spill136_14;
    javax.crypto.SecretKeyFactory spill136_15;
    byte[] spill136_16;
    byte[] spill136_17;
    int spill136_18;
    long spill136_19;
    byte[] spill136_20;
    byte[] spill136_21;
    byte[] spill136_22;
    byte[] spill136_23;
    byte[] spill136_24;
    byte[] spill136_25;
    byte[] spill136_26;
    byte[] spill136_27;
    long spill136_28;
    int spill136_29;
    long life5_16;
    javax.crypto.Cipher life7_20;
    int life8_35;
    java.lang.String[] life14_66;
    int life12_68;
    java.lang.String life11_71;
    int life13_73;
    int life10_75;
    int life9_77;
    byte[] life15_93;
    javax.crypto.Cipher life0_164;
    int life1_179;
    long life2_213;
    byte[] life4_281;
    forest_join_194: {
    forest_join_153: {
    forest_join_53: {
    b = ((long)(((moom._a)(moom._c.a(((long)(6003174736863625663L)), ((long)(-4448374952831427635L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(182430081335712L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    life5_16 = (com.moon.q2.b ^ 123294572464001L);
    spill136_0 = (life7_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill136_1 = 2;
    spill136_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp136_9_0 = new byte[8];
    spill136_3 = __stackOp136_9_0;
    (__stackOp136_9_0)[0] = ((byte) ((int) (life5_16 >>> 56)));
    life8_35 = 1;
    forestValue136_36_0 = spill136_0;
    forestValue136_36_1 = spill136_1;
    forestValue136_36_2 = spill136_2;
    forestValue136_36_3 = spill136_3;
    forest_cycle_36: while (true) {
    if (!((life8_35 < 8))) {
        forestValue136_53_0 = forestValue136_36_0;
        forestValue136_53_1 = forestValue136_36_1;
        forestValue136_53_2 = forestValue136_36_2;
        forestValue136_53_3 = forestValue136_36_3;
        break forest_join_53;
    }
    byte[] __stackOp136_10_0 = forestValue136_36_3;
    spill136_4 = __stackOp136_10_0;
    (__stackOp136_10_0)[life8_35] = ((byte) ((int) ((life5_16 << (life8_35 * 8)) >>> 56)));
    life8_35 += 1;
    forestValue136_36_3 = spill136_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue136_53_0)).init(((int)(forestValue136_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue136_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue136_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life14_66 = new java.lang.String[6];
    life12_68 = 0;
    life13_73 = ((java.lang.String)((life11_71 = "c\001;Êì¤g\035\001\016ñù¤drk+ÝaÀFÿ\035á:»ÿ\003rÔÏ¬ó\034%\"¯6Mãé~n *KONÞ»/q0^\017\017\177äõso¯tê\\bUþ!¿ýÐ¢iL¯,\024<°#Aø­Å, Ìrè\031ó§/0íÝBµ_sÐÕã#ª\025Ø¼µSzï¾\024Î*+²Z÷\017¨¡Ô\000ôÉÿ\013ãÒ3ò0h§'ëg­º`\"H7\035>Ã:\\ò×É*q{ÿ?¢\027ÛÉ³\003G°+\035S,\035ÀÉ.=³¨\021"))).length();
    life10_75 = 56;
    life9_77 = -1;
    forest_cycle_78: while (true) {
    forest_join_148: {
    life9_77 += 1;
    spill136_5 = life11_71;
    int __stackOp136_14_0 = life9_77;
    forestValue136_86_0 = ((java.lang.String)(spill136_5)).substring(((int)(__stackOp136_14_0)), ((int)((__stackOp136_14_0 + life10_75))));
    forestValue136_86_1 = -1;
    forest_cycle_86: while (true) {
    forest_join_139: {
    forest_join_122: {
    forest_join_112: {
    forest_join_98: {
    java.lang.String __stackOp136_16_0 = forestValue136_86_0;
    int __stackOp136_16_1 = forestValue136_86_1;
    spill136_6 = __stackOp136_16_1;
    byte[] __stackOp136_18_0 = ((java.lang.String)(__stackOp136_16_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp136_18_1 = life7_20;
    life15_93 = ((javax.crypto.Cipher)(__stackOp136_18_1)).doFinal(((byte[])(__stackOp136_18_0)));
    int __stackOp136_22_0 = spill136_6;
    java.lang.String __stackOp136_22_1 = ((java.lang.String)(com.moon.q2.a(((byte[])(life15_93))))).intern();
    spill136_7 = __stackOp136_22_1;
    switch (__stackOp136_22_0) {
default:
{
        forestValue136_98_0 = spill136_7;
        break forest_join_98;
    }
case 0:
{
        forestValue136_122_0 = spill136_7;
        break forest_join_122;
    }
}
    }
    java.lang.String __stackOp136_23_0 = forestValue136_98_0;
    java.lang.String[] __stackOp136_23_1 = life14_66;
    spill136_8 = __stackOp136_23_1;
    java.lang.String __stackOp136_24_0 = __stackOp136_23_0;
    int __stackOp136_24_1 = (life12_68++);
    (spill136_8)[__stackOp136_24_1] = __stackOp136_24_0;
    if (!(((life9_77 = (life9_77 + life10_75)) < life13_73))) {
        break forest_join_112;
    }
    break forest_join_148;
    }
    life13_73 = ((java.lang.String)((life11_71 = "³s)ö7¢xMYÈñ´pô<G&;eEäñ\003ØR®å\007»ââÜÁ\006¤cv·[¦H-§æ¤8ÜÅ#¼òaáÊ¹++\177¿Ç\017i9\025\021úz\\j\005Óc(ÅÚÉKñ\032ð=\b®v8Ê\026¤Å\020dhàÉv«"))).length();
    life10_75 = 56;
    life9_77 = -1;
    break forest_join_139;
    }
    java.lang.String __stackOp136_26_0 = forestValue136_122_0;
    java.lang.String[] __stackOp136_26_1 = life14_66;
    spill136_9 = __stackOp136_26_1;
    java.lang.String __stackOp136_27_0 = __stackOp136_26_0;
    int __stackOp136_27_1 = (life12_68++);
    (spill136_9)[__stackOp136_27_1] = __stackOp136_27_0;
    if (!(((life9_77 = (life9_77 + life10_75)) < life13_73))) {
        break forest_join_153;
    }
    life10_75 = ((int)(((java.lang.String)(life11_71)).charAt(((int)(life9_77)))));
    }
    life9_77 += 1;
    spill136_10 = life11_71;
    int __stackOp136_30_0 = life9_77;
    spill136_11 = ((java.lang.String)(spill136_10)).substring(((int)(__stackOp136_30_0)), ((int)((__stackOp136_30_0 + life10_75))));
    spill136_12 = 0;
    forestValue136_86_0 = spill136_11;
    forestValue136_86_1 = spill136_12;
    continue forest_cycle_86;
    }
    }
    life10_75 = ((int)(((java.lang.String)(life11_71)).charAt(((int)(life9_77)))));
    continue forest_cycle_78;
    }
    }
    c = ((java.lang.String[])(life14_66));
    d = ((java.lang.String[])(new java.lang.String[6]));
    spill136_13 = (life0_164 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill136_14 = 2;
    spill136_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp136_38_0 = new byte[8];
    spill136_16 = __stackOp136_38_0;
    (__stackOp136_38_0)[0] = ((byte) ((int) (life5_16 >>> 56)));
    life1_179 = 1;
    forestValue136_177_0 = spill136_13;
    forestValue136_177_1 = spill136_14;
    forestValue136_177_2 = spill136_15;
    forestValue136_177_3 = spill136_16;
    forest_cycle_177: while (true) {
    if (!((life1_179 < 8))) {
        forestValue136_194_0 = forestValue136_177_0;
        forestValue136_194_1 = forestValue136_177_1;
        forestValue136_194_2 = forestValue136_177_2;
        forestValue136_194_3 = forestValue136_177_3;
        break forest_join_194;
    }
    byte[] __stackOp136_39_0 = forestValue136_177_3;
    spill136_17 = __stackOp136_39_0;
    (__stackOp136_39_0)[life1_179] = ((byte) ((int) ((life5_16 << (life1_179 * 8)) >>> 56)));
    life1_179 += 1;
    forestValue136_177_3 = spill136_17;
    continue forest_cycle_177;
    }
    }
    ((javax.crypto.Cipher)(forestValue136_194_0)).init(((int)(forestValue136_194_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue136_194_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue136_194_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long __stackOp136_42_0 = 6355251986242325074L;
    int __stackOp136_42_1 = -1;
    spill136_18 = __stackOp136_42_1;
    spill136_19 = __stackOp136_42_0;
    recovery.source.CarrierOps.discard(__stackOp136_42_1);
    life2_213 = spill136_19;
    byte[] __stackOp136_44_0 = new byte[8];
    spill136_20 = __stackOp136_44_0;
    (__stackOp136_44_0)[0] = ((byte) ((int) (life2_213 >>> 56)));
    byte[] __stackOp136_45_0 = spill136_20;
    spill136_21 = __stackOp136_45_0;
    (__stackOp136_45_0)[1] = ((byte) ((int) (life2_213 >>> 48)));
    byte[] __stackOp136_46_0 = spill136_21;
    spill136_22 = __stackOp136_46_0;
    (__stackOp136_46_0)[2] = ((byte) ((int) (life2_213 >>> 40)));
    byte[] __stackOp136_47_0 = spill136_22;
    spill136_23 = __stackOp136_47_0;
    (__stackOp136_47_0)[3] = ((byte) ((int) (life2_213 >>> 32)));
    byte[] __stackOp136_48_0 = spill136_23;
    spill136_24 = __stackOp136_48_0;
    (__stackOp136_48_0)[4] = ((byte) ((int) (life2_213 >>> 24)));
    byte[] __stackOp136_49_0 = spill136_24;
    spill136_25 = __stackOp136_49_0;
    (__stackOp136_49_0)[5] = ((byte) ((int) (life2_213 >>> 16)));
    byte[] __stackOp136_50_0 = spill136_25;
    spill136_26 = __stackOp136_50_0;
    (__stackOp136_50_0)[6] = ((byte) ((int) (life2_213 >>> 8)));
    byte[] __stackOp136_51_0 = spill136_26;
    spill136_27 = __stackOp136_51_0;
    (__stackOp136_51_0)[7] = ((byte) ((int) life2_213));
    byte[] __stackOp136_52_0 = spill136_27;
    javax.crypto.Cipher __stackOp136_52_1 = life0_164;
    life4_281 = ((javax.crypto.Cipher)(__stackOp136_52_1)).doFinal(((byte[])(__stackOp136_52_0)));
    int __stackOp136_54_0 = spill136_18;
    long __stackOp136_54_1 = (((((((((((long) (life4_281)[0]) & 255L) << 56) | ((((long) (life4_281)[1]) & 255L) << 48)) | ((((long) (life4_281)[2]) & 255L) << 40)) | ((((long) (life4_281)[3]) & 255L) << 32)) | ((((long) (life4_281)[4]) & 255L) << 24)) | ((((long) (life4_281)[5]) & 255L) << 16)) | ((((long) (life4_281)[6]) & 255L) << 8)) | (((long) (life4_281)[7]) & 255L));
    spill136_28 = __stackOp136_54_1;
    spill136_29 = __stackOp136_54_0;
    recovery.source.CarrierOps.discard(__stackOp136_54_1);
    recovery.source.CarrierOps.discard(spill136_29);
    f = ((long)(spill136_28));
}

private static native <E extends Throwable> void __sourceConstructorInit_1b75330d8a6c391c_0(com.moon.q2 a0) throws E;
private static native <E extends Throwable> java.lang.String __sourceHandlerCall_4d197ddefe6b5c03260c(int a0, long a1) throws E;
private static final class __SourceHandler_4d197ddefe6b5c03260c {

public static java.lang.String f128(int p0, long p1) throws Throwable {
    int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 19097);
    if (((__fieldRead128_0())[life5_8] == null)) {
        life3_16 = __call128_3(__call128_2(__call128_1()));
        life4_21 = __cast128_6(__call128_5(__fieldRead128_4(), life3_16));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = __call128_7("DES/CBC/PKCS5Padding");
        (life4_21)[1] = __call128_8("DES");
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        __call128_10(__fieldRead128_9(), life3_16, life4_21);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_63: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = __call128_12(__cast128_11((life4_21)[1]), life7_92);
        __call128_15(__cast128_13((life4_21)[0]), 2, life8_99, __cast128_14((life4_21)[2]));
        life9_116 = __call128_17((__fieldRead128_16())[life5_8], "ISO-8859-1");
        (__fieldRead128_18())[life5_8] = __call128_21(__call128_20(__cast128_19((life4_21)[0]), life9_116));
    }
    return (__fieldRead128_22())[life5_8];
}
public static java.lang.String h128_0(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    throw new java.lang.RuntimeException("com/moon/q2", local1);
}
private static native java.lang.String[] __fieldRead128_0() throws Throwable;
private static native java.lang.Thread __call128_1() throws Throwable;
private static native long __call128_2(java.lang.Thread a0) throws Throwable;
private static native java.lang.Long __call128_3(long a0) throws Throwable;
private static native java.util.Map __fieldRead128_4() throws Throwable;
private static native java.lang.Object __call128_5(java.util.Map a0, java.lang.Long a1) throws Throwable;
private static native java.lang.Object[] __cast128_6(java.lang.Object a0) throws Throwable;
private static native javax.crypto.Cipher __call128_7(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call128_8(java.lang.String a0) throws Throwable;
private static native java.util.Map __fieldRead128_9() throws Throwable;
private static native java.lang.Object __call128_10(java.util.Map a0, java.lang.Long a1, java.lang.Object[] a2) throws Throwable;
private static native javax.crypto.SecretKeyFactory __cast128_11(java.lang.Object a0) throws Throwable;
private static native javax.crypto.SecretKey __call128_12(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native javax.crypto.Cipher __cast128_13(java.lang.Object a0) throws Throwable;
private static native javax.crypto.spec.IvParameterSpec __cast128_14(java.lang.Object a0) throws Throwable;
private static native void __call128_15(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native java.lang.String[] __fieldRead128_16() throws Throwable;
private static native byte[] __call128_17(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String[] __fieldRead128_18() throws Throwable;
private static native javax.crypto.Cipher __cast128_19(java.lang.Object a0) throws Throwable;
private static native byte[] __call128_20(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native java.lang.String __call128_21(byte[] a0) throws Throwable;
private static native java.lang.String[] __fieldRead128_22() throws Throwable;

}

private static native <E extends Throwable> java.lang.invoke.CallSite __sourceHandlerCall_42535653b3bf6bba8465(java.lang.invoke.MethodHandles.Lookup a0, java.lang.String a1, java.lang.invoke.MethodType a2) throws E;
private static final class __SourceHandler_42535653b3bf6bba8465 {

public static java.lang.invoke.CallSite f129(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.invoke.MutableCallSite life3_4;
    life3_4 = new java.lang.invoke.MutableCallSite(p2);
    java.lang.invoke.MutableCallSite spill129_0 = life3_4;
    java.lang.invoke.MethodHandle spill129_1 = __call129_3(__methodHandleLiteral129_0(), __classLiteral129_1(), __call129_2(p2));
    int spill129_2 = 0;
    java.lang.Object[] __stackOp129_4_0 = new java.lang.Object[3];
    java.lang.Object[] spill129_3 = __stackOp129_4_0;
    (__stackOp129_4_0)[0] = p0;
    java.lang.Object[] __stackOp129_5_0 = spill129_3;
    java.lang.Object[] spill129_4 = __stackOp129_5_0;
    (__stackOp129_5_0)[1] = life3_4;
    java.lang.Object[] __stackOp129_6_0 = spill129_4;
    java.lang.Object[] spill129_5 = __stackOp129_6_0;
    (__stackOp129_6_0)[2] = p1;
    __call129_9(spill129_0, __call129_8(__call129_7(spill129_1, spill129_2, spill129_5), p2));
    return life3_4;
}
public static java.lang.invoke.CallSite h129_0(java.lang.Exception p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.Exception local3 = p0;
    throw new java.lang.RuntimeException(__call2012900_6(__call2012900_5(__call2012900_3(__call2012900_2(__call2012900_1(__call2012900_0(new java.lang.StringBuilder(), "com/moon/q2"), " : "), p1), " : "), __call2012900_4(p2))), local3);
}
private static native java.lang.invoke.MethodHandle __methodHandleLiteral129_0() throws Throwable;
private static native java.lang.Object __classLiteral129_1() throws Throwable;
private static native int __call129_2(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.invoke.MethodHandle __call129_3(java.lang.invoke.MethodHandle a0, java.lang.Object a1, int a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call129_7(java.lang.invoke.MethodHandle a0, int a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call129_8(java.lang.invoke.MethodHandle a0, java.lang.invoke.MethodType a1) throws Throwable;
private static native void __call129_9(java.lang.invoke.MutableCallSite a0, java.lang.invoke.MethodHandle a1) throws Throwable;
private static native java.lang.StringBuilder __call2012900_0(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2012900_1(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2012900_2(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2012900_3(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2012900_4(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.StringBuilder __call2012900_5(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2012900_6(java.lang.StringBuilder a0) throws Throwable;

}

private static native <E extends Throwable> org.luaj.vm2.Varargs __sourceHandlerCall_c02680bee3668917591c(com.moon.q2 a0, org.luaj.vm2.Varargs a1) throws E;
private static final class __SourceHandler_c02680bee3668917591c {

public static org.luaj.vm2.Varargs f165(com.moon.q2 receiver, org.luaj.vm2.Varargs p0) throws Throwable {
    int forestValue165_49_0;
    int forestValue165_65_0;
    int forestValue165_81_0;
    int forestValue165_97_0;
    int forestValue165_115_0;
    org.luaj.vm2.LuaValue forestValue165_143_0;
    java.lang.String[] spill165_0;
    boolean spill165_1;
    org.luaj.vm2.LuaValue spill165_2;
    com.moon.scripting.api.types.templates.RoundedRectTemplate spill165_3;
    long life2_3;
    org.luaj.vm2.LuaValue life5_7;
    org.luaj.vm2.LuaValue life6_11;
    org.luaj.vm2.LuaValue life7_16;
    java.lang.String[] life4_17;
    org.luaj.vm2.LuaValue life8_21;
    org.luaj.vm2.LuaValue life9_25;
    org.luaj.vm2.LuaValue life10_30;
    forest_join_143: {
    forest_join_127: {
    forest_join_115: {
    forest_join_111: {
    forest_join_97: {
    forest_join_95: {
    forest_join_81: {
    forest_join_79: {
    forest_join_65: {
    forest_join_63: {
    forest_join_49: {
    forest_join_47: {
    life2_3 = (__fieldRead165_0() ^ 132484918079610L);
    life5_7 = __call165_1(p0, 1);
    life6_11 = __call165_2(p0, 2);
    spill165_0 = __call165_3();
    life7_16 = __call165_4(p0, 3);
    life4_17 = spill165_0;
    life8_21 = __call165_5(p0, 4);
    life9_25 = __call165_6(p0, 5);
    life10_30 = __call165_8(p0, ((int) __fieldRead165_7()));
    spill165_1 = __call165_9(life5_7);
    if (!((life4_17 != null))) {
        forestValue165_49_0 = __integerCategory165_10(spill165_1);
        break forest_join_49;
    }
    if (!((!spill165_1))) {
        break forest_join_47;
    }
    java.lang.String __stackOp165_13_0 = __call165_11(life5_7);
    java.lang.String __stackOp165_13_1 = __invokedynamic165_12(30164, (4704476047381196127L ^ life2_3));
    return __call165_15(__invokedynamic165_14(__stackOp165_13_1, __stackOp165_13_0));
    }
    forestValue165_49_0 = __integerCategory165_17(__call165_16(life6_11));
    }
    if (!((life4_17 != null))) {
        forestValue165_65_0 = forestValue165_49_0;
        break forest_join_65;
    }
    if (!((forestValue165_49_0 == 0))) {
        break forest_join_63;
    }
    java.lang.String __stackOp165_20_0 = __call165_18(life6_11);
    java.lang.String __stackOp165_20_1 = __invokedynamic165_19(22191, (5060712497333620257L ^ life2_3));
    return __call165_22(__invokedynamic165_21(__stackOp165_20_1, __stackOp165_20_0));
    }
    forestValue165_65_0 = __integerCategory165_24(__call165_23(life7_16));
    }
    if (!((life4_17 != null))) {
        forestValue165_81_0 = forestValue165_65_0;
        break forest_join_81;
    }
    if (!((forestValue165_65_0 == 0))) {
        break forest_join_79;
    }
    java.lang.String __stackOp165_27_0 = __call165_25(life7_16);
    java.lang.String __stackOp165_27_1 = __invokedynamic165_26(29218, (4078904394878282413L ^ life2_3));
    return __call165_29(__invokedynamic165_28(__stackOp165_27_1, __stackOp165_27_0));
    }
    forestValue165_81_0 = __integerCategory165_31(__call165_30(life8_21));
    }
    if (!((life4_17 != null))) {
        forestValue165_97_0 = forestValue165_81_0;
        break forest_join_97;
    }
    if (!((forestValue165_81_0 == 0))) {
        break forest_join_95;
    }
    java.lang.String __stackOp165_34_0 = __call165_32(life8_21);
    java.lang.String __stackOp165_34_1 = __invokedynamic165_33(7769, (8062069503039768272L ^ life2_3));
    return __call165_36(__invokedynamic165_35(__stackOp165_34_1, __stackOp165_34_0));
    }
    forestValue165_97_0 = __integerCategory165_38(__call165_37(life9_25));
    }
    if (!((life4_17 != null))) {
        forestValue165_115_0 = forestValue165_97_0;
        break forest_join_115;
    }
    if (!((forestValue165_97_0 == 0))) {
        break forest_join_111;
    }
    java.lang.String __stackOp165_41_0 = __call165_39(life9_25);
    java.lang.String __stackOp165_41_1 = __invokedynamic165_40(1781, (1756247590855155325L ^ life2_3));
    return __call165_43(__invokedynamic165_42(__stackOp165_41_1, __stackOp165_41_0));
    }
    spill165_2 = life10_30;
    if (!((life4_17 != null))) {
        forestValue165_143_0 = spill165_2;
        break forest_join_143;
    }
    forestValue165_115_0 = __integerCategory165_45(__call165_44(spill165_2));
    }
    if (!((forestValue165_115_0 == 0))) {
        break forest_join_127;
    }
    java.lang.String __stackOp165_48_0 = __call165_46(life10_30);
    java.lang.String __stackOp165_48_1 = __invokedynamic165_47(6910, (6179187874510930548L ^ life2_3));
    return __call165_50(__invokedynamic165_49(__stackOp165_48_1, __stackOp165_48_0));
    }
    com.moon.scripting.api.types.templates.RoundedRectTemplate __stackOp165_52_0 = __sourceUninitializedNEW165_51();
    spill165_3 = __stackOp165_52_0;
    __explicitNewInit165_59(__stackOp165_52_0, __call165_53(life5_7), __call165_54(life6_11), __call165_55(life7_16), __call165_56(life8_21), __call165_57(life9_25), __call165_58(life10_30));
    forestValue165_143_0 = __call165_60(spill165_3);
    }
    return forestValue165_143_0;
}
private static native long __fieldRead165_0() throws Throwable;
private static native org.luaj.vm2.LuaValue __call165_1(org.luaj.vm2.Varargs a0, int a1) throws Throwable;
private static native org.luaj.vm2.LuaValue __call165_2(org.luaj.vm2.Varargs a0, int a1) throws Throwable;
private static native java.lang.String[] __call165_3() throws Throwable;
private static native org.luaj.vm2.LuaValue __call165_4(org.luaj.vm2.Varargs a0, int a1) throws Throwable;
private static native org.luaj.vm2.LuaValue __call165_5(org.luaj.vm2.Varargs a0, int a1) throws Throwable;
private static native org.luaj.vm2.LuaValue __call165_6(org.luaj.vm2.Varargs a0, int a1) throws Throwable;
private static native long __fieldRead165_7() throws Throwable;
private static native org.luaj.vm2.LuaValue __call165_8(org.luaj.vm2.Varargs a0, int a1) throws Throwable;
private static native boolean __call165_9(org.luaj.vm2.LuaValue a0) throws Throwable;
private static native int __integerCategory165_10(boolean value) throws Throwable;
private static native java.lang.String __call165_11(org.luaj.vm2.LuaValue a0) throws Throwable;
private static native java.lang.String __invokedynamic165_12(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic165_14(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native org.luaj.vm2.LuaValue __call165_15(java.lang.String a0) throws Throwable;
private static native boolean __call165_16(org.luaj.vm2.LuaValue a0) throws Throwable;
private static native int __integerCategory165_17(boolean value) throws Throwable;
private static native java.lang.String __call165_18(org.luaj.vm2.LuaValue a0) throws Throwable;
private static native java.lang.String __invokedynamic165_19(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic165_21(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native org.luaj.vm2.LuaValue __call165_22(java.lang.String a0) throws Throwable;
private static native boolean __call165_23(org.luaj.vm2.LuaValue a0) throws Throwable;
private static native int __integerCategory165_24(boolean value) throws Throwable;
private static native java.lang.String __call165_25(org.luaj.vm2.LuaValue a0) throws Throwable;
private static native java.lang.String __invokedynamic165_26(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic165_28(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native org.luaj.vm2.LuaValue __call165_29(java.lang.String a0) throws Throwable;
private static native boolean __call165_30(org.luaj.vm2.LuaValue a0) throws Throwable;
private static native int __integerCategory165_31(boolean value) throws Throwable;
private static native java.lang.String __call165_32(org.luaj.vm2.LuaValue a0) throws Throwable;
private static native java.lang.String __invokedynamic165_33(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic165_35(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native org.luaj.vm2.LuaValue __call165_36(java.lang.String a0) throws Throwable;
private static native boolean __call165_37(org.luaj.vm2.LuaValue a0) throws Throwable;
private static native int __integerCategory165_38(boolean value) throws Throwable;
private static native java.lang.String __call165_39(org.luaj.vm2.LuaValue a0) throws Throwable;
private static native java.lang.String __invokedynamic165_40(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic165_42(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native org.luaj.vm2.LuaValue __call165_43(java.lang.String a0) throws Throwable;
private static native boolean __call165_44(org.luaj.vm2.LuaValue a0) throws Throwable;
private static native int __integerCategory165_45(boolean value) throws Throwable;
private static native java.lang.String __call165_46(org.luaj.vm2.LuaValue a0) throws Throwable;
private static native java.lang.String __invokedynamic165_47(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic165_49(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native org.luaj.vm2.LuaValue __call165_50(java.lang.String a0) throws Throwable;
private static native com.moon.scripting.api.types.templates.RoundedRectTemplate __sourceUninitializedNEW165_51() throws Throwable;
private static native float __call165_53(org.luaj.vm2.LuaValue a0) throws Throwable;
private static native float __call165_54(org.luaj.vm2.LuaValue a0) throws Throwable;
private static native float __call165_55(org.luaj.vm2.LuaValue a0) throws Throwable;
private static native float __call165_56(org.luaj.vm2.LuaValue a0) throws Throwable;
private static native float __call165_57(org.luaj.vm2.LuaValue a0) throws Throwable;
private static native int __call165_58(org.luaj.vm2.LuaValue a0) throws Throwable;
private static native void __explicitNewInit165_59(com.moon.scripting.api.types.templates.RoundedRectTemplate a0, float a1, float a2, float a3, float a4, float a5, int a6) throws Throwable;
private static native org.luaj.vm2.LuaValue __call165_60(com.moon.scripting.api.types.templates.RoundedRectTemplate a0) throws Throwable;

}


private static java.lang.String a(int p0, long p1) { return __sourceHandlerCall_4d197ddefe6b5c03260c(p0, p1); }


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.q2.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) { return __sourceHandlerCall_42535653b3bf6bba8465(p0, p1, p2); }


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
        byte[] spill1242_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1242_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1242_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1242_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1242_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1242_2)[life4_9];
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


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic165_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic165_14(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic165_19(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic165_21(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic165_26(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic165_28(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic165_33(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic165_35(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic165_40(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic165_42(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic165_47(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic165_49(java.lang.String a0, java.lang.String a1) throws E;
}
