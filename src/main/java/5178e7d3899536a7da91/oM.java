package moom;


public class oM implements net.minecraft.client.resources.IResourceManagerReloadListener {

private static final moom.DD a;

public oM() {
super();
}


static {
a = new moom.DD("textures/colormap/foliage.png");
}


public void b(moom.oR p0) {
try {
        moom.Ef.a(((int[])(moom.ol.a(((moom.oR)(p0)), ((moom.DD)(moom.oM.a))))));
    } catch (java.io.IOException caught2) {
        
    }
    return;
}

}
