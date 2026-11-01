package moom;


public class n5 extends moom.n2 {

private static org.apache.logging.log4j.Logger h;

public java.util.List<java.lang.String> i;

private moom.DD j;

public n5(java.lang.String[] p0) { super(); __sourceHandlerCall_5d3dddc49d0a19760d9e(this, p0); }


static {
moom.n5.h = org.apache.logging.log4j.LogManager.getLogger();
}

private static native <E extends Throwable> void __sourceHandlerCall_5d3dddc49d0a19760d9e(moom.n5 a0, java.lang.String[] a1) throws E;
private static final class __SourceHandler_5d3dddc49d0a19760d9e {

public static void f486(moom.n5 receiver, java.lang.String[] p0) throws Throwable {
    __directSuperInit486_0(receiver);
    __fieldWrite486_2(receiver, __call486_1(p0));
    if (((p0).length > 0)) {
        if (((p0)[0] != null)) {
        __fieldWrite486_3(receiver, new moom.DD((p0)[0]));
    } else {
        
    }
    } else {
        
    }
    return;
}
public static void h486_0(moom.Oo p0) throws Throwable {
    throw __call3048600_0(p0);
}
private static native void __directSuperInit486_0(moom.n5 a0) throws Throwable;
private static native java.util.ArrayList __call486_1(java.lang.String[] a0) throws Throwable;
private static native void __fieldWrite486_2(moom.n5 a0, java.util.ArrayList a1) throws Throwable;
private static native void __fieldWrite486_3(moom.n5 a0, moom.DD a1) throws Throwable;
private static native java.lang.Exception __call3048600_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_2c638e882f99e6fdeabc(moom.n5 a0, moom.oR a1) throws E;
private static final class __SourceHandler_2c638e882f99e6fdeabc {

public static void f465(moom.n5 receiver, moom.oR p0) throws Throwable {
    java.awt.image.BufferedImage life2_3;
    java.util.Iterator life3_7;
    java.lang.String life4_14;
    java.io.InputStream life5_24;
    java.awt.image.BufferedImage life6_27;
    forest_join_68: {
    forest_join_63: {
    forest_join_48: {
    __call465_0(receiver);
    life2_3 = null;
    life3_7 = __call465_2(__fieldRead465_1(receiver));
    forest_cycle_8: while (true) {
    forest_join_47: {
    forest_join_39: {
    if (!(__call465_3(life3_7))) {
        break forest_join_48;
    }
    life4_14 = __cast465_5(__call465_4(life3_7));
    if (!((life4_14 != null))) {
        break forest_join_47;
    }
    life5_24 = __call465_7(__call465_6(p0, new moom.DD(life4_14)));
    life6_27 = __call465_8(life5_24);
    if (!((life2_3 == null))) {
        break forest_join_39;
    }
    life2_3 = new java.awt.image.BufferedImage(__call465_9(life6_27), __call465_10(life6_27), 2);
    }
    __call465_12(__call465_11(life2_3), life6_27, 0, 0, null);
    }
    continue forest_cycle_8;
    }
    }
    if (!(__call465_13())) {
        break forest_join_63;
    }
    __call465_17(__call465_14(receiver), life2_3, 0, 0, p0, __fieldRead465_15(receiver), __call465_16(receiver));
    break forest_join_68;
    }
    __call465_19(__call465_18(receiver), life2_3);
    }
    return;
}
public static void h465_0(java.io.IOException p0, java.util.Iterator p1) throws Throwable {
    java.io.IOException life1_2;
    life1_2 = p0;
    __call3046500_1(__fieldRead3046500_0(), "Couldn't load layered image", life1_2);
    return;
}
public static void h465_1(java.io.IOException p0) throws Throwable {
    throw __call3046501_0(p0);
}
private static native void __call465_0(moom.n5 a0) throws Throwable;
private static native java.util.List __fieldRead465_1(moom.n5 a0) throws Throwable;
private static native java.util.Iterator __call465_2(java.util.List a0) throws Throwable;
private static native boolean __call465_3(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call465_4(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast465_5(java.lang.Object a0) throws Throwable;
private static native net.minecraft.client.resources.IResource __call465_6(moom.oR a0, moom.DD a1) throws Throwable;
private static native java.io.InputStream __call465_7(net.minecraft.client.resources.IResource a0) throws Throwable;
private static native java.awt.image.BufferedImage __call465_8(java.io.InputStream a0) throws Throwable;
private static native int __call465_9(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __call465_10(java.awt.image.BufferedImage a0) throws Throwable;
private static native java.awt.Graphics __call465_11(java.awt.image.BufferedImage a0) throws Throwable;
private static native boolean __call465_12(java.awt.Graphics a0, java.awt.image.BufferedImage a1, int a2, int a3, java.lang.Object a4) throws Throwable;
private static native boolean __call465_13() throws Throwable;
private static native int __call465_14(moom.n5 a0) throws Throwable;
private static native moom.DD __fieldRead465_15(moom.n5 a0) throws Throwable;
private static native moom.MA __call465_16(moom.n5 a0) throws Throwable;
private static native int __call465_17(int a0, java.awt.image.BufferedImage a1, int a2, int a3, moom.oR a4, moom.DD a5, moom.MA a6) throws Throwable;
private static native int __call465_18(moom.n5 a0) throws Throwable;
private static native int __call465_19(int a0, java.awt.image.BufferedImage a1) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3046500_0() throws Throwable;
private static native void __call3046500_1(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.io.IOException a2) throws Throwable;
private static native java.lang.Exception __call3046501_0(java.io.IOException a0) throws Throwable;

}


public void a(moom.oR p0) throws java.io.IOException { __sourceHandlerCall_2c638e882f99e6fdeabc(this, p0); }


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}

}
