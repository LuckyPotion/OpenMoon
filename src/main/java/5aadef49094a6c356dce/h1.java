package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class h1 {

protected net.minecraft.client.Minecraft a;

protected int b;

protected int c;

protected int d;

protected int e;

protected int f;

protected int g;

protected int h;

private int i;

private int j;

protected int k;

protected int l;

protected boolean m;

protected int n;

protected float o;

protected float p;

protected int q;

protected long r;

protected boolean s;

protected boolean t;

protected boolean u;

protected int v;

private boolean w;

private static int[] x;

private static long G;

private static long[] I;

private static java.lang.Integer[] J;

private static java.util.Map K;

private static long R;

public h1(net.minecraft.client.Minecraft p0, int p1, int p2, int p3, int p4, int p5) { super(); }


private static void __sourceConstructorBody_7ddfbfd874830d41(moom.h1 receiver, net.minecraft.client.Minecraft p0, int p1, int p2, int p3, int p4, int p5) throws Throwable {

long local7 = (moom.h1.G ^ 49579184263672L);

    moom.h1.__sourceConstructorInit_7ddfbfd874830d41_0(((moom.h1)(receiver)));

    ((moom.h1)(receiver)).m = ((boolean)(true));

    ((moom.h1)(receiver)).n = ((int)(__sourceIntrinsic_7ddfbfd874830d41_originalDynamicSite2798_3(12472, (1220969297915680521L ^ local7))));

    ((moom.h1)(receiver)).q = ((int)(-1));

    ((moom.h1)(receiver)).s = ((boolean)(true));

    ((moom.h1)(receiver)).t = ((boolean)(true));

    ((moom.h1)(receiver)).w = ((boolean)(true));

    ((moom.h1)(receiver)).a = ((net.minecraft.client.Minecraft)(p0));

    ((moom.h1)(receiver)).b = ((int)(p1));

    ((moom.h1)(receiver)).c = ((int)(p2));

    ((moom.h1)(receiver)).d = ((int)(p3));

    ((moom.h1)(receiver)).e = ((int)(p4));

    ((moom.h1)(receiver)).h = ((int)(p5));

    ((moom.h1)(receiver)).g = ((int)(0));

    ((moom.h1)(receiver)).f = ((int)(p1));

    return;

}



static {
G = ((long)(((moom._a)(moom._c.a(((long)(1515507057295042641L)), ((long)(7201544869817699156L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(133002843937491L)))));
    K = ((java.util.Map)(new java.util.HashMap(13)));
    int[] __sourceSpill857_7 = new int[5];
    long local5_life8 = (moom.h1.G ^ 7062648165848L);
    moom.h1.b(((int[])(__sourceSpill857_7)));
    javax.crypto.Cipher local7_life11;
    javax.crypto.Cipher __sourceSpill857_13 = (local7_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill857_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill857_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill857_16 = new byte[8];
    (__sourceSpill857_16)[0] = ((byte) ((int) (local5_life8 >>> 56)));
    int local8_life17 = 1;
    while ((local8_life17 < 8)) {
        (__sourceSpill857_16)[local8_life17] = ((byte) ((int) ((local5_life8 << (local8_life17 * 8)) >>> 56)));
        local8_life17 += 1;
    }
    byte[] __sourcePreallocation857_18 = __sourceSpill857_16;
    ((javax.crypto.Cipher)(__sourceSpill857_13)).init(((int)(__sourceSpill857_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill857_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation857_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local13_life21 = new long[24];
    int local10_life22 = 0;
    java.lang.String local11_life23;
    int local12_life25 = ((java.lang.String)((local11_life23 = "òöÉu\031d/´µ\031Ù\030ÍU¼¼Q4¡Ë>lèãÿè¬Óõýñ¢}8v\030}¸Æ¯\036ëÒz2YtÏrU6Yf²\003ÖV/1`ôþÎÁw-D\026à\024~ýË\\a±\001äs2ï\bù\036upÝ­Ú\035CáC\0312\bg:*oe©Rø°°\004È,-ÂÁø!uO î¬,L©ßwY4tjªÈ8¥ãy\000OÇ@Ugq\024Ùæ\tÀÜ\030r¼Ð¤oE\r"))).length();
    int local9_life26 = 0;
    do {
        java.lang.String __sourceSpill857_27 = local11_life23;
        int __sourceSpill857_28 = local9_life26;
        local9_life26 += 8;
        byte[] local14_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill857_27)).substring(((int)(__sourceSpill857_28)), ((int)(local9_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill857_32 = local13_life21;
        int __sourceSpill857_33 = local10_life22;
        local10_life22 += 1;
        long local15_life34 = (((((((((((long) (local14_life31)[0]) & 255L) << 56) | ((((long) (local14_life31)[1]) & 255L) << 48)) | ((((long) (local14_life31)[2]) & 255L) << 40)) | ((((long) (local14_life31)[3]) & 255L) << 32)) | ((((long) (local14_life31)[4]) & 255L) << 24)) | ((((long) (local14_life31)[5]) & 255L) << 16)) | ((((long) (local14_life31)[6]) & 255L) << 8)) | (((long) (local14_life31)[7]) & 255L));
        byte[] __sourceSpill857_35 = new byte[8];
        (__sourceSpill857_35)[0] = ((byte) ((int) (local15_life34 >>> 56)));
        (__sourceSpill857_35)[1] = ((byte) ((int) (local15_life34 >>> 48)));
        (__sourceSpill857_35)[2] = ((byte) ((int) (local15_life34 >>> 40)));
        (__sourceSpill857_35)[3] = ((byte) ((int) (local15_life34 >>> 32)));
        (__sourceSpill857_35)[4] = ((byte) ((int) (local15_life34 >>> 24)));
        (__sourceSpill857_35)[5] = ((byte) ((int) (local15_life34 >>> 16)));
        (__sourceSpill857_35)[6] = ((byte) ((int) (local15_life34 >>> 8)));
        (__sourceSpill857_35)[7] = ((byte) ((int) local15_life34));
        javax.crypto.Cipher __sourceSpill857_36 = local7_life11;
        byte[] local17_life38 = ((javax.crypto.Cipher)(__sourceSpill857_36)).doFinal(((byte[])(__sourceSpill857_35)));
        (__sourceSpill857_32)[__sourceSpill857_33] = (((((((((((long) (local17_life38)[0]) & 255L) << 56) | ((((long) (local17_life38)[1]) & 255L) << 48)) | ((((long) (local17_life38)[2]) & 255L) << 40)) | ((((long) (local17_life38)[3]) & 255L) << 32)) | ((((long) (local17_life38)[4]) & 255L) << 24)) | ((((long) (local17_life38)[5]) & 255L) << 16)) | ((((long) (local17_life38)[6]) & 255L) << 8)) | (((long) (local17_life38)[7]) & 255L));
    } while ((!(local9_life26 >= local12_life25)));
    local12_life25 = ((java.lang.String)((local11_life23 = "\fO\023m( 1\t¶¾36×Íÿ"))).length();
    local9_life26 = 0;
    do {
        java.lang.String __sourceSpill857_40 = local11_life23;
        int __sourceSpill857_41 = local9_life26;
        local9_life26 += 8;
        byte[] local14_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill857_40)).substring(((int)(__sourceSpill857_41)), ((int)(local9_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill857_45 = local13_life21;
        int __sourceSpill857_46 = local10_life22;
        local10_life22 += 1;
        long local15_life47 = (((((((((((long) (local14_life44)[0]) & 255L) << 56) | ((((long) (local14_life44)[1]) & 255L) << 48)) | ((((long) (local14_life44)[2]) & 255L) << 40)) | ((((long) (local14_life44)[3]) & 255L) << 32)) | ((((long) (local14_life44)[4]) & 255L) << 24)) | ((((long) (local14_life44)[5]) & 255L) << 16)) | ((((long) (local14_life44)[6]) & 255L) << 8)) | (((long) (local14_life44)[7]) & 255L));
        byte[] __sourceSpill857_48 = new byte[8];
        (__sourceSpill857_48)[0] = ((byte) ((int) (local15_life47 >>> 56)));
        (__sourceSpill857_48)[1] = ((byte) ((int) (local15_life47 >>> 48)));
        (__sourceSpill857_48)[2] = ((byte) ((int) (local15_life47 >>> 40)));
        (__sourceSpill857_48)[3] = ((byte) ((int) (local15_life47 >>> 32)));
        (__sourceSpill857_48)[4] = ((byte) ((int) (local15_life47 >>> 24)));
        (__sourceSpill857_48)[5] = ((byte) ((int) (local15_life47 >>> 16)));
        (__sourceSpill857_48)[6] = ((byte) ((int) (local15_life47 >>> 8)));
        (__sourceSpill857_48)[7] = ((byte) ((int) local15_life47));
        javax.crypto.Cipher __sourceSpill857_49 = local7_life11;
        byte[] local17_life51 = ((javax.crypto.Cipher)(__sourceSpill857_49)).doFinal(((byte[])(__sourceSpill857_48)));
        (__sourceSpill857_45)[__sourceSpill857_46] = (((((((((((long) (local17_life51)[0]) & 255L) << 56) | ((((long) (local17_life51)[1]) & 255L) << 48)) | ((((long) (local17_life51)[2]) & 255L) << 40)) | ((((long) (local17_life51)[3]) & 255L) << 32)) | ((((long) (local17_life51)[4]) & 255L) << 24)) | ((((long) (local17_life51)[5]) & 255L) << 16)) | ((((long) (local17_life51)[6]) & 255L) << 8)) | (((long) (local17_life51)[7]) & 255L));
    } while ((!(local9_life26 >= local12_life25)));
    I = ((long[])(local13_life21));
    J = ((java.lang.Integer[])(new java.lang.Integer[24]));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill857_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill857_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill857_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill857_60 = new byte[8];
    (__sourceSpill857_60)[0] = ((byte) ((int) (local5_life8 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill857_60)[local1_life61] = ((byte) ((int) ((local5_life8 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation857_62 = __sourceSpill857_60;
    ((javax.crypto.Cipher)(__sourceSpill857_57)).init(((int)(__sourceSpill857_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill857_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation857_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life65 = 6488709829714443462L;
    byte[] __sourceSpill857_66 = new byte[8];
    (__sourceSpill857_66)[0] = ((byte) ((int) (local2_life65 >>> 56)));
    (__sourceSpill857_66)[1] = ((byte) ((int) (local2_life65 >>> 48)));
    (__sourceSpill857_66)[2] = ((byte) ((int) (local2_life65 >>> 40)));
    (__sourceSpill857_66)[3] = ((byte) ((int) (local2_life65 >>> 32)));
    (__sourceSpill857_66)[4] = ((byte) ((int) (local2_life65 >>> 24)));
    (__sourceSpill857_66)[5] = ((byte) ((int) (local2_life65 >>> 16)));
    (__sourceSpill857_66)[6] = ((byte) ((int) (local2_life65 >>> 8)));
    (__sourceSpill857_66)[7] = ((byte) ((int) local2_life65));
    javax.crypto.Cipher __sourceSpill857_67 = local0_life55;
    byte[] local4_life69 = ((javax.crypto.Cipher)(__sourceSpill857_67)).doFinal(((byte[])(__sourceSpill857_66)));
    R = ((long)((((((((((((long) (local4_life69)[0]) & 255L) << 56) | ((((long) (local4_life69)[1]) & 255L) << 48)) | ((((long) (local4_life69)[2]) & 255L) << 40)) | ((((long) (local4_life69)[3]) & 255L) << 32)) | ((((long) (local4_life69)[4]) & 255L) << 24)) | ((((long) (local4_life69)[5]) & 255L) << 16)) | ((((long) (local4_life69)[6]) & 255L) << 8)) | (((long) (local4_life69)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceConstructorInit_7ddfbfd874830d41_0(moom.h1 a0) throws E;

public void b(boolean p0) {
this.w = ((boolean)(p0));
    return;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7791_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/h1"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean b__Boolean(int p0) {
int forwardValue3578_21_0;
    forward_join_21: {
    forward_join_20: {
    if (!((p0 >= this.d))) {
        break forward_join_20;
    }
    if (!((p0 <= this.e))) {
        break forward_join_20;
    }
    if (!((this.k >= this.g))) {
        break forward_join_20;
    }
    if (!((this.k <= this.f))) {
        break forward_join_20;
    }
    forwardValue3578_21_0 = 1;
    break forward_join_21;
    }
    forwardValue3578_21_0 = 0;
    }
    return ((forwardValue3578_21_0) != 0);
}


protected void b(int p0, int p1) {
return;
}


protected void b__Void() {
this.p = ((float)(moom.Dr.a(((float)(this.p)), ((float)(0x0.0p0f)), ((float)(((float) ((moom.h1)(this)).c()))))));
    return;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.h1.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 32450;
      if (J[var3] == null) {
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
         long var5 = I[var3];
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
         Object[] var9 = (Object[])K.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               K.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/h1", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         J[var3] = var15;
      }

      return J[var3];
}


public static void b(int[] p0) {
x = ((int[])(p0));
    return;
}


public void b(int p0) {
this.g = ((int)(p0));
    this.f = ((int)((p0 + this.b)));
    return;
}


protected void b(int p0, int p1, int p2, int p3) {
long life5_3;
    int life7_6;
    net.minecraft.client.renderer.Tessellator life8_8;
    moom.lw life9_11;
    int life10_13;
    int life11_26;
    int life12_31;
    int life13_75;
    int life14_88;
    lexical_join_361: {
    life5_3 = (moom.h1.G ^ 50308042912387L);
    life7_6 = ((moom.h1)(this)).a();
    life8_8 = net.minecraft.client.renderer.Tessellator.a();
    life9_11 = ((net.minecraft.client.renderer.Tessellator)(life8_8)).a__lw();
    life10_13 = 0;
    lexical_cycle_14: while (true) {
    lexical_join_359: {
    lexical_join_351: {
    lexical_join_337: {
    lexical_join_47: {
    lexical_join_42: {
    if (!((life10_13 < life7_6))) {
        break lexical_join_361;
    }
    life11_26 = ((p1 + (life10_13 * this.h)) + this.v);
    life12_31 = (this.h - 4);
    if (!((life11_26 <= this.e))) {
        break lexical_join_42;
    }
    if (!(((life11_26 + life12_31) < this.d))) {
        break lexical_join_47;
    }
    }
    ((moom.h1)(this)).a(((int)(life10_13)), ((int)(p0)), ((int)(life11_26)));
    }
    if (!(this.t)) {
        break lexical_join_337;
    }
    if (!(((moom.h1)(this)).a__Boolean(((int)(life10_13))))) {
        break lexical_join_337;
    }
    life13_75 = (this.g + ((this.b / 2) - (((moom.h1)(this)).e() / 2)));
    life14_88 = ((this.g + (this.b / 2)) + (((moom.h1)(this)).e() / 2));
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    moom.kZ.v();
    ((moom.lw)(life9_11)).a(((int)(__sourceIntrinsic_ac28bfb5504e_invokedynamic1181_20(21060, (2394068404072748702L ^ life5_3)))), ((moom.oD)(moom.oB.k)));
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life9_11)).a(((double)(((double) life13_75))), ((double)(((double) ((life11_26 + life12_31) + 2)))), ((double)(0x0.0p0d))))).a(((double)(0x0.0p0d)), ((double)(0x1.0p0d))))).a(((int)(__sourceIntrinsic_ac28bfb5504e_invokedynamic1181_25(25183, (1089259057666827916L ^ life5_3)))), ((int)(__sourceIntrinsic_ac28bfb5504e_invokedynamic1181_26(25183, (1089259057666827916L ^ life5_3)))), ((int)(__sourceIntrinsic_ac28bfb5504e_invokedynamic1181_27(25183, (1089259057666827916L ^ life5_3)))), ((int)(__sourceIntrinsic_ac28bfb5504e_invokedynamic1181_28(10212, (6124962579710567231L ^ life5_3))))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life9_11)).a(((double)(((double) life14_88))), ((double)(((double) ((life11_26 + life12_31) + 2)))), ((double)(0x0.0p0d))))).a(((double)(0x1.0p0d)), ((double)(0x1.0p0d))))).a(((int)(__sourceIntrinsic_ac28bfb5504e_invokedynamic1181_33(25183, (1089259057666827916L ^ life5_3)))), ((int)(__sourceIntrinsic_ac28bfb5504e_invokedynamic1181_34(25183, (1089259057666827916L ^ life5_3)))), ((int)(__sourceIntrinsic_ac28bfb5504e_invokedynamic1181_35(25183, (1089259057666827916L ^ life5_3)))), ((int)(__sourceIntrinsic_ac28bfb5504e_invokedynamic1181_36(10212, (6124962579710567231L ^ life5_3))))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life9_11)).a(((double)(((double) life14_88))), ((double)(((double) (life11_26 - 2)))), ((double)(0x0.0p0d))))).a(((double)(0x1.0p0d)), ((double)(0x0.0p0d))))).a(((int)(__sourceIntrinsic_ac28bfb5504e_invokedynamic1181_41(25183, (1089259057666827916L ^ life5_3)))), ((int)(__sourceIntrinsic_ac28bfb5504e_invokedynamic1181_42(25183, (1089259057666827916L ^ life5_3)))), ((int)(__sourceIntrinsic_ac28bfb5504e_invokedynamic1181_43(25183, (1089259057666827916L ^ life5_3)))), ((int)(__sourceIntrinsic_ac28bfb5504e_invokedynamic1181_44(10212, (6124962579710567231L ^ life5_3))))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life9_11)).a(((double)(((double) life13_75))), ((double)(((double) (life11_26 - 2)))), ((double)(0x0.0p0d))))).a(((double)(0x0.0p0d)), ((double)(0x0.0p0d))))).a(((int)(__sourceIntrinsic_ac28bfb5504e_invokedynamic1181_49(25183, (1089259057666827916L ^ life5_3)))), ((int)(__sourceIntrinsic_ac28bfb5504e_invokedynamic1181_50(25183, (1089259057666827916L ^ life5_3)))), ((int)(__sourceIntrinsic_ac28bfb5504e_invokedynamic1181_51(25183, (1089259057666827916L ^ life5_3)))), ((int)(__sourceIntrinsic_ac28bfb5504e_invokedynamic1181_52(10212, (6124962579710567231L ^ life5_3))))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life9_11)).a(((double)(((double) (life13_75 + 1)))), ((double)(((double) ((life11_26 + life12_31) + 1)))), ((double)(0x0.0p0d))))).a(((double)(0x0.0p0d)), ((double)(0x1.0p0d))))).a(((int)(0)), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_ac28bfb5504e_invokedynamic1181_57(10212, (6124962579710567231L ^ life5_3))))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life9_11)).a(((double)(((double) (life14_88 - 1)))), ((double)(((double) ((life11_26 + life12_31) + 1)))), ((double)(0x0.0p0d))))).a(((double)(0x1.0p0d)), ((double)(0x1.0p0d))))).a(((int)(0)), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_ac28bfb5504e_invokedynamic1181_62(10212, (6124962579710567231L ^ life5_3))))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life9_11)).a(((double)(((double) (life14_88 - 1)))), ((double)(((double) (life11_26 - 1)))), ((double)(0x0.0p0d))))).a(((double)(0x1.0p0d)), ((double)(0x0.0p0d))))).a(((int)(0)), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_ac28bfb5504e_invokedynamic1181_67(10212, (6124962579710567231L ^ life5_3))))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life9_11)).a(((double)(((double) (life13_75 + 1)))), ((double)(((double) (life11_26 - 1)))), ((double)(0x0.0p0d))))).a(((double)(0x0.0p0d)), ((double)(0x0.0p0d))))).a(((int)(0)), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_ac28bfb5504e_invokedynamic1181_72(10212, (6124962579710567231L ^ life5_3))))))).c__Void();
    ((net.minecraft.client.renderer.Tessellator)(life8_8)).a__Void();
    moom.kZ.u();
    }
    if (!((((this instanceof moom.h9) ? 1 : 0) != 0))) {
        break lexical_join_351;
    }
    if (!((life11_26 >= (this.d - this.h)))) {
        break lexical_join_359;
    }
    if (!((life11_26 <= this.e))) {
        break lexical_join_359;
    }
    }
    ((moom.h1)(this)).a(((int)(life10_13)), ((int)(p0)), ((int)(life11_26)), ((int)(life12_31)), ((int)(p2)), ((int)(p3)));
    }
    life10_13 += 1;
    continue lexical_cycle_14;
    }
    }
    return;
}


protected int b() {
return ((((moom.h1)(this)).a() * this.h) + this.v);
}


public int e() {
long local1 = (moom.h1.G ^ 56243550061413L);
    return __sourceIntrinsic_c4b63a62bb23_originalDynamicSite1461_1(25219, (6925921807774570419L ^ local1));
}


public int c() {
return java.lang.Math.max(((int)(0)), ((int)((((moom.h1)(this)).b() - ((this.e - this.d) - 4)))));
}


public void c__Void() {
int forestValue200006_224_0;
    long life1_3;
    int life3_34;
    int life4_42;
    int life5_57;
    int life6_62;
    int life3_161;
    int life4_180;
    int life5_188;
    int life6_203;
    int life7_208;
    int life8_245;
    int life8_294;
    int life9_302;
    int life10_317;
    int life11_340;
    int life11_359;
    int life3_407;
    forest_join_407: {
    forest_join_395: {
    forest_join_391: {
    forest_join_382: {
    forest_join_379: {
    forest_join_378: {
    forest_join_371: {
    forest_join_370: {
    forest_join_363: {
    forest_join_356: {
    forest_join_353: {
    forest_join_299: {
    forest_join_269: {
    forest_join_240: {
    forest_join_224: {
    forest_join_223: {
    forest_join_146: {
    forest_join_114: {
    forest_join_87: {
    life1_3 = (moom.h1.G ^ 36564926849498L);
    if (!(((moom.h1)(this)).b__Boolean(((int)(this.l))))) {
        break forest_join_407;
    }
    if (!((org.lwjgl.input.Mouse.getEventButton() == 0))) {
        break forest_join_114;
    }
    if (!(org.lwjgl.input.Mouse.getEventButtonState())) {
        break forest_join_114;
    }
    if (!((this.l >= this.d))) {
        break forest_join_114;
    }
    if (!((this.l <= this.e))) {
        break forest_join_114;
    }
    life3_34 = ((this.b - ((moom.h1)(this)).e()) / 2);
    life4_42 = ((this.b + ((moom.h1)(this)).e()) / 2);
    life5_57 = ((((this.l - this.d) - this.v) + ((int) this.p)) - 4);
    life6_62 = (life5_57 / this.h);
    if (!((life6_62 < ((moom.h1)(this)).a()))) {
        break forest_join_87;
    }
    if (!((this.k >= life3_34))) {
        break forest_join_87;
    }
    if (!((this.k <= life4_42))) {
        break forest_join_87;
    }
    if (!((life6_62 >= 0))) {
        break forest_join_87;
    }
    if (!((life5_57 >= 0))) {
        break forest_join_87;
    }
    ((moom.h1)(this)).a(((int)(life6_62)), ((boolean)(false)), ((int)(this.k)), ((int)(this.l)));
    this.q = ((int)(life6_62));
    break forest_join_114;
    }
    if (!((this.k >= life3_34))) {
        break forest_join_114;
    }
    if (!((this.k <= life4_42))) {
        break forest_join_114;
    }
    if (!((life5_57 < 0))) {
        break forest_join_114;
    }
    ((moom.h1)(this)).a__Void(((int)((this.k - life3_34))), ((int)((((this.l - this.d) + ((int) this.p)) - 4))));
    }
    if (!(org.lwjgl.input.Mouse.isButtonDown(((int)(0))))) {
        break forest_join_379;
    }
    if (!(((moom.h1)(this)).a__Boolean())) {
        break forest_join_379;
    }
    if (!((this.n != -1))) {
        break forest_join_146;
    }
    if (!((this.n >= 0))) {
        break forest_join_382;
    }
    moom.h1 __stackOp200006_36_0 = this;
    ((moom.h1)(__stackOp200006_36_0)).p = ((float)((((moom.h1)(__stackOp200006_36_0)).p - (((float) (this.l - this.n)) * this.o))));
    this.n = ((int)(this.l));
    break forest_join_382;
    }
    life3_161 = 1;
    if (!((this.l >= this.d))) {
        break forest_join_371;
    }
    if (!((this.l <= this.e))) {
        break forest_join_371;
    }
    life4_180 = ((this.b - ((moom.h1)(this)).e()) / 2);
    life5_188 = ((this.b + ((moom.h1)(this)).e()) / 2);
    life6_203 = ((((this.l - this.d) - this.v) + ((int) this.p)) - 4);
    life7_208 = (life6_203 / this.h);
    if (!((life7_208 < ((moom.h1)(this)).a()))) {
        break forest_join_240;
    }
    if (!((this.k >= life4_180))) {
        break forest_join_240;
    }
    if (!((this.k <= life5_188))) {
        break forest_join_240;
    }
    if (!((life7_208 >= 0))) {
        break forest_join_240;
    }
    if (!((life6_203 >= 0))) {
        break forest_join_240;
    }
    if (!((life7_208 == this.q))) {
        break forest_join_223;
    }
    if (!((recovery.source.CarrierOps.lcmp(((long)((net.minecraft.client.Minecraft.a__Long() - this.r))), ((long)(moom.h1.R))) < 0))) {
        break forest_join_223;
    }
    forestValue200006_224_0 = 1;
    break forest_join_224;
    }
    forestValue200006_224_0 = 0;
    }
    life8_245 = forestValue200006_224_0;
    ((moom.h1)(this)).a(((int)(life7_208)), ((boolean)__sourceIntrinsic_integerToBoolean((life8_245))), ((int)(this.k)), ((int)(this.l)));
    this.q = ((int)(life7_208));
    this.r = ((long)(net.minecraft.client.Minecraft.a__Long()));
    break forest_join_269;
    }
    if (!((this.k >= life4_180))) {
        break forest_join_269;
    }
    if (!((this.k <= life5_188))) {
        break forest_join_269;
    }
    if (!((life6_203 < 0))) {
        break forest_join_269;
    }
    ((moom.h1)(this)).a__Void(((int)((this.k - life4_180))), ((int)((((this.l - this.d) + ((int) this.p)) - 4))));
    life3_161 = 0;
    }
    life8_294 = ((moom.h1)(this)).f();
    life9_302 = (life8_294 + __sourceIntrinsic_7ac46ee229a8_invokedynamic200006_79(26447, (4030563966190760155L ^ life1_3)));
    if (!((this.k >= life8_294))) {
        break forest_join_353;
    }
    if (!((this.k <= life9_302))) {
        break forest_join_353;
    }
    this.o = ((float)(-0x1.0p0f));
    life10_317 = ((moom.h1)(this)).c();
    if (!((life10_317 < 1))) {
        break forest_join_299;
    }
    life10_317 = 1;
    }
    life11_340 = ((int) (((float) ((this.e - this.d) * (this.e - this.d))) / ((float) ((moom.h1)(this)).b())));
    life11_359 = moom.Dr.a(((int)(life11_340)), ((int)(__sourceIntrinsic_7ac46ee229a8_invokedynamic200006_89(11280, (6039588521770908567L ^ life1_3)))), ((int)(((this.e - this.d) - __sourceIntrinsic_7ac46ee229a8_invokedynamic200006_92(18334, (784193770597453855L ^ life1_3))))));
    moom.h1 __stackOp200006_94_0 = this;
    ((moom.h1)(__stackOp200006_94_0)).o = ((float)((((moom.h1)(__stackOp200006_94_0)).o / (((float) ((this.e - this.d) - life11_359)) / ((float) life10_317)))));
    break forest_join_356;
    }
    this.o = ((float)(0x1.0p0f));
    }
    if (!((life3_161 != 0))) {
        break forest_join_363;
    }
    this.n = ((int)(this.l));
    break forest_join_370;
    }
    this.n = ((int)(__sourceIntrinsic_7ac46ee229a8_invokedynamic200006_102(12472, (1220982706221836075L ^ life1_3))));
    }
    break forest_join_378;
    }
    this.n = ((int)(__sourceIntrinsic_7ac46ee229a8_invokedynamic200006_104(12472, (1220982706221836075L ^ life1_3))));
    }
    break forest_join_382;
    }
    this.n = ((int)(-1));
    }
    life3_407 = org.lwjgl.input.Mouse.getEventDWheel();
    if (!((life3_407 != 0))) {
        break forest_join_407;
    }
    if (!((life3_407 > 0))) {
        break forest_join_391;
    }
    life3_407 = -1;
    break forest_join_395;
    }
    if (!((life3_407 < 0))) {
        break forest_join_395;
    }
    life3_407 = 1;
    }
    moom.h1 __stackOp200006_108_0 = this;
    ((moom.h1)(__stackOp200006_108_0)).p = ((float)((((moom.h1)(__stackOp200006_108_0)).p + ((float) ((life3_407 * this.h) / 2)))));
    }
    return;
}


public void c(int p0, int p1) {
this.i = ((int)(p0));
    this.j = ((int)(p1));
    return;
}


protected void c(int p0, int p1, int p2, int p3) {
long local5 = (moom.h1.G ^ 62468586451824L);
    net.minecraft.client.renderer.Tessellator local7 = net.minecraft.client.renderer.Tessellator.a();
    moom.lw local8 = ((net.minecraft.client.renderer.Tessellator)(local7)).a__lw();
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(this.a)).a__ok())).a__Void(((moom.DD)(net.minecraft.client.gui.Gui.a)));
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    float local9 = 0x1.0p5f;
    ((moom.lw)(local8)).a(((int)(__sourceIntrinsic_8f97abcbcfce_originalDynamicSite1462_8(21060, (2394056374534231917L ^ local5)))), ((moom.oD)(moom.oB.k)));
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(local8)).a(((double)(((double) this.g))), ((double)(((double) p1))), ((double)(0x0.0p0d))))).a(((double)(0x0.0p0d)), ((double)(((double) (((float) p1) / 0x1.0p5f))))))).a(((int)(__sourceIntrinsic_8f97abcbcfce_originalDynamicSite1462_14(24093, (4513264701203634983L ^ local5)))), ((int)(__sourceIntrinsic_8f97abcbcfce_originalDynamicSite1462_15(11005, (1821089906474364891L ^ local5)))), ((int)(__sourceIntrinsic_8f97abcbcfce_originalDynamicSite1462_16(11005, (1821089906474364891L ^ local5)))), ((int)(p3))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(local8)).a(((double)(((double) (this.g + this.b)))), ((double)(((double) p1))), ((double)(0x0.0p0d))))).a(((double)(((double) (((float) this.b) / 0x1.0p5f)))), ((double)(((double) (((float) p1) / 0x1.0p5f))))))).a(((int)(__sourceIntrinsic_8f97abcbcfce_originalDynamicSite1462_24(11005, (1821089906474364891L ^ local5)))), ((int)(__sourceIntrinsic_8f97abcbcfce_originalDynamicSite1462_25(11005, (1821089906474364891L ^ local5)))), ((int)(__sourceIntrinsic_8f97abcbcfce_originalDynamicSite1462_26(11005, (1821089906474364891L ^ local5)))), ((int)(p3))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(local8)).a(((double)(((double) (this.g + this.b)))), ((double)(((double) p0))), ((double)(0x0.0p0d))))).a(((double)(((double) (((float) this.b) / 0x1.0p5f)))), ((double)(((double) (((float) p0) / 0x1.0p5f))))))).a(((int)(__sourceIntrinsic_8f97abcbcfce_originalDynamicSite1462_34(11005, (1821089906474364891L ^ local5)))), ((int)(__sourceIntrinsic_8f97abcbcfce_originalDynamicSite1462_35(11005, (1821089906474364891L ^ local5)))), ((int)(__sourceIntrinsic_8f97abcbcfce_originalDynamicSite1462_36(11005, (1821089906474364891L ^ local5)))), ((int)(p2))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(local8)).a(((double)(((double) this.g))), ((double)(((double) p0))), ((double)(0x0.0p0d))))).a(((double)(0x0.0p0d)), ((double)(((double) (((float) p0) / 0x1.0p5f))))))).a(((int)(__sourceIntrinsic_8f97abcbcfce_originalDynamicSite1462_42(11005, (1821089906474364891L ^ local5)))), ((int)(__sourceIntrinsic_8f97abcbcfce_originalDynamicSite1462_43(11005, (1821089906474364891L ^ local5)))), ((int)(__sourceIntrinsic_8f97abcbcfce_originalDynamicSite1462_44(11005, (1821089906474364891L ^ local5)))), ((int)(p2))))).c__Void();
    ((net.minecraft.client.renderer.Tessellator)(local7)).a__Void();
    return;
}


protected int f() {
long local1 = (moom.h1.G ^ 132104033197773L);
    return ((this.b / 2) + __sourceIntrinsic_d5f736cb4191_originalDynamicSite1463_2(4334, (2005553256593586280L ^ local1)));
}


public int d() {
return ((int) this.p);
}


protected abstract void a(int p0, boolean p1, int p2, int p3);

protected void a(net.minecraft.client.renderer.Tessellator p0) {
long local2 = (moom.h1.G ^ 77767014658324L);
    moom.lw local4 = ((net.minecraft.client.renderer.Tessellator)(p0)).a__lw();
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(this.a)).a__ok())).a__Void(((moom.DD)(net.minecraft.client.gui.Gui.a)));
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    float local5 = 0x1.0p5f;
    ((moom.lw)(local4)).a(((int)(__sourceIntrinsic_b6e6e62e8ee2_originalDynamicSite1464_7(21060, (2393975449071932681L ^ local2)))), ((moom.oD)(moom.oB.k)));
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(local4)).a(((double)(((double) this.g))), ((double)(((double) this.e))), ((double)(0x0.0p0d))))).a(((double)(((double) (((float) this.g) / local5)))), ((double)(((double) (((float) (this.e + ((int) this.p))) / local5))))))).a(((int)(__sourceIntrinsic_b6e6e62e8ee2_originalDynamicSite1464_17(11280, (6039479077883030361L ^ local2)))), ((int)(__sourceIntrinsic_b6e6e62e8ee2_originalDynamicSite1464_18(11280, (6039479077883030361L ^ local2)))), ((int)(__sourceIntrinsic_b6e6e62e8ee2_originalDynamicSite1464_19(11280, (6039479077883030361L ^ local2)))), ((int)(__sourceIntrinsic_b6e6e62e8ee2_originalDynamicSite1464_20(10212, (6124990566628008104L ^ local2))))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(local4)).a(((double)(((double) this.f))), ((double)(((double) this.e))), ((double)(0x0.0p0d))))).a(((double)(((double) (((float) this.f) / local5)))), ((double)(((double) (((float) (this.e + ((int) this.p))) / local5))))))).a(((int)(__sourceIntrinsic_b6e6e62e8ee2_originalDynamicSite1464_30(11280, (6039479077883030361L ^ local2)))), ((int)(__sourceIntrinsic_b6e6e62e8ee2_originalDynamicSite1464_31(11280, (6039479077883030361L ^ local2)))), ((int)(__sourceIntrinsic_b6e6e62e8ee2_originalDynamicSite1464_32(11280, (6039479077883030361L ^ local2)))), ((int)(__sourceIntrinsic_b6e6e62e8ee2_originalDynamicSite1464_33(10212, (6124990566628008104L ^ local2))))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(local4)).a(((double)(((double) this.f))), ((double)(((double) this.d))), ((double)(0x0.0p0d))))).a(((double)(((double) (((float) this.f) / local5)))), ((double)(((double) (((float) (this.d + ((int) this.p))) / local5))))))).a(((int)(__sourceIntrinsic_b6e6e62e8ee2_originalDynamicSite1464_43(11280, (6039479077883030361L ^ local2)))), ((int)(__sourceIntrinsic_b6e6e62e8ee2_originalDynamicSite1464_44(11280, (6039479077883030361L ^ local2)))), ((int)(__sourceIntrinsic_b6e6e62e8ee2_originalDynamicSite1464_45(11280, (6039479077883030361L ^ local2)))), ((int)(__sourceIntrinsic_b6e6e62e8ee2_originalDynamicSite1464_46(10212, (6124990566628008104L ^ local2))))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(local4)).a(((double)(((double) this.g))), ((double)(((double) this.d))), ((double)(0x0.0p0d))))).a(((double)(((double) (((float) this.g) / local5)))), ((double)(((double) (((float) (this.d + ((int) this.p))) / local5))))))).a(((int)(__sourceIntrinsic_b6e6e62e8ee2_originalDynamicSite1464_56(11280, (6039479077883030361L ^ local2)))), ((int)(__sourceIntrinsic_b6e6e62e8ee2_originalDynamicSite1464_57(11280, (6039479077883030361L ^ local2)))), ((int)(__sourceIntrinsic_b6e6e62e8ee2_originalDynamicSite1464_58(11280, (6039479077883030361L ^ local2)))), ((int)(__sourceIntrinsic_b6e6e62e8ee2_originalDynamicSite1464_59(10212, (6124990566628008104L ^ local2))))))).c__Void();
    ((net.minecraft.client.renderer.Tessellator)(p0)).a__Void();
    return;
}


public void a(int p0, int p1, int p2, int p3) {
this.b = ((int)(p0));
    this.c = ((int)(p1));
    this.d = ((int)(p2));
    this.e = ((int)(p3));
    this.g = ((int)(0));
    this.f = ((int)(p0));
    return;
}


public void a(int p0) {
long local2_life1 = (moom.h1.G ^ 82994782720990L);
    this.p += ((float) p0);
    ((moom.h1)(this)).b__Void();
    this.n = ((int)(__sourceIntrinsic_b4a3d886a4d9_originalDynamicSite802_4(23642, (9082733489120623048L ^ local2_life1))));
    return;
}


protected void a(boolean p0, int p1) {
this.u = ((boolean)(p0));
    this.v = ((int)(p1));
    if ((__sourceIntrinsic_booleanComparison(p0) == 0)) {
        this.v = ((int)(0));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static int[] a__ArrayInt() {
return moom.h1.x;
}


protected abstract int a();

public void a(boolean p0) {
this.t = ((boolean)(p0));
    return;
}


public void a(moom.gc p0) {
long life2_3;
    life2_3 = (moom.h1.G ^ 18041809863891L);
    if (((moom.gc)(p0)).m) {
        if ((((moom.gc)(p0)).l == this.i)) {
        moom.h1 __stackOp3576_4_0 = this;
        ((moom.h1)(__stackOp3576_4_0)).p = ((float)((((moom.h1)(__stackOp3576_4_0)).p - ((float) ((this.h * 2) / 3)))));
        this.n = ((int)(__sourceIntrinsic_1e2491ec3fad_invokedynamic3576_8(12472, (1221034483137741346L ^ life2_3))));
        ((moom.h1)(this)).b__Void();
    } else {
        if ((((moom.gc)(p0)).l == this.j)) {
        moom.h1 __stackOp3576_13_0 = this;
        ((moom.h1)(__stackOp3576_13_0)).p = ((float)((((moom.h1)(__stackOp3576_13_0)).p + ((float) ((this.h * 2) / 3)))));
        this.n = ((int)(__sourceIntrinsic_1e2491ec3fad_invokedynamic3576_17(12472, (1221034483137741346L ^ life2_3))));
        ((moom.h1)(this)).b__Void();
    }
    }
    }
    return;
}


protected abstract void a__Void();

protected void a(int p0, int p1, int p2) {
return;
}


protected abstract void a(int p0, int p1, int p2, int p3, int p4, int p5);

public int a(int p0, int p1) {
int forwardValue3575_66_0;
    int life3_12;
    int life4_25;
    int life5_39;
    int life6_44;
    forward_join_66: {
    forward_join_65: {
    life3_12 = ((this.g + (this.b / 2)) - (((moom.h1)(this)).e() / 2));
    life4_25 = ((this.g + (this.b / 2)) + (((moom.h1)(this)).e() / 2));
    life5_39 = ((((p1 - this.d) - this.v) + ((int) this.p)) - 4);
    life6_44 = (life5_39 / this.h);
    if (!((p0 < ((moom.h1)(this)).f()))) {
        break forward_join_65;
    }
    if (!((p0 >= life3_12))) {
        break forward_join_65;
    }
    if (!((p0 <= life4_25))) {
        break forward_join_65;
    }
    if (!((life6_44 >= 0))) {
        break forward_join_65;
    }
    if (!((life5_39 >= 0))) {
        break forward_join_65;
    }
    if (!((life6_44 < ((moom.h1)(this)).a()))) {
        break forward_join_65;
    }
    forwardValue3575_66_0 = life6_44;
    break forward_join_66;
    }
    forwardValue3575_66_0 = -1;
    }
    return forwardValue3575_66_0;
}


protected void a(int p0, int p1, net.minecraft.client.renderer.Tessellator p2) {
return;
}


protected void a__Void(int p0, int p1) {
return;
}


protected abstract boolean a__Boolean(int p0);

public boolean a__Boolean() {
return ((((this.w) ? 1 : 0)) != 0);
}


public void a(int p0, int p1, float p2) {
long life4_3;
    int life6_17;
    int life7_25;
    net.minecraft.client.renderer.Tessellator life8_31;
    moom.lw life9_34;
    int life10_52;
    int life11_61;
    int life12_81;
    int life13_325;
    int life14_344;
    int life14_363;
    int life15_380;
    life4_3 = (moom.h1.G ^ 63273599438513L);
    if (this.s) {
        this.k = ((int)(p0));
        this.l = ((int)(p1));
        ((moom.h1)(this)).a__Void();
        life6_17 = ((moom.h1)(this)).f();
        life7_25 = (life6_17 + __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_6(3980, (1763263969010399088L ^ life4_3)));
        ((moom.h1)(this)).b__Void();
        moom.kZ.f();
        moom.kZ.n();
        life8_31 = net.minecraft.client.renderer.Tessellator.a();
        life9_34 = ((net.minecraft.client.renderer.Tessellator)(life8_31)).a__lw();
        ((moom.h1)(this)).a(((net.minecraft.client.renderer.Tessellator)(life8_31)));
        life10_52 = (((this.g + (this.b / 2)) - (((moom.h1)(this)).e() / 2)) + 2);
        life11_61 = ((this.d + 4) - ((int) this.p));
        if (this.u) {
        ((moom.h1)(this)).a(((int)(life10_52)), ((int)(life11_61)), ((net.minecraft.client.renderer.Tessellator)(life8_31)));
    }
        ((moom.h1)(this)).b(((int)(life10_52)), ((int)(life11_61)), ((int)(p0)), ((int)(p1)));
        moom.kZ.i();
        life12_81 = 4;
        ((moom.h1)(this)).c(((int)(0)), ((int)(this.d)), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_23(15029, (2810397364962722392L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_24(10212, (6124940910411685645L ^ life4_3)))));
        ((moom.h1)(this)).c(((int)(this.e)), ((int)(this.c)), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_28(10212, (6124940910411685645L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_29(10212, (6124940910411685645L ^ life4_3)))));
        int spill6491_0 = 28731;
        moom.kZ.l();
        moom.kZ.a(((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_32(spill6491_0, (6974189702818580674L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_33(6810, (5177895840736846436L ^ life4_3)))), ((int)(0)), ((int)(1)));
        int spill6491_1 = 22755;
        moom.kZ.c__Void();
        moom.kZ.j(((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_36(spill6491_1, (5060737264286752774L ^ life4_3)))));
        moom.kZ.v();
        ((moom.lw)(life9_34)).a(((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_39(27606, (2132574320468415293L ^ life4_3)))), ((moom.oD)(moom.oB.k)));
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life9_34)).a(((double)(((double) this.g))), ((double)(((double) (this.d + life12_81)))), ((double)(0x0.0p0d))))).a(((double)(0x0.0p0d)), ((double)(0x1.0p0d))))).a(((int)(0)), ((int)(0)), ((int)(0)), ((int)(0))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life9_34)).a(((double)(((double) this.f))), ((double)(((double) (this.d + life12_81)))), ((double)(0x0.0p0d))))).a(((double)(0x1.0p0d)), ((double)(0x1.0p0d))))).a(((int)(0)), ((int)(0)), ((int)(0)), ((int)(0))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life9_34)).a(((double)(((double) this.f))), ((double)(((double) this.d))), ((double)(0x0.0p0d))))).a(((double)(0x1.0p0d)), ((double)(0x0.0p0d))))).a(((int)(0)), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_58(10212, (6124940910411685645L ^ life4_3))))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life9_34)).a(((double)(((double) this.g))), ((double)(((double) this.d))), ((double)(0x0.0p0d))))).a(((double)(0x0.0p0d)), ((double)(0x0.0p0d))))).a(((int)(0)), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_65(10212, (6124940910411685645L ^ life4_3))))))).c__Void();
        ((net.minecraft.client.renderer.Tessellator)(life8_31)).a__Void();
        ((moom.lw)(life9_34)).a(((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_69(21060, (2394055496506272428L ^ life4_3)))), ((moom.oD)(moom.oB.k)));
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life9_34)).a(((double)(((double) this.g))), ((double)(((double) this.e))), ((double)(0x0.0p0d))))).a(((double)(0x0.0p0d)), ((double)(0x1.0p0d))))).a(((int)(0)), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_76(10212, (6124940910411685645L ^ life4_3))))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life9_34)).a(((double)(((double) this.f))), ((double)(((double) this.e))), ((double)(0x0.0p0d))))).a(((double)(0x1.0p0d)), ((double)(0x1.0p0d))))).a(((int)(0)), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_83(10212, (6124940910411685645L ^ life4_3))))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life9_34)).a(((double)(((double) this.f))), ((double)(((double) (this.e - life12_81)))), ((double)(0x0.0p0d))))).a(((double)(0x1.0p0d)), ((double)(0x0.0p0d))))).a(((int)(0)), ((int)(0)), ((int)(0)), ((int)(0))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life9_34)).a(((double)(((double) this.g))), ((double)(((double) (this.e - life12_81)))), ((double)(0x0.0p0d))))).a(((double)(0x0.0p0d)), ((double)(0x0.0p0d))))).a(((int)(0)), ((int)(0)), ((int)(0)), ((int)(0))))).c__Void();
        ((net.minecraft.client.renderer.Tessellator)(life8_31)).a__Void();
        life13_325 = ((moom.h1)(this)).c();
        if ((life13_325 > 0)) {
        life14_344 = (((this.e - this.d) * (this.e - this.d)) / java.lang.Math.max(((int)(((moom.h1)(this)).b())), ((int)(1))));
        life14_363 = moom.Dr.a(((int)(life14_344)), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_106(8790, (2249819608480815792L ^ life4_3)))), ((int)(((this.e - this.d) - __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_109(12611, (7867088475012401580L ^ life4_3))))));
        life15_380 = (((((int) this.p) * ((this.e - this.d) - life14_363)) / life13_325) + this.d);
        if ((life15_380 < this.d)) {
        life15_380 = this.d;
    }
        ((moom.lw)(life9_34)).a(((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_117(21060, (2394055496506272428L ^ life4_3)))), ((moom.oD)(moom.oB.k)));
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life9_34)).a(((double)(((double) life6_17))), ((double)(((double) this.e))), ((double)(0x0.0p0d))))).a(((double)(0x0.0p0d)), ((double)(0x1.0p0d))))).a(((int)(0)), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_123(10212, (6124940910411685645L ^ life4_3))))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life9_34)).a(((double)(((double) life7_25))), ((double)(((double) this.e))), ((double)(0x0.0p0d))))).a(((double)(0x1.0p0d)), ((double)(0x1.0p0d))))).a(((int)(0)), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_129(10212, (6124940910411685645L ^ life4_3))))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life9_34)).a(((double)(((double) life7_25))), ((double)(((double) this.d))), ((double)(0x0.0p0d))))).a(((double)(0x1.0p0d)), ((double)(0x0.0p0d))))).a(((int)(0)), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_135(10212, (6124940910411685645L ^ life4_3))))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life9_34)).a(((double)(((double) life6_17))), ((double)(((double) this.d))), ((double)(0x0.0p0d))))).a(((double)(0x0.0p0d)), ((double)(0x0.0p0d))))).a(((int)(0)), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_141(10212, (6124940910411685645L ^ life4_3))))))).c__Void();
        ((net.minecraft.client.renderer.Tessellator)(life8_31)).a__Void();
        ((moom.lw)(life9_34)).a(((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_145(21060, (2394055496506272428L ^ life4_3)))), ((moom.oD)(moom.oB.k)));
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life9_34)).a(((double)(((double) life6_17))), ((double)(((double) (life15_380 + life14_363)))), ((double)(0x0.0p0d))))).a(((double)(0x0.0p0d)), ((double)(0x1.0p0d))))).a(((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_150(18180, (686580468235075559L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_151(25183, (1089245602764970686L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_152(25183, (1089245602764970686L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_153(10212, (6124940910411685645L ^ life4_3))))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life9_34)).a(((double)(((double) life7_25))), ((double)(((double) (life15_380 + life14_363)))), ((double)(0x0.0p0d))))).a(((double)(0x1.0p0d)), ((double)(0x1.0p0d))))).a(((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_158(25183, (1089245602764970686L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_159(25183, (1089245602764970686L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_160(25183, (1089245602764970686L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_161(10212, (6124940910411685645L ^ life4_3))))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life9_34)).a(((double)(((double) life7_25))), ((double)(((double) life15_380))), ((double)(0x0.0p0d))))).a(((double)(0x1.0p0d)), ((double)(0x0.0p0d))))).a(((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_166(25183, (1089245602764970686L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_167(25183, (1089245602764970686L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_168(25183, (1089245602764970686L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_169(10212, (6124940910411685645L ^ life4_3))))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life9_34)).a(((double)(((double) life6_17))), ((double)(((double) life15_380))), ((double)(0x0.0p0d))))).a(((double)(0x0.0p0d)), ((double)(0x0.0p0d))))).a(((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_174(25183, (1089245602764970686L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_175(25183, (1089245602764970686L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_176(25183, (1089245602764970686L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_177(10212, (6124940910411685645L ^ life4_3))))))).c__Void();
        ((net.minecraft.client.renderer.Tessellator)(life8_31)).a__Void();
        ((moom.lw)(life9_34)).a(((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_181(21060, (2394055496506272428L ^ life4_3)))), ((moom.oD)(moom.oB.k)));
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life9_34)).a(((double)(((double) life6_17))), ((double)(((double) ((life15_380 + life14_363) - 1)))), ((double)(0x0.0p0d))))).a(((double)(0x0.0p0d)), ((double)(0x1.0p0d))))).a(((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_186(29746, (2661840556239408348L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_187(18451, (1857661357076050163L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_188(18451, (1857661357076050163L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_189(10212, (6124940910411685645L ^ life4_3))))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life9_34)).a(((double)(((double) (life7_25 - 1)))), ((double)(((double) ((life15_380 + life14_363) - 1)))), ((double)(0x0.0p0d))))).a(((double)(0x1.0p0d)), ((double)(0x1.0p0d))))).a(((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_194(18451, (1857661357076050163L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_195(18451, (1857661357076050163L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_196(18451, (1857661357076050163L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_197(10212, (6124940910411685645L ^ life4_3))))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life9_34)).a(((double)(((double) (life7_25 - 1)))), ((double)(((double) life15_380))), ((double)(0x0.0p0d))))).a(((double)(0x1.0p0d)), ((double)(0x0.0p0d))))).a(((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_202(18451, (1857661357076050163L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_203(18451, (1857661357076050163L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_204(18451, (1857661357076050163L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_205(10212, (6124940910411685645L ^ life4_3))))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life9_34)).a(((double)(((double) life6_17))), ((double)(((double) life15_380))), ((double)(0x0.0p0d))))).a(((double)(0x0.0p0d)), ((double)(0x0.0p0d))))).a(((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_210(18451, (1857661357076050163L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_211(18451, (1857661357076050163L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_212(18451, (1857661357076050163L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_213(10212, (6124940910411685645L ^ life4_3))))))).c__Void();
        ((net.minecraft.client.renderer.Tessellator)(life8_31)).a__Void();
    }
        ((moom.h1)(this)).b(((int)(p0)), ((int)(p1)));
        int spill6491_2 = 12077;
        moom.kZ.u();
        moom.kZ.j(((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_219(spill6491_2, (1023180660432574415L ^ life4_3)))));
        moom.kZ.d__Void();
        moom.kZ.k();
    }
    return;
}


public int g() {
return this.h;
}


private static native <E extends Throwable> int __sourceIntrinsic_7ddfbfd874830d41_originalDynamicSite2798_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4a3d886a4d9_originalDynamicSite802_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_76(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_83(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_106(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_109(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_117(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_123(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_129(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_135(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_141(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_145(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_150(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_151(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_152(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_153(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_158(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_159(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_160(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_161(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_166(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_167(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_168(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_169(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_174(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_175(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_176(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_177(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_181(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_186(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_187(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_188(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_189(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_194(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_195(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_196(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_197(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_202(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_203(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_204(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_205(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_210(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_211(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_212(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_213(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6491_219(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1e2491ec3fad_invokedynamic3576_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1e2491ec3fad_invokedynamic3576_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b6e6e62e8ee2_originalDynamicSite1464_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b6e6e62e8ee2_originalDynamicSite1464_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b6e6e62e8ee2_originalDynamicSite1464_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b6e6e62e8ee2_originalDynamicSite1464_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b6e6e62e8ee2_originalDynamicSite1464_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b6e6e62e8ee2_originalDynamicSite1464_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b6e6e62e8ee2_originalDynamicSite1464_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b6e6e62e8ee2_originalDynamicSite1464_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b6e6e62e8ee2_originalDynamicSite1464_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b6e6e62e8ee2_originalDynamicSite1464_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b6e6e62e8ee2_originalDynamicSite1464_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b6e6e62e8ee2_originalDynamicSite1464_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b6e6e62e8ee2_originalDynamicSite1464_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b6e6e62e8ee2_originalDynamicSite1464_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b6e6e62e8ee2_originalDynamicSite1464_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b6e6e62e8ee2_originalDynamicSite1464_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b6e6e62e8ee2_originalDynamicSite1464_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ac28bfb5504e_invokedynamic1181_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ac28bfb5504e_invokedynamic1181_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ac28bfb5504e_invokedynamic1181_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ac28bfb5504e_invokedynamic1181_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ac28bfb5504e_invokedynamic1181_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ac28bfb5504e_invokedynamic1181_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ac28bfb5504e_invokedynamic1181_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ac28bfb5504e_invokedynamic1181_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ac28bfb5504e_invokedynamic1181_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ac28bfb5504e_invokedynamic1181_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ac28bfb5504e_invokedynamic1181_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ac28bfb5504e_invokedynamic1181_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ac28bfb5504e_invokedynamic1181_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ac28bfb5504e_invokedynamic1181_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ac28bfb5504e_invokedynamic1181_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ac28bfb5504e_invokedynamic1181_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ac28bfb5504e_invokedynamic1181_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ac28bfb5504e_invokedynamic1181_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ac28bfb5504e_invokedynamic1181_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ac28bfb5504e_invokedynamic1181_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ac28bfb5504e_invokedynamic1181_72(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7791_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8f97abcbcfce_originalDynamicSite1462_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8f97abcbcfce_originalDynamicSite1462_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8f97abcbcfce_originalDynamicSite1462_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8f97abcbcfce_originalDynamicSite1462_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8f97abcbcfce_originalDynamicSite1462_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8f97abcbcfce_originalDynamicSite1462_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8f97abcbcfce_originalDynamicSite1462_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8f97abcbcfce_originalDynamicSite1462_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8f97abcbcfce_originalDynamicSite1462_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8f97abcbcfce_originalDynamicSite1462_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8f97abcbcfce_originalDynamicSite1462_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8f97abcbcfce_originalDynamicSite1462_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8f97abcbcfce_originalDynamicSite1462_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic200006_79(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic200006_89(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic200006_92(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic200006_102(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic200006_104(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c4b63a62bb23_originalDynamicSite1461_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d5f736cb4191_originalDynamicSite1463_2(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
