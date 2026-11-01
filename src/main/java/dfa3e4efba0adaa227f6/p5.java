package moom;


public class p5 extends net.minecraft.command.CommandBase {

private static long c;

public p5() {
super();
}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_1994031ec6dc617272cf(moom.p5 a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, moom.DT a3) throws E;
private static final class __SourceHandler_1994031ec6dc617272cf {

public static java.util.List f1096(moom.p5 receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) throws Throwable {
    java.lang.String[] forwardValue1096_13_0;
    java.util.List forwardValue1096_18_0;
    java.lang.String[] spill1096_0;
    long life4_3;
    int life6_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_13: {
    life4_3 = (__fieldRead1096_0() ^ 62860142386735L);
    life6_5 = __integerCategory1096_2(__call1096_1());
    spill1096_0 = p1;
    if (!((life6_5 == 0))) {
        forwardValue1096_13_0 = spill1096_0;
        break forward_join_13;
    }
    if (!(((spill1096_0).length >= 1))) {
        break forward_join_17;
    }
    forwardValue1096_13_0 = p1;
    }
    forwardValue1096_18_0 = __call1096_5(forwardValue1096_13_0, __call1096_4(__call1096_3()));
    break forward_join_18;
    }
    forwardValue1096_18_0 = null;
    }
    return forwardValue1096_18_0;
}
public static void h1096_0(moom.Oo p0) throws Throwable {
    throw __call1109600_0(p0);
}
public static void h1096_1(moom.Oo p0) throws Throwable {
    throw __call1109601_0(p0);
}
private static native long __fieldRead1096_0() throws Throwable;
private static native boolean __call1096_1() throws Throwable;
private static native int __integerCategory1096_2(boolean value) throws Throwable;
private static native moom.Bl __call1096_3() throws Throwable;
private static native java.lang.String[] __call1096_4(moom.Bl a0) throws Throwable;
private static native java.util.List __call1096_5(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.Exception __call1109600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1109601_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_06a354d06da9df6b8ca7(moom.p5 a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws E;
private static final class __SourceHandler_06a354d06da9df6b8ca7 {

public static void f1095(moom.p5 receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws Throwable {
    int forwardValue1095_15_0;
    int forwardValue1095_55_0;
    net.minecraft.command.ICommandSender forwardValue1095_74_0;
    int spill1095_0;
    int spill1095_1;
    net.minecraft.entity.player.EntityPlayerMP spill1095_2;
    long life3_3;
    int life5_5;
    net.minecraft.entity.player.EntityPlayerMP life6_29;
    java.lang.String life7_31;
    int life8_33;
    forward_join_93: {
    forward_join_86: {
    forward_join_84: {
    forward_join_74: {
    forward_join_73: {
    forward_join_55: {
    forward_join_48: {
    forward_join_34: {
    forward_join_15: {
    life3_3 = (__fieldRead1095_0() ^ 138689180831660L);
    life5_5 = __integerCategory1095_2(__call1095_1());
    spill1095_0 = (p1).length;
    if (!((life5_5 == 0))) {
        forwardValue1095_15_0 = spill1095_0;
        break forward_join_15;
    }
    if (!((spill1095_0 > 0))) {
        break forward_join_86;
    }
    forwardValue1095_15_0 = __call1095_3((p1)[0]);
    }
    if (!((forwardValue1095_15_0 > 1))) {
        break forward_join_86;
    }
    life6_29 = __call1095_6(__call1095_5(__call1095_4()), (p1)[0]);
    life7_31 = "Kicked by an operator.";
    life8_33 = 0;
    if (!((life6_29 == null))) {
        break forward_join_34;
    }
    throw new moom.ca();
    }
    spill1095_1 = (p1).length;
    if (!((life5_5 == 0))) {
        forwardValue1095_55_0 = spill1095_1;
        break forward_join_55;
    }
    if (!((spill1095_1 >= 2))) {
        break forward_join_48;
    }
    life7_31 = __call1095_8(__call1095_7(p0, p1, 1));
    life8_33 = 1;
    }
    spill1095_2 = life6_29;
    if (!((life5_5 == 0))) {
        forwardValue1095_74_0 = spill1095_2;
        break forward_join_74;
    }
    __call1095_10(__fieldRead1095_9(spill1095_2), life7_31);
    forwardValue1095_55_0 = life8_33;
    }
    if (!((forwardValue1095_55_0 != 0))) {
        break forward_join_73;
    }
    __call1095_12(p0, receiver, "commands.kick.success.reason", new java.lang.Object[] {__call1095_11(life6_29), life7_31});
    if (!((life5_5 != 0))) {
        break forward_join_84;
    }
    }
    forwardValue1095_74_0 = p0;
    }
    __call1095_14(forwardValue1095_74_0, receiver, "commands.kick.success", new java.lang.Object[] {__call1095_13(life6_29)});
    }
    if (!((life5_5 != 0))) {
        break forward_join_93;
    }
    }
    throw new moom.cc("commands.kick.usage", new java.lang.Object[0]);
    }
    return;
}
public static void h1095_0(moom.b7 p0) throws Throwable {
    throw __call1109500_0(p0);
}
public static void h1095_1(moom.b7 p0) throws Throwable {
    throw __call1109501_0(p0);
}
public static void h1095_2(moom.b7 p0) throws Throwable {
    throw __call1109502_0(p0);
}
public static void h1095_3(moom.b7 p0) throws Throwable {
    throw __call1109503_0(p0);
}
public static void h1095_4(moom.b7 p0) throws Throwable {
    throw __call1109504_0(p0);
}
public static void h1095_5(moom.b7 p0) throws Throwable {
    throw __call1109505_0(p0);
}
public static void h1095_6(moom.b7 p0) throws Throwable {
    throw __call1109506_0(p0);
}
public static void h1095_7(moom.b7 p0) throws Throwable {
    throw __call1109507_0(p0);
}
private static native long __fieldRead1095_0() throws Throwable;
private static native boolean __call1095_1() throws Throwable;
private static native int __integerCategory1095_2(boolean value) throws Throwable;
private static native int __call1095_3(java.lang.String a0) throws Throwable;
private static native moom.Bl __call1095_4() throws Throwable;
private static native net.minecraft.server.management.ServerConfigurationManager __call1095_5(moom.Bl a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __call1095_6(net.minecraft.server.management.ServerConfigurationManager a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.util.IChatComponent __call1095_7(net.minecraft.command.ICommandSender a0, java.lang.String[] a1, int a2) throws Throwable;
private static native java.lang.String __call1095_8(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native net.minecraft.network.NetHandlerPlayServer __fieldRead1095_9(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1095_10(net.minecraft.network.NetHandlerPlayServer a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call1095_11(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1095_12(net.minecraft.command.ICommandSender a0, moom.p5 a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native java.lang.String __call1095_13(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call1095_14(net.minecraft.command.ICommandSender a0, moom.p5 a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native java.lang.Exception __call1109500_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1109501_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1109502_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1109503_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1109504_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1109505_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1109506_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1109507_0(moom.b7 a0) throws Throwable;

}


static {
moom.p5.c = (moom._c.a(639353868895617975L, 6019963823019267424L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(228885616134746L);
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public java.util.List<java.lang.String> a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) { return __sourceHandlerCall_1994031ec6dc617272cf(this, p0, p1, p2); }


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 { __sourceHandlerCall_06a354d06da9df6b8ca7(this, p0, p1); }


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.kick.usage";
}


public int a() {
return 3;
}


public java.lang.String a__String() {
return "kick";
}

}
