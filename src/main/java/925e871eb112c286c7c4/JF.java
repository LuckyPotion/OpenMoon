package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class JF {

private static moom.JG a;

private static java.util.Map<java.lang.Class, java.lang.Integer> b;

private static java.util.Map<net.minecraft.item.Item, java.lang.Integer> c;

private static long d;

private static boolean e;

private static long f;

private static java.lang.String[] g;

private static java.lang.String[] h;

private static java.util.Map i;

private static long[] j;

private static java.lang.Integer[] k;

private static java.util.Map l;

private static long m;

public JF() {
super();
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(-1044552431941095739L)), ((long)(1079562823900850225L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(41831416555619L)))));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    long local16_life7 = (moom.JF.f ^ 45777909523916L);
    javax.crypto.Cipher local18_life9;
    javax.crypto.Cipher __sourceSpill594_11 = (local18_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill594_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill594_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill594_14 = new byte[8];
    (__sourceSpill594_14)[0] = ((byte) ((int) (local16_life7 >>> 56)));
    int local19_life15 = 1;
    while ((local19_life15 < 8)) {
        (__sourceSpill594_14)[local19_life15] = ((byte) ((int) ((local16_life7 << (local19_life15 * 8)) >>> 56)));
        local19_life15 += 1;
    }
    byte[] __sourcePreallocation594_16 = __sourceSpill594_14;
    ((javax.crypto.Cipher)(__sourceSpill594_11)).init(((int)(__sourceSpill594_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill594_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation594_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local25_life19 = new java.lang.String[11];
    int local23_life20 = 0;
    java.lang.String local22_life21;
    int local24_life23 = ((java.lang.String)((local22_life21 = "¯Q.\001âz´T}t±ÃALKSè\0051îtÎÊye^bq\030»â)\032nÓ¹vÝúI\026¯¨ØXu(ø³\030Á\031ÊbÓ  nz\034Ý>õWIGpïµ8íïáÁÜ»EM83185\020Õ;­0µñúüo¯È\017¯í;'\0038õ:|7=`ÿK³îRÅ\t~¾¾ª\n\033Â´õ­=\\°; }(x°ø,ñ\\ï<8+D\004Nõ=ÎÓ|¢BØV¥ÝA\"óï÷ap°0ÃÈBF\017(f+úå\"åj(RÍ\"ç)g0cÐ³\bDÄí`TB\030Ré\001\\Ù\016ÆÙ±D Þ=ãÛê{ðL8pÎ\023ù.¤³/ÍIg¨³ú¼·\020ñãW¾<\016\"¤&>DÙ×0=ô\022IÍ\031Ãÿ\036í_·É\r\030ôñR\tëÙBÁM÷\006¹§þ5£ÙÆÁo|\017\" ·w"))).length();
    int local21_life24 = 32;
    int local20_life25 = -1;
    while (true) {
        local20_life25 += 1;
        byte[] __sourceSpill594_28 = ((java.lang.String)(((java.lang.String)(local22_life21)).substring(((int)(local20_life25)), ((int)((local20_life25 + local21_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill594_29 = local18_life9;
        byte[] local26_life31 = ((javax.crypto.Cipher)(__sourceSpill594_29)).doFinal(((byte[])(__sourceSpill594_28)));
        java.lang.String __sourceSpill594_34 = ((java.lang.String)(moom.JF.a(((byte[])(local26_life31))))).intern();
        java.lang.String[] __sourceSpill594_35 = local25_life19;
        int __sourceSpill594_36 = local23_life20;
        local23_life20 += 1;
        (__sourceSpill594_35)[__sourceSpill594_36] = __sourceSpill594_34;
        if (!(((local20_life25 = (local20_life25 + local21_life24)) < local24_life23))) { break; }
        local21_life24 = ((java.lang.String)(local22_life21)).charAt(((int)(local20_life25)));
    }
    local24_life23 = ((java.lang.String)((local22_life21 = "i\034k\020ÜØ\016­§m\017Ú>íu«±\002÷·~Öás5¼`<:E5 »®î\035â:5\013²\032²ÉþZ\034¢[Å\020ø\r\nÃuLý$\020>¨·9FÊ"))).length();
    local21_life24 = 56;
    local20_life25 = -1;
    while (true) {
        local20_life25 += 1;
        byte[] __sourceSpill594_41 = ((java.lang.String)(((java.lang.String)(local22_life21)).substring(((int)(local20_life25)), ((int)((local20_life25 + local21_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill594_42 = local18_life9;
        byte[] local26_life44 = ((javax.crypto.Cipher)(__sourceSpill594_42)).doFinal(((byte[])(__sourceSpill594_41)));
        java.lang.String __sourceSpill594_47 = ((java.lang.String)(moom.JF.a(((byte[])(local26_life44))))).intern();
        java.lang.String[] __sourceSpill594_48 = local25_life19;
        int __sourceSpill594_49 = local23_life20;
        local23_life20 += 1;
        (__sourceSpill594_48)[__sourceSpill594_49] = __sourceSpill594_47;
        if (!(((local20_life25 = (local20_life25 + local21_life24)) < local24_life23))) { break; }
        local21_life24 = ((java.lang.String)(local22_life21)).charAt(((int)(local20_life25)));
    }
    g = ((java.lang.String[])(local25_life19));
    h = ((java.lang.String[])(new java.lang.String[11]));
    l = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local5_life55;
    javax.crypto.Cipher __sourceSpill594_57 = (local5_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill594_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill594_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill594_60 = new byte[8];
    (__sourceSpill594_60)[0] = ((byte) ((int) (local16_life7 >>> 56)));
    int local6_life61 = 1;
    while ((local6_life61 < 8)) {
        (__sourceSpill594_60)[local6_life61] = ((byte) ((int) ((local16_life7 << (local6_life61 * 8)) >>> 56)));
        local6_life61 += 1;
    }
    byte[] __sourcePreallocation594_62 = __sourceSpill594_60;
    ((javax.crypto.Cipher)(__sourceSpill594_57)).init(((int)(__sourceSpill594_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill594_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation594_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local11_life65 = new long[9];
    int local8_life66 = 0;
    java.lang.String local9_life67;
    int local10_life69 = ((java.lang.String)((local9_life67 = "\005Éö½¹Ö\001Ñì\rß\020¨Q^µ¤bJ¶6ú*9ãßCõ7M¹\fËf8Éº«Ä$jðUÕÕÐ»ô/VO"))).length();
    int local7_life70 = 0;
    do {
        java.lang.String __sourceSpill594_71 = local9_life67;
        int __sourceSpill594_72 = local7_life70;
        local7_life70 += 8;
        byte[] local12_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill594_71)).substring(((int)(__sourceSpill594_72)), ((int)(local7_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill594_76 = local11_life65;
        int __sourceSpill594_77 = local8_life66;
        local8_life66 += 1;
        long local13_life78 = (((((((((((long) (local12_life75)[0]) & 255L) << 56) | ((((long) (local12_life75)[1]) & 255L) << 48)) | ((((long) (local12_life75)[2]) & 255L) << 40)) | ((((long) (local12_life75)[3]) & 255L) << 32)) | ((((long) (local12_life75)[4]) & 255L) << 24)) | ((((long) (local12_life75)[5]) & 255L) << 16)) | ((((long) (local12_life75)[6]) & 255L) << 8)) | (((long) (local12_life75)[7]) & 255L));
        byte[] __sourceSpill594_79 = new byte[8];
        (__sourceSpill594_79)[0] = ((byte) ((int) (local13_life78 >>> 56)));
        (__sourceSpill594_79)[1] = ((byte) ((int) (local13_life78 >>> 48)));
        (__sourceSpill594_79)[2] = ((byte) ((int) (local13_life78 >>> 40)));
        (__sourceSpill594_79)[3] = ((byte) ((int) (local13_life78 >>> 32)));
        (__sourceSpill594_79)[4] = ((byte) ((int) (local13_life78 >>> 24)));
        (__sourceSpill594_79)[5] = ((byte) ((int) (local13_life78 >>> 16)));
        (__sourceSpill594_79)[6] = ((byte) ((int) (local13_life78 >>> 8)));
        (__sourceSpill594_79)[7] = ((byte) ((int) local13_life78));
        javax.crypto.Cipher __sourceSpill594_80 = local5_life55;
        byte[] local15_life82 = ((javax.crypto.Cipher)(__sourceSpill594_80)).doFinal(((byte[])(__sourceSpill594_79)));
        (__sourceSpill594_76)[__sourceSpill594_77] = (((((((((((long) (local15_life82)[0]) & 255L) << 56) | ((((long) (local15_life82)[1]) & 255L) << 48)) | ((((long) (local15_life82)[2]) & 255L) << 40)) | ((((long) (local15_life82)[3]) & 255L) << 32)) | ((((long) (local15_life82)[4]) & 255L) << 24)) | ((((long) (local15_life82)[5]) & 255L) << 16)) | ((((long) (local15_life82)[6]) & 255L) << 8)) | (((long) (local15_life82)[7]) & 255L));
    } while ((!(local7_life70 >= local10_life69)));
    local10_life69 = ((java.lang.String)((local9_life67 = "A¯a×Ùå\036µÐ½ÅûaÓ£"))).length();
    local7_life70 = 0;
    do {
        java.lang.String __sourceSpill594_84 = local9_life67;
        int __sourceSpill594_85 = local7_life70;
        local7_life70 += 8;
        byte[] local12_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill594_84)).substring(((int)(__sourceSpill594_85)), ((int)(local7_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill594_89 = local11_life65;
        int __sourceSpill594_90 = local8_life66;
        local8_life66 += 1;
        long local13_life91 = (((((((((((long) (local12_life88)[0]) & 255L) << 56) | ((((long) (local12_life88)[1]) & 255L) << 48)) | ((((long) (local12_life88)[2]) & 255L) << 40)) | ((((long) (local12_life88)[3]) & 255L) << 32)) | ((((long) (local12_life88)[4]) & 255L) << 24)) | ((((long) (local12_life88)[5]) & 255L) << 16)) | ((((long) (local12_life88)[6]) & 255L) << 8)) | (((long) (local12_life88)[7]) & 255L));
        byte[] __sourceSpill594_92 = new byte[8];
        (__sourceSpill594_92)[0] = ((byte) ((int) (local13_life91 >>> 56)));
        (__sourceSpill594_92)[1] = ((byte) ((int) (local13_life91 >>> 48)));
        (__sourceSpill594_92)[2] = ((byte) ((int) (local13_life91 >>> 40)));
        (__sourceSpill594_92)[3] = ((byte) ((int) (local13_life91 >>> 32)));
        (__sourceSpill594_92)[4] = ((byte) ((int) (local13_life91 >>> 24)));
        (__sourceSpill594_92)[5] = ((byte) ((int) (local13_life91 >>> 16)));
        (__sourceSpill594_92)[6] = ((byte) ((int) (local13_life91 >>> 8)));
        (__sourceSpill594_92)[7] = ((byte) ((int) local13_life91));
        javax.crypto.Cipher __sourceSpill594_93 = local5_life55;
        byte[] local15_life95 = ((javax.crypto.Cipher)(__sourceSpill594_93)).doFinal(((byte[])(__sourceSpill594_92)));
        (__sourceSpill594_89)[__sourceSpill594_90] = (((((((((((long) (local15_life95)[0]) & 255L) << 56) | ((((long) (local15_life95)[1]) & 255L) << 48)) | ((((long) (local15_life95)[2]) & 255L) << 40)) | ((((long) (local15_life95)[3]) & 255L) << 32)) | ((((long) (local15_life95)[4]) & 255L) << 24)) | ((((long) (local15_life95)[5]) & 255L) << 16)) | ((((long) (local15_life95)[6]) & 255L) << 8)) | (((long) (local15_life95)[7]) & 255L));
    } while ((!(local7_life70 >= local10_life69)));
    j = ((long[])(local11_life65));
    k = ((java.lang.Integer[])(new java.lang.Integer[9]));
    javax.crypto.Cipher local0_life99;
    javax.crypto.Cipher __sourceSpill594_101 = (local0_life99 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill594_102 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill594_103 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill594_104 = new byte[8];
    (__sourceSpill594_104)[0] = ((byte) ((int) (local16_life7 >>> 56)));
    int local1_life105 = 1;
    while ((local1_life105 < 8)) {
        (__sourceSpill594_104)[local1_life105] = ((byte) ((int) ((local16_life7 << (local1_life105 * 8)) >>> 56)));
        local1_life105 += 1;
    }
    byte[] __sourcePreallocation594_106 = __sourceSpill594_104;
    ((javax.crypto.Cipher)(__sourceSpill594_101)).init(((int)(__sourceSpill594_102)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill594_103)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation594_106)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life109 = 4541551564604539648L;
    byte[] __sourceSpill594_110 = new byte[8];
    (__sourceSpill594_110)[0] = ((byte) ((int) (local2_life109 >>> 56)));
    (__sourceSpill594_110)[1] = ((byte) ((int) (local2_life109 >>> 48)));
    (__sourceSpill594_110)[2] = ((byte) ((int) (local2_life109 >>> 40)));
    (__sourceSpill594_110)[3] = ((byte) ((int) (local2_life109 >>> 32)));
    (__sourceSpill594_110)[4] = ((byte) ((int) (local2_life109 >>> 24)));
    (__sourceSpill594_110)[5] = ((byte) ((int) (local2_life109 >>> 16)));
    (__sourceSpill594_110)[6] = ((byte) ((int) (local2_life109 >>> 8)));
    (__sourceSpill594_110)[7] = ((byte) ((int) local2_life109));
    javax.crypto.Cipher __sourceSpill594_111 = local0_life99;
    byte[] local4_life113 = ((javax.crypto.Cipher)(__sourceSpill594_111)).doFinal(((byte[])(__sourceSpill594_110)));
    m = ((long)((((((((((((long) (local4_life113)[0]) & 255L) << 56) | ((((long) (local4_life113)[1]) & 255L) << 48)) | ((((long) (local4_life113)[2]) & 255L) << 40)) | ((((long) (local4_life113)[3]) & 255L) << 32)) | ((((long) (local4_life113)[4]) & 255L) << 24)) | ((((long) (local4_life113)[5]) & 255L) << 16)) | ((((long) (local4_life113)[6]) & 255L) << 8)) | (((long) (local4_life113)[7]) & 255L))));
    a = ((moom.JG)(new moom.JG()));
    b = ((java.util.Map)(new java.util.HashMap()));
    c = ((java.util.Map)(new java.util.HashMap()));
    d = ((long)(0L));
}

private static native <E extends Throwable> int __sourceHandlerCall_005bd121c2239d223748() throws E;
private static final class __SourceHandler_005bd121c2239d223748 {

public static int f288() throws Throwable {
    int spill288_0;
    moom.JG life0_2;
    __monitorEnter288_1((life0_2 = __fieldRead288_0()));
    spill288_0 = __call288_3(__fieldRead288_2());
    __monitorExit288_4(life0_2);
    return spill288_0;
}
public static int h288_0(java.lang.Throwable p0, moom.JG p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __monitorExit3028800_0(p1);
    throw life2_2;
}
private static native moom.JG __fieldRead288_0() throws Throwable;
private static native void __monitorEnter288_1(moom.JG a0) throws Throwable;
private static native moom.JG __fieldRead288_2() throws Throwable;
private static native int __call288_3(moom.JG a0) throws Throwable;
private static native void __monitorExit288_4(moom.JG a0) throws Throwable;
private static native void __monitorExit3028800_0(moom.JG a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_703facceb817e57c1bf4(java.io.InputStream a0, java.lang.String a1, java.lang.String a2) throws E;
private static final class __SourceHandler_703facceb817e57c1bf4 {

public static void f121(java.io.InputStream p0, java.lang.String p1, java.lang.String p2) throws Throwable {
    long life3_3;
    moom.OH life5_9;
    moom.J3 life6_32;
    life3_3 = (__fieldRead121_0() ^ 110329901617242L);
    if ((p0 != null)) {
        life5_9 = new moom.OH();
        __call121_1(life5_9, p0);
        __call121_2(p0);
        java.lang.String __stackOp121_4_0 = p1;
        java.lang.String __stackOp121_4_1 = __invokedynamic121_3(27771, (3879334422835662260L ^ life3_3));
        __call121_6(__invokedynamic121_5(__stackOp121_4_1, __stackOp121_4_0));
        life6_32 = new moom.J3(__invokedynamic121_7(16975, (7996572470564987784L ^ life3_3)));
        __call121_11(__call121_9(life5_9, __invokedynamic121_8(22125, (1032241396295808939L ^ life3_3))), __fieldRead121_10(), new moom.J4(), life6_32, p1, p2);
        __call121_15(__call121_13(life5_9, __invokedynamic121_12(16481, (3204780447914631596L ^ life3_3))), __fieldRead121_14(), new moom.J9(), life6_32, p1, p2);
    }
    return;
}
public static void h121_0(java.io.IOException p0, java.lang.String p1, long p2) throws Throwable {
    java.io.IOException local4 = p0;
    java.lang.String __stackOp2012100_1_0 = p1;
    java.lang.String __stackOp2012100_1_1 = __invokedynamic2012100_0(25719, (5920064793693619641L ^ p2));
    __call2012100_3(__invokedynamic2012100_2(__stackOp2012100_1_1, __stackOp2012100_1_0));
    return;
}
private static native long __fieldRead121_0() throws Throwable;
private static native void __call121_1(moom.OH a0, java.io.InputStream a1) throws Throwable;
private static native void __call121_2(java.io.InputStream a0) throws Throwable;
private static native java.lang.String __invokedynamic121_3(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic121_5(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call121_6(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic121_7(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic121_8(int a0, long a1) throws Throwable;
private static native java.lang.String __call121_9(moom.OH a0, java.lang.String a1) throws Throwable;
private static native java.util.Map __fieldRead121_10() throws Throwable;
private static native void __call121_11(java.lang.String a0, java.util.Map a1, moom.J4 a2, moom.J3 a3, java.lang.String a4, java.lang.String a5) throws Throwable;
private static native java.lang.String __invokedynamic121_12(int a0, long a1) throws Throwable;
private static native java.lang.String __call121_13(moom.OH a0, java.lang.String a1) throws Throwable;
private static native java.util.Map __fieldRead121_14() throws Throwable;
private static native void __call121_15(java.lang.String a0, java.util.Map a1, moom.J9 a2, moom.J3 a3, java.lang.String a4, java.lang.String a5) throws Throwable;
private static native java.lang.String __invokedynamic2012100_0(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic2012100_2(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call2012100_3(java.lang.String a0) throws Throwable;

}

private static native <E extends Throwable> double __sourceHandlerCall_ff63378a4e363d4540c5(moom.DT a0) throws E;
private static final class __SourceHandler_ff63378a4e363d4540c5 {

public static double f289(moom.DT p0) throws Throwable {
    int forestValue289_103_0;
    double forestValue289_106_0;
    double forestValue289_125_0;
    net.minecraft.entity.Entity[] spill289_0;
    boolean spill289_1;
    boolean spill289_2;
    double spill289_3;
    double spill289_4;
    long life1_3;
    double life4_5;
    moom.JG life6_9;
    net.minecraft.entity.Entity[] life3_11;
    java.util.List life7_14;
    int life8_17;
    java.util.Iterator life9_20;
    moom.JE life10_27;
    int life11_30;
    double life12_38;
    double life14_41;
    double life16_44;
    double life18_50;
    double life20_56;
    double life22_62;
    double life24_74;
    double life26_112;
    double life28_118;
    double life30_123;
    forest_join_130: {
    forest_join_128: {
    life1_3 = (__fieldRead289_0() ^ 37630200344755L);
    life4_5 = 0x0.0p0d;
    spill289_0 = __call289_1();
    __monitorEnter289_3((life6_9 = __fieldRead289_2()));
    life3_11 = spill289_0;
    life7_14 = __call289_5(__fieldRead289_4());
    life8_17 = __call289_6(life7_14);
    life9_20 = __call289_7(life7_14);
    forest_cycle_21: while (true) {
    forest_join_126: {
    forest_join_125: {
    forest_join_106: {
    forest_join_103: {
    forest_join_98: {
    if (!(__call289_8(life9_20))) {
        break forest_join_128;
    }
    life10_27 = __cast289_10(__call289_9(life9_20));
    life11_30 = __call289_11(life10_27);
    if (!((life3_11 != null))) {
        break forest_join_130;
    }
    if (!((life11_30 > 0))) {
        break forest_join_126;
    }
    life12_38 = __call289_12(life10_27);
    life14_41 = __call289_13(life10_27);
    life16_44 = __call289_14(life10_27);
    life18_50 = (((double) __call289_15(p0)) - life12_38);
    life20_56 = (((double) __call289_16(p0)) - life14_41);
    life22_62 = (((double) __call289_17(p0)) - life16_44);
    life24_74 = (((life18_50 * life18_50) + (life20_56 * life20_56)) + (life22_62 * life22_62));
    spill289_1 = __call289_18(life10_27);
    if (!((life3_11 != null))) {
        forestValue289_103_0 = __integerCategory289_19(spill289_1);
        break forest_join_103;
    }
    if (!(spill289_1)) {
        break forest_join_98;
    }
    spill289_2 = __call289_20();
    if (!((life3_11 != null))) {
        forestValue289_103_0 = __integerCategory289_21(spill289_2);
        break forest_join_103;
    }
    if (!((!spill289_2))) {
        break forest_join_98;
    }
    life11_30 = __call289_23((life11_30 - 2), 0, __invokedynamic289_22(20397, (3642956443683221517L ^ life1_3)));
    life24_74 = (life24_74 * 0x1.0p1d);
    }
    spill289_3 = life24_74;
    if (!((life3_11 != null))) {
        forestValue289_106_0 = spill289_3;
        break forest_join_106;
    }
    forestValue289_103_0 = __numericCompare289_24(spill289_3, 0x1.c2p5d);
    }
    if (!((forestValue289_103_0 <= 0))) {
        break forest_join_126;
    }
    forestValue289_106_0 = __call289_25(life24_74);
    }
    life26_112 = forestValue289_106_0;
    life28_118 = (0x1.0p0d - (life26_112 / 0x1.ep2d));
    life30_123 = (life28_118 * ((double) life11_30));
    spill289_4 = life30_123;
    if (!((life3_11 != null))) {
        forestValue289_125_0 = spill289_4;
        break forest_join_125;
    }
    if (!((__numericCompare289_26(spill289_4, life4_5) > 0))) {
        break forest_join_126;
    }
    forestValue289_125_0 = life30_123;
    }
    life4_5 = forestValue289_125_0;
    }
    if (!((life3_11 == null))) {
        continue forest_cycle_21;
    }
    break forest_cycle_21;
    }
    }
    __monitorExit289_27(life6_9);
    }
    return __call289_28(life4_5, 0x0.0p0d, 0x1.ep3d);
}
public static double h289_0(moom.Oo p0) throws Throwable {
    throw __call3028900_0(p0);
}
public static double h289_1(moom.Oo p0) throws Throwable {
    throw __call3028901_0(p0);
}
public static double h289_2(moom.Oo p0) throws Throwable {
    throw __call3028902_0(p0);
}
public static double h289_3(moom.Oo p0) throws Throwable {
    throw __call3028903_0(p0);
}
public static double h289_4(moom.Oo p0) throws Throwable {
    throw __call3028904_0(p0);
}
public static double h289_5(moom.Oo p0) throws Throwable {
    throw __call3028905_0(p0);
}
public static double h289_6(moom.Oo p0) throws Throwable {
    throw __call3028906_0(p0);
}
public static double h289_7(moom.Oo p0) throws Throwable {
    throw __call3028907_0(p0);
}
public static double h289_8(java.lang.Throwable p0, moom.JG p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __monitorExit3028908_0(p1);
    throw life2_2;
}
private static native long __fieldRead289_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call289_1() throws Throwable;
private static native moom.JG __fieldRead289_2() throws Throwable;
private static native void __monitorEnter289_3(moom.JG a0) throws Throwable;
private static native moom.JG __fieldRead289_4() throws Throwable;
private static native java.util.List __call289_5(moom.JG a0) throws Throwable;
private static native int __call289_6(java.util.List a0) throws Throwable;
private static native java.util.Iterator __call289_7(java.util.List a0) throws Throwable;
private static native boolean __call289_8(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call289_9(java.util.Iterator a0) throws Throwable;
private static native moom.JE __cast289_10(java.lang.Object a0) throws Throwable;
private static native int __call289_11(moom.JE a0) throws Throwable;
private static native double __call289_12(moom.JE a0) throws Throwable;
private static native double __call289_13(moom.JE a0) throws Throwable;
private static native double __call289_14(moom.JE a0) throws Throwable;
private static native int __call289_15(moom.DT a0) throws Throwable;
private static native int __call289_16(moom.DT a0) throws Throwable;
private static native int __call289_17(moom.DT a0) throws Throwable;
private static native boolean __call289_18(moom.JE a0) throws Throwable;
private static native int __integerCategory289_19(boolean value) throws Throwable;
private static native boolean __call289_20() throws Throwable;
private static native int __integerCategory289_21(boolean value) throws Throwable;
private static native int __invokedynamic289_22(int a0, long a1) throws Throwable;
private static native int __call289_23(int a0, int a1, int a2) throws Throwable;
private static native int __numericCompare289_24(double a0, double a1) throws Throwable;
private static native double __call289_25(double a0) throws Throwable;
private static native int __numericCompare289_26(double a0, double a1) throws Throwable;
private static native void __monitorExit289_27(moom.JG a0) throws Throwable;
private static native double __call289_28(double a0, double a1, double a2) throws Throwable;
private static native moom.Oo __call3028900_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call3028901_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call3028902_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call3028903_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call3028904_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call3028905_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call3028906_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call3028907_0(moom.Oo a0) throws Throwable;
private static native void __monitorExit3028908_0(moom.JG a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_278328068469e1346f41(net.minecraft.client.renderer.RenderGlobal a0) throws E;
private static final class __SourceHandler_278328068469e1346f41 {

public static void f290(net.minecraft.client.renderer.RenderGlobal p0) throws Throwable {
    int forestValue290_19_0;
    moom.JG forestValue290_53_0;
    net.minecraft.entity.Entity[] spill290_0;
    int spill290_1;
    moom.JG spill290_2;
    long life1_3;
    long life4_6;
    net.minecraft.entity.Entity[] life3_7;
    moom.JG life6_25;
    java.util.List life7_36;
    java.util.Iterator life8_39;
    moom.JE life9_46;
    forest_join_54: {
    forest_join_53: {
    forest_join_52: {
    forest_join_21: {
    forest_join_19: {
    life1_3 = (__fieldRead290_0() ^ 101656297848849L);
    spill290_0 = __call290_1();
    life4_6 = __call290_2();
    life3_7 = spill290_0;
    spill290_1 = __numericCompare290_5(life4_6, (__fieldRead290_3() + __fieldRead290_4()));
    if (!((life3_7 != null))) {
        forestValue290_19_0 = spill290_1;
        break forest_join_19;
    }
    if (!((spill290_1 >= 0))) {
        break forest_join_54;
    }
    __fieldWrite290_6(life4_6);
    forestValue290_19_0 = __integerCategory290_8(__fieldRead290_7());
    }
    if (!((forestValue290_19_0 == 0))) {
        break forest_join_21;
    }
    __call290_9();
    }
    __monitorEnter290_11((life6_25 = __fieldRead290_10()));
    __call290_12(p0);
    spill290_2 = __fieldRead290_13();
    if (!((life3_7 != null))) {
        forestValue290_53_0 = spill290_2;
        break forest_join_53;
    }
    if (!((__call290_14(spill290_2) > 0))) {
        break forest_join_52;
    }
    life7_36 = __call290_16(__fieldRead290_15());
    life8_39 = __call290_17(life7_36);
    forest_cycle_38: while (true) {
    if (!(__call290_18(life8_39))) {
        break forest_join_52;
    }
    life9_46 = __cast290_20(__call290_19(life8_39));
    __call290_21(life9_46, p0);
    if (!((life3_7 != null))) {
        break forest_join_54;
    }
    if (!((life3_7 == null))) {
        continue forest_cycle_38;
    }
    break forest_cycle_38;
    }
    }
    forestValue290_53_0 = life6_25;
    }
    __monitorExit290_22(forestValue290_53_0);
    }
    return;
}
public static void h290_0(moom.Oo p0) throws Throwable {
    throw __call3029000_0(p0);
}
public static void h290_1(moom.Oo p0) throws Throwable {
    throw __call3029001_0(p0);
}
public static void h290_2(moom.Oo p0) throws Throwable {
    throw __call3029002_0(p0);
}
public static void h290_3(java.lang.Throwable p0, moom.JG p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __monitorExit3029003_0(p1);
    throw life2_2;
}
private static native long __fieldRead290_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call290_1() throws Throwable;
private static native long __call290_2() throws Throwable;
private static native long __fieldRead290_3() throws Throwable;
private static native long __fieldRead290_4() throws Throwable;
private static native int __numericCompare290_5(long a0, long a1) throws Throwable;
private static native void __fieldWrite290_6(long a0) throws Throwable;
private static native boolean __fieldRead290_7() throws Throwable;
private static native int __integerCategory290_8(boolean value) throws Throwable;
private static native void __call290_9() throws Throwable;
private static native moom.JG __fieldRead290_10() throws Throwable;
private static native void __monitorEnter290_11(moom.JG a0) throws Throwable;
private static native void __call290_12(net.minecraft.client.renderer.RenderGlobal a0) throws Throwable;
private static native moom.JG __fieldRead290_13() throws Throwable;
private static native int __call290_14(moom.JG a0) throws Throwable;
private static native moom.JG __fieldRead290_15() throws Throwable;
private static native java.util.List __call290_16(moom.JG a0) throws Throwable;
private static native java.util.Iterator __call290_17(java.util.List a0) throws Throwable;
private static native boolean __call290_18(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call290_19(java.util.Iterator a0) throws Throwable;
private static native moom.JE __cast290_20(java.lang.Object a0) throws Throwable;
private static native void __call290_21(moom.JE a0, net.minecraft.client.renderer.RenderGlobal a1) throws Throwable;
private static native void __monitorExit290_22(moom.JG a0) throws Throwable;
private static native moom.Oo __call3029000_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call3029001_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call3029002_0(moom.Oo a0) throws Throwable;
private static native void __monitorExit3029003_0(moom.JG a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_aed2b5992544d2ac1749() throws E;
private static final class __SourceHandler_aed2b5992544d2ac1749 {

public static void f291() throws Throwable {
    moom.JG life0_2;
    __monitorEnter291_1((life0_2 = __fieldRead291_0()));
    __call291_3(__fieldRead291_2());
    __monitorExit291_4(life0_2);
    return;
}
public static void h291_0(java.lang.Throwable p0, moom.JG p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __monitorExit3029100_0(p1);
    throw life2_2;
}
private static native moom.JG __fieldRead291_0() throws Throwable;
private static native void __monitorEnter291_1(moom.JG a0) throws Throwable;
private static native moom.JG __fieldRead291_2() throws Throwable;
private static native void __call291_3(moom.JG a0) throws Throwable;
private static native void __monitorExit291_4(moom.JG a0) throws Throwable;
private static native void __monitorExit3029100_0(moom.JG a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_3ca009be7a42a6ad3a98(net.minecraft.entity.Entity a0, net.minecraft.client.renderer.RenderGlobal a1) throws E;
private static final class __SourceHandler_3ca009be7a42a6ad3a98 {

public static void f292(net.minecraft.entity.Entity p0, net.minecraft.client.renderer.RenderGlobal p1) throws Throwable {
    net.minecraft.entity.Entity[] spill292_0;
    long life2_3;
    moom.JG life5_7;
    net.minecraft.entity.Entity[] life4_9;
    moom.JE life6_14;
    forest_join_24: {
    forest_join_22: {
    life2_3 = (__fieldRead292_0() ^ 116819397148228L);
    spill292_0 = __call292_1();
    __monitorEnter292_3((life5_7 = __fieldRead292_2()));
    life4_9 = spill292_0;
    life6_14 = __call292_6(__fieldRead292_4(), __call292_5(p0));
    if (!((life4_9 != null))) {
        break forest_join_24;
    }
    if (!((life6_14 != null))) {
        break forest_join_22;
    }
    __call292_7(life6_14, p1);
    }
    __monitorExit292_8(life5_7);
    }
    return;
}
public static void h292_0(moom.Oo p0) throws Throwable {
    throw __call3029200_0(p0);
}
public static void h292_1(moom.Oo p0) throws Throwable {
    throw __call3029201_0(p0);
}
public static void h292_2(java.lang.Throwable p0, moom.JG p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __monitorExit3029202_0(p1);
    throw life2_2;
}
private static native long __fieldRead292_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call292_1() throws Throwable;
private static native moom.JG __fieldRead292_2() throws Throwable;
private static native void __monitorEnter292_3(moom.JG a0) throws Throwable;
private static native moom.JG __fieldRead292_4() throws Throwable;
private static native int __call292_5(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.JE __call292_6(moom.JG a0, int a1) throws Throwable;
private static native void __call292_7(moom.JE a0, net.minecraft.client.renderer.RenderGlobal a1) throws Throwable;
private static native void __monitorExit292_8(moom.JG a0) throws Throwable;
private static native moom.Oo __call3029200_0(moom.Oo a0) throws Throwable;
private static native moom.Oo __call3029201_0(moom.Oo a0) throws Throwable;
private static native void __monitorExit3029202_0(moom.JG a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_3c570e9deeaac84e0374(net.minecraft.client.renderer.RenderGlobal a0) throws E;
private static final class __SourceHandler_3c570e9deeaac84e0374 {

public static void f293(net.minecraft.client.renderer.RenderGlobal p0) throws Throwable {
    net.minecraft.entity.Entity[] spill293_0;
    long life1_3;
    moom.JG life4_7;
    net.minecraft.entity.Entity[] life3_9;
    java.util.List life5_12;
    java.util.Iterator life6_15;
    moom.JE life7_22;
    forest_join_34: {
    forest_join_30: {
    life1_3 = (__fieldRead293_0() ^ 50894077486208L);
    spill293_0 = __call293_1();
    __monitorEnter293_3((life4_7 = __fieldRead293_2()));
    life3_9 = spill293_0;
    life5_12 = __call293_5(__fieldRead293_4());
    life6_15 = __call293_6(life5_12);
    forest_cycle_16: while (true) {
    if (!(__call293_7(life6_15))) {
        break forest_join_30;
    }
    life7_22 = __cast293_9(__call293_8(life6_15));
    __call293_10(life7_22, p0);
    if (!((life3_9 != null))) {
        break forest_join_34;
    }
    if (!((life3_9 == null))) {
        continue forest_cycle_16;
    }
    break forest_cycle_16;
    }
    }
    __call293_12(__fieldRead293_11());
    __monitorExit293_13(life4_7);
    }
    return;
}
public static void h293_0(moom.Oo p0) throws Throwable {
    throw __call3029300_0(p0);
}
public static void h293_1(java.lang.Throwable p0, moom.JG p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __monitorExit3029301_0(p1);
    throw life2_2;
}
private static native long __fieldRead293_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call293_1() throws Throwable;
private static native moom.JG __fieldRead293_2() throws Throwable;
private static native void __monitorEnter293_3(moom.JG a0) throws Throwable;
private static native moom.JG __fieldRead293_4() throws Throwable;
private static native java.util.List __call293_5(moom.JG a0) throws Throwable;
private static native java.util.Iterator __call293_6(java.util.List a0) throws Throwable;
private static native boolean __call293_7(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call293_8(java.util.Iterator a0) throws Throwable;
private static native moom.JE __cast293_9(java.lang.Object a0) throws Throwable;
private static native void __call293_10(moom.JE a0, net.minecraft.client.renderer.RenderGlobal a1) throws Throwable;
private static native moom.JG __fieldRead293_11() throws Throwable;
private static native void __call293_12(moom.JG a0) throws Throwable;
private static native void __monitorExit293_13(moom.JG a0) throws Throwable;
private static native moom.Oo __call3029300_0(moom.Oo a0) throws Throwable;
private static native void __monitorExit3029301_0(moom.JG a0) throws Throwable;

}


private static void b(net.minecraft.client.renderer.RenderGlobal p0) {
net.minecraft.client.multiplayer.WorldClient lexicalValue828_14_0;
    moom.JE lexicalValue828_51_0;
    int lexicalValue828_56_0;
    moom.JE lexicalValue828_66_0;
    net.minecraft.entity.Entity[] spill828_0;
    net.minecraft.client.multiplayer.WorldClient spill828_1;
    int spill828_2;
    moom.JE spill828_3;
    moom.JE spill828_4;
    long life1_3;
    net.minecraft.client.multiplayer.WorldClient life4_7;
    net.minecraft.entity.Entity[] life3_8;
    java.util.Iterator life5_19;
    net.minecraft.entity.Entity life6_26;
    int life7_29;
    int life8_39;
    moom.JE life9_43;
    moom.JE life9_55;
    int life8_68;
    moom.JE life9_72;
    lexical_join_70: {
    lexical_join_14: {
    life1_3 = (moom.JF.f ^ 42861296836050L);
    spill828_0 = moom.JM.b__Arrayr3();
    life4_7 = ((net.minecraft.client.renderer.RenderGlobal)(p0)).a__Ev();
    life3_8 = spill828_0;
    spill828_1 = life4_7;
    if (!((life3_8 != null))) {
        lexicalValue828_14_0 = spill828_1;
        break lexical_join_14;
    }
    if (!((spill828_1 != null))) {
        break lexical_join_70;
    }
    lexicalValue828_14_0 = life4_7;
    }
    life5_19 = ((java.util.List)(((net.minecraft.world.World)(lexicalValue828_14_0)).a__List())).iterator();
    lexical_cycle_17: while (true) {
    lexical_join_68: {
    lexical_join_66: {
    lexical_join_56: {
    lexical_join_54: {
    lexical_join_52: {
    lexical_join_51: {
    if (!(((java.util.Iterator)(life5_19)).hasNext())) {
        break lexical_join_70;
    }
    life6_26 = ((net.minecraft.entity.Entity)(((java.util.Iterator)(life5_19)).next()));
    life7_29 = moom.JF.a(((net.minecraft.entity.Entity)(life6_26)));
    spill828_2 = life7_29;
    if (!((life3_8 != null))) {
        lexicalValue828_56_0 = spill828_2;
        break lexical_join_56;
    }
    if (!((spill828_2 > 0))) {
        break lexical_join_54;
    }
    life8_39 = ((net.minecraft.entity.Entity)(life6_26)).e__Int();
    life9_43 = ((moom.JG)(moom.JF.a)).a(((int)(life8_39)));
    spill828_3 = life9_43;
    if (!((life3_8 != null))) {
        lexicalValue828_51_0 = spill828_3;
        break lexical_join_51;
    }
    if (!((spill828_3 == null))) {
        break lexical_join_52;
    }
    life9_55 = new moom.JE(life6_26);
    lexicalValue828_51_0 = ((moom.JG)(moom.JF.a)).a(((int)(life8_39)), ((moom.JE)(life9_55)));
    }
    recovery.source.CarrierOps.discard(lexicalValue828_51_0);
    }
    if (!((life3_8 == null))) {
        break lexical_join_68;
    }
    }
    lexicalValue828_56_0 = ((net.minecraft.entity.Entity)(life6_26)).e__Int();
    }
    life8_68 = lexicalValue828_56_0;
    life9_72 = ((moom.JG)(moom.JF.a)).b(((int)(life8_68)));
    spill828_4 = life9_72;
    if (!((life3_8 != null))) {
        lexicalValue828_66_0 = spill828_4;
        break lexical_join_66;
    }
    if (!((spill828_4 != null))) {
        break lexical_join_68;
    }
    lexicalValue828_66_0 = life9_72;
    }
    ((moom.JE)(lexicalValue828_66_0)).b(((net.minecraft.client.renderer.RenderGlobal)(p0)));
    }
    if (!((life3_8 == null))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    return;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5088_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/JF"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static void b() { __sourceHandlerCall_aed2b5992544d2ac1749(); }


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.JF.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x2215;
        if (k[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = j[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])JF.l.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    JF.l.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/JF", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            JF.k[n2] = n4;
        }
        return k[n2];
}


public static void b(net.minecraft.entity.Entity p0, net.minecraft.client.renderer.RenderGlobal p1) { __sourceHandlerCall_3ca009be7a42a6ad3a98(p0, p1); }


public static void c(net.minecraft.client.renderer.RenderGlobal p0) { __sourceHandlerCall_3c570e9deeaac84e0374(p0); }


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
        byte[] spill2644_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2644_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2644_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2644_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2644_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2644_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public static void a(net.minecraft.client.renderer.RenderGlobal p0) { __sourceHandlerCall_278328068469e1346f41(p0); }


public static net.minecraft.item.ItemStack a(net.minecraft.entity.item.EntityItem p0) {
long local1 = (moom.JF.f ^ 10186439047066L);
    return ((net.minecraft.entity.DataWatcher)(((net.minecraft.entity.item.EntityItem)(p0)).a__r1())).a__xW(((int)(__sourceIntrinsic_53f890b5ba78_originalDynamicSite1179_2(4632, (6341062064454527634L ^ local1)))));
}


public static int a(net.minecraft.entity.Entity p0) {
net.minecraft.entity.Entity forwardValue2283_19_0;
    int forwardValue2283_20_0;
    int forwardValue2283_35_0;
    int forwardValue2283_46_0;
    java.lang.Integer forwardValue2283_60_0;
    int forwardValue2283_64_0;
    int forwardValue2283_75_0;
    int forwardValue2283_86_0;
    int forwardValue2283_102_0;
    int forwardValue2283_108_0;
    int forwardValue2283_111_0;
    int forwardValue2283_130_0;
    int forwardValue2283_136_0;
    int forwardValue2283_139_0;
    int forwardValue2283_162_0;
    int forwardValue2283_187_0;
    int forwardValue2283_200_0;
    net.minecraft.entity.Entity spill2283_0;
    boolean spill2283_1;
    boolean spill2283_2;
    java.lang.Integer spill2283_3;
    boolean spill2283_4;
    int spill2283_5;
    int spill2283_6;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    net.minecraft.entity.player.EntityPlayer life4_39;
    java.lang.Integer life4_81;
    net.minecraft.entity.monster.EntityBlaze life4_134;
    moom.th life5_165;
    net.minecraft.entity.monster.EntityCreeper life6_199;
    net.minecraft.entity.EntityLivingBase life6_230;
    net.minecraft.item.ItemStack life8_233;
    int life9_236;
    net.minecraft.item.ItemStack life10_240;
    int life11_243;
    net.minecraft.entity.item.EntityItem life7_258;
    net.minecraft.item.ItemStack life8_261;
    forward_join_200: {
    forward_join_199: {
    forward_join_187: {
    forward_join_185: {
    forward_join_162: {
    forward_join_160: {
    forward_join_139: {
    forward_join_137: {
    forward_join_136: {
    forward_join_131: {
    forward_join_130: {
    forward_join_111: {
    forward_join_109: {
    forward_join_108: {
    forward_join_103: {
    forward_join_102: {
    forward_join_86: {
    forward_join_84: {
    forward_join_75: {
    forward_join_73: {
    forward_join_64: {
    forward_join_62: {
    forward_join_60: {
    forward_join_46: {
    forward_join_44: {
    forward_join_35: {
    forward_join_33: {
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    life1_3 = (moom.JF.f ^ 41510725897721L);
    life3_5 = moom.JM.b__Arrayr3();
    spill2283_0 = p0;
    if (!((life3_5 != null))) {
        forwardValue2283_19_0 = spill2283_0;
        break forward_join_19;
    }
    if (!((spill2283_0 == ((net.minecraft.client.Minecraft)(moom.BU.a__fM())).a__r3()))) {
        break forward_join_18;
    }
    spill2283_1 = moom.BU.aA();
    if (!((life3_5 != null))) {
        forwardValue2283_20_0 = ((spill2283_1) ? 1 : 0);
        break forward_join_20;
    }
    if (!((!spill2283_1))) {
        break forward_join_18;
    }
    return 0;
    }
    forwardValue2283_19_0 = p0;
    }
    forwardValue2283_20_0 = ((forwardValue2283_19_0 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue2283_35_0 = forwardValue2283_20_0;
        break forward_join_35;
    }
    if (!((forwardValue2283_20_0 != 0))) {
        break forward_join_33;
    }
    life4_39 = ((net.minecraft.entity.player.EntityPlayer)(p0));
    spill2283_2 = ((net.minecraft.entity.player.EntityPlayer)(life4_39)).U__Boolean();
    if (!((life3_5 != null))) {
        forwardValue2283_35_0 = ((spill2283_2) ? 1 : 0);
        break forward_join_35;
    }
    if (!(spill2283_2)) {
        break forward_join_33;
    }
    return 0;
    }
    forwardValue2283_35_0 = ((((net.minecraft.entity.Entity)(p0)).r__Boolean()) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue2283_46_0 = forwardValue2283_35_0;
        break forward_join_46;
    }
    if (!((forwardValue2283_35_0 != 0))) {
        break forward_join_44;
    }
    return __sourceIntrinsic_cade617833b9_invokedynamic2283_12(2796, (1707363575340566528L ^ life1_3));
    }
    forwardValue2283_46_0 = ((((java.util.Map)(moom.JF.b)).isEmpty()) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue2283_64_0 = forwardValue2283_46_0;
        break forward_join_64;
    }
    if (!((forwardValue2283_46_0 == 0))) {
        break forward_join_62;
    }
    life4_81 = ((java.lang.Integer)(((java.util.Map)(moom.JF.b)).get(((java.lang.Object)(((java.lang.Object)(p0)).getClass())))));
    spill2283_3 = life4_81;
    if (!((life3_5 != null))) {
        forwardValue2283_60_0 = spill2283_3;
        break forward_join_60;
    }
    if (!((spill2283_3 != null))) {
        break forward_join_62;
    }
    forwardValue2283_60_0 = life4_81;
    }
    return ((java.lang.Integer)(forwardValue2283_60_0)).intValue();
    }
    forwardValue2283_64_0 = ((p0 instanceof net.minecraft.entity.projectile.EntityFireball) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue2283_75_0 = forwardValue2283_64_0;
        break forward_join_75;
    }
    if (!((forwardValue2283_64_0 != 0))) {
        break forward_join_73;
    }
    return __sourceIntrinsic_cade617833b9_invokedynamic2283_22(2796, (1707363575340566528L ^ life1_3));
    }
    forwardValue2283_75_0 = ((p0 instanceof moom.tK) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue2283_86_0 = forwardValue2283_75_0;
        break forward_join_86;
    }
    if (!((forwardValue2283_75_0 != 0))) {
        break forward_join_84;
    }
    return __sourceIntrinsic_cade617833b9_invokedynamic2283_24(2796, (1707363575340566528L ^ life1_3));
    }
    forwardValue2283_86_0 = ((p0 instanceof net.minecraft.entity.monster.EntityBlaze) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue2283_111_0 = forwardValue2283_86_0;
        break forward_join_111;
    }
    if (!((forwardValue2283_86_0 != 0))) {
        break forward_join_109;
    }
    life4_134 = ((net.minecraft.entity.monster.EntityBlaze)(p0));
    spill2283_4 = ((net.minecraft.entity.monster.EntityBlaze)(life4_134)).ac();
    if (!((life3_5 != null))) {
        forwardValue2283_102_0 = ((spill2283_4) ? 1 : 0);
        break forward_join_102;
    }
    if (!(spill2283_4)) {
        break forward_join_103;
    }
    forwardValue2283_102_0 = __sourceIntrinsic_cade617833b9_invokedynamic2283_29(2796, (1707363575340566528L ^ life1_3));
    }
    forwardValue2283_108_0 = forwardValue2283_102_0;
    break forward_join_108;
    }
    forwardValue2283_108_0 = __sourceIntrinsic_cade617833b9_invokedynamic2283_30(22635, (2977851719827348096L ^ life1_3));
    }
    return forwardValue2283_108_0;
    }
    forwardValue2283_111_0 = ((p0 instanceof moom.th) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue2283_139_0 = forwardValue2283_111_0;
        break forward_join_139;
    }
    if (!((forwardValue2283_111_0 != 0))) {
        break forward_join_137;
    }
    life5_165 = ((moom.th)(p0));
    spill2283_5 = recovery.source.CarrierOps.dcmpl(((double)(((double) ((moom.th)(life5_165)).bY))), ((double)(0x1.3333333333333p-1d)));
    if (!((life3_5 != null))) {
        forwardValue2283_130_0 = spill2283_5;
        break forward_join_130;
    }
    if (!((spill2283_5 > 0))) {
        break forward_join_131;
    }
    forwardValue2283_130_0 = __sourceIntrinsic_cade617833b9_invokedynamic2283_35(30127, (2855911559979071297L ^ life1_3));
    }
    forwardValue2283_136_0 = forwardValue2283_130_0;
    break forward_join_136;
    }
    forwardValue2283_136_0 = __sourceIntrinsic_cade617833b9_invokedynamic2283_36(9980, (4666730151206233118L ^ life1_3));
    }
    return forwardValue2283_136_0;
    }
    forwardValue2283_139_0 = ((p0 instanceof net.minecraft.entity.monster.EntityCreeper) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue2283_162_0 = forwardValue2283_139_0;
        break forward_join_162;
    }
    if (!((forwardValue2283_139_0 != 0))) {
        break forward_join_160;
    }
    life6_199 = ((net.minecraft.entity.monster.EntityCreeper)(p0));
    spill2283_6 = recovery.source.CarrierOps.dcmpl(((double)(((double) ((net.minecraft.entity.monster.EntityCreeper)(life6_199)).c__sourceReturn_f6c4892e39(((float)(0x0.0p0f)))))), ((double)(0x1.0624dd2f1a9fcp-10d)));
    if (!((life3_5 != null))) {
        forwardValue2283_162_0 = spill2283_6;
        break forward_join_162;
    }
    if (!((spill2283_6 > 0))) {
        break forward_join_160;
    }
    return __sourceIntrinsic_cade617833b9_invokedynamic2283_41(2796, (1707363575340566528L ^ life1_3));
    }
    forwardValue2283_162_0 = ((p0 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue2283_187_0 = forwardValue2283_162_0;
        break forward_join_187;
    }
    if (!((forwardValue2283_162_0 != 0))) {
        break forward_join_185;
    }
    life6_230 = ((net.minecraft.entity.EntityLivingBase)(p0));
    life8_233 = ((net.minecraft.entity.EntityLivingBase)(life6_230)).a__xW();
    life9_236 = moom.JF.a(((net.minecraft.item.ItemStack)(life8_233)));
    life10_240 = ((net.minecraft.entity.EntityLivingBase)(life6_230)).a__xW(((int)(4)));
    life11_243 = moom.JF.a(((net.minecraft.item.ItemStack)(life10_240)));
    return java.lang.Math.max(((int)(life9_236)), ((int)(life11_243)));
    }
    forwardValue2283_187_0 = ((p0 instanceof net.minecraft.entity.item.EntityItem) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue2283_200_0 = forwardValue2283_187_0;
        break forward_join_200;
    }
    if (!((forwardValue2283_187_0 != 0))) {
        break forward_join_199;
    }
    life7_258 = ((net.minecraft.entity.item.EntityItem)(p0));
    life8_261 = moom.JF.a(((net.minecraft.entity.item.EntityItem)(life7_258)));
    return moom.JF.a(((net.minecraft.item.ItemStack)(life8_261)));
    }
    forwardValue2283_200_0 = 0;
    }
    return forwardValue2283_200_0;
}


public static void a(net.minecraft.entity.Entity p0, net.minecraft.client.renderer.RenderGlobal p1) {
return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5095_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/JF"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.JF.a(((int)(local4)), ((long)(local5)));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 7323);
    if (((moom.JF.h)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.JF.i)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.JF.i)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/JF", life9_51);
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
        life9_116 = ((java.lang.String)((moom.JF.g)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.JF.h)[life5_8] = moom.JF.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.JF.h)[life5_8];
}


public static double a(moom.DT p0) { return __sourceHandlerCall_ff63378a4e363d4540c5(p0); }


public static int a(double p0, int p1) {
int forwardValue2281_43_0;
    int spill2281_0;
    int spill2281_1;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    int life6_19;
    int life7_27;
    int life2_43;
    forward_join_43: {
    forward_join_42: {
    life3_3 = (moom.JF.f ^ 102516772391707L);
    life5_5 = moom.JM.b__Arrayr3();
    spill2281_0 = recovery.source.CarrierOps.dcmpl(((double)(p0)), ((double)(0x0.0p0d)));
    if (!((life5_5 != null))) {
        forwardValue2281_43_0 = spill2281_0;
        break forward_join_43;
    }
    if (!((spill2281_0 > 0))) {
        break forward_join_42;
    }
    life6_19 = ((int) (p0 * 0x1.0p4d));
    life7_27 = (p1 & __sourceIntrinsic_79d035e6e227_invokedynamic2281_3(10396, (1503480910013541521L ^ life3_3)));
    spill2281_1 = life6_19;
    if (!((life5_5 != null))) {
        forwardValue2281_43_0 = spill2281_1;
        break forward_join_43;
    }
    if (!((spill2281_1 > life7_27))) {
        break forward_join_42;
    }
    life2_43 = (p1 & __sourceIntrinsic_79d035e6e227_invokedynamic2281_4(14437, (4808498636239813738L ^ life3_3)));
    p1 = (life2_43 | life6_19);
    }
    forwardValue2281_43_0 = p1;
    }
    return forwardValue2281_43_0;
}


public static int a(net.minecraft.entity.Entity p0, int p1) {
double local2 = ((double) moom.JF.a(((net.minecraft.entity.Entity)(p0))));
    p1 = moom.JF.a(((double)(local2)), ((int)(p1)));
    return p1;
}


public static int a(moom.DT p0, int p1) {
double local2 = moom.JF.a(((moom.DT)(p0)));
    p1 = moom.JF.a(((double)(local2)), ((int)(p1)));
    return p1;
}


private static void a(java.lang.String p0, java.util.Map p1, moom.J7 p2, moom.J3 p3, java.lang.String p4, java.lang.String p5) {
java.lang.String lexicalValue827_11_0;
    java.lang.String[] lexicalValue827_59_0;
    int lexicalValue827_105_0;
    java.lang.String spill827_0;
    java.lang.String[] spill827_1;
    moom.J3 spill827_2;
    java.lang.String spill827_3;
    java.lang.String spill827_4;
    java.lang.String spill827_5;
    moom.J3 spill827_6;
    int spill827_7;
    moom.J3 spill827_8;
    long life6_3;
    net.minecraft.entity.Entity[] life8_5;
    java.lang.String[] life9_16;
    java.lang.String[] life10_18;
    int life11_21;
    int life12_23;
    java.lang.String life13_30;
    java.lang.String[] life14_34;
    java.lang.String life15_73;
    java.lang.String life16_77;
    java.lang.String life17_81;
    moom.DD life18_86;
    java.lang.Object life19_90;
    int life20_117;
    lexical_join_132: {
    lexical_join_11: {
    life6_3 = (moom.JF.f ^ 46794286530364L);
    life8_5 = moom.JM.b__Arrayr3();
    spill827_0 = p0;
    if (!((life8_5 != null))) {
        lexicalValue827_11_0 = spill827_0;
        break lexical_join_11;
    }
    if (!((spill827_0 != null))) {
        break lexical_join_132;
    }
    lexicalValue827_11_0 = p0;
    }
    life9_16 = moom.BU.a__ArrayString(((java.lang.String)(lexicalValue827_11_0)), ((java.lang.String)(" ")));
    life10_18 = life9_16;
    life11_21 = (life10_18).length;
    life12_23 = 0;
    lexical_cycle_21: while (true) {
    lexical_join_129: {
    lexical_join_119: {
    lexical_join_105: {
    lexical_join_95: {
    lexical_join_93: {
    lexical_join_59: {
    lexical_join_58: {
    if (!((life12_23 < life11_21))) {
        break lexical_join_132;
    }
    life13_30 = (life10_18)[life12_23];
    life14_34 = moom.BU.a__ArrayString(((java.lang.String)(life13_30)), ((java.lang.String)(":")));
    spill827_1 = life14_34;
    if (!((life8_5 != null))) {
        lexicalValue827_59_0 = spill827_1;
        break lexical_join_59;
    }
    if (!(((spill827_1).length != 2))) {
        break lexical_join_58;
    }
    spill827_2 = p3;
    java.lang.String __stackOp827_5_0 = life13_30;
    java.lang.String __stackOp827_5_1 = p4;
    java.lang.String __stackOp827_5_2 = __sourceIntrinsic_ea9e9b83ee77_invokedynamic827_4(3419, (3490567309508903932L ^ life6_3));
    spill827_3 = __stackOp827_5_2;
    spill827_4 = __stackOp827_5_0;
    spill827_5 = __stackOp827_5_1;
    recovery.source.CarrierOps.discard(__stackOp827_5_2);
    java.lang.String __stackOp827_8_0 = spill827_5;
    java.lang.String __stackOp827_8_1 = __sourceIntrinsic_ea9e9b83ee77_invokedynamic827_7(11616, (5657929149984809926L ^ life6_3));
    ((moom.J3)(spill827_2)).b__Void(((java.lang.String)(__sourceIntrinsic_ea9e9b83ee77_invokedynamic827_9(spill827_3, spill827_4, __stackOp827_8_1, __stackOp827_8_0))));
    if (!((life8_5 == null))) {
        break lexical_join_129;
    }
    }
    lexicalValue827_59_0 = life14_34;
    }
    life15_73 = (lexicalValue827_59_0)[0];
    life16_77 = (life14_34)[1];
    life17_81 = __sourceIntrinsic_ea9e9b83ee77_invokedynamic827_11(p5, life15_73);
    life18_86 = new moom.DD(life17_81);
    life19_90 = ((moom.J7)(p2)).a(((moom.DD)(life18_86)));
    if (!((life8_5 != null))) {
        break lexical_join_93;
    }
    if (!((life19_90 == null))) {
        break lexical_join_95;
    }
    spill827_6 = p3;
    java.lang.String __stackOp827_14_0 = life17_81;
    java.lang.String __stackOp827_14_1 = __sourceIntrinsic_ea9e9b83ee77_invokedynamic827_13(24897, (337784026927525861L ^ life6_3));
    ((moom.J3)(spill827_6)).b__Void(((java.lang.String)(__sourceIntrinsic_ea9e9b83ee77_invokedynamic827_15(__stackOp827_14_1, __stackOp827_14_0))));
    }
    if (!((life8_5 == null))) {
        break lexical_join_129;
    }
    }
    life20_117 = ((moom.J3)(p3)).a(((java.lang.String)(life16_77)), ((int)(-1)));
    spill827_7 = life20_117;
    if (!((life8_5 != null))) {
        lexicalValue827_105_0 = spill827_7;
        break lexical_join_105;
    }
    if (!((spill827_7 >= 0))) {
        break lexical_join_119;
    }
    lexicalValue827_105_0 = life20_117;
    }
    if (!((lexicalValue827_105_0 <= __sourceIntrinsic_ea9e9b83ee77_invokedynamic827_18(2796, (1707367216327736005L ^ life6_3))))) {
        break lexical_join_119;
    }
    ((java.util.Map)(p1)).put(((java.lang.Object)(life19_90)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(life20_117))))));
    if (!((life8_5 == null))) {
        break lexical_join_129;
    }
    }
    spill827_8 = p3;
    java.lang.String __stackOp827_22_0 = life13_30;
    java.lang.String __stackOp827_22_1 = __sourceIntrinsic_ea9e9b83ee77_invokedynamic827_21(5768, (6966495763828906029L ^ life6_3));
    ((moom.J3)(spill827_8)).b__Void(((java.lang.String)(__sourceIntrinsic_ea9e9b83ee77_invokedynamic827_23(__stackOp827_22_1, __stackOp827_22_0))));
    }
    life12_23 += 1;
    if (!((life8_5 == null))) { continue lexical_cycle_21; }
    break lexical_cycle_21;
    }
    }
    return;
}


public static int a() { return __sourceHandlerCall_005bd121c2239d223748(); }


private static void a__Void() {
int forwardValue2285_29_0;
    int forwardValue2285_34_0;
    net.minecraft.entity.Entity[] spill2285_0;
    int spill2285_1;
    long life0_3;
    net.minecraft.entity.Entity[] life2_7;
    forward_join_42: {
    forward_join_34: {
    forward_join_29: {
    forward_join_27: {
    life0_3 = (moom.JF.f ^ 87455307253817L);
    spill2285_0 = moom.JM.b__Arrayr3();
    e = ((boolean)(true));
    life2_7 = spill2285_0;
    ((java.util.Map)(moom.JF.b)).clear();
    ((java.util.Map)(moom.JF.c)).clear();
    spill2285_1 = ((java.util.Map)(moom.JF.b)).size();
    if (!((life2_7 != null))) {
        forwardValue2285_29_0 = spill2285_1;
        break forward_join_29;
    }
    if (!((spill2285_1 > 0))) {
        break forward_join_27;
    }
    int __stackOp2285_12_0 = ((java.util.Map)(moom.JF.b)).size();
    java.lang.String __stackOp2285_12_1 = __sourceIntrinsic_b82a5b29b709_invokedynamic2285_11(601, (4013758301113629694L ^ life0_3));
    moom.BU.b__Void(((java.lang.String)(__sourceIntrinsic_b82a5b29b709_invokedynamic2285_13(__stackOp2285_12_1, __stackOp2285_12_0))));
    }
    forwardValue2285_29_0 = ((java.util.Map)(moom.JF.c)).size();
    }
    if (!((life2_7 != null))) {
        forwardValue2285_34_0 = forwardValue2285_29_0;
        break forward_join_34;
    }
    if (!((forwardValue2285_29_0 > 0))) {
        break forward_join_42;
    }
    forwardValue2285_34_0 = ((java.util.Map)(moom.JF.c)).size();
    }
    int __stackOp2285_20_0 = forwardValue2285_34_0;
    java.lang.String __stackOp2285_20_1 = __sourceIntrinsic_b82a5b29b709_invokedynamic2285_19(10568, (1153855288962552046L ^ life0_3));
    moom.BU.b__Void(((java.lang.String)(__sourceIntrinsic_b82a5b29b709_invokedynamic2285_21(__stackOp2285_20_1, __stackOp2285_20_0))));
    }
    return;
}


private static void a(java.io.InputStream p0, java.lang.String p1, java.lang.String p2) { __sourceHandlerCall_703facceb817e57c1bf4(p0, p1, p2); }


public static int a(net.minecraft.item.ItemStack p0) {
net.minecraft.item.ItemStack forwardValue2284_13_0;
    net.minecraft.item.Item forwardValue2284_34_0;
    net.minecraft.item.Item forwardValue2284_43_0;
    net.minecraft.item.Item forwardValue2284_43_1;
    net.minecraft.item.Item forwardValue2284_48_0;
    net.minecraft.item.Item forwardValue2284_48_1;
    net.minecraft.item.Item forwardValue2284_53_0;
    net.minecraft.item.Item forwardValue2284_53_1;
    net.minecraft.item.Item forwardValue2284_64_0;
    net.minecraft.item.Item forwardValue2284_64_1;
    net.minecraft.item.Item forwardValue2284_75_0;
    net.minecraft.item.Item forwardValue2284_75_1;
    net.minecraft.item.Item forwardValue2284_86_0;
    net.minecraft.item.Item forwardValue2284_86_1;
    java.lang.Integer forwardValue2284_107_0;
    int forwardValue2284_110_0;
    net.minecraft.item.ItemStack spill2284_0;
    net.minecraft.item.Item spill2284_1;
    moom.wU spill2284_2;
    net.minecraft.item.Item spill2284_3;
    boolean spill2284_4;
    java.lang.Integer spill2284_5;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    net.minecraft.item.Item life4_19;
    moom.wU life5_30;
    net.minecraft.block.Block life6_35;
    java.lang.Integer life5_148;
    forward_join_111: {
    forward_join_110: {
    forward_join_109: {
    forward_join_107: {
    forward_join_92: {
    forward_join_86: {
    forward_join_84: {
    forward_join_75: {
    forward_join_73: {
    forward_join_64: {
    forward_join_62: {
    forward_join_53: {
    forward_join_48: {
    forward_join_43: {
    forward_join_41: {
    forward_join_34: {
    forward_join_33: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (moom.JF.f ^ 20163654987899L);
    life3_5 = moom.JM.b__Arrayr3();
    spill2284_0 = p0;
    if (!((life3_5 != null))) {
        forwardValue2284_13_0 = spill2284_0;
        break forward_join_13;
    }
    if (!((spill2284_0 == null))) {
        break forward_join_12;
    }
    return 0;
    }
    forwardValue2284_13_0 = p0;
    }
    life4_19 = ((net.minecraft.item.ItemStack)(forwardValue2284_13_0)).a__wQ();
    spill2284_1 = life4_19;
    if (!((life3_5 != null))) {
        forwardValue2284_34_0 = spill2284_1;
        break forward_join_34;
    }
    if (!((((spill2284_1 instanceof moom.wU) ? 1 : 0) != 0))) {
        break forward_join_33;
    }
    life5_30 = ((moom.wU)(life4_19));
    spill2284_2 = life5_30;
    if (!((life3_5 != null))) {
        forwardValue2284_34_0 = spill2284_2;
        break forward_join_34;
    }
    life6_35 = ((moom.wU)(spill2284_2)).a__ch();
    if (!((life6_35 != null))) {
        break forward_join_33;
    }
    return __sourceExactCall_2da122e53f98f1(((net.minecraft.block.Block)(life6_35)));
    }
    forwardValue2284_34_0 = life4_19;
    }
    spill2284_3 = net.minecraft.init.Items.ay;
    if (!((life3_5 != null))) {
        forwardValue2284_43_0 = forwardValue2284_34_0;
        forwardValue2284_43_1 = spill2284_3;
        break forward_join_43;
    }
    if (!((forwardValue2284_34_0 == spill2284_3))) {
        break forward_join_41;
    }
    return __sourceExactCall_8f4a3e63ed39b5(((moom.dN)(net.minecraft.init.Blocks.l)));
    }
    forwardValue2284_43_0 = life4_19;
    forwardValue2284_43_1 = net.minecraft.init.Items.bk;
    }
    if (!((life3_5 != null))) {
        forwardValue2284_48_0 = forwardValue2284_43_0;
        forwardValue2284_48_1 = forwardValue2284_43_1;
        break forward_join_48;
    }
    if (!((forwardValue2284_43_0 != forwardValue2284_43_1))) {
        break forward_join_111;
    }
    forwardValue2284_48_0 = life4_19;
    forwardValue2284_48_1 = net.minecraft.init.Items.bs;
    }
    if (!((life3_5 != null))) {
        forwardValue2284_53_0 = forwardValue2284_48_0;
        forwardValue2284_53_1 = forwardValue2284_48_1;
        break forward_join_53;
    }
    if (!((forwardValue2284_48_0 != forwardValue2284_48_1))) {
        break forward_join_111;
    }
    forwardValue2284_53_0 = life4_19;
    forwardValue2284_53_1 = net.minecraft.init.Items.aT;
    }
    if (!((life3_5 != null))) {
        forwardValue2284_64_0 = forwardValue2284_53_0;
        forwardValue2284_64_1 = forwardValue2284_53_1;
        break forward_join_64;
    }
    if (!((forwardValue2284_53_0 == forwardValue2284_53_1))) {
        break forward_join_62;
    }
    return __sourceIntrinsic_73d4db24f1d1_invokedynamic2284_13(32645, (138474131944014063L ^ life1_3));
    }
    forwardValue2284_64_0 = life4_19;
    forwardValue2284_64_1 = net.minecraft.init.Items.ch;
    }
    if (!((life3_5 != null))) {
        forwardValue2284_75_0 = forwardValue2284_64_0;
        forwardValue2284_75_1 = forwardValue2284_64_1;
        break forward_join_75;
    }
    if (!((forwardValue2284_64_0 == forwardValue2284_64_1))) {
        break forward_join_73;
    }
    return __sourceIntrinsic_73d4db24f1d1_invokedynamic2284_15(32645, (138474131944014063L ^ life1_3));
    }
    forwardValue2284_75_0 = life4_19;
    forwardValue2284_75_1 = net.minecraft.init.Items.bt;
    }
    if (!((life3_5 != null))) {
        forwardValue2284_86_0 = forwardValue2284_75_0;
        forwardValue2284_86_1 = forwardValue2284_75_1;
        break forward_join_86;
    }
    if (!((forwardValue2284_75_0 == forwardValue2284_75_1))) {
        break forward_join_84;
    }
    return __sourceIntrinsic_73d4db24f1d1_invokedynamic2284_17(32645, (138474131944014063L ^ life1_3));
    }
    forwardValue2284_86_0 = life4_19;
    forwardValue2284_86_1 = net.minecraft.init.Items.bO;
    }
    if (!((forwardValue2284_86_0 == forwardValue2284_86_1))) {
        break forward_join_92;
    }
    return (__sourceExactCall_866961d78e7180(((moom.cX)(net.minecraft.init.Blocks.bN))) / 2);
    }
    spill2284_4 = ((java.util.Map)(moom.JF.c)).isEmpty();
    if (!((life3_5 != null))) {
        forwardValue2284_110_0 = ((spill2284_4) ? 1 : 0);
        break forward_join_110;
    }
    if (!((!spill2284_4))) {
        break forward_join_109;
    }
    life5_148 = ((java.lang.Integer)(((java.util.Map)(moom.JF.c)).get(((java.lang.Object)(life4_19)))));
    spill2284_5 = life5_148;
    if (!((life3_5 != null))) {
        forwardValue2284_107_0 = spill2284_5;
        break forward_join_107;
    }
    if (!((spill2284_5 != null))) {
        break forward_join_109;
    }
    forwardValue2284_107_0 = life5_148;
    }
    return ((java.lang.Integer)(forwardValue2284_107_0)).intValue();
    }
    forwardValue2284_110_0 = 0;
    }
    return forwardValue2284_110_0;
    }
    return __sourceIntrinsic_73d4db24f1d1_invokedynamic2284_28(22635, (2977798317468296962L ^ life1_3));
}


private static native <E extends Throwable> int __sourceIntrinsic_79d035e6e227_invokedynamic2281_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_79d035e6e227_invokedynamic2281_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ea9e9b83ee77_invokedynamic827_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ea9e9b83ee77_invokedynamic827_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ea9e9b83ee77_invokedynamic827_9(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ea9e9b83ee77_invokedynamic827_11(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ea9e9b83ee77_invokedynamic827_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ea9e9b83ee77_invokedynamic827_15(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ea9e9b83ee77_invokedynamic827_18(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ea9e9b83ee77_invokedynamic827_21(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ea9e9b83ee77_invokedynamic827_23(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5095_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cade617833b9_invokedynamic2283_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cade617833b9_invokedynamic2283_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cade617833b9_invokedynamic2283_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cade617833b9_invokedynamic2283_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cade617833b9_invokedynamic2283_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cade617833b9_invokedynamic2283_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cade617833b9_invokedynamic2283_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cade617833b9_invokedynamic2283_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_53f890b5ba78_originalDynamicSite1179_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_73d4db24f1d1_invokedynamic2284_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_73d4db24f1d1_invokedynamic2284_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_73d4db24f1d1_invokedynamic2284_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_73d4db24f1d1_invokedynamic2284_28(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic2285_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic2285_13(java.lang.String a0, int a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic2285_19(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic2285_21(java.lang.String a0, int a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5088_0() throws E;

private static native int __sourceExactCall_2da122e53f98f1(net.minecraft.block.Block p0);
private static native int __sourceExactCall_8f4a3e63ed39b5(moom.dN p0);
private static native int __sourceExactCall_866961d78e7180(moom.cX p0);
}
