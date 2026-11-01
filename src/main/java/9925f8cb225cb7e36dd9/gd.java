package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class gd extends moom.gc {

private static long r;

private static long[] s;

private static java.lang.Integer[] t;

private static java.util.Map u;

public gd(int p0, int p1, int p2) { super(0, 0, 0, 0, 0, (java.lang.String)null); }


private static void __sourceConstructorBody_3cfa7eec6299b1f7(moom.gd receiver, int p0, int p1, int p2) throws Throwable {

long local4 = (moom.gd.r ^ 25063361478812L);

    moom.gd.__sourceConstructorInit_3cfa7eec6299b1f7_0(((moom.gd)(receiver)), ((int)(p0)), ((int)(p1)), ((int)(p2)), ((int)(__sourceIntrinsic_3cfa7eec6299b1f7_originalDynamicSite2764_1(7018, (8804147888693366403L ^ local4)))), ((int)(__sourceIntrinsic_3cfa7eec6299b1f7_originalDynamicSite2764_2(975, (886017500878722596L ^ local4)))), ((java.lang.String)("")));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_3cfa7eec6299b1f7_0(moom.gd a0, int a1, int a2, int a3, int a4, int a5, java.lang.String a6) throws E;

static {
r = ((long)(((moom._a)(moom._c.a(((long)(2102828923429334973L)), ((long)(-3890989095497097707L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(146317549824713L)))));
    u = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.gd.r ^ 86448763313505L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill848_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill848_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill848_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill848_14 = new byte[8];
    (__sourceSpill848_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill848_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation848_16 = __sourceSpill848_14;
    ((javax.crypto.Cipher)(__sourceSpill848_11)).init(((int)(__sourceSpill848_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill848_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation848_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "LÞ=ÊI\rY=Î\023=êUÂpf3\030Ã"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill848_25 = local6_life21;
        int __sourceSpill848_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill848_25)).substring(((int)(__sourceSpill848_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill848_30 = local8_life19;
        int __sourceSpill848_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill848_33 = new byte[8];
        (__sourceSpill848_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill848_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill848_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill848_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill848_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill848_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill848_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill848_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill848_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill848_34)).doFinal(((byte[])(__sourceSpill848_33)));
        (__sourceSpill848_30)[__sourceSpill848_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    s = ((long[])(local8_life19));
    t = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral7752_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/gd"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 25229;
      if (t[var3] == null) {
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
         long var5 = s[var3];
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
         Object[] var9 = (Object[])u.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               u.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/gd", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         t[var3] = var15;
      }

      return t[var3];
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.gd.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a(net.minecraft.client.Minecraft p0, int p1, int p2) {
int forwardValue3566_41_0;
    long life4_3;
    int life6_55;
    int life7_61;
    forward_join_67: {
    forward_join_55: {
    forward_join_41: {
    forward_join_40: {
    life4_3 = (moom.gd.r ^ 71184640713795L);
    if (!(this.n)) {
        break forward_join_67;
    }
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(p0)).a__ok())).a__Void(((moom.DD)(moom.gc.f)));
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    if (!((p1 >= this.i))) {
        break forward_join_40;
    }
    if (!((p2 >= this.j))) {
        break forward_join_40;
    }
    if (!((p1 < (this.i + this.g)))) {
        break forward_join_40;
    }
    if (!((p2 < (this.j + this.h)))) {
        break forward_join_40;
    }
    forwardValue3566_41_0 = 1;
    break forward_join_41;
    }
    forwardValue3566_41_0 = 0;
    }
    life6_55 = forwardValue3566_41_0;
    life7_61 = __sourceIntrinsic_de1ba8f88103_invokedynamic3566_12(13179, (6100092339780239950L ^ life4_3));
    if (!((life6_55 != 0))) {
        break forward_join_55;
    }
    life7_61 = (life7_61 + this.h);
    }
    ((moom.gd)(this)).b(((int)(this.i)), ((int)(this.j)), ((int)(0)), ((int)(life7_61)), ((int)(this.g)), ((int)(this.h)));
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_3cfa7eec6299b1f7_originalDynamicSite2764_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3cfa7eec6299b1f7_originalDynamicSite2764_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral7752_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_de1ba8f88103_invokedynamic3566_12(int a0, long a1) throws E;
}
