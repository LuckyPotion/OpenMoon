package net.minecraft.client.renderer.entity.layers;


public class LayerWolfCollar implements net.minecraft.client.renderer.entity.layers.LayerRenderer<net.minecraft.entity.passive.EntityWolf> {

private static final moom.DD a;

private final net.minecraft.client.renderer.entity.RenderWolf b;

public LayerWolfCollar(net.minecraft.client.renderer.entity.RenderWolf p0) {
super();
    this.b = p0;
}


static {
net.minecraft.client.renderer.entity.layers.LayerWolfCollar.a = new moom.DD("textures/entity/wolf/wolf_collar.png");
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a__sourceBridge_a569c1ca8a(net.minecraft.entity.EntityLivingBase p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7) {
((net.minecraft.client.renderer.entity.layers.LayerWolfCollar)(this)).a(((net.minecraft.entity.passive.EntityWolf)(((net.minecraft.entity.passive.EntityWolf)(p0)))), ((float)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((float)(p6)), ((float)(p7)));
}


public boolean a__Boolean() {
return ((1) != 0);
}


public void a(net.minecraft.entity.passive.EntityWolf p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7) {
net.minecraft.item.EnumDyeColor life9_17;
    float[] life10_20;
    if (((net.minecraft.entity.passive.EntityWolf)(p0)).ae()) {
        if ((!((net.minecraft.entity.passive.EntityWolf)(p0)).v__Boolean())) {
        ((net.minecraft.client.renderer.entity.RenderWolf)(this.b)).b(((moom.DD)(net.minecraft.client.renderer.entity.layers.LayerWolfCollar.a)));
        life9_17 = net.minecraft.item.EnumDyeColor.b(((int)(((net.minecraft.item.EnumDyeColor)(((net.minecraft.entity.passive.EntityWolf)(p0)).a__sourceReturn_d841ada59b())).a())));
        life10_20 = net.minecraft.entity.passive.EntitySheep.a__ArrayFloat(((net.minecraft.item.EnumDyeColor)(life9_17)));
        if (moom.BU.ag()) {
        life10_20 = moom.Jl.a(((net.minecraft.item.EnumDyeColor)(life9_17)), ((float[])(life10_20)));
    }
        moom.kZ.c(((float)((life10_20)[0])), ((float)((life10_20)[1])), ((float)((life10_20)[2])));
        ((moom.iQ)(((net.minecraft.client.renderer.entity.RenderWolf)(this.b)).a__iQ())).a(((net.minecraft.entity.Entity)(p0)), ((float)(p1)), ((float)(p2)), ((float)(p4)), ((float)(p5)), ((float)(p6)), ((float)(p7)));
    }
    }
    return;
}



}
