package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class nJ {

private static final net.minecraft.client.Minecraft a;

private static final long b;

private static final long[] c;

private static final java.lang.Integer[] d;

private static final java.util.Map e;

public nJ() {
super();
}


static {
b = ((long)(((moom._a)(moom._c.a(((long)(-1949787991589880647L)), ((long)(-7208125094873375288L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(60433156323896L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.nJ.b ^ 98568563281181L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill457_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill457_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill457_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill457_14 = new byte[8];
    (__sourceSpill457_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill457_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation457_16 = __sourceSpill457_14;
    ((javax.crypto.Cipher)(__sourceSpill457_11)).init(((int)(__sourceSpill457_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill457_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation457_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[6];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "°_K\\ëFÜû\017ÛKäR!ÒÓtå\003þúý¡eíðp"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill457_25 = local6_life21;
        int __sourceSpill457_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill457_25)).substring(((int)(__sourceSpill457_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill457_30 = local8_life19;
        int __sourceSpill457_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill457_33 = new byte[8];
        (__sourceSpill457_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill457_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill457_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill457_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill457_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill457_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill457_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill457_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill457_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill457_34)).doFinal(((byte[])(__sourceSpill457_33)));
        (__sourceSpill457_30)[__sourceSpill457_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "öOã?\007ÉE\nwtW\030÷\nÅ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill457_38 = local6_life21;
        int __sourceSpill457_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill457_38)).substring(((int)(__sourceSpill457_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill457_43 = local8_life19;
        int __sourceSpill457_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill457_46 = new byte[8];
        (__sourceSpill457_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill457_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill457_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill457_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill457_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill457_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill457_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill457_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill457_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill457_47)).doFinal(((byte[])(__sourceSpill457_46)));
        (__sourceSpill457_43)[__sourceSpill457_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    c = ((long[])(local8_life19));
    d = ((java.lang.Integer[])(new java.lang.Integer[6]));
    a = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM()));
}


public static double b() {
long local0 = (com.moon.nJ.b ^ 112255289212692L);
    double local2 = ((__sourceIntrinsic_booleanComparison(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.nJ.a)).K)).u__Boolean()) != 0) ? 0x1.2631f8a0902dep-2d : 0x1.ba5e353f7ced9p-3d);
    if ((__sourceIntrinsic_booleanComparison(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.nJ.a)).K)).a__Boolean(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.d)))) != 0)) {
        local2 = (local2 * (0x1.0p0d + (0x1.999999999999ap-3d * ((double) ((net.minecraft.potion.PotionEffect)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.nJ.a)).K)).a(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.d))))).c()))));
    }
    return local2;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static double a(boolean p0) {
int forwardValue1050_13_0;
    double forwardValue1050_17_0;
    boolean spill1050_0;
    long life1_3;
    int life3_5;
    double life4_22;
    forward_join_36: {
    forward_join_17: {
    forward_join_16: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (com.moon.nJ.b ^ 109541634510643L);
    life3_5 = ((com.moon.aO.b__Boolean()) ? 1 : 0);
    spill1050_0 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.nJ.a)).K)).u__Boolean();
    if (!((life3_5 == 0))) {
        forwardValue1050_13_0 = ((spill1050_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!((!spill1050_0))) {
        break forward_join_14;
    }
    forwardValue1050_13_0 = ((p0) ? 1 : 0);
    }
    if (!((forwardValue1050_13_0 != 0))) {
        break forward_join_16;
    }
    }
    forwardValue1050_17_0 = 0x1.2631f8a0902dep-2d;
    break forward_join_17;
    }
    forwardValue1050_17_0 = 0x1.ba5e353f7ced9p-3d;
    }
    life4_22 = forwardValue1050_17_0;
    if (!(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.nJ.a)).K)).a__Boolean(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.d))))) {
        break forward_join_36;
    }
    life4_22 = (life4_22 * (0x1.0p0d + (0x1.999999999999ap-3d * ((double) ((net.minecraft.potion.PotionEffect)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.nJ.a)).K)).a(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.d))))).c()))));
    }
    return life4_22;
}


public static double a(double p0) {
long local2 = (com.moon.nJ.b ^ 15231090559780L);
    double local4 = ((__sourceIntrinsic_booleanComparison(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.nJ.a)).K)).u__Boolean()) != 0) ? 0x1.2631f8a0902dep-2d : 0x1.ba5e353f7ced9p-3d);
    if ((__sourceIntrinsic_booleanComparison(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.nJ.a)).K)).a__Boolean(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.d)))) != 0)) {
        local4 = (local4 * (0x1.0p0d + (p0 * ((double) ((net.minecraft.potion.PotionEffect)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.nJ.a)).K)).a(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.d))))).c()))));
    }
    return local4;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral2885_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/nJ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.nJ.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 2673;
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
            throw new RuntimeException("com/moon/nJ", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         d[var3] = var15;
      }

      return d[var3];
}


public static void a(double p0, float p1) {
((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.nJ.a)).K)).t = ((double)(((-java.lang.Math.sin(((double)(((double) p1))))) * p0)));
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.nJ.a)).K)).v = ((double)((java.lang.Math.cos(((double)(((double) p1)))) * p0)));
    return;
}


public static void a__Void(double p0) {
((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.nJ.a)).K)).t = ((double)(((-java.lang.Math.sin(((double)(((double) com.moon.nJ.a__Float()))))) * p0)));
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.nJ.a)).K)).v = ((double)((java.lang.Math.cos(((double)(((double) com.moon.nJ.a__Float())))) * p0)));
    return;
}


public static double a() {
return java.lang.Math.hypot(((double)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.nJ.a)).K)).t)), ((double)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.nJ.a)).K)).v)));
}


public static double a(double p0, int p1) {
double lexicalValue289_25_0;
    boolean spill289_0;
    double spill289_1;
    long life3_3;
    double life6_6;
    int life5_7;
    int life8_9;
    lexical_join_25: {
    lexical_join_24: {
    life3_3 = (com.moon.nJ.b ^ 49771479073429L);
    spill289_0 = com.moon.aO.b__Boolean();
    life6_6 = p0;
    life5_7 = ((spill289_0) ? 1 : 0);
    life8_9 = 0;
    lexical_cycle_10: while (true) {
    if (!((life8_9 < p1))) {
        break lexical_join_24;
    }
    spill289_1 = ((life6_6 - 0x1.47ae147ae147bp-4d) * 0x1.f5c29p-1d);
    if (!((life5_7 == 0))) {
        lexicalValue289_25_0 = spill289_1;
        break lexical_join_25;
    }
    life6_6 = spill289_1;
    life8_9 += 1;
    if (!((life5_7 != 0))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    lexicalValue289_25_0 = life6_6;
    }
    return lexicalValue289_25_0;
}


public static float a(float p0, float p1, float p2) {
int forwardValue1049_26_0;
    int forwardValue1049_34_0;
    int forwardValue1049_40_0;
    float forwardValue1049_49_0;
    float forwardValue1049_49_1;
    float forwardValue1049_50_0;
    float forwardValue1049_51_0;
    float forwardValue1049_51_1;
    int forwardValue1049_69_0;
    float forwardValue1049_80_0;
    int spill1049_0;
    float spill1049_1;
    float spill1049_2;
    int spill1049_3;
    float spill1049_4;
    long life3_3;
    int life5_5;
    int life6_50;
    float life0_68;
    forward_join_80: {
    forward_join_75: {
    forward_join_69: {
    forward_join_64: {
    forward_join_51: {
    forward_join_50: {
    forward_join_49: {
    forward_join_40: {
    forward_join_35: {
    forward_join_34: {
    forward_join_26: {
    forward_join_23: {
    forward_join_11: {
    life3_3 = (com.moon.nJ.b ^ 103208694220455L);
    life5_5 = ((com.moon.aO.c()) ? 1 : 0);
    if (!((((net.minecraft.client.Minecraft)(com.moon.nJ.a)).K == null))) {
        break forward_join_11;
    }
    return 0x0.0p0f;
    }
    spill1049_0 = recovery.source.CarrierOps.fcmpg(((float)(p1)), ((float)(0x0.0p0f)));
    if (!((life5_5 != 0))) {
        forwardValue1049_26_0 = spill1049_0;
        break forward_join_26;
    }
    if (!((spill1049_0 < 0))) {
        break forward_join_23;
    }
    forwardValue1049_40_0 = __sourceIntrinsic_8a32f167cd57_invokedynamic1049_6(17839, (3699856105603259132L ^ life3_3));
    break forward_join_40;
    }
    forwardValue1049_26_0 = recovery.source.CarrierOps.fcmpl(((float)(p1)), ((float)(0x0.0p0f)));
    }
    if (!((life5_5 != 0))) {
        forwardValue1049_34_0 = forwardValue1049_26_0;
        break forward_join_34;
    }
    if (!((forwardValue1049_26_0 == 0))) {
        break forward_join_35;
    }
    forwardValue1049_34_0 = __sourceIntrinsic_8a32f167cd57_invokedynamic1049_8(17160, (5896612830663138397L ^ life3_3));
    }
    forwardValue1049_40_0 = forwardValue1049_34_0;
    break forward_join_40;
    }
    forwardValue1049_40_0 = __sourceIntrinsic_8a32f167cd57_invokedynamic1049_9(26336, (5902642109679434160L ^ life3_3));
    }
    life6_50 = forwardValue1049_40_0;
    spill1049_1 = p0;
    spill1049_2 = p1;
    if (!((life5_5 != 0))) {
        forwardValue1049_49_0 = spill1049_1;
        forwardValue1049_49_1 = spill1049_2;
        break forward_join_49;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(spill1049_2)), ((float)(0x0.0p0f))) < 0))) {
        forwardValue1049_50_0 = spill1049_1;
        break forward_join_50;
    }
    forwardValue1049_49_0 = spill1049_1;
    forwardValue1049_49_1 = 0x1.68p7f;
    }
    forwardValue1049_51_0 = forwardValue1049_49_0;
    forwardValue1049_51_1 = forwardValue1049_49_1;
    break forward_join_51;
    }
    forwardValue1049_51_0 = forwardValue1049_50_0;
    forwardValue1049_51_1 = 0x0.0p0f;
    }
    life0_68 = (forwardValue1049_51_0 + forwardValue1049_51_1);
    spill1049_3 = recovery.source.CarrierOps.fcmpg(((float)(p2)), ((float)(0x0.0p0f)));
    if (!((life5_5 != 0))) {
        forwardValue1049_69_0 = spill1049_3;
        break forward_join_69;
    }
    if (!((spill1049_3 < 0))) {
        break forward_join_64;
    }
    life0_68 = (life0_68 + ((float) life6_50));
    }
    spill1049_4 = p2;
    if (!((life5_5 != 0))) {
        forwardValue1049_80_0 = spill1049_4;
        break forward_join_80;
    }
    forwardValue1049_69_0 = recovery.source.CarrierOps.fcmpl(((float)(spill1049_4)), ((float)(0x0.0p0f)));
    }
    if (!((forwardValue1049_69_0 > 0))) {
        break forward_join_75;
    }
    life0_68 = (life0_68 - ((float) life6_50));
    }
    forwardValue1049_80_0 = ((float) (((double) life0_68) * 0x1.1df46a2529d39p-6d));
    }
    return forwardValue1049_80_0;
}


public static float a(float p0) {
net.minecraft.client.entity.EntityPlayerSP forwardValue1048_15_0;
    int forwardValue1048_36_0;
    int forwardValue1048_44_0;
    int forwardValue1048_50_0;
    float forwardValue1048_59_0;
    float forwardValue1048_59_1;
    float forwardValue1048_60_0;
    float forwardValue1048_61_0;
    float forwardValue1048_61_1;
    int forwardValue1048_79_0;
    float forwardValue1048_90_0;
    net.minecraft.client.entity.EntityPlayerSP spill1048_0;
    int spill1048_1;
    float spill1048_2;
    float spill1048_3;
    int spill1048_4;
    float spill1048_5;
    long life1_3;
    int life3_5;
    float life4_21;
    float life5_25;
    int life6_63;
    float life0_81;
    forward_join_90: {
    forward_join_85: {
    forward_join_79: {
    forward_join_74: {
    forward_join_61: {
    forward_join_60: {
    forward_join_59: {
    forward_join_50: {
    forward_join_45: {
    forward_join_44: {
    forward_join_36: {
    forward_join_33: {
    forward_join_15: {
    forward_join_13: {
    life1_3 = (com.moon.nJ.b ^ 591116477986L);
    life3_5 = ((com.moon.aO.b__Boolean()) ? 1 : 0);
    spill1048_0 = ((net.minecraft.client.Minecraft)(com.moon.nJ.a)).K;
    if (!((life3_5 == 0))) {
        forwardValue1048_15_0 = spill1048_0;
        break forward_join_15;
    }
    if (!((spill1048_0 == null))) {
        break forward_join_13;
    }
    return 0x0.0p0f;
    }
    forwardValue1048_15_0 = ((net.minecraft.client.Minecraft)(com.moon.nJ.a)).K;
    }
    life4_21 = ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue1048_15_0)).bk;
    life5_25 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.nJ.a)).K)).bj;
    spill1048_1 = recovery.source.CarrierOps.fcmpg(((float)(life4_21)), ((float)(0x0.0p0f)));
    if (!((life3_5 == 0))) {
        forwardValue1048_36_0 = spill1048_1;
        break forward_join_36;
    }
    if (!((spill1048_1 < 0))) {
        break forward_join_33;
    }
    forwardValue1048_50_0 = __sourceIntrinsic_ab368a0e25ae_invokedynamic1048_12(25609, (3051654376945277912L ^ life1_3));
    break forward_join_50;
    }
    forwardValue1048_36_0 = recovery.source.CarrierOps.fcmpl(((float)(life4_21)), ((float)(0x0.0p0f)));
    }
    if (!((life3_5 == 0))) {
        forwardValue1048_44_0 = forwardValue1048_36_0;
        break forward_join_44;
    }
    if (!((forwardValue1048_36_0 == 0))) {
        break forward_join_45;
    }
    forwardValue1048_44_0 = __sourceIntrinsic_ab368a0e25ae_invokedynamic1048_14(26987, (685979223732541116L ^ life1_3));
    }
    forwardValue1048_50_0 = forwardValue1048_44_0;
    break forward_join_50;
    }
    forwardValue1048_50_0 = __sourceIntrinsic_ab368a0e25ae_invokedynamic1048_15(11513, (2935901509909582637L ^ life1_3));
    }
    life6_63 = forwardValue1048_50_0;
    spill1048_2 = p0;
    spill1048_3 = life4_21;
    if (!((life3_5 == 0))) {
        forwardValue1048_59_0 = spill1048_2;
        forwardValue1048_59_1 = spill1048_3;
        break forward_join_59;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(spill1048_3)), ((float)(0x0.0p0f))) < 0))) {
        forwardValue1048_60_0 = spill1048_2;
        break forward_join_60;
    }
    forwardValue1048_59_0 = spill1048_2;
    forwardValue1048_59_1 = 0x1.68p7f;
    }
    forwardValue1048_61_0 = forwardValue1048_59_0;
    forwardValue1048_61_1 = forwardValue1048_59_1;
    break forward_join_61;
    }
    forwardValue1048_61_0 = forwardValue1048_60_0;
    forwardValue1048_61_1 = 0x0.0p0f;
    }
    life0_81 = (forwardValue1048_61_0 + forwardValue1048_61_1);
    spill1048_4 = recovery.source.CarrierOps.fcmpg(((float)(life5_25)), ((float)(0x0.0p0f)));
    if (!((life3_5 == 0))) {
        forwardValue1048_79_0 = spill1048_4;
        break forward_join_79;
    }
    if (!((spill1048_4 < 0))) {
        break forward_join_74;
    }
    life0_81 = (life0_81 + ((float) life6_63));
    }
    spill1048_5 = life5_25;
    if (!((life3_5 == 0))) {
        forwardValue1048_90_0 = spill1048_5;
        break forward_join_90;
    }
    forwardValue1048_79_0 = recovery.source.CarrierOps.fcmpl(((float)(spill1048_5)), ((float)(0x0.0p0f)));
    }
    if (!((forwardValue1048_79_0 > 0))) {
        break forward_join_85;
    }
    life0_81 = (life0_81 - ((float) life6_63));
    }
    forwardValue1048_90_0 = ((float) (((double) life0_81) * 0x1.1df46a2529d39p-6d));
    }
    return forwardValue1048_90_0;
}


public static float a__Float() {
net.minecraft.client.entity.EntityPlayerSP forwardValue1051_15_0;
    int forwardValue1051_40_0;
    int forwardValue1051_48_0;
    int forwardValue1051_54_0;
    float forwardValue1051_63_0;
    float forwardValue1051_63_1;
    float forwardValue1051_64_0;
    float forwardValue1051_65_0;
    float forwardValue1051_65_1;
    int forwardValue1051_83_0;
    float forwardValue1051_94_0;
    net.minecraft.client.entity.EntityPlayerSP spill1051_0;
    int spill1051_1;
    float spill1051_2;
    float spill1051_3;
    int spill1051_4;
    float spill1051_5;
    long life0_3;
    int life2_5;
    float life3_21;
    float life4_25;
    float life5_29;
    int life6_67;
    float life3_85;
    forward_join_94: {
    forward_join_89: {
    forward_join_83: {
    forward_join_78: {
    forward_join_65: {
    forward_join_64: {
    forward_join_63: {
    forward_join_54: {
    forward_join_49: {
    forward_join_48: {
    forward_join_40: {
    forward_join_37: {
    forward_join_15: {
    forward_join_13: {
    life0_3 = (com.moon.nJ.b ^ 75789698445189L);
    life2_5 = ((com.moon.aO.c()) ? 1 : 0);
    spill1051_0 = ((net.minecraft.client.Minecraft)(com.moon.nJ.a)).K;
    if (!((life2_5 != 0))) {
        forwardValue1051_15_0 = spill1051_0;
        break forward_join_15;
    }
    if (!((spill1051_0 == null))) {
        break forward_join_13;
    }
    return 0x0.0p0f;
    }
    forwardValue1051_15_0 = ((net.minecraft.client.Minecraft)(com.moon.nJ.a)).K;
    }
    life3_21 = ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue1051_15_0)).w;
    life4_25 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.nJ.a)).K)).bk;
    life5_29 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.nJ.a)).K)).bj;
    spill1051_1 = recovery.source.CarrierOps.fcmpg(((float)(life4_25)), ((float)(0x0.0p0f)));
    if (!((life2_5 != 0))) {
        forwardValue1051_40_0 = spill1051_1;
        break forward_join_40;
    }
    if (!((spill1051_1 < 0))) {
        break forward_join_37;
    }
    forwardValue1051_54_0 = __sourceIntrinsic_03dc2209885a_invokedynamic1051_15(17839, (3699881600302576606L ^ life0_3));
    break forward_join_54;
    }
    forwardValue1051_40_0 = recovery.source.CarrierOps.fcmpl(((float)(life4_25)), ((float)(0x0.0p0f)));
    }
    if (!((life2_5 != 0))) {
        forwardValue1051_48_0 = forwardValue1051_40_0;
        break forward_join_48;
    }
    if (!((forwardValue1051_40_0 == 0))) {
        break forward_join_49;
    }
    forwardValue1051_48_0 = __sourceIntrinsic_03dc2209885a_invokedynamic1051_17(17160, (5896587472983094655L ^ life0_3));
    }
    forwardValue1051_54_0 = forwardValue1051_48_0;
    break forward_join_54;
    }
    forwardValue1051_54_0 = __sourceIntrinsic_03dc2209885a_invokedynamic1051_18(26336, (5902667192297017490L ^ life0_3));
    }
    life6_67 = forwardValue1051_54_0;
    spill1051_2 = life3_21;
    spill1051_3 = life4_25;
    if (!((life2_5 != 0))) {
        forwardValue1051_63_0 = spill1051_2;
        forwardValue1051_63_1 = spill1051_3;
        break forward_join_63;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(spill1051_3)), ((float)(0x0.0p0f))) < 0))) {
        forwardValue1051_64_0 = spill1051_2;
        break forward_join_64;
    }
    forwardValue1051_63_0 = spill1051_2;
    forwardValue1051_63_1 = 0x1.68p7f;
    }
    forwardValue1051_65_0 = forwardValue1051_63_0;
    forwardValue1051_65_1 = forwardValue1051_63_1;
    break forward_join_65;
    }
    forwardValue1051_65_0 = forwardValue1051_64_0;
    forwardValue1051_65_1 = 0x0.0p0f;
    }
    life3_85 = (forwardValue1051_65_0 + forwardValue1051_65_1);
    spill1051_4 = recovery.source.CarrierOps.fcmpg(((float)(life5_29)), ((float)(0x0.0p0f)));
    if (!((life2_5 != 0))) {
        forwardValue1051_83_0 = spill1051_4;
        break forward_join_83;
    }
    if (!((spill1051_4 < 0))) {
        break forward_join_78;
    }
    life3_85 = (life3_85 + ((float) life6_67));
    }
    spill1051_5 = life5_29;
    if (!((life2_5 != 0))) {
        forwardValue1051_94_0 = spill1051_5;
        break forward_join_94;
    }
    forwardValue1051_83_0 = recovery.source.CarrierOps.fcmpl(((float)(spill1051_5)), ((float)(0x0.0p0f)));
    }
    if (!((forwardValue1051_83_0 > 0))) {
        break forward_join_89;
    }
    life3_85 = (life3_85 - ((float) life6_67));
    }
    forwardValue1051_94_0 = ((float) (((double) life3_85) * 0x1.1df46a2529d39p-6d));
    }
    return forwardValue1051_94_0;
}


public static void a(double p0, float p1, float p2, float p3) {
((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.nJ.a)).K)).t = ((double)(((-java.lang.Math.sin(((double)(((double) com.moon.nJ.a(((float)(p1)), ((float)(p2)), ((float)(p3)))))))) * p0)));
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.nJ.a)).K)).v = ((double)((java.lang.Math.cos(((double)(((double) com.moon.nJ.a(((float)(p1)), ((float)(p2)), ((float)(p3))))))) * p0)));
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral2885_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a32f167cd57_invokedynamic1049_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a32f167cd57_invokedynamic1049_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8a32f167cd57_invokedynamic1049_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ab368a0e25ae_invokedynamic1048_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ab368a0e25ae_invokedynamic1048_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ab368a0e25ae_invokedynamic1048_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_03dc2209885a_invokedynamic1051_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_03dc2209885a_invokedynamic1051_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_03dc2209885a_invokedynamic1051_18(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
