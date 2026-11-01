package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class g4 extends net.minecraft.client.gui.GuiScreen {

private net.minecraft.client.gui.GuiScreen w;

private net.minecraft.client.settings.GameSettings x;

protected java.lang.String y;

private java.lang.String z;

private static long A;

private static long[] B;

private static java.lang.Integer[] C;

private static java.util.Map D;

public g4(net.minecraft.client.gui.GuiScreen p0, net.minecraft.client.settings.GameSettings p1) {
super();
    this.y = "Options";
    this.w = p0;
    this.x = p1;
}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_e644c09360b4495e58e4(moom.g4 a0, net.minecraft.client.audio.SoundCategory a1) throws E;
private static final class __SourceHandler_e644c09360b4495e58e4 {

public static java.lang.String f1726(moom.g4 receiver, net.minecraft.client.audio.SoundCategory p0) throws Throwable {
    float life2_4;
    life2_4 = __call1726_1(__fieldRead1726_0(receiver), p0);
    return ((life2_4 == 0x0.0p0f) ? __fieldRead1726_2(receiver) : __invokedynamic1726_3(((int) (life2_4 * 0x1.9p6f))));
}
public static void h1726_0(moom.Oo p0) throws Throwable {
    throw __call1172600_0(p0);
}
private static native net.minecraft.client.settings.GameSettings __fieldRead1726_0(moom.g4 a0) throws Throwable;
private static native float __call1726_1(net.minecraft.client.settings.GameSettings a0, net.minecraft.client.audio.SoundCategory a1) throws Throwable;
private static native java.lang.String __fieldRead1726_2(moom.g4 a0) throws Throwable;
private static native java.lang.String __invokedynamic1726_3(int a0) throws Throwable;
private static native java.lang.Exception __call1172600_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_7f4d9fef786fc726b3a5(moom.g4 a0, moom.gc a1) throws E;
private static final class __SourceHandler_7f4d9fef786fc726b3a5 {

public static void f1727(moom.g4 receiver, moom.gc p0) throws Throwable {
    long life2_3;
    life2_3 = (__fieldRead1727_0() ^ 9635191676871L);
    if (__fieldRead1727_1(p0)) {
        if ((__fieldRead1727_2(p0) == __invokedynamic1727_3(708, (2469950464756539864L ^ life2_3)))) {
        __call1727_6(__fieldRead1727_5(__fieldRead1727_4(receiver)));
        __call1727_9(__fieldRead1727_7(receiver), __fieldRead1727_8(receiver));
    }
    }
    return;
}
public static void h1727_0(java.io.IOException p0) throws Throwable {
    throw __call1172700_0(p0);
}
public static void h1727_1(java.io.IOException p0) throws Throwable {
    throw __call1172701_0(p0);
}
private static native long __fieldRead1727_0() throws Throwable;
private static native boolean __fieldRead1727_1(moom.gc a0) throws Throwable;
private static native int __fieldRead1727_2(moom.gc a0) throws Throwable;
private static native int __invokedynamic1727_3(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1727_4(moom.g4 a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1727_5(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1727_6(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1727_7(moom.g4 a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead1727_8(moom.g4 a0) throws Throwable;
private static native void __call1727_9(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiScreen a1) throws Throwable;
private static native java.lang.Exception __call1172700_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1172701_0(java.io.IOException a0) throws Throwable;

}


static {
A = ((long)(((moom._a)(moom._c.a(((long)(-925629443465843425L)), ((long)(-2186321926103183083L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(9619234536243L)))));
    D = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.g4.A ^ 65917685554874L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1204_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1204_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1204_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1204_14 = new byte[8];
    (__sourceSpill1204_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1204_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1204_16 = __sourceSpill1204_14;
    ((javax.crypto.Cipher)(__sourceSpill1204_11)).init(((int)(__sourceSpill1204_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1204_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1204_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[16];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "6ré\fÝV\030Rï»µµ\032Øæ?ü\017Ç\b\006Gø¾øãÝÅÊ¤²Ç(KùåJa'Þt:°Ñ\004-`$\026ï0¥\tÍa\026w{Kb­òNõ¢B\"@Ç)3|WÁII6ÊÀ\021@¿á¥MÊ×G\030\031xd\tfËñCw"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1204_25 = local6_life21;
        int __sourceSpill1204_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1204_25)).substring(((int)(__sourceSpill1204_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1204_30 = local8_life19;
        int __sourceSpill1204_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1204_33 = new byte[8];
        (__sourceSpill1204_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1204_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1204_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1204_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1204_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1204_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1204_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1204_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1204_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1204_34)).doFinal(((byte[])(__sourceSpill1204_33)));
        (__sourceSpill1204_30)[__sourceSpill1204_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "&)È¤Ý§\016Åd\023\t¬íVØ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1204_38 = local6_life21;
        int __sourceSpill1204_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1204_38)).substring(((int)(__sourceSpill1204_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1204_43 = local8_life19;
        int __sourceSpill1204_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1204_46 = new byte[8];
        (__sourceSpill1204_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1204_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1204_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1204_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1204_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1204_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1204_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1204_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1204_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1204_47)).doFinal(((byte[])(__sourceSpill1204_46)));
        (__sourceSpill1204_43)[__sourceSpill1204_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    B = ((long[])(local8_life19));
    C = ((java.lang.Integer[])(new java.lang.Integer[16]));
}


public void c__Void() {
long life1_3;
    int life3_5;
    int life3_77;
    net.minecraft.client.audio.SoundCategory[] life4_79;
    int life5_82;
    int life6_84;
    net.minecraft.client.audio.SoundCategory life7_91;
    life1_3 = (moom.g4.A ^ 82804613238310L);
    life3_5 = 0;
    this.y = ((java.lang.String)(moom.oO.a(((java.lang.String)("options.sounds.title")), ((java.lang.Object[])(new java.lang.Object[0])))));
    this.z = ((java.lang.String)(moom.oO.a(((java.lang.String)("options.off")), ((java.lang.Object[])(new java.lang.Object[0])))));
    ((java.util.List)(this.m)).add(((java.lang.Object)(new moom.go(this, ((net.minecraft.client.audio.SoundCategory)(net.minecraft.client.audio.SoundCategory.MASTER)).a(), (((this.k / 2) - __sourceIntrinsic_7ac46ee229a8_invokedynamic1753_9(24946, (6956596698270634893L ^ life1_3))) + ((life3_5 % 2) * __sourceIntrinsic_7ac46ee229a8_invokedynamic1753_10(12042, (7888187769946725886L ^ life1_3)))), (((this.l / __sourceIntrinsic_7ac46ee229a8_invokedynamic1753_12(27821, (1067079496558911063L ^ life1_3))) - __sourceIntrinsic_7ac46ee229a8_invokedynamic1753_13(7743, (4529785365360241862L ^ life1_3))) + (__sourceIntrinsic_7ac46ee229a8_invokedynamic1753_14(22438, (3672052230822372698L ^ life1_3)) * (life3_5 >> 1))), net.minecraft.client.audio.SoundCategory.MASTER, true))));
    life3_77 = (life3_5 + 2);
    life4_79 = net.minecraft.client.audio.SoundCategory.values();
    life5_82 = (life4_79).length;
    life6_84 = 0;
    loop_region_85: while ((life6_84 < life5_82)) {
        life7_91 = (life4_79)[life6_84];
        try {
        if ((life7_91 != net.minecraft.client.audio.SoundCategory.MASTER)) {
        ((java.util.List)(this.m)).add(((java.lang.Object)(new moom.go(this, ((net.minecraft.client.audio.SoundCategory)(life7_91)).a(), (((this.k / 2) - __sourceIntrinsic_7ac46ee229a8_invokedynamic1753_22(19229, (4264266169892387309L ^ life1_3))) + ((life3_77 % 2) * __sourceIntrinsic_7ac46ee229a8_invokedynamic1753_23(20423, (4689381032155528496L ^ life1_3)))), (((this.l / __sourceIntrinsic_7ac46ee229a8_invokedynamic1753_25(21, (4872407984786436846L ^ life1_3))) - __sourceIntrinsic_7ac46ee229a8_invokedynamic1753_26(7167, (818879653206812940L ^ life1_3))) + (__sourceIntrinsic_7ac46ee229a8_invokedynamic1753_27(17233, (4973686597007749543L ^ life1_3)) * (life3_77 >> 1))), life7_91, false))));
        life3_77 += 1;
    }
    } catch (moom.Oo caught_rethrow_0) {
        throw moom.g4.a(((java.lang.Exception)(caught_rethrow_0)));
    }
        life6_84 += 1;
    }
    ((java.util.List)(this.m)).add(((java.lang.Object)(new moom.gc(__sourceIntrinsic_7ac46ee229a8_invokedynamic1753_31(26505, (6226438213267625329L ^ life1_3)), ((this.k / 2) - __sourceIntrinsic_7ac46ee229a8_invokedynamic1753_33(1596, (3149305538675635394L ^ life1_3))), ((this.l / __sourceIntrinsic_7ac46ee229a8_invokedynamic1753_35(21, (4872407984786436846L ^ life1_3))) + __sourceIntrinsic_7ac46ee229a8_invokedynamic1753_36(11714, (1041679219758948147L ^ life1_3))), moom.oO.a(((java.lang.String)("gui.done")), ((java.lang.Object[])(new java.lang.Object[0])))))));
    return;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 8582;
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
            throw new RuntimeException("moom/g4", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         C[var3] = var15;
      }

      return C[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.g4.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral7666_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/g4"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected java.lang.String a(net.minecraft.client.audio.SoundCategory p0) { return __sourceHandlerCall_e644c09360b4495e58e4(this, p0); }


public void a(int p0, int p1, float p2) {
long local4 = (moom.g4.A ^ 129828058516384L);
    ((moom.g4)(this)).i();
    ((moom.g4)(this)).a(((net.minecraft.client.gui.FontRenderer)(this.p)), ((java.lang.String)(this.y)), ((int)((this.k / 2))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1440_5(21230, (9197896352762471834L ^ local4)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1440_6(30243, (7625302056087617872L ^ local4)))));
    super.a(((int)(p0)), ((int)(p1)), ((float)(p2)));
    return;
}


protected void a__Void(moom.gc p0) throws java.io.IOException { __sourceHandlerCall_7f4d9fef786fc726b3a5(this, p0); }


private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1753_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1753_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1753_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1753_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1753_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1753_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1753_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1753_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1753_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1753_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1753_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1753_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1753_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1753_36(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral7666_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1440_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1440_6(int a0, long a1) throws E;
}
