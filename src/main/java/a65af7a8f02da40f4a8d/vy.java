package moom;


class vy extends net.minecraft.entity.ai.EntityMoveHelper {

private final net.minecraft.entity.passive.EntityRabbit g;

private static final long h;

public vy(net.minecraft.entity.passive.EntityRabbit p0) {
super(p0);
    this.g = p0;
}


static {
moom.vy.h = (moom._c.a(4332749342958690719L, -1273557005949590712L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(175768264807116L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void a__Void() {
moom.vy forwardValue4337_23_0;
    moom.vy spill4337_0;
    moom.vy spill4337_1;
    long life1_3;
    int life3_5;
    forward_join_23: {
    forward_join_22: {
    life1_3 = (moom.vy.h ^ 48999594246389L);
    life3_5 = moom.vR.b();
    spill4337_0 = this;
    if (!((life3_5 != 0))) {
        forwardValue4337_23_0 = spill4337_0;
        break forward_join_23;
    }
    if (!(((net.minecraft.entity.passive.EntityRabbit)(((moom.vy)(spill4337_0)).g)).A)) {
        break forward_join_22;
    }
    spill4337_1 = this;
    if (!((life3_5 != 0))) {
        forwardValue4337_23_0 = spill4337_1;
        break forward_join_23;
    }
    if (!((!((net.minecraft.entity.passive.EntityRabbit)(((moom.vy)(spill4337_1)).g)).ae()))) {
        break forward_join_22;
    }
    ((net.minecraft.entity.passive.EntityRabbit)(this.g)).a__sourceReturn_2c20cf5948(((double)(0x0.0p0d)));
    }
    forwardValue4337_23_0 = this;
    }
    __sourceIntrinsic_b82a5b29b709_call4337_8(forwardValue4337_23_0);
    return;
}


private static native <E extends Throwable> void __sourceIntrinsic_b82a5b29b709_call4337_8(moom.vy a0) throws E;
}
