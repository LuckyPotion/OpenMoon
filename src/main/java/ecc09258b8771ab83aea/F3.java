package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class F3 extends moom.F0 {

private static final net.minecraft.block.state.IBlockState c;

private static final net.minecraft.block.state.IBlockState d;

private final boolean e;

private static final long f;

private static final long[] g;

private static final java.lang.Integer[] h;

private static final java.util.Map i;

public F3(boolean p0, boolean p1) {
super(p0);
    this.e = p1;
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(-3462946923302595769L)), ((long)(-3877659090058425540L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(24269690414645L)))));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.F3.f ^ 38735145028000L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill527_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill527_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill527_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill527_14 = new byte[8];
    (__sourceSpill527_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill527_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation527_16 = __sourceSpill527_14;
    ((javax.crypto.Cipher)(__sourceSpill527_11)).init(((int)(__sourceSpill527_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill527_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation527_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "«$Ó\róÙ`EVÞ\0016\031t\031ê\020û×\n^"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill527_25 = local6_life21;
        int __sourceSpill527_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill527_25)).substring(((int)(__sourceSpill527_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill527_30 = local8_life19;
        int __sourceSpill527_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill527_33 = new byte[8];
        (__sourceSpill527_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill527_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill527_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill527_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill527_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill527_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill527_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill527_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill527_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill527_34)).doFinal(((byte[])(__sourceSpill527_33)));
        (__sourceSpill527_30)[__sourceSpill527_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    g = ((long[])(local8_life19));
    h = ((java.lang.Integer[])(new java.lang.Integer[3]));
    c = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.ee.S)), ((java.lang.Comparable)(net.minecraft.block.BlockPlanks$EnumType.BIRCH)))));
    d = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.dH)(net.minecraft.init.Blocks.t)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dJ.W)), ((java.lang.Comparable)(net.minecraft.block.BlockPlanks$EnumType.BIRCH))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.dJ.S)), ((java.lang.Comparable)(java.lang.Boolean.FALSE)))));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4428_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/F3"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.F3.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 6476;
      if (h[var3] == null) {
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
         long var5 = g[var3];
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
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/F3", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2) {
int forestValue611_28_0;
    int forestValue611_53_0;
    int forestValue611_83_0;
    int forestValue611_83_1;
    int forestValue611_85_0;
    int forestValue611_96_0;
    int forestValue611_111_0;
    int forestValue611_125_0;
    int forestValue611_151_0;
    int forestValue611_155_0;
    int forestValue611_166_0;
    int forestValue611_170_0;
    net.minecraft.block.Block forestValue611_184_0;
    net.minecraft.block.Block forestValue611_184_1;
    net.minecraft.block.Block forestValue611_189_0;
    net.minecraft.block.Block forestValue611_189_1;
    int forestValue611_217_0;
    int forestValue611_247_0;
    int forestValue611_247_1;
    int forestValue611_284_0;
    int forestValue611_284_1;
    int forestValue611_288_0;
    int forestValue611_292_0;
    moom.fn forestValue611_314_0;
    moom.fn forestValue611_314_1;
    int forestValue611_330_0;
    moom.fn forestValue611_350_0;
    moom.fn forestValue611_350_1;
    int forestValue611_364_0;
    int forestValue611_366_0;
    int[] spill611_0;
    boolean spill611_1;
    int spill611_2;
    int spill611_3;
    int spill611_4;
    int spill611_5;
    int spill611_6;
    int spill611_7;
    int spill611_8;
    int spill611_9;
    boolean spill611_10;
    net.minecraft.block.Block spill611_11;
    moom.dC spill611_12;
    int spill611_13;
    int spill611_14;
    int spill611_15;
    int spill611_16;
    int spill611_17;
    int spill611_18;
    moom.fn spill611_19;
    moom.fn spill611_20;
    moom.fn spill611_21;
    moom.fn spill611_22;
    long life4_3;
    int life7_10;
    int[] life6_11;
    int life8_29;
    int life9_55;
    int life10_65;
    moom.DU life11_96;
    int life12_101;
    int life13_120;
    net.minecraft.block.Block life9_193;
    int life10_238;
    int life11_251;
    int life12_257;
    int life13_264;
    int life14_275;
    int life15_282;
    int life16_293;
    moom.DT life17_327;
    net.minecraft.block.Block life18_332;
    int life10_361;
    net.minecraft.block.Block life11_371;
    forest_join_366: {
    forest_join_365: {
    forest_join_364: {
    forest_join_363: {
    forest_join_361: {
    forest_join_330: {
    forest_join_329: {
    forest_join_190: {
    forest_join_189: {
    forest_join_184: {
    forest_join_171: {
    forest_join_170: {
    forest_join_166: {
    forest_join_165: {
    forest_join_28: {
    forest_join_27: {
    life4_3 = (moom.F3.f ^ 119518878261767L);
    spill611_0 = moom.FY.b();
    life7_10 = (((java.util.Random)(p1)).nextInt(((int)(3))) + 5);
    life6_11 = spill611_0;
    spill611_1 = this.e;
    if (!((life6_11 != null))) {
        forestValue611_28_0 = ((spill611_1) ? 1 : 0);
        break forest_join_28;
    }
    if (!(spill611_1)) {
        break forest_join_27;
    }
    life7_10 = (life7_10 + ((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_e7ba66b54646_invokedynamic611_5(15501, (7287452492032057532L ^ life4_3))))));
    }
    forestValue611_28_0 = 1;
    }
    life8_29 = forestValue611_28_0;
    spill611_2 = ((moom.DT)(p2)).b();
    if (!((life6_11 != null))) {
        forestValue611_366_0 = spill611_2;
        break forest_join_366;
    }
    if (!((spill611_2 >= 1))) {
        break forest_join_365;
    }
    spill611_3 = ((((moom.DT)(p2)).b() + life7_10) + 1);
    if (!((life6_11 != null))) {
        forestValue611_366_0 = spill611_3;
        break forest_join_366;
    }
    if (!((spill611_3 <= __sourceIntrinsic_e7ba66b54646_invokedynamic611_9(1892, (2193334906451630934L ^ life4_3))))) {
        break forest_join_365;
    }
    life9_55 = ((moom.DT)(p2)).b();
    forest_cycle_52: while (true) {
    forest_join_162: {
    forestValue611_53_0 = life9_55;
    forest_cycle_53: while (true) {
    forest_join_86: {
    forest_join_85: {
    forest_join_83: {
    forest_join_72: {
    if (!((forestValue611_53_0 <= ((((moom.DT)(p2)).b() + 1) + life7_10)))) {
        break forest_join_165;
    }
    life10_65 = 1;
    spill611_4 = life9_55;
    if (!((life6_11 != null))) {
        forestValue611_166_0 = spill611_4;
        break forest_join_166;
    }
    spill611_5 = ((moom.DT)(p2)).b();
    if (!((life6_11 != null))) {
        forestValue611_83_0 = spill611_4;
        forestValue611_83_1 = spill611_5;
        break forest_join_83;
    }
    if (!((spill611_4 == spill611_5))) {
        break forest_join_72;
    }
    life10_65 = 0;
    }
    spill611_6 = life9_55;
    if (!((life6_11 != null))) {
        forestValue611_85_0 = spill611_6;
        break forest_join_85;
    }
    forestValue611_83_0 = spill611_6;
    forestValue611_83_1 = (((((moom.DT)(p2)).b() + 1) + life7_10) - 2);
    }
    if (!((forestValue611_83_0 >= forestValue611_83_1))) {
        break forest_join_86;
    }
    forestValue611_85_0 = 2;
    }
    life10_65 = forestValue611_85_0;
    }
    life11_96 = new moom.DU();
    life12_101 = (((moom.DT)(p2)).a() - life10_65);
    forest_cycle_95: while (true) {
    forest_join_159: {
    forestValue611_96_0 = life12_101;
    forest_cycle_96: while (true) {
    forest_join_111: {
    if (!((forestValue611_96_0 <= (((moom.DT)(p2)).a() + life10_65)))) {
        break forest_join_162;
    }
    spill611_7 = life8_29;
    if (!((life6_11 != null))) {
        forestValue611_53_0 = spill611_7;
        continue forest_cycle_53;
    }
    if (!((life6_11 != null))) {
        forestValue611_111_0 = spill611_7;
        break forest_join_111;
    }
    if (!((spill611_7 != 0))) {
        break forest_join_162;
    }
    forestValue611_111_0 = (((moom.DT)(p2)).c() - life10_65);
    }
    life13_120 = forestValue611_111_0;
    forest_cycle_112: while (true) {
    forest_join_156: {
    forest_join_155: {
    forest_join_154: {
    forest_join_151: {
    forest_join_125: {
    if (!((life13_120 <= (((moom.DT)(p2)).c() + life10_65)))) {
        break forest_join_159;
    }
    spill611_8 = life8_29;
    if (!((life6_11 != null))) {
        forestValue611_96_0 = spill611_8;
        continue forest_cycle_96;
    }
    if (!((life6_11 != null))) {
        forestValue611_125_0 = spill611_8;
        break forest_join_125;
    }
    if (!((spill611_8 != 0))) {
        break forest_join_159;
    }
    forestValue611_125_0 = life9_55;
    }
    if (!((life6_11 != null))) {
        forestValue611_155_0 = forestValue611_125_0;
        break forest_join_155;
    }
    if (!((forestValue611_125_0 >= 0))) {
        break forest_join_154;
    }
    spill611_9 = life9_55;
    if (!((life6_11 != null))) {
        forestValue611_155_0 = spill611_9;
        break forest_join_155;
    }
    if (!((spill611_9 < __sourceIntrinsic_e7ba66b54646_invokedynamic611_18(17451, (3034057978230331416L ^ life4_3))))) {
        break forest_join_154;
    }
    spill611_10 = ((moom.F3)(this)).a(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DU)(life11_96)).a(((int)(life12_101)), ((int)(life9_55)), ((int)(life13_120)))))))).a__ch())));
    if (!((life6_11 != null))) {
        forestValue611_151_0 = ((spill611_10) ? 1 : 0);
        break forest_join_151;
    }
    if (!((!spill611_10))) {
        break forest_join_156;
    }
    forestValue611_151_0 = 0;
    }
    life8_29 = forestValue611_151_0;
    if (!((life6_11 == null))) {
        break forest_join_156;
    }
    }
    forestValue611_155_0 = 0;
    }
    life8_29 = forestValue611_155_0;
    }
    life13_120 += 1;
    if (!((life6_11 == null))) {
        continue forest_cycle_112;
    }
    break forest_cycle_112;
    }
    break forest_cycle_96;
    }
    }
    life12_101 += 1;
    if (!((life6_11 == null))) {
        continue forest_cycle_95;
    }
    break forest_cycle_95;
    }
    break forest_cycle_53;
    }
    }
    life9_55 += 1;
    if (!((life6_11 == null))) {
        continue forest_cycle_52;
    }
    break forest_cycle_52;
    }
    }
    forestValue611_166_0 = life8_29;
    }
    if (!((life6_11 != null))) {
        forestValue611_170_0 = forestValue611_166_0;
        break forest_join_170;
    }
    if (!((forestValue611_166_0 == 0))) {
        break forest_join_171;
    }
    forestValue611_170_0 = 0;
    }
    return ((forestValue611_170_0) != 0);
    }
    life9_193 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p2)).b__DT()))))).a__ch();
    spill611_11 = life9_193;
    spill611_12 = net.minecraft.init.Blocks.c;
    if (!((life6_11 != null))) {
        forestValue611_184_0 = spill611_11;
        forestValue611_184_1 = spill611_12;
        break forest_join_184;
    }
    if (!((spill611_11 != spill611_12))) {
        break forest_join_190;
    }
    forestValue611_184_0 = life9_193;
    forestValue611_184_1 = net.minecraft.init.Blocks.d;
    }
    if (!((life6_11 != null))) {
        forestValue611_189_0 = forestValue611_184_0;
        forestValue611_189_1 = forestValue611_184_1;
        break forest_join_189;
    }
    if (!((forestValue611_184_0 != forestValue611_184_1))) {
        break forest_join_190;
    }
    forestValue611_189_0 = life9_193;
    forestValue611_189_1 = net.minecraft.init.Blocks.ak;
    }
    if (!((forestValue611_189_0 == forestValue611_189_1))) {
        break forest_join_363;
    }
    }
    spill611_13 = ((moom.DT)(p2)).b();
    if (!((life6_11 != null))) {
        forestValue611_364_0 = spill611_13;
        break forest_join_364;
    }
    if (!((spill611_13 < ((__sourceIntrinsic_e7ba66b54646_invokedynamic611_32(17451, (3034057978230331416L ^ life4_3)) - life7_10) - 1)))) {
        break forest_join_363;
    }
    ((moom.F3)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(p2)).b__DT())));
    life10_238 = ((((moom.DT)(p2)).b() - 3) + life7_10);
    forest_cycle_216: while (true) {
    forest_join_326: {
    forestValue611_217_0 = life10_238;
    forest_cycle_217: while (true) {
    if (!((forestValue611_217_0 <= (((moom.DT)(p2)).b() + life7_10)))) {
        break forest_join_329;
    }
    life11_251 = (life10_238 - (((moom.DT)(p2)).b() + life7_10));
    life12_257 = (1 - (life11_251 / 2));
    spill611_14 = (((moom.DT)(p2)).a() - life12_257);
    if (!((life6_11 != null))) {
        forestValue611_330_0 = spill611_14;
        break forest_join_330;
    }
    life13_264 = spill611_14;
    forest_cycle_242: while (true) {
    forest_join_323: {
    forestValue611_247_0 = life13_264;
    forestValue611_247_1 = (((moom.DT)(p2)).a() + life12_257);
    forest_cycle_247: while (true) {
    if (!((forestValue611_247_0 <= forestValue611_247_1))) {
        break forest_join_326;
    }
    life14_275 = (life13_264 - ((moom.DT)(p2)).a());
    spill611_15 = (((moom.DT)(p2)).c() - life12_257);
    if (!((life6_11 != null))) {
        forestValue611_217_0 = spill611_15;
        continue forest_cycle_217;
    }
    life15_282 = spill611_15;
    forest_cycle_260: while (true) {
    forest_join_320: {
    forest_join_315: {
    forest_join_314: {
    forest_join_293: {
    forest_join_292: {
    forest_join_288: {
    forest_join_284: {
    if (!((life15_282 <= (((moom.DT)(p2)).c() + life12_257)))) {
        break forest_join_323;
    }
    life16_293 = (life15_282 - ((moom.DT)(p2)).c());
    spill611_16 = java.lang.Math.abs(((int)(life14_275)));
    spill611_17 = life12_257;
    if (!((life6_11 != null))) {
        forestValue611_247_0 = spill611_16;
        forestValue611_247_1 = spill611_17;
        continue forest_cycle_247;
    }
    if (!((life6_11 != null))) {
        forestValue611_284_0 = spill611_16;
        forestValue611_284_1 = spill611_17;
        break forest_join_284;
    }
    if (!((spill611_16 == spill611_17))) {
        break forest_join_293;
    }
    spill611_18 = java.lang.Math.abs(((int)(life16_293)));
    if (!((life6_11 != null))) {
        forestValue611_288_0 = spill611_18;
        break forest_join_288;
    }
    forestValue611_284_0 = spill611_18;
    forestValue611_284_1 = life12_257;
    }
    if (!((forestValue611_284_0 == forestValue611_284_1))) {
        break forest_join_293;
    }
    forestValue611_288_0 = ((java.util.Random)(p1)).nextInt(((int)(2)));
    }
    if (!((life6_11 != null))) {
        forestValue611_292_0 = forestValue611_288_0;
        break forest_join_292;
    }
    if (!((forestValue611_288_0 != 0))) {
        break forest_join_320;
    }
    forestValue611_292_0 = life11_251;
    }
    if (!((forestValue611_292_0 != 0))) {
        break forest_join_320;
    }
    }
    life17_327 = new moom.DT(life13_264, life10_238, life15_282);
    life18_332 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life17_327))))).a__ch();
    spill611_19 = ((net.minecraft.block.Block)(life18_332)).a__fn();
    spill611_20 = moom.fn.a;
    if (!((life6_11 != null))) {
        forestValue611_314_0 = spill611_19;
        forestValue611_314_1 = spill611_20;
        break forest_join_314;
    }
    if (!((spill611_19 != spill611_20))) {
        break forest_join_315;
    }
    forestValue611_314_0 = ((net.minecraft.block.Block)(life18_332)).a__fn();
    forestValue611_314_1 = moom.fn.j;
    }
    if (!((forestValue611_314_0 == forestValue611_314_1))) {
        break forest_join_320;
    }
    }
    ((moom.F3)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(life17_327)), ((net.minecraft.block.state.IBlockState)(moom.F3.d)));
    }
    life15_282 += 1;
    if (!((life6_11 == null))) {
        continue forest_cycle_260;
    }
    break forest_cycle_260;
    }
    break forest_cycle_247;
    }
    }
    life13_264 += 1;
    if (!((life6_11 == null))) {
        continue forest_cycle_242;
    }
    break forest_cycle_242;
    }
    break forest_cycle_217;
    }
    }
    life10_238 += 1;
    if (!((life6_11 == null))) {
        continue forest_cycle_216;
    }
    break forest_cycle_216;
    }
    }
    forestValue611_330_0 = 0;
    }
    life10_361 = forestValue611_330_0;
    forest_cycle_331: while (true) {
    forest_join_358: {
    forest_join_351: {
    forest_join_350: {
    if (!((life10_361 < life7_10))) {
        break forest_join_361;
    }
    life11_371 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p2)).a(((int)(life10_361)))))))).a__ch();
    spill611_21 = ((net.minecraft.block.Block)(life11_371)).a__fn();
    spill611_22 = moom.fn.a;
    if (!((life6_11 != null))) {
        forestValue611_350_0 = spill611_21;
        forestValue611_350_1 = spill611_22;
        break forest_join_350;
    }
    if (!((spill611_21 != spill611_22))) {
        break forest_join_351;
    }
    forestValue611_350_0 = ((net.minecraft.block.Block)(life11_371)).a__fn();
    forestValue611_350_1 = moom.fn.j;
    }
    if (!((forestValue611_350_0 == forestValue611_350_1))) {
        break forest_join_358;
    }
    }
    ((moom.F3)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(p2)).a(((int)(life10_361))))), ((net.minecraft.block.state.IBlockState)(moom.F3.c)));
    }
    life10_361 += 1;
    if (!((life6_11 == null))) {
        continue forest_cycle_331;
    }
    break forest_cycle_331;
    }
    }
    return ((1) != 0);
    }
    forestValue611_364_0 = 0;
    }
    return ((forestValue611_364_0) != 0);
    }
    forestValue611_366_0 = 0;
    }
    return ((forestValue611_366_0) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4428_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic611_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic611_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic611_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic611_32(int a0, long a1) throws E;
}
