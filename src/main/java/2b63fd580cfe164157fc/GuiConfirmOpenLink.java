package net.minecraft.client.gui;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class GuiConfirmOpenLink extends moom.hb {

private java.lang.String E;

private java.lang.String F;

private java.lang.String G;

private boolean H;

private static long I;

private static long[] N;

private static java.lang.Integer[] O;

private static java.util.Map P;

public GuiConfirmOpenLink(net.minecraft.client.gui.GuiYesNoCallback p0, java.lang.String p1, int p2, boolean p3) { super((net.minecraft.client.gui.GuiYesNoCallback)null, (java.lang.String)null, (java.lang.String)null, 0); __sourceHandlerCall_00da69b7e35b7bc2ef03(this, p0, p1, p2, p3); }


static {
I = ((long)(((moom._a)(moom._c.a(((long)(-2286321610069908018L)), ((long)(-3028630874491537983L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(125844909187794L)))));
    P = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.client.gui.GuiConfirmOpenLink.I ^ 57148595941030L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1768_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1768_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1768_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1768_14 = new byte[8];
    (__sourceSpill1768_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1768_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1768_16 = __sourceSpill1768_14;
    ((javax.crypto.Cipher)(__sourceSpill1768_11)).init(((int)(__sourceSpill1768_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1768_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1768_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[14];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "g[[Þ~rOµ¨\013ÿ\177·¢BdôKÎ¢P±¼9\b9¶m\025Ü¦NÚd>²¢HæJ\034\t6¹}P\026sòq·dx[66º0´\022-³\nr[Qºaª\033VYù\031À¹P ÃÞV\020¡~"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1768_25 = local6_life21;
        int __sourceSpill1768_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1768_25)).substring(((int)(__sourceSpill1768_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1768_30 = local8_life19;
        int __sourceSpill1768_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1768_33 = new byte[8];
        (__sourceSpill1768_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1768_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1768_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1768_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1768_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1768_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1768_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1768_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1768_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1768_34)).doFinal(((byte[])(__sourceSpill1768_33)));
        (__sourceSpill1768_30)[__sourceSpill1768_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "y9Á\024ôn×ÑÖ'´-6è_"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1768_38 = local6_life21;
        int __sourceSpill1768_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1768_38)).substring(((int)(__sourceSpill1768_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1768_43 = local8_life19;
        int __sourceSpill1768_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1768_46 = new byte[8];
        (__sourceSpill1768_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1768_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1768_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1768_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1768_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1768_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1768_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1768_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1768_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1768_47)).doFinal(((byte[])(__sourceSpill1768_46)));
        (__sourceSpill1768_43)[__sourceSpill1768_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    N = ((long[])(local8_life19));
    O = ((java.lang.Integer[])(new java.lang.Integer[14]));
}

private static native <E extends Throwable> void __sourceHandlerCall_00da69b7e35b7bc2ef03(net.minecraft.client.gui.GuiConfirmOpenLink a0, net.minecraft.client.gui.GuiYesNoCallback a1, java.lang.String a2, int a3, boolean a4) throws E;
private static final class __SourceHandler_00da69b7e35b7bc2ef03 {

public static void f530(net.minecraft.client.gui.GuiConfirmOpenLink receiver, net.minecraft.client.gui.GuiYesNoCallback p0, java.lang.String p1, int p2, boolean p3) throws Throwable {
    net.minecraft.client.gui.GuiConfirmOpenLink spill530_0;
    net.minecraft.client.gui.GuiYesNoCallback spill530_1;
    net.minecraft.client.gui.GuiConfirmOpenLink spill530_2;
    net.minecraft.client.gui.GuiConfirmOpenLink spill530_3;
    spill530_0 = receiver;
    spill530_1 = p0;
    __directSuperInit530_1(spill530_0, spill530_1, __call530_0((p3 ? "chat.link.confirmTrusted" : "chat.link.confirm"), new java.lang.Object[0]), p1, p2);
    __fieldWrite530_2(receiver, 1);
    spill530_2 = receiver;
    __fieldWrite530_4(spill530_2, __call530_3((p3 ? "chat.link.open" : "gui.yes"), new java.lang.Object[0]));
    spill530_3 = receiver;
    __fieldWrite530_6(spill530_3, __call530_5((p3 ? "gui.cancel" : "gui.no"), new java.lang.Object[0]));
    __fieldWrite530_8(receiver, __call530_7("chat.copy", new java.lang.Object[0]));
    __fieldWrite530_10(receiver, __call530_9("chat.link.warning", new java.lang.Object[0]));
    __fieldWrite530_11(receiver, p1);
    return;
}
public static void h530_0(moom.Oo p0) throws Throwable {
    throw __call3053000_0(p0);
}
private static native java.lang.String __call530_0(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __directSuperInit530_1(net.minecraft.client.gui.GuiConfirmOpenLink a0, net.minecraft.client.gui.GuiYesNoCallback a1, java.lang.String a2, java.lang.String a3, int a4) throws Throwable;
private static native void __fieldWrite530_2(net.minecraft.client.gui.GuiConfirmOpenLink a0, int a1) throws Throwable;
private static native java.lang.String __call530_3(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __fieldWrite530_4(net.minecraft.client.gui.GuiConfirmOpenLink a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call530_5(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __fieldWrite530_6(net.minecraft.client.gui.GuiConfirmOpenLink a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call530_7(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __fieldWrite530_8(net.minecraft.client.gui.GuiConfirmOpenLink a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call530_9(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __fieldWrite530_10(net.minecraft.client.gui.GuiConfirmOpenLink a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite530_11(net.minecraft.client.gui.GuiConfirmOpenLink a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call3053000_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_49c48389759fa975c506(net.minecraft.client.gui.GuiConfirmOpenLink a0, moom.gc a1) throws E;
private static final class __SourceHandler_49c48389759fa975c506 {

public static void f2222(net.minecraft.client.gui.GuiConfirmOpenLink receiver, moom.gc p0) throws Throwable {
    if ((__fieldRead2222_0(p0) == 2)) {
        __call2222_1(receiver);
    }
    net.minecraft.client.gui.GuiYesNoCallback spill2222_0 = __fieldRead2222_2(receiver);
    __call2222_5(spill2222_0, ((__fieldRead2222_3(p0) == 0) ? 1 : 0), __fieldRead2222_4(receiver));
    return;
}
public static void h2222_0(java.io.IOException p0) throws Throwable {
    throw __call1222200_0(p0);
}
public static void h2222_1(java.io.IOException p0) throws Throwable {
    throw __call1222201_0(p0);
}
private static native int __fieldRead2222_0(moom.gc a0) throws Throwable;
private static native void __call2222_1(net.minecraft.client.gui.GuiConfirmOpenLink a0) throws Throwable;
private static native net.minecraft.client.gui.GuiYesNoCallback __fieldRead2222_2(net.minecraft.client.gui.GuiConfirmOpenLink a0) throws Throwable;
private static native int __fieldRead2222_3(moom.gc a0) throws Throwable;
private static native int __fieldRead2222_4(net.minecraft.client.gui.GuiConfirmOpenLink a0) throws Throwable;
private static native void __call2222_5(net.minecraft.client.gui.GuiYesNoCallback a0, int a1, int a2) throws Throwable;
private static native java.lang.Exception __call1222200_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1222201_0(java.io.IOException a0) throws Throwable;

}


public void b() {
this.H = ((boolean)(false));
    return;
}


public void c__Void() {
long local1 = (net.minecraft.client.gui.GuiConfirmOpenLink.I ^ 94034426671768L);
    super.c__Void();
    ((java.util.List)(this.m)).clear();
    ((java.util.List)(this.m)).add(((java.lang.Object)(new moom.gc(0, (((this.k / 2) - __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1774_6(12366, (2077100754459975708L ^ local1))) - __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1774_7(10693, (2437388608466155928L ^ local1))), ((this.l / __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1774_9(5909, (147525008256452430L ^ local1))) + __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1774_10(29196, (6989691082080035410L ^ local1))), __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1774_11(17635, (5619688103955633340L ^ local1)), __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1774_12(14851, (1047364670367558224L ^ local1)), this.A))));
    ((java.util.List)(this.m)).add(((java.lang.Object)(new moom.gc(2, ((this.k / 2) - __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1774_17(21578, (2077433231358264338L ^ local1))), ((this.l / __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1774_19(28842, (6284594946637537534L ^ local1))) + __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1774_20(10935, (8162483233351531243L ^ local1))), __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1774_21(29791, (991230996785472520L ^ local1)), __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1774_22(25383, (1766039723298665329L ^ local1)), this.F))));
    ((java.util.List)(this.m)).add(((java.lang.Object)(new moom.gc(1, (((this.k / 2) - __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1774_27(21578, (2077433231358264338L ^ local1))) + __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1774_28(22274, (7061899558445090647L ^ local1))), ((this.l / __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1774_30(28842, (6284594946637537534L ^ local1))) + __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1774_31(10935, (8162483233351531243L ^ local1))), __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1774_32(29791, (991230996785472520L ^ local1)), __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1774_33(25383, (1766039723298665329L ^ local1)), this.B))));
    return;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 808;
      if (O[var3] == null) {
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
         long var5 = N[var3];
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
         Object[] var9 = (Object[])P.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               P.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/hc", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         O[var3] = var15;
      }

      return O[var3];
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.gui.GuiConfirmOpenLink.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral10221_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/hc"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a() {
net.minecraft.client.gui.GuiConfirmOpenLink.e(((java.lang.String)(this.G)));
    return;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


protected void a__Void(moom.gc p0) throws java.io.IOException { __sourceHandlerCall_49c48389759fa975c506(this, p0); }


public void a(int p0, int p1, float p2) {
long life4_3;
    life4_3 = (net.minecraft.client.gui.GuiConfirmOpenLink.I ^ 115288068110110L);
    try {
        super.a(((int)(p0)), ((int)(p1)), ((float)(p2)));
        if (this.H) {
        ((net.minecraft.client.gui.GuiConfirmOpenLink)(this)).a(((net.minecraft.client.gui.FontRenderer)(this.p)), ((java.lang.String)(this.E)), ((int)((this.k / 2))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic2263_6(15844, (4833784485525645368L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic2263_7(17318, (2554572971520005753L ^ life4_3)))));
    }
    } catch (moom.Oo caught_rethrow_0) {
        throw net.minecraft.client.gui.GuiConfirmOpenLink.a(((java.lang.Exception)(caught_rethrow_0)));
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic2263_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic2263_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1774_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1774_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1774_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1774_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1774_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1774_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1774_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1774_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1774_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1774_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1774_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1774_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1774_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1774_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1774_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1774_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite1774_33(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral10221_0() throws E;
}
