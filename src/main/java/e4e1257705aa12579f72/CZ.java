package moom;


public class CZ implements com.google.common.base.Predicate<net.minecraft.entity.Entity> {

private final net.minecraft.item.ItemStack a;

private static final long b;

public CZ(net.minecraft.item.ItemStack p0) {
super();
    this.a = p0;
}


static {
moom.CZ.b = (moom._c.a(-2578993429584611048L, 3585344244598289288L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(52188405006372L);
}


public boolean apply__sourceBridge_9ea2dcf14c(java.lang.Object p0) {
return ((moom.CZ)(this)).a(((net.minecraft.entity.Entity)(((net.minecraft.entity.Entity)(p0)))));
}


public boolean a(net.minecraft.entity.Entity p0) {
int forestValue596_15_0;
    int forestValue596_24_0;
    net.minecraft.entity.EntityLivingBase forestValue596_34_0;
    int forestValue596_45_0;
    int forestValue596_54_0;
    int forestValue596_56_0;
    boolean spill596_0;
    net.minecraft.entity.EntityLivingBase spill596_1;
    int spill596_2;
    int spill596_3;
    long life2_3;
    int life4_5;
    net.minecraft.entity.EntityLivingBase life5_22;
    forest_join_56: {
    forest_join_55: {
    forest_join_54: {
    forest_join_53: {
    forest_join_45: {
    forest_join_43: {
    forest_join_34: {
    forest_join_25: {
    forest_join_24: {
    forest_join_23: {
    forest_join_15: {
    forest_join_13: {
    life2_3 = (moom.CZ.b ^ 72334323007280L);
    life4_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill596_0 = ((net.minecraft.entity.Entity)(p0)).p__Boolean();
    if (!((life4_5 == 0))) {
        forestValue596_15_0 = ((spill596_0) ? 1 : 0);
        break forest_join_15;
    }
    if (!((!spill596_0))) {
        break forest_join_13;
    }
    return ((0) != 0);
    }
    forestValue596_15_0 = ((p0 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forestValue596_24_0 = forestValue596_15_0;
        break forest_join_24;
    }
    if (!((forestValue596_15_0 != 0))) {
        break forest_join_23;
    }
    life5_22 = ((net.minecraft.entity.EntityLivingBase)(p0));
    if (!((life4_5 != 0))) {
        break forest_join_25;
    }
    }
    forestValue596_24_0 = 0;
    }
    return ((forestValue596_24_0) != 0);
    }
    spill596_1 = life5_22;
    if (!((life4_5 == 0))) {
        forestValue596_34_0 = spill596_1;
        break forest_join_34;
    }
    if (!((((net.minecraft.entity.EntityLivingBase)(spill596_1)).a__xW(((int)(net.minecraft.entity.EntityLiving.a(((net.minecraft.item.ItemStack)(this.a)))))) == null))) {
        break forest_join_55;
    }
    forestValue596_34_0 = life5_22;
    }
    spill596_2 = ((forestValue596_34_0 instanceof net.minecraft.entity.EntityLiving) ? 1 : 0);
    if (!((life4_5 == 0))) {
        forestValue596_45_0 = spill596_2;
        break forest_join_45;
    }
    if (!((spill596_2 != 0))) {
        break forest_join_43;
    }
    if (!(((net.minecraft.entity.EntityLiving)(((net.minecraft.entity.EntityLiving)(life5_22)))).Q__Boolean())) {
        break forest_join_55;
    }
    break forest_join_53;
    }
    forestValue596_45_0 = ((life5_22 instanceof net.minecraft.entity.item.EntityArmorStand) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forestValue596_54_0 = forestValue596_45_0;
        break forest_join_54;
    }
    if (!((forestValue596_45_0 == 0))) {
        break forest_join_53;
    }
    spill596_3 = ((life5_22 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    if (!((life4_5 == 0))) {
        forestValue596_54_0 = spill596_3;
        break forest_join_54;
    }
    if (!((spill596_3 != 0))) {
        break forest_join_55;
    }
    }
    forestValue596_54_0 = 1;
    }
    forestValue596_56_0 = forestValue596_54_0;
    break forest_join_56;
    }
    forestValue596_56_0 = 0;
    }
    return ((forestValue596_56_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean apply(net.minecraft.entity.Entity __bridgeParam0) { return this.apply__sourceBridge_9ea2dcf14c(((java.lang.Object)(__bridgeParam0))); }
}
