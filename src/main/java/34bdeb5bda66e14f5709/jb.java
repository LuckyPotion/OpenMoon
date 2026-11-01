package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class jb extends moom.iQ {

public moom.jD i;

public moom.jD j;

public moom.jD[] k;

public moom.jD[] l;

private static long m;

private static long[] n;

private static java.lang.Integer[] o;

private static java.util.Map p;

public jb() { super(); }


private static void __sourceConstructorBody_96e16a7b86abcdd2(moom.jb receiver) throws Throwable {

long local1_life2;

    net.minecraft.entity.Entity[] local3_life16;

    int local4_life81;

    init_join_397: {

    init_join_215: {

    local1_life2 = (moom.jb.m ^ 47972179064033L);

    moom.jb.__sourceConstructorInit_96e16a7b86abcdd2_0(((moom.jb)(receiver)));

    ((moom.jb)(receiver)).f = ((int)(__sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_5(5293, (4826561502525232969L ^ local1_life2))));

    net.minecraft.entity.Entity[] __sourceSpill681_11 = moom.iQ.b();

    ((moom.jb)(receiver)).g = ((int)(__sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_9(24244, (9101631840509517134L ^ local1_life2))));

    ((moom.jb)(receiver)).k = ((moom.jD[])(new moom.jD[__sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_13(1890, (3348495887286076567L ^ local1_life2))]));

    ((moom.jb)(receiver)).i = ((moom.jD)(new moom.jD(((moom.iQ) receiver))));

    local3_life16 = __sourceSpill681_11;

    ((moom.jD)(((moom.jD)(((moom.jb)(receiver)).i)).a(((int)(0)), ((int)(0))))).a(((float)(-1061158912)), ((float)(1092616192)), ((float)(-1056964608)), ((int)(__sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_23(1890, (3348495887286076567L ^ local1_life2)))), ((int)(__sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_25(1890, (3348495887286076567L ^ local1_life2)))), ((int)(__sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_27(14491, (61293345536719715L ^ local1_life2)))));

    ((moom.jD)(((moom.jD)(((moom.jb)(receiver)).i)).a(((int)(0)), ((int)(__sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_31(9666, (3914700359979345460L ^ local1_life2))))))).a(((float)(-1056964608)), ((float)(1092616192)), ((float)(-1061158912)), ((int)(2)), ((int)(__sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_37(1890, (3348495887286076567L ^ local1_life2)))), ((int)(__sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_39(1890, (3348495887286076567L ^ local1_life2)))));

    ((moom.jD)(((moom.jD)(((moom.jb)(receiver)).i)).a(((int)(0)), ((int)(__sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_43(14050, (3503814389947741467L ^ local1_life2))))))).a(((float)(1086324736)), ((float)(1092616192)), ((float)(-1061158912)), ((int)(2)), ((int)(__sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_49(1890, (3348495887286076567L ^ local1_life2)))), ((int)(__sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_51(1890, (3348495887286076567L ^ local1_life2)))), ((boolean)(true)));

    ((moom.jD)(((moom.jD)(((moom.jb)(receiver)).i)).a(((int)(__sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_55(8899, (4528881136175849784L ^ local1_life2)))), ((int)(__sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_57(26300, (6832708334805214550L ^ local1_life2))))))).a(((float)(-1061158912)), ((float)(1090519040)), ((float)(-1061158912)), ((int)(__sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_63(1890, (3348495887286076567L ^ local1_life2)))), ((int)(2)), ((int)(__sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_65(1890, (3348495887286076567L ^ local1_life2)))));

    ((moom.jD)(((moom.jD)(((moom.jb)(receiver)).i)).a(((int)(__sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_69(8899, (4528881136175849784L ^ local1_life2)))), ((int)(__sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_71(26960, (5798041094882159285L ^ local1_life2))))))).a(((float)(-1061158912)), ((float)(1102053376)), ((float)(-1061158912)), ((int)(__sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_77(1890, (3348495887286076567L ^ local1_life2)))), ((int)(2)), ((int)(__sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_79(1890, (3348495887286076567L ^ local1_life2)))));

    local4_life81 = 0;

    init_cycle_172: while (true) {

    if (!((local4_life81 < (((moom.jb)(receiver)).k).length))) {

        break init_join_215;

    }

    (((moom.jb)(receiver)).k)[local4_life81] = new moom.jD(((moom.iQ) receiver), 0, 0);

    ((moom.jD)((((moom.jb)(receiver)).k)[local4_life81])).a(((float)(-1082130432)), ((float)(-1064304640)), ((float)(-1082130432)), ((int)(2)), ((int)(__sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_89(29426, (6152205732125962499L ^ local1_life2)))), ((int)(2)));

    ((moom.jD)(((moom.jb)(receiver)).i)).a(((moom.jD)((((moom.jb)(receiver)).k)[local4_life81])));

    local4_life81 += 1;

    if (!((local3_life16 != null))) {

        break init_join_397;

    }

    if (!((local3_life16 == null))) { continue init_cycle_172; }

    break init_cycle_172;

    }

    }

    ((moom.jb)(receiver)).j = ((moom.jD)(new moom.jD(((moom.iQ) receiver), __sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_95(30004, (484708443626043103L ^ local1_life2)), 0)));

    ((moom.jD)(((moom.jb)(receiver)).j)).a(((float)(-1082130432)), ((float)(1097859072)), ((float)(0x0.0p0f)), ((int)(2)), ((int)(2)), ((int)(1)));

    ((moom.jD)(((moom.jb)(receiver)).i)).a(((moom.jD)(((moom.jb)(receiver)).j)));

    ((moom.jb)(receiver)).l = ((moom.jD[])(new moom.jD[3]));

    (((moom.jb)(receiver)).l)[0] = new moom.jD(((moom.iQ) receiver), __sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_107(26960, (5798041094882159285L ^ local1_life2)), 0);

    ((moom.jD)((((moom.jb)(receiver)).l)[0])).a(((float)(-1073741824)), ((float)(1096810496)), ((float)(1088421888)), ((int)(4)), ((int)(4)), ((int)(__sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_113(30004, (484708443626043103L ^ local1_life2)))));

    (((moom.jb)(receiver)).l)[1] = new moom.jD(((moom.iQ) receiver), 0, __sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_117(14855, (1164698107021244896L ^ local1_life2)));

    ((moom.jD)((((moom.jb)(receiver)).l)[1])).a(((float)(0x0.0p0f)), ((float)(1096810496)), ((float)(0x0.0p0f)), ((int)(3)), ((int)(3)), ((int)(__sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_121(27157, (8435722596278397431L ^ local1_life2)))));

    (((moom.jb)(receiver)).l)[2] = new moom.jD(((moom.iQ) receiver));

    ((moom.jD)(((moom.jD)((((moom.jb)(receiver)).l)[2])).a(((int)(__sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_126(4388, (1371853547975611099L ^ local1_life2)))), ((int)(__sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_128(26896, (2594637528696613622L ^ local1_life2))))))).a(((float)(0x0.0p0f)), ((float)(1096810496)), ((float)(0x0.0p0f)), ((int)(2)), ((int)(2)), ((int)(__sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_132(12978, (3099696726574313819L ^ local1_life2)))));

    ((moom.jD)(((moom.jD)((((moom.jb)(receiver)).l)[2])).a(((int)(__sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_136(24790, (8544444499881943863L ^ local1_life2)))), ((int)(__sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_138(21024, (5441320908734976476L ^ local1_life2))))))).a(((float)(0x1.0p0f)), ((float)(1093140480)), ((float)(1077936128)), ((int)(1)), ((int)(__sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_143(29426, (6152205732125962499L ^ local1_life2)))), ((int)(__sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_145(29426, (6152205732125962499L ^ local1_life2)))));

    ((moom.jD)(((moom.jb)(receiver)).i)).a(((moom.jD)((((moom.jb)(receiver)).l)[0])));

    ((moom.jD)((((moom.jb)(receiver)).l)[0])).a(((moom.jD)((((moom.jb)(receiver)).l)[1])));

    ((moom.jD)((((moom.jb)(receiver)).l)[1])).a(((moom.jD)((((moom.jb)(receiver)).l)[2])));

    }

    return;

}



static {
m = ((long)(((moom._a)(moom._c.a(((long)(4510973736121214275L)), ((long)(-389307820092826023L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(135009535729788L)))));
    p = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.jb.m ^ 31781988130997L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1330_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1330_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1330_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1330_14 = new byte[8];
    (__sourceSpill1330_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1330_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1330_16 = __sourceSpill1330_14;
    ((javax.crypto.Cipher)(__sourceSpill1330_11)).init(((int)(__sourceSpill1330_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1330_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1330_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[28];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "úÃþßÇ\bÒ±égFïqöÞ°0\021T¶:Ãð3¯),\003}^ÅËÙI°üVaf9{¢ÐYÊ\007°°4P(ÔæóÖ]2ãÕ\tÑÒÚÔ±ÎXÂ°Uéº.<\013\024¬A§ª4\rF°î§\006~±J°\026[Ê'À=p\177ùÝ¹VN\005¼diê\btwÅ²>úÓ@n²\032Þg§¸]W\016\035Q\016!'7\035UKÕ¶âs\037){s|Õ#YÈf>ýÄ(Â¼?åßª\031KXïro7î\031\016Lº¼\034úÓ)¨Câ["))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1330_25 = local6_life21;
        int __sourceSpill1330_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1330_25)).substring(((int)(__sourceSpill1330_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1330_30 = local8_life19;
        int __sourceSpill1330_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1330_33 = new byte[8];
        (__sourceSpill1330_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1330_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1330_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1330_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1330_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1330_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1330_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1330_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1330_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1330_34)).doFinal(((byte[])(__sourceSpill1330_33)));
        (__sourceSpill1330_30)[__sourceSpill1330_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "Y\025ÆSô~­Öx Úé|¹d"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1330_38 = local6_life21;
        int __sourceSpill1330_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1330_38)).substring(((int)(__sourceSpill1330_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1330_43 = local8_life19;
        int __sourceSpill1330_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1330_46 = new byte[8];
        (__sourceSpill1330_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1330_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1330_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1330_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1330_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1330_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1330_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1330_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1330_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1330_47)).doFinal(((byte[])(__sourceSpill1330_46)));
        (__sourceSpill1330_43)[__sourceSpill1330_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    n = ((long[])(local8_life19));
    o = ((java.lang.Integer[])(new java.lang.Integer[28]));
}

private static native <E extends Throwable> void __sourceConstructorInit_96e16a7b86abcdd2_0(moom.jb a0) throws E;

private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 8102;
      if (o[var3] == null) {
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
         long var5 = n[var3];
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
         Object[] var9 = (Object[])p.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               p.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/jb", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         o[var3] = var15;
      }

      return o[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.jb.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8159_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/jb"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(net.minecraft.entity.Entity p0, float p1, float p2, float p3, float p4, float p5, float p6) {
((moom.jb)(this)).a(((float)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((float)(p6)), ((net.minecraft.entity.Entity)(p0)));
    ((moom.jD)(this.i)).a(((float)(p6)));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int a() {
long local1 = (moom.jb.m ^ 112511531900507L);
    return __sourceIntrinsic_8aebf151eadb_originalDynamicSite1530_1(31312, (7261823550403056408L ^ local1));
}


public void a(float p0, float p1, float p2, float p3, float p4, float p5, net.minecraft.entity.Entity p6) {
net.minecraft.entity.Entity forestValue15_637_0;
    net.minecraft.entity.Entity forestValue15_641_0;
    float[] spill15_0;
    float[] spill15_1;
    float[] spill15_2;
    float[] spill15_3;
    float[] spill15_4;
    float[] spill15_5;
    float[] spill15_6;
    float[] spill15_7;
    float[] spill15_8;
    float[] spill15_9;
    float[] spill15_10;
    float[] spill15_11;
    float[] spill15_12;
    float[] spill15_13;
    float[] spill15_14;
    float[] spill15_15;
    float[] spill15_16;
    float[] spill15_17;
    float[] spill15_18;
    float[] spill15_19;
    float[] spill15_20;
    float[] spill15_21;
    float[] spill15_22;
    float[] spill15_23;
    net.minecraft.entity.Entity[] spill15_24;
    float[] spill15_25;
    float[] spill15_26;
    float[] spill15_27;
    float[] spill15_28;
    float[] spill15_29;
    float[] spill15_30;
    float[] spill15_31;
    float[] spill15_32;
    float[] spill15_33;
    float[] spill15_34;
    float[] spill15_35;
    float[] spill15_36;
    float[] spill15_37;
    float[] spill15_38;
    float[] spill15_39;
    float[] spill15_40;
    float[] spill15_41;
    float[] spill15_42;
    float[] spill15_43;
    float[] spill15_44;
    float[] spill15_45;
    float[] spill15_46;
    float[] spill15_47;
    float[] spill15_48;
    float[] spill15_49;
    float[] spill15_50;
    float[] spill15_51;
    float[] spill15_52;
    float[] spill15_53;
    float[] spill15_54;
    float[] spill15_55;
    float[] spill15_56;
    float[] spill15_57;
    float[] spill15_58;
    float[] spill15_59;
    float[] spill15_60;
    float[] spill15_61;
    float[] spill15_62;
    float[] spill15_63;
    float[] spill15_64;
    float[] spill15_65;
    float[] spill15_66;
    float[] spill15_67;
    float[] spill15_68;
    float[] spill15_69;
    float[] spill15_70;
    float[] spill15_71;
    float[] spill15_72;
    net.minecraft.entity.monster.EntityGuardian spill15_73;
    long life8_3;
    net.minecraft.entity.monster.EntityGuardian life11_6;
    float life12_12;
    float[] life13_103;
    float[] life14_182;
    float[] life15_262;
    float[] life16_341;
    float[] life17_420;
    net.minecraft.entity.Entity[] life10_421;
    float[] life18_500;
    float life19_508;
    int life20_510;
    net.minecraft.entity.Entity life20_633;
    moom.DR life21_658;
    moom.DR life22_662;
    double life23_668;
    moom.DR life25_694;
    moom.DR life25_703;
    moom.DR life26_721;
    double life27_725;
    float life21_747;
    forest_join_718: {
    forest_join_670: {
    forest_join_666: {
    forest_join_664: {
    forest_join_641: {
    forest_join_637: {
    forest_join_636: {
    forest_join_625: {
    forest_join_621: {
    life8_3 = (moom.jb.m ^ 97928181947687L);
    life11_6 = ((net.minecraft.entity.monster.EntityGuardian)(p6));
    life12_12 = (p2 - ((float) ((net.minecraft.entity.monster.EntityGuardian)(life11_6)).S));
    ((moom.jD)(this.i)).i = ((float)((p3 / 0x1.ca5dcp5f)));
    ((moom.jD)(this.i)).h = ((float)((p4 / 0x1.ca5dcp5f)));
    float[] __stackOp15_8_0 = new float[__sourceIntrinsic_9ae3c8defce5_invokedynamic15_7(29858, (5506420283204198028L ^ life8_3))];
    spill15_0 = __stackOp15_8_0;
    (__stackOp15_8_0)[0] = 0x1.cp0f;
    float[] __stackOp15_9_0 = spill15_0;
    spill15_1 = __stackOp15_9_0;
    (__stackOp15_9_0)[1] = 0x1.0p-2f;
    float[] __stackOp15_10_0 = spill15_1;
    spill15_2 = __stackOp15_10_0;
    (__stackOp15_10_0)[2] = 0x0.0p0f;
    float[] __stackOp15_11_0 = spill15_2;
    spill15_3 = __stackOp15_11_0;
    (__stackOp15_11_0)[3] = 0x0.0p0f;
    float[] __stackOp15_12_0 = spill15_3;
    spill15_4 = __stackOp15_12_0;
    (__stackOp15_12_0)[4] = 0x1.0p-1f;
    float[] __stackOp15_13_0 = spill15_4;
    spill15_5 = __stackOp15_13_0;
    (__stackOp15_13_0)[5] = 0x1.0p-1f;
    float[] __stackOp15_14_0 = spill15_5;
    spill15_6 = __stackOp15_14_0;
    (__stackOp15_14_0)[__sourceIntrinsic_9ae3c8defce5_invokedynamic15_15(18413, (1487960096235417032L ^ life8_3))] = 0x1.0p-1f;
    float[] __stackOp15_16_0 = spill15_6;
    spill15_7 = __stackOp15_16_0;
    (__stackOp15_16_0)[__sourceIntrinsic_9ae3c8defce5_invokedynamic15_17(25170, (8967487231415142503L ^ life8_3))] = 0x1.0p-1f;
    float[] __stackOp15_18_0 = spill15_7;
    spill15_8 = __stackOp15_18_0;
    (__stackOp15_18_0)[__sourceIntrinsic_9ae3c8defce5_invokedynamic15_19(6617, (2327536472531350498L ^ life8_3))] = 0x1.4p0f;
    float[] __stackOp15_20_0 = spill15_8;
    spill15_9 = __stackOp15_20_0;
    (__stackOp15_20_0)[__sourceIntrinsic_9ae3c8defce5_invokedynamic15_21(15859, (8136107714528417730L ^ life8_3))] = 0x1.8p-1f;
    float[] __stackOp15_22_0 = spill15_9;
    spill15_10 = __stackOp15_22_0;
    (__stackOp15_22_0)[__sourceIntrinsic_9ae3c8defce5_invokedynamic15_23(29462, (9163011116742465828L ^ life8_3))] = 0x0.0p0f;
    float[] __stackOp15_24_0 = spill15_10;
    spill15_11 = __stackOp15_24_0;
    (__stackOp15_24_0)[__sourceIntrinsic_9ae3c8defce5_invokedynamic15_25(14401, (8660495781217014391L ^ life8_3))] = 0x0.0p0f;
    life13_103 = spill15_11;
    float[] __stackOp15_27_0 = new float[__sourceIntrinsic_9ae3c8defce5_invokedynamic15_26(1890, (3348512039747562833L ^ life8_3))];
    spill15_12 = __stackOp15_27_0;
    (__stackOp15_27_0)[0] = 0x0.0p0f;
    float[] __stackOp15_28_0 = spill15_12;
    spill15_13 = __stackOp15_28_0;
    (__stackOp15_28_0)[1] = 0x0.0p0f;
    float[] __stackOp15_29_0 = spill15_13;
    spill15_14 = __stackOp15_29_0;
    (__stackOp15_29_0)[2] = 0x0.0p0f;
    float[] __stackOp15_30_0 = spill15_14;
    spill15_15 = __stackOp15_30_0;
    (__stackOp15_30_0)[3] = 0x0.0p0f;
    float[] __stackOp15_31_0 = spill15_15;
    spill15_16 = __stackOp15_31_0;
    (__stackOp15_31_0)[4] = 0x1.0p-2f;
    float[] __stackOp15_32_0 = spill15_16;
    spill15_17 = __stackOp15_32_0;
    (__stackOp15_32_0)[5] = 0x1.cp0f;
    float[] __stackOp15_33_0 = spill15_17;
    spill15_18 = __stackOp15_33_0;
    (__stackOp15_33_0)[__sourceIntrinsic_9ae3c8defce5_invokedynamic15_34(12978, (3099645385428801693L ^ life8_3))] = 0x1.4p0f;
    float[] __stackOp15_35_0 = spill15_18;
    spill15_19 = __stackOp15_35_0;
    (__stackOp15_35_0)[__sourceIntrinsic_9ae3c8defce5_invokedynamic15_36(27157, (8435743135973654577L ^ life8_3))] = 0x1.8p-1f;
    float[] __stackOp15_37_0 = spill15_19;
    spill15_20 = __stackOp15_37_0;
    (__stackOp15_37_0)[__sourceIntrinsic_9ae3c8defce5_invokedynamic15_38(30004, (484829047268368153L ^ life8_3))] = 0x0.0p0f;
    float[] __stackOp15_39_0 = spill15_20;
    spill15_21 = __stackOp15_39_0;
    (__stackOp15_39_0)[__sourceIntrinsic_9ae3c8defce5_invokedynamic15_40(29426, (6152326338200197317L ^ life8_3))] = 0x0.0p0f;
    float[] __stackOp15_41_0 = spill15_21;
    spill15_22 = __stackOp15_41_0;
    (__stackOp15_41_0)[__sourceIntrinsic_9ae3c8defce5_invokedynamic15_42(10441, (497795628372099823L ^ life8_3))] = 0x0.0p0f;
    float[] __stackOp15_43_0 = spill15_22;
    spill15_23 = __stackOp15_43_0;
    (__stackOp15_43_0)[__sourceIntrinsic_9ae3c8defce5_invokedynamic15_44(24004, (327557451709511676L ^ life8_3))] = 0x0.0p0f;
    life14_182 = spill15_23;
    spill15_24 = moom.iQ.b();
    float[] __stackOp15_47_0 = new float[__sourceIntrinsic_9ae3c8defce5_invokedynamic15_46(1890, (3348512039747562833L ^ life8_3))];
    spill15_25 = __stackOp15_47_0;
    (__stackOp15_47_0)[0] = 0x0.0p0f;
    float[] __stackOp15_48_0 = spill15_25;
    spill15_26 = __stackOp15_48_0;
    (__stackOp15_48_0)[1] = 0x0.0p0f;
    float[] __stackOp15_49_0 = spill15_26;
    spill15_27 = __stackOp15_49_0;
    (__stackOp15_49_0)[2] = 0x1.0p-2f;
    float[] __stackOp15_50_0 = spill15_27;
    spill15_28 = __stackOp15_50_0;
    (__stackOp15_50_0)[3] = 0x1.cp0f;
    float[] __stackOp15_51_0 = spill15_28;
    spill15_29 = __stackOp15_51_0;
    (__stackOp15_51_0)[4] = 0x0.0p0f;
    float[] __stackOp15_52_0 = spill15_29;
    spill15_30 = __stackOp15_52_0;
    (__stackOp15_52_0)[5] = 0x0.0p0f;
    float[] __stackOp15_53_0 = spill15_30;
    spill15_31 = __stackOp15_53_0;
    (__stackOp15_53_0)[__sourceIntrinsic_9ae3c8defce5_invokedynamic15_54(12978, (3099645385428801693L ^ life8_3))] = 0x0.0p0f;
    float[] __stackOp15_55_0 = spill15_31;
    spill15_32 = __stackOp15_55_0;
    (__stackOp15_55_0)[__sourceIntrinsic_9ae3c8defce5_invokedynamic15_56(27157, (8435743135973654577L ^ life8_3))] = 0x0.0p0f;
    float[] __stackOp15_57_0 = spill15_32;
    spill15_33 = __stackOp15_57_0;
    (__stackOp15_57_0)[__sourceIntrinsic_9ae3c8defce5_invokedynamic15_58(30004, (484829047268368153L ^ life8_3))] = 0x0.0p0f;
    float[] __stackOp15_59_0 = spill15_33;
    spill15_34 = __stackOp15_59_0;
    (__stackOp15_59_0)[__sourceIntrinsic_9ae3c8defce5_invokedynamic15_60(29426, (6152326338200197317L ^ life8_3))] = 0x0.0p0f;
    float[] __stackOp15_61_0 = spill15_34;
    spill15_35 = __stackOp15_61_0;
    (__stackOp15_61_0)[__sourceIntrinsic_9ae3c8defce5_invokedynamic15_62(10441, (497795628372099823L ^ life8_3))] = 0x1.8p-1f;
    float[] __stackOp15_63_0 = spill15_35;
    spill15_36 = __stackOp15_63_0;
    (__stackOp15_63_0)[__sourceIntrinsic_9ae3c8defce5_invokedynamic15_64(24004, (327557451709511676L ^ life8_3))] = 0x1.4p0f;
    life15_262 = spill15_36;
    float[] __stackOp15_66_0 = new float[__sourceIntrinsic_9ae3c8defce5_invokedynamic15_65(1890, (3348512039747562833L ^ life8_3))];
    spill15_37 = __stackOp15_66_0;
    (__stackOp15_66_0)[0] = 0x0.0p0f;
    float[] __stackOp15_67_0 = spill15_37;
    spill15_38 = __stackOp15_67_0;
    (__stackOp15_67_0)[1] = 0x0.0p0f;
    float[] __stackOp15_68_0 = spill15_38;
    spill15_39 = __stackOp15_68_0;
    (__stackOp15_68_0)[2] = 0x1.0p3f;
    float[] __stackOp15_69_0 = spill15_39;
    spill15_40 = __stackOp15_69_0;
    (__stackOp15_69_0)[3] = -0x1.0p3f;
    float[] __stackOp15_70_0 = spill15_40;
    spill15_41 = __stackOp15_70_0;
    (__stackOp15_70_0)[4] = -0x1.0p3f;
    float[] __stackOp15_71_0 = spill15_41;
    spill15_42 = __stackOp15_71_0;
    (__stackOp15_71_0)[5] = 0x1.0p3f;
    float[] __stackOp15_72_0 = spill15_42;
    spill15_43 = __stackOp15_72_0;
    (__stackOp15_72_0)[__sourceIntrinsic_9ae3c8defce5_invokedynamic15_73(12978, (3099645385428801693L ^ life8_3))] = 0x1.0p3f;
    float[] __stackOp15_74_0 = spill15_43;
    spill15_44 = __stackOp15_74_0;
    (__stackOp15_74_0)[__sourceIntrinsic_9ae3c8defce5_invokedynamic15_75(27157, (8435743135973654577L ^ life8_3))] = -0x1.0p3f;
    float[] __stackOp15_76_0 = spill15_44;
    spill15_45 = __stackOp15_76_0;
    (__stackOp15_76_0)[__sourceIntrinsic_9ae3c8defce5_invokedynamic15_77(30004, (484829047268368153L ^ life8_3))] = 0x0.0p0f;
    float[] __stackOp15_78_0 = spill15_45;
    spill15_46 = __stackOp15_78_0;
    (__stackOp15_78_0)[__sourceIntrinsic_9ae3c8defce5_invokedynamic15_79(29426, (6152326338200197317L ^ life8_3))] = 0x0.0p0f;
    float[] __stackOp15_80_0 = spill15_46;
    spill15_47 = __stackOp15_80_0;
    (__stackOp15_80_0)[__sourceIntrinsic_9ae3c8defce5_invokedynamic15_81(10441, (497795628372099823L ^ life8_3))] = 0x1.0p3f;
    float[] __stackOp15_82_0 = spill15_47;
    spill15_48 = __stackOp15_82_0;
    (__stackOp15_82_0)[__sourceIntrinsic_9ae3c8defce5_invokedynamic15_83(24004, (327557451709511676L ^ life8_3))] = -0x1.0p3f;
    life16_341 = spill15_48;
    float[] __stackOp15_85_0 = new float[__sourceIntrinsic_9ae3c8defce5_invokedynamic15_84(1890, (3348512039747562833L ^ life8_3))];
    spill15_49 = __stackOp15_85_0;
    (__stackOp15_85_0)[0] = -0x1.0p3f;
    float[] __stackOp15_86_0 = spill15_49;
    spill15_50 = __stackOp15_86_0;
    (__stackOp15_86_0)[1] = -0x1.0p3f;
    float[] __stackOp15_87_0 = spill15_50;
    spill15_51 = __stackOp15_87_0;
    (__stackOp15_87_0)[2] = -0x1.0p3f;
    float[] __stackOp15_88_0 = spill15_51;
    spill15_52 = __stackOp15_88_0;
    (__stackOp15_88_0)[3] = -0x1.0p3f;
    float[] __stackOp15_89_0 = spill15_52;
    spill15_53 = __stackOp15_89_0;
    (__stackOp15_89_0)[4] = 0x0.0p0f;
    float[] __stackOp15_90_0 = spill15_53;
    spill15_54 = __stackOp15_90_0;
    (__stackOp15_90_0)[5] = 0x0.0p0f;
    float[] __stackOp15_91_0 = spill15_54;
    spill15_55 = __stackOp15_91_0;
    (__stackOp15_91_0)[__sourceIntrinsic_9ae3c8defce5_invokedynamic15_92(12978, (3099645385428801693L ^ life8_3))] = 0x0.0p0f;
    float[] __stackOp15_93_0 = spill15_55;
    spill15_56 = __stackOp15_93_0;
    (__stackOp15_93_0)[__sourceIntrinsic_9ae3c8defce5_invokedynamic15_94(27157, (8435743135973654577L ^ life8_3))] = 0x0.0p0f;
    float[] __stackOp15_95_0 = spill15_56;
    spill15_57 = __stackOp15_95_0;
    (__stackOp15_95_0)[__sourceIntrinsic_9ae3c8defce5_invokedynamic15_96(30004, (484829047268368153L ^ life8_3))] = 0x1.0p3f;
    float[] __stackOp15_97_0 = spill15_57;
    spill15_58 = __stackOp15_97_0;
    (__stackOp15_97_0)[__sourceIntrinsic_9ae3c8defce5_invokedynamic15_98(29426, (6152326338200197317L ^ life8_3))] = 0x1.0p3f;
    float[] __stackOp15_99_0 = spill15_58;
    spill15_59 = __stackOp15_99_0;
    (__stackOp15_99_0)[__sourceIntrinsic_9ae3c8defce5_invokedynamic15_100(10441, (497795628372099823L ^ life8_3))] = 0x1.0p3f;
    float[] __stackOp15_101_0 = spill15_59;
    spill15_60 = __stackOp15_101_0;
    (__stackOp15_101_0)[__sourceIntrinsic_9ae3c8defce5_invokedynamic15_102(24004, (327557451709511676L ^ life8_3))] = 0x1.0p3f;
    life17_420 = spill15_60;
    life10_421 = spill15_24;
    float[] __stackOp15_104_0 = new float[__sourceIntrinsic_9ae3c8defce5_invokedynamic15_103(1890, (3348512039747562833L ^ life8_3))];
    spill15_61 = __stackOp15_104_0;
    (__stackOp15_104_0)[0] = 0x1.0p3f;
    float[] __stackOp15_105_0 = spill15_61;
    spill15_62 = __stackOp15_105_0;
    (__stackOp15_105_0)[1] = -0x1.0p3f;
    float[] __stackOp15_106_0 = spill15_62;
    spill15_63 = __stackOp15_106_0;
    (__stackOp15_106_0)[2] = 0x0.0p0f;
    float[] __stackOp15_107_0 = spill15_63;
    spill15_64 = __stackOp15_107_0;
    (__stackOp15_107_0)[3] = 0x0.0p0f;
    float[] __stackOp15_108_0 = spill15_64;
    spill15_65 = __stackOp15_108_0;
    (__stackOp15_108_0)[4] = -0x1.0p3f;
    float[] __stackOp15_109_0 = spill15_65;
    spill15_66 = __stackOp15_109_0;
    (__stackOp15_109_0)[5] = -0x1.0p3f;
    float[] __stackOp15_110_0 = spill15_66;
    spill15_67 = __stackOp15_110_0;
    (__stackOp15_110_0)[__sourceIntrinsic_9ae3c8defce5_invokedynamic15_111(12978, (3099645385428801693L ^ life8_3))] = 0x1.0p3f;
    float[] __stackOp15_112_0 = spill15_67;
    spill15_68 = __stackOp15_112_0;
    (__stackOp15_112_0)[__sourceIntrinsic_9ae3c8defce5_invokedynamic15_113(27157, (8435743135973654577L ^ life8_3))] = 0x1.0p3f;
    float[] __stackOp15_114_0 = spill15_68;
    spill15_69 = __stackOp15_114_0;
    (__stackOp15_114_0)[__sourceIntrinsic_9ae3c8defce5_invokedynamic15_115(30004, (484829047268368153L ^ life8_3))] = 0x1.0p3f;
    float[] __stackOp15_116_0 = spill15_69;
    spill15_70 = __stackOp15_116_0;
    (__stackOp15_116_0)[__sourceIntrinsic_9ae3c8defce5_invokedynamic15_117(29426, (6152326338200197317L ^ life8_3))] = -0x1.0p3f;
    float[] __stackOp15_118_0 = spill15_70;
    spill15_71 = __stackOp15_118_0;
    (__stackOp15_118_0)[__sourceIntrinsic_9ae3c8defce5_invokedynamic15_119(10441, (497795628372099823L ^ life8_3))] = 0x0.0p0f;
    float[] __stackOp15_120_0 = spill15_71;
    spill15_72 = __stackOp15_120_0;
    (__stackOp15_120_0)[__sourceIntrinsic_9ae3c8defce5_invokedynamic15_121(24004, (327557451709511676L ^ life8_3))] = 0x0.0p0f;
    life18_500 = spill15_72;
    life19_508 = ((0x1.0p0f - ((net.minecraft.entity.monster.EntityGuardian)(life11_6)).d__sourceReturn_f6c4892e39(((float)(life12_12)))) * 0x1.19999ap-1f);
    life20_510 = 0;
    forest_cycle_511: while (true) {
    if (!((life20_510 < __sourceIntrinsic_9ae3c8defce5_invokedynamic15_123(1890, (3348512039747562833L ^ life8_3))))) {
        break forest_join_621;
    }
    ((moom.jD)((this.k)[life20_510])).h = ((float)((0x1.921fb6p1f * (life13_103)[life20_510])));
    ((moom.jD)((this.k)[life20_510])).i = ((float)((0x1.921fb6p1f * (life14_182)[life20_510])));
    ((moom.jD)((this.k)[life20_510])).j = ((float)((0x1.921fb6p1f * (life15_262)[life20_510])));
    ((moom.jD)((this.k)[life20_510])).e = ((float)(((life16_341)[life20_510] * ((0x1.0p0f + (moom.Dr.b(((float)(((p2 * 0x1.8p0f) + ((float) life20_510))))) * 0x1.47ae14p-7f)) - life19_508))));
    ((moom.jD)((this.k)[life20_510])).f = ((float)((0x1.0p4f + ((life17_420)[life20_510] * ((0x1.0p0f + (moom.Dr.b(((float)(((p2 * 0x1.8p0f) + ((float) life20_510))))) * 0x1.47ae14p-7f)) - life19_508)))));
    ((moom.jD)((this.k)[life20_510])).g = ((float)(((life18_500)[life20_510] * ((0x1.0p0f + (moom.Dr.b(((float)(((p2 * 0x1.8p0f) + ((float) life20_510))))) * 0x1.47ae14p-7f)) - life19_508))));
    life20_510 += 1;
    if (!((life10_421 != null))) {
        break forest_join_625;
    }
    if (!((life10_421 == null))) {
        continue forest_cycle_511;
    }
    break forest_cycle_511;
    }
    }
    ((moom.jD)(this.j)).g = ((float)(-0x1.08p3f));
    }
    life20_633 = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__r3();
    spill15_73 = life11_6;
    if (!((life10_421 != null))) {
        forestValue15_637_0 = spill15_73;
        break forest_join_637;
    }
    if (!(((net.minecraft.entity.monster.EntityGuardian)(spill15_73)).ae())) {
        break forest_join_636;
    }
    life20_633 = ((net.minecraft.entity.monster.EntityGuardian)(life11_6)).e__sG();
    }
    forestValue15_637_0 = life20_633;
    }
    if (!((life10_421 != null))) {
        forestValue15_641_0 = forestValue15_637_0;
        break forest_join_641;
    }
    if (!((forestValue15_637_0 != null))) {
        break forest_join_718;
    }
    forestValue15_641_0 = life20_633;
    }
    life21_658 = ((net.minecraft.entity.Entity)(forestValue15_641_0)).b(((float)(0x0.0p0f)));
    life22_662 = ((net.minecraft.entity.Entity)(p6)).b(((float)(0x0.0p0f)));
    life23_668 = (((moom.DR)(life21_658)).b - ((moom.DR)(life22_662)).b);
    if (!((life10_421 != null))) {
        break forest_join_664;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(life23_668)), ((double)(0x0.0p0d))) > 0))) {
        break forest_join_666;
    }
    ((moom.jD)(this.j)).f = ((float)(0x0.0p0f));
    }
    if (!((life10_421 == null))) {
        break forest_join_670;
    }
    }
    ((moom.jD)(this.j)).f = ((float)(0x1.0p0f));
    }
    life25_694 = ((net.minecraft.entity.Entity)(p6)).a__DR(((float)(0x0.0p0f)));
    life25_703 = new moom.DR(((moom.DR)(life25_694)).a, 0x0.0p0d, ((moom.DR)(life25_694)).c);
    life26_721 = ((moom.DR)(((moom.DR)(new moom.DR((((moom.DR)(life22_662)).a - ((moom.DR)(life21_658)).a), 0x0.0p0d, (((moom.DR)(life22_662)).c - ((moom.DR)(life21_658)).c)))).a__DR())).b(((float)(0x1.921fb6p0f)));
    life27_725 = ((moom.DR)(life25_703)).a(((moom.DR)(life26_721)));
    ((moom.jD)(this.j)).e = ((float)(((moom.Dr.c(((float)(((float) java.lang.Math.abs(((double)(life27_725))))))) * 0x1.0p1f) * ((float) java.lang.Math.signum(((double)(life27_725)))))));
    }
    ((moom.jD)(this.j)).n = ((boolean)(true));
    life21_747 = ((net.minecraft.entity.monster.EntityGuardian)(life11_6)).c__sourceReturn_f6c4892e39(((float)(life12_12)));
    ((moom.jD)((this.l)[0])).i = ((float)(((moom.Dr.a(((float)(life21_747))) * 0x1.921fb6p1f) * 0x1.99999ap-5f)));
    ((moom.jD)((this.l)[1])).i = ((float)(((moom.Dr.a(((float)(life21_747))) * 0x1.921fb6p1f) * 0x1.99999ap-4f)));
    ((moom.jD)((this.l)[1])).e = ((float)(-0x1.8p0f));
    ((moom.jD)((this.l)[1])).f = ((float)(0x1.0p-1f));
    ((moom.jD)((this.l)[1])).g = ((float)(0x1.cp3f));
    ((moom.jD)((this.l)[2])).i = ((float)(((moom.Dr.a(((float)(life21_747))) * 0x1.921fb6p1f) * 0x1.333334p-3f)));
    ((moom.jD)((this.l)[2])).e = ((float)(0x1.0p-1f));
    ((moom.jD)((this.l)[2])).f = ((float)(0x1.0p-1f));
    ((moom.jD)((this.l)[2])).g = ((float)(0x1.8p2f));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_71(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_77(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_79(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_89(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_95(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_107(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_113(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_117(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_121(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_126(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_128(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_132(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_136(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_138(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_143(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_96e16a7b86abcdd2_originalDynamicSite681_145(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8aebf151eadb_originalDynamicSite1530_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ae3c8defce5_invokedynamic15_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ae3c8defce5_invokedynamic15_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ae3c8defce5_invokedynamic15_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ae3c8defce5_invokedynamic15_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ae3c8defce5_invokedynamic15_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ae3c8defce5_invokedynamic15_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ae3c8defce5_invokedynamic15_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ae3c8defce5_invokedynamic15_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ae3c8defce5_invokedynamic15_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ae3c8defce5_invokedynamic15_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ae3c8defce5_invokedynamic15_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ae3c8defce5_invokedynamic15_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ae3c8defce5_invokedynamic15_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ae3c8defce5_invokedynamic15_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ae3c8defce5_invokedynamic15_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ae3c8defce5_invokedynamic15_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ae3c8defce5_invokedynamic15_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ae3c8defce5_invokedynamic15_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ae3c8defce5_invokedynamic15_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ae3c8defce5_invokedynamic15_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ae3c8defce5_invokedynamic15_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ae3c8defce5_invokedynamic15_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ae3c8defce5_invokedynamic15_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ae3c8defce5_invokedynamic15_75(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ae3c8defce5_invokedynamic15_77(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ae3c8defce5_invokedynamic15_79(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ae3c8defce5_invokedynamic15_81(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ae3c8defce5_invokedynamic15_83(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ae3c8defce5_invokedynamic15_84(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ae3c8defce5_invokedynamic15_92(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ae3c8defce5_invokedynamic15_94(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ae3c8defce5_invokedynamic15_96(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ae3c8defce5_invokedynamic15_98(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ae3c8defce5_invokedynamic15_100(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ae3c8defce5_invokedynamic15_102(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ae3c8defce5_invokedynamic15_103(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ae3c8defce5_invokedynamic15_111(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ae3c8defce5_invokedynamic15_113(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ae3c8defce5_invokedynamic15_115(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ae3c8defce5_invokedynamic15_117(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ae3c8defce5_invokedynamic15_119(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ae3c8defce5_invokedynamic15_121(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9ae3c8defce5_invokedynamic15_123(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8159_0() throws E;
}
