package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class FX {

private static int[][] a;

public static double b;

private int[] c;

public double d;

public double e;

public double f;

private static double g;

private static double h;

private static long i;

private static long[] j;

private static java.lang.Integer[] k;

private static java.util.Map l;

public FX() {
this(((java.util.Random)(new java.util.Random())));
    return;
}


public FX(java.util.Random p0) { super(); }

private static void __sourceConstructorBody_a6e5f5693ec7e604(moom.FX receiver, java.util.Random p0) throws Throwable {
long local2_life2 = (moom.FX.i ^ 111636636825910L);
    moom.FX.__sourceConstructorInit_a6e5f5693ec7e604_0(((moom.FX)(receiver)));
    ((moom.FX)(receiver)).c = ((int[])(new int[__sourceIntrinsic_a6e5f5693ec7e604_originalDynamicSite492_5(30500, (6534574211749767321L ^ local2_life2))]));
    ((moom.FX)(receiver)).d = ((double)((((java.util.Random)(p0)).nextDouble() * 0x1.0000000000000p+8D)));
    ((moom.FX)(receiver)).e = ((double)((((java.util.Random)(p0)).nextDouble() * 0x1.0000000000000p+8D)));
    ((moom.FX)(receiver)).f = ((double)((((java.util.Random)(p0)).nextDouble() * 0x1.0000000000000p+8D)));
    int local4_life16 = 0;
    while ((local4_life16 < __sourceIntrinsic_a6e5f5693ec7e604_originalDynamicSite492_18(30431, (67262911289551211L ^ local2_life2)))) {
        int[] __sourceSpill492_20 = ((moom.FX)(receiver)).c;
        int __sourceSpill492_21 = local4_life16;
        int __sourceSpill492_22 = local4_life16;
        local4_life16 += 1;
        (__sourceSpill492_20)[__sourceSpill492_21] = __sourceSpill492_22;
    }
    local4_life16 = 0;
    while ((local4_life16 < __sourceIntrinsic_a6e5f5693ec7e604_originalDynamicSite492_24(30879, (1651046014472677159L ^ local2_life2)))) {
        int local5_life28 = (((java.util.Random)(p0)).nextInt(((int)((__sourceIntrinsic_a6e5f5693ec7e604_originalDynamicSite492_26(30879, (1651046014472677159L ^ local2_life2)) - local4_life16)))) + local4_life16);
        int local6_life30 = (((moom.FX)(receiver)).c)[local4_life16];
        (((moom.FX)(receiver)).c)[local4_life16] = (((moom.FX)(receiver)).c)[local5_life28];
        (((moom.FX)(receiver)).c)[local5_life28] = local6_life30;
        (((moom.FX)(receiver)).c)[(local4_life16 + __sourceIntrinsic_a6e5f5693ec7e604_originalDynamicSite492_36(30879, (1651046014472677159L ^ local2_life2)))] = (((moom.FX)(receiver)).c)[local4_life16];
        local4_life16 += 1;
    }
    return;
}


static {
javax.crypto.Cipher forestValue390_36_0;
    int forestValue390_36_1;
    javax.crypto.SecretKeyFactory forestValue390_36_2;
    byte[] forestValue390_36_3;
    javax.crypto.Cipher forestValue390_53_0;
    int forestValue390_53_1;
    javax.crypto.SecretKeyFactory forestValue390_53_2;
    byte[] forestValue390_53_3;
    long[] forestValue390_157_0;
    int forestValue390_157_1;
    long forestValue390_157_2;
    int forestValue390_157_3;
    long[] forestValue390_300_0;
    int forestValue390_300_1;
    long forestValue390_300_2;
    long[] forestValue390_312_0;
    int forestValue390_312_1;
    long forestValue390_312_2;
    javax.crypto.Cipher spill390_0;
    int spill390_1;
    javax.crypto.SecretKeyFactory spill390_2;
    byte[] spill390_3;
    byte[] spill390_4;
    java.lang.String spill390_5;
    int spill390_6;
    int spill390_7;
    long spill390_8;
    byte[] spill390_9;
    byte[] spill390_10;
    byte[] spill390_11;
    byte[] spill390_12;
    byte[] spill390_13;
    byte[] spill390_14;
    byte[] spill390_15;
    byte[] spill390_16;
    long spill390_17;
    int spill390_18;
    java.lang.String spill390_19;
    int spill390_20;
    long[] spill390_21;
    int spill390_22;
    long spill390_23;
    int spill390_24;
    int[][] spill390_25;
    int[][] spill390_26;
    int spill390_27;
    int[] spill390_28;
    int[] spill390_29;
    int[] spill390_30;
    int[][] spill390_31;
    int[][] spill390_32;
    int spill390_33;
    int[] spill390_34;
    int[] spill390_35;
    int[] spill390_36;
    int[][] spill390_37;
    int[][] spill390_38;
    int spill390_39;
    int[] spill390_40;
    int[] spill390_41;
    int[] spill390_42;
    int[][] spill390_43;
    int[][] spill390_44;
    int spill390_45;
    int[] spill390_46;
    int[] spill390_47;
    int[] spill390_48;
    int[][] spill390_49;
    int[][] spill390_50;
    int spill390_51;
    int[] spill390_52;
    int[] spill390_53;
    int[] spill390_54;
    int[][] spill390_55;
    int[][] spill390_56;
    int spill390_57;
    int[] spill390_58;
    int[] spill390_59;
    int[] spill390_60;
    int[][] spill390_61;
    int[][] spill390_62;
    int spill390_63;
    int[] spill390_64;
    int[] spill390_65;
    int[] spill390_66;
    int[][] spill390_67;
    int[][] spill390_68;
    int spill390_69;
    int[] spill390_70;
    int[] spill390_71;
    int[] spill390_72;
    int[][] spill390_73;
    int[][] spill390_74;
    int spill390_75;
    int[] spill390_76;
    int[] spill390_77;
    int[] spill390_78;
    int[][] spill390_79;
    int[][] spill390_80;
    int spill390_81;
    int[] spill390_82;
    int[] spill390_83;
    int[] spill390_84;
    int[][] spill390_85;
    int[][] spill390_86;
    int spill390_87;
    int[] spill390_88;
    int[] spill390_89;
    int[] spill390_90;
    int[][] spill390_91;
    int[][] spill390_92;
    int spill390_93;
    int[] spill390_94;
    int[] spill390_95;
    int[] spill390_96;
    long life11_11;
    javax.crypto.Cipher life0_20;
    int life1_35;
    long[] life6_66;
    int life3_68;
    java.lang.String life4_71;
    int life5_73;
    int life2_75;
    byte[] life7_83;
    long life8_160;
    byte[] life10_228;
    byte[] life7_325;
    forest_join_399: {
    forest_join_53: {
    i = ((long)(((moom._a)(moom._c.a(((long)(-615972546908502387L)), ((long)(-4836784327678736320L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(79345677199356L)))));
    life11_11 = (moom.FX.i ^ 1262431501543L);
    l = ((java.util.Map)(new java.util.HashMap(13)));
    spill390_0 = (life0_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill390_1 = 2;
    spill390_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp390_9_0 = new byte[8];
    spill390_3 = __stackOp390_9_0;
    (__stackOp390_9_0)[0] = ((byte) ((int) (life11_11 >>> 56)));
    life1_35 = 1;
    forestValue390_36_0 = spill390_0;
    forestValue390_36_1 = spill390_1;
    forestValue390_36_2 = spill390_2;
    forestValue390_36_3 = spill390_3;
    forest_cycle_36: while (true) {
    if (!((life1_35 < 8))) {
        forestValue390_53_0 = forestValue390_36_0;
        forestValue390_53_1 = forestValue390_36_1;
        forestValue390_53_2 = forestValue390_36_2;
        forestValue390_53_3 = forestValue390_36_3;
        break forest_join_53;
    }
    byte[] __stackOp390_10_0 = forestValue390_36_3;
    spill390_4 = __stackOp390_10_0;
    (__stackOp390_10_0)[life1_35] = ((byte) ((int) ((life11_11 << (life1_35 * 8)) >>> 56)));
    life1_35 += 1;
    forestValue390_36_3 = spill390_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue390_53_0)).init(((int)(forestValue390_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue390_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue390_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life6_66 = new long[13];
    life3_68 = 0;
    life5_73 = ((java.lang.String)((life4_71 = "\017riçÓÈ×P\rw[9lõÕvê÷7>Èõ°ôl\025±ûº\nµ4\0342CRþ\"]¨¦Zý#\035@ã;Z4ÏÈT?£ô}*nX_,Nr\026ÊÓ.ôUa{ý²3°ÈÒa\003}"))).length();
    life2_75 = 0;
    forest_cycle_76: while (true) {
    spill390_5 = life4_71;
    spill390_6 = life2_75;
    life2_75 += 8;
    life7_83 = ((java.lang.String)(((java.lang.String)(spill390_5)).substring(((int)(spill390_6)), ((int)(life2_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    forestValue390_157_0 = life6_66;
    forestValue390_157_1 = (life3_68++);
    forestValue390_157_2 = (((((((((((long) (life7_83)[0]) & 255L) << 56) | ((((long) (life7_83)[1]) & 255L) << 48)) | ((((long) (life7_83)[2]) & 255L) << 40)) | ((((long) (life7_83)[3]) & 255L) << 32)) | ((((long) (life7_83)[4]) & 255L) << 24)) | ((((long) (life7_83)[5]) & 255L) << 16)) | ((((long) (life7_83)[6]) & 255L) << 8)) | (((long) (life7_83)[7]) & 255L));
    forestValue390_157_3 = -1;
    forest_cycle_157: while (true) {
    forest_join_317: {
    forest_join_312: {
    forest_join_300: {
    long __stackOp390_16_0 = forestValue390_157_2;
    int __stackOp390_16_1 = forestValue390_157_3;
    spill390_7 = __stackOp390_16_1;
    spill390_8 = __stackOp390_16_0;
    recovery.source.CarrierOps.discard(__stackOp390_16_1);
    life8_160 = spill390_8;
    byte[] __stackOp390_18_0 = new byte[8];
    spill390_9 = __stackOp390_18_0;
    (__stackOp390_18_0)[0] = ((byte) ((int) (life8_160 >>> 56)));
    byte[] __stackOp390_19_0 = spill390_9;
    spill390_10 = __stackOp390_19_0;
    (__stackOp390_19_0)[1] = ((byte) ((int) (life8_160 >>> 48)));
    byte[] __stackOp390_20_0 = spill390_10;
    spill390_11 = __stackOp390_20_0;
    (__stackOp390_20_0)[2] = ((byte) ((int) (life8_160 >>> 40)));
    byte[] __stackOp390_21_0 = spill390_11;
    spill390_12 = __stackOp390_21_0;
    (__stackOp390_21_0)[3] = ((byte) ((int) (life8_160 >>> 32)));
    byte[] __stackOp390_22_0 = spill390_12;
    spill390_13 = __stackOp390_22_0;
    (__stackOp390_22_0)[4] = ((byte) ((int) (life8_160 >>> 24)));
    byte[] __stackOp390_23_0 = spill390_13;
    spill390_14 = __stackOp390_23_0;
    (__stackOp390_23_0)[5] = ((byte) ((int) (life8_160 >>> 16)));
    byte[] __stackOp390_24_0 = spill390_14;
    spill390_15 = __stackOp390_24_0;
    (__stackOp390_24_0)[6] = ((byte) ((int) (life8_160 >>> 8)));
    byte[] __stackOp390_25_0 = spill390_15;
    spill390_16 = __stackOp390_25_0;
    (__stackOp390_25_0)[7] = ((byte) ((int) life8_160));
    byte[] __stackOp390_26_0 = spill390_16;
    javax.crypto.Cipher __stackOp390_26_1 = life0_20;
    life10_228 = ((javax.crypto.Cipher)(__stackOp390_26_1)).doFinal(((byte[])(__stackOp390_26_0)));
    int __stackOp390_28_0 = spill390_7;
    long __stackOp390_28_1 = (((((((((((long) (life10_228)[0]) & 255L) << 56) | ((((long) (life10_228)[1]) & 255L) << 48)) | ((((long) (life10_228)[2]) & 255L) << 40)) | ((((long) (life10_228)[3]) & 255L) << 32)) | ((((long) (life10_228)[4]) & 255L) << 24)) | ((((long) (life10_228)[5]) & 255L) << 16)) | ((((long) (life10_228)[6]) & 255L) << 8)) | (((long) (life10_228)[7]) & 255L));
    spill390_17 = __stackOp390_28_1;
    spill390_18 = __stackOp390_28_0;
    recovery.source.CarrierOps.discard(__stackOp390_28_1);
    switch (spill390_18) {
default:
{
        forestValue390_300_0 = forestValue390_157_0;
        forestValue390_300_1 = forestValue390_157_1;
        forestValue390_300_2 = spill390_17;
        break forest_join_300;
    }
case 0:
{
        forestValue390_312_0 = forestValue390_157_0;
        forestValue390_312_1 = forestValue390_157_1;
        forestValue390_312_2 = spill390_17;
        break forest_join_312;
    }
}
    }
    (forestValue390_300_0)[forestValue390_300_1] = forestValue390_300_2;
    if (!((life2_75 >= life5_73))) {
        continue forest_cycle_76;
    }
    life5_73 = ((java.lang.String)((life4_71 = "ªb\0215±\023r\004ù8áÜf\007\037y"))).length();
    life2_75 = 0;
    break forest_join_317;
    }
    (forestValue390_312_0)[forestValue390_312_1] = forestValue390_312_2;
    if (!((life2_75 >= life5_73))) {
        break forest_join_317;
    }
    break forest_join_399;
    }
    spill390_19 = life4_71;
    spill390_20 = life2_75;
    life2_75 += 8;
    life7_325 = ((java.lang.String)(((java.lang.String)(spill390_19)).substring(((int)(spill390_20)), ((int)(life2_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    spill390_21 = life6_66;
    spill390_22 = (life3_68++);
    spill390_23 = (((((((((((long) (life7_325)[0]) & 255L) << 56) | ((((long) (life7_325)[1]) & 255L) << 48)) | ((((long) (life7_325)[2]) & 255L) << 40)) | ((((long) (life7_325)[3]) & 255L) << 32)) | ((((long) (life7_325)[4]) & 255L) << 24)) | ((((long) (life7_325)[5]) & 255L) << 16)) | ((((long) (life7_325)[6]) & 255L) << 8)) | (((long) (life7_325)[7]) & 255L));
    spill390_24 = 0;
    forestValue390_157_0 = spill390_21;
    forestValue390_157_1 = spill390_22;
    forestValue390_157_2 = spill390_23;
    forestValue390_157_3 = spill390_24;
    continue forest_cycle_157;
    }
    }
    }
    j = ((long[])(life6_66));
    k = ((java.lang.Integer[])(new java.lang.Integer[13]));
    int[][] __stackOp390_36_0 = new int[__sourceIntrinsic_eb8803ad1f63_invokedynamic390_35(4109, (1488799786553969260L ^ life11_11))][];
    spill390_25 = __stackOp390_36_0;
    spill390_26 = __stackOp390_36_0;
    spill390_27 = 0;
    int[] __stackOp390_37_0 = new int[3];
    spill390_28 = __stackOp390_37_0;
    (__stackOp390_37_0)[0] = 1;
    int[] __stackOp390_38_0 = spill390_28;
    spill390_29 = __stackOp390_38_0;
    (__stackOp390_38_0)[1] = 1;
    int[] __stackOp390_39_0 = spill390_29;
    spill390_30 = __stackOp390_39_0;
    (__stackOp390_39_0)[2] = 0;
    (spill390_26)[spill390_27] = spill390_30;
    int[][] __stackOp390_40_0 = spill390_25;
    spill390_31 = __stackOp390_40_0;
    spill390_32 = __stackOp390_40_0;
    spill390_33 = 1;
    int[] __stackOp390_41_0 = new int[3];
    spill390_34 = __stackOp390_41_0;
    (__stackOp390_41_0)[0] = -1;
    int[] __stackOp390_42_0 = spill390_34;
    spill390_35 = __stackOp390_42_0;
    (__stackOp390_42_0)[1] = 1;
    int[] __stackOp390_43_0 = spill390_35;
    spill390_36 = __stackOp390_43_0;
    (__stackOp390_43_0)[2] = 0;
    (spill390_32)[spill390_33] = spill390_36;
    int[][] __stackOp390_44_0 = spill390_31;
    spill390_37 = __stackOp390_44_0;
    spill390_38 = __stackOp390_44_0;
    spill390_39 = 2;
    int[] __stackOp390_45_0 = new int[3];
    spill390_40 = __stackOp390_45_0;
    (__stackOp390_45_0)[0] = 1;
    int[] __stackOp390_46_0 = spill390_40;
    spill390_41 = __stackOp390_46_0;
    (__stackOp390_46_0)[1] = -1;
    int[] __stackOp390_47_0 = spill390_41;
    spill390_42 = __stackOp390_47_0;
    (__stackOp390_47_0)[2] = 0;
    (spill390_38)[spill390_39] = spill390_42;
    int[][] __stackOp390_48_0 = spill390_37;
    spill390_43 = __stackOp390_48_0;
    spill390_44 = __stackOp390_48_0;
    spill390_45 = 3;
    int[] __stackOp390_49_0 = new int[3];
    spill390_46 = __stackOp390_49_0;
    (__stackOp390_49_0)[0] = -1;
    int[] __stackOp390_50_0 = spill390_46;
    spill390_47 = __stackOp390_50_0;
    (__stackOp390_50_0)[1] = -1;
    int[] __stackOp390_51_0 = spill390_47;
    spill390_48 = __stackOp390_51_0;
    (__stackOp390_51_0)[2] = 0;
    (spill390_44)[spill390_45] = spill390_48;
    int[][] __stackOp390_52_0 = spill390_43;
    spill390_49 = __stackOp390_52_0;
    spill390_50 = __stackOp390_52_0;
    spill390_51 = 4;
    int[] __stackOp390_53_0 = new int[3];
    spill390_52 = __stackOp390_53_0;
    (__stackOp390_53_0)[0] = 1;
    int[] __stackOp390_54_0 = spill390_52;
    spill390_53 = __stackOp390_54_0;
    (__stackOp390_54_0)[1] = 0;
    int[] __stackOp390_55_0 = spill390_53;
    spill390_54 = __stackOp390_55_0;
    (__stackOp390_55_0)[2] = 1;
    (spill390_50)[spill390_51] = spill390_54;
    int[][] __stackOp390_56_0 = spill390_49;
    spill390_55 = __stackOp390_56_0;
    spill390_56 = __stackOp390_56_0;
    spill390_57 = 5;
    int[] __stackOp390_57_0 = new int[3];
    spill390_58 = __stackOp390_57_0;
    (__stackOp390_57_0)[0] = -1;
    int[] __stackOp390_58_0 = spill390_58;
    spill390_59 = __stackOp390_58_0;
    (__stackOp390_58_0)[1] = 0;
    int[] __stackOp390_59_0 = spill390_59;
    spill390_60 = __stackOp390_59_0;
    (__stackOp390_59_0)[2] = 1;
    (spill390_56)[spill390_57] = spill390_60;
    int[][] __stackOp390_60_0 = spill390_55;
    spill390_61 = __stackOp390_60_0;
    spill390_62 = __stackOp390_60_0;
    spill390_63 = __sourceIntrinsic_eb8803ad1f63_invokedynamic390_61(4171, (7530963193110596140L ^ life11_11));
    int[] __stackOp390_62_0 = new int[3];
    spill390_64 = __stackOp390_62_0;
    (__stackOp390_62_0)[0] = 1;
    int[] __stackOp390_63_0 = spill390_64;
    spill390_65 = __stackOp390_63_0;
    (__stackOp390_63_0)[1] = 0;
    int[] __stackOp390_64_0 = spill390_65;
    spill390_66 = __stackOp390_64_0;
    (__stackOp390_64_0)[2] = -1;
    (spill390_62)[spill390_63] = spill390_66;
    int[][] __stackOp390_65_0 = spill390_61;
    spill390_67 = __stackOp390_65_0;
    spill390_68 = __stackOp390_65_0;
    spill390_69 = __sourceIntrinsic_eb8803ad1f63_invokedynamic390_66(1586, (7348215603994008657L ^ life11_11));
    int[] __stackOp390_67_0 = new int[3];
    spill390_70 = __stackOp390_67_0;
    (__stackOp390_67_0)[0] = -1;
    int[] __stackOp390_68_0 = spill390_70;
    spill390_71 = __stackOp390_68_0;
    (__stackOp390_68_0)[1] = 0;
    int[] __stackOp390_69_0 = spill390_71;
    spill390_72 = __stackOp390_69_0;
    (__stackOp390_69_0)[2] = -1;
    (spill390_68)[spill390_69] = spill390_72;
    int[][] __stackOp390_70_0 = spill390_67;
    spill390_73 = __stackOp390_70_0;
    spill390_74 = __stackOp390_70_0;
    spill390_75 = __sourceIntrinsic_eb8803ad1f63_invokedynamic390_71(26071, (3768906060705365937L ^ life11_11));
    int[] __stackOp390_72_0 = new int[3];
    spill390_76 = __stackOp390_72_0;
    (__stackOp390_72_0)[0] = 0;
    int[] __stackOp390_73_0 = spill390_76;
    spill390_77 = __stackOp390_73_0;
    (__stackOp390_73_0)[1] = 1;
    int[] __stackOp390_74_0 = spill390_77;
    spill390_78 = __stackOp390_74_0;
    (__stackOp390_74_0)[2] = 1;
    (spill390_74)[spill390_75] = spill390_78;
    int[][] __stackOp390_75_0 = spill390_73;
    spill390_79 = __stackOp390_75_0;
    spill390_80 = __stackOp390_75_0;
    spill390_81 = __sourceIntrinsic_eb8803ad1f63_invokedynamic390_76(11861, (7821357095323382845L ^ life11_11));
    int[] __stackOp390_77_0 = new int[3];
    spill390_82 = __stackOp390_77_0;
    (__stackOp390_77_0)[0] = 0;
    int[] __stackOp390_78_0 = spill390_82;
    spill390_83 = __stackOp390_78_0;
    (__stackOp390_78_0)[1] = -1;
    int[] __stackOp390_79_0 = spill390_83;
    spill390_84 = __stackOp390_79_0;
    (__stackOp390_79_0)[2] = 1;
    (spill390_80)[spill390_81] = spill390_84;
    int[][] __stackOp390_80_0 = spill390_79;
    spill390_85 = __stackOp390_80_0;
    spill390_86 = __stackOp390_80_0;
    spill390_87 = __sourceIntrinsic_eb8803ad1f63_invokedynamic390_81(12778, (8860235128044759936L ^ life11_11));
    int[] __stackOp390_82_0 = new int[3];
    spill390_88 = __stackOp390_82_0;
    (__stackOp390_82_0)[0] = 0;
    int[] __stackOp390_83_0 = spill390_88;
    spill390_89 = __stackOp390_83_0;
    (__stackOp390_83_0)[1] = 1;
    int[] __stackOp390_84_0 = spill390_89;
    spill390_90 = __stackOp390_84_0;
    (__stackOp390_84_0)[2] = -1;
    (spill390_86)[spill390_87] = spill390_90;
    int[][] __stackOp390_85_0 = spill390_85;
    spill390_91 = __stackOp390_85_0;
    spill390_92 = __stackOp390_85_0;
    spill390_93 = __sourceIntrinsic_eb8803ad1f63_invokedynamic390_86(9950, (3513812764287057082L ^ life11_11));
    int[] __stackOp390_87_0 = new int[3];
    spill390_94 = __stackOp390_87_0;
    (__stackOp390_87_0)[0] = 0;
    int[] __stackOp390_88_0 = spill390_94;
    spill390_95 = __stackOp390_88_0;
    (__stackOp390_88_0)[1] = -1;
    int[] __stackOp390_89_0 = spill390_95;
    spill390_96 = __stackOp390_89_0;
    (__stackOp390_89_0)[2] = -1;
    (spill390_92)[spill390_93] = spill390_96;
    a = ((int[][])(spill390_91));
    b = ((double)(java.lang.Math.sqrt(((double)(0x1.8p1d)))));
    g = ((double)((0x1.0p-1d * (moom.FX.b - 0x1.0p0d))));
    h = ((double)(((0x1.8p1d - moom.FX.b) / 0x1.8p2d)));
}

private static native <E extends Throwable> void __sourceConstructorInit_a6e5f5693ec7e604_0(moom.FX a0) throws E;

private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_d90c5addd38362(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x5090;
        if (k[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = j[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])FX.l.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    FX.l.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/FX", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            FX.k[n2] = n3;
        }
        return k[n2];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4519_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/FX"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(double p0) {
int forwardValue1927_17_0;
    int forwardValue1927_19_0;
    int spill1927_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_19: {
    forward_join_17: {
    forward_join_15: {
    life2_3 = (moom.FX.i ^ 90356947589812L);
    life4_5 = moom.FI.b();
    spill1927_0 = recovery.source.CarrierOps.dcmpl(((double)(p0)), ((double)(0x0.0p0d)));
    if (!((life4_5 != null))) {
        forwardValue1927_17_0 = spill1927_0;
        break forward_join_17;
    }
    if (!((spill1927_0 > 0))) {
        break forward_join_15;
    }
    forwardValue1927_19_0 = ((int) p0);
    break forward_join_19;
    }
    forwardValue1927_17_0 = ((int) p0);
    }
    forwardValue1927_19_0 = (forwardValue1927_17_0 - 1);
    }
    return forwardValue1927_19_0;
}


private static double a(int[] p0, double p1, double p2) {
return ((((double) (p0)[0]) * p1) + (((double) (p0)[1]) * p2));
}


public double a(double p0, double p1) {
int forwardValue1928_72_0;
    double forwardValue1928_210_0;
    double forwardValue1928_210_1;
    double forwardValue1928_245_0;
    double forwardValue1928_245_1;
    double forwardValue1928_280_0;
    double forwardValue1928_280_1;
    java.lang.String[] spill1928_0;
    int spill1928_1;
    double spill1928_2;
    double spill1928_3;
    double spill1928_4;
    double spill1928_5;
    double spill1928_6;
    double spill1928_7;
    long life5_3;
    double life8_10;
    double life10_16;
    int life12_21;
    int life13_26;
    double life14_32;
    double life16_39;
    double life18_44;
    double life20_49;
    java.lang.String[] life7_50;
    double life22_54;
    double life24_58;
    int life26_69;
    int life27_71;
    double life28_87;
    double life30_94;
    double life32_102;
    double life34_110;
    int life36_118;
    int life37_126;
    int life38_142;
    int life39_162;
    int life40_182;
    double life41_192;
    double life43_203;
    double life41_209;
    double life45_230;
    double life47_241;
    double life45_247;
    double life49_268;
    double life51_279;
    double life49_285;
    forward_join_282: {
    forward_join_280: {
    forward_join_267: {
    forward_join_247: {
    forward_join_245: {
    forward_join_232: {
    forward_join_212: {
    forward_join_210: {
    forward_join_197: {
    forward_join_75: {
    forward_join_72: {
    forward_join_71: {
    life5_3 = (moom.FX.i ^ 41902272937740L);
    spill1928_0 = moom.FI.b();
    life8_10 = (0x1.0p-1d * (moom.FX.b - 0x1.0p0d));
    life10_16 = ((p0 + p1) * life8_10);
    life12_21 = moom.FX.a(((double)((p0 + life10_16))));
    life13_26 = moom.FX.a(((double)((p1 + life10_16))));
    life14_32 = ((0x1.8p1d - moom.FX.b) / 0x1.8p2d);
    life16_39 = (((double) (life12_21 + life13_26)) * life14_32);
    life18_44 = (((double) life12_21) - life16_39);
    life20_49 = (((double) life13_26) - life16_39);
    life7_50 = spill1928_0;
    life22_54 = (p0 - life18_44);
    life24_58 = (p1 - life20_49);
    spill1928_1 = recovery.source.CarrierOps.dcmpl(((double)(life22_54)), ((double)(life24_58)));
    if (!((life7_50 != null))) {
        forwardValue1928_72_0 = spill1928_1;
        break forward_join_72;
    }
    if (!((spill1928_1 > 0))) {
        break forward_join_71;
    }
    life26_69 = 1;
    life27_71 = 0;
    if (!((life7_50 == null))) {
        break forward_join_75;
    }
    }
    forwardValue1928_72_0 = 0;
    }
    life26_69 = forwardValue1928_72_0;
    life27_71 = 1;
    }
    life28_87 = ((life22_54 - ((double) life26_69)) + life14_32);
    life30_94 = ((life24_58 - ((double) life27_71)) + life14_32);
    life32_102 = ((life22_54 - 0x1.0p0d) + (0x1.0p1d * life14_32));
    life34_110 = ((life24_58 - 0x1.0p0d) + (0x1.0p1d * life14_32));
    life36_118 = (life12_21 & __sourceIntrinsic_5e7be2bd3aa2_invokedynamic1928_7(28938, (5896877921479551114L ^ life5_3)));
    life37_126 = (life13_26 & __sourceIntrinsic_5e7be2bd3aa2_invokedynamic1928_8(28938, (5896877921479551114L ^ life5_3)));
    life38_142 = ((this.c)[(life36_118 + (this.c)[life37_126])] % __sourceIntrinsic_5e7be2bd3aa2_invokedynamic1928_11(2783, (725286501166879574L ^ life5_3)));
    life39_162 = ((this.c)[((life36_118 + life26_69) + (this.c)[(life37_126 + life27_71)])] % __sourceIntrinsic_5e7be2bd3aa2_invokedynamic1928_14(2783, (725286501166879574L ^ life5_3)));
    life40_182 = ((this.c)[((life36_118 + 1) + (this.c)[(life37_126 + 1)])] % __sourceIntrinsic_5e7be2bd3aa2_invokedynamic1928_17(2783, (725286501166879574L ^ life5_3)));
    life41_192 = ((0x1.0p-1d - (life22_54 * life22_54)) - (life24_58 * life24_58));
    spill1928_2 = life41_192;
    spill1928_3 = 0x0.0p0d;
    if (!((life7_50 != null))) {
        forwardValue1928_210_0 = spill1928_2;
        forwardValue1928_210_1 = spill1928_3;
        break forward_join_210;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(spill1928_2)), ((double)(spill1928_3))) < 0))) {
        break forward_join_197;
    }
    life43_203 = 0x0.0p0d;
    if (!((life7_50 == null))) {
        break forward_join_212;
    }
    }
    life41_209 = (life41_192 * life41_192);
    forwardValue1928_210_0 = (life41_209 * life41_209);
    forwardValue1928_210_1 = moom.FX.a(((int[])((moom.FX.a)[life38_142])), ((double)(life22_54)), ((double)(life24_58)));
    }
    life43_203 = (forwardValue1928_210_0 * forwardValue1928_210_1);
    }
    life45_230 = ((0x1.0p-1d - (life28_87 * life28_87)) - (life30_94 * life30_94));
    spill1928_4 = life45_230;
    spill1928_5 = 0x0.0p0d;
    if (!((life7_50 != null))) {
        forwardValue1928_245_0 = spill1928_4;
        forwardValue1928_245_1 = spill1928_5;
        break forward_join_245;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(spill1928_4)), ((double)(spill1928_5))) < 0))) {
        break forward_join_232;
    }
    life47_241 = 0x0.0p0d;
    if (!((life7_50 == null))) {
        break forward_join_247;
    }
    }
    life45_247 = (life45_230 * life45_230);
    forwardValue1928_245_0 = (life45_247 * life45_247);
    forwardValue1928_245_1 = moom.FX.a(((int[])((moom.FX.a)[life39_162])), ((double)(life28_87)), ((double)(life30_94)));
    }
    life47_241 = (forwardValue1928_245_0 * forwardValue1928_245_1);
    }
    life49_268 = ((0x1.0p-1d - (life32_102 * life32_102)) - (life34_110 * life34_110));
    spill1928_6 = life49_268;
    spill1928_7 = 0x0.0p0d;
    if (!((life7_50 != null))) {
        forwardValue1928_280_0 = spill1928_6;
        forwardValue1928_280_1 = spill1928_7;
        break forward_join_280;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(spill1928_6)), ((double)(spill1928_7))) < 0))) {
        break forward_join_267;
    }
    life51_279 = 0x0.0p0d;
    if (!((life7_50 == null))) {
        break forward_join_282;
    }
    }
    life49_285 = (life49_268 * life49_268);
    forwardValue1928_280_0 = (life49_285 * life49_285);
    forwardValue1928_280_1 = moom.FX.a(((int[])((moom.FX.a)[life40_182])), ((double)(life32_102)), ((double)(life34_110)));
    }
    life51_279 = (forwardValue1928_280_0 * forwardValue1928_280_1);
    }
    return (0x1.18p6d * ((life43_203 + life47_241) + life51_279));
}


public void a(double[] p0, double p1, double p2, int p3, int p4, double p5, double p6, double p7) {
int forestValue626_11_0;
    int forestValue626_94_0;
    double forestValue626_232_0;
    double forestValue626_232_1;
    double forestValue626_267_0;
    double forestValue626_267_1;
    double forestValue626_302_0;
    double forestValue626_302_1;
    java.lang.String[] spill626_0;
    int spill626_1;
    double spill626_2;
    double spill626_3;
    double spill626_4;
    double spill626_5;
    double spill626_6;
    double spill626_7;
    long life14_3;
    int life17_6;
    java.lang.String[] life16_7;
    int life18_9;
    double life19_22;
    int life21_24;
    double life22_37;
    double life24_43;
    int life26_48;
    int life27_53;
    double life28_60;
    double life30_65;
    double life32_70;
    double life34_74;
    double life36_78;
    int life38_89;
    int life39_91;
    double life40_105;
    double life42_112;
    double life44_120;
    double life46_128;
    int life48_136;
    int life49_144;
    int life50_160;
    int life51_180;
    int life52_200;
    double life53_210;
    double life55_219;
    double life53_225;
    double life57_246;
    double life59_255;
    double life57_261;
    double life61_282;
    double life63_291;
    double life61_297;
    int life65_311;
    forest_join_328: {
    life14_3 = (moom.FX.i ^ 113662365184424L);
    spill626_0 = moom.FI.b();
    life17_6 = 0;
    life16_7 = spill626_0;
    life18_9 = 0;
    forest_cycle_10: while (true) {
    forest_join_325: {
    forestValue626_11_0 = life18_9;
    forest_cycle_11: while (true) {
    if (!((forestValue626_11_0 < p4))) {
        break forest_join_328;
    }
    life19_22 = (((p2 + ((double) life18_9)) * p6) + this.e);
    life21_24 = 0;
    forest_cycle_25: while (true) {
    forest_join_304: {
    forest_join_302: {
    forest_join_289: {
    forest_join_269: {
    forest_join_267: {
    forest_join_254: {
    forest_join_234: {
    forest_join_232: {
    forest_join_219: {
    forest_join_97: {
    forest_join_94: {
    forest_join_93: {
    if (!((life21_24 < p3))) {
        break forest_join_325;
    }
    life22_37 = (((p1 + ((double) life21_24)) * p5) + this.d);
    life24_43 = ((life22_37 + life19_22) * moom.FX.g);
    life26_48 = moom.FX.a(((double)((life22_37 + life24_43))));
    life27_53 = moom.FX.a(((double)((life19_22 + life24_43))));
    life28_60 = (((double) (life26_48 + life27_53)) * moom.FX.h);
    life30_65 = (((double) life26_48) - life28_60);
    life32_70 = (((double) life27_53) - life28_60);
    life34_74 = (life22_37 - life30_65);
    life36_78 = (life19_22 - life32_70);
    spill626_1 = recovery.source.CarrierOps.dcmpl(((double)(life34_74)), ((double)(life36_78)));
    if (!((life16_7 != null))) {
        forestValue626_11_0 = spill626_1;
        continue forest_cycle_11;
    }
    if (!((life16_7 != null))) {
        forestValue626_94_0 = spill626_1;
        break forest_join_94;
    }
    if (!((spill626_1 > 0))) {
        break forest_join_93;
    }
    life38_89 = 1;
    life39_91 = 0;
    if (!((life16_7 == null))) {
        break forest_join_97;
    }
    }
    forestValue626_94_0 = 0;
    }
    life38_89 = forestValue626_94_0;
    life39_91 = 1;
    }
    life40_105 = ((life34_74 - ((double) life38_89)) + moom.FX.h);
    life42_112 = ((life36_78 - ((double) life39_91)) + moom.FX.h);
    life44_120 = ((life34_74 - 0x1.0p0d) + (0x1.0p1d * moom.FX.h));
    life46_128 = ((life36_78 - 0x1.0p0d) + (0x1.0p1d * moom.FX.h));
    life48_136 = (life26_48 & __sourceIntrinsic_3c8873a51f67_invokedynamic626_13(28641, (7502397270122051790L ^ life14_3)));
    life49_144 = (life27_53 & __sourceIntrinsic_3c8873a51f67_invokedynamic626_14(28938, (5896806505663997486L ^ life14_3)));
    life50_160 = ((this.c)[(life48_136 + (this.c)[life49_144])] % __sourceIntrinsic_3c8873a51f67_invokedynamic626_17(2783, (725358020594327026L ^ life14_3)));
    life51_180 = ((this.c)[((life48_136 + life38_89) + (this.c)[(life49_144 + life39_91)])] % __sourceIntrinsic_3c8873a51f67_invokedynamic626_20(2783, (725358020594327026L ^ life14_3)));
    life52_200 = ((this.c)[((life48_136 + 1) + (this.c)[(life49_144 + 1)])] % __sourceIntrinsic_3c8873a51f67_invokedynamic626_23(2783, (725358020594327026L ^ life14_3)));
    life53_210 = ((0x1.0p-1d - (life34_74 * life34_74)) - (life36_78 * life36_78));
    spill626_2 = life53_210;
    spill626_3 = 0x0.0p0d;
    if (!((life16_7 != null))) {
        forestValue626_232_0 = spill626_2;
        forestValue626_232_1 = spill626_3;
        break forest_join_232;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(spill626_2)), ((double)(spill626_3))) < 0))) {
        break forest_join_219;
    }
    life55_219 = 0x0.0p0d;
    if (!((life16_7 == null))) {
        break forest_join_234;
    }
    }
    life53_225 = (life53_210 * life53_210);
    forestValue626_232_0 = (life53_225 * life53_225);
    forestValue626_232_1 = moom.FX.a(((int[])((moom.FX.a)[life50_160])), ((double)(life34_74)), ((double)(life36_78)));
    }
    life55_219 = (forestValue626_232_0 * forestValue626_232_1);
    }
    life57_246 = ((0x1.0p-1d - (life40_105 * life40_105)) - (life42_112 * life42_112));
    spill626_4 = life57_246;
    spill626_5 = 0x0.0p0d;
    if (!((life16_7 != null))) {
        forestValue626_267_0 = spill626_4;
        forestValue626_267_1 = spill626_5;
        break forest_join_267;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(spill626_4)), ((double)(spill626_5))) < 0))) {
        break forest_join_254;
    }
    life59_255 = 0x0.0p0d;
    if (!((life16_7 == null))) {
        break forest_join_269;
    }
    }
    life57_261 = (life57_246 * life57_246);
    forestValue626_267_0 = (life57_261 * life57_261);
    forestValue626_267_1 = moom.FX.a(((int[])((moom.FX.a)[life51_180])), ((double)(life40_105)), ((double)(life42_112)));
    }
    life59_255 = (forestValue626_267_0 * forestValue626_267_1);
    }
    life61_282 = ((0x1.0p-1d - (life44_120 * life44_120)) - (life46_128 * life46_128));
    spill626_6 = life61_282;
    spill626_7 = 0x0.0p0d;
    if (!((life16_7 != null))) {
        forestValue626_302_0 = spill626_6;
        forestValue626_302_1 = spill626_7;
        break forest_join_302;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(spill626_6)), ((double)(spill626_7))) < 0))) {
        break forest_join_289;
    }
    life63_291 = 0x0.0p0d;
    if (!((life16_7 == null))) {
        break forest_join_304;
    }
    }
    life61_297 = (life61_282 * life61_282);
    forestValue626_302_0 = (life61_297 * life61_297);
    forestValue626_302_1 = moom.FX.a(((int[])((moom.FX.a)[life52_200])), ((double)(life44_120)), ((double)(life46_128)));
    }
    life63_291 = (forestValue626_302_0 * forestValue626_302_1);
    }
    life65_311 = (life17_6++);
    double[] __stackOp626_33_0 = p0;
    int __stackOp626_33_1 = life65_311;
    (__stackOp626_33_0)[__stackOp626_33_1] = ((__stackOp626_33_0)[__stackOp626_33_1] + ((0x1.18p6d * ((life55_219 + life59_255) + life63_291)) * p7));
    life21_24 += 1;
    if (!((life16_7 == null))) {
        continue forest_cycle_25;
    }
    break forest_cycle_25;
    }
    break forest_cycle_11;
    }
    }
    life18_9 += 1;
    if (!((life16_7 == null))) {
        continue forest_cycle_10;
    }
    break forest_cycle_10;
    }
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic390_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic390_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic390_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic390_71(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic390_76(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic390_81(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic390_86(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a6e5f5693ec7e604_originalDynamicSite492_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a6e5f5693ec7e604_originalDynamicSite492_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a6e5f5693ec7e604_originalDynamicSite492_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a6e5f5693ec7e604_originalDynamicSite492_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a6e5f5693ec7e604_originalDynamicSite492_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5e7be2bd3aa2_invokedynamic1928_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5e7be2bd3aa2_invokedynamic1928_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5e7be2bd3aa2_invokedynamic1928_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5e7be2bd3aa2_invokedynamic1928_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5e7be2bd3aa2_invokedynamic1928_17(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4519_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3c8873a51f67_invokedynamic626_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3c8873a51f67_invokedynamic626_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3c8873a51f67_invokedynamic626_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3c8873a51f67_invokedynamic626_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3c8873a51f67_invokedynamic626_23(int a0, long a1) throws E;

private static native int __sourceExactCall_d90c5addd38362(int p0, long p1);
}
