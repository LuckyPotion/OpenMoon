package moom;


public class xv extends net.minecraft.item.Item {

private final java.lang.Class<? extends net.minecraft.entity.EntityHanging> n;

private static final long o;

public xv(java.lang.Class<? extends net.minecraft.entity.EntityHanging> p0) {
super();
    this.n = p0;
    (this).a(net.minecraft.creativetab.CreativeTabs.c);
}


static {
o = (moom._c.a(3243093217028812271L, -346099948147444275L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(120939053531943L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private net.minecraft.entity.EntityHanging a(net.minecraft.world.World p0, moom.DT p1, moom.bs p2) {
java.lang.Class forwardValue4544_22_0;

    java.lang.Class forwardValue4544_22_1;

    net.minecraft.entity.EntityHanging forwardValue4544_31_0;

    java.lang.Class spill4544_0;

    java.lang.Class spill4544_1;

    long life4_3;

    int life6_5;

    forward_join_31: {

    forward_join_30: {

    forward_join_22: {

    forward_join_19: {

    life4_3 = (moom.xv.o ^ 24604322633955L);

    life6_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);

    spill4544_0 = this.n;

    spill4544_1 = moom.sF.class;

    if (!((life6_5 != 0))) {

        forwardValue4544_22_0 = spill4544_0;

        forwardValue4544_22_1 = spill4544_1;

        break forward_join_22;

    }

    if (!((spill4544_0 == spill4544_1))) {

        break forward_join_19;

    }

    forwardValue4544_31_0 = new moom.sF(p0, p1, p2);

    break forward_join_31;

    }

    forwardValue4544_22_0 = this.n;

    forwardValue4544_22_1 = net.minecraft.entity.item.EntityItemFrame.class;

    }

    if (!((forwardValue4544_22_0 == forwardValue4544_22_1))) {

        break forward_join_30;

    }

    forwardValue4544_31_0 = new net.minecraft.entity.item.EntityItemFrame(p0, p1, p2);

    break forward_join_31;

    }

    forwardValue4544_31_0 = null;

    }

    return forwardValue4544_31_0;
}


public boolean a(net.minecraft.item.ItemStack p0, net.minecraft.entity.player.EntityPlayer p1, net.minecraft.world.World p2, moom.DT p3, moom.bs p4, float p5, float p6, float p7) {
moom.bs forwardValue4543_15_0;
    moom.bs forwardValue4543_15_1;
    int forwardValue4543_31_0;
    net.minecraft.entity.EntityHanging forwardValue4543_43_0;
    int forwardValue4543_55_0;
    int forwardValue4543_63_0;
    moom.bs spill4543_0;
    moom.bs spill4543_1;
    boolean spill4543_2;
    net.minecraft.entity.EntityHanging spill4543_3;
    boolean spill4543_4;
    boolean spill4543_5;
    long life9_3;
    int life11_5;
    moom.DT life12_28;
    net.minecraft.entity.EntityHanging life13_47;
    forward_join_63: {
    forward_join_62: {
    forward_join_56: {
    forward_join_55: {
    forward_join_43: {
    forward_join_32: {
    forward_join_31: {
    forward_join_18: {
    forward_join_15: {
    forward_join_13: {
    life9_3 = (moom.xv.o ^ 104361264080715L);
    life11_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    spill4543_0 = p4;
    spill4543_1 = moom.bs.DOWN;
    if (!((life11_5 == 0))) {
        forwardValue4543_15_0 = spill4543_0;
        forwardValue4543_15_1 = spill4543_1;
        break forward_join_15;
    }
    if (!((spill4543_0 == spill4543_1))) {
        break forward_join_13;
    }
    return ((0) != 0);
    }
    forwardValue4543_15_0 = p4;
    forwardValue4543_15_1 = moom.bs.UP;
    }
    if (!((forwardValue4543_15_0 == forwardValue4543_15_1))) {
        break forward_join_18;
    }
    return ((0) != 0);
    }
    life12_28 = ((moom.DT)(p3)).a(((moom.bs)(p4)));
    spill4543_2 = ((net.minecraft.entity.player.EntityPlayer)(p1)).a(((moom.DT)(life12_28)), ((moom.bs)(p4)), ((net.minecraft.item.ItemStack)(p0)));
    if (!((life11_5 == 0))) {
        forwardValue4543_31_0 = ((spill4543_2) ? 1 : 0);
        break forward_join_31;
    }
    if (!((!spill4543_2))) {
        break forward_join_32;
    }
    forwardValue4543_31_0 = 0;
    }
    return ((forwardValue4543_31_0) != 0);
    }
    life13_47 = ((moom.xv)(this)).a(((net.minecraft.world.World)(p2)), ((moom.DT)(life12_28)), ((moom.bs)(p4)));
    spill4543_3 = life13_47;
    if (!((life11_5 == 0))) {
        forwardValue4543_43_0 = spill4543_3;
        break forward_join_43;
    }
    if (!((spill4543_3 != null))) {
        break forward_join_62;
    }
    forwardValue4543_43_0 = life13_47;
    }
    spill4543_4 = ((net.minecraft.entity.EntityHanging)(forwardValue4543_43_0)).b__Boolean();
    if (!((life11_5 == 0))) {
        forwardValue4543_63_0 = ((spill4543_4) ? 1 : 0);
        break forward_join_63;
    }
    if (!(spill4543_4)) {
        break forward_join_62;
    }
    spill4543_5 = ((net.minecraft.world.World)(p2)).G;
    if (!((life11_5 == 0))) {
        forwardValue4543_55_0 = ((spill4543_5) ? 1 : 0);
        break forward_join_55;
    }
    if (!((!spill4543_5))) {
        break forward_join_56;
    }
    forwardValue4543_55_0 = ((((net.minecraft.world.World)(p2)).b__Boolean(((net.minecraft.entity.Entity)(life13_47)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue4543_55_0);
    }
    net.minecraft.item.ItemStack __stackOp4543_19_0 = p0;
    ((net.minecraft.item.ItemStack)(__stackOp4543_19_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp4543_19_0)).b - 1)));
    }
    forwardValue4543_63_0 = 1;
    }
    return ((forwardValue4543_63_0) != 0);
}

}
