package moom;


class rr extends moom.rd {

private static final long c;

rr() {
super();
}


static {
c = (moom._c.a(8701897250641165078L, -1519274875349941224L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(16780855816130L);
}


public net.minecraft.item.ItemStack b(moom.ry p0, net.minecraft.item.ItemStack p1) {
net.minecraft.item.ItemStack forwardValue3931_60_0;
    boolean spill3931_0;
    net.minecraft.item.ItemStack spill3931_1;
    long life3_3;
    moom.bs life6_7;
    double life7_14;
    double life9_22;
    double life11_30;
    net.minecraft.entity.Entity life13_39;
    int life5_40;
    forward_join_60: {
    forward_join_59: {
    forward_join_55: {
    life3_3 = (moom.rr.c ^ 57113789097479L);
    life6_7 = __sourceExactCall_b9f266c58b58a2(((int)(((moom.ry)(p0)).a__Int())));
    life7_14 = (((moom.ry)(p0)).a() + ((double) ((moom.bs)(life6_7)).c()));
    life9_22 = ((double) (((float) ((moom.DT)(((moom.ry)(p0)).a__DT())).b()) + 0x1.99999ap-3f));
    spill3931_0 = moom.v5.b__Boolean();
    life11_30 = (((moom.ry)(p0)).c() + ((double) ((moom.bs)(life6_7)).e()));
    life13_39 = __sourceExactCall_de0a459018a45f(((net.minecraft.world.World)(((moom.ry)(p0)).a__Eu())), ((int)(((net.minecraft.item.ItemStack)(p1)).c())), ((double)(life7_14)), ((double)(life9_22)), ((double)(life11_30)));
    life5_40 = ((spill3931_0) ? 1 : 0);
    if (!((life5_40 != 0))) {
        break forward_join_59;
    }
    if (!((((life13_39 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0) != 0))) {
        break forward_join_55;
    }
    spill3931_1 = p1;
    if (!((life5_40 != 0))) {
        forwardValue3931_60_0 = spill3931_1;
        break forward_join_60;
    }
    if (!(((net.minecraft.item.ItemStack)(spill3931_1)).f__Boolean())) {
        break forward_join_55;
    }
    ((net.minecraft.entity.Entity)(life13_39)).a(((java.lang.String)(((net.minecraft.item.ItemStack)(p1)).b__String())));
    }
    ((net.minecraft.item.ItemStack)(p1)).a(((int)(1)));
    }
    forwardValue3931_60_0 = p1;
    }
    return forwardValue3931_60_0;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static native moom.bs __sourceExactCall_b9f266c58b58a2(int p0);
private static native net.minecraft.entity.Entity __sourceExactCall_de0a459018a45f(net.minecraft.world.World p0, int p1, double p2, double p3, double p4);
}
