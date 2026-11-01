package moom;


public class Lg {

private java.lang.String a;

private java.lang.String b;

private moom.Le c;

private moom.Lx d;

private static int[] e;

private static long f;

private static java.lang.String[] g;

private static java.lang.String[] h;

private static java.util.Map i;

public Lg(java.lang.String p0, java.lang.String p1) {
super();
    this.a = p0;
    this.b = p1;
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(-3079591710364184915L)), ((long)(-2505074043680174055L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(66142395869906L)))));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    java.lang.Object __sourceSpill678_7 = null;
    long local0_life8 = (moom.Lg.f ^ 85553325259040L);
    moom.Lg.b(((int[])(__sourceSpill678_7)));
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill678_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill678_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill678_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill678_16 = new byte[8];
    (__sourceSpill678_16)[0] = ((byte) ((int) (local0_life8 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill678_16)[local3_life17] = ((byte) ((int) ((local0_life8 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation678_18 = __sourceSpill678_16;
    ((javax.crypto.Cipher)(__sourceSpill678_13)).init(((int)(__sourceSpill678_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill678_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation678_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life21 = new java.lang.String[3];
    int local7_life22 = 0;
    java.lang.String local6_life23;
    int local8_life25 = ((java.lang.String)((local6_life23 = "Ö&¬ÉJ²{¦\034þÛè'$ñeH<\004íè\026c³ñãb7Wþ§s?:È+CÈ5gjJuX¹u2FÏè@\026O(ÄËz\006ZñIm¯Ç$øÅ¨\025J`¶ºËôSðüß\032yñea\004\036¤!î-\013§ÙÖ8|\0024X§¢ó\tqa.ç\036(\020×zÚÊ\016yÈ\0254\024\031zãj"))).length();
    int local5_life26 = 56;
    int local4_life27 = -1;
    while (true) {
        local4_life27 += 1;
        byte[] __sourceSpill678_30 = ((java.lang.String)(((java.lang.String)(local6_life23)).substring(((int)(local4_life27)), ((int)((local4_life27 + local5_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill678_31 = local2_life11;
        byte[] local10_life33 = ((javax.crypto.Cipher)(__sourceSpill678_31)).doFinal(((byte[])(__sourceSpill678_30)));
        java.lang.String __sourceSpill678_36 = ((java.lang.String)(moom.Lg.a(((byte[])(local10_life33))))).intern();
        java.lang.String[] __sourceSpill678_37 = local9_life21;
        int __sourceSpill678_38 = local7_life22;
        local7_life22 += 1;
        (__sourceSpill678_37)[__sourceSpill678_38] = __sourceSpill678_36;
        if (!(((local4_life27 = (local4_life27 + local5_life26)) < local8_life25))) { break; }
        local5_life26 = ((java.lang.String)(local6_life23)).charAt(((int)(local4_life27)));
    }
    g = ((java.lang.String[])(local9_life21));
    h = ((java.lang.String[])(new java.lang.String[3]));
}

private static native <E extends Throwable> boolean __sourceHandlerCall_33946fb5eb4bde9e29c4(moom.Lg a0, moom.La a1) throws E;
private static final class __SourceHandler_33946fb5eb4bde9e29c4 {

public static boolean f336(moom.Lg receiver, moom.La p0) throws Throwable {
    moom.Lg forwardValue336_18_0;
    int[] spill336_0;
    moom.Lg spill336_1;
    long life2_3;
    int[] life4_11;
    moom.Lo life5_39;
    forward_join_29: {
    forward_join_18: {
    life2_3 = (__fieldRead336_0() ^ 122726502227425L);
    spill336_0 = __call336_1();
    __fieldWrite336_4(receiver, __call336_3(p0, __fieldRead336_2(receiver)));
    life4_11 = spill336_0;
    spill336_1 = receiver;
    if (!((life4_11 == null))) {
        forwardValue336_18_0 = spill336_1;
        break forward_join_18;
    }
    if (!((__fieldRead336_5(spill336_1) == null))) {
        break forward_join_29;
    }
    forwardValue336_18_0 = receiver;
    }
    java.lang.String __stackOp336_8_0 = __fieldRead336_6(forwardValue336_18_0);
    java.lang.String __stackOp336_8_1 = __invokedynamic336_7(338, (8038970625043074575L ^ life2_3));
    __call336_10(__invokedynamic336_9(__stackOp336_8_1, __stackOp336_8_0));
    return __integerCategory336_11(0);
    }
    life5_39 = new moom.Lo(p0);
    __fieldWrite336_14(receiver, __call336_13(life5_39, __fieldRead336_12(receiver)));
    return __integerCategory336_15(1);
}
public static boolean h336_0(moom.cf p0) throws Throwable {
    throw __call3033600_0(p0);
}
public static boolean h336_1(moom.cf p0) throws Throwable {
    throw __call3033601_0(p0);
}
public static boolean h336_2(moom.cf p0, moom.Lg p1, long p2, moom.Lo p3) throws Throwable {
    java.lang.String spill3033602_0;
    int spill3033602_1;
    int joinValue3033602_0_0;
    moom.cf life4_2;
    life4_2 = p0;
    java.lang.String __stackOp3033602_2_0 = __fieldRead3033602_0(p1);
    java.lang.String __stackOp3033602_2_1 = __invokedynamic3033602_1(15436, (1114006236446798608L ^ p2));
    __call3033602_4(__invokedynamic3033602_3(__stackOp3033602_2_1, __stackOp3033602_2_0));
    spill3033602_0 = __call3033602_6(__call3033602_5(life4_2));
    java.lang.String __stackOp3033602_9_0 = __call3033602_7(life4_2);
    java.lang.String __stackOp3033602_9_1 = __invokedynamic3033602_8(7446, (7568590866677404233L ^ p2));
    __call3033602_11(__invokedynamic3033602_10(spill3033602_0, __stackOp3033602_9_1, __stackOp3033602_9_0));
    spill3033602_1 = 0;
    if ((__call3033602_12() != null)) {
        __call3033602_13(new int[1]);
        joinValue3033602_0_0 = spill3033602_1;
    } else {
        joinValue3033602_0_0 = spill3033602_1;
    }
    return __integerCategory3033602_14(joinValue3033602_0_0);
}
public static boolean h336_3(moom.cf p0) throws Throwable {
    throw __call3033603_0(p0);
}
private static native long __fieldRead336_0() throws Throwable;
private static native int[] __call336_1() throws Throwable;
private static native java.lang.String __fieldRead336_2(moom.Lg a0) throws Throwable;
private static native moom.Le __call336_3(moom.La a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite336_4(moom.Lg a0, moom.Le a1) throws Throwable;
private static native moom.Le __fieldRead336_5(moom.Lg a0) throws Throwable;
private static native java.lang.String __fieldRead336_6(moom.Lg a0) throws Throwable;
private static native java.lang.String __invokedynamic336_7(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic336_9(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call336_10(java.lang.String a0) throws Throwable;
private static native boolean __integerCategory336_11(int value) throws Throwable;
private static native java.lang.String __fieldRead336_12(moom.Lg a0) throws Throwable;
private static native moom.Lx __call336_13(moom.Lo a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite336_14(moom.Lg a0, moom.Lx a1) throws Throwable;
private static native boolean __integerCategory336_15(int value) throws Throwable;
private static native moom.cf __call3033600_0(moom.cf a0) throws Throwable;
private static native moom.cf __call3033601_0(moom.cf a0) throws Throwable;
private static native java.lang.String __fieldRead3033602_0(moom.Lg a0) throws Throwable;
private static native java.lang.String __invokedynamic3033602_1(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3033602_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call3033602_4(java.lang.String a0) throws Throwable;
private static native java.lang.Class __call3033602_5(moom.cf a0) throws Throwable;
private static native java.lang.String __call3033602_6(java.lang.Class a0) throws Throwable;
private static native java.lang.String __call3033602_7(moom.cf a0) throws Throwable;
private static native java.lang.String __invokedynamic3033602_8(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3033602_10(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call3033602_11(java.lang.String a0) throws Throwable;
private static native java.lang.String[] __call3033602_12() throws Throwable;
private static native void __call3033602_13(int[] a0) throws Throwable;
private static native boolean __integerCategory3033602_14(int value) throws Throwable;
private static native moom.cf __call3033603_0(moom.cf a0) throws Throwable;

}


public static void b(int[] p0) {
e = ((int[])(p0));
    return;
}


public static int[] b() {
return moom.Lg.e;
}


private static java.lang.String a(byte[] p0) {
int life1_1;
    int life2_5;
    char[] life3_7;
    int life4_9;
    int life5_19;
    int life6_39;
    int life5_44;
    int life6_52;
    int life6_71;
    int life5_76;
    int life6_86;
    int life5_91;
    int life6_99;
    life1_1 = 0;
    life3_7 = new char[(life2_5 = (p0).length)];
    life4_9 = 0;
    loop_region_10: while ((life4_9 < life2_5)) {
        if (((life5_19 = (255 & (p0)[life4_9])) < 192)) {
        (life3_7)[(life1_1++)] = ((char) life5_19);
    } else {
        if ((life5_19 < 224)) {
        life6_39 = ((int)(((char) (((char) (life5_19 & 31)) << 6))));
        byte[] spill3042_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3042_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3042_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3042_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3042_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3042_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.String a(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 18554);
    if (((moom.Lg.h)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.Lg.i)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.Lg.i)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/Lg", life9_51);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_71: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life4_21)[1])))).generateSecret(((java.security.spec.KeySpec)(life7_92)));
        ((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).init(((int)(2)), ((java.security.Key)(life8_99)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life4_21)[2])))));
        life9_116 = ((java.lang.String)((moom.Lg.g)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.Lg.h)[life5_8] = moom.Lg.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.Lg.h)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.Lg.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5964_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Lg"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.cf a(moom.cf p0) {
return p0;
}


public boolean a(moom.La p0) { return __sourceHandlerCall_33946fb5eb4bde9e29c4(this, p0); }


public void a() {
float local1 = ((moom.Lx)(this.d)).a();
    ((moom.Le)(this.c)).a(((float)(local1)));
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5964_0() throws E;
}
