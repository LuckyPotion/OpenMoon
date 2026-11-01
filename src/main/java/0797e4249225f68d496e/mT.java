package moom;


public class mT extends moom.mS<net.minecraft.entity.item.EntityArmorStand> {

public static final moom.DD B;

public mT(net.minecraft.client.renderer.entity.RenderManager p0) {
super(((net.minecraft.client.renderer.entity.RenderManager)(p0)), ((moom.iQ)(new moom.iV())), ((float)(0x0.0p0f)));
    moom.nA local2_life1 = new moom.nA(this, this);
    ((moom.mT)(this)).a(((net.minecraft.client.renderer.entity.layers.LayerRenderer)(local2_life1)));
    ((moom.mT)(this)).a(((net.minecraft.client.renderer.entity.layers.LayerRenderer)(new moom.nQ(this))));
    ((moom.mT)(this)).a(((net.minecraft.client.renderer.entity.layers.LayerRenderer)(new moom.nK(((moom.iV)(((moom.mT)(this)).a__iV())).i))));
    return;
}


static {
moom.mT.B = new moom.DD("textures/entity/armorstand/wood.png");
}


protected boolean b__sourceBridge_55fa5355bc(net.minecraft.entity.EntityLivingBase p0) {
return ((moom.mT)(this)).a__Boolean(((net.minecraft.entity.item.EntityArmorStand)(((net.minecraft.entity.item.EntityArmorStand)(p0)))));
}


public moom.iQ a__iQ() {
return ((moom.mT)(this)).a__iV();
}


protected moom.DD a__sourceBridge_fb93f4301e(net.minecraft.entity.Entity p0) {
return ((moom.mT)(this)).a__sourceReturn_2b22df594d(((net.minecraft.entity.item.EntityArmorStand)(((net.minecraft.entity.item.EntityArmorStand)(p0)))));
}


protected boolean a__Boolean__sourceBridge_13640a2b19(net.minecraft.entity.Entity p0) {
return ((moom.mT)(this)).a__Boolean(((net.minecraft.entity.item.EntityArmorStand)(((net.minecraft.entity.item.EntityArmorStand)(p0)))));
}


public moom.iV a__iV() {
return ((moom.iV)(super.a__iQ()));
}


protected void a(net.minecraft.entity.item.EntityArmorStand p0, float p1, float p2, float p3) {
moom.kZ.b(((float)((0x1.68p7f - p2))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    return;
}


protected boolean a__Boolean(net.minecraft.entity.item.EntityArmorStand p0) {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.entity.item.EntityArmorStand)(p0)).B())) != 0);
}


protected moom.DD a__sourceReturn_2b22df594d(net.minecraft.entity.item.EntityArmorStand p0) {
return moom.mT.B;
}


protected void a__sourceBridge_e093c470d2(net.minecraft.entity.EntityLivingBase p0, float p1, float p2, float p3) {
((moom.mT)(this)).a(((net.minecraft.entity.item.EntityArmorStand)(((net.minecraft.entity.item.EntityArmorStand)(p0)))), ((float)(p1)), ((float)(p2)), ((float)(p3)));
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);

public boolean b(net.minecraft.entity.item.EntityArmorStand __bridgeParam0) { return this.b__sourceBridge_55fa5355bc(((net.minecraft.entity.EntityLivingBase)(__bridgeParam0))); }

public moom.DD a(net.minecraft.entity.item.EntityArmorStand __bridgeParam0) { return ((moom.DD)(this.a__sourceBridge_fb93f4301e(((net.minecraft.entity.Entity)(__bridgeParam0))))); }
}
