package moom;


public class qs extends net.minecraft.command.CommandBase {

private static long c;

public qs() {
super();
}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_7690ff64d43a15a26a66(moom.qs a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, moom.DT a3) throws E;
private static final class __SourceHandler_7690ff64d43a15a26a66 {

public static java.util.List f1201(moom.qs receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) throws Throwable {
    java.lang.String[] forwardValue1201_13_0;
    java.util.List forwardValue1201_20_0;
    java.lang.String[] spill1201_0;
    long life4_3;
    int life6_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_13: {
    life4_3 = (__fieldRead1201_0() ^ 17466566105148L);
    life6_5 = __call1201_1();
    spill1201_0 = p1;
    if (!((life6_5 == 0))) {
        forwardValue1201_13_0 = spill1201_0;
        break forward_join_13;
    }
    if (!(((spill1201_0).length == 1))) {
        break forward_join_19;
    }
    forwardValue1201_13_0 = p1;
    }
    forwardValue1201_20_0 = __call1201_6(forwardValue1201_13_0, __call1201_5(__call1201_4(__call1201_3(__call1201_2()))));
    break forward_join_20;
    }
    forwardValue1201_20_0 = null;
    }
    return forwardValue1201_20_0;
}
public static void h1201_0(moom.Oo p0) throws Throwable {
    throw __call1120100_0(p0);
}
public static void h1201_1(moom.Oo p0) throws Throwable {
    throw __call1120101_0(p0);
}
private static native long __fieldRead1201_0() throws Throwable;
private static native int __call1201_1() throws Throwable;
private static native moom.Bl __call1201_2() throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1201_3(moom.Bl a0) throws Throwable;
private static native moom.BE __call1201_4(net.minecraft.server.management.ServerConfigurationManager a0) throws Throwable;
private static native java.lang.String[] __call1201_5(moom.BE a0) throws Throwable;
private static native java.util.List __call1201_6(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.Exception __call1120100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1120101_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_53f5943663dee87f8ef7(moom.qs a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws E;
private static final class __SourceHandler_53f5943663dee87f8ef7 {

public static void f1200(moom.qs receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws Throwable {
    int forwardValue1200_17_0;
    int forwardValue1200_17_1;
    int spill1200_0;
    int spill1200_1;
    long life3_3;
    int life5_5;
    java.util.regex.Matcher life6_29;
    forward_join_66: {
    forward_join_59: {
    forward_join_57: {
    forward_join_50: {
    forward_join_48: {
    forward_join_17: {
    life3_3 = (__fieldRead1200_0() ^ 80170184165823L);
    life5_5 = __call1200_1();
    spill1200_0 = (p1).length;
    spill1200_1 = 1;
    if (!((life5_5 != 0))) {
        forwardValue1200_17_0 = spill1200_0;
        forwardValue1200_17_1 = spill1200_1;
        break forward_join_17;
    }
    if (!((spill1200_0 == spill1200_1))) {
        break forward_join_59;
    }
    forwardValue1200_17_0 = __call1200_2((p1)[0]);
    forwardValue1200_17_1 = 1;
    }
    if (!((forwardValue1200_17_0 > forwardValue1200_17_1))) {
        break forward_join_59;
    }
    life6_29 = __call1200_4(__fieldRead1200_3(), (p1)[0]);
    if (!((life5_5 != 0))) {
        break forward_join_48;
    }
    if (!(__call1200_5(life6_29))) {
        break forward_join_50;
    }
    __call1200_9(__call1200_8(__call1200_7(__call1200_6())), (p1)[0]);
    __call1200_10(p0, receiver, "commands.unbanip.success", new java.lang.Object[] {(p1)[0]});
    }
    if (!((life5_5 == 0))) {
        break forward_join_57;
    }
    }
    throw new moom.cb("commands.unbanip.invalid", new java.lang.Object[0]);
    }
    if (!((life5_5 == 0))) {
        break forward_join_66;
    }
    }
    throw new moom.cc("commands.unbanip.usage", new java.lang.Object[0]);
    }
    return;
}
public static void h1200_0(moom.b7 p0) throws Throwable {
    throw __call1120000_0(p0);
}
public static void h1200_1(moom.b7 p0) throws Throwable {
    throw __call1120001_0(p0);
}
public static void h1200_2(moom.b7 p0) throws Throwable {
    throw __call1120002_0(p0);
}
public static void h1200_3(moom.b7 p0) throws Throwable {
    throw __call1120003_0(p0);
}
public static void h1200_4(moom.b7 p0) throws Throwable {
    throw __call1120004_0(p0);
}
public static void h1200_5(moom.b7 p0) throws Throwable {
    throw __call1120005_0(p0);
}
private static native long __fieldRead1200_0() throws Throwable;
private static native int __call1200_1() throws Throwable;
private static native int __call1200_2(java.lang.String a0) throws Throwable;
private static native java.util.regex.Pattern __fieldRead1200_3() throws Throwable;
private static native java.util.regex.Matcher __call1200_4(java.util.regex.Pattern a0, java.lang.String a1) throws Throwable;
private static native boolean __call1200_5(java.util.regex.Matcher a0) throws Throwable;
private static native moom.Bl __call1200_6() throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1200_7(moom.Bl a0) throws Throwable;
private static native moom.BE __call1200_8(net.minecraft.server.management.ServerConfigurationManager a0) throws Throwable;
private static native void __call1200_9(moom.BE a0, java.lang.String a1) throws Throwable;
private static native void __call1200_10(net.minecraft.command.ICommandSender a0, moom.qs a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native java.lang.Exception __call1120000_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120001_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120002_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120003_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120004_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120005_0(moom.b7 a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_6e0486a93e0721cdfd31(moom.qs a0, net.minecraft.command.ICommandSender a1) throws E;
private static final class __SourceHandler_6e0486a93e0721cdfd31 {

public static boolean f1202(moom.qs receiver, net.minecraft.command.ICommandSender p0) throws Throwable {
    int forwardValue1202_16_0;
    int forwardValue1202_20_0;
    int forwardValue1202_22_0;
    boolean spill1202_0;
    long life2_3;
    int life4_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    forward_join_16: {
    life2_3 = (__fieldRead1202_0() ^ 63910374230666L);
    life4_5 = __call1202_1();
    spill1202_0 = __call1202_5(__call1202_4(__call1202_3(__call1202_2())));
    if (!((life4_5 != 0))) {
        forwardValue1202_16_0 = __integerCategory1202_6(spill1202_0);
        break forward_join_16;
    }
    if (!(spill1202_0)) {
        break forward_join_21;
    }
    forwardValue1202_16_0 = __integerCategory1202_8(__call1202_7(receiver, p0));
    }
    if (!((life4_5 != 0))) {
        forwardValue1202_20_0 = forwardValue1202_16_0;
        break forward_join_20;
    }
    if (!((forwardValue1202_16_0 != 0))) {
        break forward_join_21;
    }
    forwardValue1202_20_0 = 1;
    }
    forwardValue1202_22_0 = forwardValue1202_20_0;
    break forward_join_22;
    }
    forwardValue1202_22_0 = 0;
    }
    return __integerCategory1202_9(forwardValue1202_22_0);
}
public static void h1202_0(moom.Oo p0) throws Throwable {
    throw __call1120200_0(p0);
}
public static void h1202_1(moom.Oo p0) throws Throwable {
    throw __call1120201_0(p0);
}
public static void h1202_2(moom.Oo p0) throws Throwable {
    throw __call1120202_0(p0);
}
private static native long __fieldRead1202_0() throws Throwable;
private static native int __call1202_1() throws Throwable;
private static native moom.Bl __call1202_2() throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1202_3(moom.Bl a0) throws Throwable;
private static native moom.BE __call1202_4(net.minecraft.server.management.ServerConfigurationManager a0) throws Throwable;
private static native boolean __call1202_5(moom.BE a0) throws Throwable;
private static native int __integerCategory1202_6(boolean value) throws Throwable;
private static native boolean __call1202_7(moom.qs a0, net.minecraft.command.ICommandSender a1) throws Throwable;
private static native int __integerCategory1202_8(boolean value) throws Throwable;
private static native boolean __integerCategory1202_9(int value) throws Throwable;
private static native java.lang.Exception __call1120200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1120201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1120202_0(moom.Oo a0) throws Throwable;

}


static {
moom.qs.c = (moom._c.a(-3448260216771468032L, 8441409619423369941L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(159813650550393L);
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public java.util.List<java.lang.String> a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) { return __sourceHandlerCall_7690ff64d43a15a26a66(this, p0, p1, p2); }


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 { __sourceHandlerCall_53f5943663dee87f8ef7(this, p0, p1); }


public java.lang.String a__String() {
return "pardon-ip";
}


public int a() {
return 3;
}


public boolean a__Boolean(net.minecraft.command.ICommandSender p0) { return __sourceHandlerCall_6e0486a93e0721cdfd31(this, p0); }


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.unbanip.usage";
}

}
