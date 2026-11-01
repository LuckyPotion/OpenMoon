package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class hd extends net.minecraft.client.gui.GuiScreen {

private static net.minecraft.client.settings.GameSettings$Options[] w;

private net.minecraft.client.gui.GuiScreen x;

private net.minecraft.client.settings.GameSettings y;

private java.lang.String z;

private static long A;

private static long[] B;

private static java.lang.Integer[] C;

private static java.util.Map D;

public hd(net.minecraft.client.gui.GuiScreen p0, net.minecraft.client.settings.GameSettings p1) {
super();
    this.x = p0;
    this.y = p1;
}

private static native <E extends Throwable> void __sourceHandlerCall_7dd1b5403d58cf573a62(moom.hd a0) throws E;
private static final class __SourceHandler_7dd1b5403d58cf573a62 {

public static void f1776(moom.hd receiver) throws Throwable {
    long life1_3;
    int life3_5;
    net.minecraft.client.settings.GameSettings$Options[] life4_13;
    int life5_16;
    int life6_18;
    net.minecraft.client.settings.GameSettings$Options life7_25;
    life1_3 = (__fieldRead1776_0() ^ 126843188237006L);
    life3_5 = 0;
    __fieldWrite1776_2(receiver, __call1776_1("options.chat.title", new java.lang.Object[0]));
    life4_13 = __fieldRead1776_3();
    life5_16 = (life4_13).length;
    life6_18 = 0;
    loop_region_19: while ((life6_18 < life5_16)) {
        life7_25 = (life4_13)[life6_18];
        if (__call1776_4(life7_25)) {
        __call1776_13(__fieldRead1776_5(receiver), new moom.gk(__call1776_6(life7_25), (((__fieldRead1776_7(receiver) / 2) - __invokedynamic1776_8(495, (7178445439214830898L ^ life1_3))) + ((life3_5 % 2) * __invokedynamic1776_9(18937, (2839892089593466172L ^ life1_3)))), ((__fieldRead1776_10(receiver) / __invokedynamic1776_11(21705, (3998935411470798854L ^ life1_3))) + (__invokedynamic1776_12(28634, (6230392105640110870L ^ life1_3)) * (life3_5 >> 1))), life7_25));
    } else {
        __call1776_24(__fieldRead1776_14(receiver), new moom.gi(__call1776_15(life7_25), (((__fieldRead1776_16(receiver) / 2) - __invokedynamic1776_17(15985, (625793672248687280L ^ life1_3))) + ((life3_5 % 2) * __invokedynamic1776_18(2725, (488501569467633249L ^ life1_3)))), ((__fieldRead1776_19(receiver) / __invokedynamic1776_20(29694, (2893418838839342908L ^ life1_3))) + (__invokedynamic1776_21(22538, (4634508991681404105L ^ life1_3)) * (life3_5 >> 1))), life7_25, __call1776_23(__fieldRead1776_22(receiver), life7_25)));
    }
        life3_5 += 1;
        life6_18 += 1;
    }
    __call1776_33(__fieldRead1776_25(receiver), new moom.gc(__invokedynamic1776_26(22883, (4210907069660175805L ^ life1_3)), ((__fieldRead1776_27(receiver) / 2) - __invokedynamic1776_28(5702, (1753001340752581249L ^ life1_3))), ((__fieldRead1776_29(receiver) / __invokedynamic1776_30(29694, (2893418838839342908L ^ life1_3))) + __invokedynamic1776_31(17279, (6403102781432498100L ^ life1_3))), __call1776_32("gui.done", new java.lang.Object[0])));
    return;
}
public static void h1776_0(moom.Oo p0) throws Throwable {
    throw __call1177600_0(p0);
}
private static native long __fieldRead1776_0() throws Throwable;
private static native java.lang.String __call1776_1(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __fieldWrite1776_2(moom.hd a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.settings.GameSettings$Options[] __fieldRead1776_3() throws Throwable;
private static native boolean __call1776_4(net.minecraft.client.settings.GameSettings$Options a0) throws Throwable;
private static native java.util.List __fieldRead1776_5(moom.hd a0) throws Throwable;
private static native int __call1776_6(net.minecraft.client.settings.GameSettings$Options a0) throws Throwable;
private static native int __fieldRead1776_7(moom.hd a0) throws Throwable;
private static native int __invokedynamic1776_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic1776_9(int a0, long a1) throws Throwable;
private static native int __fieldRead1776_10(moom.hd a0) throws Throwable;
private static native int __invokedynamic1776_11(int a0, long a1) throws Throwable;
private static native int __invokedynamic1776_12(int a0, long a1) throws Throwable;
private static native boolean __call1776_13(java.util.List a0, moom.gk a1) throws Throwable;
private static native java.util.List __fieldRead1776_14(moom.hd a0) throws Throwable;
private static native int __call1776_15(net.minecraft.client.settings.GameSettings$Options a0) throws Throwable;
private static native int __fieldRead1776_16(moom.hd a0) throws Throwable;
private static native int __invokedynamic1776_17(int a0, long a1) throws Throwable;
private static native int __invokedynamic1776_18(int a0, long a1) throws Throwable;
private static native int __fieldRead1776_19(moom.hd a0) throws Throwable;
private static native int __invokedynamic1776_20(int a0, long a1) throws Throwable;
private static native int __invokedynamic1776_21(int a0, long a1) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1776_22(moom.hd a0) throws Throwable;
private static native java.lang.String __call1776_23(net.minecraft.client.settings.GameSettings a0, net.minecraft.client.settings.GameSettings$Options a1) throws Throwable;
private static native boolean __call1776_24(java.util.List a0, moom.gi a1) throws Throwable;
private static native java.util.List __fieldRead1776_25(moom.hd a0) throws Throwable;
private static native int __invokedynamic1776_26(int a0, long a1) throws Throwable;
private static native int __fieldRead1776_27(moom.hd a0) throws Throwable;
private static native int __invokedynamic1776_28(int a0, long a1) throws Throwable;
private static native int __fieldRead1776_29(moom.hd a0) throws Throwable;
private static native int __invokedynamic1776_30(int a0, long a1) throws Throwable;
private static native int __invokedynamic1776_31(int a0, long a1) throws Throwable;
private static native java.lang.String __call1776_32(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native boolean __call1776_33(java.util.List a0, moom.gc a1) throws Throwable;
private static native java.lang.Exception __call1177600_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_806306b1f6e7d3daa0ca(moom.hd a0, moom.gc a1) throws E;
private static final class __SourceHandler_806306b1f6e7d3daa0ca {

public static void f1775(moom.hd receiver, moom.gc p0) throws Throwable {
    long life2_3;
    life2_3 = (__fieldRead1775_0() ^ 53673511011119L);
    if (__fieldRead1775_1(p0)) {
        if ((__fieldRead1775_2(p0) < __invokedynamic1775_3(6946, (9113077049114480139L ^ life2_3)))) {
        if ((__instanceOf1775_4(p0) != 0)) {
        __call1775_8(__fieldRead1775_5(receiver), __call1775_7(__cast1775_6(p0)), 1);
        __fieldWrite1775_13(p0, __call1775_12(__fieldRead1775_9(receiver), __call1775_11(__fieldRead1775_10(p0))));
    }
    }
        if ((__fieldRead1775_14(p0) == __invokedynamic1775_15(5011, (8888516657600415412L ^ life2_3)))) {
        __call1775_18(__fieldRead1775_17(__fieldRead1775_16(receiver)));
        __call1775_21(__fieldRead1775_19(receiver), __fieldRead1775_20(receiver));
    }
    }
    return;
}
public static void h1775_0(java.io.IOException p0) throws Throwable {
    throw __call1177500_0(p0);
}
public static void h1775_1(java.io.IOException p0) throws Throwable {
    throw __call1177501_0(p0);
}
public static void h1775_2(java.io.IOException p0) throws Throwable {
    throw __call1177502_0(p0);
}
public static void h1775_3(java.io.IOException p0) throws Throwable {
    throw __call1177503_0(p0);
}
private static native long __fieldRead1775_0() throws Throwable;
private static native boolean __fieldRead1775_1(moom.gc a0) throws Throwable;
private static native int __fieldRead1775_2(moom.gc a0) throws Throwable;
private static native int __invokedynamic1775_3(int a0, long a1) throws Throwable;
private static native int __instanceOf1775_4(moom.gc a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1775_5(moom.hd a0) throws Throwable;
private static native moom.gi __cast1775_6(moom.gc a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings$Options __call1775_7(moom.gi a0) throws Throwable;
private static native void __call1775_8(net.minecraft.client.settings.GameSettings a0, net.minecraft.client.settings.GameSettings$Options a1, int a2) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1775_9(moom.hd a0) throws Throwable;
private static native int __fieldRead1775_10(moom.gc a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings$Options __call1775_11(int a0) throws Throwable;
private static native java.lang.String __call1775_12(net.minecraft.client.settings.GameSettings a0, net.minecraft.client.settings.GameSettings$Options a1) throws Throwable;
private static native void __fieldWrite1775_13(moom.gc a0, java.lang.String a1) throws Throwable;
private static native int __fieldRead1775_14(moom.gc a0) throws Throwable;
private static native int __invokedynamic1775_15(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1775_16(moom.hd a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1775_17(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call1775_18(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1775_19(moom.hd a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead1775_20(moom.hd a0) throws Throwable;
private static native void __call1775_21(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiScreen a1) throws Throwable;
private static native java.lang.Exception __call1177500_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1177501_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1177502_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1177503_0(java.io.IOException a0) throws Throwable;

}


static {
A = ((long)(((moom._a)(moom._c.a(((long)(4442297904311477736L)), ((long)(-4026035757993596836L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(80288057502209L)))));
    long local11_life6 = (moom.hd.A ^ 72321155184812L);
    D = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill1259_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1259_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1259_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1259_14 = new byte[8];
    (__sourceSpill1259_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill1259_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation1259_16 = __sourceSpill1259_14;
    ((javax.crypto.Cipher)(__sourceSpill1259_11)).init(((int)(__sourceSpill1259_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1259_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1259_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[19];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "d´Ù¥~\002Õ>p9\034²ßÿí;Ç\021O~¿}_¨SM?£²ëlÍ\0038LÃgb¶B[(»3\004²FÃ2\004z®;\034¬Öê[è9êS'×ù»\007Öp\021\027Ò8aE\017e5ãü&$ë¬ò¤kÙ5~Km¦7r\000Ax\034ô¥´¯FRßrÍ)kÄ&û[ÊFY­"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1259_25 = local4_life21;
        int __sourceSpill1259_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1259_25)).substring(((int)(__sourceSpill1259_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1259_30 = local6_life19;
        int __sourceSpill1259_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill1259_33 = new byte[8];
        (__sourceSpill1259_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill1259_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill1259_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill1259_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill1259_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill1259_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill1259_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill1259_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill1259_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill1259_34)).doFinal(((byte[])(__sourceSpill1259_33)));
        (__sourceSpill1259_30)[__sourceSpill1259_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    local5_life23 = ((java.lang.String)((local4_life21 = "¨\013ã\035V%jÎH¯\021g\fÄÂv"))).length();
    local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1259_38 = local4_life21;
        int __sourceSpill1259_39 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1259_38)).substring(((int)(__sourceSpill1259_39)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1259_43 = local6_life19;
        int __sourceSpill1259_44 = local3_life20;
        local3_life20 += 1;
        long local8_life45 = (((((((((((long) (local7_life42)[0]) & 255L) << 56) | ((((long) (local7_life42)[1]) & 255L) << 48)) | ((((long) (local7_life42)[2]) & 255L) << 40)) | ((((long) (local7_life42)[3]) & 255L) << 32)) | ((((long) (local7_life42)[4]) & 255L) << 24)) | ((((long) (local7_life42)[5]) & 255L) << 16)) | ((((long) (local7_life42)[6]) & 255L) << 8)) | (((long) (local7_life42)[7]) & 255L));
        byte[] __sourceSpill1259_46 = new byte[8];
        (__sourceSpill1259_46)[0] = ((byte) ((int) (local8_life45 >>> 56)));
        (__sourceSpill1259_46)[1] = ((byte) ((int) (local8_life45 >>> 48)));
        (__sourceSpill1259_46)[2] = ((byte) ((int) (local8_life45 >>> 40)));
        (__sourceSpill1259_46)[3] = ((byte) ((int) (local8_life45 >>> 32)));
        (__sourceSpill1259_46)[4] = ((byte) ((int) (local8_life45 >>> 24)));
        (__sourceSpill1259_46)[5] = ((byte) ((int) (local8_life45 >>> 16)));
        (__sourceSpill1259_46)[6] = ((byte) ((int) (local8_life45 >>> 8)));
        (__sourceSpill1259_46)[7] = ((byte) ((int) local8_life45));
        javax.crypto.Cipher __sourceSpill1259_47 = local0_life9;
        byte[] local10_life49 = ((javax.crypto.Cipher)(__sourceSpill1259_47)).doFinal(((byte[])(__sourceSpill1259_46)));
        (__sourceSpill1259_43)[__sourceSpill1259_44] = (((((((((((long) (local10_life49)[0]) & 255L) << 56) | ((((long) (local10_life49)[1]) & 255L) << 48)) | ((((long) (local10_life49)[2]) & 255L) << 40)) | ((((long) (local10_life49)[3]) & 255L) << 32)) | ((((long) (local10_life49)[4]) & 255L) << 24)) | ((((long) (local10_life49)[5]) & 255L) << 16)) | ((((long) (local10_life49)[6]) & 255L) << 8)) | (((long) (local10_life49)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    B = ((long[])(local6_life19));
    C = ((java.lang.Integer[])(new java.lang.Integer[19]));
    net.minecraft.client.settings.GameSettings$Options[] __sourceSpill1259_54 = new net.minecraft.client.settings.GameSettings$Options[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1259_52(21722, (2920924260820384374L ^ local11_life6))];
    (__sourceSpill1259_54)[0] = net.minecraft.client.settings.GameSettings$Options.CHAT_VISIBILITY;
    (__sourceSpill1259_54)[1] = net.minecraft.client.settings.GameSettings$Options.CHAT_COLOR;
    (__sourceSpill1259_54)[2] = net.minecraft.client.settings.GameSettings$Options.CHAT_LINKS;
    (__sourceSpill1259_54)[3] = net.minecraft.client.settings.GameSettings$Options.CHAT_OPACITY;
    (__sourceSpill1259_54)[4] = net.minecraft.client.settings.GameSettings$Options.CHAT_LINKS_PROMPT;
    (__sourceSpill1259_54)[5] = net.minecraft.client.settings.GameSettings$Options.CHAT_SCALE;
    (__sourceSpill1259_54)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1259_60(29694, (2893368700887358814L ^ local11_life6))] = net.minecraft.client.settings.GameSettings$Options.CHAT_HEIGHT_FOCUSED;
    (__sourceSpill1259_54)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1259_62(26982, (7342524691855755214L ^ local11_life6))] = net.minecraft.client.settings.GameSettings$Options.CHAT_HEIGHT_UNFOCUSED;
    (__sourceSpill1259_54)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1259_64(18933, (4546160470831294283L ^ local11_life6))] = net.minecraft.client.settings.GameSettings$Options.CHAT_WIDTH;
    (__sourceSpill1259_54)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1259_66(30465, (1629384109771741610L ^ local11_life6))] = net.minecraft.client.settings.GameSettings$Options.REDUCED_DEBUG_INFO;
    w = ((net.minecraft.client.settings.GameSettings$Options[])(__sourceSpill1259_54));
}


public void c__Void() { __sourceHandlerCall_7dd1b5403d58cf573a62(this); }


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 6075;
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
            throw new RuntimeException("moom/hd", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         C[var3] = var15;
      }

      return C[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral7901_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/hd"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.hd.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public void a(int p0, int p1, float p2) {
long local4 = (moom.hd.A ^ 85763986085704L);
    ((moom.hd)(this)).i();
    ((moom.hd)(this)).a(((net.minecraft.client.gui.FontRenderer)(this.p)), ((java.lang.String)(this.z)), ((int)((this.k / 2))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1488_5(6135, (3305148232991430332L ^ local4)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1488_6(284, (4785656703558369370L ^ local4)))));
    super.a(((int)(p0)), ((int)(p1)), ((float)(p2)));
    return;
}


protected void a__Void(moom.gc p0) throws java.io.IOException { __sourceHandlerCall_806306b1f6e7d3daa0ca(this, p0); }


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1259_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1259_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1259_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1259_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1259_66(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral7901_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1488_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1488_6(int a0, long a1) throws E;
}
