package moom;


class v6 implements moom.rx {

private final moom.rd b;

private static final long c;

v6() {
super();
    this.b = new moom.rd();
}


static {
c = (moom._c.a(-2209491642340254314L, 986828846342903820L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(184015423604413L);
}


public net.minecraft.item.ItemStack a(moom.ry p0, net.minecraft.item.ItemStack p1) {
net.minecraft.item.ItemStack forwardValue4264_20_0;
    net.minecraft.item.ItemStack forwardValue4264_26_0;
    net.minecraft.item.ItemStack spill4264_0;
    long life3_3;
    int life5_5;
    forward_join_26: {
    forward_join_21: {
    forward_join_20: {
    life3_3 = (moom.v6.c ^ 107290190073755L);
    life5_5 = ((moom.v5.c__Boolean()) ? 1 : 0);
    spill4264_0 = p1;
    if (!((life5_5 == 0))) {
        forwardValue4264_20_0 = spill4264_0;
        break forward_join_20;
    }
    if (!(net.minecraft.item.ItemPotion.a__Boolean(((int)(((net.minecraft.item.ItemStack)(spill4264_0)).c()))))) {
        break forward_join_21;
    }
    forwardValue4264_20_0 = ((moom.rj)(new moom.rj(this, p1))).a(((moom.ry)(p0)), ((net.minecraft.item.ItemStack)(p1)));
    }
    forwardValue4264_26_0 = forwardValue4264_20_0;
    break forward_join_26;
    }
    forwardValue4264_26_0 = ((moom.rd)(this.b)).a(((moom.ry)(p0)), ((net.minecraft.item.ItemStack)(p1)));
    }
    return forwardValue4264_26_0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
