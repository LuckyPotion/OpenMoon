package net.minecraft.server.management;


public abstract class BanEntry<T> extends net.minecraft.server.management.UserListEntry<T> {

public static java.text.SimpleDateFormat b;

protected java.util.Date c;

protected java.lang.String d;

protected java.util.Date e;

protected java.lang.String f;

private static long g;

public BanEntry(T p0, java.util.Date p1, java.lang.String p2, java.util.Date p3, java.lang.String p4) { super(((T)((java.lang.Object)null))); __sourceHandlerCall_7a30c1311ca631bc92fb(this, p0, p1, p2, p3, p4); }


protected BanEntry(T p0, com.google.gson.JsonObject p1) { super(((T)((java.lang.Object)null)), (com.google.gson.JsonObject)null); __sourceHandlerCall_8e4bb9bee8430f3edd8f(this, p0, p1); }


static {
net.minecraft.server.management.BanEntry.g = (moom._c.a(9046325280532455324L, 3415054761120512896L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(40405179552710L);
    net.minecraft.server.management.BanEntry.b = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
}

private static native <E extends Throwable> void __sourceHandlerCall_8e4bb9bee8430f3edd8f(net.minecraft.server.management.BanEntry a0, java.lang.Object a1, com.google.gson.JsonObject a2) throws E;
private static final class __SourceHandler_8e4bb9bee8430f3edd8f {

public static void f574(net.minecraft.server.management.BanEntry receiver, java.lang.Object p0, com.google.gson.JsonObject p1) throws Throwable {
    java.util.Date forwardValue574_24_0;
    net.minecraft.server.management.BanEntry forwardValue574_37_0;
    com.google.gson.JsonObject forwardValue574_37_1;
    java.lang.String forwardValue574_37_2;
    net.minecraft.server.management.BanEntry forwardValue574_40_0;
    net.minecraft.server.management.BanEntry forwardValue574_41_0;
    java.lang.String forwardValue574_41_1;
    java.util.Date forwardValue574_54_0;
    net.minecraft.server.management.BanEntry forwardValue574_67_0;
    com.google.gson.JsonObject forwardValue574_67_1;
    java.lang.String forwardValue574_67_2;
    net.minecraft.server.management.BanEntry forwardValue574_70_0;
    net.minecraft.server.management.BanEntry forwardValue574_71_0;
    java.lang.String forwardValue574_71_1;
    boolean spill574_0;
    net.minecraft.server.management.BanEntry spill574_1;
    com.google.gson.JsonObject spill574_2;
    java.lang.String spill574_3;
    net.minecraft.server.management.BanEntry spill574_4;
    com.google.gson.JsonObject spill574_5;
    java.lang.String spill574_6;
    long life3_3;
    int life5_9;
    java.util.Date life6_26;
    java.util.Date life7_68;
    forward_join_71: {
    forward_join_70: {
    forward_join_67: {
    forward_join_54: {
    forward_join_53: {
    forward_join_41: {
    forward_join_40: {
    forward_join_37: {
    forward_join_24: {
    forward_join_21: {
    life3_3 = (__fieldRead574_0() ^ 84627175927725L);
    spill574_0 = __call574_1();
    __directSuperInit574_2(receiver, p0, p1);
    life5_9 = __integerCategory574_3(spill574_0);
    if (!(__call574_4(p1, "created"))) {
        break forward_join_21;
    }
    forwardValue574_24_0 = __call574_8(__fieldRead574_5(), __call574_7(__call574_6(p1, "created")));
    break forward_join_24;
    }
    forwardValue574_24_0 = new java.util.Date();
    }
    life6_26 = forwardValue574_24_0;
    __fieldWrite574_9(receiver, life6_26);
    spill574_1 = receiver;
    spill574_2 = p1;
    spill574_3 = "source";
    if (!((life5_9 == 0))) {
        forwardValue574_37_0 = spill574_1;
        forwardValue574_37_1 = spill574_2;
        forwardValue574_37_2 = spill574_3;
        break forward_join_37;
    }
    if (!(__call574_10(spill574_2, spill574_3))) {
        forwardValue574_40_0 = spill574_1;
        break forward_join_40;
    }
    forwardValue574_37_0 = spill574_1;
    forwardValue574_37_1 = p1;
    forwardValue574_37_2 = "source";
    }
    forwardValue574_41_0 = forwardValue574_37_0;
    forwardValue574_41_1 = __call574_12(__call574_11(forwardValue574_37_1, forwardValue574_37_2));
    break forward_join_41;
    }
    forwardValue574_41_0 = forwardValue574_40_0;
    forwardValue574_41_1 = "(Unknown)";
    }
    __fieldWrite574_13(forwardValue574_41_0, forwardValue574_41_1);
    if (!(__call574_14(p1, "expires"))) {
        break forward_join_53;
    }
    forwardValue574_54_0 = __call574_18(__fieldRead574_15(), __call574_17(__call574_16(p1, "expires")));
    break forward_join_54;
    }
    forwardValue574_54_0 = null;
    }
    life7_68 = forwardValue574_54_0;
    __fieldWrite574_19(receiver, life7_68);
    spill574_4 = receiver;
    spill574_5 = p1;
    spill574_6 = "reason";
    if (!((life5_9 == 0))) {
        forwardValue574_67_0 = spill574_4;
        forwardValue574_67_1 = spill574_5;
        forwardValue574_67_2 = spill574_6;
        break forward_join_67;
    }
    if (!(__call574_20(spill574_5, spill574_6))) {
        forwardValue574_70_0 = spill574_4;
        break forward_join_70;
    }
    forwardValue574_67_0 = spill574_4;
    forwardValue574_67_1 = p1;
    forwardValue574_67_2 = "reason";
    }
    forwardValue574_71_0 = forwardValue574_67_0;
    forwardValue574_71_1 = __call574_22(__call574_21(forwardValue574_67_1, forwardValue574_67_2));
    break forward_join_71;
    }
    forwardValue574_71_0 = forwardValue574_70_0;
    forwardValue574_71_1 = "Banned by an operator.";
    }
    __fieldWrite574_23(forwardValue574_71_0, forwardValue574_71_1);
    return;
}
public static void h574_0(java.text.ParseException p0) throws Throwable {
    throw __call3057400_0(p0);
}
public static void h574_1(java.text.ParseException p0, net.minecraft.server.management.BanEntry p1, com.google.gson.JsonObject p2, int p3, java.util.Date p4, java.util.Date p5) throws Throwable {
    net.minecraft.server.management.BanEntry forwardValue3057401_18_0;
    com.google.gson.JsonObject forwardValue3057401_18_1;
    java.lang.String forwardValue3057401_18_2;
    net.minecraft.server.management.BanEntry forwardValue3057401_21_0;
    net.minecraft.server.management.BanEntry forwardValue3057401_22_0;
    java.lang.String forwardValue3057401_22_1;
    java.util.Date forwardValue3057401_35_0;
    net.minecraft.server.management.BanEntry forwardValue3057401_48_0;
    com.google.gson.JsonObject forwardValue3057401_48_1;
    java.lang.String forwardValue3057401_48_2;
    net.minecraft.server.management.BanEntry forwardValue3057401_51_0;
    net.minecraft.server.management.BanEntry forwardValue3057401_52_0;
    java.lang.String forwardValue3057401_52_1;
    net.minecraft.server.management.BanEntry spill3057401_0;
    com.google.gson.JsonObject spill3057401_1;
    java.lang.String spill3057401_2;
    net.minecraft.server.management.BanEntry spill3057401_3;
    com.google.gson.JsonObject spill3057401_4;
    java.lang.String spill3057401_5;
    java.text.ParseException life5_2;
    java.util.Date life4_6;
    java.util.Date life5_38;
    forward_join_52: {
    forward_join_51: {
    forward_join_48: {
    forward_join_35: {
    forward_join_34: {
    forward_join_22: {
    forward_join_21: {
    forward_join_18: {
    life5_2 = p0;
    life4_6 = new java.util.Date();
    __fieldWrite3057401_0(p1, life4_6);
    spill3057401_0 = p1;
    spill3057401_1 = p2;
    spill3057401_2 = "source";
    if (!((p3 == 0))) {
        forwardValue3057401_18_0 = spill3057401_0;
        forwardValue3057401_18_1 = spill3057401_1;
        forwardValue3057401_18_2 = spill3057401_2;
        break forward_join_18;
    }
    if (!(__call3057401_1(spill3057401_1, spill3057401_2))) {
        forwardValue3057401_21_0 = spill3057401_0;
        break forward_join_21;
    }
    forwardValue3057401_18_0 = spill3057401_0;
    forwardValue3057401_18_1 = p2;
    forwardValue3057401_18_2 = "source";
    }
    forwardValue3057401_22_0 = forwardValue3057401_18_0;
    forwardValue3057401_22_1 = __call3057401_3(__call3057401_2(forwardValue3057401_18_1, forwardValue3057401_18_2));
    break forward_join_22;
    }
    forwardValue3057401_22_0 = forwardValue3057401_21_0;
    forwardValue3057401_22_1 = "(Unknown)";
    }
    __fieldWrite3057401_4(forwardValue3057401_22_0, forwardValue3057401_22_1);
    if (!(__call3057401_5(p2, "expires"))) {
        break forward_join_34;
    }
    forwardValue3057401_35_0 = __call3057401_9(__fieldRead3057401_6(), __call3057401_8(__call3057401_7(p2, "expires")));
    break forward_join_35;
    }
    forwardValue3057401_35_0 = null;
    }
    life5_38 = forwardValue3057401_35_0;
    __fieldWrite3057401_10(p1, life5_38);
    spill3057401_3 = p1;
    spill3057401_4 = p2;
    spill3057401_5 = "reason";
    if (!((p3 == 0))) {
        forwardValue3057401_48_0 = spill3057401_3;
        forwardValue3057401_48_1 = spill3057401_4;
        forwardValue3057401_48_2 = spill3057401_5;
        break forward_join_48;
    }
    if (!(__call3057401_11(spill3057401_4, spill3057401_5))) {
        forwardValue3057401_51_0 = spill3057401_3;
        break forward_join_51;
    }
    forwardValue3057401_48_0 = spill3057401_3;
    forwardValue3057401_48_1 = p2;
    forwardValue3057401_48_2 = "reason";
    }
    forwardValue3057401_52_0 = forwardValue3057401_48_0;
    forwardValue3057401_52_1 = __call3057401_13(__call3057401_12(forwardValue3057401_48_1, forwardValue3057401_48_2));
    break forward_join_52;
    }
    forwardValue3057401_52_0 = forwardValue3057401_51_0;
    forwardValue3057401_52_1 = "Banned by an operator.";
    }
    __fieldWrite3057401_14(forwardValue3057401_52_0, forwardValue3057401_52_1);
    return;
}
public static void h574_2(java.text.ParseException p0) throws Throwable {
    throw __call3057402_0(p0);
}
public static void h574_3(java.text.ParseException p0) throws Throwable {
    throw __call3057403_0(p0);
}
public static void h574_4(java.text.ParseException p0, net.minecraft.server.management.BanEntry p1, com.google.gson.JsonObject p2, int p3, java.util.Date p4) throws Throwable {
    net.minecraft.server.management.BanEntry forwardValue3057404_16_0;
    com.google.gson.JsonObject forwardValue3057404_16_1;
    java.lang.String forwardValue3057404_16_2;
    net.minecraft.server.management.BanEntry forwardValue3057404_19_0;
    net.minecraft.server.management.BanEntry forwardValue3057404_20_0;
    java.lang.String forwardValue3057404_20_1;
    net.minecraft.server.management.BanEntry spill3057404_0;
    com.google.gson.JsonObject spill3057404_1;
    java.lang.String spill3057404_2;
    java.text.ParseException life5_2;
    java.lang.Object life4_4;
    forward_join_20: {
    forward_join_19: {
    forward_join_16: {
    life5_2 = p0;
    life4_4 = null;
    __fieldWrite3057404_0(p1, life4_4);
    spill3057404_0 = p1;
    spill3057404_1 = p2;
    spill3057404_2 = "reason";
    if (!((p3 == 0))) {
        forwardValue3057404_16_0 = spill3057404_0;
        forwardValue3057404_16_1 = spill3057404_1;
        forwardValue3057404_16_2 = spill3057404_2;
        break forward_join_16;
    }
    if (!(__call3057404_1(spill3057404_1, spill3057404_2))) {
        forwardValue3057404_19_0 = spill3057404_0;
        break forward_join_19;
    }
    forwardValue3057404_16_0 = spill3057404_0;
    forwardValue3057404_16_1 = p2;
    forwardValue3057404_16_2 = "reason";
    }
    forwardValue3057404_20_0 = forwardValue3057404_16_0;
    forwardValue3057404_20_1 = __call3057404_3(__call3057404_2(forwardValue3057404_16_1, forwardValue3057404_16_2));
    break forward_join_20;
    }
    forwardValue3057404_20_0 = forwardValue3057404_19_0;
    forwardValue3057404_20_1 = "Banned by an operator.";
    }
    __fieldWrite3057404_4(forwardValue3057404_20_0, forwardValue3057404_20_1);
    return;
}
public static void h574_5(java.text.ParseException p0) throws Throwable {
    throw __call3057405_0(p0);
}
public static void h574_6(java.text.ParseException p0) throws Throwable {
    throw __call3057406_0(p0);
}
private static native long __fieldRead574_0() throws Throwable;
private static native boolean __call574_1() throws Throwable;
private static native void __directSuperInit574_2(net.minecraft.server.management.BanEntry a0, java.lang.Object a1, com.google.gson.JsonObject a2) throws Throwable;
private static native int __integerCategory574_3(boolean value) throws Throwable;
private static native boolean __call574_4(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native java.text.SimpleDateFormat __fieldRead574_5() throws Throwable;
private static native com.google.gson.JsonElement __call574_6(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call574_7(com.google.gson.JsonElement a0) throws Throwable;
private static native java.util.Date __call574_8(java.text.SimpleDateFormat a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite574_9(net.minecraft.server.management.BanEntry a0, java.util.Date a1) throws Throwable;
private static native boolean __call574_10(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native com.google.gson.JsonElement __call574_11(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call574_12(com.google.gson.JsonElement a0) throws Throwable;
private static native void __fieldWrite574_13(net.minecraft.server.management.BanEntry a0, java.lang.String a1) throws Throwable;
private static native boolean __call574_14(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native java.text.SimpleDateFormat __fieldRead574_15() throws Throwable;
private static native com.google.gson.JsonElement __call574_16(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call574_17(com.google.gson.JsonElement a0) throws Throwable;
private static native java.util.Date __call574_18(java.text.SimpleDateFormat a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite574_19(net.minecraft.server.management.BanEntry a0, java.util.Date a1) throws Throwable;
private static native boolean __call574_20(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native com.google.gson.JsonElement __call574_21(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call574_22(com.google.gson.JsonElement a0) throws Throwable;
private static native void __fieldWrite574_23(net.minecraft.server.management.BanEntry a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call3057400_0(java.text.ParseException a0) throws Throwable;
private static native void __fieldWrite3057401_0(net.minecraft.server.management.BanEntry a0, java.util.Date a1) throws Throwable;
private static native boolean __call3057401_1(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native com.google.gson.JsonElement __call3057401_2(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call3057401_3(com.google.gson.JsonElement a0) throws Throwable;
private static native void __fieldWrite3057401_4(net.minecraft.server.management.BanEntry a0, java.lang.String a1) throws Throwable;
private static native boolean __call3057401_5(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native java.text.SimpleDateFormat __fieldRead3057401_6() throws Throwable;
private static native com.google.gson.JsonElement __call3057401_7(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call3057401_8(com.google.gson.JsonElement a0) throws Throwable;
private static native java.util.Date __call3057401_9(java.text.SimpleDateFormat a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite3057401_10(net.minecraft.server.management.BanEntry a0, java.util.Date a1) throws Throwable;
private static native boolean __call3057401_11(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native com.google.gson.JsonElement __call3057401_12(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call3057401_13(com.google.gson.JsonElement a0) throws Throwable;
private static native void __fieldWrite3057401_14(net.minecraft.server.management.BanEntry a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call3057402_0(java.text.ParseException a0) throws Throwable;
private static native java.lang.Exception __call3057403_0(java.text.ParseException a0) throws Throwable;
private static native void __fieldWrite3057404_0(net.minecraft.server.management.BanEntry a0, java.lang.Object a1) throws Throwable;
private static native boolean __call3057404_1(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native com.google.gson.JsonElement __call3057404_2(com.google.gson.JsonObject a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call3057404_3(com.google.gson.JsonElement a0) throws Throwable;
private static native void __fieldWrite3057404_4(net.minecraft.server.management.BanEntry a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call3057405_0(java.text.ParseException a0) throws Throwable;
private static native java.lang.Exception __call3057406_0(java.text.ParseException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_7a30c1311ca631bc92fb(net.minecraft.server.management.BanEntry a0, java.lang.Object a1, java.util.Date a2, java.lang.String a3, java.util.Date a4, java.lang.String a5) throws E;
private static final class __SourceHandler_7a30c1311ca631bc92fb {

public static void f575(net.minecraft.server.management.BanEntry receiver, java.lang.Object p0, java.util.Date p1, java.lang.String p2, java.util.Date p3, java.lang.String p4) throws Throwable {
    net.minecraft.server.management.BanEntry forwardValue575_17_0;
    java.util.Date forwardValue575_17_1;
    net.minecraft.server.management.BanEntry forwardValue575_18_0;
    net.minecraft.server.management.BanEntry forwardValue575_19_0;
    java.util.Date forwardValue575_19_1;
    net.minecraft.server.management.BanEntry forwardValue575_26_0;
    java.lang.String forwardValue575_26_1;
    net.minecraft.server.management.BanEntry forwardValue575_27_0;
    net.minecraft.server.management.BanEntry forwardValue575_28_0;
    java.lang.String forwardValue575_28_1;
    net.minecraft.server.management.BanEntry forwardValue575_38_0;
    java.lang.String forwardValue575_38_1;
    net.minecraft.server.management.BanEntry forwardValue575_39_0;
    net.minecraft.server.management.BanEntry forwardValue575_40_0;
    java.lang.String forwardValue575_40_1;
    boolean spill575_0;
    net.minecraft.server.management.BanEntry spill575_1;
    java.util.Date spill575_2;
    net.minecraft.server.management.BanEntry spill575_3;
    java.lang.String spill575_4;
    net.minecraft.server.management.BanEntry spill575_5;
    java.lang.String spill575_6;
    long life6_3;
    int life8_8;
    forward_join_40: {
    forward_join_39: {
    forward_join_38: {
    forward_join_28: {
    forward_join_27: {
    forward_join_26: {
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    life6_3 = (__fieldRead575_0() ^ 99495721464264L);
    spill575_0 = __call575_1();
    __directSuperInit575_2(receiver, p0);
    life8_8 = __integerCategory575_3(spill575_0);
    spill575_1 = receiver;
    spill575_2 = p1;
    if (!((life8_8 != 0))) {
        forwardValue575_17_0 = spill575_1;
        forwardValue575_17_1 = spill575_2;
        break forward_join_17;
    }
    if (!((spill575_2 == null))) {
        forwardValue575_18_0 = spill575_1;
        break forward_join_18;
    }
    forwardValue575_17_0 = spill575_1;
    forwardValue575_17_1 = new java.util.Date();
    }
    forwardValue575_19_0 = forwardValue575_17_0;
    forwardValue575_19_1 = forwardValue575_17_1;
    break forward_join_19;
    }
    forwardValue575_19_0 = forwardValue575_18_0;
    forwardValue575_19_1 = p1;
    }
    __fieldWrite575_4(forwardValue575_19_0, forwardValue575_19_1);
    spill575_3 = receiver;
    spill575_4 = p2;
    if (!((life8_8 != 0))) {
        forwardValue575_26_0 = spill575_3;
        forwardValue575_26_1 = spill575_4;
        break forward_join_26;
    }
    if (!((spill575_4 == null))) {
        forwardValue575_27_0 = spill575_3;
        break forward_join_27;
    }
    forwardValue575_26_0 = spill575_3;
    forwardValue575_26_1 = "(Unknown)";
    }
    forwardValue575_28_0 = forwardValue575_26_0;
    forwardValue575_28_1 = forwardValue575_26_1;
    break forward_join_28;
    }
    forwardValue575_28_0 = forwardValue575_27_0;
    forwardValue575_28_1 = p2;
    }
    __fieldWrite575_5(forwardValue575_28_0, forwardValue575_28_1);
    __fieldWrite575_6(receiver, p3);
    spill575_5 = receiver;
    spill575_6 = p4;
    if (!((life8_8 != 0))) {
        forwardValue575_38_0 = spill575_5;
        forwardValue575_38_1 = spill575_6;
        break forward_join_38;
    }
    if (!((spill575_6 == null))) {
        forwardValue575_39_0 = spill575_5;
        break forward_join_39;
    }
    forwardValue575_38_0 = spill575_5;
    forwardValue575_38_1 = "Banned by an operator.";
    }
    forwardValue575_40_0 = forwardValue575_38_0;
    forwardValue575_40_1 = forwardValue575_38_1;
    break forward_join_40;
    }
    forwardValue575_40_0 = forwardValue575_39_0;
    forwardValue575_40_1 = p4;
    }
    __fieldWrite575_7(forwardValue575_40_0, forwardValue575_40_1);
    return;
}
public static void h575_0(moom.Oo p0) throws Throwable {
    throw __call3057500_0(p0);
}
public static void h575_1(moom.Oo p0) throws Throwable {
    throw __call3057501_0(p0);
}
public static void h575_2(moom.Oo p0) throws Throwable {
    throw __call3057502_0(p0);
}
public static void h575_3(moom.Oo p0) throws Throwable {
    throw __call3057503_0(p0);
}
private static native long __fieldRead575_0() throws Throwable;
private static native boolean __call575_1() throws Throwable;
private static native void __directSuperInit575_2(net.minecraft.server.management.BanEntry a0, java.lang.Object a1) throws Throwable;
private static native int __integerCategory575_3(boolean value) throws Throwable;
private static native void __fieldWrite575_4(net.minecraft.server.management.BanEntry a0, java.util.Date a1) throws Throwable;
private static native void __fieldWrite575_5(net.minecraft.server.management.BanEntry a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite575_6(net.minecraft.server.management.BanEntry a0, java.util.Date a1) throws Throwable;
private static native void __fieldWrite575_7(net.minecraft.server.management.BanEntry a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call3057500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3057501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3057502_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3057503_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_e9680a432a6aeb932dbd(net.minecraft.server.management.BanEntry a0) throws E;
private static final class __SourceHandler_e9680a432a6aeb932dbd {

public static boolean f1665(net.minecraft.server.management.BanEntry receiver) throws Throwable {
    java.util.Date forwardValue1665_13_0;
    int forwardValue1665_21_0;
    int forwardValue1665_23_0;
    java.util.Date spill1665_0;
    boolean spill1665_1;
    long life1_3;
    int life3_5;
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    forward_join_13: {
    life1_3 = (__fieldRead1665_0() ^ 121077728570434L);
    life3_5 = __integerCategory1665_2(__call1665_1());
    spill1665_0 = __fieldRead1665_3(receiver);
    if (!((life3_5 == 0))) {
        forwardValue1665_13_0 = spill1665_0;
        break forward_join_13;
    }
    if (!((spill1665_0 != null))) {
        break forward_join_22;
    }
    forwardValue1665_13_0 = __fieldRead1665_4(receiver);
    }
    spill1665_1 = __call1665_5(forwardValue1665_13_0, new java.util.Date());
    if (!((life3_5 == 0))) {
        forwardValue1665_21_0 = __integerCategory1665_6(spill1665_1);
        break forward_join_21;
    }
    if (!(spill1665_1)) {
        break forward_join_22;
    }
    forwardValue1665_21_0 = 1;
    }
    forwardValue1665_23_0 = forwardValue1665_21_0;
    break forward_join_23;
    }
    forwardValue1665_23_0 = 0;
    }
    return __integerCategory1665_7(forwardValue1665_23_0);
}
public static void h1665_0(moom.Oo p0) throws Throwable {
    throw __call1166500_0(p0);
}
public static void h1665_1(moom.Oo p0) throws Throwable {
    throw __call1166501_0(p0);
}
public static void h1665_2(moom.Oo p0) throws Throwable {
    throw __call1166502_0(p0);
}
private static native long __fieldRead1665_0() throws Throwable;
private static native boolean __call1665_1() throws Throwable;
private static native int __integerCategory1665_2(boolean value) throws Throwable;
private static native java.util.Date __fieldRead1665_3(net.minecraft.server.management.BanEntry a0) throws Throwable;
private static native java.util.Date __fieldRead1665_4(net.minecraft.server.management.BanEntry a0) throws Throwable;
private static native boolean __call1665_5(java.util.Date a0, java.util.Date a1) throws Throwable;
private static native int __integerCategory1665_6(boolean value) throws Throwable;
private static native boolean __integerCategory1665_7(int value) throws Throwable;
private static native java.lang.Exception __call1166500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1166501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1166502_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_39b0861afd7f3b9b307c(net.minecraft.server.management.BanEntry a0, com.google.gson.JsonObject a1) throws E;
private static final class __SourceHandler_39b0861afd7f3b9b307c {

public static void f1666(net.minecraft.server.management.BanEntry receiver, com.google.gson.JsonObject p0) throws Throwable {
    com.google.gson.JsonObject forwardValue1666_27_0;
    java.lang.String forwardValue1666_27_1;
    com.google.gson.JsonObject forwardValue1666_30_0;
    java.lang.String forwardValue1666_30_1;
    java.text.SimpleDateFormat forwardValue1666_30_2;
    java.util.Date forwardValue1666_30_3;
    com.google.gson.JsonObject forwardValue1666_31_0;
    java.lang.String forwardValue1666_31_1;
    java.lang.String forwardValue1666_31_2;
    com.google.gson.JsonObject spill1666_0;
    java.lang.String spill1666_1;
    java.text.SimpleDateFormat spill1666_2;
    java.util.Date spill1666_3;
    com.google.gson.JsonObject spill1666_4;
    java.lang.String spill1666_5;
    long life2_3;
    int life4_5;
    forward_join_31: {
    forward_join_30: {
    forward_join_27: {
    life2_3 = (__fieldRead1666_0() ^ 29231809815374L);
    life4_5 = __integerCategory1666_2(__call1666_1());
    spill1666_0 = p0;
    spill1666_1 = "created";
    spill1666_2 = __fieldRead1666_3();
    spill1666_3 = __fieldRead1666_4(receiver);
    if (!((life4_5 == 0))) {
        forwardValue1666_30_0 = spill1666_0;
        forwardValue1666_30_1 = spill1666_1;
        forwardValue1666_30_2 = spill1666_2;
        forwardValue1666_30_3 = spill1666_3;
        break forward_join_30;
    }
    __call1666_6(spill1666_0, spill1666_1, __call1666_5(spill1666_2, spill1666_3));
    __call1666_8(p0, "source", __fieldRead1666_7(receiver));
    spill1666_4 = p0;
    spill1666_5 = "expires";
    if (!((__fieldRead1666_9(receiver) == null))) {
        forwardValue1666_27_0 = spill1666_4;
        forwardValue1666_27_1 = spill1666_5;
        break forward_join_27;
    }
    forwardValue1666_31_0 = spill1666_4;
    forwardValue1666_31_1 = spill1666_5;
    forwardValue1666_31_2 = "forever";
    break forward_join_31;
    }
    forwardValue1666_30_0 = forwardValue1666_27_0;
    forwardValue1666_30_1 = forwardValue1666_27_1;
    forwardValue1666_30_2 = __fieldRead1666_10();
    forwardValue1666_30_3 = __fieldRead1666_11(receiver);
    }
    forwardValue1666_31_0 = forwardValue1666_30_0;
    forwardValue1666_31_1 = forwardValue1666_30_1;
    forwardValue1666_31_2 = __call1666_12(forwardValue1666_30_2, forwardValue1666_30_3);
    }
    __call1666_13(forwardValue1666_31_0, forwardValue1666_31_1, forwardValue1666_31_2);
    __call1666_15(p0, "reason", __fieldRead1666_14(receiver));
    return;
}
public static void h1666_0(moom.Oo p0) throws Throwable {
    throw __call1166600_0(p0);
}
public static void h1666_1(moom.Oo p0) throws Throwable {
    throw __call1166601_0(p0);
}
private static native long __fieldRead1666_0() throws Throwable;
private static native boolean __call1666_1() throws Throwable;
private static native int __integerCategory1666_2(boolean value) throws Throwable;
private static native java.text.SimpleDateFormat __fieldRead1666_3() throws Throwable;
private static native java.util.Date __fieldRead1666_4(net.minecraft.server.management.BanEntry a0) throws Throwable;
private static native java.lang.String __call1666_5(java.text.SimpleDateFormat a0, java.util.Date a1) throws Throwable;
private static native void __call1666_6(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __fieldRead1666_7(net.minecraft.server.management.BanEntry a0) throws Throwable;
private static native void __call1666_8(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.util.Date __fieldRead1666_9(net.minecraft.server.management.BanEntry a0) throws Throwable;
private static native java.text.SimpleDateFormat __fieldRead1666_10() throws Throwable;
private static native java.util.Date __fieldRead1666_11(net.minecraft.server.management.BanEntry a0) throws Throwable;
private static native java.lang.String __call1666_12(java.text.SimpleDateFormat a0, java.util.Date a1) throws Throwable;
private static native void __call1666_13(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __fieldRead1666_14(net.minecraft.server.management.BanEntry a0) throws Throwable;
private static native void __call1666_15(com.google.gson.JsonObject a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.Exception __call1166600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1166601_0(moom.Oo a0) throws Throwable;

}


protected void a__Void(com.google.gson.JsonObject p0) { __sourceHandlerCall_39b0861afd7f3b9b307c(this, p0); }


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


boolean a__Boolean() { return __sourceHandlerCall_e9680a432a6aeb932dbd(this); }


public java.lang.String a__sourceReturn_0e30dfc966() {
return this.f;
}


public java.util.Date a__Date() {
return this.e;
}

}
