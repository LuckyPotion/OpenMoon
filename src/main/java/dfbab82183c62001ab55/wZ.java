package moom;


public class wZ extends moom.wU {

private final moom.dH o;

public wZ(moom.dH p0) {
super(p0);
    this.o = p0;
    (this).c(0);
    (this).a(true);
}


public java.lang.String b__String(net.minecraft.item.ItemStack p0) {
return __sourceIntrinsic_33df8f166dd6_originalDynamicSite1694_5(super.a__String(), ((net.minecraft.block.BlockPlanks$EnumType)(((moom.dH)(this.o)).a__sourceReturn_71725fcced(((int)(((net.minecraft.item.ItemStack)(p0)).c()))))).b());
}


public int a(int p0) {
return (p0 | 4);
}


public int a(net.minecraft.item.ItemStack p0, int p1) {
return ((moom.dH)(this.o)).d(((net.minecraft.block.state.IBlockState)(((moom.dH)(this.o)).b__fE(((int)(((net.minecraft.item.ItemStack)(p0)).c()))))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_33df8f166dd6_originalDynamicSite1694_5(java.lang.String a0, java.lang.String a1) throws E;
}
