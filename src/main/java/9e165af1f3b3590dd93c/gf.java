package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class gf extends moom.gc {

private boolean r;

private java.lang.String s;

private moom.hX t;

private static long u;

private static long[] v;

private static java.lang.Integer[] w;

private static java.util.Map x;

public gf(moom.hX p0, int p1, int p2, int p3, java.lang.String p4, boolean p5) { super(0, 0, 0, 0, 0, (java.lang.String)null); }


private static void __sourceConstructorBody_8f92c073a3984a9c(moom.gf receiver, moom.hX p0, int p1, int p2, int p3, java.lang.String p4, boolean p5) throws Throwable {

long local7 = (moom.gf.u ^ 67136712106654L);

    moom.gf.__sourceConstructorInit_8f92c073a3984a9c_0(((moom.gf)(receiver)), ((int)(p1)), ((int)(p2)), ((int)(p3)), ((int)(__sourceIntrinsic_8f92c073a3984a9c_originalDynamicSite2767_1(18011, (6156165775584218611L ^ local7)))), ((int)(__sourceIntrinsic_8f92c073a3984a9c_originalDynamicSite2767_2(2104, (6776970834896585617L ^ local7)))), ((java.lang.String)("")));

    ((moom.gf)(receiver)).s = ((java.lang.String)(p4));

    ((moom.gf)(receiver)).r = ((boolean)(p5));

    ((moom.gf)(receiver)).k = ((java.lang.String)(((moom.gf)(receiver)).c()));

    ((moom.gf)(receiver)).t = ((moom.hX)(p0));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_8f92c073a3984a9c_0(moom.gf a0, int a1, int a2, int a3, int a4, int a5, java.lang.String a6) throws E;

static {
u = ((long)(((moom._a)(moom._c.a(((long)(-5481445296418922646L)), ((long)(7077446422657371140L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(32295498162392L)))));
    x = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.gf.u ^ 84091597815274L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill849_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill849_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill849_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill849_14 = new byte[8];
    (__sourceSpill849_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill849_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation849_16 = __sourceSpill849_14;
    ((javax.crypto.Cipher)(__sourceSpill849_11)).init(((int)(__sourceSpill849_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill849_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation849_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "öAÞ#]z·ÆPÕ\032Ò±\020"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill849_25 = local6_life21;
        int __sourceSpill849_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill849_25)).substring(((int)(__sourceSpill849_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill849_30 = local8_life19;
        int __sourceSpill849_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill849_33 = new byte[8];
        (__sourceSpill849_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill849_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill849_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill849_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill849_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill849_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill849_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill849_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill849_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill849_34)).doFinal(((byte[])(__sourceSpill849_33)));
        (__sourceSpill849_30)[__sourceSpill849_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    v = ((long[])(local8_life19));
    w = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral7754_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/gf"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 6288;
      if (w[var3] == null) {
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
         long var5 = v[var3];
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
         Object[] var9 = (Object[])x.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               x.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/gf", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         w[var3] = var15;
      }

      return w[var3];
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.gf.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private java.lang.String c() {
return __sourceIntrinsic_fe670a2392c4_invokedynamic6589_5(moom.oO.a(((java.lang.String)(this.s)), ((java.lang.Object[])(new java.lang.Object[0]))), (this.r ? moom.oO.a(((java.lang.String)("gui.yes")), ((java.lang.Object[])(new java.lang.Object[0]))) : moom.oO.a(((java.lang.String)("gui.no")), ((java.lang.Object[])(new java.lang.Object[0])))));
}


public boolean a__Boolean(net.minecraft.client.Minecraft p0, int p1, int p2) {
if (super.a__Boolean(((net.minecraft.client.Minecraft)(p0)), ((int)(p1)), ((int)(p2)))) {
        this.r = ((boolean)(((!this.r) ? true : false)));
        this.k = ((java.lang.String)(((moom.gf)(this)).c()));
        ((moom.hX)(this.t)).a(((int)(this.l)), ((boolean)(this.r)));
        return true;
    }
    return false;
}


public void a__sourceReturn_f633c984d8(boolean p0) {
this.r = ((boolean)(p0));
    this.k = ((java.lang.String)(((moom.gf)(this)).c()));
    ((moom.hX)(this.t)).a(((int)(this.l)), ((boolean)(p0)));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_8f92c073a3984a9c_originalDynamicSite2767_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8f92c073a3984a9c_originalDynamicSite2767_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral7754_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fe670a2392c4_invokedynamic6589_5(java.lang.String a0, java.lang.String a1) throws E;
}
