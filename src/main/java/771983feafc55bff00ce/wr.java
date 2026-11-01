package moom;


public class wr extends moom.wq implements net.minecraft.world.ILockableContainer {

private java.lang.String f;

private java.util.Map<java.lang.Integer, java.lang.Integer> g;

private static long h;

public wr(java.lang.String p0, net.minecraft.util.IChatComponent p1, int p2) { super((net.minecraft.util.IChatComponent)null, 0); __sourceHandlerCall_ac6923196339c3fdf33b(this, p0, p1, p2); }

private static native <E extends Throwable> void __sourceHandlerCall_ac6923196339c3fdf33b(moom.wr a0, java.lang.String a1, net.minecraft.util.IChatComponent a2, int a3) throws E;
private static final class __SourceHandler_ac6923196339c3fdf33b {

public static void f844(moom.wr receiver, java.lang.String p0, net.minecraft.util.IChatComponent p1, int p2) throws Throwable {
    long local4_life1 = (__fieldRead844_0() ^ 14460256642071L);
    __directSuperInit844_2(receiver, p1, p2);
    java.lang.String[] __sourceSpill844_6 = __call844_3();
    __fieldWrite844_5(receiver, __call844_4());
    java.lang.String[] local6_life7 = __sourceSpill844_6;
    __fieldWrite844_8(receiver, p0);
    if ((local6_life7 != null)) {
        __call844_9(new java.lang.String[3]);
    }
    return;
}
private static native long __fieldRead844_0();
private static native void __directSuperInit844_2(moom.wr a0, net.minecraft.util.IChatComponent a1, int a2);
private static native java.lang.String[] __call844_3();
private static native java.util.HashMap __call844_4();
private static native void __fieldWrite844_5(moom.wr a0, java.util.HashMap a1);
private static native void __fieldWrite844_8(moom.wr a0, java.lang.String a1);
private static native void __call844_9(java.lang.String[] a0);

}


static {
moom.wr.h = (moom._c.a(965278990852754149L, -1686628553498405124L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(1043794368421L);
}


public java.lang.String c__String() {
return this.f;
}


public int d__Int() {
return ((java.util.Map)(this.g)).size();
}


public boolean d__Boolean() {
return ((0) != 0);
}


private static java.lang.UnsupportedOperationException a(java.lang.UnsupportedOperationException p0) {
return p0;
}


public moom.v8 a(net.minecraft.entity.player.InventoryPlayer p0, net.minecraft.entity.player.EntityPlayer p1) {
throw new java.lang.UnsupportedOperationException();
}


public int a__sourceReturn_0f7a48eca2(int p0) {
return ((java.lang.Integer)(((java.lang.Integer)(((java.util.Map)(this.g)).getOrDefault(((java.lang.Object)(java.lang.Integer.valueOf(((int)(p0))))), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(0)))))))))).intValue();
}


public void a__Void(int p0, int p1) {
((java.util.Map)(this.g)).put(((java.lang.Object)(java.lang.Integer.valueOf(((int)(p0))))), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(p1))))));
    return;
}


public void a(moom.Eq p0) {
return;
}


public moom.Eq a__Eq() {
return moom.Eq.a;
}

}
