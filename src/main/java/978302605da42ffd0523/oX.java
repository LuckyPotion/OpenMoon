package moom;


public class oX {

private static org.apache.logging.log4j.Logger a;

private java.util.Map<java.lang.String, java.io.File> b;

private static long c;

public oX(java.io.File p0, java.lang.String p1) { super(); __sourceHandlerCall_d47e436582766f2cd7ee(this, p0, p1); }


static {
moom.oX.c = (moom._c.a(-7537701949904309700L, -5485646116877266824L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(193281931006176L);
    moom.oX.a = org.apache.logging.log4j.LogManager.getLogger();
}

private static native <E extends Throwable> void __sourceHandlerCall_d47e436582766f2cd7ee(moom.oX a0, java.io.File a1, java.lang.String a2) throws E;
private static final class __SourceHandler_d47e436582766f2cd7ee {

public static void f400018(moom.oX receiver, java.io.File p0, java.lang.String p1) throws Throwable {
    java.lang.String[] forestValue400018_82_0;
    java.lang.String forestValue400018_88_0;
    java.lang.String[] spill400018_0;
    java.lang.String[] spill400018_1;
    long life3_3;
    java.lang.String[] life5_7;
    java.io.File life6_18;
    java.io.File life7_25;
    java.lang.Object life8_27;
    java.io.BufferedReader life8_31;
    com.google.gson.JsonObject life9_35;
    com.google.gson.JsonObject life10_40;
    java.util.Iterator life11_49;
    java.util.Map.Entry life12_56;
    com.google.gson.JsonObject life13_60;
    java.lang.String life14_64;
    java.lang.String[] life15_69;
    java.lang.String life16_91;
    java.lang.String life17_95;
    java.io.File life18_106;
    forest_join_114: {
    forest_join_112: {
    life3_3 = (__fieldRead400018_0() ^ 104428709953545L);
    spill400018_0 = __call400018_1();
    __directSuperInit400018_2(receiver);
    life5_7 = spill400018_0;
    __fieldWrite400018_4(receiver, __call400018_3());
    if (!((p1 != null))) {
        break forest_join_114;
    }
    life6_18 = new java.io.File(p0, "objects");
    life7_25 = new java.io.File(p0, __invokedynamic400018_5(p1));
    life8_27 = null;
    life8_31 = __call400018_7(life7_25, __fieldRead400018_6());
    life9_35 = __call400018_9(__call400018_8(life8_31));
    life10_40 = __call400018_10(life9_35, "objects", null);
    if (!((life5_7 != null))) {
        break forest_join_114;
    }
    if (!((life10_40 != null))) {
        break forest_join_112;
    }
    life11_49 = __call400018_12(__call400018_11(life10_40));
    forest_cycle_49: while (true) {
    forest_join_88: {
    forest_join_82: {
    forest_join_81: {
    if (!(__call400018_13(life11_49))) {
        break forest_join_112;
    }
    life12_56 = __cast400018_15(__call400018_14(life11_49));
    life13_60 = __cast400018_17(__call400018_16(life12_56));
    life14_64 = __cast400018_19(__call400018_18(life12_56));
    life15_69 = __call400018_20(life14_64, "/", 2);
    if (!((life5_7 != null))) {
        break forest_join_114;
    }
    spill400018_1 = life15_69;
    if (!((life5_7 != null))) {
        forestValue400018_82_0 = spill400018_1;
        break forest_join_82;
    }
    if (!(((spill400018_1).length == 1))) {
        break forest_join_81;
    }
    forestValue400018_88_0 = (life15_69)[0];
    break forest_join_88;
    }
    forestValue400018_82_0 = life15_69;
    }
    forestValue400018_88_0 = __invokedynamic400018_21((forestValue400018_82_0)[0], (life15_69)[1]);
    }
    life16_91 = forestValue400018_88_0;
    life17_95 = __call400018_22(life13_60, "hash");
    life18_106 = new java.io.File(life6_18, __invokedynamic400018_24(__call400018_23(life17_95, 0, 2), life17_95));
    __call400018_26(__fieldRead400018_25(receiver), life16_91, life18_106);
    if (!((life5_7 == null))) {
        continue forest_cycle_49;
    }
    break forest_cycle_49;
    }
    }
    __call400018_27(life8_31);
    }
    return;
}
public static void h400018_0(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call43001800_0(p0);
}
public static void h400018_1(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call43001801_0(p0);
}
public static void h400018_2(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call43001802_0(p0);
}
public static void h400018_3(com.google.gson.JsonParseException p0) throws Throwable {
    throw __call43001803_0(p0);
}
public static void h400018_4(com.google.gson.JsonParseException p0, java.io.File p1, java.io.BufferedReader p2) throws Throwable {
    com.google.gson.JsonParseException life3_2;
    life3_2 = p0;
    __call43001804_2(__fieldRead43001804_0(), __invokedynamic43001804_1(p1));
    __call43001804_3(p2);
    return;
}
public static void h400018_5(java.io.FileNotFoundException p0, java.io.File p1, java.io.BufferedReader p2) throws Throwable {
    java.io.FileNotFoundException life3_2;
    life3_2 = p0;
    __call43001805_2(__fieldRead43001805_0(), __invokedynamic43001805_1(p1));
    __call43001805_3(p2);
    return;
}
public static void h400018_6(java.lang.Throwable p0, java.io.BufferedReader p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call43001806_0(p1);
    throw life2_2;
}
private static native long __fieldRead400018_0() throws Throwable;
private static native java.lang.String[] __call400018_1() throws Throwable;
private static native void __directSuperInit400018_2(moom.oX a0) throws Throwable;
private static native java.util.HashMap __call400018_3() throws Throwable;
private static native void __fieldWrite400018_4(moom.oX a0, java.util.HashMap a1) throws Throwable;
private static native java.lang.String __invokedynamic400018_5(java.lang.String a0) throws Throwable;
private static native java.nio.charset.Charset __fieldRead400018_6() throws Throwable;
private static native java.io.BufferedReader __call400018_7(java.io.File a0, java.nio.charset.Charset a1) throws Throwable;
private static native com.google.gson.JsonElement __call400018_8(java.io.BufferedReader a0) throws Throwable;
private static native com.google.gson.JsonObject __call400018_9(com.google.gson.JsonElement a0) throws Throwable;
private static native com.google.gson.JsonObject __call400018_10(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Object a2) throws Throwable;
private static native java.util.Set __call400018_11(com.google.gson.JsonObject a0) throws Throwable;
private static native java.util.Iterator __call400018_12(java.util.Set a0) throws Throwable;
private static native boolean __call400018_13(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call400018_14(java.util.Iterator a0) throws Throwable;
private static native java.util.Map.Entry __cast400018_15(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call400018_16(java.util.Map.Entry a0) throws Throwable;
private static native com.google.gson.JsonObject __cast400018_17(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call400018_18(java.util.Map.Entry a0) throws Throwable;
private static native java.lang.String __cast400018_19(java.lang.Object a0) throws Throwable;
private static native java.lang.String[] __call400018_20(java.lang.String a0, java.lang.String a1, int a2) throws Throwable;
private static native java.lang.String __invokedynamic400018_21(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call400018_22(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call400018_23(java.lang.String a0, int a1, int a2) throws Throwable;
private static native java.lang.String __invokedynamic400018_24(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.util.Map __fieldRead400018_25(moom.oX a0) throws Throwable;
private static native java.lang.Object __call400018_26(java.util.Map a0, java.lang.String a1, java.io.File a2) throws Throwable;
private static native void __call400018_27(java.io.BufferedReader a0) throws Throwable;
private static native com.google.gson.JsonParseException __call43001800_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native com.google.gson.JsonParseException __call43001801_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native com.google.gson.JsonParseException __call43001802_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native com.google.gson.JsonParseException __call43001803_0(com.google.gson.JsonParseException a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead43001804_0() throws Throwable;
private static native java.lang.String __invokedynamic43001804_1(java.io.File a0) throws Throwable;
private static native void __call43001804_2(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native void __call43001804_3(java.io.BufferedReader a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead43001805_0() throws Throwable;
private static native java.lang.String __invokedynamic43001805_1(java.io.File a0) throws Throwable;
private static native void __call43001805_2(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native void __call43001805_3(java.io.BufferedReader a0) throws Throwable;
private static native void __call43001806_0(java.io.BufferedReader a0) throws Throwable;

}


public java.util.Map<java.lang.String, java.io.File> a() {
return this.b;
}


private static com.google.gson.JsonParseException a(com.google.gson.JsonParseException p0) {
return p0;
}

}
