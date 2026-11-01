package moom;


public class pW extends net.minecraft.command.CommandBase {

private static long d;

public pW() {
super();
}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_eda2629bcada759db75f(moom.pW a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, moom.DT a3) throws E;
private static final class __SourceHandler_eda2629bcada759db75f {

public static java.util.List f1128(moom.pW receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) throws Throwable {
    int forwardValue1128_38_0;
    int forwardValue1128_38_1;
    java.lang.String[] forwardValue1128_40_0;
    java.util.List forwardValue1128_45_0;
    int spill1128_0;
    int spill1128_1;
    java.lang.String[] spill1128_2;
    long life4_3;
    int life6_5;
    forward_join_45: {
    forward_join_44: {
    forward_join_40: {
    forward_join_38: {
    forward_join_33: {
    life4_3 = (__fieldRead1128_0() ^ 137427521388583L);
    life6_5 = __integerCategory1128_2(__call1128_1());
    spill1128_0 = (p1).length;
    spill1128_1 = 1;
    if (!((life6_5 != 0))) {
        forwardValue1128_38_0 = spill1128_0;
        forwardValue1128_38_1 = spill1128_1;
        break forward_join_38;
    }
    if (!((spill1128_0 == spill1128_1))) {
        break forward_join_33;
    }
    forwardValue1128_45_0 = __call1128_3(p1, new java.lang.String[] {"survival", "creative", "adventure", "spectator"});
    break forward_join_45;
    }
    spill1128_2 = p1;
    if (!((life6_5 != 0))) {
        forwardValue1128_40_0 = spill1128_2;
        break forward_join_40;
    }
    forwardValue1128_38_0 = (spill1128_2).length;
    forwardValue1128_38_1 = 2;
    }
    if (!((forwardValue1128_38_0 == forwardValue1128_38_1))) {
        break forward_join_44;
    }
    forwardValue1128_40_0 = p1;
    }
    forwardValue1128_45_0 = __call1128_5(forwardValue1128_40_0, __call1128_4(receiver));
    break forward_join_45;
    }
    forwardValue1128_45_0 = null;
    }
    return forwardValue1128_45_0;
}
public static void h1128_0(moom.Oo p0) throws Throwable {
    throw __call1112800_0(p0);
}
public static void h1128_1(moom.Oo p0) throws Throwable {
    throw __call1112801_0(p0);
}
public static void h1128_2(moom.Oo p0) throws Throwable {
    throw __call1112802_0(p0);
}
private static native long __fieldRead1128_0() throws Throwable;
private static native boolean __call1128_1() throws Throwable;
private static native int __integerCategory1128_2(boolean value) throws Throwable;
private static native java.util.List __call1128_3(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.String[] __call1128_4(moom.pW a0) throws Throwable;
private static native java.util.List __call1128_5(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.Exception __call1112800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1112801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1112802_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_fd0086899f9104a75e8e(moom.pW a0, java.lang.String[] a1, int a2) throws E;
private static final class __SourceHandler_fd0086899f9104a75e8e {

public static boolean f1129(moom.pW receiver, java.lang.String[] p0, int p1) throws Throwable {
    int forwardValue1129_12_0;
    int forwardValue1129_14_0;
    int spill1129_0;
    long life3_3;
    int life5_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life3_3 = (__fieldRead1129_0() ^ 75152718164028L);
    life5_5 = __integerCategory1129_2(__call1129_1());
    spill1129_0 = p1;
    if (!((life5_5 == 0))) {
        forwardValue1129_12_0 = spill1129_0;
        break forward_join_12;
    }
    if (!((spill1129_0 == 1))) {
        break forward_join_13;
    }
    forwardValue1129_12_0 = 1;
    }
    forwardValue1129_14_0 = forwardValue1129_12_0;
    break forward_join_14;
    }
    forwardValue1129_14_0 = 0;
    }
    return __integerCategory1129_3(forwardValue1129_14_0);
}
public static void h1129_0(moom.Oo p0) throws Throwable {
    throw __call1112900_0(p0);
}
public static void h1129_1(moom.Oo p0) throws Throwable {
    throw __call1112901_0(p0);
}
private static native long __fieldRead1129_0() throws Throwable;
private static native boolean __call1129_1() throws Throwable;
private static native int __integerCategory1129_2(boolean value) throws Throwable;
private static native boolean __integerCategory1129_3(int value) throws Throwable;
private static native java.lang.Exception __call1112900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1112901_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_d59eb955763691519aa9(moom.pW a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws E;
private static final class __SourceHandler_d59eb955763691519aa9 {

public static void f1127(moom.pW receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws Throwable {
    net.minecraft.entity.player.EntityPlayerMP forwardValue1127_35_0;
    net.minecraft.entity.player.EntityPlayerMP forwardValue1127_51_0;
    net.minecraft.command.ICommandSender forwardValue1127_91_0;
    net.minecraft.entity.player.EntityPlayerMP spill1127_0;
    net.minecraft.entity.player.EntityPlayerMP spill1127_1;
    long life3_3;
    int life5_5;
    net.minecraft.world.WorldSettings$GameType life6_24;
    net.minecraft.entity.player.EntityPlayerMP life7_39;
    moom.CN life8_76;
    forward_join_101: {
    forward_join_91: {
    forward_join_90: {
    forward_join_58: {
    forward_join_51: {
    forward_join_35: {
    forward_join_33: {
    forward_join_16: {
    life3_3 = (__fieldRead1127_0() ^ 65925696377252L);
    life5_5 = __integerCategory1127_2(__call1127_1());
    if (!(((p1).length == 0))) {
        break forward_join_16;
    }
    throw new moom.cc("commands.gamemode.usage", new java.lang.Object[0]);
    }
    life6_24 = __call1127_3(receiver, p0, (p1)[0]);
    if (!(((p1).length >= 2))) {
        break forward_join_33;
    }
    forwardValue1127_35_0 = __call1127_4(p0, (p1)[1]);
    break forward_join_35;
    }
    forwardValue1127_35_0 = __call1127_5(p0);
    }
    life7_39 = forwardValue1127_35_0;
    __call1127_6(life7_39, life6_24);
    spill1127_0 = life7_39;
    if (!((life5_5 == 0))) {
        forwardValue1127_51_0 = spill1127_0;
        break forward_join_51;
    }
    __fieldWrite1127_7(spill1127_0, 0x0.0p0f);
    if (!(__call1127_10(__call1127_9(__call1127_8(p0)), "sendCommandFeedback"))) {
        break forward_join_58;
    }
    forwardValue1127_51_0 = life7_39;
    }
    __call1127_11(forwardValue1127_51_0, new moom.CN("gameMode.changed", new java.lang.Object[0]));
    }
    life8_76 = new moom.CN(__invokedynamic1127_13(__call1127_12(life6_24)), new java.lang.Object[0]);
    spill1127_1 = life7_39;
    if (!((life5_5 == 0))) {
        forwardValue1127_91_0 = spill1127_1;
        break forward_join_91;
    }
    if (!((spill1127_1 != p0))) {
        break forward_join_90;
    }
    __call1127_15(p0, receiver, 1, "commands.gamemode.success.other", new java.lang.Object[] {__call1127_14(life7_39), life8_76});
    if (!((life5_5 != 0))) {
        break forward_join_101;
    }
    }
    forwardValue1127_91_0 = p0;
    }
    __call1127_16(forwardValue1127_91_0, receiver, 1, "commands.gamemode.success.self", new java.lang.Object[] {life8_76});
    }
    return;
}
public static void h1127_0(moom.b7 p0) throws Throwable {
    throw __call1112700_0(p0);
}
public static void h1127_1(moom.b7 p0) throws Throwable {
    throw __call1112701_0(p0);
}
public static void h1127_2(moom.b7 p0) throws Throwable {
    throw __call1112702_0(p0);
}
public static void h1127_3(moom.b7 p0) throws Throwable {
    throw __call1112703_0(p0);
}
public static void h1127_4(moom.b7 p0) throws Throwable {
    throw __call1112704_0(p0);
}
public static void h1127_5(moom.b7 p0) throws Throwable {
    throw __call1112705_0(p0);
}
public static void h1127_6(moom.b7 p0) throws Throwable {
    throw __call1112706_0(p0);
}
private static native long __fieldRead1127_0() throws Throwable;
private static native boolean __call1127_1() throws Throwable;
private static native int __integerCategory1127_2(boolean value) throws Throwable;
private static native net.minecraft.world.WorldSettings$GameType __call1127_3(moom.pW a0, net.minecraft.command.ICommandSender a1, java.lang.String a2) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __call1127_4(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __call1127_5(net.minecraft.command.ICommandSender a0) throws Throwable;
private static native void __call1127_6(net.minecraft.entity.player.EntityPlayerMP a0, net.minecraft.world.WorldSettings$GameType a1) throws Throwable;
private static native void __fieldWrite1127_7(net.minecraft.entity.player.EntityPlayerMP a0, float a1) throws Throwable;
private static native net.minecraft.world.World __call1127_8(net.minecraft.command.ICommandSender a0) throws Throwable;
private static native net.minecraft.world.GameRules __call1127_9(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call1127_10(net.minecraft.world.GameRules a0, java.lang.String a1) throws Throwable;
private static native void __call1127_11(net.minecraft.entity.player.EntityPlayerMP a0, moom.CN a1) throws Throwable;
private static native java.lang.String __call1127_12(net.minecraft.world.WorldSettings$GameType a0) throws Throwable;
private static native java.lang.String __invokedynamic1127_13(java.lang.String a0) throws Throwable;
private static native java.lang.String __call1127_14(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1127_15(net.minecraft.command.ICommandSender a0, moom.pW a1, int a2, java.lang.String a3, java.lang.Object[] a4) throws Throwable;
private static native void __call1127_16(net.minecraft.command.ICommandSender a0, moom.pW a1, int a2, java.lang.String a3, java.lang.Object[] a4) throws Throwable;
private static native java.lang.Exception __call1112700_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1112701_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1112702_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1112703_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1112704_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1112705_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1112706_0(moom.b7 a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.world.WorldSettings$GameType __sourceHandlerCall_02b1dbfabfb6c48ca25b(moom.pW a0, net.minecraft.command.ICommandSender a1, java.lang.String a2) throws E;
private static final class __SourceHandler_02b1dbfabfb6c48ca25b {

public static net.minecraft.world.WorldSettings$GameType f1126(moom.pW receiver, net.minecraft.command.ICommandSender p0, java.lang.String p1) throws Throwable {
    int forwardValue1126_16_0;
    int forwardValue1126_23_0;
    int forwardValue1126_29_0;
    int forwardValue1126_36_0;
    int forwardValue1126_42_0;
    int forwardValue1126_49_0;
    int forwardValue1126_55_0;
    int forwardValue1126_65_0;
    net.minecraft.world.WorldSettings$GameType forwardValue1126_74_0;
    boolean spill1126_0;
    long life3_3;
    int life5_5;
    forward_join_74: {
    forward_join_73: {
    forward_join_71: {
    forward_join_69: {
    forward_join_67: {
    forward_join_65: {
    forward_join_55: {
    forward_join_49: {
    forward_join_42: {
    forward_join_36: {
    forward_join_29: {
    forward_join_23: {
    forward_join_16: {
    life3_3 = (__fieldRead1126_0() ^ 136573862286792L);
    life5_5 = __integerCategory1126_2(__call1126_1());
    spill1126_0 = __call1126_5(p1, __call1126_4(__fieldRead1126_3()));
    if (!((life5_5 == 0))) {
        forwardValue1126_16_0 = __integerCategory1126_6(spill1126_0);
        break forward_join_16;
    }
    if (!((!spill1126_0))) {
        break forward_join_73;
    }
    forwardValue1126_16_0 = __integerCategory1126_8(__call1126_7(p1, "s"));
    }
    if (!((life5_5 == 0))) {
        forwardValue1126_23_0 = forwardValue1126_16_0;
        break forward_join_23;
    }
    if (!((forwardValue1126_16_0 == 0))) {
        break forward_join_73;
    }
    forwardValue1126_23_0 = __integerCategory1126_12(__call1126_11(p1, __call1126_10(__fieldRead1126_9())));
    }
    if (!((life5_5 == 0))) {
        forwardValue1126_29_0 = forwardValue1126_23_0;
        break forward_join_29;
    }
    if (!((forwardValue1126_23_0 == 0))) {
        break forward_join_71;
    }
    forwardValue1126_29_0 = __integerCategory1126_14(__call1126_13(p1, "c"));
    }
    if (!((life5_5 == 0))) {
        forwardValue1126_36_0 = forwardValue1126_29_0;
        break forward_join_36;
    }
    if (!((forwardValue1126_29_0 == 0))) {
        break forward_join_71;
    }
    forwardValue1126_36_0 = __integerCategory1126_18(__call1126_17(p1, __call1126_16(__fieldRead1126_15())));
    }
    if (!((life5_5 == 0))) {
        forwardValue1126_42_0 = forwardValue1126_36_0;
        break forward_join_42;
    }
    if (!((forwardValue1126_36_0 == 0))) {
        break forward_join_69;
    }
    forwardValue1126_42_0 = __integerCategory1126_20(__call1126_19(p1, "a"));
    }
    if (!((life5_5 == 0))) {
        forwardValue1126_49_0 = forwardValue1126_42_0;
        break forward_join_49;
    }
    if (!((forwardValue1126_42_0 == 0))) {
        break forward_join_69;
    }
    forwardValue1126_49_0 = __integerCategory1126_24(__call1126_23(p1, __call1126_22(__fieldRead1126_21())));
    }
    if (!((life5_5 == 0))) {
        forwardValue1126_55_0 = forwardValue1126_49_0;
        break forward_join_55;
    }
    if (!((forwardValue1126_49_0 == 0))) {
        break forward_join_67;
    }
    forwardValue1126_55_0 = __integerCategory1126_26(__call1126_25(p1, "sp"));
    }
    if (!((life5_5 == 0))) {
        forwardValue1126_65_0 = forwardValue1126_55_0;
        break forward_join_65;
    }
    if (!((forwardValue1126_55_0 == 0))) {
        break forward_join_67;
    }
    forwardValue1126_65_0 = __call1126_28(p1, 0, ((__call1126_27()).length - 2));
    }
    forwardValue1126_74_0 = __call1126_29(forwardValue1126_65_0);
    break forward_join_74;
    }
    forwardValue1126_74_0 = __fieldRead1126_30();
    break forward_join_74;
    }
    forwardValue1126_74_0 = __fieldRead1126_31();
    break forward_join_74;
    }
    forwardValue1126_74_0 = __fieldRead1126_32();
    break forward_join_74;
    }
    forwardValue1126_74_0 = __fieldRead1126_33();
    }
    return forwardValue1126_74_0;
}
public static void h1126_0(moom.b7 p0) throws Throwable {
    throw __call1112600_0(p0);
}
public static void h1126_1(moom.b7 p0) throws Throwable {
    throw __call1112601_0(p0);
}
public static void h1126_2(moom.b7 p0) throws Throwable {
    throw __call1112602_0(p0);
}
public static void h1126_3(moom.b7 p0) throws Throwable {
    throw __call1112603_0(p0);
}
public static void h1126_4(moom.b7 p0) throws Throwable {
    throw __call1112604_0(p0);
}
public static void h1126_5(moom.b7 p0) throws Throwable {
    throw __call1112605_0(p0);
}
public static void h1126_6(moom.b7 p0) throws Throwable {
    throw __call1112606_0(p0);
}
public static void h1126_7(moom.b7 p0) throws Throwable {
    throw __call1112607_0(p0);
}
public static void h1126_8(moom.b7 p0) throws Throwable {
    throw __call1112608_0(p0);
}
public static void h1126_9(moom.b7 p0) throws Throwable {
    throw __call1112609_0(p0);
}
public static void h1126_10(moom.b7 p0) throws Throwable {
    throw __call1112610_0(p0);
}
public static void h1126_11(moom.b7 p0) throws Throwable {
    throw __call1112611_0(p0);
}
public static void h1126_12(moom.b7 p0) throws Throwable {
    throw __call1112612_0(p0);
}
public static void h1126_13(moom.b7 p0) throws Throwable {
    throw __call1112613_0(p0);
}
public static void h1126_14(moom.b7 p0) throws Throwable {
    throw __call1112614_0(p0);
}
public static void h1126_15(moom.b7 p0) throws Throwable {
    throw __call1112615_0(p0);
}
private static native long __fieldRead1126_0() throws Throwable;
private static native boolean __call1126_1() throws Throwable;
private static native int __integerCategory1126_2(boolean value) throws Throwable;
private static native net.minecraft.world.WorldSettings$GameType __fieldRead1126_3() throws Throwable;
private static native java.lang.String __call1126_4(net.minecraft.world.WorldSettings$GameType a0) throws Throwable;
private static native boolean __call1126_5(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1126_6(boolean value) throws Throwable;
private static native boolean __call1126_7(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1126_8(boolean value) throws Throwable;
private static native net.minecraft.world.WorldSettings$GameType __fieldRead1126_9() throws Throwable;
private static native java.lang.String __call1126_10(net.minecraft.world.WorldSettings$GameType a0) throws Throwable;
private static native boolean __call1126_11(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1126_12(boolean value) throws Throwable;
private static native boolean __call1126_13(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1126_14(boolean value) throws Throwable;
private static native net.minecraft.world.WorldSettings$GameType __fieldRead1126_15() throws Throwable;
private static native java.lang.String __call1126_16(net.minecraft.world.WorldSettings$GameType a0) throws Throwable;
private static native boolean __call1126_17(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1126_18(boolean value) throws Throwable;
private static native boolean __call1126_19(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1126_20(boolean value) throws Throwable;
private static native net.minecraft.world.WorldSettings$GameType __fieldRead1126_21() throws Throwable;
private static native java.lang.String __call1126_22(net.minecraft.world.WorldSettings$GameType a0) throws Throwable;
private static native boolean __call1126_23(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1126_24(boolean value) throws Throwable;
private static native boolean __call1126_25(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1126_26(boolean value) throws Throwable;
private static native net.minecraft.world.WorldSettings$GameType[] __call1126_27() throws Throwable;
private static native int __call1126_28(java.lang.String a0, int a1, int a2) throws Throwable;
private static native net.minecraft.world.WorldSettings$GameType __call1126_29(int a0) throws Throwable;
private static native net.minecraft.world.WorldSettings$GameType __fieldRead1126_30() throws Throwable;
private static native net.minecraft.world.WorldSettings$GameType __fieldRead1126_31() throws Throwable;
private static native net.minecraft.world.WorldSettings$GameType __fieldRead1126_32() throws Throwable;
private static native net.minecraft.world.WorldSettings$GameType __fieldRead1126_33() throws Throwable;
private static native java.lang.Exception __call1112600_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1112601_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1112602_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1112603_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1112604_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1112605_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1112606_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1112607_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1112608_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1112609_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1112610_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1112611_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1112612_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1112613_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1112614_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1112615_0(moom.b7 a0) throws Throwable;

}


static {
moom.pW.d = (moom._c.a(-145315633703803011L, 8822248703820212789L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(156227351704157L);
}


public java.util.List<java.lang.String> a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) { return __sourceHandlerCall_eda2629bcada759db75f(this, p0, p1, p2); }


protected java.lang.String[] a__ArrayString() {
return ((moom.Bl)(moom.Bl.a__Bl())).a__ArrayString();
}


public boolean a__Boolean(java.lang.String[] p0, int p1) { return __sourceHandlerCall_fd0086899f9104a75e8e(this, p0, p1); }


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public java.lang.String a__String() {
return "gamemode";
}


public int a() {
return 2;
}


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.gamemode.usage";
}


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 { __sourceHandlerCall_d59eb955763691519aa9(this, p0, p1); }


protected net.minecraft.world.WorldSettings$GameType a__sourceReturn_e46afc6ec4(net.minecraft.command.ICommandSender p0, java.lang.String p1) throws moom.b7 { return __sourceHandlerCall_02b1dbfabfb6c48ca25b(this, p0, p1); }

}
