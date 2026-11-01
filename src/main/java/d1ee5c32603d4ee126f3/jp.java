package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class jp extends moom.iQ {

public moom.jD[] i;

public moom.jD[] j;

private float[] k;

private static int[][] l;

private static int[][] m;

private static long n;

private static long[] o;

private static java.lang.Integer[] p;

private static java.util.Map q;

public jp() { super(); }


private static void __sourceConstructorBody_32ccfe93d5de2c72(moom.jp receiver) throws Throwable {

long local1_life2;

    float local4_life13;

    int local5_life14;

    net.minecraft.entity.Entity[] local3_life15;

    init_join_318: {

    init_join_146: {

    local1_life2 = (moom.jp.n ^ 3609074931400L);

    moom.jp.__sourceConstructorInit_32ccfe93d5de2c72_0(((moom.jp)(receiver)));

    net.minecraft.entity.Entity[] __sourceSpill684_8 = moom.iQ.b();

    ((moom.jp)(receiver)).i = ((moom.jD[])(new moom.jD[__sourceIntrinsic_32ccfe93d5de2c72_originalDynamicSite684_6(3391, (943368536318063627L ^ local1_life2))]));

    ((moom.jp)(receiver)).k = ((float[])(new float[__sourceIntrinsic_32ccfe93d5de2c72_originalDynamicSite684_10(31307, (2665135829167260529L ^ local1_life2))]));

    local4_life13 = -1067450368;

    local5_life14 = 0;

    local3_life15 = __sourceSpill684_8;

    init_cycle_28: while (true) {

    init_join_144: {

    init_join_143: {

    if (!((local5_life14 < (((moom.jp)(receiver)).i).length))) {

        break init_join_146;

    }

    (((moom.jp)(receiver)).i)[local5_life14] = new moom.jD(((moom.iQ) receiver), ((moom.jp.m)[local5_life14])[0], ((moom.jp.m)[local5_life14])[1]);

    ((moom.jD)((((moom.jp)(receiver)).i)[local5_life14])).a(((float)((((float) ((moom.jp.l)[local5_life14])[0]) * -1090519040))), ((float)(0x0.0p0f)), ((float)((((float) ((moom.jp.l)[local5_life14])[2]) * -1090519040))), ((int)(((moom.jp.l)[local5_life14])[0])), ((int)(((moom.jp.l)[local5_life14])[1])), ((int)(((moom.jp.l)[local5_life14])[2])));

    ((moom.jD)((((moom.jp)(receiver)).i)[local5_life14])).a(((float)(0x0.0p0f)), ((float)(((float) (__sourceIntrinsic_32ccfe93d5de2c72_originalDynamicSite684_31(4730, (5493311662495869771L ^ local1_life2)) - ((moom.jp.l)[local5_life14])[1])))), ((float)(local4_life13)));

    (((moom.jp)(receiver)).k)[local5_life14] = local4_life13;

    if (!((local3_life15 != null))) {

        break init_join_318;

    }

    if (!((local3_life15 != null))) {

        break init_join_144;

    }

    if (!((local5_life14 < ((((moom.jp)(receiver)).i).length - 1)))) {

        break init_join_143;

    }

    local4_life13 = (local4_life13 + (((float) (((moom.jp.l)[local5_life14])[2] + ((moom.jp.l)[(local5_life14 + 1)])[2])) * 1056964608));

    }

    local5_life14 += 1;

    }

    if (!((local3_life15 == null))) { continue init_cycle_28; }

    break init_cycle_28;

    }

    }

    ((moom.jp)(receiver)).j = ((moom.jD[])(new moom.jD[3]));

    (((moom.jp)(receiver)).j)[0] = new moom.jD(((moom.iQ) receiver), __sourceIntrinsic_32ccfe93d5de2c72_originalDynamicSite684_42(31259, (7020623783977468718L ^ local1_life2)), 0);

    ((moom.jD)((((moom.jp)(receiver)).j)[0])).a(((float)(-1063256064)), ((float)(0x0.0p0f)), ((float)((((float) ((moom.jp.l)[2])[2]) * -1090519040))), ((int)(__sourceIntrinsic_32ccfe93d5de2c72_originalDynamicSite684_48(28930, (7586092049440819259L ^ local1_life2)))), ((int)(__sourceIntrinsic_32ccfe93d5de2c72_originalDynamicSite684_50(31070, (3571676040664825961L ^ local1_life2)))), ((int)(((moom.jp.l)[2])[2])));

    ((moom.jD)((((moom.jp)(receiver)).j)[0])).a(((float)(0x0.0p0f)), ((float)(1098907648)), ((float)((((moom.jp)(receiver)).k)[2])));

    (((moom.jp)(receiver)).j)[1] = new moom.jD(((moom.iQ) receiver), __sourceIntrinsic_32ccfe93d5de2c72_originalDynamicSite684_59(31024, (5035199214652702726L ^ local1_life2)), __sourceIntrinsic_32ccfe93d5de2c72_originalDynamicSite684_61(8831, (8505604958428601155L ^ local1_life2)));

    ((moom.jD)((((moom.jp)(receiver)).j)[1])).a(((float)(-1069547520)), ((float)(0x0.0p0f)), ((float)((((float) ((moom.jp.l)[4])[2]) * -1090519040))), ((int)(__sourceIntrinsic_32ccfe93d5de2c72_originalDynamicSite684_67(24920, (1915565754280728680L ^ local1_life2)))), ((int)(4)), ((int)(((moom.jp.l)[4])[2])));

    ((moom.jD)((((moom.jp)(receiver)).j)[1])).a(((float)(0x0.0p0f)), ((float)(1101004800)), ((float)((((moom.jp)(receiver)).k)[4])));

    (((moom.jp)(receiver)).j)[2] = new moom.jD(((moom.iQ) receiver), __sourceIntrinsic_32ccfe93d5de2c72_originalDynamicSite684_76(31024, (5035199214652702726L ^ local1_life2)), __sourceIntrinsic_32ccfe93d5de2c72_originalDynamicSite684_78(30133, (3274377916950924427L ^ local1_life2)));

    ((moom.jD)((((moom.jp)(receiver)).j)[2])).a(((float)(-1069547520)), ((float)(0x0.0p0f)), ((float)((((float) ((moom.jp.l)[4])[2]) * -1090519040))), ((int)(__sourceIntrinsic_32ccfe93d5de2c72_originalDynamicSite684_84(15854, (7542309117678486739L ^ local1_life2)))), ((int)(5)), ((int)(((moom.jp.l)[1])[2])));

    ((moom.jD)((((moom.jp)(receiver)).j)[2])).a(((float)(0x0.0p0f)), ((float)(1100480512)), ((float)((((moom.jp)(receiver)).k)[1])));

    }

    return;

}



static {
javax.crypto.Cipher forestValue474_36_0;
    int forestValue474_36_1;
    javax.crypto.SecretKeyFactory forestValue474_36_2;
    byte[] forestValue474_36_3;
    javax.crypto.Cipher forestValue474_53_0;
    int forestValue474_53_1;
    javax.crypto.SecretKeyFactory forestValue474_53_2;
    byte[] forestValue474_53_3;
    long[] forestValue474_157_0;
    int forestValue474_157_1;
    long forestValue474_157_2;
    int forestValue474_157_3;
    long[] forestValue474_300_0;
    int forestValue474_300_1;
    long forestValue474_300_2;
    long[] forestValue474_312_0;
    int forestValue474_312_1;
    long forestValue474_312_2;
    javax.crypto.Cipher spill474_0;
    int spill474_1;
    javax.crypto.SecretKeyFactory spill474_2;
    byte[] spill474_3;
    byte[] spill474_4;
    java.lang.String spill474_5;
    int spill474_6;
    int spill474_7;
    long spill474_8;
    byte[] spill474_9;
    byte[] spill474_10;
    byte[] spill474_11;
    byte[] spill474_12;
    byte[] spill474_13;
    byte[] spill474_14;
    byte[] spill474_15;
    byte[] spill474_16;
    long spill474_17;
    int spill474_18;
    java.lang.String spill474_19;
    int spill474_20;
    long[] spill474_21;
    int spill474_22;
    long spill474_23;
    int spill474_24;
    int[][] spill474_25;
    int[][] spill474_26;
    int spill474_27;
    int[] spill474_28;
    int[] spill474_29;
    int[] spill474_30;
    int[][] spill474_31;
    int[][] spill474_32;
    int spill474_33;
    int[] spill474_34;
    int[] spill474_35;
    int[] spill474_36;
    int[][] spill474_37;
    int[][] spill474_38;
    int spill474_39;
    int[] spill474_40;
    int[] spill474_41;
    int[] spill474_42;
    int[][] spill474_43;
    int[][] spill474_44;
    int spill474_45;
    int[] spill474_46;
    int[] spill474_47;
    int[] spill474_48;
    int[][] spill474_49;
    int[][] spill474_50;
    int spill474_51;
    int[] spill474_52;
    int[] spill474_53;
    int[] spill474_54;
    int[][] spill474_55;
    int[][] spill474_56;
    int spill474_57;
    int[] spill474_58;
    int[] spill474_59;
    int[] spill474_60;
    int[][] spill474_61;
    int[][] spill474_62;
    int spill474_63;
    int[] spill474_64;
    int[] spill474_65;
    int[] spill474_66;
    int[][] spill474_67;
    int[][] spill474_68;
    int spill474_69;
    int[] spill474_70;
    int[] spill474_71;
    int[][] spill474_72;
    int[][] spill474_73;
    int spill474_74;
    int[] spill474_75;
    int[] spill474_76;
    int[][] spill474_77;
    int[][] spill474_78;
    int spill474_79;
    int[] spill474_80;
    int[] spill474_81;
    int[][] spill474_82;
    int[][] spill474_83;
    int spill474_84;
    int[] spill474_85;
    int[] spill474_86;
    int[][] spill474_87;
    int[][] spill474_88;
    int spill474_89;
    int[] spill474_90;
    int[] spill474_91;
    int[][] spill474_92;
    int[][] spill474_93;
    int spill474_94;
    int[] spill474_95;
    int[] spill474_96;
    int[][] spill474_97;
    int[][] spill474_98;
    int spill474_99;
    int[] spill474_100;
    int[] spill474_101;
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
    n = ((long)(((moom._a)(moom._c.a(((long)(9088002253209512792L)), ((long)(6232956120121795273L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(234240265027280L)))));
    life11_11 = (moom.jp.n ^ 132594546360112L);
    q = ((java.util.Map)(new java.util.HashMap(13)));
    spill474_0 = (life0_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill474_1 = 2;
    spill474_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp474_9_0 = new byte[8];
    spill474_3 = __stackOp474_9_0;
    (__stackOp474_9_0)[0] = ((byte) ((int) (life11_11 >>> 56)));
    life1_35 = 1;
    forestValue474_36_0 = spill474_0;
    forestValue474_36_1 = spill474_1;
    forestValue474_36_2 = spill474_2;
    forestValue474_36_3 = spill474_3;
    forest_cycle_36: while (true) {
    if (!((life1_35 < 8))) {
        forestValue474_53_0 = forestValue474_36_0;
        forestValue474_53_1 = forestValue474_36_1;
        forestValue474_53_2 = forestValue474_36_2;
        forestValue474_53_3 = forestValue474_36_3;
        break forest_join_53;
    }
    byte[] __stackOp474_10_0 = forestValue474_36_3;
    spill474_4 = __stackOp474_10_0;
    (__stackOp474_10_0)[life1_35] = ((byte) ((int) ((life11_11 << (life1_35 * 8)) >>> 56)));
    life1_35 += 1;
    forestValue474_36_3 = spill474_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue474_53_0)).init(((int)(forestValue474_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue474_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue474_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life6_66 = new long[16];
    life3_68 = 0;
    life5_73 = ((java.lang.String)((life4_71 = "¬ÏE%\f«x!%ÝP*ö·\020ßG¯X¿\006æô\005äÓ\177Zöäª\000ÙÕ\013ñ¾#|jhm\000 \002\tìîDhþ\007þª\006ÇÌ|ùÉbT}`\nÈ^^uÙ\024*¹$L\007%nG\"¤³Ý@t6÷\006K²¸i;·¨\026Î\024ÒÄQ×·´¡`"))).length();
    life2_75 = 0;
    forest_cycle_76: while (true) {
    spill474_5 = life4_71;
    spill474_6 = life2_75;
    life2_75 += 8;
    life7_83 = ((java.lang.String)(((java.lang.String)(spill474_5)).substring(((int)(spill474_6)), ((int)(life2_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    forestValue474_157_0 = life6_66;
    forestValue474_157_1 = (life3_68++);
    forestValue474_157_2 = (((((((((((long) (life7_83)[0]) & 255L) << 56) | ((((long) (life7_83)[1]) & 255L) << 48)) | ((((long) (life7_83)[2]) & 255L) << 40)) | ((((long) (life7_83)[3]) & 255L) << 32)) | ((((long) (life7_83)[4]) & 255L) << 24)) | ((((long) (life7_83)[5]) & 255L) << 16)) | ((((long) (life7_83)[6]) & 255L) << 8)) | (((long) (life7_83)[7]) & 255L));
    forestValue474_157_3 = -1;
    forest_cycle_157: while (true) {
    forest_join_317: {
    forest_join_312: {
    forest_join_300: {
    long __stackOp474_16_0 = forestValue474_157_2;
    int __stackOp474_16_1 = forestValue474_157_3;
    spill474_7 = __stackOp474_16_1;
    spill474_8 = __stackOp474_16_0;
    recovery.source.CarrierOps.discard(__stackOp474_16_1);
    life8_160 = spill474_8;
    byte[] __stackOp474_18_0 = new byte[8];
    spill474_9 = __stackOp474_18_0;
    (__stackOp474_18_0)[0] = ((byte) ((int) (life8_160 >>> 56)));
    byte[] __stackOp474_19_0 = spill474_9;
    spill474_10 = __stackOp474_19_0;
    (__stackOp474_19_0)[1] = ((byte) ((int) (life8_160 >>> 48)));
    byte[] __stackOp474_20_0 = spill474_10;
    spill474_11 = __stackOp474_20_0;
    (__stackOp474_20_0)[2] = ((byte) ((int) (life8_160 >>> 40)));
    byte[] __stackOp474_21_0 = spill474_11;
    spill474_12 = __stackOp474_21_0;
    (__stackOp474_21_0)[3] = ((byte) ((int) (life8_160 >>> 32)));
    byte[] __stackOp474_22_0 = spill474_12;
    spill474_13 = __stackOp474_22_0;
    (__stackOp474_22_0)[4] = ((byte) ((int) (life8_160 >>> 24)));
    byte[] __stackOp474_23_0 = spill474_13;
    spill474_14 = __stackOp474_23_0;
    (__stackOp474_23_0)[5] = ((byte) ((int) (life8_160 >>> 16)));
    byte[] __stackOp474_24_0 = spill474_14;
    spill474_15 = __stackOp474_24_0;
    (__stackOp474_24_0)[6] = ((byte) ((int) (life8_160 >>> 8)));
    byte[] __stackOp474_25_0 = spill474_15;
    spill474_16 = __stackOp474_25_0;
    (__stackOp474_25_0)[7] = ((byte) ((int) life8_160));
    byte[] __stackOp474_26_0 = spill474_16;
    javax.crypto.Cipher __stackOp474_26_1 = life0_20;
    life10_228 = ((javax.crypto.Cipher)(__stackOp474_26_1)).doFinal(((byte[])(__stackOp474_26_0)));
    int __stackOp474_28_0 = spill474_7;
    long __stackOp474_28_1 = (((((((((((long) (life10_228)[0]) & 255L) << 56) | ((((long) (life10_228)[1]) & 255L) << 48)) | ((((long) (life10_228)[2]) & 255L) << 40)) | ((((long) (life10_228)[3]) & 255L) << 32)) | ((((long) (life10_228)[4]) & 255L) << 24)) | ((((long) (life10_228)[5]) & 255L) << 16)) | ((((long) (life10_228)[6]) & 255L) << 8)) | (((long) (life10_228)[7]) & 255L));
    spill474_17 = __stackOp474_28_1;
    spill474_18 = __stackOp474_28_0;
    recovery.source.CarrierOps.discard(__stackOp474_28_1);
    switch (spill474_18) {
default:
{
        forestValue474_300_0 = forestValue474_157_0;
        forestValue474_300_1 = forestValue474_157_1;
        forestValue474_300_2 = spill474_17;
        break forest_join_300;
    }
case 0:
{
        forestValue474_312_0 = forestValue474_157_0;
        forestValue474_312_1 = forestValue474_157_1;
        forestValue474_312_2 = spill474_17;
        break forest_join_312;
    }
}
    }
    (forestValue474_300_0)[forestValue474_300_1] = forestValue474_300_2;
    if (!((life2_75 >= life5_73))) {
        continue forest_cycle_76;
    }
    life5_73 = ((java.lang.String)((life4_71 = "Æ'~a\025Òw°\005ñ=\\\003\033"))).length();
    life2_75 = 0;
    break forest_join_317;
    }
    (forestValue474_312_0)[forestValue474_312_1] = forestValue474_312_2;
    if (!((life2_75 >= life5_73))) {
        break forest_join_317;
    }
    break forest_join_399;
    }
    spill474_19 = life4_71;
    spill474_20 = life2_75;
    life2_75 += 8;
    life7_325 = ((java.lang.String)(((java.lang.String)(spill474_19)).substring(((int)(spill474_20)), ((int)(life2_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    spill474_21 = life6_66;
    spill474_22 = (life3_68++);
    spill474_23 = (((((((((((long) (life7_325)[0]) & 255L) << 56) | ((((long) (life7_325)[1]) & 255L) << 48)) | ((((long) (life7_325)[2]) & 255L) << 40)) | ((((long) (life7_325)[3]) & 255L) << 32)) | ((((long) (life7_325)[4]) & 255L) << 24)) | ((((long) (life7_325)[5]) & 255L) << 16)) | ((((long) (life7_325)[6]) & 255L) << 8)) | (((long) (life7_325)[7]) & 255L));
    spill474_24 = 0;
    forestValue474_157_0 = spill474_21;
    forestValue474_157_1 = spill474_22;
    forestValue474_157_2 = spill474_23;
    forestValue474_157_3 = spill474_24;
    continue forest_cycle_157;
    }
    }
    }
    o = ((long[])(life6_66));
    p = ((java.lang.Integer[])(new java.lang.Integer[16]));
    int[][] __stackOp474_36_0 = new int[__sourceIntrinsic_eb8803ad1f63_invokedynamic474_35(31307, (2665019625893980809L ^ life11_11))][];
    spill474_25 = __stackOp474_36_0;
    spill474_26 = __stackOp474_36_0;
    spill474_27 = 0;
    int[] __stackOp474_37_0 = new int[3];
    spill474_28 = __stackOp474_37_0;
    (__stackOp474_37_0)[0] = 3;
    int[] __stackOp474_38_0 = spill474_28;
    spill474_29 = __stackOp474_38_0;
    (__stackOp474_38_0)[1] = 2;
    int[] __stackOp474_39_0 = spill474_29;
    spill474_30 = __stackOp474_39_0;
    (__stackOp474_39_0)[2] = 2;
    (spill474_26)[spill474_27] = spill474_30;
    int[][] __stackOp474_40_0 = spill474_25;
    spill474_31 = __stackOp474_40_0;
    spill474_32 = __stackOp474_40_0;
    spill474_33 = 1;
    int[] __stackOp474_41_0 = new int[3];
    spill474_34 = __stackOp474_41_0;
    (__stackOp474_41_0)[0] = 4;
    int[] __stackOp474_42_0 = spill474_34;
    spill474_35 = __stackOp474_42_0;
    (__stackOp474_42_0)[1] = 3;
    int[] __stackOp474_43_0 = spill474_35;
    spill474_36 = __stackOp474_43_0;
    (__stackOp474_43_0)[2] = 2;
    (spill474_32)[spill474_33] = spill474_36;
    int[][] __stackOp474_44_0 = spill474_31;
    spill474_37 = __stackOp474_44_0;
    spill474_38 = __stackOp474_44_0;
    spill474_39 = 2;
    int[] __stackOp474_45_0 = new int[3];
    spill474_40 = __stackOp474_45_0;
    (__stackOp474_45_0)[0] = __sourceIntrinsic_eb8803ad1f63_invokedynamic474_46(15854, (7542352893540445483L ^ life11_11));
    int[] __stackOp474_47_0 = spill474_40;
    spill474_41 = __stackOp474_47_0;
    (__stackOp474_47_0)[1] = 4;
    int[] __stackOp474_48_0 = spill474_41;
    spill474_42 = __stackOp474_48_0;
    (__stackOp474_48_0)[2] = 3;
    (spill474_38)[spill474_39] = spill474_42;
    int[][] __stackOp474_49_0 = spill474_37;
    spill474_43 = __stackOp474_49_0;
    spill474_44 = __stackOp474_49_0;
    spill474_45 = 3;
    int[] __stackOp474_50_0 = new int[3];
    spill474_46 = __stackOp474_50_0;
    (__stackOp474_50_0)[0] = 3;
    int[] __stackOp474_51_0 = spill474_46;
    spill474_47 = __stackOp474_51_0;
    (__stackOp474_51_0)[1] = 3;
    int[] __stackOp474_52_0 = spill474_47;
    spill474_48 = __stackOp474_52_0;
    (__stackOp474_52_0)[2] = 3;
    (spill474_44)[spill474_45] = spill474_48;
    int[][] __stackOp474_53_0 = spill474_43;
    spill474_49 = __stackOp474_53_0;
    spill474_50 = __stackOp474_53_0;
    spill474_51 = 4;
    int[] __stackOp474_54_0 = new int[3];
    spill474_52 = __stackOp474_54_0;
    (__stackOp474_54_0)[0] = 2;
    int[] __stackOp474_55_0 = spill474_52;
    spill474_53 = __stackOp474_55_0;
    (__stackOp474_55_0)[1] = 2;
    int[] __stackOp474_56_0 = spill474_53;
    spill474_54 = __stackOp474_56_0;
    (__stackOp474_56_0)[2] = 3;
    (spill474_50)[spill474_51] = spill474_54;
    int[][] __stackOp474_57_0 = spill474_49;
    spill474_55 = __stackOp474_57_0;
    spill474_56 = __stackOp474_57_0;
    spill474_57 = 5;
    int[] __stackOp474_58_0 = new int[3];
    spill474_58 = __stackOp474_58_0;
    (__stackOp474_58_0)[0] = 2;
    int[] __stackOp474_59_0 = spill474_58;
    spill474_59 = __stackOp474_59_0;
    (__stackOp474_59_0)[1] = 1;
    int[] __stackOp474_60_0 = spill474_59;
    spill474_60 = __stackOp474_60_0;
    (__stackOp474_60_0)[2] = 2;
    (spill474_56)[spill474_57] = spill474_60;
    int[][] __stackOp474_61_0 = spill474_55;
    spill474_61 = __stackOp474_61_0;
    spill474_62 = __stackOp474_61_0;
    spill474_63 = __sourceIntrinsic_eb8803ad1f63_invokedynamic474_62(15854, (7542352893540445483L ^ life11_11));
    int[] __stackOp474_63_0 = new int[3];
    spill474_64 = __stackOp474_63_0;
    (__stackOp474_63_0)[0] = 1;
    int[] __stackOp474_64_0 = spill474_64;
    spill474_65 = __stackOp474_64_0;
    (__stackOp474_64_0)[1] = 1;
    int[] __stackOp474_65_0 = spill474_65;
    spill474_66 = __stackOp474_65_0;
    (__stackOp474_65_0)[2] = 2;
    (spill474_62)[spill474_63] = spill474_66;
    l = ((int[][])(spill474_61));
    int[][] __stackOp474_68_0 = new int[__sourceIntrinsic_eb8803ad1f63_invokedynamic474_67(31307, (2665019625893980809L ^ life11_11))][];
    spill474_67 = __stackOp474_68_0;
    spill474_68 = __stackOp474_68_0;
    spill474_69 = 0;
    int[] __stackOp474_69_0 = new int[2];
    spill474_70 = __stackOp474_69_0;
    (__stackOp474_69_0)[0] = 0;
    int[] __stackOp474_70_0 = spill474_70;
    spill474_71 = __stackOp474_70_0;
    (__stackOp474_70_0)[1] = 0;
    (spill474_68)[spill474_69] = spill474_71;
    int[][] __stackOp474_71_0 = spill474_67;
    spill474_72 = __stackOp474_71_0;
    spill474_73 = __stackOp474_71_0;
    spill474_74 = 1;
    int[] __stackOp474_72_0 = new int[2];
    spill474_75 = __stackOp474_72_0;
    (__stackOp474_72_0)[0] = 0;
    int[] __stackOp474_73_0 = spill474_75;
    spill474_76 = __stackOp474_73_0;
    (__stackOp474_73_0)[1] = 4;
    (spill474_73)[spill474_74] = spill474_76;
    int[][] __stackOp474_74_0 = spill474_72;
    spill474_77 = __stackOp474_74_0;
    spill474_78 = __stackOp474_74_0;
    spill474_79 = 2;
    int[] __stackOp474_75_0 = new int[2];
    spill474_80 = __stackOp474_75_0;
    (__stackOp474_75_0)[0] = 0;
    int[] __stackOp474_76_0 = spill474_80;
    spill474_81 = __stackOp474_76_0;
    (__stackOp474_76_0)[1] = __sourceIntrinsic_eb8803ad1f63_invokedynamic474_77(22523, (5135961036048156464L ^ life11_11));
    (spill474_78)[spill474_79] = spill474_81;
    int[][] __stackOp474_78_0 = spill474_77;
    spill474_82 = __stackOp474_78_0;
    spill474_83 = __stackOp474_78_0;
    spill474_84 = 3;
    int[] __stackOp474_79_0 = new int[2];
    spill474_85 = __stackOp474_79_0;
    (__stackOp474_79_0)[0] = 0;
    int[] __stackOp474_80_0 = spill474_85;
    spill474_86 = __stackOp474_80_0;
    (__stackOp474_80_0)[1] = __sourceIntrinsic_eb8803ad1f63_invokedynamic474_81(7287, (6822831303175408816L ^ life11_11));
    (spill474_83)[spill474_84] = spill474_86;
    int[][] __stackOp474_82_0 = spill474_82;
    spill474_87 = __stackOp474_82_0;
    spill474_88 = __stackOp474_82_0;
    spill474_89 = 4;
    int[] __stackOp474_83_0 = new int[2];
    spill474_90 = __stackOp474_83_0;
    (__stackOp474_83_0)[0] = 0;
    int[] __stackOp474_84_0 = spill474_90;
    spill474_91 = __stackOp474_84_0;
    (__stackOp474_84_0)[1] = __sourceIntrinsic_eb8803ad1f63_invokedynamic474_85(20565, (7787480322891530390L ^ life11_11));
    (spill474_88)[spill474_89] = spill474_91;
    int[][] __stackOp474_86_0 = spill474_87;
    spill474_92 = __stackOp474_86_0;
    spill474_93 = __stackOp474_86_0;
    spill474_94 = 5;
    int[] __stackOp474_87_0 = new int[2];
    spill474_95 = __stackOp474_87_0;
    (__stackOp474_87_0)[0] = __sourceIntrinsic_eb8803ad1f63_invokedynamic474_88(28834, (4598251254757187688L ^ life11_11));
    int[] __stackOp474_89_0 = spill474_95;
    spill474_96 = __stackOp474_89_0;
    (__stackOp474_89_0)[1] = 0;
    (spill474_93)[spill474_94] = spill474_96;
    int[][] __stackOp474_90_0 = spill474_92;
    spill474_97 = __stackOp474_90_0;
    spill474_98 = __stackOp474_90_0;
    spill474_99 = __sourceIntrinsic_eb8803ad1f63_invokedynamic474_91(15854, (7542352893540445483L ^ life11_11));
    int[] __stackOp474_92_0 = new int[2];
    spill474_100 = __stackOp474_92_0;
    (__stackOp474_92_0)[0] = __sourceIntrinsic_eb8803ad1f63_invokedynamic474_93(21392, (1379992185764954960L ^ life11_11));
    int[] __stackOp474_94_0 = spill474_100;
    spill474_101 = __stackOp474_94_0;
    (__stackOp474_94_0)[1] = 4;
    (spill474_98)[spill474_99] = spill474_101;
    m = ((int[][])(spill474_97));
}

private static native <E extends Throwable> void __sourceConstructorInit_32ccfe93d5de2c72_0(moom.jp a0) throws E;

private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8182_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/jp"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 28535;
      if (p[var3] == null) {
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
         long var5 = o[var3];
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
         Object[] var9 = (Object[])q.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               q.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/jp", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         p[var3] = var15;
      }

      return p[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.jp.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a(float p0, float p1, float p2, float p3, float p4, float p5, net.minecraft.entity.Entity p6) {
net.minecraft.entity.Entity[] spill1223_0;
    long life8_3;
    int life11_6;
    net.minecraft.entity.Entity[] life10_7;
    lexical_join_122: {
    lexical_join_72: {
    life8_3 = (moom.jp.n ^ 8567437718800L);
    spill1223_0 = moom.iQ.b();
    life11_6 = 0;
    life10_7 = spill1223_0;
    lexical_cycle_8: while (true) {
    if (!((life11_6 < (this.i).length))) {
        break lexical_join_72;
    }
    ((moom.jD)((this.i)[life11_6])).i = ((float)((((moom.Dr.b(((float)(((p2 * 0x1.ccccccp-1f) + ((((float) life11_6) * 0x1.333334p-3f) * 0x1.921fb6p1f))))) * 0x1.921fb6p1f) * 0x1.99999ap-5f) * ((float) (1 + java.lang.Math.abs(((int)((life11_6 - 2)))))))));
    ((moom.jD)((this.i)[life11_6])).e = ((float)((((moom.Dr.a(((float)(((p2 * 0x1.ccccccp-1f) + ((((float) life11_6) * 0x1.333334p-3f) * 0x1.921fb6p1f))))) * 0x1.921fb6p1f) * 0x1.99999ap-3f) * ((float) java.lang.Math.abs(((int)((life11_6 - 2))))))));
    life11_6 += 1;
    if (!((life10_7 != null))) {
        break lexical_join_122;
    }
    if (!((life10_7 == null))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    ((moom.jD)((this.j)[0])).i = ((float)(((moom.jD)((this.i)[2])).i));
    ((moom.jD)((this.j)[1])).i = ((float)(((moom.jD)((this.i)[4])).i));
    ((moom.jD)((this.j)[1])).e = ((float)(((moom.jD)((this.i)[4])).e));
    ((moom.jD)((this.j)[2])).i = ((float)(((moom.jD)((this.i)[1])).i));
    ((moom.jD)((this.j)[2])).e = ((float)(((moom.jD)((this.i)[1])).e));
    }
    return;
}


public void a(net.minecraft.entity.Entity p0, float p1, float p2, float p3, float p4, float p5, float p6) {
net.minecraft.entity.Entity[] spill1224_0;
    long life8_3;
    moom.jD[] life11_16;
    int life12_19;
    net.minecraft.entity.Entity[] life10_20;
    int life13_22;
    moom.jD life14_29;
    int life13_48;
    moom.jD life14_55;
    lexical_join_59: {
    lexical_join_44: {
    lexical_join_38: {
    life8_3 = (moom.jp.n ^ 132300781762872L);
    ((moom.jp)(this)).a(((float)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((float)(p6)), ((net.minecraft.entity.Entity)(p0)));
    spill1224_0 = moom.iQ.b();
    life11_16 = this.i;
    life12_19 = (life11_16).length;
    life10_20 = spill1224_0;
    life13_22 = 0;
    lexical_cycle_23: while (true) {
    if (!((life13_22 < life12_19))) {
        break lexical_join_38;
    }
    life14_29 = (life11_16)[life13_22];
    ((moom.jD)(life14_29)).a(((float)(p6)));
    life13_22 += 1;
    if (!((life10_20 != null))) {
        break lexical_join_44;
    }
    if (!((life10_20 == null))) { continue lexical_cycle_23; }
    break lexical_cycle_23;
    }
    }
    life11_16 = this.j;
    life12_19 = (life11_16).length;
    }
    life13_48 = 0;
    lexical_cycle_46: while (true) {
    if (!((life13_48 < life12_19))) {
        break lexical_join_59;
    }
    life14_55 = (life11_16)[life13_48];
    ((moom.jD)(life14_55)).a(((float)(p6)));
    life13_48 += 1;
    if (!((life10_20 == null))) { continue lexical_cycle_46; }
    break lexical_cycle_46;
    }
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic474_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic474_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic474_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic474_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic474_77(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic474_81(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic474_85(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic474_88(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic474_91(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic474_93(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_32ccfe93d5de2c72_originalDynamicSite684_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_32ccfe93d5de2c72_originalDynamicSite684_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_32ccfe93d5de2c72_originalDynamicSite684_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_32ccfe93d5de2c72_originalDynamicSite684_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_32ccfe93d5de2c72_originalDynamicSite684_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_32ccfe93d5de2c72_originalDynamicSite684_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_32ccfe93d5de2c72_originalDynamicSite684_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_32ccfe93d5de2c72_originalDynamicSite684_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_32ccfe93d5de2c72_originalDynamicSite684_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_32ccfe93d5de2c72_originalDynamicSite684_76(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_32ccfe93d5de2c72_originalDynamicSite684_78(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_32ccfe93d5de2c72_originalDynamicSite684_84(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8182_0() throws E;
}
