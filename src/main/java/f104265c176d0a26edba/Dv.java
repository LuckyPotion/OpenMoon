package moom;


public class Dv extends net.minecraft.util.MovementInput {

private final net.minecraft.client.settings.GameSettings e;

private static final long f;

public Dv(net.minecraft.client.settings.GameSettings p0) {
super();
    this.e = p0;
}


static {
f = (moom._c.a(-6081738216568492624L, 2616905236254442796L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(12697005707538L);
}


public void a() {
int forwardValue1772_29_0;
    int forwardValue1772_42_0;
    int forwardValue1772_55_0;
    int forwardValue1772_78_0;
    boolean spill1772_0;
    boolean spill1772_1;
    long life1_3;
    int life3_11;
    com.moon.event.ActionEvent life4_107;
    forward_join_109: {
    forward_join_101: {
    forward_join_78: {
    forward_join_64: {
    forward_join_55: {
    forward_join_51: {
    forward_join_42: {
    forward_join_38: {
    forward_join_29: {
    forward_join_25: {
    life1_3 = (moom.Dv.f ^ 137946563270210L);
    ((moom.Dv)(this)).a = ((float)(0x0.0p0f));
    spill1772_0 = moom.DS.c__Boolean();
    ((moom.Dv)(this)).b = ((float)(0x0.0p0f));
    life3_11 = ((spill1772_0) ? 1 : 0);
    spill1772_1 = ((moom.pz)(((net.minecraft.client.settings.GameSettings)(this.e)).al)).a__Boolean();
    if (!((life3_11 != 0))) {
        forwardValue1772_29_0 = ((spill1772_1) ? 1 : 0);
        break forward_join_29;
    }
    if (!(spill1772_1)) {
        break forward_join_25;
    }
    moom.Dv __stackOp1772_9_0 = this;
    ((moom.Dv)(__stackOp1772_9_0)).b = ((float)((((moom.Dv)(__stackOp1772_9_0)).b + 0x1.0p0f)));
    }
    forwardValue1772_29_0 = ((((moom.pz)(((net.minecraft.client.settings.GameSettings)(this.e)).an)).a__Boolean()) ? 1 : 0);
    }
    if (!((life3_11 != 0))) {
        forwardValue1772_42_0 = forwardValue1772_29_0;
        break forward_join_42;
    }
    if (!((forwardValue1772_29_0 != 0))) {
        break forward_join_38;
    }
    moom.Dv __stackOp1772_16_0 = this;
    ((moom.Dv)(__stackOp1772_16_0)).b = ((float)((((moom.Dv)(__stackOp1772_16_0)).b - 0x1.0p0f)));
    }
    forwardValue1772_42_0 = ((((moom.pz)(((net.minecraft.client.settings.GameSettings)(this.e)).am)).a__Boolean()) ? 1 : 0);
    }
    if (!((life3_11 != 0))) {
        forwardValue1772_55_0 = forwardValue1772_42_0;
        break forward_join_55;
    }
    if (!((forwardValue1772_42_0 != 0))) {
        break forward_join_51;
    }
    moom.Dv __stackOp1772_23_0 = this;
    ((moom.Dv)(__stackOp1772_23_0)).a = ((float)((((moom.Dv)(__stackOp1772_23_0)).a + 0x1.0p0f)));
    }
    forwardValue1772_55_0 = ((((moom.pz)(((net.minecraft.client.settings.GameSettings)(this.e)).ao)).a__Boolean()) ? 1 : 0);
    }
    if (!((life3_11 != 0))) {
        forwardValue1772_78_0 = forwardValue1772_55_0;
        break forward_join_78;
    }
    if (!((forwardValue1772_55_0 != 0))) {
        break forward_join_64;
    }
    moom.Dv __stackOp1772_30_0 = this;
    ((moom.Dv)(__stackOp1772_30_0)).a = ((float)((((moom.Dv)(__stackOp1772_30_0)).a - 0x1.0p0f)));
    }
    ((moom.Dv)(this)).c = ((boolean)(((moom.pz)(((net.minecraft.client.settings.GameSettings)(this.e)).ap)).a__Boolean()));
    ((moom.Dv)(this)).d = ((boolean)(((moom.pz)(((net.minecraft.client.settings.GameSettings)(this.e)).aq)).a__Boolean()));
    forwardValue1772_78_0 = ((((moom.Dv)(this)).d) ? 1 : 0);
    }
    if (!((forwardValue1772_78_0 != 0))) {
        break forward_join_109;
    }
    life4_107 = new com.moon.event.ActionEvent(com.moon.event.ActionType.SNEAKING);
    ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(life4_107)));
    if (!((life3_11 != 0))) {
        break forward_join_101;
    }
    if (!((!((com.moon.event.ActionEvent)(life4_107)).isCancelled()))) {
        break forward_join_109;
    }
    ((moom.Dv)(this)).a = ((float)(((float) (((double) ((moom.Dv)(this)).a) * 0x1.3333333333333p-2d))));
    }
    ((moom.Dv)(this)).b = ((float)(((float) (((double) ((moom.Dv)(this)).b) * 0x1.3333333333333p-2d))));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
