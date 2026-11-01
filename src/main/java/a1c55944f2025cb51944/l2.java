package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class l2 {

private final moom.DD a;

private final net.minecraft.client.resources.model.ModelRotation b;

private final boolean c;

private final int d;

private static final long e;

private static final long[] f;

private static final java.lang.Integer[] g;

private static final java.util.Map h;

public l2(moom.DD p0, net.minecraft.client.resources.model.ModelRotation p1, boolean p2, int p3) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
    this.d = p3;
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(2239666713374356156L)), ((long)(7839799570925975573L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(227977533245692L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.l2.e ^ 112653289403598L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill913_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill913_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill913_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill913_14 = new byte[8];
    (__sourceSpill913_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill913_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation913_16 = __sourceSpill913_14;
    ((javax.crypto.Cipher)(__sourceSpill913_11)).init(((int)(__sourceSpill913_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill913_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation913_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "]<µÅ?x±9&5ý{¸äõ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill913_25 = local6_life21;
        int __sourceSpill913_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill913_25)).substring(((int)(__sourceSpill913_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill913_30 = local8_life19;
        int __sourceSpill913_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill913_33 = new byte[8];
        (__sourceSpill913_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill913_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill913_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill913_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill913_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill913_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill913_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill913_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill913_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill913_34)).doFinal(((byte[])(__sourceSpill913_33)));
        (__sourceSpill913_30)[__sourceSpill913_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    f = ((long[])(local8_life19));
    g = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


public boolean equals(java.lang.Object p0) {
int forwardValue3738_33_0;
    moom.l2 life2_12;
    forward_join_33: {
    forward_join_32: {
    forward_join_14: {
    forward_join_12: {
    forward_join_5: {
    if (!((this == p0))) {
        break forward_join_5;
    }
    return ((1) != 0);
    }
    if (!((((p0 instanceof moom.l2) ? 1 : 0) != 0))) {
        break forward_join_12;
    }
    life2_12 = ((moom.l2)(p0));
    break forward_join_14;
    }
    return ((0) != 0);
    }
    if (!(((moom.DD)(this.a)).equals(((java.lang.Object)(((moom.l2)(life2_12)).a))))) {
        break forward_join_32;
    }
    if (!((this.b == ((moom.l2)(life2_12)).b))) {
        break forward_join_32;
    }
    if (!((this.c == ((moom.l2)(life2_12)).c))) {
        break forward_join_32;
    }
    forwardValue3738_33_0 = 1;
    break forward_join_33;
    }
    forwardValue3738_33_0 = 0;
    }
    return ((forwardValue3738_33_0) != 0);
}


public int hashCode() {
long local1 = (moom.l2.e ^ 40303409189677L);
    int local3 = ((moom.DD)(this.a)).hashCode();
    local3 = ((__sourceIntrinsic_1861091996aa_invokedynamic6925_3(17995, (7067925517258006931L ^ local1)) * local3) + ((this.b != null) ? ((net.minecraft.client.resources.model.ModelRotation)(this.b)).hashCode() : 0));
    local3 = ((__sourceIntrinsic_1861091996aa_invokedynamic6925_7(26836, (4249174602318089997L ^ local1)) * local3) + (this.c ? 1 : 0));
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 20015;
      if (g[var3] == null) {
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
         long var5 = f[var3];
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
         Object[] var9 = (Object[])h.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               h.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/l2", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.l2.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8272_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/l2"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public int a() {
return this.d;
}


public boolean a__Boolean() {
return ((((this.c) ? 1 : 0)) != 0);
}


public net.minecraft.client.resources.model.ModelRotation a__aL() {
return this.b;
}


public moom.DD a__DD() {
return this.a;
}


private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic6925_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic6925_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8272_0() throws E;
}
