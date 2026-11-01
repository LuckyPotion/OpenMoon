package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
class h3 extends moom.h1 {

public int y;

moom.gR z;

private static long A;

private static long[] B;

private static java.lang.Integer[] C;

private static java.util.Map D;

public h3(moom.gR p0) { super((net.minecraft.client.Minecraft)null, 0, 0, 0, 0, 0); }


private static void __sourceConstructorBody_42cd86258022c8bb(moom.h3 receiver, moom.gR p0) throws Throwable {

long local2 = (moom.h3.A ^ 113154228196723L);

    ((moom.h3)(receiver)).z = ((moom.gR)(p0));

    moom.h3.__sourceConstructorInit_42cd86258022c8bb_0(((moom.h3)(receiver)), ((net.minecraft.client.Minecraft)(((moom.gR)(p0)).i)), ((int)(((moom.gR)(p0)).k)), ((int)(((moom.gR)(p0)).l)), ((int)(__sourceIntrinsic_42cd86258022c8bb_originalDynamicSite2333_5(9028, (2048381585155504600L ^ local2)))), ((int)((((moom.gR)(p0)).l - __sourceIntrinsic_42cd86258022c8bb_originalDynamicSite2333_7(30316, (578740417615817972L ^ local2))))), ((int)(__sourceIntrinsic_42cd86258022c8bb_originalDynamicSite2333_8(24945, (734441007685827566L ^ local2)))));

    ((moom.h3)(receiver)).y = ((int)(-1));

    return;

}



static {
A = ((long)(((moom._a)(moom._c.a(((long)(3264878446474889548L)), ((long)(-5923980673121544467L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(236681966521013L)))));
    D = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.h3.A ^ 106509209905615L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1241_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1241_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1241_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1241_14 = new byte[8];
    (__sourceSpill1241_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1241_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1241_16 = __sourceSpill1241_14;
    ((javax.crypto.Cipher)(__sourceSpill1241_11)).init(((int)(__sourceSpill1241_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1241_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1241_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[8];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Uèï«\t=\007çòÄIPb¬\bÙ½M\033\001ñmº\032'\034\0079L\021·\000ßGí\b\001â\r\n"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1241_25 = local6_life21;
        int __sourceSpill1241_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1241_25)).substring(((int)(__sourceSpill1241_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1241_30 = local8_life19;
        int __sourceSpill1241_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1241_33 = new byte[8];
        (__sourceSpill1241_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1241_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1241_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1241_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1241_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1241_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1241_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1241_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1241_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1241_34)).doFinal(((byte[])(__sourceSpill1241_33)));
        (__sourceSpill1241_30)[__sourceSpill1241_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "pFJötL°:ô0V¢?Do"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1241_38 = local6_life21;
        int __sourceSpill1241_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1241_38)).substring(((int)(__sourceSpill1241_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1241_43 = local8_life19;
        int __sourceSpill1241_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1241_46 = new byte[8];
        (__sourceSpill1241_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1241_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1241_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1241_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1241_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1241_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1241_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1241_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1241_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1241_47)).doFinal(((byte[])(__sourceSpill1241_46)));
        (__sourceSpill1241_43)[__sourceSpill1241_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    B = ((long[])(local8_life19));
    C = ((java.lang.Integer[])(new java.lang.Integer[8]));
}

private static native <E extends Throwable> void __sourceConstructorInit_42cd86258022c8bb_0(moom.h3 a0, net.minecraft.client.Minecraft a1, int a2, int a3, int a4, int a5, int a6) throws E;

private static moom.Oo b(moom.Oo p0) {
return p0;
}


private void d(int p0, int p1) {
((moom.h3)(this)).d(((int)(p0)), ((int)(p1)), ((int)(0)), ((int)(0)));
    return;
}


private void d(int p0, int p1, int p2, int p3) {
long local5 = (moom.h3.A ^ 33770153520836L);
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(this.a)).a__ok())).a__Void(((moom.DD)(net.minecraft.client.gui.Gui.b)));
    float local7 = 0x1.0p-7f;
    float local8 = 0x1.0p-7f;
    int local9 = __sourceIntrinsic_83a88a28ee12_originalDynamicSite1468_6(25597, (3052456053627372241L ^ local5));
    int local10 = __sourceIntrinsic_83a88a28ee12_originalDynamicSite1468_7(25597, (3052456053627372241L ^ local5));
    net.minecraft.client.renderer.Tessellator local11 = net.minecraft.client.renderer.Tessellator.a();
    moom.lw local12 = ((net.minecraft.client.renderer.Tessellator)(local11)).a__lw();
    ((moom.lw)(local12)).a(((int)(__sourceIntrinsic_83a88a28ee12_originalDynamicSite1468_10(26346, (2464465171231066051L ^ local5)))), ((moom.oD)(moom.oB.i)));
    ((moom.lw)(((moom.lw)(((moom.lw)(local12)).a(((double)(((double) p0))), ((double)(((double) (p1 + __sourceIntrinsic_83a88a28ee12_originalDynamicSite1468_13(25597, (3052456053627372241L ^ local5)))))), ((double)(((double) ((moom.gR)(this.z)).d)))))).a(((double)(((double) (((float) p2) * 0x1.0p-7f)))), ((double)(((double) (((float) (p3 + __sourceIntrinsic_83a88a28ee12_originalDynamicSite1468_17(25597, (3052456053627372241L ^ local5)))) * 0x1.0p-7f))))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local12)).a(((double)(((double) (p0 + __sourceIntrinsic_83a88a28ee12_originalDynamicSite1468_20(25597, (3052456053627372241L ^ local5)))))), ((double)(((double) (p1 + __sourceIntrinsic_83a88a28ee12_originalDynamicSite1468_21(25597, (3052456053627372241L ^ local5)))))), ((double)(((double) ((moom.gR)(this.z)).d)))))).a(((double)(((double) (((float) (p2 + __sourceIntrinsic_83a88a28ee12_originalDynamicSite1468_25(25597, (3052456053627372241L ^ local5)))) * 0x1.0p-7f)))), ((double)(((double) (((float) (p3 + __sourceIntrinsic_83a88a28ee12_originalDynamicSite1468_26(25597, (3052456053627372241L ^ local5)))) * 0x1.0p-7f))))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local12)).a(((double)(((double) (p0 + __sourceIntrinsic_83a88a28ee12_originalDynamicSite1468_29(25597, (3052456053627372241L ^ local5)))))), ((double)(((double) p1))), ((double)(((double) ((moom.gR)(this.z)).d)))))).a(((double)(((double) (((float) (p2 + __sourceIntrinsic_83a88a28ee12_originalDynamicSite1468_33(25597, (3052456053627372241L ^ local5)))) * 0x1.0p-7f)))), ((double)(((double) (((float) p3) * 0x1.0p-7f))))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local12)).a(((double)(((double) p0))), ((double)(((double) p1))), ((double)(((double) ((moom.gR)(this.z)).d)))))).a(((double)(((double) (((float) p2) * 0x1.0p-7f)))), ((double)(((double) (((float) p3) * 0x1.0p-7f))))))).c__Void();
    ((net.minecraft.client.renderer.Tessellator)(local11)).a__Void();
    return;
}


protected void a(int p0, int p1, int p2, int p3, int p4, int p5) {
long local7 = (moom.h3.A ^ 127014481173894L);
    moom.hL local9 = ((moom.hL)(((java.util.List)(moom.gR.w)).get(((int)(p0)))));
    ((moom.h3)(this)).a(((int)(p1)), ((int)(p2)), ((net.minecraft.item.Item)(((moom.hL)(local9)).a)), ((int)(((moom.hL)(local9)).b)));
    ((net.minecraft.client.gui.FontRenderer)(((moom.gR)(this.z)).p)).b(((java.lang.String)(((moom.hL)(local9)).c)), ((float)(((float) ((p1 + __sourceIntrinsic_499f7b7391d8_originalDynamicSite1469_10(14875, (5653730988783839348L ^ local7))) + 5)))), ((float)(((float) (p2 + __sourceIntrinsic_499f7b7391d8_originalDynamicSite1469_11(14135, (5810163590064711007L ^ local7)))))), ((int)(__sourceIntrinsic_499f7b7391d8_originalDynamicSite1469_12(8889, (7681923519455867093L ^ local7)))));
    return;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 9406;
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
            throw new RuntimeException("moom/h3", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         C[var3] = var15;
      }

      return C[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.h3.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral7800_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/h3"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private void a(int p0, int p1, net.minecraft.item.Item p2, int p3) {
((moom.h3)(this)).d(((int)((p0 + 1))), ((int)((p1 + 1))));
    moom.kZ.y();
    moom.lt.c();
    ((net.minecraft.client.renderer.entity.RenderItem)(((moom.gR)(this.z)).j)).a(((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(p2, 1, p3))), ((float)(((float) (p0 + 2)))), ((float)(((float) (p1 + 2)))));
    moom.lt.a();
    moom.kZ.z();
    return;
}


protected int a() {
return ((java.util.List)(moom.gR.w)).size();
}


protected void a(int p0, boolean p1, int p2, int p3) {
this.y = ((int)(p0));
    ((moom.gR)(this.z)).a();
    ((moom.hJ)(((moom.gR)(this.z)).D)).a(((java.lang.String)(((moom.hL)(((moom.hL)(((java.util.List)(moom.gR.w)).get(((int)(((moom.h3)(((moom.gR)(this.z)).B)).y))))))).d)));
    return;
}


protected boolean a__Boolean(int p0) {
return ((((p0 == this.y) ? 1 : 0)) != 0);
}


protected void a__Void() {
return;
}


private static native <E extends Throwable> int __sourceIntrinsic_42cd86258022c8bb_originalDynamicSite2333_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_42cd86258022c8bb_originalDynamicSite2333_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_42cd86258022c8bb_originalDynamicSite2333_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_originalDynamicSite1469_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_originalDynamicSite1469_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_originalDynamicSite1469_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral7800_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83a88a28ee12_originalDynamicSite1468_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83a88a28ee12_originalDynamicSite1468_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83a88a28ee12_originalDynamicSite1468_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83a88a28ee12_originalDynamicSite1468_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83a88a28ee12_originalDynamicSite1468_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83a88a28ee12_originalDynamicSite1468_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83a88a28ee12_originalDynamicSite1468_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83a88a28ee12_originalDynamicSite1468_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83a88a28ee12_originalDynamicSite1468_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83a88a28ee12_originalDynamicSite1468_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_83a88a28ee12_originalDynamicSite1468_33(int a0, long a1) throws E;
}
