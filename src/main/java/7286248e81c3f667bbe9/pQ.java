package moom;


public class pQ extends net.minecraft.command.CommandBase {

private static long c;

public pQ() {
super();
}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_fb0ef89d76de5cec432f(moom.pQ a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, moom.DT a3) throws E;
private static final class __SourceHandler_fb0ef89d76de5cec432f {

public static java.util.List f1117(moom.pQ receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) throws Throwable {
    java.lang.String[] forwardValue1117_13_0;
    java.util.List forwardValue1117_34_0;
    java.lang.String[] spill1117_0;
    long life4_3;
    int life6_5;
    forward_join_34: {
    forward_join_33: {
    forward_join_13: {
    life4_3 = (__fieldRead1117_0() ^ 111562270566043L);
    life6_5 = __integerCategory1117_2(__call1117_1());
    spill1117_0 = p1;
    if (!((life6_5 != 0))) {
        forwardValue1117_13_0 = spill1117_0;
        break forward_join_13;
    }
    if (!(((spill1117_0).length == 1))) {
        break forward_join_33;
    }
    forwardValue1117_13_0 = p1;
    }
    forwardValue1117_34_0 = __call1117_3(forwardValue1117_13_0, new java.lang.String[] {"peaceful", "easy", "normal", "hard"});
    break forward_join_34;
    }
    forwardValue1117_34_0 = null;
    }
    return forwardValue1117_34_0;
}
public static void h1117_0(moom.Oo p0) throws Throwable {
    throw __call1111700_0(p0);
}
public static void h1117_1(moom.Oo p0) throws Throwable {
    throw __call1111701_0(p0);
}
private static native long __fieldRead1117_0() throws Throwable;
private static native boolean __call1117_1() throws Throwable;
private static native int __integerCategory1117_2(boolean value) throws Throwable;
private static native java.util.List __call1117_3(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.Exception __call1111700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1111701_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.world.EnumDifficulty __sourceHandlerCall_6810712fa4a8c0a8b46c(moom.pQ a0, java.lang.String a1) throws E;
private static final class __SourceHandler_6810712fa4a8c0a8b46c {

public static net.minecraft.world.EnumDifficulty f1116(moom.pQ receiver, java.lang.String p0) throws Throwable {
    int forwardValue1116_15_0;
    int forwardValue1116_21_0;
    int forwardValue1116_27_0;
    int forwardValue1116_33_0;
    int forwardValue1116_39_0;
    int forwardValue1116_45_0;
    int forwardValue1116_51_0;
    int forwardValue1116_58_0;
    net.minecraft.world.EnumDifficulty forwardValue1116_67_0;
    boolean spill1116_0;
    long life2_3;
    int life4_5;
    forward_join_67: {
    forward_join_66: {
    forward_join_64: {
    forward_join_62: {
    forward_join_60: {
    forward_join_58: {
    forward_join_51: {
    forward_join_45: {
    forward_join_39: {
    forward_join_33: {
    forward_join_27: {
    forward_join_21: {
    forward_join_15: {
    life2_3 = (__fieldRead1116_0() ^ 48342164878277L);
    life4_5 = __integerCategory1116_2(__call1116_1());
    spill1116_0 = __call1116_3(p0, "peaceful");
    if (!((life4_5 != 0))) {
        forwardValue1116_15_0 = __integerCategory1116_4(spill1116_0);
        break forward_join_15;
    }
    if (!((!spill1116_0))) {
        break forward_join_66;
    }
    forwardValue1116_15_0 = __integerCategory1116_6(__call1116_5(p0, "p"));
    }
    if (!((life4_5 != 0))) {
        forwardValue1116_21_0 = forwardValue1116_15_0;
        break forward_join_21;
    }
    if (!((forwardValue1116_15_0 == 0))) {
        break forward_join_66;
    }
    forwardValue1116_21_0 = __integerCategory1116_8(__call1116_7(p0, "easy"));
    }
    if (!((life4_5 != 0))) {
        forwardValue1116_27_0 = forwardValue1116_21_0;
        break forward_join_27;
    }
    if (!((forwardValue1116_21_0 == 0))) {
        break forward_join_64;
    }
    forwardValue1116_27_0 = __integerCategory1116_10(__call1116_9(p0, "e"));
    }
    if (!((life4_5 != 0))) {
        forwardValue1116_33_0 = forwardValue1116_27_0;
        break forward_join_33;
    }
    if (!((forwardValue1116_27_0 == 0))) {
        break forward_join_64;
    }
    forwardValue1116_33_0 = __integerCategory1116_12(__call1116_11(p0, "normal"));
    }
    if (!((life4_5 != 0))) {
        forwardValue1116_39_0 = forwardValue1116_33_0;
        break forward_join_39;
    }
    if (!((forwardValue1116_33_0 == 0))) {
        break forward_join_62;
    }
    forwardValue1116_39_0 = __integerCategory1116_14(__call1116_13(p0, "n"));
    }
    if (!((life4_5 != 0))) {
        forwardValue1116_45_0 = forwardValue1116_39_0;
        break forward_join_45;
    }
    if (!((forwardValue1116_39_0 == 0))) {
        break forward_join_62;
    }
    forwardValue1116_45_0 = __integerCategory1116_16(__call1116_15(p0, "hard"));
    }
    if (!((life4_5 != 0))) {
        forwardValue1116_51_0 = forwardValue1116_45_0;
        break forward_join_51;
    }
    if (!((forwardValue1116_45_0 == 0))) {
        break forward_join_60;
    }
    forwardValue1116_51_0 = __integerCategory1116_18(__call1116_17(p0, "h"));
    }
    if (!((life4_5 != 0))) {
        forwardValue1116_58_0 = forwardValue1116_51_0;
        break forward_join_58;
    }
    if (!((forwardValue1116_51_0 == 0))) {
        break forward_join_60;
    }
    forwardValue1116_58_0 = __call1116_19(p0, 0, 3);
    }
    forwardValue1116_67_0 = __call1116_20(forwardValue1116_58_0);
    break forward_join_67;
    }
    forwardValue1116_67_0 = __fieldRead1116_21();
    break forward_join_67;
    }
    forwardValue1116_67_0 = __fieldRead1116_22();
    break forward_join_67;
    }
    forwardValue1116_67_0 = __fieldRead1116_23();
    break forward_join_67;
    }
    forwardValue1116_67_0 = __fieldRead1116_24();
    }
    return forwardValue1116_67_0;
}
public static void h1116_0(moom.b7 p0) throws Throwable {
    throw __call1111600_0(p0);
}
public static void h1116_1(moom.b7 p0) throws Throwable {
    throw __call1111601_0(p0);
}
public static void h1116_2(moom.b7 p0) throws Throwable {
    throw __call1111602_0(p0);
}
public static void h1116_3(moom.b7 p0) throws Throwable {
    throw __call1111603_0(p0);
}
public static void h1116_4(moom.b7 p0) throws Throwable {
    throw __call1111604_0(p0);
}
public static void h1116_5(moom.b7 p0) throws Throwable {
    throw __call1111605_0(p0);
}
public static void h1116_6(moom.b7 p0) throws Throwable {
    throw __call1111606_0(p0);
}
public static void h1116_7(moom.b7 p0) throws Throwable {
    throw __call1111607_0(p0);
}
public static void h1116_8(moom.b7 p0) throws Throwable {
    throw __call1111608_0(p0);
}
public static void h1116_9(moom.b7 p0) throws Throwable {
    throw __call1111609_0(p0);
}
public static void h1116_10(moom.b7 p0) throws Throwable {
    throw __call1111610_0(p0);
}
public static void h1116_11(moom.b7 p0) throws Throwable {
    throw __call1111611_0(p0);
}
public static void h1116_12(moom.b7 p0) throws Throwable {
    throw __call1111612_0(p0);
}
public static void h1116_13(moom.b7 p0) throws Throwable {
    throw __call1111613_0(p0);
}
public static void h1116_14(moom.b7 p0) throws Throwable {
    throw __call1111614_0(p0);
}
public static void h1116_15(moom.b7 p0) throws Throwable {
    throw __call1111615_0(p0);
}
private static native long __fieldRead1116_0() throws Throwable;
private static native boolean __call1116_1() throws Throwable;
private static native int __integerCategory1116_2(boolean value) throws Throwable;
private static native boolean __call1116_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1116_4(boolean value) throws Throwable;
private static native boolean __call1116_5(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1116_6(boolean value) throws Throwable;
private static native boolean __call1116_7(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1116_8(boolean value) throws Throwable;
private static native boolean __call1116_9(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1116_10(boolean value) throws Throwable;
private static native boolean __call1116_11(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1116_12(boolean value) throws Throwable;
private static native boolean __call1116_13(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1116_14(boolean value) throws Throwable;
private static native boolean __call1116_15(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1116_16(boolean value) throws Throwable;
private static native boolean __call1116_17(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1116_18(boolean value) throws Throwable;
private static native int __call1116_19(java.lang.String a0, int a1, int a2) throws Throwable;
private static native net.minecraft.world.EnumDifficulty __call1116_20(int a0) throws Throwable;
private static native net.minecraft.world.EnumDifficulty __fieldRead1116_21() throws Throwable;
private static native net.minecraft.world.EnumDifficulty __fieldRead1116_22() throws Throwable;
private static native net.minecraft.world.EnumDifficulty __fieldRead1116_23() throws Throwable;
private static native net.minecraft.world.EnumDifficulty __fieldRead1116_24() throws Throwable;
private static native java.lang.Exception __call1111600_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1111601_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1111602_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1111603_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1111604_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1111605_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1111606_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1111607_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1111608_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1111609_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1111610_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1111611_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1111612_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1111613_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1111614_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1111615_0(moom.b7 a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_64033148e35a1a7298d7(moom.pQ a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws E;
private static final class __SourceHandler_64033148e35a1a7298d7 {

public static void f1934(moom.pQ receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws Throwable {
    long life3_3;
    net.minecraft.world.EnumDifficulty life5_21;
    life3_3 = (__fieldRead1934_0() ^ 37932323796760L);
    if (((p1).length == 0)) {
        throw new moom.cc("commands.difficulty.usage", new java.lang.Object[0]);
    }
    life5_21 = __call1934_1(receiver, (p1)[0]);
    __call1934_3(__call1934_2(), life5_21);
    __call1934_5(p0, receiver, "commands.difficulty.success", new java.lang.Object[] {new moom.CN(__call1934_4(life5_21), new java.lang.Object[0])});
    return;
}
public static void h1934_0(moom.b7 p0) throws Throwable {
    throw __call1193400_0(p0);
}
private static native long __fieldRead1934_0() throws Throwable;
private static native net.minecraft.world.EnumDifficulty __call1934_1(moom.pQ a0, java.lang.String a1) throws Throwable;
private static native moom.Bl __call1934_2() throws Throwable;
private static native void __call1934_3(moom.Bl a0, net.minecraft.world.EnumDifficulty a1) throws Throwable;
private static native java.lang.String __call1934_4(net.minecraft.world.EnumDifficulty a0) throws Throwable;
private static native void __call1934_5(net.minecraft.command.ICommandSender a0, moom.pQ a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native java.lang.Exception __call1193400_0(moom.b7 a0) throws Throwable;

}


static {
moom.pQ.c = (moom._c.a(820226944577017852L, -4334642306118573756L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(253691748610229L);
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public java.util.List<java.lang.String> a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) { return __sourceHandlerCall_fb0ef89d76de5cec432f(this, p0, p1, p2); }


protected net.minecraft.world.EnumDifficulty a__sourceReturn_5101f3edd8(java.lang.String p0) throws moom.b7 { return __sourceHandlerCall_6810712fa4a8c0a8b46c(this, p0); }


public java.lang.String a__String() {
return "difficulty";
}


public int a() {
return 2;
}


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.difficulty.usage";
}


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 { __sourceHandlerCall_64033148e35a1a7298d7(this, p0, p1); }

}
