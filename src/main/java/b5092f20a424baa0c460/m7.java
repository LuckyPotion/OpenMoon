package moom;


public class m7 extends moom.mU<net.minecraft.entity.monster.EntityGhast> {

private static final moom.DD C;

private static final moom.DD D;

public m7(net.minecraft.client.renderer.entity.RenderManager p0) {
super(p0, new moom.ja(), 0x1.0000000000000p-1f);
}


static {
moom.m7.C = new moom.DD("textures/entity/ghast/ghast.png");
    moom.m7.D = new moom.DD("textures/entity/ghast/ghast_shooting.png");
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected moom.DD a__sourceBridge_fb93f4301e(net.minecraft.entity.Entity p0) {
return ((moom.m7)(this)).a__sourceReturn_210aed3d9c(((net.minecraft.entity.monster.EntityGhast)(((net.minecraft.entity.monster.EntityGhast)(p0)))));
}


protected void a__Void__sourceBridge_7f50c316df(net.minecraft.entity.EntityLivingBase p0, float p1) {
((moom.m7)(this)).a__sourceReturn_df4b0f1768(((net.minecraft.entity.monster.EntityGhast)(((net.minecraft.entity.monster.EntityGhast)(p0)))), ((float)(p1)));
}


protected void a__sourceReturn_df4b0f1768(net.minecraft.entity.monster.EntityGhast p0, float p1) {
float local3 = 0x1.0p0f;
    float local4 = ((0x1.0p3f + local3) / 0x1.0p1f);
    float local5 = ((0x1.0p3f + (0x1.0p0f / local3)) / 0x1.0p1f);
    moom.kZ.a(((float)(local5)), ((float)(local4)), ((float)(local5)));
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    return;
}


protected moom.DD a__sourceReturn_210aed3d9c(net.minecraft.entity.monster.EntityGhast p0) {
return ((__sourceIntrinsic_booleanComparison(((net.minecraft.entity.monster.EntityGhast)(p0)).Y()) != 0) ? moom.m7.D : moom.m7.C);
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);

public void a__Void(net.minecraft.entity.monster.EntityGhast __bridgeParam0, float __bridgeParam1) { this.a__Void__sourceBridge_7f50c316df(((net.minecraft.entity.EntityLivingBase)(__bridgeParam0)), ((float)(__bridgeParam1))); }

public moom.DD a(net.minecraft.entity.monster.EntityGhast __bridgeParam0) { return ((moom.DD)(this.a__sourceBridge_fb93f4301e(((net.minecraft.entity.Entity)(__bridgeParam0))))); }
}
