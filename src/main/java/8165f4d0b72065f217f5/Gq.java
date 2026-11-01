package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Gq extends moom.FY {

private static final long c;

private static final long[] d;

private static final java.lang.Integer[] e;

private static final java.util.Map f;

public Gq() {
super();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(-3809046874564013148L)), ((long)(7772731642835956669L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(49881197501157L)))));
    f = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Gq.c ^ 62603351162400L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill795_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill795_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill795_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill795_14 = new byte[8];
    (__sourceSpill795_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill795_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation795_16 = __sourceSpill795_14;
    ((javax.crypto.Cipher)(__sourceSpill795_11)).init(((int)(__sourceSpill795_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill795_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation795_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[6];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ª·\006¬LÝæ^BôNjë\000\035ÖHP5\020G(<Àí%Á"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill795_25 = local6_life21;
        int __sourceSpill795_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill795_25)).substring(((int)(__sourceSpill795_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill795_30 = local8_life19;
        int __sourceSpill795_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill795_33 = new byte[8];
        (__sourceSpill795_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill795_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill795_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill795_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill795_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill795_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill795_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill795_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill795_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill795_34)).doFinal(((byte[])(__sourceSpill795_33)));
        (__sourceSpill795_30)[__sourceSpill795_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "2µ\035-ën6©\bÝUì¥ë$ "))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill795_38 = local6_life21;
        int __sourceSpill795_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill795_38)).substring(((int)(__sourceSpill795_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill795_43 = local8_life19;
        int __sourceSpill795_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill795_46 = new byte[8];
        (__sourceSpill795_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill795_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill795_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill795_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill795_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill795_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill795_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill795_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill795_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill795_47)).doFinal(((byte[])(__sourceSpill795_46)));
        (__sourceSpill795_43)[__sourceSpill795_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    d = ((long[])(local8_life19));
    e = ((java.lang.Integer[])(new java.lang.Integer[6]));
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4694_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Gq"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Gq.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x6BB8;
        if (e[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])f.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    f.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Gq", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Gq.e[n2] = n3;
        }
        return e[n2];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2) {
moom.DT forestValue274_20_0;
    int forestValue274_45_0;
    int forestValue274_45_1;
    int forestValue274_87_0;
    int forestValue274_89_0;
    int forestValue274_111_0;
    int forestValue274_154_0;
    int forestValue274_158_0;
    int forestValue274_183_0;
    net.minecraft.block.Block forestValue274_200_0;
    net.minecraft.block.Block forestValue274_206_0;
    net.minecraft.block.Block forestValue274_206_1;
    net.minecraft.block.Block forestValue274_211_0;
    net.minecraft.block.Block forestValue274_211_1;
    int forestValue274_227_0;
    net.minecraft.block.Block forestValue274_246_0;
    net.minecraft.block.Block forestValue274_252_0;
    net.minecraft.block.Block forestValue274_252_1;
    net.minecraft.block.Block forestValue274_257_0;
    net.minecraft.block.Block forestValue274_257_1;
    int forestValue274_283_0;
    int forestValue274_291_0;
    int forestValue274_299_0;
    int forestValue274_302_0;
    int forestValue274_302_1;
    net.minecraft.block.Block forestValue274_369_0;
    net.minecraft.block.Block forestValue274_369_1;
    net.minecraft.block.Block forestValue274_374_0;
    net.minecraft.block.Block forestValue274_374_1;
    net.minecraft.block.Block forestValue274_379_0;
    net.minecraft.block.Block forestValue274_379_1;
    int forestValue274_407_0;
    int forestValue274_411_0;
    int forestValue274_411_1;
    net.minecraft.block.Block forestValue274_432_0;
    net.minecraft.block.Block forestValue274_432_1;
    net.minecraft.block.Block forestValue274_437_0;
    net.minecraft.block.Block forestValue274_437_1;
    net.minecraft.block.Block forestValue274_442_0;
    net.minecraft.block.Block forestValue274_442_1;
    int forestValue274_470_0;
    int forestValue274_489_0;
    moom.DT spill274_0;
    int spill274_1;
    int spill274_2;
    int spill274_3;
    int spill274_4;
    int spill274_5;
    int spill274_6;
    int spill274_7;
    int spill274_8;
    int spill274_9;
    int spill274_10;
    int spill274_11;
    net.minecraft.block.Block spill274_12;
    net.minecraft.block.Block spill274_13;
    int spill274_14;
    net.minecraft.block.Block spill274_15;
    net.minecraft.block.Block spill274_16;
    int spill274_17;
    int spill274_18;
    int spill274_19;
    int spill274_20;
    int spill274_21;
    net.minecraft.block.Block spill274_22;
    net.minecraft.block.Block spill274_23;
    int spill274_24;
    net.minecraft.block.Block spill274_25;
    net.minecraft.block.Block spill274_26;
    int spill274_27;
    int spill274_28;
    int spill274_29;
    long life4_3;
    int[] life6_5;
    int life7_57;
    int life8_65;
    int life9_107;
    float life10_124;
    int life11_127;
    int life12_133;
    float life13_145;
    int life14_151;
    float life15_162;
    net.minecraft.block.Block life16_252;
    net.minecraft.block.Block life16_317;
    int life10_406;
    int life11_418;
    moom.DT life12_429;
    int life13_435;
    net.minecraft.block.Block life14_477;
    net.minecraft.block.Block life14_568;
    forest_join_489: {
    forest_join_488: {
    forest_join_299: {
    forest_join_297: {
    forest_join_291: {
    forest_join_290: {
    forest_join_283: {
    forest_join_278: {
    forest_join_87: {
    forest_join_86: {
    forest_join_45: {
    forest_join_31: {
    forest_join_23: {
    life4_3 = (moom.Gq.c ^ 55727633632701L);
    life6_5 = moom.FY.b();
    forest_cycle_6: while (true) {
    forest_join_20: {
    if (!(((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(p2))))) {
        break forest_join_23;
    }
    spill274_0 = p2;
    if (!((life6_5 != null))) {
        forestValue274_20_0 = spill274_0;
        break forest_join_20;
    }
    spill274_1 = ((moom.DT)(spill274_0)).b();
    spill274_2 = 2;
    if (!((life6_5 != null))) {
        forestValue274_45_0 = spill274_1;
        forestValue274_45_1 = spill274_2;
        break forest_join_45;
    }
    if (!((spill274_1 > spill274_2))) {
        break forest_join_23;
    }
    forestValue274_20_0 = ((moom.DT)(p2)).b__DT();
    }
    p2 = forestValue274_20_0;
    if (!((life6_5 == null))) {
        continue forest_cycle_6;
    }
    break forest_cycle_6;
    }
    }
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p2))))).a__ch() != net.minecraft.init.Blocks.aJ))) {
        break forest_join_31;
    }
    return ((0) != 0);
    }
    p2 = ((moom.DT)(p2)).a(((int)(((java.util.Random)(p1)).nextInt(((int)(4))))));
    forestValue274_45_0 = ((java.util.Random)(p1)).nextInt(((int)(4)));
    forestValue274_45_1 = __sourceIntrinsic_e7ba66b54646_invokedynamic274_12(5669, (3938502919672068322L ^ life4_3));
    }
    life7_57 = (forestValue274_45_0 + forestValue274_45_1);
    life8_65 = ((life7_57 / 4) + ((java.util.Random)(p1)).nextInt(((int)(2))));
    spill274_3 = life8_65;
    if (!((life6_5 != null))) {
        forestValue274_87_0 = spill274_3;
        break forest_join_87;
    }
    if (!((spill274_3 > 1))) {
        break forest_join_86;
    }
    spill274_4 = ((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_e7ba66b54646_invokedynamic274_14(18144, (172959209252169762L ^ life4_3)))));
    if (!((life6_5 != null))) {
        forestValue274_87_0 = spill274_4;
        break forest_join_87;
    }
    if (!((spill274_4 == 0))) {
        break forest_join_86;
    }
    p2 = ((moom.DT)(p2)).a(((int)((__sourceIntrinsic_e7ba66b54646_invokedynamic274_16(13030, (2872205760789896229L ^ life4_3)) + ((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_e7ba66b54646_invokedynamic274_17(9906, (1643741466099468406L ^ life4_3)))))))));
    }
    forestValue274_87_0 = 0;
    }
    life9_107 = forestValue274_87_0;
    forest_cycle_88: while (true) {
    forest_join_275: {
    forestValue274_89_0 = life9_107;
    forest_cycle_89: while (true) {
    if (!((forestValue274_89_0 < life7_57))) {
        break forest_join_278;
    }
    life10_124 = ((0x1.0p0f - (((float) life9_107) / ((float) life7_57))) * ((float) life8_65));
    life11_127 = moom.Dr.b__Int(((float)(life10_124)));
    spill274_5 = (-life11_127);
    if (!((life6_5 != null))) {
        forestValue274_283_0 = spill274_5;
        break forest_join_283;
    }
    life12_133 = spill274_5;
    forest_cycle_110: while (true) {
    forest_join_272: {
    forestValue274_111_0 = life12_133;
    forest_cycle_111: while (true) {
    if (!((forestValue274_111_0 <= life11_127))) {
        break forest_join_275;
    }
    life13_145 = (((float) moom.Dr.a(((int)(life12_133)))) - 0x1.0p-2f);
    spill274_6 = (-life11_127);
    if (!((life6_5 != null))) {
        forestValue274_89_0 = spill274_6;
        continue forest_cycle_89;
    }
    life14_151 = spill274_6;
    forest_cycle_124: while (true) {
    forest_join_269: {
    forest_join_258: {
    forest_join_257: {
    forest_join_252: {
    forest_join_246: {
    forest_join_227: {
    forest_join_222: {
    forest_join_212: {
    forest_join_211: {
    forest_join_206: {
    forest_join_200: {
    forest_join_184: {
    forest_join_183: {
    forest_join_179: {
    forest_join_158: {
    forest_join_157: {
    forest_join_154: {
    forest_join_143: {
    if (!((life14_151 <= life11_127))) {
        break forest_join_272;
    }
    life15_162 = (((float) moom.Dr.a(((int)(life14_151)))) - 0x1.0p-2f);
    spill274_7 = life12_133;
    if (!((life6_5 != null))) {
        forestValue274_111_0 = spill274_7;
        continue forest_cycle_111;
    }
    if (!((life6_5 != null))) {
        forestValue274_154_0 = spill274_7;
        break forest_join_154;
    }
    if (!((spill274_7 == 0))) {
        break forest_join_143;
    }
    spill274_8 = life14_151;
    if (!((life6_5 != null))) {
        forestValue274_158_0 = spill274_8;
        break forest_join_158;
    }
    if (!((spill274_8 != 0))) {
        break forest_join_157;
    }
    }
    forestValue274_154_0 = recovery.source.CarrierOps.fcmpg(((float)(((life13_145 * life13_145) + (life15_162 * life15_162)))), ((float)((life10_124 * life10_124))));
    }
    if (!((life6_5 != null))) {
        forestValue274_158_0 = forestValue274_154_0;
        break forest_join_158;
    }
    if (!((forestValue274_154_0 <= 0))) {
        break forest_join_269;
    }
    }
    forestValue274_158_0 = life12_133;
    }
    if (!((life6_5 != null))) {
        forestValue274_183_0 = forestValue274_158_0;
        break forest_join_183;
    }
    if (!((forestValue274_158_0 != (-life11_127)))) {
        break forest_join_179;
    }
    spill274_9 = life12_133;
    if (!((life6_5 != null))) {
        forestValue274_183_0 = spill274_9;
        break forest_join_183;
    }
    if (!((spill274_9 != life11_127))) {
        break forest_join_179;
    }
    spill274_10 = life14_151;
    if (!((life6_5 != null))) {
        forestValue274_183_0 = spill274_10;
        break forest_join_183;
    }
    if (!((spill274_10 != (-life11_127)))) {
        break forest_join_179;
    }
    spill274_11 = life14_151;
    if (!((life6_5 != null))) {
        forestValue274_183_0 = spill274_11;
        break forest_join_183;
    }
    if (!((spill274_11 == life11_127))) {
        break forest_join_184;
    }
    }
    forestValue274_183_0 = recovery.source.CarrierOps.fcmpg(((float)(((java.util.Random)(p1)).nextFloat())), ((float)(0x1.8p-1f)));
    }
    if (!((forestValue274_183_0 <= 0))) {
        break forest_join_269;
    }
    }
    life16_252 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p2)).a(((int)(life12_133)), ((int)(life9_107)), ((int)(life14_151)))))))).a__ch();
    spill274_12 = life16_252;
    if (!((life6_5 != null))) {
        forestValue274_200_0 = spill274_12;
        break forest_join_200;
    }
    if (!((((net.minecraft.block.Block)(spill274_12)).a__fn() != moom.fn.a))) {
        break forest_join_212;
    }
    forestValue274_200_0 = life16_252;
    }
    spill274_13 = net.minecraft.init.Blocks.d;
    if (!((life6_5 != null))) {
        forestValue274_206_0 = forestValue274_200_0;
        forestValue274_206_1 = spill274_13;
        break forest_join_206;
    }
    if (!((forestValue274_200_0 != spill274_13))) {
        break forest_join_212;
    }
    forestValue274_206_0 = life16_252;
    forestValue274_206_1 = net.minecraft.init.Blocks.aJ;
    }
    if (!((life6_5 != null))) {
        forestValue274_211_0 = forestValue274_206_0;
        forestValue274_211_1 = forestValue274_206_1;
        break forest_join_211;
    }
    if (!((forestValue274_206_0 != forestValue274_206_1))) {
        break forest_join_212;
    }
    forestValue274_211_0 = life16_252;
    forestValue274_211_1 = net.minecraft.init.Blocks.aI;
    }
    if (!((forestValue274_211_0 == forestValue274_211_1))) {
        break forest_join_222;
    }
    }
    ((moom.Gq)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(p2)).a(((int)(life12_133)), ((int)(life9_107)), ((int)(life14_151))))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cf)).a__fE())));
    }
    spill274_14 = life9_107;
    if (!((life6_5 != null))) {
        forestValue274_227_0 = spill274_14;
        break forest_join_227;
    }
    if (!((spill274_14 != 0))) {
        break forest_join_269;
    }
    forestValue274_227_0 = life11_127;
    }
    if (!((forestValue274_227_0 > 1))) {
        break forest_join_269;
    }
    life16_317 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p2)).a(((int)(life12_133)), ((int)((-life9_107))), ((int)(life14_151)))))))).a__ch();
    spill274_15 = life16_317;
    if (!((life6_5 != null))) {
        forestValue274_246_0 = spill274_15;
        break forest_join_246;
    }
    if (!((((net.minecraft.block.Block)(spill274_15)).a__fn() != moom.fn.a))) {
        break forest_join_258;
    }
    forestValue274_246_0 = life16_317;
    }
    spill274_16 = net.minecraft.init.Blocks.d;
    if (!((life6_5 != null))) {
        forestValue274_252_0 = forestValue274_246_0;
        forestValue274_252_1 = spill274_16;
        break forest_join_252;
    }
    if (!((forestValue274_246_0 != spill274_16))) {
        break forest_join_258;
    }
    forestValue274_252_0 = life16_317;
    forestValue274_252_1 = net.minecraft.init.Blocks.aJ;
    }
    if (!((life6_5 != null))) {
        forestValue274_257_0 = forestValue274_252_0;
        forestValue274_257_1 = forestValue274_252_1;
        break forest_join_257;
    }
    if (!((forestValue274_252_0 != forestValue274_252_1))) {
        break forest_join_258;
    }
    forestValue274_257_0 = life16_317;
    forestValue274_257_1 = net.minecraft.init.Blocks.aI;
    }
    if (!((forestValue274_257_0 == forestValue274_257_1))) {
        break forest_join_269;
    }
    }
    ((moom.Gq)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(p2)).a(((int)(life12_133)), ((int)((-life9_107))), ((int)(life14_151))))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cf)).a__fE())));
    }
    life14_151 += 1;
    if (!((life6_5 == null))) {
        continue forest_cycle_124;
    }
    break forest_cycle_124;
    }
    break forest_cycle_111;
    }
    }
    life12_133 += 1;
    if (!((life6_5 == null))) {
        continue forest_cycle_110;
    }
    break forest_cycle_110;
    }
    break forest_cycle_89;
    }
    }
    life9_107 += 1;
    if (!((life6_5 == null))) {
        continue forest_cycle_88;
    }
    break forest_cycle_88;
    }
    }
    life9_107 = (life8_65 - 1);
    forestValue274_283_0 = life9_107;
    }
    if (!((life6_5 != null))) {
        forestValue274_291_0 = forestValue274_283_0;
        break forest_join_291;
    }
    if (!((forestValue274_283_0 < 0))) {
        break forest_join_290;
    }
    life9_107 = 0;
    if (!((life6_5 == null))) {
        break forest_join_297;
    }
    }
    forestValue274_291_0 = life9_107;
    }
    if (!((life6_5 != null))) {
        forestValue274_299_0 = forestValue274_291_0;
        break forest_join_299;
    }
    if (!((forestValue274_291_0 > 1))) {
        break forest_join_297;
    }
    life9_107 = 1;
    }
    forestValue274_299_0 = (-life9_107);
    }
    life10_406 = forestValue274_299_0;
    forest_cycle_300: while (true) {
    forest_join_485: {
    forestValue274_302_0 = life10_406;
    forestValue274_302_1 = life9_107;
    forest_cycle_302: while (true) {
    if (!((forestValue274_302_0 <= forestValue274_302_1))) {
        break forest_join_488;
    }
    spill274_17 = (-life9_107);
    if (!((life6_5 != null))) {
        forestValue274_489_0 = spill274_17;
        break forest_join_489;
    }
    life11_418 = spill274_17;
    forest_cycle_308: while (true) {
    forest_join_483: {
    forest_join_482: {
    forest_join_411: {
    forest_join_341: {
    if (!((life11_418 <= life9_107))) {
        break forest_join_485;
    }
    life12_429 = ((moom.DT)(p2)).a(((int)(life10_406)), ((int)(-1)), ((int)(life11_418)));
    life13_435 = __sourceIntrinsic_e7ba66b54646_invokedynamic274_51(7641, (5618320642873848607L ^ life4_3));
    spill274_18 = java.lang.Math.abs(((int)(life10_406)));
    spill274_19 = 1;
    if (!((life6_5 != null))) {
        forestValue274_302_0 = spill274_18;
        forestValue274_302_1 = spill274_19;
        continue forest_cycle_302;
    }
    if (!((life6_5 != null))) {
        forestValue274_411_0 = spill274_18;
        forestValue274_411_1 = spill274_19;
        break forest_join_411;
    }
    if (!((spill274_18 == spill274_19))) {
        break forest_join_341;
    }
    spill274_20 = java.lang.Math.abs(((int)(life11_418)));
    spill274_21 = 1;
    if (!((life6_5 != null))) {
        forestValue274_411_0 = spill274_20;
        forestValue274_411_1 = spill274_21;
        break forest_join_411;
    }
    if (!((spill274_20 == spill274_21))) {
        break forest_join_341;
    }
    life13_435 = ((java.util.Random)(p1)).nextInt(((int)(5)));
    }
    forest_cycle_341: while (true) {
    forest_join_408: {
    forest_join_407: {
    forest_join_392: {
    forest_join_382: {
    forest_join_379: {
    forest_join_374: {
    forest_join_369: {
    if (!((((moom.DT)(life12_429)).b() > __sourceIntrinsic_e7ba66b54646_invokedynamic274_56(17617, (5139565636422674964L ^ life4_3))))) {
        break forest_join_482;
    }
    life14_477 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life12_429))))).a__ch();
    if (!((life6_5 != null))) {
        break forest_join_483;
    }
    if (!((life6_5 != null))) {
        break forest_join_392;
    }
    if (!((((net.minecraft.block.Block)(life14_477)).a__fn() != moom.fn.a))) {
        break forest_join_382;
    }
    spill274_22 = life14_477;
    spill274_23 = net.minecraft.init.Blocks.d;
    if (!((life6_5 != null))) {
        forestValue274_369_0 = spill274_22;
        forestValue274_369_1 = spill274_23;
        break forest_join_369;
    }
    if (!((spill274_22 != spill274_23))) {
        break forest_join_382;
    }
    forestValue274_369_0 = life14_477;
    forestValue274_369_1 = net.minecraft.init.Blocks.aJ;
    }
    if (!((life6_5 != null))) {
        forestValue274_374_0 = forestValue274_369_0;
        forestValue274_374_1 = forestValue274_369_1;
        break forest_join_374;
    }
    if (!((forestValue274_369_0 != forestValue274_369_1))) {
        break forest_join_382;
    }
    forestValue274_374_0 = life14_477;
    forestValue274_374_1 = net.minecraft.init.Blocks.aI;
    }
    if (!((life6_5 != null))) {
        forestValue274_379_0 = forestValue274_374_0;
        forestValue274_379_1 = forestValue274_374_1;
        break forest_join_379;
    }
    if (!((forestValue274_374_0 != forestValue274_374_1))) {
        break forest_join_382;
    }
    forestValue274_379_0 = life14_477;
    forestValue274_379_1 = net.minecraft.init.Blocks.cf;
    }
    if (!((forestValue274_379_0 != forestValue274_379_1))) {
        break forest_join_382;
    }
    if (!((life6_5 == null))) {
        break forest_join_482;
    }
    }
    ((moom.Gq)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(life12_429)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cf)).a__fE())));
    life12_429 = ((moom.DT)(life12_429)).b__DT();
    life13_435 += -1;
    }
    spill274_24 = life13_435;
    if (!((life6_5 != null))) {
        forestValue274_407_0 = spill274_24;
        break forest_join_407;
    }
    if (!((spill274_24 <= 0))) {
        break forest_join_408;
    }
    life12_429 = ((moom.DT)(life12_429)).b(((int)((((java.util.Random)(p1)).nextInt(((int)(5))) + 1))));
    forestValue274_407_0 = ((java.util.Random)(p1)).nextInt(((int)(5)));
    }
    life13_435 = forestValue274_407_0;
    }
    if (!((life6_5 == null))) {
        continue forest_cycle_341;
    }
    break forest_cycle_341;
    }
    break forest_join_482;
    }
    forest_cycle_411: while (true) {
    forest_join_474: {
    forest_join_471: {
    forest_join_470: {
    forest_join_455: {
    forest_join_445: {
    forest_join_442: {
    forest_join_437: {
    forest_join_432: {
    if (!((forestValue274_411_0 > forestValue274_411_1))) {
        break forest_join_482;
    }
    life14_568 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life12_429))))).a__ch();
    if (!((life6_5 != null))) {
        break forest_join_483;
    }
    if (!((life6_5 != null))) {
        break forest_join_455;
    }
    if (!((((net.minecraft.block.Block)(life14_568)).a__fn() != moom.fn.a))) {
        break forest_join_445;
    }
    spill274_25 = life14_568;
    spill274_26 = net.minecraft.init.Blocks.d;
    if (!((life6_5 != null))) {
        forestValue274_432_0 = spill274_25;
        forestValue274_432_1 = spill274_26;
        break forest_join_432;
    }
    if (!((spill274_25 != spill274_26))) {
        break forest_join_445;
    }
    forestValue274_432_0 = life14_568;
    forestValue274_432_1 = net.minecraft.init.Blocks.aJ;
    }
    if (!((life6_5 != null))) {
        forestValue274_437_0 = forestValue274_432_0;
        forestValue274_437_1 = forestValue274_432_1;
        break forest_join_437;
    }
    if (!((forestValue274_432_0 != forestValue274_432_1))) {
        break forest_join_445;
    }
    forestValue274_437_0 = life14_568;
    forestValue274_437_1 = net.minecraft.init.Blocks.aI;
    }
    if (!((life6_5 != null))) {
        forestValue274_442_0 = forestValue274_437_0;
        forestValue274_442_1 = forestValue274_437_1;
        break forest_join_442;
    }
    if (!((forestValue274_437_0 != forestValue274_437_1))) {
        break forest_join_445;
    }
    forestValue274_442_0 = life14_568;
    forestValue274_442_1 = net.minecraft.init.Blocks.cf;
    }
    if (!((forestValue274_442_0 != forestValue274_442_1))) {
        break forest_join_445;
    }
    if (!((life6_5 == null))) {
        break forest_join_482;
    }
    }
    ((moom.Gq)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(life12_429)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.cf)).a__fE())));
    life12_429 = ((moom.DT)(life12_429)).b__DT();
    life13_435 += -1;
    }
    spill274_27 = life13_435;
    if (!((life6_5 != null))) {
        forestValue274_470_0 = spill274_27;
        break forest_join_470;
    }
    if (!((spill274_27 <= 0))) {
        break forest_join_471;
    }
    life12_429 = ((moom.DT)(life12_429)).b(((int)((((java.util.Random)(p1)).nextInt(((int)(5))) + 1))));
    forestValue274_470_0 = ((java.util.Random)(p1)).nextInt(((int)(5)));
    }
    life13_435 = forestValue274_470_0;
    }
    if (!((life6_5 == null))) {
        break forest_join_474;
    }
    break forest_join_482;
    }
    spill274_28 = ((moom.DT)(life12_429)).b();
    spill274_29 = __sourceIntrinsic_e7ba66b54646_invokedynamic274_88(17617, (5139565636422674964L ^ life4_3));
    forestValue274_411_0 = spill274_28;
    forestValue274_411_1 = spill274_29;
    continue forest_cycle_411;
    }
    }
    life11_418 += 1;
    }
    if (!((life6_5 == null))) {
        continue forest_cycle_308;
    }
    break forest_cycle_308;
    }
    break forest_cycle_302;
    }
    }
    life10_406 += 1;
    if (!((life6_5 == null))) {
        continue forest_cycle_300;
    }
    break forest_cycle_300;
    }
    }
    forestValue274_489_0 = 1;
    }
    return ((forestValue274_489_0) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4694_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic274_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic274_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic274_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic274_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic274_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic274_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic274_88(int a0, long a1) throws E;
}
