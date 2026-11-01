package moom;


class Ek {

private java.lang.String a;

private boolean b;

private int c;

private double d;

private net.minecraft.world.GameRules$ValueType e;

private static long f;

public Ek(java.lang.String p0, net.minecraft.world.GameRules$ValueType p1) {
super();
    this.e = p1;
    (this).a(p0);
}


static {
moom.Ek.f = (moom._c.a(304950948316700816L, 533179336300207088L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(239789837702818L);
}

private static native <E extends Throwable> void __sourceHandlerCall_bd87eb2b91fe94066e23(moom.Ek a0, java.lang.String a1) throws E;
private static final class __SourceHandler_bd87eb2b91fe94066e23 {

public static void f245(moom.Ek receiver, java.lang.String p0) throws Throwable {
    int forestValue245_26_0;
    moom.Ek forestValue245_42_0;
    int forestValue245_42_1;
    moom.Ek forestValue245_43_0;
    moom.Ek forestValue245_44_0;
    int forestValue245_44_1;
    java.lang.String spill245_0;
    boolean spill245_1;
    moom.Ek spill245_2;
    boolean spill245_3;
    long life2_3;
    java.lang.String life4_8;
    forest_join_44: {
    forest_join_43: {
    forest_join_42: {
    forest_join_35: {
    forest_join_31: {
    forest_join_26: {
    forest_join_23: {
    life2_3 = (__fieldRead245_0() ^ 133544947922038L);
    spill245_0 = __call245_1();
    __fieldWrite245_2(receiver, p0);
    life4_8 = spill245_0;
    if (!((life4_8 == null))) {
        break forest_join_35;
    }
    if (!((p0 != null))) {
        break forest_join_31;
    }
    spill245_1 = __call245_3(p0, "false");
    if (!((life4_8 == null))) {
        forestValue245_26_0 = __integerCategory245_4(spill245_1);
        break forest_join_26;
    }
    if (!(spill245_1)) {
        break forest_join_23;
    }
    __fieldWrite245_5(receiver, 0);
    return;
    }
    forestValue245_26_0 = __integerCategory245_7(__call245_6(p0, "true"));
    }
    if (!((forestValue245_26_0 != 0))) {
        break forest_join_31;
    }
    __fieldWrite245_8(receiver, 1);
    return;
    }
    __fieldWrite245_10(receiver, __call245_9(p0));
    }
    spill245_2 = receiver;
    spill245_3 = __fieldRead245_11(receiver);
    if (!((life4_8 == null))) {
        forestValue245_42_0 = spill245_2;
        forestValue245_42_1 = __integerCategory245_12(spill245_3);
        break forest_join_42;
    }
    if (!(spill245_3)) {
        forestValue245_43_0 = spill245_2;
        break forest_join_43;
    }
    forestValue245_42_0 = spill245_2;
    forestValue245_42_1 = 1;
    }
    forestValue245_44_0 = forestValue245_42_0;
    forestValue245_44_1 = forestValue245_42_1;
    break forest_join_44;
    }
    forestValue245_44_0 = forestValue245_43_0;
    forestValue245_44_1 = 0;
    }
    __fieldWrite245_13(forestValue245_44_0, forestValue245_44_1);
    __fieldWrite245_15(receiver, __call245_14(p0));
    __fieldWrite245_17(receiver, __call245_16(p0));
    return;
}
public static void h245_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3024500_0(p0);
}
public static void h245_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3024501_0(p0);
}
public static void h245_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3024502_0(p0);
}
public static void h245_3(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3024503_0(p0);
}
public static void h245_4(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3024504_0(p0);
}
public static void h245_5(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3024505_0(p0);
}
public static void h245_6(java.lang.NumberFormatException p0, moom.Ek p1, java.lang.String p2) throws Throwable {
    java.lang.NumberFormatException life3_2;
    life3_2 = p0;
    __fieldWrite3024506_1(p1, __call3024506_0(p2));
    return;
}
public static void h245_7(java.lang.NumberFormatException p0) throws Throwable {
    java.lang.NumberFormatException life1_2;
    life1_2 = p0;
    return;
}
private static native long __fieldRead245_0() throws Throwable;
private static native java.lang.String __call245_1() throws Throwable;
private static native void __fieldWrite245_2(moom.Ek a0, java.lang.String a1) throws Throwable;
private static native boolean __call245_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory245_4(boolean value) throws Throwable;
private static native void __fieldWrite245_5(moom.Ek a0, int a1) throws Throwable;
private static native boolean __call245_6(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory245_7(boolean value) throws Throwable;
private static native void __fieldWrite245_8(moom.Ek a0, int a1) throws Throwable;
private static native boolean __call245_9(java.lang.String a0) throws Throwable;
private static native void __fieldWrite245_10(moom.Ek a0, boolean a1) throws Throwable;
private static native boolean __fieldRead245_11(moom.Ek a0) throws Throwable;
private static native int __integerCategory245_12(boolean value) throws Throwable;
private static native void __fieldWrite245_13(moom.Ek a0, int a1) throws Throwable;
private static native int __call245_14(java.lang.String a0) throws Throwable;
private static native void __fieldWrite245_15(moom.Ek a0, int a1) throws Throwable;
private static native double __call245_16(java.lang.String a0) throws Throwable;
private static native void __fieldWrite245_17(moom.Ek a0, double a1) throws Throwable;
private static native java.lang.NumberFormatException __call3024500_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.NumberFormatException __call3024501_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.NumberFormatException __call3024502_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.NumberFormatException __call3024503_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.NumberFormatException __call3024504_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.NumberFormatException __call3024505_0(java.lang.NumberFormatException a0) throws Throwable;
private static native double __call3024506_0(java.lang.String a0) throws Throwable;
private static native void __fieldWrite3024506_1(moom.Ek a0, double a1) throws Throwable;

}


private static java.lang.NumberFormatException a(java.lang.NumberFormatException p0) {
return p0;
}


public net.minecraft.world.GameRules$ValueType a__bD() {
return this.e;
}


public int a() {
return this.c;
}


public boolean a__Boolean() {
return ((((this.b) ? 1 : 0)) != 0);
}


public java.lang.String a__String() {
return this.a;
}


public void a(java.lang.String p0) { __sourceHandlerCall_bd87eb2b91fe94066e23(this, p0); }

}
