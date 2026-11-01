package moom;


public class uq extends moom.uc {

private static org.apache.logging.log4j.Logger c;

private net.minecraft.entity.EntityLiving d;

private com.google.common.base.Predicate<net.minecraft.entity.EntityLivingBase> e;

private moom.vo f;

private net.minecraft.entity.EntityLivingBase g;

private java.lang.Class<? extends net.minecraft.entity.EntityLivingBase> h;

private static long i;

public uq(net.minecraft.entity.EntityLiving p0, java.lang.Class<? extends net.minecraft.entity.EntityLivingBase> p1) { super(); }


private static void __sourceConstructorBody_edcaa0212d28c5ed(moom.uq receiver, net.minecraft.entity.EntityLiving p0, java.lang.Class p1) throws Throwable {

long local3_life1 = (moom.uq.i ^ 85659020316335L);

    moom.uq.__sourceConstructorInit_edcaa0212d28c5ed_0(((moom.uq)(receiver)));

    boolean __sourceSpill825_5 = moom.uc.e();

    ((moom.uq)(receiver)).d = ((net.minecraft.entity.EntityLiving)(p0));

    boolean local5_life6 = __sourceSpill825_5;

    ((moom.uq)(receiver)).h = ((java.lang.Class)(p1));

    if ((!local5_life6)) {

        if ((((p0 instanceof moom.sI) ? 1 : 0) != 0)) {

        ((org.apache.logging.log4j.Logger)(moom.uq.c)).warn(((java.lang.String)("Use NearestAttackableTargetGoal.class for PathfinerMob mobs!")));

    }

        ((moom.uq)(receiver)).e = ((com.google.common.base.Predicate)(__sourceIntrinsic_edcaa0212d28c5ed_originalDynamicSite825_11(receiver)));

        ((moom.uq)(receiver)).f = ((moom.vo)(new moom.vo(p0)));

    }

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_edcaa0212d28c5ed_0(moom.uq a0) throws E;

static {
moom.uq.i = (moom._c.a(6572566537597313873L, 8760860573274727436L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(25031993675L);
    moom.uq.c = org.apache.logging.log4j.LogManager.getLogger();
}


public void b__Void() {
((net.minecraft.entity.EntityLiving)(this.d)).c(((net.minecraft.entity.EntityLivingBase)(null)));
    super.a__Void();
    return;
}


public boolean b__Boolean() {
net.minecraft.entity.EntityLivingBase forwardValue4227_17_0;
    int forwardValue4227_22_0;
    int forwardValue4227_39_0;
    int forwardValue4227_50_0;
    int forwardValue4227_52_0;
    boolean spill4227_0;
    net.minecraft.entity.EntityLivingBase spill4227_1;
    boolean spill4227_2;
    int spill4227_3;
    boolean spill4227_4;
    long life1_3;
    net.minecraft.entity.EntityLivingBase life4_8;
    int life3_9;
    double life5_33;
    forward_join_52: {
    forward_join_51: {
    forward_join_50: {
    forward_join_49: {
    forward_join_39: {
    forward_join_23: {
    forward_join_22: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (moom.uq.i ^ 139294207659649L);
    spill4227_0 = moom.uc.e();
    life4_8 = ((net.minecraft.entity.EntityLiving)(this.d)).d__sourceReturn_d30556f370();
    life3_9 = ((spill4227_0) ? 1 : 0);
    spill4227_1 = life4_8;
    if (!((life3_9 == 0))) {
        forwardValue4227_17_0 = spill4227_1;
        break forward_join_17;
    }
    if (!((spill4227_1 == null))) {
        break forward_join_16;
    }
    return ((0) != 0);
    }
    forwardValue4227_17_0 = life4_8;
    }
    spill4227_2 = ((net.minecraft.entity.EntityLivingBase)(forwardValue4227_17_0)).p__Boolean();
    if (!((life3_9 == 0))) {
        forwardValue4227_22_0 = ((spill4227_2) ? 1 : 0);
        break forward_join_22;
    }
    if (!((!spill4227_2))) {
        break forward_join_23;
    }
    forwardValue4227_22_0 = 0;
    }
    return ((forwardValue4227_22_0) != 0);
    }
    life5_33 = ((moom.uq)(this)).a__sourceReturn_fedcb3e4d3();
    spill4227_3 = recovery.source.CarrierOps.dcmpl(((double)(((net.minecraft.entity.EntityLiving)(this.d)).a(((net.minecraft.entity.Entity)(life4_8))))), ((double)((life5_33 * life5_33))));
    if (!((life3_9 == 0))) {
        forwardValue4227_39_0 = spill4227_3;
        break forward_join_39;
    }
    if (!((spill4227_3 <= 0))) {
        break forward_join_51;
    }
    forwardValue4227_39_0 = ((life4_8 instanceof net.minecraft.entity.player.EntityPlayerMP) ? 1 : 0);
    }
    if (!((life3_9 == 0))) {
        forwardValue4227_50_0 = forwardValue4227_39_0;
        break forward_join_50;
    }
    if (!((forwardValue4227_39_0 != 0))) {
        break forward_join_49;
    }
    spill4227_4 = ((moom.Bo)(((net.minecraft.entity.player.EntityPlayerMP)(((net.minecraft.entity.player.EntityPlayerMP)(life4_8)))).ci)).b__Boolean();
    if (!((life3_9 == 0))) {
        forwardValue4227_50_0 = ((spill4227_4) ? 1 : 0);
        break forward_join_50;
    }
    if (!((!spill4227_4))) {
        break forward_join_51;
    }
    }
    forwardValue4227_50_0 = 1;
    }
    forwardValue4227_52_0 = forwardValue4227_50_0;
    break forward_join_52;
    }
    forwardValue4227_52_0 = 0;
    }
    return ((forwardValue4227_52_0) != 0);
}


public boolean a__Boolean() {
int forwardValue4226_43_0;
    boolean spill4226_0;
    boolean spill4226_1;
    long life1_3;
    double life4_7;
    int life3_8;
    java.util.List life6_24;
    forward_join_43: {
    forward_join_36: {
    life1_3 = (moom.uq.i ^ 24311758497296L);
    spill4226_0 = moom.uc.e();
    life4_7 = ((moom.uq)(this)).a__sourceReturn_fedcb3e4d3();
    life3_8 = ((spill4226_0) ? 1 : 0);
    life6_24 = ((net.minecraft.world.World)(((net.minecraft.entity.EntityLiving)(this.d)).i)).a(((java.lang.Class)(this.h)), ((moom.CA)(((moom.CA)(((net.minecraft.entity.EntityLiving)(this.d)).b())).b(((double)(life4_7)), ((double)(0x1.0p2d)), ((double)(life4_7))))), ((com.google.common.base.Predicate)(this.e)));
    ((java.util.List)(life6_24)).sort(((java.util.Comparator)(this.f)));
    spill4226_1 = ((java.util.List)(life6_24)).isEmpty();
    if (!((life3_8 == 0))) {
        forwardValue4226_43_0 = ((spill4226_1) ? 1 : 0);
        break forward_join_43;
    }
    if (!(spill4226_1)) {
        break forward_join_36;
    }
    return ((0) != 0);
    }
    this.g = ((net.minecraft.entity.EntityLivingBase)(((net.minecraft.entity.EntityLivingBase)(((java.util.List)(life6_24)).get(((int)(0)))))));
    forwardValue4226_43_0 = 1;
    }
    return ((forwardValue4226_43_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected double a__sourceReturn_fedcb3e4d3() {
net.minecraft.entity.ai.attributes.IAttributeInstance forwardValue4225_18_0;
    double forwardValue4225_19_0;
    boolean spill4225_0;
    net.minecraft.entity.ai.attributes.IAttributeInstance spill4225_1;
    long life1_3;
    net.minecraft.entity.ai.attributes.IAttributeInstance life4_9;
    int life3_10;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    life1_3 = (moom.uq.i ^ 100128000468551L);
    spill4225_0 = moom.uc.e();
    life4_9 = ((net.minecraft.entity.EntityLiving)(this.d)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.c)));
    life3_10 = ((spill4225_0) ? 1 : 0);
    spill4225_1 = life4_9;
    if (!((life3_10 == 0))) {
        forwardValue4225_18_0 = spill4225_1;
        break forward_join_18;
    }
    if (!((spill4225_1 == null))) {
        break forward_join_17;
    }
    forwardValue4225_19_0 = 0x1.0p4d;
    break forward_join_19;
    }
    forwardValue4225_18_0 = life4_9;
    }
    forwardValue4225_19_0 = ((net.minecraft.entity.ai.attributes.IAttributeInstance)(forwardValue4225_18_0)).b();
    }
    return forwardValue4225_19_0;
}


public void a__Void() {
((net.minecraft.entity.EntityLiving)(this.d)).c(((net.minecraft.entity.EntityLivingBase)(this.g)));
    super.a__Void();
    return;
}


private boolean lambda$new$0(net.minecraft.entity.EntityLivingBase p0) {
int forwardValue4228_20_0;
    int forwardValue4228_30_0;
    int forwardValue4228_39_0;
    int forwardValue4228_43_0;
    int forwardValue4228_45_0;
    boolean spill4228_0;
    boolean spill4228_1;
    long life2_3;
    double life5_7;
    int life4_8;
    forward_join_45: {
    forward_join_44: {
    forward_join_43: {
    forward_join_39: {
    forward_join_30: {
    forward_join_20: {
    forward_join_18: {
    life2_3 = (moom.uq.i ^ 128671263931682L);
    spill4228_0 = moom.uc.d();
    life5_7 = ((moom.uq)(this)).a__sourceReturn_fedcb3e4d3();
    life4_8 = ((spill4228_0) ? 1 : 0);
    spill4228_1 = ((net.minecraft.entity.EntityLivingBase)(p0)).t__Boolean();
    if (!((life4_8 != 0))) {
        forwardValue4228_20_0 = ((spill4228_1) ? 1 : 0);
        break forward_join_20;
    }
    if (!(spill4228_1)) {
        break forward_join_18;
    }
    life5_7 = (life5_7 * 0x1.99999ap-1d);
    }
    forwardValue4228_20_0 = ((((net.minecraft.entity.EntityLivingBase)(p0)).v__Boolean()) ? 1 : 0);
    }
    if (!((life4_8 != 0))) {
        forwardValue4228_30_0 = forwardValue4228_20_0;
        break forward_join_30;
    }
    if (!((forwardValue4228_20_0 == 0))) {
        break forward_join_44;
    }
    forwardValue4228_30_0 = recovery.source.CarrierOps.dcmpl(((double)(((double) ((net.minecraft.entity.EntityLivingBase)(p0)).a__Float(((net.minecraft.entity.Entity)(this.d)))))), ((double)(life5_7)));
    }
    if (!((life4_8 != 0))) {
        forwardValue4228_39_0 = forwardValue4228_30_0;
        break forward_join_39;
    }
    if (!((forwardValue4228_30_0 <= 0))) {
        break forward_join_44;
    }
    forwardValue4228_39_0 = ((moom.uR.a(((net.minecraft.entity.EntityLiving)(this.d)), ((net.minecraft.entity.EntityLivingBase)(p0)), ((boolean)(false)), ((boolean)(true)))) ? 1 : 0);
    }
    if (!((life4_8 != 0))) {
        forwardValue4228_43_0 = forwardValue4228_39_0;
        break forward_join_43;
    }
    if (!((forwardValue4228_39_0 != 0))) {
        break forward_join_44;
    }
    forwardValue4228_43_0 = 1;
    }
    forwardValue4228_45_0 = forwardValue4228_43_0;
    break forward_join_45;
    }
    forwardValue4228_45_0 = 0;
    }
    return ((forwardValue4228_45_0) != 0);
}


private static native <E extends Throwable> com.google.common.base.Predicate __sourceIntrinsic_edcaa0212d28c5ed_originalDynamicSite825_11(moom.uq a0) throws E;
}
