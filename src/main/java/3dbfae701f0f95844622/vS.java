package moom;


class vS implements net.minecraft.entity.passive.EntityVillager$ITradeList {

public net.minecraft.item.Item a;

public moom.DO b;

private static final long c;

public vS(net.minecraft.item.Item p0, moom.DO p1) {
super();
    this.a = p0;
    this.b = p1;
}


static {
moom.vS.c = (moom._c.a(-8582305524861938960L, -8939727629044805071L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(176023591973429L);
}


public void a(moom.OF p0, java.util.Random p1) {
long life3_3;
    int life6_6;
    int life5_7;
    life3_3 = (moom.vS.c ^ 90682396899535L);
    int spill7706_0 = moom.vR.c();
    life6_6 = 1;
    life5_7 = spill7706_0;
    if ((life5_7 == 0)) {
        if ((this.b != null)) {
        life6_6 = ((moom.DO)(this.b)).a(((java.util.Random)(p1)));
    }
        ((moom.OF)(p0)).add(((new net.minecraft.village.MerchantRecipe(new net.minecraft.item.ItemStack(this.a, life6_6, 0), net.minecraft.init.Items.bD))));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
