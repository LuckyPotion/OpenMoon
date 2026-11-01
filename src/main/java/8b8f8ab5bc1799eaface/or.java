package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class or extends net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer<moom.Ca> {

private static final java.util.Map<java.lang.String, moom.om> f;

private static final moom.DD g;

public moom.iR h;

private static final long i;

private static final long[] j;

private static final java.lang.Integer[] k;

private static final java.util.Map l;

private static final long m;

public or() {
super();
    this.h = new moom.iR();
}


static {
i = ((long)(((moom._a)(moom._c.a(((long)(9134322463068668075L)), ((long)(5421867078465664117L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(9538163282313L)))));
    l = ((java.util.Map)(new java.util.HashMap(13)));
    long local5_life7 = (moom.or.i ^ 84107124248074L);
    javax.crypto.Cipher local7_life9;
    javax.crypto.Cipher __sourceSpill956_11 = (local7_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill956_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill956_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill956_14 = new byte[8];
    (__sourceSpill956_14)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local8_life15 = 1;
    while ((local8_life15 < 8)) {
        (__sourceSpill956_14)[local8_life15] = ((byte) ((int) ((local5_life7 << (local8_life15 * 8)) >>> 56)));
        local8_life15 += 1;
    }
    byte[] __sourcePreallocation956_16 = __sourceSpill956_14;
    ((javax.crypto.Cipher)(__sourceSpill956_11)).init(((int)(__sourceSpill956_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill956_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation956_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local13_life19 = new long[6];
    int local10_life20 = 0;
    java.lang.String local11_life21;
    int local12_life23 = ((java.lang.String)((local11_life21 = "xeÒó ý÷&\027J<S¼B\\08%=!péÉ&÷Þ&0é%)"))).length();
    int local9_life24 = 0;
    do {
        java.lang.String __sourceSpill956_25 = local11_life21;
        int __sourceSpill956_26 = local9_life24;
        local9_life24 += 8;
        byte[] local14_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill956_25)).substring(((int)(__sourceSpill956_26)), ((int)(local9_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill956_30 = local13_life19;
        int __sourceSpill956_31 = local10_life20;
        local10_life20 += 1;
        long local15_life32 = (((((((((((long) (local14_life29)[0]) & 255L) << 56) | ((((long) (local14_life29)[1]) & 255L) << 48)) | ((((long) (local14_life29)[2]) & 255L) << 40)) | ((((long) (local14_life29)[3]) & 255L) << 32)) | ((((long) (local14_life29)[4]) & 255L) << 24)) | ((((long) (local14_life29)[5]) & 255L) << 16)) | ((((long) (local14_life29)[6]) & 255L) << 8)) | (((long) (local14_life29)[7]) & 255L));
        byte[] __sourceSpill956_33 = new byte[8];
        (__sourceSpill956_33)[0] = ((byte) ((int) (local15_life32 >>> 56)));
        (__sourceSpill956_33)[1] = ((byte) ((int) (local15_life32 >>> 48)));
        (__sourceSpill956_33)[2] = ((byte) ((int) (local15_life32 >>> 40)));
        (__sourceSpill956_33)[3] = ((byte) ((int) (local15_life32 >>> 32)));
        (__sourceSpill956_33)[4] = ((byte) ((int) (local15_life32 >>> 24)));
        (__sourceSpill956_33)[5] = ((byte) ((int) (local15_life32 >>> 16)));
        (__sourceSpill956_33)[6] = ((byte) ((int) (local15_life32 >>> 8)));
        (__sourceSpill956_33)[7] = ((byte) ((int) local15_life32));
        javax.crypto.Cipher __sourceSpill956_34 = local7_life9;
        byte[] local17_life36 = ((javax.crypto.Cipher)(__sourceSpill956_34)).doFinal(((byte[])(__sourceSpill956_33)));
        (__sourceSpill956_30)[__sourceSpill956_31] = (((((((((((long) (local17_life36)[0]) & 255L) << 56) | ((((long) (local17_life36)[1]) & 255L) << 48)) | ((((long) (local17_life36)[2]) & 255L) << 40)) | ((((long) (local17_life36)[3]) & 255L) << 32)) | ((((long) (local17_life36)[4]) & 255L) << 24)) | ((((long) (local17_life36)[5]) & 255L) << 16)) | ((((long) (local17_life36)[6]) & 255L) << 8)) | (((long) (local17_life36)[7]) & 255L));
    } while ((!(local9_life24 >= local12_life23)));
    local12_life23 = ((java.lang.String)((local11_life21 = "ã/97§ñ£ÖA´y?\b~"))).length();
    local9_life24 = 0;
    do {
        java.lang.String __sourceSpill956_38 = local11_life21;
        int __sourceSpill956_39 = local9_life24;
        local9_life24 += 8;
        byte[] local14_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill956_38)).substring(((int)(__sourceSpill956_39)), ((int)(local9_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill956_43 = local13_life19;
        int __sourceSpill956_44 = local10_life20;
        local10_life20 += 1;
        long local15_life45 = (((((((((((long) (local14_life42)[0]) & 255L) << 56) | ((((long) (local14_life42)[1]) & 255L) << 48)) | ((((long) (local14_life42)[2]) & 255L) << 40)) | ((((long) (local14_life42)[3]) & 255L) << 32)) | ((((long) (local14_life42)[4]) & 255L) << 24)) | ((((long) (local14_life42)[5]) & 255L) << 16)) | ((((long) (local14_life42)[6]) & 255L) << 8)) | (((long) (local14_life42)[7]) & 255L));
        byte[] __sourceSpill956_46 = new byte[8];
        (__sourceSpill956_46)[0] = ((byte) ((int) (local15_life45 >>> 56)));
        (__sourceSpill956_46)[1] = ((byte) ((int) (local15_life45 >>> 48)));
        (__sourceSpill956_46)[2] = ((byte) ((int) (local15_life45 >>> 40)));
        (__sourceSpill956_46)[3] = ((byte) ((int) (local15_life45 >>> 32)));
        (__sourceSpill956_46)[4] = ((byte) ((int) (local15_life45 >>> 24)));
        (__sourceSpill956_46)[5] = ((byte) ((int) (local15_life45 >>> 16)));
        (__sourceSpill956_46)[6] = ((byte) ((int) (local15_life45 >>> 8)));
        (__sourceSpill956_46)[7] = ((byte) ((int) local15_life45));
        javax.crypto.Cipher __sourceSpill956_47 = local7_life9;
        byte[] local17_life49 = ((javax.crypto.Cipher)(__sourceSpill956_47)).doFinal(((byte[])(__sourceSpill956_46)));
        (__sourceSpill956_43)[__sourceSpill956_44] = (((((((((((long) (local17_life49)[0]) & 255L) << 56) | ((((long) (local17_life49)[1]) & 255L) << 48)) | ((((long) (local17_life49)[2]) & 255L) << 40)) | ((((long) (local17_life49)[3]) & 255L) << 32)) | ((((long) (local17_life49)[4]) & 255L) << 24)) | ((((long) (local17_life49)[5]) & 255L) << 16)) | ((((long) (local17_life49)[6]) & 255L) << 8)) | (((long) (local17_life49)[7]) & 255L));
    } while ((!(local9_life24 >= local12_life23)));
    j = ((long[])(local13_life19));
    k = ((java.lang.Integer[])(new java.lang.Integer[6]));
    javax.crypto.Cipher local0_life53;
    javax.crypto.Cipher __sourceSpill956_55 = (local0_life53 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill956_56 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill956_57 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill956_58 = new byte[8];
    (__sourceSpill956_58)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local1_life59 = 1;
    while ((local1_life59 < 8)) {
        (__sourceSpill956_58)[local1_life59] = ((byte) ((int) ((local5_life7 << (local1_life59 * 8)) >>> 56)));
        local1_life59 += 1;
    }
    byte[] __sourcePreallocation956_60 = __sourceSpill956_58;
    ((javax.crypto.Cipher)(__sourceSpill956_55)).init(((int)(__sourceSpill956_56)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill956_57)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation956_60)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life63 = -3428329731373698737L;
    byte[] __sourceSpill956_64 = new byte[8];
    (__sourceSpill956_64)[0] = ((byte) ((int) (local2_life63 >>> 56)));
    (__sourceSpill956_64)[1] = ((byte) ((int) (local2_life63 >>> 48)));
    (__sourceSpill956_64)[2] = ((byte) ((int) (local2_life63 >>> 40)));
    (__sourceSpill956_64)[3] = ((byte) ((int) (local2_life63 >>> 32)));
    (__sourceSpill956_64)[4] = ((byte) ((int) (local2_life63 >>> 24)));
    (__sourceSpill956_64)[5] = ((byte) ((int) (local2_life63 >>> 16)));
    (__sourceSpill956_64)[6] = ((byte) ((int) (local2_life63 >>> 8)));
    (__sourceSpill956_64)[7] = ((byte) ((int) local2_life63));
    javax.crypto.Cipher __sourceSpill956_65 = local0_life53;
    byte[] local4_life67 = ((javax.crypto.Cipher)(__sourceSpill956_65)).doFinal(((byte[])(__sourceSpill956_64)));
    m = ((long)((((((((((((long) (local4_life67)[0]) & 255L) << 56) | ((((long) (local4_life67)[1]) & 255L) << 48)) | ((((long) (local4_life67)[2]) & 255L) << 40)) | ((((long) (local4_life67)[3]) & 255L) << 32)) | ((((long) (local4_life67)[4]) & 255L) << 24)) | ((((long) (local4_life67)[5]) & 255L) << 16)) | ((((long) (local4_life67)[6]) & 255L) << 8)) | (((long) (local4_life67)[7]) & 255L))));
    f = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    g = ((moom.DD)(new moom.DD("textures/entity/banner_base.png")));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 3470;
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
            throw new RuntimeException("moom/or", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.or.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8611_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/or"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private moom.DD a(moom.Ca p0) {
long life2_3;
    java.lang.String life4_6;
    moom.om life5_16;
    long life6_29;
    java.util.Iterator life8_33;
    java.lang.String life9_40;
    moom.om life10_45;
    java.util.List life6_74;
    java.util.List life7_77;
    java.util.ArrayList life8_79;
    java.util.Iterator life9_82;
    moom.bq life10_89;
    forest_join_122: {
    forest_join_95: {
    forest_join_70: {
    forest_join_60: {
    forest_join_12: {
    life2_3 = (moom.or.i ^ 39387731850218L);
    life4_6 = ((moom.Ca)(p0)).a__String();
    if (!(((java.lang.String)(life4_6)).isEmpty())) {
        break forest_join_12;
    }
    return null;
    }
    life5_16 = ((moom.om)(((java.util.Map)(moom.or.f)).get(((java.lang.Object)(life4_6)))));
    if (!((life5_16 == null))) {
        break forest_join_122;
    }
    if (!((((java.util.Map)(moom.or.f)).size() >= __sourceIntrinsic_9a24bd2fcebb_invokedynamic913_8(23078, (1034344688863323748L ^ life2_3))))) {
        break forest_join_70;
    }
    life6_29 = java.lang.System.currentTimeMillis();
    life8_33 = ((java.util.Set)(((java.util.Map)(moom.or.f)).keySet())).iterator();
    forest_cycle_33: while (true) {
    forest_join_59: {
    if (!(((java.util.Iterator)(life8_33)).hasNext())) {
        break forest_join_60;
    }
    life9_40 = ((java.lang.String)(((java.util.Iterator)(life8_33)).next()));
    life10_45 = ((moom.om)(((java.util.Map)(moom.or.f)).get(((java.lang.Object)(life9_40)))));
    if (!((recovery.source.CarrierOps.lcmp(((long)((life6_29 - ((moom.om)(life10_45)).a))), ((long)(moom.or.m))) > 0))) {
        break forest_join_59;
    }
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__ok())).b(((moom.DD)(((moom.om)(life10_45)).b)));
    ((java.util.Iterator)(life8_33)).remove();
    }
    continue forest_cycle_33;
    }
    }
    if (!((((java.util.Map)(moom.or.f)).size() >= __sourceIntrinsic_9a24bd2fcebb_invokedynamic913_29(31985, (8465848863785484466L ^ life2_3))))) {
        break forest_join_70;
    }
    return null;
    }
    life6_74 = ((moom.Ca)(p0)).a__List();
    life7_77 = ((moom.Ca)(p0)).b();
    life8_79 = com.google.common.collect.Lists.newArrayList();
    life9_82 = ((java.util.List)(life6_74)).iterator();
    forest_cycle_81: while (true) {
    if (!(((java.util.Iterator)(life9_82)).hasNext())) {
        break forest_join_95;
    }
    life10_89 = ((moom.bq)(((java.util.Iterator)(life9_82)).next()));
    ((java.util.List)(life8_79)).add(((java.lang.Object)(__sourceIntrinsic_9a24bd2fcebb_invokedynamic913_38(((moom.bq)(life10_89)).a()))));
    continue forest_cycle_81;
    }
    }
    life5_16 = new moom.om();
    ((moom.om)(life5_16)).b = ((moom.DD)(new moom.DD(life4_6)));
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__ok())).a(((moom.DD)(((moom.om)(life5_16)).b)), ((net.minecraft.client.renderer.texture.ITextureObject)(new moom.n4(moom.or.g, life8_79, life7_77))));
    ((java.util.Map)(moom.or.f)).put(((java.lang.Object)(life4_6)), ((java.lang.Object)(life5_16)));
    }
    ((moom.om)(life5_16)).a = ((long)(java.lang.System.currentTimeMillis()));
    return ((moom.om)(life5_16)).b;
}


public void a(moom.Ca p0, double p1, double p2, double p3, float p4, int p5) {
int forwardValue3824_10_0;
    int forwardValue3824_20_0;
    int forwardValue3824_27_0;
    long forwardValue3824_35_0;
    long life10_3;
    int life12_12;
    int life13_27;
    int life14_36;
    long life15_46;
    float life17_49;
    float life18_77;
    float life18_91;
    moom.DT life18_139;
    float life19_172;
    moom.DD life20_193;
    forward_join_199: {
    forward_join_126: {
    forward_join_96: {
    forward_join_91: {
    forward_join_86: {
    forward_join_79: {
    forward_join_35: {
    forward_join_34: {
    forward_join_27: {
    forward_join_26: {
    forward_join_20: {
    forward_join_19: {
    forward_join_17: {
    forward_join_10: {
    forward_join_9: {
    life10_3 = (moom.or.i ^ 91246381989328L);
    if (!((((moom.Ca)(p0)).c__sourceInterfaceWorld() != null))) {
        break forward_join_9;
    }
    forwardValue3824_10_0 = 1;
    break forward_join_10;
    }
    forwardValue3824_10_0 = 0;
    }
    life12_12 = forwardValue3824_10_0;
    if (!((life12_12 != 0))) {
        break forward_join_17;
    }
    if (!((((moom.Ca)(p0)).a__ch() == net.minecraft.init.Blocks.co))) {
        break forward_join_19;
    }
    }
    forwardValue3824_20_0 = 1;
    break forward_join_20;
    }
    forwardValue3824_20_0 = 0;
    }
    life13_27 = forwardValue3824_20_0;
    if (!((life12_12 != 0))) {
        break forward_join_26;
    }
    forwardValue3824_27_0 = ((moom.Ca)(p0)).e();
    break forward_join_27;
    }
    forwardValue3824_27_0 = 0;
    }
    life14_36 = forwardValue3824_27_0;
    if (!((life12_12 != 0))) {
        break forward_join_34;
    }
    forwardValue3824_35_0 = ((net.minecraft.world.World)(((moom.Ca)(p0)).c__sourceInterfaceWorld())).b__Long();
    break forward_join_35;
    }
    forwardValue3824_35_0 = 0L;
    }
    life15_46 = forwardValue3824_35_0;
    moom.kZ.B();
    life17_49 = 0x1.555556p-1f;
    if (!((life13_27 != 0))) {
        break forward_join_79;
    }
    moom.kZ.b(((float)((((float) p1) + 0x1.0p-1f))), ((float)((((float) p2) + (0x1.8p-1f * life17_49)))), ((float)((((float) p3) + 0x1.0p-1f))));
    life18_77 = (((float) (life14_36 * __sourceIntrinsic_5734a4169b1f_invokedynamic3824_9(9812, (7411125356426384424L ^ life10_3)))) / 0x1.0p4f);
    moom.kZ.b(((float)((-life18_77))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    ((moom.jD)(((moom.iR)(this.h)).j)).n = ((boolean)(true));
    break forward_join_126;
    }
    life18_91 = 0x0.0p0f;
    if (!((life14_36 == 2))) {
        break forward_join_86;
    }
    life18_91 = 0x1.68p7f;
    }
    if (!((life14_36 == 4))) {
        break forward_join_91;
    }
    life18_91 = 0x1.68p6f;
    }
    if (!((life14_36 == 5))) {
        break forward_join_96;
    }
    life18_91 = -0x1.68p6f;
    }
    moom.kZ.b(((float)((((float) p1) + 0x1.0p-1f))), ((float)((((float) p2) - (0x1.0p-2f * life17_49)))), ((float)((((float) p3) + 0x1.0p-1f))));
    moom.kZ.b(((float)((-life18_91))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    moom.kZ.b(((float)(0x0.0p0f)), ((float)(-0x1.4p-2f)), ((float)(-0x1.cp-2f)));
    ((moom.jD)(((moom.iR)(this.h)).j)).n = ((boolean)(false));
    }
    life18_139 = ((moom.Ca)(p0)).a__DT();
    life19_172 = ((((float) (((((moom.DT)(life18_139)).a() * __sourceIntrinsic_5734a4169b1f_invokedynamic3824_22(7584, (6890926356142059485L ^ life10_3))) + (((moom.DT)(life18_139)).b() * __sourceIntrinsic_5734a4169b1f_invokedynamic3824_24(23380, (1395643163435346218L ^ life10_3)))) + (((moom.DT)(life18_139)).c() * __sourceIntrinsic_5734a4169b1f_invokedynamic3824_26(24737, (5313510831709524702L ^ life10_3))))) + ((float) life15_46)) + p4);
    ((moom.jD)(((moom.iR)(this.h)).i)).h = ((float)(((-0x1.99999ap-7f + (0x1.47ae14p-7f * moom.Dr.b(((float)(((life19_172 * 0x1.921fb6p1f) * 0x1.47ae14p-6f)))))) * 0x1.921fb6p1f)));
    moom.kZ.y();
    life20_193 = ((moom.or)(this)).a(((moom.Ca)(p0)));
    if (!((life20_193 != null))) {
        break forward_join_199;
    }
    ((moom.or)(this)).b(((moom.DD)(life20_193)));
    moom.kZ.B();
    moom.kZ.a(((float)(life17_49)), ((float)((-life17_49))), ((float)((-life17_49))));
    ((moom.iR)(this.h)).a();
    moom.kZ.C();
    }
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    moom.kZ.C();
    return;
}


public void a__sourceBridge_42179a2d44(net.minecraft.tileentity.TileEntity p0, double p1, double p2, double p3, float p4, int p5) {
((moom.or)(this)).a(((moom.Ca)(((moom.Ca)(p0)))), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((int)(p5)));
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8611_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9a24bd2fcebb_invokedynamic913_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9a24bd2fcebb_invokedynamic913_29(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9a24bd2fcebb_invokedynamic913_38(java.lang.String a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5734a4169b1f_invokedynamic3824_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5734a4169b1f_invokedynamic3824_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5734a4169b1f_invokedynamic3824_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5734a4169b1f_invokedynamic3824_26(int a0, long a1) throws E;


}
