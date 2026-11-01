package moom;


public class qA extends net.minecraft.command.CommandBase {

private static long c;

public qA() {
super();
}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_20218f02ff537d6a07bf(moom.qA a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, moom.DT a3) throws E;
private static final class __SourceHandler_20218f02ff537d6a07bf {

public static java.util.List f1141(moom.qA receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) throws Throwable {
    int forwardValue1141_15_0;
    java.lang.String[] forwardValue1141_18_0;
    java.util.List forwardValue1141_23_0;
    int spill1141_0;
    java.lang.String[] spill1141_1;
    long life4_3;
    int life6_5;
    forward_join_23: {
    forward_join_22: {
    forward_join_18: {
    forward_join_15: {
    life4_3 = (__fieldRead1141_0() ^ 10232770975908L);
    life6_5 = __call1141_1();
    spill1141_0 = (p1).length;
    if (!((life6_5 != 0))) {
        forwardValue1141_15_0 = spill1141_0;
        break forward_join_15;
    }
    if (!((spill1141_0 > 0))) {
        break forward_join_22;
    }
    spill1141_1 = p1;
    if (!((life6_5 != 0))) {
        forwardValue1141_18_0 = spill1141_1;
        break forward_join_18;
    }
    forwardValue1141_15_0 = (spill1141_1).length;
    }
    if (!((forwardValue1141_15_0 <= 3))) {
        break forward_join_22;
    }
    forwardValue1141_18_0 = p1;
    }
    forwardValue1141_23_0 = __call1141_2(forwardValue1141_18_0, 0, p2);
    break forward_join_23;
    }
    forwardValue1141_23_0 = null;
    }
    return forwardValue1141_23_0;
}
public static void h1141_0(moom.Oo p0) throws Throwable {
    throw __call1114100_0(p0);
}
public static void h1141_1(moom.Oo p0) throws Throwable {
    throw __call1114101_0(p0);
}
public static void h1141_2(moom.Oo p0) throws Throwable {
    throw __call1114102_0(p0);
}
public static void h1141_3(moom.Oo p0) throws Throwable {
    throw __call1114103_0(p0);
}
private static native long __fieldRead1141_0() throws Throwable;
private static native int __call1141_1() throws Throwable;
private static native java.util.List __call1141_2(java.lang.String[] a0, int a1, moom.DT a2) throws Throwable;
private static native java.lang.Exception __call1114100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1114101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1114102_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1114103_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_ceaacb46597b9d1dcbea(moom.qA a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws E;
private static final class __SourceHandler_ceaacb46597b9d1dcbea {

public static void f1140(moom.qA receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws Throwable {
    int forwardValue1140_19_0;
    net.minecraft.command.ICommandSender forwardValue1140_34_0;
    int spill1140_0;
    net.minecraft.command.ICommandSender spill1140_1;
    long life3_3;
    int life5_5;
    moom.DT life6_17;
    forward_join_39: {
    forward_join_34: {
    forward_join_33: {
    forward_join_26: {
    forward_join_19: {
    forward_join_17: {
    life3_3 = (__fieldRead1140_0() ^ 86063955790119L);
    life5_5 = __call1140_1();
    spill1140_0 = (p1).length;
    if (!((life5_5 == 0))) {
        forwardValue1140_19_0 = spill1140_0;
        break forward_join_19;
    }
    if (!((spill1140_0 == 0))) {
        break forward_join_17;
    }
    life6_17 = __call1140_3(__call1140_2(p0));
    if (!((life5_5 != 0))) {
        break forward_join_39;
    }
    }
    forwardValue1140_19_0 = (p1).length;
    }
    if (!((forwardValue1140_19_0 == 3))) {
        break forward_join_26;
    }
    spill1140_1 = p0;
    if (!((life5_5 == 0))) {
        forwardValue1140_34_0 = spill1140_1;
        break forward_join_34;
    }
    if (!((__call1140_4(spill1140_1) == null))) {
        break forward_join_33;
    }
    }
    throw new moom.cc("commands.setworldspawn.usage", new java.lang.Object[0]);
    }
    forwardValue1140_34_0 = p0;
    }
    life6_17 = __call1140_5(forwardValue1140_34_0, p1, 0, 1);
    }
    __call1140_7(__call1140_6(p0), life6_17);
    __call1140_10(__call1140_9(__call1140_8()), new moom.zy(life6_17));
    __call1140_17(p0, receiver, "commands.setworldspawn.success", new java.lang.Object[] {__call1140_12(__call1140_11(life6_17)), __call1140_14(__call1140_13(life6_17)), __call1140_16(__call1140_15(life6_17))});
    return;
}
public static void h1140_0(moom.b7 p0) throws Throwable {
    throw __call1114000_0(p0);
}
public static void h1140_1(moom.b7 p0) throws Throwable {
    throw __call1114001_0(p0);
}
public static void h1140_2(moom.b7 p0) throws Throwable {
    throw __call1114002_0(p0);
}
public static void h1140_3(moom.b7 p0) throws Throwable {
    throw __call1114003_0(p0);
}
public static void h1140_4(moom.b7 p0) throws Throwable {
    throw __call1114004_0(p0);
}
private static native long __fieldRead1140_0() throws Throwable;
private static native int __call1140_1() throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __call1140_2(net.minecraft.command.ICommandSender a0) throws Throwable;
private static native moom.DT __call1140_3(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.world.World __call1140_4(net.minecraft.command.ICommandSender a0) throws Throwable;
private static native moom.DT __call1140_5(net.minecraft.command.ICommandSender a0, java.lang.String[] a1, int a2, int a3) throws Throwable;
private static native net.minecraft.world.World __call1140_6(net.minecraft.command.ICommandSender a0) throws Throwable;
private static native void __call1140_7(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native moom.Bl __call1140_8() throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1140_9(moom.Bl a0) throws Throwable;
private static native void __call1140_10(net.minecraft.server.management.ServerConfigurationManager a0, moom.zy a1) throws Throwable;
private static native int __call1140_11(moom.DT a0) throws Throwable;
private static native java.lang.Integer __call1140_12(int a0) throws Throwable;
private static native int __call1140_13(moom.DT a0) throws Throwable;
private static native java.lang.Integer __call1140_14(int a0) throws Throwable;
private static native int __call1140_15(moom.DT a0) throws Throwable;
private static native java.lang.Integer __call1140_16(int a0) throws Throwable;
private static native void __call1140_17(net.minecraft.command.ICommandSender a0, moom.qA a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native java.lang.Exception __call1114000_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1114001_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1114002_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1114003_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1114004_0(moom.b7 a0) throws Throwable;

}


static {
moom.qA.c = (moom._c.a(-9189859570004215915L, -4784374815596556595L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(257937753338386L);
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public java.util.List<java.lang.String> a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) { return __sourceHandlerCall_20218f02ff537d6a07bf(this, p0, p1, p2); }


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 { __sourceHandlerCall_ceaacb46597b9d1dcbea(this, p0, p1); }


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.setworldspawn.usage";
}


public int a() {
return 2;
}


public java.lang.String a__String() {
return "setworldspawn";
}

}
