package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class oF {

private static final org.apache.logging.log4j.Logger a;

private final net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType b;

private final net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage c;

private final int d;

private final int e;

private static int[] f;

private static final long g;

private static final long[] h;

private static final java.lang.Integer[] i;

private static final java.util.Map j;

public oF(int p0, net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType p1, net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage p2, int p3) {
super();
    if ((!this.a(((int)(p0)), ((net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage)(p2))))) {
        ((org.apache.logging.log4j.Logger)(moom.oF.a)).warn(((java.lang.String)("Multiple vertex elements of the same type other than UVs are not supported. Forcing type to UV.")));
        this.c = ((net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage)(net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage.UV));
    } else {
        this.c = ((net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage)(p2));
    }
    this.b = ((net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType)(p1));
    this.d = ((int)(p0));
    this.e = ((int)(p3));
    return;
}


static {
g = ((long)(((moom._a)(moom._c.a(((long)(5434209754094087249L)), ((long)(3930396300333511936L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(74318027441704L)))));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    java.lang.Object __sourceSpill952_7 = null;
    long local0_life8 = (moom.oF.g ^ 124354806959905L);
    moom.oF.b(((int[])(__sourceSpill952_7)));
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill952_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill952_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill952_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill952_16 = new byte[8];
    (__sourceSpill952_16)[0] = ((byte) ((int) (local0_life8 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill952_16)[local3_life17] = ((byte) ((int) ((local0_life8 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation952_18 = __sourceSpill952_16;
    ((javax.crypto.Cipher)(__sourceSpill952_13)).init(((int)(__sourceSpill952_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill952_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation952_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[2];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "\f\006ô>ß\036\007¾]Q\034,²t]"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill952_27 = local6_life23;
        int __sourceSpill952_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill952_27)).substring(((int)(__sourceSpill952_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill952_32 = local8_life21;
        int __sourceSpill952_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill952_35 = new byte[8];
        (__sourceSpill952_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill952_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill952_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill952_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill952_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill952_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill952_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill952_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill952_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill952_36)).doFinal(((byte[])(__sourceSpill952_35)));
        (__sourceSpill952_32)[__sourceSpill952_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    h = ((long[])(local8_life21));
    i = ((java.lang.Integer[])(new java.lang.Integer[2]));
    a = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
}


public boolean equals(java.lang.Object p0) {
int forwardValue3803_38_0;
    moom.oF life2_19;
    forward_join_39: {
    forward_join_38: {
    forward_join_37: {
    forward_join_5: {
    if (!((this == p0))) {
        break forward_join_5;
    }
    return ((1) != 0);
    }
    if (!((p0 != null))) {
        break forward_join_39;
    }
    if (!((((java.lang.Object)(this)).getClass() == ((java.lang.Object)(p0)).getClass()))) {
        break forward_join_39;
    }
    life2_19 = ((moom.oF)(p0));
    if (!((this.e == ((moom.oF)(life2_19)).e))) {
        break forward_join_37;
    }
    if (!((this.d == ((moom.oF)(life2_19)).d))) {
        break forward_join_37;
    }
    if (!((this.b == ((moom.oF)(life2_19)).b))) {
        break forward_join_37;
    }
    if (!((this.c == ((moom.oF)(life2_19)).c))) {
        break forward_join_37;
    }
    forwardValue3803_38_0 = 1;
    break forward_join_38;
    }
    forwardValue3803_38_0 = 0;
    }
    return ((forwardValue3803_38_0) != 0);
    }
    return ((0) != 0);
}


public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1575_5(this.e, ((net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage)(this.c)).a(), ((net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType)(this.b)).a__String());
}


public int hashCode() {
long local1 = (moom.oF.g ^ 84003191785095L);
    int local3 = ((net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType)(this.b)).hashCode();
    local3 = ((__sourceIntrinsic_1861091996aa_originalDynamicSite1576_3(6301, (1575768749581546981L ^ local1)) * local3) + ((net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage)(this.c)).hashCode());
    local3 = ((__sourceIntrinsic_1861091996aa_originalDynamicSite1576_6(32340, (9025288450825048877L ^ local1)) * local3) + this.d);
    local3 = ((__sourceIntrinsic_1861091996aa_originalDynamicSite1576_8(32340, (9025288450825048877L ^ local1)) * local3) + this.e);
    return local3;
}


public static int[] b__ArrayInt() {
return moom.oF.f;
}


public static void b(int[] p0) {
moom.oF.f = ((int[])(p0));
    return;
}


public final int b() {
return this.d;
}


public final int c() {
return (((net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType)(this.b)).a() * this.e);
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8549_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/oF"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.oF.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 28485;
      if (i[var3] == null) {
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
         Object[] var9 = (Object[])j.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               j.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/oF", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         i[var3] = var15;
      }

      return i[var3];
}


public final int a() {
return this.e;
}


public final boolean a__Boolean() {
return ((((this.c == net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage.POSITION) ? 1 : 0)) != 0);
}


public final net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType a__aJ() {
return this.b;
}


public final net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage a__aK() {
return this.c;
}


private boolean a(int p0, net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage p1) {
int forwardValue3802_8_0;
    forward_join_8: {
    forward_join_7: {
    forward_join_5: {
    if (!((p0 != 0))) {
        break forward_join_5;
    }
    if (!((p1 == net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage.UV))) {
        break forward_join_7;
    }
    }
    forwardValue3802_8_0 = 1;
    break forward_join_8;
    }
    forwardValue3802_8_0 = 0;
    }
    return ((forwardValue3802_8_0) != 0);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1575_5(int a0, java.lang.String a1, java.lang.String a2) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_originalDynamicSite1576_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_originalDynamicSite1576_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_originalDynamicSite1576_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8549_0() throws E;
}
