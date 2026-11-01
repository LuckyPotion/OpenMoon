package com.moon;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class mK extends com.moon.mA {

private com.moon.setting.StringListSetting h;

private com.moon.nX s;

private boolean t;

private java.util.Map<java.lang.String, com.moon.nX> u;

private java.util.Map<java.lang.String, com.moon.nX> v;

private boolean w;

private int x;

private java.lang.String y;

private boolean z;

private boolean A;

private long B;

private boolean C;

private static long E;

private static java.lang.String[] F;

private static java.lang.String[] G;

private static java.util.Map H;

private static long[] I;

private static java.lang.Integer[] J;

private static java.util.Map K;

private static long[] L;

private static java.lang.Long[] M;

private static java.util.Map N;

public mK(com.moon.setting.StringListSetting p0, float p1, float p2, float p3, float p4) { super(); }

private static void __sourceConstructorBody_5d3db1b2bd48b749(com.moon.mK receiver, com.moon.setting.StringListSetting p0, float p1, float p2, float p3, float p4) throws Throwable {
init_join_71: {
    long local6_life2 = (com.moon.mK.E ^ 18401997424287L);
    boolean __sourceSpill131_4 = com.moon.mN.e__Boolean();
    com.moon.mK.__sourceConstructorInit_5d3db1b2bd48b749_0(((com.moon.mK)(receiver)));
    ((com.moon.mK)(receiver)).s = ((com.moon.nX)(new com.moon.nX()));
    ((com.moon.mK)(receiver)).u = ((java.util.Map)(new java.util.HashMap()));
    ((com.moon.mK)(receiver)).v = ((java.util.Map)(new java.util.HashMap()));
    ((com.moon.mK)(receiver)).w = ((boolean)(false));
    ((com.moon.mK)(receiver)).x = ((int)(0));
    boolean local8_life11 = __sourceSpill131_4;
    ((com.moon.mK)(receiver)).y = ((java.lang.String)(""));
    ((com.moon.mK)(receiver)).C = ((boolean)(false));
    ((com.moon.mK)(receiver)).h = ((com.moon.setting.StringListSetting)(p0));
    ((com.moon.mK)(receiver)).e = ((float)(p1));
    ((com.moon.mK)(receiver)).f = ((float)(p2));
    ((com.moon.mK)(receiver)).g = ((float)(p3));
    ((com.moon.mK)(receiver)).i = ((float)(p4));
    java.util.Iterator local9_life21 = ((java.util.List)(((com.moon.setting.StringListSetting)(p0)).getValues())).iterator();
    init_cycle_54: while (true) {
    if (!(((java.util.Iterator)(local9_life21)).hasNext())) {
        break init_join_71;
    }
    java.lang.String local10_life25 = ((java.lang.String)(((java.util.Iterator)(local9_life21)).next()));
    ((java.util.Map)(((com.moon.mK)(receiver)).u)).put(((java.lang.Object)(local10_life25)), ((java.lang.Object)(new com.moon.nX())));
    if (!((!local8_life11))) { continue init_cycle_54; }
    break init_cycle_54;
    }
    }
    return;
}


static {
E = ((long)(((moom._a)(moom._c.a(((long)(-2406207660648147273L)), ((long)(2055947602095291045L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(141706900488667L)))));
    H = ((java.util.Map)(new java.util.HashMap(13)));
    long local22_life7 = (com.moon.mK.E ^ 23868934822709L);
    javax.crypto.Cipher local24_life9;
    javax.crypto.Cipher __sourceSpill243_11 = (local24_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill243_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill243_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill243_14 = new byte[8];
    (__sourceSpill243_14)[0] = ((byte) ((int) (local22_life7 >>> 56)));
    int local25_life15 = 1;
    while ((local25_life15 < 8)) {
        (__sourceSpill243_14)[local25_life15] = ((byte) ((int) ((local22_life7 << (local25_life15 * 8)) >>> 56)));
        local25_life15 += 1;
    }
    byte[] __sourcePreallocation243_16 = __sourceSpill243_14;
    ((javax.crypto.Cipher)(__sourceSpill243_11)).init(((int)(__sourceSpill243_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill243_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation243_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local31_life19 = new java.lang.String[2];
    int local29_life20 = 0;
    java.lang.String local28_life21;
    int local30_life23 = ((java.lang.String)((local28_life21 = "\005²Kyxø¾G$D£¡ëeS#Û×î\035PÀè>#\b\022ËÒR)­¦Odb®\037Î\bý\t[\005MÂI\003~<$X-\022ß#\036\027ª¥`áÛ¥¹ú©¤\036Jê\001´Ø¬ûi\"ºË¢î0\rîÓ."))).length();
    int local27_life24 = 24;
    int local26_life25 = -1;
    while (true) {
        local26_life25 += 1;
        byte[] __sourceSpill243_28 = ((java.lang.String)(((java.lang.String)(local28_life21)).substring(((int)(local26_life25)), ((int)((local26_life25 + local27_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill243_29 = local24_life9;
        byte[] local32_life31 = ((javax.crypto.Cipher)(__sourceSpill243_29)).doFinal(((byte[])(__sourceSpill243_28)));
        java.lang.String __sourceSpill243_34 = ((java.lang.String)(com.moon.mK.a(((byte[])(local32_life31))))).intern();
        java.lang.String[] __sourceSpill243_35 = local31_life19;
        int __sourceSpill243_36 = local29_life20;
        local29_life20 += 1;
        (__sourceSpill243_35)[__sourceSpill243_36] = __sourceSpill243_34;
        if (!(((local26_life25 = (local26_life25 + local27_life24)) < local30_life23))) { break; }
        local27_life24 = ((java.lang.String)(local28_life21)).charAt(((int)(local26_life25)));
    }
    F = ((java.lang.String[])(local31_life19));
    G = ((java.lang.String[])(new java.lang.String[2]));
    K = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local11_life42;
    javax.crypto.Cipher __sourceSpill243_44 = (local11_life42 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill243_45 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill243_46 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill243_47 = new byte[8];
    (__sourceSpill243_47)[0] = ((byte) ((int) (local22_life7 >>> 56)));
    int local12_life48 = 1;
    while ((local12_life48 < 8)) {
        (__sourceSpill243_47)[local12_life48] = ((byte) ((int) ((local22_life7 << (local12_life48 * 8)) >>> 56)));
        local12_life48 += 1;
    }
    byte[] __sourcePreallocation243_49 = __sourceSpill243_47;
    ((javax.crypto.Cipher)(__sourceSpill243_44)).init(((int)(__sourceSpill243_45)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill243_46)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation243_49)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local17_life52 = new long[3];
    int local14_life53 = 0;
    java.lang.String local15_life54;
    int local16_life56 = ((java.lang.String)((local15_life54 = "¶¦/\032\003Eçÿ\017\026ùSÈëýú?Rò"))).length();
    int local13_life57 = 0;
    do {
        java.lang.String __sourceSpill243_58 = local15_life54;
        int __sourceSpill243_59 = local13_life57;
        local13_life57 += 8;
        byte[] local18_life62 = ((java.lang.String)(((java.lang.String)(__sourceSpill243_58)).substring(((int)(__sourceSpill243_59)), ((int)(local13_life57))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill243_63 = local17_life52;
        int __sourceSpill243_64 = local14_life53;
        local14_life53 += 1;
        long local19_life65 = (((((((((((long) (local18_life62)[0]) & 255L) << 56) | ((((long) (local18_life62)[1]) & 255L) << 48)) | ((((long) (local18_life62)[2]) & 255L) << 40)) | ((((long) (local18_life62)[3]) & 255L) << 32)) | ((((long) (local18_life62)[4]) & 255L) << 24)) | ((((long) (local18_life62)[5]) & 255L) << 16)) | ((((long) (local18_life62)[6]) & 255L) << 8)) | (((long) (local18_life62)[7]) & 255L));
        byte[] __sourceSpill243_66 = new byte[8];
        (__sourceSpill243_66)[0] = ((byte) ((int) (local19_life65 >>> 56)));
        (__sourceSpill243_66)[1] = ((byte) ((int) (local19_life65 >>> 48)));
        (__sourceSpill243_66)[2] = ((byte) ((int) (local19_life65 >>> 40)));
        (__sourceSpill243_66)[3] = ((byte) ((int) (local19_life65 >>> 32)));
        (__sourceSpill243_66)[4] = ((byte) ((int) (local19_life65 >>> 24)));
        (__sourceSpill243_66)[5] = ((byte) ((int) (local19_life65 >>> 16)));
        (__sourceSpill243_66)[6] = ((byte) ((int) (local19_life65 >>> 8)));
        (__sourceSpill243_66)[7] = ((byte) ((int) local19_life65));
        javax.crypto.Cipher __sourceSpill243_67 = local11_life42;
        byte[] local21_life69 = ((javax.crypto.Cipher)(__sourceSpill243_67)).doFinal(((byte[])(__sourceSpill243_66)));
        (__sourceSpill243_63)[__sourceSpill243_64] = (((((((((((long) (local21_life69)[0]) & 255L) << 56) | ((((long) (local21_life69)[1]) & 255L) << 48)) | ((((long) (local21_life69)[2]) & 255L) << 40)) | ((((long) (local21_life69)[3]) & 255L) << 32)) | ((((long) (local21_life69)[4]) & 255L) << 24)) | ((((long) (local21_life69)[5]) & 255L) << 16)) | ((((long) (local21_life69)[6]) & 255L) << 8)) | (((long) (local21_life69)[7]) & 255L));
    } while ((!(local13_life57 >= local16_life56)));
    I = ((long[])(local17_life52));
    J = ((java.lang.Integer[])(new java.lang.Integer[3]));
    N = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life74;
    javax.crypto.Cipher __sourceSpill243_76 = (local0_life74 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill243_77 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill243_78 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill243_79 = new byte[8];
    (__sourceSpill243_79)[0] = ((byte) ((int) (local22_life7 >>> 56)));
    int local1_life80 = 1;
    while ((local1_life80 < 8)) {
        (__sourceSpill243_79)[local1_life80] = ((byte) ((int) ((local22_life7 << (local1_life80 * 8)) >>> 56)));
        local1_life80 += 1;
    }
    byte[] __sourcePreallocation243_81 = __sourceSpill243_79;
    ((javax.crypto.Cipher)(__sourceSpill243_76)).init(((int)(__sourceSpill243_77)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill243_78)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation243_81)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life84 = new long[2];
    int local3_life85 = 0;
    java.lang.String local4_life86;
    int local5_life88 = ((java.lang.String)((local4_life86 = ",ÉÀ[Õ&«ÎÙ×¥,lÞ"))).length();
    int local2_life89 = 0;
    do {
        java.lang.String __sourceSpill243_90 = local4_life86;
        int __sourceSpill243_91 = local2_life89;
        local2_life89 += 8;
        byte[] local7_life94 = ((java.lang.String)(((java.lang.String)(__sourceSpill243_90)).substring(((int)(__sourceSpill243_91)), ((int)(local2_life89))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill243_95 = local6_life84;
        int __sourceSpill243_96 = local3_life85;
        local3_life85 += 1;
        long local8_life97 = (((((((((((long) (local7_life94)[0]) & 255L) << 56) | ((((long) (local7_life94)[1]) & 255L) << 48)) | ((((long) (local7_life94)[2]) & 255L) << 40)) | ((((long) (local7_life94)[3]) & 255L) << 32)) | ((((long) (local7_life94)[4]) & 255L) << 24)) | ((((long) (local7_life94)[5]) & 255L) << 16)) | ((((long) (local7_life94)[6]) & 255L) << 8)) | (((long) (local7_life94)[7]) & 255L));
        byte[] __sourceSpill243_98 = new byte[8];
        (__sourceSpill243_98)[0] = ((byte) ((int) (local8_life97 >>> 56)));
        (__sourceSpill243_98)[1] = ((byte) ((int) (local8_life97 >>> 48)));
        (__sourceSpill243_98)[2] = ((byte) ((int) (local8_life97 >>> 40)));
        (__sourceSpill243_98)[3] = ((byte) ((int) (local8_life97 >>> 32)));
        (__sourceSpill243_98)[4] = ((byte) ((int) (local8_life97 >>> 24)));
        (__sourceSpill243_98)[5] = ((byte) ((int) (local8_life97 >>> 16)));
        (__sourceSpill243_98)[6] = ((byte) ((int) (local8_life97 >>> 8)));
        (__sourceSpill243_98)[7] = ((byte) ((int) local8_life97));
        javax.crypto.Cipher __sourceSpill243_99 = local0_life74;
        byte[] local10_life101 = ((javax.crypto.Cipher)(__sourceSpill243_99)).doFinal(((byte[])(__sourceSpill243_98)));
        (__sourceSpill243_95)[__sourceSpill243_96] = (((((((((((long) (local10_life101)[0]) & 255L) << 56) | ((((long) (local10_life101)[1]) & 255L) << 48)) | ((((long) (local10_life101)[2]) & 255L) << 40)) | ((((long) (local10_life101)[3]) & 255L) << 32)) | ((((long) (local10_life101)[4]) & 255L) << 24)) | ((((long) (local10_life101)[5]) & 255L) << 16)) | ((((long) (local10_life101)[6]) & 255L) << 8)) | (((long) (local10_life101)[7]) & 255L));
    } while ((!(local2_life89 >= local5_life88)));
    L = ((long[])(local6_life84));
    M = ((java.lang.Long[])(new java.lang.Long[2]));
}

private static native <E extends Throwable> void __sourceConstructorInit_5d3db1b2bd48b749_0(com.moon.mK a0) throws E;

public boolean b__Boolean() {
return ((0) != 0);
}


private static int b(int p0, long p1) {
int n6 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x2611;
        if (J[n6] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l3 = I[n6];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])K.get(l4);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    K.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/moon/mK", exception);
            }
            int n7 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            mK.J[n6] = n7;
        }
        return J[n6];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_075ec89791e6c8(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral2206_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/mK"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private void e(int p0, int p1) {
com.moon.nX lexicalValue189_148_0;
    com.moon.nX lexicalValue189_149_0;
    float lexicalValue189_149_1;
    com.moon.nX lexicalValue189_156_0;
    com.moon.nX lexicalValue189_157_0;
    float lexicalValue189_157_1;
    int lexicalValue189_223_0;
    int lexicalValue189_357_0;
    com.moon.jm lexicalValue189_401_0;
    com.moon.hW lexicalValue189_401_1;
    java.lang.String lexicalValue189_401_2;
    float lexicalValue189_401_3;
    float lexicalValue189_401_4;
    float lexicalValue189_401_5;
    int lexicalValue189_401_6;
    int lexicalValue189_401_7;
    com.moon.mK lexicalValue189_512_0;
    boolean spill189_0;
    com.moon.nX spill189_1;
    com.moon.nX spill189_2;
    int spill189_3;
    int spill189_4;
    com.moon.jm spill189_5;
    com.moon.hW spill189_6;
    java.lang.String spill189_7;
    float spill189_8;
    float spill189_9;
    float spill189_10;
    int spill189_11;
    int spill189_12;
    com.moon.mK spill189_13;
    long life3_3;
    com.moon.jC life6_28;
    com.moon.jm life7_33;
    com.moon.hW life8_38;
    com.moon.hW life9_47;
    com.moon.hW life10_54;
    float life11_56;
    float life12_62;
    float life13_71;
    int life5_72;
    float life14_80;
    float life15_82;
    java.util.List life16_86;
    int life17_88;
    java.lang.String life18_97;
    int life19_103;
    int life20_112;
    com.moon.nX life21_134;
    com.moon.nX life22_140;
    com.moon.i3 life23_175;
    com.moon.i3 life24_192;
    java.lang.String life25_437;
    com.moon.i3 life26_486;
    lexical_join_536: {
    lexical_join_521: {
    lexical_join_512: {
    lexical_join_506: {
    life3_3 = (com.moon.mK.E ^ 92614557521442L);
    life6_28 = com.moon.jC.a(((float)(this.l)), ((float)(this.m)), ((float)(this.n)), ((float)(java.lang.Math.min(((float)((this.o - ((this.m + this.o) - (((com.moon.mK)(this)).a() + this.i))))), ((float)(this.o))))));
    life7_33 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.MATERIAL_ICONS)));
    life8_38 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    spill189_0 = com.moon.mN.e__Boolean();
    life9_47 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(this.a))))).a();
    life10_54 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(life7_33))))).a();
    life11_56 = 0x1.8p0f;
    life12_62 = (this.e + this.k);
    life13_71 = (((((com.moon.mK)(this)).a() + 0x1.3p4f) + 0x1.8p1f) - 0x1.0p0f);
    life5_72 = ((spill189_0) ? 1 : 0);
    life14_80 = (this.g - (this.k * 0x1.0p1f));
    life15_82 = 0x1.5p4f;
    life16_86 = ((com.moon.setting.StringListSetting)(this.h)).getValues();
    life17_88 = 0;
    lexical_cycle_89: while (true) {
    lexical_join_402: {
    lexical_join_401: {
    lexical_join_357: {
    lexical_join_278: {
    lexical_join_262: {
    lexical_join_223: {
    lexical_join_222: {
    lexical_join_157: {
    lexical_join_156: {
    lexical_join_149: {
    lexical_join_148: {
    if (!((life17_88 < ((java.util.List)(life16_86)).size()))) {
        break lexical_join_506;
    }
    life18_97 = ((java.lang.String)(((java.util.List)(life16_86)).get(((int)(life17_88)))));
    life19_103 = ((((java.lang.String)(life18_97)).equals(((java.lang.Object)(((com.moon.setting.StringListSetting)(this.h)).getValue())))) ? 1 : 0);
    life20_112 = ((((com.moon.mK)(this)).a(((int)(p0)), ((int)(p1)), ((float)(life12_62)), ((float)(life13_71)), ((float)(life14_80)), ((float)(life15_82)))) ? 1 : 0);
    ((java.util.Map)(this.u)).putIfAbsent(((java.lang.Object)(life18_97)), ((java.lang.Object)(new com.moon.nX())));
    ((java.util.Map)(this.v)).putIfAbsent(((java.lang.Object)(life18_97)), ((java.lang.Object)(new com.moon.nX())));
    life21_134 = ((com.moon.nX)(((java.util.Map)(this.u)).get(((java.lang.Object)(life18_97)))));
    life22_140 = ((com.moon.nX)(((java.util.Map)(this.v)).get(((java.lang.Object)(life18_97)))));
    if (!((life5_72 != 0))) {
        break lexical_join_536;
    }
    spill189_1 = life21_134;
    if (!((life19_103 != 0))) {
        lexicalValue189_148_0 = spill189_1;
        break lexical_join_148;
    }
    lexicalValue189_149_0 = spill189_1;
    lexicalValue189_149_1 = 0x1.0p0f;
    break lexical_join_149;
    }
    lexicalValue189_149_0 = lexicalValue189_148_0;
    lexicalValue189_149_1 = 0x0.0p0f;
    }
    ((com.moon.nX)(lexicalValue189_149_0)).a(((float)(lexicalValue189_149_1)), ((double)(0x1.99999ap-2d)));
    spill189_2 = life22_140;
    if (!((life20_112 != 0))) {
        lexicalValue189_156_0 = spill189_2;
        break lexical_join_156;
    }
    lexicalValue189_157_0 = spill189_2;
    lexicalValue189_157_1 = 0x1.0p0f;
    break lexical_join_157;
    }
    lexicalValue189_157_0 = lexicalValue189_156_0;
    lexicalValue189_157_1 = 0x0.0p0f;
    }
    ((com.moon.nX)(lexicalValue189_157_0)).a(((float)(lexicalValue189_157_1)), ((double)(0x1.99999ap-2d)));
    life23_175 = com.moon.i3.a(((float)(life12_62)), ((float)(life13_71)), ((float)(life14_80)), ((float)(life15_82)), ((float)(0x1.4p2f)), ((int)(((com.v)(this.p)).u())));
    life24_192 = com.moon.i3.a(((float)(life12_62)), ((float)(life13_71)), ((float)(life14_80)), ((float)(life15_82)), ((float)(0x1.4p2f)), ((int)(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(((com.v)(this.p)).a()))).a(((float)(__sourceExactCall_bf9871e16b7660(((com.moon.nX)(life21_134)))))))).getRGB())));
    ((com.moon.i3)(life23_175)).e(((boolean)(false)));
    ((com.moon.i3)(life24_192)).e(((boolean)(false)));
    spill189_3 = ((java.util.List)(life16_86)).size();
    if (!((life5_72 != 0))) {
        lexicalValue189_357_0 = spill189_3;
        break lexical_join_357;
    }
    if (!((spill189_3 > 1))) {
        break lexical_join_278;
    }
    spill189_4 = life17_88;
    if (!((life5_72 != 0))) {
        lexicalValue189_223_0 = spill189_4;
        break lexical_join_223;
    }
    if (!((spill189_4 == 0))) {
        break lexical_join_222;
    }
    ((com.moon.i3)(life23_175)).c(((boolean)(false)));
    ((com.moon.i3)(life23_175)).d(((boolean)(false)));
    ((com.moon.i3)(life24_192)).c(((boolean)(false)));
    ((com.moon.i3)(life24_192)).d(((boolean)(false)));
    if (!((life5_72 == 0))) {
        break lexical_join_278;
    }
    }
    lexicalValue189_223_0 = life17_88;
    }
    if (!((lexicalValue189_223_0 < (((java.util.List)(life16_86)).size() - 1)))) {
        break lexical_join_262;
    }
    ((com.moon.i3)(life23_175)).c(((boolean)(false)));
    ((com.moon.i3)(life23_175)).d(((boolean)(false)));
    ((com.moon.i3)(life23_175)).a(((boolean)(false)));
    ((com.moon.i3)(life23_175)).b(((boolean)(false)));
    ((com.moon.i3)(life24_192)).c(((boolean)(false)));
    ((com.moon.i3)(life24_192)).d(((boolean)(false)));
    ((com.moon.i3)(life24_192)).a(((boolean)(false)));
    ((com.moon.i3)(life24_192)).b(((boolean)(false)));
    if (!((life5_72 == 0))) {
        break lexical_join_278;
    }
    }
    ((com.moon.i3)(life23_175)).b(((boolean)(false)));
    ((com.moon.i3)(life23_175)).a(((boolean)(false)));
    ((com.moon.i3)(life24_192)).b(((boolean)(false)));
    ((com.moon.i3)(life24_192)).a(((boolean)(false)));
    }
    ((com.moon.hW)(life8_38)).a(((com.moon.iX)(life23_175)));
    ((com.moon.hW)(life8_38)).a(((com.moon.iX)(life24_192)));
    ((com.moon.jm)(this.a)).a(((com.moon.hW)(life9_47)), ((java.lang.String)(life18_97)), ((float)(0x1.0p3f)), ((float)((life12_62 + 0x1.4p2f))), ((float)((((life13_71 + (life15_82 / 0x1.0p1f)) - (((com.moon.jm)(this.a)).a(((float)(0x1.0p3f))) / 0x1.0p1f)) + 0x1.0p0f))), ((int)(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(((com.v)(this.p)).v()))).a(((float)((0x1.0p0f - __sourceExactCall_bf9871e16b7660(((com.moon.nX)(life21_134))))))))).getRGB())), ((boolean)(false)));
    spill189_5 = this.a;
    spill189_6 = life9_47;
    spill189_7 = life18_97;
    spill189_8 = 0x1.0p3f;
    spill189_9 = (life12_62 + 0x1.4p2f);
    spill189_10 = (((life13_71 + (life15_82 / 0x1.0p1f)) - (__sourceExactCall_65a34d18088a70(((com.moon.jm)(this.a)), ((float)(0x1.0p3f))) / 0x1.0p1f)) + 0x1.0p0f);
    spill189_11 = ((com.moon.aO)(((com.moon.aO)(new com.moon.aO(__sourceExactCall_66349b953a09b2(((com.v)(this.p)))))).a(((float)(__sourceExactCall_bf9871e16b7660(((com.moon.nX)(life21_134)))))))).getRGB();
    spill189_12 = 0;
    if (!((life5_72 != 0))) {
        lexicalValue189_401_0 = spill189_5;
        lexicalValue189_401_1 = spill189_6;
        lexicalValue189_401_2 = spill189_7;
        lexicalValue189_401_3 = spill189_8;
        lexicalValue189_401_4 = spill189_9;
        lexicalValue189_401_5 = spill189_10;
        lexicalValue189_401_6 = spill189_11;
        lexicalValue189_401_7 = spill189_12;
        break lexical_join_401;
    }
    ((com.moon.jm)(spill189_5)).a(((com.moon.hW)(spill189_6)), ((java.lang.String)(spill189_7)), ((float)(spill189_8)), ((float)(spill189_9)), ((float)(spill189_10)), ((int)(spill189_11)), ((boolean)__sourceIntrinsic_integerToBoolean((spill189_12))));
    lexicalValue189_357_0 = life19_103;
    }
    if (!((lexicalValue189_357_0 != 0))) {
        break lexical_join_402;
    }
    lexicalValue189_401_0 = life7_33;
    lexicalValue189_401_1 = life10_54;
    lexicalValue189_401_2 = "";
    lexicalValue189_401_3 = 0x1.1p3f;
    lexicalValue189_401_4 = (((life12_62 + life14_80) - 0x1.4p2f) - ((com.moon.jm)(life7_33)).a(((java.lang.String)("")), ((float)(0x1.1p3f))));
    lexicalValue189_401_5 = (((life13_71 + (life15_82 / 0x1.0p1f)) - (__sourceExactCall_65a34d18088a70(((com.moon.jm)(life7_33)), ((float)(0x1.1p3f))) / 0x1.0p1f)) + 0x1.0p0f);
    lexicalValue189_401_6 = ((com.moon.aO)(((com.moon.aO)(new com.moon.aO(__sourceExactCall_66349b953a09b2(((com.v)(this.p)))))).a(((float)(java.lang.Math.min(((float)(__sourceExactCall_bf9871e16b7660(((com.moon.nX)(life21_134))))), ((float)((0x1.0p0f - __sourceExactCall_bf9871e16b7660(((com.moon.nX)(life22_140)))))))))))).getRGB();
    lexicalValue189_401_7 = 0;
    }
    ((com.moon.jm)(lexicalValue189_401_0)).a(((com.moon.hW)(lexicalValue189_401_1)), ((java.lang.String)(lexicalValue189_401_2)), ((float)(lexicalValue189_401_3)), ((float)(lexicalValue189_401_4)), ((float)(lexicalValue189_401_5)), ((int)(lexicalValue189_401_6)), ((boolean)__sourceIntrinsic_integerToBoolean((lexicalValue189_401_7))));
    }
    life25_437 = "";
    life26_486 = com.moon.i3.a(((float)(((((life12_62 + life14_80) - 0x1.4p2f) - __sourceExactCall_b8cf447caf8b81(((com.moon.jm)(life7_33)), ((java.lang.String)(life25_437)), ((float)(0x1.2p3f)))) - 0x1.0p1f))), ((float)((((life13_71 + (life15_82 / 0x1.0p1f)) - (__sourceExactCall_65a34d18088a70(((com.moon.jm)(life7_33)), ((float)(0x1.2p3f))) / 0x1.0p1f)) - 0x1.0p1f))), ((float)((__sourceExactCall_b8cf447caf8b81(((com.moon.jm)(life7_33)), ((java.lang.String)(life25_437)), ((float)(0x1.2p3f))) + 0x1.0p2f))), ((float)((__sourceExactCall_65a34d18088a70(((com.moon.jm)(life7_33)), ((float)(0x1.2p3f))) + 0x1.0p2f))), ((float)(0x1.4p2f)), ((int)(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(((com.v)(this.p)).m()))).a(((float)(__sourceExactCall_bf9871e16b7660(((com.moon.nX)(life22_140)))))))).getRGB())));
    __sourceExactCall_644ec120141bcc(((com.moon.hW)(life8_38)), ((com.moon.iX)(life26_486)));
    ((com.moon.jm)(life7_33)).a(((com.moon.hW)(life10_54)), ((java.lang.String)(life25_437)), ((float)(0x1.2p3f)), ((float)((((life12_62 + life14_80) - 0x1.4p2f) - __sourceExactCall_b8cf447caf8b81(((com.moon.jm)(life7_33)), ((java.lang.String)(life25_437)), ((float)(0x1.2p3f)))))), ((float)((((life13_71 + (life15_82 / 0x1.0p1f)) - (__sourceExactCall_65a34d18088a70(((com.moon.jm)(life7_33)), ((float)(0x1.2p3f))) / 0x1.0p1f)) + 0x1.8p0f))), ((int)(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(((com.v)(this.p)).n()))).a(((float)(__sourceExactCall_bf9871e16b7660(((com.moon.nX)(life22_140)))))))).getRGB())), ((boolean)(false)));
    life13_71 = (life13_71 + ((life15_82 + life11_56) - 0x1.0p0f));
    life17_88 += 1;
    if (!((life5_72 == 0))) { continue lexical_cycle_89; }
    break lexical_cycle_89;
    }
    }
    spill189_13 = this;
    if (!((life5_72 != 0))) {
        lexicalValue189_512_0 = spill189_13;
        break lexical_join_512;
    }
    if (!(((com.moon.mK)(spill189_13)).w)) {
        break lexical_join_521;
    }
    lexicalValue189_512_0 = this;
    }
    ((com.moon.mK)(lexicalValue189_512_0)).a(((int)(p0)), ((int)(p1)), ((int)(this.x)), ((java.util.function.Consumer)(__sourceIntrinsic_c9a4d6bd89d4_invokedynamic189_141(this))), ((java.util.function.Consumer)(__sourceIntrinsic_c9a4d6bd89d4_invokedynamic189_142(this))));
    }
    ((com.moon.hW)(life8_38)).a(((com.moon.jA)(life6_28)));
    ((com.moon.hW)(life9_47)).a(((com.moon.jA)(life6_28)));
    ((com.moon.hW)(life10_54)).a(((com.moon.jA)(life6_28)));
    __sourceExactCall_247fe3d2bc87d6(((com.moon.hW)(life8_38)));
    __sourceExactCall_247fe3d2bc87d6(((com.moon.hW)(life9_47)));
    __sourceExactCall_247fe3d2bc87d6(((com.moon.hW)(life10_54)));
    }
    return;
}


private static long c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = __sourceExactCall_5d31f6b4d662c1(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2208_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/mK"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static long c(int p0, long p1) {
int life3_8;
    byte[] life4_77;
    long life5_81;
    byte[] life7_146;
    java.lang.Long life8_150;
    java.lang.Object[] life9_155;
    javax.crypto.spec.DESKeySpec life11_188;
    javax.crypto.SecretKey life12_195;
    javax.crypto.Cipher life13_200;
    byte[] life10_212;
    long life11_290;
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 29370);
    if (((com.moon.mK.M)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (com.moon.mK.L)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(com.moon.mK.N)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.mK.N)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("com/moon/mK", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (com.moon.mK.M)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((com.moon.mK.M)[life3_8])).longValue();
}


private void c(int p0, int p1) {
float lexicalValue188_75_0;
    float lexicalValue188_75_1;
    float lexicalValue188_83_0;
    float lexicalValue188_83_1;
    float lexicalValue188_138_0;
    float lexicalValue188_138_1;
    float lexicalValue188_138_2;
    float lexicalValue188_138_3;
    float lexicalValue188_138_4;
    int lexicalValue188_138_5;
    float lexicalValue188_139_0;
    float lexicalValue188_139_1;
    float lexicalValue188_139_2;
    float lexicalValue188_139_3;
    float lexicalValue188_139_4;
    float lexicalValue188_142_0;
    float lexicalValue188_142_1;
    float lexicalValue188_142_2;
    float lexicalValue188_142_3;
    float lexicalValue188_142_4;
    int lexicalValue188_142_5;
    com.moon.mK lexicalValue188_191_0;
    com.moon.mK lexicalValue188_192_0;
    float lexicalValue188_192_1;
    com.moon.mK lexicalValue188_205_0;
    com.moon.nX lexicalValue188_211_0;
    com.moon.nX lexicalValue188_212_0;
    float lexicalValue188_212_1;
    boolean spill188_0;
    float spill188_1;
    float spill188_2;
    int spill188_3;
    long spill188_4;
    float spill188_5;
    float spill188_6;
    float spill188_7;
    float spill188_8;
    float spill188_9;
    int spill188_10;
    com.moon.mK spill188_11;
    com.moon.mK spill188_12;
    com.moon.nX spill188_13;
    long life3_3;
    com.moon.jC life6_14;
    int life5_15;
    float life7_23;
    java.util.Iterator life8_28;
    java.lang.String life9_35;
    float life10_41;
    float life8_90;
    float life9_94;
    float life10_105;
    int life11_107;
    float life12_109;
    int life13_122;
    com.moon.hW life14_127;
    com.moon.i3 life15_155;
    com.moon.i3 life16_169;
    lexical_join_212: {
    lexical_join_211: {
    lexical_join_205: {
    lexical_join_204: {
    lexical_join_192: {
    lexical_join_191: {
    lexical_join_142: {
    lexical_join_139: {
    lexical_join_138: {
    lexical_join_83: {
    lexical_join_79: {
    life3_3 = (com.moon.mK.E ^ 127383290112946L);
    spill188_0 = com.moon.mN.e__Boolean();
    life6_14 = com.moon.jC.a(((float)(this.l)), ((float)(this.m)), ((float)(this.n)), ((float)(this.o)));
    life5_15 = ((spill188_0) ? 1 : 0);
    life7_23 = ((this.e + this.k) + 0x1.4p2f);
    life8_28 = ((java.util.List)(((com.moon.setting.StringListSetting)(this.h)).getValues())).iterator();
    lexical_cycle_29: while (true) {
    lexical_join_75: {
    lexical_join_71: {
    if (!(((java.util.Iterator)(life8_28)).hasNext())) {
        break lexical_join_79;
    }
    life9_35 = ((java.lang.String)(((java.util.Iterator)(life8_28)).next()));
    life10_41 = ((com.moon.jm)(this.a)).a(((java.lang.String)(life9_35)), ((float)(0x1.ecccccp2f)));
    spill188_1 = (life7_23 + life10_41);
    spill188_2 = ((this.e + this.g) - ((this.k * 0x1.0p1f) + 0x1.4p3f));
    if (!((life5_15 != 0))) {
        lexicalValue188_83_0 = spill188_1;
        lexicalValue188_83_1 = spill188_2;
        break lexical_join_83;
    }
    if (!((life5_15 != 0))) {
        lexicalValue188_75_0 = spill188_1;
        lexicalValue188_75_1 = spill188_2;
        break lexical_join_75;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(spill188_1)), ((float)(spill188_2))) > 0))) {
        break lexical_join_71;
    }
    life7_23 = ((this.e + this.k) + 0x1.4p2f);
    }
    lexicalValue188_75_0 = life7_23;
    lexicalValue188_75_1 = (life10_41 + 0x1.ep3f);
    }
    life7_23 = (lexicalValue188_75_0 + lexicalValue188_75_1);
    if (!((life5_15 == 0))) { continue lexical_cycle_29; }
    break lexical_cycle_29;
    }
    }
    lexicalValue188_83_0 = this.e;
    lexicalValue188_83_1 = this.k;
    }
    life8_90 = (lexicalValue188_83_0 + lexicalValue188_83_1);
    spill188_3 = 20335;
    life9_94 = ((com.moon.mK)(this)).a();
    spill188_4 = (8861338046533233231L ^ life3_3);
    life10_105 = (this.g - (this.k * 0x1.0p1f));
    life11_107 = __sourceIntrinsic_505b8c2844d4_invokedynamic188_29(spill188_3, spill188_4);
    life12_109 = 0x1.3p4f;
    life13_122 = ((((com.moon.mK)(this)).a(((int)(p0)), ((int)(p1)), ((float)(((life8_90 + life10_105) - life12_109))), ((float)(life9_94)), ((float)(life12_109)), ((float)(0x1.3p4f)))) ? 1 : 0);
    life14_127 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    spill188_5 = ((life8_90 + life10_105) - life12_109);
    spill188_6 = life9_94;
    spill188_7 = life12_109;
    spill188_8 = 0x1.3p4f;
    spill188_9 = 0x1.4p2f;
    spill188_10 = life13_122;
    if (!((life5_15 != 0))) {
        lexicalValue188_138_0 = spill188_5;
        lexicalValue188_138_1 = spill188_6;
        lexicalValue188_138_2 = spill188_7;
        lexicalValue188_138_3 = spill188_8;
        lexicalValue188_138_4 = spill188_9;
        lexicalValue188_138_5 = spill188_10;
        break lexical_join_138;
    }
    if (!((spill188_10 != 0))) {
        lexicalValue188_139_0 = spill188_5;
        lexicalValue188_139_1 = spill188_6;
        lexicalValue188_139_2 = spill188_7;
        lexicalValue188_139_3 = spill188_8;
        lexicalValue188_139_4 = spill188_9;
        break lexical_join_139;
    }
    lexicalValue188_138_0 = spill188_5;
    lexicalValue188_138_1 = spill188_6;
    lexicalValue188_138_2 = spill188_7;
    lexicalValue188_138_3 = spill188_8;
    lexicalValue188_138_4 = spill188_9;
    lexicalValue188_138_5 = ((com.v)(this.p)).a();
    }
    lexicalValue188_142_0 = lexicalValue188_138_0;
    lexicalValue188_142_1 = lexicalValue188_138_1;
    lexicalValue188_142_2 = lexicalValue188_138_2;
    lexicalValue188_142_3 = lexicalValue188_138_3;
    lexicalValue188_142_4 = lexicalValue188_138_4;
    lexicalValue188_142_5 = lexicalValue188_138_5;
    break lexical_join_142;
    }
    lexicalValue188_142_0 = lexicalValue188_139_0;
    lexicalValue188_142_1 = lexicalValue188_139_1;
    lexicalValue188_142_2 = lexicalValue188_139_2;
    lexicalValue188_142_3 = lexicalValue188_139_3;
    lexicalValue188_142_4 = lexicalValue188_139_4;
    lexicalValue188_142_5 = ((com.v)(this.p)).e();
    }
    life15_155 = com.moon.i3.a(((float)(lexicalValue188_142_0)), ((float)(lexicalValue188_142_1)), ((float)(lexicalValue188_142_2)), ((float)(lexicalValue188_142_3)), ((float)(lexicalValue188_142_4)), ((int)(lexicalValue188_142_5)));
    life16_169 = com.moon.i3.a(((float)(life8_90)), ((float)(life9_94)), ((float)(((life10_105 - life12_109) - 0x1.0p0f))), ((float)(0x1.3p4f)), ((float)(0x1.4p2f)), ((int)(((com.v)(this.p)).u())));
    ((com.moon.i3)(life15_155)).e(((boolean)(false)));
    ((com.moon.i3)(life16_169)).e(((boolean)(false)));
    ((com.moon.hW)(life14_127)).a(((com.moon.iX)(life15_155)));
    ((com.moon.hW)(life14_127)).a(((com.moon.iX)(life16_169)));
    ((com.moon.hW)(life14_127)).a(((com.moon.jA)(life6_14)));
    ((com.moon.hW)(life14_127)).b();
    spill188_11 = this;
    if (!(this.t)) {
        lexicalValue188_191_0 = spill188_11;
        break lexical_join_191;
    }
    lexicalValue188_192_0 = spill188_11;
    lexicalValue188_192_1 = ((0x1.58p4f * ((float) ((java.util.List)(((com.moon.setting.StringListSetting)(this.h)).getValues())).size())) + 0x1.4p4f);
    break lexical_join_192;
    }
    lexicalValue188_192_0 = lexicalValue188_191_0;
    lexicalValue188_192_1 = 0x1.3p4f;
    }
    ((com.moon.mK)(lexicalValue188_192_0)).j = ((float)(lexicalValue188_192_1));
    spill188_12 = this;
    if (!((life5_15 != 0))) {
        lexicalValue188_205_0 = spill188_12;
        break lexical_join_205;
    }
    if (!(((com.moon.mK)(spill188_12)).w)) {
        break lexical_join_204;
    }
    com.moon.mK __stackOp188_56_0 = this;
    ((com.moon.mK)(__stackOp188_56_0)).j = ((float)((((com.moon.mK)(__stackOp188_56_0)).j + 0x1.58p4f)));
    }
    lexicalValue188_205_0 = this;
    }
    spill188_13 = ((com.moon.mK)(lexicalValue188_205_0)).d;
    if (!(((com.moon.mK)(this)).a__Boolean())) {
        lexicalValue188_211_0 = spill188_13;
        break lexical_join_211;
    }
    lexicalValue188_212_0 = spill188_13;
    lexicalValue188_212_1 = 0x1.0p0f;
    break lexical_join_212;
    }
    lexicalValue188_212_0 = lexicalValue188_211_0;
    lexicalValue188_212_1 = 0x0.0p0f;
    }
    ((com.moon.nX)(lexicalValue188_212_0)).a(((float)(lexicalValue188_212_1)), ((double)(0x1.333334p-2d)));
    ((com.moon.nX)(this.s)).a(((float)((this.j * ((com.moon.nX)(this.d)).b()))), ((double)(0x1.333334p-2d)));
    ((com.moon.mK)(this)).d(((float)(((com.moon.nX)(this.s)).b())));
    return;
}


private void d(int p0, int p1) {
com.moon.jm forwardValue718_115_0;
    com.moon.hW forwardValue718_115_1;
    java.lang.String forwardValue718_115_2;
    float forwardValue718_115_3;
    float forwardValue718_115_4;
    float forwardValue718_115_5;
    int forwardValue718_115_6;
    com.moon.jm forwardValue718_116_0;
    com.moon.hW forwardValue718_116_1;
    java.lang.String forwardValue718_116_2;
    float forwardValue718_116_3;
    float forwardValue718_116_4;
    float forwardValue718_116_5;
    com.moon.jm forwardValue718_119_0;
    com.moon.hW forwardValue718_119_1;
    java.lang.String forwardValue718_119_2;
    float forwardValue718_119_3;
    float forwardValue718_119_4;
    float forwardValue718_119_5;
    int forwardValue718_119_6;
    boolean spill718_0;
    com.moon.jm spill718_1;
    com.moon.hW spill718_2;
    java.lang.String spill718_3;
    float spill718_4;
    float spill718_5;
    float spill718_6;
    int spill718_7;
    long life3_3;
    java.lang.String life6_5;
    com.moon.jC life7_15;
    com.moon.jm life8_20;
    com.moon.hW life9_28;
    com.moon.hW life10_35;
    float life11_41;
    float life12_44;
    float life13_52;
    float life14_54;
    float life15_56;
    float life16_62;
    float life17_67;
    float life18_79;
    float life19_89;
    int life20_98;
    int life5_99;
    forward_join_119: {
    forward_join_116: {
    forward_join_115: {
    life3_3 = (com.moon.mK.E ^ 3391346065872L);
    life6_5 = "";
    life7_15 = com.moon.jC.a(((float)(this.l)), ((float)(this.m)), ((float)(this.n)), ((float)(this.o)));
    life8_20 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.MATERIAL_ICONS)));
    life9_28 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(this.a))))).a();
    life10_35 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(life8_20))))).a();
    life11_41 = (this.e + this.k);
    life12_44 = ((com.moon.mK)(this)).a();
    life13_52 = (this.g - (this.k * 0x1.0p1f));
    life14_54 = 0x1.3p4f;
    life15_56 = life14_54;
    spill718_0 = com.moon.mN.d__Boolean();
    life16_62 = __sourceExactCall_6c15b7b6fabc45(((com.moon.jm)(life8_20)), ((java.lang.String)(life6_5)), ((float)(0x1.39999ap3f)));
    life17_67 = ((com.moon.jm)(life8_20)).a(((java.lang.String)(life6_5)), ((float)(0x1.39999ap3f)));
    life18_79 = (((life11_41 + life13_52) - life15_56) + ((life15_56 - life17_67) / 0x1.0p1f));
    life19_89 = ((life12_44 + (life14_54 / 0x1.0p1f)) - (life16_62 / 0x1.0p1f));
    life20_98 = ((((com.moon.mK)(this)).a(((int)(p0)), ((int)(p1)), ((float)(life18_79)), ((float)(life19_89)), ((float)(life15_56)), ((float)(life14_54)))) ? 1 : 0);
    life5_99 = ((spill718_0) ? 1 : 0);
    spill718_1 = life8_20;
    spill718_2 = life10_35;
    spill718_3 = life6_5;
    spill718_4 = 0x1.39999ap3f;
    spill718_5 = life18_79;
    spill718_6 = (life19_89 + 0x1.4p1f);
    spill718_7 = life20_98;
    if (!((life5_99 == 0))) {
        forwardValue718_115_0 = spill718_1;
        forwardValue718_115_1 = spill718_2;
        forwardValue718_115_2 = spill718_3;
        forwardValue718_115_3 = spill718_4;
        forwardValue718_115_4 = spill718_5;
        forwardValue718_115_5 = spill718_6;
        forwardValue718_115_6 = spill718_7;
        break forward_join_115;
    }
    if (!((spill718_7 != 0))) {
        forwardValue718_116_0 = spill718_1;
        forwardValue718_116_1 = spill718_2;
        forwardValue718_116_2 = spill718_3;
        forwardValue718_116_3 = spill718_4;
        forwardValue718_116_4 = spill718_5;
        forwardValue718_116_5 = spill718_6;
        break forward_join_116;
    }
    forwardValue718_115_0 = spill718_1;
    forwardValue718_115_1 = spill718_2;
    forwardValue718_115_2 = spill718_3;
    forwardValue718_115_3 = spill718_4;
    forwardValue718_115_4 = spill718_5;
    forwardValue718_115_5 = spill718_6;
    forwardValue718_115_6 = __sourceExactCall_66349b953a09b2(((com.v)(this.p)));
    }
    forwardValue718_119_0 = forwardValue718_115_0;
    forwardValue718_119_1 = forwardValue718_115_1;
    forwardValue718_119_2 = forwardValue718_115_2;
    forwardValue718_119_3 = forwardValue718_115_3;
    forwardValue718_119_4 = forwardValue718_115_4;
    forwardValue718_119_5 = forwardValue718_115_5;
    forwardValue718_119_6 = forwardValue718_115_6;
    break forward_join_119;
    }
    forwardValue718_119_0 = forwardValue718_116_0;
    forwardValue718_119_1 = forwardValue718_116_1;
    forwardValue718_119_2 = forwardValue718_116_2;
    forwardValue718_119_3 = forwardValue718_116_3;
    forwardValue718_119_4 = forwardValue718_116_4;
    forwardValue718_119_5 = forwardValue718_116_5;
    forwardValue718_119_6 = ((com.v)(this.p)).f();
    }
    __sourceExactCall_1949570a13ee94(((com.moon.jm)(forwardValue718_119_0)), ((com.moon.hW)(forwardValue718_119_1)), ((java.lang.String)(forwardValue718_119_2)), ((float)(forwardValue718_119_3)), ((float)(forwardValue718_119_4)), ((float)(forwardValue718_119_5)), ((int)(forwardValue718_119_6)));
    ((com.moon.jm)(this.a)).a(((com.moon.hW)(life9_28)), ((java.lang.String)(((com.moon.setting.StringListSetting)(this.h)).getDisplayName())), ((float)(0x1.0147acp3f)), ((float)(((__sourceExactCall_7d604da93fde99(((com.moon.mK)(this))) + this.k) + 0x1.4p2f))), ((float)((((com.moon.mK)(this)).a() + 0x1.6p2f))), ((int)(((com.v)(this.p)).v())), ((boolean)(false)), ((boolean)(false)), ((float)(0x1.47ae14p-7f)));
    ((com.moon.hW)(life9_28)).a(((com.moon.jA)(life7_15)));
    ((com.moon.hW)(life10_35)).a(((com.moon.jA)(life7_15)));
    __sourceExactCall_247fe3d2bc87d6(((com.moon.hW)(life9_28)));
    __sourceExactCall_247fe3d2bc87d6(((com.moon.hW)(life10_35)));
    return;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = __sourceExactCall_3f214ae79ed92b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a(char p0, int p1) {
int forestValue100028_13_0;
    int forestValue100028_23_0;
    int forestValue100028_40_0;
    com.moon.mK forestValue100028_49_0;
    com.moon.mK forestValue100028_50_0;
    com.moon.mK forestValue100028_50_1;
    com.moon.mK forestValue100028_60_0;
    java.lang.String forestValue100028_60_1;
    int forestValue100028_67_0;
    com.moon.mK forestValue100028_82_0;
    int forestValue100028_88_0;
    boolean spill100028_0;
    boolean spill100028_1;
    com.moon.mK spill100028_2;
    com.moon.mK spill100028_3;
    com.moon.mK spill100028_4;
    long life3_3;
    int life5_5;
    forest_join_89: {
    forest_join_88: {
    forest_join_87: {
    forest_join_82: {
    forest_join_81: {
    forest_join_67: {
    forest_join_65: {
    forest_join_64: {
    forest_join_60: {
    forest_join_50: {
    forest_join_49: {
    forest_join_40: {
    forest_join_23: {
    forest_join_22: {
    forest_join_13: {
    life3_3 = (com.moon.mK.E ^ 26537603218023L);
    life5_5 = ((com.moon.mN.d__Boolean()) ? 1 : 0);
    spill100028_0 = this.w;
    if (!((life5_5 == 0))) {
        forestValue100028_13_0 = ((spill100028_0) ? 1 : 0);
        break forest_join_13;
    }
    if (!(spill100028_0)) {
        break forest_join_89;
    }
    forestValue100028_13_0 = ((__sourceExactCall_f3ecfecc707d9b(((int)(p1)))) ? 1 : 0);
    }
    if (!((life5_5 == 0))) {
        forestValue100028_23_0 = forestValue100028_13_0;
        break forest_join_23;
    }
    if (!((forestValue100028_13_0 != 0))) {
        break forest_join_22;
    }
    org.lwjgl.input.Keyboard.enableRepeatEvents(((boolean)(false)));
    this.A = ((boolean)(true));
    return;
    }
    forestValue100028_23_0 = p1;
    }
    if (!((life5_5 == 0))) {
        forestValue100028_67_0 = forestValue100028_23_0;
        break forest_join_67;
    }
    if (!((forestValue100028_23_0 == __sourceIntrinsic_f7d59ba1def0_invokedynamic100028_9(13430, (406630012112093314L ^ life3_3))))) {
        break forest_join_65;
    }
    spill100028_1 = ((java.lang.String)(((java.lang.String)(((com.moon.setting.StringListSetting)(this.h)).getValue())))).isEmpty();
    if (!((life5_5 == 0))) {
        forestValue100028_40_0 = ((spill100028_1) ? 1 : 0);
        break forest_join_40;
    }
    if (!((!spill100028_1))) {
        break forest_join_64;
    }
    forestValue100028_40_0 = 1;
    }
    org.lwjgl.input.Keyboard.enableRepeatEvents(((boolean)__sourceIntrinsic_integerToBoolean((forestValue100028_40_0))));
    spill100028_2 = this;
    spill100028_3 = this;
    if (!((life5_5 == 0))) {
        forestValue100028_50_0 = spill100028_2;
        forestValue100028_50_1 = spill100028_3;
        break forest_join_50;
    }
    if (!(((com.moon.mK)(spill100028_3)).A)) {
        forestValue100028_49_0 = spill100028_2;
        break forest_join_49;
    }
    forestValue100028_60_0 = spill100028_2;
    forestValue100028_60_1 = "";
    break forest_join_60;
    }
    forestValue100028_50_0 = forestValue100028_49_0;
    forestValue100028_50_1 = this;
    }
    forestValue100028_60_0 = forestValue100028_50_0;
    forestValue100028_60_1 = ((java.lang.String)(((com.moon.mK)(forestValue100028_50_1)).y)).substring(((int)(0)), ((int)(java.lang.Math.max(((int)((((java.lang.String)(this.y)).length() - 1))), ((int)(0))))));
    }
    ((com.moon.mK)(forestValue100028_60_0)).y = ((java.lang.String)(forestValue100028_60_1));
    this.A = ((boolean)(false));
    }
    return;
    }
    forestValue100028_67_0 = ((moom.CH.a(((char)(p0)))) ? 1 : 0);
    }
    if (!((life5_5 == 0))) {
        forestValue100028_88_0 = forestValue100028_67_0;
        break forest_join_88;
    }
    if (!((forestValue100028_67_0 != 0))) {
        break forest_join_87;
    }
    spill100028_4 = this;
    if (!((life5_5 == 0))) {
        forestValue100028_82_0 = spill100028_4;
        break forest_join_82;
    }
    if (!(((com.moon.mK)(spill100028_4)).A)) {
        break forest_join_81;
    }
    this.y = ((java.lang.String)(""));
    this.A = ((boolean)(false));
    }
    forestValue100028_82_0 = this;
    }
    ((com.moon.mK)(forestValue100028_82_0)).y = ((java.lang.String)(__sourceIntrinsic_f7d59ba1def0_invokedynamic100028_30(this.y, p0)));
    }
    forestValue100028_88_0 = 0;
    }
    org.lwjgl.input.Keyboard.enableRepeatEvents(((boolean)__sourceIntrinsic_integerToBoolean((forestValue100028_88_0))));
    }
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral2213_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/mK"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(int p0, int p1) {
com.moon.mK forwardValue714_31_0;
    com.moon.mK forwardValue714_35_0;
    boolean spill714_0;
    com.moon.mK spill714_1;
    com.moon.mK spill714_2;
    long life3_3;
    int life5_11;
    forward_join_35: {
    forward_join_34: {
    forward_join_31: {
    forward_join_30: {
    life3_3 = (com.moon.mK.E ^ 70851491646507L);
    ((com.moon.mK)(this)).c__Void();
    spill714_0 = com.moon.mN.d__Boolean();
    ((com.moon.mK)(this)).c(((int)(p0)), ((int)(p1)));
    life5_11 = ((spill714_0) ? 1 : 0);
    ((com.moon.mK)(this)).d(((int)(p0)), ((int)(p1)));
    spill714_1 = this;
    if (!((life5_11 == 0))) {
        forwardValue714_31_0 = spill714_1;
        break forward_join_31;
    }
    if (!((!((com.moon.mK)(spill714_1)).t))) {
        break forward_join_30;
    }
    spill714_2 = this;
    if (!((life5_11 == 0))) {
        forwardValue714_35_0 = spill714_2;
        break forward_join_35;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(((double) ((com.moon.nX)(((com.moon.mK)(spill714_2)).s)).b()))), ((double)(0x1.319999999999ap4d))) > 0))) {
        break forward_join_34;
    }
    }
    forwardValue714_31_0 = this;
    }
    ((com.moon.mK)(forwardValue714_31_0)).e(((int)(p0)), ((int)(p1)));
    }
    forwardValue714_35_0 = this;
    }
    __sourceIntrinsic_fd0ba049c90e_call714_11(forwardValue714_35_0, p0, p1);
    return;
}


public boolean a__Boolean(int p0, int p1, int p2) {
int lexicalValue187_53_0;
    com.moon.mK lexicalValue187_68_0;
    int lexicalValue187_68_1;
    com.moon.mK lexicalValue187_69_0;
    com.moon.mK lexicalValue187_70_0;
    int lexicalValue187_70_1;
    int lexicalValue187_89_0;
    com.moon.mK lexicalValue187_107_0;
    com.moon.mK lexicalValue187_113_0;
    int lexicalValue187_113_1;
    com.moon.mK lexicalValue187_114_0;
    com.moon.mK lexicalValue187_115_0;
    int lexicalValue187_115_1;
    int lexicalValue187_123_0;
    int lexicalValue187_243_0;
    int lexicalValue187_254_0;
    int lexicalValue187_265_0;
    com.moon.mK lexicalValue187_267_0;
    int lexicalValue187_286_0;
    boolean spill187_0;
    boolean spill187_1;
    boolean spill187_2;
    com.moon.mK spill187_3;
    boolean spill187_4;
    com.moon.mK spill187_5;
    boolean spill187_6;
    boolean spill187_7;
    int spill187_8;
    com.moon.mK spill187_9;
    long life4_3;
    float life7_10;
    float life8_18;
    int life6_19;
    float life9_21;
    float life10_28;
    float life11_171;
    float life12_177;
    float life13_186;
    float life14_194;
    float life15_196;
    java.util.List life16_200;
    int life17_202;
    java.lang.String life18_211;
    int life19_240;
    lexical_join_286: {
    lexical_join_281: {
    lexical_join_123: {
    lexical_join_121: {
    lexical_join_115: {
    lexical_join_114: {
    lexical_join_113: {
    lexical_join_107: {
    lexical_join_100: {
    lexical_join_89: {
    lexical_join_73: {
    lexical_join_70: {
    lexical_join_69: {
    lexical_join_68: {
    lexical_join_53: {
    lexical_join_39: {
    life4_3 = (com.moon.mK.E ^ 114243384523030L);
    spill187_0 = com.moon.mN.d__Boolean();
    life7_10 = (this.e + this.k);
    life8_18 = (this.g - (this.k * 0x1.0p1f));
    life6_19 = ((spill187_0) ? 1 : 0);
    life9_21 = 0x1.7p4f;
    life10_28 = ((((com.moon.mK)(this)).a() + 0x1.8p1f) + 0x1.7p4f);
    spill187_1 = this.C;
    if (!((life6_19 == 0))) {
        lexicalValue187_53_0 = ((spill187_1) ? 1 : 0);
        break lexical_join_53;
    }
    if (!(spill187_1)) {
        break lexical_join_39;
    }
    this.C = ((boolean)(false));
    return ((0) != 0);
    }
    lexicalValue187_53_0 = ((((com.moon.mK)(this)).a(((int)(p0)), ((int)(p1)), ((float)(life7_10)), ((float)(((life10_28 - 0x1.7p4f) - 0x1.8p2f))), ((float)((life8_18 - 0x1.4p4f))), ((float)(0x1.7p4f)))) ? 1 : 0);
    }
    if (!((life6_19 == 0))) {
        lexicalValue187_89_0 = lexicalValue187_53_0;
        break lexical_join_89;
    }
    if (!((lexicalValue187_53_0 != 0))) {
        break lexical_join_73;
    }
    spill187_2 = this.w;
    if (!((life6_19 == 0))) {
        lexicalValue187_286_0 = ((spill187_2) ? 1 : 0);
        break lexical_join_286;
    }
    if (!((!spill187_2))) {
        break lexical_join_281;
    }
    spill187_3 = this;
    spill187_4 = this.t;
    if (!((life6_19 == 0))) {
        lexicalValue187_68_0 = spill187_3;
        lexicalValue187_68_1 = ((spill187_4) ? 1 : 0);
        break lexical_join_68;
    }
    if (!((!spill187_4))) {
        lexicalValue187_69_0 = spill187_3;
        break lexical_join_69;
    }
    lexicalValue187_68_0 = spill187_3;
    lexicalValue187_68_1 = 1;
    }
    lexicalValue187_70_0 = lexicalValue187_68_0;
    lexicalValue187_70_1 = lexicalValue187_68_1;
    break lexical_join_70;
    }
    lexicalValue187_70_0 = lexicalValue187_69_0;
    lexicalValue187_70_1 = 0;
    }
    ((com.moon.mK)(lexicalValue187_70_0)).t = ((boolean)__sourceIntrinsic_integerToBoolean((lexicalValue187_70_1)));
    if (!((life6_19 != 0))) {
        break lexical_join_281;
    }
    }
    lexicalValue187_89_0 = ((((com.moon.mK)(this)).a(((int)(p0)), ((int)(p1)), ((float)(((life7_10 + life8_18) - 0x1.3p4f))), ((float)(((life10_28 - 0x1.7p4f) - 0x1.8p2f))), ((float)(0x1.7p4f)), ((float)(0x1.7p4f)))) ? 1 : 0);
    }
    if (!((life6_19 == 0))) {
        lexicalValue187_123_0 = lexicalValue187_89_0;
        break lexical_join_123;
    }
    if (!((lexicalValue187_89_0 != 0))) {
        break lexical_join_121;
    }
    spill187_5 = this;
    if (!((life6_19 == 0))) {
        lexicalValue187_107_0 = spill187_5;
        break lexical_join_107;
    }
    if (!((!((com.moon.mK)(spill187_5)).t))) {
        break lexical_join_100;
    }
    this.t = ((boolean)(true));
    }
    this.x = ((int)(((java.util.List)(((com.moon.setting.StringListSetting)(this.h)).getValues())).size()));
    lexicalValue187_107_0 = this;
    }
    spill187_6 = this.w;
    if (!((life6_19 == 0))) {
        lexicalValue187_113_0 = lexicalValue187_107_0;
        lexicalValue187_113_1 = ((spill187_6) ? 1 : 0);
        break lexical_join_113;
    }
    if (!((!spill187_6))) {
        lexicalValue187_114_0 = lexicalValue187_107_0;
        break lexical_join_114;
    }
    lexicalValue187_113_0 = lexicalValue187_107_0;
    lexicalValue187_113_1 = 1;
    }
    lexicalValue187_115_0 = lexicalValue187_113_0;
    lexicalValue187_115_1 = lexicalValue187_113_1;
    break lexical_join_115;
    }
    lexicalValue187_115_0 = lexicalValue187_114_0;
    lexicalValue187_115_1 = 0;
    }
    ((com.moon.mK)(lexicalValue187_115_0)).w = ((boolean)__sourceIntrinsic_integerToBoolean((lexicalValue187_115_1)));
    this.y = ((java.lang.String)(""));
    if (!((life6_19 != 0))) {
        break lexical_join_281;
    }
    }
    lexicalValue187_123_0 = ((this.t) ? 1 : 0);
    }
    if (!((life6_19 == 0))) {
        lexicalValue187_286_0 = lexicalValue187_123_0;
        break lexical_join_286;
    }
    if (!((lexicalValue187_123_0 != 0))) {
        break lexical_join_281;
    }
    life11_171 = 0x1.8p0f;
    life12_177 = (this.e + this.k);
    life13_186 = (((((com.moon.mK)(this)).a() + 0x1.3p4f) + 0x1.8p1f) - 0x1.0p0f);
    life14_194 = (this.g - (this.k * 0x1.0p1f));
    life15_196 = 0x1.5p4f;
    life16_200 = ((com.moon.setting.StringListSetting)(this.h)).getValues();
    life17_202 = 0;
    lexical_cycle_159: while (true) {
    lexical_join_270: {
    lexical_join_267: {
    lexical_join_265: {
    lexical_join_255: {
    lexical_join_254: {
    lexical_join_253: {
    lexical_join_243: {
    lexical_join_226: {
    if (!((life17_202 < ((java.util.List)(life16_200)).size()))) {
        break lexical_join_281;
    }
    life18_211 = ((java.lang.String)(((java.util.List)(life16_200)).get(((int)(life17_202)))));
    spill187_7 = ((com.moon.mK)(this)).a(((int)(p0)), ((int)(p1)), ((float)(((life12_177 + life14_194) - 0x1.3p4f))), ((float)(life13_186)), ((float)(life15_196)), ((float)(life15_196)));
    if (!((life6_19 == 0))) {
        lexicalValue187_286_0 = ((spill187_7) ? 1 : 0);
        break lexical_join_286;
    }
    if (!((life6_19 == 0))) {
        lexicalValue187_265_0 = ((spill187_7) ? 1 : 0);
        break lexical_join_265;
    }
    if (!(spill187_7)) {
        break lexical_join_255;
    }
    life19_240 = ((((java.lang.String)(life18_211)).equals(((java.lang.Object)(((com.moon.setting.StringListSetting)(this.h)).getValue())))) ? 1 : 0);
    spill187_8 = ((java.util.List)(((com.moon.setting.StringListSetting)(this.h)).getValues())).size();
    if (!((life6_19 == 0))) {
        lexicalValue187_243_0 = spill187_8;
        break lexical_join_243;
    }
    if (!((spill187_8 == 1))) {
        break lexical_join_226;
    }
    ((com.moon.hD)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__hD())).a(((com.moon.hA)(((com.moon.hB)(((com.moon.hB)(((com.moon.hB)(((com.moon.hB)(((com.moon.hB)(com.moon.hA.a__hB())).a(((java.lang.String)(__sourceIntrinsic_7c2f014c093b_invokedynamic187_56(18331, (4007194581294229289L ^ life4_3))))))).b(((java.lang.String)(__sourceIntrinsic_7c2f014c093b_invokedynamic187_58(8124, (170530363416903439L ^ life4_3))))))).a(((long)(__sourceIntrinsic_7c2f014c093b_invokedynamic187_60(13151, (8090193642170028145L ^ life4_3))))))).a(((com.moon.b8)(com.moon.b8.ERROR))))).a())));
    return ((0) != 0);
    }
    ((java.util.Map)(this.u)).remove(((java.lang.Object)(life18_211)));
    ((java.util.Map)(this.v)).remove(((java.lang.Object)(life18_211)));
    ((java.util.List)(((com.moon.setting.StringListSetting)(this.h)).getValues())).remove(((int)(life17_202)));
    lexicalValue187_243_0 = life19_240;
    }
    if (!((life6_19 == 0))) {
        lexicalValue187_254_0 = lexicalValue187_243_0;
        break lexical_join_254;
    }
    if (!((lexicalValue187_243_0 != 0))) {
        break lexical_join_253;
    }
    ((com.moon.setting.StringListSetting)(this.h)).setValue(((((java.lang.String)(((java.util.List)(life16_200)).get(((int)(0))))))));
    }
    lexicalValue187_254_0 = 0;
    }
    return ((lexicalValue187_254_0) != 0);
    }
    spill187_9 = this;
    if (!((life6_19 == 0))) {
        lexicalValue187_267_0 = spill187_9;
        break lexical_join_267;
    }
    lexicalValue187_265_0 = ((((com.moon.mK)(spill187_9)).a(((int)(p0)), ((int)(p1)), ((float)(life12_177)), ((float)(life13_186)), ((float)(life14_194)), ((float)(life15_196)))) ? 1 : 0);
    }
    if (!((lexicalValue187_265_0 != 0))) {
        break lexical_join_270;
    }
    lexicalValue187_267_0 = this;
    }
    ((com.moon.setting.StringListSetting)(((com.moon.mK)(lexicalValue187_267_0)).h)).setValue(((life18_211)));
    }
    life13_186 = (life13_186 + ((life15_196 + life11_171) - 0x1.0p0f));
    life17_202 += 1;
    if (!((life6_19 != 0))) { continue lexical_cycle_159; }
    break lexical_cycle_159;
    }
    }
    lexicalValue187_286_0 = ((super.a__Boolean(((int)(p0)), ((int)(p1)), ((int)(p2)))) ? 1 : 0);
    }
    return ((lexicalValue187_286_0) != 0);
}


private <T> T a(java.lang.Object p0) {
try {
        return ((T)(p0));
    } catch (java.lang.ClassCastException caught2) {
        return null;
    }
}


public void a(int p0, int p1, int p2) {
super.a(((int)(p0)), ((int)(p1)), ((int)(p2)));
    return;
}


public static boolean a(int p0) {
int forwardValue713_16_0;
    int forwardValue713_20_0;
    int forwardValue713_24_0;
    int forwardValue713_28_0;
    int forwardValue713_30_0;
    int spill713_0;
    long life1_3;
    int life3_5;
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    forward_join_24: {
    forward_join_20: {
    forward_join_16: {
    life1_3 = (com.moon.mK.E ^ 66424265257696L);
    life3_5 = ((com.moon.mN.d__Boolean()) ? 1 : 0);
    spill713_0 = p0;
    if (!((life3_5 == 0))) {
        forwardValue713_16_0 = spill713_0;
        break forward_join_16;
    }
    if (!((spill713_0 == __sourceIntrinsic_f3a7748b91d1_invokedynamic713_3(110, (6044855230093261854L ^ life1_3))))) {
        break forward_join_29;
    }
    forwardValue713_16_0 = ((net.minecraft.client.gui.GuiScreen.b__BooleanStatic()) ? 1 : 0);
    }
    if (!((life3_5 == 0))) {
        forwardValue713_20_0 = forwardValue713_16_0;
        break forward_join_20;
    }
    if (!((forwardValue713_16_0 != 0))) {
        break forward_join_29;
    }
    forwardValue713_20_0 = ((net.minecraft.client.gui.GuiScreen.c__Boolean()) ? 1 : 0);
    }
    if (!((life3_5 == 0))) {
        forwardValue713_24_0 = forwardValue713_20_0;
        break forward_join_24;
    }
    if (!((forwardValue713_20_0 == 0))) {
        break forward_join_29;
    }
    forwardValue713_24_0 = ((net.minecraft.client.gui.GuiScreen.d__Boolean()) ? 1 : 0);
    }
    if (!((life3_5 == 0))) {
        forwardValue713_28_0 = forwardValue713_24_0;
        break forward_join_28;
    }
    if (!((forwardValue713_24_0 == 0))) {
        break forward_join_29;
    }
    forwardValue713_28_0 = 1;
    }
    forwardValue713_30_0 = forwardValue713_28_0;
    break forward_join_30;
    }
    forwardValue713_30_0 = 0;
    }
    return ((forwardValue713_30_0) != 0);
}


private void a(int p0, int p1, int p2, java.util.function.Consumer<java.lang.String> p3, java.util.function.Consumer<java.lang.String> p4) {
com.moon.mK forwardValue715_300_0;
    int forwardValue715_300_1;
    com.moon.mK forwardValue715_301_0;
    com.moon.mK forwardValue715_302_0;
    int forwardValue715_302_1;
    int forwardValue715_346_0;
    com.moon.mK forwardValue715_372_0;
    com.moon.jm forwardValue715_392_0;
    com.moon.hW forwardValue715_392_1;
    java.lang.String forwardValue715_392_2;
    float forwardValue715_392_3;
    float forwardValue715_392_4;
    float forwardValue715_392_5;
    com.moon.jm forwardValue715_393_0;
    com.moon.hW forwardValue715_393_1;
    java.lang.String forwardValue715_393_2;
    float forwardValue715_393_3;
    float forwardValue715_393_4;
    com.moon.jm forwardValue715_394_0;
    com.moon.hW forwardValue715_394_1;
    java.lang.String forwardValue715_394_2;
    float forwardValue715_394_3;
    float forwardValue715_394_4;
    float forwardValue715_394_5;
    int forwardValue715_440_0;
    boolean spill715_0;
    com.moon.mK spill715_1;
    boolean spill715_2;
    int spill715_3;
    com.moon.mK spill715_4;
    com.moon.jm spill715_5;
    com.moon.hW spill715_6;
    java.lang.String spill715_7;
    float spill715_8;
    float spill715_9;
    float spill715_10;
    boolean spill715_11;
    long life6_3;
    com.moon.jC life9_28;
    com.moon.jC life10_61;
    com.moon.jm life11_66;
    float life12_68;
    float life13_74;
    float life14_82;
    float life15_90;
    float life16_92;
    float life14_103;
    float life16_107;
    com.moon.hW life17_112;
    com.moon.hW life18_119;
    com.moon.hW life19_127;
    java.lang.String life20_200;
    int life8_241;
    java.lang.String life21_243;
    float life22_319;
    float life23_328;
    float life24_337;
    forward_join_460: {
    forward_join_445: {
    forward_join_440: {
    forward_join_428: {
    forward_join_394: {
    forward_join_393: {
    forward_join_392: {
    forward_join_372: {
    forward_join_371: {
    forward_join_346: {
    forward_join_342: {
    forward_join_306: {
    forward_join_302: {
    forward_join_301: {
    forward_join_300: {
    life6_3 = (com.moon.mK.E ^ 63066325139202L);
    life9_28 = com.moon.jC.a(((float)(this.l)), ((float)(this.m)), ((float)(this.n)), ((float)(java.lang.Math.min(((float)((this.o - ((this.m + this.o) - (((com.moon.mK)(this)).a() + this.i))))), ((float)(this.o))))));
    life10_61 = com.moon.jC.a(((float)(java.lang.Math.max(((float)(this.l)), ((float)(((this.e + this.k) + 0x1.2p2f)))))), ((float)(this.m)), ((float)(this.n)), ((float)(java.lang.Math.min(((float)((this.o - ((this.m + this.o) - (((com.moon.mK)(this)).a() + this.i))))), ((float)(this.o))))));
    life11_66 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.MATERIAL_ICONS)));
    life12_68 = 0x1.8p0f;
    life13_74 = (this.e + this.k);
    spill715_0 = com.moon.mN.e__Boolean();
    life14_82 = ((((com.moon.mK)(this)).a() + 0x1.3p4f) + 0x1.8p1f);
    life15_90 = (this.g - (this.k * 0x1.0p1f));
    life16_92 = 0x1.5p4f;
    life14_103 = (life14_82 + (((life16_92 + life12_68) - 0x1.0p0f) * ((float) p2)));
    life16_107 = (life16_92 - 0x1.0p0f);
    life17_112 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    life18_119 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(life11_66))))).a();
    life19_127 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(this.a))))).a();
    ((com.moon.hW)(life17_112)).a(((com.moon.iX)(com.moon.i3.a(((float)((life13_74 + 0x1.0p-1f))), ((float)((life14_103 + 0x1.0p-1f))), ((float)(((life15_90 - (life16_107 * 0x1.0p1f)) - 0x1.0p0f))), ((float)((life16_107 - 0x1.0p0f))), ((float)(0x1.4p2f)), ((int)(((com.v)(this.p)).u()))))));
    ((com.moon.hW)(life17_112)).a(((com.moon.iX)(com.moon.i3.a(((float)((((life13_74 + life15_90) - (life16_107 * 0x1.0p1f)) + 0x1.0p-1f))), ((float)((life14_103 + 0x1.0p-1f))), ((float)((life16_107 - 0x1.0p0f))), ((float)((life16_107 - 0x1.0p0f))), ((float)(0x1.4p2f)), ((int)(((com.v)(this.p)).m()))))));
    ((com.moon.hW)(life17_112)).a(((com.moon.iX)(com.moon.i3.a(((float)((((life13_74 + life15_90) - life16_107) + 0x1.0p-1f))), ((float)((life14_103 + 0x1.0p-1f))), ((float)((life16_107 - 0x1.0p0f))), ((float)((life16_107 - 0x1.0p0f))), ((float)(0x1.4p2f)), ((int)(((com.v)(this.p)).a()))))));
    life20_200 = "";
    ((com.moon.jm)(life11_66)).a(((com.moon.hW)(life18_119)), ((java.lang.String)(life20_200)), ((float)(0x1.39999ap3f)), ((float)(((((life13_74 + life15_90) - (life16_107 * 0x1.0p1f)) + (life16_107 / 0x1.0p1f)) - (((com.moon.jm)(life11_66)).a(((java.lang.String)(life20_200)), ((float)(0x1.39999ap3f))) / 0x1.0p1f)))), ((float)((((life14_103 + (life16_107 / 0x1.0p1f)) - (((com.moon.jm)(life11_66)).a(((float)(0x1.1p3f))) / 0x1.0p1f)) + 0x1.0p0f))), ((int)(((com.v)(this.p)).n())), ((boolean)(false)));
    life8_241 = ((spill715_0) ? 1 : 0);
    life21_243 = "";
    ((com.moon.jm)(life11_66)).a(((com.moon.hW)(life18_119)), ((java.lang.String)(life21_243)), ((float)(0x1.39999ap3f)), ((float)(((((life13_74 + life15_90) - life16_107) + (life16_107 / 0x1.0p1f)) - (__sourceExactCall_b8cf447caf8b81(((com.moon.jm)(life11_66)), ((java.lang.String)(life21_243)), ((float)(0x1.39999ap3f))) / 0x1.0p1f)))), ((float)((((life14_103 + (life16_107 / 0x1.0p1f)) - (__sourceExactCall_65a34d18088a70(((com.moon.jm)(life11_66)), ((float)(0x1.1p3f))) / 0x1.0p1f)) + 0x1.0p0f))), ((int)(__sourceExactCall_66349b953a09b2(((com.v)(this.p))))), ((boolean)(false)));
    if (!((recovery.source.CarrierOps.lcmp(((long)((java.lang.System.currentTimeMillis() - this.B))), ((long)(__sourceIntrinsic_3f057a06d49f_invokedynamic715_76(16684, (446695054076470295L ^ life6_3))))) > 0))) {
        break forward_join_306;
    }
    spill715_1 = this;
    spill715_2 = this.z;
    if (!((life8_241 != 0))) {
        forwardValue715_300_0 = spill715_1;
        forwardValue715_300_1 = ((spill715_2) ? 1 : 0);
        break forward_join_300;
    }
    if (!((!spill715_2))) {
        forwardValue715_301_0 = spill715_1;
        break forward_join_301;
    }
    forwardValue715_300_0 = spill715_1;
    forwardValue715_300_1 = 1;
    }
    forwardValue715_302_0 = forwardValue715_300_0;
    forwardValue715_302_1 = forwardValue715_300_1;
    break forward_join_302;
    }
    forwardValue715_302_0 = forwardValue715_301_0;
    forwardValue715_302_1 = 0;
    }
    ((com.moon.mK)(forwardValue715_302_0)).z = ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue715_302_1)));
    this.B = ((long)(java.lang.System.currentTimeMillis()));
    }
    life22_319 = ((life15_90 - (life16_107 * 0x1.0p1f)) - 0x1.0p3f);
    life23_328 = (((com.moon.jm)(this.a)).a(((java.lang.String)(this.y)), ((float)(0x1.0147acp3f))) - life22_319);
    life24_337 = (((com.moon.jm)(this.a)).a(((java.lang.String)(this.y)), ((float)(0x1.0147acp3f))) + 0x1.4p2f);
    spill715_3 = recovery.source.CarrierOps.fcmpl(((float)(life23_328)), ((float)(0x0.0p0f)));
    if (!((life8_241 != 0))) {
        forwardValue715_346_0 = spill715_3;
        break forward_join_346;
    }
    if (!((spill715_3 > 0))) {
        break forward_join_342;
    }
    life24_337 = (life24_337 - life23_328);
    }
    spill715_4 = this;
    if (!((life8_241 != 0))) {
        forwardValue715_372_0 = spill715_4;
        break forward_join_372;
    }
    forwardValue715_346_0 = ((((com.moon.mK)(spill715_4)).z) ? 1 : 0);
    }
    if (!((forwardValue715_346_0 != 0))) {
        break forward_join_371;
    }
    ((com.moon.hW)(life17_112)).a(((com.moon.iX)(com.moon.i3.a(((float)(((this.e + this.k) + life24_337))), ((float)((life14_103 + 0x1.4p2f))), ((float)(0x1.0p1f)), ((float)((((com.moon.jm)(this.a)).a(((float)(0x1.0147acp3f))) + 0x1.0p-1f))), ((float)(0x0.0p0f)), ((int)(((com.v)(this.p)).v()))))));
    }
    forwardValue715_372_0 = this;
    }
    spill715_5 = ((com.moon.mK)(forwardValue715_372_0)).a;
    spill715_6 = life19_127;
    spill715_7 = this.y;
    spill715_8 = 0x1.0147acp3f;
    spill715_9 = ((__sourceExactCall_7d604da93fde99(((com.moon.mK)(this))) + this.k) + 0x1.2p2f);
    spill715_10 = life23_328;
    if (!((life8_241 != 0))) {
        forwardValue715_392_0 = spill715_5;
        forwardValue715_392_1 = spill715_6;
        forwardValue715_392_2 = spill715_7;
        forwardValue715_392_3 = spill715_8;
        forwardValue715_392_4 = spill715_9;
        forwardValue715_392_5 = spill715_10;
        break forward_join_392;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(spill715_10)), ((float)(0x0.0p0f))) > 0))) {
        forwardValue715_393_0 = spill715_5;
        forwardValue715_393_1 = spill715_6;
        forwardValue715_393_2 = spill715_7;
        forwardValue715_393_3 = spill715_8;
        forwardValue715_393_4 = spill715_9;
        break forward_join_393;
    }
    forwardValue715_392_0 = spill715_5;
    forwardValue715_392_1 = spill715_6;
    forwardValue715_392_2 = spill715_7;
    forwardValue715_392_3 = spill715_8;
    forwardValue715_392_4 = spill715_9;
    forwardValue715_392_5 = (-life23_328);
    }
    forwardValue715_394_0 = forwardValue715_392_0;
    forwardValue715_394_1 = forwardValue715_392_1;
    forwardValue715_394_2 = forwardValue715_392_2;
    forwardValue715_394_3 = forwardValue715_392_3;
    forwardValue715_394_4 = forwardValue715_392_4;
    forwardValue715_394_5 = forwardValue715_392_5;
    break forward_join_394;
    }
    forwardValue715_394_0 = forwardValue715_393_0;
    forwardValue715_394_1 = forwardValue715_393_1;
    forwardValue715_394_2 = forwardValue715_393_2;
    forwardValue715_394_3 = forwardValue715_393_3;
    forwardValue715_394_4 = forwardValue715_393_4;
    forwardValue715_394_5 = 0x0.0p0f;
    }
    __sourceExactCall_1949570a13ee94(((com.moon.jm)(forwardValue715_394_0)), ((com.moon.hW)(forwardValue715_394_1)), ((java.lang.String)(forwardValue715_394_2)), ((float)(forwardValue715_394_3)), ((float)((forwardValue715_394_4 + forwardValue715_394_5))), ((float)((life14_103 + 0x1.8p2f))), ((int)(((com.v)(this.p)).v())));
    if (!((life8_241 != 0))) {
        break forward_join_460;
    }
    if (!(org.lwjgl.input.Mouse.isButtonDown(((int)(0))))) {
        break forward_join_445;
    }
    spill715_11 = ((com.moon.mK)(this)).a(((int)(p0)), ((int)(p1)), ((float)(((life13_74 + life15_90) - (life16_107 * 0x1.0p1f)))), ((float)(life14_103)), ((float)(life16_107)), ((float)(life16_107)));
    if (!((life8_241 != 0))) {
        forwardValue715_440_0 = ((spill715_11) ? 1 : 0);
        break forward_join_440;
    }
    if (!(spill715_11)) {
        break forward_join_428;
    }
    ((java.util.function.Consumer)(p4)).accept(((java.lang.Object)(this.y)));
    }
    forwardValue715_440_0 = ((((com.moon.mK)(this)).a(((int)(p0)), ((int)(p1)), ((float)(((life13_74 + life15_90) - life16_107))), ((float)(life14_103)), ((float)(life16_107)), ((float)(life16_107)))) ? 1 : 0);
    }
    if (!((forwardValue715_440_0 != 0))) {
        break forward_join_445;
    }
    ((java.util.function.Consumer)(p3)).accept(((java.lang.Object)(this.y)));
    }
    ((com.moon.hW)(life17_112)).a(((com.moon.jA)(life9_28)));
    ((com.moon.hW)(life19_127)).a(((com.moon.jA)(life10_61)));
    ((com.moon.hW)(life18_119)).a(((com.moon.jA)(life9_28)));
    __sourceExactCall_247fe3d2bc87d6(((com.moon.hW)(life17_112)));
    __sourceExactCall_247fe3d2bc87d6(((com.moon.hW)(life18_119)));
    __sourceExactCall_247fe3d2bc87d6(((com.moon.hW)(life19_127)));
    }
    return;
}


public boolean a__Boolean() {
return (__sourceIntrinsic_booleanComparison((((com.moon.setting.StringListSetting)(this.h)).isAvailable())) != 0);
}


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
        byte[] spill943_0 = p0;
        life4_9 += 1;
        life5_44 = (spill943_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill943_1 = p0;
        life4_9 += 1;
        life5_76 = (spill943_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill943_2 = p0;
        life4_9 += 1;
        life5_91 = (spill943_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.ClassCastException a(java.lang.ClassCastException p0) {
return p0;
}


private static java.lang.String a(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 12583);
    if (((com.moon.mK.G)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.mK.H)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.mK.H)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/mK", life9_51);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_71: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life4_21)[1])))).generateSecret(((java.security.spec.KeySpec)(life7_92)));
        ((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).init(((int)(2)), ((java.security.Key)(life8_99)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life4_21)[2])))));
        life9_116 = ((java.lang.String)((com.moon.mK.F)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.mK.G)[life5_8] = __sourceExactCall_5e0073dc205a06(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.mK.G)[life5_8];
}


private void lambda$drawSettings$0(java.lang.String p0) {
((com.moon.setting.StringListSetting)(this.h)).add(((java.lang.String)(p0)));
    this.w = ((boolean)(false));
    this.C = ((boolean)(true));
    return;
}


private void lambda$drawSettings$1(java.lang.String p0) {
this.w = ((boolean)(false));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_f7d59ba1def0_invokedynamic100028_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_f7d59ba1def0_invokedynamic100028_30(java.lang.String a0, char a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f3a7748b91d1_invokedynamic713_3(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_fd0ba049c90e_call714_11(com.moon.mK a0, int a1, int a2) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_3f057a06d49f_invokedynamic715_76(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral2213_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7c2f014c093b_invokedynamic187_56(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7c2f014c093b_invokedynamic187_58(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_7c2f014c093b_invokedynamic187_60(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral2206_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_505b8c2844d4_invokedynamic188_29(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2208_0() throws E;

private static native <E extends Throwable> java.util.function.Consumer __sourceIntrinsic_c9a4d6bd89d4_invokedynamic189_141(com.moon.mK a0) throws E;

private static native <E extends Throwable> java.util.function.Consumer __sourceIntrinsic_c9a4d6bd89d4_invokedynamic189_142(com.moon.mK a0) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native int __sourceExactCall_075ec89791e6c8(int p0, long p1);
private static native long __sourceExactCall_5d31f6b4d662c1(int p0, long p1);
private static native java.lang.String __sourceExactCall_3f214ae79ed92b(int p0, long p1);
private static native boolean __sourceExactCall_f3ecfecc707d9b(int p0);
private static native java.lang.String __sourceExactCall_5e0073dc205a06(byte[] p0);

private static native float __sourceExactCall_bf9871e16b7660(com.moon.nX p0);
private static native void __sourceExactCall_247fe3d2bc87d6(com.moon.hW p0);
private static native float __sourceExactCall_6c15b7b6fabc45(com.moon.jm p0, java.lang.String p1, float p2);
private static native void __sourceExactCall_1949570a13ee94(com.moon.jm p0, com.moon.hW p1, java.lang.String p2, float p3, float p4, float p5, int p6);
private static native float __sourceExactCall_7d604da93fde99(com.moon.mK p0);

private static native float __sourceExactCall_b8cf447caf8b81(com.moon.jm p0, java.lang.String p1, float p2);
private static native float __sourceExactCall_65a34d18088a70(com.moon.jm p0, float p1);
private static native void __sourceExactCall_644ec120141bcc(com.moon.hW p0, com.moon.iX p1);

private static native int __sourceExactCall_66349b953a09b2(com.v p0);
}
