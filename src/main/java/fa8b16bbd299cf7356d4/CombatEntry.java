package net.minecraft.util;


public class CombatEntry {

private final net.minecraft.util.DamageSource a;

private final int b;

private final float c;

private final float d;

private final java.lang.String e;

private final float f;

private static final long g;

public CombatEntry(net.minecraft.util.DamageSource p0, int p1, float p2, float p3, java.lang.String p4, float p5) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p3;
    this.d = p2;
    this.e = p4;
    this.f = p5;
}


static {
g = (moom._c.a(7363053338093672765L, 5399737563454536917L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(146823897243989L);
}


public float b() {
net.minecraft.util.CombatEntry forwardValue5724_15_0;
    float forwardValue5724_16_0;
    net.minecraft.util.CombatEntry spill5724_0;
    long life1_3;
    int life3_5;
    forward_join_16: {
    forward_join_15: {
    forward_join_14: {
    life1_3 = (net.minecraft.util.CombatEntry.g ^ 65875528979173L);
    life3_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill5724_0 = this;
    if (!((life3_5 == 0))) {
        forwardValue5724_15_0 = spill5724_0;
        break forward_join_15;
    }
    if (!((((net.minecraft.util.CombatEntry)(spill5724_0)).a == net.minecraft.util.DamageSource.j))) {
        break forward_join_14;
    }
    forwardValue5724_16_0 = 0x1.fffffep127f;
    break forward_join_16;
    }
    forwardValue5724_15_0 = this;
    }
    forwardValue5724_16_0 = ((net.minecraft.util.CombatEntry)(forwardValue5724_15_0)).f;
    }
    return forwardValue5724_16_0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.util.IChatComponent a__C5() {
net.minecraft.entity.Entity forwardValue5723_17_0;
    net.minecraft.util.IChatComponent forwardValue5723_18_0;
    net.minecraft.entity.Entity spill5723_0;
    long life1_3;
    int life3_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_14: {
    life1_3 = (net.minecraft.util.CombatEntry.g ^ 5382660590121L);
    life3_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill5723_0 = ((net.minecraft.util.DamageSource)(((net.minecraft.util.CombatEntry)(this)).a__CU())).b__r3();
    if (!((life3_5 != 0))) {
        forwardValue5723_17_0 = spill5723_0;
        break forward_join_17;
    }
    if (!((spill5723_0 == null))) {
        break forward_join_14;
    }
    forwardValue5723_18_0 = null;
    break forward_join_18;
    }
    forwardValue5723_17_0 = ((net.minecraft.util.DamageSource)(((net.minecraft.util.CombatEntry)(this)).a__CU())).b__r3();
    }
    forwardValue5723_18_0 = ((net.minecraft.entity.Entity)(forwardValue5723_17_0)).a__C5();
    }
    return forwardValue5723_18_0;
}


public net.minecraft.util.DamageSource a__CU() {
return this.a;
}


public float a() {
return this.c;
}


public boolean a__Boolean() {
return ((((((net.minecraft.util.DamageSource)(this.a)).b__r3() instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0)) != 0);
}


public java.lang.String a__String() {
return this.e;
}

}
