package moom;


public class n6 extends moom.n2 {

private static org.apache.logging.log4j.Logger h;

protected moom.DD i;

public moom.DD j;

public boolean k;

public n6(moom.DD p0) {
super();
    this.i = p0;
}


static {
moom.n6.h = org.apache.logging.log4j.LogManager.getLogger();
}

private static native <E extends Throwable> void __sourceHandlerCall_f7040b9a84dfc8a401f6(moom.n6 a0, moom.oR a1) throws E;
private static final class __SourceHandler_f7040b9a84dfc8a401f6 {

public static void f466(moom.n6 receiver, moom.oR p0) throws Throwable {
    java.lang.Object life2_3;
    net.minecraft.client.resources.IResource life3_8;
    java.io.InputStream life2_11;
    java.awt.image.BufferedImage life4_14;
    int life5_16;
    int life6_18;
    net.minecraft.client.resources.data.TextureMetadataSection life7_26;
    forest_join_67: {
    forest_join_63: {
    forest_join_57: {
    forest_join_50: {
    forest_join_35: {
    __call466_0(receiver);
    life2_3 = null;
    life3_8 = __call466_2(p0, __fieldRead466_1(receiver));
    life2_11 = __call466_3(life3_8);
    life4_14 = __call466_4(life2_11);
    life5_16 = 0;
    life6_18 = 0;
    if (!(__call466_5(life3_8))) {
        break forest_join_35;
    }
    life7_26 = __cast466_7(__call466_6(life3_8, "texture"));
    if (!((life7_26 != null))) {
        break forest_join_35;
    }
    life5_16 = __integerCategory466_9(__call466_8(life7_26));
    life6_18 = __integerCategory466_11(__call466_10(life7_26));
    }
    if (!(__call466_12())) {
        break forest_join_50;
    }
    __call466_16(__call466_13(receiver), life4_14, life5_16, life6_18, p0, __fieldRead466_14(receiver), __call466_15(receiver));
    break forest_join_57;
    }
    __call466_18(__call466_17(receiver), life4_14, life5_16, life6_18);
    }
    if (!(__call466_19())) {
        break forest_join_63;
    }
    __call466_21(__fieldRead466_20(receiver), receiver);
    }
    if (!((life2_11 != null))) {
        break forest_join_67;
    }
    __call466_22(life2_11);
    }
    return;
}
public static void h466_0(java.lang.RuntimeException p0, moom.n6 p1, moom.oR p2, java.io.InputStream p3, java.awt.image.BufferedImage p4, int p5, int p6) throws Throwable {
    java.lang.RuntimeException life7_2;
    forest_join_40: {
    forest_join_36: {
    forest_join_30: {
    forest_join_23: {
    life7_2 = p0;
    __call3046600_3(__fieldRead3046600_0(), __invokedynamic3046600_2(__fieldRead3046600_1(p1)), life7_2);
    if (!(__call3046600_4())) {
        break forest_join_23;
    }
    __call3046600_8(__call3046600_5(p1), p4, p5, p6, p2, __fieldRead3046600_6(p1), __call3046600_7(p1));
    break forest_join_30;
    }
    __call3046600_10(__call3046600_9(p1), p4, p5, p6);
    }
    if (!(__call3046600_11())) {
        break forest_join_36;
    }
    __call3046600_13(__fieldRead3046600_12(p1), p1);
    }
    if (!((p3 != null))) {
        break forest_join_40;
    }
    __call3046600_14(p3);
    }
    return;
}
public static void h466_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call3046601_0(p0);
}
public static void h466_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call3046602_0(p0);
}
public static void h466_3(java.lang.RuntimeException p0) throws Throwable {
    throw __call3046603_0(p0);
}
public static void h466_4(java.lang.Throwable p0, java.io.InputStream p1) throws Throwable {
    java.lang.Throwable life2_2;
    forest_join_6: {
    life2_2 = p0;
    if (!((p1 != null))) {
        break forest_join_6;
    }
    __call3046604_0(p1);
    }
    throw life2_2;
}
public static void h466_5(java.lang.RuntimeException p0) throws Throwable {
    throw __call3046605_0(p0);
}
private static native void __call466_0(moom.n6 a0) throws Throwable;
private static native moom.DD __fieldRead466_1(moom.n6 a0) throws Throwable;
private static native net.minecraft.client.resources.IResource __call466_2(moom.oR a0, moom.DD a1) throws Throwable;
private static native java.io.InputStream __call466_3(net.minecraft.client.resources.IResource a0) throws Throwable;
private static native java.awt.image.BufferedImage __call466_4(java.io.InputStream a0) throws Throwable;
private static native boolean __call466_5(net.minecraft.client.resources.IResource a0) throws Throwable;
private static native net.minecraft.client.resources.data.IMetadataSection __call466_6(net.minecraft.client.resources.IResource a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.resources.data.TextureMetadataSection __cast466_7(net.minecraft.client.resources.data.IMetadataSection a0) throws Throwable;
private static native boolean __call466_8(net.minecraft.client.resources.data.TextureMetadataSection a0) throws Throwable;
private static native int __integerCategory466_9(boolean value) throws Throwable;
private static native boolean __call466_10(net.minecraft.client.resources.data.TextureMetadataSection a0) throws Throwable;
private static native int __integerCategory466_11(boolean value) throws Throwable;
private static native boolean __call466_12() throws Throwable;
private static native int __call466_13(moom.n6 a0) throws Throwable;
private static native moom.DD __fieldRead466_14(moom.n6 a0) throws Throwable;
private static native moom.MA __call466_15(moom.n6 a0) throws Throwable;
private static native int __call466_16(int a0, java.awt.image.BufferedImage a1, int a2, int a3, moom.oR a4, moom.DD a5, moom.MA a6) throws Throwable;
private static native int __call466_17(moom.n6 a0) throws Throwable;
private static native int __call466_18(int a0, java.awt.image.BufferedImage a1, int a2, int a3) throws Throwable;
private static native boolean __call466_19() throws Throwable;
private static native moom.DD __fieldRead466_20(moom.n6 a0) throws Throwable;
private static native void __call466_21(moom.DD a0, moom.n6 a1) throws Throwable;
private static native void __call466_22(java.io.InputStream a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3046600_0() throws Throwable;
private static native moom.DD __fieldRead3046600_1(moom.n6 a0) throws Throwable;
private static native java.lang.String __invokedynamic3046600_2(moom.DD a0) throws Throwable;
private static native void __call3046600_3(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.RuntimeException a2) throws Throwable;
private static native boolean __call3046600_4() throws Throwable;
private static native int __call3046600_5(moom.n6 a0) throws Throwable;
private static native moom.DD __fieldRead3046600_6(moom.n6 a0) throws Throwable;
private static native moom.MA __call3046600_7(moom.n6 a0) throws Throwable;
private static native int __call3046600_8(int a0, java.awt.image.BufferedImage a1, int a2, int a3, moom.oR a4, moom.DD a5, moom.MA a6) throws Throwable;
private static native int __call3046600_9(moom.n6 a0) throws Throwable;
private static native int __call3046600_10(int a0, java.awt.image.BufferedImage a1, int a2, int a3) throws Throwable;
private static native boolean __call3046600_11() throws Throwable;
private static native moom.DD __fieldRead3046600_12(moom.n6 a0) throws Throwable;
private static native void __call3046600_13(moom.DD a0, moom.n6 a1) throws Throwable;
private static native void __call3046600_14(java.io.InputStream a0) throws Throwable;
private static native java.lang.RuntimeException __call3046601_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.RuntimeException __call3046602_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.RuntimeException __call3046603_0(java.lang.RuntimeException a0) throws Throwable;
private static native void __call3046604_0(java.io.InputStream a0) throws Throwable;
private static native java.lang.RuntimeException __call3046605_0(java.lang.RuntimeException a0) throws Throwable;

}


public void a(moom.oR p0) throws java.io.IOException { __sourceHandlerCall_f7040b9a84dfc8a401f6(this, p0); }


private static java.lang.RuntimeException a(java.lang.RuntimeException p0) {
return p0;
}

}
