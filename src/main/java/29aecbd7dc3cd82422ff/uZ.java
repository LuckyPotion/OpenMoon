package moom;


class uZ extends moom.uV<net.minecraft.entity.player.EntityPlayer> {

private static final long n;

public uZ(net.minecraft.entity.monster.EntityPigZombie p0) {
super(p0, net.minecraft.entity.player.EntityPlayer.class, true);
}


static {
n = (moom._c.a(1197080923604830121L, 6515463410279935504L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(234105109812359L);
}


private static moom.Oo c(moom.Oo p0) {
return p0;
}


public boolean a__Boolean() {
int forwardValue4193_15_0;
    int forwardValue4193_19_0;
    int forwardValue4193_21_0;
    boolean spill4193_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    forward_join_15: {
    life1_3 = (moom.uZ.n ^ 64087641915287L);
    life3_5 = moom.vN.b();
    spill4193_0 = ((net.minecraft.entity.monster.EntityPigZombie)(((net.minecraft.entity.monster.EntityPigZombie)(((moom.uZ)(this)).c)))).af();
    if (!((life3_5 == null))) {
        forwardValue4193_15_0 = ((spill4193_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!(spill4193_0)) {
        break forward_join_20;
    }
    forwardValue4193_15_0 = ((super.a__Boolean()) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        forwardValue4193_19_0 = forwardValue4193_15_0;
        break forward_join_19;
    }
    if (!((forwardValue4193_15_0 != 0))) {
        break forward_join_20;
    }
    forwardValue4193_19_0 = 1;
    }
    forwardValue4193_21_0 = forwardValue4193_19_0;
    break forward_join_21;
    }
    forwardValue4193_21_0 = 0;
    }
    return ((forwardValue4193_21_0) != 0);
}

}
