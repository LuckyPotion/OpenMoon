package moom;


public class qE extends net.minecraft.command.CommandBase {

private static long c;

public qE() {
super();
}


static {
moom.qE.c = (moom._c.a(-1496690934652531426L, 2115873280919317073L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(198898500202430L);
}

private static native <E extends Throwable> void __sourceHandlerCall_331fb2ac5413d46ae7f9(moom.qE a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws E;
private static final class __SourceHandler_331fb2ac5413d46ae7f9 {

public static void f152(moom.qE receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws Throwable {
    java.lang.String[] forwardValue152_32_0;
    net.minecraft.nbt.NBTTagCompound forwardValue152_43_0;
    java.lang.String[] spill152_0;
    net.minecraft.nbt.NBTTagCompound spill152_1;
    long life3_3;
    int life5_5;
    net.minecraft.entity.Entity life6_24;
    net.minecraft.nbt.NBTTagCompound life7_26;
    net.minecraft.nbt.NBTTagCompound life8_68;
    forward_join_77: {
    forward_join_66: {
    forward_join_43: {
    forward_join_36: {
    forward_join_32: {
    forward_join_17: {
    life3_3 = (__fieldRead152_0() ^ 132740620744310L);
    life5_5 = __call152_1();
    if (!(((p1).length < 1))) {
        break forward_join_17;
    }
    throw new moom.cc("commands.testfor.usage", new java.lang.Object[0]);
    }
    life6_24 = __call152_2(p0, (p1)[0]);
    life7_26 = null;
    spill152_0 = p1;
    if (!((life5_5 != 0))) {
        forwardValue152_32_0 = spill152_0;
        break forward_join_32;
    }
    if (!(((spill152_0).length >= 2))) {
        break forward_join_36;
    }
    forwardValue152_32_0 = p1;
    }
    life7_26 = __call152_4(__call152_3(forwardValue152_32_0, 1));
    }
    spill152_1 = life7_26;
    if (!((life5_5 != 0))) {
        forwardValue152_43_0 = spill152_1;
        break forward_join_43;
    }
    if (!((spill152_1 != null))) {
        break forward_join_66;
    }
    forwardValue152_43_0 = new net.minecraft.nbt.NBTTagCompound();
    }
    life8_68 = forwardValue152_43_0;
    __call152_5(life6_24, life8_68);
    if (!((life5_5 != 0))) {
        break forward_join_77;
    }
    if (!((!__call152_6(life7_26, life8_68, 1)))) {
        break forward_join_66;
    }
    throw new moom.b7("commands.testfor.failure", new java.lang.Object[] {__call152_7(life6_24)});
    }
    __call152_9(p0, receiver, "commands.testfor.success", new java.lang.Object[] {__call152_8(life6_24)});
    }
    return;
}
public static void h152_0(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015200_0(p0);
}
public static void h152_1(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015201_0(p0);
}
public static void h152_2(net.minecraft.nbt.NBTException p0, net.minecraft.nbt.NBTTagCompound p1) throws Throwable {
    net.minecraft.nbt.NBTException life1_2;
    life1_2 = p0;
    throw new moom.b7("commands.testfor.tagError", new java.lang.Object[] {__call3015202_0(life1_2)});
}
public static void h152_3(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015203_0(p0);
}
public static void h152_4(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015204_0(p0);
}
public static void h152_5(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015205_0(p0);
}
public static void h152_6(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015206_0(p0);
}
private static native long __fieldRead152_0() throws Throwable;
private static native int __call152_1() throws Throwable;
private static native net.minecraft.entity.Entity __call152_2(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call152_3(java.lang.String[] a0, int a1) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call152_4(java.lang.String a0) throws Throwable;
private static native void __call152_5(net.minecraft.entity.Entity a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native boolean __call152_6(net.minecraft.nbt.NBTTagCompound a0, net.minecraft.nbt.NBTTagCompound a1, int a2) throws Throwable;
private static native java.lang.String __call152_7(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.lang.String __call152_8(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call152_9(net.minecraft.command.ICommandSender a0, moom.qE a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native java.lang.Exception __call3015200_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015201_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.String __call3015202_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015203_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015204_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015205_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015206_0(net.minecraft.nbt.NBTException a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_556a9a09c31a22ae23aa(moom.qE a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, moom.DT a3) throws E;
private static final class __SourceHandler_556a9a09c31a22ae23aa {

public static java.util.List f1145(moom.qE receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) throws Throwable {
    java.lang.String[] forwardValue1145_13_0;
    java.util.List forwardValue1145_18_0;
    java.lang.String[] spill1145_0;
    long life4_3;
    int life6_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_13: {
    life4_3 = (__fieldRead1145_0() ^ 70037069457397L);
    life6_5 = __call1145_1();
    spill1145_0 = p1;
    if (!((life6_5 != 0))) {
        forwardValue1145_13_0 = spill1145_0;
        break forward_join_13;
    }
    if (!(((spill1145_0).length == 1))) {
        break forward_join_17;
    }
    forwardValue1145_13_0 = p1;
    }
    forwardValue1145_18_0 = __call1145_4(forwardValue1145_13_0, __call1145_3(__call1145_2()));
    break forward_join_18;
    }
    forwardValue1145_18_0 = null;
    }
    return forwardValue1145_18_0;
}
public static void h1145_0(moom.Oo p0) throws Throwable {
    throw __call1114500_0(p0);
}
public static void h1145_1(moom.Oo p0) throws Throwable {
    throw __call1114501_0(p0);
}
private static native long __fieldRead1145_0() throws Throwable;
private static native int __call1145_1() throws Throwable;
private static native moom.Bl __call1145_2() throws Throwable;
private static native java.lang.String[] __call1145_3(moom.Bl a0) throws Throwable;
private static native java.util.List __call1145_4(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.Exception __call1114500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1114501_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_44841eb57c8e6462df77(moom.qE a0, java.lang.String[] a1, int a2) throws E;
private static final class __SourceHandler_44841eb57c8e6462df77 {

public static boolean f1146(moom.qE receiver, java.lang.String[] p0, int p1) throws Throwable {
    int forwardValue1146_11_0;
    int forwardValue1146_13_0;
    int spill1146_0;
    long life3_3;
    int life5_5;
    forward_join_13: {
    forward_join_12: {
    forward_join_11: {
    life3_3 = (__fieldRead1146_0() ^ 7792331905006L);
    life5_5 = __call1146_1();
    spill1146_0 = p1;
    if (!((life5_5 == 0))) {
        forwardValue1146_11_0 = spill1146_0;
        break forward_join_11;
    }
    if (!((spill1146_0 == 0))) {
        break forward_join_12;
    }
    forwardValue1146_11_0 = 1;
    }
    forwardValue1146_13_0 = forwardValue1146_11_0;
    break forward_join_13;
    }
    forwardValue1146_13_0 = 0;
    }
    return __integerCategory1146_2(forwardValue1146_13_0);
}
public static void h1146_0(moom.Oo p0) throws Throwable {
    throw __call1114600_0(p0);
}
private static native long __fieldRead1146_0() throws Throwable;
private static native int __call1146_1() throws Throwable;
private static native boolean __integerCategory1146_2(int value) throws Throwable;
private static native java.lang.Exception __call1114600_0(moom.Oo a0) throws Throwable;

}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public java.util.List<java.lang.String> a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) { return __sourceHandlerCall_556a9a09c31a22ae23aa(this, p0, p1, p2); }


public boolean a__Boolean(java.lang.String[] p0, int p1) { return __sourceHandlerCall_44841eb57c8e6462df77(this, p0, p1); }


public java.lang.String a__String() {
return "testfor";
}


public int a() {
return 2;
}


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.testfor.usage";
}


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 { __sourceHandlerCall_331fb2ac5413d46ae7f9(this, p0, p1); }

}
