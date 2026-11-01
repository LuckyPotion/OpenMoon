package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class g7 {

private static final net.minecraft.client.Minecraft a;

private final com.moon.module.impl.ESP b;

private final com.moon.iu c;

private com.moon.iu d;

private com.moon.iu e;

private int f;

private int g;

private com.moon.hW h;

private com.moon.hW i;

private com.moon.hW j;

private static final long k;

private static final long[] l;

private static final java.lang.Integer[] m;

private static final java.util.Map n;

public g7(com.moon.module.impl.ESP p0) {
super();
    this.c = new com.moon.iu(1, 1, false);
    this.d = new com.moon.iu(1, 1, false);
    this.e = new com.moon.iu(1, 1, false);
    this.b = p0;
}


static {
k = ((long)(((moom._a)(moom._c.a(((long)(6196651658930065140L)), ((long)(-1785621049336396652L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(57054189148281L)))));
    n = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.g7.k ^ 14189473207636L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill198_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill198_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill198_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill198_14 = new byte[8];
    (__sourceSpill198_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill198_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation198_16 = __sourceSpill198_14;
    ((javax.crypto.Cipher)(__sourceSpill198_11)).init(((int)(__sourceSpill198_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill198_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation198_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[8];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ÅMuôÎ\033`n\003?WÁÿÅ§@\030÷ÏÎ\025®W«fFs¶ØíkNjà\0025\036;aO{%"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill198_25 = local6_life21;
        int __sourceSpill198_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill198_25)).substring(((int)(__sourceSpill198_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill198_30 = local8_life19;
        int __sourceSpill198_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill198_33 = new byte[8];
        (__sourceSpill198_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill198_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill198_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill198_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill198_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill198_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill198_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill198_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill198_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill198_34)).doFinal(((byte[])(__sourceSpill198_33)));
        (__sourceSpill198_30)[__sourceSpill198_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "ÒV&MËrµÄ4yzÀæºò"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill198_38 = local6_life21;
        int __sourceSpill198_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill198_38)).substring(((int)(__sourceSpill198_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill198_43 = local8_life19;
        int __sourceSpill198_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill198_46 = new byte[8];
        (__sourceSpill198_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill198_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill198_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill198_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill198_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill198_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill198_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill198_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill198_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill198_47)).doFinal(((byte[])(__sourceSpill198_46)));
        (__sourceSpill198_43)[__sourceSpill198_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    l = ((long[])(local8_life19));
    m = ((java.lang.Integer[])(new java.lang.Integer[8]));
    a = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM()));
}


public int b() {
return this.g;
}


public com.moon.iu b__iu() {
return this.d;
}


public com.moon.hW b__hW() {
return this.i;
}


public void b(com.moon.iu p0) {
long life2_3;
    net.minecraft.entity.Entity[] life4_6;
    com.moon.iw life6_25;
    com.moon.iK life5_36;
    life2_3 = (com.moon.g7.k ^ 116889116791126L);
    net.minecraft.entity.Entity[] spill231_0 = moom.CA.b();
    moom.kZ.u();
    life4_6 = spill231_0;
    org.lwjgl.opengl.GL13.glActiveTexture(((int)(__sourceIntrinsic_52698f6522d0_invokedynamic231_3(6068, (6067401538426493754L ^ life2_3)))));
    ((com.moon.iu)(p0)).c();
    ((com.moon.iu)(this.d)).a(((boolean)(false)));
    ((com.moon.iu)(this.d)).e();
    life6_25 = ((com.moon.hW)(this.j)).a__iw();
    if ((life4_6 != null)) {
        if ((((life6_25 instanceof com.moon.iK) ? 1 : 0) != 0)) {
        life5_36 = ((com.moon.iK)(life6_25));
        ((com.moon.jD)(((com.moon.iK)(life5_36)).a__jD())).a__Void();
        ((com.moon.jE)(((com.moon.iK)(life5_36)).c())).a__Void(((int)(0)));
    }
        ((com.moon.hW)(this.j)).b();
    }
    return;
}


public com.moon.hW c() {
return this.j;
}


public void c(com.moon.iu p0) {
com.moon.iw lexicalValue44_57_0;
    com.moon.iu lexicalValue44_106_0;
    int lexicalValue44_121_0;
    int lexicalValue44_240_0;
    net.minecraft.entity.Entity[] spill44_0;
    com.moon.iw spill44_1;
    int spill44_2;
    int spill44_3;
    com.moon.iu spill44_4;
    int spill44_5;
    int spill44_6;
    int spill44_7;
    int spill44_8;
    int spill44_9;
    long life2_3;
    float life5_12;
    net.minecraft.entity.Entity[] life4_13;
    float life6_23;
    int life7_36;
    int life9_38;
    com.moon.iw life11_48;
    com.moon.iK life10_64;
    com.moon.iu life8_112;
    com.moon.iw life10_141;
    com.moon.iI life9_152;
    lexical_join_240: {
    lexical_join_214: {
    lexical_join_121: {
    lexical_join_120: {
    life2_3 = (com.moon.g7.k ^ 104124742331430L);
    spill44_0 = moom.CA.b();
    life5_12 = ((float) ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(((com.moon.module.impl.ESP)(this.b)).a__k1())).getValue())))).intValue());
    life4_13 = spill44_0;
    life6_23 = (((float) (((double) life5_12) - java.lang.Math.log(((double)(((double) life5_12)))))) / 0x1.99999ap0f);
    life7_36 = java.lang.Math.min(((int)(java.lang.Math.max(((int)(((int) java.lang.Math.ceil(((double)((java.lang.Math.log(((double)(((double) life5_12)))) / java.lang.Math.log(((double)(0x1.0p1d)))))))))), ((int)(1))))), ((int)(5)));
    life9_38 = life7_36;
    lexical_cycle_39: while (true) {
    lexical_join_106: {
    lexical_join_104: {
    lexical_join_57: {
    if (!((life9_38 >= 0))) {
        break lexical_join_120;
    }
    ((com.moon.iu)(this.e)).a(((boolean)(false)));
    life11_48 = ((com.moon.hW)(this.h)).a__iw();
    spill44_1 = life11_48;
    if (!((life4_13 != null))) {
        lexicalValue44_57_0 = spill44_1;
        break lexical_join_57;
    }
    spill44_2 = ((spill44_1 instanceof com.moon.iK) ? 1 : 0);
    if (!((life4_13 != null))) {
        lexicalValue44_121_0 = spill44_2;
        break lexical_join_121;
    }
    if (!((spill44_2 != 0))) {
        break lexical_join_104;
    }
    lexicalValue44_57_0 = life11_48;
    }
    life10_64 = ((com.moon.iK)(lexicalValue44_57_0));
    spill44_3 = 1642;
    ((com.moon.jD)(((com.moon.iK)(life10_64)).a__jD())).a__Void();
    org.lwjgl.opengl.GL13.glActiveTexture(((int)(__sourceIntrinsic_b083ce8177a1_invokedynamic44_21(spill44_3, (4981859567995352978L ^ life2_3)))));
    spill44_4 = this.d;
    if (!((life4_13 != null))) {
        lexicalValue44_106_0 = spill44_4;
        break lexical_join_106;
    }
    moom.kZ.i(((int)(((com.moon.iu)(spill44_4)).g)));
    ((com.moon.jE)(((com.moon.iK)(life10_64)).c())).a__Void(((int)(0)));
    ((com.moon.jE)(((com.moon.iK)(life10_64)).e())).a(((float)(life6_23)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    ((com.moon.jE)(((com.moon.iK)(life10_64)).g())).a(((float)(((float) ((net.minecraft.client.Minecraft)(com.moon.g7.a)).G))), ((float)(((float) ((net.minecraft.client.Minecraft)(com.moon.g7.a)).H))));
    life6_23 = (life6_23 / 0x1.0p1f);
    if (!((recovery.source.CarrierOps.fcmpg(((float)(life6_23)), ((float)(0x1.0p0f))) < 0))) {
        break lexical_join_104;
    }
    life6_23 = 0x1.0p0f;
    }
    lexicalValue44_106_0 = this.d;
    }
    life8_112 = lexicalValue44_106_0;
    this.d = ((com.moon.iu)(this.e));
    this.e = ((com.moon.iu)(life8_112));
    ((com.moon.hW)(this.h)).b();
    life9_38 += -1;
    if (!((life4_13 == null))) { continue lexical_cycle_39; }
    break lexical_cycle_39;
    }
    }
    lexicalValue44_121_0 = 1;
    }
    moom.kZ.a(((int)(lexicalValue44_121_0)), ((int)(0)), ((int)(1)), ((int)(0)));
    ((com.moon.iu)(this.c)).a(((boolean)(false)));
    ((com.moon.iu)(this.c)).e();
    life10_141 = ((com.moon.hW)(this.i)).a__iw();
    spill44_5 = ((life10_141 instanceof com.moon.iI) ? 1 : 0);
    if (!((life4_13 != null))) {
        lexicalValue44_240_0 = spill44_5;
        break lexical_join_240;
    }
    if (!((spill44_5 != 0))) {
        break lexical_join_214;
    }
    life9_152 = ((com.moon.iI)(life10_141));
    spill44_6 = 24606;
    ((com.moon.jD)(((com.moon.iI)(life9_152)).a__jD())).a__Void();
    org.lwjgl.opengl.GL13.glActiveTexture(((int)(__sourceIntrinsic_b083ce8177a1_invokedynamic44_54(spill44_6, (2983143904424923621L ^ life2_3)))));
    ((com.moon.jE)(((com.moon.iI)(life9_152)).d__sourceReturn_2220af9394())).a__Void(((int)(__sourceIntrinsic_b083ce8177a1_invokedynamic44_57(12864, (7266104875010147257L ^ life2_3)))));
    spill44_7 = 6068;
    moom.kZ.i(((int)(((com.moon.iu)(this.d)).g)));
    org.lwjgl.opengl.GL13.glActiveTexture(((int)(__sourceIntrinsic_b083ce8177a1_invokedynamic44_62(spill44_7, (6067344242758280778L ^ life2_3)))));
    ((com.moon.jE)(((com.moon.iI)(life9_152)).c())).a__Void(((int)(0)));
    moom.kZ.i(((int)(((com.moon.iu)(p0)).g)));
    ((com.moon.jE)(((com.moon.iI)(life9_152)).f())).a(((float)((0x1.0p0f / ((float) ((net.minecraft.client.Minecraft)(com.moon.g7.a)).G)))), ((float)((0x1.0p0f / ((float) ((net.minecraft.client.Minecraft)(com.moon.g7.a)).H)))));
    ((com.moon.jE)(((com.moon.iI)(life9_152)).h())).a(((float)(life5_12)));
    ((com.moon.jE)(((com.moon.iI)(life9_152)).e())).a(((float[])(((com.moon.setting.BezierSetting)(((com.moon.module.impl.ESP)(this.b)).a__kU())).getSamples())));
    ((com.moon.jE)(((com.moon.iI)(life9_152)).i())).a(((float)(0x0.0p0f)));
    ((com.moon.jE)(((com.moon.iI)(life9_152)).j())).a(((float)(0x1.0p0f)));
    ((com.moon.jE)(((com.moon.iI)(life9_152)).k())).a(((float)(0x1.0p0f)));
    }
    ((com.moon.hW)(this.i)).b();
    org.lwjgl.opengl.GL13.glActiveTexture(((int)(__sourceIntrinsic_b083ce8177a1_invokedynamic44_89(25663, (101165171112449475L ^ life2_3)))));
    spill44_8 = 6692;
    moom.kZ.i(((int)(0)));
    org.lwjgl.opengl.GL13.glActiveTexture(((int)(__sourceIntrinsic_b083ce8177a1_invokedynamic44_92(spill44_8, (595968738890705883L ^ life2_3)))));
    spill44_9 = 6068;
    moom.kZ.i(((int)(0)));
    org.lwjgl.opengl.GL13.glActiveTexture(((int)(__sourceIntrinsic_b083ce8177a1_invokedynamic44_95(spill44_9, (6067344242758280778L ^ life2_3)))));
    lexicalValue44_240_0 = 0;
    }
    moom.kZ.i(((int)(lexicalValue44_240_0)));
    return;
}


public com.moon.iu c__iu() {
return this.e;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.g7.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1209_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/g7"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 8396;
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
         Object[] var9 = (Object[])n.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               n.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/g7", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         m[var3] = var15;
      }

      return m[var3];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(com.moon.iu p0) {
com.moon.g7 forwardValue230_41_0;
    com.moon.hW forwardValue230_42_0;
    com.moon.hW forwardValue230_51_0;
    com.moon.hW forwardValue230_62_0;
    com.moon.g7 forwardValue230_84_0;
    com.moon.g7 forwardValue230_92_0;
    int forwardValue230_116_0;
    int forwardValue230_136_0;
    com.moon.g7 forwardValue230_149_0;
    net.minecraft.entity.Entity[] spill230_0;
    com.moon.g7 spill230_1;
    com.moon.g7 spill230_2;
    com.moon.hW spill230_3;
    com.moon.g7 spill230_4;
    com.moon.g7 spill230_5;
    boolean spill230_6;
    com.moon.g7 spill230_7;
    long life2_3;
    int life5_7;
    int life6_10;
    net.minecraft.entity.Entity[] life4_11;
    forward_join_149: {
    forward_join_145: {
    forward_join_136: {
    forward_join_127: {
    forward_join_116: {
    forward_join_109: {
    forward_join_92: {
    forward_join_91: {
    forward_join_84: {
    forward_join_67: {
    forward_join_62: {
    forward_join_58: {
    forward_join_51: {
    forward_join_49: {
    forward_join_42: {
    forward_join_41: {
    forward_join_34: {
    life2_3 = (com.moon.g7.k ^ 49388979750393L);
    spill230_0 = moom.CA.b();
    life5_7 = ((net.minecraft.client.Minecraft)(com.moon.g7.a)).G;
    life6_10 = ((net.minecraft.client.Minecraft)(com.moon.g7.a)).H;
    life4_11 = spill230_0;
    spill230_1 = this;
    if (!((life4_11 != null))) {
        forwardValue230_41_0 = spill230_1;
        break forward_join_41;
    }
    if (!((((com.moon.g7)(spill230_1)).f == life5_7))) {
        break forward_join_34;
    }
    spill230_2 = this;
    if (!((life4_11 != null))) {
        forwardValue230_41_0 = spill230_2;
        break forward_join_41;
    }
    if (!((((com.moon.g7)(spill230_2)).g == life6_10))) {
        break forward_join_34;
    }
    spill230_3 = this.h;
    if (!((life4_11 != null))) {
        forwardValue230_42_0 = spill230_3;
        break forward_join_42;
    }
    if (!((spill230_3 == null))) {
        break forward_join_34;
    }
    spill230_4 = this;
    if (!((life4_11 != null))) {
        forwardValue230_92_0 = spill230_4;
        break forward_join_92;
    }
    if (!((((com.moon.g7)(spill230_4)).i != null))) {
        break forward_join_91;
    }
    }
    this.f = ((int)(life5_7));
    this.g = ((int)(life6_10));
    forwardValue230_41_0 = this;
    }
    forwardValue230_42_0 = ((com.moon.g7)(forwardValue230_41_0)).h;
    }
    if (!((life4_11 != null))) {
        forwardValue230_51_0 = forwardValue230_42_0;
        break forward_join_51;
    }
    if (!((forwardValue230_42_0 != null))) {
        break forward_join_49;
    }
    ((com.moon.hY)(((com.moon.hW)(this.h)).a__hY())).g();
    }
    forwardValue230_51_0 = this.i;
    }
    if (!((life4_11 != null))) {
        forwardValue230_62_0 = forwardValue230_51_0;
        break forward_join_62;
    }
    if (!((forwardValue230_51_0 != null))) {
        break forward_join_58;
    }
    ((com.moon.hY)(((com.moon.hW)(this.i)).a__hY())).g();
    }
    spill230_5 = this;
    if (!((life4_11 != null))) {
        forwardValue230_84_0 = spill230_5;
        break forward_join_84;
    }
    forwardValue230_62_0 = ((com.moon.g7)(spill230_5)).j;
    }
    if (!((forwardValue230_62_0 != null))) {
        break forward_join_67;
    }
    ((com.moon.hY)(((com.moon.hW)(this.j)).a__hY())).g();
    }
    this.i = ((com.moon.hW)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ENTITY_OUTLINE))))).c())).a__hX())).a()));
    this.h = ((com.moon.hW)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.JUMP_FLOOD_OUTLINE))))).c())).a__hX())).a()));
    forwardValue230_84_0 = this;
    }
    ((com.moon.g7)(forwardValue230_84_0)).j = ((com.moon.hW)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.JUMP_FLOOD_OUTLINE_BASE))))).c())).a__hX())).a()));
    }
    forwardValue230_92_0 = this;
    }
    spill230_6 = ((com.moon.iu)(((com.moon.g7)(forwardValue230_92_0)).d)).a__Boolean(((int)(((net.minecraft.client.Minecraft)(com.moon.g7.a)).G)), ((int)(((net.minecraft.client.Minecraft)(com.moon.g7.a)).H)));
    if (!((life4_11 != null))) {
        forwardValue230_116_0 = ((spill230_6) ? 1 : 0);
        break forward_join_116;
    }
    if (!(spill230_6)) {
        break forward_join_109;
    }
    ((com.moon.iu)(this.d)).a(((int)(__sourceIntrinsic_645df3396178_invokedynamic230_53(19879, (5514428076196910466L ^ life2_3)))));
    }
    forwardValue230_116_0 = ((((com.moon.iu)(this.e)).a__Boolean(((int)(((net.minecraft.client.Minecraft)(com.moon.g7.a)).G)), ((int)(((net.minecraft.client.Minecraft)(com.moon.g7.a)).H)))) ? 1 : 0);
    }
    if (!((life4_11 != null))) {
        forwardValue230_136_0 = forwardValue230_116_0;
        break forward_join_136;
    }
    if (!((forwardValue230_116_0 != 0))) {
        break forward_join_127;
    }
    ((com.moon.iu)(this.e)).a(((int)(__sourceIntrinsic_645df3396178_invokedynamic230_63(12850, (2203948300369766928L ^ life2_3)))));
    }
    spill230_7 = this;
    if (!((life4_11 != null))) {
        forwardValue230_149_0 = spill230_7;
        break forward_join_149;
    }
    forwardValue230_136_0 = ((((com.moon.iu)(((com.moon.g7)(spill230_7)).c)).a__Boolean(((int)(((net.minecraft.client.Minecraft)(com.moon.g7.a)).G)), ((int)(((net.minecraft.client.Minecraft)(com.moon.g7.a)).H)))) ? 1 : 0);
    }
    if (!((forwardValue230_136_0 != 0))) {
        break forward_join_145;
    }
    ((com.moon.iu)(this.c)).a(((int)(__sourceIntrinsic_645df3396178_invokedynamic230_73(12850, (2203948300369766928L ^ life2_3)))));
    }
    this.b(((com.moon.iu)(p0)));
    forwardValue230_149_0 = this;
    }
    ((com.moon.g7)(forwardValue230_149_0)).c(((com.moon.iu)(p0)));
    return;
}


public com.moon.module.impl.ESP a__lV() {
return this.b;
}


public com.moon.iu a__iu() {
return this.c;
}


public int a() {
return this.f;
}


public com.moon.hW a__hW() {
return this.h;
}


private static native <E extends Throwable> int __sourceIntrinsic_645df3396178_invokedynamic230_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_645df3396178_invokedynamic230_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_645df3396178_invokedynamic230_73(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1209_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_52698f6522d0_invokedynamic231_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b083ce8177a1_invokedynamic44_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b083ce8177a1_invokedynamic44_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b083ce8177a1_invokedynamic44_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b083ce8177a1_invokedynamic44_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b083ce8177a1_invokedynamic44_89(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b083ce8177a1_invokedynamic44_92(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b083ce8177a1_invokedynamic44_95(int a0, long a1) throws E;
}
