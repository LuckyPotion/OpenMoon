package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class x4 implements net.minecraft.item.crafting.IRecipe {

private static final long a;

private static final long[] b;

private static final java.lang.Integer[] c;

private static final java.util.Map d;

public x4() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(7697424821611691993L)), ((long)(-4684483440680081324L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(211068631509478L)))));
    d = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.x4.a ^ 110716402740543L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1665_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1665_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1665_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1665_14 = new byte[8];
    (__sourceSpill1665_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1665_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1665_16 = __sourceSpill1665_14;
    ((javax.crypto.Cipher)(__sourceSpill1665_11)).init(((int)(__sourceSpill1665_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1665_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1665_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[6];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "»#)Nø_¸UÈÝæ@»N>aõ&½:\003Á$í¶Î"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1665_25 = local6_life21;
        int __sourceSpill1665_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1665_25)).substring(((int)(__sourceSpill1665_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1665_30 = local8_life19;
        int __sourceSpill1665_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1665_33 = new byte[8];
        (__sourceSpill1665_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1665_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1665_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1665_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1665_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1665_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1665_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1665_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1665_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1665_34)).doFinal(((byte[])(__sourceSpill1665_33)));
        (__sourceSpill1665_30)[__sourceSpill1665_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = ".;wf¦°=;r¬¹Û\037"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1665_38 = local6_life21;
        int __sourceSpill1665_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1665_38)).substring(((int)(__sourceSpill1665_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1665_43 = local8_life19;
        int __sourceSpill1665_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1665_46 = new byte[8];
        (__sourceSpill1665_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1665_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1665_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1665_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1665_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1665_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1665_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1665_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1665_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1665_47)).doFinal(((byte[])(__sourceSpill1665_46)));
        (__sourceSpill1665_43)[__sourceSpill1665_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    b = ((long[])(local8_life19));
    c = ((java.lang.Integer[])(new java.lang.Integer[6]));
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 17299;
      if (c[var3] == null) {
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
         long var5 = b[var3];
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
         Object[] var9 = (Object[])d.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               d.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/x4", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         c[var3] = var15;
      }

      return c[var3];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9656_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/x4"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.x4.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public boolean a(moom.wx p0, net.minecraft.world.World p1) {
net.minecraft.item.ItemStack lexicalValue1394_48_0;
    net.minecraft.item.Item lexicalValue1394_53_0;
    net.minecraft.item.ItemStack lexicalValue1394_65_0;
    int lexicalValue1394_72_0;
    int lexicalValue1394_74_0;
    java.lang.String spill1394_0;
    net.minecraft.item.ItemStack spill1394_1;
    net.minecraft.item.Item spill1394_2;
    net.minecraft.item.ItemStack spill1394_3;
    boolean spill1394_4;
    long life3_3;
    net.minecraft.item.ItemStack life6_5;
    java.util.ArrayList life7_8;
    int life8_10;
    java.lang.String life5_11;
    net.minecraft.item.ItemStack life9_19;
    net.minecraft.item.Item life11_34;
    net.minecraft.item.ItemArmor life10_45;
    lexical_join_74: {
    lexical_join_73: {
    lexical_join_72: {
    lexical_join_65: {
    lexical_join_64: {
    life3_3 = (moom.x4.a ^ 89086985754271L);
    life6_5 = null;
    spill1394_0 = moom.ye.b();
    life7_8 = com.google.common.collect.Lists.newArrayList();
    life8_10 = 0;
    life5_11 = spill1394_0;
    lexical_cycle_12: while (true) {
    lexical_join_62: {
    lexical_join_61: {
    lexical_join_57: {
    lexical_join_53: {
    lexical_join_51: {
    lexical_join_48: {
    lexical_join_47: {
    lexical_join_45: {
    if (!((life8_10 < ((moom.wx)(p0)).b__Int()))) {
        break lexical_join_64;
    }
    life9_19 = ((moom.wx)(p0)).a__xW(((int)(life8_10)));
    if (!((life5_11 == null))) {
        break lexical_join_62;
    }
    spill1394_1 = life9_19;
    if (!((life5_11 == null))) {
        lexicalValue1394_65_0 = spill1394_1;
        break lexical_join_65;
    }
    if (!((spill1394_1 != null))) {
        break lexical_join_61;
    }
    life11_34 = ((net.minecraft.item.ItemStack)(life9_19)).a__wQ();
    spill1394_2 = life11_34;
    if (!((life5_11 == null))) {
        lexicalValue1394_53_0 = spill1394_2;
        break lexical_join_53;
    }
    if (!((((spill1394_2 instanceof net.minecraft.item.ItemArmor) ? 1 : 0) != 0))) {
        break lexical_join_51;
    }
    life10_45 = ((net.minecraft.item.ItemArmor)(life11_34));
    if (!((((net.minecraft.item.ItemArmor)(life10_45)).a__sourceReturn_2ce8a48aa6() == net.minecraft.item.ItemArmor$ArmorMaterial.LEATHER))) {
        break lexical_join_45;
    }
    spill1394_3 = life6_5;
    if (!((life5_11 == null))) {
        lexicalValue1394_48_0 = spill1394_3;
        break lexical_join_48;
    }
    if (!((spill1394_3 != null))) {
        break lexical_join_47;
    }
    }
    return ((0) != 0);
    }
    lexicalValue1394_48_0 = life9_19;
    }
    life6_5 = lexicalValue1394_48_0;
    if (!((life5_11 != null))) {
        break lexical_join_61;
    }
    }
    lexicalValue1394_53_0 = ((net.minecraft.item.ItemStack)(life9_19)).a__wQ();
    }
    if (!((lexicalValue1394_53_0 != net.minecraft.init.Items.aW))) {
        break lexical_join_57;
    }
    return ((0) != 0);
    }
    ((java.util.List)(life7_8)).add(((java.lang.Object)(life9_19)));
    }
    life8_10 += 1;
    }
    if (!((life5_11 != null))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    lexicalValue1394_65_0 = life6_5;
    }
    if (!((lexicalValue1394_65_0 != null))) {
        break lexical_join_73;
    }
    spill1394_4 = ((java.util.List)(life7_8)).isEmpty();
    if (!((life5_11 == null))) {
        lexicalValue1394_72_0 = ((spill1394_4) ? 1 : 0);
        break lexical_join_72;
    }
    if (!((!spill1394_4))) {
        break lexical_join_73;
    }
    lexicalValue1394_72_0 = 1;
    }
    lexicalValue1394_74_0 = lexicalValue1394_72_0;
    break lexical_join_74;
    }
    lexicalValue1394_74_0 = 0;
    }
    return ((lexicalValue1394_74_0) != 0);
}


public net.minecraft.item.ItemStack a__xW(moom.wx p0) {
net.minecraft.item.ItemStack lexicalValue1396_50_0;
    net.minecraft.item.ItemStack lexicalValue1396_59_0;
    net.minecraft.item.Item lexicalValue1396_171_0;
    net.minecraft.item.ItemStack lexicalValue1396_176_0;
    java.lang.String spill1396_0;
    net.minecraft.item.Item spill1396_1;
    net.minecraft.item.ItemStack spill1396_2;
    net.minecraft.item.ItemStack spill1396_3;
    long life2_3;
    net.minecraft.item.ItemStack life5_5;
    int[] life6_9;
    java.lang.String life4_10;
    int life7_12;
    int life8_14;
    net.minecraft.item.ItemArmor life9_16;
    int life10_18;
    net.minecraft.item.ItemStack life11_26;
    int life12_96;
    float life13_113;
    float life14_130;
    float life15_141;
    float[] life12_213;
    int life13_220;
    int life14_227;
    int life15_234;
    int life11_285;
    int life12_291;
    float life13_297;
    float life14_304;
    int life10_312;
    int life11_320;
    int life12_328;
    int life15_338;
    int life15_348;
    lexical_join_244: {
    lexical_join_238: {
    lexical_join_234: {
    life2_3 = (moom.x4.a ^ 46778097964356L);
    life5_5 = null;
    spill1396_0 = moom.ye.b();
    life6_9 = new int[3];
    life4_10 = spill1396_0;
    life7_12 = 0;
    life8_14 = 0;
    life9_16 = null;
    life10_18 = 0;
    lexical_cycle_19: while (true) {
    lexical_join_232: {
    lexical_join_231: {
    lexical_join_176: {
    lexical_join_175: {
    lexical_join_171: {
    lexical_join_167: {
    lexical_join_59: {
    lexical_join_55: {
    lexical_join_53: {
    lexical_join_50: {
    if (!((life10_18 < ((moom.wx)(p0)).b__Int()))) {
        break lexical_join_234;
    }
    life11_26 = ((moom.wx)(p0)).a__xW(((int)(life10_18)));
    if (!((life4_10 == null))) {
        break lexical_join_244;
    }
    if (!((life4_10 == null))) {
        break lexical_join_232;
    }
    if (!((life11_26 != null))) {
        break lexical_join_231;
    }
    spill1396_1 = ((net.minecraft.item.ItemStack)(life11_26)).a__wQ();
    if (!((life4_10 == null))) {
        lexicalValue1396_171_0 = spill1396_1;
        break lexical_join_171;
    }
    if (!((((spill1396_1 instanceof net.minecraft.item.ItemArmor) ? 1 : 0) != 0))) {
        break lexical_join_167;
    }
    spill1396_2 = life11_26;
    if (!((life4_10 == null))) {
        lexicalValue1396_50_0 = spill1396_2;
        break lexical_join_50;
    }
    life9_16 = ((net.minecraft.item.ItemArmor)(((net.minecraft.item.ItemStack)(spill1396_2)).a__wQ()));
    if (!((((net.minecraft.item.ItemArmor)(life9_16)).a__sourceReturn_2ce8a48aa6() == net.minecraft.item.ItemArmor$ArmorMaterial.LEATHER))) {
        break lexical_join_53;
    }
    lexicalValue1396_50_0 = life5_5;
    }
    if (!((life4_10 == null))) {
        lexicalValue1396_59_0 = lexicalValue1396_50_0;
        break lexical_join_59;
    }
    if (!((lexicalValue1396_50_0 != null))) {
        break lexical_join_55;
    }
    }
    return null;
    }
    life5_5 = ((net.minecraft.item.ItemStack)(life11_26)).a__xW();
    lexicalValue1396_59_0 = life5_5;
    }
    ((net.minecraft.item.ItemStack)(lexicalValue1396_59_0)).b = ((int)(1));
    if (!((life4_10 == null))) {
        break lexical_join_232;
    }
    if (!(((net.minecraft.item.ItemArmor)(life9_16)).d__sourceReturn_2aed085586(((net.minecraft.item.ItemStack)(life11_26))))) {
        break lexical_join_231;
    }
    life12_96 = ((net.minecraft.item.ItemArmor)(life9_16)).b(((net.minecraft.item.ItemStack)(life5_5)));
    life13_113 = (((float) ((life12_96 >> __sourceIntrinsic_5f85d79003c1_invokedynamic1396_14(26596, (8257554650325356816L ^ life2_3))) & __sourceIntrinsic_5f85d79003c1_invokedynamic1396_15(9434, (7341848896303518253L ^ life2_3)))) / 0x1.fep7f);
    life14_130 = (((float) ((life12_96 >> __sourceIntrinsic_5f85d79003c1_invokedynamic1396_16(20187, (4115914800574380077L ^ life2_3))) & __sourceIntrinsic_5f85d79003c1_invokedynamic1396_17(9756, (8700250818968342761L ^ life2_3)))) / 0x1.fep7f);
    life15_141 = (((float) (life12_96 & __sourceIntrinsic_5f85d79003c1_invokedynamic1396_18(9756, (8700250818968342761L ^ life2_3)))) / 0x1.fep7f);
    life7_12 = ((int) (((float) life7_12) + (java.lang.Math.max(((float)(life13_113)), ((float)(java.lang.Math.max(((float)(life14_130)), ((float)(life15_141)))))) * 0x1.fep7f)));
    (life6_9)[0] = ((int) (((float) (life6_9)[0]) + (life13_113 * 0x1.fep7f)));
    (life6_9)[1] = ((int) (((float) (life6_9)[1]) + (life14_130 * 0x1.fep7f)));
    (life6_9)[2] = ((int) (((float) (life6_9)[2]) + (life15_141 * 0x1.fep7f)));
    life8_14 += 1;
    if (!((life4_10 != null))) {
        break lexical_join_231;
    }
    }
    spill1396_3 = life11_26;
    if (!((life4_10 == null))) {
        lexicalValue1396_176_0 = spill1396_3;
        break lexical_join_176;
    }
    lexicalValue1396_171_0 = ((net.minecraft.item.ItemStack)(spill1396_3)).a__wQ();
    }
    if (!((lexicalValue1396_171_0 != net.minecraft.init.Items.aW))) {
        break lexical_join_175;
    }
    return null;
    }
    lexicalValue1396_176_0 = life11_26;
    }
    life12_213 = net.minecraft.entity.passive.EntitySheep.a__ArrayFloat(((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.a(((int)(((net.minecraft.item.ItemStack)(lexicalValue1396_176_0)).c()))))));
    life13_220 = ((int) ((life12_213)[0] * 0x1.fep7f));
    life14_227 = ((int) ((life12_213)[1] * 0x1.fep7f));
    life15_234 = ((int) ((life12_213)[2] * 0x1.fep7f));
    life7_12 = (life7_12 + java.lang.Math.max(((int)(life13_220)), ((int)(java.lang.Math.max(((int)(life14_227)), ((int)(life15_234)))))));
    int[] __stackOp1396_28_0 = life6_9;
    int __stackOp1396_28_1 = 0;
    (__stackOp1396_28_0)[__stackOp1396_28_1] = ((__stackOp1396_28_0)[__stackOp1396_28_1] + life13_220);
    int[] __stackOp1396_29_0 = life6_9;
    int __stackOp1396_29_1 = 1;
    (__stackOp1396_29_0)[__stackOp1396_29_1] = ((__stackOp1396_29_0)[__stackOp1396_29_1] + life14_227);
    int[] __stackOp1396_30_0 = life6_9;
    int __stackOp1396_30_1 = 2;
    (__stackOp1396_30_0)[__stackOp1396_30_1] = ((__stackOp1396_30_0)[__stackOp1396_30_1] + life15_234);
    life8_14 += 1;
    }
    life10_18 += 1;
    }
    if (!((life4_10 != null))) { continue lexical_cycle_19; }
    break lexical_cycle_19;
    }
    }
    if (!((life9_16 == null))) {
        break lexical_join_238;
    }
    return null;
    }
    life10_18 = ((life6_9)[0] / life8_14);
    }
    life11_285 = ((life6_9)[1] / life8_14);
    life12_291 = ((life6_9)[2] / life8_14);
    life13_297 = (((float) life7_12) / ((float) life8_14));
    life14_304 = ((float) java.lang.Math.max(((int)(life10_18)), ((int)(java.lang.Math.max(((int)(life11_285)), ((int)(life12_291)))))));
    life10_312 = ((int) ((((float) life10_18) * life13_297) / life14_304));
    life11_320 = ((int) ((((float) life11_285) * life13_297) / life14_304));
    life12_328 = ((int) ((((float) life12_291) * life13_297) / life14_304));
    life15_338 = ((life10_312 << __sourceIntrinsic_5f85d79003c1_invokedynamic1396_33(31046, (4803119514693996471L ^ life2_3))) + life11_320);
    life15_348 = ((life15_338 << __sourceIntrinsic_5f85d79003c1_invokedynamic1396_34(31046, (4803119514693996471L ^ life2_3))) + life12_328);
    ((net.minecraft.item.ItemArmor)(life9_16)).a__Void(((net.minecraft.item.ItemStack)(life5_5)), ((int)(life15_348)));
    return life5_5;
}


public int a() {
long local1 = (moom.x4.a ^ 39416440773411L);
    return __sourceIntrinsic_8aebf151eadb_originalDynamicSite1698_1(12929, (3306579827379079702L ^ local1));
}


public net.minecraft.item.ItemStack a__xW() {
return null;
}


public net.minecraft.item.ItemStack[] a__ArrayxW(moom.wx p0) {
java.lang.String spill1395_0;
    long life2_3;
    net.minecraft.item.ItemStack[] life5_7;
    int life6_10;
    java.lang.String life4_11;
    net.minecraft.item.ItemStack life7_19;
    lexical_join_40: {
    life2_3 = (moom.x4.a ^ 77198841574123L);
    life5_7 = new net.minecraft.item.ItemStack[((moom.wx)(p0)).b__Int()];
    spill1395_0 = moom.ye.b();
    life6_10 = 0;
    life4_11 = spill1395_0;
    lexical_cycle_12: while (true) {
    lexical_join_38: {
    lexical_join_37: {
    if (!((life6_10 < (life5_7).length))) {
        break lexical_join_40;
    }
    life7_19 = ((moom.wx)(p0)).a__xW(((int)(life6_10)));
    if (!((life4_11 == null))) {
        break lexical_join_38;
    }
    if (!((life7_19 != null))) {
        break lexical_join_37;
    }
    if (!(((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(life7_19)).a__wQ())).f())) {
        break lexical_join_37;
    }
    (life5_7)[life6_10] = new net.minecraft.item.ItemStack(((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(life7_19)).a__wQ())).b__wQ());
    }
    life6_10 += 1;
    }
    if (!((life4_11 != null))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    return life5_7;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9656_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5f85d79003c1_invokedynamic1396_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5f85d79003c1_invokedynamic1396_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5f85d79003c1_invokedynamic1396_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5f85d79003c1_invokedynamic1396_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5f85d79003c1_invokedynamic1396_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5f85d79003c1_invokedynamic1396_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5f85d79003c1_invokedynamic1396_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8aebf151eadb_originalDynamicSite1698_1(int a0, long a1) throws E;
}
