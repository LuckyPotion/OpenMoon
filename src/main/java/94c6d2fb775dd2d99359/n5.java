package com.moon;


public class n5 {

public double a;

public double b;

public double c;

private static int d;

private static final long e;

private static final java.lang.String[] f;

private static final java.lang.String[] g;

private static final java.util.Map h;

public n5() {
super();
}


public n5(double p0, double p1, double p2) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(-7400835425753722331L)), ((long)(-2026624818044693483L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(251770174467292L)))));

    int __sourceSpill408_6 = 0;

    h = ((java.util.Map)(new java.util.HashMap(13)));

    com.moon.n5.b(((int)(__sourceSpill408_6)));

    long local0_life9 = (com.moon.n5.e ^ 131446758608848L);

    javax.crypto.Cipher local2_life11;

    javax.crypto.Cipher __sourceSpill408_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill408_14 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill408_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill408_16 = new byte[8];

    (__sourceSpill408_16)[0] = ((byte) ((int) (local0_life9 >>> 56)));

    int local3_life17 = 1;

    while ((local3_life17 < 8)) {

        (__sourceSpill408_16)[local3_life17] = ((byte) ((int) ((local0_life9 << (local3_life17 * 8)) >>> 56)));

        local3_life17 += 1;

    }

    byte[] __sourcePreallocation408_18 = __sourceSpill408_16;

    ((javax.crypto.Cipher)(__sourceSpill408_13)).init(((int)(__sourceSpill408_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill408_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation408_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local9_life21 = new java.lang.String[4];

    int local7_life22 = 0;

    java.lang.String local6_life23;

    int local8_life25 = ((java.lang.String)((local6_life23 = "ô[\0009\003\0173+ú\005¬\006y\"Íy(ÔíM\020V\0042ÈR'/Ào\013ÉqÿYÄÁ|£9é\fg£ó\027æÐ·\001"))).length();

    int local5_life26 = 16;

    int local4_life27 = -1;

    while (true) {

        local4_life27 += 1;

        byte[] __sourceSpill408_30 = ((java.lang.String)(((java.lang.String)(local6_life23)).substring(((int)(local4_life27)), ((int)((local4_life27 + local5_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill408_31 = local2_life11;

        byte[] local10_life33 = ((javax.crypto.Cipher)(__sourceSpill408_31)).doFinal(((byte[])(__sourceSpill408_30)));

        java.lang.String __sourceSpill408_36 = ((java.lang.String)(com.moon.n5.a(((byte[])(local10_life33))))).intern();

        java.lang.String[] __sourceSpill408_37 = local9_life21;

        int __sourceSpill408_38 = local7_life22;

        local7_life22 += 1;

        (__sourceSpill408_37)[__sourceSpill408_38] = __sourceSpill408_36;

        if (!(((local4_life27 = (local4_life27 + local5_life26)) < local8_life25))) { break; }

        local5_life26 = ((java.lang.String)(local6_life23)).charAt(((int)(local4_life27)));

    }

    local8_life25 = ((java.lang.String)((local6_life23 = "\023Ïù6Ø'\036\032íó\001\036Li\020þPGk\001IFÑË³öaê"))).length();

    local5_life26 = 16;

    local4_life27 = -1;

    while (true) {

        local4_life27 += 1;

        byte[] __sourceSpill408_44 = ((java.lang.String)(((java.lang.String)(local6_life23)).substring(((int)(local4_life27)), ((int)((local4_life27 + local5_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill408_45 = local2_life11;

        byte[] local10_life47 = ((javax.crypto.Cipher)(__sourceSpill408_45)).doFinal(((byte[])(__sourceSpill408_44)));

        java.lang.String __sourceSpill408_50 = ((java.lang.String)(com.moon.n5.a(((byte[])(local10_life47))))).intern();

        java.lang.String[] __sourceSpill408_51 = local9_life21;

        int __sourceSpill408_52 = local7_life22;

        local7_life22 += 1;

        (__sourceSpill408_51)[__sourceSpill408_52] = __sourceSpill408_50;

        if (!(((local4_life27 = (local4_life27 + local5_life26)) < local8_life25))) { break; }

        local5_life26 = ((java.lang.String)(local6_life23)).charAt(((int)(local4_life27)));

    }

    f = ((java.lang.String[])(local9_life21));

    g = ((java.lang.String[])(new java.lang.String[4]));
}


public boolean equals(java.lang.Object p0) {
java.lang.Object forwardValue990_14_0;
    java.lang.Object forwardValue990_25_0;
    int forwardValue990_40_0;
    int forwardValue990_48_0;
    int forwardValue990_52_0;
    int forwardValue990_54_0;
    com.moon.n5 spill990_0;
    java.lang.Class spill990_1;
    int spill990_2;
    long life2_3;
    int life4_5;
    com.moon.n5 life5_39;
    forward_join_54: {
    forward_join_53: {
    forward_join_52: {
    forward_join_48: {
    forward_join_40: {
    forward_join_25: {
    forward_join_24: {
    forward_join_22: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (com.moon.n5.e ^ 105987210280651L);
    life4_5 = com.moon.n5.b__Int();
    spill990_0 = this;
    if (!((life4_5 == 0))) {
        forwardValue990_14_0 = spill990_0;
        break forward_join_14;
    }
    if (!((spill990_0 == p0))) {
        break forward_join_13;
    }
    return ((1) != 0);
    }
    forwardValue990_14_0 = p0;
    }
    if (!((forwardValue990_14_0 != null))) {
        break forward_join_22;
    }
    spill990_1 = ((java.lang.Object)(this)).getClass();
    if (!((life4_5 == 0))) {
        forwardValue990_25_0 = spill990_1;
        break forward_join_25;
    }
    if (!((spill990_1 != ((java.lang.Object)(p0)).getClass()))) {
        break forward_join_24;
    }
    }
    return ((0) != 0);
    }
    forwardValue990_25_0 = p0;
    }
    life5_39 = ((com.moon.n5)(forwardValue990_25_0));
    spill990_2 = java.lang.Double.compare(((double)(((com.moon.n5)(life5_39)).a)), ((double)(this.a)));
    if (!((life4_5 == 0))) {
        forwardValue990_40_0 = spill990_2;
        break forward_join_40;
    }
    if (!((spill990_2 == 0))) {
        break forward_join_53;
    }
    forwardValue990_40_0 = java.lang.Double.compare(((double)(((com.moon.n5)(life5_39)).b)), ((double)(this.b)));
    }
    if (!((life4_5 == 0))) {
        forwardValue990_48_0 = forwardValue990_40_0;
        break forward_join_48;
    }
    if (!((forwardValue990_40_0 == 0))) {
        break forward_join_53;
    }
    forwardValue990_48_0 = java.lang.Double.compare(((double)(((com.moon.n5)(life5_39)).c)), ((double)(this.c)));
    }
    if (!((life4_5 == 0))) {
        forwardValue990_52_0 = forwardValue990_48_0;
        break forward_join_52;
    }
    if (!((forwardValue990_48_0 == 0))) {
        break forward_join_53;
    }
    forwardValue990_52_0 = 1;
    }
    forwardValue990_54_0 = forwardValue990_52_0;
    break forward_join_54;
    }
    forwardValue990_54_0 = 0;
    }
    return ((forwardValue990_54_0) != 0);
}


public java.lang.String toString() {
long local1 = (com.moon.n5.e ^ 28683915672047L);
    double __sourceSpill831_4 = this.a;
    double __sourceSpill831_5 = this.b;
    double local3 = this.c;
    double local5 = __sourceSpill831_5;
    double local7 = __sourceSpill831_4;
    return __sourceIntrinsic_a86c261fcdee_originalDynamicSite831_9(__sourceIntrinsic_a86c261fcdee_originalDynamicSite831_6(26052, (5787532843773006901L ^ local1)), local7, __sourceIntrinsic_a86c261fcdee_originalDynamicSite831_7(7663, (4761437929102371868L ^ local1)), local5, __sourceIntrinsic_a86c261fcdee_originalDynamicSite831_8(17388, (8431029725729239580L ^ local1)), local3);
}


public int hashCode() {
return java.util.Objects.hash(((java.lang.Object[])(new java.lang.Object[] {java.lang.Double.valueOf(((double)(this.a))), java.lang.Double.valueOf(((double)(this.b))), java.lang.Double.valueOf(((double)(this.c)))})));
}


public double b() {
return ((this.a * this.a) + (this.c * this.c));
}


public double b(com.moon.n5 p0) {
long life2_3;
    double life5_15;
    double life7_28;
    int life4_29;
    double life9_41;
    life2_3 = (com.moon.n5.e ^ 58659936273990L);
    life5_15 = ((this.a - ((com.moon.n5)(p0)).a) * (this.a - ((com.moon.n5)(p0)).a));
    int spill2313_0 = com.moon.n5.b__Int();
    life7_28 = ((this.b - ((com.moon.n5)(p0)).b) * (this.b - ((com.moon.n5)(p0)).b));
    life4_29 = spill2313_0;
    life9_41 = ((this.c - ((com.moon.n5)(p0)).c) * (this.c - ((com.moon.n5)(p0)).c));
    double spill2313_1 = ((life5_15 + life7_28) + life9_41);
    if ((life4_29 != 0)) {
        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[3])));
    }
    return spill2313_1;
}


public static int b__Int() {
return com.moon.n5.d;
}


public static void b(int p0) {
com.moon.n5.d = ((int)(p0));
    return;
}


public com.moon.n5 b__n5(com.moon.n5 p0) {
return new com.moon.n5((this.a - ((com.moon.n5)(p0)).a), (this.b - ((com.moon.n5)(p0)).b), (this.c - ((com.moon.n5)(p0)).c));
}


public com.moon.n5 b(double p0, double p1, double p2) {
this.a += p0;
    this.b += p1;
    this.c += p2;
    return this;
}


public com.moon.n5 b(double p0) {
this.b = ((double)(p0));
    return this;
}


public double e() {
return this.a;
}


public com.moon.n5 c(double p0, double p1, double p2) {
this.a *= p0;
    this.b *= p1;
    this.c *= p2;
    return this;
}


public com.moon.n5 c(double p0) {
this.c = ((double)(p0));
    return this;
}


public static int c__Int() {
int local0 = com.moon.n5.b__Int();
    if ((local0 == 0)) {
        return 18;
    }
    return 0;
}


public double c() {
return java.lang.Math.sqrt(((double)(this.d())));
}


public double f() {
return this.b;
}


public double d() {
return (((this.a * this.a) + (this.b * this.b)) + (this.c * this.c));
}


public com.moon.n5 d(double p0) {
this.b *= p0;
    return this;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral2802_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/n5"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 7293);
    if (((com.moon.n5.g)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.n5.h)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.n5.h)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/n5", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.n5.f)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.n5.g)[life5_8] = com.moon.n5.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.n5.g)[life5_8];
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
        byte[] spill1285_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1285_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1285_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1285_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1285_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1285_2)[life4_9];
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
    java.lang.String local7 = com.moon.n5.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(com.moon.n5 p0, double p1, double p2, double p3) {
this.a = ((double)((((com.moon.n5)(p0)).a + p1)));
    this.b = ((double)((((com.moon.n5)(p0)).b + p2)));
    this.c = ((double)((((com.moon.n5)(p0)).c + p3)));
    return;
}


public com.moon.n5 a(double p0) {
this.a = ((double)(p0));
    return this;
}


public double a(com.moon.n5 p0) {
return java.lang.Math.sqrt(((double)(this.b(((com.moon.n5)(p0))))));
}


public com.moon.n5 a(double p0, double p1) {
this.a *= p0;
    this.c *= p1;
    return this;
}


public com.moon.n5 a(double p0, double p1, double p2) {
this.a = ((double)(p0));
    this.b = ((double)(p1));
    this.c = ((double)(p2));
    return this;
}


public double a() {
return java.lang.Math.sqrt(((double)(this.d())));
}


public java.lang.String a__String() {
long local1 = (com.moon.n5.e ^ 86515129023554L);
    return java.lang.String.format(((java.lang.String)(__sourceIntrinsic_64ccfb84e285_originalDynamicSite558_1(8497, (5848953634026198382L ^ local1)))), ((java.lang.Object[])(new java.lang.Object[] {java.lang.Double.valueOf(((double)(this.a))), java.lang.Double.valueOf(((double)(this.b))), java.lang.Double.valueOf(((double)(this.c)))})));
}


public com.moon.n5 a__n5() {
double local1_life7 = java.lang.Math.sqrt(((double)((((this.a * this.a) + (this.b * this.b)) + (this.c * this.c)))));
    this.a /= local1_life7;
    this.b /= local1_life7;
    this.c /= local1_life7;
    return this;
}


public com.moon.n5 a__n5(com.moon.n5 p0) {
this.a /= ((com.moon.n5)(p0)).a;
    this.c /= ((com.moon.n5)(p0)).c;
    this.b /= ((com.moon.n5)(p0)).b;
    return this;
}


public double g() {
return this.c;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral2802_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_64ccfb84e285_originalDynamicSite558_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite831_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite831_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite831_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite831_9(java.lang.String a0, double a1, java.lang.String a2, double a3, java.lang.String a4, double a5) throws E;
}
