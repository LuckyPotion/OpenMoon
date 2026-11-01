package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class os extends net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer<net.minecraft.tileentity.TileEntityBeacon> {

private static final moom.DD f;

private static final long g;

private static final long[] h;

private static final java.lang.Integer[] i;

private static final java.util.Map j;

public os() {
super();
}


static {
g = ((long)(((moom._a)(moom._c.a(((long)(3045751242547511222L)), ((long)(6085625791989867837L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(245041923460472L)))));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.os.g ^ 39864192535610L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1446_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1446_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1446_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1446_14 = new byte[8];
    (__sourceSpill1446_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1446_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1446_16 = __sourceSpill1446_14;
    ((javax.crypto.Cipher)(__sourceSpill1446_11)).init(((int)(__sourceSpill1446_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1446_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1446_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[10];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ð\177\026\006%\023Y­äåá±&2d\033CÖó²\"¹M²\013\004¿¥\177Ø\030H\fíO#\032º\034$ªv½¯ÀËÆ\023)«ý\fý?-¦jvd"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1446_25 = local6_life21;
        int __sourceSpill1446_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1446_25)).substring(((int)(__sourceSpill1446_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1446_30 = local8_life19;
        int __sourceSpill1446_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1446_33 = new byte[8];
        (__sourceSpill1446_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1446_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1446_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1446_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1446_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1446_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1446_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1446_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1446_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1446_34)).doFinal(((byte[])(__sourceSpill1446_33)));
        (__sourceSpill1446_30)[__sourceSpill1446_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "¦Û*òÃu4ëÔ9 ³­x"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1446_38 = local6_life21;
        int __sourceSpill1446_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1446_38)).substring(((int)(__sourceSpill1446_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1446_43 = local8_life19;
        int __sourceSpill1446_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1446_46 = new byte[8];
        (__sourceSpill1446_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1446_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1446_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1446_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1446_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1446_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1446_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1446_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1446_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1446_47)).doFinal(((byte[])(__sourceSpill1446_46)));
        (__sourceSpill1446_43)[__sourceSpill1446_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    h = ((long[])(local8_life19));
    i = ((java.lang.Integer[])(new java.lang.Integer[10]));
    f = ((moom.DD)(new moom.DD("textures/entity/beacon_beam.png")));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 31033;
      if (i[var3] == null) {
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
         long var5 = h[var3];
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
         Object[] var9 = (Object[])j.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               j.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/os", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         i[var3] = var15;
      }

      return i[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.os.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8614_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/os"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean a__Boolean() {
return ((1) != 0);
}


public void a(net.minecraft.tileentity.TileEntityBeacon p0, double p1, double p2, double p3, float p4, int p5) {
long life10_3;
    float life12_6;
    net.minecraft.client.renderer.Tessellator life13_33;
    moom.lw life14_36;
    java.util.List life15_40;
    int life16_42;
    java.util.Iterator life17_45;
    moom.Cv life18_52;
    int life19_58;
    double life20_106;
    double life22_119;
    float life24_124;
    float life25_129;
    float life26_134;
    double life27_140;
    double life29_142;
    double life31_151;
    double life33_160;
    double life35_169;
    double life37_178;
    double life39_187;
    double life41_196;
    double life43_205;
    double life45_214;
    double life47_216;
    double life49_218;
    double life51_222;
    double life53_233;
    double life27_597;
    double life29_599;
    double life31_601;
    double life33_603;
    double life35_605;
    double life37_607;
    double life39_609;
    double life41_611;
    double life43_613;
    double life45_615;
    double life47_619;
    double life49_628;
    life10_3 = (moom.os.g ^ 127710042424953L);
    life12_6 = ((net.minecraft.tileentity.TileEntityBeacon)(p0)).a__sourceReturn_bc607678b6();
    if ((recovery.source.CarrierOps.dcmpl(((double)(((double) life12_6))), ((double)(0x0.0p0d))) > 0)) {
        if (moom.BU.ap()) {
        moom.MP.aB();
    }
        moom.kZ.a(((int)(__sourceIntrinsic_25c452ca113c_invokedynamic3825_5(1674, (9042799249916937747L ^ life10_3)))), ((float)(0x1.99999ap-4f)));
        if ((recovery.source.CarrierOps.fcmpl(((float)(life12_6)), ((float)(0x0.0p0f))) > 0)) {
        life13_33 = net.minecraft.client.renderer.Tessellator.a();
        life14_36 = ((net.minecraft.client.renderer.Tessellator)(life13_33)).a__lw();
        moom.kZ.n();
        life15_40 = ((net.minecraft.tileentity.TileEntityBeacon)(p0)).a__List();
        life16_42 = 0;
        life17_45 = ((java.util.List)(life15_40)).iterator();
        loop_region_40: while (((java.util.Iterator)(life17_45)).hasNext()) {
        life18_52 = ((moom.Cv)(((java.util.Iterator)(life17_45)).next()));
        int spill3825_0 = 21540;
        life19_58 = (life16_42 + ((moom.Cv)(life18_52)).a());
        long spill3825_1 = (5056214558748906675L ^ life10_3);
        ((moom.os)(this)).b(((moom.DD)(moom.os.f)));
        org.lwjgl.opengl.GL11.glTexParameterf(((int)(__sourceIntrinsic_25c452ca113c_invokedynamic3825_19(spill3825_0, spill3825_1))), ((int)(__sourceIntrinsic_25c452ca113c_invokedynamic3825_20(1690, (1216460378118178312L ^ life10_3)))), ((float)(0x1.4808p13f)));
        org.lwjgl.opengl.GL11.glTexParameterf(((int)(__sourceIntrinsic_25c452ca113c_invokedynamic3825_22(3627, (6246289962647703219L ^ life10_3)))), ((int)(__sourceIntrinsic_25c452ca113c_invokedynamic3825_23(18831, (356215964601747740L ^ life10_3)))), ((float)(0x1.4808p13f)));
        int spill3825_2 = 25003;
        moom.kZ.f();
        long spill3825_3 = (3832694196360159547L ^ life10_3);
        moom.kZ.p();
        moom.kZ.k();
        moom.kZ.a(((boolean)(true)));
        moom.kZ.a(((int)(__sourceIntrinsic_25c452ca113c_invokedynamic3825_29(spill3825_2, spill3825_3))), ((int)(1)), ((int)(1)), ((int)(0)));
        life20_106 = (((double) ((net.minecraft.world.World)(((net.minecraft.tileentity.TileEntityBeacon)(p0)).c__sourceInterfaceWorld())).b__Long()) + ((double) p4));
        life22_119 = moom.Dr.b(((double)((((-life20_106) * 0x1.999999999999ap-3d) - ((double) moom.Dr.b__Int(((double)(((-life20_106) * 0x1.999999999999ap-4d)))))))));
        life24_124 = (((moom.Cv)(life18_52)).a__ArrayFloat())[0];
        life25_129 = (((moom.Cv)(life18_52)).a__ArrayFloat())[1];
        life26_134 = (((moom.Cv)(life18_52)).a__ArrayFloat())[2];
        life27_140 = ((life20_106 * 0x1.999999999999ap-6d) * -0x1.8p0d);
        life29_142 = 0x1.999999999999ap-3d;
        life31_151 = (0x1.0p-1d + (java.lang.Math.cos(((double)((life27_140 + 0x1.2d97c7f3321d2p1d)))) * 0x1.999999999999ap-3d));
        life33_160 = (0x1.0p-1d + (java.lang.Math.sin(((double)((life27_140 + 0x1.2d97c7f3321d2p1d)))) * 0x1.999999999999ap-3d));
        life35_169 = (0x1.0p-1d + (java.lang.Math.cos(((double)((life27_140 + 0x1.921fb54442d18p-1d)))) * 0x1.999999999999ap-3d));
        life37_178 = (0x1.0p-1d + (java.lang.Math.sin(((double)((life27_140 + 0x1.921fb54442d18p-1d)))) * 0x1.999999999999ap-3d));
        life39_187 = (0x1.0p-1d + (java.lang.Math.cos(((double)((life27_140 + 0x1.f6a7a2955385ep1d)))) * 0x1.999999999999ap-3d));
        life41_196 = (0x1.0p-1d + (java.lang.Math.sin(((double)((life27_140 + 0x1.f6a7a2955385ep1d)))) * 0x1.999999999999ap-3d));
        life43_205 = (0x1.0p-1d + (java.lang.Math.cos(((double)((life27_140 + 0x1.5fdbbe9bba775p2d)))) * 0x1.999999999999ap-3d));
        life45_214 = (0x1.0p-1d + (java.lang.Math.sin(((double)((life27_140 + 0x1.5fdbbe9bba775p2d)))) * 0x1.999999999999ap-3d));
        life47_216 = 0x0.0p0d;
        life49_218 = 0x1.0p0d;
        life51_222 = (-0x1.0p0d + life22_119);
        life53_233 = ((((double) (((float) ((moom.Cv)(life18_52)).a()) * life12_6)) * 0x1.4p1d) + life51_222);
        ((moom.lw)(life14_36)).a(((int)(__sourceIntrinsic_25c452ca113c_invokedynamic3825_47(15512, (1428189836105120780L ^ life10_3)))), ((moom.oD)(moom.oB.k)));
        int spill3825_4 = 11711;
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life14_36)).a(((double)((p1 + life31_151))), ((double)((p2 + ((double) life19_58)))), ((double)((p3 + life33_160)))))).a(((double)(0x1.0p0d)), ((double)(life53_233))))).a(((float)(life24_124)), ((float)(life25_129)), ((float)(life26_134)), ((float)(0x1.0p0f))))).c__Void();
        long spill3825_5 = (4379253373978864942L ^ life10_3);
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life14_36)).a(((double)((p1 + life31_151))), ((double)((p2 + ((double) life16_42)))), ((double)((p3 + life33_160)))))).a(((double)(0x1.0p0d)), ((double)(life51_222))))).a(((float)(life24_124)), ((float)(life25_129)), ((float)(life26_134)), ((float)(0x1.0p0f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life14_36)).a(((double)((p1 + life35_169))), ((double)((p2 + ((double) life16_42)))), ((double)((p3 + life37_178)))))).a(((double)(0x0.0p0d)), ((double)(life51_222))))).a(((float)(life24_124)), ((float)(life25_129)), ((float)(life26_134)), ((float)(0x1.0p0f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life14_36)).a(((double)((p1 + life35_169))), ((double)((p2 + ((double) life19_58)))), ((double)((p3 + life37_178)))))).a(((double)(0x0.0p0d)), ((double)(life53_233))))).a(((float)(life24_124)), ((float)(life25_129)), ((float)(life26_134)), ((float)(0x1.0p0f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life14_36)).a(((double)((p1 + life43_205))), ((double)((p2 + ((double) life19_58)))), ((double)((p3 + life45_214)))))).a(((double)(0x1.0p0d)), ((double)(life53_233))))).a(((float)(life24_124)), ((float)(life25_129)), ((float)(life26_134)), ((float)(0x1.0p0f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life14_36)).a(((double)((p1 + life43_205))), ((double)((p2 + ((double) life16_42)))), ((double)((p3 + life45_214)))))).a(((double)(0x1.0p0d)), ((double)(life51_222))))).a(((float)(life24_124)), ((float)(life25_129)), ((float)(life26_134)), ((float)(0x1.0p0f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life14_36)).a(((double)((p1 + life39_187))), ((double)((p2 + ((double) life16_42)))), ((double)((p3 + life41_196)))))).a(((double)(0x0.0p0d)), ((double)(life51_222))))).a(((float)(life24_124)), ((float)(life25_129)), ((float)(life26_134)), ((float)(0x1.0p0f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life14_36)).a(((double)((p1 + life39_187))), ((double)((p2 + ((double) life19_58)))), ((double)((p3 + life41_196)))))).a(((double)(0x0.0p0d)), ((double)(life53_233))))).a(((float)(life24_124)), ((float)(life25_129)), ((float)(life26_134)), ((float)(0x1.0p0f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life14_36)).a(((double)((p1 + life35_169))), ((double)((p2 + ((double) life19_58)))), ((double)((p3 + life37_178)))))).a(((double)(0x1.0p0d)), ((double)(life53_233))))).a(((float)(life24_124)), ((float)(life25_129)), ((float)(life26_134)), ((float)(0x1.0p0f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life14_36)).a(((double)((p1 + life35_169))), ((double)((p2 + ((double) life16_42)))), ((double)((p3 + life37_178)))))).a(((double)(0x1.0p0d)), ((double)(life51_222))))).a(((float)(life24_124)), ((float)(life25_129)), ((float)(life26_134)), ((float)(0x1.0p0f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life14_36)).a(((double)((p1 + life43_205))), ((double)((p2 + ((double) life16_42)))), ((double)((p3 + life45_214)))))).a(((double)(0x0.0p0d)), ((double)(life51_222))))).a(((float)(life24_124)), ((float)(life25_129)), ((float)(life26_134)), ((float)(0x1.0p0f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life14_36)).a(((double)((p1 + life43_205))), ((double)((p2 + ((double) life19_58)))), ((double)((p3 + life45_214)))))).a(((double)(0x0.0p0d)), ((double)(life53_233))))).a(((float)(life24_124)), ((float)(life25_129)), ((float)(life26_134)), ((float)(0x1.0p0f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life14_36)).a(((double)((p1 + life39_187))), ((double)((p2 + ((double) life19_58)))), ((double)((p3 + life41_196)))))).a(((double)(0x1.0p0d)), ((double)(life53_233))))).a(((float)(life24_124)), ((float)(life25_129)), ((float)(life26_134)), ((float)(0x1.0p0f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life14_36)).a(((double)((p1 + life39_187))), ((double)((p2 + ((double) life16_42)))), ((double)((p3 + life41_196)))))).a(((double)(0x1.0p0d)), ((double)(life51_222))))).a(((float)(life24_124)), ((float)(life25_129)), ((float)(life26_134)), ((float)(0x1.0p0f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life14_36)).a(((double)((p1 + life31_151))), ((double)((p2 + ((double) life16_42)))), ((double)((p3 + life33_160)))))).a(((double)(0x0.0p0d)), ((double)(life51_222))))).a(((float)(life24_124)), ((float)(life25_129)), ((float)(life26_134)), ((float)(0x1.0p0f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life14_36)).a(((double)((p1 + life31_151))), ((double)((p2 + ((double) life19_58)))), ((double)((p3 + life33_160)))))).a(((double)(0x0.0p0d)), ((double)(life53_233))))).a(((float)(life24_124)), ((float)(life25_129)), ((float)(life26_134)), ((float)(0x1.0p0f))))).c__Void();
        ((net.minecraft.client.renderer.Tessellator)(life13_33)).a__Void();
        moom.kZ.l();
        moom.kZ.a(((int)(__sourceIntrinsic_25c452ca113c_invokedynamic3825_116(spill3825_4, spill3825_5))), ((int)(__sourceIntrinsic_25c452ca113c_invokedynamic3825_117(2931, (2854292626828217318L ^ life10_3)))), ((int)(1)), ((int)(0)));
        moom.kZ.a(((boolean)(false)));
        life27_597 = 0x1.999999999999ap-3d;
        life29_599 = 0x1.999999999999ap-3d;
        life31_601 = 0x1.999999999999ap-1d;
        life33_603 = 0x1.999999999999ap-3d;
        life35_605 = 0x1.999999999999ap-3d;
        life37_607 = 0x1.999999999999ap-1d;
        life39_609 = 0x1.999999999999ap-1d;
        life41_611 = 0x1.999999999999ap-1d;
        life43_613 = 0x0.0p0d;
        life45_615 = 0x1.0p0d;
        life47_619 = (-0x1.0p0d + life22_119);
        life49_628 = (((double) (((float) ((moom.Cv)(life18_52)).a()) * life12_6)) + life47_619);
        ((moom.lw)(life14_36)).a(((int)(__sourceIntrinsic_25c452ca113c_invokedynamic3825_121(30069, (8335328229230949859L ^ life10_3)))), ((moom.oD)(moom.oB.k)));
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life14_36)).a(((double)((p1 + 0x1.999999999999ap-3d))), ((double)((p2 + ((double) life19_58)))), ((double)((p3 + 0x1.999999999999ap-3d)))))).a(((double)(0x1.0p0d)), ((double)(life49_628))))).a(((float)(life24_124)), ((float)(life25_129)), ((float)(life26_134)), ((float)(0x1.0p-3f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life14_36)).a(((double)((p1 + 0x1.999999999999ap-3d))), ((double)((p2 + ((double) life16_42)))), ((double)((p3 + 0x1.999999999999ap-3d)))))).a(((double)(0x1.0p0d)), ((double)(life47_619))))).a(((float)(life24_124)), ((float)(life25_129)), ((float)(life26_134)), ((float)(0x1.0p-3f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life14_36)).a(((double)((p1 + 0x1.999999999999ap-1d))), ((double)((p2 + ((double) life16_42)))), ((double)((p3 + 0x1.999999999999ap-3d)))))).a(((double)(0x0.0p0d)), ((double)(life47_619))))).a(((float)(life24_124)), ((float)(life25_129)), ((float)(life26_134)), ((float)(0x1.0p-3f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life14_36)).a(((double)((p1 + 0x1.999999999999ap-1d))), ((double)((p2 + ((double) life19_58)))), ((double)((p3 + 0x1.999999999999ap-3d)))))).a(((double)(0x0.0p0d)), ((double)(life49_628))))).a(((float)(life24_124)), ((float)(life25_129)), ((float)(life26_134)), ((float)(0x1.0p-3f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life14_36)).a(((double)((p1 + 0x1.999999999999ap-1d))), ((double)((p2 + ((double) life19_58)))), ((double)((p3 + 0x1.999999999999ap-1d)))))).a(((double)(0x1.0p0d)), ((double)(life49_628))))).a(((float)(life24_124)), ((float)(life25_129)), ((float)(life26_134)), ((float)(0x1.0p-3f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life14_36)).a(((double)((p1 + 0x1.999999999999ap-1d))), ((double)((p2 + ((double) life16_42)))), ((double)((p3 + 0x1.999999999999ap-1d)))))).a(((double)(0x1.0p0d)), ((double)(life47_619))))).a(((float)(life24_124)), ((float)(life25_129)), ((float)(life26_134)), ((float)(0x1.0p-3f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life14_36)).a(((double)((p1 + 0x1.999999999999ap-3d))), ((double)((p2 + ((double) life16_42)))), ((double)((p3 + 0x1.999999999999ap-1d)))))).a(((double)(0x0.0p0d)), ((double)(life47_619))))).a(((float)(life24_124)), ((float)(life25_129)), ((float)(life26_134)), ((float)(0x1.0p-3f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life14_36)).a(((double)((p1 + 0x1.999999999999ap-3d))), ((double)((p2 + ((double) life19_58)))), ((double)((p3 + 0x1.999999999999ap-1d)))))).a(((double)(0x0.0p0d)), ((double)(life49_628))))).a(((float)(life24_124)), ((float)(life25_129)), ((float)(life26_134)), ((float)(0x1.0p-3f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life14_36)).a(((double)((p1 + 0x1.999999999999ap-1d))), ((double)((p2 + ((double) life19_58)))), ((double)((p3 + 0x1.999999999999ap-3d)))))).a(((double)(0x1.0p0d)), ((double)(life49_628))))).a(((float)(life24_124)), ((float)(life25_129)), ((float)(life26_134)), ((float)(0x1.0p-3f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life14_36)).a(((double)((p1 + 0x1.999999999999ap-1d))), ((double)((p2 + ((double) life16_42)))), ((double)((p3 + 0x1.999999999999ap-3d)))))).a(((double)(0x1.0p0d)), ((double)(life47_619))))).a(((float)(life24_124)), ((float)(life25_129)), ((float)(life26_134)), ((float)(0x1.0p-3f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life14_36)).a(((double)((p1 + 0x1.999999999999ap-1d))), ((double)((p2 + ((double) life16_42)))), ((double)((p3 + 0x1.999999999999ap-1d)))))).a(((double)(0x0.0p0d)), ((double)(life47_619))))).a(((float)(life24_124)), ((float)(life25_129)), ((float)(life26_134)), ((float)(0x1.0p-3f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life14_36)).a(((double)((p1 + 0x1.999999999999ap-1d))), ((double)((p2 + ((double) life19_58)))), ((double)((p3 + 0x1.999999999999ap-1d)))))).a(((double)(0x0.0p0d)), ((double)(life49_628))))).a(((float)(life24_124)), ((float)(life25_129)), ((float)(life26_134)), ((float)(0x1.0p-3f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life14_36)).a(((double)((p1 + 0x1.999999999999ap-3d))), ((double)((p2 + ((double) life19_58)))), ((double)((p3 + 0x1.999999999999ap-1d)))))).a(((double)(0x1.0p0d)), ((double)(life49_628))))).a(((float)(life24_124)), ((float)(life25_129)), ((float)(life26_134)), ((float)(0x1.0p-3f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life14_36)).a(((double)((p1 + 0x1.999999999999ap-3d))), ((double)((p2 + ((double) life16_42)))), ((double)((p3 + 0x1.999999999999ap-1d)))))).a(((double)(0x1.0p0d)), ((double)(life47_619))))).a(((float)(life24_124)), ((float)(life25_129)), ((float)(life26_134)), ((float)(0x1.0p-3f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life14_36)).a(((double)((p1 + 0x1.999999999999ap-3d))), ((double)((p2 + ((double) life16_42)))), ((double)((p3 + 0x1.999999999999ap-3d)))))).a(((double)(0x0.0p0d)), ((double)(life47_619))))).a(((float)(life24_124)), ((float)(life25_129)), ((float)(life26_134)), ((float)(0x1.0p-3f))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life14_36)).a(((double)((p1 + 0x1.999999999999ap-3d))), ((double)((p2 + ((double) life19_58)))), ((double)((p3 + 0x1.999999999999ap-3d)))))).a(((double)(0x0.0p0d)), ((double)(life49_628))))).a(((float)(life24_124)), ((float)(life25_129)), ((float)(life26_134)), ((float)(0x1.0p-3f))))).c__Void();
        ((net.minecraft.client.renderer.Tessellator)(life13_33)).a__Void();
        moom.kZ.e();
        moom.kZ.u();
        moom.kZ.a(((boolean)(true)));
        life16_42 = life19_58;
    }
        moom.kZ.m();
    }
        if (moom.BU.ap()) {
        moom.MP.aC();
    }
    }
    return;
}


public void a__sourceBridge_42179a2d44(net.minecraft.tileentity.TileEntity p0, double p1, double p2, double p3, float p4, int p5) {
((moom.os)(this)).a(((net.minecraft.tileentity.TileEntityBeacon)(((net.minecraft.tileentity.TileEntityBeacon)(p0)))), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((int)(p5)));
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8614_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_25c452ca113c_invokedynamic3825_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_25c452ca113c_invokedynamic3825_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_25c452ca113c_invokedynamic3825_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_25c452ca113c_invokedynamic3825_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_25c452ca113c_invokedynamic3825_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_25c452ca113c_invokedynamic3825_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_25c452ca113c_invokedynamic3825_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_25c452ca113c_invokedynamic3825_116(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_25c452ca113c_invokedynamic3825_117(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_25c452ca113c_invokedynamic3825_121(int a0, long a1) throws E;


}
