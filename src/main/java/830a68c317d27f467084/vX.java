package moom;


class vX implements net.minecraft.entity.passive.EntityVillager$ITradeList {

public net.minecraft.item.ItemStack a;

public moom.DO b;

private static final long c;

public vX(net.minecraft.item.Item p0, moom.DO p1) {
super();
    this.a = new net.minecraft.item.ItemStack(p0);
    this.b = p1;
}


public vX(net.minecraft.item.ItemStack p0, moom.DO p1) {
super();
    this.a = p0;
    this.b = p1;
}


static {
c = (moom._c.a(4162968312286436285L, -4672645279338433635L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(97447376838763L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(moom.OF p0, java.util.Random p1) {
moom.DO forwardValue455_15_0;
    int spill455_0;
    moom.DO spill455_1;
    long life3_3;
    int life6_6;
    int life5_7;
    net.minecraft.item.ItemStack life7_32;
    net.minecraft.item.ItemStack life8_44;
    forward_join_59: {
    forward_join_41: {
    forward_join_18: {
    forward_join_15: {
    life3_3 = (moom.vX.c ^ 82668489561794L);
    spill455_0 = moom.vR.b();
    life6_6 = 1;
    life5_7 = spill455_0;
    spill455_1 = this.b;
    if (!((life5_7 != 0))) {
        forwardValue455_15_0 = spill455_1;
        break forward_join_15;
    }
    if (!((spill455_1 != null))) {
        break forward_join_18;
    }
    forwardValue455_15_0 = this.b;
    }
    life6_6 = ((moom.DO)(forwardValue455_15_0)).a(((java.util.Random)(p1)));
    }
    if (!((life6_6 < 0))) {
        break forward_join_41;
    }
    life7_32 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.bD, 1, 0);
    life8_44 = new net.minecraft.item.ItemStack(((net.minecraft.item.ItemStack)(this.a)).a__wQ(), (-life6_6), ((net.minecraft.item.ItemStack)(this.a)).c());
    if (!((life5_7 == 0))) {
        break forward_join_59;
    }
    }
    life7_32 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.bD, life6_6, 0);
    life8_44 = new net.minecraft.item.ItemStack(((net.minecraft.item.ItemStack)(this.a)).a__wQ(), 1, ((net.minecraft.item.ItemStack)(this.a)).c());
    }
    ((moom.OF)(p0)).add(((new net.minecraft.village.MerchantRecipe(life7_32, life8_44))));
    return;
}

}
