package net.minecraft.entity.item;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class EntityMinecart extends net.minecraft.entity.Entity implements net.minecraft.world.IWorldNameable {

private boolean aE;

private java.lang.String aF;

private static final int[][][] aG;

private int aH;

private double aI;

private double aJ;

private double aK;

private double aL;

private double aM;

private double aN;

private double aO;

private double aP;

private static final long cb;

private static final long[] eb;

private static final java.lang.Integer[] gb;

private static final java.util.Map hb;

public EntityMinecart(net.minecraft.world.World p0, double p1, double p2, double p3) {
this(p0);
    (this).a__Void(p1, p2, p3);
    this.t = 0x0.0p+0d;
    this.u = 0x0.0p+0d;
    this.v = 0x0.0p+0d;
    this.k = p1;
    this.l = p2;
    this.m = p3;
}


public EntityMinecart(net.minecraft.world.World p0) {
super(p0);
    this.e = true;
    (this).a__Void(0x1.f5c2900000000p-1f, 0x1.6666660000000p-1f);
}


static {
javax.crypto.Cipher forestValue560_36_0;
    int forestValue560_36_1;
    javax.crypto.SecretKeyFactory forestValue560_36_2;
    byte[] forestValue560_36_3;
    javax.crypto.Cipher forestValue560_53_0;
    int forestValue560_53_1;
    javax.crypto.SecretKeyFactory forestValue560_53_2;
    byte[] forestValue560_53_3;
    long[] forestValue560_157_0;
    int forestValue560_157_1;
    long forestValue560_157_2;
    int forestValue560_157_3;
    long[] forestValue560_300_0;
    int forestValue560_300_1;
    long forestValue560_300_2;
    long[] forestValue560_312_0;
    int forestValue560_312_1;
    long forestValue560_312_2;
    javax.crypto.Cipher spill560_0;
    int spill560_1;
    javax.crypto.SecretKeyFactory spill560_2;
    byte[] spill560_3;
    byte[] spill560_4;
    java.lang.String spill560_5;
    int spill560_6;
    int spill560_7;
    long spill560_8;
    byte[] spill560_9;
    byte[] spill560_10;
    byte[] spill560_11;
    byte[] spill560_12;
    byte[] spill560_13;
    byte[] spill560_14;
    byte[] spill560_15;
    byte[] spill560_16;
    long spill560_17;
    int spill560_18;
    java.lang.String spill560_19;
    int spill560_20;
    long[] spill560_21;
    int spill560_22;
    long spill560_23;
    int spill560_24;
    int[][][] spill560_25;
    int[][][] spill560_26;
    int spill560_27;
    int[][] spill560_28;
    int[][] spill560_29;
    int spill560_30;
    int[] spill560_31;
    int[] spill560_32;
    int[] spill560_33;
    int[][] spill560_34;
    int[][] spill560_35;
    int spill560_36;
    int[] spill560_37;
    int[] spill560_38;
    int[] spill560_39;
    int[][][] spill560_40;
    int[][][] spill560_41;
    int spill560_42;
    int[][] spill560_43;
    int[][] spill560_44;
    int spill560_45;
    int[] spill560_46;
    int[] spill560_47;
    int[] spill560_48;
    int[][] spill560_49;
    int[][] spill560_50;
    int spill560_51;
    int[] spill560_52;
    int[] spill560_53;
    int[] spill560_54;
    int[][][] spill560_55;
    int[][][] spill560_56;
    int spill560_57;
    int[][] spill560_58;
    int[][] spill560_59;
    int spill560_60;
    int[] spill560_61;
    int[] spill560_62;
    int[] spill560_63;
    int[][] spill560_64;
    int[][] spill560_65;
    int spill560_66;
    int[] spill560_67;
    int[] spill560_68;
    int[] spill560_69;
    int[][][] spill560_70;
    int[][][] spill560_71;
    int spill560_72;
    int[][] spill560_73;
    int[][] spill560_74;
    int spill560_75;
    int[] spill560_76;
    int[] spill560_77;
    int[] spill560_78;
    int[][] spill560_79;
    int[][] spill560_80;
    int spill560_81;
    int[] spill560_82;
    int[] spill560_83;
    int[] spill560_84;
    int[][][] spill560_85;
    int[][][] spill560_86;
    int spill560_87;
    int[][] spill560_88;
    int[][] spill560_89;
    int spill560_90;
    int[] spill560_91;
    int[] spill560_92;
    int[] spill560_93;
    int[][] spill560_94;
    int[][] spill560_95;
    int spill560_96;
    int[] spill560_97;
    int[] spill560_98;
    int[] spill560_99;
    int[][][] spill560_100;
    int[][][] spill560_101;
    int spill560_102;
    int[][] spill560_103;
    int[][] spill560_104;
    int spill560_105;
    int[] spill560_106;
    int[] spill560_107;
    int[] spill560_108;
    int[][] spill560_109;
    int[][] spill560_110;
    int spill560_111;
    int[] spill560_112;
    int[] spill560_113;
    int[] spill560_114;
    int[][][] spill560_115;
    int[][][] spill560_116;
    int spill560_117;
    int[][] spill560_118;
    int[][] spill560_119;
    int spill560_120;
    int[] spill560_121;
    int[] spill560_122;
    int[] spill560_123;
    int[][] spill560_124;
    int[][] spill560_125;
    int spill560_126;
    int[] spill560_127;
    int[] spill560_128;
    int[] spill560_129;
    int[][][] spill560_130;
    int[][][] spill560_131;
    int spill560_132;
    int[][] spill560_133;
    int[][] spill560_134;
    int spill560_135;
    int[] spill560_136;
    int[] spill560_137;
    int[] spill560_138;
    int[][] spill560_139;
    int[][] spill560_140;
    int spill560_141;
    int[] spill560_142;
    int[] spill560_143;
    int[] spill560_144;
    int[][][] spill560_145;
    int[][][] spill560_146;
    int spill560_147;
    int[][] spill560_148;
    int[][] spill560_149;
    int spill560_150;
    int[] spill560_151;
    int[] spill560_152;
    int[] spill560_153;
    int[][] spill560_154;
    int[][] spill560_155;
    int spill560_156;
    int[] spill560_157;
    int[] spill560_158;
    int[] spill560_159;
    int[][][] spill560_160;
    int[][][] spill560_161;
    int spill560_162;
    int[][] spill560_163;
    int[][] spill560_164;
    int spill560_165;
    int[] spill560_166;
    int[] spill560_167;
    int[] spill560_168;
    int[][] spill560_169;
    int[][] spill560_170;
    int spill560_171;
    int[] spill560_172;
    int[] spill560_173;
    int[] spill560_174;
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
    cb = ((long)(((moom._a)(moom._c.a(((long)(-1942897505487280822L)), ((long)(6369669260481318488L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(137419429666642L)))));
    life11_11 = (net.minecraft.entity.item.EntityMinecart.cb ^ 20845822193622L);
    hb = ((java.util.Map)(new java.util.HashMap(13)));
    spill560_0 = (life0_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill560_1 = 2;
    spill560_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp560_9_0 = new byte[8];
    spill560_3 = __stackOp560_9_0;
    (__stackOp560_9_0)[0] = ((byte) ((int) (life11_11 >>> 56)));
    life1_35 = 1;
    forestValue560_36_0 = spill560_0;
    forestValue560_36_1 = spill560_1;
    forestValue560_36_2 = spill560_2;
    forestValue560_36_3 = spill560_3;
    forest_cycle_36: while (true) {
    if (!((life1_35 < 8))) {
        forestValue560_53_0 = forestValue560_36_0;
        forestValue560_53_1 = forestValue560_36_1;
        forestValue560_53_2 = forestValue560_36_2;
        forestValue560_53_3 = forestValue560_36_3;
        break forest_join_53;
    }
    byte[] __stackOp560_10_0 = forestValue560_36_3;
    spill560_4 = __stackOp560_10_0;
    (__stackOp560_10_0)[life1_35] = ((byte) ((int) ((life11_11 << (life1_35 * 8)) >>> 56)));
    life1_35 += 1;
    forestValue560_36_3 = spill560_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue560_53_0)).init(((int)(forestValue560_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue560_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue560_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life6_66 = new long[20];
    life3_68 = 0;
    life5_73 = ((java.lang.String)((life4_71 = "µôvº\031\034\006 ÜYiºG2ôL6Èz\025\\§~*²#;Ì9\035¬\fdm\016Z\026¯W¬YÂ~Ë~m ¤øL\033z3X¿:\fiiçÌqHD\034\000È;#R\fÅ\033µ¼à%5\025¾g\\)f&¢«ñW»\t\037i²î\036I\020j×ÿ g\032¦Zþ\003VS¡)\000Íå\036b[íºØ'\036\r`I÷>k#\034"))).length();
    life2_75 = 0;
    forest_cycle_76: while (true) {
    spill560_5 = life4_71;
    spill560_6 = life2_75;
    life2_75 += 8;
    life7_83 = ((java.lang.String)(((java.lang.String)(spill560_5)).substring(((int)(spill560_6)), ((int)(life2_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    forestValue560_157_0 = life6_66;
    forestValue560_157_1 = (life3_68++);
    forestValue560_157_2 = (((((((((((long) (life7_83)[0]) & 255L) << 56) | ((((long) (life7_83)[1]) & 255L) << 48)) | ((((long) (life7_83)[2]) & 255L) << 40)) | ((((long) (life7_83)[3]) & 255L) << 32)) | ((((long) (life7_83)[4]) & 255L) << 24)) | ((((long) (life7_83)[5]) & 255L) << 16)) | ((((long) (life7_83)[6]) & 255L) << 8)) | (((long) (life7_83)[7]) & 255L));
    forestValue560_157_3 = -1;
    forest_cycle_157: while (true) {
    forest_join_317: {
    forest_join_312: {
    forest_join_300: {
    long __stackOp560_16_0 = forestValue560_157_2;
    int __stackOp560_16_1 = forestValue560_157_3;
    spill560_7 = __stackOp560_16_1;
    spill560_8 = __stackOp560_16_0;
    recovery.source.CarrierOps.discard(__stackOp560_16_1);
    life8_160 = spill560_8;
    byte[] __stackOp560_18_0 = new byte[8];
    spill560_9 = __stackOp560_18_0;
    (__stackOp560_18_0)[0] = ((byte) ((int) (life8_160 >>> 56)));
    byte[] __stackOp560_19_0 = spill560_9;
    spill560_10 = __stackOp560_19_0;
    (__stackOp560_19_0)[1] = ((byte) ((int) (life8_160 >>> 48)));
    byte[] __stackOp560_20_0 = spill560_10;
    spill560_11 = __stackOp560_20_0;
    (__stackOp560_20_0)[2] = ((byte) ((int) (life8_160 >>> 40)));
    byte[] __stackOp560_21_0 = spill560_11;
    spill560_12 = __stackOp560_21_0;
    (__stackOp560_21_0)[3] = ((byte) ((int) (life8_160 >>> 32)));
    byte[] __stackOp560_22_0 = spill560_12;
    spill560_13 = __stackOp560_22_0;
    (__stackOp560_22_0)[4] = ((byte) ((int) (life8_160 >>> 24)));
    byte[] __stackOp560_23_0 = spill560_13;
    spill560_14 = __stackOp560_23_0;
    (__stackOp560_23_0)[5] = ((byte) ((int) (life8_160 >>> 16)));
    byte[] __stackOp560_24_0 = spill560_14;
    spill560_15 = __stackOp560_24_0;
    (__stackOp560_24_0)[6] = ((byte) ((int) (life8_160 >>> 8)));
    byte[] __stackOp560_25_0 = spill560_15;
    spill560_16 = __stackOp560_25_0;
    (__stackOp560_25_0)[7] = ((byte) ((int) life8_160));
    byte[] __stackOp560_26_0 = spill560_16;
    javax.crypto.Cipher __stackOp560_26_1 = life0_20;
    life10_228 = ((javax.crypto.Cipher)(__stackOp560_26_1)).doFinal(((byte[])(__stackOp560_26_0)));
    int __stackOp560_28_0 = spill560_7;
    long __stackOp560_28_1 = (((((((((((long) (life10_228)[0]) & 255L) << 56) | ((((long) (life10_228)[1]) & 255L) << 48)) | ((((long) (life10_228)[2]) & 255L) << 40)) | ((((long) (life10_228)[3]) & 255L) << 32)) | ((((long) (life10_228)[4]) & 255L) << 24)) | ((((long) (life10_228)[5]) & 255L) << 16)) | ((((long) (life10_228)[6]) & 255L) << 8)) | (((long) (life10_228)[7]) & 255L));
    spill560_17 = __stackOp560_28_1;
    spill560_18 = __stackOp560_28_0;
    recovery.source.CarrierOps.discard(__stackOp560_28_1);
    switch (spill560_18) {
default:
{
        forestValue560_300_0 = forestValue560_157_0;
        forestValue560_300_1 = forestValue560_157_1;
        forestValue560_300_2 = spill560_17;
        break forest_join_300;
    }
case 0:
{
        forestValue560_312_0 = forestValue560_157_0;
        forestValue560_312_1 = forestValue560_157_1;
        forestValue560_312_2 = spill560_17;
        break forest_join_312;
    }
}
    }
    (forestValue560_300_0)[forestValue560_300_1] = forestValue560_300_2;
    if (!((life2_75 >= life5_73))) {
        continue forest_cycle_76;
    }
    life5_73 = ((java.lang.String)((life4_71 = "¨\032,g¬Ë©]æÖzq:Ì¼"))).length();
    life2_75 = 0;
    break forest_join_317;
    }
    (forestValue560_312_0)[forestValue560_312_1] = forestValue560_312_2;
    if (!((life2_75 >= life5_73))) {
        break forest_join_317;
    }
    break forest_join_399;
    }
    spill560_19 = life4_71;
    spill560_20 = life2_75;
    life2_75 += 8;
    life7_325 = ((java.lang.String)(((java.lang.String)(spill560_19)).substring(((int)(spill560_20)), ((int)(life2_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    spill560_21 = life6_66;
    spill560_22 = (life3_68++);
    spill560_23 = (((((((((((long) (life7_325)[0]) & 255L) << 56) | ((((long) (life7_325)[1]) & 255L) << 48)) | ((((long) (life7_325)[2]) & 255L) << 40)) | ((((long) (life7_325)[3]) & 255L) << 32)) | ((((long) (life7_325)[4]) & 255L) << 24)) | ((((long) (life7_325)[5]) & 255L) << 16)) | ((((long) (life7_325)[6]) & 255L) << 8)) | (((long) (life7_325)[7]) & 255L));
    spill560_24 = 0;
    forestValue560_157_0 = spill560_21;
    forestValue560_157_1 = spill560_22;
    forestValue560_157_2 = spill560_23;
    forestValue560_157_3 = spill560_24;
    continue forest_cycle_157;
    }
    }
    }
    eb = ((long[])(life6_66));
    gb = ((java.lang.Integer[])(new java.lang.Integer[20]));
    int[][][] __stackOp560_36_0 = new int[__sourceIntrinsic_eb8803ad1f63_invokedynamic560_35(29344, (1256191666453675375L ^ life11_11))][][];
    spill560_25 = __stackOp560_36_0;
    spill560_26 = __stackOp560_36_0;
    spill560_27 = 0;
    int[][] __stackOp560_37_0 = new int[2][];
    spill560_28 = __stackOp560_37_0;
    spill560_29 = __stackOp560_37_0;
    spill560_30 = 0;
    int[] __stackOp560_38_0 = new int[3];
    spill560_31 = __stackOp560_38_0;
    (__stackOp560_38_0)[0] = 0;
    int[] __stackOp560_39_0 = spill560_31;
    spill560_32 = __stackOp560_39_0;
    (__stackOp560_39_0)[1] = 0;
    int[] __stackOp560_40_0 = spill560_32;
    spill560_33 = __stackOp560_40_0;
    (__stackOp560_40_0)[2] = -1;
    (spill560_29)[spill560_30] = spill560_33;
    int[][] __stackOp560_41_0 = spill560_28;
    spill560_34 = __stackOp560_41_0;
    spill560_35 = __stackOp560_41_0;
    spill560_36 = 1;
    int[] __stackOp560_42_0 = new int[3];
    spill560_37 = __stackOp560_42_0;
    (__stackOp560_42_0)[0] = 0;
    int[] __stackOp560_43_0 = spill560_37;
    spill560_38 = __stackOp560_43_0;
    (__stackOp560_43_0)[1] = 0;
    int[] __stackOp560_44_0 = spill560_38;
    spill560_39 = __stackOp560_44_0;
    (__stackOp560_44_0)[2] = 1;
    (spill560_35)[spill560_36] = spill560_39;
    (spill560_26)[spill560_27] = spill560_34;
    int[][][] __stackOp560_45_0 = spill560_25;
    spill560_40 = __stackOp560_45_0;
    spill560_41 = __stackOp560_45_0;
    spill560_42 = 1;
    int[][] __stackOp560_46_0 = new int[2][];
    spill560_43 = __stackOp560_46_0;
    spill560_44 = __stackOp560_46_0;
    spill560_45 = 0;
    int[] __stackOp560_47_0 = new int[3];
    spill560_46 = __stackOp560_47_0;
    (__stackOp560_47_0)[0] = -1;
    int[] __stackOp560_48_0 = spill560_46;
    spill560_47 = __stackOp560_48_0;
    (__stackOp560_48_0)[1] = 0;
    int[] __stackOp560_49_0 = spill560_47;
    spill560_48 = __stackOp560_49_0;
    (__stackOp560_49_0)[2] = 0;
    (spill560_44)[spill560_45] = spill560_48;
    int[][] __stackOp560_50_0 = spill560_43;
    spill560_49 = __stackOp560_50_0;
    spill560_50 = __stackOp560_50_0;
    spill560_51 = 1;
    int[] __stackOp560_51_0 = new int[3];
    spill560_52 = __stackOp560_51_0;
    (__stackOp560_51_0)[0] = 1;
    int[] __stackOp560_52_0 = spill560_52;
    spill560_53 = __stackOp560_52_0;
    (__stackOp560_52_0)[1] = 0;
    int[] __stackOp560_53_0 = spill560_53;
    spill560_54 = __stackOp560_53_0;
    (__stackOp560_53_0)[2] = 0;
    (spill560_50)[spill560_51] = spill560_54;
    (spill560_41)[spill560_42] = spill560_49;
    int[][][] __stackOp560_54_0 = spill560_40;
    spill560_55 = __stackOp560_54_0;
    spill560_56 = __stackOp560_54_0;
    spill560_57 = 2;
    int[][] __stackOp560_55_0 = new int[2][];
    spill560_58 = __stackOp560_55_0;
    spill560_59 = __stackOp560_55_0;
    spill560_60 = 0;
    int[] __stackOp560_56_0 = new int[3];
    spill560_61 = __stackOp560_56_0;
    (__stackOp560_56_0)[0] = -1;
    int[] __stackOp560_57_0 = spill560_61;
    spill560_62 = __stackOp560_57_0;
    (__stackOp560_57_0)[1] = -1;
    int[] __stackOp560_58_0 = spill560_62;
    spill560_63 = __stackOp560_58_0;
    (__stackOp560_58_0)[2] = 0;
    (spill560_59)[spill560_60] = spill560_63;
    int[][] __stackOp560_59_0 = spill560_58;
    spill560_64 = __stackOp560_59_0;
    spill560_65 = __stackOp560_59_0;
    spill560_66 = 1;
    int[] __stackOp560_60_0 = new int[3];
    spill560_67 = __stackOp560_60_0;
    (__stackOp560_60_0)[0] = 1;
    int[] __stackOp560_61_0 = spill560_67;
    spill560_68 = __stackOp560_61_0;
    (__stackOp560_61_0)[1] = 0;
    int[] __stackOp560_62_0 = spill560_68;
    spill560_69 = __stackOp560_62_0;
    (__stackOp560_62_0)[2] = 0;
    (spill560_65)[spill560_66] = spill560_69;
    (spill560_56)[spill560_57] = spill560_64;
    int[][][] __stackOp560_63_0 = spill560_55;
    spill560_70 = __stackOp560_63_0;
    spill560_71 = __stackOp560_63_0;
    spill560_72 = 3;
    int[][] __stackOp560_64_0 = new int[2][];
    spill560_73 = __stackOp560_64_0;
    spill560_74 = __stackOp560_64_0;
    spill560_75 = 0;
    int[] __stackOp560_65_0 = new int[3];
    spill560_76 = __stackOp560_65_0;
    (__stackOp560_65_0)[0] = -1;
    int[] __stackOp560_66_0 = spill560_76;
    spill560_77 = __stackOp560_66_0;
    (__stackOp560_66_0)[1] = 0;
    int[] __stackOp560_67_0 = spill560_77;
    spill560_78 = __stackOp560_67_0;
    (__stackOp560_67_0)[2] = 0;
    (spill560_74)[spill560_75] = spill560_78;
    int[][] __stackOp560_68_0 = spill560_73;
    spill560_79 = __stackOp560_68_0;
    spill560_80 = __stackOp560_68_0;
    spill560_81 = 1;
    int[] __stackOp560_69_0 = new int[3];
    spill560_82 = __stackOp560_69_0;
    (__stackOp560_69_0)[0] = 1;
    int[] __stackOp560_70_0 = spill560_82;
    spill560_83 = __stackOp560_70_0;
    (__stackOp560_70_0)[1] = -1;
    int[] __stackOp560_71_0 = spill560_83;
    spill560_84 = __stackOp560_71_0;
    (__stackOp560_71_0)[2] = 0;
    (spill560_80)[spill560_81] = spill560_84;
    (spill560_71)[spill560_72] = spill560_79;
    int[][][] __stackOp560_72_0 = spill560_70;
    spill560_85 = __stackOp560_72_0;
    spill560_86 = __stackOp560_72_0;
    spill560_87 = 4;
    int[][] __stackOp560_73_0 = new int[2][];
    spill560_88 = __stackOp560_73_0;
    spill560_89 = __stackOp560_73_0;
    spill560_90 = 0;
    int[] __stackOp560_74_0 = new int[3];
    spill560_91 = __stackOp560_74_0;
    (__stackOp560_74_0)[0] = 0;
    int[] __stackOp560_75_0 = spill560_91;
    spill560_92 = __stackOp560_75_0;
    (__stackOp560_75_0)[1] = 0;
    int[] __stackOp560_76_0 = spill560_92;
    spill560_93 = __stackOp560_76_0;
    (__stackOp560_76_0)[2] = -1;
    (spill560_89)[spill560_90] = spill560_93;
    int[][] __stackOp560_77_0 = spill560_88;
    spill560_94 = __stackOp560_77_0;
    spill560_95 = __stackOp560_77_0;
    spill560_96 = 1;
    int[] __stackOp560_78_0 = new int[3];
    spill560_97 = __stackOp560_78_0;
    (__stackOp560_78_0)[0] = 0;
    int[] __stackOp560_79_0 = spill560_97;
    spill560_98 = __stackOp560_79_0;
    (__stackOp560_79_0)[1] = -1;
    int[] __stackOp560_80_0 = spill560_98;
    spill560_99 = __stackOp560_80_0;
    (__stackOp560_80_0)[2] = 1;
    (spill560_95)[spill560_96] = spill560_99;
    (spill560_86)[spill560_87] = spill560_94;
    int[][][] __stackOp560_81_0 = spill560_85;
    spill560_100 = __stackOp560_81_0;
    spill560_101 = __stackOp560_81_0;
    spill560_102 = 5;
    int[][] __stackOp560_82_0 = new int[2][];
    spill560_103 = __stackOp560_82_0;
    spill560_104 = __stackOp560_82_0;
    spill560_105 = 0;
    int[] __stackOp560_83_0 = new int[3];
    spill560_106 = __stackOp560_83_0;
    (__stackOp560_83_0)[0] = 0;
    int[] __stackOp560_84_0 = spill560_106;
    spill560_107 = __stackOp560_84_0;
    (__stackOp560_84_0)[1] = -1;
    int[] __stackOp560_85_0 = spill560_107;
    spill560_108 = __stackOp560_85_0;
    (__stackOp560_85_0)[2] = -1;
    (spill560_104)[spill560_105] = spill560_108;
    int[][] __stackOp560_86_0 = spill560_103;
    spill560_109 = __stackOp560_86_0;
    spill560_110 = __stackOp560_86_0;
    spill560_111 = 1;
    int[] __stackOp560_87_0 = new int[3];
    spill560_112 = __stackOp560_87_0;
    (__stackOp560_87_0)[0] = 0;
    int[] __stackOp560_88_0 = spill560_112;
    spill560_113 = __stackOp560_88_0;
    (__stackOp560_88_0)[1] = 0;
    int[] __stackOp560_89_0 = spill560_113;
    spill560_114 = __stackOp560_89_0;
    (__stackOp560_89_0)[2] = 1;
    (spill560_110)[spill560_111] = spill560_114;
    (spill560_101)[spill560_102] = spill560_109;
    int[][][] __stackOp560_90_0 = spill560_100;
    spill560_115 = __stackOp560_90_0;
    spill560_116 = __stackOp560_90_0;
    spill560_117 = __sourceIntrinsic_eb8803ad1f63_invokedynamic560_91(19756, (1535113115663647457L ^ life11_11));
    int[][] __stackOp560_92_0 = new int[2][];
    spill560_118 = __stackOp560_92_0;
    spill560_119 = __stackOp560_92_0;
    spill560_120 = 0;
    int[] __stackOp560_93_0 = new int[3];
    spill560_121 = __stackOp560_93_0;
    (__stackOp560_93_0)[0] = 0;
    int[] __stackOp560_94_0 = spill560_121;
    spill560_122 = __stackOp560_94_0;
    (__stackOp560_94_0)[1] = 0;
    int[] __stackOp560_95_0 = spill560_122;
    spill560_123 = __stackOp560_95_0;
    (__stackOp560_95_0)[2] = 1;
    (spill560_119)[spill560_120] = spill560_123;
    int[][] __stackOp560_96_0 = spill560_118;
    spill560_124 = __stackOp560_96_0;
    spill560_125 = __stackOp560_96_0;
    spill560_126 = 1;
    int[] __stackOp560_97_0 = new int[3];
    spill560_127 = __stackOp560_97_0;
    (__stackOp560_97_0)[0] = 1;
    int[] __stackOp560_98_0 = spill560_127;
    spill560_128 = __stackOp560_98_0;
    (__stackOp560_98_0)[1] = 0;
    int[] __stackOp560_99_0 = spill560_128;
    spill560_129 = __stackOp560_99_0;
    (__stackOp560_99_0)[2] = 0;
    (spill560_125)[spill560_126] = spill560_129;
    (spill560_116)[spill560_117] = spill560_124;
    int[][][] __stackOp560_100_0 = spill560_115;
    spill560_130 = __stackOp560_100_0;
    spill560_131 = __stackOp560_100_0;
    spill560_132 = __sourceIntrinsic_eb8803ad1f63_invokedynamic560_101(32246, (3712103363848303138L ^ life11_11));
    int[][] __stackOp560_102_0 = new int[2][];
    spill560_133 = __stackOp560_102_0;
    spill560_134 = __stackOp560_102_0;
    spill560_135 = 0;
    int[] __stackOp560_103_0 = new int[3];
    spill560_136 = __stackOp560_103_0;
    (__stackOp560_103_0)[0] = 0;
    int[] __stackOp560_104_0 = spill560_136;
    spill560_137 = __stackOp560_104_0;
    (__stackOp560_104_0)[1] = 0;
    int[] __stackOp560_105_0 = spill560_137;
    spill560_138 = __stackOp560_105_0;
    (__stackOp560_105_0)[2] = 1;
    (spill560_134)[spill560_135] = spill560_138;
    int[][] __stackOp560_106_0 = spill560_133;
    spill560_139 = __stackOp560_106_0;
    spill560_140 = __stackOp560_106_0;
    spill560_141 = 1;
    int[] __stackOp560_107_0 = new int[3];
    spill560_142 = __stackOp560_107_0;
    (__stackOp560_107_0)[0] = -1;
    int[] __stackOp560_108_0 = spill560_142;
    spill560_143 = __stackOp560_108_0;
    (__stackOp560_108_0)[1] = 0;
    int[] __stackOp560_109_0 = spill560_143;
    spill560_144 = __stackOp560_109_0;
    (__stackOp560_109_0)[2] = 0;
    (spill560_140)[spill560_141] = spill560_144;
    (spill560_131)[spill560_132] = spill560_139;
    int[][][] __stackOp560_110_0 = spill560_130;
    spill560_145 = __stackOp560_110_0;
    spill560_146 = __stackOp560_110_0;
    spill560_147 = __sourceIntrinsic_eb8803ad1f63_invokedynamic560_111(6273, (6853388250794137438L ^ life11_11));
    int[][] __stackOp560_112_0 = new int[2][];
    spill560_148 = __stackOp560_112_0;
    spill560_149 = __stackOp560_112_0;
    spill560_150 = 0;
    int[] __stackOp560_113_0 = new int[3];
    spill560_151 = __stackOp560_113_0;
    (__stackOp560_113_0)[0] = 0;
    int[] __stackOp560_114_0 = spill560_151;
    spill560_152 = __stackOp560_114_0;
    (__stackOp560_114_0)[1] = 0;
    int[] __stackOp560_115_0 = spill560_152;
    spill560_153 = __stackOp560_115_0;
    (__stackOp560_115_0)[2] = -1;
    (spill560_149)[spill560_150] = spill560_153;
    int[][] __stackOp560_116_0 = spill560_148;
    spill560_154 = __stackOp560_116_0;
    spill560_155 = __stackOp560_116_0;
    spill560_156 = 1;
    int[] __stackOp560_117_0 = new int[3];
    spill560_157 = __stackOp560_117_0;
    (__stackOp560_117_0)[0] = -1;
    int[] __stackOp560_118_0 = spill560_157;
    spill560_158 = __stackOp560_118_0;
    (__stackOp560_118_0)[1] = 0;
    int[] __stackOp560_119_0 = spill560_158;
    spill560_159 = __stackOp560_119_0;
    (__stackOp560_119_0)[2] = 0;
    (spill560_155)[spill560_156] = spill560_159;
    (spill560_146)[spill560_147] = spill560_154;
    int[][][] __stackOp560_120_0 = spill560_145;
    spill560_160 = __stackOp560_120_0;
    spill560_161 = __stackOp560_120_0;
    spill560_162 = __sourceIntrinsic_eb8803ad1f63_invokedynamic560_121(32025, (1902297525896114884L ^ life11_11));
    int[][] __stackOp560_122_0 = new int[2][];
    spill560_163 = __stackOp560_122_0;
    spill560_164 = __stackOp560_122_0;
    spill560_165 = 0;
    int[] __stackOp560_123_0 = new int[3];
    spill560_166 = __stackOp560_123_0;
    (__stackOp560_123_0)[0] = 0;
    int[] __stackOp560_124_0 = spill560_166;
    spill560_167 = __stackOp560_124_0;
    (__stackOp560_124_0)[1] = 0;
    int[] __stackOp560_125_0 = spill560_167;
    spill560_168 = __stackOp560_125_0;
    (__stackOp560_125_0)[2] = -1;
    (spill560_164)[spill560_165] = spill560_168;
    int[][] __stackOp560_126_0 = spill560_163;
    spill560_169 = __stackOp560_126_0;
    spill560_170 = __stackOp560_126_0;
    spill560_171 = 1;
    int[] __stackOp560_127_0 = new int[3];
    spill560_172 = __stackOp560_127_0;
    (__stackOp560_127_0)[0] = 1;
    int[] __stackOp560_128_0 = spill560_172;
    spill560_173 = __stackOp560_128_0;
    (__stackOp560_128_0)[1] = 0;
    int[] __stackOp560_129_0 = spill560_173;
    spill560_174 = __stackOp560_129_0;
    (__stackOp560_129_0)[2] = 0;
    (spill560_170)[spill560_171] = spill560_174;
    (spill560_161)[spill560_162] = spill560_169;
    aG = ((int[][][])(spill560_160));
}


public void i(int p0) {
long local2 = (net.minecraft.entity.item.EntityMinecart.cb ^ 61272924383221L);
    ((net.minecraft.entity.DataWatcher)(((net.minecraft.entity.item.EntityMinecart)(this)).a__r1())).b(((int)(__sourceIntrinsic_4984c5be6222_originalDynamicSite1916_2(1814, (3980382976293093603L ^ local2)))), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(p0))))));
    ((net.minecraft.entity.item.EntityMinecart)(this)).h(((boolean)(true)));
    return;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_3cb4b15ee08e2d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral11377_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/tB"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public net.minecraft.block.state.IBlockState b__fE() {
return ((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE();
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 16629;
      if (gb[var3] == null) {
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
         long var5 = eb[var3];
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
         Object[] var9 = (Object[])hb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               hb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/tB", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         gb[var3] = var15;
      }

      return gb[var3];
}


public boolean e__Boolean() {
long local1 = (net.minecraft.entity.item.EntityMinecart.cb ^ 2923814987419L);
    return ((((this.aF != null) ? 1 : 0)) != 0);
}


public double e() {
return 0x0.0p0d;
}


protected void x() {
net.minecraft.entity.item.EntityMinecart forwardValue5097_44_0;
    net.minecraft.entity.item.EntityMinecart spill5097_0;
    long life1_3;
    int life3_5;
    forward_join_49: {
    forward_join_44: {
    forward_join_31: {
    life1_3 = (net.minecraft.entity.item.EntityMinecart.cb ^ 68415185529858L);
    life3_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    spill5097_0 = this;
    if (!((life3_5 != 0))) {
        forwardValue5097_44_0 = spill5097_0;
        break forward_join_44;
    }
    if (!((((net.minecraft.entity.item.EntityMinecart)(spill5097_0)).f != null))) {
        break forward_join_31;
    }
    net.minecraft.entity.item.EntityMinecart __stackOp5097_3_0 = this;
    ((net.minecraft.entity.item.EntityMinecart)(__stackOp5097_3_0)).t = ((double)((((net.minecraft.entity.item.EntityMinecart)(__stackOp5097_3_0)).t * 0x1.fe76c8p-1d)));
    net.minecraft.entity.item.EntityMinecart __stackOp5097_6_0 = this;
    ((net.minecraft.entity.item.EntityMinecart)(__stackOp5097_6_0)).u = ((double)((((net.minecraft.entity.item.EntityMinecart)(__stackOp5097_6_0)).u * 0x0.0p0d)));
    net.minecraft.entity.item.EntityMinecart __stackOp5097_9_0 = this;
    ((net.minecraft.entity.item.EntityMinecart)(__stackOp5097_9_0)).v = ((double)((((net.minecraft.entity.item.EntityMinecart)(__stackOp5097_9_0)).v * 0x1.fe76c8p-1d)));
    if (!((life3_5 == 0))) {
        break forward_join_49;
    }
    }
    net.minecraft.entity.item.EntityMinecart __stackOp5097_12_0 = this;
    ((net.minecraft.entity.item.EntityMinecart)(__stackOp5097_12_0)).t = ((double)((((net.minecraft.entity.item.EntityMinecart)(__stackOp5097_12_0)).t * 0x1.eb851ep-1d)));
    net.minecraft.entity.item.EntityMinecart __stackOp5097_15_0 = this;
    ((net.minecraft.entity.item.EntityMinecart)(__stackOp5097_15_0)).u = ((double)((((net.minecraft.entity.item.EntityMinecart)(__stackOp5097_15_0)).u * 0x0.0p0d)));
    forwardValue5097_44_0 = this;
    }
    net.minecraft.entity.item.EntityMinecart __stackOp5097_18_0 = forwardValue5097_44_0;
    ((net.minecraft.entity.item.EntityMinecart)(__stackOp5097_18_0)).v = ((double)((((net.minecraft.entity.item.EntityMinecart)(__stackOp5097_18_0)).v * 0x1.eb851ep-1d)));
    }
    return;
}


protected void c(net.minecraft.nbt.NBTTagCompound p0) {
int forwardValue5090_52_0;
    int forwardValue5090_82_0;
    int forwardValue5090_89_0;
    boolean spill5090_0;
    boolean spill5090_1;
    long life2_3;
    int life4_5;
    int life5_18;
    net.minecraft.block.Block life6_37;
    net.minecraft.block.Block life6_71;
    forward_join_95: {
    forward_join_89: {
    forward_join_82: {
    forward_join_74: {
    forward_join_69: {
    forward_join_64: {
    forward_join_62: {
    forward_join_52: {
    forward_join_49: {
    forward_join_47: {
    forward_join_42: {
    forward_join_40: {
    life2_3 = (net.minecraft.entity.item.EntityMinecart.cb ^ 122887531798114L);
    life4_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    spill5090_0 = ((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("CustomDisplayTile")));
    if (!((life4_5 == 0))) {
        forwardValue5090_82_0 = ((spill5090_0) ? 1 : 0);
        break forward_join_82;
    }
    if (!(spill5090_0)) {
        break forward_join_74;
    }
    life5_18 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("DisplayData")));
    spill5090_1 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("DisplayTile")), ((int)(__sourceIntrinsic_01f4e1cd062e_invokedynamic5090_5(25118, (6377274394952359027L ^ life2_3)))));
    if (!((life4_5 == 0))) {
        forwardValue5090_52_0 = ((spill5090_1) ? 1 : 0);
        break forward_join_52;
    }
    if (!(spill5090_1)) {
        break forward_join_49;
    }
    life6_37 = __sourceExactCall_85597be21a945e(((java.lang.String)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__String(((java.lang.String)("DisplayTile"))))));
    if (!((life4_5 == 0))) {
        break forward_join_40;
    }
    if (!((life6_37 == null))) {
        break forward_join_42;
    }
    ((net.minecraft.entity.item.EntityMinecart)(this)).a(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())));
    }
    if (!((life4_5 != 0))) {
        break forward_join_47;
    }
    }
    ((net.minecraft.entity.item.EntityMinecart)(this)).a(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(life6_37)).b__fE(((int)(life5_18))))));
    }
    if (!((life4_5 != 0))) {
        break forward_join_69;
    }
    }
    forwardValue5090_52_0 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("DisplayTile")));
    }
    life6_71 = __sourceExactCall_c520ab7951a8e1(((int)(forwardValue5090_52_0)));
    if (!((life4_5 == 0))) {
        break forward_join_62;
    }
    if (!((life6_71 == null))) {
        break forward_join_64;
    }
    ((net.minecraft.entity.item.EntityMinecart)(this)).a(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())));
    }
    if (!((life4_5 != 0))) {
        break forward_join_69;
    }
    }
    ((net.minecraft.entity.item.EntityMinecart)(this)).a(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(life6_71)).b__fE(((int)(life5_18))))));
    }
    ((net.minecraft.entity.item.EntityMinecart)(this)).i(((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("DisplayOffset"))))));
    }
    forwardValue5090_82_0 = ((((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("CustomName")), ((int)(__sourceIntrinsic_01f4e1cd062e_invokedynamic5090_24(25118, (6377274394952359027L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forwardValue5090_89_0 = forwardValue5090_82_0;
        break forward_join_89;
    }
    if (!((forwardValue5090_82_0 != 0))) {
        break forward_join_95;
    }
    forwardValue5090_89_0 = ((java.lang.String)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__String(((java.lang.String)("CustomName"))))).length();
    }
    if (!((forwardValue5090_89_0 > 0))) {
        break forward_join_95;
    }
    this.aF = ((java.lang.String)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__String(((java.lang.String)("CustomName")))));
    }
    return;
}


public void c(float p0) {
long local2 = (net.minecraft.entity.item.EntityMinecart.cb ^ 107300286793013L);
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_c0891f2beaed_originalDynamicSite1917_2(4933, (7480441757989353078L ^ local2)))), ((java.lang.Object)(java.lang.Float.valueOf(((float)(p0))))));
    return;
}


public boolean n__Boolean() {
return ((1) != 0);
}


public void h(boolean p0) {
net.minecraft.entity.DataWatcher forwardValue5093_18_0;
    int forwardValue5093_18_1;
    int forwardValue5093_18_2;
    net.minecraft.entity.DataWatcher forwardValue5093_19_0;
    int forwardValue5093_19_1;
    net.minecraft.entity.DataWatcher forwardValue5093_20_0;
    int forwardValue5093_20_1;
    int forwardValue5093_20_2;
    net.minecraft.entity.DataWatcher spill5093_0;
    int spill5093_1;
    boolean spill5093_2;
    long life2_3;
    int life4_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    life2_3 = (net.minecraft.entity.item.EntityMinecart.cb ^ 116610676278013L);
    life4_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    spill5093_0 = ((net.minecraft.entity.item.EntityMinecart)(this)).a__r1();
    spill5093_1 = __sourceIntrinsic_8699ed5f13ef_invokedynamic5093_3(17127, (6780408129180573719L ^ life2_3));
    spill5093_2 = p0;
    if (!((life4_5 != 0))) {
        forwardValue5093_18_0 = spill5093_0;
        forwardValue5093_18_1 = spill5093_1;
        forwardValue5093_18_2 = ((spill5093_2) ? 1 : 0);
        break forward_join_18;
    }
    if (!(spill5093_2)) {
        forwardValue5093_19_0 = spill5093_0;
        forwardValue5093_19_1 = spill5093_1;
        break forward_join_19;
    }
    forwardValue5093_18_0 = spill5093_0;
    forwardValue5093_18_1 = spill5093_1;
    forwardValue5093_18_2 = 1;
    }
    forwardValue5093_20_0 = forwardValue5093_18_0;
    forwardValue5093_20_1 = forwardValue5093_18_1;
    forwardValue5093_20_2 = forwardValue5093_18_2;
    break forward_join_20;
    }
    forwardValue5093_20_0 = forwardValue5093_19_0;
    forwardValue5093_20_1 = forwardValue5093_19_1;
    forwardValue5093_20_2 = 0;
    }
    ((net.minecraft.entity.DataWatcher)(forwardValue5093_20_0)).b(((int)(forwardValue5093_20_1)), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(((byte) forwardValue5093_20_2)))))));
    return;
}


public void h(int p0) {
long local2 = (net.minecraft.entity.item.EntityMinecart.cb ^ 66486579483878L);
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_7f869f6dcdc2_originalDynamicSite1918_2(7809, (6627858172864031337L ^ local2)))), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(p0))))));
    return;
}


public void f__Void() {
super.f__Void();
    return;
}


protected double f__sourceReturn_fedcb3e4d3() {
return 0x1.999999999999ap-2d;
}


public int l() {
net.minecraft.entity.item.EntityMinecart forwardValue5094_15_0;
    int forwardValue5094_22_0;
    net.minecraft.entity.item.EntityMinecart spill5094_0;
    long life1_3;
    int life3_5;
    forward_join_22: {
    forward_join_15: {
    forward_join_14: {
    life1_3 = (net.minecraft.entity.item.EntityMinecart.cb ^ 72312346733447L);
    life3_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    spill5094_0 = this;
    if (!((life3_5 == 0))) {
        forwardValue5094_15_0 = spill5094_0;
        break forward_join_15;
    }
    if (!((!((net.minecraft.entity.item.EntityMinecart)(spill5094_0)).G()))) {
        break forward_join_14;
    }
    forwardValue5094_22_0 = ((net.minecraft.entity.item.EntityMinecart)(this)).m__sourceReturn_8abf5c6871();
    break forward_join_22;
    }
    forwardValue5094_15_0 = this;
    }
    forwardValue5094_22_0 = ((net.minecraft.entity.DataWatcher)(((net.minecraft.entity.item.EntityMinecart)(forwardValue5094_15_0)).a__r1())).a__Int(((int)(__sourceIntrinsic_d0e131a72963_invokedynamic5094_5(242, (4570404668063533937L ^ life1_3)))));
    }
    return forwardValue5094_22_0;
}


public void d(double p0, double p1, double p2) {
net.minecraft.entity.item.EntityMinecart __sourceSpill838_0 = this;
    net.minecraft.entity.item.EntityMinecart __stackOp838_1_0 = this;
    double __stackOp838_1_1 = p0;
    double __sourceSpill838_3 = __stackOp838_1_1;
    ((net.minecraft.entity.item.EntityMinecart)(__stackOp838_1_0)).t = ((double)(__stackOp838_1_1));
    ((net.minecraft.entity.item.EntityMinecart)(__sourceSpill838_0)).aN = ((double)(__sourceSpill838_3));
    net.minecraft.entity.item.EntityMinecart __sourceSpill838_5 = this;
    net.minecraft.entity.item.EntityMinecart __stackOp838_6_0 = this;
    double __stackOp838_6_1 = p1;
    double __sourceSpill838_8 = __stackOp838_6_1;
    ((net.minecraft.entity.item.EntityMinecart)(__stackOp838_6_0)).u = ((double)(__stackOp838_6_1));
    ((net.minecraft.entity.item.EntityMinecart)(__sourceSpill838_5)).aO = ((double)(__sourceSpill838_8));
    net.minecraft.entity.item.EntityMinecart __sourceSpill838_10 = this;
    net.minecraft.entity.item.EntityMinecart __stackOp838_11_0 = this;
    double __stackOp838_11_1 = p2;
    double __sourceSpill838_13 = __stackOp838_11_1;
    ((net.minecraft.entity.item.EntityMinecart)(__stackOp838_11_0)).v = ((double)(__stackOp838_11_1));
    ((net.minecraft.entity.item.EntityMinecart)(__sourceSpill838_10)).aP = ((double)(__sourceSpill838_13));
    return;
}


protected void d__Void() {
long local1 = (net.minecraft.entity.item.EntityMinecart.cb ^ 30546228666929L);
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1920_2(1384, (6861026770845124435L ^ local1)))), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(0))))));
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1920_6(4012, (349572475880099221L ^ local1)))), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(1))))));
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1920_10(4933, (7480378356447662450L ^ local1)))), ((java.lang.Object)(java.lang.Float.valueOf(((float)(0x0.0p0f))))));
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1920_14(20698, (9188960948736594673L ^ local1)))), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(0))))));
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1920_18(242, (4570323318721233607L ^ local1)))), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1920_19(9828, (126737184302163026L ^ local1))))))));
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1920_23(28942, (3688899384942375740L ^ local1)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(0))))));
    return;
}


protected void d(net.minecraft.nbt.NBTTagCompound p0) {
net.minecraft.nbt.NBTTagCompound forwardValue5091_32_0;
    java.lang.String forwardValue5091_32_1;
    net.minecraft.nbt.NBTTagCompound forwardValue5091_33_0;
    java.lang.String forwardValue5091_33_1;
    moom.DD forwardValue5091_33_2;
    net.minecraft.nbt.NBTTagCompound forwardValue5091_34_0;
    java.lang.String forwardValue5091_34_1;
    java.lang.String forwardValue5091_34_2;
    net.minecraft.entity.item.EntityMinecart forwardValue5091_48_0;
    java.lang.String forwardValue5091_54_0;
    net.minecraft.entity.item.EntityMinecart spill5091_0;
    net.minecraft.nbt.NBTTagCompound spill5091_1;
    java.lang.String spill5091_2;
    moom.DD spill5091_3;
    java.lang.String spill5091_4;
    long life2_3;
    int life4_5;
    net.minecraft.block.state.IBlockState life5_20;
    moom.DD life6_26;
    forward_join_61: {
    forward_join_54: {
    forward_join_48: {
    forward_join_47: {
    forward_join_34: {
    forward_join_33: {
    forward_join_32: {
    life2_3 = (net.minecraft.entity.item.EntityMinecart.cb ^ 90877309551977L);
    life4_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    spill5091_0 = this;
    if (!((life4_5 != 0))) {
        forwardValue5091_48_0 = spill5091_0;
        break forward_join_48;
    }
    if (!(((net.minecraft.entity.item.EntityMinecart)(spill5091_0)).G())) {
        break forward_join_47;
    }
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("CustomDisplayTile")), ((boolean)(true)));
    life5_20 = ((net.minecraft.entity.item.EntityMinecart)(this)).a__fE();
    life6_26 = ((moom.DD)(((moom.DC)(net.minecraft.block.Block.b)).b(((java.lang.Object)(((net.minecraft.block.state.IBlockState)(life5_20)).a__ch())))));
    spill5091_1 = p0;
    spill5091_2 = "DisplayTile";
    spill5091_3 = life6_26;
    if (!((life4_5 != 0))) {
        forwardValue5091_33_0 = spill5091_1;
        forwardValue5091_33_1 = spill5091_2;
        forwardValue5091_33_2 = spill5091_3;
        break forward_join_33;
    }
    if (!((spill5091_3 == null))) {
        forwardValue5091_32_0 = spill5091_1;
        forwardValue5091_32_1 = spill5091_2;
        break forward_join_32;
    }
    forwardValue5091_34_0 = spill5091_1;
    forwardValue5091_34_1 = spill5091_2;
    forwardValue5091_34_2 = "";
    break forward_join_34;
    }
    forwardValue5091_33_0 = forwardValue5091_32_0;
    forwardValue5091_33_1 = forwardValue5091_32_1;
    forwardValue5091_33_2 = life6_26;
    }
    forwardValue5091_34_0 = forwardValue5091_33_0;
    forwardValue5091_34_1 = forwardValue5091_33_1;
    forwardValue5091_34_2 = ((moom.DD)(forwardValue5091_33_2)).toString();
    }
    ((net.minecraft.nbt.NBTTagCompound)(forwardValue5091_34_0)).a(((java.lang.String)(forwardValue5091_34_1)), ((java.lang.String)(forwardValue5091_34_2)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("DisplayData")), ((int)(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(life5_20)).a__ch())).b(((net.minecraft.block.state.IBlockState)(life5_20))))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("DisplayOffset")), ((int)(((net.minecraft.entity.item.EntityMinecart)(this)).l())));
    }
    forwardValue5091_48_0 = this;
    }
    spill5091_4 = ((net.minecraft.entity.item.EntityMinecart)(forwardValue5091_48_0)).aF;
    if (!((life4_5 != 0))) {
        forwardValue5091_54_0 = spill5091_4;
        break forward_join_54;
    }
    if (!((spill5091_4 != null))) {
        break forward_join_61;
    }
    forwardValue5091_54_0 = this.aF;
    }
    if (!((((java.lang.String)(forwardValue5091_54_0)).length() > 0))) {
        break forward_join_61;
    }
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("CustomName")), ((java.lang.String)(this.aF)));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static net.minecraft.entity.item.EntityMinecart a(net.minecraft.world.World p0, double p1, double p2, double p3, net.minecraft.entity.item.EntityMinecart$EnumMinecartType p4) {
long local8 = (net.minecraft.entity.item.EntityMinecart.cb ^ 137993024772586L);
    switch ((moom.vL.a)[((net.minecraft.entity.item.EntityMinecart$EnumMinecartType)(p4)).ordinal()]) {
case 1:
{
        return new moom.tF(p0, p1, p2, p3);
    }
case 2:
{
        return new net.minecraft.entity.item.EntityMinecartFurnace(p0, p1, p2, p3);
    }
case 3:
{
        return new moom.tJ(p0, p1, p2, p3);
    }
case 4:
{
        return new net.minecraft.entity.ai.EntityMinecartMobSpawner(p0, p1, p2, p3);
    }
case 5:
{
        return new moom.tG(p0, p1, p2, p3);
    }
case 6:
{
        return new moom.tC(p0, p1, p2, p3);
    }
default:
{
        return new moom.tH(p0, p1, p2, p3);
    }
}
}


public net.minecraft.block.state.IBlockState a__fE() {
int forwardValue5089_22_0;
    net.minecraft.block.state.IBlockState forwardValue5089_23_0;
    boolean spill5089_0;
    long life1_3;
    int life3_5;
    forward_join_23: {
    forward_join_22: {
    forward_join_14: {
    life1_3 = (net.minecraft.entity.item.EntityMinecart.cb ^ 104524239538450L);
    life3_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    spill5089_0 = ((net.minecraft.entity.item.EntityMinecart)(this)).G();
    if (!((life3_5 == 0))) {
        forwardValue5089_22_0 = ((spill5089_0) ? 1 : 0);
        break forward_join_22;
    }
    if (!((!spill5089_0))) {
        break forward_join_14;
    }
    forwardValue5089_23_0 = ((net.minecraft.entity.item.EntityMinecart)(this)).b__fE();
    break forward_join_23;
    }
    forwardValue5089_22_0 = ((net.minecraft.entity.DataWatcher)(((net.minecraft.entity.item.EntityMinecart)(this)).a__r1())).a__Int(((int)(__sourceIntrinsic_f4007626729c_invokedynamic5089_6(20203, (8122490826924648417L ^ life1_3)))));
    }
    forwardValue5089_23_0 = __sourceExactCall_03b2f00b6a6c46(((int)(forwardValue5089_22_0)));
    }
    return forwardValue5089_23_0;
}


public abstract net.minecraft.entity.item.EntityMinecart$EnumMinecartType a__aT();

public moom.CA a__CA(net.minecraft.entity.Entity p0) {
net.minecraft.entity.Entity forwardValue5086_12_0;
    moom.CA forwardValue5086_15_0;
    net.minecraft.entity.Entity spill5086_0;
    long life2_3;
    int life4_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_12: {
    life2_3 = (net.minecraft.entity.item.EntityMinecart.cb ^ 137818985056481L);
    life4_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    spill5086_0 = p0;
    if (!((life4_5 != 0))) {
        forwardValue5086_12_0 = spill5086_0;
        break forward_join_12;
    }
    if (!(((net.minecraft.entity.Entity)(spill5086_0)).n__Boolean())) {
        break forward_join_14;
    }
    forwardValue5086_12_0 = p0;
    }
    forwardValue5086_15_0 = ((net.minecraft.entity.Entity)(forwardValue5086_12_0)).b();
    break forward_join_15;
    }
    forwardValue5086_15_0 = null;
    }
    return forwardValue5086_15_0;
}


public void a(java.lang.String p0) {
this.aF = ((java.lang.String)(p0));
    return;
}


public net.minecraft.util.IChatComponent a__C5() {
long local1 = (net.minecraft.entity.item.EntityMinecart.cb ^ 58616912295481L);
    if (((net.minecraft.entity.item.EntityMinecart)(this)).e__Boolean()) {
        moom.CM local3 = new moom.CM(this.aF);
        ((moom.CO)(((moom.CM)(local3)).a__CO())).a(((moom.v3)(((net.minecraft.entity.item.EntityMinecart)(this)).a__v3())));
        ((moom.CO)(((moom.CM)(local3)).a__CO())).a(((java.lang.String)(((java.util.UUID)(((net.minecraft.entity.item.EntityMinecart)(this)).a__UUID())).toString())));
        return local3;
    }
    moom.CN local3 = new moom.CN(((net.minecraft.entity.item.EntityMinecart)(this)).a__String(), new java.lang.Object[0]);
    ((moom.CO)(((moom.CN)(local3)).a__CO())).a(((moom.v3)(((net.minecraft.entity.item.EntityMinecart)(this)).a__v3())));
    ((moom.CO)(((moom.CN)(local3)).a__CO())).a(((java.lang.String)(((java.util.UUID)(((net.minecraft.entity.item.EntityMinecart)(this)).a__UUID())).toString())));
    return local3;
}


public void a(net.minecraft.block.state.IBlockState p0) {
long local2 = (net.minecraft.entity.item.EntityMinecart.cb ^ 28849586917261L);
    ((net.minecraft.entity.DataWatcher)(((net.minecraft.entity.item.EntityMinecart)(this)).a__r1())).b(((int)(__sourceIntrinsic_a8577dc7acd3_originalDynamicSite1921_2(20698, (9188960317506010957L ^ local2)))), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(__sourceExactCall_042b2eb2353c3d(((net.minecraft.block.state.IBlockState)(p0)))))))));
    ((net.minecraft.entity.item.EntityMinecart)(this)).h(((boolean)(true)));
    return;
}


public java.lang.String a__String() {
net.minecraft.entity.item.EntityMinecart forwardValue5087_15_0;
    java.lang.String forwardValue5087_16_0;
    net.minecraft.entity.item.EntityMinecart spill5087_0;
    long life1_3;
    int life3_5;
    forward_join_16: {
    forward_join_15: {
    forward_join_14: {
    life1_3 = (net.minecraft.entity.item.EntityMinecart.cb ^ 80098821384581L);
    life3_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    spill5087_0 = this;
    if (!((life3_5 != 0))) {
        forwardValue5087_15_0 = spill5087_0;
        break forward_join_15;
    }
    if (!((((net.minecraft.entity.item.EntityMinecart)(spill5087_0)).aF != null))) {
        break forward_join_14;
    }
    forwardValue5087_16_0 = this.aF;
    break forward_join_16;
    }
    forwardValue5087_15_0 = this;
    }
    forwardValue5087_16_0 = __sourceIntrinsic_64ccfb84e285_call5087_4(forwardValue5087_15_0);
    }
    return forwardValue5087_16_0;
}


public moom.CA a__CA() {
return null;
}


public moom.DR a__sourceReturn_ec3967a824(double p0, double p1, double p2) {
net.minecraft.world.World forwardValue5081_38_0;
    moom.DT forwardValue5081_38_1;
    net.minecraft.block.state.IBlockState forwardValue5081_46_0;
    int forwardValue5081_181_0;
    double forwardValue5081_196_0;
    double forwardValue5081_196_1;
    int forwardValue5081_245_0;
    double forwardValue5081_248_0;
    double forwardValue5081_248_1;
    int spill5081_0;
    net.minecraft.world.World spill5081_1;
    moom.DT spill5081_2;
    net.minecraft.block.state.IBlockState spill5081_3;
    int spill5081_4;
    double spill5081_5;
    double spill5081_6;
    int spill5081_7;
    double spill5081_8;
    double spill5081_9;
    long life7_3;
    int life10_6;
    int life11_9;
    int life12_13;
    int life9_14;
    net.minecraft.block.state.IBlockState life13_45;
    net.minecraft.block.BlockRailBase$EnumRailDirection life14_64;
    int[][] life15_69;
    double life16_71;
    double life18_85;
    double life20_99;
    double life22_113;
    double life24_127;
    double life26_141;
    double life28_155;
    double life30_159;
    double life32_165;
    double life34_169;
    double life16_188;
    double life36_221;
    double life38_225;
    double life1_241;
    double life3_247;
    double life5_253;
    forward_join_257: {
    forward_join_250: {
    forward_join_248: {
    forward_join_245: {
    forward_join_240: {
    forward_join_212: {
    forward_join_196: {
    forward_join_194: {
    forward_join_181: {
    forward_join_176: {
    forward_join_46: {
    forward_join_38: {
    forward_join_30: {
    life7_3 = (net.minecraft.entity.item.EntityMinecart.cb ^ 31868467228817L);
    life10_6 = moom.Dr.b__Int(((double)(p0)));
    life11_9 = moom.Dr.b__Int(((double)(p1)));
    spill5081_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    life12_13 = moom.Dr.b__Int(((double)(p2)));
    life9_14 = spill5081_0;
    spill5081_1 = this.i;
    spill5081_2 = new moom.DT(life10_6, (life11_9 - 1), life12_13);
    if (!((life9_14 != 0))) {
        forwardValue5081_38_0 = spill5081_1;
        forwardValue5081_38_1 = spill5081_2;
        break forward_join_38;
    }
    if (!(moom.d2.c(((net.minecraft.world.World)(spill5081_1)), ((moom.DT)(spill5081_2))))) {
        break forward_join_30;
    }
    life11_9 += -1;
    }
    forwardValue5081_38_0 = this.i;
    forwardValue5081_38_1 = new moom.DT(life10_6, life11_9, life12_13);
    }
    life13_45 = ((net.minecraft.world.World)(forwardValue5081_38_0)).a__fE(((moom.DT)(forwardValue5081_38_1)));
    spill5081_3 = life13_45;
    if (!((life9_14 != 0))) {
        forwardValue5081_46_0 = spill5081_3;
        break forward_join_46;
    }
    if (!(__sourceExactCall_2e6b3bd58a1006(((net.minecraft.block.state.IBlockState)(spill5081_3))))) {
        break forward_join_257;
    }
    forwardValue5081_46_0 = life13_45;
    }
    life14_64 = ((net.minecraft.block.BlockRailBase$EnumRailDirection)(((net.minecraft.block.state.IBlockState)(forwardValue5081_46_0)).a(((net.minecraft.block.properties.IProperty)(((moom.d2)(((moom.d2)(((net.minecraft.block.state.IBlockState)(life13_45)).a__ch())))).a__ft())))));
    life15_69 = (net.minecraft.entity.item.EntityMinecart.aG)[((net.minecraft.block.BlockRailBase$EnumRailDirection)(life14_64)).a()];
    life16_71 = 0x0.0p0d;
    life18_85 = ((((double) life10_6) + 0x1.0p-1d) + (((double) ((life15_69)[0])[0]) * 0x1.0p-1d));
    life20_99 = ((((double) life11_9) + 0x1.0p-4d) + (((double) ((life15_69)[0])[1]) * 0x1.0p-1d));
    life22_113 = ((((double) life12_13) + 0x1.0p-1d) + (((double) ((life15_69)[0])[2]) * 0x1.0p-1d));
    life24_127 = ((((double) life10_6) + 0x1.0p-1d) + (((double) ((life15_69)[1])[0]) * 0x1.0p-1d));
    life26_141 = ((((double) life11_9) + 0x1.0p-4d) + (((double) ((life15_69)[1])[1]) * 0x1.0p-1d));
    life28_155 = ((((double) life12_13) + 0x1.0p-1d) + (((double) ((life15_69)[1])[2]) * 0x1.0p-1d));
    life30_159 = (life24_127 - life18_85);
    life32_165 = ((life26_141 - life20_99) * 0x1.0p1d);
    life34_169 = (life28_155 - life22_113);
    spill5081_4 = recovery.source.CarrierOps.dcmpl(((double)(life30_159)), ((double)(0x0.0p0d)));
    if (!((life9_14 != 0))) {
        forwardValue5081_181_0 = spill5081_4;
        break forward_join_181;
    }
    if (!((spill5081_4 == 0))) {
        break forward_join_176;
    }
    p0 = (((double) life10_6) + 0x1.0p-1d);
    life16_188 = (p2 - ((double) life12_13));
    if (!((life9_14 == 0))) {
        break forward_join_212;
    }
    }
    spill5081_5 = life34_169;
    spill5081_6 = 0x0.0p0d;
    if (!((life9_14 != 0))) {
        forwardValue5081_196_0 = spill5081_5;
        forwardValue5081_196_1 = spill5081_6;
        break forward_join_196;
    }
    forwardValue5081_181_0 = recovery.source.CarrierOps.dcmpl(((double)(spill5081_5)), ((double)(spill5081_6)));
    }
    if (!((forwardValue5081_181_0 == 0))) {
        break forward_join_194;
    }
    p2 = (((double) life12_13) + 0x1.0p-1d);
    life16_188 = (p0 - ((double) life10_6));
    if (!((life9_14 == 0))) {
        break forward_join_212;
    }
    }
    forwardValue5081_196_0 = p0;
    forwardValue5081_196_1 = life18_85;
    }
    life36_221 = (forwardValue5081_196_0 - forwardValue5081_196_1);
    life38_225 = (p2 - life22_113);
    life16_188 = (((life36_221 * life30_159) + (life38_225 * life34_169)) * 0x1.0p1d);
    }
    life1_241 = (life18_85 + (life30_159 * life16_188));
    life3_247 = (life20_99 + (life32_165 * life16_188));
    life5_253 = (life22_113 + (life34_169 * life16_188));
    spill5081_7 = recovery.source.CarrierOps.dcmpg(((double)(life32_165)), ((double)(0x0.0p0d)));
    if (!((life9_14 != 0))) {
        forwardValue5081_245_0 = spill5081_7;
        break forward_join_245;
    }
    if (!((spill5081_7 < 0))) {
        break forward_join_240;
    }
    life3_247 = (life3_247 + 0x1.0p0d);
    }
    spill5081_8 = life32_165;
    spill5081_9 = 0x0.0p0d;
    if (!((life9_14 != 0))) {
        forwardValue5081_248_0 = spill5081_8;
        forwardValue5081_248_1 = spill5081_9;
        break forward_join_248;
    }
    forwardValue5081_245_0 = recovery.source.CarrierOps.dcmpl(((double)(spill5081_8)), ((double)(spill5081_9)));
    }
    if (!((forwardValue5081_245_0 > 0))) {
        break forward_join_250;
    }
    forwardValue5081_248_0 = life3_247;
    forwardValue5081_248_1 = 0x1.0p-1d;
    }
    life3_247 = (forwardValue5081_248_0 + forwardValue5081_248_1);
    }
    return new moom.DR(life1_241, life3_247, life5_253);
    }
    return null;
}


public moom.DR a(double p0, double p1, double p2, double p3) {
net.minecraft.world.World forwardValue5082_38_0;
    moom.DT forwardValue5082_38_1;
    net.minecraft.block.state.IBlockState forwardValue5082_46_0;
    int forwardValue5082_64_0;
    int forwardValue5082_174_0;
    int forwardValue5082_181_0;
    int forwardValue5082_200_0;
    int forwardValue5082_200_1;
    double forwardValue5082_209_0;
    int spill5082_0;
    net.minecraft.world.World spill5082_1;
    moom.DT spill5082_2;
    net.minecraft.block.state.IBlockState spill5082_3;
    boolean spill5082_4;
    int spill5082_5;
    int spill5082_6;
    int spill5082_7;
    int spill5082_8;
    double spill5082_9;
    long life9_3;
    int life12_6;
    int life13_10;
    int life11_11;
    int life14_14;
    net.minecraft.block.state.IBlockState life15_45;
    net.minecraft.block.BlockRailBase$EnumRailDirection life16_64;
    double life3_67;
    int[][] life17_88;
    double life18_101;
    double life20_114;
    double life22_123;
    double life18_127;
    double life20_131;
    double life1_137;
    double life5_143;
    forward_join_216: {
    forward_join_210: {
    forward_join_209: {
    forward_join_200: {
    forward_join_181: {
    forward_join_174: {
    forward_join_169: {
    forward_join_66: {
    forward_join_64: {
    forward_join_46: {
    forward_join_38: {
    forward_join_30: {
    life9_3 = (net.minecraft.entity.item.EntityMinecart.cb ^ 451488417224L);
    life12_6 = moom.Dr.b__Int(((double)(p0)));
    spill5082_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    life13_10 = moom.Dr.b__Int(((double)(p1)));
    life11_11 = spill5082_0;
    life14_14 = moom.Dr.b__Int(((double)(p2)));
    spill5082_1 = this.i;
    spill5082_2 = new moom.DT(life12_6, (life13_10 - 1), life14_14);
    if (!((life11_11 != 0))) {
        forwardValue5082_38_0 = spill5082_1;
        forwardValue5082_38_1 = spill5082_2;
        break forward_join_38;
    }
    if (!(moom.d2.c(((net.minecraft.world.World)(spill5082_1)), ((moom.DT)(spill5082_2))))) {
        break forward_join_30;
    }
    life13_10 += -1;
    }
    forwardValue5082_38_0 = this.i;
    forwardValue5082_38_1 = new moom.DT(life12_6, life13_10, life14_14);
    }
    life15_45 = ((net.minecraft.world.World)(forwardValue5082_38_0)).a__fE(((moom.DT)(forwardValue5082_38_1)));
    spill5082_3 = life15_45;
    if (!((life11_11 != 0))) {
        forwardValue5082_46_0 = spill5082_3;
        break forward_join_46;
    }
    if (!(__sourceExactCall_2e6b3bd58a1006(((net.minecraft.block.state.IBlockState)(spill5082_3))))) {
        break forward_join_216;
    }
    forwardValue5082_46_0 = life15_45;
    }
    life16_64 = ((net.minecraft.block.BlockRailBase$EnumRailDirection)(((net.minecraft.block.state.IBlockState)(forwardValue5082_46_0)).a(((net.minecraft.block.properties.IProperty)(((moom.d2)(((moom.d2)(((net.minecraft.block.state.IBlockState)(life15_45)).a__ch())))).a__ft())))));
    life3_67 = ((double) life13_10);
    spill5082_4 = ((net.minecraft.block.BlockRailBase$EnumRailDirection)(life16_64)).a__Boolean();
    if (!((life11_11 != 0))) {
        forwardValue5082_64_0 = ((spill5082_4) ? 1 : 0);
        break forward_join_64;
    }
    if (!(spill5082_4)) {
        break forward_join_66;
    }
    forwardValue5082_64_0 = (life13_10 + 1);
    }
    life3_67 = ((double) forwardValue5082_64_0);
    }
    life17_88 = (net.minecraft.entity.item.EntityMinecart.aG)[((net.minecraft.block.BlockRailBase$EnumRailDirection)(life16_64)).a()];
    life18_101 = ((double) (((life17_88)[1])[0] - ((life17_88)[0])[0]));
    life20_114 = ((double) (((life17_88)[1])[2] - ((life17_88)[0])[2]));
    life22_123 = java.lang.Math.sqrt(((double)(((life18_101 * life18_101) + (life20_114 * life20_114)))));
    life18_127 = (life18_101 / life22_123);
    life20_131 = (life20_114 / life22_123);
    life1_137 = (p0 + (life18_127 * p3));
    life5_143 = (p2 + (life20_131 * p3));
    spill5082_5 = ((life17_88)[0])[1];
    if (!((life11_11 != 0))) {
        forwardValue5082_174_0 = spill5082_5;
        break forward_join_174;
    }
    if (!((spill5082_5 != 0))) {
        break forward_join_169;
    }
    spill5082_6 = (moom.Dr.b__Int(((double)(life1_137))) - life12_6);
    if (!((life11_11 != 0))) {
        forwardValue5082_174_0 = spill5082_6;
        break forward_join_174;
    }
    if (!((spill5082_6 == ((life17_88)[0])[0]))) {
        break forward_join_169;
    }
    spill5082_7 = (moom.Dr.b__Int(((double)(life5_143))) - life14_14);
    if (!((life11_11 != 0))) {
        forwardValue5082_174_0 = spill5082_7;
        break forward_join_174;
    }
    if (!((spill5082_7 == ((life17_88)[0])[2]))) {
        break forward_join_169;
    }
    life3_67 = (life3_67 + ((double) ((life17_88)[0])[1]));
    if (!((life11_11 == 0))) {
        break forward_join_210;
    }
    }
    forwardValue5082_174_0 = ((life17_88)[1])[1];
    }
    if (!((life11_11 != 0))) {
        forwardValue5082_181_0 = forwardValue5082_174_0;
        break forward_join_181;
    }
    if (!((forwardValue5082_174_0 != 0))) {
        break forward_join_210;
    }
    forwardValue5082_181_0 = (moom.Dr.b__Int(((double)(life1_137))) - life12_6);
    }
    spill5082_8 = ((life17_88)[1])[0];
    if (!((life11_11 != 0))) {
        forwardValue5082_200_0 = forwardValue5082_181_0;
        forwardValue5082_200_1 = spill5082_8;
        break forward_join_200;
    }
    if (!((forwardValue5082_181_0 == spill5082_8))) {
        break forward_join_210;
    }
    spill5082_9 = life5_143;
    if (!((life11_11 != 0))) {
        forwardValue5082_209_0 = spill5082_9;
        break forward_join_209;
    }
    forwardValue5082_200_0 = (moom.Dr.b__Int(((double)(spill5082_9))) - life14_14);
    forwardValue5082_200_1 = ((life17_88)[1])[2];
    }
    if (!((forwardValue5082_200_0 == forwardValue5082_200_1))) {
        break forward_join_210;
    }
    forwardValue5082_209_0 = (life3_67 + ((double) ((life17_88)[1])[1]));
    }
    life3_67 = forwardValue5082_209_0;
    }
    return ((net.minecraft.entity.item.EntityMinecart)(this)).a__sourceReturn_ec3967a824(((double)(life1_137)), ((double)(life3_67)), ((double)(life5_143)));
    }
    return null;
}


public void a__Void(double p0, double p1, double p2) {
this.n = ((double)(p0));
    this.o = ((double)(p1));
    this.p = ((double)(p2));
    float local7 = (this.G / 0x1.0p1f);
    float local8 = this.H;
    ((net.minecraft.entity.item.EntityMinecart)(this)).a(((moom.CA)(new moom.CA((p0 - ((double) local7)), p1, (p2 - ((double) local7)), (p0 + ((double) local7)), (p1 + ((double) local8)), (p2 + ((double) local7))))));
    return;
}


public boolean a__Boolean(net.minecraft.util.DamageSource p0, float p1) {
int forwardValue5085_50_0;
    int forwardValue5085_58_0;
    int forwardValue5085_62_0;
    int forwardValue5085_64_0;
    int forwardValue5085_73_0;
    net.minecraft.entity.Entity forwardValue5085_83_0;
    int forwardValue5085_93_0;
    net.minecraft.entity.item.EntityMinecart forwardValue5085_99_0;
    int forwardValue5085_102_0;
    int forwardValue5085_104_0;
    boolean spill5085_0;
    boolean spill5085_1;
    boolean spill5085_2;
    int spill5085_3;
    net.minecraft.entity.Entity spill5085_4;
    int spill5085_5;
    net.minecraft.entity.item.EntityMinecart spill5085_6;
    long life3_3;
    int life5_5;
    int life6_90;
    forward_join_104: {
    forward_join_103: {
    forward_join_102: {
    forward_join_101: {
    forward_join_99: {
    forward_join_98: {
    forward_join_93: {
    forward_join_85: {
    forward_join_83: {
    forward_join_76: {
    forward_join_73: {
    forward_join_64: {
    forward_join_63: {
    forward_join_62: {
    forward_join_58: {
    forward_join_50: {
    forward_join_25: {
    life3_3 = (net.minecraft.entity.item.EntityMinecart.cb ^ 8845564616416L);
    life5_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    spill5085_0 = ((net.minecraft.world.World)(this.i)).G;
    if (!((life5_5 == 0))) {
        forwardValue5085_104_0 = ((spill5085_0) ? 1 : 0);
        break forward_join_104;
    }
    if (!((!spill5085_0))) {
        break forward_join_103;
    }
    spill5085_1 = this.F;
    if (!((life5_5 == 0))) {
        forwardValue5085_104_0 = ((spill5085_1) ? 1 : 0);
        break forward_join_104;
    }
    if (!((!spill5085_1))) {
        break forward_join_103;
    }
    spill5085_2 = ((net.minecraft.entity.item.EntityMinecart)(this)).a(((net.minecraft.util.DamageSource)(p0)));
    if (!((life5_5 == 0))) {
        forwardValue5085_50_0 = ((spill5085_2) ? 1 : 0);
        break forward_join_50;
    }
    if (!(spill5085_2)) {
        break forward_join_25;
    }
    return ((0) != 0);
    }
    ((net.minecraft.entity.item.EntityMinecart)(this)).h(((int)((-((net.minecraft.entity.item.EntityMinecart)(this)).k()))));
    ((net.minecraft.entity.item.EntityMinecart)(this)).g(((int)(__sourceIntrinsic_153a193fc182_invokedynamic5085_12(31782, (5087151711856214730L ^ life3_3)))));
    ((net.minecraft.entity.item.EntityMinecart)(this)).q();
    ((net.minecraft.entity.item.EntityMinecart)(this)).c(((float)((((net.minecraft.entity.item.EntityMinecart)(this)).a() + (p1 * 0x1.4p3f)))));
    forwardValue5085_50_0 = ((((net.minecraft.util.DamageSource)(p0)).b__r3() instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    }
    if (!((life5_5 == 0))) {
        forwardValue5085_58_0 = forwardValue5085_50_0;
        break forward_join_58;
    }
    if (!((forwardValue5085_50_0 != 0))) {
        break forward_join_63;
    }
    forwardValue5085_58_0 = ((((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.util.DamageSource)(p0)).b__r3())))).b1)).d) ? 1 : 0);
    }
    if (!((life5_5 == 0))) {
        forwardValue5085_62_0 = forwardValue5085_58_0;
        break forward_join_62;
    }
    if (!((forwardValue5085_58_0 != 0))) {
        break forward_join_63;
    }
    forwardValue5085_62_0 = 1;
    }
    forwardValue5085_64_0 = forwardValue5085_62_0;
    break forward_join_64;
    }
    forwardValue5085_64_0 = 0;
    }
    life6_90 = forwardValue5085_64_0;
    spill5085_3 = life6_90;
    if (!((life5_5 == 0))) {
        forwardValue5085_73_0 = spill5085_3;
        break forward_join_73;
    }
    if (!((spill5085_3 == 0))) {
        break forward_join_76;
    }
    forwardValue5085_73_0 = recovery.source.CarrierOps.fcmpl(((float)(((net.minecraft.entity.item.EntityMinecart)(this)).a())), ((float)(0x1.4p5f)));
    }
    if (!((life5_5 == 0))) {
        forwardValue5085_102_0 = forwardValue5085_73_0;
        break forward_join_102;
    }
    if (!((forwardValue5085_73_0 > 0))) {
        break forward_join_101;
    }
    }
    spill5085_4 = this.f;
    if (!((life5_5 == 0))) {
        forwardValue5085_83_0 = spill5085_4;
        break forward_join_83;
    }
    if (!((spill5085_4 != null))) {
        break forward_join_85;
    }
    forwardValue5085_83_0 = this.f;
    }
    ((net.minecraft.entity.Entity)(forwardValue5085_83_0)).b(((net.minecraft.entity.Entity)(null)));
    }
    spill5085_5 = life6_90;
    if (!((life5_5 == 0))) {
        forwardValue5085_93_0 = spill5085_5;
        break forward_join_93;
    }
    if (!((spill5085_5 != 0))) {
        break forward_join_98;
    }
    spill5085_6 = this;
    if (!((life5_5 == 0))) {
        forwardValue5085_99_0 = spill5085_6;
        break forward_join_99;
    }
    forwardValue5085_93_0 = ((((net.minecraft.entity.item.EntityMinecart)(spill5085_6)).e__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue5085_93_0 == 0))) {
        break forward_join_98;
    }
    ((net.minecraft.entity.item.EntityMinecart)(this)).f__Void();
    if (!((life5_5 != 0))) {
        break forward_join_101;
    }
    }
    forwardValue5085_99_0 = this;
    }
    ((net.minecraft.entity.item.EntityMinecart)(forwardValue5085_99_0)).a__sourceReturn_7889e8f768(((net.minecraft.util.DamageSource)(p0)));
    }
    forwardValue5085_102_0 = 1;
    }
    return ((forwardValue5085_102_0) != 0);
    }
    forwardValue5085_104_0 = 1;
    }
    return ((forwardValue5085_104_0) != 0);
}


public void a__sourceReturn_7889e8f768(net.minecraft.util.DamageSource p0) {
net.minecraft.entity.item.EntityMinecart forwardValue5084_31_0;
    int spill5084_0;
    net.minecraft.entity.item.EntityMinecart spill5084_1;
    long life2_3;
    int life4_7;
    net.minecraft.item.ItemStack life5_19;
    forward_join_35: {
    forward_join_31: {
    forward_join_30: {
    life2_3 = (net.minecraft.entity.item.EntityMinecart.cb ^ 111085815163865L);
    spill5084_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    ((net.minecraft.entity.item.EntityMinecart)(this)).f__Void();
    life4_7 = spill5084_0;
    if (!(((net.minecraft.world.GameRules)(((net.minecraft.world.World)(this.i)).a__Ej())).a__Boolean(((java.lang.String)("doEntityDrops"))))) {
        break forward_join_35;
    }
    life5_19 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.az, 1);
    spill5084_1 = this;
    if (!((life4_7 == 0))) {
        forwardValue5084_31_0 = spill5084_1;
        break forward_join_31;
    }
    if (!((((net.minecraft.entity.item.EntityMinecart)(spill5084_1)).aF != null))) {
        break forward_join_30;
    }
    ((net.minecraft.item.ItemStack)(life5_19)).a(((java.lang.String)(this.aF)));
    }
    forwardValue5084_31_0 = this;
    }
    ((net.minecraft.entity.item.EntityMinecart)(forwardValue5084_31_0)).a(((net.minecraft.item.ItemStack)(life5_19)), ((float)(0x0.0p0f)));
    }
    return;
}


public void a(int p0, int p1, int p2, boolean p3) {
return;
}


public void a(double p0, double p1, double p2, float p3, float p4, int p5, boolean p6) {
this.aI = ((double)(p0));
    this.aJ = ((double)(p1));
    this.aK = ((double)(p2));
    this.aL = ((double)(((double) p3)));
    this.aM = ((double)(((double) p4)));
    this.aH = ((int)((p5 + 2)));
    this.t = ((double)(this.aN));
    this.u = ((double)(this.aO));
    this.v = ((double)(this.aP));
    return;
}


public float a() {
long local1 = (net.minecraft.entity.item.EntityMinecart.cb ^ 12204752132043L);
    return ((net.minecraft.entity.DataWatcher)(this.al)).a__Float(((int)(__sourceIntrinsic_76940a5779a0_originalDynamicSite1922_2(6409, (79192020297445059L ^ local1)))));
}


public void a__Void(net.minecraft.entity.Entity p0) {
int forwardValue5088_14_0;
    int forwardValue5088_21_0;
    net.minecraft.entity.Entity forwardValue5088_23_0;
    net.minecraft.entity.Entity forwardValue5088_29_0;
    net.minecraft.entity.Entity forwardValue5088_79_0;
    double forwardValue5088_82_0;
    double forwardValue5088_82_1;
    double forwardValue5088_118_0;
    double forwardValue5088_118_1;
    int forwardValue5088_172_0;
    double forwardValue5088_231_0;
    double forwardValue5088_231_1;
    net.minecraft.entity.item.EntityMinecart$EnumMinecartType forwardValue5088_295_0;
    net.minecraft.entity.item.EntityMinecart$EnumMinecartType forwardValue5088_295_1;
    net.minecraft.entity.Entity forwardValue5088_381_0;
    net.minecraft.entity.Entity forwardValue5088_399_0;
    boolean spill5088_0;
    net.minecraft.entity.item.EntityMinecart spill5088_1;
    net.minecraft.entity.Entity spill5088_2;
    net.minecraft.entity.Entity spill5088_3;
    net.minecraft.entity.item.EntityMinecart spill5088_4;
    double spill5088_5;
    double spill5088_6;
    net.minecraft.entity.Entity spill5088_7;
    net.minecraft.entity.Entity spill5088_8;
    double spill5088_9;
    double spill5088_10;
    int spill5088_11;
    net.minecraft.entity.Entity spill5088_12;
    double spill5088_13;
    double spill5088_14;
    net.minecraft.entity.item.EntityMinecart$EnumMinecartType spill5088_15;
    net.minecraft.entity.item.EntityMinecart$EnumMinecartType spill5088_16;
    net.minecraft.entity.item.EntityMinecart$EnumMinecartType spill5088_17;
    net.minecraft.entity.item.EntityMinecart$EnumMinecartType spill5088_18;
    net.minecraft.entity.item.EntityMinecart spill5088_19;
    net.minecraft.entity.item.EntityMinecart spill5088_20;
    long life2_3;
    int life4_5;
    double life5_146;
    double life7_152;
    double life9_160;
    double life9_173;
    double life11_185;
    double life5_200;
    double life7_204;
    double life5_208;
    double life7_212;
    double life5_220;
    double life7_228;
    double life13_250;
    double life15_256;
    moom.DR life17_264;
    moom.DR life18_286;
    double life19_291;
    double life21_309;
    double life23_315;
    forward_join_407: {
    forward_join_399: {
    forward_join_391: {
    forward_join_389: {
    forward_join_381: {
    forward_join_339: {
    forward_join_295: {
    forward_join_289: {
    forward_join_231: {
    forward_join_227: {
    forward_join_172: {
    forward_join_128: {
    forward_join_118: {
    forward_join_82: {
    forward_join_79: {
    forward_join_78: {
    forward_join_29: {
    forward_join_23: {
    forward_join_21: {
    forward_join_14: {
    life2_3 = (net.minecraft.entity.item.EntityMinecart.cb ^ 70841398229780L);
    life4_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    spill5088_0 = ((net.minecraft.world.World)(this.i)).G;
    if (!((life4_5 != 0))) {
        forwardValue5088_14_0 = ((spill5088_0) ? 1 : 0);
        break forward_join_14;
    }
    if (!((!spill5088_0))) {
        break forward_join_407;
    }
    forwardValue5088_14_0 = ((((net.minecraft.entity.Entity)(p0)).Q) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue5088_21_0 = forwardValue5088_14_0;
        break forward_join_21;
    }
    if (!((forwardValue5088_14_0 == 0))) {
        break forward_join_407;
    }
    spill5088_1 = this;
    if (!((life4_5 != 0))) {
        forwardValue5088_23_0 = spill5088_1;
        break forward_join_23;
    }
    forwardValue5088_21_0 = ((((net.minecraft.entity.item.EntityMinecart)(spill5088_1)).Q) ? 1 : 0);
    }
    if (!((forwardValue5088_21_0 == 0))) {
        break forward_join_407;
    }
    forwardValue5088_23_0 = p0;
    }
    if (!((life4_5 != 0))) {
        forwardValue5088_29_0 = forwardValue5088_23_0;
        break forward_join_29;
    }
    if (!((forwardValue5088_23_0 != this.f))) {
        break forward_join_407;
    }
    forwardValue5088_29_0 = p0;
    }
    if (!((life4_5 != 0))) {
        forwardValue5088_79_0 = forwardValue5088_29_0;
        break forward_join_79;
    }
    if (!((((forwardValue5088_29_0 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0) != 0))) {
        break forward_join_78;
    }
    spill5088_2 = p0;
    if (!((life4_5 != 0))) {
        forwardValue5088_79_0 = spill5088_2;
        break forward_join_79;
    }
    if (!((((spill5088_2 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0) == 0))) {
        break forward_join_78;
    }
    spill5088_3 = p0;
    if (!((life4_5 != 0))) {
        forwardValue5088_79_0 = spill5088_3;
        break forward_join_79;
    }
    if (!((((spill5088_3 instanceof net.minecraft.entity.monster.EntityIronGolem) ? 1 : 0) == 0))) {
        break forward_join_78;
    }
    spill5088_4 = this;
    if (!((life4_5 != 0))) {
        forwardValue5088_79_0 = spill5088_4;
        break forward_join_79;
    }
    if (!((((net.minecraft.entity.item.EntityMinecart)(spill5088_4)).a__aT() == net.minecraft.entity.item.EntityMinecart$EnumMinecartType.RIDEABLE))) {
        break forward_join_78;
    }
    spill5088_5 = ((this.t * this.t) + (this.v * this.v));
    spill5088_6 = 0x1.47ae147ae147bp-7d;
    if (!((life4_5 != 0))) {
        forwardValue5088_82_0 = spill5088_5;
        forwardValue5088_82_1 = spill5088_6;
        break forward_join_82;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill5088_5)), ((double)(spill5088_6))) > 0))) {
        break forward_join_78;
    }
    spill5088_7 = this.f;
    if (!((life4_5 != 0))) {
        forwardValue5088_79_0 = spill5088_7;
        break forward_join_79;
    }
    if (!((spill5088_7 == null))) {
        break forward_join_78;
    }
    spill5088_8 = ((net.minecraft.entity.Entity)(p0)).g;
    if (!((life4_5 != 0))) {
        forwardValue5088_79_0 = spill5088_8;
        break forward_join_79;
    }
    if (!((spill5088_8 == null))) {
        break forward_join_78;
    }
    ((net.minecraft.entity.Entity)(p0)).b(((net.minecraft.entity.Entity)(this)));
    }
    forwardValue5088_79_0 = p0;
    }
    forwardValue5088_82_0 = ((net.minecraft.entity.Entity)(forwardValue5088_79_0)).n;
    forwardValue5088_82_1 = this.n;
    }
    life5_146 = (forwardValue5088_82_0 - forwardValue5088_82_1);
    life7_152 = (((net.minecraft.entity.Entity)(p0)).p - this.p);
    life9_160 = ((life5_146 * life5_146) + (life7_152 * life7_152));
    spill5088_9 = life9_160;
    spill5088_10 = 0x1.a36e2ep-14d;
    if (!((life4_5 != 0))) {
        forwardValue5088_118_0 = spill5088_9;
        forwardValue5088_118_1 = spill5088_10;
        break forward_join_118;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill5088_9)), ((double)(spill5088_10))) >= 0))) {
        break forward_join_407;
    }
    life9_173 = ((double) moom.Dr.a__Float(((double)(life9_160))));
    life5_146 = (life5_146 / life9_173);
    life7_152 = (life7_152 / life9_173);
    forwardValue5088_118_0 = 0x1.0p0d;
    forwardValue5088_118_1 = life9_173;
    }
    life11_185 = (forwardValue5088_118_0 / forwardValue5088_118_1);
    spill5088_11 = recovery.source.CarrierOps.dcmpl(((double)(life11_185)), ((double)(0x1.0p0d)));
    if (!((life4_5 != 0))) {
        forwardValue5088_172_0 = spill5088_11;
        break forward_join_172;
    }
    if (!((spill5088_11 > 0))) {
        break forward_join_128;
    }
    life11_185 = 0x1.0p0d;
    }
    life5_200 = (life5_146 * life11_185);
    life7_204 = (life7_152 * life11_185);
    life5_208 = (life5_200 * 0x1.99999ap-4d);
    life7_212 = (life7_204 * 0x1.99999ap-4d);
    life5_220 = (life5_208 * ((double) (0x1.0p0f - this.R)));
    life7_228 = (life7_212 * ((double) (0x1.0p0f - this.R)));
    life5_146 = (life5_220 * 0x1.0p-1d);
    life7_152 = (life7_228 * 0x1.0p-1d);
    spill5088_12 = p0;
    if (!((life4_5 != 0))) {
        forwardValue5088_399_0 = spill5088_12;
        break forward_join_399;
    }
    forwardValue5088_172_0 = ((spill5088_12 instanceof net.minecraft.entity.item.EntityMinecart) ? 1 : 0);
    }
    if (!((forwardValue5088_172_0 != 0))) {
        break forward_join_391;
    }
    life13_250 = (((net.minecraft.entity.Entity)(p0)).n - this.n);
    life15_256 = (((net.minecraft.entity.Entity)(p0)).p - this.p);
    life17_264 = ((moom.DR)(new moom.DR(life13_250, 0x0.0p0d, life15_256))).a__DR();
    life18_286 = ((moom.DR)(new moom.DR(((double) moom.Dr.b(((float)(((this.w * 0x1.921fb6p1f) / 0x1.68p7f))))), 0x0.0p0d, ((double) moom.Dr.a(((float)(((this.w * 0x1.921fb6p1f) / 0x1.68p7f)))))))).a__DR();
    life19_291 = java.lang.Math.abs(((double)(((moom.DR)(life17_264)).a(((moom.DR)(life18_286))))));
    spill5088_13 = life19_291;
    spill5088_14 = 0x1.99999ap-1d;
    if (!((life4_5 != 0))) {
        forwardValue5088_231_0 = spill5088_13;
        forwardValue5088_231_1 = spill5088_14;
        break forward_join_231;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(spill5088_13)), ((double)(spill5088_14))) < 0))) {
        break forward_join_227;
    }
    return;
    }
    forwardValue5088_231_0 = ((net.minecraft.entity.Entity)(p0)).t;
    forwardValue5088_231_1 = this.t;
    }
    life21_309 = (forwardValue5088_231_0 + forwardValue5088_231_1);
    life23_315 = (((net.minecraft.entity.Entity)(p0)).v + this.v);
    spill5088_15 = ((net.minecraft.entity.item.EntityMinecart)(((net.minecraft.entity.item.EntityMinecart)(p0)))).a__aT();
    spill5088_16 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.FURNACE;
    if (!((life4_5 != 0))) {
        forwardValue5088_295_0 = spill5088_15;
        forwardValue5088_295_1 = spill5088_16;
        break forward_join_295;
    }
    if (!((spill5088_15 == spill5088_16))) {
        break forward_join_289;
    }
    spill5088_17 = ((net.minecraft.entity.item.EntityMinecart)(this)).a__aT();
    spill5088_18 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.FURNACE;
    if (!((life4_5 != 0))) {
        forwardValue5088_295_0 = spill5088_17;
        forwardValue5088_295_1 = spill5088_18;
        break forward_join_295;
    }
    if (!((spill5088_17 != spill5088_18))) {
        break forward_join_289;
    }
    net.minecraft.entity.item.EntityMinecart __stackOp5088_55_0 = this;
    ((net.minecraft.entity.item.EntityMinecart)(__stackOp5088_55_0)).t = ((double)((((net.minecraft.entity.item.EntityMinecart)(__stackOp5088_55_0)).t * 0x1.99999ap-3d)));
    net.minecraft.entity.item.EntityMinecart __stackOp5088_58_0 = this;
    ((net.minecraft.entity.item.EntityMinecart)(__stackOp5088_58_0)).v = ((double)((((net.minecraft.entity.item.EntityMinecart)(__stackOp5088_58_0)).v * 0x1.99999ap-3d)));
    __sourceExactCall_553676dacf21e2(((net.minecraft.entity.item.EntityMinecart)(this)), ((double)((((net.minecraft.entity.Entity)(p0)).t - life5_146))), ((double)(0x0.0p0d)), ((double)((((net.minecraft.entity.Entity)(p0)).v - life7_152))));
    net.minecraft.entity.Entity __stackOp5088_64_0 = p0;
    ((net.minecraft.entity.Entity)(__stackOp5088_64_0)).t = ((double)((((net.minecraft.entity.Entity)(__stackOp5088_64_0)).t * 0x1.e66666p-1d)));
    net.minecraft.entity.Entity __stackOp5088_67_0 = p0;
    ((net.minecraft.entity.Entity)(__stackOp5088_67_0)).v = ((double)((((net.minecraft.entity.Entity)(__stackOp5088_67_0)).v * 0x1.e66666p-1d)));
    if (!((life4_5 == 0))) {
        break forward_join_389;
    }
    }
    spill5088_19 = ((net.minecraft.entity.item.EntityMinecart)(p0));
    if (!((life4_5 != 0))) {
        forwardValue5088_381_0 = spill5088_19;
        break forward_join_381;
    }
    forwardValue5088_295_0 = ((net.minecraft.entity.item.EntityMinecart)(spill5088_19)).a__aT();
    forwardValue5088_295_1 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.FURNACE;
    }
    if (!((forwardValue5088_295_0 != forwardValue5088_295_1))) {
        break forward_join_339;
    }
    spill5088_20 = this;
    if (!((life4_5 != 0))) {
        forwardValue5088_381_0 = spill5088_20;
        break forward_join_381;
    }
    if (!((((net.minecraft.entity.item.EntityMinecart)(spill5088_20)).a__aT() == net.minecraft.entity.item.EntityMinecart$EnumMinecartType.FURNACE))) {
        break forward_join_339;
    }
    net.minecraft.entity.Entity __stackOp5088_75_0 = p0;
    ((net.minecraft.entity.Entity)(__stackOp5088_75_0)).t = ((double)((((net.minecraft.entity.Entity)(__stackOp5088_75_0)).t * 0x1.99999ap-3d)));
    net.minecraft.entity.Entity __stackOp5088_78_0 = p0;
    ((net.minecraft.entity.Entity)(__stackOp5088_78_0)).v = ((double)((((net.minecraft.entity.Entity)(__stackOp5088_78_0)).v * 0x1.99999ap-3d)));
    __sourceExactCall_3b7af93e05feea(((net.minecraft.entity.Entity)(p0)), ((double)((this.t + life5_146))), ((double)(0x0.0p0d)), ((double)((this.v + life7_152))));
    net.minecraft.entity.item.EntityMinecart __stackOp5088_84_0 = this;
    ((net.minecraft.entity.item.EntityMinecart)(__stackOp5088_84_0)).t = ((double)((((net.minecraft.entity.item.EntityMinecart)(__stackOp5088_84_0)).t * 0x1.e66666p-1d)));
    net.minecraft.entity.item.EntityMinecart __stackOp5088_87_0 = this;
    ((net.minecraft.entity.item.EntityMinecart)(__stackOp5088_87_0)).v = ((double)((((net.minecraft.entity.item.EntityMinecart)(__stackOp5088_87_0)).v * 0x1.e66666p-1d)));
    if (!((life4_5 == 0))) {
        break forward_join_389;
    }
    }
    life21_309 = (life21_309 / 0x1.0p1d);
    life23_315 = (life23_315 / 0x1.0p1d);
    net.minecraft.entity.item.EntityMinecart __stackOp5088_90_0 = this;
    ((net.minecraft.entity.item.EntityMinecart)(__stackOp5088_90_0)).t = ((double)((((net.minecraft.entity.item.EntityMinecart)(__stackOp5088_90_0)).t * 0x1.99999ap-3d)));
    net.minecraft.entity.item.EntityMinecart __stackOp5088_93_0 = this;
    ((net.minecraft.entity.item.EntityMinecart)(__stackOp5088_93_0)).v = ((double)((((net.minecraft.entity.item.EntityMinecart)(__stackOp5088_93_0)).v * 0x1.99999ap-3d)));
    __sourceExactCall_553676dacf21e2(((net.minecraft.entity.item.EntityMinecart)(this)), ((double)((life21_309 - life5_146))), ((double)(0x0.0p0d)), ((double)((life23_315 - life7_152))));
    net.minecraft.entity.Entity __stackOp5088_97_0 = p0;
    ((net.minecraft.entity.Entity)(__stackOp5088_97_0)).t = ((double)((((net.minecraft.entity.Entity)(__stackOp5088_97_0)).t * 0x1.99999ap-3d)));
    net.minecraft.entity.Entity __stackOp5088_100_0 = p0;
    ((net.minecraft.entity.Entity)(__stackOp5088_100_0)).v = ((double)((((net.minecraft.entity.Entity)(__stackOp5088_100_0)).v * 0x1.99999ap-3d)));
    forwardValue5088_381_0 = p0;
    }
    __sourceExactCall_3b7af93e05feea(((net.minecraft.entity.Entity)(forwardValue5088_381_0)), ((double)((life21_309 + life5_146))), ((double)(0x0.0p0d)), ((double)((life23_315 + life7_152))));
    }
    if (!((life4_5 == 0))) {
        break forward_join_407;
    }
    }
    __sourceExactCall_553676dacf21e2(((net.minecraft.entity.item.EntityMinecart)(this)), ((double)((-life5_146))), ((double)(0x0.0p0d)), ((double)((-life7_152))));
    forwardValue5088_399_0 = p0;
    }
    __sourceExactCall_3b7af93e05feea(((net.minecraft.entity.Entity)(forwardValue5088_399_0)), ((double)((life5_146 / 0x1.0p2d))), ((double)(0x0.0p0d)), ((double)((life7_152 / 0x1.0p2d))));
    }
    return;
}


protected void a(moom.DT p0, net.minecraft.block.state.IBlockState p1) {
int forestValue663_47_0;
    int forestValue663_49_0;
    double forestValue663_194_0;
    double forestValue663_194_1;
    int forestValue663_222_0;
    int forestValue663_295_0;
    int forestValue663_450_0;
    double forestValue663_470_0;
    double forestValue663_470_1;
    net.minecraft.entity.item.EntityMinecart forestValue663_529_0;
    int forestValue663_606_0;
    int forestValue663_617_0;
    net.minecraft.entity.item.EntityMinecart forestValue663_655_0;
    moom.DR forestValue663_668_0;
    moom.DR forestValue663_672_0;
    net.minecraft.entity.item.EntityMinecart forestValue663_719_0;
    int forestValue663_778_0;
    double forestValue663_799_0;
    int forestValue663_853_0;
    net.minecraft.entity.item.EntityMinecart forestValue663_855_0;
    net.minecraft.block.BlockRailBase$EnumRailDirection forestValue663_861_0;
    net.minecraft.block.BlockRailBase$EnumRailDirection forestValue663_861_1;
    int forestValue663_886_0;
    net.minecraft.entity.item.EntityMinecart forestValue663_888_0;
    int spill663_0;
    int spill663_1;
    double spill663_2;
    double spill663_3;
    int spill663_4;
    int spill663_5;
    int spill663_6;
    int spill663_7;
    double spill663_8;
    double spill663_9;
    net.minecraft.entity.item.EntityMinecart spill663_10;
    int spill663_11;
    int spill663_12;
    int spill663_13;
    net.minecraft.entity.item.EntityMinecart spill663_14;
    net.minecraft.entity.item.EntityMinecart spill663_15;
    moom.DR spill663_16;
    net.minecraft.entity.item.EntityMinecart spill663_17;
    int spill663_18;
    double spill663_19;
    net.minecraft.block.BlockRailBase$EnumRailDirection spill663_20;
    net.minecraft.block.BlockRailBase$EnumRailDirection spill663_21;
    boolean spill663_22;
    net.minecraft.entity.item.EntityMinecart spill663_23;
    boolean spill663_24;
    net.minecraft.entity.item.EntityMinecart spill663_25;
    long life3_3;
    moom.DR life6_15;
    int life7_23;
    int life8_25;
    int life5_26;
    moom.d2 life9_30;
    double life10_53;
    net.minecraft.block.BlockRailBase$EnumRailDirection life12_59;
    int[][] life13_132;
    double life14_145;
    double life16_158;
    double life18_167;
    double life20_177;
    double life22_203;
    double life24_239;
    double life26_257;
    double life28_267;
    double life30_279;
    double life24_319;
    double life24_368;
    double life26_383;
    double life28_398;
    double life30_413;
    double life32_428;
    double life14_432;
    double life16_436;
    double life24_457;
    double life34_489;
    double life36_494;
    double life34_529;
    double life36_532;
    double life38_549;
    double life34_555;
    double life36_561;
    moom.DR life40_694;
    double life41_712;
    int life41_764;
    int life42_768;
    double life43_829;
    double life45_839;
    forest_join_890: {
    forest_join_888: {
    forest_join_886: {
    forest_join_877: {
    forest_join_861: {
    forest_join_859: {
    forest_join_855: {
    forest_join_853: {
    forest_join_844: {
    forest_join_824: {
    forest_join_799: {
    forest_join_778: {
    forest_join_777: {
    forest_join_768: {
    forest_join_746: {
    forest_join_726: {
    forest_join_719: {
    forest_join_718: {
    forest_join_672: {
    forest_join_668: {
    forest_join_655: {
    forest_join_652: {
    forest_join_617: {
    forest_join_606: {
    forest_join_601: {
    forest_join_529: {
    forest_join_528: {
    forest_join_487: {
    forest_join_470: {
    forest_join_467: {
    forest_join_450: {
    forest_join_445: {
    forest_join_353: {
    forest_join_347: {
    forest_join_335: {
    forest_join_295: {
    forest_join_294: {
    forest_join_222: {
    forest_join_205: {
    forest_join_194: {
    forest_join_184: {
    forest_join_122: {
    forest_join_110: {
    forest_join_96: {
    forest_join_82: {
    forest_join_77: {
    forest_join_65: {
    forest_join_50: {
    forest_join_49: {
    forest_join_48: {
    forest_join_47: {
    forest_join_42: {
    life3_3 = (net.minecraft.entity.item.EntityMinecart.cb ^ 86076761944225L);
    this.L = ((float)(0x0.0p0f));
    life6_15 = ((net.minecraft.entity.item.EntityMinecart)(this)).a__sourceReturn_ec3967a824(((double)(this.n)), ((double)(this.o)), ((double)(this.p)));
    this.o = ((double)(((double) ((moom.DT)(p0)).b())));
    spill663_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    life7_23 = 0;
    life8_25 = 0;
    life5_26 = spill663_0;
    life9_30 = ((moom.d2)(((net.minecraft.block.state.IBlockState)(p1)).a__ch()));
    if (!((life5_26 == 0))) {
        break forest_join_42;
    }
    if (!((life9_30 == net.minecraft.init.Blocks.D))) {
        break forest_join_50;
    }
    life7_23 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p1)).a(((net.minecraft.block.properties.IProperty)(moom.d5.S))))))).booleanValue()) ? 1 : 0);
    }
    spill663_1 = life7_23;
    if (!((life5_26 == 0))) {
        forestValue663_47_0 = spill663_1;
        break forest_join_47;
    }
    if (!((spill663_1 == 0))) {
        break forest_join_48;
    }
    forestValue663_47_0 = 1;
    }
    forestValue663_49_0 = forestValue663_47_0;
    break forest_join_49;
    }
    forestValue663_49_0 = 0;
    }
    life8_25 = forestValue663_49_0;
    }
    life10_53 = 0x1.0p-7d;
    life12_59 = ((net.minecraft.block.BlockRailBase$EnumRailDirection)(((net.minecraft.block.state.IBlockState)(p1)).a(((net.minecraft.block.properties.IProperty)(((moom.d2)(life9_30)).a__ft())))));
    if (!((life5_26 == 0))) {
        break forest_join_77;
    }
    switch ((moom.vL.b)[((net.minecraft.block.BlockRailBase$EnumRailDirection)(life12_59)).ordinal()]) {
case 1:
{
        break forest_join_65;
    }
case 2:
{
        break forest_join_82;
    }
case 3:
{
        break forest_join_96;
    }
case 4:
{
        break forest_join_110;
    }
default:
{
        break forest_join_122;
    }
}
    }
    net.minecraft.entity.item.EntityMinecart __stackOp663_22_0 = this;
    ((net.minecraft.entity.item.EntityMinecart)(__stackOp663_22_0)).t = ((double)((((net.minecraft.entity.item.EntityMinecart)(__stackOp663_22_0)).t - 0x1.0p-7d)));
    net.minecraft.entity.item.EntityMinecart __stackOp663_25_0 = this;
    ((net.minecraft.entity.item.EntityMinecart)(__stackOp663_25_0)).o = ((double)((((net.minecraft.entity.item.EntityMinecart)(__stackOp663_25_0)).o + 0x1.0p0d)));
    }
    if (!((life5_26 != 0))) {
        break forest_join_122;
    }
    __sourceExactCall_6604345f74a40b(((java.lang.String[])(new java.lang.String[4])));
    }
    net.minecraft.entity.item.EntityMinecart __stackOp663_29_0 = this;
    ((net.minecraft.entity.item.EntityMinecart)(__stackOp663_29_0)).t = ((double)((((net.minecraft.entity.item.EntityMinecart)(__stackOp663_29_0)).t + 0x1.0p-7d)));
    net.minecraft.entity.item.EntityMinecart __stackOp663_32_0 = this;
    ((net.minecraft.entity.item.EntityMinecart)(__stackOp663_32_0)).o = ((double)((((net.minecraft.entity.item.EntityMinecart)(__stackOp663_32_0)).o + 0x1.0p0d)));
    if (!((life5_26 != 0))) {
        break forest_join_122;
    }
    }
    net.minecraft.entity.item.EntityMinecart __stackOp663_35_0 = this;
    ((net.minecraft.entity.item.EntityMinecart)(__stackOp663_35_0)).v = ((double)((((net.minecraft.entity.item.EntityMinecart)(__stackOp663_35_0)).v + 0x1.0p-7d)));
    net.minecraft.entity.item.EntityMinecart __stackOp663_38_0 = this;
    ((net.minecraft.entity.item.EntityMinecart)(__stackOp663_38_0)).o = ((double)((((net.minecraft.entity.item.EntityMinecart)(__stackOp663_38_0)).o + 0x1.0p0d)));
    if (!((life5_26 != 0))) {
        break forest_join_122;
    }
    }
    net.minecraft.entity.item.EntityMinecart __stackOp663_41_0 = this;
    ((net.minecraft.entity.item.EntityMinecart)(__stackOp663_41_0)).v = ((double)((((net.minecraft.entity.item.EntityMinecart)(__stackOp663_41_0)).v - 0x1.0p-7d)));
    net.minecraft.entity.item.EntityMinecart __stackOp663_44_0 = this;
    ((net.minecraft.entity.item.EntityMinecart)(__stackOp663_44_0)).o = ((double)((((net.minecraft.entity.item.EntityMinecart)(__stackOp663_44_0)).o + 0x1.0p0d)));
    }
    life13_132 = (net.minecraft.entity.item.EntityMinecart.aG)[((net.minecraft.block.BlockRailBase$EnumRailDirection)(life12_59)).a()];
    life14_145 = ((double) (((life13_132)[1])[0] - ((life13_132)[0])[0]));
    life16_158 = ((double) (((life13_132)[1])[2] - ((life13_132)[0])[2]));
    life18_167 = java.lang.Math.sqrt(((double)(((life14_145 * life14_145) + (life16_158 * life16_158)))));
    life20_177 = ((this.t * life14_145) + (this.v * life16_158));
    spill663_2 = life20_177;
    spill663_3 = 0x0.0p0d;
    if (!((life5_26 == 0))) {
        forestValue663_194_0 = spill663_2;
        forestValue663_194_1 = spill663_3;
        break forest_join_194;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(spill663_2)), ((double)(spill663_3))) < 0))) {
        break forest_join_184;
    }
    life14_145 = (-life14_145);
    life16_158 = (-life16_158);
    }
    forestValue663_194_0 = (this.t * this.t);
    forestValue663_194_1 = (this.v * this.v);
    }
    life22_203 = java.lang.Math.sqrt(((double)((forestValue663_194_0 + forestValue663_194_1))));
    spill663_4 = recovery.source.CarrierOps.dcmpl(((double)(life22_203)), ((double)(0x1.0p1d)));
    if (!((life5_26 == 0))) {
        forestValue663_222_0 = spill663_4;
        break forest_join_222;
    }
    if (!((spill663_4 > 0))) {
        break forest_join_205;
    }
    life22_203 = 0x1.0p1d;
    }
    this.t = ((double)(((life22_203 * life14_145) / life18_167)));
    this.v = ((double)(((life22_203 * life16_158) / life18_167)));
    forestValue663_222_0 = ((this.f instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0);
    }
    if (!((life5_26 == 0))) {
        forestValue663_295_0 = forestValue663_222_0;
        break forest_join_295;
    }
    if (!((forestValue663_222_0 != 0))) {
        break forest_join_294;
    }
    life24_239 = ((double) ((net.minecraft.entity.EntityLivingBase)(((net.minecraft.entity.EntityLivingBase)(this.f)))).bk);
    spill663_5 = recovery.source.CarrierOps.dcmpl(((double)(life24_239)), ((double)(0x0.0p0d)));
    if (!((life5_26 == 0))) {
        forestValue663_295_0 = spill663_5;
        break forest_join_295;
    }
    if (!((spill663_5 > 0))) {
        break forest_join_294;
    }
    life26_257 = (-java.lang.Math.sin(((double)(((double) ((((net.minecraft.entity.Entity)(this.f)).w * 0x1.921fb6p1f) / 0x1.68p7f))))));
    life28_267 = java.lang.Math.cos(((double)(((double) ((((net.minecraft.entity.Entity)(this.f)).w * 0x1.921fb6p1f) / 0x1.68p7f)))));
    life30_279 = ((this.t * this.t) + (this.v * this.v));
    spill663_6 = recovery.source.CarrierOps.dcmpg(((double)(life30_279)), ((double)(0x1.47ae147ae147bp-7d)));
    if (!((life5_26 == 0))) {
        forestValue663_295_0 = spill663_6;
        break forest_join_295;
    }
    if (!((spill663_6 < 0))) {
        break forest_join_294;
    }
    net.minecraft.entity.item.EntityMinecart __stackOp663_78_0 = this;
    ((net.minecraft.entity.item.EntityMinecart)(__stackOp663_78_0)).t = ((double)((((net.minecraft.entity.item.EntityMinecart)(__stackOp663_78_0)).t + (life26_257 * 0x1.999999999999ap-4d))));
    net.minecraft.entity.item.EntityMinecart __stackOp663_81_0 = this;
    ((net.minecraft.entity.item.EntityMinecart)(__stackOp663_81_0)).v = ((double)((((net.minecraft.entity.item.EntityMinecart)(__stackOp663_81_0)).v + (life28_267 * 0x1.999999999999ap-4d))));
    life8_25 = 0;
    }
    forestValue663_295_0 = life8_25;
    }
    if (!((forestValue663_295_0 != 0))) {
        break forest_join_353;
    }
    life24_319 = java.lang.Math.sqrt(((double)(((this.t * this.t) + (this.v * this.v)))));
    if (!((life5_26 == 0))) {
        break forest_join_347;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(life24_319)), ((double)(0x1.eb851eb851eb8p-6d))) < 0))) {
        break forest_join_335;
    }
    net.minecraft.entity.item.EntityMinecart __stackOp663_90_0 = this;
    ((net.minecraft.entity.item.EntityMinecart)(__stackOp663_90_0)).t = ((double)((((net.minecraft.entity.item.EntityMinecart)(__stackOp663_90_0)).t * 0x0.0p0d)));
    net.minecraft.entity.item.EntityMinecart __stackOp663_93_0 = this;
    ((net.minecraft.entity.item.EntityMinecart)(__stackOp663_93_0)).u = ((double)((((net.minecraft.entity.item.EntityMinecart)(__stackOp663_93_0)).u * 0x0.0p0d)));
    net.minecraft.entity.item.EntityMinecart __stackOp663_96_0 = this;
    ((net.minecraft.entity.item.EntityMinecart)(__stackOp663_96_0)).v = ((double)((((net.minecraft.entity.item.EntityMinecart)(__stackOp663_96_0)).v * 0x0.0p0d)));
    if (!((life5_26 != 0))) {
        break forest_join_353;
    }
    }
    net.minecraft.entity.item.EntityMinecart __stackOp663_99_0 = this;
    ((net.minecraft.entity.item.EntityMinecart)(__stackOp663_99_0)).t = ((double)((((net.minecraft.entity.item.EntityMinecart)(__stackOp663_99_0)).t * 0x1.0p-1d)));
    net.minecraft.entity.item.EntityMinecart __stackOp663_102_0 = this;
    ((net.minecraft.entity.item.EntityMinecart)(__stackOp663_102_0)).u = ((double)((((net.minecraft.entity.item.EntityMinecart)(__stackOp663_102_0)).u * 0x0.0p0d)));
    }
    net.minecraft.entity.item.EntityMinecart __stackOp663_105_0 = this;
    ((net.minecraft.entity.item.EntityMinecart)(__stackOp663_105_0)).v = ((double)((((net.minecraft.entity.item.EntityMinecart)(__stackOp663_105_0)).v * 0x1.0p-1d)));
    }
    life24_368 = 0x0.0p0d;
    life26_383 = ((((double) ((moom.DT)(p0)).a()) + 0x1.0p-1d) + (((double) ((life13_132)[0])[0]) * 0x1.0p-1d));
    life28_398 = ((((double) ((moom.DT)(p0)).c()) + 0x1.0p-1d) + (((double) ((life13_132)[0])[2]) * 0x1.0p-1d));
    life30_413 = ((((double) ((moom.DT)(p0)).a()) + 0x1.0p-1d) + (((double) ((life13_132)[1])[0]) * 0x1.0p-1d));
    life32_428 = ((((double) ((moom.DT)(p0)).c()) + 0x1.0p-1d) + (((double) ((life13_132)[1])[2]) * 0x1.0p-1d));
    life14_432 = (life30_413 - life26_383);
    life16_436 = (life32_428 - life28_398);
    spill663_7 = recovery.source.CarrierOps.dcmpl(((double)(life14_432)), ((double)(0x0.0p0d)));
    if (!((life5_26 == 0))) {
        forestValue663_450_0 = spill663_7;
        break forest_join_450;
    }
    if (!((spill663_7 == 0))) {
        break forest_join_445;
    }
    this.n = ((double)((((double) ((moom.DT)(p0)).a()) + 0x1.0p-1d)));
    life24_457 = (this.p - ((double) ((moom.DT)(p0)).c()));
    if (!((life5_26 != 0))) {
        break forest_join_487;
    }
    }
    spill663_8 = life16_436;
    spill663_9 = 0x0.0p0d;
    if (!((life5_26 == 0))) {
        forestValue663_470_0 = spill663_8;
        forestValue663_470_1 = spill663_9;
        break forest_join_470;
    }
    forestValue663_450_0 = recovery.source.CarrierOps.dcmpl(((double)(spill663_8)), ((double)(spill663_9)));
    }
    if (!((forestValue663_450_0 == 0))) {
        break forest_join_467;
    }
    this.p = ((double)((((double) ((moom.DT)(p0)).c()) + 0x1.0p-1d)));
    life24_457 = (this.n - ((double) ((moom.DT)(p0)).a()));
    if (!((life5_26 != 0))) {
        break forest_join_487;
    }
    }
    forestValue663_470_0 = this.n;
    forestValue663_470_1 = life26_383;
    }
    life34_489 = (forestValue663_470_0 - forestValue663_470_1);
    life36_494 = (this.p - life28_398);
    life24_457 = (((life34_489 * life14_432) + (life36_494 * life16_436)) * 0x1.0p1d);
    }
    this.n = ((double)((life26_383 + (life14_432 * life24_457))));
    this.p = ((double)((life28_398 + (life16_436 * life24_457))));
    ((net.minecraft.entity.item.EntityMinecart)(this)).a__Void(((double)(this.n)), ((double)(this.o)), ((double)(this.p)));
    life34_529 = this.t;
    life36_532 = this.v;
    spill663_10 = this;
    if (!((life5_26 == 0))) {
        forestValue663_529_0 = spill663_10;
        break forest_join_529;
    }
    if (!((((net.minecraft.entity.item.EntityMinecart)(spill663_10)).f != null))) {
        break forest_join_528;
    }
    life34_529 = (life34_529 * 0x1.8p-1d);
    life36_532 = (life36_532 * 0x1.8p-1d);
    }
    forestValue663_529_0 = this;
    }
    life38_549 = ((net.minecraft.entity.item.EntityMinecart)(forestValue663_529_0)).f__sourceReturn_fedcb3e4d3();
    life34_555 = moom.Dr.a(((double)(life34_529)), ((double)((-life38_549))), ((double)(life38_549)));
    life36_561 = moom.Dr.a(((double)(life36_532)), ((double)((-life38_549))), ((double)(life38_549)));
    ((net.minecraft.entity.item.EntityMinecart)(this)).b__Void(((double)(life34_555)), ((double)(0x0.0p0d)), ((double)(life36_561)));
    spill663_11 = ((life13_132)[0])[1];
    if (!((life5_26 == 0))) {
        forestValue663_606_0 = spill663_11;
        break forest_join_606;
    }
    if (!((spill663_11 != 0))) {
        break forest_join_601;
    }
    spill663_12 = (moom.Dr.b__Int(((double)(this.n))) - ((moom.DT)(p0)).a());
    if (!((life5_26 == 0))) {
        forestValue663_606_0 = spill663_12;
        break forest_join_606;
    }
    if (!((spill663_12 == ((life13_132)[0])[0]))) {
        break forest_join_601;
    }
    spill663_13 = (moom.Dr.b__Int(((double)(this.p))) - ((moom.DT)(p0)).c());
    if (!((life5_26 == 0))) {
        forestValue663_606_0 = spill663_13;
        break forest_join_606;
    }
    if (!((spill663_13 == ((life13_132)[0])[2]))) {
        break forest_join_601;
    }
    ((net.minecraft.entity.item.EntityMinecart)(this)).a__Void(((double)(this.n)), ((double)((this.o + ((double) ((life13_132)[0])[1])))), ((double)(this.p)));
    if (!((life5_26 != 0))) {
        break forest_join_652;
    }
    }
    forestValue663_606_0 = ((life13_132)[1])[1];
    }
    if (!((life5_26 == 0))) {
        forestValue663_617_0 = forestValue663_606_0;
        break forest_join_617;
    }
    if (!((forestValue663_606_0 != 0))) {
        break forest_join_652;
    }
    spill663_14 = this;
    if (!((life5_26 == 0))) {
        forestValue663_655_0 = spill663_14;
        break forest_join_655;
    }
    forestValue663_617_0 = (moom.Dr.b__Int(((double)(((net.minecraft.entity.item.EntityMinecart)(spill663_14)).n))) - ((moom.DT)(p0)).a());
    }
    if (!((forestValue663_617_0 == ((life13_132)[1])[0]))) {
        break forest_join_652;
    }
    spill663_15 = this;
    if (!((life5_26 == 0))) {
        forestValue663_655_0 = spill663_15;
        break forest_join_655;
    }
    if (!(((moom.Dr.b__Int(((double)(((net.minecraft.entity.item.EntityMinecart)(spill663_15)).p))) - ((moom.DT)(p0)).c()) == ((life13_132)[1])[2]))) {
        break forest_join_652;
    }
    ((net.minecraft.entity.item.EntityMinecart)(this)).a__Void(((double)(this.n)), ((double)((this.o + ((double) ((life13_132)[1])[1])))), ((double)(this.p)));
    }
    ((net.minecraft.entity.item.EntityMinecart)(this)).x();
    forestValue663_655_0 = this;
    }
    life40_694 = ((net.minecraft.entity.item.EntityMinecart)(forestValue663_655_0)).a__sourceReturn_ec3967a824(((double)(this.n)), ((double)(this.o)), ((double)(this.p)));
    spill663_16 = life40_694;
    if (!((life5_26 == 0))) {
        forestValue663_668_0 = spill663_16;
        break forest_join_668;
    }
    if (!((spill663_16 != null))) {
        break forest_join_726;
    }
    forestValue663_668_0 = life6_15;
    }
    if (!((life5_26 == 0))) {
        forestValue663_672_0 = forestValue663_668_0;
        break forest_join_672;
    }
    if (!((forestValue663_668_0 != null))) {
        break forest_join_726;
    }
    forestValue663_672_0 = life6_15;
    }
    life41_712 = ((((moom.DR)(forestValue663_672_0)).b - ((moom.DR)(life40_694)).b) * 0x1.999999999999ap-5d);
    spill663_17 = this;
    if (!((life5_26 == 0))) {
        forestValue663_719_0 = spill663_17;
        break forest_join_719;
    }
    life22_203 = java.lang.Math.sqrt(((double)(((((net.minecraft.entity.item.EntityMinecart)(spill663_17)).t * this.t) + (this.v * this.v)))));
    if (!((recovery.source.CarrierOps.dcmpl(((double)(life22_203)), ((double)(0x0.0p0d))) > 0))) {
        break forest_join_718;
    }
    this.t = ((double)(((this.t / life22_203) * (life22_203 + life41_712))));
    this.v = ((double)(((this.v / life22_203) * (life22_203 + life41_712))));
    }
    forestValue663_719_0 = this;
    }
    ((net.minecraft.entity.item.EntityMinecart)(forestValue663_719_0)).a__Void(((double)(this.n)), ((double)(((moom.DR)(life40_694)).b)), ((double)(this.p)));
    }
    life41_764 = moom.Dr.b__Int(((double)(this.n)));
    life42_768 = moom.Dr.b__Int(((double)(this.p)));
    if (!((life5_26 == 0))) {
        break forest_join_768;
    }
    if (!((life41_764 == ((moom.DT)(p0)).a()))) {
        break forest_join_746;
    }
    spill663_18 = life42_768;
    if (!((life5_26 == 0))) {
        forestValue663_778_0 = spill663_18;
        break forest_join_778;
    }
    if (!((spill663_18 != ((moom.DT)(p0)).c()))) {
        break forest_join_777;
    }
    }
    life22_203 = java.lang.Math.sqrt(((double)(((this.t * this.t) + (this.v * this.v)))));
    this.t = ((double)((life22_203 * ((double) (life41_764 - ((moom.DT)(p0)).a())))));
    }
    this.v = ((double)((life22_203 * ((double) (life42_768 - ((moom.DT)(p0)).c())))));
    }
    forestValue663_778_0 = life7_23;
    }
    if (!((forestValue663_778_0 != 0))) {
        break forest_join_890;
    }
    life43_829 = java.lang.Math.sqrt(((double)(((this.t * this.t) + (this.v * this.v)))));
    spill663_19 = life43_829;
    if (!((life5_26 == 0))) {
        forestValue663_799_0 = spill663_19;
        break forest_join_799;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill663_19)), ((double)(0x1.47ae147ae147bp-7d))) > 0))) {
        break forest_join_824;
    }
    forestValue663_799_0 = 0x1.eb851eb851eb8p-5d;
    }
    life45_839 = forestValue663_799_0;
    net.minecraft.entity.item.EntityMinecart __stackOp663_199_0 = this;
    ((net.minecraft.entity.item.EntityMinecart)(__stackOp663_199_0)).t = ((double)((((net.minecraft.entity.item.EntityMinecart)(__stackOp663_199_0)).t + ((this.t / life43_829) * life45_839))));
    net.minecraft.entity.item.EntityMinecart __stackOp663_203_0 = this;
    ((net.minecraft.entity.item.EntityMinecart)(__stackOp663_203_0)).v = ((double)((((net.minecraft.entity.item.EntityMinecart)(__stackOp663_203_0)).v + ((this.v / life43_829) * life45_839))));
    if (!((life5_26 != 0))) {
        break forest_join_890;
    }
    }
    spill663_20 = life12_59;
    spill663_21 = net.minecraft.block.BlockRailBase$EnumRailDirection.EAST_WEST;
    if (!((life5_26 == 0))) {
        forestValue663_861_0 = spill663_20;
        forestValue663_861_1 = spill663_21;
        break forest_join_861;
    }
    if (!((spill663_20 == spill663_21))) {
        break forest_join_859;
    }
    spill663_22 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.i)).a__fE(((moom.DT)(((moom.DT)(p0)).e()))))).a__ch())).e__Boolean();
    if (!((life5_26 == 0))) {
        forestValue663_853_0 = ((spill663_22) ? 1 : 0);
        break forest_join_853;
    }
    if (!(spill663_22)) {
        break forest_join_844;
    }
    this.t = ((double)(0x1.47ae147ae147bp-6d));
    if (!((life5_26 != 0))) {
        break forest_join_890;
    }
    }
    spill663_23 = this;
    if (!((life5_26 == 0))) {
        forestValue663_855_0 = spill663_23;
        break forest_join_855;
    }
    forestValue663_853_0 = ((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(((net.minecraft.entity.item.EntityMinecart)(spill663_23)).i)).a__fE(((moom.DT)(((moom.DT)(p0)).f()))))).a__ch())).e__Boolean()) ? 1 : 0);
    }
    if (!((forestValue663_853_0 != 0))) {
        break forest_join_890;
    }
    forestValue663_855_0 = this;
    }
    ((net.minecraft.entity.item.EntityMinecart)(forestValue663_855_0)).t = ((double)(-0x1.47ae147ae147bp-6d));
    if (!((life5_26 != 0))) {
        break forest_join_890;
    }
    }
    forestValue663_861_0 = life12_59;
    forestValue663_861_1 = net.minecraft.block.BlockRailBase$EnumRailDirection.NORTH_SOUTH;
    }
    if (!((forestValue663_861_0 == forestValue663_861_1))) {
        break forest_join_890;
    }
    spill663_24 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.i)).a__fE(((moom.DT)(((moom.DT)(p0)).c__DT()))))).a__ch())).e__Boolean();
    if (!((life5_26 == 0))) {
        forestValue663_886_0 = ((spill663_24) ? 1 : 0);
        break forest_join_886;
    }
    if (!(spill663_24)) {
        break forest_join_877;
    }
    this.v = ((double)(0x1.47ae147ae147bp-6d));
    if (!((life5_26 != 0))) {
        break forest_join_890;
    }
    }
    spill663_25 = this;
    if (!((life5_26 == 0))) {
        forestValue663_888_0 = spill663_25;
        break forest_join_888;
    }
    forestValue663_886_0 = ((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(((net.minecraft.entity.item.EntityMinecart)(spill663_25)).i)).a__fE(((moom.DT)(((moom.DT)(p0)).d__DT()))))).a__ch())).e__Boolean()) ? 1 : 0);
    }
    if (!((forestValue663_886_0 != 0))) {
        break forest_join_890;
    }
    forestValue663_888_0 = this;
    }
    ((net.minecraft.entity.item.EntityMinecart)(forestValue663_888_0)).v = ((double)(-0x1.47ae147ae147bp-6d));
    }
    return;
}


public boolean m__Boolean() {
int forwardValue5095_12_0;
    int forwardValue5095_14_0;
    boolean spill5095_0;
    long life1_3;
    int life3_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (net.minecraft.entity.item.EntityMinecart.cb ^ 121704471222130L);
    life3_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    spill5095_0 = this.F;
    if (!((life3_5 == 0))) {
        forwardValue5095_12_0 = ((spill5095_0) ? 1 : 0);
        break forward_join_12;
    }
    if (!((!spill5095_0))) {
        break forward_join_13;
    }
    forwardValue5095_12_0 = 1;
    }
    forwardValue5095_14_0 = forwardValue5095_12_0;
    break forward_join_14;
    }
    forwardValue5095_14_0 = 0;
    }
    return ((forwardValue5095_14_0) != 0);
}


public int m__sourceReturn_8abf5c6871() {
long local1 = (net.minecraft.entity.item.EntityMinecart.cb ^ 30003636711422L);
    return __sourceIntrinsic_7fc77bc14dde_originalDynamicSite1923_1(9828, (126736642012195229L ^ local1));
}


public int k() {
long local1 = (net.minecraft.entity.item.EntityMinecart.cb ^ 38505339202788L);
    return ((net.minecraft.entity.DataWatcher)(this.al)).a__Int(((int)(__sourceIntrinsic_20cd551c5375_originalDynamicSite1924_2(4012, (349546418850825024L ^ local1)))));
}


public java.lang.String g__String() {
return this.aF;
}


protected boolean g__Boolean() {
return ((0) != 0);
}


public void g(int p0) {
long local2 = (net.minecraft.entity.item.EntityMinecart.cb ^ 58761678612672L);
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_a08a1913beb2_originalDynamicSite1925_2(1180, (4538896352128683097L ^ local2)))), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(p0))))));
    return;
}


public void g__Void() {
int forestValue1111_21_0;
    int forestValue1111_34_0;
    int forestValue1111_42_0;
    int forestValue1111_110_0;
    net.minecraft.entity.item.EntityMinecart forestValue1111_115_0;
    net.minecraft.entity.item.EntityMinecart forestValue1111_116_0;
    int forestValue1111_116_1;
    int forestValue1111_121_0;
    int forestValue1111_132_0;
    int forestValue1111_142_0;
    net.minecraft.entity.item.EntityMinecart forestValue1111_150_0;
    int forestValue1111_156_0;
    net.minecraft.entity.item.EntityMinecart forestValue1111_268_0;
    int forestValue1111_296_0;
    net.minecraft.block.state.IBlockState forestValue1111_342_0;
    net.minecraft.entity.item.EntityMinecart forestValue1111_410_0;
    double forestValue1111_416_0;
    net.minecraft.entity.item.EntityMinecart forestValue1111_440_0;
    int forestValue1111_440_1;
    net.minecraft.entity.item.EntityMinecart forestValue1111_441_0;
    net.minecraft.entity.item.EntityMinecart forestValue1111_442_0;
    int forestValue1111_442_1;
    net.minecraft.entity.Entity forestValue1111_477_0;
    int forestValue1111_485_0;
    net.minecraft.entity.Entity forestValue1111_487_0;
    net.minecraft.entity.Entity forestValue1111_508_0;
    net.minecraft.entity.item.EntityMinecart forestValue1111_508_1;
    net.minecraft.entity.item.EntityMinecart forestValue1111_514_0;
    net.minecraft.entity.item.EntityMinecart forestValue1111_517_0;
    int forestValue1111_518_0;
    int spill1111_0;
    int spill1111_1;
    boolean spill1111_2;
    boolean spill1111_3;
    net.minecraft.entity.item.EntityMinecart spill1111_4;
    net.minecraft.entity.item.EntityMinecart spill1111_5;
    int spill1111_6;
    int spill1111_7;
    int spill1111_8;
    net.minecraft.entity.item.EntityMinecart spill1111_9;
    net.minecraft.entity.item.EntityMinecart spill1111_10;
    net.minecraft.block.state.IBlockState spill1111_11;
    double spill1111_12;
    net.minecraft.entity.item.EntityMinecart spill1111_13;
    net.minecraft.entity.item.EntityMinecart spill1111_14;
    boolean spill1111_15;
    net.minecraft.entity.Entity spill1111_16;
    net.minecraft.entity.item.EntityMinecart spill1111_17;
    boolean spill1111_18;
    net.minecraft.entity.Entity spill1111_19;
    net.minecraft.entity.item.EntityMinecart spill1111_20;
    boolean spill1111_21;
    net.minecraft.entity.item.EntityMinecart spill1111_22;
    long life1_3;
    int life3_5;
    moom.Bl life4_69;
    int life5_72;
    int life6_124;
    double life4_205;
    double life6_218;
    double life8_231;
    double life10_239;
    int life4_327;
    int life5_331;
    int life6_335;
    moom.DT life7_356;
    net.minecraft.block.state.IBlockState life8_361;
    double life9_406;
    double life11_412;
    double life13_457;
    java.util.Iterator life15_505;
    net.minecraft.entity.Entity life16_512;
    forest_join_519: {
    forest_join_518: {
    forest_join_517: {
    forest_join_516: {
    forest_join_514: {
    forest_join_513: {
    forest_join_508: {
    forest_join_491: {
    forest_join_443: {
    forest_join_442: {
    forest_join_441: {
    forest_join_440: {
    forest_join_433: {
    forest_join_427: {
    forest_join_416: {
    forest_join_410: {
    forest_join_409: {
    forest_join_364: {
    forest_join_359: {
    forest_join_357: {
    forest_join_342: {
    forest_join_318: {
    forest_join_296: {
    forest_join_275: {
    forest_join_268: {
    forest_join_259: {
    forest_join_156: {
    forest_join_153: {
    forest_join_150: {
    forest_join_149: {
    forest_join_142: {
    forest_join_138: {
    forest_join_132: {
    forest_join_130: {
    forest_join_121: {
    forest_join_119: {
    forest_join_116: {
    forest_join_115: {
    forest_join_114: {
    forest_join_111: {
    forest_join_110: {
    forest_join_109: {
    forest_join_42: {
    forest_join_39: {
    forest_join_34: {
    forest_join_30: {
    forest_join_21: {
    forest_join_17: {
    life1_3 = (net.minecraft.entity.item.EntityMinecart.cb ^ 100264844030230L);
    life3_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    spill1111_0 = ((net.minecraft.entity.item.EntityMinecart)(this)).j__sourceReturn_8abf5c6871();
    if (!((life3_5 != 0))) {
        forestValue1111_21_0 = spill1111_0;
        break forest_join_21;
    }
    if (!((spill1111_0 > 0))) {
        break forest_join_17;
    }
    ((net.minecraft.entity.item.EntityMinecart)(this)).g(((int)((((net.minecraft.entity.item.EntityMinecart)(this)).j__sourceReturn_8abf5c6871() - 1))));
    }
    forestValue1111_21_0 = recovery.source.CarrierOps.fcmpl(((float)(((net.minecraft.entity.item.EntityMinecart)(this)).a())), ((float)(0x0.0p0f)));
    }
    if (!((life3_5 != 0))) {
        forestValue1111_34_0 = forestValue1111_21_0;
        break forest_join_34;
    }
    if (!((forestValue1111_21_0 > 0))) {
        break forest_join_30;
    }
    ((net.minecraft.entity.item.EntityMinecart)(this)).c(((float)((((net.minecraft.entity.item.EntityMinecart)(this)).a() - 0x1.0p0f))));
    }
    forestValue1111_34_0 = recovery.source.CarrierOps.dcmpg(((double)(this.o)), ((double)(-0x1.0p6d)));
    }
    if (!((life3_5 != 0))) {
        forestValue1111_42_0 = forestValue1111_34_0;
        break forest_join_42;
    }
    if (!((forestValue1111_34_0 < 0))) {
        break forest_join_39;
    }
    ((net.minecraft.entity.item.EntityMinecart)(this)).k__Void();
    }
    forestValue1111_42_0 = ((((net.minecraft.world.World)(this.i)).G) ? 1 : 0);
    }
    if (!((life3_5 != 0))) {
        forestValue1111_156_0 = forestValue1111_42_0;
        break forest_join_156;
    }
    if (!((forestValue1111_42_0 == 0))) {
        break forest_join_153;
    }
    spill1111_1 = ((this.i instanceof net.minecraft.world.WorldServer) ? 1 : 0);
    if (!((life3_5 != 0))) {
        forestValue1111_156_0 = spill1111_1;
        break forest_join_156;
    }
    if (!((spill1111_1 != 0))) {
        break forest_join_153;
    }
    ((moom.A9)(((net.minecraft.world.World)(this.i)).D)).a__Void(((java.lang.String)("portal")));
    life4_69 = ((net.minecraft.world.WorldServer)(((net.minecraft.world.WorldServer)(this.i)))).a__sourceReturn_d935d0dee1();
    life5_72 = ((net.minecraft.entity.item.EntityMinecart)(this)).f();
    spill1111_2 = this.am;
    if (!((life3_5 != 0))) {
        forestValue1111_121_0 = ((spill1111_2) ? 1 : 0);
        break forest_join_121;
    }
    if (!(spill1111_2)) {
        break forest_join_119;
    }
    spill1111_3 = ((moom.Bl)(life4_69)).j__Boolean();
    if (!((life3_5 != 0))) {
        forestValue1111_142_0 = ((spill1111_3) ? 1 : 0);
        break forest_join_142;
    }
    if (!(spill1111_3)) {
        break forest_join_138;
    }
    spill1111_4 = this;
    if (!((life3_5 != 0))) {
        forestValue1111_115_0 = spill1111_4;
        break forest_join_115;
    }
    if (!((((net.minecraft.entity.item.EntityMinecart)(spill1111_4)).g == null))) {
        break forest_join_114;
    }
    net.minecraft.entity.item.EntityMinecart __stackOp1111_29_0 = this;
    spill1111_5 = __stackOp1111_29_0;
    spill1111_6 = ((net.minecraft.entity.item.EntityMinecart)(__stackOp1111_29_0)).an;
    if (!((life3_5 != 0))) {
        forestValue1111_116_0 = spill1111_5;
        forestValue1111_116_1 = spill1111_6;
        break forest_join_116;
    }
    net.minecraft.entity.item.EntityMinecart __stackOp1111_31_0 = spill1111_5;
    int __stackOp1111_31_1 = spill1111_6;
    spill1111_7 = __stackOp1111_31_1;
    ((net.minecraft.entity.item.EntityMinecart)(__stackOp1111_31_0)).an = ((int)((__stackOp1111_31_1 + 1)));
    if (!((spill1111_7 >= life5_72))) {
        break forest_join_114;
    }
    this.an = ((int)(life5_72));
    this.ae = ((int)(((net.minecraft.entity.item.EntityMinecart)(this)).g()));
    spill1111_8 = ((moom.EA)(((net.minecraft.world.World)(this.i)).v)).b();
    if (!((life3_5 != 0))) {
        forestValue1111_110_0 = spill1111_8;
        break forest_join_110;
    }
    if (!((spill1111_8 == -1))) {
        break forest_join_109;
    }
    life6_124 = 0;
    if (!((life3_5 == 0))) {
        break forest_join_111;
    }
    }
    forestValue1111_110_0 = -1;
    }
    life6_124 = forestValue1111_110_0;
    }
    ((net.minecraft.entity.item.EntityMinecart)(this)).e(((int)(life6_124)));
    }
    forestValue1111_115_0 = this;
    }
    forestValue1111_116_0 = forestValue1111_115_0;
    forestValue1111_116_1 = 0;
    }
    ((net.minecraft.entity.item.EntityMinecart)(forestValue1111_116_0)).am = ((boolean)__sourceIntrinsic_integerToBoolean((forestValue1111_116_1)));
    if (!((life3_5 == 0))) {
        break forest_join_138;
    }
    }
    forestValue1111_121_0 = this.an;
    }
    if (!((life3_5 != 0))) {
        forestValue1111_132_0 = forestValue1111_121_0;
        break forest_join_132;
    }
    if (!((forestValue1111_121_0 > 0))) {
        break forest_join_130;
    }
    net.minecraft.entity.item.EntityMinecart __stackOp1111_42_0 = this;
    ((net.minecraft.entity.item.EntityMinecart)(__stackOp1111_42_0)).an = ((int)((((net.minecraft.entity.item.EntityMinecart)(__stackOp1111_42_0)).an - 4)));
    }
    forestValue1111_132_0 = this.an;
    }
    if (!((life3_5 != 0))) {
        forestValue1111_142_0 = forestValue1111_132_0;
        break forest_join_142;
    }
    if (!((forestValue1111_132_0 < 0))) {
        break forest_join_138;
    }
    this.an = ((int)(0));
    }
    spill1111_9 = this;
    if (!((life3_5 != 0))) {
        forestValue1111_150_0 = spill1111_9;
        break forest_join_150;
    }
    forestValue1111_142_0 = ((net.minecraft.entity.item.EntityMinecart)(spill1111_9)).ae;
    }
    if (!((forestValue1111_142_0 > 0))) {
        break forest_join_149;
    }
    net.minecraft.entity.item.EntityMinecart __stackOp1111_48_0 = this;
    ((net.minecraft.entity.item.EntityMinecart)(__stackOp1111_48_0)).ae = ((int)((((net.minecraft.entity.item.EntityMinecart)(__stackOp1111_48_0)).ae - 1)));
    }
    forestValue1111_150_0 = this;
    }
    ((moom.A9)(((net.minecraft.world.World)(((net.minecraft.entity.item.EntityMinecart)(forestValue1111_150_0)).i)).D)).b();
    }
    forestValue1111_156_0 = ((((net.minecraft.world.World)(this.i)).G) ? 1 : 0);
    }
    if (!((life3_5 != 0))) {
        forestValue1111_296_0 = forestValue1111_156_0;
        break forest_join_296;
    }
    if (!((forestValue1111_156_0 != 0))) {
        break forest_join_275;
    }
    spill1111_10 = this;
    if (!((life3_5 != 0))) {
        forestValue1111_268_0 = spill1111_10;
        break forest_join_268;
    }
    if (!((((net.minecraft.entity.item.EntityMinecart)(spill1111_10)).aH > 0))) {
        break forest_join_259;
    }
    life4_205 = (this.n + ((this.aI - this.n) / ((double) this.aH)));
    life6_218 = (this.o + ((this.aJ - this.o) / ((double) this.aH)));
    life8_231 = (this.p + ((this.aK - this.p) / ((double) this.aH)));
    life10_239 = moom.Dr.a(((double)((this.aL - ((double) this.w)))));
    this.w = ((float)(((float) (((double) this.w) + (life10_239 / ((double) this.aH))))));
    this.x = ((float)(((float) (((double) this.x) + ((this.aM - ((double) this.x)) / ((double) this.aH))))));
    net.minecraft.entity.item.EntityMinecart __stackOp1111_81_0 = this;
    ((net.minecraft.entity.item.EntityMinecart)(__stackOp1111_81_0)).aH = ((int)((((net.minecraft.entity.item.EntityMinecart)(__stackOp1111_81_0)).aH - 1)));
    ((net.minecraft.entity.item.EntityMinecart)(this)).a__Void(((double)(life4_205)), ((double)(life6_218)), ((double)(life8_231)));
    ((net.minecraft.entity.item.EntityMinecart)(this)).b(((float)(this.w)), ((float)(this.x)));
    if (!((life3_5 == 0))) {
        break forest_join_519;
    }
    }
    ((net.minecraft.entity.item.EntityMinecart)(this)).a__Void(((double)(this.n)), ((double)(this.o)), ((double)(this.p)));
    forestValue1111_268_0 = this;
    }
    ((net.minecraft.entity.item.EntityMinecart)(forestValue1111_268_0)).b(((float)(this.w)), ((float)(this.x)));
    if (!((life3_5 == 0))) {
        break forest_join_519;
    }
    }
    this.k = ((double)(this.n));
    this.l = ((double)(this.o));
    this.m = ((double)(this.p));
    net.minecraft.entity.item.EntityMinecart __stackOp1111_101_0 = this;
    ((net.minecraft.entity.item.EntityMinecart)(__stackOp1111_101_0)).u = ((double)((((net.minecraft.entity.item.EntityMinecart)(__stackOp1111_101_0)).u - 0x1.47ae14p-5d)));
    forestValue1111_296_0 = moom.Dr.b__Int(((double)(this.n)));
    }
    life4_327 = forestValue1111_296_0;
    life5_331 = moom.Dr.b__Int(((double)(this.o)));
    life6_335 = moom.Dr.b__Int(((double)(this.p)));
    if (!(moom.d2.c(((net.minecraft.world.World)(this.i)), ((moom.DT)(new moom.DT(life4_327, (life5_331 - 1), life6_335)))))) {
        break forest_join_318;
    }
    life5_331 += -1;
    }
    life7_356 = new moom.DT(life4_327, life5_331, life6_335);
    life8_361 = ((net.minecraft.world.World)(this.i)).a__fE(((moom.DT)(life7_356)));
    spill1111_11 = life8_361;
    if (!((life3_5 != 0))) {
        forestValue1111_342_0 = spill1111_11;
        break forest_join_342;
    }
    if (!(__sourceExactCall_2e6b3bd58a1006(((net.minecraft.block.state.IBlockState)(spill1111_11))))) {
        break forest_join_357;
    }
    ((net.minecraft.entity.item.EntityMinecart)(this)).a(((moom.DT)(life7_356)), ((net.minecraft.block.state.IBlockState)(life8_361)));
    if (!((life3_5 != 0))) {
        break forest_join_364;
    }
    forestValue1111_342_0 = life8_361;
    }
    if (!((((net.minecraft.block.state.IBlockState)(forestValue1111_342_0)).a__ch() == net.minecraft.init.Blocks.b7))) {
        break forest_join_359;
    }
    ((net.minecraft.entity.item.EntityMinecart)(this)).a(((int)(life4_327)), ((int)(life5_331)), ((int)(life6_335)), ((boolean)(((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(life8_361)).a(((net.minecraft.block.properties.IProperty)(moom.d5.S))))))).booleanValue())));
    if (!((life3_5 == 0))) {
        break forest_join_359;
    }
    }
    ((net.minecraft.entity.item.EntityMinecart)(this)).w__sourceReturn_da8c82d5d4();
    }
    ((net.minecraft.entity.item.EntityMinecart)(this)).m();
    this.x = ((float)(0x0.0p0f));
    }
    life9_406 = (this.k - this.n);
    life11_412 = (this.m - this.p);
    spill1111_12 = ((life9_406 * life9_406) + (life11_412 * life11_412));
    if (!((life3_5 != 0))) {
        forestValue1111_416_0 = spill1111_12;
        break forest_join_416;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill1111_12)), ((double)(0x1.0624dd2f1a9fcp-10d))) > 0))) {
        break forest_join_409;
    }
    this.w = ((float)(((float) ((moom.Dr.b(((double)(life11_412)), ((double)(life9_406))) * 0x1.68p7d) / 0x1.921fb54442d18p1d))));
    spill1111_13 = this;
    if (!((life3_5 != 0))) {
        forestValue1111_410_0 = spill1111_13;
        break forest_join_410;
    }
    if (!(((net.minecraft.entity.item.EntityMinecart)(spill1111_13)).aE)) {
        break forest_join_409;
    }
    net.minecraft.entity.item.EntityMinecart __stackOp1111_134_0 = this;
    ((net.minecraft.entity.item.EntityMinecart)(__stackOp1111_134_0)).w = ((float)((((net.minecraft.entity.item.EntityMinecart)(__stackOp1111_134_0)).w + 0x1.68p7f)));
    }
    forestValue1111_410_0 = this;
    }
    forestValue1111_416_0 = ((double) moom.Dr.e(((float)((((net.minecraft.entity.item.EntityMinecart)(forestValue1111_410_0)).w - this.y)))));
    }
    life13_457 = forestValue1111_416_0;
    if (!((life3_5 != 0))) {
        break forest_join_433;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(life13_457)), ((double)(-0x1.54p7d))) >= 0))) {
        break forest_join_427;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(life13_457)), ((double)(0x1.54p7d))) >= 0))) {
        break forest_join_443;
    }
    }
    net.minecraft.entity.item.EntityMinecart __stackOp1111_142_0 = this;
    ((net.minecraft.entity.item.EntityMinecart)(__stackOp1111_142_0)).w = ((float)((((net.minecraft.entity.item.EntityMinecart)(__stackOp1111_142_0)).w + 0x1.68p7f)));
    }
    spill1111_14 = this;
    spill1111_15 = this.aE;
    if (!((life3_5 != 0))) {
        forestValue1111_440_0 = spill1111_14;
        forestValue1111_440_1 = ((spill1111_15) ? 1 : 0);
        break forest_join_440;
    }
    if (!((!spill1111_15))) {
        forestValue1111_441_0 = spill1111_14;
        break forest_join_441;
    }
    forestValue1111_440_0 = spill1111_14;
    forestValue1111_440_1 = 1;
    }
    forestValue1111_442_0 = forestValue1111_440_0;
    forestValue1111_442_1 = forestValue1111_440_1;
    break forest_join_442;
    }
    forestValue1111_442_0 = forestValue1111_441_0;
    forestValue1111_442_1 = 0;
    }
    ((net.minecraft.entity.item.EntityMinecart)(forestValue1111_442_0)).aE = ((boolean)__sourceIntrinsic_integerToBoolean((forestValue1111_442_1)));
    }
    ((net.minecraft.entity.item.EntityMinecart)(this)).b(((float)(this.w)), ((float)(this.x)));
    life15_505 = ((java.util.List)(((net.minecraft.world.World)(this.i)).b(((net.minecraft.entity.Entity)(this)), ((moom.CA)(((moom.CA)(((net.minecraft.entity.item.EntityMinecart)(this)).b())).b(((double)(0x1.99999ap-3d)), ((double)(0x0.0p0d)), ((double)(0x1.99999ap-3d)))))))).iterator();
    forest_cycle_461: while (true) {
    forest_join_489: {
    forest_join_487: {
    forest_join_485: {
    forest_join_477: {
    if (!(((java.util.Iterator)(life15_505)).hasNext())) {
        break forest_join_491;
    }
    life16_512 = ((net.minecraft.entity.Entity)(((java.util.Iterator)(life15_505)).next()));
    spill1111_16 = life16_512;
    if (!((life3_5 != 0))) {
        forestValue1111_477_0 = spill1111_16;
        break forest_join_477;
    }
    spill1111_17 = this;
    if (!((life3_5 != 0))) {
        forestValue1111_508_0 = spill1111_16;
        forestValue1111_508_1 = spill1111_17;
        break forest_join_508;
    }
    if (!((spill1111_16 != ((net.minecraft.entity.item.EntityMinecart)(spill1111_17)).f))) {
        break forest_join_489;
    }
    forestValue1111_477_0 = life16_512;
    }
    spill1111_18 = ((net.minecraft.entity.Entity)(forestValue1111_477_0)).n__Boolean();
    if (!((life3_5 != 0))) {
        forestValue1111_485_0 = ((spill1111_18) ? 1 : 0);
        break forest_join_485;
    }
    if (!(spill1111_18)) {
        break forest_join_489;
    }
    spill1111_19 = life16_512;
    if (!((life3_5 != 0))) {
        forestValue1111_487_0 = spill1111_19;
        break forest_join_487;
    }
    forestValue1111_485_0 = ((spill1111_19 instanceof net.minecraft.entity.item.EntityMinecart) ? 1 : 0);
    }
    if (!((forestValue1111_485_0 != 0))) {
        break forest_join_489;
    }
    forestValue1111_487_0 = life16_512;
    }
    ((net.minecraft.entity.Entity)(forestValue1111_487_0)).a__Void(((net.minecraft.entity.Entity)(this)));
    }
    if (!((life3_5 == 0))) {
        continue forest_cycle_461;
    }
    break forest_cycle_461;
    }
    }
    spill1111_20 = this;
    if (!((life3_5 != 0))) {
        forestValue1111_517_0 = spill1111_20;
        break forest_join_517;
    }
    if (!((((net.minecraft.entity.item.EntityMinecart)(spill1111_20)).f != null))) {
        break forest_join_516;
    }
    spill1111_21 = ((net.minecraft.entity.Entity)(this.f)).F;
    if (!((life3_5 != 0))) {
        forestValue1111_518_0 = ((spill1111_21) ? 1 : 0);
        break forest_join_518;
    }
    if (!(spill1111_21)) {
        break forest_join_516;
    }
    spill1111_22 = this;
    if (!((life3_5 != 0))) {
        forestValue1111_514_0 = spill1111_22;
        break forest_join_514;
    }
    forestValue1111_508_0 = ((net.minecraft.entity.Entity)(((net.minecraft.entity.item.EntityMinecart)(spill1111_22)).f)).g;
    forestValue1111_508_1 = this;
    }
    if (!((forestValue1111_508_0 == forestValue1111_508_1))) {
        break forest_join_513;
    }
    ((net.minecraft.entity.Entity)(this.f)).g = ((net.minecraft.entity.Entity)(null));
    }
    forestValue1111_514_0 = this;
    }
    ((net.minecraft.entity.item.EntityMinecart)(forestValue1111_514_0)).f = ((net.minecraft.entity.Entity)(null));
    }
    forestValue1111_517_0 = this;
    }
    forestValue1111_518_0 = ((((net.minecraft.entity.item.EntityMinecart)(forestValue1111_517_0)).k__Boolean()) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue1111_518_0);
    }
    return;
}


public int j__sourceReturn_8abf5c6871() {
long local1 = (net.minecraft.entity.item.EntityMinecart.cb ^ 77112340470651L);
    return ((net.minecraft.entity.DataWatcher)(this.al)).a__Int(((int)(__sourceIntrinsic_0561e929bc0d_originalDynamicSite1926_2(1384, (6860986183327546905L ^ local1)))));
}


protected void w__sourceReturn_da8c82d5d4() {
int forwardValue5096_60_0;
    net.minecraft.entity.item.EntityMinecart forwardValue5096_74_0;
    int spill5096_0;
    boolean spill5096_1;
    net.minecraft.entity.item.EntityMinecart spill5096_2;
    long life1_3;
    double life4_7;
    int life3_8;
    forward_join_79: {
    forward_join_74: {
    forward_join_60: {
    forward_join_48: {
    life1_3 = (net.minecraft.entity.item.EntityMinecart.cb ^ 136756777853652L);
    spill5096_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    life4_7 = ((net.minecraft.entity.item.EntityMinecart)(this)).f__sourceReturn_fedcb3e4d3();
    life3_8 = spill5096_0;
    this.t = ((double)(moom.Dr.a(((double)(this.t)), ((double)((-life4_7))), ((double)(life4_7)))));
    this.v = ((double)(moom.Dr.a(((double)(this.v)), ((double)((-life4_7))), ((double)(life4_7)))));
    spill5096_1 = this.A;
    if (!((life3_8 == 0))) {
        forwardValue5096_60_0 = ((spill5096_1) ? 1 : 0);
        break forward_join_60;
    }
    if (!(spill5096_1)) {
        break forward_join_48;
    }
    net.minecraft.entity.item.EntityMinecart __stackOp5096_11_0 = this;
    ((net.minecraft.entity.item.EntityMinecart)(__stackOp5096_11_0)).t = ((double)((((net.minecraft.entity.item.EntityMinecart)(__stackOp5096_11_0)).t * 0x1.0p-1d)));
    net.minecraft.entity.item.EntityMinecart __stackOp5096_14_0 = this;
    ((net.minecraft.entity.item.EntityMinecart)(__stackOp5096_14_0)).u = ((double)((((net.minecraft.entity.item.EntityMinecart)(__stackOp5096_14_0)).u * 0x1.0p-1d)));
    net.minecraft.entity.item.EntityMinecart __stackOp5096_17_0 = this;
    ((net.minecraft.entity.item.EntityMinecart)(__stackOp5096_17_0)).v = ((double)((((net.minecraft.entity.item.EntityMinecart)(__stackOp5096_17_0)).v * 0x1.0p-1d)));
    }
    ((net.minecraft.entity.item.EntityMinecart)(this)).b__Void(((double)(this.t)), ((double)(this.u)), ((double)(this.v)));
    spill5096_2 = this;
    if (!((life3_8 == 0))) {
        forwardValue5096_74_0 = spill5096_2;
        break forward_join_74;
    }
    forwardValue5096_60_0 = ((((net.minecraft.entity.item.EntityMinecart)(spill5096_2)).A) ? 1 : 0);
    }
    if (!((forwardValue5096_60_0 == 0))) {
        break forward_join_79;
    }
    net.minecraft.entity.item.EntityMinecart __stackOp5096_26_0 = this;
    ((net.minecraft.entity.item.EntityMinecart)(__stackOp5096_26_0)).t = ((double)((((net.minecraft.entity.item.EntityMinecart)(__stackOp5096_26_0)).t * 0x1.e66666p-1d)));
    net.minecraft.entity.item.EntityMinecart __stackOp5096_29_0 = this;
    ((net.minecraft.entity.item.EntityMinecart)(__stackOp5096_29_0)).u = ((double)((((net.minecraft.entity.item.EntityMinecart)(__stackOp5096_29_0)).u * 0x1.e66666p-1d)));
    forwardValue5096_74_0 = this;
    }
    net.minecraft.entity.item.EntityMinecart __stackOp5096_32_0 = forwardValue5096_74_0;
    ((net.minecraft.entity.item.EntityMinecart)(__stackOp5096_32_0)).v = ((double)((((net.minecraft.entity.item.EntityMinecart)(__stackOp5096_32_0)).v * 0x1.e66666p-1d)));
    }
    return;
}


public void u() {
long local1 = (net.minecraft.entity.item.EntityMinecart.cb ^ 48524983529922L);
    ((net.minecraft.entity.item.EntityMinecart)(this)).h(((int)((-((net.minecraft.entity.item.EntityMinecart)(this)).k()))));
    ((net.minecraft.entity.item.EntityMinecart)(this)).g(((int)(__sourceIntrinsic_712129a63d20_originalDynamicSite1927_3(29344, (1256184878537548667L ^ local1)))));
    ((net.minecraft.entity.item.EntityMinecart)(this)).c(((float)((((net.minecraft.entity.item.EntityMinecart)(this)).a() + (((net.minecraft.entity.item.EntityMinecart)(this)).a() * 0x1.4p3f)))));
    return;
}


public boolean G() {
int forwardValue5080_19_0;
    int forwardValue5080_21_0;
    byte spill5080_0;
    long life1_3;
    int life3_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    life1_3 = (net.minecraft.entity.item.EntityMinecart.cb ^ 20659352162926L);
    life3_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    spill5080_0 = ((net.minecraft.entity.DataWatcher)(((net.minecraft.entity.item.EntityMinecart)(this)).a__r1())).a(((int)(__sourceIntrinsic_887793fc5041_invokedynamic5080_3(28942, (3688891679372641123L ^ life1_3)))));
    if (!((life3_5 != 0))) {
        forwardValue5080_19_0 = ((int)(spill5080_0));
        break forward_join_19;
    }
    if (!((spill5080_0 == 1))) {
        break forward_join_20;
    }
    forwardValue5080_19_0 = 1;
    }
    forwardValue5080_21_0 = forwardValue5080_19_0;
    break forward_join_21;
    }
    forwardValue5080_21_0 = 0;
    }
    return ((forwardValue5080_21_0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic560_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic560_91(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic560_101(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic560_111(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic560_121(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_887793fc5041_invokedynamic5080_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_76940a5779a0_originalDynamicSite1922_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a8577dc7acd3_originalDynamicSite1921_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_153a193fc182_invokedynamic5085_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_64ccfb84e285_call5087_4(net.minecraft.entity.item.EntityMinecart a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f4007626729c_invokedynamic5089_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral11377_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c0891f2beaed_originalDynamicSite1917_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic5090_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic5090_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1920_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1920_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1920_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1920_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1920_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1920_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1920_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a08a1913beb2_originalDynamicSite1925_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7f869f6dcdc2_originalDynamicSite1918_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8699ed5f13ef_invokedynamic5093_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4984c5be6222_originalDynamicSite1916_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0561e929bc0d_originalDynamicSite1926_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_20cd551c5375_originalDynamicSite1924_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d0e131a72963_invokedynamic5094_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7fc77bc14dde_originalDynamicSite1923_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_712129a63d20_originalDynamicSite1927_3(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceExactCall_3cb4b15ee08e2d(int p0, long p1);
private static native net.minecraft.block.Block __sourceExactCall_85597be21a945e(java.lang.String p0);
private static native net.minecraft.block.Block __sourceExactCall_c520ab7951a8e1(int p0);
private static native net.minecraft.block.state.IBlockState __sourceExactCall_03b2f00b6a6c46(int p0);
private static native int __sourceExactCall_042b2eb2353c3d(net.minecraft.block.state.IBlockState p0);
private static native boolean __sourceExactCall_2e6b3bd58a1006(net.minecraft.block.state.IBlockState p0);
private static native void __sourceExactCall_6604345f74a40b(java.lang.String[] p0);

private static native void __sourceExactCall_553676dacf21e2(net.minecraft.entity.item.EntityMinecart p0, double p1, double p2, double p3);
private static native void __sourceExactCall_3b7af93e05feea(net.minecraft.entity.Entity p0, double p1, double p2, double p3);
}
