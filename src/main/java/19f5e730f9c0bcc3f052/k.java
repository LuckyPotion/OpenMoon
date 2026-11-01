package com.moon.security;


public class k {

private com.moon.security.l a;

private static final long b;

private static final java.lang.String[] c;

private static final java.lang.String[] d;

private static final java.util.Map e;

public k() {
super();
}


static {
com.moon.obfuscator.Loader.registerNativesForClass(((int)(7)));
    com.moon.security.k.native_special_clinit5();
}


public native java.lang.String b(java.lang.String p0);

private static native java.lang.String a(byte[] p0);

private static native java.lang.String a(int p0, long p1);

private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.security.k.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3558_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/security/k"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private native void a__Void(byte[] p0, byte[] p1);

public static native com.moon.security.k a(byte[] p0, byte[] p1);

public native java.lang.String a(java.lang.String p0);

private static native java.io.UnsupportedEncodingException a(java.io.UnsupportedEncodingException p0);

private static final java.lang.String invokedynamic$b$7(int p0, long p1) {
return __sourceIntrinsic_659379232c94_originalDynamicSite986_0(p0, p1);
}


private static final java.lang.String invokedynamic$b$5(int p0, long p1) {
return __sourceIntrinsic_a9040c89c7b1_originalDynamicSite987_0(p0, p1);
}


private static final java.lang.String invokedynamic$b$4(int p0, long p1) {
return __sourceIntrinsic_027a497ee568_originalDynamicSite988_0(p0, p1);
}


private static native void native_special_clinit5();

private static final java.lang.String invokedynamic$b$6(int p0, long p1) {
return __sourceIntrinsic_8f0c11af7e33_originalDynamicSite989_0(p0, p1);
}


private static final java.lang.String invokedynamic$a$3(int p0, long p1) {
return __sourceIntrinsic_1307c1a29ade_originalDynamicSite990_0(p0, p1);
}


private static final java.lang.String invokedynamic$a$1(int p0, long p1) {
return __sourceIntrinsic_2c4b39690266_originalDynamicSite991_0(p0, p1);
}


private static final java.lang.String invokedynamic$a$0(int p0, long p1) {
return __sourceIntrinsic_da6c6e463c00_originalDynamicSite992_0(p0, p1);
}


private static final java.lang.String invokedynamic$a$2(int p0, long p1) {
return __sourceIntrinsic_4068f6534571_originalDynamicSite993_0(p0, p1);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3558_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_da6c6e463c00_originalDynamicSite992_0(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2c4b39690266_originalDynamicSite991_0(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4068f6534571_originalDynamicSite993_0(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_1307c1a29ade_originalDynamicSite990_0(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_027a497ee568_originalDynamicSite988_0(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a9040c89c7b1_originalDynamicSite987_0(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8f0c11af7e33_originalDynamicSite989_0(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_659379232c94_originalDynamicSite986_0(int a0, long a1) throws E;
}
