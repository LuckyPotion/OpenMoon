package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class F7 extends moom.F0 {

private static final net.minecraft.block.state.IBlockState c;

private static final net.minecraft.block.state.IBlockState d;

private static final long e;

private static final long[] f;

private static final java.lang.Integer[] g;

private static final java.util.Map h;

public F7(boolean p0) {
super(p0);
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(6920864392921240161L)), ((long)(-4455489753774377788L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(167627531046722L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.F7.e ^ 40819009461551L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill732_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill732_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill732_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill732_14 = new byte[8];
    (__sourceSpill732_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill732_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation732_16 = __sourceSpill732_14;
    ((javax.crypto.Cipher)(__sourceSpill732_11)).init(((int)(__sourceSpill732_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill732_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation732_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[6];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Ø<\005*ÿ\002\037ûk\037³_¢n\027GK¾û¸¥æµ!a9xÂ­Ý"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill732_25 = local6_life21;
        int __sourceSpill732_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill732_25)).substring(((int)(__sourceSpill732_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill732_30 = local8_life19;
        int __sourceSpill732_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill732_33 = new byte[8];
        (__sourceSpill732_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill732_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill732_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill732_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill732_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill732_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill732_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill732_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill732_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill732_34)).doFinal(((byte[])(__sourceSpill732_33)));
        (__sourceSpill732_30)[__sourceSpill732_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "ö©+I\024¤óXD óV`9R"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill732_38 = local6_life21;
        int __sourceSpill732_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill732_38)).substring(((int)(__sourceSpill732_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill732_43 = local8_life19;
        int __sourceSpill732_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill732_46 = new byte[8];
        (__sourceSpill732_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill732_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill732_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill732_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill732_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill732_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill732_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill732_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill732_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill732_47)).doFinal(((byte[])(__sourceSpill732_46)));
        (__sourceSpill732_43)[__sourceSpill732_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    f = ((long[])(local8_life19));
    g = ((java.lang.Integer[])(new java.lang.Integer[6]));
    c = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.s)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.ed.S)), ((java.lang.Comparable)(net.minecraft.block.BlockPlanks$EnumType.ACACIA)))));
    d = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.dH)(net.minecraft.init.Blocks.u)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dI.W)), ((java.lang.Comparable)(net.minecraft.block.BlockPlanks$EnumType.ACACIA))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.dH.S)), ((java.lang.Comparable)(java.lang.Boolean.FALSE)))));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private void b(net.minecraft.world.World p0, moom.DT p1) {
((moom.F7)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(moom.F7.c)));
    return;
}


private void c(net.minecraft.world.World p0, moom.DT p1) {
moom.fn forwardValue1887_19_0;
    moom.fn forwardValue1887_19_1;
    int[] spill1887_0;
    moom.fn spill1887_1;
    moom.fn spill1887_2;
    long life3_3;
    moom.fn life6_10;
    int[] life5_11;
    forward_join_25: {
    forward_join_20: {
    forward_join_19: {
    life3_3 = (moom.F7.e ^ 98504930603990L);
    spill1887_0 = moom.FY.b();
    life6_10 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1))))).a__ch())).a__fn();
    life5_11 = spill1887_0;
    spill1887_1 = life6_10;
    spill1887_2 = moom.fn.a;
    if (!((life5_11 != null))) {
        forwardValue1887_19_0 = spill1887_1;
        forwardValue1887_19_1 = spill1887_2;
        break forward_join_19;
    }
    if (!((spill1887_1 != spill1887_2))) {
        break forward_join_20;
    }
    forwardValue1887_19_0 = life6_10;
    forwardValue1887_19_1 = moom.fn.j;
    }
    if (!((forwardValue1887_19_0 == forwardValue1887_19_1))) {
        break forward_join_25;
    }
    }
    ((moom.F7)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(moom.F7.d)));
    }
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4447_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/F7"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.F7.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x999;
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
                throw new RuntimeException("moom/F7", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            F7.g[n2] = n3;
        }
        return g[n2];
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2) {
int forestValue250_42_0;
    int forestValue250_72_0;
    int forestValue250_72_1;
    int forestValue250_74_0;
    int forestValue250_85_0;
    int forestValue250_100_0;
    int forestValue250_114_0;
    int forestValue250_140_0;
    int forestValue250_144_0;
    int forestValue250_155_0;
    int forestValue250_159_0;
    net.minecraft.block.Block forestValue250_173_0;
    net.minecraft.block.Block forestValue250_173_1;
    int forestValue250_237_0;
    int forestValue250_249_0;
    moom.DT forestValue250_287_0;
    int forestValue250_296_0;
    int forestValue250_296_1;
    int forestValue250_319_0;
    int forestValue250_319_1;
    int forestValue250_338_0;
    int forestValue250_394_0;
    int forestValue250_437_0;
    int forestValue250_437_1;
    int forestValue250_481_0;
    int forestValue250_499_0;
    int forestValue250_499_1;
    int forestValue250_522_0;
    int forestValue250_522_1;
    int forestValue250_541_0;
    int forestValue250_569_0;
    int forestValue250_571_0;
    int forestValue250_573_0;
    int[] spill250_0;
    int spill250_1;
    int spill250_2;
    int spill250_3;
    int spill250_4;
    int spill250_5;
    int spill250_6;
    int spill250_7;
    int spill250_8;
    boolean spill250_9;
    net.minecraft.block.Block spill250_10;
    moom.dC spill250_11;
    int spill250_12;
    moom.DT spill250_13;
    int spill250_14;
    int spill250_15;
    int spill250_16;
    int spill250_17;
    int spill250_18;
    int spill250_19;
    int spill250_20;
    int spill250_21;
    int spill250_22;
    int spill250_23;
    int spill250_24;
    int spill250_25;
    long life4_3;
    int life7_14;
    int[] life6_15;
    int life8_17;
    int life9_43;
    int life10_53;
    moom.DU life11_84;
    int life12_89;
    int life13_108;
    net.minecraft.block.Block life9_181;
    moom.bs life10_216;
    int life11_224;
    int life12_230;
    int life13_233;
    int life14_236;
    int life15_238;
    int life16_240;
    int life17_250;
    moom.DT life18_280;
    moom.fn life19_286;
    moom.DT life16_313;
    int life17_319;
    int life18_330;
    int life17_367;
    int life18_374;
    int life14_424;
    moom.bs life17_428;
    int life18_439;
    int life19_445;
    int life15_447;
    int life20_449;
    int life21_473;
    moom.DT life22_490;
    moom.fn life23_496;
    moom.DT life20_529;
    int life21_535;
    int life22_546;
    int life21_583;
    int life22_590;
    forest_join_573: {
    forest_join_572: {
    forest_join_571: {
    forest_join_570: {
    forest_join_569: {
    forest_join_568: {
    forest_join_541: {
    forest_join_537: {
    forest_join_481: {
    forest_join_480: {
    forest_join_394: {
    forest_join_365: {
    forest_join_338: {
    forest_join_334: {
    forest_join_287: {
    forest_join_281: {
    forest_join_174: {
    forest_join_173: {
    forest_join_160: {
    forest_join_159: {
    forest_join_155: {
    forest_join_154: {
    life4_3 = (moom.F7.e ^ 32596546421115L);
    spill250_0 = moom.FY.b();
    life7_14 = ((((java.util.Random)(p1)).nextInt(((int)(3))) + ((java.util.Random)(p1)).nextInt(((int)(3)))) + 5);
    life6_15 = spill250_0;
    life8_17 = 1;
    spill250_1 = ((moom.DT)(p2)).b();
    if (!((life6_15 != null))) {
        forestValue250_573_0 = spill250_1;
        break forest_join_573;
    }
    if (!((spill250_1 >= 1))) {
        break forest_join_572;
    }
    spill250_2 = ((((moom.DT)(p2)).b() + life7_14) + 1);
    if (!((life6_15 != null))) {
        forestValue250_573_0 = spill250_2;
        break forest_join_573;
    }
    if (!((spill250_2 <= __sourceIntrinsic_e7ba66b54646_invokedynamic250_6(30106, (7427824303142795640L ^ life4_3))))) {
        break forest_join_572;
    }
    life9_43 = ((moom.DT)(p2)).b();
    forest_cycle_41: while (true) {
    forest_join_151: {
    forestValue250_42_0 = life9_43;
    forest_cycle_42: while (true) {
    forest_join_75: {
    forest_join_74: {
    forest_join_72: {
    forest_join_61: {
    if (!((forestValue250_42_0 <= ((((moom.DT)(p2)).b() + 1) + life7_14)))) {
        break forest_join_154;
    }
    life10_53 = 1;
    spill250_3 = life9_43;
    if (!((life6_15 != null))) {
        forestValue250_155_0 = spill250_3;
        break forest_join_155;
    }
    spill250_4 = ((moom.DT)(p2)).b();
    if (!((life6_15 != null))) {
        forestValue250_72_0 = spill250_3;
        forestValue250_72_1 = spill250_4;
        break forest_join_72;
    }
    if (!((spill250_3 == spill250_4))) {
        break forest_join_61;
    }
    life10_53 = 0;
    }
    spill250_5 = life9_43;
    if (!((life6_15 != null))) {
        forestValue250_74_0 = spill250_5;
        break forest_join_74;
    }
    forestValue250_72_0 = spill250_5;
    forestValue250_72_1 = (((((moom.DT)(p2)).b() + 1) + life7_14) - 2);
    }
    if (!((forestValue250_72_0 >= forestValue250_72_1))) {
        break forest_join_75;
    }
    forestValue250_74_0 = 2;
    }
    life10_53 = forestValue250_74_0;
    }
    life11_84 = new moom.DU();
    life12_89 = (((moom.DT)(p2)).a() - life10_53);
    forest_cycle_84: while (true) {
    forest_join_148: {
    forestValue250_85_0 = life12_89;
    forest_cycle_85: while (true) {
    forest_join_100: {
    if (!((forestValue250_85_0 <= (((moom.DT)(p2)).a() + life10_53)))) {
        break forest_join_151;
    }
    spill250_6 = life8_17;
    if (!((life6_15 != null))) {
        forestValue250_42_0 = spill250_6;
        continue forest_cycle_42;
    }
    if (!((life6_15 != null))) {
        forestValue250_100_0 = spill250_6;
        break forest_join_100;
    }
    if (!((spill250_6 != 0))) {
        break forest_join_151;
    }
    forestValue250_100_0 = (((moom.DT)(p2)).c() - life10_53);
    }
    life13_108 = forestValue250_100_0;
    forest_cycle_101: while (true) {
    forest_join_145: {
    forest_join_144: {
    forest_join_143: {
    forest_join_140: {
    forest_join_114: {
    if (!((life13_108 <= (((moom.DT)(p2)).c() + life10_53)))) {
        break forest_join_148;
    }
    spill250_7 = life8_17;
    if (!((life6_15 != null))) {
        forestValue250_85_0 = spill250_7;
        continue forest_cycle_85;
    }
    if (!((life6_15 != null))) {
        forestValue250_114_0 = spill250_7;
        break forest_join_114;
    }
    if (!((spill250_7 != 0))) {
        break forest_join_148;
    }
    forestValue250_114_0 = life9_43;
    }
    if (!((life6_15 != null))) {
        forestValue250_144_0 = forestValue250_114_0;
        break forest_join_144;
    }
    if (!((forestValue250_114_0 >= 0))) {
        break forest_join_143;
    }
    spill250_8 = life9_43;
    if (!((life6_15 != null))) {
        forestValue250_144_0 = spill250_8;
        break forest_join_144;
    }
    if (!((spill250_8 < __sourceIntrinsic_e7ba66b54646_invokedynamic250_15(12823, (5673829067847843570L ^ life4_3))))) {
        break forest_join_143;
    }
    spill250_9 = ((moom.F7)(this)).a(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DU)(life11_84)).a(((int)(life12_89)), ((int)(life9_43)), ((int)(life13_108)))))))).a__ch())));
    if (!((life6_15 != null))) {
        forestValue250_140_0 = ((spill250_9) ? 1 : 0);
        break forest_join_140;
    }
    if (!((!spill250_9))) {
        break forest_join_145;
    }
    forestValue250_140_0 = 0;
    }
    life8_17 = forestValue250_140_0;
    if (!((life6_15 == null))) {
        break forest_join_145;
    }
    }
    forestValue250_144_0 = 0;
    }
    life8_17 = forestValue250_144_0;
    }
    life13_108 += 1;
    if (!((life6_15 == null))) {
        continue forest_cycle_101;
    }
    break forest_cycle_101;
    }
    break forest_cycle_85;
    }
    }
    life12_89 += 1;
    if (!((life6_15 == null))) {
        continue forest_cycle_84;
    }
    break forest_cycle_84;
    }
    break forest_cycle_42;
    }
    }
    life9_43 += 1;
    if (!((life6_15 == null))) {
        continue forest_cycle_41;
    }
    break forest_cycle_41;
    }
    }
    forestValue250_155_0 = life8_17;
    }
    if (!((life6_15 != null))) {
        forestValue250_159_0 = forestValue250_155_0;
        break forest_join_159;
    }
    if (!((forestValue250_155_0 == 0))) {
        break forest_join_160;
    }
    forestValue250_159_0 = 0;
    }
    return ((forestValue250_159_0) != 0);
    }
    life9_181 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p2)).b__DT()))))).a__ch();
    spill250_10 = life9_181;
    spill250_11 = net.minecraft.init.Blocks.c;
    if (!((life6_15 != null))) {
        forestValue250_173_0 = spill250_10;
        forestValue250_173_1 = spill250_11;
        break forest_join_173;
    }
    if (!((spill250_10 != spill250_11))) {
        break forest_join_174;
    }
    forestValue250_173_0 = life9_181;
    forestValue250_173_1 = net.minecraft.init.Blocks.d;
    }
    if (!((forestValue250_173_0 == forestValue250_173_1))) {
        break forest_join_570;
    }
    }
    spill250_12 = ((moom.DT)(p2)).b();
    if (!((life6_15 != null))) {
        forestValue250_571_0 = spill250_12;
        break forest_join_571;
    }
    if (!((spill250_12 < ((__sourceIntrinsic_e7ba66b54646_invokedynamic250_28(12823, (5673829067847843570L ^ life4_3)) - life7_14) - 1)))) {
        break forest_join_570;
    }
    ((moom.F7)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(p2)).b__DT())));
    life10_216 = ((net.minecraft.util.EnumFacing$Plane)(net.minecraft.util.EnumFacing$Plane.HORIZONTAL)).a(((java.util.Random)(p1)));
    life11_224 = ((life7_14 - ((java.util.Random)(p1)).nextInt(((int)(4)))) - 1);
    life12_230 = (3 - ((java.util.Random)(p1)).nextInt(((int)(3))));
    life13_233 = ((moom.DT)(p2)).a();
    life14_236 = ((moom.DT)(p2)).c();
    life15_238 = 0;
    life16_240 = 0;
    forest_cycle_221: while (true) {
    forest_join_278: {
    forest_join_276: {
    forest_join_272: {
    forest_join_251: {
    forest_join_249: {
    forest_join_237: {
    if (!((life16_240 < life7_14))) {
        break forest_join_281;
    }
    spill250_13 = p2;
    if (!((life6_15 != null))) {
        forestValue250_287_0 = spill250_13;
        break forest_join_287;
    }
    life17_250 = (((moom.DT)(spill250_13)).b() + life16_240);
    spill250_14 = life16_240;
    if (!((life6_15 != null))) {
        forestValue250_237_0 = spill250_14;
        break forest_join_237;
    }
    if (!((spill250_14 >= life11_224))) {
        break forest_join_251;
    }
    forestValue250_237_0 = life12_230;
    }
    if (!((life6_15 != null))) {
        forestValue250_249_0 = forestValue250_237_0;
        break forest_join_249;
    }
    if (!((forestValue250_237_0 > 0))) {
        break forest_join_251;
    }
    life13_233 = (life13_233 + ((moom.bs)(life10_216)).c());
    forestValue250_249_0 = (life14_236 + ((moom.bs)(life10_216)).e());
    }
    life14_236 = forestValue250_249_0;
    life12_230 += -1;
    }
    life18_280 = new moom.DT(life13_233, life17_250, life14_236);
    life19_286 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life18_280))))).a__ch())).a__fn();
    if (!((life6_15 != null))) {
        break forest_join_276;
    }
    if (!((life19_286 != moom.fn.a))) {
        break forest_join_272;
    }
    if (!((life19_286 == moom.fn.j))) {
        break forest_join_278;
    }
    }
    ((moom.F7)(this)).b(((net.minecraft.world.World)(p0)), ((moom.DT)(life18_280)));
    }
    life15_238 = life17_250;
    }
    life16_240 += 1;
    if (!((life6_15 == null))) {
        continue forest_cycle_221;
    }
    break forest_cycle_221;
    }
    }
    forestValue250_287_0 = new moom.DT(life13_233, life15_238, life14_236);
    }
    life16_313 = forestValue250_287_0;
    life17_319 = __sourceIntrinsic_e7ba66b54646_invokedynamic250_46(10741, (8479970511236539667L ^ life4_3));
    forest_cycle_294: while (true) {
    forest_join_331: {
    forestValue250_296_0 = life17_319;
    forestValue250_296_1 = 3;
    forest_cycle_296: while (true) {
    if (!((forestValue250_296_0 <= forestValue250_296_1))) {
        break forest_join_334;
    }
    spill250_15 = __sourceIntrinsic_e7ba66b54646_invokedynamic250_47(10139, (1455929570830920572L ^ life4_3));
    if (!((life6_15 != null))) {
        forestValue250_338_0 = spill250_15;
        break forest_join_338;
    }
    life18_330 = spill250_15;
    forest_cycle_305: while (true) {
    forest_join_328: {
    forest_join_320: {
    forest_join_319: {
    if (!((life18_330 <= 3))) {
        break forest_join_331;
    }
    spill250_16 = java.lang.Math.abs(((int)(life17_319)));
    spill250_17 = 3;
    if (!((life6_15 != null))) {
        forestValue250_296_0 = spill250_16;
        forestValue250_296_1 = spill250_17;
        continue forest_cycle_296;
    }
    if (!((life6_15 != null))) {
        forestValue250_319_0 = spill250_16;
        forestValue250_319_1 = spill250_17;
        break forest_join_319;
    }
    if (!((spill250_16 == spill250_17))) {
        break forest_join_320;
    }
    forestValue250_319_0 = java.lang.Math.abs(((int)(life18_330)));
    forestValue250_319_1 = 3;
    }
    if (!((forestValue250_319_0 != forestValue250_319_1))) {
        break forest_join_328;
    }
    }
    this.c(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(life16_313)).a(((int)(life17_319)), ((int)(0)), ((int)(life18_330))))));
    }
    life18_330 += 1;
    if (!((life6_15 == null))) {
        continue forest_cycle_305;
    }
    break forest_cycle_305;
    }
    break forest_cycle_296;
    }
    }
    life17_319 += 1;
    if (!((life6_15 == null))) {
        continue forest_cycle_294;
    }
    break forest_cycle_294;
    }
    }
    life16_313 = ((moom.DT)(life16_313)).a__DT();
    forestValue250_338_0 = -1;
    }
    life17_367 = forestValue250_338_0;
    forest_cycle_339: while (true) {
    forest_join_363: {
    forest_join_362: {
    if (!((life17_367 <= 1))) {
        break forest_join_365;
    }
    spill250_18 = -1;
    if (!((life6_15 != null))) {
        forestValue250_394_0 = spill250_18;
        break forest_join_394;
    }
    life18_374 = spill250_18;
    forest_cycle_346: while (true) {
    if (!((life18_374 <= 1))) {
        break forest_join_362;
    }
    this.c(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(life16_313)).a(((int)(life17_367)), ((int)(0)), ((int)(life18_374))))));
    life18_374 += 1;
    if (!((life6_15 != null))) {
        break forest_join_363;
    }
    if (!((life6_15 == null))) {
        continue forest_cycle_346;
    }
    break forest_cycle_346;
    }
    }
    life17_367 += 1;
    }
    if (!((life6_15 == null))) {
        continue forest_cycle_339;
    }
    break forest_cycle_339;
    }
    }
    this.c(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(life16_313)).f(((int)(2))))));
    this.c(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(life16_313)).e(((int)(2))))));
    this.c(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(life16_313)).d(((int)(2))))));
    this.c(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(life16_313)).c(((int)(2))))));
    life13_233 = ((moom.DT)(p2)).a();
    forestValue250_394_0 = ((moom.DT)(p2)).c();
    }
    life14_424 = forestValue250_394_0;
    life17_428 = ((net.minecraft.util.EnumFacing$Plane)(net.minecraft.util.EnumFacing$Plane.HORIZONTAL)).a(((java.util.Random)(p1)));
    if (!((life17_428 != life10_216))) {
        break forest_join_568;
    }
    life18_439 = ((life11_224 - ((java.util.Random)(p1)).nextInt(((int)(2)))) - 1);
    life19_445 = (1 + ((java.util.Random)(p1)).nextInt(((int)(3))));
    life15_447 = 0;
    life20_449 = life18_439;
    forest_cycle_420: while (true) {
    forest_join_476: {
    forest_join_474: {
    forest_join_470: {
    forest_join_437: {
    if (!((life20_449 < life7_14))) {
        break forest_join_480;
    }
    spill250_19 = life19_445;
    if (!((life6_15 != null))) {
        forestValue250_481_0 = spill250_19;
        break forest_join_481;
    }
    if (!((life6_15 != null))) {
        forestValue250_481_0 = spill250_19;
        break forest_join_481;
    }
    if (!((spill250_19 > 0))) {
        break forest_join_480;
    }
    spill250_20 = life20_449;
    spill250_21 = 1;
    if (!((life6_15 != null))) {
        forestValue250_437_0 = spill250_20;
        forestValue250_437_1 = spill250_21;
        break forest_join_437;
    }
    if (!((spill250_20 >= spill250_21))) {
        break forest_join_476;
    }
    forestValue250_437_0 = ((moom.DT)(p2)).b();
    forestValue250_437_1 = life20_449;
    }
    life21_473 = (forestValue250_437_0 + forestValue250_437_1);
    life13_233 = (life13_233 + ((moom.bs)(life17_428)).c());
    life14_424 = (life14_424 + ((moom.bs)(life17_428)).e());
    life22_490 = new moom.DT(life13_233, life21_473, life14_424);
    life23_496 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life22_490))))).a__ch())).a__fn();
    if (!((life6_15 != null))) {
        break forest_join_474;
    }
    if (!((life23_496 != moom.fn.a))) {
        break forest_join_470;
    }
    if (!((life23_496 == moom.fn.j))) {
        break forest_join_476;
    }
    }
    ((moom.F7)(this)).b(((net.minecraft.world.World)(p0)), ((moom.DT)(life22_490)));
    }
    life15_447 = life21_473;
    }
    life20_449 += 1;
    life19_445 += -1;
    if (!((life6_15 == null))) {
        continue forest_cycle_420;
    }
    break forest_cycle_420;
    }
    }
    forestValue250_481_0 = life15_447;
    }
    if (!((life6_15 != null))) {
        forestValue250_569_0 = forestValue250_481_0;
        break forest_join_569;
    }
    if (!((forestValue250_481_0 > 0))) {
        break forest_join_568;
    }
    life20_529 = new moom.DT(life13_233, life15_447, life14_424);
    life21_535 = __sourceIntrinsic_e7ba66b54646_invokedynamic250_78(25805, (3501073067677804585L ^ life4_3));
    forest_cycle_497: while (true) {
    forest_join_534: {
    forestValue250_499_0 = life21_535;
    forestValue250_499_1 = 2;
    forest_cycle_499: while (true) {
    if (!((forestValue250_499_0 <= forestValue250_499_1))) {
        break forest_join_537;
    }
    spill250_22 = __sourceIntrinsic_e7ba66b54646_invokedynamic250_79(8135, (8659055165888500516L ^ life4_3));
    if (!((life6_15 != null))) {
        forestValue250_541_0 = spill250_22;
        break forest_join_541;
    }
    life22_546 = spill250_22;
    forest_cycle_508: while (true) {
    forest_join_531: {
    forest_join_523: {
    forest_join_522: {
    if (!((life22_546 <= 2))) {
        break forest_join_534;
    }
    spill250_23 = java.lang.Math.abs(((int)(life21_535)));
    spill250_24 = 2;
    if (!((life6_15 != null))) {
        forestValue250_499_0 = spill250_23;
        forestValue250_499_1 = spill250_24;
        continue forest_cycle_499;
    }
    if (!((life6_15 != null))) {
        forestValue250_522_0 = spill250_23;
        forestValue250_522_1 = spill250_24;
        break forest_join_522;
    }
    if (!((spill250_23 == spill250_24))) {
        break forest_join_523;
    }
    forestValue250_522_0 = java.lang.Math.abs(((int)(life22_546)));
    forestValue250_522_1 = 2;
    }
    if (!((forestValue250_522_0 != forestValue250_522_1))) {
        break forest_join_531;
    }
    }
    this.c(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(life20_529)).a(((int)(life21_535)), ((int)(0)), ((int)(life22_546))))));
    }
    life22_546 += 1;
    if (!((life6_15 == null))) {
        continue forest_cycle_508;
    }
    break forest_cycle_508;
    }
    break forest_cycle_499;
    }
    }
    life21_535 += 1;
    if (!((life6_15 == null))) {
        continue forest_cycle_497;
    }
    break forest_cycle_497;
    }
    }
    life20_529 = ((moom.DT)(life20_529)).a__DT();
    forestValue250_541_0 = -1;
    }
    life21_583 = forestValue250_541_0;
    forest_cycle_542: while (true) {
    forest_join_566: {
    forest_join_565: {
    if (!((life21_583 <= 1))) {
        break forest_join_568;
    }
    spill250_25 = -1;
    if (!((life6_15 != null))) {
        forestValue250_569_0 = spill250_25;
        break forest_join_569;
    }
    life22_590 = spill250_25;
    forest_cycle_549: while (true) {
    if (!((life22_590 <= 1))) {
        break forest_join_565;
    }
    this.c(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(life20_529)).a(((int)(life21_583)), ((int)(0)), ((int)(life22_590))))));
    life22_590 += 1;
    if (!((life6_15 != null))) {
        break forest_join_566;
    }
    if (!((life6_15 == null))) {
        continue forest_cycle_549;
    }
    break forest_cycle_549;
    }
    }
    life21_583 += 1;
    }
    if (!((life6_15 == null))) {
        continue forest_cycle_542;
    }
    break forest_cycle_542;
    }
    }
    forestValue250_569_0 = 1;
    }
    return ((forestValue250_569_0) != 0);
    }
    forestValue250_571_0 = 0;
    }
    return ((forestValue250_571_0) != 0);
    }
    forestValue250_573_0 = 0;
    }
    return ((forestValue250_573_0) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4447_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic250_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic250_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic250_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic250_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic250_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic250_78(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic250_79(int a0, long a1) throws E;
}
