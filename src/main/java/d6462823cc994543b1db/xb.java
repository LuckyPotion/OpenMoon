package moom;


public class xb extends net.minecraft.item.Item {

private static final long n;

public xb() {
super();
    (this).a(true);
    (this).c(0);
    (this).a(net.minecraft.creativetab.CreativeTabs.l);
}


static {
moom.xb.n = (moom._c.a(8437920805388108470L, -1984279873722458672L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(139998588634595L);
}


public java.lang.String b__String(net.minecraft.item.ItemStack p0) {
long local2 = (moom.xb.n ^ 15764517821974L);
    return ((((net.minecraft.item.ItemStack)(p0)).c() == 1) ? "item.charcoal" : "item.coal");
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(net.minecraft.item.Item p0, net.minecraft.creativetab.CreativeTabs p1, java.util.List<net.minecraft.item.ItemStack> p2) {
((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(p0, 1, 0))));
    ((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(p0, 1, 1))));
    return;
}

}
