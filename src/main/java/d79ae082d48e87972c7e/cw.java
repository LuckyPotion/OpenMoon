package com.moon;


public class cw implements com.moon.cu {

private java.util.concurrent.ExecutorService a;

private static java.lang.String b;

private static long c;

private static java.lang.String[] d;

private static java.lang.String[] e;

private static java.util.Map f;

private static long[] g;

private static java.lang.Long[] h;

private static java.util.Map i;

public cw() {
super();
    this.a = java.util.concurrent.Executors.newSingleThreadExecutor();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(-4792449079347657915L)), ((long)(131192381871500676L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(6284308765661L)))));
    java.lang.Object __sourceSpill62_6 = null;
    f = ((java.util.Map)(new java.util.HashMap(13)));
    com.moon.cw.b(((java.lang.String)(__sourceSpill62_6)));
    long local11_life9 = (com.moon.cw.c ^ 124650560686638L);
    javax.crypto.Cipher local13_life11;
    javax.crypto.Cipher __sourceSpill62_13 = (local13_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill62_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill62_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill62_16 = new byte[8];
    (__sourceSpill62_16)[0] = ((byte) ((int) (local11_life9 >>> 56)));
    int local14_life17 = 1;
    while ((local14_life17 < 8)) {
        (__sourceSpill62_16)[local14_life17] = ((byte) ((int) ((local11_life9 << (local14_life17 * 8)) >>> 56)));
        local14_life17 += 1;
    }
    byte[] __sourcePreallocation62_18 = __sourceSpill62_16;
    ((javax.crypto.Cipher)(__sourceSpill62_13)).init(((int)(__sourceSpill62_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill62_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation62_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life21 = new java.lang.String[11];
    int local18_life22 = 0;
    java.lang.String local17_life23;
    int local19_life25 = ((java.lang.String)((local17_life23 = "E?«9¾){2@Ò¥N¿F¬\"\032P@¼\nzÌR\030½GÕ'8¹E¹b?]'P½aa\006 i\006¯ëw ÍnOe î?O§©«\013H\007YµÕT.ÑdM\\çåtÚb\030TÍ¿÷£\013Ï3\032\002ÑÊ¤\003\031B¨%MQ¤qUÃ}çËÎt\0044k«»VÆ¾'WLÒENoa»\016}¦·\030úÑÌÊ\004¾1?wÈÿz<`ëqWÝ\030Â@Gç3¥Ôlrº\021Bï;h:)÷¥\033è+Âª´Í¦ì*®|\037üuÂÇ;ym¨ªADà@x¨ã8 2Î||13\006iY\020¨©\031´ ·íüåRC¨(@©eð]Ôø)\033²\002Ê)>*\030a\031ç¼([my¿×Ë(Ì|@éB±®\024fÁ\032c0ç{·§ôóF½Xo\032ºN\fÚ«v[ß;\016TFl÷îT¦eÚÌ®ÿ\024\016è¶Å×®$2A\021Î\n(høÍ¼±Ö«?)\017c<y\021IÿË\n¤ÒL\031°Â½\023Ý÷\022HhiX\016\020\n\000·¦cÇ7£=~º¬¾\002"))).length();
    int local16_life26 = 64;
    int local15_life27 = -1;
    while (true) {
        local15_life27 += 1;
        byte[] __sourceSpill62_30 = ((java.lang.String)(((java.lang.String)(local17_life23)).substring(((int)(local15_life27)), ((int)((local15_life27 + local16_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill62_31 = local13_life11;
        byte[] local21_life33 = ((javax.crypto.Cipher)(__sourceSpill62_31)).doFinal(((byte[])(__sourceSpill62_30)));
        java.lang.String __sourceSpill62_36 = ((java.lang.String)(com.moon.cw.a(((byte[])(local21_life33))))).intern();
        java.lang.String[] __sourceSpill62_37 = local20_life21;
        int __sourceSpill62_38 = local18_life22;
        local18_life22 += 1;
        (__sourceSpill62_37)[__sourceSpill62_38] = __sourceSpill62_36;
        if (!(((local15_life27 = (local15_life27 + local16_life26)) < local19_life25))) { break; }
        local16_life26 = ((java.lang.String)(local17_life23)).charAt(((int)(local15_life27)));
    }
    local19_life25 = ((java.lang.String)((local17_life23 = "bö×¶çÐ\fe¬¡éê\026ÐÔ[Î«I\001É¹DÈØ¦FÊH)ÀAÉ ò{á\031=z\030o¸+«Æ%-Ak\n´þÁ'¤çØAþG_|ù1A ¹Yo6Æ®=µlÌÜ\"ÝCEVVßq¿v/Qå¾©Ñ]a"))).length();
    local16_life26 = 80;
    local15_life27 = -1;
    while (true) {
        local15_life27 += 1;
        byte[] __sourceSpill62_43 = ((java.lang.String)(((java.lang.String)(local17_life23)).substring(((int)(local15_life27)), ((int)((local15_life27 + local16_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill62_44 = local13_life11;
        byte[] local21_life46 = ((javax.crypto.Cipher)(__sourceSpill62_44)).doFinal(((byte[])(__sourceSpill62_43)));
        java.lang.String __sourceSpill62_49 = ((java.lang.String)(com.moon.cw.a(((byte[])(local21_life46))))).intern();
        java.lang.String[] __sourceSpill62_50 = local20_life21;
        int __sourceSpill62_51 = local18_life22;
        local18_life22 += 1;
        (__sourceSpill62_50)[__sourceSpill62_51] = __sourceSpill62_49;
        if (!(((local15_life27 = (local15_life27 + local16_life26)) < local19_life25))) { break; }
        local16_life26 = ((java.lang.String)(local17_life23)).charAt(((int)(local15_life27)));
    }
    d = ((java.lang.String[])(local20_life21));
    e = ((java.lang.String[])(new java.lang.String[11]));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life57;
    javax.crypto.Cipher __sourceSpill62_59 = (local0_life57 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill62_60 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill62_61 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill62_62 = new byte[8];
    (__sourceSpill62_62)[0] = ((byte) ((int) (local11_life9 >>> 56)));
    int local1_life63 = 1;
    while ((local1_life63 < 8)) {
        (__sourceSpill62_62)[local1_life63] = ((byte) ((int) ((local11_life9 << (local1_life63 * 8)) >>> 56)));
        local1_life63 += 1;
    }
    byte[] __sourcePreallocation62_64 = __sourceSpill62_62;
    ((javax.crypto.Cipher)(__sourceSpill62_59)).init(((int)(__sourceSpill62_60)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill62_61)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation62_64)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life67 = new long[2];
    int local3_life68 = 0;
    java.lang.String local4_life69;
    int local5_life71 = ((java.lang.String)((local4_life69 = "'ÓVg]\032´ëCU,Ö¶5ªO"))).length();
    int local2_life72 = 0;
    do {
        java.lang.String __sourceSpill62_73 = local4_life69;
        int __sourceSpill62_74 = local2_life72;
        local2_life72 += 8;
        byte[] local7_life77 = ((java.lang.String)(((java.lang.String)(__sourceSpill62_73)).substring(((int)(__sourceSpill62_74)), ((int)(local2_life72))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill62_78 = local6_life67;
        int __sourceSpill62_79 = local3_life68;
        local3_life68 += 1;
        long local8_life80 = (((((((((((long) (local7_life77)[0]) & 255L) << 56) | ((((long) (local7_life77)[1]) & 255L) << 48)) | ((((long) (local7_life77)[2]) & 255L) << 40)) | ((((long) (local7_life77)[3]) & 255L) << 32)) | ((((long) (local7_life77)[4]) & 255L) << 24)) | ((((long) (local7_life77)[5]) & 255L) << 16)) | ((((long) (local7_life77)[6]) & 255L) << 8)) | (((long) (local7_life77)[7]) & 255L));
        byte[] __sourceSpill62_81 = new byte[8];
        (__sourceSpill62_81)[0] = ((byte) ((int) (local8_life80 >>> 56)));
        (__sourceSpill62_81)[1] = ((byte) ((int) (local8_life80 >>> 48)));
        (__sourceSpill62_81)[2] = ((byte) ((int) (local8_life80 >>> 40)));
        (__sourceSpill62_81)[3] = ((byte) ((int) (local8_life80 >>> 32)));
        (__sourceSpill62_81)[4] = ((byte) ((int) (local8_life80 >>> 24)));
        (__sourceSpill62_81)[5] = ((byte) ((int) (local8_life80 >>> 16)));
        (__sourceSpill62_81)[6] = ((byte) ((int) (local8_life80 >>> 8)));
        (__sourceSpill62_81)[7] = ((byte) ((int) local8_life80));
        javax.crypto.Cipher __sourceSpill62_82 = local0_life57;
        byte[] local10_life84 = ((javax.crypto.Cipher)(__sourceSpill62_82)).doFinal(((byte[])(__sourceSpill62_81)));
        (__sourceSpill62_78)[__sourceSpill62_79] = (((((((((((long) (local10_life84)[0]) & 255L) << 56) | ((((long) (local10_life84)[1]) & 255L) << 48)) | ((((long) (local10_life84)[2]) & 255L) << 40)) | ((((long) (local10_life84)[3]) & 255L) << 32)) | ((((long) (local10_life84)[4]) & 255L) << 24)) | ((((long) (local10_life84)[5]) & 255L) << 16)) | ((((long) (local10_life84)[6]) & 255L) << 8)) | (((long) (local10_life84)[7]) & 255L));
    } while ((!(local2_life72 >= local5_life71)));
    g = ((long[])(local6_life67));
    h = ((java.lang.Long[])(new java.lang.Long[2]));
}

private static native <E extends Throwable> boolean __sourceHandlerCall_d74bfed74e3fe2dfe66d(com.moon.cw a0, com.moon.cq a1, com.moon.cy a2) throws E;
private static final class __SourceHandler_d74bfed74e3fe2dfe66d {

public static boolean f49(com.moon.cw receiver, com.moon.cq p0, com.moon.cy p1) throws Throwable {
    long life3_3;
    com.moon.cQ life5_7;
    com.moon.cR life6_11;
    com.moon.cS life7_14;
    com.moon.cO life8_24;
    com.moon.cV life9_35;
    net.minecraft.util.Session life10_52;
    life3_3 = (__fieldRead49_0() ^ 120170686342094L);
    life5_7 = __call49_2(__call49_1(p1));
    life6_11 = __call49_3(life5_7, 0);
    life7_14 = __call49_4(life6_11);
    life8_24 = __call49_9(__call49_7((__call49_6(__call49_5(life7_14)))[0]), __call49_8(life7_14));
    life9_35 = __call49_13(new com.moon.cW(__call49_10(life5_7), __call49_11(life8_24), __call49_12(life5_7)));
    life10_52 = new net.minecraft.util.Session(__call49_14(life9_35), __call49_16(__call49_15(life9_35)), __call49_18(__call49_17(life9_35)), __invokedynamic49_19(14994, (6510898685656386234L ^ life3_3)));
    __call49_21(__call49_20(), p0);
    __call49_23(__call49_22(), life10_52);
    __call49_31(__call49_27(__call49_26(__call49_25(__call49_24()))), __call49_28(life10_52), __call49_30(__call49_29(life10_52)));
    org.tinylog.TaggedLogger spill49_0 = __call49_33(__call49_32());
    java.lang.String __stackOp49_36_0 = __call49_34(life10_52);
    java.lang.String __stackOp49_36_1 = __invokedynamic49_35(25393, (1950889706040005399L ^ life3_3));
    __call49_39(spill49_0, __invokedynamic49_38(__stackOp49_36_1, __stackOp49_36_0, __invokedynamic49_37(19944, (537234371038526925L ^ life3_3))));
    __call49_41(p1, __call49_40(life5_7));
    __call49_43(p1, __call49_42(life8_24));
    com.moon.hD spill49_1 = __call49_45(__call49_44());
    com.moon.hB spill49_2 = __call49_48(__call49_46(), __invokedynamic49_47(18144, (7432384874866063042L ^ life3_3)));
    java.lang.String __stackOp49_51_0 = __call49_49(p1);
    java.lang.String __stackOp49_51_1 = __invokedynamic49_50(1686, (3442897572402296503L ^ life3_3));
    __call49_59(spill49_1, __call49_58(__call49_57(__call49_55(__call49_53(spill49_2, __invokedynamic49_52(__stackOp49_51_1, __stackOp49_51_0)), __fieldRead49_54()), __invokedynamic49_56(31240, (4882605680456777557L ^ life3_3)))));
    return true;
}
public static boolean h49_0(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    __call2004900_0(local1);
    return false;
}
private static native long __fieldRead49_0() throws Throwable;
private static native java.lang.String __call49_1(com.moon.cy a0) throws Throwable;
private static native com.moon.cQ __call49_2(java.lang.String a0) throws Throwable;
private static native com.moon.cR __call49_3(com.moon.cQ a0, int a1) throws Throwable;
private static native com.moon.cS __call49_4(com.moon.cR a0) throws Throwable;
private static native com.moon.cT __call49_5(com.moon.cS a0) throws Throwable;
private static native com.moon.cU[] __call49_6(com.moon.cT a0) throws Throwable;
private static native java.lang.String __call49_7(com.moon.cU a0) throws Throwable;
private static native java.lang.String __call49_8(com.moon.cS a0) throws Throwable;
private static native com.moon.cO __call49_9(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call49_10(com.moon.cQ a0) throws Throwable;
private static native java.lang.String __call49_11(com.moon.cO a0) throws Throwable;
private static native java.lang.String __call49_12(com.moon.cQ a0) throws Throwable;
private static native com.moon.cV __call49_13(com.moon.cW a0) throws Throwable;
private static native java.lang.String __call49_14(com.moon.cV a0) throws Throwable;
private static native java.util.UUID __call49_15(com.moon.cV a0) throws Throwable;
private static native java.lang.String __call49_16(java.util.UUID a0) throws Throwable;
private static native com.moon.cW __call49_17(com.moon.cV a0) throws Throwable;
private static native java.lang.String __call49_18(com.moon.cW a0) throws Throwable;
private static native java.lang.String __invokedynamic49_19(int a0, long a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call49_20() throws Throwable;
private static native com.moon.runtime.ClientContext __call49_21(com.moon.runtime.ClientContext a0, com.moon.cq a1) throws Throwable;
private static native net.minecraft.client.Minecraft __call49_22() throws Throwable;
private static native net.minecraft.client.Minecraft __call49_23(net.minecraft.client.Minecraft a0, net.minecraft.util.Session a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call49_24() throws Throwable;
private static native com.moon.od __call49_25(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.og __call49_26(com.moon.od a0) throws Throwable;
private static native com.moon.ok __call49_27(com.moon.og a0) throws Throwable;
private static native java.lang.String __call49_28(net.minecraft.util.Session a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __call49_29(net.minecraft.util.Session a0) throws Throwable;
private static native java.util.UUID __call49_30(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native void __call49_31(com.moon.ok a0, java.lang.String a1, java.util.UUID a2) throws Throwable;
private static native com.moon.runtime.ClientContext __call49_32() throws Throwable;
private static native org.tinylog.TaggedLogger __call49_33(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.lang.String __call49_34(net.minecraft.util.Session a0) throws Throwable;
private static native java.lang.String __invokedynamic49_35(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic49_37(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic49_38(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call49_39(org.tinylog.TaggedLogger a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call49_40(com.moon.cQ a0) throws Throwable;
private static native com.moon.cy __call49_41(com.moon.cy a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call49_42(com.moon.cO a0) throws Throwable;
private static native com.moon.cy __call49_43(com.moon.cy a0, java.lang.String a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call49_44() throws Throwable;
private static native com.moon.hD __call49_45(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.hB __call49_46() throws Throwable;
private static native java.lang.String __invokedynamic49_47(int a0, long a1) throws Throwable;
private static native com.moon.hB __call49_48(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call49_49(com.moon.cy a0) throws Throwable;
private static native java.lang.String __invokedynamic49_50(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic49_52(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native com.moon.hB __call49_53(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native com.moon.b8 __fieldRead49_54() throws Throwable;
private static native com.moon.hB __call49_55(com.moon.hB a0, com.moon.b8 a1) throws Throwable;
private static native long __invokedynamic49_56(int a0, long a1) throws Throwable;
private static native com.moon.hB __call49_57(com.moon.hB a0, long a1) throws Throwable;
private static native com.moon.hA __call49_58(com.moon.hB a0) throws Throwable;
private static native void __call49_59(com.moon.hD a0, com.moon.hA a1) throws Throwable;
private static native void __call2004900_0(java.lang.Exception a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_f8e923a42fbcab1f9e61(com.moon.cw a0, com.moon.cq a1, java.lang.String a2) throws E;
private static final class __SourceHandler_f8e923a42fbcab1f9e61 {

public static boolean f50(com.moon.cw receiver, com.moon.cq p0, java.lang.String p1) throws Throwable {
    long life3_3;
    com.moon.cV life5_11;
    net.minecraft.util.Session life6_28;
    life3_3 = (__fieldRead50_0() ^ 30278033761262L);
    life5_11 = __call50_1(new com.moon.cW("", p1, ""));
    life6_28 = new net.minecraft.util.Session(__call50_2(life5_11), __call50_4(__call50_3(life5_11)), __call50_6(__call50_5(life5_11)), __invokedynamic50_7(21845, (5436529722691822929L ^ life3_3)));
    __call50_9(__call50_8(), life6_28);
    org.tinylog.TaggedLogger spill50_0 = __call50_11(__call50_10());
    java.lang.String __stackOp50_14_0 = __call50_12(life6_28);
    java.lang.String __stackOp50_14_1 = __invokedynamic50_13(4046, (3349605389981679566L ^ life3_3));
    __call50_17(spill50_0, __invokedynamic50_16(__stackOp50_14_1, __stackOp50_14_0, __invokedynamic50_15(30253, (70168057070847530L ^ life3_3))));
    __call50_19(__call50_18(), p0);
    __call50_27(__call50_23(__call50_22(__call50_21(__call50_20()))), __call50_24(life6_28), __call50_26(__call50_25(life6_28)));
    com.moon.hD spill50_1 = __call50_29(__call50_28());
    com.moon.hB spill50_2 = __call50_32(__call50_30(), __invokedynamic50_31(18144, (7432439567845734114L ^ life3_3)));
    java.lang.String __stackOp50_35_0 = __call50_33(life6_28);
    java.lang.String __stackOp50_35_1 = __invokedynamic50_34(1686, (3442957776240244375L ^ life3_3));
    __call50_43(spill50_1, __call50_42(__call50_41(__call50_39(__call50_37(spill50_2, __invokedynamic50_36(__stackOp50_35_1, __stackOp50_35_0)), __fieldRead50_38()), __invokedynamic50_40(31240, (4882475105861386101L ^ life3_3)))));
    return true;
}
public static boolean h50_0(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    __call2005000_0(local1);
    return false;
}
private static native long __fieldRead50_0() throws Throwable;
private static native com.moon.cV __call50_1(com.moon.cW a0) throws Throwable;
private static native java.lang.String __call50_2(com.moon.cV a0) throws Throwable;
private static native java.util.UUID __call50_3(com.moon.cV a0) throws Throwable;
private static native java.lang.String __call50_4(java.util.UUID a0) throws Throwable;
private static native com.moon.cW __call50_5(com.moon.cV a0) throws Throwable;
private static native java.lang.String __call50_6(com.moon.cW a0) throws Throwable;
private static native java.lang.String __invokedynamic50_7(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __call50_8() throws Throwable;
private static native net.minecraft.client.Minecraft __call50_9(net.minecraft.client.Minecraft a0, net.minecraft.util.Session a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call50_10() throws Throwable;
private static native org.tinylog.TaggedLogger __call50_11(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.lang.String __call50_12(net.minecraft.util.Session a0) throws Throwable;
private static native java.lang.String __invokedynamic50_13(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic50_15(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic50_16(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call50_17(org.tinylog.TaggedLogger a0, java.lang.String a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call50_18() throws Throwable;
private static native com.moon.runtime.ClientContext __call50_19(com.moon.runtime.ClientContext a0, com.moon.cq a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call50_20() throws Throwable;
private static native com.moon.od __call50_21(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.og __call50_22(com.moon.od a0) throws Throwable;
private static native com.moon.ok __call50_23(com.moon.og a0) throws Throwable;
private static native java.lang.String __call50_24(net.minecraft.util.Session a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __call50_25(net.minecraft.util.Session a0) throws Throwable;
private static native java.util.UUID __call50_26(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native void __call50_27(com.moon.ok a0, java.lang.String a1, java.util.UUID a2) throws Throwable;
private static native com.moon.runtime.ClientContext __call50_28() throws Throwable;
private static native com.moon.hD __call50_29(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.hB __call50_30() throws Throwable;
private static native java.lang.String __invokedynamic50_31(int a0, long a1) throws Throwable;
private static native com.moon.hB __call50_32(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call50_33(net.minecraft.util.Session a0) throws Throwable;
private static native java.lang.String __invokedynamic50_34(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic50_36(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native com.moon.hB __call50_37(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native com.moon.b8 __fieldRead50_38() throws Throwable;
private static native com.moon.hB __call50_39(com.moon.hB a0, com.moon.b8 a1) throws Throwable;
private static native long __invokedynamic50_40(int a0, long a1) throws Throwable;
private static native com.moon.hB __call50_41(com.moon.hB a0, long a1) throws Throwable;
private static native com.moon.hA __call50_42(com.moon.hB a0) throws Throwable;
private static native void __call50_43(com.moon.hD a0, com.moon.hA a1) throws Throwable;
private static native void __call2005000_0(java.lang.Exception a0) throws Throwable;

}


public static java.lang.String b() {
return com.moon.cw.b;
}


public static void b(java.lang.String p0) {
b = ((java.lang.String)(p0));
    return;
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 26710);
    if (((com.moon.cw.h)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (com.moon.cw.g)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(com.moon.cw.i)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.cw.i)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("com/moon/cw", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (com.moon.cw.h)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((com.moon.cw.h)[life3_8])).longValue();
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral880_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/cw"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static long b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = com.moon.cw.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 23851);
    if (((com.moon.cw.e)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.cw.f)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.cw.f)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/cw", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.cw.d)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.cw.e)[life5_8] = com.moon.cw.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.cw.e)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.cw.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral882_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/cw"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private boolean a(com.moon.cq p0, java.lang.String p1) { return __sourceHandlerCall_f8e923a42fbcab1f9e61(this, p0, p1); }


private boolean a(com.moon.cq p0, com.moon.cy p1) { return __sourceHandlerCall_d74bfed74e3fe2dfe66d(this, p0, p1); }


public void a(com.moon.cq p0) {
com.moon.cx forwardValue39_15_0;
    java.lang.String spill39_0;
    com.moon.cx spill39_1;
    long life2_3;
    com.moon.cx life6_7;
    java.lang.String life4_8;
    com.moon.cy life5_22;
    forward_join_29: {
    forward_join_25: {
    forward_join_15: {
    life2_3 = (com.moon.cw.c ^ 133143724236326L);
    spill39_0 = com.moon.cw.b();
    life6_7 = ((com.moon.cq)(p0)).a__cx();
    life4_8 = spill39_0;
    spill39_1 = life6_7;
    if (!((life4_8 == null))) {
        forwardValue39_15_0 = spill39_1;
        break forward_join_15;
    }
    if (!((((spill39_1 instanceof com.moon.cy) ? 1 : 0) != 0))) {
        break forward_join_25;
    }
    forwardValue39_15_0 = life6_7;
    }
    life5_22 = ((com.moon.cy)(forwardValue39_15_0));
    ((java.util.concurrent.ExecutorService)(this.a)).submit(((java.lang.Runnable)(__sourceIntrinsic_75866ad38c21_invokedynamic39_6(this, p0, life5_22))));
    }
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        break forward_join_29;
    }
    com.moon.cw.b(((java.lang.String)("qVPTA")));
    }
    return;
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
        byte[] spill144_0 = p0;
        life4_9 += 1;
        life5_44 = (spill144_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill144_1 = p0;
        life4_9 += 1;
        life5_76 = (spill144_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill144_2 = p0;
        life4_9 += 1;
        life5_91 = (spill144_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static void lambda$authenticateWith$0(com.moon.cy p0, com.moon.cq p1, com.moon.cW p2) {
com.moon.cW forwardValue40_11_0;
    com.moon.cW spill40_0;
    com.moon.hD spill40_1;
    com.moon.hB spill40_2;
    com.moon.hD spill40_3;
    com.moon.hB spill40_4;
    long life3_3;
    java.lang.String life5_5;
    java.lang.String life6_15;
    java.lang.String life7_18;
    net.minecraft.util.Session life8_29;
    forward_join_108: {
    forward_join_78: {
    forward_join_11: {
    life3_3 = (com.moon.cw.c ^ 137863663463924L);
    life5_5 = com.moon.cw.b();
    spill40_0 = p2;
    if (!((life5_5 == null))) {
        forwardValue40_11_0 = spill40_0;
        break forward_join_11;
    }
    if (!((spill40_0 != null))) {
        break forward_join_78;
    }
    forwardValue40_11_0 = p2;
    }
    life6_15 = ((com.moon.cW)(forwardValue40_11_0)).b();
    life7_18 = ((com.moon.cW)(p2)).c();
    ((com.moon.cy)(p0)).a(((java.lang.String)(life7_18)));
    ((com.moon.cy)(p0)).b(((java.lang.String)(life6_15)));
    life8_29 = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).b__DH();
    ((com.moon.cy)(p0)).a(((java.lang.String)(((net.minecraft.util.Session)(life8_29)).c())));
    ((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a(((com.moon.cq)(p1)));
    ((com.moon.ok)(((com.moon.og)(((com.moon.od)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__od())).a__og())).a__ok())).a(((java.lang.String)(((net.minecraft.util.Session)(life8_29)).c())), ((java.util.UUID)(((com.mojang.authlib.GameProfile)(((net.minecraft.util.Session)(life8_29)).a())).getId())));
    spill40_1 = ((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__hD();
    spill40_2 = ((com.moon.hB)(com.moon.hA.a__hB())).a(((java.lang.String)(__sourceIntrinsic_72294e08842a_invokedynamic40_23(6496, (2705465865570068336L ^ life3_3)))));
    java.lang.String __stackOp40_28_0 = ((com.moon.cx)(((com.moon.cq)(p1)).a__cx())).a();
    java.lang.String __stackOp40_28_1 = __sourceIntrinsic_72294e08842a_invokedynamic40_27(17181, (6203823556127325454L ^ life3_3));
    ((com.moon.hD)(spill40_1)).a(((com.moon.hA)(((com.moon.hB)(((com.moon.hB)(((com.moon.hB)(((com.moon.hB)(spill40_2)).b(((java.lang.String)(__sourceIntrinsic_72294e08842a_invokedynamic40_29(__stackOp40_28_1, __stackOp40_28_0)))))).a(((com.moon.b8)(com.moon.b8.SUCCESS))))).a(((long)(__sourceIntrinsic_72294e08842a_invokedynamic40_33(6878, (650242259029987768L ^ life3_3))))))).a())));
    if (!((life5_5 != null))) {
        break forward_join_108;
    }
    }
    spill40_3 = ((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__hD();
    spill40_4 = ((com.moon.hB)(com.moon.hA.a__hB())).a(((java.lang.String)(__sourceIntrinsic_72294e08842a_invokedynamic40_40(18144, (7432402301584865528L ^ life3_3)))));
    java.lang.String __stackOp40_45_0 = ((com.moon.cx)(((com.moon.cq)(p1)).a__cx())).a();
    java.lang.String __stackOp40_45_1 = __sourceIntrinsic_72294e08842a_invokedynamic40_44(31277, (1433082118163448884L ^ life3_3));
    ((com.moon.hD)(spill40_3)).a(((com.moon.hA)(((com.moon.hB)(((com.moon.hB)(((com.moon.hB)(((com.moon.hB)(spill40_4)).b(((java.lang.String)(__sourceIntrinsic_72294e08842a_invokedynamic40_46(__stackOp40_45_1, __stackOp40_45_0)))))).a(((com.moon.b8)(com.moon.b8.SUCCESS))))).a(((long)(__sourceIntrinsic_72294e08842a_invokedynamic40_50(31240, (4882587914162958703L ^ life3_3))))))).a())));
    }
    return;
}


private void lambda$authenticateWith$1(com.moon.cq p0, com.moon.cy p1) {
int forwardValue41_24_0;
    int forwardValue41_28_0;
    java.lang.String spill41_0;
    int spill41_1;
    long life3_3;
    int life6_10;
    java.lang.String life5_11;
    int life7_13;
    forward_join_36: {
    forward_join_28: {
    forward_join_24: {
    forward_join_23: {
    life3_3 = (com.moon.cw.c ^ 134225912083854L);
    spill41_0 = com.moon.cw.b();
    life6_10 = ((((com.moon.cw)(this)).a(((com.moon.cq)(p0)), ((java.lang.String)(((com.moon.cy)(p1)).c())))) ? 1 : 0);
    life5_11 = spill41_0;
    life7_13 = 0;
    spill41_1 = life6_10;
    if (!((life5_11 == null))) {
        forwardValue41_24_0 = spill41_1;
        break forward_join_24;
    }
    if (!((spill41_1 == 0))) {
        break forward_join_23;
    }
    life7_13 = ((((com.moon.cw)(this)).a(((com.moon.cq)(p0)), ((com.moon.cy)(p1)))) ? 1 : 0);
    }
    forwardValue41_24_0 = life7_13;
    }
    if (!((life5_11 == null))) {
        forwardValue41_28_0 = forwardValue41_24_0;
        break forward_join_28;
    }
    if (!((forwardValue41_24_0 == 0))) {
        break forward_join_36;
    }
    forwardValue41_28_0 = life6_10;
    }
    if (!((forwardValue41_28_0 == 0))) {
        break forward_join_36;
    }
    ((com.moon.cD)(com.moon.pf.w)).a(((boolean)(false)), ((java.lang.String)("")), ((java.util.function.Consumer)(__sourceIntrinsic_7c02fe1ae023_invokedynamic41_8(p1, p0))));
    }
    return;
}


private static native <E extends Throwable> java.lang.Runnable __sourceIntrinsic_75866ad38c21_invokedynamic39_6(com.moon.cw a0, com.moon.cq a1, com.moon.cy a2) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral882_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral880_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_72294e08842a_invokedynamic40_23(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_72294e08842a_invokedynamic40_27(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_72294e08842a_invokedynamic40_29(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_72294e08842a_invokedynamic40_33(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_72294e08842a_invokedynamic40_40(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_72294e08842a_invokedynamic40_44(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_72294e08842a_invokedynamic40_46(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_72294e08842a_invokedynamic40_50(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Consumer __sourceIntrinsic_7c02fe1ae023_invokedynamic41_8(com.moon.cy a0, com.moon.cq a1) throws E;
}
