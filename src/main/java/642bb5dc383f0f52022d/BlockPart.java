package net.minecraft.client.renderer.block.model;


public class BlockPart {

public final org.lwjgl.util.vector.Vector3f a;

public final org.lwjgl.util.vector.Vector3f b;

public final java.util.Map<moom.bs, net.minecraft.client.renderer.block.model.BlockPartFace> c;

public final net.minecraft.client.renderer.block.model.BlockPartRotation d;

public final boolean e;

public BlockPart(org.lwjgl.util.vector.Vector3f p0, org.lwjgl.util.vector.Vector3f p1, java.util.Map<moom.bs, net.minecraft.client.renderer.block.model.BlockPartFace> p2, net.minecraft.client.renderer.block.model.BlockPartRotation p3, boolean p4) {
super();
    this.a = ((org.lwjgl.util.vector.Vector3f)(p0));
    this.b = ((org.lwjgl.util.vector.Vector3f)(p1));
    this.c = ((java.util.Map)(p2));
    this.d = ((net.minecraft.client.renderer.block.model.BlockPartRotation)(p3));
    this.e = ((boolean)(p4));
    this.a();
    return;
}


private void a() {
java.util.Iterator life1_4;
    java.util.Map.Entry life2_11;
    float[] life3_17;
    life1_4 = ((java.util.Set)(((java.util.Map)(this.c)).entrySet())).iterator();
    while (((java.util.Iterator)(life1_4)).hasNext()) {
        life2_11 = ((java.util.Map.Entry)(((java.util.Iterator)(life1_4)).next()));
        life3_17 = this.a(((moom.bs)(((moom.bs)(((java.util.Map.Entry)(life2_11)).getKey())))));
        ((moom.lE)(((net.minecraft.client.renderer.block.model.BlockPartFace)(((net.minecraft.client.renderer.block.model.BlockPartFace)(((java.util.Map.Entry)(life2_11)).getValue())))).e)).a(((float[])(life3_17)));
    }
    return;
}


private float[] a(moom.bs p0) {
float[] life2_31;
    switch ((net.minecraft.client.renderer.block.model.BlockPart$1.a)[((moom.bs)(p0)).ordinal()]) {
case 1:
case 2:
{
        life2_31 = new float[] {((org.lwjgl.util.vector.Vector3f)(this.a)).x, ((org.lwjgl.util.vector.Vector3f)(this.a)).z, ((org.lwjgl.util.vector.Vector3f)(this.b)).x, ((org.lwjgl.util.vector.Vector3f)(this.b)).z};
        break;
    }
case 3:
case 4:
{
        life2_31 = new float[] {((org.lwjgl.util.vector.Vector3f)(this.a)).x, (0x1.0p4f - ((org.lwjgl.util.vector.Vector3f)(this.b)).y), ((org.lwjgl.util.vector.Vector3f)(this.b)).x, (0x1.0p4f - ((org.lwjgl.util.vector.Vector3f)(this.a)).y)};
        break;
    }
case 5:
case 6:
{
        life2_31 = new float[] {((org.lwjgl.util.vector.Vector3f)(this.a)).z, (0x1.0p4f - ((org.lwjgl.util.vector.Vector3f)(this.b)).y), ((org.lwjgl.util.vector.Vector3f)(this.b)).z, (0x1.0p4f - ((org.lwjgl.util.vector.Vector3f)(this.a)).y)};
        break;
    }
default:
{
        throw new java.lang.NullPointerException();
    }
}
    return life2_31;
}

}
