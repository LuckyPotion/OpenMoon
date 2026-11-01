package net.minecraft.entity.ai;


public class EntitySenses {

net.minecraft.entity.EntityLiving a;

java.util.List<net.minecraft.entity.Entity> b;

java.util.List<net.minecraft.entity.Entity> c;

private static final long d;

public EntitySenses(net.minecraft.entity.EntityLiving p0) {
super();
    this.b = com.google.common.collect.Lists.newArrayList();
    this.c = com.google.common.collect.Lists.newArrayList();
    this.a = p0;
}


static {
d = (moom._c.a(-8498286181520541147L, -4426482088199614060L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(160806829830729L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a(net.minecraft.entity.Entity p0) {
int forwardValue4995_19_0;
    int forwardValue4995_34_0;
    int forwardValue4995_55_0;
    boolean spill4995_0;
    int spill4995_1;
    long life2_3;
    int life4_5;
    int life5_44;
    forward_join_56: {
    forward_join_55: {
    forward_join_51: {
    forward_join_34: {
    forward_join_24: {
    forward_join_19: {
    forward_join_15: {
    life2_3 = (net.minecraft.entity.ai.EntitySenses.d ^ 123208283245390L);
    life4_5 = ((moom.uc.d()) ? 1 : 0);
    spill4995_0 = ((java.util.List)(this.b)).contains(((java.lang.Object)(p0)));
    if (!((life4_5 != 0))) {
        forwardValue4995_19_0 = ((spill4995_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!(spill4995_0)) {
        break forward_join_15;
    }
    return ((1) != 0);
    }
    forwardValue4995_19_0 = ((((java.util.List)(this.c)).contains(((java.lang.Object)(p0)))) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue4995_34_0 = forwardValue4995_19_0;
        break forward_join_34;
    }
    if (!((forwardValue4995_19_0 != 0))) {
        break forward_join_24;
    }
    return ((0) != 0);
    }
    ((moom.A9)(((net.minecraft.world.World)(((net.minecraft.entity.EntityLiving)(this.a)).i)).D)).a__Void(((java.lang.String)("canSee")));
    forwardValue4995_34_0 = ((((net.minecraft.entity.EntityLiving)(this.a)).d__sourceReturn_13640a2b19(((net.minecraft.entity.Entity)(p0)))) ? 1 : 0);
    }
    life5_44 = forwardValue4995_34_0;
    ((moom.A9)(((net.minecraft.world.World)(((net.minecraft.entity.EntityLiving)(this.a)).i)).D)).b();
    spill4995_1 = life5_44;
    if (!((life4_5 != 0))) {
        forwardValue4995_55_0 = spill4995_1;
        break forward_join_55;
    }
    if (!((spill4995_1 != 0))) {
        break forward_join_51;
    }
    ((java.util.List)(this.b)).add(((java.lang.Object)(p0)));
    if (!((life4_5 == 0))) {
        break forward_join_56;
    }
    }
    forwardValue4995_55_0 = ((((java.util.List)(this.c)).add(((java.lang.Object)(p0)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue4995_55_0);
    }
    return ((life5_44) != 0);
}


public void a() {
((java.util.List)(this.b)).clear();
    ((java.util.List)(this.c)).clear();
    return;
}

}
