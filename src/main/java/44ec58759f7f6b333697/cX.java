package com.moon;


public class cX {

private java.util.List<com.moon.cZ> a;

private static net.minecraft.entity.Entity[] b;

private static long c;

public cX() { super(); __sourceHandlerCall_961382d166349b87ea42(this); }

private static native <E extends Throwable> void __sourceHandlerCall_961382d166349b87ea42(com.moon.cX a0) throws E;
private static final class __SourceHandler_961382d166349b87ea42 {

public static void f21(com.moon.cX receiver) throws Throwable {
    long local1_life1 = (__fieldRead21_0() ^ 51061315234712L);
    net.minecraft.entity.Entity[] __sourceSpill21_3 = __call21_2();
    __directSuperInit21_4(receiver);
    __fieldWrite21_5(receiver, new java.util.ArrayList());
    __call21_9(__call21_7(__call21_6()), new com.moon.cY(__fieldRead21_8(receiver)));
    net.minecraft.entity.Entity[] local3_life10 = __sourceSpill21_3;
    if ((__call21_11() != null)) {
        __call21_12(new net.minecraft.entity.Entity[1]);
    }
    return;
}
private static native long __fieldRead21_0();
private static native net.minecraft.entity.Entity[] __call21_2();
private static native void __directSuperInit21_4(com.moon.cX a0);
private static native void __fieldWrite21_5(com.moon.cX a0, java.util.ArrayList a1);
private static native com.moon.runtime.ClientContext __call21_6();
private static native com.moon.events.EventBus __call21_7(com.moon.runtime.ClientContext a0);
private static native java.util.List __fieldRead21_8(com.moon.cX a0);
private static native void __call21_9(com.moon.events.EventBus a0, com.moon.cY a1);
private static native java.lang.String[] __call21_11();
private static native void __call21_12(net.minecraft.entity.Entity[] a0);

}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(-5642076835677690744L)), ((long)(1542455341727234208L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(250194757797305L)))));
    if ((com.moon.cX.b() == null)) {
        com.moon.cX.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[4])));
    }
}


public static void b(net.minecraft.entity.Entity[] p0) {
b = ((net.minecraft.entity.Entity[])(p0));
    return;
}


public static net.minecraft.entity.Entity[] b() {
return com.moon.cX.b;
}


public void b(com.moon.cZ p0) {
((java.util.List)(this.a)).remove(((java.lang.Object)(p0)));
    return;
}


public void a(com.moon.cZ p0) {
((java.util.List)(this.a)).add(((java.lang.Object)(p0)));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
