package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;





















import moom.CA;






import net.minecraft.entity.Entity;
import java.util.Map;
public class g2 extends com.moon.gZ {

private final com.moon.g1 c;

private final com.moon.g7 d;

private final com.moon.g6 e;

private static final long f;

private static final long[] g;

private static final java.lang.Integer[] h;

private static final java.util.Map i;

public g2(com.moon.module.impl.ESP p0, com.moon.g1 p1) {
super(p0);
    this.c = p1;
    this.d = new com.moon.g7(p0);
    this.e = new com.moon.g6(p0);
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(-7932308987300989886L)), ((long)(4404109325293333697L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(211745279877921L)))));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.g2.f ^ 129624807998906L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill193_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill193_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill193_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill193_14 = new byte[8];
    (__sourceSpill193_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill193_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation193_16 = __sourceSpill193_14;
    ((javax.crypto.Cipher)(__sourceSpill193_11)).init(((int)(__sourceSpill193_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill193_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation193_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[5];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Á¬Z'ÜÚ9é#\020G\0265H¼Ê\\Â\006¾t\034"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill193_25 = local6_life21;
        int __sourceSpill193_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill193_25)).substring(((int)(__sourceSpill193_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill193_30 = local8_life19;
        int __sourceSpill193_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill193_33 = new byte[8];
        (__sourceSpill193_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill193_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill193_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill193_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill193_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill193_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill193_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill193_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill193_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill193_34)).doFinal(((byte[])(__sourceSpill193_33)));
        (__sourceSpill193_30)[__sourceSpill193_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "û»Ó'°\00549\020­Ô£O¥"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill193_38 = local6_life21;
        int __sourceSpill193_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill193_38)).substring(((int)(__sourceSpill193_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill193_43 = local8_life19;
        int __sourceSpill193_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill193_46 = new byte[8];
        (__sourceSpill193_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill193_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill193_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill193_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill193_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill193_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill193_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill193_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill193_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill193_47)).doFinal(((byte[])(__sourceSpill193_46)));
        (__sourceSpill193_43)[__sourceSpill193_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    g = ((long[])(local8_life19));
    h = ((java.lang.Integer[])(new java.lang.Integer[5]));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1184_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/g2"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 11420;
      if (h[var3] == null) {
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
         long var5 = g[var3];
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
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/g2", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.g2.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void b__Void() {
block3: {
            g2 g22;
            block2: {
                long l = com.moon.g2.f ^ 0x4353E44F9D48L;
                Entity[] entityArray = CA.b();
                this.d.a(__sourceExactCall_26d420a9da496d(this.c));
                Entity[] entityArray2 = entityArray;
                g22 = this;
                if (entityArray2 == null) break block2;
                if (!((Boolean)g22.a().p().getValue()).booleanValue()) break block3;
                g22 = this;
            }
            g22.e.a(__sourceExactCall_26d420a9da496d(this.c), this.d.a__iu());
        }
}


public void c__Void() {
return;
}


public void a__Void() {
com.moon.g2 forwardValue214_20_0;
    com.moon.iu forwardValue214_22_0;
    com.moon.g2 spill214_0;
    int spill214_1;
    long spill214_2;
    int spill214_3;
    long spill214_4;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    com.moon.iu life4_27;
    moom.ir life5_30;
    double life6_36;
    double life8_39;
    double life10_41;
    double life12_43;
    double life14_45;
    double life16_47;
    double life18_49;
    double life20_51;
    net.minecraft.client.renderer.Tessellator life22_72;
    moom.lw life23_75;
    forward_join_141: {
    forward_join_22: {
    forward_join_20: {
    forward_join_19: {
    life1_3 = (com.moon.g2.f ^ 120019377927070L);
    life3_5 = __sourceExactCall_659deaeb34e5cd();
    spill214_0 = this;
    if (!((life3_5 != null))) {
        forwardValue214_20_0 = spill214_0;
        break forward_join_20;
    }
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.ESP)(__sourceExactCall_d1a700d22f43a3(((com.moon.g2)(spill214_0))))).p())).getValue())))).booleanValue())) {
        break forward_join_19;
    }
    forwardValue214_22_0 = ((com.moon.g6)(this.e)).a__iu();
    break forward_join_22;
    }
    forwardValue214_20_0 = this;
    }
    forwardValue214_22_0 = ((com.moon.g7)(((com.moon.g2)(forwardValue214_20_0)).d)).a__iu();
    }
    life4_27 = forwardValue214_22_0;
    spill214_1 = 9684;
    life5_30 = __sourceExactCall_ee7d82563b5ea9();
    spill214_2 = (5327883721587976860L ^ life1_3);
    life6_36 = __sourceExactCall_a36fd7af1223a8(((moom.ir)(life5_30)));
    life8_39 = ((moom.ir)(life5_30)).b();
    life10_41 = 0x0.0p0d;
    life12_43 = 0x0.0p0d;
    life14_45 = 0x0.0p0d;
    life16_47 = 0x1.0p0d;
    life18_49 = 0x1.0p0d;
    life20_51 = 0x0.0p0d;
    moom.kZ.l();
    moom.kZ.d__Void();
    moom.kZ.u();
    __sourceExactCall_c835ee2c66e63a(((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic214_17(spill214_1, spill214_2))), ((float)(0x0.0p0f)));
    __sourceExactCall_1fc4ef8e9bbe89(((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic214_19(23659, (4345674278449713956L ^ life1_3)))), ((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic214_20(27920, (5450479867714085466L ^ life1_3)))), ((int)(1)), ((int)(0)));
    life22_72 = __sourceExactCall_607dff73cf88f9();
    life23_75 = ((net.minecraft.client.renderer.Tessellator)(life22_72)).a__lw();
    __sourceExactCall_b6c6a7d43443b6(((moom.lw)(life23_75)), ((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic214_24(13179, (7791897374365482032L ^ life1_3)))), ((moom.oD)(moom.oB.i)));
    spill214_3 = 7568;
    ((moom.lw)(__sourceExactCall_7c0370b7b41901(((moom.lw)(__sourceExactCall_217a742e4be448(((moom.lw)(life23_75)), ((double)(life10_41)), ((double)((life12_43 + life8_39))), ((double)(0x0.0p0d))))), ((double)(life14_45)), ((double)(life20_51))))).c__Void();
    spill214_4 = (8775931380522144473L ^ life1_3);
    ((moom.lw)(__sourceExactCall_7c0370b7b41901(((moom.lw)(__sourceExactCall_217a742e4be448(((moom.lw)(life23_75)), ((double)((life10_41 + life6_36))), ((double)((life12_43 + life8_39))), ((double)(0x0.0p0d))))), ((double)(life16_47)), ((double)(life20_51))))).c__Void();
    ((moom.lw)(__sourceExactCall_7c0370b7b41901(((moom.lw)(__sourceExactCall_217a742e4be448(((moom.lw)(life23_75)), ((double)((life10_41 + life6_36))), ((double)(life12_43)), ((double)(0x0.0p0d))))), ((double)(life16_47)), ((double)(life18_49))))).c__Void();
    ((moom.lw)(__sourceExactCall_7c0370b7b41901(((moom.lw)(__sourceExactCall_217a742e4be448(((moom.lw)(life23_75)), ((double)(life10_41)), ((double)(life12_43)), ((double)(0x0.0p0d))))), ((double)(life14_45)), ((double)(life18_49))))).c__Void();
    ((com.moon.iu)(life4_27)).c();
    ((net.minecraft.client.renderer.Tessellator)(life22_72)).a__Void();
    moom.kZ.i(((int)(0)));
    __sourceExactCall_c835ee2c66e63a(((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic214_42(spill214_3, spill214_4))), ((float)(0x1.99999ap-4f)));
    if (!((life3_5 == null))) {
        break forward_join_141;
    }
    __sourceExactCall_6604345f74a40b(((java.lang.String[])(new java.lang.String[3])));
    }
    return;
}


public int a__sourceReturn_8abf5c6871() {
return java.lang.Math.max(((int)((net.minecraft.client.Minecraft.b() / 5))), ((int)(((org.lwjgl.opengl.DisplayMode)(org.lwjgl.opengl.Display.getDesktopDisplayMode())).getFrequency())));
}


public boolean a__Boolean() {
return ((1) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1184_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic214_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic214_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic214_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic214_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic214_42(int a0, long a1) throws E;

private static native void __sourceExactCall_6604345f74a40b(java.lang.String[] p0);

private static native net.minecraft.entity.Entity[] __sourceExactCall_659deaeb34e5cd();
private static native com.moon.module.impl.ESP __sourceExactCall_d1a700d22f43a3(com.moon.g2 p0);
private static native moom.ir __sourceExactCall_ee7d82563b5ea9();
private static native double __sourceExactCall_a36fd7af1223a8(moom.ir p0);
private static native void __sourceExactCall_c835ee2c66e63a(int p0, float p1);
private static native void __sourceExactCall_1fc4ef8e9bbe89(int p0, int p1, int p2, int p3);
private static native net.minecraft.client.renderer.Tessellator __sourceExactCall_607dff73cf88f9();
private static native void __sourceExactCall_b6c6a7d43443b6(moom.lw p0, int p1, moom.oD p2);
private static native moom.lw __sourceExactCall_7c0370b7b41901(moom.lw p0, double p1, double p2);
private static native moom.lw __sourceExactCall_217a742e4be448(moom.lw p0, double p1, double p2, double p3);

private static native com.moon.iu __sourceExactCall_26d420a9da496d(com.moon.g1 p0);
}
