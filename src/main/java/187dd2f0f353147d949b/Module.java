package com.moon.module;


public class Module extends com.moon.module.SettingOwner implements com.moon.cZ {

protected static net.minecraft.client.Minecraft d;

private java.lang.String name;

private java.lang.String displayText;

private java.lang.String tooltipText;

private java.lang.String suffix;

private com.moon.module.ModuleCategory category;

private com.moon.nY listAnimation;

private boolean enabled;

private boolean hidden;

private int keyCode;

private com.moon.module.InputSource inputSource;

private com.moon.module.PressType pressType;

private float p;

private float q;

private static int r;

private static long bb;

private static java.lang.String[] hb;

private static java.lang.String[] ib;

private static java.util.Map jb;

private static long nb;

private static long rb;

public Module(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) { super(); __sourceHandlerCall_bac593141184e534e945(this, p0, p1, p2, p3); }

private static native <E extends Throwable> void __sourceHandlerCall_bac593141184e534e945(com.moon.module.Module a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, com.moon.module.ModuleCategory a4) throws E;
private static final class __SourceHandler_bac593141184e534e945 {

public static void f1204(com.moon.module.Module receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) throws Throwable {
    long local5 = (__fieldRead1204_0() ^ 109683362061889L);
    __directSuperInit1204_1(receiver);
    __fieldWrite1204_2(receiver, "");
    __fieldWrite1204_5(receiver, new com.moon.nY(__fieldRead1204_3(), __fieldRead1204_4()));
    __fieldWrite1204_7(receiver, ((int) __fieldRead1204_6()));
    __fieldWrite1204_9(receiver, __fieldRead1204_8());
    __fieldWrite1204_11(receiver, __fieldRead1204_10());
    __fieldWrite1204_12(receiver, p0);
    __fieldWrite1204_13(receiver, p1);
    __fieldWrite1204_14(receiver, p2);
    __fieldWrite1204_15(receiver, p3);
    return;
}
private static native long __fieldRead1204_0();
private static native void __directSuperInit1204_1(com.moon.module.Module a0);
private static native void __fieldWrite1204_2(com.moon.module.Module a0, java.lang.String a1);
private static native long __fieldRead1204_3();
private static native com.moon.cj __fieldRead1204_4();
private static native void __fieldWrite1204_5(com.moon.module.Module a0, com.moon.nY a1);
private static native long __fieldRead1204_6();
private static native void __fieldWrite1204_7(com.moon.module.Module a0, int a1);
private static native com.moon.module.InputSource __fieldRead1204_8();
private static native void __fieldWrite1204_9(com.moon.module.Module a0, com.moon.module.InputSource a1);
private static native com.moon.module.PressType __fieldRead1204_10();
private static native void __fieldWrite1204_11(com.moon.module.Module a0, com.moon.module.PressType a1);
private static native void __fieldWrite1204_12(com.moon.module.Module a0, java.lang.String a1);
private static native void __fieldWrite1204_13(com.moon.module.Module a0, java.lang.String a1);
private static native void __fieldWrite1204_14(com.moon.module.Module a0, java.lang.String a1);
private static native void __fieldWrite1204_15(com.moon.module.Module a0, com.moon.module.ModuleCategory a1);

}

private static native <E extends Throwable> void __sourceHandlerCall_1b2e4a0c94c0ce516933(com.moon.module.Module a0) throws E;
private static final class __SourceHandler_1b2e4a0c94c0ce516933 {

public static void f490(com.moon.module.Module receiver) throws Throwable {
    com.moon.module.Module forwardValue490_13_0;
    int forwardValue490_13_1;
    com.moon.module.Module forwardValue490_14_0;
    com.moon.module.Module forwardValue490_15_0;
    int forwardValue490_15_1;
    com.moon.module.Module spill490_0;
    boolean spill490_1;
    long life1_3;
    int[] life3_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (__fieldRead490_0() ^ 138386012667040L);
    life3_5 = __call490_1();
    spill490_0 = receiver;
    spill490_1 = __fieldRead490_2(receiver);
    if (!((life3_5 != null))) {
        forwardValue490_13_0 = spill490_0;
        forwardValue490_13_1 = __integerCategory490_3(spill490_1);
        break forward_join_13;
    }
    if (!((!spill490_1))) {
        forwardValue490_14_0 = spill490_0;
        break forward_join_14;
    }
    forwardValue490_13_0 = spill490_0;
    forwardValue490_13_1 = 1;
    }
    forwardValue490_15_0 = forwardValue490_13_0;
    forwardValue490_15_1 = forwardValue490_13_1;
    break forward_join_15;
    }
    forwardValue490_15_0 = forwardValue490_14_0;
    forwardValue490_15_1 = 0;
    }
    __call490_4(forwardValue490_15_0, forwardValue490_15_1);
    return;
}
public static void h490_0(moom.Oo p0) throws Throwable {
    throw __call1049000_0(p0);
}
private static native long __fieldRead490_0() throws Throwable;
private static native int[] __call490_1() throws Throwable;
private static native boolean __fieldRead490_2(com.moon.module.Module a0) throws Throwable;
private static native int __integerCategory490_3(boolean value) throws Throwable;
private static native void __call490_4(com.moon.module.Module a0, int a1) throws Throwable;
private static native java.lang.Exception __call1049000_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_36cebf06862cff5baf19() throws E;
private static final class __SourceHandler_36cebf06862cff5baf19 {

public static int f694() throws Throwable {
    int life0_1;
    life0_1 = __call694_0();
    if ((life0_1 == 0)) {
        return 95;
    }
    return 0;
}
public static void h694_0(moom.Oo p0) throws Throwable {
    throw __call1069400_0(p0);
}
private static native int __call694_0() throws Throwable;
private static native java.lang.Exception __call1069400_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_36ceae636bdb819e4350(com.moon.module.Module a0, boolean a1) throws E;
private static final class __SourceHandler_36ceae636bdb819e4350 {

public static void f488(com.moon.module.Module receiver, boolean p0) throws Throwable {
    com.moon.events.EventBus lexicalValue488_19_0;
    java.lang.Object lexicalValue488_62_0;
    com.moon.events.EventBus spill488_0;
    com.moon.setting.Setting spill488_1;
    long life2_3;
    int[] life4_5;
    com.moon.events.EventBus life5_15;
    java.util.Iterator life6_61;
    com.moon.setting.Setting life7_68;
    com.moon.kS life8_83;
    lexical_join_87: {
    lexical_join_44: {
    lexical_join_41: {
    lexical_join_39: {
    lexical_join_19: {
    lexical_join_11: {
    life2_3 = (__fieldRead488_0() ^ 121796409654224L);
    life4_5 = __call488_1();
    if (!((__fieldRead488_2(receiver) == p0))) {
        break lexical_join_11;
    }
    return;
    }
    life5_15 = __call488_4(__call488_3());
    spill488_0 = life5_15;
    if (!((life4_5 != null))) {
        lexicalValue488_19_0 = spill488_0;
        break lexical_join_19;
    }
    if (!((spill488_0 != null))) {
        break lexical_join_44;
    }
    lexicalValue488_19_0 = life5_15;
    }
    __call488_5(lexicalValue488_19_0, new com.moon.event.ModuleToggleEvent(p0, receiver));
    __fieldWrite488_6(receiver, p0);
    if (!((life4_5 != null))) {
        break lexical_join_41;
    }
    if (!(p0)) {
        break lexical_join_39;
    }
    __call488_7(receiver);
    __call488_8(life5_15, receiver);
    if (!((life4_5 == null))) {
        break lexical_join_44;
    }
    }
    __call488_9(receiver);
    }
    __call488_10(life5_15, receiver);
    }
    life6_61 = __call488_12(__call488_11(receiver));
    lexical_cycle_48: while (true) {
    lexical_join_85: {
    lexical_join_78: {
    lexical_join_62: {
    if (!(__call488_13(life6_61))) {
        break lexical_join_87;
    }
    life7_68 = __cast488_15(__call488_14(life6_61));
    spill488_1 = life7_68;
    if (!((life4_5 != null))) {
        lexicalValue488_62_0 = spill488_1;
        break lexical_join_62;
    }
    if (!((__instanceOf488_16(spill488_1) != 0))) {
        break lexical_join_85;
    }
    lexicalValue488_62_0 = __call488_17(life7_68);
    }
    life8_83 = __cast488_18(lexicalValue488_62_0);
    if (!((__call488_19(life8_83) != null))) {
        break lexical_join_85;
    }
    if (!(p0)) {
        break lexical_join_78;
    }
    __call488_21(__call488_20(life8_83));
    __call488_23(life5_15, __call488_22(life8_83));
    if (!((life4_5 == null))) {
        break lexical_join_85;
    }
    }
    __call488_25(__call488_24(life8_83));
    __call488_27(life5_15, __call488_26(life8_83));
    }
    if (!((life4_5 == null))) { continue lexical_cycle_48; }
    break lexical_cycle_48;
    }
    }
    return;
}
public static void h488_0(moom.Oo p0) throws Throwable {
    throw __call1048800_0(p0);
}
public static void h488_1(moom.Oo p0) throws Throwable {
    throw __call1048801_0(p0);
}
public static void h488_2(moom.Oo p0) throws Throwable {
    throw __call1048802_0(p0);
}
public static void h488_3(moom.Oo p0) throws Throwable {
    throw __call1048803_0(p0);
}
public static void h488_4(moom.Oo p0) throws Throwable {
    throw __call1048804_0(p0);
}
public static void h488_5(moom.Oo p0) throws Throwable {
    throw __call1048805_0(p0);
}
public static void h488_6(moom.Oo p0) throws Throwable {
    throw __call1048806_0(p0);
}
public static void h488_7(moom.Oo p0) throws Throwable {
    throw __call1048807_0(p0);
}
public static void h488_8(moom.Oo p0) throws Throwable {
    throw __call1048808_0(p0);
}
public static void h488_9(moom.Oo p0) throws Throwable {
    throw __call1048809_0(p0);
}
private static native long __fieldRead488_0() throws Throwable;
private static native int[] __call488_1() throws Throwable;
private static native boolean __fieldRead488_2(com.moon.module.Module a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call488_3() throws Throwable;
private static native com.moon.events.EventBus __call488_4(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call488_5(com.moon.events.EventBus a0, com.moon.event.ModuleToggleEvent a1) throws Throwable;
private static native void __fieldWrite488_6(com.moon.module.Module a0, boolean a1) throws Throwable;
private static native void __call488_7(com.moon.module.Module a0) throws Throwable;
private static native void __call488_8(com.moon.events.EventBus a0, com.moon.module.Module a1) throws Throwable;
private static native void __call488_9(com.moon.module.Module a0) throws Throwable;
private static native void __call488_10(com.moon.events.EventBus a0, com.moon.module.Module a1) throws Throwable;
private static native java.util.List __call488_11(com.moon.module.Module a0) throws Throwable;
private static native java.util.Iterator __call488_12(java.util.List a0) throws Throwable;
private static native boolean __call488_13(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call488_14(java.util.Iterator a0) throws Throwable;
private static native com.moon.setting.Setting __cast488_15(java.lang.Object a0) throws Throwable;
private static native int __instanceOf488_16(com.moon.setting.Setting a0) throws Throwable;
private static native java.lang.Object __call488_17(com.moon.setting.Setting a0) throws Throwable;
private static native com.moon.kS __cast488_18(java.lang.Object a0) throws Throwable;
private static native com.moon.e2 __call488_19(com.moon.kS a0) throws Throwable;
private static native com.moon.e2 __call488_20(com.moon.kS a0) throws Throwable;
private static native void __call488_21(com.moon.e2 a0) throws Throwable;
private static native com.moon.e2 __call488_22(com.moon.kS a0) throws Throwable;
private static native void __call488_23(com.moon.events.EventBus a0, com.moon.e2 a1) throws Throwable;
private static native com.moon.e2 __call488_24(com.moon.kS a0) throws Throwable;
private static native void __call488_25(com.moon.e2 a0) throws Throwable;
private static native com.moon.e2 __call488_26(com.moon.kS a0) throws Throwable;
private static native void __call488_27(com.moon.events.EventBus a0, com.moon.e2 a1) throws Throwable;
private static native java.lang.Exception __call1048800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1048801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1048802_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1048803_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1048804_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1048805_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1048806_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1048807_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1048808_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1048809_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> com.google.gson.JsonObject __sourceHandlerCall_718a409279e7d4d7b1c4(com.moon.module.Module a0) throws E;
private static final class __SourceHandler_718a409279e7d4d7b1c4 {

public static com.google.gson.JsonObject f489(com.moon.module.Module receiver) throws Throwable {
    int[] spill489_0;
    long life1_3;
    com.google.gson.JsonObject life4_7;
    int[] life3_70;
    com.google.gson.JsonArray life5_74;
    java.util.Iterator life6_78;
    com.moon.setting.Setting life7_85;
    lexical_join_105: {
    lexical_join_97: {
    life1_3 = (__fieldRead489_0() ^ 135923131313638L);
    life4_7 = new com.google.gson.JsonObject();
    __call489_3(life4_7, __invokedynamic489_1(2581, (2306982282273505969L ^ life1_3)), __fieldRead489_2(receiver));
    __call489_7(life4_7, __invokedynamic489_4(18186, (4352652058054299553L ^ life1_3)), __call489_6(__fieldRead489_5(receiver)));
    __call489_11(life4_7, __invokedynamic489_8(10477, (5889077254635413578L ^ life1_3)), __call489_10(__fieldRead489_9(receiver)));
    __call489_15(life4_7, __invokedynamic489_12(24944, (1404021395140192730L ^ life1_3)), __call489_14(__fieldRead489_13(receiver)));
    spill489_0 = __call489_16();
    __call489_21(life4_7, __invokedynamic489_17(22257, (374456804432223827L ^ life1_3)), __call489_20(__call489_19(__fieldRead489_18(receiver))));
    __call489_26(life4_7, __invokedynamic489_22(28788, (6272749085875353816L ^ life1_3)), __call489_25(__call489_24(__fieldRead489_23(receiver))));
    life3_70 = spill489_0;
    life5_74 = new com.google.gson.JsonArray();
    life6_78 = __call489_28(__call489_27(receiver));
    lexical_cycle_79: while (true) {
    if (!(__call489_29(life6_78))) {
        break lexical_join_97;
    }
    life7_85 = __cast489_31(__call489_30(life6_78));
    __call489_33(life5_74, __call489_32(life7_85));
    if (!((life3_70 != null))) {
        break lexical_join_105;
    }
    if (!((life3_70 == null))) { continue lexical_cycle_79; }
    break lexical_cycle_79;
    }
    __call489_34(new java.lang.String[5]);
    }
    __call489_36(life4_7, __invokedynamic489_35(31705, (5097385817754841978L ^ life1_3)), life5_74);
    }
    return life4_7;
}
public static void h489_0(moom.Oo p0) throws Throwable {
    throw __call1048900_0(p0);
}
private static native long __fieldRead489_0() throws Throwable;
private static native java.lang.String __invokedynamic489_1(int a0, long a1) throws Throwable;
private static native java.lang.String __fieldRead489_2(com.moon.module.Module a0) throws Throwable;
private static native void __call489_3(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __invokedynamic489_4(int a0, long a1) throws Throwable;
private static native boolean __fieldRead489_5(com.moon.module.Module a0) throws Throwable;
private static native java.lang.Boolean __call489_6(boolean a0) throws Throwable;
private static native void __call489_7(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native java.lang.String __invokedynamic489_8(int a0, long a1) throws Throwable;
private static native boolean __fieldRead489_9(com.moon.module.Module a0) throws Throwable;
private static native java.lang.Boolean __call489_10(boolean a0) throws Throwable;
private static native void __call489_11(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Boolean a2) throws Throwable;
private static native java.lang.String __invokedynamic489_12(int a0, long a1) throws Throwable;
private static native int __fieldRead489_13(com.moon.module.Module a0) throws Throwable;
private static native java.lang.Integer __call489_14(int a0) throws Throwable;
private static native void __call489_15(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int[] __call489_16() throws Throwable;
private static native java.lang.String __invokedynamic489_17(int a0, long a1) throws Throwable;
private static native com.moon.module.InputSource __fieldRead489_18(com.moon.module.Module a0) throws Throwable;
private static native int __call489_19(com.moon.module.InputSource a0) throws Throwable;
private static native java.lang.Integer __call489_20(int a0) throws Throwable;
private static native void __call489_21(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.lang.String __invokedynamic489_22(int a0, long a1) throws Throwable;
private static native com.moon.module.PressType __fieldRead489_23(com.moon.module.Module a0) throws Throwable;
private static native int __call489_24(com.moon.module.PressType a0) throws Throwable;
private static native java.lang.Integer __call489_25(int a0) throws Throwable;
private static native void __call489_26(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.util.List __call489_27(com.moon.module.Module a0) throws Throwable;
private static native java.util.Iterator __call489_28(java.util.List a0) throws Throwable;
private static native boolean __call489_29(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call489_30(java.util.Iterator a0) throws Throwable;
private static native com.moon.setting.Setting __cast489_31(java.lang.Object a0) throws Throwable;
private static native com.google.gson.JsonObject __call489_32(com.moon.setting.Setting a0) throws Throwable;
private static native void __call489_33(com.google.gson.JsonArray a0, com.google.gson.JsonObject a1) throws Throwable;
private static native void __call489_34(java.lang.String[] a0) throws Throwable;
private static native java.lang.String __invokedynamic489_35(int a0, long a1) throws Throwable;
private static native void __call489_36(com.google.gson.JsonObject a0, java.lang.String a1, com.google.gson.JsonArray a2) throws Throwable;
private static native java.lang.Exception __call1048900_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_84e2083803df1b7fd9eb(com.moon.module.Module a0, com.google.gson.JsonObject a1, boolean a2) throws E;
private static final class __SourceHandler_84e2083803df1b7fd9eb {

public static void f100031(com.moon.module.Module receiver, com.google.gson.JsonObject p0, boolean p1) throws Throwable {
    int forestValue100031_99_0;
    com.google.gson.JsonObject forestValue100031_116_0;
    java.lang.String forestValue100031_116_1;
    com.google.gson.JsonElement forestValue100031_124_0;
    com.google.gson.JsonElement forestValue100031_142_0;
    com.moon.setting.Setting forestValue100031_168_0;
    int[] spill100031_0;
    boolean spill100031_1;
    boolean spill100031_2;
    boolean spill100031_3;
    boolean spill100031_4;
    com.google.gson.JsonObject spill100031_5;
    java.lang.String spill100031_6;
    com.google.gson.JsonElement spill100031_7;
    com.google.gson.JsonElement spill100031_8;
    com.moon.setting.Setting spill100031_9;
    long life3_3;
    int[] life5_15;
    int life6_24;
    com.moon.module.InputSource life7_35;
    com.moon.module.PressType life8_46;
    com.google.gson.JsonElement life9_127;
    com.google.gson.JsonArray life10_137;
    java.util.Iterator life11_140;
    com.google.gson.JsonElement life12_147;
    com.google.gson.JsonObject life13_157;
    com.moon.setting.Setting life14_176;
    forest_join_177: {
    forest_join_172: {
    forest_join_124: {
    forest_join_116: {
    forest_join_110: {
    forest_join_99: {
    forest_join_90: {
    life3_3 = (__fieldRead100031_0() ^ 16610848575586L);
    spill100031_0 = __call100031_1();
    __call100031_5(receiver, __call100031_4(__call100031_3(p0, __invokedynamic100031_2(17104, (4818057519409592313L ^ life3_3)))));
    life5_15 = spill100031_0;
    life6_24 = __call100031_8(__call100031_7(p0, __invokedynamic100031_6(11357, (7267800732615154041L ^ life3_3))));
    life7_35 = (__call100031_9())[__call100031_12(__call100031_11(p0, __invokedynamic100031_10(30239, (4816039093675443005L ^ life3_3))))];
    life8_46 = (__call100031_13())[__call100031_16(__call100031_15(p0, __invokedynamic100031_14(30561, (8771004338892882509L ^ life3_3))))];
    spill100031_1 = p1;
    if (!((life5_15 != null))) {
        forestValue100031_99_0 = __integerCategory100031_17(spill100031_1);
        break forest_join_99;
    }
    if (!(spill100031_1)) {
        break forest_join_90;
    }
    spill100031_2 = __call100031_19(p0, __invokedynamic100031_18(22257, (374400194846319575L ^ life3_3)));
    if (!((life5_15 != null))) {
        forestValue100031_99_0 = __integerCategory100031_20(spill100031_2);
        break forest_join_99;
    }
    if (!(spill100031_2)) {
        break forest_join_90;
    }
    spill100031_3 = __call100031_22(p0, __invokedynamic100031_21(28788, (6272736426757866844L ^ life3_3)));
    if (!((life5_15 != null))) {
        forestValue100031_99_0 = __integerCategory100031_23(spill100031_3);
        break forest_join_99;
    }
    if (!(spill100031_3)) {
        break forest_join_90;
    }
    spill100031_4 = __call100031_25(p0, __invokedynamic100031_24(24944, (1404105492978914398L ^ life3_3)));
    if (!((life5_15 != null))) {
        forestValue100031_99_0 = __integerCategory100031_26(spill100031_4);
        break forest_join_99;
    }
    if (!(spill100031_4)) {
        break forest_join_90;
    }
    __fieldWrite100031_27(receiver, life6_24);
    __fieldWrite100031_28(receiver, life7_35);
    __fieldWrite100031_29(receiver, life8_46);
    }
    spill100031_5 = p0;
    spill100031_6 = __invokedynamic100031_30(8511, (8599037069515265054L ^ life3_3));
    if (!((life5_15 != null))) {
        forestValue100031_116_0 = spill100031_5;
        forestValue100031_116_1 = spill100031_6;
        break forest_join_116;
    }
    forestValue100031_99_0 = __integerCategory100031_32(__call100031_31(spill100031_5, spill100031_6));
    }
    if (!((forestValue100031_99_0 != 0))) {
        break forest_join_110;
    }
    __call100031_36(receiver, __call100031_35(__call100031_34(p0, __invokedynamic100031_33(10477, (5889089879453703630L ^ life3_3)))));
    }
    forestValue100031_116_0 = p0;
    forestValue100031_116_1 = __invokedynamic100031_37(19727, (2232195268365121573L ^ life3_3));
    }
    life9_127 = __call100031_38(forestValue100031_116_0, forestValue100031_116_1);
    spill100031_7 = life9_127;
    if (!((life5_15 != null))) {
        forestValue100031_124_0 = spill100031_7;
        break forest_join_124;
    }
    if (!(__call100031_39(spill100031_7))) {
        break forest_join_172;
    }
    forestValue100031_124_0 = life9_127;
    }
    life10_137 = __call100031_40(forestValue100031_124_0);
    life11_140 = __call100031_41(life10_137);
    forest_cycle_129: while (true) {
    forest_join_170: {
    forest_join_168: {
    forest_join_142: {
    if (!(__call100031_42(life11_140))) {
        break forest_join_172;
    }
    life12_147 = __cast100031_44(__call100031_43(life11_140));
    spill100031_8 = life12_147;
    if (!((life5_15 != null))) {
        forestValue100031_142_0 = spill100031_8;
        break forest_join_142;
    }
    if (!(__call100031_45(spill100031_8))) {
        break forest_join_170;
    }
    forestValue100031_142_0 = life12_147;
    }
    life13_157 = __call100031_46(forestValue100031_142_0);
    if (!(__call100031_48(life13_157, __invokedynamic100031_47(18629, (6507641309875961320L ^ life3_3))))) {
        break forest_join_170;
    }
    life14_176 = __call100031_52(receiver, __call100031_51(__call100031_50(life13_157, __invokedynamic100031_49(2581, (2307101594556546869L ^ life3_3)))));
    spill100031_9 = life14_176;
    if (!((life5_15 != null))) {
        forestValue100031_168_0 = spill100031_9;
        break forest_join_168;
    }
    if (!((spill100031_9 != null))) {
        break forest_join_170;
    }
    forestValue100031_168_0 = life14_176;
    }
    __call100031_53(forestValue100031_168_0, life13_157);
    }
    if (!((life5_15 == null))) {
        continue forest_cycle_129;
    }
    break forest_cycle_129;
    }
    }
    if (!((__call100031_54() != null))) {
        break forest_join_177;
    }
    __call100031_55(new int[4]);
    }
    return;
}
public static void h100031_0(java.lang.Exception p0) throws Throwable {
    throw __call13003100_0(p0);
}
public static void h100031_1(java.lang.Exception p0) throws Throwable {
    throw __call13003101_0(p0);
}
public static void h100031_2(java.lang.Exception p0) throws Throwable {
    throw __call13003102_0(p0);
}
public static void h100031_3(java.lang.Exception p0) throws Throwable {
    throw __call13003103_0(p0);
}
public static void h100031_4(java.lang.Exception p0) throws Throwable {
    throw __call13003104_0(p0);
}
public static void h100031_5(java.lang.Exception p0) throws Throwable {
    throw __call13003105_0(p0);
}
public static void h100031_6(java.lang.Exception p0) throws Throwable {
    throw __call13003106_0(p0);
}
public static void h100031_7(java.lang.Exception p0) throws Throwable {
    throw __call13003107_0(p0);
}
public static void h100031_8(java.lang.Exception p0) throws Throwable {
    throw __call13003108_0(p0);
}
public static void h100031_9(java.lang.Exception p0) throws Throwable {
    throw __call13003109_0(p0);
}
public static void h100031_10(java.lang.Exception p0) throws Throwable {
    throw __call13003110_0(p0);
}
public static void h100031_11(java.lang.Exception p0) throws Throwable {
    throw __call13003111_0(p0);
}
public static void h100031_12(java.lang.Exception p0) throws Throwable {
    throw __call13003112_0(p0);
}
public static void h100031_13(java.lang.Exception p0) throws Throwable {
    throw __call13003113_0(p0);
}
public static void h100031_14(java.lang.Exception p0) throws Throwable {
    throw __call13003114_0(p0);
}
public static void h100031_15(java.lang.Exception p0, com.moon.module.Module p1, long p2, int[] p3, java.util.Iterator p4, com.google.gson.JsonElement p5, com.google.gson.JsonObject p6, com.moon.setting.Setting p7) throws Throwable {
    com.google.gson.JsonElement forestValue13003115_39_0;
    com.moon.setting.Setting forestValue13003115_65_0;
    org.tinylog.TaggedLogger spill13003115_0;
    java.lang.String spill13003115_1;
    java.lang.String spill13003115_2;
    java.lang.String spill13003115_3;
    com.google.gson.JsonElement spill13003115_4;
    com.moon.setting.Setting spill13003115_5;
    java.lang.Exception life9_2;
    com.google.gson.JsonElement life6_33;
    com.google.gson.JsonObject life7_43;
    com.moon.setting.Setting life8_62;
    forest_join_73: {
    forest_join_68: {
    life9_2 = p0;
    spill13003115_0 = __call13003115_1(__call13003115_0());
    java.lang.String __stackOp13003115_5_0 = __call13003115_2(p7);
    java.lang.String __stackOp13003115_5_1 = __fieldRead13003115_3(p1);
    java.lang.String __stackOp13003115_5_2 = __invokedynamic13003115_4(20851, (364988467438478422L ^ p2));
    spill13003115_1 = __stackOp13003115_5_2;
    spill13003115_2 = __stackOp13003115_5_0;
    spill13003115_3 = __stackOp13003115_5_1;
    __discardScalar13003115_6(__stackOp13003115_5_2);
    java.lang.String __stackOp13003115_8_0 = spill13003115_3;
    java.lang.String __stackOp13003115_8_1 = __invokedynamic13003115_7(17854, (8433056017551552661L ^ p2));
    __call13003115_10(spill13003115_0, __invokedynamic13003115_9(spill13003115_1, spill13003115_2, __stackOp13003115_8_1, __stackOp13003115_8_0));
    forest_cycle_23: while (true) {
    forest_join_65: {
    forest_join_39: {
    forest_join_26: {
    if (!((p3 == null))) {
        break forest_join_26;
    }
    break forest_join_68;
    }
    if (!(__call13003115_11(p4))) {
        break forest_join_68;
    }
    life6_33 = __cast13003115_13(__call13003115_12(p4));
    spill13003115_4 = life6_33;
    if (!((p3 != null))) {
        forestValue13003115_39_0 = spill13003115_4;
        break forest_join_39;
    }
    if (!(__call13003115_14(spill13003115_4))) {
        continue forest_cycle_23;
    }
    forestValue13003115_39_0 = life6_33;
    }
    life7_43 = __call13003115_15(forestValue13003115_39_0);
    if (!(__call13003115_17(life7_43, __invokedynamic13003115_16(18629, (6507641309875961320L ^ p2))))) {
        continue forest_cycle_23;
    }
    life8_62 = __call13003115_21(p1, __call13003115_20(__call13003115_19(life7_43, __invokedynamic13003115_18(2581, (2307101594556546869L ^ p2)))));
    spill13003115_5 = life8_62;
    if (!((p3 != null))) {
        forestValue13003115_65_0 = spill13003115_5;
        break forest_join_65;
    }
    if (!((spill13003115_5 != null))) {
        continue forest_cycle_23;
    }
    forestValue13003115_65_0 = life8_62;
    }
    __call13003115_22(forestValue13003115_65_0, life7_43);
    continue forest_cycle_23;
    }
    }
    if (!((__call13003115_23() != null))) {
        break forest_join_73;
    }
    __call13003115_24(new int[4]);
    }
    return;
}
public static void h100031_16(java.lang.Exception p0) throws Throwable {
    throw __call13003116_0(p0);
}
private static native long __fieldRead100031_0() throws Throwable;
private static native int[] __call100031_1() throws Throwable;
private static native java.lang.String __invokedynamic100031_2(int a0, long a1) throws Throwable;
private static native com.google.gson.JsonElement __call100031_3(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native boolean __call100031_4(com.google.gson.JsonElement a0) throws Throwable;
private static native void __call100031_5(com.moon.module.Module a0, boolean a1) throws Throwable;
private static native java.lang.String __invokedynamic100031_6(int a0, long a1) throws Throwable;
private static native com.google.gson.JsonElement __call100031_7(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native int __call100031_8(com.google.gson.JsonElement a0) throws Throwable;
private static native com.moon.module.InputSource[] __call100031_9() throws Throwable;
private static native java.lang.String __invokedynamic100031_10(int a0, long a1) throws Throwable;
private static native com.google.gson.JsonElement __call100031_11(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native int __call100031_12(com.google.gson.JsonElement a0) throws Throwable;
private static native com.moon.module.PressType[] __call100031_13() throws Throwable;
private static native java.lang.String __invokedynamic100031_14(int a0, long a1) throws Throwable;
private static native com.google.gson.JsonElement __call100031_15(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native int __call100031_16(com.google.gson.JsonElement a0) throws Throwable;
private static native int __integerCategory100031_17(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic100031_18(int a0, long a1) throws Throwable;
private static native boolean __call100031_19(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory100031_20(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic100031_21(int a0, long a1) throws Throwable;
private static native boolean __call100031_22(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory100031_23(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic100031_24(int a0, long a1) throws Throwable;
private static native boolean __call100031_25(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory100031_26(boolean value) throws Throwable;
private static native void __fieldWrite100031_27(com.moon.module.Module a0, int a1) throws Throwable;
private static native void __fieldWrite100031_28(com.moon.module.Module a0, com.moon.module.InputSource a1) throws Throwable;
private static native void __fieldWrite100031_29(com.moon.module.Module a0, com.moon.module.PressType a1) throws Throwable;
private static native java.lang.String __invokedynamic100031_30(int a0, long a1) throws Throwable;
private static native boolean __call100031_31(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory100031_32(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic100031_33(int a0, long a1) throws Throwable;
private static native com.google.gson.JsonElement __call100031_34(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native boolean __call100031_35(com.google.gson.JsonElement a0) throws Throwable;
private static native void __call100031_36(com.moon.module.Module a0, boolean a1) throws Throwable;
private static native java.lang.String __invokedynamic100031_37(int a0, long a1) throws Throwable;
private static native com.google.gson.JsonElement __call100031_38(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native boolean __call100031_39(com.google.gson.JsonElement a0) throws Throwable;
private static native com.google.gson.JsonArray __call100031_40(com.google.gson.JsonElement a0) throws Throwable;
private static native java.util.Iterator __call100031_41(com.google.gson.JsonArray a0) throws Throwable;
private static native boolean __call100031_42(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call100031_43(java.util.Iterator a0) throws Throwable;
private static native com.google.gson.JsonElement __cast100031_44(java.lang.Object a0) throws Throwable;
private static native boolean __call100031_45(com.google.gson.JsonElement a0) throws Throwable;
private static native com.google.gson.JsonObject __call100031_46(com.google.gson.JsonElement a0) throws Throwable;
private static native java.lang.String __invokedynamic100031_47(int a0, long a1) throws Throwable;
private static native boolean __call100031_48(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic100031_49(int a0, long a1) throws Throwable;
private static native com.google.gson.JsonElement __call100031_50(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call100031_51(com.google.gson.JsonElement a0) throws Throwable;
private static native com.moon.setting.Setting __call100031_52(com.moon.module.Module a0, java.lang.String a1) throws Throwable;
private static native void __call100031_53(com.moon.setting.Setting a0, com.google.gson.JsonObject a1) throws Throwable;
private static native java.lang.String[] __call100031_54() throws Throwable;
private static native void __call100031_55(int[] a0) throws Throwable;
private static native java.lang.Exception __call13003100_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call13003101_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call13003102_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call13003103_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call13003104_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call13003105_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call13003106_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call13003107_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call13003108_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call13003109_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call13003110_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call13003111_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call13003112_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call13003113_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call13003114_0(java.lang.Exception a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call13003115_0() throws Throwable;
private static native org.tinylog.TaggedLogger __call13003115_1(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.lang.String __call13003115_2(com.moon.setting.Setting a0) throws Throwable;
private static native java.lang.String __fieldRead13003115_3(com.moon.module.Module a0) throws Throwable;
private static native java.lang.String __invokedynamic13003115_4(int a0, long a1) throws Throwable;
private static native void __discardScalar13003115_6(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic13003115_7(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic13003115_9(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws Throwable;
private static native void __call13003115_10(org.tinylog.TaggedLogger a0, java.lang.String a1) throws Throwable;
private static native boolean __call13003115_11(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call13003115_12(java.util.Iterator a0) throws Throwable;
private static native com.google.gson.JsonElement __cast13003115_13(java.lang.Object a0) throws Throwable;
private static native boolean __call13003115_14(com.google.gson.JsonElement a0) throws Throwable;
private static native com.google.gson.JsonObject __call13003115_15(com.google.gson.JsonElement a0) throws Throwable;
private static native java.lang.String __invokedynamic13003115_16(int a0, long a1) throws Throwable;
private static native boolean __call13003115_17(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic13003115_18(int a0, long a1) throws Throwable;
private static native com.google.gson.JsonElement __call13003115_19(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call13003115_20(com.google.gson.JsonElement a0) throws Throwable;
private static native com.moon.setting.Setting __call13003115_21(com.moon.module.Module a0, java.lang.String a1) throws Throwable;
private static native void __call13003115_22(com.moon.setting.Setting a0, com.google.gson.JsonObject a1) throws Throwable;
private static native java.lang.String[] __call13003115_23() throws Throwable;
private static native void __call13003115_24(int[] a0) throws Throwable;
private static native java.lang.Exception __call13003116_0(java.lang.Exception a0) throws Throwable;

}


private static void __sourceInitializeParent() throws Throwable {
bb = ((long)(((moom._a)(moom._c.a(((long)(-2341446723461006834L)), ((long)(-5185616869857398059L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(68509666819551L)))));
    int __sourceSpill251_6 = 0;
    jb = ((java.util.Map)(new java.util.HashMap(13)));
    com.moon.module.Module.b(((int)(__sourceSpill251_6)));
    long local10_life9 = (com.moon.module.Module.bb ^ 52700473022911L);
    javax.crypto.Cipher local12_life11;
    javax.crypto.Cipher __sourceSpill251_13 = (local12_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill251_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill251_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill251_16 = new byte[8];
    (__sourceSpill251_16)[0] = ((byte) ((int) (local10_life9 >>> 56)));
    int local13_life17 = 1;
    while ((local13_life17 < 8)) {
        (__sourceSpill251_16)[local13_life17] = ((byte) ((int) ((local10_life9 << (local13_life17 * 8)) >>> 56)));
        local13_life17 += 1;
    }
    byte[] __sourcePreallocation251_18 = __sourceSpill251_16;
    ((javax.crypto.Cipher)(__sourceSpill251_13)).init(((int)(__sourceSpill251_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill251_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation251_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local19_life21 = new java.lang.String[16];
    int local17_life22 = 0;
    java.lang.String local16_life23;
    int local18_life25 = ((java.lang.String)((local16_life23 = "Ú&ÀòÙ @(éhÎ ê\030²\020n\nÜ`1EAÃà¨\025t¹Y}\0209\022qÅïW!£\027¯U/É® øéè.@\031S\002­GyÂo\030\r©\005ùbò´º¡öm©\034âº(æo4û\013åCút_¥b:}Þ=g\037³\177gõ­­\n­¯?Ã¬X&\034äW |GÞï\031J¿\026Eéç\005UÁ¯?\033«^zûÛ¤=ýÄ\0316`\020½\032:åC)ªÿ¸8§ØÆù\030t;\0253ÙÉÙ(ò\016\036\\*·ÕÚÎläý Ê¡hv b$?­Ñ\013n\034©ò?\b\031Àá¿ªf£³\017ë\013ª6² ÒâZFU}Ã÷'u \000ÚW¸tçù@\005õÒWHn+Ì\bî $\bNv{êO<;,þr>Ó¦rí62Ó_ËÕ&ªÓ­ã\020üP(tÈgöVgñæ@!Ãz\020Ø»3\"\035ãrúGÄfÎôG ¶°jCLMP\030eeâå.2\035BgÜÂ½«©\017kúìâ"))).length();
    int local15_life26 = 16;
    int local14_life27 = -1;
    while (true) {
        local14_life27 += 1;
        byte[] __sourceSpill251_30 = ((java.lang.String)(((java.lang.String)(local16_life23)).substring(((int)(local14_life27)), ((int)((local14_life27 + local15_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill251_31 = local12_life11;
        byte[] local20_life33 = ((javax.crypto.Cipher)(__sourceSpill251_31)).doFinal(((byte[])(__sourceSpill251_30)));
        java.lang.String __sourceSpill251_36 = ((java.lang.String)(com.moon.module.Module.b(((byte[])(local20_life33))))).intern();
        java.lang.String[] __sourceSpill251_37 = local19_life21;
        int __sourceSpill251_38 = local17_life22;
        local17_life22 += 1;
        (__sourceSpill251_37)[__sourceSpill251_38] = __sourceSpill251_36;
        if (!(((local14_life27 = (local14_life27 + local15_life26)) < local18_life25))) { break; }
        local15_life26 = ((java.lang.String)(local16_life23)).charAt(((int)(local14_life27)));
    }
    local18_life25 = ((java.lang.String)((local16_life23 = "¸?®}Învø<Õä4´\f8\020dq[\033Dõ\020\027\004¶·AÄ¦"))).length();
    local15_life26 = 16;
    local14_life27 = -1;
    while (true) {
        local14_life27 += 1;
        byte[] __sourceSpill251_43 = ((java.lang.String)(((java.lang.String)(local16_life23)).substring(((int)(local14_life27)), ((int)((local14_life27 + local15_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill251_44 = local12_life11;
        byte[] local20_life46 = ((javax.crypto.Cipher)(__sourceSpill251_44)).doFinal(((byte[])(__sourceSpill251_43)));
        java.lang.String __sourceSpill251_49 = ((java.lang.String)(com.moon.module.Module.b(((byte[])(local20_life46))))).intern();
        java.lang.String[] __sourceSpill251_50 = local19_life21;
        int __sourceSpill251_51 = local17_life22;
        local17_life22 += 1;
        (__sourceSpill251_50)[__sourceSpill251_51] = __sourceSpill251_49;
        if (!(((local14_life27 = (local14_life27 + local15_life26)) < local18_life25))) { break; }
        local15_life26 = ((java.lang.String)(local16_life23)).charAt(((int)(local14_life27)));
    }
    hb = ((java.lang.String[])(local19_life21));
    ib = ((java.lang.String[])(new java.lang.String[16]));
    javax.crypto.Cipher local5_life56;
    javax.crypto.Cipher __sourceSpill251_58 = (local5_life56 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill251_59 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill251_60 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill251_61 = new byte[8];
    (__sourceSpill251_61)[0] = ((byte) ((int) (local10_life9 >>> 56)));
    int local6_life62 = 1;
    while ((local6_life62 < 8)) {
        (__sourceSpill251_61)[local6_life62] = ((byte) ((int) ((local10_life9 << (local6_life62 * 8)) >>> 56)));
        local6_life62 += 1;
    }
    byte[] __sourcePreallocation251_63 = __sourceSpill251_61;
    ((javax.crypto.Cipher)(__sourceSpill251_58)).init(((int)(__sourceSpill251_59)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill251_60)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation251_63)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local7_life66 = 7973029369478938744L;
    byte[] __sourceSpill251_67 = new byte[8];
    (__sourceSpill251_67)[0] = ((byte) ((int) (local7_life66 >>> 56)));
    (__sourceSpill251_67)[1] = ((byte) ((int) (local7_life66 >>> 48)));
    (__sourceSpill251_67)[2] = ((byte) ((int) (local7_life66 >>> 40)));
    (__sourceSpill251_67)[3] = ((byte) ((int) (local7_life66 >>> 32)));
    (__sourceSpill251_67)[4] = ((byte) ((int) (local7_life66 >>> 24)));
    (__sourceSpill251_67)[5] = ((byte) ((int) (local7_life66 >>> 16)));
    (__sourceSpill251_67)[6] = ((byte) ((int) (local7_life66 >>> 8)));
    (__sourceSpill251_67)[7] = ((byte) ((int) local7_life66));
    javax.crypto.Cipher __sourceSpill251_68 = local5_life56;
    byte[] local9_life70 = ((javax.crypto.Cipher)(__sourceSpill251_68)).doFinal(((byte[])(__sourceSpill251_67)));
    nb = ((long)((((((((((((long) (local9_life70)[0]) & 255L) << 56) | ((((long) (local9_life70)[1]) & 255L) << 48)) | ((((long) (local9_life70)[2]) & 255L) << 40)) | ((((long) (local9_life70)[3]) & 255L) << 32)) | ((((long) (local9_life70)[4]) & 255L) << 24)) | ((((long) (local9_life70)[5]) & 255L) << 16)) | ((((long) (local9_life70)[6]) & 255L) << 8)) | (((long) (local9_life70)[7]) & 255L))));
    javax.crypto.Cipher local0_life73;
    javax.crypto.Cipher __sourceSpill251_75 = (local0_life73 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill251_76 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill251_77 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill251_78 = new byte[8];
    (__sourceSpill251_78)[0] = ((byte) ((int) (local10_life9 >>> 56)));
    int local1_life79 = 1;
    while ((local1_life79 < 8)) {
        (__sourceSpill251_78)[local1_life79] = ((byte) ((int) ((local10_life9 << (local1_life79 * 8)) >>> 56)));
        local1_life79 += 1;
    }
    byte[] __sourcePreallocation251_80 = __sourceSpill251_78;
    ((javax.crypto.Cipher)(__sourceSpill251_75)).init(((int)(__sourceSpill251_76)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill251_77)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation251_80)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life83 = 4979966459862030868L;
    byte[] __sourceSpill251_84 = new byte[8];
    (__sourceSpill251_84)[0] = ((byte) ((int) (local2_life83 >>> 56)));
    (__sourceSpill251_84)[1] = ((byte) ((int) (local2_life83 >>> 48)));
    (__sourceSpill251_84)[2] = ((byte) ((int) (local2_life83 >>> 40)));
    (__sourceSpill251_84)[3] = ((byte) ((int) (local2_life83 >>> 32)));
    (__sourceSpill251_84)[4] = ((byte) ((int) (local2_life83 >>> 24)));
    (__sourceSpill251_84)[5] = ((byte) ((int) (local2_life83 >>> 16)));
    (__sourceSpill251_84)[6] = ((byte) ((int) (local2_life83 >>> 8)));
    (__sourceSpill251_84)[7] = ((byte) ((int) local2_life83));
    javax.crypto.Cipher __sourceSpill251_85 = local0_life73;
    byte[] local4_life87 = ((javax.crypto.Cipher)(__sourceSpill251_85)).doFinal(((byte[])(__sourceSpill251_84)));
    rb = ((long)((((((((((((long) (local4_life87)[0]) & 255L) << 56) | ((((long) (local4_life87)[1]) & 255L) << 48)) | ((((long) (local4_life87)[2]) & 255L) << 40)) | ((((long) (local4_life87)[3]) & 255L) << 32)) | ((((long) (local4_life87)[4]) & 255L) << 24)) | ((((long) (local4_life87)[5]) & 255L) << 16)) | ((((long) (local4_life87)[6]) & 255L) << 8)) | (((long) (local4_life87)[7]) & 255L))));
    d = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM()));
}


public com.moon.module.Module b(float p0) {
this.q = ((float)(p0));
    return this;
}


public float b__Float() {
return this.q;
}


public boolean isHidden() {
return ((((this.hidden) ? 1 : 0)) != 0);
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral2305_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/k7"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public java.lang.String getDisplayText() {
return this.displayText;
}


private static java.lang.String b(int p0, long p1) throws Throwable {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 13963);
    if (((com.moon.module.Module.ib)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.Module.jb)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.Module.jb)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/k7", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.module.Module.hb)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.module.Module.ib)[life5_8] = com.moon.module.Module.b(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.module.Module.ib)[life5_8];
}


private static java.lang.String b(byte[] p0) {
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
        byte[] spill1006_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1006_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1006_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1006_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1006_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1006_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.Exception b(java.lang.Exception p0) {
return p0;
}


public static void b(int p0) {
r = ((int)(p0));
    return;
}


private static java.lang.Object b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.module.Module.__sourceCheckedDecoderCall068(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void setHidden(boolean p0) {
com.moon.events.EventBus local2 = ((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus();
    ((com.moon.events.EventBus)(local2)).publish(((java.lang.Object)(new com.moon.el(p0, this.enabled, this))));
    this.hidden = ((boolean)(p0));
    return;
}


public void toggle() { __sourceHandlerCall_1b2e4a0c94c0ce516933(this); }


public java.lang.String getTooltipText() {
return this.tooltipText;
}


public static int c__IntStatic() {
return com.moon.module.Module.r;
}


public void onEnable() {
return;
}


public static int d__IntStatic() { return __sourceHandlerCall_36cebf06862cff5baf19(); }


public void onDisable() {
return;
}


public java.lang.String getSuffix() {
return this.suffix;
}


public com.moon.module.Module setPressType(com.moon.module.PressType p0) {
this.pressType = ((com.moon.module.PressType)(p0));
    return this;
}


public int getKeyCode() {
return this.keyCode;
}


public com.moon.module.Module a(float p0) {
this.p = ((float)(p0));
    return this;
}


public void setSuffix(java.lang.String p0) {
this.suffix = ((java.lang.String)(p0));
    ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(new com.moon.event.ModuleSuffixEvent(p0, this))));
    return;
}


public com.moon.nY getListAnimation() {
return this.listAnimation;
}


public void setEnabled(boolean p0) { __sourceHandlerCall_36ceae636bdb819e4350(this, p0); }


public boolean isEnabled() {
return ((((this.enabled) ? 1 : 0)) != 0);
}


public void a__Void() {
((com.moon.module.Module)(this)).toggle();
    return;
}


public com.moon.module.ModuleCategory getCategory() {
return this.category;
}


public com.google.gson.JsonObject toJson() { return __sourceHandlerCall_718a409279e7d4d7b1c4(this); }


public java.lang.String getName() {
return this.name;
}


public void fromJson(com.google.gson.JsonObject p0, boolean p1) { __sourceHandlerCall_84e2083803df1b7fd9eb(this, p0, p1); }


public com.moon.module.Module setInputSource(com.moon.module.InputSource p0) {
this.inputSource = ((com.moon.module.InputSource)(p0));
    return this;
}


public com.moon.module.Module setKeyCode(int p0) {
this.keyCode = ((int)(p0));
    return this;
}


public com.moon.module.InputSource getInputSource() {
return this.inputSource;
}


public float a__Float() {
return this.p;
}


public com.moon.module.PressType getPressType() {
return this.pressType;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral2305_0() throws E;

private static native java.lang.String __sourceCheckedDecoderCall068(int p0, long p1);
}
