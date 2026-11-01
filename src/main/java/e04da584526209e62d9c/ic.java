package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
class ic extends moom.h1 {

public int y;

moom.g2 z;

private static long A;

private static long[] B;

private static java.lang.Integer[] C;

private static java.util.Map D;

public ic(moom.g2 p0) { super((net.minecraft.client.Minecraft)null, 0, 0, 0, 0, 0); }


private static void __sourceConstructorBody_fdc2525fa52976a4(moom.ic receiver, moom.g2 p0) throws Throwable {

long local2 = (moom.ic.A ^ 37884804710162L);

    ((moom.ic)(receiver)).z = ((moom.g2)(p0));

    moom.ic.__sourceConstructorInit_fdc2525fa52976a4_0(((moom.ic)(receiver)), ((net.minecraft.client.Minecraft)(((moom.g2)(p0)).i)), ((int)(((moom.g2)(p0)).k)), ((int)(((moom.g2)(p0)).l)), ((int)(__sourceIntrinsic_fdc2525fa52976a4_originalDynamicSite2434_5(6081, (4076429182438616036L ^ local2)))), ((int)((((moom.g2)(p0)).l - __sourceIntrinsic_fdc2525fa52976a4_originalDynamicSite2434_7(23383, (8747549567685322621L ^ local2))))), ((int)(__sourceIntrinsic_fdc2525fa52976a4_originalDynamicSite2434_8(13429, (1171310121821440082L ^ local2)))));

    ((moom.ic)(receiver)).y = ((int)(-1));

    return;

}



static {
A = ((long)(((moom._a)(moom._c.a(((long)(5851482875462037232L)), ((long)(4135890729306865800L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(23360783745824L)))));
    D = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.ic.A ^ 88526994617790L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1304_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1304_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1304_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1304_14 = new byte[8];
    (__sourceSpill1304_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1304_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1304_16 = __sourceSpill1304_14;
    ((javax.crypto.Cipher)(__sourceSpill1304_11)).init(((int)(__sourceSpill1304_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1304_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1304_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[12];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "G£?TÊ^\016\037ÐmXu*Ì\017cË¦n·sÎ±\035¥\016cÜ·(PUÆ(Ùwu\016~$Y£?<v\005á\021Þ·c+ehÏÏT\020Ü±C¥ógæ×io\035³r"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1304_25 = local6_life21;
        int __sourceSpill1304_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1304_25)).substring(((int)(__sourceSpill1304_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1304_30 = local8_life19;
        int __sourceSpill1304_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1304_33 = new byte[8];
        (__sourceSpill1304_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1304_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1304_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1304_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1304_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1304_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1304_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1304_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1304_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1304_34)).doFinal(((byte[])(__sourceSpill1304_33)));
        (__sourceSpill1304_30)[__sourceSpill1304_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "(\000\023¡5b\034ý$9më\020½"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1304_38 = local6_life21;
        int __sourceSpill1304_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1304_38)).substring(((int)(__sourceSpill1304_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1304_43 = local8_life19;
        int __sourceSpill1304_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1304_46 = new byte[8];
        (__sourceSpill1304_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1304_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1304_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1304_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1304_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1304_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1304_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1304_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1304_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1304_47)).doFinal(((byte[])(__sourceSpill1304_46)));
        (__sourceSpill1304_43)[__sourceSpill1304_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    B = ((long[])(local8_life19));
    C = ((java.lang.Integer[])(new java.lang.Integer[12]));
}

private static native <E extends Throwable> void __sourceConstructorInit_fdc2525fa52976a4_0(moom.ic a0, net.minecraft.client.Minecraft a1, int a2, int a3, int a4, int a5, int a6) throws E;

private static moom.Oo b(moom.Oo p0) {
return p0;
}


protected void a(int p0, int p1, int p2, int p3, int p4, int p5) {
long local7 = (moom.ic.A ^ 119706768819352L);
    moom.hZ local9 = ((moom.hZ)(((java.util.List)(moom.g2.w)).get(((int)(p0)))));
    ((moom.ic)(this)).a(((int)(p1)), ((int)(p2)), ((moom.DD)(((moom.hZ)(local9)).b)));
    ((net.minecraft.client.gui.FontRenderer)(((moom.g2)(this.z)).p)).b(((java.lang.String)(((moom.hZ)(local9)).a)), ((float)(((float) ((p1 + __sourceIntrinsic_499f7b7391d8_originalDynamicSite1517_9(31907, (3623572528160357124L ^ local7))) + __sourceIntrinsic_499f7b7391d8_originalDynamicSite1517_10(6190, (5367378296159362952L ^ local7)))))), ((float)(((float) (p2 + __sourceIntrinsic_499f7b7391d8_originalDynamicSite1517_11(25214, (224488834290394586L ^ local7)))))), ((int)(__sourceIntrinsic_499f7b7391d8_originalDynamicSite1517_12(7178, (8649868794988551080L ^ local7)))));
    return;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 29045;
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
            throw new RuntimeException("moom/ic", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         C[var3] = var15;
      }

      return C[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.ic.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8042_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/ic"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected int a() {
return ((java.util.List)(moom.g2.w)).size();
}


protected void a(int p0, boolean p1, int p2, int p3) {
this.y = ((int)(p0));
    ((moom.g2)(this.z)).a();
    ((moom.hJ)(((moom.g2)(this.z)).z)).a(((java.lang.String)(((moom.FE)(((moom.hZ)(((moom.hZ)(((java.util.List)(moom.g2.w)).get(((int)(((moom.ic)(((moom.g2)(this.z)).x)).y))))))).c)).toString())));
    return;
}


protected boolean a__Boolean(int p0) {
return ((((p0 == this.y) ? 1 : 0)) != 0);
}


protected void a__Void() {
return;
}


private void a(int p0, int p1, moom.DD p2) {
long local4 = (moom.ic.A ^ 130079847808519L);
    int local6 = (p0 + 5);
    ((moom.g2)(this.z)).a(((int)((local6 - 1))), ((int)((local6 + __sourceIntrinsic_c0a462008c23_originalDynamicSite1518_2(23383, (8747641693983745640L ^ local4))))), ((int)((p1 - 1))), ((int)(__sourceIntrinsic_c0a462008c23_originalDynamicSite1518_3(25217, (3744439061057544127L ^ local4)))));
    ((moom.g2)(this.z)).a(((int)((local6 - 1))), ((int)((local6 + __sourceIntrinsic_c0a462008c23_originalDynamicSite1518_6(23383, (8747641693983745640L ^ local4))))), ((int)((p1 + __sourceIntrinsic_c0a462008c23_originalDynamicSite1518_7(23383, (8747641693983745640L ^ local4))))), ((int)(__sourceIntrinsic_c0a462008c23_originalDynamicSite1518_8(25138, (4125497830317268744L ^ local4)))));
    ((moom.g2)(this.z)).b(((int)((local6 - 1))), ((int)((p1 - 1))), ((int)((p1 + __sourceIntrinsic_c0a462008c23_originalDynamicSite1518_11(23383, (8747641693983745640L ^ local4))))), ((int)(__sourceIntrinsic_c0a462008c23_originalDynamicSite1518_12(22741, (2180293788296586729L ^ local4)))));
    ((moom.g2)(this.z)).b(((int)((local6 + __sourceIntrinsic_c0a462008c23_originalDynamicSite1518_15(23383, (8747641693983745640L ^ local4))))), ((int)((p1 - 1))), ((int)((p1 + __sourceIntrinsic_c0a462008c23_originalDynamicSite1518_16(23383, (8747641693983745640L ^ local4))))), ((int)(__sourceIntrinsic_c0a462008c23_originalDynamicSite1518_17(28545, (3462863724424106674L ^ local4)))));
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(this.a)).a__ok())).a__Void(((moom.DD)(p2)));
    int local7 = __sourceIntrinsic_c0a462008c23_originalDynamicSite1518_23(23383, (8747641693983745640L ^ local4));
    int local8 = __sourceIntrinsic_c0a462008c23_originalDynamicSite1518_24(23383, (8747641693983745640L ^ local4));
    net.minecraft.client.renderer.Tessellator local9 = net.minecraft.client.renderer.Tessellator.a();
    moom.lw local10 = ((net.minecraft.client.renderer.Tessellator)(local9)).a__lw();
    ((moom.lw)(local10)).a(((int)(__sourceIntrinsic_c0a462008c23_originalDynamicSite1518_27(3140, (6314887413556343157L ^ local4)))), ((moom.oD)(moom.oB.i)));
    ((moom.lw)(((moom.lw)(((moom.lw)(local10)).a(((double)(((double) local6))), ((double)(((double) (p1 + __sourceIntrinsic_c0a462008c23_originalDynamicSite1518_30(23383, (8747641693983745640L ^ local4)))))), ((double)(0x0.0p0d))))).a(((double)(0x0.0p0d)), ((double)(0x1.0p0d))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local10)).a(((double)(((double) (local6 + __sourceIntrinsic_c0a462008c23_originalDynamicSite1518_34(23383, (8747641693983745640L ^ local4)))))), ((double)(((double) (p1 + __sourceIntrinsic_c0a462008c23_originalDynamicSite1518_35(23383, (8747641693983745640L ^ local4)))))), ((double)(0x0.0p0d))))).a(((double)(0x1.0p0d)), ((double)(0x1.0p0d))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local10)).a(((double)(((double) (local6 + __sourceIntrinsic_c0a462008c23_originalDynamicSite1518_39(23383, (8747641693983745640L ^ local4)))))), ((double)(((double) p1))), ((double)(0x0.0p0d))))).a(((double)(0x1.0p0d)), ((double)(0x0.0p0d))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local10)).a(((double)(((double) local6))), ((double)(((double) p1))), ((double)(0x0.0p0d))))).a(((double)(0x0.0p0d)), ((double)(0x0.0p0d))))).c__Void();
    ((net.minecraft.client.renderer.Tessellator)(local9)).a__Void();
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_fdc2525fa52976a4_originalDynamicSite2434_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fdc2525fa52976a4_originalDynamicSite2434_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fdc2525fa52976a4_originalDynamicSite2434_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_originalDynamicSite1517_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_originalDynamicSite1517_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_originalDynamicSite1517_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_originalDynamicSite1517_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c0a462008c23_originalDynamicSite1518_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c0a462008c23_originalDynamicSite1518_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c0a462008c23_originalDynamicSite1518_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c0a462008c23_originalDynamicSite1518_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c0a462008c23_originalDynamicSite1518_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c0a462008c23_originalDynamicSite1518_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c0a462008c23_originalDynamicSite1518_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c0a462008c23_originalDynamicSite1518_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c0a462008c23_originalDynamicSite1518_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c0a462008c23_originalDynamicSite1518_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c0a462008c23_originalDynamicSite1518_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c0a462008c23_originalDynamicSite1518_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c0a462008c23_originalDynamicSite1518_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c0a462008c23_originalDynamicSite1518_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c0a462008c23_originalDynamicSite1518_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c0a462008c23_originalDynamicSite1518_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c0a462008c23_originalDynamicSite1518_39(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8042_0() throws E;
}
