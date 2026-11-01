package moom;


public class qn extends net.minecraft.command.CommandBase {

private static long c;

public qn() {
super();
}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_6f1964942dbfa363bd52(moom.qn a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, moom.DT a3) throws E;
private static final class __SourceHandler_6f1964942dbfa363bd52 {

public static java.util.List f1194(moom.qn receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) throws Throwable {
    java.lang.String[] forwardValue1194_13_0;
    java.util.List forwardValue1194_26_0;
    java.lang.String[] spill1194_0;
    long life4_3;
    int life6_5;
    forward_join_26: {
    forward_join_25: {
    forward_join_13: {
    life4_3 = (__fieldRead1194_0() ^ 51454272521370L);
    life6_5 = __call1194_1();
    spill1194_0 = p1;
    if (!((life6_5 != 0))) {
        forwardValue1194_13_0 = spill1194_0;
        break forward_join_13;
    }
    if (!(((spill1194_0).length == 1))) {
        break forward_join_25;
    }
    forwardValue1194_13_0 = p1;
    }
    forwardValue1194_26_0 = __call1194_2(forwardValue1194_13_0, new java.lang.String[] {"players", "ips"});
    break forward_join_26;
    }
    forwardValue1194_26_0 = null;
    }
    return forwardValue1194_26_0;
}
public static void h1194_0(moom.Oo p0) throws Throwable {
    throw __call1119400_0(p0);
}
public static void h1194_1(moom.Oo p0) throws Throwable {
    throw __call1119401_0(p0);
}
private static native long __fieldRead1194_0() throws Throwable;
private static native int __call1194_1() throws Throwable;
private static native java.util.List __call1194_2(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.Exception __call1119400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1119401_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_79b777189c27e245ca11(moom.qn a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws E;
private static final class __SourceHandler_79b777189c27e245ca11 {

public static void f1193(moom.qn receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws Throwable {
    long life3_3;
    int life5_5;
    forward_join_74: {
    forward_join_64: {
    forward_join_47: {
    life3_3 = (__fieldRead1193_0() ^ 116294603789593L);
    life5_5 = __call1193_1();
    if (!((life5_5 != 0))) { break forward_join_64; }
    if (!(((p1).length >= 1))) { break forward_join_47; }
    if (!(__call1193_2((p1)[0], "ips"))) { break forward_join_47; }
    __call1193_8(p0, new moom.CN("commands.banlist.ips", new java.lang.Object[] {__call1193_7((__call1193_6(__call1193_5(__call1193_4(__call1193_3())))).length)}));
    __call1193_14(p0, new moom.CM(__call1193_13(__call1193_12(__call1193_11(__call1193_10(__call1193_9()))))));
    if (!((life5_5 == 0))) { break forward_join_74; }
    }
    __call1193_20(p0, new moom.CN("commands.banlist.players", new java.lang.Object[] {__call1193_19((__call1193_18(__call1193_17(__call1193_16(__call1193_15())))).length)}));
    }
    __call1193_26(p0, new moom.CM(__call1193_25(__call1193_24(__call1193_23(__call1193_22(__call1193_21()))))));
    }
    return;
}
public static void h1193_0(moom.b7 p0) throws Throwable {
    throw __call1119300_0(p0);
}
public static void h1193_1(moom.b7 p0) throws Throwable {
    throw __call1119301_0(p0);
}
public static void h1193_2(moom.b7 p0) throws Throwable {
    throw __call1119302_0(p0);
}
public static void h1193_3(moom.b7 p0) throws Throwable {
    throw __call1119303_0(p0);
}
private static native long __fieldRead1193_0() throws Throwable;
private static native int __call1193_1() throws Throwable;
private static native boolean __call1193_2(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native moom.Bl __call1193_3() throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1193_4(moom.Bl a0) throws Throwable;
private static native moom.BE __call1193_5(net.minecraft.server.management.ServerConfigurationManager a0) throws Throwable;
private static native java.lang.String[] __call1193_6(moom.BE a0) throws Throwable;
private static native java.lang.Integer __call1193_7(int a0) throws Throwable;
private static native void __call1193_8(net.minecraft.command.ICommandSender a0, moom.CN a1) throws Throwable;
private static native moom.Bl __call1193_9() throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1193_10(moom.Bl a0) throws Throwable;
private static native moom.BE __call1193_11(net.minecraft.server.management.ServerConfigurationManager a0) throws Throwable;
private static native java.lang.String[] __call1193_12(moom.BE a0) throws Throwable;
private static native java.lang.String __call1193_13(java.lang.String[] a0) throws Throwable;
private static native void __call1193_14(net.minecraft.command.ICommandSender a0, moom.CM a1) throws Throwable;
private static native moom.Bl __call1193_15() throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1193_16(moom.Bl a0) throws Throwable;
private static native moom.BF __call1193_17(net.minecraft.server.management.ServerConfigurationManager a0) throws Throwable;
private static native java.lang.String[] __call1193_18(moom.BF a0) throws Throwable;
private static native java.lang.Integer __call1193_19(int a0) throws Throwable;
private static native void __call1193_20(net.minecraft.command.ICommandSender a0, moom.CN a1) throws Throwable;
private static native moom.Bl __call1193_21() throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1193_22(moom.Bl a0) throws Throwable;
private static native moom.BF __call1193_23(net.minecraft.server.management.ServerConfigurationManager a0) throws Throwable;
private static native java.lang.String[] __call1193_24(moom.BF a0) throws Throwable;
private static native java.lang.String __call1193_25(java.lang.String[] a0) throws Throwable;
private static native void __call1193_26(net.minecraft.command.ICommandSender a0, moom.CM a1) throws Throwable;
private static native java.lang.Exception __call1119300_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1119301_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1119302_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1119303_0(moom.b7 a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_caa26c3938b4fdc1e1c8(moom.qn a0, net.minecraft.command.ICommandSender a1) throws E;
private static final class __SourceHandler_caa26c3938b4fdc1e1c8 {

public static boolean f1195(moom.qn receiver, net.minecraft.command.ICommandSender p0) throws Throwable {
    int forwardValue1195_23_0;
    int forwardValue1195_27_0;
    int forwardValue1195_29_0;
    boolean spill1195_0;
    boolean spill1195_1;
    long life2_3;
    int life4_5;
    forward_join_29: {
    forward_join_28: {
    forward_join_27: {
    forward_join_23: {
    forward_join_20: {
    life2_3 = (__fieldRead1195_0() ^ 29749811500588L);
    life4_5 = __call1195_1();
    spill1195_0 = __call1195_5(__call1195_4(__call1195_3(__call1195_2())));
    if (!((life4_5 != 0))) {
        forwardValue1195_23_0 = __integerCategory1195_6(spill1195_0);
        break forward_join_23;
    }
    if (!((!spill1195_0))) {
        break forward_join_20;
    }
    spill1195_1 = __call1195_10(__call1195_9(__call1195_8(__call1195_7())));
    if (!((life4_5 != 0))) {
        forwardValue1195_23_0 = __integerCategory1195_11(spill1195_1);
        break forward_join_23;
    }
    if (!(spill1195_1)) {
        break forward_join_28;
    }
    }
    forwardValue1195_23_0 = __integerCategory1195_13(__call1195_12(receiver, p0));
    }
    if (!((life4_5 != 0))) {
        forwardValue1195_27_0 = forwardValue1195_23_0;
        break forward_join_27;
    }
    if (!((forwardValue1195_23_0 != 0))) {
        break forward_join_28;
    }
    forwardValue1195_27_0 = 1;
    }
    forwardValue1195_29_0 = forwardValue1195_27_0;
    break forward_join_29;
    }
    forwardValue1195_29_0 = 0;
    }
    return __integerCategory1195_14(forwardValue1195_29_0);
}
public static void h1195_0(moom.Oo p0) throws Throwable {
    throw __call1119500_0(p0);
}
public static void h1195_1(moom.Oo p0) throws Throwable {
    throw __call1119501_0(p0);
}
public static void h1195_2(moom.Oo p0) throws Throwable {
    throw __call1119502_0(p0);
}
public static void h1195_3(moom.Oo p0) throws Throwable {
    throw __call1119503_0(p0);
}
public static void h1195_4(moom.Oo p0) throws Throwable {
    throw __call1119504_0(p0);
}
private static native long __fieldRead1195_0() throws Throwable;
private static native int __call1195_1() throws Throwable;
private static native moom.Bl __call1195_2() throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1195_3(moom.Bl a0) throws Throwable;
private static native moom.BE __call1195_4(net.minecraft.server.management.ServerConfigurationManager a0) throws Throwable;
private static native boolean __call1195_5(moom.BE a0) throws Throwable;
private static native int __integerCategory1195_6(boolean value) throws Throwable;
private static native moom.Bl __call1195_7() throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1195_8(moom.Bl a0) throws Throwable;
private static native moom.BF __call1195_9(net.minecraft.server.management.ServerConfigurationManager a0) throws Throwable;
private static native boolean __call1195_10(moom.BF a0) throws Throwable;
private static native int __integerCategory1195_11(boolean value) throws Throwable;
private static native boolean __call1195_12(moom.qn a0, net.minecraft.command.ICommandSender a1) throws Throwable;
private static native int __integerCategory1195_13(boolean value) throws Throwable;
private static native boolean __integerCategory1195_14(int value) throws Throwable;
private static native java.lang.Exception __call1119500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1119501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1119502_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1119503_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1119504_0(moom.Oo a0) throws Throwable;

}


static {
moom.qn.c = (moom._c.a(-273972539170152318L, 4939655586036618916L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(23086838754514L);
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public java.util.List<java.lang.String> a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) { return __sourceHandlerCall_6f1964942dbfa363bd52(this, p0, p1, p2); }


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 { __sourceHandlerCall_79b777189c27e245ca11(this, p0, p1); }


public java.lang.String a__String() {
return "banlist";
}


public int a() {
return 3;
}


public boolean a__Boolean(net.minecraft.command.ICommandSender p0) { return __sourceHandlerCall_caa26c3938b4fdc1e1c8(this, p0); }


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.banlist.usage";
}

}
