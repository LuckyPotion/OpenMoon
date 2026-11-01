package moom;


class rk extends moom.rd {

private final moom.rd c;

private static final long d;

rk() {
super();
    this.c = new moom.rd();
}


static {
moom.rk.d = (moom._c.a(-799273373101836844L, 6095338699682424948L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(212393868290454L);
}


public net.minecraft.item.ItemStack b(moom.ry p0, net.minecraft.item.ItemStack p1) {
long life3_3;
    moom.w9 life6_8;
    moom.DT life7_15;
    int life5_16;
    forward_join_33: {
    forward_join_31: {
    life3_3 = (moom.rk.d ^ 121695038076097L);
    boolean spill4536_0 = moom.v5.b__Boolean();
    life6_8 = ((moom.w9)(((net.minecraft.item.ItemStack)(p1)).a__wQ()));
    life7_15 = ((moom.DT)(((moom.ry)(p0)).a__DT())).a(((moom.bs)(__sourceExactCall_b9f266c58b58a2(((int)(((moom.ry)(p0)).a__Int()))))));
    life5_16 = ((spill4536_0) ? 1 : 0);
    if (!((life5_16 != 0))) { break forward_join_31; }
    if (!(((moom.w9)(life6_8)).a(((net.minecraft.world.World)(((moom.ry)(p0)).a__Eu())), ((moom.DT)(life7_15))))) { break forward_join_33; }
    ((net.minecraft.item.ItemStack)(p1)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aw)));
    ((net.minecraft.item.ItemStack)(p1)).b = ((int)(1));
    }
    return p1;
    }
    return ((moom.rd)(this.c)).a(((moom.ry)(p0)), ((net.minecraft.item.ItemStack)(p1)));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static native moom.bs __sourceExactCall_b9f266c58b58a2(int p0);
}
