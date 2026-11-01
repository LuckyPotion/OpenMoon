package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class F9 extends moom.F0 {

private static final net.minecraft.block.state.IBlockState c;

private static final net.minecraft.block.state.IBlockState d;

private static final long e;

private static final long[] f;

private static final java.lang.Integer[] g;

private static final java.util.Map h;

public F9() {
super(false);
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(-5127249488111047297L)), ((long)(7363559620467381428L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(70513632628584L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.F9.e ^ 60968397925317L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill530_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill530_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill530_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill530_14 = new byte[8];
    (__sourceSpill530_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill530_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation530_16 = __sourceSpill530_14;
    ((javax.crypto.Cipher)(__sourceSpill530_11)).init(((int)(__sourceSpill530_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill530_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation530_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Ê\016h)÷>ø8³eÐä \"ÙPS²}R4"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill530_25 = local6_life21;
        int __sourceSpill530_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill530_25)).substring(((int)(__sourceSpill530_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill530_30 = local8_life19;
        int __sourceSpill530_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill530_33 = new byte[8];
        (__sourceSpill530_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill530_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill530_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill530_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill530_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill530_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill530_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill530_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill530_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill530_34)).doFinal(((byte[])(__sourceSpill530_33)));
        (__sourceSpill530_30)[__sourceSpill530_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
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
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4452_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/F9"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.F9.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 31296;
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
            throw new RuntimeException("moom/F9", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2) {
int forestValue252_62_0;
    int forestValue252_90_0;
    int forestValue252_101_0;
    int forestValue252_116_0;
    int forestValue252_130_0;
    int forestValue252_156_0;
    int forestValue252_160_0;
    int forestValue252_171_0;
    int forestValue252_175_0;
    net.minecraft.block.Block forestValue252_189_0;
    net.minecraft.block.Block forestValue252_189_1;
    int forestValue252_234_0;
    int forestValue252_234_1;
    int forestValue252_271_0;
    int forestValue252_271_1;
    int forestValue252_273_0;
    int forestValue252_301_0;
    int forestValue252_320_0;
    int forestValue252_320_1;
    int forestValue252_326_0;
    moom.fn forestValue252_348_0;
    moom.fn forestValue252_348_1;
    int forestValue252_362_0;
    int forestValue252_364_0;
    int[] spill252_0;
    int spill252_1;
    int spill252_2;
    int spill252_3;
    int spill252_4;
    int spill252_5;
    int spill252_6;
    int spill252_7;
    boolean spill252_8;
    net.minecraft.block.Block spill252_9;
    moom.dC spill252_10;
    int spill252_11;
    int spill252_12;
    int spill252_13;
    int spill252_14;
    int spill252_15;
    int spill252_16;
    int spill252_17;
    int spill252_18;
    int spill252_19;
    moom.fn spill252_20;
    moom.fn spill252_21;
    long life4_3;
    int life7_14;
    int life8_22;
    int[] life6_23;
    int life9_27;
    int life10_35;
    int life11_37;
    int life12_63;
    int life13_81;
    int life13_92;
    moom.DU life14_101;
    int life15_106;
    int life16_125;
    net.minecraft.block.Block life12_198;
    int life13_231;
    int life14_236;
    int life15_249;
    int life16_260;
    int life17_267;
    int life18_278;
    moom.DT life19_304;
    int life14_357;
    net.minecraft.block.Block life15_369;
    forest_join_364: {
    forest_join_363: {
    forest_join_362: {
    forest_join_361: {
    forest_join_359: {
    forest_join_326: {
    forest_join_325: {
    forest_join_190: {
    forest_join_189: {
    forest_join_176: {
    forest_join_175: {
    forest_join_171: {
    forest_join_170: {
    life4_3 = (moom.F9.e ^ 62454681996628L);
    spill252_0 = moom.FY.b();
    life7_14 = (((java.util.Random)(p1)).nextInt(((int)(5))) + __sourceIntrinsic_e7ba66b54646_invokedynamic252_3(772, (9211480848749329465L ^ life4_3)));
    life8_22 = ((life7_14 - ((java.util.Random)(p1)).nextInt(((int)(2)))) - 3);
    life6_23 = spill252_0;
    life9_27 = (life7_14 - life8_22);
    life10_35 = (1 + ((java.util.Random)(p1)).nextInt(((int)((life9_27 + 1)))));
    life11_37 = 1;
    spill252_1 = ((moom.DT)(p2)).b();
    if (!((life6_23 != null))) {
        forestValue252_364_0 = spill252_1;
        break forest_join_364;
    }
    if (!((spill252_1 >= 1))) {
        break forest_join_363;
    }
    spill252_2 = ((((moom.DT)(p2)).b() + life7_14) + 1);
    if (!((life6_23 != null))) {
        forestValue252_364_0 = spill252_2;
        break forest_join_364;
    }
    if (!((spill252_2 <= __sourceIntrinsic_e7ba66b54646_invokedynamic252_8(19263, (6535011746539090945L ^ life4_3))))) {
        break forest_join_363;
    }
    life12_63 = ((moom.DT)(p2)).b();
    forest_cycle_61: while (true) {
    forest_join_167: {
    forestValue252_62_0 = life12_63;
    forest_cycle_62: while (true) {
    forest_join_91: {
    forest_join_90: {
    forest_join_89: {
    if (!((forestValue252_62_0 <= ((((moom.DT)(p2)).b() + 1) + life7_14)))) {
        break forest_join_170;
    }
    spill252_3 = life11_37;
    if (!((life6_23 != null))) {
        forestValue252_171_0 = spill252_3;
        break forest_join_171;
    }
    if (!((life6_23 != null))) {
        forestValue252_171_0 = spill252_3;
        break forest_join_171;
    }
    if (!((spill252_3 != 0))) {
        break forest_join_170;
    }
    life13_81 = 1;
    spill252_4 = (life12_63 - ((moom.DT)(p2)).b());
    if (!((life6_23 != null))) {
        forestValue252_90_0 = spill252_4;
        break forest_join_90;
    }
    if (!((spill252_4 < life8_22))) {
        break forest_join_89;
    }
    life13_92 = 0;
    if (!((life6_23 == null))) {
        break forest_join_91;
    }
    }
    forestValue252_90_0 = life10_35;
    }
    life13_92 = forestValue252_90_0;
    }
    life14_101 = new moom.DU();
    life15_106 = (((moom.DT)(p2)).a() - life13_92);
    forest_cycle_100: while (true) {
    forest_join_164: {
    forestValue252_101_0 = life15_106;
    forest_cycle_101: while (true) {
    forest_join_116: {
    if (!((forestValue252_101_0 <= (((moom.DT)(p2)).a() + life13_92)))) {
        break forest_join_167;
    }
    spill252_5 = life11_37;
    if (!((life6_23 != null))) {
        forestValue252_62_0 = spill252_5;
        continue forest_cycle_62;
    }
    if (!((life6_23 != null))) {
        forestValue252_116_0 = spill252_5;
        break forest_join_116;
    }
    if (!((spill252_5 != 0))) {
        break forest_join_167;
    }
    forestValue252_116_0 = (((moom.DT)(p2)).c() - life13_92);
    }
    life16_125 = forestValue252_116_0;
    forest_cycle_117: while (true) {
    forest_join_161: {
    forest_join_160: {
    forest_join_159: {
    forest_join_156: {
    forest_join_130: {
    if (!((life16_125 <= (((moom.DT)(p2)).c() + life13_92)))) {
        break forest_join_164;
    }
    spill252_6 = life11_37;
    if (!((life6_23 != null))) {
        forestValue252_101_0 = spill252_6;
        continue forest_cycle_101;
    }
    if (!((life6_23 != null))) {
        forestValue252_130_0 = spill252_6;
        break forest_join_130;
    }
    if (!((spill252_6 != 0))) {
        break forest_join_164;
    }
    forestValue252_130_0 = life12_63;
    }
    if (!((life6_23 != null))) {
        forestValue252_160_0 = forestValue252_130_0;
        break forest_join_160;
    }
    if (!((forestValue252_130_0 >= 0))) {
        break forest_join_159;
    }
    spill252_7 = life12_63;
    if (!((life6_23 != null))) {
        forestValue252_160_0 = spill252_7;
        break forest_join_160;
    }
    if (!((spill252_7 < __sourceIntrinsic_e7ba66b54646_invokedynamic252_16(27367, (5559783127631697368L ^ life4_3))))) {
        break forest_join_159;
    }
    spill252_8 = ((moom.F9)(this)).a(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DU)(life14_101)).a(((int)(life15_106)), ((int)(life12_63)), ((int)(life16_125)))))))).a__ch())));
    if (!((life6_23 != null))) {
        forestValue252_156_0 = ((spill252_8) ? 1 : 0);
        break forest_join_156;
    }
    if (!((!spill252_8))) {
        break forest_join_161;
    }
    forestValue252_156_0 = 0;
    }
    life11_37 = forestValue252_156_0;
    if (!((life6_23 == null))) {
        break forest_join_161;
    }
    }
    forestValue252_160_0 = 0;
    }
    life11_37 = forestValue252_160_0;
    }
    life16_125 += 1;
    if (!((life6_23 == null))) {
        continue forest_cycle_117;
    }
    break forest_cycle_117;
    }
    break forest_cycle_101;
    }
    }
    life15_106 += 1;
    if (!((life6_23 == null))) {
        continue forest_cycle_100;
    }
    break forest_cycle_100;
    }
    break forest_cycle_62;
    }
    }
    life12_63 += 1;
    if (!((life6_23 == null))) {
        continue forest_cycle_61;
    }
    break forest_cycle_61;
    }
    }
    forestValue252_171_0 = life11_37;
    }
    if (!((life6_23 != null))) {
        forestValue252_175_0 = forestValue252_171_0;
        break forest_join_175;
    }
    if (!((forestValue252_171_0 == 0))) {
        break forest_join_176;
    }
    forestValue252_175_0 = 0;
    }
    return ((forestValue252_175_0) != 0);
    }
    life12_198 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p2)).b__DT()))))).a__ch();
    spill252_9 = life12_198;
    spill252_10 = net.minecraft.init.Blocks.c;
    if (!((life6_23 != null))) {
        forestValue252_189_0 = spill252_9;
        forestValue252_189_1 = spill252_10;
        break forest_join_189;
    }
    if (!((spill252_9 != spill252_10))) {
        break forest_join_190;
    }
    forestValue252_189_0 = life12_198;
    forestValue252_189_1 = net.minecraft.init.Blocks.d;
    }
    if (!((forestValue252_189_0 == forestValue252_189_1))) {
        break forest_join_361;
    }
    }
    spill252_11 = ((moom.DT)(p2)).b();
    if (!((life6_23 != null))) {
        forestValue252_362_0 = spill252_11;
        break forest_join_362;
    }
    if (!((spill252_11 < ((__sourceIntrinsic_e7ba66b54646_invokedynamic252_29(27367, (5559783127631697368L ^ life4_3)) - life7_14) - 1)))) {
        break forest_join_361;
    }
    ((moom.F9)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(p2)).b__DT())));
    life13_231 = 0;
    life14_236 = (((moom.DT)(p2)).b() + life7_14);
    forest_cycle_216: while (true) {
    forest_join_322: {
    forest_join_320: {
    forest_join_318: {
    forest_join_301: {
    forest_join_300: {
    if (!((life14_236 >= (((moom.DT)(p2)).b() + life8_22)))) {
        break forest_join_325;
    }
    spill252_12 = (((moom.DT)(p2)).a() - life13_231);
    if (!((life6_23 != null))) {
        forestValue252_326_0 = spill252_12;
        break forest_join_326;
    }
    life15_249 = spill252_12;
    forest_cycle_229: while (true) {
    forest_join_297: {
    forestValue252_234_0 = life15_249;
    forestValue252_234_1 = (((moom.DT)(p2)).a() + life13_231);
    forest_cycle_234: while (true) {
    if (!((forestValue252_234_0 <= forestValue252_234_1))) {
        break forest_join_300;
    }
    life16_260 = (life15_249 - ((moom.DT)(p2)).a());
    spill252_13 = (((moom.DT)(p2)).c() - life13_231);
    if (!((life6_23 != null))) {
        forestValue252_301_0 = spill252_13;
        break forest_join_301;
    }
    life17_267 = spill252_13;
    forest_cycle_247: while (true) {
    forest_join_295: {
    forest_join_294: {
    forest_join_274: {
    forest_join_273: {
    forest_join_271: {
    if (!((life17_267 <= (((moom.DT)(p2)).c() + life13_231)))) {
        break forest_join_297;
    }
    life18_278 = (life17_267 - ((moom.DT)(p2)).c());
    spill252_14 = java.lang.Math.abs(((int)(life16_260)));
    spill252_15 = life13_231;
    if (!((life6_23 != null))) {
        forestValue252_234_0 = spill252_14;
        forestValue252_234_1 = spill252_15;
        continue forest_cycle_234;
    }
    if (!((life6_23 != null))) {
        forestValue252_271_0 = spill252_14;
        forestValue252_271_1 = spill252_15;
        break forest_join_271;
    }
    if (!((spill252_14 == spill252_15))) {
        break forest_join_274;
    }
    spill252_16 = java.lang.Math.abs(((int)(life18_278)));
    if (!((life6_23 != null))) {
        forestValue252_273_0 = spill252_16;
        break forest_join_273;
    }
    forestValue252_271_0 = spill252_16;
    forestValue252_271_1 = life13_231;
    }
    if (!((forestValue252_271_0 == forestValue252_271_1))) {
        break forest_join_274;
    }
    forestValue252_273_0 = life13_231;
    }
    if (!((forestValue252_273_0 <= 0))) {
        break forest_join_294;
    }
    }
    life19_304 = new moom.DT(life15_249, life14_236, life17_267);
    if (!((life6_23 != null))) {
        break forest_join_295;
    }
    if (!((!((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life19_304))))).a__ch())).a__Boolean()))) {
        break forest_join_294;
    }
    ((moom.F9)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(life19_304)), ((net.minecraft.block.state.IBlockState)(moom.F9.d)));
    }
    life17_267 += 1;
    }
    if (!((life6_23 == null))) {
        continue forest_cycle_247;
    }
    break forest_cycle_247;
    }
    break forest_cycle_234;
    }
    }
    life15_249 += 1;
    if (!((life6_23 == null))) {
        continue forest_cycle_229;
    }
    break forest_cycle_229;
    }
    }
    forestValue252_301_0 = life13_231;
    }
    spill252_17 = 1;
    if (!((life6_23 != null))) {
        forestValue252_320_0 = forestValue252_301_0;
        forestValue252_320_1 = spill252_17;
        break forest_join_320;
    }
    if (!((forestValue252_301_0 >= spill252_17))) {
        break forest_join_318;
    }
    spill252_18 = life14_236;
    spill252_19 = ((((moom.DT)(p2)).b() + life8_22) + 1);
    if (!((life6_23 != null))) {
        forestValue252_320_0 = spill252_18;
        forestValue252_320_1 = spill252_19;
        break forest_join_320;
    }
    if (!((spill252_18 == spill252_19))) {
        break forest_join_318;
    }
    life13_231 += -1;
    if (!((life6_23 == null))) {
        break forest_join_322;
    }
    }
    forestValue252_320_0 = life13_231;
    forestValue252_320_1 = life10_35;
    }
    if (!((forestValue252_320_0 < forestValue252_320_1))) {
        break forest_join_322;
    }
    life13_231 += 1;
    }
    life14_236 += -1;
    if (!((life6_23 == null))) {
        continue forest_cycle_216;
    }
    break forest_cycle_216;
    }
    }
    forestValue252_326_0 = 0;
    }
    life14_357 = forestValue252_326_0;
    forest_cycle_327: while (true) {
    forest_join_356: {
    forest_join_349: {
    forest_join_348: {
    if (!((life14_357 < (life7_14 - 1)))) {
        break forest_join_359;
    }
    life15_369 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p2)).a(((int)(life14_357)))))))).a__ch();
    spill252_20 = ((net.minecraft.block.Block)(life15_369)).a__fn();
    spill252_21 = moom.fn.a;
    if (!((life6_23 != null))) {
        forestValue252_348_0 = spill252_20;
        forestValue252_348_1 = spill252_21;
        break forest_join_348;
    }
    if (!((spill252_20 != spill252_21))) {
        break forest_join_349;
    }
    forestValue252_348_0 = ((net.minecraft.block.Block)(life15_369)).a__fn();
    forestValue252_348_1 = moom.fn.j;
    }
    if (!((forestValue252_348_0 == forestValue252_348_1))) {
        break forest_join_356;
    }
    }
    ((moom.F9)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(p2)).a(((int)(life14_357))))), ((net.minecraft.block.state.IBlockState)(moom.F9.c)));
    }
    life14_357 += 1;
    if (!((life6_23 == null))) {
        continue forest_cycle_327;
    }
    break forest_cycle_327;
    }
    }
    return ((1) != 0);
    }
    forestValue252_362_0 = 0;
    }
    return ((forestValue252_362_0) != 0);
    }
    forestValue252_364_0 = 0;
    }
    return ((forestValue252_364_0) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4452_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic252_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic252_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic252_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic252_29(int a0, long a1) throws E;
}
