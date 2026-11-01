package moom;


public class DQ {

private static long a;

public DQ() {
super();
}


static {
moom.DQ.a = (moom._c.a(3446431011242665500L, 8688120725700921157L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(249848145836562L);
}

private static native <E extends Throwable> net.minecraft.util.Util$EnumOS __sourceHandlerCall_be48a186a7c68b21124e() throws E;
private static final class __SourceHandler_be48a186a7c68b21124e {

public static net.minecraft.util.Util$EnumOS f1101() throws Throwable {
    long life0_3;
    java.lang.String life2_7;
    life0_3 = (__fieldRead1101_0() ^ 128125398598453L);
    life2_7 = __call1101_2(__call1101_1("os.name"));
    return (__call1101_3(life2_7, "win") ? __fieldRead1101_4() : (__call1101_5(life2_7, "mac") ? __fieldRead1101_6() : (__call1101_7(life2_7, "solaris") ? __fieldRead1101_8() : (__call1101_9(life2_7, "sunos") ? __fieldRead1101_10() : (__call1101_11(life2_7, "linux") ? __fieldRead1101_12() : (__call1101_13(life2_7, "unix") ? __fieldRead1101_14() : __fieldRead1101_15()))))));
}
public static void h1101_0(moom.Oo p0) throws Throwable {
    throw __call1110100_0(p0);
}
public static void h1101_1(moom.Oo p0) throws Throwable {
    throw __call1110101_0(p0);
}
public static void h1101_2(moom.Oo p0) throws Throwable {
    throw __call1110102_0(p0);
}
public static void h1101_3(moom.Oo p0) throws Throwable {
    throw __call1110103_0(p0);
}
public static void h1101_4(moom.Oo p0) throws Throwable {
    throw __call1110104_0(p0);
}
public static void h1101_5(moom.Oo p0) throws Throwable {
    throw __call1110105_0(p0);
}
private static native long __fieldRead1101_0() throws Throwable;
private static native java.lang.String __call1101_1(java.lang.String a0) throws Throwable;
private static native java.lang.String __call1101_2(java.lang.String a0) throws Throwable;
private static native boolean __call1101_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.util.Util$EnumOS __fieldRead1101_4() throws Throwable;
private static native boolean __call1101_5(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.util.Util$EnumOS __fieldRead1101_6() throws Throwable;
private static native boolean __call1101_7(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.util.Util$EnumOS __fieldRead1101_8() throws Throwable;
private static native boolean __call1101_9(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.util.Util$EnumOS __fieldRead1101_10() throws Throwable;
private static native boolean __call1101_11(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.util.Util$EnumOS __fieldRead1101_12() throws Throwable;
private static native boolean __call1101_13(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.util.Util$EnumOS __fieldRead1101_14() throws Throwable;
private static native net.minecraft.util.Util$EnumOS __fieldRead1101_15() throws Throwable;
private static native java.lang.Exception __call1110100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1110101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1110102_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1110103_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1110104_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1110105_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.Object __sourceHandlerCall_641100e18aaebf81e7f7(java.util.concurrent.FutureTask a0, org.apache.logging.log4j.Logger a1) throws E;
private static final class __SourceHandler_641100e18aaebf81e7f7 {

public static java.lang.Object f599(java.util.concurrent.FutureTask p0, org.apache.logging.log4j.Logger p1) throws Throwable {
    long life2_3;
    int life4_5;
    life2_3 = (__fieldRead599_0() ^ 95445295709650L);
    life4_5 = __integerCategory599_2(__call599_1());
    __call599_3(p0);
    return __call599_4(p0);
}
public static java.lang.Object h599_0(java.util.concurrent.ExecutionException p0, int p1) throws Throwable {
    java.lang.Throwable forestValue3059900_11_0;
    java.lang.Throwable spill3059900_0;
    java.util.concurrent.ExecutionException life2_2;
    java.lang.Throwable life4_5;
    java.lang.OutOfMemoryError life3_15;
    forest_join_15: {
    forest_join_11: {
    life2_2 = p0;
    life4_5 = __call3059900_0(life2_2);
    spill3059900_0 = life4_5;
    if (!((p1 == 0))) {
        forestValue3059900_11_0 = spill3059900_0;
        break forest_join_11;
    }
    if (!((__instanceOf3059900_1(spill3059900_0) != 0))) {
        break forest_join_15;
    }
    forestValue3059900_11_0 = life4_5;
    }
    life3_15 = __cast3059900_2(forestValue3059900_11_0);
    throw life3_15;
    }
    return null;
}
public static java.lang.Object h599_1(java.util.concurrent.ExecutionException p0) throws Throwable {
    throw __call3059901_0(p0);
}
public static java.lang.Object h599_2(java.util.concurrent.ExecutionException p0) throws Throwable {
    throw __call3059902_0(p0);
}
public static java.lang.Object h599_3(java.lang.InterruptedException p0) throws Throwable {
    java.lang.InterruptedException life1_2;
    life1_2 = p0;
    return null;
}
private static native long __fieldRead599_0() throws Throwable;
private static native boolean __call599_1() throws Throwable;
private static native int __integerCategory599_2(boolean value) throws Throwable;
private static native void __call599_3(java.util.concurrent.FutureTask a0) throws Throwable;
private static native java.lang.Object __call599_4(java.util.concurrent.FutureTask a0) throws Throwable;
private static native java.lang.Throwable __call3059900_0(java.util.concurrent.ExecutionException a0) throws Throwable;
private static native int __instanceOf3059900_1(java.lang.Throwable a0) throws Throwable;
private static native java.lang.OutOfMemoryError __cast3059900_2(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Exception __call3059901_0(java.util.concurrent.ExecutionException a0) throws Throwable;
private static native java.lang.Exception __call3059902_0(java.util.concurrent.ExecutionException a0) throws Throwable;

}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public static <V> V a(java.util.concurrent.FutureTask<V> p0, org.apache.logging.log4j.Logger p1) { return ((V)(__sourceHandlerCall_641100e18aaebf81e7f7(p0, p1))); }


public static net.minecraft.util.Util$EnumOS a() { return __sourceHandlerCall_be48a186a7c68b21124e(); }

}
