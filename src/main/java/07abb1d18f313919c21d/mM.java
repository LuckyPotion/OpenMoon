package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class mM extends moom.mK<moom.tJ> {

private static final long k;

private static final long[] o;

private static final java.lang.Integer[] p;

private static final java.util.Map q;

public mM(net.minecraft.client.renderer.entity.RenderManager p0) {
super(p0);
}


static {
k = ((long)(((moom._a)(moom._c.a(((long)(-1265985911253065896L)), ((long)(-3158619914421627519L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(114545956163604L)))));
    q = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.mM.k ^ 72236995235671L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill932_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill932_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill932_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill932_14 = new byte[8];
    (__sourceSpill932_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill932_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation932_16 = __sourceSpill932_14;
    ((javax.crypto.Cipher)(__sourceSpill932_11)).init(((int)(__sourceSpill932_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill932_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation932_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "XÍ\"¦u|äÆèÓÊûX­\021"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill932_25 = local6_life21;
        int __sourceSpill932_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill932_25)).substring(((int)(__sourceSpill932_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill932_30 = local8_life19;
        int __sourceSpill932_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill932_33 = new byte[8];
        (__sourceSpill932_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill932_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill932_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill932_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill932_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill932_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill932_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill932_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill932_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill932_34)).doFinal(((byte[])(__sourceSpill932_33)));
        (__sourceSpill932_30)[__sourceSpill932_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    o = ((long[])(local8_life19));
    p = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 22250;
      if (p[var3] == null) {
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
         long var5 = o[var3];
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
         Object[] var9 = (Object[])q.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               q.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/mM", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         p[var3] = var15;
      }

      return p[var3];
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.mM.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral8391_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/mM"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo c(moom.Oo p0) {
return p0;
}


protected void a__sourceBridge_1447df1885(net.minecraft.entity.item.EntityMinecart p0, float p1, net.minecraft.block.state.IBlockState p2) {
((moom.mM)(this)).a(((moom.tJ)(((moom.tJ)(p0)))), ((float)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
}


protected void a(moom.tJ p0, float p1, net.minecraft.block.state.IBlockState p2) {
long life4_3;
    int life6_6;
    float life7_32;
    float life7_37;
    float life7_41;
    float life7_45;
    float life8_51;
    net.minecraft.client.renderer.BlockRendererDispatcher life7_75;
    life4_3 = (moom.mM.k ^ 52547762018524L);
    life6_6 = ((moom.tJ)(p0)).a__sourceReturn_8abf5c6871();
    if ((life6_6 > -1)) {
        if ((((((float) life6_6) - p1) + 0x1.0p0f) < 0x1.4p3f)) {
        life7_32 = (0x1.0p0f - (((((float) life6_6) - p1) + 0x1.0p0f) / 0x1.4p3f));
        life7_37 = moom.Dr.a(((float)(life7_32)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
        life7_41 = (life7_37 * life7_37);
        life7_45 = (life7_41 * life7_41);
        life8_51 = (0x1.0p0f + (life7_45 * 0x1.333334p-2f));
        moom.kZ.a(((float)(life8_51)), ((float)(life8_51)), ((float)(life8_51)));
    }
    }
    __sourceExactCall_2a565b301272df(this, ((net.minecraft.entity.item.EntityMinecart)(p0)), ((float)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    if ((life6_6 > -1)) {
        if ((((life6_6 / 5) % 2) == 0)) {
        life7_75 = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__kP();
        int spill6855_0 = 13307;
        moom.kZ.v();
        long spill6855_1 = (7646785375456275657L ^ life4_3);
        moom.kZ.f();
        moom.kZ.l();
        moom.kZ.b(((int)(__sourceIntrinsic_38f20572a64f_invokedynamic6855_10(spill6855_0, spill6855_1))), ((int)(__sourceIntrinsic_38f20572a64f_invokedynamic6855_11(14782, (4921815118135142029L ^ life4_3)))));
        moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(((0x1.0p0f - (((((float) life6_6) - p1) + 0x1.0p0f) / 0x1.9p6f)) * 0x1.99999ap-1f))));
        moom.kZ.B();
        ((net.minecraft.client.renderer.BlockRendererDispatcher)(life7_75)).a(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.W)).a__fE())), ((float)(0x1.0p0f)));
        moom.kZ.C();
        moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
        moom.kZ.k();
        moom.kZ.e();
        moom.kZ.u();
    }
    }
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral8391_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_38f20572a64f_invokedynamic6855_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_38f20572a64f_invokedynamic6855_11(int a0, long a1) throws E;



private static native void __sourceExactCall_2a565b301272df(moom.mK p0, net.minecraft.entity.item.EntityMinecart p1, float p2, net.minecraft.block.state.IBlockState p3);
}
