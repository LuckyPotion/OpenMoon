package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
class ie extends moom.h1 {

net.minecraft.client.gui.GuiSnooper y;

private static long z;

private static long[] A;

private static java.lang.Integer[] B;

private static java.util.Map C;

public ie(net.minecraft.client.gui.GuiSnooper p0) { super((net.minecraft.client.Minecraft)null, 0, 0, 0, 0, 0); }


private static void __sourceConstructorBody_58fecaee36dac110(moom.ie receiver, net.minecraft.client.gui.GuiSnooper p0) throws Throwable {

long local2 = (moom.ie.z ^ 30058306829936L);

    ((moom.ie)(receiver)).y = ((net.minecraft.client.gui.GuiSnooper)(p0));

    moom.ie.__sourceConstructorInit_58fecaee36dac110_0(((moom.ie)(receiver)), ((net.minecraft.client.Minecraft)(((net.minecraft.client.gui.GuiSnooper)(p0)).i)), ((int)(((net.minecraft.client.gui.GuiSnooper)(p0)).k)), ((int)(((net.minecraft.client.gui.GuiSnooper)(p0)).l)), ((int)(__sourceIntrinsic_58fecaee36dac110_originalDynamicSite2438_5(6199, (8955221394685772811L ^ local2)))), ((int)((((net.minecraft.client.gui.GuiSnooper)(p0)).l - __sourceIntrinsic_58fecaee36dac110_originalDynamicSite2438_7(7150, (2808360153731286995L ^ local2))))), ((int)((((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.gui.GuiSnooper)(p0)).p)).c + 1))));

    return;

}



static {
z = ((long)(((moom._a)(moom._c.a(((long)(-897576333724378590L)), ((long)(3818774885283264964L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(7518655490437L)))));
    C = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.ie.z ^ 128559229045839L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1306_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1306_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1306_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1306_14 = new byte[8];
    (__sourceSpill1306_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1306_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1306_16 = __sourceSpill1306_14;
    ((javax.crypto.Cipher)(__sourceSpill1306_11)).init(((int)(__sourceSpill1306_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1306_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1306_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[5];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "áÆ»Ä\n\020ko!D¢´¢,ZE¾À\rx\026"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1306_25 = local6_life21;
        int __sourceSpill1306_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1306_25)).substring(((int)(__sourceSpill1306_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1306_30 = local8_life19;
        int __sourceSpill1306_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1306_33 = new byte[8];
        (__sourceSpill1306_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1306_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1306_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1306_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1306_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1306_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1306_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1306_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1306_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1306_34)).doFinal(((byte[])(__sourceSpill1306_33)));
        (__sourceSpill1306_30)[__sourceSpill1306_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "ªñ/¸@jMò`-À[`çèj"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1306_38 = local6_life21;
        int __sourceSpill1306_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1306_38)).substring(((int)(__sourceSpill1306_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1306_43 = local8_life19;
        int __sourceSpill1306_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1306_46 = new byte[8];
        (__sourceSpill1306_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1306_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1306_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1306_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1306_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1306_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1306_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1306_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1306_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1306_47)).doFinal(((byte[])(__sourceSpill1306_46)));
        (__sourceSpill1306_43)[__sourceSpill1306_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    A = ((long[])(local8_life19));
    B = ((java.lang.Integer[])(new java.lang.Integer[5]));
}

private static native <E extends Throwable> void __sourceConstructorInit_58fecaee36dac110_0(moom.ie a0, net.minecraft.client.Minecraft a1, int a2, int a3, int a4, int a5, int a6) throws E;

protected int f() {
long local1 = (moom.ie.z ^ 6184838741275L);
    return (this.b - __sourceIntrinsic_d5f736cb4191_originalDynamicSite1520_2(2763, (5438497404546848154L ^ local1)));
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.ie.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8046_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/ie"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 2310;
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
            throw new RuntimeException("moom/ie", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         B[var3] = var15;
      }

      return B[var3];
}


protected int a() {
return ((java.util.List)(((net.minecraft.client.gui.GuiSnooper)(this.y)).y)).size();
}


protected void a(int p0, boolean p1, int p2, int p3) {
return;
}


protected boolean a__Boolean(int p0) {
return ((0) != 0);
}


protected void a__Void() {
return;
}


protected void a(int p0, int p1, int p2, int p3, int p4, int p5) {
long local7 = (moom.ie.z ^ 27992402075032L);
    ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.gui.GuiSnooper)(this.y)).p)).b(((java.lang.String)(((java.lang.String)(((java.util.List)(((net.minecraft.client.gui.GuiSnooper)(this.y)).y)).get(((int)(p0))))))), ((float)(0x1.4p3f)), ((float)(((float) p2))), ((int)(__sourceIntrinsic_499f7b7391d8_originalDynamicSite1521_7(1659, (4193186995546962349L ^ local7)))));
    ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.gui.GuiSnooper)(this.y)).p)).b(((java.lang.String)(((java.lang.String)(((java.util.List)(((net.minecraft.client.gui.GuiSnooper)(this.y)).z)).get(((int)(p0))))))), ((float)(0x1.ccp7f)), ((float)(((float) p2))), ((int)(__sourceIntrinsic_499f7b7391d8_originalDynamicSite1521_15(32248, (1327264071957987887L ^ local7)))));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_58fecaee36dac110_originalDynamicSite2438_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_58fecaee36dac110_originalDynamicSite2438_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_originalDynamicSite1521_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_originalDynamicSite1521_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8046_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d5f736cb4191_originalDynamicSite1520_2(int a0, long a1) throws E;
}
