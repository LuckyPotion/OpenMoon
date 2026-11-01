package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Ga extends moom.F0 {

private static final net.minecraft.block.state.IBlockState c;

private static final net.minecraft.block.state.IBlockState d;

private final int e;

private final boolean f;

private final net.minecraft.block.state.IBlockState g;

private final net.minecraft.block.state.IBlockState h;

private static final long l;

private static final long[] m;

private static final java.lang.Integer[] n;

private static final java.util.Map o;

public Ga(boolean p0) {
this(p0, 4, moom.Ga.c, moom.Ga.d, false);
}


public Ga(boolean p0, int p1, net.minecraft.block.state.IBlockState p2, net.minecraft.block.state.IBlockState p3, boolean p4) {
super(p0);
    this.e = p1;
    this.g = p2;
    this.h = p3;
    this.f = p4;
}


static {
l = ((long)(((moom._a)(moom._c.a(((long)(7908577989977383510L)), ((long)(-509966254459720344L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(55890236308714L)))));
    o = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Ga.l ^ 120284530613281L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill556_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill556_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill556_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill556_14 = new byte[8];
    (__sourceSpill556_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill556_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation556_16 = __sourceSpill556_14;
    ((javax.crypto.Cipher)(__sourceSpill556_11)).init(((int)(__sourceSpill556_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill556_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation556_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "OÿRr¡\bY;>ÅáG"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill556_25 = local6_life21;
        int __sourceSpill556_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill556_25)).substring(((int)(__sourceSpill556_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill556_30 = local8_life19;
        int __sourceSpill556_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill556_33 = new byte[8];
        (__sourceSpill556_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill556_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill556_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill556_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill556_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill556_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill556_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill556_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill556_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill556_34)).doFinal(((byte[])(__sourceSpill556_33)));
        (__sourceSpill556_30)[__sourceSpill556_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    m = ((long[])(local8_life19));
    n = ((java.lang.Integer[])(new java.lang.Integer[2]));
    c = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.ee.S)), ((java.lang.Comparable)(net.minecraft.block.BlockPlanks$EnumType.OAK)))));
    d = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.dH)(net.minecraft.init.Blocks.t)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dJ.W)), ((java.lang.Comparable)(net.minecraft.block.BlockPlanks$EnumType.OAK))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.dH.S)), ((java.lang.Comparable)(java.lang.Boolean.FALSE)))));
}


private void b(net.minecraft.world.World p0, moom.DT p1, moom.fv p2) {
int[] spill701_0;
    long life4_3;
    int life7_11;
    int[] life6_12;
    moom.DT life2_15;
    lexical_join_36: {
    life4_3 = (moom.Ga.l ^ 91844014458457L);
    ((moom.Ga)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((moom.fv)(p2)));
    spill701_0 = moom.FY.b();
    life7_11 = 4;
    life6_12 = spill701_0;
    life2_15 = ((moom.DT)(p1)).b__DT();
    lexical_cycle_16: while (true) {
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life2_15))))).a__ch())).a__fn() == moom.fn.a))) {
        break lexical_join_36;
    }
    if (!((life7_11 > 0))) {
        break lexical_join_36;
    }
    ((moom.Ga)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(life2_15)), ((moom.fv)(p2)));
    life2_15 = ((moom.DT)(life2_15)).b__DT();
    life7_11 += -1;
    if (!((life6_12 == null))) { continue lexical_cycle_16; }
    break lexical_cycle_16;
    }
    }
    return;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4667_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Ga"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_0f1bf2c76c0077(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x5FE7;
        if (Ga.n[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = m[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])o.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    o.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Ga", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Ga.n[n2] = n3;
        }
        return Ga.n[n2];
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2) {
int forestValue268_39_0;
    int forestValue268_69_0;
    int forestValue268_69_1;
    int forestValue268_71_0;
    int forestValue268_82_0;
    int forestValue268_97_0;
    int forestValue268_111_0;
    int forestValue268_137_0;
    int forestValue268_141_0;
    int forestValue268_152_0;
    int forestValue268_156_0;
    net.minecraft.block.Block forestValue268_170_0;
    net.minecraft.block.Block forestValue268_170_1;
    net.minecraft.block.Block forestValue268_175_0;
    net.minecraft.block.Block forestValue268_175_1;
    int forestValue268_207_0;
    int forestValue268_239_0;
    int forestValue268_239_1;
    int forestValue268_276_0;
    int forestValue268_276_1;
    int forestValue268_280_0;
    int forestValue268_284_0;
    moom.fn forestValue268_306_0;
    moom.fn forestValue268_306_1;
    moom.fn forestValue268_312_0;
    moom.fn forestValue268_312_1;
    int forestValue268_329_0;
    moom.fn forestValue268_357_0;
    moom.fn forestValue268_357_1;
    int forestValue268_378_0;
    int forestValue268_403_0;
    int forestValue268_428_0;
    int forestValue268_453_0;
    int forestValue268_463_0;
    int forestValue268_489_0;
    int forestValue268_587_0;
    int forestValue268_605_0;
    int forestValue268_623_0;
    int forestValue268_648_0;
    int forestValue268_659_0;
    int forestValue268_706_0;
    int forestValue268_708_0;
    int forestValue268_710_0;
    int[] spill268_0;
    int spill268_1;
    int spill268_2;
    int spill268_3;
    int spill268_4;
    int spill268_5;
    int spill268_6;
    int spill268_7;
    int spill268_8;
    boolean spill268_9;
    net.minecraft.block.Block spill268_10;
    moom.dC spill268_11;
    int spill268_12;
    int spill268_13;
    int spill268_14;
    int spill268_15;
    int spill268_16;
    int spill268_17;
    moom.fn spill268_18;
    moom.fn spill268_19;
    moom.fn spill268_20;
    moom.fn spill268_21;
    int spill268_22;
    boolean spill268_23;
    boolean spill268_24;
    boolean spill268_25;
    boolean spill268_26;
    int spill268_27;
    int spill268_28;
    int spill268_29;
    int spill268_30;
    int spill268_31;
    long life4_3;
    int life7_10;
    int life8_13;
    int[] life6_14;
    int life9_40;
    int life10_50;
    moom.DU life11_81;
    int life12_86;
    int life13_105;
    net.minecraft.block.Block life9_178;
    int life10_218;
    int life11_220;
    int life12_227;
    int life13_240;
    int life14_248;
    int life15_255;
    int life16_266;
    int life17_273;
    int life18_284;
    moom.DT life19_318;
    net.minecraft.block.Block life20_323;
    int life12_361;
    net.minecraft.block.Block life13_371;
    int life12_545;
    int life13_558;
    int life14_564;
    moom.DU life15_568;
    int life16_575;
    int life17_588;
    moom.DT life18_616;
    moom.DT life19_619;
    moom.DT life20_622;
    moom.DT life21_625;
    int life12_731;
    java.util.Iterator life13_737;
    moom.bs life14_744;
    moom.bs life15_755;
    forest_join_710: {
    forest_join_709: {
    forest_join_708: {
    forest_join_707: {
    forest_join_706: {
    forest_join_705: {
    forest_join_648: {
    forest_join_645: {
    forest_join_476: {
    forest_join_329: {
    forest_join_328: {
    forest_join_176: {
    forest_join_175: {
    forest_join_170: {
    forest_join_157: {
    forest_join_156: {
    forest_join_152: {
    forest_join_151: {
    life4_3 = (moom.Ga.l ^ 7770993843503L);
    life7_10 = (((java.util.Random)(p1)).nextInt(((int)(3))) + this.e);
    spill268_0 = moom.FY.b();
    life8_13 = 1;
    life6_14 = spill268_0;
    spill268_1 = ((moom.DT)(p2)).b();
    if (!((life6_14 != null))) {
        forestValue268_710_0 = spill268_1;
        break forest_join_710;
    }
    if (!((spill268_1 >= 1))) {
        break forest_join_709;
    }
    spill268_2 = ((((moom.DT)(p2)).b() + life7_10) + 1);
    if (!((life6_14 != null))) {
        forestValue268_710_0 = spill268_2;
        break forest_join_710;
    }
    if (!((spill268_2 <= __sourceIntrinsic_e7ba66b54646_invokedynamic268_6(30998, (1371408111622693775L ^ life4_3))))) {
        break forest_join_709;
    }
    life9_40 = ((moom.DT)(p2)).b();
    forest_cycle_38: while (true) {
    forest_join_148: {
    forestValue268_39_0 = life9_40;
    forest_cycle_39: while (true) {
    forest_join_72: {
    forest_join_71: {
    forest_join_69: {
    forest_join_58: {
    if (!((forestValue268_39_0 <= ((((moom.DT)(p2)).b() + 1) + life7_10)))) {
        break forest_join_151;
    }
    life10_50 = 1;
    spill268_3 = life9_40;
    if (!((life6_14 != null))) {
        forestValue268_152_0 = spill268_3;
        break forest_join_152;
    }
    spill268_4 = ((moom.DT)(p2)).b();
    if (!((life6_14 != null))) {
        forestValue268_69_0 = spill268_3;
        forestValue268_69_1 = spill268_4;
        break forest_join_69;
    }
    if (!((spill268_3 == spill268_4))) {
        break forest_join_58;
    }
    life10_50 = 0;
    }
    spill268_5 = life9_40;
    if (!((life6_14 != null))) {
        forestValue268_71_0 = spill268_5;
        break forest_join_71;
    }
    forestValue268_69_0 = spill268_5;
    forestValue268_69_1 = (((((moom.DT)(p2)).b() + 1) + life7_10) - 2);
    }
    if (!((forestValue268_69_0 >= forestValue268_69_1))) {
        break forest_join_72;
    }
    forestValue268_71_0 = 2;
    }
    life10_50 = forestValue268_71_0;
    }
    life11_81 = new moom.DU();
    life12_86 = (((moom.DT)(p2)).a() - life10_50);
    forest_cycle_81: while (true) {
    forest_join_145: {
    forestValue268_82_0 = life12_86;
    forest_cycle_82: while (true) {
    forest_join_97: {
    if (!((forestValue268_82_0 <= (((moom.DT)(p2)).a() + life10_50)))) {
        break forest_join_148;
    }
    spill268_6 = life8_13;
    if (!((life6_14 != null))) {
        forestValue268_39_0 = spill268_6;
        continue forest_cycle_39;
    }
    if (!((life6_14 != null))) {
        forestValue268_97_0 = spill268_6;
        break forest_join_97;
    }
    if (!((spill268_6 != 0))) {
        break forest_join_148;
    }
    forestValue268_97_0 = (((moom.DT)(p2)).c() - life10_50);
    }
    life13_105 = forestValue268_97_0;
    forest_cycle_98: while (true) {
    forest_join_142: {
    forest_join_141: {
    forest_join_140: {
    forest_join_137: {
    forest_join_111: {
    if (!((life13_105 <= (((moom.DT)(p2)).c() + life10_50)))) {
        break forest_join_145;
    }
    spill268_7 = life8_13;
    if (!((life6_14 != null))) {
        forestValue268_82_0 = spill268_7;
        continue forest_cycle_82;
    }
    if (!((life6_14 != null))) {
        forestValue268_111_0 = spill268_7;
        break forest_join_111;
    }
    if (!((spill268_7 != 0))) {
        break forest_join_145;
    }
    forestValue268_111_0 = life9_40;
    }
    if (!((life6_14 != null))) {
        forestValue268_141_0 = forestValue268_111_0;
        break forest_join_141;
    }
    if (!((forestValue268_111_0 >= 0))) {
        break forest_join_140;
    }
    spill268_8 = life9_40;
    if (!((life6_14 != null))) {
        forestValue268_141_0 = spill268_8;
        break forest_join_141;
    }
    if (!((spill268_8 < __sourceIntrinsic_e7ba66b54646_invokedynamic268_15(18868, (6101585143656059692L ^ life4_3))))) {
        break forest_join_140;
    }
    spill268_9 = ((moom.Ga)(this)).a(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(__sourceExactCall_a52b8c6f715869(((moom.DU)(life11_81)), ((int)(life12_86)), ((int)(life9_40)), ((int)(life13_105)))))))).a__ch())));
    if (!((life6_14 != null))) {
        forestValue268_137_0 = ((spill268_9) ? 1 : 0);
        break forest_join_137;
    }
    if (!((!spill268_9))) {
        break forest_join_142;
    }
    forestValue268_137_0 = 0;
    }
    life8_13 = forestValue268_137_0;
    if (!((life6_14 == null))) {
        break forest_join_142;
    }
    }
    forestValue268_141_0 = 0;
    }
    life8_13 = forestValue268_141_0;
    }
    life13_105 += 1;
    if (!((life6_14 == null))) {
        continue forest_cycle_98;
    }
    break forest_cycle_98;
    }
    break forest_cycle_82;
    }
    }
    life12_86 += 1;
    if (!((life6_14 == null))) {
        continue forest_cycle_81;
    }
    break forest_cycle_81;
    }
    break forest_cycle_39;
    }
    }
    life9_40 += 1;
    if (!((life6_14 == null))) {
        continue forest_cycle_38;
    }
    break forest_cycle_38;
    }
    }
    forestValue268_152_0 = life8_13;
    }
    if (!((life6_14 != null))) {
        forestValue268_156_0 = forestValue268_152_0;
        break forest_join_156;
    }
    if (!((forestValue268_152_0 == 0))) {
        break forest_join_157;
    }
    forestValue268_156_0 = 0;
    }
    return ((forestValue268_156_0) != 0);
    }
    life9_178 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p2)).b__DT()))))).a__ch();
    spill268_10 = life9_178;
    spill268_11 = net.minecraft.init.Blocks.c;
    if (!((life6_14 != null))) {
        forestValue268_170_0 = spill268_10;
        forestValue268_170_1 = spill268_11;
        break forest_join_170;
    }
    if (!((spill268_10 != spill268_11))) {
        break forest_join_176;
    }
    forestValue268_170_0 = life9_178;
    forestValue268_170_1 = net.minecraft.init.Blocks.d;
    }
    if (!((life6_14 != null))) {
        forestValue268_175_0 = forestValue268_170_0;
        forestValue268_175_1 = forestValue268_170_1;
        break forest_join_175;
    }
    if (!((forestValue268_170_0 != forestValue268_170_1))) {
        break forest_join_176;
    }
    forestValue268_175_0 = life9_178;
    forestValue268_175_1 = net.minecraft.init.Blocks.ak;
    }
    if (!((forestValue268_175_0 == forestValue268_175_1))) {
        break forest_join_707;
    }
    }
    spill268_12 = ((moom.DT)(p2)).b();
    if (!((life6_14 != null))) {
        forestValue268_708_0 = spill268_12;
        break forest_join_708;
    }
    if (!((spill268_12 < ((__sourceIntrinsic_e7ba66b54646_invokedynamic268_29(18868, (6101585143656059692L ^ life4_3)) - life7_10) - 1)))) {
        break forest_join_707;
    }
    ((moom.Ga)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(p2)).b__DT())));
    life10_218 = 3;
    life11_220 = 0;
    life12_227 = ((((moom.DT)(p2)).b() - life10_218) + life7_10);
    forest_cycle_206: while (true) {
    forest_join_325: {
    forestValue268_207_0 = life12_227;
    forest_cycle_207: while (true) {
    if (!((forestValue268_207_0 <= (((moom.DT)(p2)).b() + life7_10)))) {
        break forest_join_328;
    }
    life13_240 = (life12_227 - (((moom.DT)(p2)).b() + life7_10));
    life14_248 = ((life11_220 + 1) - (life13_240 / 2));
    spill268_13 = (((moom.DT)(p2)).a() - life14_248);
    if (!((life6_14 != null))) {
        forestValue268_329_0 = spill268_13;
        break forest_join_329;
    }
    life15_255 = spill268_13;
    forest_cycle_234: while (true) {
    forest_join_322: {
    forestValue268_239_0 = life15_255;
    forestValue268_239_1 = (((moom.DT)(p2)).a() + life14_248);
    forest_cycle_239: while (true) {
    if (!((forestValue268_239_0 <= forestValue268_239_1))) {
        break forest_join_325;
    }
    life16_266 = (life15_255 - ((moom.DT)(p2)).a());
    spill268_14 = (((moom.DT)(p2)).c() - life14_248);
    if (!((life6_14 != null))) {
        forestValue268_207_0 = spill268_14;
        continue forest_cycle_207;
    }
    life17_273 = spill268_14;
    forest_cycle_252: while (true) {
    forest_join_319: {
    forest_join_313: {
    forest_join_312: {
    forest_join_306: {
    forest_join_285: {
    forest_join_284: {
    forest_join_280: {
    forest_join_276: {
    if (!((life17_273 <= (((moom.DT)(p2)).c() + life14_248)))) {
        break forest_join_322;
    }
    life18_284 = (life17_273 - ((moom.DT)(p2)).c());
    spill268_15 = java.lang.Math.abs(((int)(life16_266)));
    spill268_16 = life14_248;
    if (!((life6_14 != null))) {
        forestValue268_239_0 = spill268_15;
        forestValue268_239_1 = spill268_16;
        continue forest_cycle_239;
    }
    if (!((life6_14 != null))) {
        forestValue268_276_0 = spill268_15;
        forestValue268_276_1 = spill268_16;
        break forest_join_276;
    }
    if (!((spill268_15 == spill268_16))) {
        break forest_join_285;
    }
    spill268_17 = java.lang.Math.abs(((int)(life18_284)));
    if (!((life6_14 != null))) {
        forestValue268_280_0 = spill268_17;
        break forest_join_280;
    }
    forestValue268_276_0 = spill268_17;
    forestValue268_276_1 = life14_248;
    }
    if (!((forestValue268_276_0 == forestValue268_276_1))) {
        break forest_join_285;
    }
    forestValue268_280_0 = ((java.util.Random)(p1)).nextInt(((int)(2)));
    }
    if (!((life6_14 != null))) {
        forestValue268_284_0 = forestValue268_280_0;
        break forest_join_284;
    }
    if (!((forestValue268_280_0 != 0))) {
        break forest_join_319;
    }
    forestValue268_284_0 = life13_240;
    }
    if (!((forestValue268_284_0 != 0))) {
        break forest_join_319;
    }
    }
    life19_318 = new moom.DT(life15_255, life12_227, life17_273);
    life20_323 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life19_318))))).a__ch();
    spill268_18 = ((net.minecraft.block.Block)(life20_323)).a__fn();
    spill268_19 = moom.fn.a;
    if (!((life6_14 != null))) {
        forestValue268_306_0 = spill268_18;
        forestValue268_306_1 = spill268_19;
        break forest_join_306;
    }
    if (!((spill268_18 != spill268_19))) {
        break forest_join_313;
    }
    forestValue268_306_0 = ((net.minecraft.block.Block)(life20_323)).a__fn();
    forestValue268_306_1 = moom.fn.j;
    }
    if (!((life6_14 != null))) {
        forestValue268_312_0 = forestValue268_306_0;
        forestValue268_312_1 = forestValue268_306_1;
        break forest_join_312;
    }
    if (!((forestValue268_306_0 != forestValue268_306_1))) {
        break forest_join_313;
    }
    forestValue268_312_0 = ((net.minecraft.block.Block)(life20_323)).a__fn();
    forestValue268_312_1 = moom.fn.l;
    }
    if (!((forestValue268_312_0 == forestValue268_312_1))) {
        break forest_join_319;
    }
    }
    __sourceExactCall_119f20b0fc8581(((moom.Ga)(this)), ((net.minecraft.world.World)(p0)), ((moom.DT)(life19_318)), ((net.minecraft.block.state.IBlockState)(this.h)));
    }
    life17_273 += 1;
    if (!((life6_14 == null))) {
        continue forest_cycle_252;
    }
    break forest_cycle_252;
    }
    break forest_cycle_239;
    }
    }
    life15_255 += 1;
    if (!((life6_14 == null))) {
        continue forest_cycle_234;
    }
    break forest_cycle_234;
    }
    break forest_cycle_207;
    }
    }
    life12_227 += 1;
    if (!((life6_14 == null))) {
        continue forest_cycle_206;
    }
    break forest_cycle_206;
    }
    }
    forestValue268_329_0 = 0;
    }
    life12_361 = forestValue268_329_0;
    forest_cycle_330: while (true) {
    forest_join_474: {
    forest_join_473: {
    forest_join_463: {
    forest_join_453: {
    forest_join_450: {
    forest_join_428: {
    forest_join_425: {
    forest_join_403: {
    forest_join_400: {
    forest_join_378: {
    forest_join_366: {
    forest_join_358: {
    forest_join_357: {
    if (!((life12_361 < life7_10))) {
        break forest_join_476;
    }
    life13_371 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p2)).a(((int)(life12_361)))))))).a__ch();
    if (!((life6_14 != null))) {
        break forest_join_705;
    }
    if (!((life6_14 != null))) {
        break forest_join_366;
    }
    if (!((((net.minecraft.block.Block)(life13_371)).a__fn() != moom.fn.a))) {
        break forest_join_358;
    }
    spill268_20 = ((net.minecraft.block.Block)(life13_371)).a__fn();
    spill268_21 = moom.fn.j;
    if (!((life6_14 != null))) {
        forestValue268_357_0 = spill268_20;
        forestValue268_357_1 = spill268_21;
        break forest_join_357;
    }
    if (!((spill268_20 != spill268_21))) {
        break forest_join_358;
    }
    forestValue268_357_0 = ((net.minecraft.block.Block)(life13_371)).a__fn();
    forestValue268_357_1 = moom.fn.l;
    }
    if (!((forestValue268_357_0 == forestValue268_357_1))) {
        break forest_join_473;
    }
    }
    __sourceExactCall_119f20b0fc8581(((moom.Ga)(this)), ((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(p2)).a(((int)(life12_361))))), ((net.minecraft.block.state.IBlockState)(this.g)));
    }
    if (!((life6_14 != null))) {
        break forest_join_474;
    }
    if (!(this.f)) {
        break forest_join_473;
    }
    spill268_22 = life12_361;
    if (!((life6_14 != null))) {
        forestValue268_378_0 = spill268_22;
        break forest_join_378;
    }
    if (!((spill268_22 > 0))) {
        break forest_join_473;
    }
    forestValue268_378_0 = ((java.util.Random)(p1)).nextInt(((int)(3)));
    }
    if (!((life6_14 != null))) {
        forestValue268_403_0 = forestValue268_378_0;
        break forest_join_403;
    }
    if (!((forestValue268_378_0 > 0))) {
        break forest_join_400;
    }
    spill268_23 = ((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(__sourceExactCall_dbb09535a521a1(((moom.DT)(p2)), ((int)(-1)), ((int)(life12_361)), ((int)(0))))));
    if (!((life6_14 != null))) {
        forestValue268_403_0 = ((spill268_23) ? 1 : 0);
        break forest_join_403;
    }
    if (!(spill268_23)) {
        break forest_join_400;
    }
    __sourceExactCall_24f7adafd686f6(((moom.Ga)(this)), ((net.minecraft.world.World)(p0)), ((moom.DT)(__sourceExactCall_dbb09535a521a1(((moom.DT)(p2)), ((int)(-1)), ((int)(life12_361)), ((int)(0))))), ((moom.fv)(moom.eF.S)));
    }
    forestValue268_403_0 = ((java.util.Random)(p1)).nextInt(((int)(3)));
    }
    if (!((life6_14 != null))) {
        forestValue268_428_0 = forestValue268_403_0;
        break forest_join_428;
    }
    if (!((forestValue268_403_0 > 0))) {
        break forest_join_425;
    }
    spill268_24 = ((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(__sourceExactCall_dbb09535a521a1(((moom.DT)(p2)), ((int)(1)), ((int)(life12_361)), ((int)(0))))));
    if (!((life6_14 != null))) {
        forestValue268_428_0 = ((spill268_24) ? 1 : 0);
        break forest_join_428;
    }
    if (!(spill268_24)) {
        break forest_join_425;
    }
    __sourceExactCall_24f7adafd686f6(((moom.Ga)(this)), ((net.minecraft.world.World)(p0)), ((moom.DT)(__sourceExactCall_dbb09535a521a1(((moom.DT)(p2)), ((int)(1)), ((int)(life12_361)), ((int)(0))))), ((moom.fv)(moom.eF.U)));
    }
    forestValue268_428_0 = ((java.util.Random)(p1)).nextInt(((int)(3)));
    }
    if (!((life6_14 != null))) {
        forestValue268_453_0 = forestValue268_428_0;
        break forest_join_453;
    }
    if (!((forestValue268_428_0 > 0))) {
        break forest_join_450;
    }
    spill268_25 = ((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(__sourceExactCall_dbb09535a521a1(((moom.DT)(p2)), ((int)(0)), ((int)(life12_361)), ((int)(-1))))));
    if (!((life6_14 != null))) {
        forestValue268_453_0 = ((spill268_25) ? 1 : 0);
        break forest_join_453;
    }
    if (!(spill268_25)) {
        break forest_join_450;
    }
    __sourceExactCall_24f7adafd686f6(((moom.Ga)(this)), ((net.minecraft.world.World)(p0)), ((moom.DT)(__sourceExactCall_dbb09535a521a1(((moom.DT)(p2)), ((int)(0)), ((int)(life12_361)), ((int)(-1))))), ((moom.fv)(moom.eF.T)));
    }
    forestValue268_453_0 = ((java.util.Random)(p1)).nextInt(((int)(3)));
    }
    if (!((life6_14 != null))) {
        forestValue268_463_0 = forestValue268_453_0;
        break forest_join_463;
    }
    if (!((forestValue268_453_0 > 0))) {
        break forest_join_473;
    }
    forestValue268_463_0 = ((((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(__sourceExactCall_dbb09535a521a1(((moom.DT)(p2)), ((int)(0)), ((int)(life12_361)), ((int)(1))))))) ? 1 : 0);
    }
    if (!((forestValue268_463_0 != 0))) {
        break forest_join_473;
    }
    __sourceExactCall_24f7adafd686f6(((moom.Ga)(this)), ((net.minecraft.world.World)(p0)), ((moom.DT)(__sourceExactCall_dbb09535a521a1(((moom.DT)(p2)), ((int)(0)), ((int)(life12_361)), ((int)(1))))), ((moom.fv)(moom.eF.R)));
    }
    life12_361 += 1;
    }
    if (!((life6_14 == null))) {
        continue forest_cycle_330;
    }
    break forest_cycle_330;
    }
    }
    spill268_26 = this.f;
    if (!((life6_14 != null))) {
        forestValue268_706_0 = ((spill268_26) ? 1 : 0);
        break forest_join_706;
    }
    if (!(spill268_26)) {
        break forest_join_705;
    }
    life12_545 = ((((moom.DT)(p2)).b() - 3) + life7_10);
    forest_cycle_488: while (true) {
    forest_join_642: {
    forestValue268_489_0 = life12_545;
    forest_cycle_489: while (true) {
    if (!((forestValue268_489_0 <= (((moom.DT)(p2)).b() + life7_10)))) {
        break forest_join_645;
    }
    life13_558 = (life12_545 - (((moom.DT)(p2)).b() + life7_10));
    life14_564 = (2 - (life13_558 / 2));
    life15_568 = new moom.DU();
    spill268_27 = (((moom.DT)(p2)).a() - life14_564);
    if (!((life6_14 != null))) {
        forestValue268_648_0 = spill268_27;
        break forest_join_648;
    }
    life16_575 = spill268_27;
    forest_cycle_518: while (true) {
    forest_join_640: {
    forest_join_639: {
    if (!((life16_575 <= (((moom.DT)(p2)).a() + life14_564)))) {
        break forest_join_642;
    }
    spill268_28 = (((moom.DT)(p2)).c() - life14_564);
    if (!((life6_14 != null))) {
        forestValue268_489_0 = spill268_28;
        continue forest_cycle_489;
    }
    life17_588 = spill268_28;
    forest_cycle_531: while (true) {
    forest_join_637: {
    forest_join_636: {
    forest_join_623: {
    forest_join_620: {
    forest_join_605: {
    forest_join_602: {
    forest_join_587: {
    forest_join_584: {
    if (!((life17_588 <= (((moom.DT)(p2)).c() + life14_564)))) {
        break forest_join_639;
    }
    __sourceExactCall_a52b8c6f715869(((moom.DU)(life15_568)), ((int)(life16_575)), ((int)(life12_545)), ((int)(life17_588)));
    if (!((life6_14 != null))) {
        break forest_join_640;
    }
    if (!((life6_14 != null))) {
        break forest_join_637;
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life15_568))))).a__ch())).a__fn() == moom.fn.j))) {
        break forest_join_636;
    }
    life18_616 = ((moom.DU)(life15_568)).e();
    life19_619 = ((moom.DU)(life15_568)).f();
    life20_622 = __sourceExactCall_007f0969c6d162(((moom.DU)(life15_568)));
    life21_625 = __sourceExactCall_536e8c272dd8c3(((moom.DU)(life15_568)));
    spill268_29 = ((java.util.Random)(p1)).nextInt(((int)(4)));
    if (!((life6_14 != null))) {
        forestValue268_587_0 = spill268_29;
        break forest_join_587;
    }
    if (!((spill268_29 == 0))) {
        break forest_join_584;
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life18_616))))).a__ch())).a__fn() == moom.fn.a))) {
        break forest_join_584;
    }
    ((moom.Ga)(this)).b(((net.minecraft.world.World)(p0)), ((moom.DT)(life18_616)), ((moom.fv)(moom.eF.S)));
    }
    forestValue268_587_0 = ((java.util.Random)(p1)).nextInt(((int)(4)));
    }
    if (!((life6_14 != null))) {
        forestValue268_605_0 = forestValue268_587_0;
        break forest_join_605;
    }
    if (!((forestValue268_587_0 == 0))) {
        break forest_join_602;
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life19_619))))).a__ch())).a__fn() == moom.fn.a))) {
        break forest_join_602;
    }
    ((moom.Ga)(this)).b(((net.minecraft.world.World)(p0)), ((moom.DT)(life19_619)), ((moom.fv)(moom.eF.U)));
    }
    forestValue268_605_0 = ((java.util.Random)(p1)).nextInt(((int)(4)));
    }
    if (!((life6_14 != null))) {
        forestValue268_623_0 = forestValue268_605_0;
        break forest_join_623;
    }
    if (!((forestValue268_605_0 == 0))) {
        break forest_join_620;
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life20_622))))).a__ch())).a__fn() == moom.fn.a))) {
        break forest_join_620;
    }
    ((moom.Ga)(this)).b(((net.minecraft.world.World)(p0)), ((moom.DT)(life20_622)), ((moom.fv)(moom.eF.T)));
    }
    forestValue268_623_0 = ((java.util.Random)(p1)).nextInt(((int)(4)));
    }
    if (!((forestValue268_623_0 == 0))) {
        break forest_join_636;
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life21_625))))).a__ch())).a__fn() == moom.fn.a))) {
        break forest_join_636;
    }
    ((moom.Ga)(this)).b(((net.minecraft.world.World)(p0)), ((moom.DT)(life21_625)), ((moom.fv)(moom.eF.R)));
    }
    life17_588 += 1;
    }
    if (!((life6_14 == null))) {
        continue forest_cycle_531;
    }
    break forest_cycle_531;
    }
    }
    life16_575 += 1;
    }
    if (!((life6_14 == null))) {
        continue forest_cycle_518;
    }
    break forest_cycle_518;
    }
    break forest_cycle_489;
    }
    }
    life12_545 += 1;
    if (!((life6_14 == null))) {
        continue forest_cycle_488;
    }
    break forest_cycle_488;
    }
    }
    forestValue268_648_0 = ((java.util.Random)(p1)).nextInt(((int)(5)));
    }
    if (!((life6_14 != null))) {
        forestValue268_706_0 = forestValue268_648_0;
        break forest_join_706;
    }
    if (!((forestValue268_648_0 == 0))) {
        break forest_join_705;
    }
    spill268_30 = life7_10;
    if (!((life6_14 != null))) {
        forestValue268_706_0 = spill268_30;
        break forest_join_706;
    }
    if (!((spill268_30 > 5))) {
        break forest_join_705;
    }
    life12_731 = 0;
    forest_cycle_658: while (true) {
    forest_join_702: {
    forestValue268_659_0 = life12_731;
    forest_cycle_659: while (true) {
    if (!((forestValue268_659_0 < 2))) {
        break forest_join_705;
    }
    life13_737 = ((net.minecraft.util.EnumFacing$Plane)(net.minecraft.util.EnumFacing$Plane.HORIZONTAL)).iterator();
    forest_cycle_664: while (true) {
    forest_join_700: {
    if (!(((java.util.Iterator)(life13_737)).hasNext())) {
        break forest_join_702;
    }
    life14_744 = ((moom.bs)(((java.util.Iterator)(life13_737)).next()));
    spill268_31 = ((java.util.Random)(p1)).nextInt(((int)((4 - life12_731))));
    if (!((life6_14 != null))) {
        forestValue268_659_0 = spill268_31;
        continue forest_cycle_659;
    }
    if (!((spill268_31 == 0))) {
        break forest_join_700;
    }
    life15_755 = ((moom.bs)(life14_744)).a__bs();
    ((moom.Ga)(this)).a(((net.minecraft.world.World)(p0)), ((int)(((java.util.Random)(p1)).nextInt(((int)(3))))), ((moom.DT)(__sourceExactCall_dbb09535a521a1(((moom.DT)(p2)), ((int)(((moom.bs)(life15_755)).c())), ((int)(((life7_10 - 5) + life12_731))), ((int)(((moom.bs)(life15_755)).e()))))), ((moom.bs)(life14_744)));
    }
    if (!((life6_14 == null))) {
        continue forest_cycle_664;
    }
    break forest_cycle_664;
    }
    break forest_cycle_659;
    }
    }
    life12_731 += 1;
    if (!((life6_14 == null))) {
        continue forest_cycle_658;
    }
    break forest_cycle_658;
    }
    }
    forestValue268_706_0 = 1;
    }
    return ((forestValue268_706_0) != 0);
    }
    forestValue268_708_0 = 0;
    }
    return ((forestValue268_708_0) != 0);
    }
    forestValue268_710_0 = 0;
    }
    return ((forestValue268_710_0) != 0);
}


private void a(net.minecraft.world.World p0, int p1, moom.DT p2, moom.bs p3) {
((moom.Ga)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p2)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bC)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dj.R)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)(p1)))))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.dj.Q)), ((java.lang.Comparable)(p3))))));
    return;
}


private void a(net.minecraft.world.World p0, moom.DT p1, moom.fv p2) {
((moom.Ga)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bc)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(p2)), ((java.lang.Comparable)(java.lang.Boolean.TRUE))))));
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4667_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic268_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic268_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic268_29(int a0, long a1) throws E;

private static native int __sourceExactCall_0f1bf2c76c0077(int p0, long p1);
private static native moom.DT __sourceExactCall_007f0969c6d162(moom.DU p0);
private static native moom.DT __sourceExactCall_536e8c272dd8c3(moom.DU p0);

private static native moom.DU __sourceExactCall_a52b8c6f715869(moom.DU p0, int p1, int p2, int p3);
private static native void __sourceExactCall_119f20b0fc8581(moom.Ga p0, net.minecraft.world.World p1, moom.DT p2, net.minecraft.block.state.IBlockState p3);
private static native void __sourceExactCall_24f7adafd686f6(moom.Ga p0, net.minecraft.world.World p1, moom.DT p2, moom.fv p3);
private static native moom.DT __sourceExactCall_dbb09535a521a1(moom.DT p0, int p1, int p2, int p3);
}
