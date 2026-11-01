package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class FL extends moom.FI {

private float[] e;

private static long f;

private static long[] g;

private static java.lang.Integer[] h;

private static java.util.Map i;

public FL() { super(); }


private static void __sourceConstructorBody_f22d2f4f03f4b5c2(moom.FL receiver) throws Throwable {

long local1 = (moom.FL.f ^ 77250563642545L);

    moom.FL.__sourceConstructorInit_f22d2f4f03f4b5c2_0(((moom.FL)(receiver)));

    ((moom.FL)(receiver)).e = ((float[])(new float[__sourceIntrinsic_f22d2f4f03f4b5c2_originalDynamicSite2004_2(5956, (3631960554887251346L ^ local1))]));

    return;

}



static {
f = ((long)(((moom._a)(moom._c.a(((long)(7421471052162363329L)), ((long)(4073340478505846776L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(189031007413886L)))));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.FL.f ^ 107900131334676L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill743_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill743_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill743_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill743_14 = new byte[8];
    (__sourceSpill743_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill743_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation743_16 = __sourceSpill743_14;
    ((javax.crypto.Cipher)(__sourceSpill743_11)).init(((int)(__sourceSpill743_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill743_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation743_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[13];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ÃðêA¦\036»z¦YP>ÝÙ\022óí¼?j»\rÚÑE\026¶zfB4þ\006ÎØÒ#l`fãÏðwáÊF\027à\031C&/æ°KðÜ\003Ò¨c\030×z\0019ÇM._\032\017åëÎ×\006ð"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill743_25 = local6_life21;
        int __sourceSpill743_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill743_25)).substring(((int)(__sourceSpill743_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill743_30 = local8_life19;
        int __sourceSpill743_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill743_33 = new byte[8];
        (__sourceSpill743_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill743_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill743_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill743_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill743_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill743_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill743_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill743_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill743_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill743_34)).doFinal(((byte[])(__sourceSpill743_33)));
        (__sourceSpill743_30)[__sourceSpill743_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "JTR\027ø\005è±\036U7mý\031ÍÌ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill743_38 = local6_life21;
        int __sourceSpill743_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill743_38)).substring(((int)(__sourceSpill743_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill743_43 = local8_life19;
        int __sourceSpill743_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill743_46 = new byte[8];
        (__sourceSpill743_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill743_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill743_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill743_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill743_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill743_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill743_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill743_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill743_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill743_47)).doFinal(((byte[])(__sourceSpill743_46)));
        (__sourceSpill743_43)[__sourceSpill743_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    g = ((long[])(local8_life19));
    h = ((java.lang.Integer[])(new java.lang.Integer[13]));
}

private static native <E extends Throwable> void __sourceConstructorInit_f22d2f4f03f4b5c2_0(moom.FL a0) throws E;

private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4495_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/FL"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.FL.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 24217;
      if (h[var3] == null) {
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
         long var5 = g[var3];
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
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/FL", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
}


protected void a(long p0, int p1, int p2, moom.Fm p3, double p4, double p5, double p6, float p7, float p8, float p9, int p10, int p11, double p12) {
int forestValue900071_73_0;
    int forestValue900071_81_0;
    int forestValue900071_81_1;
    int forestValue900071_105_0;
    int forestValue900071_128_0;
    int forestValue900071_128_1;
    double forestValue900071_257_0;
    int forestValue900071_302_0;
    int forestValue900071_314_0;
    int forestValue900071_326_0;
    int forestValue900071_338_0;
    int forestValue900071_355_0;
    int forestValue900071_422_0;
    int forestValue900071_438_0;
    int forestValue900071_438_1;
    int forestValue900071_451_0;
    int forestValue900071_451_1;
    int forestValue900071_459_0;
    int forestValue900071_465_0;
    int forestValue900071_480_0;
    int forestValue900071_505_0;
    int forestValue900071_505_1;
    int forestValue900071_519_0;
    int forestValue900071_523_0;
    net.minecraft.block.Block forestValue900071_543_0;
    int forestValue900071_556_0;
    int forestValue900071_556_1;
    int forestValue900071_563_0;
    int forestValue900071_563_1;
    int forestValue900071_568_0;
    int forestValue900071_568_1;
    int forestValue900071_577_0;
    int forestValue900071_577_1;
    int forestValue900071_579_0;
    int forestValue900071_590_0;
    int forestValue900071_598_0;
    int forestValue900071_622_0;
    net.minecraft.block.Block forestValue900071_718_0;
    net.minecraft.block.Block forestValue900071_718_1;
    net.minecraft.block.Block forestValue900071_726_0;
    net.minecraft.block.Block forestValue900071_726_1;
    net.minecraft.block.Block forestValue900071_729_0;
    int forestValue900071_761_0;
    moom.Fm forestValue900071_802_0;
    int forestValue900071_802_1;
    int forestValue900071_802_2;
    int forestValue900071_802_3;
    int forestValue900071_818_0;
    int forestValue900071_827_0;
    int forestValue900071_828_0;
    int forestValue900071_828_1;
    double forestValue900071_957_0;
    int forestValue900071_1002_0;
    int forestValue900071_1014_0;
    int forestValue900071_1026_0;
    int forestValue900071_1038_0;
    int forestValue900071_1055_0;
    int forestValue900071_1122_0;
    int forestValue900071_1138_0;
    int forestValue900071_1138_1;
    int forestValue900071_1151_0;
    int forestValue900071_1151_1;
    int forestValue900071_1159_0;
    int forestValue900071_1165_0;
    int forestValue900071_1180_0;
    int forestValue900071_1205_0;
    int forestValue900071_1205_1;
    int forestValue900071_1219_0;
    int forestValue900071_1223_0;
    net.minecraft.block.Block forestValue900071_1243_0;
    int forestValue900071_1256_0;
    int forestValue900071_1256_1;
    int forestValue900071_1263_0;
    int forestValue900071_1263_1;
    int forestValue900071_1268_0;
    int forestValue900071_1268_1;
    int forestValue900071_1277_0;
    int forestValue900071_1277_1;
    int forestValue900071_1279_0;
    int forestValue900071_1290_0;
    int forestValue900071_1298_0;
    int forestValue900071_1322_0;
    net.minecraft.block.Block forestValue900071_1418_0;
    net.minecraft.block.Block forestValue900071_1418_1;
    net.minecraft.block.Block forestValue900071_1426_0;
    net.minecraft.block.Block forestValue900071_1426_1;
    net.minecraft.block.Block forestValue900071_1429_0;
    int forestValue900071_1461_0;
    moom.Fm forestValue900071_1502_0;
    int forestValue900071_1502_1;
    int forestValue900071_1502_2;
    int forestValue900071_1502_3;
    int forestValue900071_1518_0;
    java.lang.String[] spill900071_0;
    int spill900071_1;
    int spill900071_2;
    int spill900071_3;
    int spill900071_4;
    double spill900071_5;
    int spill900071_6;
    int spill900071_7;
    int spill900071_8;
    int spill900071_9;
    int spill900071_10;
    int spill900071_11;
    int spill900071_12;
    int spill900071_13;
    int spill900071_14;
    int spill900071_15;
    net.minecraft.block.Block spill900071_16;
    int spill900071_17;
    int spill900071_18;
    int spill900071_19;
    int spill900071_20;
    int spill900071_21;
    int spill900071_22;
    net.minecraft.block.Block spill900071_23;
    moom.dC spill900071_24;
    net.minecraft.block.Block spill900071_25;
    int spill900071_26;
    moom.Fm spill900071_27;
    int spill900071_28;
    int spill900071_29;
    int spill900071_30;
    double spill900071_31;
    int spill900071_32;
    int spill900071_33;
    int spill900071_34;
    int spill900071_35;
    int spill900071_36;
    int spill900071_37;
    int spill900071_38;
    int spill900071_39;
    int spill900071_40;
    int spill900071_41;
    net.minecraft.block.Block spill900071_42;
    int spill900071_43;
    int spill900071_44;
    int spill900071_45;
    int spill900071_46;
    int spill900071_47;
    int spill900071_48;
    net.minecraft.block.Block spill900071_49;
    moom.dC spill900071_50;
    net.minecraft.block.Block spill900071_51;
    int spill900071_52;
    moom.Fm spill900071_53;
    int spill900071_54;
    int spill900071_55;
    int spill900071_56;
    int spill900071_57;
    long life19_3;
    java.util.Random life22_8;
    double life23_24;
    java.lang.String[] life21_25;
    double life25_40;
    float life27_42;
    float life28_44;
    int life29_66;
    int life29_78;
    float life30_96;
    int life31_98;
    double life31_168;
    double life33_172;
    double life31_182;
    double life33_192;
    float life35_195;
    float life36_198;
    float life14_226;
    float life28_242;
    float life27_246;
    double life37_286;
    double life39_290;
    double life41_295;
    double life43_302;
    int life45_402;
    int life46_417;
    int life47_424;
    int life48_431;
    int life49_446;
    int life50_461;
    int life51_556;
    int life52_558;
    int life53_575;
    int life54_595;
    net.minecraft.block.state.IBlockState life55_635;
    moom.DU life52_727;
    int life53_729;
    double life54_752;
    int life56_757;
    double life57_780;
    int life59_782;
    int life60_802;
    double life61_818;
    net.minecraft.block.state.IBlockState life63_856;
    double life31_1035;
    double life33_1039;
    double life31_1049;
    double life33_1059;
    float life35_1062;
    float life36_1065;
    float life14_1093;
    float life28_1109;
    float life27_1113;
    double life37_1153;
    double life39_1157;
    double life41_1162;
    double life43_1169;
    int life45_1269;
    int life46_1284;
    int life47_1291;
    int life48_1298;
    int life49_1313;
    int life50_1328;
    int life51_1423;
    int life52_1425;
    int life53_1442;
    int life54_1462;
    net.minecraft.block.state.IBlockState life55_1502;
    moom.DU life52_1594;
    int life53_1596;
    double life54_1619;
    int life56_1624;
    double life57_1647;
    int life59_1649;
    int life60_1669;
    double life61_1685;
    net.minecraft.block.state.IBlockState life63_1723;
    forest_join_1528: {
    forest_join_1527: {
    forest_join_827: {
    forest_join_826: {
    forest_join_825: {
    forest_join_126: {
    forest_join_85: {
    forest_join_81: {
    forest_join_73: {
    forest_join_72: {
    life19_3 = (moom.FL.f ^ 12998844869489L);
    life22_8 = new java.util.Random(p0);
    spill900071_0 = moom.FI.b();
    life23_24 = ((double) ((p1 * __sourceIntrinsic_d03aecf46012_invokedynamic900071_2(28527, (4676531136734200438L ^ life19_3))) + __sourceIntrinsic_d03aecf46012_invokedynamic900071_3(29675, (6235814062580801264L ^ life19_3))));
    life21_25 = spill900071_0;
    life25_40 = ((double) ((p2 * __sourceIntrinsic_d03aecf46012_invokedynamic900071_4(28527, (4676531136734200438L ^ life19_3))) + __sourceIntrinsic_d03aecf46012_invokedynamic900071_5(29675, (6235814062580801264L ^ life19_3))));
    life27_42 = 0x0.0p0f;
    life28_44 = 0x0.0p0f;
    spill900071_1 = p11;
    if (!((life21_25 != null))) {
        forestValue900071_73_0 = spill900071_1;
        break forest_join_73;
    }
    if (!((spill900071_1 <= 0))) {
        break forest_join_72;
    }
    life29_66 = ((this.a * __sourceIntrinsic_d03aecf46012_invokedynamic900071_7(28527, (4676531136734200438L ^ life19_3))) - __sourceIntrinsic_d03aecf46012_invokedynamic900071_8(28527, (4676531136734200438L ^ life19_3)));
    p11 = (life29_66 - ((java.util.Random)(life22_8)).nextInt(((int)((life29_66 / 4)))));
    }
    forestValue900071_73_0 = 0;
    }
    life29_78 = forestValue900071_73_0;
    spill900071_2 = p10;
    spill900071_3 = -1;
    if (!((life21_25 != null))) {
        forestValue900071_81_0 = spill900071_2;
        forestValue900071_81_1 = spill900071_3;
        break forest_join_81;
    }
    if (!((spill900071_2 == spill900071_3))) {
        break forest_join_85;
    }
    forestValue900071_81_0 = p11;
    forestValue900071_81_1 = 2;
    }
    p10 = (forestValue900071_81_0 / forestValue900071_81_1);
    life29_78 = 1;
    }
    life30_96 = 0x1.0p0f;
    life31_98 = 0;
    forest_cycle_89: while (true) {
    forest_join_116: {
    forest_join_106: {
    forest_join_105: {
    if (!((life31_98 < __sourceIntrinsic_d03aecf46012_invokedynamic900071_10(4134, (2739207146577689910L ^ life19_3))))) {
        break forest_join_126;
    }
    spill900071_4 = life31_98;
    if (!((life21_25 != null))) {
        forestValue900071_827_0 = spill900071_4;
        break forest_join_827;
    }
    if (!((life21_25 != null))) {
        forestValue900071_105_0 = spill900071_4;
        break forest_join_105;
    }
    if (!((spill900071_4 != 0))) {
        break forest_join_106;
    }
    forestValue900071_105_0 = ((java.util.Random)(life22_8)).nextInt(((int)(3)));
    }
    if (!((forestValue900071_105_0 == 0))) {
        break forest_join_116;
    }
    }
    life30_96 = (0x1.0p0f + ((((java.util.Random)(life22_8)).nextFloat() * ((java.util.Random)(life22_8)).nextFloat()) * 0x1.0p0f));
    }
    (this.e)[life31_98] = (life30_96 * life30_96);
    life31_98 += 1;
    if (!((life21_25 == null))) {
        continue forest_cycle_89;
    }
    break forest_cycle_89;
    }
    }
    forest_cycle_126: while (true) {
    forest_join_821: {
    forest_join_818: {
    forest_join_817: {
    forest_join_590: {
    forest_join_589: {
    forestValue900071_128_0 = p10;
    forestValue900071_128_1 = p11;
    forest_cycle_128: while (true) {
    forest_join_480: {
    forest_join_479: {
    forest_join_465: {
    forest_join_464: {
    forest_join_459: {
    forest_join_458: {
    forest_join_451: {
    forest_join_443: {
    forest_join_438: {
    forest_join_436: {
    forest_join_422: {
    forest_join_421: {
    forest_join_355: {
    forest_join_338: {
    forest_join_326: {
    forest_join_314: {
    forest_join_302: {
    forest_join_293: {
    forest_join_257: {
    forest_join_254: {
    if (!((forestValue900071_128_0 < forestValue900071_128_1))) {
        break forest_join_1528;
    }
    life31_168 = (0x1.8p0d + ((double) ((moom.Dr.a(((float)(((((float) p10) * 0x1.921fb6p1f) / ((float) p11))))) * p7) * 0x1.0p0f)));
    life33_172 = (life31_168 * p12);
    life31_182 = (life31_168 * ((((double) ((java.util.Random)(life22_8)).nextFloat()) * 0x1.0p-2d) + 0x1.8p-1d));
    life33_192 = (life33_172 * ((((double) ((java.util.Random)(life22_8)).nextFloat()) * 0x1.0p-2d) + 0x1.8p-1d));
    life35_195 = moom.Dr.b(((float)(p9)));
    life36_198 = moom.Dr.a(((float)(p9)));
    p4 = (p4 + ((double) (moom.Dr.b(((float)(p8))) * life35_195)));
    p5 = (p5 + ((double) life36_198));
    spill900071_5 = (p6 + ((double) (moom.Dr.a(((float)(p8))) * life35_195)));
    if (!((life21_25 != null))) {
        forestValue900071_257_0 = spill900071_5;
        break forest_join_257;
    }
    p6 = spill900071_5;
    life14_226 = (p9 * 0x1.666666p-1f);
    p9 = (life14_226 + (life28_44 * 0x1.99999ap-5f));
    p8 = (p8 + (life27_42 * 0x1.99999ap-5f));
    life28_242 = (life28_44 * 0x1.99999ap-1f);
    life27_246 = (life27_42 * 0x1.0p-1f);
    life28_44 = (life28_242 + (((((java.util.Random)(life22_8)).nextFloat() - ((java.util.Random)(life22_8)).nextFloat()) * ((java.util.Random)(life22_8)).nextFloat()) * 0x1.0p1f));
    life27_42 = (life27_246 + (((((java.util.Random)(life22_8)).nextFloat() - ((java.util.Random)(life22_8)).nextFloat()) * ((java.util.Random)(life22_8)).nextFloat()) * 0x1.0p2f));
    if (!((life29_78 == 0))) {
        break forest_join_254;
    }
    if (!((((java.util.Random)(life22_8)).nextInt(((int)(4))) != 0))) {
        break forest_join_821;
    }
    }
    forestValue900071_257_0 = (p4 - life23_24);
    }
    life37_286 = forestValue900071_257_0;
    life39_290 = (p6 - life25_40);
    life41_295 = ((double) (p11 - p10));
    life43_302 = ((double) ((p7 + 0x1.0p1f) + 0x1.0p4f));
    spill900071_6 = recovery.source.CarrierOps.dcmpl(((double)((((life37_286 * life37_286) + (life39_290 * life39_290)) - (life41_295 * life41_295)))), ((double)((life43_302 * life43_302))));
    if (!((life21_25 != null))) {
        forestValue900071_302_0 = spill900071_6;
        break forest_join_302;
    }
    if (!((spill900071_6 > 0))) {
        break forest_join_293;
    }
    break forest_join_825;
    }
    forestValue900071_302_0 = recovery.source.CarrierOps.dcmpl(((double)(p4)), ((double)(((life23_24 - 0x1.0p4d) - (life31_182 * 0x1.0p1d)))));
    }
    if (!((life21_25 != null))) {
        forestValue900071_314_0 = forestValue900071_302_0;
        break forest_join_314;
    }
    if (!((forestValue900071_302_0 >= 0))) {
        break forest_join_821;
    }
    forestValue900071_314_0 = recovery.source.CarrierOps.dcmpl(((double)(p6)), ((double)(((life25_40 - 0x1.0p4d) - (life31_182 * 0x1.0p1d)))));
    }
    if (!((life21_25 != null))) {
        forestValue900071_326_0 = forestValue900071_314_0;
        break forest_join_326;
    }
    if (!((forestValue900071_314_0 >= 0))) {
        break forest_join_821;
    }
    forestValue900071_326_0 = recovery.source.CarrierOps.dcmpg(((double)(p4)), ((double)(((life23_24 + 0x1.0p4d) + (life31_182 * 0x1.0p1d)))));
    }
    if (!((life21_25 != null))) {
        forestValue900071_338_0 = forestValue900071_326_0;
        break forest_join_338;
    }
    if (!((forestValue900071_326_0 <= 0))) {
        break forest_join_821;
    }
    forestValue900071_338_0 = recovery.source.CarrierOps.dcmpg(((double)(p6)), ((double)(((life25_40 + 0x1.0p4d) + (life31_182 * 0x1.0p1d)))));
    }
    if (!((life21_25 != null))) {
        forestValue900071_355_0 = forestValue900071_338_0;
        break forest_join_355;
    }
    if (!((forestValue900071_338_0 <= 0))) {
        break forest_join_821;
    }
    forestValue900071_355_0 = ((moom.Dr.b__Int(((double)((p4 - life31_182)))) - (p1 * __sourceIntrinsic_d03aecf46012_invokedynamic900071_35(28527, (4676531136734200438L ^ life19_3)))) - 1);
    }
    life45_402 = forestValue900071_355_0;
    life46_417 = ((moom.Dr.b__Int(((double)((p4 + life31_182)))) - (p1 * __sourceIntrinsic_d03aecf46012_invokedynamic900071_37(28527, (4676531136734200438L ^ life19_3)))) + 1);
    life47_424 = (moom.Dr.b__Int(((double)((p5 - life33_192)))) - 1);
    life48_431 = (moom.Dr.b__Int(((double)((p5 + life33_192)))) + 1);
    life49_446 = ((moom.Dr.b__Int(((double)((p6 - life31_182)))) - (p2 * __sourceIntrinsic_d03aecf46012_invokedynamic900071_41(28527, (4676531136734200438L ^ life19_3)))) - 1);
    life50_461 = ((moom.Dr.b__Int(((double)((p6 + life31_182)))) - (p2 * __sourceIntrinsic_d03aecf46012_invokedynamic900071_43(28527, (4676531136734200438L ^ life19_3)))) + 1);
    spill900071_7 = life45_402;
    if (!((life21_25 != null))) {
        forestValue900071_422_0 = spill900071_7;
        break forest_join_422;
    }
    if (!((spill900071_7 < 0))) {
        break forest_join_421;
    }
    life45_402 = 0;
    }
    forestValue900071_422_0 = life46_417;
    }
    spill900071_8 = __sourceIntrinsic_d03aecf46012_invokedynamic900071_44(28527, (4676531136734200438L ^ life19_3));
    if (!((life21_25 != null))) {
        forestValue900071_438_0 = forestValue900071_422_0;
        forestValue900071_438_1 = spill900071_8;
        break forest_join_438;
    }
    if (!((forestValue900071_422_0 > spill900071_8))) {
        break forest_join_436;
    }
    life46_417 = __sourceIntrinsic_d03aecf46012_invokedynamic900071_45(28527, (4676531136734200438L ^ life19_3));
    }
    forestValue900071_438_0 = life47_424;
    forestValue900071_438_1 = 1;
    }
    if (!((life21_25 != null))) {
        forestValue900071_451_0 = forestValue900071_438_0;
        forestValue900071_451_1 = forestValue900071_438_1;
        break forest_join_451;
    }
    if (!((forestValue900071_438_0 < forestValue900071_438_1))) {
        break forest_join_443;
    }
    life47_424 = 1;
    }
    spill900071_9 = life48_431;
    if (!((life21_25 != null))) {
        forestValue900071_459_0 = spill900071_9;
        break forest_join_459;
    }
    forestValue900071_451_0 = spill900071_9;
    forestValue900071_451_1 = __sourceIntrinsic_d03aecf46012_invokedynamic900071_46(10786, (7780476534742730552L ^ life19_3));
    }
    if (!((forestValue900071_451_0 > forestValue900071_451_1))) {
        break forest_join_458;
    }
    life48_431 = __sourceIntrinsic_d03aecf46012_invokedynamic900071_47(11402, (6488349918373396895L ^ life19_3));
    }
    forestValue900071_459_0 = life49_446;
    }
    if (!((life21_25 != null))) {
        forestValue900071_465_0 = forestValue900071_459_0;
        break forest_join_465;
    }
    if (!((forestValue900071_459_0 < 0))) {
        break forest_join_464;
    }
    life49_446 = 0;
    }
    forestValue900071_465_0 = life50_461;
    }
    if (!((life21_25 != null))) {
        forestValue900071_480_0 = forestValue900071_465_0;
        break forest_join_480;
    }
    if (!((forestValue900071_465_0 > __sourceIntrinsic_d03aecf46012_invokedynamic900071_48(28527, (4676531136734200438L ^ life19_3))))) {
        break forest_join_479;
    }
    life50_461 = __sourceIntrinsic_d03aecf46012_invokedynamic900071_49(28527, (4676531136734200438L ^ life19_3));
    }
    forestValue900071_480_0 = 0;
    }
    life51_556 = forestValue900071_480_0;
    life52_558 = life45_402;
    forest_cycle_483: while (true) {
    forest_join_586: {
    if (!((life51_556 == 0))) {
        break forest_join_589;
    }
    spill900071_10 = life52_558;
    if (!((life21_25 != null))) {
        forestValue900071_590_0 = spill900071_10;
        break forest_join_590;
    }
    spill900071_11 = life46_417;
    if (!((life21_25 != null))) {
        forestValue900071_128_0 = spill900071_10;
        forestValue900071_128_1 = spill900071_11;
        continue forest_cycle_128;
    }
    if (!((spill900071_10 < spill900071_11))) {
        break forest_join_589;
    }
    life53_575 = life49_446;
    forest_cycle_494: while (true) {
    forest_join_583: {
    forest_join_505: {
    if (!((life51_556 == 0))) {
        break forest_join_586;
    }
    spill900071_12 = life53_575;
    spill900071_13 = life50_461;
    if (!((life21_25 != null))) {
        forestValue900071_128_0 = spill900071_12;
        forestValue900071_128_1 = spill900071_13;
        continue forest_cycle_128;
    }
    if (!((life21_25 != null))) {
        forestValue900071_505_0 = spill900071_12;
        forestValue900071_505_1 = spill900071_13;
        break forest_join_505;
    }
    if (!((spill900071_12 < spill900071_13))) {
        break forest_join_586;
    }
    forestValue900071_505_0 = life48_431;
    forestValue900071_505_1 = 1;
    }
    life54_595 = (forestValue900071_505_0 + forestValue900071_505_1);
    forest_cycle_507: while (true) {
    forest_join_580: {
    forest_join_579: {
    forest_join_577: {
    forest_join_568: {
    forest_join_563: {
    forest_join_556: {
    forest_join_547: {
    forest_join_545: {
    forest_join_543: {
    forest_join_523: {
    forest_join_519: {
    if (!((life51_556 == 0))) {
        break forest_join_583;
    }
    spill900071_14 = life54_595;
    if (!((life21_25 != null))) {
        forestValue900071_519_0 = spill900071_14;
        break forest_join_519;
    }
    spill900071_15 = (life47_424 - 1);
    if (!((life21_25 != null))) {
        forestValue900071_128_0 = spill900071_14;
        forestValue900071_128_1 = spill900071_15;
        continue forest_cycle_128;
    }
    if (!((spill900071_14 >= spill900071_15))) {
        break forest_join_583;
    }
    forestValue900071_519_0 = life54_595;
    }
    if (!((life21_25 != null))) {
        forestValue900071_523_0 = forestValue900071_519_0;
        break forest_join_523;
    }
    if (!((forestValue900071_519_0 >= 0))) {
        break forest_join_580;
    }
    forestValue900071_523_0 = life54_595;
    }
    if (!((forestValue900071_523_0 < __sourceIntrinsic_d03aecf46012_invokedynamic900071_50(20968, (3311775838393744624L ^ life19_3))))) {
        break forest_join_580;
    }
    life55_635 = ((moom.Fm)(p3)).a(((int)(life52_558)), ((int)(life54_595)), ((int)(life53_575)));
    spill900071_16 = ((net.minecraft.block.state.IBlockState)(life55_635)).a__ch();
    if (!((life21_25 != null))) {
        forestValue900071_543_0 = spill900071_16;
        break forest_join_543;
    }
    if (!((spill900071_16 != net.minecraft.init.Blocks.i))) {
        break forest_join_545;
    }
    forestValue900071_543_0 = ((net.minecraft.block.state.IBlockState)(life55_635)).a__ch();
    }
    if (!((forestValue900071_543_0 == net.minecraft.init.Blocks.j))) {
        break forest_join_547;
    }
    }
    life51_556 = 1;
    }
    spill900071_17 = life54_595;
    spill900071_18 = (life47_424 - 1);
    if (!((life21_25 != null))) {
        forestValue900071_556_0 = spill900071_17;
        forestValue900071_556_1 = spill900071_18;
        break forest_join_556;
    }
    if (!((spill900071_17 != spill900071_18))) {
        break forest_join_580;
    }
    forestValue900071_556_0 = life52_558;
    forestValue900071_556_1 = life45_402;
    }
    if (!((life21_25 != null))) {
        forestValue900071_563_0 = forestValue900071_556_0;
        forestValue900071_563_1 = forestValue900071_556_1;
        break forest_join_563;
    }
    if (!((forestValue900071_556_0 != forestValue900071_556_1))) {
        break forest_join_580;
    }
    forestValue900071_563_0 = life52_558;
    forestValue900071_563_1 = (life46_417 - 1);
    }
    if (!((life21_25 != null))) {
        forestValue900071_568_0 = forestValue900071_563_0;
        forestValue900071_568_1 = forestValue900071_563_1;
        break forest_join_568;
    }
    if (!((forestValue900071_563_0 != forestValue900071_563_1))) {
        break forest_join_580;
    }
    forestValue900071_568_0 = life53_575;
    forestValue900071_568_1 = life49_446;
    }
    if (!((life21_25 != null))) {
        forestValue900071_577_0 = forestValue900071_568_0;
        forestValue900071_577_1 = forestValue900071_568_1;
        break forest_join_577;
    }
    if (!((forestValue900071_568_0 != forestValue900071_568_1))) {
        break forest_join_580;
    }
    spill900071_19 = life53_575;
    if (!((life21_25 != null))) {
        forestValue900071_579_0 = spill900071_19;
        break forest_join_579;
    }
    forestValue900071_577_0 = spill900071_19;
    forestValue900071_577_1 = (life50_461 - 1);
    }
    if (!((forestValue900071_577_0 != forestValue900071_577_1))) {
        break forest_join_580;
    }
    forestValue900071_579_0 = life47_424;
    }
    life54_595 = forestValue900071_579_0;
    }
    life54_595 += -1;
    if (!((life21_25 == null))) {
        continue forest_cycle_507;
    }
    break forest_cycle_507;
    }
    }
    life53_575 += 1;
    if (!((life21_25 == null))) {
        continue forest_cycle_494;
    }
    break forest_cycle_494;
    }
    }
    life52_558 += 1;
    if (!((life21_25 == null))) {
        continue forest_cycle_483;
    }
    break forest_cycle_483;
    }
    break forest_cycle_128;
    }
    }
    forestValue900071_590_0 = life51_556;
    }
    if (!((forestValue900071_590_0 == 0))) {
        break forest_join_821;
    }
    life52_727 = new moom.DU();
    life53_729 = life45_402;
    forest_cycle_597: while (true) {
    forest_join_814: {
    forestValue900071_598_0 = life53_729;
    forest_cycle_598: while (true) {
    if (!((forestValue900071_598_0 < life46_417))) {
        break forest_join_817;
    }
    life54_752 = (((((double) (life53_729 + (p1 * __sourceIntrinsic_d03aecf46012_invokedynamic900071_56(28527, (4676531136734200438L ^ life19_3))))) + 0x1.0p-1d) - p4) / life31_182);
    spill900071_20 = life49_446;
    if (!((life21_25 != null))) {
        forestValue900071_818_0 = spill900071_20;
        break forest_join_818;
    }
    life56_757 = spill900071_20;
    forest_cycle_621: while (true) {
    forest_join_812: {
    forest_join_811: {
    forestValue900071_622_0 = life56_757;
    forest_cycle_622: while (true) {
    if (!((forestValue900071_622_0 < life50_461))) {
        break forest_join_814;
    }
    life57_780 = (((((double) (life56_757 + (p2 * __sourceIntrinsic_d03aecf46012_invokedynamic900071_57(28527, (4676531136734200438L ^ life19_3))))) + 0x1.0p-1d) - p6) / life31_182);
    life59_782 = 0;
    if (!((life21_25 != null))) {
        break forest_join_812;
    }
    spill900071_21 = recovery.source.CarrierOps.dcmpg(((double)(((life54_752 * life54_752) + (life57_780 * life57_780)))), ((double)(0x1.0p0d)));
    if (!((life21_25 != null))) {
        forestValue900071_598_0 = spill900071_21;
        continue forest_cycle_598;
    }
    if (!((spill900071_21 < 0))) {
        break forest_join_811;
    }
    life60_802 = life48_431;
    forest_cycle_659: while (true) {
    forest_join_809: {
    forest_join_808: {
    forest_join_802: {
    forest_join_761: {
    forest_join_751: {
    forest_join_731: {
    forest_join_729: {
    forest_join_726: {
    forest_join_718: {
    forest_join_715: {
    if (!((life60_802 > life47_424))) {
        break forest_join_811;
    }
    life61_818 = (((((double) (life60_802 - 1)) + 0x1.0p-1d) - p5) / life33_192);
    if (!((life21_25 != null))) {
        break forest_join_809;
    }
    spill900071_22 = recovery.source.CarrierOps.dcmpg(((double)(((((life54_752 * life54_752) + (life57_780 * life57_780)) * ((double) (this.e)[(life60_802 - 1)])) + ((life61_818 * life61_818) / 0x1.8p2d)))), ((double)(0x1.0p0d)));
    if (!((life21_25 != null))) {
        forestValue900071_622_0 = spill900071_22;
        continue forest_cycle_622;
    }
    if (!((spill900071_22 < 0))) {
        break forest_join_808;
    }
    life63_856 = ((moom.Fm)(p3)).a(((int)(life53_729)), ((int)(life60_802)), ((int)(life56_757)));
    spill900071_23 = ((net.minecraft.block.state.IBlockState)(life63_856)).a__ch();
    spill900071_24 = net.minecraft.init.Blocks.c;
    if (!((life21_25 != null))) {
        forestValue900071_718_0 = spill900071_23;
        forestValue900071_718_1 = spill900071_24;
        break forest_join_718;
    }
    if (!((spill900071_23 == spill900071_24))) {
        break forest_join_715;
    }
    life59_782 = 1;
    }
    forestValue900071_718_0 = ((net.minecraft.block.state.IBlockState)(life63_856)).a__ch();
    forestValue900071_718_1 = net.minecraft.init.Blocks.b;
    }
    if (!((life21_25 != null))) {
        forestValue900071_726_0 = forestValue900071_718_0;
        forestValue900071_726_1 = forestValue900071_718_1;
        break forest_join_726;
    }
    if (!((forestValue900071_718_0 != forestValue900071_718_1))) {
        break forest_join_731;
    }
    spill900071_25 = ((net.minecraft.block.state.IBlockState)(life63_856)).a__ch();
    if (!((life21_25 != null))) {
        forestValue900071_729_0 = spill900071_25;
        break forest_join_729;
    }
    forestValue900071_726_0 = spill900071_25;
    forestValue900071_726_1 = net.minecraft.init.Blocks.d;
    }
    if (!((forestValue900071_726_0 != forestValue900071_726_1))) {
        break forest_join_731;
    }
    forestValue900071_729_0 = ((net.minecraft.block.state.IBlockState)(life63_856)).a__ch();
    }
    if (!((forestValue900071_729_0 == net.minecraft.init.Blocks.c))) {
        break forest_join_808;
    }
    }
    spill900071_26 = (life60_802 - 1);
    if (!((life21_25 != null))) {
        forestValue900071_761_0 = spill900071_26;
        break forest_join_761;
    }
    if (!((spill900071_26 < __sourceIntrinsic_d03aecf46012_invokedynamic900071_70(18672, (6506631288716142052L ^ life19_3))))) {
        break forest_join_751;
    }
    ((moom.Fm)(p3)).a(((int)(life53_729)), ((int)(life60_802)), ((int)(life56_757)), ((net.minecraft.block.state.IBlockState)(((moom.dM)(net.minecraft.init.Blocks.k)).a__fE())));
    if (!((life21_25 == null))) {
        break forest_join_808;
    }
    }
    ((moom.Fm)(p3)).a(((int)(life53_729)), ((int)(life60_802)), ((int)(life56_757)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())));
    if (!((life21_25 != null))) {
        break forest_join_809;
    }
    forestValue900071_761_0 = life59_782;
    }
    if (!((forestValue900071_761_0 != 0))) {
        break forest_join_808;
    }
    spill900071_27 = p3;
    spill900071_28 = life53_729;
    spill900071_29 = (life60_802 - 1);
    spill900071_30 = life56_757;
    if (!((life21_25 != null))) {
        forestValue900071_802_0 = spill900071_27;
        forestValue900071_802_1 = spill900071_28;
        forestValue900071_802_2 = spill900071_29;
        forestValue900071_802_3 = spill900071_30;
        break forest_join_802;
    }
    if (!((((net.minecraft.block.state.IBlockState)(((moom.Fm)(spill900071_27)).a(((int)(spill900071_28)), ((int)(spill900071_29)), ((int)(spill900071_30))))).a__ch() == net.minecraft.init.Blocks.d))) {
        break forest_join_808;
    }
    ((moom.DU)(life52_727)).a(((int)((life53_729 + (p1 * __sourceIntrinsic_d03aecf46012_invokedynamic900071_80(28527, (4676531136734200438L ^ life19_3)))))), ((int)(0)), ((int)((life56_757 + (p2 * __sourceIntrinsic_d03aecf46012_invokedynamic900071_81(28527, (4676531136734200438L ^ life19_3)))))));
    forestValue900071_802_0 = p3;
    forestValue900071_802_1 = life53_729;
    forestValue900071_802_2 = (life60_802 - 1);
    forestValue900071_802_3 = life56_757;
    }
    ((moom.Fm)(forestValue900071_802_0)).a(((int)(forestValue900071_802_1)), ((int)(forestValue900071_802_2)), ((int)(forestValue900071_802_3)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.World)(this.c)).a__ES(((moom.DT)(life52_727))))).am)));
    }
    life60_802 += -1;
    }
    if (!((life21_25 == null))) {
        continue forest_cycle_659;
    }
    break forest_cycle_659;
    }
    break forest_cycle_622;
    }
    }
    life56_757 += 1;
    }
    if (!((life21_25 == null))) {
        continue forest_cycle_621;
    }
    break forest_cycle_621;
    }
    break forest_cycle_598;
    }
    }
    life53_729 += 1;
    if (!((life21_25 == null))) {
        continue forest_cycle_597;
    }
    break forest_cycle_597;
    }
    }
    forestValue900071_818_0 = life29_78;
    }
    if (!((forestValue900071_818_0 != 0))) {
        break forest_join_821;
    }
    if (!((life21_25 == null))) {
        break forest_join_1528;
    }
    }
    p10 += 1;
    if (!((life21_25 == null))) {
        continue forest_cycle_126;
    }
    break forest_cycle_126;
    }
    break forest_join_826;
    }
    break forest_join_1527;
    }
    break forest_join_1528;
    }
    forest_cycle_827: while (true) {
    forest_join_1525: {
    forest_join_1521: {
    forest_join_1518: {
    forest_join_1517: {
    forest_join_1290: {
    forest_join_1289: {
    forestValue900071_828_0 = forestValue900071_827_0;
    forestValue900071_828_1 = p11;
    forest_cycle_828: while (true) {
    forest_join_1180: {
    forest_join_1179: {
    forest_join_1165: {
    forest_join_1164: {
    forest_join_1159: {
    forest_join_1158: {
    forest_join_1151: {
    forest_join_1143: {
    forest_join_1138: {
    forest_join_1136: {
    forest_join_1122: {
    forest_join_1121: {
    forest_join_1055: {
    forest_join_1038: {
    forest_join_1026: {
    forest_join_1014: {
    forest_join_1002: {
    forest_join_993: {
    forest_join_957: {
    forest_join_954: {
    if (!((forestValue900071_828_0 < forestValue900071_828_1))) {
        break forest_join_1528;
    }
    life31_1035 = (0x1.8p0d + ((double) ((moom.Dr.a(((float)(((((float) p10) * 0x1.921fb6p1f) / ((float) p11))))) * p7) * 0x1.0p0f)));
    life33_1039 = (life31_1035 * p12);
    life31_1049 = (life31_1035 * ((((double) ((java.util.Random)(life22_8)).nextFloat()) * 0x1.0p-2d) + 0x1.8p-1d));
    life33_1059 = (life33_1039 * ((((double) ((java.util.Random)(life22_8)).nextFloat()) * 0x1.0p-2d) + 0x1.8p-1d));
    life35_1062 = moom.Dr.b(((float)(p9)));
    life36_1065 = moom.Dr.a(((float)(p9)));
    p4 = (p4 + ((double) (moom.Dr.b(((float)(p8))) * life35_1062)));
    p5 = (p5 + ((double) life36_1065));
    spill900071_31 = (p6 + ((double) (moom.Dr.a(((float)(p8))) * life35_1062)));
    if (!((life21_25 != null))) {
        forestValue900071_957_0 = spill900071_31;
        break forest_join_957;
    }
    p6 = spill900071_31;
    life14_1093 = (p9 * 0x1.666666p-1f);
    p9 = (life14_1093 + (life28_44 * 0x1.99999ap-5f));
    p8 = (p8 + (life27_42 * 0x1.99999ap-5f));
    life28_1109 = (life28_44 * 0x1.99999ap-1f);
    life27_1113 = (life27_42 * 0x1.0p-1f);
    life28_44 = (life28_1109 + (((((java.util.Random)(life22_8)).nextFloat() - ((java.util.Random)(life22_8)).nextFloat()) * ((java.util.Random)(life22_8)).nextFloat()) * 0x1.0p1f));
    life27_42 = (life27_1113 + (((((java.util.Random)(life22_8)).nextFloat() - ((java.util.Random)(life22_8)).nextFloat()) * ((java.util.Random)(life22_8)).nextFloat()) * 0x1.0p2f));
    if (!((life29_78 == 0))) {
        break forest_join_954;
    }
    if (!((((java.util.Random)(life22_8)).nextInt(((int)(4))) != 0))) {
        break forest_join_1521;
    }
    }
    forestValue900071_957_0 = (p4 - life23_24);
    }
    life37_1153 = forestValue900071_957_0;
    life39_1157 = (p6 - life25_40);
    life41_1162 = ((double) (p11 - p10));
    life43_1169 = ((double) ((p7 + 0x1.0p1f) + 0x1.0p4f));
    spill900071_32 = recovery.source.CarrierOps.dcmpl(((double)((((life37_1153 * life37_1153) + (life39_1157 * life39_1157)) - (life41_1162 * life41_1162)))), ((double)((life43_1169 * life43_1169))));
    if (!((life21_25 != null))) {
        forestValue900071_1002_0 = spill900071_32;
        break forest_join_1002;
    }
    if (!((spill900071_32 > 0))) {
        break forest_join_993;
    }
    break forest_join_1527;
    }
    forestValue900071_1002_0 = recovery.source.CarrierOps.dcmpl(((double)(p4)), ((double)(((life23_24 - 0x1.0p4d) - (life31_1049 * 0x1.0p1d)))));
    }
    if (!((life21_25 != null))) {
        forestValue900071_1014_0 = forestValue900071_1002_0;
        break forest_join_1014;
    }
    if (!((forestValue900071_1002_0 >= 0))) {
        break forest_join_1521;
    }
    forestValue900071_1014_0 = recovery.source.CarrierOps.dcmpl(((double)(p6)), ((double)(((life25_40 - 0x1.0p4d) - (life31_1049 * 0x1.0p1d)))));
    }
    if (!((life21_25 != null))) {
        forestValue900071_1026_0 = forestValue900071_1014_0;
        break forest_join_1026;
    }
    if (!((forestValue900071_1014_0 >= 0))) {
        break forest_join_1521;
    }
    forestValue900071_1026_0 = recovery.source.CarrierOps.dcmpg(((double)(p4)), ((double)(((life23_24 + 0x1.0p4d) + (life31_1049 * 0x1.0p1d)))));
    }
    if (!((life21_25 != null))) {
        forestValue900071_1038_0 = forestValue900071_1026_0;
        break forest_join_1038;
    }
    if (!((forestValue900071_1026_0 <= 0))) {
        break forest_join_1521;
    }
    forestValue900071_1038_0 = recovery.source.CarrierOps.dcmpg(((double)(p6)), ((double)(((life25_40 + 0x1.0p4d) + (life31_1049 * 0x1.0p1d)))));
    }
    if (!((life21_25 != null))) {
        forestValue900071_1055_0 = forestValue900071_1038_0;
        break forest_join_1055;
    }
    if (!((forestValue900071_1038_0 <= 0))) {
        break forest_join_1521;
    }
    forestValue900071_1055_0 = ((moom.Dr.b__Int(((double)((p4 - life31_1049)))) - (p1 * __sourceIntrinsic_d03aecf46012_invokedynamic900071_107(28527, (4676531136734200438L ^ life19_3)))) - 1);
    }
    life45_1269 = forestValue900071_1055_0;
    life46_1284 = ((moom.Dr.b__Int(((double)((p4 + life31_1049)))) - (p1 * __sourceIntrinsic_d03aecf46012_invokedynamic900071_109(28527, (4676531136734200438L ^ life19_3)))) + 1);
    life47_1291 = (moom.Dr.b__Int(((double)((p5 - life33_1059)))) - 1);
    life48_1298 = (moom.Dr.b__Int(((double)((p5 + life33_1059)))) + 1);
    life49_1313 = ((moom.Dr.b__Int(((double)((p6 - life31_1049)))) - (p2 * __sourceIntrinsic_d03aecf46012_invokedynamic900071_113(28527, (4676531136734200438L ^ life19_3)))) - 1);
    life50_1328 = ((moom.Dr.b__Int(((double)((p6 + life31_1049)))) - (p2 * __sourceIntrinsic_d03aecf46012_invokedynamic900071_115(28527, (4676531136734200438L ^ life19_3)))) + 1);
    spill900071_33 = life45_1269;
    if (!((life21_25 != null))) {
        forestValue900071_1122_0 = spill900071_33;
        break forest_join_1122;
    }
    if (!((spill900071_33 < 0))) {
        break forest_join_1121;
    }
    life45_1269 = 0;
    }
    forestValue900071_1122_0 = life46_1284;
    }
    spill900071_34 = __sourceIntrinsic_d03aecf46012_invokedynamic900071_116(28527, (4676531136734200438L ^ life19_3));
    if (!((life21_25 != null))) {
        forestValue900071_1138_0 = forestValue900071_1122_0;
        forestValue900071_1138_1 = spill900071_34;
        break forest_join_1138;
    }
    if (!((forestValue900071_1122_0 > spill900071_34))) {
        break forest_join_1136;
    }
    life46_1284 = __sourceIntrinsic_d03aecf46012_invokedynamic900071_117(28527, (4676531136734200438L ^ life19_3));
    }
    forestValue900071_1138_0 = life47_1291;
    forestValue900071_1138_1 = 1;
    }
    if (!((life21_25 != null))) {
        forestValue900071_1151_0 = forestValue900071_1138_0;
        forestValue900071_1151_1 = forestValue900071_1138_1;
        break forest_join_1151;
    }
    if (!((forestValue900071_1138_0 < forestValue900071_1138_1))) {
        break forest_join_1143;
    }
    life47_1291 = 1;
    }
    spill900071_35 = life48_1298;
    if (!((life21_25 != null))) {
        forestValue900071_1159_0 = spill900071_35;
        break forest_join_1159;
    }
    forestValue900071_1151_0 = spill900071_35;
    forestValue900071_1151_1 = __sourceIntrinsic_d03aecf46012_invokedynamic900071_118(10786, (7780476534742730552L ^ life19_3));
    }
    if (!((forestValue900071_1151_0 > forestValue900071_1151_1))) {
        break forest_join_1158;
    }
    life48_1298 = __sourceIntrinsic_d03aecf46012_invokedynamic900071_119(11402, (6488349918373396895L ^ life19_3));
    }
    forestValue900071_1159_0 = life49_1313;
    }
    if (!((life21_25 != null))) {
        forestValue900071_1165_0 = forestValue900071_1159_0;
        break forest_join_1165;
    }
    if (!((forestValue900071_1159_0 < 0))) {
        break forest_join_1164;
    }
    life49_1313 = 0;
    }
    forestValue900071_1165_0 = life50_1328;
    }
    if (!((life21_25 != null))) {
        forestValue900071_1180_0 = forestValue900071_1165_0;
        break forest_join_1180;
    }
    if (!((forestValue900071_1165_0 > __sourceIntrinsic_d03aecf46012_invokedynamic900071_120(28527, (4676531136734200438L ^ life19_3))))) {
        break forest_join_1179;
    }
    life50_1328 = __sourceIntrinsic_d03aecf46012_invokedynamic900071_121(28527, (4676531136734200438L ^ life19_3));
    }
    forestValue900071_1180_0 = 0;
    }
    life51_1423 = forestValue900071_1180_0;
    life52_1425 = life45_1269;
    forest_cycle_1183: while (true) {
    forest_join_1286: {
    if (!((life51_1423 == 0))) {
        break forest_join_1289;
    }
    spill900071_36 = life52_1425;
    if (!((life21_25 != null))) {
        forestValue900071_1290_0 = spill900071_36;
        break forest_join_1290;
    }
    spill900071_37 = life46_1284;
    if (!((life21_25 != null))) {
        forestValue900071_828_0 = spill900071_36;
        forestValue900071_828_1 = spill900071_37;
        continue forest_cycle_828;
    }
    if (!((spill900071_36 < spill900071_37))) {
        break forest_join_1289;
    }
    life53_1442 = life49_1313;
    forest_cycle_1194: while (true) {
    forest_join_1283: {
    forest_join_1205: {
    if (!((life51_1423 == 0))) {
        break forest_join_1286;
    }
    spill900071_38 = life53_1442;
    spill900071_39 = life50_1328;
    if (!((life21_25 != null))) {
        forestValue900071_828_0 = spill900071_38;
        forestValue900071_828_1 = spill900071_39;
        continue forest_cycle_828;
    }
    if (!((life21_25 != null))) {
        forestValue900071_1205_0 = spill900071_38;
        forestValue900071_1205_1 = spill900071_39;
        break forest_join_1205;
    }
    if (!((spill900071_38 < spill900071_39))) {
        break forest_join_1286;
    }
    forestValue900071_1205_0 = life48_1298;
    forestValue900071_1205_1 = 1;
    }
    life54_1462 = (forestValue900071_1205_0 + forestValue900071_1205_1);
    forest_cycle_1207: while (true) {
    forest_join_1280: {
    forest_join_1279: {
    forest_join_1277: {
    forest_join_1268: {
    forest_join_1263: {
    forest_join_1256: {
    forest_join_1247: {
    forest_join_1245: {
    forest_join_1243: {
    forest_join_1223: {
    forest_join_1219: {
    if (!((life51_1423 == 0))) {
        break forest_join_1283;
    }
    spill900071_40 = life54_1462;
    if (!((life21_25 != null))) {
        forestValue900071_1219_0 = spill900071_40;
        break forest_join_1219;
    }
    spill900071_41 = (life47_1291 - 1);
    if (!((life21_25 != null))) {
        forestValue900071_828_0 = spill900071_40;
        forestValue900071_828_1 = spill900071_41;
        continue forest_cycle_828;
    }
    if (!((spill900071_40 >= spill900071_41))) {
        break forest_join_1283;
    }
    forestValue900071_1219_0 = life54_1462;
    }
    if (!((life21_25 != null))) {
        forestValue900071_1223_0 = forestValue900071_1219_0;
        break forest_join_1223;
    }
    if (!((forestValue900071_1219_0 >= 0))) {
        break forest_join_1280;
    }
    forestValue900071_1223_0 = life54_1462;
    }
    if (!((forestValue900071_1223_0 < __sourceIntrinsic_d03aecf46012_invokedynamic900071_122(20968, (3311775838393744624L ^ life19_3))))) {
        break forest_join_1280;
    }
    life55_1502 = ((moom.Fm)(p3)).a(((int)(life52_1425)), ((int)(life54_1462)), ((int)(life53_1442)));
    spill900071_42 = ((net.minecraft.block.state.IBlockState)(life55_1502)).a__ch();
    if (!((life21_25 != null))) {
        forestValue900071_1243_0 = spill900071_42;
        break forest_join_1243;
    }
    if (!((spill900071_42 != net.minecraft.init.Blocks.i))) {
        break forest_join_1245;
    }
    forestValue900071_1243_0 = ((net.minecraft.block.state.IBlockState)(life55_1502)).a__ch();
    }
    if (!((forestValue900071_1243_0 == net.minecraft.init.Blocks.j))) {
        break forest_join_1247;
    }
    }
    life51_1423 = 1;
    }
    spill900071_43 = life54_1462;
    spill900071_44 = (life47_1291 - 1);
    if (!((life21_25 != null))) {
        forestValue900071_1256_0 = spill900071_43;
        forestValue900071_1256_1 = spill900071_44;
        break forest_join_1256;
    }
    if (!((spill900071_43 != spill900071_44))) {
        break forest_join_1280;
    }
    forestValue900071_1256_0 = life52_1425;
    forestValue900071_1256_1 = life45_1269;
    }
    if (!((life21_25 != null))) {
        forestValue900071_1263_0 = forestValue900071_1256_0;
        forestValue900071_1263_1 = forestValue900071_1256_1;
        break forest_join_1263;
    }
    if (!((forestValue900071_1256_0 != forestValue900071_1256_1))) {
        break forest_join_1280;
    }
    forestValue900071_1263_0 = life52_1425;
    forestValue900071_1263_1 = (life46_1284 - 1);
    }
    if (!((life21_25 != null))) {
        forestValue900071_1268_0 = forestValue900071_1263_0;
        forestValue900071_1268_1 = forestValue900071_1263_1;
        break forest_join_1268;
    }
    if (!((forestValue900071_1263_0 != forestValue900071_1263_1))) {
        break forest_join_1280;
    }
    forestValue900071_1268_0 = life53_1442;
    forestValue900071_1268_1 = life49_1313;
    }
    if (!((life21_25 != null))) {
        forestValue900071_1277_0 = forestValue900071_1268_0;
        forestValue900071_1277_1 = forestValue900071_1268_1;
        break forest_join_1277;
    }
    if (!((forestValue900071_1268_0 != forestValue900071_1268_1))) {
        break forest_join_1280;
    }
    spill900071_45 = life53_1442;
    if (!((life21_25 != null))) {
        forestValue900071_1279_0 = spill900071_45;
        break forest_join_1279;
    }
    forestValue900071_1277_0 = spill900071_45;
    forestValue900071_1277_1 = (life50_1328 - 1);
    }
    if (!((forestValue900071_1277_0 != forestValue900071_1277_1))) {
        break forest_join_1280;
    }
    forestValue900071_1279_0 = life47_1291;
    }
    life54_1462 = forestValue900071_1279_0;
    }
    life54_1462 += -1;
    if (!((life21_25 == null))) {
        continue forest_cycle_1207;
    }
    break forest_cycle_1207;
    }
    }
    life53_1442 += 1;
    if (!((life21_25 == null))) {
        continue forest_cycle_1194;
    }
    break forest_cycle_1194;
    }
    }
    life52_1425 += 1;
    if (!((life21_25 == null))) {
        continue forest_cycle_1183;
    }
    break forest_cycle_1183;
    }
    break forest_cycle_828;
    }
    }
    forestValue900071_1290_0 = life51_1423;
    }
    if (!((forestValue900071_1290_0 == 0))) {
        break forest_join_1521;
    }
    life52_1594 = new moom.DU();
    life53_1596 = life45_1269;
    forest_cycle_1297: while (true) {
    forest_join_1514: {
    forestValue900071_1298_0 = life53_1596;
    forest_cycle_1298: while (true) {
    if (!((forestValue900071_1298_0 < life46_1284))) {
        break forest_join_1517;
    }
    life54_1619 = (((((double) (life53_1596 + (p1 * __sourceIntrinsic_d03aecf46012_invokedynamic900071_128(28527, (4676531136734200438L ^ life19_3))))) + 0x1.0p-1d) - p4) / life31_1049);
    spill900071_46 = life49_1313;
    if (!((life21_25 != null))) {
        forestValue900071_1518_0 = spill900071_46;
        break forest_join_1518;
    }
    life56_1624 = spill900071_46;
    forest_cycle_1321: while (true) {
    forest_join_1512: {
    forest_join_1511: {
    forestValue900071_1322_0 = life56_1624;
    forest_cycle_1322: while (true) {
    if (!((forestValue900071_1322_0 < life50_1328))) {
        break forest_join_1514;
    }
    life57_1647 = (((((double) (life56_1624 + (p2 * __sourceIntrinsic_d03aecf46012_invokedynamic900071_129(28527, (4676531136734200438L ^ life19_3))))) + 0x1.0p-1d) - p6) / life31_1049);
    life59_1649 = 0;
    if (!((life21_25 != null))) {
        break forest_join_1512;
    }
    spill900071_47 = recovery.source.CarrierOps.dcmpg(((double)(((life54_1619 * life54_1619) + (life57_1647 * life57_1647)))), ((double)(0x1.0p0d)));
    if (!((life21_25 != null))) {
        forestValue900071_1298_0 = spill900071_47;
        continue forest_cycle_1298;
    }
    if (!((spill900071_47 < 0))) {
        break forest_join_1511;
    }
    life60_1669 = life48_1298;
    forest_cycle_1359: while (true) {
    forest_join_1509: {
    forest_join_1508: {
    forest_join_1502: {
    forest_join_1461: {
    forest_join_1451: {
    forest_join_1431: {
    forest_join_1429: {
    forest_join_1426: {
    forest_join_1418: {
    forest_join_1415: {
    if (!((life60_1669 > life47_1291))) {
        break forest_join_1511;
    }
    life61_1685 = (((((double) (life60_1669 - 1)) + 0x1.0p-1d) - p5) / life33_1059);
    if (!((life21_25 != null))) {
        break forest_join_1509;
    }
    spill900071_48 = recovery.source.CarrierOps.dcmpg(((double)(((((life54_1619 * life54_1619) + (life57_1647 * life57_1647)) * ((double) (this.e)[(life60_1669 - 1)])) + ((life61_1685 * life61_1685) / 0x1.8p2d)))), ((double)(0x1.0p0d)));
    if (!((life21_25 != null))) {
        forestValue900071_1322_0 = spill900071_48;
        continue forest_cycle_1322;
    }
    if (!((spill900071_48 < 0))) {
        break forest_join_1508;
    }
    life63_1723 = ((moom.Fm)(p3)).a(((int)(life53_1596)), ((int)(life60_1669)), ((int)(life56_1624)));
    spill900071_49 = ((net.minecraft.block.state.IBlockState)(life63_1723)).a__ch();
    spill900071_50 = net.minecraft.init.Blocks.c;
    if (!((life21_25 != null))) {
        forestValue900071_1418_0 = spill900071_49;
        forestValue900071_1418_1 = spill900071_50;
        break forest_join_1418;
    }
    if (!((spill900071_49 == spill900071_50))) {
        break forest_join_1415;
    }
    life59_1649 = 1;
    }
    forestValue900071_1418_0 = ((net.minecraft.block.state.IBlockState)(life63_1723)).a__ch();
    forestValue900071_1418_1 = net.minecraft.init.Blocks.b;
    }
    if (!((life21_25 != null))) {
        forestValue900071_1426_0 = forestValue900071_1418_0;
        forestValue900071_1426_1 = forestValue900071_1418_1;
        break forest_join_1426;
    }
    if (!((forestValue900071_1418_0 != forestValue900071_1418_1))) {
        break forest_join_1431;
    }
    spill900071_51 = ((net.minecraft.block.state.IBlockState)(life63_1723)).a__ch();
    if (!((life21_25 != null))) {
        forestValue900071_1429_0 = spill900071_51;
        break forest_join_1429;
    }
    forestValue900071_1426_0 = spill900071_51;
    forestValue900071_1426_1 = net.minecraft.init.Blocks.d;
    }
    if (!((forestValue900071_1426_0 != forestValue900071_1426_1))) {
        break forest_join_1431;
    }
    forestValue900071_1429_0 = ((net.minecraft.block.state.IBlockState)(life63_1723)).a__ch();
    }
    if (!((forestValue900071_1429_0 == net.minecraft.init.Blocks.c))) {
        break forest_join_1508;
    }
    }
    spill900071_52 = (life60_1669 - 1);
    if (!((life21_25 != null))) {
        forestValue900071_1461_0 = spill900071_52;
        break forest_join_1461;
    }
    if (!((spill900071_52 < __sourceIntrinsic_d03aecf46012_invokedynamic900071_142(18672, (6506631288716142052L ^ life19_3))))) {
        break forest_join_1451;
    }
    ((moom.Fm)(p3)).a(((int)(life53_1596)), ((int)(life60_1669)), ((int)(life56_1624)), ((net.minecraft.block.state.IBlockState)(((moom.dM)(net.minecraft.init.Blocks.k)).a__fE())));
    if (!((life21_25 == null))) {
        break forest_join_1508;
    }
    }
    ((moom.Fm)(p3)).a(((int)(life53_1596)), ((int)(life60_1669)), ((int)(life56_1624)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())));
    if (!((life21_25 != null))) {
        break forest_join_1509;
    }
    forestValue900071_1461_0 = life59_1649;
    }
    if (!((forestValue900071_1461_0 != 0))) {
        break forest_join_1508;
    }
    spill900071_53 = p3;
    spill900071_54 = life53_1596;
    spill900071_55 = (life60_1669 - 1);
    spill900071_56 = life56_1624;
    if (!((life21_25 != null))) {
        forestValue900071_1502_0 = spill900071_53;
        forestValue900071_1502_1 = spill900071_54;
        forestValue900071_1502_2 = spill900071_55;
        forestValue900071_1502_3 = spill900071_56;
        break forest_join_1502;
    }
    if (!((((net.minecraft.block.state.IBlockState)(((moom.Fm)(spill900071_53)).a(((int)(spill900071_54)), ((int)(spill900071_55)), ((int)(spill900071_56))))).a__ch() == net.minecraft.init.Blocks.d))) {
        break forest_join_1508;
    }
    ((moom.DU)(life52_1594)).a(((int)((life53_1596 + (p1 * __sourceIntrinsic_d03aecf46012_invokedynamic900071_152(28527, (4676531136734200438L ^ life19_3)))))), ((int)(0)), ((int)((life56_1624 + (p2 * __sourceIntrinsic_d03aecf46012_invokedynamic900071_153(28527, (4676531136734200438L ^ life19_3)))))));
    forestValue900071_1502_0 = p3;
    forestValue900071_1502_1 = life53_1596;
    forestValue900071_1502_2 = (life60_1669 - 1);
    forestValue900071_1502_3 = life56_1624;
    }
    ((moom.Fm)(forestValue900071_1502_0)).a(((int)(forestValue900071_1502_1)), ((int)(forestValue900071_1502_2)), ((int)(forestValue900071_1502_3)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.World)(this.c)).a__ES(((moom.DT)(life52_1594))))).am)));
    }
    life60_1669 += -1;
    }
    if (!((life21_25 == null))) {
        continue forest_cycle_1359;
    }
    break forest_cycle_1359;
    }
    break forest_cycle_1322;
    }
    }
    life56_1624 += 1;
    }
    if (!((life21_25 == null))) {
        continue forest_cycle_1321;
    }
    break forest_cycle_1321;
    }
    break forest_cycle_1298;
    }
    }
    life53_1596 += 1;
    if (!((life21_25 == null))) {
        continue forest_cycle_1297;
    }
    break forest_cycle_1297;
    }
    }
    forestValue900071_1518_0 = life29_78;
    }
    if (!((forestValue900071_1518_0 != 0))) {
        break forest_join_1521;
    }
    if (!((life21_25 == null))) {
        break forest_join_1528;
    }
    }
    p10 += 1;
    if (!((life21_25 == null))) {
        break forest_join_1525;
    }
    break forest_join_1528;
    }
    spill900071_57 = p10;
    forestValue900071_827_0 = spill900071_57;
    continue forest_cycle_827;
    }
    }
    return;
    }
    return;
}


protected void a(net.minecraft.world.World p0, int p1, int p2, int p3, int p4, moom.Fm p5) {
int lexicalValue644_33_0;
    int spill644_0;
    long life7_3;
    java.lang.String[] life9_5;
    double life10_40;
    double life12_65;
    double life14_83;
    int life16_85;
    int life17_87;
    float life18_98;
    float life19_108;
    float life20_120;
    lexical_join_135: {
    lexical_join_33: {
    life7_3 = (moom.FL.f ^ 98962914503931L);
    life9_5 = moom.FI.b();
    spill644_0 = ((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_9694d49eb69b_invokedynamic644_3(15607, (3945383061309052524L ^ life7_3)))));
    if (!((life9_5 != null))) {
        lexicalValue644_33_0 = spill644_0;
        break lexical_join_33;
    }
    if (!((spill644_0 == 0))) {
        break lexical_join_135;
    }
    lexicalValue644_33_0 = ((p1 * __sourceIntrinsic_9694d49eb69b_invokedynamic644_5(22726, (6702980236690666075L ^ life7_3))) + ((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_9694d49eb69b_invokedynamic644_7(28527, (4676479799437428220L ^ life7_3))))));
    }
    life10_40 = ((double) lexicalValue644_33_0);
    life12_65 = ((double) (((java.util.Random)(this.b)).nextInt(((int)((((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_9694d49eb69b_invokedynamic644_11(29604, (997394925884414268L ^ life7_3))))) + __sourceIntrinsic_9694d49eb69b_invokedynamic644_13(14035, (2005491322695605318L ^ life7_3)))))) + __sourceIntrinsic_9694d49eb69b_invokedynamic644_15(16437, (5428598801200294572L ^ life7_3))));
    life14_83 = ((double) ((p2 * __sourceIntrinsic_9694d49eb69b_invokedynamic644_16(28527, (4676479799437428220L ^ life7_3))) + ((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_9694d49eb69b_invokedynamic644_18(28527, (4676479799437428220L ^ life7_3)))))));
    life16_85 = 1;
    life17_87 = 0;
    lexical_cycle_82: while (true) {
    if (!((life17_87 < life16_85))) {
        break lexical_join_135;
    }
    life18_98 = ((((java.util.Random)(this.b)).nextFloat() * 0x1.921fb6p1f) * 0x1.0p1f);
    life19_108 = (((((java.util.Random)(this.b)).nextFloat() - 0x1.0p-1f) * 0x1.0p1f) / 0x1.0p3f);
    life20_120 = (((((java.util.Random)(this.b)).nextFloat() * 0x1.0p1f) + ((java.util.Random)(this.b)).nextFloat()) * 0x1.0p1f);
    ((moom.FL)(this)).a(((long)(((java.util.Random)(this.b)).nextLong())), ((int)(p3)), ((int)(p4)), ((moom.Fm)(p5)), ((double)(life10_40)), ((double)(life12_65)), ((double)(life14_83)), ((float)(life20_120)), ((float)(life18_98)), ((float)(life19_108)), ((int)(0)), ((int)(0)), ((double)(0x1.8p1d)));
    life17_87 += 1;
    if (!((life9_5 == null))) { continue lexical_cycle_82; }
    break lexical_cycle_82;
    }
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_f22d2f4f03f4b5c2_originalDynamicSite2004_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic900071_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic900071_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic900071_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic900071_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic900071_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic900071_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic900071_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic900071_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic900071_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic900071_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic900071_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic900071_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic900071_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic900071_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic900071_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic900071_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic900071_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic900071_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic900071_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic900071_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic900071_70(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic900071_80(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic900071_81(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic900071_107(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic900071_109(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic900071_113(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic900071_115(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic900071_116(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic900071_117(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic900071_118(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic900071_119(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic900071_120(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic900071_121(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic900071_122(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic900071_128(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic900071_129(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic900071_142(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic900071_152(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic900071_153(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4495_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9694d49eb69b_invokedynamic644_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9694d49eb69b_invokedynamic644_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9694d49eb69b_invokedynamic644_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9694d49eb69b_invokedynamic644_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9694d49eb69b_invokedynamic644_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9694d49eb69b_invokedynamic644_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9694d49eb69b_invokedynamic644_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9694d49eb69b_invokedynamic644_18(int a0, long a1) throws E;
}
