package moom;


public class pM extends net.minecraft.command.CommandBase {

private static long c;

public pM() {
super();
}


static {
moom.pM.c = (moom._c.a(2635420909388608074L, 2378041054734780108L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(63961349058556L);
}

private static native <E extends Throwable> void __sourceHandlerCall_42a487d77bfc0b9c625c(moom.pM a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws E;
private static final class __SourceHandler_42a487d77bfc0b9c625c {

public static void f144(moom.pM receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws Throwable {
    net.minecraft.entity.player.EntityPlayerMP forwardValue144_17_0;
    net.minecraft.item.Item forwardValue144_29_0;
    int forwardValue144_41_0;
    int forwardValue144_43_0;
    int forwardValue144_55_0;
    int forwardValue144_57_0;
    java.lang.String[] forwardValue144_67_0;
    int forwardValue144_98_0;
    int forwardValue144_115_0;
    int forwardValue144_131_0;
    int spill144_0;
    int spill144_1;
    java.lang.String[] spill144_2;
    int spill144_3;
    boolean spill144_4;
    long life3_3;
    int life5_5;
    net.minecraft.entity.player.EntityPlayerMP life6_19;
    net.minecraft.item.Item life7_33;
    int life8_53;
    int life9_73;
    net.minecraft.nbt.NBTTagCompound life10_75;
    int life11_139;
    forward_join_168: {
    forward_join_152: {
    forward_join_131: {
    forward_join_130: {
    forward_join_115: {
    forward_join_110: {
    forward_join_98: {
    forward_join_91: {
    forward_join_71: {
    forward_join_67: {
    forward_join_57: {
    forward_join_56: {
    forward_join_55: {
    forward_join_43: {
    forward_join_42: {
    forward_join_41: {
    forward_join_29: {
    forward_join_28: {
    forward_join_17: {
    forward_join_12: {
    life3_3 = (__fieldRead144_0() ^ 19917922168812L);
    life5_5 = __integerCategory144_2(__call144_1());
    if (!(((p1).length == 0))) {
        break forward_join_12;
    }
    forwardValue144_17_0 = __call144_3(p0);
    break forward_join_17;
    }
    forwardValue144_17_0 = __call144_4(p0, (p1)[0]);
    }
    life6_19 = forwardValue144_17_0;
    if (!(((p1).length >= 2))) {
        break forward_join_28;
    }
    forwardValue144_29_0 = __call144_5(p0, (p1)[1]);
    break forward_join_29;
    }
    forwardValue144_29_0 = null;
    }
    life7_33 = forwardValue144_29_0;
    spill144_0 = (p1).length;
    if (!((life5_5 != 0))) {
        forwardValue144_41_0 = spill144_0;
        break forward_join_41;
    }
    if (!((spill144_0 >= 3))) {
        break forward_join_42;
    }
    forwardValue144_41_0 = __call144_6((p1)[2], -1);
    }
    forwardValue144_43_0 = forwardValue144_41_0;
    break forward_join_43;
    }
    forwardValue144_43_0 = -1;
    }
    life8_53 = forwardValue144_43_0;
    spill144_1 = (p1).length;
    if (!((life5_5 != 0))) {
        forwardValue144_55_0 = spill144_1;
        break forward_join_55;
    }
    if (!((spill144_1 >= 4))) {
        break forward_join_56;
    }
    forwardValue144_55_0 = __call144_7((p1)[3], -1);
    }
    forwardValue144_57_0 = forwardValue144_55_0;
    break forward_join_57;
    }
    forwardValue144_57_0 = -1;
    }
    life9_73 = forwardValue144_57_0;
    life10_75 = null;
    spill144_2 = p1;
    if (!((life5_5 != 0))) {
        forwardValue144_67_0 = spill144_2;
        break forward_join_67;
    }
    if (!(((spill144_2).length >= 5))) {
        break forward_join_71;
    }
    forwardValue144_67_0 = p1;
    }
    life10_75 = __call144_9(__call144_8(forwardValue144_67_0, 4));
    }
    spill144_3 = (p1).length;
    if (!((life5_5 != 0))) {
        forwardValue144_98_0 = spill144_3;
        break forward_join_98;
    }
    if (!((spill144_3 >= 2))) {
        break forward_join_91;
    }
    if (!((life7_33 == null))) {
        break forward_join_91;
    }
    throw new moom.b7("commands.clear.failure", new java.lang.Object[] {__call144_10(life6_19)});
    }
    forwardValue144_98_0 = __call144_12(__fieldRead144_11(life6_19), life7_33, life8_53, life9_73, life10_75);
    }
    life11_139 = forwardValue144_98_0;
    __call144_14(__fieldRead144_13(life6_19));
    spill144_4 = __fieldRead144_16(__fieldRead144_15(life6_19));
    if (!((life5_5 != 0))) {
        forwardValue144_115_0 = __integerCategory144_17(spill144_4);
        break forward_join_115;
    }
    if (!((!spill144_4))) {
        break forward_join_110;
    }
    __call144_18(life6_19);
    }
    __call144_20(p0, __fieldRead144_19(), life11_139);
    forwardValue144_115_0 = life11_139;
    }
    if (!((life5_5 != 0))) {
        forwardValue144_131_0 = forwardValue144_115_0;
        break forward_join_131;
    }
    if (!((forwardValue144_115_0 == 0))) {
        break forward_join_130;
    }
    throw new moom.b7("commands.clear.failure", new java.lang.Object[] {__call144_21(life6_19)});
    }
    forwardValue144_131_0 = life9_73;
    }
    if (!((forwardValue144_131_0 == 0))) {
        break forward_join_152;
    }
    __call144_24(p0, new moom.CN("commands.clear.testing", new java.lang.Object[] {__call144_22(life6_19), __call144_23(life11_139)}));
    if (!((life5_5 == 0))) {
        break forward_join_168;
    }
    }
    __call144_27(p0, receiver, "commands.clear.success", new java.lang.Object[] {__call144_25(life6_19), __call144_26(life11_139)});
    }
    return;
}
public static void h144_0(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014400_0(p0);
}
public static void h144_1(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014401_0(p0);
}
public static void h144_2(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014402_0(p0);
}
public static void h144_3(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014403_0(p0);
}
public static void h144_4(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014404_0(p0);
}
public static void h144_5(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014405_0(p0);
}
public static void h144_6(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014406_0(p0);
}
public static void h144_7(net.minecraft.nbt.NBTException p0, int p1) throws Throwable {
    net.minecraft.nbt.NBTException life1_2;
    life1_2 = p0;
    throw new moom.b7("commands.clear.tagError", new java.lang.Object[] {__call3014407_0(life1_2)});
}
public static void h144_8(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014408_0(p0);
}
public static void h144_9(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014409_0(p0);
}
public static void h144_10(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014410_0(p0);
}
public static void h144_11(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014411_0(p0);
}
public static void h144_12(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014412_0(p0);
}
public static void h144_13(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014413_0(p0);
}
public static void h144_14(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014414_0(p0);
}
public static void h144_15(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014415_0(p0);
}
public static void h144_16(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3014416_0(p0);
}
private static native long __fieldRead144_0() throws Throwable;
private static native boolean __call144_1() throws Throwable;
private static native int __integerCategory144_2(boolean value) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __call144_3(net.minecraft.command.ICommandSender a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __call144_4(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.item.Item __call144_5(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native int __call144_6(java.lang.String a0, int a1) throws Throwable;
private static native int __call144_7(java.lang.String a0, int a1) throws Throwable;
private static native java.lang.String __call144_8(java.lang.String[] a0, int a1) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call144_9(java.lang.String a0) throws Throwable;
private static native java.lang.String __call144_10(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.entity.player.InventoryPlayer __fieldRead144_11(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native int __call144_12(net.minecraft.entity.player.InventoryPlayer a0, net.minecraft.item.Item a1, int a2, int a3, net.minecraft.nbt.NBTTagCompound a4) throws Throwable;
private static native moom.v8 __fieldRead144_13(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native void __call144_14(moom.v8 a0) throws Throwable;
private static native net.minecraft.entity.player.PlayerCapabilities __fieldRead144_15(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native boolean __fieldRead144_16(net.minecraft.entity.player.PlayerCapabilities a0) throws Throwable;
private static native int __integerCategory144_17(boolean value) throws Throwable;
private static native void __call144_18(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native net.minecraft.command.CommandResultStats$Type __fieldRead144_19() throws Throwable;
private static native void __call144_20(net.minecraft.command.ICommandSender a0, net.minecraft.command.CommandResultStats$Type a1, int a2) throws Throwable;
private static native java.lang.String __call144_21(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native java.lang.String __call144_22(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native java.lang.Integer __call144_23(int a0) throws Throwable;
private static native void __call144_24(net.minecraft.command.ICommandSender a0, moom.CN a1) throws Throwable;
private static native java.lang.String __call144_25(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native java.lang.Integer __call144_26(int a0) throws Throwable;
private static native void __call144_27(net.minecraft.command.ICommandSender a0, moom.pM a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native java.lang.Exception __call3014400_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014401_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014402_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014403_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014404_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014405_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014406_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.String __call3014407_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014408_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014409_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014410_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014411_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014412_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014413_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014414_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014415_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3014416_0(net.minecraft.nbt.NBTException a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_99b73c5cff3646c67137(moom.pM a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, moom.DT a3) throws E;
private static final class __SourceHandler_99b73c5cff3646c67137 {

public static java.util.List f1110(moom.pM receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) throws Throwable {
    int forwardValue1110_22_0;
    int forwardValue1110_22_1;
    java.lang.String[] forwardValue1110_24_0;
    java.util.List forwardValue1110_29_0;
    int spill1110_0;
    int spill1110_1;
    java.lang.String[] spill1110_2;
    long life4_3;
    int life6_5;
    forward_join_29: {
    forward_join_28: {
    forward_join_24: {
    forward_join_22: {
    forward_join_17: {
    life4_3 = (__fieldRead1110_0() ^ 93550083735151L);
    life6_5 = __integerCategory1110_2(__call1110_1());
    spill1110_0 = (p1).length;
    spill1110_1 = 1;
    if (!((life6_5 == 0))) {
        forwardValue1110_22_0 = spill1110_0;
        forwardValue1110_22_1 = spill1110_1;
        break forward_join_22;
    }
    if (!((spill1110_0 == spill1110_1))) {
        break forward_join_17;
    }
    forwardValue1110_29_0 = __call1110_4(p1, __call1110_3(receiver));
    break forward_join_29;
    }
    spill1110_2 = p1;
    if (!((life6_5 == 0))) {
        forwardValue1110_24_0 = spill1110_2;
        break forward_join_24;
    }
    forwardValue1110_22_0 = (spill1110_2).length;
    forwardValue1110_22_1 = 2;
    }
    if (!((forwardValue1110_22_0 == forwardValue1110_22_1))) {
        break forward_join_28;
    }
    forwardValue1110_24_0 = p1;
    }
    forwardValue1110_29_0 = __call1110_7(forwardValue1110_24_0, __call1110_6(__fieldRead1110_5()));
    break forward_join_29;
    }
    forwardValue1110_29_0 = null;
    }
    return forwardValue1110_29_0;
}
public static void h1110_0(moom.Oo p0) throws Throwable {
    throw __call1111000_0(p0);
}
public static void h1110_1(moom.Oo p0) throws Throwable {
    throw __call1111001_0(p0);
}
public static void h1110_2(moom.Oo p0) throws Throwable {
    throw __call1111002_0(p0);
}
private static native long __fieldRead1110_0() throws Throwable;
private static native boolean __call1110_1() throws Throwable;
private static native int __integerCategory1110_2(boolean value) throws Throwable;
private static native java.lang.String[] __call1110_3(moom.pM a0) throws Throwable;
private static native java.util.List __call1110_4(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native moom.DB __fieldRead1110_5() throws Throwable;
private static native java.util.Set __call1110_6(moom.DB a0) throws Throwable;
private static native java.util.List __call1110_7(java.lang.String[] a0, java.util.Set a1) throws Throwable;
private static native java.lang.Exception __call1111000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1111001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1111002_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_01da1169c99233979d94(moom.pM a0, java.lang.String[] a1, int a2) throws E;
private static final class __SourceHandler_01da1169c99233979d94 {

public static boolean f1111(moom.pM receiver, java.lang.String[] p0, int p1) throws Throwable {
    int forwardValue1111_11_0;
    int forwardValue1111_13_0;
    int spill1111_0;
    long life3_3;
    int life5_5;
    forward_join_13: {
    forward_join_12: {
    forward_join_11: {
    life3_3 = (__fieldRead1111_0() ^ 120610701954676L);
    life5_5 = __integerCategory1111_2(__call1111_1());
    spill1111_0 = p1;
    if (!((life5_5 == 0))) {
        forwardValue1111_11_0 = spill1111_0;
        break forward_join_11;
    }
    if (!((spill1111_0 == 0))) {
        break forward_join_12;
    }
    forwardValue1111_11_0 = 1;
    }
    forwardValue1111_13_0 = forwardValue1111_11_0;
    break forward_join_13;
    }
    forwardValue1111_13_0 = 0;
    }
    return __integerCategory1111_3(forwardValue1111_13_0);
}
public static void h1111_0(moom.Oo p0) throws Throwable {
    throw __call1111100_0(p0);
}
private static native long __fieldRead1111_0() throws Throwable;
private static native boolean __call1111_1() throws Throwable;
private static native int __integerCategory1111_2(boolean value) throws Throwable;
private static native boolean __integerCategory1111_3(int value) throws Throwable;
private static native java.lang.Exception __call1111100_0(moom.Oo a0) throws Throwable;

}


public java.util.List<java.lang.String> a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) { return __sourceHandlerCall_99b73c5cff3646c67137(this, p0, p1, p2); }


protected java.lang.String[] a__ArrayString() {
return ((moom.Bl)(moom.Bl.a__Bl())).a__ArrayString();
}


public boolean a__Boolean(java.lang.String[] p0, int p1) { return __sourceHandlerCall_01da1169c99233979d94(this, p0, p1); }


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public java.lang.String a__String() {
return "clear";
}


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.clear.usage";
}


public int a() {
return 2;
}


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 { __sourceHandlerCall_42a487d77bfc0b9c625c(this, p0, p1); }

}
