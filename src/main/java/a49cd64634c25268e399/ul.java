package moom;


public class ul extends moom.uc {

net.minecraft.entity.monster.EntityCreeper c;

net.minecraft.entity.EntityLivingBase d;

private static final long e;

public ul(net.minecraft.entity.monster.EntityCreeper p0) {
super();
    this.c = p0;
    (this).a(1);
}


static {
e = (moom._c.a(-8879471588624480960L, -8668818487672317063L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(83211023540046L);
}


public void b__Void() {
this.d = ((net.minecraft.entity.EntityLivingBase)(null));
    return;
}


public void c() {
moom.ul forwardValue4213_18_0;
    int forwardValue4213_41_0;
    net.minecraft.entity.monster.EntityCreeper forwardValue4213_50_0;
    moom.ul spill4213_0;
    int spill4213_1;
    net.minecraft.entity.monster.EntityCreeper spill4213_2;
    long life1_3;
    int life3_5;
    forward_join_52: {
    forward_join_50: {
    forward_join_48: {
    forward_join_41: {
    forward_join_33: {
    forward_join_18: {
    forward_join_17: {
    life1_3 = (moom.ul.e ^ 99951827689966L);
    life3_5 = ((moom.uc.e()) ? 1 : 0);
    spill4213_0 = this;
    if (!((life3_5 == 0))) {
        forwardValue4213_18_0 = spill4213_0;
        break forward_join_18;
    }
    if (!((((moom.ul)(spill4213_0)).d == null))) {
        break forward_join_17;
    }
    ((net.minecraft.entity.monster.EntityCreeper)(this.c)).l(((int)(-1)));
    if (!((life3_5 != 0))) {
        break forward_join_52;
    }
    }
    forwardValue4213_18_0 = this;
    }
    spill4213_1 = recovery.source.CarrierOps.dcmpl(((double)(((net.minecraft.entity.monster.EntityCreeper)(((moom.ul)(forwardValue4213_18_0)).c)).a(((net.minecraft.entity.Entity)(this.d))))), ((double)(0x1.88p5d)));
    if (!((life3_5 == 0))) {
        forwardValue4213_41_0 = spill4213_1;
        break forward_join_41;
    }
    if (!((spill4213_1 > 0))) {
        break forward_join_33;
    }
    ((net.minecraft.entity.monster.EntityCreeper)(this.c)).l(((int)(-1)));
    if (!((life3_5 != 0))) {
        break forward_join_52;
    }
    }
    spill4213_2 = this.c;
    if (!((life3_5 == 0))) {
        forwardValue4213_50_0 = spill4213_2;
        break forward_join_50;
    }
    forwardValue4213_41_0 = ((((net.minecraft.entity.ai.EntitySenses)(((net.minecraft.entity.monster.EntityCreeper)(spill4213_2)).a__vz())).a(((net.minecraft.entity.Entity)(this.d)))) ? 1 : 0);
    }
    if (!((forwardValue4213_41_0 == 0))) {
        break forward_join_48;
    }
    ((net.minecraft.entity.monster.EntityCreeper)(this.c)).l(((int)(-1)));
    if (!((life3_5 != 0))) {
        break forward_join_52;
    }
    }
    forwardValue4213_50_0 = this.c;
    }
    ((net.minecraft.entity.monster.EntityCreeper)(forwardValue4213_50_0)).l(((int)(1)));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean() {
int forwardValue4212_28_0;
    int forwardValue4212_30_0;
    boolean spill4212_0;
    int spill4212_1;
    int spill4212_2;
    long life1_3;
    net.minecraft.entity.EntityLivingBase life4_8;
    int life3_9;
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    forward_join_27: {
    life1_3 = (moom.ul.e ^ 113590464293852L);
    spill4212_0 = moom.uc.d();
    life4_8 = ((net.minecraft.entity.monster.EntityCreeper)(this.c)).d__sourceReturn_d30556f370();
    life3_9 = ((spill4212_0) ? 1 : 0);
    spill4212_1 = ((net.minecraft.entity.monster.EntityCreeper)(this.c)).s();
    if (!((life3_9 != 0))) {
        forwardValue4212_28_0 = spill4212_1;
        break forward_join_28;
    }
    if (!((spill4212_1 <= 0))) {
        break forward_join_27;
    }
    if (!((life4_8 != null))) {
        break forward_join_29;
    }
    spill4212_2 = recovery.source.CarrierOps.dcmpg(((double)(((net.minecraft.entity.monster.EntityCreeper)(this.c)).a(((net.minecraft.entity.Entity)(life4_8))))), ((double)(0x1.2p3d)));
    if (!((life3_9 != 0))) {
        forwardValue4212_28_0 = spill4212_2;
        break forward_join_28;
    }
    if (!((spill4212_2 < 0))) {
        break forward_join_29;
    }
    }
    forwardValue4212_28_0 = 1;
    }
    forwardValue4212_30_0 = forwardValue4212_28_0;
    break forward_join_30;
    }
    forwardValue4212_30_0 = 0;
    }
    return ((forwardValue4212_30_0) != 0);
}


public void a__Void() {
((moom.AV)(((net.minecraft.entity.monster.EntityCreeper)(this.c)).a__sourceReturn_407923443b())).c();
    this.d = ((net.minecraft.entity.EntityLivingBase)(((net.minecraft.entity.monster.EntityCreeper)(this.c)).d__sourceReturn_d30556f370()));
    return;
}

}
