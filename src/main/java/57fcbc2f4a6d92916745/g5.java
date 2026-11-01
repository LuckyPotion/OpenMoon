package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class g5 {

private static net.minecraft.client.Minecraft a;

private com.moon.gX b;

private boolean c;

private com.moon.g1 d;

private com.moon.g2 e;

private com.moon.g3 f;

private com.moon.g4 g;

private com.moon.g0 h;

private com.moon.iu i;

private com.moon.module.impl.ESP j;

private com.moon.module.impl.StorageEsp k;

private static long l;

private static java.lang.String m;

private static long[] n;

private static java.lang.Integer[] o;

private static java.util.Map p;

public g5(com.moon.module.impl.ESP p0, com.moon.module.impl.StorageEsp p1) { super(); __sourceHandlerCall_efcc99363a9edd3d89df(this, p0, p1); }


static {
l = ((long)(((moom._a)(moom._c.a(((long)(-1033491738146491652L)), ((long)(3585941239141373529L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(64538378767328L)))));
    long local11_life6 = (com.moon.g5.l ^ 45541758615167L);
    javax.crypto.Cipher local13_life8;
    javax.crypto.Cipher __sourceSpill106_10 = (local13_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill106_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill106_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill106_13 = new byte[8];
    (__sourceSpill106_13)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local14_life14 = 1;
    while ((local14_life14 < 8)) {
        (__sourceSpill106_13)[local14_life14] = ((byte) ((int) ((local11_life6 << (local14_life14 * 8)) >>> 56)));
        local14_life14 += 1;
    }
    byte[] __sourcePreallocation106_15 = __sourceSpill106_13;
    ((javax.crypto.Cipher)(__sourceSpill106_10)).init(((int)(__sourceSpill106_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill106_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation106_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill106_19 = ((java.lang.String)("À!Úä{\025)TT\"¢,\021ËÇ]w~B\032")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill106_20 = local13_life8;
    byte[] local15_life22 = ((javax.crypto.Cipher)(__sourceSpill106_20)).doFinal(((byte[])(__sourceSpill106_19)));
    m = ((java.lang.String)(((java.lang.String)(com.moon.g5.a(((byte[])(local15_life22))))).intern()));
    p = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life28;
    javax.crypto.Cipher __sourceSpill106_30 = (local0_life28 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill106_31 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill106_32 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill106_33 = new byte[8];
    (__sourceSpill106_33)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life34 = 1;
    while ((local1_life34 < 8)) {
        (__sourceSpill106_33)[local1_life34] = ((byte) ((int) ((local11_life6 << (local1_life34 * 8)) >>> 56)));
        local1_life34 += 1;
    }
    byte[] __sourcePreallocation106_35 = __sourceSpill106_33;
    ((javax.crypto.Cipher)(__sourceSpill106_30)).init(((int)(__sourceSpill106_31)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill106_32)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation106_35)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life38 = new long[2];
    int local3_life39 = 0;
    java.lang.String local4_life40;
    int local5_life42 = ((java.lang.String)((local4_life40 = "\026WÑ!$w9ÝïWðÂA£ñ"))).length();
    int local2_life43 = 0;
    do {
        java.lang.String __sourceSpill106_44 = local4_life40;
        int __sourceSpill106_45 = local2_life43;
        local2_life43 += 8;
        byte[] local7_life48 = ((java.lang.String)(((java.lang.String)(__sourceSpill106_44)).substring(((int)(__sourceSpill106_45)), ((int)(local2_life43))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill106_49 = local6_life38;
        int __sourceSpill106_50 = local3_life39;
        local3_life39 += 1;
        long local8_life51 = (((((((((((long) (local7_life48)[0]) & 255L) << 56) | ((((long) (local7_life48)[1]) & 255L) << 48)) | ((((long) (local7_life48)[2]) & 255L) << 40)) | ((((long) (local7_life48)[3]) & 255L) << 32)) | ((((long) (local7_life48)[4]) & 255L) << 24)) | ((((long) (local7_life48)[5]) & 255L) << 16)) | ((((long) (local7_life48)[6]) & 255L) << 8)) | (((long) (local7_life48)[7]) & 255L));
        byte[] __sourceSpill106_52 = new byte[8];
        (__sourceSpill106_52)[0] = ((byte) ((int) (local8_life51 >>> 56)));
        (__sourceSpill106_52)[1] = ((byte) ((int) (local8_life51 >>> 48)));
        (__sourceSpill106_52)[2] = ((byte) ((int) (local8_life51 >>> 40)));
        (__sourceSpill106_52)[3] = ((byte) ((int) (local8_life51 >>> 32)));
        (__sourceSpill106_52)[4] = ((byte) ((int) (local8_life51 >>> 24)));
        (__sourceSpill106_52)[5] = ((byte) ((int) (local8_life51 >>> 16)));
        (__sourceSpill106_52)[6] = ((byte) ((int) (local8_life51 >>> 8)));
        (__sourceSpill106_52)[7] = ((byte) ((int) local8_life51));
        javax.crypto.Cipher __sourceSpill106_53 = local0_life28;
        byte[] local10_life55 = ((javax.crypto.Cipher)(__sourceSpill106_53)).doFinal(((byte[])(__sourceSpill106_52)));
        (__sourceSpill106_49)[__sourceSpill106_50] = (((((((((((long) (local10_life55)[0]) & 255L) << 56) | ((((long) (local10_life55)[1]) & 255L) << 48)) | ((((long) (local10_life55)[2]) & 255L) << 40)) | ((((long) (local10_life55)[3]) & 255L) << 32)) | ((((long) (local10_life55)[4]) & 255L) << 24)) | ((((long) (local10_life55)[5]) & 255L) << 16)) | ((((long) (local10_life55)[6]) & 255L) << 8)) | (((long) (local10_life55)[7]) & 255L));
    } while ((!(local2_life43 >= local5_life42)));
    n = ((long[])(local6_life38));
    o = ((java.lang.Integer[])(new java.lang.Integer[2]));
    a = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM()));
}

private static native <E extends Throwable> void __sourceHandlerCall_efcc99363a9edd3d89df(com.moon.g5 a0, com.moon.module.impl.ESP a1, com.moon.module.impl.StorageEsp a2) throws E;
private static final class __SourceHandler_efcc99363a9edd3d89df {

public static void f400001(com.moon.g5 receiver, com.moon.module.impl.ESP p0, com.moon.module.impl.StorageEsp p1) throws Throwable {
    int spill400001_0;
    long life3_3;
    int life5_12;
    life3_3 = (__fieldRead400001_0() ^ 93329817631708L);
    spill400001_0 = __call400001_1();
    __directSuperInit400001_2(receiver);
    __fieldWrite400001_3(receiver, new com.moon.gX());
    life5_12 = spill400001_0;
    __fieldWrite400001_4(receiver, 1);
    __fieldWrite400001_5(receiver, new com.moon.iu(1, 1, false));
    __fieldWrite400001_6(receiver, p0);
    __fieldWrite400001_7(receiver, p1);
    java.lang.Object __inlineStack400001_8Token;
    java.lang.Object __inlineDiscard400001_10Token;
    __fieldWrite400001_12(receiver, new com.moon.g1(p0, p1, __invokedynamic400001_11(__inlineDiscard400001_10Output0((__inlineDiscard400001_10Token = __inlineDiscard400001_10Pack(__inlineStack400001_8Output0((__inlineStack400001_8Token = __inlineStack400001_8Pack(p0))), __call400001_9(__inlineStack400001_8Output1(__inlineStack400001_8Token))))))));
    __fieldWrite400001_14(receiver, new com.moon.g2(p0, __fieldRead400001_13(receiver)));
    __fieldWrite400001_16(receiver, new com.moon.g3(p0, __fieldRead400001_15(receiver)));
    __fieldWrite400001_17(receiver, new com.moon.g4(p0, p1));
    __fieldWrite400001_18(receiver, new com.moon.g0(p0, p1));
    __call400001_21(new java.lang.Thread(__invokedynamic400001_19(receiver), __fieldRead400001_20()));
    if ((life5_12 == 0)) {
        __call400001_22(new java.lang.String[1]);
    } else {
        
    }
    return;
}
private static native long __fieldRead400001_0() throws Throwable;
private static native int __call400001_1() throws Throwable;
private static native void __directSuperInit400001_2(com.moon.g5 a0) throws Throwable;
private static native void __fieldWrite400001_3(com.moon.g5 a0, com.moon.gX a1) throws Throwable;
private static native void __fieldWrite400001_4(com.moon.g5 a0, int a1) throws Throwable;
private static native void __fieldWrite400001_5(com.moon.g5 a0, com.moon.iu a1) throws Throwable;
private static native void __fieldWrite400001_6(com.moon.g5 a0, com.moon.module.impl.ESP a1) throws Throwable;
private static native void __fieldWrite400001_7(com.moon.g5 a0, com.moon.module.impl.StorageEsp a1) throws Throwable;
private static native java.lang.Object __inlineStack400001_8Pack(com.moon.module.impl.ESP a0) throws Throwable;
private static native com.moon.module.impl.ESP __inlineStack400001_8Output0(java.lang.Object token) throws Throwable;
private static native com.moon.module.impl.ESP __inlineStack400001_8Output1(java.lang.Object token) throws Throwable;
private static native java.lang.Object __call400001_9(com.moon.module.impl.ESP a0) throws Throwable;
private static native java.lang.Object __inlineDiscard400001_10Pack(com.moon.module.impl.ESP a0, java.lang.Object a1) throws Throwable;
private static native com.moon.module.impl.ESP __inlineDiscard400001_10Output0(java.lang.Object token) throws Throwable;
private static native java.util.function.Predicate __invokedynamic400001_11(com.moon.module.impl.ESP a0) throws Throwable;
private static native void __fieldWrite400001_12(com.moon.g5 a0, com.moon.g1 a1) throws Throwable;
private static native com.moon.g1 __fieldRead400001_13(com.moon.g5 a0) throws Throwable;
private static native void __fieldWrite400001_14(com.moon.g5 a0, com.moon.g2 a1) throws Throwable;
private static native com.moon.g1 __fieldRead400001_15(com.moon.g5 a0) throws Throwable;
private static native void __fieldWrite400001_16(com.moon.g5 a0, com.moon.g3 a1) throws Throwable;
private static native void __fieldWrite400001_17(com.moon.g5 a0, com.moon.g4 a1) throws Throwable;
private static native void __fieldWrite400001_18(com.moon.g5 a0, com.moon.g0 a1) throws Throwable;
private static native java.lang.Runnable __invokedynamic400001_19(com.moon.g5 a0) throws Throwable;
private static native java.lang.String __fieldRead400001_20() throws Throwable;
private static native void __call400001_21(java.lang.Thread a0) throws Throwable;
private static native void __call400001_22(java.lang.String[] a0) throws Throwable;

}


private boolean b() {
int forwardValue223_24_0;
    int forwardValue223_33_0;
    int forwardValue223_37_0;
    int forwardValue223_39_0;
    boolean spill223_0;
    boolean spill223_1;
    long life1_3;
    int life3_5;
    forward_join_39: {
    forward_join_38: {
    forward_join_37: {
    forward_join_36: {
    forward_join_33: {
    forward_join_24: {
    forward_join_21: {
    life1_3 = (com.moon.g5.l ^ 117560363419124L);
    life3_5 = __sourceExactCall_ea2573d3bcb2e3();
    spill223_0 = ((com.moon.module.impl.ESP)(this.j)).isEnabled();
    if (!((life3_5 != 0))) {
        forwardValue223_24_0 = ((spill223_0) ? 1 : 0);
        break forward_join_24;
    }
    if (!(spill223_0)) {
        break forward_join_21;
    }
    spill223_1 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.ESP)(this.j)).r())).getValue())))).booleanValue();
    if (!((life3_5 != 0))) {
        forwardValue223_37_0 = ((spill223_1) ? 1 : 0);
        break forward_join_37;
    }
    if (!((!spill223_1))) {
        break forward_join_36;
    }
    }
    forwardValue223_24_0 = ((((com.moon.module.impl.StorageEsp)(this.k)).isEnabled()) ? 1 : 0);
    }
    if (!((life3_5 != 0))) {
        forwardValue223_33_0 = forwardValue223_24_0;
        break forward_join_33;
    }
    if (!((forwardValue223_24_0 != 0))) {
        break forward_join_38;
    }
    forwardValue223_33_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.StorageEsp)(this.k)).g())).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life3_5 != 0))) {
        forwardValue223_37_0 = forwardValue223_33_0;
        break forward_join_37;
    }
    if (!((forwardValue223_33_0 != 0))) {
        break forward_join_38;
    }
    }
    forwardValue223_37_0 = 1;
    }
    forwardValue223_39_0 = forwardValue223_37_0;
    break forward_join_39;
    }
    forwardValue223_39_0 = 0;
    }
    return ((forwardValue223_39_0) != 0);
}


private boolean c() {
int forwardValue224_24_0;
    int forwardValue224_33_0;
    int forwardValue224_37_0;
    int forwardValue224_39_0;
    boolean spill224_0;
    boolean spill224_1;
    long life1_3;
    int life3_5;
    forward_join_39: {
    forward_join_38: {
    forward_join_37: {
    forward_join_36: {
    forward_join_33: {
    forward_join_24: {
    forward_join_21: {
    life1_3 = (com.moon.g5.l ^ 3366826369387L);
    life3_5 = __sourceExactCall_2328fb498cb6d4();
    spill224_0 = ((com.moon.module.impl.ESP)(this.j)).isEnabled();
    if (!((life3_5 == 0))) {
        forwardValue224_24_0 = ((spill224_0) ? 1 : 0);
        break forward_join_24;
    }
    if (!(spill224_0)) {
        break forward_join_21;
    }
    spill224_1 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.ESP)(this.j)).a__kV())).getValue())))).booleanValue();
    if (!((life3_5 == 0))) {
        forwardValue224_37_0 = ((spill224_1) ? 1 : 0);
        break forward_join_37;
    }
    if (!((!spill224_1))) {
        break forward_join_36;
    }
    }
    forwardValue224_24_0 = ((((com.moon.module.impl.StorageEsp)(this.k)).isEnabled()) ? 1 : 0);
    }
    if (!((life3_5 == 0))) {
        forwardValue224_33_0 = forwardValue224_24_0;
        break forward_join_33;
    }
    if (!((forwardValue224_24_0 != 0))) {
        break forward_join_38;
    }
    forwardValue224_33_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.StorageEsp)(this.k)).a__kV())).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life3_5 == 0))) {
        forwardValue224_37_0 = forwardValue224_33_0;
        break forward_join_37;
    }
    if (!((forwardValue224_33_0 != 0))) {
        break forward_join_38;
    }
    }
    forwardValue224_37_0 = 1;
    }
    forwardValue224_39_0 = forwardValue224_37_0;
    break forward_join_39;
    }
    forwardValue224_39_0 = 0;
    }
    return ((forwardValue224_39_0) != 0);
}


private boolean d() {
int forwardValue225_24_0;
    int forwardValue225_33_0;
    int forwardValue225_37_0;
    int forwardValue225_39_0;
    boolean spill225_0;
    boolean spill225_1;
    long life1_3;
    int life3_5;
    forward_join_39: {
    forward_join_38: {
    forward_join_37: {
    forward_join_36: {
    forward_join_33: {
    forward_join_24: {
    forward_join_21: {
    life1_3 = (com.moon.g5.l ^ 50381864312871L);
    life3_5 = __sourceExactCall_ea2573d3bcb2e3();
    spill225_0 = ((com.moon.module.impl.ESP)(this.j)).isEnabled();
    if (!((life3_5 != 0))) {
        forwardValue225_24_0 = ((spill225_0) ? 1 : 0);
        break forward_join_24;
    }
    if (!(spill225_0)) {
        break forward_join_21;
    }
    spill225_1 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.ESP)(this.j)).s())).getValue())))).booleanValue();
    if (!((life3_5 != 0))) {
        forwardValue225_37_0 = ((spill225_1) ? 1 : 0);
        break forward_join_37;
    }
    if (!((!spill225_1))) {
        break forward_join_36;
    }
    }
    forwardValue225_24_0 = ((((com.moon.module.impl.StorageEsp)(this.k)).isEnabled()) ? 1 : 0);
    }
    if (!((life3_5 != 0))) {
        forwardValue225_33_0 = forwardValue225_24_0;
        break forward_join_33;
    }
    if (!((forwardValue225_24_0 != 0))) {
        break forward_join_38;
    }
    forwardValue225_33_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.StorageEsp)(this.k)).h())).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life3_5 != 0))) {
        forwardValue225_37_0 = forwardValue225_33_0;
        break forward_join_37;
    }
    if (!((forwardValue225_33_0 != 0))) {
        break forward_join_38;
    }
    }
    forwardValue225_37_0 = 1;
    }
    forwardValue225_39_0 = forwardValue225_37_0;
    break forward_join_39;
    }
    forwardValue225_39_0 = 0;
    }
    return ((forwardValue225_39_0) != 0);
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.g5.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static java.lang.String a(byte[] p0) {
int life1_1;
    int life2_5;
    char[] life3_7;
    int life4_9;
    int life5_19;
    int life6_39;
    int life5_44;
    int life6_52;
    int life6_71;
    int life5_76;
    int life6_86;
    int life5_91;
    int life6_99;
    life1_1 = 0;
    life3_7 = new char[(life2_5 = (p0).length)];
    life4_9 = 0;
    loop_region_10: while ((life4_9 < life2_5)) {
        if (((life5_19 = (255 & (p0)[life4_9])) < 192)) {
        (life3_7)[(life1_1++)] = ((char) life5_19);
    } else {
        if ((life5_19 < 224)) {
        life6_39 = ((int)(((char) (((char) (life5_19 & 31)) << 6))));
        byte[] spill364_0 = p0;
        life4_9 += 1;
        life5_44 = (spill364_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill364_1 = p0;
        life4_9 += 1;
        life5_76 = (spill364_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill364_2 = p0;
        life4_9 += 1;
        life5_91 = (spill364_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 5339;
      if (o[var3] == null) {
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
         long var5 = n[var3];
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
         Object[] var9 = (Object[])p.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               p.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/g5", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         o[var3] = var15;
      }

      return o[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1198_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/g5"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(com.moon.event.Render3DEvent p0) {
int forwardValue221_32_0;
    int forwardValue221_46_0;
    int forwardValue221_60_0;
    int forwardValue221_74_0;
    int forwardValue221_95_0;
    int forwardValue221_109_0;
    int forwardValue221_123_0;
    int forwardValue221_139_0;
    com.moon.g5 forwardValue221_149_0;
    int spill221_0;
    boolean spill221_1;
    boolean spill221_2;
    int spill221_3;
    boolean spill221_4;
    boolean spill221_5;
    boolean spill221_6;
    boolean spill221_7;
    boolean spill221_8;
    boolean spill221_9;
    boolean spill221_10;
    com.moon.g5 spill221_11;
    com.moon.g5 spill221_12;
    long life2_3;
    int life4_6;
    forward_join_157: {
    forward_join_149: {
    forward_join_148: {
    forward_join_139: {
    forward_join_134: {
    forward_join_123: {
    forward_join_120: {
    forward_join_109: {
    forward_join_106: {
    forward_join_95: {
    forward_join_85: {
    forward_join_74: {
    forward_join_71: {
    forward_join_60: {
    forward_join_57: {
    forward_join_46: {
    forward_join_43: {
    forward_join_32: {
    forward_join_29: {
    life2_3 = (com.moon.g5.l ^ 1123000665696L);
    spill221_0 = __sourceExactCall_2328fb498cb6d4();
    moom.kZ.i();
    life4_6 = spill221_0;
    spill221_1 = this.c;
    if (!((life4_6 == 0))) {
        forwardValue221_32_0 = ((spill221_1) ? 1 : 0);
        break forward_join_32;
    }
    if (!((!spill221_1))) {
        break forward_join_29;
    }
    spill221_2 = ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.g5.a)).W)).E;
    if (!((life4_6 == 0))) {
        forwardValue221_32_0 = ((spill221_2) ? 1 : 0);
        break forward_join_32;
    }
    if (!((!spill221_2))) {
        break forward_join_29;
    }
    spill221_3 = ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.g5.a)).W)).r;
    if (!((life4_6 == 0))) {
        forwardValue221_95_0 = spill221_3;
        break forward_join_95;
    }
    if (!((spill221_3 < __sourceIntrinsic_2a96c96660b0_invokedynamic221_12(10118, (8569052488115325218L ^ life2_3))))) {
        break forward_join_85;
    }
    }
    forwardValue221_32_0 = ((((com.moon.g2)(this.e)).a__Boolean()) ? 1 : 0);
    }
    if (!((life4_6 == 0))) {
        forwardValue221_46_0 = forwardValue221_32_0;
        break forward_join_46;
    }
    if (!((forwardValue221_32_0 != 0))) {
        break forward_join_43;
    }
    spill221_4 = ((com.moon.g5)(this)).a__Boolean();
    if (!((life4_6 == 0))) {
        forwardValue221_46_0 = ((spill221_4) ? 1 : 0);
        break forward_join_46;
    }
    if (!(spill221_4)) {
        break forward_join_43;
    }
    ((com.moon.g2)(this.e)).b__Void();
    }
    forwardValue221_46_0 = ((((com.moon.g3)(this.f)).a__Boolean()) ? 1 : 0);
    }
    if (!((life4_6 == 0))) {
        forwardValue221_60_0 = forwardValue221_46_0;
        break forward_join_60;
    }
    if (!((forwardValue221_46_0 != 0))) {
        break forward_join_57;
    }
    spill221_5 = ((com.moon.g5)(this)).b();
    if (!((life4_6 == 0))) {
        forwardValue221_60_0 = ((spill221_5) ? 1 : 0);
        break forward_join_60;
    }
    if (!(spill221_5)) {
        break forward_join_57;
    }
    ((com.moon.g3)(this.f)).b__Void();
    }
    forwardValue221_60_0 = ((((com.moon.g0)(this.h)).a__Boolean()) ? 1 : 0);
    }
    if (!((life4_6 == 0))) {
        forwardValue221_74_0 = forwardValue221_60_0;
        break forward_join_74;
    }
    if (!((forwardValue221_60_0 != 0))) {
        break forward_join_71;
    }
    spill221_6 = ((com.moon.g5)(this)).d();
    if (!((life4_6 == 0))) {
        forwardValue221_74_0 = ((spill221_6) ? 1 : 0);
        break forward_join_74;
    }
    if (!(spill221_6)) {
        break forward_join_71;
    }
    ((com.moon.g0)(this.h)).b__Void();
    }
    forwardValue221_74_0 = ((((com.moon.g4)(this.g)).a__Boolean()) ? 1 : 0);
    }
    if (!((life4_6 == 0))) {
        forwardValue221_95_0 = forwardValue221_74_0;
        break forward_join_95;
    }
    if (!((forwardValue221_74_0 != 0))) {
        break forward_join_85;
    }
    spill221_7 = ((com.moon.g5)(this)).c();
    if (!((life4_6 == 0))) {
        forwardValue221_95_0 = ((spill221_7) ? 1 : 0);
        break forward_join_95;
    }
    if (!(spill221_7)) {
        break forward_join_85;
    }
    ((com.moon.g4)(this.g)).b__Void();
    }
    ((net.minecraft.client.shader.Framebuffer)(((net.minecraft.client.Minecraft)(com.moon.g5.a)).a__pA())).a(((boolean)(false)));
    moom.kZ.f();
    moom.kZ.l();
    moom.kZ.i();
    forwardValue221_95_0 = ((((com.moon.g2)(this.e)).a__Boolean()) ? 1 : 0);
    }
    if (!((life4_6 == 0))) {
        forwardValue221_109_0 = forwardValue221_95_0;
        break forward_join_109;
    }
    if (!((forwardValue221_95_0 != 0))) {
        break forward_join_106;
    }
    spill221_8 = ((com.moon.g5)(this)).a__Boolean();
    if (!((life4_6 == 0))) {
        forwardValue221_109_0 = ((spill221_8) ? 1 : 0);
        break forward_join_109;
    }
    if (!(spill221_8)) {
        break forward_join_106;
    }
    ((com.moon.g2)(this.e)).a__Void();
    }
    forwardValue221_109_0 = ((((com.moon.g3)(this.f)).a__Boolean()) ? 1 : 0);
    }
    if (!((life4_6 == 0))) {
        forwardValue221_123_0 = forwardValue221_109_0;
        break forward_join_123;
    }
    if (!((forwardValue221_109_0 != 0))) {
        break forward_join_120;
    }
    spill221_9 = ((com.moon.g5)(this)).b();
    if (!((life4_6 == 0))) {
        forwardValue221_123_0 = ((spill221_9) ? 1 : 0);
        break forward_join_123;
    }
    if (!(spill221_9)) {
        break forward_join_120;
    }
    ((com.moon.g3)(this.f)).a__Void();
    }
    forwardValue221_123_0 = ((((com.moon.g0)(this.h)).a__Boolean()) ? 1 : 0);
    }
    if (!((life4_6 == 0))) {
        forwardValue221_139_0 = forwardValue221_123_0;
        break forward_join_139;
    }
    if (!((forwardValue221_123_0 != 0))) {
        break forward_join_134;
    }
    spill221_10 = ((com.moon.g5)(this)).d();
    if (!((life4_6 == 0))) {
        forwardValue221_139_0 = ((spill221_10) ? 1 : 0);
        break forward_join_139;
    }
    if (!(spill221_10)) {
        break forward_join_134;
    }
    ((com.moon.g0)(this.h)).a__Void();
    }
    spill221_11 = this;
    if (!((life4_6 == 0))) {
        forwardValue221_149_0 = spill221_11;
        break forward_join_149;
    }
    forwardValue221_139_0 = ((((com.moon.g4)(((com.moon.g5)(spill221_11)).g)).a__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue221_139_0 != 0))) {
        break forward_join_148;
    }
    spill221_12 = this;
    if (!((life4_6 == 0))) {
        forwardValue221_149_0 = spill221_12;
        break forward_join_149;
    }
    if (!(((com.moon.g5)(spill221_12)).c())) {
        break forward_join_148;
    }
    ((com.moon.g4)(this.g)).a__Void();
    }
    forwardValue221_149_0 = this;
    }
    ((com.moon.g5)(forwardValue221_149_0)).c = ((boolean)(false));
    moom.kZ.j();
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        break forward_join_157;
    }
    life4_6 += 1;
    moom.sZ.k(((int)(life4_6)));
    }
    return;
}


public void a(com.moon.eT p0) {
int forwardValue220_18_0;
    int forwardValue220_42_0;
    com.moon.g5 forwardValue220_49_0;
    boolean spill220_0;
    boolean spill220_1;
    int spill220_2;
    com.moon.g5 spill220_3;
    com.moon.g5 spill220_4;
    long life2_3;
    int life4_5;
    forward_join_51: {
    forward_join_49: {
    forward_join_48: {
    forward_join_42: {
    forward_join_38: {
    forward_join_18: {
    life2_3 = (com.moon.g5.l ^ 93964289863270L);
    life4_5 = __sourceExactCall_2328fb498cb6d4();
    if (!((((com.moon.eT)(p0)).a() == com.moon.a2.POST))) {
        break forward_join_51;
    }
    spill220_0 = ((com.moon.g1)(this.d)).a__Boolean();
    if (!((life4_5 == 0))) {
        forwardValue220_18_0 = ((spill220_0) ? 1 : 0);
        break forward_join_18;
    }
    if (!(spill220_0)) {
        break forward_join_51;
    }
    forwardValue220_18_0 = ((this.c) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forwardValue220_42_0 = forwardValue220_18_0;
        break forward_join_42;
    }
    if (!((forwardValue220_18_0 == 0))) {
        break forward_join_38;
    }
    spill220_1 = ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.g5.a)).W)).E;
    if (!((life4_5 == 0))) {
        forwardValue220_42_0 = ((spill220_1) ? 1 : 0);
        break forward_join_42;
    }
    if (!((!spill220_1))) {
        break forward_join_38;
    }
    spill220_2 = ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.g5.a)).W)).r;
    if (!((life4_5 == 0))) {
        forwardValue220_42_0 = spill220_2;
        break forward_join_42;
    }
    if (!((spill220_2 < __sourceIntrinsic_0a8c3919b3f9_invokedynamic220_16(30319, (3623716922146549964L ^ life2_3))))) {
        break forward_join_51;
    }
    }
    spill220_3 = this;
    if (!((life4_5 == 0))) {
        forwardValue220_49_0 = spill220_3;
        break forward_join_49;
    }
    forwardValue220_42_0 = ((((com.moon.g5)(spill220_3)).b()) ? 1 : 0);
    }
    if (!((forwardValue220_42_0 == 0))) {
        break forward_join_48;
    }
    spill220_4 = this;
    if (!((life4_5 == 0))) {
        forwardValue220_49_0 = spill220_4;
        break forward_join_49;
    }
    if (!(((com.moon.g5)(spill220_4)).a__Boolean())) {
        break forward_join_51;
    }
    }
    forwardValue220_49_0 = this;
    }
    ((com.moon.g1)(((com.moon.g5)(forwardValue220_49_0)).d)).c__Void();
    }
    return;
}


public int a() {
return java.lang.Math.max(((int)((net.minecraft.client.Minecraft.b() / 5))), ((int)(((org.lwjgl.opengl.DisplayMode)(org.lwjgl.opengl.Display.getDesktopDisplayMode())).getFrequency())));
}


public com.moon.iu a__iu() {
return this.i;
}


private boolean a__Boolean() {
int forwardValue222_24_0;
    int forwardValue222_33_0;
    int forwardValue222_37_0;
    int forwardValue222_39_0;
    boolean spill222_0;
    boolean spill222_1;
    long life1_3;
    int life3_5;
    forward_join_39: {
    forward_join_38: {
    forward_join_37: {
    forward_join_36: {
    forward_join_33: {
    forward_join_24: {
    forward_join_21: {
    life1_3 = (com.moon.g5.l ^ 98133422182365L);
    life3_5 = __sourceExactCall_2328fb498cb6d4();
    spill222_0 = ((com.moon.module.impl.ESP)(this.j)).isEnabled();
    if (!((life3_5 == 0))) {
        forwardValue222_24_0 = ((spill222_0) ? 1 : 0);
        break forward_join_24;
    }
    if (!(spill222_0)) {
        break forward_join_21;
    }
    spill222_1 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.ESP)(this.j)).o())).getValue())))).booleanValue();
    if (!((life3_5 == 0))) {
        forwardValue222_37_0 = ((spill222_1) ? 1 : 0);
        break forward_join_37;
    }
    if (!((!spill222_1))) {
        break forward_join_36;
    }
    }
    forwardValue222_24_0 = ((((com.moon.module.impl.StorageEsp)(this.k)).isEnabled()) ? 1 : 0);
    }
    if (!((life3_5 == 0))) {
        forwardValue222_33_0 = forwardValue222_24_0;
        break forward_join_33;
    }
    if (!((forwardValue222_24_0 != 0))) {
        break forward_join_38;
    }
    forwardValue222_33_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.StorageEsp)(this.k)).f())).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life3_5 == 0))) {
        forwardValue222_37_0 = forwardValue222_33_0;
        break forward_join_37;
    }
    if (!((forwardValue222_33_0 != 0))) {
        break forward_join_38;
    }
    }
    forwardValue222_37_0 = 1;
    }
    forwardValue222_39_0 = forwardValue222_37_0;
    break forward_join_39;
    }
    forwardValue222_39_0 = 0;
    }
    return ((forwardValue222_39_0) != 0);
}


private void lambda$new$0() {
terminal_cycle_0: while (true) {
        ((com.moon.gX)(this.b)).a(((int)(((com.moon.g5)(this)).a())));
        this.c = ((boolean)(true));
        continue terminal_cycle_0;
    }
}


private static native <E extends Throwable> int __sourceIntrinsic_0a8c3919b3f9_invokedynamic220_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2a96c96660b0_invokedynamic221_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1198_0() throws E;

private static native int __sourceExactCall_ea2573d3bcb2e3();
private static native int __sourceExactCall_2328fb498cb6d4();
}
