package moom;


public class lP {

public static final moom.lP a;

public static float b;

public static float c;

public static float d;

public static float e;

public static float f;

public static float g;

public static float h;

public static float i;

public static float j;

public final moom.lV k;

public final moom.lV l;

public final moom.lV m;

public final moom.lV n;

public final moom.lV o;

public final moom.lV p;

public lP(moom.lV p0, moom.lV p1, moom.lV p2, moom.lV p3, moom.lV p4, moom.lV p5) {
super();
    this.k = p0;
    this.l = p1;
    this.m = p2;
    this.n = p3;
    this.o = p4;
    this.p = p5;
}


public lP(moom.lP p0) {
super();
    this.k = p0.k;
    this.l = p0.l;
    this.m = p0.m;
    this.n = p0.n;
    this.o = p0.o;
    this.p = p0.p;
}


private lP() {
this(moom.lV.a, moom.lV.a, moom.lV.a, moom.lV.a, moom.lV.a, moom.lV.a);
}


static {
a = ((moom.lP)(new moom.lP()));
    b = ((float)(0x0.0p0f));
    c = ((float)(0x0.0p0f));
    d = ((float)(0x0.0p0f));
    e = ((float)(0x0.0p0f));
    f = ((float)(0x0.0p0f));
    g = ((float)(0x0.0p0f));
    h = ((float)(0x0.0p0f));
    i = ((float)(0x0.0p0f));
    j = ((float)(0x0.0p0f));
}


public boolean a__Boolean(net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType p0) {
return ((((__sourceIntrinsic_booleanComparison(((moom.lV)(this.a(((net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType)(p0))))).equals(((java.lang.Object)(moom.lV.a)))) == 0) ? 1 : 0)) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public moom.lV a(net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType p0) {
switch ((net.minecraft.client.renderer.block.model.ItemCameraTransforms$1.a)[((net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType)(p0)).ordinal()]) {
case 1:
{
        return this.k;
    }
case 2:
{
        return this.l;
    }
case 3:
{
        return this.m;
    }
case 4:
{
        return this.n;
    }
case 5:
{
        return this.o;
    }
case 6:
{
        return this.p;
    }
default:
{
        return moom.lV.a;
    }
}
}


public void a__Void(net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType p0) {
moom.lV life2_3;
    life2_3 = this.a(((net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType)(p0)));
    if ((life2_3 != moom.lV.a)) {
        moom.kZ.b(((float)((((org.lwjgl.util.vector.Vector3f)(((moom.lV)(life2_3)).c)).x + moom.lP.b))), ((float)((((org.lwjgl.util.vector.Vector3f)(((moom.lV)(life2_3)).c)).y + moom.lP.c))), ((float)((((org.lwjgl.util.vector.Vector3f)(((moom.lV)(life2_3)).c)).z + moom.lP.d))));
        moom.kZ.b(((float)((((org.lwjgl.util.vector.Vector3f)(((moom.lV)(life2_3)).b)).y + moom.lP.f))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
        moom.kZ.b(((float)((((org.lwjgl.util.vector.Vector3f)(((moom.lV)(life2_3)).b)).x + moom.lP.e))), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
        moom.kZ.b(((float)((((org.lwjgl.util.vector.Vector3f)(((moom.lV)(life2_3)).b)).z + moom.lP.g))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
        moom.kZ.a(((float)((((org.lwjgl.util.vector.Vector3f)(((moom.lV)(life2_3)).d)).x + moom.lP.h))), ((float)((((org.lwjgl.util.vector.Vector3f)(((moom.lV)(life2_3)).d)).y + moom.lP.i))), ((float)((((org.lwjgl.util.vector.Vector3f)(((moom.lV)(life2_3)).d)).z + moom.lP.j))));
    }
    return;
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
