package moom;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufInputStream;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class iu implements moom.hO {

private static org.apache.logging.log4j.Logger a;

private static java.util.concurrent.ThreadPoolExecutor b;

public static moom.DD c;

private static moom.DD d;

private net.minecraft.client.gui.GuiMultiplayer e;

private net.minecraft.client.Minecraft f;

private moom.jL g;

private moom.DD h;

private java.lang.String i;

private moom.n3 j;

private long k;

private static long l;

private static long[] m;

private static java.lang.Integer[] n;

private static java.util.Map o;

private static long[] p;

private static java.lang.Long[] q;

private static java.util.Map r;

protected iu(net.minecraft.client.gui.GuiMultiplayer p0, moom.jL p1) {
super();
    this.e = ((net.minecraft.client.gui.GuiMultiplayer)(p0));
    this.g = ((moom.jL)(p1));
    this.f = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM()));
    this.h = ((moom.DD)(new moom.DD(__sourceIntrinsic_9f9206ebda1a_originalDynamicSite4547_5(((moom.jL)(p1)).b))));
    this.j = ((moom.n3)(((moom.n3)(((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(this.f)).a__ok())).a(((moom.DD)(this.h)))))));
    return;
}


static {
l = ((long)(((moom._a)(moom._c.a(((long)(-674566283771961412L)), ((long)(6753135292093161229L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(188993399913660L)))));
    o = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.iu.l ^ 121606739576873L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill1036_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1036_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1036_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1036_14 = new byte[8];
    (__sourceSpill1036_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill1036_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation1036_16 = __sourceSpill1036_14;
    ((javax.crypto.Cipher)(__sourceSpill1036_11)).init(((int)(__sourceSpill1036_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1036_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1036_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local19_life19 = new long[20];
    int local16_life20 = 0;
    java.lang.String local17_life21;
    int local18_life23 = ((java.lang.String)((local17_life21 = "\025\fD\034Ýrµ¥¾¬v})µ\036\034\032pÀÅú\003rý~tüÑØ\022O-\177/K¼\013y\b+Ø²³××­¢Ù/E\r[àwqÆz\035Mä^ßE©~çZU÷_\031îëi¨H7ä\021óéÕg\000Þ/Ë#¼TÝm\032/ííÔMë[ØÇ¾m\035[\034Åkb\177\032òõÇ\007Ür´²\004uø0Ñä<\022ü"))).length();
    int local15_life24 = 0;
    do {
        java.lang.String __sourceSpill1036_25 = local17_life21;
        int __sourceSpill1036_26 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1036_25)).substring(((int)(__sourceSpill1036_26)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1036_30 = local19_life19;
        int __sourceSpill1036_31 = local16_life20;
        local16_life20 += 1;
        long local21_life32 = (((((((((((long) (local20_life29)[0]) & 255L) << 56) | ((((long) (local20_life29)[1]) & 255L) << 48)) | ((((long) (local20_life29)[2]) & 255L) << 40)) | ((((long) (local20_life29)[3]) & 255L) << 32)) | ((((long) (local20_life29)[4]) & 255L) << 24)) | ((((long) (local20_life29)[5]) & 255L) << 16)) | ((((long) (local20_life29)[6]) & 255L) << 8)) | (((long) (local20_life29)[7]) & 255L));
        byte[] __sourceSpill1036_33 = new byte[8];
        (__sourceSpill1036_33)[0] = ((byte) ((int) (local21_life32 >>> 56)));
        (__sourceSpill1036_33)[1] = ((byte) ((int) (local21_life32 >>> 48)));
        (__sourceSpill1036_33)[2] = ((byte) ((int) (local21_life32 >>> 40)));
        (__sourceSpill1036_33)[3] = ((byte) ((int) (local21_life32 >>> 32)));
        (__sourceSpill1036_33)[4] = ((byte) ((int) (local21_life32 >>> 24)));
        (__sourceSpill1036_33)[5] = ((byte) ((int) (local21_life32 >>> 16)));
        (__sourceSpill1036_33)[6] = ((byte) ((int) (local21_life32 >>> 8)));
        (__sourceSpill1036_33)[7] = ((byte) ((int) local21_life32));
        javax.crypto.Cipher __sourceSpill1036_34 = local13_life9;
        byte[] local23_life36 = ((javax.crypto.Cipher)(__sourceSpill1036_34)).doFinal(((byte[])(__sourceSpill1036_33)));
        (__sourceSpill1036_30)[__sourceSpill1036_31] = (((((((((((long) (local23_life36)[0]) & 255L) << 56) | ((((long) (local23_life36)[1]) & 255L) << 48)) | ((((long) (local23_life36)[2]) & 255L) << 40)) | ((((long) (local23_life36)[3]) & 255L) << 32)) | ((((long) (local23_life36)[4]) & 255L) << 24)) | ((((long) (local23_life36)[5]) & 255L) << 16)) | ((((long) (local23_life36)[6]) & 255L) << 8)) | (((long) (local23_life36)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    local18_life23 = ((java.lang.String)((local17_life21 = "\f\\Ø½xÓ\0370OtìN\002C"))).length();
    local15_life24 = 0;
    do {
        java.lang.String __sourceSpill1036_38 = local17_life21;
        int __sourceSpill1036_39 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1036_38)).substring(((int)(__sourceSpill1036_39)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1036_43 = local19_life19;
        int __sourceSpill1036_44 = local16_life20;
        local16_life20 += 1;
        long local21_life45 = (((((((((((long) (local20_life42)[0]) & 255L) << 56) | ((((long) (local20_life42)[1]) & 255L) << 48)) | ((((long) (local20_life42)[2]) & 255L) << 40)) | ((((long) (local20_life42)[3]) & 255L) << 32)) | ((((long) (local20_life42)[4]) & 255L) << 24)) | ((((long) (local20_life42)[5]) & 255L) << 16)) | ((((long) (local20_life42)[6]) & 255L) << 8)) | (((long) (local20_life42)[7]) & 255L));
        byte[] __sourceSpill1036_46 = new byte[8];
        (__sourceSpill1036_46)[0] = ((byte) ((int) (local21_life45 >>> 56)));
        (__sourceSpill1036_46)[1] = ((byte) ((int) (local21_life45 >>> 48)));
        (__sourceSpill1036_46)[2] = ((byte) ((int) (local21_life45 >>> 40)));
        (__sourceSpill1036_46)[3] = ((byte) ((int) (local21_life45 >>> 32)));
        (__sourceSpill1036_46)[4] = ((byte) ((int) (local21_life45 >>> 24)));
        (__sourceSpill1036_46)[5] = ((byte) ((int) (local21_life45 >>> 16)));
        (__sourceSpill1036_46)[6] = ((byte) ((int) (local21_life45 >>> 8)));
        (__sourceSpill1036_46)[7] = ((byte) ((int) local21_life45));
        javax.crypto.Cipher __sourceSpill1036_47 = local13_life9;
        byte[] local23_life49 = ((javax.crypto.Cipher)(__sourceSpill1036_47)).doFinal(((byte[])(__sourceSpill1036_46)));
        (__sourceSpill1036_43)[__sourceSpill1036_44] = (((((((((((long) (local23_life49)[0]) & 255L) << 56) | ((((long) (local23_life49)[1]) & 255L) << 48)) | ((((long) (local23_life49)[2]) & 255L) << 40)) | ((((long) (local23_life49)[3]) & 255L) << 32)) | ((((long) (local23_life49)[4]) & 255L) << 24)) | ((((long) (local23_life49)[5]) & 255L) << 16)) | ((((long) (local23_life49)[6]) & 255L) << 8)) | (((long) (local23_life49)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    m = ((long[])(local19_life19));
    n = ((java.lang.Integer[])(new java.lang.Integer[20]));
    r = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life54;
    javax.crypto.Cipher __sourceSpill1036_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1036_57 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1036_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1036_59 = new byte[8];
    (__sourceSpill1036_59)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life60 = 1;
    while ((local1_life60 < 8)) {
        (__sourceSpill1036_59)[local1_life60] = ((byte) ((int) ((local11_life7 << (local1_life60 * 8)) >>> 56)));
        local1_life60 += 1;
    }
    byte[] __sourcePreallocation1036_61 = __sourceSpill1036_59;
    ((javax.crypto.Cipher)(__sourceSpill1036_56)).init(((int)(__sourceSpill1036_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1036_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1036_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life64 = new long[12];
    int local3_life65 = 0;
    java.lang.String local4_life66;
    int local5_life68 = ((java.lang.String)((local4_life66 = "\004'\037é¯µC%\037(¾ßDr³ÉÛCjì\020oM\037¢G\007\rÊ¨Êh\013E\036p*>¿¦ÈlÙ`i*/eºI\013=\"1Ç\006\0259­\003^\035_ºå§x}µÀ"))).length();
    int local2_life69 = 0;
    do {
        java.lang.String __sourceSpill1036_70 = local4_life66;
        int __sourceSpill1036_71 = local2_life69;
        local2_life69 += 8;
        byte[] local7_life74 = ((java.lang.String)(((java.lang.String)(__sourceSpill1036_70)).substring(((int)(__sourceSpill1036_71)), ((int)(local2_life69))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1036_75 = local6_life64;
        int __sourceSpill1036_76 = local3_life65;
        local3_life65 += 1;
        long local8_life77 = (((((((((((long) (local7_life74)[0]) & 255L) << 56) | ((((long) (local7_life74)[1]) & 255L) << 48)) | ((((long) (local7_life74)[2]) & 255L) << 40)) | ((((long) (local7_life74)[3]) & 255L) << 32)) | ((((long) (local7_life74)[4]) & 255L) << 24)) | ((((long) (local7_life74)[5]) & 255L) << 16)) | ((((long) (local7_life74)[6]) & 255L) << 8)) | (((long) (local7_life74)[7]) & 255L));
        byte[] __sourceSpill1036_78 = new byte[8];
        (__sourceSpill1036_78)[0] = ((byte) ((int) (local8_life77 >>> 56)));
        (__sourceSpill1036_78)[1] = ((byte) ((int) (local8_life77 >>> 48)));
        (__sourceSpill1036_78)[2] = ((byte) ((int) (local8_life77 >>> 40)));
        (__sourceSpill1036_78)[3] = ((byte) ((int) (local8_life77 >>> 32)));
        (__sourceSpill1036_78)[4] = ((byte) ((int) (local8_life77 >>> 24)));
        (__sourceSpill1036_78)[5] = ((byte) ((int) (local8_life77 >>> 16)));
        (__sourceSpill1036_78)[6] = ((byte) ((int) (local8_life77 >>> 8)));
        (__sourceSpill1036_78)[7] = ((byte) ((int) local8_life77));
        javax.crypto.Cipher __sourceSpill1036_79 = local0_life54;
        byte[] local10_life81 = ((javax.crypto.Cipher)(__sourceSpill1036_79)).doFinal(((byte[])(__sourceSpill1036_78)));
        (__sourceSpill1036_75)[__sourceSpill1036_76] = (((((((((((long) (local10_life81)[0]) & 255L) << 56) | ((((long) (local10_life81)[1]) & 255L) << 48)) | ((((long) (local10_life81)[2]) & 255L) << 40)) | ((((long) (local10_life81)[3]) & 255L) << 32)) | ((((long) (local10_life81)[4]) & 255L) << 24)) | ((((long) (local10_life81)[5]) & 255L) << 16)) | ((((long) (local10_life81)[6]) & 255L) << 8)) | (((long) (local10_life81)[7]) & 255L));
    } while ((!(local2_life69 >= local5_life68)));
    local5_life68 = ((java.lang.String)((local4_life66 = "¢\020\b«ÞÆ(Ò\b=\004{"))).length();
    local2_life69 = 0;
    do {
        java.lang.String __sourceSpill1036_83 = local4_life66;
        int __sourceSpill1036_84 = local2_life69;
        local2_life69 += 8;
        byte[] local7_life87 = ((java.lang.String)(((java.lang.String)(__sourceSpill1036_83)).substring(((int)(__sourceSpill1036_84)), ((int)(local2_life69))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1036_88 = local6_life64;
        int __sourceSpill1036_89 = local3_life65;
        local3_life65 += 1;
        long local8_life90 = (((((((((((long) (local7_life87)[0]) & 255L) << 56) | ((((long) (local7_life87)[1]) & 255L) << 48)) | ((((long) (local7_life87)[2]) & 255L) << 40)) | ((((long) (local7_life87)[3]) & 255L) << 32)) | ((((long) (local7_life87)[4]) & 255L) << 24)) | ((((long) (local7_life87)[5]) & 255L) << 16)) | ((((long) (local7_life87)[6]) & 255L) << 8)) | (((long) (local7_life87)[7]) & 255L));
        byte[] __sourceSpill1036_91 = new byte[8];
        (__sourceSpill1036_91)[0] = ((byte) ((int) (local8_life90 >>> 56)));
        (__sourceSpill1036_91)[1] = ((byte) ((int) (local8_life90 >>> 48)));
        (__sourceSpill1036_91)[2] = ((byte) ((int) (local8_life90 >>> 40)));
        (__sourceSpill1036_91)[3] = ((byte) ((int) (local8_life90 >>> 32)));
        (__sourceSpill1036_91)[4] = ((byte) ((int) (local8_life90 >>> 24)));
        (__sourceSpill1036_91)[5] = ((byte) ((int) (local8_life90 >>> 16)));
        (__sourceSpill1036_91)[6] = ((byte) ((int) (local8_life90 >>> 8)));
        (__sourceSpill1036_91)[7] = ((byte) ((int) local8_life90));
        javax.crypto.Cipher __sourceSpill1036_92 = local0_life54;
        byte[] local10_life94 = ((javax.crypto.Cipher)(__sourceSpill1036_92)).doFinal(((byte[])(__sourceSpill1036_91)));
        (__sourceSpill1036_88)[__sourceSpill1036_89] = (((((((((((long) (local10_life94)[0]) & 255L) << 56) | ((((long) (local10_life94)[1]) & 255L) << 48)) | ((((long) (local10_life94)[2]) & 255L) << 40)) | ((((long) (local10_life94)[3]) & 255L) << 32)) | ((((long) (local10_life94)[4]) & 255L) << 24)) | ((((long) (local10_life94)[5]) & 255L) << 16)) | ((((long) (local10_life94)[6]) & 255L) << 8)) | (((long) (local10_life94)[7]) & 255L));
    } while ((!(local2_life69 >= local5_life68)));
    p = ((long[])(local6_life64));
    q = ((java.lang.Long[])(new java.lang.Long[12]));
    a = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
    b = ((java.util.concurrent.ThreadPoolExecutor)(new java.util.concurrent.ScheduledThreadPoolExecutor(5, ((com.google.common.util.concurrent.ThreadFactoryBuilder)(((com.google.common.util.concurrent.ThreadFactoryBuilder)(((com.google.common.util.concurrent.ThreadFactoryBuilder)(new com.google.common.util.concurrent.ThreadFactoryBuilder())).setNameFormat(((java.lang.String)("Server Pinger #%d"))))).setDaemon(((boolean)(true))))).build())));
    c = ((moom.DD)(new moom.DD("textures/misc/unknown_server.png")));
    d = ((moom.DD)(new moom.DD("textures/gui/server_selection.png")));
}

private static native <E extends Throwable> void __sourceHandlerCall_3ad21d92eb03649e5c13(moom.iu a0, int a1, int a2, int a3, int a4, int a5, int a6, int a7, boolean a8) throws E;
private static final class __SourceHandler_3ad21d92eb03649e5c13 {

public static void f1068(moom.iu receiver, int p0, int p1, int p2, int p3, int p4, int p5, int p6, boolean p7) throws Throwable {
    int lexicalValue1068_45_0;
    int lexicalValue1068_58_0;
    int lexicalValue1068_66_0;
    java.lang.String lexicalValue1068_171_0;
    java.lang.String lexicalValue1068_220_0;
    long life9_3;
    int life11_50;
    int life12_65;
    int life13_78;
    java.util.List life14_122;
    int life15_124;
    java.lang.String life15_187;
    int life16_193;
    int life17_224;
    java.lang.String life18_226;
    int life19_230;
    java.lang.String life20_238;
    int life21_488;
    int life22_492;
    int life23_626;
    int life24_630;
    lexical_join_735: {
    lexical_join_718: {
    lexical_join_680: {
    lexical_join_663: {
    lexical_join_625: {
    lexical_join_608: {
    lexical_join_533: {
    lexical_join_526: {
    lexical_join_489: {
    lexical_join_453: {
    lexical_join_448: {
    lexical_join_438: {
    lexical_join_361: {
    lexical_join_359: {
    lexical_join_322: {
    lexical_join_312: {
    lexical_join_303: {
    lexical_join_301: {
    lexical_join_288: {
    lexical_join_275: {
    lexical_join_262: {
    lexical_join_249: {
    lexical_join_226: {
    lexical_join_220: {
    lexical_join_219: {
    lexical_join_171: {
    lexical_join_168: {
    lexical_join_160: {
    lexical_join_66: {
    lexical_join_65: {
    lexical_join_63: {
    lexical_join_58: {
    lexical_join_57: {
    lexical_join_45: {
    lexical_join_44: {
    lexical_join_33: {
    life9_3 = (__fieldRead1068_0() ^ 88564333653264L);
    if (!((!__fieldRead1068_2(__fieldRead1068_1(receiver))))) {
        break lexical_join_33;
    }
    __fieldWrite1068_4(__fieldRead1068_3(receiver), 1);
    __fieldWrite1068_7(__fieldRead1068_5(receiver), __invokedynamic1068_6(5789, (35730208934641740L ^ life9_3)));
    __fieldWrite1068_9(__fieldRead1068_8(receiver), "");
    __fieldWrite1068_11(__fieldRead1068_10(receiver), "");
    __call1068_14(__fieldRead1068_12(), __invokedynamic1068_13(receiver));
    }
    if (!((__fieldRead1068_16(__fieldRead1068_15(receiver)) > __invokedynamic1068_17(2326, (531812307536784014L ^ life9_3))))) {
        break lexical_join_44;
    }
    lexicalValue1068_45_0 = 1;
    break lexical_join_45;
    }
    lexicalValue1068_45_0 = 0;
    }
    life11_50 = lexicalValue1068_45_0;
    if (!((__fieldRead1068_19(__fieldRead1068_18(receiver)) < __invokedynamic1068_20(19772, (8607252937294474925L ^ life9_3))))) {
        break lexical_join_57;
    }
    lexicalValue1068_58_0 = 1;
    break lexical_join_58;
    }
    lexicalValue1068_58_0 = 0;
    }
    life12_65 = lexicalValue1068_58_0;
    if (!((life11_50 == 0))) {
        break lexical_join_63;
    }
    if (!((life12_65 != 0))) {
        break lexical_join_65;
    }
    }
    lexicalValue1068_66_0 = 1;
    break lexical_join_66;
    }
    lexicalValue1068_66_0 = 0;
    }
    life13_78 = lexicalValue1068_66_0;
    __call1068_27(__fieldRead1068_22(__fieldRead1068_21(receiver)), __fieldRead1068_24(__fieldRead1068_23(receiver)), ((float) ((p1 + __invokedynamic1068_25(31434, (2119650631118805334L ^ life9_3))) + 3)), ((float) (p2 + 1)), __invokedynamic1068_26(25514, (1464845585706991665L ^ life9_3)));
    life14_122 = __call1068_33(__fieldRead1068_29(__fieldRead1068_28(receiver)), __fieldRead1068_31(__fieldRead1068_30(receiver)), ((p3 - __invokedynamic1068_32(31434, (2119650631118805334L ^ life9_3))) - 2));
    life15_124 = 0;
    lexical_cycle_113: while (true) {
    if (!((life15_124 < __call1068_35(__call1068_34(life14_122), 2)))) {
        break lexical_join_160;
    }
    __call1068_46(__fieldRead1068_37(__fieldRead1068_36(receiver)), __cast1068_39(__call1068_38(life14_122, life15_124)), ((float) ((p1 + __invokedynamic1068_40(31434, (2119650631118805334L ^ life9_3))) + 3)), ((float) ((p2 + __invokedynamic1068_41(26222, (2629601556404487668L ^ life9_3))) + (__fieldRead1068_44(__fieldRead1068_43(__fieldRead1068_42(receiver))) * life15_124))), __invokedynamic1068_45(10879, (6011982950108367343L ^ life9_3)));
    life15_124 += 1;
    continue lexical_cycle_113;
    }
    }
    if (!((life13_78 != 0))) {
        break lexical_join_168;
    }
    lexicalValue1068_171_0 = __invokedynamic1068_50(__fieldRead1068_47(), __fieldRead1068_49(__fieldRead1068_48(receiver)));
    break lexical_join_171;
    }
    lexicalValue1068_171_0 = __fieldRead1068_52(__fieldRead1068_51(receiver));
    }
    life15_187 = lexicalValue1068_171_0;
    life16_193 = __call1068_55(__fieldRead1068_54(__fieldRead1068_53(receiver)), life15_187);
    __call1068_60(__fieldRead1068_57(__fieldRead1068_56(receiver)), life15_187, ((float) ((((p1 + p3) - life16_193) - __invokedynamic1068_58(21390, (4198017452881604632L ^ life9_3))) - 2)), ((float) (p2 + 1)), __invokedynamic1068_59(24517, (1825886548536753240L ^ life9_3)));
    life17_224 = 0;
    life18_226 = null;
    if (!((life13_78 != 0))) {
        break lexical_join_226;
    }
    life19_230 = 5;
    if (!((life11_50 != 0))) {
        break lexical_join_219;
    }
    lexicalValue1068_220_0 = "Client out of date!";
    break lexical_join_220;
    }
    lexicalValue1068_220_0 = "Server out of date!";
    }
    life20_238 = lexicalValue1068_220_0;
    life18_226 = __fieldRead1068_62(__fieldRead1068_61(receiver));
    break lexical_join_361;
    }
    if (!(__fieldRead1068_64(__fieldRead1068_63(receiver)))) {
        break lexical_join_322;
    }
    if (!((__numericCompare1068_68(__fieldRead1068_66(__fieldRead1068_65(receiver)), __invokedynamic1068_67(25586, (8858410064922293538L ^ life9_3))) != 0))) {
        break lexical_join_322;
    }
    if (!((__numericCompare1068_71(__fieldRead1068_70(__fieldRead1068_69(receiver)), 0L) < 0))) {
        break lexical_join_249;
    }
    life19_230 = 5;
    break lexical_join_303;
    }
    if (!((__numericCompare1068_75(__fieldRead1068_73(__fieldRead1068_72(receiver)), __invokedynamic1068_74(21655, (6828100790966288973L ^ life9_3))) < 0))) {
        break lexical_join_262;
    }
    life19_230 = 0;
    break lexical_join_303;
    }
    if (!((__numericCompare1068_79(__fieldRead1068_77(__fieldRead1068_76(receiver)), __invokedynamic1068_78(4628, (5179436383707022540L ^ life9_3))) < 0))) {
        break lexical_join_275;
    }
    life19_230 = 1;
    break lexical_join_303;
    }
    if (!((__numericCompare1068_83(__fieldRead1068_81(__fieldRead1068_80(receiver)), __invokedynamic1068_82(24178, (833731122674337964L ^ life9_3))) < 0))) {
        break lexical_join_288;
    }
    life19_230 = 2;
    break lexical_join_303;
    }
    if (!((__numericCompare1068_87(__fieldRead1068_85(__fieldRead1068_84(receiver)), __invokedynamic1068_86(16248, (6045451801655306659L ^ life9_3))) < 0))) {
        break lexical_join_301;
    }
    life19_230 = 3;
    break lexical_join_303;
    }
    life19_230 = 4;
    }
    if (!((__numericCompare1068_90(__fieldRead1068_89(__fieldRead1068_88(receiver)), 0L) < 0))) {
        break lexical_join_312;
    }
    life20_238 = "(no connection)";
    break lexical_join_361;
    }
    life20_238 = __invokedynamic1068_93(__fieldRead1068_92(__fieldRead1068_91(receiver)));
    life18_226 = __fieldRead1068_95(__fieldRead1068_94(receiver));
    break lexical_join_361;
    }
    life17_224 = 1;
    life19_230 = ((int) (((__call1068_96() / __invokedynamic1068_97(10585, (486186583673012101L ^ life9_3))) + (((long) p0) * __invokedynamic1068_98(24203, (7348153080852908121L ^ life9_3)))) & __invokedynamic1068_99(28578, (6389914522998356347L ^ life9_3))));
    if (!((life19_230 > 4))) {
        break lexical_join_359;
    }
    life19_230 = (__invokedynamic1068_100(9818, (7237189821189916104L ^ life9_3)) - life19_230);
    }
    life20_238 = "Pinging...";
    }
    __call1068_101(0x1.0p0f, 0x1.0p0f, 0x1.0p0f, 0x1.0p0f);
    __call1068_105(__call1068_103(__fieldRead1068_102(receiver)), __fieldRead1068_104());
    __call1068_112(((p1 + p3) - __invokedynamic1068_106(6339, (5947636547788159818L ^ life9_3))), p2, ((float) (life17_224 * __invokedynamic1068_107(7995, (13523206347996325L ^ life9_3)))), ((float) (__invokedynamic1068_108(21197, (5074035880311845202L ^ life9_3)) + (life19_230 * __invokedynamic1068_109(28420, (5620680524976245905L ^ life9_3))))), __invokedynamic1068_110(9642, (7856006175078450750L ^ life9_3)), __invokedynamic1068_111(28420, (5620680524976245905L ^ life9_3)), 0x1.0p8f, 0x1.0p8f);
    if (!((__call1068_114(__fieldRead1068_113(receiver)) != null))) {
        break lexical_join_438;
    }
    if (!((!__call1068_118(__call1068_116(__fieldRead1068_115(receiver)), __fieldRead1068_117(receiver))))) {
        break lexical_join_438;
    }
    __fieldWrite1068_121(receiver, __call1068_120(__fieldRead1068_119(receiver)));
    __call1068_122(receiver);
    __call1068_125(__call1068_124(__fieldRead1068_123(receiver)));
    }
    if (!((__fieldRead1068_126(receiver) != null))) {
        break lexical_join_448;
    }
    __call1068_128(receiver, p1, p2, __fieldRead1068_127(receiver));
    break lexical_join_453;
    }
    __call1068_130(receiver, p1, p2, __fieldRead1068_129());
    }
    life21_488 = (p5 - p1);
    life22_492 = (p6 - p2);
    if (!((life21_488 >= (p3 - __invokedynamic1068_131(6339, (5947636547788159818L ^ life9_3)))))) {
        break lexical_join_489;
    }
    if (!((life21_488 <= (p3 - 5)))) {
        break lexical_join_489;
    }
    if (!((life22_492 >= 0))) {
        break lexical_join_489;
    }
    if (!((life22_492 <= __invokedynamic1068_132(28420, (5620680524976245905L ^ life9_3))))) {
        break lexical_join_489;
    }
    __call1068_134(__fieldRead1068_133(receiver), life20_238);
    break lexical_join_526;
    }
    if (!((life21_488 >= (((p3 - life16_193) - __invokedynamic1068_135(6339, (5947636547788159818L ^ life9_3))) - 2)))) {
        break lexical_join_526;
    }
    if (!((life21_488 <= ((p3 - __invokedynamic1068_136(6339, (5947636547788159818L ^ life9_3))) - 2)))) {
        break lexical_join_526;
    }
    if (!((life22_492 >= 0))) {
        break lexical_join_526;
    }
    if (!((life22_492 <= __invokedynamic1068_137(28420, (5620680524976245905L ^ life9_3))))) {
        break lexical_join_526;
    }
    __call1068_139(__fieldRead1068_138(receiver), life18_226);
    }
    if (!((!__fieldRead1068_142(__fieldRead1068_141(__fieldRead1068_140(receiver)))))) {
        break lexical_join_533;
    }
    if (!(p7)) {
        break lexical_join_735;
    }
    }
    __call1068_146(__call1068_144(__fieldRead1068_143(receiver)), __fieldRead1068_145());
    __call1068_150(p1, p2, (p1 + __invokedynamic1068_147(31434, (2119650631118805334L ^ life9_3))), (p2 + __invokedynamic1068_148(31434, (2119650631118805334L ^ life9_3))), __invokedynamic1068_149(17290, (4711659400891293721L ^ life9_3)));
    __call1068_151(0x1.0p0f, 0x1.0p0f, 0x1.0p0f, 0x1.0p0f);
    life23_626 = (p5 - p1);
    life24_630 = (p6 - p2);
    if (!(__call1068_152(receiver))) {
        break lexical_join_625;
    }
    if (!((life23_626 < __invokedynamic1068_153(31434, (2119650631118805334L ^ life9_3))))) {
        break lexical_join_608;
    }
    if (!((life23_626 > __invokedynamic1068_154(18527, (5146347972035898310L ^ life9_3))))) {
        break lexical_join_608;
    }
    __call1068_157(p1, p2, 0x0.0p0f, 0x1.0p5f, __invokedynamic1068_155(31434, (2119650631118805334L ^ life9_3)), __invokedynamic1068_156(31434, (2119650631118805334L ^ life9_3)), 0x1.0p8f, 0x1.0p8f);
    break lexical_join_625;
    }
    __call1068_160(p1, p2, 0x0.0p0f, 0x0.0p0f, __invokedynamic1068_158(31434, (2119650631118805334L ^ life9_3)), __invokedynamic1068_159(31434, (2119650631118805334L ^ life9_3)), 0x1.0p8f, 0x1.0p8f);
    }
    if (!(__call1068_162(__fieldRead1068_161(receiver), receiver, p0))) {
        break lexical_join_680;
    }
    if (!((life23_626 < __invokedynamic1068_163(18527, (5146347972035898310L ^ life9_3))))) {
        break lexical_join_663;
    }
    if (!((life24_630 < __invokedynamic1068_164(18527, (5146347972035898310L ^ life9_3))))) {
        break lexical_join_663;
    }
    __call1068_167(p1, p2, 0x1.8p6f, 0x1.0p5f, __invokedynamic1068_165(31434, (2119650631118805334L ^ life9_3)), __invokedynamic1068_166(31434, (2119650631118805334L ^ life9_3)), 0x1.0p8f, 0x1.0p8f);
    break lexical_join_680;
    }
    __call1068_170(p1, p2, 0x1.8p6f, 0x0.0p0f, __invokedynamic1068_168(31434, (2119650631118805334L ^ life9_3)), __invokedynamic1068_169(31434, (2119650631118805334L ^ life9_3)), 0x1.0p8f, 0x1.0p8f);
    }
    if (!(__call1068_172(__fieldRead1068_171(receiver), receiver, p0))) {
        break lexical_join_735;
    }
    if (!((life23_626 < __invokedynamic1068_173(18527, (5146347972035898310L ^ life9_3))))) {
        break lexical_join_718;
    }
    if (!((life24_630 > __invokedynamic1068_174(18527, (5146347972035898310L ^ life9_3))))) {
        break lexical_join_718;
    }
    __call1068_177(p1, p2, 0x1.0p6f, 0x1.0p5f, __invokedynamic1068_175(31434, (2119650631118805334L ^ life9_3)), __invokedynamic1068_176(31434, (2119650631118805334L ^ life9_3)), 0x1.0p8f, 0x1.0p8f);
    break lexical_join_735;
    }
    __call1068_180(p1, p2, 0x1.0p6f, 0x0.0p0f, __invokedynamic1068_178(31434, (2119650631118805334L ^ life9_3)), __invokedynamic1068_179(31434, (2119650631118805334L ^ life9_3)), 0x1.0p8f, 0x1.0p8f);
    }
    return;
}
public static void h1068_0(moom.Oo p0) throws Throwable {
    throw __call1106800_0(p0);
}
public static void h1068_1(moom.Oo p0) throws Throwable {
    throw __call1106801_0(p0);
}
public static void h1068_2(moom.Oo p0) throws Throwable {
    throw __call1106802_0(p0);
}
public static void h1068_3(moom.Oo p0) throws Throwable {
    throw __call1106803_0(p0);
}
public static void h1068_4(moom.Oo p0) throws Throwable {
    throw __call1106804_0(p0);
}
public static void h1068_5(moom.Oo p0) throws Throwable {
    throw __call1106805_0(p0);
}
public static void h1068_6(moom.Oo p0) throws Throwable {
    throw __call1106806_0(p0);
}
public static void h1068_7(moom.Oo p0) throws Throwable {
    throw __call1106807_0(p0);
}
public static void h1068_8(moom.Oo p0) throws Throwable {
    throw __call1106808_0(p0);
}
public static void h1068_9(moom.Oo p0) throws Throwable {
    throw __call1106809_0(p0);
}
public static void h1068_10(moom.Oo p0) throws Throwable {
    throw __call1106810_0(p0);
}
public static void h1068_11(moom.Oo p0) throws Throwable {
    throw __call1106811_0(p0);
}
public static void h1068_12(moom.Oo p0) throws Throwable {
    throw __call1106812_0(p0);
}
public static void h1068_13(moom.Oo p0) throws Throwable {
    throw __call1106813_0(p0);
}
public static void h1068_14(moom.Oo p0) throws Throwable {
    throw __call1106814_0(p0);
}
public static void h1068_15(moom.Oo p0) throws Throwable {
    throw __call1106815_0(p0);
}
public static void h1068_16(moom.Oo p0) throws Throwable {
    throw __call1106816_0(p0);
}
public static void h1068_17(moom.Oo p0) throws Throwable {
    throw __call1106817_0(p0);
}
public static void h1068_18(moom.Oo p0) throws Throwable {
    throw __call1106818_0(p0);
}
public static void h1068_19(moom.Oo p0) throws Throwable {
    throw __call1106819_0(p0);
}
public static void h1068_20(moom.Oo p0) throws Throwable {
    throw __call1106820_0(p0);
}
public static void h1068_21(moom.Oo p0) throws Throwable {
    throw __call1106821_0(p0);
}
public static void h1068_22(moom.Oo p0) throws Throwable {
    throw __call1106822_0(p0);
}
public static void h1068_23(moom.Oo p0) throws Throwable {
    throw __call1106823_0(p0);
}
public static void h1068_24(moom.Oo p0) throws Throwable {
    throw __call1106824_0(p0);
}
public static void h1068_25(moom.Oo p0) throws Throwable {
    throw __call1106825_0(p0);
}
public static void h1068_26(moom.Oo p0) throws Throwable {
    throw __call1106826_0(p0);
}
public static void h1068_27(moom.Oo p0) throws Throwable {
    throw __call1106827_0(p0);
}
public static void h1068_28(moom.Oo p0) throws Throwable {
    throw __call1106828_0(p0);
}
public static void h1068_29(moom.Oo p0) throws Throwable {
    throw __call1106829_0(p0);
}
public static void h1068_30(moom.Oo p0) throws Throwable {
    throw __call1106830_0(p0);
}
private static native long __fieldRead1068_0() throws Throwable;
private static native moom.jL __fieldRead1068_1(moom.iu a0) throws Throwable;
private static native boolean __fieldRead1068_2(moom.jL a0) throws Throwable;
private static native moom.jL __fieldRead1068_3(moom.iu a0) throws Throwable;
private static native void __fieldWrite1068_4(moom.jL a0, int a1) throws Throwable;
private static native moom.jL __fieldRead1068_5(moom.iu a0) throws Throwable;
private static native long __invokedynamic1068_6(int a0, long a1) throws Throwable;
private static native void __fieldWrite1068_7(moom.jL a0, long a1) throws Throwable;
private static native moom.jL __fieldRead1068_8(moom.iu a0) throws Throwable;
private static native void __fieldWrite1068_9(moom.jL a0, java.lang.String a1) throws Throwable;
private static native moom.jL __fieldRead1068_10(moom.iu a0) throws Throwable;
private static native void __fieldWrite1068_11(moom.jL a0, java.lang.String a1) throws Throwable;
private static native java.util.concurrent.ThreadPoolExecutor __fieldRead1068_12() throws Throwable;
private static native java.lang.Runnable __invokedynamic1068_13(moom.iu a0) throws Throwable;
private static native java.util.concurrent.Future __call1068_14(java.util.concurrent.ThreadPoolExecutor a0, java.lang.Runnable a1) throws Throwable;
private static native moom.jL __fieldRead1068_15(moom.iu a0) throws Throwable;
private static native int __fieldRead1068_16(moom.jL a0) throws Throwable;
private static native int __invokedynamic1068_17(int a0, long a1) throws Throwable;
private static native moom.jL __fieldRead1068_18(moom.iu a0) throws Throwable;
private static native int __fieldRead1068_19(moom.jL a0) throws Throwable;
private static native int __invokedynamic1068_20(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1068_21(moom.iu a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1068_22(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.jL __fieldRead1068_23(moom.iu a0) throws Throwable;
private static native java.lang.String __fieldRead1068_24(moom.jL a0) throws Throwable;
private static native int __invokedynamic1068_25(int a0, long a1) throws Throwable;
private static native int __invokedynamic1068_26(int a0, long a1) throws Throwable;
private static native int __call1068_27(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, float a2, float a3, int a4) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1068_28(moom.iu a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1068_29(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.jL __fieldRead1068_30(moom.iu a0) throws Throwable;
private static native java.lang.String __fieldRead1068_31(moom.jL a0) throws Throwable;
private static native int __invokedynamic1068_32(int a0, long a1) throws Throwable;
private static native java.util.List __call1068_33(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, int a2) throws Throwable;
private static native int __call1068_34(java.util.List a0) throws Throwable;
private static native int __call1068_35(int a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1068_36(moom.iu a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1068_37(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.Object __call1068_38(java.util.List a0, int a1) throws Throwable;
private static native java.lang.String __cast1068_39(java.lang.Object a0) throws Throwable;
private static native int __invokedynamic1068_40(int a0, long a1) throws Throwable;
private static native int __invokedynamic1068_41(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1068_42(moom.iu a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1068_43(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead1068_44(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native int __invokedynamic1068_45(int a0, long a1) throws Throwable;
private static native int __call1068_46(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, float a2, float a3, int a4) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead1068_47() throws Throwable;
private static native moom.jL __fieldRead1068_48(moom.iu a0) throws Throwable;
private static native java.lang.String __fieldRead1068_49(moom.jL a0) throws Throwable;
private static native java.lang.String __invokedynamic1068_50(net.minecraft.util.EnumChatFormatting a0, java.lang.String a1) throws Throwable;
private static native moom.jL __fieldRead1068_51(moom.iu a0) throws Throwable;
private static native java.lang.String __fieldRead1068_52(moom.jL a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1068_53(moom.iu a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1068_54(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __call1068_55(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1068_56(moom.iu a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1068_57(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __invokedynamic1068_58(int a0, long a1) throws Throwable;
private static native int __invokedynamic1068_59(int a0, long a1) throws Throwable;
private static native int __call1068_60(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, float a2, float a3, int a4) throws Throwable;
private static native moom.jL __fieldRead1068_61(moom.iu a0) throws Throwable;
private static native java.lang.String __fieldRead1068_62(moom.jL a0) throws Throwable;
private static native moom.jL __fieldRead1068_63(moom.iu a0) throws Throwable;
private static native boolean __fieldRead1068_64(moom.jL a0) throws Throwable;
private static native moom.jL __fieldRead1068_65(moom.iu a0) throws Throwable;
private static native long __fieldRead1068_66(moom.jL a0) throws Throwable;
private static native long __invokedynamic1068_67(int a0, long a1) throws Throwable;
private static native int __numericCompare1068_68(long a0, long a1) throws Throwable;
private static native moom.jL __fieldRead1068_69(moom.iu a0) throws Throwable;
private static native long __fieldRead1068_70(moom.jL a0) throws Throwable;
private static native int __numericCompare1068_71(long a0, long a1) throws Throwable;
private static native moom.jL __fieldRead1068_72(moom.iu a0) throws Throwable;
private static native long __fieldRead1068_73(moom.jL a0) throws Throwable;
private static native long __invokedynamic1068_74(int a0, long a1) throws Throwable;
private static native int __numericCompare1068_75(long a0, long a1) throws Throwable;
private static native moom.jL __fieldRead1068_76(moom.iu a0) throws Throwable;
private static native long __fieldRead1068_77(moom.jL a0) throws Throwable;
private static native long __invokedynamic1068_78(int a0, long a1) throws Throwable;
private static native int __numericCompare1068_79(long a0, long a1) throws Throwable;
private static native moom.jL __fieldRead1068_80(moom.iu a0) throws Throwable;
private static native long __fieldRead1068_81(moom.jL a0) throws Throwable;
private static native long __invokedynamic1068_82(int a0, long a1) throws Throwable;
private static native int __numericCompare1068_83(long a0, long a1) throws Throwable;
private static native moom.jL __fieldRead1068_84(moom.iu a0) throws Throwable;
private static native long __fieldRead1068_85(moom.jL a0) throws Throwable;
private static native long __invokedynamic1068_86(int a0, long a1) throws Throwable;
private static native int __numericCompare1068_87(long a0, long a1) throws Throwable;
private static native moom.jL __fieldRead1068_88(moom.iu a0) throws Throwable;
private static native long __fieldRead1068_89(moom.jL a0) throws Throwable;
private static native int __numericCompare1068_90(long a0, long a1) throws Throwable;
private static native moom.jL __fieldRead1068_91(moom.iu a0) throws Throwable;
private static native long __fieldRead1068_92(moom.jL a0) throws Throwable;
private static native java.lang.String __invokedynamic1068_93(long a0) throws Throwable;
private static native moom.jL __fieldRead1068_94(moom.iu a0) throws Throwable;
private static native java.lang.String __fieldRead1068_95(moom.jL a0) throws Throwable;
private static native long __call1068_96() throws Throwable;
private static native long __invokedynamic1068_97(int a0, long a1) throws Throwable;
private static native long __invokedynamic1068_98(int a0, long a1) throws Throwable;
private static native long __invokedynamic1068_99(int a0, long a1) throws Throwable;
private static native int __invokedynamic1068_100(int a0, long a1) throws Throwable;
private static native void __call1068_101(float a0, float a1, float a2, float a3) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1068_102(moom.iu a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call1068_103(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __fieldRead1068_104() throws Throwable;
private static native void __call1068_105(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native int __invokedynamic1068_106(int a0, long a1) throws Throwable;
private static native int __invokedynamic1068_107(int a0, long a1) throws Throwable;
private static native int __invokedynamic1068_108(int a0, long a1) throws Throwable;
private static native int __invokedynamic1068_109(int a0, long a1) throws Throwable;
private static native int __invokedynamic1068_110(int a0, long a1) throws Throwable;
private static native int __invokedynamic1068_111(int a0, long a1) throws Throwable;
private static native void __call1068_112(int a0, int a1, float a2, float a3, int a4, int a5, float a6, float a7) throws Throwable;
private static native moom.jL __fieldRead1068_113(moom.iu a0) throws Throwable;
private static native java.lang.String __call1068_114(moom.jL a0) throws Throwable;
private static native moom.jL __fieldRead1068_115(moom.iu a0) throws Throwable;
private static native java.lang.String __call1068_116(moom.jL a0) throws Throwable;
private static native java.lang.String __fieldRead1068_117(moom.iu a0) throws Throwable;
private static native boolean __call1068_118(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native moom.jL __fieldRead1068_119(moom.iu a0) throws Throwable;
private static native java.lang.String __call1068_120(moom.jL a0) throws Throwable;
private static native void __fieldWrite1068_121(moom.iu a0, java.lang.String a1) throws Throwable;
private static native void __call1068_122(moom.iu a0) throws Throwable;
private static native net.minecraft.client.gui.GuiMultiplayer __fieldRead1068_123(moom.iu a0) throws Throwable;
private static native moom.jM __call1068_124(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native void __call1068_125(moom.jM a0) throws Throwable;
private static native moom.n3 __fieldRead1068_126(moom.iu a0) throws Throwable;
private static native moom.DD __fieldRead1068_127(moom.iu a0) throws Throwable;
private static native void __call1068_128(moom.iu a0, int a1, int a2, moom.DD a3) throws Throwable;
private static native moom.DD __fieldRead1068_129() throws Throwable;
private static native void __call1068_130(moom.iu a0, int a1, int a2, moom.DD a3) throws Throwable;
private static native int __invokedynamic1068_131(int a0, long a1) throws Throwable;
private static native int __invokedynamic1068_132(int a0, long a1) throws Throwable;
private static native net.minecraft.client.gui.GuiMultiplayer __fieldRead1068_133(moom.iu a0) throws Throwable;
private static native void __call1068_134(net.minecraft.client.gui.GuiMultiplayer a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic1068_135(int a0, long a1) throws Throwable;
private static native int __invokedynamic1068_136(int a0, long a1) throws Throwable;
private static native int __invokedynamic1068_137(int a0, long a1) throws Throwable;
private static native net.minecraft.client.gui.GuiMultiplayer __fieldRead1068_138(moom.iu a0) throws Throwable;
private static native void __call1068_139(net.minecraft.client.gui.GuiMultiplayer a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1068_140(moom.iu a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1068_141(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead1068_142(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1068_143(moom.iu a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call1068_144(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __fieldRead1068_145() throws Throwable;
private static native void __call1068_146(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native int __invokedynamic1068_147(int a0, long a1) throws Throwable;
private static native int __invokedynamic1068_148(int a0, long a1) throws Throwable;
private static native int __invokedynamic1068_149(int a0, long a1) throws Throwable;
private static native void __call1068_150(int a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call1068_151(float a0, float a1, float a2, float a3) throws Throwable;
private static native boolean __call1068_152(moom.iu a0) throws Throwable;
private static native int __invokedynamic1068_153(int a0, long a1) throws Throwable;
private static native int __invokedynamic1068_154(int a0, long a1) throws Throwable;
private static native int __invokedynamic1068_155(int a0, long a1) throws Throwable;
private static native int __invokedynamic1068_156(int a0, long a1) throws Throwable;
private static native void __call1068_157(int a0, int a1, float a2, float a3, int a4, int a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic1068_158(int a0, long a1) throws Throwable;
private static native int __invokedynamic1068_159(int a0, long a1) throws Throwable;
private static native void __call1068_160(int a0, int a1, float a2, float a3, int a4, int a5, float a6, float a7) throws Throwable;
private static native net.minecraft.client.gui.GuiMultiplayer __fieldRead1068_161(moom.iu a0) throws Throwable;
private static native boolean __call1068_162(net.minecraft.client.gui.GuiMultiplayer a0, moom.iu a1, int a2) throws Throwable;
private static native int __invokedynamic1068_163(int a0, long a1) throws Throwable;
private static native int __invokedynamic1068_164(int a0, long a1) throws Throwable;
private static native int __invokedynamic1068_165(int a0, long a1) throws Throwable;
private static native int __invokedynamic1068_166(int a0, long a1) throws Throwable;
private static native void __call1068_167(int a0, int a1, float a2, float a3, int a4, int a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic1068_168(int a0, long a1) throws Throwable;
private static native int __invokedynamic1068_169(int a0, long a1) throws Throwable;
private static native void __call1068_170(int a0, int a1, float a2, float a3, int a4, int a5, float a6, float a7) throws Throwable;
private static native net.minecraft.client.gui.GuiMultiplayer __fieldRead1068_171(moom.iu a0) throws Throwable;
private static native boolean __call1068_172(net.minecraft.client.gui.GuiMultiplayer a0, moom.iu a1, int a2) throws Throwable;
private static native int __invokedynamic1068_173(int a0, long a1) throws Throwable;
private static native int __invokedynamic1068_174(int a0, long a1) throws Throwable;
private static native int __invokedynamic1068_175(int a0, long a1) throws Throwable;
private static native int __invokedynamic1068_176(int a0, long a1) throws Throwable;
private static native void __call1068_177(int a0, int a1, float a2, float a3, int a4, int a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic1068_178(int a0, long a1) throws Throwable;
private static native int __invokedynamic1068_179(int a0, long a1) throws Throwable;
private static native void __call1068_180(int a0, int a1, float a2, float a3, int a4, int a5, float a6, float a7) throws Throwable;
private static native java.lang.Throwable __call1106800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1106801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1106802_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1106803_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1106804_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1106805_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1106806_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1106807_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1106808_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1106809_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1106810_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1106811_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1106812_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1106813_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1106814_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1106815_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1106816_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1106817_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1106818_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1106819_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1106820_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1106821_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1106822_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1106823_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1106824_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1106825_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1106826_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1106827_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1106828_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1106829_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1106830_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_69c1e39d534c9857f3e7(moom.iu a0, int a1, int a2, int a3, int a4, int a5, int a6) throws E;
private static final class __SourceHandler_69c1e39d534c9857f3e7 {

public static boolean f1816(moom.iu receiver, int p0, int p1, int p2, int p3, int p4, int p5) throws Throwable {
    long life7_3;
    life7_3 = (__fieldRead1816_0() ^ 106421970902279L);
    if ((p4 <= __invokedynamic1816_1(26402, (3535075305477960866L ^ life7_3)))) {
        if ((p4 < __invokedynamic1816_2(31434, (2119703674801678657L ^ life7_3)))) {
        if ((p4 > __invokedynamic1816_3(595, (6654636669167276495L ^ life7_3)))) {
        if (__call1816_4(receiver)) {
        __call1816_6(__fieldRead1816_5(receiver), p0);
        __call1816_8(__fieldRead1816_7(receiver));
        return true;
    }
    }
    }
        if ((p4 < __invokedynamic1816_9(18527, (5146400998538894289L ^ life7_3)))) {
        if ((p5 < __invokedynamic1816_10(18527, (5146400998538894289L ^ life7_3)))) {
        if (__call1816_12(__fieldRead1816_11(receiver), receiver, p0)) {
        __call1816_15(__fieldRead1816_13(receiver), receiver, p0, __call1816_14());
        return true;
    }
    }
    }
        if ((p4 < __invokedynamic1816_16(18527, (5146400998538894289L ^ life7_3)))) {
        if ((p5 > __invokedynamic1816_17(18527, (5146400998538894289L ^ life7_3)))) {
        if (__call1816_19(__fieldRead1816_18(receiver), receiver, p0)) {
        __call1816_22(__fieldRead1816_20(receiver), receiver, p0, __call1816_21());
        return true;
    }
    }
    }
    }
    __call1816_24(__fieldRead1816_23(receiver), p0);
    if (((__call1816_25() - __fieldRead1816_26(receiver)) < __invokedynamic1816_27(2171, (5652224620042710707L ^ life7_3)))) {
        __call1816_29(__fieldRead1816_28(receiver));
    }
    __fieldWrite1816_31(receiver, __call1816_30());
    return false;
}
public static void h1816_0(moom.Oo p0) throws Throwable {
    throw __call1181600_0(p0);
}
public static void h1816_1(moom.Oo p0) throws Throwable {
    throw __call1181601_0(p0);
}
public static void h1816_2(moom.Oo p0) throws Throwable {
    throw __call1181602_0(p0);
}
public static void h1816_3(moom.Oo p0) throws Throwable {
    throw __call1181603_0(p0);
}
public static void h1816_4(moom.Oo p0) throws Throwable {
    throw __call1181604_0(p0);
}
public static void h1816_5(moom.Oo p0) throws Throwable {
    throw __call1181605_0(p0);
}
public static void h1816_6(moom.Oo p0) throws Throwable {
    throw __call1181606_0(p0);
}
public static void h1816_7(moom.Oo p0) throws Throwable {
    throw __call1181607_0(p0);
}
public static void h1816_8(moom.Oo p0) throws Throwable {
    throw __call1181608_0(p0);
}
public static void h1816_9(moom.Oo p0) throws Throwable {
    throw __call1181609_0(p0);
}
public static void h1816_10(moom.Oo p0) throws Throwable {
    throw __call1181610_0(p0);
}
private static native long __fieldRead1816_0() throws Throwable;
private static native int __invokedynamic1816_1(int a0, long a1) throws Throwable;
private static native int __invokedynamic1816_2(int a0, long a1) throws Throwable;
private static native int __invokedynamic1816_3(int a0, long a1) throws Throwable;
private static native boolean __call1816_4(moom.iu a0) throws Throwable;
private static native net.minecraft.client.gui.GuiMultiplayer __fieldRead1816_5(moom.iu a0) throws Throwable;
private static native void __call1816_6(net.minecraft.client.gui.GuiMultiplayer a0, int a1) throws Throwable;
private static native net.minecraft.client.gui.GuiMultiplayer __fieldRead1816_7(moom.iu a0) throws Throwable;
private static native void __call1816_8(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native int __invokedynamic1816_9(int a0, long a1) throws Throwable;
private static native int __invokedynamic1816_10(int a0, long a1) throws Throwable;
private static native net.minecraft.client.gui.GuiMultiplayer __fieldRead1816_11(moom.iu a0) throws Throwable;
private static native boolean __call1816_12(net.minecraft.client.gui.GuiMultiplayer a0, moom.iu a1, int a2) throws Throwable;
private static native net.minecraft.client.gui.GuiMultiplayer __fieldRead1816_13(moom.iu a0) throws Throwable;
private static native boolean __call1816_14() throws Throwable;
private static native void __call1816_15(net.minecraft.client.gui.GuiMultiplayer a0, moom.iu a1, int a2, boolean a3) throws Throwable;
private static native int __invokedynamic1816_16(int a0, long a1) throws Throwable;
private static native int __invokedynamic1816_17(int a0, long a1) throws Throwable;
private static native net.minecraft.client.gui.GuiMultiplayer __fieldRead1816_18(moom.iu a0) throws Throwable;
private static native boolean __call1816_19(net.minecraft.client.gui.GuiMultiplayer a0, moom.iu a1, int a2) throws Throwable;
private static native net.minecraft.client.gui.GuiMultiplayer __fieldRead1816_20(moom.iu a0) throws Throwable;
private static native boolean __call1816_21() throws Throwable;
private static native void __call1816_22(net.minecraft.client.gui.GuiMultiplayer a0, moom.iu a1, int a2, boolean a3) throws Throwable;
private static native net.minecraft.client.gui.GuiMultiplayer __fieldRead1816_23(moom.iu a0) throws Throwable;
private static native void __call1816_24(net.minecraft.client.gui.GuiMultiplayer a0, int a1) throws Throwable;
private static native long __call1816_25() throws Throwable;
private static native long __fieldRead1816_26(moom.iu a0) throws Throwable;
private static native long __invokedynamic1816_27(int a0, long a1) throws Throwable;
private static native net.minecraft.client.gui.GuiMultiplayer __fieldRead1816_28(moom.iu a0) throws Throwable;
private static native void __call1816_29(net.minecraft.client.gui.GuiMultiplayer a0) throws Throwable;
private static native long __call1816_30() throws Throwable;
private static native void __fieldWrite1816_31(moom.iu a0, long a1) throws Throwable;
private static native java.lang.Throwable __call1181600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1181601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1181602_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1181603_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1181604_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1181605_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1181606_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1181607_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1181608_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1181609_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1181610_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_41602a3114febdcf0a35(moom.iu a0) throws E;
private static final class __SourceHandler_41602a3114febdcf0a35 {

public static void f445(moom.iu receiver) throws Throwable {
    long life1_3;
    ByteBuf life3_25;
    ByteBuf life4_28;
    java.awt.image.BufferedImage life5_34;
    life1_3 = (__fieldRead445_0() ^ 89166802615116L);
    if ((__call445_2(__fieldRead445_1(receiver)) == null)) {
        __call445_6(__call445_4(__fieldRead445_3(receiver)), __fieldRead445_5(receiver));
        __fieldWrite445_7(receiver, null);
    } else {
        life3_25 = __call445_11(__call445_9(__fieldRead445_8(receiver)), __fieldRead445_10());
        life4_28 = __call445_12(life3_25);
        life5_34 = __call445_13(new ByteBufInputStream(life4_28));
        __call445_16(((__call445_14(life5_34) == __invokedynamic445_15(15621, (8139211644769585363L ^ life1_3))) ? 1 : 0), "Must be 64 pixels wide", new java.lang.Object[0]);
        __call445_19(((__call445_17(life5_34) == __invokedynamic445_18(22525, (8184789244177719849L ^ life1_3))) ? 1 : 0), "Must be 64 pixels high", new java.lang.Object[0]);
        __call445_20(life3_25);
        __call445_21(life4_28);
        if ((__fieldRead445_22(receiver) == null)) {
        __fieldWrite445_25(receiver, new moom.n3(__call445_23(life5_34), __call445_24(life5_34)));
        __call445_30(__call445_27(__fieldRead445_26(receiver)), __fieldRead445_28(receiver), __fieldRead445_29(receiver));
    } else {
        
    }
        __call445_36(life5_34, 0, 0, __call445_31(life5_34), __call445_32(life5_34), __call445_34(__fieldRead445_33(receiver)), 0, __call445_35(life5_34));
        __call445_38(__fieldRead445_37(receiver));
    }
    return;
}
public static void h445_0(java.lang.Throwable p0) throws Throwable {
    throw __call3044500_0(p0);
}
public static void h445_1(java.lang.Throwable p0) throws Throwable {
    throw __call3044501_0(p0);
}
public static void h445_2(java.lang.Throwable p0) throws Throwable {
    throw __call3044502_0(p0);
}
public static void h445_3(java.lang.Throwable p0, moom.iu p1, ByteBuf p2, ByteBuf p3) throws Throwable {
    java.lang.Throwable life4_2;
    life4_2 = p0;
    __call3044503_6(__fieldRead3044503_0(), __invokedynamic3044503_5(__fieldRead3044503_2(__fieldRead3044503_1(p1)), __fieldRead3044503_4(__fieldRead3044503_3(p1))), life4_2);
    __call3044503_8(__fieldRead3044503_7(p1), null);
    __call3044503_9(p2);
    __call3044503_10(p3);
    return;
}
public static void h445_4(java.lang.Throwable p0, ByteBuf p1, ByteBuf p2) throws Throwable {
    java.lang.Throwable life3_2;
    life3_2 = p0;
    __call3044504_0(p1);
    __call3044504_1(p2);
    throw life3_2;
}
public static void h445_5(java.lang.Throwable p0) throws Throwable {
    throw __call3044505_0(p0);
}
private static native long __fieldRead445_0() throws Throwable;
private static native moom.jL __fieldRead445_1(moom.iu a0) throws Throwable;
private static native java.lang.String __call445_2(moom.jL a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead445_3(moom.iu a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call445_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __fieldRead445_5(moom.iu a0) throws Throwable;
private static native void __call445_6(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native void __fieldWrite445_7(moom.iu a0, java.lang.Object a1) throws Throwable;
private static native moom.jL __fieldRead445_8(moom.iu a0) throws Throwable;
private static native java.lang.String __call445_9(moom.jL a0) throws Throwable;
private static native java.nio.charset.Charset __fieldRead445_10() throws Throwable;
private static native ByteBuf __call445_11(java.lang.String a0, java.nio.charset.Charset a1) throws Throwable;
private static native ByteBuf __call445_12(ByteBuf a0) throws Throwable;
private static native java.awt.image.BufferedImage __call445_13(ByteBufInputStream a0) throws Throwable;
private static native int __call445_14(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __invokedynamic445_15(int a0, long a1) throws Throwable;
private static native void __call445_16(int a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native int __call445_17(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __invokedynamic445_18(int a0, long a1) throws Throwable;
private static native void __call445_19(int a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native boolean __call445_20(ByteBuf a0) throws Throwable;
private static native boolean __call445_21(ByteBuf a0) throws Throwable;
private static native moom.n3 __fieldRead445_22(moom.iu a0) throws Throwable;
private static native int __call445_23(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __call445_24(java.awt.image.BufferedImage a0) throws Throwable;
private static native void __fieldWrite445_25(moom.iu a0, moom.n3 a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead445_26(moom.iu a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call445_27(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __fieldRead445_28(moom.iu a0) throws Throwable;
private static native moom.n3 __fieldRead445_29(moom.iu a0) throws Throwable;
private static native boolean __call445_30(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1, moom.n3 a2) throws Throwable;
private static native int __call445_31(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __call445_32(java.awt.image.BufferedImage a0) throws Throwable;
private static native moom.n3 __fieldRead445_33(moom.iu a0) throws Throwable;
private static native int[] __call445_34(moom.n3 a0) throws Throwable;
private static native int __call445_35(java.awt.image.BufferedImage a0) throws Throwable;
private static native int[] __call445_36(java.awt.image.BufferedImage a0, int a1, int a2, int a3, int a4, int[] a5, int a6, int a7) throws Throwable;
private static native moom.n3 __fieldRead445_37(moom.iu a0) throws Throwable;
private static native void __call445_38(moom.n3 a0) throws Throwable;
private static native java.lang.Throwable __call3044500_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3044501_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3044502_0(java.lang.Throwable a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3044503_0() throws Throwable;
private static native moom.jL __fieldRead3044503_1(moom.iu a0) throws Throwable;
private static native java.lang.String __fieldRead3044503_2(moom.jL a0) throws Throwable;
private static native moom.jL __fieldRead3044503_3(moom.iu a0) throws Throwable;
private static native java.lang.String __fieldRead3044503_4(moom.jL a0) throws Throwable;
private static native java.lang.String __invokedynamic3044503_5(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call3044503_6(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Throwable a2) throws Throwable;
private static native moom.jL __fieldRead3044503_7(moom.iu a0) throws Throwable;
private static native void __call3044503_8(moom.jL a0, java.lang.Object a1) throws Throwable;
private static native boolean __call3044503_9(ByteBuf a0) throws Throwable;
private static native boolean __call3044503_10(ByteBuf a0) throws Throwable;
private static native boolean __call3044504_0(ByteBuf a0) throws Throwable;
private static native boolean __call3044504_1(ByteBuf a0) throws Throwable;
private static native java.lang.Throwable __call3044505_0(java.lang.Throwable a0) throws Throwable;

}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8085_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/iu"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 29550);
    if (((moom.iu.q)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (moom.iu.p)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(moom.iu.r)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.iu.r)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/iu", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (moom.iu.q)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((moom.iu.q)[life3_8])).longValue();
}


private static long b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = moom.iu.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.Throwable a(java.lang.Throwable p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 1581;
      if (n[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(p1 >>> 56),
            (byte)(p1 >>> 48),
            (byte)(p1 >>> 40),
            (byte)(p1 >>> 32),
            (byte)(p1 >>> 24),
            (byte)(p1 >>> 16),
            (byte)(p1 >>> 8),
            (byte)p1
         };
         long var5 = m[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])o.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               o.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/iu", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         n[var3] = var15;
      }

      return n[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.iu.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8087_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/iu"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected void a(int p0, int p1, moom.DD p2) {
long local4 = (moom.iu.l ^ 73156308071587L);
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(this.f)).a__ok())).a__Void(((moom.DD)(p2)));
    moom.kZ.l();
    net.minecraft.client.gui.Gui.a(((int)(p0)), ((int)(p1)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((int)(__sourceIntrinsic_c0a462008c23_originalDynamicSite1527_5(31434, (2119666011226505445L ^ local4)))), ((int)(__sourceIntrinsic_c0a462008c23_originalDynamicSite1527_6(31434, (2119666011226505445L ^ local4)))), ((float)(0x1.0p5f)), ((float)(0x1.0p5f)));
    moom.kZ.k();
    return;
}


public void a(int p0, int p1, int p2, int p3, int p4, int p5, int p6, boolean p7) { __sourceHandlerCall_3ad21d92eb03649e5c13(this, p0, p1, p2, p3, p4, p5, p6, p7); }


public boolean a__Boolean(int p0, int p1, int p2, int p3, int p4, int p5) { return __sourceHandlerCall_69c1e39d534c9857f3e7(this, p0, p1, p2, p3, p4, p5); }


public void a(int p0, int p1, int p2) {
return;
}


public void a(int p0, int p1, int p2, int p3, int p4, int p5) {
return;
}


private boolean a__Boolean() {
return ((1) != 0);
}


private void a__Void() { __sourceHandlerCall_41602a3114febdcf0a35(this); }


public moom.jL a() {
return this.g;
}


private void lambda$drawEntry$0() {
long local1 = (moom.iu.l ^ 45608317223056L);
    try {
        ((moom.jZ)(((net.minecraft.client.gui.GuiMultiplayer)(this.e)).a__jZ())).a(((moom.jL)(this.g)));
    } catch (java.net.UnknownHostException caught3_0) {
        ((moom.jL)(this.g)).e = ((long)(__sourceIntrinsic_48fdf630f644_invokedynamic6801_6(21336, (8483051185278003211L ^ local1))));
        ((moom.jL)(this.g)).d = ((java.lang.String)(__sourceIntrinsic_48fdf630f644_invokedynamic6801_10(net.minecraft.util.EnumChatFormatting.DARK_RED)));
    } catch (java.lang.Exception caught3_1) {
        ((moom.jL)(this.g)).e = ((long)(__sourceIntrinsic_48fdf630f644_invokedynamic6801_13(3898, (1235434706817709159L ^ local1))));
        ((moom.jL)(this.g)).d = ((java.lang.String)(__sourceIntrinsic_48fdf630f644_invokedynamic6801_17(net.minecraft.util.EnumChatFormatting.DARK_RED)));
    }
    return;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9f9206ebda1a_originalDynamicSite4547_5(java.lang.String a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c0a462008c23_originalDynamicSite1527_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c0a462008c23_originalDynamicSite1527_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8087_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8085_0() throws E;

private static native <E extends Throwable> long __sourceIntrinsic_48fdf630f644_invokedynamic6801_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_48fdf630f644_invokedynamic6801_10(net.minecraft.util.EnumChatFormatting a0) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_48fdf630f644_invokedynamic6801_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_48fdf630f644_invokedynamic6801_17(net.minecraft.util.EnumChatFormatting a0) throws E;
}
