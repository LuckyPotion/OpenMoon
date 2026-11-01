package net.minecraft.entity.passive;


class EntityVillager$ItemAndEmeraldToItem implements net.minecraft.entity.passive.EntityVillager$ITradeList {

public net.minecraft.item.ItemStack a;

public moom.DO b;

public net.minecraft.item.ItemStack c;

public moom.DO d;

private static final long e;

public EntityVillager$ItemAndEmeraldToItem(net.minecraft.item.Item p0, moom.DO p1, net.minecraft.item.Item p2, moom.DO p3) {
super();
    this.a = new net.minecraft.item.ItemStack(p0);
    this.b = p1;
    this.c = new net.minecraft.item.ItemStack(p2);
    this.d = p3;
}


static {
net.minecraft.entity.passive.EntityVillager$ItemAndEmeraldToItem.e = (moom._c.a(1630776089498570705L, 5176209451644028721L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(265770558108510L);
}


public void a(moom.OF p0, java.util.Random p1) {
moom.DO forwardValue5355_15_0;
    int spill5355_0;
    moom.DO spill5355_1;
    long life3_3;
    int life6_6;
    int life5_7;
    int life7_25;
    forward_join_60: {
    forward_join_30: {
    forward_join_18: {
    forward_join_15: {
    life3_3 = (net.minecraft.entity.passive.EntityVillager$ItemAndEmeraldToItem.e ^ 109867847372257L);
    spill5355_0 = moom.vR.b();
    life6_6 = 1;
    life5_7 = spill5355_0;
    spill5355_1 = this.b;
    if (!((life5_7 != 0))) {
        forwardValue5355_15_0 = spill5355_1;
        break forward_join_15;
    }
    if (!((spill5355_1 != null))) {
        break forward_join_18;
    }
    forwardValue5355_15_0 = this.b;
    }
    life6_6 = ((moom.DO)(forwardValue5355_15_0)).a(((java.util.Random)(p1)));
    }
    life7_25 = 1;
    if (!((life5_7 != 0))) {
        break forward_join_60;
    }
    if (!((this.d != null))) {
        break forward_join_30;
    }
    life7_25 = ((moom.DO)(this.d)).a(((java.util.Random)(p1)));
    }
    ((moom.OF)(p0)).add(((new net.minecraft.village.MerchantRecipe(new net.minecraft.item.ItemStack(((net.minecraft.item.ItemStack)(this.a)).a__wQ(), life6_6, ((net.minecraft.item.ItemStack)(this.a)).c()), new net.minecraft.item.ItemStack(net.minecraft.init.Items.bD), new net.minecraft.item.ItemStack(((net.minecraft.item.ItemStack)(this.c)).a__wQ(), life7_25, ((net.minecraft.item.ItemStack)(this.c)).c())))));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
