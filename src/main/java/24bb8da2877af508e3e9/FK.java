package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class FK extends moom.FI {

private static final long e;

private static final long[] f;

private static final java.lang.Integer[] g;

private static final java.util.Map h;

public FK() {
super();
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(999172006327883653L)), ((long)(-8269496941063598208L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(129351918363798L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.FK.e ^ 66296620628155L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill742_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill742_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill742_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill742_14 = new byte[8];
    (__sourceSpill742_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill742_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation742_16 = __sourceSpill742_14;
    ((javax.crypto.Cipher)(__sourceSpill742_11)).init(((int)(__sourceSpill742_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill742_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation742_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[10];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\ftÅ\0169Aw6ÊeÄ@t\f!|\\B\002Whü¾ÕÝÀ<\026H´í1\034¢\030\023míHsË\bj_®@Ý\000\020},\032©NVoÇ¿\007"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill742_25 = local6_life21;
        int __sourceSpill742_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill742_25)).substring(((int)(__sourceSpill742_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill742_30 = local8_life19;
        int __sourceSpill742_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill742_33 = new byte[8];
        (__sourceSpill742_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill742_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill742_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill742_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill742_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill742_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill742_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill742_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill742_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill742_34)).doFinal(((byte[])(__sourceSpill742_33)));
        (__sourceSpill742_30)[__sourceSpill742_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "|ôÛ§Åqæ^Ô\024çØ%¼·"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill742_38 = local6_life21;
        int __sourceSpill742_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill742_38)).substring(((int)(__sourceSpill742_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill742_43 = local8_life19;
        int __sourceSpill742_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill742_46 = new byte[8];
        (__sourceSpill742_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill742_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill742_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill742_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill742_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill742_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill742_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill742_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill742_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill742_47)).doFinal(((byte[])(__sourceSpill742_46)));
        (__sourceSpill742_43)[__sourceSpill742_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    f = ((long[])(local8_life19));
    g = ((java.lang.Integer[])(new java.lang.Integer[10]));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x7AD0;
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
                throw new RuntimeException("moom/FK", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            FK.g[n2] = n3;
        }
        return g[n2];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.FK.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4492_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/FK"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected void a(long p0, int p1, int p2, moom.Fm p3, double p4, double p5, double p6, float p7, float p8, float p9, int p10, int p11, double p12) {
int forestValue623_73_0;
    int forestValue623_93_0;
    int forestValue623_93_1;
    int forestValue623_106_0;
    int forestValue623_108_0;
    int forestValue623_111_0;
    int forestValue623_111_1;
    int forestValue623_236_0;
    int forestValue623_242_0;
    int forestValue623_291_0;
    int forestValue623_303_0;
    int forestValue623_315_0;
    int forestValue623_327_0;
    int forestValue623_344_0;
    int forestValue623_411_0;
    int forestValue623_427_0;
    int forestValue623_427_1;
    int forestValue623_440_0;
    int forestValue623_440_1;
    int forestValue623_448_0;
    int forestValue623_454_0;
    int forestValue623_469_0;
    int forestValue623_494_0;
    int forestValue623_494_1;
    int forestValue623_508_0;
    int forestValue623_512_0;
    net.minecraft.block.Block forestValue623_532_0;
    int forestValue623_545_0;
    int forestValue623_545_1;
    int forestValue623_552_0;
    int forestValue623_552_1;
    int forestValue623_557_0;
    int forestValue623_557_1;
    int forestValue623_566_0;
    int forestValue623_566_1;
    int forestValue623_568_0;
    int forestValue623_579_0;
    int forestValue623_583_0;
    int forestValue623_585_0;
    int forestValue623_609_0;
    net.minecraft.block.Block forestValue623_685_0;
    net.minecraft.block.Block forestValue623_685_1;
    net.minecraft.block.Block forestValue623_688_0;
    int forestValue623_707_0;
    java.lang.String[] spill623_0;
    int spill623_1;
    int spill623_2;
    int spill623_3;
    int spill623_4;
    int spill623_5;
    int spill623_6;
    int spill623_7;
    int spill623_8;
    int spill623_9;
    int spill623_10;
    int spill623_11;
    int spill623_12;
    int spill623_13;
    int spill623_14;
    int spill623_15;
    int spill623_16;
    int spill623_17;
    net.minecraft.block.Block spill623_18;
    int spill623_19;
    int spill623_20;
    int spill623_21;
    int spill623_22;
    int spill623_23;
    int spill623_24;
    net.minecraft.block.Block spill623_25;
    net.minecraft.block.Block spill623_26;
    net.minecraft.block.Block spill623_27;
    long life19_3;
    double life22_19;
    double life24_34;
    float life26_36;
    float life27_38;
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
    double life38_256;
    double life40_260;
    double life42_265;
    double life44_272;
    int life46_362;
    int life47_377;
    int life48_384;
    int life49_391;
    int life50_406;
    int life51_421;
    int life52_493;
    int life53_495;
    int life54_507;
    int life55_522;
    net.minecraft.block.state.IBlockState life56_552;
    int life53_624;
    double life54_644;
    int life56_648;
    double life57_668;
    int life59_672;
    double life60_686;
    net.minecraft.block.state.IBlockState life62_716;
    forest_join_766: {
    forest_join_765: {
    forest_join_714: {
    forest_join_108: {
    forest_join_107: {
    forest_join_106: {
    forest_join_93: {
    forest_join_85: {
    forest_join_73: {
    forest_join_72: {
    life19_3 = (moom.FK.e ^ 28331668557381L);
    spill623_0 = moom.FI.b();
    life22_19 = ((double) ((p1 * __sourceIntrinsic_d03aecf46012_invokedynamic623_2(15916, (2359590331507537333L ^ life19_3))) + __sourceIntrinsic_d03aecf46012_invokedynamic623_3(31768, (5050346974470944640L ^ life19_3))));
    life24_34 = ((double) ((p2 * __sourceIntrinsic_d03aecf46012_invokedynamic623_4(15916, (2359590331507537333L ^ life19_3))) + __sourceIntrinsic_d03aecf46012_invokedynamic623_5(28660, (8624951763256878187L ^ life19_3))));
    life26_36 = 0x0.0p0f;
    life27_38 = 0x0.0p0f;
    life28_43 = new java.util.Random(p0);
    life21_44 = spill623_0;
    spill623_1 = p11;
    if (!((life21_44 != null))) {
        forestValue623_73_0 = spill623_1;
        break forest_join_73;
    }
    if (!((spill623_1 <= 0))) {
        break forest_join_72;
    }
    life29_64 = ((((moom.FK)(this)).a * __sourceIntrinsic_d03aecf46012_invokedynamic623_7(15916, (2359590331507537333L ^ life19_3))) - __sourceIntrinsic_d03aecf46012_invokedynamic623_8(15916, (2359590331507537333L ^ life19_3)));
    p11 = (life29_64 - ((java.util.Random)(life28_43)).nextInt(((int)((life29_64 / 4)))));
    }
    forestValue623_73_0 = 0;
    }
    life29_74 = forestValue623_73_0;
    spill623_2 = p10;
    spill623_3 = -1;
    if (!((life21_44 != null))) {
        forestValue623_93_0 = spill623_2;
        forestValue623_93_1 = spill623_3;
        break forest_join_93;
    }
    if (!((spill623_2 == spill623_3))) {
        break forest_join_85;
    }
    p10 = (p11 / 2);
    life29_74 = 1;
    }
    forestValue623_93_0 = ((java.util.Random)(life28_43)).nextInt(((int)((p11 / 2))));
    forestValue623_93_1 = (p11 / 4);
    }
    life30_96 = (forestValue623_93_0 + forestValue623_93_1);
    spill623_4 = ((java.util.Random)(life28_43)).nextInt(((int)(__sourceIntrinsic_d03aecf46012_invokedynamic623_11(7871, (4268945297674163493L ^ life19_3)))));
    if (!((life21_44 != null))) {
        forestValue623_106_0 = spill623_4;
        break forest_join_106;
    }
    if (!((spill623_4 == 0))) {
        break forest_join_107;
    }
    forestValue623_106_0 = 1;
    }
    forestValue623_108_0 = forestValue623_106_0;
    break forest_join_108;
    }
    forestValue623_108_0 = 0;
    }
    life31_111 = forestValue623_108_0;
    forest_cycle_109: while (true) {
    forest_join_710: {
    forest_join_707: {
    forest_join_706: {
    forest_join_583: {
    forest_join_579: {
    forest_join_578: {
    forestValue623_111_0 = p10;
    forestValue623_111_1 = p11;
    forest_cycle_111: while (true) {
    forest_join_469: {
    forest_join_468: {
    forest_join_454: {
    forest_join_453: {
    forest_join_448: {
    forest_join_447: {
    forest_join_440: {
    forest_join_432: {
    forest_join_427: {
    forest_join_425: {
    forest_join_411: {
    forest_join_410: {
    forest_join_344: {
    forest_join_327: {
    forest_join_315: {
    forest_join_303: {
    forest_join_291: {
    forest_join_282: {
    forest_join_243: {
    forest_join_242: {
    forest_join_236: {
    forest_join_235: {
    forest_join_173: {
    forest_join_169: {
    forest_join_167: {
    if (!((forestValue623_111_0 < forestValue623_111_1))) {
        break forest_join_766;
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
    p9 = (p9 + (life27_38 * 0x1.99999ap-4f));
    p8 = (p8 + (life26_36 * 0x1.99999ap-4f));
    life27_192 = (life27_38 * 0x1.ccccccp-1f);
    life26_196 = (life26_36 * 0x1.8p-1f);
    life27_38 = (life27_192 + (((((java.util.Random)(life28_43)).nextFloat() - ((java.util.Random)(life28_43)).nextFloat()) * ((java.util.Random)(life28_43)).nextFloat()) * 0x1.0p1f));
    life26_36 = (life26_196 + (((((java.util.Random)(life28_43)).nextFloat() - ((java.util.Random)(life28_43)).nextFloat()) * ((java.util.Random)(life28_43)).nextFloat()) * 0x1.0p2f));
    spill623_5 = life29_74;
    if (!((life21_44 != null))) {
        forestValue623_236_0 = spill623_5;
        break forest_join_236;
    }
    if (!((spill623_5 == 0))) {
        break forest_join_235;
    }
    spill623_6 = p10;
    if (!((life21_44 != null))) {
        forestValue623_236_0 = spill623_6;
        break forest_join_236;
    }
    if (!((spill623_6 == life30_96))) {
        break forest_join_235;
    }
    spill623_7 = recovery.source.CarrierOps.fcmpl(((float)(p7)), ((float)(0x1.0p0f)));
    if (!((life21_44 != null))) {
        forestValue623_236_0 = spill623_7;
        break forest_join_236;
    }
    if (!((spill623_7 > 0))) {
        break forest_join_235;
    }
    break forest_join_714;
    }
    forestValue623_236_0 = life29_74;
    }
    if (!((life21_44 != null))) {
        forestValue623_242_0 = forestValue623_236_0;
        break forest_join_242;
    }
    if (!((forestValue623_236_0 == 0))) {
        break forest_join_243;
    }
    forestValue623_242_0 = ((java.util.Random)(life28_43)).nextInt(((int)(4)));
    }
    if (!((forestValue623_242_0 != 0))) {
        break forest_join_710;
    }
    }
    life38_256 = (p4 - life22_19);
    life40_260 = (p6 - life24_34);
    life42_265 = ((double) (p11 - p10));
    life44_272 = ((double) ((p7 + 0x1.0p1f) + 0x1.0p4f));
    spill623_8 = recovery.source.CarrierOps.dcmpl(((double)((((life38_256 * life38_256) + (life40_260 * life40_260)) - (life42_265 * life42_265)))), ((double)((life44_272 * life44_272))));
    if (!((life21_44 != null))) {
        forestValue623_291_0 = spill623_8;
        break forest_join_291;
    }
    if (!((spill623_8 > 0))) {
        break forest_join_282;
    }
    break forest_join_765;
    }
    forestValue623_291_0 = recovery.source.CarrierOps.dcmpl(((double)(p4)), ((double)(((life22_19 - 0x1.0p4d) - (life32_130 * 0x1.0p1d)))));
    }
    if (!((life21_44 != null))) {
        forestValue623_303_0 = forestValue623_291_0;
        break forest_join_303;
    }
    if (!((forestValue623_291_0 >= 0))) {
        break forest_join_710;
    }
    forestValue623_303_0 = recovery.source.CarrierOps.dcmpl(((double)(p6)), ((double)(((life24_34 - 0x1.0p4d) - (life32_130 * 0x1.0p1d)))));
    }
    if (!((life21_44 != null))) {
        forestValue623_315_0 = forestValue623_303_0;
        break forest_join_315;
    }
    if (!((forestValue623_303_0 >= 0))) {
        break forest_join_710;
    }
    forestValue623_315_0 = recovery.source.CarrierOps.dcmpg(((double)(p4)), ((double)(((life22_19 + 0x1.0p4d) + (life32_130 * 0x1.0p1d)))));
    }
    if (!((life21_44 != null))) {
        forestValue623_327_0 = forestValue623_315_0;
        break forest_join_327;
    }
    if (!((forestValue623_315_0 <= 0))) {
        break forest_join_710;
    }
    forestValue623_327_0 = recovery.source.CarrierOps.dcmpg(((double)(p6)), ((double)(((life24_34 + 0x1.0p4d) + (life32_130 * 0x1.0p1d)))));
    }
    if (!((life21_44 != null))) {
        forestValue623_344_0 = forestValue623_327_0;
        break forest_join_344;
    }
    if (!((forestValue623_327_0 <= 0))) {
        break forest_join_710;
    }
    forestValue623_344_0 = ((moom.Dr.b__Int(((double)((p4 - life32_130)))) - (p1 * __sourceIntrinsic_d03aecf46012_invokedynamic623_32(15916, (2359590331507537333L ^ life19_3)))) - 1);
    }
    life46_362 = forestValue623_344_0;
    life47_377 = ((moom.Dr.b__Int(((double)((p4 + life32_130)))) - (p1 * __sourceIntrinsic_d03aecf46012_invokedynamic623_34(15916, (2359590331507537333L ^ life19_3)))) + 1);
    life48_384 = (moom.Dr.b__Int(((double)((p5 - life34_134)))) - 1);
    life49_391 = (moom.Dr.b__Int(((double)((p5 + life34_134)))) + 1);
    life50_406 = ((moom.Dr.b__Int(((double)((p6 - life32_130)))) - (p2 * __sourceIntrinsic_d03aecf46012_invokedynamic623_38(15916, (2359590331507537333L ^ life19_3)))) - 1);
    life51_421 = ((moom.Dr.b__Int(((double)((p6 + life32_130)))) - (p2 * __sourceIntrinsic_d03aecf46012_invokedynamic623_40(15916, (2359590331507537333L ^ life19_3)))) + 1);
    spill623_9 = life46_362;
    if (!((life21_44 != null))) {
        forestValue623_411_0 = spill623_9;
        break forest_join_411;
    }
    if (!((spill623_9 < 0))) {
        break forest_join_410;
    }
    life46_362 = 0;
    }
    forestValue623_411_0 = life47_377;
    }
    spill623_10 = __sourceIntrinsic_d03aecf46012_invokedynamic623_41(15916, (2359590331507537333L ^ life19_3));
    if (!((life21_44 != null))) {
        forestValue623_427_0 = forestValue623_411_0;
        forestValue623_427_1 = spill623_10;
        break forest_join_427;
    }
    if (!((forestValue623_411_0 > spill623_10))) {
        break forest_join_425;
    }
    life47_377 = __sourceIntrinsic_d03aecf46012_invokedynamic623_42(15916, (2359590331507537333L ^ life19_3));
    }
    forestValue623_427_0 = life48_384;
    forestValue623_427_1 = 1;
    }
    if (!((life21_44 != null))) {
        forestValue623_440_0 = forestValue623_427_0;
        forestValue623_440_1 = forestValue623_427_1;
        break forest_join_440;
    }
    if (!((forestValue623_427_0 < forestValue623_427_1))) {
        break forest_join_432;
    }
    life48_384 = 1;
    }
    spill623_11 = life49_391;
    if (!((life21_44 != null))) {
        forestValue623_448_0 = spill623_11;
        break forest_join_448;
    }
    forestValue623_440_0 = spill623_11;
    forestValue623_440_1 = __sourceIntrinsic_d03aecf46012_invokedynamic623_43(10054, (6543157706059836634L ^ life19_3));
    }
    if (!((forestValue623_440_0 > forestValue623_440_1))) {
        break forest_join_447;
    }
    life49_391 = __sourceIntrinsic_d03aecf46012_invokedynamic623_44(3207, (8639143655777847068L ^ life19_3));
    }
    forestValue623_448_0 = life50_406;
    }
    if (!((life21_44 != null))) {
        forestValue623_454_0 = forestValue623_448_0;
        break forest_join_454;
    }
    if (!((forestValue623_448_0 < 0))) {
        break forest_join_453;
    }
    life50_406 = 0;
    }
    forestValue623_454_0 = life51_421;
    }
    if (!((life21_44 != null))) {
        forestValue623_469_0 = forestValue623_454_0;
        break forest_join_469;
    }
    if (!((forestValue623_454_0 > __sourceIntrinsic_d03aecf46012_invokedynamic623_45(15916, (2359590331507537333L ^ life19_3))))) {
        break forest_join_468;
    }
    life51_421 = __sourceIntrinsic_d03aecf46012_invokedynamic623_46(15916, (2359590331507537333L ^ life19_3));
    }
    forestValue623_469_0 = 0;
    }
    life52_493 = forestValue623_469_0;
    life53_495 = life46_362;
    forest_cycle_472: while (true) {
    forest_join_575: {
    if (!((life52_493 == 0))) {
        break forest_join_578;
    }
    spill623_12 = life53_495;
    if (!((life21_44 != null))) {
        forestValue623_579_0 = spill623_12;
        break forest_join_579;
    }
    spill623_13 = life47_377;
    if (!((life21_44 != null))) {
        forestValue623_111_0 = spill623_12;
        forestValue623_111_1 = spill623_13;
        continue forest_cycle_111;
    }
    if (!((spill623_12 < spill623_13))) {
        break forest_join_578;
    }
    life54_507 = life50_406;
    forest_cycle_483: while (true) {
    forest_join_572: {
    forest_join_494: {
    if (!((life52_493 == 0))) {
        break forest_join_575;
    }
    spill623_14 = life54_507;
    spill623_15 = life51_421;
    if (!((life21_44 != null))) {
        forestValue623_111_0 = spill623_14;
        forestValue623_111_1 = spill623_15;
        continue forest_cycle_111;
    }
    if (!((life21_44 != null))) {
        forestValue623_494_0 = spill623_14;
        forestValue623_494_1 = spill623_15;
        break forest_join_494;
    }
    if (!((spill623_14 < spill623_15))) {
        break forest_join_575;
    }
    forestValue623_494_0 = life49_391;
    forestValue623_494_1 = 1;
    }
    life55_522 = (forestValue623_494_0 + forestValue623_494_1);
    forest_cycle_496: while (true) {
    forest_join_569: {
    forest_join_568: {
    forest_join_566: {
    forest_join_557: {
    forest_join_552: {
    forest_join_545: {
    forest_join_536: {
    forest_join_534: {
    forest_join_532: {
    forest_join_512: {
    forest_join_508: {
    if (!((life52_493 == 0))) {
        break forest_join_572;
    }
    spill623_16 = life55_522;
    if (!((life21_44 != null))) {
        forestValue623_508_0 = spill623_16;
        break forest_join_508;
    }
    spill623_17 = (life48_384 - 1);
    if (!((life21_44 != null))) {
        forestValue623_111_0 = spill623_16;
        forestValue623_111_1 = spill623_17;
        continue forest_cycle_111;
    }
    if (!((spill623_16 >= spill623_17))) {
        break forest_join_572;
    }
    forestValue623_508_0 = life55_522;
    }
    if (!((life21_44 != null))) {
        forestValue623_512_0 = forestValue623_508_0;
        break forest_join_512;
    }
    if (!((forestValue623_508_0 >= 0))) {
        break forest_join_569;
    }
    forestValue623_512_0 = life55_522;
    }
    if (!((forestValue623_512_0 < __sourceIntrinsic_d03aecf46012_invokedynamic623_47(1398, (6382938829569052390L ^ life19_3))))) {
        break forest_join_569;
    }
    life56_552 = ((moom.Fm)(p3)).a(((int)(life53_495)), ((int)(life55_522)), ((int)(life54_507)));
    spill623_18 = ((net.minecraft.block.state.IBlockState)(life56_552)).a__ch();
    if (!((life21_44 != null))) {
        forestValue623_532_0 = spill623_18;
        break forest_join_532;
    }
    if (!((spill623_18 != net.minecraft.init.Blocks.k))) {
        break forest_join_534;
    }
    forestValue623_532_0 = ((net.minecraft.block.state.IBlockState)(life56_552)).a__ch();
    }
    if (!((forestValue623_532_0 == net.minecraft.init.Blocks.l))) {
        break forest_join_536;
    }
    }
    life52_493 = 1;
    }
    spill623_19 = life55_522;
    spill623_20 = (life48_384 - 1);
    if (!((life21_44 != null))) {
        forestValue623_545_0 = spill623_19;
        forestValue623_545_1 = spill623_20;
        break forest_join_545;
    }
    if (!((spill623_19 != spill623_20))) {
        break forest_join_569;
    }
    forestValue623_545_0 = life53_495;
    forestValue623_545_1 = life46_362;
    }
    if (!((life21_44 != null))) {
        forestValue623_552_0 = forestValue623_545_0;
        forestValue623_552_1 = forestValue623_545_1;
        break forest_join_552;
    }
    if (!((forestValue623_545_0 != forestValue623_545_1))) {
        break forest_join_569;
    }
    forestValue623_552_0 = life53_495;
    forestValue623_552_1 = (life47_377 - 1);
    }
    if (!((life21_44 != null))) {
        forestValue623_557_0 = forestValue623_552_0;
        forestValue623_557_1 = forestValue623_552_1;
        break forest_join_557;
    }
    if (!((forestValue623_552_0 != forestValue623_552_1))) {
        break forest_join_569;
    }
    forestValue623_557_0 = life54_507;
    forestValue623_557_1 = life50_406;
    }
    if (!((life21_44 != null))) {
        forestValue623_566_0 = forestValue623_557_0;
        forestValue623_566_1 = forestValue623_557_1;
        break forest_join_566;
    }
    if (!((forestValue623_557_0 != forestValue623_557_1))) {
        break forest_join_569;
    }
    spill623_21 = life54_507;
    if (!((life21_44 != null))) {
        forestValue623_568_0 = spill623_21;
        break forest_join_568;
    }
    forestValue623_566_0 = spill623_21;
    forestValue623_566_1 = (life51_421 - 1);
    }
    if (!((forestValue623_566_0 != forestValue623_566_1))) {
        break forest_join_569;
    }
    forestValue623_568_0 = life48_384;
    }
    life55_522 = forestValue623_568_0;
    }
    life55_522 += -1;
    if (!((life21_44 == null))) {
        continue forest_cycle_496;
    }
    break forest_cycle_496;
    }
    }
    life54_507 += 1;
    if (!((life21_44 == null))) {
        continue forest_cycle_483;
    }
    break forest_cycle_483;
    }
    }
    life53_495 += 1;
    if (!((life21_44 == null))) {
        continue forest_cycle_472;
    }
    break forest_cycle_472;
    }
    break forest_cycle_111;
    }
    }
    forestValue623_579_0 = life52_493;
    }
    if (!((life21_44 != null))) {
        forestValue623_583_0 = forestValue623_579_0;
        break forest_join_583;
    }
    if (!((forestValue623_579_0 == 0))) {
        break forest_join_710;
    }
    forestValue623_583_0 = life46_362;
    }
    life53_624 = forestValue623_583_0;
    forest_cycle_584: while (true) {
    forest_join_703: {
    forestValue623_585_0 = life53_624;
    forest_cycle_585: while (true) {
    if (!((forestValue623_585_0 < life47_377))) {
        break forest_join_706;
    }
    life54_644 = (((((double) (life53_624 + (p1 * __sourceIntrinsic_d03aecf46012_invokedynamic623_53(15916, (2359590331507537333L ^ life19_3))))) + 0x1.0p-1d) - p4) / life32_130);
    spill623_22 = life50_406;
    if (!((life21_44 != null))) {
        forestValue623_707_0 = spill623_22;
        break forest_join_707;
    }
    life56_648 = spill623_22;
    forest_cycle_608: while (true) {
    forest_join_700: {
    forestValue623_609_0 = life56_648;
    forest_cycle_609: while (true) {
    if (!((forestValue623_609_0 < life51_421))) {
        break forest_join_703;
    }
    life57_668 = (((((double) (life56_648 + (p2 * __sourceIntrinsic_d03aecf46012_invokedynamic623_54(15916, (2359590331507537333L ^ life19_3))))) + 0x1.0p-1d) - p6) / life32_130);
    spill623_23 = life49_391;
    if (!((life21_44 != null))) {
        forestValue623_585_0 = spill623_23;
        continue forest_cycle_585;
    }
    life59_672 = spill623_23;
    forest_cycle_632: while (true) {
    forest_join_698: {
    forest_join_697: {
    forest_join_690: {
    forest_join_688: {
    forest_join_685: {
    if (!((life59_672 > life48_384))) {
        break forest_join_700;
    }
    life60_686 = (((((double) (life59_672 - 1)) + 0x1.0p-1d) - p5) / life34_134);
    if (!((life21_44 != null))) {
        break forest_join_698;
    }
    spill623_24 = recovery.source.CarrierOps.dcmpl(((double)(life60_686)), ((double)(-0x1.6666666666666p-1d)));
    if (!((life21_44 != null))) {
        forestValue623_609_0 = spill623_24;
        continue forest_cycle_609;
    }
    if (!((spill623_24 > 0))) {
        break forest_join_697;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)((((life54_644 * life54_644) + (life60_686 * life60_686)) + (life57_668 * life57_668)))), ((double)(0x1.0p0d))) < 0))) {
        break forest_join_697;
    }
    life62_716 = ((moom.Fm)(p3)).a(((int)(life53_624)), ((int)(life59_672)), ((int)(life56_648)));
    spill623_25 = ((net.minecraft.block.state.IBlockState)(life62_716)).a__ch();
    spill623_26 = net.minecraft.init.Blocks.aV;
    if (!((life21_44 != null))) {
        forestValue623_685_0 = spill623_25;
        forestValue623_685_1 = spill623_26;
        break forest_join_685;
    }
    if (!((spill623_25 != spill623_26))) {
        break forest_join_690;
    }
    spill623_27 = ((net.minecraft.block.state.IBlockState)(life62_716)).a__ch();
    if (!((life21_44 != null))) {
        forestValue623_688_0 = spill623_27;
        break forest_join_688;
    }
    forestValue623_685_0 = spill623_27;
    forestValue623_685_1 = net.minecraft.init.Blocks.d;
    }
    if (!((forestValue623_685_0 != forestValue623_685_1))) {
        break forest_join_690;
    }
    forestValue623_688_0 = ((net.minecraft.block.state.IBlockState)(life62_716)).a__ch();
    }
    if (!((forestValue623_688_0 == net.minecraft.init.Blocks.c))) {
        break forest_join_697;
    }
    }
    ((moom.Fm)(p3)).a(((int)(life53_624)), ((int)(life59_672)), ((int)(life56_648)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())));
    }
    life59_672 += -1;
    }
    if (!((life21_44 == null))) {
        continue forest_cycle_632;
    }
    break forest_cycle_632;
    }
    break forest_cycle_609;
    }
    }
    life56_648 += 1;
    if (!((life21_44 == null))) {
        continue forest_cycle_608;
    }
    break forest_cycle_608;
    }
    break forest_cycle_585;
    }
    }
    life53_624 += 1;
    if (!((life21_44 == null))) {
        continue forest_cycle_584;
    }
    break forest_cycle_584;
    }
    }
    forestValue623_707_0 = life29_74;
    }
    if (!((forestValue623_707_0 != 0))) {
        break forest_join_710;
    }
    if (!((life21_44 == null))) {
        break forest_join_766;
    }
    }
    p10 += 1;
    if (!((life21_44 == null))) {
        continue forest_cycle_109;
    }
    break forest_cycle_109;
    }
    break forest_join_766;
    }
    ((moom.FK)(this)).a(((long)(((java.util.Random)(life28_43)).nextLong())), ((int)(p1)), ((int)(p2)), ((moom.Fm)(p3)), ((double)(p4)), ((double)(p5)), ((double)(p6)), ((float)(((((java.util.Random)(life28_43)).nextFloat() * 0x1.0p-1f) + 0x1.0p-1f))), ((float)((p8 - 0x1.921fb6p0f))), ((float)((p9 / 0x1.8p1f))), ((int)(p10)), ((int)(p11)), ((double)(0x1.0p0d)));
    ((moom.FK)(this)).a(((long)(((java.util.Random)(life28_43)).nextLong())), ((int)(p1)), ((int)(p2)), ((moom.Fm)(p3)), ((double)(p4)), ((double)(p5)), ((double)(p6)), ((float)(((((java.util.Random)(life28_43)).nextFloat() * 0x1.0p-1f) + 0x1.0p-1f))), ((float)((p8 + 0x1.921fb6p0f))), ((float)((p9 / 0x1.8p1f))), ((int)(p10)), ((int)(p11)), ((double)(0x1.0p0d)));
    return;
    }
    return;
    }
    return;
}


protected void a(long p0, int p1, int p2, moom.Fm p3, double p4, double p5, double p6) {
((moom.FK)(this)).a(((long)(p0)), ((int)(p1)), ((int)(p2)), ((moom.Fm)(p3)), ((double)(p4)), ((double)(p5)), ((double)(p6)), ((float)((0x1.0p0f + (((java.util.Random)(((moom.FK)(this)).b)).nextFloat() * 0x1.8p2f)))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((int)(-1)), ((int)(-1)), ((double)(0x1.0p-1d)));
    return;
}


protected void a(net.minecraft.world.World p0, int p1, int p2, int p3, int p4, moom.Fm p5) {
int lexicalValue642_35_0;
    int lexicalValue642_113_0;
    java.lang.String[] spill642_0;
    int spill642_1;
    int spill642_2;
    long life7_3;
    int life10_23;
    java.lang.String[] life9_24;
    int life11_38;
    double life12_59;
    double life14_69;
    double life16_87;
    int life18_89;
    int life19_119;
    float life20_130;
    float life21_140;
    float life22_150;
    lexical_join_172: {
    lexical_join_35: {
    lexical_join_34: {
    life7_3 = (moom.FK.e ^ 117722326878989L);
    spill642_0 = moom.FI.b();
    life10_23 = ((java.util.Random)(((moom.FK)(this)).b)).nextInt(((int)((((java.util.Random)(((moom.FK)(this)).b)).nextInt(((int)((((java.util.Random)(((moom.FK)(this)).b)).nextInt(((int)(__sourceIntrinsic_9694d49eb69b_invokedynamic642_5(27983, (5848747162152313754L ^ life7_3))))) + 1)))) + 1))));
    life9_24 = spill642_0;
    spill642_1 = ((java.util.Random)(((moom.FK)(this)).b)).nextInt(((int)(5)));
    if (!((life9_24 != null))) {
        lexicalValue642_35_0 = spill642_1;
        break lexical_join_35;
    }
    if (!((spill642_1 != 0))) {
        break lexical_join_34;
    }
    life10_23 = 0;
    }
    lexicalValue642_35_0 = 0;
    }
    life11_38 = lexicalValue642_35_0;
    lexical_cycle_36: while (true) {
    lexical_join_170: {
    lexical_join_169: {
    lexical_join_113: {
    lexical_join_112: {
    if (!((life11_38 < life10_23))) {
        break lexical_join_172;
    }
    life12_59 = ((double) ((p1 * __sourceIntrinsic_9694d49eb69b_invokedynamic642_11(8736, (2679673051896835318L ^ life7_3))) + ((java.util.Random)(((moom.FK)(this)).b)).nextInt(((int)(__sourceIntrinsic_9694d49eb69b_invokedynamic642_13(15916, (2359464209214894333L ^ life7_3)))))));
    life14_69 = ((double) ((java.util.Random)(((moom.FK)(this)).b)).nextInt(((int)(__sourceIntrinsic_9694d49eb69b_invokedynamic642_16(32126, (958894133739729831L ^ life7_3))))));
    life16_87 = ((double) ((p2 * __sourceIntrinsic_9694d49eb69b_invokedynamic642_18(15916, (2359464209214894333L ^ life7_3))) + ((java.util.Random)(((moom.FK)(this)).b)).nextInt(((int)(__sourceIntrinsic_9694d49eb69b_invokedynamic642_20(15916, (2359464209214894333L ^ life7_3)))))));
    life18_89 = 1;
    spill642_2 = ((java.util.Random)(((moom.FK)(this)).b)).nextInt(((int)(4)));
    if (!((life9_24 != null))) {
        lexicalValue642_113_0 = spill642_2;
        break lexical_join_113;
    }
    if (!((spill642_2 == 0))) {
        break lexical_join_112;
    }
    ((moom.FK)(this)).a(((long)(((java.util.Random)(((moom.FK)(this)).b)).nextLong())), ((int)(p3)), ((int)(p4)), ((moom.Fm)(p5)), ((double)(life12_59)), ((double)(life14_69)), ((double)(life16_87)));
    life18_89 = (life18_89 + ((java.util.Random)(((moom.FK)(this)).b)).nextInt(((int)(4))));
    }
    lexicalValue642_113_0 = 0;
    }
    life19_119 = lexicalValue642_113_0;
    lexical_cycle_114: while (true) {
    if (!((life19_119 < life18_89))) {
        break lexical_join_169;
    }
    life20_130 = ((((java.util.Random)(((moom.FK)(this)).b)).nextFloat() * 0x1.921fb6p1f) * 0x1.0p1f);
    life21_140 = (((((java.util.Random)(((moom.FK)(this)).b)).nextFloat() - 0x1.0p-1f) * 0x1.0p1f) / 0x1.0p3f);
    life22_150 = ((((java.util.Random)(((moom.FK)(this)).b)).nextFloat() * 0x1.0p1f) + ((java.util.Random)(((moom.FK)(this)).b)).nextFloat());
    ((moom.FK)(this)).a(((long)(((java.util.Random)(((moom.FK)(this)).b)).nextLong())), ((int)(p3)), ((int)(p4)), ((moom.Fm)(p5)), ((double)(life12_59)), ((double)(life14_69)), ((double)(life16_87)), ((float)((life22_150 * 0x1.0p1f))), ((float)(life20_130)), ((float)(life21_140)), ((int)(0)), ((int)(0)), ((double)(0x1.0p-1d)));
    life19_119 += 1;
    if (!((life9_24 != null))) {
        break lexical_join_170;
    }
    if (!((life9_24 == null))) { continue lexical_cycle_114; }
    break lexical_cycle_114;
    }
    }
    life11_38 += 1;
    }
    if (!((life9_24 == null))) { continue lexical_cycle_36; }
    break lexical_cycle_36;
    }
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic623_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic623_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic623_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic623_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic623_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic623_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic623_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic623_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic623_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic623_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic623_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic623_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic623_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic623_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic623_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic623_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic623_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic623_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic623_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d03aecf46012_invokedynamic623_54(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4492_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9694d49eb69b_invokedynamic642_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9694d49eb69b_invokedynamic642_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9694d49eb69b_invokedynamic642_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9694d49eb69b_invokedynamic642_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9694d49eb69b_invokedynamic642_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9694d49eb69b_invokedynamic642_20(int a0, long a1) throws E;
}
