package com.moon;


public abstract class hx {

protected static final net.minecraft.client.Minecraft a;

private com.moon.module.impl.TargetHud b;

private com.moon.module.impl.KillAura c;

protected float d;

protected float e;

private static final long p;

public hx() {
super();
}


static {
p = (moom._c.a(-2150379283936194791L, -2474194139950326524L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(256453002447860L);
    a = net.minecraft.client.Minecraft.a__fM();
}


protected float b() {
return ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.TargetHud)(this.b)).b())).getValue())))).floatValue();
}


public com.moon.hx b(float p0) {
this.e = ((float)(p0));
    return this;
}


public abstract void b__Void();

private void c__Void() {
com.moon.hx forwardValue398_12_0;
    com.moon.hx spill398_0;
    long life1_3;
    java.lang.String life3_5;
    forward_join_18: {
    forward_join_12: {
    life1_3 = (com.moon.hx.p ^ 1974897522194L);
    life3_5 = net.minecraft.command.CommandBase.b();
    spill398_0 = this;
    if (!((life3_5 != null))) {
        forwardValue398_12_0 = spill398_0;
        break forward_join_12;
    }
    if (!((((com.moon.hx)(spill398_0)).c == null))) {
        break forward_join_18;
    }
    forwardValue398_12_0 = this;
    }
    ((com.moon.hx)(forwardValue398_12_0)).c = ((com.moon.module.impl.KillAura)(((com.moon.module.impl.KillAura)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.KillAura.class)))))));
    }
    return;
}


public float c() {
return this.d;
}


public float d() {
return this.e;
}


public com.moon.hx a(float p0) {
this.d = ((float)(p0));
    return this;
}


public com.moon.hx a(com.moon.module.impl.TargetHud p0) {
this.b = ((com.moon.module.impl.TargetHud)(p0));
    return this;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public com.moon.hx a(com.moon.module.impl.KillAura p0) {
this.c = ((com.moon.module.impl.KillAura)(p0));
    return this;
}


protected net.minecraft.entity.player.EntityPlayer a__tn() {
com.moon.hx forwardValue397_18_0;
    net.minecraft.entity.EntityLivingBase forwardValue397_28_0;
    com.moon.hx spill397_0;
    net.minecraft.entity.EntityLivingBase spill397_1;
    long life1_3;
    java.lang.String life3_5;
    net.minecraft.entity.EntityLivingBase life4_26;
    net.minecraft.entity.player.EntityPlayer life5_40;
    forward_join_36: {
    forward_join_34: {
    forward_join_28: {
    forward_join_18: {
    forward_join_17: {
    life1_3 = (com.moon.hx.p ^ 16635643646249L);
    life3_5 = net.minecraft.command.CommandBase.b();
    spill397_0 = this;
    if (!((life3_5 != null))) {
        forwardValue397_18_0 = spill397_0;
        break forward_join_18;
    }
    ((com.moon.hx)(spill397_0)).c__Void();
    if (!((((((net.minecraft.client.Minecraft)(com.moon.hx.a)).P instanceof moom.gF) ? 1 : 0) != 0))) {
        break forward_join_17;
    }
    return ((net.minecraft.client.Minecraft)(com.moon.hx.a)).K;
    }
    forwardValue397_18_0 = this;
    }
    life4_26 = ((com.moon.gd)(((com.moon.module.impl.KillAura)(((com.moon.hx)(forwardValue397_18_0)).c)).a__gd())).a__sG();
    spill397_1 = life4_26;
    if (!((life3_5 != null))) {
        forwardValue397_28_0 = spill397_1;
        break forward_join_28;
    }
    if (!((((spill397_1 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0) != 0))) {
        break forward_join_34;
    }
    forwardValue397_28_0 = life4_26;
    }
    life5_40 = ((net.minecraft.entity.player.EntityPlayer)(forwardValue397_28_0));
    if (!((!((com.moon.module.impl.KillAura)(this.c)).isEnabled()))) {
        break forward_join_36;
    }
    }
    return null;
    }
    return life5_40;
}


protected float a() {
return ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.TargetHud)(this.b)).a__kZ())).getValue())))).floatValue();
}


public abstract void a(boolean p0);

public abstract void a__Void();

public void a(float p0, float p1, int p2, float p3, float p4, net.minecraft.entity.EntityLivingBase p5) {
long life7_3;
    float life10_31;
    float life11_34;
    float life12_37;
    float life13_40;
    float life14_43;
    net.minecraft.client.renderer.entity.RenderManager life15_90;
    java.lang.String life9_125;
    life7_3 = (com.moon.hx.p ^ 2048635913414L);
    moom.kZ.g();
    moom.kZ.B();
    moom.kZ.j();
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.fep7f)));
    moom.kZ.b(((float)(p0)), ((float)(p1)), ((float)(0x1.9p5f)));
    moom.kZ.a(((float)(((float) (-p2)))), ((float)(((float) p2))), ((float)(((float) p2))));
    moom.kZ.b(((float)(0x1.68p7f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    life10_31 = ((net.minecraft.entity.EntityLivingBase)(p5)).a2;
    life11_34 = ((net.minecraft.entity.EntityLivingBase)(p5)).w;
    life12_37 = ((net.minecraft.entity.EntityLivingBase)(p5)).x;
    life13_40 = ((net.minecraft.entity.EntityLivingBase)(p5)).a5;
    life14_43 = ((net.minecraft.entity.EntityLivingBase)(p5)).a4;
    moom.kZ.b(((float)(0x1.0ep7f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    moom.lt.b();
    moom.kZ.b(((float)(-0x1.0ep7f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    moom.kZ.b(((float)(((-((float) java.lang.Math.atan(((double)(((double) (p4 / 0x1.4p5f))))))) * 0x1.4p4f))), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    ((net.minecraft.entity.EntityLivingBase)(p5)).a2 = ((float)(p3));
    ((net.minecraft.entity.EntityLivingBase)(p5)).w = ((float)(p3));
    ((net.minecraft.entity.EntityLivingBase)(p5)).x = ((float)((-p4)));
    ((net.minecraft.entity.EntityLivingBase)(p5)).a4 = ((float)(p3));
    ((net.minecraft.entity.EntityLivingBase)(p5)).a5 = ((float)(p3));
    moom.kZ.b(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    life15_90 = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__nw();
    ((net.minecraft.client.renderer.entity.RenderManager)(life15_90)).a(((float)(0x1.68p7f)));
    ((net.minecraft.client.renderer.entity.RenderManager)(life15_90)).a__Void(((boolean)(false)));
    ((net.minecraft.client.renderer.entity.RenderManager)(life15_90)).a__Boolean(((net.minecraft.entity.Entity)(p5)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    ((net.minecraft.client.renderer.entity.RenderManager)(life15_90)).a__Void(((boolean)(true)));
    java.lang.String spill1327_0 = net.minecraft.command.CommandBase.b();
    ((net.minecraft.entity.EntityLivingBase)(p5)).a2 = ((float)(life10_31));
    ((net.minecraft.entity.EntityLivingBase)(p5)).w = ((float)(life11_34));
    ((net.minecraft.entity.EntityLivingBase)(p5)).x = ((float)(life12_37));
    ((net.minecraft.entity.EntityLivingBase)(p5)).a5 = ((float)(life13_40));
    ((net.minecraft.entity.EntityLivingBase)(p5)).a4 = ((float)(life14_43));
    life9_125 = spill1327_0;
    moom.kZ.C();
    moom.lt.a();
    moom.kZ.z();
    moom.kZ.g(((int)(net.minecraft.client.renderer.OpenGlHelper.r)));
    moom.kZ.v();
    moom.kZ.g(((int)(net.minecraft.client.renderer.OpenGlHelper.q)));
    if ((life9_125 == null)) {
        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[1])));
    }
    return;
}


public com.moon.module.impl.TargetHud a__l4() {
return this.b;
}


public com.moon.module.impl.KillAura a__lb() {
return this.c;
}

}
