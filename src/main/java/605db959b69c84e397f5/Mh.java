package moom;


public class Mh {

private boolean a;

private int b;

private int c;

private int d;

private int e;

private static final long f;

private static final java.lang.String[] g;

private static final java.lang.String[] h;

private static final java.util.Map i;

public Mh(boolean p0, int p1, int p2) {
this(p0, p1, p2, p1, p2);
}


public Mh(boolean p0, int p1, int p2, int p3, int p4) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
    this.d = p3;
    this.e = p4;
}


public Mh(boolean p0) {
this(p0, 1, 0);
    return;
}


public Mh() {
this(false, 1, 0);
    return;
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(-2260446773382690023L)), ((long)(-4687709636976088536L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(274377513847830L)))));

    i = ((java.util.Map)(new java.util.HashMap(13)));

    long local0_life7 = (moom.Mh.f ^ 54805130527411L);

    javax.crypto.Cipher local2_life9;

    javax.crypto.Cipher __sourceSpill849_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill849_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill849_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill849_14 = new byte[8];

    (__sourceSpill849_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));

    int local3_life15 = 1;

    while ((local3_life15 < 8)) {

        (__sourceSpill849_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));

        local3_life15 += 1;

    }

    byte[] __sourcePreallocation849_16 = __sourceSpill849_14;

    ((javax.crypto.Cipher)(__sourceSpill849_11)).init(((int)(__sourceSpill849_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill849_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation849_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local9_life19 = new java.lang.String[5];

    int local7_life20 = 0;

    java.lang.String local6_life21;

    int local8_life23 = ((java.lang.String)((local6_life21 = "\032=27ÍË\n\006ré\020Ñc·þÈ\026ÙË¼9Lö­+ Mü²dÎ\037Ä$0@ü%\tPÚÌ/Þd÷XâèDÙô!z"))).length();

    int local5_life24 = 16;

    int local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill849_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill849_29 = local2_life9;

        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill849_29)).doFinal(((byte[])(__sourceSpill849_28)));

        java.lang.String __sourceSpill849_34 = ((java.lang.String)(moom.Mh.a(((byte[])(local10_life31))))).intern();

        java.lang.String[] __sourceSpill849_35 = local9_life19;

        int __sourceSpill849_36 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill849_35)[__sourceSpill849_36] = __sourceSpill849_34;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    local8_life23 = ((java.lang.String)((local6_life21 = "ÚzÆg|uÅ?Ïï{\007pfC\031ì¤¡O\022@ÌW\017è~± ©²ä÷q¨3X\032¨yò«iîò\037; ú{JÝXÑµÙN"))).length();

    local5_life24 = 32;

    local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill849_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill849_43 = local2_life9;

        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill849_43)).doFinal(((byte[])(__sourceSpill849_42)));

        java.lang.String __sourceSpill849_48 = ((java.lang.String)(moom.Mh.a(((byte[])(local10_life45))))).intern();

        java.lang.String[] __sourceSpill849_49 = local9_life19;

        int __sourceSpill849_50 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill849_49)[__sourceSpill849_50] = __sourceSpill849_48;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    g = ((java.lang.String[])(local9_life19));

    h = ((java.lang.String[])(new java.lang.String[5]));
}


public java.lang.String toString() {
long local1 = (moom.Mh.f ^ 25355316859816L);
    boolean __sourceSpill1957_6 = this.a;
    int __sourceSpill1957_7 = this.b;
    int __sourceSpill1957_8 = this.c;
    int __sourceSpill1957_9 = this.d;
    int local3 = this.e;
    int local4 = __sourceSpill1957_9;
    int local5 = __sourceSpill1957_8;
    int local6 = __sourceSpill1957_7;
    boolean local7 = __sourceSpill1957_6;
    return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1957_15(__sourceIntrinsic_a86c261fcdee_originalDynamicSite1957_10(26174, (5544490394976299067L ^ local1)), local7, __sourceIntrinsic_a86c261fcdee_originalDynamicSite1957_11(6594, (223715079172249540L ^ local1)), local6, __sourceIntrinsic_a86c261fcdee_originalDynamicSite1957_12(7852, (8829176729865146539L ^ local1)), local5, __sourceIntrinsic_a86c261fcdee_originalDynamicSite1957_13(16240, (8123855840398897523L ^ local1)), local4, __sourceIntrinsic_a86c261fcdee_originalDynamicSite1957_14(25461, (1635297066378931569L ^ local1)), local3);
}


public void b__Void() {
this.a = ((boolean)(false));
    return;
}


public boolean b__Boolean() {
int forwardValue2717_21_0;
    int forwardValue2717_23_0;
    int spill2717_0;
    int spill2717_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    life1_3 = (moom.Mh.f ^ 91083628797255L);
    life3_5 = moom.Mi.b__Arrayr3();
    spill2717_0 = this.b;
    if (!((life3_5 == null))) {
        forwardValue2717_21_0 = spill2717_0;
        break forward_join_21;
    }
    if (!((spill2717_0 == this.d))) {
        break forward_join_20;
    }
    spill2717_1 = this.c;
    if (!((life3_5 == null))) {
        forwardValue2717_21_0 = spill2717_1;
        break forward_join_21;
    }
    if (!((spill2717_1 != this.e))) {
        break forward_join_22;
    }
    }
    forwardValue2717_21_0 = 1;
    }
    forwardValue2717_23_0 = forwardValue2717_21_0;
    break forward_join_23;
    }
    forwardValue2717_23_0 = 0;
    }
    return ((forwardValue2717_23_0) != 0);
}


public int b() {
return this.c;
}


public int c() {
return this.d;
}


public int d() {
return this.e;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6406_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Mh"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.Mh.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 29268);
    if (((moom.Mh.h)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.Mh.i)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.Mh.i)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/Mh", life9_51);
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
        life9_116 = ((java.lang.String)((moom.Mh.g)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.Mh.h)[life5_8] = moom.Mh.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.Mh.h)[life5_8];
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
        byte[] spill3211_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3211_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3211_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3211_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3211_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3211_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public void a__Void() {
this.a = ((boolean)(true));
    return;
}


public void a(boolean p0) {
this.a = ((boolean)(p0));
    return;
}


public void a(moom.Mh p0) {
this.a = ((boolean)__sourceIntrinsic_integerToBoolean((((((moom.Mh)(p0)).a) ? 1 : 0))));
    this.b = ((int)(((moom.Mh)(p0)).b));
    this.c = ((int)(((moom.Mh)(p0)).c));
    this.d = ((int)(((moom.Mh)(p0)).d));
    this.e = ((int)(((moom.Mh)(p0)).e));
    return;
}


public void a(boolean p0, int p1, int p2, int p3, int p4) {
this.a = ((boolean)(p0));
    this.b = ((int)(p1));
    this.c = ((int)(p2));
    this.d = ((int)(p3));
    this.e = ((int)(p4));
    return;
}


public int a() {
return this.b;
}


public boolean a__Boolean() {
return ((((this.a) ? 1 : 0)) != 0);
}


public void a(int p0, int p1, int p2, int p3) {
this.b = ((int)(p0));
    this.c = ((int)(p1));
    this.d = ((int)(p2));
    this.e = ((int)(p3));
    return;
}


public void a(int p0, int p1) {
this.b = ((int)(p0));
    this.c = ((int)(p1));
    this.d = ((int)(p0));
    this.e = ((int)(p1));
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6406_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1957_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1957_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1957_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1957_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1957_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1957_15(java.lang.String a0, boolean a1, java.lang.String a2, int a3, java.lang.String a4, int a5, java.lang.String a6, int a7, java.lang.String a8, int a9) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
