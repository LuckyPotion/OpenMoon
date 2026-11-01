package moom;


public class pL extends net.minecraft.command.CommandBase {

private static long c;

public pL() {
super();
}


static {
moom.pL.c = (moom._c.a(4885650158756952019L, 66993681257258337L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(25991057207801L);
}

private static native <E extends Throwable> void __sourceHandlerCall_e556421aacb2574e98de(moom.pL a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws E;
private static final class __SourceHandler_e556421aacb2574e98de {

public static void f143(moom.pL receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws Throwable {
    net.minecraft.world.World spill143_0;
    moom.DT spill143_1;
    net.minecraft.world.World joinValue143_1_0;
    moom.DT joinValue143_1_1;
    long life3_3;
    int life5_5;
    moom.DT life6_33;
    net.minecraft.world.World life7_36;
    net.minecraft.tileentity.TileEntity life8_58;
    net.minecraft.nbt.NBTTagCompound life9_73;
    net.minecraft.nbt.NBTTagCompound life10_80;
    net.minecraft.nbt.NBTTagCompound life11_87;
    life3_3 = (__fieldRead143_0() ^ 67133100519212L);
    life5_5 = __integerCategory143_2(__call143_1());
    if ((life5_5 != 0)) {
        if (((p1).length < 4)) {
        throw new moom.cc("commands.blockdata.usage", new java.lang.Object[0]);
    }
        __call143_4(p0, __fieldRead143_3(), 0);
    } else {
        
    }
    life6_33 = __call143_5(p0, p1, 0, 0);
    life7_36 = __call143_6(p0);
    spill143_0 = life7_36;
    spill143_1 = life6_33;
    if ((life5_5 != 0)) {
        if ((!__call143_7(spill143_0, spill143_1))) {
        throw new moom.b7("commands.blockdata.outOfWorld", new java.lang.Object[0]);
    }
        joinValue143_1_0 = life7_36;
        joinValue143_1_1 = life6_33;
    } else {
        joinValue143_1_0 = spill143_0;
        joinValue143_1_1 = spill143_1;
    }
    life8_58 = __call143_8(joinValue143_1_0, joinValue143_1_1);
    if ((life8_58 == null)) {
        throw new moom.b7("commands.blockdata.notValid", new java.lang.Object[0]);
    }
    life9_73 = new net.minecraft.nbt.NBTTagCompound();
    __call143_9(life8_58, life9_73);
    life10_80 = __cast143_11(__call143_10(life9_73));
    life11_87 = __call143_14(__call143_13(__call143_12(p0, p1, 3)));
    __call143_15(life9_73, life11_87);
    __call143_17(life9_73, "x", __call143_16(life6_33));
    __call143_19(life9_73, "y", __call143_18(life6_33));
    __call143_21(life9_73, "z", __call143_20(life6_33));
    if ((life5_5 != 0)) {
        if (__call143_22(life9_73, life10_80)) {
        throw new moom.b7("commands.blockdata.failed", new java.lang.Object[] {__call143_23(life9_73)});
    }
        __call143_24(life8_58, life9_73);
        __call143_25(life8_58);
        __call143_26(life7_36, life6_33);
        __call143_28(p0, __fieldRead143_27(), 1);
        __call143_30(p0, receiver, "commands.blockdata.success", new java.lang.Object[] {__call143_29(life9_73)});
    } else {
        
    }
    return;
}
public static void h143_0(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014300_0(p0);
}
public static void h143_1(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014301_0(p0);
}
public static void h143_2(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014302_0(p0);
}
public static void h143_3(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014303_0(p0);
}
public static void h143_4(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014304_0(p0);
}
public static void h143_5(net.minecraft.nbt.NBTException p0) throws Throwable {
    net.minecraft.nbt.NBTException life1_2;
    life1_2 = p0;
    throw new moom.b7("commands.blockdata.tagError", new java.lang.Object[] {__call3014305_0(life1_2)});
}
public static void h143_6(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014306_0(p0);
}
public static void h143_7(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014307_0(p0);
}
private static native long __fieldRead143_0() throws Throwable;
private static native boolean __call143_1() throws Throwable;
private static native int __integerCategory143_2(boolean value) throws Throwable;
private static native net.minecraft.command.CommandResultStats$Type __fieldRead143_3() throws Throwable;
private static native void __call143_4(net.minecraft.command.ICommandSender a0, net.minecraft.command.CommandResultStats$Type a1, int a2) throws Throwable;
private static native moom.DT __call143_5(net.minecraft.command.ICommandSender a0, java.lang.String[] a1, int a2, int a3) throws Throwable;
private static native net.minecraft.world.World __call143_6(net.minecraft.command.ICommandSender a0) throws Throwable;
private static native boolean __call143_7(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __call143_8(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native void __call143_9(net.minecraft.tileentity.TileEntity a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native net.minecraft.nbt.NBTBase __call143_10(net.minecraft.nbt.NBTTagCompound a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __cast143_11(net.minecraft.nbt.NBTBase a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call143_12(net.minecraft.command.ICommandSender a0, java.lang.String[] a1, int a2) throws Throwable;
private static native java.lang.String __call143_13(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call143_14(java.lang.String a0) throws Throwable;
private static native void __call143_15(net.minecraft.nbt.NBTTagCompound a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native int __call143_16(moom.DT a0) throws Throwable;
private static native void __call143_17(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __call143_18(moom.DT a0) throws Throwable;
private static native void __call143_19(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __call143_20(moom.DT a0) throws Throwable;
private static native void __call143_21(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native boolean __call143_22(net.minecraft.nbt.NBTTagCompound a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native java.lang.String __call143_23(net.minecraft.nbt.NBTTagCompound a0) throws Throwable;
private static native void __call143_24(net.minecraft.tileentity.TileEntity a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native void __call143_25(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native void __call143_26(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.command.CommandResultStats$Type __fieldRead143_27() throws Throwable;
private static native void __call143_28(net.minecraft.command.ICommandSender a0, net.minecraft.command.CommandResultStats$Type a1, int a2) throws Throwable;
private static native java.lang.String __call143_29(net.minecraft.nbt.NBTTagCompound a0) throws Throwable;
private static native void __call143_30(net.minecraft.command.ICommandSender a0, moom.pL a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native java.lang.Exception __call3014300_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014301_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014302_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014303_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014304_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.String __call3014305_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014306_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014307_0(net.minecraft.nbt.NBTException a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_84c6b7d974a21079a28c(moom.pL a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, moom.DT a3) throws E;
private static final class __SourceHandler_84c6b7d974a21079a28c {

public static java.util.List f1109(moom.pL receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) throws Throwable {
    int forwardValue1109_15_0;
    java.lang.String[] forwardValue1109_18_0;
    java.util.List forwardValue1109_23_0;
    int spill1109_0;
    java.lang.String[] spill1109_1;
    long life4_3;
    int life6_5;
    forward_join_23: {
    forward_join_22: {
    forward_join_18: {
    forward_join_15: {
    life4_3 = (__fieldRead1109_0() ^ 134168196775599L);
    life6_5 = __integerCategory1109_2(__call1109_1());
    spill1109_0 = (p1).length;
    if (!((life6_5 != 0))) {
        forwardValue1109_15_0 = spill1109_0;
        break forward_join_15;
    }
    if (!((spill1109_0 > 0))) {
        break forward_join_22;
    }
    spill1109_1 = p1;
    if (!((life6_5 != 0))) {
        forwardValue1109_18_0 = spill1109_1;
        break forward_join_18;
    }
    forwardValue1109_15_0 = (spill1109_1).length;
    }
    if (!((forwardValue1109_15_0 <= 3))) {
        break forward_join_22;
    }
    forwardValue1109_18_0 = p1;
    }
    forwardValue1109_23_0 = __call1109_3(forwardValue1109_18_0, 0, p2);
    break forward_join_23;
    }
    forwardValue1109_23_0 = null;
    }
    return forwardValue1109_23_0;
}
public static void h1109_0(moom.Oo p0) throws Throwable {
    throw __call1110900_0(p0);
}
public static void h1109_1(moom.Oo p0) throws Throwable {
    throw __call1110901_0(p0);
}
public static void h1109_2(moom.Oo p0) throws Throwable {
    throw __call1110902_0(p0);
}
public static void h1109_3(moom.Oo p0) throws Throwable {
    throw __call1110903_0(p0);
}
private static native long __fieldRead1109_0() throws Throwable;
private static native boolean __call1109_1() throws Throwable;
private static native int __integerCategory1109_2(boolean value) throws Throwable;
private static native java.util.List __call1109_3(java.lang.String[] a0, int a1, moom.DT a2) throws Throwable;
private static native java.lang.Exception __call1110900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1110901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1110902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1110903_0(moom.Oo a0) throws Throwable;

}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public java.util.List<java.lang.String> a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) { return __sourceHandlerCall_84c6b7d974a21079a28c(this, p0, p1, p2); }


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 { __sourceHandlerCall_e556421aacb2574e98de(this, p0, p1); }


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.blockdata.usage";
}


public int a() {
return 2;
}


public java.lang.String a__String() {
return "blockdata";
}

}
