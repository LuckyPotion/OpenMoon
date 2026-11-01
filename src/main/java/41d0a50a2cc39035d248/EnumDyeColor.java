package net.minecraft.item;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class EnumDyeColor extends sourcebuild.EnumConstructor<net.minecraft.item.EnumDyeColor> implements net.minecraft.util.IStringSerializable {

public static net.minecraft.item.EnumDyeColor WHITE;

public static net.minecraft.item.EnumDyeColor ORANGE;

public static net.minecraft.item.EnumDyeColor MAGENTA;

public static net.minecraft.item.EnumDyeColor LIGHT_BLUE;

public static net.minecraft.item.EnumDyeColor YELLOW;

public static net.minecraft.item.EnumDyeColor LIME;

public static net.minecraft.item.EnumDyeColor PINK;

public static net.minecraft.item.EnumDyeColor GRAY;

public static net.minecraft.item.EnumDyeColor SILVER;

public static net.minecraft.item.EnumDyeColor CYAN;

public static net.minecraft.item.EnumDyeColor PURPLE;

public static net.minecraft.item.EnumDyeColor BLUE;

public static net.minecraft.item.EnumDyeColor BROWN;

public static net.minecraft.item.EnumDyeColor GREEN;

public static net.minecraft.item.EnumDyeColor RED;

public static net.minecraft.item.EnumDyeColor BLACK;

private static net.minecraft.item.EnumDyeColor[] a;

private static net.minecraft.item.EnumDyeColor[] b;

private int c;

private int d;

private java.lang.String e;

private java.lang.String f;

private moom.fm g;

private net.minecraft.util.EnumChatFormatting h;

private static net.minecraft.item.EnumDyeColor[] i;

private static long j;

private static long[] k;

private static java.lang.Integer[] l;

private static java.util.Map m;

private EnumDyeColor(java.lang.String p0, int p1, int p2, int p3, java.lang.String p4, java.lang.String p5, moom.fm p6, net.minecraft.util.EnumChatFormatting p7) {
super(p0, p1);
    this.c = p2;
    this.d = p3;
    this.e = p4;
    this.f = p5;
    this.g = p6;
    this.h = p7;
}


private static void initialize() {
j = ((long)(((moom._a)(moom._c.a(((long)(4547333650602331980L)), ((long)(543090676731688708L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(114257990399572L)))));
    long local11_life6 = (net.minecraft.item.EnumDyeColor.j ^ 69151546831438L);
    m = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill1895_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1895_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1895_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1895_14 = new byte[8];
    (__sourceSpill1895_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill1895_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation1895_16 = __sourceSpill1895_14;
    ((javax.crypto.Cipher)(__sourceSpill1895_11)).init(((int)(__sourceSpill1895_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1895_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1895_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[21];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "¾ï\032\016&÷Cvÿ`f\tÜi7~Þ²6¹á\bÅÌ¨}T\033nwÒS¼Ä\f´B/`Ð\r|^\0035\fµpÊäÕ\013C\017ä\000Ý\021½md9±zR×v/ÔAù\024¶é\024µÒ]Ig$yL¨n\005GXXÈ\025J·\026\tKÈíàT\001~xÇ+Dc>\004T×\004(+©Ï¡KVöHt^"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1895_25 = local4_life21;
        int __sourceSpill1895_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1895_25)).substring(((int)(__sourceSpill1895_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1895_30 = local6_life19;
        int __sourceSpill1895_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill1895_33 = new byte[8];
        (__sourceSpill1895_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill1895_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill1895_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill1895_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill1895_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill1895_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill1895_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill1895_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill1895_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill1895_34)).doFinal(((byte[])(__sourceSpill1895_33)));
        (__sourceSpill1895_30)[__sourceSpill1895_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    local5_life23 = ((java.lang.String)((local4_life21 = "Ì}¶\000MÑ¬ÑÉM«ëI\016"))).length();
    local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1895_38 = local4_life21;
        int __sourceSpill1895_39 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1895_38)).substring(((int)(__sourceSpill1895_39)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1895_43 = local6_life19;
        int __sourceSpill1895_44 = local3_life20;
        local3_life20 += 1;
        long local8_life45 = (((((((((((long) (local7_life42)[0]) & 255L) << 56) | ((((long) (local7_life42)[1]) & 255L) << 48)) | ((((long) (local7_life42)[2]) & 255L) << 40)) | ((((long) (local7_life42)[3]) & 255L) << 32)) | ((((long) (local7_life42)[4]) & 255L) << 24)) | ((((long) (local7_life42)[5]) & 255L) << 16)) | ((((long) (local7_life42)[6]) & 255L) << 8)) | (((long) (local7_life42)[7]) & 255L));
        byte[] __sourceSpill1895_46 = new byte[8];
        (__sourceSpill1895_46)[0] = ((byte) ((int) (local8_life45 >>> 56)));
        (__sourceSpill1895_46)[1] = ((byte) ((int) (local8_life45 >>> 48)));
        (__sourceSpill1895_46)[2] = ((byte) ((int) (local8_life45 >>> 40)));
        (__sourceSpill1895_46)[3] = ((byte) ((int) (local8_life45 >>> 32)));
        (__sourceSpill1895_46)[4] = ((byte) ((int) (local8_life45 >>> 24)));
        (__sourceSpill1895_46)[5] = ((byte) ((int) (local8_life45 >>> 16)));
        (__sourceSpill1895_46)[6] = ((byte) ((int) (local8_life45 >>> 8)));
        (__sourceSpill1895_46)[7] = ((byte) ((int) local8_life45));
        javax.crypto.Cipher __sourceSpill1895_47 = local0_life9;
        byte[] local10_life49 = ((javax.crypto.Cipher)(__sourceSpill1895_47)).doFinal(((byte[])(__sourceSpill1895_46)));
        (__sourceSpill1895_43)[__sourceSpill1895_44] = (((((((((((long) (local10_life49)[0]) & 255L) << 56) | ((((long) (local10_life49)[1]) & 255L) << 48)) | ((((long) (local10_life49)[2]) & 255L) << 40)) | ((((long) (local10_life49)[3]) & 255L) << 32)) | ((((long) (local10_life49)[4]) & 255L) << 24)) | ((((long) (local10_life49)[5]) & 255L) << 16)) | ((((long) (local10_life49)[6]) & 255L) << 8)) | (((long) (local10_life49)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    k = ((long[])(local6_life19));
    l = ((java.lang.Integer[])(new java.lang.Integer[21]));
    WHITE = ((net.minecraft.item.EnumDyeColor)(new net.minecraft.item.EnumDyeColor("WHITE", 0, 0, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_52(2907, (9180025788138985284L ^ local11_life6)), "white", "white", moom.fm.j, net.minecraft.util.EnumChatFormatting.WHITE)));
    ORANGE = ((net.minecraft.item.EnumDyeColor)(new net.minecraft.item.EnumDyeColor("ORANGE", 1, 1, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_56(6736, (7651555550314595904L ^ local11_life6)), "orange", "orange", moom.fm.q, net.minecraft.util.EnumChatFormatting.GOLD)));
    MAGENTA = ((net.minecraft.item.EnumDyeColor)(new net.minecraft.item.EnumDyeColor("MAGENTA", 2, 2, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_60(7210, (3562786234629029937L ^ local11_life6)), "magenta", "magenta", moom.fm.r, net.minecraft.util.EnumChatFormatting.AQUA)));
    LIGHT_BLUE = ((net.minecraft.item.EnumDyeColor)(new net.minecraft.item.EnumDyeColor("LIGHT_BLUE", 3, 3, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_64(30113, (7269937689741748659L ^ local11_life6)), "light_blue", "lightBlue", moom.fm.s, net.minecraft.util.EnumChatFormatting.BLUE)));
    YELLOW = ((net.minecraft.item.EnumDyeColor)(new net.minecraft.item.EnumDyeColor("YELLOW", 4, 4, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_68(22941, (3103610994193679751L ^ local11_life6)), "yellow", "yellow", moom.fm.t, net.minecraft.util.EnumChatFormatting.YELLOW)));
    LIME = ((net.minecraft.item.EnumDyeColor)(new net.minecraft.item.EnumDyeColor("LIME", 5, 5, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_72(970, (8141409880596127688L ^ local11_life6)), "lime", "lime", moom.fm.u, net.minecraft.util.EnumChatFormatting.GREEN)));
    PINK = ((net.minecraft.item.EnumDyeColor)(new net.minecraft.item.EnumDyeColor("PINK", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_76(2514, (4558943852396582339L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_77(2514, (4558943852396582339L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_78(26497, (3825845509272238999L ^ local11_life6)), "pink", "pink", moom.fm.v, net.minecraft.util.EnumChatFormatting.LIGHT_PURPLE)));
    GRAY = ((net.minecraft.item.EnumDyeColor)(new net.minecraft.item.EnumDyeColor("GRAY", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_82(297, (5830174587228101950L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_83(297, (5830174587228101950L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_84(9593, (5327497393601395047L ^ local11_life6)), "gray", "gray", moom.fm.w, net.minecraft.util.EnumChatFormatting.DARK_GRAY)));
    SILVER = ((net.minecraft.item.EnumDyeColor)(new net.minecraft.item.EnumDyeColor("SILVER", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_88(9593, (5327497393601395047L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_89(9593, (5327497393601395047L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_90(297, (5830174587228101950L ^ local11_life6)), "silver", "silver", moom.fm.x, net.minecraft.util.EnumChatFormatting.GRAY)));
    CYAN = ((net.minecraft.item.EnumDyeColor)(new net.minecraft.item.EnumDyeColor("CYAN", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_94(26497, (3825845509272238999L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_95(26497, (3825845509272238999L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_96(2514, (4558943852396582339L ^ local11_life6)), "cyan", "cyan", moom.fm.y, net.minecraft.util.EnumChatFormatting.DARK_AQUA)));
    PURPLE = ((net.minecraft.item.EnumDyeColor)(new net.minecraft.item.EnumDyeColor("PURPLE", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_100(970, (8141409880596127688L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_101(970, (8141409880596127688L ^ local11_life6)), 5, "purple", "purple", moom.fm.z, net.minecraft.util.EnumChatFormatting.DARK_PURPLE)));
    BLUE = ((net.minecraft.item.EnumDyeColor)(new net.minecraft.item.EnumDyeColor("BLUE", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_105(22941, (3103610994193679751L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_106(22941, (3103610994193679751L ^ local11_life6)), 4, "blue", "blue", moom.fm.A, net.minecraft.util.EnumChatFormatting.DARK_BLUE)));
    BROWN = ((net.minecraft.item.EnumDyeColor)(new net.minecraft.item.EnumDyeColor("BROWN", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_110(30113, (7269937689741748659L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_111(30113, (7269937689741748659L ^ local11_life6)), 3, "brown", "brown", moom.fm.B, net.minecraft.util.EnumChatFormatting.GOLD)));
    GREEN = ((net.minecraft.item.EnumDyeColor)(new net.minecraft.item.EnumDyeColor("GREEN", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_115(7210, (3562786234629029937L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_116(7210, (3562786234629029937L ^ local11_life6)), 2, "green", "green", moom.fm.C, net.minecraft.util.EnumChatFormatting.DARK_GREEN)));
    RED = ((net.minecraft.item.EnumDyeColor)(new net.minecraft.item.EnumDyeColor("RED", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_120(6736, (7651555550314595904L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_121(6736, (7651555550314595904L ^ local11_life6)), 1, "red", "red", moom.fm.D, net.minecraft.util.EnumChatFormatting.DARK_RED)));
    BLACK = ((net.minecraft.item.EnumDyeColor)(new net.minecraft.item.EnumDyeColor("BLACK", __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_125(2907, (9180025788138985284L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_126(2907, (9180025788138985284L ^ local11_life6)), 0, "black", "black", moom.fm.E, net.minecraft.util.EnumChatFormatting.BLACK)));
    i = ((net.minecraft.item.EnumDyeColor[])(net.minecraft.item.EnumDyeColor.a__Arraya2()));
    a = ((net.minecraft.item.EnumDyeColor[])(new net.minecraft.item.EnumDyeColor[(net.minecraft.item.EnumDyeColor.values()).length]));
    b = ((net.minecraft.item.EnumDyeColor[])(new net.minecraft.item.EnumDyeColor[(net.minecraft.item.EnumDyeColor.values()).length]));
    net.minecraft.item.EnumDyeColor[] local13_life137 = net.minecraft.item.EnumDyeColor.values();
    int local14_life138 = (local13_life137).length;
    int local15_life139 = 0;
    while ((local15_life139 < local14_life138)) {
        net.minecraft.item.EnumDyeColor local16_life140 = (local13_life137)[local15_life139];
        (net.minecraft.item.EnumDyeColor.a)[((net.minecraft.item.EnumDyeColor)(local16_life140)).a()] = local16_life140;
        (net.minecraft.item.EnumDyeColor.b)[((net.minecraft.item.EnumDyeColor)(local16_life140)).b()] = local16_life140;
        local15_life139 += 1;
    }
}


public java.lang.String toString() {
return this.f;
}


public static net.minecraft.item.EnumDyeColor[] values() {
return ((net.minecraft.item.EnumDyeColor[])(((net.minecraft.item.EnumDyeColor[])(net.minecraft.item.EnumDyeColor.i)).clone()));
}


public static net.minecraft.item.EnumDyeColor valueOf(java.lang.String p0) {
return ((net.minecraft.item.EnumDyeColor)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.item.EnumDyeColor.class)), ((java.lang.String)(p0)))));
}


public static net.minecraft.item.EnumDyeColor b(int p0) {
int forwardValue5463_17_0;
    int spill5463_0;
    int spill5463_1;
    long life1_3;
    int life3_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (net.minecraft.item.EnumDyeColor.j ^ 109721037113883L);
    life3_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    spill5463_0 = p0;
    if (!((life3_5 == 0))) {
        forwardValue5463_17_0 = spill5463_0;
        break forward_join_17;
    }
    if (!((spill5463_0 >= 0))) {
        break forward_join_16;
    }
    spill5463_1 = p0;
    if (!((life3_5 == 0))) {
        forwardValue5463_17_0 = spill5463_1;
        break forward_join_17;
    }
    if (!((spill5463_1 >= (net.minecraft.item.EnumDyeColor.a).length))) {
        break forward_join_18;
    }
    }
    forwardValue5463_17_0 = 0;
    }
    p0 = forwardValue5463_17_0;
    }
    return (net.minecraft.item.EnumDyeColor.a)[p0];
}


public java.lang.String b__String() {
return this.f;
}


public int b() {
return this.d;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 9374;
      if (l[var3] == null) {
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
         long var5 = k[var3];
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
         Object[] var9 = (Object[])m.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               m.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/a2", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         l[var3] = var15;
      }

      return l[var3];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int a() {
return this.c;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral11888_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/a2"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.item.EnumDyeColor.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public moom.fm a__fm() {
return this.g;
}


public static net.minecraft.item.EnumDyeColor a(int p0) {
int forwardValue5462_17_0;
    int spill5462_0;
    int spill5462_1;
    long life1_3;
    int life3_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (net.minecraft.item.EnumDyeColor.j ^ 136083492009965L);
    life3_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    spill5462_0 = p0;
    if (!((life3_5 == 0))) {
        forwardValue5462_17_0 = spill5462_0;
        break forward_join_17;
    }
    if (!((spill5462_0 >= 0))) {
        break forward_join_16;
    }
    spill5462_1 = p0;
    if (!((life3_5 == 0))) {
        forwardValue5462_17_0 = spill5462_1;
        break forward_join_17;
    }
    if (!((spill5462_1 >= (net.minecraft.item.EnumDyeColor.b).length))) {
        break forward_join_18;
    }
    }
    forwardValue5462_17_0 = 0;
    }
    p0 = forwardValue5462_17_0;
    }
    return (net.minecraft.item.EnumDyeColor.b)[p0];
}


public java.lang.String a__String() {
return this.e;
}


private static net.minecraft.item.EnumDyeColor[] a__Arraya2() {
long local0_life1 = (net.minecraft.item.EnumDyeColor.j ^ 73070132097391L);
    net.minecraft.item.EnumDyeColor[] __sourceSharedArray1136_4 = new net.minecraft.item.EnumDyeColor[__sourceIntrinsic_37c06a3aae7d_originalDynamicSite1136_2(15272, (2286122874091578512L ^ local0_life1))];
    __sourceSharedArray1136_4[0] = net.minecraft.item.EnumDyeColor.WHITE;
    __sourceSharedArray1136_4[1] = net.minecraft.item.EnumDyeColor.ORANGE;
    __sourceSharedArray1136_4[2] = net.minecraft.item.EnumDyeColor.MAGENTA;
    __sourceSharedArray1136_4[3] = net.minecraft.item.EnumDyeColor.LIGHT_BLUE;
    __sourceSharedArray1136_4[4] = net.minecraft.item.EnumDyeColor.YELLOW;
    __sourceSharedArray1136_4[5] = net.minecraft.item.EnumDyeColor.LIME;
    __sourceSharedArray1136_4[__sourceIntrinsic_37c06a3aae7d_originalDynamicSite1136_10(10588, (3058541716312209001L ^ local0_life1))] = net.minecraft.item.EnumDyeColor.PINK;
    __sourceSharedArray1136_4[__sourceIntrinsic_37c06a3aae7d_originalDynamicSite1136_12(28050, (8076648446217745056L ^ local0_life1))] = net.minecraft.item.EnumDyeColor.GRAY;
    __sourceSharedArray1136_4[__sourceIntrinsic_37c06a3aae7d_originalDynamicSite1136_14(6234, (932167768768415587L ^ local0_life1))] = net.minecraft.item.EnumDyeColor.SILVER;
    __sourceSharedArray1136_4[__sourceIntrinsic_37c06a3aae7d_originalDynamicSite1136_16(18008, (2398478141331593572L ^ local0_life1))] = net.minecraft.item.EnumDyeColor.CYAN;
    __sourceSharedArray1136_4[__sourceIntrinsic_37c06a3aae7d_originalDynamicSite1136_18(5152, (502865906490084116L ^ local0_life1))] = net.minecraft.item.EnumDyeColor.PURPLE;
    __sourceSharedArray1136_4[__sourceIntrinsic_37c06a3aae7d_originalDynamicSite1136_20(12431, (6290761338857009074L ^ local0_life1))] = net.minecraft.item.EnumDyeColor.BLUE;
    __sourceSharedArray1136_4[__sourceIntrinsic_37c06a3aae7d_originalDynamicSite1136_22(25110, (6411214548389821745L ^ local0_life1))] = net.minecraft.item.EnumDyeColor.BROWN;
    __sourceSharedArray1136_4[__sourceIntrinsic_37c06a3aae7d_originalDynamicSite1136_24(15326, (8337684120448509176L ^ local0_life1))] = net.minecraft.item.EnumDyeColor.GREEN;
    __sourceSharedArray1136_4[__sourceIntrinsic_37c06a3aae7d_originalDynamicSite1136_26(15201, (8299690903887160388L ^ local0_life1))] = net.minecraft.item.EnumDyeColor.RED;
    __sourceSharedArray1136_4[__sourceIntrinsic_37c06a3aae7d_originalDynamicSite1136_28(24106, (4210275862827745550L ^ local0_life1))] = net.minecraft.item.EnumDyeColor.BLACK;
    return __sourceSharedArray1136_4;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_76(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_77(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_78(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_82(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_83(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_84(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_88(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_89(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_90(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_94(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_95(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_96(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_100(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_101(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_105(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_106(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_110(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_111(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_115(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_116(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_120(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_121(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_125(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1895_126(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral11888_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_37c06a3aae7d_originalDynamicSite1136_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_37c06a3aae7d_originalDynamicSite1136_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_37c06a3aae7d_originalDynamicSite1136_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_37c06a3aae7d_originalDynamicSite1136_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_37c06a3aae7d_originalDynamicSite1136_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_37c06a3aae7d_originalDynamicSite1136_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_37c06a3aae7d_originalDynamicSite1136_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_37c06a3aae7d_originalDynamicSite1136_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_37c06a3aae7d_originalDynamicSite1136_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_37c06a3aae7d_originalDynamicSite1136_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_37c06a3aae7d_originalDynamicSite1136_28(int a0, long a1) throws E;
}
