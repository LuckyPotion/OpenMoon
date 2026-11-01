package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class jm {

private static int b;

private static final long i;

private static final long[] k;

private static final java.lang.Integer[] l;

private static final java.util.Map m;

public jm() {
super();
}


static {
i = ((long)(((moom._a)(moom._c.a(((long)(-3721559605921024267L)), ((long)(5515698206131909344L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(235426417334448L)))));
    int __sourceSpill324_6 = 22;
    m = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life8 = (com.moon.jm.i ^ 50817674547989L);
    com.moon.jm.b(((int)(__sourceSpill324_6)));
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill324_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill324_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill324_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill324_16 = new byte[8];
    (__sourceSpill324_16)[0] = ((byte) ((int) (local0_life8 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill324_16)[local3_life17] = ((byte) ((int) ((local0_life8 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation324_18 = __sourceSpill324_16;
    ((javax.crypto.Cipher)(__sourceSpill324_13)).init(((int)(__sourceSpill324_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill324_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation324_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[4];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "=%÷\007Ç\t-\000\032ét\031.IÛL"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill324_27 = local6_life23;
        int __sourceSpill324_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill324_27)).substring(((int)(__sourceSpill324_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill324_32 = local8_life21;
        int __sourceSpill324_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill324_35 = new byte[8];
        (__sourceSpill324_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill324_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill324_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill324_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill324_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill324_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill324_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill324_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill324_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill324_36)).doFinal(((byte[])(__sourceSpill324_35)));
        (__sourceSpill324_32)[__sourceSpill324_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    local7_life25 = ((java.lang.String)((local6_life23 = "N°\021Q\030Ij­ÏguþE(æ"))).length();
    local4_life26 = 0;
    do {
        java.lang.String __sourceSpill324_40 = local6_life23;
        int __sourceSpill324_41 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill324_40)).substring(((int)(__sourceSpill324_41)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill324_45 = local8_life21;
        int __sourceSpill324_46 = local5_life22;
        local5_life22 += 1;
        long local10_life47 = (((((((((((long) (local9_life44)[0]) & 255L) << 56) | ((((long) (local9_life44)[1]) & 255L) << 48)) | ((((long) (local9_life44)[2]) & 255L) << 40)) | ((((long) (local9_life44)[3]) & 255L) << 32)) | ((((long) (local9_life44)[4]) & 255L) << 24)) | ((((long) (local9_life44)[5]) & 255L) << 16)) | ((((long) (local9_life44)[6]) & 255L) << 8)) | (((long) (local9_life44)[7]) & 255L));
        byte[] __sourceSpill324_48 = new byte[8];
        (__sourceSpill324_48)[0] = ((byte) ((int) (local10_life47 >>> 56)));
        (__sourceSpill324_48)[1] = ((byte) ((int) (local10_life47 >>> 48)));
        (__sourceSpill324_48)[2] = ((byte) ((int) (local10_life47 >>> 40)));
        (__sourceSpill324_48)[3] = ((byte) ((int) (local10_life47 >>> 32)));
        (__sourceSpill324_48)[4] = ((byte) ((int) (local10_life47 >>> 24)));
        (__sourceSpill324_48)[5] = ((byte) ((int) (local10_life47 >>> 16)));
        (__sourceSpill324_48)[6] = ((byte) ((int) (local10_life47 >>> 8)));
        (__sourceSpill324_48)[7] = ((byte) ((int) local10_life47));
        javax.crypto.Cipher __sourceSpill324_49 = local2_life11;
        byte[] local12_life51 = ((javax.crypto.Cipher)(__sourceSpill324_49)).doFinal(((byte[])(__sourceSpill324_48)));
        (__sourceSpill324_45)[__sourceSpill324_46] = (((((((((((long) (local12_life51)[0]) & 255L) << 56) | ((((long) (local12_life51)[1]) & 255L) << 48)) | ((((long) (local12_life51)[2]) & 255L) << 40)) | ((((long) (local12_life51)[3]) & 255L) << 32)) | ((((long) (local12_life51)[4]) & 255L) << 24)) | ((((long) (local12_life51)[5]) & 255L) << 16)) | ((((long) (local12_life51)[6]) & 255L) << 8)) | (((long) (local12_life51)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    k = ((long[])(local8_life21));
    l = ((java.lang.Integer[])(new java.lang.Integer[4]));
}


public static void b(int p0) {
com.moon.jm.b = ((int)(p0));
    return;
}


public abstract float b(java.lang.String p0, float p1);

public static int b() {
return com.moon.jm.b;
}


public void b(com.moon.hW p0, java.lang.String p1, float p2, float p3, float p4, int p5) {
((com.moon.jm)(this)).a(((com.moon.hW)(p0)), ((java.lang.String)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((int)(p5)), ((boolean)(true)), ((boolean)(false)), ((float)(0x0.0p0f)));
    return;
}


public static int c() {
int local0 = com.moon.jm.b();
    if ((local0 == 0)) {
        return 66;
    }
    return 0;
}


public void c(com.moon.hW p0, java.lang.String p1, float p2, float p3, float p4, int p5) {
long local7 = (com.moon.jm.i ^ 22636282196085L);
    ((com.moon.jm)(this)).a(((com.moon.hW)(p0)), ((java.lang.String)(p1)), ((float)(p2)), ((float)((p3 - 0x1.0p-1f))), ((float)((p4 - 0x1.0p-1f))), ((int)(((java.awt.Color)(java.awt.Color.BLACK)).getRGB())), ((boolean)(false)));
    ((com.moon.jm)(this)).a(((com.moon.hW)(p0)), ((java.lang.String)(p1)), ((float)(p2)), ((float)((p3 + 0x1.0p-1f))), ((float)((p4 + 0x1.0p-1f))), ((int)(((java.awt.Color)(java.awt.Color.BLACK)).getRGB())), ((boolean)(false)));
    ((com.moon.jm)(this)).a(((com.moon.hW)(p0)), ((java.lang.String)(p1)), ((float)(p2)), ((float)((p3 + 0x1.0p-1f))), ((float)((p4 - 0x1.0p-1f))), ((int)(((java.awt.Color)(java.awt.Color.BLACK)).getRGB())), ((boolean)(false)));
    ((com.moon.jm)(this)).a(((com.moon.hW)(p0)), ((java.lang.String)(p1)), ((float)(p2)), ((float)((p3 - 0x1.0p-1f))), ((float)((p4 + 0x1.0p-1f))), ((int)(((java.awt.Color)(java.awt.Color.BLACK)).getRGB())), ((boolean)(false)));
    int spill1694_0 = com.moon.jm.c();
    ((com.moon.jm)(this)).a(((com.moon.hW)(p0)), ((java.lang.String)(p1)), ((float)(p2)), ((float)(p3)), ((float)((p4 - 0x1.0p-1f))), ((int)(((java.awt.Color)(java.awt.Color.BLACK)).getRGB())), ((boolean)(false)));
    int local9 = spill1694_0;
    ((com.moon.jm)(this)).a(((com.moon.hW)(p0)), ((java.lang.String)(p1)), ((float)(p2)), ((float)(p3)), ((float)((p4 + 0x1.0p-1f))), ((int)(((java.awt.Color)(java.awt.Color.BLACK)).getRGB())), ((boolean)(false)));
    ((com.moon.jm)(this)).a(((com.moon.hW)(p0)), ((java.lang.String)(p1)), ((float)(p2)), ((float)((p3 - 0x1.0p-1f))), ((float)(p4)), ((int)(((java.awt.Color)(java.awt.Color.BLACK)).getRGB())), ((boolean)(false)));
    ((com.moon.jm)(this)).a(((com.moon.hW)(p0)), ((java.lang.String)(p1)), ((float)(p2)), ((float)((p3 + 0x1.0p-1f))), ((float)(p4)), ((int)(((java.awt.Color)(java.awt.Color.BLACK)).getRGB())), ((boolean)(false)));
    ((com.moon.jm)(this)).a(((com.moon.hW)(p0)), ((java.lang.String)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((int)(p5)), ((boolean)(true)));
    if ((local9 != 0)) {
        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[2])));
    }
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1978_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/jm"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.jm.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 20117;
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
            throw new RuntimeException("com/moon/jm", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         l[var3] = var15;
      }

      return l[var3];
}


public abstract void a__Void();

public void a(com.moon.hW p0, java.lang.String p1, float p2, float p3, float p4, int p5, boolean p6) {
((com.moon.jm)(this)).a(((com.moon.hW)(p0)), ((java.lang.String)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((int)(p5)), ((boolean)(p6)), ((boolean)(false)), ((float)(0x0.0p0f)));
    return;
}


public void a(com.moon.hW p0, java.lang.String p1, float p2, float p3, float p4, int p5) {
((com.moon.jm)(this)).a(((com.moon.hW)(p0)), ((java.lang.String)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((int)(p5)), ((boolean)(true)), ((boolean)(true)), ((float)(0x0.0p0f)));
    return;
}


public abstract void a(com.moon.hW p0, java.lang.String p1, float p2, float p3, float p4, int p5, boolean p6, boolean p7, float p8);

public abstract float a(java.lang.String p0, float p1);

public abstract float a(float p0);

public java.lang.String a(java.lang.String p0, int p1, float p2, boolean p3) {
int lexicalValue125_20_0;
    int lexicalValue125_22_0;
    int lexicalValue125_28_0;
    int lexicalValue125_30_0;
    int lexicalValue125_49_0;
    int lexicalValue125_55_0;
    int lexicalValue125_105_0;
    int lexicalValue125_109_0;
    int lexicalValue125_115_0;
    int lexicalValue125_127_0;
    int lexicalValue125_138_0;
    int lexicalValue125_144_0;
    int spill125_0;
    boolean spill125_1;
    boolean spill125_2;
    int spill125_3;
    int spill125_4;
    int spill125_5;
    int spill125_6;
    int spill125_7;
    int spill125_8;
    long life5_3;
    java.lang.StringBuilder life8_8;
    float life9_10;
    int life7_11;
    int life10_28;
    int life11_39;
    int life12_41;
    int life13_43;
    int life14_45;
    int life15_76;
    float life16_82;
    lexical_join_162: {
    lexical_join_30: {
    lexical_join_29: {
    lexical_join_28: {
    lexical_join_22: {
    lexical_join_21: {
    lexical_join_20: {
    life5_3 = (com.moon.jm.i ^ 129940856479987L);
    spill125_0 = com.moon.jm.b();
    life8_8 = new java.lang.StringBuilder();
    life9_10 = 0x0.0p0f;
    life7_11 = spill125_0;
    spill125_1 = p3;
    if (!((life7_11 != 0))) {
        lexicalValue125_20_0 = ((spill125_1) ? 1 : 0);
        break lexical_join_20;
    }
    if (!(spill125_1)) {
        break lexical_join_21;
    }
    lexicalValue125_20_0 = (((java.lang.String)(p0)).length() - 1);
    }
    lexicalValue125_22_0 = lexicalValue125_20_0;
    break lexical_join_22;
    }
    lexicalValue125_22_0 = 0;
    }
    life10_28 = lexicalValue125_22_0;
    spill125_2 = p3;
    if (!((life7_11 != 0))) {
        lexicalValue125_28_0 = ((spill125_2) ? 1 : 0);
        break lexical_join_28;
    }
    if (!(spill125_2)) {
        break lexical_join_29;
    }
    lexicalValue125_28_0 = -1;
    }
    lexicalValue125_30_0 = lexicalValue125_28_0;
    break lexical_join_30;
    }
    lexicalValue125_30_0 = 1;
    }
    life11_39 = lexicalValue125_30_0;
    life12_41 = 0;
    life13_43 = 0;
    life14_45 = life10_28;
    lexical_cycle_37: while (true) {
    lexical_join_156: {
    lexical_join_152: {
    lexical_join_144: {
    lexical_join_143: {
    lexical_join_138: {
    lexical_join_134: {
    lexical_join_127: {
    lexical_join_122: {
    lexical_join_115: {
    lexical_join_112: {
    lexical_join_109: {
    lexical_join_108: {
    lexical_join_105: {
    lexical_join_104: {
    lexical_join_55: {
    lexical_join_49: {
    if (!((life14_45 >= 0))) {
        break lexical_join_162;
    }
    spill125_3 = life14_45;
    if (!((life7_11 != 0))) {
        lexicalValue125_49_0 = spill125_3;
        break lexical_join_49;
    }
    if (!((spill125_3 < ((java.lang.String)(p0)).length()))) {
        break lexical_join_162;
    }
    lexicalValue125_49_0 = recovery.source.CarrierOps.fcmpg(((float)(life9_10)), ((float)(((float) p1))));
    }
    if (!((life7_11 != 0))) {
        lexicalValue125_55_0 = lexicalValue125_49_0;
        break lexical_join_55;
    }
    if (!((lexicalValue125_49_0 < 0))) {
        break lexical_join_162;
    }
    lexicalValue125_55_0 = ((int)(((java.lang.String)(p0)).charAt(((int)(life14_45)))));
    }
    life15_76 = lexicalValue125_55_0;
    life16_82 = ((com.moon.jm)(this)).a(((java.lang.String)(__sourceIntrinsic_aab3ff8348e9_invokedynamic125_9(life15_76))), ((float)(p2)));
    spill125_4 = life12_41;
    if (!((life7_11 != 0))) {
        lexicalValue125_115_0 = spill125_4;
        break lexical_join_115;
    }
    if (!((spill125_4 != 0))) {
        break lexical_join_112;
    }
    life12_41 = 0;
    spill125_5 = life15_76;
    if (!((life7_11 != 0))) {
        lexicalValue125_109_0 = spill125_5;
        break lexical_join_109;
    }
    if (!((spill125_5 != __sourceIntrinsic_aab3ff8348e9_invokedynamic125_11(17965, (272349011040075563L ^ life5_3))))) {
        break lexical_join_108;
    }
    spill125_6 = life15_76;
    if (!((life7_11 != 0))) {
        lexicalValue125_109_0 = spill125_6;
        break lexical_join_109;
    }
    if (!((spill125_6 != __sourceIntrinsic_aab3ff8348e9_invokedynamic125_12(12926, (8142889226301967225L ^ life5_3))))) {
        break lexical_join_108;
    }
    spill125_7 = life15_76;
    if (!((life7_11 != 0))) {
        lexicalValue125_105_0 = spill125_7;
        break lexical_join_105;
    }
    if (!((spill125_7 != __sourceIntrinsic_aab3ff8348e9_invokedynamic125_13(17537, (7746251111513816453L ^ life5_3))))) {
        break lexical_join_104;
    }
    spill125_8 = life15_76;
    if (!((life7_11 != 0))) {
        lexicalValue125_138_0 = spill125_8;
        break lexical_join_138;
    }
    if (!((spill125_8 == __sourceIntrinsic_aab3ff8348e9_invokedynamic125_14(7757, (8909191841133143880L ^ life5_3))))) {
        break lexical_join_134;
    }
    }
    lexicalValue125_105_0 = 0;
    }
    life13_43 = lexicalValue125_105_0;
    if (!((life7_11 == 0))) {
        break lexical_join_134;
    }
    }
    lexicalValue125_109_0 = 1;
    }
    life13_43 = lexicalValue125_109_0;
    if (!((life7_11 == 0))) {
        break lexical_join_134;
    }
    }
    lexicalValue125_115_0 = recovery.source.CarrierOps.fcmpg(((float)(life16_82)), ((float)(0x0.0p0f)));
    }
    if (!((life7_11 != 0))) {
        lexicalValue125_127_0 = lexicalValue125_115_0;
        break lexical_join_127;
    }
    if (!((lexicalValue125_115_0 < 0))) {
        break lexical_join_122;
    }
    life12_41 = 1;
    if (!((life7_11 == 0))) {
        break lexical_join_134;
    }
    }
    life9_10 = (life9_10 + life16_82);
    lexicalValue125_127_0 = life13_43;
    }
    if (!((life7_11 != 0))) {
        lexicalValue125_138_0 = lexicalValue125_127_0;
        break lexical_join_138;
    }
    if (!((lexicalValue125_127_0 != 0))) {
        break lexical_join_134;
    }
    life9_10 = (life9_10 + 0x1.0p0f);
    }
    lexicalValue125_138_0 = recovery.source.CarrierOps.fcmpl(((float)(life9_10)), ((float)(((float) p1))));
    }
    if (!((life7_11 != 0))) {
        lexicalValue125_144_0 = lexicalValue125_138_0;
        break lexical_join_144;
    }
    if (!((lexicalValue125_138_0 > 0))) {
        break lexical_join_143;
    }
    if (!((life7_11 == 0))) {
        break lexical_join_162;
    }
    }
    lexicalValue125_144_0 = ((p3) ? 1 : 0);
    }
    if (!((lexicalValue125_144_0 != 0))) {
        break lexical_join_152;
    }
    ((java.lang.StringBuilder)(life8_8)).insert(((int)(0)), ((char)(life15_76)));
    if (!((life7_11 == 0))) {
        break lexical_join_156;
    }
    }
    ((java.lang.StringBuilder)(life8_8)).append(((char)(life15_76)));
    }
    life14_45 = (life14_45 + life11_39);
    if (!((life7_11 == 0))) { continue lexical_cycle_37; }
    break lexical_cycle_37;
    }
    }
    return ((java.lang.StringBuilder)(life8_8)).toString();
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_aab3ff8348e9_invokedynamic125_9(int a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_aab3ff8348e9_invokedynamic125_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_aab3ff8348e9_invokedynamic125_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_aab3ff8348e9_invokedynamic125_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_aab3ff8348e9_invokedynamic125_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1978_0() throws E;
}
