package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class jk {

private static final int[] a;

private final com.moon.jj b;

private final char[] c;

private final int d;

private int e;

private boolean f;

private static final long g;

private static final java.lang.String h;

private static final long[] i;

private static final java.lang.Integer[] j;

private static final java.util.Map k;

jk(char[] p0, int p1, int p2, boolean p3) {
super();
    this.b = new com.moon.jj();
    this.c = p0;
    this.d = p1;
    this.e = p2;
    this.f = p3;
}


static {
g = ((long)(((moom._a)(moom._c.a(((long)(5873627639512893889L)), ((long)(933376195506414412L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(249139014771807L)))));
    long local14_life6 = (com.moon.jk.g ^ 11237347578976L);
    javax.crypto.Cipher local11_life8;
    javax.crypto.Cipher __sourceSpill200_10 = (local11_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill200_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill200_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill200_13 = new byte[8];
    (__sourceSpill200_13)[0] = ((byte) ((int) (local14_life6 >>> 56)));
    int local12_life14 = 1;
    while ((local12_life14 < 8)) {
        (__sourceSpill200_13)[local12_life14] = ((byte) ((int) ((local14_life6 << (local12_life14 * 8)) >>> 56)));
        local12_life14 += 1;
    }
    byte[] __sourcePreallocation200_15 = __sourceSpill200_13;
    ((javax.crypto.Cipher)(__sourceSpill200_10)).init(((int)(__sourceSpill200_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill200_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation200_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill200_19 = ((java.lang.String)("\035SéJw6Rl¶îÀ MÆÃÕI\021\023*v¸M")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill200_20 = local11_life8;
    byte[] local13_life22 = ((javax.crypto.Cipher)(__sourceSpill200_20)).doFinal(((byte[])(__sourceSpill200_19)));
    h = ((java.lang.String)(((java.lang.String)(com.moon.jk.a(((byte[])(local13_life22))))).intern()));
    k = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life28;
    javax.crypto.Cipher __sourceSpill200_30 = (local0_life28 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill200_31 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill200_32 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill200_33 = new byte[8];
    (__sourceSpill200_33)[0] = ((byte) ((int) (local14_life6 >>> 56)));
    int local1_life34 = 1;
    while ((local1_life34 < 8)) {
        (__sourceSpill200_33)[local1_life34] = ((byte) ((int) ((local14_life6 << (local1_life34 * 8)) >>> 56)));
        local1_life34 += 1;
    }
    byte[] __sourcePreallocation200_35 = __sourceSpill200_33;
    ((javax.crypto.Cipher)(__sourceSpill200_30)).init(((int)(__sourceSpill200_31)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill200_32)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation200_35)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life38 = new long[15];
    int local3_life39 = 0;
    java.lang.String local4_life40;
    int local5_life42 = ((java.lang.String)((local4_life40 = "Í÷6\026æ­sM}:ÚU÷^2Öå#º.<ô3\023©°jCIxÝ´í­\021¿\004ãµ\030%¯åñn\tc¢âÌíæÝí¤\004HÏ¿\007'Ë:!çáA¸\005-£ÕuI´Ñ¡9á\177ý£\016HV8^*«\025ëu"))).length();
    int local2_life43 = 0;
    do {
        java.lang.String __sourceSpill200_44 = local4_life40;
        int __sourceSpill200_45 = local2_life43;
        local2_life43 += 8;
        byte[] local7_life48 = ((java.lang.String)(((java.lang.String)(__sourceSpill200_44)).substring(((int)(__sourceSpill200_45)), ((int)(local2_life43))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill200_49 = local6_life38;
        int __sourceSpill200_50 = local3_life39;
        local3_life39 += 1;
        long local8_life51 = (((((((((((long) (local7_life48)[0]) & 255L) << 56) | ((((long) (local7_life48)[1]) & 255L) << 48)) | ((((long) (local7_life48)[2]) & 255L) << 40)) | ((((long) (local7_life48)[3]) & 255L) << 32)) | ((((long) (local7_life48)[4]) & 255L) << 24)) | ((((long) (local7_life48)[5]) & 255L) << 16)) | ((((long) (local7_life48)[6]) & 255L) << 8)) | (((long) (local7_life48)[7]) & 255L));
        byte[] __sourceSpill200_52 = new byte[8];
        (__sourceSpill200_52)[0] = ((byte) ((int) (local8_life51 >>> 56)));
        (__sourceSpill200_52)[1] = ((byte) ((int) (local8_life51 >>> 48)));
        (__sourceSpill200_52)[2] = ((byte) ((int) (local8_life51 >>> 40)));
        (__sourceSpill200_52)[3] = ((byte) ((int) (local8_life51 >>> 32)));
        (__sourceSpill200_52)[4] = ((byte) ((int) (local8_life51 >>> 24)));
        (__sourceSpill200_52)[5] = ((byte) ((int) (local8_life51 >>> 16)));
        (__sourceSpill200_52)[6] = ((byte) ((int) (local8_life51 >>> 8)));
        (__sourceSpill200_52)[7] = ((byte) ((int) local8_life51));
        javax.crypto.Cipher __sourceSpill200_53 = local0_life28;
        byte[] local10_life55 = ((javax.crypto.Cipher)(__sourceSpill200_53)).doFinal(((byte[])(__sourceSpill200_52)));
        (__sourceSpill200_49)[__sourceSpill200_50] = (((((((((((long) (local10_life55)[0]) & 255L) << 56) | ((((long) (local10_life55)[1]) & 255L) << 48)) | ((((long) (local10_life55)[2]) & 255L) << 40)) | ((((long) (local10_life55)[3]) & 255L) << 32)) | ((((long) (local10_life55)[4]) & 255L) << 24)) | ((((long) (local10_life55)[5]) & 255L) << 16)) | ((((long) (local10_life55)[6]) & 255L) << 8)) | (((long) (local10_life55)[7]) & 255L));
    } while ((!(local2_life43 >= local5_life42)));
    local5_life42 = ((java.lang.String)((local4_life40 = "\025°'å\020:L®þ'èTI6"))).length();
    local2_life43 = 0;
    do {
        java.lang.String __sourceSpill200_57 = local4_life40;
        int __sourceSpill200_58 = local2_life43;
        local2_life43 += 8;
        byte[] local7_life61 = ((java.lang.String)(((java.lang.String)(__sourceSpill200_57)).substring(((int)(__sourceSpill200_58)), ((int)(local2_life43))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill200_62 = local6_life38;
        int __sourceSpill200_63 = local3_life39;
        local3_life39 += 1;
        long local8_life64 = (((((((((((long) (local7_life61)[0]) & 255L) << 56) | ((((long) (local7_life61)[1]) & 255L) << 48)) | ((((long) (local7_life61)[2]) & 255L) << 40)) | ((((long) (local7_life61)[3]) & 255L) << 32)) | ((((long) (local7_life61)[4]) & 255L) << 24)) | ((((long) (local7_life61)[5]) & 255L) << 16)) | ((((long) (local7_life61)[6]) & 255L) << 8)) | (((long) (local7_life61)[7]) & 255L));
        byte[] __sourceSpill200_65 = new byte[8];
        (__sourceSpill200_65)[0] = ((byte) ((int) (local8_life64 >>> 56)));
        (__sourceSpill200_65)[1] = ((byte) ((int) (local8_life64 >>> 48)));
        (__sourceSpill200_65)[2] = ((byte) ((int) (local8_life64 >>> 40)));
        (__sourceSpill200_65)[3] = ((byte) ((int) (local8_life64 >>> 32)));
        (__sourceSpill200_65)[4] = ((byte) ((int) (local8_life64 >>> 24)));
        (__sourceSpill200_65)[5] = ((byte) ((int) (local8_life64 >>> 16)));
        (__sourceSpill200_65)[6] = ((byte) ((int) (local8_life64 >>> 8)));
        (__sourceSpill200_65)[7] = ((byte) ((int) local8_life64));
        javax.crypto.Cipher __sourceSpill200_66 = local0_life28;
        byte[] local10_life68 = ((javax.crypto.Cipher)(__sourceSpill200_66)).doFinal(((byte[])(__sourceSpill200_65)));
        (__sourceSpill200_62)[__sourceSpill200_63] = (((((((((((long) (local10_life68)[0]) & 255L) << 56) | ((((long) (local10_life68)[1]) & 255L) << 48)) | ((((long) (local10_life68)[2]) & 255L) << 40)) | ((((long) (local10_life68)[3]) & 255L) << 32)) | ((((long) (local10_life68)[4]) & 255L) << 24)) | ((((long) (local10_life68)[5]) & 255L) << 16)) | ((((long) (local10_life68)[6]) & 255L) << 8)) | (((long) (local10_life68)[7]) & 255L));
    } while ((!(local2_life43 >= local5_life42)));
    i = ((long[])(local6_life38));
    j = ((java.lang.Integer[])(new java.lang.Integer[15]));
    a = ((int[])(new int[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite200_71(9246, (854441570063808996L ^ local14_life6))]));
    int local16_life73 = 0;
    while ((local16_life73 < __sourceIntrinsic_eb8803ad1f63_originalDynamicSite200_74(28074, (2513778832404754522L ^ local14_life6)))) {
        int local17_life76 = (((local16_life73 >> 3) & 1) * __sourceIntrinsic_eb8803ad1f63_originalDynamicSite200_75(17299, (8928740704503668331L ^ local14_life6)));
        int local18_life78 = ((((local16_life73 >> 2) & 1) * __sourceIntrinsic_eb8803ad1f63_originalDynamicSite200_77(27274, (8927502329815349116L ^ local14_life6))) + local17_life76);
        int local19_life80 = ((((local16_life73 >> 1) & 1) * __sourceIntrinsic_eb8803ad1f63_originalDynamicSite200_79(21767, (8833562378980526325L ^ local14_life6))) + local17_life76);
        int local20_life82 = (((local16_life73 & 1) * __sourceIntrinsic_eb8803ad1f63_originalDynamicSite200_81(21767, (8833562378980526325L ^ local14_life6))) + local17_life76);
        if ((local16_life73 == __sourceIntrinsic_eb8803ad1f63_originalDynamicSite200_83(3451, (6000001991957139586L ^ local14_life6)))) {
        local18_life78 += 85;
    }
        if ((local16_life73 >= __sourceIntrinsic_eb8803ad1f63_originalDynamicSite200_84(25547, (2468350374566968894L ^ local14_life6)))) {
        local18_life78 = (local18_life78 / 4);
        local19_life80 = (local19_life80 / 4);
        local20_life82 = (local20_life82 / 4);
    }
        (com.moon.jk.a)[local16_life73] = ((((local18_life78 & __sourceIntrinsic_eb8803ad1f63_originalDynamicSite200_86(31829, (4592994036787126697L ^ local14_life6))) << __sourceIntrinsic_eb8803ad1f63_originalDynamicSite200_87(25547, (2468350374566968894L ^ local14_life6))) | ((local19_life80 & __sourceIntrinsic_eb8803ad1f63_originalDynamicSite200_88(31829, (4592994036787126697L ^ local14_life6))) << __sourceIntrinsic_eb8803ad1f63_originalDynamicSite200_89(20834, (5248261342209248413L ^ local14_life6)))) | (local20_life82 & __sourceIntrinsic_eb8803ad1f63_originalDynamicSite200_90(31829, (4592994036787126697L ^ local14_life6))));
        local16_life73 += 1;
    }
}


public int b() {
return this.e;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public com.moon.jk a(boolean p0) {
this.f = ((boolean)(p0));
    return this;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1971_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/jk"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.jk.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 4974;
      if (j[var3] == null) {
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
         long var5 = i[var3];
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
         Object[] var9 = (Object[])k.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               k.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/jk", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         j[var3] = var15;
      }

      return j[var3];
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
        byte[] spill822_0 = p0;
        life4_9 += 1;
        life5_44 = (spill822_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill822_1 = p0;
        life4_9 += 1;
        life5_76 = (spill822_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill822_2 = p0;
        life4_9 += 1;
        life5_91 = (spill822_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public boolean a(int p0) {
int forwardValue58_19_0;
    int forwardValue58_105_0;
    int forwardValue58_122_0;
    int forwardValue58_168_0;
    int forwardValue58_170_0;
    int spill58_0;
    int spill58_1;
    int spill58_2;
    int spill58_3;
    int spill58_4;
    long life2_3;
    int life4_5;
    int life5_25;
    int life6_61;
    int life7_129;
    forward_join_170: {
    forward_join_169: {
    forward_join_168: {
    forward_join_167: {
    forward_join_160: {
    forward_join_153: {
    forward_join_146: {
    forward_join_139: {
    forward_join_132: {
    forward_join_125: {
    forward_join_122: {
    forward_join_121: {
    forward_join_105: {
    forward_join_91: {
    forward_join_19: {
    forward_join_15: {
    life2_3 = (com.moon.jk.g ^ 124532941691871L);
    life4_5 = com.moon.jm.b();
    spill58_0 = this.e;
    if (!((life4_5 != 0))) {
        forwardValue58_19_0 = spill58_0;
        break forward_join_19;
    }
    if (!((spill58_0 == 0))) {
        break forward_join_15;
    }
    this.e = ((int)(this.d));
    }
    forwardValue58_19_0 = ((int)((this.c)[p0]));
    }
    life5_25 = forwardValue58_19_0;
    spill58_1 = life5_25;
    if (!((life4_5 != 0))) {
        forwardValue58_170_0 = spill58_1;
        break forward_join_170;
    }
    if (!((spill58_1 == __sourceIntrinsic_f3a7748b91d1_invokedynamic58_7(22507, (3448920455985644975L ^ life2_3))))) {
        break forward_join_169;
    }
    spill58_2 = (p0 + 1);
    if (!((life4_5 != 0))) {
        forwardValue58_170_0 = spill58_2;
        break forward_join_170;
    }
    if (!((spill58_2 < (this.c).length))) {
        break forward_join_169;
    }
    life6_61 = ((java.lang.String)(com.moon.jk.h)).indexOf(((int)((this.c)[(p0 + 1)])));
    spill58_3 = life6_61;
    if (!((life4_5 != 0))) {
        forwardValue58_122_0 = spill58_3;
        break forward_join_122;
    }
    if (!((spill58_3 < __sourceIntrinsic_f3a7748b91d1_invokedynamic58_12(23222, (1769099222482569466L ^ life2_3))))) {
        break forward_join_121;
    }
    ((com.moon.jj)(this.b)).c(((boolean)(false)));
    ((com.moon.jj)(this.b)).a(((boolean)(false)));
    ((com.moon.jj)(this.b)).d(((boolean)(false)));
    ((com.moon.jj)(this.b)).e(((boolean)(false)));
    ((com.moon.jj)(this.b)).b(((boolean)(false)));
    spill58_4 = life6_61;
    if (!((life4_5 != 0))) {
        forwardValue58_105_0 = spill58_4;
        break forward_join_105;
    }
    if (!((spill58_4 < 0))) {
        break forward_join_91;
    }
    life6_61 = __sourceIntrinsic_f3a7748b91d1_invokedynamic58_23(25688, (8016368093345248787L ^ life2_3));
    }
    forwardValue58_105_0 = ((this.d >> __sourceIntrinsic_f3a7748b91d1_invokedynamic58_25(12696, (7349648672221373392L ^ life2_3))) & __sourceIntrinsic_f3a7748b91d1_invokedynamic58_26(16705, (5979775641637638912L ^ life2_3)));
    }
    life7_129 = forwardValue58_105_0;
    this.e = ((int)(((com.moon.jk.a)[life6_61] + (life7_129 << __sourceIntrinsic_f3a7748b91d1_invokedynamic58_28(1473, (3157738443902883727L ^ life2_3))))));
    if (!((life4_5 == 0))) {
        break forward_join_167;
    }
    }
    forwardValue58_122_0 = life6_61;
    }
    if (!((life4_5 != 0))) {
        forwardValue58_168_0 = forwardValue58_122_0;
        break forward_join_168;
    }
    switch (forwardValue58_122_0) {
case 16:
{
        break forward_join_125;
    }
case 17:
{
        break forward_join_132;
    }
case 18:
{
        break forward_join_139;
    }
case 19:
{
        break forward_join_146;
    }
case 20:
{
        break forward_join_153;
    }
case 21:
{
        break forward_join_160;
    }
default:
{
        break forward_join_167;
    }
}
    }
    ((com.moon.jj)(this.b)).c(((boolean)(true)));
    if (!((life4_5 == 0))) {
        break forward_join_167;
    }
    }
    ((com.moon.jj)(this.b)).a(((boolean)(true)));
    if (!((life4_5 == 0))) {
        break forward_join_167;
    }
    }
    ((com.moon.jj)(this.b)).d(((boolean)(true)));
    if (!((life4_5 == 0))) {
        break forward_join_167;
    }
    }
    ((com.moon.jj)(this.b)).e(((boolean)(true)));
    if (!((life4_5 == 0))) {
        break forward_join_167;
    }
    }
    ((com.moon.jj)(this.b)).b(((boolean)(true)));
    if (!((life4_5 == 0))) {
        break forward_join_167;
    }
    }
    this.e = ((int)(this.d));
    ((com.moon.jj)(this.b)).a();
    }
    forwardValue58_168_0 = 1;
    }
    return ((forwardValue58_168_0) != 0);
    }
    forwardValue58_170_0 = 0;
    }
    return ((forwardValue58_170_0) != 0);
}


public static com.moon.jl a__jl() {
return new com.moon.jl();
}


public com.moon.jj a__jj() {
return this.b;
}


public char[] a__ArrayChar() {
return this.c;
}


public int a() {
return this.d;
}


public boolean a__Boolean() {
return ((((this.f) ? 1 : 0)) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite200_71(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite200_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite200_75(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite200_77(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite200_79(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite200_81(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite200_83(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite200_84(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite200_86(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite200_87(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite200_88(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite200_89(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite200_90(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f3a7748b91d1_invokedynamic58_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f3a7748b91d1_invokedynamic58_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f3a7748b91d1_invokedynamic58_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f3a7748b91d1_invokedynamic58_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f3a7748b91d1_invokedynamic58_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f3a7748b91d1_invokedynamic58_28(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1971_0() throws E;
}
