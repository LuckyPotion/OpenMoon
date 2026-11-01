package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class ds extends net.minecraft.block.Block {

private static final long Q;

private static final long[] R;

private static final java.lang.Integer[] S;

private static final java.util.Map T;

public ds() {
super(moom.fn.D, moom.fm.E);
    (this).a(0x1.0000000000000p-4f, 0x0.0p+0f, 0x1.0000000000000p-4f, 0x1.e000000000000p-1f, 0x1.0000000000000p+0f, 0x1.e000000000000p-1f);
}


static {
javax.crypto.Cipher forestValue442_36_0;
    int forestValue442_36_1;
    javax.crypto.SecretKeyFactory forestValue442_36_2;
    byte[] forestValue442_36_3;
    javax.crypto.Cipher forestValue442_53_0;
    int forestValue442_53_1;
    javax.crypto.SecretKeyFactory forestValue442_53_2;
    byte[] forestValue442_53_3;
    long[] forestValue442_157_0;
    int forestValue442_157_1;
    long forestValue442_157_2;
    int forestValue442_157_3;
    long[] forestValue442_300_0;
    int forestValue442_300_1;
    long forestValue442_300_2;
    long[] forestValue442_312_0;
    int forestValue442_312_1;
    long forestValue442_312_2;
    javax.crypto.Cipher spill442_0;
    int spill442_1;
    javax.crypto.SecretKeyFactory spill442_2;
    byte[] spill442_3;
    byte[] spill442_4;
    java.lang.String spill442_5;
    int spill442_6;
    int spill442_7;
    long spill442_8;
    byte[] spill442_9;
    byte[] spill442_10;
    byte[] spill442_11;
    byte[] spill442_12;
    byte[] spill442_13;
    byte[] spill442_14;
    byte[] spill442_15;
    byte[] spill442_16;
    long spill442_17;
    int spill442_18;
    java.lang.String spill442_19;
    int spill442_20;
    long[] spill442_21;
    int spill442_22;
    long spill442_23;
    int spill442_24;
    long life0_16;
    javax.crypto.Cipher life2_20;
    int life3_35;
    long[] life8_66;
    int life5_68;
    java.lang.String life6_71;
    int life7_73;
    int life4_75;
    byte[] life9_83;
    long life10_160;
    byte[] life12_228;
    byte[] life9_325;
    forest_join_399: {
    forest_join_53: {
    Q = ((long)(((moom._a)(moom._c.a(((long)(-2518287507220686391L)), ((long)(424555289141033865L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(185784622817599L)))));
    T = ((java.util.Map)(new java.util.HashMap(13)));
    life0_16 = (moom.ds.Q ^ 31924942007641L);
    spill442_0 = (life2_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill442_1 = 2;
    spill442_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp442_9_0 = new byte[8];
    spill442_3 = __stackOp442_9_0;
    (__stackOp442_9_0)[0] = ((byte) ((int) (life0_16 >>> 56)));
    life3_35 = 1;
    forestValue442_36_0 = spill442_0;
    forestValue442_36_1 = spill442_1;
    forestValue442_36_2 = spill442_2;
    forestValue442_36_3 = spill442_3;
    forest_cycle_36: while (true) {
    if (!((life3_35 < 8))) {
        forestValue442_53_0 = forestValue442_36_0;
        forestValue442_53_1 = forestValue442_36_1;
        forestValue442_53_2 = forestValue442_36_2;
        forestValue442_53_3 = forestValue442_36_3;
        break forest_join_53;
    }
    byte[] __stackOp442_10_0 = forestValue442_36_3;
    spill442_4 = __stackOp442_10_0;
    (__stackOp442_10_0)[life3_35] = ((byte) ((int) ((life0_16 << (life3_35 * 8)) >>> 56)));
    life3_35 += 1;
    forestValue442_36_3 = spill442_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue442_53_0)).init(((int)(forestValue442_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue442_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue442_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life8_66 = new long[7];
    life5_68 = 0;
    life7_73 = ((java.lang.String)((life6_71 = ":w¬Â¼Æ\021íuÂÆª¾)ã6Õì\0135¹~òê·\024kà{ÑR·8\034®"))).length();
    life4_75 = 0;
    forest_cycle_76: while (true) {
    spill442_5 = life6_71;
    spill442_6 = life4_75;
    life4_75 += 8;
    life9_83 = ((java.lang.String)(((java.lang.String)(spill442_5)).substring(((int)(spill442_6)), ((int)(life4_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    forestValue442_157_0 = life8_66;
    forestValue442_157_1 = (life5_68++);
    forestValue442_157_2 = (((((((((((long) (life9_83)[0]) & 255L) << 56) | ((((long) (life9_83)[1]) & 255L) << 48)) | ((((long) (life9_83)[2]) & 255L) << 40)) | ((((long) (life9_83)[3]) & 255L) << 32)) | ((((long) (life9_83)[4]) & 255L) << 24)) | ((((long) (life9_83)[5]) & 255L) << 16)) | ((((long) (life9_83)[6]) & 255L) << 8)) | (((long) (life9_83)[7]) & 255L));
    forestValue442_157_3 = -1;
    forest_cycle_157: while (true) {
    forest_join_317: {
    forest_join_312: {
    forest_join_300: {
    long __stackOp442_16_0 = forestValue442_157_2;
    int __stackOp442_16_1 = forestValue442_157_3;
    spill442_7 = __stackOp442_16_1;
    spill442_8 = __stackOp442_16_0;
    recovery.source.CarrierOps.discard(__stackOp442_16_1);
    life10_160 = spill442_8;
    byte[] __stackOp442_18_0 = new byte[8];
    spill442_9 = __stackOp442_18_0;
    (__stackOp442_18_0)[0] = ((byte) ((int) (life10_160 >>> 56)));
    byte[] __stackOp442_19_0 = spill442_9;
    spill442_10 = __stackOp442_19_0;
    (__stackOp442_19_0)[1] = ((byte) ((int) (life10_160 >>> 48)));
    byte[] __stackOp442_20_0 = spill442_10;
    spill442_11 = __stackOp442_20_0;
    (__stackOp442_20_0)[2] = ((byte) ((int) (life10_160 >>> 40)));
    byte[] __stackOp442_21_0 = spill442_11;
    spill442_12 = __stackOp442_21_0;
    (__stackOp442_21_0)[3] = ((byte) ((int) (life10_160 >>> 32)));
    byte[] __stackOp442_22_0 = spill442_12;
    spill442_13 = __stackOp442_22_0;
    (__stackOp442_22_0)[4] = ((byte) ((int) (life10_160 >>> 24)));
    byte[] __stackOp442_23_0 = spill442_13;
    spill442_14 = __stackOp442_23_0;
    (__stackOp442_23_0)[5] = ((byte) ((int) (life10_160 >>> 16)));
    byte[] __stackOp442_24_0 = spill442_14;
    spill442_15 = __stackOp442_24_0;
    (__stackOp442_24_0)[6] = ((byte) ((int) (life10_160 >>> 8)));
    byte[] __stackOp442_25_0 = spill442_15;
    spill442_16 = __stackOp442_25_0;
    (__stackOp442_25_0)[7] = ((byte) ((int) life10_160));
    byte[] __stackOp442_26_0 = spill442_16;
    javax.crypto.Cipher __stackOp442_26_1 = life2_20;
    life12_228 = ((javax.crypto.Cipher)(__stackOp442_26_1)).doFinal(((byte[])(__stackOp442_26_0)));
    int __stackOp442_28_0 = spill442_7;
    long __stackOp442_28_1 = (((((((((((long) (life12_228)[0]) & 255L) << 56) | ((((long) (life12_228)[1]) & 255L) << 48)) | ((((long) (life12_228)[2]) & 255L) << 40)) | ((((long) (life12_228)[3]) & 255L) << 32)) | ((((long) (life12_228)[4]) & 255L) << 24)) | ((((long) (life12_228)[5]) & 255L) << 16)) | ((((long) (life12_228)[6]) & 255L) << 8)) | (((long) (life12_228)[7]) & 255L));
    spill442_17 = __stackOp442_28_1;
    spill442_18 = __stackOp442_28_0;
    recovery.source.CarrierOps.discard(__stackOp442_28_1);
    switch (spill442_18) {
default:
{
        forestValue442_300_0 = forestValue442_157_0;
        forestValue442_300_1 = forestValue442_157_1;
        forestValue442_300_2 = spill442_17;
        break forest_join_300;
    }
case 0:
{
        forestValue442_312_0 = forestValue442_157_0;
        forestValue442_312_1 = forestValue442_157_1;
        forestValue442_312_2 = spill442_17;
        break forest_join_312;
    }
}
    }
    (forestValue442_300_0)[forestValue442_300_1] = forestValue442_300_2;
    if (!((life4_75 >= life7_73))) {
        continue forest_cycle_76;
    }
    life7_73 = ((java.lang.String)((life6_71 = "ÃÜÈ\006HÝmÆ1+Z\0063á"))).length();
    life4_75 = 0;
    break forest_join_317;
    }
    (forestValue442_312_0)[forestValue442_312_1] = forestValue442_312_2;
    if (!((life4_75 >= life7_73))) {
        break forest_join_317;
    }
    break forest_join_399;
    }
    spill442_19 = life6_71;
    spill442_20 = life4_75;
    life4_75 += 8;
    life9_325 = ((java.lang.String)(((java.lang.String)(spill442_19)).substring(((int)(spill442_20)), ((int)(life4_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    spill442_21 = life8_66;
    spill442_22 = (life5_68++);
    spill442_23 = (((((((((((long) (life9_325)[0]) & 255L) << 56) | ((((long) (life9_325)[1]) & 255L) << 48)) | ((((long) (life9_325)[2]) & 255L) << 40)) | ((((long) (life9_325)[3]) & 255L) << 32)) | ((((long) (life9_325)[4]) & 255L) << 24)) | ((((long) (life9_325)[5]) & 255L) << 16)) | ((((long) (life9_325)[6]) & 255L) << 8)) | (((long) (life9_325)[7]) & 255L));
    spill442_24 = 0;
    forestValue442_157_0 = spill442_21;
    forestValue442_157_1 = spill442_22;
    forestValue442_157_2 = spill442_23;
    forestValue442_157_3 = spill442_24;
    continue forest_cycle_157;
    }
    }
    }
    R = ((long[])(life8_66));
    S = ((java.lang.Integer[])(new java.lang.Integer[7]));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7407_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/ds"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 16210;
      if (S[var3] == null) {
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
         long var5 = R[var3];
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
         Object[] var9 = (Object[])T.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               T.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/ds", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         S[var3] = var15;
      }

      return S[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.ds.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void b(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
((moom.ds)(this)).b__sourceReturn_bfedcc9a42(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    return;
}


private void b__sourceReturn_bfedcc9a42(net.minecraft.world.World p0, moom.DT p1) {
int lexicalValue1122_15_0;
    int lexicalValue1122_23_0;
    int lexicalValue1122_75_0;
    int lexicalValue1122_96_0;
    int lexicalValue1122_105_0;
    boolean spill1122_0;
    boolean spill1122_1;
    boolean spill1122_2;
    int spill1122_3;
    long life3_3;
    int[] life5_5;
    int life6_32;
    moom.DT life7_101;
    lexical_join_106: {
    lexical_join_105: {
    lexical_join_96: {
    lexical_join_94: {
    lexical_join_75: {
    lexical_join_72: {
    lexical_join_23: {
    lexical_join_15: {
    life3_3 = (moom.ds.Q ^ 111057655995322L);
    life5_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill1122_0 = moom.du.c__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(p1)).b__DT())));
    if (!((life5_5 != null))) {
        lexicalValue1122_15_0 = ((spill1122_0) ? 1 : 0);
        break lexical_join_15;
    }
    if (!(spill1122_0)) {
        break lexical_join_106;
    }
    lexicalValue1122_15_0 = ((moom.DT)(p1)).b();
    }
    if (!((life5_5 != null))) {
        lexicalValue1122_23_0 = lexicalValue1122_15_0;
        break lexical_join_23;
    }
    if (!((lexicalValue1122_15_0 >= 0))) {
        break lexical_join_106;
    }
    lexicalValue1122_23_0 = __sourceIntrinsic_6d923203f1ab_invokedynamic1122_6(6107, (6552381529985807633L ^ life3_3));
    }
    life6_32 = lexicalValue1122_23_0;
    spill1122_1 = moom.du.Q;
    if (!((life5_5 != null))) {
        lexicalValue1122_75_0 = ((spill1122_1) ? 1 : 0);
        break lexical_join_75;
    }
    if (!((!spill1122_1))) {
        break lexical_join_72;
    }
    spill1122_2 = ((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(((moom.DT)(p1)).a(((int)((-life6_32))), ((int)((-life6_32))), ((int)((-life6_32)))))), ((moom.DT)(((moom.DT)(p1)).a(((int)(life6_32)), ((int)(life6_32)), ((int)(life6_32))))));
    if (!((life5_5 != null))) {
        lexicalValue1122_75_0 = ((spill1122_2) ? 1 : 0);
        break lexical_join_75;
    }
    if (!(spill1122_2)) {
        break lexical_join_72;
    }
    ((net.minecraft.world.World)(p0)).b__Boolean(((net.minecraft.entity.Entity)(new net.minecraft.entity.item.EntityFallingBlock(p0, ((double) (((float) ((moom.DT)(p1)).a()) + 0x1.0p-1f)), ((double) ((moom.DT)(p1)).b()), ((double) (((float) ((moom.DT)(p1)).c()) + 0x1.0p-1f)), ((moom.ds)(this)).a__fE()))));
    if (!((life5_5 == null))) {
        break lexical_join_106;
    }
    }
    lexicalValue1122_75_0 = ((((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(p1)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1122_75_0);
    life7_101 = p1;
    lexical_cycle_78: while (true) {
    if (!(moom.du.c__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(life7_101))))) {
        break lexical_join_94;
    }
    spill1122_3 = ((moom.DT)(life7_101)).b();
    if (!((life5_5 != null))) {
        lexicalValue1122_96_0 = spill1122_3;
        break lexical_join_96;
    }
    if (!((life5_5 != null))) {
        lexicalValue1122_96_0 = spill1122_3;
        break lexical_join_96;
    }
    if (!((spill1122_3 > 0))) {
        break lexical_join_94;
    }
    life7_101 = ((moom.DT)(life7_101)).b__DT();
    if (!((life5_5 == null))) { continue lexical_cycle_78; }
    break lexical_cycle_78;
    }
    }
    lexicalValue1122_96_0 = ((moom.DT)(life7_101)).b();
    }
    if (!((life5_5 != null))) {
        lexicalValue1122_105_0 = lexicalValue1122_96_0;
        break lexical_join_105;
    }
    if (!((lexicalValue1122_96_0 > 0))) {
        break lexical_join_106;
    }
    lexicalValue1122_105_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(life7_101)), ((net.minecraft.block.state.IBlockState)(((moom.ds)(this)).a__fE())), ((int)(2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1122_105_0);
    }
    return;
}


public void b__Void(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.Block)(this)), ((int)(((moom.ds)(this)).a(((net.minecraft.world.World)(p0))))));
    return;
}


private void c(net.minecraft.world.World p0, moom.DT p1) {
int lexicalValue1123_219_0;
    int[] spill1123_0;
    boolean spill1123_1;
    long life3_3;
    net.minecraft.block.state.IBlockState life6_8;
    int[] life5_9;
    int life7_15;
    moom.DT life8_76;
    int life9_101;
    double life10_112;
    float life12_120;
    float life13_128;
    float life14_136;
    double life15_157;
    double life17_176;
    double life19_197;
    lexical_join_224: {
    life3_3 = (moom.ds.Q ^ 136238657982542L);
    spill1123_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_8 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1)));
    life5_9 = spill1123_0;
    if (!((((net.minecraft.block.state.IBlockState)(life6_8)).a__ch() == this))) {
        break lexical_join_224;
    }
    life7_15 = 0;
    lexical_cycle_16: while (true) {
    lexical_join_222: {
    lexical_join_221: {
    lexical_join_220: {
    lexical_join_219: {
    lexical_join_210: {
    lexical_join_208: {
    if (!((life7_15 < __sourceIntrinsic_375e50a0a601_invokedynamic1123_4(25292, (7804918268661484533L ^ life3_3))))) {
        break lexical_join_224;
    }
    life8_76 = ((moom.DT)(p1)).a(((int)((((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextInt(((int)(__sourceIntrinsic_375e50a0a601_invokedynamic1123_6(22543, (6050201654836457781L ^ life3_3))))) - ((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextInt(((int)(__sourceIntrinsic_375e50a0a601_invokedynamic1123_9(22868, (2256735212373766249L ^ life3_3)))))))), ((int)((((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextInt(((int)(__sourceIntrinsic_375e50a0a601_invokedynamic1123_12(4851, (2095439119185329103L ^ life3_3))))) - ((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextInt(((int)(__sourceIntrinsic_375e50a0a601_invokedynamic1123_15(20194, (8386266829254846429L ^ life3_3)))))))), ((int)((((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextInt(((int)(__sourceIntrinsic_375e50a0a601_invokedynamic1123_18(22868, (2256735212373766249L ^ life3_3))))) - ((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextInt(((int)(__sourceIntrinsic_375e50a0a601_invokedynamic1123_21(22868, (2256735212373766249L ^ life3_3)))))))));
    if (!((life5_9 != null))) {
        break lexical_join_222;
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life8_76))))).a__ch())).J == moom.fn.a))) {
        break lexical_join_221;
    }
    spill1123_1 = ((net.minecraft.world.World)(p0)).G;
    if (!((life5_9 != null))) {
        lexicalValue1123_219_0 = ((spill1123_1) ? 1 : 0);
        break lexical_join_219;
    }
    if (!(spill1123_1)) {
        break lexical_join_210;
    }
    life9_101 = 0;
    lexical_cycle_93: while (true) {
    if (!((life9_101 < __sourceIntrinsic_375e50a0a601_invokedynamic1123_30(12240, (2367207592174651115L ^ life3_3))))) {
        break lexical_join_208;
    }
    life10_112 = ((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextDouble();
    life12_120 = ((((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextFloat() - 0x1.0p-1f) * 0x1.99999ap-3f);
    life13_128 = ((((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextFloat() - 0x1.0p-1f) * 0x1.99999ap-3f);
    life14_136 = ((((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextFloat() - 0x1.0p-1f) * 0x1.99999ap-3f);
    life15_157 = (((((double) ((moom.DT)(life8_76)).a()) + (((double) (((moom.DT)(p1)).a() - ((moom.DT)(life8_76)).a())) * life10_112)) + (((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextDouble() - 0x1.0p-1d)) + 0x1.0p-1d);
    life17_176 = (((((double) ((moom.DT)(life8_76)).b()) + (((double) (((moom.DT)(p1)).b() - ((moom.DT)(life8_76)).b())) * life10_112)) + ((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextDouble()) - 0x1.0p-1d);
    life19_197 = (((((double) ((moom.DT)(life8_76)).c()) + (((double) (((moom.DT)(p1)).c() - ((moom.DT)(life8_76)).c())) * life10_112)) + (((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextDouble() - 0x1.0p-1d)) + 0x1.0p-1d);
    ((net.minecraft.world.World)(p0)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.PORTAL)), ((double)(life15_157)), ((double)(life17_176)), ((double)(life19_197)), ((double)(((double) life12_120))), ((double)(((double) life13_128))), ((double)(((double) life14_136))), ((int[])(new int[0])));
    life9_101 += 1;
    if (!((life5_9 != null))) {
        break lexical_join_220;
    }
    if (!((life5_9 == null))) { continue lexical_cycle_93; }
    break lexical_cycle_93;
    }
    }
    if (!((life5_9 == null))) {
        break lexical_join_220;
    }
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(life8_76)), ((net.minecraft.block.state.IBlockState)(life6_8)), ((int)(2)));
    lexicalValue1123_219_0 = ((((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(p1)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1123_219_0);
    }
    return;
    }
    life7_15 += 1;
    }
    if (!((life5_9 == null))) { continue lexical_cycle_16; }
    break lexical_cycle_16;
    }
    }
    return;
}


public net.minecraft.item.Item a__wQ(net.minecraft.world.World p0, moom.DT p1) {
return null;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.block.Block p3) {
((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.Block)(this)), ((int)(((moom.ds)(this)).a(((net.minecraft.world.World)(p0))))));
    return;
}


public boolean a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.player.EntityPlayer p3, moom.bs p4, float p5, float p6, float p7) {
((moom.ds)(this)).c(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    return ((1) != 0);
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.entity.player.EntityPlayer p2) {
((moom.ds)(this)).c(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    return;
}


public int a(net.minecraft.world.World p0) {
return 5;
}


public boolean a__Boolean(net.minecraft.world.IBlockAccess p0, moom.DT p1, moom.bs p2) {
return ((1) != 0);
}


public boolean g() {
return ((0) != 0);
}


public boolean j() {
return ((0) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7407_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6d923203f1ab_invokedynamic1122_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_375e50a0a601_invokedynamic1123_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_375e50a0a601_invokedynamic1123_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_375e50a0a601_invokedynamic1123_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_375e50a0a601_invokedynamic1123_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_375e50a0a601_invokedynamic1123_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_375e50a0a601_invokedynamic1123_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_375e50a0a601_invokedynamic1123_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_375e50a0a601_invokedynamic1123_30(int a0, long a1) throws E;
}
