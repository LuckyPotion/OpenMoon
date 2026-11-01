package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class is implements moom.hO {

private final net.minecraft.client.gui.GuiMultiplayer a;

protected final net.minecraft.client.Minecraft b;

protected final moom.jO c;

private long d;

private static final long e;

private static final long[] f;

private static final java.lang.Integer[] g;

private static final java.util.Map h;

private static final long i;

protected is(net.minecraft.client.gui.GuiMultiplayer p0, moom.jO p1) {
super();
    this.d = 0L;
    this.a = p0;
    this.c = p1;
    this.b = net.minecraft.client.Minecraft.a__fM();
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(-6944801264993097008L)), ((long)(499007703946620769L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(19107766429754L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    long local5_life7 = (moom.is.e ^ 15398493108915L);
    javax.crypto.Cipher local7_life9;
    javax.crypto.Cipher __sourceSpill886_11 = (local7_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill886_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill886_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill886_14 = new byte[8];
    (__sourceSpill886_14)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local8_life15 = 1;
    while ((local8_life15 < 8)) {
        (__sourceSpill886_14)[local8_life15] = ((byte) ((int) ((local5_life7 << (local8_life15 * 8)) >>> 56)));
        local8_life15 += 1;
    }
    byte[] __sourcePreallocation886_16 = __sourceSpill886_14;
    ((javax.crypto.Cipher)(__sourceSpill886_11)).init(((int)(__sourceSpill886_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill886_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation886_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local13_life19 = new long[10];
    int local10_life20 = 0;
    java.lang.String local11_life21;
    int local12_life23 = ((java.lang.String)((local11_life21 = "¾Â7ÈJ@\017ó#î¦Ô»L¢Î¼dqçì&LÇú)ËÐlh²íÏ¿Öô\020©Uä]»\033â\017\000¯X]³JsÈUE¾Ù"))).length();
    int local9_life24 = 0;
    do {
        java.lang.String __sourceSpill886_25 = local11_life21;
        int __sourceSpill886_26 = local9_life24;
        local9_life24 += 8;
        byte[] local14_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill886_25)).substring(((int)(__sourceSpill886_26)), ((int)(local9_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill886_30 = local13_life19;
        int __sourceSpill886_31 = local10_life20;
        local10_life20 += 1;
        long local15_life32 = (((((((((((long) (local14_life29)[0]) & 255L) << 56) | ((((long) (local14_life29)[1]) & 255L) << 48)) | ((((long) (local14_life29)[2]) & 255L) << 40)) | ((((long) (local14_life29)[3]) & 255L) << 32)) | ((((long) (local14_life29)[4]) & 255L) << 24)) | ((((long) (local14_life29)[5]) & 255L) << 16)) | ((((long) (local14_life29)[6]) & 255L) << 8)) | (((long) (local14_life29)[7]) & 255L));
        byte[] __sourceSpill886_33 = new byte[8];
        (__sourceSpill886_33)[0] = ((byte) ((int) (local15_life32 >>> 56)));
        (__sourceSpill886_33)[1] = ((byte) ((int) (local15_life32 >>> 48)));
        (__sourceSpill886_33)[2] = ((byte) ((int) (local15_life32 >>> 40)));
        (__sourceSpill886_33)[3] = ((byte) ((int) (local15_life32 >>> 32)));
        (__sourceSpill886_33)[4] = ((byte) ((int) (local15_life32 >>> 24)));
        (__sourceSpill886_33)[5] = ((byte) ((int) (local15_life32 >>> 16)));
        (__sourceSpill886_33)[6] = ((byte) ((int) (local15_life32 >>> 8)));
        (__sourceSpill886_33)[7] = ((byte) ((int) local15_life32));
        javax.crypto.Cipher __sourceSpill886_34 = local7_life9;
        byte[] local17_life36 = ((javax.crypto.Cipher)(__sourceSpill886_34)).doFinal(((byte[])(__sourceSpill886_33)));
        (__sourceSpill886_30)[__sourceSpill886_31] = (((((((((((long) (local17_life36)[0]) & 255L) << 56) | ((((long) (local17_life36)[1]) & 255L) << 48)) | ((((long) (local17_life36)[2]) & 255L) << 40)) | ((((long) (local17_life36)[3]) & 255L) << 32)) | ((((long) (local17_life36)[4]) & 255L) << 24)) | ((((long) (local17_life36)[5]) & 255L) << 16)) | ((((long) (local17_life36)[6]) & 255L) << 8)) | (((long) (local17_life36)[7]) & 255L));
    } while ((!(local9_life24 >= local12_life23)));
    local12_life23 = ((java.lang.String)((local11_life21 = "5:hÁ\r/amð9J6Ð"))).length();
    local9_life24 = 0;
    do {
        java.lang.String __sourceSpill886_38 = local11_life21;
        int __sourceSpill886_39 = local9_life24;
        local9_life24 += 8;
        byte[] local14_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill886_38)).substring(((int)(__sourceSpill886_39)), ((int)(local9_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill886_43 = local13_life19;
        int __sourceSpill886_44 = local10_life20;
        local10_life20 += 1;
        long local15_life45 = (((((((((((long) (local14_life42)[0]) & 255L) << 56) | ((((long) (local14_life42)[1]) & 255L) << 48)) | ((((long) (local14_life42)[2]) & 255L) << 40)) | ((((long) (local14_life42)[3]) & 255L) << 32)) | ((((long) (local14_life42)[4]) & 255L) << 24)) | ((((long) (local14_life42)[5]) & 255L) << 16)) | ((((long) (local14_life42)[6]) & 255L) << 8)) | (((long) (local14_life42)[7]) & 255L));
        byte[] __sourceSpill886_46 = new byte[8];
        (__sourceSpill886_46)[0] = ((byte) ((int) (local15_life45 >>> 56)));
        (__sourceSpill886_46)[1] = ((byte) ((int) (local15_life45 >>> 48)));
        (__sourceSpill886_46)[2] = ((byte) ((int) (local15_life45 >>> 40)));
        (__sourceSpill886_46)[3] = ((byte) ((int) (local15_life45 >>> 32)));
        (__sourceSpill886_46)[4] = ((byte) ((int) (local15_life45 >>> 24)));
        (__sourceSpill886_46)[5] = ((byte) ((int) (local15_life45 >>> 16)));
        (__sourceSpill886_46)[6] = ((byte) ((int) (local15_life45 >>> 8)));
        (__sourceSpill886_46)[7] = ((byte) ((int) local15_life45));
        javax.crypto.Cipher __sourceSpill886_47 = local7_life9;
        byte[] local17_life49 = ((javax.crypto.Cipher)(__sourceSpill886_47)).doFinal(((byte[])(__sourceSpill886_46)));
        (__sourceSpill886_43)[__sourceSpill886_44] = (((((((((((long) (local17_life49)[0]) & 255L) << 56) | ((((long) (local17_life49)[1]) & 255L) << 48)) | ((((long) (local17_life49)[2]) & 255L) << 40)) | ((((long) (local17_life49)[3]) & 255L) << 32)) | ((((long) (local17_life49)[4]) & 255L) << 24)) | ((((long) (local17_life49)[5]) & 255L) << 16)) | ((((long) (local17_life49)[6]) & 255L) << 8)) | (((long) (local17_life49)[7]) & 255L));
    } while ((!(local9_life24 >= local12_life23)));
    f = ((long[])(local13_life19));
    g = ((java.lang.Integer[])(new java.lang.Integer[10]));
    javax.crypto.Cipher local0_life53;
    javax.crypto.Cipher __sourceSpill886_55 = (local0_life53 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill886_56 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill886_57 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill886_58 = new byte[8];
    (__sourceSpill886_58)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local1_life59 = 1;
    while ((local1_life59 < 8)) {
        (__sourceSpill886_58)[local1_life59] = ((byte) ((int) ((local5_life7 << (local1_life59 * 8)) >>> 56)));
        local1_life59 += 1;
    }
    byte[] __sourcePreallocation886_60 = __sourceSpill886_58;
    ((javax.crypto.Cipher)(__sourceSpill886_55)).init(((int)(__sourceSpill886_56)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill886_57)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation886_60)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life63 = -2534295133869526261L;
    byte[] __sourceSpill886_64 = new byte[8];
    (__sourceSpill886_64)[0] = ((byte) ((int) (local2_life63 >>> 56)));
    (__sourceSpill886_64)[1] = ((byte) ((int) (local2_life63 >>> 48)));
    (__sourceSpill886_64)[2] = ((byte) ((int) (local2_life63 >>> 40)));
    (__sourceSpill886_64)[3] = ((byte) ((int) (local2_life63 >>> 32)));
    (__sourceSpill886_64)[4] = ((byte) ((int) (local2_life63 >>> 24)));
    (__sourceSpill886_64)[5] = ((byte) ((int) (local2_life63 >>> 16)));
    (__sourceSpill886_64)[6] = ((byte) ((int) (local2_life63 >>> 8)));
    (__sourceSpill886_64)[7] = ((byte) ((int) local2_life63));
    javax.crypto.Cipher __sourceSpill886_65 = local0_life53;
    byte[] local4_life67 = ((javax.crypto.Cipher)(__sourceSpill886_65)).doFinal(((byte[])(__sourceSpill886_64)));
    i = ((long)((((((((((((long) (local4_life67)[0]) & 255L) << 56) | ((((long) (local4_life67)[1]) & 255L) << 48)) | ((((long) (local4_life67)[2]) & 255L) << 40)) | ((((long) (local4_life67)[3]) & 255L) << 32)) | ((((long) (local4_life67)[4]) & 255L) << 24)) | ((((long) (local4_life67)[5]) & 255L) << 16)) | ((((long) (local4_life67)[6]) & 255L) << 8)) | (((long) (local4_life67)[7]) & 255L))));
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 4779;
      if (g[var3] == null) {
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
         long var5 = f[var3];
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
         Object[] var9 = (Object[])h.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               h.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/is", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8078_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/is"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.is.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a(int p0, int p1, int p2, int p3, int p4, int p5, int p6, boolean p7) {
long local9 = (moom.is.e ^ 133141538106194L);
    ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(this.b)).N)).b(((java.lang.String)(moom.oO.a(((java.lang.String)("lanServer.title")), ((java.lang.Object[])(new java.lang.Object[0]))))), ((float)(((float) ((p1 + __sourceIntrinsic_2d4ccdd22af0_invokedynamic8079_4(22560, (472756173910142778L ^ local9))) + 3)))), ((float)(((float) (p2 + 1)))), ((int)(__sourceIntrinsic_2d4ccdd22af0_invokedynamic8079_5(25796, (1372476086972601309L ^ local9)))));
    ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(this.b)).N)).b(((java.lang.String)(((moom.jO)(this.c)).a())), ((float)(((float) ((p1 + __sourceIntrinsic_2d4ccdd22af0_invokedynamic8079_11(8672, (5333464562626631420L ^ local9))) + 3)))), ((float)(((float) (p2 + __sourceIntrinsic_2d4ccdd22af0_invokedynamic8079_12(1936, (366685910708433038L ^ local9)))))), ((int)(__sourceIntrinsic_2d4ccdd22af0_invokedynamic8079_13(3118, (1706183417064045363L ^ local9)))));
    if (((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(this.b)).W)).I) {
        ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(this.b)).N)).b(((java.lang.String)(moom.oO.a(((java.lang.String)("selectServer.hiddenAddress")), ((java.lang.Object[])(new java.lang.Object[0]))))), ((float)(((float) ((p1 + __sourceIntrinsic_2d4ccdd22af0_invokedynamic8079_21(8672, (5333464562626631420L ^ local9))) + 3)))), ((float)(((float) ((p2 + __sourceIntrinsic_2d4ccdd22af0_invokedynamic8079_22(11080, (8639108508363562078L ^ local9))) + __sourceIntrinsic_2d4ccdd22af0_invokedynamic8079_23(7744, (1346843052845181272L ^ local9)))))), ((int)(__sourceIntrinsic_2d4ccdd22af0_invokedynamic8079_24(91, (5335438425437747020L ^ local9)))));
    } else {
        ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(this.b)).N)).b(((java.lang.String)(((moom.jO)(this.c)).b())), ((float)(((float) ((p1 + __sourceIntrinsic_2d4ccdd22af0_invokedynamic8079_30(8672, (5333464562626631420L ^ local9))) + 3)))), ((float)(((float) ((p2 + __sourceIntrinsic_2d4ccdd22af0_invokedynamic8079_31(11080, (8639108508363562078L ^ local9))) + __sourceIntrinsic_2d4ccdd22af0_invokedynamic8079_32(22924, (8747047181752462995L ^ local9)))))), ((int)(__sourceIntrinsic_2d4ccdd22af0_invokedynamic8079_33(21583, (5874727960805761876L ^ local9)))));
    }
    return;
}


public boolean a__Boolean(int p0, int p1, int p2, int p3, int p4, int p5) {
long local7 = (moom.is.e ^ 80613725264709L);
    ((net.minecraft.client.gui.GuiMultiplayer)(this.a)).a__sourceReturn_d00df7729d(((int)(p0)));
    if (((net.minecraft.client.Minecraft.a__Long() - this.d) < moom.is.i)) {
        ((net.minecraft.client.gui.GuiMultiplayer)(this.a)).j();
    }
    this.d = ((long)(net.minecraft.client.Minecraft.a__Long()));
    return false;
}


public void a(int p0, int p1, int p2) {
return;
}


public void a(int p0, int p1, int p2, int p3, int p4, int p5) {
return;
}


public moom.jO a() {
return this.c;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8078_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic8079_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic8079_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic8079_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic8079_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic8079_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic8079_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic8079_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic8079_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic8079_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic8079_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic8079_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic8079_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2d4ccdd22af0_invokedynamic8079_33(int a0, long a1) throws E;
}
