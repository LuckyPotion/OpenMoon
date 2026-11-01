package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class E5 extends net.minecraft.world.biome.BiomeGenMutated {

private static long cb;

private static long[] gb;

private static java.lang.Integer[] hb;

private static java.util.Map ib;

public E5(int p0, net.minecraft.world.biome.BiomeGenBase p1) { super(0, (net.minecraft.world.biome.BiomeGenBase)null); }


private static void __sourceConstructorBody_935bc99b8f919461(moom.E5 receiver, int p0, net.minecraft.world.biome.BiomeGenBase p1) throws Throwable {

long local3 = (moom.E5.cb ^ 133191832630670L);

    moom.E5.__sourceConstructorInit_935bc99b8f919461_0(((moom.E5)(receiver)), ((int)(p0)), ((net.minecraft.world.biome.BiomeGenBase)(p1)));

    ((moom.EQ)(((moom.E5)(receiver)).au)).A = ((int)(__sourceIntrinsic_935bc99b8f919461_originalDynamicSite1937_3(19084, (727995277711925868L ^ local3))));

    ((moom.EQ)(((moom.E5)(receiver)).au)).B = ((int)(__sourceIntrinsic_935bc99b8f919461_originalDynamicSite1937_6(25276, (8274474001560652382L ^ local3))));

    ((moom.EQ)(((moom.E5)(receiver)).au)).C = ((int)(__sourceIntrinsic_935bc99b8f919461_originalDynamicSite1937_9(25311, (4349549942866561598L ^ local3))));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_935bc99b8f919461_0(moom.E5 a0, int a1, net.minecraft.world.biome.BiomeGenBase a2) throws E;

static {
cb = ((long)(((moom._a)(moom._c.a(((long)(7909362964929710089L)), ((long)(6462570285055453261L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(42009812228541L)))));
    ib = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.E5.cb ^ 84084524479505L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill519_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill519_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill519_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill519_14 = new byte[8];
    (__sourceSpill519_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill519_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation519_16 = __sourceSpill519_14;
    ((javax.crypto.Cipher)(__sourceSpill519_11)).init(((int)(__sourceSpill519_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill519_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation519_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "H*#\004(Næ{o\023\005\035\024\t.¡ðºõ$üÇ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill519_25 = local6_life21;
        int __sourceSpill519_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill519_25)).substring(((int)(__sourceSpill519_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill519_30 = local8_life19;
        int __sourceSpill519_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill519_33 = new byte[8];
        (__sourceSpill519_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill519_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill519_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill519_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill519_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill519_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill519_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill519_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill519_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill519_34)).doFinal(((byte[])(__sourceSpill519_33)));
        (__sourceSpill519_30)[__sourceSpill519_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    gb = ((long[])(local8_life19));
    hb = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4283_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/E5"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 30338;
      if (hb[var3] == null) {
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
         long var5 = gb[var3];
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
         Object[] var9 = (Object[])ib.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               ib.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/E5", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         hb[var3] = var15;
      }

      return hb[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.E5.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2) {
((moom.EQ)(this.au)).a(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((net.minecraft.world.biome.BiomeGenBase)(this)), ((moom.DT)(p2)));
    return;
}


public void a(net.minecraft.world.World p0, java.util.Random p1, moom.Fm p2, int p3, int p4, double p5) {
int forwardValue1779_33_0;
    java.lang.String spill1779_0;
    int spill1779_1;
    long life8_3;
    java.lang.String life10_13;
    forward_join_41: {
    forward_join_33: {
    forward_join_30: {
    life8_3 = (moom.E5.cb ^ 112601408003757L);
    this.am = ((net.minecraft.block.state.IBlockState)(((moom.dC)(net.minecraft.init.Blocks.c)).a__fE()));
    spill1779_0 = net.minecraft.world.biome.WorldChunkManager.b();
    this.an = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.d)).a__fE()));
    life10_13 = spill1779_0;
    spill1779_1 = recovery.source.CarrierOps.dcmpl(((double)(p5)), ((double)(0x1.cp0d)));
    if (!((life10_13 == null))) {
        forwardValue1779_33_0 = spill1779_1;
        break forward_join_33;
    }
    if (!((spill1779_1 > 0))) {
        break forward_join_30;
    }
    this.am = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b)).a__fE()));
    this.an = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b)).a__fE()));
    if (!((life10_13 != null))) {
        break forward_join_41;
    }
    }
    forwardValue1779_33_0 = recovery.source.CarrierOps.dcmpl(((double)(p5)), ((double)(-0x1.0p-1d)));
    }
    if (!((forwardValue1779_33_0 > 0))) {
        break forward_join_41;
    }
    this.am = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.d)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dq.Q)), ((java.lang.Comparable)(net.minecraft.block.BlockDirt$DirtType.COARSE_DIRT)))));
    }
    ((moom.E5)(this)).b(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.Fm)(p2)), ((int)(p3)), ((int)(p4)), ((double)(p5)));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> int __sourceIntrinsic_935bc99b8f919461_originalDynamicSite1937_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_935bc99b8f919461_originalDynamicSite1937_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_935bc99b8f919461_originalDynamicSite1937_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4283_0() throws E;
}
