package net.minecraft.tileentity;


public abstract class TileEntity {

private static org.apache.logging.log4j.Logger a;

private static java.util.Map<java.lang.String, java.lang.Class<? extends net.minecraft.tileentity.TileEntity>> b;

private static java.util.Map<java.lang.Class<? extends net.minecraft.tileentity.TileEntity>, java.lang.String> c;

protected net.minecraft.world.World d;

protected moom.DT e;

protected boolean f;

private int g;

protected net.minecraft.block.Block h;

public boolean i;

private org.lwjgl.util.vector.Vector4f j;

private static int k;

private static long z;

public TileEntity() {
super();
    this.e = moom.DT.f;
    this.g = -1;
}


static {
z = ((long)(((moom._a)(moom._c.a(((long)(4495727783455642128L)), ((long)(-7088043539075824011L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(75601998613842L)))));
    a = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
    int __sourceSpill3482_9 = 18;
    b = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    c = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    net.minecraft.tileentity.TileEntity.b(((int)(__sourceSpill3482_9)));
    net.minecraft.tileentity.TileEntity.a(((java.lang.Class)(net.minecraft.tileentity.TileEntityFurnace.class)), ((java.lang.String)("Furnace")));
    net.minecraft.tileentity.TileEntity.a(((java.lang.Class)(net.minecraft.tileentity.TileEntityChest.class)), ((java.lang.String)("Chest")));
    net.minecraft.tileentity.TileEntity.a(((java.lang.Class)(moom.Cg.class)), ((java.lang.String)("EnderChest")));
    net.minecraft.tileentity.TileEntity.a(((java.lang.Class)(moom.B_.class)), ((java.lang.String)("RecordPlayer")));
    net.minecraft.tileentity.TileEntity.a(((java.lang.Class)(moom.Cm.class)), ((java.lang.String)("Trap")));
    net.minecraft.tileentity.TileEntity.a(((java.lang.Class)(moom.Cn.class)), ((java.lang.String)("Dropper")));
    net.minecraft.tileentity.TileEntity.a(((java.lang.Class)(moom.Ct.class)), ((java.lang.String)("Sign")));
    net.minecraft.tileentity.TileEntity.a(((java.lang.Class)(moom.Cq.class)), ((java.lang.String)("MobSpawner")));
    net.minecraft.tileentity.TileEntity.a(((java.lang.Class)(moom.Cr.class)), ((java.lang.String)("Music")));
    net.minecraft.tileentity.TileEntity.a(((java.lang.Class)(net.minecraft.tileentity.TileEntityPiston.class)), ((java.lang.String)("Piston")));
    net.minecraft.tileentity.TileEntity.a(((java.lang.Class)(net.minecraft.tileentity.TileEntityBrewingStand.class)), ((java.lang.String)("Cauldron")));
    net.minecraft.tileentity.TileEntity.a(((java.lang.Class)(moom.Ce.class)), ((java.lang.String)("EnchantTable")));
    net.minecraft.tileentity.TileEntity.a(((java.lang.Class)(net.minecraft.tileentity.TileEntityEndPortal.class)), ((java.lang.String)("Airportal")));
    net.minecraft.tileentity.TileEntity.a(((java.lang.Class)(net.minecraft.tileentity.TileEntityCommandBlock.class)), ((java.lang.String)("Control")));
    net.minecraft.tileentity.TileEntity.a(((java.lang.Class)(net.minecraft.tileentity.TileEntityBeacon.class)), ((java.lang.String)("Beacon")));
    net.minecraft.tileentity.TileEntity.a(((java.lang.Class)(net.minecraft.tileentity.TileEntitySkull.class)), ((java.lang.String)("Skull")));
    net.minecraft.tileentity.TileEntity.a(((java.lang.Class)(moom.Cd.class)), ((java.lang.String)("DLDetector")));
    net.minecraft.tileentity.TileEntity.a(((java.lang.Class)(moom.Cp.class)), ((java.lang.String)("Hopper")));
    net.minecraft.tileentity.TileEntity.a(((java.lang.Class)(net.minecraft.tileentity.TileEntityComparator.class)), ((java.lang.String)("Comparator")));
    net.minecraft.tileentity.TileEntity.a(((java.lang.Class)(moom.Ch.class)), ((java.lang.String)("FlowerPot")));
    net.minecraft.tileentity.TileEntity.a(((java.lang.Class)(moom.Ca.class)), ((java.lang.String)("Banner")));
}

private static native <E extends Throwable> moom.CA __sourceHandlerCall_4b97a34f9b8ea1430c1d(net.minecraft.tileentity.TileEntity a0) throws E;
private static final class __SourceHandler_4b97a34f9b8ea1430c1d {

public static moom.CA f708(net.minecraft.tileentity.TileEntity receiver) throws Throwable {
    net.minecraft.block.Block forwardValue708_31_0;
    net.minecraft.block.Block forwardValue708_39_0;
    net.minecraft.block.Block forwardValue708_39_1;
    net.minecraft.block.Block forwardValue708_59_0;
    net.minecraft.block.Block forwardValue708_63_0;
    net.minecraft.block.Block forwardValue708_68_0;
    moom.CA forwardValue708_86_0;
    java.lang.String[] spill708_0;
    net.minecraft.block.Block spill708_1;
    moom.cZ spill708_2;
    net.minecraft.block.Block spill708_3;
    moom.CA spill708_4;
    long life1_3;
    moom.CA life4_5;
    net.minecraft.block.Block life5_9;
    java.lang.String[] life3_10;
    moom.CA life6_102;
    forward_join_86: {
    forward_join_85: {
    forward_join_68: {
    forward_join_63: {
    forward_join_59: {
    forward_join_58: {
    forward_join_40: {
    forward_join_39: {
    forward_join_31: {
    forward_join_30: {
    life1_3 = (__fieldRead708_0() ^ 59833794265004L);
    life4_5 = __fieldRead708_1();
    spill708_0 = __call708_2();
    life5_9 = __fieldRead708_3(receiver);
    life3_10 = spill708_0;
    spill708_1 = life5_9;
    if (!((life3_10 != null))) {
        forwardValue708_31_0 = spill708_1;
        break forward_join_31;
    }
    if (!((spill708_1 == __fieldRead708_4()))) {
        break forward_join_30;
    }
    life4_5 = new moom.CA(__call708_5(receiver), __call708_7(__call708_6(receiver), 1, 1, 1));
    if (!((life3_10 == null))) {
        break forward_join_85;
    }
    }
    forwardValue708_31_0 = life5_9;
    }
    spill708_2 = __fieldRead708_8();
    if (!((life3_10 != null))) {
        forwardValue708_39_0 = forwardValue708_31_0;
        forwardValue708_39_1 = spill708_2;
        break forward_join_39;
    }
    if (!((forwardValue708_31_0 != spill708_2))) {
        break forward_join_40;
    }
    spill708_3 = life5_9;
    if (!((life3_10 != null))) {
        forwardValue708_59_0 = spill708_3;
        break forward_join_59;
    }
    forwardValue708_39_0 = spill708_3;
    forwardValue708_39_1 = __fieldRead708_9();
    }
    if (!((forwardValue708_39_0 == forwardValue708_39_1))) {
        break forward_join_58;
    }
    }
    life4_5 = new moom.CA(__call708_11(__call708_10(receiver), -1, 0, -1), __call708_13(__call708_12(receiver), 2, 2, 2));
    if (!((life3_10 == null))) {
        break forward_join_85;
    }
    }
    forwardValue708_59_0 = life5_9;
    }
    if (!((life3_10 != null))) {
        forwardValue708_63_0 = forwardValue708_59_0;
        break forward_join_63;
    }
    if (!((forwardValue708_59_0 != null))) {
        break forward_join_85;
    }
    forwardValue708_63_0 = life5_9;
    }
    if (!((life3_10 != null))) {
        forwardValue708_68_0 = forwardValue708_63_0;
        break forward_join_68;
    }
    if (!((forwardValue708_63_0 != __fieldRead708_14()))) {
        break forward_join_85;
    }
    forwardValue708_68_0 = life5_9;
    }
    life6_102 = __call708_20(forwardValue708_68_0, __fieldRead708_15(receiver), __call708_16(receiver), __call708_19(__fieldRead708_17(receiver), __call708_18(receiver)));
    spill708_4 = life6_102;
    if (!((life3_10 != null))) {
        forwardValue708_86_0 = spill708_4;
        break forward_join_86;
    }
    if (!((spill708_4 != null))) {
        break forward_join_85;
    }
    life4_5 = life6_102;
    }
    forwardValue708_86_0 = life4_5;
    }
    return forwardValue708_86_0;
}
public static moom.CA h708_0(java.lang.Exception p0) throws Throwable {
    throw __call3070800_0(p0);
}
public static moom.CA h708_1(java.lang.Exception p0) throws Throwable {
    throw __call3070801_0(p0);
}
public static moom.CA h708_2(java.lang.Exception p0) throws Throwable {
    throw __call3070802_0(p0);
}
public static moom.CA h708_3(java.lang.Exception p0) throws Throwable {
    throw __call3070803_0(p0);
}
public static moom.CA h708_4(java.lang.Exception p0) throws Throwable {
    throw __call3070804_0(p0);
}
public static moom.CA h708_5(java.lang.Exception p0) throws Throwable {
    throw __call3070805_0(p0);
}
public static moom.CA h708_6(java.lang.Exception p0) throws Throwable {
    throw __call3070806_0(p0);
}
public static moom.CA h708_7(java.lang.Exception p0) throws Throwable {
    throw __call3070807_0(p0);
}
public static moom.CA h708_8(java.lang.Exception p0, net.minecraft.tileentity.TileEntity p1, java.lang.String[] p2, moom.CA p3, moom.CA p4) throws Throwable {
    moom.CA spill3070808_0;
    moom.CA joinValue3070808_1_0;
    java.lang.Exception life5_2;
    moom.CA life4_18;
    life5_2 = p0;
    life4_18 = new moom.CA(__call3070808_1(__call3070808_0(p1), -1, 0, -1), __call3070808_3(__call3070808_2(p1), 1, 1, 1));
    spill3070808_0 = life4_18;
    if ((p2 != null)) {
        if ((spill3070808_0 != null)) {
        p3 = life4_18;
    } else {
        
    }
        joinValue3070808_1_0 = p3;
    } else {
        joinValue3070808_1_0 = spill3070808_0;
    }
    return joinValue3070808_1_0;
}
public static moom.CA h708_9(java.lang.Exception p0) throws Throwable {
    throw __call3070809_0(p0);
}
private static native long __fieldRead708_0() throws Throwable;
private static native moom.CA __fieldRead708_1() throws Throwable;
private static native java.lang.String[] __call708_2() throws Throwable;
private static native net.minecraft.block.Block __fieldRead708_3(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead708_4() throws Throwable;
private static native moom.DT __call708_5(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native moom.DT __call708_6(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native moom.DT __call708_7(moom.DT a0, int a1, int a2, int a3) throws Throwable;
private static native moom.cZ __fieldRead708_8() throws Throwable;
private static native net.minecraft.block.Block __fieldRead708_9() throws Throwable;
private static native moom.DT __call708_10(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native moom.DT __call708_11(moom.DT a0, int a1, int a2, int a3) throws Throwable;
private static native moom.DT __call708_12(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native moom.DT __call708_13(moom.DT a0, int a1, int a2, int a3) throws Throwable;
private static native moom.cX __fieldRead708_14() throws Throwable;
private static native net.minecraft.world.World __fieldRead708_15(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native moom.DT __call708_16(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead708_17(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native moom.DT __call708_18(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call708_19(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native moom.CA __call708_20(net.minecraft.block.Block a0, net.minecraft.world.World a1, moom.DT a2, net.minecraft.block.state.IBlockState a3) throws Throwable;
private static native java.lang.Exception __call3070800_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3070801_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3070802_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3070803_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3070804_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3070805_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3070806_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3070807_0(java.lang.Exception a0) throws Throwable;
private static native moom.DT __call3070808_0(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native moom.DT __call3070808_1(moom.DT a0, int a1, int a2, int a3) throws Throwable;
private static native moom.DT __call3070808_2(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native moom.DT __call3070808_3(moom.DT a0, int a1, int a2, int a3) throws Throwable;
private static native java.lang.Exception __call3070809_0(java.lang.Exception a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_a59409e17da3fb56db0d(java.lang.Class a0, java.lang.String a1) throws E;
private static final class __SourceHandler_a59409e17da3fb56db0d {

public static void f2997(java.lang.Class p0, java.lang.String p1) throws Throwable {
    long life2_3;
    life2_3 = (__fieldRead2997_0() ^ 71925907375909L);
    if (__call2997_2(__fieldRead2997_1(), p1)) {
        throw new java.lang.IllegalArgumentException(__invokedynamic2997_3(p1));
    }
    __call2997_5(__fieldRead2997_4(), p1, p0);
    __call2997_7(__fieldRead2997_6(), p0, p1);
    return;
}
public static void h2997_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1299700_0(p0);
}
private static native long __fieldRead2997_0() throws Throwable;
private static native java.util.Map __fieldRead2997_1() throws Throwable;
private static native boolean __call2997_2(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic2997_3(java.lang.String a0) throws Throwable;
private static native java.util.Map __fieldRead2997_4() throws Throwable;
private static native java.lang.Object __call2997_5(java.util.Map a0, java.lang.String a1, java.lang.Class a2) throws Throwable;
private static native java.util.Map __fieldRead2997_6() throws Throwable;
private static native java.lang.Object __call2997_7(java.util.Map a0, java.lang.Class a1, java.lang.String a2) throws Throwable;
private static native java.lang.Exception __call1299700_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_e4449c9f26365817efb9(net.minecraft.tileentity.TileEntity a0, moom.qZ a1) throws E;
private static final class __SourceHandler_e4449c9f26365817efb9 {

public static void f1670(net.minecraft.tileentity.TileEntity receiver, moom.qZ p0) throws Throwable {
    long life2_3;
    java.lang.String[] life4_10;
    forward_join_34: {
    forward_join_29: {
    life2_3 = (__fieldRead1670_0() ^ 136691630982823L);
    java.lang.String[] spill1670_0 = __call1670_1();
    __call1670_3(p0, "Name", __invokedynamic1670_2(receiver));
    life4_10 = spill1670_0;
    if (!((life4_10 != null))) { break forward_join_29; }
    if (!((__fieldRead1670_4(receiver) != null))) { break forward_join_34; }
    __call1670_8(p0, __fieldRead1670_5(receiver), __call1670_6(receiver), __call1670_7(receiver));
    __call1670_10(p0, "Actual block type", __invokedynamic1670_9(receiver));
    }
    __call1670_12(p0, "Actual block data value", __invokedynamic1670_11(receiver));
    }
    return;
}
public static void h1670_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1167000_0(p0);
}
public static void h1670_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1167001_0(p0);
}
private static native long __fieldRead1670_0() throws Throwable;
private static native java.lang.String[] __call1670_1() throws Throwable;
private static native java.util.concurrent.Callable __invokedynamic1670_2(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native void __call1670_3(moom.qZ a0, java.lang.String a1, java.util.concurrent.Callable a2) throws Throwable;
private static native net.minecraft.world.World __fieldRead1670_4(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native moom.DT __fieldRead1670_5(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native net.minecraft.block.Block __call1670_6(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native int __call1670_7(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native void __call1670_8(moom.qZ a0, moom.DT a1, net.minecraft.block.Block a2, int a3) throws Throwable;
private static native java.util.concurrent.Callable __invokedynamic1670_9(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native void __call1670_10(moom.qZ a0, java.lang.String a1, java.util.concurrent.Callable a2) throws Throwable;
private static native java.util.concurrent.Callable __invokedynamic1670_11(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native void __call1670_12(moom.qZ a0, java.lang.String a1, java.util.concurrent.Callable a2) throws Throwable;
private static native java.lang.Exception __call1167000_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1167001_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.tileentity.TileEntity __sourceHandlerCall_648f9e4dc5fcdcf20aae(net.minecraft.nbt.NBTTagCompound a0) throws E;
private static final class __SourceHandler_648f9e4dc5fcdcf20aae {

public static net.minecraft.tileentity.TileEntity f709(net.minecraft.nbt.NBTTagCompound p0) throws Throwable {
    java.lang.Object forwardValue709_26_0;
    net.minecraft.tileentity.TileEntity forwardValue709_33_0;
    java.lang.String[] spill709_0;
    java.lang.Class spill709_1;
    net.minecraft.tileentity.TileEntity spill709_2;
    long life1_3;
    net.minecraft.tileentity.TileEntity life4_6;
    java.lang.String[] life3_7;
    java.lang.Class life5_14;
    forward_join_43: {
    forward_join_37: {
    forward_join_33: {
    forward_join_28: {
    forward_join_26: {
    life1_3 = (__fieldRead709_0() ^ 35759207342721L);
    spill709_0 = __call709_1();
    life4_6 = null;
    life3_7 = spill709_0;
    life5_14 = __cast709_5(__call709_4(__fieldRead709_2(), __call709_3(p0, "id")));
    spill709_1 = life5_14;
    if (!((life3_7 != null))) {
        forwardValue709_26_0 = spill709_1;
        break forward_join_26;
    }
    if (!((spill709_1 != null))) {
        break forward_join_28;
    }
    forwardValue709_26_0 = __call709_7(__call709_6(life5_14, new java.lang.Class[0]), new java.lang.Object[0]);
    }
    life4_6 = __cast709_8(forwardValue709_26_0);
    }
    spill709_2 = life4_6;
    if (!((life3_7 != null))) {
        forwardValue709_33_0 = spill709_2;
        break forward_join_33;
    }
    if (!((spill709_2 != null))) {
        break forward_join_37;
    }
    forwardValue709_33_0 = life4_6;
    }
    __call709_9(forwardValue709_33_0, p0);
    if (!((life3_7 == null))) {
        break forward_join_43;
    }
    }
    __call709_13(__fieldRead709_10(), __invokedynamic709_12(__call709_11(p0, "id")));
    }
    return life4_6;
}
public static net.minecraft.tileentity.TileEntity h709_0(java.lang.Exception p0) throws Throwable {
    throw __call3070900_0(p0);
}
public static net.minecraft.tileentity.TileEntity h709_1(java.lang.Exception p0) throws Throwable {
    throw __call3070901_0(p0);
}
public static net.minecraft.tileentity.TileEntity h709_2(java.lang.Exception p0, net.minecraft.nbt.NBTTagCompound p1, java.lang.String[] p2, net.minecraft.tileentity.TileEntity p3, java.lang.Class p4) throws Throwable {
    net.minecraft.tileentity.TileEntity forwardValue3070902_9_0;
    net.minecraft.tileentity.TileEntity spill3070902_0;
    java.lang.Exception life4_2;
    forward_join_19: {
    forward_join_13: {
    forward_join_9: {
    life4_2 = p0;
    __call3070902_0(life4_2);
    spill3070902_0 = p3;
    if (!((p2 != null))) {
        forwardValue3070902_9_0 = spill3070902_0;
        break forward_join_9;
    }
    if (!((spill3070902_0 != null))) {
        break forward_join_13;
    }
    forwardValue3070902_9_0 = p3;
    }
    __call3070902_1(forwardValue3070902_9_0, p1);
    if (!((p2 == null))) {
        break forward_join_19;
    }
    }
    __call3070902_5(__fieldRead3070902_2(), __invokedynamic3070902_4(__call3070902_3(p1, "id")));
    }
    return p3;
}
public static net.minecraft.tileentity.TileEntity h709_3(java.lang.Exception p0) throws Throwable {
    throw __call3070903_0(p0);
}
public static net.minecraft.tileentity.TileEntity h709_4(java.lang.Exception p0) throws Throwable {
    throw __call3070904_0(p0);
}
private static native long __fieldRead709_0() throws Throwable;
private static native java.lang.String[] __call709_1() throws Throwable;
private static native java.util.Map __fieldRead709_2() throws Throwable;
private static native java.lang.String __call709_3(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native java.lang.Object __call709_4(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native java.lang.Class __cast709_5(java.lang.Object a0) throws Throwable;
private static native java.lang.reflect.Constructor __call709_6(java.lang.Class a0, java.lang.Class[] a1) throws Throwable;
private static native java.lang.Object __call709_7(java.lang.reflect.Constructor a0, java.lang.Object[] a1) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __cast709_8(java.lang.Object a0) throws Throwable;
private static native void __call709_9(net.minecraft.tileentity.TileEntity a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead709_10() throws Throwable;
private static native java.lang.String __call709_11(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic709_12(java.lang.String a0) throws Throwable;
private static native void __call709_13(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call3070900_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3070901_0(java.lang.Exception a0) throws Throwable;
private static native void __call3070902_0(java.lang.Exception a0) throws Throwable;
private static native void __call3070902_1(net.minecraft.tileentity.TileEntity a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3070902_2() throws Throwable;
private static native java.lang.String __call3070902_3(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic3070902_4(java.lang.String a0) throws Throwable;
private static native void __call3070902_5(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call3070903_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3070904_0(java.lang.Exception a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_c58d3c7b872f9b61fd1a(net.minecraft.tileentity.TileEntity a0) throws E;
private static final class __SourceHandler_c58d3c7b872f9b61fd1a {

public static boolean f3000(net.minecraft.tileentity.TileEntity receiver) throws Throwable {
    long life1_3;
    life1_3 = (__fieldRead3000_0() ^ 6054983090309L);
    return ((__fieldRead3000_1(receiver) != null) ? true : false);
}
public static void h3000_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1300000_0(p0);
}
private static native long __fieldRead3000_0() throws Throwable;
private static native net.minecraft.world.World __fieldRead3000_1(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native java.lang.Exception __call1300000_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_ea71c9b2ed8f4d7ce7c5(net.minecraft.tileentity.TileEntity a0) throws E;
private static final class __SourceHandler_ea71c9b2ed8f4d7ce7c5 {

public static void f1671(net.minecraft.tileentity.TileEntity receiver) throws Throwable {
    net.minecraft.world.World forwardValue1671_13_0;
    net.minecraft.tileentity.TileEntity forwardValue1671_36_0;
    net.minecraft.world.World spill1671_0;
    net.minecraft.tileentity.TileEntity spill1671_1;
    long life1_3;
    java.lang.String[] life3_5;
    net.minecraft.block.state.IBlockState life4_22;
    forward_join_42: {
    forward_join_36: {
    forward_join_13: {
    life1_3 = (__fieldRead1671_0() ^ 119174585297197L);
    life3_5 = __call1671_1();
    spill1671_0 = __fieldRead1671_2(receiver);
    if (!((life3_5 != null))) {
        forwardValue1671_13_0 = spill1671_0;
        break forward_join_13;
    }
    if (!((spill1671_0 != null))) {
        break forward_join_42;
    }
    forwardValue1671_13_0 = __fieldRead1671_3(receiver);
    }
    life4_22 = __call1671_5(forwardValue1671_13_0, __fieldRead1671_4(receiver));
    __fieldWrite1671_8(receiver, __call1671_7(__call1671_6(life4_22), life4_22));
    __call1671_11(__fieldRead1671_9(receiver), __fieldRead1671_10(receiver), receiver);
    spill1671_1 = receiver;
    if (!((life3_5 != null))) {
        forwardValue1671_36_0 = spill1671_1;
        break forward_join_36;
    }
    if (!((__call1671_12(spill1671_1) != __fieldRead1671_13()))) {
        break forward_join_42;
    }
    forwardValue1671_36_0 = receiver;
    }
    __call1671_17(__fieldRead1671_14(forwardValue1671_36_0), __fieldRead1671_15(receiver), __call1671_16(receiver));
    }
    return;
}
public static void h1671_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1167100_0(p0);
}
public static void h1671_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1167101_0(p0);
}
public static void h1671_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1167102_0(p0);
}
public static void h1671_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1167103_0(p0);
}
private static native long __fieldRead1671_0() throws Throwable;
private static native java.lang.String[] __call1671_1() throws Throwable;
private static native net.minecraft.world.World __fieldRead1671_2(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead1671_3(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native moom.DT __fieldRead1671_4(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call1671_5(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call1671_6(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native int __call1671_7(net.minecraft.block.Block a0, net.minecraft.block.state.IBlockState a1) throws Throwable;
private static native void __fieldWrite1671_8(net.minecraft.tileentity.TileEntity a0, int a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead1671_9(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native moom.DT __fieldRead1671_10(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native void __call1671_11(net.minecraft.world.World a0, moom.DT a1, net.minecraft.tileentity.TileEntity a2) throws Throwable;
private static native net.minecraft.block.Block __call1671_12(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead1671_13() throws Throwable;
private static native net.minecraft.world.World __fieldRead1671_14(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native moom.DT __fieldRead1671_15(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native net.minecraft.block.Block __call1671_16(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native void __call1671_17(net.minecraft.world.World a0, moom.DT a1, net.minecraft.block.Block a2) throws Throwable;
private static native java.lang.Exception __call1167100_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1167101_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1167102_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1167103_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.block.Block __sourceHandlerCall_b25a6e742de4cd1d53f4(net.minecraft.tileentity.TileEntity a0) throws E;
private static final class __SourceHandler_b25a6e742de4cd1d53f4 {

public static net.minecraft.block.Block f1672(net.minecraft.tileentity.TileEntity receiver) throws Throwable {
    net.minecraft.block.Block forwardValue1672_21_0;
    net.minecraft.block.Block spill1672_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_21: {
    forward_join_19: {
    life1_3 = (__fieldRead1672_0() ^ 113388016259564L);
    life3_5 = __call1672_1();
    spill1672_0 = __fieldRead1672_2(receiver);
    if (!((life3_5 != null))) {
        forwardValue1672_21_0 = spill1672_0;
        break forward_join_21;
    }
    if (!((spill1672_0 == null))) {
        break forward_join_19;
    }
    __fieldWrite1672_7(receiver, __call1672_6(__call1672_5(__fieldRead1672_3(receiver), __fieldRead1672_4(receiver))));
    }
    forwardValue1672_21_0 = __fieldRead1672_8(receiver);
    }
    return forwardValue1672_21_0;
}
public static void h1672_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1167200_0(p0);
}
public static void h1672_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1167201_0(p0);
}
private static native long __fieldRead1672_0() throws Throwable;
private static native java.lang.String[] __call1672_1() throws Throwable;
private static native net.minecraft.block.Block __fieldRead1672_2(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead1672_3(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native moom.DT __fieldRead1672_4(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call1672_5(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call1672_6(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native void __fieldWrite1672_7(net.minecraft.tileentity.TileEntity a0, net.minecraft.block.Block a1) throws Throwable;
private static native net.minecraft.block.Block __fieldRead1672_8(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native java.lang.Exception __call1167200_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1167201_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_0f09d8dcc301e22e85d2(net.minecraft.tileentity.TileEntity a0, net.minecraft.nbt.NBTTagCompound a1) throws E;
private static final class __SourceHandler_0f09d8dcc301e22e85d2 {

public static void f3003(net.minecraft.tileentity.TileEntity receiver, net.minecraft.nbt.NBTTagCompound p0) throws Throwable {
    long life2_3;
    java.lang.String life5_10;
    java.lang.String[] life4_11;
    life2_3 = (__fieldRead3003_0() ^ 50199539617457L);
    java.lang.String[] spill3003_0 = __call3003_1();
    life5_10 = __cast3003_5(__call3003_4(__fieldRead3003_2(), __call3003_3(receiver)));
    life4_11 = spill3003_0;
    if ((life4_11 != null)) {
        if ((life5_10 == null)) {
        throw new java.lang.RuntimeException(__invokedynamic3003_7(__call3003_6(receiver)));
    }
        __call3003_8(p0, "id", life5_10);
        __call3003_11(p0, "x", __call3003_10(__fieldRead3003_9(receiver)));
        __call3003_14(p0, "y", __call3003_13(__fieldRead3003_12(receiver)));
        __call3003_17(p0, "z", __call3003_16(__fieldRead3003_15(receiver)));
    }
    return;
}
public static void h3003_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1300300_0(p0);
}
public static void h3003_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1300301_0(p0);
}
private static native long __fieldRead3003_0() throws Throwable;
private static native java.lang.String[] __call3003_1() throws Throwable;
private static native java.util.Map __fieldRead3003_2() throws Throwable;
private static native java.lang.Class __call3003_3(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native java.lang.Object __call3003_4(java.util.Map a0, java.lang.Class a1) throws Throwable;
private static native java.lang.String __cast3003_5(java.lang.Object a0) throws Throwable;
private static native java.lang.Class __call3003_6(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native java.lang.String __invokedynamic3003_7(java.lang.Class a0) throws Throwable;
private static native void __call3003_8(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native moom.DT __fieldRead3003_9(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native int __call3003_10(moom.DT a0) throws Throwable;
private static native void __call3003_11(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native moom.DT __fieldRead3003_12(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native int __call3003_13(moom.DT a0) throws Throwable;
private static native void __call3003_14(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native moom.DT __fieldRead3003_15(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native int __call3003_16(moom.DT a0) throws Throwable;
private static native void __call3003_17(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native java.lang.Exception __call1300300_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1300301_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_8eb170510ab52e9a8d03(net.minecraft.tileentity.TileEntity a0) throws E;
private static final class __SourceHandler_8eb170510ab52e9a8d03 {

public static int f1673(net.minecraft.tileentity.TileEntity receiver) throws Throwable {
    int forwardValue1673_26_0;
    int spill1673_0;
    long life1_3;
    java.lang.String[] life3_5;
    net.minecraft.block.state.IBlockState life4_20;
    forward_join_26: {
    forward_join_24: {
    life1_3 = (__fieldRead1673_0() ^ 29740561799585L);
    life3_5 = __call1673_1();
    spill1673_0 = __fieldRead1673_2(receiver);
    if (!((life3_5 != null))) {
        forwardValue1673_26_0 = spill1673_0;
        break forward_join_26;
    }
    if (!((spill1673_0 == -1))) {
        break forward_join_24;
    }
    life4_20 = __call1673_5(__fieldRead1673_3(receiver), __fieldRead1673_4(receiver));
    __fieldWrite1673_8(receiver, __call1673_7(__call1673_6(life4_20), life4_20));
    }
    forwardValue1673_26_0 = __fieldRead1673_9(receiver);
    }
    return forwardValue1673_26_0;
}
public static void h1673_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1167300_0(p0);
}
private static native long __fieldRead1673_0() throws Throwable;
private static native java.lang.String[] __call1673_1() throws Throwable;
private static native int __fieldRead1673_2(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead1673_3(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native moom.DT __fieldRead1673_4(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call1673_5(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call1673_6(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native int __call1673_7(net.minecraft.block.Block a0, net.minecraft.block.state.IBlockState a1) throws Throwable;
private static native void __fieldWrite1673_8(net.minecraft.tileentity.TileEntity a0, int a1) throws Throwable;
private static native int __fieldRead1673_9(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native java.lang.Exception __call1167300_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_c8c3e03e453664cf7cc8() throws E;
private static final class __SourceHandler_c8c3e03e453664cf7cc8 {

public static int f3005() throws Throwable {
    int life0_1;
    life0_1 = __call3005_0();
    if ((life0_1 == 0)) {
        return 95;
    }
    return 0;
}
public static void h3005_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1300500_0(p0);
}
private static native int __call3005_0() throws Throwable;
private static native java.lang.Exception __call1300500_0(java.lang.IllegalArgumentException a0) throws Throwable;

}


public void b(net.minecraft.nbt.NBTTagCompound p0) { __sourceHandlerCall_0f09d8dcc301e22e85d2(this, p0); }


public static void b(int p0) {
k = ((int)(p0));
    return;
}


public int e() { return __sourceHandlerCall_8eb170510ab52e9a8d03(this); }


public void e__Void() {
this.f = ((boolean)(false));
    return;
}


public net.minecraft.world.World c__sourceInterfaceWorld() {
return this.d;
}


public boolean f__Boolean() {
return ((((this.f) ? 1 : 0)) != 0);
}


public void f__Void() {
this.h = ((net.minecraft.block.Block)(null));
    this.g = ((int)(-1));
    return;
}


public static int f() {
return net.minecraft.tileentity.TileEntity.k;
}


public void d__Void() {
this.f = ((boolean)(true));
    return;
}


public double d() {
return 0x1.0p12d;
}


public void a(moom.qZ p0) { __sourceHandlerCall_e4449c9f26365817efb9(this, p0); }


public moom.CA a() { return __sourceHandlerCall_4b97a34f9b8ea1430c1d(this); }


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static void a(java.lang.Class<? extends net.minecraft.tileentity.TileEntity> p0, java.lang.String p1) { __sourceHandlerCall_a59409e17da3fb56db0d(p0, p1); }


public net.minecraft.tileentity.TileEntity a(org.lwjgl.util.vector.Vector4f p0) {
this.j = ((org.lwjgl.util.vector.Vector4f)(p0));
    return this;
}


public org.lwjgl.util.vector.Vector4f a__Vector4f() {
return this.j;
}


public void a(moom.DT p0) {
this.e = ((moom.DT)(p0));
    return;
}


public moom.DT a__DT() {
return this.e;
}


public double a(double p0, double p1, double p2) {
double local7 = ((((double) ((moom.DT)(this.e)).a()) + 0x1.0p-1d) - p0);
    double local9 = ((((double) ((moom.DT)(this.e)).b()) + 0x1.0p-1d) - p1);
    double local11 = ((((double) ((moom.DT)(this.e)).c()) + 0x1.0p-1d) - p2);
    return (((local7 * local7) + (local9 * local9)) + (local11 * local11));
}


public void a__Void(net.minecraft.nbt.NBTTagCompound p0) {
this.e = ((moom.DT)(new moom.DT(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("x"))), ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("y"))), ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("z"))))));
    return;
}


public void a__Void() { __sourceHandlerCall_ea71c9b2ed8f4d7ce7c5(this); }


public boolean a__Boolean() { return __sourceHandlerCall_c58d3c7b872f9b61fd1a(this); }


public static net.minecraft.tileentity.TileEntity a(net.minecraft.nbt.NBTTagCompound p0) { return __sourceHandlerCall_648f9e4dc5fcdcf20aae(p0); }


public boolean a__Boolean(int p0, int p1) {
return ((0) != 0);
}


public void a(net.minecraft.world.World p0) {
this.d = ((net.minecraft.world.World)(p0));
    return;
}


public net.minecraft.block.Block a__ch() { return __sourceHandlerCall_b25a6e742de4cd1d53f4(this); }


public moom.yK a__yK() {
return null;
}


public static int g() { return __sourceHandlerCall_c8c3e03e453664cf7cc8(); }


public boolean g__Boolean() {
return ((0) != 0);
}


private java.lang.String lambda$addInfoToCrashReport$1() throws java.lang.Exception {
int local1 = net.minecraft.block.Block.a(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.d)).a__fE(((moom.DT)(this.e))))).a__ch())));
    try {
        return java.lang.String.format(((java.lang.String)("ID #%d (%s // %s)")), ((java.lang.Object[])(new java.lang.Object[] {java.lang.Integer.valueOf(((int)(local1))), ((net.minecraft.block.Block)(net.minecraft.block.Block.a(((int)(local1))))).b__String(), ((java.lang.Class)(((java.lang.Object)(net.minecraft.block.Block.a(((int)(local1))))).getClass())).getCanonicalName()})));
    } catch (java.lang.Throwable caught2) {
        return __sourceIntrinsic_ef5c4ae196f8_invokedynamic12246_12(local1);
    }
}


private java.lang.String lambda$addInfoToCrashReport$0() throws java.lang.Exception {
return __sourceIntrinsic_770344f52771_originalDynamicSite2042_6(((java.lang.String)(((java.util.Map)(net.minecraft.tileentity.TileEntity.c)).get(((java.lang.Object)(((java.lang.Object)(this)).getClass()))))), ((java.lang.Class)(((java.lang.Object)(this)).getClass())).getCanonicalName());
}


private java.lang.String lambda$addInfoToCrashReport$2() throws java.lang.Exception {
int forwardValue5639_22_0;
    java.lang.String[] spill5639_0;
    int spill5639_1;
    long life1_3;
    net.minecraft.block.state.IBlockState life4_10;
    java.lang.String[] life3_11;
    int life5_16;
    java.lang.String life6_39;
    forward_join_24: {
    forward_join_22: {
    life1_3 = (net.minecraft.tileentity.TileEntity.z ^ 25102640901583L);
    spill5639_0 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    life4_10 = ((net.minecraft.world.World)(this.d)).a__fE(((moom.DT)(this.e)));
    life3_11 = spill5639_0;
    life5_16 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(life4_10)).a__ch())).b(((net.minecraft.block.state.IBlockState)(life4_10)));
    spill5639_1 = life5_16;
    if (!((life3_11 != null))) {
        forwardValue5639_22_0 = spill5639_1;
        break forward_join_22;
    }
    if (!((spill5639_1 < 0))) {
        break forward_join_24;
    }
    forwardValue5639_22_0 = life5_16;
    }
    return __sourceIntrinsic_c71f353dfe31_invokedynamic5639_7(forwardValue5639_22_0);
    }
    life6_39 = ((java.lang.String)(java.lang.String.format(((java.lang.String)("%4s")), ((java.lang.Object[])(new java.lang.Object[] {java.lang.Integer.toBinaryString(((int)(life5_16)))}))))).replace(((java.lang.CharSequence)(" ")), ((java.lang.CharSequence)("0")));
    return java.lang.String.format(((java.lang.String)("%1$d / 0x%1$X / 0b%2$s")), ((java.lang.Object[])(new java.lang.Object[] {java.lang.Integer.valueOf(((int)(life5_16))), life6_39})));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_770344f52771_originalDynamicSite2042_6(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ef5c4ae196f8_invokedynamic12246_12(int a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c71f353dfe31_invokedynamic5639_7(int a0) throws E;
}
