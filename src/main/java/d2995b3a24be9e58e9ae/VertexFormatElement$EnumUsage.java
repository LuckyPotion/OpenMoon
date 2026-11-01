package net.minecraft.client.renderer.vertex;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class VertexFormatElement$EnumUsage extends sourcebuild.EnumConstructor<net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage> {

public static net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage POSITION;

public static net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage NORMAL;

public static net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage COLOR;

public static net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage UV;

public static net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage MATRIX;

public static net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage BLEND_WEIGHT;

public static net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage PADDING;

private java.lang.String a;

private static net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage[] b;

private static long c;

private static long[] d;

private static java.lang.Integer[] e;

private static java.util.Map f;

private VertexFormatElement$EnumUsage(java.lang.String p0, int p1, java.lang.String p2) {
super(p0, p1);
    this.a = p2;
}


private static void initialize() {
c = ((long)(((moom._a)(moom._c.a(((long)(4390267601604266076L)), ((long)(-4674037573481914907L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(63629827988242L)))));
    long local11_life6 = (net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage.c ^ 91939265957810L);
    f = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill1177_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1177_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1177_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1177_14 = new byte[8];
    (__sourceSpill1177_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill1177_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation1177_16 = __sourceSpill1177_14;
    ((javax.crypto.Cipher)(__sourceSpill1177_11)).init(((int)(__sourceSpill1177_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1177_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1177_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[3];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "\033¬¢Ì_;$04'#]_PýËì\\j"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1177_25 = local4_life21;
        int __sourceSpill1177_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1177_25)).substring(((int)(__sourceSpill1177_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1177_30 = local6_life19;
        int __sourceSpill1177_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill1177_33 = new byte[8];
        (__sourceSpill1177_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill1177_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill1177_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill1177_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill1177_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill1177_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill1177_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill1177_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill1177_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill1177_34)).doFinal(((byte[])(__sourceSpill1177_33)));
        (__sourceSpill1177_30)[__sourceSpill1177_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    d = ((long[])(local6_life19));
    e = ((java.lang.Integer[])(new java.lang.Integer[3]));
    POSITION = ((net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage)(new net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage("POSITION", 0, "Position")));
    NORMAL = ((net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage)(new net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage("NORMAL", 1, "Normal")));
    COLOR = ((net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage)(new net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage("COLOR", 2, "Vertex Color")));
    UV = ((net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage)(new net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage("UV", 3, "UV")));
    MATRIX = ((net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage)(new net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage("MATRIX", 4, "Bone Matrix")));
    BLEND_WEIGHT = ((net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage)(new net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage("BLEND_WEIGHT", 5, "Blend Weight")));
    PADDING = ((net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage)(new net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage("PADDING", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1177_45(21989, (2428465001887967062L ^ local11_life6)), "Padding")));
    b = ((net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage[])(net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage.a__ArrayaK()));
}


public static net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage[] values() {
return ((net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage[])(((net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage[])(net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage.b)).clone()));
}


public static net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage valueOf(java.lang.String p0) {
return ((net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage.class)), ((java.lang.String)(p0)))));
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 3327;
      if (e[var3] == null) {
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
         long var5 = d[var3];
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
         Object[] var9 = (Object[])f.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               f.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/aK", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         e[var3] = var15;
      }

      return e[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10864_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/aK"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage[] a__ArrayaK() {
long local0_life1 = (net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage.c ^ 72943766016216L);
    net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage[] __sourceSharedArray1079_4 = new net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage[__sourceIntrinsic_33df443662af_originalDynamicSite1079_2(14504, (5398055463487903090L ^ local0_life1))];
    __sourceSharedArray1079_4[0] = net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage.POSITION;
    __sourceSharedArray1079_4[1] = net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage.NORMAL;
    __sourceSharedArray1079_4[2] = net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage.COLOR;
    __sourceSharedArray1079_4[3] = net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage.UV;
    __sourceSharedArray1079_4[4] = net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage.MATRIX;
    __sourceSharedArray1079_4[5] = net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage.BLEND_WEIGHT;
    __sourceSharedArray1079_4[__sourceIntrinsic_33df443662af_originalDynamicSite1079_10(2981, (590883491707528829L ^ local0_life1))] = net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage.PADDING;
    return __sourceSharedArray1079_4;
}


public java.lang.String a() {
return this.a;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1177_45(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10864_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_33df443662af_originalDynamicSite1079_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_33df443662af_originalDynamicSite1079_10(int a0, long a1) throws E;
}
