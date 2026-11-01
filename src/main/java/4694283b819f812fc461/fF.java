package moom;


public class fF implements com.google.common.base.Predicate<net.minecraft.block.state.IBlockState> {

private final net.minecraft.block.Block a;

private static final long b;

private fF(net.minecraft.block.Block p0) {
super();
    this.a = p0;
}


static {
moom.fF.b = (moom._c.a(-3464211789317885147L, -1800222974528094215L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(107412486434696L);
}


public boolean apply__sourceBridge_9ea2dcf14c(java.lang.Object p0) {
return ((moom.fF)(this)).a(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p0)))));
}


public boolean a(net.minecraft.block.state.IBlockState p0) {
net.minecraft.block.state.IBlockState forwardValue3530_11_0;
    int forwardValue3530_18_0;
    net.minecraft.block.state.IBlockState spill3530_0;
    long life2_3;
    int[] life4_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_11: {
    life2_3 = (moom.fF.b ^ 27653690461017L);
    life4_5 = moom.fG.b__ArrayInt();
    spill3530_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue3530_11_0 = spill3530_0;
        break forward_join_11;
    }
    if (!((spill3530_0 != null))) {
        break forward_join_17;
    }
    forwardValue3530_11_0 = p0;
    }
    if (!((((net.minecraft.block.state.IBlockState)(forwardValue3530_11_0)).a__ch() == this.a))) {
        break forward_join_17;
    }
    forwardValue3530_18_0 = 1;
    break forward_join_18;
    }
    forwardValue3530_18_0 = 0;
    }
    return ((forwardValue3530_18_0) != 0);
}


public static moom.fF a(net.minecraft.block.Block p0) {
return new moom.fF(p0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean apply(net.minecraft.block.state.IBlockState __bridgeParam0) { return this.apply__sourceBridge_9ea2dcf14c(((java.lang.Object)(__bridgeParam0))); }
}
