package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class d8 extends net.minecraft.block.Block {

private boolean Q;

private static long R;

private static long[] S;

private static java.lang.Integer[] T;

private static java.util.Map U;

public d8(boolean p0) { super((moom.fn)null); }


private static void __sourceConstructorBody_c294ca1d1a121aaf(moom.d8 receiver, boolean p0) throws Throwable {

long local2_life1 = (moom.d8.R ^ 140308415251677L);

    int[] __sourceSpill699_4 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();

    moom.d8.__sourceConstructorInit_c294ca1d1a121aaf_0(((moom.d8)(receiver)), ((moom.fn)(moom.fn.e)));

    int[] local4_life6 = __sourceSpill699_4;

    if ((local4_life6 != null)) {

        if (p0) {

        ((moom.d8)(receiver)).a(((boolean)(true)));

    }

        ((moom.d8)(receiver)).Q = ((boolean)(p0));

    }

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_c294ca1d1a121aaf_0(moom.d8 a0, moom.fn a1) throws E;

static {
R = ((long)(((moom._a)(moom._c.a(((long)(2530517590135787225L)), ((long)(3155609396240685052L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(174665996150242L)))));
    U = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.d8.R ^ 126553888418246L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill801_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill801_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill801_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill801_14 = new byte[8];
    (__sourceSpill801_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill801_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation801_16 = __sourceSpill801_14;
    ((javax.crypto.Cipher)(__sourceSpill801_11)).init(((int)(__sourceSpill801_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill801_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation801_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "»=ÅÝÞÀam|ä'ÖW\020"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill801_25 = local6_life21;
        int __sourceSpill801_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill801_25)).substring(((int)(__sourceSpill801_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill801_30 = local8_life19;
        int __sourceSpill801_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill801_33 = new byte[8];
        (__sourceSpill801_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill801_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill801_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill801_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill801_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill801_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill801_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill801_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill801_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill801_34)).doFinal(((byte[])(__sourceSpill801_33)));
        (__sourceSpill801_30)[__sourceSpill801_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    S = ((long[])(local8_life19));
    T = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


public void b(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
long local5 = (moom.d8.R ^ 72559046386570L);
    if ((this == net.minecraft.init.Blocks.aD)) {
        ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aC)).a__fE())));
    }
    return;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7241_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/d8"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.d8.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 8654;
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
            throw new RuntimeException("moom/d8", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         T[var3] = var15;
      }

      return T[var3];
}


private void b__sourceReturn_bfedcc9a42(net.minecraft.world.World p0, moom.DT p1) {
long local3 = (moom.d8.R ^ 69928733130598L);
    ((moom.d8)(this)).c(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    if ((this == net.minecraft.init.Blocks.aC)) {
        ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aD)).a__fE())));
    }
    return;
}


private void c(net.minecraft.world.World p0, moom.DT p1) {
int lexicalValue1094_66_0;
    int lexicalValue1094_86_0;
    int lexicalValue1094_87_0;
    int lexicalValue1094_87_1;
    int lexicalValue1094_108_0;
    int lexicalValue1094_109_0;
    int lexicalValue1094_109_1;
    int lexicalValue1094_128_0;
    int lexicalValue1094_129_0;
    int lexicalValue1094_129_1;
    int lexicalValue1094_150_0;
    int lexicalValue1094_153_0;
    int lexicalValue1094_153_1;
    int lexicalValue1094_174_0;
    int lexicalValue1094_184_0;
    int lexicalValue1094_190_0;
    int lexicalValue1094_200_0;
    int lexicalValue1094_208_0;
    int lexicalValue1094_218_0;
    int[] spill1094_0;
    int spill1094_1;
    boolean spill1094_2;
    int spill1094_3;
    boolean spill1094_4;
    boolean spill1094_5;
    boolean spill1094_6;
    boolean spill1094_7;
    boolean spill1094_8;
    long life3_3;
    java.util.Random life6_7;
    int[] life5_8;
    double life7_10;
    int life9_12;
    double life10_27;
    double life12_35;
    double life14_43;
    lexical_join_233: {
    life3_3 = (moom.d8.R ^ 40225579871553L);
    spill1094_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_7 = ((net.minecraft.world.World)(p0)).u;
    life5_8 = spill1094_0;
    life7_10 = 0x1.0p-4d;
    life9_12 = 0;
    lexical_cycle_13: while (true) {
    lexical_join_230: {
    lexical_join_219: {
    lexical_join_218: {
    lexical_join_208: {
    lexical_join_200: {
    lexical_join_190: {
    lexical_join_184: {
    lexical_join_174: {
    lexical_join_169: {
    lexical_join_153: {
    lexical_join_150: {
    lexical_join_149: {
    lexical_join_129: {
    lexical_join_128: {
    lexical_join_127: {
    lexical_join_109: {
    lexical_join_108: {
    lexical_join_107: {
    lexical_join_87: {
    lexical_join_86: {
    lexical_join_85: {
    lexical_join_66: {
    lexical_join_65: {
    if (!((life9_12 < __sourceIntrinsic_375e50a0a601_invokedynamic1094_3(12119, (3526073136646572360L ^ life3_3))))) {
        break lexical_join_233;
    }
    life10_27 = ((double) (((float) ((moom.DT)(p1)).a()) + ((java.util.Random)(life6_7)).nextFloat()));
    life12_35 = ((double) (((float) ((moom.DT)(p1)).b()) + ((java.util.Random)(life6_7)).nextFloat()));
    life14_43 = ((double) (((float) ((moom.DT)(p1)).c()) + ((java.util.Random)(life6_7)).nextFloat()));
    spill1094_1 = life9_12;
    if (!((life5_8 != null))) {
        lexicalValue1094_66_0 = spill1094_1;
        break lexical_join_66;
    }
    if (!((spill1094_1 == 0))) {
        break lexical_join_65;
    }
    spill1094_2 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).a__DT()))))).a__ch())).j();
    if (!((life5_8 != null))) {
        lexicalValue1094_66_0 = ((spill1094_2) ? 1 : 0);
        break lexical_join_66;
    }
    if (!((!spill1094_2))) {
        break lexical_join_65;
    }
    life12_35 = ((((double) ((moom.DT)(p1)).b()) + life7_10) + 0x1.0p0d);
    }
    lexicalValue1094_66_0 = life9_12;
    }
    spill1094_3 = 1;
    if (!((life5_8 != null))) {
        lexicalValue1094_87_0 = lexicalValue1094_66_0;
        lexicalValue1094_87_1 = spill1094_3;
        break lexical_join_87;
    }
    if (!((lexicalValue1094_66_0 == spill1094_3))) {
        break lexical_join_85;
    }
    spill1094_4 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).b__DT()))))).a__ch())).j();
    if (!((life5_8 != null))) {
        lexicalValue1094_86_0 = ((spill1094_4) ? 1 : 0);
        break lexical_join_86;
    }
    if (!((!spill1094_4))) {
        break lexical_join_85;
    }
    life12_35 = (((double) ((moom.DT)(p1)).b()) - life7_10);
    }
    lexicalValue1094_86_0 = life9_12;
    }
    lexicalValue1094_87_0 = lexicalValue1094_86_0;
    lexicalValue1094_87_1 = 2;
    }
    if (!((life5_8 != null))) {
        lexicalValue1094_109_0 = lexicalValue1094_87_0;
        lexicalValue1094_109_1 = lexicalValue1094_87_1;
        break lexical_join_109;
    }
    if (!((lexicalValue1094_87_0 == lexicalValue1094_87_1))) {
        break lexical_join_107;
    }
    spill1094_5 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).d__DT()))))).a__ch())).j();
    if (!((life5_8 != null))) {
        lexicalValue1094_108_0 = ((spill1094_5) ? 1 : 0);
        break lexical_join_108;
    }
    if (!((!spill1094_5))) {
        break lexical_join_107;
    }
    life14_43 = ((((double) ((moom.DT)(p1)).c()) + life7_10) + 0x1.0p0d);
    }
    lexicalValue1094_108_0 = life9_12;
    }
    lexicalValue1094_109_0 = lexicalValue1094_108_0;
    lexicalValue1094_109_1 = 3;
    }
    if (!((life5_8 != null))) {
        lexicalValue1094_129_0 = lexicalValue1094_109_0;
        lexicalValue1094_129_1 = lexicalValue1094_109_1;
        break lexical_join_129;
    }
    if (!((lexicalValue1094_109_0 == lexicalValue1094_109_1))) {
        break lexical_join_127;
    }
    spill1094_6 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).c__DT()))))).a__ch())).j();
    if (!((life5_8 != null))) {
        lexicalValue1094_128_0 = ((spill1094_6) ? 1 : 0);
        break lexical_join_128;
    }
    if (!((!spill1094_6))) {
        break lexical_join_127;
    }
    life14_43 = (((double) ((moom.DT)(p1)).c()) - life7_10);
    }
    lexicalValue1094_128_0 = life9_12;
    }
    lexicalValue1094_129_0 = lexicalValue1094_128_0;
    lexicalValue1094_129_1 = 4;
    }
    if (!((life5_8 != null))) {
        lexicalValue1094_153_0 = lexicalValue1094_129_0;
        lexicalValue1094_153_1 = lexicalValue1094_129_1;
        break lexical_join_153;
    }
    if (!((lexicalValue1094_129_0 == lexicalValue1094_129_1))) {
        break lexical_join_149;
    }
    spill1094_7 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).f()))))).a__ch())).j();
    if (!((life5_8 != null))) {
        lexicalValue1094_150_0 = ((spill1094_7) ? 1 : 0);
        break lexical_join_150;
    }
    if (!((!spill1094_7))) {
        break lexical_join_149;
    }
    life10_27 = ((((double) ((moom.DT)(p1)).a()) + life7_10) + 0x1.0p0d);
    }
    lexicalValue1094_150_0 = life9_12;
    }
    if (!((life5_8 != null))) {
        lexicalValue1094_174_0 = lexicalValue1094_150_0;
        break lexical_join_174;
    }
    lexicalValue1094_153_0 = lexicalValue1094_150_0;
    lexicalValue1094_153_1 = 5;
    }
    if (!((lexicalValue1094_153_0 == lexicalValue1094_153_1))) {
        break lexical_join_169;
    }
    spill1094_8 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).e()))))).a__ch())).j();
    if (!((life5_8 != null))) {
        lexicalValue1094_174_0 = ((spill1094_8) ? 1 : 0);
        break lexical_join_174;
    }
    if (!((!spill1094_8))) {
        break lexical_join_169;
    }
    life10_27 = (((double) ((moom.DT)(p1)).a()) - life7_10);
    }
    lexicalValue1094_174_0 = recovery.source.CarrierOps.dcmpg(((double)(life10_27)), ((double)(((double) ((moom.DT)(p1)).a()))));
    }
    if (!((life5_8 != null))) {
        lexicalValue1094_184_0 = lexicalValue1094_174_0;
        break lexical_join_184;
    }
    if (!((lexicalValue1094_174_0 >= 0))) {
        break lexical_join_219;
    }
    lexicalValue1094_184_0 = recovery.source.CarrierOps.dcmpl(((double)(life10_27)), ((double)(((double) (((moom.DT)(p1)).a() + 1)))));
    }
    if (!((life5_8 != null))) {
        lexicalValue1094_190_0 = lexicalValue1094_184_0;
        break lexical_join_190;
    }
    if (!((lexicalValue1094_184_0 <= 0))) {
        break lexical_join_219;
    }
    lexicalValue1094_190_0 = recovery.source.CarrierOps.dcmpg(((double)(life12_35)), ((double)(0x0.0p0d)));
    }
    if (!((life5_8 != null))) {
        lexicalValue1094_200_0 = lexicalValue1094_190_0;
        break lexical_join_200;
    }
    if (!((lexicalValue1094_190_0 >= 0))) {
        break lexical_join_219;
    }
    lexicalValue1094_200_0 = recovery.source.CarrierOps.dcmpl(((double)(life12_35)), ((double)(((double) (((moom.DT)(p1)).b() + 1)))));
    }
    if (!((life5_8 != null))) {
        lexicalValue1094_208_0 = lexicalValue1094_200_0;
        break lexical_join_208;
    }
    if (!((lexicalValue1094_200_0 <= 0))) {
        break lexical_join_219;
    }
    lexicalValue1094_208_0 = recovery.source.CarrierOps.dcmpg(((double)(life14_43)), ((double)(((double) ((moom.DT)(p1)).c()))));
    }
    if (!((life5_8 != null))) {
        lexicalValue1094_218_0 = lexicalValue1094_208_0;
        break lexical_join_218;
    }
    if (!((lexicalValue1094_208_0 >= 0))) {
        break lexical_join_219;
    }
    lexicalValue1094_218_0 = recovery.source.CarrierOps.dcmpl(((double)(life14_43)), ((double)(((double) (((moom.DT)(p1)).c() + 1)))));
    }
    if (!((lexicalValue1094_218_0 > 0))) {
        break lexical_join_230;
    }
    }
    ((net.minecraft.world.World)(p0)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.REDSTONE)), ((double)(life10_27)), ((double)(life12_35)), ((double)(life14_43)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    }
    life9_12 += 1;
    if (!((life5_8 == null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    return;
}


public void c(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
moom.d8 forwardValue3207_12_0;
    moom.d8 spill3207_0;
    long life5_3;
    int[] life7_5;
    forward_join_15: {
    forward_join_12: {
    life5_3 = (moom.d8.R ^ 9456784807402L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3207_0 = this;
    if (!((life7_5 != null))) {
        forwardValue3207_12_0 = spill3207_0;
        break forward_join_12;
    }
    if (!(((moom.d8)(spill3207_0)).Q)) {
        break forward_join_15;
    }
    forwardValue3207_12_0 = this;
    }
    ((moom.d8)(forwardValue3207_12_0)).c(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    }
    return;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.entity.Entity p2) {
((moom.d8)(this)).b__sourceReturn_bfedcc9a42(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.entity.Entity)(p2)));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.entity.player.EntityPlayer p2) {
((moom.d8)(this)).b__sourceReturn_bfedcc9a42(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.entity.player.EntityPlayer)(p2)));
    return;
}


public int a(net.minecraft.world.World p0) {
long local2 = (moom.d8.R ^ 77611108605348L);
    return __sourceIntrinsic_a3a6e3090437_originalDynamicSite1407_1(23835, (4118160653301287904L ^ local2));
}


public int a(java.util.Random p0) {
return (4 + ((java.util.Random)(p0)).nextInt(((int)(2))));
}


public boolean a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.player.EntityPlayer p3, moom.bs p4, float p5, float p6, float p7) {
((moom.d8)(this)).b__sourceReturn_bfedcc9a42(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    return (__sourceIntrinsic_booleanComparison((super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((net.minecraft.entity.player.EntityPlayer)(p3)), ((moom.bs)(p4)), ((float)(p5)), ((float)(p6)), ((float)(p7))))) != 0);
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, float p3, int p4) {
long life6_3;
    int life8_26;
    life6_3 = (moom.d8.R ^ 82028634902190L);
    super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((float)(p3)), ((int)(p4)));
    if ((((moom.d8)(this)).a(((net.minecraft.block.state.IBlockState)(p2)), ((java.util.Random)(((net.minecraft.world.World)(p0)).u)), ((int)(p4))) != net.minecraft.item.Item.a(((net.minecraft.block.Block)(this))))) {
        life8_26 = (1 + ((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextInt(((int)(5))));
        ((moom.d8)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((int)(life8_26)));
    }
    return;
}


public int a(int p0, java.util.Random p1) {
return (((moom.d8)(this)).a(((java.util.Random)(p1))) + ((java.util.Random)(p1)).nextInt(((int)((p0 + 1)))));
}


public net.minecraft.item.Item a(net.minecraft.block.state.IBlockState p0, java.util.Random p1, int p2) {
return net.minecraft.init.Items.aC;
}


protected net.minecraft.item.ItemStack a__xW(net.minecraft.block.state.IBlockState p0) {
return new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.aC);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7241_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_375e50a0a601_invokedynamic1094_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a3a6e3090437_originalDynamicSite1407_1(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
