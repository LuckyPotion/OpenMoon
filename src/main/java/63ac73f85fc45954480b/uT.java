package moom;


public class uT extends moom.uR {

private final boolean i;

private int j;

private final java.lang.Class[] k;

private static final long l;

public uT(moom.sI p0, boolean p1, java.lang.Class[] p2) {
super(p0, false);
    this.i = p1;
    this.k = p2;
    (this).a(1);
}


static {
moom.uT.l = (moom._c.a(4468817377758461302L, 2075706650690413601L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(164951467890942L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void a__Void() {
java.lang.Object forestValue509_70_0;
    net.minecraft.entity.EntityLivingBase forestValue509_84_0;
    moom.sI forestValue509_86_0;
    int forestValue509_94_0;
    moom.uT forestValue509_136_0;
    boolean spill509_0;
    moom.uT spill509_1;
    moom.uT spill509_2;
    moom.sI spill509_3;
    moom.sI spill509_4;
    boolean spill509_5;
    java.lang.Class spill509_6;
    long life1_3;
    int life3_11;
    double life4_25;
    java.util.Iterator life6_65;
    moom.sI life7_72;
    int life8_99;
    java.lang.Class[] life9_102;
    int life10_105;
    int life11_107;
    java.lang.Class life12_114;
    forest_join_136: {
    forest_join_135: {
    life1_3 = (moom.uT.l ^ 120753591069860L);
    spill509_0 = moom.uc.e();
    ((moom.sI)(this.c)).c(((net.minecraft.entity.EntityLivingBase)(((moom.sI)(this.c)).a__sG())));
    life3_11 = ((spill509_0) ? 1 : 0);
    this.j = ((int)(((moom.sI)(this.c)).a__Int()));
    spill509_1 = this;
    if (!((life3_11 == 0))) {
        forestValue509_136_0 = spill509_1;
        break forest_join_136;
    }
    if (!(((moom.uT)(spill509_1)).i)) {
        break forest_join_135;
    }
    life4_25 = ((moom.uT)(this)).a__sourceReturn_fedcb3e4d3();
    life6_65 = ((java.util.List)(((net.minecraft.world.World)(((moom.sI)(this.c)).i)).a(((java.lang.Class)(((java.lang.Object)(this.c)).getClass())), ((moom.CA)(((moom.CA)(new moom.CA(((moom.sI)(this.c)).n, ((moom.sI)(this.c)).o, ((moom.sI)(this.c)).p, (((moom.sI)(this.c)).n + 0x1.0p0d), (((moom.sI)(this.c)).o + 0x1.0p0d), (((moom.sI)(this.c)).p + 0x1.0p0d)))).b(((double)(life4_25)), ((double)(0x1.4p3d)), ((double)(life4_25)))))))).iterator();
    forest_cycle_65: while (true) {
    forest_join_133: {
    forest_join_125: {
    if (!(((java.util.Iterator)(life6_65)).hasNext())) {
        break forest_join_135;
    }
    forestValue509_70_0 = ((java.util.Iterator)(life6_65)).next();
    forest_cycle_70: while (true) {
    forest_join_94: {
    forest_join_86: {
    forest_join_84: {
    life7_72 = ((moom.sI)(forestValue509_70_0));
    spill509_2 = this;
    if (!((life3_11 == 0))) {
        forestValue509_136_0 = spill509_2;
        break forest_join_136;
    }
    spill509_3 = ((moom.uT)(spill509_2)).c;
    if (!((life3_11 == 0))) {
        forestValue509_84_0 = spill509_3;
        break forest_join_84;
    }
    if (!((spill509_3 != life7_72))) {
        break forest_join_133;
    }
    spill509_4 = life7_72;
    if (!((life3_11 == 0))) {
        forestValue509_86_0 = spill509_4;
        break forest_join_86;
    }
    forestValue509_84_0 = ((moom.sI)(spill509_4)).d__sourceReturn_d30556f370();
    }
    if (!((forestValue509_84_0 == null))) {
        break forest_join_133;
    }
    forestValue509_86_0 = life7_72;
    }
    spill509_5 = ((moom.sI)(forestValue509_86_0)).a__sourceReturn_55fa5355bc(((net.minecraft.entity.EntityLivingBase)(((moom.sI)(this.c)).a__sG())));
    if (!((life3_11 == 0))) {
        forestValue509_94_0 = ((spill509_5) ? 1 : 0);
        break forest_join_94;
    }
    if (!((!spill509_5))) {
        break forest_join_133;
    }
    forestValue509_94_0 = 0;
    }
    life8_99 = forestValue509_94_0;
    life9_102 = this.k;
    life10_105 = (life9_102).length;
    life11_107 = 0;
    forest_cycle_103: while (true) {
    forest_join_123: {
    forest_join_122: {
    if (!((life11_107 < life10_105))) {
        break forest_join_125;
    }
    life12_114 = (life9_102)[life11_107];
    if (!((life3_11 == 0))) {
        break forest_join_123;
    }
    spill509_6 = ((java.lang.Object)(life7_72)).getClass();
    if (!((life3_11 == 0))) {
        forestValue509_70_0 = spill509_6;
        continue forest_cycle_70;
    }
    if (!((spill509_6 == life12_114))) {
        break forest_join_122;
    }
    life8_99 = 1;
    if (!((life3_11 != 0))) {
        break forest_join_125;
    }
    }
    life11_107 += 1;
    }
    if (!((life3_11 != 0))) {
        continue forest_cycle_103;
    }
    break forest_cycle_103;
    }
    break forest_cycle_70;
    }
    }
    if (!((life8_99 == 0))) {
        break forest_join_133;
    }
    ((moom.uT)(this)).a(((moom.sI)(life7_72)), ((net.minecraft.entity.EntityLivingBase)(((moom.sI)(this.c)).a__sG())));
    }
    if (!((life3_11 != 0))) {
        continue forest_cycle_65;
    }
    break forest_cycle_65;
    }
    }
    forestValue509_136_0 = this;
    }
    __sourceIntrinsic_b82a5b29b709_call509_45(forestValue509_136_0);
    return;
}


public boolean a__Boolean() {
int forwardValue4183_22_0;
    int forwardValue4183_26_0;
    int forwardValue4183_28_0;
    boolean spill4183_0;
    int spill4183_1;
    long life1_3;
    int life4_8;
    int life3_9;
    forward_join_28: {
    forward_join_27: {
    forward_join_26: {
    forward_join_22: {
    life1_3 = (moom.uT.l ^ 118744523740312L);
    spill4183_0 = moom.uc.d();
    life4_8 = ((moom.sI)(this.c)).a__Int();
    life3_9 = ((spill4183_0) ? 1 : 0);
    spill4183_1 = life4_8;
    if (!((life3_9 != 0))) {
        forwardValue4183_22_0 = spill4183_1;
        break forward_join_22;
    }
    if (!((spill4183_1 != this.j))) {
        break forward_join_27;
    }
    forwardValue4183_22_0 = ((((moom.uT)(this)).a(((net.minecraft.entity.EntityLivingBase)(((moom.sI)(this.c)).a__sG())), ((boolean)(false)))) ? 1 : 0);
    }
    if (!((life3_9 != 0))) {
        forwardValue4183_26_0 = forwardValue4183_22_0;
        break forward_join_26;
    }
    if (!((forwardValue4183_22_0 != 0))) {
        break forward_join_27;
    }
    forwardValue4183_26_0 = 1;
    }
    forwardValue4183_28_0 = forwardValue4183_26_0;
    break forward_join_28;
    }
    forwardValue4183_28_0 = 0;
    }
    return ((forwardValue4183_28_0) != 0);
}


protected void a(moom.sI p0, net.minecraft.entity.EntityLivingBase p1) {
((moom.sI)(p0)).c(((net.minecraft.entity.EntityLivingBase)(p1)));
    return;
}


private static native <E extends Throwable> void __sourceIntrinsic_b82a5b29b709_call509_45(moom.uT a0) throws E;
}
