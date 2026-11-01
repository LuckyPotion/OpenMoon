package com.moon.setting;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class BezierSetting extends com.moon.setting.Setting<java.lang.Float> {

private float k;

private float l;

private float startValue;

private float endValue;

private float[][] controlPoints;

private float[] samples;

private static final long r;

private static final java.lang.String[] s;

private static final java.lang.String[] t;

private static final java.util.Map u;

private static final long[] v;

private static final java.lang.Integer[] w;

private static final java.util.Map x;

protected BezierSetting(java.lang.String p0) {
super(p0, com.moon.cf.BEZIER);
}


static {
r = ((long)(((moom._a)(moom._c.a(((long)(4333085686677571428L)), ((long)(317961703470844936L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(124279608718411L)))));
    u = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (com.moon.setting.BezierSetting.r ^ 66780803457788L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill457_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill457_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill457_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill457_14 = new byte[8];
    (__sourceSpill457_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill457_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation457_16 = __sourceSpill457_14;
    ((javax.crypto.Cipher)(__sourceSpill457_11)).init(((int)(__sourceSpill457_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill457_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation457_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[7];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "\006ãÎÚçlà\r|¤'Ä,#0\020]G'bâ+½EàÊ\rò4_¿\020 G¾Ð\003à(È6e\nñf\024| \020ê°ÞQÓT\026\007m7\034pÚ¯]÷\020ò\032§ØßX|1\t¼.\027Cð"))).length();
    int local16_life24 = 16;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill457_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill457_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill457_29)).doFinal(((byte[])(__sourceSpill457_28)));
        java.lang.String __sourceSpill457_34 = ((java.lang.String)(com.moon.setting.BezierSetting.a(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill457_35 = local20_life19;
        int __sourceSpill457_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill457_35)[__sourceSpill457_36] = __sourceSpill457_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "3ÝÅ_\t¹\007öe,µ\0208pî\020Ü~}bY0\003)â9Då\024\030äÛ"))).length();
    local16_life24 = 16;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill457_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill457_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill457_42)).doFinal(((byte[])(__sourceSpill457_41)));
        java.lang.String __sourceSpill457_47 = ((java.lang.String)(com.moon.setting.BezierSetting.a(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill457_48 = local20_life19;
        int __sourceSpill457_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill457_48)[__sourceSpill457_49] = __sourceSpill457_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    s = ((java.lang.String[])(local20_life19));
    t = ((java.lang.String[])(new java.lang.String[7]));
    x = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill457_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill457_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill457_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill457_60 = new byte[8];
    (__sourceSpill457_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill457_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation457_62 = __sourceSpill457_60;
    ((javax.crypto.Cipher)(__sourceSpill457_57)).init(((int)(__sourceSpill457_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill457_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation457_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[3];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "\003ADòw |ÒTgª²YMÂÆÅ~/\022ßµ\035Ð"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill457_71 = local4_life67;
        int __sourceSpill457_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill457_71)).substring(((int)(__sourceSpill457_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill457_76 = local6_life65;
        int __sourceSpill457_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill457_79 = new byte[8];
        (__sourceSpill457_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill457_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill457_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill457_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill457_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill457_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill457_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill457_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill457_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill457_80)).doFinal(((byte[])(__sourceSpill457_79)));
        (__sourceSpill457_76)[__sourceSpill457_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    v = ((long[])(local6_life65));
    w = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


public float b() {
return this.l;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral3577_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/kU"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.setting.BezierSetting.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 12297;
      if (w[var3] == null) {
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
         long var5 = v[var3];
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
         Object[] var9 = (Object[])x.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               x.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/kU", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         w[var3] = var15;
      }

      return w[var3];
}


public void b(float p0) {
this.l = ((float)(p0));
    ((com.moon.setting.BezierSetting)(this)).a__Void();
    return;
}


public void setStartValue(float p0) {
this.startValue = ((float)(p0));
    ((com.moon.setting.BezierSetting)(this)).a__Void();
    return;
}


public float getStartValue() {
return this.startValue;
}


public void setEndValue(float p0) {
this.endValue = ((float)(p0));
    ((com.moon.setting.BezierSetting)(this)).a__Void();
    return;
}


public float getEndValue() {
return this.endValue;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.setting.BezierSetting.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.String a(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 161);
    if (((com.moon.setting.BezierSetting.t)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.setting.BezierSetting.u)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.setting.BezierSetting.u)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/kU", life9_51);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_71: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life4_21)[1])))).generateSecret(((java.security.spec.KeySpec)(life7_92)));
        ((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).init(((int)(2)), ((java.security.Key)(life8_99)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life4_21)[2])))));
        life9_116 = ((java.lang.String)((com.moon.setting.BezierSetting.s)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.setting.BezierSetting.t)[life5_8] = com.moon.setting.BezierSetting.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.setting.BezierSetting.t)[life5_8];
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
        byte[] spill1723_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1723_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1723_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1723_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1723_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1723_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public float[] getSamples() {
return this.samples;
}


public com.google.gson.JsonObject toJson() {
com.google.gson.JsonObject lexicalValue455_98_0;
    net.minecraft.entity.Entity[] spill455_0;
    com.google.gson.JsonObject spill455_1;
    long life1_3;
    com.google.gson.JsonObject life4_7;
    com.google.gson.JsonArray life5_40;
    float[][] life6_43;
    int life7_47;
    net.minecraft.entity.Entity[] life3_48;
    int life8_50;
    float[] life9_57;
    com.google.gson.JsonObject life10_61;
    lexical_join_98: {
    lexical_join_92: {
    lexical_join_84: {
    life1_3 = (com.moon.setting.BezierSetting.r ^ 66426345430461L);
    life4_7 = new com.google.gson.JsonObject();
    ((com.google.gson.JsonObject)(life4_7)).addProperty(((java.lang.String)(__sourceIntrinsic_55789b9cab72_invokedynamic455_1(13028, (2237739517734868748L ^ life1_3)))), ((java.lang.String)(((com.moon.setting.BezierSetting)(this)).getId())));
    ((com.google.gson.JsonObject)(life4_7)).addProperty(((java.lang.String)(__sourceIntrinsic_55789b9cab72_invokedynamic455_4(17271, (2127737086446511771L ^ life1_3)))), ((java.lang.Number)(java.lang.Float.valueOf(((float)(this.startValue))))));
    ((com.google.gson.JsonObject)(life4_7)).addProperty(((java.lang.String)(__sourceIntrinsic_55789b9cab72_invokedynamic455_8(17821, (138315499088322676L ^ life1_3)))), ((java.lang.Number)(java.lang.Float.valueOf(((float)(this.endValue))))));
    life5_40 = new com.google.gson.JsonArray();
    life6_43 = this.controlPoints;
    spill455_0 = com.moon.setting.BooleanSetting.a();
    life7_47 = (life6_43).length;
    life3_48 = spill455_0;
    life8_50 = 0;
    lexical_cycle_51: while (true) {
    if (!((life8_50 < life7_47))) {
        break lexical_join_84;
    }
    life9_57 = (life6_43)[life8_50];
    life10_61 = new com.google.gson.JsonObject();
    ((com.google.gson.JsonObject)(life10_61)).addProperty(((java.lang.String)("x")), ((java.lang.Number)(java.lang.Float.valueOf(((float)((life9_57)[0]))))));
    ((com.google.gson.JsonObject)(life10_61)).addProperty(((java.lang.String)("y")), ((java.lang.Number)(java.lang.Float.valueOf(((float)((life9_57)[1]))))));
    ((com.google.gson.JsonArray)(life5_40)).add(((com.google.gson.JsonElement)(life10_61)));
    life8_50 += 1;
    if (!((life3_48 != null))) {
        break lexical_join_92;
    }
    if (!((life3_48 == null))) { continue lexical_cycle_51; }
    break lexical_cycle_51;
    }
    }
    ((com.google.gson.JsonObject)(life4_7)).add(((java.lang.String)(__sourceIntrinsic_55789b9cab72_invokedynamic455_19(19655, (651245097858246954L ^ life1_3)))), ((com.google.gson.JsonElement)(life5_40)));
    }
    spill455_1 = life4_7;
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        lexicalValue455_98_0 = spill455_1;
        break lexical_join_98;
    }
    com.moon.setting.BooleanSetting.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[5])));
    lexicalValue455_98_0 = spill455_1;
    }
    return lexicalValue455_98_0;
}


public void fromJson(com.google.gson.JsonObject p0) {
int forestValue202_23_0;
    int forestValue202_35_0;
    com.google.gson.JsonObject forestValue202_63_0;
    java.lang.String forestValue202_63_1;
    boolean spill202_0;
    com.google.gson.JsonObject spill202_1;
    java.lang.String spill202_2;
    float[][] spill202_3;
    int spill202_4;
    float[] spill202_5;
    float[] spill202_6;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    com.google.gson.JsonArray life5_70;
    float[][] life6_74;
    int life7_76;
    com.google.gson.JsonObject life8_85;
    forest_join_108: {
    forest_join_105: {
    forest_join_63: {
    forest_join_37: {
    forest_join_36: {
    forest_join_35: {
    forest_join_23: {
    life2_3 = (com.moon.setting.BezierSetting.r ^ 18193001747001L);
    life4_5 = com.moon.setting.BooleanSetting.a();
    spill202_0 = ((com.google.gson.JsonObject)(p0)).has(((java.lang.String)(__sourceIntrinsic_6ac6dd84f129_invokedynamic202_2(1188, (2566688397731360459L ^ life2_3)))));
    if (!((life4_5 != null))) {
        forestValue202_23_0 = ((spill202_0) ? 1 : 0);
        break forest_join_23;
    }
    if (!(spill202_0)) {
        break forest_join_36;
    }
    forestValue202_23_0 = ((((com.google.gson.JsonObject)(p0)).has(((java.lang.String)(__sourceIntrinsic_6ac6dd84f129_invokedynamic202_5(3230, (151796292582500080L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forestValue202_35_0 = forestValue202_23_0;
        break forest_join_35;
    }
    if (!((forestValue202_23_0 != 0))) {
        break forest_join_36;
    }
    spill202_1 = p0;
    spill202_2 = __sourceIntrinsic_6ac6dd84f129_invokedynamic202_8(24706, (8220524273224026856L ^ life2_3));
    if (!((life4_5 != null))) {
        forestValue202_63_0 = spill202_1;
        forestValue202_63_1 = spill202_2;
        break forest_join_63;
    }
    forestValue202_35_0 = ((((com.google.gson.JsonObject)(spill202_1)).has(((java.lang.String)(spill202_2)))) ? 1 : 0);
    }
    if (!((forestValue202_35_0 == 0))) {
        break forest_join_37;
    }
    }
    return;
    }
    ((com.moon.setting.BezierSetting)(this)).setStartValue(((float)(((com.google.gson.JsonElement)(((com.google.gson.JsonObject)(p0)).get(((java.lang.String)(__sourceIntrinsic_6ac6dd84f129_invokedynamic202_11(1188, (2566688397731360459L ^ life2_3))))))).getAsFloat())));
    ((com.moon.setting.BezierSetting)(this)).setEndValue(((float)(((com.google.gson.JsonElement)(((com.google.gson.JsonObject)(p0)).get(((java.lang.String)(__sourceIntrinsic_6ac6dd84f129_invokedynamic202_15(3230, (151796292582500080L ^ life2_3))))))).getAsFloat())));
    forestValue202_63_0 = p0;
    forestValue202_63_1 = __sourceIntrinsic_6ac6dd84f129_invokedynamic202_19(24706, (8220524273224026856L ^ life2_3));
    }
    life5_70 = ((com.google.gson.JsonElement)(((com.google.gson.JsonObject)(forestValue202_63_0)).get(((java.lang.String)(forestValue202_63_1))))).getAsJsonArray();
    life6_74 = __sourceIntrinsic_6ac6dd84f129_call202_22(2, 2);
    life7_76 = 0;
    forest_cycle_72: while (true) {
    if (!((life7_76 < ((com.google.gson.JsonArray)(life5_70)).size()))) {
        break forest_join_105;
    }
    life8_85 = ((com.google.gson.JsonElement)(((com.google.gson.JsonArray)(life5_70)).get(((int)(life7_76))))).getAsJsonObject();
    spill202_3 = life6_74;
    spill202_4 = life7_76;
    float[] __stackOp202_26_0 = new float[2];
    spill202_5 = __stackOp202_26_0;
    (__stackOp202_26_0)[0] = ((com.google.gson.JsonElement)(((com.google.gson.JsonObject)(life8_85)).get(((java.lang.String)("x"))))).getAsFloat();
    float[] __stackOp202_29_0 = spill202_5;
    spill202_6 = __stackOp202_29_0;
    (__stackOp202_29_0)[1] = ((com.google.gson.JsonElement)(((com.google.gson.JsonObject)(life8_85)).get(((java.lang.String)("y"))))).getAsFloat();
    (spill202_3)[spill202_4] = spill202_6;
    life7_76 += 1;
    if (!((life4_5 != null))) {
        break forest_join_108;
    }
    if (!((life4_5 == null))) {
        continue forest_cycle_72;
    }
    break forest_cycle_72;
    }
    }
    ((com.moon.setting.BezierSetting)(this)).setControlPoints(((float[][])(life6_74)));
    }
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3582_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/kU"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private void a__Void() {
float[][] forestValue100071_19_0;
    float forestValue100071_93_0;
    float[][] spill100071_0;
    float spill100071_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    float[][] life4_20;
    int life5_22;
    int[] life5_47;
    float[] life6_54;
    float[][] life7_56;
    int life8_59;
    int life9_61;
    float[] life10_68;
    float life11_100;
    int life12_107;
    forest_join_130: {
    forest_join_127: {
    forest_join_40: {
    forest_join_19: {
    forest_join_12: {
    life1_3 = (com.moon.setting.BezierSetting.r ^ 11719648202693L);
    life3_5 = com.moon.setting.BooleanSetting.a();
    spill100071_0 = this.controlPoints;
    if (!((life3_5 != null))) {
        forestValue100071_19_0 = spill100071_0;
        break forest_join_19;
    }
    if (!((spill100071_0 == null))) {
        break forest_join_12;
    }
    return;
    }
    forestValue100071_19_0 = __sourceIntrinsic_b82a5b29b709_call100071_4(__sourceIntrinsic_b82a5b29b709_invokedynamic100071_3(23255, (8347763090870656494L ^ life1_3)), 2);
    }
    life4_20 = forestValue100071_19_0;
    life5_22 = 0;
    forest_cycle_22: while (true) {
    if (!((life5_22 < (life4_20).length))) {
        break forest_join_40;
    }
    (life4_20)[life5_22] = ((com.moon.setting.BezierSetting)(this)).evaluate(((float)((((float) life5_22) / ((float) (life4_20).length)))));
    life5_22 += 1;
    if (!((life3_5 == null))) {
        continue forest_cycle_22;
    }
    break forest_cycle_22;
    }
    }
    life5_47 = new int[__sourceIntrinsic_b82a5b29b709_invokedynamic100071_6(16897, (4691420703494849851L ^ life1_3))];
    life6_54 = new float[__sourceIntrinsic_b82a5b29b709_invokedynamic100071_7(20194, (8472073047733783002L ^ life1_3))];
    life7_56 = life4_20;
    life8_59 = (life7_56).length;
    life9_61 = 0;
    forest_cycle_61: while (true) {
    forest_join_125: {
    forest_join_124: {
    forest_join_93: {
    forest_join_90: {
    if (!((life9_61 < life8_59))) {
        break forest_join_127;
    }
    life10_68 = (life7_56)[life9_61];
    if (!((life3_5 != null))) {
        break forest_join_130;
    }
    if (!((life3_5 != null))) {
        break forest_join_125;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(((double) (life10_68)[0]))), ((double)(0x1.0p0d))) <= 0))) {
        break forest_join_124;
    }
    spill100071_1 = (life10_68)[0];
    if (!((life3_5 != null))) {
        forestValue100071_93_0 = spill100071_1;
        break forest_join_93;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(((double) spill100071_1))), ((double)(0x0.0p0d))) < 0))) {
        break forest_join_90;
    }
    if (!((life3_5 == null))) {
        break forest_join_124;
    }
    }
    forestValue100071_93_0 = (life10_68)[1];
    }
    life11_100 = forestValue100071_93_0;
    life12_107 = ((int) ((life10_68)[0] * 0x1.9p6f));
    int[] __stackOp100071_10_0 = life5_47;
    int __stackOp100071_10_1 = life12_107;
    (__stackOp100071_10_0)[__stackOp100071_10_1] = ((__stackOp100071_10_0)[__stackOp100071_10_1] + 1);
    float[] __stackOp100071_11_0 = life6_54;
    int __stackOp100071_11_1 = life12_107;
    (__stackOp100071_11_0)[__stackOp100071_11_1] = ((__stackOp100071_11_0)[__stackOp100071_11_1] + ((life11_100 - (life6_54)[life12_107]) / ((float) (life5_47)[life12_107])));
    }
    life9_61 += 1;
    }
    if (!((life3_5 == null))) {
        continue forest_cycle_61;
    }
    break forest_cycle_61;
    }
    }
    this.samples = ((float[])(life6_54));
    }
    return;
}


public float[] evaluate(float p0) {
long life2_3;
    float life5_8;
    float life6_12;
    net.minecraft.entity.Entity[] life4_13;
    float life7_17;
    float life8_21;
    float life9_25;
    double life10_54;
    double life12_91;
    life2_3 = (com.moon.setting.BezierSetting.r ^ 112378661358018L);
    net.minecraft.entity.Entity[] spill2994_0 = com.moon.setting.BooleanSetting.a();
    life5_8 = (0x1.0p0f - p0);
    life6_12 = (p0 * p0);
    life4_13 = spill2994_0;
    life7_17 = (life5_8 * life5_8);
    life8_21 = (life7_17 * life5_8);
    life9_25 = (life6_12 * p0);
    life10_54 = ((double) (((((0x1.8p1f * life7_17) * p0) * ((this.controlPoints)[0])[0]) + (((0x1.8p1f * life5_8) * life6_12) * ((this.controlPoints)[1])[0])) + life9_25));
    life12_91 = ((double) ((((life8_21 * this.startValue) + (((0x1.8p1f * life7_17) * p0) * ((this.controlPoints)[0])[1])) + (((0x1.8p1f * life5_8) * life6_12) * ((this.controlPoints)[1])[1])) + (life9_25 * this.endValue)));
    float[] spill2994_1 = new float[] {((float) life10_54), ((float) life12_91)};
    if ((life4_13 == null)) {
        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[5])));
    }
    return spill2994_1;
}


public static com.moon.l9 builder(java.lang.String p0) {
return new com.moon.l9(p0);
}


public float a() {
return this.k;
}


public float[][] getControlPoints() {
return this.controlPoints;
}


public void setControlPoints(float[][] p0) {
this.controlPoints = ((float[][])(p0));
    ((com.moon.setting.BezierSetting)(this)).a__Void();
    return;
}


public void a(float p0) {
this.k = ((float)(p0));
    ((com.moon.setting.BezierSetting)(this)).a__Void();
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3582_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic100071_3(int a0, long a1) throws E;

private static native <E extends Throwable> float[][] __sourceIntrinsic_b82a5b29b709_call100071_4(int a0, int a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic100071_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic100071_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral3577_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6ac6dd84f129_invokedynamic202_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6ac6dd84f129_invokedynamic202_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6ac6dd84f129_invokedynamic202_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6ac6dd84f129_invokedynamic202_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6ac6dd84f129_invokedynamic202_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6ac6dd84f129_invokedynamic202_19(int a0, long a1) throws E;

private static native <E extends Throwable> float[][] __sourceIntrinsic_6ac6dd84f129_call202_22(int a0, int a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_55789b9cab72_invokedynamic455_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_55789b9cab72_invokedynamic455_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_55789b9cab72_invokedynamic455_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_55789b9cab72_invokedynamic455_19(int a0, long a1) throws E;
}
