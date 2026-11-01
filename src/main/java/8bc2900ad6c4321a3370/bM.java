package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class bM extends sourcebuild.EnumConstructor<moom.bM> {

public static moom.bM ANVIL;

public static moom.bM BEACON;

public static moom.bM BREWING_STAND;

public static moom.bM CHEST;

public static moom.bM CRAFTING;

public static moom.bM DISPENSER;

public static moom.bM ENCHANTMENT;

public static moom.bM FURNACE;

public static moom.bM HOPPER;

public static moom.bM HORSE;

public static moom.bM VILLAGER;

public static moom.bM SHULKER_BOX;

public static moom.bM CREATIVE;

public static moom.bM INVENTORY;

public static moom.bM[] VALUES;

private static moom.bM[] a;

private static long b;

private static long[] c;

private static java.lang.Integer[] d;

private static java.util.Map e;

private bM(java.lang.String p0, int p1) {
super(p0, p1);
}


private static void initialize() {
b = ((long)(((moom._a)(moom._c.a(((long)(1129152062828665209L)), ((long)(-4158352315315057079L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(232735232658012L)))));
    long local20_life6 = (moom.bM.b ^ 120344969706319L);
    javax.crypto.Cipher local12_life8;
    javax.crypto.Cipher __sourceSpill765_10 = (local12_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill765_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill765_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill765_13 = new byte[8];
    (__sourceSpill765_13)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local13_life14 = 1;
    while ((local13_life14 < 8)) {
        (__sourceSpill765_13)[local13_life14] = ((byte) ((int) ((local20_life6 << (local13_life14 * 8)) >>> 56)));
        local13_life14 += 1;
    }
    byte[] __sourcePreallocation765_15 = __sourceSpill765_13;
    ((javax.crypto.Cipher)(__sourceSpill765_10)).init(((int)(__sourceSpill765_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill765_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation765_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local11_life18 = new java.lang.String[14];
    int local17_life19 = 0;
    java.lang.String local16_life20;
    int local18_life22 = ((java.lang.String)((local16_life20 = "Ð\007öW8=\026 n1\035\007¨º\031\004\bIÚö\000\035²/\020þ@|bTÀ\001ÿ>Uzõe&\020E ÀÇ'í?ß*õ«\031Eý\b¶\0022ç\021¢×\b\0337\035]B\013\004°\020<w)Ë0\0060ÿ6VR±×¸38\020ú¬R\034+¡N³¥<L9¾û\020Ý-\r?\003yJ_6ÁÓ9úã\bà·\0300'«ì%\bJ1´TÅHck\b«Íxò\023óü"))).length();
    int local15_life23 = 16;
    int local14_life24 = -1;
    while (true) {
        local14_life24 += 1;
        byte[] __sourceSpill765_27 = ((java.lang.String)(((java.lang.String)(local16_life20)).substring(((int)(local14_life24)), ((int)((local14_life24 + local15_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill765_28 = local12_life8;
        byte[] local19_life30 = ((javax.crypto.Cipher)(__sourceSpill765_28)).doFinal(((byte[])(__sourceSpill765_27)));
        java.lang.String __sourceSpill765_33 = ((java.lang.String)(moom.bM.a(((byte[])(local19_life30))))).intern();
        java.lang.String[] __sourceSpill765_34 = local11_life18;
        int __sourceSpill765_35 = local17_life19;
        local17_life19 += 1;
        (__sourceSpill765_34)[__sourceSpill765_35] = __sourceSpill765_33;
        if (!(((local14_life24 = (local14_life24 + local15_life23)) < local18_life22))) { break; }
        local15_life23 = ((java.lang.String)(local16_life20)).charAt(((int)(local14_life24)));
    }
    local18_life22 = ((java.lang.String)((local16_life20 = "N) cß&mÚå>Æ4[1h\020iN8\001\023 IæGÀv·à\f."))).length();
    local15_life23 = 16;
    local14_life24 = -1;
    while (true) {
        local14_life24 += 1;
        byte[] __sourceSpill765_40 = ((java.lang.String)(((java.lang.String)(local16_life20)).substring(((int)(local14_life24)), ((int)((local14_life24 + local15_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill765_41 = local12_life8;
        byte[] local19_life43 = ((javax.crypto.Cipher)(__sourceSpill765_41)).doFinal(((byte[])(__sourceSpill765_40)));
        java.lang.String __sourceSpill765_46 = ((java.lang.String)(moom.bM.a(((byte[])(local19_life43))))).intern();
        java.lang.String[] __sourceSpill765_47 = local11_life18;
        int __sourceSpill765_48 = local17_life19;
        local17_life19 += 1;
        (__sourceSpill765_47)[__sourceSpill765_48] = __sourceSpill765_46;
        if (!(((local14_life24 = (local14_life24 + local15_life23)) < local18_life22))) { break; }
        local15_life23 = ((java.lang.String)(local16_life20)).charAt(((int)(local14_life24)));
    }
    e = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life52;
    javax.crypto.Cipher __sourceSpill765_54 = (local0_life52 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill765_55 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill765_56 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill765_57 = new byte[8];
    (__sourceSpill765_57)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local1_life58 = 1;
    while ((local1_life58 < 8)) {
        (__sourceSpill765_57)[local1_life58] = ((byte) ((int) ((local20_life6 << (local1_life58 * 8)) >>> 56)));
        local1_life58 += 1;
    }
    byte[] __sourcePreallocation765_59 = __sourceSpill765_57;
    ((javax.crypto.Cipher)(__sourceSpill765_54)).init(((int)(__sourceSpill765_55)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill765_56)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation765_59)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life62 = new long[17];
    int local3_life63 = 0;
    java.lang.String local4_life64;
    int local5_life66 = ((java.lang.String)((local4_life64 = "¢6þJ\002uØ<X\027\006N£ýkRû\037=`\026pÊ8\016ñü¢äýo\030ó;3ÔOT³íìPè]ë{\005¢(ô\023H\r4F*Pª\033\023j÷6>8U\007¶äô\002\033~ï&¾\025ÝÎ]°Q8aî²ymRG9kB·\002õLzR\017òj"))).length();
    int local2_life67 = 0;
    do {
        java.lang.String __sourceSpill765_68 = local4_life64;
        int __sourceSpill765_69 = local2_life67;
        local2_life67 += 8;
        byte[] local7_life72 = ((java.lang.String)(((java.lang.String)(__sourceSpill765_68)).substring(((int)(__sourceSpill765_69)), ((int)(local2_life67))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill765_73 = local6_life62;
        int __sourceSpill765_74 = local3_life63;
        local3_life63 += 1;
        long local8_life75 = (((((((((((long) (local7_life72)[0]) & 255L) << 56) | ((((long) (local7_life72)[1]) & 255L) << 48)) | ((((long) (local7_life72)[2]) & 255L) << 40)) | ((((long) (local7_life72)[3]) & 255L) << 32)) | ((((long) (local7_life72)[4]) & 255L) << 24)) | ((((long) (local7_life72)[5]) & 255L) << 16)) | ((((long) (local7_life72)[6]) & 255L) << 8)) | (((long) (local7_life72)[7]) & 255L));
        byte[] __sourceSpill765_76 = new byte[8];
        (__sourceSpill765_76)[0] = ((byte) ((int) (local8_life75 >>> 56)));
        (__sourceSpill765_76)[1] = ((byte) ((int) (local8_life75 >>> 48)));
        (__sourceSpill765_76)[2] = ((byte) ((int) (local8_life75 >>> 40)));
        (__sourceSpill765_76)[3] = ((byte) ((int) (local8_life75 >>> 32)));
        (__sourceSpill765_76)[4] = ((byte) ((int) (local8_life75 >>> 24)));
        (__sourceSpill765_76)[5] = ((byte) ((int) (local8_life75 >>> 16)));
        (__sourceSpill765_76)[6] = ((byte) ((int) (local8_life75 >>> 8)));
        (__sourceSpill765_76)[7] = ((byte) ((int) local8_life75));
        javax.crypto.Cipher __sourceSpill765_77 = local0_life52;
        byte[] local10_life79 = ((javax.crypto.Cipher)(__sourceSpill765_77)).doFinal(((byte[])(__sourceSpill765_76)));
        (__sourceSpill765_73)[__sourceSpill765_74] = (((((((((((long) (local10_life79)[0]) & 255L) << 56) | ((((long) (local10_life79)[1]) & 255L) << 48)) | ((((long) (local10_life79)[2]) & 255L) << 40)) | ((((long) (local10_life79)[3]) & 255L) << 32)) | ((((long) (local10_life79)[4]) & 255L) << 24)) | ((((long) (local10_life79)[5]) & 255L) << 16)) | ((((long) (local10_life79)[6]) & 255L) << 8)) | (((long) (local10_life79)[7]) & 255L));
    } while ((!(local2_life67 >= local5_life66)));
    local5_life66 = ((java.lang.String)((local4_life64 = "Äµ`Þ\007lº\026ÍÚ\035É@¼\0305"))).length();
    local2_life67 = 0;
    do {
        java.lang.String __sourceSpill765_81 = local4_life64;
        int __sourceSpill765_82 = local2_life67;
        local2_life67 += 8;
        byte[] local7_life85 = ((java.lang.String)(((java.lang.String)(__sourceSpill765_81)).substring(((int)(__sourceSpill765_82)), ((int)(local2_life67))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill765_86 = local6_life62;
        int __sourceSpill765_87 = local3_life63;
        local3_life63 += 1;
        long local8_life88 = (((((((((((long) (local7_life85)[0]) & 255L) << 56) | ((((long) (local7_life85)[1]) & 255L) << 48)) | ((((long) (local7_life85)[2]) & 255L) << 40)) | ((((long) (local7_life85)[3]) & 255L) << 32)) | ((((long) (local7_life85)[4]) & 255L) << 24)) | ((((long) (local7_life85)[5]) & 255L) << 16)) | ((((long) (local7_life85)[6]) & 255L) << 8)) | (((long) (local7_life85)[7]) & 255L));
        byte[] __sourceSpill765_89 = new byte[8];
        (__sourceSpill765_89)[0] = ((byte) ((int) (local8_life88 >>> 56)));
        (__sourceSpill765_89)[1] = ((byte) ((int) (local8_life88 >>> 48)));
        (__sourceSpill765_89)[2] = ((byte) ((int) (local8_life88 >>> 40)));
        (__sourceSpill765_89)[3] = ((byte) ((int) (local8_life88 >>> 32)));
        (__sourceSpill765_89)[4] = ((byte) ((int) (local8_life88 >>> 24)));
        (__sourceSpill765_89)[5] = ((byte) ((int) (local8_life88 >>> 16)));
        (__sourceSpill765_89)[6] = ((byte) ((int) (local8_life88 >>> 8)));
        (__sourceSpill765_89)[7] = ((byte) ((int) local8_life88));
        javax.crypto.Cipher __sourceSpill765_90 = local0_life52;
        byte[] local10_life92 = ((javax.crypto.Cipher)(__sourceSpill765_90)).doFinal(((byte[])(__sourceSpill765_89)));
        (__sourceSpill765_86)[__sourceSpill765_87] = (((((((((((long) (local10_life92)[0]) & 255L) << 56) | ((((long) (local10_life92)[1]) & 255L) << 48)) | ((((long) (local10_life92)[2]) & 255L) << 40)) | ((((long) (local10_life92)[3]) & 255L) << 32)) | ((((long) (local10_life92)[4]) & 255L) << 24)) | ((((long) (local10_life92)[5]) & 255L) << 16)) | ((((long) (local10_life92)[6]) & 255L) << 8)) | (((long) (local10_life92)[7]) & 255L));
    } while ((!(local2_life67 >= local5_life66)));
    c = ((long[])(local6_life62));
    d = ((java.lang.Integer[])(new java.lang.Integer[17]));
    ANVIL = ((moom.bM)(new moom.bM((local11_life18)[10], 0)));
    BEACON = ((moom.bM)(new moom.bM((local11_life18)[5], 1)));
    BREWING_STAND = ((moom.bM)(new moom.bM((local11_life18)[13], 2)));
    CHEST = ((moom.bM)(new moom.bM((local11_life18)[1], 3)));
    CRAFTING = ((moom.bM)(new moom.bM((local11_life18)[0], 4)));
    DISPENSER = ((moom.bM)(new moom.bM((local11_life18)[8], 5)));
    ENCHANTMENT = ((moom.bM)(new moom.bM((local11_life18)[12], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite765_101(18102, (6954957234968266852L ^ local20_life6)))));
    FURNACE = ((moom.bM)(new moom.bM((local11_life18)[9], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite765_103(30979, (8869539785600612315L ^ local20_life6)))));
    HOPPER = ((moom.bM)(new moom.bM((local11_life18)[11], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite765_105(17668, (8150072344779459550L ^ local20_life6)))));
    HORSE = ((moom.bM)(new moom.bM((local11_life18)[4], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite765_107(12234, (1614319728721322245L ^ local20_life6)))));
    VILLAGER = ((moom.bM)(new moom.bM((local11_life18)[2], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite765_109(13756, (8106238786907274090L ^ local20_life6)))));
    SHULKER_BOX = ((moom.bM)(new moom.bM((local11_life18)[6], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite765_111(7480, (4695199034757108709L ^ local20_life6)))));
    CREATIVE = ((moom.bM)(new moom.bM((local11_life18)[3], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite765_113(7958, (8404166856253624783L ^ local20_life6)))));
    INVENTORY = ((moom.bM)(new moom.bM((local11_life18)[7], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite765_115(14767, (5499259550169724794L ^ local20_life6)))));
    a = ((moom.bM[])(moom.bM.a()));
    VALUES = ((moom.bM[])(moom.bM.values()));
}


public static moom.bM[] values() {
return ((moom.bM[])(((moom.bM[])(moom.bM.a)).clone()));
}


public static moom.bM valueOf(java.lang.String p0) {
return ((moom.bM)(java.lang.Enum.valueOf(((java.lang.Class)(moom.bM.class)), ((java.lang.String)(p0)))));
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 24664;
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
            throw new RuntimeException("moom/bM", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         d[var3] = var15;
      }

      return d[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.bM.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6924_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/bM"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.String a(byte[] p0) {
int life1_1;
    int life2_5;
    char[] life3_7;
    int life4_9;
    int life5_19;
    int life6_39;
    int life5_44;
    int life6_52;
    int life6_71;
    int life5_76;
    int life6_86;
    int life5_91;
    int life6_99;
    life1_1 = 0;
    life3_7 = new char[(life2_5 = (p0).length)];
    life4_9 = 0;
    loop_region_10: while ((life4_9 < life2_5)) {
        if (((life5_19 = (255 & (p0)[life4_9])) < 192)) {
        (life3_7)[(life1_1++)] = ((char) life5_19);
    } else {
        if ((life5_19 < 224)) {
        life6_39 = ((int)(((char) (((char) (life5_19 & 31)) << 6))));
        byte[] spill3501_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3501_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3501_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3501_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3501_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3501_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static moom.bM[] a() {
long local0_life1 = (moom.bM.b ^ 106310223905703L);
    moom.bM[] __sourceSharedArray755_4 = new moom.bM[__sourceIntrinsic_a616fa45b88e_originalDynamicSite755_2(3929, (1623344675413883238L ^ local0_life1))];
    __sourceSharedArray755_4[0] = moom.bM.ANVIL;
    __sourceSharedArray755_4[1] = moom.bM.BEACON;
    __sourceSharedArray755_4[2] = moom.bM.BREWING_STAND;
    __sourceSharedArray755_4[3] = moom.bM.CHEST;
    __sourceSharedArray755_4[4] = moom.bM.CRAFTING;
    __sourceSharedArray755_4[5] = moom.bM.DISPENSER;
    __sourceSharedArray755_4[__sourceIntrinsic_a616fa45b88e_originalDynamicSite755_10(15395, (7053806981779900948L ^ local0_life1))] = moom.bM.ENCHANTMENT;
    __sourceSharedArray755_4[__sourceIntrinsic_a616fa45b88e_originalDynamicSite755_12(17719, (6576721893376766723L ^ local0_life1))] = moom.bM.FURNACE;
    __sourceSharedArray755_4[__sourceIntrinsic_a616fa45b88e_originalDynamicSite755_14(31986, (5819319222054980289L ^ local0_life1))] = moom.bM.HOPPER;
    __sourceSharedArray755_4[__sourceIntrinsic_a616fa45b88e_originalDynamicSite755_16(4638, (2461275319354680358L ^ local0_life1))] = moom.bM.HORSE;
    __sourceSharedArray755_4[__sourceIntrinsic_a616fa45b88e_originalDynamicSite755_18(9331, (6940689869304844879L ^ local0_life1))] = moom.bM.VILLAGER;
    __sourceSharedArray755_4[__sourceIntrinsic_a616fa45b88e_originalDynamicSite755_20(16095, (1303336584688224489L ^ local0_life1))] = moom.bM.SHULKER_BOX;
    __sourceSharedArray755_4[__sourceIntrinsic_a616fa45b88e_originalDynamicSite755_22(16091, (2693308651418372320L ^ local0_life1))] = moom.bM.CREATIVE;
    __sourceSharedArray755_4[__sourceIntrinsic_a616fa45b88e_originalDynamicSite755_24(1353, (8096529455695590256L ^ local0_life1))] = moom.bM.INVENTORY;
    return __sourceSharedArray755_4;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite765_101(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite765_103(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite765_105(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite765_107(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite765_109(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite765_111(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite765_113(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite765_115(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6924_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a616fa45b88e_originalDynamicSite755_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a616fa45b88e_originalDynamicSite755_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a616fa45b88e_originalDynamicSite755_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a616fa45b88e_originalDynamicSite755_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a616fa45b88e_originalDynamicSite755_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a616fa45b88e_originalDynamicSite755_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a616fa45b88e_originalDynamicSite755_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a616fa45b88e_originalDynamicSite755_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a616fa45b88e_originalDynamicSite755_24(int a0, long a1) throws E;
}
