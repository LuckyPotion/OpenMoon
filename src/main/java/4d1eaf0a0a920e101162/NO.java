package moom;


public class NO {

private static java.util.Map<java.lang.String, java.lang.Integer> a;

private static long b;

public NO() {
super();
}


static {
moom.NO.b = (moom._c.a(-6239372589405107920L, -8418828990484060495L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(15742092570004L);
    moom.NO.a = new java.util.HashMap();
}

private static native <E extends Throwable> boolean __sourceHandlerCall_7471c6851769903315c8(java.lang.String a0, int a1) throws E;
private static final class __SourceHandler_7471c6851769903315c8 {

public static boolean f369(java.lang.String p0, int p1) throws Throwable {
    int forestValue369_49_0;
    int spill369_0;
    int spill369_1;
    int spill369_2;
    int spill369_3;
    int spill369_4;
    long life2_3;
    java.util.Map life5_7;
    int life4_9;
    int life6_13;
    java.lang.Integer life7_20;
    int life8_23;
    forest_join_49: {
    forest_join_40: {
    life2_3 = (__fieldRead369_0() ^ 68206699324499L);
    spill369_0 = __call369_1();
    __monitorEnter369_3((life5_7 = __fieldRead369_2()));
    life4_9 = spill369_0;
    life6_13 = __fieldRead369_6(__fieldRead369_5(__call369_4()));
    life7_20 = __cast369_10(__call369_9(__fieldRead369_7(), p0, __invokedynamic369_8(life6_13)));
    life8_23 = __call369_11(life7_20);
    spill369_1 = life6_13;
    if (!((life4_9 == 0))) {
        forestValue369_49_0 = spill369_1;
        break forest_join_49;
    }
    if (!((spill369_1 > life8_23))) {
        break forest_join_40;
    }
    spill369_2 = life6_13;
    if (!((life4_9 == 0))) {
        forestValue369_49_0 = spill369_2;
        break forest_join_49;
    }
    if (!((spill369_2 < (life8_23 + p1)))) {
        break forest_join_40;
    }
    spill369_3 = 0;
    __monitorExit369_12(life5_7);
    return __integerCategory369_13(spill369_3);
    }
    __call369_16(__fieldRead369_14(), p0, __call369_15(life6_13));
    spill369_4 = 1;
    __monitorExit369_17(life5_7);
    forestValue369_49_0 = spill369_4;
    }
    return __integerCategory369_18(forestValue369_49_0);
}
public static boolean h369_0(moom.Oo p0) throws Throwable {
    throw __call3036900_0(p0);
}
public static boolean h369_1(moom.Oo p0) throws Throwable {
    throw __call3036901_0(p0);
}
public static boolean h369_2(moom.Oo p0) throws Throwable {
    throw __call3036902_0(p0);
}
public static boolean h369_3(java.lang.Throwable p0, java.util.Map p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __monitorExit3036903_0(p1);
    throw life2_2;
}
private static native long __fieldRead369_0() throws Throwable;
private static native int __call369_1() throws Throwable;
private static native java.util.Map __fieldRead369_2() throws Throwable;
private static native void __monitorEnter369_3(java.util.Map a0) throws Throwable;
private static native net.minecraft.client.Minecraft __call369_4() throws Throwable;
private static native net.minecraft.client.renderer.EntityRenderer __fieldRead369_5(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead369_6(net.minecraft.client.renderer.EntityRenderer a0) throws Throwable;
private static native java.util.Map __fieldRead369_7() throws Throwable;
private static native java.util.function.Function __invokedynamic369_8(int a0) throws Throwable;
private static native java.lang.Object __call369_9(java.util.Map a0, java.lang.String a1, java.util.function.Function a2) throws Throwable;
private static native java.lang.Integer __cast369_10(java.lang.Object a0) throws Throwable;
private static native int __call369_11(java.lang.Integer a0) throws Throwable;
private static native void __monitorExit369_12(java.util.Map a0) throws Throwable;
private static native boolean __integerCategory369_13(int value) throws Throwable;
private static native java.util.Map __fieldRead369_14() throws Throwable;
private static native java.lang.Integer __call369_15(int a0) throws Throwable;
private static native java.lang.Object __call369_16(java.util.Map a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native void __monitorExit369_17(java.util.Map a0) throws Throwable;
private static native boolean __integerCategory369_18(int value) throws Throwable;
private static native moom.Oo __call3036900_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call3036901_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call3036902_0(moom.Oo a0) throws Throwable;
private static native void __monitorExit3036903_0(java.util.Map a0) throws Throwable;

}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static boolean a(java.lang.String p0, int p1) { return __sourceHandlerCall_7471c6851769903315c8(p0, p1); }


private static java.lang.Integer lambda$isActive$0(int p0, java.lang.String p1) {
return java.lang.Integer.valueOf(((int)(p0)));
}

}
