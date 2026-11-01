package moom;


class uU extends moom.uT {

private static final long m;

public uU(net.minecraft.entity.monster.EntityPigZombie p0) {
super(p0, true, new java.lang.Class[0]);
}


static {
m = (moom._c.a(905337655366126908L, -2645957953967386971L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(220423889876269L);
}


private static moom.Oo c(moom.Oo p0) {
return p0;
}


protected void a(moom.sI p0, net.minecraft.entity.EntityLivingBase p1) {
moom.sI forwardValue4185_16_0;
    net.minecraft.entity.Entity[] spill4185_0;
    moom.sI spill4185_1;
    long life3_3;
    net.minecraft.entity.Entity[] life5_9;
    forward_join_19: {
    forward_join_16: {
    life3_3 = (moom.uU.m ^ 134088303623420L);
    spill4185_0 = moom.vN.b();
    super.a(((moom.sI)(p0)), ((net.minecraft.entity.EntityLivingBase)(p1)));
    life5_9 = spill4185_0;
    spill4185_1 = p0;
    if (!((life5_9 == null))) {
        forwardValue4185_16_0 = spill4185_1;
        break forward_join_16;
    }
    if (!((((spill4185_1 instanceof net.minecraft.entity.monster.EntityPigZombie) ? 1 : 0) != 0))) {
        break forward_join_19;
    }
    forwardValue4185_16_0 = p0;
    }
    __sourceExactCall_e96e0007644ebe(((net.minecraft.entity.monster.EntityPigZombie)(((net.minecraft.entity.monster.EntityPigZombie)(forwardValue4185_16_0)))), ((net.minecraft.entity.Entity)(p1)));
    }
    return;
}


private static native void __sourceExactCall_e96e0007644ebe(net.minecraft.entity.monster.EntityPigZombie p0, net.minecraft.entity.Entity p1);
}
