package moom;


public abstract class ME {

private static final org.apache.logging.log4j.Logger a;

private static final long b;

private static final java.lang.String[] c;

private static final java.lang.String[] d;

private static final java.util.Map e;

public ME() {
super();
}


static {
b = ((long)(((moom._a)(moom._c.a(((long)(8037217467104054676L)), ((long)(-6142498347510555779L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(221314560424421L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.ME.b ^ 44431332413107L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill690_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill690_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill690_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill690_14 = new byte[8];
    (__sourceSpill690_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill690_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation690_16 = __sourceSpill690_14;
    ((javax.crypto.Cipher)(__sourceSpill690_11)).init(((int)(__sourceSpill690_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill690_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation690_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[2];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "¿ý$a1ÌâÊßÆ¸_\006\031l$®¡\030\006ðwïÂèÙ¬Óñ.wã\0216ÍS*\005ÏÄv"))).length();
    int local5_life24 = 24;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill690_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill690_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill690_29)).doFinal(((byte[])(__sourceSpill690_28)));
        java.lang.String __sourceSpill690_34 = ((java.lang.String)(moom.ME.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill690_35 = local9_life19;
        int __sourceSpill690_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill690_35)[__sourceSpill690_36] = __sourceSpill690_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    c = ((java.lang.String[])(local9_life19));
    d = ((java.lang.String[])(new java.lang.String[2]));
    a = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
}


public static void b(java.lang.String p0, java.lang.Object[] p1) {
long local2_life2 = (moom.ME.b ^ 62971752453620L);
    java.lang.String local4_life4 = java.lang.String.format(((java.lang.String)(p0)), ((java.lang.Object[])(p1)));
    org.apache.logging.log4j.Logger __sourceSpill577_8 = moom.ME.a;
    java.lang.String __stackOp577_9_0 = local4_life4;
    java.lang.String __stackOp577_9_1 = __sourceIntrinsic_81b8f1a7dfdd_originalDynamicSite577_7(28406, (6498517816071398842L ^ local2_life2));
    ((org.apache.logging.log4j.Logger)(__sourceSpill577_8)).warn(((java.lang.String)(__sourceIntrinsic_81b8f1a7dfdd_originalDynamicSite577_10(__stackOp577_9_1, __stackOp577_9_0))));
    return;
}


public static void b(java.lang.String p0) {
long local1_life2 = (moom.ME.b ^ 126240983424304L);
    org.apache.logging.log4j.Logger __sourceSpill576_6 = moom.ME.a;
    java.lang.String __stackOp576_7_0 = p0;
    java.lang.String __stackOp576_7_1 = __sourceIntrinsic_d1c1922d1ba0_originalDynamicSite576_5(28406, (6498434850254302590L ^ local1_life2));
    ((org.apache.logging.log4j.Logger)(__sourceSpill576_6)).warn(((java.lang.String)(__sourceIntrinsic_d1c1922d1ba0_originalDynamicSite576_8(__stackOp576_7_1, __stackOp576_7_0))));
    return;
}


public static void c(java.lang.String p0, java.lang.Object[] p1) {
long local2_life2 = (moom.ME.b ^ 22895168189945L);
    java.lang.String local4_life4 = java.lang.String.format(((java.lang.String)(p0)), ((java.lang.Object[])(p1)));
    org.apache.logging.log4j.Logger __sourceSpill579_8 = moom.ME.a;
    java.lang.String __stackOp579_9_0 = local4_life4;
    java.lang.String __stackOp579_9_1 = __sourceIntrinsic_a55b944f44ea_originalDynamicSite579_7(28406, (6498538211567584695L ^ local2_life2));
    ((org.apache.logging.log4j.Logger)(__sourceSpill579_8)).info(((java.lang.String)(__sourceIntrinsic_a55b944f44ea_originalDynamicSite579_10(__stackOp579_9_1, __stackOp579_9_0))));
    return;
}


public static void c(java.lang.String p0) {
long local1_life2 = (moom.ME.b ^ 121042021330823L);
    org.apache.logging.log4j.Logger __sourceSpill578_6 = moom.ME.a;
    java.lang.String __stackOp578_7_0 = p0;
    java.lang.String __stackOp578_7_1 = __sourceIntrinsic_41b51cd99fcb_originalDynamicSite578_5(28406, (6498422504199757769L ^ local1_life2));
    ((org.apache.logging.log4j.Logger)(__sourceSpill578_6)).info(((java.lang.String)(__sourceIntrinsic_41b51cd99fcb_originalDynamicSite578_8(__stackOp578_7_1, __stackOp578_7_0))));
    return;
}


public static void d(java.lang.String p0, java.lang.Object[] p1) {
long local2_life2 = (moom.ME.b ^ 17750841328483L);
    java.lang.String local4_life4 = java.lang.String.format(((java.lang.String)(p0)), ((java.lang.Object[])(p1)));
    org.apache.logging.log4j.Logger __sourceSpill581_8 = moom.ME.a;
    java.lang.String __stackOp581_9_0 = local4_life4;
    java.lang.String __stackOp581_9_1 = __sourceIntrinsic_08d9dc5a96f4_originalDynamicSite581_7(28406, (6498543512584434477L ^ local2_life2));
    ((org.apache.logging.log4j.Logger)(__sourceSpill581_8)).debug(((java.lang.String)(__sourceIntrinsic_08d9dc5a96f4_originalDynamicSite581_10(__stackOp581_9_1, __stackOp581_9_0))));
    return;
}


public static void d(java.lang.String p0) {
long local1_life2 = (moom.ME.b ^ 20337034365392L);
    org.apache.logging.log4j.Logger __sourceSpill580_6 = moom.ME.a;
    java.lang.String __stackOp580_7_0 = p0;
    java.lang.String __stackOp580_7_1 = __sourceIntrinsic_acbc417da872_originalDynamicSite580_5(28406, (6498541152015333790L ^ local1_life2));
    ((org.apache.logging.log4j.Logger)(__sourceSpill580_6)).debug(((java.lang.String)(__sourceIntrinsic_acbc417da872_originalDynamicSite580_8(__stackOp580_7_1, __stackOp580_7_0))));
    return;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 13536);
    if (((moom.ME.d)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.ME.e)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.ME.e)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/ME", life9_51);
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
        life9_116 = ((java.lang.String)((moom.ME.c)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.ME.d)[life5_8] = moom.ME.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.ME.d)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.ME.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6087_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/ME"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
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
        byte[] spill3136_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3136_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3136_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3136_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3136_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3136_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public static void a(java.lang.String p0) {
long local1_life2 = (moom.ME.b ^ 90553389802009L);
    org.apache.logging.log4j.Logger __sourceSpill574_6 = moom.ME.a;
    java.lang.String __stackOp574_7_0 = p0;
    java.lang.String __stackOp574_7_1 = __sourceIntrinsic_474b89cf9bbb_originalDynamicSite574_5(28406, (6498470630650139223L ^ local1_life2));
    ((org.apache.logging.log4j.Logger)(__sourceSpill574_6)).error(((java.lang.String)(__sourceIntrinsic_474b89cf9bbb_originalDynamicSite574_8(__stackOp574_7_1, __stackOp574_7_0))));
    return;
}


public static void a(java.lang.String p0, java.lang.Object[] p1) {
long local2_life2 = (moom.ME.b ^ 25288285708703L);
    java.lang.String local4_life4 = java.lang.String.format(((java.lang.String)(p0)), ((java.lang.Object[])(p1)));
    org.apache.logging.log4j.Logger __sourceSpill575_8 = moom.ME.a;
    java.lang.String __stackOp575_9_0 = local4_life4;
    java.lang.String __stackOp575_9_1 = __sourceIntrinsic_a9c4a4b7c857_originalDynamicSite575_7(371, (4791998061118930517L ^ local2_life2));
    ((org.apache.logging.log4j.Logger)(__sourceSpill575_8)).error(((java.lang.String)(__sourceIntrinsic_a9c4a4b7c857_originalDynamicSite575_10(__stackOp575_9_1, __stackOp575_9_0))));
    return;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_81b8f1a7dfdd_originalDynamicSite577_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_81b8f1a7dfdd_originalDynamicSite577_10(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d1c1922d1ba0_originalDynamicSite576_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d1c1922d1ba0_originalDynamicSite576_8(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a55b944f44ea_originalDynamicSite579_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a55b944f44ea_originalDynamicSite579_10(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_41b51cd99fcb_originalDynamicSite578_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_41b51cd99fcb_originalDynamicSite578_8(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_08d9dc5a96f4_originalDynamicSite581_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_08d9dc5a96f4_originalDynamicSite581_10(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_acbc417da872_originalDynamicSite580_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_acbc417da872_originalDynamicSite580_8(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6087_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_474b89cf9bbb_originalDynamicSite574_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_474b89cf9bbb_originalDynamicSite574_8(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a9c4a4b7c857_originalDynamicSite575_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a9c4a4b7c857_originalDynamicSite575_10(java.lang.String a0, java.lang.String a1) throws E;
}
