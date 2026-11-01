package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class cb extends sourcebuild.EnumConstructor<com.moon.cb> {

public static com.moon.cb RECTANGLE;

public static com.moon.cb TRIANGLE;

public static com.moon.cb ROUNDED_RECTANGLE;

public static com.moon.cb OUTLINE_ROUNDED_RECTANGLE;

public static com.moon.cb TEXTURE;

public static com.moon.cb TEXTURE_COL;

public static com.moon.cb TEXTURE_ROUND;

public static com.moon.cb GRADIENT;

public static com.moon.cb WORLD;

public static com.moon.cb KAWASE_UP;

public static com.moon.cb KAWASE_DOWN;

public static com.moon.cb KAWASE_FOG;

public static com.moon.cb KAWASE_STENCIL;

public static com.moon.cb SHADOW_UP;

public static com.moon.cb SHADOW_DOWN;

public static com.moon.cb GLOW_UP;

public static com.moon.cb GLOW_DOWN;

public static com.moon.cb ENTITY_OUTLINE;

public static com.moon.cb JUMP_FLOOD_OUTLINE;

public static com.moon.cb JUMP_FLOOD_OUTLINE_BASE;

public static com.moon.cb MSDF;

public static com.moon.cb SMOOTHING;

private static com.moon.cb[] a;

private static int b;

private static long c;

private static long[] d;

private static java.lang.Integer[] e;

private static java.util.Map f;

private cb(java.lang.String p0, int p1) {
super(p0, p1);
}


private static void initialize() {
c = ((long)(((moom._a)(moom._c.a(((long)(6061990148710925981L)), ((long)(-3191372450713799831L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(179634751463461L)))));
    long local20_life6 = (com.moon.cb.c ^ 97595533212114L);
    if ((com.moon.cb.c() == 0)) {
        com.moon.cb.b(((int)(100)));
    }
    javax.crypto.Cipher local12_life10;
    javax.crypto.Cipher __sourceSpill51_12 = (local12_life10 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill51_13 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill51_14 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill51_15 = new byte[8];
    (__sourceSpill51_15)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local13_life16 = 1;
    while ((local13_life16 < 8)) {
        (__sourceSpill51_15)[local13_life16] = ((byte) ((int) ((local20_life6 << (local13_life16 * 8)) >>> 56)));
        local13_life16 += 1;
    }
    byte[] __sourcePreallocation51_17 = __sourceSpill51_15;
    ((javax.crypto.Cipher)(__sourceSpill51_12)).init(((int)(__sourceSpill51_13)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill51_14)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation51_17)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local11_life20 = new java.lang.String[22];
    int local17_life21 = 0;
    java.lang.String local16_life22;
    int local18_life24 = ((java.lang.String)((local16_life22 = "2Ô]\0044OJµÝ$N\007Ò\b\005!S0Ðã¡M\020läRî\022ì±)®ÁTB\003z\020Ô{[(ÃY\020ªA;æ!óðv\020hÜéë\013oÔ¸-ÜNoÑ\020ìi­â\033TÀUÆîe\025$\032'\004\020lrQ¡x3ÈªV¹ÛDà9*\b&ÚÁ\005Ç=`\020aÚÛ\016_xË,ûÎwë\020²{én^=L~?¼:aSØ\030l÷?6Ü6«öbÜ\005Bæ·WH]5¶W cø·k/¼X\n!QÑæ?]ãúów'öä_èÛ?*\rÛ\020aÚÛ\016_x\"=`ÖÓvd\020\"0°úúÈ¸\003\\\f\036;-gK\030Ì\000HUl)JÄÁ#c¶fß\024H/_´Â\030Ì\000HUl)JÄÁ#c¶fß\001>\026\006\tP\bÔ,\032\006Õ\005\034\020bÞq9ì\000©Î\001¤§ÆtûpW\020%o\031ÏX¿\"î\\8Èð\020÷ëà\024\005ÖZUÛþíö®\b"))).length();
    int local15_life25 = 16;
    int local14_life26 = -1;
    while (true) {
        local14_life26 += 1;
        byte[] __sourceSpill51_29 = ((java.lang.String)(((java.lang.String)(local16_life22)).substring(((int)(local14_life26)), ((int)((local14_life26 + local15_life25)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill51_30 = local12_life10;
        byte[] local19_life32 = ((javax.crypto.Cipher)(__sourceSpill51_30)).doFinal(((byte[])(__sourceSpill51_29)));
        java.lang.String __sourceSpill51_35 = ((java.lang.String)(com.moon.cb.a(((byte[])(local19_life32))))).intern();
        java.lang.String[] __sourceSpill51_36 = local11_life20;
        int __sourceSpill51_37 = local17_life21;
        local17_life21 += 1;
        (__sourceSpill51_36)[__sourceSpill51_37] = __sourceSpill51_35;
        if (!(((local14_life26 = (local14_life26 + local15_life25)) < local18_life24))) { break; }
        local15_life25 = ((java.lang.String)(local16_life22)).charAt(((int)(local14_life26)));
    }
    local18_life24 = ((java.lang.String)((local16_life22 = "IÏ\021!ç}qC¤ørÜ\004îÏ\bþtê\004Û»a¥"))).length();
    local15_life25 = 16;
    local14_life26 = -1;
    while (true) {
        local14_life26 += 1;
        byte[] __sourceSpill51_42 = ((java.lang.String)(((java.lang.String)(local16_life22)).substring(((int)(local14_life26)), ((int)((local14_life26 + local15_life25)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill51_43 = local12_life10;
        byte[] local19_life45 = ((javax.crypto.Cipher)(__sourceSpill51_43)).doFinal(((byte[])(__sourceSpill51_42)));
        java.lang.String __sourceSpill51_48 = ((java.lang.String)(com.moon.cb.a(((byte[])(local19_life45))))).intern();
        java.lang.String[] __sourceSpill51_49 = local11_life20;
        int __sourceSpill51_50 = local17_life21;
        local17_life21 += 1;
        (__sourceSpill51_49)[__sourceSpill51_50] = __sourceSpill51_48;
        if (!(((local14_life26 = (local14_life26 + local15_life25)) < local18_life24))) { break; }
        local15_life25 = ((java.lang.String)(local16_life22)).charAt(((int)(local14_life26)));
    }
    f = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life54;
    javax.crypto.Cipher __sourceSpill51_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill51_57 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill51_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill51_59 = new byte[8];
    (__sourceSpill51_59)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local1_life60 = 1;
    while ((local1_life60 < 8)) {
        (__sourceSpill51_59)[local1_life60] = ((byte) ((int) ((local20_life6 << (local1_life60 * 8)) >>> 56)));
        local1_life60 += 1;
    }
    byte[] __sourcePreallocation51_61 = __sourceSpill51_59;
    ((javax.crypto.Cipher)(__sourceSpill51_56)).init(((int)(__sourceSpill51_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill51_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation51_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life64 = new long[33];
    int local3_life65 = 0;
    java.lang.String local4_life66;
    int local5_life68 = ((java.lang.String)((local4_life66 = "fFØW6Bv,ä\002Þgy\r3\"WùÜBè¶v¬_óV 55}j \033DÜú]Ä¬=BôºÛ&}fÛ\002=RX?¹æ*\004ühÑìÀ\024\nc#ÿ)ëSZõ\033\004ÂÑ\017\tæ\021Ñòå£_)séÿN\fèî? \032HÛÌö\r\fk¶Ã¥ëÃùtfÎ\032Ødéåõ+í­1rX÷í4}:\"ªþiõ\036d\\¦\006@GIBÕõ«\nïka.R¼y\021>´\020¢Ûñ£\036¥4Hl\007#fV\036¹«b ¯@^ÁðÓu7(ØþÅåî\036Ùdúø[\013\006ÈX\002¼¯\033ovYlÅ·¬¯\026\025"))).length();
    int local2_life69 = 0;
    do {
        java.lang.String __sourceSpill51_70 = local4_life66;
        int __sourceSpill51_71 = local2_life69;
        local2_life69 += 8;
        byte[] local7_life74 = ((java.lang.String)(((java.lang.String)(__sourceSpill51_70)).substring(((int)(__sourceSpill51_71)), ((int)(local2_life69))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill51_75 = local6_life64;
        int __sourceSpill51_76 = local3_life65;
        local3_life65 += 1;
        long local8_life77 = (((((((((((long) (local7_life74)[0]) & 255L) << 56) | ((((long) (local7_life74)[1]) & 255L) << 48)) | ((((long) (local7_life74)[2]) & 255L) << 40)) | ((((long) (local7_life74)[3]) & 255L) << 32)) | ((((long) (local7_life74)[4]) & 255L) << 24)) | ((((long) (local7_life74)[5]) & 255L) << 16)) | ((((long) (local7_life74)[6]) & 255L) << 8)) | (((long) (local7_life74)[7]) & 255L));
        byte[] __sourceSpill51_78 = new byte[8];
        (__sourceSpill51_78)[0] = ((byte) ((int) (local8_life77 >>> 56)));
        (__sourceSpill51_78)[1] = ((byte) ((int) (local8_life77 >>> 48)));
        (__sourceSpill51_78)[2] = ((byte) ((int) (local8_life77 >>> 40)));
        (__sourceSpill51_78)[3] = ((byte) ((int) (local8_life77 >>> 32)));
        (__sourceSpill51_78)[4] = ((byte) ((int) (local8_life77 >>> 24)));
        (__sourceSpill51_78)[5] = ((byte) ((int) (local8_life77 >>> 16)));
        (__sourceSpill51_78)[6] = ((byte) ((int) (local8_life77 >>> 8)));
        (__sourceSpill51_78)[7] = ((byte) ((int) local8_life77));
        javax.crypto.Cipher __sourceSpill51_79 = local0_life54;
        byte[] local10_life81 = ((javax.crypto.Cipher)(__sourceSpill51_79)).doFinal(((byte[])(__sourceSpill51_78)));
        (__sourceSpill51_75)[__sourceSpill51_76] = (((((((((((long) (local10_life81)[0]) & 255L) << 56) | ((((long) (local10_life81)[1]) & 255L) << 48)) | ((((long) (local10_life81)[2]) & 255L) << 40)) | ((((long) (local10_life81)[3]) & 255L) << 32)) | ((((long) (local10_life81)[4]) & 255L) << 24)) | ((((long) (local10_life81)[5]) & 255L) << 16)) | ((((long) (local10_life81)[6]) & 255L) << 8)) | (((long) (local10_life81)[7]) & 255L));
    } while ((!(local2_life69 >= local5_life68)));
    local5_life68 = ((java.lang.String)((local4_life66 = "ÔÄåBpAñ°\030\000f9Úß\n"))).length();
    local2_life69 = 0;
    do {
        java.lang.String __sourceSpill51_83 = local4_life66;
        int __sourceSpill51_84 = local2_life69;
        local2_life69 += 8;
        byte[] local7_life87 = ((java.lang.String)(((java.lang.String)(__sourceSpill51_83)).substring(((int)(__sourceSpill51_84)), ((int)(local2_life69))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill51_88 = local6_life64;
        int __sourceSpill51_89 = local3_life65;
        local3_life65 += 1;
        long local8_life90 = (((((((((((long) (local7_life87)[0]) & 255L) << 56) | ((((long) (local7_life87)[1]) & 255L) << 48)) | ((((long) (local7_life87)[2]) & 255L) << 40)) | ((((long) (local7_life87)[3]) & 255L) << 32)) | ((((long) (local7_life87)[4]) & 255L) << 24)) | ((((long) (local7_life87)[5]) & 255L) << 16)) | ((((long) (local7_life87)[6]) & 255L) << 8)) | (((long) (local7_life87)[7]) & 255L));
        byte[] __sourceSpill51_91 = new byte[8];
        (__sourceSpill51_91)[0] = ((byte) ((int) (local8_life90 >>> 56)));
        (__sourceSpill51_91)[1] = ((byte) ((int) (local8_life90 >>> 48)));
        (__sourceSpill51_91)[2] = ((byte) ((int) (local8_life90 >>> 40)));
        (__sourceSpill51_91)[3] = ((byte) ((int) (local8_life90 >>> 32)));
        (__sourceSpill51_91)[4] = ((byte) ((int) (local8_life90 >>> 24)));
        (__sourceSpill51_91)[5] = ((byte) ((int) (local8_life90 >>> 16)));
        (__sourceSpill51_91)[6] = ((byte) ((int) (local8_life90 >>> 8)));
        (__sourceSpill51_91)[7] = ((byte) ((int) local8_life90));
        javax.crypto.Cipher __sourceSpill51_92 = local0_life54;
        byte[] local10_life94 = ((javax.crypto.Cipher)(__sourceSpill51_92)).doFinal(((byte[])(__sourceSpill51_91)));
        (__sourceSpill51_88)[__sourceSpill51_89] = (((((((((((long) (local10_life94)[0]) & 255L) << 56) | ((((long) (local10_life94)[1]) & 255L) << 48)) | ((((long) (local10_life94)[2]) & 255L) << 40)) | ((((long) (local10_life94)[3]) & 255L) << 32)) | ((((long) (local10_life94)[4]) & 255L) << 24)) | ((((long) (local10_life94)[5]) & 255L) << 16)) | ((((long) (local10_life94)[6]) & 255L) << 8)) | (((long) (local10_life94)[7]) & 255L));
    } while ((!(local2_life69 >= local5_life68)));
    d = ((long[])(local6_life64));
    e = ((java.lang.Integer[])(new java.lang.Integer[33]));
    RECTANGLE = ((com.moon.cb)(new com.moon.cb((local11_life20)[17], 0)));
    TRIANGLE = ((com.moon.cb)(new com.moon.cb((local11_life20)[3], 1)));
    ROUNDED_RECTANGLE = ((com.moon.cb)(new com.moon.cb((local11_life20)[10], 2)));
    OUTLINE_ROUNDED_RECTANGLE = ((com.moon.cb)(new com.moon.cb((local11_life20)[11], 3)));
    TEXTURE = ((com.moon.cb)(new com.moon.cb((local11_life20)[21], 4)));
    TEXTURE_COL = ((com.moon.cb)(new com.moon.cb((local11_life20)[12], 5)));
    TEXTURE_ROUND = ((com.moon.cb)(new com.moon.cb((local11_life20)[8], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite51_103(31386, (8413236092842663085L ^ local20_life6)))));
    GRADIENT = ((com.moon.cb)(new com.moon.cb((local11_life20)[9], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite51_105(5099, (3493627127120377299L ^ local20_life6)))));
    WORLD = ((com.moon.cb)(new com.moon.cb((local11_life20)[16], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite51_107(19284, (1745467584449768810L ^ local20_life6)))));
    KAWASE_UP = ((com.moon.cb)(new com.moon.cb((local11_life20)[18], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite51_109(20313, (1338513238749079919L ^ local20_life6)))));
    KAWASE_DOWN = ((com.moon.cb)(new com.moon.cb((local11_life20)[4], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite51_111(28609, (5706946682851477997L ^ local20_life6)))));
    KAWASE_FOG = ((com.moon.cb)(new com.moon.cb((local11_life20)[5], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite51_113(20370, (43199420039457208L ^ local20_life6)))));
    KAWASE_STENCIL = ((com.moon.cb)(new com.moon.cb((local11_life20)[6], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite51_115(29515, (3279078763613967742L ^ local20_life6)))));
    SHADOW_UP = ((com.moon.cb)(new com.moon.cb((local11_life20)[19], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite51_117(17471, (9169908583826579986L ^ local20_life6)))));
    SHADOW_DOWN = ((com.moon.cb)(new com.moon.cb((local11_life20)[13], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite51_119(24909, (2526594346637707115L ^ local20_life6)))));
    GLOW_UP = ((com.moon.cb)(new com.moon.cb((local11_life20)[7], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite51_121(30490, (6652954986195407165L ^ local20_life6)))));
    GLOW_DOWN = ((com.moon.cb)(new com.moon.cb((local11_life20)[20], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite51_123(53, (651573181299926529L ^ local20_life6)))));
    ENTITY_OUTLINE = ((com.moon.cb)(new com.moon.cb((local11_life20)[0], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite51_125(5227, (4591844621912715863L ^ local20_life6)))));
    JUMP_FLOOD_OUTLINE = ((com.moon.cb)(new com.moon.cb((local11_life20)[15], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite51_127(18037, (7310290885919236180L ^ local20_life6)))));
    JUMP_FLOOD_OUTLINE_BASE = ((com.moon.cb)(new com.moon.cb((local11_life20)[14], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite51_129(12454, (3960358168002270875L ^ local20_life6)))));
    MSDF = ((com.moon.cb)(new com.moon.cb((local11_life20)[1], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite51_131(15949, (231082078323284095L ^ local20_life6)))));
    SMOOTHING = ((com.moon.cb)(new com.moon.cb((local11_life20)[2], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite51_133(15709, (6832895502547262328L ^ local20_life6)))));
    a = ((com.moon.cb[])(com.moon.cb.a()));
}


public static com.moon.cb[] values() {
return ((com.moon.cb[])(((com.moon.cb[])(com.moon.cb.a)).clone()));
}


public static com.moon.cb valueOf(java.lang.String p0) {
return ((com.moon.cb)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.cb.class)), ((java.lang.String)(p0)))));
}


public static void b(int p0) {
b = ((int)(p0));
    return;
}


public static int b() {
return com.moon.cb.b;
}


public static int c() {
int local0 = com.moon.cb.b();
    if ((local0 == 0)) {
        return 41;
    }
    return 0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 21002;
      if (e[var3] == null) {
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
         long var5 = d[var3];
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
         Object[] var9 = (Object[])f.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               f.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/cb", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         e[var3] = var15;
      }

      return e[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.cb.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral835_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/cb"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
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
        byte[] spill121_0 = p0;
        life4_9 += 1;
        life5_44 = (spill121_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill121_1 = p0;
        life4_9 += 1;
        life5_76 = (spill121_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill121_2 = p0;
        life4_9 += 1;
        life5_91 = (spill121_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static com.moon.cb[] a() {
long local0_life1 = (com.moon.cb.c ^ 66744312413421L);
    com.moon.cb[] __sourceSharedArray36_4 = new com.moon.cb[__sourceIntrinsic_f4c32f4257df_originalDynamicSite36_2(21163, (5972384740242846123L ^ local0_life1))];
    __sourceSharedArray36_4[0] = com.moon.cb.RECTANGLE;
    __sourceSharedArray36_4[1] = com.moon.cb.TRIANGLE;
    __sourceSharedArray36_4[2] = com.moon.cb.ROUNDED_RECTANGLE;
    __sourceSharedArray36_4[3] = com.moon.cb.OUTLINE_ROUNDED_RECTANGLE;
    __sourceSharedArray36_4[4] = com.moon.cb.TEXTURE;
    __sourceSharedArray36_4[5] = com.moon.cb.TEXTURE_COL;
    __sourceSharedArray36_4[__sourceIntrinsic_f4c32f4257df_originalDynamicSite36_10(13579, (2275690081044338191L ^ local0_life1))] = com.moon.cb.TEXTURE_ROUND;
    __sourceSharedArray36_4[__sourceIntrinsic_f4c32f4257df_originalDynamicSite36_12(18853, (6090521382650735284L ^ local0_life1))] = com.moon.cb.GRADIENT;
    __sourceSharedArray36_4[__sourceIntrinsic_f4c32f4257df_originalDynamicSite36_14(10079, (1963405102169195587L ^ local0_life1))] = com.moon.cb.WORLD;
    __sourceSharedArray36_4[__sourceIntrinsic_f4c32f4257df_originalDynamicSite36_16(30117, (2655591264436704939L ^ local0_life1))] = com.moon.cb.KAWASE_UP;
    __sourceSharedArray36_4[__sourceIntrinsic_f4c32f4257df_originalDynamicSite36_18(9038, (8909302661734072392L ^ local0_life1))] = com.moon.cb.KAWASE_DOWN;
    __sourceSharedArray36_4[__sourceIntrinsic_f4c32f4257df_originalDynamicSite36_20(30160, (1000697686632060612L ^ local0_life1))] = com.moon.cb.KAWASE_FOG;
    __sourceSharedArray36_4[__sourceIntrinsic_f4c32f4257df_originalDynamicSite36_22(31707, (2543233056113809613L ^ local0_life1))] = com.moon.cb.KAWASE_STENCIL;
    __sourceSharedArray36_4[__sourceIntrinsic_f4c32f4257df_originalDynamicSite36_24(32159, (5040037564866184L ^ local0_life1))] = com.moon.cb.SHADOW_UP;
    __sourceSharedArray36_4[__sourceIntrinsic_f4c32f4257df_originalDynamicSite36_26(32563, (5838531260933004348L ^ local0_life1))] = com.moon.cb.SHADOW_DOWN;
    __sourceSharedArray36_4[__sourceIntrinsic_f4c32f4257df_originalDynamicSite36_28(22123, (4893875835634808167L ^ local0_life1))] = com.moon.cb.GLOW_UP;
    __sourceSharedArray36_4[__sourceIntrinsic_f4c32f4257df_originalDynamicSite36_30(21058, (2485499127259525447L ^ local0_life1))] = com.moon.cb.GLOW_DOWN;
    __sourceSharedArray36_4[__sourceIntrinsic_f4c32f4257df_originalDynamicSite36_32(28740, (4761343118274909031L ^ local0_life1))] = com.moon.cb.ENTITY_OUTLINE;
    __sourceSharedArray36_4[__sourceIntrinsic_f4c32f4257df_originalDynamicSite36_34(2382, (4468493708515256915L ^ local0_life1))] = com.moon.cb.JUMP_FLOOD_OUTLINE;
    __sourceSharedArray36_4[__sourceIntrinsic_f4c32f4257df_originalDynamicSite36_36(8289, (8517264991922062193L ^ local0_life1))] = com.moon.cb.JUMP_FLOOD_OUTLINE_BASE;
    __sourceSharedArray36_4[__sourceIntrinsic_f4c32f4257df_originalDynamicSite36_38(32232, (1722709256025923315L ^ local0_life1))] = com.moon.cb.MSDF;
    __sourceSharedArray36_4[__sourceIntrinsic_f4c32f4257df_originalDynamicSite36_40(26160, (5062765964121556271L ^ local0_life1))] = com.moon.cb.SMOOTHING;
    return __sourceSharedArray36_4;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite51_103(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite51_105(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite51_107(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite51_109(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite51_111(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite51_113(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite51_115(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite51_117(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite51_119(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite51_121(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite51_123(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite51_125(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite51_127(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite51_129(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite51_131(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite51_133(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral835_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f4c32f4257df_originalDynamicSite36_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f4c32f4257df_originalDynamicSite36_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f4c32f4257df_originalDynamicSite36_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f4c32f4257df_originalDynamicSite36_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f4c32f4257df_originalDynamicSite36_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f4c32f4257df_originalDynamicSite36_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f4c32f4257df_originalDynamicSite36_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f4c32f4257df_originalDynamicSite36_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f4c32f4257df_originalDynamicSite36_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f4c32f4257df_originalDynamicSite36_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f4c32f4257df_originalDynamicSite36_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f4c32f4257df_originalDynamicSite36_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f4c32f4257df_originalDynamicSite36_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f4c32f4257df_originalDynamicSite36_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f4c32f4257df_originalDynamicSite36_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f4c32f4257df_originalDynamicSite36_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f4c32f4257df_originalDynamicSite36_40(int a0, long a1) throws E;
}
