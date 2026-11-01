package com.moon.event;


public class EntityRenderEvent extends com.moon.event.CancellableEvent {

private net.minecraft.entity.EntityLivingBase entity;

private moom.iQ renderer;

private float f;

private float g;

private float h;

private float i;

private float j;

private float k;

public boolean l;

private static long m;

public EntityRenderEvent(net.minecraft.entity.EntityLivingBase p0, moom.iQ p1, float p2, float p3, float p4, float p5, float p6, float p7, boolean p8) { super(); __sourceHandlerCall_68c4fe397928dc8d7036(this, p0, p1, p2, p3, p4, p5, p6, p7, p8); }

private static native <E extends Throwable> void __sourceHandlerCall_68c4fe397928dc8d7036(com.moon.event.EntityRenderEvent a0, net.minecraft.entity.EntityLivingBase a1, moom.iQ a2, float a3, float a4, float a5, float a6, float a7, float a8, boolean a9) throws E;
private static final class __SourceHandler_68c4fe397928dc8d7036 {

public static void f43(com.moon.event.EntityRenderEvent receiver, net.minecraft.entity.EntityLivingBase p0, moom.iQ p1, float p2, float p3, float p4, float p5, float p6, float p7, boolean p8) throws Throwable {
    long local10_life1 = (__fieldRead43_0() ^ 37036134759502L);
    __directSuperInit43_2(receiver);
    net.minecraft.entity.Entity[] __sourceSpill43_5 = __call43_3();
    __fieldWrite43_4(receiver, p0);
    net.minecraft.entity.Entity[] local12_life6 = __sourceSpill43_5;
    __fieldWrite43_7(receiver, p1);
    __fieldWrite43_8(receiver, p2);
    __fieldWrite43_9(receiver, p3);
    __fieldWrite43_10(receiver, p4);
    __fieldWrite43_11(receiver, p5);
    __fieldWrite43_12(receiver, p6);
    __fieldWrite43_13(receiver, p7);
    __fieldWrite43_14(receiver, p8);
    if ((local12_life6 != null)) {
        __call43_15(new java.lang.String[5]);
    }
    return;
}
private static native long __fieldRead43_0();
private static native void __directSuperInit43_2(com.moon.event.EntityRenderEvent a0);
private static native net.minecraft.entity.Entity[] __call43_3();
private static native void __fieldWrite43_4(com.moon.event.EntityRenderEvent a0, net.minecraft.entity.EntityLivingBase a1);
private static native void __fieldWrite43_7(com.moon.event.EntityRenderEvent a0, moom.iQ a1);
private static native void __fieldWrite43_8(com.moon.event.EntityRenderEvent a0, float a1);
private static native void __fieldWrite43_9(com.moon.event.EntityRenderEvent a0, float a1);
private static native void __fieldWrite43_10(com.moon.event.EntityRenderEvent a0, float a1);
private static native void __fieldWrite43_11(com.moon.event.EntityRenderEvent a0, float a1);
private static native void __fieldWrite43_12(com.moon.event.EntityRenderEvent a0, float a1);
private static native void __fieldWrite43_13(com.moon.event.EntityRenderEvent a0, float a1);
private static native void __fieldWrite43_14(com.moon.event.EntityRenderEvent a0, boolean a1);
private static native void __call43_15(java.lang.String[] a0);

}


static {
com.moon.event.EntityRenderEvent.m = (moom._c.a(3454695835089315201L, -3198925080611711935L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(20296050522504L);
}


public float b__sourceReturn_bc607678b6() {
return this.g;
}


public boolean b__Boolean() {
return ((((this.l) ? 1 : 0)) != 0);
}


public float e() {
return this.j;
}


public float c() {
return this.h;
}


public float f() {
return this.k;
}


public float d() {
return this.i;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.entity.EntityLivingBase getEntity() {
return this.entity;
}


public float a__sourceReturn_bc607678b6() {
return this.f;
}


public moom.iQ getRenderer() {
return this.renderer;
}

}
