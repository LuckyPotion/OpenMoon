package moom;


public class CV extends net.minecraft.util.DamageSource {

protected net.minecraft.entity.Entity A;

private boolean B;

private static final long E;

public CV(java.lang.String p0, net.minecraft.entity.Entity p1) {
super(p0);
    this.B = false;
    this.A = p1;
}


static {
E = (moom._c.a(-2863449553137749390L, -4039557317258048468L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(109610260901811L);
}


public net.minecraft.entity.Entity b__r3() {
return this.A;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public net.minecraft.util.IChatComponent a(net.minecraft.entity.EntityLivingBase p0) {
net.minecraft.entity.Entity forwardValue1609_14_0;
    net.minecraft.item.ItemStack forwardValue1609_18_0;
    net.minecraft.item.ItemStack forwardValue1609_31_0;
    int forwardValue1609_37_0;
    moom.CN forwardValue1609_78_0;
    net.minecraft.entity.Entity spill1609_0;
    net.minecraft.item.ItemStack spill1609_1;
    boolean spill1609_2;
    long life2_3;
    int life4_5;
    net.minecraft.item.ItemStack life5_24;
    java.lang.String life6_28;
    java.lang.String life7_31;
    forward_join_78: {
    forward_join_61: {
    forward_join_37: {
    forward_join_31: {
    forward_join_18: {
    forward_join_17: {
    forward_join_14: {
    life2_3 = (moom.CV.E ^ 139610703883004L);
    life4_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill1609_0 = this.A;
    if (!((life4_5 != 0))) {
        forwardValue1609_14_0 = spill1609_0;
        break forward_join_14;
    }
    if (!((((spill1609_0 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0) != 0))) {
        break forward_join_17;
    }
    forwardValue1609_14_0 = this.A;
    }
    forwardValue1609_18_0 = ((net.minecraft.entity.EntityLivingBase)(((net.minecraft.entity.EntityLivingBase)(forwardValue1609_14_0)))).a__xW();
    break forward_join_18;
    }
    forwardValue1609_18_0 = null;
    }
    life5_24 = forwardValue1609_18_0;
    life6_28 = __sourceIntrinsic_f6c8d7ccd1b5_invokedynamic1609_9(((moom.CV)(this)).y);
    life7_31 = __sourceIntrinsic_f6c8d7ccd1b5_invokedynamic1609_10(life6_28);
    spill1609_1 = life5_24;
    if (!((life4_5 != 0))) {
        forwardValue1609_31_0 = spill1609_1;
        break forward_join_31;
    }
    if (!((spill1609_1 != null))) {
        break forward_join_61;
    }
    forwardValue1609_31_0 = life5_24;
    }
    spill1609_2 = ((net.minecraft.item.ItemStack)(forwardValue1609_31_0)).f__Boolean();
    if (!((life4_5 != 0))) {
        forwardValue1609_37_0 = ((spill1609_2) ? 1 : 0);
        break forward_join_37;
    }
    if (!(spill1609_2)) {
        break forward_join_61;
    }
    forwardValue1609_37_0 = ((net.minecraft.util.StatCollector.a__Boolean(((java.lang.String)(life7_31)))) ? 1 : 0);
    }
    if (!((forwardValue1609_37_0 != 0))) {
        break forward_join_61;
    }
    forwardValue1609_78_0 = new moom.CN(life7_31, new java.lang.Object[] {((net.minecraft.entity.EntityLivingBase)(p0)).a__C5(), ((net.minecraft.entity.Entity)(this.A)).a__C5(), ((net.minecraft.item.ItemStack)(life5_24)).a__C5()});
    break forward_join_78;
    }
    forwardValue1609_78_0 = new moom.CN(life6_28, new java.lang.Object[] {((net.minecraft.entity.EntityLivingBase)(p0)).a__C5(), ((net.minecraft.entity.Entity)(this.A)).a__C5()});
    }
    return forwardValue1609_78_0;
}


public moom.CV a__sourceReturn_139ee4bd24() {
this.B = ((boolean)(true));
    return this;
}


public boolean g__Boolean() {
net.minecraft.entity.Entity forwardValue1610_13_0;
    int forwardValue1610_20_0;
    int forwardValue1610_24_0;
    int forwardValue1610_26_0;
    net.minecraft.entity.Entity spill1610_0;
    int spill1610_1;
    long life1_3;
    int life3_5;
    forward_join_26: {
    forward_join_25: {
    forward_join_24: {
    forward_join_20: {
    forward_join_13: {
    life1_3 = (moom.CV.E ^ 13009962498346L);
    life3_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill1610_0 = this.A;
    if (!((life3_5 != 0))) {
        forwardValue1610_13_0 = spill1610_0;
        break forward_join_13;
    }
    if (!((spill1610_0 != null))) {
        break forward_join_25;
    }
    forwardValue1610_13_0 = this.A;
    }
    spill1610_1 = ((forwardValue1610_13_0 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0);
    if (!((life3_5 != 0))) {
        forwardValue1610_20_0 = spill1610_1;
        break forward_join_20;
    }
    if (!((spill1610_1 != 0))) {
        break forward_join_25;
    }
    forwardValue1610_20_0 = ((this.A instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    }
    if (!((life3_5 != 0))) {
        forwardValue1610_24_0 = forwardValue1610_20_0;
        break forward_join_24;
    }
    if (!((forwardValue1610_20_0 == 0))) {
        break forward_join_25;
    }
    forwardValue1610_24_0 = 1;
    }
    forwardValue1610_26_0 = forwardValue1610_24_0;
    break forward_join_26;
    }
    forwardValue1610_26_0 = 0;
    }
    return ((forwardValue1610_26_0) != 0);
}


public boolean j() {
return ((((this.B) ? 1 : 0)) != 0);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_f6c8d7ccd1b5_invokedynamic1609_9(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_f6c8d7ccd1b5_invokedynamic1609_10(java.lang.String a0) throws E;
}
