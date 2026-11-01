package com.moon.event;


public class PacketEvent extends com.moon.event.CancellableEvent {

private boolean c;

private moom.yK packet;

private static net.minecraft.entity.Entity[] f;

private static long g;

public PacketEvent(boolean p0, moom.yK p1) { super(); __sourceHandlerCall_c9594a92d7edd32d39dd(this, p0, p1); }

private static native <E extends Throwable> void __sourceHandlerCall_c9594a92d7edd32d39dd(com.moon.event.PacketEvent a0, boolean a1, moom.yK a2) throws E;
private static final class __SourceHandler_c9594a92d7edd32d39dd {

public static void f45(com.moon.event.PacketEvent receiver, boolean p0, moom.yK p1) throws Throwable {
    long local3_life1 = (__fieldRead45_0() ^ 32985723972869L);
    net.minecraft.entity.Entity[] __sourceSpill45_3 = __call45_2();
    __directSuperInit45_4(receiver);
    net.minecraft.entity.Entity[] local5_life5 = __sourceSpill45_3;
    __fieldWrite45_6(receiver, p0);
    __fieldWrite45_7(receiver, p1);
    if ((local5_life5 != null)) {
        __call45_8(new java.lang.String[5]);
    }
    return;
}
private static native long __fieldRead45_0();
private static native net.minecraft.entity.Entity[] __call45_2();
private static native void __directSuperInit45_4(com.moon.event.PacketEvent a0);
private static native void __fieldWrite45_6(com.moon.event.PacketEvent a0, boolean a1);
private static native void __fieldWrite45_7(com.moon.event.PacketEvent a0, moom.yK a1);
private static native void __call45_8(java.lang.String[] a0);

}


static {
g = ((long)(((moom._a)(moom._c.a(((long)(6099058073582956776L)), ((long)(-6469854968131198820L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(203759521060331L)))));
    if ((com.moon.event.PacketEvent.a() != null)) {
        com.moon.event.PacketEvent.a(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[1])));
    }
}


public boolean b__sourceReturn_aae029aa0a() {
return ((((this.c) ? 1 : 0)) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static net.minecraft.entity.Entity[] a__sourceReturn_95e22b2e1a() {
return com.moon.event.PacketEvent.f;
}


public static void a(net.minecraft.entity.Entity[] p0) {
f = ((net.minecraft.entity.Entity[])(p0));
    return;
}


public com.moon.event.PacketEvent setPacket(moom.yK p0) {
this.packet = ((moom.yK)(p0));
    return this;
}


public moom.yK getPacket() {
return this.packet;
}

}
