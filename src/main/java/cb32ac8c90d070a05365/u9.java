package moom;


public class u9 extends moom.u8 {

private final net.minecraft.entity.passive.EntityVillager i;

private static final long j;

public u9(net.minecraft.entity.passive.EntityVillager p0) {
super(p0, net.minecraft.entity.player.EntityPlayer.class, 0x1.0000000000000p+3f);
    this.i = p0;
}


static {
j = (moom._c.a(-2455730093425203386L, 7927040262603714889L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(203468298967529L);
}


public boolean a__Boolean() {
int forwardValue4132_20_0;
    boolean spill4132_0;
    long life1_3;
    int life3_5;
    forward_join_20: {
    forward_join_19: {
    life1_3 = (moom.u9.j ^ 124249328536888L);
    life3_5 = ((moom.uc.e()) ? 1 : 0);
    spill4132_0 = ((net.minecraft.entity.passive.EntityVillager)(this.i)).af();
    if (!((life3_5 == 0))) {
        forwardValue4132_20_0 = ((spill4132_0) ? 1 : 0);
        break forward_join_20;
    }
    if (!(spill4132_0)) {
        break forward_join_19;
    }
    ((moom.u9)(this)).d = ((net.minecraft.entity.Entity)(((net.minecraft.entity.passive.EntityVillager)(this.i)).a__tn()));
    return ((1) != 0);
    }
    forwardValue4132_20_0 = 0;
    }
    return ((forwardValue4132_20_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
