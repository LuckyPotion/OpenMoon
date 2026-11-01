package com.moon;


public class dD {

private static com.google.gson.Gson a;

private java.lang.String b;

private com.google.gson.JsonArray c;

private static long d;

private static java.lang.String[] e;

private static java.lang.String[] f;

private static java.util.Map g;

public dD(java.lang.String p0, com.google.gson.JsonArray p1) {
super();
    this.b = p0;
    this.c = p1;
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(-7246561399995114227L)), ((long)(4598933489721691076L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(184555058662149L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.dD.d ^ 9281637063892L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill114_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill114_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill114_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill114_14 = new byte[8];
    (__sourceSpill114_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill114_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation114_16 = __sourceSpill114_14;
    ((javax.crypto.Cipher)(__sourceSpill114_11)).init(((int)(__sourceSpill114_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill114_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation114_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[12];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "\002²½\005Ýèë)÷+ì;T\rB²\003q\035. BÁk¬\b\016\005\b/Ê{µxó4ã00 <w·\bkk>×Ky¦ì@{¤\r«À-TéÆ¡§l¦Õ'4ýéËÿêS\007Û¸ÀVÓ|(Òã7²êý?\036&ÔÛ£rÙº\030\007£ÈX\0175\030KwB$ç\020Ç¾\017/TN\006£9!\021ÉS\020{\001è\b¬¡·%&Ô$}¨Ë$8j]2;·&(}<Rx*\t\tþúWÔºAÐ4v®ÎË0JY\020_È\000fÈ«:7{êxÑüÚõÓ\030÷\006´÷XH{î9råpÒ<³\fÀ¨*ã·á+\033ñ\020\026`P>L\030º-`TkÏ6®§ç3¹`îAÉ'\000 %:ÇP¡üï¹Ôbß°`\027a \020\0130\017äÎÖY\036mèÉsK\020@n[þ´¼V±g0\\)\037|kç@ú1w¥7ÊÐÞ[<5[\031}öÐ²ÿ\013;á~ë\037u°¤ß\032\000²>o±±¹GN¥ä\033\0233KPM¦×GMå«\020¿:\001L\000l}\005ÊBS\030:ñ"))).length();
    int local5_life24 = 56;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill114_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill114_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill114_29)).doFinal(((byte[])(__sourceSpill114_28)));
        java.lang.String __sourceSpill114_34 = ((java.lang.String)(com.moon.dD.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill114_35 = local9_life19;
        int __sourceSpill114_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill114_35)[__sourceSpill114_36] = __sourceSpill114_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    local8_life23 = ((java.lang.String)((local6_life21 = "YË´\033ìhÐÑ\030\004\017³ã£\0067/S¦2Oçz\022\016_£1¤\021\013­½â\000<¨ÞAO\f\032ÇÈ+\fé\025\036\nu13Xîë`\032pù·µ<\nÃ@]\177ÿ[¢d3ÅÂhòÐÑà\024ÏqÅô@®¼ÿ«®¦P#.r%q¶_ýx»º²\003ª÷áÎ\021a8)5§\tå'¾\002"))).length();
    local5_life24 = 72;
    local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill114_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill114_43 = local2_life9;
        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill114_43)).doFinal(((byte[])(__sourceSpill114_42)));
        java.lang.String __sourceSpill114_48 = ((java.lang.String)(com.moon.dD.a(((byte[])(local10_life45))))).intern();
        java.lang.String[] __sourceSpill114_49 = local9_life19;
        int __sourceSpill114_50 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill114_49)[__sourceSpill114_50] = __sourceSpill114_48;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    e = ((java.lang.String[])(local9_life19));
    f = ((java.lang.String[])(new java.lang.String[12]));
    a = ((com.google.gson.Gson)(((com.google.gson.GsonBuilder)(((com.google.gson.GsonBuilder)(new com.google.gson.GsonBuilder())).setPrettyPrinting())).create()));
}

private static native <E extends Throwable> void __sourceHandlerCall_496d5980c82efa4209ec(com.moon.dD a0, java.io.File a1) throws E;
private static final class __SourceHandler_496d5980c82efa4209ec {

public static void f39(com.moon.dD receiver, java.io.File p0) throws Throwable {
    java.lang.String spill39_0;
    java.nio.file.Path spill39_1;
    java.lang.String spill39_2;
    java.nio.file.OpenOption[] spill39_3;
    java.nio.file.OpenOption[] spill39_4;
    java.nio.file.OpenOption[] spill39_5;
    long life2_3;
    java.io.File life5_16;
    com.moon.fV life6_20;
    com.google.gson.JsonArray life7_25;
    java.lang.String life4_26;
    java.util.Iterator life8_30;
    com.moon.module.Module life9_37;
    java.lang.String life8_55;
    lexical_join_49: {
    lexical_join_46: {
    life2_3 = (__fieldRead39_0() ^ 58612557284844L);
    life5_16 = new java.io.File(p0, __invokedynamic39_3(__fieldRead39_1(receiver), __invokedynamic39_2(1852, (8326286698341683630L ^ life2_3))));
    life6_20 = __call39_6(__call39_5(__call39_4()));
    spill39_0 = __call39_7();
    life7_25 = new com.google.gson.JsonArray();
    life4_26 = spill39_0;
    life8_30 = __call39_9(__call39_8(life6_20));
    lexical_cycle_31: while (true) {
    if (!(__call39_10(life8_30))) {
        break lexical_join_46;
    }
    life9_37 = __cast39_12(__call39_11(life8_30));
    __call39_14(life7_25, __call39_13(life9_37));
    if (!((life4_26 == null))) {
        break lexical_join_49;
    }
    if (!((life4_26 != null))) { continue lexical_cycle_31; }
    break lexical_cycle_31;
    }
    }
    __fieldWrite39_15(receiver, life7_25);
    }
    life8_55 = __call39_17(__fieldRead39_16(), receiver);
    spill39_1 = __call39_18(life5_16);
    spill39_2 = life8_55;
    java.nio.file.OpenOption[] __stackOp39_19_0 = new java.nio.file.OpenOption[3];
    spill39_3 = __stackOp39_19_0;
    (__stackOp39_19_0)[0] = __fieldRead39_20();
    java.nio.file.OpenOption[] __stackOp39_21_0 = spill39_3;
    spill39_4 = __stackOp39_21_0;
    (__stackOp39_21_0)[1] = __fieldRead39_22();
    java.nio.file.OpenOption[] __stackOp39_23_0 = spill39_4;
    spill39_5 = __stackOp39_23_0;
    (__stackOp39_23_0)[2] = __fieldRead39_24();
    __call39_25(spill39_1, spill39_2, spill39_5);
    return;
}
public static void h39_0(java.io.IOException p0) throws Throwable {
    throw __call2003900_0(p0);
}
public static void h39_1(java.io.IOException p0, com.moon.dD p1, long p2) throws Throwable {
    java.io.IOException local4 = p0;
    java.lang.String __stackOp2003901_3_0 = __fieldRead2003901_0(p1);
    java.lang.String __stackOp2003901_3_1 = __call2003901_1(local4);
    java.lang.String __stackOp2003901_3_2 = __invokedynamic2003901_2(14113, (6747156829577109937L ^ p2));
    java.lang.String spill2003901_0 = __stackOp2003901_3_2;
    java.lang.String spill2003901_1 = __stackOp2003901_3_0;
    java.lang.String spill2003901_2 = __stackOp2003901_3_1;
    __discardScalar2003901_4(__stackOp2003901_3_2);
    java.lang.String __stackOp2003901_6_0 = spill2003901_2;
    java.lang.String __stackOp2003901_6_1 = __invokedynamic2003901_5(2705, (6272182590039972877L ^ p2));
    __call2003901_8(__invokedynamic2003901_7(spill2003901_0, spill2003901_1, __stackOp2003901_6_1, __stackOp2003901_6_0, ")"));
    return;
}
private static native long __fieldRead39_0() throws Throwable;
private static native java.lang.String __fieldRead39_1(com.moon.dD a0) throws Throwable;
private static native java.lang.String __invokedynamic39_2(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic39_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call39_4() throws Throwable;
private static native com.moon.fU __call39_5(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.fV __call39_6(com.moon.fU a0) throws Throwable;
private static native java.lang.String __call39_7() throws Throwable;
private static native java.util.Collection __call39_8(com.moon.fV a0) throws Throwable;
private static native java.util.Iterator __call39_9(java.util.Collection a0) throws Throwable;
private static native boolean __call39_10(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call39_11(java.util.Iterator a0) throws Throwable;
private static native com.moon.module.Module __cast39_12(java.lang.Object a0) throws Throwable;
private static native com.google.gson.JsonObject __call39_13(com.moon.module.Module a0) throws Throwable;
private static native void __call39_14(com.google.gson.JsonArray a0, com.google.gson.JsonObject a1) throws Throwable;
private static native void __fieldWrite39_15(com.moon.dD a0, com.google.gson.JsonArray a1) throws Throwable;
private static native com.google.gson.Gson __fieldRead39_16() throws Throwable;
private static native java.lang.String __call39_17(com.google.gson.Gson a0, com.moon.dD a1) throws Throwable;
private static native java.nio.file.Path __call39_18(java.io.File a0) throws Throwable;
private static native java.nio.file.StandardOpenOption __fieldRead39_20() throws Throwable;
private static native java.nio.file.StandardOpenOption __fieldRead39_22() throws Throwable;
private static native java.nio.file.StandardOpenOption __fieldRead39_24() throws Throwable;
private static native java.nio.file.Path __call39_25(java.nio.file.Path a0, java.lang.String a1, java.nio.file.OpenOption[] a2) throws Throwable;
private static native java.io.IOException __call2003900_0(java.io.IOException a0) throws Throwable;
private static native java.lang.String __fieldRead2003901_0(com.moon.dD a0) throws Throwable;
private static native java.lang.String __call2003901_1(java.io.IOException a0) throws Throwable;
private static native java.lang.String __invokedynamic2003901_2(int a0, long a1) throws Throwable;
private static native void __discardScalar2003901_4(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic2003901_5(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic2003901_7(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, java.lang.String a4) throws Throwable;
private static native void __call2003901_8(java.lang.String a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_212e873a39fadf98b315(com.moon.dD a0, java.io.File a1) throws E;
private static final class __SourceHandler_212e873a39fadf98b315 {

public static void f7(com.moon.dD receiver, java.io.File p0) throws Throwable {
    java.lang.Object lexicalValue7_49_0;
    com.google.gson.JsonArray lexicalValue7_88_0;
    com.google.gson.JsonElement lexicalValue7_103_0;
    com.moon.module.Module lexicalValue7_122_0;
    java.lang.String spill7_0;
    java.nio.file.Path spill7_1;
    com.google.gson.JsonArray spill7_2;
    com.google.gson.JsonElement spill7_3;
    com.moon.module.Module spill7_4;
    long life2_3;
    java.io.File life5_17;
    java.lang.String life4_18;
    com.moon.dD life6_55;
    com.moon.fV life7_86;
    java.util.Iterator life8_92;
    com.moon.module.Module life9_99;
    java.util.Iterator life8_126;
    com.google.gson.JsonElement life9_133;
    com.google.gson.JsonObject life10_147;
    com.moon.module.Module life11_159;
    lexical_join_127: {
    lexical_join_88: {
    lexical_join_79: {
    lexical_join_49: {
    lexical_join_43: {
    life2_3 = (__fieldRead7_0() ^ 106306732811650L);
    spill7_0 = __call7_1();
    life5_17 = new java.io.File(p0, __invokedynamic7_4(__fieldRead7_2(receiver), __invokedynamic7_3(1852, (8326236804954239424L ^ life2_3))));
    life4_18 = spill7_0;
    spill7_1 = __call7_5(life5_17);
    if (!((life4_18 == null))) {
        lexicalValue7_49_0 = spill7_1;
        break lexical_join_49;
    }
    if (!((!__call7_6(spill7_1, new java.nio.file.LinkOption[0])))) {
        break lexical_join_43;
    }
    java.lang.String __stackOp7_9_0 = __fieldRead7_7(receiver);
    java.lang.String __stackOp7_9_1 = __invokedynamic7_8(10995, (5316470725299084290L ^ life2_3));
    __call7_12(__invokedynamic7_11(__stackOp7_9_1, __stackOp7_9_0, __invokedynamic7_10(3115, (8077138804628929240L ^ life2_3))));
    return;
    }
    lexicalValue7_49_0 = __call7_17(__fieldRead7_13(), __call7_15(__call7_14(life5_17)), __classLiteral7_16());
    }
    life6_55 = __cast7_18(lexicalValue7_49_0);
    __fieldWrite7_20(receiver, __call7_19(life6_55));
    life7_86 = __call7_23(__call7_22(__call7_21()));
    life8_92 = __call7_28(__call7_27(__call7_26(__call7_25(__call7_24()))));
    lexical_cycle_65: while (true) {
    if (!(__call7_29(life8_92))) {
        break lexical_join_79;
    }
    life9_99 = __cast7_31(__call7_30(life8_92));
    __call7_32(life9_99, 0);
    if (!((life4_18 == null))) {
        break lexical_join_127;
    }
    if (!((life4_18 != null))) { continue lexical_cycle_65; }
    break lexical_cycle_65;
    }
    }
    spill7_2 = __fieldRead7_33(receiver);
    if (!((life4_18 == null))) {
        lexicalValue7_88_0 = spill7_2;
        break lexical_join_88;
    }
    if (!(__call7_34(spill7_2))) {
        break lexical_join_127;
    }
    lexicalValue7_88_0 = __call7_36(__fieldRead7_35(receiver));
    }
    life8_126 = __call7_37(lexicalValue7_88_0);
    lexical_cycle_90: while (true) {
    lexical_join_125: {
    lexical_join_122: {
    lexical_join_103: {
    if (!(__call7_38(life8_126))) {
        break lexical_join_127;
    }
    life9_133 = __cast7_40(__call7_39(life8_126));
    spill7_3 = life9_133;
    if (!((life4_18 == null))) {
        lexicalValue7_103_0 = spill7_3;
        break lexical_join_103;
    }
    if (!(__call7_41(spill7_3))) {
        break lexical_join_125;
    }
    lexicalValue7_103_0 = life9_133;
    }
    life10_147 = __call7_42(lexicalValue7_103_0);
    life11_159 = __call7_47(life7_86, __call7_46(__call7_45(__call7_44(life10_147, __invokedynamic7_43(14425, (8208397564924726948L ^ life2_3))))));
    spill7_4 = life11_159;
    if (!((life4_18 == null))) {
        lexicalValue7_122_0 = spill7_4;
        break lexical_join_122;
    }
    if (!((spill7_4 != null))) {
        break lexical_join_125;
    }
    lexicalValue7_122_0 = life11_159;
    }
    __call7_48(lexicalValue7_122_0, life10_147, 0);
    }
    if (!((life4_18 != null))) { continue lexical_cycle_90; }
    break lexical_cycle_90;
    }
    }
    return;
}
public static void h7_0(java.io.IOException p0) throws Throwable {
    throw __call2000700_0(p0);
}
public static void h7_1(java.io.IOException p0) throws Throwable {
    throw __call2000701_0(p0);
}
public static void h7_2(java.io.IOException p0, com.moon.dD p1, long p2) throws Throwable {
    java.io.IOException local4 = p0;
    java.lang.String __stackOp2000702_3_0 = __fieldRead2000702_0(p1);
    java.lang.String __stackOp2000702_3_1 = __call2000702_1(local4);
    java.lang.String __stackOp2000702_3_2 = __invokedynamic2000702_2(29305, (5364108562434049161L ^ p2));
    java.lang.String spill2000702_0 = __stackOp2000702_3_2;
    java.lang.String spill2000702_1 = __stackOp2000702_3_0;
    java.lang.String spill2000702_2 = __stackOp2000702_3_1;
    __discardScalar2000702_4(__stackOp2000702_3_2);
    java.lang.String __stackOp2000702_6_0 = spill2000702_2;
    java.lang.String __stackOp2000702_6_1 = __invokedynamic2000702_5(2705, (6272125821987273827L ^ p2));
    __call2000702_8(__invokedynamic2000702_7(spill2000702_0, spill2000702_1, __stackOp2000702_6_1, __stackOp2000702_6_0, ")"));
    return;
}
public static void h7_3(java.io.IOException p0) throws Throwable {
    throw __call2000703_0(p0);
}
public static void h7_4(java.io.IOException p0) throws Throwable {
    throw __call2000704_0(p0);
}
public static void h7_5(java.io.IOException p0) throws Throwable {
    throw __call2000705_0(p0);
}
public static void h7_6(java.io.IOException p0) throws Throwable {
    throw __call2000706_0(p0);
}
public static void h7_7(java.io.IOException p0) throws Throwable {
    throw __call2000707_0(p0);
}
public static void h7_8(java.io.IOException p0) throws Throwable {
    throw __call2000708_0(p0);
}
private static native long __fieldRead7_0() throws Throwable;
private static native java.lang.String __call7_1() throws Throwable;
private static native java.lang.String __fieldRead7_2(com.moon.dD a0) throws Throwable;
private static native java.lang.String __invokedynamic7_3(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic7_4(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.nio.file.Path __call7_5(java.io.File a0) throws Throwable;
private static native boolean __call7_6(java.nio.file.Path a0, java.nio.file.LinkOption[] a1) throws Throwable;
private static native java.lang.String __fieldRead7_7(com.moon.dD a0) throws Throwable;
private static native java.lang.String __invokedynamic7_8(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic7_10(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic7_11(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call7_12(java.lang.String a0) throws Throwable;
private static native com.google.gson.Gson __fieldRead7_13() throws Throwable;
private static native java.nio.file.Path __call7_14(java.io.File a0) throws Throwable;
private static native java.lang.String __call7_15(java.nio.file.Path a0) throws Throwable;
private static native java.lang.Class __classLiteral7_16() throws Throwable;
private static native java.lang.Object __call7_17(com.google.gson.Gson a0, java.lang.String a1, java.lang.Object a2) throws Throwable;
private static native com.moon.dD __cast7_18(java.lang.Object a0) throws Throwable;
private static native com.google.gson.JsonArray __call7_19(com.moon.dD a0) throws Throwable;
private static native void __fieldWrite7_20(com.moon.dD a0, com.google.gson.JsonArray a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call7_21() throws Throwable;
private static native com.moon.fU __call7_22(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.fV __call7_23(com.moon.fU a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call7_24() throws Throwable;
private static native com.moon.fU __call7_25(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.fV __call7_26(com.moon.fU a0) throws Throwable;
private static native java.util.Collection __call7_27(com.moon.fV a0) throws Throwable;
private static native java.util.Iterator __call7_28(java.util.Collection a0) throws Throwable;
private static native boolean __call7_29(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call7_30(java.util.Iterator a0) throws Throwable;
private static native com.moon.module.Module __cast7_31(java.lang.Object a0) throws Throwable;
private static native void __call7_32(com.moon.module.Module a0, int a1) throws Throwable;
private static native com.google.gson.JsonArray __fieldRead7_33(com.moon.dD a0) throws Throwable;
private static native boolean __call7_34(com.google.gson.JsonArray a0) throws Throwable;
private static native com.google.gson.JsonArray __fieldRead7_35(com.moon.dD a0) throws Throwable;
private static native com.google.gson.JsonArray __call7_36(com.google.gson.JsonArray a0) throws Throwable;
private static native java.util.Iterator __call7_37(com.google.gson.JsonArray a0) throws Throwable;
private static native boolean __call7_38(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call7_39(java.util.Iterator a0) throws Throwable;
private static native com.google.gson.JsonElement __cast7_40(java.lang.Object a0) throws Throwable;
private static native boolean __call7_41(com.google.gson.JsonElement a0) throws Throwable;
private static native com.google.gson.JsonObject __call7_42(com.google.gson.JsonElement a0) throws Throwable;
private static native java.lang.String __invokedynamic7_43(int a0, long a1) throws Throwable;
private static native com.google.gson.JsonElement __call7_44(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call7_45(com.google.gson.JsonElement a0) throws Throwable;
private static native java.lang.String __call7_46(java.lang.String a0) throws Throwable;
private static native com.moon.module.Module __call7_47(com.moon.fV a0, java.lang.String a1) throws Throwable;
private static native void __call7_48(com.moon.module.Module a0, com.google.gson.JsonObject a1, int a2) throws Throwable;
private static native java.io.IOException __call2000700_0(java.io.IOException a0) throws Throwable;
private static native java.io.IOException __call2000701_0(java.io.IOException a0) throws Throwable;
private static native java.lang.String __fieldRead2000702_0(com.moon.dD a0) throws Throwable;
private static native java.lang.String __call2000702_1(java.io.IOException a0) throws Throwable;
private static native java.lang.String __invokedynamic2000702_2(int a0, long a1) throws Throwable;
private static native void __discardScalar2000702_4(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic2000702_5(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic2000702_7(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, java.lang.String a4) throws Throwable;
private static native void __call2000702_8(java.lang.String a0) throws Throwable;
private static native java.io.IOException __call2000703_0(java.io.IOException a0) throws Throwable;
private static native java.io.IOException __call2000704_0(java.io.IOException a0) throws Throwable;
private static native java.io.IOException __call2000705_0(java.io.IOException a0) throws Throwable;
private static native java.io.IOException __call2000706_0(java.io.IOException a0) throws Throwable;
private static native java.io.IOException __call2000707_0(java.io.IOException a0) throws Throwable;
private static native java.io.IOException __call2000708_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_c5463a67836662bd9e72(com.moon.dD a0, java.io.File a1) throws E;
private static final class __SourceHandler_c5463a67836662bd9e72 {

public static void f40(com.moon.dD receiver, java.io.File p0) throws Throwable {
    java.nio.file.Path forwardValue40_45_0;
    java.lang.String spill40_0;
    java.nio.file.Path spill40_1;
    long life2_3;
    java.io.File life5_17;
    java.lang.String life4_18;
    forward_join_45: {
    forward_join_43: {
    life2_3 = (__fieldRead40_0() ^ 116999600090135L);
    spill40_0 = __call40_1();
    life5_17 = new java.io.File(p0, __invokedynamic40_4(__fieldRead40_2(receiver), __invokedynamic40_3(3197, (3351086782871728912L ^ life2_3))));
    life4_18 = spill40_0;
    spill40_1 = __call40_5(life5_17);
    if (!((life4_18 == null))) {
        forwardValue40_45_0 = spill40_1;
        break forward_join_45;
    }
    if (!((!__call40_6(spill40_1, new java.nio.file.LinkOption[0])))) {
        break forward_join_43;
    }
    java.lang.String __stackOp40_9_0 = __fieldRead40_7(receiver);
    java.lang.String __stackOp40_9_1 = __invokedynamic40_8(20860, (5120397295490051603L ^ life2_3));
    __call40_12(__invokedynamic40_11(__stackOp40_9_1, __stackOp40_9_0, __invokedynamic40_10(4553, (2109474167412223655L ^ life2_3))));
    return;
    }
    forwardValue40_45_0 = __call40_13(life5_17);
    }
    __call40_14(forwardValue40_45_0);
    return;
}
public static void h40_0(java.io.IOException p0) throws Throwable {
    throw __call2004000_0(p0);
}
public static void h40_1(java.io.IOException p0) throws Throwable {
    throw __call2004001_0(p0);
}
public static void h40_2(java.io.IOException p0, com.moon.dD p1, long p2) throws Throwable {
    java.io.IOException local4 = p0;
    java.lang.String __stackOp2004002_3_0 = __fieldRead2004002_0(p1);
    java.lang.String __stackOp2004002_3_1 = __call2004002_1(local4);
    java.lang.String __stackOp2004002_3_2 = __invokedynamic2004002_2(3876, (6997546428112171086L ^ p2));
    java.lang.String spill2004002_0 = __stackOp2004002_3_2;
    java.lang.String spill2004002_1 = __stackOp2004002_3_0;
    java.lang.String spill2004002_2 = __stackOp2004002_3_1;
    __discardScalar2004002_4(__stackOp2004002_3_2);
    java.lang.String __stackOp2004002_6_0 = spill2004002_2;
    java.lang.String __stackOp2004002_6_1 = __invokedynamic2004002_5(31174, (8908536853263976106L ^ p2));
    __call2004002_8(__invokedynamic2004002_7(spill2004002_0, spill2004002_1, __stackOp2004002_6_1, __stackOp2004002_6_0, ")"));
    return;
}
private static native long __fieldRead40_0() throws Throwable;
private static native java.lang.String __call40_1() throws Throwable;
private static native java.lang.String __fieldRead40_2(com.moon.dD a0) throws Throwable;
private static native java.lang.String __invokedynamic40_3(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic40_4(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.nio.file.Path __call40_5(java.io.File a0) throws Throwable;
private static native boolean __call40_6(java.nio.file.Path a0, java.nio.file.LinkOption[] a1) throws Throwable;
private static native java.lang.String __fieldRead40_7(com.moon.dD a0) throws Throwable;
private static native java.lang.String __invokedynamic40_8(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic40_10(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic40_11(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call40_12(java.lang.String a0) throws Throwable;
private static native java.nio.file.Path __call40_13(java.io.File a0) throws Throwable;
private static native void __call40_14(java.nio.file.Path a0) throws Throwable;
private static native java.io.IOException __call2004000_0(java.io.IOException a0) throws Throwable;
private static native java.io.IOException __call2004001_0(java.io.IOException a0) throws Throwable;
private static native java.lang.String __fieldRead2004002_0(com.moon.dD a0) throws Throwable;
private static native java.lang.String __call2004002_1(java.io.IOException a0) throws Throwable;
private static native java.lang.String __invokedynamic2004002_2(int a0, long a1) throws Throwable;
private static native void __discardScalar2004002_4(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic2004002_5(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic2004002_7(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, java.lang.String a4) throws Throwable;
private static native void __call2004002_8(java.lang.String a0) throws Throwable;

}


public void b(java.io.File p0) { __sourceHandlerCall_212e873a39fadf98b315(this, p0); }


public void c(java.io.File p0) { __sourceHandlerCall_c5463a67836662bd9e72(this, p0); }


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.dD.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.io.IOException a(java.io.IOException p0) {
return p0;
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
        byte[] spill147_0 = p0;
        life4_9 += 1;
        life5_44 = (spill147_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill147_1 = p0;
        life4_9 += 1;
        life5_76 = (spill147_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill147_2 = p0;
        life4_9 += 1;
        life5_91 = (spill147_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 12557);
    if (((com.moon.dD.f)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.dD.g)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.dD.g)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/dD", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.dD.e)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.dD.f)[life5_8] = com.moon.dD.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.dD.f)[life5_8];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral894_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/dD"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public java.lang.String a__String() {
return this.b;
}


public com.google.gson.JsonArray a() {
return this.c;
}


public com.moon.dD a(java.lang.String p0) {
this.b = ((java.lang.String)(p0));
    return this;
}


public com.moon.dD a(com.google.gson.JsonArray p0) {
this.c = ((com.google.gson.JsonArray)(p0));
    return this;
}


public void a(java.io.File p0) { __sourceHandlerCall_496d5980c82efa4209ec(this, p0); }


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral894_0() throws E;
}
