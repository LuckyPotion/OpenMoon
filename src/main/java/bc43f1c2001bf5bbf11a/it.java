package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class it implements moom.hO {

private final net.minecraft.client.Minecraft a;

private static final long b;

private static final long[] c;

private static final java.lang.Integer[] d;

private static final java.util.Map e;

private static final long[] f;

private static final java.lang.Long[] g;

private static final java.util.Map h;

public it() {
super();
    this.a = net.minecraft.client.Minecraft.a__fM();
}


static {
b = ((long)(((moom._a)(moom._c.a(((long)(-5447498703303885315L)), ((long)(-2570278756173781679L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(92950572142299L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.it.b ^ 73892642116452L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill887_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill887_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill887_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill887_14 = new byte[8];
    (__sourceSpill887_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill887_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation887_16 = __sourceSpill887_14;
    ((javax.crypto.Cipher)(__sourceSpill887_11)).init(((int)(__sourceSpill887_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill887_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation887_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local19_life19 = new long[2];
    int local16_life20 = 0;
    java.lang.String local17_life21;
    int local18_life23 = ((java.lang.String)((local17_life21 = "¡¾¡Z6l!\000jª\017&9«\004"))).length();
    int local15_life24 = 0;
    do {
        java.lang.String __sourceSpill887_25 = local17_life21;
        int __sourceSpill887_26 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill887_25)).substring(((int)(__sourceSpill887_26)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill887_30 = local19_life19;
        int __sourceSpill887_31 = local16_life20;
        local16_life20 += 1;
        long local21_life32 = (((((((((((long) (local20_life29)[0]) & 255L) << 56) | ((((long) (local20_life29)[1]) & 255L) << 48)) | ((((long) (local20_life29)[2]) & 255L) << 40)) | ((((long) (local20_life29)[3]) & 255L) << 32)) | ((((long) (local20_life29)[4]) & 255L) << 24)) | ((((long) (local20_life29)[5]) & 255L) << 16)) | ((((long) (local20_life29)[6]) & 255L) << 8)) | (((long) (local20_life29)[7]) & 255L));
        byte[] __sourceSpill887_33 = new byte[8];
        (__sourceSpill887_33)[0] = ((byte) ((int) (local21_life32 >>> 56)));
        (__sourceSpill887_33)[1] = ((byte) ((int) (local21_life32 >>> 48)));
        (__sourceSpill887_33)[2] = ((byte) ((int) (local21_life32 >>> 40)));
        (__sourceSpill887_33)[3] = ((byte) ((int) (local21_life32 >>> 32)));
        (__sourceSpill887_33)[4] = ((byte) ((int) (local21_life32 >>> 24)));
        (__sourceSpill887_33)[5] = ((byte) ((int) (local21_life32 >>> 16)));
        (__sourceSpill887_33)[6] = ((byte) ((int) (local21_life32 >>> 8)));
        (__sourceSpill887_33)[7] = ((byte) ((int) local21_life32));
        javax.crypto.Cipher __sourceSpill887_34 = local13_life9;
        byte[] local23_life36 = ((javax.crypto.Cipher)(__sourceSpill887_34)).doFinal(((byte[])(__sourceSpill887_33)));
        (__sourceSpill887_30)[__sourceSpill887_31] = (((((((((((long) (local23_life36)[0]) & 255L) << 56) | ((((long) (local23_life36)[1]) & 255L) << 48)) | ((((long) (local23_life36)[2]) & 255L) << 40)) | ((((long) (local23_life36)[3]) & 255L) << 32)) | ((((long) (local23_life36)[4]) & 255L) << 24)) | ((((long) (local23_life36)[5]) & 255L) << 16)) | ((((long) (local23_life36)[6]) & 255L) << 8)) | (((long) (local23_life36)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    c = ((long[])(local19_life19));
    d = ((java.lang.Integer[])(new java.lang.Integer[2]));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life41;
    javax.crypto.Cipher __sourceSpill887_43 = (local0_life41 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill887_44 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill887_45 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill887_46 = new byte[8];
    (__sourceSpill887_46)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life47 = 1;
    while ((local1_life47 < 8)) {
        (__sourceSpill887_46)[local1_life47] = ((byte) ((int) ((local11_life7 << (local1_life47 * 8)) >>> 56)));
        local1_life47 += 1;
    }
    byte[] __sourcePreallocation887_48 = __sourceSpill887_46;
    ((javax.crypto.Cipher)(__sourceSpill887_43)).init(((int)(__sourceSpill887_44)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill887_45)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation887_48)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life51 = new long[2];
    int local3_life52 = 0;
    java.lang.String local4_life53;
    int local5_life55 = ((java.lang.String)((local4_life53 = "\177H=Ã:\021\017ÐWX¨5IÍ"))).length();
    int local2_life56 = 0;
    do {
        java.lang.String __sourceSpill887_57 = local4_life53;
        int __sourceSpill887_58 = local2_life56;
        local2_life56 += 8;
        byte[] local7_life61 = ((java.lang.String)(((java.lang.String)(__sourceSpill887_57)).substring(((int)(__sourceSpill887_58)), ((int)(local2_life56))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill887_62 = local6_life51;
        int __sourceSpill887_63 = local3_life52;
        local3_life52 += 1;
        long local8_life64 = (((((((((((long) (local7_life61)[0]) & 255L) << 56) | ((((long) (local7_life61)[1]) & 255L) << 48)) | ((((long) (local7_life61)[2]) & 255L) << 40)) | ((((long) (local7_life61)[3]) & 255L) << 32)) | ((((long) (local7_life61)[4]) & 255L) << 24)) | ((((long) (local7_life61)[5]) & 255L) << 16)) | ((((long) (local7_life61)[6]) & 255L) << 8)) | (((long) (local7_life61)[7]) & 255L));
        byte[] __sourceSpill887_65 = new byte[8];
        (__sourceSpill887_65)[0] = ((byte) ((int) (local8_life64 >>> 56)));
        (__sourceSpill887_65)[1] = ((byte) ((int) (local8_life64 >>> 48)));
        (__sourceSpill887_65)[2] = ((byte) ((int) (local8_life64 >>> 40)));
        (__sourceSpill887_65)[3] = ((byte) ((int) (local8_life64 >>> 32)));
        (__sourceSpill887_65)[4] = ((byte) ((int) (local8_life64 >>> 24)));
        (__sourceSpill887_65)[5] = ((byte) ((int) (local8_life64 >>> 16)));
        (__sourceSpill887_65)[6] = ((byte) ((int) (local8_life64 >>> 8)));
        (__sourceSpill887_65)[7] = ((byte) ((int) local8_life64));
        javax.crypto.Cipher __sourceSpill887_66 = local0_life41;
        byte[] local10_life68 = ((javax.crypto.Cipher)(__sourceSpill887_66)).doFinal(((byte[])(__sourceSpill887_65)));
        (__sourceSpill887_62)[__sourceSpill887_63] = (((((((((((long) (local10_life68)[0]) & 255L) << 56) | ((((long) (local10_life68)[1]) & 255L) << 48)) | ((((long) (local10_life68)[2]) & 255L) << 40)) | ((((long) (local10_life68)[3]) & 255L) << 32)) | ((((long) (local10_life68)[4]) & 255L) << 24)) | ((((long) (local10_life68)[5]) & 255L) << 16)) | ((((long) (local10_life68)[6]) & 255L) << 8)) | (((long) (local10_life68)[7]) & 255L));
    } while ((!(local2_life56 >= local5_life55)));
    f = ((long[])(local6_life51));
    g = ((java.lang.Long[])(new java.lang.Long[2]));
}


private static long b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = moom.it.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8081_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/it"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static long b(int p0, long p1) {
int life3_8;
    byte[] life4_77;
    long life5_81;
    byte[] life7_146;
    java.lang.Long life8_150;
    java.lang.Object[] life9_155;
    javax.crypto.spec.DESKeySpec life11_188;
    javax.crypto.SecretKey life12_195;
    javax.crypto.Cipher life13_200;
    byte[] life10_212;
    long life11_290;
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 5692);
    if (((moom.it.g)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (moom.it.f)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(moom.it.h)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.it.h)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/it", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (moom.it.g)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((moom.it.g)[life3_8])).longValue();
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8083_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/it"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(int p0, int p1, int p2) {
return;
}


public void a(int p0, int p1, int p2, int p3, int p4, int p5, int p6, boolean p7) {
long life9_3;
    int life11_16;
    java.lang.String life12_67;
    life9_3 = (moom.it.b ^ 103708214388212L);
    life11_16 = ((p2 + (p4 / 2)) - (((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(this.a)).N)).c / 2));
    ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(this.a)).N)).b(((java.lang.String)(moom.oO.a(((java.lang.String)("lanServer.scanning")), ((java.lang.Object[])(new java.lang.Object[0]))))), ((float)(((float) ((((net.minecraft.client.gui.GuiScreen)(((net.minecraft.client.Minecraft)(this.a)).P)).k / 2) - (((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(this.a)).N)).a(((java.lang.String)(moom.oO.a(((java.lang.String)("lanServer.scanning")), ((java.lang.Object[])(new java.lang.Object[0])))))) / 2))))), ((float)(((float) life11_16))), ((int)(__sourceIntrinsic_2d4ccdd22af0_invokedynamic6662_14(8003, (1155918833880075609L ^ life9_3)))));
    switch (((int) ((net.minecraft.client.Minecraft.a__Long() / __sourceIntrinsic_2d4ccdd22af0_invokedynamic6662_17(29159, (2444993272927044206L ^ life9_3))) % __sourceIntrinsic_2d4ccdd22af0_invokedynamic6662_18(21341, (7407061154974261461L ^ life9_3))))) {
case 0:
default:
{
        life12_67 = "O o o";
        break;
    }
case 1:
case 3:
{
        life12_67 = "o O o";
        break;
    }
case 2:
{
        life12_67 = "o o O";
        break;
    }
}
    ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(this.a)).N)).b(((java.lang.String)(life12_67)), ((float)(((float) ((((net.minecraft.client.gui.GuiScreen)(((net.minecraft.client.Minecraft)(this.a)).P)).k / 2) - (((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(this.a)).N)).a(((java.lang.String)(life12_67))) / 2))))), ((float)(((float) (life11_16 + ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(this.a)).N)).c)))), ((int)(__sourceIntrinsic_2d4ccdd22af0_invokedynamic6662_30(2737, (1251263279869794474L ^ life9_3)))));
    return;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 14254;
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
            throw new RuntimeException("moom/it", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         d[var3] = var15;
      }

      return d[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.it.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public boolean a__Boolean(int p0, int p1, int p2, int p3, int p4, int p5) {
return ((0) != 0);
}


public void a(int p0, int p1, int p2, int p3, int p4, int p5) {
return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8081_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8083_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic6662_14(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_2d4ccdd22af0_invokedynamic6662_17(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_2d4ccdd22af0_invokedynamic6662_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic6662_30(int a0, long a1) throws E;
}
