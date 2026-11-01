package moom;


public class ur extends moom.uc {

private static org.apache.logging.log4j.Logger c;

private net.minecraft.entity.EntityLiving d;

private com.google.common.base.Predicate<net.minecraft.entity.Entity> e;

private moom.vo f;

private net.minecraft.entity.EntityLivingBase g;

private static long h;

public ur(net.minecraft.entity.EntityLiving p0) { super(); }


private static void __sourceConstructorBody_40e8094e5ce47a82(moom.ur receiver, net.minecraft.entity.EntityLiving p0) throws Throwable {

long local2_life1 = (moom.ur.h ^ 60512449048173L);

    boolean __sourceSpill826_3 = moom.uc.e();

    moom.ur.__sourceConstructorInit_40e8094e5ce47a82_0(((moom.ur)(receiver)));

    boolean local4_life5 = __sourceSpill826_3;

    ((moom.ur)(receiver)).d = ((net.minecraft.entity.EntityLiving)(p0));

    if ((!local4_life5)) {

        if ((((p0 instanceof moom.sI) ? 1 : 0) != 0)) {

        ((org.apache.logging.log4j.Logger)(moom.ur.c)).warn(((java.lang.String)("Use NearestAttackableTargetGoal.class for PathfinerMob mobs!")));

    }

        ((moom.ur)(receiver)).e = ((com.google.common.base.Predicate)(__sourceIntrinsic_40e8094e5ce47a82_originalDynamicSite826_10(receiver)));

        ((moom.ur)(receiver)).f = ((moom.vo)(new moom.vo(p0)));

    }

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_40e8094e5ce47a82_0(moom.ur a0) throws E;

static {
moom.ur.h = (moom._c.a(-8505908155727590576L, 2779997641584552365L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(1454436946966L);
    moom.ur.c = org.apache.logging.log4j.LogManager.getLogger();
}


public void b__Void() {
((net.minecraft.entity.EntityLiving)(this.d)).c(((net.minecraft.entity.EntityLivingBase)(null)));
    super.a__Void();
    return;
}


public boolean b__Boolean() {
net.minecraft.entity.EntityLivingBase forwardValue4231_17_0;
    int forwardValue4231_25_0;
    int forwardValue4231_32_0;
    int forwardValue4231_36_0;
    moom.Bj forwardValue4231_49_0;
    int forwardValue4231_69_0;
    int forwardValue4231_80_0;
    int forwardValue4231_82_0;
    boolean spill4231_0;
    net.minecraft.entity.EntityLivingBase spill4231_1;
    boolean spill4231_2;
    moom.Bj spill4231_3;
    int spill4231_4;
    boolean spill4231_5;
    long life1_3;
    net.minecraft.entity.EntityLivingBase life4_8;
    int life3_9;
    moom.Bj life5_59;
    moom.Bj life6_62;
    double life7_79;
    forward_join_82: {
    forward_join_81: {
    forward_join_80: {
    forward_join_79: {
    forward_join_69: {
    forward_join_53: {
    forward_join_49: {
    forward_join_37: {
    forward_join_36: {
    forward_join_32: {
    forward_join_25: {
    forward_join_23: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (moom.ur.h ^ 43047115833498L);
    spill4231_0 = moom.uc.e();
    life4_8 = ((net.minecraft.entity.EntityLiving)(this.d)).d__sourceReturn_d30556f370();
    life3_9 = ((spill4231_0) ? 1 : 0);
    spill4231_1 = life4_8;
    if (!((life3_9 == 0))) {
        forwardValue4231_17_0 = spill4231_1;
        break forward_join_17;
    }
    if (!((spill4231_1 == null))) {
        break forward_join_16;
    }
    return ((0) != 0);
    }
    forwardValue4231_17_0 = life4_8;
    }
    spill4231_2 = ((net.minecraft.entity.EntityLivingBase)(forwardValue4231_17_0)).p__Boolean();
    if (!((life3_9 == 0))) {
        forwardValue4231_25_0 = ((spill4231_2) ? 1 : 0);
        break forward_join_25;
    }
    if (!((!spill4231_2))) {
        break forward_join_23;
    }
    return ((0) != 0);
    }
    forwardValue4231_25_0 = ((life4_8 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    }
    if (!((life3_9 == 0))) {
        forwardValue4231_32_0 = forwardValue4231_25_0;
        break forward_join_32;
    }
    if (!((forwardValue4231_25_0 != 0))) {
        break forward_join_37;
    }
    forwardValue4231_32_0 = ((((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.player.EntityPlayer)(life4_8)))).b1)).a) ? 1 : 0);
    }
    if (!((life3_9 == 0))) {
        forwardValue4231_36_0 = forwardValue4231_32_0;
        break forward_join_36;
    }
    if (!((forwardValue4231_32_0 != 0))) {
        break forward_join_37;
    }
    forwardValue4231_36_0 = 0;
    }
    return ((forwardValue4231_36_0) != 0);
    }
    life5_59 = ((net.minecraft.entity.EntityLiving)(this.d)).a__Bj();
    life6_62 = ((net.minecraft.entity.EntityLivingBase)(life4_8)).a__Bj();
    spill4231_3 = life5_59;
    if (!((life3_9 == 0))) {
        forwardValue4231_49_0 = spill4231_3;
        break forward_join_49;
    }
    if (!((spill4231_3 != null))) {
        break forward_join_53;
    }
    forwardValue4231_49_0 = life6_62;
    }
    if (!((forwardValue4231_49_0 == life5_59))) {
        break forward_join_53;
    }
    return ((0) != 0);
    }
    life7_79 = ((moom.ur)(this)).a__sourceReturn_fedcb3e4d3();
    spill4231_4 = recovery.source.CarrierOps.dcmpl(((double)(((net.minecraft.entity.EntityLiving)(this.d)).a(((net.minecraft.entity.Entity)(life4_8))))), ((double)((life7_79 * life7_79))));
    if (!((life3_9 == 0))) {
        forwardValue4231_69_0 = spill4231_4;
        break forward_join_69;
    }
    if (!((spill4231_4 <= 0))) {
        break forward_join_81;
    }
    forwardValue4231_69_0 = ((life4_8 instanceof net.minecraft.entity.player.EntityPlayerMP) ? 1 : 0);
    }
    if (!((life3_9 == 0))) {
        forwardValue4231_80_0 = forwardValue4231_69_0;
        break forward_join_80;
    }
    if (!((forwardValue4231_69_0 != 0))) {
        break forward_join_79;
    }
    spill4231_5 = ((moom.Bo)(((net.minecraft.entity.player.EntityPlayerMP)(((net.minecraft.entity.player.EntityPlayerMP)(life4_8)))).ci)).b__Boolean();
    if (!((life3_9 == 0))) {
        forwardValue4231_80_0 = ((spill4231_5) ? 1 : 0);
        break forward_join_80;
    }
    if (!((!spill4231_5))) {
        break forward_join_81;
    }
    }
    forwardValue4231_80_0 = 1;
    }
    forwardValue4231_82_0 = forwardValue4231_80_0;
    break forward_join_82;
    }
    forwardValue4231_82_0 = 0;
    }
    return ((forwardValue4231_82_0) != 0);
}


public boolean a__Boolean() {
int forwardValue4230_42_0;
    boolean spill4230_0;
    boolean spill4230_1;
    long life1_3;
    double life4_7;
    java.util.List life6_22;
    int life3_23;
    forward_join_42: {
    forward_join_35: {
    life1_3 = (moom.ur.h ^ 87504597461003L);
    spill4230_0 = moom.uc.d();
    life4_7 = ((moom.ur)(this)).a__sourceReturn_fedcb3e4d3();
    life6_22 = ((net.minecraft.world.World)(((net.minecraft.entity.EntityLiving)(this.d)).i)).a(((java.lang.Class)(net.minecraft.entity.player.EntityPlayer.class)), ((moom.CA)(((moom.CA)(((net.minecraft.entity.EntityLiving)(this.d)).b())).b(((double)(life4_7)), ((double)(0x1.0p2d)), ((double)(life4_7))))), ((com.google.common.base.Predicate)(this.e)));
    life3_23 = ((spill4230_0) ? 1 : 0);
    ((java.util.List)(life6_22)).sort(((java.util.Comparator)(this.f)));
    spill4230_1 = ((java.util.List)(life6_22)).isEmpty();
    if (!((life3_23 != 0))) {
        forwardValue4230_42_0 = ((spill4230_1) ? 1 : 0);
        break forward_join_42;
    }
    if (!(spill4230_1)) {
        break forward_join_35;
    }
    return ((0) != 0);
    }
    this.g = ((net.minecraft.entity.EntityLivingBase)(((net.minecraft.entity.EntityLivingBase)(((java.util.List)(life6_22)).get(((int)(0)))))));
    forwardValue4230_42_0 = 1;
    }
    return ((forwardValue4230_42_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected double a__sourceReturn_fedcb3e4d3() {
net.minecraft.entity.ai.attributes.IAttributeInstance forwardValue4229_18_0;
    double forwardValue4229_19_0;
    boolean spill4229_0;
    net.minecraft.entity.ai.attributes.IAttributeInstance spill4229_1;
    long life1_3;
    net.minecraft.entity.ai.attributes.IAttributeInstance life4_9;
    int life3_10;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    life1_3 = (moom.ur.h ^ 105893440125821L);
    spill4229_0 = moom.uc.e();
    life4_9 = ((net.minecraft.entity.EntityLiving)(this.d)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.c)));
    life3_10 = ((spill4229_0) ? 1 : 0);
    spill4229_1 = life4_9;
    if (!((life3_10 == 0))) {
        forwardValue4229_18_0 = spill4229_1;
        break forward_join_18;
    }
    if (!((spill4229_1 == null))) {
        break forward_join_17;
    }
    forwardValue4229_19_0 = 0x1.0p4d;
    break forward_join_19;
    }
    forwardValue4229_18_0 = life4_9;
    }
    forwardValue4229_19_0 = ((net.minecraft.entity.ai.attributes.IAttributeInstance)(forwardValue4229_18_0)).b();
    }
    return forwardValue4229_19_0;
}


public void a__Void() {
((net.minecraft.entity.EntityLiving)(this.d)).c(((net.minecraft.entity.EntityLivingBase)(this.g)));
    super.a__Void();
    return;
}


private boolean lambda$new$0(net.minecraft.entity.Entity p0) {
int forwardValue4232_17_0;
    int forwardValue4232_21_0;
    int forwardValue4232_36_0;
    float forwardValue4232_50_0;
    int forwardValue4232_65_0;
    int forwardValue4232_75_0;
    int forwardValue4232_79_0;
    int forwardValue4232_81_0;
    int spill4232_0;
    boolean spill4232_1;
    float spill4232_2;
    long life2_3;
    int life4_5;
    double life5_32;
    float life7_56;
    forward_join_81: {
    forward_join_80: {
    forward_join_79: {
    forward_join_75: {
    forward_join_65: {
    forward_join_58: {
    forward_join_51: {
    forward_join_50: {
    forward_join_36: {
    forward_join_34: {
    forward_join_22: {
    forward_join_21: {
    forward_join_17: {
    forward_join_13: {
    life2_3 = (moom.ur.h ^ 6381779496603L);
    life4_5 = ((moom.uc.e()) ? 1 : 0);
    spill4232_0 = ((p0 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    if (!((life4_5 == 0))) {
        forwardValue4232_17_0 = spill4232_0;
        break forward_join_17;
    }
    if (!((spill4232_0 == 0))) {
        break forward_join_13;
    }
    return ((0) != 0);
    }
    forwardValue4232_17_0 = ((((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)))).b1)).a) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forwardValue4232_21_0 = forwardValue4232_17_0;
        break forward_join_21;
    }
    if (!((forwardValue4232_17_0 != 0))) {
        break forward_join_22;
    }
    forwardValue4232_21_0 = 0;
    }
    return ((forwardValue4232_21_0) != 0);
    }
    life5_32 = ((moom.ur)(this)).a__sourceReturn_fedcb3e4d3();
    spill4232_1 = ((net.minecraft.entity.Entity)(p0)).t__Boolean();
    if (!((life4_5 == 0))) {
        forwardValue4232_36_0 = ((spill4232_1) ? 1 : 0);
        break forward_join_36;
    }
    if (!(spill4232_1)) {
        break forward_join_34;
    }
    life5_32 = (life5_32 * 0x1.99999ap-1d);
    }
    forwardValue4232_36_0 = ((((net.minecraft.entity.Entity)(p0)).v__Boolean()) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forwardValue4232_65_0 = forwardValue4232_36_0;
        break forward_join_65;
    }
    if (!((forwardValue4232_36_0 != 0))) {
        break forward_join_58;
    }
    life7_56 = ((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)))).k();
    spill4232_2 = life7_56;
    if (!((life4_5 == 0))) {
        forwardValue4232_50_0 = spill4232_2;
        break forward_join_50;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(spill4232_2)), ((float)(0x1.99999ap-4f))) < 0))) {
        break forward_join_51;
    }
    forwardValue4232_50_0 = 0x1.99999ap-4f;
    }
    life7_56 = forwardValue4232_50_0;
    }
    life5_32 = (life5_32 * ((double) (0x1.666666p-1f * life7_56)));
    }
    forwardValue4232_65_0 = recovery.source.CarrierOps.dcmpl(((double)(((double) ((net.minecraft.entity.Entity)(p0)).a__Float(((net.minecraft.entity.Entity)(this.d)))))), ((double)(life5_32)));
    }
    if (!((life4_5 == 0))) {
        forwardValue4232_75_0 = forwardValue4232_65_0;
        break forward_join_75;
    }
    if (!((forwardValue4232_65_0 <= 0))) {
        break forward_join_80;
    }
    forwardValue4232_75_0 = ((moom.uR.a(((net.minecraft.entity.EntityLiving)(this.d)), ((net.minecraft.entity.EntityLivingBase)(((net.minecraft.entity.EntityLivingBase)(p0)))), ((boolean)(false)), ((boolean)(true)))) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forwardValue4232_79_0 = forwardValue4232_75_0;
        break forward_join_79;
    }
    if (!((forwardValue4232_75_0 != 0))) {
        break forward_join_80;
    }
    forwardValue4232_79_0 = 1;
    }
    forwardValue4232_81_0 = forwardValue4232_79_0;
    break forward_join_81;
    }
    forwardValue4232_81_0 = 0;
    }
    return ((forwardValue4232_81_0) != 0);
}


private static native <E extends Throwable> com.google.common.base.Predicate __sourceIntrinsic_40e8094e5ce47a82_originalDynamicSite826_10(moom.ur a0) throws E;
}
