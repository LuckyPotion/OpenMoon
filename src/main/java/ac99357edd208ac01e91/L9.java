package moom;


public class L9 {

private static java.util.Map a;

private static final boolean b;

private static long c;

private static final long d;

private static final java.lang.String[] e;

private static final java.lang.String[] f;

private static final java.util.Map g;

private static final long h;

public L9() {
super();
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(8403004848482580685L)), ((long)(-7600126182972929355L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(15541437716291L)))));
    long local14_life6 = (moom.L9.d ^ 86538278347127L);
    g = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local5_life9;
    javax.crypto.Cipher __sourceSpill665_11 = (local5_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill665_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill665_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill665_14 = new byte[8];
    (__sourceSpill665_14)[0] = ((byte) ((int) (local14_life6 >>> 56)));
    int local6_life15 = 1;
    while ((local6_life15 < 8)) {
        (__sourceSpill665_14)[local6_life15] = ((byte) ((int) ((local14_life6 << (local6_life15 * 8)) >>> 56)));
        local6_life15 += 1;
    }
    byte[] __sourcePreallocation665_16 = __sourceSpill665_14;
    ((javax.crypto.Cipher)(__sourceSpill665_11)).init(((int)(__sourceSpill665_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill665_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation665_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local12_life19 = new java.lang.String[3];
    int local10_life20 = 0;
    java.lang.String local9_life21;
    int local11_life23 = ((java.lang.String)((local9_life21 = "G#4y\rdÏÕÈ\005î\"¦Aºö\036uôÈ²äMR\034m@\nSð/ï¸\016\020JÙ-\037wö?«±¹c\032\rã\020ýo¶\\­^í3]´_û8"))).length();
    int local8_life24 = 40;
    int local7_life25 = -1;
    while (true) {
        local7_life25 += 1;
        byte[] __sourceSpill665_28 = ((java.lang.String)(((java.lang.String)(local9_life21)).substring(((int)(local7_life25)), ((int)((local7_life25 + local8_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill665_29 = local5_life9;
        byte[] local13_life31 = ((javax.crypto.Cipher)(__sourceSpill665_29)).doFinal(((byte[])(__sourceSpill665_28)));
        java.lang.String __sourceSpill665_34 = ((java.lang.String)(moom.L9.a(((byte[])(local13_life31))))).intern();
        java.lang.String[] __sourceSpill665_35 = local12_life19;
        int __sourceSpill665_36 = local10_life20;
        local10_life20 += 1;
        (__sourceSpill665_35)[__sourceSpill665_36] = __sourceSpill665_34;
        if (!(((local7_life25 = (local7_life25 + local8_life24)) < local11_life23))) { break; }
        local8_life24 = ((java.lang.String)(local9_life21)).charAt(((int)(local7_life25)));
    }
    e = ((java.lang.String[])(local12_life19));
    f = ((java.lang.String[])(new java.lang.String[3]));
    javax.crypto.Cipher local0_life41;
    javax.crypto.Cipher __sourceSpill665_43 = (local0_life41 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill665_44 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill665_45 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill665_46 = new byte[8];
    (__sourceSpill665_46)[0] = ((byte) ((int) (local14_life6 >>> 56)));
    int local1_life47 = 1;
    while ((local1_life47 < 8)) {
        (__sourceSpill665_46)[local1_life47] = ((byte) ((int) ((local14_life6 << (local1_life47 * 8)) >>> 56)));
        local1_life47 += 1;
    }
    byte[] __sourcePreallocation665_48 = __sourceSpill665_46;
    ((javax.crypto.Cipher)(__sourceSpill665_43)).init(((int)(__sourceSpill665_44)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill665_45)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation665_48)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life51 = 6936743819946813353L;
    byte[] __sourceSpill665_52 = new byte[8];
    (__sourceSpill665_52)[0] = ((byte) ((int) (local2_life51 >>> 56)));
    (__sourceSpill665_52)[1] = ((byte) ((int) (local2_life51 >>> 48)));
    (__sourceSpill665_52)[2] = ((byte) ((int) (local2_life51 >>> 40)));
    (__sourceSpill665_52)[3] = ((byte) ((int) (local2_life51 >>> 32)));
    (__sourceSpill665_52)[4] = ((byte) ((int) (local2_life51 >>> 24)));
    (__sourceSpill665_52)[5] = ((byte) ((int) (local2_life51 >>> 16)));
    (__sourceSpill665_52)[6] = ((byte) ((int) (local2_life51 >>> 8)));
    (__sourceSpill665_52)[7] = ((byte) ((int) local2_life51));
    javax.crypto.Cipher __sourceSpill665_53 = local0_life41;
    byte[] local4_life55 = ((javax.crypto.Cipher)(__sourceSpill665_53)).doFinal(((byte[])(__sourceSpill665_52)));
    h = ((long)((((((((((((long) (local4_life55)[0]) & 255L) << 56) | ((((long) (local4_life55)[1]) & 255L) << 48)) | ((((long) (local4_life55)[2]) & 255L) << 40)) | ((((long) (local4_life55)[3]) & 255L) << 32)) | ((((long) (local4_life55)[4]) & 255L) << 24)) | ((((long) (local4_life55)[5]) & 255L) << 16)) | ((((long) (local4_life55)[6]) & 255L) << 8)) | (((long) (local4_life55)[7]) & 255L))));
    a = ((java.util.Map)(null));
    b = ((boolean)(java.lang.Boolean.getBoolean(((java.lang.String)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite665_58(30820, (8778313517897516857L ^ local14_life6)))))));
    c = ((long)(java.lang.System.currentTimeMillis()));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
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
        byte[] spill3001_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3001_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3001_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3001_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3001_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3001_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 27849);
    if (((moom.L9.f)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.L9.g)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.L9.g)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/L9", life9_51);
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
        life9_116 = ((java.lang.String)((moom.L9.e)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.L9.f)[life5_8] = moom.L9.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.L9.f)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.L9.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5862_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/L9"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static synchronized moom.L6 a(moom.to p0) {
int forwardValue2554_15_0;
    moom.to forwardValue2554_30_0;
    java.lang.Object forwardValue2554_41_0;
    moom.L6 forwardValue2554_85_0;
    boolean spill2554_0;
    net.minecraft.client.entity.EntityPlayerSP spill2554_1;
    java.lang.String spill2554_2;
    moom.L6 spill2554_3;
    java.lang.String spill2554_4;
    long life1_3;
    java.lang.String life3_5;
    net.minecraft.client.entity.EntityPlayerSP life4_24;
    java.lang.String life4_43;
    moom.L6 life5_59;
    moom.L8 life6_80;
    java.lang.String life7_95;
    moom.Ox life8_101;
    forward_join_85: {
    forward_join_84: {
    forward_join_41: {
    forward_join_38: {
    forward_join_30: {
    forward_join_29: {
    forward_join_15: {
    life1_3 = (moom.L9.d ^ 45451034334967L);
    life3_5 = moom.L_.b();
    spill2554_0 = moom.L9.b;
    if (!((life3_5 == null))) {
        forwardValue2554_15_0 = ((spill2554_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!(spill2554_0)) {
        break forward_join_29;
    }
    forwardValue2554_15_0 = recovery.source.CarrierOps.lcmp(((long)(java.lang.System.currentTimeMillis())), ((long)((moom.L9.c + moom.L9.h))));
    }
    if (!((forwardValue2554_15_0 > 0))) {
        break forward_join_29;
    }
    life4_24 = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).K;
    spill2554_1 = life4_24;
    if (!((life3_5 == null))) {
        forwardValue2554_30_0 = spill2554_1;
        break forward_join_30;
    }
    if (!((spill2554_1 != null))) {
        break forward_join_29;
    }
    moom.L9.a(((java.lang.String)(((moom.to)(life4_24)).i__sourceReturn_0e30dfc966())), ((moom.L6)(null)));
    moom.L9.c = ((long)(java.lang.System.currentTimeMillis()));
    }
    forwardValue2554_30_0 = p0;
    }
    life4_43 = ((moom.to)(forwardValue2554_30_0)).i__sourceReturn_0e30dfc966();
    spill2554_2 = life4_43;
    if (!((life3_5 == null))) {
        forwardValue2554_41_0 = spill2554_2;
        break forward_join_41;
    }
    if (!((spill2554_2 == null))) {
        break forward_join_38;
    }
    return null;
    }
    forwardValue2554_41_0 = ((java.util.Map)(moom.L9.a())).get(((java.lang.Object)(life4_43)));
    }
    life5_59 = ((moom.L6)(forwardValue2554_41_0));
    spill2554_3 = life5_59;
    if (!((life3_5 == null))) {
        forwardValue2554_85_0 = spill2554_3;
        break forward_join_85;
    }
    if (!((spill2554_3 == null))) {
        break forward_join_84;
    }
    life5_59 = new moom.L6();
    ((java.util.Map)(moom.L9.a())).put(((java.lang.Object)(life4_43)), ((java.lang.Object)(life5_59)));
    life6_80 = new moom.L8(life4_43);
    spill2554_4 = moom.LU.a();
    java.lang.String __stackOp2554_22_0 = life4_43;
    java.lang.String __stackOp2554_22_1 = __sourceIntrinsic_e850f3b19e36_invokedynamic2554_21(8638, (939252603104782690L ^ life1_3));
    life7_95 = __sourceIntrinsic_e850f3b19e36_invokedynamic2554_24(spill2554_4, __stackOp2554_22_1, __stackOp2554_22_0, __sourceIntrinsic_e850f3b19e36_invokedynamic2554_23(31579, (1814755055442211716L ^ life1_3)));
    life8_101 = new moom.Ox(life7_95, life6_80);
    ((moom.Ox)(life8_101)).start();
    }
    forwardValue2554_85_0 = life5_59;
    }
    return forwardValue2554_85_0;
}


public static synchronized void a(java.lang.String p0, moom.L6 p1) {
((java.util.Map)(moom.L9.a())).put(((java.lang.Object)(p0)), ((java.lang.Object)(p1)));
    return;
}


private static java.util.Map a() {
java.util.Map forwardValue2552_15_0;
    java.util.Map spill2552_0;
    long life0_3;
    java.lang.String life2_5;
    forward_join_15: {
    forward_join_14: {
    life0_3 = (moom.L9.d ^ 127832923625764L);
    life2_5 = moom.L_.b();
    spill2552_0 = moom.L9.a;
    if (!((life2_5 == null))) {
        forwardValue2552_15_0 = spill2552_0;
        break forward_join_15;
    }
    if (!((spill2552_0 == null))) {
        break forward_join_14;
    }
    moom.L9.a = ((java.util.Map)(new java.util.HashMap()));
    }
    forwardValue2552_15_0 = moom.L9.a;
    }
    return forwardValue2552_15_0;
}


public static void a(moom.iT p0, moom.to p1, float p2, float p3) {
moom.L6 forwardValue2553_14_0;
    java.lang.String spill2553_0;
    moom.L6 spill2553_1;
    long life4_3;
    moom.L6 life7_7;
    java.lang.String life6_8;
    forward_join_19: {
    forward_join_14: {
    life4_3 = (moom.L9.d ^ 111068741139849L);
    spill2553_0 = moom.L_.b();
    life7_7 = moom.L9.a(((moom.to)(p1)));
    life6_8 = spill2553_0;
    spill2553_1 = life7_7;
    if (!((life6_8 == null))) {
        forwardValue2553_14_0 = spill2553_1;
        break forward_join_14;
    }
    if (!((spill2553_1 != null))) {
        break forward_join_19;
    }
    forwardValue2553_14_0 = life7_7;
    }
    ((moom.L6)(forwardValue2553_14_0)).a(((moom.iT)(p0)), ((moom.to)(p1)), ((float)(p2)), ((float)(p3)));
    }
    return;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite665_58(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5862_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e850f3b19e36_invokedynamic2554_21(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e850f3b19e36_invokedynamic2554_23(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e850f3b19e36_invokedynamic2554_24(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws E;
}
