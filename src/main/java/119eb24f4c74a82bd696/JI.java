package moom;


public class JI {

private static boolean a;

private static long b;

private static int c;

private static int d;

private static boolean e;

private static boolean f;

private static final long g;

private static final java.lang.String[] h;

private static final java.lang.String[] i;

private static final java.util.Map j;

private static final long k;

private static final long[] l;

private static final java.lang.Long[] m;

private static final java.util.Map n;

public JI() {
super();
}


static {
g = ((long)(((moom._a)(moom._c.a(((long)(7473112905983683776L)), ((long)(4223227910677509561L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(72147662419174L)))));
    long local25_life6 = (moom.JI.g ^ 36405706771555L);
    j = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local16_life9;
    javax.crypto.Cipher __sourceSpill595_11 = (local16_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill595_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill595_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill595_14 = new byte[8];
    (__sourceSpill595_14)[0] = ((byte) ((int) (local25_life6 >>> 56)));
    int local17_life15 = 1;
    while ((local17_life15 < 8)) {
        (__sourceSpill595_14)[local17_life15] = ((byte) ((int) ((local25_life6 << (local17_life15 * 8)) >>> 56)));
        local17_life15 += 1;
    }
    byte[] __sourcePreallocation595_16 = __sourceSpill595_14;
    ((javax.crypto.Cipher)(__sourceSpill595_11)).init(((int)(__sourceSpill595_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill595_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation595_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local23_life19 = new java.lang.String[2];
    int local21_life20 = 0;
    java.lang.String local20_life21;
    int local22_life23 = ((java.lang.String)((local20_life21 = "BvjWî½ÇçÎ?Ðö_ÆÜ^\tl»Xåä½sT?áx\035 \003í×lÚB\021 Î|¦ZÖ¿bDëÅ\0342M64úQ\013T"))).length();
    int local19_life24 = 32;
    int local18_life25 = -1;
    while (true) {
        local18_life25 += 1;
        byte[] __sourceSpill595_28 = ((java.lang.String)(((java.lang.String)(local20_life21)).substring(((int)(local18_life25)), ((int)((local18_life25 + local19_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill595_29 = local16_life9;
        byte[] local24_life31 = ((javax.crypto.Cipher)(__sourceSpill595_29)).doFinal(((byte[])(__sourceSpill595_28)));
        java.lang.String __sourceSpill595_34 = ((java.lang.String)(moom.JI.a(((byte[])(local24_life31))))).intern();
        java.lang.String[] __sourceSpill595_35 = local23_life19;
        int __sourceSpill595_36 = local21_life20;
        local21_life20 += 1;
        (__sourceSpill595_35)[__sourceSpill595_36] = __sourceSpill595_34;
        if (!(((local18_life25 = (local18_life25 + local19_life24)) < local22_life23))) { break; }
        local19_life24 = ((java.lang.String)(local20_life21)).charAt(((int)(local18_life25)));
    }
    h = ((java.lang.String[])(local23_life19));
    i = ((java.lang.String[])(new java.lang.String[2]));
    javax.crypto.Cipher local11_life41;
    javax.crypto.Cipher __sourceSpill595_43 = (local11_life41 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill595_44 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill595_45 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill595_46 = new byte[8];
    (__sourceSpill595_46)[0] = ((byte) ((int) (local25_life6 >>> 56)));
    int local12_life47 = 1;
    while ((local12_life47 < 8)) {
        (__sourceSpill595_46)[local12_life47] = ((byte) ((int) ((local25_life6 << (local12_life47 * 8)) >>> 56)));
        local12_life47 += 1;
    }
    byte[] __sourcePreallocation595_48 = __sourceSpill595_46;
    ((javax.crypto.Cipher)(__sourceSpill595_43)).init(((int)(__sourceSpill595_44)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill595_45)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation595_48)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local13_life51 = -4781396232285788532L;
    byte[] __sourceSpill595_52 = new byte[8];
    (__sourceSpill595_52)[0] = ((byte) ((int) (local13_life51 >>> 56)));
    (__sourceSpill595_52)[1] = ((byte) ((int) (local13_life51 >>> 48)));
    (__sourceSpill595_52)[2] = ((byte) ((int) (local13_life51 >>> 40)));
    (__sourceSpill595_52)[3] = ((byte) ((int) (local13_life51 >>> 32)));
    (__sourceSpill595_52)[4] = ((byte) ((int) (local13_life51 >>> 24)));
    (__sourceSpill595_52)[5] = ((byte) ((int) (local13_life51 >>> 16)));
    (__sourceSpill595_52)[6] = ((byte) ((int) (local13_life51 >>> 8)));
    (__sourceSpill595_52)[7] = ((byte) ((int) local13_life51));
    javax.crypto.Cipher __sourceSpill595_53 = local11_life41;
    byte[] local15_life55 = ((javax.crypto.Cipher)(__sourceSpill595_53)).doFinal(((byte[])(__sourceSpill595_52)));
    k = ((long)((((((((((((long) (local15_life55)[0]) & 255L) << 56) | ((((long) (local15_life55)[1]) & 255L) << 48)) | ((((long) (local15_life55)[2]) & 255L) << 40)) | ((((long) (local15_life55)[3]) & 255L) << 32)) | ((((long) (local15_life55)[4]) & 255L) << 24)) | ((((long) (local15_life55)[5]) & 255L) << 16)) | ((((long) (local15_life55)[6]) & 255L) << 8)) | (((long) (local15_life55)[7]) & 255L))));
    n = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life59;
    javax.crypto.Cipher __sourceSpill595_61 = (local0_life59 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill595_62 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill595_63 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill595_64 = new byte[8];
    (__sourceSpill595_64)[0] = ((byte) ((int) (local25_life6 >>> 56)));
    int local1_life65 = 1;
    while ((local1_life65 < 8)) {
        (__sourceSpill595_64)[local1_life65] = ((byte) ((int) ((local25_life6 << (local1_life65 * 8)) >>> 56)));
        local1_life65 += 1;
    }
    byte[] __sourcePreallocation595_66 = __sourceSpill595_64;
    ((javax.crypto.Cipher)(__sourceSpill595_61)).init(((int)(__sourceSpill595_62)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill595_63)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation595_66)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life69 = new long[2];
    int local3_life70 = 0;
    java.lang.String local4_life71;
    int local5_life73 = ((java.lang.String)((local4_life71 = "~+ª\000jQz\037Äß0\026\r+\""))).length();
    int local2_life74 = 0;
    do {
        java.lang.String __sourceSpill595_75 = local4_life71;
        int __sourceSpill595_76 = local2_life74;
        local2_life74 += 8;
        byte[] local7_life79 = ((java.lang.String)(((java.lang.String)(__sourceSpill595_75)).substring(((int)(__sourceSpill595_76)), ((int)(local2_life74))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill595_80 = local6_life69;
        int __sourceSpill595_81 = local3_life70;
        local3_life70 += 1;
        long local8_life82 = (((((((((((long) (local7_life79)[0]) & 255L) << 56) | ((((long) (local7_life79)[1]) & 255L) << 48)) | ((((long) (local7_life79)[2]) & 255L) << 40)) | ((((long) (local7_life79)[3]) & 255L) << 32)) | ((((long) (local7_life79)[4]) & 255L) << 24)) | ((((long) (local7_life79)[5]) & 255L) << 16)) | ((((long) (local7_life79)[6]) & 255L) << 8)) | (((long) (local7_life79)[7]) & 255L));
        byte[] __sourceSpill595_83 = new byte[8];
        (__sourceSpill595_83)[0] = ((byte) ((int) (local8_life82 >>> 56)));
        (__sourceSpill595_83)[1] = ((byte) ((int) (local8_life82 >>> 48)));
        (__sourceSpill595_83)[2] = ((byte) ((int) (local8_life82 >>> 40)));
        (__sourceSpill595_83)[3] = ((byte) ((int) (local8_life82 >>> 32)));
        (__sourceSpill595_83)[4] = ((byte) ((int) (local8_life82 >>> 24)));
        (__sourceSpill595_83)[5] = ((byte) ((int) (local8_life82 >>> 16)));
        (__sourceSpill595_83)[6] = ((byte) ((int) (local8_life82 >>> 8)));
        (__sourceSpill595_83)[7] = ((byte) ((int) local8_life82));
        javax.crypto.Cipher __sourceSpill595_84 = local0_life59;
        byte[] local10_life86 = ((javax.crypto.Cipher)(__sourceSpill595_84)).doFinal(((byte[])(__sourceSpill595_83)));
        (__sourceSpill595_80)[__sourceSpill595_81] = (((((((((((long) (local10_life86)[0]) & 255L) << 56) | ((((long) (local10_life86)[1]) & 255L) << 48)) | ((((long) (local10_life86)[2]) & 255L) << 40)) | ((((long) (local10_life86)[3]) & 255L) << 32)) | ((((long) (local10_life86)[4]) & 255L) << 24)) | ((((long) (local10_life86)[5]) & 255L) << 16)) | ((((long) (local10_life86)[6]) & 255L) << 8)) | (((long) (local10_life86)[7]) & 255L));
    } while ((!(local2_life74 >= local5_life73)));
    l = ((long[])(local6_life69));
    m = ((java.lang.Long[])(new java.lang.Long[2]));
    a = ((boolean)(false));
    b = ((long)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite595_90(28553, (1714610394391295259L ^ local25_life6))));
    c = ((int)(0));
    d = ((int)(0));
    e = ((boolean)(false));
    f = ((boolean)(false));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5113_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/JI"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static long b(int p0, long p1) {
int life3_8;
    byte[] life4_77;
    long life5_81;
    byte[] life7_146;
    java.lang.Long life8_150;
    java.lang.Object[] life9_155;
    javax.crypto.spec.DESKeySpec life11_188;
    javax.crypto.SecretKey life12_195;
    javax.crypto.Cipher life13_200;
    byte[] life10_212;
    long life11_290;
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 24144);
    if (((moom.JI.m)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (moom.JI.l)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(moom.JI.n)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.JI.n)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/JI", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (moom.JI.m)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((moom.JI.m)[life3_8])).longValue();
}


private static long b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = moom.JI.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5115_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/JI"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static boolean a(int p0) {
int forwardValue2290_17_0;
    int forwardValue2290_25_0;
    int forwardValue2290_33_0;
    int forwardValue2290_37_0;
    int forwardValue2290_39_0;
    boolean spill2290_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_39: {
    forward_join_38: {
    forward_join_37: {
    forward_join_33: {
    forward_join_32: {
    forward_join_25: {
    forward_join_24: {
    forward_join_17: {
    forward_join_12: {
    life1_3 = (moom.JI.g ^ 42057644598202L);
    life3_5 = moom.JM.b__Arrayr3();
    spill2290_0 = moom.JI.a;
    if (!((life3_5 != null))) {
        forwardValue2290_17_0 = ((spill2290_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!((!spill2290_0))) {
        break forward_join_12;
    }
    return ((1) != 0);
    }
    moom.JI.c = ((int)((moom.JI.c + 1)));
    forwardValue2290_17_0 = ((moom.JI.f) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue2290_25_0 = forwardValue2290_17_0;
        break forward_join_25;
    }
    if (!((forwardValue2290_17_0 != 0))) {
        break forward_join_24;
    }
    moom.JI.f = ((boolean)(false));
    return ((1) != 0);
    }
    forwardValue2290_25_0 = ((moom.JI.e) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue2290_33_0 = forwardValue2290_25_0;
        break forward_join_33;
    }
    if (!((forwardValue2290_25_0 != 0))) {
        break forward_join_32;
    }
    moom.JI.d = ((int)((moom.JI.d + 1)));
    }
    forwardValue2290_33_0 = ((moom.JI.e) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue2290_37_0 = forwardValue2290_33_0;
        break forward_join_37;
    }
    if (!((forwardValue2290_33_0 == 0))) {
        break forward_join_38;
    }
    forwardValue2290_37_0 = 1;
    }
    forwardValue2290_39_0 = forwardValue2290_37_0;
    break forward_join_39;
    }
    forwardValue2290_39_0 = 0;
    }
    return ((forwardValue2290_39_0) != 0);
}


public static void a() {
int forwardValue2289_25_0;
    int forwardValue2289_29_0;
    int forwardValue2289_47_0;
    int forwardValue2289_53_0;
    int forwardValue2289_55_0;
    net.minecraft.entity.Entity[] spill2289_0;
    int spill2289_1;
    long life0_3;
    net.minecraft.entity.Entity[] life2_7;
    forward_join_64: {
    forward_join_55: {
    forward_join_54: {
    forward_join_53: {
    forward_join_47: {
    forward_join_46: {
    forward_join_29: {
    forward_join_25: {
    forward_join_16: {
    life0_3 = (moom.JI.g ^ 32272949947181L);
    spill2289_0 = moom.JM.b__Arrayr3();
    moom.JI.a = ((boolean)(true));
    life2_7 = spill2289_0;
    spill2289_1 = recovery.source.CarrierOps.lcmp(((long)(moom.JI.b)), ((long)(0L)));
    if (!((life2_7 != null))) {
        forwardValue2289_25_0 = spill2289_1;
        break forward_join_25;
    }
    if (!((spill2289_1 < 0))) {
        break forward_join_16;
    }
    moom.JI.b = ((long)(java.lang.System.currentTimeMillis()));
    }
    forwardValue2289_25_0 = recovery.source.CarrierOps.lcmp(((long)(java.lang.System.currentTimeMillis())), ((long)((moom.JI.b + __sourceIntrinsic_2c8ae721fed4_invokedynamic2289_9(22278, (1638277566734428891L ^ life0_3))))));
    }
    if (!((life2_7 != null))) {
        forwardValue2289_29_0 = forwardValue2289_25_0;
        break forward_join_29;
    }
    if (!((forwardValue2289_25_0 > 0))) {
        break forward_join_64;
    }
    forwardValue2289_29_0 = moom.JI.d;
    }
    if (!((life2_7 != null))) {
        forwardValue2289_47_0 = forwardValue2289_29_0;
        break forward_join_47;
    }
    if (!((forwardValue2289_29_0 > 0))) {
        break forward_join_46;
    }
    int __stackOp2289_14_0 = moom.JI.c;
    java.lang.String __stackOp2289_14_1 = __sourceIntrinsic_2c8ae721fed4_invokedynamic2289_13(30951, (4184649278973456742L ^ life0_3));
    moom.BU.d(((java.lang.String)(__sourceIntrinsic_2c8ae721fed4_invokedynamic2289_16(__stackOp2289_14_1, __stackOp2289_14_0, __sourceIntrinsic_2c8ae721fed4_invokedynamic2289_15(16035, (6407665405548263203L ^ life0_3))))));
    }
    forwardValue2289_47_0 = moom.JI.c;
    }
    if (!((life2_7 != null))) {
        forwardValue2289_53_0 = forwardValue2289_47_0;
        break forward_join_53;
    }
    if (!((forwardValue2289_47_0 > ((int) moom.JI.k)))) {
        break forward_join_54;
    }
    forwardValue2289_53_0 = 1;
    }
    forwardValue2289_55_0 = forwardValue2289_53_0;
    break forward_join_55;
    }
    forwardValue2289_55_0 = 0;
    }
    moom.JI.e = ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue2289_55_0)));
    moom.JI.b = ((long)(java.lang.System.currentTimeMillis()));
    moom.JI.c = ((int)(0));
    moom.JI.d = ((int)(0));
    moom.JI.f = ((boolean)(true));
    }
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 10764);
    if (((moom.JI.i)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.JI.j)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.JI.j)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/JI", life9_51);
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
        life9_116 = ((java.lang.String)((moom.JI.h)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.JI.i)[life5_8] = moom.JI.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.JI.i)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.JI.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
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
        byte[] spill2652_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2652_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2652_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2652_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2652_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2652_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static native <E extends Throwable> long __sourceIntrinsic_eb8803ad1f63_originalDynamicSite595_90(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5113_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5115_0() throws E;

private static native <E extends Throwable> long __sourceIntrinsic_2c8ae721fed4_invokedynamic2289_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2c8ae721fed4_invokedynamic2289_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2c8ae721fed4_invokedynamic2289_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2c8ae721fed4_invokedynamic2289_16(java.lang.String a0, int a1, java.lang.String a2) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
