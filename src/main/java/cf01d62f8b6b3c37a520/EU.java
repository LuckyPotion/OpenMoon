package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class EU extends net.minecraft.world.biome.BiomeGenBase {

private static final long cb;

private static final long[] gb;

private static final java.lang.Integer[] hb;

private static final java.util.Map ib;

public EU(int p0) {
super(((int)(p0)));
    ((java.util.List)(((moom.EU)(this)).aw)).clear();
    ((moom.EU)(this)).am = ((net.minecraft.block.state.IBlockState)(((moom.dx)(net.minecraft.init.Blocks.m)).a__fE()));
    ((moom.EU)(this)).an = ((net.minecraft.block.state.IBlockState)(((moom.dx)(net.minecraft.init.Blocks.m)).a__fE()));
    ((moom.EQ)(((moom.EU)(this)).au)).A = ((int)(-999));
    ((moom.EQ)(((moom.EU)(this)).au)).D = ((int)(2));
    ((moom.EQ)(((moom.EU)(this)).au)).F = ((int)(50));
    ((moom.EQ)(((moom.EU)(this)).au)).G = ((int)(10));
    ((java.util.List)(((moom.EU)(this)).aw)).clear();
    return;
}


static {
cb = ((long)(((moom._a)(moom._c.a(((long)(-4865090468741454116L)), ((long)(-2626740031665880308L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(186641722442729L)))));
    ib = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.EU.cb ^ 11320898815930L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill712_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill712_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill712_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill712_14 = new byte[8];
    (__sourceSpill712_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill712_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation712_16 = __sourceSpill712_14;
    ((javax.crypto.Cipher)(__sourceSpill712_11)).init(((int)(__sourceSpill712_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill712_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation712_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[5];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "L4ä\024ý¤2oiì±i¡×øø\031¬\031G5D"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill712_25 = local6_life21;
        int __sourceSpill712_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill712_25)).substring(((int)(__sourceSpill712_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill712_30 = local8_life19;
        int __sourceSpill712_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill712_33 = new byte[8];
        (__sourceSpill712_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill712_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill712_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill712_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill712_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill712_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill712_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill712_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill712_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill712_34)).doFinal(((byte[])(__sourceSpill712_33)));
        (__sourceSpill712_30)[__sourceSpill712_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "L«Ðôdûi´\025\"nÍ\f"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill712_38 = local6_life21;
        int __sourceSpill712_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill712_38)).substring(((int)(__sourceSpill712_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill712_43 = local8_life19;
        int __sourceSpill712_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill712_46 = new byte[8];
        (__sourceSpill712_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill712_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill712_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill712_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill712_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill712_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill712_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill712_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill712_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill712_47)).doFinal(((byte[])(__sourceSpill712_46)));
        (__sourceSpill712_43)[__sourceSpill712_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    gb = ((long[])(local8_life19));
    hb = ((java.lang.Integer[])(new java.lang.Integer[5]));
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.EU.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 28737;
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
            throw new RuntimeException("moom/EU", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         hb[var3] = var15;
      }

      return hb[var3];
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4336_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/EU"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2) {
int forwardValue1815_34_0;
    java.lang.String spill1815_0;
    int spill1815_1;
    long life4_3;
    java.lang.String life6_10;
    int life7_40;
    int life8_54;
    moom.DT life9_63;
    forward_join_66: {
    forward_join_34: {
    life4_3 = (moom.EU.cb ^ 74533863345973L);
    spill1815_0 = net.minecraft.world.biome.WorldChunkManager.b();
    super.a(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.DT)(p2)));
    life6_10 = spill1815_0;
    spill1815_1 = ((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_83c0409717df_invokedynamic1815_3(8048, (6717050047854211126L ^ life4_3)))));
    if (!((life6_10 == null))) {
        forwardValue1815_34_0 = spill1815_1;
        break forward_join_34;
    }
    if (!((spill1815_1 == 0))) {
        break forward_join_66;
    }
    forwardValue1815_34_0 = (((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_83c0409717df_invokedynamic1815_5(26071, (7323503633694558867L ^ life4_3))))) + __sourceIntrinsic_83c0409717df_invokedynamic1815_7(142, (1644876280996589513L ^ life4_3)));
    }
    life7_40 = forwardValue1815_34_0;
    life8_54 = (((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_83c0409717df_invokedynamic1815_8(13400, (4779975322991385373L ^ life4_3))))) + __sourceIntrinsic_83c0409717df_invokedynamic1815_10(30183, (8448973397228100260L ^ life4_3)));
    life9_63 = ((moom.DT)(((net.minecraft.world.World)(p0)).a__DT(((moom.DT)(((moom.DT)(p2)).a(((int)(life7_40)), ((int)(0)), ((int)(life8_54)))))))).a__DT();
    ((moom.Gh)(new moom.Gh())).a__Boolean(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.DT)(life9_63)));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4336_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic1815_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic1815_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic1815_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic1815_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83c0409717df_invokedynamic1815_10(int a0, long a1) throws E;
}
