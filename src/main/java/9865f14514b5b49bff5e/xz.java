package moom;


public class xz extends net.minecraft.item.ItemMapBase {

private static final long n;

protected xz() {
super();
    (this).a(net.minecraft.creativetab.CreativeTabs.f);
}


static {
n = (moom._c.a(4766821112968913384L, 4518572076094798793L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(24497525377179L);
}


public net.minecraft.item.ItemStack a__sourceReturn_54160c01ff(net.minecraft.item.ItemStack p0, net.minecraft.world.World p1, net.minecraft.entity.player.EntityPlayer p2) {
int forwardValue4549_67_0;
    net.minecraft.entity.player.EntityPlayer forwardValue4549_74_0;
    boolean spill4549_0;
    int spill4549_1;
    net.minecraft.entity.player.EntityPlayer spill4549_2;
    long life4_3;
    net.minecraft.item.ItemStack life7_13;
    java.lang.String life8_17;
    int life6_18;
    net.minecraft.world.storage.MapData life9_23;
    forward_join_74: {
    forward_join_73: {
    forward_join_67: {
    forward_join_60: {
    life4_3 = (moom.xz.n ^ 1991777868003L);
    spill4549_0 = net.minecraft.item.ItemStack.l();
    life7_13 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.a3, 1, ((net.minecraft.world.World)(p1)).a(((java.lang.String)("map"))));
    life8_17 = __sourceIntrinsic_69c34d036b8d_invokedynamic4549_5(((net.minecraft.item.ItemStack)(life7_13)).c());
    life6_18 = ((spill4549_0) ? 1 : 0);
    life9_23 = new net.minecraft.world.storage.MapData(life8_17);
    ((net.minecraft.world.World)(p1)).a(((java.lang.String)(life8_17)), ((net.minecraft.world.WorldSavedData)(life9_23)));
    ((net.minecraft.world.storage.MapData)(life9_23)).f = ((byte)(0));
    ((net.minecraft.world.storage.MapData)(life9_23)).a(((double)(((net.minecraft.entity.player.EntityPlayer)(p2)).n)), ((double)(((net.minecraft.entity.player.EntityPlayer)(p2)).p)), ((int)(((net.minecraft.world.storage.MapData)(life9_23)).f)));
    ((net.minecraft.world.storage.MapData)(life9_23)).e = ((byte)(((byte) ((moom.EA)(((net.minecraft.world.World)(p1)).v)).b())));
    ((net.minecraft.world.storage.MapData)(life9_23)).a();
    net.minecraft.item.ItemStack __stackOp4549_17_0 = p0;
    ((net.minecraft.item.ItemStack)(__stackOp4549_17_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp4549_17_0)).b - 1)));
    spill4549_1 = ((net.minecraft.item.ItemStack)(p0)).b;
    if (!((life6_18 == 0))) {
        forwardValue4549_67_0 = spill4549_1;
        break forward_join_67;
    }
    if (!((spill4549_1 <= 0))) {
        break forward_join_60;
    }
    return life7_13;
    }
    spill4549_2 = p2;
    if (!((life6_18 == 0))) {
        forwardValue4549_74_0 = spill4549_2;
        break forward_join_74;
    }
    forwardValue4549_67_0 = ((((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(spill4549_2)).bD)).a__Boolean(((net.minecraft.item.ItemStack)(((net.minecraft.item.ItemStack)(life7_13)).a__xW())))) ? 1 : 0);
    }
    if (!((forwardValue4549_67_0 == 0))) {
        break forward_join_73;
    }
    ((net.minecraft.entity.player.EntityPlayer)(p2)).a(((net.minecraft.item.ItemStack)(life7_13)), ((boolean)(false)));
    }
    forwardValue4549_74_0 = p2;
    }
    ((net.minecraft.entity.player.EntityPlayer)(forwardValue4549_74_0)).a(((moom.BY)((net.minecraft.stats.StatList.ad)[net.minecraft.item.Item.a(((net.minecraft.item.Item)(this)))])));
    return p0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_69c34d036b8d_invokedynamic4549_5(int a0) throws E;
}
