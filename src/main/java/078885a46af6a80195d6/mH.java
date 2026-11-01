package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class mH extends net.minecraft.client.renderer.entity.Render<net.minecraft.entity.projectile.EntityFishHook> {

private static final moom.DD h;

private static final long i;

private static final long[] j;

private static final java.lang.Integer[] k;

private static final java.util.Map l;

public mH(net.minecraft.client.renderer.entity.RenderManager p0) {
super(p0);
}


static {
i = ((long)(((moom._a)(moom._c.a(((long)(-5445633608094119368L)), ((long)(-5754561871526304191L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(62666188578994L)))));
    l = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.mH.i ^ 93910431470530L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1399_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1399_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1399_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1399_14 = new byte[8];
    (__sourceSpill1399_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1399_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1399_16 = __sourceSpill1399_14;
    ((javax.crypto.Cipher)(__sourceSpill1399_11)).init(((int)(__sourceSpill1399_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1399_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1399_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "V>aPú_\\\006´¸S\016\023"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1399_25 = local6_life21;
        int __sourceSpill1399_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1399_25)).substring(((int)(__sourceSpill1399_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1399_30 = local8_life19;
        int __sourceSpill1399_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1399_33 = new byte[8];
        (__sourceSpill1399_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1399_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1399_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1399_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1399_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1399_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1399_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1399_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1399_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1399_34)).doFinal(((byte[])(__sourceSpill1399_33)));
        (__sourceSpill1399_30)[__sourceSpill1399_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\021:N]\022Ãrw\000$ïá\037°¹à"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1399_38 = local6_life21;
        int __sourceSpill1399_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1399_38)).substring(((int)(__sourceSpill1399_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1399_43 = local8_life19;
        int __sourceSpill1399_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1399_46 = new byte[8];
        (__sourceSpill1399_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1399_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1399_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1399_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1399_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1399_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1399_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1399_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1399_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1399_47)).doFinal(((byte[])(__sourceSpill1399_46)));
        (__sourceSpill1399_43)[__sourceSpill1399_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    j = ((long[])(local8_life19));
    k = ((java.lang.Integer[])(new java.lang.Integer[4]));
    h = ((moom.DD)(new moom.DD("textures/particle/particles.png")));
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 10062;
      if (k[var3] == null) {
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
         long var5 = j[var3];
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
         Object[] var9 = (Object[])l.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               l.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/mH", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.mH.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8383_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/mH"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected moom.DD a(net.minecraft.entity.projectile.EntityFishHook p0) {
return moom.mH.h;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(net.minecraft.entity.projectile.EntityFishHook p0, double p1, double p2, double p3, float p4, float p5) {
double lexicalValue1248_376_0;
    int spill1248_0;
    long spill1248_1;
    long life10_3;
    net.minecraft.client.renderer.Tessellator life12_22;
    moom.lw life13_25;
    int life14_27;
    int life15_29;
    float life16_31;
    float life17_33;
    float life18_35;
    float life19_37;
    float life20_39;
    float life21_41;
    float life22_43;
    float life23_132;
    float life24_138;
    moom.DR life25_145;
    moom.DR life25_166;
    moom.DR life25_187;
    moom.DR life25_193;
    moom.DR life25_200;
    double life26_218;
    double life28_236;
    double life30_254;
    double life32_259;
    float life34_297;
    double life35_301;
    double life37_305;
    double life39_307;
    double life41_309;
    double life34_396;
    double life36_411;
    double life38_426;
    double life40_432;
    double life42_440;
    double life44_446;
    int life46_454;
    int life47_456;
    float life48_468;
    lexical_join_513: {
    lexical_join_501: {
    lexical_join_377: {
    lexical_join_376: {
    lexical_join_375: {
    lexical_join_274: {
    lexical_join_269: {
    life10_3 = (moom.mH.i ^ 110039377778139L);
    moom.kZ.B();
    __sourceExactCall_f6b60eb6b2432b(((float)(((float) p1))), ((float)(((float) p2))), ((float)(((float) p3))));
    moom.kZ.y();
    __sourceExactCall_c87cfdff997c62(((float)(0x1.0p-1f)), ((float)(0x1.0p-1f)), ((float)(0x1.0p-1f)));
    __sourceExactCall_c99cd468f85ed7(((moom.mH)(this)), ((net.minecraft.entity.Entity)(p0)));
    life12_22 = __sourceExactCall_607dff73cf88f9();
    life13_25 = ((net.minecraft.client.renderer.Tessellator)(life12_22)).a__lw();
    life14_27 = 1;
    life15_29 = 2;
    life16_31 = 0x1.0p-4f;
    life17_33 = 0x1.0p-3f;
    life18_35 = 0x1.0p-3f;
    life19_37 = 0x1.8p-3f;
    life20_39 = 0x1.0p0f;
    life21_41 = 0x1.0p-1f;
    life22_43 = 0x1.0p-1f;
    __sourceExactCall_1335870edf69d2(((float)((0x1.68p7f - ((net.minecraft.client.renderer.entity.RenderManager)(this.b)).g))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    __sourceExactCall_1335870edf69d2(((float)((-((net.minecraft.client.renderer.entity.RenderManager)(this.b)).h))), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    __sourceExactCall_b6c6a7d43443b6(((moom.lw)(life13_25)), ((int)(__sourceIntrinsic_1ec6297df0d2_invokedynamic1248_14(8890, (8783321350261532153L ^ life10_3)))), ((moom.oD)(moom.oB.l)));
    ((moom.lw)(__sourceExactCall_49921e0973e9e6(((moom.lw)(__sourceExactCall_7c0370b7b41901(((moom.lw)(__sourceExactCall_217a742e4be448(((moom.lw)(life13_25)), ((double)(-0x1.0p-1d)), ((double)(-0x1.0p-1d)), ((double)(0x0.0p0d))))), ((double)(0x1.0p-4d)), ((double)(0x1.8p-3d))))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f))))).c__Void();
    ((moom.lw)(__sourceExactCall_49921e0973e9e6(((moom.lw)(__sourceExactCall_7c0370b7b41901(((moom.lw)(__sourceExactCall_217a742e4be448(((moom.lw)(life13_25)), ((double)(0x1.0p-1d)), ((double)(-0x1.0p-1d)), ((double)(0x0.0p0d))))), ((double)(0x1.0p-3d)), ((double)(0x1.8p-3d))))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f))))).c__Void();
    ((moom.lw)(__sourceExactCall_49921e0973e9e6(((moom.lw)(__sourceExactCall_7c0370b7b41901(((moom.lw)(__sourceExactCall_217a742e4be448(((moom.lw)(life13_25)), ((double)(0x1.0p-1d)), ((double)(0x1.0p-1d)), ((double)(0x0.0p0d))))), ((double)(0x1.0p-3d)), ((double)(0x1.0p-3d))))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f))))).c__Void();
    ((moom.lw)(__sourceExactCall_49921e0973e9e6(((moom.lw)(__sourceExactCall_7c0370b7b41901(((moom.lw)(__sourceExactCall_217a742e4be448(((moom.lw)(life13_25)), ((double)(-0x1.0p-1d)), ((double)(0x1.0p-1d)), ((double)(0x0.0p0d))))), ((double)(0x1.0p-4d)), ((double)(0x1.0p-3d))))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f))))).c__Void();
    ((net.minecraft.client.renderer.Tessellator)(life12_22)).a__Void();
    moom.kZ.z();
    moom.kZ.C();
    if (!((((net.minecraft.entity.projectile.EntityFishHook)(p0)).aN != null))) {
        break lexical_join_513;
    }
    life23_132 = ((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.projectile.EntityFishHook)(p0)).aN)).b__sourceReturn_f6c4892e39(((float)(p5)));
    life24_138 = __sourceExactCall_91a54ea3c9ba57(((float)((moom.Dr.c(((float)(life23_132))) * 0x1.921fb6p1f))));
    life25_145 = new moom.DR(-0x1.70a3d70a3d70ap-2d, 0x1.eb851eb851eb8p-6d, 0x1.6666666666666p-2d);
    life25_166 = __sourceExactCall_f91e42910b9f70(((moom.DR)(life25_145)), ((float)((((-(((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.projectile.EntityFishHook)(p0)).aN)).z + ((((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.projectile.EntityFishHook)(p0)).aN)).x - ((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.projectile.EntityFishHook)(p0)).aN)).z) * p5))) * 0x1.921fb6p1f) / 0x1.68p7f))));
    life25_187 = __sourceExactCall_577959b54e63a5(((moom.DR)(life25_166)), ((float)((((-(((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.projectile.EntityFishHook)(p0)).aN)).y + ((((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.projectile.EntityFishHook)(p0)).aN)).w - ((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.projectile.EntityFishHook)(p0)).aN)).y) * p5))) * 0x1.921fb6p1f) / 0x1.68p7f))));
    life25_193 = __sourceExactCall_577959b54e63a5(((moom.DR)(life25_187)), ((float)((life24_138 * 0x1.0p-1f))));
    life25_200 = __sourceExactCall_f91e42910b9f70(((moom.DR)(life25_193)), ((float)(((-life24_138) * 0x1.666666p-1f))));
    life26_218 = ((((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.projectile.EntityFishHook)(p0)).aN)).k + ((((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.projectile.EntityFishHook)(p0)).aN)).n - ((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.projectile.EntityFishHook)(p0)).aN)).k) * ((double) p5))) + ((moom.DR)(life25_200)).a);
    life28_236 = ((((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.projectile.EntityFishHook)(p0)).aN)).l + ((((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.projectile.EntityFishHook)(p0)).aN)).o - ((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.projectile.EntityFishHook)(p0)).aN)).l) * ((double) p5))) + ((moom.DR)(life25_200)).b);
    life30_254 = ((((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.projectile.EntityFishHook)(p0)).aN)).m + ((((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.projectile.EntityFishHook)(p0)).aN)).p - ((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.projectile.EntityFishHook)(p0)).aN)).m) * ((double) p5))) + ((moom.DR)(life25_200)).c);
    life32_259 = ((double) ((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.projectile.EntityFishHook)(p0)).aN)).e__Float());
    if (!((((net.minecraft.client.renderer.entity.RenderManager)(this.b)).i != null))) {
        break lexical_join_269;
    }
    if (!((((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.renderer.entity.RenderManager)(this.b)).i)).aP <= 0))) {
        break lexical_join_274;
    }
    }
    if (!((((net.minecraft.entity.projectile.EntityFishHook)(p0)).aN != ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).K))) {
        break lexical_join_377;
    }
    }
    life34_297 = (((((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.projectile.EntityFishHook)(p0)).aN)).a3 + ((((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.projectile.EntityFishHook)(p0)).aN)).a2 - ((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.projectile.EntityFishHook)(p0)).aN)).a3) * p5)) * 0x1.921fb6p1f) / 0x1.68p7f);
    life35_301 = ((double) __sourceExactCall_91a54ea3c9ba57(((float)(life34_297))));
    life37_305 = ((double) __sourceExactCall_3473c8e807816a(((float)(life34_297))));
    life39_307 = 0x1.6666666666666p-2d;
    life41_309 = 0x1.999999999999ap-1d;
    life26_218 = (((((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.projectile.EntityFishHook)(p0)).aN)).k + ((((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.projectile.EntityFishHook)(p0)).aN)).n - ((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.projectile.EntityFishHook)(p0)).aN)).k) * ((double) p5))) - (life37_305 * 0x1.6666666666666p-2d)) - (life35_301 * 0x1.999999999999ap-1d));
    life28_236 = (((((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.projectile.EntityFishHook)(p0)).aN)).l + life32_259) + ((((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.projectile.EntityFishHook)(p0)).aN)).o - ((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.projectile.EntityFishHook)(p0)).aN)).l) * ((double) p5))) - 0x1.ccccccccccccdp-2d);
    life30_254 = (((((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.projectile.EntityFishHook)(p0)).aN)).m + ((((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.projectile.EntityFishHook)(p0)).aN)).p - ((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.projectile.EntityFishHook)(p0)).aN)).m) * ((double) p5))) - (life35_301 * 0x1.6666666666666p-2d)) + (life37_305 * 0x1.999999999999ap-1d));
    if (!(((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.projectile.EntityFishHook)(p0)).aN)).t__Boolean())) {
        break lexical_join_375;
    }
    lexicalValue1248_376_0 = -0x1.8p-3d;
    break lexical_join_376;
    }
    lexicalValue1248_376_0 = 0x0.0p0d;
    }
    life32_259 = lexicalValue1248_376_0;
    }
    life34_396 = (((net.minecraft.entity.projectile.EntityFishHook)(p0)).k + ((((net.minecraft.entity.projectile.EntityFishHook)(p0)).n - ((net.minecraft.entity.projectile.EntityFishHook)(p0)).k) * ((double) p5)));
    spill1248_0 = 9928;
    life36_411 = ((((net.minecraft.entity.projectile.EntityFishHook)(p0)).l + ((((net.minecraft.entity.projectile.EntityFishHook)(p0)).o - ((net.minecraft.entity.projectile.EntityFishHook)(p0)).l) * ((double) p5))) + 0x1.0p-2d);
    spill1248_1 = (6237427013129724298L ^ life10_3);
    life38_426 = (((net.minecraft.entity.projectile.EntityFishHook)(p0)).m + ((((net.minecraft.entity.projectile.EntityFishHook)(p0)).p - ((net.minecraft.entity.projectile.EntityFishHook)(p0)).m) * ((double) p5)));
    life40_432 = ((double) ((float) (life26_218 - life34_396)));
    life42_440 = (((double) ((float) (life28_236 - life36_411))) + life32_259);
    life44_446 = ((double) ((float) (life30_254 - life38_426)));
    moom.kZ.v();
    moom.kZ.f();
    __sourceExactCall_b6c6a7d43443b6(((moom.lw)(life13_25)), ((int)(3)), ((moom.oD)(moom.oB.h)));
    life46_454 = __sourceIntrinsic_1ec6297df0d2_invokedynamic1248_129(spill1248_0, spill1248_1);
    life47_456 = 0;
    lexical_cycle_449: while (true) {
    if (!((life47_456 <= __sourceIntrinsic_1ec6297df0d2_invokedynamic1248_130(10284, (5507604277859774316L ^ life10_3))))) {
        break lexical_join_501;
    }
    life48_468 = (((float) life47_456) / 0x1.0p4f);
    ((moom.lw)(__sourceExactCall_5d46cad12f6a1a(((moom.lw)(__sourceExactCall_217a742e4be448(((moom.lw)(life13_25)), ((double)((p1 + (life40_432 * ((double) life48_468))))), ((double)(((p2 + ((life42_440 * ((double) ((life48_468 * life48_468) + life48_468))) * 0x1.0p-1d)) + 0x1.0p-2d))), ((double)((p3 + (life44_446 * ((double) life48_468)))))))), ((int)(0)), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_1ec6297df0d2_invokedynamic1248_132(3455, (766880300500372030L ^ life10_3))))))).c__Void();
    life47_456 += 1;
    continue lexical_cycle_449;
    }
    }
    ((net.minecraft.client.renderer.Tessellator)(life12_22)).a__Void();
    moom.kZ.e();
    moom.kZ.u();
    __sourceExactCall_76ed68570395ae(this, ((net.minecraft.entity.Entity)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
    }
    return;
}


public void a__sourceBridge_01f3c9ade5(net.minecraft.entity.Entity p0, double p1, double p2, double p3, float p4, float p5) {
((moom.mH)(this)).a(((net.minecraft.entity.projectile.EntityFishHook)(((net.minecraft.entity.projectile.EntityFishHook)(p0)))), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
}


protected moom.DD a__sourceBridge_fb93f4301e(net.minecraft.entity.Entity p0) {
return ((moom.mH)(this)).a(((net.minecraft.entity.projectile.EntityFishHook)(((net.minecraft.entity.projectile.EntityFishHook)(p0)))));
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8383_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1ec6297df0d2_invokedynamic1248_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1ec6297df0d2_invokedynamic1248_129(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1ec6297df0d2_invokedynamic1248_130(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1ec6297df0d2_invokedynamic1248_132(int a0, long a1) throws E;



private static native void __sourceExactCall_f6b60eb6b2432b(float p0, float p1, float p2);
private static native void __sourceExactCall_c87cfdff997c62(float p0, float p1, float p2);
private static native boolean __sourceExactCall_c99cd468f85ed7(moom.mH p0, net.minecraft.entity.Entity p1);
private static native net.minecraft.client.renderer.Tessellator __sourceExactCall_607dff73cf88f9();
private static native void __sourceExactCall_1335870edf69d2(float p0, float p1, float p2, float p3);
private static native void __sourceExactCall_b6c6a7d43443b6(moom.lw p0, int p1, moom.oD p2);
private static native moom.lw __sourceExactCall_49921e0973e9e6(moom.lw p0, float p1, float p2, float p3);
private static native moom.lw __sourceExactCall_7c0370b7b41901(moom.lw p0, double p1, double p2);
private static native moom.lw __sourceExactCall_217a742e4be448(moom.lw p0, double p1, double p2, double p3);
private static native float __sourceExactCall_91a54ea3c9ba57(float p0);
private static native moom.DR __sourceExactCall_f91e42910b9f70(moom.DR p0, float p1);
private static native moom.DR __sourceExactCall_577959b54e63a5(moom.DR p0, float p1);
private static native float __sourceExactCall_3473c8e807816a(float p0);
private static native moom.lw __sourceExactCall_5d46cad12f6a1a(moom.lw p0, int p1, int p2, int p3, int p4);
private static native void __sourceExactCall_76ed68570395ae(net.minecraft.client.renderer.entity.Render p0, net.minecraft.entity.Entity p1, double p2, double p3, double p4, float p5, float p6);
}
