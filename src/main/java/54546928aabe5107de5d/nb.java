package moom;


public class nb extends moom.mU<moom.th> {

private static final moom.DD C;

public nb(net.minecraft.client.renderer.entity.RenderManager p0) {
super(p0, new moom.jf(), 0x1.0000000000000p-2f);
}


static {
moom.nb.C = new moom.DD("textures/entity/slime/magmacube.png");
}


protected void a__Void__sourceBridge_7f50c316df(net.minecraft.entity.EntityLivingBase p0, float p1) {
((moom.nb)(this)).a(((moom.th)(((moom.th)(p0)))), ((float)(p1)));
}


protected moom.DD a__sourceBridge_fb93f4301e(net.minecraft.entity.Entity p0) {
return ((moom.nb)(this)).a(((moom.th)(((moom.th)(p0)))));
}


protected moom.DD a__sourceReturn_60c738001b(moom.th p0) {
return moom.nb.C;
}


protected void a__sourceReturn_4deb730631(moom.th p0, float p1) {
int local3 = ((moom.th)(p0)).o__sourceReturn_8abf5c6871();
    float local4 = ((((moom.th)(p0)).bZ + ((((moom.th)(p0)).bY - ((moom.th)(p0)).bZ) * p1)) / ((((float) local3) * 0x1.0p-1f) + 0x1.0p0f));
    float local5 = (0x1.0p0f / (local4 + 0x1.0p0f));
    float local6 = ((float) local3);
    moom.kZ.a(((float)((local5 * local6))), ((float)(((0x1.0p0f / local5) * local6))), ((float)((local5 * local6))));
    return;
}


public void a__Void(moom.th __bridgeParam0, float __bridgeParam1) { this.a__Void__sourceBridge_7f50c316df(((net.minecraft.entity.EntityLivingBase)(__bridgeParam0)), ((float)(__bridgeParam1))); }

public moom.DD a(moom.th __bridgeParam0) { return ((moom.DD)(this.a__sourceBridge_fb93f4301e(((net.minecraft.entity.Entity)(__bridgeParam0))))); }
}
