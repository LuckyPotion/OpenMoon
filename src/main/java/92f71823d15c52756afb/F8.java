package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class F8 extends moom.F0 {

private static final net.minecraft.block.state.IBlockState c;

private static final net.minecraft.block.state.IBlockState d;

private static final long e;

private static final long[] f;

private static final java.lang.Integer[] g;

private static final java.util.Map h;

public F8() {
super(false);
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(-8124103872243807105L)), ((long)(-1054060148001666539L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(261296887546862L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.F8.e ^ 31450780645623L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill529_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill529_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill529_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill529_14 = new byte[8];
    (__sourceSpill529_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill529_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation529_16 = __sourceSpill529_14;
    ((javax.crypto.Cipher)(__sourceSpill529_11)).init(((int)(__sourceSpill529_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill529_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation529_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "²>:GÝí¦¸àúI^M\032"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill529_25 = local6_life21;
        int __sourceSpill529_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill529_25)).substring(((int)(__sourceSpill529_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill529_30 = local8_life19;
        int __sourceSpill529_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill529_33 = new byte[8];
        (__sourceSpill529_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill529_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill529_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill529_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill529_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill529_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill529_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill529_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill529_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill529_34)).doFinal(((byte[])(__sourceSpill529_33)));
        (__sourceSpill529_30)[__sourceSpill529_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    f = ((long[])(local8_life19));
    g = ((java.lang.Integer[])(new java.lang.Integer[2]));
    c = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.ee.S)), ((java.lang.Comparable)(net.minecraft.block.BlockPlanks$EnumType.OAK)))));
    d = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.dH)(net.minecraft.init.Blocks.t)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dJ.W)), ((java.lang.Comparable)(net.minecraft.block.BlockPlanks$EnumType.OAK))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.dJ.S)), ((java.lang.Comparable)(java.lang.Boolean.FALSE)))));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4449_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/F8"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_edd465508f001e(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 11504;
      if (g[var3] == null) {
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
         long var5 = f[var3];
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
         Object[] var9 = (Object[])h.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               h.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/F8", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2) {
int forestValue251_51_0;
    int forestValue251_81_0;
    int forestValue251_81_1;
    int forestValue251_83_0;
    int forestValue251_94_0;
    int forestValue251_109_0;
    int forestValue251_123_0;
    moom.fn forestValue251_155_0;
    moom.fn forestValue251_155_1;
    net.minecraft.block.Block forestValue251_157_0;
    net.minecraft.block.Block forestValue251_162_0;
    int forestValue251_175_0;
    int forestValue251_179_0;
    int forestValue251_190_0;
    int forestValue251_194_0;
    net.minecraft.block.Block forestValue251_208_0;
    net.minecraft.block.Block forestValue251_208_1;
    int forestValue251_236_0;
    int forestValue251_266_0;
    int forestValue251_266_1;
    int forestValue251_303_0;
    int forestValue251_303_1;
    int forestValue251_307_0;
    int forestValue251_311_0;
    int forestValue251_342_0;
    moom.fn forestValue251_366_0;
    moom.fn forestValue251_366_1;
    net.minecraft.block.Block forestValue251_368_0;
    net.minecraft.block.Block forestValue251_373_0;
    int forestValue251_393_0;
    int forestValue251_491_0;
    int forestValue251_509_0;
    int forestValue251_527_0;
    int forestValue251_550_0;
    int forestValue251_552_0;
    int forestValue251_554_0;
    int[] spill251_0;
    int spill251_1;
    int spill251_2;
    int spill251_3;
    int spill251_4;
    int spill251_5;
    int spill251_6;
    int spill251_7;
    int spill251_8;
    moom.fn spill251_9;
    moom.fn spill251_10;
    net.minecraft.block.Block spill251_11;
    int spill251_12;
    net.minecraft.block.Block spill251_13;
    moom.dC spill251_14;
    int spill251_15;
    int spill251_16;
    int spill251_17;
    int spill251_18;
    int spill251_19;
    int spill251_20;
    moom.fn spill251_21;
    moom.fn spill251_22;
    net.minecraft.block.Block spill251_23;
    int spill251_24;
    int spill251_25;
    int spill251_26;
    long life4_3;
    int life7_10;
    int[] life6_11;
    int life8_26;
    int life9_52;
    int life10_62;
    moom.DU life11_93;
    int life12_98;
    int life13_117;
    net.minecraft.block.Block life14_155;
    net.minecraft.block.Block life9_222;
    int life10_260;
    int life11_273;
    int life12_279;
    int life13_286;
    int life14_297;
    int life15_304;
    int life16_315;
    moom.DT life17_349;
    int life10_375;
    net.minecraft.block.Block life11_385;
    int life11_444;
    int life12_450;
    moom.DU life13_454;
    int life14_461;
    int life15_474;
    moom.DT life16_502;
    moom.DT life17_505;
    moom.DT life18_508;
    moom.DT life19_511;
    forest_join_554: {
    forest_join_553: {
    forest_join_552: {
    forest_join_551: {
    forest_join_550: {
    forest_join_549: {
    forest_join_392: {
    forest_join_385: {
    forest_join_342: {
    forest_join_341: {
    forest_join_209: {
    forest_join_208: {
    forest_join_195: {
    forest_join_194: {
    forest_join_190: {
    forest_join_189: {
    forest_join_25: {
    life4_3 = (moom.F8.e ^ 57533801631875L);
    spill251_0 = __sourceExactCall_9dbd6817cf299e();
    life7_10 = (((java.util.Random)(p1)).nextInt(((int)(4))) + 5);
    life6_11 = spill251_0;
    forest_cycle_12: while (true) {
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p2)).b__DT()))))).a__ch())).a__fn() == moom.fn.h))) {
        break forest_join_25;
    }
    p2 = ((moom.DT)(p2)).b__DT();
    if (!((life6_11 == null))) {
        continue forest_cycle_12;
    }
    break forest_cycle_12;
    }
    }
    life8_26 = 1;
    spill251_1 = ((moom.DT)(p2)).b();
    if (!((life6_11 != null))) {
        forestValue251_554_0 = spill251_1;
        break forest_join_554;
    }
    if (!((spill251_1 >= 1))) {
        break forest_join_553;
    }
    spill251_2 = ((((moom.DT)(p2)).b() + life7_10) + 1);
    if (!((life6_11 != null))) {
        forestValue251_554_0 = spill251_2;
        break forest_join_554;
    }
    if (!((spill251_2 <= __sourceIntrinsic_e7ba66b54646_invokedynamic251_11(28693, (5700657961356384666L ^ life4_3))))) {
        break forest_join_553;
    }
    life9_52 = ((moom.DT)(p2)).b();
    forest_cycle_50: while (true) {
    forest_join_186: {
    forestValue251_51_0 = life9_52;
    forest_cycle_51: while (true) {
    forest_join_84: {
    forest_join_83: {
    forest_join_81: {
    forest_join_70: {
    if (!((forestValue251_51_0 <= ((((moom.DT)(p2)).b() + 1) + life7_10)))) {
        break forest_join_189;
    }
    life10_62 = 1;
    spill251_3 = life9_52;
    if (!((life6_11 != null))) {
        forestValue251_190_0 = spill251_3;
        break forest_join_190;
    }
    spill251_4 = ((moom.DT)(p2)).b();
    if (!((life6_11 != null))) {
        forestValue251_81_0 = spill251_3;
        forestValue251_81_1 = spill251_4;
        break forest_join_81;
    }
    if (!((spill251_3 == spill251_4))) {
        break forest_join_70;
    }
    life10_62 = 0;
    }
    spill251_5 = life9_52;
    if (!((life6_11 != null))) {
        forestValue251_83_0 = spill251_5;
        break forest_join_83;
    }
    forestValue251_81_0 = spill251_5;
    forestValue251_81_1 = (((((moom.DT)(p2)).b() + 1) + life7_10) - 2);
    }
    if (!((forestValue251_81_0 >= forestValue251_81_1))) {
        break forest_join_84;
    }
    forestValue251_83_0 = 3;
    }
    life10_62 = forestValue251_83_0;
    }
    life11_93 = new moom.DU();
    life12_98 = (((moom.DT)(p2)).a() - life10_62);
    forest_cycle_93: while (true) {
    forest_join_183: {
    forestValue251_94_0 = life12_98;
    forest_cycle_94: while (true) {
    forest_join_109: {
    if (!((forestValue251_94_0 <= (((moom.DT)(p2)).a() + life10_62)))) {
        break forest_join_186;
    }
    spill251_6 = life8_26;
    if (!((life6_11 != null))) {
        forestValue251_51_0 = spill251_6;
        continue forest_cycle_51;
    }
    if (!((life6_11 != null))) {
        forestValue251_109_0 = spill251_6;
        break forest_join_109;
    }
    if (!((spill251_6 != 0))) {
        break forest_join_186;
    }
    forestValue251_109_0 = (((moom.DT)(p2)).c() - life10_62);
    }
    life13_117 = forestValue251_109_0;
    forest_cycle_110: while (true) {
    forest_join_180: {
    forest_join_179: {
    forest_join_178: {
    forest_join_176: {
    forest_join_175: {
    forest_join_168: {
    forest_join_162: {
    forest_join_157: {
    forest_join_155: {
    forest_join_123: {
    if (!((life13_117 <= (((moom.DT)(p2)).c() + life10_62)))) {
        break forest_join_183;
    }
    spill251_7 = life8_26;
    if (!((life6_11 != null))) {
        forestValue251_94_0 = spill251_7;
        continue forest_cycle_94;
    }
    if (!((life6_11 != null))) {
        forestValue251_123_0 = spill251_7;
        break forest_join_123;
    }
    if (!((spill251_7 != 0))) {
        break forest_join_183;
    }
    forestValue251_123_0 = life9_52;
    }
    if (!((life6_11 != null))) {
        forestValue251_179_0 = forestValue251_123_0;
        break forest_join_179;
    }
    if (!((forestValue251_123_0 >= 0))) {
        break forest_join_178;
    }
    spill251_8 = life9_52;
    if (!((life6_11 != null))) {
        forestValue251_179_0 = spill251_8;
        break forest_join_179;
    }
    if (!((spill251_8 < __sourceIntrinsic_e7ba66b54646_invokedynamic251_20(19258, (3756540645601469108L ^ life4_3))))) {
        break forest_join_178;
    }
    life14_155 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DU)(life11_93)).a(((int)(life12_98)), ((int)(life9_52)), ((int)(life13_117)))))))).a__ch();
    spill251_9 = ((net.minecraft.block.Block)(life14_155)).a__fn();
    spill251_10 = moom.fn.a;
    if (!((life6_11 != null))) {
        forestValue251_155_0 = spill251_9;
        forestValue251_155_1 = spill251_10;
        break forest_join_155;
    }
    if (!((spill251_9 != spill251_10))) {
        break forest_join_176;
    }
    spill251_11 = life14_155;
    if (!((life6_11 != null))) {
        forestValue251_157_0 = spill251_11;
        break forest_join_157;
    }
    forestValue251_155_0 = ((net.minecraft.block.Block)(spill251_11)).a__fn();
    forestValue251_155_1 = moom.fn.j;
    }
    if (!((forestValue251_155_0 != forestValue251_155_1))) {
        break forest_join_176;
    }
    forestValue251_157_0 = life14_155;
    }
    if (!((life6_11 != null))) {
        forestValue251_162_0 = forestValue251_157_0;
        break forest_join_162;
    }
    if (!((forestValue251_157_0 != net.minecraft.init.Blocks.j))) {
        break forest_join_168;
    }
    forestValue251_162_0 = life14_155;
    }
    if (!((forestValue251_162_0 != net.minecraft.init.Blocks.i))) {
        break forest_join_168;
    }
    life8_26 = 0;
    if (!((life6_11 == null))) {
        break forest_join_176;
    }
    }
    spill251_12 = life9_52;
    if (!((life6_11 != null))) {
        forestValue251_175_0 = spill251_12;
        break forest_join_175;
    }
    if (!((spill251_12 > ((moom.DT)(p2)).b()))) {
        break forest_join_176;
    }
    forestValue251_175_0 = 0;
    }
    life8_26 = forestValue251_175_0;
    }
    if (!((life6_11 == null))) {
        break forest_join_180;
    }
    }
    forestValue251_179_0 = 0;
    }
    life8_26 = forestValue251_179_0;
    }
    life13_117 += 1;
    if (!((life6_11 == null))) {
        continue forest_cycle_110;
    }
    break forest_cycle_110;
    }
    break forest_cycle_94;
    }
    }
    life12_98 += 1;
    if (!((life6_11 == null))) {
        continue forest_cycle_93;
    }
    break forest_cycle_93;
    }
    break forest_cycle_51;
    }
    }
    life9_52 += 1;
    if (!((life6_11 == null))) {
        continue forest_cycle_50;
    }
    break forest_cycle_50;
    }
    }
    forestValue251_190_0 = life8_26;
    }
    if (!((life6_11 != null))) {
        forestValue251_194_0 = forestValue251_190_0;
        break forest_join_194;
    }
    if (!((forestValue251_190_0 == 0))) {
        break forest_join_195;
    }
    forestValue251_194_0 = 0;
    }
    return ((forestValue251_194_0) != 0);
    }
    life9_222 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p2)).b__DT()))))).a__ch();
    spill251_13 = life9_222;
    spill251_14 = net.minecraft.init.Blocks.c;
    if (!((life6_11 != null))) {
        forestValue251_208_0 = spill251_13;
        forestValue251_208_1 = spill251_14;
        break forest_join_208;
    }
    if (!((spill251_13 != spill251_14))) {
        break forest_join_209;
    }
    forestValue251_208_0 = life9_222;
    forestValue251_208_1 = net.minecraft.init.Blocks.d;
    }
    if (!((forestValue251_208_0 == forestValue251_208_1))) {
        break forest_join_551;
    }
    }
    spill251_15 = ((moom.DT)(p2)).b();
    if (!((life6_11 != null))) {
        forestValue251_552_0 = spill251_15;
        break forest_join_552;
    }
    if (!((spill251_15 < ((__sourceIntrinsic_e7ba66b54646_invokedynamic251_38(19258, (3756540645601469108L ^ life4_3)) - life7_10) - 1)))) {
        break forest_join_551;
    }
    ((moom.F8)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(p2)).b__DT())));
    life10_260 = ((((moom.DT)(p2)).b() - 3) + life7_10);
    forest_cycle_235: while (true) {
    forest_join_338: {
    forestValue251_236_0 = life10_260;
    forest_cycle_236: while (true) {
    if (!((forestValue251_236_0 <= (((moom.DT)(p2)).b() + life7_10)))) {
        break forest_join_341;
    }
    life11_273 = (life10_260 - (((moom.DT)(p2)).b() + life7_10));
    life12_279 = (2 - (life11_273 / 2));
    spill251_16 = (((moom.DT)(p2)).a() - life12_279);
    if (!((life6_11 != null))) {
        forestValue251_342_0 = spill251_16;
        break forest_join_342;
    }
    life13_286 = spill251_16;
    forest_cycle_261: while (true) {
    forest_join_335: {
    forestValue251_266_0 = life13_286;
    forestValue251_266_1 = (((moom.DT)(p2)).a() + life12_279);
    forest_cycle_266: while (true) {
    if (!((forestValue251_266_0 <= forestValue251_266_1))) {
        break forest_join_338;
    }
    life14_297 = (life13_286 - ((moom.DT)(p2)).a());
    spill251_17 = (((moom.DT)(p2)).c() - life12_279);
    if (!((life6_11 != null))) {
        forestValue251_236_0 = spill251_17;
        continue forest_cycle_236;
    }
    life15_304 = spill251_17;
    forest_cycle_279: while (true) {
    forest_join_333: {
    forest_join_332: {
    forest_join_312: {
    forest_join_311: {
    forest_join_307: {
    forest_join_303: {
    if (!((life15_304 <= (((moom.DT)(p2)).c() + life12_279)))) {
        break forest_join_335;
    }
    life16_315 = (life15_304 - ((moom.DT)(p2)).c());
    spill251_18 = java.lang.Math.abs(((int)(life14_297)));
    spill251_19 = life12_279;
    if (!((life6_11 != null))) {
        forestValue251_266_0 = spill251_18;
        forestValue251_266_1 = spill251_19;
        continue forest_cycle_266;
    }
    if (!((life6_11 != null))) {
        forestValue251_303_0 = spill251_18;
        forestValue251_303_1 = spill251_19;
        break forest_join_303;
    }
    if (!((spill251_18 == spill251_19))) {
        break forest_join_312;
    }
    spill251_20 = java.lang.Math.abs(((int)(life16_315)));
    if (!((life6_11 != null))) {
        forestValue251_307_0 = spill251_20;
        break forest_join_307;
    }
    forestValue251_303_0 = spill251_20;
    forestValue251_303_1 = life12_279;
    }
    if (!((forestValue251_303_0 == forestValue251_303_1))) {
        break forest_join_312;
    }
    forestValue251_307_0 = ((java.util.Random)(p1)).nextInt(((int)(2)));
    }
    if (!((life6_11 != null))) {
        forestValue251_311_0 = forestValue251_307_0;
        break forest_join_311;
    }
    if (!((forestValue251_307_0 != 0))) {
        break forest_join_332;
    }
    forestValue251_311_0 = life11_273;
    }
    if (!((forestValue251_311_0 != 0))) {
        break forest_join_332;
    }
    }
    life17_349 = new moom.DT(life13_286, life10_260, life15_304);
    if (!((life6_11 != null))) {
        break forest_join_333;
    }
    if (!((!((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life17_349))))).a__ch())).a__Boolean()))) {
        break forest_join_332;
    }
    ((moom.F8)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(life17_349)), ((net.minecraft.block.state.IBlockState)(moom.F8.d)));
    }
    life15_304 += 1;
    }
    if (!((life6_11 == null))) {
        continue forest_cycle_279;
    }
    break forest_cycle_279;
    }
    break forest_cycle_266;
    }
    }
    life13_286 += 1;
    if (!((life6_11 == null))) {
        continue forest_cycle_261;
    }
    break forest_cycle_261;
    }
    break forest_cycle_236;
    }
    }
    life10_260 += 1;
    if (!((life6_11 == null))) {
        continue forest_cycle_235;
    }
    break forest_cycle_235;
    }
    }
    forestValue251_342_0 = 0;
    }
    life10_375 = forestValue251_342_0;
    forest_cycle_343: while (true) {
    forest_join_382: {
    forest_join_375: {
    forest_join_373: {
    forest_join_368: {
    forest_join_366: {
    if (!((life10_375 < life7_10))) {
        break forest_join_385;
    }
    life11_385 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p2)).a(((int)(life10_375)))))))).a__ch();
    if (!((life6_11 != null))) {
        break forest_join_392;
    }
    spill251_21 = ((net.minecraft.block.Block)(life11_385)).a__fn();
    spill251_22 = moom.fn.a;
    if (!((life6_11 != null))) {
        forestValue251_366_0 = spill251_21;
        forestValue251_366_1 = spill251_22;
        break forest_join_366;
    }
    if (!((spill251_21 != spill251_22))) {
        break forest_join_375;
    }
    spill251_23 = life11_385;
    if (!((life6_11 != null))) {
        forestValue251_368_0 = spill251_23;
        break forest_join_368;
    }
    forestValue251_366_0 = ((net.minecraft.block.Block)(spill251_23)).a__fn();
    forestValue251_366_1 = moom.fn.j;
    }
    if (!((forestValue251_366_0 != forestValue251_366_1))) {
        break forest_join_375;
    }
    forestValue251_368_0 = life11_385;
    }
    if (!((life6_11 != null))) {
        forestValue251_373_0 = forestValue251_368_0;
        break forest_join_373;
    }
    if (!((forestValue251_368_0 != net.minecraft.init.Blocks.i))) {
        break forest_join_375;
    }
    forestValue251_373_0 = life11_385;
    }
    if (!((forestValue251_373_0 == net.minecraft.init.Blocks.j))) {
        break forest_join_382;
    }
    }
    ((moom.F8)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(p2)).a(((int)(life10_375))))), ((net.minecraft.block.state.IBlockState)(moom.F8.c)));
    }
    life10_375 += 1;
    if (!((life6_11 == null))) {
        continue forest_cycle_343;
    }
    break forest_cycle_343;
    }
    }
    life10_375 = ((((moom.DT)(p2)).b() - 3) + life7_10);
    }
    forest_cycle_392: while (true) {
    forest_join_546: {
    forestValue251_393_0 = life10_375;
    forest_cycle_393: while (true) {
    if (!((forestValue251_393_0 <= (((moom.DT)(p2)).b() + life7_10)))) {
        break forest_join_549;
    }
    life11_444 = (life10_375 - (((moom.DT)(p2)).b() + life7_10));
    life12_450 = (2 - (life11_444 / 2));
    life13_454 = new moom.DU();
    spill251_24 = (((moom.DT)(p2)).a() - life12_450);
    if (!((life6_11 != null))) {
        forestValue251_550_0 = spill251_24;
        break forest_join_550;
    }
    life14_461 = spill251_24;
    forest_cycle_422: while (true) {
    forest_join_544: {
    forest_join_543: {
    if (!((life14_461 <= (((moom.DT)(p2)).a() + life12_450)))) {
        break forest_join_546;
    }
    spill251_25 = (((moom.DT)(p2)).c() - life12_450);
    if (!((life6_11 != null))) {
        forestValue251_393_0 = spill251_25;
        continue forest_cycle_393;
    }
    life15_474 = spill251_25;
    forest_cycle_435: while (true) {
    forest_join_541: {
    forest_join_540: {
    forest_join_527: {
    forest_join_524: {
    forest_join_509: {
    forest_join_506: {
    forest_join_491: {
    forest_join_488: {
    if (!((life15_474 <= (((moom.DT)(p2)).c() + life12_450)))) {
        break forest_join_543;
    }
    ((moom.DU)(life13_454)).a(((int)(life14_461)), ((int)(life10_375)), ((int)(life15_474)));
    if (!((life6_11 != null))) {
        break forest_join_544;
    }
    if (!((life6_11 != null))) {
        break forest_join_541;
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life13_454))))).a__ch())).a__fn() == moom.fn.j))) {
        break forest_join_540;
    }
    life16_502 = ((moom.DU)(life13_454)).e();
    life17_505 = ((moom.DU)(life13_454)).f();
    life18_508 = __sourceExactCall_007f0969c6d162(((moom.DU)(life13_454)));
    life19_511 = __sourceExactCall_536e8c272dd8c3(((moom.DU)(life13_454)));
    spill251_26 = ((java.util.Random)(p1)).nextInt(((int)(4)));
    if (!((life6_11 != null))) {
        forestValue251_491_0 = spill251_26;
        break forest_join_491;
    }
    if (!((spill251_26 == 0))) {
        break forest_join_488;
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life16_502))))).a__ch())).a__fn() == moom.fn.a))) {
        break forest_join_488;
    }
    ((moom.F8)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(life16_502)), ((moom.fv)(moom.eF.S)));
    }
    forestValue251_491_0 = ((java.util.Random)(p1)).nextInt(((int)(4)));
    }
    if (!((life6_11 != null))) {
        forestValue251_509_0 = forestValue251_491_0;
        break forest_join_509;
    }
    if (!((forestValue251_491_0 == 0))) {
        break forest_join_506;
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life17_505))))).a__ch())).a__fn() == moom.fn.a))) {
        break forest_join_506;
    }
    ((moom.F8)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(life17_505)), ((moom.fv)(moom.eF.U)));
    }
    forestValue251_509_0 = ((java.util.Random)(p1)).nextInt(((int)(4)));
    }
    if (!((life6_11 != null))) {
        forestValue251_527_0 = forestValue251_509_0;
        break forest_join_527;
    }
    if (!((forestValue251_509_0 == 0))) {
        break forest_join_524;
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life18_508))))).a__ch())).a__fn() == moom.fn.a))) {
        break forest_join_524;
    }
    ((moom.F8)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(life18_508)), ((moom.fv)(moom.eF.T)));
    }
    forestValue251_527_0 = ((java.util.Random)(p1)).nextInt(((int)(4)));
    }
    if (!((forestValue251_527_0 == 0))) {
        break forest_join_540;
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life19_511))))).a__ch())).a__fn() == moom.fn.a))) {
        break forest_join_540;
    }
    ((moom.F8)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(life19_511)), ((moom.fv)(moom.eF.R)));
    }
    life15_474 += 1;
    }
    if (!((life6_11 == null))) {
        continue forest_cycle_435;
    }
    break forest_cycle_435;
    }
    }
    life14_461 += 1;
    }
    if (!((life6_11 == null))) {
        continue forest_cycle_422;
    }
    break forest_cycle_422;
    }
    break forest_cycle_393;
    }
    }
    life10_375 += 1;
    if (!((life6_11 == null))) {
        continue forest_cycle_392;
    }
    break forest_cycle_392;
    }
    }
    forestValue251_550_0 = 1;
    }
    return ((forestValue251_550_0) != 0);
    }
    forestValue251_552_0 = 0;
    }
    return ((forestValue251_552_0) != 0);
    }
    forestValue251_554_0 = 0;
    }
    return ((forestValue251_554_0) != 0);
}


private void a(net.minecraft.world.World p0, moom.DT p1, moom.fv p2) {
int[] spill625_0;
    long life4_3;
    net.minecraft.block.state.IBlockState life7_10;
    int[] life6_11;
    int life8_18;
    moom.DT life2_21;
    lexical_join_42: {
    life4_3 = (moom.F8.e ^ 37164693590519L);
    spill625_0 = moom.FY.b();
    life7_10 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bc)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(p2)), ((java.lang.Comparable)(java.lang.Boolean.TRUE)));
    life6_11 = spill625_0;
    ((moom.F8)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(life7_10)));
    life8_18 = 4;
    life2_21 = ((moom.DT)(p1)).b__DT();
    lexical_cycle_22: while (true) {
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life2_21))))).a__ch())).a__fn() == moom.fn.a))) {
        break lexical_join_42;
    }
    if (!((life8_18 > 0))) {
        break lexical_join_42;
    }
    ((moom.F8)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(life2_21)), ((net.minecraft.block.state.IBlockState)(life7_10)));
    life2_21 = ((moom.DT)(life2_21)).b__DT();
    life8_18 += -1;
    if (!((life6_11 == null))) { continue lexical_cycle_22; }
    break lexical_cycle_22;
    }
    }
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4449_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic251_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic251_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic251_38(int a0, long a1) throws E;

private static native int __sourceExactCall_edd465508f001e(int p0, long p1);
private static native moom.DT __sourceExactCall_007f0969c6d162(moom.DU p0);
private static native moom.DT __sourceExactCall_536e8c272dd8c3(moom.DU p0);

private static native int[] __sourceExactCall_9dbd6817cf299e();
}
