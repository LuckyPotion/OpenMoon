package net.minecraft.block;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class BlockStone$EnumType extends sourcebuild.EnumConstructor<net.minecraft.block.BlockStone$EnumType> implements net.minecraft.util.IStringSerializable {

public static net.minecraft.block.BlockStone$EnumType STONE;

public static net.minecraft.block.BlockStone$EnumType GRANITE;

public static net.minecraft.block.BlockStone$EnumType GRANITE_SMOOTH;

public static net.minecraft.block.BlockStone$EnumType DIORITE;

public static net.minecraft.block.BlockStone$EnumType DIORITE_SMOOTH;

public static net.minecraft.block.BlockStone$EnumType ANDESITE;

public static net.minecraft.block.BlockStone$EnumType ANDESITE_SMOOTH;

private static net.minecraft.block.BlockStone$EnumType[] a;

private int b;

private java.lang.String c;

private java.lang.String d;

private moom.fm e;

private static net.minecraft.block.BlockStone$EnumType[] f;

private static long g;

private static long[] h;

private static java.lang.Integer[] i;

private static java.util.Map j;

private BlockStone$EnumType(java.lang.String p0, int p1, int p2, moom.fm p3, java.lang.String p4) {
this(p0, p1, p2, p3, p4, p4);
    return;
}


private BlockStone$EnumType(java.lang.String p0, int p1, int p2, moom.fm p3, java.lang.String p4, java.lang.String p5) {
super(p0, p1);
    this.b = p2;
    this.c = p4;
    this.d = p5;
    this.e = p3;
}


private static void initialize() {
g = ((long)(((moom._a)(moom._c.a(((long)(-3158179221921915256L)), ((long)(6812566111210608896L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(74969471751081L)))));
    long local11_life6 = (net.minecraft.block.BlockStone$EnumType.g ^ 12901179249479L);
    j = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill1160_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1160_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1160_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1160_14 = new byte[8];
    (__sourceSpill1160_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill1160_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation1160_16 = __sourceSpill1160_14;
    ((javax.crypto.Cipher)(__sourceSpill1160_11)).init(((int)(__sourceSpill1160_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1160_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1160_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[3];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "Bª\033Ø\023ÏAC.ÚÝá-\001cozDJ"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1160_25 = local4_life21;
        int __sourceSpill1160_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1160_25)).substring(((int)(__sourceSpill1160_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1160_30 = local6_life19;
        int __sourceSpill1160_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill1160_33 = new byte[8];
        (__sourceSpill1160_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill1160_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill1160_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill1160_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill1160_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill1160_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill1160_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill1160_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill1160_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill1160_34)).doFinal(((byte[])(__sourceSpill1160_33)));
        (__sourceSpill1160_30)[__sourceSpill1160_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    h = ((long[])(local6_life19));
    i = ((java.lang.Integer[])(new java.lang.Integer[3]));
    STONE = ((net.minecraft.block.BlockStone$EnumType)(new net.minecraft.block.BlockStone$EnumType("STONE", 0, 0, moom.fm.m, "stone")));
    GRANITE = ((net.minecraft.block.BlockStone$EnumType)(new net.minecraft.block.BlockStone$EnumType("GRANITE", 1, 1, moom.fm.l, "granite")));
    GRANITE_SMOOTH = ((net.minecraft.block.BlockStone$EnumType)(new net.minecraft.block.BlockStone$EnumType("GRANITE_SMOOTH", 2, 2, moom.fm.l, "smooth_granite", "graniteSmooth")));
    DIORITE = ((net.minecraft.block.BlockStone$EnumType)(new net.minecraft.block.BlockStone$EnumType("DIORITE", 3, 3, moom.fm.p, "diorite")));
    DIORITE_SMOOTH = ((net.minecraft.block.BlockStone$EnumType)(new net.minecraft.block.BlockStone$EnumType("DIORITE_SMOOTH", 4, 4, moom.fm.p, "smooth_diorite", "dioriteSmooth")));
    ANDESITE = ((net.minecraft.block.BlockStone$EnumType)(new net.minecraft.block.BlockStone$EnumType("ANDESITE", 5, 5, moom.fm.m, "andesite")));
    ANDESITE_SMOOTH = ((net.minecraft.block.BlockStone$EnumType)(new net.minecraft.block.BlockStone$EnumType("ANDESITE_SMOOTH", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1160_51(15138, (893119774093789343L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1160_52(15138, (893119774093789343L ^ local11_life6)), moom.fm.m, "smooth_andesite", "andesiteSmooth")));
    f = ((net.minecraft.block.BlockStone$EnumType[])(net.minecraft.block.BlockStone$EnumType.a__Arrayan()));
    a = ((net.minecraft.block.BlockStone$EnumType[])(new net.minecraft.block.BlockStone$EnumType[(net.minecraft.block.BlockStone$EnumType.values()).length]));
    net.minecraft.block.BlockStone$EnumType[] local13_life60 = net.minecraft.block.BlockStone$EnumType.values();
    int local14_life61 = (local13_life60).length;
    int local15_life62 = 0;
    while ((local15_life62 < local14_life61)) {
        net.minecraft.block.BlockStone$EnumType local16_life63 = (local13_life60)[local15_life62];
        (net.minecraft.block.BlockStone$EnumType.a)[((net.minecraft.block.BlockStone$EnumType)(local16_life63)).a()] = local16_life63;
        local15_life62 += 1;
    }
}


public java.lang.String toString() {
return this.c;
}


public static net.minecraft.block.BlockStone$EnumType[] values() {
return ((net.minecraft.block.BlockStone$EnumType[])(((net.minecraft.block.BlockStone$EnumType[])(net.minecraft.block.BlockStone$EnumType.f)).clone()));
}


public static net.minecraft.block.BlockStone$EnumType valueOf(java.lang.String p0) {
return ((net.minecraft.block.BlockStone$EnumType)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.block.BlockStone$EnumType.class)), ((java.lang.String)(p0)))));
}


public java.lang.String b() {
return this.d;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.block.BlockStone$EnumType.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 13510;
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
            throw new RuntimeException("moom/an", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         i[var3] = var15;
      }

      return i[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10068_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/an"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public int a() {
return this.b;
}


public moom.fm a__fm() {
return this.e;
}


public static net.minecraft.block.BlockStone$EnumType a(int p0) {
int forwardValue4749_17_0;
    int spill4749_0;
    int spill4749_1;
    long life1_3;
    int[] life3_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (net.minecraft.block.BlockStone$EnumType.g ^ 37052092308932L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4749_0 = p0;
    if (!((life3_5 != null))) {
        forwardValue4749_17_0 = spill4749_0;
        break forward_join_17;
    }
    if (!((spill4749_0 >= 0))) {
        break forward_join_16;
    }
    spill4749_1 = p0;
    if (!((life3_5 != null))) {
        forwardValue4749_17_0 = spill4749_1;
        break forward_join_17;
    }
    if (!((spill4749_1 >= (net.minecraft.block.BlockStone$EnumType.a).length))) {
        break forward_join_18;
    }
    }
    forwardValue4749_17_0 = 0;
    }
    p0 = forwardValue4749_17_0;
    }
    return (net.minecraft.block.BlockStone$EnumType.a)[p0];
}


public java.lang.String a__String() {
return this.c;
}


private static net.minecraft.block.BlockStone$EnumType[] a__Arrayan() {
long local0_life1 = (net.minecraft.block.BlockStone$EnumType.g ^ 40669773914255L);
    net.minecraft.block.BlockStone$EnumType[] __sourceSharedArray1028_4 = new net.minecraft.block.BlockStone$EnumType[__sourceIntrinsic_bdcc49ce7911_originalDynamicSite1028_2(28604, (4181146786020536266L ^ local0_life1))];
    __sourceSharedArray1028_4[0] = net.minecraft.block.BlockStone$EnumType.STONE;
    __sourceSharedArray1028_4[1] = net.minecraft.block.BlockStone$EnumType.GRANITE;
    __sourceSharedArray1028_4[2] = net.minecraft.block.BlockStone$EnumType.GRANITE_SMOOTH;
    __sourceSharedArray1028_4[3] = net.minecraft.block.BlockStone$EnumType.DIORITE;
    __sourceSharedArray1028_4[4] = net.minecraft.block.BlockStone$EnumType.DIORITE_SMOOTH;
    __sourceSharedArray1028_4[5] = net.minecraft.block.BlockStone$EnumType.ANDESITE;
    __sourceSharedArray1028_4[__sourceIntrinsic_bdcc49ce7911_originalDynamicSite1028_10(13381, (3338604936222635057L ^ local0_life1))] = net.minecraft.block.BlockStone$EnumType.ANDESITE_SMOOTH;
    return __sourceSharedArray1028_4;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1160_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1160_52(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10068_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bdcc49ce7911_originalDynamicSite1028_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bdcc49ce7911_originalDynamicSite1028_10(int a0, long a1) throws E;
}
