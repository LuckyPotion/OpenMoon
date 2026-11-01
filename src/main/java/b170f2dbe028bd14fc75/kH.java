package moom;


public class kH implements net.minecraft.world.IInteractionObject {

private java.lang.String a;

private net.minecraft.util.IChatComponent b;

private static java.lang.String[] c;

private static long d;

public kH(java.lang.String p0, net.minecraft.util.IChatComponent p1) { super(); __sourceHandlerCall_9ebc98592a4ffd1abf1a(this, p0, p1); }

private static native <E extends Throwable> void __sourceHandlerCall_9ebc98592a4ffd1abf1a(moom.kH a0, java.lang.String a1, net.minecraft.util.IChatComponent a2) throws E;
private static final class __SourceHandler_9ebc98592a4ffd1abf1a {

public static void f764(moom.kH receiver, java.lang.String p0, net.minecraft.util.IChatComponent p1) throws Throwable {
    long local3_life1 = (__fieldRead764_0() ^ 7580868196850L);
    java.lang.String[] __sourceSpill764_3 = __call764_2();
    __directSuperInit764_4(receiver);
    __fieldWrite764_5(receiver, p0);
    __fieldWrite764_6(receiver, p1);
    java.lang.String[] local5_life7 = __sourceSpill764_3;
    if ((__call764_8() != null)) {
        __call764_9(new java.lang.String[1]);
    }
    return;
}
private static native long __fieldRead764_0();
private static native java.lang.String[] __call764_2();
private static native void __directSuperInit764_4(moom.kH a0);
private static native void __fieldWrite764_5(moom.kH a0, java.lang.String a1);
private static native void __fieldWrite764_6(moom.kH a0, net.minecraft.util.IChatComponent a1);
private static native java.lang.String[] __call764_8();
private static native void __call764_9(java.lang.String[] a0);

}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(2765734562794165040L)), ((long)(-4070813525689300747L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(132488269160182L)))));
    if ((moom.kH.b() != null)) {
        moom.kH.b(((java.lang.String[])(new java.lang.String[1])));
    }
}


public static java.lang.String[] b() {
return moom.kH.c;
}


public static void b(java.lang.String[] p0) {
c = ((java.lang.String[])(p0));
    return;
}


public boolean e__Boolean() {
return ((1) != 0);
}


public java.lang.String c__String() {
return this.a;
}


private static java.lang.UnsupportedOperationException a(java.lang.UnsupportedOperationException p0) {
return p0;
}


public net.minecraft.util.IChatComponent a__C5() {
return this.b;
}


public java.lang.String a__String() {
return ((net.minecraft.util.IChatComponent)(this.b)).b();
}


public moom.v8 a(net.minecraft.entity.player.InventoryPlayer p0, net.minecraft.entity.player.EntityPlayer p1) {
throw new java.lang.UnsupportedOperationException();
}

}
