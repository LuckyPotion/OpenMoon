package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class h9 extends moom.h5 {

protected net.minecraft.client.Minecraft y;

protected java.util.List<moom.oY> z;

private static long A;

private static long[] B;

private static java.lang.Integer[] C;

private static java.util.Map D;

public h9(net.minecraft.client.Minecraft p0, int p1, int p2, java.util.List<moom.oY> p3) { super((net.minecraft.client.Minecraft)null, 0, 0, 0, 0, 0); }


private static void __sourceConstructorBody_973c9c6003b83e0b(moom.h9 receiver, net.minecraft.client.Minecraft p0, int p1, int p2, java.util.List p3) throws Throwable {

long local5 = (moom.h9.A ^ 5904278792493L);

    moom.h9.__sourceConstructorInit_973c9c6003b83e0b_0(((moom.h9)(receiver)), ((net.minecraft.client.Minecraft)(p0)), ((int)(p1)), ((int)(p2)), ((int)(__sourceIntrinsic_973c9c6003b83e0b_originalDynamicSite2811_1(9308, (1426240155278616542L ^ local5)))), ((int)(((p2 - __sourceIntrinsic_973c9c6003b83e0b_originalDynamicSite2811_2(1715, (1745485742444414261L ^ local5))) + 4))), ((int)(__sourceIntrinsic_973c9c6003b83e0b_originalDynamicSite2811_3(18828, (1510896068122757643L ^ local5)))));

    ((moom.h9)(receiver)).y = ((net.minecraft.client.Minecraft)(p0));

    ((moom.h9)(receiver)).z = ((java.util.List)(p3));

    ((moom.h9)(receiver)).m = ((boolean)(false));

    ((moom.h9)(receiver)).a(((boolean)(true)), ((int)(((int) (((float) ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(p0)).N)).c) * 0x1.8p0f)))));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_973c9c6003b83e0b_0(moom.h9 a0, net.minecraft.client.Minecraft a1, int a2, int a3, int a4, int a5, int a6) throws E;

static {
A = ((long)(((moom._a)(moom._c.a(((long)(3712077505542958589L)), ((long)(-8418059927243168388L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(173188704264828L)))));
    D = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.h9.A ^ 87563288929555L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1246_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1246_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1246_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1246_14 = new byte[8];
    (__sourceSpill1246_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1246_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1246_16 = __sourceSpill1246_14;
    ((javax.crypto.Cipher)(__sourceSpill1246_11)).init(((int)(__sourceSpill1246_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1246_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1246_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[5];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "÷Pé3¹a\037\017#ìºàá×%»]À¦>«"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1246_25 = local6_life21;
        int __sourceSpill1246_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1246_25)).substring(((int)(__sourceSpill1246_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1246_30 = local8_life19;
        int __sourceSpill1246_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1246_33 = new byte[8];
        (__sourceSpill1246_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1246_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1246_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1246_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1246_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1246_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1246_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1246_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1246_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1246_34)).doFinal(((byte[])(__sourceSpill1246_33)));
        (__sourceSpill1246_30)[__sourceSpill1246_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "o\026\003îÒ\005\\ýì£é\034l\017¤"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1246_38 = local6_life21;
        int __sourceSpill1246_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1246_38)).substring(((int)(__sourceSpill1246_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1246_43 = local8_life19;
        int __sourceSpill1246_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1246_46 = new byte[8];
        (__sourceSpill1246_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1246_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1246_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1246_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1246_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1246_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1246_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1246_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1246_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1246_47)).doFinal(((byte[])(__sourceSpill1246_46)));
        (__sourceSpill1246_43)[__sourceSpill1246_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    B = ((long[])(local8_life19));
    C = ((java.lang.Integer[])(new java.lang.Integer[5]));
}


public int e() {
return this.b;
}


protected int f() {
long local1 = (moom.h9.A ^ 120322393006402L);
    return (this.f - __sourceIntrinsic_d5f736cb4191_originalDynamicSite1479_2(14241, (8457991307586763851L ^ local1)));
}


public moom.hO a__hO(int p0) {
return ((moom.h9)(this)).a__oY(((int)(p0)));
}


protected void a(int p0, int p1, net.minecraft.client.renderer.Tessellator p2) {
long local4 = (moom.h9.A ^ 75315119772721L);
    java.lang.String local6 = __sourceIntrinsic_ef0d3654b78f_originalDynamicSite1480_4(net.minecraft.util.EnumChatFormatting.UNDERLINE, net.minecraft.util.EnumChatFormatting.BOLD, ((moom.h9)(this)).a__String());
    ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(this.y)).N)).b(((java.lang.String)(local6)), ((float)(((float) ((p0 + (this.b / 2)) - (((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(this.y)).N)).a(((java.lang.String)(local6))) / 2))))), ((float)(((float) java.lang.Math.min(((int)((this.d + 3))), ((int)(p1)))))), ((int)(__sourceIntrinsic_ef0d3654b78f_originalDynamicSite1480_13(23861, (8634220832934732717L ^ local4)))));
    return;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 23994;
      if (C[var3] == null) {
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
         long var5 = B[var3];
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
         Object[] var9 = (Object[])D.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               D.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/h9", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         C[var3] = var15;
      }

      return C[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.h9.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral7816_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/h9"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public java.util.List<moom.oY> a__List() {
return this.z;
}


protected int a() {
return ((java.util.List)(((moom.h9)(this)).a__List())).size();
}


public moom.oY a__oY(int p0) {
return ((moom.oY)(((java.util.List)(((moom.h9)(this)).a__List())).get(((int)(p0)))));
}


protected abstract java.lang.String a__String();

private static native <E extends Throwable> int __sourceIntrinsic_973c9c6003b83e0b_originalDynamicSite2811_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_973c9c6003b83e0b_originalDynamicSite2811_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_973c9c6003b83e0b_originalDynamicSite2811_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d5f736cb4191_originalDynamicSite1479_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ef0d3654b78f_originalDynamicSite1480_4(net.minecraft.util.EnumChatFormatting a0, net.minecraft.util.EnumChatFormatting a1, java.lang.String a2) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ef0d3654b78f_originalDynamicSite1480_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral7816_0() throws E;
}
