package moom;


public class CW extends moom.CV {

private final net.minecraft.entity.Entity C;

private static final long F;

public CW(java.lang.String p0, net.minecraft.entity.Entity p1, net.minecraft.entity.Entity p2) {
super(p0, p1);
    this.C = p2;
}


static {
F = (moom._c.a(5894880420694809672L, 6068089617937870984L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(196407852610725L);
}


public net.minecraft.entity.Entity b__r3() {
return this.C;
}


private static moom.Oo c(moom.Oo p0) {
return p0;
}


public net.minecraft.entity.Entity a__r3() {
return ((moom.CW)(this)).A;
}


public net.minecraft.util.IChatComponent a(net.minecraft.entity.EntityLivingBase p0) {
net.minecraft.entity.Entity forwardValue1611_17_0;
    net.minecraft.util.IChatComponent forwardValue1611_18_0;
    net.minecraft.entity.Entity forwardValue1611_27_0;
    net.minecraft.item.ItemStack forwardValue1611_31_0;
    net.minecraft.item.ItemStack forwardValue1611_44_0;
    int forwardValue1611_50_0;
    moom.CN forwardValue1611_87_0;
    net.minecraft.entity.Entity spill1611_0;
    net.minecraft.entity.Entity spill1611_1;
    net.minecraft.item.ItemStack spill1611_2;
    boolean spill1611_3;
    long life2_3;
    int life4_5;
    net.minecraft.util.IChatComponent life5_23;
    net.minecraft.item.ItemStack life6_42;
    java.lang.String life7_46;
    java.lang.String life8_49;
    forward_join_87: {
    forward_join_72: {
    forward_join_50: {
    forward_join_44: {
    forward_join_31: {
    forward_join_30: {
    forward_join_27: {
    forward_join_18: {
    forward_join_17: {
    forward_join_15: {
    life2_3 = (moom.CW.F ^ 132055377778770L);
    life4_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill1611_0 = this.C;
    if (!((life4_5 == 0))) {
        forwardValue1611_17_0 = spill1611_0;
        break forward_join_17;
    }
    if (!((spill1611_0 == null))) {
        break forward_join_15;
    }
    forwardValue1611_18_0 = ((net.minecraft.entity.Entity)(((moom.CW)(this)).A)).a__C5();
    break forward_join_18;
    }
    forwardValue1611_17_0 = this.C;
    }
    forwardValue1611_18_0 = ((net.minecraft.entity.Entity)(forwardValue1611_17_0)).a__C5();
    }
    life5_23 = forwardValue1611_18_0;
    spill1611_1 = this.C;
    if (!((life4_5 == 0))) {
        forwardValue1611_27_0 = spill1611_1;
        break forward_join_27;
    }
    if (!((((spill1611_1 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0) != 0))) {
        break forward_join_30;
    }
    forwardValue1611_27_0 = this.C;
    }
    forwardValue1611_31_0 = ((net.minecraft.entity.EntityLivingBase)(((net.minecraft.entity.EntityLivingBase)(forwardValue1611_27_0)))).a__xW();
    break forward_join_31;
    }
    forwardValue1611_31_0 = null;
    }
    life6_42 = forwardValue1611_31_0;
    life7_46 = __sourceIntrinsic_f6c8d7ccd1b5_invokedynamic1611_14(((moom.CW)(this)).y);
    life8_49 = __sourceIntrinsic_f6c8d7ccd1b5_invokedynamic1611_15(life7_46);
    spill1611_2 = life6_42;
    if (!((life4_5 == 0))) {
        forwardValue1611_44_0 = spill1611_2;
        break forward_join_44;
    }
    if (!((spill1611_2 != null))) {
        break forward_join_72;
    }
    forwardValue1611_44_0 = life6_42;
    }
    spill1611_3 = ((net.minecraft.item.ItemStack)(forwardValue1611_44_0)).f__Boolean();
    if (!((life4_5 == 0))) {
        forwardValue1611_50_0 = ((spill1611_3) ? 1 : 0);
        break forward_join_50;
    }
    if (!(spill1611_3)) {
        break forward_join_72;
    }
    forwardValue1611_50_0 = ((net.minecraft.util.StatCollector.a__Boolean(((java.lang.String)(life8_49)))) ? 1 : 0);
    }
    if (!((forwardValue1611_50_0 != 0))) {
        break forward_join_72;
    }
    forwardValue1611_87_0 = new moom.CN(life8_49, new java.lang.Object[] {((net.minecraft.entity.EntityLivingBase)(p0)).a__C5(), life5_23, ((net.minecraft.item.ItemStack)(life6_42)).a__C5()});
    break forward_join_87;
    }
    forwardValue1611_87_0 = new moom.CN(life7_46, new java.lang.Object[] {((net.minecraft.entity.EntityLivingBase)(p0)).a__C5(), life5_23});
    }
    return forwardValue1611_87_0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_f6c8d7ccd1b5_invokedynamic1611_14(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_f6c8d7ccd1b5_invokedynamic1611_15(java.lang.String a0) throws E;
}
