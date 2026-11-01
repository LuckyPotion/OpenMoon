package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class M3 {

private int a;

private java.lang.String b;

private java.lang.String c;

private java.lang.String d;

private static long e;

private static java.lang.String[] f;

private static java.lang.String[] g;

private static java.util.Map h;

private static long[] i;

private static java.lang.Integer[] j;

private static java.util.Map k;

public M3(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
    this.d = p3;
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(-1398104077933317115L)), ((long)(4644821934987209820L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(183297213779362L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.M3.e ^ 129225340525586L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill686_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill686_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill686_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill686_14 = new byte[8];
    (__sourceSpill686_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill686_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation686_16 = __sourceSpill686_14;
    ((javax.crypto.Cipher)(__sourceSpill686_11)).init(((int)(__sourceSpill686_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill686_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation686_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[10];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "QQh×Áîèê¦È±HáBA\020;áÐÄÍÜ\002\027â\003Lù_(Â\034ôªX\001<í\030,U!ÒuMß÷\007\037pÀ¨Nh¶prü ^:öÎ_qjE £§Ò¯`$§ï.Uºô³\026I#\027o=î½á\016ÎÝæ®Ô0Û2äÚÈÖC<­b`jH\177Ø}gè\013°Þ¼\037sNeÏ~\\NÝy¡\"Ù¦SDm! d\007gý>ûR­#F×5\026í\0361\016fl]Á}¤3\013íõøk\020\\ÆlÓ·XÕµZaP|àlÔK\030\021'ÜÏgò\002¼ªB2ÃÆZ¿\021`\021%\024\bÑè"))).length();
    int local16_life24 = 16;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill686_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill686_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill686_29)).doFinal(((byte[])(__sourceSpill686_28)));
        java.lang.String __sourceSpill686_34 = ((java.lang.String)(moom.M3.a(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill686_35 = local20_life19;
        int __sourceSpill686_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill686_35)[__sourceSpill686_36] = __sourceSpill686_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "Íßhûç¦¹@HJ3í«e\020­\007ò¤ÀÁ&áP\022tñb\be"))).length();
    local16_life24 = 16;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill686_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill686_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill686_42)).doFinal(((byte[])(__sourceSpill686_41)));
        java.lang.String __sourceSpill686_47 = ((java.lang.String)(moom.M3.a(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill686_48 = local20_life19;
        int __sourceSpill686_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill686_48)[__sourceSpill686_49] = __sourceSpill686_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    f = ((java.lang.String[])(local20_life19));
    g = ((java.lang.String[])(new java.lang.String[10]));
    k = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill686_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill686_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill686_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill686_60 = new byte[8];
    (__sourceSpill686_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill686_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation686_62 = __sourceSpill686_60;
    ((javax.crypto.Cipher)(__sourceSpill686_57)).init(((int)(__sourceSpill686_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill686_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation686_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[3];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "º~\b\b\033vñ0n\001HûÒéµª\177Å\024hgq"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill686_71 = local4_life67;
        int __sourceSpill686_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill686_71)).substring(((int)(__sourceSpill686_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill686_76 = local6_life65;
        int __sourceSpill686_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill686_79 = new byte[8];
        (__sourceSpill686_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill686_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill686_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill686_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill686_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill686_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill686_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill686_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill686_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill686_80)).doFinal(((byte[])(__sourceSpill686_79)));
        (__sourceSpill686_76)[__sourceSpill686_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    i = ((long[])(local6_life65));
    j = ((java.lang.Integer[])(new java.lang.Integer[3]));
}

private static native <E extends Throwable> float __sourceHandlerCall_eddda526aa41c1f0e96a(moom.M3 a0) throws E;
private static final class __SourceHandler_eddda526aa41c1f0e96a {

public static float f346(moom.M3 receiver) throws Throwable {
    long life1_3;
    life1_3 = (__fieldRead346_0() ^ 30294338730707L);
    return __call346_2(__fieldRead346_1(receiver));
}
public static float h346_0(java.lang.NumberFormatException p0, moom.M3 p1, long p2) throws Throwable {
    java.lang.NumberFormatException life4_2;
    life4_2 = p0;
    java.lang.Object __inlineStack3034600_3Token;
    java.lang.Object __inlineStack3034600_5Token;
    throw new java.lang.NumberFormatException(__invokedynamic3034600_6(__inlineStack3034600_3Output0((__inlineStack3034600_3Token = __inlineStack3034600_3Pack(__fieldRead3034600_0(p1), __fieldRead3034600_1(p1), __invokedynamic3034600_2(10494, (990064453671170352L ^ p2))))), __inlineStack3034600_3Output1(__inlineStack3034600_3Token), __inlineStack3034600_5Output0((__inlineStack3034600_5Token = __inlineStack3034600_5Pack(__inlineStack3034600_3Output2(__inlineStack3034600_3Token), __invokedynamic3034600_4(17123, (496356299754101547L ^ p2))))), __inlineStack3034600_5Output1(__inlineStack3034600_5Token)));
}
private static native long __fieldRead346_0() throws Throwable;
private static native java.lang.String __fieldRead346_1(moom.M3 a0) throws Throwable;
private static native float __call346_2(java.lang.String a0) throws Throwable;
private static native java.lang.String __fieldRead3034600_0(moom.M3 a0) throws Throwable;
private static native java.lang.String __fieldRead3034600_1(moom.M3 a0) throws Throwable;
private static native java.lang.String __invokedynamic3034600_2(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack3034600_3Pack(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __inlineStack3034600_3Output0(java.lang.Object token) throws Throwable;
private static native java.lang.String __inlineStack3034600_3Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __inlineStack3034600_3Output2(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic3034600_4(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack3034600_5Pack(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack3034600_5Output0(java.lang.Object token) throws Throwable;
private static native java.lang.String __inlineStack3034600_5Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic3034600_6(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_1e5590951d8c6660f7f4(moom.M3 a0) throws E;
private static final class __SourceHandler_1e5590951d8c6660f7f4 {

public static int f347(moom.M3 receiver) throws Throwable {
    long life1_3;
    life1_3 = (__fieldRead347_0() ^ 126178203155308L);
    return __call347_2(__fieldRead347_1(receiver));
}
public static int h347_0(java.lang.NumberFormatException p0, moom.M3 p1, long p2) throws Throwable {
    java.lang.NumberFormatException life4_2;
    life4_2 = p0;
    java.lang.Object __inlineStack3034700_3Token;
    java.lang.Object __inlineStack3034700_5Token;
    throw new java.lang.NumberFormatException(__invokedynamic3034700_6(__inlineStack3034700_3Output0((__inlineStack3034700_3Token = __inlineStack3034700_3Pack(__fieldRead3034700_0(p1), __fieldRead3034700_1(p1), __invokedynamic3034700_2(19809, (1072290102009632023L ^ p2))))), __inlineStack3034700_3Output1(__inlineStack3034700_3Token), __inlineStack3034700_5Output0((__inlineStack3034700_5Token = __inlineStack3034700_5Pack(__inlineStack3034700_3Output2(__inlineStack3034700_3Token), __invokedynamic3034700_4(3433, (2021707399157667098L ^ p2))))), __inlineStack3034700_5Output1(__inlineStack3034700_5Token)));
}
private static native long __fieldRead347_0() throws Throwable;
private static native java.lang.String __fieldRead347_1(moom.M3 a0) throws Throwable;
private static native int __call347_2(java.lang.String a0) throws Throwable;
private static native java.lang.String __fieldRead3034700_0(moom.M3 a0) throws Throwable;
private static native java.lang.String __fieldRead3034700_1(moom.M3 a0) throws Throwable;
private static native java.lang.String __invokedynamic3034700_2(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack3034700_3Pack(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __inlineStack3034700_3Output0(java.lang.Object token) throws Throwable;
private static native java.lang.String __inlineStack3034700_3Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __inlineStack3034700_3Output2(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic3034700_4(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack3034700_5Pack(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack3034700_5Output0(java.lang.Object token) throws Throwable;
private static native java.lang.String __inlineStack3034700_5Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic3034700_6(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_ebe0021fa2afc38e03e2(moom.M3 a0) throws E;
private static final class __SourceHandler_ebe0021fa2afc38e03e2 {

public static boolean f348(moom.M3 receiver) throws Throwable {
    int forestValue348_55_0;
    int[] spill348_0;
    boolean spill348_1;
    boolean spill348_2;
    long life1_3;
    java.lang.String life4_8;
    int[] life3_9;
    forest_join_55: {
    forest_join_52: {
    life1_3 = (__fieldRead348_0() ^ 38021200701803L);
    spill348_0 = __call348_1();
    life4_8 = __call348_3(__fieldRead348_2(receiver));
    life3_9 = spill348_0;
    spill348_1 = __call348_5(life4_8, __invokedynamic348_4(8740, (5831839982558423135L ^ life1_3)));
    if (!((life3_9 == null))) {
        forestValue348_55_0 = __integerCategory348_6(spill348_1);
        break forest_join_55;
    }
    if (!((!spill348_1))) {
        break forest_join_52;
    }
    spill348_2 = __call348_8(life4_8, __invokedynamic348_7(31229, (3294568056258917262L ^ life1_3)));
    if (!((life3_9 == null))) {
        forestValue348_55_0 = __integerCategory348_9(spill348_2);
        break forest_join_55;
    }
    if (!((!spill348_2))) {
        break forest_join_52;
    }
    java.lang.Object __inlineStack348_13Token;
    java.lang.Object __inlineStack348_15Token;
    throw new java.lang.RuntimeException(__invokedynamic348_16(__inlineStack348_13Output0((__inlineStack348_13Token = __inlineStack348_13Pack(__fieldRead348_10(receiver), __fieldRead348_11(receiver), __invokedynamic348_12(9534, (7430853251942657865L ^ life1_3))))), __inlineStack348_13Output1(__inlineStack348_13Token), __inlineStack348_15Output0((__inlineStack348_15Token = __inlineStack348_15Pack(__inlineStack348_13Output2(__inlineStack348_13Token), __invokedynamic348_14(17123, (496328848250226835L ^ life1_3))))), __inlineStack348_15Output1(__inlineStack348_15Token)));
    }
    forestValue348_55_0 = __integerCategory348_19(__call348_18(__fieldRead348_17(receiver)));
    }
    return __integerCategory348_20(forestValue348_55_0);
}
private static native long __fieldRead348_0() throws Throwable;
private static native int[] __call348_1() throws Throwable;
private static native java.lang.String __fieldRead348_2(moom.M3 a0) throws Throwable;
private static native java.lang.String __call348_3(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic348_4(int a0, long a1) throws Throwable;
private static native boolean __call348_5(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory348_6(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic348_7(int a0, long a1) throws Throwable;
private static native boolean __call348_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory348_9(boolean value) throws Throwable;
private static native java.lang.String __fieldRead348_10(moom.M3 a0) throws Throwable;
private static native java.lang.String __fieldRead348_11(moom.M3 a0) throws Throwable;
private static native java.lang.String __invokedynamic348_12(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack348_13Pack(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __inlineStack348_13Output0(java.lang.Object token) throws Throwable;
private static native java.lang.String __inlineStack348_13Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __inlineStack348_13Output2(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic348_14(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack348_15Pack(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack348_15Output0(java.lang.Object token) throws Throwable;
private static native java.lang.String __inlineStack348_15Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic348_16(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws Throwable;
private static native java.lang.String __fieldRead348_17(moom.M3 a0) throws Throwable;
private static native boolean __call348_18(java.lang.String a0) throws Throwable;
private static native int __integerCategory348_19(boolean value) throws Throwable;
private static native boolean __integerCategory348_20(int value) throws Throwable;

}


public boolean i(java.lang.String p0) {
int forwardValue2631_15_0;
    int forwardValue2631_19_0;
    int forwardValue2631_21_0;
    boolean spill2631_0;
    long life2_3;
    int[] life4_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    forward_join_15: {
    life2_3 = (moom.M3.e ^ 25895014894679L);
    life4_5 = moom.M7.b__ArrayInt();
    spill2631_0 = ((moom.M3)(this)).f();
    if (!((life4_5 == null))) {
        forwardValue2631_15_0 = ((spill2631_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!(spill2631_0)) {
        break forward_join_20;
    }
    forwardValue2631_15_0 = ((((java.lang.String)(this.b)).endsWith(((java.lang.String)(p0)))) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue2631_19_0 = forwardValue2631_15_0;
        break forward_join_19;
    }
    if (!((forwardValue2631_15_0 != 0))) {
        break forward_join_20;
    }
    forwardValue2631_19_0 = 1;
    }
    forwardValue2631_21_0 = forwardValue2631_19_0;
    break forward_join_21;
    }
    forwardValue2631_21_0 = 0;
    }
    return ((forwardValue2631_21_0) != 0);
}


public boolean i() { return __sourceHandlerCall_ebe0021fa2afc38e03e2(this); }


public java.lang.String b__String() {
return this.c;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral6005_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/M3"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean b(java.lang.String p0, boolean p1) {
int forwardValue2616_14_0;
    int forwardValue2616_19_0;
    int forwardValue2616_21_0;
    boolean spill2616_0;
    long life3_3;
    int[] life5_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    forward_join_14: {
    life3_3 = (moom.M3.e ^ 121271450640610L);
    life5_5 = moom.M7.b__ArrayInt();
    spill2616_0 = ((moom.M3)(this)).g(((java.lang.String)(p0)));
    if (!((life5_5 == null))) {
        forwardValue2616_14_0 = ((spill2616_0) ? 1 : 0);
        break forward_join_14;
    }
    if (!(spill2616_0)) {
        break forward_join_20;
    }
    forwardValue2616_14_0 = ((((moom.M3)(this)).i()) ? 1 : 0);
    }
    if (!((life5_5 == null))) {
        forwardValue2616_19_0 = forwardValue2616_14_0;
        break forward_join_19;
    }
    if (!((forwardValue2616_14_0 == ((p1) ? 1 : 0)))) {
        break forward_join_20;
    }
    forwardValue2616_19_0 = 1;
    }
    forwardValue2616_21_0 = forwardValue2616_19_0;
    break forward_join_21;
    }
    forwardValue2616_21_0 = 0;
    }
    return ((forwardValue2616_21_0) != 0);
}


public int b() { return __sourceHandlerCall_1e5590951d8c6660f7f4(this); }


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0xC87;
        if (j[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = i[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])k.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    k.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/M3", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            M3.j[n2] = n4;
        }
        return j[n2];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.M3.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public boolean b(java.lang.String p0, java.lang.String p1) {
int forwardValue2615_19_0;
    int forwardValue2615_21_0;
    boolean spill2615_0;
    boolean spill2615_1;
    long life3_3;
    int[] life5_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    life3_3 = (moom.M3.e ^ 7304491360552L);
    life5_5 = moom.M7.b__ArrayInt();
    spill2615_0 = ((moom.M3)(this)).g(((java.lang.String)(p0)));
    if (!((life5_5 == null))) {
        forwardValue2615_19_0 = ((spill2615_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!((!spill2615_0))) {
        break forward_join_18;
    }
    spill2615_1 = ((moom.M3)(this)).g(((java.lang.String)(p1)));
    if (!((life5_5 == null))) {
        forwardValue2615_19_0 = ((spill2615_1) ? 1 : 0);
        break forward_join_19;
    }
    if (!(spill2615_1)) {
        break forward_join_20;
    }
    }
    forwardValue2615_19_0 = 1;
    }
    forwardValue2615_21_0 = forwardValue2615_19_0;
    break forward_join_21;
    }
    forwardValue2615_21_0 = 0;
    }
    return ((forwardValue2615_21_0) != 0);
}


public boolean b__Boolean() {
int forwardValue2617_13_0;
    int forwardValue2617_15_0;
    int spill2617_0;
    long life1_3;
    int[] life3_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (moom.M3.e ^ 63492831567209L);
    life3_5 = moom.M7.b__ArrayInt();
    spill2617_0 = this.a;
    if (!((life3_5 == null))) {
        forwardValue2617_13_0 = spill2617_0;
        break forward_join_13;
    }
    if (!((spill2617_0 == 2))) {
        break forward_join_14;
    }
    forwardValue2617_13_0 = 1;
    }
    forwardValue2617_15_0 = forwardValue2617_13_0;
    break forward_join_15;
    }
    forwardValue2617_15_0 = 0;
    }
    return ((forwardValue2617_15_0) != 0);
}


public boolean b(java.lang.String p0) {
int forwardValue2614_15_0;
    int forwardValue2614_19_0;
    int forwardValue2614_21_0;
    boolean spill2614_0;
    long life2_3;
    int[] life4_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    forward_join_15: {
    life2_3 = (moom.M3.e ^ 89358246994976L);
    life4_5 = moom.M7.b__ArrayInt();
    spill2614_0 = ((moom.M3)(this)).b__Boolean();
    if (!((life4_5 == null))) {
        forwardValue2614_15_0 = ((spill2614_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!(spill2614_0)) {
        break forward_join_20;
    }
    forwardValue2614_15_0 = ((((java.lang.String)(p0)).equals(((java.lang.Object)(this.b)))) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue2614_19_0 = forwardValue2614_15_0;
        break forward_join_19;
    }
    if (!((forwardValue2614_15_0 != 0))) {
        break forward_join_20;
    }
    forwardValue2614_19_0 = 1;
    }
    forwardValue2614_21_0 = forwardValue2614_19_0;
    break forward_join_21;
    }
    forwardValue2614_21_0 = 0;
    }
    return ((forwardValue2614_21_0) != 0);
}


public boolean e() {
int forwardValue2622_13_0;
    int forwardValue2622_15_0;
    int spill2622_0;
    long life1_3;
    int[] life3_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (moom.M3.e ^ 83512944620067L);
    life3_5 = moom.M7.b__ArrayInt();
    spill2622_0 = this.a;
    if (!((life3_5 == null))) {
        forwardValue2622_13_0 = spill2622_0;
        break forward_join_13;
    }
    if (!((spill2622_0 == 4))) {
        break forward_join_14;
    }
    forwardValue2622_13_0 = 1;
    }
    forwardValue2622_15_0 = forwardValue2622_13_0;
    break forward_join_15;
    }
    forwardValue2622_15_0 = 0;
    }
    return ((forwardValue2622_15_0) != 0);
}


public boolean e(java.lang.String p0) {
int forwardValue2623_15_0;
    int forwardValue2623_19_0;
    int forwardValue2623_21_0;
    boolean spill2623_0;
    long life2_3;
    int[] life4_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    forward_join_15: {
    life2_3 = (moom.M3.e ^ 28436316967845L);
    life4_5 = moom.M7.b__ArrayInt();
    spill2623_0 = ((moom.M3)(this)).d();
    if (!((life4_5 == null))) {
        forwardValue2623_15_0 = ((spill2623_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!(spill2623_0)) {
        break forward_join_20;
    }
    forwardValue2623_15_0 = ((((java.lang.String)(this.b)).endsWith(((java.lang.String)(p0)))) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue2623_19_0 = forwardValue2623_15_0;
        break forward_join_19;
    }
    if (!((forwardValue2623_15_0 != 0))) {
        break forward_join_20;
    }
    forwardValue2623_19_0 = 1;
    }
    forwardValue2623_21_0 = forwardValue2623_19_0;
    break forward_join_21;
    }
    forwardValue2623_21_0 = 0;
    }
    return ((forwardValue2623_21_0) != 0);
}


public boolean c() {
int forwardValue2618_17_0;
    int forwardValue2618_19_0;
    int spill2618_0;
    long life1_3;
    int[] life3_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    life1_3 = (moom.M3.e ^ 128388838501703L);
    life3_5 = moom.M7.b__ArrayInt();
    spill2618_0 = this.a;
    if (!((life3_5 == null))) {
        forwardValue2618_17_0 = spill2618_0;
        break forward_join_17;
    }
    if (!((spill2618_0 == __sourceIntrinsic_d787a616d33a_invokedynamic2618_3(12296, (2298019399060501346L ^ life1_3))))) {
        break forward_join_18;
    }
    forwardValue2618_17_0 = 1;
    }
    forwardValue2618_19_0 = forwardValue2618_17_0;
    break forward_join_19;
    }
    forwardValue2618_19_0 = 0;
    }
    return ((forwardValue2618_19_0) != 0);
}


public boolean c(java.lang.String p0) {
int forwardValue2619_15_0;
    int forwardValue2619_19_0;
    int forwardValue2619_21_0;
    boolean spill2619_0;
    long life2_3;
    int[] life4_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    forward_join_15: {
    life2_3 = (moom.M3.e ^ 12955284392978L);
    life4_5 = moom.M7.b__ArrayInt();
    spill2619_0 = ((moom.M3)(this)).c();
    if (!((life4_5 == null))) {
        forwardValue2619_15_0 = ((spill2619_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!(spill2619_0)) {
        break forward_join_20;
    }
    forwardValue2619_15_0 = ((((java.lang.String)(p0)).equals(((java.lang.Object)(this.b)))) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue2619_19_0 = forwardValue2619_15_0;
        break forward_join_19;
    }
    if (!((forwardValue2619_15_0 != 0))) {
        break forward_join_20;
    }
    forwardValue2619_19_0 = 1;
    }
    forwardValue2619_21_0 = forwardValue2619_19_0;
    break forward_join_21;
    }
    forwardValue2619_21_0 = 0;
    }
    return ((forwardValue2619_21_0) != 0);
}


public boolean h() {
int forwardValue2628_17_0;
    int forwardValue2628_19_0;
    int spill2628_0;
    long life1_3;
    int[] life3_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    life1_3 = (moom.M3.e ^ 76559329381782L);
    life3_5 = moom.M7.b__ArrayInt();
    spill2628_0 = this.a;
    if (!((life3_5 == null))) {
        forwardValue2628_17_0 = spill2628_0;
        break forward_join_17;
    }
    if (!((spill2628_0 == __sourceIntrinsic_4d53036195fc_invokedynamic2628_3(10592, (605187888291498713L ^ life1_3))))) {
        break forward_join_18;
    }
    forwardValue2628_17_0 = 1;
    }
    forwardValue2628_19_0 = forwardValue2628_17_0;
    break forward_join_19;
    }
    forwardValue2628_19_0 = 0;
    }
    return ((forwardValue2628_19_0) != 0);
}


public boolean h(java.lang.String p0) {
int forwardValue2629_15_0;
    int forwardValue2629_19_0;
    int forwardValue2629_21_0;
    boolean spill2629_0;
    long life2_3;
    int[] life4_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    forward_join_15: {
    life2_3 = (moom.M3.e ^ 9379976582108L);
    life4_5 = moom.M7.b__ArrayInt();
    spill2629_0 = ((moom.M3)(this)).g();
    if (!((life4_5 == null))) {
        forwardValue2629_15_0 = ((spill2629_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!(spill2629_0)) {
        break forward_join_20;
    }
    forwardValue2629_15_0 = ((((java.lang.String)(p0)).equals(((java.lang.Object)(this.b)))) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue2629_19_0 = forwardValue2629_15_0;
        break forward_join_19;
    }
    if (!((forwardValue2629_15_0 != 0))) {
        break forward_join_20;
    }
    forwardValue2629_19_0 = 1;
    }
    forwardValue2629_21_0 = forwardValue2629_19_0;
    break forward_join_21;
    }
    forwardValue2629_21_0 = 0;
    }
    return ((forwardValue2629_21_0) != 0);
}


public boolean f(java.lang.String p0) {
int forwardValue2625_15_0;
    int forwardValue2625_19_0;
    int forwardValue2625_21_0;
    boolean spill2625_0;
    long life2_3;
    int[] life4_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    forward_join_15: {
    life2_3 = (moom.M3.e ^ 106590542317868L);
    life4_5 = moom.M7.b__ArrayInt();
    spill2625_0 = ((moom.M3)(this)).e();
    if (!((life4_5 == null))) {
        forwardValue2625_15_0 = ((spill2625_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!(spill2625_0)) {
        break forward_join_20;
    }
    forwardValue2625_15_0 = ((((java.lang.String)(p0)).equals(((java.lang.Object)(this.b)))) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue2625_19_0 = forwardValue2625_15_0;
        break forward_join_19;
    }
    if (!((forwardValue2625_15_0 != 0))) {
        break forward_join_20;
    }
    forwardValue2625_19_0 = 1;
    }
    forwardValue2625_21_0 = forwardValue2625_19_0;
    break forward_join_21;
    }
    forwardValue2625_21_0 = 0;
    }
    return ((forwardValue2625_21_0) != 0);
}


public boolean f() {
int forwardValue2624_13_0;
    int forwardValue2624_15_0;
    int spill2624_0;
    long life1_3;
    int[] life3_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (moom.M3.e ^ 40747225877010L);
    life3_5 = moom.M7.b__ArrayInt();
    spill2624_0 = this.a;
    if (!((life3_5 == null))) {
        forwardValue2624_13_0 = spill2624_0;
        break forward_join_13;
    }
    if (!((spill2624_0 == 5))) {
        break forward_join_14;
    }
    forwardValue2624_13_0 = 1;
    }
    forwardValue2624_15_0 = forwardValue2624_13_0;
    break forward_join_15;
    }
    forwardValue2624_15_0 = 0;
    }
    return ((forwardValue2624_15_0) != 0);
}


public boolean d() {
int forwardValue2620_13_0;
    int forwardValue2620_15_0;
    int spill2620_0;
    long life1_3;
    int[] life3_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (moom.M3.e ^ 62395354896635L);
    life3_5 = moom.M7.b__ArrayInt();
    spill2620_0 = this.a;
    if (!((life3_5 == null))) {
        forwardValue2620_13_0 = spill2620_0;
        break forward_join_13;
    }
    if (!((spill2620_0 == 3))) {
        break forward_join_14;
    }
    forwardValue2620_13_0 = 1;
    }
    forwardValue2620_15_0 = forwardValue2620_13_0;
    break forward_join_15;
    }
    forwardValue2620_15_0 = 0;
    }
    return ((forwardValue2620_15_0) != 0);
}


public boolean d(java.lang.String p0) {
int forwardValue2621_15_0;
    int forwardValue2621_19_0;
    int forwardValue2621_21_0;
    boolean spill2621_0;
    long life2_3;
    int[] life4_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    forward_join_15: {
    life2_3 = (moom.M3.e ^ 67987120121588L);
    life4_5 = moom.M7.b__ArrayInt();
    spill2621_0 = ((moom.M3)(this)).d();
    if (!((life4_5 == null))) {
        forwardValue2621_15_0 = ((spill2621_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!(spill2621_0)) {
        break forward_join_20;
    }
    forwardValue2621_15_0 = ((((java.lang.String)(p0)).equals(((java.lang.Object)(this.b)))) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue2621_19_0 = forwardValue2621_15_0;
        break forward_join_19;
    }
    if (!((forwardValue2621_15_0 != 0))) {
        break forward_join_20;
    }
    forwardValue2621_19_0 = 1;
    }
    forwardValue2621_21_0 = forwardValue2621_19_0;
    break forward_join_21;
    }
    forwardValue2621_21_0 = 0;
    }
    return ((forwardValue2621_21_0) != 0);
}


public java.lang.String a__String() {
return this.b;
}


private static java.lang.NumberFormatException a(java.lang.NumberFormatException p0) {
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
        byte[] spill2611_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2611_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2611_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2611_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2611_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2611_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public boolean a__Boolean() {
int forwardValue2612_13_0;
    int forwardValue2612_15_0;
    int spill2612_0;
    long life1_3;
    int[] life3_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (moom.M3.e ^ 90839580679330L);
    life3_5 = moom.M7.b__ArrayInt();
    spill2612_0 = this.a;
    if (!((life3_5 == null))) {
        forwardValue2612_13_0 = spill2612_0;
        break forward_join_13;
    }
    if (!((spill2612_0 == 1))) {
        break forward_join_14;
    }
    forwardValue2612_13_0 = 1;
    }
    forwardValue2612_15_0 = forwardValue2612_13_0;
    break forward_join_15;
    }
    forwardValue2612_15_0 = 0;
    }
    return ((forwardValue2612_15_0) != 0);
}


public int a__Int() {
return this.a;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6023_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/M3"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean a(java.lang.String p0) {
int forwardValue2605_15_0;
    int forwardValue2605_19_0;
    int forwardValue2605_21_0;
    boolean spill2605_0;
    long life2_3;
    int[] life4_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    forward_join_15: {
    life2_3 = (moom.M3.e ^ 64267919755729L);
    life4_5 = moom.M7.b__ArrayInt();
    spill2605_0 = ((moom.M3)(this)).a__Boolean();
    if (!((life4_5 == null))) {
        forwardValue2605_15_0 = ((spill2605_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!(spill2605_0)) {
        break forward_join_20;
    }
    forwardValue2605_15_0 = ((((java.lang.String)(p0)).equals(((java.lang.Object)(this.b)))) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue2605_19_0 = forwardValue2605_15_0;
        break forward_join_19;
    }
    if (!((forwardValue2605_15_0 != 0))) {
        break forward_join_20;
    }
    forwardValue2605_19_0 = 1;
    }
    forwardValue2605_21_0 = forwardValue2605_19_0;
    break forward_join_21;
    }
    forwardValue2605_21_0 = 0;
    }
    return ((forwardValue2605_21_0) != 0);
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.M3.a(((int)(local4)), ((long)(local5)));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 16816);
    if (((moom.M3.g)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.M3.h)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.M3.h)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/M3", life9_51);
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
        life9_116 = ((java.lang.String)((moom.M3.f)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.M3.g)[life5_8] = moom.M3.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.M3.g)[life5_8];
}


public boolean a(java.lang.String p0, java.lang.String p1, boolean p2) {
int forwardValue2609_15_0;
    int forwardValue2609_20_0;
    int forwardValue2609_22_0;
    boolean spill2609_0;
    long life4_3;
    int[] life6_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    forward_join_15: {
    life4_3 = (moom.M3.e ^ 133509905962706L);
    life6_5 = moom.M7.b__ArrayInt();
    spill2609_0 = ((moom.M3)(this)).b(((java.lang.String)(p0)), ((java.lang.String)(p1)));
    if (!((life6_5 == null))) {
        forwardValue2609_15_0 = ((spill2609_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!(spill2609_0)) {
        break forward_join_21;
    }
    forwardValue2609_15_0 = ((((moom.M3)(this)).i()) ? 1 : 0);
    }
    if (!((life6_5 == null))) {
        forwardValue2609_20_0 = forwardValue2609_15_0;
        break forward_join_20;
    }
    if (!((forwardValue2609_15_0 == ((p2) ? 1 : 0)))) {
        break forward_join_21;
    }
    forwardValue2609_20_0 = 1;
    }
    forwardValue2609_22_0 = forwardValue2609_20_0;
    break forward_join_22;
    }
    forwardValue2609_22_0 = 0;
    }
    return ((forwardValue2609_22_0) != 0);
}


public boolean a(java.lang.String p0, java.lang.String p1, java.lang.String p2) {
int forwardValue2607_25_0;
    int forwardValue2607_27_0;
    boolean spill2607_0;
    boolean spill2607_1;
    boolean spill2607_2;
    long life4_3;
    int[] life6_5;
    forward_join_27: {
    forward_join_26: {
    forward_join_25: {
    forward_join_24: {
    life4_3 = (moom.M3.e ^ 24731336849980L);
    life6_5 = moom.M7.b__ArrayInt();
    spill2607_0 = ((moom.M3)(this)).g(((java.lang.String)(p0)));
    if (!((life6_5 == null))) {
        forwardValue2607_25_0 = ((spill2607_0) ? 1 : 0);
        break forward_join_25;
    }
    if (!((!spill2607_0))) {
        break forward_join_24;
    }
    spill2607_1 = ((moom.M3)(this)).g(((java.lang.String)(p1)));
    if (!((life6_5 == null))) {
        forwardValue2607_25_0 = ((spill2607_1) ? 1 : 0);
        break forward_join_25;
    }
    if (!((!spill2607_1))) {
        break forward_join_24;
    }
    spill2607_2 = ((moom.M3)(this)).g(((java.lang.String)(p2)));
    if (!((life6_5 == null))) {
        forwardValue2607_25_0 = ((spill2607_2) ? 1 : 0);
        break forward_join_25;
    }
    if (!(spill2607_2)) {
        break forward_join_26;
    }
    }
    forwardValue2607_25_0 = 1;
    }
    forwardValue2607_27_0 = forwardValue2607_25_0;
    break forward_join_27;
    }
    forwardValue2607_27_0 = 0;
    }
    return ((forwardValue2607_27_0) != 0);
}


public boolean a(java.lang.String p0, boolean p1) {
int forwardValue2610_14_0;
    int forwardValue2610_19_0;
    int forwardValue2610_21_0;
    boolean spill2610_0;
    long life3_3;
    int[] life5_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    forward_join_14: {
    life3_3 = (moom.M3.e ^ 73652891390656L);
    life5_5 = moom.M7.b__ArrayInt();
    spill2610_0 = ((moom.M3)(this)).i(((java.lang.String)(p0)));
    if (!((life5_5 == null))) {
        forwardValue2610_14_0 = ((spill2610_0) ? 1 : 0);
        break forward_join_14;
    }
    if (!(spill2610_0)) {
        break forward_join_20;
    }
    forwardValue2610_14_0 = ((((moom.M3)(this)).i()) ? 1 : 0);
    }
    if (!((life5_5 == null))) {
        forwardValue2610_19_0 = forwardValue2610_14_0;
        break forward_join_19;
    }
    if (!((forwardValue2610_14_0 == ((p1) ? 1 : 0)))) {
        break forward_join_20;
    }
    forwardValue2610_19_0 = 1;
    }
    forwardValue2610_21_0 = forwardValue2610_19_0;
    break forward_join_21;
    }
    forwardValue2610_21_0 = 0;
    }
    return ((forwardValue2610_21_0) != 0);
}


public boolean a(java.lang.String p0, java.lang.String p1) {
int forwardValue2606_16_0;
    int forwardValue2606_20_0;
    int forwardValue2606_22_0;
    boolean spill2606_0;
    long life3_3;
    int[] life5_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    forward_join_16: {
    life3_3 = (moom.M3.e ^ 72576405368870L);
    life5_5 = moom.M7.b__ArrayInt();
    spill2606_0 = ((moom.M3)(this)).c(((java.lang.String)(p0)));
    if (!((life5_5 == null))) {
        forwardValue2606_16_0 = ((spill2606_0) ? 1 : 0);
        break forward_join_16;
    }
    if (!(spill2606_0)) {
        break forward_join_21;
    }
    forwardValue2606_16_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(this.c)))) ? 1 : 0);
    }
    if (!((life5_5 == null))) {
        forwardValue2606_20_0 = forwardValue2606_16_0;
        break forward_join_20;
    }
    if (!((forwardValue2606_16_0 != 0))) {
        break forward_join_21;
    }
    forwardValue2606_20_0 = 1;
    }
    forwardValue2606_22_0 = forwardValue2606_20_0;
    break forward_join_22;
    }
    forwardValue2606_22_0 = 0;
    }
    return ((forwardValue2606_22_0) != 0);
}


public org.lwjgl.util.vector.Vector4f a__Vector4f() {
java.lang.String lexicalValue939_16_0;
    int lexicalValue939_50_0;
    java.lang.String spill939_0;
    int spill939_1;
    long life1_3;
    int[] life3_5;
    java.lang.String life4_21;
    java.lang.String life4_29;
    java.lang.String life4_37;
    java.lang.String[] life5_45;
    float[] life6_61;
    int life7_63;
    java.lang.String life8_71;
    java.lang.String life8_84;
    float life9_88;
    lexical_join_94: {
    lexical_join_50: {
    lexical_join_49: {
    lexical_join_16: {
    lexical_join_13: {
    life1_3 = (moom.M3.e ^ 76639127845687L);
    life3_5 = moom.M7.b__ArrayInt();
    spill939_0 = this.c;
    if (!((life3_5 == null))) {
        lexicalValue939_16_0 = spill939_0;
        break lexical_join_16;
    }
    if (!((spill939_0 == null))) {
        break lexical_join_13;
    }
    return null;
    }
    lexicalValue939_16_0 = ((java.lang.String)(this.c)).trim();
    }
    life4_21 = lexicalValue939_16_0;
    life4_29 = moom.Ob.b(((java.lang.String)(life4_21)), ((java.lang.String)(__sourceIntrinsic_d7ee523b2e02_invokedynamic939_5(12194, (6137713678849701771L ^ life1_3)))));
    life4_37 = moom.Ob.f(((java.lang.String)(life4_29)), ((java.lang.String)(__sourceIntrinsic_d7ee523b2e02_invokedynamic939_7(19707, (4884312043280078045L ^ life1_3)))));
    life5_45 = moom.BU.a__ArrayString(((java.lang.String)(life4_37)), ((java.lang.String)(__sourceIntrinsic_d7ee523b2e02_invokedynamic939_9(18353, (4705469455268683679L ^ life1_3)))));
    spill939_1 = (life5_45).length;
    if (!((life3_5 == null))) {
        lexicalValue939_50_0 = spill939_1;
        break lexical_join_50;
    }
    if (!((spill939_1 != 4))) {
        break lexical_join_49;
    }
    return null;
    }
    lexicalValue939_50_0 = 4;
    }
    life6_61 = new float[lexicalValue939_50_0];
    life7_63 = 0;
    lexical_cycle_54: while (true) {
    lexical_join_92: {
    lexical_join_87: {
    if (!((life7_63 < (life5_45).length))) {
        break lexical_join_94;
    }
    life8_71 = (life5_45)[life7_63];
    life8_84 = moom.Ob.a(((java.lang.String)(life8_71)), ((java.lang.String[])(new java.lang.String[] {"F", "f"})));
    life9_88 = moom.BU.a(((java.lang.String)(life8_84)), ((float)(0x1.fffffep127f)));
    if (!((life3_5 == null))) {
        break lexical_join_92;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(life9_88)), ((float)(0x1.fffffep127f))) == 0))) {
        break lexical_join_87;
    }
    return null;
    }
    (life6_61)[life7_63] = life9_88;
    life7_63 += 1;
    }
    if (!((life3_5 != null))) { continue lexical_cycle_54; }
    break lexical_cycle_54;
    }
    }
    return new org.lwjgl.util.vector.Vector4f((life6_61)[0], (life6_61)[1], (life6_61)[2], (life6_61)[3]);
}


public float a() { return __sourceHandlerCall_eddda526aa41c1f0e96a(this); }


public boolean a(java.lang.String p0, java.lang.String p1, java.lang.String p2, boolean p3) {
int forwardValue2608_16_0;
    int forwardValue2608_21_0;
    int forwardValue2608_23_0;
    boolean spill2608_0;
    long life5_3;
    int[] life7_5;
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    forward_join_16: {
    life5_3 = (moom.M3.e ^ 8509577391835L);
    life7_5 = moom.M7.b__ArrayInt();
    spill2608_0 = ((moom.M3)(this)).a(((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String)(p2)));
    if (!((life7_5 == null))) {
        forwardValue2608_16_0 = ((spill2608_0) ? 1 : 0);
        break forward_join_16;
    }
    if (!(spill2608_0)) {
        break forward_join_22;
    }
    forwardValue2608_16_0 = ((((moom.M3)(this)).i()) ? 1 : 0);
    }
    if (!((life7_5 == null))) {
        forwardValue2608_21_0 = forwardValue2608_16_0;
        break forward_join_21;
    }
    if (!((forwardValue2608_16_0 == ((p3) ? 1 : 0)))) {
        break forward_join_22;
    }
    forwardValue2608_21_0 = 1;
    }
    forwardValue2608_23_0 = forwardValue2608_21_0;
    break forward_join_23;
    }
    forwardValue2608_23_0 = 0;
    }
    return ((forwardValue2608_23_0) != 0);
}


public boolean g() {
int forwardValue2626_17_0;
    int forwardValue2626_19_0;
    int spill2626_0;
    long life1_3;
    int[] life3_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    life1_3 = (moom.M3.e ^ 52032302514373L);
    life3_5 = moom.M7.b__ArrayInt();
    spill2626_0 = this.a;
    if (!((life3_5 == null))) {
        forwardValue2626_17_0 = spill2626_0;
        break forward_join_17;
    }
    if (!((spill2626_0 == __sourceIntrinsic_8eb2c44f5202_invokedynamic2626_3(13747, (2342781878041025368L ^ life1_3))))) {
        break forward_join_18;
    }
    forwardValue2626_17_0 = 1;
    }
    forwardValue2626_19_0 = forwardValue2626_17_0;
    break forward_join_19;
    }
    forwardValue2626_19_0 = 0;
    }
    return ((forwardValue2626_19_0) != 0);
}


public boolean g(java.lang.String p0) {
int forwardValue2627_15_0;
    int forwardValue2627_19_0;
    int forwardValue2627_21_0;
    boolean spill2627_0;
    long life2_3;
    int[] life4_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    forward_join_15: {
    life2_3 = (moom.M3.e ^ 27186742888476L);
    life4_5 = moom.M7.b__ArrayInt();
    spill2627_0 = ((moom.M3)(this)).f();
    if (!((life4_5 == null))) {
        forwardValue2627_15_0 = ((spill2627_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!(spill2627_0)) {
        break forward_join_20;
    }
    forwardValue2627_15_0 = ((((java.lang.String)(p0)).equals(((java.lang.Object)(this.b)))) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue2627_19_0 = forwardValue2627_15_0;
        break forward_join_19;
    }
    if (!((forwardValue2627_15_0 != 0))) {
        break forward_join_20;
    }
    forwardValue2627_19_0 = 1;
    }
    forwardValue2627_21_0 = forwardValue2627_19_0;
    break forward_join_21;
    }
    forwardValue2627_21_0 = 0;
    }
    return ((forwardValue2627_21_0) != 0);
}


public boolean j(java.lang.String p0) {
int forwardValue2632_15_0;
    int forwardValue2632_19_0;
    int forwardValue2632_21_0;
    boolean spill2632_0;
    long life2_3;
    int[] life4_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    forward_join_15: {
    life2_3 = (moom.M3.e ^ 110616335131208L);
    life4_5 = moom.M7.b__ArrayInt();
    spill2632_0 = ((moom.M3)(this)).h();
    if (!((life4_5 == null))) {
        forwardValue2632_15_0 = ((spill2632_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!(spill2632_0)) {
        break forward_join_20;
    }
    forwardValue2632_15_0 = ((((java.lang.String)(this.b)).endsWith(((java.lang.String)(p0)))) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue2632_19_0 = forwardValue2632_15_0;
        break forward_join_19;
    }
    if (!((forwardValue2632_15_0 != 0))) {
        break forward_join_20;
    }
    forwardValue2632_19_0 = 1;
    }
    forwardValue2632_21_0 = forwardValue2632_19_0;
    break forward_join_21;
    }
    forwardValue2632_21_0 = 0;
    }
    return ((forwardValue2632_21_0) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6023_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d7ee523b2e02_invokedynamic939_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d7ee523b2e02_invokedynamic939_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d7ee523b2e02_invokedynamic939_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral6005_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d787a616d33a_invokedynamic2618_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8eb2c44f5202_invokedynamic2626_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4d53036195fc_invokedynamic2628_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_42b3a0d41be4_invokedynamic348_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_42b3a0d41be4_invokedynamic348_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_42b3a0d41be4_invokedynamic348_12(int a0, long a1) throws E;
}
