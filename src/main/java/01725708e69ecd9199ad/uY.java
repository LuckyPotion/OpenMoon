package moom;


class uY<T extends net.minecraft.entity.EntityLivingBase> extends moom.uV<T> {

private static final long n;

public uY(moom.sI p0, java.lang.Class<T> p1, int p2, boolean p3, boolean p4, com.google.common.base.Predicate<? super T> p5) {
super(p0, p1, p2, p3, p4, p5);
    ((moom.uY)(this)).l = ((com.google.common.base.Predicate)(__sourceIntrinsic_5da139da2038_originalDynamicSite5023_0(this, p5, p0)));
    return;
}


static {
n = (moom._c.a(1255836383283809814L, -8515595071117982431L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(24639365007869L);
}


private static moom.Oo c(moom.Oo p0) {
return p0;
}


private boolean lambda$new$0(com.google.common.base.Predicate p0, moom.sI p1, net.minecraft.entity.EntityLivingBase p2) {
com.google.common.base.Predicate forwardValue4192_11_0;
    int forwardValue4192_20_0;
    int forwardValue4192_27_0;
    int forwardValue4192_44_0;
    float forwardValue4192_58_0;
    int forwardValue4192_72_0;
    int forwardValue4192_81_0;
    com.google.common.base.Predicate spill4192_0;
    boolean spill4192_1;
    boolean spill4192_2;
    float spill4192_3;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    double life7_48;
    float life9_72;
    forward_join_81: {
    forward_join_77: {
    forward_join_72: {
    forward_join_66: {
    forward_join_59: {
    forward_join_58: {
    forward_join_44: {
    forward_join_42: {
    forward_join_27: {
    forward_join_25: {
    forward_join_20: {
    forward_join_18: {
    forward_join_11: {
    life4_3 = (moom.uY.n ^ 95166840831142L);
    life6_5 = moom.vN.b();
    spill4192_0 = p0;
    if (!((life6_5 == null))) {
        forwardValue4192_11_0 = spill4192_0;
        break forward_join_11;
    }
    if (!((spill4192_0 != null))) {
        break forward_join_18;
    }
    forwardValue4192_11_0 = p0;
    }
    spill4192_1 = ((com.google.common.base.Predicate)(forwardValue4192_11_0)).apply(((java.lang.Object)(p2)));
    if (!((life6_5 == null))) {
        forwardValue4192_20_0 = ((spill4192_1) ? 1 : 0);
        break forward_join_20;
    }
    if (!((!spill4192_1))) {
        break forward_join_18;
    }
    return ((0) != 0);
    }
    forwardValue4192_20_0 = ((p2 instanceof net.minecraft.entity.monster.EntityCreeper) ? 1 : 0);
    }
    if (!((life6_5 == null))) {
        forwardValue4192_27_0 = forwardValue4192_20_0;
        break forward_join_27;
    }
    if (!((forwardValue4192_20_0 != 0))) {
        break forward_join_25;
    }
    return ((0) != 0);
    }
    forwardValue4192_27_0 = ((p2 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    }
    if (!((life6_5 == null))) {
        forwardValue4192_81_0 = forwardValue4192_27_0;
        break forward_join_81;
    }
    if (!((forwardValue4192_27_0 != 0))) {
        break forward_join_77;
    }
    life7_48 = ((moom.uY)(this)).a__sourceReturn_fedcb3e4d3();
    spill4192_2 = ((net.minecraft.entity.EntityLivingBase)(p2)).t__Boolean();
    if (!((life6_5 == null))) {
        forwardValue4192_44_0 = ((spill4192_2) ? 1 : 0);
        break forward_join_44;
    }
    if (!(spill4192_2)) {
        break forward_join_42;
    }
    life7_48 = (life7_48 * 0x1.99999ap-1d);
    }
    forwardValue4192_44_0 = ((((net.minecraft.entity.EntityLivingBase)(p2)).v__Boolean()) ? 1 : 0);
    }
    if (!((life6_5 == null))) {
        forwardValue4192_72_0 = forwardValue4192_44_0;
        break forward_join_72;
    }
    if (!((forwardValue4192_44_0 != 0))) {
        break forward_join_66;
    }
    life9_72 = ((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.player.EntityPlayer)(p2)))).k();
    spill4192_3 = life9_72;
    if (!((life6_5 == null))) {
        forwardValue4192_58_0 = spill4192_3;
        break forward_join_58;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(spill4192_3)), ((float)(0x1.99999ap-4f))) < 0))) {
        break forward_join_59;
    }
    forwardValue4192_58_0 = 0x1.99999ap-4f;
    }
    life9_72 = forwardValue4192_58_0;
    }
    life7_48 = (life7_48 * ((double) (0x1.666666p-1f * life9_72)));
    }
    forwardValue4192_72_0 = recovery.source.CarrierOps.dcmpl(((double)(((double) ((net.minecraft.entity.EntityLivingBase)(p2)).a__Float(((net.minecraft.entity.Entity)(p1)))))), ((double)(life7_48)));
    }
    if (!((life6_5 == null))) {
        forwardValue4192_81_0 = forwardValue4192_72_0;
        break forward_join_81;
    }
    if (!((forwardValue4192_72_0 > 0))) {
        break forward_join_77;
    }
    return ((0) != 0);
    }
    forwardValue4192_81_0 = ((((moom.uY)(this)).a(((net.minecraft.entity.EntityLivingBase)(p2)), ((boolean)(false)))) ? 1 : 0);
    }
    return ((forwardValue4192_81_0) != 0);
}


private static native <E extends Throwable> com.google.common.base.Predicate __sourceIntrinsic_5da139da2038_originalDynamicSite5023_0(moom.uY a0, com.google.common.base.Predicate a1, moom.sI a2) throws E;
}
