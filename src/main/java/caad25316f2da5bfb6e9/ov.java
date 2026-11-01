package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class ov extends net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer<net.minecraft.tileentity.TileEntityEndPortal> {

private static moom.DD f;

private static moom.DD g;

private static java.util.Random h;

java.nio.FloatBuffer i;

private static long j;

private static long[] k;

private static java.lang.Integer[] l;

private static java.util.Map m;

private static long[] n;

private static java.lang.Long[] o;

private static java.util.Map p;

public ov() { super(); }


private static void __sourceConstructorBody_016c5780346d2e2b(moom.ov receiver) throws Throwable {

long local1 = (moom.ov.j ^ 61413272276002L);

    moom.ov.__sourceConstructorInit_016c5780346d2e2b_0(((moom.ov)(receiver)));

    ((moom.ov)(receiver)).i = ((java.nio.FloatBuffer)(net.minecraft.client.renderer.GLAllocation.a__FloatBuffer(((int)(__sourceIntrinsic_016c5780346d2e2b_originalDynamicSite3177_2(29116, (566625141842275237L ^ local1)))))));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_016c5780346d2e2b_0(moom.ov a0) throws E;

static {
j = ((long)(((moom._a)(moom._c.a(((long)(6231426824516211386L)), ((long)(-9170246945509772455L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(200122911355431L)))));
    long local22_life6 = (moom.ov.j ^ 130128071351283L);
    m = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local11_life9;
    javax.crypto.Cipher __sourceSpill957_11 = (local11_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill957_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill957_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill957_14 = new byte[8];
    (__sourceSpill957_14)[0] = ((byte) ((int) (local22_life6 >>> 56)));
    int local12_life15 = 1;
    while ((local12_life15 < 8)) {
        (__sourceSpill957_14)[local12_life15] = ((byte) ((int) ((local22_life6 << (local12_life15 * 8)) >>> 56)));
        local12_life15 += 1;
    }
    byte[] __sourcePreallocation957_16 = __sourceSpill957_14;
    ((javax.crypto.Cipher)(__sourceSpill957_11)).init(((int)(__sourceSpill957_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill957_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation957_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local17_life19 = new long[15];
    int local14_life20 = 0;
    java.lang.String local15_life21;
    int local16_life23 = ((java.lang.String)((local15_life21 = "ÏZ\023ý\007\034ï\nW?<\024µcWºìCÏc^½d¡Q¨é0Ñ¤»aÇt¦\0074;'è\rA¬Úpd_\177È{Ò\b¬J2¼âvXíK¤µsÅYÿ\026QíÖÓ1d|mSQD;l?wî}Ê$k\034\b_ð"))).length();
    int local13_life24 = 0;
    do {
        java.lang.String __sourceSpill957_25 = local15_life21;
        int __sourceSpill957_26 = local13_life24;
        local13_life24 += 8;
        byte[] local18_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill957_25)).substring(((int)(__sourceSpill957_26)), ((int)(local13_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill957_30 = local17_life19;
        int __sourceSpill957_31 = local14_life20;
        local14_life20 += 1;
        long local19_life32 = (((((((((((long) (local18_life29)[0]) & 255L) << 56) | ((((long) (local18_life29)[1]) & 255L) << 48)) | ((((long) (local18_life29)[2]) & 255L) << 40)) | ((((long) (local18_life29)[3]) & 255L) << 32)) | ((((long) (local18_life29)[4]) & 255L) << 24)) | ((((long) (local18_life29)[5]) & 255L) << 16)) | ((((long) (local18_life29)[6]) & 255L) << 8)) | (((long) (local18_life29)[7]) & 255L));
        byte[] __sourceSpill957_33 = new byte[8];
        (__sourceSpill957_33)[0] = ((byte) ((int) (local19_life32 >>> 56)));
        (__sourceSpill957_33)[1] = ((byte) ((int) (local19_life32 >>> 48)));
        (__sourceSpill957_33)[2] = ((byte) ((int) (local19_life32 >>> 40)));
        (__sourceSpill957_33)[3] = ((byte) ((int) (local19_life32 >>> 32)));
        (__sourceSpill957_33)[4] = ((byte) ((int) (local19_life32 >>> 24)));
        (__sourceSpill957_33)[5] = ((byte) ((int) (local19_life32 >>> 16)));
        (__sourceSpill957_33)[6] = ((byte) ((int) (local19_life32 >>> 8)));
        (__sourceSpill957_33)[7] = ((byte) ((int) local19_life32));
        javax.crypto.Cipher __sourceSpill957_34 = local11_life9;
        byte[] local21_life36 = ((javax.crypto.Cipher)(__sourceSpill957_34)).doFinal(((byte[])(__sourceSpill957_33)));
        (__sourceSpill957_30)[__sourceSpill957_31] = (((((((((((long) (local21_life36)[0]) & 255L) << 56) | ((((long) (local21_life36)[1]) & 255L) << 48)) | ((((long) (local21_life36)[2]) & 255L) << 40)) | ((((long) (local21_life36)[3]) & 255L) << 32)) | ((((long) (local21_life36)[4]) & 255L) << 24)) | ((((long) (local21_life36)[5]) & 255L) << 16)) | ((((long) (local21_life36)[6]) & 255L) << 8)) | (((long) (local21_life36)[7]) & 255L));
    } while ((!(local13_life24 >= local16_life23)));
    local16_life23 = ((java.lang.String)((local15_life21 = "Èl\033\001T|\024áúÑ\001ò"))).length();
    local13_life24 = 0;
    do {
        java.lang.String __sourceSpill957_38 = local15_life21;
        int __sourceSpill957_39 = local13_life24;
        local13_life24 += 8;
        byte[] local18_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill957_38)).substring(((int)(__sourceSpill957_39)), ((int)(local13_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill957_43 = local17_life19;
        int __sourceSpill957_44 = local14_life20;
        local14_life20 += 1;
        long local19_life45 = (((((((((((long) (local18_life42)[0]) & 255L) << 56) | ((((long) (local18_life42)[1]) & 255L) << 48)) | ((((long) (local18_life42)[2]) & 255L) << 40)) | ((((long) (local18_life42)[3]) & 255L) << 32)) | ((((long) (local18_life42)[4]) & 255L) << 24)) | ((((long) (local18_life42)[5]) & 255L) << 16)) | ((((long) (local18_life42)[6]) & 255L) << 8)) | (((long) (local18_life42)[7]) & 255L));
        byte[] __sourceSpill957_46 = new byte[8];
        (__sourceSpill957_46)[0] = ((byte) ((int) (local19_life45 >>> 56)));
        (__sourceSpill957_46)[1] = ((byte) ((int) (local19_life45 >>> 48)));
        (__sourceSpill957_46)[2] = ((byte) ((int) (local19_life45 >>> 40)));
        (__sourceSpill957_46)[3] = ((byte) ((int) (local19_life45 >>> 32)));
        (__sourceSpill957_46)[4] = ((byte) ((int) (local19_life45 >>> 24)));
        (__sourceSpill957_46)[5] = ((byte) ((int) (local19_life45 >>> 16)));
        (__sourceSpill957_46)[6] = ((byte) ((int) (local19_life45 >>> 8)));
        (__sourceSpill957_46)[7] = ((byte) ((int) local19_life45));
        javax.crypto.Cipher __sourceSpill957_47 = local11_life9;
        byte[] local21_life49 = ((javax.crypto.Cipher)(__sourceSpill957_47)).doFinal(((byte[])(__sourceSpill957_46)));
        (__sourceSpill957_43)[__sourceSpill957_44] = (((((((((((long) (local21_life49)[0]) & 255L) << 56) | ((((long) (local21_life49)[1]) & 255L) << 48)) | ((((long) (local21_life49)[2]) & 255L) << 40)) | ((((long) (local21_life49)[3]) & 255L) << 32)) | ((((long) (local21_life49)[4]) & 255L) << 24)) | ((((long) (local21_life49)[5]) & 255L) << 16)) | ((((long) (local21_life49)[6]) & 255L) << 8)) | (((long) (local21_life49)[7]) & 255L));
    } while ((!(local13_life24 >= local16_life23)));
    k = ((long[])(local17_life19));
    l = ((java.lang.Integer[])(new java.lang.Integer[15]));
    p = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life54;
    javax.crypto.Cipher __sourceSpill957_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill957_57 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill957_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill957_59 = new byte[8];
    (__sourceSpill957_59)[0] = ((byte) ((int) (local22_life6 >>> 56)));
    int local1_life60 = 1;
    while ((local1_life60 < 8)) {
        (__sourceSpill957_59)[local1_life60] = ((byte) ((int) ((local22_life6 << (local1_life60 * 8)) >>> 56)));
        local1_life60 += 1;
    }
    byte[] __sourcePreallocation957_61 = __sourceSpill957_59;
    ((javax.crypto.Cipher)(__sourceSpill957_56)).init(((int)(__sourceSpill957_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill957_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation957_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life64 = new long[3];
    int local3_life65 = 0;
    java.lang.String local4_life66;
    int local5_life68 = ((java.lang.String)((local4_life66 = "\005i\027\003è§\n'QZ´i¸\001\002VØkç\003© "))).length();
    int local2_life69 = 0;
    do {
        java.lang.String __sourceSpill957_70 = local4_life66;
        int __sourceSpill957_71 = local2_life69;
        local2_life69 += 8;
        byte[] local7_life74 = ((java.lang.String)(((java.lang.String)(__sourceSpill957_70)).substring(((int)(__sourceSpill957_71)), ((int)(local2_life69))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill957_75 = local6_life64;
        int __sourceSpill957_76 = local3_life65;
        local3_life65 += 1;
        long local8_life77 = (((((((((((long) (local7_life74)[0]) & 255L) << 56) | ((((long) (local7_life74)[1]) & 255L) << 48)) | ((((long) (local7_life74)[2]) & 255L) << 40)) | ((((long) (local7_life74)[3]) & 255L) << 32)) | ((((long) (local7_life74)[4]) & 255L) << 24)) | ((((long) (local7_life74)[5]) & 255L) << 16)) | ((((long) (local7_life74)[6]) & 255L) << 8)) | (((long) (local7_life74)[7]) & 255L));
        byte[] __sourceSpill957_78 = new byte[8];
        (__sourceSpill957_78)[0] = ((byte) ((int) (local8_life77 >>> 56)));
        (__sourceSpill957_78)[1] = ((byte) ((int) (local8_life77 >>> 48)));
        (__sourceSpill957_78)[2] = ((byte) ((int) (local8_life77 >>> 40)));
        (__sourceSpill957_78)[3] = ((byte) ((int) (local8_life77 >>> 32)));
        (__sourceSpill957_78)[4] = ((byte) ((int) (local8_life77 >>> 24)));
        (__sourceSpill957_78)[5] = ((byte) ((int) (local8_life77 >>> 16)));
        (__sourceSpill957_78)[6] = ((byte) ((int) (local8_life77 >>> 8)));
        (__sourceSpill957_78)[7] = ((byte) ((int) local8_life77));
        javax.crypto.Cipher __sourceSpill957_79 = local0_life54;
        byte[] local10_life81 = ((javax.crypto.Cipher)(__sourceSpill957_79)).doFinal(((byte[])(__sourceSpill957_78)));
        (__sourceSpill957_75)[__sourceSpill957_76] = (((((((((((long) (local10_life81)[0]) & 255L) << 56) | ((((long) (local10_life81)[1]) & 255L) << 48)) | ((((long) (local10_life81)[2]) & 255L) << 40)) | ((((long) (local10_life81)[3]) & 255L) << 32)) | ((((long) (local10_life81)[4]) & 255L) << 24)) | ((((long) (local10_life81)[5]) & 255L) << 16)) | ((((long) (local10_life81)[6]) & 255L) << 8)) | (((long) (local10_life81)[7]) & 255L));
    } while ((!(local2_life69 >= local5_life68)));
    n = ((long[])(local6_life64));
    o = ((java.lang.Long[])(new java.lang.Long[3]));
    f = ((moom.DD)(new moom.DD("textures/environment/end_sky.png")));
    g = ((moom.DD)(new moom.DD("textures/entity/end_portal.png")));
    h = ((java.util.Random)(new java.util.Random(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite957_86(5685, (2204113453843609638L ^ local22_life6)))));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8617_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/ov"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 16928);
    if (((moom.ov.o)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (moom.ov.n)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(moom.ov.p)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.ov.p)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/ov", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (moom.ov.o)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((moom.ov.o)[life3_8])).longValue();
}


private static long b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = moom.ov.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 8695;
      if (l[var3] == null) {
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
         long var5 = k[var3];
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
         Object[] var9 = (Object[])m.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               m.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/ov", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         l[var3] = var15;
      }

      return l[var3];
}


public void a(net.minecraft.tileentity.TileEntityEndPortal p0, double p1, double p2, double p3, float p4, int p5) {
int spill1264_0;
    long spill1264_1;
    int spill1264_2;
    long spill1264_3;
    int spill1264_4;
    long spill1264_5;
    long life10_3;
    float life12_22;
    float life13_27;
    float life14_32;
    float life15_42;
    int life16_44;
    float life17_61;
    float life18_63;
    float life19_69;
    float life20_117;
    float life21_123;
    float life22_131;
    float life23_135;
    float life23_143;
    float life21_306;
    net.minecraft.client.renderer.Tessellator life24_325;
    moom.lw life25_328;
    float life26_345;
    float life27_354;
    float life28_363;
    lexical_join_454: {
    lexical_join_444: {
    lexical_join_15: {
    life10_3 = (moom.ov.j ^ 39088304575044L);
    if (!(moom.BU.ap())) {
        break lexical_join_15;
    }
    if (!((!moom.MR.a(((net.minecraft.tileentity.TileEntityEndPortal)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((int)(p5)), ((float)(0x1.8p-1f)))))) {
        break lexical_join_454;
    }
    }
    life12_22 = ((float) ((moom.oo)(this.b)).l);
    life13_27 = ((float) ((moom.oo)(this.b)).m);
    life14_32 = ((float) ((moom.oo)(this.b)).n);
    moom.kZ.f();
    ((java.util.Random)(moom.ov.h)).setSeed(((long)(__sourceIntrinsic_6c7be7c4bb88_invokedynamic1264_11(20668, (1693396258858350362L ^ life10_3)))));
    life15_42 = 0x1.8p-1f;
    life16_44 = 0;
    lexical_cycle_42: while (true) {
    lexical_join_366: {
    lexical_join_105: {
    lexical_join_96: {
    lexical_join_90: {
    if (!((life16_44 < __sourceIntrinsic_6c7be7c4bb88_invokedynamic1264_13(10217, (8996778413996647322L ^ life10_3))))) {
        break lexical_join_444;
    }
    moom.kZ.B();
    life17_61 = ((float) (__sourceIntrinsic_6c7be7c4bb88_invokedynamic1264_15(29116, (566638567646131651L ^ life10_3)) - life16_44));
    life18_63 = 0x1.0p-4f;
    life19_69 = (0x1.0p0f / (life17_61 + 0x1.0p0f));
    if (!((life16_44 == 0))) {
        break lexical_join_90;
    }
    ((moom.ov)(this)).b(((moom.DD)(moom.ov.f)));
    spill1264_0 = 8931;
    life19_69 = 0x1.99999ap-4f;
    spill1264_1 = (8477930781213501081L ^ life10_3);
    life17_61 = 0x1.04p6f;
    life18_63 = 0x1.0p-3f;
    moom.kZ.l();
    moom.kZ.b(((int)(__sourceIntrinsic_6c7be7c4bb88_invokedynamic1264_19(spill1264_0, spill1264_1))), ((int)(__sourceIntrinsic_6c7be7c4bb88_invokedynamic1264_20(4239, (1069079929564337394L ^ life10_3)))));
    }
    if (!((life16_44 >= 1))) {
        break lexical_join_96;
    }
    ((moom.ov)(this)).b(((moom.DD)(moom.ov.g)));
    }
    if (!((life16_44 == 1))) {
        break lexical_join_105;
    }
    moom.kZ.l();
    moom.kZ.b(((int)(1)), ((int)(1)));
    life18_63 = 0x1.0p-1f;
    }
    life20_117 = ((float) (-(p2 + ((double) life15_42))));
    life21_123 = (life20_117 + ((float) ((moom.DR)(net.minecraft.client.renderer.ActiveRenderInfo.a__DR())).b));
    life22_131 = ((life20_117 + life17_61) + ((float) ((moom.DR)(net.minecraft.client.renderer.ActiveRenderInfo.a__DR())).b));
    life23_135 = (life21_123 / life22_131);
    life23_143 = (((float) (p2 + ((double) life15_42))) + life23_135);
    moom.kZ.b(((float)(life12_22)), ((float)(life23_143)), ((float)(life14_32)));
    moom.kZ.a(((moom.aE)(moom.aE.S)), ((int)(__sourceIntrinsic_6c7be7c4bb88_invokedynamic1264_32(16675, (2263840909114951002L ^ life10_3)))));
    moom.kZ.a(((moom.aE)(moom.aE.T)), ((int)(__sourceIntrinsic_6c7be7c4bb88_invokedynamic1264_35(19414, (6174433561058168740L ^ life10_3)))));
    moom.kZ.a(((moom.aE)(moom.aE.R)), ((int)(__sourceIntrinsic_6c7be7c4bb88_invokedynamic1264_38(19414, (6174433561058168740L ^ life10_3)))));
    moom.kZ.a(((moom.aE)(moom.aE.Q)), ((int)(__sourceIntrinsic_6c7be7c4bb88_invokedynamic1264_41(28456, (9165975233081305945L ^ life10_3)))));
    moom.kZ.a(((moom.aE)(moom.aE.S)), ((int)(__sourceIntrinsic_6c7be7c4bb88_invokedynamic1264_44(21573, (8466825920971657267L ^ life10_3)))), ((java.nio.FloatBuffer)(((moom.ov)(this)).a(((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f))))));
    moom.kZ.a(((moom.aE)(moom.aE.T)), ((int)(__sourceIntrinsic_6c7be7c4bb88_invokedynamic1264_48(1189, (2137382360534843601L ^ life10_3)))), ((java.nio.FloatBuffer)(((moom.ov)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f))))));
    moom.kZ.a(((moom.aE)(moom.aE.R)), ((int)(__sourceIntrinsic_6c7be7c4bb88_invokedynamic1264_52(1189, (2137382360534843601L ^ life10_3)))), ((java.nio.FloatBuffer)(((moom.ov)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f))))));
    moom.kZ.a(((moom.aE)(moom.aE.Q)), ((int)(__sourceIntrinsic_6c7be7c4bb88_invokedynamic1264_56(6646, (3999574419638787462L ^ life10_3)))), ((java.nio.FloatBuffer)(((moom.ov)(this)).a(((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f))))));
    spill1264_2 = 4548;
    moom.kZ.a__Void(((moom.aE)(moom.aE.S)));
    spill1264_3 = (8320246382231393713L ^ life10_3);
    moom.kZ.a__Void(((moom.aE)(moom.aE.T)));
    moom.kZ.a__Void(((moom.aE)(moom.aE.R)));
    moom.kZ.a__Void(((moom.aE)(moom.aE.Q)));
    moom.kZ.C();
    moom.kZ.l(((int)(__sourceIntrinsic_6c7be7c4bb88_invokedynamic1264_68(spill1264_2, spill1264_3))));
    moom.kZ.B();
    moom.kZ.A();
    moom.kZ.b(((float)(0x0.0p0f)), ((float)((((float) (net.minecraft.client.Minecraft.a__Long() % __sourceIntrinsic_6c7be7c4bb88_invokedynamic1264_73(3822, (2398863367219669321L ^ life10_3)))) / 0x1.55ccp19f))), ((float)(0x0.0p0f)));
    moom.kZ.a(((float)(life18_63)), ((float)(life18_63)), ((float)(life18_63)));
    moom.kZ.b(((float)(0x1.0p-1f)), ((float)(0x1.0p-1f)), ((float)(0x0.0p0f)));
    moom.kZ.b(((float)((((float) (((life16_44 * life16_44) * __sourceIntrinsic_6c7be7c4bb88_invokedynamic1264_77(14652, (8631976957089725760L ^ life10_3))) + (life16_44 * __sourceIntrinsic_6c7be7c4bb88_invokedynamic1264_78(19282, (5798592441921457961L ^ life10_3))))) * 0x1.0p1f))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    moom.kZ.b(((float)(-0x1.0p-1f)), ((float)(-0x1.0p-1f)), ((float)(0x0.0p0f)));
    moom.kZ.b(((float)((-life12_22))), ((float)((-life14_32))), ((float)((-life13_27))));
    life21_306 = (life20_117 + ((float) ((moom.DR)(net.minecraft.client.renderer.ActiveRenderInfo.a__DR())).b));
    moom.kZ.b(((float)(((((float) ((moom.DR)(net.minecraft.client.renderer.ActiveRenderInfo.a__DR())).a) * life17_61) / life21_306))), ((float)(((((float) ((moom.DR)(net.minecraft.client.renderer.ActiveRenderInfo.a__DR())).c) * life17_61) / life21_306))), ((float)((-life13_27))));
    life24_325 = net.minecraft.client.renderer.Tessellator.a();
    life25_328 = ((net.minecraft.client.renderer.Tessellator)(life24_325)).a__lw();
    ((moom.lw)(life25_328)).a(((int)(__sourceIntrinsic_6c7be7c4bb88_invokedynamic1264_91(7707, (7985136055797586540L ^ life10_3)))), ((moom.oD)(moom.oB.h)));
    life26_345 = (((((java.util.Random)(moom.ov.h)).nextFloat() * 0x1.0p-1f) + 0x1.99999ap-4f) * life19_69);
    life27_354 = (((((java.util.Random)(moom.ov.h)).nextFloat() * 0x1.0p-1f) + 0x1.99999ap-2f) * life19_69);
    life28_363 = (((((java.util.Random)(moom.ov.h)).nextFloat() * 0x1.0p-1f) + 0x1.0p-1f) * life19_69);
    if (!((life16_44 == 0))) {
        break lexical_join_366;
    }
    life26_345 = (life27_354 = (life28_363 = life19_69));
    }
    ((moom.lw)(((moom.lw)(((moom.lw)(life25_328)).a(((double)(p1)), ((double)((p2 + ((double) life15_42)))), ((double)(p3))))).a(((float)(life26_345)), ((float)(life27_354)), ((float)(life28_363)), ((float)(0x1.0p0f))))).c__Void();
    spill1264_4 = 10662;
    ((moom.lw)(((moom.lw)(((moom.lw)(life25_328)).a(((double)(p1)), ((double)((p2 + ((double) life15_42)))), ((double)((p3 + 0x1.0p0d)))))).a(((float)(life26_345)), ((float)(life27_354)), ((float)(life28_363)), ((float)(0x1.0p0f))))).c__Void();
    spill1264_5 = (6265324198780415454L ^ life10_3);
    ((moom.lw)(((moom.lw)(((moom.lw)(life25_328)).a(((double)((p1 + 0x1.0p0d))), ((double)((p2 + ((double) life15_42)))), ((double)((p3 + 0x1.0p0d)))))).a(((float)(life26_345)), ((float)(life27_354)), ((float)(life28_363)), ((float)(0x1.0p0f))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(life25_328)).a(((double)((p1 + 0x1.0p0d))), ((double)((p2 + ((double) life15_42)))), ((double)(p3))))).a(((float)(life26_345)), ((float)(life27_354)), ((float)(life28_363)), ((float)(0x1.0p0f))))).c__Void();
    ((net.minecraft.client.renderer.Tessellator)(life24_325)).a__Void();
    moom.kZ.C();
    moom.kZ.l(((int)(__sourceIntrinsic_6c7be7c4bb88_invokedynamic1264_114(spill1264_4, spill1264_5))));
    ((moom.ov)(this)).b(((moom.DD)(moom.ov.f)));
    life16_44 += 1;
    continue lexical_cycle_42;
    }
    }
    moom.kZ.k();
    moom.kZ.b(((moom.aE)(moom.aE.S)));
    moom.kZ.b(((moom.aE)(moom.aE.T)));
    moom.kZ.b(((moom.aE)(moom.aE.R)));
    moom.kZ.b(((moom.aE)(moom.aE.Q)));
    moom.kZ.e();
    }
    return;
}


private java.nio.FloatBuffer a(float p0, float p1, float p2, float p3) {
((java.nio.FloatBuffer)(this.i)).clear();
    ((java.nio.FloatBuffer)(((java.nio.FloatBuffer)(((java.nio.FloatBuffer)(((java.nio.FloatBuffer)(this.i)).put(((float)(p0))))).put(((float)(p1))))).put(((float)(p2))))).put(((float)(p3)));
    ((java.nio.FloatBuffer)(this.i)).flip();
    return this.i;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8620_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/ov"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.ov.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static native <E extends Throwable> int __sourceIntrinsic_016c5780346d2e2b_originalDynamicSite3177_2(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_eb8803ad1f63_originalDynamicSite957_86(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8617_0() throws E;

private static native <E extends Throwable> long __sourceIntrinsic_6c7be7c4bb88_invokedynamic1264_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6c7be7c4bb88_invokedynamic1264_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6c7be7c4bb88_invokedynamic1264_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6c7be7c4bb88_invokedynamic1264_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6c7be7c4bb88_invokedynamic1264_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6c7be7c4bb88_invokedynamic1264_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6c7be7c4bb88_invokedynamic1264_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6c7be7c4bb88_invokedynamic1264_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6c7be7c4bb88_invokedynamic1264_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6c7be7c4bb88_invokedynamic1264_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6c7be7c4bb88_invokedynamic1264_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6c7be7c4bb88_invokedynamic1264_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6c7be7c4bb88_invokedynamic1264_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6c7be7c4bb88_invokedynamic1264_68(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_6c7be7c4bb88_invokedynamic1264_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6c7be7c4bb88_invokedynamic1264_77(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6c7be7c4bb88_invokedynamic1264_78(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6c7be7c4bb88_invokedynamic1264_91(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6c7be7c4bb88_invokedynamic1264_114(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8620_0() throws E;
}
