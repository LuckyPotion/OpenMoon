package moom;


public class ql extends net.minecraft.command.CommandBase {

private static long c;

public ql() {
super();
}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_5e1c2bce0ea70c89d6e2(moom.ql a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, moom.DT a3) throws E;
private static final class __SourceHandler_5e1c2bce0ea70c89d6e2 {

public static java.util.List f1192(moom.ql receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) throws Throwable {
    java.lang.String[] forwardValue1192_13_0;
    java.util.List forwardValue1192_19_0;
    java.lang.String[] spill1192_0;
    long life4_3;
    int life6_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_13: {
    life4_3 = (__fieldRead1192_0() ^ 31572992506381L);
    life6_5 = __call1192_1();
    spill1192_0 = p1;
    if (!((life6_5 == 0))) {
        forwardValue1192_13_0 = spill1192_0;
        break forward_join_13;
    }
    if (!(((spill1192_0).length == 1))) {
        break forward_join_18;
    }
    forwardValue1192_13_0 = p1;
    }
    forwardValue1192_19_0 = __call1192_5(forwardValue1192_13_0, __call1192_4(__call1192_3(__call1192_2())));
    break forward_join_19;
    }
    forwardValue1192_19_0 = null;
    }
    return forwardValue1192_19_0;
}
public static void h1192_0(moom.Oo p0) throws Throwable {
    throw __call1119200_0(p0);
}
public static void h1192_1(moom.Oo p0) throws Throwable {
    throw __call1119201_0(p0);
}
private static native long __fieldRead1192_0() throws Throwable;
private static native int __call1192_1() throws Throwable;
private static native moom.Bl __call1192_2() throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1192_3(moom.Bl a0) throws Throwable;
private static native java.lang.String[] __call1192_4(net.minecraft.server.management.ServerConfigurationManager a0) throws Throwable;
private static native java.util.List __call1192_5(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.Exception __call1119200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1119201_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_ce9aa939b7dea5e209c9(moom.ql a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws E;
private static final class __SourceHandler_ce9aa939b7dea5e209c9 {

public static void f1191(moom.ql receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws Throwable {
    int forwardValue1191_16_0;
    int spill1191_0;
    long life3_3;
    int life5_5;
    moom.Bl life6_24;
    com.mojang.authlib.GameProfile life7_32;
    forward_join_69: {
    forward_join_62: {
    forward_join_60: {
    forward_join_44: {
    forward_join_16: {
    life3_3 = (__fieldRead1191_0() ^ 100880094210958L);
    life5_5 = __call1191_1();
    spill1191_0 = (p1).length;
    if (!((life5_5 == 0))) {
        forwardValue1191_16_0 = spill1191_0;
        break forward_join_16;
    }
    if (!((spill1191_0 == 1))) {
        break forward_join_62;
    }
    forwardValue1191_16_0 = __call1191_2((p1)[0]);
    }
    if (!((forwardValue1191_16_0 > 0))) {
        break forward_join_62;
    }
    life6_24 = __call1191_3();
    life7_32 = __call1191_6(__call1191_5(__call1191_4(life6_24)), (p1)[0]);
    if (!((life5_5 == 0))) {
        break forward_join_60;
    }
    if (!((life7_32 == null))) {
        break forward_join_44;
    }
    throw new moom.b7("commands.deop.failed", new java.lang.Object[] {(p1)[0]});
    }
    __call1191_8(__call1191_7(life6_24), life7_32);
    __call1191_9(p0, receiver, "commands.deop.success", new java.lang.Object[] {(p1)[0]});
    }
    if (!((life5_5 != 0))) {
        break forward_join_69;
    }
    }
    throw new moom.cc("commands.deop.usage", new java.lang.Object[0]);
    }
    return;
}
public static void h1191_0(moom.b7 p0) throws Throwable {
    throw __call1119100_0(p0);
}
public static void h1191_1(moom.b7 p0) throws Throwable {
    throw __call1119101_0(p0);
}
public static void h1191_2(moom.b7 p0) throws Throwable {
    throw __call1119102_0(p0);
}
public static void h1191_3(moom.b7 p0) throws Throwable {
    throw __call1119103_0(p0);
}
public static void h1191_4(moom.b7 p0) throws Throwable {
    throw __call1119104_0(p0);
}
private static native long __fieldRead1191_0() throws Throwable;
private static native int __call1191_1() throws Throwable;
private static native int __call1191_2(java.lang.String a0) throws Throwable;
private static native moom.Bl __call1191_3() throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1191_4(moom.Bl a0) throws Throwable;
private static native moom.BG __call1191_5(net.minecraft.server.management.ServerConfigurationManager a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __call1191_6(moom.BG a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1191_7(moom.Bl a0) throws Throwable;
private static native void __call1191_8(net.minecraft.server.management.ServerConfigurationManager a0, com.mojang.authlib.GameProfile a1) throws Throwable;
private static native void __call1191_9(net.minecraft.command.ICommandSender a0, moom.ql a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native java.lang.Exception __call1119100_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1119101_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1119102_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1119103_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1119104_0(moom.b7 a0) throws Throwable;

}


static {
moom.ql.c = (moom._c.a(6080522177077693157L, -6078958607315469247L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(200885135984224L);
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public java.util.List<java.lang.String> a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) { return __sourceHandlerCall_5e1c2bce0ea70c89d6e2(this, p0, p1, p2); }


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 { __sourceHandlerCall_ce9aa939b7dea5e209c9(this, p0, p1); }


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.deop.usage";
}


public int a() {
return 3;
}


public java.lang.String a__String() {
return "deop";
}

}
