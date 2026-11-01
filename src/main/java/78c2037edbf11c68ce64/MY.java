package moom;


public class MY {

private int a;

private java.lang.String b;

private java.lang.String[] c;

private java.lang.String d;

private java.lang.String[] e;

private int f;

private static long i;

private static java.lang.String[] k;

private static java.lang.String[] l;

private static java.util.Map m;

public MY(java.lang.String p0, java.lang.String[] p1, java.lang.String p2, java.lang.String[] p3, int p4) { super(); __sourceHandlerCall_ab3801cc933fd99963a5(this, p0, p1, p2, p3, p4); }


static {
i = ((long)(((moom._a)(moom._c.a(((long)(-121597072843710339L)), ((long)(6312090721093668977L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(187770841315273L)))));
    m = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.MY.i ^ 112810686650309L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill841_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill841_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill841_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill841_14 = new byte[8];
    (__sourceSpill841_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill841_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation841_16 = __sourceSpill841_14;
    ((javax.crypto.Cipher)(__sourceSpill841_11)).init(((int)(__sourceSpill841_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill841_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation841_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[5];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "èpi?©\032Õ\036'¡Tuu\021É$ÑÌG\036¾)ü\nÃÜ1]\013\0205Ô_ÝJ¸¯Øñ¬ÿÍí\020_sM]gH\037éÀö)iriSâ"))).length();
    int local5_life24 = 32;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill841_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill841_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill841_29)).doFinal(((byte[])(__sourceSpill841_28)));
        java.lang.String __sourceSpill841_34 = ((java.lang.String)(moom.MY.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill841_35 = local9_life19;
        int __sourceSpill841_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill841_35)[__sourceSpill841_36] = __sourceSpill841_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    local8_life23 = ((java.lang.String)((local6_life21 = "\033Y\016ËÐl#¤GF'¼©íå1Ü$[ÛÛÆ\b?\003Ï4=\004\033ø%yÄÈ\"X¶DÎ×¦³Á§&\006X²£8\177\n'CÔTuOÞ®w<jEÃÖÚB}]ý=Â¹ñ\"$<'À\"\021Úví\024~ý0#ç¬k@\022]\035!\177p¢¡ï\034+Jk$õgÂË¬"))).length();
    local5_life24 = 40;
    local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill841_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill841_43 = local2_life9;
        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill841_43)).doFinal(((byte[])(__sourceSpill841_42)));
        java.lang.String __sourceSpill841_48 = ((java.lang.String)(moom.MY.a(((byte[])(local10_life45))))).intern();
        java.lang.String[] __sourceSpill841_49 = local9_life19;
        int __sourceSpill841_50 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill841_49)[__sourceSpill841_50] = __sourceSpill841_48;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    k = ((java.lang.String[])(local9_life19));
    l = ((java.lang.String[])(new java.lang.String[5]));
}

private static native <E extends Throwable> void __sourceHandlerCall_ab3801cc933fd99963a5(moom.MY a0, java.lang.String a1, java.lang.String[] a2, java.lang.String a3, java.lang.String[] a4, int a5) throws E;
private static final class __SourceHandler_ab3801cc933fd99963a5 {

public static void f200023(moom.MY receiver, java.lang.String p0, java.lang.String[] p1, java.lang.String p2, java.lang.String[] p3, int p4) throws Throwable {
    long life6_3;
    forward_join_88: {
    forward_join_76: {
    forward_join_66: {
    life6_3 = (__fieldRead200023_0() ^ 62551884074296L);
    __directSuperInit200023_1(receiver);
    __fieldWrite200023_2(receiver, 0);
    __fieldWrite200023_3(receiver, null);
    __fieldWrite200023_4(receiver, null);
    __fieldWrite200023_5(receiver, null);
    __fieldWrite200023_6(receiver, null);
    __fieldWrite200023_7(receiver, 0);
    __fieldWrite200023_8(receiver, p0);
    __fieldWrite200023_9(receiver, p1);
    __fieldWrite200023_10(receiver, p2);
    __fieldWrite200023_11(receiver, p3);
    __fieldWrite200023_12(receiver, p4);
    if (!(((p1).length != (p3).length))) { break forward_join_66; }
    java.lang.Object __inlineStack200023_14Token;
    java.lang.Object __inlineStack200023_16Token;
    throw new java.lang.IllegalArgumentException(__invokedynamic200023_17(__inlineStack200023_14Output0((__inlineStack200023_14Token = __inlineStack200023_14Pack((p1).length, (p3).length, __invokedynamic200023_13(13085, (3918708194930475563L ^ life6_3))))), __inlineStack200023_14Output1(__inlineStack200023_14Token), __inlineStack200023_16Output0((__inlineStack200023_16Token = __inlineStack200023_16Pack(__inlineStack200023_14Output2(__inlineStack200023_14Token), __invokedynamic200023_15(18368, (5736888071773697776L ^ life6_3))))), __inlineStack200023_16Output1(__inlineStack200023_16Token)));
    }
    if (!((p4 >= 0))) { break forward_join_76; }
    if (!((p4 < (p1).length))) { break forward_join_76; }
    __fieldWrite200023_18(receiver, p4);
    break forward_join_88;
    }
    java.lang.Object __inlineStack200023_20Token;
    throw new java.lang.IllegalArgumentException(__invokedynamic200023_21(__inlineStack200023_20Output0((__inlineStack200023_20Token = __inlineStack200023_20Pack(p4, __invokedynamic200023_19(15373, (301493969869688124L ^ life6_3))))), __inlineStack200023_20Output1(__inlineStack200023_20Token)));
    }
    return;
}
private static native long __fieldRead200023_0() throws Throwable;
private static native void __directSuperInit200023_1(moom.MY a0) throws Throwable;
private static native void __fieldWrite200023_2(moom.MY a0, int a1) throws Throwable;
private static native void __fieldWrite200023_3(moom.MY a0, java.lang.Object a1) throws Throwable;
private static native void __fieldWrite200023_4(moom.MY a0, java.lang.Object a1) throws Throwable;
private static native void __fieldWrite200023_5(moom.MY a0, java.lang.Object a1) throws Throwable;
private static native void __fieldWrite200023_6(moom.MY a0, java.lang.Object a1) throws Throwable;
private static native void __fieldWrite200023_7(moom.MY a0, int a1) throws Throwable;
private static native void __fieldWrite200023_8(moom.MY a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite200023_9(moom.MY a0, java.lang.String[] a1) throws Throwable;
private static native void __fieldWrite200023_10(moom.MY a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite200023_11(moom.MY a0, java.lang.String[] a1) throws Throwable;
private static native void __fieldWrite200023_12(moom.MY a0, int a1) throws Throwable;
private static native java.lang.String __invokedynamic200023_13(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack200023_14Pack(int a0, int a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __inlineStack200023_14Output0(java.lang.Object token) throws Throwable;
private static native int __inlineStack200023_14Output1(java.lang.Object token) throws Throwable;
private static native int __inlineStack200023_14Output2(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic200023_15(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack200023_16Pack(int a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack200023_16Output0(java.lang.Object token) throws Throwable;
private static native int __inlineStack200023_16Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic200023_17(java.lang.String a0, int a1, java.lang.String a2, int a3) throws Throwable;
private static native void __fieldWrite200023_18(moom.MY a0, int a1) throws Throwable;
private static native java.lang.String __invokedynamic200023_19(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack200023_20Pack(int a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack200023_20Output0(java.lang.Object token) throws Throwable;
private static native int __inlineStack200023_20Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic200023_21(java.lang.String a0, int a1) throws Throwable;

}


public java.lang.String toString() {
long local1 = (moom.MY.i ^ 4036134808038L);
    java.lang.String __sourceSpill1941_6 = this.b;
    java.lang.String __sourceSpill1941_7 = ((moom.MY)(this)).b();
    java.lang.String __sourceSpill1941_8 = moom.BU.a(((java.lang.Object[])(this.c)));
    int local3 = this.f;
    java.lang.String local4 = __sourceSpill1941_8;
    java.lang.String local5 = __sourceSpill1941_7;
    return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1941_11(__sourceSpill1941_6, "=", local5, __sourceIntrinsic_a86c261fcdee_originalDynamicSite1941_9(15306, (1211860626853326375L ^ local1)), local4, __sourceIntrinsic_a86c261fcdee_originalDynamicSite1941_10(10609, (3437702065736252573L ^ local1)), local3);
}


public java.lang.String b() {
return (this.c)[this.f];
}


public java.lang.String c() {
return this.d;
}


public java.lang.String d() {
return this.b;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.MY.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6354_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/MY"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(java.util.Properties p0) {
java.lang.Object forwardValue2697_16_0;
    java.util.Properties spill2697_0;
    long life2_3;
    int[] life4_5;
    forward_join_17: {
    forward_join_16: {
    life2_3 = (moom.MY.i ^ 116711857120007L);
    life4_5 = moom.M7.b__ArrayInt();
    spill2697_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue2697_16_0 = spill2697_0;
        break forward_join_16;
    }
    if (!((spill2697_0 != null))) {
        break forward_join_17;
    }
    forwardValue2697_16_0 = ((java.util.Properties)(p0)).setProperty(((java.lang.String)(((moom.MY)(this)).d())), ((java.lang.String)(((moom.MY)(this)).b())));
    }
    recovery.source.CarrierOps.discard(forwardValue2697_16_0);
    }
    return;
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
        byte[] spill3185_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3185_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3185_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3185_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3185_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3185_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 22051);
    if (((moom.MY.l)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.MY.m)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.MY.m)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/MY", life9_51);
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
        life9_116 = ((java.lang.String)((moom.MY.k)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.MY.l)[life5_8] = moom.MY.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.MY.l)[life5_8];
}


private static java.lang.IllegalArgumentException a(java.lang.IllegalArgumentException p0) {
return p0;
}


public int a() {
return this.f;
}


public void a(int p0) {
moom.MY forwardValue2695_23_0;
    int[] spill2695_0;
    moom.MY spill2695_1;
    moom.MY spill2695_2;
    long life2_3;
    int[] life4_8;
    forward_join_26: {
    forward_join_23: {
    forward_join_22: {
    life2_3 = (moom.MY.i ^ 101514761927891L);
    spill2695_0 = moom.M7.b__ArrayInt();
    this.f = ((int)(p0));
    life4_8 = spill2695_0;
    spill2695_1 = this;
    if (!((life4_8 == null))) {
        forwardValue2695_23_0 = spill2695_1;
        break forward_join_23;
    }
    if (!((((moom.MY)(spill2695_1)).f >= 0))) {
        break forward_join_22;
    }
    spill2695_2 = this;
    if (!((life4_8 == null))) {
        forwardValue2695_23_0 = spill2695_2;
        break forward_join_23;
    }
    if (!((((moom.MY)(spill2695_2)).f >= (this.c).length))) {
        break forward_join_26;
    }
    }
    forwardValue2695_23_0 = this;
    }
    ((moom.MY)(forwardValue2695_23_0)).f = ((int)(this.a));
    }
    return;
}


public void a(boolean p0) {
moom.MY forwardValue2698_38_0;
    int forwardValue2698_52_0;
    moom.MY forwardValue2698_55_0;
    int[] spill2698_0;
    boolean spill2698_1;
    moom.MY spill2698_2;
    moom.MY spill2698_3;
    long life2_3;
    int life5_5;
    int life6_12;
    int[] life4_20;
    forward_join_57: {
    forward_join_55: {
    forward_join_52: {
    forward_join_42: {
    forward_join_38: {
    life2_3 = (moom.MY.i ^ 29267314983090L);
    life5_5 = 0;
    spill2698_0 = moom.M7.b__ArrayInt();
    life6_12 = ((this.c).length - 1);
    this.f = ((int)(moom.BU.a(((int)(this.f)), ((int)(life5_5)), ((int)(life6_12)))));
    life4_20 = spill2698_0;
    spill2698_1 = p0;
    if (!((life4_20 == null))) {
        forwardValue2698_52_0 = ((spill2698_1) ? 1 : 0);
        break forward_join_52;
    }
    if (!(spill2698_1)) {
        break forward_join_42;
    }
    moom.MY __stackOp2698_7_0 = this;
    ((moom.MY)(__stackOp2698_7_0)).f = ((int)((((moom.MY)(__stackOp2698_7_0)).f + 1)));
    spill2698_2 = this;
    if (!((life4_20 == null))) {
        forwardValue2698_38_0 = spill2698_2;
        break forward_join_38;
    }
    if (!((((moom.MY)(spill2698_2)).f > life6_12))) {
        break forward_join_57;
    }
    forwardValue2698_38_0 = this;
    }
    ((moom.MY)(forwardValue2698_38_0)).f = ((int)(life5_5));
    if (!((life4_20 != null))) {
        break forward_join_57;
    }
    }
    moom.MY __stackOp2698_12_0 = this;
    ((moom.MY)(__stackOp2698_12_0)).f = ((int)((((moom.MY)(__stackOp2698_12_0)).f - 1)));
    spill2698_3 = this;
    if (!((life4_20 == null))) {
        forwardValue2698_55_0 = spill2698_3;
        break forward_join_55;
    }
    forwardValue2698_52_0 = ((moom.MY)(spill2698_3)).f;
    }
    if (!((forwardValue2698_52_0 < life5_5))) {
        break forward_join_57;
    }
    forwardValue2698_55_0 = this;
    }
    ((moom.MY)(forwardValue2698_55_0)).f = ((int)(life6_12));
    }
    return;
}


public boolean a(java.lang.String p0) {
int forwardValue2696_42_0;
    int spill2696_0;
    int spill2696_1;
    long life2_3;
    int[] life4_5;
    forward_join_42: {
    forward_join_37: {
    forward_join_22: {
    forward_join_16: {
    life2_3 = (moom.MY.i ^ 50210075740783L);
    life4_5 = moom.M7.b__ArrayInt();
    if (!((life4_5 == null))) {
        break forward_join_22;
    }
    if (!((p0 == null))) {
        break forward_join_16;
    }
    this.f = ((int)(this.a));
    return ((0) != 0);
    }
    this.f = ((int)(org.apache.commons.lang3.ArrayUtils.indexOf(((java.lang.Object[])(this.c)), ((java.lang.Object)(p0)))));
    }
    spill2696_0 = this.f;
    if (!((life4_5 == null))) {
        forwardValue2696_42_0 = spill2696_0;
        break forward_join_42;
    }
    if (!((spill2696_0 >= 0))) {
        break forward_join_37;
    }
    spill2696_1 = this.f;
    if (!((life4_5 == null))) {
        forwardValue2696_42_0 = spill2696_1;
        break forward_join_42;
    }
    if (!((spill2696_1 < (this.c).length))) {
        break forward_join_37;
    }
    return ((1) != 0);
    }
    this.f = ((int)(this.a));
    forwardValue2696_42_0 = 0;
    }
    return ((forwardValue2696_42_0) != 0);
}


public java.lang.String a__String() {
return (this.e)[this.f];
}


public void a__Void() {
this.f = ((int)(this.a));
    return;
}


public boolean a__Boolean(java.util.Properties p0) {
java.util.Properties forwardValue2699_15_0;
    int forwardValue2699_28_0;
    int forwardValue2699_30_0;
    int[] spill2699_0;
    java.util.Properties spill2699_1;
    boolean spill2699_2;
    long life2_3;
    int[] life4_7;
    java.lang.String life5_23;
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    forward_join_15: {
    forward_join_14: {
    life2_3 = (moom.MY.i ^ 132832563664445L);
    spill2699_0 = moom.M7.b__ArrayInt();
    ((moom.MY)(this)).a__Void();
    life4_7 = spill2699_0;
    spill2699_1 = p0;
    if (!((life4_7 == null))) {
        forwardValue2699_15_0 = spill2699_1;
        break forward_join_15;
    }
    if (!((spill2699_1 == null))) {
        break forward_join_14;
    }
    return ((0) != 0);
    }
    forwardValue2699_15_0 = p0;
    }
    life5_23 = ((java.util.Properties)(forwardValue2699_15_0)).getProperty(((java.lang.String)(this.b)));
    if (!((life5_23 != null))) {
        break forward_join_29;
    }
    spill2699_2 = ((moom.MY)(this)).a(((java.lang.String)(life5_23)));
    if (!((life4_7 == null))) {
        forwardValue2699_28_0 = ((spill2699_2) ? 1 : 0);
        break forward_join_28;
    }
    if (!(spill2699_2)) {
        break forward_join_29;
    }
    forwardValue2699_28_0 = 1;
    }
    forwardValue2699_30_0 = forwardValue2699_28_0;
    break forward_join_30;
    }
    forwardValue2699_30_0 = 0;
    }
    return ((forwardValue2699_30_0) != 0);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d234c3a435be_invokedynamic200023_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6354_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1941_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1941_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1941_11(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, java.lang.String a4, java.lang.String a5, int a6) throws E;
}
