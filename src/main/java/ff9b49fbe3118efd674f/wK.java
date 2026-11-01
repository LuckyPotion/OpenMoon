package moom;


class wK extends moom.wB {

int f;

moom.wj g;

private static long h;

wK(moom.wj p0, net.minecraft.inventory.IInventory p1, int p2, int p3, int p4, int p5) { super((net.minecraft.inventory.IInventory)null, 0, 0, 0); }


private static void __sourceConstructorBody_756bfa0531288e3c(moom.wK receiver, moom.wj p0, net.minecraft.inventory.IInventory p1, int p2, int p3, int p4, int p5) throws Throwable {

((moom.wK)(receiver)).g = ((moom.wj)(p0));

    ((moom.wK)(receiver)).f = ((int)(p5));

    moom.wK.__sourceConstructorInit_756bfa0531288e3c_0(((moom.wK)(receiver)), ((net.minecraft.inventory.IInventory)(p1)), ((int)(p2)), ((int)(p3)), ((int)(p4)));

    return;

}



static {
moom.wK.h = (moom._c.a(1650718778870964992L, 931063484638303796L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(83699228143933L);
}

private static native <E extends Throwable> void __sourceConstructorInit_756bfa0531288e3c_0(moom.wK a0, net.minecraft.inventory.IInventory a1, int a2, int a3, int a4) throws E;

private static moom.Oo b(moom.Oo p0) {
return p0;
}


public boolean a__Boolean(net.minecraft.item.ItemStack p0) {
net.minecraft.item.ItemStack forestValue943_11_0;
    net.minecraft.item.Item forestValue943_26_0;
    net.minecraft.item.Item forestValue943_34_0;
    net.minecraft.item.Item forestValue943_34_1;
    int forestValue943_41_0;
    int forestValue943_43_0;
    net.minecraft.item.ItemStack spill943_0;
    net.minecraft.item.Item spill943_1;
    net.minecraft.item.Item spill943_2;
    int spill943_3;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forest_join_43: {
    forest_join_42: {
    forest_join_41: {
    forest_join_40: {
    forest_join_35: {
    forest_join_34: {
    forest_join_26: {
    forest_join_24: {
    forest_join_11: {
    life2_3 = (moom.wK.h ^ 78769458802964L);
    life4_5 = moom.v8.b__Arrayr3();
    spill943_0 = p0;
    if (!((life4_5 == null))) {
        forestValue943_11_0 = spill943_0;
        break forest_join_11;
    }
    if (!((spill943_0 != null))) {
        break forest_join_42;
    }
    forestValue943_11_0 = p0;
    }
    spill943_1 = ((net.minecraft.item.ItemStack)(forestValue943_11_0)).a__wQ();
    if (!((life4_5 == null))) {
        forestValue943_26_0 = spill943_1;
        break forest_join_26;
    }
    if (!((((spill943_1 instanceof net.minecraft.item.ItemArmor) ? 1 : 0) != 0))) {
        break forest_join_24;
    }
    if (!((((net.minecraft.item.ItemArmor)(((net.minecraft.item.ItemArmor)(((net.minecraft.item.ItemStack)(p0)).a__wQ())))).q == this.f))) {
        break forest_join_42;
    }
    break forest_join_40;
    }
    forestValue943_26_0 = ((net.minecraft.item.ItemStack)(p0)).a__wQ();
    }
    spill943_2 = net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aU)));
    if (!((life4_5 == null))) {
        forestValue943_34_0 = forestValue943_26_0;
        forestValue943_34_1 = spill943_2;
        break forest_join_34;
    }
    if (!((forestValue943_26_0 != spill943_2))) {
        break forest_join_35;
    }
    forestValue943_34_0 = ((net.minecraft.item.ItemStack)(p0)).a__wQ();
    forestValue943_34_1 = net.minecraft.init.Items.bM;
    }
    if (!((forestValue943_34_0 == forestValue943_34_1))) {
        break forest_join_42;
    }
    }
    spill943_3 = this.f;
    if (!((life4_5 == null))) {
        forestValue943_41_0 = spill943_3;
        break forest_join_41;
    }
    if (!((spill943_3 == 0))) {
        break forest_join_42;
    }
    }
    forestValue943_41_0 = 1;
    }
    forestValue943_43_0 = forestValue943_41_0;
    break forest_join_43;
    }
    forestValue943_43_0 = 0;
    }
    return ((forestValue943_43_0) != 0);
}


public int a() {
return 1;
}


public java.lang.String a__String() {
return (net.minecraft.item.ItemArmor.o)[this.f];
}

}
