package net.minecraft.block;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class BlockStoneSlab$EnumType extends sourcebuild.EnumConstructor<net.minecraft.block.BlockStoneSlab$EnumType> implements net.minecraft.util.IStringSerializable {

public static net.minecraft.block.BlockStoneSlab$EnumType STONE;

public static net.minecraft.block.BlockStoneSlab$EnumType SAND;

public static net.minecraft.block.BlockStoneSlab$EnumType WOOD;

public static net.minecraft.block.BlockStoneSlab$EnumType COBBLESTONE;

public static net.minecraft.block.BlockStoneSlab$EnumType BRICK;

public static net.minecraft.block.BlockStoneSlab$EnumType SMOOTHBRICK;

public static net.minecraft.block.BlockStoneSlab$EnumType NETHERBRICK;

public static net.minecraft.block.BlockStoneSlab$EnumType QUARTZ;

private static net.minecraft.block.BlockStoneSlab$EnumType[] a;

private int b;

private moom.fm c;

private java.lang.String d;

private java.lang.String e;

private static net.minecraft.block.BlockStoneSlab$EnumType[] f;

private static long g;

private static long[] h;

private static java.lang.Integer[] i;

private static java.util.Map j;

private BlockStoneSlab$EnumType(java.lang.String p0, int p1, int p2, moom.fm p3, java.lang.String p4) {
this(p0, p1, p2, p3, p4, p4);
    return;
}


private BlockStoneSlab$EnumType(java.lang.String p0, int p1, int p2, moom.fm p3, java.lang.String p4, java.lang.String p5) {
super(p0, p1);
    this.b = p2;
    this.c = p3;
    this.d = p4;
    this.e = p5;
}


private static void initialize() {
g = ((long)(((moom._a)(moom._c.a(((long)(-2750130964705090988L)), ((long)(5481156238575728144L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(29463754519207L)))));
    long local11_life6 = (net.minecraft.block.BlockStoneSlab$EnumType.g ^ 45128749071222L);
    j = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill1760_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1760_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1760_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1760_14 = new byte[8];
    (__sourceSpill1760_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill1760_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation1760_16 = __sourceSpill1760_14;
    ((javax.crypto.Cipher)(__sourceSpill1760_11)).init(((int)(__sourceSpill1760_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1760_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1760_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[5];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "6¥¨¨\"ýEg´\027u£#NZ `v¼x\020V"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1760_25 = local4_life21;
        int __sourceSpill1760_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1760_25)).substring(((int)(__sourceSpill1760_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1760_30 = local6_life19;
        int __sourceSpill1760_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill1760_33 = new byte[8];
        (__sourceSpill1760_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill1760_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill1760_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill1760_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill1760_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill1760_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill1760_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill1760_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill1760_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill1760_34)).doFinal(((byte[])(__sourceSpill1760_33)));
        (__sourceSpill1760_30)[__sourceSpill1760_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    local5_life23 = ((java.lang.String)((local4_life21 = "gXJe\023Ù\0264~\033\034¯"))).length();
    local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1760_38 = local4_life21;
        int __sourceSpill1760_39 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1760_38)).substring(((int)(__sourceSpill1760_39)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1760_43 = local6_life19;
        int __sourceSpill1760_44 = local3_life20;
        local3_life20 += 1;
        long local8_life45 = (((((((((((long) (local7_life42)[0]) & 255L) << 56) | ((((long) (local7_life42)[1]) & 255L) << 48)) | ((((long) (local7_life42)[2]) & 255L) << 40)) | ((((long) (local7_life42)[3]) & 255L) << 32)) | ((((long) (local7_life42)[4]) & 255L) << 24)) | ((((long) (local7_life42)[5]) & 255L) << 16)) | ((((long) (local7_life42)[6]) & 255L) << 8)) | (((long) (local7_life42)[7]) & 255L));
        byte[] __sourceSpill1760_46 = new byte[8];
        (__sourceSpill1760_46)[0] = ((byte) ((int) (local8_life45 >>> 56)));
        (__sourceSpill1760_46)[1] = ((byte) ((int) (local8_life45 >>> 48)));
        (__sourceSpill1760_46)[2] = ((byte) ((int) (local8_life45 >>> 40)));
        (__sourceSpill1760_46)[3] = ((byte) ((int) (local8_life45 >>> 32)));
        (__sourceSpill1760_46)[4] = ((byte) ((int) (local8_life45 >>> 24)));
        (__sourceSpill1760_46)[5] = ((byte) ((int) (local8_life45 >>> 16)));
        (__sourceSpill1760_46)[6] = ((byte) ((int) (local8_life45 >>> 8)));
        (__sourceSpill1760_46)[7] = ((byte) ((int) local8_life45));
        javax.crypto.Cipher __sourceSpill1760_47 = local0_life9;
        byte[] local10_life49 = ((javax.crypto.Cipher)(__sourceSpill1760_47)).doFinal(((byte[])(__sourceSpill1760_46)));
        (__sourceSpill1760_43)[__sourceSpill1760_44] = (((((((((((long) (local10_life49)[0]) & 255L) << 56) | ((((long) (local10_life49)[1]) & 255L) << 48)) | ((((long) (local10_life49)[2]) & 255L) << 40)) | ((((long) (local10_life49)[3]) & 255L) << 32)) | ((((long) (local10_life49)[4]) & 255L) << 24)) | ((((long) (local10_life49)[5]) & 255L) << 16)) | ((((long) (local10_life49)[6]) & 255L) << 8)) | (((long) (local10_life49)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    h = ((long[])(local6_life19));
    i = ((java.lang.Integer[])(new java.lang.Integer[5]));
    STONE = ((net.minecraft.block.BlockStoneSlab$EnumType)(new net.minecraft.block.BlockStoneSlab$EnumType("STONE", 0, 0, moom.fm.m, "stone")));
    SAND = ((net.minecraft.block.BlockStoneSlab$EnumType)(new net.minecraft.block.BlockStoneSlab$EnumType("SAND", 1, 1, moom.fm.d, "sandstone", "sand")));
    WOOD = ((net.minecraft.block.BlockStoneSlab$EnumType)(new net.minecraft.block.BlockStoneSlab$EnumType("WOOD", 2, 2, moom.fm.o, "wood_old", "wood")));
    COBBLESTONE = ((net.minecraft.block.BlockStoneSlab$EnumType)(new net.minecraft.block.BlockStoneSlab$EnumType("COBBLESTONE", 3, 3, moom.fm.m, "cobblestone", "cobble")));
    BRICK = ((net.minecraft.block.BlockStoneSlab$EnumType)(new net.minecraft.block.BlockStoneSlab$EnumType("BRICK", 4, 4, moom.fm.D, "brick")));
    SMOOTHBRICK = ((net.minecraft.block.BlockStoneSlab$EnumType)(new net.minecraft.block.BlockStoneSlab$EnumType("SMOOTHBRICK", 5, 5, moom.fm.m, "stone_brick", "smoothStoneBrick")));
    NETHERBRICK = ((net.minecraft.block.BlockStoneSlab$EnumType)(new net.minecraft.block.BlockStoneSlab$EnumType("NETHERBRICK", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1760_64(4417, (3683267857965845300L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1760_65(14058, (1856660172611660958L ^ local11_life6)), moom.fm.K, "nether_brick", "netherBrick")));
    QUARTZ = ((net.minecraft.block.BlockStoneSlab$EnumType)(new net.minecraft.block.BlockStoneSlab$EnumType("QUARTZ", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1760_68(26919, (4594851158591435600L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1760_69(30905, (8126516867819594442L ^ local11_life6)), moom.fm.p, "quartz")));
    f = ((net.minecraft.block.BlockStoneSlab$EnumType[])(net.minecraft.block.BlockStoneSlab$EnumType.a__Arrayap()));
    a = ((net.minecraft.block.BlockStoneSlab$EnumType[])(new net.minecraft.block.BlockStoneSlab$EnumType[(net.minecraft.block.BlockStoneSlab$EnumType.values()).length]));
    net.minecraft.block.BlockStoneSlab$EnumType[] local13_life77 = net.minecraft.block.BlockStoneSlab$EnumType.values();
    int local14_life78 = (local13_life77).length;
    int local15_life79 = 0;
    while ((local15_life79 < local14_life78)) {
        net.minecraft.block.BlockStoneSlab$EnumType local16_life80 = (local13_life77)[local15_life79];
        (net.minecraft.block.BlockStoneSlab$EnumType.a)[((net.minecraft.block.BlockStoneSlab$EnumType)(local16_life80)).a()] = local16_life80;
        local15_life79 += 1;
    }
}


public java.lang.String toString() {
return this.d;
}


public static net.minecraft.block.BlockStoneSlab$EnumType[] values() {
return ((net.minecraft.block.BlockStoneSlab$EnumType[])(((net.minecraft.block.BlockStoneSlab$EnumType[])(net.minecraft.block.BlockStoneSlab$EnumType.f)).clone()));
}


public static net.minecraft.block.BlockStoneSlab$EnumType valueOf(java.lang.String p0) {
return ((net.minecraft.block.BlockStoneSlab$EnumType)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.block.BlockStoneSlab$EnumType.class)), ((java.lang.String)(p0)))));
}


public java.lang.String b() {
return this.e;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.block.BlockStoneSlab$EnumType.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 5320;
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
            throw new RuntimeException("moom/ap", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         i[var3] = var15;
      }

      return i[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10071_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/ap"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public int a() {
return this.b;
}


public moom.fm a__fm() {
return this.c;
}


public static net.minecraft.block.BlockStoneSlab$EnumType a(int p0) {
int forwardValue4751_17_0;
    int spill4751_0;
    int spill4751_1;
    long life1_3;
    int[] life3_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (net.minecraft.block.BlockStoneSlab$EnumType.g ^ 128818241930022L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4751_0 = p0;
    if (!((life3_5 != null))) {
        forwardValue4751_17_0 = spill4751_0;
        break forward_join_17;
    }
    if (!((spill4751_0 >= 0))) {
        break forward_join_16;
    }
    spill4751_1 = p0;
    if (!((life3_5 != null))) {
        forwardValue4751_17_0 = spill4751_1;
        break forward_join_17;
    }
    if (!((spill4751_1 >= (net.minecraft.block.BlockStoneSlab$EnumType.a).length))) {
        break forward_join_18;
    }
    }
    forwardValue4751_17_0 = 0;
    }
    p0 = forwardValue4751_17_0;
    }
    return (net.minecraft.block.BlockStoneSlab$EnumType.a)[p0];
}


public java.lang.String a__String() {
return this.d;
}


private static net.minecraft.block.BlockStoneSlab$EnumType[] a__Arrayap() {
long local0_life1 = (net.minecraft.block.BlockStoneSlab$EnumType.g ^ 70112411947201L);
    net.minecraft.block.BlockStoneSlab$EnumType[] __sourceSharedArray1029_4 = new net.minecraft.block.BlockStoneSlab$EnumType[__sourceIntrinsic_4bfb19bbdd01_originalDynamicSite1029_2(16649, (3009367029655466184L ^ local0_life1))];
    __sourceSharedArray1029_4[0] = net.minecraft.block.BlockStoneSlab$EnumType.STONE;
    __sourceSharedArray1029_4[1] = net.minecraft.block.BlockStoneSlab$EnumType.SAND;
    __sourceSharedArray1029_4[2] = net.minecraft.block.BlockStoneSlab$EnumType.WOOD;
    __sourceSharedArray1029_4[3] = net.minecraft.block.BlockStoneSlab$EnumType.COBBLESTONE;
    __sourceSharedArray1029_4[4] = net.minecraft.block.BlockStoneSlab$EnumType.BRICK;
    __sourceSharedArray1029_4[5] = net.minecraft.block.BlockStoneSlab$EnumType.SMOOTHBRICK;
    __sourceSharedArray1029_4[__sourceIntrinsic_4bfb19bbdd01_originalDynamicSite1029_10(14058, (1856670897046554409L ^ local0_life1))] = net.minecraft.block.BlockStoneSlab$EnumType.NETHERBRICK;
    __sourceSharedArray1029_4[__sourceIntrinsic_4bfb19bbdd01_originalDynamicSite1029_12(30905, (8126506692880714109L ^ local0_life1))] = net.minecraft.block.BlockStoneSlab$EnumType.QUARTZ;
    return __sourceSharedArray1029_4;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1760_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1760_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1760_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1760_69(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10071_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4bfb19bbdd01_originalDynamicSite1029_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4bfb19bbdd01_originalDynamicSite1029_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4bfb19bbdd01_originalDynamicSite1029_12(int a0, long a1) throws E;
}
