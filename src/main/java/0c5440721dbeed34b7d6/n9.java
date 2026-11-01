package com.moon;


public class n9 {

private static org.tinylog.TaggedLogger a;

private java.util.concurrent.ScheduledExecutorService b;

private com.moon.n_ c;

private boolean d;

private boolean e;

private long f;

private static long g;

private static java.lang.String[] h;

private static java.lang.String[] i;

private static java.util.Map j;

private static long[] k;

private static java.lang.Long[] l;

private static java.util.Map m;

private n9(com.moon.n_ p0) {
super();
    this.b = java.util.concurrent.Executors.newScheduledThreadPool(4);
    this.c = p0;
}


static {
g = ((long)(((moom._a)(moom._c.a(((long)(-5144910985569630583L)), ((long)(1946521694086424077L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(48557282523125L)))));
    long local20_life6 = (com.moon.n9.g ^ 80121751775749L);
    j = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local11_life9;
    javax.crypto.Cipher __sourceSpill303_11 = (local11_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill303_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill303_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill303_14 = new byte[8];
    (__sourceSpill303_14)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local12_life15 = 1;
    while ((local12_life15 < 8)) {
        (__sourceSpill303_14)[local12_life15] = ((byte) ((int) ((local20_life6 << (local12_life15 * 8)) >>> 56)));
        local12_life15 += 1;
    }
    byte[] __sourcePreallocation303_16 = __sourceSpill303_14;
    ((javax.crypto.Cipher)(__sourceSpill303_11)).init(((int)(__sourceSpill303_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill303_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation303_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local18_life19 = new java.lang.String[10];
    int local16_life20 = 0;
    java.lang.String local15_life21;
    int local17_life23 = ((java.lang.String)((local15_life21 = "8%G¥úH\034ÖeÓ­Ä'ÔËÙ\005Ïê¥ý¤¸D ¶\016\fV71³\034Ò.#²ÏùdN\006ýl>Å°çÔÏ(6õÊ¡(÷{\005á!á#\004I¿×øçÚåÌ·©³r~ÎÑG\016\b\025¿\020uè\024Î5NY8ÊX0¹\036\020Q|fa5â\0317m=bA®Úµ ³~ieip5õ'4³±¥F\001éæ{óºäFè+÷Cÿ\020Hìs#qZXñÑ\026¨ë9ÄÔT(É\026êÏAL\031¥Q\rìÍó\004lì¦ôáQÉ?ÅÂZ»}7ìO\037mz\tè\020Ù8á¾v¼ÙpLJ¾d\035/bç.ÿÌ¹Ãr/43\017E=JcNlÇÁÛÚz¸VZ¹~\005-\006x\037\r\037´n"))).length();
    int local14_life24 = 56;
    int local13_life25 = -1;
    while (true) {
        local13_life25 += 1;
        byte[] __sourceSpill303_28 = ((java.lang.String)(((java.lang.String)(local15_life21)).substring(((int)(local13_life25)), ((int)((local13_life25 + local14_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill303_29 = local11_life9;
        byte[] local19_life31 = ((javax.crypto.Cipher)(__sourceSpill303_29)).doFinal(((byte[])(__sourceSpill303_28)));
        java.lang.String __sourceSpill303_34 = ((java.lang.String)(com.moon.n9.a(((byte[])(local19_life31))))).intern();
        java.lang.String[] __sourceSpill303_35 = local18_life19;
        int __sourceSpill303_36 = local16_life20;
        local16_life20 += 1;
        (__sourceSpill303_35)[__sourceSpill303_36] = __sourceSpill303_34;
        if (!(((local13_life25 = (local13_life25 + local14_life24)) < local17_life23))) { break; }
        local14_life24 = ((java.lang.String)(local15_life21)).charAt(((int)(local13_life25)));
    }
    local17_life23 = ((java.lang.String)((local15_life21 = "\035WyI\032\r\013:¨)\tÝÁÉ¶\030Ù\\r»õ)0Û/AL\000§½\004A9ôü²ëXû|\0008K-}ï\nL-bLø\001oÂZ((=Õ\007÷\000\007ûD\000çØ{w:Å¥ç²·n{V\024\034â6QRfV%%y"))).length();
    local14_life24 = 48;
    local13_life25 = -1;
    while (true) {
        local13_life25 += 1;
        byte[] __sourceSpill303_41 = ((java.lang.String)(((java.lang.String)(local15_life21)).substring(((int)(local13_life25)), ((int)((local13_life25 + local14_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill303_42 = local11_life9;
        byte[] local19_life44 = ((javax.crypto.Cipher)(__sourceSpill303_42)).doFinal(((byte[])(__sourceSpill303_41)));
        java.lang.String __sourceSpill303_47 = ((java.lang.String)(com.moon.n9.a(((byte[])(local19_life44))))).intern();
        java.lang.String[] __sourceSpill303_48 = local18_life19;
        int __sourceSpill303_49 = local16_life20;
        local16_life20 += 1;
        (__sourceSpill303_48)[__sourceSpill303_49] = __sourceSpill303_47;
        if (!(((local13_life25 = (local13_life25 + local14_life24)) < local17_life23))) { break; }
        local14_life24 = ((java.lang.String)(local15_life21)).charAt(((int)(local13_life25)));
    }
    h = ((java.lang.String[])(local18_life19));
    i = ((java.lang.String[])(new java.lang.String[10]));
    m = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill303_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill303_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill303_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill303_60 = new byte[8];
    (__sourceSpill303_60)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill303_60)[local1_life61] = ((byte) ((int) ((local20_life6 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation303_62 = __sourceSpill303_60;
    ((javax.crypto.Cipher)(__sourceSpill303_57)).init(((int)(__sourceSpill303_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill303_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation303_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[2];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "ì,Ü\026¤Qv·Þ¯ÇÃí3%\032"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill303_71 = local4_life67;
        int __sourceSpill303_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill303_71)).substring(((int)(__sourceSpill303_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill303_76 = local6_life65;
        int __sourceSpill303_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill303_79 = new byte[8];
        (__sourceSpill303_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill303_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill303_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill303_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill303_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill303_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill303_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill303_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill303_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill303_80)).doFinal(((byte[])(__sourceSpill303_79)));
        (__sourceSpill303_76)[__sourceSpill303_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    k = ((long[])(local6_life65));
    l = ((java.lang.Long[])(new java.lang.Long[2]));
    a = ((org.tinylog.TaggedLogger)(org.tinylog.Logger.tag(((java.lang.String)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite303_85(16878, (6314683564062620749L ^ local20_life6)))))));
}

private static native <E extends Throwable> void __sourceHandlerCall_d20cc9fe53aee8d984db(com.moon.n9 a0) throws E;
private static final class __SourceHandler_d20cc9fe53aee8d984db {

public static void f517(com.moon.n9 receiver) throws Throwable {
    com.moon.n9 forwardValue517_65_0;
    com.moon.n9 spill517_0;
    long life1_3;
    int life3_5;
    net.arikia.dev.drpc.DiscordEventHandlers life4_35;
    forward_join_67: {
    forward_join_65: {
    forward_join_61: {
    forward_join_18: {
    life1_3 = (__fieldRead517_0() ^ 1418939444574L);
    life3_5 = __call517_1();
    if (!((life3_5 != 0))) {
        break forward_join_18;
    }
    if (!((!__fieldRead517_2(receiver)))) {
        break forward_join_67;
    }
    __call517_5(__fieldRead517_3(), __invokedynamic517_4(12708, (471357650778934105L ^ life1_3)));
    }
    life4_35 = __call517_12(__call517_11(__call517_9(__call517_7(new net.arikia.dev.drpc.DiscordEventHandlers.Builder(), __invokedynamic517_6(receiver)), __invokedynamic517_8()), __invokedynamic517_10()));
    spill517_0 = receiver;
    if (!((life3_5 != 0))) {
        forwardValue517_65_0 = spill517_0;
        break forward_join_65;
    }
    if (!((!__fieldRead517_13(spill517_0)))) {
        break forward_join_61;
    }
    __call517_17(__call517_16(__call517_15(__fieldRead517_14(receiver))), life4_35, 1);
    __call517_23(__fieldRead517_18(receiver), __invokedynamic517_19(), __invokedynamic517_20(13677, (6935062559700336144L ^ life1_3)), __invokedynamic517_21(7180, (8756457293997512560L ^ life1_3)), __fieldRead517_22());
    __fieldWrite517_24(receiver, 1);
    }
    __fieldWrite517_25(receiver, 1);
    forwardValue517_65_0 = receiver;
    }
    __fieldWrite517_27(forwardValue517_65_0, __call517_26());
    }
    return;
}
public static void h517_0(moom.Oo p0) throws Throwable {
    throw __call1051700_0(p0);
}
public static void h517_1(moom.Oo p0) throws Throwable {
    throw __call1051701_0(p0);
}
public static void h517_2(moom.Oo p0) throws Throwable {
    throw __call1051702_0(p0);
}
public static void h517_3(moom.Oo p0) throws Throwable {
    throw __call1051703_0(p0);
}
private static native long __fieldRead517_0() throws Throwable;
private static native int __call517_1() throws Throwable;
private static native boolean __fieldRead517_2(com.moon.n9 a0) throws Throwable;
private static native org.tinylog.TaggedLogger __fieldRead517_3() throws Throwable;
private static native java.lang.String __invokedynamic517_4(int a0, long a1) throws Throwable;
private static native void __call517_5(org.tinylog.TaggedLogger a0, java.lang.String a1) throws Throwable;
private static native net.arikia.dev.drpc.callbacks.ReadyCallback __invokedynamic517_6(com.moon.n9 a0) throws Throwable;
private static native net.arikia.dev.drpc.DiscordEventHandlers.Builder __call517_7(net.arikia.dev.drpc.DiscordEventHandlers.Builder a0, net.arikia.dev.drpc.callbacks.ReadyCallback a1) throws Throwable;
private static native net.arikia.dev.drpc.callbacks.DisconnectedCallback __invokedynamic517_8() throws Throwable;
private static native net.arikia.dev.drpc.DiscordEventHandlers.Builder __call517_9(net.arikia.dev.drpc.DiscordEventHandlers.Builder a0, net.arikia.dev.drpc.callbacks.DisconnectedCallback a1) throws Throwable;
private static native net.arikia.dev.drpc.callbacks.ErroredCallback __invokedynamic517_10() throws Throwable;
private static native net.arikia.dev.drpc.DiscordEventHandlers.Builder __call517_11(net.arikia.dev.drpc.DiscordEventHandlers.Builder a0, net.arikia.dev.drpc.callbacks.ErroredCallback a1) throws Throwable;
private static native net.arikia.dev.drpc.DiscordEventHandlers __call517_12(net.arikia.dev.drpc.DiscordEventHandlers.Builder a0) throws Throwable;
private static native boolean __fieldRead517_13(com.moon.n9 a0) throws Throwable;
private static native com.moon.n_ __fieldRead517_14(com.moon.n9 a0) throws Throwable;
private static native long __call517_15(com.moon.n_ a0) throws Throwable;
private static native java.lang.String __call517_16(long a0) throws Throwable;
private static native void __call517_17(java.lang.String a0, net.arikia.dev.drpc.DiscordEventHandlers a1, int a2) throws Throwable;
private static native java.util.concurrent.ScheduledExecutorService __fieldRead517_18(com.moon.n9 a0) throws Throwable;
private static native java.lang.Runnable __invokedynamic517_19() throws Throwable;
private static native long __invokedynamic517_20(int a0, long a1) throws Throwable;
private static native long __invokedynamic517_21(int a0, long a1) throws Throwable;
private static native java.util.concurrent.TimeUnit __fieldRead517_22() throws Throwable;
private static native java.util.concurrent.ScheduledFuture __call517_23(java.util.concurrent.ScheduledExecutorService a0, java.lang.Runnable a1, long a2, long a3, java.util.concurrent.TimeUnit a4) throws Throwable;
private static native void __fieldWrite517_24(com.moon.n9 a0, int a1) throws Throwable;
private static native void __fieldWrite517_25(com.moon.n9 a0, int a1) throws Throwable;
private static native long __call517_26() throws Throwable;
private static native void __fieldWrite517_27(com.moon.n9 a0, long a1) throws Throwable;
private static native java.lang.Exception __call1051700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1051701_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1051702_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1051703_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_20804f85a43f71c2ae29(com.moon.n9 a0) throws E;
private static final class __SourceHandler_20804f85a43f71c2ae29 {

public static void f136(com.moon.n9 receiver) throws Throwable {
    com.moon.n9 forestValue136_20_0;
    com.moon.ob forestValue136_57_0;
    com.moon.n9 spill136_0;
    com.moon.ob spill136_1;
    long life1_3;
    int life3_5;
    com.moon.ob life4_23;
    com.moon.ob life5_27;
    net.arikia.dev.drpc.DiscordRichPresence.Builder life6_43;
    forest_join_67: {
    forest_join_57: {
    forest_join_56: {
    forest_join_20: {
    forest_join_12: {
    life1_3 = (__fieldRead136_0() ^ 41425086858308L);
    life3_5 = __call136_1();
    spill136_0 = receiver;
    if (!((life3_5 == 0))) {
        forestValue136_20_0 = spill136_0;
        break forest_join_20;
    }
    if (!((!__fieldRead136_2(spill136_0)))) {
        break forest_join_12;
    }
    return;
    }
    __call136_5(__fieldRead136_3(), __invokedynamic136_4(23219, (8880947007608506707L ^ life1_3)));
    forestValue136_20_0 = receiver;
    }
    life4_23 = __call136_7(__fieldRead136_6(forestValue136_20_0));
    life5_27 = __call136_9(__fieldRead136_8(receiver));
    life6_43 = __call136_18(__call136_16(new net.arikia.dev.drpc.DiscordRichPresence.Builder(__call136_12(__call136_11(__fieldRead136_10(receiver)))), __call136_15(__call136_14(__fieldRead136_13(receiver)))), __fieldRead136_17(receiver));
    spill136_1 = life4_23;
    if (!((life3_5 == 0))) {
        forestValue136_57_0 = spill136_1;
        break forest_join_57;
    }
    if (!((spill136_1 != null))) {
        break forest_join_56;
    }
    life6_43 = __call136_23(life6_43, __call136_19(life4_23), __cast136_22(__call136_21(__call136_20(life4_23))));
    }
    forestValue136_57_0 = life5_27;
    }
    if (!((forestValue136_57_0 != null))) {
        break forest_join_67;
    }
    life6_43 = __call136_28(life6_43, __call136_24(life5_27), __cast136_27(__call136_26(__call136_25(life5_27))));
    }
    __call136_30(__call136_29(life6_43));
    return;
}
public static void h136_0(java.lang.Exception p0) throws Throwable {
    throw __call3013600_0(p0);
}
public static void h136_1(java.lang.Exception p0) throws Throwable {
    throw __call3013601_0(p0);
}
public static void h136_2(java.lang.Exception p0) throws Throwable {
    throw __call3013602_0(p0);
}
public static void h136_3(java.lang.Exception p0, com.moon.ob p1) throws Throwable {
    java.lang.Exception life1_2;
    life1_2 = p0;
    __call3013603_1(__fieldRead3013603_0(), life1_2);
    return;
}
private static native long __fieldRead136_0() throws Throwable;
private static native int __call136_1() throws Throwable;
private static native boolean __fieldRead136_2(com.moon.n9 a0) throws Throwable;
private static native org.tinylog.TaggedLogger __fieldRead136_3() throws Throwable;
private static native java.lang.String __invokedynamic136_4(int a0, long a1) throws Throwable;
private static native void __call136_5(org.tinylog.TaggedLogger a0, java.lang.String a1) throws Throwable;
private static native com.moon.n_ __fieldRead136_6(com.moon.n9 a0) throws Throwable;
private static native com.moon.ob __call136_7(com.moon.n_ a0) throws Throwable;
private static native com.moon.n_ __fieldRead136_8(com.moon.n9 a0) throws Throwable;
private static native com.moon.ob __call136_9(com.moon.n_ a0) throws Throwable;
private static native com.moon.n_ __fieldRead136_10(com.moon.n9 a0) throws Throwable;
private static native com.moon.oc __call136_11(com.moon.n_ a0) throws Throwable;
private static native java.lang.String __call136_12(com.moon.oc a0) throws Throwable;
private static native com.moon.n_ __fieldRead136_13(com.moon.n9 a0) throws Throwable;
private static native com.moon.oc __call136_14(com.moon.n_ a0) throws Throwable;
private static native java.lang.String __call136_15(com.moon.oc a0) throws Throwable;
private static native net.arikia.dev.drpc.DiscordRichPresence.Builder __call136_16(net.arikia.dev.drpc.DiscordRichPresence.Builder a0, java.lang.String a1) throws Throwable;
private static native long __fieldRead136_17(com.moon.n9 a0) throws Throwable;
private static native net.arikia.dev.drpc.DiscordRichPresence.Builder __call136_18(net.arikia.dev.drpc.DiscordRichPresence.Builder a0, long a1) throws Throwable;
private static native java.lang.String __call136_19(com.moon.ob a0) throws Throwable;
private static native java.util.function.Supplier __call136_20(com.moon.ob a0) throws Throwable;
private static native java.lang.Object __call136_21(java.util.function.Supplier a0) throws Throwable;
private static native java.lang.String __cast136_22(java.lang.Object a0) throws Throwable;
private static native net.arikia.dev.drpc.DiscordRichPresence.Builder __call136_23(net.arikia.dev.drpc.DiscordRichPresence.Builder a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __call136_24(com.moon.ob a0) throws Throwable;
private static native java.util.function.Supplier __call136_25(com.moon.ob a0) throws Throwable;
private static native java.lang.Object __call136_26(java.util.function.Supplier a0) throws Throwable;
private static native java.lang.String __cast136_27(java.lang.Object a0) throws Throwable;
private static native net.arikia.dev.drpc.DiscordRichPresence.Builder __call136_28(net.arikia.dev.drpc.DiscordRichPresence.Builder a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native net.arikia.dev.drpc.DiscordRichPresence __call136_29(net.arikia.dev.drpc.DiscordRichPresence.Builder a0) throws Throwable;
private static native void __call136_30(net.arikia.dev.drpc.DiscordRichPresence a0) throws Throwable;
private static native java.lang.Exception __call3013600_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3013601_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3013602_0(java.lang.Exception a0) throws Throwable;
private static native org.tinylog.TaggedLogger __fieldRead3013603_0() throws Throwable;
private static native void __call3013603_1(org.tinylog.TaggedLogger a0, java.lang.Exception a1) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_048ecd05ee44f87ebb92(com.moon.n9 a0) throws E;
private static final class __SourceHandler_048ecd05ee44f87ebb92 {

public static void f518(com.moon.n9 receiver) throws Throwable {
    com.moon.n9 forwardValue518_20_0;
    com.moon.n9 spill518_0;
    long life1_3;
    int life3_5;
    forward_join_22: {
    forward_join_20: {
    life1_3 = (__fieldRead518_0() ^ 104243067314492L);
    life3_5 = __call518_1();
    spill518_0 = receiver;
    if (!((life3_5 != 0))) {
        forwardValue518_20_0 = spill518_0;
        break forward_join_20;
    }
    if (!(__fieldRead518_2(spill518_0))) {
        break forward_join_22;
    }
    __call518_5(__fieldRead518_3(), __invokedynamic518_4(26966, (8666210781108166600L ^ life1_3)));
    __call518_6();
    forwardValue518_20_0 = receiver;
    }
    __fieldWrite518_7(forwardValue518_20_0, 0);
    }
    return;
}
public static void h518_0(moom.Oo p0) throws Throwable {
    throw __call1051800_0(p0);
}
public static void h518_1(moom.Oo p0) throws Throwable {
    throw __call1051801_0(p0);
}
private static native long __fieldRead518_0() throws Throwable;
private static native int __call518_1() throws Throwable;
private static native boolean __fieldRead518_2(com.moon.n9 a0) throws Throwable;
private static native org.tinylog.TaggedLogger __fieldRead518_3() throws Throwable;
private static native java.lang.String __invokedynamic518_4(int a0, long a1) throws Throwable;
private static native void __call518_5(org.tinylog.TaggedLogger a0, java.lang.String a1) throws Throwable;
private static native void __call518_6() throws Throwable;
private static native void __fieldWrite518_7(com.moon.n9 a0, int a1) throws Throwable;
private static native java.lang.Exception __call1051800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1051801_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_38155bfac4fd65fef034(com.moon.n9 a0, net.arikia.dev.drpc.DiscordUser a1) throws E;
private static final class __SourceHandler_38155bfac4fd65fef034 {

public static void f519(com.moon.n9 receiver, net.arikia.dev.drpc.DiscordUser p0) throws Throwable {
    com.moon.n9 forwardValue519_40_0;
    int spill519_0;
    org.tinylog.TaggedLogger spill519_1;
    java.lang.String spill519_2;
    java.lang.String spill519_3;
    com.moon.n9 spill519_4;
    long life2_3;
    java.lang.String life5_12;
    java.lang.String life6_13;
    java.lang.String life7_14;
    int life4_32;
    forward_join_54: {
    forward_join_40: {
    life2_3 = (__fieldRead519_0() ^ 27305016759042L);
    spill519_0 = __call519_1();
    spill519_1 = __fieldRead519_2();
    spill519_2 = __fieldRead519_3(p0);
    spill519_3 = __fieldRead519_4(p0);
    life5_12 = __fieldRead519_5(p0);
    life6_13 = spill519_3;
    life7_14 = spill519_2;
    __call519_9(spill519_1, __invokedynamic519_8(__invokedynamic519_6(29285, (5672318330516682444L ^ life2_3)), life7_14, "#", life6_13, __invokedynamic519_7(15602, (5826937907280934992L ^ life2_3)), life5_12, ")"));
    life4_32 = spill519_0;
    spill519_4 = receiver;
    if (!((life4_32 != 0))) {
        forwardValue519_40_0 = spill519_4;
        break forward_join_40;
    }
    if (!(__call519_11(__fieldRead519_10(spill519_4)))) {
        break forward_join_54;
    }
    forwardValue519_40_0 = receiver;
    }
    __call519_19(__fieldRead519_12(forwardValue519_40_0), __invokedynamic519_13(receiver), ((long) __call519_15(__fieldRead519_14(receiver))), ((long) __call519_17(__fieldRead519_16(receiver))), __fieldRead519_18());
    }
    return;
}
public static void h519_0(moom.Oo p0) throws Throwable {
    throw __call1051900_0(p0);
}
public static void h519_1(moom.Oo p0) throws Throwable {
    throw __call1051901_0(p0);
}
private static native long __fieldRead519_0() throws Throwable;
private static native int __call519_1() throws Throwable;
private static native org.tinylog.TaggedLogger __fieldRead519_2() throws Throwable;
private static native java.lang.String __fieldRead519_3(net.arikia.dev.drpc.DiscordUser a0) throws Throwable;
private static native java.lang.String __fieldRead519_4(net.arikia.dev.drpc.DiscordUser a0) throws Throwable;
private static native java.lang.String __fieldRead519_5(net.arikia.dev.drpc.DiscordUser a0) throws Throwable;
private static native java.lang.String __invokedynamic519_6(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic519_7(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic519_8(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, java.lang.String a4, java.lang.String a5, java.lang.String a6) throws Throwable;
private static native void __call519_9(org.tinylog.TaggedLogger a0, java.lang.String a1) throws Throwable;
private static native com.moon.n_ __fieldRead519_10(com.moon.n9 a0) throws Throwable;
private static native boolean __call519_11(com.moon.n_ a0) throws Throwable;
private static native java.util.concurrent.ScheduledExecutorService __fieldRead519_12(com.moon.n9 a0) throws Throwable;
private static native java.lang.Runnable __invokedynamic519_13(com.moon.n9 a0) throws Throwable;
private static native com.moon.n_ __fieldRead519_14(com.moon.n9 a0) throws Throwable;
private static native int __call519_15(com.moon.n_ a0) throws Throwable;
private static native com.moon.n_ __fieldRead519_16(com.moon.n9 a0) throws Throwable;
private static native int __call519_17(com.moon.n_ a0) throws Throwable;
private static native java.util.concurrent.TimeUnit __fieldRead519_18() throws Throwable;
private static native java.util.concurrent.ScheduledFuture __call519_19(java.util.concurrent.ScheduledExecutorService a0, java.lang.Runnable a1, long a2, long a3, java.util.concurrent.TimeUnit a4) throws Throwable;
private static native java.lang.Exception __call1051900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1051901_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_0c64d42d1779ee55d864() throws E;
private static final class __SourceHandler_0c64d42d1779ee55d864 {

public static void f137() throws Throwable {
    long life0_3;
    life0_3 = (__fieldRead137_0() ^ 9174738856937L);
    __call137_3(__fieldRead137_1(), __invokedynamic137_2(22941, (1980681730259477971L ^ life0_3)));
    __call137_4();
    return;
}
public static void h137_0(java.lang.Exception p0) throws Throwable {
    java.lang.Exception life1_2;
    life1_2 = p0;
    __call3013700_1(__fieldRead3013700_0(), life1_2);
    return;
}
private static native long __fieldRead137_0() throws Throwable;
private static native org.tinylog.TaggedLogger __fieldRead137_1() throws Throwable;
private static native java.lang.String __invokedynamic137_2(int a0, long a1) throws Throwable;
private static native void __call137_3(org.tinylog.TaggedLogger a0, java.lang.String a1) throws Throwable;
private static native void __call137_4() throws Throwable;
private static native org.tinylog.TaggedLogger __fieldRead3013700_0() throws Throwable;
private static native void __call3013700_1(org.tinylog.TaggedLogger a0, java.lang.Exception a1) throws Throwable;

}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral2830_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/n9"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 23651);
    if (((com.moon.n9.l)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (com.moon.n9.k)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(com.moon.n9.m)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.n9.m)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("com/moon/n9", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (com.moon.n9.l)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((com.moon.n9.l)[life3_8])).longValue();
}


private static long b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = com.moon.n9.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void b() { __sourceHandlerCall_20804f85a43f71c2ae29(this); }


public void c() { __sourceHandlerCall_048ecd05ee44f87ebb92(this); }


private static java.lang.String a(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 11746);
    if (((com.moon.n9.i)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.n9.j)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.n9.j)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/n9", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.n9.h)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.n9.i)[life5_8] = com.moon.n9.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.n9.i)[life5_8];
}


public void a() { __sourceHandlerCall_d20cc9fe53aee8d984db(this); }


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.n9.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral2836_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/n9"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
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
        byte[] spill1012_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1012_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1012_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1012_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1012_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1012_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public static com.moon.n9 a(com.moon.n_ p0) {
return new com.moon.n9(p0);
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static void lambda$display$1(int p0, java.lang.String p1) {
long local2_life2 = (com.moon.n9.g ^ 37649215298064L);
    org.tinylog.TaggedLogger __sourceSpill182_6 = com.moon.n9.a;
    int __stackOp182_7_0 = p0;
    java.lang.String __stackOp182_7_1 = p1;
    java.lang.String __stackOp182_7_2 = __sourceIntrinsic_b978b7fdf4f1_originalDynamicSite182_5(31965, (1131636419021844839L ^ local2_life2));
    java.lang.String __sourceSpill182_9 = __stackOp182_7_2;
    int __sourceSpill182_10 = __stackOp182_7_0;
    java.lang.String __sourceSpill182_11 = __stackOp182_7_1;
    recovery.source.CarrierOps.discard(__stackOp182_7_2);
    java.lang.String __stackOp182_14_0 = __sourceSpill182_11;
    java.lang.String __stackOp182_14_1 = __sourceIntrinsic_b978b7fdf4f1_originalDynamicSite182_13(27137, (2686559128186988464L ^ local2_life2));
    ((org.tinylog.TaggedLogger)(__sourceSpill182_6)).info(((java.lang.Object)(__sourceIntrinsic_b978b7fdf4f1_originalDynamicSite182_15(__sourceSpill182_9, __sourceSpill182_10, __stackOp182_14_1, __stackOp182_14_0, ")"))));
    return;
}


private static void lambda$display$3() { __sourceHandlerCall_0c64d42d1779ee55d864(); }


private static void lambda$display$2(int p0, java.lang.String p1) {
long local2_life2 = (com.moon.n9.g ^ 137425986573469L);
    org.tinylog.TaggedLogger __sourceSpill183_6 = com.moon.n9.a;
    int __stackOp183_7_0 = p0;
    java.lang.String __stackOp183_7_1 = p1;
    java.lang.String __stackOp183_7_2 = __sourceIntrinsic_dba99395afa2_originalDynamicSite183_5(14414, (2656647452236233590L ^ local2_life2));
    java.lang.String __sourceSpill183_9 = __stackOp183_7_2;
    int __sourceSpill183_10 = __stackOp183_7_0;
    java.lang.String __sourceSpill183_11 = __stackOp183_7_1;
    recovery.source.CarrierOps.discard(__stackOp183_7_2);
    java.lang.String __stackOp183_14_0 = __sourceSpill183_11;
    java.lang.String __stackOp183_14_1 = __sourceIntrinsic_dba99395afa2_originalDynamicSite183_13(15602, (5826836646811877327L ^ local2_life2));
    ((org.tinylog.TaggedLogger)(__sourceSpill183_6)).error(((java.lang.Object)(__sourceIntrinsic_dba99395afa2_originalDynamicSite183_15(__sourceSpill183_9, __sourceSpill183_10, __stackOp183_14_1, __stackOp183_14_0, ")"))));
    return;
}


private void lambda$display$0(net.arikia.dev.drpc.DiscordUser p0) { __sourceHandlerCall_38155bfac4fd65fef034(this, p0); }


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite303_85(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral2836_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral2830_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b978b7fdf4f1_originalDynamicSite182_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b978b7fdf4f1_originalDynamicSite182_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b978b7fdf4f1_originalDynamicSite182_15(java.lang.String a0, int a1, java.lang.String a2, java.lang.String a3, java.lang.String a4) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_dba99395afa2_originalDynamicSite183_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_dba99395afa2_originalDynamicSite183_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_dba99395afa2_originalDynamicSite183_15(java.lang.String a0, int a1, java.lang.String a2, java.lang.String a3, java.lang.String a4) throws E;
}
