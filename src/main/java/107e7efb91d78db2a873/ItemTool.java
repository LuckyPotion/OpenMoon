package net.minecraft.item;


public class ItemTool extends net.minecraft.item.Item {

private final java.util.Set<net.minecraft.block.Block> n;

protected float o;

private final float p;

protected moom.a4 q;

private static final long t;

protected ItemTool(float p0, moom.a4 p1, java.util.Set<net.minecraft.block.Block> p2) {
super();
    this.o = 0x1.0000000000000p+2f;
    this.q = p1;
    this.n = p2;
    this.f = 1;
    (this).c((p1).a__Int());
    this.o = (p1).a();
    this.p = (p0 + (p1).b());
    (this).a(net.minecraft.creativetab.CreativeTabs.i);
}


static {
net.minecraft.item.ItemTool.t = (moom._c.a(6434051463631833345L, 7130610860988182524L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(53973814598000L);
}


public java.lang.String b__sourceReturn_0e30dfc966() {
return ((moom.a4)(this.q)).toString();
}


public int c() {
return ((moom.a4)(this.q)).c();
}


public boolean c__Boolean() {
return ((1) != 0);
}


public boolean a(net.minecraft.item.ItemStack p0, net.minecraft.item.ItemStack p1) {
net.minecraft.item.ItemTool forwardValue5528_15_0;
    int forwardValue5528_22_0;
    int forwardValue5528_24_0;
    net.minecraft.item.ItemTool spill5528_0;
    boolean spill5528_1;
    long life3_3;
    int life5_5;
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    forward_join_15: {
    life3_3 = (net.minecraft.item.ItemTool.t ^ 64870308024316L);
    life5_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);
    spill5528_0 = this;
    if (!((life5_5 != 0))) {
        forwardValue5528_15_0 = spill5528_0;
        break forward_join_15;
    }
    if (!((((moom.a4)(((net.minecraft.item.ItemTool)(spill5528_0)).q)).a__wQ() != ((net.minecraft.item.ItemStack)(p1)).a__wQ()))) {
        break forward_join_21;
    }
    forwardValue5528_15_0 = this;
    }
    spill5528_1 = __sourceIntrinsic_0603dfbbc4ad_call5528_6(forwardValue5528_15_0, p0, p1);
    if (!((life5_5 != 0))) {
        forwardValue5528_22_0 = ((spill5528_1) ? 1 : 0);
        break forward_join_22;
    }
    if (!(spill5528_1)) {
        break forward_join_23;
    }
    }
    forwardValue5528_22_0 = 1;
    }
    forwardValue5528_24_0 = forwardValue5528_22_0;
    break forward_join_24;
    }
    forwardValue5528_24_0 = 0;
    }
    return ((forwardValue5528_24_0) != 0);
}


public com.google.common.collect.Multimap<java.lang.String, moom.vB> a__Multimap() {
com.google.common.collect.Multimap local1 = super.a__Multimap();
    ((com.google.common.collect.Multimap)(local1)).put(((java.lang.Object)(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.f)).a__String())), ((java.lang.Object)(new moom.vB(net.minecraft.item.ItemTool.c, "Tool modifier", ((double) this.p), 0))));
    return local1;
}


public float a(net.minecraft.item.ItemStack p0, net.minecraft.block.Block p1) {
net.minecraft.item.ItemTool forwardValue5527_14_0;
    float forwardValue5527_17_0;
    net.minecraft.item.ItemTool spill5527_0;
    long life3_3;
    int life5_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_14: {
    life3_3 = (net.minecraft.item.ItemTool.t ^ 29262997634037L);
    life5_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    spill5527_0 = this;
    if (!((life5_5 == 0))) {
        forwardValue5527_14_0 = spill5527_0;
        break forward_join_14;
    }
    if (!(((java.util.Set)(((net.minecraft.item.ItemTool)(spill5527_0)).n)).contains(((java.lang.Object)(p1))))) {
        break forward_join_16;
    }
    forwardValue5527_14_0 = this;
    }
    forwardValue5527_17_0 = ((net.minecraft.item.ItemTool)(forwardValue5527_14_0)).o;
    break forward_join_17;
    }
    forwardValue5527_17_0 = 0x1.0p0f;
    }
    return forwardValue5527_17_0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a(net.minecraft.item.ItemStack p0, net.minecraft.entity.EntityLivingBase p1, net.minecraft.entity.EntityLivingBase p2) {
((net.minecraft.item.ItemStack)(p0)).a(((int)(2)), ((net.minecraft.entity.EntityLivingBase)(p2)));
    return ((1) != 0);
}


public boolean a(net.minecraft.item.ItemStack p0, net.minecraft.world.World p1, net.minecraft.block.Block p2, moom.DT p3, net.minecraft.entity.EntityLivingBase p4) {
int forwardValue5529_21_0;
    int spill5529_0;
    long life6_3;
    int life8_5;
    forward_join_21: {
    forward_join_20: {
    life6_3 = (net.minecraft.item.ItemTool.t ^ 57024416662556L);
    life8_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    spill5529_0 = recovery.source.CarrierOps.dcmpl(((double)(((double) ((net.minecraft.block.Block)(p2)).a(((net.minecraft.world.World)(p1)), ((moom.DT)(p3)))))), ((double)(0x0.0p0d)));
    if (!((life8_5 == 0))) {
        forwardValue5529_21_0 = spill5529_0;
        break forward_join_21;
    }
    if (!((spill5529_0 != 0))) {
        break forward_join_20;
    }
    ((net.minecraft.item.ItemStack)(p0)).a(((int)(1)), ((net.minecraft.entity.EntityLivingBase)(p4)));
    }
    forwardValue5529_21_0 = 1;
    }
    return ((forwardValue5529_21_0) != 0);
}


public moom.a4 a__a4() {
return this.q;
}


private static native <E extends Throwable> boolean __sourceIntrinsic_0603dfbbc4ad_call5528_6(net.minecraft.item.ItemTool a0, net.minecraft.item.ItemStack a1, net.minecraft.item.ItemStack a2) throws E;
}
