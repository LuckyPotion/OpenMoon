package net.minecraft.client.renderer.block.model;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class ItemCameraTransforms$TransformType extends sourcebuild.EnumConstructor<net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType> {

public static net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType NONE;

public static net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType THIRD_PERSON;

public static net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType FIRST_PERSON;

public static net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType HEAD;

public static net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType GUI;

public static net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType GROUND;

public static net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType FIXED;

private static net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType[] a;

private static long b;

private static long[] c;

private static java.lang.Integer[] d;

private static java.util.Map e;

private ItemCameraTransforms$TransformType(java.lang.String p0, int p1) {
super(p0, p1);
}


private static void initialize() {
b = ((long)(((moom._a)(moom._c.a(((long)(-5648818971485219779L)), ((long)(-9170784671191768764L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(208166511959974L)))));
    long local11_life6 = (net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType.b ^ 98189852667471L);
    e = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill1173_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1173_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1173_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1173_14 = new byte[8];
    (__sourceSpill1173_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill1173_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation1173_16 = __sourceSpill1173_14;
    ((javax.crypto.Cipher)(__sourceSpill1173_11)).init(((int)(__sourceSpill1173_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1173_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1173_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[3];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "réa½RVFf]ý>\"lÜ¤\013G!P¾À"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1173_25 = local4_life21;
        int __sourceSpill1173_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1173_25)).substring(((int)(__sourceSpill1173_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1173_30 = local6_life19;
        int __sourceSpill1173_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill1173_33 = new byte[8];
        (__sourceSpill1173_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill1173_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill1173_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill1173_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill1173_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill1173_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill1173_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill1173_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill1173_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill1173_34)).doFinal(((byte[])(__sourceSpill1173_33)));
        (__sourceSpill1173_30)[__sourceSpill1173_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    c = ((long[])(local6_life19));
    d = ((java.lang.Integer[])(new java.lang.Integer[3]));
    NONE = ((net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType)(new net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType("NONE", 0)));
    THIRD_PERSON = ((net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType)(new net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType("THIRD_PERSON", 1)));
    FIRST_PERSON = ((net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType)(new net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType("FIRST_PERSON", 2)));
    HEAD = ((net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType)(new net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType("HEAD", 3)));
    GUI = ((net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType)(new net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType("GUI", 4)));
    GROUND = ((net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType)(new net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType("GROUND", 5)));
    FIXED = ((net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType)(new net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType("FIXED", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1173_45(17032, (4493401543893201318L ^ local11_life6)))));
    a = ((net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType[])(net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType.a()));
}


public static net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType[] values() {
return ((net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType[])(((net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType[])(net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType.a)).clone()));
}


public static net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType valueOf(java.lang.String p0) {
return ((net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType.class)), ((java.lang.String)(p0)))));
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10717_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/aF"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 24207;
      if (d[var3] == null) {
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
         long var5 = c[var3];
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
         Object[] var9 = (Object[])e.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               e.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/aF", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         d[var3] = var15;
      }

      return d[var3];
}


private static net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType[] a() {
long local0_life1 = (net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType.b ^ 105917006933662L);
    net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType[] __sourceSharedArray1066_4 = new net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType[__sourceIntrinsic_0a2c2325cadc_originalDynamicSite1066_2(6831, (8842272694672550225L ^ local0_life1))];
    __sourceSharedArray1066_4[0] = net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType.NONE;
    __sourceSharedArray1066_4[1] = net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType.THIRD_PERSON;
    __sourceSharedArray1066_4[2] = net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType.FIRST_PERSON;
    __sourceSharedArray1066_4[3] = net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType.HEAD;
    __sourceSharedArray1066_4[4] = net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType.GUI;
    __sourceSharedArray1066_4[5] = net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType.GROUND;
    __sourceSharedArray1066_4[__sourceIntrinsic_0a2c2325cadc_originalDynamicSite1066_10(1807, (6107995264916190451L ^ local0_life1))] = net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType.FIXED;
    return __sourceSharedArray1066_4;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1173_45(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10717_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0a2c2325cadc_originalDynamicSite1066_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0a2c2325cadc_originalDynamicSite1066_10(int a0, long a1) throws E;
}
