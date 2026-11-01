package net.minecraft.client.renderer.chunk;


public class ChunkCompileTaskGenerator {

private moom.mp a;

private java.util.concurrent.locks.ReentrantLock b;

private java.util.List<java.lang.Runnable> c;

private net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Type d;

private moom.lp e;

private net.minecraft.client.renderer.chunk.CompiledChunk f;

private net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status g;

private boolean h;

public ChunkCompileTaskGenerator(moom.mp p0, net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Type p1) {
super();
    this.b = new java.util.concurrent.locks.ReentrantLock();
    this.c = com.google.common.collect.Lists.newArrayList();
    this.g = net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status.PENDING;
    this.a = p0;
    this.d = p1;
}

private static native <E extends Throwable> void __sourceHandlerCall_6bc3b41c0ca0a3bfb0f4(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0, java.lang.Runnable a1) throws E;
private static final class __SourceHandler_6bc3b41c0ca0a3bfb0f4 {

public static void f536(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator receiver, java.lang.Runnable p0) throws Throwable {
    __call536_1(__fieldRead536_0(receiver));
    __call536_3(__fieldRead536_2(receiver), p0);
    if (__fieldRead536_4(receiver)) {
        __call536_5(p0);
    }
    __call536_7(__fieldRead536_6(receiver));
    return;
}
public static void h536_0(java.lang.Throwable p0, net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator p1) throws Throwable {
    java.lang.Throwable local2 = p0;
    __call2053600_1(__fieldRead2053600_0(p1));
    throw local2;
}
private static native java.util.concurrent.locks.ReentrantLock __fieldRead536_0(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native void __call536_1(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;
private static native java.util.List __fieldRead536_2(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native boolean __call536_3(java.util.List a0, java.lang.Runnable a1) throws Throwable;
private static native boolean __fieldRead536_4(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native void __call536_5(java.lang.Runnable a0) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __fieldRead536_6(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native void __call536_7(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __fieldRead2053600_0(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native void __call2053600_1(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_aec0a39aaf9ad3423531(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0, net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status a1) throws E;
private static final class __SourceHandler_aec0a39aaf9ad3423531 {

public static void f537(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator receiver, net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status p0) throws Throwable {
    __call537_1(__fieldRead537_0(receiver));
    __fieldWrite537_2(receiver, p0);
    __call537_4(__fieldRead537_3(receiver));
    return;
}
public static void h537_0(java.lang.Throwable p0, net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator p1) throws Throwable {
    java.lang.Throwable local2 = p0;
    __call2053700_1(__fieldRead2053700_0(p1));
    throw local2;
}
private static native java.util.concurrent.locks.ReentrantLock __fieldRead537_0(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native void __call537_1(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;
private static native void __fieldWrite537_2(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0, net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status a1) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __fieldRead537_3(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native void __call537_4(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __fieldRead2053700_0(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native void __call2053700_1(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_9b54addcb7cbdc99a813(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws E;
private static final class __SourceHandler_9b54addcb7cbdc99a813 {

public static void f538(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator receiver) throws Throwable {
    java.util.Iterator life1_27;
    java.lang.Runnable life2_34;
    __call538_1(__fieldRead538_0(receiver));
    if ((__fieldRead538_2(receiver) == __fieldRead538_3())) {
        if ((__fieldRead538_4(receiver) != __fieldRead538_5())) {
        __call538_7(__fieldRead538_6(receiver), 1);
    }
    }
    __fieldWrite538_8(receiver, 1);
    __fieldWrite538_10(receiver, __fieldRead538_9());
    life1_27 = __call538_12(__fieldRead538_11(receiver));
    loop_region_25: while (__call538_13(life1_27)) {
        life2_34 = __cast538_15(__call538_14(life1_27));
        __call538_16(life2_34);
    }
    __call538_18(__fieldRead538_17(receiver));
    return;
}
public static void h538_0(moom.Oo p0) throws Throwable {
    throw __call2053800_0(p0);
}
public static void h538_1(java.lang.Throwable p0, net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator p1) throws Throwable {
    java.lang.Throwable local2 = p0;
    __call2053801_1(__fieldRead2053801_0(p1));
    throw local2;
}
private static native java.util.concurrent.locks.ReentrantLock __fieldRead538_0(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native void __call538_1(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Type __fieldRead538_2(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Type __fieldRead538_3() throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status __fieldRead538_4(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status __fieldRead538_5() throws Throwable;
private static native moom.mp __fieldRead538_6(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native void __call538_7(moom.mp a0, int a1) throws Throwable;
private static native void __fieldWrite538_8(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0, int a1) throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status __fieldRead538_9() throws Throwable;
private static native void __fieldWrite538_10(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0, net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status a1) throws Throwable;
private static native java.util.List __fieldRead538_11(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native java.util.Iterator __call538_12(java.util.List a0) throws Throwable;
private static native boolean __call538_13(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call538_14(java.util.Iterator a0) throws Throwable;
private static native java.lang.Runnable __cast538_15(java.lang.Object a0) throws Throwable;
private static native void __call538_16(java.lang.Runnable a0) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __fieldRead538_17(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native void __call538_18(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;
private static native moom.Oo __call2053800_0(moom.Oo a0) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __fieldRead2053801_0(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native void __call2053801_1(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;

}


public java.util.concurrent.locks.ReentrantLock a() {
return this.b;
}


public void a(java.lang.Runnable p0) { __sourceHandlerCall_6bc3b41c0ca0a3bfb0f4(this, p0); }


public void a__Void() { __sourceHandlerCall_9b54addcb7cbdc99a813(this); }


public void a(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status p0) { __sourceHandlerCall_aec0a39aaf9ad3423531(this, p0); }


public net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Type a__aI() {
return this.d;
}


public boolean a__Boolean() {
return ((((this.h) ? 1 : 0)) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status a__aH() {
return this.g;
}


public moom.mp a__mp() {
return this.a;
}


public net.minecraft.client.renderer.chunk.CompiledChunk a__ml() {
return this.f;
}


public void a(net.minecraft.client.renderer.chunk.CompiledChunk p0) {
this.f = ((net.minecraft.client.renderer.chunk.CompiledChunk)(p0));
    return;
}


public moom.lp a__lp() {
return this.e;
}


public void a(moom.lp p0) {
this.e = ((moom.lp)(p0));
    return;
}

}
