package moom;


class OI extends java.util.TimerTask {

net.minecraft.profiler.PlayerUsageSnooper a;

private static long b;

OI(net.minecraft.profiler.PlayerUsageSnooper p0) { super(); }

private static void __sourceConstructorBody_e4a8458f23fe5d60(moom.OI receiver, net.minecraft.profiler.PlayerUsageSnooper p0) throws Throwable {
((moom.OI)(receiver)).a = ((net.minecraft.profiler.PlayerUsageSnooper)(p0));
    moom.OI.__sourceConstructorInit_e4a8458f23fe5d60_0(((moom.OI)(receiver)));
    return;
}


static {
moom.OI.b = (moom._c.a(97291317717321979L, 946930744893926992L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(267776282310659L);
}

private static native <E extends Throwable> void __sourceConstructorInit_e4a8458f23fe5d60_0(moom.OI a0) throws E;
private static native <E extends Throwable> void __sourceHandlerCall_0249d06af0b05f29eaf5(moom.OI a0) throws E;
private static final class __SourceHandler_0249d06af0b05f29eaf5 {

public static void f380(moom.OI receiver) throws Throwable {
    java.lang.Object forestValue380_16_0;
    java.lang.Object forestValue380_56_0;
    net.minecraft.profiler.IPlayerUsage spill380_0;
    net.minecraft.profiler.PlayerUsageSnooper spill380_1;
    java.util.HashMap spill380_2;
    java.lang.String spill380_3;
    int spill380_4;
    long life1_3;
    int[] life3_5;
    java.lang.Object life5_19;
    java.util.HashMap life4_25;
    forest_join_64: {
    forest_join_56: {
    forest_join_35: {
    forest_join_16: {
    life1_3 = (__fieldRead380_0() ^ 71451599499988L);
    life3_5 = __call380_1();
    spill380_0 = __fieldRead380_3(__fieldRead380_2(receiver));
    if (!((life3_5 != null))) {
        forestValue380_16_0 = spill380_0;
        break forest_join_16;
    }
    if (!(__call380_4(spill380_0))) {
        break forest_join_64;
    }
    forestValue380_16_0 = __fieldRead380_6(__fieldRead380_5(receiver));
    }
    __monitorEnter380_7((life5_19 = forestValue380_16_0));
    life4_25 = __call380_10(__fieldRead380_9(__fieldRead380_8(receiver)));
    spill380_1 = __fieldRead380_11(receiver);
    if (!((life3_5 != null))) {
        forestValue380_56_0 = spill380_1;
        break forest_join_56;
    }
    if (!((__fieldRead380_12(spill380_1) == 0))) {
        break forest_join_35;
    }
    __call380_15(life4_25, __fieldRead380_14(__fieldRead380_13(receiver)));
    }
    spill380_2 = life4_25;
    spill380_3 = "snooper_count";
    net.minecraft.profiler.PlayerUsageSnooper __stackOp380_17_0 = __fieldRead380_16(receiver);
    net.minecraft.profiler.PlayerUsageSnooper __stackOp380_19_0 = __stackOp380_17_0;
    int __stackOp380_19_1 = __fieldRead380_18(__stackOp380_17_0);
    spill380_4 = __stackOp380_19_1;
    __fieldWrite380_20(__stackOp380_19_0, (__stackOp380_19_1 + 1));
    __call380_22(spill380_2, spill380_3, __call380_21(spill380_4));
    __call380_25(life4_25, "snooper_token", __fieldRead380_24(__fieldRead380_23(receiver)));
    forestValue380_56_0 = life5_19;
    }
    __monitorExit380_26(forestValue380_56_0);
    __call380_29(__fieldRead380_28(__fieldRead380_27(receiver)), life4_25, 1);
    }
    return;
}
public static void h380_0(moom.Oo p0) throws Throwable {
    throw __call3038000_0(p0);
}
public static void h380_1(moom.Oo p0) throws Throwable {
    throw __call3038001_0(p0);
}
public static void h380_2(moom.Oo p0) throws Throwable {
    throw __call3038002_0(p0);
}
public static void h380_3(moom.Oo p0) throws Throwable {
    throw __call3038003_0(p0);
}
public static void h380_4(java.lang.Throwable p0, java.lang.Object p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __monitorExit3038004_0(p1);
    throw life2_2;
}
private static native long __fieldRead380_0() throws Throwable;
private static native int[] __call380_1() throws Throwable;
private static native net.minecraft.profiler.PlayerUsageSnooper __fieldRead380_2(moom.OI a0) throws Throwable;
private static native net.minecraft.profiler.IPlayerUsage __fieldRead380_3(net.minecraft.profiler.PlayerUsageSnooper a0) throws Throwable;
private static native boolean __call380_4(net.minecraft.profiler.IPlayerUsage a0) throws Throwable;
private static native net.minecraft.profiler.PlayerUsageSnooper __fieldRead380_5(moom.OI a0) throws Throwable;
private static native java.lang.Object __fieldRead380_6(net.minecraft.profiler.PlayerUsageSnooper a0) throws Throwable;
private static native void __monitorEnter380_7(java.lang.Object a0) throws Throwable;
private static native net.minecraft.profiler.PlayerUsageSnooper __fieldRead380_8(moom.OI a0) throws Throwable;
private static native java.util.Map __fieldRead380_9(net.minecraft.profiler.PlayerUsageSnooper a0) throws Throwable;
private static native java.util.HashMap __call380_10(java.util.Map a0) throws Throwable;
private static native net.minecraft.profiler.PlayerUsageSnooper __fieldRead380_11(moom.OI a0) throws Throwable;
private static native int __fieldRead380_12(net.minecraft.profiler.PlayerUsageSnooper a0) throws Throwable;
private static native net.minecraft.profiler.PlayerUsageSnooper __fieldRead380_13(moom.OI a0) throws Throwable;
private static native java.util.Map __fieldRead380_14(net.minecraft.profiler.PlayerUsageSnooper a0) throws Throwable;
private static native void __call380_15(java.util.HashMap a0, java.util.Map a1) throws Throwable;
private static native net.minecraft.profiler.PlayerUsageSnooper __fieldRead380_16(moom.OI a0) throws Throwable;
private static native int __fieldRead380_18(net.minecraft.profiler.PlayerUsageSnooper a0) throws Throwable;
private static native void __fieldWrite380_20(net.minecraft.profiler.PlayerUsageSnooper a0, int a1) throws Throwable;
private static native java.lang.Integer __call380_21(int a0) throws Throwable;
private static native java.lang.Object __call380_22(java.util.HashMap a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native net.minecraft.profiler.PlayerUsageSnooper __fieldRead380_23(moom.OI a0) throws Throwable;
private static native java.lang.String __fieldRead380_24(net.minecraft.profiler.PlayerUsageSnooper a0) throws Throwable;
private static native java.lang.Object __call380_25(java.util.HashMap a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __monitorExit380_26(java.lang.Object a0) throws Throwable;
private static native net.minecraft.profiler.PlayerUsageSnooper __fieldRead380_27(moom.OI a0) throws Throwable;
private static native java.net.URL __fieldRead380_28(net.minecraft.profiler.PlayerUsageSnooper a0) throws Throwable;
private static native java.lang.String __call380_29(java.net.URL a0, java.util.HashMap a1, int a2) throws Throwable;
private static native moom.Oo __call3038000_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call3038001_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call3038002_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call3038003_0(moom.Oo a0) throws Throwable;
private static native void __monitorExit3038004_0(java.lang.Object a0) throws Throwable;

}


public void run() { __sourceHandlerCall_0249d06af0b05f29eaf5(this); }


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
