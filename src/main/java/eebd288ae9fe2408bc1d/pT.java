package moom;


public class pT extends net.minecraft.command.CommandBase {

private static long c;

public pT() {
super();
}


static {
moom.pT.c = (moom._c.a(-6148187009458996523L, -7338951453563306396L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(18491591142337L);
}

private static native <E extends Throwable> void __sourceHandlerCall_acba33eccad36bf3f3d3(moom.pT a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws E;
private static final class __SourceHandler_acba33eccad36bf3f3d3 {

public static void f147(moom.pT receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws Throwable {
    long life3_3;
    int life5_5;
    net.minecraft.entity.Entity life6_24;
    net.minecraft.nbt.NBTTagCompound life7_45;
    net.minecraft.nbt.NBTTagCompound life8_52;
    net.minecraft.nbt.NBTTagCompound life9_59;
    life3_3 = (__fieldRead147_0() ^ 62148598655332L);
    life5_5 = __integerCategory147_2(__call147_1());
    if (((p1).length < 2)) {
        throw new moom.cc("commands.entitydata.usage", new java.lang.Object[0]);
    }
    life6_24 = __call147_3(p0, (p1)[0]);
    if ((__instanceOf147_4(life6_24) != 0)) {
        throw new moom.b7("commands.entitydata.noPlayers", new java.lang.Object[] {__call147_5(life6_24)});
    }
    life7_45 = new net.minecraft.nbt.NBTTagCompound();
    __call147_6(life6_24, life7_45);
    life8_52 = __cast147_8(__call147_7(life7_45));
    life9_59 = __call147_11(__call147_10(__call147_9(p0, p1, 1)));
    __call147_12(life9_59, "UUIDMost");
    __call147_13(life9_59, "UUIDLeast");
    __call147_14(life7_45, life9_59);
    if ((life5_5 != 0)) {
        if (__call147_15(life7_45, life8_52)) {
        throw new moom.b7("commands.entitydata.failed", new java.lang.Object[] {__call147_16(life7_45)});
    }
        __call147_17(life6_24, life7_45);
        __call147_19(p0, receiver, "commands.entitydata.success", new java.lang.Object[] {__call147_18(life7_45)});
    } else {
        
    }
    return;
}
public static void h147_0(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014700_0(p0);
}
public static void h147_1(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014701_0(p0);
}
public static void h147_2(net.minecraft.nbt.NBTException p0) throws Throwable {
    net.minecraft.nbt.NBTException life1_2;
    life1_2 = p0;
    throw new moom.b7("commands.entitydata.tagError", new java.lang.Object[] {__call3014702_0(life1_2)});
}
public static void h147_3(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014703_0(p0);
}
public static void h147_4(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014704_0(p0);
}
private static native long __fieldRead147_0() throws Throwable;
private static native boolean __call147_1() throws Throwable;
private static native int __integerCategory147_2(boolean value) throws Throwable;
private static native net.minecraft.entity.Entity __call147_3(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native int __instanceOf147_4(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call147_5(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call147_6(net.minecraft.entity.Entity a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native net.minecraft.nbt.NBTBase __call147_7(net.minecraft.nbt.NBTTagCompound a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __cast147_8(net.minecraft.nbt.NBTBase a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call147_9(net.minecraft.command.ICommandSender a0, java.lang.String[] a1, int a2) throws Throwable;
private static native java.lang.String __call147_10(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call147_11(java.lang.String a0) throws Throwable;
private static native void __call147_12(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __call147_13(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __call147_14(net.minecraft.nbt.NBTTagCompound a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native boolean __call147_15(net.minecraft.nbt.NBTTagCompound a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native java.lang.String __call147_16(net.minecraft.nbt.NBTTagCompound a0) throws Throwable;
private static native void __call147_17(net.minecraft.entity.Entity a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native java.lang.String __call147_18(net.minecraft.nbt.NBTTagCompound a0) throws Throwable;
private static native void __call147_19(net.minecraft.command.ICommandSender a0, moom.pT a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native java.lang.Exception __call3014700_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014701_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.String __call3014702_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014703_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014704_0(net.minecraft.nbt.NBTException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_2bb8c03262d975a5167a(moom.pT a0, java.lang.String[] a1, int a2) throws E;
private static final class __SourceHandler_2bb8c03262d975a5167a {

public static boolean f1122(moom.pT receiver, java.lang.String[] p0, int p1) throws Throwable {
    int forwardValue1122_11_0;
    int forwardValue1122_13_0;
    int spill1122_0;
    long life3_3;
    int life5_5;
    forward_join_13: {
    forward_join_12: {
    forward_join_11: {
    life3_3 = (__fieldRead1122_0() ^ 78246913919228L);
    life5_5 = __integerCategory1122_2(__call1122_1());
    spill1122_0 = p1;
    if (!((life5_5 == 0))) {
        forwardValue1122_11_0 = spill1122_0;
        break forward_join_11;
    }
    if (!((spill1122_0 == 0))) {
        break forward_join_12;
    }
    forwardValue1122_11_0 = 1;
    }
    forwardValue1122_13_0 = forwardValue1122_11_0;
    break forward_join_13;
    }
    forwardValue1122_13_0 = 0;
    }
    return __integerCategory1122_3(forwardValue1122_13_0);
}
public static void h1122_0(moom.Oo p0) throws Throwable {
    throw __call1112200_0(p0);
}
private static native long __fieldRead1122_0() throws Throwable;
private static native boolean __call1122_1() throws Throwable;
private static native int __integerCategory1122_2(boolean value) throws Throwable;
private static native boolean __integerCategory1122_3(int value) throws Throwable;
private static native java.lang.Exception __call1112200_0(moom.Oo a0) throws Throwable;

}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public boolean a__Boolean(java.lang.String[] p0, int p1) { return __sourceHandlerCall_2bb8c03262d975a5167a(this, p0, p1); }


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 { __sourceHandlerCall_acba33eccad36bf3f3d3(this, p0, p1); }


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.entitydata.usage";
}


public int a() {
return 2;
}


public java.lang.String a__String() {
return "entitydata";
}

}
