package moom;


public class ni extends moom.mU<net.minecraft.entity.monster.EntitySlime> {

private static final moom.DD C;

public ni(net.minecraft.client.renderer.entity.RenderManager p0, moom.iQ p1, float p2) {
super(p0, p1, p2);
    (this).a(new moom.nX(this));
}


static {
moom.ni.C = new moom.DD("textures/entity/slime/slime.png");
}


public void a__sourceBridge_e7b4e99e7e(net.minecraft.entity.EntityLivingBase p0, double p1, double p2, double p3, float p4, float p5) {
((moom.ni)(this)).a(((net.minecraft.entity.monster.EntitySlime)(((net.minecraft.entity.monster.EntitySlime)(p0)))), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
}


protected moom.DD a__sourceBridge_fb93f4301e(net.minecraft.entity.Entity p0) {
return ((moom.ni)(this)).a(((net.minecraft.entity.monster.EntitySlime)(((net.minecraft.entity.monster.EntitySlime)(p0)))));
}


public void a__sourceBridge_01f3c9ade5(net.minecraft.entity.Entity p0, double p1, double p2, double p3, float p4, float p5) {
((moom.ni)(this)).a(((net.minecraft.entity.monster.EntitySlime)(((net.minecraft.entity.monster.EntitySlime)(p0)))), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
}


protected void a__Void__sourceBridge_7f50c316df(net.minecraft.entity.EntityLivingBase p0, float p1) {
((moom.ni)(this)).a(((net.minecraft.entity.monster.EntitySlime)(((net.minecraft.entity.monster.EntitySlime)(p0)))), ((float)(p1)));
}


protected void a__sourceReturn_b8fcd691e9(net.minecraft.entity.monster.EntitySlime p0, float p1) {
float local3 = ((float) ((net.minecraft.entity.monster.EntitySlime)(p0)).o__sourceReturn_8abf5c6871());
    float local4 = ((((net.minecraft.entity.monster.EntitySlime)(p0)).bZ + ((((net.minecraft.entity.monster.EntitySlime)(p0)).bY - ((net.minecraft.entity.monster.EntitySlime)(p0)).bZ) * p1)) / ((local3 * 0x1.0p-1f) + 0x1.0p0f));
    float local5 = (0x1.0p0f / (local4 + 0x1.0p0f));
    moom.kZ.a(((float)((local5 * local3))), ((float)(((0x1.0p0f / local5) * local3))), ((float)((local5 * local3))));
    return;
}


protected moom.DD a__sourceReturn_54ab1617be(net.minecraft.entity.monster.EntitySlime p0) {
return moom.ni.C;
}


public void a__sourceBridge_36abde8bbd(net.minecraft.entity.EntityLiving p0, double p1, double p2, double p3, float p4, float p5) {
((moom.ni)(this)).a(((net.minecraft.entity.monster.EntitySlime)(((net.minecraft.entity.monster.EntitySlime)(p0)))), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
}


public void a(net.minecraft.entity.monster.EntitySlime p0, double p1, double p2, double p3, float p4, float p5) {
this.c = ((float)((0x1.0p-2f * ((float) ((net.minecraft.entity.monster.EntitySlime)(p0)).o__sourceReturn_8abf5c6871()))));
    super.a(((p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
    return;
}


public void a__Void(net.minecraft.entity.monster.EntitySlime __bridgeParam0, float __bridgeParam1) { this.a__Void__sourceBridge_7f50c316df(((net.minecraft.entity.EntityLivingBase)(__bridgeParam0)), ((float)(__bridgeParam1))); }

public moom.DD a(net.minecraft.entity.monster.EntitySlime __bridgeParam0) { return ((moom.DD)(this.a__sourceBridge_fb93f4301e(((net.minecraft.entity.Entity)(__bridgeParam0))))); }
}
