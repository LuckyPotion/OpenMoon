package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Fq {

private static final long a;

private static final long[] b;

private static final java.lang.Integer[] c;

private static final java.util.Map d;

public Fq() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(9211990225065217004L)), ((long)(5367814393910581652L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(67135145735244L)))));
    d = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Fq.a ^ 3509683803248L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill760_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill760_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill760_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill760_14 = new byte[8];
    (__sourceSpill760_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill760_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation760_16 = __sourceSpill760_14;
    ((javax.crypto.Cipher)(__sourceSpill760_11)).init(((int)(__sourceSpill760_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill760_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation760_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[14];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\017Q\001ëvóÇ\002¬Nx*ç6¾²Ù6¹ú^uú¹-¦¹\003£ø^n(vÞ6P£MÄÍ«Bæ÷ÀúH¹T\026§ï)Óºü\t  w]\032À\006ìô^z\035lX\035ñ_BÊÎù¼\"<"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill760_25 = local6_life21;
        int __sourceSpill760_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill760_25)).substring(((int)(__sourceSpill760_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill760_30 = local8_life19;
        int __sourceSpill760_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill760_33 = new byte[8];
        (__sourceSpill760_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill760_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill760_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill760_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill760_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill760_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill760_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill760_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill760_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill760_34)).doFinal(((byte[])(__sourceSpill760_33)));
        (__sourceSpill760_30)[__sourceSpill760_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "4ÎQÆÊÊ')Øãº,"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill760_38 = local6_life21;
        int __sourceSpill760_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill760_38)).substring(((int)(__sourceSpill760_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill760_43 = local8_life19;
        int __sourceSpill760_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill760_46 = new byte[8];
        (__sourceSpill760_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill760_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill760_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill760_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill760_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill760_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill760_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill760_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill760_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill760_47)).doFinal(((byte[])(__sourceSpill760_46)));
        (__sourceSpill760_43)[__sourceSpill760_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    b = ((long[])(local8_life19));
    c = ((java.lang.Integer[])(new java.lang.Integer[14]));
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x537B;
        if (c[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    d.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Fq", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Fq.c[n2] = n3;
        }
        return c[n2];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Fq.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4551_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Fq"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.ClassCastException a(java.lang.ClassCastException p0) {
return p0;
}


public static void a(moom.Fr p0, net.minecraft.nbt.NBTTagCompound p1, net.minecraft.world.biome.WorldChunkManager p2) {
int forestValue260_61_0;
    int forestValue260_74_0;
    int forestValue260_89_0;
    int forestValue260_102_0;
    int forestValue260_157_0;
    int forestValue260_165_0;
    int forestValue260_182_0;
    int forestValue260_365_0;
    net.minecraft.nbt.NBTTagCompound forestValue260_457_0;
    java.lang.String forestValue260_457_1;
    net.minecraft.nbt.NBTTagList forestValue260_457_2;
    int spill260_0;
    int spill260_1;
    int spill260_2;
    int spill260_3;
    int spill260_4;
    int spill260_5;
    int spill260_6;
    net.minecraft.nbt.NBTTagCompound spill260_7;
    java.lang.String spill260_8;
    net.minecraft.nbt.NBTTagList spill260_9;
    long life3_3;
    int life5_20;
    int[] life6_25;
    int life7_27;
    net.minecraft.nbt.NBTTagList life7_58;
    int life8_60;
    int life9_69;
    int life10_73;
    int life11_90;
    int life12_106;
    int life13_135;
    int life14_140;
    byte[] life10_173;
    moom.Fo life11_177;
    moom.Fo life12_181;
    moom.Fo life13_185;
    int life14_187;
    int life15_198;
    int life16_209;
    int life17_238;
    int life18_243;
    net.minecraft.nbt.NBTTagCompound life14_327;
    byte[] life8_374;
    moom.DU life9_378;
    int life10_380;
    int life11_391;
    forest_join_463: {
    forest_join_458: {
    forest_join_457: {
    forest_join_450: {
    forest_join_434: {
    forest_join_365: {
    forest_join_356: {
    forest_join_54: {
    forest_join_45: {
    life3_3 = (moom.Fq.a ^ 41854049351985L);
    ((net.minecraft.nbt.NBTTagCompound)(p1)).a__Void(((java.lang.String)("xPos")), ((int)(((moom.Fr)(p0)).k)));
    spill260_0 = moom.Fs.c();
    ((net.minecraft.nbt.NBTTagCompound)(p1)).a__Void(((java.lang.String)("zPos")), ((int)(((moom.Fr)(p0)).l)));
    ((net.minecraft.nbt.NBTTagCompound)(p1)).a(((java.lang.String)("LastUpdate")), ((long)(((moom.Fr)(p0)).a)));
    life5_20 = spill260_0;
    life6_25 = new int[(((moom.Fr)(p0)).c).length];
    life7_27 = 0;
    forest_cycle_28: while (true) {
    if (!((life7_27 < (((moom.Fr)(p0)).c).length))) {
        break forest_join_45;
    }
    (life6_25)[life7_27] = ((int)((((moom.Fr)(p0)).c)[life7_27]));
    life7_27 += 1;
    if (!((life5_20 == 0))) {
        break forest_join_54;
    }
    if (!((life5_20 != 0))) {
        continue forest_cycle_28;
    }
    break forest_cycle_28;
    }
    }
    ((net.minecraft.nbt.NBTTagCompound)(p1)).a(((java.lang.String)("HeightMap")), ((int[])(life6_25)));
    ((net.minecraft.nbt.NBTTagCompound)(p1)).a(((java.lang.String)("TerrainPopulated")), ((boolean)(((moom.Fr)(p0)).b)));
    }
    life7_58 = new net.minecraft.nbt.NBTTagList();
    life8_60 = 0;
    forest_cycle_60: while (true) {
    forest_join_353: {
    forest_join_316: {
    forestValue260_61_0 = life8_60;
    forest_cycle_61: while (true) {
    forest_join_165: {
    forest_join_157: {
    forest_join_156: {
    if (!((forestValue260_61_0 < __sourceIntrinsic_50fcc8580579_invokedynamic260_15(24926, (4210046606006687197L ^ life3_3))))) {
        break forest_join_356;
    }
    life9_69 = 1;
    spill260_1 = 0;
    if (!((life5_20 == 0))) {
        forestValue260_365_0 = spill260_1;
        break forest_join_365;
    }
    life10_73 = spill260_1;
    forest_cycle_73: while (true) {
    forest_join_153: {
    forestValue260_74_0 = life10_73;
    forest_cycle_74: while (true) {
    if (!((forestValue260_74_0 < __sourceIntrinsic_50fcc8580579_invokedynamic260_16(25563, (7191241004869621599L ^ life3_3))))) {
        break forest_join_156;
    }
    spill260_2 = life9_69;
    if (!((life5_20 == 0))) {
        forestValue260_157_0 = spill260_2;
        break forest_join_157;
    }
    if (!((life5_20 == 0))) {
        forestValue260_157_0 = spill260_2;
        break forest_join_157;
    }
    if (!((spill260_2 != 0))) {
        break forest_join_156;
    }
    life11_90 = 0;
    forest_cycle_88: while (true) {
    forest_join_150: {
    forestValue260_89_0 = life11_90;
    forest_cycle_89: while (true) {
    forest_join_102: {
    if (!((forestValue260_89_0 < __sourceIntrinsic_50fcc8580579_invokedynamic260_17(20743, (1563909635285460362L ^ life3_3))))) {
        break forest_join_153;
    }
    spill260_3 = life9_69;
    if (!((life5_20 == 0))) {
        forestValue260_74_0 = spill260_3;
        continue forest_cycle_74;
    }
    if (!((life5_20 == 0))) {
        forestValue260_102_0 = spill260_3;
        break forest_join_102;
    }
    if (!((spill260_3 != 0))) {
        break forest_join_153;
    }
    forestValue260_102_0 = 0;
    }
    life12_106 = forestValue260_102_0;
    forest_cycle_103: while (true) {
    forest_join_148: {
    forest_join_147: {
    if (!((life12_106 < __sourceIntrinsic_50fcc8580579_invokedynamic260_18(20743, (1563909635285460362L ^ life3_3))))) {
        break forest_join_150;
    }
    life13_135 = (((life10_73 << __sourceIntrinsic_50fcc8580579_invokedynamic260_19(11776, (6880501772210526860L ^ life3_3))) | (life12_106 << __sourceIntrinsic_50fcc8580579_invokedynamic260_20(7391, (8445690252748023901L ^ life3_3)))) | (life11_90 + (life8_60 << 4)));
    life14_140 = (((moom.Fr)(p0)).g)[life13_135];
    if (!((life5_20 == 0))) {
        break forest_join_148;
    }
    spill260_4 = life14_140;
    if (!((life5_20 == 0))) {
        forestValue260_89_0 = spill260_4;
        continue forest_cycle_89;
    }
    if (!((spill260_4 != 0))) {
        break forest_join_147;
    }
    life9_69 = 0;
    if (!((life5_20 != 0))) {
        break forest_join_150;
    }
    }
    life12_106 += 1;
    }
    if (!((life5_20 != 0))) {
        continue forest_cycle_103;
    }
    break forest_cycle_103;
    }
    break forest_cycle_89;
    }
    }
    life11_90 += 1;
    if (!((life5_20 != 0))) {
        continue forest_cycle_88;
    }
    break forest_cycle_88;
    }
    break forest_cycle_74;
    }
    }
    life10_73 += 1;
    if (!((life5_20 != 0))) {
        continue forest_cycle_73;
    }
    break forest_cycle_73;
    }
    }
    forestValue260_157_0 = life9_69;
    }
    if (!((life5_20 == 0))) {
        forestValue260_165_0 = forestValue260_157_0;
        break forest_join_165;
    }
    if (!((forestValue260_157_0 == 0))) {
        break forest_join_353;
    }
    forestValue260_165_0 = __sourceIntrinsic_50fcc8580579_invokedynamic260_22(19999, (3940152033346894488L ^ life3_3));
    }
    life10_173 = new byte[forestValue260_165_0];
    life11_177 = new moom.Fo();
    life12_181 = new moom.Fo();
    life13_185 = new moom.Fo();
    life14_187 = 0;
    forest_cycle_181: while (true) {
    forest_join_313: {
    forestValue260_182_0 = life14_187;
    forest_cycle_182: while (true) {
    if (!((forestValue260_182_0 < __sourceIntrinsic_50fcc8580579_invokedynamic260_23(20743, (1563909635285460362L ^ life3_3))))) {
        break forest_join_316;
    }
    spill260_5 = 0;
    if (!((life5_20 == 0))) {
        forestValue260_61_0 = spill260_5;
        continue forest_cycle_61;
    }
    life15_198 = spill260_5;
    forest_cycle_192: while (true) {
    forest_join_311: {
    forest_join_310: {
    if (!((life15_198 < __sourceIntrinsic_50fcc8580579_invokedynamic260_24(20743, (1563909635285460362L ^ life3_3))))) {
        break forest_join_313;
    }
    spill260_6 = 0;
    if (!((life5_20 == 0))) {
        forestValue260_182_0 = spill260_6;
        continue forest_cycle_182;
    }
    life16_209 = spill260_6;
    forest_cycle_203: while (true) {
    if (!((life16_209 < __sourceIntrinsic_50fcc8580579_invokedynamic260_25(20743, (1563909635285460362L ^ life3_3))))) {
        break forest_join_310;
    }
    life17_238 = (((life14_187 << __sourceIntrinsic_50fcc8580579_invokedynamic260_26(17602, (4399858651368697933L ^ life3_3))) | (life16_209 << __sourceIntrinsic_50fcc8580579_invokedynamic260_27(14930, (2319260020245253844L ^ life3_3)))) | (life15_198 + (life8_60 << 4)));
    life18_243 = (((moom.Fr)(p0)).g)[life17_238];
    (life10_173)[(((life15_198 << __sourceIntrinsic_50fcc8580579_invokedynamic260_29(29357, (6695519396825990696L ^ life3_3))) | (life16_209 << 4)) | life14_187)] = ((byte) (life18_243 & __sourceIntrinsic_50fcc8580579_invokedynamic260_30(12653, (60621611155113445L ^ life3_3))));
    ((moom.Fo)(life11_177)).a(((int)(life14_187)), ((int)(life15_198)), ((int)(life16_209)), ((int)(((moom.Fu)(((moom.Fr)(p0)).f)).a(((int)(life14_187)), ((int)((life15_198 + (life8_60 << 4)))), ((int)(life16_209))))));
    ((moom.Fo)(life12_181)).a(((int)(life14_187)), ((int)(life15_198)), ((int)(life16_209)), ((int)(((moom.Fu)(((moom.Fr)(p0)).e)).a(((int)(life14_187)), ((int)((life15_198 + (life8_60 << 4)))), ((int)(life16_209))))));
    ((moom.Fo)(life13_185)).a(((int)(life14_187)), ((int)(life15_198)), ((int)(life16_209)), ((int)(((moom.Fu)(((moom.Fr)(p0)).d)).a(((int)(life14_187)), ((int)((life15_198 + (life8_60 << 4)))), ((int)(life16_209))))));
    life16_209 += 1;
    if (!((life5_20 == 0))) {
        break forest_join_311;
    }
    if (!((life5_20 != 0))) {
        continue forest_cycle_203;
    }
    break forest_cycle_203;
    }
    }
    life15_198 += 1;
    }
    if (!((life5_20 != 0))) {
        continue forest_cycle_192;
    }
    break forest_cycle_192;
    }
    break forest_cycle_182;
    }
    }
    life14_187 += 1;
    if (!((life5_20 != 0))) {
        continue forest_cycle_181;
    }
    break forest_cycle_181;
    }
    break forest_cycle_61;
    }
    }
    life14_327 = new net.minecraft.nbt.NBTTagCompound();
    ((net.minecraft.nbt.NBTTagCompound)(life14_327)).a(((java.lang.String)("Y")), ((byte)(((byte) (life8_60 & __sourceIntrinsic_50fcc8580579_invokedynamic260_40(88, (7284152722209699025L ^ life3_3)))))));
    ((net.minecraft.nbt.NBTTagCompound)(life14_327)).a(((java.lang.String)("Blocks")), ((byte[])(life10_173)));
    ((net.minecraft.nbt.NBTTagCompound)(life14_327)).a(((java.lang.String)("Data")), ((byte[])(((moom.Fo)(life11_177)).a())));
    ((net.minecraft.nbt.NBTTagCompound)(life14_327)).a(((java.lang.String)("SkyLight")), ((byte[])(((moom.Fo)(life12_181)).a())));
    ((net.minecraft.nbt.NBTTagCompound)(life14_327)).a(((java.lang.String)("BlockLight")), ((byte[])(((moom.Fo)(life13_185)).a())));
    ((net.minecraft.nbt.NBTTagList)(life7_58)).a(((net.minecraft.nbt.NBTBase)(life14_327)));
    }
    life8_60 += 1;
    if (!((life5_20 != 0))) {
        continue forest_cycle_60;
    }
    break forest_cycle_60;
    }
    }
    ((net.minecraft.nbt.NBTTagCompound)(p1)).a(((java.lang.String)("Sections")), ((net.minecraft.nbt.NBTBase)(life7_58)));
    forestValue260_365_0 = __sourceIntrinsic_50fcc8580579_invokedynamic260_51(7166, (4772818753716154238L ^ life3_3));
    }
    life8_374 = new byte[forestValue260_365_0];
    life9_378 = new moom.DU();
    life10_380 = 0;
    forest_cycle_373: while (true) {
    forest_join_432: {
    forest_join_431: {
    if (!((life10_380 < __sourceIntrinsic_50fcc8580579_invokedynamic260_52(20743, (1563909635285460362L ^ life3_3))))) {
        break forest_join_434;
    }
    if (!((life5_20 == 0))) {
        break forest_join_450;
    }
    life11_391 = 0;
    forest_cycle_384: while (true) {
    if (!((life11_391 < __sourceIntrinsic_50fcc8580579_invokedynamic260_53(20743, (1563909635285460362L ^ life3_3))))) {
        break forest_join_431;
    }
    ((moom.DU)(life9_378)).a(((int)(((((moom.Fr)(p0)).k << 4) | life10_380))), ((int)(0)), ((int)(((((moom.Fr)(p0)).l << 4) | life11_391))));
    (life8_374)[((life11_391 << 4) | life10_380)] = ((byte) (((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.biome.WorldChunkManager)(p2)).a(((moom.DT)(life9_378)), ((net.minecraft.world.biome.BiomeGenBase)(net.minecraft.world.biome.BiomeGenBase.af))))).aB & __sourceIntrinsic_50fcc8580579_invokedynamic260_60(88, (7284152722209699025L ^ life3_3))));
    life11_391 += 1;
    if (!((life5_20 == 0))) {
        break forest_join_432;
    }
    if (!((life5_20 != 0))) {
        continue forest_cycle_384;
    }
    break forest_cycle_384;
    }
    }
    life10_380 += 1;
    }
    if (!((life5_20 != 0))) {
        continue forest_cycle_373;
    }
    break forest_cycle_373;
    }
    }
    ((net.minecraft.nbt.NBTTagCompound)(p1)).a(((java.lang.String)("Biomes")), ((byte[])(life8_374)));
    ((net.minecraft.nbt.NBTTagCompound)(p1)).a(((java.lang.String)("Entities")), ((net.minecraft.nbt.NBTBase)(((moom.Fr)(p0)).h)));
    spill260_7 = p1;
    spill260_8 = "TileEntities";
    spill260_9 = ((moom.Fr)(p0)).i;
    if (!((life5_20 == 0))) {
        forestValue260_457_0 = spill260_7;
        forestValue260_457_1 = spill260_8;
        forestValue260_457_2 = spill260_9;
        break forest_join_457;
    }
    ((net.minecraft.nbt.NBTTagCompound)(spill260_7)).a(((java.lang.String)(spill260_8)), ((net.minecraft.nbt.NBTBase)(spill260_9)));
    }
    if (!((((moom.Fr)(p0)).j != null))) {
        break forest_join_458;
    }
    forestValue260_457_0 = p1;
    forestValue260_457_1 = "TileTicks";
    forestValue260_457_2 = ((moom.Fr)(p0)).j;
    }
    ((net.minecraft.nbt.NBTTagCompound)(forestValue260_457_0)).a(((java.lang.String)(forestValue260_457_1)), ((net.minecraft.nbt.NBTBase)(forestValue260_457_2)));
    }
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        break forest_join_463;
    }
    life5_20 += 1;
    moom.Fs.b(((int)(life5_20)));
    }
    return;
}


public static moom.Fr a(net.minecraft.nbt.NBTTagCompound p0) {
long local1 = (moom.Fq.a ^ 123965675769002L);
    int local3 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("xPos")));
    int local4 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("zPos")));
    moom.Fr local5 = new moom.Fr(local3, local4);
    ((moom.Fr)(local5)).g = ((byte[])(((net.minecraft.nbt.NBTTagCompound)(p0)).a__ArrayByte(((java.lang.String)("Blocks")))));
    ((moom.Fr)(local5)).f = ((moom.Fu)(new moom.Fu(((net.minecraft.nbt.NBTTagCompound)(p0)).a__ArrayByte(((java.lang.String)("Data"))), __sourceIntrinsic_df49425b9d32_invokedynamic4553_6(14930, (2319349533358963535L ^ local1)))));
    ((moom.Fr)(local5)).e = ((moom.Fu)(new moom.Fu(((net.minecraft.nbt.NBTTagCompound)(p0)).a__ArrayByte(((java.lang.String)("SkyLight"))), __sourceIntrinsic_df49425b9d32_invokedynamic4553_9(14930, (2319349533358963535L ^ local1)))));
    ((moom.Fr)(local5)).d = ((moom.Fu)(new moom.Fu(((net.minecraft.nbt.NBTTagCompound)(p0)).a__ArrayByte(((java.lang.String)("BlockLight"))), __sourceIntrinsic_df49425b9d32_invokedynamic4553_12(14930, (2319349533358963535L ^ local1)))));
    ((moom.Fr)(local5)).c = ((byte[])(((net.minecraft.nbt.NBTTagCompound)(p0)).a__ArrayByte(((java.lang.String)("HeightMap")))));
    ((moom.Fr)(local5)).b = ((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("TerrainPopulated")))));
    ((moom.Fr)(local5)).h = ((net.minecraft.nbt.NBTTagList)(((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Entities")), ((int)(__sourceIntrinsic_df49425b9d32_invokedynamic4553_18(26789, (7681202772648290751L ^ local1)))))));
    ((moom.Fr)(local5)).i = ((net.minecraft.nbt.NBTTagList)(((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("TileEntities")), ((int)(__sourceIntrinsic_df49425b9d32_invokedynamic4553_21(18867, (2140158555686553766L ^ local1)))))));
    ((moom.Fr)(local5)).j = ((net.minecraft.nbt.NBTTagList)(((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("TileTicks")), ((int)(__sourceIntrinsic_df49425b9d32_invokedynamic4553_24(18867, (2140158555686553766L ^ local1)))))));
    try {
        ((moom.Fr)(local5)).a = ((long)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Long(((java.lang.String)("LastUpdate")))));
    } catch (java.lang.ClassCastException caught6) {
        ((moom.Fr)(local5)).a = ((long)(((long) ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("LastUpdate"))))));
    }
    return local5;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4551_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_50fcc8580579_invokedynamic260_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_50fcc8580579_invokedynamic260_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_50fcc8580579_invokedynamic260_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_50fcc8580579_invokedynamic260_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_50fcc8580579_invokedynamic260_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_50fcc8580579_invokedynamic260_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_50fcc8580579_invokedynamic260_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_50fcc8580579_invokedynamic260_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_50fcc8580579_invokedynamic260_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_50fcc8580579_invokedynamic260_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_50fcc8580579_invokedynamic260_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_50fcc8580579_invokedynamic260_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_50fcc8580579_invokedynamic260_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_50fcc8580579_invokedynamic260_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_50fcc8580579_invokedynamic260_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_50fcc8580579_invokedynamic260_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_50fcc8580579_invokedynamic260_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_50fcc8580579_invokedynamic260_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_50fcc8580579_invokedynamic260_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_df49425b9d32_invokedynamic4553_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_df49425b9d32_invokedynamic4553_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_df49425b9d32_invokedynamic4553_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_df49425b9d32_invokedynamic4553_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_df49425b9d32_invokedynamic4553_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_df49425b9d32_invokedynamic4553_24(int a0, long a1) throws E;
}
