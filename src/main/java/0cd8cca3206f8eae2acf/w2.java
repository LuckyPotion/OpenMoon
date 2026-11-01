package moom;


public class w2 extends moom.w0 {

private static final long r;

public w2(net.minecraft.block.Block p0, net.minecraft.block.Block p1, com.google.common.base.Function<net.minecraft.item.ItemStack, java.lang.String> p2) {
super(p0, p1, p2);
}


static {
r = (moom._c.a(3692772445424307866L, 6578545067923211096L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(206230769383138L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public int a(net.minecraft.item.ItemStack p0, int p1) {
net.minecraft.block.BlockDoublePlant$EnumPlantType forwardValue4339_17_0;
    net.minecraft.block.BlockDoublePlant$EnumPlantType forwardValue4339_17_1;
    int forwardValue4339_26_0;
    boolean spill4339_0;
    net.minecraft.block.BlockDoublePlant$EnumPlantType spill4339_1;
    net.minecraft.block.BlockDoublePlant$EnumPlantType spill4339_2;
    long life3_3;
    net.minecraft.block.BlockDoublePlant$EnumPlantType life6_8;
    int life5_9;
    forward_join_26: {
    forward_join_23: {
    forward_join_17: {
    life3_3 = (moom.w2.r ^ 29339739863011L);
    spill4339_0 = net.minecraft.item.ItemStack.l();
    life6_8 = net.minecraft.block.BlockDoublePlant$EnumPlantType.a(((int)(((net.minecraft.item.ItemStack)(p0)).c())));
    life5_9 = ((spill4339_0) ? 1 : 0);
    spill4339_1 = life6_8;
    spill4339_2 = net.minecraft.block.BlockDoublePlant$EnumPlantType.GRASS;
    if (!((life5_9 == 0))) {
        forwardValue4339_17_0 = spill4339_1;
        forwardValue4339_17_1 = spill4339_2;
        break forward_join_17;
    }
    if (!((spill4339_1 != spill4339_2))) {
        break forward_join_23;
    }
    forwardValue4339_17_0 = life6_8;
    forwardValue4339_17_1 = net.minecraft.block.BlockDoublePlant$EnumPlantType.FERN;
    }
    if (!((forwardValue4339_17_0 != forwardValue4339_17_1))) {
        break forward_join_23;
    }
    forwardValue4339_26_0 = super.a(((net.minecraft.item.ItemStack)(p0)), ((int)(p1)));
    break forward_join_26;
    }
    forwardValue4339_26_0 = moom.Eg.a(((double)(0x1.0p-1d)), ((double)(0x1.0p0d)));
    }
    return forwardValue4339_26_0;
}

}
