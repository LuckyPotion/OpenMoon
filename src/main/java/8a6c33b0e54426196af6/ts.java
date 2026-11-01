package moom;


public class ts extends net.minecraft.entity.Entity {

public final moom.t5 aE;

public final java.lang.String aF;

private static final long bb;

public ts(moom.t5 p0, java.lang.String p1, float p2, float p3) {
super((p0).b__sourceReturn_818f27b2a7());
    (this).a__Void(p2, p3);
    this.aE = p0;
    this.aF = p1;
}


static {
bb = (moom._c.a(-2647441915112114814L, 7824929696699281312L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(150457855795824L);
}


protected void c(net.minecraft.nbt.NBTTagCompound p0) {
return;
}


protected void d(net.minecraft.nbt.NBTTagCompound p0) {
return;
}


protected void d__Void() {
return;
}


public boolean a__Boolean(net.minecraft.entity.Entity p0) {
moom.ts forwardValue4098_12_0;
    int forwardValue4098_18_0;
    moom.ts spill4098_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_15: {
    forward_join_12: {
    life2_3 = (moom.ts.bb ^ 128811435654811L);
    life4_5 = moom.vJ.b();
    spill4098_0 = this;
    if (!((life4_5 == null))) {
        forwardValue4098_12_0 = spill4098_0;
        break forward_join_12;
    }
    if (!((spill4098_0 != p0))) {
        break forward_join_15;
    }
    forwardValue4098_12_0 = this;
    }
    if (!((((moom.ts)(forwardValue4098_12_0)).aE == p0))) {
        break forward_join_17;
    }
    }
    forwardValue4098_18_0 = 1;
    break forward_join_18;
    }
    forwardValue4098_18_0 = 0;
    }
    return ((forwardValue4098_18_0) != 0);
}


public boolean a__Boolean(net.minecraft.util.DamageSource p0, float p1) {
int forwardValue4099_18_0;
    int forwardValue4099_22_0;
    int forwardValue4099_24_0;
    boolean spill4099_0;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    forward_join_18: {
    life3_3 = (moom.ts.bb ^ 103698778660825L);
    life5_5 = moom.vJ.b();
    spill4099_0 = ((moom.ts)(this)).a(((net.minecraft.util.DamageSource)(p0)));
    if (!((life5_5 == null))) {
        forwardValue4099_18_0 = ((spill4099_0) ? 1 : 0);
        break forward_join_18;
    }
    if (!((!spill4099_0))) {
        break forward_join_23;
    }
    forwardValue4099_18_0 = ((((moom.t5)(this.aE)).a(((moom.ts)(this)), ((net.minecraft.util.DamageSource)(p0)), ((float)(p1)))) ? 1 : 0);
    }
    if (!((life5_5 == null))) {
        forwardValue4099_22_0 = forwardValue4099_18_0;
        break forward_join_22;
    }
    if (!((forwardValue4099_18_0 != 0))) {
        break forward_join_23;
    }
    forwardValue4099_22_0 = 1;
    }
    forwardValue4099_24_0 = forwardValue4099_22_0;
    break forward_join_24;
    }
    forwardValue4099_24_0 = 0;
    }
    return ((forwardValue4099_24_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean m__Boolean() {
return ((1) != 0);
}

}
