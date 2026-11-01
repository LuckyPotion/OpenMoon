package com.moon.security;


public class f {

private static final long a;

private static final java.lang.String[] b;

private static final java.lang.String[] c;

private static final java.util.Map d;

public f() {
super();
}


static {
com.moon.obfuscator.Loader.registerNativesForClass(((int)(2)));
    com.moon.security.f.native_special_clinit3();
}


public static native java.lang.String b(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws java.lang.Exception;

private static native java.lang.String a(int p0, long p1);

private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.security.f.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3550_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/security/f"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static native java.lang.String a(byte[] p0);

public static native java.lang.String a(java.lang.String p0, java.lang.String p1, java.lang.String p2);

private static final java.lang.String invokedynamic$b$5(int p0, long p1) {
return __sourceIntrinsic_a9040c89c7b1_originalDynamicSite948_0(p0, p1);
}


private static final java.lang.String invokedynamic$b$3(int p0, long p1) {
return __sourceIntrinsic_c84199aecdc9_originalDynamicSite949_0(p0, p1);
}


private static final java.lang.String invokedynamic$b$4(int p0, long p1) {
return __sourceIntrinsic_027a497ee568_originalDynamicSite950_0(p0, p1);
}


private static native void native_special_clinit3();

private static final java.lang.String invokedynamic$a$1(int p0, long p1) {
return __sourceIntrinsic_2c4b39690266_originalDynamicSite951_0(p0, p1);
}


private static final java.lang.String invokedynamic$a$0(int p0, long p1) {
return __sourceIntrinsic_da6c6e463c00_originalDynamicSite952_0(p0, p1);
}


private static final java.lang.String invokedynamic$a$2(int p0, long p1) {
return __sourceIntrinsic_4068f6534571_originalDynamicSite953_0(p0, p1);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3550_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_da6c6e463c00_originalDynamicSite952_0(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2c4b39690266_originalDynamicSite951_0(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4068f6534571_originalDynamicSite953_0(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c84199aecdc9_originalDynamicSite949_0(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_027a497ee568_originalDynamicSite950_0(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a9040c89c7b1_originalDynamicSite948_0(int a0, long a1) throws E;
}
