package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class i0 extends moom.iT {

private static long t;

private static long[] u;

private static java.lang.Integer[] v;

private static java.util.Map w;

public i0() {
this(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((boolean)(false)));
    return;
}


public i0(float p0, float p1, boolean p2) { super(0.0F, 0.0F, 0, 0); __sourceHandlerCall_b366bdf3a8a1df7e54a3(this, p0, p1, p2); }


static {
t = ((long)(((moom._a)(moom._c.a(((long)(-6509262919493101106L)), ((long)(-6914098410460215660L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(128222919960365L)))));
    w = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.i0.t ^ 43596980096525L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1275_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1275_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1275_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1275_14 = new byte[8];
    (__sourceSpill1275_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1275_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1275_16 = __sourceSpill1275_14;
    ((javax.crypto.Cipher)(__sourceSpill1275_11)).init(((int)(__sourceSpill1275_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1275_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1275_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[8];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\024£~é.ò\006­êÕRÇP§Ægì\035))Kî-§SÝóKþØ\03729XIªmÜ>vÎ+0"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1275_25 = local6_life21;
        int __sourceSpill1275_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1275_25)).substring(((int)(__sourceSpill1275_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1275_30 = local8_life19;
        int __sourceSpill1275_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1275_33 = new byte[8];
        (__sourceSpill1275_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1275_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1275_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1275_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1275_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1275_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1275_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1275_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1275_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1275_34)).doFinal(((byte[])(__sourceSpill1275_33)));
        (__sourceSpill1275_30)[__sourceSpill1275_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\177:\013\022\000Ô\023¯L?y2d>"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1275_38 = local6_life21;
        int __sourceSpill1275_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1275_38)).substring(((int)(__sourceSpill1275_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1275_43 = local8_life19;
        int __sourceSpill1275_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1275_46 = new byte[8];
        (__sourceSpill1275_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1275_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1275_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1275_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1275_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1275_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1275_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1275_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1275_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1275_47)).doFinal(((byte[])(__sourceSpill1275_46)));
        (__sourceSpill1275_43)[__sourceSpill1275_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    u = ((long[])(local8_life19));
    v = ((java.lang.Integer[])(new java.lang.Integer[8]));
}

private static native <E extends Throwable> void __sourceHandlerCall_b366bdf3a8a1df7e54a3(moom.i0 a0, float a1, float a2, boolean a3) throws E;
private static final class __SourceHandler_b366bdf3a8a1df7e54a3 {

public static void f200028(moom.i0 receiver, float p0, float p1, boolean p2) throws Throwable {
    moom.i0 forwardValue200028_22_0;
    float forwardValue200028_22_1;
    float forwardValue200028_22_2;
    int forwardValue200028_22_3;
    moom.i0 forwardValue200028_27_0;
    float forwardValue200028_27_1;
    float forwardValue200028_27_2;
    int forwardValue200028_27_3;
    int forwardValue200028_27_4;
    moom.i0 spill200028_0;
    float spill200028_1;
    float spill200028_2;
    int spill200028_3;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    forward_join_136: {
    forward_join_115: {
    forward_join_72: {
    forward_join_27: {
    forward_join_22: {
    life4_3 = (__fieldRead200028_0() ^ 79701461148121L);
    life6_5 = __call200028_1();
    spill200028_0 = receiver;
    spill200028_1 = p0;
    spill200028_2 = 0x0.0p0f;
    spill200028_3 = __invokedynamic200028_2(25173, (5081486749432227856L ^ life4_3));
    if (!(p2)) {
        forwardValue200028_22_0 = spill200028_0;
        forwardValue200028_22_1 = spill200028_1;
        forwardValue200028_22_2 = spill200028_2;
        forwardValue200028_22_3 = spill200028_3;
        break forward_join_22;
    }
    forwardValue200028_27_0 = spill200028_0;
    forwardValue200028_27_1 = spill200028_1;
    forwardValue200028_27_2 = spill200028_2;
    forwardValue200028_27_3 = spill200028_3;
    forwardValue200028_27_4 = __invokedynamic200028_3(7208, (7127767886184207978L ^ life4_3));
    break forward_join_27;
    }
    forwardValue200028_27_0 = forwardValue200028_22_0;
    forwardValue200028_27_1 = forwardValue200028_22_1;
    forwardValue200028_27_2 = forwardValue200028_22_2;
    forwardValue200028_27_3 = forwardValue200028_22_3;
    forwardValue200028_27_4 = __invokedynamic200028_4(5649, (3493892480709680208L ^ life4_3));
    }
    __directSuperInit200028_5(forwardValue200028_27_0, forwardValue200028_27_1, forwardValue200028_27_2, forwardValue200028_27_3, forwardValue200028_27_4);
    if (!((life6_5 != null))) {
        break forward_join_115;
    }
    if (!(p2)) {
        break forward_join_72;
    }
    __fieldWrite200028_6(receiver, new moom.jD(receiver, 0, 0));
    __call200028_11(__fieldRead200028_7(receiver), -0x1.0p2f, -0x1.4p3f, -0x1.0p2f, __invokedynamic200028_8(23562, (8035320010578630217L ^ life4_3)), __invokedynamic200028_9(15382, (5287444934518994514L ^ life4_3)), __invokedynamic200028_10(15382, (5287444934518994514L ^ life4_3)), p0);
    __call200028_13(__fieldRead200028_12(receiver), 0x0.0p0f, (0x0.0p0f + p1), 0x0.0p0f);
    if (!((life6_5 == null))) {
        break forward_join_136;
    }
    }
    __fieldWrite200028_14(receiver, new moom.jD(receiver));
    __call200028_16(__fieldRead200028_15(receiver), 0x0.0p0f, (0x0.0p0f + p1), 0x0.0p0f);
    __call200028_23(__call200028_19(__fieldRead200028_17(receiver), 0, __invokedynamic200028_18(4499, (5851119437391518676L ^ life4_3))), -0x1.0p2f, -0x1.4p3f, -0x1.0p2f, __invokedynamic200028_20(15382, (5287444934518994514L ^ life4_3)), __invokedynamic200028_21(9762, (2790129126584020068L ^ life4_3)), __invokedynamic200028_22(15382, (5287444934518994514L ^ life4_3)), p0);
    }
    __call200028_28(__call200028_27(__fieldRead200028_24(receiver), __invokedynamic200028_25(24844, (799714096632900428L ^ life4_3)), __invokedynamic200028_26(4499, (5851119437391518676L ^ life4_3))), -0x1.0p0f, -0x1.8p1f, -0x1.8p2f, 2, 4, 2, p0);
    }
    return;
}
private static native long __fieldRead200028_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call200028_1() throws Throwable;
private static native int __invokedynamic200028_2(int a0, long a1) throws Throwable;
private static native int __invokedynamic200028_3(int a0, long a1) throws Throwable;
private static native int __invokedynamic200028_4(int a0, long a1) throws Throwable;
private static native void __directSuperInit200028_5(moom.i0 a0, float a1, float a2, int a3, int a4) throws Throwable;
private static native void __fieldWrite200028_6(moom.i0 a0, moom.jD a1) throws Throwable;
private static native moom.jD __fieldRead200028_7(moom.i0 a0) throws Throwable;
private static native int __invokedynamic200028_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic200028_9(int a0, long a1) throws Throwable;
private static native int __invokedynamic200028_10(int a0, long a1) throws Throwable;
private static native void __call200028_11(moom.jD a0, float a1, float a2, float a3, int a4, int a5, int a6, float a7) throws Throwable;
private static native moom.jD __fieldRead200028_12(moom.i0 a0) throws Throwable;
private static native void __call200028_13(moom.jD a0, float a1, float a2, float a3) throws Throwable;
private static native void __fieldWrite200028_14(moom.i0 a0, moom.jD a1) throws Throwable;
private static native moom.jD __fieldRead200028_15(moom.i0 a0) throws Throwable;
private static native void __call200028_16(moom.jD a0, float a1, float a2, float a3) throws Throwable;
private static native moom.jD __fieldRead200028_17(moom.i0 a0) throws Throwable;
private static native int __invokedynamic200028_18(int a0, long a1) throws Throwable;
private static native moom.jD __call200028_19(moom.jD a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic200028_20(int a0, long a1) throws Throwable;
private static native int __invokedynamic200028_21(int a0, long a1) throws Throwable;
private static native int __invokedynamic200028_22(int a0, long a1) throws Throwable;
private static native void __call200028_23(moom.jD a0, float a1, float a2, float a3, int a4, int a5, int a6, float a7) throws Throwable;
private static native moom.jD __fieldRead200028_24(moom.i0 a0) throws Throwable;
private static native int __invokedynamic200028_25(int a0, long a1) throws Throwable;
private static native int __invokedynamic200028_26(int a0, long a1) throws Throwable;
private static native moom.jD __call200028_27(moom.jD a0, int a1, int a2) throws Throwable;
private static native void __call200028_28(moom.jD a0, float a1, float a2, float a3, int a4, int a5, int a6, float a7) throws Throwable;

}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 10600;
      if (v[var3] == null) {
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
         long var5 = u[var3];
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
         Object[] var9 = (Object[])w.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               w.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/i0", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         v[var3] = var15;
      }

      return v[var3];
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.i0.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral7983_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/i0"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(float p0, float p1, float p2, float p3, float p4, float p5, net.minecraft.entity.Entity p6) {
super.a(((float)(p0)), ((float)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((net.minecraft.entity.Entity)(p6)));
    float local8_life3 = moom.Dr.a(((float)((this.a * 0x1.921fb6p1f))));
    float local9_life7 = moom.Dr.a(((float)(((0x1.0p0f - ((0x1.0p0f - this.a) * (0x1.0p0f - this.a))) * 0x1.921fb6p1f))));
    ((moom.jD)(this.l)).j = ((float)(0x0.0p0f));
    ((moom.jD)(this.m)).j = ((float)(0x0.0p0f));
    ((moom.jD)(this.l)).i = ((float)((-(0x1.99999ap-4f - (local8_life3 * 0x1.333334p-1f)))));
    ((moom.jD)(this.m)).i = ((float)((0x1.99999ap-4f - (local8_life3 * 0x1.333334p-1f))));
    ((moom.jD)(this.l)).h = ((float)(-0x1.921fb6p0f));
    ((moom.jD)(this.m)).h = ((float)(-0x1.921fb6p0f));
    this.l.h -= ((local8_life3 * 0x1.333334p0f) - (local9_life7 * 0x1.99999ap-2f));
    this.m.h -= ((local8_life3 * 0x1.333334p0f) - (local9_life7 * 0x1.99999ap-2f));
    this.l.j += ((moom.Dr.b(((float)((p2 * 0x1.70a3d8p-4f)))) * 0x1.99999ap-5f) + 0x1.99999ap-5f);
    this.m.j -= ((moom.Dr.b(((float)((p2 * 0x1.70a3d8p-4f)))) * 0x1.99999ap-5f) + 0x1.99999ap-5f);
    this.l.h += (moom.Dr.a(((float)((p2 * 0x1.126e98p-4f)))) * 0x1.99999ap-5f);
    this.m.h -= (moom.Dr.a(((float)((p2 * 0x1.126e98p-4f)))) * 0x1.99999ap-5f);
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> int __sourceIntrinsic_8daaad6cbc4e_invokedynamic200028_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8daaad6cbc4e_invokedynamic200028_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8daaad6cbc4e_invokedynamic200028_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral7983_0() throws E;
}
