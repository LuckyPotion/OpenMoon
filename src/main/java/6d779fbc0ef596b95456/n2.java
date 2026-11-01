package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class n2 implements net.minecraft.client.renderer.texture.ITextureObject {

protected int a;

protected boolean b;

protected boolean c;

protected boolean d;

protected boolean e;

public moom.MA f;

private static int g;

private static final long E;

private static final long[] G;

private static final java.lang.Integer[] H;

private static final java.util.Map I;

public n2() {
super();
    this.a = -1;
}


static {
E = ((long)(((moom._a)(moom._c.a(((long)(8730302928880061745L)), ((long)(-4492029348967878772L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(163522188346800L)))));
    I = ((java.util.Map)(new java.util.HashMap(13)));
    int __sourceSpill1415_7 = 0;
    long local0_life8 = (moom.n2.E ^ 34765067598967L);
    moom.n2.b(((int)(__sourceSpill1415_7)));
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill1415_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1415_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1415_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1415_16 = new byte[8];
    (__sourceSpill1415_16)[0] = ((byte) ((int) (local0_life8 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill1415_16)[local3_life17] = ((byte) ((int) ((local0_life8 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation1415_18 = __sourceSpill1415_16;
    ((javax.crypto.Cipher)(__sourceSpill1415_13)).init(((int)(__sourceSpill1415_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1415_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1415_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[10];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "eR¶¾l« \r%jÆOc&(?\016\024>áæÞ-h¥±Ez?¶]H²q\007ÃÓ\tkXt\023 çÀÏÐ9¤=±ZÙ¬ð"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1415_27 = local6_life23;
        int __sourceSpill1415_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1415_27)).substring(((int)(__sourceSpill1415_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1415_32 = local8_life21;
        int __sourceSpill1415_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill1415_35 = new byte[8];
        (__sourceSpill1415_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill1415_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill1415_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill1415_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill1415_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill1415_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill1415_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill1415_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill1415_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill1415_36)).doFinal(((byte[])(__sourceSpill1415_35)));
        (__sourceSpill1415_32)[__sourceSpill1415_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    local7_life25 = ((java.lang.String)((local6_life23 = "Ï¡û&<ï0Ñ\022í\025\026Àæ"))).length();
    local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1415_40 = local6_life23;
        int __sourceSpill1415_41 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill1415_40)).substring(((int)(__sourceSpill1415_41)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1415_45 = local8_life21;
        int __sourceSpill1415_46 = local5_life22;
        local5_life22 += 1;
        long local10_life47 = (((((((((((long) (local9_life44)[0]) & 255L) << 56) | ((((long) (local9_life44)[1]) & 255L) << 48)) | ((((long) (local9_life44)[2]) & 255L) << 40)) | ((((long) (local9_life44)[3]) & 255L) << 32)) | ((((long) (local9_life44)[4]) & 255L) << 24)) | ((((long) (local9_life44)[5]) & 255L) << 16)) | ((((long) (local9_life44)[6]) & 255L) << 8)) | (((long) (local9_life44)[7]) & 255L));
        byte[] __sourceSpill1415_48 = new byte[8];
        (__sourceSpill1415_48)[0] = ((byte) ((int) (local10_life47 >>> 56)));
        (__sourceSpill1415_48)[1] = ((byte) ((int) (local10_life47 >>> 48)));
        (__sourceSpill1415_48)[2] = ((byte) ((int) (local10_life47 >>> 40)));
        (__sourceSpill1415_48)[3] = ((byte) ((int) (local10_life47 >>> 32)));
        (__sourceSpill1415_48)[4] = ((byte) ((int) (local10_life47 >>> 24)));
        (__sourceSpill1415_48)[5] = ((byte) ((int) (local10_life47 >>> 16)));
        (__sourceSpill1415_48)[6] = ((byte) ((int) (local10_life47 >>> 8)));
        (__sourceSpill1415_48)[7] = ((byte) ((int) local10_life47));
        javax.crypto.Cipher __sourceSpill1415_49 = local2_life11;
        byte[] local12_life51 = ((javax.crypto.Cipher)(__sourceSpill1415_49)).doFinal(((byte[])(__sourceSpill1415_48)));
        (__sourceSpill1415_45)[__sourceSpill1415_46] = (((((((((((long) (local12_life51)[0]) & 255L) << 56) | ((((long) (local12_life51)[1]) & 255L) << 48)) | ((((long) (local12_life51)[2]) & 255L) << 40)) | ((((long) (local12_life51)[3]) & 255L) << 32)) | ((((long) (local12_life51)[4]) & 255L) << 24)) | ((((long) (local12_life51)[5]) & 255L) << 16)) | ((((long) (local12_life51)[6]) & 255L) << 8)) | (((long) (local12_life51)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    G = ((long[])(local8_life21));
    H = ((java.lang.Integer[])(new java.lang.Integer[10]));
}


public static void b(int p0) {
moom.n2.g = ((int)(p0));
    return;
}


public static int b() {
return moom.n2.g;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 5433;
      if (H[var3] == null) {
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
         long var5 = G[var3];
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
         Object[] var9 = (Object[])I.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               I.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/n2", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         H[var3] = var15;
      }

      return H[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.n2.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8474_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/n2"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void b(boolean p0, boolean p1) {
long life3_3;
    int life5_11;
    int life6_13;
    int life5_34;
    int life6_40;
    life3_3 = (moom.n2.E ^ 130000991192184L);
    this.b = ((boolean)(p0));
    this.c = ((boolean)(p1));
    life5_11 = -1;
    life6_13 = -1;
    if (p0) {
        life5_34 = (p1 ? __sourceIntrinsic_e84c2119af86_invokedynamic3787_3(25158, (5700451157738942114L ^ life3_3)) : __sourceIntrinsic_e84c2119af86_invokedynamic3787_4(18250, (3244887207420677034L ^ life3_3)));
        life6_40 = __sourceIntrinsic_e84c2119af86_invokedynamic3787_5(32072, (6808239113235362219L ^ life3_3));
    } else {
        life5_34 = (p1 ? __sourceIntrinsic_e84c2119af86_invokedynamic3787_6(5053, (6108770204661718875L ^ life3_3)) : __sourceIntrinsic_e84c2119af86_invokedynamic3787_7(32612, (767626045876532099L ^ life3_3)));
        life6_40 = __sourceIntrinsic_e84c2119af86_invokedynamic3787_8(10579, (2901692230741992882L ^ life3_3));
    }
    moom.kZ.i(((int)(this.a())));
    org.lwjgl.opengl.GL11.glTexParameteri(((int)(__sourceIntrinsic_e84c2119af86_invokedynamic3787_11(20955, (6805700321715707190L ^ life3_3)))), ((int)(__sourceIntrinsic_e84c2119af86_invokedynamic3787_12(12260, (4456169792582198022L ^ life3_3)))), ((int)(life5_34)));
    org.lwjgl.opengl.GL11.glTexParameteri(((int)(__sourceIntrinsic_e84c2119af86_invokedynamic3787_14(6442, (8890152899584628166L ^ life3_3)))), ((int)(__sourceIntrinsic_e84c2119af86_invokedynamic3787_15(24305, (8083345243491193364L ^ life3_3)))), ((int)(life6_40)));
    return;
}


public static int c() {
int local0 = moom.n2.b();
    if ((local0 == 0)) {
        return 70;
    }
    return 0;
}


public void c__Void() {
moom.MS.a(((moom.n2)(this)), ((int)(this.a)));
    if ((this.a != -1)) {
        moom.ol.a__Void(((int)(this.a)));
        this.a = ((int)(-1));
    }
    return;
}


public void a__Void() {
this.b(((boolean)__sourceIntrinsic_integerToBoolean((((this.d) ? 1 : 0)))), ((boolean)__sourceIntrinsic_integerToBoolean((((this.e) ? 1 : 0)))));
    return;
}


public void a(boolean p0, boolean p1) {
this.d = ((boolean)__sourceIntrinsic_integerToBoolean((((this.b) ? 1 : 0))));
    this.e = ((boolean)__sourceIntrinsic_integerToBoolean((((this.c) ? 1 : 0))));
    this.b(((boolean)(p0)), ((boolean)(p1)));
    return;
}


public moom.MA a__MA() {
return moom.MS.a(((moom.n2)(this)));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int a() {
if ((this.a == -1)) {
        this.a = ((int)(moom.ol.a()));
    }
    return this.a;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8474_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e84c2119af86_invokedynamic3787_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e84c2119af86_invokedynamic3787_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e84c2119af86_invokedynamic3787_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e84c2119af86_invokedynamic3787_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e84c2119af86_invokedynamic3787_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e84c2119af86_invokedynamic3787_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e84c2119af86_invokedynamic3787_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e84c2119af86_invokedynamic3787_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e84c2119af86_invokedynamic3787_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e84c2119af86_invokedynamic3787_15(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
