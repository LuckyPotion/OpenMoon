package net.minecraft.client.renderer.chunk;


public class ChunkRenderWorker implements java.lang.Runnable {

private static org.apache.logging.log4j.Logger a;

private moom.mi b;

private moom.lp c;

public ChunkRenderWorker(moom.mi p0) {
this(p0, null);
}


public ChunkRenderWorker(moom.mi p0, moom.lp p1) {
super();
    this.b = p0;
    this.c = p1;
}


static {
net.minecraft.client.renderer.chunk.ChunkRenderWorker.a = org.apache.logging.log4j.LogManager.getLogger();
}

private static native <E extends Throwable> moom.lp __sourceHandlerCall_e415947f8baa3b9dcf01(net.minecraft.client.renderer.chunk.ChunkRenderWorker a0) throws E;
private static final class __SourceHandler_e415947f8baa3b9dcf01 {

public static moom.lp f2553(net.minecraft.client.renderer.chunk.ChunkRenderWorker receiver) throws Throwable {
    return ((__fieldRead2553_0(receiver) != null) ? __fieldRead2553_1(receiver) : __call2553_3(__fieldRead2553_2(receiver)));
}
public static void h2553_0(java.lang.InterruptedException p0) throws Throwable {
    throw __call1255300_0(p0);
}
private static native moom.lp __fieldRead2553_0(net.minecraft.client.renderer.chunk.ChunkRenderWorker a0) throws Throwable;
private static native moom.lp __fieldRead2553_1(net.minecraft.client.renderer.chunk.ChunkRenderWorker a0) throws Throwable;
private static native moom.mi __fieldRead2553_2(net.minecraft.client.renderer.chunk.ChunkRenderWorker a0) throws Throwable;
private static native moom.lp __call2553_3(moom.mi a0) throws Throwable;
private static native java.lang.Exception __call1255300_0(java.lang.InterruptedException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_9e048fe8accf663e3323(net.minecraft.client.renderer.chunk.ChunkRenderWorker a0, net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a1) throws E;
private static final class __SourceHandler_9e048fe8accf663e3323 {

public static void f608(net.minecraft.client.renderer.chunk.ChunkRenderWorker receiver, net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator p0) throws Throwable {
    net.minecraft.entity.Entity life2_29;
    float life3_42;
    float life4_49;
    float life5_53;
    net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Type life6_56;
    net.minecraft.client.renderer.chunk.CompiledChunk life7_111;
    java.util.ArrayList life8_113;
    net.minecraft.util.EnumWorldBlockLayer[] life9_118;
    int life10_121;
    int life11_123;
    net.minecraft.util.EnumWorldBlockLayer life12_130;
    com.google.common.util.concurrent.ListenableFuture life9_173;
    forest_join_180: {
    forest_join_164: {
    forest_join_147: {
    forest_join_146: {
    forest_join_98: {
    forest_join_91: {
    forest_join_76: {
    forest_join_66: {
    forest_join_33: {
    forest_join_19: {
    forest_join_15: {
    __call608_1(__call608_0(p0));
    if (!((__call608_2(p0) != __fieldRead608_3()))) {
        break forest_join_19;
    }
    if (!((!__call608_4(p0)))) {
        break forest_join_15;
    }
    __call608_8(__fieldRead608_5(), __invokedynamic608_7(__call608_6(p0)));
    }
    __call608_10(__call608_9(p0));
    return;
    }
    __call608_12(p0, __fieldRead608_11());
    __call608_14(__call608_13(p0));
    life2_29 = __call608_16(__call608_15());
    if (!((life2_29 == null))) {
        break forest_join_33;
    }
    __call608_17(p0);
    break forest_join_180;
    }
    __call608_19(p0, __call608_18(receiver));
    life3_42 = ((float) __fieldRead608_20(life2_29));
    life4_49 = (((float) __fieldRead608_21(life2_29)) + __call608_22(life2_29));
    life5_53 = ((float) __fieldRead608_23(life2_29));
    life6_56 = __call608_24(p0);
    if (!((life6_56 == __fieldRead608_25()))) {
        break forest_join_66;
    }
    __call608_27(__call608_26(p0), life3_42, life4_49, life5_53, p0);
    break forest_join_76;
    }
    if (!((life6_56 == __fieldRead608_28()))) {
        break forest_join_76;
    }
    __call608_30(__call608_29(p0), life3_42, life4_49, life5_53, p0);
    }
    __call608_32(__call608_31(p0));
    if (!((__call608_33(p0) != __fieldRead608_34()))) {
        break forest_join_98;
    }
    if (!((!__call608_35(p0)))) {
        break forest_join_91;
    }
    __call608_39(__fieldRead608_36(), __invokedynamic608_38(__call608_37(p0)));
    }
    __call608_40(receiver, p0);
    __call608_42(__call608_41(p0));
    return;
    }
    __call608_44(p0, __fieldRead608_43());
    __call608_46(__call608_45(p0));
    life7_111 = __call608_47(p0);
    life8_113 = __call608_48();
    if (!((life6_56 == __fieldRead608_49()))) {
        break forest_join_147;
    }
    life9_118 = __call608_50();
    life10_121 = (life9_118).length;
    life11_123 = 0;
    forest_cycle_119: while (true) {
    forest_join_144: {
    if (!((life11_123 < life10_121))) {
        break forest_join_146;
    }
    life12_130 = (life9_118)[life11_123];
    if (!(__call608_51(life7_111, life12_130))) {
        break forest_join_144;
    }
    __call608_57(life8_113, __call608_56(__fieldRead608_52(receiver), life12_130, __call608_54(__call608_53(p0), life12_130), __call608_55(p0), life7_111));
    }
    life11_123 += 1;
    continue forest_cycle_119;
    }
    }
    break forest_join_164;
    }
    if (!((life6_56 == __fieldRead608_58()))) {
        break forest_join_164;
    }
    __call608_66(life8_113, __call608_65(__fieldRead608_59(receiver), __fieldRead608_60(), __call608_63(__call608_61(p0), __fieldRead608_62()), __call608_64(p0), life7_111));
    }
    life9_173 = __call608_67(life8_113);
    __call608_69(p0, __invokedynamic608_68(life9_173));
    __call608_71(life9_173, new net.minecraft.client.renderer.chunk.ChunkRenderWorker$2(receiver, p0, life7_111), __call608_70());
    }
    return;
}
public static void h608_0(java.lang.InterruptedException p0) throws Throwable {
    throw __call3060800_0(p0);
}
public static void h608_1(java.lang.Throwable p0, net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator p1, net.minecraft.entity.Entity p2) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3060801_1(__call3060801_0(p1));
    throw life2_2;
}
public static void h608_2(java.lang.InterruptedException p0) throws Throwable {
    throw __call3060802_0(p0);
}
public static void h608_3(java.lang.InterruptedException p0) throws Throwable {
    throw __call3060803_0(p0);
}
public static void h608_4(java.lang.InterruptedException p0) throws Throwable {
    throw __call3060804_0(p0);
}
public static void h608_5(java.lang.InterruptedException p0) throws Throwable {
    throw __call3060805_0(p0);
}
public static void h608_6(java.lang.Throwable p0, net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator p1, net.minecraft.client.renderer.chunk.CompiledChunk p2) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3060806_1(__call3060806_0(p1));
    throw life2_2;
}
public static void h608_7(java.lang.InterruptedException p0) throws Throwable {
    throw __call3060807_0(p0);
}
public static void h608_8(java.lang.InterruptedException p0) throws Throwable {
    throw __call3060808_0(p0);
}
private static native java.util.concurrent.locks.ReentrantLock __call608_0(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native void __call608_1(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status __call608_2(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status __fieldRead608_3() throws Throwable;
private static native boolean __call608_4(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead608_5() throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status __call608_6(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native java.lang.String __invokedynamic608_7(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status a0) throws Throwable;
private static native void __call608_8(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __call608_9(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native void __call608_10(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status __fieldRead608_11() throws Throwable;
private static native void __call608_12(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0, net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status a1) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __call608_13(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native void __call608_14(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;
private static native net.minecraft.client.Minecraft __call608_15() throws Throwable;
private static native net.minecraft.entity.Entity __call608_16(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call608_17(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native moom.lp __call608_18(net.minecraft.client.renderer.chunk.ChunkRenderWorker a0) throws Throwable;
private static native void __call608_19(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0, moom.lp a1) throws Throwable;
private static native double __fieldRead608_20(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead608_21(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __call608_22(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead608_23(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Type __call608_24(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Type __fieldRead608_25() throws Throwable;
private static native moom.mp __call608_26(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native void __call608_27(moom.mp a0, float a1, float a2, float a3, net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a4) throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Type __fieldRead608_28() throws Throwable;
private static native moom.mp __call608_29(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native void __call608_30(moom.mp a0, float a1, float a2, float a3, net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a4) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __call608_31(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native void __call608_32(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status __call608_33(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status __fieldRead608_34() throws Throwable;
private static native boolean __call608_35(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead608_36() throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status __call608_37(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native java.lang.String __invokedynamic608_38(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status a0) throws Throwable;
private static native void __call608_39(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native void __call608_40(net.minecraft.client.renderer.chunk.ChunkRenderWorker a0, net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a1) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __call608_41(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native void __call608_42(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status __fieldRead608_43() throws Throwable;
private static native void __call608_44(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0, net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Status a1) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __call608_45(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native void __call608_46(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;
private static native net.minecraft.client.renderer.chunk.CompiledChunk __call608_47(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native java.util.ArrayList __call608_48() throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Type __fieldRead608_49() throws Throwable;
private static native net.minecraft.util.EnumWorldBlockLayer[] __call608_50() throws Throwable;
private static native boolean __call608_51(net.minecraft.client.renderer.chunk.CompiledChunk a0, net.minecraft.util.EnumWorldBlockLayer a1) throws Throwable;
private static native moom.mi __fieldRead608_52(net.minecraft.client.renderer.chunk.ChunkRenderWorker a0) throws Throwable;
private static native moom.lp __call608_53(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native moom.lw __call608_54(moom.lp a0, net.minecraft.util.EnumWorldBlockLayer a1) throws Throwable;
private static native moom.mp __call608_55(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native com.google.common.util.concurrent.ListenableFuture __call608_56(moom.mi a0, net.minecraft.util.EnumWorldBlockLayer a1, moom.lw a2, moom.mp a3, net.minecraft.client.renderer.chunk.CompiledChunk a4) throws Throwable;
private static native boolean __call608_57(java.util.ArrayList a0, com.google.common.util.concurrent.ListenableFuture a1) throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator$Type __fieldRead608_58() throws Throwable;
private static native moom.mi __fieldRead608_59(net.minecraft.client.renderer.chunk.ChunkRenderWorker a0) throws Throwable;
private static native net.minecraft.util.EnumWorldBlockLayer __fieldRead608_60() throws Throwable;
private static native moom.lp __call608_61(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native net.minecraft.util.EnumWorldBlockLayer __fieldRead608_62() throws Throwable;
private static native moom.lw __call608_63(moom.lp a0, net.minecraft.util.EnumWorldBlockLayer a1) throws Throwable;
private static native moom.mp __call608_64(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native com.google.common.util.concurrent.ListenableFuture __call608_65(moom.mi a0, net.minecraft.util.EnumWorldBlockLayer a1, moom.lw a2, moom.mp a3, net.minecraft.client.renderer.chunk.CompiledChunk a4) throws Throwable;
private static native boolean __call608_66(java.util.ArrayList a0, com.google.common.util.concurrent.ListenableFuture a1) throws Throwable;
private static native com.google.common.util.concurrent.ListenableFuture __call608_67(java.util.ArrayList a0) throws Throwable;
private static native java.lang.Runnable __invokedynamic608_68(com.google.common.util.concurrent.ListenableFuture a0) throws Throwable;
private static native void __call608_69(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0, java.lang.Runnable a1) throws Throwable;
private static native java.util.concurrent.Executor __call608_70() throws Throwable;
private static native void __call608_71(com.google.common.util.concurrent.ListenableFuture a0, net.minecraft.client.renderer.chunk.ChunkRenderWorker$2 a1, java.util.concurrent.Executor a2) throws Throwable;
private static native java.lang.Exception __call3060800_0(java.lang.InterruptedException a0) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __call3060801_0(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native void __call3060801_1(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;
private static native java.lang.Exception __call3060802_0(java.lang.InterruptedException a0) throws Throwable;
private static native java.lang.Exception __call3060803_0(java.lang.InterruptedException a0) throws Throwable;
private static native java.lang.Exception __call3060804_0(java.lang.InterruptedException a0) throws Throwable;
private static native java.lang.Exception __call3060805_0(java.lang.InterruptedException a0) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __call3060806_0(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native void __call3060806_1(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;
private static native java.lang.Exception __call3060807_0(java.lang.InterruptedException a0) throws Throwable;
private static native java.lang.Exception __call3060808_0(java.lang.InterruptedException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_ff542820a1aba2bfcc11(net.minecraft.client.renderer.chunk.ChunkRenderWorker a0) throws E;
private static final class __SourceHandler_ff542820a1aba2bfcc11 {

public static void f609(net.minecraft.client.renderer.chunk.ChunkRenderWorker receiver) throws Throwable {
    terminal_cycle_0: while (true) {
        __call609_2(receiver, __call609_1(__fieldRead609_0(receiver)));
        continue terminal_cycle_0;
    }
}
public static void h609_0(java.lang.InterruptedException p0) throws Throwable {
    java.lang.InterruptedException local1 = p0;
    __call2060900_1(__fieldRead2060900_0(), "Stopping due to interrupt");
    return;
}
public static void h609_1(java.lang.Throwable p0) throws Throwable {
    java.lang.Throwable local1 = p0;
    __call2060901_2(__call2060901_0(), __invokedynamic2060901_1(local1));
    return;
}
private static native moom.mi __fieldRead609_0(net.minecraft.client.renderer.chunk.ChunkRenderWorker a0) throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator __call609_1(moom.mi a0) throws Throwable;
private static native void __call609_2(net.minecraft.client.renderer.chunk.ChunkRenderWorker a0, net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a1) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead2060900_0() throws Throwable;
private static native void __call2060900_1(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.Minecraft __call2060901_0() throws Throwable;
private static native java.lang.Runnable __invokedynamic2060901_1(java.lang.Throwable a0) throws Throwable;
private static native com.google.common.util.concurrent.ListenableFuture __call2060901_2(net.minecraft.client.Minecraft a0, java.lang.Runnable a1) throws Throwable;

}


public void run() { __sourceHandlerCall_ff542820a1aba2bfcc11(this); }


private void b(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator p0) {
try {
        if ((this.c == null)) {
        ((moom.mi)(this.b)).a(((moom.lp)(((net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator)(p0)).a__lp())));
    }
    } catch (moom.Oo caught_rethrow_0) {
        throw net.minecraft.client.renderer.chunk.ChunkRenderWorker.a(((java.lang.Exception)(caught_rethrow_0)));
    }
    return;
}


protected void a(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator p0) throws java.lang.InterruptedException { __sourceHandlerCall_9e048fe8accf663e3323(this, p0); }


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private moom.lp a() throws java.lang.InterruptedException { return __sourceHandlerCall_e415947f8baa3b9dcf01(this); }


private static void lambda$run$0(java.lang.Throwable p0) {
java.lang.Object local1 = moom.qY.a(((java.lang.Throwable)(p0)), ((java.lang.String)("Batching chunks")));
    ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__Void(((moom.qY)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a(((moom.qY)(local1))))));
    return;
}


private static void lambda$processTask$1(com.google.common.util.concurrent.ListenableFuture p0) {
((com.google.common.util.concurrent.ListenableFuture)(p0)).cancel(((boolean)(false)));
    return;
}

}
