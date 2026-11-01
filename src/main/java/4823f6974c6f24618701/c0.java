package com.moon;


public abstract class c0 {

protected static net.minecraft.client.Minecraft a;

private static org.tinylog.TaggedLogger b;

private java.lang.String c;

private java.lang.String d;

private java.lang.String[] e;

private java.util.List<com.moon.df<?>> f;

private static long j;

private static java.lang.String[] l;

private static java.lang.String[] m;

private static java.util.Map n;

public c0(java.lang.String p0, java.lang.String p1, java.lang.String[] p2) { super(); }

private static void __sourceConstructorBody_ff575c9357bb7a74(com.moon.c0 receiver, java.lang.String p0, java.lang.String p1, java.lang.String[] p2) throws Throwable {
long local4_life2 = (com.moon.c0.j ^ 58234807050109L);
    com.moon.c0.__sourceConstructorInit_ff575c9357bb7a74_0(((com.moon.c0)(receiver)));
    java.lang.String[] __sourceSpill10_6 = com.moon.dc.b();
    ((com.moon.c0)(receiver)).f = ((java.util.List)(new java.util.ArrayList()));
    java.lang.String[] local6_life7 = __sourceSpill10_6;
    try {
        ((com.moon.c0)(receiver)).c = ((java.lang.String)(p0));
        ((com.moon.c0)(receiver)).d = ((java.lang.String)(p1));
        ((com.moon.c0)(receiver)).e = ((java.lang.String[])(p2));
        if ((local6_life7 != null)) {
        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[5])));
    }
    } catch (moom.Oo __catchStack10) {
        throw com.moon.c0.a(((java.lang.Exception)(__catchStack10)));
    }
    return;
}


static {
j = ((long)(((moom._a)(moom._c.a(((long)(8517134259866450060L)), ((long)(-2918454375223488011L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(201462216252032L)))));
    long local9_life6 = (com.moon.c0.j ^ 78218623538243L);
    n = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill32_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill32_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill32_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill32_14 = new byte[8];
    (__sourceSpill32_14)[0] = ((byte) ((int) (local9_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill32_14)[local1_life15] = ((byte) ((int) ((local9_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation32_16 = __sourceSpill32_14;
    ((javax.crypto.Cipher)(__sourceSpill32_11)).init(((int)(__sourceSpill32_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill32_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation32_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local7_life19 = new java.lang.String[2];
    int local5_life20 = 0;
    java.lang.String local4_life21;
    int local6_life23 = ((java.lang.String)((local4_life21 = "­ò**\036n\023ÌºEÔà½\001\n%¹7\nÉÑæª='Ýw\002!Sm\"\020cÝVôÿ834PD\020pBR\016\teB\1772(dÇú[Ádâ\020GÃÑÉaÍóßÑíí\013Í"))).length();
    int local3_life24 = 72;
    int local2_life25 = -1;
    while (true) {
        local2_life25 += 1;
        byte[] __sourceSpill32_28 = ((java.lang.String)(((java.lang.String)(local4_life21)).substring(((int)(local2_life25)), ((int)((local2_life25 + local3_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill32_29 = local0_life9;
        byte[] local8_life31 = ((javax.crypto.Cipher)(__sourceSpill32_29)).doFinal(((byte[])(__sourceSpill32_28)));
        java.lang.String __sourceSpill32_34 = ((java.lang.String)(com.moon.c0.a(((byte[])(local8_life31))))).intern();
        java.lang.String[] __sourceSpill32_35 = local7_life19;
        int __sourceSpill32_36 = local5_life20;
        local5_life20 += 1;
        (__sourceSpill32_35)[__sourceSpill32_36] = __sourceSpill32_34;
        if (!(((local2_life25 = (local2_life25 + local3_life24)) < local6_life23))) { break; }
        local3_life24 = ((java.lang.String)(local4_life21)).charAt(((int)(local2_life25)));
    }
    l = ((java.lang.String[])(local7_life19));
    m = ((java.lang.String[])(new java.lang.String[2]));
    a = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM()));
    b = ((org.tinylog.TaggedLogger)(org.tinylog.Logger.tag(((java.lang.String)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite32_42(22134, (2878862793067944815L ^ local9_life6)))))));
}

private static native <E extends Throwable> void __sourceConstructorInit_ff575c9357bb7a74_0(com.moon.c0 a0) throws E;
private static native <E extends Throwable> void __sourceHandlerCall_aed7ecbe2b0827781645(com.moon.c0 a0) throws E;
private static final class __SourceHandler_aed7ecbe2b0827781645 {

public static void f11(com.moon.c0 receiver) throws Throwable {
    java.lang.Object forestValue11_35_0;
    java.lang.String[] spill11_0;
    java.lang.Object spill11_1;
    long life1_3;
    java.lang.reflect.Field[] life4_7;
    int life5_11;
    java.lang.String[] life3_12;
    int life6_14;
    java.lang.reflect.Field life7_21;
    java.lang.Object life8_28;
    com.moon.df life9_38;
    forest_join_53: {
    forest_join_48: {
    life1_3 = (__fieldRead11_0() ^ 25261839763691L);
    life4_7 = __call11_2(__call11_1(receiver));
    spill11_0 = __call11_3();
    life5_11 = (life4_7).length;
    life3_12 = spill11_0;
    life6_14 = 0;
    forest_cycle_15: while (true) {
    forest_join_45: {
    forest_join_40: {
    forest_join_39: {
    forest_join_35: {
    if (!((life6_14 < life5_11))) {
        break forest_join_48;
    }
    life7_21 = (life4_7)[life6_14];
    __call11_4(life7_21, 1);
    life8_28 = __call11_5(life7_21, receiver);
    spill11_1 = life8_28;
    if (!((life3_12 == null))) {
        forestValue11_35_0 = spill11_1;
        break forest_join_35;
    }
    if (!((__instanceOf11_6(spill11_1) != 0))) {
        break forest_join_39;
    }
    forestValue11_35_0 = life8_28;
    }
    life9_38 = __cast11_7(forestValue11_35_0);
    if (!((life3_12 != null))) {
        break forest_join_40;
    }
    }
    break forest_join_45;
    }
    __call11_9(__fieldRead11_8(receiver), life9_38);
    }
    life6_14 += 1;
    if (!((life3_12 != null))) {
        continue forest_cycle_15;
    }
    break forest_cycle_15;
    }
    }
    if (!((__call11_10() != null))) {
        break forest_join_53;
    }
    __call11_11(new java.lang.String[2]);
    }
    return;
}
public static void h11_0(java.lang.IllegalAccessException p0) throws Throwable {
    throw __call3001100_0(p0);
}
public static void h11_1(java.lang.IllegalAccessException p0) throws Throwable {
    throw __call3001101_0(p0);
}
public static void h11_2(java.lang.IllegalAccessException p0, com.moon.c0 p1, long p2, java.lang.String[] p3, java.lang.reflect.Field[] p4, int p5, int p6, java.lang.reflect.Field p7, java.lang.Object p8, com.moon.df p9) throws Throwable {
    java.lang.Object forestValue3001102_42_0;
    org.tinylog.TaggedLogger spill3001102_0;
    java.lang.String spill3001102_1;
    java.lang.Object[] spill3001102_2;
    java.lang.Object spill3001102_3;
    java.lang.IllegalAccessException life9_2;
    java.lang.reflect.Field life8_29;
    java.lang.Object life9_36;
    com.moon.df life10_46;
    forest_join_58: {
    forest_join_53: {
    life9_2 = p0;
    spill3001102_0 = __fieldRead3001102_0();
    com.moon.c0 __stackOp3001102_2_0 = p1;
    java.lang.String __stackOp3001102_2_1 = __invokedynamic3001102_1(31766, (7299279712439070118L ^ p2));
    spill3001102_1 = __invokedynamic3001102_3(__stackOp3001102_2_1, __stackOp3001102_2_0);
    java.lang.Object[] __stackOp3001102_4_0 = new java.lang.Object[1];
    spill3001102_2 = __stackOp3001102_4_0;
    (__stackOp3001102_4_0)[0] = life9_2;
    __call3001102_5(spill3001102_0, spill3001102_1, spill3001102_2);
    forest_cycle_18: while (true) {
    forest_join_47: {
    forest_join_46: {
    forest_join_42: {
    forest_join_22: {
    p6 += 1;
    if (!((p3 != null))) {
        break forest_join_22;
    }
    break forest_join_53;
    }
    if (!((p6 < p5))) {
        break forest_join_53;
    }
    life8_29 = (p4)[p6];
    __call3001102_6(life8_29, 1);
    life9_36 = __call3001102_7(life8_29, p1);
    spill3001102_3 = life9_36;
    if (!((p3 == null))) {
        forestValue3001102_42_0 = spill3001102_3;
        break forest_join_42;
    }
    if (!((__instanceOf3001102_8(spill3001102_3) != 0))) {
        break forest_join_46;
    }
    forestValue3001102_42_0 = life9_36;
    }
    life10_46 = __cast3001102_9(forestValue3001102_42_0);
    if (!((p3 != null))) {
        break forest_join_47;
    }
    }
    continue forest_cycle_18;
    }
    __call3001102_11(__fieldRead3001102_10(p1), life10_46);
    continue forest_cycle_18;
    }
    }
    if (!((__call3001102_12() != null))) {
        break forest_join_58;
    }
    __call3001102_13(new java.lang.String[2]);
    }
    return;
}
public static void h11_3(java.lang.IllegalAccessException p0) throws Throwable {
    throw __call3001103_0(p0);
}
private static native long __fieldRead11_0() throws Throwable;
private static native java.lang.Class __call11_1(com.moon.c0 a0) throws Throwable;
private static native java.lang.reflect.Field[] __call11_2(java.lang.Class a0) throws Throwable;
private static native java.lang.String[] __call11_3() throws Throwable;
private static native void __call11_4(java.lang.reflect.Field a0, int a1) throws Throwable;
private static native java.lang.Object __call11_5(java.lang.reflect.Field a0, com.moon.c0 a1) throws Throwable;
private static native int __instanceOf11_6(java.lang.Object a0) throws Throwable;
private static native com.moon.df __cast11_7(java.lang.Object a0) throws Throwable;
private static native java.util.List __fieldRead11_8(com.moon.c0 a0) throws Throwable;
private static native boolean __call11_9(java.util.List a0, com.moon.df a1) throws Throwable;
private static native java.lang.String[] __call11_10() throws Throwable;
private static native void __call11_11(java.lang.String[] a0) throws Throwable;
private static native java.lang.Exception __call3001100_0(java.lang.IllegalAccessException a0) throws Throwable;
private static native java.lang.Exception __call3001101_0(java.lang.IllegalAccessException a0) throws Throwable;
private static native org.tinylog.TaggedLogger __fieldRead3001102_0() throws Throwable;
private static native java.lang.String __invokedynamic3001102_1(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3001102_3(java.lang.String a0, com.moon.c0 a1) throws Throwable;
private static native void __call3001102_5(org.tinylog.TaggedLogger a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native void __call3001102_6(java.lang.reflect.Field a0, int a1) throws Throwable;
private static native java.lang.Object __call3001102_7(java.lang.reflect.Field a0, com.moon.c0 a1) throws Throwable;
private static native int __instanceOf3001102_8(java.lang.Object a0) throws Throwable;
private static native com.moon.df __cast3001102_9(java.lang.Object a0) throws Throwable;
private static native java.util.List __fieldRead3001102_10(com.moon.c0 a0) throws Throwable;
private static native boolean __call3001102_11(java.util.List a0, com.moon.df a1) throws Throwable;
private static native java.lang.String[] __call3001102_12() throws Throwable;
private static native void __call3001102_13(java.lang.String[] a0) throws Throwable;
private static native java.lang.Exception __call3001103_0(java.lang.IllegalAccessException a0) throws Throwable;

}


public java.util.List<com.moon.df<?>> b__List() {
return this.f;
}


public java.lang.String b() {
return this.d;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral725_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/c0"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.c0.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
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
        byte[] spill94_0 = p0;
        life4_9 += 1;
        life5_44 = (spill94_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill94_1 = p0;
        life4_9 += 1;
        life5_76 = (spill94_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill94_2 = p0;
        life4_9 += 1;
        life5_91 = (spill94_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 5966);
    if (((com.moon.c0.m)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.c0.n)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.c0.n)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/c0", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.c0.l)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.c0.m)[life5_8] = com.moon.c0.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.c0.m)[life5_8];
}


public void a__Void() { __sourceHandlerCall_aed7ecbe2b0827781645(this); }


public java.util.List<com.moon.df<?>> a__List() {
return ((java.util.List)(((java.util.stream.Stream)(((java.util.stream.Stream)(((java.util.List)(this.f)).stream())).filter(((java.util.function.Predicate)(__sourceIntrinsic_4b3d0be45f41_originalDynamicSite73_2()))))).collect(((java.util.stream.Collector)(java.util.stream.Collectors.toList())))));
}


public java.lang.String a__String() {
return this.c;
}


public java.lang.String[] a__ArrayString() {
return this.e;
}


public abstract com.moon.dc a();

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite32_42(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral725_0() throws E;

private static native <E extends Throwable> java.util.function.Predicate __sourceIntrinsic_4b3d0be45f41_originalDynamicSite73_2() throws E;
}
