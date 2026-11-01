package moom;


public class nc extends moom.mU<moom.sN> {

private static final moom.DD C;

public nc(net.minecraft.client.renderer.entity.RenderManager p0, moom.iQ p1, float p2) {
super(p0, p1, p2);
    (this).a(new moom.nT(this));
}


static {
moom.nc.C = new moom.DD("textures/entity/cow/mooshroom.png");
}


protected moom.DD a(moom.sN p0) {
return moom.nc.C;
}


protected moom.DD a__sourceBridge_fb93f4301e(net.minecraft.entity.Entity p0) {
return ((moom.nc)(this)).a(((moom.sN)(((moom.sN)(p0)))));
}

}
