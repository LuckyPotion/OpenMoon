package net.minecraft.client.renderer.entity;


public class RenderHorse extends moom.mU<net.minecraft.entity.passive.EntityHorse> {

private static final java.util.Map<java.lang.String, moom.DD> C;

private static final moom.DD D;

private static final moom.DD E;

private static final moom.DD F;

private static final moom.DD G;

private static final moom.DD H;

public RenderHorse(net.minecraft.client.renderer.entity.RenderManager p0, moom.jc p1, float p2) {
super(p0, p1, p2);
}


static {
net.minecraft.client.renderer.entity.RenderHorse.C = com.google.common.collect.Maps.newHashMap();
    net.minecraft.client.renderer.entity.RenderHorse.D = new moom.DD("textures/entity/horse/horse_white.png");
    net.minecraft.client.renderer.entity.RenderHorse.E = new moom.DD("textures/entity/horse/mule.png");
    net.minecraft.client.renderer.entity.RenderHorse.F = new moom.DD("textures/entity/horse/donkey.png");
    net.minecraft.client.renderer.entity.RenderHorse.G = new moom.DD("textures/entity/horse/horse_zombie.png");
    net.minecraft.client.renderer.entity.RenderHorse.H = new moom.DD("textures/entity/horse/horse_skeleton.png");
}


private moom.DD b__sourceReturn_918020a1e6(net.minecraft.entity.passive.EntityHorse p0) {
java.lang.String local2 = ((net.minecraft.entity.passive.EntityHorse)(p0)).k__sourceReturn_0e30dfc966();
    if ((!__sourceExactCall_e54cbc45cecfad(((net.minecraft.entity.passive.EntityHorse)(p0))))) {
        return null;
    }
    moom.DD local3 = ((moom.DD)(((java.util.Map)(net.minecraft.client.renderer.entity.RenderHorse.C)).get(((java.lang.Object)(local2)))));
    if ((local3 == null)) {
        local3 = new moom.DD(local2);
        __sourceExactCall_7652994f50d31f(((net.minecraft.client.renderer.texture.TextureManager)(__sourceExactCall_edccc8cbb3d810(((net.minecraft.client.Minecraft)(__sourceExactCall_89f0c5bcc4c2af()))))), ((moom.DD)(local3)), ((net.minecraft.client.renderer.texture.ITextureObject)(new moom.n5(__sourceExactCall_38ae87e3e7061a(((net.minecraft.entity.passive.EntityHorse)(p0)))))));
        ((java.util.Map)(net.minecraft.client.renderer.entity.RenderHorse.C)).put(((java.lang.Object)(local2)), ((java.lang.Object)(local3)));
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected moom.DD a__sourceBridge_fb93f4301e(net.minecraft.entity.Entity p0) {
return ((net.minecraft.client.renderer.entity.RenderHorse)(this)).a__sourceReturn_918020a1e6(((net.minecraft.entity.passive.EntityHorse)(((net.minecraft.entity.passive.EntityHorse)(p0)))));
}


protected void a__Void__sourceBridge_7f50c316df(net.minecraft.entity.EntityLivingBase p0, float p1) {
((net.minecraft.client.renderer.entity.RenderHorse)(this)).a__sourceReturn_eae211eece(((net.minecraft.entity.passive.EntityHorse)(((net.minecraft.entity.passive.EntityHorse)(p0)))), ((float)(p1)));
}


protected moom.DD a__sourceReturn_918020a1e6(net.minecraft.entity.passive.EntityHorse p0) {
if ((!__sourceExactCall_4a66e1b8886f42(((net.minecraft.entity.passive.EntityHorse)(p0))))) {
        switch (__sourceExactCall_8655ed875fc486(((net.minecraft.entity.passive.EntityHorse)(p0)))) {
case 0:
default:
{
        return net.minecraft.client.renderer.entity.RenderHorse.D;
    }
case 1:
{
        return net.minecraft.client.renderer.entity.RenderHorse.F;
    }
case 2:
{
        return net.minecraft.client.renderer.entity.RenderHorse.E;
    }
case 3:
{
        return net.minecraft.client.renderer.entity.RenderHorse.G;
    }
case 4:
{
        return net.minecraft.client.renderer.entity.RenderHorse.H;
    }
}
    }
    return __sourceExactCall_48cc67317b0a76(((net.minecraft.client.renderer.entity.RenderHorse)(this)), ((net.minecraft.entity.passive.EntityHorse)(p0)));
}


protected void a__sourceReturn_eae211eece(net.minecraft.entity.passive.EntityHorse p0, float p1) {
float local3 = 0x1.0p0f;
    int local4 = __sourceExactCall_8655ed875fc486(((net.minecraft.entity.passive.EntityHorse)(p0)));
    if ((local4 == 1)) {
        local3 = (local3 * 0x1.bd70a4p-1f);
    } else {
        if ((local4 == 2)) {
        local3 = (local3 * 0x1.d70a3ep-1f);
    }
    }
    __sourceExactCall_c87cfdff997c62(((float)(local3)), ((float)(local3)), ((float)(local3)));
    __sourceExactCall_22d37e5af79856(this, ((net.minecraft.entity.EntityLivingBase)(p0)), ((float)(p1)));
    return;
}


public void a__Void(net.minecraft.entity.passive.EntityHorse __bridgeParam0, float __bridgeParam1) { this.a__Void__sourceBridge_7f50c316df(((net.minecraft.entity.EntityLivingBase)(__bridgeParam0)), ((float)(__bridgeParam1))); }

public moom.DD a(net.minecraft.entity.passive.EntityHorse __bridgeParam0) { return ((moom.DD)(this.a__sourceBridge_fb93f4301e(((net.minecraft.entity.Entity)(__bridgeParam0))))); }

private static native moom.DD __sourceExactCall_48cc67317b0a76(net.minecraft.client.renderer.entity.RenderHorse p0, net.minecraft.entity.passive.EntityHorse p1);

private static native boolean __sourceExactCall_e54cbc45cecfad(net.minecraft.entity.passive.EntityHorse p0);
private static native boolean __sourceExactCall_7652994f50d31f(net.minecraft.client.renderer.texture.TextureManager p0, moom.DD p1, net.minecraft.client.renderer.texture.ITextureObject p2);
private static native net.minecraft.client.renderer.texture.TextureManager __sourceExactCall_edccc8cbb3d810(net.minecraft.client.Minecraft p0);
private static native net.minecraft.client.Minecraft __sourceExactCall_89f0c5bcc4c2af();
private static native java.lang.String[] __sourceExactCall_38ae87e3e7061a(net.minecraft.entity.passive.EntityHorse p0);
private static native boolean __sourceExactCall_4a66e1b8886f42(net.minecraft.entity.passive.EntityHorse p0);
private static native int __sourceExactCall_8655ed875fc486(net.minecraft.entity.passive.EntityHorse p0);
private static native void __sourceExactCall_c87cfdff997c62(float p0, float p1, float p2);
private static native void __sourceExactCall_22d37e5af79856(moom.mU p0, net.minecraft.entity.EntityLivingBase p1, float p2);
}
