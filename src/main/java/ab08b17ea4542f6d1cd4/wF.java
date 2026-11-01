package moom;


class wF extends moom.wB {

private final net.minecraft.entity.player.EntityPlayer f;

private static final long g;

public wF(net.minecraft.entity.player.EntityPlayer p0, net.minecraft.inventory.IInventory p1, int p2, int p3, int p4) {
super(p1, p2, p3, p4);
    this.f = p0;
}


static {
g = (moom._c.a(7278121503870249806L, -4916596626344040196L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(230478232187446L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public static boolean b__sourceReturn_2aed085586(net.minecraft.item.ItemStack p0) {
net.minecraft.item.ItemStack forwardValue4359_11_0;
    net.minecraft.item.Item forwardValue4359_19_0;
    net.minecraft.item.Item forwardValue4359_19_1;
    int forwardValue4359_23_0;
    net.minecraft.item.ItemStack spill4359_0;
    net.minecraft.item.Item spill4359_1;
    net.minecraft.item.ItemPotion spill4359_2;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_23: {
    forward_join_22: {
    forward_join_20: {
    forward_join_19: {
    forward_join_11: {
    life1_3 = (moom.wF.g ^ 64733947927798L);
    life3_5 = moom.v8.b__Arrayr3();
    spill4359_0 = p0;
    if (!((life3_5 == null))) {
        forwardValue4359_11_0 = spill4359_0;
        break forward_join_11;
    }
    if (!((spill4359_0 != null))) {
        break forward_join_22;
    }
    forwardValue4359_11_0 = p0;
    }
    spill4359_1 = ((net.minecraft.item.ItemStack)(forwardValue4359_11_0)).a__wQ();
    spill4359_2 = net.minecraft.init.Items.bo;
    if (!((life3_5 == null))) {
        forwardValue4359_19_0 = spill4359_1;
        forwardValue4359_19_1 = spill4359_2;
        break forward_join_19;
    }
    if (!((spill4359_1 != spill4359_2))) {
        break forward_join_20;
    }
    forwardValue4359_19_0 = ((net.minecraft.item.ItemStack)(p0)).a__wQ();
    forwardValue4359_19_1 = net.minecraft.init.Items.bp;
    }
    if (!((forwardValue4359_19_0 == forwardValue4359_19_1))) {
        break forward_join_22;
    }
    }
    forwardValue4359_23_0 = 1;
    break forward_join_23;
    }
    forwardValue4359_23_0 = 0;
    }
    return ((forwardValue4359_23_0) != 0);
}


public int a() {
return 1;
}


public boolean a__Boolean(net.minecraft.item.ItemStack p0) {
return (__sourceIntrinsic_booleanComparison((__sourceExactCall_65b5292fd5912d(((net.minecraft.item.ItemStack)(p0))))) != 0);
}


public void a(net.minecraft.entity.player.EntityPlayer p0, net.minecraft.item.ItemStack p1) {
long local3 = (moom.wF.g ^ 115835869538850L);
    java.lang.Object[] local5 = moom.v8.b__Arrayr3();
    if ((local5 == null)) {
        if ((((net.minecraft.item.ItemStack)(p1)).a__wQ() == net.minecraft.init.Items.bo)) {
        if ((((net.minecraft.item.ItemStack)(p1)).c() > 0)) {
        ((net.minecraft.entity.player.EntityPlayer)(this.f)).a(((moom.BY)(net.minecraft.stats.AchievementList.B)));
    }
    }
        super.a(((net.minecraft.entity.player.EntityPlayer)(p0)), ((net.minecraft.item.ItemStack)(p1)));
    }
    return;
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native boolean __sourceExactCall_65b5292fd5912d(net.minecraft.item.ItemStack p0);
}
