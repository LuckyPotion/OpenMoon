package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class h7 extends moom.h5 {

private java.util.List<moom.hP> y;

private static long z;

private static long[] A;

private static java.lang.Integer[] B;

private static java.util.Map C;

public h7(net.minecraft.client.Minecraft p0, int p1, int p2, int p3, int p4, int p5, net.minecraft.client.settings.GameSettings$Options[] p6) { super((net.minecraft.client.Minecraft)null, 0, 0, 0, 0, 0); }


private static void __sourceConstructorBody_5bc274a13a3ec75a(moom.h7 receiver, net.minecraft.client.Minecraft p0, int p1, int p2, int p3, int p4, int p5, net.minecraft.client.settings.GameSettings$Options[] p6) throws Throwable {

long local8_life2 = (moom.h7.z ^ 72389298055717L);

    moom.h7.__sourceConstructorInit_5bc274a13a3ec75a_0(((moom.h7)(receiver)), ((net.minecraft.client.Minecraft)(p0)), ((int)(p1)), ((int)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)));

    ((moom.h7)(receiver)).y = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));

    ((moom.h7)(receiver)).m = ((boolean)(false));

    int local10_life7 = 0;

    while ((local10_life7 < (p6).length)) {

        net.minecraft.client.settings.GameSettings$Options local11_life8 = (p6)[local10_life7];

        net.minecraft.client.settings.GameSettings$Options local12_life9 = ((local10_life7 < ((p6).length - 1)) ? (p6)[(local10_life7 + 1)] : null);

        moom.gc local13_life13 = ((moom.h7)(receiver)).a(((net.minecraft.client.Minecraft)(p0)), ((int)(((p1 / 2) - __sourceIntrinsic_5bc274a13a3ec75a_originalDynamicSite661_11(14312, (1305469196250923459L ^ local8_life2))))), ((int)(0)), ((net.minecraft.client.settings.GameSettings$Options)(local11_life8)));

        moom.gc local14_life19 = ((moom.h7)(receiver)).a(((net.minecraft.client.Minecraft)(p0)), ((int)((((p1 / 2) - __sourceIntrinsic_5bc274a13a3ec75a_originalDynamicSite661_15(31493, (4830618574040829224L ^ local8_life2))) + __sourceIntrinsic_5bc274a13a3ec75a_originalDynamicSite661_17(26992, (3632650625453989724L ^ local8_life2))))), ((int)(0)), ((net.minecraft.client.settings.GameSettings$Options)(local12_life9)));

        ((java.util.List)(((moom.h7)(receiver)).y)).add(((java.lang.Object)(new moom.hP(local13_life13, local14_life19))));

        local10_life7 += 2;

    }

    return;

}



static {
z = ((long)(((moom._a)(moom._c.a(((long)(1656157717928625105L)), ((long)(-7308790575537028952L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(278328204270169L)))));
    C = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.h7.z ^ 110566326415901L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1244_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1244_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1244_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1244_14 = new byte[8];
    (__sourceSpill1244_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1244_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1244_16 = __sourceSpill1244_14;
    ((javax.crypto.Cipher)(__sourceSpill1244_11)).init(((int)(__sourceSpill1244_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1244_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1244_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[5];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ª2Å¯Æ5õ`a\001Ù_#µ\032¸ÜFð}*"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1244_25 = local6_life21;
        int __sourceSpill1244_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1244_25)).substring(((int)(__sourceSpill1244_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1244_30 = local8_life19;
        int __sourceSpill1244_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1244_33 = new byte[8];
        (__sourceSpill1244_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1244_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1244_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1244_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1244_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1244_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1244_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1244_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1244_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1244_34)).doFinal(((byte[])(__sourceSpill1244_33)));
        (__sourceSpill1244_30)[__sourceSpill1244_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "êÂZ+«4¦+Ù;'"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1244_38 = local6_life21;
        int __sourceSpill1244_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1244_38)).substring(((int)(__sourceSpill1244_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1244_43 = local8_life19;
        int __sourceSpill1244_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1244_46 = new byte[8];
        (__sourceSpill1244_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1244_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1244_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1244_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1244_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1244_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1244_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1244_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1244_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1244_47)).doFinal(((byte[])(__sourceSpill1244_46)));
        (__sourceSpill1244_43)[__sourceSpill1244_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    A = ((long[])(local8_life19));
    B = ((java.lang.Integer[])(new java.lang.Integer[5]));
}

private static native <E extends Throwable> void __sourceConstructorInit_5bc274a13a3ec75a_0(moom.h7 a0, net.minecraft.client.Minecraft a1, int a2, int a3, int a4, int a5, int a6) throws E;

public int e() {
long local1 = (moom.h7.z ^ 95933888108944L);
    return __sourceIntrinsic_c4b63a62bb23_originalDynamicSite1474_1(23347, (2100392483526925993L ^ local1));
}


private static moom.Oo c(moom.Oo p0) {
return p0;
}


protected int f() {
long local1 = (moom.h7.z ^ 31072955450424L);
    return (super.f() + __sourceIntrinsic_d5f736cb4191_originalDynamicSite1475_2(6685, (152777985164165678L ^ local1)));
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral7804_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/h7"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 20065;
      if (B[var3] == null) {
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
         long var5 = A[var3];
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
         Object[] var9 = (Object[])C.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               C.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/h7", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         B[var3] = var15;
      }

      return B[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.h7.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private moom.gc a(net.minecraft.client.Minecraft p0, int p1, int p2, net.minecraft.client.settings.GameSettings$Options p3) {
moom.gc forwardValue3582_29_0;
    int life5_8;
    forward_join_29: {
    forward_join_18: {
    forward_join_4: {
    if (!((p3 == null))) {
        break forward_join_4;
    }
    return null;
    }
    life5_8 = ((net.minecraft.client.settings.GameSettings$Options)(p3)).a__Int();
    if (!(((net.minecraft.client.settings.GameSettings$Options)(p3)).a__Boolean())) {
        break forward_join_18;
    }
    forwardValue3582_29_0 = new moom.gk(life5_8, p1, p2, p3);
    break forward_join_29;
    }
    forwardValue3582_29_0 = new moom.gi(life5_8, p1, p2, p3, ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(p0)).W)).a__String(((net.minecraft.client.settings.GameSettings$Options)(p3))));
    }
    return forwardValue3582_29_0;
}


public moom.hP a__hP(int p0) {
return ((moom.hP)(((java.util.List)(this.y)).get(((int)(p0)))));
}


protected int a() {
return ((java.util.List)(this.y)).size();
}


public moom.hO a__hO(int p0) {
return ((moom.h7)(this)).a__hP(((int)(p0)));
}


private static native <E extends Throwable> int __sourceIntrinsic_5bc274a13a3ec75a_originalDynamicSite661_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5bc274a13a3ec75a_originalDynamicSite661_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5bc274a13a3ec75a_originalDynamicSite661_17(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral7804_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c4b63a62bb23_originalDynamicSite1474_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d5f736cb4191_originalDynamicSite1475_2(int a0, long a1) throws E;
}
