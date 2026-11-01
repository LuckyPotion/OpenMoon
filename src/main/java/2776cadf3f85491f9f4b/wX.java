package moom;


public class wX extends moom.wU {

private net.minecraft.block.Block o;

private java.lang.String[] p;

private static long r;

public wX(net.minecraft.block.Block p0, boolean p1) { super((net.minecraft.block.Block)null); }

private static void __sourceConstructorBody_84fc036323a4e9fa(moom.wX receiver, net.minecraft.block.Block p0, boolean p1) throws Throwable {
forward_join_24: {
    forward_join_20: {
    long local3_life2 = (moom.wX.r ^ 28751332457033L);
    boolean __sourceSpill746_4 = net.minecraft.item.ItemStack.m();
    moom.wX.__sourceConstructorInit_84fc036323a4e9fa_0(((moom.wX)(receiver)), ((net.minecraft.block.Block)(p0)));
    ((moom.wX)(receiver)).o = ((net.minecraft.block.Block)(p0));
    boolean local5_life7 = __sourceSpill746_4;
    if (!(local5_life7)) { break forward_join_20; }
    if (!(p1)) { break forward_join_24; }
    ((moom.wX)(receiver)).c(((int)(0)));
    }
    ((moom.wX)(receiver)).a(((boolean)(true)));
    }
    return;
}

private static native <E extends Throwable> void __sourceConstructorInit_84fc036323a4e9fa_0(moom.wX a0, net.minecraft.block.Block a1) throws E;

static {
moom.wX.r = (moom._c.a(4755391652891309847L, 2073659385533399413L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(238943211261481L);
}


public java.lang.String b__String(net.minecraft.item.ItemStack p0) {
moom.wX forwardValue4387_12_0;
    int forwardValue4387_23_0;
    java.lang.String forwardValue4387_39_0;
    moom.wX spill4387_0;
    int spill4387_1;
    long life2_3;
    int life4_5;
    int life5_23;
    forward_join_39: {
    forward_join_36: {
    forward_join_23: {
    forward_join_15: {
    forward_join_12: {
    life2_3 = (moom.wX.r ^ 120059304157661L);
    life4_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    spill4387_0 = this;
    if (!((life4_5 == 0))) {
        forwardValue4387_12_0 = spill4387_0;
        break forward_join_12;
    }
    if (!((((moom.wX)(spill4387_0)).p == null))) {
        break forward_join_15;
    }
    forwardValue4387_12_0 = this;
    }
    return __sourceIntrinsic_33df8f166dd6_call4387_4(forwardValue4387_12_0, p0);
    }
    life5_23 = ((net.minecraft.item.ItemStack)(p0)).c();
    spill4387_1 = life5_23;
    if (!((life4_5 == 0))) {
        forwardValue4387_23_0 = spill4387_1;
        break forward_join_23;
    }
    if (!((spill4387_1 >= 0))) {
        break forward_join_36;
    }
    forwardValue4387_23_0 = life5_23;
    }
    if (!((forwardValue4387_23_0 < (this.p).length))) {
        break forward_join_36;
    }
    forwardValue4387_39_0 = __sourceIntrinsic_33df8f166dd6_invokedynamic4387_9(super.b__String(((net.minecraft.item.ItemStack)(p0))), (this.p)[life5_23]);
    break forward_join_39;
    }
    forwardValue4387_39_0 = super.b__String(((net.minecraft.item.ItemStack)(p0)));
    }
    return forwardValue4387_39_0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public moom.wX a(java.lang.String[] p0) {
this.p = ((java.lang.String[])(p0));
    return this;
}


public int a(int p0) {
return p0;
}


public int a(net.minecraft.item.ItemStack p0, int p1) {
return ((net.minecraft.block.Block)(this.o)).d(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(this.o)).b__fE(((int)(((net.minecraft.item.ItemStack)(p0)).c()))))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_33df8f166dd6_call4387_4(moom.wX a0, net.minecraft.item.ItemStack a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_33df8f166dd6_invokedynamic4387_9(java.lang.String a0, java.lang.String a1) throws E;
}
