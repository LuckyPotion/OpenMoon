package net.minecraft.client.renderer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class BlockModelRenderer$Orientation extends sourcebuild.EnumConstructor<net.minecraft.client.renderer.BlockModelRenderer$Orientation> {

public static net.minecraft.client.renderer.BlockModelRenderer$Orientation DOWN;

public static net.minecraft.client.renderer.BlockModelRenderer$Orientation UP;

public static net.minecraft.client.renderer.BlockModelRenderer$Orientation NORTH;

public static net.minecraft.client.renderer.BlockModelRenderer$Orientation SOUTH;

public static net.minecraft.client.renderer.BlockModelRenderer$Orientation WEST;

public static net.minecraft.client.renderer.BlockModelRenderer$Orientation EAST;

public static net.minecraft.client.renderer.BlockModelRenderer$Orientation FLIP_DOWN;

public static net.minecraft.client.renderer.BlockModelRenderer$Orientation FLIP_UP;

public static net.minecraft.client.renderer.BlockModelRenderer$Orientation FLIP_NORTH;

public static net.minecraft.client.renderer.BlockModelRenderer$Orientation FLIP_SOUTH;

public static net.minecraft.client.renderer.BlockModelRenderer$Orientation FLIP_WEST;

public static net.minecraft.client.renderer.BlockModelRenderer$Orientation FLIP_EAST;

private int a;

private static net.minecraft.client.renderer.BlockModelRenderer$Orientation[] b;

private static long c;

private static long[] d;

private static java.lang.Integer[] e;

private static java.util.Map f;

private BlockModelRenderer$Orientation(java.lang.String p0, int p1, moom.bs p2, boolean p3) {
super(p0, p1);

    this.a = ((int)((((moom.bs)(p2)).a() + (p3 ? (moom.bs.values()).length : 0))));
    return;
}


private static void initialize() {
c = ((long)(((moom._a)(moom._c.a(((long)(-6231644535632924288L)), ((long)(5446954019761367113L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(216052634105569L)))));
    long local11_life6 = (net.minecraft.client.renderer.BlockModelRenderer$Orientation.c ^ 21685191212125L);
    f = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill1805_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1805_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1805_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1805_14 = new byte[8];
    (__sourceSpill1805_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill1805_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation1805_16 = __sourceSpill1805_14;
    ((javax.crypto.Cipher)(__sourceSpill1805_11)).init(((int)(__sourceSpill1805_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1805_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1805_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[13];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "ÝÂ\037Ò£+ñ8\"¼¢\002w0!\027úsR<Ôk÷\"MÂ¥äÎ¼RC=\022Þ;½\006\036­¶\r~V²¢\037îÒ¹D\023ÄµDJû\030¿®*0ïâ\016ç\036kÌ\035\017"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1805_25 = local4_life21;
        int __sourceSpill1805_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1805_25)).substring(((int)(__sourceSpill1805_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1805_30 = local6_life19;
        int __sourceSpill1805_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill1805_33 = new byte[8];
        (__sourceSpill1805_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill1805_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill1805_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill1805_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill1805_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill1805_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill1805_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill1805_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill1805_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill1805_34)).doFinal(((byte[])(__sourceSpill1805_33)));
        (__sourceSpill1805_30)[__sourceSpill1805_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    local5_life23 = ((java.lang.String)((local4_life21 = "eà¹³Xv&éé$N"))).length();
    local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1805_38 = local4_life21;
        int __sourceSpill1805_39 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1805_38)).substring(((int)(__sourceSpill1805_39)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1805_43 = local6_life19;
        int __sourceSpill1805_44 = local3_life20;
        local3_life20 += 1;
        long local8_life45 = (((((((((((long) (local7_life42)[0]) & 255L) << 56) | ((((long) (local7_life42)[1]) & 255L) << 48)) | ((((long) (local7_life42)[2]) & 255L) << 40)) | ((((long) (local7_life42)[3]) & 255L) << 32)) | ((((long) (local7_life42)[4]) & 255L) << 24)) | ((((long) (local7_life42)[5]) & 255L) << 16)) | ((((long) (local7_life42)[6]) & 255L) << 8)) | (((long) (local7_life42)[7]) & 255L));
        byte[] __sourceSpill1805_46 = new byte[8];
        (__sourceSpill1805_46)[0] = ((byte) ((int) (local8_life45 >>> 56)));
        (__sourceSpill1805_46)[1] = ((byte) ((int) (local8_life45 >>> 48)));
        (__sourceSpill1805_46)[2] = ((byte) ((int) (local8_life45 >>> 40)));
        (__sourceSpill1805_46)[3] = ((byte) ((int) (local8_life45 >>> 32)));
        (__sourceSpill1805_46)[4] = ((byte) ((int) (local8_life45 >>> 24)));
        (__sourceSpill1805_46)[5] = ((byte) ((int) (local8_life45 >>> 16)));
        (__sourceSpill1805_46)[6] = ((byte) ((int) (local8_life45 >>> 8)));
        (__sourceSpill1805_46)[7] = ((byte) ((int) local8_life45));
        javax.crypto.Cipher __sourceSpill1805_47 = local0_life9;
        byte[] local10_life49 = ((javax.crypto.Cipher)(__sourceSpill1805_47)).doFinal(((byte[])(__sourceSpill1805_46)));
        (__sourceSpill1805_43)[__sourceSpill1805_44] = (((((((((((long) (local10_life49)[0]) & 255L) << 56) | ((((long) (local10_life49)[1]) & 255L) << 48)) | ((((long) (local10_life49)[2]) & 255L) << 40)) | ((((long) (local10_life49)[3]) & 255L) << 32)) | ((((long) (local10_life49)[4]) & 255L) << 24)) | ((((long) (local10_life49)[5]) & 255L) << 16)) | ((((long) (local10_life49)[6]) & 255L) << 8)) | (((long) (local10_life49)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    d = ((long[])(local6_life19));
    e = ((java.lang.Integer[])(new java.lang.Integer[13]));
    DOWN = ((net.minecraft.client.renderer.BlockModelRenderer$Orientation)(new net.minecraft.client.renderer.BlockModelRenderer$Orientation("DOWN", 0, moom.bs.DOWN, false)));
    UP = ((net.minecraft.client.renderer.BlockModelRenderer$Orientation)(new net.minecraft.client.renderer.BlockModelRenderer$Orientation("UP", 1, moom.bs.UP, false)));
    NORTH = ((net.minecraft.client.renderer.BlockModelRenderer$Orientation)(new net.minecraft.client.renderer.BlockModelRenderer$Orientation("NORTH", 2, moom.bs.NORTH, false)));
    SOUTH = ((net.minecraft.client.renderer.BlockModelRenderer$Orientation)(new net.minecraft.client.renderer.BlockModelRenderer$Orientation("SOUTH", 3, moom.bs.SOUTH, false)));
    WEST = ((net.minecraft.client.renderer.BlockModelRenderer$Orientation)(new net.minecraft.client.renderer.BlockModelRenderer$Orientation("WEST", 4, moom.bs.WEST, false)));
    EAST = ((net.minecraft.client.renderer.BlockModelRenderer$Orientation)(new net.minecraft.client.renderer.BlockModelRenderer$Orientation("EAST", 5, moom.bs.EAST, false)));
    FLIP_DOWN = ((net.minecraft.client.renderer.BlockModelRenderer$Orientation)(new net.minecraft.client.renderer.BlockModelRenderer$Orientation("FLIP_DOWN", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1805_64(21312, (1892208936121630486L ^ local11_life6)), moom.bs.DOWN, true)));
    FLIP_UP = ((net.minecraft.client.renderer.BlockModelRenderer$Orientation)(new net.minecraft.client.renderer.BlockModelRenderer$Orientation("FLIP_UP", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1805_67(30494, (124294517343345486L ^ local11_life6)), moom.bs.UP, true)));
    FLIP_NORTH = ((net.minecraft.client.renderer.BlockModelRenderer$Orientation)(new net.minecraft.client.renderer.BlockModelRenderer$Orientation("FLIP_NORTH", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1805_70(8393, (3979627573156875416L ^ local11_life6)), moom.bs.NORTH, true)));
    FLIP_SOUTH = ((net.minecraft.client.renderer.BlockModelRenderer$Orientation)(new net.minecraft.client.renderer.BlockModelRenderer$Orientation("FLIP_SOUTH", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1805_73(2723, (1964299506430027518L ^ local11_life6)), moom.bs.SOUTH, true)));
    FLIP_WEST = ((net.minecraft.client.renderer.BlockModelRenderer$Orientation)(new net.minecraft.client.renderer.BlockModelRenderer$Orientation("FLIP_WEST", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1805_76(4414, (5427490279013006700L ^ local11_life6)), moom.bs.WEST, true)));
    FLIP_EAST = ((net.minecraft.client.renderer.BlockModelRenderer$Orientation)(new net.minecraft.client.renderer.BlockModelRenderer$Orientation("FLIP_EAST", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1805_79(23534, (1692587075319723959L ^ local11_life6)), moom.bs.EAST, true)));
    b = ((net.minecraft.client.renderer.BlockModelRenderer$Orientation[])(net.minecraft.client.renderer.BlockModelRenderer$Orientation.a()));
}


public static net.minecraft.client.renderer.BlockModelRenderer$Orientation[] values() {
return ((net.minecraft.client.renderer.BlockModelRenderer$Orientation[])(((net.minecraft.client.renderer.BlockModelRenderer$Orientation[])(net.minecraft.client.renderer.BlockModelRenderer$Orientation.b)).clone()));
}


public static net.minecraft.client.renderer.BlockModelRenderer$Orientation valueOf(java.lang.String p0) {
return ((net.minecraft.client.renderer.BlockModelRenderer$Orientation)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.client.renderer.BlockModelRenderer$Orientation.class)), ((java.lang.String)(p0)))));
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10544_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/aB"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.renderer.BlockModelRenderer$Orientation.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 24405;
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
            throw new RuntimeException("moom/aB", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         e[var3] = var15;
      }

      return e[var3];
}


private static net.minecraft.client.renderer.BlockModelRenderer$Orientation[] a() {
long local0_life1 = (net.minecraft.client.renderer.BlockModelRenderer$Orientation.c ^ 102785717052638L);
    net.minecraft.client.renderer.BlockModelRenderer$Orientation[] __sourceSharedArray1060_4 = new net.minecraft.client.renderer.BlockModelRenderer$Orientation[__sourceIntrinsic_c8c10c88f4c0_originalDynamicSite1060_2(28139, (3445108362418264380L ^ local0_life1))];
    __sourceSharedArray1060_4[0] = net.minecraft.client.renderer.BlockModelRenderer$Orientation.DOWN;
    __sourceSharedArray1060_4[1] = net.minecraft.client.renderer.BlockModelRenderer$Orientation.UP;
    __sourceSharedArray1060_4[2] = net.minecraft.client.renderer.BlockModelRenderer$Orientation.NORTH;
    __sourceSharedArray1060_4[3] = net.minecraft.client.renderer.BlockModelRenderer$Orientation.SOUTH;
    __sourceSharedArray1060_4[4] = net.minecraft.client.renderer.BlockModelRenderer$Orientation.WEST;
    __sourceSharedArray1060_4[5] = net.minecraft.client.renderer.BlockModelRenderer$Orientation.EAST;
    __sourceSharedArray1060_4[__sourceIntrinsic_c8c10c88f4c0_originalDynamicSite1060_10(19861, (7845876086517053768L ^ local0_life1))] = net.minecraft.client.renderer.BlockModelRenderer$Orientation.FLIP_DOWN;
    __sourceSharedArray1060_4[__sourceIntrinsic_c8c10c88f4c0_originalDynamicSite1060_12(31148, (8264683599458438512L ^ local0_life1))] = net.minecraft.client.renderer.BlockModelRenderer$Orientation.FLIP_UP;
    __sourceSharedArray1060_4[__sourceIntrinsic_c8c10c88f4c0_originalDynamicSite1060_14(11932, (5357545090884917827L ^ local0_life1))] = net.minecraft.client.renderer.BlockModelRenderer$Orientation.FLIP_NORTH;
    __sourceSharedArray1060_4[__sourceIntrinsic_c8c10c88f4c0_originalDynamicSite1060_16(14857, (6381363760458747613L ^ local0_life1))] = net.minecraft.client.renderer.BlockModelRenderer$Orientation.FLIP_SOUTH;
    __sourceSharedArray1060_4[__sourceIntrinsic_c8c10c88f4c0_originalDynamicSite1060_18(24877, (2321552195091076603L ^ local0_life1))] = net.minecraft.client.renderer.BlockModelRenderer$Orientation.FLIP_WEST;
    __sourceSharedArray1060_4[__sourceIntrinsic_c8c10c88f4c0_originalDynamicSite1060_20(31664, (8263149685338312544L ^ local0_life1))] = net.minecraft.client.renderer.BlockModelRenderer$Orientation.FLIP_EAST;
    return __sourceSharedArray1060_4;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1805_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1805_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1805_70(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1805_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1805_76(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1805_79(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c8c10c88f4c0_originalDynamicSite1060_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c8c10c88f4c0_originalDynamicSite1060_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c8c10c88f4c0_originalDynamicSite1060_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c8c10c88f4c0_originalDynamicSite1060_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c8c10c88f4c0_originalDynamicSite1060_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c8c10c88f4c0_originalDynamicSite1060_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c8c10c88f4c0_originalDynamicSite1060_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10544_0() throws E;
}
