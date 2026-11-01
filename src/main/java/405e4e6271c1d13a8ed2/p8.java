package moom;


public class p8 extends net.minecraft.command.CommandBase {

private static long c;

public p8() {
super();
}

private static native <E extends Throwable> void __sourceHandlerCall_e29d59f1d69568168cb3(moom.p8 a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws E;
private static final class __SourceHandler_e29d59f1d69568168cb3 {

public static void f1100(moom.p8 receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws Throwable {
    net.minecraft.command.ICommandSender forwardValue1100_12_0;
    net.minecraft.world.World forwardValue1100_18_0;
    net.minecraft.command.ICommandSender spill1100_0;
    long life3_3;
    int life5_5;
    net.minecraft.world.World life6_24;
    forward_join_18: {
    forward_join_15: {
    forward_join_12: {
    life3_3 = (__fieldRead1100_0() ^ 31910950792803L);
    life5_5 = __integerCategory1100_2(__call1100_1());
    spill1100_0 = p0;
    if (!((life5_5 == 0))) {
        forwardValue1100_12_0 = spill1100_0;
        break forward_join_12;
    }
    if (!((__instanceOf1100_3(spill1100_0) != 0))) {
        break forward_join_15;
    }
    forwardValue1100_12_0 = p0;
    }
    forwardValue1100_18_0 = __fieldRead1100_5(__cast1100_4(forwardValue1100_12_0));
    break forward_join_18;
    }
    forwardValue1100_18_0 = __call1100_7(__call1100_6(), 0);
    }
    life6_24 = forwardValue1100_18_0;
    __call1100_10(p0, new moom.CN("commands.seed.success", new java.lang.Object[] {__call1100_9(__call1100_8(life6_24))}));
    return;
}
public static void h1100_0(moom.b7 p0) throws Throwable {
    throw __call1110000_0(p0);
}
public static void h1100_1(moom.b7 p0) throws Throwable {
    throw __call1110001_0(p0);
}
private static native long __fieldRead1100_0() throws Throwable;
private static native boolean __call1100_1() throws Throwable;
private static native int __integerCategory1100_2(boolean value) throws Throwable;
private static native int __instanceOf1100_3(net.minecraft.command.ICommandSender a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __cast1100_4(net.minecraft.command.ICommandSender a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead1100_5(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native moom.Bl __call1100_6() throws Throwable;
private static native net.minecraft.world.WorldServer __call1100_7(moom.Bl a0, int a1) throws Throwable;
private static native long __call1100_8(net.minecraft.world.World a0) throws Throwable;
private static native java.lang.Long __call1100_9(long a0) throws Throwable;
private static native void __call1100_10(net.minecraft.command.ICommandSender a0, moom.CN a1) throws Throwable;
private static native java.lang.Exception __call1110000_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1110001_0(moom.b7 a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_46a27abba4507a028faf(moom.p8 a0, net.minecraft.command.ICommandSender a1) throws E;
private static final class __SourceHandler_46a27abba4507a028faf {

public static boolean f1101(moom.p8 receiver, net.minecraft.command.ICommandSender p0) throws Throwable {
    int forwardValue1101_18_0;
    int forwardValue1101_20_0;
    boolean spill1101_0;
    boolean spill1101_1;
    long life2_3;
    int life4_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    life2_3 = (__fieldRead1101_0() ^ 122937006681430L);
    life4_5 = __integerCategory1101_2(__call1101_1());
    spill1101_0 = __call1101_4(__call1101_3());
    if (!((life4_5 != 0))) {
        forwardValue1101_18_0 = __integerCategory1101_5(spill1101_0);
        break forward_join_18;
    }
    if (!((!spill1101_0))) {
        break forward_join_17;
    }
    spill1101_1 = __call1101_6(receiver, p0);
    if (!((life4_5 != 0))) {
        forwardValue1101_18_0 = __integerCategory1101_7(spill1101_1);
        break forward_join_18;
    }
    if (!(spill1101_1)) {
        break forward_join_19;
    }
    }
    forwardValue1101_18_0 = 1;
    }
    forwardValue1101_20_0 = forwardValue1101_18_0;
    break forward_join_20;
    }
    forwardValue1101_20_0 = 0;
    }
    return __integerCategory1101_8(forwardValue1101_20_0);
}
public static void h1101_0(moom.Oo p0) throws Throwable {
    throw __call1110100_0(p0);
}
public static void h1101_1(moom.Oo p0) throws Throwable {
    throw __call1110101_0(p0);
}
public static void h1101_2(moom.Oo p0) throws Throwable {
    throw __call1110102_0(p0);
}
private static native long __fieldRead1101_0() throws Throwable;
private static native boolean __call1101_1() throws Throwable;
private static native int __integerCategory1101_2(boolean value) throws Throwable;
private static native moom.Bl __call1101_3() throws Throwable;
private static native boolean __call1101_4(moom.Bl a0) throws Throwable;
private static native int __integerCategory1101_5(boolean value) throws Throwable;
private static native boolean __call1101_6(moom.p8 a0, net.minecraft.command.ICommandSender a1) throws Throwable;
private static native int __integerCategory1101_7(boolean value) throws Throwable;
private static native boolean __integerCategory1101_8(int value) throws Throwable;
private static native java.lang.Exception __call1110100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1110101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1110102_0(moom.Oo a0) throws Throwable;

}


static {
moom.p8.c = (moom._c.a(8632044508766204255L, 7402282442526056956L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(206513893421646L);
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 { __sourceHandlerCall_e29d59f1d69568168cb3(this, p0, p1); }


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.seed.usage";
}


public int a() {
return 2;
}


public java.lang.String a__String() {
return "seed";
}


public boolean a__Boolean(net.minecraft.command.ICommandSender p0) { return __sourceHandlerCall_46a27abba4507a028faf(this, p0); }

}
