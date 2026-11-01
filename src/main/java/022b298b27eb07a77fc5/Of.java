package moom;


public class Of {

private static java.util.Map<java.lang.String, java.lang.Long> a;

private static long b;

public Of() {
super();
}


static {
moom.Of.b = (moom._c.a(8631846447103616701L, 8236501114684717913L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(278301625646331L);
    moom.Of.a = new java.util.HashMap();
}

private static native <E extends Throwable> boolean __sourceHandlerCall_e8161ddc081fd5acced8(java.lang.String a0, long a1) throws E;
private static final class __SourceHandler_e8161ddc081fd5acced8 {

public static boolean f382(java.lang.String p0, long p1) throws Throwable {
    int forestValue382_43_0;
    int spill382_0;
    int spill382_1;
    int spill382_2;
    int spill382_3;
    long life3_3;
    java.util.Map life6_7;
    int life5_9;
    long life7_11;
    java.lang.Long life9_18;
    long life10_21;
    forest_join_43: {
    forest_join_34: {
    life3_3 = (__fieldRead382_0() ^ 34867923132569L);
    spill382_0 = __call382_1();
    __monitorEnter382_3((life6_7 = __fieldRead382_2()));
    life5_9 = spill382_0;
    life7_11 = __call382_4();
    life9_18 = __cast382_8(__call382_7(__fieldRead382_5(), p0, __invokedynamic382_6(life7_11)));
    life10_21 = __call382_9(life9_18);
    spill382_1 = __numericCompare382_10(life7_11, (life10_21 + p1));
    if (!((life5_9 != 0))) {
        forestValue382_43_0 = spill382_1;
        break forest_join_43;
    }
    if (!((spill382_1 < 0))) {
        break forest_join_34;
    }
    spill382_2 = 0;
    __monitorExit382_11(life6_7);
    return __integerCategory382_12(spill382_2);
    }
    __call382_15(__fieldRead382_13(), p0, __call382_14(life7_11));
    spill382_3 = 1;
    __monitorExit382_16(life6_7);
    forestValue382_43_0 = spill382_3;
    }
    return __integerCategory382_17(forestValue382_43_0);
}
public static boolean h382_0(moom.Oo p0) throws Throwable {
    throw __call3038200_0(p0);
}
public static boolean h382_1(java.lang.Throwable p0, java.util.Map p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __monitorExit3038201_0(p1);
    throw life2_2;
}
private static native long __fieldRead382_0() throws Throwable;
private static native int __call382_1() throws Throwable;
private static native java.util.Map __fieldRead382_2() throws Throwable;
private static native void __monitorEnter382_3(java.util.Map a0) throws Throwable;
private static native long __call382_4() throws Throwable;
private static native java.util.Map __fieldRead382_5() throws Throwable;
private static native java.util.function.Function __invokedynamic382_6(long a0) throws Throwable;
private static native java.lang.Object __call382_7(java.util.Map a0, java.lang.String a1, java.util.function.Function a2) throws Throwable;
private static native java.lang.Long __cast382_8(java.lang.Object a0) throws Throwable;
private static native long __call382_9(java.lang.Long a0) throws Throwable;
private static native int __numericCompare382_10(long a0, long a1) throws Throwable;
private static native void __monitorExit382_11(java.util.Map a0) throws Throwable;
private static native boolean __integerCategory382_12(int value) throws Throwable;
private static native java.util.Map __fieldRead382_13() throws Throwable;
private static native java.lang.Long __call382_14(long a0) throws Throwable;
private static native java.lang.Object __call382_15(java.util.Map a0, java.lang.String a1, java.lang.Long a2) throws Throwable;
private static native void __monitorExit382_16(java.util.Map a0) throws Throwable;
private static native boolean __integerCategory382_17(int value) throws Throwable;
private static native moom.Oo __call3038200_0(moom.Oo a0) throws Throwable;
private static native void __monitorExit3038201_0(java.util.Map a0) throws Throwable;

}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static boolean a(java.lang.String p0, long p1) { return __sourceHandlerCall_e8161ddc081fd5acced8(p0, p1); }


private static java.lang.Long lambda$isActive$0(long p0, java.lang.String p1) {
return java.lang.Long.valueOf(((long)(p0)));
}

}
