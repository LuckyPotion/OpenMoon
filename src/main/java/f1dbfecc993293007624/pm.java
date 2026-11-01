package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class pm extends moom.hJ {

private static net.minecraft.client.Minecraft A;

private boolean B;

private static long C;

private static long[] H;

private static java.lang.Integer[] I;

private static java.util.Map J;

public pm(int p0, int p1, int p2, int p3, int p4) { super(0, (net.minecraft.client.gui.FontRenderer)null, 0, 0, 0, 0); }


private static void __sourceConstructorBody_e1d12a37ed7aa600(com.moon.pm receiver, int p0, int p1, int p2, int p3, int p4) throws Throwable {

long local6 = (com.moon.pm.C ^ 78766862505497L);

    com.moon.pm.__sourceConstructorInit_e1d12a37ed7aa600_0(((com.moon.pm)(receiver)), ((int)(p0)), ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(com.moon.pm.A)).N)), ((int)(p1)), ((int)(p2)), ((int)(p3)), ((int)(p4)));

    ((com.moon.pm)(receiver)).B = ((boolean)(false));

    ((com.moon.pm)(receiver)).e(((int)(__sourceIntrinsic_e1d12a37ed7aa600_originalDynamicSite1517_5(23399, (1364827444476114322L ^ local6)))));

    return;

}



public pm(int p0, int p1, int p2, int p3, int p4, boolean p5) { super(0, (net.minecraft.client.gui.FontRenderer)null, 0, 0, 0, 0); }


private static void __sourceConstructorBody_f5c26fa826dade5c(com.moon.pm receiver, int p0, int p1, int p2, int p3, int p4, boolean p5) throws Throwable {

long local7_life1 = (com.moon.pm.C ^ 56312839800513L);

    net.minecraft.entity.Entity[] __sourceSpill325_5 = moom.cu.a__Arrayr3();

    com.moon.pm.__sourceConstructorInit_f5c26fa826dade5c_0(((com.moon.pm)(receiver)), ((int)(p0)), ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(com.moon.pm.A)).N)), ((int)(p1)), ((int)(p2)), ((int)(p3)), ((int)(p4)));

    net.minecraft.entity.Entity[] local9_life7 = __sourceSpill325_5;

    ((com.moon.pm)(receiver)).B = ((boolean)(false));

    ((com.moon.pm)(receiver)).B = ((boolean)(p5));

    ((com.moon.pm)(receiver)).e(((int)(__sourceIntrinsic_f5c26fa826dade5c_originalDynamicSite325_10(29225, (9254123669408773L ^ local7_life1)))));

    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {

        moom.cu.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[5])));

    }

    return;

}



static {
C = ((long)(((moom._a)(moom._c.a(((long)(1351041579303563864L)), ((long)(8830500041726750752L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(203650155781013L)))));
    J = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.pm.C ^ 49469829932579L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill540_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill540_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill540_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill540_14 = new byte[8];
    (__sourceSpill540_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill540_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation540_16 = __sourceSpill540_14;
    ((javax.crypto.Cipher)(__sourceSpill540_11)).init(((int)(__sourceSpill540_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill540_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation540_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[5];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Ù\000m[ð-ÓVZöä¹çX6Ó>\rw¾>Õ°."))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill540_25 = local6_life21;
        int __sourceSpill540_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill540_25)).substring(((int)(__sourceSpill540_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill540_30 = local8_life19;
        int __sourceSpill540_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill540_33 = new byte[8];
        (__sourceSpill540_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill540_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill540_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill540_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill540_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill540_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill540_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill540_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill540_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill540_34)).doFinal(((byte[])(__sourceSpill540_33)));
        (__sourceSpill540_30)[__sourceSpill540_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\rFSÀd¯\031'~FîèÛW\034"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill540_38 = local6_life21;
        int __sourceSpill540_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill540_38)).substring(((int)(__sourceSpill540_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill540_43 = local8_life19;
        int __sourceSpill540_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill540_46 = new byte[8];
        (__sourceSpill540_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill540_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill540_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill540_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill540_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill540_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill540_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill540_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill540_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill540_47)).doFinal(((byte[])(__sourceSpill540_46)));
        (__sourceSpill540_43)[__sourceSpill540_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    H = ((long[])(local8_life19));
    I = ((java.lang.Integer[])(new java.lang.Integer[5]));
    A = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM()));
}

private static native <E extends Throwable> void __sourceConstructorInit_e1d12a37ed7aa600_0(com.moon.pm a0, int a1, net.minecraft.client.gui.FontRenderer a2, int a3, int a4, int a5, int a6) throws E;
private static native <E extends Throwable> void __sourceConstructorInit_f5c26fa826dade5c_0(com.moon.pm a0, int a1, net.minecraft.client.gui.FontRenderer a2, int a3, int a4, int a5, int a6) throws E;

private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 26097;
      if (I[var3] == null) {
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
         long var5 = H[var3];
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
         Object[] var9 = (Object[])J.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               J.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/pm", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         I[var3] = var15;
      }

      return I[var3];
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.pm.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral3281_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/pm"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void d__Void() {
int forestValue900134_36_0;
    com.moon.pm forestValue900134_41_0;
    int forestValue900134_42_0;
    com.moon.pm forestValue900134_67_0;
    java.lang.String forestValue900134_68_0;
    int forestValue900134_84_0;
    int forestValue900134_90_0;
    int forestValue900134_92_0;
    int forestValue900134_108_0;
    int forestValue900134_112_0;
    int forestValue900134_116_0;
    int forestValue900134_118_0;
    int forestValue900134_151_0;
    java.lang.String forestValue900134_162_0;
    int forestValue900134_175_0;
    int forestValue900134_188_0;
    int forestValue900134_190_0;
    int forestValue900134_205_0;
    int forestValue900134_207_0;
    int forestValue900134_211_0;
    int forestValue900134_221_0;
    int forestValue900134_247_0;
    int forestValue900134_285_0;
    int forestValue900134_287_0;
    int forestValue900134_299_0;
    int forestValue900134_299_1;
    boolean spill900134_0;
    com.moon.pm spill900134_1;
    com.moon.pm spill900134_2;
    int spill900134_3;
    boolean spill900134_4;
    int spill900134_5;
    int spill900134_6;
    int spill900134_7;
    int spill900134_8;
    int spill900134_9;
    int spill900134_10;
    int spill900134_11;
    int spill900134_12;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    int life4_51;
    int life5_57;
    int life6_63;
    java.lang.String life7_82;
    java.lang.String life8_92;
    int life9_115;
    int life10_154;
    int life11_159;
    int life12_173;
    int life13_175;
    java.lang.String life14_209;
    int life14_248;
    int life15_250;
    int life13_330;
    int life16_403;
    forest_join_317: {
    forest_join_299: {
    forest_join_287: {
    forest_join_286: {
    forest_join_285: {
    forest_join_276: {
    forest_join_247: {
    forest_join_246: {
    forest_join_221: {
    forest_join_219: {
    forest_join_211: {
    forest_join_210: {
    forest_join_207: {
    forest_join_206: {
    forest_join_205: {
    forest_join_190: {
    forest_join_189: {
    forest_join_188: {
    forest_join_187: {
    forest_join_175: {
    forest_join_173: {
    forest_join_162: {
    forest_join_161: {
    forest_join_151: {
    forest_join_149: {
    forest_join_118: {
    forest_join_117: {
    forest_join_116: {
    forest_join_112: {
    forest_join_108: {
    forest_join_92: {
    forest_join_91: {
    forest_join_90: {
    forest_join_84: {
    forest_join_68: {
    forest_join_67: {
    forest_join_66: {
    forest_join_42: {
    forest_join_41: {
    forest_join_40: {
    forest_join_36: {
    life1_3 = (com.moon.pm.C ^ 70417075044411L);
    life3_5 = moom.cu.a__Arrayr3();
    spill900134_0 = ((com.moon.pm)(this)).c__Boolean();
    if (!((life3_5 == null))) {
        forestValue900134_36_0 = ((spill900134_0) ? 1 : 0);
        break forest_join_36;
    }
    if (!(spill900134_0)) {
        break forest_join_317;
    }
    com.moon.pm.a(((int)(this.h)), ((int)(((this.i + this.k) - 1))), ((int)((this.h + this.j))), ((int)((this.i + this.k))), ((int)(-1)));
    spill900134_1 = this;
    if (!((life3_5 == null))) {
        forestValue900134_41_0 = spill900134_1;
        break forest_join_41;
    }
    forestValue900134_36_0 = ((((com.moon.pm)(spill900134_1)).r) ? 1 : 0);
    }
    if (!((forestValue900134_36_0 != 0))) {
        break forest_join_40;
    }
    forestValue900134_42_0 = this.v;
    break forest_join_42;
    }
    forestValue900134_41_0 = this;
    }
    forestValue900134_42_0 = ((com.moon.pm)(forestValue900134_41_0)).w;
    }
    life4_51 = forestValue900134_42_0;
    life5_57 = (this.t - this.s);
    life6_63 = (this.u - this.s);
    spill900134_2 = this;
    if (!((life3_5 == null))) {
        forestValue900134_67_0 = spill900134_2;
        break forest_join_67;
    }
    if (!(((com.moon.pm)(spill900134_2)).B)) {
        break forest_join_66;
    }
    forestValue900134_68_0 = ((java.lang.String)(this.l)).replaceAll(((java.lang.String)(".")), ((java.lang.String)("*")));
    break forest_join_68;
    }
    forestValue900134_67_0 = this;
    }
    forestValue900134_68_0 = ((com.moon.pm)(forestValue900134_67_0)).l;
    }
    life7_82 = forestValue900134_68_0;
    life8_92 = ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(com.moon.pm.A)).N)).a__String(((java.lang.String)(((java.lang.String)(life7_82)).substring(((int)(this.s))))), ((int)(((com.moon.pm)(this)).e())));
    spill900134_3 = life5_57;
    if (!((life3_5 == null))) {
        forestValue900134_84_0 = spill900134_3;
        break forest_join_84;
    }
    if (!((spill900134_3 >= 0))) {
        break forest_join_91;
    }
    forestValue900134_84_0 = life5_57;
    }
    if (!((life3_5 == null))) {
        forestValue900134_90_0 = forestValue900134_84_0;
        break forest_join_90;
    }
    if (!((forestValue900134_84_0 <= ((java.lang.String)(life8_92)).length()))) {
        break forest_join_91;
    }
    forestValue900134_90_0 = 1;
    }
    forestValue900134_92_0 = forestValue900134_90_0;
    break forest_join_92;
    }
    forestValue900134_92_0 = 0;
    }
    life9_115 = forestValue900134_92_0;
    spill900134_4 = this.q;
    if (!((life3_5 == null))) {
        forestValue900134_108_0 = ((spill900134_4) ? 1 : 0);
        break forest_join_108;
    }
    if (!(spill900134_4)) {
        break forest_join_117;
    }
    forestValue900134_108_0 = ((this.n / __sourceIntrinsic_a91ecd6db48f_invokedynamic900134_34(20855, (3783105278086867363L ^ life1_3))) % 2);
    }
    if (!((life3_5 == null))) {
        forestValue900134_112_0 = forestValue900134_108_0;
        break forest_join_112;
    }
    if (!((forestValue900134_108_0 == 0))) {
        break forest_join_117;
    }
    forestValue900134_112_0 = life9_115;
    }
    if (!((life3_5 == null))) {
        forestValue900134_116_0 = forestValue900134_112_0;
        break forest_join_116;
    }
    if (!((forestValue900134_112_0 != 0))) {
        break forest_join_117;
    }
    forestValue900134_116_0 = 1;
    }
    forestValue900134_118_0 = forestValue900134_116_0;
    break forest_join_118;
    }
    forestValue900134_118_0 = 0;
    }
    life10_154 = forestValue900134_118_0;
    life11_159 = (this.h + 4);
    life12_173 = (this.i + ((this.k - __sourceIntrinsic_a91ecd6db48f_invokedynamic900134_38(10370, (185748529584902231L ^ life1_3))) / 2));
    life13_175 = life11_159;
    spill900134_5 = life6_63;
    if (!((life3_5 == null))) {
        forestValue900134_151_0 = spill900134_5;
        break forest_join_151;
    }
    if (!((spill900134_5 > ((java.lang.String)(life8_92)).length()))) {
        break forest_join_149;
    }
    life6_63 = ((java.lang.String)(life8_92)).length();
    }
    forestValue900134_151_0 = ((java.lang.String)(life8_92)).length();
    }
    if (!((life3_5 == null))) {
        forestValue900134_175_0 = forestValue900134_151_0;
        break forest_join_175;
    }
    if (!((forestValue900134_151_0 > 0))) {
        break forest_join_173;
    }
    if (!((life9_115 != 0))) {
        break forest_join_161;
    }
    forestValue900134_162_0 = ((java.lang.String)(life8_92)).substring(((int)(0)), ((int)(life5_57)));
    break forest_join_162;
    }
    forestValue900134_162_0 = life8_92;
    }
    life14_209 = forestValue900134_162_0;
    life13_175 = ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(com.moon.pm.A)).N)).a(((java.lang.String)(life14_209)), ((float)(((float) life11_159))), ((float)(((float) life12_173))), ((int)(life4_51)));
    }
    forestValue900134_175_0 = this.t;
    }
    if (!((life3_5 == null))) {
        forestValue900134_188_0 = forestValue900134_175_0;
        break forest_join_188;
    }
    if (!((forestValue900134_175_0 >= ((java.lang.String)(life7_82)).length()))) {
        break forest_join_187;
    }
    spill900134_6 = ((java.lang.String)(life7_82)).length();
    if (!((life3_5 == null))) {
        forestValue900134_188_0 = spill900134_6;
        break forest_join_188;
    }
    if (!((spill900134_6 >= ((com.moon.pm)(this)).b()))) {
        break forest_join_189;
    }
    }
    forestValue900134_188_0 = 1;
    }
    forestValue900134_190_0 = forestValue900134_188_0;
    break forest_join_190;
    }
    forestValue900134_190_0 = 0;
    }
    life14_248 = forestValue900134_190_0;
    life15_250 = life13_175;
    spill900134_7 = life9_115;
    if (!((life3_5 == null))) {
        forestValue900134_211_0 = spill900134_7;
        break forest_join_211;
    }
    if (!((spill900134_7 == 0))) {
        break forest_join_210;
    }
    spill900134_8 = life5_57;
    if (!((life3_5 == null))) {
        forestValue900134_205_0 = spill900134_8;
        break forest_join_205;
    }
    if (!((spill900134_8 > 0))) {
        break forest_join_206;
    }
    forestValue900134_205_0 = (life11_159 + this.j);
    }
    forestValue900134_207_0 = forestValue900134_205_0;
    break forest_join_207;
    }
    forestValue900134_207_0 = life11_159;
    }
    life15_250 = forestValue900134_207_0;
    if (!((life3_5 != null))) {
        break forest_join_219;
    }
    }
    forestValue900134_211_0 = life14_248;
    }
    if (!((life3_5 == null))) {
        forestValue900134_221_0 = forestValue900134_211_0;
        break forest_join_221;
    }
    if (!((forestValue900134_211_0 != 0))) {
        break forest_join_219;
    }
    life15_250 = (life13_175 - 1);
    life13_175 += -1;
    }
    forestValue900134_221_0 = ((java.lang.String)(life8_92)).length();
    }
    if (!((life3_5 == null))) {
        forestValue900134_247_0 = forestValue900134_221_0;
        break forest_join_247;
    }
    if (!((forestValue900134_221_0 > 0))) {
        break forest_join_246;
    }
    spill900134_9 = life9_115;
    if (!((life3_5 == null))) {
        forestValue900134_247_0 = spill900134_9;
        break forest_join_247;
    }
    if (!((spill900134_9 != 0))) {
        break forest_join_246;
    }
    spill900134_10 = life5_57;
    if (!((life3_5 == null))) {
        forestValue900134_247_0 = spill900134_10;
        break forest_join_247;
    }
    if (!((spill900134_10 < ((java.lang.String)(life8_92)).length()))) {
        break forest_join_246;
    }
    life13_330 = ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(com.moon.pm.A)).N)).a(((java.lang.String)(((java.lang.String)(life8_92)).substring(((int)(life5_57))))), ((float)(((float) life13_175))), ((float)(((float) life12_173))), ((int)(life4_51)));
    life13_330 = life13_330;
    }
    forestValue900134_247_0 = life10_154;
    }
    if (!((life3_5 == null))) {
        forestValue900134_287_0 = forestValue900134_247_0;
        break forest_join_287;
    }
    if (!((forestValue900134_247_0 != 0))) {
        break forest_join_286;
    }
    spill900134_11 = life14_248;
    if (!((life3_5 == null))) {
        forestValue900134_285_0 = spill900134_11;
        break forest_join_285;
    }
    if (!((spill900134_11 != 0))) {
        break forest_join_276;
    }
    net.minecraft.client.gui.Gui.a(((int)(life15_250)), ((int)((life12_173 - 1))), ((int)((life15_250 + 1))), ((int)(((life12_173 + 1) + ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(com.moon.pm.A)).N)).c))), ((int)(__sourceIntrinsic_a91ecd6db48f_invokedynamic900134_60(28124, (6241914029977294094L ^ life1_3)))));
    if (!((life3_5 != null))) {
        break forest_join_286;
    }
    }
    forestValue900134_285_0 = ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(com.moon.pm.A)).N)).a(((java.lang.String)("_")), ((float)(((float) life15_250))), ((float)(((float) life12_173))), ((int)(life4_51)));
    }
    recovery.source.CarrierOps.discard(forestValue900134_285_0);
    }
    forestValue900134_287_0 = life6_63;
    }
    spill900134_12 = life5_57;
    if (!((life3_5 == null))) {
        forestValue900134_299_0 = forestValue900134_287_0;
        forestValue900134_299_1 = spill900134_12;
        break forest_join_299;
    }
    if (!((forestValue900134_287_0 != spill900134_12))) {
        break forest_join_317;
    }
    forestValue900134_299_0 = life11_159;
    forestValue900134_299_1 = ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(com.moon.pm.A)).N)).a(((java.lang.String)(((java.lang.String)(life8_92)).substring(((int)(0)), ((int)(life6_63))))));
    }
    life16_403 = (forestValue900134_299_0 + forestValue900134_299_1);
    ((com.moon.pm)(this)).c(((int)(life15_250)), ((int)((life12_173 - 1))), ((int)((life16_403 - 1))), ((int)(((life12_173 + 1) + ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(com.moon.pm.A)).N)).c))));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> int __sourceIntrinsic_e1d12a37ed7aa600_originalDynamicSite1517_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f5c26fa826dade5c_originalDynamicSite325_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral3281_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_invokedynamic900134_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_invokedynamic900134_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_invokedynamic900134_60(int a0, long a1) throws E;
}
