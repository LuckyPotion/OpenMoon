package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Mk {

private net.minecraft.util.EnumWorldBlockLayer a;

private int b;

private int c;

private int d;

private int e;

private moom.NW<moom.Mj> f;

private moom.Mj g;

private java.nio.IntBuffer h;

private java.nio.IntBuffer i;

private int j;

private int k;

private static long l;

private static java.lang.String[] m;

private static java.lang.String[] n;

private static java.util.Map o;

private static long[] p;

private static java.lang.Integer[] q;

private static java.util.Map r;

public Mk(net.minecraft.util.EnumWorldBlockLayer p0) { super(); }

private static void __sourceConstructorBody_3029c5d127db916f(moom.Mk receiver, net.minecraft.util.EnumWorldBlockLayer p0) throws Throwable {
long local2 = (moom.Mk.l ^ 81779238813521L);
    moom.Mk.__sourceConstructorInit_3029c5d127db916f_0(((moom.Mk)(receiver)));
    ((moom.Mk)(receiver)).a = ((net.minecraft.util.EnumWorldBlockLayer)(null));
    ((moom.Mk)(receiver)).b = ((int)(net.minecraft.client.renderer.OpenGlHelper.b()));
    ((moom.Mk)(receiver)).c = ((int)(__sourceIntrinsic_3029c5d127db916f_originalDynamicSite2450_5(14328, (8615803856500454252L ^ local2))));
    ((moom.Mk)(receiver)).d = ((int)(0));
    ((moom.Mk)(receiver)).f = ((moom.NW)(new moom.NW()));
    ((moom.Mk)(receiver)).g = ((moom.Mj)(null));
    ((moom.Mk)(receiver)).h = ((java.nio.IntBuffer)(moom.BU.a__IntBuffer(((int)(((moom.Mk)(receiver)).c)))));
    ((moom.Mk)(receiver)).i = ((java.nio.IntBuffer)(moom.BU.a__IntBuffer(((int)(((moom.Mk)(receiver)).c)))));
    ((moom.Mk)(receiver)).j = ((int)(__sourceIntrinsic_3029c5d127db916f_originalDynamicSite2450_16(2683, (8336235333673602792L ^ local2))));
    ((moom.Mk)(receiver)).k = ((int)(((moom.oD)(moom.oB.a)).d()));
    ((moom.Mk)(receiver)).a = ((net.minecraft.util.EnumWorldBlockLayer)(p0));
    ((moom.Mk)(receiver)).b();
    long local4 = ((moom.Mk)(receiver)).a(((int)(((moom.Mk)(receiver)).c)));
    net.minecraft.client.renderer.OpenGlHelper.a(((int)(net.minecraft.client.renderer.OpenGlHelper.R)), ((long)(local4)), ((int)(net.minecraft.client.renderer.OpenGlHelper.S)));
    ((moom.Mk)(receiver)).c();
    return;
}


static {
l = ((long)(((moom._a)(moom._c.a(((long)(3658342131163835708L)), ((long)(-972225703098835955L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(257137247304762L)))));
    o = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.Mk.l ^ 44170241786647L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill706_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill706_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill706_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill706_14 = new byte[8];
    (__sourceSpill706_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill706_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation706_16 = __sourceSpill706_14;
    ((javax.crypto.Cipher)(__sourceSpill706_11)).init(((int)(__sourceSpill706_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill706_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation706_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[11];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "aô\fu»LVÚú¶¢64Þ\033¡<\034·Ý\026\017èa\020hÜüIá¯\"¤æ\004V\000;ª¢u ïôÚ¸¾\037ê\"R-bËNíìêEá\032t¡ÈR\021\033nâZ\020DÇ´[ªw\035ù\t»êÒÿÏõ8Pw)5\030ç;Æ \"®-SJ×\025Ä\000!bó}ú%ztÉ<º/vmZ\005õ\r\013ïK\nõN?.tÄ\030F®,ä­\020\033ÉìJï¥ÈàF7èÞw [tKÁÔ;Ã%%\003Ú £®î\002u0ò«qÎWnT­\\qØ\002é]\030Ö¦1\r%ç\017$¬ïü.¼Ó[Äìw#ý~P\030®\017Ëö\021¯É7?ØÈì\004Â]ÖÅö!2?"))).length();
    int local16_life24 = 24;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill706_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill706_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill706_29)).doFinal(((byte[])(__sourceSpill706_28)));
        java.lang.String __sourceSpill706_34 = ((java.lang.String)(moom.Mk.a(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill706_35 = local20_life19;
        int __sourceSpill706_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill706_35)[__sourceSpill706_36] = __sourceSpill706_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "nÌÉgGÙú ä\021eqÞÉ¿ÌïNé\005ì\fû pÝ%au³\026\023ßÈ÷Qù\026!An3\177¿ÑpÂÂ!\"\024"))).length();
    local16_life24 = 24;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill706_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill706_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill706_42)).doFinal(((byte[])(__sourceSpill706_41)));
        java.lang.String __sourceSpill706_47 = ((java.lang.String)(moom.Mk.a(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill706_48 = local20_life19;
        int __sourceSpill706_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill706_48)[__sourceSpill706_49] = __sourceSpill706_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    m = ((java.lang.String[])(local20_life19));
    n = ((java.lang.String[])(new java.lang.String[11]));
    r = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill706_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill706_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill706_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill706_60 = new byte[8];
    (__sourceSpill706_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill706_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation706_62 = __sourceSpill706_60;
    ((javax.crypto.Cipher)(__sourceSpill706_57)).init(((int)(__sourceSpill706_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill706_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation706_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[8];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "\023r¦\023½Aæ4/+­·&¹\020âí@k^D?K\032\016\007\036ùO:Ê((\032\034ûñ¢l\026é1\004P"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill706_71 = local4_life67;
        int __sourceSpill706_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill706_71)).substring(((int)(__sourceSpill706_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill706_76 = local6_life65;
        int __sourceSpill706_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill706_79 = new byte[8];
        (__sourceSpill706_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill706_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill706_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill706_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill706_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill706_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill706_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill706_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill706_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill706_80)).doFinal(((byte[])(__sourceSpill706_79)));
        (__sourceSpill706_76)[__sourceSpill706_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    local5_life69 = ((java.lang.String)((local4_life67 = "\003ßg]ºggZÉ­F¾¸)Ö"))).length();
    local2_life70 = 0;
    do {
        java.lang.String __sourceSpill706_84 = local4_life67;
        int __sourceSpill706_85 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill706_84)).substring(((int)(__sourceSpill706_85)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill706_89 = local6_life65;
        int __sourceSpill706_90 = local3_life66;
        local3_life66 += 1;
        long local8_life91 = (((((((((((long) (local7_life88)[0]) & 255L) << 56) | ((((long) (local7_life88)[1]) & 255L) << 48)) | ((((long) (local7_life88)[2]) & 255L) << 40)) | ((((long) (local7_life88)[3]) & 255L) << 32)) | ((((long) (local7_life88)[4]) & 255L) << 24)) | ((((long) (local7_life88)[5]) & 255L) << 16)) | ((((long) (local7_life88)[6]) & 255L) << 8)) | (((long) (local7_life88)[7]) & 255L));
        byte[] __sourceSpill706_92 = new byte[8];
        (__sourceSpill706_92)[0] = ((byte) ((int) (local8_life91 >>> 56)));
        (__sourceSpill706_92)[1] = ((byte) ((int) (local8_life91 >>> 48)));
        (__sourceSpill706_92)[2] = ((byte) ((int) (local8_life91 >>> 40)));
        (__sourceSpill706_92)[3] = ((byte) ((int) (local8_life91 >>> 32)));
        (__sourceSpill706_92)[4] = ((byte) ((int) (local8_life91 >>> 24)));
        (__sourceSpill706_92)[5] = ((byte) ((int) (local8_life91 >>> 16)));
        (__sourceSpill706_92)[6] = ((byte) ((int) (local8_life91 >>> 8)));
        (__sourceSpill706_92)[7] = ((byte) ((int) local8_life91));
        javax.crypto.Cipher __sourceSpill706_93 = local0_life55;
        byte[] local10_life95 = ((javax.crypto.Cipher)(__sourceSpill706_93)).doFinal(((byte[])(__sourceSpill706_92)));
        (__sourceSpill706_89)[__sourceSpill706_90] = (((((((((((long) (local10_life95)[0]) & 255L) << 56) | ((((long) (local10_life95)[1]) & 255L) << 48)) | ((((long) (local10_life95)[2]) & 255L) << 40)) | ((((long) (local10_life95)[3]) & 255L) << 32)) | ((((long) (local10_life95)[4]) & 255L) << 24)) | ((((long) (local10_life95)[5]) & 255L) << 16)) | ((((long) (local10_life95)[6]) & 255L) << 8)) | (((long) (local10_life95)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    p = ((long[])(local6_life65));
    q = ((java.lang.Integer[])(new java.lang.Integer[8]));
}

private static native <E extends Throwable> void __sourceConstructorInit_3029c5d127db916f_0(moom.Mk a0) throws E;
private static native <E extends Throwable> void __sourceHandlerCall_0443015c70b15b5311f3(moom.Mk a0, int a1, moom.Mj a2) throws E;
private static final class __SourceHandler_0443015c70b15b5311f3 {

public static void f362(moom.Mk receiver, int p0, moom.Mj p1) throws Throwable {
    moom.Mk forestValue362_40_0;
    moom.Mk forestValue362_49_0;
    moom.Mk spill362_0;
    moom.Mk spill362_1;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    forest_join_49: {
    forest_join_42: {
    forest_join_40: {
    forest_join_39: {
    life3_3 = (__fieldRead362_0() ^ 20769285095892L);
    life5_5 = __call362_1();
    spill362_0 = receiver;
    if (!((life5_5 == null))) {
        forestValue362_49_0 = spill362_0;
        break forest_join_49;
    }
    if (!((__fieldRead362_2(spill362_0) != p0))) {
        break forest_join_42;
    }
    spill362_1 = receiver;
    if (!((life5_5 == null))) {
        forestValue362_40_0 = spill362_1;
        break forest_join_40;
    }
    if (!((__call362_4(__fieldRead362_3(spill362_1)) > 0))) {
        break forest_join_39;
    }
    java.lang.Object __inlineStack362_7Token;
    java.lang.Object __inlineStack362_9Token;
    throw new java.lang.IllegalArgumentException(__invokedynamic362_10(__inlineStack362_7Output0((__inlineStack362_7Token = __inlineStack362_7Pack(__fieldRead362_5(receiver), p0, __invokedynamic362_6(17933, (7224866553801102141L ^ life3_3))))), __inlineStack362_7Output1(__inlineStack362_7Token), __inlineStack362_9Output0((__inlineStack362_9Token = __inlineStack362_9Pack(__inlineStack362_7Output2(__inlineStack362_7Token), __invokedynamic362_8(10941, (116602661626888072L ^ life3_3))))), __inlineStack362_9Output1(__inlineStack362_9Token)));
    }
    forestValue362_40_0 = receiver;
    }
    __fieldWrite362_11(forestValue362_40_0, p0);
    }
    __call362_14(__fieldRead362_12(receiver), __call362_13(p1));
    forestValue362_49_0 = receiver;
    }
    __call362_17(__fieldRead362_15(forestValue362_49_0), __call362_16(p1));
    return;
}
private static native long __fieldRead362_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call362_1() throws Throwable;
private static native int __fieldRead362_2(moom.Mk a0) throws Throwable;
private static native java.nio.IntBuffer __fieldRead362_3(moom.Mk a0) throws Throwable;
private static native int __call362_4(java.nio.IntBuffer a0) throws Throwable;
private static native int __fieldRead362_5(moom.Mk a0) throws Throwable;
private static native java.lang.String __invokedynamic362_6(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack362_7Pack(int a0, int a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __inlineStack362_7Output0(java.lang.Object token) throws Throwable;
private static native int __inlineStack362_7Output1(java.lang.Object token) throws Throwable;
private static native int __inlineStack362_7Output2(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic362_8(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack362_9Pack(int a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack362_9Output0(java.lang.Object token) throws Throwable;
private static native int __inlineStack362_9Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic362_10(java.lang.String a0, int a1, java.lang.String a2, int a3) throws Throwable;
private static native void __fieldWrite362_11(moom.Mk a0, int a1) throws Throwable;
private static native java.nio.IntBuffer __fieldRead362_12(moom.Mk a0) throws Throwable;
private static native int __call362_13(moom.Mj a0) throws Throwable;
private static native java.nio.IntBuffer __call362_14(java.nio.IntBuffer a0, int a1) throws Throwable;
private static native java.nio.IntBuffer __fieldRead362_15(moom.Mk a0) throws Throwable;
private static native int __call362_16(moom.Mj a0) throws Throwable;
private static native java.nio.IntBuffer __call362_17(java.nio.IntBuffer a0, int a1) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_27087636f2d026ab9764(moom.Mk a0) throws E;
private static final class __SourceHandler_27087636f2d026ab9764 {

public static void f363(moom.Mk receiver) throws Throwable {
    int forestValue363_33_0;
    int forestValue363_40_0;
    moom.Mj forestValue363_46_0;
    moom.Mj forestValue363_61_0;
    moom.Mj forestValue363_76_0;
    int forestValue363_117_0;
    int forestValue363_148_0;
    int forestValue363_148_1;
    net.minecraft.entity.Entity[] spill363_0;
    int spill363_1;
    moom.Mj spill363_2;
    moom.Mj spill363_3;
    moom.Mj spill363_4;
    moom.Mj spill363_5;
    moom.Mj spill363_6;
    int spill363_7;
    long life1_3;
    int life4_6;
    int life5_8;
    net.minecraft.entity.Entity[] life3_9;
    moom.Mj life6_15;
    moom.Mj life7_52;
    moom.Mj life8_69;
    forest_join_170: {
    forest_join_148: {
    forest_join_145: {
    forest_join_117: {
    forest_join_116: {
    forest_join_104: {
    forest_join_92: {
    forest_join_80: {
    life1_3 = (__fieldRead363_0() ^ 54216605886513L);
    spill363_0 = __call363_1();
    life4_6 = 0;
    life5_8 = 0;
    life3_9 = spill363_0;
    life6_15 = __cast363_5(__call363_4(__call363_3(__fieldRead363_2(receiver))));
    forest_cycle_16: while (true) {
    forest_join_76: {
    forest_join_74: {
    forest_join_61: {
    forest_join_59: {
    forest_join_46: {
    forest_join_44: {
    forest_join_40: {
    forest_join_33: {
    if (!((life6_15 != null))) {
        break forest_join_116;
    }
    life4_6 += 1;
    life5_8 = (life5_8 + __call363_6(life6_15));
    spill363_1 = __call363_7(life6_15);
    if (!((life3_9 == null))) {
        forestValue363_117_0 = spill363_1;
        break forest_join_117;
    }
    if (!((life3_9 == null))) {
        forestValue363_33_0 = spill363_1;
        break forest_join_33;
    }
    if (!((spill363_1 >= 0))) {
        break forest_join_80;
    }
    forestValue363_33_0 = __call363_8(life6_15);
    }
    if (!((life3_9 == null))) {
        forestValue363_40_0 = forestValue363_33_0;
        break forest_join_40;
    }
    if (!((forestValue363_33_0 > 0))) {
        break forest_join_80;
    }
    spill363_2 = life6_15;
    if (!((life3_9 == null))) {
        forestValue363_46_0 = spill363_2;
        break forest_join_46;
    }
    forestValue363_40_0 = __call363_9(spill363_2);
    }
    if (!((forestValue363_40_0 > __fieldRead363_10(receiver)))) {
        break forest_join_44;
    }
    break forest_join_80;
    }
    forestValue363_46_0 = __call363_11(life6_15);
    }
    life7_52 = forestValue363_46_0;
    spill363_3 = life7_52;
    if (!((life3_9 == null))) {
        forestValue363_61_0 = spill363_3;
        break forest_join_61;
    }
    if (!((spill363_3 != null))) {
        break forest_join_59;
    }
    spill363_4 = life6_15;
    if (!((life3_9 == null))) {
        forestValue363_61_0 = spill363_4;
        break forest_join_61;
    }
    if (!((__call363_12(spill363_4) < __call363_13(life7_52)))) {
        break forest_join_59;
    }
    break forest_join_92;
    }
    forestValue363_61_0 = __call363_14(life6_15);
    }
    life8_69 = forestValue363_61_0;
    spill363_5 = life8_69;
    if (!((life3_9 == null))) {
        forestValue363_76_0 = spill363_5;
        break forest_join_76;
    }
    if (!((spill363_5 != null))) {
        break forest_join_74;
    }
    spill363_6 = life6_15;
    if (!((life3_9 == null))) {
        forestValue363_76_0 = spill363_6;
        break forest_join_76;
    }
    if (!((__call363_15(spill363_6) > __call363_16(life8_69)))) {
        break forest_join_74;
    }
    break forest_join_104;
    }
    forestValue363_76_0 = __call363_17(life6_15);
    }
    life6_15 = forestValue363_76_0;
    if (!((life3_9 != null))) {
        continue forest_cycle_16;
    }
    break forest_cycle_16;
    }
    break forest_join_116;
    }
    java.lang.Object __inlineStack363_19Token;
    throw new java.lang.RuntimeException(__invokedynamic363_20(__inlineStack363_19Output0((__inlineStack363_19Token = __inlineStack363_19Pack(life6_15, __invokedynamic363_18(16613, (2572443351547477044L ^ life1_3))))), __inlineStack363_19Output1(__inlineStack363_19Token)));
    }
    java.lang.Object __inlineStack363_22Token;
    throw new java.lang.RuntimeException(__invokedynamic363_23(__inlineStack363_22Output0((__inlineStack363_22Token = __inlineStack363_22Pack(life6_15, __invokedynamic363_21(2362, (7512985238628414947L ^ life1_3))))), __inlineStack363_22Output1(__inlineStack363_22Token)));
    }
    java.lang.Object __inlineStack363_25Token;
    throw new java.lang.RuntimeException(__invokedynamic363_26(__inlineStack363_25Output0((__inlineStack363_25Token = __inlineStack363_25Pack(life6_15, __invokedynamic363_24(2362, (7512985238628414947L ^ life1_3))))), __inlineStack363_25Output1(__inlineStack363_25Token)));
    }
    forestValue363_117_0 = life4_6;
    }
    spill363_7 = __call363_28(__fieldRead363_27(receiver));
    if (!((life3_9 == null))) {
        forestValue363_148_0 = forestValue363_117_0;
        forestValue363_148_1 = spill363_7;
        break forest_join_148;
    }
    if (!((forestValue363_117_0 != spill363_7))) {
        break forest_join_145;
    }
    java.lang.Object __inlineStack363_32Token;
    java.lang.Object __inlineStack363_34Token;
    throw new java.lang.RuntimeException(__invokedynamic363_35(__inlineStack363_32Output0((__inlineStack363_32Token = __inlineStack363_32Pack(life4_6, __call363_30(__fieldRead363_29(receiver)), __invokedynamic363_31(20647, (2576368251143023729L ^ life1_3))))), __inlineStack363_32Output1(__inlineStack363_32Token), __inlineStack363_34Output0((__inlineStack363_34Token = __inlineStack363_34Pack(__inlineStack363_32Output2(__inlineStack363_32Token), __invokedynamic363_33(18803, (8389290626076702119L ^ life1_3))))), __inlineStack363_34Output1(__inlineStack363_34Token)));
    }
    forestValue363_148_0 = life5_8;
    forestValue363_148_1 = __fieldRead363_36(receiver);
    }
    if (!((forestValue363_148_0 != forestValue363_148_1))) {
        break forest_join_170;
    }
    java.lang.Object __inlineStack363_39Token;
    java.lang.Object __inlineStack363_41Token;
    throw new java.lang.RuntimeException(__invokedynamic363_42(__inlineStack363_39Output0((__inlineStack363_39Token = __inlineStack363_39Pack(life5_8, __fieldRead363_37(receiver), __invokedynamic363_38(26415, (4642027241345997815L ^ life1_3))))), __inlineStack363_39Output1(__inlineStack363_39Token), __inlineStack363_41Output0((__inlineStack363_41Token = __inlineStack363_41Pack(__inlineStack363_39Output2(__inlineStack363_39Token), __invokedynamic363_40(26163, (1896247158717995745L ^ life1_3))))), __inlineStack363_41Output1(__inlineStack363_41Token)));
    }
    return;
}
private static native long __fieldRead363_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call363_1() throws Throwable;
private static native moom.NW __fieldRead363_2(moom.Mk a0) throws Throwable;
private static native moom.NY __call363_3(moom.NW a0) throws Throwable;
private static native java.lang.Object __call363_4(moom.NY a0) throws Throwable;
private static native moom.Mj __cast363_5(java.lang.Object a0) throws Throwable;
private static native int __call363_6(moom.Mj a0) throws Throwable;
private static native int __call363_7(moom.Mj a0) throws Throwable;
private static native int __call363_8(moom.Mj a0) throws Throwable;
private static native int __call363_9(moom.Mj a0) throws Throwable;
private static native int __fieldRead363_10(moom.Mk a0) throws Throwable;
private static native moom.Mj __call363_11(moom.Mj a0) throws Throwable;
private static native int __call363_12(moom.Mj a0) throws Throwable;
private static native int __call363_13(moom.Mj a0) throws Throwable;
private static native moom.Mj __call363_14(moom.Mj a0) throws Throwable;
private static native int __call363_15(moom.Mj a0) throws Throwable;
private static native int __call363_16(moom.Mj a0) throws Throwable;
private static native moom.Mj __call363_17(moom.Mj a0) throws Throwable;
private static native java.lang.String __invokedynamic363_18(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack363_19Pack(moom.Mj a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack363_19Output0(java.lang.Object token) throws Throwable;
private static native moom.Mj __inlineStack363_19Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic363_20(java.lang.String a0, moom.Mj a1) throws Throwable;
private static native java.lang.String __invokedynamic363_21(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack363_22Pack(moom.Mj a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack363_22Output0(java.lang.Object token) throws Throwable;
private static native moom.Mj __inlineStack363_22Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic363_23(java.lang.String a0, moom.Mj a1) throws Throwable;
private static native java.lang.String __invokedynamic363_24(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack363_25Pack(moom.Mj a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack363_25Output0(java.lang.Object token) throws Throwable;
private static native moom.Mj __inlineStack363_25Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic363_26(java.lang.String a0, moom.Mj a1) throws Throwable;
private static native moom.NW __fieldRead363_27(moom.Mk a0) throws Throwable;
private static native int __call363_28(moom.NW a0) throws Throwable;
private static native moom.NW __fieldRead363_29(moom.Mk a0) throws Throwable;
private static native int __call363_30(moom.NW a0) throws Throwable;
private static native java.lang.String __invokedynamic363_31(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack363_32Pack(int a0, int a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __inlineStack363_32Output0(java.lang.Object token) throws Throwable;
private static native int __inlineStack363_32Output1(java.lang.Object token) throws Throwable;
private static native int __inlineStack363_32Output2(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic363_33(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack363_34Pack(int a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack363_34Output0(java.lang.Object token) throws Throwable;
private static native int __inlineStack363_34Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic363_35(java.lang.String a0, int a1, java.lang.String a2, int a3) throws Throwable;
private static native int __fieldRead363_36(moom.Mk a0) throws Throwable;
private static native int __fieldRead363_37(moom.Mk a0) throws Throwable;
private static native java.lang.String __invokedynamic363_38(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack363_39Pack(int a0, int a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __inlineStack363_39Output0(java.lang.Object token) throws Throwable;
private static native int __inlineStack363_39Output1(java.lang.Object token) throws Throwable;
private static native int __inlineStack363_39Output2(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic363_40(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack363_41Pack(int a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack363_41Output0(java.lang.Object token) throws Throwable;
private static native int __inlineStack363_41Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic363_42(java.lang.String a0, int a1, java.lang.String a2, int a3) throws Throwable;

}


public void b() {
net.minecraft.client.renderer.OpenGlHelper.c(((int)(net.minecraft.client.renderer.OpenGlHelper.R)), ((int)(this.b)));
    return;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral6425_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Mk"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Mk.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x59A5;
        if (q[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = p[n4];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])r.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    r.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Mk", exception);
            }
            int n6 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Mk.q[n4] = n6;
        }
        return q[n4];
}


private void b(int p0) {
moom.Mk forwardValue2739_13_0;
    moom.Mk spill2739_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_15: {
    forward_join_13: {
    life2_3 = (moom.Mk.l ^ 132320198759644L);
    life4_5 = moom.Mi.b__Arrayr3();
    spill2739_0 = this;
    if (!((life4_5 == null))) {
        forwardValue2739_13_0 = spill2739_0;
        break forward_join_13;
    }
    if (!((((moom.Mk)(spill2739_0)).c < p0))) {
        break forward_join_15;
    }
    forwardValue2739_13_0 = this;
    }
    ((moom.Mk)(forwardValue2739_13_0)).c(((int)(p0)));
    }
    return;
}


public void c() {
net.minecraft.client.renderer.OpenGlHelper.c(((int)(net.minecraft.client.renderer.OpenGlHelper.R)), ((int)(0)));
    return;
}


private void c(int p0) {
net.minecraft.entity.Entity[] spill968_0;
    int spill968_1;
    long spill968_2;
    java.lang.String spill968_3;
    long spill968_4;
    long life2_3;
    int life5_15;
    net.minecraft.entity.Entity[] life4_16;
    long life6_36;
    long life8_41;
    int life10_46;
    lexical_join_32: {
    life2_3 = (moom.Mk.l ^ 86987151172272L);
    spill968_0 = moom.Mi.b__Arrayr3();
    life5_15 = ((this.c * __sourceIntrinsic_15c946d67bc3_invokedynamic968_3(11546, (5307848857111540842L ^ life2_3))) / 4);
    life4_16 = spill968_0;
    lexical_cycle_17: while (true) {
    if (!((life5_15 < p0))) {
        break lexical_join_32;
    }
    life5_15 = ((life5_15 * __sourceIntrinsic_15c946d67bc3_invokedynamic968_4(13651, (4857577866224610341L ^ life2_3))) / 4);
    if (!((life4_16 != null))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    life6_36 = ((moom.Mk)(this)).a(((int)(this.c)));
    spill968_1 = 2875;
    life8_41 = ((moom.Mk)(this)).a(((int)(life5_15)));
    spill968_2 = (4357052354582494569L ^ life2_3);
    life10_46 = net.minecraft.client.renderer.OpenGlHelper.b();
    net.minecraft.client.renderer.OpenGlHelper.c(((int)(net.minecraft.client.renderer.OpenGlHelper.R)), ((int)(life10_46)));
    net.minecraft.client.renderer.OpenGlHelper.a(((int)(net.minecraft.client.renderer.OpenGlHelper.R)), ((long)(life8_41)), ((int)(net.minecraft.client.renderer.OpenGlHelper.S)));
    moom.BU.f(((java.lang.String)(__sourceIntrinsic_15c946d67bc3_invokedynamic968_14(spill968_1, spill968_2))));
    net.minecraft.client.renderer.OpenGlHelper.c(((int)(net.minecraft.client.renderer.OpenGlHelper.R)), ((int)(0)));
    net.minecraft.client.renderer.OpenGlHelper.c(((int)(net.minecraft.client.renderer.OpenGlHelper.X)), ((int)(this.b)));
    net.minecraft.client.renderer.OpenGlHelper.c(((int)(net.minecraft.client.renderer.OpenGlHelper.Y)), ((int)(life10_46)));
    net.minecraft.client.renderer.OpenGlHelper.a(((int)(net.minecraft.client.renderer.OpenGlHelper.X)), ((int)(net.minecraft.client.renderer.OpenGlHelper.Y)), ((long)(0L)), ((long)(0L)), ((long)(life6_36)));
    long __stackOp968_27_0 = life8_41;
    java.lang.String __stackOp968_27_1 = __sourceIntrinsic_15c946d67bc3_invokedynamic968_26(928, (2942547545955743226L ^ life2_3));
    spill968_3 = __stackOp968_27_1;
    spill968_4 = __stackOp968_27_0;
    recovery.source.CarrierOps.discard(__stackOp968_27_1);
    moom.BU.f(((java.lang.String)(__sourceIntrinsic_15c946d67bc3_invokedynamic968_29(spill968_3, spill968_4))));
    net.minecraft.client.renderer.OpenGlHelper.c(((int)(net.minecraft.client.renderer.OpenGlHelper.X)), ((int)(0)));
    net.minecraft.client.renderer.OpenGlHelper.c(((int)(net.minecraft.client.renderer.OpenGlHelper.Y)), ((int)(0)));
    net.minecraft.client.renderer.OpenGlHelper.f(((int)(this.b)));
    this.h = ((java.nio.IntBuffer)(moom.BU.a__IntBuffer(((int)(life5_15)))));
    this.i = ((java.nio.IntBuffer)(moom.BU.a__IntBuffer(((int)(life5_15)))));
    this.b = ((int)(life10_46));
    this.c = ((int)(life5_15));
    return;
}


public void d() {
int forwardValue2741_13_0;
    int spill2741_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_17: {
    forward_join_13: {
    life1_3 = (moom.Mk.l ^ 55049215252140L);
    life3_5 = moom.Mi.b__Arrayr3();
    spill2741_0 = this.b;
    if (!((life3_5 == null))) {
        forwardValue2741_13_0 = spill2741_0;
        break forward_join_13;
    }
    if (!((spill2741_0 >= 0))) {
        break forward_join_17;
    }
    forwardValue2741_13_0 = this.b;
    }
    net.minecraft.client.renderer.OpenGlHelper.f(((int)(forwardValue2741_13_0)));
    this.b = ((int)(-1));
    }
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6429_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Mk"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.Mk.a(((int)(local4)), ((long)(local5)));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 30337);
    if (((moom.Mk.n)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.Mk.o)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.Mk.o)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/Mk", life9_51);
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
        life9_116 = ((java.lang.String)((moom.Mk.m)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.Mk.n)[life5_8] = moom.Mk.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.Mk.n)[life5_8];
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
        byte[] spill3232_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3232_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3232_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3232_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3232_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3232_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private long a(int p0) {
return (((long) p0) * ((long) this.k));
}


public void a(java.nio.ByteBuffer p0, moom.Mj p1) {
int forwardValue2735_45_0;
    int forwardValue2735_65_0;
    moom.Mk forwardValue2735_73_0;
    moom.Mk forwardValue2735_125_0;
    net.minecraft.entity.Entity[] spill2735_0;
    int spill2735_1;
    moom.Mk spill2735_2;
    moom.Mk spill2735_3;
    long life3_3;
    int life6_7;
    net.minecraft.entity.Entity[] life5_8;
    int life7_11;
    int life8_17;
    long life9_120;
    forward_join_127: {
    forward_join_125: {
    forward_join_77: {
    forward_join_73: {
    forward_join_72: {
    forward_join_65: {
    forward_join_45: {
    forward_join_44: {
    life3_3 = (moom.Mk.l ^ 50576664528242L);
    spill2735_0 = moom.Mi.b__Arrayr3();
    life6_7 = ((moom.Mj)(p1)).a();
    life5_8 = spill2735_0;
    life7_11 = ((moom.Mj)(p1)).b();
    life8_17 = ((moom.Mk)(this)).a(((long)(((long) ((java.nio.ByteBuffer)(p0)).limit()))));
    spill2735_1 = life8_17;
    if (!((life5_8 == null))) {
        forwardValue2735_45_0 = spill2735_1;
        break forward_join_45;
    }
    if (!((spill2735_1 <= 0))) {
        break forward_join_44;
    }
    if (!((life6_7 >= 0))) {
        break forward_join_127;
    }
    ((moom.Mj)(p1)).a(((int)(-1)));
    ((moom.Mj)(p1)).b(((int)(0)));
    ((moom.NW)(this.f)).a(((moom.NY)(((moom.Mj)(p1)).a__NY())));
    moom.Mk __stackOp2735_11_0 = this;
    ((moom.Mk)(__stackOp2735_11_0)).e = ((int)((((moom.Mk)(__stackOp2735_11_0)).e - life7_11)));
    if (!((life5_8 != null))) {
        break forward_join_127;
    }
    }
    forwardValue2735_45_0 = life8_17;
    }
    if (!((life5_8 == null))) {
        forwardValue2735_65_0 = forwardValue2735_45_0;
        break forward_join_65;
    }
    if (!((forwardValue2735_45_0 > life7_11))) {
        break forward_join_77;
    }
    ((moom.Mj)(p1)).a(((int)(this.d)));
    ((moom.Mj)(p1)).b(((int)(life8_17)));
    spill2735_2 = this;
    if (!((life5_8 == null))) {
        forwardValue2735_73_0 = spill2735_2;
        break forward_join_73;
    }
    moom.Mk __stackOp2735_17_0 = spill2735_2;
    ((moom.Mk)(__stackOp2735_17_0)).d = ((int)((((moom.Mk)(__stackOp2735_17_0)).d + life8_17)));
    forwardValue2735_65_0 = life6_7;
    }
    if (!((forwardValue2735_65_0 >= 0))) {
        break forward_join_72;
    }
    ((moom.NW)(this.f)).a(((moom.NY)(((moom.Mj)(p1)).a__NY())));
    }
    forwardValue2735_73_0 = this;
    }
    ((moom.NW)(((moom.Mk)(forwardValue2735_73_0)).f)).b(((moom.NY)(((moom.Mj)(p1)).a__NY())));
    }
    ((moom.Mj)(p1)).b(((int)(life8_17)));
    moom.Mk __stackOp2735_27_0 = this;
    ((moom.Mk)(__stackOp2735_27_0)).e = ((int)((((moom.Mk)(__stackOp2735_27_0)).e + (life8_17 - life7_11))));
    ((moom.Mk)(this)).b(((int)(((moom.Mj)(p1)).c())));
    life9_120 = ((moom.Mk)(this)).a(((int)(((moom.Mj)(p1)).a())));
    ((moom.Mk)(this)).b();
    net.minecraft.client.renderer.OpenGlHelper.a(((int)(net.minecraft.client.renderer.OpenGlHelper.R)), ((long)(life9_120)), ((java.nio.ByteBuffer)(p0)));
    ((moom.Mk)(this)).c();
    spill2735_3 = this;
    if (!((life5_8 == null))) {
        forwardValue2735_125_0 = spill2735_3;
        break forward_join_125;
    }
    if (!((((moom.Mk)(spill2735_3)).d > ((this.e * __sourceIntrinsic_4a6556856999_invokedynamic2735_40(31997, (5815526058078208590L ^ life3_3))) / __sourceIntrinsic_4a6556856999_invokedynamic2735_41(14883, (549635147710284949L ^ life3_3)))))) {
        break forward_join_127;
    }
    forwardValue2735_125_0 = this;
    }
    ((moom.Mk)(forwardValue2735_125_0)).a__Void(((int)(1)));
    }
    return;
}


private void a__Void(int p0) {
moom.Mk lexicalValue967_13_0;
    moom.Mj lexicalValue967_32_0;
    int lexicalValue967_35_0;
    moom.Mj lexicalValue967_48_0;
    int lexicalValue967_63_0;
    int lexicalValue967_63_1;
    int lexicalValue967_79_0;
    int lexicalValue967_79_1;
    moom.Mj lexicalValue967_135_0;
    moom.Mk spill967_0;
    moom.Mj spill967_1;
    boolean spill967_2;
    moom.Mj spill967_3;
    int spill967_4;
    int spill967_5;
    moom.Mj spill967_6;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    moom.Mj life5_20;
    int life6_53;
    moom.Mj life7_56;
    int life6_65;
    int life8_75;
    int life9_113;
    moom.Mj life10_174;
    lexical_join_164: {
    lexical_join_161: {
    lexical_join_151: {
    lexical_join_50: {
    lexical_join_48: {
    lexical_join_47: {
    lexical_join_35: {
    lexical_join_33: {
    lexical_join_32: {
    lexical_join_27: {
    lexical_join_13: {
    life2_3 = (moom.Mk.l ^ 129609568291182L);
    life4_5 = moom.Mi.b__Arrayr3();
    spill967_0 = this;
    if (!((life4_5 == null))) {
        lexicalValue967_13_0 = spill967_0;
        break lexical_join_13;
    }
    if (!((!((moom.NW)(((moom.Mk)(spill967_0)).f)).a__Boolean()))) {
        break lexical_join_164;
    }
    lexicalValue967_13_0 = this;
    }
    life5_20 = ((moom.Mk)(lexicalValue967_13_0)).g;
    spill967_1 = life5_20;
    if (!((life4_5 == null))) {
        lexicalValue967_32_0 = spill967_1;
        break lexical_join_32;
    }
    if (!((spill967_1 != null))) {
        break lexical_join_27;
    }
    spill967_2 = ((moom.NW)(this.f)).a__Boolean(((moom.NY)(((moom.Mj)(life5_20)).a__NY())));
    if (!((life4_5 == null))) {
        lexicalValue967_35_0 = ((spill967_2) ? 1 : 0);
        break lexical_join_35;
    }
    if (!((!spill967_2))) {
        break lexical_join_33;
    }
    }
    lexicalValue967_32_0 = ((moom.Mj)(((moom.NY)(((moom.NW)(this.f)).a__NY())).a()));
    }
    life5_20 = lexicalValue967_32_0;
    }
    lexicalValue967_35_0 = ((moom.Mj)(life5_20)).a();
    }
    life6_53 = lexicalValue967_35_0;
    life7_56 = ((moom.Mj)(life5_20)).a__Mj();
    spill967_3 = life7_56;
    if (!((life4_5 == null))) {
        lexicalValue967_48_0 = spill967_3;
        break lexical_join_48;
    }
    if (!((spill967_3 == null))) {
        break lexical_join_47;
    }
    life6_65 = 0;
    if (!((life4_5 != null))) {
        break lexical_join_50;
    }
    }
    lexicalValue967_48_0 = life7_56;
    }
    life6_65 = ((moom.Mj)(lexicalValue967_48_0)).c();
    }
    life8_75 = 0;
    lexical_cycle_52: while (true) {
    lexical_join_149: {
    lexical_join_135: {
    lexical_join_107: {
    lexical_join_79: {
    lexical_join_76: {
    lexical_join_63: {
    if (!((life5_20 != null))) {
        break lexical_join_151;
    }
    spill967_4 = life8_75;
    spill967_5 = p0;
    if (!((life4_5 == null))) {
        lexicalValue967_63_0 = spill967_4;
        lexicalValue967_63_1 = spill967_5;
        break lexical_join_63;
    }
    if (!((spill967_4 < spill967_5))) {
        break lexical_join_151;
    }
    life8_75 += 1;
    lexicalValue967_63_0 = ((moom.Mj)(life5_20)).a();
    lexicalValue967_63_1 = life6_65;
    }
    if (!((life4_5 == null))) {
        lexicalValue967_79_0 = lexicalValue967_63_0;
        lexicalValue967_79_1 = lexicalValue967_63_1;
        break lexical_join_79;
    }
    if (!((lexicalValue967_63_0 == lexicalValue967_63_1))) {
        break lexical_join_76;
    }
    life6_65 = (life6_65 + ((moom.Mj)(life5_20)).b());
    life5_20 = ((moom.Mj)(life5_20)).b__Mj();
    if (!((life4_5 != null))) { continue lexical_cycle_52; }
    }
    lexicalValue967_79_0 = ((moom.Mj)(life5_20)).a();
    lexicalValue967_79_1 = life6_65;
    }
    life9_113 = (lexicalValue967_79_0 - lexicalValue967_79_1);
    spill967_6 = life5_20;
    if (!((life4_5 == null))) {
        lexicalValue967_135_0 = spill967_6;
        break lexical_join_135;
    }
    if (!((((moom.Mj)(spill967_6)).b() <= life9_113))) {
        break lexical_join_107;
    }
    ((moom.Mk)(this)).a(((int)(((moom.Mj)(life5_20)).a())), ((int)(life6_65)), ((int)(((moom.Mj)(life5_20)).b())));
    ((moom.Mj)(life5_20)).a(((int)(life6_65)));
    life6_65 = (life6_65 + ((moom.Mj)(life5_20)).b());
    life5_20 = ((moom.Mj)(life5_20)).b__Mj();
    if (!((life4_5 != null))) {
        break lexical_join_149;
    }
    }
    ((moom.Mk)(this)).b(((int)((this.d + ((moom.Mj)(life5_20)).b()))));
    ((moom.Mk)(this)).a(((int)(((moom.Mj)(life5_20)).a())), ((int)(this.d)), ((int)(((moom.Mj)(life5_20)).b())));
    ((moom.Mj)(life5_20)).a(((int)(this.d)));
    moom.Mk __stackOp967_36_0 = this;
    ((moom.Mk)(__stackOp967_36_0)).d = ((int)((((moom.Mk)(__stackOp967_36_0)).d + ((moom.Mj)(life5_20)).b())));
    lexicalValue967_135_0 = ((moom.Mj)(life5_20)).b__Mj();
    }
    life10_174 = lexicalValue967_135_0;
    ((moom.NW)(this.f)).a(((moom.NY)(((moom.Mj)(life5_20)).a__NY())));
    ((moom.NW)(this.f)).b(((moom.NY)(((moom.Mj)(life5_20)).a__NY())));
    life5_20 = life10_174;
    }
    if (!((life4_5 != null))) { continue lexical_cycle_52; }
    break lexical_cycle_52;
    }
    }
    if (!((life5_20 == null))) {
        break lexical_join_161;
    }
    this.d = ((int)(((moom.Mj)(((moom.Mj)(((moom.NY)(((moom.NW)(this.f)).b())).a())))).c()));
    }
    this.g = ((moom.Mj)(life5_20));
    }
    return;
}


private int a(long p0) {
return ((int) (p0 / ((long) this.k)));
}


public void a(moom.kT p0) {
moom.Mk forwardValue2736_59_0;
    net.minecraft.entity.Entity[] spill2736_0;
    moom.Mk spill2736_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_9;
    forward_join_61: {
    forward_join_59: {
    life2_3 = (moom.Mk.l ^ 15372688945776L);
    spill2736_0 = moom.Mi.b__Arrayr3();
    ((moom.Mk)(this)).b();
    ((moom.kT)(p0)).a();
    life4_9 = spill2736_0;
    ((java.nio.IntBuffer)(this.h)).flip();
    ((java.nio.IntBuffer)(this.i)).flip();
    moom.kZ.a(((int)(this.j)), ((java.nio.IntBuffer)(this.h)), ((java.nio.IntBuffer)(this.i)));
    ((java.nio.IntBuffer)(this.h)).limit(((int)(((java.nio.IntBuffer)(this.h)).capacity())));
    ((java.nio.IntBuffer)(this.i)).limit(((int)(((java.nio.IntBuffer)(this.i)).capacity())));
    spill2736_1 = this;
    if (!((life4_9 == null))) {
        forwardValue2736_59_0 = spill2736_1;
        break forward_join_59;
    }
    if (!((((moom.Mk)(spill2736_1)).d > ((this.e * __sourceIntrinsic_7c5973217eb2_invokedynamic2736_22(7328, (7416330924764140819L ^ life2_3))) / __sourceIntrinsic_7c5973217eb2_invokedynamic2736_23(24811, (5698713028106676572L ^ life2_3)))))) {
        break forward_join_61;
    }
    forwardValue2736_59_0 = this;
    }
    ((moom.Mk)(forwardValue2736_59_0)).a__Void(((int)(1)));
    }
    return;
}


public void a(int p0, moom.Mj p1) { __sourceHandlerCall_0443015c70b15b5311f3(this, p0, p1); }


private void a(int p0, int p1, int p2) {
long local4 = (moom.Mk.l ^ 46873988580832L);
    long local6 = ((moom.Mk)(this)).a(((int)(p0)));
    long local8 = ((moom.Mk)(this)).a(((int)(p1)));
    long local10 = ((moom.Mk)(this)).a(((int)(p2)));
    net.minecraft.client.renderer.OpenGlHelper.c(((int)(net.minecraft.client.renderer.OpenGlHelper.X)), ((int)(this.b)));
    net.minecraft.client.renderer.OpenGlHelper.c(((int)(net.minecraft.client.renderer.OpenGlHelper.Y)), ((int)(this.b)));
    net.minecraft.client.renderer.OpenGlHelper.a(((int)(net.minecraft.client.renderer.OpenGlHelper.X)), ((int)(net.minecraft.client.renderer.OpenGlHelper.Y)), ((long)(local6)), ((long)(local8)), ((long)(local10)));
    moom.BU.f(((java.lang.String)(__sourceIntrinsic_e4d4f5a69301_originalDynamicSite1324_13(2889, (6347510355264641615L ^ local4)))));
    net.minecraft.client.renderer.OpenGlHelper.c(((int)(net.minecraft.client.renderer.OpenGlHelper.X)), ((int)(0)));
    net.minecraft.client.renderer.OpenGlHelper.c(((int)(net.minecraft.client.renderer.OpenGlHelper.Y)), ((int)(0)));
    return;
}


public int a() {
return this.d;
}


private void a__Void() { __sourceHandlerCall_27087636f2d026ab9764(this); }


private static java.lang.RuntimeException a(java.lang.RuntimeException p0) {
return p0;
}


private static native <E extends Throwable> int __sourceIntrinsic_3029c5d127db916f_originalDynamicSite2450_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3029c5d127db916f_originalDynamicSite2450_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e4d4f5a69301_originalDynamicSite1324_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2dec0ad99203_invokedynamic362_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6429_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4a6556856999_invokedynamic2735_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4a6556856999_invokedynamic2735_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7c5973217eb2_invokedynamic2736_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7c5973217eb2_invokedynamic2736_23(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic363_18(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral6425_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_15c946d67bc3_invokedynamic968_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_15c946d67bc3_invokedynamic968_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_15c946d67bc3_invokedynamic968_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_15c946d67bc3_invokedynamic968_26(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_15c946d67bc3_invokedynamic968_29(java.lang.String a0, long a1) throws E;
}
