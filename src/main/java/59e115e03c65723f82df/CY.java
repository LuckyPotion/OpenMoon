package moom;


public final class CY {

public static final com.google.common.base.Predicate<net.minecraft.entity.Entity> a;

public static final com.google.common.base.Predicate<net.minecraft.entity.Entity> b;

public static final com.google.common.base.Predicate<net.minecraft.entity.Entity> c;

public static final com.google.common.base.Predicate<net.minecraft.entity.Entity> d;

private static final long e;

public CY() {
super();
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(7666550306396471053L)), ((long)(5342663938576724765L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(80871710936267L)))));
    a = ((com.google.common.base.Predicate)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite3430_5()));
    b = ((com.google.common.base.Predicate)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite3430_7()));
    c = ((com.google.common.base.Predicate)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite3430_9()));
    d = ((com.google.common.base.Predicate)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite3430_11()));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static boolean lambda$static$1(net.minecraft.entity.Entity p0) {
int forwardValue1614_13_0;
    int forwardValue1614_17_0;
    int forwardValue1614_19_0;
    int spill1614_0;
    long life1_3;
    int life3_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    forward_join_13: {
    life1_3 = (moom.CY.e ^ 40713375935447L);
    life3_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill1614_0 = ((p0 instanceof net.minecraft.inventory.IInventory) ? 1 : 0);
    if (!((life3_5 != 0))) {
        forwardValue1614_13_0 = spill1614_0;
        break forward_join_13;
    }
    if (!((spill1614_0 != 0))) {
        break forward_join_18;
    }
    forwardValue1614_13_0 = ((((net.minecraft.entity.Entity)(p0)).p__Boolean()) ? 1 : 0);
    }
    if (!((life3_5 != 0))) {
        forwardValue1614_17_0 = forwardValue1614_13_0;
        break forward_join_17;
    }
    if (!((forwardValue1614_13_0 != 0))) {
        break forward_join_18;
    }
    forwardValue1614_17_0 = 1;
    }
    forwardValue1614_19_0 = forwardValue1614_17_0;
    break forward_join_19;
    }
    forwardValue1614_19_0 = 0;
    }
    return ((forwardValue1614_19_0) != 0);
}


private static boolean lambda$static$0(net.minecraft.entity.Entity p0) {
net.minecraft.entity.Entity forwardValue1613_13_0;
    net.minecraft.entity.Entity forwardValue1613_18_0;
    int forwardValue1613_22_0;
    net.minecraft.entity.Entity spill1613_0;
    long life1_3;
    int life3_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_18: {
    forward_join_13: {
    life1_3 = (moom.CY.e ^ 32255389563426L);
    life3_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill1613_0 = p0;
    if (!((life3_5 != 0))) {
        forwardValue1613_13_0 = spill1613_0;
        break forward_join_13;
    }
    if (!(((net.minecraft.entity.Entity)(spill1613_0)).p__Boolean())) {
        break forward_join_21;
    }
    forwardValue1613_13_0 = ((net.minecraft.entity.Entity)(p0)).f;
    }
    if (!((life3_5 != 0))) {
        forwardValue1613_18_0 = forwardValue1613_13_0;
        break forward_join_18;
    }
    if (!((forwardValue1613_13_0 == null))) {
        break forward_join_21;
    }
    forwardValue1613_18_0 = ((net.minecraft.entity.Entity)(p0)).g;
    }
    if (!((forwardValue1613_18_0 == null))) {
        break forward_join_21;
    }
    forwardValue1613_22_0 = 1;
    break forward_join_22;
    }
    forwardValue1613_22_0 = 0;
    }
    return ((forwardValue1613_22_0) != 0);
}


private static boolean lambda$static$2(net.minecraft.entity.Entity p0) {
int forwardValue1615_18_0;
    int forwardValue1615_20_0;
    int spill1615_0;
    boolean spill1615_1;
    long life1_3;
    int life3_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    life1_3 = (moom.CY.e ^ 69542435826742L);
    life3_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill1615_0 = ((p0 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    if (!((life3_5 != 0))) {
        forwardValue1615_18_0 = spill1615_0;
        break forward_join_18;
    }
    if (!((spill1615_0 != 0))) {
        break forward_join_17;
    }
    spill1615_1 = ((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)))).U__Boolean();
    if (!((life3_5 != 0))) {
        forwardValue1615_18_0 = ((spill1615_1) ? 1 : 0);
        break forward_join_18;
    }
    if (!((!spill1615_1))) {
        break forward_join_19;
    }
    }
    forwardValue1615_18_0 = 1;
    }
    forwardValue1615_20_0 = forwardValue1615_18_0;
    break forward_join_20;
    }
    forwardValue1615_20_0 = 0;
    }
    return ((forwardValue1615_20_0) != 0);
}


private static native <E extends Throwable> com.google.common.base.Predicate __sourceIntrinsic_eb8803ad1f63_originalDynamicSite3430_5() throws E;

private static native <E extends Throwable> com.google.common.base.Predicate __sourceIntrinsic_eb8803ad1f63_originalDynamicSite3430_7() throws E;

private static native <E extends Throwable> com.google.common.base.Predicate __sourceIntrinsic_eb8803ad1f63_originalDynamicSite3430_9() throws E;

private static native <E extends Throwable> com.google.common.base.Predicate __sourceIntrinsic_eb8803ad1f63_originalDynamicSite3430_11() throws E;
}
