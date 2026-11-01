package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Oc {

public static net.minecraft.client.renderer.texture.TextureAtlasSprite a;

public static net.minecraft.client.renderer.texture.TextureAtlasSprite b;

public static net.minecraft.client.renderer.texture.TextureAtlasSprite c;

public static net.minecraft.client.renderer.texture.TextureAtlasSprite d;

public static net.minecraft.client.renderer.texture.TextureAtlasSprite e;

public static net.minecraft.client.renderer.texture.TextureAtlasSprite f;

public static net.minecraft.client.renderer.texture.TextureAtlasSprite g;

public static net.minecraft.client.renderer.texture.TextureAtlasSprite h;

public static net.minecraft.client.renderer.texture.TextureAtlasSprite i;

public static net.minecraft.client.renderer.texture.TextureAtlasSprite j;

public static net.minecraft.client.renderer.texture.TextureAtlasSprite k;

public static net.minecraft.client.renderer.texture.TextureAtlasSprite l;

public static net.minecraft.client.renderer.texture.TextureAtlasSprite m;

public static net.minecraft.client.renderer.texture.TextureAtlasSprite n;

public static net.minecraft.client.renderer.texture.TextureAtlasSprite o;

public static net.minecraft.client.renderer.texture.TextureAtlasSprite p;

public static net.minecraft.client.renderer.texture.TextureAtlasSprite q;

public static net.minecraft.client.renderer.texture.TextureAtlasSprite r;

private static java.nio.IntBuffer s;

private static long t;

private static java.lang.String[] u;

private static java.lang.String[] v;

private static java.util.Map w;

private static long[] x;

private static java.lang.Integer[] y;

private static java.util.Map z;

public Oc() {
super();
}


static {
t = ((long)(((moom._a)(moom._c.a(((long)(9116805234912980413L)), ((long)(1199554782915699856L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(101847292970847L)))));
    long local20_life6 = (moom.Oc.t ^ 128028742761903L);
    w = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local11_life9;
    javax.crypto.Cipher __sourceSpill748_11 = (local11_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill748_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill748_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill748_14 = new byte[8];
    (__sourceSpill748_14)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local12_life15 = 1;
    while ((local12_life15 < 8)) {
        (__sourceSpill748_14)[local12_life15] = ((byte) ((int) ((local20_life6 << (local12_life15 * 8)) >>> 56)));
        local12_life15 += 1;
    }
    byte[] __sourcePreallocation748_16 = __sourceSpill748_14;
    ((javax.crypto.Cipher)(__sourceSpill748_11)).init(((int)(__sourceSpill748_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill748_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation748_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local18_life19 = new java.lang.String[37];
    int local16_life20 = 0;
    java.lang.String local15_life21;
    int local17_life23 = ((java.lang.String)((local15_life21 = "ë\024«õSí\006ðçwF.c¡¡Æ¦ó¨\005í7åèw:\020\033\004®ì¯\024Z\004K5¶xÒ(\013Åo{+V9\017)³@ïá;§\002Zçg¥&½-Á0\030k\020Á\025\007õsÜ\020Ã|cÒ¸3ëD$A_IØ ñR(üÃ°G$åp`ò.2pÿ|]Ê ¬\n\\¢êf0\017\016¬\bâtéxÝ\032¨¦\017µá¯nG+\fËEî\0174$Lê_üJ#@¸òR±c¨Eã\020÷ qcHð\026\026Sk+ó(Ö\026¶Á¢\006z\030éÝ¯¡2>åæÆLÈ¡²_¥Á?¦F\tâ`ÅF\037¤Þ\020 \001ùòND%\025ãECB:0j\024~UqhA\0276Ù»\017\003\016´Kû¤|å\021^ö¼îí¼²g¾gñÄ`BÛ(øÇP\002ñòìº]\030´FÜþBev\\\n0/¥1tÈ¸}%V(\036B·ãáH`\024ì_F<\016ÕãW®ç\006Ä'\n\005R¤=®ÀÒ «\005¼Hà ØßÎ\021Ú­§AÉ¦ws\035ÈÚõ½+ªi{A\021Û>]\033vð8\020M^¯kÉËÇ\027°/MW=pV\032\001i\"S°Mù«ª9«vì\013Î8[ù¶x®âdhézíÝOêþ 4§6R3P%ßÈ?\023[Uº\030Á\177è¼{\000ÿ2|[ÔÞõ\b\020²Bç0mJ2Ï÷(\0167\024¸ ©åq0M7P)NÇy´è8ÎÑ{ª¾\037|`Lú3\r\037\030»ïç,[&\020VJØ'éX\030Ð\024\007\024(j\006 Tnb¶³Öª×\031·òmcl^Éªv)z¯'ÑMÏe³9@\020ÙpÅ2óü?¶ßµ°\030Õ° ¿%»1F|\177ò\n\n\037÷°\035½/k\027ÞÆO#öI#°\rý\020\022\002´ ±S\002³I\"¶*àðL\030òº;ÁÖp¢\013QB¼q½®õ\n\027uù¶ ÃdH\003ÁëgÐû\007eÛUz'è6Î\022\rÖ-!ð%öRí¼Þ zu\023m#«QXi,\022H\020¨5ïË\023Ãî Rê<(eõ\"þsDÁK©¦~dã\004è õ{æá)Ljúme½\\\004Â¼Üãa\020e!õµ\177?o#p°à VI\020]\006¬d îOÉ2«È©^Z\003\020ëâ%dP/hSõW59ö2â\020ä0/Ö2V%\tÈÕ%OgYÿ LÏYh«÷\r`Ã¸´\b/\020\r|wkú£\007MË²/ùsò®E\030è÷¬ì£^£y;ÛÖÈXAR+WSú\000Ø9M [:½,â³)/ù¦°\022\006úêDxEÿN¶\037Zkµ\033® ãNÔ{,/æ\032:@n:x\035¬i«¶A¯¢ç/&¨\b>sP½É %½h9\006¥-²ª+ÎTCx§¡Nû5úû@î{À\036\034þÁ"))).length();
    int local14_life24 = 32;
    int local13_life25 = -1;
    while (true) {
        local13_life25 += 1;
        byte[] __sourceSpill748_28 = ((java.lang.String)(((java.lang.String)(local15_life21)).substring(((int)(local13_life25)), ((int)((local13_life25 + local14_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill748_29 = local11_life9;
        byte[] local19_life31 = ((javax.crypto.Cipher)(__sourceSpill748_29)).doFinal(((byte[])(__sourceSpill748_28)));
        java.lang.String __sourceSpill748_34 = ((java.lang.String)(moom.Oc.a(((byte[])(local19_life31))))).intern();
        java.lang.String[] __sourceSpill748_35 = local18_life19;
        int __sourceSpill748_36 = local16_life20;
        local16_life20 += 1;
        (__sourceSpill748_35)[__sourceSpill748_36] = __sourceSpill748_34;
        if (!(((local13_life25 = (local13_life25 + local14_life24)) < local17_life23))) { break; }
        local14_life24 = ((java.lang.String)(local15_life21)).charAt(((int)(local13_life25)));
    }
    local17_life23 = ((java.lang.String)((local15_life21 = "µ\033£\r(¤ØdÂ\021Ç#Çó\032\020àd´ûjV7\r\f;iM"))).length();
    local14_life24 = 16;
    local13_life25 = -1;
    while (true) {
        local13_life25 += 1;
        byte[] __sourceSpill748_41 = ((java.lang.String)(((java.lang.String)(local15_life21)).substring(((int)(local13_life25)), ((int)((local13_life25 + local14_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill748_42 = local11_life9;
        byte[] local19_life44 = ((javax.crypto.Cipher)(__sourceSpill748_42)).doFinal(((byte[])(__sourceSpill748_41)));
        java.lang.String __sourceSpill748_47 = ((java.lang.String)(moom.Oc.a(((byte[])(local19_life44))))).intern();
        java.lang.String[] __sourceSpill748_48 = local18_life19;
        int __sourceSpill748_49 = local16_life20;
        local16_life20 += 1;
        (__sourceSpill748_48)[__sourceSpill748_49] = __sourceSpill748_47;
        if (!(((local13_life25 = (local13_life25 + local14_life24)) < local17_life23))) { break; }
        local14_life24 = ((java.lang.String)(local15_life21)).charAt(((int)(local13_life25)));
    }
    u = ((java.lang.String[])(local18_life19));
    v = ((java.lang.String[])(new java.lang.String[37]));
    z = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill748_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill748_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill748_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill748_60 = new byte[8];
    (__sourceSpill748_60)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill748_60)[local1_life61] = ((byte) ((int) ((local20_life6 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation748_62 = __sourceSpill748_60;
    ((javax.crypto.Cipher)(__sourceSpill748_57)).init(((int)(__sourceSpill748_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill748_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation748_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[18];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "·wÌ­%Õ5\023»ú\022Ù\177±\rÕÕ³z½\003UYÒòî*·³+vweF`.\026\få°¬á\f«ô%\005z#\030¹ÇY\036r<\0301é÷ø\001\017qw\030?ß\"\002Æ·¥«U\0065¶\\g9ÓüÑ¤Ø¾,-«c;Û~;ða¨L¨Y¬\025\037õ"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill748_71 = local4_life67;
        int __sourceSpill748_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill748_71)).substring(((int)(__sourceSpill748_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill748_76 = local6_life65;
        int __sourceSpill748_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill748_79 = new byte[8];
        (__sourceSpill748_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill748_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill748_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill748_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill748_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill748_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill748_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill748_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill748_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill748_80)).doFinal(((byte[])(__sourceSpill748_79)));
        (__sourceSpill748_76)[__sourceSpill748_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    local5_life69 = ((java.lang.String)((local4_life67 = "ZÙ0ã{?xö©qïr\fTúF"))).length();
    local2_life70 = 0;
    do {
        java.lang.String __sourceSpill748_84 = local4_life67;
        int __sourceSpill748_85 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill748_84)).substring(((int)(__sourceSpill748_85)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill748_89 = local6_life65;
        int __sourceSpill748_90 = local3_life66;
        local3_life66 += 1;
        long local8_life91 = (((((((((((long) (local7_life88)[0]) & 255L) << 56) | ((((long) (local7_life88)[1]) & 255L) << 48)) | ((((long) (local7_life88)[2]) & 255L) << 40)) | ((((long) (local7_life88)[3]) & 255L) << 32)) | ((((long) (local7_life88)[4]) & 255L) << 24)) | ((((long) (local7_life88)[5]) & 255L) << 16)) | ((((long) (local7_life88)[6]) & 255L) << 8)) | (((long) (local7_life88)[7]) & 255L));
        byte[] __sourceSpill748_92 = new byte[8];
        (__sourceSpill748_92)[0] = ((byte) ((int) (local8_life91 >>> 56)));
        (__sourceSpill748_92)[1] = ((byte) ((int) (local8_life91 >>> 48)));
        (__sourceSpill748_92)[2] = ((byte) ((int) (local8_life91 >>> 40)));
        (__sourceSpill748_92)[3] = ((byte) ((int) (local8_life91 >>> 32)));
        (__sourceSpill748_92)[4] = ((byte) ((int) (local8_life91 >>> 24)));
        (__sourceSpill748_92)[5] = ((byte) ((int) (local8_life91 >>> 16)));
        (__sourceSpill748_92)[6] = ((byte) ((int) (local8_life91 >>> 8)));
        (__sourceSpill748_92)[7] = ((byte) ((int) local8_life91));
        javax.crypto.Cipher __sourceSpill748_93 = local0_life55;
        byte[] local10_life95 = ((javax.crypto.Cipher)(__sourceSpill748_93)).doFinal(((byte[])(__sourceSpill748_92)));
        (__sourceSpill748_89)[__sourceSpill748_90] = (((((((((((long) (local10_life95)[0]) & 255L) << 56) | ((((long) (local10_life95)[1]) & 255L) << 48)) | ((((long) (local10_life95)[2]) & 255L) << 40)) | ((((long) (local10_life95)[3]) & 255L) << 32)) | ((((long) (local10_life95)[4]) & 255L) << 24)) | ((((long) (local10_life95)[5]) & 255L) << 16)) | ((((long) (local10_life95)[6]) & 255L) << 8)) | (((long) (local10_life95)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    x = ((long[])(local6_life65));
    y = ((java.lang.Integer[])(new java.lang.Integer[18]));
    s = ((java.nio.IntBuffer)(net.minecraft.client.renderer.GLAllocation.a__IntBuffer(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite748_98(29268, (8367906821639877433L ^ local20_life6)))))));
}

private static native <E extends Throwable> int __sourceHandlerCall_83f0eb94367013dfeef9() throws E;
private static final class __SourceHandler_83f0eb94367013dfeef9 {

public static int f1009() throws Throwable {
    int lexicalValue1009_66_0;
    int lexicalValue1009_70_0;
    int spill1009_0;
    int spill1009_1;
    int spill1009_2;
    long life0_3;
    int life3_10;
    int life2_11;
    int life4_42;
    int life5_54;
    lexical_join_70: {
    lexical_join_69: {
    life0_3 = (__fieldRead1009_0() ^ 125881719429386L);
    spill1009_0 = __call1009_1();
    life3_10 = __invokedynamic1009_2(31971, (2037288691368892716L ^ life0_3));
    life2_11 = spill1009_0;
    lexical_cycle_12: while (true) {
    lexical_join_66: {
    lexical_join_63: {
    if (!((life3_10 > 0))) {
        break lexical_join_69;
    }
    __call1009_7(__invokedynamic1009_3(1595, (5587530960320422904L ^ life0_3)), 0, __invokedynamic1009_4(6720, (4542375151154954141L ^ life0_3)), life3_10, life3_10, 0, __invokedynamic1009_5(24598, (2106574184851211732L ^ life0_3)), __invokedynamic1009_6(15517, (7748369587544414553L ^ life0_3)), null);
    spill1009_1 = 17607;
    life4_42 = __call1009_8();
    life5_54 = __call1009_11(__invokedynamic1009_9(spill1009_1, (3081634909589840138L ^ life0_3)), 0, __invokedynamic1009_10(16493, (8090011144715969959L ^ life0_3)));
    spill1009_2 = life5_54;
    if (!((life2_11 != 0))) {
        lexicalValue1009_70_0 = spill1009_2;
        break lexical_join_70;
    }
    if (!((life2_11 != 0))) {
        lexicalValue1009_66_0 = spill1009_2;
        break lexical_join_66;
    }
    if (!((spill1009_2 != 0))) {
        break lexical_join_63;
    }
    return life3_10;
    }
    lexicalValue1009_66_0 = (life3_10 >> 1);
    }
    life3_10 = lexicalValue1009_66_0;
    if (!((life2_11 == 0))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    lexicalValue1009_70_0 = -1;
    }
    return lexicalValue1009_70_0;
}
public static void h1009_0(moom.Oo p0) throws Throwable {
    throw __call1100900_0(p0);
}
public static void h1009_1(moom.Oo p0) throws Throwable {
    throw __call1100901_0(p0);
}
public static void h1009_2(moom.Oo p0) throws Throwable {
    throw __call1100902_0(p0);
}
private static native long __fieldRead1009_0() throws Throwable;
private static native int __call1009_1() throws Throwable;
private static native int __invokedynamic1009_2(int a0, long a1) throws Throwable;
private static native int __invokedynamic1009_3(int a0, long a1) throws Throwable;
private static native int __invokedynamic1009_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic1009_5(int a0, long a1) throws Throwable;
private static native int __invokedynamic1009_6(int a0, long a1) throws Throwable;
private static native void __call1009_7(int a0, int a1, int a2, int a3, int a4, int a5, int a6, int a7, java.lang.Object a8) throws Throwable;
private static native int __call1009_8() throws Throwable;
private static native int __invokedynamic1009_9(int a0, long a1) throws Throwable;
private static native int __invokedynamic1009_10(int a0, long a1) throws Throwable;
private static native int __call1009_11(int a0, int a1, int a2) throws Throwable;
private static native java.lang.Exception __call1100900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1100901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1100902_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_a05be14f64ae236e4124(int a0, int a1) throws E;
private static final class __SourceHandler_a05be14f64ae236e4124 {

public static int f1010(int p0, int p1) throws Throwable {
    int lexicalValue1010_17_0;
    int lexicalValue1010_17_1;
    int lexicalValue1010_31_0;
    int spill1010_0;
    int spill1010_1;
    int spill1010_2;
    long life2_3;
    int life4_5;
    int life5_23;
    lexical_join_31: {
    lexical_join_30: {
    lexical_join_17: {
    lexical_join_13: {
    life2_3 = (__fieldRead1010_0() ^ 49248948621293L);
    life4_5 = __call1010_1();
    spill1010_0 = p0;
    spill1010_1 = p1;
    if (!((life4_5 != 0))) {
        lexicalValue1010_17_0 = spill1010_0;
        lexicalValue1010_17_1 = spill1010_1;
        break lexical_join_17;
    }
    if (!((spill1010_0 == spill1010_1))) {
        break lexical_join_13;
    }
    return p0;
    }
    lexicalValue1010_17_0 = (p0 / p1);
    lexicalValue1010_17_1 = p1;
    }
    life5_23 = (lexicalValue1010_17_0 * lexicalValue1010_17_1);
    lexical_cycle_19: while (true) {
    if (!((life5_23 < p0))) {
        break lexical_join_30;
    }
    spill1010_2 = (life5_23 + p1);
    if (!((life4_5 != 0))) {
        lexicalValue1010_31_0 = spill1010_2;
        break lexical_join_31;
    }
    life5_23 = spill1010_2;
    if (!((life4_5 == 0))) { continue lexical_cycle_19; }
    break lexical_cycle_19;
    }
    }
    lexicalValue1010_31_0 = life5_23;
    }
    return lexicalValue1010_31_0;
}
public static void h1010_0(moom.Oo p0) throws Throwable {
    throw __call1101000_0(p0);
}
public static void h1010_1(moom.Oo p0) throws Throwable {
    throw __call1101001_0(p0);
}
private static native long __fieldRead1010_0() throws Throwable;
private static native int __call1010_1() throws Throwable;
private static native java.lang.Exception __call1101000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1101001_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.awt.image.BufferedImage __sourceHandlerCall_fbdf40e86fe29d0e4ea9(java.awt.image.BufferedImage a0, int a1) throws E;
private static final class __SourceHandler_fbdf40e86fe29d0e4ea9 {

public static java.awt.image.BufferedImage f168(java.awt.image.BufferedImage p0, int p1) throws Throwable {
    int forwardValue168_37_0;
    int forwardValue168_37_1;
    int forwardValue168_55_0;
    int spill168_0;
    int spill168_1;
    int spill168_2;
    int spill168_3;
    long life2_3;
    int life5_6;
    int life6_10;
    int life7_16;
    int life4_17;
    java.awt.image.BufferedImage life8_24;
    java.awt.Graphics2D life9_27;
    java.lang.Object life10_29;
    forward_join_55: {
    forward_join_43: {
    forward_join_41: {
    forward_join_37: {
    life2_3 = (__fieldRead168_0() ^ 16882749315527L);
    life5_6 = __call168_1(p0);
    spill168_0 = __call168_2();
    life6_10 = __call168_3(p0);
    life7_16 = ((life6_10 * p1) / life5_6);
    life4_17 = spill168_0;
    life8_24 = new java.awt.image.BufferedImage(p1, life7_16, 2);
    life9_27 = __call168_4(life8_24);
    life10_29 = __fieldRead168_5();
    spill168_1 = p1;
    spill168_2 = life5_6;
    if (!((life4_17 != 0))) {
        forwardValue168_37_0 = spill168_1;
        forwardValue168_37_1 = spill168_2;
        break forward_join_37;
    }
    if (!((spill168_1 >= spill168_2))) {
        break forward_join_41;
    }
    forwardValue168_37_0 = p1;
    forwardValue168_37_1 = life5_6;
    }
    spill168_3 = (forwardValue168_37_0 % forwardValue168_37_1);
    if (!((life4_17 != 0))) {
        forwardValue168_55_0 = spill168_3;
        break forward_join_55;
    }
    if (!((spill168_3 != 0))) {
        break forward_join_43;
    }
    }
    life10_29 = __fieldRead168_6();
    }
    __call168_8(life9_27, __fieldRead168_7(), life10_29);
    forwardValue168_55_0 = __integerCategory168_10(__call168_9(life9_27, p0, 0, 0, p1, life7_16, null));
    }
    __discardScalar168_11(forwardValue168_55_0);
    return life8_24;
}
public static void h168_0(moom.Oo p0) throws Throwable {
    throw __call1016800_0(p0);
}
public static void h168_1(moom.Oo p0) throws Throwable {
    throw __call1016801_0(p0);
}
public static void h168_2(moom.Oo p0) throws Throwable {
    throw __call1016802_0(p0);
}
private static native long __fieldRead168_0() throws Throwable;
private static native int __call168_1(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __call168_2() throws Throwable;
private static native int __call168_3(java.awt.image.BufferedImage a0) throws Throwable;
private static native java.awt.Graphics2D __call168_4(java.awt.image.BufferedImage a0) throws Throwable;
private static native java.lang.Object __fieldRead168_5() throws Throwable;
private static native java.lang.Object __fieldRead168_6() throws Throwable;
private static native java.awt.RenderingHints.Key __fieldRead168_7() throws Throwable;
private static native void __call168_8(java.awt.Graphics2D a0, java.awt.RenderingHints.Key a1, java.lang.Object a2) throws Throwable;
private static native boolean __call168_9(java.awt.Graphics2D a0, java.awt.image.BufferedImage a1, int a2, int a3, int a4, int a5, java.lang.Object a6) throws Throwable;
private static native int __integerCategory168_10(boolean value) throws Throwable;
private static native void __discardScalar168_11(int a0) throws Throwable;
private static native java.lang.Exception __call1016800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1016801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1016802_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.awt.Dimension __sourceHandlerCall_defb81f4251b3cae6a15(java.io.InputStream a0, java.lang.String a1) throws E;
private static final class __SourceHandler_defb81f4251b3cae6a15 {

public static java.awt.Dimension f812(java.io.InputStream p0, java.lang.String p1) throws Throwable {
    java.lang.Object forestValue812_16_0;
    int spill812_0;
    java.util.Iterator spill812_1;
    long life2_3;
    java.util.Iterator life5_7;
    int life4_8;
    javax.imageio.ImageReader life6_19;
    javax.imageio.stream.ImageInputStream life8_22;
    int life9_30;
    int life10_35;
    java.awt.Dimension life7_41;
    forest_join_44: {
    forest_join_16: {
    life2_3 = (__fieldRead812_0() ^ 133204841708538L);
    spill812_0 = __call812_1();
    life5_7 = __call812_2(p1);
    life4_8 = spill812_0;
    spill812_1 = life5_7;
    if (!((life4_8 == 0))) {
        forestValue812_16_0 = spill812_1;
        break forest_join_16;
    }
    if (!(__call812_3(spill812_1))) {
        break forest_join_44;
    }
    forestValue812_16_0 = __call812_4(life5_7);
    }
    life6_19 = __cast812_5(forestValue812_16_0);
    life8_22 = __call812_6(p0);
    __call812_7(life6_19, life8_22);
    life9_30 = __call812_9(life6_19, __call812_8(life6_19));
    life10_35 = __call812_11(life6_19, __call812_10(life6_19));
    life7_41 = new java.awt.Dimension(life9_30, life10_35);
    __call812_12(life6_19);
    return life7_41;
    }
    return null;
}
public static java.awt.Dimension h812_0(java.io.IOException p0) throws Throwable {
    throw __call3081200_0(p0);
}
public static java.awt.Dimension h812_1(java.io.IOException p0) throws Throwable {
    throw __call3081201_0(p0);
}
public static java.awt.Dimension h812_2(java.io.IOException p0, java.io.InputStream p1, int p2, java.util.Iterator p3, javax.imageio.ImageReader p4, java.awt.Dimension p5, javax.imageio.stream.ImageInputStream p6, int p7, int p8) throws Throwable {
    java.lang.Object forestValue3081202_11_0;
    java.util.Iterator spill3081202_0;
    java.io.IOException life6_2;
    javax.imageio.ImageReader life4_16;
    javax.imageio.stream.ImageInputStream life6_19;
    int life7_27;
    int life8_32;
    java.awt.Dimension life5_38;
    forest_join_39: {
    forest_join_11: {
    life6_2 = p0;
    __call3081202_0(p4);
    spill3081202_0 = p3;
    if (!((p2 == 0))) {
        forestValue3081202_11_0 = spill3081202_0;
        break forest_join_11;
    }
    if (!(__call3081202_1(spill3081202_0))) {
        break forest_join_39;
    }
    forestValue3081202_11_0 = __call3081202_2(p3);
    }
    life4_16 = __cast3081202_3(forestValue3081202_11_0);
    life6_19 = __call3081202_4(p1);
    __call3081202_5(life4_16, life6_19);
    life7_27 = __call3081202_7(life4_16, __call3081202_6(life4_16));
    life8_32 = __call3081202_9(life4_16, __call3081202_8(life4_16));
    life5_38 = new java.awt.Dimension(life7_27, life8_32);
    __call3081202_10(life4_16);
    return life5_38;
    }
    return null;
}
public static java.awt.Dimension h812_3(java.lang.Throwable p0, javax.imageio.ImageReader p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3081203_0(p1);
    throw life2_2;
}
private static native long __fieldRead812_0() throws Throwable;
private static native int __call812_1() throws Throwable;
private static native java.util.Iterator __call812_2(java.lang.String a0) throws Throwable;
private static native boolean __call812_3(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call812_4(java.util.Iterator a0) throws Throwable;
private static native javax.imageio.ImageReader __cast812_5(java.lang.Object a0) throws Throwable;
private static native javax.imageio.stream.ImageInputStream __call812_6(java.io.InputStream a0) throws Throwable;
private static native void __call812_7(javax.imageio.ImageReader a0, javax.imageio.stream.ImageInputStream a1) throws Throwable;
private static native int __call812_8(javax.imageio.ImageReader a0) throws Throwable;
private static native int __call812_9(javax.imageio.ImageReader a0, int a1) throws Throwable;
private static native int __call812_10(javax.imageio.ImageReader a0) throws Throwable;
private static native int __call812_11(javax.imageio.ImageReader a0, int a1) throws Throwable;
private static native void __call812_12(javax.imageio.ImageReader a0) throws Throwable;
private static native java.lang.Exception __call3081200_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3081201_0(java.io.IOException a0) throws Throwable;
private static native void __call3081202_0(javax.imageio.ImageReader a0) throws Throwable;
private static native boolean __call3081202_1(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call3081202_2(java.util.Iterator a0) throws Throwable;
private static native javax.imageio.ImageReader __cast3081202_3(java.lang.Object a0) throws Throwable;
private static native javax.imageio.stream.ImageInputStream __call3081202_4(java.io.InputStream a0) throws Throwable;
private static native void __call3081202_5(javax.imageio.ImageReader a0, javax.imageio.stream.ImageInputStream a1) throws Throwable;
private static native int __call3081202_6(javax.imageio.ImageReader a0) throws Throwable;
private static native int __call3081202_7(javax.imageio.ImageReader a0, int a1) throws Throwable;
private static native int __call3081202_8(javax.imageio.ImageReader a0) throws Throwable;
private static native int __call3081202_9(javax.imageio.ImageReader a0, int a1) throws Throwable;
private static native void __call3081202_10(javax.imageio.ImageReader a0) throws Throwable;
private static native void __call3081203_0(javax.imageio.ImageReader a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_0b9296f478ff54e31d44(java.lang.String a0) throws E;
private static final class __SourceHandler_0b9296f478ff54e31d44 {

public static java.lang.String f1687(java.lang.String p0) throws Throwable {
    long life1_3;
    int life3_11;
    life1_3 = (__fieldRead1687_0() ^ 84084785776686L);
    life3_11 = __call1687_2(p0, __invokedynamic1687_1(28227, (8538063377955822249L ^ life1_3)));
    return ((life3_11 < 0) ? "" : __call1687_3(p0, 0, life3_11));
}
public static void h1687_0(moom.Oo p0) throws Throwable {
    throw __call1168700_0(p0);
}
private static native long __fieldRead1687_0() throws Throwable;
private static native int __invokedynamic1687_1(int a0, long a1) throws Throwable;
private static native int __call1687_2(java.lang.String a0, int a1) throws Throwable;
private static native java.lang.String __call1687_3(java.lang.String a0, int a1, int a2) throws Throwable;
private static native java.lang.Exception __call1168700_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_24e0011ee2fac3499c88(java.lang.String a0, int a1, int a2, int a3, int a4) throws E;
private static final class __SourceHandler_24e0011ee2fac3499c88 {

public static void f100105(java.lang.String p0, int p1, int p2, int p3, int p4) throws Throwable {
    java.io.File forestValue100105_35_0;
    int spill100105_0;
    java.io.File spill100105_1;
    int spill100105_2;
    long spill100105_3;
    long life5_3;
    int life7_7;
    java.io.File life8_26;
    java.io.File life9_29;
    int life10_39;
    java.io.File life11_60;
    java.io.File life11_88;
    int life12_93;
    int life13_100;
    int life14_104;
    java.nio.IntBuffer life15_107;
    int[] life16_110;
    java.awt.image.BufferedImage life17_135;
    forest_join_164: {
    forest_join_70: {
    forest_join_68: {
    forest_join_37: {
    forest_join_35: {
    life5_3 = (__fieldRead100105_0() ^ 104017921080703L);
    spill100105_0 = __call100105_1();
    __call100105_2(p1);
    life7_7 = spill100105_0;
    __call100105_4(__invokedynamic100105_3(15378, (8948720135891041707L ^ life5_3)), 1);
    __call100105_6(__invokedynamic100105_5(8309, (6661442062410260935L ^ life5_3)), 1);
    life8_26 = new java.io.File(p0);
    life9_29 = __call100105_7(life8_26);
    spill100105_1 = life9_29;
    if (!((life7_7 == 0))) {
        forestValue100105_35_0 = spill100105_1;
        break forest_join_35;
    }
    if (!((spill100105_1 != null))) {
        break forest_join_37;
    }
    forestValue100105_35_0 = life9_29;
    }
    __call100105_8(forestValue100105_35_0);
    }
    life10_39 = 0;
    forest_cycle_39: while (true) {
    if (!((life10_39 < __invokedynamic100105_9(20619, (5248326757565255989L ^ life5_3))))) {
        break forest_join_68;
    }
    java.lang.Object __inlineStack100105_10Token;
    life11_60 = new java.io.File(__invokedynamic100105_12(p0, __inlineStack100105_10Output0((__inlineStack100105_10Token = __inlineStack100105_10Pack(life10_39, "_"))), __inlineStack100105_10Output1(__inlineStack100105_10Token), __invokedynamic100105_11(7865, (3536138214992604753L ^ life5_3))));
    __call100105_13(life11_60);
    life10_39 += 1;
    if (!((life7_7 == 0))) {
        break forest_join_70;
    }
    if (!((life7_7 != 0))) {
        continue forest_cycle_39;
    }
    break forest_cycle_39;
    }
    }
    life10_39 = 0;
    }
    forest_cycle_70: while (true) {
    if (!((life10_39 <= p2))) {
        break forest_join_164;
    }
    java.lang.Object __inlineStack100105_14Token;
    life11_88 = new java.io.File(__invokedynamic100105_16(p0, __inlineStack100105_14Output0((__inlineStack100105_14Token = __inlineStack100105_14Pack(life10_39, "_"))), __inlineStack100105_14Output1(__inlineStack100105_14Token), __invokedynamic100105_15(21865, (8153900570229712256L ^ life5_3))));
    spill100105_2 = 17160;
    life12_93 = (p3 >> life10_39);
    spill100105_3 = (391095173506646712L ^ life5_3);
    life13_100 = (p4 >> life10_39);
    life14_104 = (life12_93 * life13_100);
    life15_107 = __call100105_17(life14_104);
    life16_110 = new int[life14_104];
    __call100105_21(__invokedynamic100105_18(spill100105_2, spill100105_3), life10_39, __invokedynamic100105_19(16920, (6921975950136099748L ^ life5_3)), __invokedynamic100105_20(28255, (7362680454969585643L ^ life5_3)), life15_107);
    __call100105_22(life15_107, life16_110);
    life17_135 = new java.awt.image.BufferedImage(life12_93, life13_100, 2);
    __call100105_23(life17_135, 0, 0, life12_93, life13_100, life16_110, 0, life12_93);
    __call100105_25(life17_135, __invokedynamic100105_24(18907, (5203593386133928205L ^ life5_3)), life11_88);
    java.io.File __stackOp100105_27_0 = life11_88;
    java.lang.String __stackOp100105_27_1 = __invokedynamic100105_26(4217, (4088485181177094293L ^ life5_3));
    __call100105_29(__invokedynamic100105_28(__stackOp100105_27_1, __stackOp100105_27_0));
    life10_39 += 1;
    if (!((life7_7 != 0))) {
        continue forest_cycle_70;
    }
    break forest_cycle_70;
    }
    }
    return;
}
public static void h100105_0(java.lang.Exception p0) throws Throwable {
    throw __call13010500_0(p0);
}
public static void h100105_1(java.lang.Exception p0) throws Throwable {
    throw __call13010501_0(p0);
}
public static void h100105_2(java.lang.Exception p0, java.lang.String p1, int p2, int p3, int p4, long p5, int p6, int p7, java.io.File p8) throws Throwable {
    java.lang.String spill13010502_0;
    int spill13010502_1;
    long spill13010502_2;
    java.lang.Exception life16_2;
    java.io.File life9_45;
    int life10_50;
    int life11_57;
    int life12_61;
    java.nio.IntBuffer life13_64;
    int[] life14_67;
    java.awt.image.BufferedImage life15_92;
    forest_join_120: {
    life16_2 = p0;
    java.io.File __stackOp13010502_1_0 = p8;
    java.lang.String __stackOp13010502_1_1 = __invokedynamic13010502_0(21575, (4993064442376889493L ^ p5));
    __call13010502_3(__invokedynamic13010502_2(__stackOp13010502_1_1, __stackOp13010502_1_0));
    spill13010502_0 = __call13010502_5(__call13010502_4(life16_2));
    java.lang.String __stackOp13010502_8_0 = __call13010502_6(life16_2);
    java.lang.String __stackOp13010502_8_1 = __invokedynamic13010502_7(29095, (8983205185055621462L ^ p5));
    __call13010502_10(__invokedynamic13010502_9(spill13010502_0, __stackOp13010502_8_1, __stackOp13010502_8_0));
    forest_cycle_24: while (true) {
    forest_join_28: {
    p7 += 1;
    if (!((p6 != 0))) {
        break forest_join_28;
    }
    break forest_join_120;
    }
    if (!((p7 <= p2))) {
        break forest_join_120;
    }
    java.lang.Object __inlineStack13010502_11Token;
    life9_45 = new java.io.File(__invokedynamic13010502_13(p1, __inlineStack13010502_11Output0((__inlineStack13010502_11Token = __inlineStack13010502_11Pack(p7, "_"))), __inlineStack13010502_11Output1(__inlineStack13010502_11Token), __invokedynamic13010502_12(21865, (8153900570229712256L ^ p5))));
    spill13010502_1 = 17160;
    life10_50 = (p3 >> p7);
    spill13010502_2 = (391095173506646712L ^ p5);
    life11_57 = (p4 >> p7);
    life12_61 = (life10_50 * life11_57);
    life13_64 = __call13010502_14(life12_61);
    life14_67 = new int[life12_61];
    __call13010502_18(__invokedynamic13010502_15(spill13010502_1, spill13010502_2), p7, __invokedynamic13010502_16(16920, (6921975950136099748L ^ p5)), __invokedynamic13010502_17(28255, (7362680454969585643L ^ p5)), life13_64);
    __call13010502_19(life13_64, life14_67);
    life15_92 = new java.awt.image.BufferedImage(life10_50, life11_57, 2);
    __call13010502_20(life15_92, 0, 0, life10_50, life11_57, life14_67, 0, life10_50);
    __call13010502_22(life15_92, __invokedynamic13010502_21(18907, (5203593386133928205L ^ p5)), life9_45);
    java.io.File __stackOp13010502_24_0 = life9_45;
    java.lang.String __stackOp13010502_24_1 = __invokedynamic13010502_23(4217, (4088485181177094293L ^ p5));
    __call13010502_26(__invokedynamic13010502_25(__stackOp13010502_24_1, __stackOp13010502_24_0));
    continue forest_cycle_24;
    }
    }
    return;
}
private static native long __fieldRead100105_0() throws Throwable;
private static native int __call100105_1() throws Throwable;
private static native void __call100105_2(int a0) throws Throwable;
private static native int __invokedynamic100105_3(int a0, long a1) throws Throwable;
private static native void __call100105_4(int a0, int a1) throws Throwable;
private static native int __invokedynamic100105_5(int a0, long a1) throws Throwable;
private static native void __call100105_6(int a0, int a1) throws Throwable;
private static native java.io.File __call100105_7(java.io.File a0) throws Throwable;
private static native boolean __call100105_8(java.io.File a0) throws Throwable;
private static native int __invokedynamic100105_9(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack100105_10Pack(int a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack100105_10Output0(java.lang.Object token) throws Throwable;
private static native int __inlineStack100105_10Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic100105_11(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic100105_12(java.lang.String a0, java.lang.String a1, int a2, java.lang.String a3) throws Throwable;
private static native boolean __call100105_13(java.io.File a0) throws Throwable;
private static native java.lang.Object __inlineStack100105_14Pack(int a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack100105_14Output0(java.lang.Object token) throws Throwable;
private static native int __inlineStack100105_14Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic100105_15(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic100105_16(java.lang.String a0, java.lang.String a1, int a2, java.lang.String a3) throws Throwable;
private static native java.nio.IntBuffer __call100105_17(int a0) throws Throwable;
private static native int __invokedynamic100105_18(int a0, long a1) throws Throwable;
private static native int __invokedynamic100105_19(int a0, long a1) throws Throwable;
private static native int __invokedynamic100105_20(int a0, long a1) throws Throwable;
private static native void __call100105_21(int a0, int a1, int a2, int a3, java.nio.IntBuffer a4) throws Throwable;
private static native java.nio.IntBuffer __call100105_22(java.nio.IntBuffer a0, int[] a1) throws Throwable;
private static native void __call100105_23(java.awt.image.BufferedImage a0, int a1, int a2, int a3, int a4, int[] a5, int a6, int a7) throws Throwable;
private static native java.lang.String __invokedynamic100105_24(int a0, long a1) throws Throwable;
private static native boolean __call100105_25(java.awt.image.BufferedImage a0, java.lang.String a1, java.io.File a2) throws Throwable;
private static native java.lang.String __invokedynamic100105_26(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic100105_28(java.lang.String a0, java.io.File a1) throws Throwable;
private static native void __call100105_29(java.lang.String a0) throws Throwable;
private static native java.lang.Exception __call13010500_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call13010501_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.String __invokedynamic13010502_0(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic13010502_2(java.lang.String a0, java.io.File a1) throws Throwable;
private static native void __call13010502_3(java.lang.String a0) throws Throwable;
private static native java.lang.Class __call13010502_4(java.lang.Exception a0) throws Throwable;
private static native java.lang.String __call13010502_5(java.lang.Class a0) throws Throwable;
private static native java.lang.String __call13010502_6(java.lang.Exception a0) throws Throwable;
private static native java.lang.String __invokedynamic13010502_7(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic13010502_9(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call13010502_10(java.lang.String a0) throws Throwable;
private static native java.lang.Object __inlineStack13010502_11Pack(int a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack13010502_11Output0(java.lang.Object token) throws Throwable;
private static native int __inlineStack13010502_11Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic13010502_12(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic13010502_13(java.lang.String a0, java.lang.String a1, int a2, java.lang.String a3) throws Throwable;
private static native java.nio.IntBuffer __call13010502_14(int a0) throws Throwable;
private static native int __invokedynamic13010502_15(int a0, long a1) throws Throwable;
private static native int __invokedynamic13010502_16(int a0, long a1) throws Throwable;
private static native int __invokedynamic13010502_17(int a0, long a1) throws Throwable;
private static native void __call13010502_18(int a0, int a1, int a2, int a3, java.nio.IntBuffer a4) throws Throwable;
private static native java.nio.IntBuffer __call13010502_19(java.nio.IntBuffer a0, int[] a1) throws Throwable;
private static native void __call13010502_20(java.awt.image.BufferedImage a0, int a1, int a2, int a3, int a4, int[] a5, int a6, int a7) throws Throwable;
private static native java.lang.String __invokedynamic13010502_21(int a0, long a1) throws Throwable;
private static native boolean __call13010502_22(java.awt.image.BufferedImage a0, java.lang.String a1, java.io.File a2) throws Throwable;
private static native java.lang.String __invokedynamic13010502_23(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic13010502_25(java.lang.String a0, java.io.File a1) throws Throwable;
private static native void __call13010502_26(java.lang.String a0) throws Throwable;

}

private static native <E extends Throwable> java.awt.image.BufferedImage __sourceHandlerCall_dae2cf0cc3340eabb1a7(java.lang.String a0, java.awt.image.BufferedImage a1) throws E;
private static final class __SourceHandler_dae2cf0cc3340eabb1a7 {

public static java.awt.image.BufferedImage f1012(java.lang.String p0, java.awt.image.BufferedImage p1) throws Throwable {
    int forwardValue1012_28_0;
    java.awt.image.BufferedImage forwardValue1012_67_0;
    boolean spill1012_0;
    boolean spill1012_1;
    java.awt.image.BufferedImage spill1012_2;
    long life2_3;
    int life4_5;
    int life5_40;
    int life6_45;
    java.awt.image.BufferedImage life7_59;
    java.awt.Graphics2D life8_62;
    forward_join_67: {
    forward_join_66: {
    forward_join_28: {
    forward_join_26: {
    life2_3 = (__fieldRead1012_0() ^ 62983962602482L);
    life4_5 = __call1012_1();
    spill1012_0 = __call1012_3(p0, __invokedynamic1012_2(17264, (891192843700561182L ^ life2_3)));
    if (!((life4_5 != 0))) {
        forwardValue1012_28_0 = __integerCategory1012_4(spill1012_0);
        break forward_join_28;
    }
    if (!((!spill1012_0))) {
        break forward_join_26;
    }
    spill1012_1 = __call1012_6(p0, __invokedynamic1012_5(21809, (5920052729391510366L ^ life2_3)));
    if (!((life4_5 != 0))) {
        forwardValue1012_28_0 = __integerCategory1012_7(spill1012_1);
        break forward_join_28;
    }
    if (!(spill1012_1)) {
        break forward_join_66;
    }
    }
    forwardValue1012_28_0 = __call1012_8(p1);
    }
    life5_40 = forwardValue1012_28_0;
    spill1012_2 = p1;
    if (!((life4_5 != 0))) {
        forwardValue1012_67_0 = spill1012_2;
        break forward_join_67;
    }
    life6_45 = __call1012_9(spill1012_2);
    if (!((life5_40 == (life6_45 * 2)))) {
        break forward_join_66;
    }
    life7_59 = new java.awt.image.BufferedImage(life5_40, (life6_45 * 2), 2);
    life8_62 = __call1012_10(life7_59);
    __call1012_13(life8_62, __fieldRead1012_11(), __fieldRead1012_12());
    __call1012_14(life8_62, p1, 0, 0, life5_40, life6_45, null);
    return life7_59;
    }
    forwardValue1012_67_0 = p1;
    }
    return forwardValue1012_67_0;
}
public static void h1012_0(moom.Oo p0) throws Throwable {
    throw __call1101200_0(p0);
}
public static void h1012_1(moom.Oo p0) throws Throwable {
    throw __call1101201_0(p0);
}
public static void h1012_2(moom.Oo p0) throws Throwable {
    throw __call1101202_0(p0);
}
public static void h1012_3(moom.Oo p0) throws Throwable {
    throw __call1101203_0(p0);
}
private static native long __fieldRead1012_0() throws Throwable;
private static native int __call1012_1() throws Throwable;
private static native java.lang.String __invokedynamic1012_2(int a0, long a1) throws Throwable;
private static native boolean __call1012_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1012_4(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic1012_5(int a0, long a1) throws Throwable;
private static native boolean __call1012_6(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1012_7(boolean value) throws Throwable;
private static native int __call1012_8(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __call1012_9(java.awt.image.BufferedImage a0) throws Throwable;
private static native java.awt.Graphics2D __call1012_10(java.awt.image.BufferedImage a0) throws Throwable;
private static native java.awt.RenderingHints.Key __fieldRead1012_11() throws Throwable;
private static native java.lang.Object __fieldRead1012_12() throws Throwable;
private static native void __call1012_13(java.awt.Graphics2D a0, java.awt.RenderingHints.Key a1, java.lang.Object a2) throws Throwable;
private static native boolean __call1012_14(java.awt.Graphics2D a0, java.awt.image.BufferedImage a1, int a2, int a3, int a4, int a5, java.lang.Object a6) throws Throwable;
private static native java.lang.Exception __call1101200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1101201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1101202_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1101203_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_e96665a8c0a01a61c11a(java.lang.String a0, java.lang.String a1) throws E;
private static final class __SourceHandler_e96665a8c0a01a61c11a {

public static java.lang.String f1013(java.lang.String p0, java.lang.String p1) throws Throwable {
    int forwardValue1013_32_0;
    java.lang.String forwardValue1013_50_0;
    java.lang.String forwardValue1013_50_1;
    int forwardValue1013_63_0;
    java.lang.String forwardValue1013_73_0;
    int forwardValue1013_99_0;
    java.lang.String forwardValue1013_109_0;
    int spill1013_0;
    boolean spill1013_1;
    java.lang.String spill1013_2;
    java.lang.String spill1013_3;
    java.lang.String spill1013_4;
    boolean spill1013_5;
    java.lang.String spill1013_6;
    long life2_3;
    java.lang.String life5_10;
    int life4_11;
    java.lang.String life0_25;
    java.lang.String life0_44;
    java.lang.String life0_60;
    java.lang.String life6_85;
    java.lang.String life0_102;
    java.lang.String life0_106;
    java.lang.String life0_123;
    forward_join_109: {
    forward_join_108: {
    forward_join_99: {
    forward_join_94: {
    forward_join_73: {
    forward_join_68: {
    forward_join_63: {
    forward_join_54: {
    forward_join_50: {
    forward_join_48: {
    forward_join_32: {
    forward_join_25: {
    life2_3 = (__fieldRead1013_0() ^ 55895636070911L);
    spill1013_0 = __call1013_1();
    life5_10 = __invokedynamic1013_2(25553, (8730080237594230689L ^ life2_3));
    life4_11 = spill1013_0;
    spill1013_1 = __call1013_3(p0, life5_10);
    if (!((life4_11 != 0))) {
        forwardValue1013_32_0 = __integerCategory1013_4(spill1013_1);
        break forward_join_32;
    }
    if (!(spill1013_1)) {
        break forward_join_25;
    }
    life0_25 = __call1013_6(p0, __call1013_5(life5_10));
    return life0_25;
    }
    forwardValue1013_32_0 = __integerCategory1013_9(__call1013_8(p0, __invokedynamic1013_7(32680, (1423614385634255835L ^ life2_3))));
    }
    if (!((life4_11 != 0))) {
        forwardValue1013_63_0 = forwardValue1013_32_0;
        break forward_join_63;
    }
    if (!((forwardValue1013_32_0 != 0))) {
        break forward_join_54;
    }
    life0_44 = __call1013_10(p0, 2);
    spill1013_2 = p1;
    spill1013_3 = "/";
    if (!((life4_11 != 0))) {
        forwardValue1013_50_0 = spill1013_2;
        forwardValue1013_50_1 = spill1013_3;
        break forward_join_50;
    }
    if (!((!__call1013_11(spill1013_2, spill1013_3)))) {
        break forward_join_48;
    }
    p1 = __invokedynamic1013_12(p1);
    }
    forwardValue1013_50_0 = p1;
    forwardValue1013_50_1 = life0_44;
    }
    life0_60 = __invokedynamic1013_13(forwardValue1013_50_0, forwardValue1013_50_1);
    return life0_60;
    }
    spill1013_4 = p0;
    if (!((life4_11 != 0))) {
        forwardValue1013_73_0 = spill1013_4;
        break forward_join_73;
    }
    forwardValue1013_63_0 = __integerCategory1013_16(__call1013_15(spill1013_4, __invokedynamic1013_14(14897, (5197548595611821662L ^ life2_3))));
    }
    if (!((forwardValue1013_63_0 != 0))) {
        break forward_join_68;
    }
    p0 = __call1013_17(p0, 1);
    }
    forwardValue1013_73_0 = __invokedynamic1013_18(29254, (4130323973091175957L ^ life2_3));
    }
    life6_85 = forwardValue1013_73_0;
    spill1013_5 = __call1013_20(p0, __invokedynamic1013_19(14882, (1403099260544804440L ^ life2_3)));
    if (!((life4_11 != 0))) {
        forwardValue1013_99_0 = __integerCategory1013_21(spill1013_5);
        break forward_join_99;
    }
    if (!(spill1013_5)) {
        break forward_join_94;
    }
    life0_102 = __call1013_22(p0, 2);
    life0_106 = __invokedynamic1013_23(life6_85, life0_102);
    return life0_106;
    }
    spill1013_6 = p0;
    if (!((life4_11 != 0))) {
        forwardValue1013_109_0 = spill1013_6;
        break forward_join_109;
    }
    forwardValue1013_99_0 = __integerCategory1013_25(__call1013_24(spill1013_6, "/"));
    }
    if (!((forwardValue1013_99_0 != 0))) {
        break forward_join_108;
    }
    life0_123 = __invokedynamic1013_27(life6_85, __call1013_26(p0, 1));
    return life0_123;
    }
    forwardValue1013_109_0 = p0;
    }
    return forwardValue1013_109_0;
}
public static void h1013_0(moom.Oo p0) throws Throwable {
    throw __call1101300_0(p0);
}
public static void h1013_1(moom.Oo p0) throws Throwable {
    throw __call1101301_0(p0);
}
public static void h1013_2(moom.Oo p0) throws Throwable {
    throw __call1101302_0(p0);
}
public static void h1013_3(moom.Oo p0) throws Throwable {
    throw __call1101303_0(p0);
}
public static void h1013_4(moom.Oo p0) throws Throwable {
    throw __call1101304_0(p0);
}
public static void h1013_5(moom.Oo p0) throws Throwable {
    throw __call1101305_0(p0);
}
private static native long __fieldRead1013_0() throws Throwable;
private static native int __call1013_1() throws Throwable;
private static native java.lang.String __invokedynamic1013_2(int a0, long a1) throws Throwable;
private static native boolean __call1013_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1013_4(boolean value) throws Throwable;
private static native int __call1013_5(java.lang.String a0) throws Throwable;
private static native java.lang.String __call1013_6(java.lang.String a0, int a1) throws Throwable;
private static native java.lang.String __invokedynamic1013_7(int a0, long a1) throws Throwable;
private static native boolean __call1013_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1013_9(boolean value) throws Throwable;
private static native java.lang.String __call1013_10(java.lang.String a0, int a1) throws Throwable;
private static native boolean __call1013_11(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic1013_12(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic1013_13(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic1013_14(int a0, long a1) throws Throwable;
private static native boolean __call1013_15(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1013_16(boolean value) throws Throwable;
private static native java.lang.String __call1013_17(java.lang.String a0, int a1) throws Throwable;
private static native java.lang.String __invokedynamic1013_18(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic1013_19(int a0, long a1) throws Throwable;
private static native boolean __call1013_20(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1013_21(boolean value) throws Throwable;
private static native java.lang.String __call1013_22(java.lang.String a0, int a1) throws Throwable;
private static native java.lang.String __invokedynamic1013_23(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native boolean __call1013_24(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1013_25(boolean value) throws Throwable;
private static native java.lang.String __call1013_26(java.lang.String a0, int a1) throws Throwable;
private static native java.lang.String __invokedynamic1013_27(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1101300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1101301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1101302_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1101303_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1101304_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1101305_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.client.renderer.texture.ITextureObject __sourceHandlerCall_a431c5d16e6fe0609ea5(moom.DD a0) throws E;
private static final class __SourceHandler_a431c5d16e6fe0609ea5 {

public static net.minecraft.client.renderer.texture.ITextureObject f1014(moom.DD p0) throws Throwable {
    net.minecraft.client.renderer.texture.ITextureObject forwardValue1014_15_0;
    int spill1014_0;
    net.minecraft.client.renderer.texture.ITextureObject spill1014_1;
    long life1_3;
    net.minecraft.client.renderer.texture.ITextureObject life4_8;
    int life3_9;
    moom.n6 life5_30;
    forward_join_21: {
    forward_join_16: {
    forward_join_15: {
    life1_3 = (__fieldRead1014_0() ^ 69697817871711L);
    spill1014_0 = __call1014_1();
    life4_8 = __call1014_3(__call1014_2(), p0);
    life3_9 = spill1014_0;
    spill1014_1 = life4_8;
    if (!((life3_9 != 0))) {
        forwardValue1014_15_0 = spill1014_1;
        break forward_join_15;
    }
    if (!((spill1014_1 != null))) {
        break forward_join_16;
    }
    forwardValue1014_15_0 = life4_8;
    }
    return forwardValue1014_15_0;
    }
    if (!((!__call1014_4(p0)))) {
        break forward_join_21;
    }
    return null;
    }
    life5_30 = new moom.n6(p0);
    __call1014_6(__call1014_5(), p0, life5_30);
    return life5_30;
}
public static void h1014_0(moom.Oo p0) throws Throwable {
    throw __call1101400_0(p0);
}
public static void h1014_1(moom.Oo p0) throws Throwable {
    throw __call1101401_0(p0);
}
private static native long __fieldRead1014_0() throws Throwable;
private static native int __call1014_1() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call1014_2() throws Throwable;
private static native net.minecraft.client.renderer.texture.ITextureObject __call1014_3(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native boolean __call1014_4(moom.DD a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call1014_5() throws Throwable;
private static native boolean __call1014_6(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1, moom.n6 a2) throws Throwable;
private static native java.lang.Exception __call1101400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1101401_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> moom.DD __sourceHandlerCall_d5ce362822ca2d63c4af(moom.DD a0, java.lang.String a1) throws E;
private static final class __SourceHandler_d5ce362822ca2d63c4af {

public static moom.DD f1015(moom.DD p0, java.lang.String p1) throws Throwable {
    moom.DD forwardValue1015_37_0;
    moom.DD spill1015_0;
    moom.DD spill1015_1;
    long life2_3;
    int life4_5;
    java.lang.String life5_27;
    java.lang.String life6_31;
    forward_join_37: {
    forward_join_36: {
    life2_3 = (__fieldRead1015_0() ^ 133110799456923L);
    life4_5 = __call1015_1();
    spill1015_0 = p0;
    if (!((life4_5 == 0))) {
        forwardValue1015_37_0 = spill1015_0;
        break forward_join_37;
    }
    if (!(__call1015_4(__call1015_2(spill1015_0), __invokedynamic1015_3(16282, (3560935717705246867L ^ life2_3))))) {
        break forward_join_36;
    }
    spill1015_1 = p0;
    if (!((life4_5 == 0))) {
        forwardValue1015_37_0 = spill1015_1;
        break forward_join_37;
    }
    life5_27 = __call1015_5(spill1015_1);
    life6_31 = __call1015_6(life5_27, p1);
    if (!((life6_31 != life5_27))) {
        break forward_join_36;
    }
    p0 = new moom.DD(__call1015_7(p0), life6_31);
    }
    forwardValue1015_37_0 = p0;
    }
    return forwardValue1015_37_0;
}
public static void h1015_0(moom.Oo p0) throws Throwable {
    throw __call1101500_0(p0);
}
public static void h1015_1(moom.Oo p0) throws Throwable {
    throw __call1101501_0(p0);
}
private static native long __fieldRead1015_0() throws Throwable;
private static native int __call1015_1() throws Throwable;
private static native java.lang.String __call1015_2(moom.DD a0) throws Throwable;
private static native java.lang.String __invokedynamic1015_3(int a0, long a1) throws Throwable;
private static native boolean __call1015_4(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call1015_5(moom.DD a0) throws Throwable;
private static native java.lang.String __call1015_6(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call1015_7(moom.DD a0) throws Throwable;
private static native java.lang.Exception __call1101500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1101501_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_6f3e47b032c6aab57570(moom.oR a0) throws E;
private static final class __SourceHandler_6f3e47b032c6aab57570 {

public static void f1016(moom.oR p0) throws Throwable {
    long life1_3;
    int life3_5;
    forward_join_39: {
    forward_join_37: {
    life1_3 = (__fieldRead1016_0() ^ 138975442495789L);
    life3_5 = __call1016_1();
    if (!((life3_5 != 0))) { break forward_join_37; }
    if (!((__call1016_2() != null))) { break forward_join_39; }
    __call1016_4(__invokedynamic1016_3(12848, (2911984383677486749L ^ life1_3)));
    __call1016_5();
    __call1016_6();
    __call1016_7();
    __call1016_8();
    __call1016_9();
    __call1016_10();
    __call1016_11();
    __call1016_12();
    __call1016_13();
    __call1016_14();
    __call1016_15();
    __call1016_16();
    __call1016_17();
    __call1016_18();
    __call1016_19();
    __call1016_20();
    __call1016_21();
    __call1016_22();
    __call1016_23();
    __call1016_24();
    __call1016_25();
    }
    __call1016_27(__call1016_26());
    }
    return;
}
public static void h1016_0(moom.Oo p0) throws Throwable {
    throw __call1101600_0(p0);
}
public static void h1016_1(moom.Oo p0) throws Throwable {
    throw __call1101601_0(p0);
}
private static native long __fieldRead1016_0() throws Throwable;
private static native int __call1016_1() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureMap __call1016_2() throws Throwable;
private static native java.lang.String __invokedynamic1016_3(int a0, long a1) throws Throwable;
private static native void __call1016_4(java.lang.String a0) throws Throwable;
private static native void __call1016_5() throws Throwable;
private static native void __call1016_6() throws Throwable;
private static native void __call1016_7() throws Throwable;
private static native void __call1016_8() throws Throwable;
private static native void __call1016_9() throws Throwable;
private static native void __call1016_10() throws Throwable;
private static native void __call1016_11() throws Throwable;
private static native void __call1016_12() throws Throwable;
private static native void __call1016_13() throws Throwable;
private static native void __call1016_14() throws Throwable;
private static native void __call1016_15() throws Throwable;
private static native void __call1016_16() throws Throwable;
private static native void __call1016_17() throws Throwable;
private static native void __call1016_18() throws Throwable;
private static native void __call1016_19() throws Throwable;
private static native void __call1016_20() throws Throwable;
private static native void __call1016_21() throws Throwable;
private static native void __call1016_22() throws Throwable;
private static native void __call1016_23() throws Throwable;
private static native void __call1016_24() throws Throwable;
private static native void __call1016_25() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call1016_26() throws Throwable;
private static native void __call1016_27(net.minecraft.client.renderer.texture.TextureManager a0) throws Throwable;
private static native java.lang.Exception __call1101600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1101601_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_07f39de50cac827d487f(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws E;
private static final class __SourceHandler_07f39de50cac827d487f {

public static void f169(net.minecraft.client.renderer.texture.TextureAtlasSprite p0) throws Throwable {
    int spill169_0;
    int spill169_1;
    int spill169_2;
    long life1_3;
    int[][] life4_8;
    int life3_9;
    int life5_11;
    int[] life6_19;
    lexical_join_50: {
    life1_3 = (__fieldRead169_0() ^ 34285551578160L);
    spill169_0 = __call169_1();
    life4_8 = __call169_2(p0, 0);
    life3_9 = spill169_0;
    life5_11 = 0;
    lexical_cycle_12: while (true) {
    lexical_join_47: {
    lexical_join_36: {
    lexical_join_34: {
    if (!((life5_11 < (life4_8).length))) {
        break lexical_join_50;
    }
    life6_19 = (life4_8)[life5_11];
    if (!((life3_9 == 0))) {
        break lexical_join_34;
    }
    if (!((life6_19 == null))) {
        break lexical_join_36;
    }
    spill169_1 = life5_11;
    int[] __stackOp169_4_0 = life6_19;
    java.lang.String __stackOp169_4_1 = __invokedynamic169_3(6045, (128299392726529539L ^ life1_3));
    __call169_6(__invokedynamic169_5(spill169_1, __stackOp169_4_1, __stackOp169_4_0));
    }
    if (!((life3_9 != 0))) {
        break lexical_join_47;
    }
    }
    spill169_2 = life5_11;
    int __stackOp169_8_0 = (life6_19).length;
    java.lang.String __stackOp169_8_1 = __invokedynamic169_7(29095, (8983133356742086681L ^ life1_3));
    __call169_10(__invokedynamic169_9(spill169_2, __stackOp169_8_1, __stackOp169_8_0));
    }
    life5_11 += 1;
    if (!((life3_9 != 0))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    return;
}
public static void h169_0(moom.Oo p0) throws Throwable {
    throw __call1016900_0(p0);
}
public static void h169_1(moom.Oo p0) throws Throwable {
    throw __call1016901_0(p0);
}
public static void h169_2(moom.Oo p0) throws Throwable {
    throw __call1016902_0(p0);
}
private static native long __fieldRead169_0() throws Throwable;
private static native int __call169_1() throws Throwable;
private static native int[][] __call169_2(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native java.lang.String __invokedynamic169_3(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic169_5(int a0, java.lang.String a1, int[] a2) throws Throwable;
private static native void __call169_6(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic169_7(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic169_9(int a0, java.lang.String a1, int a2) throws Throwable;
private static native void __call169_10(java.lang.String a0) throws Throwable;
private static native java.lang.Exception __call1016900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1016901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1016902_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_f8a34e04b5d48bf0aef0(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws E;
private static final class __SourceHandler_f8a34e04b5d48bf0aef0 {

public static void f1018(net.minecraft.client.renderer.texture.TextureAtlasSprite p0, int p1) throws Throwable {
    int[] lexicalValue1018_74_0;
    int lexicalValue1018_80_0;
    int lexicalValue1018_80_1;
    int lexicalValue1018_102_0;
    int lexicalValue1018_142_0;
    int lexicalValue1018_142_1;
    int spill1018_0;
    int[] spill1018_1;
    int spill1018_2;
    int spill1018_3;
    int spill1018_4;
    long life2_3;
    int life5_7;
    int life4_8;
    int life6_11;
    java.util.ArrayList life7_19;
    int[][] life8_24;
    int[] life9_29;
    java.util.ArrayList life7_44;
    int life8_47;
    int life9_49;
    int[] life10_57;
    int life11_107;
    java.awt.image.BufferedImage life12_130;
    java.awt.image.BufferedImage life13_143;
    int[] life14_148;
    int[][] life11_165;
    lexical_join_162: {
    lexical_join_156: {
    lexical_join_41: {
    life2_3 = (__fieldRead1018_0() ^ 10437006956239L);
    spill1018_0 = __call1018_1();
    life5_7 = __call1018_2(p0);
    life4_8 = spill1018_0;
    life6_11 = __call1018_3(p0);
    if (!((__call1018_4(p0) < 1))) {
        break lexical_join_41;
    }
    life7_19 = new java.util.ArrayList();
    life8_24 = new int[(p1 + 1)][];
    life9_29 = new int[(life5_7 * life6_11)];
    (life8_24)[0] = life9_29;
    __call1018_5(life7_19, life8_24);
    __call1018_6(p0, life7_19);
    }
    life7_44 = new java.util.ArrayList();
    life8_47 = __call1018_7(p0);
    life9_49 = 0;
    lexical_cycle_50: while (true) {
    lexical_join_142: {
    lexical_join_140: {
    lexical_join_103: {
    lexical_join_102: {
    lexical_join_80: {
    lexical_join_75: {
    lexical_join_74: {
    lexical_join_70: {
    if (!((life9_49 < life8_47))) {
        break lexical_join_156;
    }
    life10_57 = __call1018_8(p0, life9_49, 0);
    if (!((life4_8 == 0))) {
        break lexical_join_162;
    }
    spill1018_1 = life10_57;
    if (!((life4_8 == 0))) {
        lexicalValue1018_74_0 = spill1018_1;
        break lexical_join_74;
    }
    if (!((spill1018_1 != null))) {
        break lexical_join_70;
    }
    spill1018_2 = (life10_57).length;
    spill1018_3 = 1;
    if (!((life4_8 == 0))) {
        lexicalValue1018_80_0 = spill1018_2;
        lexicalValue1018_80_1 = spill1018_3;
        break lexical_join_80;
    }
    if (!((spill1018_2 < spill1018_3))) {
        break lexical_join_75;
    }
    }
    lexicalValue1018_74_0 = new int[(life5_7 * life6_11)];
    }
    life10_57 = lexicalValue1018_74_0;
    }
    lexicalValue1018_80_0 = (life10_57).length;
    lexicalValue1018_80_1 = (life5_7 * life6_11);
    }
    if (!((life4_8 == 0))) {
        lexicalValue1018_142_0 = lexicalValue1018_80_0;
        lexicalValue1018_142_1 = lexicalValue1018_80_1;
        break lexical_join_142;
    }
    if (!((lexicalValue1018_80_0 != lexicalValue1018_80_1))) {
        break lexical_join_140;
    }
    life11_107 = ((int) __call1018_10(__call1018_9(((double) (life10_57).length))));
    spill1018_4 = (life11_107 * life11_107);
    if (!((life4_8 == 0))) {
        lexicalValue1018_102_0 = spill1018_4;
        break lexical_join_102;
    }
    if (!((spill1018_4 != (life10_57).length))) {
        break lexical_join_103;
    }
    life10_57 = new int[1];
    lexicalValue1018_102_0 = 1;
    }
    life11_107 = lexicalValue1018_102_0;
    }
    life12_130 = new java.awt.image.BufferedImage(life11_107, life11_107, 2);
    __call1018_11(life12_130, 0, 0, life11_107, life11_107, life10_57, 0, life11_107);
    life13_143 = __call1018_12(life12_130, life5_7);
    life14_148 = new int[(life5_7 * life6_11)];
    __call1018_13(life13_143, 0, 0, life5_7, life6_11, life14_148, 0, life5_7);
    life10_57 = life14_148;
    }
    lexicalValue1018_142_0 = p1;
    lexicalValue1018_142_1 = 1;
    }
    life11_165 = new int[(lexicalValue1018_142_0 + lexicalValue1018_142_1)][];
    (life11_165)[0] = life10_57;
    __call1018_14(life7_44, life11_165);
    life9_49 += 1;
    if (!((life4_8 != 0))) { continue lexical_cycle_50; }
    break lexical_cycle_50;
    }
    }
    __call1018_15(p0, life7_44);
    __call1018_16(p0, p1);
    }
    return;
}
public static void h1018_0(moom.Oo p0) throws Throwable {
    throw __call1101800_0(p0);
}
public static void h1018_1(moom.Oo p0) throws Throwable {
    throw __call1101801_0(p0);
}
public static void h1018_2(moom.Oo p0) throws Throwable {
    throw __call1101802_0(p0);
}
public static void h1018_3(moom.Oo p0) throws Throwable {
    throw __call1101803_0(p0);
}
public static void h1018_4(moom.Oo p0) throws Throwable {
    throw __call1101804_0(p0);
}
public static void h1018_5(moom.Oo p0) throws Throwable {
    throw __call1101805_0(p0);
}
public static void h1018_6(moom.Oo p0) throws Throwable {
    throw __call1101806_0(p0);
}
private static native long __fieldRead1018_0() throws Throwable;
private static native int __call1018_1() throws Throwable;
private static native int __call1018_2(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call1018_3(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call1018_4(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native boolean __call1018_5(java.util.ArrayList a0, int[][] a1) throws Throwable;
private static native void __call1018_6(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, java.util.ArrayList a1) throws Throwable;
private static native int __call1018_7(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int[] __call1018_8(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1, int a2) throws Throwable;
private static native double __call1018_9(double a0) throws Throwable;
private static native long __call1018_10(double a0) throws Throwable;
private static native void __call1018_11(java.awt.image.BufferedImage a0, int a1, int a2, int a3, int a4, int[] a5, int a6, int a7) throws Throwable;
private static native java.awt.image.BufferedImage __call1018_12(java.awt.image.BufferedImage a0, int a1) throws Throwable;
private static native int[] __call1018_13(java.awt.image.BufferedImage a0, int a1, int a2, int a3, int a4, int[] a5, int a6, int a7) throws Throwable;
private static native boolean __call1018_14(java.util.ArrayList a0, int[][] a1) throws Throwable;
private static native void __call1018_15(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, java.util.ArrayList a1) throws Throwable;
private static native void __call1018_16(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1) throws Throwable;
private static native java.lang.Exception __call1101800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1101801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1101802_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1101803_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1101804_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1101805_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1101806_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int[] __sourceHandlerCall_4accc731486e3483f70c(net.minecraft.client.renderer.texture.TextureAtlasSprite a0, int a1, int a2) throws E;
private static final class __SourceHandler_4accc731486e3483f70c {

public static int[] f1019(net.minecraft.client.renderer.texture.TextureAtlasSprite p0, int p1, int p2) throws Throwable {
    java.lang.Object forwardValue1019_20_0;
    int[][] forwardValue1019_27_0;
    int[][] forwardValue1019_33_0;
    int spill1019_0;
    java.util.List spill1019_1;
    int[][] spill1019_2;
    long life3_3;
    java.util.List life6_7;
    int life5_8;
    int[][] life7_26;
    forward_join_36: {
    forward_join_33: {
    forward_join_27: {
    forward_join_20: {
    forward_join_17: {
    life3_3 = (__fieldRead1019_0() ^ 33247464190969L);
    spill1019_0 = __call1019_1();
    life6_7 = __call1019_2(p0);
    life5_8 = spill1019_0;
    spill1019_1 = life6_7;
    if (!((life5_8 != 0))) {
        forwardValue1019_20_0 = spill1019_1;
        break forward_join_20;
    }
    if (!((__call1019_3(spill1019_1) <= p1))) {
        break forward_join_17;
    }
    return null;
    }
    forwardValue1019_20_0 = __call1019_4(life6_7, p1);
    }
    life7_26 = __cast1019_5(forwardValue1019_20_0);
    spill1019_2 = life7_26;
    if (!((life5_8 != 0))) {
        forwardValue1019_27_0 = spill1019_2;
        break forward_join_27;
    }
    if (!((spill1019_2 != null))) {
        break forward_join_36;
    }
    forwardValue1019_27_0 = life7_26;
    }
    if (!((life5_8 != 0))) {
        forwardValue1019_33_0 = forwardValue1019_27_0;
        break forward_join_33;
    }
    if (!(((forwardValue1019_27_0).length > p2))) {
        break forward_join_36;
    }
    forwardValue1019_33_0 = life7_26;
    }
    return (forwardValue1019_33_0)[p2];
    }
    return null;
}
public static void h1019_0(moom.Oo p0) throws Throwable {
    throw __call1101900_0(p0);
}
public static void h1019_1(moom.Oo p0) throws Throwable {
    throw __call1101901_0(p0);
}
public static void h1019_2(moom.Oo p0) throws Throwable {
    throw __call1101902_0(p0);
}
public static void h1019_3(moom.Oo p0) throws Throwable {
    throw __call1101903_0(p0);
}
public static void h1019_4(moom.Oo p0) throws Throwable {
    throw __call1101904_0(p0);
}
private static native long __fieldRead1019_0() throws Throwable;
private static native int __call1019_1() throws Throwable;
private static native java.util.List __call1019_2(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call1019_3(java.util.List a0) throws Throwable;
private static native java.lang.Object __call1019_4(java.util.List a0, int a1) throws Throwable;
private static native int[][] __cast1019_5(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1101900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1101901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1101902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1101903_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1101904_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_13aeab9cddd5bfe4bd48(int a0) throws E;
private static final class __SourceHandler_13aeab9cddd5bfe4bd48 {

public static boolean f1020(int p0) throws Throwable {
    int forwardValue1020_15_0;
    int forwardValue1020_17_0;
    int spill1020_0;
    int spill1020_1;
    long life1_3;
    int life4_7;
    int life3_8;
    forward_join_17: {
    forward_join_16: {
    forward_join_15: {
    life1_3 = (__fieldRead1020_0() ^ 62193182275198L);
    spill1020_0 = __call1020_1();
    life4_7 = __call1020_2(p0);
    life3_8 = spill1020_0;
    spill1020_1 = life4_7;
    if (!((life3_8 == 0))) {
        forwardValue1020_15_0 = spill1020_1;
        break forward_join_15;
    }
    if (!((spill1020_1 == p0))) {
        break forward_join_16;
    }
    forwardValue1020_15_0 = 1;
    }
    forwardValue1020_17_0 = forwardValue1020_15_0;
    break forward_join_17;
    }
    forwardValue1020_17_0 = 0;
    }
    return __integerCategory1020_3(forwardValue1020_17_0);
}
public static void h1020_0(moom.Oo p0) throws Throwable {
    throw __call1102000_0(p0);
}
public static void h1020_1(moom.Oo p0) throws Throwable {
    throw __call1102001_0(p0);
}
private static native long __fieldRead1020_0() throws Throwable;
private static native int __call1020_1() throws Throwable;
private static native int __call1020_2(int a0) throws Throwable;
private static native boolean __integerCategory1020_3(int value) throws Throwable;
private static native java.lang.Exception __call1102000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1102001_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_e0b16f10259a2dfa3fd4() throws E;
private static final class __SourceHandler_e0b16f10259a2dfa3fd4 {

public static void f1021() throws Throwable {
    moom.oR forwardValue1021_14_0;
    int spill1021_0;
    moom.oR spill1021_1;
    long life0_3;
    moom.oR life3_6;
    int life2_7;
    moom.oP life4_21;
    net.minecraft.client.resources.IResourceManagerReloadListener life5_23;
    moom.Od life4_30;
    moom.DD life5_39;
    forward_join_21: {
    forward_join_14: {
    life0_3 = (__fieldRead1021_0() ^ 64282756841814L);
    spill1021_0 = __call1021_1();
    life3_6 = __call1021_2();
    life2_7 = spill1021_0;
    spill1021_1 = life3_6;
    if (!((life2_7 != 0))) {
        forwardValue1021_14_0 = spill1021_1;
        break forward_join_14;
    }
    if (!((__instanceOf1021_3(spill1021_1) != 0))) {
        break forward_join_21;
    }
    forwardValue1021_14_0 = life3_6;
    }
    life4_21 = __cast1021_4(forwardValue1021_14_0);
    life5_23 = __invokedynamic1021_5();
    __call1021_6(life4_21, life5_23);
    }
    life4_30 = new moom.Od();
    life5_39 = new moom.DD(__invokedynamic1021_7(1238, (8004460202221537284L ^ life0_3)));
    __call1021_9(__call1021_8(), life5_39, life4_30);
    return;
}
public static void h1021_0(moom.Oo p0) throws Throwable {
    throw __call1102100_0(p0);
}
public static void h1021_1(moom.Oo p0) throws Throwable {
    throw __call1102101_0(p0);
}
private static native long __fieldRead1021_0() throws Throwable;
private static native int __call1021_1() throws Throwable;
private static native moom.oR __call1021_2() throws Throwable;
private static native int __instanceOf1021_3(moom.oR a0) throws Throwable;
private static native moom.oP __cast1021_4(moom.oR a0) throws Throwable;
private static native net.minecraft.client.resources.IResourceManagerReloadListener __invokedynamic1021_5() throws Throwable;
private static native void __call1021_6(moom.oP a0, net.minecraft.client.resources.IResourceManagerReloadListener a1) throws Throwable;
private static native java.lang.String __invokedynamic1021_7(int a0, long a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call1021_8() throws Throwable;
private static native boolean __call1021_9(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1, moom.Od a2) throws Throwable;
private static native java.lang.Exception __call1102100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1102101_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_458e4205460dfce1ed0c(int a0, int a1) throws E;
private static final class __SourceHandler_458e4205460dfce1ed0c {

public static int f1022(int p0, int p1) throws Throwable {
    int lexicalValue1022_17_0;
    int lexicalValue1022_17_1;
    int lexicalValue1022_31_0;
    int spill1022_0;
    int spill1022_1;
    int spill1022_2;
    long life2_3;
    int life4_5;
    int life5_23;
    lexical_join_31: {
    lexical_join_30: {
    lexical_join_17: {
    lexical_join_13: {
    life2_3 = (__fieldRead1022_0() ^ 47831935733120L);
    life4_5 = __call1022_1();
    spill1022_0 = p0;
    spill1022_1 = p1;
    if (!((life4_5 == 0))) {
        lexicalValue1022_17_0 = spill1022_0;
        lexicalValue1022_17_1 = spill1022_1;
        break lexical_join_17;
    }
    if (!((spill1022_0 >= spill1022_1))) {
        break lexical_join_13;
    }
    return p0;
    }
    lexicalValue1022_17_0 = (p1 / p0);
    lexicalValue1022_17_1 = p0;
    }
    life5_23 = (lexicalValue1022_17_0 * lexicalValue1022_17_1);
    lexical_cycle_19: while (true) {
    if (!((life5_23 < p1))) {
        break lexical_join_30;
    }
    spill1022_2 = (life5_23 + p0);
    if (!((life4_5 == 0))) {
        lexicalValue1022_31_0 = spill1022_2;
        break lexical_join_31;
    }
    life5_23 = spill1022_2;
    if (!((life4_5 != 0))) { continue lexical_cycle_19; }
    break lexical_cycle_19;
    }
    }
    lexicalValue1022_31_0 = life5_23;
    }
    return lexicalValue1022_31_0;
}
public static void h1022_0(moom.Oo p0) throws Throwable {
    throw __call1102200_0(p0);
}
public static void h1022_1(moom.Oo p0) throws Throwable {
    throw __call1102201_0(p0);
}
private static native long __fieldRead1022_0() throws Throwable;
private static native int __call1022_1() throws Throwable;
private static native java.lang.Exception __call1102200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1102201_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_356f5e5fcd985996f0be() throws E;
private static final class __SourceHandler_356f5e5fcd985996f0be {

public static void f1023() throws Throwable {
    int forwardValue1023_16_0;
    boolean spill1023_0;
    int spill1023_1;
    long spill1023_2;
    long life0_3;
    int life2_5;
    float life3_20;
    float life4_24;
    float life4_31;
    forward_join_37: {
    forward_join_16: {
    life0_3 = (__fieldRead1023_0() ^ 41947472594406L);
    life2_5 = __call1023_1();
    spill1023_0 = __fieldRead1023_3(__call1023_2());
    if (!((life2_5 == 0))) {
        forwardValue1023_16_0 = __integerCategory1023_4(spill1023_0);
        break forward_join_16;
    }
    if (!(spill1023_0)) {
        break forward_join_37;
    }
    forwardValue1023_16_0 = __invokedynamic1023_5(11466, (3952977898997798394L ^ life0_3));
    }
    life3_20 = __call1023_6(forwardValue1023_16_0);
    spill1023_1 = 5280;
    life4_24 = ((float) __call1023_7());
    spill1023_2 = (7681572555764755850L ^ life0_3);
    life4_31 = __call1023_8(life4_24, life3_20);
    __call1023_11(__invokedynamic1023_9(spill1023_1, spill1023_2), __invokedynamic1023_10(23756, (484349152559900128L ^ life0_3)), life4_31);
    }
    return;
}
public static void h1023_0(moom.Oo p0) throws Throwable {
    throw __call1102300_0(p0);
}
private static native long __fieldRead1023_0() throws Throwable;
private static native int __call1023_1() throws Throwable;
private static native org.lwjgl.opengl.ContextCapabilities __call1023_2() throws Throwable;
private static native boolean __fieldRead1023_3(org.lwjgl.opengl.ContextCapabilities a0) throws Throwable;
private static native int __integerCategory1023_4(boolean value) throws Throwable;
private static native int __invokedynamic1023_5(int a0, long a1) throws Throwable;
private static native float __call1023_6(int a0) throws Throwable;
private static native int __call1023_7() throws Throwable;
private static native float __call1023_8(float a0, float a1) throws Throwable;
private static native int __invokedynamic1023_9(int a0, long a1) throws Throwable;
private static native int __invokedynamic1023_10(int a0, long a1) throws Throwable;
private static native void __call1023_11(int a0, int a1, float a2) throws Throwable;
private static native java.lang.Exception __call1102300_0(moom.Oo a0) throws Throwable;

}


public static void b() { __sourceHandlerCall_e0b16f10259a2dfa3fd4(); }


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral6826_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Oc"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static int b(int p0, int p1) { return __sourceHandlerCall_458e4205460dfce1ed0c(p0, p1); }


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Oc.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x7D5A;
        if (y[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = x[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])z.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    z.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Oc", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Oc.y[n2] = n4;
        }
        return y[n2];
}


public static int b(int p0) {
int lexicalValue1040_23_0;
    int spill1040_0;
    int spill1040_1;
    long life1_3;
    int life4_6;
    int life3_7;
    int life5_9;
    lexical_join_23: {
    lexical_join_22: {
    life1_3 = (moom.Oc.t ^ 133022414768185L);
    spill1040_0 = moom.Ob.b();
    life4_6 = 1;
    life3_7 = spill1040_0;
    life5_9 = 0;
    lexical_cycle_10: while (true) {
    if (!((life4_6 < p0))) {
        break lexical_join_22;
    }
    spill1040_1 = (life4_6 * 2);
    if (!((life3_7 == 0))) {
        lexicalValue1040_23_0 = spill1040_1;
        break lexical_join_23;
    }
    life4_6 = spill1040_1;
    life5_9 += 1;
    if (!((life3_7 != 0))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    lexicalValue1040_23_0 = life5_9;
    }
    return lexicalValue1040_23_0;
}


public static void c() { __sourceHandlerCall_356f5e5fcd985996f0be(); }


public static int c(int p0) {
int lexicalValue1041_23_0;
    int spill1041_0;
    int spill1041_1;
    long life1_3;
    int life4_6;
    int life3_7;
    int life5_9;
    lexical_join_23: {
    lexical_join_22: {
    life1_3 = (moom.Oc.t ^ 116107386347611L);
    spill1041_0 = moom.Ob.b();
    life4_6 = 1;
    life3_7 = spill1041_0;
    life5_9 = 0;
    lexical_cycle_10: while (true) {
    if (!((life5_9 < p0))) {
        break lexical_join_22;
    }
    spill1041_1 = (life4_6 * 2);
    if (!((life3_7 == 0))) {
        lexicalValue1041_23_0 = spill1041_1;
        break lexical_join_23;
    }
    life4_6 = spill1041_1;
    life5_9 += 1;
    if (!((life3_7 != 0))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    lexicalValue1041_23_0 = life4_6;
    }
    return lexicalValue1041_23_0;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public static int a(int p0) {
int lexicalValue1039_20_0;
    int spill1039_0;
    int spill1039_1;
    long life1_3;
    int life4_6;
    int life3_7;
    lexical_join_20: {
    lexical_join_19: {
    life1_3 = (moom.Oc.t ^ 28505022087179L);
    spill1039_0 = moom.Ob.b();
    life4_6 = 1;
    life3_7 = spill1039_0;
    lexical_cycle_8: while (true) {
    if (!((life4_6 < p0))) {
        break lexical_join_19;
    }
    spill1039_1 = (life4_6 * 2);
    if (!((life3_7 == 0))) {
        lexicalValue1039_20_0 = spill1039_1;
        break lexical_join_20;
    }
    life4_6 = spill1039_1;
    if (!((life3_7 != 0))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    lexicalValue1039_20_0 = life4_6;
    }
    return lexicalValue1039_20_0;
}


public static void a(net.minecraft.client.renderer.texture.TextureAtlasSprite p0, int p1) { __sourceHandlerCall_f8a34e04b5d48bf0aef0(p0, p1); }


public static int a() { return __sourceHandlerCall_83f0eb94367013dfeef9(); }


public static int[] a(net.minecraft.client.renderer.texture.TextureAtlasSprite p0, int p1, int p2) { return __sourceHandlerCall_4accc731486e3483f70c(p0, p1, p2); }


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6835_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Oc"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static java.awt.image.BufferedImage a(java.lang.String p0, java.awt.image.BufferedImage p1) { return __sourceHandlerCall_dae2cf0cc3340eabb1a7(p0, p1); }


public static void a__Void() {
long life0_3;
    net.minecraft.client.renderer.texture.TextureMap life2_5;
    java.lang.String life3_13;
    java.lang.String life4_179;
    life0_3 = (moom.Oc.t ^ 70616556730241L);
    life2_5 = moom.Oc.a__n8();
    if ((life2_5 != null)) {
        life3_13 = __sourceIntrinsic_b82a5b29b709_invokedynamic5702_2(23291, (3946629943454834940L ^ life0_3));
        a = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(((net.minecraft.client.renderer.texture.TextureMap)(life2_5)).c(((java.lang.String)(__sourceIntrinsic_b82a5b29b709_invokedynamic5702_4(life3_13, __sourceIntrinsic_b82a5b29b709_invokedynamic5702_3(3234, (8188748634829551278L ^ life0_3))))))));
        b = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(((net.minecraft.client.renderer.texture.TextureMap)(life2_5)).c(((java.lang.String)(__sourceIntrinsic_b82a5b29b709_invokedynamic5702_8(life3_13, __sourceIntrinsic_b82a5b29b709_invokedynamic5702_7(17432, (901754232071929356L ^ life0_3))))))));
        c = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(((net.minecraft.client.renderer.texture.TextureMap)(life2_5)).c(((java.lang.String)(__sourceIntrinsic_b82a5b29b709_invokedynamic5702_12(life3_13, __sourceIntrinsic_b82a5b29b709_invokedynamic5702_11(24373, (4273115387951686974L ^ life0_3))))))));
        d = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(((net.minecraft.client.renderer.texture.TextureMap)(life2_5)).c(((java.lang.String)(__sourceIntrinsic_b82a5b29b709_invokedynamic5702_16(life3_13, __sourceIntrinsic_b82a5b29b709_invokedynamic5702_15(15223, (9122536920096457085L ^ life0_3))))))));
        e = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(((net.minecraft.client.renderer.texture.TextureMap)(life2_5)).c(((java.lang.String)(__sourceIntrinsic_b82a5b29b709_invokedynamic5702_20(life3_13, __sourceIntrinsic_b82a5b29b709_invokedynamic5702_19(16541, (123861127579679368L ^ life0_3))))))));
        f = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(((net.minecraft.client.renderer.texture.TextureMap)(life2_5)).c(((java.lang.String)(__sourceIntrinsic_b82a5b29b709_invokedynamic5702_24(life3_13, __sourceIntrinsic_b82a5b29b709_invokedynamic5702_23(6996, (4219102389180293452L ^ life0_3))))))));
        g = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(((net.minecraft.client.renderer.texture.TextureMap)(life2_5)).c(((java.lang.String)(__sourceIntrinsic_b82a5b29b709_invokedynamic5702_28(life3_13, __sourceIntrinsic_b82a5b29b709_invokedynamic5702_27(12753, (3208416361435843545L ^ life0_3))))))));
        h = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(((net.minecraft.client.renderer.texture.TextureMap)(life2_5)).c(((java.lang.String)(__sourceIntrinsic_b82a5b29b709_invokedynamic5702_32(life3_13, __sourceIntrinsic_b82a5b29b709_invokedynamic5702_31(16676, (6963163415775361854L ^ life0_3))))))));
        i = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(((net.minecraft.client.renderer.texture.TextureMap)(life2_5)).c(((java.lang.String)(__sourceIntrinsic_b82a5b29b709_invokedynamic5702_36(life3_13, __sourceIntrinsic_b82a5b29b709_invokedynamic5702_35(25702, (2152519532983262792L ^ life0_3))))))));
        j = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(((net.minecraft.client.renderer.texture.TextureMap)(life2_5)).c(((java.lang.String)(__sourceIntrinsic_b82a5b29b709_invokedynamic5702_40(life3_13, __sourceIntrinsic_b82a5b29b709_invokedynamic5702_39(4679, (8265373516037613639L ^ life0_3))))))));
        k = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(((net.minecraft.client.renderer.texture.TextureMap)(life2_5)).c(((java.lang.String)(__sourceIntrinsic_b82a5b29b709_invokedynamic5702_44(life3_13, __sourceIntrinsic_b82a5b29b709_invokedynamic5702_43(24325, (358835928070628615L ^ life0_3))))))));
        m = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(((net.minecraft.client.renderer.texture.TextureMap)(life2_5)).c(((java.lang.String)(__sourceIntrinsic_b82a5b29b709_invokedynamic5702_48(life3_13, __sourceIntrinsic_b82a5b29b709_invokedynamic5702_47(26838, (324620018440082128L ^ life0_3))))))));
        n = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(((net.minecraft.client.renderer.texture.TextureMap)(life2_5)).c(((java.lang.String)(__sourceIntrinsic_b82a5b29b709_invokedynamic5702_52(life3_13, __sourceIntrinsic_b82a5b29b709_invokedynamic5702_51(21326, (3947949176334592336L ^ life0_3))))))));
        l = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(((net.minecraft.client.renderer.texture.TextureMap)(life2_5)).c(((java.lang.String)(__sourceIntrinsic_b82a5b29b709_invokedynamic5702_56(life3_13, __sourceIntrinsic_b82a5b29b709_invokedynamic5702_55(11639, (2015046481131755374L ^ life0_3))))))));
        o = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(((net.minecraft.client.renderer.texture.TextureMap)(life2_5)).c(((java.lang.String)(__sourceIntrinsic_b82a5b29b709_invokedynamic5702_60(life3_13, __sourceIntrinsic_b82a5b29b709_invokedynamic5702_59(16780, (4796725443846978460L ^ life0_3))))))));
        p = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(((net.minecraft.client.renderer.texture.TextureMap)(life2_5)).c(((java.lang.String)(__sourceIntrinsic_b82a5b29b709_invokedynamic5702_64(life3_13, __sourceIntrinsic_b82a5b29b709_invokedynamic5702_63(6806, (391173038929567885L ^ life0_3))))))));
        life4_179 = __sourceIntrinsic_b82a5b29b709_invokedynamic5702_67(25994, (7754050095260573571L ^ life0_3));
        q = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(((net.minecraft.client.renderer.texture.TextureMap)(life2_5)).c(((java.lang.String)(__sourceIntrinsic_b82a5b29b709_invokedynamic5702_69(life4_179, __sourceIntrinsic_b82a5b29b709_invokedynamic5702_68(29461, (3060067692186372374L ^ life0_3))))))));
        r = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(((net.minecraft.client.renderer.texture.TextureMap)(life2_5)).c(((java.lang.String)(__sourceIntrinsic_b82a5b29b709_invokedynamic5702_73(life4_179, __sourceIntrinsic_b82a5b29b709_invokedynamic5702_72(51, (4620437765776898604L ^ life0_3))))))));
    }
    return;
}


public static int a(int p0, int p1) { return __sourceHandlerCall_a05be14f64ae236e4124(p0, p1); }


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.Oc.a(((int)(local4)), ((long)(local5)));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 3088);
    if (((moom.Oc.v)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.Oc.w)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.Oc.w)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/Oc", life9_51);
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
        life9_116 = ((java.lang.String)((moom.Oc.u)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.Oc.v)[life5_8] = moom.Oc.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.Oc.v)[life5_8];
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
        byte[] spill3464_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3464_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3464_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3464_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3464_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3464_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public static java.lang.String a(java.lang.String p0) { return __sourceHandlerCall_0b9296f478ff54e31d44(p0); }


public static java.lang.String a(java.lang.String p0, java.lang.String p1) { return __sourceHandlerCall_e96665a8c0a01a61c11a(p0, p1); }


public static moom.DD a(moom.DD p0, java.lang.String p1) { return __sourceHandlerCall_d5ce362822ca2d63c4af(p0, p1); }


public static net.minecraft.client.renderer.texture.ITextureObject a(moom.DD p0) { return __sourceHandlerCall_a431c5d16e6fe0609ea5(p0); }


public static net.minecraft.client.renderer.texture.TextureMap a__n8() {
return ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__n8();
}


public static void a(moom.oR p0) { __sourceHandlerCall_6f3e47b032c6aab57570(p0); }


public static void a(java.lang.String p0, int p1, int p2, int p3, int p4) { __sourceHandlerCall_24e0011ee2fac3499c88(p0, p1, p2, p3, p4); }


public static void a(net.minecraft.client.renderer.texture.TextureAtlasSprite p0) { __sourceHandlerCall_07f39de50cac827d487f(p0); }


public static java.awt.Dimension a(java.io.InputStream p0, java.lang.String p1) { return __sourceHandlerCall_defb81f4251b3cae6a15(p0, p1); }


public static java.awt.image.BufferedImage a(java.awt.image.BufferedImage p0, int p1) { return __sourceHandlerCall_fbdf40e86fe29d0e4ea9(p0, p1); }


public static boolean a__Boolean(int p0) { return __sourceHandlerCall_13aeab9cddd5bfe4bd48(p0); }


public static void a__Void(int p0) {
moom.kZ.i(((int)(p0)));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite748_98(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6835_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic5702_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic5702_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic5702_4(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic5702_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic5702_8(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic5702_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic5702_12(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic5702_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic5702_16(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic5702_19(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic5702_20(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic5702_23(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic5702_24(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic5702_27(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic5702_28(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic5702_31(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic5702_32(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic5702_35(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic5702_36(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic5702_39(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic5702_40(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic5702_43(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic5702_44(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic5702_47(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic5702_48(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic5702_51(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic5702_52(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic5702_55(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic5702_56(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic5702_59(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic5702_60(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic5702_63(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic5702_64(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic5702_67(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic5702_68(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic5702_69(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic5702_72(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic5702_73(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral6826_0() throws E;
}
