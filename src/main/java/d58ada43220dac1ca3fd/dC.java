package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class dC extends net.minecraft.block.Block implements net.minecraft.block.IGrowable {

public static final moom.fv Q;

private static final long R;

private static final long[] S;

private static final java.lang.Integer[] T;

private static final java.util.Map U;

protected dC() {
super(moom.fn.b);
    (this).a__Void(((this.M).a__fE()).a__fE(moom.dC.Q, java.lang.Boolean.FALSE));
    (this).a(true);
    (this).a(net.minecraft.creativetab.CreativeTabs.b);
}


static {
javax.crypto.Cipher forestValue438_36_0;
    int forestValue438_36_1;
    javax.crypto.SecretKeyFactory forestValue438_36_2;
    byte[] forestValue438_36_3;
    javax.crypto.Cipher forestValue438_53_0;
    int forestValue438_53_1;
    javax.crypto.SecretKeyFactory forestValue438_53_2;
    byte[] forestValue438_53_3;
    long[] forestValue438_157_0;
    int forestValue438_157_1;
    long forestValue438_157_2;
    int forestValue438_157_3;
    long[] forestValue438_300_0;
    int forestValue438_300_1;
    long forestValue438_300_2;
    long[] forestValue438_312_0;
    int forestValue438_312_1;
    long forestValue438_312_2;
    javax.crypto.Cipher spill438_0;
    int spill438_1;
    javax.crypto.SecretKeyFactory spill438_2;
    byte[] spill438_3;
    byte[] spill438_4;
    java.lang.String spill438_5;
    int spill438_6;
    int spill438_7;
    long spill438_8;
    byte[] spill438_9;
    byte[] spill438_10;
    byte[] spill438_11;
    byte[] spill438_12;
    byte[] spill438_13;
    byte[] spill438_14;
    byte[] spill438_15;
    byte[] spill438_16;
    long spill438_17;
    int spill438_18;
    java.lang.String spill438_19;
    int spill438_20;
    long[] spill438_21;
    int spill438_22;
    long spill438_23;
    int spill438_24;
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
    R = ((long)(((moom._a)(moom._c.a(((long)(-9096707508585048579L)), ((long)(-2543507055163904884L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(71457806302424L)))));
    U = ((java.util.Map)(new java.util.HashMap(13)));
    life0_16 = (moom.dC.R ^ 21190255296513L);
    spill438_0 = (life2_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill438_1 = 2;
    spill438_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp438_9_0 = new byte[8];
    spill438_3 = __stackOp438_9_0;
    (__stackOp438_9_0)[0] = ((byte) ((int) (life0_16 >>> 56)));
    life3_35 = 1;
    forestValue438_36_0 = spill438_0;
    forestValue438_36_1 = spill438_1;
    forestValue438_36_2 = spill438_2;
    forestValue438_36_3 = spill438_3;
    forest_cycle_36: while (true) {
    if (!((life3_35 < 8))) {
        forestValue438_53_0 = forestValue438_36_0;
        forestValue438_53_1 = forestValue438_36_1;
        forestValue438_53_2 = forestValue438_36_2;
        forestValue438_53_3 = forestValue438_36_3;
        break forest_join_53;
    }
    byte[] __stackOp438_10_0 = forestValue438_36_3;
    spill438_4 = __stackOp438_10_0;
    (__stackOp438_10_0)[life3_35] = ((byte) ((int) ((life0_16 << (life3_35 * 8)) >>> 56)));
    life3_35 += 1;
    forestValue438_36_3 = spill438_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue438_53_0)).init(((int)(forestValue438_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue438_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue438_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life8_66 = new long[4];
    life5_68 = 0;
    life7_73 = ((java.lang.String)((life6_71 = "\b~c&è¶X'[¥-ÝWï"))).length();
    life4_75 = 0;
    forest_cycle_76: while (true) {
    spill438_5 = life6_71;
    spill438_6 = life4_75;
    life4_75 += 8;
    life9_83 = ((java.lang.String)(((java.lang.String)(spill438_5)).substring(((int)(spill438_6)), ((int)(life4_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    forestValue438_157_0 = life8_66;
    forestValue438_157_1 = (life5_68++);
    forestValue438_157_2 = (((((((((((long) (life9_83)[0]) & 255L) << 56) | ((((long) (life9_83)[1]) & 255L) << 48)) | ((((long) (life9_83)[2]) & 255L) << 40)) | ((((long) (life9_83)[3]) & 255L) << 32)) | ((((long) (life9_83)[4]) & 255L) << 24)) | ((((long) (life9_83)[5]) & 255L) << 16)) | ((((long) (life9_83)[6]) & 255L) << 8)) | (((long) (life9_83)[7]) & 255L));
    forestValue438_157_3 = -1;
    forest_cycle_157: while (true) {
    forest_join_317: {
    forest_join_312: {
    forest_join_300: {
    long __stackOp438_16_0 = forestValue438_157_2;
    int __stackOp438_16_1 = forestValue438_157_3;
    spill438_7 = __stackOp438_16_1;
    spill438_8 = __stackOp438_16_0;
    recovery.source.CarrierOps.discard(__stackOp438_16_1);
    life10_160 = spill438_8;
    byte[] __stackOp438_18_0 = new byte[8];
    spill438_9 = __stackOp438_18_0;
    (__stackOp438_18_0)[0] = ((byte) ((int) (life10_160 >>> 56)));
    byte[] __stackOp438_19_0 = spill438_9;
    spill438_10 = __stackOp438_19_0;
    (__stackOp438_19_0)[1] = ((byte) ((int) (life10_160 >>> 48)));
    byte[] __stackOp438_20_0 = spill438_10;
    spill438_11 = __stackOp438_20_0;
    (__stackOp438_20_0)[2] = ((byte) ((int) (life10_160 >>> 40)));
    byte[] __stackOp438_21_0 = spill438_11;
    spill438_12 = __stackOp438_21_0;
    (__stackOp438_21_0)[3] = ((byte) ((int) (life10_160 >>> 32)));
    byte[] __stackOp438_22_0 = spill438_12;
    spill438_13 = __stackOp438_22_0;
    (__stackOp438_22_0)[4] = ((byte) ((int) (life10_160 >>> 24)));
    byte[] __stackOp438_23_0 = spill438_13;
    spill438_14 = __stackOp438_23_0;
    (__stackOp438_23_0)[5] = ((byte) ((int) (life10_160 >>> 16)));
    byte[] __stackOp438_24_0 = spill438_14;
    spill438_15 = __stackOp438_24_0;
    (__stackOp438_24_0)[6] = ((byte) ((int) (life10_160 >>> 8)));
    byte[] __stackOp438_25_0 = spill438_15;
    spill438_16 = __stackOp438_25_0;
    (__stackOp438_25_0)[7] = ((byte) ((int) life10_160));
    byte[] __stackOp438_26_0 = spill438_16;
    javax.crypto.Cipher __stackOp438_26_1 = life2_20;
    life12_228 = ((javax.crypto.Cipher)(__stackOp438_26_1)).doFinal(((byte[])(__stackOp438_26_0)));
    int __stackOp438_28_0 = spill438_7;
    long __stackOp438_28_1 = (((((((((((long) (life12_228)[0]) & 255L) << 56) | ((((long) (life12_228)[1]) & 255L) << 48)) | ((((long) (life12_228)[2]) & 255L) << 40)) | ((((long) (life12_228)[3]) & 255L) << 32)) | ((((long) (life12_228)[4]) & 255L) << 24)) | ((((long) (life12_228)[5]) & 255L) << 16)) | ((((long) (life12_228)[6]) & 255L) << 8)) | (((long) (life12_228)[7]) & 255L));
    spill438_17 = __stackOp438_28_1;
    spill438_18 = __stackOp438_28_0;
    recovery.source.CarrierOps.discard(__stackOp438_28_1);
    switch (spill438_18) {
default:
{
        forestValue438_300_0 = forestValue438_157_0;
        forestValue438_300_1 = forestValue438_157_1;
        forestValue438_300_2 = spill438_17;
        break forest_join_300;
    }
case 0:
{
        forestValue438_312_0 = forestValue438_157_0;
        forestValue438_312_1 = forestValue438_157_1;
        forestValue438_312_2 = spill438_17;
        break forest_join_312;
    }
}
    }
    (forestValue438_300_0)[forestValue438_300_1] = forestValue438_300_2;
    if (!((life4_75 >= life7_73))) {
        continue forest_cycle_76;
    }
    life7_73 = ((java.lang.String)((life6_71 = "\004\031Ã\\F À\026\tSâ6\031i\016"))).length();
    life4_75 = 0;
    break forest_join_317;
    }
    (forestValue438_312_0)[forestValue438_312_1] = forestValue438_312_2;
    if (!((life4_75 >= life7_73))) {
        break forest_join_317;
    }
    break forest_join_399;
    }
    spill438_19 = life6_71;
    spill438_20 = life4_75;
    life4_75 += 8;
    life9_325 = ((java.lang.String)(((java.lang.String)(spill438_19)).substring(((int)(spill438_20)), ((int)(life4_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    spill438_21 = life8_66;
    spill438_22 = (life5_68++);
    spill438_23 = (((((((((((long) (life9_325)[0]) & 255L) << 56) | ((((long) (life9_325)[1]) & 255L) << 48)) | ((((long) (life9_325)[2]) & 255L) << 40)) | ((((long) (life9_325)[3]) & 255L) << 32)) | ((((long) (life9_325)[4]) & 255L) << 24)) | ((((long) (life9_325)[5]) & 255L) << 16)) | ((((long) (life9_325)[6]) & 255L) << 8)) | (((long) (life9_325)[7]) & 255L));
    spill438_24 = 0;
    forestValue438_157_0 = spill438_21;
    forestValue438_157_1 = spill438_22;
    forestValue438_157_2 = spill438_23;
    forestValue438_157_3 = spill438_24;
    continue forest_cycle_157;
    }
    }
    }
    S = ((long[])(life8_66));
    T = ((java.lang.Integer[])(new java.lang.Integer[4]));
    Q = ((moom.fv)(moom.fv.a(((java.lang.String)("snowy")))));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7260_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/dC"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public int b(net.minecraft.block.state.IBlockState p0) {
return 0;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.dC.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 32474;
      if (T[var3] == null) {
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
         long var5 = S[var3];
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
         Object[] var9 = (Object[])U.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               U.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/dC", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         T[var3] = var15;
      }

      return T[var3];
}


public void b(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
int lexicalValue1102_15_0;
    int lexicalValue1102_48_0;
    int lexicalValue1102_48_1;
    int lexicalValue1102_50_0;
    int lexicalValue1102_106_0;
    int lexicalValue1102_106_1;
    int lexicalValue1102_112_0;
    boolean spill1102_0;
    int spill1102_1;
    int spill1102_2;
    int spill1102_3;
    int spill1102_4;
    int spill1102_5;
    int spill1102_6;
    int spill1102_7;
    long life5_3;
    int[] life7_5;
    int life8_74;
    moom.DT life9_95;
    net.minecraft.block.Block life10_101;
    net.minecraft.block.state.IBlockState life11_105;
    lexical_join_116: {
    lexical_join_50: {
    lexical_join_48: {
    lexical_join_37: {
    lexical_join_15: {
    life5_3 = (moom.dC.R ^ 110050623929595L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill1102_0 = ((net.minecraft.world.World)(p0)).G;
    if (!((life7_5 != null))) {
        lexicalValue1102_15_0 = ((spill1102_0) ? 1 : 0);
        break lexical_join_15;
    }
    if (!((!spill1102_0))) {
        break lexical_join_116;
    }
    lexicalValue1102_15_0 = ((net.minecraft.world.World)(p0)).b(((moom.DT)(((moom.DT)(p1)).a__DT())));
    }
    spill1102_1 = 4;
    if (!((life7_5 != null))) {
        lexicalValue1102_48_0 = lexicalValue1102_15_0;
        lexicalValue1102_48_1 = spill1102_1;
        break lexical_join_48;
    }
    if (!((lexicalValue1102_15_0 < spill1102_1))) {
        break lexical_join_37;
    }
    spill1102_2 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).a__DT()))))).a__ch())).a__Int();
    spill1102_3 = 2;
    if (!((life7_5 != null))) {
        lexicalValue1102_48_0 = spill1102_2;
        lexicalValue1102_48_1 = spill1102_3;
        break lexical_join_48;
    }
    if (!((spill1102_2 > spill1102_3))) {
        break lexical_join_37;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.d)).a__fE())));
    if (!((life7_5 == null))) {
        break lexical_join_116;
    }
    }
    spill1102_4 = ((net.minecraft.world.World)(p0)).b(((moom.DT)(((moom.DT)(p1)).a__DT())));
    if (!((life7_5 != null))) {
        lexicalValue1102_50_0 = spill1102_4;
        break lexical_join_50;
    }
    lexicalValue1102_48_0 = spill1102_4;
    lexicalValue1102_48_1 = __sourceIntrinsic_b4b54c999db9_invokedynamic1102_15(22056, (6192795664079299048L ^ life5_3));
    }
    if (!((lexicalValue1102_48_0 >= lexicalValue1102_48_1))) {
        break lexical_join_116;
    }
    lexicalValue1102_50_0 = 0;
    }
    life8_74 = lexicalValue1102_50_0;
    lexical_cycle_51: while (true) {
    lexical_join_114: {
    lexical_join_113: {
    lexical_join_112: {
    lexical_join_106: {
    if (!((life8_74 < 4))) {
        break lexical_join_116;
    }
    life9_95 = ((moom.DT)(p1)).a(((int)((((java.util.Random)(p3)).nextInt(((int)(3))) - 1))), ((int)((((java.util.Random)(p3)).nextInt(((int)(5))) - 3))), ((int)((((java.util.Random)(p3)).nextInt(((int)(3))) - 1))));
    life10_101 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(life9_95)).a__DT()))))).a__ch();
    life11_105 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life9_95)));
    if (!((life7_5 != null))) {
        break lexical_join_114;
    }
    if (!((((net.minecraft.block.state.IBlockState)(life11_105)).a__ch() == net.minecraft.init.Blocks.d))) {
        break lexical_join_113;
    }
    if (!((((net.minecraft.block.state.IBlockState)(life11_105)).a(((net.minecraft.block.properties.IProperty)(moom.dq.Q))) == net.minecraft.block.BlockDirt$DirtType.DIRT))) {
        break lexical_join_113;
    }
    spill1102_5 = ((net.minecraft.world.World)(p0)).b(((moom.DT)(((moom.DT)(life9_95)).a__DT())));
    spill1102_6 = 4;
    if (!((life7_5 != null))) {
        lexicalValue1102_106_0 = spill1102_5;
        lexicalValue1102_106_1 = spill1102_6;
        break lexical_join_106;
    }
    if (!((spill1102_5 >= spill1102_6))) {
        break lexical_join_113;
    }
    spill1102_7 = ((net.minecraft.block.Block)(life10_101)).a__Int();
    if (!((life7_5 != null))) {
        lexicalValue1102_112_0 = spill1102_7;
        break lexical_join_112;
    }
    lexicalValue1102_106_0 = spill1102_7;
    lexicalValue1102_106_1 = 2;
    }
    if (!((lexicalValue1102_106_0 <= lexicalValue1102_106_1))) {
        break lexical_join_113;
    }
    lexicalValue1102_112_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(life9_95)), ((net.minecraft.block.state.IBlockState)(((moom.dC)(net.minecraft.init.Blocks.c)).a__fE())))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1102_112_0);
    }
    life8_74 += 1;
    }
    if (!((life7_5 == null))) { continue lexical_cycle_51; }
    break lexical_cycle_51;
    }
    }
    return;
}


public int d(net.minecraft.block.state.IBlockState p0) {
return ((moom.dC)(this)).d__Int();
}


public int d__Int() {
return moom.Eg.a(((double)(0x1.0p-1d)), ((double)(0x1.0p0d)));
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.dC.Q});
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2, net.minecraft.block.state.IBlockState p3) {
int lexicalValue1101_79_0;
    int lexicalValue1101_101_0;
    net.minecraft.block.Block lexicalValue1101_135_0;
    int[] spill1101_0;
    net.minecraft.block.Block spill1101_1;
    boolean spill1101_2;
    boolean spill1101_3;
    long life5_3;
    moom.DT life8_7;
    int[] life7_8;
    int life9_10;
    moom.DT life10_19;
    int life11_21;
    net.minecraft.block.BlockFlower$EnumFlowerType life12_60;
    moom.cA life13_64;
    net.minecraft.block.state.IBlockState life14_71;
    net.minecraft.block.state.IBlockState life12_99;
    lexical_join_151: {
    life5_3 = (moom.dC.R ^ 57219115561107L);
    spill1101_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life8_7 = ((moom.DT)(p2)).a__DT();
    life7_8 = spill1101_0;
    life9_10 = 0;
    lexical_cycle_11: while (true) {
    lexical_join_149: {
    lexical_join_148: {
    if (!((life9_10 < __sourceIntrinsic_d3aef74c4416_invokedynamic1101_3(20663, (1471304204303346462L ^ life5_3))))) {
        break lexical_join_151;
    }
    life10_19 = life8_7;
    life11_21 = 0;
    lexical_cycle_22: while (true) {
    lexical_join_145: {
    lexical_join_135: {
    lexical_join_104: {
    lexical_join_102: {
    lexical_join_101: {
    lexical_join_82: {
    lexical_join_80: {
    lexical_join_79: {
    if (!((life11_21 >= (life9_10 / __sourceIntrinsic_d3aef74c4416_invokedynamic1101_4(3770, (4011449001536582929L ^ life5_3)))))) {
        break lexical_join_104;
    }
    spill1101_1 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life10_19))))).a__ch();
    if (!((life7_8 != null))) {
        lexicalValue1101_135_0 = spill1101_1;
        break lexical_join_135;
    }
    if (!((((net.minecraft.block.Block)(spill1101_1)).J == moom.fn.a))) {
        break lexical_join_148;
    }
    if (!((((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_d3aef74c4416_invokedynamic1101_9(18904, (7732532916373009010L ^ life5_3))))) == 0))) {
        break lexical_join_82;
    }
    life12_60 = ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.World)(p0)).a__ES(((moom.DT)(life10_19))))).a(((java.util.Random)(p1)), ((moom.DT)(life10_19)));
    life13_64 = ((moom.M)(((net.minecraft.block.BlockFlower$EnumFlowerType)(life12_60)).a__M())).a();
    life14_71 = ((net.minecraft.block.state.IBlockState)(((moom.cA)(life13_64)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(((moom.cA)(life13_64)).a__ft())), ((java.lang.Comparable)(life12_60)));
    spill1101_2 = ((moom.cA)(life13_64)).a__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(life10_19)), ((net.minecraft.block.state.IBlockState)(life14_71)));
    if (!((life7_8 != null))) {
        lexicalValue1101_79_0 = ((spill1101_2) ? 1 : 0);
        break lexical_join_79;
    }
    if (!(spill1101_2)) {
        break lexical_join_80;
    }
    lexicalValue1101_79_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(life10_19)), ((net.minecraft.block.state.IBlockState)(life14_71)), ((int)(3)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1101_79_0);
    }
    if (!((life7_8 == null))) {
        break lexical_join_148;
    }
    }
    life12_99 = ((net.minecraft.block.state.IBlockState)(((moom.cI)(net.minecraft.init.Blocks.H)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.cI.R)), ((java.lang.Comparable)(moom.ar.GRASS)));
    spill1101_3 = ((moom.cI)(net.minecraft.init.Blocks.H)).a__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(life10_19)), ((net.minecraft.block.state.IBlockState)(life12_99)));
    if (!((life7_8 != null))) {
        lexicalValue1101_101_0 = ((spill1101_3) ? 1 : 0);
        break lexical_join_101;
    }
    if (!(spill1101_3)) {
        break lexical_join_102;
    }
    lexicalValue1101_101_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(life10_19)), ((net.minecraft.block.state.IBlockState)(life12_99)), ((int)(3)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1101_101_0);
    }
    if (!((life7_8 == null))) {
        break lexical_join_148;
    }
    }
    life10_19 = ((moom.DT)(life10_19)).a(((int)((((java.util.Random)(p1)).nextInt(((int)(3))) - 1))), ((int)((((((java.util.Random)(p1)).nextInt(((int)(3))) - 1) * ((java.util.Random)(p1)).nextInt(((int)(3)))) / 2))), ((int)((((java.util.Random)(p1)).nextInt(((int)(3))) - 1))));
    if (!((life7_8 != null))) {
        break lexical_join_149;
    }
    lexicalValue1101_135_0 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(life10_19)).b__DT()))))).a__ch();
    }
    if (!((lexicalValue1101_135_0 == net.minecraft.init.Blocks.c))) {
        break lexical_join_148;
    }
    if (!(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life10_19))))).a__ch())).e__Boolean())) {
        break lexical_join_145;
    }
    if (!((life7_8 == null))) {
        break lexical_join_148;
    }
    }
    life11_21 += 1;
    if (!((life7_8 == null))) { continue lexical_cycle_22; }
    break lexical_cycle_22;
    }
    }
    life9_10 += 1;
    }
    if (!((life7_8 == null))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    return;
}


public net.minecraft.block.state.IBlockState a(net.minecraft.block.state.IBlockState p0, net.minecraft.world.IBlockAccess p1, moom.DT p2) {
net.minecraft.block.state.IBlockState forwardValue326_21_0;
    moom.fv forwardValue326_21_1;
    net.minecraft.block.Block forwardValue326_21_2;
    net.minecraft.block.Block forwardValue326_21_3;
    net.minecraft.block.state.IBlockState forwardValue326_22_0;
    moom.fv forwardValue326_22_1;
    net.minecraft.block.state.IBlockState forwardValue326_24_0;
    moom.fv forwardValue326_24_1;
    net.minecraft.block.state.IBlockState forwardValue326_25_0;
    moom.fv forwardValue326_25_1;
    int forwardValue326_25_2;
    int[] spill326_0;
    net.minecraft.block.state.IBlockState spill326_1;
    moom.fv spill326_2;
    net.minecraft.block.Block spill326_3;
    net.minecraft.block.Block spill326_4;
    long life4_3;
    net.minecraft.block.Block life7_10;
    int[] life6_11;
    forward_join_25: {
    forward_join_24: {
    forward_join_22: {
    forward_join_21: {
    life4_3 = (moom.dC.R ^ 19889763247280L);
    spill326_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_10 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p1)).a__fE(((moom.DT)(((moom.DT)(p2)).a__DT()))))).a__ch();
    life6_11 = spill326_0;
    spill326_1 = p0;
    spill326_2 = moom.dC.Q;
    spill326_3 = life7_10;
    spill326_4 = net.minecraft.init.Blocks.aJ;
    if (!((life6_11 != null))) {
        forwardValue326_21_0 = spill326_1;
        forwardValue326_21_1 = spill326_2;
        forwardValue326_21_2 = spill326_3;
        forwardValue326_21_3 = spill326_4;
        break forward_join_21;
    }
    if (!((spill326_3 != spill326_4))) {
        forwardValue326_22_0 = spill326_1;
        forwardValue326_22_1 = spill326_2;
        break forward_join_22;
    }
    forwardValue326_21_0 = spill326_1;
    forwardValue326_21_1 = spill326_2;
    forwardValue326_21_2 = life7_10;
    forwardValue326_21_3 = net.minecraft.init.Blocks.aH;
    }
    if (!((forwardValue326_21_2 == forwardValue326_21_3))) {
        forwardValue326_24_0 = forwardValue326_21_0;
        forwardValue326_24_1 = forwardValue326_21_1;
        break forward_join_24;
    }
    forwardValue326_22_0 = forwardValue326_21_0;
    forwardValue326_22_1 = forwardValue326_21_1;
    }
    forwardValue326_25_0 = forwardValue326_22_0;
    forwardValue326_25_1 = forwardValue326_22_1;
    forwardValue326_25_2 = 1;
    break forward_join_25;
    }
    forwardValue326_25_0 = forwardValue326_24_0;
    forwardValue326_25_1 = forwardValue326_24_1;
    forwardValue326_25_2 = 0;
    }
    return ((net.minecraft.block.state.IBlockState)(forwardValue326_25_0)).a__fE(((net.minecraft.block.properties.IProperty)(forwardValue326_25_1)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue326_25_2)))))));
}


public net.minecraft.item.Item a(net.minecraft.block.state.IBlockState p0, java.util.Random p1, int p2) {
return ((net.minecraft.block.Block)(net.minecraft.init.Blocks.d)).a(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.d)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dq.Q)), ((java.lang.Comparable)(net.minecraft.block.BlockDirt$DirtType.DIRT))))), ((java.util.Random)(p1)), ((int)(p2)));
}


public boolean a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, boolean p3) {
return ((1) != 0);
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2, net.minecraft.block.state.IBlockState p3) {
return ((1) != 0);
}


public net.minecraft.util.EnumWorldBlockLayer a__bx() {
return net.minecraft.util.EnumWorldBlockLayer.CUTOUT_MIPPED;
}


public int a(net.minecraft.world.IBlockAccess p0, moom.DT p1, int p2) {
return moom.EO.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)));
}


private static native <E extends Throwable> int __sourceIntrinsic_d3aef74c4416_invokedynamic1101_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d3aef74c4416_invokedynamic1101_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d3aef74c4416_invokedynamic1101_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7260_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic1102_15(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
