package moom;


class wD extends moom.wB {

private static final long f;

public wD(net.minecraft.inventory.IInventory p0, int p1, int p2, int p3) {
super(p0, p1, p2, p3);
}


static {
f = (moom._c.a(-7809631399207010298L, 4695490528585406616L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(39422043846735L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public boolean a__Boolean(net.minecraft.item.ItemStack p0) {
net.minecraft.item.ItemStack forwardValue4357_11_0;
    net.minecraft.item.Item forwardValue4357_19_0;
    net.minecraft.item.Item forwardValue4357_19_1;
    net.minecraft.item.Item forwardValue4357_25_0;
    net.minecraft.item.Item forwardValue4357_25_1;
    net.minecraft.item.Item forwardValue4357_31_0;
    net.minecraft.item.Item forwardValue4357_31_1;
    int forwardValue4357_35_0;
    net.minecraft.item.ItemStack spill4357_0;
    net.minecraft.item.Item spill4357_1;
    net.minecraft.item.Item spill4357_2;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_35: {
    forward_join_34: {
    forward_join_32: {
    forward_join_31: {
    forward_join_25: {
    forward_join_19: {
    forward_join_11: {
    life2_3 = (moom.wD.f ^ 138432526376865L);
    life4_5 = moom.v8.b__Arrayr3();
    spill4357_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue4357_11_0 = spill4357_0;
        break forward_join_11;
    }
    if (!((spill4357_0 != null))) {
        break forward_join_34;
    }
    forwardValue4357_11_0 = p0;
    }
    spill4357_1 = ((net.minecraft.item.ItemStack)(forwardValue4357_11_0)).a__wQ();
    spill4357_2 = net.minecraft.init.Items.bD;
    if (!((life4_5 == null))) {
        forwardValue4357_19_0 = spill4357_1;
        forwardValue4357_19_1 = spill4357_2;
        break forward_join_19;
    }
    if (!((spill4357_1 != spill4357_2))) {
        break forward_join_32;
    }
    forwardValue4357_19_0 = ((net.minecraft.item.ItemStack)(p0)).a__wQ();
    forwardValue4357_19_1 = net.minecraft.init.Items.i;
    }
    if (!((life4_5 == null))) {
        forwardValue4357_25_0 = forwardValue4357_19_0;
        forwardValue4357_25_1 = forwardValue4357_19_1;
        break forward_join_25;
    }
    if (!((forwardValue4357_19_0 != forwardValue4357_19_1))) {
        break forward_join_32;
    }
    forwardValue4357_25_0 = ((net.minecraft.item.ItemStack)(p0)).a__wQ();
    forwardValue4357_25_1 = net.minecraft.init.Items.k;
    }
    if (!((life4_5 == null))) {
        forwardValue4357_31_0 = forwardValue4357_25_0;
        forwardValue4357_31_1 = forwardValue4357_25_1;
        break forward_join_31;
    }
    if (!((forwardValue4357_25_0 != forwardValue4357_25_1))) {
        break forward_join_32;
    }
    forwardValue4357_31_0 = ((net.minecraft.item.ItemStack)(p0)).a__wQ();
    forwardValue4357_31_1 = net.minecraft.init.Items.j;
    }
    if (!((forwardValue4357_31_0 == forwardValue4357_31_1))) {
        break forward_join_34;
    }
    }
    forwardValue4357_35_0 = 1;
    break forward_join_35;
    }
    forwardValue4357_35_0 = 0;
    }
    return ((forwardValue4357_35_0) != 0);
}


public int a() {
return 1;
}

}
