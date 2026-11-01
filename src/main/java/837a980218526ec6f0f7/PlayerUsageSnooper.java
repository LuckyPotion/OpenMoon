package net.minecraft.profiler;


public class PlayerUsageSnooper {

private java.util.Map<java.lang.String, java.lang.Object> a;

private java.util.Map<java.lang.String, java.lang.Object> b;

private java.lang.String c;

private java.net.URL d;

private net.minecraft.profiler.IPlayerUsage e;

private java.util.Timer f;

private java.lang.Object g;

private long h;

private boolean i;

private int j;

private static long k;

private static long l;

public PlayerUsageSnooper(java.lang.String p0, net.minecraft.profiler.IPlayerUsage p1, long p2) { super(); __sourceHandlerCall_1376ea84c4241f334072(this, p0, p1, p2); }


static {
k = ((long)(((moom._a)(moom._c.a(((long)(5377767978673547073L)), ((long)(-1460289380447316667L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(80623648145894L)))));
    long local0_life6 = (net.minecraft.profiler.PlayerUsageSnooper.k ^ 129950750296681L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1205_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1205_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1205_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1205_13 = new byte[8];
    (__sourceSpill1205_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1205_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1205_15 = __sourceSpill1205_13;
    ((javax.crypto.Cipher)(__sourceSpill1205_10)).init(((int)(__sourceSpill1205_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1205_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1205_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 3277331261612908236L;
    byte[] __sourceSpill1205_19 = new byte[8];
    (__sourceSpill1205_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1205_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1205_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1205_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1205_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1205_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1205_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1205_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1205_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1205_20)).doFinal(((byte[])(__sourceSpill1205_19)));
    l = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceHandlerCall_1376ea84c4241f334072(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, net.minecraft.profiler.IPlayerUsage a2, long a3) throws E;
private static final class __SourceHandler_1376ea84c4241f334072 {

public static void f572(net.minecraft.profiler.PlayerUsageSnooper receiver, java.lang.String p0, net.minecraft.profiler.IPlayerUsage p1, long p2) throws Throwable {
    int[] spill572_0;
    int[] life5_13;
    __directSuperInit572_0(receiver);
    __fieldWrite572_2(receiver, __call572_1());
    spill572_0 = __call572_3();
    __fieldWrite572_5(receiver, __call572_4());
    __fieldWrite572_8(receiver, __call572_7(__call572_6()));
    life5_13 = spill572_0;
    __fieldWrite572_9(receiver, new java.util.Timer("Snooper Timer", true));
    __fieldWrite572_10(receiver, new java.lang.Object());
    __fieldWrite572_12(receiver, new java.net.URL(__invokedynamic572_11(p0)));
    __fieldWrite572_13(receiver, p1);
    __fieldWrite572_14(receiver, p2);
    if ((life5_13 == null)) {
        __call572_15(new java.lang.String[3]);
    } else {
        
    }
    return;
}
public static void h572_0(java.net.MalformedURLException p0) throws Throwable {
    java.net.MalformedURLException life1_2;
    life1_2 = p0;
    throw new java.lang.IllegalArgumentException();
}
public static void h572_1(java.net.MalformedURLException p0) throws Throwable {
    throw __call3057201_0(p0);
}
private static native void __directSuperInit572_0(net.minecraft.profiler.PlayerUsageSnooper a0) throws Throwable;
private static native java.util.HashMap __call572_1() throws Throwable;
private static native void __fieldWrite572_2(net.minecraft.profiler.PlayerUsageSnooper a0, java.util.HashMap a1) throws Throwable;
private static native int[] __call572_3() throws Throwable;
private static native java.util.HashMap __call572_4() throws Throwable;
private static native void __fieldWrite572_5(net.minecraft.profiler.PlayerUsageSnooper a0, java.util.HashMap a1) throws Throwable;
private static native java.util.UUID __call572_6() throws Throwable;
private static native java.lang.String __call572_7(java.util.UUID a0) throws Throwable;
private static native void __fieldWrite572_8(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite572_9(net.minecraft.profiler.PlayerUsageSnooper a0, java.util.Timer a1) throws Throwable;
private static native void __fieldWrite572_10(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.Object a1) throws Throwable;
private static native java.lang.String __invokedynamic572_11(java.lang.String a0) throws Throwable;
private static native void __fieldWrite572_12(net.minecraft.profiler.PlayerUsageSnooper a0, java.net.URL a1) throws Throwable;
private static native void __fieldWrite572_13(net.minecraft.profiler.PlayerUsageSnooper a0, net.minecraft.profiler.IPlayerUsage a1) throws Throwable;
private static native void __fieldWrite572_14(net.minecraft.profiler.PlayerUsageSnooper a0, long a1) throws Throwable;
private static native void __call572_15(java.lang.String[] a0) throws Throwable;
private static native java.lang.Exception __call3057201_0(java.net.MalformedURLException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_409b5b0186d60a115ebc(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Object a2) throws E;
private static final class __SourceHandler_409b5b0186d60a115ebc {

public static void f696(net.minecraft.profiler.PlayerUsageSnooper receiver, java.lang.String p0, java.lang.Object p1) throws Throwable {
    java.lang.Object life3_3;
    __monitorEnter696_1((life3_3 = __fieldRead696_0(receiver)));
    __call696_3(__fieldRead696_2(receiver), p0, p1);
    __monitorExit696_4(life3_3);
    return;
}
public static void h696_0(java.lang.Throwable p0, java.lang.Object p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __monitorExit3069600_0(p1);
    throw life2_2;
}
private static native java.lang.Object __fieldRead696_0(net.minecraft.profiler.PlayerUsageSnooper a0) throws Throwable;
private static native void __monitorEnter696_1(java.lang.Object a0) throws Throwable;
private static native java.util.Map __fieldRead696_2(net.minecraft.profiler.PlayerUsageSnooper a0) throws Throwable;
private static native java.lang.Object __call696_3(java.util.Map a0, java.lang.String a1, java.lang.Object a2) throws Throwable;
private static native void __monitorExit696_4(java.lang.Object a0) throws Throwable;
private static native void __monitorExit3069600_0(java.lang.Object a0) throws Throwable;

}

private static native <E extends Throwable> java.util.Map __sourceHandlerCall_111e731895cb5e7c0318(net.minecraft.profiler.PlayerUsageSnooper a0) throws E;
private static final class __SourceHandler_111e731895cb5e7c0318 {

public static java.util.Map f697(net.minecraft.profiler.PlayerUsageSnooper receiver) throws Throwable {
    java.util.LinkedHashMap forestValue697_67_0;
    java.lang.Object forestValue697_67_1;
    java.util.LinkedHashMap forestValue697_73_0;
    int[] spill697_0;
    java.util.LinkedHashMap spill697_1;
    java.lang.String spill697_2;
    long life1_3;
    java.util.LinkedHashMap life4_6;
    int[] life3_7;
    java.lang.Object life5_11;
    java.util.Iterator life6_19;
    java.util.Map.Entry life7_26;
    java.util.Map.Entry life7_52;
    forest_join_73: {
    forest_join_67: {
    forest_join_65: {
    forest_join_45: {
    forest_join_40: {
    life1_3 = (__fieldRead697_0() ^ 101590071977427L);
    spill697_0 = __call697_1();
    life4_6 = __call697_2();
    life3_7 = spill697_0;
    __monitorEnter697_4((life5_11 = __fieldRead697_3(receiver)));
    __call697_5(receiver);
    life6_19 = __call697_8(__call697_7(__fieldRead697_6(receiver)));
    forest_cycle_20: while (true) {
    if (!(__call697_9(life6_19))) {
        break forest_join_40;
    }
    life7_26 = __cast697_11(__call697_10(life6_19));
    __call697_16(life4_6, __cast697_13(__call697_12(life7_26)), __call697_15(__call697_14(life7_26)));
    if (!((life3_7 != null))) {
        break forest_join_45;
    }
    if (!((life3_7 == null))) {
        continue forest_cycle_20;
    }
    break forest_cycle_20;
    }
    }
    life6_19 = __call697_19(__call697_18(__fieldRead697_17(receiver)));
    }
    forest_cycle_45: while (true) {
    if (!(__call697_20(life6_19))) {
        break forest_join_65;
    }
    life7_52 = __cast697_22(__call697_21(life6_19));
    spill697_1 = life4_6;
    spill697_2 = __cast697_24(__call697_23(life7_52));
    if (!((life3_7 != null))) {
        forestValue697_67_0 = spill697_1;
        forestValue697_67_1 = spill697_2;
        break forest_join_67;
    }
    __call697_27(spill697_1, spill697_2, __call697_26(__call697_25(life7_52)));
    if (!((life3_7 == null))) {
        continue forest_cycle_45;
    }
    break forest_cycle_45;
    }
    }
    forestValue697_67_0 = life4_6;
    forestValue697_67_1 = life5_11;
    }
    __monitorExit697_28(forestValue697_67_1);
    if (!((__call697_29() != null))) {
        forestValue697_73_0 = forestValue697_67_0;
        break forest_join_73;
    }
    __call697_30(new int[1]);
    forestValue697_73_0 = forestValue697_67_0;
    }
    return forestValue697_73_0;
}
public static java.util.Map h697_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069700_0(p0);
}
public static java.util.Map h697_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3069701_0(p0);
}
public static java.util.Map h697_2(java.lang.Throwable p0, java.lang.Object p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __monitorExit3069702_0(p1);
    throw life2_2;
}
private static native long __fieldRead697_0() throws Throwable;
private static native int[] __call697_1() throws Throwable;
private static native java.util.LinkedHashMap __call697_2() throws Throwable;
private static native java.lang.Object __fieldRead697_3(net.minecraft.profiler.PlayerUsageSnooper a0) throws Throwable;
private static native void __monitorEnter697_4(java.lang.Object a0) throws Throwable;
private static native void __call697_5(net.minecraft.profiler.PlayerUsageSnooper a0) throws Throwable;
private static native java.util.Map __fieldRead697_6(net.minecraft.profiler.PlayerUsageSnooper a0) throws Throwable;
private static native java.util.Set __call697_7(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call697_8(java.util.Set a0) throws Throwable;
private static native boolean __call697_9(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call697_10(java.util.Iterator a0) throws Throwable;
private static native java.util.Map.Entry __cast697_11(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call697_12(java.util.Map.Entry a0) throws Throwable;
private static native java.lang.String __cast697_13(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call697_14(java.util.Map.Entry a0) throws Throwable;
private static native java.lang.String __call697_15(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call697_16(java.util.LinkedHashMap a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.util.Map __fieldRead697_17(net.minecraft.profiler.PlayerUsageSnooper a0) throws Throwable;
private static native java.util.Set __call697_18(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call697_19(java.util.Set a0) throws Throwable;
private static native boolean __call697_20(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call697_21(java.util.Iterator a0) throws Throwable;
private static native java.util.Map.Entry __cast697_22(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call697_23(java.util.Map.Entry a0) throws Throwable;
private static native java.lang.String __cast697_24(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call697_25(java.util.Map.Entry a0) throws Throwable;
private static native java.lang.String __call697_26(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call697_27(java.util.LinkedHashMap a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __monitorExit697_28(java.lang.Object a0) throws Throwable;
private static native java.lang.String[] __call697_29() throws Throwable;
private static native void __call697_30(int[] a0) throws Throwable;
private static native java.lang.Exception __call3069700_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3069701_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native void __monitorExit3069702_0(java.lang.Object a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_d75289f667656e34c370(net.minecraft.profiler.PlayerUsageSnooper a0) throws E;
private static final class __SourceHandler_d75289f667656e34c370 {

public static void f1657(net.minecraft.profiler.PlayerUsageSnooper receiver) throws Throwable {
    net.minecraft.profiler.PlayerUsageSnooper forwardValue1657_17_0;
    net.minecraft.profiler.PlayerUsageSnooper spill1657_0;
    long life1_3;
    int[] life3_5;
    forward_join_25: {
    forward_join_17: {
    life1_3 = (__fieldRead1657_0() ^ 110460445783211L);
    life3_5 = __call1657_1();
    spill1657_0 = receiver;
    if (!((life3_5 != null))) {
        forwardValue1657_17_0 = spill1657_0;
        break forward_join_17;
    }
    if (!((!__fieldRead1657_2(spill1657_0)))) {
        break forward_join_25;
    }
    __fieldWrite1657_3(receiver, 1);
    __call1657_4(receiver);
    forwardValue1657_17_0 = receiver;
    }
    __call1657_7(__fieldRead1657_5(forwardValue1657_17_0), new moom.OI(receiver), 0L, __fieldRead1657_6());
    }
    return;
}
public static void h1657_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1165700_0(p0);
}
public static void h1657_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1165701_0(p0);
}
private static native long __fieldRead1657_0() throws Throwable;
private static native int[] __call1657_1() throws Throwable;
private static native boolean __fieldRead1657_2(net.minecraft.profiler.PlayerUsageSnooper a0) throws Throwable;
private static native void __fieldWrite1657_3(net.minecraft.profiler.PlayerUsageSnooper a0, int a1) throws Throwable;
private static native void __call1657_4(net.minecraft.profiler.PlayerUsageSnooper a0) throws Throwable;
private static native java.util.Timer __fieldRead1657_5(net.minecraft.profiler.PlayerUsageSnooper a0) throws Throwable;
private static native long __fieldRead1657_6() throws Throwable;
private static native void __call1657_7(java.util.Timer a0, moom.OI a1, long a2, long a3) throws Throwable;
private static native java.lang.Exception __call1165700_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1165701_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_9560529a9f1b25e9ba67(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Object a2) throws E;
private static final class __SourceHandler_9560529a9f1b25e9ba67 {

public static void f698(net.minecraft.profiler.PlayerUsageSnooper receiver, java.lang.String p0, java.lang.Object p1) throws Throwable {
    java.lang.Object life3_3;
    __monitorEnter698_1((life3_3 = __fieldRead698_0(receiver)));
    __call698_3(__fieldRead698_2(receiver), p0, p1);
    __monitorExit698_4(life3_3);
    return;
}
public static void h698_0(java.lang.Throwable p0, java.lang.Object p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __monitorExit3069800_0(p1);
    throw life2_2;
}
private static native java.lang.Object __fieldRead698_0(net.minecraft.profiler.PlayerUsageSnooper a0) throws Throwable;
private static native void __monitorEnter698_1(java.lang.Object a0) throws Throwable;
private static native java.util.Map __fieldRead698_2(net.minecraft.profiler.PlayerUsageSnooper a0) throws Throwable;
private static native java.lang.Object __call698_3(java.util.Map a0, java.lang.String a1, java.lang.Object a2) throws Throwable;
private static native void __monitorExit698_4(java.lang.Object a0) throws Throwable;
private static native void __monitorExit3069800_0(java.lang.Object a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_fe7e55fe496c2538e27c(net.minecraft.profiler.PlayerUsageSnooper a0) throws E;
private static final class __SourceHandler_fe7e55fe496c2538e27c {

public static void f1658(net.minecraft.profiler.PlayerUsageSnooper receiver) throws Throwable {
    int[] spill1658_0;
    long life1_3;
    java.lang.management.RuntimeMXBean life4_5;
    java.util.List life5_8;
    int life6_11;
    int[] life3_12;
    java.util.Iterator life7_15;
    java.lang.String life8_22;
    lexical_join_42: {
    lexical_join_37: {
    life1_3 = (__fieldRead1658_0() ^ 17943447771979L);
    life4_5 = __call1658_1();
    life5_8 = __call1658_2(life4_5);
    spill1658_0 = __call1658_3();
    life6_11 = 0;
    life3_12 = spill1658_0;
    life7_15 = __call1658_4(life5_8);
    lexical_cycle_16: while (true) {
    lexical_join_35: {
    if (!(__call1658_5(life7_15))) {
        break lexical_join_37;
    }
    life8_22 = __cast1658_7(__call1658_6(life7_15));
    if (!((life3_12 != null))) {
        break lexical_join_42;
    }
    if (!(__call1658_8(life8_22, "-X"))) {
        break lexical_join_35;
    }
    __call1658_10(receiver, __invokedynamic1658_9((life6_11++)), life8_22);
    }
    if (!((life3_12 == null))) { continue lexical_cycle_16; }
    break lexical_cycle_16;
    }
    }
    __call1658_12(receiver, "jvm_args", __call1658_11(life6_11));
    }
    return;
}
public static void h1658_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1165800_0(p0);
}
public static void h1658_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1165801_0(p0);
}
private static native long __fieldRead1658_0() throws Throwable;
private static native java.lang.management.RuntimeMXBean __call1658_1() throws Throwable;
private static native java.util.List __call1658_2(java.lang.management.RuntimeMXBean a0) throws Throwable;
private static native int[] __call1658_3() throws Throwable;
private static native java.util.Iterator __call1658_4(java.util.List a0) throws Throwable;
private static native boolean __call1658_5(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1658_6(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast1658_7(java.lang.Object a0) throws Throwable;
private static native boolean __call1658_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic1658_9(int a0) throws Throwable;
private static native void __call1658_10(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.Integer __call1658_11(int a0) throws Throwable;
private static native void __call1658_12(net.minecraft.profiler.PlayerUsageSnooper a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.lang.Exception __call1165800_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1165801_0(java.lang.IllegalArgumentException a0) throws Throwable;

}


public void b(java.lang.String p0, java.lang.Object p1) { __sourceHandlerCall_9560529a9f1b25e9ba67(this, p0, p1); }


private void b() {
((net.minecraft.profiler.PlayerUsageSnooper)(this)).c();
    ((net.minecraft.profiler.PlayerUsageSnooper)(this)).a(((java.lang.String)("snooper_token")), ((java.lang.Object)(this.c)));
    ((net.minecraft.profiler.PlayerUsageSnooper)(this)).b(((java.lang.String)("snooper_token")), ((java.lang.Object)(this.c)));
    ((net.minecraft.profiler.PlayerUsageSnooper)(this)).b(((java.lang.String)("os_name")), ((java.lang.Object)(java.lang.System.getProperty(((java.lang.String)("os.name"))))));
    ((net.minecraft.profiler.PlayerUsageSnooper)(this)).b(((java.lang.String)("os_version")), ((java.lang.Object)(java.lang.System.getProperty(((java.lang.String)("os.version"))))));
    ((net.minecraft.profiler.PlayerUsageSnooper)(this)).b(((java.lang.String)("os_architecture")), ((java.lang.Object)(java.lang.System.getProperty(((java.lang.String)("os.arch"))))));
    ((net.minecraft.profiler.PlayerUsageSnooper)(this)).b(((java.lang.String)("java_version")), ((java.lang.Object)(java.lang.System.getProperty(((java.lang.String)("java.version"))))));
    ((net.minecraft.profiler.PlayerUsageSnooper)(this)).a(((java.lang.String)("version")), ((java.lang.Object)("1.8.9")));
    ((net.minecraft.profiler.IPlayerUsage)(this.e)).b(((net.minecraft.profiler.PlayerUsageSnooper)(this)));
    return;
}


public void e() {
((java.util.Timer)(this.f)).cancel();
    return;
}


private void c() { __sourceHandlerCall_fe7e55fe496c2538e27c(this); }


public void d() {
((net.minecraft.profiler.PlayerUsageSnooper)(this)).b(((java.lang.String)("memory_total")), ((java.lang.Object)(java.lang.Long.valueOf(((long)(((java.lang.Runtime)(java.lang.Runtime.getRuntime())).totalMemory()))))));
    ((net.minecraft.profiler.PlayerUsageSnooper)(this)).b(((java.lang.String)("memory_max")), ((java.lang.Object)(java.lang.Long.valueOf(((long)(((java.lang.Runtime)(java.lang.Runtime.getRuntime())).maxMemory()))))));
    ((net.minecraft.profiler.PlayerUsageSnooper)(this)).b(((java.lang.String)("memory_free")), ((java.lang.Object)(java.lang.Long.valueOf(((long)(((java.lang.Runtime)(java.lang.Runtime.getRuntime())).freeMemory()))))));
    ((net.minecraft.profiler.PlayerUsageSnooper)(this)).b(((java.lang.String)("cpu_cores")), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(((java.lang.Runtime)(java.lang.Runtime.getRuntime())).availableProcessors()))))));
    ((net.minecraft.profiler.IPlayerUsage)(this.e)).a(((net.minecraft.profiler.PlayerUsageSnooper)(this)));
    return;
}


public java.lang.String a__String() {
return this.c;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public long a() {
return this.h;
}


public void a__Void() { __sourceHandlerCall_d75289f667656e34c370(this); }


public void a(java.lang.String p0, java.lang.Object p1) { __sourceHandlerCall_409b5b0186d60a115ebc(this, p0, p1); }


public java.util.Map<java.lang.String, java.lang.String> a__Map() { return __sourceHandlerCall_111e731895cb5e7c0318(this); }


public boolean a__Boolean() {
return ((((this.i) ? 1 : 0)) != 0);
}

}
