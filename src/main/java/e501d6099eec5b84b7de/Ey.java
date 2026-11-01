package moom;


public class Ey extends net.minecraft.world.WorldServer {

private static long ak;

public static moom.EK al;

private static long db;

public Ey(moom.Bl p0, net.minecraft.world.storage.ISaveHandler p1, net.minecraft.world.storage.WorldInfo p2, int p3, moom.A9 p4) { super((moom.Bl)null, (net.minecraft.world.storage.ISaveHandler)null, (net.minecraft.world.storage.WorldInfo)null, 0, (moom.A9)null); __sourceHandlerCall_a38334bec72ceeee4de8(this, p0, p1, p2, p3, p4); }

private static native <E extends Throwable> void __sourceHandlerCall_a38334bec72ceeee4de8(moom.Ey a0, moom.Bl a1, net.minecraft.world.storage.ISaveHandler a2, net.minecraft.world.storage.WorldInfo a3, int a4, moom.A9 a5) throws E;
private static final class __SourceHandler_a38334bec72ceeee4de8 {

public static void f546(moom.Ey receiver, moom.Bl p0, net.minecraft.world.storage.ISaveHandler p1, net.minecraft.world.storage.WorldInfo p2, int p3, moom.A9 p4) throws Throwable {
    long local6_life1 = (__fieldRead546_0() ^ 40122289208513L);
    java.lang.String[] __sourceSpill546_3 = __call546_2();
    __directSuperInit546_4(receiver, p0, p1, p2, p3, p4);
    java.lang.String[] local8_life5 = __sourceSpill546_3;
    __call546_8(__fieldRead546_6(receiver), __fieldRead546_7());
    if ((__call546_9() != null)) {
        __call546_10(new java.lang.String[3]);
    }
    return;
}
private static native long __fieldRead546_0();
private static native java.lang.String[] __call546_2();
private static native void __directSuperInit546_4(moom.Ey a0, moom.Bl a1, net.minecraft.world.storage.ISaveHandler a2, net.minecraft.world.storage.WorldInfo a3, int a4, moom.A9 a5);
private static native net.minecraft.world.storage.WorldInfo __fieldRead546_6(moom.Ey a0);
private static native moom.EK __fieldRead546_7();
private static native void __call546_8(net.minecraft.world.storage.WorldInfo a0, moom.EK a1);
private static native java.lang.String[] __call546_9();
private static native void __call546_10(java.lang.String[] a0);

}


static {
moom.Ey.db = (moom._c.a(-7893958159560173311L, -8090200781438745228L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(191385427193986L);
    moom.Ey.ak = ((long) (("North Carolina").hashCode()));
    moom.Ey.al = (new moom.EK(moom.Ey.ak, net.minecraft.world.WorldSettings$GameType.SURVIVAL, true, false, net.minecraft.world.WorldType.b)).a__EK();
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
