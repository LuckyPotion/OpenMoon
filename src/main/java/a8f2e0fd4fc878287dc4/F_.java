package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class F_ extends moom.F0 {

private static final net.minecraft.block.state.IBlockState c;

private static final net.minecraft.block.state.IBlockState d;

private static final long e;

private static final long[] f;

private static final java.lang.Integer[] g;

private static final java.util.Map h;

public F_(boolean p0) {
super(p0);
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(-1701681932505811775L)), ((long)(2000840637830364593L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(167269062826046L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.F_.e ^ 133158524695345L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill538_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill538_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill538_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill538_14 = new byte[8];
    (__sourceSpill538_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill538_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation538_16 = __sourceSpill538_14;
    ((javax.crypto.Cipher)(__sourceSpill538_11)).init(((int)(__sourceSpill538_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill538_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation538_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Ü²¤ºm\007wÄ!óáðY\rÅNCÆ£ð\034"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill538_25 = local6_life21;
        int __sourceSpill538_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill538_25)).substring(((int)(__sourceSpill538_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill538_30 = local8_life19;
        int __sourceSpill538_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill538_33 = new byte[8];
        (__sourceSpill538_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill538_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill538_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill538_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill538_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill538_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill538_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill538_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill538_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill538_34)).doFinal(((byte[])(__sourceSpill538_33)));
        (__sourceSpill538_30)[__sourceSpill538_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    f = ((long[])(local8_life19));
    g = ((java.lang.Integer[])(new java.lang.Integer[3]));
    c = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.ee.S)), ((java.lang.Comparable)(net.minecraft.block.BlockPlanks$EnumType.SPRUCE)))));
    d = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.dH)(net.minecraft.init.Blocks.t)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dJ.W)), ((java.lang.Comparable)(net.minecraft.block.BlockPlanks$EnumType.SPRUCE))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.dH.S)), ((java.lang.Comparable)(java.lang.Boolean.FALSE)))));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4526_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/F_"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.F_.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x7C67;
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
                throw new RuntimeException("moom/F_", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            F_.g[n2] = n3;
        }
        return g[n2];
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2) {
int forestValue256_58_0;
    int forestValue256_86_0;
    int forestValue256_97_0;
    int forestValue256_112_0;
    int forestValue256_126_0;
    moom.fn forestValue256_156_0;
    moom.fn forestValue256_156_1;
    int forestValue256_162_0;
    int forestValue256_173_0;
    int forestValue256_177_0;
    net.minecraft.block.Block forestValue256_191_0;
    net.minecraft.block.Block forestValue256_191_1;
    net.minecraft.block.Block forestValue256_196_0;
    net.minecraft.block.Block forestValue256_196_1;
    int forestValue256_248_0;
    int forestValue256_248_1;
    int forestValue256_285_0;
    int forestValue256_285_1;
    int forestValue256_287_0;
    int forestValue256_315_0;
    int forestValue256_328_0;
    int forestValue256_328_1;
    int forestValue256_342_0;
    moom.fn forestValue256_364_0;
    moom.fn forestValue256_364_1;
    int forestValue256_378_0;
    int forestValue256_380_0;
    int[] spill256_0;
    int spill256_1;
    int spill256_2;
    int spill256_3;
    int spill256_4;
    int spill256_5;
    int spill256_6;
    int spill256_7;
    moom.fn spill256_8;
    moom.fn spill256_9;
    net.minecraft.block.Block spill256_10;
    moom.dC spill256_11;
    int spill256_12;
    int spill256_13;
    int spill256_14;
    int spill256_15;
    int spill256_16;
    int spill256_17;
    int spill256_18;
    moom.fn spill256_19;
    moom.fn spill256_20;
    long life4_3;
    int life7_13;
    int life8_20;
    int life9_24;
    int life10_30;
    int life11_32;
    int[] life6_33;
    int life12_59;
    int life13_77;
    int life13_88;
    moom.DU life14_97;
    int life15_102;
    int life16_121;
    net.minecraft.block.Block life17_159;
    net.minecraft.block.Block life12_200;
    int life13_242;
    int life14_244;
    int life15_246;
    int life16_248;
    int life17_258;
    int life18_265;
    int life19_276;
    int life20_283;
    int life21_294;
    moom.DT life22_320;
    int life17_373;
    net.minecraft.block.Block life18_385;
    forest_join_380: {
    forest_join_379: {
    forest_join_378: {
    forest_join_377: {
    forest_join_375: {
    forest_join_342: {
    forest_join_337: {
    forest_join_197: {
    forest_join_196: {
    forest_join_191: {
    forest_join_178: {
    forest_join_177: {
    forest_join_173: {
    forest_join_172: {
    life4_3 = (moom.F_.e ^ 46952149651481L);
    life7_13 = (((java.util.Random)(p1)).nextInt(((int)(4))) + __sourceIntrinsic_e7ba66b54646_invokedynamic256_2(10502, (5827859107705770015L ^ life4_3)));
    spill256_0 = moom.FY.b();
    life8_20 = (1 + ((java.util.Random)(p1)).nextInt(((int)(2))));
    life9_24 = (life7_13 - life8_20);
    life10_30 = (2 + ((java.util.Random)(p1)).nextInt(((int)(2))));
    life11_32 = 1;
    life6_33 = spill256_0;
    spill256_1 = ((moom.DT)(p2)).b();
    if (!((life6_33 != null))) {
        forestValue256_380_0 = spill256_1;
        break forest_join_380;
    }
    if (!((spill256_1 >= 1))) {
        break forest_join_379;
    }
    spill256_2 = ((((moom.DT)(p2)).b() + life7_13) + 1);
    if (!((life6_33 != null))) {
        forestValue256_380_0 = spill256_2;
        break forest_join_380;
    }
    if (!((spill256_2 <= __sourceIntrinsic_e7ba66b54646_invokedynamic256_8(7200, (2435941567475148090L ^ life4_3))))) {
        break forest_join_379;
    }
    life12_59 = ((moom.DT)(p2)).b();
    forest_cycle_57: while (true) {
    forest_join_169: {
    forestValue256_58_0 = life12_59;
    forest_cycle_58: while (true) {
    forest_join_87: {
    forest_join_86: {
    forest_join_85: {
    if (!((forestValue256_58_0 <= ((((moom.DT)(p2)).b() + 1) + life7_13)))) {
        break forest_join_172;
    }
    spill256_3 = life11_32;
    if (!((life6_33 != null))) {
        forestValue256_173_0 = spill256_3;
        break forest_join_173;
    }
    if (!((life6_33 != null))) {
        forestValue256_173_0 = spill256_3;
        break forest_join_173;
    }
    if (!((spill256_3 != 0))) {
        break forest_join_172;
    }
    life13_77 = 1;
    spill256_4 = (life12_59 - ((moom.DT)(p2)).b());
    if (!((life6_33 != null))) {
        forestValue256_86_0 = spill256_4;
        break forest_join_86;
    }
    if (!((spill256_4 < life8_20))) {
        break forest_join_85;
    }
    life13_88 = 0;
    if (!((life6_33 == null))) {
        break forest_join_87;
    }
    }
    forestValue256_86_0 = life10_30;
    }
    life13_88 = forestValue256_86_0;
    }
    life14_97 = new moom.DU();
    life15_102 = (((moom.DT)(p2)).a() - life13_88);
    forest_cycle_96: while (true) {
    forest_join_166: {
    forestValue256_97_0 = life15_102;
    forest_cycle_97: while (true) {
    forest_join_112: {
    if (!((forestValue256_97_0 <= (((moom.DT)(p2)).a() + life13_88)))) {
        break forest_join_169;
    }
    spill256_5 = life11_32;
    if (!((life6_33 != null))) {
        forestValue256_58_0 = spill256_5;
        continue forest_cycle_58;
    }
    if (!((life6_33 != null))) {
        forestValue256_112_0 = spill256_5;
        break forest_join_112;
    }
    if (!((spill256_5 != 0))) {
        break forest_join_169;
    }
    forestValue256_112_0 = (((moom.DT)(p2)).c() - life13_88);
    }
    life16_121 = forestValue256_112_0;
    forest_cycle_113: while (true) {
    forest_join_163: {
    forest_join_162: {
    forest_join_161: {
    forest_join_159: {
    forest_join_156: {
    forest_join_126: {
    if (!((life16_121 <= (((moom.DT)(p2)).c() + life13_88)))) {
        break forest_join_166;
    }
    spill256_6 = life11_32;
    if (!((life6_33 != null))) {
        forestValue256_97_0 = spill256_6;
        continue forest_cycle_97;
    }
    if (!((life6_33 != null))) {
        forestValue256_126_0 = spill256_6;
        break forest_join_126;
    }
    if (!((spill256_6 != 0))) {
        break forest_join_166;
    }
    forestValue256_126_0 = life12_59;
    }
    if (!((life6_33 != null))) {
        forestValue256_162_0 = forestValue256_126_0;
        break forest_join_162;
    }
    if (!((forestValue256_126_0 >= 0))) {
        break forest_join_161;
    }
    spill256_7 = life12_59;
    if (!((life6_33 != null))) {
        forestValue256_162_0 = spill256_7;
        break forest_join_162;
    }
    if (!((spill256_7 < __sourceIntrinsic_e7ba66b54646_invokedynamic256_16(31478, (5491818456818680814L ^ life4_3))))) {
        break forest_join_161;
    }
    life17_159 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DU)(life14_97)).a(((int)(life15_102)), ((int)(life12_59)), ((int)(life16_121)))))))).a__ch();
    spill256_8 = ((net.minecraft.block.Block)(life17_159)).a__fn();
    spill256_9 = moom.fn.a;
    if (!((life6_33 != null))) {
        forestValue256_156_0 = spill256_8;
        forestValue256_156_1 = spill256_9;
        break forest_join_156;
    }
    if (!((spill256_8 != spill256_9))) {
        break forest_join_159;
    }
    forestValue256_156_0 = ((net.minecraft.block.Block)(life17_159)).a__fn();
    forestValue256_156_1 = moom.fn.j;
    }
    if (!((forestValue256_156_0 != forestValue256_156_1))) {
        break forest_join_159;
    }
    life11_32 = 0;
    }
    if (!((life6_33 == null))) {
        break forest_join_163;
    }
    }
    forestValue256_162_0 = 0;
    }
    life11_32 = forestValue256_162_0;
    }
    life16_121 += 1;
    if (!((life6_33 == null))) {
        continue forest_cycle_113;
    }
    break forest_cycle_113;
    }
    break forest_cycle_97;
    }
    }
    life15_102 += 1;
    if (!((life6_33 == null))) {
        continue forest_cycle_96;
    }
    break forest_cycle_96;
    }
    break forest_cycle_58;
    }
    }
    life12_59 += 1;
    if (!((life6_33 == null))) {
        continue forest_cycle_57;
    }
    break forest_cycle_57;
    }
    }
    forestValue256_173_0 = life11_32;
    }
    if (!((life6_33 != null))) {
        forestValue256_177_0 = forestValue256_173_0;
        break forest_join_177;
    }
    if (!((forestValue256_173_0 == 0))) {
        break forest_join_178;
    }
    forestValue256_177_0 = 0;
    }
    return ((forestValue256_177_0) != 0);
    }
    life12_200 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p2)).b__DT()))))).a__ch();
    spill256_10 = life12_200;
    spill256_11 = net.minecraft.init.Blocks.c;
    if (!((life6_33 != null))) {
        forestValue256_191_0 = spill256_10;
        forestValue256_191_1 = spill256_11;
        break forest_join_191;
    }
    if (!((spill256_10 != spill256_11))) {
        break forest_join_197;
    }
    forestValue256_191_0 = life12_200;
    forestValue256_191_1 = net.minecraft.init.Blocks.d;
    }
    if (!((life6_33 != null))) {
        forestValue256_196_0 = forestValue256_191_0;
        forestValue256_196_1 = forestValue256_191_1;
        break forest_join_196;
    }
    if (!((forestValue256_191_0 != forestValue256_191_1))) {
        break forest_join_197;
    }
    forestValue256_196_0 = life12_200;
    forestValue256_196_1 = net.minecraft.init.Blocks.ak;
    }
    if (!((forestValue256_196_0 == forestValue256_196_1))) {
        break forest_join_377;
    }
    }
    spill256_12 = ((moom.DT)(p2)).b();
    if (!((life6_33 != null))) {
        forestValue256_378_0 = spill256_12;
        break forest_join_378;
    }
    if (!((spill256_12 < ((__sourceIntrinsic_e7ba66b54646_invokedynamic256_32(31478, (5491818456818680814L ^ life4_3)) - life7_13) - 1)))) {
        break forest_join_377;
    }
    ((moom.F_)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(p2)).b__DT())));
    life13_242 = ((java.util.Random)(p1)).nextInt(((int)(2)));
    life14_244 = 1;
    life15_246 = 0;
    life16_248 = 0;
    forest_cycle_226: while (true) {
    forest_join_335: {
    forest_join_334: {
    forest_join_333: {
    forest_join_328: {
    forest_join_315: {
    forest_join_314: {
    if (!((life16_248 <= life9_24))) {
        break forest_join_337;
    }
    life17_258 = ((((moom.DT)(p2)).b() + life7_13) - life16_248);
    spill256_13 = (((moom.DT)(p2)).a() - life13_242);
    if (!((life6_33 != null))) {
        forestValue256_342_0 = spill256_13;
        break forest_join_342;
    }
    life18_265 = spill256_13;
    forest_cycle_243: while (true) {
    forest_join_311: {
    forestValue256_248_0 = life18_265;
    forestValue256_248_1 = (((moom.DT)(p2)).a() + life13_242);
    forest_cycle_248: while (true) {
    if (!((forestValue256_248_0 <= forestValue256_248_1))) {
        break forest_join_314;
    }
    life19_276 = (life18_265 - ((moom.DT)(p2)).a());
    spill256_14 = (((moom.DT)(p2)).c() - life13_242);
    if (!((life6_33 != null))) {
        forestValue256_315_0 = spill256_14;
        break forest_join_315;
    }
    life20_283 = spill256_14;
    forest_cycle_261: while (true) {
    forest_join_309: {
    forest_join_308: {
    forest_join_288: {
    forest_join_287: {
    forest_join_285: {
    if (!((life20_283 <= (((moom.DT)(p2)).c() + life13_242)))) {
        break forest_join_311;
    }
    life21_294 = (life20_283 - ((moom.DT)(p2)).c());
    spill256_15 = java.lang.Math.abs(((int)(life19_276)));
    spill256_16 = life13_242;
    if (!((life6_33 != null))) {
        forestValue256_248_0 = spill256_15;
        forestValue256_248_1 = spill256_16;
        continue forest_cycle_248;
    }
    if (!((life6_33 != null))) {
        forestValue256_285_0 = spill256_15;
        forestValue256_285_1 = spill256_16;
        break forest_join_285;
    }
    if (!((spill256_15 == spill256_16))) {
        break forest_join_288;
    }
    spill256_17 = java.lang.Math.abs(((int)(life21_294)));
    if (!((life6_33 != null))) {
        forestValue256_287_0 = spill256_17;
        break forest_join_287;
    }
    forestValue256_285_0 = spill256_17;
    forestValue256_285_1 = life13_242;
    }
    if (!((forestValue256_285_0 == forestValue256_285_1))) {
        break forest_join_288;
    }
    forestValue256_287_0 = life13_242;
    }
    if (!((forestValue256_287_0 <= 0))) {
        break forest_join_308;
    }
    }
    life22_320 = new moom.DT(life18_265, life17_258, life20_283);
    if (!((life6_33 != null))) {
        break forest_join_309;
    }
    if (!((!((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life22_320))))).a__ch())).a__Boolean()))) {
        break forest_join_308;
    }
    ((moom.F_)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(life22_320)), ((net.minecraft.block.state.IBlockState)(moom.F_.d)));
    }
    life20_283 += 1;
    }
    if (!((life6_33 == null))) {
        continue forest_cycle_261;
    }
    break forest_cycle_261;
    }
    break forest_cycle_248;
    }
    }
    life18_265 += 1;
    if (!((life6_33 == null))) {
        continue forest_cycle_243;
    }
    break forest_cycle_243;
    }
    }
    forestValue256_315_0 = life13_242;
    }
    spill256_18 = life14_244;
    if (!((life6_33 != null))) {
        forestValue256_328_0 = forestValue256_315_0;
        forestValue256_328_1 = spill256_18;
        break forest_join_328;
    }
    if (!((forestValue256_315_0 >= spill256_18))) {
        break forest_join_333;
    }
    life13_242 = life15_246;
    life15_246 = 1;
    life14_244 += 1;
    if (!((life6_33 != null))) {
        break forest_join_335;
    }
    forestValue256_328_0 = life14_244;
    forestValue256_328_1 = life10_30;
    }
    if (!((forestValue256_328_0 > forestValue256_328_1))) {
        break forest_join_334;
    }
    life14_244 = life10_30;
    if (!((life6_33 == null))) {
        break forest_join_334;
    }
    }
    life13_242 += 1;
    }
    life16_248 += 1;
    }
    if (!((life6_33 == null))) {
        continue forest_cycle_226;
    }
    break forest_cycle_226;
    }
    }
    life16_248 = ((java.util.Random)(p1)).nextInt(((int)(3)));
    forestValue256_342_0 = 0;
    }
    life17_373 = forestValue256_342_0;
    forest_cycle_343: while (true) {
    forest_join_372: {
    forest_join_365: {
    forest_join_364: {
    if (!((life17_373 < (life7_13 - life16_248)))) {
        break forest_join_375;
    }
    life18_385 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p2)).a(((int)(life17_373)))))))).a__ch();
    spill256_19 = ((net.minecraft.block.Block)(life18_385)).a__fn();
    spill256_20 = moom.fn.a;
    if (!((life6_33 != null))) {
        forestValue256_364_0 = spill256_19;
        forestValue256_364_1 = spill256_20;
        break forest_join_364;
    }
    if (!((spill256_19 != spill256_20))) {
        break forest_join_365;
    }
    forestValue256_364_0 = ((net.minecraft.block.Block)(life18_385)).a__fn();
    forestValue256_364_1 = moom.fn.j;
    }
    if (!((forestValue256_364_0 == forestValue256_364_1))) {
        break forest_join_372;
    }
    }
    ((moom.F_)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(p2)).a(((int)(life17_373))))), ((net.minecraft.block.state.IBlockState)(moom.F_.c)));
    }
    life17_373 += 1;
    if (!((life6_33 == null))) {
        continue forest_cycle_343;
    }
    break forest_cycle_343;
    }
    }
    return ((1) != 0);
    }
    forestValue256_378_0 = 0;
    }
    return ((forestValue256_378_0) != 0);
    }
    forestValue256_380_0 = 0;
    }
    return ((forestValue256_380_0) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4526_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic256_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic256_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic256_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic256_32(int a0, long a1) throws E;
}
