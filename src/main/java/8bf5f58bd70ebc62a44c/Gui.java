package net.minecraft.client.gui;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Gui {

public static final moom.DD a;

public static final moom.DD b;

public static final moom.DD c;

protected float d;

private static java.lang.String e;

private static final long bb;

private static final long[] gb;

private static final java.lang.Integer[] hb;

private static final java.util.Map ib;

public Gui() {
super();
}


static {
bb = ((long)(((moom._a)(moom._c.a(((long)(-1155020142832938139L)), ((long)(6642184600432314737L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(10491040659446L)))));
    java.lang.Object __sourceSpill1766_6 = null;
    ib = ((java.util.Map)(new java.util.HashMap(13)));
    net.minecraft.client.gui.Gui.d(((java.lang.String)(__sourceSpill1766_6)));
    long local0_life9 = (net.minecraft.client.gui.Gui.bb ^ 51465284095939L);
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill1766_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1766_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1766_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1766_16 = new byte[8];
    (__sourceSpill1766_16)[0] = ((byte) ((int) (local0_life9 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill1766_16)[local3_life17] = ((byte) ((int) ((local0_life9 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation1766_18 = __sourceSpill1766_16;
    ((javax.crypto.Cipher)(__sourceSpill1766_13)).init(((int)(__sourceSpill1766_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1766_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1766_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[16];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "(¡¦qiI\f\033\næ@<í3\r®>kÎ\031\t\000¾B4¹²aÝ\013ÞS8\t\037B6r-® ÜÂú¨¶4\tÀ\f²ð\\¼­¨Ü\\/ØrúÜK$oÍ,ªù\022Fµ²E&Å8>\007VêAmÀð}8ÂV»¯vÀ-»\023½£ç\016þ"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1766_27 = local6_life23;
        int __sourceSpill1766_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1766_27)).substring(((int)(__sourceSpill1766_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1766_32 = local8_life21;
        int __sourceSpill1766_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill1766_35 = new byte[8];
        (__sourceSpill1766_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill1766_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill1766_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill1766_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill1766_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill1766_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill1766_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill1766_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill1766_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill1766_36)).doFinal(((byte[])(__sourceSpill1766_35)));
        (__sourceSpill1766_32)[__sourceSpill1766_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    local7_life25 = ((java.lang.String)((local6_life23 = "ßwÍÛ*¨Ì²6Å¦(Ð^"))).length();
    local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1766_40 = local6_life23;
        int __sourceSpill1766_41 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill1766_40)).substring(((int)(__sourceSpill1766_41)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1766_45 = local8_life21;
        int __sourceSpill1766_46 = local5_life22;
        local5_life22 += 1;
        long local10_life47 = (((((((((((long) (local9_life44)[0]) & 255L) << 56) | ((((long) (local9_life44)[1]) & 255L) << 48)) | ((((long) (local9_life44)[2]) & 255L) << 40)) | ((((long) (local9_life44)[3]) & 255L) << 32)) | ((((long) (local9_life44)[4]) & 255L) << 24)) | ((((long) (local9_life44)[5]) & 255L) << 16)) | ((((long) (local9_life44)[6]) & 255L) << 8)) | (((long) (local9_life44)[7]) & 255L));
        byte[] __sourceSpill1766_48 = new byte[8];
        (__sourceSpill1766_48)[0] = ((byte) ((int) (local10_life47 >>> 56)));
        (__sourceSpill1766_48)[1] = ((byte) ((int) (local10_life47 >>> 48)));
        (__sourceSpill1766_48)[2] = ((byte) ((int) (local10_life47 >>> 40)));
        (__sourceSpill1766_48)[3] = ((byte) ((int) (local10_life47 >>> 32)));
        (__sourceSpill1766_48)[4] = ((byte) ((int) (local10_life47 >>> 24)));
        (__sourceSpill1766_48)[5] = ((byte) ((int) (local10_life47 >>> 16)));
        (__sourceSpill1766_48)[6] = ((byte) ((int) (local10_life47 >>> 8)));
        (__sourceSpill1766_48)[7] = ((byte) ((int) local10_life47));
        javax.crypto.Cipher __sourceSpill1766_49 = local2_life11;
        byte[] local12_life51 = ((javax.crypto.Cipher)(__sourceSpill1766_49)).doFinal(((byte[])(__sourceSpill1766_48)));
        (__sourceSpill1766_45)[__sourceSpill1766_46] = (((((((((((long) (local12_life51)[0]) & 255L) << 56) | ((((long) (local12_life51)[1]) & 255L) << 48)) | ((((long) (local12_life51)[2]) & 255L) << 40)) | ((((long) (local12_life51)[3]) & 255L) << 32)) | ((((long) (local12_life51)[4]) & 255L) << 24)) | ((((long) (local12_life51)[5]) & 255L) << 16)) | ((((long) (local12_life51)[6]) & 255L) << 8)) | (((long) (local12_life51)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    gb = ((long[])(local8_life21));
    hb = ((java.lang.Integer[])(new java.lang.Integer[16]));
    a = ((moom.DD)(new moom.DD("textures/gui/options_background.png")));
    b = ((moom.DD)(new moom.DD("textures/gui/container/stats_icons.png")));
    c = ((moom.DD)(new moom.DD("textures/gui/icons.png")));
}


public void b(int p0, int p1, int p2, int p3, int p4, int p5) {
long local7 = (net.minecraft.client.gui.Gui.bb ^ 43475760492373L);
    float local9 = 0x1.0p-8f;
    float local10 = 0x1.0p-8f;
    net.minecraft.client.renderer.Tessellator local11 = net.minecraft.client.renderer.Tessellator.a();
    moom.lw local12 = ((net.minecraft.client.renderer.Tessellator)(local11)).a__lw();
    ((moom.lw)(local12)).a(((int)(__sourceIntrinsic_7c66de3d9a8d_originalDynamicSite1768_3(19644, (8748126750783377905L ^ local7)))), ((moom.oD)(moom.oB.i)));
    ((moom.lw)(((moom.lw)(((moom.lw)(local12)).a(((double)(((double) p0))), ((double)(((double) (p1 + p5)))), ((double)(((double) this.d)))))).a(((double)(((double) (((float) p2) * local9)))), ((double)(((double) (((float) (p3 + p5)) * local10))))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local12)).a(((double)(((double) (p0 + p4)))), ((double)(((double) (p1 + p5)))), ((double)(((double) this.d)))))).a(((double)(((double) (((float) (p2 + p4)) * local9)))), ((double)(((double) (((float) (p3 + p5)) * local10))))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local12)).a(((double)(((double) (p0 + p4)))), ((double)(((double) p1))), ((double)(((double) this.d)))))).a(((double)(((double) (((float) (p2 + p4)) * local9)))), ((double)(((double) (((float) p3) * local10))))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local12)).a(((double)(((double) p0))), ((double)(((double) p1))), ((double)(((double) this.d)))))).a(((double)(((double) (((float) p2) * local9)))), ((double)(((double) (((float) p3) * local10))))))).c__Void();
    ((net.minecraft.client.renderer.Tessellator)(local11)).a__Void();
    return;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral10211_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/gb"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static java.lang.String b__StringStatic() {
return net.minecraft.client.gui.Gui.e;
}


private static int b(int p0, long p1) {
int index = p0 ^ (int)(p1 & 32767L) ^ 30966;
      if (hb[index] == null) {
         byte[] keyBytes = new byte[]{
            (byte)(p1 >>> 56),
            (byte)(p1 >>> 48),
            (byte)(p1 >>> 40),
            (byte)(p1 >>> 32),
            (byte)(p1 >>> 24),
            (byte)(p1 >>> 16),
            (byte)(p1 >>> 8),
            (byte)p1
         };
         long encryptedValue = gb[index];
         byte[] encryptedBytes = new byte[]{
            (byte)(encryptedValue >>> 56),
            (byte)(encryptedValue >>> 48),
            (byte)(encryptedValue >>> 40),
            (byte)(encryptedValue >>> 32),
            (byte)(encryptedValue >>> 24),
            (byte)(encryptedValue >>> 16),
            (byte)(encryptedValue >>> 8),
            (byte)encryptedValue
         };
         Long threadId = Thread.currentThread().getId();
         Object[] cipherState = (Object[])ib.get(threadId);

         byte[] decryptedBytes;
         try {
            if (cipherState == null) {
               cipherState = new Object[3];
cipherState[0] = Cipher.getInstance("DES/CBC/NoPadding");
cipherState[1] = SecretKeyFactory.getInstance("DES");
cipherState[2] = new IvParameterSpec(new byte[8]);
               ib.put(threadId, cipherState);
            }

            DESKeySpec keySpec = new DESKeySpec(keyBytes);
            SecretKey secretKey = ((SecretKeyFactory)cipherState[1]).generateSecret(keySpec);
            Cipher cipher = (Cipher)cipherState[0];
            cipher.init(2, secretKey, (IvParameterSpec)cipherState[2]);
            decryptedBytes = cipher.doFinal(encryptedBytes);
         } catch (Exception exception) {
            throw new RuntimeException("moom/gb", exception);
         }

         int decodedValue = (decryptedBytes[4] & 255) << 24 | (decryptedBytes[5] & 255) << 16 | (decryptedBytes[6] & 255) << 8 | decryptedBytes[7] & 255;
         hb[index] = decodedValue;
      }

      return hb[index];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.gui.Gui.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


protected void b(int p0, int p1, int p2, int p3) {
int life5_4;
    if ((p2 < p1)) {
        life5_4 = p1;
        p1 = p2;
        p2 = life5_4;
    }
    net.minecraft.client.gui.Gui.a(((int)(p0)), ((int)((p1 + 1))), ((int)((p0 + 1))), ((int)(p2)), ((int)(p3)));
    return;
}


public void b(net.minecraft.client.gui.FontRenderer p0, java.lang.String p1, int p2, int p3, int p4) {
((net.minecraft.client.gui.FontRenderer)(p0)).a(((java.lang.String)(p1)), ((float)(((float) p2))), ((float)(((float) p3))), ((int)(p4)));
    return;
}


public static void d(java.lang.String p0) {
net.minecraft.client.gui.Gui.e = ((java.lang.String)(p0));
    return;
}


protected void a(int p0, int p1, int p2, int p3) {
int life5_4;
    if ((p1 < p0)) {
        life5_4 = p0;
        p0 = p1;
        p1 = life5_4;
    }
    net.minecraft.client.gui.Gui.a(((int)(p0)), ((int)(p2)), ((int)((p1 + 1))), ((int)((p2 + 1))), ((int)(p3)));
    return;
}


public static void a(int p0, int p1, int p2, int p3, int p4) {
long life5_3;
    int life7_8;
    int life7_17;
    float life7_38;
    float life8_55;
    float life9_72;
    float life10_83;
    net.minecraft.client.renderer.Tessellator life11_86;
    moom.lw life12_92;
    life5_3 = (net.minecraft.client.gui.Gui.bb ^ 135265863704276L);
    if ((p0 < p2)) {
        life7_8 = p0;
        p0 = p2;
        p2 = life7_8;
    }
    if ((p1 < p3)) {
        life7_17 = p1;
        p1 = p3;
        p3 = life7_17;
    }
    life7_38 = (((float) ((p4 >> __sourceIntrinsic_07e30838a528_invokedynamic8338_1(3161, (4500958610871050393L ^ life5_3))) & __sourceIntrinsic_07e30838a528_invokedynamic8338_2(30778, (2096419427475625213L ^ life5_3)))) / 0x1.fep7f);
    life8_55 = (((float) ((p4 >> __sourceIntrinsic_07e30838a528_invokedynamic8338_3(6089, (6424600373531835137L ^ life5_3))) & __sourceIntrinsic_07e30838a528_invokedynamic8338_4(20333, (7638836304092210088L ^ life5_3)))) / 0x1.fep7f);
    life9_72 = (((float) ((p4 >> __sourceIntrinsic_07e30838a528_invokedynamic8338_5(2467, (6338947476089169260L ^ life5_3))) & __sourceIntrinsic_07e30838a528_invokedynamic8338_6(20333, (7638836304092210088L ^ life5_3)))) / 0x1.fep7f);
    life10_83 = (((float) (p4 & __sourceIntrinsic_07e30838a528_invokedynamic8338_7(20333, (7638836304092210088L ^ life5_3)))) / 0x1.fep7f);
    int spill8338_0 = 23688;
    life11_86 = net.minecraft.client.renderer.Tessellator.a();
    long spill8338_1 = (2302529921582215238L ^ life5_3);
    life12_92 = ((net.minecraft.client.renderer.Tessellator)(life11_86)).a__lw();
    moom.kZ.l();
    moom.kZ.v();
    moom.kZ.a(((int)(__sourceIntrinsic_07e30838a528_invokedynamic8338_12(spill8338_0, spill8338_1))), ((int)(__sourceIntrinsic_07e30838a528_invokedynamic8338_13(20111, (5146956458905150028L ^ life5_3)))), ((int)(1)), ((int)(0)));
    moom.kZ.c(((float)(life8_55)), ((float)(life9_72)), ((float)(life10_83)), ((float)(life7_38)));
    ((moom.lw)(life12_92)).a(((int)(__sourceIntrinsic_07e30838a528_invokedynamic8338_16(19644, (8748183324822478960L ^ life5_3)))), ((moom.oD)(moom.oB.g)));
    ((moom.lw)(((moom.lw)(life12_92)).a(((double)(((double) p0))), ((double)(((double) p3))), ((double)(0x0.0p0d))))).c__Void();
    ((moom.lw)(((moom.lw)(life12_92)).a(((double)(((double) p2))), ((double)(((double) p3))), ((double)(0x0.0p0d))))).c__Void();
    ((moom.lw)(((moom.lw)(life12_92)).a(((double)(((double) p2))), ((double)(((double) p1))), ((double)(0x0.0p0d))))).c__Void();
    ((moom.lw)(((moom.lw)(life12_92)).a(((double)(((double) p0))), ((double)(((double) p1))), ((double)(0x0.0p0d))))).c__Void();
    ((net.minecraft.client.renderer.Tessellator)(life11_86)).a__Void();
    moom.kZ.u();
    moom.kZ.k();
    return;
}


public void a(int p0, int p1, net.minecraft.client.renderer.texture.TextureAtlasSprite p2, int p3, int p4) {
long local6 = (net.minecraft.client.gui.Gui.bb ^ 80514870037862L);
    net.minecraft.client.renderer.Tessellator local8 = net.minecraft.client.renderer.Tessellator.a();
    moom.lw local9 = ((net.minecraft.client.renderer.Tessellator)(local8)).a__lw();
    ((moom.lw)(local9)).a(((int)(__sourceIntrinsic_fbe41641ec91_originalDynamicSite1769_3(19644, (8748233884068606914L ^ local6)))), ((moom.oD)(moom.oB.i)));
    ((moom.lw)(((moom.lw)(((moom.lw)(local9)).a(((double)(((double) p0))), ((double)(((double) (p1 + p4)))), ((double)(((double) this.d)))))).a(((double)(((double) ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p2)).a()))), ((double)(((double) ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p2)).d())))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local9)).a(((double)(((double) (p0 + p3)))), ((double)(((double) (p1 + p4)))), ((double)(((double) this.d)))))).a(((double)(((double) ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p2)).b()))), ((double)(((double) ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p2)).d())))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local9)).a(((double)(((double) (p0 + p3)))), ((double)(((double) p1))), ((double)(((double) this.d)))))).a(((double)(((double) ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p2)).b()))), ((double)(((double) ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p2)).c())))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local9)).a(((double)(((double) p0))), ((double)(((double) p1))), ((double)(((double) this.d)))))).a(((double)(((double) ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p2)).a()))), ((double)(((double) ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p2)).c())))))).c__Void();
    ((net.minecraft.client.renderer.Tessellator)(local8)).a__Void();
    return;
}


public void a(float p0, float p1, int p2, int p3, int p4, int p5) {
long local7 = (net.minecraft.client.gui.Gui.bb ^ 47281311180796L);
    float local9 = 0x1.0p-8f;
    float local10 = 0x1.0p-8f;
    net.minecraft.client.renderer.Tessellator local11 = net.minecraft.client.renderer.Tessellator.a();
    moom.lw local12 = ((net.minecraft.client.renderer.Tessellator)(local11)).a__lw();
    ((moom.lw)(local12)).a(((int)(__sourceIntrinsic_8b99a347d6dd_originalDynamicSite1770_3(19644, (8748130559001778520L ^ local7)))), ((moom.oD)(moom.oB.i)));
    ((moom.lw)(((moom.lw)(((moom.lw)(local12)).a(((double)(((double) (p0 + 0x0.0p0f)))), ((double)(((double) (p1 + ((float) p5))))), ((double)(((double) this.d)))))).a(((double)(((double) (((float) p2) * local9)))), ((double)(((double) (((float) (p3 + p5)) * local10))))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local12)).a(((double)(((double) (p0 + ((float) p4))))), ((double)(((double) (p1 + ((float) p5))))), ((double)(((double) this.d)))))).a(((double)(((double) (((float) (p2 + p4)) * local9)))), ((double)(((double) (((float) (p3 + p5)) * local10))))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local12)).a(((double)(((double) (p0 + ((float) p4))))), ((double)(((double) (p1 + 0x0.0p0f)))), ((double)(((double) this.d)))))).a(((double)(((double) (((float) (p2 + p4)) * local9)))), ((double)(((double) (((float) p3) * local10))))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local12)).a(((double)(((double) (p0 + 0x0.0p0f)))), ((double)(((double) (p1 + 0x0.0p0f)))), ((double)(((double) this.d)))))).a(((double)(((double) (((float) p2) * local9)))), ((double)(((double) (((float) p3) * local10))))))).c__Void();
    ((net.minecraft.client.renderer.Tessellator)(local11)).a__Void();
    return;
}


public void a(net.minecraft.client.gui.FontRenderer p0, java.lang.String p1, int p2, int p3, int p4) {
((net.minecraft.client.gui.FontRenderer)(p0)).a(((java.lang.String)(p1)), ((float)(((float) (p2 - (((net.minecraft.client.gui.FontRenderer)(p0)).a(((java.lang.String)(p1))) / 2))))), ((float)(((float) p3))), ((int)(p4)));
    return;
}


public static void a(int p0, int p1, float p2, float p3, int p4, int p5, float p6, float p7) {
long local8 = (net.minecraft.client.gui.Gui.bb ^ 39679148224547L);
    float local10 = (0x1.0p0f / p6);
    float local11 = (0x1.0p0f / p7);
    net.minecraft.client.renderer.Tessellator local12 = net.minecraft.client.renderer.Tessellator.a();
    moom.lw local13 = ((net.minecraft.client.renderer.Tessellator)(local12)).a__lw();
    ((moom.lw)(local13)).a(((int)(__sourceIntrinsic_8e889b14f355_originalDynamicSite1771_3(3154, (122449949270511201L ^ local8)))), ((moom.oD)(moom.oB.i)));
    ((moom.lw)(((moom.lw)(((moom.lw)(local13)).a(((double)(((double) p0))), ((double)(((double) (p1 + p5)))), ((double)(0x0.0p0d))))).a(((double)(((double) (p2 * local10)))), ((double)(((double) ((p3 + ((float) p5)) * local11))))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local13)).a(((double)(((double) (p0 + p4)))), ((double)(((double) (p1 + p5)))), ((double)(0x0.0p0d))))).a(((double)(((double) ((p2 + ((float) p4)) * local10)))), ((double)(((double) ((p3 + ((float) p5)) * local11))))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local13)).a(((double)(((double) (p0 + p4)))), ((double)(((double) p1))), ((double)(0x0.0p0d))))).a(((double)(((double) ((p2 + ((float) p4)) * local10)))), ((double)(((double) (p3 * local11))))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local13)).a(((double)(((double) p0))), ((double)(((double) p1))), ((double)(0x0.0p0d))))).a(((double)(((double) (p2 * local10)))), ((double)(((double) (p3 * local11))))))).c__Void();
    ((net.minecraft.client.renderer.Tessellator)(local12)).a__Void();
    return;
}


public static void a(int p0, int p1, float p2, float p3, int p4, int p5, int p6, int p7, float p8, float p9) {
long local10 = (net.minecraft.client.gui.Gui.bb ^ 46479365649689L);
    float local12 = (0x1.0p0f / p8);
    float local13 = (0x1.0p0f / p9);
    net.minecraft.client.renderer.Tessellator local14 = net.minecraft.client.renderer.Tessellator.a();
    moom.lw local15 = ((net.minecraft.client.renderer.Tessellator)(local14)).a__lw();
    ((moom.lw)(local15)).a(((int)(__sourceIntrinsic_7758f36f0ee5_originalDynamicSite1772_3(19644, (8748131369539832765L ^ local10)))), ((moom.oD)(moom.oB.i)));
    ((moom.lw)(((moom.lw)(((moom.lw)(local15)).a(((double)(((double) p0))), ((double)(((double) (p1 + p7)))), ((double)(0x0.0p0d))))).a(((double)(((double) (p2 * local12)))), ((double)(((double) ((p3 + ((float) p5)) * local13))))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local15)).a(((double)(((double) (p0 + p6)))), ((double)(((double) (p1 + p7)))), ((double)(0x0.0p0d))))).a(((double)(((double) ((p2 + ((float) p4)) * local12)))), ((double)(((double) ((p3 + ((float) p5)) * local13))))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local15)).a(((double)(((double) (p0 + p6)))), ((double)(((double) p1))), ((double)(0x0.0p0d))))).a(((double)(((double) ((p2 + ((float) p4)) * local12)))), ((double)(((double) (p3 * local13))))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local15)).a(((double)(((double) p0))), ((double)(((double) p1))), ((double)(0x0.0p0d))))).a(((double)(((double) (p2 * local12)))), ((double)(((double) (p3 * local13))))))).c__Void();
    ((net.minecraft.client.renderer.Tessellator)(local14)).a__Void();
    return;
}


protected void a(int p0, int p1, int p2, int p3, int p4, int p5) {
long local7 = (net.minecraft.client.gui.Gui.bb ^ 37707113279771L);
    float local9 = (((float) ((p4 >> __sourceIntrinsic_499f7b7391d8_originalDynamicSite1773_1(16132, (3335577707576687626L ^ local7))) & __sourceIntrinsic_499f7b7391d8_originalDynamicSite1773_2(20333, (7638879471487945831L ^ local7)))) / 0x1.fep7f);
    float local10 = (((float) ((p4 >> __sourceIntrinsic_499f7b7391d8_originalDynamicSite1773_3(9238, (275671847942186783L ^ local7))) & __sourceIntrinsic_499f7b7391d8_originalDynamicSite1773_4(20333, (7638879471487945831L ^ local7)))) / 0x1.fep7f);
    float local11 = (((float) ((p4 >> __sourceIntrinsic_499f7b7391d8_originalDynamicSite1773_5(29078, (6612417993544020626L ^ local7))) & __sourceIntrinsic_499f7b7391d8_originalDynamicSite1773_6(20333, (7638879471487945831L ^ local7)))) / 0x1.fep7f);
    float local12 = (((float) (p4 & __sourceIntrinsic_499f7b7391d8_originalDynamicSite1773_7(20333, (7638879471487945831L ^ local7)))) / 0x1.fep7f);
    float local13 = (((float) ((p5 >> __sourceIntrinsic_499f7b7391d8_originalDynamicSite1773_8(16132, (3335577707576687626L ^ local7))) & __sourceIntrinsic_499f7b7391d8_originalDynamicSite1773_9(20333, (7638879471487945831L ^ local7)))) / 0x1.fep7f);
    float local14 = (((float) ((p5 >> __sourceIntrinsic_499f7b7391d8_originalDynamicSite1773_10(9238, (275671847942186783L ^ local7))) & __sourceIntrinsic_499f7b7391d8_originalDynamicSite1773_11(20333, (7638879471487945831L ^ local7)))) / 0x1.fep7f);
    float local15 = (((float) ((p5 >> __sourceIntrinsic_499f7b7391d8_originalDynamicSite1773_12(29078, (6612417993544020626L ^ local7))) & __sourceIntrinsic_499f7b7391d8_originalDynamicSite1773_13(20333, (7638879471487945831L ^ local7)))) / 0x1.fep7f);
    float local16 = (((float) (p5 & __sourceIntrinsic_499f7b7391d8_originalDynamicSite1773_14(20333, (7638879471487945831L ^ local7)))) / 0x1.fep7f);
    moom.kZ.v();
    moom.kZ.l();
    moom.kZ.c__Void();
    moom.kZ.a(((int)(__sourceIntrinsic_499f7b7391d8_originalDynamicSite1773_18(13495, (8018413820638459826L ^ local7)))), ((int)(__sourceIntrinsic_499f7b7391d8_originalDynamicSite1773_19(22446, (6401337651200070824L ^ local7)))), ((int)(1)), ((int)(0)));
    moom.kZ.j(((int)(__sourceIntrinsic_499f7b7391d8_originalDynamicSite1773_21(20497, (6910578549446185756L ^ local7)))));
    net.minecraft.client.renderer.Tessellator local17 = net.minecraft.client.renderer.Tessellator.a();
    moom.lw local18 = ((net.minecraft.client.renderer.Tessellator)(local17)).a__lw();
    ((moom.lw)(local18)).a(((int)(__sourceIntrinsic_499f7b7391d8_originalDynamicSite1773_25(19644, (8748122631344754623L ^ local7)))), ((moom.oD)(moom.oB.h)));
    ((moom.lw)(((moom.lw)(((moom.lw)(local18)).a(((double)(((double) p2))), ((double)(((double) p1))), ((double)(((double) this.d)))))).a(((float)(local10)), ((float)(local11)), ((float)(local12)), ((float)(local9))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local18)).a(((double)(((double) p0))), ((double)(((double) p1))), ((double)(((double) this.d)))))).a(((float)(local10)), ((float)(local11)), ((float)(local12)), ((float)(local9))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local18)).a(((double)(((double) p0))), ((double)(((double) p3))), ((double)(((double) this.d)))))).a(((float)(local14)), ((float)(local15)), ((float)(local16)), ((float)(local13))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local18)).a(((double)(((double) p2))), ((double)(((double) p3))), ((double)(((double) this.d)))))).a(((float)(local14)), ((float)(local15)), ((float)(local16)), ((float)(local13))))).c__Void();
    ((net.minecraft.client.renderer.Tessellator)(local17)).a__Void();
    moom.kZ.j(((int)(__sourceIntrinsic_499f7b7391d8_originalDynamicSite1773_45(3724, (7185979195161529742L ^ local7)))));
    moom.kZ.k();
    moom.kZ.d__Void();
    moom.kZ.u();
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_7c66de3d9a8d_originalDynamicSite1768_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral10211_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_07e30838a528_invokedynamic8338_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_07e30838a528_invokedynamic8338_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_07e30838a528_invokedynamic8338_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_07e30838a528_invokedynamic8338_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_07e30838a528_invokedynamic8338_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_07e30838a528_invokedynamic8338_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_07e30838a528_invokedynamic8338_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_07e30838a528_invokedynamic8338_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_07e30838a528_invokedynamic8338_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_07e30838a528_invokedynamic8338_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbe41641ec91_originalDynamicSite1769_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8b99a347d6dd_originalDynamicSite1770_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8e889b14f355_originalDynamicSite1771_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7758f36f0ee5_originalDynamicSite1772_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_originalDynamicSite1773_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_originalDynamicSite1773_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_originalDynamicSite1773_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_originalDynamicSite1773_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_originalDynamicSite1773_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_originalDynamicSite1773_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_originalDynamicSite1773_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_originalDynamicSite1773_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_originalDynamicSite1773_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_originalDynamicSite1773_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_originalDynamicSite1773_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_originalDynamicSite1773_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_originalDynamicSite1773_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_originalDynamicSite1773_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_originalDynamicSite1773_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_originalDynamicSite1773_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_originalDynamicSite1773_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_originalDynamicSite1773_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_originalDynamicSite1773_45(int a0, long a1) throws E;
}
