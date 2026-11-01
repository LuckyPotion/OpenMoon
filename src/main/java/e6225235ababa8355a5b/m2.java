package moom;


public class m2 extends moom.mU<moom.sM> {

private static final moom.DD C;

public m2(net.minecraft.client.renderer.entity.RenderManager p0, moom.iQ p1, float p2) {
super(p0, p1, p2);
}


static {
moom.m2.C = new moom.DD("textures/entity/cow/cow.png");
}


protected moom.DD a(moom.sM p0) {
return moom.m2.C;
}


protected moom.DD a__sourceBridge_fb93f4301e(net.minecraft.entity.Entity p0) {
return ((moom.m2)(this)).a(((moom.sM)(((moom.sM)(p0)))));
}

}
