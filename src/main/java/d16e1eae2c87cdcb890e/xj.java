package moom;


public class xj extends net.minecraft.item.Item {

private static final long n;

public xj() {
super();
    (this).a(net.minecraft.creativetab.CreativeTabs.f);
}


static {
n = (moom._c.a(8557801044378416856L, 4614464401135784280L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(205726558508421L);
}


public boolean b__Boolean(net.minecraft.item.ItemStack p0) {
return ((1) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.item.ItemStack a(net.minecraft.item.ItemStack p0, net.minecraft.world.World p1, net.minecraft.entity.player.EntityPlayer p2) {
int forwardValue4524_35_0;
    boolean spill4524_0;
    long life4_3;
    int life6_5;
    forward_join_50: {
    forward_join_44: {
    forward_join_35: {
    forward_join_18: {
    life4_3 = (moom.xj.n ^ 64517162896442L);
    life6_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);
    spill4524_0 = ((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p2)).b1)).d;
    if (!((life6_5 != 0))) {
        forwardValue4524_35_0 = ((spill4524_0) ? 1 : 0);
        break forward_join_35;
    }
    if (!((!spill4524_0))) {
        break forward_join_18;
    }
    net.minecraft.item.ItemStack __stackOp4524_6_0 = p0;
    ((net.minecraft.item.ItemStack)(__stackOp4524_6_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp4524_6_0)).b - 1)));
    }
    ((net.minecraft.world.World)(p1)).a(((net.minecraft.entity.Entity)(p2)), ((java.lang.String)("random.bow")), ((float)(0x1.0p-1f)), ((float)((0x1.99999ap-2f / ((((java.util.Random)(moom.xj.e)).nextFloat() * 0x1.99999ap-2f) + 0x1.99999ap-1f)))));
    if (!((life6_5 != 0))) {
        break forward_join_50;
    }
    forwardValue4524_35_0 = ((((net.minecraft.world.World)(p1)).G) ? 1 : 0);
    }
    if (!((forwardValue4524_35_0 == 0))) {
        break forward_join_44;
    }
    ((net.minecraft.world.World)(p1)).b__Boolean(((net.minecraft.entity.Entity)(new moom.tU(p1, p2))));
    }
    ((net.minecraft.entity.player.EntityPlayer)(p2)).a(((moom.BY)((net.minecraft.stats.StatList.ad)[net.minecraft.item.Item.a(((net.minecraft.item.Item)(this)))])));
    }
    return p0;
}

}
