package moom;


class vM implements com.google.common.base.Predicate<net.minecraft.entity.EntityLivingBase> {

private final net.minecraft.entity.monster.EntityGuardian a;

private static final long b;

public vM(net.minecraft.entity.monster.EntityGuardian p0) {
super();
    this.a = p0;
}


static {
moom.vM.b = (moom._c.a(-1060579107317368128L, -3023245863625716828L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(28507196784324L);
}


public boolean apply__sourceBridge_9ea2dcf14c(java.lang.Object p0) {
return ((moom.vM)(this)).a(((net.minecraft.entity.EntityLivingBase)(((net.minecraft.entity.EntityLivingBase)(p0)))));
}


public boolean a(net.minecraft.entity.EntityLivingBase p0) {
int forwardValue4301_22_0;
    int forwardValue4301_26_0;
    int forwardValue4301_28_0;
    int spill4301_0;
    int spill4301_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_28: {
    forward_join_27: {
    forward_join_26: {
    forward_join_22: {
    forward_join_16: {
    life2_3 = (moom.vM.b ^ 101375099061444L);
    life4_5 = moom.vN.b();
    spill4301_0 = ((p0 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    if (!((life4_5 == null))) {
        forwardValue4301_22_0 = spill4301_0;
        break forward_join_22;
    }
    if (!((spill4301_0 == 0))) {
        break forward_join_16;
    }
    spill4301_1 = ((p0 instanceof moom.tl) ? 1 : 0);
    if (!((life4_5 == null))) {
        forwardValue4301_22_0 = spill4301_1;
        break forward_join_22;
    }
    if (!((spill4301_1 != 0))) {
        break forward_join_27;
    }
    }
    forwardValue4301_22_0 = recovery.source.CarrierOps.dcmpl(((double)(((net.minecraft.entity.EntityLivingBase)(p0)).a(((net.minecraft.entity.Entity)(this.a))))), ((double)(0x1.2p3d)));
    }
    if (!((life4_5 == null))) {
        forwardValue4301_26_0 = forwardValue4301_22_0;
        break forward_join_26;
    }
    if (!((forwardValue4301_22_0 > 0))) {
        break forward_join_27;
    }
    forwardValue4301_26_0 = 1;
    }
    forwardValue4301_28_0 = forwardValue4301_26_0;
    break forward_join_28;
    }
    forwardValue4301_28_0 = 0;
    }
    return ((forwardValue4301_28_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean apply(net.minecraft.entity.EntityLivingBase __bridgeParam0) { return this.apply__sourceBridge_9ea2dcf14c(((java.lang.Object)(__bridgeParam0))); }
}
