package com.moon;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import javax.crypto.*;
public class cf extends sourcebuild.EnumConstructor<com.moon.cf> {

public static com.moon.cf BOOLEAN;

public static com.moon.cf COLOR;

public static com.moon.cf ENUM;

public static com.moon.cf FLOAT;

public static com.moon.cf INTEGER;

public static com.moon.cf GROUP;

public static com.moon.cf MULTIPLE_CHOICE;

public static com.moon.cf MODE;

public static com.moon.cf STRING;

public static com.moon.cf BUTTON;

public static com.moon.cf MODULAR_LIST;

public static com.moon.cf BEZIER;

private static com.moon.cf[] a;

private static long b;

private static long[] c;

private static java.lang.Integer[] d;

private static java.util.Map e;

private cf(java.lang.String p0, int p1) {
super(p0, p1);
}


private static void initialize() {
b = ((long)(((moom._a)(moom._c.a(((long)(79191104106093280L)), ((long)(-2391022283017425096L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(27396197058829L)))));
    long local20_life6 = (com.moon.cf.b ^ 7248354508364L);
    javax.crypto.Cipher local12_life8;
    javax.crypto.Cipher __sourceSpill55_10 = (local12_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill55_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill55_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill55_13 = new byte[8];
    (__sourceSpill55_13)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local13_life14 = 1;
    while ((local13_life14 < 8)) {
        (__sourceSpill55_13)[local13_life14] = ((byte) ((int) ((local20_life6 << (local13_life14 * 8)) >>> 56)));
        local13_life14 += 1;
    }
    byte[] __sourcePreallocation55_15 = __sourceSpill55_13;
    ((javax.crypto.Cipher)(__sourceSpill55_10)).init(((int)(__sourceSpill55_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill55_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation55_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local11_life18 = new java.lang.String[12];
    int local17_life19 = 0;
    java.lang.String local16_life20;
    int local18_life22 = ((java.lang.String)((local16_life20 = "\023ñw\177¹Ù\023\020Lo\031Éé¨Þ¬ú2¦²V0z\bÁ\037µÄ{³\t\bõ\007pù¡\025Ø²\bhd°\031te\b\024w=à£cs\bvÃKÍÑú\b\"þÌÕ©ý¦·\020\000ÿWÁ4z¹ÝêVÙa\bºT\034ëø\003"))).length();
    int local15_life23 = 8;
    int local14_life24 = -1;
    while (true) {
        local14_life24 += 1;
        byte[] __sourceSpill55_27 = ((java.lang.String)(((java.lang.String)(local16_life20)).substring(((int)(local14_life24)), ((int)((local14_life24 + local15_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill55_28 = local12_life8;
        byte[] local19_life30 = ((javax.crypto.Cipher)(__sourceSpill55_28)).doFinal(((byte[])(__sourceSpill55_27)));
        java.lang.String __sourceSpill55_33 = ((java.lang.String)(com.moon.cf.a(((byte[])(local19_life30))))).intern();
        java.lang.String[] __sourceSpill55_34 = local11_life18;
        int __sourceSpill55_35 = local17_life19;
        local17_life19 += 1;
        (__sourceSpill55_34)[__sourceSpill55_35] = __sourceSpill55_33;
        if (!(((local14_life24 = (local14_life24 + local15_life23)) < local18_life22))) { break; }
        local15_life23 = ((java.lang.String)(local16_life20)).charAt(((int)(local14_life24)));
    }
    local18_life22 = ((java.lang.String)((local16_life20 = "¬æðÔ>Þ:\bÕÚ\034CdM."))).length();
    local15_life23 = 8;
    local14_life24 = -1;
    while (true) {
        local14_life24 += 1;
        byte[] __sourceSpill55_40 = ((java.lang.String)(((java.lang.String)(local16_life20)).substring(((int)(local14_life24)), ((int)((local14_life24 + local15_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill55_41 = local12_life8;
        byte[] local19_life43 = ((javax.crypto.Cipher)(__sourceSpill55_41)).doFinal(((byte[])(__sourceSpill55_40)));
        java.lang.String __sourceSpill55_46 = ((java.lang.String)(com.moon.cf.a(((byte[])(local19_life43))))).intern();
        java.lang.String[] __sourceSpill55_47 = local11_life18;
        int __sourceSpill55_48 = local17_life19;
        local17_life19 += 1;
        (__sourceSpill55_47)[__sourceSpill55_48] = __sourceSpill55_46;
        if (!(((local14_life24 = (local14_life24 + local15_life23)) < local18_life22))) { break; }
        local15_life23 = ((java.lang.String)(local16_life20)).charAt(((int)(local14_life24)));
    }
    e = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life52;
    javax.crypto.Cipher __sourceSpill55_54 = (local0_life52 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill55_55 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill55_56 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill55_57 = new byte[8];
    (__sourceSpill55_57)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local1_life58 = 1;
    while ((local1_life58 < 8)) {
        (__sourceSpill55_57)[local1_life58] = ((byte) ((int) ((local20_life6 << (local1_life58 * 8)) >>> 56)));
        local1_life58 += 1;
    }
    byte[] __sourcePreallocation55_59 = __sourceSpill55_57;
    ((javax.crypto.Cipher)(__sourceSpill55_54)).init(((int)(__sourceSpill55_55)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill55_56)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation55_59)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life62 = new long[13];
    int local3_life63 = 0;
    java.lang.String local4_life64;
    int local5_life66 = ((java.lang.String)((local4_life64 = "ÁL1rV*ûÀL8Iò\"¬N[½Õ2i\004ó\023+\002WPä+\bë%iuTÍ~+z!G\bâJS8°:¶ß ÕtÕ\n?\013ÔäwYJïØæòTª  ä\ffNÞ¢ïp"))).length();
    int local2_life67 = 0;
    do {
        java.lang.String __sourceSpill55_68 = local4_life64;
        int __sourceSpill55_69 = local2_life67;
        local2_life67 += 8;
        byte[] local7_life72 = ((java.lang.String)(((java.lang.String)(__sourceSpill55_68)).substring(((int)(__sourceSpill55_69)), ((int)(local2_life67))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill55_73 = local6_life62;
        int __sourceSpill55_74 = local3_life63;
        local3_life63 += 1;
        long local8_life75 = (((((((((((long) (local7_life72)[0]) & 255L) << 56) | ((((long) (local7_life72)[1]) & 255L) << 48)) | ((((long) (local7_life72)[2]) & 255L) << 40)) | ((((long) (local7_life72)[3]) & 255L) << 32)) | ((((long) (local7_life72)[4]) & 255L) << 24)) | ((((long) (local7_life72)[5]) & 255L) << 16)) | ((((long) (local7_life72)[6]) & 255L) << 8)) | (((long) (local7_life72)[7]) & 255L));
        byte[] __sourceSpill55_76 = new byte[8];
        (__sourceSpill55_76)[0] = ((byte) ((int) (local8_life75 >>> 56)));
        (__sourceSpill55_76)[1] = ((byte) ((int) (local8_life75 >>> 48)));
        (__sourceSpill55_76)[2] = ((byte) ((int) (local8_life75 >>> 40)));
        (__sourceSpill55_76)[3] = ((byte) ((int) (local8_life75 >>> 32)));
        (__sourceSpill55_76)[4] = ((byte) ((int) (local8_life75 >>> 24)));
        (__sourceSpill55_76)[5] = ((byte) ((int) (local8_life75 >>> 16)));
        (__sourceSpill55_76)[6] = ((byte) ((int) (local8_life75 >>> 8)));
        (__sourceSpill55_76)[7] = ((byte) ((int) local8_life75));
        javax.crypto.Cipher __sourceSpill55_77 = local0_life52;
        byte[] local10_life79 = ((javax.crypto.Cipher)(__sourceSpill55_77)).doFinal(((byte[])(__sourceSpill55_76)));
        (__sourceSpill55_73)[__sourceSpill55_74] = (((((((((((long) (local10_life79)[0]) & 255L) << 56) | ((((long) (local10_life79)[1]) & 255L) << 48)) | ((((long) (local10_life79)[2]) & 255L) << 40)) | ((((long) (local10_life79)[3]) & 255L) << 32)) | ((((long) (local10_life79)[4]) & 255L) << 24)) | ((((long) (local10_life79)[5]) & 255L) << 16)) | ((((long) (local10_life79)[6]) & 255L) << 8)) | (((long) (local10_life79)[7]) & 255L));
    } while ((!(local2_life67 >= local5_life66)));
    local5_life66 = ((java.lang.String)((local4_life64 = "?6Ù©sÂ$CÔ¡p\025Ýû¤Ï"))).length();
    local2_life67 = 0;
    do {
        java.lang.String __sourceSpill55_81 = local4_life64;
        int __sourceSpill55_82 = local2_life67;
        local2_life67 += 8;
        byte[] local7_life85 = ((java.lang.String)(((java.lang.String)(__sourceSpill55_81)).substring(((int)(__sourceSpill55_82)), ((int)(local2_life67))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill55_86 = local6_life62;
        int __sourceSpill55_87 = local3_life63;
        local3_life63 += 1;
        long local8_life88 = (((((((((((long) (local7_life85)[0]) & 255L) << 56) | ((((long) (local7_life85)[1]) & 255L) << 48)) | ((((long) (local7_life85)[2]) & 255L) << 40)) | ((((long) (local7_life85)[3]) & 255L) << 32)) | ((((long) (local7_life85)[4]) & 255L) << 24)) | ((((long) (local7_life85)[5]) & 255L) << 16)) | ((((long) (local7_life85)[6]) & 255L) << 8)) | (((long) (local7_life85)[7]) & 255L));
        byte[] __sourceSpill55_89 = new byte[8];
        (__sourceSpill55_89)[0] = ((byte) ((int) (local8_life88 >>> 56)));
        (__sourceSpill55_89)[1] = ((byte) ((int) (local8_life88 >>> 48)));
        (__sourceSpill55_89)[2] = ((byte) ((int) (local8_life88 >>> 40)));
        (__sourceSpill55_89)[3] = ((byte) ((int) (local8_life88 >>> 32)));
        (__sourceSpill55_89)[4] = ((byte) ((int) (local8_life88 >>> 24)));
        (__sourceSpill55_89)[5] = ((byte) ((int) (local8_life88 >>> 16)));
        (__sourceSpill55_89)[6] = ((byte) ((int) (local8_life88 >>> 8)));
        (__sourceSpill55_89)[7] = ((byte) ((int) local8_life88));
        javax.crypto.Cipher __sourceSpill55_90 = local0_life52;
        byte[] local10_life92 = ((javax.crypto.Cipher)(__sourceSpill55_90)).doFinal(((byte[])(__sourceSpill55_89)));
        (__sourceSpill55_86)[__sourceSpill55_87] = (((((((((((long) (local10_life92)[0]) & 255L) << 56) | ((((long) (local10_life92)[1]) & 255L) << 48)) | ((((long) (local10_life92)[2]) & 255L) << 40)) | ((((long) (local10_life92)[3]) & 255L) << 32)) | ((((long) (local10_life92)[4]) & 255L) << 24)) | ((((long) (local10_life92)[5]) & 255L) << 16)) | ((((long) (local10_life92)[6]) & 255L) << 8)) | (((long) (local10_life92)[7]) & 255L));
    } while ((!(local2_life67 >= local5_life66)));
    c = ((long[])(local6_life62));
    d = ((java.lang.Integer[])(new java.lang.Integer[13]));
    BOOLEAN = ((com.moon.cf)(new com.moon.cf((local11_life18)[10], 0)));
    COLOR = ((com.moon.cf)(new com.moon.cf((local11_life18)[11], 1)));
    ENUM = ((com.moon.cf)(new com.moon.cf((local11_life18)[6], 2)));
    FLOAT = ((com.moon.cf)(new com.moon.cf((local11_life18)[9], 3)));
    INTEGER = ((com.moon.cf)(new com.moon.cf((local11_life18)[0], 4)));
    GROUP = ((com.moon.cf)(new com.moon.cf((local11_life18)[4], 5)));
    MULTIPLE_CHOICE = ((com.moon.cf)(new com.moon.cf((local11_life18)[8], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite55_101(26791, (789226947500919383L ^ local20_life6)))));
    MODE = ((com.moon.cf)(new com.moon.cf((local11_life18)[7], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite55_103(12203, (5083574251102506323L ^ local20_life6)))));
    STRING = ((com.moon.cf)(new com.moon.cf((local11_life18)[2], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite55_105(10122, (5883078443581080945L ^ local20_life6)))));
    BUTTON = ((com.moon.cf)(new com.moon.cf((local11_life18)[3], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite55_107(30602, (6404197820608042358L ^ local20_life6)))));
    MODULAR_LIST = ((com.moon.cf)(new com.moon.cf((local11_life18)[1], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite55_109(31943, (6977944036266565172L ^ local20_life6)))));
    BEZIER = ((com.moon.cf)(new com.moon.cf((local11_life18)[5], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite55_111(16829, (4053506517223596866L ^ local20_life6)))));
    a = ((com.moon.cf[])(com.moon.cf.a()));
}


public static com.moon.cf[] values() {
return ((com.moon.cf[])(((com.moon.cf[])(com.moon.cf.a)).clone()));
}


public static com.moon.cf valueOf(java.lang.String p0) {
return ((com.moon.cf)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.cf.class)), ((java.lang.String)(p0)))));
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 18470;
      if (d[var3] == null) {
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
         long var5 = c[var3];
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
         Object[] var9 = (Object[])e.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               e.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/cf", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         d[var3] = var15;
      }

      return d[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.cf.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral841_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/cf"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
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
        byte[] spill125_0 = p0;
        life4_9 += 1;
        life5_44 = (spill125_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill125_1 = p0;
        life4_9 += 1;
        life5_76 = (spill125_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill125_2 = p0;
        life4_9 += 1;
        life5_91 = (spill125_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static com.moon.cf[] a() {
long local0_life1 = (com.moon.cf.b ^ 25973547769393L);
    com.moon.cf[] __sourceSharedArray38_4 = new com.moon.cf[__sourceIntrinsic_cea6f739f7ec_originalDynamicSite38_2(27193, (4539482935863945393L ^ local0_life1))];
    __sourceSharedArray38_4[0] = com.moon.cf.BOOLEAN;
    __sourceSharedArray38_4[1] = com.moon.cf.COLOR;
    __sourceSharedArray38_4[2] = com.moon.cf.ENUM;
    __sourceSharedArray38_4[3] = com.moon.cf.FLOAT;
    __sourceSharedArray38_4[4] = com.moon.cf.INTEGER;
    __sourceSharedArray38_4[5] = com.moon.cf.GROUP;
    __sourceSharedArray38_4[__sourceIntrinsic_cea6f739f7ec_originalDynamicSite38_10(30895, (3672494171802024495L ^ local0_life1))] = com.moon.cf.MULTIPLE_CHOICE;
    __sourceSharedArray38_4[__sourceIntrinsic_cea6f739f7ec_originalDynamicSite38_12(5539, (3790398418703308580L ^ local0_life1))] = com.moon.cf.MODE;
    __sourceSharedArray38_4[__sourceIntrinsic_cea6f739f7ec_originalDynamicSite38_14(9164, (8739568726985105731L ^ local0_life1))] = com.moon.cf.STRING;
    __sourceSharedArray38_4[__sourceIntrinsic_cea6f739f7ec_originalDynamicSite38_16(14940, (961735885792147679L ^ local0_life1))] = com.moon.cf.BUTTON;
    __sourceSharedArray38_4[__sourceIntrinsic_cea6f739f7ec_originalDynamicSite38_18(8531, (2412173922728010711L ^ local0_life1))] = com.moon.cf.MODULAR_LIST;
    __sourceSharedArray38_4[__sourceIntrinsic_cea6f739f7ec_originalDynamicSite38_20(229, (1910382358149743209L ^ local0_life1))] = com.moon.cf.BEZIER;
    return __sourceSharedArray38_4;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite55_101(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite55_103(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite55_105(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite55_107(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite55_109(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite55_111(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral841_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cea6f739f7ec_originalDynamicSite38_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cea6f739f7ec_originalDynamicSite38_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cea6f739f7ec_originalDynamicSite38_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cea6f739f7ec_originalDynamicSite38_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cea6f739f7ec_originalDynamicSite38_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cea6f739f7ec_originalDynamicSite38_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cea6f739f7ec_originalDynamicSite38_20(int a0, long a1) throws E;
}
