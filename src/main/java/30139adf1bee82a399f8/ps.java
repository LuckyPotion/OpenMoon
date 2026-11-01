package moom;


public class ps implements net.minecraft.client.resources.model.IBakedModel {

protected final java.util.List<moom.lC> a;

protected final java.util.List<java.util.List<moom.lC>> b;

protected final boolean c;

protected final boolean d;

protected final net.minecraft.client.renderer.texture.TextureAtlasSprite e;

protected final moom.lP f;

public ps(java.util.List<moom.lC> p0, java.util.List<java.util.List<moom.lC>> p1, boolean p2, boolean p3, net.minecraft.client.renderer.texture.TextureAtlasSprite p4, moom.lP p5) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
    this.d = p3;
    this.e = p4;
    this.f = p5;
}


public boolean b() {
return ((((this.d) ? 1 : 0)) != 0);
}


public boolean c() {
return ((0) != 0);
}


public java.util.List<moom.lC> a() {
return this.a;
}


public net.minecraft.client.renderer.texture.TextureAtlasSprite a__oh() {
return this.e;
}


public moom.lP a__lP() {
return this.f;
}


public java.util.List<moom.lC> a(moom.bs p0) {
return ((java.util.List)(((java.util.List)(this.b)).get(((int)(((moom.bs)(p0)).ordinal())))));
}


public boolean a__Boolean() {
return ((((this.c) ? 1 : 0)) != 0);
}

}
