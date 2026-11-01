package net.minecraft.block;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class BlockFlower$EnumFlowerType extends sourcebuild.EnumConstructor<net.minecraft.block.BlockFlower$EnumFlowerType> implements net.minecraft.util.IStringSerializable {

public static net.minecraft.block.BlockFlower$EnumFlowerType DANDELION;

public static net.minecraft.block.BlockFlower$EnumFlowerType POPPY;

public static net.minecraft.block.BlockFlower$EnumFlowerType BLUE_ORCHID;

public static net.minecraft.block.BlockFlower$EnumFlowerType ALLIUM;

public static net.minecraft.block.BlockFlower$EnumFlowerType HOUSTONIA;

public static net.minecraft.block.BlockFlower$EnumFlowerType RED_TULIP;

public static net.minecraft.block.BlockFlower$EnumFlowerType ORANGE_TULIP;

public static net.minecraft.block.BlockFlower$EnumFlowerType WHITE_TULIP;

public static net.minecraft.block.BlockFlower$EnumFlowerType PINK_TULIP;

public static net.minecraft.block.BlockFlower$EnumFlowerType OXEYE_DAISY;

private static net.minecraft.block.BlockFlower$EnumFlowerType[][] a;

private moom.M b;

private int c;

private java.lang.String d;

private java.lang.String e;

private static net.minecraft.block.BlockFlower$EnumFlowerType[] f;

private static long g;

private static long[] h;

private static java.lang.Integer[] i;

private static java.util.Map j;

private BlockFlower$EnumFlowerType(java.lang.String p0, int p1, moom.M p2, int p3, java.lang.String p4) {
this(p0, p1, p2, p3, p4, p4);
    return;
}


private BlockFlower$EnumFlowerType(java.lang.String p0, int p1, moom.M p2, int p3, java.lang.String p4, java.lang.String p5) {
super(p0, p1);
    this.b = p2;
    this.c = p3;
    this.d = p4;
    this.e = p5;
}


private static void initialize() {
g = ((long)(((moom._a)(moom._c.a(((long)(-5720115367538367283L)), ((long)(-4922116167553928284L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(31002945013584L)))));
    long local11_life6 = (net.minecraft.block.BlockFlower$EnumFlowerType.g ^ 98035790074409L);
    j = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill1746_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1746_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1746_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1746_14 = new byte[8];
    (__sourceSpill1746_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill1746_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation1746_16 = __sourceSpill1746_14;
    ((javax.crypto.Cipher)(__sourceSpill1746_11)).init(((int)(__sourceSpill1746_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1746_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1746_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[9];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "¾Ë\000\b\177-Ç  äFI\002;\032'Xï8.\032\035C\022°­;\021¬À\032ÁË9\\÷¶[Þ\025Fu9òUïº\021W©"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1746_25 = local4_life21;
        int __sourceSpill1746_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1746_25)).substring(((int)(__sourceSpill1746_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1746_30 = local6_life19;
        int __sourceSpill1746_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill1746_33 = new byte[8];
        (__sourceSpill1746_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill1746_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill1746_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill1746_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill1746_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill1746_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill1746_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill1746_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill1746_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill1746_34)).doFinal(((byte[])(__sourceSpill1746_33)));
        (__sourceSpill1746_30)[__sourceSpill1746_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    local5_life23 = ((java.lang.String)((local4_life21 = "ágôÁæ$\001è3þ't\023Û`"))).length();
    local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1746_38 = local4_life21;
        int __sourceSpill1746_39 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1746_38)).substring(((int)(__sourceSpill1746_39)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1746_43 = local6_life19;
        int __sourceSpill1746_44 = local3_life20;
        local3_life20 += 1;
        long local8_life45 = (((((((((((long) (local7_life42)[0]) & 255L) << 56) | ((((long) (local7_life42)[1]) & 255L) << 48)) | ((((long) (local7_life42)[2]) & 255L) << 40)) | ((((long) (local7_life42)[3]) & 255L) << 32)) | ((((long) (local7_life42)[4]) & 255L) << 24)) | ((((long) (local7_life42)[5]) & 255L) << 16)) | ((((long) (local7_life42)[6]) & 255L) << 8)) | (((long) (local7_life42)[7]) & 255L));
        byte[] __sourceSpill1746_46 = new byte[8];
        (__sourceSpill1746_46)[0] = ((byte) ((int) (local8_life45 >>> 56)));
        (__sourceSpill1746_46)[1] = ((byte) ((int) (local8_life45 >>> 48)));
        (__sourceSpill1746_46)[2] = ((byte) ((int) (local8_life45 >>> 40)));
        (__sourceSpill1746_46)[3] = ((byte) ((int) (local8_life45 >>> 32)));
        (__sourceSpill1746_46)[4] = ((byte) ((int) (local8_life45 >>> 24)));
        (__sourceSpill1746_46)[5] = ((byte) ((int) (local8_life45 >>> 16)));
        (__sourceSpill1746_46)[6] = ((byte) ((int) (local8_life45 >>> 8)));
        (__sourceSpill1746_46)[7] = ((byte) ((int) local8_life45));
        javax.crypto.Cipher __sourceSpill1746_47 = local0_life9;
        byte[] local10_life49 = ((javax.crypto.Cipher)(__sourceSpill1746_47)).doFinal(((byte[])(__sourceSpill1746_46)));
        (__sourceSpill1746_43)[__sourceSpill1746_44] = (((((((((((long) (local10_life49)[0]) & 255L) << 56) | ((((long) (local10_life49)[1]) & 255L) << 48)) | ((((long) (local10_life49)[2]) & 255L) << 40)) | ((((long) (local10_life49)[3]) & 255L) << 32)) | ((((long) (local10_life49)[4]) & 255L) << 24)) | ((((long) (local10_life49)[5]) & 255L) << 16)) | ((((long) (local10_life49)[6]) & 255L) << 8)) | (((long) (local10_life49)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    h = ((long[])(local6_life19));
    i = ((java.lang.Integer[])(new java.lang.Integer[9]));
    DANDELION = ((net.minecraft.block.BlockFlower$EnumFlowerType)(new net.minecraft.block.BlockFlower$EnumFlowerType("DANDELION", 0, moom.M.YELLOW, 0, "dandelion")));
    POPPY = ((net.minecraft.block.BlockFlower$EnumFlowerType)(new net.minecraft.block.BlockFlower$EnumFlowerType("POPPY", 1, moom.M.RED, 0, "poppy")));
    BLUE_ORCHID = ((net.minecraft.block.BlockFlower$EnumFlowerType)(new net.minecraft.block.BlockFlower$EnumFlowerType("BLUE_ORCHID", 2, moom.M.RED, 1, "blue_orchid", "blueOrchid")));
    ALLIUM = ((net.minecraft.block.BlockFlower$EnumFlowerType)(new net.minecraft.block.BlockFlower$EnumFlowerType("ALLIUM", 3, moom.M.RED, 2, "allium")));
    HOUSTONIA = ((net.minecraft.block.BlockFlower$EnumFlowerType)(new net.minecraft.block.BlockFlower$EnumFlowerType("HOUSTONIA", 4, moom.M.RED, 3, "houstonia")));
    RED_TULIP = ((net.minecraft.block.BlockFlower$EnumFlowerType)(new net.minecraft.block.BlockFlower$EnumFlowerType("RED_TULIP", 5, moom.M.RED, 4, "red_tulip", "tulipRed")));
    ORANGE_TULIP = ((net.minecraft.block.BlockFlower$EnumFlowerType)(new net.minecraft.block.BlockFlower$EnumFlowerType("ORANGE_TULIP", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1746_64(24841, (5127820137134477291L ^ local11_life6)), moom.M.RED, 5, "orange_tulip", "tulipOrange")));
    WHITE_TULIP = ((net.minecraft.block.BlockFlower$EnumFlowerType)(new net.minecraft.block.BlockFlower$EnumFlowerType("WHITE_TULIP", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1746_67(5315, (6922911792168745518L ^ local11_life6)), moom.M.RED, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1746_69(30196, (6167086775094926106L ^ local11_life6)), "white_tulip", "tulipWhite")));
    PINK_TULIP = ((net.minecraft.block.BlockFlower$EnumFlowerType)(new net.minecraft.block.BlockFlower$EnumFlowerType("PINK_TULIP", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1746_71(18815, (6866563275473184662L ^ local11_life6)), moom.M.RED, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1746_73(989, (4822255747981520183L ^ local11_life6)), "pink_tulip", "tulipPink")));
    OXEYE_DAISY = ((net.minecraft.block.BlockFlower$EnumFlowerType)(new net.minecraft.block.BlockFlower$EnumFlowerType("OXEYE_DAISY", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1746_75(700, (7176865517810461776L ^ local11_life6)), moom.M.RED, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1746_77(10436, (4981774857840952876L ^ local11_life6)), "oxeye_daisy", "oxeyeDaisy")));
    f = ((net.minecraft.block.BlockFlower$EnumFlowerType[])(net.minecraft.block.BlockFlower$EnumFlowerType.a__ArrayN()));
    a = ((net.minecraft.block.BlockFlower$EnumFlowerType[][])(new net.minecraft.block.BlockFlower$EnumFlowerType[(moom.M.values()).length][]));
    moom.M[] local13_life84 = moom.M.values();
    int local14_life85 = (local13_life84).length;
    int local15_life86 = 0;
    while ((local15_life86 < local14_life85)) {
        moom.M local16_life87 = (local13_life84)[local15_life86];
        java.util.Collection local17_life92 = com.google.common.collect.Collections2.filter(((java.util.Collection)(com.google.common.collect.Lists.newArrayList(((java.lang.Object[])(net.minecraft.block.BlockFlower$EnumFlowerType.values()))))), ((com.google.common.base.Predicate)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1746_90(local16_life87))));
        (net.minecraft.block.BlockFlower$EnumFlowerType.a)[((moom.M)(local16_life87)).ordinal()] = ((net.minecraft.block.BlockFlower$EnumFlowerType[])(((java.util.Collection)(local17_life92)).toArray(((java.lang.Object[])(new net.minecraft.block.BlockFlower$EnumFlowerType[0])))));
        local15_life86 += 1;
    }
}


public java.lang.String toString() {
return this.d;
}


public static net.minecraft.block.BlockFlower$EnumFlowerType[] values() {
return ((net.minecraft.block.BlockFlower$EnumFlowerType[])(((net.minecraft.block.BlockFlower$EnumFlowerType[])(net.minecraft.block.BlockFlower$EnumFlowerType.f)).clone()));
}


public static net.minecraft.block.BlockFlower$EnumFlowerType valueOf(java.lang.String p0) {
return ((net.minecraft.block.BlockFlower$EnumFlowerType)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.block.BlockFlower$EnumFlowerType.class)), ((java.lang.String)(p0)))));
}


public java.lang.String b() {
return this.e;
}


private static net.minecraft.block.BlockFlower$EnumFlowerType[] a__ArrayN() {
long local0_life1 = (net.minecraft.block.BlockFlower$EnumFlowerType.g ^ 11476198988961L);
    net.minecraft.block.BlockFlower$EnumFlowerType[] __sourceSharedArray1021_4 = new net.minecraft.block.BlockFlower$EnumFlowerType[__sourceIntrinsic_1aabb70a83fb_originalDynamicSite1021_2(8374, (2927110049631715541L ^ local0_life1))];
    __sourceSharedArray1021_4[0] = net.minecraft.block.BlockFlower$EnumFlowerType.DANDELION;
    __sourceSharedArray1021_4[1] = net.minecraft.block.BlockFlower$EnumFlowerType.POPPY;
    __sourceSharedArray1021_4[2] = net.minecraft.block.BlockFlower$EnumFlowerType.BLUE_ORCHID;
    __sourceSharedArray1021_4[3] = net.minecraft.block.BlockFlower$EnumFlowerType.ALLIUM;
    __sourceSharedArray1021_4[4] = net.minecraft.block.BlockFlower$EnumFlowerType.HOUSTONIA;
    __sourceSharedArray1021_4[5] = net.minecraft.block.BlockFlower$EnumFlowerType.RED_TULIP;
    __sourceSharedArray1021_4[__sourceIntrinsic_1aabb70a83fb_originalDynamicSite1021_10(30196, (6167037467220776338L ^ local0_life1))] = net.minecraft.block.BlockFlower$EnumFlowerType.ORANGE_TULIP;
    __sourceSharedArray1021_4[__sourceIntrinsic_1aabb70a83fb_originalDynamicSite1021_12(989, (4822312125495305151L ^ local0_life1))] = net.minecraft.block.BlockFlower$EnumFlowerType.WHITE_TULIP;
    __sourceSharedArray1021_4[__sourceIntrinsic_1aabb70a83fb_originalDynamicSite1021_14(10436, (4981687688754612388L ^ local0_life1))] = net.minecraft.block.BlockFlower$EnumFlowerType.PINK_TULIP;
    __sourceSharedArray1021_4[__sourceIntrinsic_1aabb70a83fb_originalDynamicSite1021_16(29511, (6900112190788965152L ^ local0_life1))] = net.minecraft.block.BlockFlower$EnumFlowerType.OXEYE_DAISY;
    return __sourceSharedArray1021_4;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9981_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/N"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.block.BlockFlower$EnumFlowerType.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 17392;
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
            throw new RuntimeException("moom/N", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         i[var3] = var15;
      }

      return i[var3];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int a() {
return this.c;
}


public moom.M a__M() {
return this.b;
}


public static net.minecraft.block.BlockFlower$EnumFlowerType[] a(moom.M p0) {
return (net.minecraft.block.BlockFlower$EnumFlowerType.a)[((moom.M)(p0)).ordinal()];
}


public java.lang.String a__String() {
return this.d;
}


public static net.minecraft.block.BlockFlower$EnumFlowerType a(moom.M p0, int p1) {
int forwardValue4677_22_0;
    int[] spill4677_0;
    int spill4677_1;
    int spill4677_2;
    long life2_3;
    net.minecraft.block.BlockFlower$EnumFlowerType[] life5_9;
    int[] life4_10;
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    life2_3 = (net.minecraft.block.BlockFlower$EnumFlowerType.g ^ 114419411438521L);
    spill4677_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_9 = (net.minecraft.block.BlockFlower$EnumFlowerType.a)[((moom.M)(p0)).ordinal()];
    life4_10 = spill4677_0;
    spill4677_1 = p1;
    if (!((life4_10 != null))) {
        forwardValue4677_22_0 = spill4677_1;
        break forward_join_22;
    }
    if (!((spill4677_1 >= 0))) {
        break forward_join_21;
    }
    spill4677_2 = p1;
    if (!((life4_10 != null))) {
        forwardValue4677_22_0 = spill4677_2;
        break forward_join_22;
    }
    if (!((spill4677_2 >= (life5_9).length))) {
        break forward_join_23;
    }
    }
    forwardValue4677_22_0 = 0;
    }
    p1 = forwardValue4677_22_0;
    }
    return (life5_9)[p1];
}


private static boolean lambda$static$0(moom.M p0, net.minecraft.block.BlockFlower$EnumFlowerType p1) {
long local2 = (net.minecraft.block.BlockFlower$EnumFlowerType.g ^ 92038464659559L);
    return ((((((net.minecraft.block.BlockFlower$EnumFlowerType)(p1)).a__M() == p0) ? 1 : 0)) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1746_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1746_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1746_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1746_71(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1746_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1746_75(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1746_77(int a0, long a1) throws E;

private static native <E extends Throwable> com.google.common.base.Predicate __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1746_90(moom.M a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1aabb70a83fb_originalDynamicSite1021_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1aabb70a83fb_originalDynamicSite1021_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1aabb70a83fb_originalDynamicSite1021_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1aabb70a83fb_originalDynamicSite1021_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1aabb70a83fb_originalDynamicSite1021_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9981_0() throws E;
}
