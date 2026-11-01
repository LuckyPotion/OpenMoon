package net.minecraft.client.renderer.entity;


public class RenderRabbit extends moom.mU<net.minecraft.entity.passive.EntityRabbit> {

private static final moom.DD C;

private static final moom.DD D;

private static final moom.DD E;

private static final moom.DD F;

private static final moom.DD G;

private static final moom.DD H;

private static final moom.DD I;

private static final moom.DD J;

public RenderRabbit(net.minecraft.client.renderer.entity.RenderManager p0, moom.iQ p1, float p2) {
super(p0, p1, p2);
}


static {
net.minecraft.client.renderer.entity.RenderRabbit.C = new moom.DD("textures/entity/rabbit/brown.png");
    net.minecraft.client.renderer.entity.RenderRabbit.D = new moom.DD("textures/entity/rabbit/white.png");
    net.minecraft.client.renderer.entity.RenderRabbit.E = new moom.DD("textures/entity/rabbit/black.png");
    net.minecraft.client.renderer.entity.RenderRabbit.F = new moom.DD("textures/entity/rabbit/gold.png");
    net.minecraft.client.renderer.entity.RenderRabbit.G = new moom.DD("textures/entity/rabbit/salt.png");
    net.minecraft.client.renderer.entity.RenderRabbit.H = new moom.DD("textures/entity/rabbit/white_splotched.png");
    net.minecraft.client.renderer.entity.RenderRabbit.I = new moom.DD("textures/entity/rabbit/toast.png");
    net.minecraft.client.renderer.entity.RenderRabbit.J = new moom.DD("textures/entity/rabbit/caerbannog.png");
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected moom.DD a__sourceBridge_fb93f4301e(net.minecraft.entity.Entity p0) {
return ((net.minecraft.client.renderer.entity.RenderRabbit)(this)).a__sourceReturn_2d18f1d3e6(((net.minecraft.entity.passive.EntityRabbit)(((net.minecraft.entity.passive.EntityRabbit)(p0)))));
}


protected moom.DD a__sourceReturn_2d18f1d3e6(net.minecraft.entity.passive.EntityRabbit p0) {
java.lang.String local2 = net.minecraft.util.EnumChatFormatting.b(((java.lang.String)(((net.minecraft.entity.passive.EntityRabbit)(p0)).a__String())));
    if ((local2 != null)) {
        if (((java.lang.String)(local2)).equals(((java.lang.Object)("Toast")))) {
        return net.minecraft.client.renderer.entity.RenderRabbit.I;
    }
    }
    switch (((net.minecraft.entity.passive.EntityRabbit)(p0)).t()) {
case 0:
default:
{
        return net.minecraft.client.renderer.entity.RenderRabbit.C;
    }
case 1:
{
        return net.minecraft.client.renderer.entity.RenderRabbit.D;
    }
case 2:
{
        return net.minecraft.client.renderer.entity.RenderRabbit.E;
    }
case 3:
{
        return net.minecraft.client.renderer.entity.RenderRabbit.H;
    }
case 4:
{
        return net.minecraft.client.renderer.entity.RenderRabbit.F;
    }
case 5:
{
        return net.minecraft.client.renderer.entity.RenderRabbit.G;
    }
case 99:
{
        return net.minecraft.client.renderer.entity.RenderRabbit.J;
    }
}
}


public moom.DD a(net.minecraft.entity.passive.EntityRabbit __bridgeParam0) { return ((moom.DD)(this.a__sourceBridge_fb93f4301e(((net.minecraft.entity.Entity)(__bridgeParam0))))); }
}
