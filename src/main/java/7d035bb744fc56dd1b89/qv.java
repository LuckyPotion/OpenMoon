package moom;


public class qv extends net.minecraft.command.CommandBase {

private static long c;

public qv() {
super();
}


static {
moom.qv.c = (moom._c.a(-4698539135518541009L, -4493543659917584276L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(119541232226714L);
}

private static native <E extends Throwable> void __sourceHandlerCall_9a3115836f0d57b03f2a(moom.qv a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws E;
private static final class __SourceHandler_9a3115836f0d57b03f2a {

public static void f497(moom.qv receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws Throwable {
    net.minecraft.server.management.ServerConfigurationManager forestValue497_23_0;
    net.minecraft.world.WorldServer forestValue497_44_0;
    int forestValue497_71_0;
    int forestValue497_83_0;
    net.minecraft.world.WorldServer forestValue497_102_0;
    net.minecraft.world.WorldServer forestValue497_118_0;
    net.minecraft.world.WorldServer forestValue497_125_0;
    net.minecraft.command.ICommandSender forestValue497_154_0;
    int spill497_0;
    net.minecraft.server.management.ServerConfigurationManager spill497_1;
    net.minecraft.world.WorldServer spill497_2;
    int spill497_3;
    moom.Bl spill497_4;
    net.minecraft.world.WorldServer spill497_5;
    moom.Bl spill497_6;
    net.minecraft.world.WorldServer spill497_7;
    long life3_3;
    moom.Bl life6_6;
    int life5_7;
    int life7_30;
    net.minecraft.world.WorldServer life8_57;
    int life9_60;
    int life7_106;
    net.minecraft.world.WorldServer life8_133;
    int life9_136;
    net.minecraft.world.WorldServer life8_161;
    int life9_164;
    forest_join_161: {
    forest_join_154: {
    forest_join_153: {
    forest_join_118: {
    forest_join_83: {
    forest_join_71: {
    forest_join_61: {
    forest_join_24: {
    forest_join_23: {
    life3_3 = (__fieldRead497_0() ^ 5869762745850L);
    spill497_0 = __call497_1();
    life6_6 = __call497_2();
    life5_7 = spill497_0;
    __call497_3(p0, new moom.CN("commands.save.start", new java.lang.Object[0]));
    spill497_1 = __call497_4(life6_6);
    if (!((life5_7 != 0))) {
        forestValue497_23_0 = spill497_1;
        break forest_join_23;
    }
    if (!((spill497_1 != null))) {
        break forest_join_24;
    }
    forestValue497_23_0 = __call497_5(life6_6);
    }
    __call497_6(forestValue497_23_0);
    }
    life7_30 = 0;
    forest_cycle_26: while (true) {
    forest_join_58: {
    forest_join_44: {
    if (!((life7_30 < (__fieldRead497_7(life6_6)).length))) {
        break forest_join_61;
    }
    spill497_2 = (__fieldRead497_8(life6_6))[life7_30];
    if (!((life5_7 != 0))) {
        forestValue497_118_0 = spill497_2;
        break forest_join_118;
    }
    if (!((life5_7 != 0))) {
        forestValue497_44_0 = spill497_2;
        break forest_join_44;
    }
    if (!((spill497_2 != null))) {
        break forest_join_58;
    }
    forestValue497_44_0 = (__fieldRead497_9(life6_6))[life7_30];
    }
    life8_57 = forestValue497_44_0;
    life9_60 = __integerCategory497_11(__fieldRead497_10(life8_57));
    __fieldWrite497_12(life8_57, 0);
    __call497_13(life8_57, 1, null);
    __fieldWrite497_14(life8_57, life9_60);
    }
    life7_30 += 1;
    if (!((life5_7 == 0))) {
        continue forest_cycle_26;
    }
    break forest_cycle_26;
    }
    }
    spill497_3 = (p1).length;
    if (!((life5_7 != 0))) {
        forestValue497_71_0 = spill497_3;
        break forest_join_71;
    }
    if (!((spill497_3 > 0))) {
        break forest_join_161;
    }
    forestValue497_71_0 = __integerCategory497_16(__call497_15("flush", (p1)[0]));
    }
    if (!((life5_7 != 0))) {
        forestValue497_83_0 = forestValue497_71_0;
        break forest_join_83;
    }
    if (!((forestValue497_71_0 != 0))) {
        break forest_join_161;
    }
    __call497_17(p0, new moom.CN("commands.save.flushStart", new java.lang.Object[0]));
    forestValue497_83_0 = 0;
    }
    life7_106 = forestValue497_83_0;
    forest_cycle_84: while (true) {
    forest_join_114: {
    forest_join_102: {
    if (!((life7_106 < (__fieldRead497_18(life6_6)).length))) {
        break forest_join_153;
    }
    spill497_4 = life6_6;
    if (!((life5_7 != 0))) {
        forestValue497_154_0 = spill497_4;
        break forest_join_154;
    }
    spill497_5 = (__fieldRead497_19(spill497_4))[life7_106];
    if (!((life5_7 != 0))) {
        forestValue497_102_0 = spill497_5;
        break forest_join_102;
    }
    if (!((spill497_5 != null))) {
        break forest_join_114;
    }
    forestValue497_102_0 = (__fieldRead497_20(life6_6))[life7_106];
    }
    life8_133 = forestValue497_102_0;
    life9_136 = __integerCategory497_22(__fieldRead497_21(life8_133));
    __fieldWrite497_23(life8_133, 0);
    __call497_24(life8_133);
    __fieldWrite497_25(life8_133, life9_136);
    }
    life7_106 += 1;
    if (!((life5_7 == 0))) {
        continue forest_cycle_84;
    }
    break forest_cycle_84;
    }
    break forest_join_153;
    }
    forest_cycle_118: while (true) {
    forest_join_141: {
    forest_join_137: {
    forest_join_125: {
    if (!((life5_7 != 0))) {
        forestValue497_125_0 = forestValue497_118_0;
        break forest_join_125;
    }
    if (!((forestValue497_118_0 != null))) {
        break forest_join_137;
    }
    forestValue497_125_0 = (__fieldRead497_26(life6_6))[life7_30];
    }
    life8_161 = forestValue497_125_0;
    life9_164 = __integerCategory497_28(__fieldRead497_27(life8_161));
    __fieldWrite497_29(life8_161, 0);
    __call497_30(life8_161);
    __fieldWrite497_31(life8_161, life9_164);
    }
    life7_30 += 1;
    if (!((life5_7 == 0))) {
        break forest_join_141;
    }
    break forest_join_153;
    }
    if (!((life7_30 < (__fieldRead497_32(life6_6)).length))) {
        break forest_join_153;
    }
    spill497_6 = life6_6;
    if (!((life5_7 != 0))) {
        forestValue497_154_0 = spill497_6;
        break forest_join_154;
    }
    spill497_7 = (__fieldRead497_33(spill497_6))[life7_30];
    forestValue497_118_0 = spill497_7;
    continue forest_cycle_118;
    }
    }
    forestValue497_154_0 = p0;
    }
    __call497_34(forestValue497_154_0, new moom.CN("commands.save.flushEnd", new java.lang.Object[0]));
    }
    __call497_35(p0, receiver, "commands.save.success", new java.lang.Object[0]);
    return;
}
public static void h497_0(net.minecraft.world.MinecraftException p0) throws Throwable {
    throw __call3049700_0(p0);
}
public static void h497_1(net.minecraft.world.MinecraftException p0) throws Throwable {
    throw __call3049701_0(p0);
}
public static void h497_2(net.minecraft.world.MinecraftException p0) throws Throwable {
    throw __call3049702_0(p0);
}
public static void h497_3(net.minecraft.world.MinecraftException p0) throws Throwable {
    throw __call3049703_0(p0);
}
public static void h497_4(net.minecraft.world.MinecraftException p0) throws Throwable {
    throw __call3049704_0(p0);
}
public static void h497_5(net.minecraft.world.MinecraftException p0) throws Throwable {
    throw __call3049705_0(p0);
}
public static void h497_6(net.minecraft.world.MinecraftException p0) throws Throwable {
    throw __call3049706_0(p0);
}
public static void h497_7(net.minecraft.world.MinecraftException p0) throws Throwable {
    throw __call3049707_0(p0);
}
public static void h497_8(net.minecraft.world.MinecraftException p0) throws Throwable {
    throw __call3049708_0(p0);
}
public static void h497_9(net.minecraft.world.MinecraftException p0) throws Throwable {
    throw __call3049709_0(p0);
}
public static void h497_10(net.minecraft.world.MinecraftException p0) throws Throwable {
    throw __call3049710_0(p0);
}
public static void h497_11(net.minecraft.world.MinecraftException p0) throws Throwable {
    throw __call3049711_0(p0);
}
public static void h497_12(net.minecraft.world.MinecraftException p0, moom.qv p1, net.minecraft.command.ICommandSender p2, int p3) throws Throwable {
    net.minecraft.command.ICommandSender spill3049712_0;
    moom.qv spill3049712_1;
    java.lang.String spill3049712_2;
    java.lang.Object[] spill3049712_3;
    net.minecraft.world.MinecraftException life3_2;
    life3_2 = p0;
    spill3049712_0 = p2;
    spill3049712_1 = p1;
    spill3049712_2 = "commands.save.failed";
    java.lang.Object[] __stackOp3049712_0_0 = new java.lang.Object[1];
    spill3049712_3 = __stackOp3049712_0_0;
    (__stackOp3049712_0_0)[0] = __call3049712_1(life3_2);
    __call3049712_2(spill3049712_0, spill3049712_1, spill3049712_2, spill3049712_3);
    return;
}
private static native long __fieldRead497_0() throws Throwable;
private static native int __call497_1() throws Throwable;
private static native moom.Bl __call497_2() throws Throwable;
private static native void __call497_3(net.minecraft.command.ICommandSender a0, moom.CN a1) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call497_4(moom.Bl a0) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call497_5(moom.Bl a0) throws Throwable;
private static native void __call497_6(net.minecraft.server.management.ServerConfigurationManager a0) throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead497_7(moom.Bl a0) throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead497_8(moom.Bl a0) throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead497_9(moom.Bl a0) throws Throwable;
private static native boolean __fieldRead497_10(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __integerCategory497_11(boolean value) throws Throwable;
private static native void __fieldWrite497_12(net.minecraft.world.WorldServer a0, int a1) throws Throwable;
private static native void __call497_13(net.minecraft.world.WorldServer a0, int a1, java.lang.Object a2) throws Throwable;
private static native void __fieldWrite497_14(net.minecraft.world.WorldServer a0, int a1) throws Throwable;
private static native boolean __call497_15(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory497_16(boolean value) throws Throwable;
private static native void __call497_17(net.minecraft.command.ICommandSender a0, moom.CN a1) throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead497_18(moom.Bl a0) throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead497_19(moom.Bl a0) throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead497_20(moom.Bl a0) throws Throwable;
private static native boolean __fieldRead497_21(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __integerCategory497_22(boolean value) throws Throwable;
private static native void __fieldWrite497_23(net.minecraft.world.WorldServer a0, int a1) throws Throwable;
private static native void __call497_24(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __fieldWrite497_25(net.minecraft.world.WorldServer a0, int a1) throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead497_26(moom.Bl a0) throws Throwable;
private static native boolean __fieldRead497_27(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __integerCategory497_28(boolean value) throws Throwable;
private static native void __fieldWrite497_29(net.minecraft.world.WorldServer a0, int a1) throws Throwable;
private static native void __call497_30(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __fieldWrite497_31(net.minecraft.world.WorldServer a0, int a1) throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead497_32(moom.Bl a0) throws Throwable;
private static native net.minecraft.world.WorldServer[] __fieldRead497_33(moom.Bl a0) throws Throwable;
private static native void __call497_34(net.minecraft.command.ICommandSender a0, moom.CN a1) throws Throwable;
private static native void __call497_35(net.minecraft.command.ICommandSender a0, moom.qv a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native net.minecraft.world.MinecraftException __call3049700_0(net.minecraft.world.MinecraftException a0) throws Throwable;
private static native net.minecraft.world.MinecraftException __call3049701_0(net.minecraft.world.MinecraftException a0) throws Throwable;
private static native net.minecraft.world.MinecraftException __call3049702_0(net.minecraft.world.MinecraftException a0) throws Throwable;
private static native net.minecraft.world.MinecraftException __call3049703_0(net.minecraft.world.MinecraftException a0) throws Throwable;
private static native net.minecraft.world.MinecraftException __call3049704_0(net.minecraft.world.MinecraftException a0) throws Throwable;
private static native net.minecraft.world.MinecraftException __call3049705_0(net.minecraft.world.MinecraftException a0) throws Throwable;
private static native net.minecraft.world.MinecraftException __call3049706_0(net.minecraft.world.MinecraftException a0) throws Throwable;
private static native net.minecraft.world.MinecraftException __call3049707_0(net.minecraft.world.MinecraftException a0) throws Throwable;
private static native net.minecraft.world.MinecraftException __call3049708_0(net.minecraft.world.MinecraftException a0) throws Throwable;
private static native net.minecraft.world.MinecraftException __call3049709_0(net.minecraft.world.MinecraftException a0) throws Throwable;
private static native net.minecraft.world.MinecraftException __call3049710_0(net.minecraft.world.MinecraftException a0) throws Throwable;
private static native net.minecraft.world.MinecraftException __call3049711_0(net.minecraft.world.MinecraftException a0) throws Throwable;
private static native java.lang.String __call3049712_1(net.minecraft.world.MinecraftException a0) throws Throwable;
private static native void __call3049712_2(net.minecraft.command.ICommandSender a0, moom.qv a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;

}


private static net.minecraft.world.MinecraftException a(net.minecraft.world.MinecraftException p0) {
return p0;
}


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 { __sourceHandlerCall_9a3115836f0d57b03f2a(this, p0, p1); }


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.save.usage";
}


public java.lang.String a__String() {
return "save-all";
}

}
