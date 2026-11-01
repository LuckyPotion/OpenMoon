package moom;


public class w0 extends moom.wU {

protected final net.minecraft.block.Block o;

protected final com.google.common.base.Function<net.minecraft.item.ItemStack, java.lang.String> p;

private static final long s;

public w0(net.minecraft.block.Block p0, net.minecraft.block.Block p1, com.google.common.base.Function<net.minecraft.item.ItemStack, java.lang.String> p2) {
super(p0);
    this.o = p1;
    this.p = p2;
    (this).c(0);
    (this).a(true);
}


public w0(net.minecraft.block.Block p0, net.minecraft.block.Block p1, java.lang.String[] p2) {
this(p0, p1, __sourceIntrinsic_53429c6d8e8c_originalDynamicSite5083_0(p2));
    return;
}


static {
moom.w0.s = (moom._c.a(4737097625168823049L, -2279938774402206999L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(119419256745492L);
}


public java.lang.String b__String(net.minecraft.item.ItemStack p0) {
return __sourceIntrinsic_33df8f166dd6_originalDynamicSite1688_4(super.a__String(), ((java.lang.String)(((com.google.common.base.Function)(this.p)).apply(((java.lang.Object)(p0))))));
}


public int a(int p0) {
return p0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static java.lang.String lambda$new$0(java.lang.String[] p0, net.minecraft.item.ItemStack p1) {
int forwardValue4338_20_0;
    boolean spill4338_0;
    int spill4338_1;
    int spill4338_2;
    long life2_3;
    int life5_7;
    int life4_8;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    life2_3 = (moom.w0.s ^ 67836470785518L);
    spill4338_0 = net.minecraft.item.ItemStack.l();
    life5_7 = ((net.minecraft.item.ItemStack)(p1)).c();
    life4_8 = ((spill4338_0) ? 1 : 0);
    spill4338_1 = life5_7;
    if (!((life4_8 == 0))) {
        forwardValue4338_20_0 = spill4338_1;
        break forward_join_20;
    }
    if (!((spill4338_1 >= 0))) {
        break forward_join_19;
    }
    spill4338_2 = life5_7;
    if (!((life4_8 == 0))) {
        forwardValue4338_20_0 = spill4338_2;
        break forward_join_20;
    }
    if (!((spill4338_2 >= (p0).length))) {
        break forward_join_21;
    }
    }
    forwardValue4338_20_0 = 0;
    }
    life5_7 = forwardValue4338_20_0;
    }
    return (p0)[life5_7];
}


private static native <E extends Throwable> com.google.common.base.Function __sourceIntrinsic_53429c6d8e8c_originalDynamicSite5083_0(java.lang.String[] a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_33df8f166dd6_originalDynamicSite1688_4(java.lang.String a0, java.lang.String a1) throws E;
}
