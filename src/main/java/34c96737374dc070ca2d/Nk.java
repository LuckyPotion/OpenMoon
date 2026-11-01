package moom;


public class Nk {

private java.lang.String a;

private moom.bZ b;

private moom.Lu c;

private moom.Nq d;

private static long e;

private static java.lang.String[] f;

private static java.lang.String[] g;

private static java.util.Map h;

public Nk(java.lang.String p0, moom.bZ p1, moom.Lu p2) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
    this.d = (p1).a(p0);
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(-1833498741383244539L)), ((long)(4725603713811287061L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(158848763038710L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Nk.e ^ 134827853551515L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill732_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill732_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill732_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill732_14 = new byte[8];
    (__sourceSpill732_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill732_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation732_16 = __sourceSpill732_14;
    ((javax.crypto.Cipher)(__sourceSpill732_11)).init(((int)(__sourceSpill732_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill732_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation732_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[3];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "P&q\004Sñë¶ãò1PS'8bÚä¡¦ÎÞJÁ$tÍôuF/Ñ\022[¡\"CT5]\003kf÷¼ÇgÓ\027yëÒe\036'\005+P¾Aó|Êù\027~Å8b×<Æ4Øq}öóý½Hî\021l*\0203;fËûv\024lÿß=çÿ¼7Z\024hùlbÝC.ËS·+"))).length();
    int local5_life24 = 16;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill732_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill732_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill732_29)).doFinal(((byte[])(__sourceSpill732_28)));
        java.lang.String __sourceSpill732_34 = ((java.lang.String)(moom.Nk.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill732_35 = local9_life19;
        int __sourceSpill732_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill732_35)[__sourceSpill732_36] = __sourceSpill732_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    f = ((java.lang.String[])(local9_life19));
    g = ((java.lang.String[])(new java.lang.String[3]));
}

private static native <E extends Throwable> void __sourceHandlerCall_d2ed5cbc346d813d35d4(moom.Nk a0) throws E;
private static final class __SourceHandler_d2ed5cbc346d813d35d4 {

public static void f163(moom.Nk receiver) throws Throwable {
    moom.Nk forwardValue163_13_0;
    moom.Nk spill163_0;
    long life1_3;
    java.lang.String life3_5;
    forward_join_19: {
    forward_join_13: {
    life1_3 = (__fieldRead163_0() ^ 110370841289804L);
    life3_5 = __call163_1();
    spill163_0 = receiver;
    if (!((life3_5 != null))) {
        forwardValue163_13_0 = spill163_0;
        break forward_join_13;
    }
    if (!(__call163_3(__fieldRead163_2(spill163_0)))) {
        break forward_join_19;
    }
    forwardValue163_13_0 = receiver;
    }
    __call163_7(__fieldRead163_4(forwardValue163_13_0), __fieldRead163_5(receiver), __fieldRead163_6(receiver));
    }
    return;
}
public static void h163_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call2016300_0(p0);
}
public static void h163_1(java.lang.RuntimeException p0, moom.Nk p1, long p2) throws Throwable {
    java.lang.RuntimeException local4 = p0;
    java.lang.String __stackOp2016301_3_0 = __call2016301_1(__fieldRead2016301_0(p1));
    java.lang.String __stackOp2016301_3_1 = __invokedynamic2016301_2(15062, (195851463743596472L ^ p2));
    __call2016301_5(__invokedynamic2016301_4(__stackOp2016301_3_1, __stackOp2016301_3_0));
    java.lang.String spill2016301_0 = __call2016301_7(__call2016301_6(local4));
    java.lang.String __stackOp2016301_10_0 = __call2016301_8(local4);
    java.lang.String __stackOp2016301_10_1 = __invokedynamic2016301_9(27858, (9194543699932983742L ^ p2));
    __call2016301_12(__invokedynamic2016301_11(spill2016301_0, __stackOp2016301_10_1, __stackOp2016301_10_0));
    __call2016301_14(__fieldRead2016301_13(p1));
    java.lang.String __stackOp2016301_18_0 = __call2016301_16(__fieldRead2016301_15(p1));
    java.lang.String __stackOp2016301_18_1 = __invokedynamic2016301_17(30233, (2436785016571210612L ^ p2));
    __call2016301_20(__invokedynamic2016301_19(__stackOp2016301_18_1, __stackOp2016301_18_0));
    return;
}
private static native long __fieldRead163_0() throws Throwable;
private static native java.lang.String __call163_1() throws Throwable;
private static native moom.Nq __fieldRead163_2(moom.Nk a0) throws Throwable;
private static native boolean __call163_3(moom.Nq a0) throws Throwable;
private static native moom.bZ __fieldRead163_4(moom.Nk a0) throws Throwable;
private static native moom.Lu __fieldRead163_5(moom.Nk a0) throws Throwable;
private static native moom.Nq __fieldRead163_6(moom.Nk a0) throws Throwable;
private static native void __call163_7(moom.bZ a0, moom.Lu a1, moom.Nq a2) throws Throwable;
private static native java.lang.RuntimeException __call2016300_0(java.lang.RuntimeException a0) throws Throwable;
private static native moom.Nq __fieldRead2016301_0(moom.Nk a0) throws Throwable;
private static native java.lang.String __call2016301_1(moom.Nq a0) throws Throwable;
private static native java.lang.String __invokedynamic2016301_2(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic2016301_4(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call2016301_5(java.lang.String a0) throws Throwable;
private static native java.lang.Class __call2016301_6(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.String __call2016301_7(java.lang.Class a0) throws Throwable;
private static native java.lang.String __call2016301_8(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.String __invokedynamic2016301_9(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic2016301_11(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call2016301_12(java.lang.String a0) throws Throwable;
private static native moom.Nq __fieldRead2016301_13(moom.Nk a0) throws Throwable;
private static native void __call2016301_14(moom.Nq a0) throws Throwable;
private static native moom.Nq __fieldRead2016301_15(moom.Nk a0) throws Throwable;
private static native java.lang.String __call2016301_16(moom.Nq a0) throws Throwable;
private static native java.lang.String __invokedynamic2016301_17(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic2016301_19(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call2016301_20(java.lang.String a0) throws Throwable;

}


public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1355_4(((java.lang.String)(((moom.bZ)(this.b)).name())).toLowerCase(), this.a);
}


public void b() {
((moom.Nq)(this.d)).c();
    return;
}


private static java.lang.RuntimeException a(java.lang.RuntimeException p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6721_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Nk"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 1652);
    if (((moom.Nk.g)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.Nk.h)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.Nk.h)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/Nk", life9_51);
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
        life9_116 = ((java.lang.String)((moom.Nk.f)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.Nk.g)[life5_8] = moom.Nk.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.Nk.g)[life5_8];
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
        byte[] spill3383_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3383_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3383_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3383_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3383_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3383_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.Nk.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a(int p0) {
((moom.Nq)(this.d)).a(((int)(p0)));
    return;
}


public void a__Void() { __sourceHandlerCall_d2ed5cbc346d813d35d4(this); }


public java.lang.String a() {
return this.a;
}


public moom.bZ a__bZ() {
return this.b;
}


public moom.Lu a__Lu() {
return this.c;
}


public moom.Nq a__Nq() {
return this.d;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6721_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1355_4(java.lang.String a0, java.lang.String a1) throws E;
}
