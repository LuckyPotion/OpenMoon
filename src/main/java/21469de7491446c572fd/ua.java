package moom;


public class ua implements net.minecraft.entity.IMerchant {

private final moom.wA a;

private final net.minecraft.entity.player.EntityPlayer b;

private moom.OF c;

private final net.minecraft.util.IChatComponent d;

private static final long e;

public ua(net.minecraft.entity.player.EntityPlayer p0, net.minecraft.util.IChatComponent p1) {
super();
    this.b = ((net.minecraft.entity.player.EntityPlayer)(p0));
    this.d = ((net.minecraft.util.IChatComponent)(p1));
    this.a = ((moom.wA)(new moom.wA(p0, this)));
    return;
}


static {
e = (moom._c.a(5838460554226020449L, -3933797211057998511L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(175745006263531L);
}


public void a(net.minecraft.village.MerchantRecipe p0) {
((net.minecraft.village.MerchantRecipe)(p0)).a__Void();
    return;
}


public void a__sourceReturn_481e10a41f(net.minecraft.item.ItemStack p0) {
return;
}


public net.minecraft.util.IChatComponent a__C5() {
net.minecraft.util.IChatComponent forwardValue4194_13_0;
    net.minecraft.util.IChatComponent forwardValue4194_20_0;
    net.minecraft.util.IChatComponent spill4194_0;
    long life1_3;
    int life3_5;
    forward_join_20: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (moom.ua.e ^ 74258347381034L);
    life3_5 = net.minecraft.entity.SharedMonsterAttributes.b();
    spill4194_0 = this.d;
    if (!((life3_5 == 0))) {
        forwardValue4194_13_0 = spill4194_0;
        break forward_join_13;
    }
    if (!((spill4194_0 != null))) {
        break forward_join_14;
    }
    forwardValue4194_13_0 = this.d;
    }
    forwardValue4194_20_0 = forwardValue4194_13_0;
    break forward_join_20;
    }
    forwardValue4194_20_0 = new moom.CN("entity.Villager.name", new java.lang.Object[0]);
    }
    return forwardValue4194_20_0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.entity.player.EntityPlayer a__tn() {
return this.b;
}


public void a__Void(net.minecraft.entity.player.EntityPlayer p0) {
return;
}


public moom.OF a__sourceReturn_71345e1ee6(net.minecraft.entity.player.EntityPlayer p0) {
return this.c;
}


public void a(moom.OF p0) {
this.c = ((moom.OF)(p0));
    return;
}

}
