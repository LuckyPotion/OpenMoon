package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class FJ extends moom.FI {

private static final long e;

private static final long[] f;

private static final java.lang.Integer[] g;

private static final java.util.Map h;

public FJ() {
super();
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(3199299929128420318L)), ((long)(6120185099555132969L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(274757778466058L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.FJ.e ^ 135729515516472L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill741_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill741_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill741_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill741_14 = new byte[8];
    (__sourceSpill741_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill741_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation741_16 = __sourceSpill741_14;
    ((javax.crypto.Cipher)(__sourceSpill741_11)).init(((int)(__sourceSpill741_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill741_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation741_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[13];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ß\nÁi)ieÊ¥à2=®rùÞ2ÊíºV^áåúLÆ¨ÂF\n$Ä\004Ú\"ÄØÔÙ\025Pø¯\032ñWLRè4|Ö\020*\002o%Ñ\002<ÚTnÛqj×\033`B"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill741_25 = local6_life21;
        int __sourceSpill741_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill741_25)).substring(((int)(__sourceSpill741_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill741_30 = local8_life19;
        int __sourceSpill741_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill741_33 = new byte[8];
        (__sourceSpill741_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill741_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill741_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill741_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill741_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill741_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill741_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill741_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill741_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill741_34)).doFinal(((byte[])(__sourceSpill741_33)));
        (__sourceSpill741_30)[__sourceSpill741_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "ï½Jk½Ì®\021Êþ0lÇ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill741_38 = local6_life21;
        int __sourceSpill741_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill741_38)).substring(((int)(__sourceSpill741_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill741_43 = local8_life19;
        int __sourceSpill741_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill741_46 = new byte[8];
        (__sourceSpill741_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill741_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill741_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill741_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill741_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill741_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill741_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill741_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill741_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill741_47)).doFinal(((byte[])(__sourceSpill741_46)));
        (__sourceSpill741_43)[__sourceSpill741_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    f = ((long[])(local8_life19));
    g = ((java.lang.Integer[])(new java.lang.Integer[13]));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


protected void a(long p0, int p1, int p2, moom.Fm p3, double p4, double p5, double p6, float p7, float p8, float p9, int p10, int p11, double p12) {
int forestValue621_73_0;
    int forestValue621_93_0;
    int forestValue621_93_1;
    int forestValue621_106_0;
    int forestValue621_108_0;
    int forestValue621_111_0;
    int forestValue621_111_1;
    int forestValue621_240_0;
    int forestValue621_246_0;
    int forestValue621_295_0;
    int forestValue621_307_0;
    int forestValue621_319_0;
    int forestValue621_331_0;
    int forestValue621_348_0;
    int forestValue621_415_0;
    int forestValue621_431_0;
    int forestValue621_431_1;
    int forestValue621_444_0;
    int forestValue621_444_1;
    int forestValue621_452_0;
    int forestValue621_458_0;
    int forestValue621_473_0;
    int forestValue621_498_0;
    int forestValue621_498_1;
    int forestValue621_512_0;
    int forestValue621_516_0;
    net.minecraft.block.Block forestValue621_536_0;
    int forestValue621_549_0;
    int forestValue621_549_1;
    int forestValue621_556_0;
    int forestValue621_556_1;
    int forestValue621_561_0;
    int forestValue621_561_1;
    int forestValue621_570_0;
    int forestValue621_570_1;
    int forestValue621_572_0;
    int forestValue621_583_0;
    int forestValue621_591_0;
    int forestValue621_615_0;
    net.minecraft.block.Block forestValue621_714_0;
    int forestValue621_728_0;
    moom.Fm forestValue621_763_0;
    int forestValue621_763_1;
    int forestValue621_763_2;
    int forestValue621_763_3;
    net.minecraft.block.state.IBlockState forestValue621_763_4;
    moom.Fm forestValue621_771_0;
    int forestValue621_771_1;
    int forestValue621_771_2;
    int forestValue621_771_3;
    net.minecraft.block.state.IBlockState forestValue621_771_4;
    moom.Fm forestValue621_772_0;
    int forestValue621_772_1;
    int forestValue621_772_2;
    int forestValue621_772_3;
    moom.Fm forestValue621_774_0;
    int forestValue621_774_1;
    int forestValue621_774_2;
    int forestValue621_774_3;
    net.minecraft.block.state.IBlockState forestValue621_774_4;
    moom.Fm forestValue621_817_0;
    int forestValue621_817_1;
    int forestValue621_817_2;
    int forestValue621_817_3;
    int forestValue621_835_0;
    java.lang.String[] spill621_0;
    int spill621_1;
    int spill621_2;
    int spill621_3;
    int spill621_4;
    int spill621_5;
    int spill621_6;
    int spill621_7;
    int spill621_8;
    int spill621_9;
    int spill621_10;
    int spill621_11;
    int spill621_12;
    int spill621_13;
    int spill621_14;
    int spill621_15;
    int spill621_16;
    int spill621_17;
    int spill621_18;
    net.minecraft.block.Block spill621_19;
    int spill621_20;
    int spill621_21;
    int spill621_22;
    int spill621_23;
    int spill621_24;
    int spill621_25;
    net.minecraft.block.Block spill621_26;
    boolean spill621_27;
    moom.Fm spill621_28;
    int spill621_29;
    int spill621_30;
    int spill621_31;
    net.minecraft.block.state.IBlockState spill621_32;
    moom.Fm spill621_33;
    int spill621_34;
    int spill621_35;
    int spill621_36;
    long life19_3;
    double life22_18;
    double life24_33;
    float life26_35;
    float life27_37;
    java.util.Random life28_43;
    java.lang.String[] life21_44;
    int life29_64;
    int life29_74;
    int life30_96;
    int life31_111;
    double life32_130;
    double life34_134;
    float life36_137;
    float life37_140;
    float life27_192;
    float life26_196;
    double life38_262;
    double life40_266;
    double life42_271;
    double life44_278;
    int life46_368;
    int life47_383;
    int life48_390;
    int life49_397;
    int life50_412;
    int life51_427;
    int life52_499;
    int life53_501;
    int life54_513;
    int life55_528;
    net.minecraft.block.state.IBlockState life56_558;
    moom.DU life53_629;
    int life54_631;
    double life55_651;
    int life57_655;
    double life58_675;
    int life60_677;
    int life61_694;
    double life62_708;
    net.minecraft.block.state.IBlockState life64_738;
    net.minecraft.block.state.IBlockState life65_750;
    forest_join_894: {
    forest_join_893: {
    forest_join_842: {
    forest_join_108: {
    forest_join_107: {
    forest_join_106: {
    forest_join_93: {
    forest_join_85: {
    forest_join_73: {
    forest_join_72: {
    life19_3 = (moom.FJ.e ^ 79428468033642L);
    life22_18 = ((double) ((p1 * __sourceIntrinsic_d03aecf46012_invokedynamic621_1(816, (4127879001056126875L ^ life19_3))) + __sourceIntrinsic_d03aecf46012_invokedynamic621_2(5264, (1863103826425196607L ^ life19_3))));
    life24_33 = ((double) ((p2 * __sourceIntrinsic_d03aecf46012_invokedynamic621_3(816, (4127879001056126875L ^ life19_3))) + __sourceIntrinsic_d03aecf46012_invokedynamic621_4(5264, (1863103826425196607L ^ life19_3))));
    life26_35 = 0x0.0p0f;
    life27_37 = 0x0.0p0f;
    spill621_0 = moom.FI.b();
    life28_43 = new java.util.Random(p0);
    life21_44 = spill621_0;
    spill621_1 = p11;
    if (!((life21_44 != null))) {
        forestValue621_73_0 = spill621_1;
        break forest_join_73;
    }
    if (!((spill621_1 <= 0))) {
        break forest_join_72;
    }
    life29_64 = ((((moom.FJ)(this)).a * __sourceIntrinsic_d03aecf46012_invokedynamic621_7(816, (4127879001056126875L ^ life19_3))) - __sourceIntrinsic_d03aecf46012_invokedynamic621_8(816, (4127879001056126875L ^ life19_3)));
    p11 = (life29_64 - ((java.util.Random)(life28_43)).nextInt(((int)((life29_64 / 4)))));
    }
    forestValue621_73_0 = 0;
    }
    life29_74 = forestValue621_73_0;
    spill621_2 = p10;
    spill621_3 = -1;
    if (!((life21_44 != null))) {
        forestValue621_93_0 = spill621_2;
        forestValue621_93_1 = spill621_3;
        break forest_join_93;
    }
    if (!((spill621_2 == spill621_3))) {
        break forest_join_85;
    }
    p10 = (p11 / 2);
    life29_74 = 1;
    }
    forestValue621_93_0 = ((java.util.Random)(life28_43)).nextInt(((int)((p11 / 2))));
    forestValue621_93_1 = (p11 / 4);
    }
    life30_96 = (forestValue621_93_0 + forestValue621_93_1);
    spill621_4 = ((java.util.Random)(life28_43)).nextInt(((int)(__sourceIntrinsic_d03aecf46012_invokedynamic621_11(6403, (1306909081303006626L ^ life19_3)))));
    if (!((life21_44 != null))) {
        forestValue621_106_0 = spill621_4;
        break forest_join_106;
    }
    if (!((spill621_4 == 0))) {
        break forest_join_107;
    }
    forestValue621_106_0 = 1;
    }
    forestValue621_108_0 = forestValue621_106_0;
    break forest_join_108;
    }
    forestValue621_108_0 = 0;
    }
    life31_111 = forestValue621_108_0;
    forest_cycle_109: while (true) {
    forest_join_838: {
    forest_join_835: {
    forest_join_834: {
    forest_join_583: {
    forest_join_582: {
    forestValue621_111_0 = p10;
    forestValue621_111_1 = p11;
    forest_cycle_111: while (true) {
    forest_join_473: {
    forest_join_472: {
    forest_join_458: {
    forest_join_457: {
    forest_join_452: {
    forest_join_451: {
    forest_join_444: {
    forest_join_436: {
    forest_join_431: {
    forest_join_429: {
    forest_join_415: {
    forest_join_414: {
    forest_join_348: {
    forest_join_331: {
    forest_join_319: {
    forest_join_307: {
    forest_join_295: {
    forest_join_286: {
    forest_join_247: {
    forest_join_246: {
    forest_join_240: {
    forest_join_239: {
    forest_join_173: {
    forest_join_169: {
    forest_join_167: {
    if (!((forestValue621_111_0 < forestValue621_111_1))) {
        break forest_join_894;
    }
    life32_130 = (0x1.8p0d + ((double) ((moom.Dr.a(((float)(((((float) p10) * 0x1.921fb6p1f) / ((float) p11))))) * p7) * 0x1.0p0f)));
    life34_134 = (life32_130 * p12);
    life36_137 = moom.Dr.b(((float)(p9)));
    life37_140 = moom.Dr.a(((float)(p9)));
    p4 = (p4 + ((double) (moom.Dr.b(((float)(p8))) * life36_137)));
    p5 = (p5 + ((double) life37_140));
    p6 = (p6 + ((double) (moom.Dr.a(((float)(p8))) * life36_137)));
    if (!((life21_44 != null))) {
        break forest_join_167;
    }
    if (!((life31_111 != 0))) {
        break forest_join_169;
    }
    p9 = (p9 * 0x1.d70a3ep-1f);
    }
    if (!((life21_44 == null))) {
        break forest_join_173;
    }
    }
    p9 = (p9 * 0x1.666666p-1f);
    }
    p9 = (p9 + (life27_37 * 0x1.99999ap-4f));
    p8 = (p8 + (life26_35 * 0x1.99999ap-4f));
    life27_192 = (life27_37 * 0x1.ccccccp-1f);
    life26_196 = (life26_35 * 0x1.8p-1f);
    life27_37 = (life27_192 + (((((java.util.Random)(life28_43)).nextFloat() - ((java.util.Random)(life28_43)).nextFloat()) * ((java.util.Random)(life28_43)).nextFloat()) * 0x1.0p1f));
    life26_35 = (life26_196 + (((((java.util.Random)(life28_43)).nextFloat() - ((java.util.Random)(life28_43)).nextFloat()) * ((java.util.Random)(life28_43)).nextFloat()) * 0x1.0p2f));
    spill621_5 = life29_74;
    if (!((life21_44 != null))) {
        forestValue621_240_0 = spill621_5;
        break forest_join_240;
    }
    if (!((spill621_5 == 0))) {
        break forest_join_239;
    }
    spill621_6 = p10;
    if (!((life21_44 != null))) {
        forestValue621_240_0 = spill621_6;
        break forest_join_240;
    }
    if (!((spill621_6 == life30_96))) {
        break forest_join_239;
    }
    spill621_7 = recovery.source.CarrierOps.fcmpl(((float)(p7)), ((float)(0x1.0p0f)));
    if (!((life21_44 != null))) {
        forestValue621_240_0 = spill621_7;
        break forest_join_240;
    }
    if (!((spill621_7 > 0))) {
        break forest_join_239;
    }
    spill621_8 = p11;
    if (!((life21_44 != null))) {
        forestValue621_240_0 = spill621_8;
        break forest_join_240;
    }
    if (!((spill621_8 > 0))) {
        break forest_join_239;
    }
    break forest_join_842;
    }
    forestValue621_240_0 = life29_74;
    }
    if (!((life21_44 != null))) {
        forestValue621_246_0 = forestValue621_240_0;
        break forest_join_246;
    }
    if (!((forestValue621_240_0 == 0))) {
        break forest_join_247;
    }
    forestValue621_246_0 = ((java.util.Random)(life28_43)).nextInt(((int)(4)));
    }
    if (!((forestValue621_246_0 != 0))) {
        break forest_join_838;
    }
    }
    life38_262 = (p4 - life22_18);
    life40_266 = (p6 - life24_33);
    life42_271 = ((double) (p11 - p10));
    life44_278 = ((double) ((p7 + 0x1.0p1f) + 0x1.0p4f));
    spill621_9 = recovery.source.CarrierOps.dcmpl(((double)((((life38_262 * life38_262) + (life40_266 * life40_266)) - (life42_271 * life42_271)))), ((double)((life44_278 * life44_278))));
    if (!((life21_44 != null))) {
        forestValue621_295_0 = spill621_9;
        break forest_join_295;
    }
    if (!((spill621_9 > 0))) {
        break forest_join_286;
    }
    break forest_join_893;
    }
    forestValue621_295_0 = recovery.source.CarrierOps.dcmpl(((double)(p4)), ((double)(((life22_18 - 0x1.0p4d) - (life32_130 * 0x1.0p1d)))));
    }
    if (!((life21_44 != null))) {
        forestValue621_307_0 = forestValue621_295_0;
        break forest_join_307;
    }
    if (!((forestValue621_295_0 >= 0))) {
        break forest_join_838;
    }
    forestValue621_307_0 = recovery.source.CarrierOps.dcmpl(((double)(p6)), ((double)(((life24_33 - 0x1.0p4d) - (life32_130 * 0x1.0p1d)))));
    }
    if (!((life21_44 != null))) {
        forestValue621_319_0 = forestValue621_307_0;
        break forest_join_319;
    }
    if (!((forestValue621_307_0 >= 0))) {
        break forest_join_838;
    }
    forestValue621_319_0 = recovery.source.CarrierOps.dcmpg(((double)(p4)), ((double)(((life22_18 + 0x1.0p4d) + (life32_130 * 0x1.0p1d)))));
    }
    if (!((life21_44 != null))) {
        forestValue621_331_0 = forestValue621_319_0;
        break forest_join_331;
    }
    if (!((forestValue621_319_0 <= 0))) {
        break forest_join_838;
    }
    forestValue621_331_0 = recovery.source.CarrierOps.dcmpg(((double)(p6)), ((double)(((life24_33 + 0x1.0p4d) + (life32_130 * 0x1.0p1d)))));
    }
    if (!((life21_44 != null))) {
        forestValue621_348_0 = forestValue621_331_0;
        break forest_join_348;
    }
    if (!((forestValue621_331_0 <= 0))) {
        break forest_join_838;
    }
    forestValue621_348_0 = ((moom.Dr.b__Int(((double)((p4 - life32_130)))) - (p1 * __sourceIntrinsic_d03aecf46012_invokedynamic621_32(816, (4127879001056126875L ^ life19_3)))) - 1);
    }
    life46_368 = forestValue621_348_0;
    life47_383 = ((moom.Dr.b__Int(((double)((p4 + life32_130)))) - (p1 * __sourceIntrinsic_d03aecf46012_invokedynamic621_34(816, (4127879001056126875L ^ life19_3)))) + 1);
    life48_390 = (moom.Dr.b__Int(((double)((p5 - life34_134)))) - 1);
    life49_397 = (moom.Dr.b__Int(((double)((p5 + life34_134)))) + 1);
    life50_412 = ((moom.Dr.b__Int(((double)((p6 - life32_130)))) - (p2 * __sourceIntrinsic_d03aecf46012_invokedynamic621_38(816, (4127879001056126875L ^ life19_3)))) - 1);
    life51_427 = ((moom.Dr.b__Int(((double)((p6 + life32_130)))) - (p2 * __sourceIntrinsic_d03aecf46012_invokedynamic621_40(816, (4127879001056126875L ^ life19_3)))) + 1);
    spill621_10 = life46_368;
    if (!((life21_44 != null))) {
        forestValue621_415_0 = spill621_10;
        break forest_join_415;
    }
    if (!((spill621_10 < 0))) {
        break forest_join_414;
    }
    life46_368 = 0;
    }
    forestValue621_415_0 = life47_383;
    }
    spill621_11 = __sourceIntrinsic_d03aecf46012_invokedynamic621_41(816, (4127879001056126875L ^ life19_3));
    if (!((life21_44 != null))) {
        forestValue621_431_0 = forestValue621_415_0;
        forestValue621_431_1 = spill621_11;
        break forest_join_431;
    }
    if (!((forestValue621_415_0 > spill621_11))) {
        break forest_join_429;
    }
    life47_383 = __sourceIntrinsic_d03aecf46012_invokedynamic621_42(816, (4127879001056126875L ^ life19_3));
    }
    forestValue621_431_0 = life48_390;
    forestValue621_431_1 = 1;
    }
    if (!((life21_44 != null))) {
        forestValue621_444_0 = forestValue621_431_0;
        forestValue621_444_1 = forestValue621_431_1;
        break forest_join_444;
    }
    if (!((forestValue621_431_0 < forestValue621_431_1))) {
        break forest_join_436;
    }
    life48_390 = 1;
    }
    spill621_12 = life49_397;
    if (!((life21_44 != null))) {
        forestValue621_452_0 = spill621_12;
        break forest_join_452;
    }
    forestValue621_444_0 = spill621_12;
    forestValue621_444_1 = __sourceIntrinsic_d03aecf46012_invokedynamic621_43(30321, (4669145544773554903L ^ life19_3));
    }
    if (!((forestValue621_444_0 > forestValue621_444_1))) {
        break forest_join_451;
    }
    life49_397 = __sourceIntrinsic_d03aecf46012_invokedynamic621_44(15634, (1428306155205859768L ^ life19_3));
    }
    forestValue621_452_0 = life50_412;
    }
    if (!((life21_44 != null))) {
        forestValue621_458_0 = forestValue621_452_0;
        break forest_join_458;
    }
    if (!((forestValue621_452_0 < 0))) {
        break forest_join_457;
    }
    life50_412 = 0;
    }
    forestValue621_458_0 = life51_427;
    }
    if (!((life21_44 != null))) {
        forestValue621_473_0 = forestValue621_458_0;
        break forest_join_473;
    }
    if (!((forestValue621_458_0 > __sourceIntrinsic_d03aecf46012_invokedynamic621_45(816, (4127879001056126875L ^ life19_3))))) {
        break forest_join_472;
    }
    life51_427 = __sourceIntrinsic_d03aecf46012_invokedynamic621_46(816, (4127879001056126875L ^ life19_3));
    }
    forestValue621_473_0 = 0;
    }
    life52_499 = forestValue621_473_0;
    life53_501 = life46_368;
    forest_cycle_476: while (true) {
    forest_join_579: {
    if (!((life52_499 == 0))) {
        break forest_join_582;
    }
    spill621_13 = life53_501;
    if (!((life21_44 != null))) {
        forestValue621_583_0 = spill621_13;
        break forest_join_583;
    }
    spill621_14 = life47_383;
    if (!((life21_44 != null))) {
        forestValue621_111_0 = spill621_13;
        forestValue621_111_1 = spill621_14;
        continue forest_cycle_111;
    }
    if (!((spill621_13 < spill621_14))) {
        break forest_join_582;
    }
    life54_513 = life50_412;
    forest_cycle_487: while (true) {
    forest_join_576: {
    forest_join_498: {
    if (!((life52_499 == 0))) {
        break forest_join_579;
    }
    spill621_15 = life54_513;
    spill621_16 = life51_427;
    if (!((life21_44 != null))) {
        forestValue621_111_0 = spill621_15;
        forestValue621_111_1 = spill621_16;
        continue forest_cycle_111;
    }
    if (!((life21_44 != null))) {
        forestValue621_498_0 = spill621_15;
        forestValue621_498_1 = spill621_16;
        break forest_join_498;
    }
    if (!((spill621_15 < spill621_16))) {
        break forest_join_579;
    }
    forestValue621_498_0 = life49_397;
    forestValue621_498_1 = 1;
    }
    life55_528 = (forestValue621_498_0 + forestValue621_498_1);
    forest_cycle_500: while (true) {
    forest_join_573: {
    forest_join_572: {
    forest_join_570: {
    forest_join_561: {
    forest_join_556: {
    forest_join_549: {
    forest_join_540: {
    forest_join_538: {
    forest_join_536: {
    forest_join_516: {
    forest_join_512: {
    if (!((life52_499 == 0))) {
        break forest_join_576;
    }
    spill621_17 = life55_528;
    if (!((life21_44 != null))) {
        forestValue621_512_0 = spill621_17;
        break forest_join_512;
    }
    spill621_18 = (life48_390 - 1);
    if (!((life21_44 != null))) {
        forestValue621_111_0 = spill621_17;
        forestValue621_111_1 = spill621_18;
        continue forest_cycle_111;
    }
    if (!((spill621_17 >= spill621_18))) {
        break forest_join_576;
    }
    forestValue621_512_0 = life55_528;
    }
    if (!((life21_44 != null))) {
        forestValue621_516_0 = forestValue621_512_0;
        break forest_join_516;
    }
    if (!((forestValue621_512_0 >= 0))) {
        break forest_join_573;
    }
    forestValue621_516_0 = life55_528;
    }
    if (!((forestValue621_516_0 < __sourceIntrinsic_d03aecf46012_invokedynamic621_47(13601, (6463094612720030092L ^ life19_3))))) {
        break forest_join_573;
    }
    life56_558 = ((moom.Fm)(p3)).a(((int)(life53_501)), ((int)(life55_528)), ((int)(life54_513)));
    spill621_19 = ((net.minecraft.block.state.IBlockState)(life56_558)).a__ch();
    if (!((life21_44 != null))) {
        forestValue621_536_0 = spill621_19;
        break forest_join_536;
    }
    if (!((spill621_19 != net.minecraft.init.Blocks.i))) {
        break forest_join_538;
    }
    forestValue621_536_0 = ((net.minecraft.block.state.IBlockState)(life56_558)).a__ch();
    }
    if (!((forestValue621_536_0 == net.minecraft.init.Blocks.j))) {
        break forest_join_540;
    }
    }
    life52_499 = 1;
    }
    spill621_20 = life55_528;
    spill621_21 = (life48_390 - 1);
    if (!((life21_44 != null))) {
        forestValue621_549_0 = spill621_20;
        forestValue621_549_1 = spill621_21;
        break forest_join_549;
    }
    if (!((spill621_20 != spill621_21))) {
        break forest_join_573;
    }
    forestValue621_549_0 = life53_501;
    forestValue621_549_1 = life46_368;
    }
    if (!((life21_44 != null))) {
        forestValue621_556_0 = forestValue621_549_0;
        forestValue621_556_1 = forestValue621_549_1;
        break forest_join_556;
    }
    if (!((forestValue621_549_0 != forestValue621_549_1))) {
        break forest_join_573;
    }
    forestValue621_556_0 = life53_501;
    forestValue621_556_1 = (life47_383 - 1);
    }
    if (!((life21_44 != null))) {
        forestValue621_561_0 = forestValue621_556_0;
        forestValue621_561_1 = forestValue621_556_1;
        break forest_join_561;
    }
    if (!((forestValue621_556_0 != forestValue621_556_1))) {
        break forest_join_573;
    }
    forestValue621_561_0 = life54_513;
    forestValue621_561_1 = life50_412;
    }
    if (!((life21_44 != null))) {
        forestValue621_570_0 = forestValue621_561_0;
        forestValue621_570_1 = forestValue621_561_1;
        break forest_join_570;
    }
    if (!((forestValue621_561_0 != forestValue621_561_1))) {
        break forest_join_573;
    }
    spill621_22 = life54_513;
    if (!((life21_44 != null))) {
        forestValue621_572_0 = spill621_22;
        break forest_join_572;
    }
    forestValue621_570_0 = spill621_22;
    forestValue621_570_1 = (life51_427 - 1);
    }
    if (!((forestValue621_570_0 != forestValue621_570_1))) {
        break forest_join_573;
    }
    forestValue621_572_0 = life48_390;
    }
    life55_528 = forestValue621_572_0;
    }
    life55_528 += -1;
    if (!((life21_44 == null))) {
        continue forest_cycle_500;
    }
    break forest_cycle_500;
    }
    }
    life54_513 += 1;
    if (!((life21_44 == null))) {
        continue forest_cycle_487;
    }
    break forest_cycle_487;
    }
    }
    life53_501 += 1;
    if (!((life21_44 == null))) {
        continue forest_cycle_476;
    }
    break forest_cycle_476;
    }
    break forest_cycle_111;
    }
    }
    forestValue621_583_0 = life52_499;
    }
    if (!((forestValue621_583_0 == 0))) {
        break forest_join_838;
    }
    life53_629 = new moom.DU();
    life54_631 = life46_368;
    forest_cycle_590: while (true) {
    forest_join_831: {
    forestValue621_591_0 = life54_631;
    forest_cycle_591: while (true) {
    if (!((forestValue621_591_0 < life47_383))) {
        break forest_join_834;
    }
    life55_651 = (((((double) (life54_631 + (p1 * __sourceIntrinsic_d03aecf46012_invokedynamic621_53(816, (4127879001056126875L ^ life19_3))))) + 0x1.0p-1d) - p4) / life32_130);
    spill621_23 = life50_412;
    if (!((life21_44 != null))) {
        forestValue621_835_0 = spill621_23;
        break forest_join_835;
    }
    life57_655 = spill621_23;
    forest_cycle_614: while (true) {
    forest_join_829: {
    forest_join_828: {
    forestValue621_615_0 = life57_655;
    forest_cycle_615: while (true) {
    if (!((forestValue621_615_0 < life51_427))) {
        break forest_join_831;
    }
    life58_675 = (((((double) (life57_655 + (p2 * __sourceIntrinsic_d03aecf46012_invokedynamic621_54(816, (4127879001056126875L ^ life19_3))))) + 0x1.0p-1d) - p6) / life32_130);
    life60_677 = 0;
    if (!((life21_44 != null))) {
        break forest_join_829;
    }
    spill621_24 = recovery.source.CarrierOps.dcmpg(((double)(((life55_651 * life55_651) + (life58_675 * life58_675)))), ((double)(0x1.0p0d)));
    if (!((life21_44 != null))) {
        forestValue621_591_0 = spill621_24;
        continue forest_cycle_591;
    }
    if (!((spill621_24 < 0))) {
        break forest_join_828;
    }
    life61_694 = life49_397;
    forest_cycle_652: while (true) {
    forest_join_826: {
    forest_join_825: {
    forest_join_817: {
    forest_join_775: {
    forest_join_774: {
    forest_join_772: {
    forest_join_771: {
    forest_join_763: {
    forest_join_743: {
    forest_join_728: {
    forest_join_718: {
    forest_join_716: {
    forest_join_714: {
    if (!((life61_694 > life48_390))) {
        break forest_join_828;
    }
    life62_708 = (((((double) (life61_694 - 1)) + 0x1.0p-1d) - p5) / life34_134);
    if (!((life21_44 != null))) {
        break forest_join_826;
    }
    spill621_25 = recovery.source.CarrierOps.dcmpl(((double)(life62_708)), ((double)(-0x1.6666666666666p-1d)));
    if (!((life21_44 != null))) {
        forestValue621_615_0 = spill621_25;
        continue forest_cycle_615;
    }
    if (!((spill621_25 > 0))) {
        break forest_join_825;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)((((life55_651 * life55_651) + (life62_708 * life62_708)) + (life58_675 * life58_675)))), ((double)(0x1.0p0d))) < 0))) {
        break forest_join_825;
    }
    life64_738 = ((moom.Fm)(p3)).a(((int)(life54_631)), ((int)(life61_694)), ((int)(life57_655)));
    life65_750 = ((net.minecraft.block.state.IBlockState)(com.google.common.base.MoreObjects.firstNonNull(((java.lang.Object)(((moom.Fm)(p3)).a(((int)(life54_631)), ((int)((life61_694 + 1))), ((int)(life57_655))))), ((java.lang.Object)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())))));
    spill621_26 = ((net.minecraft.block.state.IBlockState)(life64_738)).a__ch();
    if (!((life21_44 != null))) {
        forestValue621_714_0 = spill621_26;
        break forest_join_714;
    }
    if (!((spill621_26 != net.minecraft.init.Blocks.c))) {
        break forest_join_716;
    }
    forestValue621_714_0 = ((net.minecraft.block.state.IBlockState)(life64_738)).a__ch();
    }
    if (!((forestValue621_714_0 == net.minecraft.init.Blocks.bl))) {
        break forest_join_718;
    }
    }
    life60_677 = 1;
    }
    spill621_27 = ((moom.FJ)(this)).a(((net.minecraft.block.state.IBlockState)(life64_738)), ((net.minecraft.block.state.IBlockState)(life65_750)));
    if (!((life21_44 != null))) {
        forestValue621_728_0 = ((spill621_27) ? 1 : 0);
        break forest_join_728;
    }
    if (!(spill621_27)) {
        break forest_join_825;
    }
    forestValue621_728_0 = (life61_694 - 1);
    }
    if (!((forestValue621_728_0 < __sourceIntrinsic_d03aecf46012_invokedynamic621_70(24207, (2679292408754993711L ^ life19_3))))) {
        break forest_join_743;
    }
    ((moom.Fm)(p3)).a(((int)(life54_631)), ((int)(life61_694)), ((int)(life57_655)), ((net.minecraft.block.state.IBlockState)(((moom.dN)(net.minecraft.init.Blocks.l)).a__fE())));
    if (!((life21_44 == null))) {
        break forest_join_825;
    }
    }
    spill621_28 = p3;
    spill621_29 = life54_631;
    spill621_30 = life61_694;
    spill621_31 = life57_655;
    spill621_32 = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE();
    if (!((life21_44 != null))) {
        forestValue621_763_0 = spill621_28;
        forestValue621_763_1 = spill621_29;
        forestValue621_763_2 = spill621_30;
        forestValue621_763_3 = spill621_31;
        forestValue621_763_4 = spill621_32;
        break forest_join_763;
    }
    ((moom.Fm)(spill621_28)).a(((int)(spill621_29)), ((int)(spill621_30)), ((int)(spill621_31)), ((net.minecraft.block.state.IBlockState)(spill621_32)));
    if (!((((net.minecraft.block.state.IBlockState)(life65_750)).a__ch() == net.minecraft.init.Blocks.m))) {
        break forest_join_775;
    }
    forestValue621_763_0 = p3;
    forestValue621_763_1 = life54_631;
    forestValue621_763_2 = (life61_694 + 1);
    forestValue621_763_3 = life57_655;
    forestValue621_763_4 = life65_750;
    }
    if (!((life21_44 != null))) {
        forestValue621_771_0 = forestValue621_763_0;
        forestValue621_771_1 = forestValue621_763_1;
        forestValue621_771_2 = forestValue621_763_2;
        forestValue621_771_3 = forestValue621_763_3;
        forestValue621_771_4 = forestValue621_763_4;
        break forest_join_771;
    }
    if (!((((net.minecraft.block.state.IBlockState)(forestValue621_763_4)).a(((net.minecraft.block.properties.IProperty)(moom.dx.R))) == moom.ab.RED_SAND))) {
        forestValue621_772_0 = forestValue621_763_0;
        forestValue621_772_1 = forestValue621_763_1;
        forestValue621_772_2 = forestValue621_763_2;
        forestValue621_772_3 = forestValue621_763_3;
        break forest_join_772;
    }
    forestValue621_771_0 = forestValue621_763_0;
    forestValue621_771_1 = forestValue621_763_1;
    forestValue621_771_2 = forestValue621_763_2;
    forestValue621_771_3 = forestValue621_763_3;
    forestValue621_771_4 = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.cq)).a__fE();
    }
    forestValue621_774_0 = forestValue621_771_0;
    forestValue621_774_1 = forestValue621_771_1;
    forestValue621_774_2 = forestValue621_771_2;
    forestValue621_774_3 = forestValue621_771_3;
    forestValue621_774_4 = forestValue621_771_4;
    break forest_join_774;
    }
    forestValue621_774_0 = forestValue621_772_0;
    forestValue621_774_1 = forestValue621_772_1;
    forestValue621_774_2 = forestValue621_772_2;
    forestValue621_774_3 = forestValue621_772_3;
    forestValue621_774_4 = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).a__fE();
    }
    ((moom.Fm)(forestValue621_774_0)).a(((int)(forestValue621_774_1)), ((int)(forestValue621_774_2)), ((int)(forestValue621_774_3)), ((net.minecraft.block.state.IBlockState)(forestValue621_774_4)));
    }
    if (!((life60_677 != 0))) {
        break forest_join_825;
    }
    spill621_33 = p3;
    spill621_34 = life54_631;
    spill621_35 = (life61_694 - 1);
    spill621_36 = life57_655;
    if (!((life21_44 != null))) {
        forestValue621_817_0 = spill621_33;
        forestValue621_817_1 = spill621_34;
        forestValue621_817_2 = spill621_35;
        forestValue621_817_3 = spill621_36;
        break forest_join_817;
    }
    if (!((((net.minecraft.block.state.IBlockState)(((moom.Fm)(spill621_33)).a(((int)(spill621_34)), ((int)(spill621_35)), ((int)(spill621_36))))).a__ch() == net.minecraft.init.Blocks.d))) {
        break forest_join_825;
    }
    ((moom.DU)(life53_629)).a(((int)((life54_631 + (p1 * __sourceIntrinsic_d03aecf46012_invokedynamic621_90(816, (4127879001056126875L ^ life19_3)))))), ((int)(0)), ((int)((life57_655 + (p2 * __sourceIntrinsic_d03aecf46012_invokedynamic621_91(816, (4127879001056126875L ^ life19_3)))))));
    forestValue621_817_0 = p3;
    forestValue621_817_1 = life54_631;
    forestValue621_817_2 = (life61_694 - 1);
    forestValue621_817_3 = life57_655;
    }
    ((moom.Fm)(forestValue621_817_0)).a(((int)(forestValue621_817_1)), ((int)(forestValue621_817_2)), ((int)(forestValue621_817_3)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.World)(((moom.FJ)(this)).c)).a__ES(((moom.DT)(life53_629))))).am)).a__ch())).a__fE())));
    }
    life61_694 += -1;
    }
    if (!((life21_44 == null))) {
        continue forest_cycle_652;
    }
    break forest_cycle_652;
    }
    break forest_cycle_615;
    }
    }
    life57_655 += 1;
    }
    if (!((life21_44 == null))) {
        continue forest_cycle_614;
    }
    break forest_cycle_614;
    }
    break forest_cycle_591;
    }
    }
    life54_631 += 1;
    if (!((life21_44 == null))) {
        continue forest_cycle_590;
    }
    break forest_cycle_590;
    }
    }
    forestValue621_835_0 = life29_74;
    }
    if (!((forestValue621_835_0 != 0))) {
        break forest_join_838;
    }
    if (!((life21_44 == null))) {
        break forest_join_894;
    }
    }
    p10 += 1;
    if (!((life21_44 == null))) {
        continue forest_cycle_109;
    }
    break forest_cycle_109;
    }
    break forest_join_894;
    }
    ((moom.FJ)(this)).a(((long)(((java.util.Random)(life28_43)).nextLong())), ((int)(p1)), ((int)(p2)), ((moom.Fm)(p3)), ((double)(p4)), ((double)(p5)), ((double)(p6)), ((float)(((((java.util.Random)(life28_43)).nextFloat() * 0x1.0p-1f) + 0x1.0p-1f))), ((float)((p8 - 0x1.921fb6p0f))), ((float)((p9 / 0x1.8p1f))), ((int)(p10)), ((int)(p11)), ((double)(0x1.0p0d)));
    ((moom.FJ)(this)).a(((long)(((java.util.Random)(life28_43)).nextLong())), ((int)(p1)), ((int)(p2)), ((moom.Fm)(p3)), ((double)(p4)), ((double)(p5)), ((double)(p6)), ((float)(((((java.util.Random)(life28_43)).nextFloat() * 0x1.0p-1f) + 0x1.0p-1f))), ((float)((p8 + 0x1.921fb6p0f))), ((float)((p9 / 0x1.8p1f))), ((int)(p10)), ((int)(p11)), ((double)(0x1.0p0d)));
    return;
    }
    return;
    }
    return;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x9C5;
        if (g[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = f[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    h.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/FJ", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            FJ.g[n2] = n3;
        }
        return g[n2];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.FJ.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4489_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/FJ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected void a(long p0, int p1, int p2, moom.Fm p3, double p4, double p5, double p6) {
((moom.FJ)(this)).a(((long)(p0)), ((int)(p1)), ((int)(p2)), ((moom.Fm)(p3)), ((double)(p4)), ((double)(p5)), ((double)(p6)), ((float)((0x1.0p0f + (((java.util.Random)(((moom.FJ)(this)).b)).nextFloat() * 0x1.8p2f)))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((int)(-1)), ((int)(-1)), ((double)(0x1.0p-1d)));
    return;
}


protected void a(net.minecraft.world.World p0, int p1, int p2, int p3, int p4, moom.Fm p5) {
int forestValue622_39_0;
    int forestValue622_41_0;
    int forestValue622_126_0;
    moom.FJ forestValue622_186_0;
    java.lang.String[] spill622_0;
    int spill622_1;
    int spill622_2;
    moom.FJ spill622_3;
    int spill622_4;
    long life7_3;
    int life10_23;
    java.lang.String[] life9_24;
    int life11_40;
    double life12_61;
    double life14_80;
    double life16_98;
    int life18_100;
    int life19_128;
    float life20_139;
    float life21_149;
    float life22_159;
    forest_join_208: {
    forest_join_39: {
    forest_join_38: {
    life7_3 = (moom.FJ.e ^ 96693244088581L);
    spill622_0 = moom.FI.b();
    life10_23 = ((java.util.Random)(((moom.FJ)(this)).b)).nextInt(((int)((((java.util.Random)(((moom.FJ)(this)).b)).nextInt(((int)((((java.util.Random)(((moom.FJ)(this)).b)).nextInt(((int)(__sourceIntrinsic_9694d49eb69b_invokedynamic622_5(10769, (4116832962518226898L ^ life7_3))))) + 1)))) + 1))));
    life9_24 = spill622_0;
    spill622_1 = ((java.util.Random)(((moom.FJ)(this)).b)).nextInt(((int)(__sourceIntrinsic_9694d49eb69b_invokedynamic622_10(5638, (1135709263260068807L ^ life7_3)))));
    if (!((life9_24 != null))) {
        forestValue622_39_0 = spill622_1;
        break forest_join_39;
    }
    if (!((spill622_1 != 0))) {
        break forest_join_38;
    }
    life10_23 = 0;
    }
    forestValue622_39_0 = 0;
    }
    life11_40 = forestValue622_39_0;
    forest_cycle_40: while (true) {
    forest_join_205: {
    forestValue622_41_0 = life11_40;
    forest_cycle_41: while (true) {
    forest_join_126: {
    forest_join_125: {
    if (!((forestValue622_41_0 < life10_23))) {
        break forest_join_208;
    }
    life12_61 = ((double) ((p1 * __sourceIntrinsic_9694d49eb69b_invokedynamic622_12(13410, (4147739194185484719L ^ life7_3))) + ((java.util.Random)(((moom.FJ)(this)).b)).nextInt(((int)(__sourceIntrinsic_9694d49eb69b_invokedynamic622_14(816, (4127887540467711732L ^ life7_3)))))));
    life14_80 = ((double) ((java.util.Random)(((moom.FJ)(this)).b)).nextInt(((int)((((java.util.Random)(((moom.FJ)(this)).b)).nextInt(((int)(__sourceIntrinsic_9694d49eb69b_invokedynamic622_18(7761, (7600557069337502614L ^ life7_3))))) + __sourceIntrinsic_9694d49eb69b_invokedynamic622_20(20959, (5571626187118799891L ^ life7_3)))))));
    life16_98 = ((double) ((p2 * __sourceIntrinsic_9694d49eb69b_invokedynamic622_22(816, (4127887540467711732L ^ life7_3))) + ((java.util.Random)(((moom.FJ)(this)).b)).nextInt(((int)(__sourceIntrinsic_9694d49eb69b_invokedynamic622_24(816, (4127887540467711732L ^ life7_3)))))));
    life18_100 = 1;
    spill622_2 = ((java.util.Random)(((moom.FJ)(this)).b)).nextInt(((int)(4)));
    if (!((life9_24 != null))) {
        forestValue622_126_0 = spill622_2;
        break forest_join_126;
    }
    if (!((spill622_2 == 0))) {
        break forest_join_125;
    }
    ((moom.FJ)(this)).a(((long)(((java.util.Random)(((moom.FJ)(this)).b)).nextLong())), ((int)(p3)), ((int)(p4)), ((moom.Fm)(p5)), ((double)(life12_61)), ((double)(life14_80)), ((double)(life16_98)));
    life18_100 = (life18_100 + ((java.util.Random)(((moom.FJ)(this)).b)).nextInt(((int)(4))));
    }
    forestValue622_126_0 = 0;
    }
    life19_128 = forestValue622_126_0;
    forest_cycle_127: while (true) {
    forest_join_186: {
    forest_join_185: {
    if (!((life19_128 < life18_100))) {
        break forest_join_205;
    }
    life20_139 = ((((java.util.Random)(((moom.FJ)(this)).b)).nextFloat() * 0x1.921fb6p1f) * 0x1.0p1f);
    life21_149 = (((((java.util.Random)(((moom.FJ)(this)).b)).nextFloat() - 0x1.0p-1f) * 0x1.0p1f) / 0x1.0p3f);
    life22_159 = ((((java.util.Random)(((moom.FJ)(this)).b)).nextFloat() * 0x1.0p1f) + ((java.util.Random)(((moom.FJ)(this)).b)).nextFloat());
    spill622_3 = this;
    if (!((life9_24 != null))) {
        forestValue622_186_0 = spill622_3;
        break forest_join_186;
    }
    spill622_4 = ((java.util.Random)(((moom.FJ)(spill622_3)).b)).nextInt(((int)(__sourceIntrinsic_9694d49eb69b_invokedynamic622_42(27409, (2721174080471815895L ^ life7_3)))));
    if (!((life9_24 != null))) {
        forestValue622_41_0 = spill622_4;
        continue forest_cycle_41;
    }
    if (!((spill622_4 == 0))) {
        break forest_join_185;
    }
    life22_159 = (life22_159 * (((((java.util.Random)(((moom.FJ)(this)).b)).nextFloat() * ((java.util.Random)(((moom.FJ)(this)).b)).nextFloat()) * 0x1.8p1f) + 0x1.0p0f));
    }
    forestValue622_186_0 = this;
    }
    ((moom.FJ)(forestValue622_186_0)).a(((long)(((java.util.Random)(((moom.FJ)(this)).b)).nextLong())), ((int)(p3)), ((int)(p4)), ((moom.Fm)(p5)), ((double)(life12_61)), ((double)(life14_80)), ((double)(life16_98)), ((float)(life22_159)), ((float)(life20_139)), ((float)(life21_149)), ((int)(0)), ((int)(0)), ((double)(0x1.0p0d)));
    life19_128 += 1;
    if (!((life9_24 == null))) {
        continue forest_cycle_127;
    }
    break forest_cycle_127;
    }
    break forest_cycle_41;
    }
    }
    life11_40 += 1;
    if (!((life9_24 == null))) {
        continue forest_cycle_40;
    }
    break forest_cycle_40;
    }
    }
    return;
}


protected boolean a(net.minecraft.block.state.IBlockState p0, net.minecraft.block.state.IBlockState p1) {
net.minecraft.block.Block forwardValue1908_17_0;
    net.minecraft.block.Block forwardValue1908_17_1;
    net.minecraft.block.Block forwardValue1908_20_0;
    net.minecraft.block.Block forwardValue1908_27_0;
    net.minecraft.block.Block forwardValue1908_27_1;
    net.minecraft.block.Block forwardValue1908_33_0;
    net.minecraft.block.Block forwardValue1908_33_1;
    net.minecraft.block.Block forwardValue1908_39_0;
    net.minecraft.block.Block forwardValue1908_39_1;
    net.minecraft.block.Block forwardValue1908_47_0;
    net.minecraft.block.Block forwardValue1908_47_1;
    net.minecraft.block.Block forwardValue1908_50_0;
    net.minecraft.block.Block forwardValue1908_59_0;
    net.minecraft.block.Block forwardValue1908_59_1;
    net.minecraft.block.Block forwardValue1908_62_0;
    net.minecraft.block.Block forwardValue1908_74_0;
    int forwardValue1908_80_0;
    net.minecraft.block.Block spill1908_0;
    net.minecraft.block.Block spill1908_1;
    net.minecraft.block.Block spill1908_2;
    moom.dC spill1908_3;
    net.minecraft.block.Block spill1908_4;
    moom.dP spill1908_5;
    net.minecraft.block.Block spill1908_6;
    net.minecraft.block.Block spill1908_7;
    long life3_3;
    java.lang.String[] life5_5;
    forward_join_80: {
    forward_join_79: {
    forward_join_77: {
    forward_join_74: {
    forward_join_72: {
    forward_join_62: {
    forward_join_59: {
    forward_join_50: {
    forward_join_47: {
    forward_join_39: {
    forward_join_33: {
    forward_join_27: {
    forward_join_20: {
    forward_join_17: {
    life3_3 = (moom.FJ.e ^ 91118790082269L);
    life5_5 = moom.FI.b();
    spill1908_0 = ((net.minecraft.block.state.IBlockState)(p0)).a__ch();
    spill1908_1 = net.minecraft.init.Blocks.b;
    if (!((life5_5 != null))) {
        forwardValue1908_17_0 = spill1908_0;
        forwardValue1908_17_1 = spill1908_1;
        break forward_join_17;
    }
    if (!((spill1908_0 != spill1908_1))) {
        break forward_join_77;
    }
    spill1908_2 = ((net.minecraft.block.state.IBlockState)(p0)).a__ch();
    if (!((life5_5 != null))) {
        forwardValue1908_20_0 = spill1908_2;
        break forward_join_20;
    }
    forwardValue1908_17_0 = spill1908_2;
    forwardValue1908_17_1 = net.minecraft.init.Blocks.d;
    }
    if (!((forwardValue1908_17_0 != forwardValue1908_17_1))) {
        break forward_join_77;
    }
    forwardValue1908_20_0 = ((net.minecraft.block.state.IBlockState)(p0)).a__ch();
    }
    spill1908_3 = net.minecraft.init.Blocks.c;
    if (!((life5_5 != null))) {
        forwardValue1908_27_0 = forwardValue1908_20_0;
        forwardValue1908_27_1 = spill1908_3;
        break forward_join_27;
    }
    if (!((forwardValue1908_20_0 != spill1908_3))) {
        break forward_join_77;
    }
    forwardValue1908_27_0 = ((net.minecraft.block.state.IBlockState)(p0)).a__ch();
    forwardValue1908_27_1 = net.minecraft.init.Blocks.cd;
    }
    if (!((life5_5 != null))) {
        forwardValue1908_33_0 = forwardValue1908_27_0;
        forwardValue1908_33_1 = forwardValue1908_27_1;
        break forward_join_33;
    }
    if (!((forwardValue1908_27_0 != forwardValue1908_27_1))) {
        break forward_join_77;
    }
    forwardValue1908_33_0 = ((net.minecraft.block.state.IBlockState)(p0)).a__ch();
    forwardValue1908_33_1 = net.minecraft.init.Blocks.b9;
    }
    if (!((life5_5 != null))) {
        forwardValue1908_39_0 = forwardValue1908_33_0;
        forwardValue1908_39_1 = forwardValue1908_33_1;
        break forward_join_39;
    }
    if (!((forwardValue1908_33_0 != forwardValue1908_33_1))) {
        break forward_join_77;
    }
    forwardValue1908_39_0 = ((net.minecraft.block.state.IBlockState)(p0)).a__ch();
    forwardValue1908_39_1 = net.minecraft.init.Blocks.A;
    }
    if (!((life5_5 != null))) {
        forwardValue1908_47_0 = forwardValue1908_39_0;
        forwardValue1908_47_1 = forwardValue1908_39_1;
        break forward_join_47;
    }
    if (!((forwardValue1908_39_0 != forwardValue1908_39_1))) {
        break forward_join_77;
    }
    spill1908_4 = ((net.minecraft.block.state.IBlockState)(p0)).a__ch();
    if (!((life5_5 != null))) {
        forwardValue1908_50_0 = spill1908_4;
        break forward_join_50;
    }
    forwardValue1908_47_0 = spill1908_4;
    forwardValue1908_47_1 = net.minecraft.init.Blocks.cq;
    }
    if (!((forwardValue1908_47_0 != forwardValue1908_47_1))) {
        break forward_join_77;
    }
    forwardValue1908_50_0 = ((net.minecraft.block.state.IBlockState)(p0)).a__ch();
    }
    spill1908_5 = net.minecraft.init.Blocks.bl;
    if (!((life5_5 != null))) {
        forwardValue1908_59_0 = forwardValue1908_50_0;
        forwardValue1908_59_1 = spill1908_5;
        break forward_join_59;
    }
    if (!((forwardValue1908_50_0 != spill1908_5))) {
        break forward_join_77;
    }
    spill1908_6 = ((net.minecraft.block.state.IBlockState)(p0)).a__ch();
    if (!((life5_5 != null))) {
        forwardValue1908_62_0 = spill1908_6;
        break forward_join_62;
    }
    forwardValue1908_59_0 = spill1908_6;
    forwardValue1908_59_1 = net.minecraft.init.Blocks.aH;
    }
    if (!((forwardValue1908_59_0 != forwardValue1908_59_1))) {
        break forward_join_77;
    }
    forwardValue1908_62_0 = ((net.minecraft.block.state.IBlockState)(p0)).a__ch();
    }
    if (!((life5_5 != null))) {
        forwardValue1908_74_0 = forwardValue1908_62_0;
        break forward_join_74;
    }
    if (!((forwardValue1908_62_0 != net.minecraft.init.Blocks.m))) {
        break forward_join_72;
    }
    spill1908_7 = ((net.minecraft.block.state.IBlockState)(p0)).a__ch();
    if (!((life5_5 != null))) {
        forwardValue1908_74_0 = spill1908_7;
        break forward_join_74;
    }
    if (!((spill1908_7 == net.minecraft.init.Blocks.n))) {
        break forward_join_79;
    }
    }
    forwardValue1908_74_0 = ((net.minecraft.block.state.IBlockState)(p1)).a__ch();
    }
    if (!((((net.minecraft.block.Block)(forwardValue1908_74_0)).a__fn() != moom.fn.h))) {
        break forward_join_79;
    }
    }
    forwardValue1908_80_0 = 1;
    break forward_join_80;
    }
    forwardValue1908_80_0 = 0;
    }
    return ((forwardValue1908_80_0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic621_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic621_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic621_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic621_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic621_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic621_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic621_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic621_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic621_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic621_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic621_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic621_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic621_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic621_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic621_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic621_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic621_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic621_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic621_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic621_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic621_70(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic621_90(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic621_91(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4489_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9694d49eb69b_invokedynamic622_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9694d49eb69b_invokedynamic622_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9694d49eb69b_invokedynamic622_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9694d49eb69b_invokedynamic622_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9694d49eb69b_invokedynamic622_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9694d49eb69b_invokedynamic622_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9694d49eb69b_invokedynamic622_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9694d49eb69b_invokedynamic622_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9694d49eb69b_invokedynamic622_42(int a0, long a1) throws E;
}
