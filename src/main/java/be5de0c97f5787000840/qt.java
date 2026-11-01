package moom;


public class qt extends net.minecraft.command.CommandBase {

private static long c;

public qt() {
super();
}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_b814c83136fee3ba6e25(moom.qt a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, moom.DT a3) throws E;
private static final class __SourceHandler_b814c83136fee3ba6e25 {

public static java.util.List f1204(moom.qt receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) throws Throwable {
    java.lang.String[] forwardValue1204_13_0;
    java.util.List forwardValue1204_20_0;
    java.lang.String[] spill1204_0;
    long life4_3;
    int life6_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_13: {
    life4_3 = (__fieldRead1204_0() ^ 91340379799676L);
    life6_5 = __call1204_1();
    spill1204_0 = p1;
    if (!((life6_5 != 0))) {
        forwardValue1204_13_0 = spill1204_0;
        break forward_join_13;
    }
    if (!(((spill1204_0).length == 1))) {
        break forward_join_19;
    }
    forwardValue1204_13_0 = p1;
    }
    forwardValue1204_20_0 = __call1204_6(forwardValue1204_13_0, __call1204_5(__call1204_4(__call1204_3(__call1204_2()))));
    break forward_join_20;
    }
    forwardValue1204_20_0 = null;
    }
    return forwardValue1204_20_0;
}
public static void h1204_0(moom.Oo p0) throws Throwable {
    throw __call1120400_0(p0);
}
public static void h1204_1(moom.Oo p0) throws Throwable {
    throw __call1120401_0(p0);
}
private static native long __fieldRead1204_0() throws Throwable;
private static native int __call1204_1() throws Throwable;
private static native moom.Bl __call1204_2() throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1204_3(moom.Bl a0) throws Throwable;
private static native moom.BF __call1204_4(net.minecraft.server.management.ServerConfigurationManager a0) throws Throwable;
private static native java.lang.String[] __call1204_5(moom.BF a0) throws Throwable;
private static native java.util.List __call1204_6(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.Exception __call1120400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1120401_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_586b875e093f811a6538(moom.qt a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws E;
private static final class __SourceHandler_586b875e093f811a6538 {

public static void f1203(moom.qt receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws Throwable {
    int forwardValue1203_16_0;
    int spill1203_0;
    long life3_3;
    int life5_5;
    moom.Bl life6_24;
    com.mojang.authlib.GameProfile life7_32;
    forward_join_70: {
    forward_join_63: {
    forward_join_61: {
    forward_join_44: {
    forward_join_16: {
    life3_3 = (__fieldRead1203_0() ^ 22101998883327L);
    life5_5 = __call1203_1();
    spill1203_0 = (p1).length;
    if (!((life5_5 == 0))) {
        forwardValue1203_16_0 = spill1203_0;
        break forward_join_16;
    }
    if (!((spill1203_0 == 1))) {
        break forward_join_63;
    }
    forwardValue1203_16_0 = __call1203_2((p1)[0]);
    }
    if (!((forwardValue1203_16_0 > 0))) {
        break forward_join_63;
    }
    life6_24 = __call1203_3();
    life7_32 = __call1203_6(__call1203_5(__call1203_4(life6_24)), (p1)[0]);
    if (!((life5_5 == 0))) {
        break forward_join_61;
    }
    if (!((life7_32 == null))) {
        break forward_join_44;
    }
    throw new moom.b7("commands.unban.failed", new java.lang.Object[] {(p1)[0]});
    }
    __call1203_9(__call1203_8(__call1203_7(life6_24)), life7_32);
    __call1203_10(p0, receiver, "commands.unban.success", new java.lang.Object[] {(p1)[0]});
    }
    if (!((life5_5 != 0))) {
        break forward_join_70;
    }
    }
    throw new moom.cc("commands.unban.usage", new java.lang.Object[0]);
    }
    return;
}
public static void h1203_0(moom.b7 p0) throws Throwable {
    throw __call1120300_0(p0);
}
public static void h1203_1(moom.b7 p0) throws Throwable {
    throw __call1120301_0(p0);
}
public static void h1203_2(moom.b7 p0) throws Throwable {
    throw __call1120302_0(p0);
}
public static void h1203_3(moom.b7 p0) throws Throwable {
    throw __call1120303_0(p0);
}
public static void h1203_4(moom.b7 p0) throws Throwable {
    throw __call1120304_0(p0);
}
private static native long __fieldRead1203_0() throws Throwable;
private static native int __call1203_1() throws Throwable;
private static native int __call1203_2(java.lang.String a0) throws Throwable;
private static native moom.Bl __call1203_3() throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1203_4(moom.Bl a0) throws Throwable;
private static native moom.BF __call1203_5(net.minecraft.server.management.ServerConfigurationManager a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __call1203_6(moom.BF a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1203_7(moom.Bl a0) throws Throwable;
private static native moom.BF __call1203_8(net.minecraft.server.management.ServerConfigurationManager a0) throws Throwable;
private static native void __call1203_9(moom.BF a0, com.mojang.authlib.GameProfile a1) throws Throwable;
private static native void __call1203_10(net.minecraft.command.ICommandSender a0, moom.qt a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native java.lang.Exception __call1120300_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120301_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120302_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120303_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1120304_0(moom.b7 a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_a553d3c7dfd268650001(moom.qt a0, net.minecraft.command.ICommandSender a1) throws E;
private static final class __SourceHandler_a553d3c7dfd268650001 {

public static boolean f1205(moom.qt receiver, net.minecraft.command.ICommandSender p0) throws Throwable {
    int forwardValue1205_16_0;
    int forwardValue1205_20_0;
    int forwardValue1205_22_0;
    boolean spill1205_0;
    long life2_3;
    int life4_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    forward_join_16: {
    life2_3 = (__fieldRead1205_0() ^ 113045111362250L);
    life4_5 = __call1205_1();
    spill1205_0 = __call1205_5(__call1205_4(__call1205_3(__call1205_2())));
    if (!((life4_5 != 0))) {
        forwardValue1205_16_0 = __integerCategory1205_6(spill1205_0);
        break forward_join_16;
    }
    if (!(spill1205_0)) {
        break forward_join_21;
    }
    forwardValue1205_16_0 = __integerCategory1205_8(__call1205_7(receiver, p0));
    }
    if (!((life4_5 != 0))) {
        forwardValue1205_20_0 = forwardValue1205_16_0;
        break forward_join_20;
    }
    if (!((forwardValue1205_16_0 != 0))) {
        break forward_join_21;
    }
    forwardValue1205_20_0 = 1;
    }
    forwardValue1205_22_0 = forwardValue1205_20_0;
    break forward_join_22;
    }
    forwardValue1205_22_0 = 0;
    }
    return __integerCategory1205_9(forwardValue1205_22_0);
}
public static void h1205_0(moom.Oo p0) throws Throwable {
    throw __call1120500_0(p0);
}
public static void h1205_1(moom.Oo p0) throws Throwable {
    throw __call1120501_0(p0);
}
public static void h1205_2(moom.Oo p0) throws Throwable {
    throw __call1120502_0(p0);
}
private static native long __fieldRead1205_0() throws Throwable;
private static native int __call1205_1() throws Throwable;
private static native moom.Bl __call1205_2() throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1205_3(moom.Bl a0) throws Throwable;
private static native moom.BF __call1205_4(net.minecraft.server.management.ServerConfigurationManager a0) throws Throwable;
private static native boolean __call1205_5(moom.BF a0) throws Throwable;
private static native int __integerCategory1205_6(boolean value) throws Throwable;
private static native boolean __call1205_7(moom.qt a0, net.minecraft.command.ICommandSender a1) throws Throwable;
private static native int __integerCategory1205_8(boolean value) throws Throwable;
private static native boolean __integerCategory1205_9(int value) throws Throwable;
private static native java.lang.Exception __call1120500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1120501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1120502_0(moom.Oo a0) throws Throwable;

}


static {
moom.qt.c = (moom._c.a(1923830028432772964L, 5909542121457322745L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(219794052612680L);
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public java.util.List<java.lang.String> a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) { return __sourceHandlerCall_b814c83136fee3ba6e25(this, p0, p1, p2); }


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 { __sourceHandlerCall_586b875e093f811a6538(this, p0, p1); }


public java.lang.String a__String() {
return "pardon";
}


public int a() {
return 3;
}


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.unban.usage";
}


public boolean a__Boolean(net.minecraft.command.ICommandSender p0) { return __sourceHandlerCall_a553d3c7dfd268650001(this, p0); }

}
