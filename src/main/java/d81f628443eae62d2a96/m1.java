package moom;


public class m1 extends moom.mU<net.minecraft.entity.passive.EntityChicken> {

private static final moom.DD C;

public m1(net.minecraft.client.renderer.entity.RenderManager p0, moom.iQ p1, float p2) {
super(p0, p1, p2);
}


static {
moom.m1.C = new moom.DD("textures/entity/chicken.png");
}


protected float b__sourceBridge_ae86d2a76c(net.minecraft.entity.EntityLivingBase p0, float p1) {
return ((moom.m1)(this)).a(((net.minecraft.entity.passive.EntityChicken)(((net.minecraft.entity.passive.EntityChicken)(p0)))), ((float)(p1)));
}


protected float a__sourceReturn_1e548df708(net.minecraft.entity.passive.EntityChicken p0, float p1) {
float local3 = (((net.minecraft.entity.passive.EntityChicken)(p0)).cg + ((((net.minecraft.entity.passive.EntityChicken)(p0)).cd - ((net.minecraft.entity.passive.EntityChicken)(p0)).cg) * p1));
    float local4 = (((net.minecraft.entity.passive.EntityChicken)(p0)).cf + ((((net.minecraft.entity.passive.EntityChicken)(p0)).ce - ((net.minecraft.entity.passive.EntityChicken)(p0)).cf) * p1));
    return ((moom.Dr.a(((float)(local3))) + 0x1.0p0f) * local4);
}


protected moom.DD a__sourceBridge_fb93f4301e(net.minecraft.entity.Entity p0) {
return ((moom.m1)(this)).a(((net.minecraft.entity.passive.EntityChicken)(((net.minecraft.entity.passive.EntityChicken)(p0)))));
}


protected moom.DD a(net.minecraft.entity.passive.EntityChicken p0) { return ((moom.m1)(this)).a__sourceReturn_474c86a3de(p0); }

protected moom.DD a__sourceReturn_474c86a3de(net.minecraft.entity.passive.EntityChicken p0) {
return moom.m1.C;
}



}
