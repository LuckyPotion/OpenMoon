package net.minecraft.block;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class BlockLever$EnumOrientation extends sourcebuild.EnumConstructor<net.minecraft.block.BlockLever$EnumOrientation> implements net.minecraft.util.IStringSerializable {

public static net.minecraft.block.BlockLever$EnumOrientation DOWN_X;

public static net.minecraft.block.BlockLever$EnumOrientation EAST;

public static net.minecraft.block.BlockLever$EnumOrientation WEST;

public static net.minecraft.block.BlockLever$EnumOrientation SOUTH;

public static net.minecraft.block.BlockLever$EnumOrientation NORTH;

public static net.minecraft.block.BlockLever$EnumOrientation UP_Z;

public static net.minecraft.block.BlockLever$EnumOrientation UP_X;

public static net.minecraft.block.BlockLever$EnumOrientation DOWN_Z;

private static net.minecraft.block.BlockLever$EnumOrientation[] a;

private int b;

private java.lang.String c;

private moom.bs d;

private static net.minecraft.block.BlockLever$EnumOrientation[] e;

private static long f;

private static long[] g;

private static java.lang.Integer[] h;

private static java.util.Map i;

private BlockLever$EnumOrientation(java.lang.String p0, int p1, int p2, java.lang.String p3, moom.bs p4) {
super(p0, p1);
    this.b = p2;
    this.c = p3;
    this.d = p4;
}


private static void initialize() {
f = ((long)(((moom._a)(moom._c.a(((long)(-1582597435335019108L)), ((long)(-7947913312140882483L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(80070165295844L)))));
    long local11_life6 = (net.minecraft.block.BlockLever$EnumOrientation.f ^ 34534716858369L);
    i = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill1750_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1750_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1750_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1750_14 = new byte[8];
    (__sourceSpill1750_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill1750_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation1750_16 = __sourceSpill1750_14;
    ((javax.crypto.Cipher)(__sourceSpill1750_11)).init(((int)(__sourceSpill1750_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1750_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1750_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[5];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "\003Æ\022XÑ3¼UJÂ'c\tu,äB¨z¯ÀQ"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1750_25 = local4_life21;
        int __sourceSpill1750_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1750_25)).substring(((int)(__sourceSpill1750_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1750_30 = local6_life19;
        int __sourceSpill1750_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill1750_33 = new byte[8];
        (__sourceSpill1750_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill1750_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill1750_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill1750_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill1750_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill1750_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill1750_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill1750_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill1750_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill1750_34)).doFinal(((byte[])(__sourceSpill1750_33)));
        (__sourceSpill1750_30)[__sourceSpill1750_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    local5_life23 = ((java.lang.String)((local4_life21 = "Í8X\036^`0&\032¨#é£ë«"))).length();
    local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1750_38 = local4_life21;
        int __sourceSpill1750_39 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1750_38)).substring(((int)(__sourceSpill1750_39)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1750_43 = local6_life19;
        int __sourceSpill1750_44 = local3_life20;
        local3_life20 += 1;
        long local8_life45 = (((((((((((long) (local7_life42)[0]) & 255L) << 56) | ((((long) (local7_life42)[1]) & 255L) << 48)) | ((((long) (local7_life42)[2]) & 255L) << 40)) | ((((long) (local7_life42)[3]) & 255L) << 32)) | ((((long) (local7_life42)[4]) & 255L) << 24)) | ((((long) (local7_life42)[5]) & 255L) << 16)) | ((((long) (local7_life42)[6]) & 255L) << 8)) | (((long) (local7_life42)[7]) & 255L));
        byte[] __sourceSpill1750_46 = new byte[8];
        (__sourceSpill1750_46)[0] = ((byte) ((int) (local8_life45 >>> 56)));
        (__sourceSpill1750_46)[1] = ((byte) ((int) (local8_life45 >>> 48)));
        (__sourceSpill1750_46)[2] = ((byte) ((int) (local8_life45 >>> 40)));
        (__sourceSpill1750_46)[3] = ((byte) ((int) (local8_life45 >>> 32)));
        (__sourceSpill1750_46)[4] = ((byte) ((int) (local8_life45 >>> 24)));
        (__sourceSpill1750_46)[5] = ((byte) ((int) (local8_life45 >>> 16)));
        (__sourceSpill1750_46)[6] = ((byte) ((int) (local8_life45 >>> 8)));
        (__sourceSpill1750_46)[7] = ((byte) ((int) local8_life45));
        javax.crypto.Cipher __sourceSpill1750_47 = local0_life9;
        byte[] local10_life49 = ((javax.crypto.Cipher)(__sourceSpill1750_47)).doFinal(((byte[])(__sourceSpill1750_46)));
        (__sourceSpill1750_43)[__sourceSpill1750_44] = (((((((((((long) (local10_life49)[0]) & 255L) << 56) | ((((long) (local10_life49)[1]) & 255L) << 48)) | ((((long) (local10_life49)[2]) & 255L) << 40)) | ((((long) (local10_life49)[3]) & 255L) << 32)) | ((((long) (local10_life49)[4]) & 255L) << 24)) | ((((long) (local10_life49)[5]) & 255L) << 16)) | ((((long) (local10_life49)[6]) & 255L) << 8)) | (((long) (local10_life49)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    g = ((long[])(local6_life19));
    h = ((java.lang.Integer[])(new java.lang.Integer[5]));
    DOWN_X = ((net.minecraft.block.BlockLever$EnumOrientation)(new net.minecraft.block.BlockLever$EnumOrientation("DOWN_X", 0, 0, "down_x", moom.bs.DOWN)));
    EAST = ((net.minecraft.block.BlockLever$EnumOrientation)(new net.minecraft.block.BlockLever$EnumOrientation("EAST", 1, 1, "east", moom.bs.EAST)));
    WEST = ((net.minecraft.block.BlockLever$EnumOrientation)(new net.minecraft.block.BlockLever$EnumOrientation("WEST", 2, 2, "west", moom.bs.WEST)));
    SOUTH = ((net.minecraft.block.BlockLever$EnumOrientation)(new net.minecraft.block.BlockLever$EnumOrientation("SOUTH", 3, 3, "south", moom.bs.SOUTH)));
    NORTH = ((net.minecraft.block.BlockLever$EnumOrientation)(new net.minecraft.block.BlockLever$EnumOrientation("NORTH", 4, 4, "north", moom.bs.NORTH)));
    UP_Z = ((net.minecraft.block.BlockLever$EnumOrientation)(new net.minecraft.block.BlockLever$EnumOrientation("UP_Z", 5, 5, "up_z", moom.bs.UP)));
    UP_X = ((net.minecraft.block.BlockLever$EnumOrientation)(new net.minecraft.block.BlockLever$EnumOrientation("UP_X", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1750_64(21257, (1443744541778519129L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1750_65(21257, (1443744541778519129L ^ local11_life6)), "up_x", moom.bs.UP)));
    DOWN_Z = ((net.minecraft.block.BlockLever$EnumOrientation)(new net.minecraft.block.BlockLever$EnumOrientation("DOWN_Z", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1750_68(29310, (2780992103853131052L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1750_69(29310, (2780992103853131052L ^ local11_life6)), "down_z", moom.bs.DOWN)));
    e = ((net.minecraft.block.BlockLever$EnumOrientation[])(net.minecraft.block.BlockLever$EnumOrientation.a__ArrayQ()));
    a = ((net.minecraft.block.BlockLever$EnumOrientation[])(new net.minecraft.block.BlockLever$EnumOrientation[(net.minecraft.block.BlockLever$EnumOrientation.values()).length]));
    net.minecraft.block.BlockLever$EnumOrientation[] local13_life77 = net.minecraft.block.BlockLever$EnumOrientation.values();
    int local14_life78 = (local13_life77).length;
    int local15_life79 = 0;
    while ((local15_life79 < local14_life78)) {
        net.minecraft.block.BlockLever$EnumOrientation local16_life80 = (local13_life77)[local15_life79];
        (net.minecraft.block.BlockLever$EnumOrientation.a)[((net.minecraft.block.BlockLever$EnumOrientation)(local16_life80)).a()] = local16_life80;
        local15_life79 += 1;
    }
}


public java.lang.String toString() {
return this.c;
}


public static net.minecraft.block.BlockLever$EnumOrientation[] values() {
return ((net.minecraft.block.BlockLever$EnumOrientation[])(((net.minecraft.block.BlockLever$EnumOrientation[])(net.minecraft.block.BlockLever$EnumOrientation.e)).clone()));
}


public static net.minecraft.block.BlockLever$EnumOrientation valueOf(java.lang.String p0) {
return ((net.minecraft.block.BlockLever$EnumOrientation)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.block.BlockLever$EnumOrientation.class)), ((java.lang.String)(p0)))));
}


private static net.minecraft.block.BlockLever$EnumOrientation[] a__ArrayQ() {
long local0_life1 = (net.minecraft.block.BlockLever$EnumOrientation.f ^ 44928948622430L);
    net.minecraft.block.BlockLever$EnumOrientation[] __sourceSharedArray1024_4 = new net.minecraft.block.BlockLever$EnumOrientation[__sourceIntrinsic_d176074dd651_originalDynamicSite1024_2(1762, (8124617677511247336L ^ local0_life1))];
    __sourceSharedArray1024_4[0] = net.minecraft.block.BlockLever$EnumOrientation.DOWN_X;
    __sourceSharedArray1024_4[1] = net.minecraft.block.BlockLever$EnumOrientation.EAST;
    __sourceSharedArray1024_4[2] = net.minecraft.block.BlockLever$EnumOrientation.WEST;
    __sourceSharedArray1024_4[3] = net.minecraft.block.BlockLever$EnumOrientation.SOUTH;
    __sourceSharedArray1024_4[4] = net.minecraft.block.BlockLever$EnumOrientation.NORTH;
    __sourceSharedArray1024_4[5] = net.minecraft.block.BlockLever$EnumOrientation.UP_Z;
    __sourceSharedArray1024_4[__sourceIntrinsic_d176074dd651_originalDynamicSite1024_10(14228, (5279670972924392602L ^ local0_life1))] = net.minecraft.block.BlockLever$EnumOrientation.UP_X;
    __sourceSharedArray1024_4[__sourceIntrinsic_d176074dd651_originalDynamicSite1024_12(8224, (1922637899405189932L ^ local0_life1))] = net.minecraft.block.BlockLever$EnumOrientation.DOWN_Z;
    return __sourceSharedArray1024_4;
}


private static java.lang.IllegalArgumentException a(java.lang.IllegalArgumentException p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 25959;
      if (h[var3] == null) {
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
         long var5 = g[var3];
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
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/Q", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9997_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Q"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.block.BlockLever$EnumOrientation.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public int a() {
return this.b;
}


public moom.bs a__bs() {
return this.d;
}


public static net.minecraft.block.BlockLever$EnumOrientation a(int p0) {
int forwardValue4688_17_0;
    int spill4688_0;
    int spill4688_1;
    long life1_3;
    int[] life3_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (net.minecraft.block.BlockLever$EnumOrientation.f ^ 96262865357926L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4688_0 = p0;
    if (!((life3_5 != null))) {
        forwardValue4688_17_0 = spill4688_0;
        break forward_join_17;
    }
    if (!((spill4688_0 >= 0))) {
        break forward_join_16;
    }
    spill4688_1 = p0;
    if (!((life3_5 != null))) {
        forwardValue4688_17_0 = spill4688_1;
        break forward_join_17;
    }
    if (!((spill4688_1 >= (net.minecraft.block.BlockLever$EnumOrientation.a).length))) {
        break forward_join_18;
    }
    }
    forwardValue4688_17_0 = 0;
    }
    p0 = forwardValue4688_17_0;
    }
    return (net.minecraft.block.BlockLever$EnumOrientation.a)[p0];
}


public static net.minecraft.block.BlockLever$EnumOrientation a(moom.bs p0, moom.bs p1) {
int forwardValue436_18_0;
    int spill436_0;
    long life2_3;
    int[] life4_5;
    forward_join_55: {
    forward_join_53: {
    forward_join_51: {
    forward_join_49: {
    forward_join_47: {
    forward_join_40: {
    forward_join_38: {
    forward_join_36: {
    forward_join_30: {
    forward_join_23: {
    forward_join_21: {
    forward_join_19: {
    forward_join_18: {
    forward_join_13: {
    life2_3 = (net.minecraft.block.BlockLever$EnumOrientation.f ^ 125810112478906L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill436_0 = (moom.eY.a)[((moom.bs)(p0)).ordinal()];
    if (!((life4_5 != null))) {
        forwardValue436_18_0 = spill436_0;
        break forward_join_18;
    }
    switch (spill436_0) {
case 1:
{
        break forward_join_13;
    }
case 2:
{
        break forward_join_30;
    }
case 3:
{
        break forward_join_47;
    }
case 4:
{
        break forward_join_49;
    }
case 5:
{
        break forward_join_51;
    }
case 6:
{
        break forward_join_53;
    }
default:
{
        break forward_join_55;
    }
}
    }
    forwardValue436_18_0 = (moom.eY.c)[((net.minecraft.util.EnumFacing$Axis)(((moom.bs)(p1)).a__bt())).ordinal()];
    }
    switch (forwardValue436_18_0) {
case 1:
{
        break forward_join_19;
    }
case 2:
{
        break forward_join_21;
    }
default:
{
        break forward_join_23;
    }
}
    }
    return net.minecraft.block.BlockLever$EnumOrientation.DOWN_X;
    }
    return net.minecraft.block.BlockLever$EnumOrientation.DOWN_Z;
    }
    throw new java.lang.IllegalArgumentException(__sourceIntrinsic_9a3c545d6d7a_invokedynamic436_9(p1, p0));
    }
    switch ((moom.eY.c)[((net.minecraft.util.EnumFacing$Axis)(((moom.bs)(p1)).a__bt())).ordinal()]) {
case 1:
{
        break forward_join_36;
    }
case 2:
{
        break forward_join_38;
    }
default:
{
        break forward_join_40;
    }
}
    }
    return net.minecraft.block.BlockLever$EnumOrientation.UP_X;
    }
    return net.minecraft.block.BlockLever$EnumOrientation.UP_Z;
    }
    throw new java.lang.IllegalArgumentException(__sourceIntrinsic_9a3c545d6d7a_invokedynamic436_15(p1, p0));
    }
    return net.minecraft.block.BlockLever$EnumOrientation.NORTH;
    }
    return net.minecraft.block.BlockLever$EnumOrientation.SOUTH;
    }
    return net.minecraft.block.BlockLever$EnumOrientation.WEST;
    }
    return net.minecraft.block.BlockLever$EnumOrientation.EAST;
    }
    throw new java.lang.IllegalArgumentException(__sourceIntrinsic_9a3c545d6d7a_invokedynamic436_20(p0));
}


public java.lang.String a__String() {
return this.c;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1750_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1750_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1750_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1750_69(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9997_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9a3c545d6d7a_invokedynamic436_9(moom.bs a0, moom.bs a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9a3c545d6d7a_invokedynamic436_15(moom.bs a0, moom.bs a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9a3c545d6d7a_invokedynamic436_20(moom.bs a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d176074dd651_originalDynamicSite1024_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d176074dd651_originalDynamicSite1024_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d176074dd651_originalDynamicSite1024_12(int a0, long a1) throws E;
}
