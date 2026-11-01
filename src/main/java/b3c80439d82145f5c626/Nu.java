package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Nu extends moom.Nq {

private int[][] e;

private static final long f;

private static final long[] h;

private static final java.lang.Integer[] l;

private static final java.util.Map m;

public Nu(java.lang.String p0) {
super(p0);
    (this).d();
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(-8857349049426208720L)), ((long)(-3628455291601531208L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(256973719667896L)))));
    m = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Nu.f ^ 24084338781509L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill738_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill738_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill738_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill738_14 = new byte[8];
    (__sourceSpill738_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill738_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation738_16 = __sourceSpill738_14;
    ((javax.crypto.Cipher)(__sourceSpill738_11)).init(((int)(__sourceSpill738_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill738_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation738_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Ý|:ÑW\033ÐÉtÙH©Ú<u²§\004¨^Ú¹"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill738_25 = local6_life21;
        int __sourceSpill738_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill738_25)).substring(((int)(__sourceSpill738_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill738_30 = local8_life19;
        int __sourceSpill738_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill738_33 = new byte[8];
        (__sourceSpill738_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill738_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill738_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill738_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill738_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill738_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill738_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill738_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill738_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill738_34)).doFinal(((byte[])(__sourceSpill738_33)));
        (__sourceSpill738_30)[__sourceSpill738_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    h = ((long[])(local8_life19));
    l = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Nu.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 7040;
      if (l[var3] == null) {
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
         long var5 = h[var3];
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
         Object[] var9 = (Object[])m.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               m.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/Nu", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         l[var3] = var15;
      }

      return l[var3];
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral6750_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Nu"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


protected void b(int p0) {
int[][] forwardValue2877_43_0;
    int forwardValue2877_43_1;
    int[][] spill2877_0;
    int spill2877_1;
    long life2_3;
    java.lang.String life4_5;
    int[][] life5_13;
    int[][] life6_22;
    forward_join_62: {
    forward_join_43: {
    forward_join_33: {
    life2_3 = (moom.Nu.f ^ 49749803631812L);
    life4_5 = moom.Nq.b__String();
    if (!((p0 >= (this.e).length))) {
        break forward_join_33;
    }
    life5_13 = this.e;
    life6_22 = new int[(p0 + __sourceIntrinsic_8dbec06774c4_invokedynamic2877_4(12470, (1070579221867938647L ^ life2_3)))][];
    java.lang.System.arraycopy(((java.lang.Object)(life5_13)), ((int)(0)), ((java.lang.Object)(life6_22)), ((int)(0)), ((int)((life5_13).length)));
    this.e = ((int[][])(life6_22));
    }
    spill2877_0 = this.e;
    spill2877_1 = p0;
    if (!((life4_5 != null))) {
        forwardValue2877_43_0 = spill2877_0;
        forwardValue2877_43_1 = spill2877_1;
        break forward_join_43;
    }
    if (!(((spill2877_0)[spill2877_1] == null))) {
        break forward_join_62;
    }
    forwardValue2877_43_0 = this.e;
    forwardValue2877_43_1 = p0;
    }
    (forwardValue2877_43_0)[forwardValue2877_43_1] = new int[] {__sourceIntrinsic_8dbec06774c4_invokedynamic2877_9(24853, (5472850186438152949L ^ life2_3)), __sourceIntrinsic_8dbec06774c4_invokedynamic2877_10(24853, (5472850186438152949L ^ life2_3))};
    }
    return;
}


protected void d() {
long local1 = (moom.Nu.f ^ 93707916185671L);
    this.e = ((int[][])(new int[][] {new int[] {__sourceIntrinsic_6cce62949456_originalDynamicSite1357_1(8602, (1863269937941333755L ^ local1)), __sourceIntrinsic_6cce62949456_originalDynamicSite1357_2(24853, (5472718224846128758L ^ local1))}}));
    return;
}


public int[] a__sourceReturn_d4d28024c9() {
int local1 = ((moom.Nu)(this)).a();
    return (this.e)[local1];
}


public void a(int p0, int p1) {
int forwardValue2876_38_0;
    int forwardValue2876_44_0;
    java.lang.String spill2876_0;
    int spill2876_1;
    int spill2876_2;
    int spill2876_3;
    long life3_3;
    int life6_7;
    java.lang.String life5_8;
    int[] life7_13;
    int life8_50;
    forward_join_49: {
    forward_join_44: {
    forward_join_38: {
    forward_join_28: {
    life3_3 = (moom.Nu.f ^ 140220223092819L);
    spill2876_0 = moom.Nq.b__String();
    life6_7 = ((moom.Nu)(this)).a();
    life5_8 = spill2876_0;
    life7_13 = (this.e)[life6_7];
    spill2876_1 = (life7_13)[0];
    if (!((life5_8 != null))) {
        forwardValue2876_38_0 = spill2876_1;
        break forward_join_38;
    }
    if (!((spill2876_1 == p0))) {
        break forward_join_28;
    }
    spill2876_2 = (life7_13)[1];
    if (!((life5_8 != null))) {
        forwardValue2876_38_0 = spill2876_2;
        break forward_join_38;
    }
    if (!((spill2876_2 != p1))) {
        break forward_join_49;
    }
    }
    (life7_13)[0] = p0;
    (life7_13)[1] = p1;
    forwardValue2876_38_0 = ((moom.Nu)(this)).b();
    }
    life8_50 = forwardValue2876_38_0;
    spill2876_3 = life8_50;
    if (!((life5_8 != null))) {
        forwardValue2876_44_0 = spill2876_3;
        break forward_join_44;
    }
    if (!((spill2876_3 >= 0))) {
        break forward_join_49;
    }
    forwardValue2876_44_0 = life8_50;
    }
    org.lwjgl.opengl.ARBShaderObjects.glUniform2iARB(((int)(forwardValue2876_44_0)), ((int)(p0)), ((int)(p1)));
    this.e();
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_8dbec06774c4_invokedynamic2877_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8dbec06774c4_invokedynamic2877_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8dbec06774c4_invokedynamic2877_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral6750_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6cce62949456_originalDynamicSite1357_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6cce62949456_originalDynamicSite1357_2(int a0, long a1) throws E;
}
