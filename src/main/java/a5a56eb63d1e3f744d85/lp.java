package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class lp {

private moom.lw[] a;

private static long b;

private static long[] c;

private static java.lang.Integer[] d;

private static java.util.Map e;

public lp() { super(); }


private static void __sourceConstructorBody_0545297e829298f0(moom.lp receiver) throws Throwable {

long local1 = (moom.lp.b ^ 53658400703219L);

    moom.lp.__sourceConstructorInit_0545297e829298f0_0(((moom.lp)(receiver)));

    ((moom.lp)(receiver)).a = ((moom.lw[])(new moom.lw[(net.minecraft.util.EnumWorldBlockLayer.values()).length]));

    (((moom.lp)(receiver)).a)[((net.minecraft.util.EnumWorldBlockLayer)(net.minecraft.util.EnumWorldBlockLayer.SOLID)).ordinal()] = new moom.lw(__sourceIntrinsic_0545297e829298f0_originalDynamicSite3078_7(9237, (626705235110997222L ^ local1)));

    (((moom.lp)(receiver)).a)[((net.minecraft.util.EnumWorldBlockLayer)(net.minecraft.util.EnumWorldBlockLayer.CUTOUT)).ordinal()] = new moom.lw(__sourceIntrinsic_0545297e829298f0_originalDynamicSite3078_11(2704, (887798126715863650L ^ local1)));

    (((moom.lp)(receiver)).a)[((net.minecraft.util.EnumWorldBlockLayer)(net.minecraft.util.EnumWorldBlockLayer.CUTOUT_MIPPED)).ordinal()] = new moom.lw(__sourceIntrinsic_0545297e829298f0_originalDynamicSite3078_15(19107, (8963617927952548434L ^ local1)));

    (((moom.lp)(receiver)).a)[((net.minecraft.util.EnumWorldBlockLayer)(net.minecraft.util.EnumWorldBlockLayer.TRANSLUCENT)).ordinal()] = new moom.lw(__sourceIntrinsic_0545297e829298f0_originalDynamicSite3078_19(5294, (3729708033465031774L ^ local1)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_0545297e829298f0_0(moom.lp a0) throws E;

static {
b = ((long)(((moom._a)(moom._c.a(((long)(-9154978235041071740L)), ((long)(-6808869658774446236L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(56209238559847L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.lp.b ^ 114833242034244L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1388_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1388_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1388_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1388_14 = new byte[8];
    (__sourceSpill1388_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1388_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1388_16 = __sourceSpill1388_14;
    ((javax.crypto.Cipher)(__sourceSpill1388_11)).init(((int)(__sourceSpill1388_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1388_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1388_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "óÄX\023ï7Û B~tÆÂZ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1388_25 = local6_life21;
        int __sourceSpill1388_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1388_25)).substring(((int)(__sourceSpill1388_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1388_30 = local8_life19;
        int __sourceSpill1388_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1388_33 = new byte[8];
        (__sourceSpill1388_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1388_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1388_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1388_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1388_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1388_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1388_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1388_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1388_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1388_34)).doFinal(((byte[])(__sourceSpill1388_33)));
        (__sourceSpill1388_30)[__sourceSpill1388_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "KÕqàm+Q #¿æ´Ã"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1388_38 = local6_life21;
        int __sourceSpill1388_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1388_38)).substring(((int)(__sourceSpill1388_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1388_43 = local8_life19;
        int __sourceSpill1388_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1388_46 = new byte[8];
        (__sourceSpill1388_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1388_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1388_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1388_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1388_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1388_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1388_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1388_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1388_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1388_47)).doFinal(((byte[])(__sourceSpill1388_46)));
        (__sourceSpill1388_43)[__sourceSpill1388_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    c = ((long[])(local8_life19));
    d = ((java.lang.Integer[])(new java.lang.Integer[4]));
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8332_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/lp"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.lp.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 15981;
      if (d[var3] == null) {
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
         long var5 = c[var3];
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
         Object[] var9 = (Object[])e.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               e.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/lp", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         d[var3] = var15;
      }

      return d[var3];
}


public moom.lw a(net.minecraft.util.EnumWorldBlockLayer p0) {
return (this.a)[((net.minecraft.util.EnumWorldBlockLayer)(p0)).ordinal()];
}


public moom.lw a(int p0) {
return (this.a)[p0];
}


private static native <E extends Throwable> int __sourceIntrinsic_0545297e829298f0_originalDynamicSite3078_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0545297e829298f0_originalDynamicSite3078_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0545297e829298f0_originalDynamicSite3078_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0545297e829298f0_originalDynamicSite3078_19(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8332_0() throws E;
}
