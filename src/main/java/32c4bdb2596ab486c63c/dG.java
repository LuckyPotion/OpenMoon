package com.moon;


public class dG implements com.moon.oc {

private static final net.minecraft.client.Minecraft a;

private static final long b;

private static final java.lang.String[] c;

private static final java.lang.String[] d;

private static final java.util.Map e;

public dG() {
super();
}


static {
b = ((long)(((moom._a)(moom._c.a(((long)(-1855718478138988828L)), ((long)(-6042668805692445531L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(49038210055819L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.dG.b ^ 95025084615372L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill65_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill65_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill65_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill65_14 = new byte[8];
    (__sourceSpill65_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill65_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation65_16 = __sourceSpill65_14;
    ((javax.crypto.Cipher)(__sourceSpill65_11)).init(((int)(__sourceSpill65_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill65_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation65_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[3];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "`\027 ²r\023¥x±Pd,)\035^©Æ\001òZËX=ìÒ¯k\tÜ;&\036%öà h§ªÑ\t\r1,(\021*}TÕ/\tY<;#(¶²ùB5¤ë\020CYpSÿÂFNç~§q¼"))).length();
    int local5_life24 = 40;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill65_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill65_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill65_29)).doFinal(((byte[])(__sourceSpill65_28)));
        java.lang.String __sourceSpill65_34 = ((java.lang.String)(com.moon.dG.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill65_35 = local9_life19;
        int __sourceSpill65_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill65_35)[__sourceSpill65_36] = __sourceSpill65_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    c = ((java.lang.String[])(local9_life19));
    d = ((java.lang.String[])(new java.lang.String[3]));
    a = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM()));
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral905_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/dG"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.dG.a(((int)(local4)), ((long)(local5)));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 7337);
    if (((com.moon.dG.d)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.dG.e)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.dG.e)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/dG", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.dG.c)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.dG.d)[life5_8] = com.moon.dG.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.dG.d)[life5_8];
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
        byte[] spill154_0 = p0;
        life4_9 += 1;
        life5_44 = (spill154_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill154_1 = p0;
        life4_9 += 1;
        life5_76 = (spill154_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill154_2 = p0;
        life4_9 += 1;
        life5_91 = (spill154_2)[life4_9];
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


public java.lang.String a() {
int forwardValue45_24_0;
    net.minecraft.client.Minecraft forwardValue45_34_0;
    net.minecraft.client.Minecraft forwardValue45_39_0;
    moom.jL forwardValue45_46_0;
    java.lang.String forwardValue45_61_0;
    int[] spill45_0;
    boolean spill45_1;
    net.minecraft.client.Minecraft spill45_2;
    moom.jL spill45_3;
    java.lang.String spill45_4;
    long life1_3;
    java.lang.String life4_10;
    int[] life3_11;
    moom.jL life5_14;
    forward_join_61: {
    forward_join_55: {
    forward_join_46: {
    forward_join_39: {
    forward_join_34: {
    forward_join_33: {
    forward_join_24: {
    life1_3 = (com.moon.dG.b ^ 8461518924586L);
    spill45_0 = com.moon.dH.b();
    life4_10 = __sourceIntrinsic_63ef3276e4d3_invokedynamic45_2(540, (1703007631244971882L ^ life1_3));
    life3_11 = spill45_0;
    life5_14 = ((net.minecraft.client.Minecraft)(com.moon.dG.a)).a__jL();
    spill45_1 = ((net.minecraft.client.Minecraft)(com.moon.dG.a)).n__Boolean();
    if (!((life3_11 == null))) {
        forwardValue45_24_0 = ((spill45_1) ? 1 : 0);
        break forward_join_24;
    }
    if (!((!spill45_1))) {
        break forward_join_55;
    }
    spill45_2 = com.moon.dG.a;
    if (!((life3_11 == null))) {
        forwardValue45_34_0 = spill45_2;
        break forward_join_34;
    }
    forwardValue45_24_0 = ((((net.minecraft.client.Minecraft)(spill45_2)).k__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue45_24_0 != 0))) {
        break forward_join_33;
    }
    life4_10 = __sourceIntrinsic_63ef3276e4d3_invokedynamic45_11(27320, (621162577188923340L ^ life1_3));
    if (!((life3_11 != null))) {
        break forward_join_55;
    }
    }
    forwardValue45_34_0 = com.moon.dG.a;
    }
    if (!((life3_11 == null))) {
        forwardValue45_39_0 = forwardValue45_34_0;
        break forward_join_39;
    }
    if (!((((net.minecraft.client.Minecraft)(forwardValue45_34_0)).K != null))) {
        break forward_join_55;
    }
    forwardValue45_39_0 = com.moon.dG.a;
    }
    if (!((((net.minecraft.client.Minecraft)(forwardValue45_39_0)).I != null))) {
        break forward_join_55;
    }
    spill45_3 = life5_14;
    if (!((life3_11 == null))) {
        forwardValue45_46_0 = spill45_3;
        break forward_join_46;
    }
    if (!((spill45_3 != null))) {
        break forward_join_55;
    }
    forwardValue45_46_0 = life5_14;
    }
    java.lang.String __stackOp45_18_0 = ((moom.jL)(forwardValue45_46_0)).b;
    java.lang.String __stackOp45_18_1 = __sourceIntrinsic_63ef3276e4d3_invokedynamic45_17(22586, (3330811272405062991L ^ life1_3));
    life4_10 = __sourceIntrinsic_63ef3276e4d3_invokedynamic45_19(__stackOp45_18_1, __stackOp45_18_0);
    }
    spill45_4 = life4_10;
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        forwardValue45_61_0 = spill45_4;
        break forward_join_61;
    }
    com.moon.dH.b(((int[])(new int[3])));
    forwardValue45_61_0 = spill45_4;
    }
    return forwardValue45_61_0;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral905_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_63ef3276e4d3_invokedynamic45_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_63ef3276e4d3_invokedynamic45_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_63ef3276e4d3_invokedynamic45_17(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_63ef3276e4d3_invokedynamic45_19(java.lang.String a0, java.lang.String a1) throws E;
}
