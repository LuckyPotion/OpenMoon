package moom;


public class na extends moom.mU<net.minecraft.entity.monster.EntityIronGolem> {

private static final moom.DD C;

public na(net.minecraft.client.renderer.entity.RenderManager p0) {
super(p0, new moom.jd(), 0x1.0000000000000p-1f);
    (this).a(new moom.nS(this));
}


static {
moom.na.C = new moom.DD("textures/entity/iron_golem.png");
}


protected void a__sourceBridge_e093c470d2(net.minecraft.entity.EntityLivingBase p0, float p1, float p2, float p3) {
((moom.na)(this)).a(((net.minecraft.entity.monster.EntityIronGolem)(((net.minecraft.entity.monster.EntityIronGolem)(p0)))), ((float)(p1)), ((float)(p2)), ((float)(p3)));
}


protected moom.DD a__sourceBridge_fb93f4301e(net.minecraft.entity.Entity p0) {
return ((moom.na)(this)).a__sourceReturn_18b13f4ff6(((net.minecraft.entity.monster.EntityIronGolem)(((net.minecraft.entity.monster.EntityIronGolem)(p0)))));
}


protected moom.DD a__sourceReturn_18b13f4ff6(net.minecraft.entity.monster.EntityIronGolem p0) {
return moom.na.C;
}


protected void a(net.minecraft.entity.monster.EntityIronGolem p0, float p1, float p2, float p3) {
float life5_13;
    float life6_25;
    float life7_42;
    __sourceExactCall_f1b687094b3988(this, ((net.minecraft.entity.EntityLivingBase)(p0)), ((float)(p1)), ((float)(p2)), ((float)(p3)));
    if ((((double) ((net.minecraft.entity.monster.EntityIronGolem)(p0)).aV) >= 0x1.47ae147ae147bp-7d)) {
        life5_13 = 0x1.ap3f;
        life6_25 = ((((net.minecraft.entity.monster.EntityIronGolem)(p0)).aW - (((net.minecraft.entity.monster.EntityIronGolem)(p0)).aV * (0x1.0p0f - p3))) + 0x1.8p2f);
        life7_42 = ((java.lang.Math.abs(((float)(((life6_25 % life5_13) - (life5_13 * 0x1.0p-1f))))) - (life5_13 * 0x1.0p-2f)) / (life5_13 * 0x1.0p-2f));
        moom.kZ.b(((float)((0x1.ap2f * life7_42))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    }
    return;
}




public moom.DD a(net.minecraft.entity.monster.EntityIronGolem __bridgeParam0) { return ((moom.DD)(this.a__sourceBridge_fb93f4301e(((net.minecraft.entity.Entity)(__bridgeParam0))))); }

private static native void __sourceExactCall_f1b687094b3988(moom.mU p0, net.minecraft.entity.EntityLivingBase p1, float p2, float p3, float p4);
}
