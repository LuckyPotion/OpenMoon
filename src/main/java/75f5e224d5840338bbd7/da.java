package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class da extends moom.cT {

private static final long R;

private static final long[] S;

private static final java.lang.Integer[] T;

private static final java.util.Map U;

protected da() {
super(moom.fn.e);
}


static {
R = ((long)(((moom._a)(moom._c.a(((long)(-2646564878134580605L)), ((long)(3359659518819276877L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(212032029519740L)))));
    U = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.da.R ^ 40772548198098L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill812_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill812_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill812_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill812_14 = new byte[8];
    (__sourceSpill812_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill812_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation812_16 = __sourceSpill812_14;
    ((javax.crypto.Cipher)(__sourceSpill812_11)).init(((int)(__sourceSpill812_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill812_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation812_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "*\f¹hÃs\035-Z\024]Ñé»!"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill812_25 = local6_life21;
        int __sourceSpill812_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill812_25)).substring(((int)(__sourceSpill812_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill812_30 = local8_life19;
        int __sourceSpill812_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill812_33 = new byte[8];
        (__sourceSpill812_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill812_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill812_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill812_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill812_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill812_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill812_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill812_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill812_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill812_34)).doFinal(((byte[])(__sourceSpill812_33)));
        (__sourceSpill812_30)[__sourceSpill812_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    S = ((long[])(local8_life19));
    T = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7349_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/da"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 21364;
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
            throw new RuntimeException("moom/da", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         T[var3] = var15;
      }

      return T[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.da.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public int c__Int() {
return 3;
}


public int a(java.util.Random p0) {
return 0;
}


public net.minecraft.item.Item a(net.minecraft.block.state.IBlockState p0, java.util.Random p1, int p2) {
return null;
}


public net.minecraft.tileentity.TileEntity a(net.minecraft.world.World p0, int p1) {
return new moom.Cq();
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, float p3, int p4) {
long local6 = (moom.da.R ^ 3915974153443L);
    super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((float)(p3)), ((int)(p4)));
    int local8 = ((__sourceIntrinsic_205edd9df212_originalDynamicSite1410_2(11035, (3888095782405971025L ^ local6)) + ((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextInt(((int)(__sourceIntrinsic_205edd9df212_originalDynamicSite1410_4(19430, (4282225770011557037L ^ local6)))))) + ((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextInt(((int)(__sourceIntrinsic_205edd9df212_originalDynamicSite1410_7(19430, (4282225770011557037L ^ local6))))));
    ((moom.da)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((int)(local8)));
    return;
}


public net.minecraft.util.EnumWorldBlockLayer a__bx() {
return net.minecraft.util.EnumWorldBlockLayer.CUTOUT;
}


public net.minecraft.item.Item a__wQ(net.minecraft.world.World p0, moom.DT p1) {
return null;
}


public boolean j() {
return ((0) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7349_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_205edd9df212_originalDynamicSite1410_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_205edd9df212_originalDynamicSite1410_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_205edd9df212_originalDynamicSite1410_7(int a0, long a1) throws E;
}
