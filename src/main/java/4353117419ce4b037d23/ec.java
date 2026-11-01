package com.moon;


public class ec extends com.moon.event.CancellableEvent {

private net.minecraft.entity.Entity c;

private boolean e;

private boolean f;

private static long g;

public ec(net.minecraft.entity.Entity p0, boolean p1, boolean p2) { super(); __sourceHandlerCall_0286ad8cb37caa2481b5(this, p0, p1, p2); }

private static native <E extends Throwable> void __sourceHandlerCall_0286ad8cb37caa2481b5(com.moon.ec a0, net.minecraft.entity.Entity a1, boolean a2, boolean a3) throws E;
private static final class __SourceHandler_0286ad8cb37caa2481b5 {

public static void f39(com.moon.ec receiver, net.minecraft.entity.Entity p0, boolean p1, boolean p2) throws Throwable {
    long local4_life1 = (__fieldRead39_0() ^ 79926427122801L);
    __directSuperInit39_2(receiver);
    net.minecraft.entity.Entity[] __sourceSpill39_5 = __call39_3();
    __fieldWrite39_4(receiver, p0);
    net.minecraft.entity.Entity[] local6_life6 = __sourceSpill39_5;
    __fieldWrite39_7(receiver, p1);
    __fieldWrite39_8(receiver, p2);
    if ((__call39_9() != null)) {
        __call39_10(new net.minecraft.entity.Entity[4]);
    }
    return;
}
private static native long __fieldRead39_0();
private static native void __directSuperInit39_2(com.moon.ec a0);
private static native net.minecraft.entity.Entity[] __call39_3();
private static native void __fieldWrite39_4(com.moon.ec a0, net.minecraft.entity.Entity a1);
private static native void __fieldWrite39_7(com.moon.ec a0, boolean a1);
private static native void __fieldWrite39_8(com.moon.ec a0, boolean a1);
private static native java.lang.String[] __call39_9();
private static native void __call39_10(net.minecraft.entity.Entity[] a0);

}


static {
com.moon.ec.g = (moom._c.a(-6395606962713813283L, -8812813316536315627L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(139697560292764L);
}


public com.moon.ec b(boolean p0) {
this.f = ((boolean)(p0));
    return this;
}


public boolean b__sourceReturn_aae029aa0a() {
return ((((this.e) ? 1 : 0)) != 0);
}


public boolean c() {
return ((((this.f) ? 1 : 0)) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.entity.Entity a__sourceReturn_09c029d8c3() {
return this.c;
}


public com.moon.ec a(boolean p0) {
this.e = ((boolean)(p0));
    return this;
}

}
