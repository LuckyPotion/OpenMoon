package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class J5 {

private final int a;

private final int b;

private final int c;

private final java.lang.String d;

private static final long e;

private static final long[] f;

private static final java.lang.Integer[] g;

private static final java.util.Map h;

public J5(int p0, int p1, int p2, java.lang.String p3) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
    this.d = p3;
}


public J5(int p0, int p1, int p2) {
this(p0, p1, p2, null);
}


public J5(int p0, int p1) {
this(p0, p1, 0);
    return;
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(-2170037003786745372L)), ((long)(4878940511086770072L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(35306499455732L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.J5.e ^ 1536990923881L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill870_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill870_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill870_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill870_14 = new byte[8];
    (__sourceSpill870_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill870_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation870_16 = __sourceSpill870_14;
    ((javax.crypto.Cipher)(__sourceSpill870_11)).init(((int)(__sourceSpill870_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill870_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation870_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[6];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "GUÕd½ø/ëù9gúøqå¡AlZ\025\005\005W\032?wYÌø¹"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill870_25 = local6_life21;
        int __sourceSpill870_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill870_25)).substring(((int)(__sourceSpill870_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill870_30 = local8_life19;
        int __sourceSpill870_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill870_33 = new byte[8];
        (__sourceSpill870_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill870_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill870_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill870_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill870_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill870_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill870_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill870_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill870_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill870_34)).doFinal(((byte[])(__sourceSpill870_33)));
        (__sourceSpill870_30)[__sourceSpill870_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "ð\033ªg´\022%l;)\013äÄãê"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill870_38 = local6_life21;
        int __sourceSpill870_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill870_38)).substring(((int)(__sourceSpill870_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill870_43 = local8_life19;
        int __sourceSpill870_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill870_46 = new byte[8];
        (__sourceSpill870_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill870_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill870_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill870_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill870_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill870_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill870_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill870_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill870_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill870_47)).doFinal(((byte[])(__sourceSpill870_46)));
        (__sourceSpill870_43)[__sourceSpill870_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    f = ((long[])(local8_life19));
    g = ((java.lang.Integer[])(new java.lang.Integer[6]));
}


public java.lang.String toString() {
moom.J5 forwardValue2262_20_0;
    java.lang.String forwardValue2262_28_0;
    moom.J5 spill2262_0;
    long life1_3;
    int life3_5;
    forward_join_28: {
    forward_join_20: {
    forward_join_19: {
    life1_3 = (moom.J5.e ^ 25720570013422L);
    life3_5 = moom.J_.b();
    spill2262_0 = this;
    if (!((life3_5 == 0))) {
        forwardValue2262_20_0 = spill2262_0;
        break forward_join_20;
    }
    if (!((((moom.J5)(spill2262_0)).d == null))) {
        break forward_join_19;
    }
    forwardValue2262_28_0 = __sourceIntrinsic_a86c261fcdee_invokedynamic2262_6(this.a, this.b, this.c);
    break forward_join_28;
    }
    forwardValue2262_20_0 = this;
    }
    forwardValue2262_28_0 = __sourceIntrinsic_a86c261fcdee_invokedynamic2262_11(((moom.J5)(forwardValue2262_20_0)).a, this.b, this.c, this.d);
    }
    return forwardValue2262_28_0;
}


public int b() {
return this.b;
}


public int c() {
return this.c;
}


public int d() {
int forwardValue2261_35_0;
    int forwardValue2261_35_1;
    int forwardValue2261_81_0;
    int forwardValue2261_81_1;
    int forwardValue2261_82_0;
    int spill2261_0;
    int spill2261_1;
    long life1_3;
    int life3_5;
    forward_join_82: {
    forward_join_81: {
    forward_join_62: {
    forward_join_35: {
    forward_join_28: {
    life1_3 = (moom.J5.e ^ 116212874578462L);
    life3_5 = moom.J_.b();
    spill2261_0 = this.b;
    spill2261_1 = __sourceIntrinsic_e0f64934fe3a_invokedynamic2261_3(31793, (4838052915071285602L ^ life1_3));
    if (!((life3_5 == 0))) {
        forwardValue2261_35_0 = spill2261_0;
        forwardValue2261_35_1 = spill2261_1;
        break forward_join_35;
    }
    if (!((spill2261_0 > spill2261_1))) {
        break forward_join_28;
    }
    forwardValue2261_82_0 = ((this.a * __sourceIntrinsic_e0f64934fe3a_invokedynamic2261_5(32738, (3400371015173241523L ^ life1_3))) + this.b);
    break forward_join_82;
    }
    forwardValue2261_35_0 = this.c;
    forwardValue2261_35_1 = __sourceIntrinsic_e0f64934fe3a_invokedynamic2261_8(15464, (2289876950744414527L ^ life1_3));
    }
    if (!((life3_5 == 0))) {
        forwardValue2261_81_0 = forwardValue2261_35_0;
        forwardValue2261_81_1 = forwardValue2261_35_1;
        break forward_join_81;
    }
    if (!((forwardValue2261_35_0 > forwardValue2261_35_1))) {
        break forward_join_62;
    }
    forwardValue2261_82_0 = (((this.a * __sourceIntrinsic_e0f64934fe3a_invokedynamic2261_10(10362, (5728807350859312428L ^ life1_3))) + (this.b * __sourceIntrinsic_e0f64934fe3a_invokedynamic2261_12(12327, (1542902327173264759L ^ life1_3)))) + __sourceIntrinsic_e0f64934fe3a_invokedynamic2261_13(15464, (2289876950744414527L ^ life1_3)));
    break forward_join_82;
    }
    forwardValue2261_81_0 = ((this.a * __sourceIntrinsic_e0f64934fe3a_invokedynamic2261_15(10362, (5728807350859312428L ^ life1_3))) + (this.b * __sourceIntrinsic_e0f64934fe3a_invokedynamic2261_17(641, (9066091945689974739L ^ life1_3))));
    forwardValue2261_81_1 = this.c;
    }
    forwardValue2261_82_0 = (forwardValue2261_81_0 + forwardValue2261_81_1);
    }
    return forwardValue2261_82_0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 27441;
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
            throw new RuntimeException("moom/J5", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.J5.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5038_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/J5"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int a() {
return this.a;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_invokedynamic2262_6(int a0, int a1, int a2) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_invokedynamic2262_11(int a0, int a1, int a2, java.lang.String a3) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e0f64934fe3a_invokedynamic2261_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e0f64934fe3a_invokedynamic2261_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e0f64934fe3a_invokedynamic2261_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e0f64934fe3a_invokedynamic2261_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e0f64934fe3a_invokedynamic2261_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e0f64934fe3a_invokedynamic2261_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e0f64934fe3a_invokedynamic2261_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e0f64934fe3a_invokedynamic2261_17(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5038_0() throws E;
}
