package moom;


public class wP extends moom.wB {

private final moom.wA f;

private final net.minecraft.entity.player.EntityPlayer g;

private int h;

private final net.minecraft.entity.IMerchant i;

private static final long k;

public wP(net.minecraft.entity.player.EntityPlayer p0, net.minecraft.entity.IMerchant p1, moom.wA p2, int p3, int p4, int p5) {
super(p2, p3, p4, p5);
    this.g = p0;
    this.i = p1;
    this.f = p2;
}


static {
moom.wP.k = (moom._c.a(-4096336024565898360L, 7904853551141126481L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(171706586628055L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


protected void a__Void(net.minecraft.item.ItemStack p0) {
((net.minecraft.item.ItemStack)(p0)).a(((net.minecraft.world.World)(((net.minecraft.entity.player.EntityPlayer)(this.g)).i)), ((net.minecraft.entity.player.EntityPlayer)(this.g)), ((int)(this.h)));
    this.h = ((int)(0));
    return;
}


public boolean a__Boolean(net.minecraft.item.ItemStack p0) {
return ((0) != 0);
}


private boolean a(net.minecraft.village.MerchantRecipe p0, net.minecraft.item.ItemStack p1, net.minecraft.item.ItemStack p2) {
net.minecraft.item.ItemStack forwardValue4376_17_0;
    net.minecraft.item.ItemStack forwardValue4376_24_0;
    net.minecraft.item.ItemStack forwardValue4376_55_0;
    net.minecraft.item.ItemStack forwardValue4376_59_0;
    net.minecraft.item.ItemStack forwardValue4376_63_0;
    net.minecraft.entity.Entity[] spill4376_0;
    net.minecraft.item.ItemStack spill4376_1;
    net.minecraft.item.ItemStack spill4376_2;
    net.minecraft.item.ItemStack spill4376_3;
    long life4_3;
    net.minecraft.item.ItemStack life7_6;
    net.minecraft.item.ItemStack life8_10;
    net.minecraft.entity.Entity[] life6_11;
    forward_join_71: {
    forward_join_63: {
    forward_join_59: {
    forward_join_55: {
    forward_join_54: {
    forward_join_24: {
    forward_join_17: {
    life4_3 = (moom.wP.k ^ 131999572257443L);
    life7_6 = ((net.minecraft.village.MerchantRecipe)(p0)).a__xW();
    spill4376_0 = moom.v8.b__Arrayr3();
    life8_10 = ((net.minecraft.village.MerchantRecipe)(p0)).b__xW();
    life6_11 = spill4376_0;
    spill4376_1 = p1;
    if (!((life6_11 == null))) {
        forwardValue4376_17_0 = spill4376_1;
        break forward_join_17;
    }
    if (!((spill4376_1 != null))) {
        break forward_join_71;
    }
    forwardValue4376_17_0 = p1;
    }
    if (!((life6_11 == null))) {
        forwardValue4376_24_0 = forwardValue4376_17_0;
        break forward_join_24;
    }
    if (!((((net.minecraft.item.ItemStack)(forwardValue4376_17_0)).a__wQ() == ((net.minecraft.item.ItemStack)(life7_6)).a__wQ()))) {
        break forward_join_71;
    }
    forwardValue4376_24_0 = life8_10;
    }
    if (!((life6_11 == null))) {
        forwardValue4376_55_0 = forwardValue4376_24_0;
        break forward_join_55;
    }
    if (!((forwardValue4376_24_0 != null))) {
        break forward_join_54;
    }
    spill4376_2 = p2;
    if (!((life6_11 == null))) {
        forwardValue4376_55_0 = spill4376_2;
        break forward_join_55;
    }
    if (!((spill4376_2 != null))) {
        break forward_join_54;
    }
    spill4376_3 = life8_10;
    if (!((life6_11 == null))) {
        forwardValue4376_55_0 = spill4376_3;
        break forward_join_55;
    }
    if (!((((net.minecraft.item.ItemStack)(spill4376_3)).a__wQ() == ((net.minecraft.item.ItemStack)(p2)).a__wQ()))) {
        break forward_join_54;
    }
    net.minecraft.item.ItemStack __stackOp4376_8_0 = p1;
    ((net.minecraft.item.ItemStack)(__stackOp4376_8_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp4376_8_0)).b - ((net.minecraft.item.ItemStack)(life7_6)).b)));
    net.minecraft.item.ItemStack __stackOp4376_12_0 = p2;
    ((net.minecraft.item.ItemStack)(__stackOp4376_12_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp4376_12_0)).b - ((net.minecraft.item.ItemStack)(life8_10)).b)));
    return ((1) != 0);
    }
    forwardValue4376_55_0 = life8_10;
    }
    if (!((life6_11 == null))) {
        forwardValue4376_59_0 = forwardValue4376_55_0;
        break forward_join_59;
    }
    if (!((forwardValue4376_55_0 == null))) {
        break forward_join_71;
    }
    forwardValue4376_59_0 = p2;
    }
    if (!((life6_11 == null))) {
        forwardValue4376_63_0 = forwardValue4376_59_0;
        break forward_join_63;
    }
    if (!((forwardValue4376_59_0 == null))) {
        break forward_join_71;
    }
    forwardValue4376_63_0 = p1;
    }
    net.minecraft.item.ItemStack __stackOp4376_17_0 = forwardValue4376_63_0;
    ((net.minecraft.item.ItemStack)(__stackOp4376_17_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp4376_17_0)).b - ((net.minecraft.item.ItemStack)(life7_6)).b)));
    return ((1) != 0);
    }
    return ((0) != 0);
}


public void a(net.minecraft.entity.player.EntityPlayer p0, net.minecraft.item.ItemStack p1) {
moom.wP forwardValue4375_42_0;
    net.minecraft.item.ItemStack forwardValue4375_60_0;
    net.minecraft.item.ItemStack forwardValue4375_64_0;
    net.minecraft.entity.Entity[] spill4375_0;
    moom.wP spill4375_1;
    moom.wP spill4375_2;
    net.minecraft.item.ItemStack spill4375_3;
    net.minecraft.item.ItemStack spill4375_4;
    long life3_3;
    net.minecraft.entity.Entity[] life5_8;
    net.minecraft.village.MerchantRecipe life6_12;
    net.minecraft.item.ItemStack life7_19;
    net.minecraft.item.ItemStack life8_24;
    forward_join_78: {
    forward_join_68: {
    forward_join_64: {
    forward_join_60: {
    forward_join_59: {
    forward_join_42: {
    forward_join_41: {
    life3_3 = (moom.wP.k ^ 55179608632658L);
    spill4375_0 = moom.v8.b__Arrayr3();
    ((moom.wP)(this)).a__Void(((net.minecraft.item.ItemStack)(p1)));
    life5_8 = spill4375_0;
    life6_12 = ((moom.wA)(this.f)).a__D8();
    if (!((life6_12 != null))) {
        break forward_join_78;
    }
    life7_19 = ((moom.wA)(this.f)).a__xW(((int)(0)));
    life8_24 = ((moom.wA)(this.f)).a__xW(((int)(1)));
    spill4375_1 = this;
    if (!((life5_8 == null))) {
        forwardValue4375_42_0 = spill4375_1;
        break forward_join_42;
    }
    if (!((!((moom.wP)(spill4375_1)).a(((net.minecraft.village.MerchantRecipe)(life6_12)), ((net.minecraft.item.ItemStack)(life7_19)), ((net.minecraft.item.ItemStack)(life8_24)))))) {
        break forward_join_41;
    }
    spill4375_2 = this;
    if (!((life5_8 == null))) {
        forwardValue4375_42_0 = spill4375_2;
        break forward_join_42;
    }
    if (!(((moom.wP)(spill4375_2)).a(((net.minecraft.village.MerchantRecipe)(life6_12)), ((net.minecraft.item.ItemStack)(life8_24)), ((net.minecraft.item.ItemStack)(life7_19))))) {
        break forward_join_78;
    }
    }
    forwardValue4375_42_0 = this;
    }
    ((net.minecraft.entity.IMerchant)(((moom.wP)(forwardValue4375_42_0)).i)).a(((net.minecraft.village.MerchantRecipe)(life6_12)));
    ((net.minecraft.entity.player.EntityPlayer)(p0)).a(((moom.BY)(net.minecraft.stats.StatList.G)));
    spill4375_3 = life7_19;
    if (!((life5_8 == null))) {
        forwardValue4375_60_0 = spill4375_3;
        break forward_join_60;
    }
    if (!((spill4375_3 != null))) {
        break forward_join_59;
    }
    spill4375_4 = life7_19;
    if (!((life5_8 == null))) {
        forwardValue4375_60_0 = spill4375_4;
        break forward_join_60;
    }
    if (!((((net.minecraft.item.ItemStack)(spill4375_4)).b <= 0))) {
        break forward_join_59;
    }
    life7_19 = null;
    }
    forwardValue4375_60_0 = life8_24;
    }
    if (!((life5_8 == null))) {
        forwardValue4375_64_0 = forwardValue4375_60_0;
        break forward_join_64;
    }
    if (!((forwardValue4375_60_0 != null))) {
        break forward_join_68;
    }
    forwardValue4375_64_0 = life8_24;
    }
    if (!((((net.minecraft.item.ItemStack)(forwardValue4375_64_0)).b <= 0))) {
        break forward_join_68;
    }
    life8_24 = null;
    }
    ((moom.wA)(this.f)).a__Void(((int)(0)), ((net.minecraft.item.ItemStack)(life7_19)));
    ((moom.wA)(this.f)).a__Void(((int)(1)), ((net.minecraft.item.ItemStack)(life8_24)));
    }
    return;
}


public net.minecraft.item.ItemStack a(int p0) {
moom.wP forwardValue4374_22_0;
    moom.wP spill4374_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_22: {
    forward_join_21: {
    life2_3 = (moom.wP.k ^ 61103781405549L);
    life4_5 = moom.v8.b__Arrayr3();
    spill4374_0 = this;
    if (!((life4_5 == null))) {
        forwardValue4374_22_0 = spill4374_0;
        break forward_join_22;
    }
    if (!(((moom.wP)(spill4374_0)).a__Boolean())) {
        break forward_join_21;
    }
    moom.wP __stackOp4374_3_0 = this;
    ((moom.wP)(__stackOp4374_3_0)).h = ((int)((((moom.wP)(__stackOp4374_3_0)).h + java.lang.Math.min(((int)(p0)), ((int)(((net.minecraft.item.ItemStack)(((moom.wP)(this)).a__xW())).b))))));
    }
    forwardValue4374_22_0 = this;
    }
    return __sourceIntrinsic_089d864267ae_call4374_9(forwardValue4374_22_0, p0);
}


protected void a(net.minecraft.item.ItemStack p0, int p1) {
this.h += p1;
    ((moom.wP)(this)).a__Void(((net.minecraft.item.ItemStack)(p0)));
    return;
}


private static native <E extends Throwable> net.minecraft.item.ItemStack __sourceIntrinsic_089d864267ae_call4374_9(moom.wP a0, int a1) throws E;
}
