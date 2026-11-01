package com.moon;


public class ct {

private com.google.gson.Gson a;

private java.nio.file.Path b;

private static long c;

private static java.lang.String[] d;

private static java.lang.String[] e;

private static java.util.Map f;

public ct(java.nio.file.Path p0) { super(); __sourceHandlerCall_c0d150e4e3cc72c282f3(this, p0); }


static {
c = ((long)(((moom._a)(moom._c.a(((long)(-3130866965604693191L)), ((long)(7147366589152410525L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(232142660937944L)))));
    f = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.ct.c ^ 8106667589821L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill111_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill111_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill111_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill111_14 = new byte[8];
    (__sourceSpill111_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill111_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation111_16 = __sourceSpill111_14;
    ((javax.crypto.Cipher)(__sourceSpill111_11)).init(((int)(__sourceSpill111_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill111_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation111_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[5];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "Xy±Ñ\030¡(7ip¯\021Oa7¡bÉãd\177\026ÂNCô7Oê}-\025Åõ[¥MQguë+xY\033%Ù²È¨'ôþ¬R\030¢g£U¦\n\rÑÒbÆ,Õ¡¦\002gµÌ:I´Bÿ;°'d\034RØ£¹Éã®\021\037rÞ@Þá\005Aé¤lô\022àÆZ\004\001#'G7ÒO\036Ò}\037\026aYïÔxóä³I*¨ÄÅôèF^Èê\020û8÷'V¯þ§®|#\\\016\030¾4@Ü4d\t£~HëÒNØkN?ð "))).length();
    int local5_life24 = 112;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill111_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill111_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill111_29)).doFinal(((byte[])(__sourceSpill111_28)));
        java.lang.String __sourceSpill111_34 = ((java.lang.String)(com.moon.ct.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill111_35 = local9_life19;
        int __sourceSpill111_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill111_35)[__sourceSpill111_36] = __sourceSpill111_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    local8_life23 = ((java.lang.String)((local6_life21 = "æwÑ*À<y\"ÿ­h$ýGKÔ\002gCR)\033\001««v\b$90íRÃË\031Inúÿ}>®\030¦È\177ñ\017À°!ëT/bJÂ?Û¹_ØI\"gÕ¯<EgÀ\\bRÇ^ç8mS\177t\004L.õ¯\017\t|×­Áq/s´ùE\b\0321´\006+ó\"\020ò\tºbYÚ9\tÍ¿whbdÇâ\000¾Ìµ\020F`\\\033WäÒ\b¨wø~#\033VÙG·ª §\\Ëôu±m5­·J\027»[ØyÅoÄÜ\nñÈyÄî%¹\"Ì*Y[g3gêµá3]\034Ô(Ú_\nVãë±\037l\\¾ú\017\006á\026fDØÙA\\a"))).length();
    local5_life24 = 136;
    local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill111_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill111_43 = local2_life9;
        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill111_43)).doFinal(((byte[])(__sourceSpill111_42)));
        java.lang.String __sourceSpill111_48 = ((java.lang.String)(com.moon.ct.a(((byte[])(local10_life45))))).intern();
        java.lang.String[] __sourceSpill111_49 = local9_life19;
        int __sourceSpill111_50 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill111_49)[__sourceSpill111_50] = __sourceSpill111_48;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    d = ((java.lang.String[])(local9_life19));
    e = ((java.lang.String[])(new java.lang.String[5]));
}

private static native <E extends Throwable> void __sourceHandlerCall_c0d150e4e3cc72c282f3(com.moon.ct a0, java.nio.file.Path a1) throws E;
private static final class __SourceHandler_c0d150e4e3cc72c282f3 {

public static void f15(com.moon.ct receiver, java.nio.file.Path p0) throws Throwable {
    java.nio.file.Path forwardValue15_24_0;
    int forwardValue15_24_1;
    int[] spill15_0;
    java.nio.file.Path spill15_1;
    int spill15_2;
    long life2_3;
    int[] life4_14;
    forward_join_41: {
    forward_join_27: {
    forward_join_24: {
    life2_3 = (__fieldRead15_0() ^ 120161778389254L);
    __directSuperInit15_1(receiver);
    spill15_0 = __call15_2();
    __fieldWrite15_5(receiver, __call15_4(__call15_3(new com.google.gson.GsonBuilder())));
    life4_14 = spill15_0;
    spill15_1 = p0;
    spill15_2 = 0;
    if (!((life4_14 != null))) {
        forwardValue15_24_0 = spill15_1;
        forwardValue15_24_1 = spill15_2;
        break forward_join_24;
    }
    if (!(__call15_6(spill15_1, new java.nio.file.LinkOption[spill15_2]))) {
        break forward_join_27;
    }
    forwardValue15_24_0 = p0;
    forwardValue15_24_1 = 0;
    }
    __call15_7(forwardValue15_24_0, new java.nio.file.attribute.FileAttribute[forwardValue15_24_1]);
    }
    __fieldWrite15_10(receiver, __call15_9(p0, __invokedynamic15_8(26533, (71025982190587518L ^ life2_3))));
    if (!((life4_14 == null))) {
        break forward_join_41;
    }
    __call15_11(new java.lang.String[5]);
    }
    return;
}
public static void h15_0(java.io.IOException p0) throws Throwable {
    throw __call3001500_0(p0);
}
public static void h15_1(java.io.IOException p0) throws Throwable {
    throw __call3001501_0(p0);
}
public static void h15_2(java.io.IOException p0, com.moon.ct p1, java.nio.file.Path p2, long p3, int[] p4) throws Throwable {
    org.tinylog.TaggedLogger spill3001502_0;
    java.lang.String spill3001502_1;
    java.lang.Object[] spill3001502_2;
    java.io.IOException life6_2;
    life6_2 = p0;
    spill3001502_0 = __call3001502_1(__call3001502_0());
    spill3001502_1 = __invokedynamic3001502_2(3122, (3173093144853636584L ^ p3));
    java.lang.Object[] __stackOp3001502_3_0 = new java.lang.Object[1];
    spill3001502_2 = __stackOp3001502_3_0;
    (__stackOp3001502_3_0)[0] = life6_2;
    __call3001502_4(spill3001502_0, spill3001502_1, spill3001502_2);
    __call3001502_5(life6_2);
    __fieldWrite3001502_8(p1, __call3001502_7(p2, __invokedynamic3001502_6(26533, (71025982190587518L ^ p3))));
    if ((p4 == null)) {
        __call3001502_9(new java.lang.String[5]);
    } else {
        
    }
    return;
}
public static void h15_3(java.io.IOException p0) throws Throwable {
    throw __call3001503_0(p0);
}
private static native long __fieldRead15_0() throws Throwable;
private static native void __directSuperInit15_1(com.moon.ct a0) throws Throwable;
private static native int[] __call15_2() throws Throwable;
private static native com.google.gson.GsonBuilder __call15_3(com.google.gson.GsonBuilder a0) throws Throwable;
private static native com.google.gson.Gson __call15_4(com.google.gson.GsonBuilder a0) throws Throwable;
private static native void __fieldWrite15_5(com.moon.ct a0, com.google.gson.Gson a1) throws Throwable;
private static native boolean __call15_6(java.nio.file.Path a0, java.nio.file.LinkOption[] a1) throws Throwable;
private static native java.nio.file.Path __call15_7(java.nio.file.Path a0, java.nio.file.attribute.FileAttribute[] a1) throws Throwable;
private static native java.lang.String __invokedynamic15_8(int a0, long a1) throws Throwable;
private static native java.nio.file.Path __call15_9(java.nio.file.Path a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite15_10(com.moon.ct a0, java.nio.file.Path a1) throws Throwable;
private static native void __call15_11(java.lang.String[] a0) throws Throwable;
private static native java.io.IOException __call3001500_0(java.io.IOException a0) throws Throwable;
private static native java.io.IOException __call3001501_0(java.io.IOException a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call3001502_0() throws Throwable;
private static native org.tinylog.TaggedLogger __call3001502_1(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.lang.String __invokedynamic3001502_2(int a0, long a1) throws Throwable;
private static native void __call3001502_4(org.tinylog.TaggedLogger a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native void __call3001502_5(java.io.IOException a0) throws Throwable;
private static native java.lang.String __invokedynamic3001502_6(int a0, long a1) throws Throwable;
private static native java.nio.file.Path __call3001502_7(java.nio.file.Path a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite3001502_8(com.moon.ct a0, java.nio.file.Path a1) throws Throwable;
private static native void __call3001502_9(java.lang.String[] a0) throws Throwable;
private static native java.io.IOException __call3001503_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_1c774908566c85cd72f8(com.moon.ct a0) throws E;
private static final class __SourceHandler_1c774908566c85cd72f8 {

public static void f47(com.moon.ct receiver) throws Throwable {
    java.nio.file.Path lexicalValue47_25_0;
    com.google.gson.JsonElement lexicalValue47_34_0;
    java.nio.file.Path spill47_0;
    com.google.gson.JsonElement spill47_1;
    long life1_3;
    int[] life3_5;
    com.google.gson.JsonElement life4_32;
    java.util.Iterator life5_66;
    com.google.gson.JsonElement life6_73;
    com.moon.cq life7_76;
    lexical_join_55: {
    lexical_join_34: {
    lexical_join_25: {
    lexical_join_23: {
    life1_3 = (__fieldRead47_0() ^ 43172969658351L);
    life3_5 = __call47_1();
    spill47_0 = __fieldRead47_2(receiver);
    if (!((life3_5 != null))) {
        lexicalValue47_25_0 = spill47_0;
        break lexical_join_25;
    }
    if (!((!__call47_3(spill47_0, new java.nio.file.LinkOption[0])))) {
        break lexical_join_23;
    }
    __call47_7(__call47_5(__call47_4()), __invokedynamic47_6(13594, (1986610158658599470L ^ life1_3)));
    return;
    }
    lexicalValue47_25_0 = __fieldRead47_8(receiver);
    }
    life4_32 = __call47_10(__call47_9(lexicalValue47_25_0));
    spill47_1 = life4_32;
    if (!((life3_5 != null))) {
        lexicalValue47_34_0 = spill47_1;
        break lexical_join_34;
    }
    if (!(__call47_11(spill47_1))) {
        break lexical_join_55;
    }
    lexicalValue47_34_0 = life4_32;
    }
    life5_66 = __call47_13(__call47_12(lexicalValue47_34_0));
    lexical_cycle_37: while (true) {
    lexical_join_53: {
    if (!(__call47_14(life5_66))) {
        break lexical_join_55;
    }
    life6_73 = __cast47_16(__call47_15(life5_66));
    life7_76 = __call47_17(life6_73);
    if (!((life7_76 != null))) {
        break lexical_join_53;
    }
    __call47_20(__call47_19(__call47_18()), life7_76);
    }
    if (!((life3_5 == null))) { continue lexical_cycle_37; }
    break lexical_cycle_37;
    }
    }
    return;
}
public static void h47_0(java.io.IOException p0) throws Throwable {
    throw __call2004700_0(p0);
}
public static void h47_1(java.io.IOException p0) throws Throwable {
    throw __call2004701_0(p0);
}
public static void h47_2(java.io.IOException p0, long p1) throws Throwable {
    java.io.IOException local3 = p0;
    org.tinylog.TaggedLogger spill2004702_0 = __call2004702_1(__call2004702_0());
    java.lang.String spill2004702_1 = __invokedynamic2004702_2(19414, (271996976520938727L ^ p1));
    java.lang.Object[] __stackOp2004702_3_0 = new java.lang.Object[1];
    java.lang.Object[] spill2004702_2 = __stackOp2004702_3_0;
    (__stackOp2004702_3_0)[0] = local3;
    __call2004702_4(spill2004702_0, spill2004702_1, spill2004702_2);
    __call2004702_5(local3);
    return;
}
public static void h47_3(java.io.IOException p0) throws Throwable {
    throw __call2004703_0(p0);
}
public static void h47_4(java.io.IOException p0) throws Throwable {
    throw __call2004704_0(p0);
}
public static void h47_5(java.io.IOException p0) throws Throwable {
    throw __call2004705_0(p0);
}
private static native long __fieldRead47_0() throws Throwable;
private static native int[] __call47_1() throws Throwable;
private static native java.nio.file.Path __fieldRead47_2(com.moon.ct a0) throws Throwable;
private static native boolean __call47_3(java.nio.file.Path a0, java.nio.file.LinkOption[] a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call47_4() throws Throwable;
private static native org.tinylog.TaggedLogger __call47_5(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.lang.String __invokedynamic47_6(int a0, long a1) throws Throwable;
private static native void __call47_7(org.tinylog.TaggedLogger a0, java.lang.String a1) throws Throwable;
private static native java.nio.file.Path __fieldRead47_8(com.moon.ct a0) throws Throwable;
private static native java.lang.String __call47_9(java.nio.file.Path a0) throws Throwable;
private static native com.google.gson.JsonElement __call47_10(java.lang.String a0) throws Throwable;
private static native boolean __call47_11(com.google.gson.JsonElement a0) throws Throwable;
private static native com.google.gson.JsonArray __call47_12(com.google.gson.JsonElement a0) throws Throwable;
private static native java.util.Iterator __call47_13(com.google.gson.JsonArray a0) throws Throwable;
private static native boolean __call47_14(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call47_15(java.util.Iterator a0) throws Throwable;
private static native com.google.gson.JsonElement __cast47_16(java.lang.Object a0) throws Throwable;
private static native com.moon.cq __call47_17(com.google.gson.JsonElement a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call47_18() throws Throwable;
private static native com.moon.cs __call47_19(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call47_20(com.moon.cs a0, com.moon.cq a1) throws Throwable;
private static native java.io.IOException __call2004700_0(java.io.IOException a0) throws Throwable;
private static native java.io.IOException __call2004701_0(java.io.IOException a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call2004702_0() throws Throwable;
private static native org.tinylog.TaggedLogger __call2004702_1(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.lang.String __invokedynamic2004702_2(int a0, long a1) throws Throwable;
private static native void __call2004702_4(org.tinylog.TaggedLogger a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native void __call2004702_5(java.io.IOException a0) throws Throwable;
private static native java.io.IOException __call2004703_0(java.io.IOException a0) throws Throwable;
private static native java.io.IOException __call2004704_0(java.io.IOException a0) throws Throwable;
private static native java.io.IOException __call2004705_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_f90654a304781168fee8(com.moon.ct a0, java.util.Collection a1) throws E;
private static final class __SourceHandler_f90654a304781168fee8 {

public static void f47(com.moon.ct receiver, java.util.Collection p0) throws Throwable {
    int forestValue47_26_0;
    int forestValue47_28_0;
    boolean spill47_0;
    boolean spill47_1;
    boolean spill47_2;
    java.nio.file.Path spill47_3;
    java.lang.String spill47_4;
    java.nio.file.OpenOption[] spill47_5;
    java.nio.file.OpenOption[] spill47_6;
    java.nio.file.OpenOption[] spill47_7;
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
    life2_3 = (__fieldRead47_0() ^ 25846544007577L);
    life4_5 = __call47_1();
    spill47_0 = __call47_3(__call47_2(), "\n");
    if (!((life4_5 != null))) {
        forestValue47_26_0 = __integerCategory47_4(spill47_0);
        break forest_join_26;
    }
    if (!(spill47_0)) {
        break forest_join_25;
    }
    if (!((__call47_6(__call47_5()) != null))) {
        break forest_join_25;
    }
    spill47_1 = __fieldRead47_7();
    if (!((life4_5 != null))) {
        forestValue47_26_0 = __integerCategory47_8(spill47_1);
        break forest_join_26;
    }
    if (!(spill47_1)) {
        break forest_join_25;
    }
    spill47_2 = __call47_11(__call47_10(__call47_9()));
    if (!((life4_5 != null))) {
        forestValue47_26_0 = __integerCategory47_12(spill47_2);
        break forest_join_26;
    }
    if (!((!spill47_2))) {
        break forest_join_27;
    }
    }
    forestValue47_26_0 = 1;
    }
    forestValue47_28_0 = forestValue47_26_0;
    break forest_join_28;
    }
    forestValue47_28_0 = 0;
    }
    life5_34 = forestValue47_28_0;
    if (!((life5_34 != 0))) {
        break forest_join_32;
    }
    return;
    }
    life6_45 = __cast47_18(__call47_17(__call47_15(__call47_13(p0), __invokedynamic47_14()), __invokedynamic47_16()));
    life7_50 = __call47_20(__fieldRead47_19(receiver), life6_45);
    spill47_3 = __fieldRead47_21(receiver);
    spill47_4 = life7_50;
    java.nio.file.OpenOption[] __stackOp47_22_0 = new java.nio.file.OpenOption[3];
    spill47_5 = __stackOp47_22_0;
    (__stackOp47_22_0)[0] = __fieldRead47_23();
    java.nio.file.OpenOption[] __stackOp47_24_0 = spill47_5;
    spill47_6 = __stackOp47_24_0;
    (__stackOp47_24_0)[1] = __fieldRead47_25();
    java.nio.file.OpenOption[] __stackOp47_26_0 = spill47_6;
    spill47_7 = __stackOp47_26_0;
    (__stackOp47_26_0)[2] = __fieldRead47_27();
    __call47_28(spill47_3, spill47_4, spill47_7);
    return;
}
public static void h47_0(java.io.IOException p0) throws Throwable {
    throw __call3004700_0(p0);
}
public static void h47_1(java.io.IOException p0) throws Throwable {
    throw __call3004701_0(p0);
}
public static void h47_2(java.io.IOException p0) throws Throwable {
    throw __call3004702_0(p0);
}
public static void h47_3(java.io.IOException p0) throws Throwable {
    throw __call3004703_0(p0);
}
public static void h47_4(java.io.IOException p0) throws Throwable {
    throw __call3004704_0(p0);
}
public static void h47_5(java.io.IOException p0) throws Throwable {
    throw __call3004705_0(p0);
}
public static void h47_6(java.io.IOException p0) throws Throwable {
    throw __call3004706_0(p0);
}
public static void h47_7(java.io.IOException p0, long p1) throws Throwable {
    org.tinylog.TaggedLogger spill3004707_0;
    java.lang.String spill3004707_1;
    java.lang.Object[] spill3004707_2;
    java.io.IOException life3_2;
    life3_2 = p0;
    spill3004707_0 = __call3004707_1(__call3004707_0());
    spill3004707_1 = __invokedynamic3004707_2(8466, (2013679356886980692L ^ p1));
    java.lang.Object[] __stackOp3004707_3_0 = new java.lang.Object[1];
    spill3004707_2 = __stackOp3004707_3_0;
    (__stackOp3004707_3_0)[0] = life3_2;
    __call3004707_4(spill3004707_0, spill3004707_1, spill3004707_2);
    __call3004707_5(life3_2);
    return;
}
private static native long __fieldRead47_0() throws Throwable;
private static native int[] __call47_1() throws Throwable;
private static native java.lang.String __call47_2() throws Throwable;
private static native boolean __call47_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory47_4(boolean value) throws Throwable;
private static native com.moon.runtime.ClientContext __call47_5() throws Throwable;
private static native com.moon.runtime.LocalClientProfile __call47_6(com.moon.runtime.ClientContext a0) throws Throwable;
private static native boolean __fieldRead47_7() throws Throwable;
private static native int __integerCategory47_8(boolean value) throws Throwable;
private static native com.moon.runtime.ClientContext __call47_9() throws Throwable;
private static native com.moon.runtime.LocalClientProfile __call47_10(com.moon.runtime.ClientContext a0) throws Throwable;
private static native boolean __call47_11(com.moon.runtime.LocalClientProfile a0) throws Throwable;
private static native int __integerCategory47_12(boolean value) throws Throwable;
private static native java.util.stream.Stream __call47_13(java.util.Collection a0) throws Throwable;
private static native java.util.function.Function __invokedynamic47_14() throws Throwable;
private static native java.util.stream.Stream __call47_15(java.util.stream.Stream a0, java.util.function.Function a1) throws Throwable;
private static native java.util.function.IntFunction __invokedynamic47_16() throws Throwable;
private static native java.lang.Object[] __call47_17(java.util.stream.Stream a0, java.util.function.IntFunction a1) throws Throwable;
private static native com.google.gson.JsonElement[] __cast47_18(java.lang.Object[] a0) throws Throwable;
private static native com.google.gson.Gson __fieldRead47_19(com.moon.ct a0) throws Throwable;
private static native java.lang.String __call47_20(com.google.gson.Gson a0, com.google.gson.JsonElement[] a1) throws Throwable;
private static native java.nio.file.Path __fieldRead47_21(com.moon.ct a0) throws Throwable;
private static native java.nio.file.StandardOpenOption __fieldRead47_23() throws Throwable;
private static native java.nio.file.StandardOpenOption __fieldRead47_25() throws Throwable;
private static native java.nio.file.StandardOpenOption __fieldRead47_27() throws Throwable;
private static native java.nio.file.Path __call47_28(java.nio.file.Path a0, java.lang.String a1, java.nio.file.OpenOption[] a2) throws Throwable;
private static native java.io.IOException __call3004700_0(java.io.IOException a0) throws Throwable;
private static native java.io.IOException __call3004701_0(java.io.IOException a0) throws Throwable;
private static native java.io.IOException __call3004702_0(java.io.IOException a0) throws Throwable;
private static native java.io.IOException __call3004703_0(java.io.IOException a0) throws Throwable;
private static native java.io.IOException __call3004704_0(java.io.IOException a0) throws Throwable;
private static native java.io.IOException __call3004705_0(java.io.IOException a0) throws Throwable;
private static native java.io.IOException __call3004706_0(java.io.IOException a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call3004707_0() throws Throwable;
private static native org.tinylog.TaggedLogger __call3004707_1(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.lang.String __invokedynamic3004707_2(int a0, long a1) throws Throwable;
private static native void __call3004707_4(org.tinylog.TaggedLogger a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native void __call3004707_5(java.io.IOException a0) throws Throwable;

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
        byte[] spill140_0 = p0;
        life4_9 += 1;
        life5_44 = (spill140_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill140_1 = p0;
        life4_9 += 1;
        life5_76 = (spill140_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill140_2 = p0;
        life4_9 += 1;
        life5_91 = (spill140_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 16649);
    if (((com.moon.ct.e)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.ct.f)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.ct.f)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/ct", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.ct.d)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.ct.e)[life5_8] = com.moon.ct.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.ct.e)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.ct.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral872_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/ct"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(java.util.Collection<com.moon.cq> p0) { __sourceHandlerCall_f90654a304781168fee8(this, p0); }


public void a() { __sourceHandlerCall_1c774908566c85cd72f8(this); }


private static java.io.IOException a(java.io.IOException p0) {
return p0;
}


private static com.google.gson.JsonElement[] lambda$save$0(int p0) {
return new com.google.gson.JsonElement[p0];
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral872_0() throws E;
}
