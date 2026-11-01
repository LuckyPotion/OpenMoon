package moom;


public class vs extends net.minecraft.entity.ai.EntityJumpHelper {

private final net.minecraft.entity.passive.EntityRabbit c;

private boolean d;

private static final long e;

public vs(net.minecraft.entity.passive.EntityRabbit p0) {
super(p0);
    this.d = false;
    this.c = p0;
}


static {
e = (moom._c.a(343028532390451561L, -7779683738935176155L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(26767619050634L);
}


public void b() {
moom.vs forwardValue4332_16_0;
    moom.vs spill4332_0;
    long life1_3;
    int life3_5;
    forward_join_18: {
    forward_join_16: {
    life1_3 = (moom.vs.e ^ 44987974042645L);
    life3_5 = moom.vR.b();
    spill4332_0 = this;
    if (!((life3_5 != 0))) {
        forwardValue4332_16_0 = spill4332_0;
        break forward_join_16;
    }
    if (!(((moom.vs)(spill4332_0)).b)) {
        break forward_join_18;
    }
    ((net.minecraft.entity.passive.EntityRabbit)(this.c)).b(((net.minecraft.entity.passive.EntityRabbit$EnumMoveType)(net.minecraft.entity.passive.EntityRabbit$EnumMoveType.STEP)));
    forwardValue4332_16_0 = this;
    }
    ((moom.vs)(forwardValue4332_16_0)).b = ((boolean)(false));
    }
    return;
}


public boolean b__Boolean() {
return ((((this.d) ? 1 : 0)) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(boolean p0) {
this.d = ((boolean)(p0));
    return;
}


public boolean a__sourceReturn_aae029aa0a() {
return ((((((moom.vs)(this)).b) ? 1 : 0)) != 0);
}

}
