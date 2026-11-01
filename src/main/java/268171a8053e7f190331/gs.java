package com.moon;


public class gs {

private com.moon.n5 a;

private com.moon.n4 b;

private boolean c;

private static long d;

public gs() { super(); }


private static void __sourceConstructorBody_bdbe353e66536326(com.moon.gs receiver) throws Throwable {

long local1_life1 = (com.moon.gs.d ^ 22203421399967L);

    com.moon.gs.__sourceConstructorInit_bdbe353e66536326_0(((com.moon.gs)(receiver)));

    ((com.moon.gs)(receiver)).a = ((com.moon.n5)(new com.moon.n5(0x0.0p0d, 0x0.0p0d, 0x0.0p0d)));

    net.minecraft.entity.Entity[] __sourceSpill62_6 = com.moon.gt.b();

    ((com.moon.gs)(receiver)).b = ((com.moon.n4)(new com.moon.n4(0x0.0p0f, 0x0.0p0f)));

    net.minecraft.entity.Entity[] local3_life7 = __sourceSpill62_6;

    if ((local3_life7 != null)) {

        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[5])));

    }

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_bdbe353e66536326_0(com.moon.gs a0) throws E;

static {
com.moon.gs.d = (moom._c.a(3729803855810798781L, 6425142616532013165L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(75142797501222L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean() {
return ((((this.c) ? 1 : 0)) != 0);
}


public com.moon.n4 a() {
return this.b;
}


public com.moon.n5 a__n5() {
return this.a;
}


public void a(moom.yK<?> p0) {
int forwardValue297_31_0;
    int forwardValue297_46_0;
    moom.yK forwardValue297_48_0;
    net.minecraft.network.play.client.C0BPacketEntityAction$Action forwardValue297_64_0;
    net.minecraft.network.play.client.C0BPacketEntityAction$Action forwardValue297_64_1;
    int spill297_0;
    boolean spill297_1;
    moom.yK spill297_2;
    net.minecraft.network.play.client.C0BPacketEntityAction$Action spill297_3;
    net.minecraft.network.play.client.C0BPacketEntityAction$Action spill297_4;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    moom.y7 life5_16;
    moom.ze life6_67;
    forward_join_68: {
    forward_join_64: {
    forward_join_61: {
    forward_join_48: {
    forward_join_46: {
    forward_join_42: {
    forward_join_31: {
    forward_join_29: {
    life2_3 = (com.moon.gs.d ^ 126982588788237L);
    life4_5 = com.moon.gt.b();
    spill297_0 = ((p0 instanceof moom.y7) ? 1 : 0);
    if (!((life4_5 == null))) {
        forwardValue297_46_0 = spill297_0;
        break forward_join_46;
    }
    if (!((spill297_0 != 0))) {
        break forward_join_42;
    }
    life5_16 = ((moom.y7)(p0));
    spill297_1 = ((moom.y7)(life5_16)).b__Boolean();
    if (!((life4_5 == null))) {
        forwardValue297_31_0 = ((spill297_1) ? 1 : 0);
        break forward_join_31;
    }
    if (!(spill297_1)) {
        break forward_join_29;
    }
    ((com.moon.n5)(this.a)).a(((double)(((moom.y7)(life5_16)).d())), ((double)(((moom.y7)(life5_16)).e())), ((double)(((moom.y7)(life5_16)).f())));
    }
    forwardValue297_31_0 = ((((moom.y7)(life5_16)).g()) ? 1 : 0);
    }
    if (!((forwardValue297_31_0 != 0))) {
        break forward_join_68;
    }
    ((com.moon.n4)(this.b)).a(((float)(((moom.y7)(life5_16)).c__Float())), ((float)(((moom.y7)(life5_16)).d__Float())));
    if (!((life4_5 != null))) {
        break forward_join_68;
    }
    }
    spill297_2 = p0;
    if (!((life4_5 == null))) {
        forwardValue297_48_0 = spill297_2;
        break forward_join_48;
    }
    forwardValue297_46_0 = ((spill297_2 instanceof moom.ze) ? 1 : 0);
    }
    if (!((forwardValue297_46_0 != 0))) {
        break forward_join_68;
    }
    forwardValue297_48_0 = p0;
    }
    life6_67 = ((moom.ze)(forwardValue297_48_0));
    spill297_3 = ((moom.ze)(life6_67)).a__be();
    spill297_4 = net.minecraft.network.play.client.C0BPacketEntityAction$Action.START_SNEAKING;
    if (!((life4_5 == null))) {
        forwardValue297_64_0 = spill297_3;
        forwardValue297_64_1 = spill297_4;
        break forward_join_64;
    }
    if (!((spill297_3 == spill297_4))) {
        break forward_join_61;
    }
    this.c = ((boolean)(true));
    if (!((life4_5 != null))) {
        break forward_join_68;
    }
    }
    forwardValue297_64_0 = ((moom.ze)(life6_67)).a__be();
    forwardValue297_64_1 = net.minecraft.network.play.client.C0BPacketEntityAction$Action.STOP_SNEAKING;
    }
    if (!((forwardValue297_64_0 == forwardValue297_64_1))) {
        break forward_join_68;
    }
    this.c = ((boolean)(false));
    }
    return;
}


public void a(net.minecraft.client.entity.EntityPlayerSP p0) {
long local2 = (com.moon.gs.d ^ 73351846251948L);
    java.lang.Object[] local4 = com.moon.gt.b();
    if ((local4 == null)) {
        if ((p0 == null)) {
        return;
    }
        ((com.moon.n5)(this.a)).a(((double)(((net.minecraft.client.entity.EntityPlayerSP)(p0)).n)), ((double)(((net.minecraft.client.entity.EntityPlayerSP)(p0)).o)), ((double)(((net.minecraft.client.entity.EntityPlayerSP)(p0)).p)));
        ((com.moon.n4)(this.b)).a(((float)(((net.minecraft.client.entity.EntityPlayerSP)(p0)).w)), ((float)(((net.minecraft.client.entity.EntityPlayerSP)(p0)).x)));
        this.c = ((boolean)(((net.minecraft.client.entity.EntityPlayerSP)(p0)).t__Boolean()));
    }
    return;
}

}
