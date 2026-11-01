package net.minecraft.client.renderer.entity;


public class RenderVillager extends moom.mU<net.minecraft.entity.passive.EntityVillager> {

private static final moom.DD C;

private static final moom.DD D;

private static final moom.DD E;

private static final moom.DD F;

private static final moom.DD G;

private static final moom.DD H;

public RenderVillager(net.minecraft.client.renderer.entity.RenderManager p0) {
super(p0, new moom.jw(0x0.0p+0f), 0x1.0000000000000p-1f);
    (this).a(new moom.nK((this).a__jw().i));
}


static {
net.minecraft.client.renderer.entity.RenderVillager.C = new moom.DD("textures/entity/villager/villager.png");
    net.minecraft.client.renderer.entity.RenderVillager.D = new moom.DD("textures/entity/villager/farmer.png");
    net.minecraft.client.renderer.entity.RenderVillager.E = new moom.DD("textures/entity/villager/librarian.png");
    net.minecraft.client.renderer.entity.RenderVillager.F = new moom.DD("textures/entity/villager/priest.png");
    net.minecraft.client.renderer.entity.RenderVillager.G = new moom.DD("textures/entity/villager/smith.png");
    net.minecraft.client.renderer.entity.RenderVillager.H = new moom.DD("textures/entity/villager/butcher.png");
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected moom.DD a__sourceBridge_fb93f4301e(net.minecraft.entity.Entity p0) {
return ((net.minecraft.client.renderer.entity.RenderVillager)(this)).a__sourceReturn_5ea5cec086(((net.minecraft.entity.passive.EntityVillager)(((net.minecraft.entity.passive.EntityVillager)(p0)))));
}


public moom.iQ a__iQ() {
return ((net.minecraft.client.renderer.entity.RenderVillager)(this)).a__jw();
}


public moom.jw a__jw() {
return ((moom.jw)(super.a__iQ()));
}


protected moom.DD a__sourceReturn_5ea5cec086(net.minecraft.entity.passive.EntityVillager p0) {
switch (((net.minecraft.entity.passive.EntityVillager)(p0)).r__sourceReturn_8abf5c6871()) {
case 0:
{
        return net.minecraft.client.renderer.entity.RenderVillager.D;
    }
case 1:
{
        return net.minecraft.client.renderer.entity.RenderVillager.E;
    }
case 2:
{
        return net.minecraft.client.renderer.entity.RenderVillager.F;
    }
case 3:
{
        return net.minecraft.client.renderer.entity.RenderVillager.G;
    }
case 4:
{
        return net.minecraft.client.renderer.entity.RenderVillager.H;
    }
default:
{
        return net.minecraft.client.renderer.entity.RenderVillager.C;
    }
}
}


protected void a__sourceReturn_157d404fba(net.minecraft.entity.passive.EntityVillager p0, float p1) {
float local3 = 0x1.ep-1f;
    if ((((net.minecraft.entity.passive.EntityVillager)(p0)).q__sourceReturn_8abf5c6871() < 0)) {
        local3 = ((float) (((double) local3) * 0x1.0p-1d));
        this.c = ((float)(0x1.0p-2f));
    } else {
        this.c = ((float)(0x1.0p-1f));
    }
    moom.kZ.a(((float)(local3)), ((float)(local3)), ((float)(local3)));
    return;
}


protected void a__Void__sourceBridge_7f50c316df(net.minecraft.entity.EntityLivingBase p0, float p1) {
((net.minecraft.client.renderer.entity.RenderVillager)(this)).a__sourceReturn_157d404fba(((net.minecraft.entity.passive.EntityVillager)(((net.minecraft.entity.passive.EntityVillager)(p0)))), ((float)(p1)));
}


public void a__Void(net.minecraft.entity.passive.EntityVillager __bridgeParam0, float __bridgeParam1) { this.a__Void__sourceBridge_7f50c316df(((net.minecraft.entity.EntityLivingBase)(__bridgeParam0)), ((float)(__bridgeParam1))); }

public moom.DD a(net.minecraft.entity.passive.EntityVillager __bridgeParam0) { return ((moom.DD)(this.a__sourceBridge_fb93f4301e(((net.minecraft.entity.Entity)(__bridgeParam0))))); }
}
