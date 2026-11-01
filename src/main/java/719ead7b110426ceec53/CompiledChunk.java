package net.minecraft.client.renderer.chunk;


public class CompiledChunk {

public static final net.minecraft.client.renderer.chunk.CompiledChunk a;

private final boolean[] b;

private final boolean[] c;

private boolean d;

private final java.util.List<net.minecraft.tileentity.TileEntity> e;

private moom.mr f;

private moom.ly g;

private final java.util.BitSet[] h;

public CompiledChunk() {
super();
    this.b = new boolean[(moom.mp.r).length];
    this.c = new boolean[(moom.mp.r).length];
    this.d = true;
    this.e = com.google.common.collect.Lists.newArrayList();
    this.f = new moom.mr();
    this.h = new java.util.BitSet[(moom.mp.r).length];
}


static {
net.minecraft.client.renderer.chunk.CompiledChunk.a = new net.minecraft.client.renderer.chunk.CompiledChunk$1();
}


public boolean b__Boolean(net.minecraft.util.EnumWorldBlockLayer p0) {
return (this.c)[((net.minecraft.util.EnumWorldBlockLayer)(p0)).ordinal()];
}


public void b(net.minecraft.util.EnumWorldBlockLayer p0) {
(this.c)[((net.minecraft.util.EnumWorldBlockLayer)(p0)).ordinal()] = true;
    return;
}


public void a(moom.mr p0) {
this.f = ((moom.mr)(p0));
    return;
}


public moom.ly a__ly() {
return this.g;
}


public void a(moom.ly p0) {
this.g = ((moom.ly)(p0));
    return;
}


public java.util.BitSet a(net.minecraft.util.EnumWorldBlockLayer p0) {
return (this.h)[((net.minecraft.util.EnumWorldBlockLayer)(p0)).ordinal()];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(net.minecraft.util.EnumWorldBlockLayer p0, java.util.BitSet p1) {
(this.h)[((net.minecraft.util.EnumWorldBlockLayer)(p0)).ordinal()] = p1;
    return;
}


public boolean a__Boolean() {
return ((((this.d) ? 1 : 0)) != 0);
}


protected void a__Void(net.minecraft.util.EnumWorldBlockLayer p0) {
this.d = ((boolean)(false));
    (this.b)[((net.minecraft.util.EnumWorldBlockLayer)(p0)).ordinal()] = true;
    return;
}


public boolean a__Boolean(net.minecraft.util.EnumWorldBlockLayer p0) {
return ((!(this.b)[((net.minecraft.util.EnumWorldBlockLayer)(p0)).ordinal()]) ? true : false);
}


public java.util.List<net.minecraft.tileentity.TileEntity> a() {
return this.e;
}


public void a(net.minecraft.tileentity.TileEntity p0) {
((java.util.List)(this.e)).add(((java.lang.Object)(p0)));
    return;
}


public boolean a(moom.bs p0, moom.bs p1) {
return (__sourceIntrinsic_booleanComparison((((moom.mr)(this.f)).a(((moom.bs)(p0)), ((moom.bs)(p1))))) != 0);
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
