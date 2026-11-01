package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class ir {

private double a;

private double b;

private int c;

private int d;

private int e;

private int f;

private int g;

private static long h;

private static long[] i;

private static java.lang.Integer[] j;

private static java.util.Map k;

public ir(net.minecraft.client.Minecraft p0) { super(); }


private static void __sourceConstructorBody_a84a86f8014b98c3(moom.ir receiver, net.minecraft.client.Minecraft p0) throws Throwable {

long life2_3;

    int life4_19;

    int life5_23;

    forest_join_86: {

    forest_join_69: {

    forest_join_32: {

    life2_3 = (moom.ir.h ^ 111086775949100L);

    moom.ir.__sourceConstructorInit_a84a86f8014b98c3_0(((moom.ir)(receiver)));

    ((moom.ir)(receiver)).c = ((int)(((net.minecraft.client.Minecraft)(p0)).G));

    ((moom.ir)(receiver)).e = ((int)(((net.minecraft.client.Minecraft)(p0)).H));

    ((moom.ir)(receiver)).g = ((int)(1));

    life4_19 = ((((net.minecraft.client.Minecraft)(p0)).g__Boolean()) ? 1 : 0);

    life5_23 = ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(p0)).W)).aZ;

    if (!((life5_23 == 0))) {

        break forest_join_32;

    }

    life5_23 = __sourceIntrinsic_a84a86f8014b98c3_invokedynamic469_11(25253, (7505038024538800851L ^ life2_3));

    }

    forest_cycle_32: while (true) {

    if (!((((moom.ir)(receiver)).g < life5_23))) {

        break forest_join_69;

    }

    if (!(((((moom.ir)(receiver)).c / (((moom.ir)(receiver)).g + 1)) >= __sourceIntrinsic_a84a86f8014b98c3_invokedynamic469_15(13612, (1174170932243567961L ^ life2_3))))) {

        break forest_join_69;

    }

    if (!(((((moom.ir)(receiver)).e / (((moom.ir)(receiver)).g + 1)) >= __sourceIntrinsic_a84a86f8014b98c3_invokedynamic469_18(10074, (2342079699909314350L ^ life2_3))))) {

        break forest_join_69;

    }

    moom.ir __stackOp469_19_0 = receiver;

    ((moom.ir)(__stackOp469_19_0)).g = ((int)((((moom.ir)(__stackOp469_19_0)).g + 1)));

    continue forest_cycle_32;

    }

    }

    if (!((life4_19 != 0))) {

        break forest_join_86;

    }

    if (!(((((moom.ir)(receiver)).g % 2) != 0))) {

        break forest_join_86;

    }

    if (!((((moom.ir)(receiver)).g != 1))) {

        break forest_join_86;

    }

    moom.ir __stackOp469_24_0 = receiver;

    ((moom.ir)(__stackOp469_24_0)).g = ((int)((((moom.ir)(__stackOp469_24_0)).g - 1)));

    }

    ((moom.ir)(receiver)).a = ((double)((((double) ((moom.ir)(receiver)).c) / ((double) ((moom.ir)(receiver)).g))));

    ((moom.ir)(receiver)).b = ((double)((((double) ((moom.ir)(receiver)).e) / ((double) ((moom.ir)(receiver)).g))));

    ((moom.ir)(receiver)).c = ((int)(moom.Dr.d(((double)(((moom.ir)(receiver)).a)))));

    ((moom.ir)(receiver)).e = ((int)(moom.Dr.d(((double)(((moom.ir)(receiver)).b)))));

    ((moom.ir)(receiver)).f = ((int)(((moom.ir)(receiver)).e));

    ((moom.ir)(receiver)).d = ((int)(((moom.ir)(receiver)).c));

    return;

}



static {
h = ((long)(((moom._a)(moom._c.a(((long)(-4511894504961741468L)), ((long)(5565444907972153460L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(213478290189459L)))));
    k = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.ir.h ^ 71595212164852L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill885_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill885_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill885_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill885_14 = new byte[8];
    (__sourceSpill885_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill885_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation885_16 = __sourceSpill885_14;
    ((javax.crypto.Cipher)(__sourceSpill885_11)).init(((int)(__sourceSpill885_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill885_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation885_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ÿï¾8OgCÑ41¶Uþìg\026löÕ\017@="))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill885_25 = local6_life21;
        int __sourceSpill885_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill885_25)).substring(((int)(__sourceSpill885_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill885_30 = local8_life19;
        int __sourceSpill885_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill885_33 = new byte[8];
        (__sourceSpill885_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill885_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill885_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill885_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill885_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill885_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill885_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill885_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill885_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill885_34)).doFinal(((byte[])(__sourceSpill885_33)));
        (__sourceSpill885_30)[__sourceSpill885_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    i = ((long[])(local8_life19));
    j = ((java.lang.Integer[])(new java.lang.Integer[3]));
}

private static native <E extends Throwable> void __sourceConstructorInit_a84a86f8014b98c3_0(moom.ir a0) throws E;

public int b__Int() {
return this.e;
}


public double b() {
return this.b;
}


public int c() {
return this.g;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 5137;
      if (j[var3] == null) {
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
         long var5 = i[var3];
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
         Object[] var9 = (Object[])k.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               k.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/ir", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         j[var3] = var15;
      }

      return j[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.ir.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8077_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/ir"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public int a__Int() {
return this.c;
}


public double a() {
return this.a;
}


public void a__Void() {
this.c = ((int)(this.d));
    this.e = ((int)(this.f));
    return;
}


public void a(float p0) {
moom.ir __stackOp382_0_0 = this;
    ((moom.ir)(__stackOp382_0_0)).c = ((int)(((int) (((float) ((moom.ir)(__stackOp382_0_0)).c) * p0))));
    moom.ir __stackOp382_3_0 = this;
    ((moom.ir)(__stackOp382_3_0)).e = ((int)(((int) (((float) ((moom.ir)(__stackOp382_3_0)).e) * p0))));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_a84a86f8014b98c3_invokedynamic469_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a84a86f8014b98c3_invokedynamic469_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a84a86f8014b98c3_invokedynamic469_18(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8077_0() throws E;
}
