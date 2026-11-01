package net.minecraft.util;


public class MouseFilter {

private float a;

private float b;

private float c;

private static final long d;

public MouseFilter() {
super();
}


static {
d = (moom._c.a(-6626303780753581988L, -3795623487577758100L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(63892329601013L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a() {
this.a = ((float)(0x0.0p0f));
    this.b = ((float)(0x0.0p0f));
    this.c = ((float)(0x0.0p0f));
    return;
}


public float a(float p0, float p1) {
int forwardValue5750_49_0;
    float forwardValue5750_59_0;
    float forwardValue5750_67_0;
    boolean spill5750_0;
    int spill5750_1;
    float spill5750_2;
    float spill5750_3;
    float spill5750_4;
    long life3_3;
    int life5_11;
    float life1_19;
    forward_join_67: {
    forward_join_60: {
    forward_join_59: {
    forward_join_57: {
    forward_join_49: {
    forward_join_44: {
    life3_3 = (net.minecraft.util.MouseFilter.d ^ 98758254183230L);
    spill5750_0 = moom.DS.c__Boolean();
    net.minecraft.util.MouseFilter __stackOp5750_2_0 = this;
    ((net.minecraft.util.MouseFilter)(__stackOp5750_2_0)).a = ((float)((((net.minecraft.util.MouseFilter)(__stackOp5750_2_0)).a + p0)));
    life5_11 = ((spill5750_0) ? 1 : 0);
    life1_19 = ((this.a - this.b) * p1);
    net.minecraft.util.MouseFilter __stackOp5750_8_0 = this;
    ((net.minecraft.util.MouseFilter)(__stackOp5750_8_0)).c = ((float)((((net.minecraft.util.MouseFilter)(__stackOp5750_8_0)).c + ((life1_19 - this.c) * 0x1.0p-1f))));
    spill5750_1 = recovery.source.CarrierOps.fcmpl(((float)(life1_19)), ((float)(0x0.0p0f)));
    if (!((life5_11 != 0))) {
        forwardValue5750_49_0 = spill5750_1;
        break forward_join_49;
    }
    if (!((spill5750_1 > 0))) {
        break forward_join_44;
    }
    spill5750_2 = life1_19;
    if (!((life5_11 != 0))) {
        forwardValue5750_59_0 = spill5750_2;
        break forward_join_59;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(spill5750_2)), ((float)(this.c))) <= 0))) {
        break forward_join_57;
    }
    }
    spill5750_3 = life1_19;
    if (!((life5_11 != 0))) {
        forwardValue5750_67_0 = spill5750_3;
        break forward_join_67;
    }
    forwardValue5750_49_0 = recovery.source.CarrierOps.fcmpg(((float)(spill5750_3)), ((float)(0x0.0p0f)));
    }
    if (!((forwardValue5750_49_0 < 0))) {
        break forward_join_60;
    }
    spill5750_4 = life1_19;
    if (!((life5_11 != 0))) {
        forwardValue5750_67_0 = spill5750_4;
        break forward_join_67;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(spill5750_4)), ((float)(this.c))) < 0))) {
        break forward_join_60;
    }
    }
    forwardValue5750_59_0 = this.c;
    }
    life1_19 = forwardValue5750_59_0;
    }
    net.minecraft.util.MouseFilter __stackOp5750_19_0 = this;
    ((net.minecraft.util.MouseFilter)(__stackOp5750_19_0)).b = ((float)((((net.minecraft.util.MouseFilter)(__stackOp5750_19_0)).b + life1_19)));
    forwardValue5750_67_0 = life1_19;
    }
    return forwardValue5750_67_0;
}

}
