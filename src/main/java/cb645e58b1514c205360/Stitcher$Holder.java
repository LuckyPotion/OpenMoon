package net.minecraft.client.renderer.texture;


public class Stitcher$Holder implements java.lang.Comparable<net.minecraft.client.renderer.texture.Stitcher$Holder> {

private final net.minecraft.client.renderer.texture.TextureAtlasSprite a;

private final int b;

private final int c;

private final int d;

private boolean e;

private float f;

public Stitcher$Holder(net.minecraft.client.renderer.texture.TextureAtlasSprite p0, int p1) {
super();
    this.f = ((float)(0x1.0p0f));
    this.a = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0));
    this.b = ((int)(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0)).c__Int()));
    this.c = ((int)(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0)).d__Int()));
    this.d = ((int)(p1));
    this.e = ((boolean)__sourceIntrinsic_integerToBoolean((((__sourceExactCall_71a34fe8abd322(((int)(this.c)), ((int)(p1))) > __sourceExactCall_71a34fe8abd322(((int)(this.b)), ((int)(p1)))) ? 1 : 0))));
    return;
}


public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1837_2(this.b, this.c);
}


public int compareTo__sourceBridge_e47da4afb6(java.lang.Object p0) {
return ((net.minecraft.client.renderer.texture.Stitcher$Holder)(this)).a(((net.minecraft.client.renderer.texture.Stitcher$Holder)(((net.minecraft.client.renderer.texture.Stitcher$Holder)(p0)))));
}


public int b() {
return ((((this.e) ? 1 : 0) != 0) ? __sourceExactCall_71a34fe8abd322(((int)(((int) (((float) this.b) * this.f)))), ((int)(this.d))) : __sourceExactCall_71a34fe8abd322(((int)(((int) (((float) this.c) * this.f)))), ((int)(this.d))));
}


public int a(net.minecraft.client.renderer.texture.Stitcher$Holder p0) {
int local2;
    if ((((net.minecraft.client.renderer.texture.Stitcher$Holder)(this)).b() == ((net.minecraft.client.renderer.texture.Stitcher$Holder)(p0)).b())) {
        if ((((net.minecraft.client.renderer.texture.Stitcher$Holder)(this)).a() == ((net.minecraft.client.renderer.texture.Stitcher$Holder)(p0)).a())) {
        if ((((net.minecraft.client.renderer.texture.TextureAtlasSprite)(this.a)).a__String() == null)) {
        return ((((net.minecraft.client.renderer.texture.TextureAtlasSprite)(((net.minecraft.client.renderer.texture.Stitcher$Holder)(p0)).a)).a__String() == null) ? 0 : -1);
    }
        return ((java.lang.String)(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(this.a)).a__String())).compareTo(((java.lang.String)(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(((net.minecraft.client.renderer.texture.Stitcher$Holder)(p0)).a)).a__String())));
    }
        local2 = ((((net.minecraft.client.renderer.texture.Stitcher$Holder)(this)).a() < ((net.minecraft.client.renderer.texture.Stitcher$Holder)(p0)).a()) ? 1 : -1);
    } else {
        local2 = ((((net.minecraft.client.renderer.texture.Stitcher$Holder)(this)).b() < ((net.minecraft.client.renderer.texture.Stitcher$Holder)(p0)).b()) ? 1 : -1);
    }
    return local2;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(int p0) {
if ((this.b > p0)) {
        if ((this.c > p0)) {
        this.f = ((float)((((float) p0) / ((float) java.lang.Math.min(((int)(this.b)), ((int)(this.c)))))));
    }
    }
    return;
}


public net.minecraft.client.renderer.texture.TextureAtlasSprite a__oh() {
return this.a;
}


public int a() {
return ((((this.e) ? 1 : 0) != 0) ? __sourceExactCall_71a34fe8abd322(((int)(((int) (((float) this.c) * this.f)))), ((int)(this.d))) : __sourceExactCall_71a34fe8abd322(((int)(((int) (((float) this.b) * this.f)))), ((int)(this.d))));
}


public void a__Void() {
this.e = ((boolean)__sourceIntrinsic_integerToBoolean((((!this.e) ? 1 : 0))));
    return;
}


public boolean a__Boolean() {
return ((((this.e) ? 1 : 0)) != 0);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1837_2(int a0, int a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

public int compareTo(net.minecraft.client.renderer.texture.Stitcher$Holder __bridgeParam0) { return this.compareTo__sourceBridge_e47da4afb6(((java.lang.Object)(__bridgeParam0))); }

private static native int __sourceExactCall_71a34fe8abd322(int p0, int p1);
}
