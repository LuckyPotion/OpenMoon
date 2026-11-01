package com.moon;


public class fW {

private com.google.gson.Gson a;

private java.nio.file.Path b;

private static long c;

private static java.lang.String[] d;

private static java.lang.String[] e;

private static java.util.Map f;

public fW(java.nio.file.Path p0) { super(); __sourceHandlerCall_39e44f6c311c0cd4681c(this, p0); }


static {
c = ((long)(((moom._a)(moom._c.a(((long)(-7649354013770647316L)), ((long)(-5764279329523359351L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(81445180585363L)))));
    f = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.fW.c ^ 15065194399668L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill151_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill151_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill151_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill151_14 = new byte[8];
    (__sourceSpill151_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill151_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation151_16 = __sourceSpill151_14;
    ((javax.crypto.Cipher)(__sourceSpill151_11)).init(((int)(__sourceSpill151_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill151_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation151_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[8];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "Íÿ\006\004\0307Ë£\fp/Ã\026Ô¨?\t48¸,\0028û6Âcxé²x±OÁõD\023ãý.\032ang»ò\177ÿU 6Ê[UÔ\022¯¢ÌºM¦ðBÔ\024.D}Ïvëíë÷ÉÛ£bä®J&¾=ÇÑÓDC­\\Uî¢ñ±tÂÊÒV\t°QÓ\002j\007¥\006)Me]!+\022Í(Å_}\0357;MèÂá+ÞÕ\003ÿ{\013.\030Pgñ<â=gh{º*VðÿH¬¼\020á\\Õ \006mñÊ2Ò<u×\020Ú Õvy-\007rM\006è(÷Ûe0?\nr\034Óøhûï¹J\023\032\032¦ÂM«¨ó¸¥^\013n\006.Y²:0bp7U\013\004\nÉøªgøÜ*ð9&õ¥B<\023ýXªêeQ\033Ý-\023\026Á\016\026ª\022ÊFP­è¯g\034XJ]n¯;Ý4wådk¦=ãaûC?\016ù¸«ä¤+z§¥Hx\tÒ\025\020¡\bI\030×á\001Gxv§\026Ô|lÅ|ìtbpK´íÝ*\007Á{wÊ¼Û2? \001*Á°â\bã\016ÞZÊI¢éú0åçãéFç8¾\007§ð\031y×É.+3o\005e¿\007º,pÕ\025Ìü\025z-ÍÙ¡\020\035!94E lFM\fþ4"))).length();
    int local5_life24 = 32;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill151_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill151_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill151_29)).doFinal(((byte[])(__sourceSpill151_28)));
        java.lang.String __sourceSpill151_34 = ((java.lang.String)(com.moon.fW.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill151_35 = local9_life19;
        int __sourceSpill151_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill151_35)[__sourceSpill151_36] = __sourceSpill151_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    local8_life23 = ((java.lang.String)((local6_life21 = "®\024\027±GC*Ê\003J$>À3¾\r\023àµ­ø\177\017y\034«h¥.×¤\003\\ùv«f¶\\ÜÙ¨ÝºÚNÞÏ8¨±¶\023|\020Z;Ôa¹_úm,\02735o\036¿"))).length();
    local5_life24 = 64;
    local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill151_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill151_43 = local2_life9;
        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill151_43)).doFinal(((byte[])(__sourceSpill151_42)));
        java.lang.String __sourceSpill151_48 = ((java.lang.String)(com.moon.fW.a(((byte[])(local10_life45))))).intern();
        java.lang.String[] __sourceSpill151_49 = local9_life19;
        int __sourceSpill151_50 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill151_49)[__sourceSpill151_50] = __sourceSpill151_48;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    d = ((java.lang.String[])(local9_life19));
    e = ((java.lang.String[])(new java.lang.String[8]));
}

private static native <E extends Throwable> void __sourceHandlerCall_39e44f6c311c0cd4681c(com.moon.fW a0, java.nio.file.Path a1) throws E;
private static final class __SourceHandler_39e44f6c311c0cd4681c {

public static void f17(com.moon.fW receiver, java.nio.file.Path p0) throws Throwable {
    java.nio.file.Path forwardValue17_24_0;
    int forwardValue17_24_1;
    int[] spill17_0;
    java.nio.file.Path spill17_1;
    int spill17_2;
    long life2_3;
    int[] life4_14;
    forward_join_27: {
    forward_join_24: {
    life2_3 = (__fieldRead17_0() ^ 100511486373874L);
    __directSuperInit17_1(receiver);
    spill17_0 = __call17_2();
    __fieldWrite17_5(receiver, __call17_4(__call17_3(new com.google.gson.GsonBuilder())));
    life4_14 = spill17_0;
    spill17_1 = p0;
    spill17_2 = 0;
    if (!((life4_14 != null))) {
        forwardValue17_24_0 = spill17_1;
        forwardValue17_24_1 = spill17_2;
        break forward_join_24;
    }
    if (!(__call17_6(spill17_1, new java.nio.file.LinkOption[spill17_2]))) {
        break forward_join_27;
    }
    forwardValue17_24_0 = p0;
    forwardValue17_24_1 = 0;
    }
    __call17_7(forwardValue17_24_0, new java.nio.file.attribute.FileAttribute[forwardValue17_24_1]);
    }
    __fieldWrite17_10(receiver, __call17_9(p0, __invokedynamic17_8(11176, (6209969010590975144L ^ life2_3))));
    return;
}
public static void h17_0(java.io.IOException p0) throws Throwable {
    throw __call3001700_0(p0);
}
public static void h17_1(java.io.IOException p0) throws Throwable {
    throw __call3001701_0(p0);
}
public static void h17_2(java.io.IOException p0, com.moon.fW p1, java.nio.file.Path p2, long p3) throws Throwable {
    org.tinylog.TaggedLogger spill3001702_0;
    java.lang.String spill3001702_1;
    java.lang.Object[] spill3001702_2;
    java.io.IOException life5_2;
    life5_2 = p0;
    spill3001702_0 = __call3001702_1(__call3001702_0());
    spill3001702_1 = __invokedynamic3001702_2(22596, (9018765180323919680L ^ p3));
    java.lang.Object[] __stackOp3001702_3_0 = new java.lang.Object[1];
    spill3001702_2 = __stackOp3001702_3_0;
    (__stackOp3001702_3_0)[0] = life5_2;
    __call3001702_4(spill3001702_0, spill3001702_1, spill3001702_2);
    __call3001702_5(life5_2);
    __fieldWrite3001702_8(p1, __call3001702_7(p2, __invokedynamic3001702_6(11176, (6209969010590975144L ^ p3))));
    return;
}
private static native long __fieldRead17_0() throws Throwable;
private static native void __directSuperInit17_1(com.moon.fW a0) throws Throwable;
private static native int[] __call17_2() throws Throwable;
private static native com.google.gson.GsonBuilder __call17_3(com.google.gson.GsonBuilder a0) throws Throwable;
private static native com.google.gson.Gson __call17_4(com.google.gson.GsonBuilder a0) throws Throwable;
private static native void __fieldWrite17_5(com.moon.fW a0, com.google.gson.Gson a1) throws Throwable;
private static native boolean __call17_6(java.nio.file.Path a0, java.nio.file.LinkOption[] a1) throws Throwable;
private static native java.nio.file.Path __call17_7(java.nio.file.Path a0, java.nio.file.attribute.FileAttribute[] a1) throws Throwable;
private static native java.lang.String __invokedynamic17_8(int a0, long a1) throws Throwable;
private static native java.nio.file.Path __call17_9(java.nio.file.Path a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite17_10(com.moon.fW a0, java.nio.file.Path a1) throws Throwable;
private static native java.io.IOException __call3001700_0(java.io.IOException a0) throws Throwable;
private static native java.io.IOException __call3001701_0(java.io.IOException a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call3001702_0() throws Throwable;
private static native org.tinylog.TaggedLogger __call3001702_1(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.lang.String __invokedynamic3001702_2(int a0, long a1) throws Throwable;
private static native void __call3001702_4(org.tinylog.TaggedLogger a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native void __call3001702_5(java.io.IOException a0) throws Throwable;
private static native java.lang.String __invokedynamic3001702_6(int a0, long a1) throws Throwable;
private static native java.nio.file.Path __call3001702_7(java.nio.file.Path a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite3001702_8(com.moon.fW a0, java.nio.file.Path a1) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_4366c22ce7ce505c9e58(com.moon.fW a0, com.moon.fV a1) throws E;
private static final class __SourceHandler_4366c22ce7ce505c9e58 {

public static boolean f100001(com.moon.fW receiver, com.moon.fV p0) throws Throwable {
    java.nio.file.Path forestValue100001_26_0;
    com.google.gson.JsonElement forestValue100001_53_0;
    com.moon.module.Module forestValue100001_72_0;
    int forestValue100001_78_0;
    java.nio.file.Path spill100001_0;
    boolean spill100001_1;
    com.google.gson.JsonElement spill100001_2;
    boolean spill100001_3;
    com.moon.module.Module spill100001_4;
    long life2_3;
    int[] life4_5;
    com.google.gson.JsonElement life5_29;
    java.util.Iterator life6_40;
    com.google.gson.JsonElement life7_47;
    com.google.gson.JsonObject life8_59;
    com.moon.module.Module life9_71;
    forest_join_78: {
    forest_join_77: {
    forest_join_26: {
    forest_join_24: {
    life2_3 = (__fieldRead100001_0() ^ 7812980614171L);
    life4_5 = __call100001_1();
    spill100001_0 = __fieldRead100001_2(receiver);
    if (!((life4_5 != null))) {
        forestValue100001_26_0 = spill100001_0;
        break forest_join_26;
    }
    if (!((!__call100001_3(spill100001_0, new java.nio.file.LinkOption[0])))) {
        break forest_join_24;
    }
    __call100001_7(__call100001_5(__call100001_4()), __invokedynamic100001_6(29172, (2144668956233602332L ^ life2_3)));
    return __integerCategory100001_8(0);
    }
    forestValue100001_26_0 = __fieldRead100001_9(receiver);
    }
    life5_29 = __call100001_11(__call100001_10(forestValue100001_26_0));
    spill100001_1 = __call100001_12(life5_29);
    if (!((life4_5 != null))) {
        forestValue100001_78_0 = __integerCategory100001_13(spill100001_1);
        break forest_join_78;
    }
    if (!(spill100001_1)) {
        break forest_join_77;
    }
    life6_40 = __call100001_15(__call100001_14(life5_29));
    forest_cycle_38: while (true) {
    forest_join_75: {
    forest_join_72: {
    forest_join_53: {
    if (!(__call100001_16(life6_40))) {
        break forest_join_77;
    }
    life7_47 = __cast100001_18(__call100001_17(life6_40));
    spill100001_2 = life7_47;
    if (!((life4_5 != null))) {
        forestValue100001_53_0 = spill100001_2;
        break forest_join_53;
    }
    spill100001_3 = __call100001_19(spill100001_2);
    if (!((life4_5 != null))) {
        forestValue100001_78_0 = __integerCategory100001_20(spill100001_3);
        break forest_join_78;
    }
    if (!(spill100001_3)) {
        break forest_join_75;
    }
    forestValue100001_53_0 = life7_47;
    }
    life8_59 = __call100001_21(forestValue100001_53_0);
    life9_71 = __call100001_26(p0, __call100001_25(__call100001_24(__call100001_23(life8_59, __invokedynamic100001_22(23527, (7875269067814649609L ^ life2_3))))));
    spill100001_4 = life9_71;
    if (!((life4_5 != null))) {
        forestValue100001_72_0 = spill100001_4;
        break forest_join_72;
    }
    if (!((spill100001_4 != null))) {
        break forest_join_75;
    }
    forestValue100001_72_0 = life9_71;
    }
    __call100001_27(forestValue100001_72_0, life8_59, 1);
    }
    if (!((life4_5 == null))) {
        continue forest_cycle_38;
    }
    break forest_cycle_38;
    }
    }
    forestValue100001_78_0 = 1;
    }
    return __integerCategory100001_28(forestValue100001_78_0);
}
public static boolean h100001_0(java.io.IOException p0) throws Throwable {
    throw __call13000100_0(p0);
}
public static boolean h100001_1(java.io.IOException p0) throws Throwable {
    throw __call13000101_0(p0);
}
public static boolean h100001_2(java.io.IOException p0, long p1, java.util.Iterator p2) throws Throwable {
    org.tinylog.TaggedLogger spill13000102_0;
    java.lang.String spill13000102_1;
    java.lang.Object[] spill13000102_2;
    java.io.IOException life3_2;
    life3_2 = p0;
    spill13000102_0 = __call13000102_1(__call13000102_0());
    spill13000102_1 = __invokedynamic13000102_2(24168, (5131209698398485127L ^ p1));
    java.lang.Object[] __stackOp13000102_3_0 = new java.lang.Object[1];
    spill13000102_2 = __stackOp13000102_3_0;
    (__stackOp13000102_3_0)[0] = life3_2;
    __call13000102_4(spill13000102_0, spill13000102_1, spill13000102_2);
    __call13000102_5(life3_2);
    return __integerCategory13000102_6(0);
}
public static boolean h100001_3(java.io.IOException p0) throws Throwable {
    throw __call13000103_0(p0);
}
public static boolean h100001_4(java.io.IOException p0) throws Throwable {
    throw __call13000104_0(p0);
}
public static boolean h100001_5(java.io.IOException p0) throws Throwable {
    throw __call13000105_0(p0);
}
public static boolean h100001_6(java.io.IOException p0) throws Throwable {
    throw __call13000106_0(p0);
}
public static boolean h100001_7(java.lang.Exception p0, com.moon.fV p1, long p2, int[] p3, java.util.Iterator p4, com.google.gson.JsonElement p5, com.google.gson.JsonObject p6, com.moon.module.Module p7) throws Throwable {
    com.google.gson.JsonElement forestValue13000107_37_0;
    com.moon.module.Module forestValue13000107_56_0;
    int forestValue13000107_61_0;
    org.tinylog.TaggedLogger spill13000107_0;
    com.google.gson.JsonElement spill13000107_1;
    boolean spill13000107_2;
    com.moon.module.Module spill13000107_3;
    java.lang.Exception life9_2;
    com.google.gson.JsonElement life6_29;
    com.google.gson.JsonObject life7_41;
    com.moon.module.Module life8_53;
    forest_join_61: {
    forest_join_60: {
    life9_2 = p0;
    spill13000107_0 = __call13000107_1(__call13000107_0());
    java.lang.String __stackOp13000107_4_0 = __call13000107_2(p7);
    java.lang.String __stackOp13000107_4_1 = __invokedynamic13000107_3(23466, (5000034213985894209L ^ p2));
    __call13000107_7(spill13000107_0, __invokedynamic13000107_6(__stackOp13000107_4_1, __stackOp13000107_4_0, __invokedynamic13000107_5(15936, (4528012165353364138L ^ p2))));
    forest_cycle_19: while (true) {
    forest_join_56: {
    forest_join_37: {
    forest_join_22: {
    if (!((p3 == null))) {
        break forest_join_22;
    }
    break forest_join_60;
    }
    if (!(__call13000107_8(p4))) {
        break forest_join_60;
    }
    life6_29 = __cast13000107_10(__call13000107_9(p4));
    spill13000107_1 = life6_29;
    if (!((p3 != null))) {
        forestValue13000107_37_0 = spill13000107_1;
        break forest_join_37;
    }
    spill13000107_2 = __call13000107_11(spill13000107_1);
    if (!((p3 != null))) {
        forestValue13000107_61_0 = __integerCategory13000107_12(spill13000107_2);
        break forest_join_61;
    }
    if (!(spill13000107_2)) {
        continue forest_cycle_19;
    }
    forestValue13000107_37_0 = life6_29;
    }
    life7_41 = __call13000107_13(forestValue13000107_37_0);
    life8_53 = __call13000107_18(p1, __call13000107_17(__call13000107_16(__call13000107_15(life7_41, __invokedynamic13000107_14(23527, (7875269067814649609L ^ p2))))));
    spill13000107_3 = life8_53;
    if (!((p3 != null))) {
        forestValue13000107_56_0 = spill13000107_3;
        break forest_join_56;
    }
    if (!((spill13000107_3 != null))) {
        continue forest_cycle_19;
    }
    forestValue13000107_56_0 = life8_53;
    }
    __call13000107_19(forestValue13000107_56_0, life7_41, 1);
    continue forest_cycle_19;
    }
    }
    forestValue13000107_61_0 = 1;
    }
    return __integerCategory13000107_20(forestValue13000107_61_0);
}
private static native long __fieldRead100001_0() throws Throwable;
private static native int[] __call100001_1() throws Throwable;
private static native java.nio.file.Path __fieldRead100001_2(com.moon.fW a0) throws Throwable;
private static native boolean __call100001_3(java.nio.file.Path a0, java.nio.file.LinkOption[] a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call100001_4() throws Throwable;
private static native org.tinylog.TaggedLogger __call100001_5(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.lang.String __invokedynamic100001_6(int a0, long a1) throws Throwable;
private static native void __call100001_7(org.tinylog.TaggedLogger a0, java.lang.String a1) throws Throwable;
private static native boolean __integerCategory100001_8(int value) throws Throwable;
private static native java.nio.file.Path __fieldRead100001_9(com.moon.fW a0) throws Throwable;
private static native java.lang.String __call100001_10(java.nio.file.Path a0) throws Throwable;
private static native com.google.gson.JsonElement __call100001_11(java.lang.String a0) throws Throwable;
private static native boolean __call100001_12(com.google.gson.JsonElement a0) throws Throwable;
private static native int __integerCategory100001_13(boolean value) throws Throwable;
private static native com.google.gson.JsonArray __call100001_14(com.google.gson.JsonElement a0) throws Throwable;
private static native java.util.Iterator __call100001_15(com.google.gson.JsonArray a0) throws Throwable;
private static native boolean __call100001_16(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call100001_17(java.util.Iterator a0) throws Throwable;
private static native com.google.gson.JsonElement __cast100001_18(java.lang.Object a0) throws Throwable;
private static native boolean __call100001_19(com.google.gson.JsonElement a0) throws Throwable;
private static native int __integerCategory100001_20(boolean value) throws Throwable;
private static native com.google.gson.JsonObject __call100001_21(com.google.gson.JsonElement a0) throws Throwable;
private static native java.lang.String __invokedynamic100001_22(int a0, long a1) throws Throwable;
private static native com.google.gson.JsonElement __call100001_23(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call100001_24(com.google.gson.JsonElement a0) throws Throwable;
private static native java.lang.String __call100001_25(java.lang.String a0) throws Throwable;
private static native com.moon.module.Module __call100001_26(com.moon.fV a0, java.lang.String a1) throws Throwable;
private static native void __call100001_27(com.moon.module.Module a0, com.google.gson.JsonObject a1, int a2) throws Throwable;
private static native boolean __integerCategory100001_28(int value) throws Throwable;
private static native java.io.IOException __call13000100_0(java.io.IOException a0) throws Throwable;
private static native java.io.IOException __call13000101_0(java.io.IOException a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call13000102_0() throws Throwable;
private static native org.tinylog.TaggedLogger __call13000102_1(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.lang.String __invokedynamic13000102_2(int a0, long a1) throws Throwable;
private static native void __call13000102_4(org.tinylog.TaggedLogger a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native void __call13000102_5(java.io.IOException a0) throws Throwable;
private static native boolean __integerCategory13000102_6(int value) throws Throwable;
private static native java.io.IOException __call13000103_0(java.io.IOException a0) throws Throwable;
private static native java.io.IOException __call13000104_0(java.io.IOException a0) throws Throwable;
private static native java.io.IOException __call13000105_0(java.io.IOException a0) throws Throwable;
private static native java.io.IOException __call13000106_0(java.io.IOException a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call13000107_0() throws Throwable;
private static native org.tinylog.TaggedLogger __call13000107_1(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.lang.String __call13000107_2(com.moon.module.Module a0) throws Throwable;
private static native java.lang.String __invokedynamic13000107_3(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic13000107_5(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic13000107_6(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call13000107_7(org.tinylog.TaggedLogger a0, java.lang.String a1) throws Throwable;
private static native boolean __call13000107_8(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call13000107_9(java.util.Iterator a0) throws Throwable;
private static native com.google.gson.JsonElement __cast13000107_10(java.lang.Object a0) throws Throwable;
private static native boolean __call13000107_11(com.google.gson.JsonElement a0) throws Throwable;
private static native int __integerCategory13000107_12(boolean value) throws Throwable;
private static native com.google.gson.JsonObject __call13000107_13(com.google.gson.JsonElement a0) throws Throwable;
private static native java.lang.String __invokedynamic13000107_14(int a0, long a1) throws Throwable;
private static native com.google.gson.JsonElement __call13000107_15(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call13000107_16(com.google.gson.JsonElement a0) throws Throwable;
private static native java.lang.String __call13000107_17(java.lang.String a0) throws Throwable;
private static native com.moon.module.Module __call13000107_18(com.moon.fV a0, java.lang.String a1) throws Throwable;
private static native void __call13000107_19(com.moon.module.Module a0, com.google.gson.JsonObject a1, int a2) throws Throwable;
private static native boolean __integerCategory13000107_20(int value) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_6ede097ed47f15b48319(com.moon.fW a0, java.util.Collection a1) throws E;
private static final class __SourceHandler_6ede097ed47f15b48319 {

public static void f54(com.moon.fW receiver, java.util.Collection p0) throws Throwable {
    int forestValue54_26_0;
    int forestValue54_28_0;
    boolean spill54_0;
    boolean spill54_1;
    boolean spill54_2;
    java.nio.file.Path spill54_3;
    java.lang.String spill54_4;
    java.nio.file.OpenOption[] spill54_5;
    java.nio.file.OpenOption[] spill54_6;
    java.nio.file.OpenOption[] spill54_7;
    long life2_3;
    int[] life4_5;
    int life5_34;
    com.google.gson.JsonElement[] life6_45;
    java.lang.String life7_50;
    forest_join_32: {
    forest_join_28: {
    forest_join_27: {
    forest_join_26: {
    forest_join_25: {
    life2_3 = (__fieldRead54_0() ^ 92261177246979L);
    life4_5 = __call54_1();
    spill54_0 = __call54_3(__call54_2(), "\n");
    if (!((life4_5 != null))) {
        forestValue54_26_0 = __integerCategory54_4(spill54_0);
        break forest_join_26;
    }
    if (!(spill54_0)) {
        break forest_join_25;
    }
    if (!((__call54_6(__call54_5()) != null))) {
        break forest_join_25;
    }
    spill54_1 = __fieldRead54_7();
    if (!((life4_5 != null))) {
        forestValue54_26_0 = __integerCategory54_8(spill54_1);
        break forest_join_26;
    }
    if (!(spill54_1)) {
        break forest_join_25;
    }
    spill54_2 = __call54_11(__call54_10(__call54_9()));
    if (!((life4_5 != null))) {
        forestValue54_26_0 = __integerCategory54_12(spill54_2);
        break forest_join_26;
    }
    if (!((!spill54_2))) {
        break forest_join_27;
    }
    }
    forestValue54_26_0 = 1;
    }
    forestValue54_28_0 = forestValue54_26_0;
    break forest_join_28;
    }
    forestValue54_28_0 = 0;
    }
    life5_34 = forestValue54_28_0;
    if (!((life5_34 != 0))) {
        break forest_join_32;
    }
    return;
    }
    life6_45 = __cast54_18(__call54_17(__call54_15(__call54_13(p0), __invokedynamic54_14()), __invokedynamic54_16()));
    life7_50 = __call54_20(__fieldRead54_19(receiver), life6_45);
    spill54_3 = __fieldRead54_21(receiver);
    spill54_4 = life7_50;
    java.nio.file.OpenOption[] __stackOp54_22_0 = new java.nio.file.OpenOption[3];
    spill54_5 = __stackOp54_22_0;
    (__stackOp54_22_0)[0] = __fieldRead54_23();
    java.nio.file.OpenOption[] __stackOp54_24_0 = spill54_5;
    spill54_6 = __stackOp54_24_0;
    (__stackOp54_24_0)[1] = __fieldRead54_25();
    java.nio.file.OpenOption[] __stackOp54_26_0 = spill54_6;
    spill54_7 = __stackOp54_26_0;
    (__stackOp54_26_0)[2] = __fieldRead54_27();
    __call54_28(spill54_3, spill54_4, spill54_7);
    return;
}
public static void h54_0(java.io.IOException p0) throws Throwable {
    throw __call3005400_0(p0);
}
public static void h54_1(java.io.IOException p0) throws Throwable {
    throw __call3005401_0(p0);
}
public static void h54_2(java.io.IOException p0) throws Throwable {
    throw __call3005402_0(p0);
}
public static void h54_3(java.io.IOException p0) throws Throwable {
    throw __call3005403_0(p0);
}
public static void h54_4(java.io.IOException p0) throws Throwable {
    throw __call3005404_0(p0);
}
public static void h54_5(java.io.IOException p0) throws Throwable {
    throw __call3005405_0(p0);
}
public static void h54_6(java.io.IOException p0) throws Throwable {
    throw __call3005406_0(p0);
}
public static void h54_7(java.io.IOException p0, long p1) throws Throwable {
    org.tinylog.TaggedLogger spill3005407_0;
    java.lang.String spill3005407_1;
    java.lang.Object[] spill3005407_2;
    java.io.IOException life3_2;
    life3_2 = p0;
    spill3005407_0 = __call3005407_1(__call3005407_0());
    spill3005407_1 = __invokedynamic3005407_2(9293, (3055256744099324345L ^ p1));
    java.lang.Object[] __stackOp3005407_3_0 = new java.lang.Object[1];
    spill3005407_2 = __stackOp3005407_3_0;
    (__stackOp3005407_3_0)[0] = life3_2;
    __call3005407_4(spill3005407_0, spill3005407_1, spill3005407_2);
    __call3005407_5(life3_2);
    return;
}
private static native long __fieldRead54_0() throws Throwable;
private static native int[] __call54_1() throws Throwable;
private static native java.lang.String __call54_2() throws Throwable;
private static native boolean __call54_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory54_4(boolean value) throws Throwable;
private static native com.moon.runtime.ClientContext __call54_5() throws Throwable;
private static native com.moon.runtime.LocalClientProfile __call54_6(com.moon.runtime.ClientContext a0) throws Throwable;
private static native boolean __fieldRead54_7() throws Throwable;
private static native int __integerCategory54_8(boolean value) throws Throwable;
private static native com.moon.runtime.ClientContext __call54_9() throws Throwable;
private static native com.moon.runtime.LocalClientProfile __call54_10(com.moon.runtime.ClientContext a0) throws Throwable;
private static native boolean __call54_11(com.moon.runtime.LocalClientProfile a0) throws Throwable;
private static native int __integerCategory54_12(boolean value) throws Throwable;
private static native java.util.stream.Stream __call54_13(java.util.Collection a0) throws Throwable;
private static native java.util.function.Function __invokedynamic54_14() throws Throwable;
private static native java.util.stream.Stream __call54_15(java.util.stream.Stream a0, java.util.function.Function a1) throws Throwable;
private static native java.util.function.IntFunction __invokedynamic54_16() throws Throwable;
private static native java.lang.Object[] __call54_17(java.util.stream.Stream a0, java.util.function.IntFunction a1) throws Throwable;
private static native com.google.gson.JsonElement[] __cast54_18(java.lang.Object[] a0) throws Throwable;
private static native com.google.gson.Gson __fieldRead54_19(com.moon.fW a0) throws Throwable;
private static native java.lang.String __call54_20(com.google.gson.Gson a0, com.google.gson.JsonElement[] a1) throws Throwable;
private static native java.nio.file.Path __fieldRead54_21(com.moon.fW a0) throws Throwable;
private static native java.nio.file.StandardOpenOption __fieldRead54_23() throws Throwable;
private static native java.nio.file.StandardOpenOption __fieldRead54_25() throws Throwable;
private static native java.nio.file.StandardOpenOption __fieldRead54_27() throws Throwable;
private static native java.nio.file.Path __call54_28(java.nio.file.Path a0, java.lang.String a1, java.nio.file.OpenOption[] a2) throws Throwable;
private static native java.io.IOException __call3005400_0(java.io.IOException a0) throws Throwable;
private static native java.io.IOException __call3005401_0(java.io.IOException a0) throws Throwable;
private static native java.io.IOException __call3005402_0(java.io.IOException a0) throws Throwable;
private static native java.io.IOException __call3005403_0(java.io.IOException a0) throws Throwable;
private static native java.io.IOException __call3005404_0(java.io.IOException a0) throws Throwable;
private static native java.io.IOException __call3005405_0(java.io.IOException a0) throws Throwable;
private static native java.io.IOException __call3005406_0(java.io.IOException a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call3005407_0() throws Throwable;
private static native org.tinylog.TaggedLogger __call3005407_1(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.lang.String __invokedynamic3005407_2(int a0, long a1) throws Throwable;
private static native void __call3005407_4(org.tinylog.TaggedLogger a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native void __call3005407_5(java.io.IOException a0) throws Throwable;

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
        byte[] spill283_0 = p0;
        life4_9 += 1;
        life5_44 = (spill283_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill283_1 = p0;
        life4_9 += 1;
        life5_76 = (spill283_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill283_2 = p0;
        life4_9 += 1;
        life5_91 = (spill283_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 8675);
    if (((com.moon.fW.e)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.fW.f)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.fW.f)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/fW", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.fW.d)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.fW.e)[life5_8] = com.moon.fW.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.fW.e)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.fW.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1093_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/fW"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(java.util.Collection<com.moon.module.Module> p0) { __sourceHandlerCall_6ede097ed47f15b48319(this, p0); }


public boolean a(com.moon.fV p0) { return __sourceHandlerCall_4366c22ce7ce505c9e58(this, p0); }


private static java.io.IOException a(java.io.IOException p0) {
return p0;
}


private static com.google.gson.JsonElement[] lambda$save$0(int p0) {
return new com.google.gson.JsonElement[p0];
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1093_0() throws E;
}
