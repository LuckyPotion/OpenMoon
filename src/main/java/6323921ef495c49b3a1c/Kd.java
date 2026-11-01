package moom;


public class Kd {

private final int a;

private final int b;

private static final long c;

private static final java.lang.String[] d;

private static final java.lang.String[] e;

private static final java.util.Map f;

public Kd(int p0, int p1) {
super();
    this.a = java.lang.Math.min(p0, p1);
    this.b = java.lang.Math.max(p0, p1);
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(-2735824137223196720L)), ((long)(-8099479099002228168L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(235518225134434L)))));
    f = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Kd.c ^ 39123452374363L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill651_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill651_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill651_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill651_14 = new byte[8];
    (__sourceSpill651_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill651_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation651_16 = __sourceSpill651_14;
    ((javax.crypto.Cipher)(__sourceSpill651_11)).init(((int)(__sourceSpill651_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill651_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation651_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[2];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "fç¢´ÔÁîLGÐ\003²°4j\020ý4¢Ä\fÎ\002Üìà·\027Âj½"))).length();
    int local5_life24 = 16;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill651_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill651_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill651_29)).doFinal(((byte[])(__sourceSpill651_28)));
        java.lang.String __sourceSpill651_34 = ((java.lang.String)(moom.Kd.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill651_35 = local9_life19;
        int __sourceSpill651_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill651_35)[__sourceSpill651_36] = __sourceSpill651_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    d = ((java.lang.String[])(local9_life19));
    e = ((java.lang.String[])(new java.lang.String[2]));
}


public java.lang.String toString() {
long local1_life2 = (moom.Kd.c ^ 44814107559057L);
    int __stackOp553_7_0 = this.a;
    int __stackOp553_7_1 = this.b;
    java.lang.String __stackOp553_7_2 = __sourceIntrinsic_a86c261fcdee_originalDynamicSite553_6(3403, (5418160967024521498L ^ local1_life2));
    java.lang.String __sourceSpill553_9 = __stackOp553_7_2;
    int __sourceSpill553_10 = __stackOp553_7_0;
    int __sourceSpill553_11 = __stackOp553_7_1;
    recovery.source.CarrierOps.discard(__stackOp553_7_2);
    int __stackOp553_14_0 = __sourceSpill553_11;
    java.lang.String __stackOp553_14_1 = __sourceIntrinsic_a86c261fcdee_originalDynamicSite553_13(17007, (6288171727158181439L ^ local1_life2));
    return __sourceIntrinsic_a86c261fcdee_originalDynamicSite553_15(__sourceSpill553_9, __sourceSpill553_10, __stackOp553_14_1, __stackOp553_14_0);
}


public int b() {
return this.b;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 12591);
    if (((moom.Kd.e)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.Kd.f)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.Kd.f)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/Kd", life9_51);
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
        life9_116 = ((java.lang.String)((moom.Kd.d)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.Kd.e)[life5_8] = moom.Kd.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.Kd.e)[life5_8];
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
        byte[] spill2926_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2926_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2926_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2926_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2926_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2926_2)[life4_9];
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
    java.lang.String local7 = moom.Kd.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5736_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Kd"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a(int p0) {
int forwardValue2501_17_0;
    int forwardValue2501_17_1;
    int forwardValue2501_19_0;
    int forwardValue2501_21_0;
    int spill2501_0;
    int spill2501_1;
    int spill2501_2;
    long life2_3;
    int life4_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    forward_join_17: {
    life2_3 = (moom.Kd.c ^ 105225600520588L);
    life4_5 = moom.J_.b();
    spill2501_0 = p0;
    spill2501_1 = this.a;
    if (!((life4_5 == 0))) {
        forwardValue2501_17_0 = spill2501_0;
        forwardValue2501_17_1 = spill2501_1;
        break forward_join_17;
    }
    if (!((spill2501_0 >= spill2501_1))) {
        break forward_join_20;
    }
    spill2501_2 = p0;
    if (!((life4_5 == 0))) {
        forwardValue2501_19_0 = spill2501_2;
        break forward_join_19;
    }
    forwardValue2501_17_0 = spill2501_2;
    forwardValue2501_17_1 = this.b;
    }
    if (!((forwardValue2501_17_0 <= forwardValue2501_17_1))) {
        break forward_join_20;
    }
    forwardValue2501_19_0 = 1;
    }
    forwardValue2501_21_0 = forwardValue2501_19_0;
    break forward_join_21;
    }
    forwardValue2501_21_0 = 0;
    }
    return ((forwardValue2501_21_0) != 0);
}


public int a() {
return this.a;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite553_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite553_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite553_15(java.lang.String a0, int a1, java.lang.String a2, int a3) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5736_0() throws E;
}
