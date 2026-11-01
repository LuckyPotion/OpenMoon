package net.minecraft.util;


public class Rotations {

protected final float a;

protected final float b;

protected final float c;

private static final long d;

public Rotations(float p0, float p1, float p2) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
}


public Rotations(net.minecraft.nbt.NBTTagList p0) {
super();
    this.a = (p0).a__Float(0);
    this.b = (p0).a__Float(1);
    this.c = (p0).a__Float(2);
}


static {
d = (moom._c.a(-9085106591383790459L, -1555183426584819268L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(191639938032965L);
}


public boolean equals(java.lang.Object p0) {
int forwardValue5751_17_0;
    int forwardValue5751_31_0;
    int forwardValue5751_39_0;
    int forwardValue5751_43_0;
    int forwardValue5751_45_0;
    int spill5751_0;
    int spill5751_1;
    long life2_3;
    int life4_5;
    net.minecraft.util.Rotations life5_16;
    forward_join_45: {
    forward_join_44: {
    forward_join_43: {
    forward_join_39: {
    forward_join_31: {
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life2_3 = (net.minecraft.util.Rotations.d ^ 90021795590169L);
    life4_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill5751_0 = ((p0 instanceof net.minecraft.util.Rotations) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue5751_17_0 = spill5751_0;
        break forward_join_17;
    }
    if (!((spill5751_0 != 0))) {
        break forward_join_16;
    }
    life5_16 = ((net.minecraft.util.Rotations)(p0));
    if (!((life4_5 == 0))) {
        break forward_join_18;
    }
    }
    forwardValue5751_17_0 = 0;
    }
    return ((forwardValue5751_17_0) != 0);
    }
    spill5751_1 = recovery.source.CarrierOps.fcmpl(((float)(this.a)), ((float)(((net.minecraft.util.Rotations)(life5_16)).a)));
    if (!((life4_5 != 0))) {
        forwardValue5751_31_0 = spill5751_1;
        break forward_join_31;
    }
    if (!((spill5751_1 == 0))) {
        break forward_join_44;
    }
    forwardValue5751_31_0 = recovery.source.CarrierOps.fcmpl(((float)(this.b)), ((float)(((net.minecraft.util.Rotations)(life5_16)).b)));
    }
    if (!((life4_5 != 0))) {
        forwardValue5751_39_0 = forwardValue5751_31_0;
        break forward_join_39;
    }
    if (!((forwardValue5751_31_0 == 0))) {
        break forward_join_44;
    }
    forwardValue5751_39_0 = recovery.source.CarrierOps.fcmpl(((float)(this.c)), ((float)(((net.minecraft.util.Rotations)(life5_16)).c)));
    }
    if (!((life4_5 != 0))) {
        forwardValue5751_43_0 = forwardValue5751_39_0;
        break forward_join_43;
    }
    if (!((forwardValue5751_39_0 == 0))) {
        break forward_join_44;
    }
    forwardValue5751_43_0 = 1;
    }
    forwardValue5751_45_0 = forwardValue5751_43_0;
    break forward_join_45;
    }
    forwardValue5751_45_0 = 0;
    }
    return ((forwardValue5751_45_0) != 0);
}


public float b() {
return this.b;
}


public float c() {
return this.c;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public float a() {
return this.a;
}


public net.minecraft.nbt.NBTTagList a__yz() {
net.minecraft.nbt.NBTTagList local1 = new net.minecraft.nbt.NBTTagList();
    ((net.minecraft.nbt.NBTTagList)(local1)).a(((net.minecraft.nbt.NBTBase)(new moom.yr(this.a))));
    ((net.minecraft.nbt.NBTTagList)(local1)).a(((net.minecraft.nbt.NBTBase)(new moom.yr(this.b))));
    ((net.minecraft.nbt.NBTTagList)(local1)).a(((net.minecraft.nbt.NBTBase)(new moom.yr(this.c))));
    return local1;
}

}
