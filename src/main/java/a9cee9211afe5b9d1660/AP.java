package moom;


public class AP implements moom.yK<moom.AN> {

private long a;

private static net.minecraft.entity.Entity[] b;

private static long c;

public AP() {
super();
}

private static native <E extends Throwable> void __sourceHandlerCall_9b26767d3dadc541b7ab(moom.AP a0, long a1) throws E;
private static final class __SourceHandler_9b26767d3dadc541b7ab {

public static void f510(moom.AP receiver, long p0) throws Throwable {
    long local3_life1 = (__fieldRead510_0() ^ 122606212326059L);
    net.minecraft.entity.Entity[] __sourceSpill510_3 = __call510_2();
    __directSuperInit510_4(receiver);
    net.minecraft.entity.Entity[] local5_life5 = __sourceSpill510_3;
    __fieldWrite510_6(receiver, p0);
    if ((local5_life5 != null)) {
        __call510_7(new java.lang.String[1]);
    }
    return;
}
private static native long __fieldRead510_0();
private static native net.minecraft.entity.Entity[] __call510_2();
private static native void __directSuperInit510_4(moom.AP a0);
private static native void __fieldWrite510_6(moom.AP a0, long a1);
private static native void __call510_7(java.lang.String[] a0);

}


public AP(long p0) { super(); __sourceHandlerCall_9b26767d3dadc541b7ab(this, p0); }


static {
c = ((long)(((moom._a)(moom._c.a(((long)(9101038393892652421L)), ((long)(-8190253732197200508L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(274584748903718L)))));
    if ((moom.AP.b() != null)) {
        moom.AP.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[1])));
    }
}


public static net.minecraft.entity.Entity[] b() {
return moom.AP.b;
}


public static void b(net.minecraft.entity.Entity[] p0) {
b = ((net.minecraft.entity.Entity[])(p0));
    return;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).writeLong(((long)(this.a)));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.a = ((long)(((net.minecraft.network.PacketBuffer)(p0)).readLong()));
    return;
}


public void a(moom.AN p0) {
((moom.AN)(p0)).a(((moom.AP)(this)));
    return;
}


public long a() {
return this.a;
}

}
