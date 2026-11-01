package net.minecraft.client.renderer.entity.layers;


public class LayerSaddle implements net.minecraft.client.renderer.entity.layers.LayerRenderer<net.minecraft.entity.passive.EntityPig> {

private static final moom.DD a;

private final moom.ne b;

private final moom.jk c;

public LayerSaddle(moom.ne p0) {
super();
    this.c = new moom.jk(0x1.0000000000000p-1f);
    this.b = p0;
}


static {
net.minecraft.client.renderer.entity.layers.LayerSaddle.a = new moom.DD("textures/entity/pig/pig_saddle.png");
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a__sourceBridge_a569c1ca8a(net.minecraft.entity.EntityLivingBase p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7) {
((net.minecraft.client.renderer.entity.layers.LayerSaddle)(this)).a(((net.minecraft.entity.passive.EntityPig)(((net.minecraft.entity.passive.EntityPig)(p0)))), ((float)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((float)(p6)), ((float)(p7)));
}


public boolean a__Boolean() {
return ((0) != 0);
}


public void a(net.minecraft.entity.passive.EntityPig p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7) {
if ((__sourceIntrinsic_booleanComparison(((net.minecraft.entity.passive.EntityPig)(p0)).ae()) != 0)) {
        ((moom.ne)(this.b)).b(((moom.DD)(net.minecraft.client.renderer.entity.layers.LayerSaddle.a)));
        ((moom.jk)(this.c)).a(((moom.iQ)(((moom.ne)(this.b)).a__iQ())));
        ((moom.jk)(this.c)).a(((net.minecraft.entity.Entity)(p0)), ((float)(p1)), ((float)(p2)), ((float)(p4)), ((float)(p5)), ((float)(p6)), ((float)(p7)));
    }
    return;
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);


}
