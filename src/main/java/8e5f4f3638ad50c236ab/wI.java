package moom;


class wI extends moom.wB {

moom.wh f;

private static long g;

wI(moom.wh p0, net.minecraft.inventory.IInventory p1, int p2, int p3, int p4) { super((net.minecraft.inventory.IInventory)null, 0, 0, 0); }


private static void __sourceConstructorBody_ee664ff776b90a40(moom.wI receiver, moom.wh p0, net.minecraft.inventory.IInventory p1, int p2, int p3, int p4) throws Throwable {

((moom.wI)(receiver)).f = ((moom.wh)(p0));

    moom.wI.__sourceConstructorInit_ee664ff776b90a40_0(((moom.wI)(receiver)), ((net.minecraft.inventory.IInventory)(p1)), ((int)(p2)), ((int)(p3)), ((int)(p4)));

    return;

}



static {
moom.wI.g = (moom._c.a(4286184766937963122L, -9163251306642686995L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(218783806546771L);
}

private static native <E extends Throwable> void __sourceConstructorInit_ee664ff776b90a40_0(moom.wI a0, net.minecraft.inventory.IInventory a1, int a2, int a3, int a4) throws E;

private static moom.Oo b(moom.Oo p0) {
return p0;
}


public boolean a__Boolean(net.minecraft.item.ItemStack p0) {
int forwardValue4361_20_0;
    int forwardValue4361_22_0;
    boolean spill4361_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    life2_3 = (moom.wI.g ^ 139227892396135L);
    life4_5 = moom.v8.b__Arrayr3();
    if (!(super.a__Boolean(((net.minecraft.item.ItemStack)(p0))))) {
        break forward_join_21;
    }
    if (!((((net.minecraft.item.ItemStack)(p0)).a__wQ() == net.minecraft.init.Items.aA))) {
        break forward_join_21;
    }
    spill4361_0 = ((moom.wI)(this)).a__Boolean();
    if (!((life4_5 == null))) {
        forwardValue4361_20_0 = ((spill4361_0) ? 1 : 0);
        break forward_join_20;
    }
    if (!((!spill4361_0))) {
        break forward_join_21;
    }
    forwardValue4361_20_0 = 1;
    }
    forwardValue4361_22_0 = forwardValue4361_20_0;
    break forward_join_22;
    }
    forwardValue4361_22_0 = 0;
    }
    return ((forwardValue4361_22_0) != 0);
}

}
