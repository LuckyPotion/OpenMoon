package com.moon;


public class n4 {

private float a;

private float b;

private static final long c;

private static final java.lang.String[] d;

private static final java.lang.String[] e;

private static final java.util.Map f;

public n4(float p0, float p1) {
super();
    this.a = p0;
    this.b = p1;
}


public n4() {
super();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(-9215536770375254847L)), ((long)(2193501726697756341L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(121421317790202L)))));
    f = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.n4.c ^ 126303301732436L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill301_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill301_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill301_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill301_14 = new byte[8];
    (__sourceSpill301_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill301_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation301_16 = __sourceSpill301_14;
    ((javax.crypto.Cipher)(__sourceSpill301_11)).init(((int)(__sourceSpill301_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill301_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation301_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[3];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "/[!ä­X@Ü'Ëszu\020]á¦±\013c>Tsîn0Z\007\030\b¾á´·M\035\005\002ø2q\027×R/÷\035Ú!®^"))).length();
    int local5_life24 = 16;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill301_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill301_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill301_29)).doFinal(((byte[])(__sourceSpill301_28)));
        java.lang.String __sourceSpill301_34 = ((java.lang.String)(com.moon.n4.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill301_35 = local9_life19;
        int __sourceSpill301_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill301_35)[__sourceSpill301_36] = __sourceSpill301_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    d = ((java.lang.String[])(local9_life19));
    e = ((java.lang.String[])(new java.lang.String[3]));
}


public boolean equals(java.lang.Object p0) {
int forwardValue989_27_0;
    int forwardValue989_31_0;
    int forwardValue989_33_0;
    int forwardValue989_35_0;
    int spill989_0;
    int spill989_1;
    long life2_3;
    int life4_5;
    com.moon.n4 life5_16;
    forward_join_35: {
    forward_join_34: {
    forward_join_33: {
    forward_join_32: {
    forward_join_31: {
    forward_join_27: {
    life2_3 = (com.moon.n4.c ^ 95486954085513L);
    life4_5 = com.moon.n5.c__Int();
    spill989_0 = ((p0 instanceof com.moon.n4) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue989_35_0 = spill989_0;
        break forward_join_35;
    }
    if (!((spill989_0 != 0))) {
        break forward_join_34;
    }
    life5_16 = ((com.moon.n4)(p0));
    spill989_1 = recovery.source.CarrierOps.fcmpl(((float)(this.a)), ((float)(((com.moon.n4)(life5_16)).a)));
    if (!((life4_5 != 0))) {
        forwardValue989_27_0 = spill989_1;
        break forward_join_27;
    }
    if (!((spill989_1 == 0))) {
        break forward_join_32;
    }
    forwardValue989_27_0 = recovery.source.CarrierOps.fcmpl(((float)(this.b)), ((float)(((com.moon.n4)(life5_16)).b)));
    }
    if (!((life4_5 != 0))) {
        forwardValue989_31_0 = forwardValue989_27_0;
        break forward_join_31;
    }
    if (!((forwardValue989_27_0 == 0))) {
        break forward_join_32;
    }
    forwardValue989_31_0 = 1;
    }
    forwardValue989_33_0 = forwardValue989_31_0;
    break forward_join_33;
    }
    forwardValue989_33_0 = 0;
    }
    return ((forwardValue989_33_0) != 0);
    }
    forwardValue989_35_0 = 0;
    }
    return ((forwardValue989_35_0) != 0);
}


public java.lang.String toString() {
long local1_life2 = (com.moon.n4.c ^ 90191600707958L);
    float __stackOp177_7_0 = this.a;
    float __stackOp177_7_1 = this.b;
    java.lang.String __stackOp177_7_2 = __sourceIntrinsic_a86c261fcdee_originalDynamicSite177_6(8789, (6503278868746025016L ^ local1_life2));
    java.lang.String __sourceSpill177_9 = __stackOp177_7_2;
    float __sourceSpill177_10 = __stackOp177_7_0;
    float __sourceSpill177_11 = __stackOp177_7_1;
    recovery.source.CarrierOps.discard(__stackOp177_7_2);
    float __stackOp177_14_0 = __sourceSpill177_11;
    java.lang.String __stackOp177_14_1 = __sourceIntrinsic_a86c261fcdee_originalDynamicSite177_13(31048, (3707722224279151396L ^ local1_life2));
    return __sourceIntrinsic_a86c261fcdee_originalDynamicSite177_15(__sourceSpill177_9, __sourceSpill177_10, __stackOp177_14_1, __stackOp177_14_0);
}


public int hashCode() {
return java.util.Objects.hash(((java.lang.Object[])(new java.lang.Object[] {java.lang.Float.valueOf(((float)(this.a))), java.lang.Float.valueOf(((float)(this.b)))})));
}


public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
return ((com.moon.n4)(this)).a__n4();
}


public double b(com.moon.n4 p0) {
double local2 = ((double) ((this.a - ((com.moon.n4)(p0)).a) * (this.a - ((com.moon.n4)(p0)).a)));
    double local4 = ((double) ((this.b - ((com.moon.n4)(p0)).b) * (this.b - ((com.moon.n4)(p0)).b)));
    return (local2 + local4);
}


public double b() {
return ((double) ((this.a * this.a) + (this.b * this.b)));
}


public com.moon.n4 b__n4(com.moon.n4 p0) {
return new com.moon.n4((this.a - ((com.moon.n4)(p0)).a), (this.b - ((com.moon.n4)(p0)).b));
}


public com.moon.n4 b(float p0, float p1) {
this.a += p0;
    this.b += p1;
    return this;
}


public com.moon.n4 b(float p0) {
this.b = ((float)(p0));
    return this;
}


public float b__Float() {
return this.b;
}


public com.moon.n4 c(com.moon.n4 p0) {
return new com.moon.n4((this.a - ((com.moon.n4)(p0)).a), (this.b - ((com.moon.n4)(p0)).b));
}


public com.moon.n4 c(float p0) {
return new com.moon.n4((this.a * p0), (this.b * p0));
}


public com.moon.n4 d(com.moon.n4 p0) {
return new com.moon.n4((this.a + ((com.moon.n4)(p0)).a), (this.b + ((com.moon.n4)(p0)).b));
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
        byte[] spill1283_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1283_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1283_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1283_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1283_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1283_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public com.moon.n4 a(float p0) {
this.a = ((float)(p0));
    return this;
}


public com.moon.n4 a(float p0, float p1) {
this.a = ((float)(p0));
    this.b = ((float)(p1));
    return this;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 3530);
    if (((com.moon.n4.e)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.n4.f)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.n4.f)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/n4", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.n4.d)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.n4.e)[life5_8] = com.moon.n4.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.n4.e)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.n4.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral2799_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/n4"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public float a__Float() {
return this.a;
}


public double a() {
return java.lang.Math.sqrt(((double)(this.b())));
}


public com.moon.n4 a(int p0) {
return new com.moon.n4((this.a * ((float) p0)), (this.b * ((float) p0)));
}


public java.lang.String a__String() {
long local1 = (com.moon.n4.c ^ 86161885403883L);
    return java.lang.String.format(((java.lang.String)(__sourceIntrinsic_64ccfb84e285_originalDynamicSite552_1(11643, (3794515910375097481L ^ local1)))), ((java.lang.Object[])(new java.lang.Object[] {java.lang.Float.valueOf(((float)(this.a))), java.lang.Float.valueOf(((float)(this.b)))})));
}


public double a(com.moon.n4 p0) {
return java.lang.Math.sqrt(((double)(this.b(((com.moon.n4)(p0))))));
}


public com.moon.n4 a__n4() {
return new com.moon.n4(this.a, this.b);
}


public com.moon.n4 a__n4(com.moon.n4 p0) {
this.a(((float)(((com.moon.n4)(p0)).a__Float())), ((float)(((com.moon.n4)(p0)).b__Float())));
    return this;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite177_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite177_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite177_15(java.lang.String a0, float a1, java.lang.String a2, float a3) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral2799_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_64ccfb84e285_originalDynamicSite552_1(int a0, long a1) throws E;
}
