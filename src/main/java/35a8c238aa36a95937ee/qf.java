package moom;


public class qf extends net.minecraft.command.CommandBase {

private static long c;

private static long d;

private static long[] e;

private static java.lang.Long[] g;

private static java.util.Map k;

public qf() {
super();
}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_818c176027b363f226dc(moom.qf a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, moom.DT a3) throws E;
private static final class __SourceHandler_818c176027b363f226dc {

public static java.util.List f187(moom.qf receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) throws Throwable {
    int forwardValue187_45_0;
    int forwardValue187_45_1;
    int forwardValue187_71_0;
    int forwardValue187_72_0;
    int forwardValue187_72_1;
    int forwardValue187_96_0;
    int forwardValue187_99_0;
    int forwardValue187_99_1;
    int forwardValue187_107_0;
    java.lang.String[] forwardValue187_110_0;
    int forwardValue187_110_1;
    java.util.List forwardValue187_122_0;
    int spill187_0;
    int spill187_1;
    java.lang.String[] spill187_2;
    java.lang.String[] spill187_3;
    java.lang.String[] spill187_4;
    java.lang.String[] spill187_5;
    java.lang.String[] spill187_6;
    java.lang.String[] spill187_7;
    java.lang.String[] spill187_8;
    boolean spill187_9;
    java.lang.String[] spill187_10;
    java.lang.String[] spill187_11;
    java.lang.String[] spill187_12;
    int spill187_13;
    int spill187_14;
    boolean spill187_15;
    java.lang.String[] spill187_16;
    int spill187_17;
    java.lang.String[] spill187_18;
    java.lang.String[] spill187_19;
    long life4_3;
    int life6_5;
    forward_join_122: {
    forward_join_121: {
    forward_join_110: {
    forward_join_107: {
    forward_join_99: {
    forward_join_96: {
    forward_join_94: {
    forward_join_72: {
    forward_join_71: {
    forward_join_69: {
    forward_join_45: {
    forward_join_42: {
    life4_3 = (__fieldRead187_0() ^ 106582246335734L);
    life6_5 = __integerCategory187_2(__call187_1());
    spill187_0 = (p1).length;
    spill187_1 = 1;
    if (!((life6_5 == 0))) {
        forwardValue187_45_0 = spill187_0;
        forwardValue187_45_1 = spill187_1;
        break forward_join_45;
    }
    if (!((spill187_0 == spill187_1))) {
        break forward_join_42;
    }
    spill187_2 = p1;
    java.lang.String[] __stackOp187_4_0 = new java.lang.String[((int) __fieldRead187_3())];
    spill187_3 = __stackOp187_4_0;
    (__stackOp187_4_0)[0] = "set";
    java.lang.String[] __stackOp187_5_0 = spill187_3;
    spill187_4 = __stackOp187_5_0;
    (__stackOp187_5_0)[1] = "center";
    java.lang.String[] __stackOp187_6_0 = spill187_4;
    spill187_5 = __stackOp187_6_0;
    (__stackOp187_6_0)[2] = "damage";
    java.lang.String[] __stackOp187_7_0 = spill187_5;
    spill187_6 = __stackOp187_7_0;
    (__stackOp187_7_0)[3] = "warning";
    java.lang.String[] __stackOp187_8_0 = spill187_6;
    spill187_7 = __stackOp187_8_0;
    (__stackOp187_8_0)[4] = "add";
    java.lang.String[] __stackOp187_9_0 = spill187_7;
    spill187_8 = __stackOp187_9_0;
    (__stackOp187_9_0)[5] = "get";
    forwardValue187_122_0 = __call187_10(spill187_2, spill187_8);
    break forward_join_122;
    }
    forwardValue187_45_0 = (p1).length;
    forwardValue187_45_1 = 2;
    }
    if (!((life6_5 == 0))) {
        forwardValue187_72_0 = forwardValue187_45_0;
        forwardValue187_72_1 = forwardValue187_45_1;
        break forward_join_72;
    }
    if (!((forwardValue187_45_0 == forwardValue187_45_1))) {
        break forward_join_69;
    }
    spill187_9 = __call187_11((p1)[0], "damage");
    if (!((life6_5 == 0))) {
        forwardValue187_71_0 = __integerCategory187_12(spill187_9);
        break forward_join_71;
    }
    if (!(spill187_9)) {
        break forward_join_69;
    }
    spill187_10 = p1;
    java.lang.String[] __stackOp187_13_0 = new java.lang.String[2];
    spill187_11 = __stackOp187_13_0;
    (__stackOp187_13_0)[0] = "buffer";
    java.lang.String[] __stackOp187_14_0 = spill187_11;
    spill187_12 = __stackOp187_14_0;
    (__stackOp187_14_0)[1] = "amount";
    forwardValue187_122_0 = __call187_15(spill187_10, spill187_12);
    break forward_join_122;
    }
    forwardValue187_71_0 = (p1).length;
    }
    forwardValue187_72_0 = forwardValue187_71_0;
    forwardValue187_72_1 = 2;
    }
    if (!((life6_5 == 0))) {
        forwardValue187_99_0 = forwardValue187_72_0;
        forwardValue187_99_1 = forwardValue187_72_1;
        break forward_join_99;
    }
    if (!((forwardValue187_72_0 >= forwardValue187_72_1))) {
        break forward_join_94;
    }
    spill187_13 = (p1).length;
    spill187_14 = 3;
    if (!((life6_5 == 0))) {
        forwardValue187_99_0 = spill187_13;
        forwardValue187_99_1 = spill187_14;
        break forward_join_99;
    }
    if (!((spill187_13 <= spill187_14))) {
        break forward_join_94;
    }
    spill187_15 = __call187_16((p1)[0], "center");
    if (!((life6_5 == 0))) {
        forwardValue187_96_0 = __integerCategory187_17(spill187_15);
        break forward_join_96;
    }
    if (!(spill187_15)) {
        break forward_join_94;
    }
    forwardValue187_122_0 = __call187_18(p1, 1, p2);
    break forward_join_122;
    }
    forwardValue187_96_0 = (p1).length;
    }
    if (!((life6_5 == 0))) {
        forwardValue187_107_0 = forwardValue187_96_0;
        break forward_join_107;
    }
    forwardValue187_99_0 = forwardValue187_96_0;
    forwardValue187_99_1 = 2;
    }
    if (!((forwardValue187_99_0 == forwardValue187_99_1))) {
        break forward_join_121;
    }
    spill187_16 = p1;
    spill187_17 = 0;
    if (!((life6_5 == 0))) {
        forwardValue187_110_0 = spill187_16;
        forwardValue187_110_1 = spill187_17;
        break forward_join_110;
    }
    forwardValue187_107_0 = __integerCategory187_20(__call187_19((spill187_16)[spill187_17], "warning"));
    }
    if (!((forwardValue187_107_0 != 0))) {
        break forward_join_121;
    }
    forwardValue187_110_0 = p1;
    forwardValue187_110_1 = 2;
    }
    java.lang.String[] __stackOp187_21_0 = new java.lang.String[forwardValue187_110_1];
    spill187_18 = __stackOp187_21_0;
    (__stackOp187_21_0)[0] = "time";
    java.lang.String[] __stackOp187_22_0 = spill187_18;
    spill187_19 = __stackOp187_22_0;
    (__stackOp187_22_0)[1] = "distance";
    forwardValue187_122_0 = __call187_23(forwardValue187_110_0, spill187_19);
    break forward_join_122;
    }
    forwardValue187_122_0 = null;
    }
    return forwardValue187_122_0;
}
public static void h187_0(moom.Oo p0) throws Throwable {
    throw __call1018700_0(p0);
}
public static void h187_1(moom.Oo p0) throws Throwable {
    throw __call1018701_0(p0);
}
public static void h187_2(moom.Oo p0) throws Throwable {
    throw __call1018702_0(p0);
}
public static void h187_3(moom.Oo p0) throws Throwable {
    throw __call1018703_0(p0);
}
public static void h187_4(moom.Oo p0) throws Throwable {
    throw __call1018704_0(p0);
}
public static void h187_5(moom.Oo p0) throws Throwable {
    throw __call1018705_0(p0);
}
public static void h187_6(moom.Oo p0) throws Throwable {
    throw __call1018706_0(p0);
}
public static void h187_7(moom.Oo p0) throws Throwable {
    throw __call1018707_0(p0);
}
public static void h187_8(moom.Oo p0) throws Throwable {
    throw __call1018708_0(p0);
}
public static void h187_9(moom.Oo p0) throws Throwable {
    throw __call1018709_0(p0);
}
public static void h187_10(moom.Oo p0) throws Throwable {
    throw __call1018710_0(p0);
}
public static void h187_11(moom.Oo p0) throws Throwable {
    throw __call1018711_0(p0);
}
public static void h187_12(moom.Oo p0) throws Throwable {
    throw __call1018712_0(p0);
}
public static void h187_13(moom.Oo p0) throws Throwable {
    throw __call1018713_0(p0);
}
public static void h187_14(moom.Oo p0) throws Throwable {
    throw __call1018714_0(p0);
}
public static void h187_15(moom.Oo p0) throws Throwable {
    throw __call1018715_0(p0);
}
private static native long __fieldRead187_0() throws Throwable;
private static native boolean __call187_1() throws Throwable;
private static native int __integerCategory187_2(boolean value) throws Throwable;
private static native long __fieldRead187_3() throws Throwable;
private static native java.util.List __call187_10(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native boolean __call187_11(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory187_12(boolean value) throws Throwable;
private static native java.util.List __call187_15(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native boolean __call187_16(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory187_17(boolean value) throws Throwable;
private static native java.util.List __call187_18(java.lang.String[] a0, int a1, moom.DT a2) throws Throwable;
private static native boolean __call187_19(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory187_20(boolean value) throws Throwable;
private static native java.util.List __call187_23(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.Exception __call1018700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018701_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018702_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018703_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018704_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018705_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018706_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018707_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018708_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018709_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018710_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018711_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018712_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018713_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018714_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1018715_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_dcd55145af051025b96e(moom.qf a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws E;
private static final class __SourceHandler_dcd55145af051025b96e {

public static void f1173(moom.qf receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws Throwable {
    int forwardValue1173_37_0;
    int forwardValue1173_37_1;
    java.lang.String[] forwardValue1173_62_0;
    long forwardValue1173_79_0;
    int forwardValue1173_223_0;
    int forwardValue1173_235_0;
    int forwardValue1173_235_1;
    long forwardValue1173_267_0;
    java.lang.String[] forwardValue1173_267_1;
    long forwardValue1173_283_0;
    long forwardValue1173_284_0;
    long forwardValue1173_284_1;
    int forwardValue1173_429_0;
    int forwardValue1173_495_0;
    int forwardValue1173_516_0;
    java.lang.String[] forwardValue1173_533_0;
    int forwardValue1173_581_0;
    int forwardValue1173_588_0;
    java.lang.String[] forwardValue1173_598_0;
    int forwardValue1173_646_0;
    int forwardValue1173_667_0;
    int forwardValue1173_691_0;
    int forwardValue1173_718_0;
    int forwardValue1173_723_0;
    int forwardValue1173_736_0;
    int forwardValue1173_763_0;
    boolean spill1173_0;
    int spill1173_1;
    int spill1173_2;
    java.lang.String[] spill1173_3;
    int spill1173_4;
    int spill1173_5;
    long spill1173_6;
    java.lang.String[] spill1173_7;
    int spill1173_8;
    java.lang.String[] spill1173_9;
    java.lang.String[] spill1173_10;
    int spill1173_11;
    boolean spill1173_12;
    int spill1173_13;
    long life3_3;
    int life5_5;
    net.minecraft.world.border.WorldBorder life6_21;
    double life7_63;
    double life9_70;
    long life11_101;
    double life7_302;
    double life9_314;
    long life11_348;
    moom.DT life7_537;
    double life8_548;
    double life10_559;
    double life7_654;
    double life9_657;
    double life7_733;
    double life9_736;
    int life7_812;
    int life8_847;
    int life8_906;
    double life7_948;
    forward_join_801: {
    forward_join_771: {
    forward_join_763: {
    forward_join_758: {
    forward_join_756: {
    forward_join_736: {
    forward_join_734: {
    forward_join_723: {
    forward_join_718: {
    forward_join_713: {
    forward_join_691: {
    forward_join_689: {
    forward_join_667: {
    forward_join_662: {
    forward_join_646: {
    forward_join_641: {
    forward_join_598: {
    forward_join_597: {
    forward_join_588: {
    forward_join_581: {
    forward_join_576: {
    forward_join_533: {
    forward_join_532: {
    forward_join_516: {
    forward_join_511: {
    forward_join_495: {
    forward_join_490: {
    forward_join_443: {
    forward_join_429: {
    forward_join_424: {
    forward_join_422: {
    forward_join_392: {
    forward_join_389: {
    forward_join_387: {
    forward_join_346: {
    forward_join_284: {
    forward_join_283: {
    forward_join_267: {
    forward_join_243: {
    forward_join_235: {
    forward_join_223: {
    forward_join_218: {
    forward_join_216: {
    forward_join_186: {
    forward_join_183: {
    forward_join_181: {
    forward_join_140: {
    forward_join_79: {
    forward_join_78: {
    forward_join_62: {
    forward_join_45: {
    forward_join_37: {
    forward_join_17: {
    life3_3 = (__fieldRead1173_0() ^ 43874428925301L);
    life5_5 = __integerCategory1173_2(__call1173_1());
    if (!(((p1).length < 1))) {
        break forward_join_17;
    }
    throw new moom.cc("commands.worldborder.usage", new java.lang.Object[0]);
    }
    life6_21 = __call1173_3(receiver);
    spill1173_0 = __call1173_4((p1)[0], "set");
    if (!((life5_5 != 0))) {
        forwardValue1173_223_0 = __integerCategory1173_5(spill1173_0);
        break forward_join_223;
    }
    if (!(spill1173_0)) {
        break forward_join_218;
    }
    spill1173_1 = (p1).length;
    spill1173_2 = 2;
    if (!((life5_5 != 0))) {
        forwardValue1173_37_0 = spill1173_1;
        forwardValue1173_37_1 = spill1173_2;
        break forward_join_37;
    }
    if (!((spill1173_1 != spill1173_2))) {
        break forward_join_45;
    }
    forwardValue1173_37_0 = (p1).length;
    forwardValue1173_37_1 = 3;
    }
    if (!((forwardValue1173_37_0 != forwardValue1173_37_1))) {
        break forward_join_45;
    }
    throw new moom.cc("commands.worldborder.set.usage", new java.lang.Object[0]);
    }
    life7_63 = __call1173_6(life6_21);
    life9_70 = __call1173_7((p1)[1], 0x1.0p0d, 0x1.c9c38p25d);
    spill1173_3 = p1;
    if (!((life5_5 != 0))) {
        forwardValue1173_62_0 = spill1173_3;
        break forward_join_62;
    }
    if (!(((spill1173_3).length > 2))) {
        break forward_join_78;
    }
    forwardValue1173_62_0 = p1;
    }
    forwardValue1173_79_0 = (__call1173_9((forwardValue1173_62_0)[2], 0L, __invokedynamic1173_8(10655, (2713912963253250608L ^ life3_3))) * __invokedynamic1173_10(26770, (5798703089393986367L ^ life3_3)));
    break forward_join_79;
    }
    forwardValue1173_79_0 = 0L;
    }
    life11_101 = forwardValue1173_79_0;
    if (!((life5_5 != 0))) {
        break forward_join_186;
    }
    if (!((__numericCompare1173_11(life11_101, 0L) > 0))) {
        break forward_join_183;
    }
    __call1173_12(life6_21, life7_63, life9_70, life11_101);
    if (!((life5_5 != 0))) {
        break forward_join_181;
    }
    if (!((__numericCompare1173_13(life7_63, life9_70) > 0))) {
        break forward_join_140;
    }
    __call1173_20(p0, receiver, "commands.worldborder.setSlowly.shrink.success", new java.lang.Object[] {__call1173_15("%.1f", new java.lang.Object[] {__call1173_14(life9_70)}), __call1173_17("%.1f", new java.lang.Object[] {__call1173_16(life7_63)}), __call1173_19((life11_101 / __invokedynamic1173_18(32397, (7864766836348026147L ^ life3_3))))});
    if (!((life5_5 == 0))) {
        break forward_join_216;
    }
    }
    __call1173_27(p0, receiver, "commands.worldborder.setSlowly.grow.success", new java.lang.Object[] {__call1173_22("%.1f", new java.lang.Object[] {__call1173_21(life9_70)}), __call1173_24("%.1f", new java.lang.Object[] {__call1173_23(life7_63)}), __call1173_26((life11_101 / __invokedynamic1173_25(32397, (7864766836348026147L ^ life3_3))))});
    }
    if (!((life5_5 == 0))) {
        break forward_join_216;
    }
    }
    __call1173_28(life6_21, life9_70);
    }
    __call1173_33(p0, receiver, "commands.worldborder.set.success", new java.lang.Object[] {__call1173_30("%.1f", new java.lang.Object[] {__call1173_29(life9_70)}), __call1173_32("%.1f", new java.lang.Object[] {__call1173_31(life7_63)})});
    }
    if (!((life5_5 == 0))) {
        break forward_join_801;
    }
    }
    forwardValue1173_223_0 = __integerCategory1173_35(__call1173_34((p1)[0], "add"));
    }
    if (!((life5_5 != 0))) {
        forwardValue1173_429_0 = forwardValue1173_223_0;
        break forward_join_429;
    }
    if (!((forwardValue1173_223_0 != 0))) {
        break forward_join_424;
    }
    spill1173_4 = (p1).length;
    spill1173_5 = 2;
    if (!((life5_5 != 0))) {
        forwardValue1173_235_0 = spill1173_4;
        forwardValue1173_235_1 = spill1173_5;
        break forward_join_235;
    }
    if (!((spill1173_4 != spill1173_5))) {
        break forward_join_243;
    }
    forwardValue1173_235_0 = (p1).length;
    forwardValue1173_235_1 = 3;
    }
    if (!((forwardValue1173_235_0 != forwardValue1173_235_1))) {
        break forward_join_243;
    }
    throw new moom.cc("commands.worldborder.add.usage", new java.lang.Object[0]);
    }
    life7_302 = __call1173_36(life6_21);
    life9_314 = (life7_302 + __call1173_37((p1)[1], (-life7_302), (0x1.c9c38p25d - life7_302)));
    spill1173_6 = __call1173_38(life6_21);
    spill1173_7 = p1;
    if (!((life5_5 != 0))) {
        forwardValue1173_267_0 = spill1173_6;
        forwardValue1173_267_1 = spill1173_7;
        break forward_join_267;
    }
    if (!(((spill1173_7).length > 2))) {
        forwardValue1173_283_0 = spill1173_6;
        break forward_join_283;
    }
    forwardValue1173_267_0 = spill1173_6;
    forwardValue1173_267_1 = p1;
    }
    forwardValue1173_284_0 = forwardValue1173_267_0;
    forwardValue1173_284_1 = (__call1173_40((forwardValue1173_267_1)[2], 0L, __invokedynamic1173_39(5543, (6940398136739173899L ^ life3_3))) * __invokedynamic1173_41(32397, (7864766836348026147L ^ life3_3)));
    break forward_join_284;
    }
    forwardValue1173_284_0 = forwardValue1173_283_0;
    forwardValue1173_284_1 = 0L;
    }
    life11_348 = (forwardValue1173_284_0 + forwardValue1173_284_1);
    if (!((life5_5 != 0))) {
        break forward_join_392;
    }
    if (!((__numericCompare1173_42(life11_348, 0L) > 0))) {
        break forward_join_389;
    }
    __call1173_43(life6_21, life7_302, life9_314, life11_348);
    if (!((life5_5 != 0))) {
        break forward_join_387;
    }
    if (!((__numericCompare1173_44(life7_302, life9_314) > 0))) {
        break forward_join_346;
    }
    __call1173_51(p0, receiver, "commands.worldborder.setSlowly.shrink.success", new java.lang.Object[] {__call1173_46("%.1f", new java.lang.Object[] {__call1173_45(life9_314)}), __call1173_48("%.1f", new java.lang.Object[] {__call1173_47(life7_302)}), __call1173_50((life11_348 / __invokedynamic1173_49(32397, (7864766836348026147L ^ life3_3))))});
    if (!((life5_5 == 0))) {
        break forward_join_422;
    }
    }
    __call1173_58(p0, receiver, "commands.worldborder.setSlowly.grow.success", new java.lang.Object[] {__call1173_53("%.1f", new java.lang.Object[] {__call1173_52(life9_314)}), __call1173_55("%.1f", new java.lang.Object[] {__call1173_54(life7_302)}), __call1173_57((life11_348 / __invokedynamic1173_56(32397, (7864766836348026147L ^ life3_3))))});
    }
    if (!((life5_5 == 0))) {
        break forward_join_422;
    }
    }
    __call1173_59(life6_21, life9_314);
    }
    __call1173_64(p0, receiver, "commands.worldborder.set.success", new java.lang.Object[] {__call1173_61("%.1f", new java.lang.Object[] {__call1173_60(life9_314)}), __call1173_63("%.1f", new java.lang.Object[] {__call1173_62(life7_302)})});
    }
    if (!((life5_5 == 0))) {
        break forward_join_801;
    }
    }
    forwardValue1173_429_0 = __integerCategory1173_66(__call1173_65((p1)[0], "center"));
    }
    if (!((life5_5 != 0))) {
        forwardValue1173_495_0 = forwardValue1173_429_0;
        break forward_join_495;
    }
    if (!((forwardValue1173_429_0 != 0))) {
        break forward_join_490;
    }
    if (!(((p1).length != 3))) {
        break forward_join_443;
    }
    throw new moom.cc("commands.worldborder.center.usage", new java.lang.Object[0]);
    }
    life7_537 = __call1173_67(p0);
    life8_548 = __call1173_69((((double) __call1173_68(life7_537)) + 0x1.0p-1d), (p1)[1], 1);
    life10_559 = __call1173_71((((double) __call1173_70(life7_537)) + 0x1.0p-1d), (p1)[2], 1);
    __call1173_72(life6_21, life8_548, life10_559);
    __call1173_75(p0, receiver, "commands.worldborder.center.success", new java.lang.Object[] {__call1173_73(life8_548), __call1173_74(life10_559)});
    if (!((life5_5 == 0))) {
        break forward_join_801;
    }
    }
    forwardValue1173_495_0 = __integerCategory1173_77(__call1173_76((p1)[0], "damage"));
    }
    if (!((life5_5 != 0))) {
        forwardValue1173_646_0 = forwardValue1173_495_0;
        break forward_join_646;
    }
    if (!((forwardValue1173_495_0 != 0))) {
        break forward_join_641;
    }
    spill1173_8 = (p1).length;
    if (!((life5_5 != 0))) {
        forwardValue1173_516_0 = spill1173_8;
        break forward_join_516;
    }
    if (!((spill1173_8 < 2))) {
        break forward_join_511;
    }
    throw new moom.cc("commands.worldborder.damage.usage", new java.lang.Object[0]);
    }
    forwardValue1173_516_0 = __integerCategory1173_79(__call1173_78((p1)[1], "buffer"));
    }
    if (!((life5_5 != 0))) {
        forwardValue1173_581_0 = forwardValue1173_516_0;
        break forward_join_581;
    }
    if (!((forwardValue1173_516_0 != 0))) {
        break forward_join_576;
    }
    spill1173_9 = p1;
    if (!((life5_5 != 0))) {
        forwardValue1173_533_0 = spill1173_9;
        break forward_join_533;
    }
    if (!(((spill1173_9).length != 3))) {
        break forward_join_532;
    }
    throw new moom.cc("commands.worldborder.damage.buffer.usage", new java.lang.Object[0]);
    }
    forwardValue1173_533_0 = p1;
    }
    life7_654 = __call1173_80((forwardValue1173_533_0)[2], 0x0.0p0d);
    life9_657 = __call1173_81(life6_21);
    __call1173_82(life6_21, life7_654);
    __call1173_87(p0, receiver, "commands.worldborder.damage.buffer.success", new java.lang.Object[] {__call1173_84("%.1f", new java.lang.Object[] {__call1173_83(life7_654)}), __call1173_86("%.1f", new java.lang.Object[] {__call1173_85(life9_657)})});
    if (!((life5_5 == 0))) {
        break forward_join_801;
    }
    }
    forwardValue1173_581_0 = __integerCategory1173_89(__call1173_88((p1)[1], "amount"));
    }
    if (!((life5_5 != 0))) {
        forwardValue1173_588_0 = forwardValue1173_581_0;
        break forward_join_588;
    }
    if (!((forwardValue1173_581_0 != 0))) {
        break forward_join_801;
    }
    spill1173_10 = p1;
    if (!((life5_5 != 0))) {
        forwardValue1173_598_0 = spill1173_10;
        break forward_join_598;
    }
    forwardValue1173_588_0 = (spill1173_10).length;
    }
    if (!((forwardValue1173_588_0 != 3))) {
        break forward_join_597;
    }
    throw new moom.cc("commands.worldborder.damage.amount.usage", new java.lang.Object[0]);
    }
    forwardValue1173_598_0 = p1;
    }
    life7_733 = __call1173_90((forwardValue1173_598_0)[2], 0x0.0p0d);
    life9_736 = __call1173_91(life6_21);
    __call1173_92(life6_21, life7_733);
    __call1173_97(p0, receiver, "commands.worldborder.damage.amount.success", new java.lang.Object[] {__call1173_94("%.2f", new java.lang.Object[] {__call1173_93(life7_733)}), __call1173_96("%.2f", new java.lang.Object[] {__call1173_95(life9_736)})});
    if (!((life5_5 == 0))) {
        break forward_join_801;
    }
    }
    forwardValue1173_646_0 = __integerCategory1173_99(__call1173_98((p1)[0], "warning"));
    }
    if (!((life5_5 != 0))) {
        forwardValue1173_763_0 = forwardValue1173_646_0;
        break forward_join_763;
    }
    if (!((forwardValue1173_646_0 != 0))) {
        break forward_join_758;
    }
    spill1173_11 = (p1).length;
    if (!((life5_5 != 0))) {
        forwardValue1173_667_0 = spill1173_11;
        break forward_join_667;
    }
    if (!((spill1173_11 < 2))) {
        break forward_join_662;
    }
    throw new moom.cc("commands.worldborder.warning.usage", new java.lang.Object[0]);
    }
    forwardValue1173_667_0 = __call1173_100((p1)[2], 0);
    }
    life7_812 = forwardValue1173_667_0;
    spill1173_12 = __call1173_101((p1)[1], "time");
    if (!((life5_5 != 0))) {
        forwardValue1173_718_0 = __integerCategory1173_102(spill1173_12);
        break forward_join_718;
    }
    if (!(spill1173_12)) {
        break forward_join_713;
    }
    spill1173_13 = (p1).length;
    if (!((life5_5 != 0))) {
        forwardValue1173_691_0 = spill1173_13;
        break forward_join_691;
    }
    if (!((spill1173_13 != 3))) {
        break forward_join_689;
    }
    throw new moom.cc("commands.worldborder.warning.time.usage", new java.lang.Object[0]);
    }
    forwardValue1173_691_0 = __call1173_103(life6_21);
    }
    life8_847 = forwardValue1173_691_0;
    __call1173_104(life6_21, life7_812);
    __call1173_107(p0, receiver, "commands.worldborder.warning.time.success", new java.lang.Object[] {__call1173_105(life7_812), __call1173_106(life8_847)});
    if (!((life5_5 == 0))) {
        break forward_join_756;
    }
    }
    forwardValue1173_718_0 = __integerCategory1173_109(__call1173_108((p1)[1], "distance"));
    }
    if (!((life5_5 != 0))) {
        forwardValue1173_723_0 = forwardValue1173_718_0;
        break forward_join_723;
    }
    if (!((forwardValue1173_718_0 != 0))) {
        break forward_join_756;
    }
    forwardValue1173_723_0 = (p1).length;
    }
    if (!((life5_5 != 0))) {
        forwardValue1173_736_0 = forwardValue1173_723_0;
        break forward_join_736;
    }
    if (!((forwardValue1173_723_0 != 3))) {
        break forward_join_734;
    }
    throw new moom.cc("commands.worldborder.warning.distance.usage", new java.lang.Object[0]);
    }
    forwardValue1173_736_0 = __call1173_110(life6_21);
    }
    life8_906 = forwardValue1173_736_0;
    __call1173_111(life6_21, life7_812);
    __call1173_114(p0, receiver, "commands.worldborder.warning.distance.success", new java.lang.Object[] {__call1173_112(life7_812), __call1173_113(life8_906)});
    }
    if (!((life5_5 == 0))) {
        break forward_join_801;
    }
    }
    forwardValue1173_763_0 = __integerCategory1173_116(__call1173_115((p1)[0], "get"));
    }
    if (!((forwardValue1173_763_0 == 0))) {
        break forward_join_771;
    }
    throw new moom.cc("commands.worldborder.usage", new java.lang.Object[0]);
    }
    life7_948 = __call1173_117(life6_21);
    __call1173_120(p0, __fieldRead1173_118(), __call1173_119((life7_948 + 0x1.0p-1d)));
    __call1173_123(p0, new moom.CN("commands.worldborder.get.success", new java.lang.Object[] {__call1173_122("%.0f", new java.lang.Object[] {__call1173_121(life7_948)})}));
    }
    return;
}
public static void h1173_0(moom.b7 p0) throws Throwable {
    throw __call1117300_0(p0);
}
public static void h1173_1(moom.b7 p0) throws Throwable {
    throw __call1117301_0(p0);
}
public static void h1173_2(moom.b7 p0) throws Throwable {
    throw __call1117302_0(p0);
}
public static void h1173_3(moom.b7 p0) throws Throwable {
    throw __call1117303_0(p0);
}
public static void h1173_4(moom.b7 p0) throws Throwable {
    throw __call1117304_0(p0);
}
public static void h1173_5(moom.b7 p0) throws Throwable {
    throw __call1117305_0(p0);
}
public static void h1173_6(moom.b7 p0) throws Throwable {
    throw __call1117306_0(p0);
}
public static void h1173_7(moom.b7 p0) throws Throwable {
    throw __call1117307_0(p0);
}
public static void h1173_8(moom.b7 p0) throws Throwable {
    throw __call1117308_0(p0);
}
public static void h1173_9(moom.b7 p0) throws Throwable {
    throw __call1117309_0(p0);
}
public static void h1173_10(moom.b7 p0) throws Throwable {
    throw __call1117310_0(p0);
}
public static void h1173_11(moom.b7 p0) throws Throwable {
    throw __call1117311_0(p0);
}
public static void h1173_12(moom.b7 p0) throws Throwable {
    throw __call1117312_0(p0);
}
public static void h1173_13(moom.b7 p0) throws Throwable {
    throw __call1117313_0(p0);
}
public static void h1173_14(moom.b7 p0) throws Throwable {
    throw __call1117314_0(p0);
}
public static void h1173_15(moom.b7 p0) throws Throwable {
    throw __call1117315_0(p0);
}
public static void h1173_16(moom.b7 p0) throws Throwable {
    throw __call1117316_0(p0);
}
public static void h1173_17(moom.b7 p0) throws Throwable {
    throw __call1117317_0(p0);
}
public static void h1173_18(moom.b7 p0) throws Throwable {
    throw __call1117318_0(p0);
}
public static void h1173_19(moom.b7 p0) throws Throwable {
    throw __call1117319_0(p0);
}
public static void h1173_20(moom.b7 p0) throws Throwable {
    throw __call1117320_0(p0);
}
public static void h1173_21(moom.b7 p0) throws Throwable {
    throw __call1117321_0(p0);
}
public static void h1173_22(moom.b7 p0) throws Throwable {
    throw __call1117322_0(p0);
}
public static void h1173_23(moom.b7 p0) throws Throwable {
    throw __call1117323_0(p0);
}
public static void h1173_24(moom.b7 p0) throws Throwable {
    throw __call1117324_0(p0);
}
public static void h1173_25(moom.b7 p0) throws Throwable {
    throw __call1117325_0(p0);
}
public static void h1173_26(moom.b7 p0) throws Throwable {
    throw __call1117326_0(p0);
}
public static void h1173_27(moom.b7 p0) throws Throwable {
    throw __call1117327_0(p0);
}
public static void h1173_28(moom.b7 p0) throws Throwable {
    throw __call1117328_0(p0);
}
public static void h1173_29(moom.b7 p0) throws Throwable {
    throw __call1117329_0(p0);
}
public static void h1173_30(moom.b7 p0) throws Throwable {
    throw __call1117330_0(p0);
}
public static void h1173_31(moom.b7 p0) throws Throwable {
    throw __call1117331_0(p0);
}
public static void h1173_32(moom.b7 p0) throws Throwable {
    throw __call1117332_0(p0);
}
public static void h1173_33(moom.b7 p0) throws Throwable {
    throw __call1117333_0(p0);
}
public static void h1173_34(moom.b7 p0) throws Throwable {
    throw __call1117334_0(p0);
}
public static void h1173_35(moom.b7 p0) throws Throwable {
    throw __call1117335_0(p0);
}
public static void h1173_36(moom.b7 p0) throws Throwable {
    throw __call1117336_0(p0);
}
public static void h1173_37(moom.b7 p0) throws Throwable {
    throw __call1117337_0(p0);
}
public static void h1173_38(moom.b7 p0) throws Throwable {
    throw __call1117338_0(p0);
}
public static void h1173_39(moom.b7 p0) throws Throwable {
    throw __call1117339_0(p0);
}
public static void h1173_40(moom.b7 p0) throws Throwable {
    throw __call1117340_0(p0);
}
public static void h1173_41(moom.b7 p0) throws Throwable {
    throw __call1117341_0(p0);
}
public static void h1173_42(moom.b7 p0) throws Throwable {
    throw __call1117342_0(p0);
}
public static void h1173_43(moom.b7 p0) throws Throwable {
    throw __call1117343_0(p0);
}
public static void h1173_44(moom.b7 p0) throws Throwable {
    throw __call1117344_0(p0);
}
public static void h1173_45(moom.b7 p0) throws Throwable {
    throw __call1117345_0(p0);
}
public static void h1173_46(moom.b7 p0) throws Throwable {
    throw __call1117346_0(p0);
}
public static void h1173_47(moom.b7 p0) throws Throwable {
    throw __call1117347_0(p0);
}
public static void h1173_48(moom.b7 p0) throws Throwable {
    throw __call1117348_0(p0);
}
public static void h1173_49(moom.b7 p0) throws Throwable {
    throw __call1117349_0(p0);
}
public static void h1173_50(moom.b7 p0) throws Throwable {
    throw __call1117350_0(p0);
}
public static void h1173_51(moom.b7 p0) throws Throwable {
    throw __call1117351_0(p0);
}
public static void h1173_52(moom.b7 p0) throws Throwable {
    throw __call1117352_0(p0);
}
public static void h1173_53(moom.b7 p0) throws Throwable {
    throw __call1117353_0(p0);
}
public static void h1173_54(moom.b7 p0) throws Throwable {
    throw __call1117354_0(p0);
}
public static void h1173_55(moom.b7 p0) throws Throwable {
    throw __call1117355_0(p0);
}
public static void h1173_56(moom.b7 p0) throws Throwable {
    throw __call1117356_0(p0);
}
public static void h1173_57(moom.b7 p0) throws Throwable {
    throw __call1117357_0(p0);
}
public static void h1173_58(moom.b7 p0) throws Throwable {
    throw __call1117358_0(p0);
}
public static void h1173_59(moom.b7 p0) throws Throwable {
    throw __call1117359_0(p0);
}
public static void h1173_60(moom.b7 p0) throws Throwable {
    throw __call1117360_0(p0);
}
public static void h1173_61(moom.b7 p0) throws Throwable {
    throw __call1117361_0(p0);
}
private static native long __fieldRead1173_0() throws Throwable;
private static native boolean __call1173_1() throws Throwable;
private static native int __integerCategory1173_2(boolean value) throws Throwable;
private static native net.minecraft.world.border.WorldBorder __call1173_3(moom.qf a0) throws Throwable;
private static native boolean __call1173_4(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1173_5(boolean value) throws Throwable;
private static native double __call1173_6(net.minecraft.world.border.WorldBorder a0) throws Throwable;
private static native double __call1173_7(java.lang.String a0, double a1, double a2) throws Throwable;
private static native long __invokedynamic1173_8(int a0, long a1) throws Throwable;
private static native long __call1173_9(java.lang.String a0, long a1, long a2) throws Throwable;
private static native long __invokedynamic1173_10(int a0, long a1) throws Throwable;
private static native int __numericCompare1173_11(long a0, long a1) throws Throwable;
private static native void __call1173_12(net.minecraft.world.border.WorldBorder a0, double a1, double a2, long a3) throws Throwable;
private static native int __numericCompare1173_13(double a0, double a1) throws Throwable;
private static native java.lang.Double __call1173_14(double a0) throws Throwable;
private static native java.lang.String __call1173_15(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.Double __call1173_16(double a0) throws Throwable;
private static native java.lang.String __call1173_17(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native long __invokedynamic1173_18(int a0, long a1) throws Throwable;
private static native java.lang.String __call1173_19(long a0) throws Throwable;
private static native void __call1173_20(net.minecraft.command.ICommandSender a0, moom.qf a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native java.lang.Double __call1173_21(double a0) throws Throwable;
private static native java.lang.String __call1173_22(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.Double __call1173_23(double a0) throws Throwable;
private static native java.lang.String __call1173_24(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native long __invokedynamic1173_25(int a0, long a1) throws Throwable;
private static native java.lang.String __call1173_26(long a0) throws Throwable;
private static native void __call1173_27(net.minecraft.command.ICommandSender a0, moom.qf a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native void __call1173_28(net.minecraft.world.border.WorldBorder a0, double a1) throws Throwable;
private static native java.lang.Double __call1173_29(double a0) throws Throwable;
private static native java.lang.String __call1173_30(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.Double __call1173_31(double a0) throws Throwable;
private static native java.lang.String __call1173_32(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __call1173_33(net.minecraft.command.ICommandSender a0, moom.qf a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native boolean __call1173_34(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1173_35(boolean value) throws Throwable;
private static native double __call1173_36(net.minecraft.world.border.WorldBorder a0) throws Throwable;
private static native double __call1173_37(java.lang.String a0, double a1, double a2) throws Throwable;
private static native long __call1173_38(net.minecraft.world.border.WorldBorder a0) throws Throwable;
private static native long __invokedynamic1173_39(int a0, long a1) throws Throwable;
private static native long __call1173_40(java.lang.String a0, long a1, long a2) throws Throwable;
private static native long __invokedynamic1173_41(int a0, long a1) throws Throwable;
private static native int __numericCompare1173_42(long a0, long a1) throws Throwable;
private static native void __call1173_43(net.minecraft.world.border.WorldBorder a0, double a1, double a2, long a3) throws Throwable;
private static native int __numericCompare1173_44(double a0, double a1) throws Throwable;
private static native java.lang.Double __call1173_45(double a0) throws Throwable;
private static native java.lang.String __call1173_46(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.Double __call1173_47(double a0) throws Throwable;
private static native java.lang.String __call1173_48(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native long __invokedynamic1173_49(int a0, long a1) throws Throwable;
private static native java.lang.String __call1173_50(long a0) throws Throwable;
private static native void __call1173_51(net.minecraft.command.ICommandSender a0, moom.qf a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native java.lang.Double __call1173_52(double a0) throws Throwable;
private static native java.lang.String __call1173_53(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.Double __call1173_54(double a0) throws Throwable;
private static native java.lang.String __call1173_55(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native long __invokedynamic1173_56(int a0, long a1) throws Throwable;
private static native java.lang.String __call1173_57(long a0) throws Throwable;
private static native void __call1173_58(net.minecraft.command.ICommandSender a0, moom.qf a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native void __call1173_59(net.minecraft.world.border.WorldBorder a0, double a1) throws Throwable;
private static native java.lang.Double __call1173_60(double a0) throws Throwable;
private static native java.lang.String __call1173_61(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.Double __call1173_62(double a0) throws Throwable;
private static native java.lang.String __call1173_63(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __call1173_64(net.minecraft.command.ICommandSender a0, moom.qf a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native boolean __call1173_65(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1173_66(boolean value) throws Throwable;
private static native moom.DT __call1173_67(net.minecraft.command.ICommandSender a0) throws Throwable;
private static native int __call1173_68(moom.DT a0) throws Throwable;
private static native double __call1173_69(double a0, java.lang.String a1, int a2) throws Throwable;
private static native int __call1173_70(moom.DT a0) throws Throwable;
private static native double __call1173_71(double a0, java.lang.String a1, int a2) throws Throwable;
private static native void __call1173_72(net.minecraft.world.border.WorldBorder a0, double a1, double a2) throws Throwable;
private static native java.lang.Double __call1173_73(double a0) throws Throwable;
private static native java.lang.Double __call1173_74(double a0) throws Throwable;
private static native void __call1173_75(net.minecraft.command.ICommandSender a0, moom.qf a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native boolean __call1173_76(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1173_77(boolean value) throws Throwable;
private static native boolean __call1173_78(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1173_79(boolean value) throws Throwable;
private static native double __call1173_80(java.lang.String a0, double a1) throws Throwable;
private static native double __call1173_81(net.minecraft.world.border.WorldBorder a0) throws Throwable;
private static native void __call1173_82(net.minecraft.world.border.WorldBorder a0, double a1) throws Throwable;
private static native java.lang.Double __call1173_83(double a0) throws Throwable;
private static native java.lang.String __call1173_84(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.Double __call1173_85(double a0) throws Throwable;
private static native java.lang.String __call1173_86(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __call1173_87(net.minecraft.command.ICommandSender a0, moom.qf a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native boolean __call1173_88(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1173_89(boolean value) throws Throwable;
private static native double __call1173_90(java.lang.String a0, double a1) throws Throwable;
private static native double __call1173_91(net.minecraft.world.border.WorldBorder a0) throws Throwable;
private static native void __call1173_92(net.minecraft.world.border.WorldBorder a0, double a1) throws Throwable;
private static native java.lang.Double __call1173_93(double a0) throws Throwable;
private static native java.lang.String __call1173_94(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.Double __call1173_95(double a0) throws Throwable;
private static native java.lang.String __call1173_96(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __call1173_97(net.minecraft.command.ICommandSender a0, moom.qf a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native boolean __call1173_98(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1173_99(boolean value) throws Throwable;
private static native int __call1173_100(java.lang.String a0, int a1) throws Throwable;
private static native boolean __call1173_101(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1173_102(boolean value) throws Throwable;
private static native int __call1173_103(net.minecraft.world.border.WorldBorder a0) throws Throwable;
private static native void __call1173_104(net.minecraft.world.border.WorldBorder a0, int a1) throws Throwable;
private static native java.lang.Integer __call1173_105(int a0) throws Throwable;
private static native java.lang.Integer __call1173_106(int a0) throws Throwable;
private static native void __call1173_107(net.minecraft.command.ICommandSender a0, moom.qf a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native boolean __call1173_108(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1173_109(boolean value) throws Throwable;
private static native int __call1173_110(net.minecraft.world.border.WorldBorder a0) throws Throwable;
private static native void __call1173_111(net.minecraft.world.border.WorldBorder a0, int a1) throws Throwable;
private static native java.lang.Integer __call1173_112(int a0) throws Throwable;
private static native java.lang.Integer __call1173_113(int a0) throws Throwable;
private static native void __call1173_114(net.minecraft.command.ICommandSender a0, moom.qf a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native boolean __call1173_115(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1173_116(boolean value) throws Throwable;
private static native double __call1173_117(net.minecraft.world.border.WorldBorder a0) throws Throwable;
private static native net.minecraft.command.CommandResultStats$Type __fieldRead1173_118() throws Throwable;
private static native int __call1173_119(double a0) throws Throwable;
private static native void __call1173_120(net.minecraft.command.ICommandSender a0, net.minecraft.command.CommandResultStats$Type a1, int a2) throws Throwable;
private static native java.lang.Double __call1173_121(double a0) throws Throwable;
private static native java.lang.String __call1173_122(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __call1173_123(net.minecraft.command.ICommandSender a0, moom.CN a1) throws Throwable;
private static native java.lang.Exception __call1117300_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117301_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117302_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117303_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117304_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117305_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117306_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117307_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117308_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117309_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117310_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117311_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117312_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117313_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117314_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117315_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117316_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117317_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117318_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117319_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117320_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117321_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117322_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117323_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117324_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117325_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117326_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117327_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117328_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117329_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117330_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117331_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117332_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117333_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117334_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117335_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117336_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117337_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117338_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117339_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117340_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117341_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117342_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117343_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117344_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117345_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117346_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117347_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117348_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117349_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117350_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117351_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117352_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117353_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117354_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117355_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117356_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117357_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117358_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117359_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117360_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1117361_0(moom.b7 a0) throws Throwable;

}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(8151071951205293974L)), ((long)(8704596477477166421L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(233980482386050L)))));
    long local11_life6 = (moom.qf.c ^ 4072789034941L);
    javax.crypto.Cipher local13_life8;
    javax.crypto.Cipher __sourceSpill978_10 = (local13_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill978_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill978_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill978_13 = new byte[8];
    (__sourceSpill978_13)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local14_life14 = 1;
    while ((local14_life14 < 8)) {
        (__sourceSpill978_13)[local14_life14] = ((byte) ((int) ((local11_life6 << (local14_life14 * 8)) >>> 56)));
        local14_life14 += 1;
    }
    byte[] __sourcePreallocation978_15 = __sourceSpill978_13;
    ((javax.crypto.Cipher)(__sourceSpill978_10)).init(((int)(__sourceSpill978_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill978_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation978_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local15_life18 = 6799846092101953166L;
    byte[] __sourceSpill978_19 = new byte[8];
    (__sourceSpill978_19)[0] = ((byte) ((int) (local15_life18 >>> 56)));
    (__sourceSpill978_19)[1] = ((byte) ((int) (local15_life18 >>> 48)));
    (__sourceSpill978_19)[2] = ((byte) ((int) (local15_life18 >>> 40)));
    (__sourceSpill978_19)[3] = ((byte) ((int) (local15_life18 >>> 32)));
    (__sourceSpill978_19)[4] = ((byte) ((int) (local15_life18 >>> 24)));
    (__sourceSpill978_19)[5] = ((byte) ((int) (local15_life18 >>> 16)));
    (__sourceSpill978_19)[6] = ((byte) ((int) (local15_life18 >>> 8)));
    (__sourceSpill978_19)[7] = ((byte) ((int) local15_life18));
    javax.crypto.Cipher __sourceSpill978_20 = local13_life8;
    byte[] local17_life22 = ((javax.crypto.Cipher)(__sourceSpill978_20)).doFinal(((byte[])(__sourceSpill978_19)));
    d = ((long)((((((((((((long) (local17_life22)[0]) & 255L) << 56) | ((((long) (local17_life22)[1]) & 255L) << 48)) | ((((long) (local17_life22)[2]) & 255L) << 40)) | ((((long) (local17_life22)[3]) & 255L) << 32)) | ((((long) (local17_life22)[4]) & 255L) << 24)) | ((((long) (local17_life22)[5]) & 255L) << 16)) | ((((long) (local17_life22)[6]) & 255L) << 8)) | (((long) (local17_life22)[7]) & 255L))));
    k = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life26;
    javax.crypto.Cipher __sourceSpill978_28 = (local0_life26 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill978_29 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill978_30 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill978_31 = new byte[8];
    (__sourceSpill978_31)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life32 = 1;
    while ((local1_life32 < 8)) {
        (__sourceSpill978_31)[local1_life32] = ((byte) ((int) ((local11_life6 << (local1_life32 * 8)) >>> 56)));
        local1_life32 += 1;
    }
    byte[] __sourcePreallocation978_33 = __sourceSpill978_31;
    ((javax.crypto.Cipher)(__sourceSpill978_28)).init(((int)(__sourceSpill978_29)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill978_30)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation978_33)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life36 = new long[4];
    int local3_life37 = 0;
    java.lang.String local4_life38;
    int local5_life40 = ((java.lang.String)((local4_life38 = "¤\025c`^i±ú\032ÍbbE&"))).length();
    int local2_life41 = 0;
    do {
        java.lang.String __sourceSpill978_42 = local4_life38;
        int __sourceSpill978_43 = local2_life41;
        local2_life41 += 8;
        byte[] local7_life46 = ((java.lang.String)(((java.lang.String)(__sourceSpill978_42)).substring(((int)(__sourceSpill978_43)), ((int)(local2_life41))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill978_47 = local6_life36;
        int __sourceSpill978_48 = local3_life37;
        local3_life37 += 1;
        long local8_life49 = (((((((((((long) (local7_life46)[0]) & 255L) << 56) | ((((long) (local7_life46)[1]) & 255L) << 48)) | ((((long) (local7_life46)[2]) & 255L) << 40)) | ((((long) (local7_life46)[3]) & 255L) << 32)) | ((((long) (local7_life46)[4]) & 255L) << 24)) | ((((long) (local7_life46)[5]) & 255L) << 16)) | ((((long) (local7_life46)[6]) & 255L) << 8)) | (((long) (local7_life46)[7]) & 255L));
        byte[] __sourceSpill978_50 = new byte[8];
        (__sourceSpill978_50)[0] = ((byte) ((int) (local8_life49 >>> 56)));
        (__sourceSpill978_50)[1] = ((byte) ((int) (local8_life49 >>> 48)));
        (__sourceSpill978_50)[2] = ((byte) ((int) (local8_life49 >>> 40)));
        (__sourceSpill978_50)[3] = ((byte) ((int) (local8_life49 >>> 32)));
        (__sourceSpill978_50)[4] = ((byte) ((int) (local8_life49 >>> 24)));
        (__sourceSpill978_50)[5] = ((byte) ((int) (local8_life49 >>> 16)));
        (__sourceSpill978_50)[6] = ((byte) ((int) (local8_life49 >>> 8)));
        (__sourceSpill978_50)[7] = ((byte) ((int) local8_life49));
        javax.crypto.Cipher __sourceSpill978_51 = local0_life26;
        byte[] local10_life53 = ((javax.crypto.Cipher)(__sourceSpill978_51)).doFinal(((byte[])(__sourceSpill978_50)));
        (__sourceSpill978_47)[__sourceSpill978_48] = (((((((((((long) (local10_life53)[0]) & 255L) << 56) | ((((long) (local10_life53)[1]) & 255L) << 48)) | ((((long) (local10_life53)[2]) & 255L) << 40)) | ((((long) (local10_life53)[3]) & 255L) << 32)) | ((((long) (local10_life53)[4]) & 255L) << 24)) | ((((long) (local10_life53)[5]) & 255L) << 16)) | ((((long) (local10_life53)[6]) & 255L) << 8)) | (((long) (local10_life53)[7]) & 255L));
    } while ((!(local2_life41 >= local5_life40)));
    local5_life40 = ((java.lang.String)((local4_life38 = "j4haLò\nXÑm>+ØP\007"))).length();
    local2_life41 = 0;
    do {
        java.lang.String __sourceSpill978_55 = local4_life38;
        int __sourceSpill978_56 = local2_life41;
        local2_life41 += 8;
        byte[] local7_life59 = ((java.lang.String)(((java.lang.String)(__sourceSpill978_55)).substring(((int)(__sourceSpill978_56)), ((int)(local2_life41))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill978_60 = local6_life36;
        int __sourceSpill978_61 = local3_life37;
        local3_life37 += 1;
        long local8_life62 = (((((((((((long) (local7_life59)[0]) & 255L) << 56) | ((((long) (local7_life59)[1]) & 255L) << 48)) | ((((long) (local7_life59)[2]) & 255L) << 40)) | ((((long) (local7_life59)[3]) & 255L) << 32)) | ((((long) (local7_life59)[4]) & 255L) << 24)) | ((((long) (local7_life59)[5]) & 255L) << 16)) | ((((long) (local7_life59)[6]) & 255L) << 8)) | (((long) (local7_life59)[7]) & 255L));
        byte[] __sourceSpill978_63 = new byte[8];
        (__sourceSpill978_63)[0] = ((byte) ((int) (local8_life62 >>> 56)));
        (__sourceSpill978_63)[1] = ((byte) ((int) (local8_life62 >>> 48)));
        (__sourceSpill978_63)[2] = ((byte) ((int) (local8_life62 >>> 40)));
        (__sourceSpill978_63)[3] = ((byte) ((int) (local8_life62 >>> 32)));
        (__sourceSpill978_63)[4] = ((byte) ((int) (local8_life62 >>> 24)));
        (__sourceSpill978_63)[5] = ((byte) ((int) (local8_life62 >>> 16)));
        (__sourceSpill978_63)[6] = ((byte) ((int) (local8_life62 >>> 8)));
        (__sourceSpill978_63)[7] = ((byte) ((int) local8_life62));
        javax.crypto.Cipher __sourceSpill978_64 = local0_life26;
        byte[] local10_life66 = ((javax.crypto.Cipher)(__sourceSpill978_64)).doFinal(((byte[])(__sourceSpill978_63)));
        (__sourceSpill978_60)[__sourceSpill978_61] = (((((((((((long) (local10_life66)[0]) & 255L) << 56) | ((((long) (local10_life66)[1]) & 255L) << 48)) | ((((long) (local10_life66)[2]) & 255L) << 40)) | ((((long) (local10_life66)[3]) & 255L) << 32)) | ((((long) (local10_life66)[4]) & 255L) << 24)) | ((((long) (local10_life66)[5]) & 255L) << 16)) | ((((long) (local10_life66)[6]) & 255L) << 8)) | (((long) (local10_life66)[7]) & 255L));
    } while ((!(local2_life41 >= local5_life40)));
    e = ((long[])(local6_life36));
    g = ((java.lang.Long[])(new java.lang.Long[4]));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8833_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/qf"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static long b(int p0, long p1) {
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 2259);
    if (((moom.qf.g)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (moom.qf.e)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(moom.qf.k)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.qf.k)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/qf", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (moom.qf.g)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((moom.qf.g)[life3_8])).longValue();
}


private static long b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = moom.qf.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public int a() {
return 2;
}


public java.lang.String a__String() {
return "worldborder";
}


public java.util.List<java.lang.String> a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) { return __sourceHandlerCall_818c176027b363f226dc(this, p0, p1, p2); }


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.worldborder.usage";
}


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 { __sourceHandlerCall_dcd55145af051025b96e(this, p0, p1); }


protected net.minecraft.world.border.WorldBorder a__Fi() {
return ((net.minecraft.world.WorldServer)((((moom.Bl)(moom.Bl.a__Bl())).n)[0])).a__Fi();
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8833_0() throws E;
}
