package net.minecraft.block;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class BlockHugeMushroom$EnumType extends sourcebuild.EnumConstructor<net.minecraft.block.BlockHugeMushroom$EnumType> implements net.minecraft.util.IStringSerializable {

public static net.minecraft.block.BlockHugeMushroom$EnumType NORTH_WEST;

public static net.minecraft.block.BlockHugeMushroom$EnumType NORTH;

public static net.minecraft.block.BlockHugeMushroom$EnumType NORTH_EAST;

public static net.minecraft.block.BlockHugeMushroom$EnumType WEST;

public static net.minecraft.block.BlockHugeMushroom$EnumType CENTER;

public static net.minecraft.block.BlockHugeMushroom$EnumType EAST;

public static net.minecraft.block.BlockHugeMushroom$EnumType SOUTH_WEST;

public static net.minecraft.block.BlockHugeMushroom$EnumType SOUTH;

public static net.minecraft.block.BlockHugeMushroom$EnumType SOUTH_EAST;

public static net.minecraft.block.BlockHugeMushroom$EnumType STEM;

public static net.minecraft.block.BlockHugeMushroom$EnumType ALL_INSIDE;

public static net.minecraft.block.BlockHugeMushroom$EnumType ALL_OUTSIDE;

public static net.minecraft.block.BlockHugeMushroom$EnumType ALL_STEM;

private static net.minecraft.block.BlockHugeMushroom$EnumType[] a;

private int b;

private java.lang.String c;

private static net.minecraft.block.BlockHugeMushroom$EnumType[] d;

private static long e;

private static long[] f;

private static java.lang.Integer[] g;

private static java.util.Map h;

private BlockHugeMushroom$EnumType(java.lang.String p0, int p1, int p2, java.lang.String p3) {
super(p0, p1);
    this.b = p2;
    this.c = p3;
}


private static void initialize() {
e = ((long)(((moom._a)(moom._c.a(((long)(-8267538010826926136L)), ((long)(608294772693996420L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(159536854857981L)))));
    long local11_life6 = (net.minecraft.block.BlockHugeMushroom$EnumType.e ^ 63760464271688L);
    h = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill1749_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1749_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1749_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1749_14 = new byte[8];
    (__sourceSpill1749_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill1749_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation1749_16 = __sourceSpill1749_14;
    ((javax.crypto.Cipher)(__sourceSpill1749_11)).init(((int)(__sourceSpill1749_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1749_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1749_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[18];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "A_J«4í¯¯Â\rn\017,èB)Ûw-!Y½À\031ø\020Óë\002~òjQUÌ²\013YJ°Ü²|MòAe¿½ßV½>á×ÂÎê$IUr+hKj¼Ñ\001\017\005©$Mä9Ö:ÚtÖ ø{È³<f£oÊÂ]ø\013_¯l6%k\027\024=\013´\035?&\032I²K"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1749_25 = local4_life21;
        int __sourceSpill1749_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1749_25)).substring(((int)(__sourceSpill1749_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1749_30 = local6_life19;
        int __sourceSpill1749_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill1749_33 = new byte[8];
        (__sourceSpill1749_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill1749_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill1749_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill1749_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill1749_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill1749_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill1749_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill1749_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill1749_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill1749_34)).doFinal(((byte[])(__sourceSpill1749_33)));
        (__sourceSpill1749_30)[__sourceSpill1749_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    local5_life23 = ((java.lang.String)((local4_life21 = "¤b®ØþîÓºá\034KÖ"))).length();
    local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1749_38 = local4_life21;
        int __sourceSpill1749_39 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1749_38)).substring(((int)(__sourceSpill1749_39)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1749_43 = local6_life19;
        int __sourceSpill1749_44 = local3_life20;
        local3_life20 += 1;
        long local8_life45 = (((((((((((long) (local7_life42)[0]) & 255L) << 56) | ((((long) (local7_life42)[1]) & 255L) << 48)) | ((((long) (local7_life42)[2]) & 255L) << 40)) | ((((long) (local7_life42)[3]) & 255L) << 32)) | ((((long) (local7_life42)[4]) & 255L) << 24)) | ((((long) (local7_life42)[5]) & 255L) << 16)) | ((((long) (local7_life42)[6]) & 255L) << 8)) | (((long) (local7_life42)[7]) & 255L));
        byte[] __sourceSpill1749_46 = new byte[8];
        (__sourceSpill1749_46)[0] = ((byte) ((int) (local8_life45 >>> 56)));
        (__sourceSpill1749_46)[1] = ((byte) ((int) (local8_life45 >>> 48)));
        (__sourceSpill1749_46)[2] = ((byte) ((int) (local8_life45 >>> 40)));
        (__sourceSpill1749_46)[3] = ((byte) ((int) (local8_life45 >>> 32)));
        (__sourceSpill1749_46)[4] = ((byte) ((int) (local8_life45 >>> 24)));
        (__sourceSpill1749_46)[5] = ((byte) ((int) (local8_life45 >>> 16)));
        (__sourceSpill1749_46)[6] = ((byte) ((int) (local8_life45 >>> 8)));
        (__sourceSpill1749_46)[7] = ((byte) ((int) local8_life45));
        javax.crypto.Cipher __sourceSpill1749_47 = local0_life9;
        byte[] local10_life49 = ((javax.crypto.Cipher)(__sourceSpill1749_47)).doFinal(((byte[])(__sourceSpill1749_46)));
        (__sourceSpill1749_43)[__sourceSpill1749_44] = (((((((((((long) (local10_life49)[0]) & 255L) << 56) | ((((long) (local10_life49)[1]) & 255L) << 48)) | ((((long) (local10_life49)[2]) & 255L) << 40)) | ((((long) (local10_life49)[3]) & 255L) << 32)) | ((((long) (local10_life49)[4]) & 255L) << 24)) | ((((long) (local10_life49)[5]) & 255L) << 16)) | ((((long) (local10_life49)[6]) & 255L) << 8)) | (((long) (local10_life49)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    f = ((long[])(local6_life19));
    g = ((java.lang.Integer[])(new java.lang.Integer[18]));
    NORTH_WEST = ((net.minecraft.block.BlockHugeMushroom$EnumType)(new net.minecraft.block.BlockHugeMushroom$EnumType("NORTH_WEST", 0, 1, "north_west")));
    NORTH = ((net.minecraft.block.BlockHugeMushroom$EnumType)(new net.minecraft.block.BlockHugeMushroom$EnumType("NORTH", 1, 2, "north")));
    NORTH_EAST = ((net.minecraft.block.BlockHugeMushroom$EnumType)(new net.minecraft.block.BlockHugeMushroom$EnumType("NORTH_EAST", 2, 3, "north_east")));
    WEST = ((net.minecraft.block.BlockHugeMushroom$EnumType)(new net.minecraft.block.BlockHugeMushroom$EnumType("WEST", 3, 4, "west")));
    CENTER = ((net.minecraft.block.BlockHugeMushroom$EnumType)(new net.minecraft.block.BlockHugeMushroom$EnumType("CENTER", 4, 5, "center")));
    EAST = ((net.minecraft.block.BlockHugeMushroom$EnumType)(new net.minecraft.block.BlockHugeMushroom$EnumType("EAST", 5, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1749_57(68, (3093499696856201827L ^ local11_life6)), "east")));
    SOUTH_WEST = ((net.minecraft.block.BlockHugeMushroom$EnumType)(new net.minecraft.block.BlockHugeMushroom$EnumType("SOUTH_WEST", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1749_59(20079, (8142047687278572608L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1749_60(3330, (3628700152585320226L ^ local11_life6)), "south_west")));
    SOUTH = ((net.minecraft.block.BlockHugeMushroom$EnumType)(new net.minecraft.block.BlockHugeMushroom$EnumType("SOUTH", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1749_62(32381, (5803727905823392853L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1749_63(32463, (3645645481776612577L ^ local11_life6)), "south")));
    SOUTH_EAST = ((net.minecraft.block.BlockHugeMushroom$EnumType)(new net.minecraft.block.BlockHugeMushroom$EnumType("SOUTH_EAST", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1749_65(986, (4281287342757247473L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1749_66(11976, (1512822633519043836L ^ local11_life6)), "south_east")));
    STEM = ((net.minecraft.block.BlockHugeMushroom$EnumType)(new net.minecraft.block.BlockHugeMushroom$EnumType("STEM", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1749_68(26934, (6893524183318139669L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1749_69(14413, (8465652164869341816L ^ local11_life6)), "stem")));
    ALL_INSIDE = ((net.minecraft.block.BlockHugeMushroom$EnumType)(new net.minecraft.block.BlockHugeMushroom$EnumType("ALL_INSIDE", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1749_71(11251, (2053154977992233429L ^ local11_life6)), 0, "all_inside")));
    ALL_OUTSIDE = ((net.minecraft.block.BlockHugeMushroom$EnumType)(new net.minecraft.block.BlockHugeMushroom$EnumType("ALL_OUTSIDE", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1749_73(28370, (3534369316065875195L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1749_74(14354, (8199003270674956851L ^ local11_life6)), "all_outside")));
    ALL_STEM = ((net.minecraft.block.BlockHugeMushroom$EnumType)(new net.minecraft.block.BlockHugeMushroom$EnumType("ALL_STEM", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1749_76(3350, (7659457938332350268L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1749_77(916, (4836108159585155513L ^ local11_life6)), "all_stem")));
    d = ((net.minecraft.block.BlockHugeMushroom$EnumType[])(net.minecraft.block.BlockHugeMushroom$EnumType.a__ArrayP()));
    a = ((net.minecraft.block.BlockHugeMushroom$EnumType[])(new net.minecraft.block.BlockHugeMushroom$EnumType[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1749_81(24033, (1576822108979406797L ^ local11_life6))]));
    net.minecraft.block.BlockHugeMushroom$EnumType[] local13_life84 = net.minecraft.block.BlockHugeMushroom$EnumType.values();
    int local14_life85 = (local13_life84).length;
    int local15_life86 = 0;
    while ((local15_life86 < local14_life85)) {
        net.minecraft.block.BlockHugeMushroom$EnumType local16_life87 = (local13_life84)[local15_life86];
        (net.minecraft.block.BlockHugeMushroom$EnumType.a)[((net.minecraft.block.BlockHugeMushroom$EnumType)(local16_life87)).a()] = local16_life87;
        local15_life86 += 1;
    }
}


public java.lang.String toString() {
return this.c;
}


public static net.minecraft.block.BlockHugeMushroom$EnumType[] values() {
return ((net.minecraft.block.BlockHugeMushroom$EnumType[])(((net.minecraft.block.BlockHugeMushroom$EnumType[])(net.minecraft.block.BlockHugeMushroom$EnumType.d)).clone()));
}


public static net.minecraft.block.BlockHugeMushroom$EnumType valueOf(java.lang.String p0) {
return ((net.minecraft.block.BlockHugeMushroom$EnumType)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.block.BlockHugeMushroom$EnumType.class)), ((java.lang.String)(p0)))));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9995_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/P"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 22143;
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
            throw new RuntimeException("moom/P", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.block.BlockHugeMushroom$EnumType.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public int a() {
return this.b;
}


public static net.minecraft.block.BlockHugeMushroom$EnumType a(int p0) {
int forwardValue4687_17_0;
    net.minecraft.block.BlockHugeMushroom$EnumType forwardValue4687_29_0;
    net.minecraft.block.BlockHugeMushroom$EnumType forwardValue4687_31_0;
    int spill4687_0;
    int spill4687_1;
    net.minecraft.block.BlockHugeMushroom$EnumType spill4687_2;
    long life1_3;
    int[] life3_5;
    net.minecraft.block.BlockHugeMushroom$EnumType life4_33;
    forward_join_31: {
    forward_join_30: {
    forward_join_29: {
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (net.minecraft.block.BlockHugeMushroom$EnumType.e ^ 118266438105101L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4687_0 = p0;
    if (!((life3_5 != null))) {
        forwardValue4687_17_0 = spill4687_0;
        break forward_join_17;
    }
    if (!((spill4687_0 >= 0))) {
        break forward_join_16;
    }
    spill4687_1 = p0;
    if (!((life3_5 != null))) {
        forwardValue4687_17_0 = spill4687_1;
        break forward_join_17;
    }
    if (!((spill4687_1 >= (net.minecraft.block.BlockHugeMushroom$EnumType.a).length))) {
        break forward_join_18;
    }
    }
    forwardValue4687_17_0 = 0;
    }
    p0 = forwardValue4687_17_0;
    }
    life4_33 = (net.minecraft.block.BlockHugeMushroom$EnumType.a)[p0];
    spill4687_2 = life4_33;
    if (!((life3_5 != null))) {
        forwardValue4687_29_0 = spill4687_2;
        break forward_join_29;
    }
    if (!((spill4687_2 == null))) {
        break forward_join_30;
    }
    forwardValue4687_29_0 = (net.minecraft.block.BlockHugeMushroom$EnumType.a)[0];
    }
    forwardValue4687_31_0 = forwardValue4687_29_0;
    break forward_join_31;
    }
    forwardValue4687_31_0 = life4_33;
    }
    return forwardValue4687_31_0;
}


public java.lang.String a__String() {
return this.c;
}


private static net.minecraft.block.BlockHugeMushroom$EnumType[] a__ArrayP() {
long local0_life1 = (net.minecraft.block.BlockHugeMushroom$EnumType.e ^ 54164519166774L);
    net.minecraft.block.BlockHugeMushroom$EnumType[] __sourceSharedArray1023_4 = new net.minecraft.block.BlockHugeMushroom$EnumType[__sourceIntrinsic_2a4fa6c96f80_originalDynamicSite1023_2(14743, (1327301853359061452L ^ local0_life1))];
    __sourceSharedArray1023_4[0] = net.minecraft.block.BlockHugeMushroom$EnumType.NORTH_WEST;
    __sourceSharedArray1023_4[1] = net.minecraft.block.BlockHugeMushroom$EnumType.NORTH;
    __sourceSharedArray1023_4[2] = net.minecraft.block.BlockHugeMushroom$EnumType.NORTH_EAST;
    __sourceSharedArray1023_4[3] = net.minecraft.block.BlockHugeMushroom$EnumType.WEST;
    __sourceSharedArray1023_4[4] = net.minecraft.block.BlockHugeMushroom$EnumType.CENTER;
    __sourceSharedArray1023_4[5] = net.minecraft.block.BlockHugeMushroom$EnumType.EAST;
    __sourceSharedArray1023_4[__sourceIntrinsic_2a4fa6c96f80_originalDynamicSite1023_10(20079, (8142039210274704958L ^ local0_life1))] = net.minecraft.block.BlockHugeMushroom$EnumType.SOUTH_WEST;
    __sourceSharedArray1023_4[__sourceIntrinsic_2a4fa6c96f80_originalDynamicSite1023_12(32381, (5803718773732965931L ^ local0_life1))] = net.minecraft.block.BlockHugeMushroom$EnumType.SOUTH;
    __sourceSharedArray1023_4[__sourceIntrinsic_2a4fa6c96f80_originalDynamicSite1023_14(986, (4281296629397816207L ^ local0_life1))] = net.minecraft.block.BlockHugeMushroom$EnumType.SOUTH_EAST;
    __sourceSharedArray1023_4[__sourceIntrinsic_2a4fa6c96f80_originalDynamicSite1023_16(26934, (6893532216127678827L ^ local0_life1))] = net.minecraft.block.BlockHugeMushroom$EnumType.STEM;
    __sourceSharedArray1023_4[__sourceIntrinsic_2a4fa6c96f80_originalDynamicSite1023_18(11251, (2053163336990927787L ^ local0_life1))] = net.minecraft.block.BlockHugeMushroom$EnumType.ALL_INSIDE;
    __sourceSharedArray1023_4[__sourceIntrinsic_2a4fa6c96f80_originalDynamicSite1023_20(6567, (6995662801220082173L ^ local0_life1))] = net.minecraft.block.BlockHugeMushroom$EnumType.ALL_OUTSIDE;
    __sourceSharedArray1023_4[__sourceIntrinsic_2a4fa6c96f80_originalDynamicSite1023_22(31455, (2429734446545009283L ^ local0_life1))] = net.minecraft.block.BlockHugeMushroom$EnumType.ALL_STEM;
    return __sourceSharedArray1023_4;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1749_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1749_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1749_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1749_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1749_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1749_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1749_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1749_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1749_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1749_71(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1749_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1749_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1749_76(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1749_77(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1749_81(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9995_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2a4fa6c96f80_originalDynamicSite1023_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2a4fa6c96f80_originalDynamicSite1023_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2a4fa6c96f80_originalDynamicSite1023_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2a4fa6c96f80_originalDynamicSite1023_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2a4fa6c96f80_originalDynamicSite1023_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2a4fa6c96f80_originalDynamicSite1023_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2a4fa6c96f80_originalDynamicSite1023_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2a4fa6c96f80_originalDynamicSite1023_22(int a0, long a1) throws E;
}
