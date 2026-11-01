package moom;


public class HK extends moom.HJ {

private static final long g;

public HK() {
super();
}


static {
g = (moom._c.a(-4873548604388310039L, 6292067348215186873L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(181876341461340L);
}


private static moom.Oo c(moom.Oo p0) {
return p0;
}


public void a(moom.G4 p0, java.util.List<moom.G4> p1, java.util.Random p2) {
moom.G4 forwardValue2072_37_0;
    moom.HK spill2072_0;
    moom.HK spill2072_1;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    forward_join_38: {
    forward_join_37: {
    forward_join_29: {
    life4_3 = (moom.HK.g ^ 81434835179338L);
    life6_5 = moom.G4.b();
    spill2072_0 = this;
    if (!((life6_5 != null))) {
        forwardValue2072_37_0 = spill2072_0;
        break forward_join_37;
    }
    if (!((((moom.HK)(spill2072_0)).b != moom.bs.NORTH))) {
        break forward_join_29;
    }
    spill2072_1 = this;
    if (!((life6_5 != null))) {
        forwardValue2072_37_0 = spill2072_1;
        break forward_join_37;
    }
    if (!((((moom.HK)(spill2072_1)).b != moom.bs.EAST))) {
        break forward_join_29;
    }
    ((moom.HK)(this)).b(((moom.HQ)(((moom.HQ)(p0)))), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(1)), ((int)(1)));
    if (!((life6_5 == null))) {
        break forward_join_38;
    }
    }
    forwardValue2072_37_0 = ((moom.HK)(this)).c(((moom.HQ)(((moom.HQ)(p0)))), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(1)), ((int)(1)));
    }
    recovery.source.CarrierOps.discard(forwardValue2072_37_0);
    }
    return;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
moom.HK forwardValue2073_18_0;
    net.minecraft.world.World forwardValue2073_18_1;
    moom.G2 forwardValue2073_18_2;
    moom.HK forwardValue2073_68_0;
    moom.HK spill2073_0;
    net.minecraft.world.World spill2073_1;
    moom.G2 spill2073_2;
    moom.HK spill2073_3;
    moom.HK spill2073_4;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    forward_join_82: {
    forward_join_68: {
    forward_join_67: {
    forward_join_18: {
    forward_join_15: {
    life4_3 = (moom.HK.g ^ 65524212604300L);
    life6_5 = moom.G4.b();
    spill2073_0 = this;
    spill2073_1 = p0;
    spill2073_2 = p2;
    if (!((life6_5 != null))) {
        forwardValue2073_18_0 = spill2073_0;
        forwardValue2073_18_1 = spill2073_1;
        forwardValue2073_18_2 = spill2073_2;
        break forward_join_18;
    }
    if (!(((moom.HK)(spill2073_0)).a(((net.minecraft.world.World)(spill2073_1)), ((moom.G2)(spill2073_2))))) {
        break forward_join_15;
    }
    return ((0) != 0);
    }
    forwardValue2073_18_0 = this;
    forwardValue2073_18_1 = p0;
    forwardValue2073_18_2 = p2;
    }
    ((moom.HK)(forwardValue2073_18_0)).a(((net.minecraft.world.World)(forwardValue2073_18_1)), ((moom.G2)(forwardValue2073_18_2)), ((int)(0)), ((int)(0)), ((int)(0)), ((int)(4)), ((int)(4)), ((int)(4)), ((boolean)(true)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.StructureStrongholdPieces.e)));
    ((moom.HK)(this)).a(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.G2)(p2)), ((moom.bJ)(((moom.HK)(this)).e)), ((int)(1)), ((int)(1)), ((int)(0)));
    spill2073_3 = this;
    if (!((life6_5 != null))) {
        forwardValue2073_68_0 = spill2073_3;
        break forward_join_68;
    }
    if (!((((moom.HK)(spill2073_3)).b != moom.bs.NORTH))) {
        break forward_join_67;
    }
    spill2073_4 = this;
    if (!((life6_5 != null))) {
        forwardValue2073_68_0 = spill2073_4;
        break forward_join_68;
    }
    if (!((((moom.HK)(spill2073_4)).b != moom.bs.EAST))) {
        break forward_join_67;
    }
    ((moom.HK)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(1)), ((int)(1)), ((int)(0)), ((int)(3)), ((int)(3)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    if (!((life6_5 == null))) {
        break forward_join_82;
    }
    }
    forwardValue2073_68_0 = this;
    }
    ((moom.HK)(forwardValue2073_68_0)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)(1)), ((int)(1)), ((int)(4)), ((int)(3)), ((int)(3)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    }
    return ((1) != 0);
}

}
