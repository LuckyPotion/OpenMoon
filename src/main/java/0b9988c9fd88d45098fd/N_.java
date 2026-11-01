package moom;


public class N_ {

private static long a;

private static java.lang.String[] b;

private static java.lang.String[] c;

private static java.util.Map d;

public N_() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(-7897935923525843707L)), ((long)(-2573645515621618623L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(24635255149169L)))));
    d = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.N_.a ^ 79338040512843L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill880_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill880_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill880_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill880_14 = new byte[8];
    (__sourceSpill880_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill880_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation880_16 = __sourceSpill880_14;
    ((javax.crypto.Cipher)(__sourceSpill880_11)).init(((int)(__sourceSpill880_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill880_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation880_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[6];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "\004\177Ç\037í\000{G,îÐ%Iã,\nÆsì?ú¥è¥²¼Xm³´[ö\023\037Ð\033h/«\030nò\ntm3c\034õ\r$®k¶|iI8¾mæA«\024\037.\005ãÍ:\013\016QÝÜ¤\bÏ\007ð=%Þ\\\b\001b{V:\004e\035K\027© ´±Ä\\7\013\000ï\005@\002\026/ÿ(¼PºÁPÑáÅ.å³7ë¦®·ÂJ§'\022ä£ñ¥4(\006Xå|¬ð¿t÷õ"))).length();
    int local5_life24 = 48;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill880_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill880_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill880_29)).doFinal(((byte[])(__sourceSpill880_28)));
        java.lang.String __sourceSpill880_34 = ((java.lang.String)(moom.N_.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill880_35 = local9_life19;
        int __sourceSpill880_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill880_35)[__sourceSpill880_36] = __sourceSpill880_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    local8_life23 = ((java.lang.String)((local6_life21 = "¡\017k­\0272QÏC\"o-(ç\000°H\023æ¨W\023.jå©É­\n\004x½ò\033¸#éôSPï\034(Ç[ôä\027\033mûµ \005s7Ø½ |ßN{øØÙ.Â¡QWàÙ.ÉÄ½a"))).length();
    local5_life24 = 48;
    local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill880_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill880_43 = local2_life9;
        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill880_43)).doFinal(((byte[])(__sourceSpill880_42)));
        java.lang.String __sourceSpill880_48 = ((java.lang.String)(moom.N_.a(((byte[])(local10_life45))))).intern();
        java.lang.String[] __sourceSpill880_49 = local9_life19;
        int __sourceSpill880_50 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill880_49)[__sourceSpill880_50] = __sourceSpill880_48;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    b = ((java.lang.String[])(local9_life19));
    c = ((java.lang.String[])(new java.lang.String[6]));
}

private static native <E extends Throwable> java.lang.String[] __sourceHandlerCall_adb0a58bfc57c502a059(java.io.File a0, java.lang.String a1, java.lang.String[] a2, java.lang.String[] a3) throws E;
private static final class __SourceHandler_adb0a58bfc57c502a059 {

public static java.lang.String[] f147(java.io.File p0, java.lang.String p1, java.lang.String[] p2, java.lang.String[] p3) throws Throwable {
    java.io.File[] lexicalValue147_27_0;
    int lexicalValue147_66_0;
    int lexicalValue147_72_0;
    int lexicalValue147_78_0;
    int lexicalValue147_83_0;
    java.lang.Object[] lexicalValue147_107_0;
    int spill147_0;
    java.io.File[] spill147_1;
    java.io.File[] spill147_2;
    boolean spill147_3;
    boolean spill147_4;
    long life4_3;
    java.util.ArrayList life7_8;
    int life6_9;
    java.lang.String life8_15;
    java.io.File[] life9_18;
    java.io.File[] life10_32;
    int life11_35;
    int life12_37;
    java.io.File life13_46;
    java.lang.String life14_59;
    java.lang.String life14_114;
    java.lang.String[] life15_120;
    lexical_join_107: {
    lexical_join_103: {
    lexical_join_27: {
    lexical_join_26: {
    life4_3 = (__fieldRead147_0() ^ 136157286467166L);
    spill147_0 = __call147_1();
    life7_8 = new java.util.ArrayList();
    life6_9 = spill147_0;
    life8_15 = __invokedynamic147_2(11060, (5505048694169934202L ^ life4_3));
    life9_18 = __call147_3(p0);
    spill147_1 = life9_18;
    if (!((life6_9 == 0))) {
        lexicalValue147_27_0 = spill147_1;
        break lexical_join_27;
    }
    if (!((spill147_1 == null))) {
        break lexical_join_26;
    }
    return new java.lang.String[0];
    }
    lexicalValue147_27_0 = life9_18;
    }
    life10_32 = lexicalValue147_27_0;
    life11_35 = (life10_32).length;
    life12_37 = 0;
    lexical_cycle_33: while (true) {
    lexical_join_100: {
    lexical_join_83: {
    lexical_join_81: {
    lexical_join_79: {
    lexical_join_78: {
    lexical_join_72: {
    lexical_join_66: {
    if (!((life12_37 < life11_35))) {
        break lexical_join_103;
    }
    spill147_2 = life10_32;
    if (!((life6_9 == 0))) {
        lexicalValue147_107_0 = spill147_2;
        break lexical_join_107;
    }
    life13_46 = (spill147_2)[life12_37];
    spill147_3 = __call147_4(life13_46);
    if (!((life6_9 == 0))) {
        lexicalValue147_83_0 = __integerCategory147_5(spill147_3);
        break lexical_join_83;
    }
    if (!(spill147_3)) {
        break lexical_join_81;
    }
    life14_59 = __invokedynamic147_7(p1, __call147_6(life13_46));
    spill147_4 = __call147_8(life14_59, life8_15);
    if (!((life6_9 == 0))) {
        lexicalValue147_66_0 = __integerCategory147_9(spill147_4);
        break lexical_join_66;
    }
    if (!(spill147_4)) {
        break lexical_join_79;
    }
    life14_59 = __call147_11(life14_59, __call147_10(life8_15));
    lexicalValue147_66_0 = __integerCategory147_13(__call147_12(life14_59, p2));
    }
    if (!((life6_9 == 0))) {
        lexicalValue147_72_0 = lexicalValue147_66_0;
        break lexical_join_72;
    }
    if (!((lexicalValue147_66_0 != 0))) {
        break lexical_join_79;
    }
    lexicalValue147_72_0 = __integerCategory147_15(__call147_14(life14_59, p3));
    }
    if (!((life6_9 == 0))) {
        lexicalValue147_78_0 = lexicalValue147_72_0;
        break lexical_join_78;
    }
    if (!((lexicalValue147_72_0 != 0))) {
        break lexical_join_79;
    }
    lexicalValue147_78_0 = __integerCategory147_17(__call147_16(life7_8, life14_59));
    }
    __discardScalar147_18(lexicalValue147_78_0);
    }
    if (!((life6_9 != 0))) {
        break lexical_join_100;
    }
    }
    lexicalValue147_83_0 = __integerCategory147_20(__call147_19(life13_46));
    }
    if (!((lexicalValue147_83_0 != 0))) {
        break lexical_join_100;
    }
    life14_114 = __invokedynamic147_22(p1, __call147_21(life13_46));
    life15_120 = __call147_23(life13_46, life14_114, p2, p3);
    __call147_25(life7_8, __call147_24(life15_120));
    }
    life12_37 += 1;
    if (!((life6_9 != 0))) { continue lexical_cycle_33; }
    break lexical_cycle_33;
    }
    }
    lexicalValue147_107_0 = __call147_26(life7_8, new java.lang.String[0]);
    }
    return __cast147_27(lexicalValue147_107_0);
}
public static void h147_0(moom.Oo p0) throws Throwable {
    throw __call1014700_0(p0);
}
public static void h147_1(moom.Oo p0) throws Throwable {
    throw __call1014701_0(p0);
}
public static void h147_2(moom.Oo p0) throws Throwable {
    throw __call1014702_0(p0);
}
public static void h147_3(moom.Oo p0) throws Throwable {
    throw __call1014703_0(p0);
}
public static void h147_4(moom.Oo p0) throws Throwable {
    throw __call1014704_0(p0);
}
public static void h147_5(moom.Oo p0) throws Throwable {
    throw __call1014705_0(p0);
}
public static void h147_6(moom.Oo p0) throws Throwable {
    throw __call1014706_0(p0);
}
public static void h147_7(moom.Oo p0) throws Throwable {
    throw __call1014707_0(p0);
}
public static void h147_8(moom.Oo p0) throws Throwable {
    throw __call1014708_0(p0);
}
private static native long __fieldRead147_0() throws Throwable;
private static native int __call147_1() throws Throwable;
private static native java.lang.String __invokedynamic147_2(int a0, long a1) throws Throwable;
private static native java.io.File[] __call147_3(java.io.File a0) throws Throwable;
private static native boolean __call147_4(java.io.File a0) throws Throwable;
private static native int __integerCategory147_5(boolean value) throws Throwable;
private static native java.lang.String __call147_6(java.io.File a0) throws Throwable;
private static native java.lang.String __invokedynamic147_7(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native boolean __call147_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory147_9(boolean value) throws Throwable;
private static native int __call147_10(java.lang.String a0) throws Throwable;
private static native java.lang.String __call147_11(java.lang.String a0, int a1) throws Throwable;
private static native boolean __call147_12(java.lang.String a0, java.lang.String[] a1) throws Throwable;
private static native int __integerCategory147_13(boolean value) throws Throwable;
private static native boolean __call147_14(java.lang.String a0, java.lang.String[] a1) throws Throwable;
private static native int __integerCategory147_15(boolean value) throws Throwable;
private static native boolean __call147_16(java.util.ArrayList a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory147_17(boolean value) throws Throwable;
private static native void __discardScalar147_18(int a0) throws Throwable;
private static native boolean __call147_19(java.io.File a0) throws Throwable;
private static native int __integerCategory147_20(boolean value) throws Throwable;
private static native java.lang.String __call147_21(java.io.File a0) throws Throwable;
private static native java.lang.String __invokedynamic147_22(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String[] __call147_23(java.io.File a0, java.lang.String a1, java.lang.String[] a2, java.lang.String[] a3) throws Throwable;
private static native java.util.List __call147_24(java.lang.String[] a0) throws Throwable;
private static native boolean __call147_25(java.util.ArrayList a0, java.util.List a1) throws Throwable;
private static native java.lang.Object[] __call147_26(java.util.ArrayList a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.String[] __cast147_27(java.lang.Object[] a0) throws Throwable;
private static native java.lang.Exception __call1014700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1014701_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1014702_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1014703_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1014704_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1014705_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1014706_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1014707_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1014708_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String[] __sourceHandlerCall_142aae559a4cde3d105b(java.io.File a0, java.lang.String[] a1, java.lang.String[] a2) throws E;
private static final class __SourceHandler_142aae559a4cde3d105b {

public static java.lang.String[] f367(java.io.File p0, java.lang.String[] p1, java.lang.String[] p2) throws Throwable {
    int lexicalValue367_50_0;
    int lexicalValue367_56_0;
    int lexicalValue367_62_0;
    int spill367_0;
    boolean spill367_1;
    long life3_3;
    java.util.ArrayList life6_7;
    java.lang.String life7_14;
    int life5_15;
    java.util.zip.ZipFile life8_20;
    java.util.Enumeration life9_23;
    java.util.zip.ZipEntry life10_30;
    java.lang.String life11_33;
    lexical_join_67: {
    lexical_join_65: {
    life3_3 = (__fieldRead367_0() ^ 44519568492629L);
    life6_7 = new java.util.ArrayList();
    spill367_0 = __call367_1();
    life7_14 = __invokedynamic367_2(8544, (1844002368994106656L ^ life3_3));
    life5_15 = spill367_0;
    life8_20 = new java.util.zip.ZipFile(p0);
    life9_23 = __call367_3(life8_20);
    lexical_cycle_24: while (true) {
    lexical_join_63: {
    lexical_join_62: {
    lexical_join_56: {
    lexical_join_50: {
    if (!(__call367_4(life9_23))) {
        break lexical_join_65;
    }
    life10_30 = __cast367_6(__call367_5(life9_23));
    life11_33 = __call367_7(life10_30);
    if (!((life5_15 != 0))) {
        break lexical_join_67;
    }
    spill367_1 = __call367_8(life11_33, life7_14);
    if (!((life5_15 != 0))) {
        lexicalValue367_50_0 = __integerCategory367_9(spill367_1);
        break lexical_join_50;
    }
    if (!(spill367_1)) {
        break lexical_join_63;
    }
    life11_33 = __call367_11(life11_33, __call367_10(life7_14));
    lexicalValue367_50_0 = __integerCategory367_13(__call367_12(life11_33, p1));
    }
    if (!((life5_15 != 0))) {
        lexicalValue367_56_0 = lexicalValue367_50_0;
        break lexical_join_56;
    }
    if (!((lexicalValue367_50_0 != 0))) {
        break lexical_join_63;
    }
    lexicalValue367_56_0 = __integerCategory367_15(__call367_14(life11_33, p2));
    }
    if (!((life5_15 != 0))) {
        lexicalValue367_62_0 = lexicalValue367_56_0;
        break lexical_join_62;
    }
    if (!((lexicalValue367_56_0 != 0))) {
        break lexical_join_63;
    }
    lexicalValue367_62_0 = __integerCategory367_17(__call367_16(life6_7, life11_33));
    }
    __discardScalar367_18(lexicalValue367_62_0);
    }
    if (!((life5_15 == 0))) { continue lexical_cycle_24; }
    break lexical_cycle_24;
    }
    }
    __call367_19(life8_20);
    }
    return __cast367_21(__call367_20(life6_7, new java.lang.String[0]));
}
public static java.lang.String[] h367_0(java.io.IOException p0) throws Throwable {
    throw __call2036700_0(p0);
}
public static java.lang.String[] h367_1(java.io.IOException p0) throws Throwable {
    throw __call2036701_0(p0);
}
public static java.lang.String[] h367_2(java.io.IOException p0) throws Throwable {
    throw __call2036702_0(p0);
}
public static java.lang.String[] h367_3(java.io.IOException p0) throws Throwable {
    throw __call2036703_0(p0);
}
public static java.lang.String[] h367_4(java.io.IOException p0) throws Throwable {
    throw __call2036704_0(p0);
}
public static java.lang.String[] h367_5(java.io.IOException p0) throws Throwable {
    throw __call2036705_0(p0);
}
public static java.lang.String[] h367_6(java.io.IOException p0) throws Throwable {
    java.io.IOException local1 = p0;
    __call2036706_0(local1);
    return new java.lang.String[0];
}
private static native long __fieldRead367_0() throws Throwable;
private static native int __call367_1() throws Throwable;
private static native java.lang.String __invokedynamic367_2(int a0, long a1) throws Throwable;
private static native java.util.Enumeration __call367_3(java.util.zip.ZipFile a0) throws Throwable;
private static native boolean __call367_4(java.util.Enumeration a0) throws Throwable;
private static native java.lang.Object __call367_5(java.util.Enumeration a0) throws Throwable;
private static native java.util.zip.ZipEntry __cast367_6(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call367_7(java.util.zip.ZipEntry a0) throws Throwable;
private static native boolean __call367_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory367_9(boolean value) throws Throwable;
private static native int __call367_10(java.lang.String a0) throws Throwable;
private static native java.lang.String __call367_11(java.lang.String a0, int a1) throws Throwable;
private static native boolean __call367_12(java.lang.String a0, java.lang.String[] a1) throws Throwable;
private static native int __integerCategory367_13(boolean value) throws Throwable;
private static native boolean __call367_14(java.lang.String a0, java.lang.String[] a1) throws Throwable;
private static native int __integerCategory367_15(boolean value) throws Throwable;
private static native boolean __call367_16(java.util.ArrayList a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory367_17(boolean value) throws Throwable;
private static native void __discardScalar367_18(int a0) throws Throwable;
private static native void __call367_19(java.util.zip.ZipFile a0) throws Throwable;
private static native java.lang.Object[] __call367_20(java.util.ArrayList a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.String[] __cast367_21(java.lang.Object[] a0) throws Throwable;
private static native java.lang.Exception __call2036700_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2036701_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2036702_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2036703_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2036704_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2036705_0(java.io.IOException a0) throws Throwable;
private static native void __call2036706_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> java.util.Properties __sourceHandlerCall_b5a414c8cd1082b7ee35(java.io.InputStream a0, java.lang.String a1) throws E;
private static final class __SourceHandler_b5a414c8cd1082b7ee35 {

public static java.util.Properties f368(java.io.InputStream p0, java.lang.String p1) throws Throwable {
    long life2_3;
    moom.OH life4_13;
    life2_3 = (__fieldRead368_0() ^ 115205064140990L);
    if ((p0 == null)) {
        return null;
    }
    life4_13 = new moom.OH();
    __call368_1(life4_13, p0);
    __call368_2(p0);
    return life4_13;
}
public static java.util.Properties h368_0(java.io.IOException p0) throws Throwable {
    throw __call2036800_0(p0);
}
public static java.util.Properties h368_1(java.io.IOException p0) throws Throwable {
    java.io.IOException local1 = p0;
    return null;
}
private static native long __fieldRead368_0() throws Throwable;
private static native void __call368_1(moom.OH a0, java.io.InputStream a1) throws Throwable;
private static native void __call368_2(java.io.InputStream a0) throws Throwable;
private static native java.lang.Exception __call2036800_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> java.util.Properties __sourceHandlerCall_e1d3e3e6a7464af79498(java.lang.String a0, java.lang.String a1) throws E;
private static final class __SourceHandler_e1d3e3e6a7464af79498 {

public static java.util.Properties f369(java.lang.String p0, java.lang.String p1) throws Throwable {
    long life2_3;
    moom.DD life4_8;
    java.io.InputStream life5_11;
    moom.OH life6_19;
    life2_3 = (__fieldRead369_0() ^ 99176250547255L);
    life4_8 = new moom.DD(p0);
    life5_11 = __call369_1(life4_8);
    if ((life5_11 == null)) {
        return null;
    }
    life6_19 = new moom.OH();
    __call369_2(life6_19, life5_11);
    __call369_3(life5_11);
    java.lang.String spill369_0 = p1;
    java.lang.String __stackOp369_5_0 = p0;
    java.lang.String __stackOp369_5_1 = __invokedynamic369_4(3220, (3068410739668722866L ^ life2_3));
    __call369_7(__invokedynamic369_6(spill369_0, __stackOp369_5_1, __stackOp369_5_0));
    return life6_19;
}
public static java.util.Properties h369_0(java.io.FileNotFoundException p0) throws Throwable {
    java.io.FileNotFoundException local1 = p0;
    return null;
}
public static java.util.Properties h369_1(java.io.IOException p0, java.lang.String p1, java.lang.String p2, long p3) throws Throwable {
    java.io.IOException local5 = p0;
    java.lang.String spill2036901_0 = p2;
    java.lang.String __stackOp2036901_1_0 = p1;
    java.lang.String __stackOp2036901_1_1 = __invokedynamic2036901_0(6382, (3236696976557879498L ^ p3));
    __call2036901_3(__invokedynamic2036901_2(spill2036901_0, __stackOp2036901_1_1, __stackOp2036901_1_0));
    return null;
}
private static native long __fieldRead369_0() throws Throwable;
private static native java.io.InputStream __call369_1(moom.DD a0) throws Throwable;
private static native void __call369_2(moom.OH a0, java.io.InputStream a1) throws Throwable;
private static native void __call369_3(java.io.InputStream a0) throws Throwable;
private static native java.lang.String __invokedynamic369_4(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic369_6(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call369_7(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic2036901_0(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic2036901_2(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call2036901_3(java.lang.String a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String[] __sourceHandlerCall_d768bc0e56900b86f15e(net.minecraft.client.resources.IResourcePack a0, java.lang.String[] a1) throws E;
private static final class __SourceHandler_d768bc0e56900b86f15e {

public static java.lang.String[] f982(net.minecraft.client.resources.IResourcePack p0, java.lang.String[] p1) throws Throwable {
    java.lang.String[] lexicalValue982_12_0;
    java.lang.String[] lexicalValue982_56_0;
    java.lang.String[] spill982_0;
    java.lang.String[] spill982_1;
    long life2_3;
    int life4_5;
    java.util.ArrayList life5_22;
    java.lang.String[] life6_24;
    int life7_27;
    int life8_29;
    java.lang.String life9_38;
    moom.DD life10_43;
    lexical_join_56: {
    lexical_join_51: {
    lexical_join_13: {
    lexical_join_12: {
    life2_3 = (__fieldRead982_0() ^ 108440807703860L);
    life4_5 = __call982_1();
    spill982_0 = p1;
    if (!((life4_5 == 0))) {
        lexicalValue982_12_0 = spill982_0;
        break lexical_join_12;
    }
    if (!((spill982_0 == null))) {
        break lexical_join_13;
    }
    lexicalValue982_12_0 = new java.lang.String[0];
    }
    return lexicalValue982_12_0;
    }
    life5_22 = new java.util.ArrayList();
    life6_24 = p1;
    life7_27 = (life6_24).length;
    life8_29 = 0;
    lexical_cycle_24: while (true) {
    lexical_join_49: {
    lexical_join_48: {
    if (!((life8_29 < life7_27))) {
        break lexical_join_51;
    }
    spill982_1 = life6_24;
    if (!((life4_5 == 0))) {
        lexicalValue982_56_0 = spill982_1;
        break lexical_join_56;
    }
    life9_38 = (spill982_1)[life8_29];
    life10_43 = new moom.DD(life9_38);
    if (!((life4_5 == 0))) {
        break lexical_join_49;
    }
    if (!(__call982_2(p0, life10_43))) {
        break lexical_join_48;
    }
    __call982_3(life5_22, life9_38);
    }
    life8_29 += 1;
    }
    if (!((life4_5 != 0))) { continue lexical_cycle_24; }
    break lexical_cycle_24;
    }
    }
    lexicalValue982_56_0 = __cast982_5(__call982_4(life5_22, new java.lang.String[0]));
    }
    return lexicalValue982_56_0;
}
public static void h982_0(moom.Oo p0) throws Throwable {
    throw __call1098200_0(p0);
}
public static void h982_1(moom.Oo p0) throws Throwable {
    throw __call1098201_0(p0);
}
public static void h982_2(moom.Oo p0) throws Throwable {
    throw __call1098202_0(p0);
}
public static void h982_3(moom.Oo p0) throws Throwable {
    throw __call1098203_0(p0);
}
private static native long __fieldRead982_0() throws Throwable;
private static native int __call982_1() throws Throwable;
private static native boolean __call982_2(net.minecraft.client.resources.IResourcePack a0, moom.DD a1) throws Throwable;
private static native boolean __call982_3(java.util.ArrayList a0, java.lang.String a1) throws Throwable;
private static native java.lang.Object[] __call982_4(java.util.ArrayList a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.String[] __cast982_5(java.lang.Object[] a0) throws Throwable;
private static native java.lang.Exception __call1098200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1098201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1098202_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1098203_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String[] __sourceHandlerCall_a8aa16d6fb4a1ffb988e(net.minecraft.client.resources.IResourcePack a0, java.lang.String[] a1, java.lang.String[] a2, java.lang.String[] a3) throws E;
private static final class __SourceHandler_a8aa16d6fb4a1ffb988e {

public static java.lang.String[] f148(net.minecraft.client.resources.IResourcePack p0, java.lang.String[] p1, java.lang.String[] p2, java.lang.String[] p3) throws Throwable {
    int forwardValue148_17_0;
    int forwardValue148_35_0;
    java.io.File forwardValue148_48_0;
    int forwardValue148_60_0;
    int forwardValue148_78_0;
    int spill148_0;
    java.io.File spill148_1;
    boolean spill148_2;
    long life4_3;
    int life6_5;
    net.minecraft.client.resources.AbstractResourcePack life7_30;
    java.io.File life8_50;
    forward_join_78: {
    forward_join_68: {
    forward_join_60: {
    forward_join_58: {
    forward_join_48: {
    forward_join_47: {
    forward_join_37: {
    forward_join_35: {
    forward_join_25: {
    forward_join_17: {
    forward_join_15: {
    life4_3 = (__fieldRead148_0() ^ 29586326723231L);
    life6_5 = __call148_1();
    spill148_0 = __instanceOf148_2(p0);
    if (!((life6_5 != 0))) {
        forwardValue148_17_0 = spill148_0;
        break forward_join_17;
    }
    if (!((spill148_0 != 0))) {
        break forward_join_15;
    }
    return __call148_3(p0, p3);
    }
    forwardValue148_17_0 = __instanceOf148_4(p0);
    }
    if (!((life6_5 != 0))) {
        forwardValue148_35_0 = forwardValue148_17_0;
        break forward_join_35;
    }
    if (!((forwardValue148_17_0 != 0))) {
        break forward_join_25;
    }
    life7_30 = __cast148_5(p0);
    if (!((life6_5 == 0))) {
        break forward_join_37;
    }
    }
    net.minecraft.client.resources.IResourcePack __stackOp148_7_0 = p0;
    java.lang.String __stackOp148_7_1 = __invokedynamic148_6(6574, (8940690846705202981L ^ life4_3));
    __call148_9(__invokedynamic148_8(__stackOp148_7_1, __stackOp148_7_0));
    forwardValue148_35_0 = 0;
    }
    return new java.lang.String[forwardValue148_35_0];
    }
    life8_50 = __fieldRead148_10(life7_30);
    spill148_1 = life8_50;
    if (!((life6_5 != 0))) {
        forwardValue148_48_0 = spill148_1;
        break forward_join_48;
    }
    if (!((spill148_1 == null))) {
        break forward_join_47;
    }
    return new java.lang.String[0];
    }
    forwardValue148_48_0 = life8_50;
    }
    spill148_2 = __call148_11(forwardValue148_48_0);
    if (!((life6_5 != 0))) {
        forwardValue148_60_0 = __integerCategory148_12(spill148_2);
        break forward_join_60;
    }
    if (!(spill148_2)) {
        break forward_join_58;
    }
    return __call148_13(life8_50, "", p1, p2);
    }
    forwardValue148_60_0 = __integerCategory148_15(__call148_14(life8_50));
    }
    if (!((life6_5 != 0))) {
        forwardValue148_78_0 = forwardValue148_60_0;
        break forward_join_78;
    }
    if (!((forwardValue148_60_0 != 0))) {
        break forward_join_68;
    }
    return __call148_16(life8_50, p1, p2);
    }
    java.io.File __stackOp148_18_0 = life8_50;
    java.lang.String __stackOp148_18_1 = __invokedynamic148_17(1247, (6828728131806407250L ^ life4_3));
    __call148_20(__invokedynamic148_19(__stackOp148_18_1, __stackOp148_18_0));
    forwardValue148_78_0 = 0;
    }
    return new java.lang.String[forwardValue148_78_0];
}
public static void h148_0(moom.Oo p0) throws Throwable {
    throw __call1014800_0(p0);
}
public static void h148_1(moom.Oo p0) throws Throwable {
    throw __call1014801_0(p0);
}
public static void h148_2(moom.Oo p0) throws Throwable {
    throw __call1014802_0(p0);
}
public static void h148_3(moom.Oo p0) throws Throwable {
    throw __call1014803_0(p0);
}
public static void h148_4(moom.Oo p0) throws Throwable {
    throw __call1014804_0(p0);
}
public static void h148_5(moom.Oo p0) throws Throwable {
    throw __call1014805_0(p0);
}
public static void h148_6(moom.Oo p0) throws Throwable {
    throw __call1014806_0(p0);
}
public static void h148_7(moom.Oo p0) throws Throwable {
    throw __call1014807_0(p0);
}
public static void h148_8(moom.Oo p0) throws Throwable {
    throw __call1014808_0(p0);
}
public static void h148_9(moom.Oo p0) throws Throwable {
    throw __call1014809_0(p0);
}
private static native long __fieldRead148_0() throws Throwable;
private static native int __call148_1() throws Throwable;
private static native int __instanceOf148_2(net.minecraft.client.resources.IResourcePack a0) throws Throwable;
private static native java.lang.String[] __call148_3(net.minecraft.client.resources.IResourcePack a0, java.lang.String[] a1) throws Throwable;
private static native int __instanceOf148_4(net.minecraft.client.resources.IResourcePack a0) throws Throwable;
private static native net.minecraft.client.resources.AbstractResourcePack __cast148_5(net.minecraft.client.resources.IResourcePack a0) throws Throwable;
private static native java.lang.String __invokedynamic148_6(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic148_8(java.lang.String a0, net.minecraft.client.resources.IResourcePack a1) throws Throwable;
private static native void __call148_9(java.lang.String a0) throws Throwable;
private static native java.io.File __fieldRead148_10(net.minecraft.client.resources.AbstractResourcePack a0) throws Throwable;
private static native boolean __call148_11(java.io.File a0) throws Throwable;
private static native int __integerCategory148_12(boolean value) throws Throwable;
private static native java.lang.String[] __call148_13(java.io.File a0, java.lang.String a1, java.lang.String[] a2, java.lang.String[] a3) throws Throwable;
private static native boolean __call148_14(java.io.File a0) throws Throwable;
private static native int __integerCategory148_15(boolean value) throws Throwable;
private static native java.lang.String[] __call148_16(java.io.File a0, java.lang.String[] a1, java.lang.String[] a2) throws Throwable;
private static native java.lang.String __invokedynamic148_17(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic148_19(java.lang.String a0, java.io.File a1) throws Throwable;
private static native void __call148_20(java.lang.String a0) throws Throwable;
private static native java.lang.Exception __call1014800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1014801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1014802_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1014803_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1014804_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1014805_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1014806_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1014807_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1014808_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1014809_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String[] __sourceHandlerCall_fa4b58177f77aa863d33(java.lang.String[] a0, java.lang.String[] a1) throws E;
private static final class __SourceHandler_fa4b58177f77aa863d33 {

public static java.lang.String[] f984(java.lang.String[] p0, java.lang.String[] p1) throws Throwable {
    java.util.LinkedHashSet lexicalValue984_45_0;
    java.lang.String[] lexicalValue984_45_1;
    int spill984_0;
    java.util.LinkedHashSet spill984_1;
    java.lang.String[] spill984_2;
    long life2_3;
    java.util.LinkedHashSet life5_8;
    net.minecraft.client.resources.IResourcePack[] life6_10;
    int life4_11;
    net.minecraft.client.resources.IResourcePack[] life7_13;
    int life8_16;
    int life9_18;
    net.minecraft.client.resources.IResourcePack life10_25;
    java.lang.String[] life11_31;
    lexical_join_45: {
    lexical_join_42: {
    life2_3 = (__fieldRead984_0() ^ 139005220026028L);
    spill984_0 = __call984_1();
    life5_8 = new java.util.LinkedHashSet();
    life6_10 = __call984_2();
    life4_11 = spill984_0;
    life7_13 = life6_10;
    life8_16 = (life7_13).length;
    life9_18 = 0;
    lexical_cycle_19: while (true) {
    if (!((life9_18 < life8_16))) {
        break lexical_join_42;
    }
    life10_25 = (life7_13)[life9_18];
    life11_31 = __call984_3(life10_25, p0, p1, null);
    spill984_1 = life5_8;
    spill984_2 = life11_31;
    if (!((life4_11 != 0))) {
        lexicalValue984_45_0 = spill984_1;
        lexicalValue984_45_1 = spill984_2;
        break lexical_join_45;
    }
    __call984_5(spill984_1, __call984_4(spill984_2));
    life9_18 += 1;
    if (!((life4_11 == 0))) { continue lexical_cycle_19; }
    break lexical_cycle_19;
    }
    }
    lexicalValue984_45_0 = life5_8;
    lexicalValue984_45_1 = new java.lang.String[0];
    }
    return __cast984_7(__call984_6(lexicalValue984_45_0, lexicalValue984_45_1));
}
public static void h984_0(moom.Oo p0) throws Throwable {
    throw __call1098400_0(p0);
}
private static native long __fieldRead984_0() throws Throwable;
private static native int __call984_1() throws Throwable;
private static native net.minecraft.client.resources.IResourcePack[] __call984_2() throws Throwable;
private static native java.lang.String[] __call984_3(net.minecraft.client.resources.IResourcePack a0, java.lang.String[] a1, java.lang.String[] a2, java.lang.Object a3) throws Throwable;
private static native java.util.List __call984_4(java.lang.String[] a0) throws Throwable;
private static native boolean __call984_5(java.util.LinkedHashSet a0, java.util.List a1) throws Throwable;
private static native java.lang.Object[] __call984_6(java.util.LinkedHashSet a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.String[] __cast984_7(java.lang.Object[] a0) throws Throwable;
private static native java.lang.Exception __call1098400_0(moom.Oo a0) throws Throwable;

}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public static java.util.Properties a(java.io.InputStream p0, java.lang.String p1) { return __sourceHandlerCall_b5a414c8cd1082b7ee35(p0, p1); }


public static java.util.Properties a(java.lang.String p0, java.lang.String p1) { return __sourceHandlerCall_e1d3e3e6a7464af79498(p0, p1); }


private static boolean a(java.lang.String p0) {
return (__sourceIntrinsic_booleanComparison((((java.lang.String)(p0)).equals(((java.lang.Object)(((java.lang.String)(p0)).toLowerCase(((java.util.Locale)(java.util.Locale.ROOT)))))))) != 0);
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6646_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/N_"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.N_.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 6845);
    if (((moom.N_.c)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.N_.d)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.N_.d)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/N_", life9_51);
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
        life9_116 = ((java.lang.String)((moom.N_.b)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.N_.c)[life5_8] = moom.N_.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.N_.c)[life5_8];
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
        byte[] spill3355_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3355_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3355_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3355_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3355_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3355_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public static java.lang.String[] a(net.minecraft.client.resources.IResourcePack p0, java.lang.String[] p1, java.lang.String[] p2) {
return moom.N_.a(((net.minecraft.client.resources.IResourcePack)(p0)), ((java.lang.String[])(p1)), ((java.lang.String[])(p2)), ((java.lang.String[])(null)));
}


public static java.lang.String[] a(net.minecraft.client.resources.IResourcePack p0, java.lang.String p1, java.lang.String p2, java.lang.String[] p3) {
return moom.N_.a(((net.minecraft.client.resources.IResourcePack)(p0)), ((java.lang.String[])(new java.lang.String[] {p1})), ((java.lang.String[])(new java.lang.String[] {p2})), ((java.lang.String[])(p3)));
}


public static java.lang.String[] a(java.lang.String[] p0, java.lang.String[] p1) { return __sourceHandlerCall_fa4b58177f77aa863d33(p0, p1); }


public static java.lang.String[] a__ArrayString(java.lang.String p0, java.lang.String p1) {
return moom.N_.a(((java.lang.String[])(new java.lang.String[] {p0})), ((java.lang.String[])(new java.lang.String[] {p1})));
}


private static java.lang.String[] a(java.io.File p0, java.lang.String[] p1, java.lang.String[] p2) { return __sourceHandlerCall_142aae559a4cde3d105b(p0, p1, p2); }


private static java.lang.String[] a(java.io.File p0, java.lang.String p1, java.lang.String[] p2, java.lang.String[] p3) { return __sourceHandlerCall_adb0a58bfc57c502a059(p0, p1, p2, p3); }


private static java.lang.String[] a(net.minecraft.client.resources.IResourcePack p0, java.lang.String[] p1) { return __sourceHandlerCall_d768bc0e56900b86f15e(p0, p1); }


public static java.lang.String[] a(net.minecraft.client.resources.IResourcePack p0, java.lang.String[] p1, java.lang.String[] p2, java.lang.String[] p3) { return __sourceHandlerCall_a8aa16d6fb4a1ffb988e(p0, p1, p2, p3); }


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6646_0() throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
