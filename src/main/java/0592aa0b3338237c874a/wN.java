package moom;


public class wN extends moom.wB {

private static final long f;

public wN(net.minecraft.inventory.IInventory p0, int p1, int p2, int p3) {
super(p0, p1, p2, p3);
}


static {
f = (moom._c.a(4321048650376876276L, 3498625386169400673L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(52040287315392L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public static boolean b__sourceReturn_2aed085586(net.minecraft.item.ItemStack p0) {
net.minecraft.item.ItemStack forwardValue4371_11_0;
    net.minecraft.item.Item forwardValue4371_17_0;
    int forwardValue4371_22_0;
    net.minecraft.item.ItemStack spill4371_0;
    net.minecraft.item.Item spill4371_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_17: {
    forward_join_11: {
    life1_3 = (moom.wN.f ^ 58420825671902L);
    life3_5 = moom.v8.b__Arrayr3();
    spill4371_0 = p0;
    if (!((life3_5 == null))) {
        forwardValue4371_11_0 = spill4371_0;
        break forward_join_11;
    }
    if (!((spill4371_0 != null))) {
        break forward_join_21;
    }
    forwardValue4371_11_0 = p0;
    }
    spill4371_1 = ((net.minecraft.item.ItemStack)(forwardValue4371_11_0)).a__wQ();
    if (!((life3_5 == null))) {
        forwardValue4371_17_0 = spill4371_1;
        break forward_join_17;
    }
    if (!((spill4371_1 != null))) {
        break forward_join_21;
    }
    forwardValue4371_17_0 = ((net.minecraft.item.ItemStack)(p0)).a__wQ();
    }
    if (!((forwardValue4371_17_0 == net.minecraft.init.Items.aw))) {
        break forward_join_21;
    }
    forwardValue4371_22_0 = 1;
    break forward_join_22;
    }
    forwardValue4371_22_0 = 0;
    }
    return ((forwardValue4371_22_0) != 0);
}


public int a(net.minecraft.item.ItemStack p0) {
int forwardValue4369_12_0;
    int forwardValue4369_16_0;
    boolean spill4369_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_16: {
    forward_join_13: {
    forward_join_12: {
    life2_3 = (moom.wN.f ^ 80157868580453L);
    life4_5 = moom.v8.b__Arrayr3();
    spill4369_0 = __sourceExactCall_495c934b8653bf(((net.minecraft.item.ItemStack)(p0)));
    if (!((life4_5 == null))) {
        forwardValue4369_12_0 = ((spill4369_0) ? 1 : 0);
        break forward_join_12;
    }
    if (!(spill4369_0)) {
        break forward_join_13;
    }
    forwardValue4369_12_0 = 1;
    }
    forwardValue4369_16_0 = forwardValue4369_12_0;
    break forward_join_16;
    }
    forwardValue4369_16_0 = super.a(((net.minecraft.item.ItemStack)(p0)));
    }
    return forwardValue4369_16_0;
}


public boolean a__Boolean(net.minecraft.item.ItemStack p0) {
int forwardValue4370_17_0;
    int forwardValue4370_19_0;
    boolean spill4370_0;
    boolean spill4370_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life2_3 = (moom.wN.f ^ 133458328802362L);
    life4_5 = moom.v8.b__Arrayr3();
    spill4370_0 = net.minecraft.tileentity.TileEntityFurnace.a__Boolean(((net.minecraft.item.ItemStack)(p0)));
    if (!((life4_5 == null))) {
        forwardValue4370_17_0 = ((spill4370_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!((!spill4370_0))) {
        break forward_join_16;
    }
    spill4370_1 = __sourceExactCall_495c934b8653bf(((net.minecraft.item.ItemStack)(p0)));
    if (!((life4_5 == null))) {
        forwardValue4370_17_0 = ((spill4370_1) ? 1 : 0);
        break forward_join_17;
    }
    if (!(spill4370_1)) {
        break forward_join_18;
    }
    }
    forwardValue4370_17_0 = 1;
    }
    forwardValue4370_19_0 = forwardValue4370_17_0;
    break forward_join_19;
    }
    forwardValue4370_19_0 = 0;
    }
    return ((forwardValue4370_19_0) != 0);
}


private static native boolean __sourceExactCall_495c934b8653bf(net.minecraft.item.ItemStack p0);
}
