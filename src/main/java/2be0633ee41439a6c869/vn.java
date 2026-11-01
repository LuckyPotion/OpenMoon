package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
class vn extends moom.uc {

private final moom.tl c;

private static final long d;

private static final long[] e;

private static final java.lang.Integer[] f;

private static final java.util.Map g;

public vn(moom.tl p0) {
super();
    this.c = p0;
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(-6645190365903879764L)), ((long)(-708180120635784316L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(1559541245784L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.vn.d ^ 40811331660038L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1079_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1079_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1079_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1079_14 = new byte[8];
    (__sourceSpill1079_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1079_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1079_16 = __sourceSpill1079_14;
    ((javax.crypto.Cipher)(__sourceSpill1079_11)).init(((int)(__sourceSpill1079_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1079_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1079_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ýRÁl¼ä&YÉ!FòÒdd¡"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1079_25 = local6_life21;
        int __sourceSpill1079_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1079_25)).substring(((int)(__sourceSpill1079_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1079_30 = local8_life19;
        int __sourceSpill1079_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1079_33 = new byte[8];
        (__sourceSpill1079_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1079_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1079_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1079_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1079_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1079_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1079_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1079_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1079_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1079_34)).doFinal(((byte[])(__sourceSpill1079_33)));
        (__sourceSpill1079_30)[__sourceSpill1079_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    e = ((long[])(local8_life19));
    f = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


public void c() {
int forwardValue4331_38_0;
    moom.tl forwardValue4331_53_0;
    java.util.Random forwardValue4331_54_0;
    int spill4331_0;
    int spill4331_1;
    java.util.Random spill4331_2;
    moom.tl spill4331_3;
    moom.tl spill4331_4;
    long life1_3;
    int life4_8;
    int life3_9;
    float life5_86;
    float life6_91;
    float life7_100;
    float life8_105;
    forward_join_85: {
    forward_join_54: {
    forward_join_53: {
    forward_join_51: {
    forward_join_38: {
    forward_join_27: {
    life1_3 = (moom.vn.d ^ 94593384218543L);
    spill4331_0 = moom.vR.c();
    life4_8 = ((moom.tl)(this.c)).c__sourceReturn_8abf5c6871();
    life3_9 = spill4331_0;
    spill4331_1 = life4_8;
    if (!((life3_9 == 0))) {
        forwardValue4331_38_0 = spill4331_1;
        break forward_join_38;
    }
    if (!((spill4331_1 > __sourceIntrinsic_5b7380e7aa7c_invokedynamic4331_4(1627, (8080529715584195744L ^ life1_3))))) {
        break forward_join_27;
    }
    ((moom.tl)(this.c)).b(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    if (!((life3_9 != 0))) {
        break forward_join_85;
    }
    }
    spill4331_2 = ((moom.tl)(this.c)).a__Random();
    if (!((life3_9 == 0))) {
        forwardValue4331_54_0 = spill4331_2;
        break forward_join_54;
    }
    forwardValue4331_38_0 = ((java.util.Random)(spill4331_2)).nextInt(((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic4331_9(6919, (5430199228894003709L ^ life1_3)))));
    }
    if (!((forwardValue4331_38_0 != 0))) {
        break forward_join_51;
    }
    spill4331_3 = this.c;
    if (!((life3_9 == 0))) {
        forwardValue4331_53_0 = spill4331_3;
        break forward_join_53;
    }
    if (!(moom.tl.a(((moom.tl)(spill4331_3))))) {
        break forward_join_51;
    }
    spill4331_4 = this.c;
    if (!((life3_9 == 0))) {
        forwardValue4331_53_0 = spill4331_4;
        break forward_join_53;
    }
    if (!((!((moom.tl)(spill4331_4)).Y()))) {
        break forward_join_85;
    }
    }
    forwardValue4331_53_0 = this.c;
    }
    forwardValue4331_54_0 = ((moom.tl)(forwardValue4331_53_0)).a__Random();
    }
    life5_86 = ((((java.util.Random)(forwardValue4331_54_0)).nextFloat() * 0x1.921fb6p1f) * 0x1.0p1f);
    life6_91 = (moom.Dr.b(((float)(life5_86))) * 0x1.99999ap-3f);
    life7_100 = (-0x1.99999ap-4f + (((java.util.Random)(((moom.tl)(this.c)).a__Random())).nextFloat() * 0x1.99999ap-3f));
    life8_105 = (moom.Dr.a(((float)(life5_86))) * 0x1.99999ap-3f);
    ((moom.tl)(this.c)).b(((float)(life6_91)), ((float)(life7_100)), ((float)(life8_105)));
    }
    return;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 10303;
      if (f[var3] == null) {
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
         long var5 = e[var3];
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
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/vn", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.vn.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9505_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/vn"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean() {
return ((1) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic4331_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic4331_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9505_0() throws E;
}
