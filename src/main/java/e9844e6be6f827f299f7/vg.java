package moom;


class vg extends moom.uc {

private final net.minecraft.entity.monster.EntityGhast c;

private static final long d;

public vg(net.minecraft.entity.monster.EntityGhast p0) {
super();
    this.c = p0;
    (this).a(1);
}


static {
d = (moom._c.a(-6244232718380712048L, -7920539606693642748L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(141215898933355L);
}


public boolean b__Boolean() {
return ((0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a__Void() {
java.lang.Object local1 = ((net.minecraft.entity.monster.EntityGhast)(this.c)).a__Random();
    double local2 = (((net.minecraft.entity.monster.EntityGhast)(this.c)).n + ((double) (((((java.util.Random)(local1)).nextFloat() * 0x1.0p1f) - 0x1.0p0f) * 0x1.0p4f)));
    double local4 = (((net.minecraft.entity.monster.EntityGhast)(this.c)).o + ((double) (((((java.util.Random)(local1)).nextFloat() * 0x1.0p1f) - 0x1.0p0f) * 0x1.0p4f)));
    double local6 = (((net.minecraft.entity.monster.EntityGhast)(this.c)).p + ((double) (((((java.util.Random)(local1)).nextFloat() * 0x1.0p1f) - 0x1.0p0f) * 0x1.0p4f)));
    ((net.minecraft.entity.ai.EntityMoveHelper)(((net.minecraft.entity.monster.EntityGhast)(this.c)).a__vu())).a(((double)(local2)), ((double)(local4)), ((double)(local6)), ((double)(0x1.0p0d)));
    return;
}


public boolean a__Boolean() {
net.minecraft.entity.ai.EntityMoveHelper forwardValue4318_18_0;
    int forwardValue4318_63_0;
    int forwardValue4318_65_0;
    net.minecraft.entity.Entity[] spill4318_0;
    net.minecraft.entity.ai.EntityMoveHelper spill4318_1;
    int spill4318_2;
    int spill4318_3;
    long life1_3;
    net.minecraft.entity.ai.EntityMoveHelper life4_8;
    net.minecraft.entity.Entity[] life3_9;
    double life5_28;
    double life7_35;
    double life9_42;
    double life11_54;
    forward_join_65: {
    forward_join_64: {
    forward_join_63: {
    forward_join_62: {
    forward_join_18: {
    forward_join_17: {
    life1_3 = (moom.vg.d ^ 77788792158260L);
    spill4318_0 = moom.vN.b();
    life4_8 = ((net.minecraft.entity.monster.EntityGhast)(this.c)).a__vu();
    life3_9 = spill4318_0;
    spill4318_1 = life4_8;
    if (!((life3_9 == null))) {
        forwardValue4318_18_0 = spill4318_1;
        break forward_join_18;
    }
    if (!((!((net.minecraft.entity.ai.EntityMoveHelper)(spill4318_1)).a__Boolean()))) {
        break forward_join_17;
    }
    return ((1) != 0);
    }
    forwardValue4318_18_0 = life4_8;
    }
    life5_28 = (((net.minecraft.entity.ai.EntityMoveHelper)(forwardValue4318_18_0)).b() - ((net.minecraft.entity.monster.EntityGhast)(this.c)).n);
    life7_35 = (((net.minecraft.entity.ai.EntityMoveHelper)(life4_8)).c() - ((net.minecraft.entity.monster.EntityGhast)(this.c)).o);
    life9_42 = (((net.minecraft.entity.ai.EntityMoveHelper)(life4_8)).d() - ((net.minecraft.entity.monster.EntityGhast)(this.c)).p);
    life11_54 = (((life5_28 * life5_28) + (life7_35 * life7_35)) + (life9_42 * life9_42));
    spill4318_2 = recovery.source.CarrierOps.dcmpg(((double)(life11_54)), ((double)(0x1.0p0d)));
    if (!((life3_9 == null))) {
        forwardValue4318_63_0 = spill4318_2;
        break forward_join_63;
    }
    if (!((spill4318_2 >= 0))) {
        break forward_join_62;
    }
    spill4318_3 = recovery.source.CarrierOps.dcmpl(((double)(life11_54)), ((double)(0x1.c2p11d)));
    if (!((life3_9 == null))) {
        forwardValue4318_63_0 = spill4318_3;
        break forward_join_63;
    }
    if (!((spill4318_3 > 0))) {
        break forward_join_64;
    }
    }
    forwardValue4318_63_0 = 1;
    }
    forwardValue4318_65_0 = forwardValue4318_63_0;
    break forward_join_65;
    }
    forwardValue4318_65_0 = 0;
    }
    return ((forwardValue4318_65_0) != 0);
}

}
