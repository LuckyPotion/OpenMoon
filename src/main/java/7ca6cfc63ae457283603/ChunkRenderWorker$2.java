package net.minecraft.client.renderer.chunk;


class ChunkRenderWorker$2 implements com.google.common.util.concurrent.FutureCallback<java.util.List<java.lang.Object>> {

net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a;

net.minecraft.client.renderer.chunk.CompiledChunk b;

net.minecraft.client.renderer.chunk.ChunkRenderWorker c;

ChunkRenderWorker$2(net.minecraft.client.renderer.chunk.ChunkRenderWorker p0, net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator p1, net.minecraft.client.renderer.chunk.CompiledChunk p2) { super(); }

private static void __sourceConstructorBody_14d9492ac9b49814(net.minecraft.client.renderer.chunk.ChunkRenderWorker$2 receiver, net.minecraft.client.renderer.chunk.ChunkRenderWorker p0, net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator p1, net.minecraft.client.renderer.chunk.CompiledChunk p2) throws Throwable {
((net.minecraft.client.renderer.chunk.ChunkRenderWorker$2)(receiver)).c = ((net.minecraft.client.renderer.chunk.ChunkRenderWorker)(p0));
    ((net.minecraft.client.renderer.chunk.ChunkRenderWorker$2)(receiver)).a = ((net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator)(p1));
    ((net.minecraft.client.renderer.chunk.ChunkRenderWorker$2)(receiver)).b = ((net.minecraft.client.renderer.chunk.CompiledChunk)(p2));
    net.minecraft.client.renderer.chunk.ChunkRenderWorker$2.__sourceConstructorInit_14d9492ac9b49814_0(((net.minecraft.client.renderer.chunk.ChunkRenderWorker$2)(receiver)));
    return;
}

private static native <E extends Throwable> void __sourceConstructorInit_14d9492ac9b49814_0(net.minecraft.client.renderer.chunk.ChunkRenderWorker$2 a0) throws E;
private static native <E extends Throwable> void __sourceHandlerCall_83560a19404dbab98b86(net.minecraft.client.renderer.chunk.ChunkRenderWorker$2 a0, java.util.List a1) throws E;
private static final class __SourceHandler_83560a19404dbab98b86 {

public static void f541(net.minecraft.client.renderer.chunk.ChunkRenderWorker$2 receiver, java.util.List p0) throws Throwable {
    __call541_2(__fieldRead541_0(receiver), __fieldRead541_1(receiver));
    __call541_5(__call541_4(__fieldRead541_3(receiver)));
    if ((__call541_7(__fieldRead541_6(receiver)) == __fieldRead541_8())) {
        __call541_11(__fieldRead541_9(receiver), __fieldRead541_10());
        __call541_14(__call541_13(__fieldRead541_12(receiver)));
    } else {
        if ((!__call541_16(__fieldRead541_15(receiver)))) {
        __call541_21(__fieldRead541_17(), __invokedynamic541_20(__call541_19(__fieldRead541_18(receiver))));
    }
        __call541_24(__call541_23(__fieldRead541_22(receiver)));
        return;
    }
    __call541_28(__call541_26(__fieldRead541_25(receiver)), __fieldRead541_27(receiver));
    return;
}
public static void h541_0(java.lang.Throwable p0, net.minecraft.client.renderer.chunk.ChunkRenderWorker$2 p1) throws Throwable {
    java.lang.Throwable local2 = p0;
    __call2054100_2(__call2054100_1(__fieldRead2054100_0(p1)));
    throw local2;
}
private static native net.minecraft.client.renderer.chunk.ChunkRenderWorker __fieldRead541_0(net.minecraft.client.renderer.chunk.ChunkRenderWorker$2 a0) throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator __fieldRead541_1(net.minecraft.client.renderer.chunk.ChunkRenderWorker$2 a0) throws Throwable;
private static native void __call541_2(net.minecraft.client.renderer.chunk.ChunkRenderWorker a0, net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a1) throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator __fieldRead541_3(net.minecraft.client.renderer.chunk.ChunkRenderWorker$2 a0) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __call541_4(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native void __call541_5(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator __fieldRead541_6(net.minecraft.client.renderer.chunk.ChunkRenderWorker$2 a0) throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status __call541_7(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status __fieldRead541_8() throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator __fieldRead541_9(net.minecraft.client.renderer.chunk.ChunkRenderWorker$2 a0) throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status __fieldRead541_10() throws Throwable;
private static native void __call541_11(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0, net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status a1) throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator __fieldRead541_12(net.minecraft.client.renderer.chunk.ChunkRenderWorker$2 a0) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __call541_13(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native void __call541_14(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator __fieldRead541_15(net.minecraft.client.renderer.chunk.ChunkRenderWorker$2 a0) throws Throwable;
private static native boolean __call541_16(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead541_17() throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator __fieldRead541_18(net.minecraft.client.renderer.chunk.ChunkRenderWorker$2 a0) throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status __call541_19(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native java.lang.String __invokedynamic541_20(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status a0) throws Throwable;
private static native void __call541_21(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator __fieldRead541_22(net.minecraft.client.renderer.chunk.ChunkRenderWorker$2 a0) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __call541_23(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native void __call541_24(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator __fieldRead541_25(net.minecraft.client.renderer.chunk.ChunkRenderWorker$2 a0) throws Throwable;
private static native moom.mp __call541_26(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native net.minecraft.client.renderer.chunk.CompiledChunk __fieldRead541_27(net.minecraft.client.renderer.chunk.ChunkRenderWorker$2 a0) throws Throwable;
private static native void __call541_28(moom.mp a0, net.minecraft.client.renderer.chunk.CompiledChunk a1) throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator __fieldRead2054100_0(net.minecraft.client.renderer.chunk.ChunkRenderWorker$2 a0) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __call2054100_1(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native void __call2054100_2(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;

}


private static java.util.concurrent.CancellationException a(java.util.concurrent.CancellationException p0) {
return p0;
}


public void a(java.util.List<java.lang.Object> p0) { __sourceHandlerCall_83560a19404dbab98b86(this, p0); }


public void onFailure(java.lang.Throwable p0) {
__sourceExactCall_399545e07c999c(((net.minecraft.client.renderer.chunk.ChunkRenderWorker)(this.c)), ((net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator)(this.a)));
    if ((((p0 instanceof java.util.concurrent.CancellationException) ? 1 : 0) == 0)) {
        if ((((p0 instanceof java.lang.InterruptedException) ? 1 : 0) == 0)) {
        ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__Void(((moom.qY)(__sourceExactCall_e823c045f01e59(((java.lang.Throwable)(p0)), ((java.lang.String)("Rendering chunk"))))));
    }
    }
    return;
}


private static native moom.qY __sourceExactCall_e823c045f01e59(java.lang.Throwable p0, java.lang.String p1);

public void onSuccess__sourceBridge_f286d6bd4c(java.lang.Object p0) {
((net.minecraft.client.renderer.chunk.ChunkRenderWorker$2)(this)).a(((java.util.List)(((java.util.List)(p0)))));
}

public void onSuccess(java.util.List<java.lang.Object> __bridgeParam0) { this.onSuccess__sourceBridge_f286d6bd4c(((java.lang.Object)(__bridgeParam0))); }

private static native void __sourceExactCall_399545e07c999c(net.minecraft.client.renderer.chunk.ChunkRenderWorker p0, net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator p1);
}
