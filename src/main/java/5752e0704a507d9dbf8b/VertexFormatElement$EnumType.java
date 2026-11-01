package net.minecraft.client.renderer.vertex;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class VertexFormatElement$EnumType extends sourcebuild.EnumConstructor<net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType> {

public static net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType FLOAT;

public static net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType UBYTE;

public static net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType BYTE;

public static net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType USHORT;

public static net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType SHORT;

public static net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType UINT;

public static net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType INT;

private int a;

private java.lang.String b;

private int c;

private static net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType[] d;

private static long e;

private static long[] f;

private static java.lang.Integer[] g;

private static java.util.Map h;

private VertexFormatElement$EnumType(java.lang.String p0, int p1, int p2, java.lang.String p3, int p4) {
super(p0, p1);
    this.a = p2;
    this.b = p3;
    this.c = p4;
}


private static void initialize() {
e = ((long)(((moom._a)(moom._c.a(((long)(-7648373505604208932L)), ((long)(-2593401615653375784L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(8178259086249L)))));
    long local11_life6 = (net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType.e ^ 13779256587283L);
    h = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill1825_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1825_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1825_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1825_14 = new byte[8];
    (__sourceSpill1825_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill1825_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation1825_16 = __sourceSpill1825_14;
    ((javax.crypto.Cipher)(__sourceSpill1825_11)).init(((int)(__sourceSpill1825_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1825_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1825_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[10];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "T\013§­bNBþ\\g½ÿ¬%ÎírÔ\\(ñ\024N¸ï\000ÅoÓj¥Z\003öªÑê\026\020øþ\003E)\\½\034¬å3Øe\007EA"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1825_25 = local4_life21;
        int __sourceSpill1825_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1825_25)).substring(((int)(__sourceSpill1825_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1825_30 = local6_life19;
        int __sourceSpill1825_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill1825_33 = new byte[8];
        (__sourceSpill1825_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill1825_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill1825_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill1825_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill1825_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill1825_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill1825_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill1825_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill1825_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill1825_34)).doFinal(((byte[])(__sourceSpill1825_33)));
        (__sourceSpill1825_30)[__sourceSpill1825_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    local5_life23 = ((java.lang.String)((local4_life21 = "¢ ¬C{õ³\017ÚïðAÖt\177"))).length();
    local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1825_38 = local4_life21;
        int __sourceSpill1825_39 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1825_38)).substring(((int)(__sourceSpill1825_39)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1825_43 = local6_life19;
        int __sourceSpill1825_44 = local3_life20;
        local3_life20 += 1;
        long local8_life45 = (((((((((((long) (local7_life42)[0]) & 255L) << 56) | ((((long) (local7_life42)[1]) & 255L) << 48)) | ((((long) (local7_life42)[2]) & 255L) << 40)) | ((((long) (local7_life42)[3]) & 255L) << 32)) | ((((long) (local7_life42)[4]) & 255L) << 24)) | ((((long) (local7_life42)[5]) & 255L) << 16)) | ((((long) (local7_life42)[6]) & 255L) << 8)) | (((long) (local7_life42)[7]) & 255L));
        byte[] __sourceSpill1825_46 = new byte[8];
        (__sourceSpill1825_46)[0] = ((byte) ((int) (local8_life45 >>> 56)));
        (__sourceSpill1825_46)[1] = ((byte) ((int) (local8_life45 >>> 48)));
        (__sourceSpill1825_46)[2] = ((byte) ((int) (local8_life45 >>> 40)));
        (__sourceSpill1825_46)[3] = ((byte) ((int) (local8_life45 >>> 32)));
        (__sourceSpill1825_46)[4] = ((byte) ((int) (local8_life45 >>> 24)));
        (__sourceSpill1825_46)[5] = ((byte) ((int) (local8_life45 >>> 16)));
        (__sourceSpill1825_46)[6] = ((byte) ((int) (local8_life45 >>> 8)));
        (__sourceSpill1825_46)[7] = ((byte) ((int) local8_life45));
        javax.crypto.Cipher __sourceSpill1825_47 = local0_life9;
        byte[] local10_life49 = ((javax.crypto.Cipher)(__sourceSpill1825_47)).doFinal(((byte[])(__sourceSpill1825_46)));
        (__sourceSpill1825_43)[__sourceSpill1825_44] = (((((((((((long) (local10_life49)[0]) & 255L) << 56) | ((((long) (local10_life49)[1]) & 255L) << 48)) | ((((long) (local10_life49)[2]) & 255L) << 40)) | ((((long) (local10_life49)[3]) & 255L) << 32)) | ((((long) (local10_life49)[4]) & 255L) << 24)) | ((((long) (local10_life49)[5]) & 255L) << 16)) | ((((long) (local10_life49)[6]) & 255L) << 8)) | (((long) (local10_life49)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    f = ((long[])(local6_life19));
    g = ((java.lang.Integer[])(new java.lang.Integer[10]));
    FLOAT = ((net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType)(new net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType("FLOAT", 0, 4, "Float", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1825_52(28784, (4741154662416068997L ^ local11_life6)))));
    UBYTE = ((net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType)(new net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType("UBYTE", 1, 1, "Unsigned Byte", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1825_54(17476, (3793948020338066864L ^ local11_life6)))));
    BYTE = ((net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType)(new net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType("BYTE", 2, 1, "Byte", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1825_56(5871, (3297176080104740628L ^ local11_life6)))));
    USHORT = ((net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType)(new net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType("USHORT", 3, 2, "Unsigned Short", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1825_58(7956, (6889814944302784226L ^ local11_life6)))));
    SHORT = ((net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType)(new net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType("SHORT", 4, 2, "Short", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1825_60(15266, (2238495970421275216L ^ local11_life6)))));
    UINT = ((net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType)(new net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType("UINT", 5, 4, "Unsigned Int", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1825_62(19637, (4087414141258403140L ^ local11_life6)))));
    INT = ((net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType)(new net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType("INT", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1825_64(31600, (7388679310064171648L ^ local11_life6)), 4, "Int", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1825_65(1594, (8200021036671453133L ^ local11_life6)))));
    d = ((net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType[])(net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType.a__ArrayaJ()));
}


public static net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType[] values() {
return ((net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType[])(((net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType[])(net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType.d)).clone()));
}


public static net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType valueOf(java.lang.String p0) {
return ((net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType.class)), ((java.lang.String)(p0)))));
}


public int b() {
return this.c;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10863_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/aJ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 31583;
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
            throw new RuntimeException("moom/aJ", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
}


public int a() {
return this.a;
}


private static net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType[] a__ArrayaJ() {
long local0_life1 = (net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType.e ^ 66193290354817L);
    net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType[] __sourceSharedArray1078_4 = new net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType[__sourceIntrinsic_f93cc2ecdcce_originalDynamicSite1078_2(9992, (4917063084459143776L ^ local0_life1))];
    __sourceSharedArray1078_4[0] = net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType.FLOAT;
    __sourceSharedArray1078_4[1] = net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType.UBYTE;
    __sourceSharedArray1078_4[2] = net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType.BYTE;
    __sourceSharedArray1078_4[3] = net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType.USHORT;
    __sourceSharedArray1078_4[4] = net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType.SHORT;
    __sourceSharedArray1078_4[5] = net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType.UINT;
    __sourceSharedArray1078_4[__sourceIntrinsic_f93cc2ecdcce_originalDynamicSite1078_10(2781, (1286292495166447548L ^ local0_life1))] = net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType.INT;
    return __sourceSharedArray1078_4;
}


public java.lang.String a__String() {
return this.b;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1825_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1825_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1825_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1825_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1825_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1825_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1825_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1825_65(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10863_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f93cc2ecdcce_originalDynamicSite1078_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f93cc2ecdcce_originalDynamicSite1078_10(int a0, long a1) throws E;
}
