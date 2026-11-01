package com.moon;


public abstract class f0 {

protected static final net.minecraft.client.Minecraft a;

protected com.moon.module.impl.KillAura b;

private static final long f;

public f0() {
super();
}


static {
f = (moom._c.a(-6442335984151246203L, -1228572579045228216L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(117906577776381L);
    a = net.minecraft.client.Minecraft.a__fM();
}


public abstract void b();

protected void e() {
int local1 = ((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.f0.a)).W)).at)).b();
    moom.pz.a(((int)(local1)), ((boolean)(true)));
    return;
}


public abstract void c();

protected void f() {
int local1 = ((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.f0.a)).W)).at)).b();
    moom.pz.a(((int)(local1)), ((boolean)(false)));
    return;
}


public abstract void d();

public com.moon.module.impl.KillAura a() {
return this.b;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public com.moon.f0 a(com.moon.module.impl.KillAura p0) {
this.b = ((com.moon.module.impl.KillAura)(p0));
    return this;
}


public abstract void a(com.moon.event.MoveEvent p0);

public abstract void a__Void();

public boolean a__Boolean() {
net.minecraft.client.entity.EntityPlayerSP forwardValue83_13_0;
    net.minecraft.item.ItemStack forwardValue83_20_0;
    int forwardValue83_26_0;
    int forwardValue83_28_0;
    net.minecraft.client.entity.EntityPlayerSP spill83_0;
    net.minecraft.item.ItemStack spill83_1;
    int spill83_2;
    long life1_3;
    int life3_5;
    forward_join_28: {
    forward_join_27: {
    forward_join_26: {
    forward_join_20: {
    forward_join_13: {
    life1_3 = (com.moon.f0.f ^ 64362998240422L);
    life3_5 = ((net.minecraft.entity.EntityLiving.W()) ? 1 : 0);
    spill83_0 = ((net.minecraft.client.Minecraft)(com.moon.f0.a)).K;
    if (!((life3_5 == 0))) {
        forwardValue83_13_0 = spill83_0;
        break forward_join_13;
    }
    if (!((spill83_0 != null))) {
        break forward_join_27;
    }
    forwardValue83_13_0 = ((net.minecraft.client.Minecraft)(com.moon.f0.a)).K;
    }
    spill83_1 = ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue83_13_0)).a__xW();
    if (!((life3_5 == 0))) {
        forwardValue83_20_0 = spill83_1;
        break forward_join_20;
    }
    if (!((spill83_1 != null))) {
        break forward_join_27;
    }
    forwardValue83_20_0 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.f0.a)).K)).a__xW();
    }
    spill83_2 = ((((net.minecraft.item.ItemStack)(forwardValue83_20_0)).a__wQ() instanceof moom.xP) ? 1 : 0);
    if (!((life3_5 == 0))) {
        forwardValue83_26_0 = spill83_2;
        break forward_join_26;
    }
    if (!((spill83_2 != 0))) {
        break forward_join_27;
    }
    forwardValue83_26_0 = 1;
    }
    forwardValue83_28_0 = forwardValue83_26_0;
    break forward_join_28;
    }
    forwardValue83_28_0 = 0;
    }
    return ((forwardValue83_28_0) != 0);
}


public abstract void a(com.moon.event.PacketEvent p0);
}
