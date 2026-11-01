package moom;


public class xI extends net.minecraft.item.Item {

private static final long n;

public xI() {
super();
    this.f = 1;
    (this).a(net.minecraft.creativetab.CreativeTabs.e);
}


static {
n = (moom._c.a(8504553842021433757L, 2744136776851611676L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(133787356852606L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a(net.minecraft.item.ItemStack p0, net.minecraft.entity.EntityLivingBase p1, net.minecraft.entity.EntityLivingBase p2) {
((moom.xI)(this)).a(((net.minecraft.item.ItemStack)(p0)), ((net.minecraft.entity.player.EntityPlayer)(null)), ((net.minecraft.entity.EntityLivingBase)(p1)));
    return ((1) != 0);
}


public boolean a(net.minecraft.item.ItemStack p0, net.minecraft.entity.player.EntityPlayer p1, net.minecraft.entity.EntityLivingBase p2) {
int forwardValue4489_41_0;
    int forwardValue4489_43_0;
    int spill4489_0;
    boolean spill4489_1;
    boolean spill4489_2;
    long life4_3;
    int life6_5;
    net.minecraft.entity.passive.EntityPig life7_16;
    forward_join_43: {
    forward_join_42: {
    forward_join_41: {
    forward_join_40: {
    life4_3 = (moom.xI.n ^ 129510023139512L);
    life6_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);
    spill4489_0 = ((p2 instanceof net.minecraft.entity.passive.EntityPig) ? 1 : 0);
    if (!((life6_5 != 0))) {
        forwardValue4489_43_0 = spill4489_0;
        break forward_join_43;
    }
    if (!((spill4489_0 != 0))) {
        break forward_join_42;
    }
    life7_16 = ((net.minecraft.entity.passive.EntityPig)(p2));
    spill4489_1 = ((net.minecraft.entity.passive.EntityPig)(life7_16)).ae();
    if (!((life6_5 != 0))) {
        forwardValue4489_41_0 = ((spill4489_1) ? 1 : 0);
        break forward_join_41;
    }
    if (!((!spill4489_1))) {
        break forward_join_40;
    }
    spill4489_2 = ((net.minecraft.entity.passive.EntityPig)(life7_16)).c__Boolean();
    if (!((life6_5 != 0))) {
        forwardValue4489_41_0 = ((spill4489_2) ? 1 : 0);
        break forward_join_41;
    }
    if (!((!spill4489_2))) {
        break forward_join_40;
    }
    ((net.minecraft.entity.passive.EntityPig)(life7_16)).n(((boolean)(true)));
    ((net.minecraft.world.World)(((net.minecraft.entity.passive.EntityPig)(life7_16)).i)).a(((net.minecraft.entity.Entity)(life7_16)), ((java.lang.String)("mob.horse.leather")), ((float)(0x1.0p-1f)), ((float)(0x1.0p0f)));
    net.minecraft.item.ItemStack __stackOp4489_12_0 = p0;
    ((net.minecraft.item.ItemStack)(__stackOp4489_12_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp4489_12_0)).b - 1)));
    }
    forwardValue4489_41_0 = 1;
    }
    return ((forwardValue4489_41_0) != 0);
    }
    forwardValue4489_43_0 = 0;
    }
    return ((forwardValue4489_43_0) != 0);
}

}
