package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class b1 extends sourcebuild.EnumConstructor<moom.b1> {

public static moom.b1 RED;

public static moom.b1 RG;

public static moom.b1 RGB;

public static moom.b1 BGR;

public static moom.b1 RGBA;

public static moom.b1 BGRA;

public static moom.b1 RED_INTEGER;

public static moom.b1 RG_INTEGER;

public static moom.b1 RGB_INTEGER;

public static moom.b1 BGR_INTEGER;

public static moom.b1 RGBA_INTEGER;

public static moom.b1 BGRA_INTEGER;

private int a;

private static moom.b1[] b;

private static long c;

private static long[] d;

private static java.lang.Integer[] e;

private static java.util.Map f;

private b1(java.lang.String p0, int p1, int p2) {
super(p0, p1);
    this.a = p2;
}


private static void initialize() {
c = ((long)(((moom._a)(moom._c.a(((long)(-5385822209909820071L)), ((long)(4017838507758783688L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(246791820931718L)))));
    long local20_life6 = (moom.b1.c ^ 5646735950458L);
    javax.crypto.Cipher local12_life8;
    javax.crypto.Cipher __sourceSpill760_10 = (local12_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill760_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill760_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill760_13 = new byte[8];
    (__sourceSpill760_13)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local13_life14 = 1;
    while ((local13_life14 < 8)) {
        (__sourceSpill760_13)[local13_life14] = ((byte) ((int) ((local20_life6 << (local13_life14 * 8)) >>> 56)));
        local13_life14 += 1;
    }
    byte[] __sourcePreallocation760_15 = __sourceSpill760_13;
    ((javax.crypto.Cipher)(__sourceSpill760_10)).init(((int)(__sourceSpill760_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill760_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation760_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local11_life18 = new java.lang.String[12];
    int local17_life19 = 0;
    java.lang.String local16_life20;
    int local18_life22 = ((java.lang.String)((local16_life20 = "/ÕõZÑõQó\bâ\037\025S¶é\016\020TëðZKöóº\034tÿ\n\b4ÁÉ2Ðz\"¿\bà\031¥¡{Ü,r\bÐ\013õç;8-\036\b_½0\026f}#R\020;Ñ{8·¡`!\003\021'ð\020)gªÙP\016Ò\b¯\033\\Êal\020¢;,<ÒtBâ\"Äzý]"))).length();
    int local15_life23 = 8;
    int local14_life24 = -1;
    while (true) {
        local14_life24 += 1;
        byte[] __sourceSpill760_27 = ((java.lang.String)(((java.lang.String)(local16_life20)).substring(((int)(local14_life24)), ((int)((local14_life24 + local15_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill760_28 = local12_life8;
        byte[] local19_life30 = ((javax.crypto.Cipher)(__sourceSpill760_28)).doFinal(((byte[])(__sourceSpill760_27)));
        java.lang.String __sourceSpill760_33 = ((java.lang.String)(moom.b1.a(((byte[])(local19_life30))))).intern();
        java.lang.String[] __sourceSpill760_34 = local11_life18;
        int __sourceSpill760_35 = local17_life19;
        local17_life19 += 1;
        (__sourceSpill760_34)[__sourceSpill760_35] = __sourceSpill760_33;
        if (!(((local14_life24 = (local14_life24 + local15_life23)) < local18_life22))) { break; }
        local15_life23 = ((java.lang.String)(local16_life20)).charAt(((int)(local14_life24)));
    }
    local18_life22 = ((java.lang.String)((local16_life20 = ")ÐVQ\tg9\005/{¶·\020§ãPÔ©\r\0276Þm\025Xò%Æy"))).length();
    local15_life23 = 16;
    local14_life24 = -1;
    while (true) {
        local14_life24 += 1;
        byte[] __sourceSpill760_40 = ((java.lang.String)(((java.lang.String)(local16_life20)).substring(((int)(local14_life24)), ((int)((local14_life24 + local15_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill760_41 = local12_life8;
        byte[] local19_life43 = ((javax.crypto.Cipher)(__sourceSpill760_41)).doFinal(((byte[])(__sourceSpill760_40)));
        java.lang.String __sourceSpill760_46 = ((java.lang.String)(moom.b1.a(((byte[])(local19_life43))))).intern();
        java.lang.String[] __sourceSpill760_47 = local11_life18;
        int __sourceSpill760_48 = local17_life19;
        local17_life19 += 1;
        (__sourceSpill760_47)[__sourceSpill760_48] = __sourceSpill760_46;
        if (!(((local14_life24 = (local14_life24 + local15_life23)) < local18_life22))) { break; }
        local15_life23 = ((java.lang.String)(local16_life20)).charAt(((int)(local14_life24)));
    }
    f = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life52;
    javax.crypto.Cipher __sourceSpill760_54 = (local0_life52 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill760_55 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill760_56 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill760_57 = new byte[8];
    (__sourceSpill760_57)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local1_life58 = 1;
    while ((local1_life58 < 8)) {
        (__sourceSpill760_57)[local1_life58] = ((byte) ((int) ((local20_life6 << (local1_life58 * 8)) >>> 56)));
        local1_life58 += 1;
    }
    byte[] __sourcePreallocation760_59 = __sourceSpill760_57;
    ((javax.crypto.Cipher)(__sourceSpill760_54)).init(((int)(__sourceSpill760_55)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill760_56)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation760_59)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life62 = new long[25];
    int local3_life63 = 0;
    java.lang.String local4_life64;
    int local5_life66 = ((java.lang.String)((local4_life64 = "²Ù×À(¦e¥\032\022çª\022ððÐâÑQPµ\006þzmÐO´FÒ¢z_Aø.ÉÎQ/èeîÔ2b¿`}s$HÔ\026haT¯ªiaK¬-¥\000¾à»±\013òõæ*kò±Az¹Ã^®ËGHsï#®\b¸eÅ»63×2\000QÀ\177iõñ%49f¿¾0æ¤\020`\013/TÑ\027³Ä TÓV\nhº\"\031½\030SêeØ#\022×-ÀöÁ$<eËÈ"))).length();
    int local2_life67 = 0;
    do {
        java.lang.String __sourceSpill760_68 = local4_life64;
        int __sourceSpill760_69 = local2_life67;
        local2_life67 += 8;
        byte[] local7_life72 = ((java.lang.String)(((java.lang.String)(__sourceSpill760_68)).substring(((int)(__sourceSpill760_69)), ((int)(local2_life67))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill760_73 = local6_life62;
        int __sourceSpill760_74 = local3_life63;
        local3_life63 += 1;
        long local8_life75 = (((((((((((long) (local7_life72)[0]) & 255L) << 56) | ((((long) (local7_life72)[1]) & 255L) << 48)) | ((((long) (local7_life72)[2]) & 255L) << 40)) | ((((long) (local7_life72)[3]) & 255L) << 32)) | ((((long) (local7_life72)[4]) & 255L) << 24)) | ((((long) (local7_life72)[5]) & 255L) << 16)) | ((((long) (local7_life72)[6]) & 255L) << 8)) | (((long) (local7_life72)[7]) & 255L));
        byte[] __sourceSpill760_76 = new byte[8];
        (__sourceSpill760_76)[0] = ((byte) ((int) (local8_life75 >>> 56)));
        (__sourceSpill760_76)[1] = ((byte) ((int) (local8_life75 >>> 48)));
        (__sourceSpill760_76)[2] = ((byte) ((int) (local8_life75 >>> 40)));
        (__sourceSpill760_76)[3] = ((byte) ((int) (local8_life75 >>> 32)));
        (__sourceSpill760_76)[4] = ((byte) ((int) (local8_life75 >>> 24)));
        (__sourceSpill760_76)[5] = ((byte) ((int) (local8_life75 >>> 16)));
        (__sourceSpill760_76)[6] = ((byte) ((int) (local8_life75 >>> 8)));
        (__sourceSpill760_76)[7] = ((byte) ((int) local8_life75));
        javax.crypto.Cipher __sourceSpill760_77 = local0_life52;
        byte[] local10_life79 = ((javax.crypto.Cipher)(__sourceSpill760_77)).doFinal(((byte[])(__sourceSpill760_76)));
        (__sourceSpill760_73)[__sourceSpill760_74] = (((((((((((long) (local10_life79)[0]) & 255L) << 56) | ((((long) (local10_life79)[1]) & 255L) << 48)) | ((((long) (local10_life79)[2]) & 255L) << 40)) | ((((long) (local10_life79)[3]) & 255L) << 32)) | ((((long) (local10_life79)[4]) & 255L) << 24)) | ((((long) (local10_life79)[5]) & 255L) << 16)) | ((((long) (local10_life79)[6]) & 255L) << 8)) | (((long) (local10_life79)[7]) & 255L));
    } while ((!(local2_life67 >= local5_life66)));
    local5_life66 = ((java.lang.String)((local4_life64 = "ÚÑ4\005{®ô\016\f\007ÉÂ"))).length();
    local2_life67 = 0;
    do {
        java.lang.String __sourceSpill760_81 = local4_life64;
        int __sourceSpill760_82 = local2_life67;
        local2_life67 += 8;
        byte[] local7_life85 = ((java.lang.String)(((java.lang.String)(__sourceSpill760_81)).substring(((int)(__sourceSpill760_82)), ((int)(local2_life67))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill760_86 = local6_life62;
        int __sourceSpill760_87 = local3_life63;
        local3_life63 += 1;
        long local8_life88 = (((((((((((long) (local7_life85)[0]) & 255L) << 56) | ((((long) (local7_life85)[1]) & 255L) << 48)) | ((((long) (local7_life85)[2]) & 255L) << 40)) | ((((long) (local7_life85)[3]) & 255L) << 32)) | ((((long) (local7_life85)[4]) & 255L) << 24)) | ((((long) (local7_life85)[5]) & 255L) << 16)) | ((((long) (local7_life85)[6]) & 255L) << 8)) | (((long) (local7_life85)[7]) & 255L));
        byte[] __sourceSpill760_89 = new byte[8];
        (__sourceSpill760_89)[0] = ((byte) ((int) (local8_life88 >>> 56)));
        (__sourceSpill760_89)[1] = ((byte) ((int) (local8_life88 >>> 48)));
        (__sourceSpill760_89)[2] = ((byte) ((int) (local8_life88 >>> 40)));
        (__sourceSpill760_89)[3] = ((byte) ((int) (local8_life88 >>> 32)));
        (__sourceSpill760_89)[4] = ((byte) ((int) (local8_life88 >>> 24)));
        (__sourceSpill760_89)[5] = ((byte) ((int) (local8_life88 >>> 16)));
        (__sourceSpill760_89)[6] = ((byte) ((int) (local8_life88 >>> 8)));
        (__sourceSpill760_89)[7] = ((byte) ((int) local8_life88));
        javax.crypto.Cipher __sourceSpill760_90 = local0_life52;
        byte[] local10_life92 = ((javax.crypto.Cipher)(__sourceSpill760_90)).doFinal(((byte[])(__sourceSpill760_89)));
        (__sourceSpill760_86)[__sourceSpill760_87] = (((((((((((long) (local10_life92)[0]) & 255L) << 56) | ((((long) (local10_life92)[1]) & 255L) << 48)) | ((((long) (local10_life92)[2]) & 255L) << 40)) | ((((long) (local10_life92)[3]) & 255L) << 32)) | ((((long) (local10_life92)[4]) & 255L) << 24)) | ((((long) (local10_life92)[5]) & 255L) << 16)) | ((((long) (local10_life92)[6]) & 255L) << 8)) | (((long) (local10_life92)[7]) & 255L));
    } while ((!(local2_life67 >= local5_life66)));
    d = ((long[])(local6_life62));
    e = ((java.lang.Integer[])(new java.lang.Integer[25]));
    RED = ((moom.b1)(new moom.b1((local11_life18)[6], 0, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite760_95(19698, (2327657851402832603L ^ local20_life6)))));
    RG = ((moom.b1)(new moom.b1((local11_life18)[3], 1, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite760_97(24891, (291353350256289562L ^ local20_life6)))));
    RGB = ((moom.b1)(new moom.b1((local11_life18)[0], 2, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite760_99(8953, (3046288397886760148L ^ local20_life6)))));
    BGR = ((moom.b1)(new moom.b1((local11_life18)[5], 3, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite760_101(19043, (7229242041208917064L ^ local20_life6)))));
    RGBA = ((moom.b1)(new moom.b1((local11_life18)[4], 4, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite760_103(8750, (6306391573839782932L ^ local20_life6)))));
    BGRA = ((moom.b1)(new moom.b1((local11_life18)[1], 5, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite760_105(31353, (7811172926322211935L ^ local20_life6)))));
    RED_INTEGER = ((moom.b1)(new moom.b1((local11_life18)[11], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite760_107(18949, (2386355338146663457L ^ local20_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite760_108(22228, (1012422364688765175L ^ local20_life6)))));
    RG_INTEGER = ((moom.b1)(new moom.b1((local11_life18)[8], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite760_110(32385, (6414765830123681953L ^ local20_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite760_111(27153, (2389503967670856763L ^ local20_life6)))));
    RGB_INTEGER = ((moom.b1)(new moom.b1((local11_life18)[9], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite760_113(16577, (7623108721679484670L ^ local20_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite760_114(27827, (2711483343965153931L ^ local20_life6)))));
    BGR_INTEGER = ((moom.b1)(new moom.b1((local11_life18)[7], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite760_116(25881, (1052729538825118513L ^ local20_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite760_117(17251, (4916280615912162650L ^ local20_life6)))));
    RGBA_INTEGER = ((moom.b1)(new moom.b1((local11_life18)[2], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite760_119(3538, (2602867872858442749L ^ local20_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite760_120(4869, (2141672045739808057L ^ local20_life6)))));
    BGRA_INTEGER = ((moom.b1)(new moom.b1((local11_life18)[10], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite760_122(15654, (582277774412266269L ^ local20_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite760_123(7987, (6552239717342812429L ^ local20_life6)))));
    b = ((moom.b1[])(moom.b1.a__Arrayb1()));
}


public static moom.b1[] values() {
return ((moom.b1[])(((moom.b1[])(moom.b1.b)).clone()));
}


public static moom.b1 valueOf(java.lang.String p0) {
return ((moom.b1)(java.lang.Enum.valueOf(((java.lang.Class)(moom.b1.class)), ((java.lang.String)(p0)))));
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 939;
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
            throw new RuntimeException("moom/b1", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         e[var3] = var15;
      }

      return e[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6913_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/b1"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.b1.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
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
        byte[] spill3494_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3494_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3494_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3494_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3494_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3494_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static moom.b1[] a__Arrayb1() {
long local0_life1 = (moom.b1.c ^ 108118623387003L);
    moom.b1[] __sourceSharedArray751_4 = new moom.b1[__sourceIntrinsic_137069f15629_originalDynamicSite751_2(26989, (7024581001114210370L ^ local0_life1))];
    __sourceSharedArray751_4[0] = moom.b1.RED;
    __sourceSharedArray751_4[1] = moom.b1.RG;
    __sourceSharedArray751_4[2] = moom.b1.RGB;
    __sourceSharedArray751_4[3] = moom.b1.BGR;
    __sourceSharedArray751_4[4] = moom.b1.RGBA;
    __sourceSharedArray751_4[5] = moom.b1.BGRA;
    __sourceSharedArray751_4[__sourceIntrinsic_137069f15629_originalDynamicSite751_10(6033, (957490646954978994L ^ local0_life1))] = moom.b1.RED_INTEGER;
    __sourceSharedArray751_4[__sourceIntrinsic_137069f15629_originalDynamicSite751_12(24408, (4512546753081796196L ^ local0_life1))] = moom.b1.RG_INTEGER;
    __sourceSharedArray751_4[__sourceIntrinsic_137069f15629_originalDynamicSite751_14(31486, (8341978233989579731L ^ local0_life1))] = moom.b1.RGB_INTEGER;
    __sourceSharedArray751_4[__sourceIntrinsic_137069f15629_originalDynamicSite751_16(30703, (2364700326014635721L ^ local0_life1))] = moom.b1.BGR_INTEGER;
    __sourceSharedArray751_4[__sourceIntrinsic_137069f15629_originalDynamicSite751_18(17350, (9017544457399007986L ^ local0_life1))] = moom.b1.RGBA_INTEGER;
    __sourceSharedArray751_4[__sourceIntrinsic_137069f15629_originalDynamicSite751_20(25712, (8760563802719903060L ^ local0_life1))] = moom.b1.BGRA_INTEGER;
    return __sourceSharedArray751_4;
}


public int a() {
return this.a;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite760_95(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite760_97(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite760_99(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite760_101(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite760_103(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite760_105(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite760_107(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite760_108(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite760_110(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite760_111(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite760_113(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite760_114(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite760_116(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite760_117(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite760_119(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite760_120(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite760_122(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite760_123(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6913_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_137069f15629_originalDynamicSite751_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_137069f15629_originalDynamicSite751_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_137069f15629_originalDynamicSite751_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_137069f15629_originalDynamicSite751_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_137069f15629_originalDynamicSite751_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_137069f15629_originalDynamicSite751_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_137069f15629_originalDynamicSite751_20(int a0, long a1) throws E;
}
