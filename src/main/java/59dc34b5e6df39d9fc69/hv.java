package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class hv extends net.minecraft.client.gui.GuiScreen {

private moom.Ct w;

private int x;

private int y;

private moom.gc z;

private static long A;

private static long[] B;

private static java.lang.Integer[] C;

private static java.util.Map D;

public hv(moom.Ct p0) {
super();
    this.w = p0;
}


static {
A = ((long)(((moom._a)(moom._c.a(((long)(1126111477411732982L)), ((long)(-4083205059557302027L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(134532841339856L)))));
    D = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.hv.A ^ 84440457813563L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1270_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1270_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1270_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1270_14 = new byte[8];
    (__sourceSpill1270_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1270_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1270_16 = __sourceSpill1270_14;
    ((javax.crypto.Cipher)(__sourceSpill1270_11)).init(((int)(__sourceSpill1270_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1270_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1270_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[12];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "oÂN\021V9DãA\006Î\006âÁ±Å¾kÕ:\020,Ó8ÉÀ¶ê\022\027¿gs>°6¬³§S;/­Sx%ÄnC\034L¦0H´æ[|f´÷\023/ù\032¡y¶4J"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1270_25 = local6_life21;
        int __sourceSpill1270_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1270_25)).substring(((int)(__sourceSpill1270_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1270_30 = local8_life19;
        int __sourceSpill1270_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1270_33 = new byte[8];
        (__sourceSpill1270_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1270_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1270_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1270_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1270_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1270_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1270_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1270_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1270_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1270_34)).doFinal(((byte[])(__sourceSpill1270_33)));
        (__sourceSpill1270_30)[__sourceSpill1270_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\024|\tÒÖ¡FËxZAùñë\004"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1270_38 = local6_life21;
        int __sourceSpill1270_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1270_38)).substring(((int)(__sourceSpill1270_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1270_43 = local8_life19;
        int __sourceSpill1270_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1270_46 = new byte[8];
        (__sourceSpill1270_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1270_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1270_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1270_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1270_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1270_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1270_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1270_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1270_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1270_47)).doFinal(((byte[])(__sourceSpill1270_46)));
        (__sourceSpill1270_43)[__sourceSpill1270_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    B = ((long[])(local8_life19));
    C = ((java.lang.Integer[])(new java.lang.Integer[12]));
}

private static native <E extends Throwable> void __sourceHandlerCall_f5e9e48bacbfb53c911f(moom.hv a0, char a1, int a2) throws E;
private static final class __SourceHandler_f5e9e48bacbfb53c911f {

public static void f1063(moom.hv receiver, char p0, int p1) throws Throwable {
    long life3_3;
    java.lang.String life5_67;
    forward_join_110: {
    forward_join_93: {
    forward_join_74: {
    forward_join_48: {
    forward_join_40: {
    forward_join_19: {
    life3_3 = (__fieldRead1063_0() ^ 30984751502182L);
    if (!((p1 == __invokedynamic1063_1(12059, (3755163303691108108L ^ life3_3))))) { break forward_join_19; }
    __fieldWrite1063_3(receiver, ((__fieldRead1063_2(receiver) - 1) & 3));
    }
    if (!((p1 != __invokedynamic1063_4(29611, (670713798569190334L ^ life3_3))))) { break forward_join_40; }
    if (!((p1 != __invokedynamic1063_5(32096, (4741332145912311155L ^ life3_3))))) { break forward_join_40; }
    if (!((p1 == __invokedynamic1063_6(5086, (8249770072427594700L ^ life3_3))))) { break forward_join_48; }
    }
    __fieldWrite1063_8(receiver, ((__fieldRead1063_7(receiver) + 1) & 3));
    }
    life5_67 = __call1063_12((__fieldRead1063_10(__fieldRead1063_9(receiver)))[__fieldRead1063_11(receiver)]);
    if (!((p1 == __invokedynamic1063_13(17027, (4096136743959253653L ^ life3_3))))) { break forward_join_74; }
    if (!((__call1063_14(life5_67) > 0))) { break forward_join_74; }
    life5_67 = __call1063_16(life5_67, 0, (__call1063_15(life5_67) - 1));
    }
    if (!(__call1063_17(p0))) { break forward_join_93; }
    if (!((__call1063_20(__fieldRead1063_18(receiver), __invokedynamic1063_19(life5_67, p0)) <= __invokedynamic1063_21(684, (3940686359057470134L ^ life3_3))))) { break forward_join_93; }
    life5_67 = __invokedynamic1063_22(life5_67, p0);
    }
    (__fieldRead1063_24(__fieldRead1063_23(receiver)))[__fieldRead1063_25(receiver)] = new moom.CM(life5_67);
    if (!((p1 == 1))) { break forward_join_110; }
    __call1063_27(receiver, __fieldRead1063_26(receiver));
    }
    return;
}
public static void h1063_0(java.io.IOException p0) throws Throwable {
    throw __call1106300_0(p0);
}
public static void h1063_1(java.io.IOException p0) throws Throwable {
    throw __call1106301_0(p0);
}
public static void h1063_2(java.io.IOException p0) throws Throwable {
    throw __call1106302_0(p0);
}
public static void h1063_3(java.io.IOException p0) throws Throwable {
    throw __call1106303_0(p0);
}
public static void h1063_4(java.io.IOException p0) throws Throwable {
    throw __call1106304_0(p0);
}
public static void h1063_5(java.io.IOException p0) throws Throwable {
    throw __call1106305_0(p0);
}
public static void h1063_6(java.io.IOException p0) throws Throwable {
    throw __call1106306_0(p0);
}
private static native long __fieldRead1063_0() throws Throwable;
private static native int __invokedynamic1063_1(int a0, long a1) throws Throwable;
private static native int __fieldRead1063_2(moom.hv a0) throws Throwable;
private static native void __fieldWrite1063_3(moom.hv a0, int a1) throws Throwable;
private static native int __invokedynamic1063_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic1063_5(int a0, long a1) throws Throwable;
private static native int __invokedynamic1063_6(int a0, long a1) throws Throwable;
private static native int __fieldRead1063_7(moom.hv a0) throws Throwable;
private static native void __fieldWrite1063_8(moom.hv a0, int a1) throws Throwable;
private static native moom.Ct __fieldRead1063_9(moom.hv a0) throws Throwable;
private static native net.minecraft.util.IChatComponent[] __fieldRead1063_10(moom.Ct a0) throws Throwable;
private static native int __fieldRead1063_11(moom.hv a0) throws Throwable;
private static native java.lang.String __call1063_12(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native int __invokedynamic1063_13(int a0, long a1) throws Throwable;
private static native int __call1063_14(java.lang.String a0) throws Throwable;
private static native int __call1063_15(java.lang.String a0) throws Throwable;
private static native java.lang.String __call1063_16(java.lang.String a0, int a1, int a2) throws Throwable;
private static native boolean __call1063_17(char a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1063_18(moom.hv a0) throws Throwable;
private static native java.lang.String __invokedynamic1063_19(java.lang.String a0, char a1) throws Throwable;
private static native int __call1063_20(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic1063_21(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic1063_22(java.lang.String a0, char a1) throws Throwable;
private static native moom.Ct __fieldRead1063_23(moom.hv a0) throws Throwable;
private static native net.minecraft.util.IChatComponent[] __fieldRead1063_24(moom.Ct a0) throws Throwable;
private static native int __fieldRead1063_25(moom.hv a0) throws Throwable;
private static native moom.gc __fieldRead1063_26(moom.hv a0) throws Throwable;
private static native void __call1063_27(moom.hv a0, moom.gc a1) throws Throwable;
private static native java.lang.Exception __call1106300_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1106301_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1106302_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1106303_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1106304_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1106305_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1106306_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_86384a4c6adb89962809(moom.hv a0, moom.gc a1) throws E;
private static final class __SourceHandler_86384a4c6adb89962809 {

public static void f1808(moom.hv receiver, moom.gc p0) throws Throwable {
    if (__fieldRead1808_0(p0)) {
        if ((__fieldRead1808_1(p0) == 0)) {
        __call1808_3(__fieldRead1808_2(receiver));
        __call1808_5(__fieldRead1808_4(receiver), null);
    }
    }
    return;
}
public static void h1808_0(java.io.IOException p0) throws Throwable {
    throw __call1180800_0(p0);
}
public static void h1808_1(java.io.IOException p0) throws Throwable {
    throw __call1180801_0(p0);
}
private static native boolean __fieldRead1808_0(moom.gc a0) throws Throwable;
private static native int __fieldRead1808_1(moom.gc a0) throws Throwable;
private static native moom.Ct __fieldRead1808_2(moom.hv a0) throws Throwable;
private static native void __call1808_3(moom.Ct a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1808_4(moom.hv a0) throws Throwable;
private static native void __call1808_5(net.minecraft.client.Minecraft a0, java.lang.Object a1) throws Throwable;
private static native java.lang.Exception __call1180800_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1180801_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_36045c8e218ffc7fb0a1(moom.hv a0) throws E;
private static final class __SourceHandler_36045c8e218ffc7fb0a1 {

public static void f100118(moom.hv receiver) throws Throwable {
    net.minecraft.client.network.NetHandlerPlayClient life1_5;
    forest_join_19: {
    __call100118_0(0);
    life1_5 = __call100118_2(__fieldRead100118_1(receiver));
    if (!((life1_5 != null))) {
        break forest_join_19;
    }
    __call100118_7(life1_5, new moom.zl(__call100118_4(__fieldRead100118_3(receiver)), __fieldRead100118_6(__fieldRead100118_5(receiver))));
    }
    __call100118_9(__fieldRead100118_8(receiver), 1);
    return;
}
public static void h100118_0(moom.Oo p0) throws Throwable {
    throw __call13011800_0(p0);
}
private static native void __call100118_0(int a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead100118_1(moom.hv a0) throws Throwable;
private static native net.minecraft.client.network.NetHandlerPlayClient __call100118_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.Ct __fieldRead100118_3(moom.hv a0) throws Throwable;
private static native moom.DT __call100118_4(moom.Ct a0) throws Throwable;
private static native moom.Ct __fieldRead100118_5(moom.hv a0) throws Throwable;
private static native net.minecraft.util.IChatComponent[] __fieldRead100118_6(moom.Ct a0) throws Throwable;
private static native void __call100118_7(net.minecraft.client.network.NetHandlerPlayClient a0, moom.zl a1) throws Throwable;
private static native moom.Ct __fieldRead100118_8(moom.hv a0) throws Throwable;
private static native void __call100118_9(moom.Ct a0, int a1) throws Throwable;
private static native java.lang.Exception __call13011800_0(moom.Oo a0) throws Throwable;

}


public void c__Void() {
java.util.List spill100117_0;
    moom.gc spill100117_1;
    long life1_3;
    life1_3 = (moom.hv.A ^ 22152651935531L);
    ((java.util.List)(this.m)).clear();
    org.lwjgl.input.Keyboard.enableRepeatEvents(((boolean)(true)));
    spill100117_0 = this.m;
    moom.hv __stackOp100117_10_0 = this;
    moom.gc __stackOp100117_10_1 = new moom.gc(0, ((this.k / 2) - __sourceIntrinsic_7ac46ee229a8_invokedynamic100117_6(30302, (7346311721387801095L ^ life1_3))), ((this.l / 4) + __sourceIntrinsic_7ac46ee229a8_invokedynamic100117_8(23545, (6694793378049169325L ^ life1_3))), moom.oO.a(((java.lang.String)("gui.done")), ((java.lang.Object[])(new java.lang.Object[0]))));
    spill100117_1 = __stackOp100117_10_1;
    ((moom.hv)(__stackOp100117_10_0)).z = ((moom.gc)(__stackOp100117_10_1));
    ((java.util.List)(spill100117_0)).add(((java.lang.Object)(spill100117_1)));
    ((moom.Ct)(this.w)).a(((boolean)(false)));
    return;
}


public void h() { __sourceHandlerCall_36045c8e218ffc7fb0a1(this); }


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.hv.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 7979;
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
            throw new RuntimeException("moom/hv", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         C[var3] = var15;
      }

      return C[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral7958_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/hv"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected void a__Void(moom.gc p0) throws java.io.IOException { __sourceHandlerCall_86384a4c6adb89962809(this, p0); }


protected void a(char p0, int p1) throws java.io.IOException { __sourceHandlerCall_f5e9e48bacbfb53c911f(this, p0, p1); }


public void a(int p0, int p1, float p2) {
long life4_3;
    float life6_43;
    net.minecraft.block.Block life7_59;
    float life8_75;
    int life8_89;
    float life9_91;
    life4_3 = (moom.hv.A ^ 45601013271213L);
    ((moom.hv)(this)).i();
    ((moom.hv)(this)).a(((net.minecraft.client.gui.FontRenderer)(this.p)), ((java.lang.String)(moom.oO.a(((java.lang.String)("sign.edit")), ((java.lang.Object[])(new java.lang.Object[0]))))), ((int)((this.k / 2))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic1844_5(16809, (6476061528382965881L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic1844_6(25465, (159977542170684067L ^ life4_3)))));
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    moom.kZ.B();
    moom.kZ.b(((float)(((float) (this.k / 2)))), ((float)(0x0.0p0f)), ((float)(0x1.9p5f)));
    life6_43 = 0x1.77p6f;
    moom.kZ.a(((float)((-life6_43))), ((float)((-life6_43))), ((float)((-life6_43))));
    moom.kZ.b(((float)(0x1.68p7f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    life7_59 = ((moom.Ct)(this.w)).a__ch();
    if ((life7_59 == net.minecraft.init.Blocks.an)) {
        life8_75 = (((float) (((moom.Ct)(this.w)).e() * __sourceIntrinsic_95e4e99d9b0c_invokedynamic1844_19(13703, (2276911770491780180L ^ life4_3)))) / 0x1.0p4f);
        moom.kZ.b(((float)(life8_75)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
        moom.kZ.b(((float)(0x0.0p0f)), ((float)(-0x1.1p0f)), ((float)(0x0.0p0f)));
    } else {
        life8_89 = ((moom.Ct)(this.w)).e();
        life9_91 = 0x0.0p0f;
        if ((life8_89 == 2)) {
        life9_91 = 0x1.68p7f;
    }
        if ((life8_89 == 4)) {
        life9_91 = 0x1.68p6f;
    }
        if ((life8_89 == 5)) {
        life9_91 = -0x1.68p6f;
    }
        moom.kZ.b(((float)(life9_91)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
        moom.kZ.b(((float)(0x0.0p0f)), ((float)(-0x1.1p0f)), ((float)(0x0.0p0f)));
    }
    try {
        if ((((this.x / __sourceIntrinsic_95e4e99d9b0c_invokedynamic1844_27(14829, (6695432613377208374L ^ life4_3))) % 2) == 0)) {
        ((moom.Ct)(this.w)).m = ((int)(this.y));
    }
    } catch (moom.Oo caught_rethrow_0) {
        throw moom.hv.a(((java.lang.Exception)(caught_rethrow_0)));
    }
    ((moom.oo)(moom.oo.b)).a(((net.minecraft.tileentity.TileEntity)(this.w)), ((double)(-0x1.0p-1d)), ((double)(-0x1.8p-1d)), ((double)(-0x1.0p-1d)), ((float)(0x0.0p0f)));
    ((moom.Ct)(this.w)).m = ((int)(-1));
    moom.kZ.C();
    super.a(((int)(p0)), ((int)(p1)), ((float)(p2)));
    return;
}


public void g() {
this.x += 1;
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic1844_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic1844_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic1844_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic1844_27(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral7958_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100117_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100117_8(int a0, long a1) throws E;
}
