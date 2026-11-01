package net.minecraft.enchantment;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class EnumEnchantmentType extends sourcebuild.EnumConstructor<net.minecraft.enchantment.EnumEnchantmentType> {

public static net.minecraft.enchantment.EnumEnchantmentType ALL;

public static net.minecraft.enchantment.EnumEnchantmentType ARMOR;

public static net.minecraft.enchantment.EnumEnchantmentType ARMOR_FEET;

public static net.minecraft.enchantment.EnumEnchantmentType ARMOR_LEGS;

public static net.minecraft.enchantment.EnumEnchantmentType ARMOR_TORSO;

public static net.minecraft.enchantment.EnumEnchantmentType ARMOR_HEAD;

public static net.minecraft.enchantment.EnumEnchantmentType WEAPON;

public static net.minecraft.enchantment.EnumEnchantmentType DIGGER;

public static net.minecraft.enchantment.EnumEnchantmentType FISHING_ROD;

public static net.minecraft.enchantment.EnumEnchantmentType BREAKABLE;

public static net.minecraft.enchantment.EnumEnchantmentType BOW;

private static net.minecraft.enchantment.EnumEnchantmentType[] a;

private static long b;

private static long[] c;

private static java.lang.Integer[] d;

private static java.util.Map e;

private EnumEnchantmentType(java.lang.String p0, int p1) {
super(p0, p1);
}


private static void initialize() {
b = ((long)(((moom._a)(moom._c.a(((long)(-7303604795687092304L)), ((long)(-5256458079269588092L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(158918476299608L)))));
    long local11_life6 = (net.minecraft.enchantment.EnumEnchantmentType.b ^ 42947218969692L);
    e = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill1845_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1845_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1845_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1845_14 = new byte[8];
    (__sourceSpill1845_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill1845_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation1845_16 = __sourceSpill1845_14;
    ((javax.crypto.Cipher)(__sourceSpill1845_11)).init(((int)(__sourceSpill1845_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1845_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1845_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[11];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = ":îöÍ`ºµ\017É&8\034«­Ü\020GEºX\031\026S:[7F;rcUüU-Å:äGK?yq\017\032à¢?1¿èw\003ìãµ+\026!°_÷¯>Ç"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1845_25 = local4_life21;
        int __sourceSpill1845_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1845_25)).substring(((int)(__sourceSpill1845_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1845_30 = local6_life19;
        int __sourceSpill1845_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill1845_33 = new byte[8];
        (__sourceSpill1845_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill1845_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill1845_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill1845_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill1845_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill1845_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill1845_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill1845_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill1845_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill1845_34)).doFinal(((byte[])(__sourceSpill1845_33)));
        (__sourceSpill1845_30)[__sourceSpill1845_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    local5_life23 = ((java.lang.String)((local4_life21 = "²®~{\030a4ùn»ÃÒ"))).length();
    local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1845_38 = local4_life21;
        int __sourceSpill1845_39 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1845_38)).substring(((int)(__sourceSpill1845_39)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1845_43 = local6_life19;
        int __sourceSpill1845_44 = local3_life20;
        local3_life20 += 1;
        long local8_life45 = (((((((((((long) (local7_life42)[0]) & 255L) << 56) | ((((long) (local7_life42)[1]) & 255L) << 48)) | ((((long) (local7_life42)[2]) & 255L) << 40)) | ((((long) (local7_life42)[3]) & 255L) << 32)) | ((((long) (local7_life42)[4]) & 255L) << 24)) | ((((long) (local7_life42)[5]) & 255L) << 16)) | ((((long) (local7_life42)[6]) & 255L) << 8)) | (((long) (local7_life42)[7]) & 255L));
        byte[] __sourceSpill1845_46 = new byte[8];
        (__sourceSpill1845_46)[0] = ((byte) ((int) (local8_life45 >>> 56)));
        (__sourceSpill1845_46)[1] = ((byte) ((int) (local8_life45 >>> 48)));
        (__sourceSpill1845_46)[2] = ((byte) ((int) (local8_life45 >>> 40)));
        (__sourceSpill1845_46)[3] = ((byte) ((int) (local8_life45 >>> 32)));
        (__sourceSpill1845_46)[4] = ((byte) ((int) (local8_life45 >>> 24)));
        (__sourceSpill1845_46)[5] = ((byte) ((int) (local8_life45 >>> 16)));
        (__sourceSpill1845_46)[6] = ((byte) ((int) (local8_life45 >>> 8)));
        (__sourceSpill1845_46)[7] = ((byte) ((int) local8_life45));
        javax.crypto.Cipher __sourceSpill1845_47 = local0_life9;
        byte[] local10_life49 = ((javax.crypto.Cipher)(__sourceSpill1845_47)).doFinal(((byte[])(__sourceSpill1845_46)));
        (__sourceSpill1845_43)[__sourceSpill1845_44] = (((((((((((long) (local10_life49)[0]) & 255L) << 56) | ((((long) (local10_life49)[1]) & 255L) << 48)) | ((((long) (local10_life49)[2]) & 255L) << 40)) | ((((long) (local10_life49)[3]) & 255L) << 32)) | ((((long) (local10_life49)[4]) & 255L) << 24)) | ((((long) (local10_life49)[5]) & 255L) << 16)) | ((((long) (local10_life49)[6]) & 255L) << 8)) | (((long) (local10_life49)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    c = ((long[])(local6_life19));
    d = ((java.lang.Integer[])(new java.lang.Integer[11]));
    ALL = ((net.minecraft.enchantment.EnumEnchantmentType)(new net.minecraft.enchantment.EnumEnchantmentType("ALL", 0)));
    ARMOR = ((net.minecraft.enchantment.EnumEnchantmentType)(new net.minecraft.enchantment.EnumEnchantmentType("ARMOR", 1)));
    ARMOR_FEET = ((net.minecraft.enchantment.EnumEnchantmentType)(new net.minecraft.enchantment.EnumEnchantmentType("ARMOR_FEET", 2)));
    ARMOR_LEGS = ((net.minecraft.enchantment.EnumEnchantmentType)(new net.minecraft.enchantment.EnumEnchantmentType("ARMOR_LEGS", 3)));
    ARMOR_TORSO = ((net.minecraft.enchantment.EnumEnchantmentType)(new net.minecraft.enchantment.EnumEnchantmentType("ARMOR_TORSO", 4)));
    ARMOR_HEAD = ((net.minecraft.enchantment.EnumEnchantmentType)(new net.minecraft.enchantment.EnumEnchantmentType("ARMOR_HEAD", 5)));
    WEAPON = ((net.minecraft.enchantment.EnumEnchantmentType)(new net.minecraft.enchantment.EnumEnchantmentType("WEAPON", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1845_58(8311, (6990562594935454626L ^ local11_life6)))));
    DIGGER = ((net.minecraft.enchantment.EnumEnchantmentType)(new net.minecraft.enchantment.EnumEnchantmentType("DIGGER", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1845_60(3699, (3636078023426610605L ^ local11_life6)))));
    FISHING_ROD = ((net.minecraft.enchantment.EnumEnchantmentType)(new net.minecraft.enchantment.EnumEnchantmentType("FISHING_ROD", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1845_62(22911, (4446999132327002792L ^ local11_life6)))));
    BREAKABLE = ((net.minecraft.enchantment.EnumEnchantmentType)(new net.minecraft.enchantment.EnumEnchantmentType("BREAKABLE", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1845_64(18200, (614692501041241287L ^ local11_life6)))));
    BOW = ((net.minecraft.enchantment.EnumEnchantmentType)(new net.minecraft.enchantment.EnumEnchantmentType("BOW", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1845_66(32482, (8783102380493825337L ^ local11_life6)))));
    a = ((net.minecraft.enchantment.EnumEnchantmentType[])(net.minecraft.enchantment.EnumEnchantmentType.a()));
}


public static net.minecraft.enchantment.EnumEnchantmentType[] values() {
return ((net.minecraft.enchantment.EnumEnchantmentType[])(((net.minecraft.enchantment.EnumEnchantmentType[])(net.minecraft.enchantment.EnumEnchantmentType.a)).clone()));
}


public static net.minecraft.enchantment.EnumEnchantmentType valueOf(java.lang.String p0) {
return ((net.minecraft.enchantment.EnumEnchantmentType)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.enchantment.EnumEnchantmentType.class)), ((java.lang.String)(p0)))));
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 3414;
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
            throw new RuntimeException("moom/aP", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         d[var3] = var15;
      }

      return d[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral11065_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/aP"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.enchantment.EnumEnchantmentType.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static net.minecraft.enchantment.EnumEnchantmentType[] a() {
long local0_life1 = (net.minecraft.enchantment.EnumEnchantmentType.b ^ 120054654062765L);
    net.minecraft.enchantment.EnumEnchantmentType[] __sourceSharedArray1094_4 = new net.minecraft.enchantment.EnumEnchantmentType[__sourceIntrinsic_668f4c1aec98_originalDynamicSite1094_2(28229, (4528341494166401376L ^ local0_life1))];
    __sourceSharedArray1094_4[0] = net.minecraft.enchantment.EnumEnchantmentType.ALL;
    __sourceSharedArray1094_4[1] = net.minecraft.enchantment.EnumEnchantmentType.ARMOR;
    __sourceSharedArray1094_4[2] = net.minecraft.enchantment.EnumEnchantmentType.ARMOR_FEET;
    __sourceSharedArray1094_4[3] = net.minecraft.enchantment.EnumEnchantmentType.ARMOR_LEGS;
    __sourceSharedArray1094_4[4] = net.minecraft.enchantment.EnumEnchantmentType.ARMOR_TORSO;
    __sourceSharedArray1094_4[5] = net.minecraft.enchantment.EnumEnchantmentType.ARMOR_HEAD;
    __sourceSharedArray1094_4[__sourceIntrinsic_668f4c1aec98_originalDynamicSite1094_10(14635, (2981443836951193091L ^ local0_life1))] = net.minecraft.enchantment.EnumEnchantmentType.WEAPON;
    __sourceSharedArray1094_4[__sourceIntrinsic_668f4c1aec98_originalDynamicSite1094_12(25714, (289169527454284633L ^ local0_life1))] = net.minecraft.enchantment.EnumEnchantmentType.DIGGER;
    __sourceSharedArray1094_4[__sourceIntrinsic_668f4c1aec98_originalDynamicSite1094_14(22577, (3145919134075619096L ^ local0_life1))] = net.minecraft.enchantment.EnumEnchantmentType.FISHING_ROD;
    __sourceSharedArray1094_4[__sourceIntrinsic_668f4c1aec98_originalDynamicSite1094_16(19126, (7300854321419392410L ^ local0_life1))] = net.minecraft.enchantment.EnumEnchantmentType.BREAKABLE;
    __sourceSharedArray1094_4[__sourceIntrinsic_668f4c1aec98_originalDynamicSite1094_18(5265, (8772332607174233020L ^ local0_life1))] = net.minecraft.enchantment.EnumEnchantmentType.BOW;
    return __sourceSharedArray1094_4;
}


public boolean a(net.minecraft.item.Item p0) {
net.minecraft.enchantment.EnumEnchantmentType forwardValue4889_15_0;
    net.minecraft.enchantment.EnumEnchantmentType forwardValue4889_15_1;
    int forwardValue4889_25_0;
    int forwardValue4889_50_0;
    int forwardValue4889_64_0;
    int forwardValue4889_64_1;
    int forwardValue4889_77_0;
    int forwardValue4889_77_1;
    int forwardValue4889_84_0;
    int forwardValue4889_87_0;
    int forwardValue4889_99_0;
    int forwardValue4889_111_0;
    int forwardValue4889_123_0;
    int forwardValue4889_130_0;
    net.minecraft.enchantment.EnumEnchantmentType spill4889_0;
    net.minecraft.enchantment.EnumEnchantmentType spill4889_1;
    boolean spill4889_2;
    int spill4889_3;
    int spill4889_4;
    long life2_3;
    int life4_5;
    net.minecraft.item.ItemArmor life5_56;
    forward_join_130: {
    forward_join_129: {
    forward_join_123: {
    forward_join_121: {
    forward_join_119: {
    forward_join_111: {
    forward_join_109: {
    forward_join_107: {
    forward_join_99: {
    forward_join_97: {
    forward_join_95: {
    forward_join_87: {
    forward_join_85: {
    forward_join_84: {
    forward_join_83: {
    forward_join_77: {
    forward_join_74: {
    forward_join_72: {
    forward_join_64: {
    forward_join_61: {
    forward_join_59: {
    forward_join_50: {
    forward_join_48: {
    forward_join_46: {
    forward_join_33: {
    forward_join_25: {
    forward_join_23: {
    forward_join_15: {
    forward_join_13: {
    life2_3 = (net.minecraft.enchantment.EnumEnchantmentType.b ^ 84241301104091L);
    life4_5 = ((moom.rV.b()) ? 1 : 0);
    spill4889_0 = this;
    spill4889_1 = net.minecraft.enchantment.EnumEnchantmentType.ALL;
    if (!((life4_5 != 0))) {
        forwardValue4889_15_0 = spill4889_0;
        forwardValue4889_15_1 = spill4889_1;
        break forward_join_15;
    }
    if (!((spill4889_0 == spill4889_1))) {
        break forward_join_13;
    }
    return ((1) != 0);
    }
    forwardValue4889_15_0 = this;
    forwardValue4889_15_1 = net.minecraft.enchantment.EnumEnchantmentType.BREAKABLE;
    }
    if (!((forwardValue4889_15_0 == forwardValue4889_15_1))) {
        break forward_join_23;
    }
    spill4889_2 = ((net.minecraft.item.Item)(p0)).b__Boolean();
    if (!((life4_5 != 0))) {
        forwardValue4889_25_0 = ((spill4889_2) ? 1 : 0);
        break forward_join_25;
    }
    if (!(spill4889_2)) {
        break forward_join_23;
    }
    return ((1) != 0);
    }
    forwardValue4889_25_0 = ((p0 instanceof net.minecraft.item.ItemArmor) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue4889_87_0 = forwardValue4889_25_0;
        break forward_join_87;
    }
    if (!((forwardValue4889_25_0 != 0))) {
        break forward_join_85;
    }
    if (!((this == net.minecraft.enchantment.EnumEnchantmentType.ARMOR))) {
        break forward_join_33;
    }
    return ((1) != 0);
    }
    life5_56 = ((net.minecraft.item.ItemArmor)(p0));
    spill4889_3 = ((net.minecraft.item.ItemArmor)(life5_56)).q;
    if (!((life4_5 != 0))) {
        forwardValue4889_50_0 = spill4889_3;
        break forward_join_50;
    }
    if (!((spill4889_3 == 0))) {
        break forward_join_48;
    }
    if (!((this == net.minecraft.enchantment.EnumEnchantmentType.ARMOR_HEAD))) {
        break forward_join_46;
    }
    forwardValue4889_84_0 = 1;
    break forward_join_84;
    }
    forwardValue4889_84_0 = 0;
    break forward_join_84;
    }
    forwardValue4889_50_0 = ((net.minecraft.item.ItemArmor)(life5_56)).q;
    }
    spill4889_4 = 2;
    if (!((life4_5 != 0))) {
        forwardValue4889_64_0 = forwardValue4889_50_0;
        forwardValue4889_64_1 = spill4889_4;
        break forward_join_64;
    }
    if (!((forwardValue4889_50_0 == spill4889_4))) {
        break forward_join_61;
    }
    if (!((this == net.minecraft.enchantment.EnumEnchantmentType.ARMOR_LEGS))) {
        break forward_join_59;
    }
    forwardValue4889_84_0 = 1;
    break forward_join_84;
    }
    forwardValue4889_84_0 = 0;
    break forward_join_84;
    }
    forwardValue4889_64_0 = ((net.minecraft.item.ItemArmor)(life5_56)).q;
    forwardValue4889_64_1 = 1;
    }
    if (!((life4_5 != 0))) {
        forwardValue4889_77_0 = forwardValue4889_64_0;
        forwardValue4889_77_1 = forwardValue4889_64_1;
        break forward_join_77;
    }
    if (!((forwardValue4889_64_0 == forwardValue4889_64_1))) {
        break forward_join_74;
    }
    if (!((this == net.minecraft.enchantment.EnumEnchantmentType.ARMOR_TORSO))) {
        break forward_join_72;
    }
    forwardValue4889_84_0 = 1;
    break forward_join_84;
    }
    forwardValue4889_84_0 = 0;
    break forward_join_84;
    }
    forwardValue4889_77_0 = ((net.minecraft.item.ItemArmor)(life5_56)).q;
    forwardValue4889_77_1 = 3;
    }
    if (!((forwardValue4889_77_0 == forwardValue4889_77_1))) {
        break forward_join_83;
    }
    if (!((this == net.minecraft.enchantment.EnumEnchantmentType.ARMOR_FEET))) {
        break forward_join_83;
    }
    forwardValue4889_84_0 = 1;
    break forward_join_84;
    }
    forwardValue4889_84_0 = 0;
    }
    return ((forwardValue4889_84_0) != 0);
    }
    forwardValue4889_87_0 = ((p0 instanceof moom.xP) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue4889_99_0 = forwardValue4889_87_0;
        break forward_join_99;
    }
    if (!((forwardValue4889_87_0 != 0))) {
        break forward_join_97;
    }
    if (!((this == net.minecraft.enchantment.EnumEnchantmentType.WEAPON))) {
        break forward_join_95;
    }
    forwardValue4889_130_0 = 1;
    break forward_join_130;
    }
    forwardValue4889_130_0 = 0;
    break forward_join_130;
    }
    forwardValue4889_99_0 = ((p0 instanceof net.minecraft.item.ItemTool) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue4889_111_0 = forwardValue4889_99_0;
        break forward_join_111;
    }
    if (!((forwardValue4889_99_0 != 0))) {
        break forward_join_109;
    }
    if (!((this == net.minecraft.enchantment.EnumEnchantmentType.DIGGER))) {
        break forward_join_107;
    }
    forwardValue4889_130_0 = 1;
    break forward_join_130;
    }
    forwardValue4889_130_0 = 0;
    break forward_join_130;
    }
    forwardValue4889_111_0 = ((p0 instanceof net.minecraft.item.ItemBow) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue4889_123_0 = forwardValue4889_111_0;
        break forward_join_123;
    }
    if (!((forwardValue4889_111_0 != 0))) {
        break forward_join_121;
    }
    if (!((this == net.minecraft.enchantment.EnumEnchantmentType.BOW))) {
        break forward_join_119;
    }
    forwardValue4889_130_0 = 1;
    break forward_join_130;
    }
    forwardValue4889_130_0 = 0;
    break forward_join_130;
    }
    forwardValue4889_123_0 = ((p0 instanceof moom.xn) ? 1 : 0);
    }
    if (!((forwardValue4889_123_0 != 0))) {
        break forward_join_129;
    }
    if (!((this == net.minecraft.enchantment.EnumEnchantmentType.FISHING_ROD))) {
        break forward_join_129;
    }
    forwardValue4889_130_0 = 1;
    break forward_join_130;
    }
    forwardValue4889_130_0 = 0;
    }
    return ((forwardValue4889_130_0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1845_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1845_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1845_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1845_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1845_66(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral11065_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_668f4c1aec98_originalDynamicSite1094_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_668f4c1aec98_originalDynamicSite1094_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_668f4c1aec98_originalDynamicSite1094_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_668f4c1aec98_originalDynamicSite1094_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_668f4c1aec98_originalDynamicSite1094_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_668f4c1aec98_originalDynamicSite1094_18(int a0, long a1) throws E;
}
