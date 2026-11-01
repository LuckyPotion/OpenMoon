package net.minecraft.block;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class BlockRailBase$EnumRailDirection extends sourcebuild.EnumConstructor<net.minecraft.block.BlockRailBase$EnumRailDirection> implements net.minecraft.util.IStringSerializable {

public static net.minecraft.block.BlockRailBase$EnumRailDirection NORTH_SOUTH;

public static net.minecraft.block.BlockRailBase$EnumRailDirection EAST_WEST;

public static net.minecraft.block.BlockRailBase$EnumRailDirection ASCENDING_EAST;

public static net.minecraft.block.BlockRailBase$EnumRailDirection ASCENDING_WEST;

public static net.minecraft.block.BlockRailBase$EnumRailDirection ASCENDING_NORTH;

public static net.minecraft.block.BlockRailBase$EnumRailDirection ASCENDING_SOUTH;

public static net.minecraft.block.BlockRailBase$EnumRailDirection SOUTH_EAST;

public static net.minecraft.block.BlockRailBase$EnumRailDirection SOUTH_WEST;

public static net.minecraft.block.BlockRailBase$EnumRailDirection NORTH_WEST;

public static net.minecraft.block.BlockRailBase$EnumRailDirection NORTH_EAST;

private static net.minecraft.block.BlockRailBase$EnumRailDirection[] a;

private int b;

private java.lang.String c;

private static net.minecraft.block.BlockRailBase$EnumRailDirection[] d;

private static long e;

private static long[] f;

private static java.lang.Integer[] g;

private static java.util.Map h;

private BlockRailBase$EnumRailDirection(java.lang.String p0, int p1, int p2, java.lang.String p3) {
super(p0, p1);
    this.b = p2;
    this.c = p3;
}


private static void initialize() {
e = ((long)(((moom._a)(moom._c.a(((long)(-2586409453771683063L)), ((long)(5586432356811982709L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(217715716342655L)))));
    long local11_life6 = (net.minecraft.block.BlockRailBase$EnumRailDirection.e ^ 83199145603472L);
    h = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill1755_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1755_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1755_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1755_14 = new byte[8];
    (__sourceSpill1755_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill1755_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation1755_16 = __sourceSpill1755_14;
    ((javax.crypto.Cipher)(__sourceSpill1755_11)).init(((int)(__sourceSpill1755_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1755_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1755_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[9];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "XØáX6\rÍ6P=aÍîEB9y·\0038?jzèX\030¹Yï\022»¨\035ÓDæÕHqvÛ:H\f8ç"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1755_25 = local4_life21;
        int __sourceSpill1755_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1755_25)).substring(((int)(__sourceSpill1755_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1755_30 = local6_life19;
        int __sourceSpill1755_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill1755_33 = new byte[8];
        (__sourceSpill1755_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill1755_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill1755_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill1755_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill1755_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill1755_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill1755_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill1755_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill1755_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill1755_34)).doFinal(((byte[])(__sourceSpill1755_33)));
        (__sourceSpill1755_30)[__sourceSpill1755_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    local5_life23 = ((java.lang.String)((local4_life21 = "ªæûá+\003Ç9#I[Ò P"))).length();
    local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1755_38 = local4_life21;
        int __sourceSpill1755_39 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1755_38)).substring(((int)(__sourceSpill1755_39)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1755_43 = local6_life19;
        int __sourceSpill1755_44 = local3_life20;
        local3_life20 += 1;
        long local8_life45 = (((((((((((long) (local7_life42)[0]) & 255L) << 56) | ((((long) (local7_life42)[1]) & 255L) << 48)) | ((((long) (local7_life42)[2]) & 255L) << 40)) | ((((long) (local7_life42)[3]) & 255L) << 32)) | ((((long) (local7_life42)[4]) & 255L) << 24)) | ((((long) (local7_life42)[5]) & 255L) << 16)) | ((((long) (local7_life42)[6]) & 255L) << 8)) | (((long) (local7_life42)[7]) & 255L));
        byte[] __sourceSpill1755_46 = new byte[8];
        (__sourceSpill1755_46)[0] = ((byte) ((int) (local8_life45 >>> 56)));
        (__sourceSpill1755_46)[1] = ((byte) ((int) (local8_life45 >>> 48)));
        (__sourceSpill1755_46)[2] = ((byte) ((int) (local8_life45 >>> 40)));
        (__sourceSpill1755_46)[3] = ((byte) ((int) (local8_life45 >>> 32)));
        (__sourceSpill1755_46)[4] = ((byte) ((int) (local8_life45 >>> 24)));
        (__sourceSpill1755_46)[5] = ((byte) ((int) (local8_life45 >>> 16)));
        (__sourceSpill1755_46)[6] = ((byte) ((int) (local8_life45 >>> 8)));
        (__sourceSpill1755_46)[7] = ((byte) ((int) local8_life45));
        javax.crypto.Cipher __sourceSpill1755_47 = local0_life9;
        byte[] local10_life49 = ((javax.crypto.Cipher)(__sourceSpill1755_47)).doFinal(((byte[])(__sourceSpill1755_46)));
        (__sourceSpill1755_43)[__sourceSpill1755_44] = (((((((((((long) (local10_life49)[0]) & 255L) << 56) | ((((long) (local10_life49)[1]) & 255L) << 48)) | ((((long) (local10_life49)[2]) & 255L) << 40)) | ((((long) (local10_life49)[3]) & 255L) << 32)) | ((((long) (local10_life49)[4]) & 255L) << 24)) | ((((long) (local10_life49)[5]) & 255L) << 16)) | ((((long) (local10_life49)[6]) & 255L) << 8)) | (((long) (local10_life49)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    f = ((long[])(local6_life19));
    g = ((java.lang.Integer[])(new java.lang.Integer[9]));
    NORTH_SOUTH = ((net.minecraft.block.BlockRailBase$EnumRailDirection)(new net.minecraft.block.BlockRailBase$EnumRailDirection("NORTH_SOUTH", 0, 0, "north_south")));
    EAST_WEST = ((net.minecraft.block.BlockRailBase$EnumRailDirection)(new net.minecraft.block.BlockRailBase$EnumRailDirection("EAST_WEST", 1, 1, "east_west")));
    ASCENDING_EAST = ((net.minecraft.block.BlockRailBase$EnumRailDirection)(new net.minecraft.block.BlockRailBase$EnumRailDirection("ASCENDING_EAST", 2, 2, "ascending_east")));
    ASCENDING_WEST = ((net.minecraft.block.BlockRailBase$EnumRailDirection)(new net.minecraft.block.BlockRailBase$EnumRailDirection("ASCENDING_WEST", 3, 3, "ascending_west")));
    ASCENDING_NORTH = ((net.minecraft.block.BlockRailBase$EnumRailDirection)(new net.minecraft.block.BlockRailBase$EnumRailDirection("ASCENDING_NORTH", 4, 4, "ascending_north")));
    ASCENDING_SOUTH = ((net.minecraft.block.BlockRailBase$EnumRailDirection)(new net.minecraft.block.BlockRailBase$EnumRailDirection("ASCENDING_SOUTH", 5, 5, "ascending_south")));
    SOUTH_EAST = ((net.minecraft.block.BlockRailBase$EnumRailDirection)(new net.minecraft.block.BlockRailBase$EnumRailDirection("SOUTH_EAST", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1755_58(3625, (5630641378168175934L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1755_59(3625, (5630641378168175934L ^ local11_life6)), "south_east")));
    SOUTH_WEST = ((net.minecraft.block.BlockRailBase$EnumRailDirection)(new net.minecraft.block.BlockRailBase$EnumRailDirection("SOUTH_WEST", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1755_61(16490, (6898091676546118527L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1755_62(16490, (6898091676546118527L ^ local11_life6)), "south_west")));
    NORTH_WEST = ((net.minecraft.block.BlockRailBase$EnumRailDirection)(new net.minecraft.block.BlockRailBase$EnumRailDirection("NORTH_WEST", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1755_64(22430, (6869342603997914250L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1755_65(22430, (6869342603997914250L ^ local11_life6)), "north_west")));
    NORTH_EAST = ((net.minecraft.block.BlockRailBase$EnumRailDirection)(new net.minecraft.block.BlockRailBase$EnumRailDirection("NORTH_EAST", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1755_67(1348, (8706418875990406741L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1755_68(1348, (8706418875990406741L ^ local11_life6)), "north_east")));
    d = ((net.minecraft.block.BlockRailBase$EnumRailDirection[])(net.minecraft.block.BlockRailBase$EnumRailDirection.a__ArrayX()));
    a = ((net.minecraft.block.BlockRailBase$EnumRailDirection[])(new net.minecraft.block.BlockRailBase$EnumRailDirection[(net.minecraft.block.BlockRailBase$EnumRailDirection.values()).length]));
    net.minecraft.block.BlockRailBase$EnumRailDirection[] local13_life75 = net.minecraft.block.BlockRailBase$EnumRailDirection.values();
    int local14_life76 = (local13_life75).length;
    int local15_life77 = 0;
    while ((local15_life77 < local14_life76)) {
        net.minecraft.block.BlockRailBase$EnumRailDirection local16_life78 = (local13_life75)[local15_life77];
        (net.minecraft.block.BlockRailBase$EnumRailDirection.a)[((net.minecraft.block.BlockRailBase$EnumRailDirection)(local16_life78)).a()] = local16_life78;
        local15_life77 += 1;
    }
}


public java.lang.String toString() {
return this.c;
}


public static net.minecraft.block.BlockRailBase$EnumRailDirection[] values() {
return ((net.minecraft.block.BlockRailBase$EnumRailDirection[])(((net.minecraft.block.BlockRailBase$EnumRailDirection[])(net.minecraft.block.BlockRailBase$EnumRailDirection.d)).clone()));
}


public static net.minecraft.block.BlockRailBase$EnumRailDirection valueOf(java.lang.String p0) {
return ((net.minecraft.block.BlockRailBase$EnumRailDirection)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.block.BlockRailBase$EnumRailDirection.class)), ((java.lang.String)(p0)))));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10037_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/X"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 6949;
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
            throw new RuntimeException("moom/X", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.block.BlockRailBase$EnumRailDirection.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public int a() {
return this.b;
}


public boolean a__Boolean() {
net.minecraft.block.BlockRailBase$EnumRailDirection forwardValue4724_13_0;
    net.minecraft.block.BlockRailBase$EnumRailDirection forwardValue4724_13_1;
    net.minecraft.block.BlockRailBase$EnumRailDirection forwardValue4724_18_0;
    net.minecraft.block.BlockRailBase$EnumRailDirection forwardValue4724_18_1;
    net.minecraft.block.BlockRailBase$EnumRailDirection forwardValue4724_23_0;
    net.minecraft.block.BlockRailBase$EnumRailDirection forwardValue4724_23_1;
    int forwardValue4724_27_0;
    net.minecraft.block.BlockRailBase$EnumRailDirection spill4724_0;
    net.minecraft.block.BlockRailBase$EnumRailDirection spill4724_1;
    long life1_3;
    int[] life3_5;
    forward_join_27: {
    forward_join_26: {
    forward_join_24: {
    forward_join_23: {
    forward_join_18: {
    forward_join_13: {
    life1_3 = (net.minecraft.block.BlockRailBase$EnumRailDirection.e ^ 66782278502708L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4724_0 = this;
    spill4724_1 = net.minecraft.block.BlockRailBase$EnumRailDirection.ASCENDING_NORTH;
    if (!((life3_5 != null))) {
        forwardValue4724_13_0 = spill4724_0;
        forwardValue4724_13_1 = spill4724_1;
        break forward_join_13;
    }
    if (!((spill4724_0 != spill4724_1))) {
        break forward_join_24;
    }
    forwardValue4724_13_0 = this;
    forwardValue4724_13_1 = net.minecraft.block.BlockRailBase$EnumRailDirection.ASCENDING_EAST;
    }
    if (!((life3_5 != null))) {
        forwardValue4724_18_0 = forwardValue4724_13_0;
        forwardValue4724_18_1 = forwardValue4724_13_1;
        break forward_join_18;
    }
    if (!((forwardValue4724_13_0 != forwardValue4724_13_1))) {
        break forward_join_24;
    }
    forwardValue4724_18_0 = this;
    forwardValue4724_18_1 = net.minecraft.block.BlockRailBase$EnumRailDirection.ASCENDING_SOUTH;
    }
    if (!((life3_5 != null))) {
        forwardValue4724_23_0 = forwardValue4724_18_0;
        forwardValue4724_23_1 = forwardValue4724_18_1;
        break forward_join_23;
    }
    if (!((forwardValue4724_18_0 != forwardValue4724_18_1))) {
        break forward_join_24;
    }
    forwardValue4724_23_0 = this;
    forwardValue4724_23_1 = net.minecraft.block.BlockRailBase$EnumRailDirection.ASCENDING_WEST;
    }
    if (!((forwardValue4724_23_0 == forwardValue4724_23_1))) {
        break forward_join_26;
    }
    }
    forwardValue4724_27_0 = 1;
    break forward_join_27;
    }
    forwardValue4724_27_0 = 0;
    }
    return ((forwardValue4724_27_0) != 0);
}


public static net.minecraft.block.BlockRailBase$EnumRailDirection a(int p0) {
int forwardValue4723_17_0;
    int spill4723_0;
    int spill4723_1;
    long life1_3;
    int[] life3_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (net.minecraft.block.BlockRailBase$EnumRailDirection.e ^ 94033980326053L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4723_0 = p0;
    if (!((life3_5 != null))) {
        forwardValue4723_17_0 = spill4723_0;
        break forward_join_17;
    }
    if (!((spill4723_0 >= 0))) {
        break forward_join_16;
    }
    spill4723_1 = p0;
    if (!((life3_5 != null))) {
        forwardValue4723_17_0 = spill4723_1;
        break forward_join_17;
    }
    if (!((spill4723_1 >= (net.minecraft.block.BlockRailBase$EnumRailDirection.a).length))) {
        break forward_join_18;
    }
    }
    forwardValue4723_17_0 = 0;
    }
    p0 = forwardValue4723_17_0;
    }
    return (net.minecraft.block.BlockRailBase$EnumRailDirection.a)[p0];
}


public java.lang.String a__String() {
return this.c;
}


private static net.minecraft.block.BlockRailBase$EnumRailDirection[] a__ArrayX() {
long local0_life1 = (net.minecraft.block.BlockRailBase$EnumRailDirection.e ^ 138560689956566L);
    net.minecraft.block.BlockRailBase$EnumRailDirection[] __sourceSharedArray1026_4 = new net.minecraft.block.BlockRailBase$EnumRailDirection[__sourceIntrinsic_0b3674289914_originalDynamicSite1026_2(9109, (2972060896974882760L ^ local0_life1))];
    __sourceSharedArray1026_4[0] = net.minecraft.block.BlockRailBase$EnumRailDirection.NORTH_SOUTH;
    __sourceSharedArray1026_4[1] = net.minecraft.block.BlockRailBase$EnumRailDirection.EAST_WEST;
    __sourceSharedArray1026_4[2] = net.minecraft.block.BlockRailBase$EnumRailDirection.ASCENDING_EAST;
    __sourceSharedArray1026_4[3] = net.minecraft.block.BlockRailBase$EnumRailDirection.ASCENDING_WEST;
    __sourceSharedArray1026_4[4] = net.minecraft.block.BlockRailBase$EnumRailDirection.ASCENDING_NORTH;
    __sourceSharedArray1026_4[5] = net.minecraft.block.BlockRailBase$EnumRailDirection.ASCENDING_SOUTH;
    __sourceSharedArray1026_4[__sourceIntrinsic_0b3674289914_originalDynamicSite1026_10(24528, (6750907410822871942L ^ local0_life1))] = net.minecraft.block.BlockRailBase$EnumRailDirection.SOUTH_EAST;
    __sourceSharedArray1026_4[__sourceIntrinsic_0b3674289914_originalDynamicSite1026_12(12809, (628281049287939673L ^ local0_life1))] = net.minecraft.block.BlockRailBase$EnumRailDirection.SOUTH_WEST;
    __sourceSharedArray1026_4[__sourceIntrinsic_0b3674289914_originalDynamicSite1026_14(15972, (1469390785909316145L ^ local0_life1))] = net.minecraft.block.BlockRailBase$EnumRailDirection.NORTH_WEST;
    __sourceSharedArray1026_4[__sourceIntrinsic_0b3674289914_originalDynamicSite1026_16(28395, (7827729378529315519L ^ local0_life1))] = net.minecraft.block.BlockRailBase$EnumRailDirection.NORTH_EAST;
    return __sourceSharedArray1026_4;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1755_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1755_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1755_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1755_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1755_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1755_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1755_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1755_68(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10037_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0b3674289914_originalDynamicSite1026_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0b3674289914_originalDynamicSite1026_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0b3674289914_originalDynamicSite1026_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0b3674289914_originalDynamicSite1026_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0b3674289914_originalDynamicSite1026_16(int a0, long a1) throws E;
}
