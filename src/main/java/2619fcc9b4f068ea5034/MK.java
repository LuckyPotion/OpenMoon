package moom;


public class MK implements moom.Mv {

protected java.io.File a;

private static long b;

public MK(java.lang.String p0, java.io.File p1) {
super();
    this.a = p1;
}


static {
moom.MK.b = (moom._c.a(8307206856121592593L, 2226183401963575753L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(45362271339896L);
}

private static native <E extends Throwable> java.io.InputStream __sourceHandlerCall_e3744830962132d70030(moom.MK a0, java.lang.String a1) throws E;
private static final class __SourceHandler_e3744830962132d70030 {

public static java.io.InputStream f329(moom.MK receiver, java.lang.String p0) throws Throwable {
    long life2_3;
    java.lang.String life4_8;
    java.io.File life5_15;
    life2_3 = (__fieldRead329_0() ^ 56211299272693L);
    life4_8 = __call329_1(p0, "/", "/");
    life5_15 = new java.io.File(__fieldRead329_2(receiver), life4_8);
    return ((!__call329_3(life5_15)) ? null : new java.io.BufferedInputStream(new java.io.FileInputStream(life5_15)));
}
public static java.io.InputStream h329_0(java.lang.Exception p0) throws Throwable {
    throw __call2032900_0(p0);
}
public static java.io.InputStream h329_1(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    return null;
}
private static native long __fieldRead329_0() throws Throwable;
private static native java.lang.String __call329_1(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.io.File __fieldRead329_2(moom.MK a0) throws Throwable;
private static native boolean __call329_3(java.io.File a0) throws Throwable;
private static native java.lang.Exception __call2032900_0(java.lang.Exception a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_2eb94e22a9956f1e9563(moom.MK a0, java.lang.String a1) throws E;
private static final class __SourceHandler_2eb94e22a9956f1e9563 {

public static boolean f813(moom.MK receiver, java.lang.String p0) throws Throwable {
    int forwardValue813_22_0;
    int forwardValue813_26_0;
    int forwardValue813_28_0;
    int spill813_0;
    boolean spill813_1;
    long life2_3;
    java.io.File life5_13;
    int life4_14;
    forward_join_28: {
    forward_join_27: {
    forward_join_26: {
    forward_join_22: {
    life2_3 = (__fieldRead813_0() ^ 139936084178988L);
    spill813_0 = __call813_1();
    life5_13 = new java.io.File(__fieldRead813_2(receiver), __call813_3(p0, 1));
    life4_14 = spill813_0;
    spill813_1 = __call813_4(life5_13);
    if (!((life4_14 != 0))) {
        forwardValue813_22_0 = __integerCategory813_5(spill813_1);
        break forward_join_22;
    }
    if (!(spill813_1)) {
        break forward_join_27;
    }
    forwardValue813_22_0 = __integerCategory813_7(__call813_6(life5_13));
    }
    if (!((life4_14 != 0))) {
        forwardValue813_26_0 = forwardValue813_22_0;
        break forward_join_26;
    }
    if (!((forwardValue813_22_0 != 0))) {
        break forward_join_27;
    }
    forwardValue813_26_0 = 1;
    }
    forwardValue813_28_0 = forwardValue813_26_0;
    break forward_join_28;
    }
    forwardValue813_28_0 = 0;
    }
    return __integerCategory813_8(forwardValue813_28_0);
}
public static void h813_0(moom.Oo p0) throws Throwable {
    throw __call1081300_0(p0);
}
public static void h813_1(moom.Oo p0) throws Throwable {
    throw __call1081301_0(p0);
}
public static void h813_2(moom.Oo p0) throws Throwable {
    throw __call1081302_0(p0);
}
private static native long __fieldRead813_0() throws Throwable;
private static native int __call813_1() throws Throwable;
private static native java.io.File __fieldRead813_2(moom.MK a0) throws Throwable;
private static native java.lang.String __call813_3(java.lang.String a0, int a1) throws Throwable;
private static native boolean __call813_4(java.io.File a0) throws Throwable;
private static native int __integerCategory813_5(boolean value) throws Throwable;
private static native boolean __call813_6(java.io.File a0) throws Throwable;
private static native int __integerCategory813_7(boolean value) throws Throwable;
private static native boolean __integerCategory813_8(int value) throws Throwable;
private static native java.lang.Exception __call1081300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1081301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1081302_0(moom.Oo a0) throws Throwable;

}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public java.lang.String a() {
return ((java.io.File)(this.a)).getName();
}


public boolean a__Boolean(java.lang.String p0) { return __sourceHandlerCall_2eb94e22a9956f1e9563(this, p0); }


public java.io.InputStream a(java.lang.String p0) { return __sourceHandlerCall_e3744830962132d70030(this, p0); }


public void a__Void() {
return;
}

}
