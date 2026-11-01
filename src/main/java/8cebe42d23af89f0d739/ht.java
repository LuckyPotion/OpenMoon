package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class ht implements com.moon.hn {

private moom.DD b;

private java.util.Map<net.minecraft.potion.Potion, net.minecraft.potion.PotionEffect> c;

private java.util.List<net.minecraft.potion.Potion> d;

private com.moon.module.impl.HUD e;

private com.moon.hW f;

private static long g;

private static java.lang.String[] h;

private static java.lang.String[] j;

private static java.util.Map k;

private static long[] l;

private static java.lang.Integer[] m;

private static java.util.Map q;

public ht() { super(); }


private static void __sourceConstructorBody_15af0baa2cc5912c(com.moon.ht receiver) throws Throwable {

long local1 = (com.moon.ht.g ^ 124683053044582L);

    com.moon.ht.__sourceConstructorInit_15af0baa2cc5912c_0(((com.moon.ht)(receiver)));

    ((com.moon.ht)(receiver)).b = ((moom.DD)(new moom.DD(__sourceIntrinsic_15af0baa2cc5912c_originalDynamicSite978_2(17042, (3290149215822755285L ^ local1)))));

    ((com.moon.ht)(receiver)).c = ((java.util.Map)(new java.util.HashMap()));

    ((com.moon.ht)(receiver)).d = ((java.util.List)(new java.util.ArrayList()));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_15af0baa2cc5912c_0(com.moon.ht a0) throws E;

static {
g = ((long)(((moom._a)(moom._c.a(((long)(9067262342946270957L)), ((long)(291169333684853061L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(152919254573400L)))));
    k = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (com.moon.ht.g ^ 91725129911027L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill145_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill145_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill145_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill145_14 = new byte[8];
    (__sourceSpill145_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill145_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation145_16 = __sourceSpill145_14;
    ((javax.crypto.Cipher)(__sourceSpill145_11)).init(((int)(__sourceSpill145_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill145_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation145_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[3];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "é!KÝÑjoeM\b\024Ò\"öÂüµá\\ó¨\003\032=4\007nè«*<ó\013=\032íÒìo\003¤ôýp«$ã¶yNïÑ¼\021Ö\031\020&óa\002r­Zÿ2\036ëòl\020&\021·\006Ó&_³\013 0\006ÙÔ"))).length();
    int local16_life24 = 64;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill145_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill145_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill145_29)).doFinal(((byte[])(__sourceSpill145_28)));
        java.lang.String __sourceSpill145_34 = ((java.lang.String)(com.moon.ht.a(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill145_35 = local20_life19;
        int __sourceSpill145_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill145_35)[__sourceSpill145_36] = __sourceSpill145_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    h = ((java.lang.String[])(local20_life19));
    j = ((java.lang.String[])(new java.lang.String[3]));
    q = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life42;
    javax.crypto.Cipher __sourceSpill145_44 = (local0_life42 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill145_45 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill145_46 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill145_47 = new byte[8];
    (__sourceSpill145_47)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life48 = 1;
    while ((local1_life48 < 8)) {
        (__sourceSpill145_47)[local1_life48] = ((byte) ((int) ((local11_life7 << (local1_life48 * 8)) >>> 56)));
        local1_life48 += 1;
    }
    byte[] __sourcePreallocation145_49 = __sourceSpill145_47;
    ((javax.crypto.Cipher)(__sourceSpill145_44)).init(((int)(__sourceSpill145_45)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill145_46)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation145_49)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life52 = new long[10];
    int local3_life53 = 0;
    java.lang.String local4_life54;
    int local5_life56 = ((java.lang.String)((local4_life54 = "Ñª§\031ÇëáãùBÆ&Kæõ\017NCdÀe\036\f2c\035\\BÀ ×\030Ô\023Yù_\032\023TÆïfI7gþ·g]Ñ ,"))).length();
    int local2_life57 = 0;
    do {
        java.lang.String __sourceSpill145_58 = local4_life54;
        int __sourceSpill145_59 = local2_life57;
        local2_life57 += 8;
        byte[] local7_life62 = ((java.lang.String)(((java.lang.String)(__sourceSpill145_58)).substring(((int)(__sourceSpill145_59)), ((int)(local2_life57))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill145_63 = local6_life52;
        int __sourceSpill145_64 = local3_life53;
        local3_life53 += 1;
        long local8_life65 = (((((((((((long) (local7_life62)[0]) & 255L) << 56) | ((((long) (local7_life62)[1]) & 255L) << 48)) | ((((long) (local7_life62)[2]) & 255L) << 40)) | ((((long) (local7_life62)[3]) & 255L) << 32)) | ((((long) (local7_life62)[4]) & 255L) << 24)) | ((((long) (local7_life62)[5]) & 255L) << 16)) | ((((long) (local7_life62)[6]) & 255L) << 8)) | (((long) (local7_life62)[7]) & 255L));
        byte[] __sourceSpill145_66 = new byte[8];
        (__sourceSpill145_66)[0] = ((byte) ((int) (local8_life65 >>> 56)));
        (__sourceSpill145_66)[1] = ((byte) ((int) (local8_life65 >>> 48)));
        (__sourceSpill145_66)[2] = ((byte) ((int) (local8_life65 >>> 40)));
        (__sourceSpill145_66)[3] = ((byte) ((int) (local8_life65 >>> 32)));
        (__sourceSpill145_66)[4] = ((byte) ((int) (local8_life65 >>> 24)));
        (__sourceSpill145_66)[5] = ((byte) ((int) (local8_life65 >>> 16)));
        (__sourceSpill145_66)[6] = ((byte) ((int) (local8_life65 >>> 8)));
        (__sourceSpill145_66)[7] = ((byte) ((int) local8_life65));
        javax.crypto.Cipher __sourceSpill145_67 = local0_life42;
        byte[] local10_life69 = ((javax.crypto.Cipher)(__sourceSpill145_67)).doFinal(((byte[])(__sourceSpill145_66)));
        (__sourceSpill145_63)[__sourceSpill145_64] = (((((((((((long) (local10_life69)[0]) & 255L) << 56) | ((((long) (local10_life69)[1]) & 255L) << 48)) | ((((long) (local10_life69)[2]) & 255L) << 40)) | ((((long) (local10_life69)[3]) & 255L) << 32)) | ((((long) (local10_life69)[4]) & 255L) << 24)) | ((((long) (local10_life69)[5]) & 255L) << 16)) | ((((long) (local10_life69)[6]) & 255L) << 8)) | (((long) (local10_life69)[7]) & 255L));
    } while ((!(local2_life57 >= local5_life56)));
    local5_life56 = ((java.lang.String)((local4_life54 = "/köe\0029×4ÄÞ¿\036R\t"))).length();
    local2_life57 = 0;
    do {
        java.lang.String __sourceSpill145_71 = local4_life54;
        int __sourceSpill145_72 = local2_life57;
        local2_life57 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill145_71)).substring(((int)(__sourceSpill145_72)), ((int)(local2_life57))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill145_76 = local6_life52;
        int __sourceSpill145_77 = local3_life53;
        local3_life53 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill145_79 = new byte[8];
        (__sourceSpill145_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill145_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill145_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill145_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill145_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill145_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill145_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill145_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill145_80 = local0_life42;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill145_80)).doFinal(((byte[])(__sourceSpill145_79)));
        (__sourceSpill145_76)[__sourceSpill145_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life57 >= local5_life56)));
    l = ((long[])(local6_life52));
    m = ((java.lang.Integer[])(new java.lang.Integer[10]));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private void b() {
com.moon.ht forwardValue385_12_0;
    com.moon.ht spill385_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_18: {
    forward_join_12: {
    life1_3 = (com.moon.ht.g ^ 60947794092788L);
    life3_5 = com.moon.hq.b__ArrayString();
    spill385_0 = this;
    if (!((life3_5 == null))) {
        forwardValue385_12_0 = spill385_0;
        break forward_join_12;
    }
    if (!((((com.moon.ht)(spill385_0)).e == null))) {
        break forward_join_18;
    }
    forwardValue385_12_0 = this;
    }
    ((com.moon.ht)(forwardValue385_12_0)).e = ((com.moon.module.impl.HUD)(((com.moon.module.impl.HUD)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.HUD.class)))))));
    }
    return;
}


public void b(com.moon.hW p0) {
return;
}


public void c(com.moon.hW p0) {
return;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral1513_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/ht"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 2169;
      if (m[var3] == null) {
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
         long var5 = l[var3];
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
         Object[] var9 = (Object[])q.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               q.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/ht", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         m[var3] = var15;
      }

      return m[var3];
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.ht.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void d(com.moon.hW p0) {
int lexicalValue81_25_0;
    java.lang.Object lexicalValue81_33_0;
    com.moon.ht lexicalValue81_57_0;
    float lexicalValue81_78_0;
    com.moon.ht lexicalValue81_103_0;
    java.lang.String[] spill81_0;
    boolean spill81_1;
    java.lang.Boolean spill81_2;
    com.moon.ht spill81_3;
    com.moon.ht spill81_4;
    long life2_3;
    java.lang.String[] life4_7;
    com.moon.jm life5_46;
    moom.ir life6_48;
    float life7_98;
    java.util.Iterator life8_131;
    net.minecraft.potion.Potion life9_138;
    net.minecraft.potion.PotionEffect life10_144;
    java.lang.String life11_149;
    float life12_160;
    float life13_164;
    float life14_174;
    int life15_177;
    float life16_209;
    float life17_230;
    float life18_232;
    lexical_join_259: {
    lexical_join_257: {
    lexical_join_103: {
    lexical_join_102: {
    lexical_join_78: {
    lexical_join_77: {
    lexical_join_57: {
    lexical_join_56: {
    lexical_join_33: {
    lexical_join_25: {
    life2_3 = (com.moon.ht.g ^ 57602207005781L);
    spill81_0 = com.moon.hq.b__ArrayString();
    ((com.moon.ht)(this)).b();
    life4_7 = spill81_0;
    spill81_1 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.HUD)(this.e)).f__kV())).getValue())))).booleanValue();
    if (!((life4_7 == null))) {
        lexicalValue81_25_0 = ((spill81_1) ? 1 : 0);
        break lexical_join_25;
    }
    if (!(spill81_1)) {
        break lexical_join_259;
    }
    spill81_2 = ((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.HUD)(this.e)).e__kV())).getValue()));
    if (!((life4_7 == null))) {
        lexicalValue81_33_0 = spill81_2;
        break lexical_join_33;
    }
    lexicalValue81_25_0 = ((((java.lang.Boolean)(spill81_2)).booleanValue()) ? 1 : 0);
    }
    if (!((lexicalValue81_25_0 != 0))) {
        break lexical_join_259;
    }
    lexicalValue81_33_0 = ((java.util.function.Supplier)(((com.moon.bW)(((com.moon.bW)(((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(this.e)).i__kY())).getValue())))).a__Supplier())).get();
    }
    life5_46 = ((com.moon.jm)(lexicalValue81_33_0));
    life6_48 = com.moon.nS.a();
    ((moom.ir)(life6_48)).a(((float)((0x1.0p0f / ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.HUD)(this.e)).e__kZ())).getValue())))).floatValue()))));
    spill81_3 = this;
    if (!((life4_7 == null))) {
        lexicalValue81_57_0 = spill81_3;
        break lexical_join_57;
    }
    if (!((((com.moon.ht)(spill81_3)).f != null))) {
        break lexical_join_56;
    }
    ((com.moon.hY)(((com.moon.hW)(this.f)).a__hY())).g();
    }
    lexicalValue81_57_0 = this;
    }
    ((com.moon.ht)(lexicalValue81_57_0)).f = ((com.moon.hW)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.TEXTURE_COL))))).a__hX())).c())).a()));
    if (!((((((net.minecraft.client.Minecraft)(com.moon.ht.a)).P instanceof moom.gF) ? 1 : 0) != 0))) {
        break lexical_join_77;
    }
    lexicalValue81_78_0 = (0x1.8p3f / ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.HUD)(this.e)).e__kZ())).getValue())))).floatValue());
    break lexical_join_78;
    }
    lexicalValue81_78_0 = 0x0.0p0f;
    }
    life7_98 = lexicalValue81_78_0;
    spill81_4 = this;
    if (!((life4_7 == null))) {
        lexicalValue81_103_0 = spill81_4;
        break lexical_join_103;
    }
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.HUD)(((com.moon.ht)(spill81_4)).e)).j())).getValue())))).booleanValue())) {
        break lexical_join_102;
    }
    if (!((((((net.minecraft.client.Minecraft)(com.moon.ht.a)).P instanceof moom.gF) ? 1 : 0) == 0))) {
        break lexical_join_102;
    }
    life7_98 = (life7_98 + ((com.moon.ht)(this)).a(((int)(__sourceIntrinsic_f0efb0c1e576_invokedynamic81_56(12311, (5635003507589646581L ^ life2_3))))));
    }
    lexicalValue81_103_0 = this;
    }
    life8_131 = ((java.util.List)(((com.moon.ht)(lexicalValue81_103_0)).d)).iterator();
    lexical_cycle_106: while (true) {
    lexical_join_255: {
    lexical_join_251: {
    if (!(((java.util.Iterator)(life8_131)).hasNext())) {
        break lexical_join_257;
    }
    life9_138 = ((net.minecraft.potion.Potion)(((java.util.Iterator)(life8_131)).next()));
    life10_144 = ((net.minecraft.potion.PotionEffect)(((java.util.Map)(this.c)).get(((java.lang.Object)(life9_138)))));
    life11_149 = ((com.moon.ht)(this)).a(((net.minecraft.potion.Potion)(life9_138)), ((net.minecraft.potion.PotionEffect)(life10_144)));
    life12_160 = ((((float) ((moom.ir)(life6_48)).a__Int()) - ((com.moon.jm)(life5_46)).a(((java.lang.String)(life11_149)), ((float)(0x1.2p3f)))) - 0x1.0p1f);
    life13_164 = ((com.moon.jm)(life5_46)).a(((float)(0x1.2p3f)));
    life14_174 = (((((float) ((moom.ir)(life6_48)).b__Int()) - life13_164) - 0x1.0p1f) - life7_98);
    life15_177 = ((net.minecraft.potion.Potion)(life9_138)).b();
    ((com.moon.jm)(life5_46)).a(((com.moon.hW)(((com.moon.module.impl.HUD)(this.e)).e())), ((java.lang.String)(life11_149)), ((float)(0x1.2p3f)), ((float)(life12_160)), ((float)(life14_174)), ((int)((((net.minecraft.potion.Potion)(life9_138)).c() | __sourceIntrinsic_f0efb0c1e576_invokedynamic81_75(24877, (2305500190680603080L ^ life2_3))))));
    life16_209 = ((float) ((life15_177 % __sourceIntrinsic_f0efb0c1e576_invokedynamic81_77(28409, (8872820125096793626L ^ life2_3))) * __sourceIntrinsic_f0efb0c1e576_invokedynamic81_78(28162, (3554644946960176870L ^ life2_3))));
    life17_230 = ((float) (__sourceIntrinsic_f0efb0c1e576_invokedynamic81_79(24682, (6427899099666241676L ^ life2_3)) + ((life15_177 / __sourceIntrinsic_f0efb0c1e576_invokedynamic81_80(31426, (5153566596845978149L ^ life2_3))) * __sourceIntrinsic_f0efb0c1e576_invokedynamic81_81(5527, (772675300922174844L ^ life2_3)))));
    life18_232 = 0x1.6p3f;
    if (!((life4_7 == null))) {
        break lexical_join_259;
    }
    if (!((life4_7 == null))) {
        break lexical_join_255;
    }
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.HUD)(this.e)).g__kV())).getValue())))).booleanValue())) {
        break lexical_join_251;
    }
    ((com.moon.hW)(this.f)).a(((com.moon.iX)(com.moon.i7.a(((float)(((life12_160 - life18_232) - 0x1.0p1f))), ((float)(life14_174)), ((float)((life12_160 - 0x1.0p1f))), ((float)((life14_174 + life18_232))), ((float)((life16_209 * 0x1.0p-8f))), ((float)((life17_230 * 0x1.0p-8f))), ((float)(((life16_209 + 0x1.2p4f) * 0x1.0p-8f))), ((float)(((life17_230 + 0x1.2p4f) * 0x1.0p-8f))), ((int)(-1))))));
    }
    life7_98 = (life7_98 + life13_164);
    }
    if (!((life4_7 != null))) { continue lexical_cycle_106; }
    break lexical_cycle_106;
    }
    }
    ((moom.ir)(life6_48)).a__Void();
    }
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1515_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/ht"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.ht.a(((int)(local4)), ((long)(local5)));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 26863);
    if (((com.moon.ht.j)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.ht.k)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.ht.k)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/ht", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.ht.h)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.ht.j)[life5_8] = com.moon.ht.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.ht.j)[life5_8];
}


public void a(com.moon.event.TickEvent p0) {
java.lang.Object lexicalValue79_26_0;
    java.lang.Object lexicalValue79_69_0;
    com.moon.module.impl.HUD spill79_0;
    net.minecraft.client.entity.EntityPlayerSP spill79_1;
    long life2_3;
    java.lang.String[] life4_5;
    com.moon.jm life5_38;
    net.minecraft.potion.Potion[] life6_46;
    int life7_49;
    int life8_51;
    net.minecraft.potion.Potion life9_58;
    lexical_join_87: {
    lexical_join_80: {
    lexical_join_73: {
    lexical_join_26: {
    lexical_join_10: {
    life2_3 = (com.moon.ht.g ^ 40152030337609L);
    life4_5 = com.moon.hq.b__ArrayString();
    if (!((((net.minecraft.client.Minecraft)(com.moon.ht.a)).K == null))) {
        break lexical_join_10;
    }
    return;
    }
    if (!((((com.moon.event.TickEvent)(p0)).getPhase() == com.moon.event.TickPhase.POST))) {
        break lexical_join_87;
    }
    spill79_0 = this.e;
    if (!((life4_5 == null))) {
        lexicalValue79_26_0 = spill79_0;
        break lexical_join_26;
    }
    if (!((spill79_0 != null))) {
        break lexical_join_87;
    }
    lexicalValue79_26_0 = ((java.util.function.Supplier)(((com.moon.bW)(((com.moon.bW)(((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(this.e)).i__kY())).getValue())))).a__Supplier())).get();
    }
    life5_38 = ((com.moon.jm)(lexicalValue79_26_0));
    ((java.util.Map)(this.c)).clear();
    ((java.util.List)(this.d)).clear();
    life6_46 = net.minecraft.potion.Potion.a;
    life7_49 = (life6_46).length;
    life8_51 = 0;
    lexical_cycle_41: while (true) {
    lexical_join_71: {
    lexical_join_70: {
    lexical_join_69: {
    if (!((life8_51 < life7_49))) {
        break lexical_join_73;
    }
    life9_58 = (life6_46)[life8_51];
    if (!((life4_5 == null))) {
        break lexical_join_80;
    }
    if (!((life4_5 == null))) {
        break lexical_join_71;
    }
    if (!((life9_58 != null))) {
        break lexical_join_70;
    }
    spill79_1 = ((net.minecraft.client.Minecraft)(com.moon.ht.a)).K;
    if (!((life4_5 == null))) {
        lexicalValue79_69_0 = spill79_1;
        break lexical_join_69;
    }
    if (!(((net.minecraft.client.entity.EntityPlayerSP)(spill79_1)).a__Boolean(((net.minecraft.potion.Potion)(life9_58))))) {
        break lexical_join_70;
    }
    lexicalValue79_69_0 = ((java.util.Map)(this.c)).put(((java.lang.Object)(life9_58)), ((java.lang.Object)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.ht.a)).K)).a(((net.minecraft.potion.Potion)(life9_58))))));
    }
    recovery.source.CarrierOps.discard(lexicalValue79_69_0);
    }
    life8_51 += 1;
    }
    if (!((life4_5 != null))) { continue lexical_cycle_41; }
    break lexical_cycle_41;
    }
    }
    ((java.util.List)(this.d)).addAll(((java.util.Collection)(((java.util.Map)(this.c)).keySet())));
    }
    ((java.util.List)(this.d)).sort(((java.util.Comparator)(java.util.Comparator.comparingDouble(((java.util.function.ToDoubleFunction)(__sourceIntrinsic_be06bc302d53_invokedynamic79_33(this, life5_38)))))));
    }
    return;
}


public void a__Void() {
com.moon.ht lexicalValue80_48_0;
    float lexicalValue80_69_0;
    com.moon.ht lexicalValue80_96_0;
    int lexicalValue80_270_0;
    int lexicalValue80_279_0;
    int lexicalValue80_306_0;
    java.lang.String[] spill80_0;
    boolean spill80_1;
    boolean spill80_2;
    com.moon.ht spill80_3;
    com.moon.ht spill80_4;
    boolean spill80_5;
    long life1_3;
    java.lang.String[] life3_7;
    moom.ir life4_36;
    float life5_86;
    java.util.Iterator life6_121;
    net.minecraft.potion.Potion life7_128;
    net.minecraft.potion.PotionEffect life8_134;
    java.lang.String life9_139;
    float life10_154;
    float life11_162;
    float life12_172;
    int life13_175;
    float life14_205;
    float life15_226;
    float life16_228;
    lexical_join_307: {
    lexical_join_306: {
    lexical_join_279: {
    lexical_join_270: {
    lexical_join_264: {
    lexical_join_262: {
    lexical_join_96: {
    lexical_join_95: {
    lexical_join_69: {
    lexical_join_68: {
    lexical_join_48: {
    lexical_join_47: {
    life1_3 = (com.moon.ht.g ^ 43129948819930L);
    spill80_0 = com.moon.hq.b__ArrayString();
    ((com.moon.ht)(this)).b();
    life3_7 = spill80_0;
    spill80_1 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.HUD)(this.e)).f__kV())).getValue())))).booleanValue();
    if (!((life3_7 == null))) {
        lexicalValue80_270_0 = ((spill80_1) ? 1 : 0);
        break lexical_join_270;
    }
    if (!((!spill80_1))) {
        break lexical_join_264;
    }
    spill80_2 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.HUD)(this.e)).e__kV())).getValue())))).booleanValue();
    if (!((life3_7 == null))) {
        lexicalValue80_270_0 = ((spill80_2) ? 1 : 0);
        break lexical_join_270;
    }
    if (!(spill80_2)) {
        break lexical_join_264;
    }
    life4_36 = com.moon.nS.a();
    ((moom.ir)(life4_36)).a(((float)((0x1.0p0f / ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.HUD)(this.e)).e__kZ())).getValue())))).floatValue()))));
    spill80_3 = this;
    if (!((life3_7 == null))) {
        lexicalValue80_48_0 = spill80_3;
        break lexical_join_48;
    }
    if (!((((com.moon.ht)(spill80_3)).f != null))) {
        break lexical_join_47;
    }
    ((com.moon.hY)(((com.moon.hW)(this.f)).a__hY())).g();
    }
    lexicalValue80_48_0 = this;
    }
    ((com.moon.ht)(lexicalValue80_48_0)).f = ((com.moon.hW)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.TEXTURE_COL))))).a__hX())).c())).a()));
    if (!((((((net.minecraft.client.Minecraft)(com.moon.ht.a)).P instanceof moom.gF) ? 1 : 0) != 0))) {
        break lexical_join_68;
    }
    lexicalValue80_69_0 = (0x1.ap3f / ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.HUD)(this.e)).e__kZ())).getValue())))).floatValue());
    break lexical_join_69;
    }
    lexicalValue80_69_0 = 0x0.0p0f;
    }
    life5_86 = lexicalValue80_69_0;
    spill80_4 = this;
    if (!((life3_7 == null))) {
        lexicalValue80_96_0 = spill80_4;
        break lexical_join_96;
    }
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.HUD)(((com.moon.ht)(spill80_4)).e)).j())).getValue())))).booleanValue())) {
        break lexical_join_95;
    }
    if (!((((((net.minecraft.client.Minecraft)(com.moon.ht.a)).P instanceof moom.gF) ? 1 : 0) == 0))) {
        break lexical_join_95;
    }
    life5_86 = (life5_86 + (((com.moon.ht)(this)).a(((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic80_49(32506, (8528334743394069396L ^ life1_3))))) + 0x1.0p1f));
    }
    lexicalValue80_96_0 = this;
    }
    life6_121 = ((java.util.List)(((com.moon.ht)(lexicalValue80_96_0)).d)).iterator();
    lexical_cycle_99: while (true) {
    lexical_join_260: {
    lexical_join_254: {
    if (!(((java.util.Iterator)(life6_121)).hasNext())) {
        break lexical_join_262;
    }
    life7_128 = ((net.minecraft.potion.Potion)(((java.util.Iterator)(life6_121)).next()));
    life8_134 = ((net.minecraft.potion.PotionEffect)(((java.util.Map)(this.c)).get(((java.lang.Object)(life7_128)))));
    life9_139 = ((com.moon.ht)(this)).a(((net.minecraft.potion.Potion)(life7_128)), ((net.minecraft.potion.PotionEffect)(life8_134)));
    life10_154 = ((((float) ((moom.ir)(life4_36)).a__Int()) - ((com.moon.ht)(this)).a(((java.lang.String)(life9_139)), ((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic80_61(32506, (8528334743394069396L ^ life1_3)))))) - 0x1.0p1f);
    life11_162 = ((com.moon.ht)(this)).a(((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic80_63(32506, (8528334743394069396L ^ life1_3)))));
    life12_172 = (((((float) ((moom.ir)(life4_36)).b__Int()) - life11_162) - 0x1.0p1f) - life5_86);
    life13_175 = ((net.minecraft.potion.Potion)(life7_128)).b();
    ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(com.moon.ht.a)).N)).a(((java.lang.String)(life9_139)), ((float)(life10_154)), ((float)(life12_172)), ((int)((((net.minecraft.potion.Potion)(life7_128)).c() | __sourceIntrinsic_b82a5b29b709_invokedynamic80_70(25833, (1442112918580408716L ^ life1_3))))));
    life14_205 = ((float) ((life13_175 % __sourceIntrinsic_b82a5b29b709_invokedynamic80_72(31426, (5153585657133903786L ^ life1_3))) * __sourceIntrinsic_b82a5b29b709_invokedynamic80_73(5527, (772661239909073139L ^ life1_3))));
    life15_226 = ((float) (__sourceIntrinsic_b82a5b29b709_invokedynamic80_74(26512, (6819833317353534207L ^ life1_3)) + ((life13_175 / __sourceIntrinsic_b82a5b29b709_invokedynamic80_75(31426, (5153585657133903786L ^ life1_3))) * __sourceIntrinsic_b82a5b29b709_invokedynamic80_76(5527, (772661239909073139L ^ life1_3)))));
    life16_228 = 0x1.6p3f;
    if (!((life3_7 == null))) {
        break lexical_join_260;
    }
    spill80_5 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.HUD)(this.e)).g__kV())).getValue())))).booleanValue();
    if (!((life3_7 == null))) {
        lexicalValue80_270_0 = ((spill80_5) ? 1 : 0);
        break lexical_join_270;
    }
    if (!(spill80_5)) {
        break lexical_join_254;
    }
    ((com.moon.hW)(this.f)).a(((com.moon.iX)(com.moon.i7.a(((float)(((life10_154 - life16_228) - 0x1.0p1f))), ((float)((life12_172 - 0x1.0p0f))), ((float)((life10_154 - 0x1.0p1f))), ((float)(((life12_172 - 0x1.0p0f) + life16_228))), ((float)((life14_205 * 0x1.0p-8f))), ((float)((life15_226 * 0x1.0p-8f))), ((float)(((life14_205 + 0x1.2p4f) * 0x1.0p-8f))), ((float)(((life15_226 + 0x1.2p4f) * 0x1.0p-8f))), ((int)(-1))))));
    }
    life5_86 = (life5_86 + (life11_162 + 0x1.0p1f));
    }
    if (!((life3_7 != null))) { continue lexical_cycle_99; }
    break lexical_cycle_99;
    }
    }
    ((moom.ir)(life4_36)).a__Void();
    }
    lexicalValue80_270_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.HUD)(this.e)).e__kV())).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life3_7 == null))) {
        lexicalValue80_279_0 = lexicalValue80_270_0;
        break lexical_join_279;
    }
    if (!((lexicalValue80_270_0 != 0))) {
        break lexical_join_307;
    }
    lexicalValue80_279_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.HUD)(this.e)).g__kV())).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life3_7 == null))) {
        lexicalValue80_306_0 = lexicalValue80_279_0;
        break lexical_join_306;
    }
    if (!((lexicalValue80_279_0 != 0))) {
        break lexical_join_307;
    }
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(com.moon.ht.a)).a__ok())).a__Void(((moom.DD)(this.b)));
    com.moon.hU.a(((float)(((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.HUD)(this.e)).e__kZ())).getValue())))).floatValue())), ((float)(((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.HUD)(this.e)).e__kZ())).getValue())))).floatValue())), ((float)(0x1.0p0f)));
    ((com.moon.hW)(this.f)).b();
    com.moon.hU.a__Void();
    lexicalValue80_306_0 = 0;
    }
    moom.kZ.i(((int)(lexicalValue80_306_0)));
    }
    return;
}


private float a(int p0) {
int forwardValue381_32_0;
    boolean spill381_0;
    long life2_3;
    java.lang.String[] life4_5;
    com.moon.jm life5_26;
    forward_join_32: {
    forward_join_29: {
    life2_3 = (com.moon.ht.g ^ 94701107834719L);
    life4_5 = com.moon.hq.b__ArrayString();
    spill381_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.HUD)(this.e)).f__kV())).getValue())))).booleanValue();
    if (!((life4_5 == null))) {
        forwardValue381_32_0 = ((spill381_0) ? 1 : 0);
        break forward_join_32;
    }
    if (!(spill381_0)) {
        break forward_join_29;
    }
    life5_26 = ((com.moon.jm)(((java.util.function.Supplier)(((com.moon.bW)(((com.moon.bW)(((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(this.e)).i__kY())).getValue())))).a__Supplier())).get()));
    return ((com.moon.jm)(life5_26)).a(((float)(((float) p0))));
    }
    forwardValue381_32_0 = ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(com.moon.ht.a)).N)).c;
    }
    return ((float) forwardValue381_32_0);
}


private float a(java.lang.String p0, int p1) {
int forwardValue383_34_0;
    boolean spill383_0;
    long life3_3;
    java.lang.String[] life5_5;
    com.moon.jm life6_26;
    forward_join_34: {
    forward_join_30: {
    life3_3 = (com.moon.ht.g ^ 69372149517155L);
    life5_5 = com.moon.hq.b__ArrayString();
    spill383_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.HUD)(this.e)).f__kV())).getValue())))).booleanValue();
    if (!((life5_5 == null))) {
        forwardValue383_34_0 = ((spill383_0) ? 1 : 0);
        break forward_join_34;
    }
    if (!(spill383_0)) {
        break forward_join_30;
    }
    life6_26 = ((com.moon.jm)(((java.util.function.Supplier)(((com.moon.bW)(((com.moon.bW)(((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(this.e)).i__kY())).getValue())))).a__Supplier())).get()));
    return ((com.moon.jm)(life6_26)).a(((java.lang.String)(p0)), ((float)(((float) p1))));
    }
    forwardValue383_34_0 = ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(com.moon.ht.a)).N)).a(((java.lang.String)(p0)));
    }
    return ((float) forwardValue383_34_0);
}


private java.lang.String a(net.minecraft.potion.Potion p0, net.minecraft.potion.PotionEffect p1) {
long local3_life2 = (com.moon.ht.g ^ 114192348430144L);
    java.lang.String __sourceSpill45_9 = net.minecraft.util.StatCollector.a(((java.lang.String)(((net.minecraft.potion.Potion)(p0)).a__String())));
    int __stackOp45_10_0 = (((net.minecraft.potion.PotionEffect)(p1)).c() + 1);
    java.lang.String __stackOp45_10_1 = net.minecraft.potion.Potion.a(((net.minecraft.potion.PotionEffect)(p1)));
    java.lang.String __stackOp45_10_2 = __sourceIntrinsic_c09003a9a6f6_originalDynamicSite45_8(32032, (2519052411568924224L ^ local3_life2));
    java.lang.String __sourceSpill45_12 = __stackOp45_10_2;
    int __sourceSpill45_13 = __stackOp45_10_0;
    java.lang.String __sourceSpill45_14 = __stackOp45_10_1;
    recovery.source.CarrierOps.discard(__stackOp45_10_2);
    java.lang.String __stackOp45_17_0 = __sourceSpill45_14;
    java.lang.String __stackOp45_17_1 = __sourceIntrinsic_c09003a9a6f6_originalDynamicSite45_16(8283, (3243579074330983224L ^ local3_life2));
    return __sourceIntrinsic_c09003a9a6f6_originalDynamicSite45_18(__sourceSpill45_9, __sourceSpill45_12, __sourceSpill45_13, __stackOp45_17_1, __stackOp45_17_0, ")");
}


public void a(com.moon.hW p0) {
return;
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
        byte[] spill558_0 = p0;
        life4_9 += 1;
        life5_44 = (spill558_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill558_1 = p0;
        life4_9 += 1;
        life5_76 = (spill558_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill558_2 = p0;
        life4_9 += 1;
        life5_91 = (spill558_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private double lambda$receiveTick$0(com.moon.jm p0, net.minecraft.potion.Potion p1) {
java.lang.Object local3 = ((net.minecraft.potion.PotionEffect)(((java.util.Map)(this.c)).get(((java.lang.Object)(p1)))));
    java.lang.Object local4 = ((com.moon.ht)(this)).a(((net.minecraft.potion.Potion)(p1)), ((net.minecraft.potion.PotionEffect)(local3)));
    return ((double) (-((com.moon.jm)(p0)).a(((java.lang.String)(local4)), ((float)(0x1.2p3f)))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_15af0baa2cc5912c_originalDynamicSite978_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral1513_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f0efb0c1e576_invokedynamic81_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f0efb0c1e576_invokedynamic81_75(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f0efb0c1e576_invokedynamic81_77(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f0efb0c1e576_invokedynamic81_78(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f0efb0c1e576_invokedynamic81_79(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f0efb0c1e576_invokedynamic81_80(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f0efb0c1e576_invokedynamic81_81(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1515_0() throws E;

private static native <E extends Throwable> java.util.function.ToDoubleFunction __sourceIntrinsic_be06bc302d53_invokedynamic79_33(com.moon.ht a0, com.moon.jm a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic80_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic80_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic80_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic80_70(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic80_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic80_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic80_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic80_75(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic80_76(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c09003a9a6f6_originalDynamicSite45_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c09003a9a6f6_originalDynamicSite45_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c09003a9a6f6_originalDynamicSite45_18(java.lang.String a0, java.lang.String a1, int a2, java.lang.String a3, java.lang.String a4, java.lang.String a5) throws E;
}
