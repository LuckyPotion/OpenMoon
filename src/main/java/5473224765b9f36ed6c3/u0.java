package moom;


class u0<T extends net.minecraft.entity.EntityLivingBase> extends moom.uV {

private static final long n;

public u0(moom.s9 p0, java.lang.Class<T> p1) {
super(p0, p1, true);
}


static {
n = (moom._c.a(-7443882969847926228L, -3834896629186541972L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(83589406935934L);
}


private static moom.Oo c(moom.Oo p0) {
return p0;
}


public boolean a__Boolean() {
int forwardValue4114_19_0;
    int forwardValue4114_23_0;
    int forwardValue4114_25_0;
    net.minecraft.entity.Entity[] spill4114_0;
    int spill4114_1;
    long life1_3;
    float life4_9;
    net.minecraft.entity.Entity[] life3_10;
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    forward_join_19: {
    life1_3 = (moom.u0.n ^ 114190779969206L);
    spill4114_0 = moom.vN.b();
    life4_9 = ((moom.sI)(((moom.u0)(this)).c)).a(((float)(0x1.0p0f)));
    life3_10 = spill4114_0;
    spill4114_1 = recovery.source.CarrierOps.fcmpl(((float)(life4_9)), ((float)(0x1.0p-1f)));
    if (!((life3_10 == null))) {
        forwardValue4114_19_0 = spill4114_1;
        break forward_join_19;
    }
    if (!((spill4114_1 < 0))) {
        break forward_join_24;
    }
    forwardValue4114_19_0 = ((super.a__Boolean()) ? 1 : 0);
    }
    if (!((life3_10 == null))) {
        forwardValue4114_23_0 = forwardValue4114_19_0;
        break forward_join_23;
    }
    if (!((forwardValue4114_19_0 != 0))) {
        break forward_join_24;
    }
    forwardValue4114_23_0 = 1;
    }
    forwardValue4114_25_0 = forwardValue4114_23_0;
    break forward_join_25;
    }
    forwardValue4114_25_0 = 0;
    }
    return ((forwardValue4114_25_0) != 0);
}

}
