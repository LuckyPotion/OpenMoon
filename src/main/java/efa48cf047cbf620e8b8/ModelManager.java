package net.minecraft.client.resources.model;


public class ModelManager implements net.minecraft.client.resources.IResourceManagerReloadListener {

private net.minecraft.util.IRegistry<moom.DE, net.minecraft.client.resources.model.IBakedModel> a;

private final net.minecraft.client.renderer.texture.TextureMap b;

private final net.minecraft.client.renderer.BlockModelShapes c;

private net.minecraft.client.resources.model.IBakedModel d;

private static final long e;

public ModelManager(net.minecraft.client.renderer.texture.TextureMap p0) {
super();
    this.b = p0;
    this.c = new net.minecraft.client.renderer.BlockModelShapes(this);
}


static {
e = (moom._c.a(2442222997693841480L, -8340839801180802628L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(196663037518770L);
}


public void b(moom.oR p0) {
net.minecraft.client.resources.model.ModelBakery local2 = new net.minecraft.client.resources.model.ModelBakery(p0, this.b, this.c);
    this.a = ((net.minecraft.util.IRegistry)(((net.minecraft.client.resources.model.ModelBakery)(local2)).a__C_()));
    this.d = ((net.minecraft.client.resources.model.IBakedModel)(((net.minecraft.client.resources.model.IBakedModel)(((net.minecraft.util.IRegistry)(this.a)).a__Object(((java.lang.Object)(net.minecraft.client.resources.model.ModelBakery.c)))))));
    ((net.minecraft.client.renderer.BlockModelShapes)(this.c)).a__Void();
    return;
}


public net.minecraft.client.renderer.BlockModelShapes a() {
return this.c;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.client.renderer.texture.TextureMap a__n8() {
return this.b;
}


public net.minecraft.client.resources.model.IBakedModel a__pp() {
return this.d;
}


public net.minecraft.client.resources.model.IBakedModel a(moom.DE p0) {
java.lang.Object forwardValue4854_17_0;
    net.minecraft.client.resources.model.IBakedModel forwardValue4854_25_0;
    net.minecraft.client.resources.model.IBakedModel forwardValue4854_27_0;
    moom.DE spill4854_0;
    net.minecraft.client.resources.model.IBakedModel spill4854_1;
    long life2_3;
    int life4_5;
    net.minecraft.client.resources.model.IBakedModel life5_23;
    forward_join_27: {
    forward_join_26: {
    forward_join_25: {
    forward_join_17: {
    forward_join_13: {
    life2_3 = (net.minecraft.client.resources.model.ModelManager.e ^ 131886549799898L);
    life4_5 = __sourceExactCall_5c5d6a17b3677f();
    spill4854_0 = p0;
    if (!((life4_5 == 0))) {
        forwardValue4854_17_0 = spill4854_0;
        break forward_join_17;
    }
    if (!((spill4854_0 == null))) {
        break forward_join_13;
    }
    return this.d;
    }
    forwardValue4854_17_0 = ((net.minecraft.util.IRegistry)(this.a)).a__Object(((java.lang.Object)(p0)));
    }
    life5_23 = ((net.minecraft.client.resources.model.IBakedModel)(forwardValue4854_17_0));
    spill4854_1 = life5_23;
    if (!((life4_5 == 0))) {
        forwardValue4854_25_0 = spill4854_1;
        break forward_join_25;
    }
    if (!((spill4854_1 == null))) {
        break forward_join_26;
    }
    forwardValue4854_25_0 = this.d;
    }
    forwardValue4854_27_0 = forwardValue4854_25_0;
    break forward_join_27;
    }
    forwardValue4854_27_0 = life5_23;
    }
    return forwardValue4854_27_0;
}


private static native int __sourceExactCall_5c5d6a17b3677f();
}
