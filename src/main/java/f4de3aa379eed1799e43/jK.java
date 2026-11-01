package com.moon;


public class jK {

private static com.google.gson.Gson a;

private com.moon.jJ b;

private java.util.Map<java.lang.String, com.moon.jI> c;

private java.io.File d;

private java.io.File e;

private static long f;

private static java.lang.String[] g;

private static java.lang.String[] h;

private static java.util.Map i;

public jK() {
super();
    this.b = new com.moon.jJ();
    this.c = new java.util.HashMap();
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(8308322477583110185L)), ((long)(745492992160905728L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(131198472388671L)))));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.jK.f ^ 83061097405192L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill268_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill268_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill268_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill268_14 = new byte[8];
    (__sourceSpill268_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill268_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation268_16 = __sourceSpill268_14;
    ((javax.crypto.Cipher)(__sourceSpill268_11)).init(((int)(__sourceSpill268_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill268_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation268_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[9];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "­c]$ÓRÍe:ß\004ù¹-ÉHdÞ\024E)\023/´òÃ]Z\005ç2-5 æ´\027\020~£F\000v|èE§y\"Õñlô¸§qÌ£\0374~h\020H\tO\f\020\bbó>@é^¿¡çà\020f¶9¢*RmØQOô£Y ·ÓÄ\027î\027\t£J÷\004F´´êÑÉU\027ðò#|è\013¿Us&\020ÄÚ\022«ajN\025»ýÉAUé+GPîgÂüòþÌ95tOÉ÷\016ÜqáR»<Åf+áÚ^_v°[\005uW\035úxb\013n{÷(ö\177ñàîCGï\022\177l>.õ0«&+2Z>ïî\002ò5\003æ"))).length();
    int local5_life24 = 40;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill268_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill268_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill268_29)).doFinal(((byte[])(__sourceSpill268_28)));
        java.lang.String __sourceSpill268_34 = ((java.lang.String)(com.moon.jK.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill268_35 = local9_life19;
        int __sourceSpill268_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill268_35)[__sourceSpill268_36] = __sourceSpill268_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    local8_life23 = ((java.lang.String)((local6_life21 = "#`co?®óSAòP3td\035ß\036<Kìüµajâb¿þ{¶|R$zÊþh\\{\001ØúJVê×\"pC\\\016\003ûÁtSÙP!=@$VØ¨âç]\020Æ,G¹(\037×n0Àüuz"))).length();
    local5_life24 = 80;
    local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill268_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill268_43 = local2_life9;
        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill268_43)).doFinal(((byte[])(__sourceSpill268_42)));
        java.lang.String __sourceSpill268_48 = ((java.lang.String)(com.moon.jK.a(((byte[])(local10_life45))))).intern();
        java.lang.String[] __sourceSpill268_49 = local9_life19;
        int __sourceSpill268_50 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill268_49)[__sourceSpill268_50] = __sourceSpill268_48;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    g = ((java.lang.String[])(local9_life19));
    h = ((java.lang.String[])(new java.lang.String[9]));
    a = ((com.google.gson.Gson)(((com.google.gson.GsonBuilder)(((com.google.gson.GsonBuilder)(new com.google.gson.GsonBuilder())).setPrettyPrinting())).create()));
}

private static native <E extends Throwable> void __sourceHandlerCall_67b085f7025e9b6143ba(com.moon.jK a0, java.io.File a1, boolean a2) throws E;
private static final class __SourceHandler_67b085f7025e9b6143ba {

public static void f900023(com.moon.jK receiver, java.io.File p0, boolean p1) throws Throwable {
    java.lang.Object forestValue900023_42_0;
    int forestValue900023_118_0;
    int forestValue900023_122_0;
    java.lang.String[] spill900023_0;
    java.io.File spill900023_1;
    boolean spill900023_2;
    org.tinylog.TaggedLogger spill900023_3;
    org.tinylog.TaggedLogger spill900023_4;
    long life3_3;
    java.lang.String[] life5_16;
    java.io.File[] life6_48;
    int life7_51;
    int life8_53;
    java.io.File life9_62;
    java.lang.String life10_65;
    java.lang.String life11_92;
    java.io.FileInputStream life12_103;
    byte[] life13_106;
    com.moon.jI life14_111;
    com.moon.jM life6_155;
    java.util.Iterator life7_159;
    com.moon.jL life8_168;
    com.moon.jI life9_173;
    forest_join_195: {
    forest_join_122: {
    forest_join_118: {
    forest_join_115: {
    forest_join_42: {
    forest_join_38: {
    life3_3 = (__fieldRead900023_0() ^ 43040502881224L);
    spill900023_0 = __call900023_1();
    __fieldWrite900023_3(receiver, new java.io.File(p0, __invokedynamic900023_2(13471, (7014211274594188827L ^ life3_3))));
    life5_16 = spill900023_0;
    __fieldWrite900023_5(receiver, new java.io.File(p0, __invokedynamic900023_4(16495, (2188756568195140335L ^ life3_3))));
    spill900023_1 = __fieldRead900023_6(receiver);
    if (!((life5_16 != null))) {
        forestValue900023_42_0 = spill900023_1;
        break forest_join_42;
    }
    if (!((!__call900023_7(spill900023_1)))) {
        break forest_join_38;
    }
    __call900023_9(__fieldRead900023_8(receiver));
    }
    forestValue900023_42_0 = __call900023_12(__call900023_11(__fieldRead900023_10(receiver)));
    }
    life6_48 = __cast900023_13(forestValue900023_42_0);
    life7_51 = (life6_48).length;
    life8_53 = 0;
    forest_cycle_49: while (true) {
    forest_join_113: {
    forest_join_112: {
    if (!((life8_53 < life7_51))) {
        break forest_join_115;
    }
    life9_62 = (life6_48)[life8_53];
    life10_65 = __call900023_14(life9_62);
    if (!((life5_16 != null))) {
        break forest_join_113;
    }
    spill900023_2 = __call900023_16(life10_65, __invokedynamic900023_15(13207, (1936325867771197717L ^ life3_3)));
    if (!((life5_16 != null))) {
        forestValue900023_118_0 = __integerCategory900023_17(spill900023_2);
        break forest_join_118;
    }
    if (!(spill900023_2)) {
        break forest_join_112;
    }
    life11_92 = (__call900023_19(life10_65, __invokedynamic900023_18(29277, (5750640165275318494L ^ life3_3))))[0];
    if (!((!__call900023_21(__fieldRead900023_20(receiver), life11_92)))) {
        break forest_join_112;
    }
    life12_103 = new java.io.FileInputStream(life9_62);
    life13_106 = __call900023_22(life12_103);
    life14_111 = new com.moon.jI(life11_92);
    __call900023_23(life14_111, new java.lang.String(life13_106));
    __call900023_25(__fieldRead900023_24(receiver), life11_92, life14_111);
    }
    life8_53 += 1;
    }
    if (!((life5_16 == null))) {
        continue forest_cycle_49;
    }
    break forest_cycle_49;
    }
    }
    forestValue900023_118_0 = __integerCategory900023_28(__call900023_27(__fieldRead900023_26(receiver)));
    }
    if (!((life5_16 != null))) {
        forestValue900023_122_0 = forestValue900023_118_0;
        break forest_join_122;
    }
    if (!((forestValue900023_118_0 != 0))) {
        break forest_join_195;
    }
    forestValue900023_122_0 = __integerCategory900023_29(p1);
    }
    if (!((forestValue900023_122_0 != 0))) {
        break forest_join_195;
    }
    life6_155 = __cast900023_34(__call900023_33(__fieldRead900023_30(), new java.io.FileReader(__fieldRead900023_31(receiver)), __classLiteral900023_32()));
    life7_159 = __call900023_36(__call900023_35(life6_155));
    forest_cycle_137: while (true) {
    forest_join_193: {
    forest_join_176: {
    if (!(__call900023_37(life7_159))) {
        break forest_join_195;
    }
    life8_168 = __cast900023_39(__call900023_38(life7_159));
    life9_173 = __call900023_41(receiver, __call900023_40(life8_168));
    if (!((life5_16 != null))) {
        break forest_join_195;
    }
    if (!((life5_16 != null))) {
        break forest_join_176;
    }
    if (!((life9_173 != null))) {
        break forest_join_193;
    }
    spill900023_3 = __call900023_43(__call900023_42());
    java.lang.String __stackOp900023_46_0 = __call900023_44(life8_168);
    java.lang.String __stackOp900023_46_1 = __invokedynamic900023_45(18649, (1721496115454837340L ^ life3_3));
    __call900023_49(spill900023_3, __invokedynamic900023_48(__stackOp900023_46_1, __stackOp900023_46_0, __invokedynamic900023_47(7258, (3186775859204347612L ^ life3_3))));
    __call900023_51(__fieldRead900023_50(receiver), life9_173);
    }
    spill900023_4 = __call900023_53(__call900023_52());
    java.lang.String __stackOp900023_56_0 = __call900023_54(life8_168);
    java.lang.String __stackOp900023_56_1 = __invokedynamic900023_55(6056, (1472591346582019369L ^ life3_3));
    __call900023_59(spill900023_4, __invokedynamic900023_58(__stackOp900023_56_1, __stackOp900023_56_0, __invokedynamic900023_57(3735, (935093957060510736L ^ life3_3))));
    }
    if (!((life5_16 == null))) {
        continue forest_cycle_137;
    }
    break forest_cycle_137;
    }
    }
    return;
}
public static void h900023_0(java.lang.Exception p0) throws Throwable {
    throw __call93002300_0(p0);
}
public static void h900023_1(java.lang.Exception p0) throws Throwable {
    throw __call93002301_0(p0);
}
public static void h900023_2(java.lang.Exception p0) throws Throwable {
    throw __call93002302_0(p0);
}
public static void h900023_3(java.lang.Exception p0) throws Throwable {
    throw __call93002303_0(p0);
}
public static void h900023_4(java.lang.Exception p0, com.moon.jK p1, boolean p2, long p3, java.lang.String[] p4, java.io.File[] p5, int p6, int p7) throws Throwable {
    int forestValue93002304_77_0;
    int forestValue93002304_81_0;
    boolean spill93002304_0;
    org.tinylog.TaggedLogger spill93002304_1;
    org.tinylog.TaggedLogger spill93002304_2;
    java.lang.Exception life12_2;
    java.io.File life9_20;
    java.lang.String life10_23;
    java.lang.String life11_50;
    java.io.FileInputStream life12_61;
    byte[] life13_64;
    com.moon.jI life14_69;
    com.moon.jM life6_109;
    java.util.Iterator life7_113;
    com.moon.jL life8_122;
    com.moon.jI life9_127;
    forest_join_154: {
    forest_join_81: {
    forest_join_77: {
    forest_join_74: {
    life12_2 = p0;
    __call93002304_2(__call93002304_1(__call93002304_0()), life12_2);
    forest_cycle_6: while (true) {
    forest_join_73: {
    p7 += 1;
    forest_cycle_7: while (true) {
    forest_join_10: {
    if (!((p4 == null))) {
        break forest_join_10;
    }
    break forest_join_74;
    }
    if (!((p7 < p6))) {
        break forest_join_74;
    }
    life9_20 = (p5)[p7];
    life10_23 = __call93002304_3(life9_20);
    if (!((p4 != null))) {
        continue forest_cycle_7;
    }
    break forest_cycle_7;
    }
    spill93002304_0 = __call93002304_5(life10_23, __invokedynamic93002304_4(13207, (1936325867771197717L ^ p3)));
    if (!((p4 != null))) {
        forestValue93002304_77_0 = __integerCategory93002304_6(spill93002304_0);
        break forest_join_77;
    }
    if (!(spill93002304_0)) {
        continue forest_cycle_6;
    }
    life11_50 = (__call93002304_8(life10_23, __invokedynamic93002304_7(29277, (5750640165275318494L ^ p3))))[0];
    if (!((!__call93002304_10(__fieldRead93002304_9(p1), life11_50)))) {
        break forest_join_73;
    }
    life12_61 = new java.io.FileInputStream(life9_20);
    life13_64 = __call93002304_11(life12_61);
    life14_69 = new com.moon.jI(life11_50);
    __call93002304_12(life14_69, new java.lang.String(life13_64));
    __call93002304_14(__fieldRead93002304_13(p1), life11_50, life14_69);
    }
    continue forest_cycle_6;
    }
    }
    forestValue93002304_77_0 = __integerCategory93002304_17(__call93002304_16(__fieldRead93002304_15(p1)));
    }
    if (!((p4 != null))) {
        forestValue93002304_81_0 = forestValue93002304_77_0;
        break forest_join_81;
    }
    if (!((forestValue93002304_77_0 != 0))) {
        break forest_join_154;
    }
    forestValue93002304_81_0 = __integerCategory93002304_18(p2);
    }
    if (!((forestValue93002304_81_0 != 0))) {
        break forest_join_154;
    }
    life6_109 = __cast93002304_23(__call93002304_22(__fieldRead93002304_19(), new java.io.FileReader(__fieldRead93002304_20(p1)), __classLiteral93002304_21()));
    life7_113 = __call93002304_25(__call93002304_24(life6_109));
    forest_cycle_96: while (true) {
    forest_join_152: {
    forest_join_135: {
    if (!(__call93002304_26(life7_113))) {
        break forest_join_154;
    }
    life8_122 = __cast93002304_28(__call93002304_27(life7_113));
    life9_127 = __call93002304_30(p1, __call93002304_29(life8_122));
    if (!((p4 != null))) {
        break forest_join_154;
    }
    if (!((p4 != null))) {
        break forest_join_135;
    }
    if (!((life9_127 != null))) {
        break forest_join_152;
    }
    spill93002304_1 = __call93002304_32(__call93002304_31());
    java.lang.String __stackOp93002304_35_0 = __call93002304_33(life8_122);
    java.lang.String __stackOp93002304_35_1 = __invokedynamic93002304_34(18649, (1721496115454837340L ^ p3));
    __call93002304_38(spill93002304_1, __invokedynamic93002304_37(__stackOp93002304_35_1, __stackOp93002304_35_0, __invokedynamic93002304_36(7258, (3186775859204347612L ^ p3))));
    __call93002304_40(__fieldRead93002304_39(p1), life9_127);
    }
    spill93002304_2 = __call93002304_42(__call93002304_41());
    java.lang.String __stackOp93002304_45_0 = __call93002304_43(life8_122);
    java.lang.String __stackOp93002304_45_1 = __invokedynamic93002304_44(6056, (1472591346582019369L ^ p3));
    __call93002304_48(spill93002304_2, __invokedynamic93002304_47(__stackOp93002304_45_1, __stackOp93002304_45_0, __invokedynamic93002304_46(3735, (935093957060510736L ^ p3))));
    }
    if (!((p4 == null))) {
        continue forest_cycle_96;
    }
    break forest_cycle_96;
    }
    }
    return;
}
public static void h900023_5(java.lang.Exception p0) throws Throwable {
    throw __call93002305_0(p0);
}
public static void h900023_6(java.lang.Exception p0) throws Throwable {
    throw __call93002306_0(p0);
}
public static void h900023_7(java.lang.Exception p0) throws Throwable {
    throw __call93002307_0(p0);
}
public static void h900023_8(java.lang.Exception p0) throws Throwable {
    throw __call93002308_0(p0);
}
public static void h900023_9(java.lang.Exception p0) throws Throwable {
    java.lang.Exception life1_2;
    life1_2 = p0;
    __call93002309_2(__call93002309_1(__call93002309_0()), life1_2);
    return;
}
private static native long __fieldRead900023_0() throws Throwable;
private static native java.lang.String[] __call900023_1() throws Throwable;
private static native java.lang.String __invokedynamic900023_2(int a0, long a1) throws Throwable;
private static native void __fieldWrite900023_3(com.moon.jK a0, java.io.File a1) throws Throwable;
private static native java.lang.String __invokedynamic900023_4(int a0, long a1) throws Throwable;
private static native void __fieldWrite900023_5(com.moon.jK a0, java.io.File a1) throws Throwable;
private static native java.io.File __fieldRead900023_6(com.moon.jK a0) throws Throwable;
private static native boolean __call900023_7(java.io.File a0) throws Throwable;
private static native java.io.File __fieldRead900023_8(com.moon.jK a0) throws Throwable;
private static native boolean __call900023_9(java.io.File a0) throws Throwable;
private static native java.io.File __fieldRead900023_10(com.moon.jK a0) throws Throwable;
private static native java.io.File[] __call900023_11(java.io.File a0) throws Throwable;
private static native java.lang.Object __call900023_12(java.io.File[] a0) throws Throwable;
private static native java.io.File[] __cast900023_13(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call900023_14(java.io.File a0) throws Throwable;
private static native java.lang.String __invokedynamic900023_15(int a0, long a1) throws Throwable;
private static native boolean __call900023_16(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory900023_17(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic900023_18(int a0, long a1) throws Throwable;
private static native java.lang.String[] __call900023_19(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.util.Map __fieldRead900023_20(com.moon.jK a0) throws Throwable;
private static native boolean __call900023_21(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native byte[] __call900023_22(java.io.FileInputStream a0) throws Throwable;
private static native com.moon.jI __call900023_23(com.moon.jI a0, java.lang.String a1) throws Throwable;
private static native java.util.Map __fieldRead900023_24(com.moon.jK a0) throws Throwable;
private static native java.lang.Object __call900023_25(java.util.Map a0, java.lang.String a1, com.moon.jI a2) throws Throwable;
private static native java.io.File __fieldRead900023_26(com.moon.jK a0) throws Throwable;
private static native boolean __call900023_27(java.io.File a0) throws Throwable;
private static native int __integerCategory900023_28(boolean value) throws Throwable;
private static native int __integerCategory900023_29(boolean value) throws Throwable;
private static native com.google.gson.Gson __fieldRead900023_30() throws Throwable;
private static native java.io.File __fieldRead900023_31(com.moon.jK a0) throws Throwable;
private static native java.lang.Class __classLiteral900023_32() throws Throwable;
private static native java.lang.Object __call900023_33(com.google.gson.Gson a0, java.io.FileReader a1, java.lang.Class a2) throws Throwable;
private static native com.moon.jM __cast900023_34(java.lang.Object a0) throws Throwable;
private static native java.util.List __call900023_35(com.moon.jM a0) throws Throwable;
private static native java.util.Iterator __call900023_36(java.util.List a0) throws Throwable;
private static native boolean __call900023_37(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call900023_38(java.util.Iterator a0) throws Throwable;
private static native com.moon.jL __cast900023_39(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call900023_40(com.moon.jL a0) throws Throwable;
private static native com.moon.jI __call900023_41(com.moon.jK a0, java.lang.String a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call900023_42() throws Throwable;
private static native org.tinylog.TaggedLogger __call900023_43(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.lang.String __call900023_44(com.moon.jL a0) throws Throwable;
private static native java.lang.String __invokedynamic900023_45(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic900023_47(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic900023_48(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call900023_49(org.tinylog.TaggedLogger a0, java.lang.String a1) throws Throwable;
private static native com.moon.jJ __fieldRead900023_50(com.moon.jK a0) throws Throwable;
private static native void __call900023_51(com.moon.jJ a0, com.moon.jI a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call900023_52() throws Throwable;
private static native org.tinylog.TaggedLogger __call900023_53(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.lang.String __call900023_54(com.moon.jL a0) throws Throwable;
private static native java.lang.String __invokedynamic900023_55(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic900023_57(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic900023_58(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call900023_59(org.tinylog.TaggedLogger a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call93002300_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call93002301_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call93002302_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call93002303_0(java.lang.Exception a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call93002304_0() throws Throwable;
private static native org.tinylog.TaggedLogger __call93002304_1(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call93002304_2(org.tinylog.TaggedLogger a0, java.lang.Exception a1) throws Throwable;
private static native java.lang.String __call93002304_3(java.io.File a0) throws Throwable;
private static native java.lang.String __invokedynamic93002304_4(int a0, long a1) throws Throwable;
private static native boolean __call93002304_5(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory93002304_6(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic93002304_7(int a0, long a1) throws Throwable;
private static native java.lang.String[] __call93002304_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.util.Map __fieldRead93002304_9(com.moon.jK a0) throws Throwable;
private static native boolean __call93002304_10(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native byte[] __call93002304_11(java.io.FileInputStream a0) throws Throwable;
private static native com.moon.jI __call93002304_12(com.moon.jI a0, java.lang.String a1) throws Throwable;
private static native java.util.Map __fieldRead93002304_13(com.moon.jK a0) throws Throwable;
private static native java.lang.Object __call93002304_14(java.util.Map a0, java.lang.String a1, com.moon.jI a2) throws Throwable;
private static native java.io.File __fieldRead93002304_15(com.moon.jK a0) throws Throwable;
private static native boolean __call93002304_16(java.io.File a0) throws Throwable;
private static native int __integerCategory93002304_17(boolean value) throws Throwable;
private static native int __integerCategory93002304_18(boolean value) throws Throwable;
private static native com.google.gson.Gson __fieldRead93002304_19() throws Throwable;
private static native java.io.File __fieldRead93002304_20(com.moon.jK a0) throws Throwable;
private static native java.lang.Class __classLiteral93002304_21() throws Throwable;
private static native java.lang.Object __call93002304_22(com.google.gson.Gson a0, java.io.FileReader a1, java.lang.Class a2) throws Throwable;
private static native com.moon.jM __cast93002304_23(java.lang.Object a0) throws Throwable;
private static native java.util.List __call93002304_24(com.moon.jM a0) throws Throwable;
private static native java.util.Iterator __call93002304_25(java.util.List a0) throws Throwable;
private static native boolean __call93002304_26(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call93002304_27(java.util.Iterator a0) throws Throwable;
private static native com.moon.jL __cast93002304_28(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call93002304_29(com.moon.jL a0) throws Throwable;
private static native com.moon.jI __call93002304_30(com.moon.jK a0, java.lang.String a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call93002304_31() throws Throwable;
private static native org.tinylog.TaggedLogger __call93002304_32(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.lang.String __call93002304_33(com.moon.jL a0) throws Throwable;
private static native java.lang.String __invokedynamic93002304_34(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic93002304_36(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic93002304_37(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call93002304_38(org.tinylog.TaggedLogger a0, java.lang.String a1) throws Throwable;
private static native com.moon.jJ __fieldRead93002304_39(com.moon.jK a0) throws Throwable;
private static native void __call93002304_40(com.moon.jJ a0, com.moon.jI a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call93002304_41() throws Throwable;
private static native org.tinylog.TaggedLogger __call93002304_42(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.lang.String __call93002304_43(com.moon.jL a0) throws Throwable;
private static native java.lang.String __invokedynamic93002304_44(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic93002304_46(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic93002304_47(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call93002304_48(org.tinylog.TaggedLogger a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call93002305_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call93002306_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call93002307_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call93002308_0(java.lang.Exception a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call93002309_0() throws Throwable;
private static native org.tinylog.TaggedLogger __call93002309_1(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call93002309_2(org.tinylog.TaggedLogger a0, java.lang.Exception a1) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_d46884b9dea2e052f97a(com.moon.jK a0) throws E;
private static final class __SourceHandler_d46884b9dea2e052f97a {

public static void f56(com.moon.jK receiver) throws Throwable {
    com.moon.jI lexicalValue56_34_0;
    java.lang.String[] spill56_0;
    com.moon.jI spill56_1;
    java.nio.file.Path spill56_2;
    java.lang.String spill56_3;
    java.nio.file.OpenOption[] spill56_4;
    java.nio.file.OpenOption[] spill56_5;
    java.nio.file.OpenOption[] spill56_6;
    long life1_3;
    com.moon.jM life4_8;
    java.util.ArrayList life5_12;
    java.lang.String[] life3_13;
    java.util.Iterator life6_18;
    com.moon.jI life7_25;
    java.lang.String life8_44;
    lexical_join_78: {
    lexical_join_52: {
    life1_3 = (__fieldRead56_0() ^ 60672988197527L);
    spill56_0 = __call56_1();
    life4_8 = new com.moon.jM();
    life5_12 = new java.util.ArrayList();
    life3_13 = spill56_0;
    life6_18 = __call56_4(__call56_3(__fieldRead56_2(receiver)));
    lexical_cycle_19: while (true) {
    lexical_join_50: {
    lexical_join_34: {
    if (!(__call56_5(life6_18))) {
        break lexical_join_52;
    }
    life7_25 = __cast56_7(__call56_6(life6_18));
    if (!((life3_13 != null))) {
        break lexical_join_78;
    }
    spill56_1 = life7_25;
    if (!((life3_13 != null))) {
        lexicalValue56_34_0 = spill56_1;
        break lexical_join_34;
    }
    if (!(__call56_8(spill56_1))) {
        break lexical_join_50;
    }
    lexicalValue56_34_0 = life7_25;
    }
    life8_44 = __call56_9(lexicalValue56_34_0);
    __call56_12(life5_12, new com.moon.jL(life8_44, __invokedynamic56_11(life8_44, __invokedynamic56_10(2716, (3331940636855069002L ^ life1_3)))));
    }
    if (!((life3_13 == null))) { continue lexical_cycle_19; }
    break lexical_cycle_19;
    }
    }
    __call56_13(life4_8, life5_12);
    spill56_2 = __call56_15(__fieldRead56_14(receiver));
    spill56_3 = __call56_17(__fieldRead56_16(), life4_8);
    java.nio.file.OpenOption[] __stackOp56_18_0 = new java.nio.file.OpenOption[3];
    spill56_4 = __stackOp56_18_0;
    (__stackOp56_18_0)[0] = __fieldRead56_19();
    java.nio.file.OpenOption[] __stackOp56_20_0 = spill56_4;
    spill56_5 = __stackOp56_20_0;
    (__stackOp56_20_0)[1] = __fieldRead56_21();
    java.nio.file.OpenOption[] __stackOp56_22_0 = spill56_5;
    spill56_6 = __stackOp56_22_0;
    (__stackOp56_22_0)[2] = __fieldRead56_23();
    __call56_24(spill56_2, spill56_3, spill56_6);
    }
    return;
}
public static void h56_0(java.io.IOException p0) throws Throwable {
    throw __call2005600_0(p0);
}
public static void h56_1(java.io.IOException p0) throws Throwable {
    throw __call2005601_0(p0);
}
public static void h56_2(java.io.IOException p0) throws Throwable {
    throw __call2005602_0(p0);
}
public static void h56_3(java.io.IOException p0) throws Throwable {
    java.io.IOException local1 = p0;
    __call2005603_0(local1);
    return;
}
private static native long __fieldRead56_0() throws Throwable;
private static native java.lang.String[] __call56_1() throws Throwable;
private static native java.util.Map __fieldRead56_2(com.moon.jK a0) throws Throwable;
private static native java.util.Collection __call56_3(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call56_4(java.util.Collection a0) throws Throwable;
private static native boolean __call56_5(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call56_6(java.util.Iterator a0) throws Throwable;
private static native com.moon.jI __cast56_7(java.lang.Object a0) throws Throwable;
private static native boolean __call56_8(com.moon.jI a0) throws Throwable;
private static native java.lang.String __call56_9(com.moon.jI a0) throws Throwable;
private static native java.lang.String __invokedynamic56_10(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic56_11(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native boolean __call56_12(java.util.ArrayList a0, com.moon.jL a1) throws Throwable;
private static native com.moon.jM __call56_13(com.moon.jM a0, java.util.ArrayList a1) throws Throwable;
private static native java.io.File __fieldRead56_14(com.moon.jK a0) throws Throwable;
private static native java.nio.file.Path __call56_15(java.io.File a0) throws Throwable;
private static native com.google.gson.Gson __fieldRead56_16() throws Throwable;
private static native java.lang.String __call56_17(com.google.gson.Gson a0, com.moon.jM a1) throws Throwable;
private static native java.nio.file.StandardOpenOption __fieldRead56_19() throws Throwable;
private static native java.nio.file.StandardOpenOption __fieldRead56_21() throws Throwable;
private static native java.nio.file.StandardOpenOption __fieldRead56_23() throws Throwable;
private static native java.nio.file.Path __call56_24(java.nio.file.Path a0, java.lang.String a1, java.nio.file.OpenOption[] a2) throws Throwable;
private static native java.lang.Exception __call2005600_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2005601_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2005602_0(java.io.IOException a0) throws Throwable;
private static native void __call2005603_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_927da6a2ea0f2312cce2(com.moon.jK a0, java.lang.String a1) throws E;
private static final class __SourceHandler_927da6a2ea0f2312cce2 {

public static void f38(com.moon.jK receiver, java.lang.String p0) throws Throwable {
    java.lang.Object forwardValue38_18_0;
    java.lang.String[] spill38_0;
    com.moon.jI spill38_1;
    long life2_3;
    com.moon.jI life5_8;
    java.lang.String[] life4_9;
    forward_join_19: {
    forward_join_18: {
    life2_3 = (__fieldRead38_0() ^ 45861618014694L);
    spill38_0 = __call38_1();
    life5_8 = __call38_2(receiver, p0);
    life4_9 = spill38_0;
    spill38_1 = life5_8;
    if (!((life4_9 != null))) {
        forwardValue38_18_0 = spill38_1;
        break forward_join_18;
    }
    if (!((spill38_1 != null))) {
        break forward_join_19;
    }
    forwardValue38_18_0 = __call38_4(__fieldRead38_3(receiver), p0);
    }
    __discardScalar38_5(forwardValue38_18_0);
    }
    return;
}
public static void h38_0(moom.Oo p0) throws Throwable {
    throw __call1003800_0(p0);
}
public static void h38_1(moom.Oo p0) throws Throwable {
    throw __call1003801_0(p0);
}
private static native long __fieldRead38_0() throws Throwable;
private static native java.lang.String[] __call38_1() throws Throwable;
private static native com.moon.jI __call38_2(com.moon.jK a0, java.lang.String a1) throws Throwable;
private static native java.util.Map __fieldRead38_3(com.moon.jK a0) throws Throwable;
private static native java.lang.Object __call38_4(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native void __discardScalar38_5(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1003800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1003801_0(moom.Oo a0) throws Throwable;

}


public com.moon.jI b(java.lang.String p0) {
return ((com.moon.jI)(((java.util.Map)(this.c)).get(((java.lang.Object)(p0)))));
}


public java.io.File b() {
return this.e;
}


public java.io.File a__File() {
return this.d;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1900_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/jK"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.jK.a(((int)(local4)), ((long)(local5)));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 12962);
    if (((com.moon.jK.h)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.jK.i)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.jK.i)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/jK", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.jK.g)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.jK.h)[life5_8] = com.moon.jK.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.jK.h)[life5_8];
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
        byte[] spill789_0 = p0;
        life4_9 += 1;
        life5_44 = (spill789_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill789_1 = p0;
        life4_9 += 1;
        life5_76 = (spill789_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill789_2 = p0;
        life4_9 += 1;
        life5_91 = (spill789_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public void a__Void(java.lang.String p0) { __sourceHandlerCall_927da6a2ea0f2312cce2(this, p0); }


public void a(com.moon.jI p0) {
long life2_3;
    java.io.File life4_17;
    java.io.FileInputStream life5_25;
    byte[] life6_28;
    life2_3 = (com.moon.jK.f ^ 20439080751436L);
    life4_17 = new java.io.File(this.d, __sourceIntrinsic_23b17f2730b5_invokedynamic1587_4(((com.moon.jI)(p0)).a(), __sourceIntrinsic_23b17f2730b5_invokedynamic1587_3(13207, (1936270410117133201L ^ life2_3))));
    if (((java.io.File)(life4_17)).exists()) {
        try {
        life5_25 = new java.io.FileInputStream(life4_17);
        life6_28 = ((java.io.FileInputStream)(life5_25)).readAllBytes();
        ((com.moon.jI)(p0)).a(((java.lang.String)(new java.lang.String(life6_28))));
    } catch (java.lang.Exception life5_37) {
        ((java.lang.Exception)(life5_37)).printStackTrace();
    }
    }
    return;
}


public void a__Void() { __sourceHandlerCall_d46884b9dea2e052f97a(this); }


public void a(java.io.File p0, boolean p1) { __sourceHandlerCall_67b085f7025e9b6143ba(this, p0, p1); }


public com.moon.jI a(java.lang.String p0) {
((com.moon.jK)(this)).a(((java.io.File)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__File())), ((boolean)(false)));
    return ((com.moon.jI)(((java.util.Map)(this.c)).get(((java.lang.Object)(p0)))));
}


public com.moon.jJ a() {
return this.b;
}


public java.util.Map<java.lang.String, com.moon.jI> a__Map() {
return this.c;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_23b17f2730b5_invokedynamic1587_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_23b17f2730b5_invokedynamic1587_4(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1900_0() throws E;
}
