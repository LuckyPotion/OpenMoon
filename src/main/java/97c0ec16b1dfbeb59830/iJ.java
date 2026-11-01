package moom;


public class iJ {

public net.minecraft.client.main.GameConfiguration$UserInformation a;

public net.minecraft.client.main.GameConfiguration$DisplayInformation b;

public net.minecraft.client.main.GameConfiguration$FolderInformation c;

public net.minecraft.client.main.GameConfiguration$GameInformation d;

public net.minecraft.client.main.GameConfiguration$ServerInformation e;

private static java.lang.String[] f;

private static long g;

public iJ(net.minecraft.client.main.GameConfiguration$UserInformation p0, net.minecraft.client.main.GameConfiguration$DisplayInformation p1, net.minecraft.client.main.GameConfiguration$FolderInformation p2, net.minecraft.client.main.GameConfiguration$GameInformation p3, net.minecraft.client.main.GameConfiguration$ServerInformation p4) { super(); __sourceHandlerCall_eb42a3ea91db351facc7(this, p0, p1, p2, p3, p4); }

private static native <E extends Throwable> void __sourceHandlerCall_eb42a3ea91db351facc7(moom.iJ a0, net.minecraft.client.main.GameConfiguration$UserInformation a1, net.minecraft.client.main.GameConfiguration$DisplayInformation a2, net.minecraft.client.main.GameConfiguration$FolderInformation a3, net.minecraft.client.main.GameConfiguration$GameInformation a4, net.minecraft.client.main.GameConfiguration$ServerInformation a5) throws E;
private static final class __SourceHandler_eb42a3ea91db351facc7 {

public static void f741(moom.iJ receiver, net.minecraft.client.main.GameConfiguration$UserInformation p0, net.minecraft.client.main.GameConfiguration$DisplayInformation p1, net.minecraft.client.main.GameConfiguration$FolderInformation p2, net.minecraft.client.main.GameConfiguration$GameInformation p3, net.minecraft.client.main.GameConfiguration$ServerInformation p4) throws Throwable {
    long local6_life1 = (__fieldRead741_0() ^ 57250576290209L);
    __directSuperInit741_2(receiver);
    __fieldWrite741_3(receiver, p0);
    __fieldWrite741_4(receiver, p1);
    java.lang.String[] __sourceSpill741_7 = __call741_5();
    __fieldWrite741_6(receiver, p2);
    __fieldWrite741_8(receiver, p3);
    __fieldWrite741_9(receiver, p4);
    java.lang.String[] local8_life10 = __sourceSpill741_7;
    if ((__call741_11() != null)) {
        __call741_12(new java.lang.String[3]);
    }
    return;
}
private static native long __fieldRead741_0();
private static native void __directSuperInit741_2(moom.iJ a0);
private static native void __fieldWrite741_3(moom.iJ a0, net.minecraft.client.main.GameConfiguration$UserInformation a1);
private static native void __fieldWrite741_4(moom.iJ a0, net.minecraft.client.main.GameConfiguration$DisplayInformation a1);
private static native java.lang.String[] __call741_5();
private static native void __fieldWrite741_6(moom.iJ a0, net.minecraft.client.main.GameConfiguration$FolderInformation a1);
private static native void __fieldWrite741_8(moom.iJ a0, net.minecraft.client.main.GameConfiguration$GameInformation a1);
private static native void __fieldWrite741_9(moom.iJ a0, net.minecraft.client.main.GameConfiguration$ServerInformation a1);
private static native java.lang.String[] __call741_11();
private static native void __call741_12(java.lang.String[] a0);

}


static {
g = ((long)(((moom._a)(moom._c.a(((long)(8225898249992503204L)), ((long)(-945263865524392680L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(182768541264353L)))));
    if ((moom.iJ.b() == null)) {
        moom.iJ.b(((java.lang.String[])(new java.lang.String[4])));
    }
}


public static java.lang.String[] b() {
return moom.iJ.f;
}


public static void b(java.lang.String[] p0) {
f = ((java.lang.String[])(p0));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
