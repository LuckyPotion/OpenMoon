package moom;


public class uQ extends moom.uc {

private final net.minecraft.entity.EntityLiving c;

private static final long d;

public uQ(net.minecraft.entity.EntityLiving p0) {
super();
    this.c = p0;
    (this).a(4);
    (((moom.AW) (__sourceExactCall_397ed84fa0ab7e((p0))))).d(true);
}


static {
d = (moom._c.a(8670056856070277144L, 313649386892837325L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(277987037872872L);
}


public void c() {
net.minecraft.entity.EntityLiving forwardValue4176_17_0;
    net.minecraft.entity.EntityLiving spill4176_0;
    long life1_3;
    int life3_5;
    forward_join_19: {
    forward_join_17: {
    life1_3 = (moom.uQ.d ^ 107122609744643L);
    life3_5 = ((moom.uc.d()) ? 1 : 0);
    spill4176_0 = this.c;
    if (!((life3_5 != 0))) {
        forwardValue4176_17_0 = spill4176_0;
        break forward_join_17;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(((java.util.Random)(((net.minecraft.entity.EntityLiving)(spill4176_0)).a__Random())).nextFloat())), ((float)(0x1.99999ap-1f))) < 0))) {
        break forward_join_19;
    }
    forwardValue4176_17_0 = this.c;
    }
    ((net.minecraft.entity.ai.EntityJumpHelper)(((net.minecraft.entity.EntityLiving)(forwardValue4176_17_0)).a__vr())).a();
    }
    return;
}


public boolean a__Boolean() {
int forwardValue4175_19_0;
    int forwardValue4175_21_0;
    boolean spill4175_0;
    boolean spill4175_1;
    long life1_3;
    int life3_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    life1_3 = (moom.uQ.d ^ 102004994138417L);
    life3_5 = ((moom.uc.d()) ? 1 : 0);
    spill4175_0 = ((net.minecraft.entity.EntityLiving)(this.c)).j__Boolean();
    if (!((life3_5 != 0))) {
        forwardValue4175_19_0 = ((spill4175_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!((!spill4175_0))) {
        break forward_join_18;
    }
    spill4175_1 = ((net.minecraft.entity.EntityLiving)(this.c)).l__Boolean();
    if (!((life3_5 != 0))) {
        forwardValue4175_19_0 = ((spill4175_1) ? 1 : 0);
        break forward_join_19;
    }
    if (!(spill4175_1)) {
        break forward_join_20;
    }
    }
    forwardValue4175_19_0 = 1;
    }
    forwardValue4175_21_0 = forwardValue4175_19_0;
    break forward_join_21;
    }
    forwardValue4175_21_0 = 0;
    }
    return ((forwardValue4175_21_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native moom.AV __sourceExactCall_397ed84fa0ab7e(net.minecraft.entity.EntityLiving p0);
}
