package moom;


class wH extends moom.wB {

moom.we f;

private static long g;

wH(moom.we p0, net.minecraft.inventory.IInventory p1, int p2, int p3, int p4) { super((net.minecraft.inventory.IInventory)null, 0, 0, 0); }


private static void __sourceConstructorBody_c874a8d826924f7d(moom.wH receiver, moom.we p0, net.minecraft.inventory.IInventory p1, int p2, int p3, int p4) throws Throwable {

((moom.wH)(receiver)).f = ((moom.we)(p0));

    moom.wH.__sourceConstructorInit_c874a8d826924f7d_0(((moom.wH)(receiver)), ((net.minecraft.inventory.IInventory)(p1)), ((int)(p2)), ((int)(p3)), ((int)(p4)));

    return;

}



static {
moom.wH.g = (moom._c.a(-8035742931161393131L, 5587753772734072672L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(31684681328406L);
}

private static native <E extends Throwable> void __sourceConstructorInit_c874a8d826924f7d_0(moom.wH a0, net.minecraft.inventory.IInventory a1, int a2, int a3, int a4) throws E;

private static moom.Oo b(moom.Oo p0) {
return p0;
}


public boolean a__Boolean(net.minecraft.item.ItemStack p0) {
net.minecraft.item.ItemStack forwardValue4360_13_0;
    int forwardValue4360_20_0;
    int forwardValue4360_22_0;
    net.minecraft.item.ItemStack spill4360_0;
    int spill4360_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    forward_join_13: {
    life2_3 = (moom.wH.g ^ 140049841608428L);
    life4_5 = moom.v8.b__Arrayr3();
    spill4360_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue4360_13_0 = spill4360_0;
        break forward_join_13;
    }
    if (!((((net.minecraft.item.ItemStack)(spill4360_0)).a__wQ() == net.minecraft.init.Items.aW))) {
        break forward_join_21;
    }
    forwardValue4360_13_0 = p0;
    }
    spill4360_1 = ((net.minecraft.item.ItemStack)(forwardValue4360_13_0)).c();
    if (!((life4_5 == null))) {
        forwardValue4360_20_0 = spill4360_1;
        break forward_join_20;
    }
    if (!((net.minecraft.item.EnumDyeColor.a(((int)(spill4360_1))) == net.minecraft.item.EnumDyeColor.BLUE))) {
        break forward_join_21;
    }
    forwardValue4360_20_0 = 1;
    }
    forwardValue4360_22_0 = forwardValue4360_20_0;
    break forward_join_22;
    }
    forwardValue4360_22_0 = 0;
    }
    return ((forwardValue4360_22_0) != 0);
}

}
