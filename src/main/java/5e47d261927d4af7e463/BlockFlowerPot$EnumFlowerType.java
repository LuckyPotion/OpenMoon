package net.minecraft.block;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class BlockFlowerPot$EnumFlowerType extends sourcebuild.EnumConstructor<net.minecraft.block.BlockFlowerPot$EnumFlowerType> implements net.minecraft.util.IStringSerializable {

public static net.minecraft.block.BlockFlowerPot$EnumFlowerType EMPTY;

public static net.minecraft.block.BlockFlowerPot$EnumFlowerType POPPY;

public static net.minecraft.block.BlockFlowerPot$EnumFlowerType BLUE_ORCHID;

public static net.minecraft.block.BlockFlowerPot$EnumFlowerType ALLIUM;

public static net.minecraft.block.BlockFlowerPot$EnumFlowerType HOUSTONIA;

public static net.minecraft.block.BlockFlowerPot$EnumFlowerType RED_TULIP;

public static net.minecraft.block.BlockFlowerPot$EnumFlowerType ORANGE_TULIP;

public static net.minecraft.block.BlockFlowerPot$EnumFlowerType WHITE_TULIP;

public static net.minecraft.block.BlockFlowerPot$EnumFlowerType PINK_TULIP;

public static net.minecraft.block.BlockFlowerPot$EnumFlowerType OXEYE_DAISY;

public static net.minecraft.block.BlockFlowerPot$EnumFlowerType DANDELION;

public static net.minecraft.block.BlockFlowerPot$EnumFlowerType OAK_SAPLING;

public static net.minecraft.block.BlockFlowerPot$EnumFlowerType SPRUCE_SAPLING;

public static net.minecraft.block.BlockFlowerPot$EnumFlowerType BIRCH_SAPLING;

public static net.minecraft.block.BlockFlowerPot$EnumFlowerType JUNGLE_SAPLING;

public static net.minecraft.block.BlockFlowerPot$EnumFlowerType ACACIA_SAPLING;

public static net.minecraft.block.BlockFlowerPot$EnumFlowerType DARK_OAK_SAPLING;

public static net.minecraft.block.BlockFlowerPot$EnumFlowerType MUSHROOM_RED;

public static net.minecraft.block.BlockFlowerPot$EnumFlowerType MUSHROOM_BROWN;

public static net.minecraft.block.BlockFlowerPot$EnumFlowerType DEAD_BUSH;

public static net.minecraft.block.BlockFlowerPot$EnumFlowerType FERN;

public static net.minecraft.block.BlockFlowerPot$EnumFlowerType CACTUS;

private java.lang.String a;

private static net.minecraft.block.BlockFlowerPot$EnumFlowerType[] b;

private static long c;

private static long[] d;

private static java.lang.Integer[] e;

private static java.util.Map f;

private BlockFlowerPot$EnumFlowerType(java.lang.String p0, int p1, java.lang.String p2) {
super(p0, p1);
    this.a = p2;
}


private static void initialize() {
c = ((long)(((moom._a)(moom._c.a(((long)(6965914614065331397L)), ((long)(205667084993201360L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(107974905489430L)))));
    long local11_life6 = (net.minecraft.block.BlockFlowerPot$EnumFlowerType.c ^ 24347752594990L);
    f = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill1748_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1748_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1748_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1748_14 = new byte[8];
    (__sourceSpill1748_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill1748_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation1748_16 = __sourceSpill1748_14;
    ((javax.crypto.Cipher)(__sourceSpill1748_11)).init(((int)(__sourceSpill1748_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1748_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1748_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[33];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "jl\030ï\"èö²¬~Â¬$«\001ñë*50\006³WèÙÓ1¸m\036ñ6Û´úgÂ\006Ü=\003ICG¡\001û¤÷Ã\007/C£\035h:Xeî¿#7Jçüû`n¾ÌÒ¦#S£vJÈm#\032éte5Æ«n}3ý`\035î4¸¸7×Wâ×ÇÔ»¯yj\022(ïvål\033¤Ò5±¯pû:äñð)nÝnâ\037\032À;ë\037U(Lu;\032öï\034\023^wo\177p©0Sø¹É#LqÌ©Õ\034³kà\016®Î(²¸DzüL~\037\f#åDÔg\002h{^O;âBóù=^SÃÛ¸4FÖ²ª<ä=¸S Ïç\\VåIÓ;ÇWW½Ð"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1748_25 = local4_life21;
        int __sourceSpill1748_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1748_25)).substring(((int)(__sourceSpill1748_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1748_30 = local6_life19;
        int __sourceSpill1748_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill1748_33 = new byte[8];
        (__sourceSpill1748_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill1748_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill1748_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill1748_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill1748_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill1748_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill1748_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill1748_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill1748_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill1748_34)).doFinal(((byte[])(__sourceSpill1748_33)));
        (__sourceSpill1748_30)[__sourceSpill1748_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    local5_life23 = ((java.lang.String)((local4_life21 = "\007 !1SU»\021"))).length();
    local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1748_38 = local4_life21;
        int __sourceSpill1748_39 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1748_38)).substring(((int)(__sourceSpill1748_39)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1748_43 = local6_life19;
        int __sourceSpill1748_44 = local3_life20;
        local3_life20 += 1;
        long local8_life45 = (((((((((((long) (local7_life42)[0]) & 255L) << 56) | ((((long) (local7_life42)[1]) & 255L) << 48)) | ((((long) (local7_life42)[2]) & 255L) << 40)) | ((((long) (local7_life42)[3]) & 255L) << 32)) | ((((long) (local7_life42)[4]) & 255L) << 24)) | ((((long) (local7_life42)[5]) & 255L) << 16)) | ((((long) (local7_life42)[6]) & 255L) << 8)) | (((long) (local7_life42)[7]) & 255L));
        byte[] __sourceSpill1748_46 = new byte[8];
        (__sourceSpill1748_46)[0] = ((byte) ((int) (local8_life45 >>> 56)));
        (__sourceSpill1748_46)[1] = ((byte) ((int) (local8_life45 >>> 48)));
        (__sourceSpill1748_46)[2] = ((byte) ((int) (local8_life45 >>> 40)));
        (__sourceSpill1748_46)[3] = ((byte) ((int) (local8_life45 >>> 32)));
        (__sourceSpill1748_46)[4] = ((byte) ((int) (local8_life45 >>> 24)));
        (__sourceSpill1748_46)[5] = ((byte) ((int) (local8_life45 >>> 16)));
        (__sourceSpill1748_46)[6] = ((byte) ((int) (local8_life45 >>> 8)));
        (__sourceSpill1748_46)[7] = ((byte) ((int) local8_life45));
        javax.crypto.Cipher __sourceSpill1748_47 = local0_life9;
        byte[] local10_life49 = ((javax.crypto.Cipher)(__sourceSpill1748_47)).doFinal(((byte[])(__sourceSpill1748_46)));
        (__sourceSpill1748_43)[__sourceSpill1748_44] = (((((((((((long) (local10_life49)[0]) & 255L) << 56) | ((((long) (local10_life49)[1]) & 255L) << 48)) | ((((long) (local10_life49)[2]) & 255L) << 40)) | ((((long) (local10_life49)[3]) & 255L) << 32)) | ((((long) (local10_life49)[4]) & 255L) << 24)) | ((((long) (local10_life49)[5]) & 255L) << 16)) | ((((long) (local10_life49)[6]) & 255L) << 8)) | (((long) (local10_life49)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    d = ((long[])(local6_life19));
    e = ((java.lang.Integer[])(new java.lang.Integer[33]));
    EMPTY = ((net.minecraft.block.BlockFlowerPot$EnumFlowerType)(new net.minecraft.block.BlockFlowerPot$EnumFlowerType("EMPTY", 0, "empty")));
    POPPY = ((net.minecraft.block.BlockFlowerPot$EnumFlowerType)(new net.minecraft.block.BlockFlowerPot$EnumFlowerType("POPPY", 1, "rose")));
    BLUE_ORCHID = ((net.minecraft.block.BlockFlowerPot$EnumFlowerType)(new net.minecraft.block.BlockFlowerPot$EnumFlowerType("BLUE_ORCHID", 2, "blue_orchid")));
    ALLIUM = ((net.minecraft.block.BlockFlowerPot$EnumFlowerType)(new net.minecraft.block.BlockFlowerPot$EnumFlowerType("ALLIUM", 3, "allium")));
    HOUSTONIA = ((net.minecraft.block.BlockFlowerPot$EnumFlowerType)(new net.minecraft.block.BlockFlowerPot$EnumFlowerType("HOUSTONIA", 4, "houstonia")));
    RED_TULIP = ((net.minecraft.block.BlockFlowerPot$EnumFlowerType)(new net.minecraft.block.BlockFlowerPot$EnumFlowerType("RED_TULIP", 5, "red_tulip")));
    ORANGE_TULIP = ((net.minecraft.block.BlockFlowerPot$EnumFlowerType)(new net.minecraft.block.BlockFlowerPot$EnumFlowerType("ORANGE_TULIP", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1748_58(10457, (1069777723128382415L ^ local11_life6)), "orange_tulip")));
    WHITE_TULIP = ((net.minecraft.block.BlockFlowerPot$EnumFlowerType)(new net.minecraft.block.BlockFlowerPot$EnumFlowerType("WHITE_TULIP", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1748_60(16520, (5155421649729219460L ^ local11_life6)), "white_tulip")));
    PINK_TULIP = ((net.minecraft.block.BlockFlowerPot$EnumFlowerType)(new net.minecraft.block.BlockFlowerPot$EnumFlowerType("PINK_TULIP", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1748_62(12400, (1401056355132087144L ^ local11_life6)), "pink_tulip")));
    OXEYE_DAISY = ((net.minecraft.block.BlockFlowerPot$EnumFlowerType)(new net.minecraft.block.BlockFlowerPot$EnumFlowerType("OXEYE_DAISY", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1748_64(242, (2136210393066286077L ^ local11_life6)), "oxeye_daisy")));
    DANDELION = ((net.minecraft.block.BlockFlowerPot$EnumFlowerType)(new net.minecraft.block.BlockFlowerPot$EnumFlowerType("DANDELION", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1748_66(13715, (2853114837771427479L ^ local11_life6)), "dandelion")));
    OAK_SAPLING = ((net.minecraft.block.BlockFlowerPot$EnumFlowerType)(new net.minecraft.block.BlockFlowerPot$EnumFlowerType("OAK_SAPLING", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1748_68(31440, (3336406354266182101L ^ local11_life6)), "oak_sapling")));
    SPRUCE_SAPLING = ((net.minecraft.block.BlockFlowerPot$EnumFlowerType)(new net.minecraft.block.BlockFlowerPot$EnumFlowerType("SPRUCE_SAPLING", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1748_70(4945, (1227723486081202255L ^ local11_life6)), "spruce_sapling")));
    BIRCH_SAPLING = ((net.minecraft.block.BlockFlowerPot$EnumFlowerType)(new net.minecraft.block.BlockFlowerPot$EnumFlowerType("BIRCH_SAPLING", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1748_72(31080, (6203893324624450164L ^ local11_life6)), "birch_sapling")));
    JUNGLE_SAPLING = ((net.minecraft.block.BlockFlowerPot$EnumFlowerType)(new net.minecraft.block.BlockFlowerPot$EnumFlowerType("JUNGLE_SAPLING", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1748_74(31594, (5006792679240781933L ^ local11_life6)), "jungle_sapling")));
    ACACIA_SAPLING = ((net.minecraft.block.BlockFlowerPot$EnumFlowerType)(new net.minecraft.block.BlockFlowerPot$EnumFlowerType("ACACIA_SAPLING", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1748_76(30202, (8234390296187789051L ^ local11_life6)), "acacia_sapling")));
    DARK_OAK_SAPLING = ((net.minecraft.block.BlockFlowerPot$EnumFlowerType)(new net.minecraft.block.BlockFlowerPot$EnumFlowerType("DARK_OAK_SAPLING", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1748_78(12883, (1245989282667632984L ^ local11_life6)), "dark_oak_sapling")));
    MUSHROOM_RED = ((net.minecraft.block.BlockFlowerPot$EnumFlowerType)(new net.minecraft.block.BlockFlowerPot$EnumFlowerType("MUSHROOM_RED", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1748_80(8232, (8985810234996788027L ^ local11_life6)), "mushroom_red")));
    MUSHROOM_BROWN = ((net.minecraft.block.BlockFlowerPot$EnumFlowerType)(new net.minecraft.block.BlockFlowerPot$EnumFlowerType("MUSHROOM_BROWN", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1748_82(13337, (1274404228853833480L ^ local11_life6)), "mushroom_brown")));
    DEAD_BUSH = ((net.minecraft.block.BlockFlowerPot$EnumFlowerType)(new net.minecraft.block.BlockFlowerPot$EnumFlowerType("DEAD_BUSH", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1748_84(25049, (4497844094707092187L ^ local11_life6)), "dead_bush")));
    FERN = ((net.minecraft.block.BlockFlowerPot$EnumFlowerType)(new net.minecraft.block.BlockFlowerPot$EnumFlowerType("FERN", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1748_86(27610, (4258321296522232028L ^ local11_life6)), "fern")));
    CACTUS = ((net.minecraft.block.BlockFlowerPot$EnumFlowerType)(new net.minecraft.block.BlockFlowerPot$EnumFlowerType("CACTUS", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1748_88(25567, (2423155354818463959L ^ local11_life6)), "cactus")));
    b = ((net.minecraft.block.BlockFlowerPot$EnumFlowerType[])(net.minecraft.block.BlockFlowerPot$EnumFlowerType.a__ArrayO()));
}


public java.lang.String toString() {
return this.a;
}


public static net.minecraft.block.BlockFlowerPot$EnumFlowerType[] values() {
return ((net.minecraft.block.BlockFlowerPot$EnumFlowerType[])(((net.minecraft.block.BlockFlowerPot$EnumFlowerType[])(net.minecraft.block.BlockFlowerPot$EnumFlowerType.b)).clone()));
}


public static net.minecraft.block.BlockFlowerPot$EnumFlowerType valueOf(java.lang.String p0) {
return ((net.minecraft.block.BlockFlowerPot$EnumFlowerType)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.block.BlockFlowerPot$EnumFlowerType.class)), ((java.lang.String)(p0)))));
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 20086;
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
            throw new RuntimeException("moom/O", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         e[var3] = var15;
      }

      return e[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.block.BlockFlowerPot$EnumFlowerType.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9983_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/O"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static net.minecraft.block.BlockFlowerPot$EnumFlowerType[] a__ArrayO() {
long local0_life1 = (net.minecraft.block.BlockFlowerPot$EnumFlowerType.c ^ 37917366706902L);
    net.minecraft.block.BlockFlowerPot$EnumFlowerType[] __sourceSharedArray1022_4 = new net.minecraft.block.BlockFlowerPot$EnumFlowerType[__sourceIntrinsic_6905283223ac_originalDynamicSite1022_2(32435, (4415151604681263455L ^ local0_life1))];
    __sourceSharedArray1022_4[0] = net.minecraft.block.BlockFlowerPot$EnumFlowerType.EMPTY;
    __sourceSharedArray1022_4[1] = net.minecraft.block.BlockFlowerPot$EnumFlowerType.POPPY;
    __sourceSharedArray1022_4[2] = net.minecraft.block.BlockFlowerPot$EnumFlowerType.BLUE_ORCHID;
    __sourceSharedArray1022_4[3] = net.minecraft.block.BlockFlowerPot$EnumFlowerType.ALLIUM;
    __sourceSharedArray1022_4[4] = net.minecraft.block.BlockFlowerPot$EnumFlowerType.HOUSTONIA;
    __sourceSharedArray1022_4[5] = net.minecraft.block.BlockFlowerPot$EnumFlowerType.RED_TULIP;
    __sourceSharedArray1022_4[__sourceIntrinsic_6905283223ac_originalDynamicSite1022_10(4906, (6107127056528254153L ^ local0_life1))] = net.minecraft.block.BlockFlowerPot$EnumFlowerType.ORANGE_TULIP;
    __sourceSharedArray1022_4[__sourceIntrinsic_6905283223ac_originalDynamicSite1022_12(6594, (7574742322037141029L ^ local0_life1))] = net.minecraft.block.BlockFlowerPot$EnumFlowerType.WHITE_TULIP;
    __sourceSharedArray1022_4[__sourceIntrinsic_6905283223ac_originalDynamicSite1022_14(9680, (4903994317500617279L ^ local0_life1))] = net.minecraft.block.BlockFlowerPot$EnumFlowerType.PINK_TULIP;
    __sourceSharedArray1022_4[__sourceIntrinsic_6905283223ac_originalDynamicSite1022_16(18401, (4954533920360263706L ^ local0_life1))] = net.minecraft.block.BlockFlowerPot$EnumFlowerType.OXEYE_DAISY;
    __sourceSharedArray1022_4[__sourceIntrinsic_6905283223ac_originalDynamicSite1022_18(9470, (7662078708850103071L ^ local0_life1))] = net.minecraft.block.BlockFlowerPot$EnumFlowerType.DANDELION;
    __sourceSharedArray1022_4[__sourceIntrinsic_6905283223ac_originalDynamicSite1022_20(31448, (5447356143275625786L ^ local0_life1))] = net.minecraft.block.BlockFlowerPot$EnumFlowerType.OAK_SAPLING;
    __sourceSharedArray1022_4[__sourceIntrinsic_6905283223ac_originalDynamicSite1022_22(18310, (2818648402662387822L ^ local0_life1))] = net.minecraft.block.BlockFlowerPot$EnumFlowerType.SPRUCE_SAPLING;
    __sourceSharedArray1022_4[__sourceIntrinsic_6905283223ac_originalDynamicSite1022_24(19331, (9052394316867337296L ^ local0_life1))] = net.minecraft.block.BlockFlowerPot$EnumFlowerType.BIRCH_SAPLING;
    __sourceSharedArray1022_4[__sourceIntrinsic_6905283223ac_originalDynamicSite1022_26(20697, (1721941191783507772L ^ local0_life1))] = net.minecraft.block.BlockFlowerPot$EnumFlowerType.JUNGLE_SAPLING;
    __sourceSharedArray1022_4[__sourceIntrinsic_6905283223ac_originalDynamicSite1022_28(4778, (6257179787388364123L ^ local0_life1))] = net.minecraft.block.BlockFlowerPot$EnumFlowerType.ACACIA_SAPLING;
    __sourceSharedArray1022_4[__sourceIntrinsic_6905283223ac_originalDynamicSite1022_30(10524, (3331657109324635882L ^ local0_life1))] = net.minecraft.block.BlockFlowerPot$EnumFlowerType.DARK_OAK_SAPLING;
    __sourceSharedArray1022_4[__sourceIntrinsic_6905283223ac_originalDynamicSite1022_32(25645, (1956789553654813632L ^ local0_life1))] = net.minecraft.block.BlockFlowerPot$EnumFlowerType.MUSHROOM_RED;
    __sourceSharedArray1022_4[__sourceIntrinsic_6905283223ac_originalDynamicSite1022_34(14021, (24922957274218807L ^ local0_life1))] = net.minecraft.block.BlockFlowerPot$EnumFlowerType.MUSHROOM_BROWN;
    __sourceSharedArray1022_4[__sourceIntrinsic_6905283223ac_originalDynamicSite1022_36(29389, (2549962548007224632L ^ local0_life1))] = net.minecraft.block.BlockFlowerPot$EnumFlowerType.DEAD_BUSH;
    __sourceSharedArray1022_4[__sourceIntrinsic_6905283223ac_originalDynamicSite1022_38(23003, (5796809139843165731L ^ local0_life1))] = net.minecraft.block.BlockFlowerPot$EnumFlowerType.FERN;
    __sourceSharedArray1022_4[__sourceIntrinsic_6905283223ac_originalDynamicSite1022_40(24798, (7046625183400384308L ^ local0_life1))] = net.minecraft.block.BlockFlowerPot$EnumFlowerType.CACTUS;
    return __sourceSharedArray1022_4;
}


public java.lang.String a__String() {
return this.a;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1748_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1748_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1748_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1748_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1748_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1748_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1748_70(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1748_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1748_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1748_76(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1748_78(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1748_80(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1748_82(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1748_84(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1748_86(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1748_88(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9983_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6905283223ac_originalDynamicSite1022_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6905283223ac_originalDynamicSite1022_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6905283223ac_originalDynamicSite1022_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6905283223ac_originalDynamicSite1022_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6905283223ac_originalDynamicSite1022_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6905283223ac_originalDynamicSite1022_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6905283223ac_originalDynamicSite1022_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6905283223ac_originalDynamicSite1022_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6905283223ac_originalDynamicSite1022_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6905283223ac_originalDynamicSite1022_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6905283223ac_originalDynamicSite1022_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6905283223ac_originalDynamicSite1022_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6905283223ac_originalDynamicSite1022_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6905283223ac_originalDynamicSite1022_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6905283223ac_originalDynamicSite1022_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6905283223ac_originalDynamicSite1022_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6905283223ac_originalDynamicSite1022_40(int a0, long a1) throws E;
}
