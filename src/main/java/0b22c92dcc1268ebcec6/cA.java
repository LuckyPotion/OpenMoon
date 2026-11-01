package moom;


public abstract class cA extends moom.cu {

protected moom.fw<net.minecraft.block.BlockFlower$EnumFlowerType> R;

private static long S;

protected cA() { super(); }


private static void __sourceConstructorBody_984a5df746d14b8f(moom.cA receiver) throws Throwable {

long local1 = (moom.cA.S ^ 103482241010504L);

    moom.cA.__sourceConstructorInit_984a5df746d14b8f_0(((moom.cA)(receiver)));

    ((moom.cA)(receiver)).a__Void(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.fA)(((moom.cA)(receiver)).M)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(((moom.cA)(receiver)).a__ft())), ((java.lang.Comparable)(((((moom.cA)(receiver)).a__M() == moom.M.RED) ? net.minecraft.block.BlockFlower$EnumFlowerType.POPPY : net.minecraft.block.BlockFlower$EnumFlowerType.DANDELION)))))));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_984a5df746d14b8f_0(moom.cA a0) throws E;

static {
moom.cA.S = (moom._c.a(-1984881307553309557L, -1865378142091595028L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(149025271956791L);
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
return ((net.minecraft.block.state.IBlockState)(((moom.cA)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(((moom.cA)(this)).a__ft())), ((java.lang.Comparable)(net.minecraft.block.BlockFlower$EnumFlowerType.a(((moom.M)(((moom.cA)(this)).a__M())), ((int)(p0))))));
}


public int b(net.minecraft.block.state.IBlockState p0) {
return ((net.minecraft.block.BlockFlower$EnumFlowerType)(((net.minecraft.block.BlockFlower$EnumFlowerType)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(((moom.cA)(this)).a__ft()))))))).a();
}


public int c(net.minecraft.block.state.IBlockState p0) {
return ((net.minecraft.block.BlockFlower$EnumFlowerType)(((net.minecraft.block.BlockFlower$EnumFlowerType)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(((moom.cA)(this)).a__ft()))))))).a();
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {((moom.cA)(this)).a__ft()});
}


public moom.F a__F() {
return moom.F.XZ;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public abstract moom.M a__M();

public net.minecraft.block.properties.IProperty<net.minecraft.block.BlockFlower$EnumFlowerType> a__ft() {
long local1 = (moom.cA.S ^ 84617380386346L);
    if ((this.R == null)) {
        this.R = ((moom.fw)(moom.fw.a(((java.lang.String)("type")), ((java.lang.Class)(net.minecraft.block.BlockFlower$EnumFlowerType.class)), ((com.google.common.base.Predicate)(__sourceIntrinsic_b7c301887caf_invokedynamic7044_3(this))))));
    }
    return this.R;
}


public void a(net.minecraft.item.Item p0, net.minecraft.creativetab.CreativeTabs p1, java.util.List<net.minecraft.item.ItemStack> p2) {
int[] spill1065_0;
    long life4_3;
    net.minecraft.block.BlockFlower$EnumFlowerType[] life7_8;
    int life8_11;
    int life9_13;
    int[] life6_14;
    net.minecraft.block.BlockFlower$EnumFlowerType life10_21;
    lexical_join_35: {
    life4_3 = (moom.cA.S ^ 108626754960209L);
    spill1065_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_8 = net.minecraft.block.BlockFlower$EnumFlowerType.a(((moom.M)(((moom.cA)(this)).a__M())));
    life8_11 = (life7_8).length;
    life9_13 = 0;
    life6_14 = spill1065_0;
    lexical_cycle_15: while (true) {
    if (!((life9_13 < life8_11))) {
        break lexical_join_35;
    }
    life10_21 = (life7_8)[life9_13];
    ((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(p0, 1, ((net.minecraft.block.BlockFlower$EnumFlowerType)(life10_21)).a()))));
    life9_13 += 1;
    if (!((life6_14 == null))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    return;
}


private boolean lambda$getTypeProperty$0(net.minecraft.block.BlockFlower$EnumFlowerType p0) {
long local2 = (moom.cA.S ^ 24524509529245L);
    return ((((((net.minecraft.block.BlockFlower$EnumFlowerType)(p0)).a__M() == ((moom.cA)(this)).a__M()) ? 1 : 0)) != 0);
}


private static native <E extends Throwable> com.google.common.base.Predicate __sourceIntrinsic_b7c301887caf_invokedynamic7044_3(moom.cA a0) throws E;
}
