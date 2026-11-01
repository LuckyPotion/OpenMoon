package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class sr extends net.minecraft.client.particle.EntityFX {

private net.minecraft.entity.Entity aV;

private net.minecraft.entity.Entity aW;

private int aX;

private int aY;

private float aZ;

private net.minecraft.client.renderer.entity.RenderManager a0;

private static long bb;

private static long[] hb;

private static java.lang.Integer[] ib;

private static java.util.Map jb;

public sr(net.minecraft.world.World p0, net.minecraft.entity.Entity p1, net.minecraft.entity.Entity p2, float p3) { super((net.minecraft.world.World)null, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D); }


private static void __sourceConstructorBody_49c232510fe62837(moom.sr receiver, net.minecraft.world.World p0, net.minecraft.entity.Entity p1, net.minecraft.entity.Entity p2, float p3) throws Throwable {

long local5 = (moom.sr.bb ^ 74195858868526L);

    moom.sr.__sourceConstructorInit_49c232510fe62837_0(((moom.sr)(receiver)), ((net.minecraft.world.World)(p0)), ((double)(((net.minecraft.entity.Entity)(p1)).n)), ((double)(((net.minecraft.entity.Entity)(p1)).o)), ((double)(((net.minecraft.entity.Entity)(p1)).p)), ((double)(((net.minecraft.entity.Entity)(p1)).t)), ((double)(((net.minecraft.entity.Entity)(p1)).u)), ((double)(((net.minecraft.entity.Entity)(p1)).v)));

    ((moom.sr)(receiver)).a0 = ((net.minecraft.client.renderer.entity.RenderManager)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__nw()));

    ((moom.sr)(receiver)).aV = ((net.minecraft.entity.Entity)(p1));

    ((moom.sr)(receiver)).aW = ((net.minecraft.entity.Entity)(p2));

    ((moom.sr)(receiver)).aY = ((int)(__sourceIntrinsic_49c232510fe62837_originalDynamicSite3321_13(10024, (7061750095690913531L ^ local5))));

    ((moom.sr)(receiver)).aZ = ((float)(p3));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_49c232510fe62837_0(moom.sr a0, net.minecraft.world.World a1, double a2, double a3, double a4, double a5, double a6, double a7) throws E;

static {
bb = ((long)(((moom._a)(moom._c.a(((long)(-2054349828547686375L)), ((long)(-4296706971513749479L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(170617721284796L)))));
    jb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.sr.bb ^ 37833729968884L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1019_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1019_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1019_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1019_14 = new byte[8];
    (__sourceSpill1019_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1019_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1019_16 = __sourceSpill1019_14;
    ((javax.crypto.Cipher)(__sourceSpill1019_11)).init(((int)(__sourceSpill1019_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1019_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1019_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\027ÐáÕ\005m /¼8:ÏW\026@<Z=¹"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1019_25 = local6_life21;
        int __sourceSpill1019_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1019_25)).substring(((int)(__sourceSpill1019_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1019_30 = local8_life19;
        int __sourceSpill1019_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1019_33 = new byte[8];
        (__sourceSpill1019_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1019_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1019_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1019_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1019_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1019_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1019_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1019_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1019_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1019_34)).doFinal(((byte[])(__sourceSpill1019_33)));
        (__sourceSpill1019_30)[__sourceSpill1019_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    hb = ((long[])(local8_life19));
    ib = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 27761;
      if (ib[var3] == null) {
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
         long var5 = hb[var3];
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
         Object[] var9 = (Object[])jb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               jb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/sr", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         ib[var3] = var15;
      }

      return ib[var3];
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.sr.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral9088_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/sr"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(moom.lw p0, net.minecraft.entity.Entity p1, float p2, float p3, float p4, float p5, float p6, float p7) {
long life9_3;
    moom.MB life11_5;
    float life12_22;
    float life12_26;
    double life13_30;
    double life15_34;
    double life17_38;
    double life19_53;
    double life21_72;
    double life23_87;
    double life25_96;
    double life27_105;
    double life29_114;
    int life31_118;
    int life32_126;
    int life33_134;
    double life25_149;
    double life27_153;
    double life29_157;
    life9_3 = (moom.sr.bb ^ 30991988210443L);
    life11_5 = null;
    if (moom.BU.ap()) {
        life11_5 = moom.MP.dk;
        moom.MP.c(((net.minecraft.entity.Entity)(this.aV)));
    }
    life12_22 = ((((float) this.aX) + p2) / ((float) this.aY));
    life12_26 = (life12_22 * life12_22);
    life13_30 = ((net.minecraft.entity.Entity)(this.aV)).n;
    life15_34 = ((net.minecraft.entity.Entity)(this.aV)).o;
    life17_38 = ((net.minecraft.entity.Entity)(this.aV)).p;
    life19_53 = (((net.minecraft.entity.Entity)(this.aW)).M + ((((net.minecraft.entity.Entity)(this.aW)).n - ((net.minecraft.entity.Entity)(this.aW)).M) * ((double) p2)));
    life21_72 = ((((net.minecraft.entity.Entity)(this.aW)).N + ((((net.minecraft.entity.Entity)(this.aW)).o - ((net.minecraft.entity.Entity)(this.aW)).N) * ((double) p2))) + ((double) this.aZ));
    life23_87 = (((net.minecraft.entity.Entity)(this.aW)).O + ((((net.minecraft.entity.Entity)(this.aW)).p - ((net.minecraft.entity.Entity)(this.aW)).O) * ((double) p2)));
    life25_96 = (life13_30 + ((life19_53 - life13_30) * ((double) life12_26)));
    life27_105 = (life15_34 + ((life21_72 - life15_34) * ((double) life12_26)));
    life29_114 = (life17_38 + ((life23_87 - life17_38) * ((double) life12_26)));
    life31_118 = ((moom.sr)(this)).a__Int(((float)(p2)));
    life32_126 = (life31_118 % __sourceIntrinsic_54c23c7634ff_invokedynamic7380_33(5367, (6700017907469293315L ^ life9_3)));
    life33_134 = (life31_118 / __sourceIntrinsic_54c23c7634ff_invokedynamic7380_34(13141, (6223039875214160032L ^ life9_3)));
    net.minecraft.client.renderer.OpenGlHelper.a(((int)(net.minecraft.client.renderer.OpenGlHelper.r)), ((float)(((float) life32_126))), ((float)(((float) life33_134))));
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    life25_149 = (life25_96 - moom.sr.aR);
    life27_153 = (life27_105 - moom.sr.aS);
    life29_157 = (life29_114 - moom.sr.aT);
    ((net.minecraft.client.renderer.entity.RenderManager)(this.a0)).a__Boolean(((net.minecraft.entity.Entity)(this.aV)), ((double)(((double) ((float) life25_149)))), ((double)(((double) ((float) life27_153)))), ((double)(((double) ((float) life29_157)))), ((float)(((net.minecraft.entity.Entity)(this.aV)).w)), ((float)(p2)));
    if (moom.BU.ap()) {
        moom.MP.d(((net.minecraft.entity.Entity)(null)));
        moom.MP.c(((moom.MB)(life11_5)));
    }
    return;
}


public int a__Int() {
return 3;
}


public void g__Void() {
moom.sr __stackOp4007_0_0 = this;
    ((moom.sr)(__stackOp4007_0_0)).aX = ((int)((((moom.sr)(__stackOp4007_0_0)).aX + 1)));
    if ((this.aX == this.aY)) {
        ((moom.sr)(this)).f__Void();
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_49c232510fe62837_originalDynamicSite3321_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral9088_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_54c23c7634ff_invokedynamic7380_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_54c23c7634ff_invokedynamic7380_34(int a0, long a1) throws E;
}
