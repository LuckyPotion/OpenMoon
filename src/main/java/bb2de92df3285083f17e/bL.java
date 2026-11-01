package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
class bL extends sourcebuild.EnumConstructor<moom.bL> {

public static moom.bL UP;

public static moom.bL UP_RIGHT;

public static moom.bL RIGHT;

public static moom.bL DOWN_RIGHT;

public static moom.bL DOWN;

public static moom.bL DOWN_LEFT;

public static moom.bL LEFT;

public static moom.bL UP_LEFT;

public static moom.bL[] VALUES;

private static moom.bL[] a;

private static long b;

private static long[] c;

private static java.lang.Integer[] d;

private static java.util.Map e;

private bL(java.lang.String p0, int p1) {
super(p0, p1);
}


private static void initialize() {
b = ((long)(((moom._a)(moom._c.a(((long)(1337097026285453125L)), ((long)(-3880901215913912979L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(97028580709439L)))));
    long local20_life6 = (moom.bL.b ^ 114060745768562L);
    javax.crypto.Cipher local12_life8;
    javax.crypto.Cipher __sourceSpill764_10 = (local12_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill764_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill764_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill764_13 = new byte[8];
    (__sourceSpill764_13)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local13_life14 = 1;
    while ((local13_life14 < 8)) {
        (__sourceSpill764_13)[local13_life14] = ((byte) ((int) ((local20_life6 << (local13_life14 * 8)) >>> 56)));
        local13_life14 += 1;
    }
    byte[] __sourcePreallocation764_15 = __sourceSpill764_13;
    ((javax.crypto.Cipher)(__sourceSpill764_10)).init(((int)(__sourceSpill764_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill764_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation764_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local11_life18 = new java.lang.String[8];
    int local17_life19 = 0;
    java.lang.String local16_life20;
    int local18_life22 = ((java.lang.String)((local16_life20 = "ä~njFm\036cg\004Ý#C­Æ\b¡\001\020\007_ý\005_\020Ul>\\\033«)3M\020Tõ\tìX\bæP¦­ÖI`u\020\003%2\016¤ÁY\035ï\nRâè\b\013Éç*jï@"))).length();
    int local15_life23 = 16;
    int local14_life24 = -1;
    while (true) {
        local14_life24 += 1;
        byte[] __sourceSpill764_27 = ((java.lang.String)(((java.lang.String)(local16_life20)).substring(((int)(local14_life24)), ((int)((local14_life24 + local15_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill764_28 = local12_life8;
        byte[] local19_life30 = ((javax.crypto.Cipher)(__sourceSpill764_28)).doFinal(((byte[])(__sourceSpill764_27)));
        java.lang.String __sourceSpill764_33 = ((java.lang.String)(moom.bL.a(((byte[])(local19_life30))))).intern();
        java.lang.String[] __sourceSpill764_34 = local11_life18;
        int __sourceSpill764_35 = local17_life19;
        local17_life19 += 1;
        (__sourceSpill764_34)[__sourceSpill764_35] = __sourceSpill764_33;
        if (!(((local14_life24 = (local14_life24 + local15_life23)) < local18_life22))) { break; }
        local15_life23 = ((java.lang.String)(local16_life20)).charAt(((int)(local14_life24)));
    }
    local18_life22 = ((java.lang.String)((local16_life20 = "%J\037±%&\bN)ï=¤$O"))).length();
    local15_life23 = 8;
    local14_life24 = -1;
    while (true) {
        local14_life24 += 1;
        byte[] __sourceSpill764_40 = ((java.lang.String)(((java.lang.String)(local16_life20)).substring(((int)(local14_life24)), ((int)((local14_life24 + local15_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill764_41 = local12_life8;
        byte[] local19_life43 = ((javax.crypto.Cipher)(__sourceSpill764_41)).doFinal(((byte[])(__sourceSpill764_40)));
        java.lang.String __sourceSpill764_46 = ((java.lang.String)(moom.bL.a(((byte[])(local19_life43))))).intern();
        java.lang.String[] __sourceSpill764_47 = local11_life18;
        int __sourceSpill764_48 = local17_life19;
        local17_life19 += 1;
        (__sourceSpill764_47)[__sourceSpill764_48] = __sourceSpill764_46;
        if (!(((local14_life24 = (local14_life24 + local15_life23)) < local18_life22))) { break; }
        local15_life23 = ((java.lang.String)(local16_life20)).charAt(((int)(local14_life24)));
    }
    e = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life52;
    javax.crypto.Cipher __sourceSpill764_54 = (local0_life52 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill764_55 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill764_56 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill764_57 = new byte[8];
    (__sourceSpill764_57)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local1_life58 = 1;
    while ((local1_life58 < 8)) {
        (__sourceSpill764_57)[local1_life58] = ((byte) ((int) ((local20_life6 << (local1_life58 * 8)) >>> 56)));
        local1_life58 += 1;
    }
    byte[] __sourcePreallocation764_59 = __sourceSpill764_57;
    ((javax.crypto.Cipher)(__sourceSpill764_54)).init(((int)(__sourceSpill764_55)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill764_56)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation764_59)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life62 = new long[5];
    int local3_life63 = 0;
    java.lang.String local4_life64;
    int local5_life66 = ((java.lang.String)((local4_life64 = "B(Ø\006fgU ·«Ì£Â}Húi¥ûS\024-"))).length();
    int local2_life67 = 0;
    do {
        java.lang.String __sourceSpill764_68 = local4_life64;
        int __sourceSpill764_69 = local2_life67;
        local2_life67 += 8;
        byte[] local7_life72 = ((java.lang.String)(((java.lang.String)(__sourceSpill764_68)).substring(((int)(__sourceSpill764_69)), ((int)(local2_life67))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill764_73 = local6_life62;
        int __sourceSpill764_74 = local3_life63;
        local3_life63 += 1;
        long local8_life75 = (((((((((((long) (local7_life72)[0]) & 255L) << 56) | ((((long) (local7_life72)[1]) & 255L) << 48)) | ((((long) (local7_life72)[2]) & 255L) << 40)) | ((((long) (local7_life72)[3]) & 255L) << 32)) | ((((long) (local7_life72)[4]) & 255L) << 24)) | ((((long) (local7_life72)[5]) & 255L) << 16)) | ((((long) (local7_life72)[6]) & 255L) << 8)) | (((long) (local7_life72)[7]) & 255L));
        byte[] __sourceSpill764_76 = new byte[8];
        (__sourceSpill764_76)[0] = ((byte) ((int) (local8_life75 >>> 56)));
        (__sourceSpill764_76)[1] = ((byte) ((int) (local8_life75 >>> 48)));
        (__sourceSpill764_76)[2] = ((byte) ((int) (local8_life75 >>> 40)));
        (__sourceSpill764_76)[3] = ((byte) ((int) (local8_life75 >>> 32)));
        (__sourceSpill764_76)[4] = ((byte) ((int) (local8_life75 >>> 24)));
        (__sourceSpill764_76)[5] = ((byte) ((int) (local8_life75 >>> 16)));
        (__sourceSpill764_76)[6] = ((byte) ((int) (local8_life75 >>> 8)));
        (__sourceSpill764_76)[7] = ((byte) ((int) local8_life75));
        javax.crypto.Cipher __sourceSpill764_77 = local0_life52;
        byte[] local10_life79 = ((javax.crypto.Cipher)(__sourceSpill764_77)).doFinal(((byte[])(__sourceSpill764_76)));
        (__sourceSpill764_73)[__sourceSpill764_74] = (((((((((((long) (local10_life79)[0]) & 255L) << 56) | ((((long) (local10_life79)[1]) & 255L) << 48)) | ((((long) (local10_life79)[2]) & 255L) << 40)) | ((((long) (local10_life79)[3]) & 255L) << 32)) | ((((long) (local10_life79)[4]) & 255L) << 24)) | ((((long) (local10_life79)[5]) & 255L) << 16)) | ((((long) (local10_life79)[6]) & 255L) << 8)) | (((long) (local10_life79)[7]) & 255L));
    } while ((!(local2_life67 >= local5_life66)));
    local5_life66 = ((java.lang.String)((local4_life64 = "dµÏ#õ\032\006¶wæ#d\037Ú5"))).length();
    local2_life67 = 0;
    do {
        java.lang.String __sourceSpill764_81 = local4_life64;
        int __sourceSpill764_82 = local2_life67;
        local2_life67 += 8;
        byte[] local7_life85 = ((java.lang.String)(((java.lang.String)(__sourceSpill764_81)).substring(((int)(__sourceSpill764_82)), ((int)(local2_life67))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill764_86 = local6_life62;
        int __sourceSpill764_87 = local3_life63;
        local3_life63 += 1;
        long local8_life88 = (((((((((((long) (local7_life85)[0]) & 255L) << 56) | ((((long) (local7_life85)[1]) & 255L) << 48)) | ((((long) (local7_life85)[2]) & 255L) << 40)) | ((((long) (local7_life85)[3]) & 255L) << 32)) | ((((long) (local7_life85)[4]) & 255L) << 24)) | ((((long) (local7_life85)[5]) & 255L) << 16)) | ((((long) (local7_life85)[6]) & 255L) << 8)) | (((long) (local7_life85)[7]) & 255L));
        byte[] __sourceSpill764_89 = new byte[8];
        (__sourceSpill764_89)[0] = ((byte) ((int) (local8_life88 >>> 56)));
        (__sourceSpill764_89)[1] = ((byte) ((int) (local8_life88 >>> 48)));
        (__sourceSpill764_89)[2] = ((byte) ((int) (local8_life88 >>> 40)));
        (__sourceSpill764_89)[3] = ((byte) ((int) (local8_life88 >>> 32)));
        (__sourceSpill764_89)[4] = ((byte) ((int) (local8_life88 >>> 24)));
        (__sourceSpill764_89)[5] = ((byte) ((int) (local8_life88 >>> 16)));
        (__sourceSpill764_89)[6] = ((byte) ((int) (local8_life88 >>> 8)));
        (__sourceSpill764_89)[7] = ((byte) ((int) local8_life88));
        javax.crypto.Cipher __sourceSpill764_90 = local0_life52;
        byte[] local10_life92 = ((javax.crypto.Cipher)(__sourceSpill764_90)).doFinal(((byte[])(__sourceSpill764_89)));
        (__sourceSpill764_86)[__sourceSpill764_87] = (((((((((((long) (local10_life92)[0]) & 255L) << 56) | ((((long) (local10_life92)[1]) & 255L) << 48)) | ((((long) (local10_life92)[2]) & 255L) << 40)) | ((((long) (local10_life92)[3]) & 255L) << 32)) | ((((long) (local10_life92)[4]) & 255L) << 24)) | ((((long) (local10_life92)[5]) & 255L) << 16)) | ((((long) (local10_life92)[6]) & 255L) << 8)) | (((long) (local10_life92)[7]) & 255L));
    } while ((!(local2_life67 >= local5_life66)));
    c = ((long[])(local6_life62));
    d = ((java.lang.Integer[])(new java.lang.Integer[5]));
    UP = ((moom.bL)(new moom.bL((local11_life18)[5], 0)));
    UP_RIGHT = ((moom.bL)(new moom.bL((local11_life18)[0], 1)));
    RIGHT = ((moom.bL)(new moom.bL((local11_life18)[7], 2)));
    DOWN_RIGHT = ((moom.bL)(new moom.bL((local11_life18)[4], 3)));
    DOWN = ((moom.bL)(new moom.bL((local11_life18)[3], 4)));
    DOWN_LEFT = ((moom.bL)(new moom.bL((local11_life18)[2], 5)));
    LEFT = ((moom.bL)(new moom.bL((local11_life18)[6], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite764_101(163, (4580020649610446733L ^ local20_life6)))));
    UP_LEFT = ((moom.bL)(new moom.bL((local11_life18)[1], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite764_103(27682, (8962034192625494799L ^ local20_life6)))));
    a = ((moom.bL[])(moom.bL.a()));
    VALUES = ((moom.bL[])(moom.bL.values()));
}


public static moom.bL[] values() {
return ((moom.bL[])(((moom.bL[])(moom.bL.a)).clone()));
}


public static moom.bL valueOf(java.lang.String p0) {
return ((moom.bL)(java.lang.Enum.valueOf(((java.lang.Class)(moom.bL.class)), ((java.lang.String)(p0)))));
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 5164;
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
            throw new RuntimeException("moom/bL", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         d[var3] = var15;
      }

      return d[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.bL.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6922_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/bL"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
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
        byte[] spill3500_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3500_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3500_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3500_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3500_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3500_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static moom.bL[] a() {
long local0_life1 = (moom.bL.b ^ 54594164389517L);
    moom.bL[] __sourceSharedArray754_4 = new moom.bL[__sourceIntrinsic_79a1a123b217_originalDynamicSite754_2(1943, (1736561841746643010L ^ local0_life1))];
    __sourceSharedArray754_4[0] = moom.bL.UP;
    __sourceSharedArray754_4[1] = moom.bL.UP_RIGHT;
    __sourceSharedArray754_4[2] = moom.bL.RIGHT;
    __sourceSharedArray754_4[3] = moom.bL.DOWN_RIGHT;
    __sourceSharedArray754_4[4] = moom.bL.DOWN;
    __sourceSharedArray754_4[5] = moom.bL.DOWN_LEFT;
    __sourceSharedArray754_4[__sourceIntrinsic_79a1a123b217_originalDynamicSite754_10(9451, (1877666039788088120L ^ local0_life1))] = moom.bL.LEFT;
    __sourceSharedArray754_4[__sourceIntrinsic_79a1a123b217_originalDynamicSite754_12(6946, (1660413005226218738L ^ local0_life1))] = moom.bL.UP_LEFT;
    return __sourceSharedArray754_4;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite764_101(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite764_103(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6922_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_79a1a123b217_originalDynamicSite754_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_79a1a123b217_originalDynamicSite754_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_79a1a123b217_originalDynamicSite754_12(int a0, long a1) throws E;
}
