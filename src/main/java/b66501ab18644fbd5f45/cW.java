package moom;


public class cW extends moom.cU {

private static final long U;

public cW() {
super();
    (this).a__Void(((this.M).a__fE()).a__fE(moom.cW.S, java.lang.Integer.valueOf(0)));
}


static {
moom.cW.U = (moom._c.a(-3597596320778410856L, 8363016848742406364L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(222767330903162L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public int b(net.minecraft.block.state.IBlockState p0) {
return ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.cW.S))))))).intValue();
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
return ((net.minecraft.block.state.IBlockState)(((moom.cW)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.cW.S)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)(p0))))));
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.cW.S});
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.block.Block p3) {
long local5 = (moom.cW.U ^ 94694689900892L);
    int[] local7 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    if ((local7 != null)) {
        if ((__sourceIntrinsic_booleanComparison(((moom.fn)(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).b__DT()))))).a__ch())).a__fn())).b__Boolean()) == 0)) {
        ((moom.cW)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((int)(0)));
        ((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(p1)));
    }
        super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((net.minecraft.block.Block)(p3)));
    }
    return;
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
