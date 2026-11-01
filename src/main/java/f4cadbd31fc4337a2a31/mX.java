package moom;


public class mX extends moom.mW<net.minecraft.entity.monster.EntityPigZombie> {

private static final moom.DD F;

public mX(net.minecraft.client.renderer.entity.RenderManager p0) {
super(p0, new moom.iY(), 0x1.0000000000000p-1f, 0x1.0000000000000p+0f);
    (this).a(new moom.nQ(this));
    (this).a(new moom.nC(this, this));
}


static {
moom.mX.F = new moom.DD("textures/entity/zombie_pigman.png");
}


protected moom.DD a(net.minecraft.entity.monster.EntityPigZombie p0) {
return moom.mX.F;
}


protected moom.DD a__sourceBridge_fb93f4301e(net.minecraft.entity.Entity p0) {
return ((moom.mX)(this)).a(((net.minecraft.entity.monster.EntityPigZombie)(((net.minecraft.entity.monster.EntityPigZombie)(p0)))));
}


protected moom.DD a__sourceReturn_d8840f73cc_f4cadbd3(net.minecraft.entity.EntityLiving p0) {
return ((moom.mX)(this)).a(((net.minecraft.entity.monster.EntityPigZombie)(((net.minecraft.entity.monster.EntityPigZombie)(p0)))));
}

}
