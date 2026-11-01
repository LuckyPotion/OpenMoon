package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class b_ extends sourcebuild.EnumConstructor<com.moon.b_> {

public static com.moon.b_ BYTE;

public static com.moon.b_ UNSIGNED_BYTE;

public static com.moon.b_ SHORT;

public static com.moon.b_ UNSIGNED_SHORT;

public static com.moon.b_ INT;

public static com.moon.b_ UNSIGNED_INT;

public static com.moon.b_ FLOAT;

public static com.moon.b_ DOUBLE;

private int a;

private int b;

private static com.moon.b_[] c;

private static long d;

private static long[] e;

private static java.lang.Integer[] f;

private static java.util.Map g;

private b_(java.lang.String p0, int p1, int p2, int p3) {
super(p0, p1);
    this.a = p2;
    this.b = p3;
}


private static void initialize() {
d = ((long)(((moom._a)(moom._c.a(((long)(5282381710963682820L)), ((long)(-4212123257644651632L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(148712790362599L)))));
    long local20_life6 = (com.moon.b_.d ^ 118038188444924L);
    javax.crypto.Cipher local12_life8;
    javax.crypto.Cipher __sourceSpill23_10 = (local12_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill23_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill23_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill23_13 = new byte[8];
    (__sourceSpill23_13)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local13_life14 = 1;
    while ((local13_life14 < 8)) {
        (__sourceSpill23_13)[local13_life14] = ((byte) ((int) ((local20_life6 << (local13_life14 * 8)) >>> 56)));
        local13_life14 += 1;
    }
    byte[] __sourcePreallocation23_15 = __sourceSpill23_13;
    ((javax.crypto.Cipher)(__sourceSpill23_10)).init(((int)(__sourceSpill23_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill23_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation23_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local11_life18 = new java.lang.String[8];
    int local17_life19 = 0;
    java.lang.String local16_life20;
    int local18_life22 = ((java.lang.String)((local16_life20 = "ûv4&ªÇ\006\bBÏI¼\b\034\f8áÌíà\020ÅOÎ(Y±é0ãT^o»ë\bô\004k*\br~\023\020ÅOÎ(Y±­\007ª£V!SÝ"))).length();
    int local15_life23 = 8;
    int local14_life24 = -1;
    while (true) {
        local14_life24 += 1;
        byte[] __sourceSpill23_27 = ((java.lang.String)(((java.lang.String)(local16_life20)).substring(((int)(local14_life24)), ((int)((local14_life24 + local15_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill23_28 = local12_life8;
        byte[] local19_life30 = ((javax.crypto.Cipher)(__sourceSpill23_28)).doFinal(((byte[])(__sourceSpill23_27)));
        java.lang.String __sourceSpill23_33 = ((java.lang.String)(com.moon.b_.a(((byte[])(local19_life30))))).intern();
        java.lang.String[] __sourceSpill23_34 = local11_life18;
        int __sourceSpill23_35 = local17_life19;
        local17_life19 += 1;
        (__sourceSpill23_34)[__sourceSpill23_35] = __sourceSpill23_33;
        if (!(((local14_life24 = (local14_life24 + local15_life23)) < local18_life22))) { break; }
        local15_life23 = ((java.lang.String)(local16_life20)).charAt(((int)(local14_life24)));
    }
    local18_life22 = ((java.lang.String)((local16_life20 = "&»\004ThÎ\020ÅOÎ(Y±Í\036¸ú\025HÔé"))).length();
    local15_life23 = 8;
    local14_life24 = -1;
    while (true) {
        local14_life24 += 1;
        byte[] __sourceSpill23_40 = ((java.lang.String)(((java.lang.String)(local16_life20)).substring(((int)(local14_life24)), ((int)((local14_life24 + local15_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill23_41 = local12_life8;
        byte[] local19_life43 = ((javax.crypto.Cipher)(__sourceSpill23_41)).doFinal(((byte[])(__sourceSpill23_40)));
        java.lang.String __sourceSpill23_46 = ((java.lang.String)(com.moon.b_.a(((byte[])(local19_life43))))).intern();
        java.lang.String[] __sourceSpill23_47 = local11_life18;
        int __sourceSpill23_48 = local17_life19;
        local17_life19 += 1;
        (__sourceSpill23_47)[__sourceSpill23_48] = __sourceSpill23_46;
        if (!(((local14_life24 = (local14_life24 + local15_life23)) < local18_life22))) { break; }
        local15_life23 = ((java.lang.String)(local16_life20)).charAt(((int)(local14_life24)));
    }
    g = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life52;
    javax.crypto.Cipher __sourceSpill23_54 = (local0_life52 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill23_55 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill23_56 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill23_57 = new byte[8];
    (__sourceSpill23_57)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local1_life58 = 1;
    while ((local1_life58 < 8)) {
        (__sourceSpill23_57)[local1_life58] = ((byte) ((int) ((local20_life6 << (local1_life58 * 8)) >>> 56)));
        local1_life58 += 1;
    }
    byte[] __sourcePreallocation23_59 = __sourceSpill23_57;
    ((javax.crypto.Cipher)(__sourceSpill23_54)).init(((int)(__sourceSpill23_55)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill23_56)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation23_59)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life62 = new long[14];
    int local3_life63 = 0;
    java.lang.String local4_life64;
    int local5_life66 = ((java.lang.String)((local4_life64 = ":»{ãçM\030ðÆ¥û+;ZP¢´f²×ý\004ç0ß~ªx(Ô÷\002u\fOûÓÏnlèg\023À»Ò*Á7M9Â\n¹Sã:!¸÷4\026ßÙÄ\024¬\000M\t£ôËóÏ*qa\tUÏ\037Bî¶î"))).length();
    int local2_life67 = 0;
    do {
        java.lang.String __sourceSpill23_68 = local4_life64;
        int __sourceSpill23_69 = local2_life67;
        local2_life67 += 8;
        byte[] local7_life72 = ((java.lang.String)(((java.lang.String)(__sourceSpill23_68)).substring(((int)(__sourceSpill23_69)), ((int)(local2_life67))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill23_73 = local6_life62;
        int __sourceSpill23_74 = local3_life63;
        local3_life63 += 1;
        long local8_life75 = (((((((((((long) (local7_life72)[0]) & 255L) << 56) | ((((long) (local7_life72)[1]) & 255L) << 48)) | ((((long) (local7_life72)[2]) & 255L) << 40)) | ((((long) (local7_life72)[3]) & 255L) << 32)) | ((((long) (local7_life72)[4]) & 255L) << 24)) | ((((long) (local7_life72)[5]) & 255L) << 16)) | ((((long) (local7_life72)[6]) & 255L) << 8)) | (((long) (local7_life72)[7]) & 255L));
        byte[] __sourceSpill23_76 = new byte[8];
        (__sourceSpill23_76)[0] = ((byte) ((int) (local8_life75 >>> 56)));
        (__sourceSpill23_76)[1] = ((byte) ((int) (local8_life75 >>> 48)));
        (__sourceSpill23_76)[2] = ((byte) ((int) (local8_life75 >>> 40)));
        (__sourceSpill23_76)[3] = ((byte) ((int) (local8_life75 >>> 32)));
        (__sourceSpill23_76)[4] = ((byte) ((int) (local8_life75 >>> 24)));
        (__sourceSpill23_76)[5] = ((byte) ((int) (local8_life75 >>> 16)));
        (__sourceSpill23_76)[6] = ((byte) ((int) (local8_life75 >>> 8)));
        (__sourceSpill23_76)[7] = ((byte) ((int) local8_life75));
        javax.crypto.Cipher __sourceSpill23_77 = local0_life52;
        byte[] local10_life79 = ((javax.crypto.Cipher)(__sourceSpill23_77)).doFinal(((byte[])(__sourceSpill23_76)));
        (__sourceSpill23_73)[__sourceSpill23_74] = (((((((((((long) (local10_life79)[0]) & 255L) << 56) | ((((long) (local10_life79)[1]) & 255L) << 48)) | ((((long) (local10_life79)[2]) & 255L) << 40)) | ((((long) (local10_life79)[3]) & 255L) << 32)) | ((((long) (local10_life79)[4]) & 255L) << 24)) | ((((long) (local10_life79)[5]) & 255L) << 16)) | ((((long) (local10_life79)[6]) & 255L) << 8)) | (((long) (local10_life79)[7]) & 255L));
    } while ((!(local2_life67 >= local5_life66)));
    local5_life66 = ((java.lang.String)((local4_life64 = "ÏìtL\004þÒ\004¦,"))).length();
    local2_life67 = 0;
    do {
        java.lang.String __sourceSpill23_81 = local4_life64;
        int __sourceSpill23_82 = local2_life67;
        local2_life67 += 8;
        byte[] local7_life85 = ((java.lang.String)(((java.lang.String)(__sourceSpill23_81)).substring(((int)(__sourceSpill23_82)), ((int)(local2_life67))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill23_86 = local6_life62;
        int __sourceSpill23_87 = local3_life63;
        local3_life63 += 1;
        long local8_life88 = (((((((((((long) (local7_life85)[0]) & 255L) << 56) | ((((long) (local7_life85)[1]) & 255L) << 48)) | ((((long) (local7_life85)[2]) & 255L) << 40)) | ((((long) (local7_life85)[3]) & 255L) << 32)) | ((((long) (local7_life85)[4]) & 255L) << 24)) | ((((long) (local7_life85)[5]) & 255L) << 16)) | ((((long) (local7_life85)[6]) & 255L) << 8)) | (((long) (local7_life85)[7]) & 255L));
        byte[] __sourceSpill23_89 = new byte[8];
        (__sourceSpill23_89)[0] = ((byte) ((int) (local8_life88 >>> 56)));
        (__sourceSpill23_89)[1] = ((byte) ((int) (local8_life88 >>> 48)));
        (__sourceSpill23_89)[2] = ((byte) ((int) (local8_life88 >>> 40)));
        (__sourceSpill23_89)[3] = ((byte) ((int) (local8_life88 >>> 32)));
        (__sourceSpill23_89)[4] = ((byte) ((int) (local8_life88 >>> 24)));
        (__sourceSpill23_89)[5] = ((byte) ((int) (local8_life88 >>> 16)));
        (__sourceSpill23_89)[6] = ((byte) ((int) (local8_life88 >>> 8)));
        (__sourceSpill23_89)[7] = ((byte) ((int) local8_life88));
        javax.crypto.Cipher __sourceSpill23_90 = local0_life52;
        byte[] local10_life92 = ((javax.crypto.Cipher)(__sourceSpill23_90)).doFinal(((byte[])(__sourceSpill23_89)));
        (__sourceSpill23_86)[__sourceSpill23_87] = (((((((((((long) (local10_life92)[0]) & 255L) << 56) | ((((long) (local10_life92)[1]) & 255L) << 48)) | ((((long) (local10_life92)[2]) & 255L) << 40)) | ((((long) (local10_life92)[3]) & 255L) << 32)) | ((((long) (local10_life92)[4]) & 255L) << 24)) | ((((long) (local10_life92)[5]) & 255L) << 16)) | ((((long) (local10_life92)[6]) & 255L) << 8)) | (((long) (local10_life92)[7]) & 255L));
    } while ((!(local2_life67 >= local5_life66)));
    e = ((long[])(local6_life62));
    f = ((java.lang.Integer[])(new java.lang.Integer[14]));
    BYTE = ((com.moon.b_)(new com.moon.b_((local11_life18)[4], 0, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite23_95(25070, (6928263630389059064L ^ local20_life6)), 1)));
    UNSIGNED_BYTE = ((com.moon.b_)(new com.moon.b_((local11_life18)[5], 1, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite23_97(17183, (7749084586128883466L ^ local20_life6)), 1)));
    SHORT = ((com.moon.b_)(new com.moon.b_((local11_life18)[2], 2, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite23_99(12738, (2948054991489453525L ^ local20_life6)), 2)));
    UNSIGNED_SHORT = ((com.moon.b_)(new com.moon.b_((local11_life18)[3], 3, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite23_101(22253, (6977143856171100916L ^ local20_life6)), 2)));
    INT = ((com.moon.b_)(new com.moon.b_((local11_life18)[0], 4, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite23_103(24534, (4656676626745041865L ^ local20_life6)), 4)));
    UNSIGNED_INT = ((com.moon.b_)(new com.moon.b_((local11_life18)[7], 5, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite23_105(14538, (2712590859671291098L ^ local20_life6)), 4)));
    FLOAT = ((com.moon.b_)(new com.moon.b_((local11_life18)[6], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite23_107(27820, (4154580818516807858L ^ local20_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite23_108(25853, (5487489735280859369L ^ local20_life6)), 4)));
    DOUBLE = ((com.moon.b_)(new com.moon.b_((local11_life18)[1], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite23_110(4030, (2169717871406773167L ^ local20_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite23_111(19790, (7310866097716015442L ^ local20_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite23_112(5847, (1398818211077941967L ^ local20_life6)))));
    c = ((com.moon.b_[])(com.moon.b_.a__Arrayb_()));
}


public static com.moon.b_[] values() {
return ((com.moon.b_[])(((com.moon.b_[])(com.moon.b_.c)).clone()));
}


public static com.moon.b_ valueOf(java.lang.String p0) {
return ((com.moon.b_)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.b_.class)), ((java.lang.String)(p0)))));
}


public int b() {
return this.b;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 23230;
      if (f[var3] == null) {
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
         long var5 = e[var3];
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
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/b_", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.b_.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral693_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/b_"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
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
        byte[] spill68_0 = p0;
        life4_9 += 1;
        life5_44 = (spill68_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill68_1 = p0;
        life4_9 += 1;
        life5_76 = (spill68_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill68_2 = p0;
        life4_9 += 1;
        life5_91 = (spill68_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static com.moon.b_[] a__Arrayb_() {
long local0_life1 = (com.moon.b_.d ^ 103399510933157L);
    com.moon.b_[] __sourceSharedArray17_4 = new com.moon.b_[__sourceIntrinsic_c69465dc0ae4_originalDynamicSite17_2(29414, (563833999704702116L ^ local0_life1))];
    __sourceSharedArray17_4[0] = com.moon.b_.BYTE;
    __sourceSharedArray17_4[1] = com.moon.b_.UNSIGNED_BYTE;
    __sourceSharedArray17_4[2] = com.moon.b_.SHORT;
    __sourceSharedArray17_4[3] = com.moon.b_.UNSIGNED_SHORT;
    __sourceSharedArray17_4[4] = com.moon.b_.INT;
    __sourceSharedArray17_4[5] = com.moon.b_.UNSIGNED_INT;
    __sourceSharedArray17_4[__sourceIntrinsic_c69465dc0ae4_originalDynamicSite17_10(15084, (2074652627282949288L ^ local0_life1))] = com.moon.b_.FLOAT;
    __sourceSharedArray17_4[__sourceIntrinsic_c69465dc0ae4_originalDynamicSite17_12(10590, (6154340448587769629L ^ local0_life1))] = com.moon.b_.DOUBLE;
    return __sourceSharedArray17_4;
}


public int a() {
return this.a;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite23_95(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite23_97(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite23_99(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite23_101(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite23_103(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite23_105(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite23_107(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite23_108(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite23_110(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite23_111(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite23_112(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral693_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c69465dc0ae4_originalDynamicSite17_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c69465dc0ae4_originalDynamicSite17_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c69465dc0ae4_originalDynamicSite17_12(int a0, long a1) throws E;
}
