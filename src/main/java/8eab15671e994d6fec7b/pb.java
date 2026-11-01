package com.moon;


public class pb extends net.minecraft.client.Minecraft {

private static final long bb;

private static final java.lang.String[] db;

private static final java.lang.String[] eb;

private static final java.util.Map fb;

public pb(moom.iJ p0) {
super(p0);
}


static {
bb = ((long)(((moom._a)(moom._c.a(((long)(-4985892828893745623L)), ((long)(8542892418346460840L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(275889592250256L)))));
    fb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.pb.bb ^ 9374970474474L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill369_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill369_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill369_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill369_14 = new byte[8];
    (__sourceSpill369_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill369_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation369_16 = __sourceSpill369_14;
    ((javax.crypto.Cipher)(__sourceSpill369_11)).init(((int)(__sourceSpill369_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill369_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation369_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[3];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "è\013jp?\033ÓójÃB/»}\031±do·\032\034\003\030_BÍC¦æuO\rç)Ç_pgÖHI~\004±(t6ÊÃÇÁT£V \017¤iLà\007Îï>\004±ywC\000[è\013C\024);í¹"))).length();
    int local5_life24 = 24;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill369_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill369_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill369_29)).doFinal(((byte[])(__sourceSpill369_28)));
        java.lang.String __sourceSpill369_34 = ((java.lang.String)(com.moon.pb.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill369_35 = local9_life19;
        int __sourceSpill369_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill369_35)[__sourceSpill369_36] = __sourceSpill369_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    db = ((java.lang.String[])(local9_life19));
    eb = ((java.lang.String[])(new java.lang.String[3]));
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3184_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/pb"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.pb.a(((int)(local4)), ((long)(local5)));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 7832);
    if (((com.moon.pb.eb)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.pb.fb)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.pb.fb)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/pb", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.pb.db)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.pb.eb)[life5_8] = com.moon.pb.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.pb.eb)[life5_8];
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
        byte[] spill1207_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1207_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1207_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1207_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1207_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1207_2)[life4_9];
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


public void a(java.lang.String p0) {
int forestValue100041_42_0;
    java.lang.String spill100041_0;
    int spill100041_1;
    boolean spill100041_2;
    boolean spill100041_3;
    long life2_3;
    java.lang.String life5_6;
    java.lang.String life4_7;
    int life6_9;
    forest_join_55: {
    forest_join_49: {
    forest_join_43: {
    forest_join_42: {
    forest_join_41: {
    forest_join_29: {
    forest_join_15: {
    life2_3 = (com.moon.pb.bb ^ 15274321769303L);
    spill100041_0 = com.moon.runtime.ClientContext.b();
    life5_6 = p0;
    life4_7 = spill100041_0;
    life6_9 = -1;
    spill100041_1 = ((java.lang.String)(life5_6)).hashCode();
    if (!((life4_7 == null))) {
        forestValue100041_42_0 = spill100041_1;
        break forest_join_42;
    }
    switch (spill100041_1) {
case 1841179421:
{
        break forest_join_15;
    }
case 1513940448:
{
        break forest_join_29;
    }
default:
{
        break forest_join_41;
    }
}
    }
    spill100041_2 = ((java.lang.String)(life5_6)).equals(((java.lang.Object)(__sourceIntrinsic_474b89cf9bbb_invokedynamic100041_3(26535, (3484377571562893653L ^ life2_3)))));
    if (!((life4_7 == null))) {
        forestValue100041_42_0 = ((spill100041_2) ? 1 : 0);
        break forest_join_42;
    }
    if (!(spill100041_2)) {
        break forest_join_41;
    }
    life6_9 = 0;
    if (!((life4_7 != null))) {
        break forest_join_41;
    }
    }
    spill100041_3 = ((java.lang.String)(life5_6)).equals(((java.lang.Object)(__sourceIntrinsic_474b89cf9bbb_invokedynamic100041_6(8639, (3720925909688809292L ^ life2_3)))));
    if (!((life4_7 == null))) {
        forestValue100041_42_0 = ((spill100041_3) ? 1 : 0);
        break forest_join_42;
    }
    if (!(spill100041_3)) {
        break forest_join_41;
    }
    life6_9 = 1;
    }
    forestValue100041_42_0 = life6_9;
    }
    switch (forestValue100041_42_0) {
case 0:
{
        break forest_join_43;
    }
case 1:
{
        break forest_join_49;
    }
default:
{
        break forest_join_55;
    }
}
    }
    ((com.moon.runtime.ClientContext)(new com.moon.runtime.ClientContext())).a__Void();
    if (!((life4_7 != null))) {
        break forest_join_55;
    }
    }
    org.tinylog.Logger.info(((java.lang.Object)(__sourceIntrinsic_474b89cf9bbb_invokedynamic100041_10(10606, (2864168134243483550L ^ life2_3)))));
    }
    super.a(((java.lang.String)(p0)));
    return;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_474b89cf9bbb_invokedynamic100041_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_474b89cf9bbb_invokedynamic100041_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_474b89cf9bbb_invokedynamic100041_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3184_0() throws E;
}
