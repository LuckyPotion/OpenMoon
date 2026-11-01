package moom;


public class pS extends net.minecraft.command.CommandBase {

private static long c;

public pS() {
super();
}


static {
moom.pS.c = (moom._c.a(8229725224456124855L, 8289922916358385433L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(178625324310562L);
}

private static native <E extends Throwable> void __sourceHandlerCall_ea52b97256535f2634d7(moom.pS a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws E;
private static final class __SourceHandler_ea52b97256535f2634d7 {

public static void f482(moom.pS receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws Throwable {
    net.minecraft.enchantment.Enchantment forestValue482_67_0;
    int forestValue482_81_0;
    int forestValue482_98_0;
    net.minecraft.item.ItemStack forestValue482_163_0;
    moom.cc spill482_0;
    moom.b7 spill482_1;
    net.minecraft.enchantment.Enchantment spill482_2;
    moom.b_ spill482_3;
    moom.b_ spill482_4;
    java.lang.String spill482_5;
    java.lang.Object[] spill482_6;
    boolean spill482_7;
    moom.b7 spill482_8;
    net.minecraft.item.ItemStack spill482_9;
    moom.b7 spill482_10;
    moom.b7 spill482_11;
    java.lang.String spill482_12;
    java.lang.Object[] spill482_13;
    java.lang.Object[] spill482_14;
    long life3_3;
    int life5_5;
    net.minecraft.entity.player.EntityPlayerMP life6_22;
    int life7_32;
    int life8_35;
    net.minecraft.item.ItemStack life9_38;
    net.minecraft.enchantment.Enchantment life10_50;
    net.minecraft.nbt.NBTTagList life11_106;
    int life12_113;
    int life13_123;
    net.minecraft.enchantment.Enchantment life14_135;
    forest_join_176: {
    forest_join_163: {
    forest_join_162: {
    forest_join_139: {
    forest_join_98: {
    forest_join_94: {
    forest_join_81: {
    forest_join_79: {
    forest_join_67: {
    forest_join_66: {
    forest_join_47: {
    forest_join_17: {
    life3_3 = (__fieldRead482_0() ^ 229526580343L);
    life5_5 = __integerCategory482_2(__call482_1());
    if (!(((p1).length < 2))) {
        break forest_join_17;
    }
    moom.cc __stackOp482_4_0 = __sourceUninitializedNEW482_3();
    spill482_0 = __stackOp482_4_0;
    __explicitNewInit482_5(__stackOp482_4_0, "commands.enchant.usage", new java.lang.Object[0]);
    throw spill482_0;
    }
    life6_22 = __call482_6(p0, (p1)[0]);
    __call482_8(p0, __fieldRead482_7(), 0);
    life7_32 = __call482_9((p1)[1], 0);
    life8_35 = 1;
    life9_38 = __call482_10(life6_22);
    if (!((life9_38 == null))) {
        break forest_join_47;
    }
    moom.b7 __stackOp482_12_0 = __sourceUninitializedNEW482_11();
    spill482_1 = __stackOp482_12_0;
    __explicitNewInit482_13(__stackOp482_12_0, "commands.enchant.noItem", new java.lang.Object[0]);
    throw spill482_1;
    }
    life10_50 = __call482_14(life7_32);
    spill482_2 = life10_50;
    if (!((life5_5 != 0))) {
        forestValue482_67_0 = spill482_2;
        break forest_join_67;
    }
    if (!((spill482_2 == null))) {
        break forest_join_66;
    }
    moom.b_ __stackOp482_16_0 = __sourceUninitializedNEW482_15();
    spill482_3 = __stackOp482_16_0;
    spill482_4 = __stackOp482_16_0;
    spill482_5 = "commands.enchant.notFound";
    java.lang.Object[] __stackOp482_17_0 = new java.lang.Object[1];
    spill482_6 = __stackOp482_17_0;
    (__stackOp482_17_0)[0] = __call482_18(life7_32);
    __explicitNewInit482_19(spill482_4, spill482_5, spill482_6);
    throw spill482_3;
    }
    forestValue482_67_0 = life10_50;
    }
    spill482_7 = __call482_20(forestValue482_67_0, life9_38);
    if (!((life5_5 != 0))) {
        forestValue482_81_0 = __integerCategory482_21(spill482_7);
        break forest_join_81;
    }
    if (!((!spill482_7))) {
        break forest_join_79;
    }
    moom.b7 __stackOp482_23_0 = __sourceUninitializedNEW482_22();
    spill482_8 = __stackOp482_23_0;
    __explicitNewInit482_24(__stackOp482_23_0, "commands.enchant.cantEnchant", new java.lang.Object[0]);
    throw spill482_8;
    }
    forestValue482_81_0 = (p1).length;
    }
    if (!((life5_5 != 0))) {
        forestValue482_98_0 = forestValue482_81_0;
        break forest_join_98;
    }
    if (!((forestValue482_81_0 >= 3))) {
        break forest_join_94;
    }
    life8_35 = __call482_27((p1)[2], __call482_25(life10_50), __call482_26(life10_50));
    }
    spill482_9 = life9_38;
    if (!((life5_5 != 0))) {
        forestValue482_163_0 = spill482_9;
        break forest_join_163;
    }
    forestValue482_98_0 = __integerCategory482_29(__call482_28(spill482_9));
    }
    if (!((forestValue482_98_0 != 0))) {
        break forest_join_162;
    }
    life11_106 = __call482_30(life9_38);
    if (!((life5_5 != 0))) {
        break forest_join_176;
    }
    if (!((life11_106 != null))) {
        break forest_join_162;
    }
    life12_113 = 0;
    forest_cycle_108: while (true) {
    forest_join_136: {
    forest_join_135: {
    if (!((life12_113 < __call482_31(life11_106)))) {
        break forest_join_162;
    }
    life13_123 = __call482_33(__call482_32(life11_106, life12_113), "id");
    if (!((life5_5 != 0))) {
        break forest_join_176;
    }
    if (!((life5_5 != 0))) {
        break forest_join_136;
    }
    if (!((__call482_34(life13_123) != null))) {
        break forest_join_135;
    }
    life14_135 = __call482_35(life13_123);
    if (!((life5_5 != 0))) {
        break forest_join_136;
    }
    if (!((!__call482_36(life14_135, life10_50)))) {
        break forest_join_135;
    }
    break forest_join_139;
    }
    life12_113 += 1;
    }
    if (!((life5_5 == 0))) {
        continue forest_cycle_108;
    }
    break forest_cycle_108;
    }
    break forest_join_162;
    }
    moom.b7 __stackOp482_38_0 = __sourceUninitializedNEW482_37();
    spill482_10 = __stackOp482_38_0;
    spill482_11 = __stackOp482_38_0;
    spill482_12 = "commands.enchant.cantCombine";
    java.lang.Object[] __stackOp482_39_0 = new java.lang.Object[2];
    spill482_13 = __stackOp482_39_0;
    (__stackOp482_39_0)[0] = __call482_40(life10_50, life8_35);
    java.lang.Object[] __stackOp482_41_0 = spill482_13;
    spill482_14 = __stackOp482_41_0;
    (__stackOp482_41_0)[1] = __call482_44(life14_135, __call482_43(__call482_42(life11_106, life12_113), "lvl"));
    __explicitNewInit482_45(spill482_11, spill482_12, spill482_14);
    throw spill482_10;
    }
    forestValue482_163_0 = life9_38;
    }
    __call482_46(forestValue482_163_0, life10_50, life8_35);
    __call482_47(p0, receiver, "commands.enchant.success", new java.lang.Object[0]);
    __call482_49(p0, __fieldRead482_48(), 1);
    }
    return;
}
public static void h482_0(moom.b_ p0) throws Throwable {
    throw __call3048200_0(p0);
}
public static void h482_1(moom.b_ p0, moom.pS p1, net.minecraft.command.ICommandSender p2, java.lang.String[] p3, int p4, net.minecraft.entity.player.EntityPlayerMP p5, int p6) throws Throwable {
    net.minecraft.enchantment.Enchantment forestValue3048201_14_0;
    net.minecraft.enchantment.Enchantment forestValue3048201_50_0;
    int forestValue3048201_64_0;
    int forestValue3048201_81_0;
    net.minecraft.item.ItemStack forestValue3048201_146_0;
    net.minecraft.enchantment.Enchantment spill3048201_0;
    moom.b7 spill3048201_1;
    net.minecraft.enchantment.Enchantment spill3048201_2;
    moom.b_ spill3048201_3;
    moom.b_ spill3048201_4;
    java.lang.String spill3048201_5;
    java.lang.Object[] spill3048201_6;
    boolean spill3048201_7;
    moom.b7 spill3048201_8;
    net.minecraft.item.ItemStack spill3048201_9;
    moom.b7 spill3048201_10;
    moom.b7 spill3048201_11;
    java.lang.String spill3048201_12;
    java.lang.Object[] spill3048201_13;
    java.lang.Object[] spill3048201_14;
    moom.b_ life7_2;
    net.minecraft.enchantment.Enchantment life8_7;
    int life6_17;
    int life7_19;
    net.minecraft.item.ItemStack life8_22;
    net.minecraft.enchantment.Enchantment life9_34;
    net.minecraft.nbt.NBTTagList life10_90;
    int life11_97;
    int life12_107;
    net.minecraft.enchantment.Enchantment life13_119;
    forest_join_159: {
    forest_join_146: {
    forest_join_145: {
    forest_join_122: {
    forest_join_81: {
    forest_join_77: {
    forest_join_64: {
    forest_join_62: {
    forest_join_50: {
    forest_join_49: {
    forest_join_30: {
    forest_join_14: {
    forest_join_13: {
    life7_2 = p0;
    life8_7 = __call3048201_0((p3)[1]);
    spill3048201_0 = life8_7;
    if (!((p4 != 0))) {
        forestValue3048201_14_0 = spill3048201_0;
        break forest_join_14;
    }
    if (!((spill3048201_0 == null))) {
        break forest_join_13;
    }
    throw life7_2;
    }
    forestValue3048201_14_0 = life8_7;
    }
    life6_17 = __fieldRead3048201_1(forestValue3048201_14_0);
    life7_19 = 1;
    life8_22 = __call3048201_2(p5);
    if (!((life8_22 == null))) {
        break forest_join_30;
    }
    moom.b7 __stackOp3048201_4_0 = __sourceUninitializedNEW3048201_3();
    spill3048201_1 = __stackOp3048201_4_0;
    __explicitNewInit3048201_5(__stackOp3048201_4_0, "commands.enchant.noItem", new java.lang.Object[0]);
    throw spill3048201_1;
    }
    life9_34 = __call3048201_6(life6_17);
    spill3048201_2 = life9_34;
    if (!((p4 != 0))) {
        forestValue3048201_50_0 = spill3048201_2;
        break forest_join_50;
    }
    if (!((spill3048201_2 == null))) {
        break forest_join_49;
    }
    moom.b_ __stackOp3048201_8_0 = __sourceUninitializedNEW3048201_7();
    spill3048201_3 = __stackOp3048201_8_0;
    spill3048201_4 = __stackOp3048201_8_0;
    spill3048201_5 = "commands.enchant.notFound";
    java.lang.Object[] __stackOp3048201_9_0 = new java.lang.Object[1];
    spill3048201_6 = __stackOp3048201_9_0;
    (__stackOp3048201_9_0)[0] = __call3048201_10(life6_17);
    __explicitNewInit3048201_11(spill3048201_4, spill3048201_5, spill3048201_6);
    throw spill3048201_3;
    }
    forestValue3048201_50_0 = life9_34;
    }
    spill3048201_7 = __call3048201_12(forestValue3048201_50_0, life8_22);
    if (!((p4 != 0))) {
        forestValue3048201_64_0 = __integerCategory3048201_13(spill3048201_7);
        break forest_join_64;
    }
    if (!((!spill3048201_7))) {
        break forest_join_62;
    }
    moom.b7 __stackOp3048201_15_0 = __sourceUninitializedNEW3048201_14();
    spill3048201_8 = __stackOp3048201_15_0;
    __explicitNewInit3048201_16(__stackOp3048201_15_0, "commands.enchant.cantEnchant", new java.lang.Object[0]);
    throw spill3048201_8;
    }
    forestValue3048201_64_0 = (p3).length;
    }
    if (!((p4 != 0))) {
        forestValue3048201_81_0 = forestValue3048201_64_0;
        break forest_join_81;
    }
    if (!((forestValue3048201_64_0 >= 3))) {
        break forest_join_77;
    }
    life7_19 = __call3048201_19((p3)[2], __call3048201_17(life9_34), __call3048201_18(life9_34));
    }
    spill3048201_9 = life8_22;
    if (!((p4 != 0))) {
        forestValue3048201_146_0 = spill3048201_9;
        break forest_join_146;
    }
    forestValue3048201_81_0 = __integerCategory3048201_21(__call3048201_20(spill3048201_9));
    }
    if (!((forestValue3048201_81_0 != 0))) {
        break forest_join_145;
    }
    life10_90 = __call3048201_22(life8_22);
    if (!((p4 != 0))) {
        break forest_join_159;
    }
    if (!((life10_90 != null))) {
        break forest_join_145;
    }
    life11_97 = 0;
    forest_cycle_91: while (true) {
    forest_join_119: {
    forest_join_118: {
    if (!((life11_97 < __call3048201_23(life10_90)))) {
        break forest_join_145;
    }
    life12_107 = __call3048201_25(__call3048201_24(life10_90, life11_97), "id");
    if (!((p4 != 0))) {
        break forest_join_159;
    }
    if (!((p4 != 0))) {
        break forest_join_119;
    }
    if (!((__call3048201_26(life12_107) != null))) {
        break forest_join_118;
    }
    life13_119 = __call3048201_27(life12_107);
    if (!((p4 != 0))) {
        break forest_join_119;
    }
    if (!((!__call3048201_28(life13_119, life9_34)))) {
        break forest_join_118;
    }
    break forest_join_122;
    }
    life11_97 += 1;
    }
    if (!((p4 == 0))) {
        continue forest_cycle_91;
    }
    break forest_cycle_91;
    }
    break forest_join_145;
    }
    moom.b7 __stackOp3048201_30_0 = __sourceUninitializedNEW3048201_29();
    spill3048201_10 = __stackOp3048201_30_0;
    spill3048201_11 = __stackOp3048201_30_0;
    spill3048201_12 = "commands.enchant.cantCombine";
    java.lang.Object[] __stackOp3048201_31_0 = new java.lang.Object[2];
    spill3048201_13 = __stackOp3048201_31_0;
    (__stackOp3048201_31_0)[0] = __call3048201_32(life9_34, life7_19);
    java.lang.Object[] __stackOp3048201_33_0 = spill3048201_13;
    spill3048201_14 = __stackOp3048201_33_0;
    (__stackOp3048201_33_0)[1] = __call3048201_36(life13_119, __call3048201_35(__call3048201_34(life10_90, life11_97), "lvl"));
    __explicitNewInit3048201_37(spill3048201_11, spill3048201_12, spill3048201_14);
    throw spill3048201_10;
    }
    forestValue3048201_146_0 = life8_22;
    }
    __call3048201_38(forestValue3048201_146_0, life9_34, life7_19);
    __call3048201_39(p2, p1, "commands.enchant.success", new java.lang.Object[0]);
    __call3048201_41(p2, __fieldRead3048201_40(), 1);
    }
    return;
}
public static void h482_2(moom.b_ p0) throws Throwable {
    throw __call3048202_0(p0);
}
public static void h482_3(moom.b_ p0) throws Throwable {
    throw __call3048203_0(p0);
}
public static void h482_4(moom.b_ p0) throws Throwable {
    throw __call3048204_0(p0);
}
public static void h482_5(moom.b_ p0) throws Throwable {
    throw __call3048205_0(p0);
}
public static void h482_6(moom.b_ p0) throws Throwable {
    throw __call3048206_0(p0);
}
public static void h482_7(moom.b_ p0) throws Throwable {
    throw __call3048207_0(p0);
}
public static void h482_8(moom.b_ p0) throws Throwable {
    throw __call3048208_0(p0);
}
public static void h482_9(moom.b_ p0) throws Throwable {
    throw __call3048209_0(p0);
}
public static void h482_10(moom.b_ p0) throws Throwable {
    throw __call3048210_0(p0);
}
public static void h482_11(moom.b_ p0) throws Throwable {
    throw __call3048211_0(p0);
}
public static void h482_12(moom.b_ p0) throws Throwable {
    throw __call3048212_0(p0);
}
public static void h482_13(moom.b_ p0) throws Throwable {
    throw __call3048213_0(p0);
}
public static void h482_14(moom.b_ p0) throws Throwable {
    throw __call3048214_0(p0);
}
public static void h482_15(moom.b_ p0) throws Throwable {
    throw __call3048215_0(p0);
}
private static native long __fieldRead482_0() throws Throwable;
private static native boolean __call482_1() throws Throwable;
private static native int __integerCategory482_2(boolean value) throws Throwable;
private static native moom.cc __sourceUninitializedNEW482_3() throws Throwable;
private static native void __explicitNewInit482_5(moom.cc a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayerMP __call482_6(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.command.CommandResultStats$Type __fieldRead482_7() throws Throwable;
private static native void __call482_8(net.minecraft.command.ICommandSender a0, net.minecraft.command.CommandResultStats$Type a1, int a2) throws Throwable;
private static native int __call482_9(java.lang.String a0, int a1) throws Throwable;
private static native net.minecraft.item.ItemStack __call482_10(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native moom.b7 __sourceUninitializedNEW482_11() throws Throwable;
private static native void __explicitNewInit482_13(moom.b7 a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native net.minecraft.enchantment.Enchantment __call482_14(int a0) throws Throwable;
private static native moom.b_ __sourceUninitializedNEW482_15() throws Throwable;
private static native java.lang.Integer __call482_18(int a0) throws Throwable;
private static native void __explicitNewInit482_19(moom.b_ a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native boolean __call482_20(net.minecraft.enchantment.Enchantment a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native int __integerCategory482_21(boolean value) throws Throwable;
private static native moom.b7 __sourceUninitializedNEW482_22() throws Throwable;
private static native void __explicitNewInit482_24(moom.b7 a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native int __call482_25(net.minecraft.enchantment.Enchantment a0) throws Throwable;
private static native int __call482_26(net.minecraft.enchantment.Enchantment a0) throws Throwable;
private static native int __call482_27(java.lang.String a0, int a1, int a2) throws Throwable;
private static native boolean __call482_28(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __integerCategory482_29(boolean value) throws Throwable;
private static native net.minecraft.nbt.NBTTagList __call482_30(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __call482_31(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call482_32(net.minecraft.nbt.NBTTagList a0, int a1) throws Throwable;
private static native short __call482_33(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.enchantment.Enchantment __call482_34(int a0) throws Throwable;
private static native net.minecraft.enchantment.Enchantment __call482_35(int a0) throws Throwable;
private static native boolean __call482_36(net.minecraft.enchantment.Enchantment a0, net.minecraft.enchantment.Enchantment a1) throws Throwable;
private static native moom.b7 __sourceUninitializedNEW482_37() throws Throwable;
private static native java.lang.String __call482_40(net.minecraft.enchantment.Enchantment a0, int a1) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call482_42(net.minecraft.nbt.NBTTagList a0, int a1) throws Throwable;
private static native short __call482_43(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call482_44(net.minecraft.enchantment.Enchantment a0, short a1) throws Throwable;
private static native void __explicitNewInit482_45(moom.b7 a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native void __call482_46(net.minecraft.item.ItemStack a0, net.minecraft.enchantment.Enchantment a1, int a2) throws Throwable;
private static native void __call482_47(net.minecraft.command.ICommandSender a0, moom.pS a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native net.minecraft.command.CommandResultStats$Type __fieldRead482_48() throws Throwable;
private static native void __call482_49(net.minecraft.command.ICommandSender a0, net.minecraft.command.CommandResultStats$Type a1, int a2) throws Throwable;
private static native java.lang.Exception __call3048200_0(moom.b_ a0) throws Throwable;
private static native net.minecraft.enchantment.Enchantment __call3048201_0(java.lang.String a0) throws Throwable;
private static native int __fieldRead3048201_1(net.minecraft.enchantment.Enchantment a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call3048201_2(net.minecraft.entity.player.EntityPlayerMP a0) throws Throwable;
private static native moom.b7 __sourceUninitializedNEW3048201_3() throws Throwable;
private static native void __explicitNewInit3048201_5(moom.b7 a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native net.minecraft.enchantment.Enchantment __call3048201_6(int a0) throws Throwable;
private static native moom.b_ __sourceUninitializedNEW3048201_7() throws Throwable;
private static native java.lang.Integer __call3048201_10(int a0) throws Throwable;
private static native void __explicitNewInit3048201_11(moom.b_ a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native boolean __call3048201_12(net.minecraft.enchantment.Enchantment a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native int __integerCategory3048201_13(boolean value) throws Throwable;
private static native moom.b7 __sourceUninitializedNEW3048201_14() throws Throwable;
private static native void __explicitNewInit3048201_16(moom.b7 a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native int __call3048201_17(net.minecraft.enchantment.Enchantment a0) throws Throwable;
private static native int __call3048201_18(net.minecraft.enchantment.Enchantment a0) throws Throwable;
private static native int __call3048201_19(java.lang.String a0, int a1, int a2) throws Throwable;
private static native boolean __call3048201_20(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __integerCategory3048201_21(boolean value) throws Throwable;
private static native net.minecraft.nbt.NBTTagList __call3048201_22(net.minecraft.item.ItemStack a0) throws Throwable;
private static native int __call3048201_23(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call3048201_24(net.minecraft.nbt.NBTTagList a0, int a1) throws Throwable;
private static native short __call3048201_25(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.enchantment.Enchantment __call3048201_26(int a0) throws Throwable;
private static native net.minecraft.enchantment.Enchantment __call3048201_27(int a0) throws Throwable;
private static native boolean __call3048201_28(net.minecraft.enchantment.Enchantment a0, net.minecraft.enchantment.Enchantment a1) throws Throwable;
private static native moom.b7 __sourceUninitializedNEW3048201_29() throws Throwable;
private static native java.lang.String __call3048201_32(net.minecraft.enchantment.Enchantment a0, int a1) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call3048201_34(net.minecraft.nbt.NBTTagList a0, int a1) throws Throwable;
private static native short __call3048201_35(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call3048201_36(net.minecraft.enchantment.Enchantment a0, short a1) throws Throwable;
private static native void __explicitNewInit3048201_37(moom.b7 a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native void __call3048201_38(net.minecraft.item.ItemStack a0, net.minecraft.enchantment.Enchantment a1, int a2) throws Throwable;
private static native void __call3048201_39(net.minecraft.command.ICommandSender a0, moom.pS a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native net.minecraft.command.CommandResultStats$Type __fieldRead3048201_40() throws Throwable;
private static native void __call3048201_41(net.minecraft.command.ICommandSender a0, net.minecraft.command.CommandResultStats$Type a1, int a2) throws Throwable;
private static native java.lang.Exception __call3048202_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3048203_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3048204_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3048205_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3048206_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3048207_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3048208_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3048209_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3048210_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3048211_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3048212_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3048213_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3048214_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3048215_0(moom.b_ a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_16fd62ab7573bda7c913(moom.pS a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, moom.DT a3) throws E;
private static final class __SourceHandler_16fd62ab7573bda7c913 {

public static java.util.List f1120(moom.pS receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) throws Throwable {
    int forwardValue1120_22_0;
    int forwardValue1120_22_1;
    java.lang.String[] forwardValue1120_24_0;
    java.util.List forwardValue1120_28_0;
    int spill1120_0;
    int spill1120_1;
    java.lang.String[] spill1120_2;
    long life4_3;
    int life6_5;
    forward_join_28: {
    forward_join_27: {
    forward_join_24: {
    forward_join_22: {
    forward_join_17: {
    life4_3 = (__fieldRead1120_0() ^ 78330069466612L);
    life6_5 = __integerCategory1120_2(__call1120_1());
    spill1120_0 = (p1).length;
    spill1120_1 = 1;
    if (!((life6_5 != 0))) {
        forwardValue1120_22_0 = spill1120_0;
        forwardValue1120_22_1 = spill1120_1;
        break forward_join_22;
    }
    if (!((spill1120_0 == spill1120_1))) {
        break forward_join_17;
    }
    forwardValue1120_28_0 = __call1120_4(p1, __call1120_3(receiver));
    break forward_join_28;
    }
    spill1120_2 = p1;
    if (!((life6_5 != 0))) {
        forwardValue1120_24_0 = spill1120_2;
        break forward_join_24;
    }
    forwardValue1120_22_0 = (spill1120_2).length;
    forwardValue1120_22_1 = 2;
    }
    if (!((forwardValue1120_22_0 == forwardValue1120_22_1))) {
        break forward_join_27;
    }
    forwardValue1120_24_0 = p1;
    }
    forwardValue1120_28_0 = __call1120_6(forwardValue1120_24_0, __call1120_5());
    break forward_join_28;
    }
    forwardValue1120_28_0 = null;
    }
    return forwardValue1120_28_0;
}
public static void h1120_0(moom.Oo p0) throws Throwable {
    throw __call1112000_0(p0);
}
public static void h1120_1(moom.Oo p0) throws Throwable {
    throw __call1112001_0(p0);
}
public static void h1120_2(moom.Oo p0) throws Throwable {
    throw __call1112002_0(p0);
}
private static native long __fieldRead1120_0() throws Throwable;
private static native boolean __call1120_1() throws Throwable;
private static native int __integerCategory1120_2(boolean value) throws Throwable;
private static native java.lang.String[] __call1120_3(moom.pS a0) throws Throwable;
private static native java.util.List __call1120_4(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native java.util.Set __call1120_5() throws Throwable;
private static native java.util.List __call1120_6(java.lang.String[] a0, java.util.Set a1) throws Throwable;
private static native java.lang.Exception __call1112000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1112001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1112002_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_e2302f15e7c9054bcf4e(moom.pS a0, java.lang.String[] a1, int a2) throws E;
private static final class __SourceHandler_e2302f15e7c9054bcf4e {

public static boolean f1121(moom.pS receiver, java.lang.String[] p0, int p1) throws Throwable {
    int forwardValue1121_11_0;
    int forwardValue1121_13_0;
    int spill1121_0;
    long life3_3;
    int life5_5;
    forward_join_13: {
    forward_join_12: {
    forward_join_11: {
    life3_3 = (__fieldRead1121_0() ^ 140295886769647L);
    life5_5 = __integerCategory1121_2(__call1121_1());
    spill1121_0 = p1;
    if (!((life5_5 != 0))) {
        forwardValue1121_11_0 = spill1121_0;
        break forward_join_11;
    }
    if (!((spill1121_0 == 0))) {
        break forward_join_12;
    }
    forwardValue1121_11_0 = 1;
    }
    forwardValue1121_13_0 = forwardValue1121_11_0;
    break forward_join_13;
    }
    forwardValue1121_13_0 = 0;
    }
    return __integerCategory1121_3(forwardValue1121_13_0);
}
public static void h1121_0(moom.Oo p0) throws Throwable {
    throw __call1112100_0(p0);
}
private static native long __fieldRead1121_0() throws Throwable;
private static native boolean __call1121_1() throws Throwable;
private static native int __integerCategory1121_2(boolean value) throws Throwable;
private static native boolean __integerCategory1121_3(int value) throws Throwable;
private static native java.lang.Exception __call1112100_0(moom.Oo a0) throws Throwable;

}


public java.util.List<java.lang.String> a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) { return __sourceHandlerCall_16fd62ab7573bda7c913(this, p0, p1, p2); }


protected java.lang.String[] a__ArrayString() {
return ((moom.Bl)(moom.Bl.a__Bl())).a__ArrayString();
}


public boolean a__Boolean(java.lang.String[] p0, int p1) { return __sourceHandlerCall_e2302f15e7c9054bcf4e(this, p0, p1); }


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public java.lang.String a__String() {
return "enchant";
}


public int a() {
return 2;
}


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.enchant.usage";
}


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 { __sourceHandlerCall_ea52b97256535f2634d7(this, p0, p1); }

}
