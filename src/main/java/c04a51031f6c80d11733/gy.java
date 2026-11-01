package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class gy extends moom.gx {

private float s;

public boolean t;

private moom.M7 u;

private static final long v;

private static final long[] w;

private static final java.lang.Integer[] x;

private static final java.util.Map z;

public gy(int p0, int p1, int p2, int p3, int p4, moom.M7 p5, java.lang.String p6) {
super(p0, p1, p2, p3, p4, p5, p6);
    this.s = 0x1.0000000000000p+0f;
    this.u = null;
    this.u = p5;
    this.s = (p5).a();
    this.k = moom.hG.a(p5, this.g);
}


static {
v = ((long)(((moom._a)(moom._c.a(((long)(-2263726421065230859L)), ((long)(8324034957247164576L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(200743202990704L)))));
    z = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.gy.v ^ 50057387586208L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1238_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1238_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1238_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1238_14 = new byte[8];
    (__sourceSpill1238_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1238_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1238_16 = __sourceSpill1238_14;
    ((javax.crypto.Cipher)(__sourceSpill1238_11)).init(((int)(__sourceSpill1238_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1238_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1238_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[7];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ar\017èT!wü½­\177äÆjyY\fÉTâ«\b\0225\0072ÛøOùã/@AiA"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1238_25 = local6_life21;
        int __sourceSpill1238_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1238_25)).substring(((int)(__sourceSpill1238_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1238_30 = local8_life19;
        int __sourceSpill1238_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1238_33 = new byte[8];
        (__sourceSpill1238_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1238_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1238_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1238_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1238_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1238_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1238_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1238_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1238_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1238_34)).doFinal(((byte[])(__sourceSpill1238_33)));
        (__sourceSpill1238_30)[__sourceSpill1238_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "Ëø¡XØ5ÐOâî\nMë­é"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1238_38 = local6_life21;
        int __sourceSpill1238_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1238_38)).substring(((int)(__sourceSpill1238_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1238_43 = local8_life19;
        int __sourceSpill1238_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1238_46 = new byte[8];
        (__sourceSpill1238_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1238_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1238_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1238_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1238_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1238_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1238_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1238_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1238_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1238_47)).doFinal(((byte[])(__sourceSpill1238_46)));
        (__sourceSpill1238_43)[__sourceSpill1238_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    w = ((long[])(local8_life19));
    x = ((java.lang.Integer[])(new java.lang.Integer[7]));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public boolean b() {
return ((0) != 0);
}


protected void b(net.minecraft.client.Minecraft p0, int p1, int p2) {
int forwardValue3573_15_0;
    moom.gy forwardValue3573_103_0;
    boolean spill3573_0;
    moom.gy spill3573_1;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    forward_join_140: {
    forward_join_103: {
    forward_join_61: {
    forward_join_15: {
    life4_3 = (moom.gy.v ^ 2812919534258L);
    life6_5 = net.minecraft.potion.Potion.b__Arrayr3();
    spill3573_0 = ((moom.gy)(this)).n;
    if (!((life6_5 == null))) {
        forwardValue3573_15_0 = ((spill3573_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!(spill3573_0)) {
        break forward_join_140;
    }
    spill3573_1 = this;
    if (!((life6_5 == null))) {
        forwardValue3573_103_0 = spill3573_1;
        break forward_join_103;
    }
    forwardValue3573_15_0 = ((((moom.gy)(spill3573_1)).t) ? 1 : 0);
    }
    if (!((forwardValue3573_15_0 != 0))) {
        break forward_join_61;
    }
    if (!((!net.minecraft.client.gui.GuiScreen.c__Boolean()))) {
        break forward_join_61;
    }
    this.s = ((float)((((float) (p1 - (((moom.gy)(this)).i + 4))) / ((float) (((moom.gy)(this)).g - __sourceIntrinsic_a66803e36708_invokedynamic3573_9(10653, (2939054325711563073L ^ life4_3)))))));
    this.s = ((float)(moom.Dr.a(((float)(this.s)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)))));
    ((moom.M7)(this.u)).a(((float)(this.s)));
    this.s = ((float)(((moom.M7)(this.u)).a()));
    ((moom.gy)(this)).k = ((java.lang.String)(moom.hG.a(((moom.M7)(this.u)), ((int)(((moom.gy)(this)).g)))));
    }
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(p0)).a__ok())).a__Void(((moom.DD)(moom.gy.f)));
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    ((moom.gy)(this)).b(((int)((((moom.gy)(this)).i + ((int) (this.s * ((float) (((moom.gy)(this)).g - __sourceIntrinsic_a66803e36708_invokedynamic3573_31(10653, (2939054325711563073L ^ life4_3))))))))), ((int)(((moom.gy)(this)).j)), ((int)(0)), ((int)(__sourceIntrinsic_a66803e36708_invokedynamic3573_33(31240, (588814116642405079L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_a66803e36708_invokedynamic3573_34(28748, (6287547213810413713L ^ life4_3)))));
    forwardValue3573_103_0 = this;
    }
    ((moom.gy)(forwardValue3573_103_0)).b(((int)(((((moom.gy)(this)).i + ((int) (this.s * ((float) (((moom.gy)(this)).g - __sourceIntrinsic_a66803e36708_invokedynamic3573_39(10653, (2939054325711563073L ^ life4_3))))))) + 4))), ((int)(((moom.gy)(this)).j)), ((int)(__sourceIntrinsic_a66803e36708_invokedynamic3573_41(20313, (7564561296929361795L ^ life4_3)))), ((int)(__sourceIntrinsic_a66803e36708_invokedynamic3573_42(14412, (6126558867845806229L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_a66803e36708_invokedynamic3573_43(29071, (2130180281174864212L ^ life4_3)))));
    }
    return;
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 31493;
      if (x[var3] == null) {
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
         long var5 = w[var3];
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
         Object[] var9 = (Object[])z.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               z.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/gy", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         x[var3] = var15;
      }

      return x[var3];
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.gy.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral7787_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/gy"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(int p0, int p1) {
this.t = ((boolean)(false));
    return;
}


protected int a(boolean p0) {
return 0;
}


public boolean a__Boolean(net.minecraft.client.Minecraft p0, int p1, int p2) {
int forwardValue3572_58_0;
    boolean spill3572_0;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    forward_join_58: {
    forward_join_57: {
    life4_3 = (moom.gy.v ^ 127811123946330L);
    life6_5 = net.minecraft.potion.Potion.b__Arrayr3();
    spill3572_0 = super.a__Boolean(((net.minecraft.client.Minecraft)(p0)), ((int)(p1)), ((int)(p2)));
    if (!((life6_5 == null))) {
        forwardValue3572_58_0 = ((spill3572_0) ? 1 : 0);
        break forward_join_58;
    }
    if (!(spill3572_0)) {
        break forward_join_57;
    }
    this.s = ((float)((((float) (p1 - (((moom.gy)(this)).i + 4))) / ((float) (((moom.gy)(this)).g - __sourceIntrinsic_fe3ccd2239af_invokedynamic3572_6(10810, (8359492180230871820L ^ life4_3)))))));
    this.s = ((float)(moom.Dr.a(((float)(this.s)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)))));
    ((moom.M7)(this.u)).a(((float)(this.s)));
    ((moom.gy)(this)).k = ((java.lang.String)(moom.hG.a(((moom.M7)(this.u)), ((int)(((moom.gy)(this)).g)))));
    this.t = ((boolean)(true));
    return ((1) != 0);
    }
    forwardValue3572_58_0 = 0;
    }
    return ((forwardValue3572_58_0) != 0);
}


public void a__Void() {
this.s = ((float)(((moom.M7)(this.u)).a()));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_a66803e36708_invokedynamic3573_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a66803e36708_invokedynamic3573_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a66803e36708_invokedynamic3573_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a66803e36708_invokedynamic3573_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a66803e36708_invokedynamic3573_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a66803e36708_invokedynamic3573_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a66803e36708_invokedynamic3573_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a66803e36708_invokedynamic3573_43(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral7787_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fe3ccd2239af_invokedynamic3572_6(int a0, long a1) throws E;
}
