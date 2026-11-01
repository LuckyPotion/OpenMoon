package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
class iq {

private net.minecraft.world.storage.MapData a;

private moom.n3 b;

private moom.DD c;

private int[] d;

net.minecraft.client.gui.MapItemRenderer e;

private static long f;

private static long[] g;

private static java.lang.Integer[] h;

private static java.util.Map i;

private iq(net.minecraft.client.gui.MapItemRenderer p0, net.minecraft.world.storage.MapData p1) { super(); }


private static void __sourceConstructorBody_bf5516e07b19eae0(moom.iq receiver, net.minecraft.client.gui.MapItemRenderer p0, net.minecraft.world.storage.MapData p1) throws Throwable {

long local3 = (moom.iq.f ^ 60699063884159L);

    ((moom.iq)(receiver)).e = ((net.minecraft.client.gui.MapItemRenderer)(p0));

    moom.iq.__sourceConstructorInit_bf5516e07b19eae0_0(((moom.iq)(receiver)));

    ((moom.iq)(receiver)).a = ((net.minecraft.world.storage.MapData)(p1));

    ((moom.iq)(receiver)).b = ((moom.n3)(new moom.n3(__sourceIntrinsic_bf5516e07b19eae0_originalDynamicSite2453_4(2349, (3350559236511352373L ^ local3)), __sourceIntrinsic_bf5516e07b19eae0_originalDynamicSite2453_5(12066, (3532179308320710712L ^ local3)))));

    ((moom.iq)(receiver)).d = ((int[])(__sourceExactCall_d0385b7c81a8a4(((moom.n3)(((moom.iq)(receiver)).b)))));

    ((moom.iq)(receiver)).c = ((moom.DD)(((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.gui.MapItemRenderer)(p0)).b)).a(((java.lang.String)(__sourceIntrinsic_bf5516e07b19eae0_originalDynamicSite2453_12(((net.minecraft.world.storage.MapData)(p1)).a))), ((moom.n3)(((moom.iq)(receiver)).b)))));

    java.util.Arrays.fill(((int[])(((moom.iq)(receiver)).d)), ((int)(0)));

    return;

}



static {
f = ((long)(((moom._a)(moom._c.a(((long)(-3502253863317131271L)), ((long)(4140805253223959968L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(227051814031112L)))));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.iq.f ^ 104803778531234L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1314_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1314_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1314_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1314_14 = new byte[8];
    (__sourceSpill1314_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1314_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1314_16 = __sourceSpill1314_14;
    ((javax.crypto.Cipher)(__sourceSpill1314_11)).init(((int)(__sourceSpill1314_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1314_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1314_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[11];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\021áø\faW\033/³¼)\004z¢/@\026}¾\r§!Zºò\tÂ\r8ÝaÈ!ÙIn<K¶1'\nÌÙ9%67ñb\r<Ð{\bÔ©mW¡j"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1314_25 = local6_life21;
        int __sourceSpill1314_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1314_25)).substring(((int)(__sourceSpill1314_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1314_30 = local8_life19;
        int __sourceSpill1314_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1314_33 = new byte[8];
        (__sourceSpill1314_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1314_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1314_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1314_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1314_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1314_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1314_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1314_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1314_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1314_34)).doFinal(((byte[])(__sourceSpill1314_33)));
        (__sourceSpill1314_30)[__sourceSpill1314_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "Q\024\035_Aw\024ÁEVí¬\177Õ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1314_38 = local6_life21;
        int __sourceSpill1314_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1314_38)).substring(((int)(__sourceSpill1314_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1314_43 = local8_life19;
        int __sourceSpill1314_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1314_46 = new byte[8];
        (__sourceSpill1314_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1314_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1314_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1314_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1314_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1314_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1314_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1314_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1314_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1314_47)).doFinal(((byte[])(__sourceSpill1314_46)));
        (__sourceSpill1314_43)[__sourceSpill1314_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    g = ((long[])(local8_life19));
    h = ((java.lang.Integer[])(new java.lang.Integer[11]));
}

private static native <E extends Throwable> void __sourceConstructorInit_bf5516e07b19eae0_0(moom.iq a0) throws E;

private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 14174;
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
            throw new RuntimeException("moom/iq", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.iq.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8074_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/iq"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private void a(boolean p0) {
long life2_3;
    int life4_5;
    int life5_7;
    net.minecraft.client.renderer.Tessellator life6_9;
    moom.lw life7_12;
    float life8_14;
    int life9_142;
    java.util.Iterator life10_148;
    moom.DY life11_155;
    int life12_211;
    float life13_218;
    float life14_225;
    float life15_234;
    float life16_243;
    float life17_253;
    forest_join_318: {
    life2_3 = (moom.iq.f ^ 71905551627343L);
    life4_5 = 0;
    life5_7 = 0;
    life6_9 = net.minecraft.client.renderer.Tessellator.a();
    life7_12 = ((net.minecraft.client.renderer.Tessellator)(life6_9)).a__lw();
    life8_14 = 0x0.0p0f;
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.gui.MapItemRenderer)(this.e)).b)).a__Void(((moom.DD)(this.c)));
    moom.kZ.l();
    moom.kZ.a(((int)(1)), ((int)(__sourceIntrinsic_de95174e7612_invokedynamic866_8(664, (1339247408492535996L ^ life2_3)))), ((int)(0)), ((int)(1)));
    moom.kZ.c__Void();
    ((moom.lw)(life7_12)).a(((int)(__sourceIntrinsic_de95174e7612_invokedynamic866_11(20649, (4775099336631988874L ^ life2_3)))), ((moom.oD)(moom.oB.i)));
    ((moom.lw)(((moom.lw)(((moom.lw)(life7_12)).a(((double)(((double) (((float) life4_5) + life8_14)))), ((double)(((double) (((float) (life5_7 + __sourceIntrinsic_de95174e7612_invokedynamic866_14(12066, (3532128381653503240L ^ life2_3)))) - life8_14)))), ((double)(-0x1.47ae14p-7d))))).a(((double)(0x0.0p0d)), ((double)(0x1.0p0d))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(life7_12)).a(((double)(((double) (((float) (life4_5 + __sourceIntrinsic_de95174e7612_invokedynamic866_18(12066, (3532128381653503240L ^ life2_3)))) - life8_14)))), ((double)(((double) (((float) (life5_7 + __sourceIntrinsic_de95174e7612_invokedynamic866_19(12066, (3532128381653503240L ^ life2_3)))) - life8_14)))), ((double)(-0x1.47ae14p-7d))))).a(((double)(0x1.0p0d)), ((double)(0x1.0p0d))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(life7_12)).a(((double)(((double) (((float) (life4_5 + __sourceIntrinsic_de95174e7612_invokedynamic866_23(12066, (3532128381653503240L ^ life2_3)))) - life8_14)))), ((double)(((double) (((float) life5_7) + life8_14)))), ((double)(-0x1.47ae14p-7d))))).a(((double)(0x1.0p0d)), ((double)(0x0.0p0d))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(life7_12)).a(((double)(((double) (((float) life4_5) + life8_14)))), ((double)(((double) (((float) life5_7) + life8_14)))), ((double)(-0x1.47ae14p-7d))))).a(((double)(0x0.0p0d)), ((double)(0x0.0p0d))))).c__Void();
    ((net.minecraft.client.renderer.Tessellator)(life6_9)).a__Void();
    moom.kZ.d__Void();
    moom.kZ.k();
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.gui.MapItemRenderer)(this.e)).b)).a__Void(((moom.DD)(net.minecraft.client.gui.MapItemRenderer.a)));
    life9_142 = 0;
    life10_148 = ((java.util.Collection)(((java.util.Map)(((net.minecraft.world.storage.MapData)(this.a)).j)).values())).iterator();
    forest_cycle_149: while (true) {
    forest_join_317: {
    forest_join_162: {
    if (!(((java.util.Iterator)(life10_148)).hasNext())) {
        break forest_join_318;
    }
    life11_155 = ((moom.DY)(((java.util.Iterator)(life10_148)).next()));
    if (!(p0)) {
        break forest_join_162;
    }
    if (!((((moom.DY)(life11_155)).a() == 1))) {
        break forest_join_317;
    }
    }
    moom.kZ.B();
    moom.kZ.b(((float)(((((float) life4_5) + (((float) ((moom.DY)(life11_155)).b()) / 0x1.0p1f)) + 0x1.0p6f))), ((float)(((((float) life5_7) + (((float) ((moom.DY)(life11_155)).c()) / 0x1.0p1f)) + 0x1.0p6f))), ((float)(-0x1.47ae14p-6f)));
    moom.kZ.b(((float)((((float) (((moom.DY)(life11_155)).d() * __sourceIntrinsic_de95174e7612_invokedynamic866_50(12347, (95300404160614942L ^ life2_3)))) / 0x1.0p4f))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    moom.kZ.a(((float)(0x1.0p2f)), ((float)(0x1.0p2f)), ((float)(0x1.8p1f)));
    moom.kZ.b(((float)(-0x1.0p-3f)), ((float)(0x1.0p-3f)), ((float)(0x0.0p0f)));
    life12_211 = ((moom.DY)(life11_155)).a();
    life13_218 = (((float) (life12_211 % 4)) / 0x1.0p2f);
    life14_225 = (((float) (life12_211 / 4)) / 0x1.0p2f);
    life15_234 = (((float) ((life12_211 % 4) + 1)) / 0x1.0p2f);
    life16_243 = (((float) ((life12_211 / 4) + 1)) / 0x1.0p2f);
    ((moom.lw)(life7_12)).a(((int)(__sourceIntrinsic_de95174e7612_invokedynamic866_55(29974, (1283504576364025652L ^ life2_3)))), ((moom.oD)(moom.oB.i)));
    life17_253 = -0x1.0624dep-10f;
    ((moom.lw)(((moom.lw)(((moom.lw)(life7_12)).a(((double)(-0x1.0p0d)), ((double)(0x1.0p0d)), ((double)(((double) (((float) life9_142) * -0x1.0624dep-10f))))))).a(((double)(((double) life13_218))), ((double)(((double) life14_225)))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(life7_12)).a(((double)(0x1.0p0d)), ((double)(0x1.0p0d)), ((double)(((double) (((float) life9_142) * -0x1.0624dep-10f))))))).a(((double)(((double) life15_234))), ((double)(((double) life14_225)))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(life7_12)).a(((double)(0x1.0p0d)), ((double)(-0x1.0p0d)), ((double)(((double) (((float) life9_142) * -0x1.0624dep-10f))))))).a(((double)(((double) life15_234))), ((double)(((double) life16_243)))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(life7_12)).a(((double)(-0x1.0p0d)), ((double)(-0x1.0p0d)), ((double)(((double) (((float) life9_142) * -0x1.0624dep-10f))))))).a(((double)(((double) life13_218))), ((double)(((double) life16_243)))))).c__Void();
    ((net.minecraft.client.renderer.Tessellator)(life6_9)).a__Void();
    moom.kZ.C();
    life9_142 += 1;
    }
    continue forest_cycle_149;
    }
    }
    moom.kZ.B();
    moom.kZ.b(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(-0x1.47ae14p-5f)));
    moom.kZ.a(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    moom.kZ.C();
    return;
}


private void a() {
long local1 = (moom.iq.f ^ 11798465537837L);
    int local3 = 0;
    while ((local3 < __sourceIntrinsic_2c8ae721fed4_invokedynamic6794_1(6435, (609267636244850791L ^ local1)))) {
        int local4 = ((((net.minecraft.world.storage.MapData)(this.a)).g)[local3] & __sourceIntrinsic_2c8ae721fed4_invokedynamic6794_4(25158, (1891556387994686212L ^ local1)));
        if (((local4 / 4) == 0)) {
        (this.d)[local3] = (((((local3 + (local3 / __sourceIntrinsic_2c8ae721fed4_invokedynamic6794_6(12066, (3532211694229790314L ^ local1)))) & 1) * __sourceIntrinsic_2c8ae721fed4_invokedynamic6794_7(25916, (6419648674026673273L ^ local1))) + __sourceIntrinsic_2c8ae721fed4_invokedynamic6794_8(70, (6978837554642825485L ^ local1))) << __sourceIntrinsic_2c8ae721fed4_invokedynamic6794_9(16019, (323357426504732624L ^ local1)));
    } else {
        (this.d)[local3] = ((moom.fm)((moom.fm.a)[(local4 / 4)])).a(((int)((local4 & 3))));
    }
        local3 += 1;
    }
    ((moom.n3)(this.b)).b__sourceReturn_da8c82d5d4();
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_bf5516e07b19eae0_originalDynamicSite2453_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bf5516e07b19eae0_originalDynamicSite2453_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_bf5516e07b19eae0_originalDynamicSite2453_12(java.lang.String a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_invokedynamic6794_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_invokedynamic6794_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_invokedynamic6794_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_invokedynamic6794_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_invokedynamic6794_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_invokedynamic6794_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8074_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_de95174e7612_invokedynamic866_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_de95174e7612_invokedynamic866_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_de95174e7612_invokedynamic866_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_de95174e7612_invokedynamic866_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_de95174e7612_invokedynamic866_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_de95174e7612_invokedynamic866_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_de95174e7612_invokedynamic866_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_de95174e7612_invokedynamic866_55(int a0, long a1) throws E;

private static native int[] __sourceExactCall_d0385b7c81a8a4(moom.n3 p0);
}
