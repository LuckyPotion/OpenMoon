package moom;


public class fw<T extends java.lang.Enum<T> & net.minecraft.util.IStringSerializable> extends moom.fu<T> {

private com.google.common.collect.ImmutableSet<T> d;

private java.util.Map<java.lang.String, T> e;

private static boolean f;

private static long g;

protected fw(java.lang.String p0, java.lang.Class<T> p1, java.util.Collection<T> p2) { super((java.lang.String)null, (java.lang.Class)null); __sourceHandlerCall_cbf4656faaecf203132d(this, p0, p1, p2); }

private static native <E extends Throwable> void __sourceHandlerCall_cbf4656faaecf203132d(moom.fw a0, java.lang.String a1, java.lang.Class a2, java.util.Collection a3) throws E;
private static final class __SourceHandler_cbf4656faaecf203132d {

public static void f721(moom.fw receiver, java.lang.String p0, java.lang.Class p1, java.util.Collection p2) throws Throwable {
    long local4_life1 = (__fieldRead721_0() ^ 40286256639159L);
    __directSuperInit721_2(receiver, p0, p1);
    __fieldWrite721_4(receiver, __call721_3());
    __fieldWrite721_6(receiver, __call721_5(p2));
    java.util.Iterator local6_life8 = __call721_7(p2);
    while (__call721_9(local6_life8)) {
        java.lang.Enum local7_life12 = __cast721_11(__call721_10(local6_life8));
        java.lang.String local8_life15 = __call721_14(__cast721_13(local7_life12));
        if (__call721_17(__fieldRead721_16(receiver), local8_life15)) {
        throw new java.lang.IllegalArgumentException(__originalDynamicSite721_18(local8_life15));
    }
        __call721_20(__fieldRead721_19(receiver), local8_life15, local7_life12);
    }
    return;
}
private static native long __fieldRead721_0();
private static native void __directSuperInit721_2(moom.fw a0, java.lang.String a1, java.lang.Class a2);
private static native java.util.HashMap __call721_3();
private static native void __fieldWrite721_4(moom.fw a0, java.util.HashMap a1);
private static native com.google.common.collect.ImmutableSet __call721_5(java.util.Collection a0);
private static native void __fieldWrite721_6(moom.fw a0, com.google.common.collect.ImmutableSet a1);
private static native java.util.Iterator __call721_7(java.util.Collection a0);
private static native boolean __call721_9(java.util.Iterator a0);
private static native java.lang.Object __call721_10(java.util.Iterator a0);
private static native java.lang.Enum __cast721_11(java.lang.Object a0);
private static native net.minecraft.util.IStringSerializable __cast721_13(java.lang.Enum a0);
private static native java.lang.String __call721_14(net.minecraft.util.IStringSerializable a0);
private static native java.util.Map __fieldRead721_16(moom.fw a0);
private static native boolean __call721_17(java.util.Map a0, java.lang.String a1);
private static native java.lang.String __originalDynamicSite721_18(java.lang.String a0);
private static native java.util.Map __fieldRead721_19(moom.fw a0);
private static native java.lang.Object __call721_20(java.util.Map a0, java.lang.String a1, java.lang.Enum a2);

}


static {
g = ((long)(((moom._a)(moom._c.a(((long)(3244936937956439614L)), ((long)(210421274498545657L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(195437177880071L)))));
    if (moom.fw.a__Boolean()) {
        moom.fw.b(((boolean)(true)));
    }
}


public static void b(boolean p0) {
f = ((boolean)(p0));
    return;
}


public static boolean b__sourceReturn_aae029aa0a() {
int local0 = __sourceIntrinsic_booleanToInteger(moom.fw.a__Boolean());
    if ((local0 == 0)) {
        return ((1) != 0);
    }
    return ((0) != 0);
}


public static boolean a__Boolean() {
return ((((moom.fw.f) ? 1 : 0)) != 0);
}


private static java.lang.IllegalArgumentException a(java.lang.IllegalArgumentException p0) {
return p0;
}


public java.util.Collection<T> a__Collection() {
return this.d;
}


public java.lang.String a(T p0) {
return ((net.minecraft.util.IStringSerializable)(((net.minecraft.util.IStringSerializable)(p0)))).a__String();
}


public static <T extends java.lang.Enum<T> & net.minecraft.util.IStringSerializable> moom.fw<T> a(java.lang.String p0, java.lang.Class<T> p1) {
return moom.fw.a(((java.lang.String)(p0)), ((java.lang.Class)(p1)), ((com.google.common.base.Predicate)(com.google.common.base.Predicates.alwaysTrue())));
}


public static <T extends java.lang.Enum<T> & net.minecraft.util.IStringSerializable> moom.fw<T> a(java.lang.String p0, java.lang.Class<T> p1, com.google.common.base.Predicate<T> p2) {
return moom.fw.a(((java.lang.String)(p0)), ((java.lang.Class)(p1)), ((java.util.Collection)(com.google.common.collect.Collections2.filter(((java.util.Collection)(com.google.common.collect.Lists.newArrayList(((java.lang.Object[])(((java.lang.Enum[])(((java.lang.Class)(p1)).getEnumConstants()))))))), ((com.google.common.base.Predicate)(p2))))));
}


public static <T extends java.lang.Enum<T> & net.minecraft.util.IStringSerializable> moom.fw<T> a(java.lang.String p0, java.lang.Class<T> p1, T[] p2) {
return moom.fw.a(((java.lang.String)(p0)), ((java.lang.Class)(p1)), ((java.util.Collection)(com.google.common.collect.Lists.newArrayList(((java.lang.Object[])(p2))))));
}


public static <T extends java.lang.Enum<T> & net.minecraft.util.IStringSerializable> moom.fw<T> a(java.lang.String p0, java.lang.Class<T> p1, java.util.Collection<T> p2) {
return new moom.fw(p0, p1, p2);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3313586351ac_originalDynamicSite721_18(java.lang.String a0) throws E;

private static native int __sourceIntrinsic_booleanToInteger(boolean value);
}
