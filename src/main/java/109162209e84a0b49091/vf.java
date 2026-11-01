package moom;


class vf extends moom.uc {

private final net.minecraft.entity.monster.EntityGhast c;

private static final long d;

public vf(net.minecraft.entity.monster.EntityGhast p0) {
super();
    this.c = p0;
    (this).a(2);
}


static {
d = (moom._c.a(-8417978167779957615L, 977256709287984381L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(9098967916981L);
}


public void c() {
net.minecraft.entity.EntityLivingBase forwardValue4317_37_0;
    double forwardValue4317_56_0;
    double forwardValue4317_56_1;
    net.minecraft.entity.EntityLivingBase spill4317_0;
    net.minecraft.entity.monster.EntityGhast spill4317_1;
    float spill4317_2;
    double spill4317_3;
    double spill4317_4;
    net.minecraft.entity.monster.EntityGhast spill4317_5;
    float spill4317_6;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    net.minecraft.entity.EntityLivingBase life4_46;
    double life5_48;
    double life7_72;
    double life9_79;
    forward_join_81: {
    forward_join_56: {
    forward_join_37: {
    forward_join_34: {
    life1_3 = (moom.vf.d ^ 86771593478219L);
    life3_5 = moom.vN.b();
    spill4317_0 = ((net.minecraft.entity.monster.EntityGhast)(this.c)).d__sourceReturn_d30556f370();
    if (!((life3_5 == null))) {
        forwardValue4317_37_0 = spill4317_0;
        break forward_join_37;
    }
    if (!((spill4317_0 == null))) {
        break forward_join_34;
    }
    spill4317_1 = this.c;
    net.minecraft.entity.monster.EntityGhast __stackOp4317_11_0 = this.c;
    float __stackOp4317_11_1 = (((-((float) moom.Dr.b(((double)(((net.minecraft.entity.monster.EntityGhast)(this.c)).t)), ((double)(((net.minecraft.entity.monster.EntityGhast)(this.c)).v))))) * 0x1.68p7f) / 0x1.921fb6p1f);
    spill4317_2 = __stackOp4317_11_1;
    ((net.minecraft.entity.monster.EntityGhast)(__stackOp4317_11_0)).w = ((float)(__stackOp4317_11_1));
    ((net.minecraft.entity.monster.EntityGhast)(spill4317_1)).a2 = ((float)(spill4317_2));
    if (!((life3_5 != null))) {
        break forward_join_81;
    }
    }
    forwardValue4317_37_0 = ((net.minecraft.entity.monster.EntityGhast)(this.c)).d__sourceReturn_d30556f370();
    }
    life4_46 = forwardValue4317_37_0;
    life5_48 = 0x1.0p6d;
    spill4317_3 = ((net.minecraft.entity.EntityLivingBase)(life4_46)).a(((net.minecraft.entity.Entity)(this.c)));
    spill4317_4 = (life5_48 * life5_48);
    if (!((life3_5 == null))) {
        forwardValue4317_56_0 = spill4317_3;
        forwardValue4317_56_1 = spill4317_4;
        break forward_join_56;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(spill4317_3)), ((double)(spill4317_4))) < 0))) {
        break forward_join_81;
    }
    forwardValue4317_56_0 = ((net.minecraft.entity.EntityLivingBase)(life4_46)).n;
    forwardValue4317_56_1 = ((net.minecraft.entity.monster.EntityGhast)(this.c)).n;
    }
    life7_72 = (forwardValue4317_56_0 - forwardValue4317_56_1);
    life9_79 = (((net.minecraft.entity.EntityLivingBase)(life4_46)).p - ((net.minecraft.entity.monster.EntityGhast)(this.c)).p);
    spill4317_5 = this.c;
    net.minecraft.entity.monster.EntityGhast __stackOp4317_28_0 = this.c;
    float __stackOp4317_28_1 = (((-((float) moom.Dr.b(((double)(life7_72)), ((double)(life9_79))))) * 0x1.68p7f) / 0x1.921fb6p1f);
    spill4317_6 = __stackOp4317_28_1;
    ((net.minecraft.entity.monster.EntityGhast)(__stackOp4317_28_0)).w = ((float)(__stackOp4317_28_1));
    ((net.minecraft.entity.monster.EntityGhast)(spill4317_5)).a2 = ((float)(spill4317_6));
    }
    return;
}


public boolean a__Boolean() {
return ((1) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
