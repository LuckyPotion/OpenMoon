package com.moon;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class gW extends com.moon.gU {

private static final int[] d;

private int e;

private float f;

private int g;

private int h;

private long i;

private boolean j;

private final net.minecraft.client.shader.Framebuffer k;

private java.util.function.Consumer<java.lang.Boolean> l;

private float m;

private static final long n;

private static final long[] o;

private static final java.lang.Integer[] p;

private static final java.util.Map q;

private static final long r;

public gW(net.minecraft.client.shader.Framebuffer p0, net.minecraft.client.shader.Framebuffer[] p1, int p2, int p3) {
super(p0, p1);
    this.i = java.lang.System.currentTimeMillis();
    this.k = new net.minecraft.client.shader.Framebuffer(1, 1, false);
    this.m = 0x1.0000000000000p+0f;
    this.e = p2;
    this.f = ((float) (p3));
}


static {
n = ((long)(((moom._a)(moom._c.a(((long)(6168657866870737760L)), ((long)(6601450697604804312L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(49707049352643L)))));
    long local16_life6 = (com.moon.gW.n ^ 130471754956977L);
    q = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local5_life9;
    javax.crypto.Cipher __sourceSpill113_11 = (local5_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill113_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill113_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill113_14 = new byte[8];
    (__sourceSpill113_14)[0] = ((byte) ((int) (local16_life6 >>> 56)));
    int local6_life15 = 1;
    while ((local6_life15 < 8)) {
        (__sourceSpill113_14)[local6_life15] = ((byte) ((int) ((local16_life6 << (local6_life15 * 8)) >>> 56)));
        local6_life15 += 1;
    }
    byte[] __sourcePreallocation113_16 = __sourceSpill113_14;
    ((javax.crypto.Cipher)(__sourceSpill113_11)).init(((int)(__sourceSpill113_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill113_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation113_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local11_life19 = new long[33];
    int local8_life20 = 0;
    java.lang.String local9_life21;
    int local10_life23 = ((java.lang.String)((local9_life21 = "ò\004Ù_vV8nhsy\021©\023±Ã ½Ä\036\005ÔúÂÂ¢¸ÜÌ:\016\fZ§Yü\001N\020\000ãj89e2Buñ\030\037+\000Æ\r«\003Û#äïAM\0028*\003BuíEæh\026 .ôè\002ÝÌèZS¢k+\016»ÖÃ`áVìË¾zwKê[F¥u4Z§Tµhl³1Ê¨\026É@\033X\030aV\006\033)ëV\017\016b{L×Í\005Mo]mó:4%h\0012 [ÆSÅx°P9ò¦\0375ëqÃ?&­MAôÔÜ%èR\002)\021&%Âð@éxM½\tØ:T\\\036ÞdÍIK>ø[2õèow\026çZf# "))).length();
    int local7_life24 = 0;
    do {
        java.lang.String __sourceSpill113_25 = local9_life21;
        int __sourceSpill113_26 = local7_life24;
        local7_life24 += 8;
        byte[] local12_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill113_25)).substring(((int)(__sourceSpill113_26)), ((int)(local7_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill113_30 = local11_life19;
        int __sourceSpill113_31 = local8_life20;
        local8_life20 += 1;
        long local13_life32 = (((((((((((long) (local12_life29)[0]) & 255L) << 56) | ((((long) (local12_life29)[1]) & 255L) << 48)) | ((((long) (local12_life29)[2]) & 255L) << 40)) | ((((long) (local12_life29)[3]) & 255L) << 32)) | ((((long) (local12_life29)[4]) & 255L) << 24)) | ((((long) (local12_life29)[5]) & 255L) << 16)) | ((((long) (local12_life29)[6]) & 255L) << 8)) | (((long) (local12_life29)[7]) & 255L));
        byte[] __sourceSpill113_33 = new byte[8];
        (__sourceSpill113_33)[0] = ((byte) ((int) (local13_life32 >>> 56)));
        (__sourceSpill113_33)[1] = ((byte) ((int) (local13_life32 >>> 48)));
        (__sourceSpill113_33)[2] = ((byte) ((int) (local13_life32 >>> 40)));
        (__sourceSpill113_33)[3] = ((byte) ((int) (local13_life32 >>> 32)));
        (__sourceSpill113_33)[4] = ((byte) ((int) (local13_life32 >>> 24)));
        (__sourceSpill113_33)[5] = ((byte) ((int) (local13_life32 >>> 16)));
        (__sourceSpill113_33)[6] = ((byte) ((int) (local13_life32 >>> 8)));
        (__sourceSpill113_33)[7] = ((byte) ((int) local13_life32));
        javax.crypto.Cipher __sourceSpill113_34 = local5_life9;
        byte[] local15_life36 = ((javax.crypto.Cipher)(__sourceSpill113_34)).doFinal(((byte[])(__sourceSpill113_33)));
        (__sourceSpill113_30)[__sourceSpill113_31] = (((((((((((long) (local15_life36)[0]) & 255L) << 56) | ((((long) (local15_life36)[1]) & 255L) << 48)) | ((((long) (local15_life36)[2]) & 255L) << 40)) | ((((long) (local15_life36)[3]) & 255L) << 32)) | ((((long) (local15_life36)[4]) & 255L) << 24)) | ((((long) (local15_life36)[5]) & 255L) << 16)) | ((((long) (local15_life36)[6]) & 255L) << 8)) | (((long) (local15_life36)[7]) & 255L));
    } while ((!(local7_life24 >= local10_life23)));
    local10_life23 = ((java.lang.String)((local9_life21 = "jß\bÑ¹Õ÷õ\001í\027\035û"))).length();
    local7_life24 = 0;
    do {
        java.lang.String __sourceSpill113_38 = local9_life21;
        int __sourceSpill113_39 = local7_life24;
        local7_life24 += 8;
        byte[] local12_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill113_38)).substring(((int)(__sourceSpill113_39)), ((int)(local7_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill113_43 = local11_life19;
        int __sourceSpill113_44 = local8_life20;
        local8_life20 += 1;
        long local13_life45 = (((((((((((long) (local12_life42)[0]) & 255L) << 56) | ((((long) (local12_life42)[1]) & 255L) << 48)) | ((((long) (local12_life42)[2]) & 255L) << 40)) | ((((long) (local12_life42)[3]) & 255L) << 32)) | ((((long) (local12_life42)[4]) & 255L) << 24)) | ((((long) (local12_life42)[5]) & 255L) << 16)) | ((((long) (local12_life42)[6]) & 255L) << 8)) | (((long) (local12_life42)[7]) & 255L));
        byte[] __sourceSpill113_46 = new byte[8];
        (__sourceSpill113_46)[0] = ((byte) ((int) (local13_life45 >>> 56)));
        (__sourceSpill113_46)[1] = ((byte) ((int) (local13_life45 >>> 48)));
        (__sourceSpill113_46)[2] = ((byte) ((int) (local13_life45 >>> 40)));
        (__sourceSpill113_46)[3] = ((byte) ((int) (local13_life45 >>> 32)));
        (__sourceSpill113_46)[4] = ((byte) ((int) (local13_life45 >>> 24)));
        (__sourceSpill113_46)[5] = ((byte) ((int) (local13_life45 >>> 16)));
        (__sourceSpill113_46)[6] = ((byte) ((int) (local13_life45 >>> 8)));
        (__sourceSpill113_46)[7] = ((byte) ((int) local13_life45));
        javax.crypto.Cipher __sourceSpill113_47 = local5_life9;
        byte[] local15_life49 = ((javax.crypto.Cipher)(__sourceSpill113_47)).doFinal(((byte[])(__sourceSpill113_46)));
        (__sourceSpill113_43)[__sourceSpill113_44] = (((((((((((long) (local15_life49)[0]) & 255L) << 56) | ((((long) (local15_life49)[1]) & 255L) << 48)) | ((((long) (local15_life49)[2]) & 255L) << 40)) | ((((long) (local15_life49)[3]) & 255L) << 32)) | ((((long) (local15_life49)[4]) & 255L) << 24)) | ((((long) (local15_life49)[5]) & 255L) << 16)) | ((((long) (local15_life49)[6]) & 255L) << 8)) | (((long) (local15_life49)[7]) & 255L));
    } while ((!(local7_life24 >= local10_life23)));
    o = ((long[])(local11_life19));
    p = ((java.lang.Integer[])(new java.lang.Integer[33]));
    javax.crypto.Cipher local0_life53;
    javax.crypto.Cipher __sourceSpill113_55 = (local0_life53 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill113_56 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill113_57 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill113_58 = new byte[8];
    (__sourceSpill113_58)[0] = ((byte) ((int) (local16_life6 >>> 56)));
    int local1_life59 = 1;
    while ((local1_life59 < 8)) {
        (__sourceSpill113_58)[local1_life59] = ((byte) ((int) ((local16_life6 << (local1_life59 * 8)) >>> 56)));
        local1_life59 += 1;
    }
    byte[] __sourcePreallocation113_60 = __sourceSpill113_58;
    ((javax.crypto.Cipher)(__sourceSpill113_55)).init(((int)(__sourceSpill113_56)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill113_57)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation113_60)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life63 = 3611002371209283909L;
    byte[] __sourceSpill113_64 = new byte[8];
    (__sourceSpill113_64)[0] = ((byte) ((int) (local2_life63 >>> 56)));
    (__sourceSpill113_64)[1] = ((byte) ((int) (local2_life63 >>> 48)));
    (__sourceSpill113_64)[2] = ((byte) ((int) (local2_life63 >>> 40)));
    (__sourceSpill113_64)[3] = ((byte) ((int) (local2_life63 >>> 32)));
    (__sourceSpill113_64)[4] = ((byte) ((int) (local2_life63 >>> 24)));
    (__sourceSpill113_64)[5] = ((byte) ((int) (local2_life63 >>> 16)));
    (__sourceSpill113_64)[6] = ((byte) ((int) (local2_life63 >>> 8)));
    (__sourceSpill113_64)[7] = ((byte) ((int) local2_life63));
    javax.crypto.Cipher __sourceSpill113_65 = local0_life53;
    byte[] local4_life67 = ((javax.crypto.Cipher)(__sourceSpill113_65)).doFinal(((byte[])(__sourceSpill113_64)));
    r = ((long)((((((((((((long) (local4_life67)[0]) & 255L) << 56) | ((((long) (local4_life67)[1]) & 255L) << 48)) | ((((long) (local4_life67)[2]) & 255L) << 40)) | ((((long) (local4_life67)[3]) & 255L) << 32)) | ((((long) (local4_life67)[4]) & 255L) << 24)) | ((((long) (local4_life67)[5]) & 255L) << 16)) | ((((long) (local4_life67)[6]) & 255L) << 8)) | (((long) (local4_life67)[7]) & 255L))));
    int[] __sourceSpill113_70 = new int[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite113_69(32254, (4203275912506513821L ^ local16_life6))];
    (__sourceSpill113_70)[0] = 2;
    (__sourceSpill113_70)[1] = 4;
    (__sourceSpill113_70)[2] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite113_71(28376, (6666255866523257532L ^ local16_life6));
    (__sourceSpill113_70)[3] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite113_72(12057, (4464310770462673763L ^ local16_life6));
    (__sourceSpill113_70)[4] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite113_73(31005, (6115288916727635323L ^ local16_life6));
    (__sourceSpill113_70)[5] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite113_74(15263, (1355760404276207594L ^ local16_life6));
    (__sourceSpill113_70)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite113_75(22958, (7977698880930627025L ^ local16_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite113_76(11118, (2786273078735490832L ^ local16_life6));
    (__sourceSpill113_70)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite113_77(16061, (8924337579575728842L ^ local16_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite113_78(23047, (6847838111272156790L ^ local16_life6));
    (__sourceSpill113_70)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite113_79(7904, (967475519876004495L ^ local16_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite113_80(22603, (2182979153808800800L ^ local16_life6));
    (__sourceSpill113_70)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite113_81(7441, (2420312492839237991L ^ local16_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite113_82(29418, (4606286951597446792L ^ local16_life6));
    (__sourceSpill113_70)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite113_83(21487, (1998498484620343174L ^ local16_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite113_84(23391, (7243565863367262003L ^ local16_life6));
    (__sourceSpill113_70)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite113_85(4176, (4580523957604611112L ^ local16_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite113_86(14744, (5150698603842199016L ^ local16_life6));
    d = ((int[])(__sourceSpill113_70));
}


private void b(int p0, net.minecraft.client.shader.Framebuffer p1, float p2) {
com.moon.jE forwardValue262_97_0;
    float forwardValue262_97_1;
    com.moon.jE forwardValue262_98_0;
    com.moon.jE forwardValue262_99_0;
    float forwardValue262_99_1;
    com.moon.jE forwardValue262_108_0;
    com.moon.jE forwardValue262_109_0;
    int forwardValue262_109_1;
    int forwardValue262_135_0;
    net.minecraft.entity.Entity[] spill262_0;
    int spill262_1;
    com.moon.jE spill262_2;
    float spill262_3;
    com.moon.jE spill262_4;
    com.moon.jE spill262_5;
    int spill262_6;
    int spill262_7;
    long life4_3;
    com.moon.hW life7_9;
    com.moon.iw life8_12;
    net.minecraft.entity.Entity[] life6_13;
    com.moon.iH life9_24;
    forward_join_135: {
    forward_join_110: {
    forward_join_109: {
    forward_join_108: {
    forward_join_99: {
    forward_join_98: {
    forward_join_97: {
    life4_3 = (com.moon.gW.n ^ 5427995348893L);
    spill262_0 = com.moon.gX.b();
    life7_9 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.SHADOW_UP))))).a();
    life8_12 = ((com.moon.hW)(life7_9)).a__iw();
    life6_13 = spill262_0;
    spill262_1 = ((life8_12 instanceof com.moon.iH) ? 1 : 0);
    if (!((life6_13 != null))) {
        forwardValue262_135_0 = spill262_1;
        break forward_join_135;
    }
    if (!((spill262_1 != 0))) {
        break forward_join_110;
    }
    life9_24 = ((com.moon.iH)(life8_12));
    ((com.moon.jD)(((com.moon.iH)(life9_24)).a__jD())).a__Void();
    ((net.minecraft.client.shader.Framebuffer)(p1)).a(((boolean)(true)));
    org.lwjgl.opengl.GL11.glClearColor(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    ((net.minecraft.client.shader.Framebuffer)(p1)).g();
    ((com.moon.jE)(((com.moon.iH)(life9_24)).g())).a__Void(((int)(__sourceIntrinsic_e5546304256f_invokedynamic262_15(25168, (4457341768518469906L ^ life4_3)))));
    org.lwjgl.opengl.GL13.glActiveTexture(((int)(__sourceIntrinsic_e5546304256f_invokedynamic262_17(7570, (718722363168126666L ^ life4_3)))));
    moom.kZ.i(((int)(((net.minecraft.client.shader.Framebuffer)(((com.moon.gW)(this)).b)).g)));
    ((com.moon.jE)(((com.moon.iH)(life9_24)).c())).a__Void(((int)(__sourceIntrinsic_e5546304256f_invokedynamic262_23(14273, (2417000343066303647L ^ life4_3)))));
    org.lwjgl.opengl.GL13.glActiveTexture(((int)(__sourceIntrinsic_e5546304256f_invokedynamic262_25(32342, (148083950474597633L ^ life4_3)))));
    moom.kZ.i(((int)(p0)));
    ((com.moon.jE)(((com.moon.iH)(life9_24)).e())).a(((float)((0x1.0p0f / ((float) ((net.minecraft.client.shader.Framebuffer)(p1)).c)))), ((float)((0x1.0p0f / ((float) ((net.minecraft.client.shader.Framebuffer)(p1)).d)))));
    spill262_2 = ((com.moon.iH)(life9_24)).d__sourceReturn_2220af9394();
    spill262_3 = p2;
    if (!((life6_13 != null))) {
        forwardValue262_97_0 = spill262_2;
        forwardValue262_97_1 = spill262_3;
        break forward_join_97;
    }
    ((com.moon.jE)(spill262_2)).a(((float)(spill262_3)), ((float)(p2)));
    spill262_4 = ((com.moon.iH)(life9_24)).f();
    if (!((p1 == this.k))) {
        forwardValue262_98_0 = spill262_4;
        break forward_join_98;
    }
    forwardValue262_97_0 = spill262_4;
    forwardValue262_97_1 = this.m;
    }
    forwardValue262_99_0 = forwardValue262_97_0;
    forwardValue262_99_1 = forwardValue262_97_1;
    break forward_join_99;
    }
    forwardValue262_99_0 = forwardValue262_98_0;
    forwardValue262_99_1 = 0x1.0p0f;
    }
    ((com.moon.jE)(forwardValue262_99_0)).a(((float)(forwardValue262_99_1)));
    spill262_5 = ((com.moon.iH)(life9_24)).h();
    if (!((p1 == this.k))) {
        forwardValue262_108_0 = spill262_5;
        break forward_join_108;
    }
    forwardValue262_109_0 = spill262_5;
    forwardValue262_109_1 = 1;
    break forward_join_109;
    }
    forwardValue262_109_0 = forwardValue262_108_0;
    forwardValue262_109_1 = 0;
    }
    ((com.moon.jE)(forwardValue262_109_0)).a(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue262_109_1))));
    }
    ((com.moon.hW)(life7_9)).b();
    org.lwjgl.opengl.GL13.glActiveTexture(((int)(__sourceIntrinsic_e5546304256f_invokedynamic262_42(13636, (2822964078014684693L ^ life4_3)))));
    spill262_6 = 8302;
    moom.kZ.i(((int)(0)));
    org.lwjgl.opengl.GL13.glActiveTexture(((int)(__sourceIntrinsic_e5546304256f_invokedynamic262_45(spill262_6, (3129151921331817263L ^ life4_3)))));
    spill262_7 = 14933;
    moom.kZ.i(((int)(0)));
    org.lwjgl.opengl.GL13.glActiveTexture(((int)(__sourceIntrinsic_e5546304256f_invokedynamic262_48(spill262_7, (6944513831281676549L ^ life4_3)))));
    forwardValue262_135_0 = 0;
    }
    moom.kZ.i(((int)(forwardValue262_135_0)));
    return;
}


public com.moon.gW b(float p0) {
this.m = ((float)(p0));
    return this;
}


public void c() {
this.j = ((boolean)(true));
    return;
}


public java.util.function.Consumer<java.lang.Boolean> a__Consumer() {
return this.l;
}


public float a() {
return this.m;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1257_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/gW"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.gW.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int n6 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x25E7;
        if (p[n6] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = o[n6];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])q.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    q.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/moon/gW", exception);
            }
            int n8 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            gW.p[n6] = n8;
        }
        return p[n6];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public com.moon.gW a(float p0) {
this.f = ((float)(p0));
    return this;
}


public com.moon.gW a(int p0) {
this.e = ((int)(p0));
    return this;
}


private void a(int p0, net.minecraft.client.shader.Framebuffer p1, float p2) {
int forwardValue260_90_0;
    net.minecraft.entity.Entity[] spill260_0;
    int spill260_1;
    int spill260_2;
    long life4_3;
    com.moon.hW life7_9;
    net.minecraft.entity.Entity[] life6_10;
    com.moon.iw life8_13;
    com.moon.iG life9_24;
    forward_join_90: {
    forward_join_73: {
    life4_3 = (com.moon.gW.n ^ 12412260603599L);
    spill260_0 = com.moon.gX.b();
    life7_9 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.SHADOW_DOWN))))).a();
    life6_10 = spill260_0;
    life8_13 = ((com.moon.hW)(life7_9)).a__iw();
    spill260_1 = ((life8_13 instanceof com.moon.iG) ? 1 : 0);
    if (!((life6_10 != null))) {
        forwardValue260_90_0 = spill260_1;
        break forward_join_90;
    }
    if (!((spill260_1 != 0))) {
        break forward_join_73;
    }
    life9_24 = ((com.moon.iG)(life8_13));
    ((com.moon.jD)(((com.moon.iG)(life9_24)).a__jD())).a__Void();
    ((net.minecraft.client.shader.Framebuffer)(p1)).a(((boolean)(true)));
    org.lwjgl.opengl.GL11.glClearColor(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    ((net.minecraft.client.shader.Framebuffer)(p1)).g();
    ((com.moon.jE)(((com.moon.iG)(life9_24)).c())).a__Void(((int)(__sourceIntrinsic_85c0a022aa6c_invokedynamic260_15(25597, (6420262674214834659L ^ life4_3)))));
    org.lwjgl.opengl.GL13.glActiveTexture(((int)(__sourceIntrinsic_85c0a022aa6c_invokedynamic260_17(8302, (3129144885767606909L ^ life4_3)))));
    moom.kZ.i(((int)(p0)));
    ((com.moon.jE)(((com.moon.iG)(life9_24)).e())).a(((float)((0x1.0p0f / ((float) ((net.minecraft.client.shader.Framebuffer)(p1)).c)))), ((float)((0x1.0p0f / ((float) ((net.minecraft.client.shader.Framebuffer)(p1)).d)))));
    ((com.moon.jE)(((com.moon.iG)(life9_24)).d__sourceReturn_2220af9394())).a(((float)(p2)), ((float)(p2)));
    ((com.moon.jE)(((com.moon.iG)(life9_24)).f())).a(((float)(0x1.0p0f)));
    }
    ((com.moon.hW)(life7_9)).b();
    org.lwjgl.opengl.GL13.glActiveTexture(((int)(__sourceIntrinsic_85c0a022aa6c_invokedynamic260_29(8302, (3129144885767606909L ^ life4_3)))));
    spill260_2 = 15660;
    moom.kZ.i(((int)(0)));
    org.lwjgl.opengl.GL13.glActiveTexture(((int)(__sourceIntrinsic_85c0a022aa6c_invokedynamic260_32(spill260_2, (3583788487037357877L ^ life4_3)))));
    forwardValue260_90_0 = 0;
    }
    moom.kZ.i(((int)(forwardValue260_90_0)));
    return;
}


public void a__Void() {
int lexicalValue50_18_0;
    int lexicalValue50_37_0;
    int lexicalValue50_55_0;
    int lexicalValue50_71_0;
    int lexicalValue50_81_0;
    net.minecraft.client.shader.Framebuffer lexicalValue50_134_0;
    java.util.function.Consumer lexicalValue50_152_0;
    int lexicalValue50_185_0;
    net.minecraft.client.gui.GuiScreen lexicalValue50_187_0;
    int lexicalValue50_200_0;
    com.moon.gW lexicalValue50_215_0;
    int lexicalValue50_215_1;
    com.moon.gW lexicalValue50_216_0;
    com.moon.gW lexicalValue50_221_0;
    int lexicalValue50_221_1;
    com.moon.gW lexicalValue50_252_0;
    int lexicalValue50_252_1;
    com.moon.gW lexicalValue50_258_0;
    int lexicalValue50_258_1;
    net.minecraft.client.shader.Framebuffer lexicalValue50_258_2;
    com.moon.gW lexicalValue50_266_0;
    int lexicalValue50_266_1;
    boolean spill50_0;
    net.minecraft.client.shader.Framebuffer spill50_1;
    boolean spill50_2;
    java.util.function.Consumer spill50_3;
    int spill50_4;
    net.minecraft.client.gui.GuiScreen spill50_5;
    com.moon.gW spill50_6;
    int spill50_7;
    com.moon.gW spill50_8;
    int spill50_9;
    int spill50_10;
    long spill50_11;
    int spill50_12;
    long spill50_13;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    int life4_108;
    int life5_117;
    net.minecraft.client.shader.Framebuffer life6_122;
    com.moon.ej life4_203;
    net.minecraft.client.gui.GuiScreen life7_206;
    com.moon.pj life5_217;
    com.moon.pk life6_236;
    int life4_248;
    int life4_292;
    moom.ir life4_330;
    double life5_334;
    double life7_340;
    double life9_342;
    double life11_344;
    double life13_346;
    double life15_348;
    double life17_350;
    double life19_352;
    net.minecraft.client.renderer.Tessellator life21_380;
    moom.lw life22_383;
    lexical_join_267: {
    lexical_join_266: {
    lexical_join_264: {
    lexical_join_233: {
    lexical_join_200: {
    lexical_join_196: {
    lexical_join_192: {
    lexical_join_187: {
    lexical_join_185: {
    lexical_join_178: {
    lexical_join_157: {
    lexical_join_152: {
    lexical_join_138: {
    lexical_join_81: {
    lexical_join_71: {
    lexical_join_68: {
    lexical_join_55: {
    lexical_join_49: {
    lexical_join_37: {
    lexical_join_30: {
    lexical_join_18: {
    lexical_join_11: {
    life1_3 = (com.moon.gW.n ^ 24874240558071L);
    life3_5 = com.moon.gX.b();
    spill50_0 = org.lwjgl.opengl.Display.isVisible();
    if (!((life3_5 != null))) {
        lexicalValue50_18_0 = ((spill50_0) ? 1 : 0);
        break lexical_join_18;
    }
    if (!((!spill50_0))) {
        break lexical_join_11;
    }
    return;
    }
    lexicalValue50_18_0 = ((((net.minecraft.client.shader.Framebuffer)(this.k)).a__Boolean(((int)(((net.minecraft.client.Minecraft)(com.moon.gW.a)).G)), ((int)(((net.minecraft.client.Minecraft)(com.moon.gW.a)).H)))) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        lexicalValue50_37_0 = lexicalValue50_18_0;
        break lexical_join_37;
    }
    if (!((lexicalValue50_18_0 != 0))) {
        break lexical_join_30;
    }
    ((net.minecraft.client.shader.Framebuffer)(this.k)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    ((com.moon.gW)(this)).c();
    }
    lexicalValue50_37_0 = ((((net.minecraft.client.shader.Framebuffer)(((com.moon.gW)(this)).b)).a__Boolean(((int)(((net.minecraft.client.Minecraft)(com.moon.gW.a)).G)), ((int)(((net.minecraft.client.Minecraft)(com.moon.gW.a)).H)))) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        lexicalValue50_55_0 = lexicalValue50_37_0;
        break lexical_join_55;
    }
    if (!((lexicalValue50_37_0 != 0))) {
        break lexical_join_49;
    }
    ((net.minecraft.client.shader.Framebuffer)(((com.moon.gW)(this)).b)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    ((com.moon.gW)(this)).c();
    }
    lexicalValue50_55_0 = recovery.source.CarrierOps.lcmp(((long)((java.lang.System.currentTimeMillis() - this.i))), ((long)(com.moon.gW.r)));
    }
    if (!((life3_5 != null))) {
        lexicalValue50_71_0 = lexicalValue50_55_0;
        break lexical_join_71;
    }
    if (!((lexicalValue50_55_0 >= 0))) {
        break lexical_join_68;
    }
    this.h = ((int)(this.g));
    this.g = ((int)(0));
    this.i = ((long)(java.lang.System.currentTimeMillis()));
    }
    moom.kZ.l();
    lexicalValue50_71_0 = ((this.j) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        lexicalValue50_81_0 = lexicalValue50_71_0;
        break lexical_join_81;
    }
    if (!((lexicalValue50_71_0 != 0))) {
        break lexical_join_267;
    }
    com.moon.gW __stackOp50_36_0 = this;
    ((com.moon.gW)(__stackOp50_36_0)).g = ((int)((((com.moon.gW)(__stackOp50_36_0)).g + 1)));
    lexicalValue50_81_0 = 0;
    }
    life4_108 = lexicalValue50_81_0;
    lexical_cycle_82: while (true) {
    lexical_join_134: {
    lexical_join_133: {
    if (!((life4_108 < (((com.moon.gW)(this)).c).length))) {
        break lexical_join_138;
    }
    life5_117 = (com.moon.gW.d)[life4_108];
    life6_122 = (((com.moon.gW)(this)).c)[life4_108];
    spill50_1 = life6_122;
    if (!((life3_5 != null))) {
        lexicalValue50_134_0 = spill50_1;
        break lexical_join_134;
    }
    spill50_2 = ((net.minecraft.client.shader.Framebuffer)(spill50_1)).a__Boolean(((int)((((net.minecraft.client.Minecraft)(com.moon.gW.a)).G / life5_117))), ((int)((((net.minecraft.client.Minecraft)(com.moon.gW.a)).H / life5_117))));
    if (!((life3_5 != null))) {
        lexicalValue50_200_0 = ((spill50_2) ? 1 : 0);
        break lexical_join_200;
    }
    if (!(spill50_2)) {
        break lexical_join_133;
    }
    ((net.minecraft.client.shader.Framebuffer)(life6_122)).c__Void();
    ((net.minecraft.client.shader.Framebuffer)(life6_122)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    ((net.minecraft.client.shader.Framebuffer)(life6_122)).a(((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic50_50(1735, (7185644551779197419L ^ life1_3)))));
    ((net.minecraft.client.shader.Framebuffer)(life6_122)).b(((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic50_52(26425, (7520880550050119706L ^ life1_3)))));
    }
    lexicalValue50_134_0 = life6_122;
    }
    ((net.minecraft.client.shader.Framebuffer)(lexicalValue50_134_0)).f();
    life4_108 += 1;
    if (!((life3_5 == null))) { continue lexical_cycle_82; }
    break lexical_cycle_82;
    }
    }
    ((net.minecraft.client.shader.Framebuffer)(((com.moon.gW)(this)).b)).f();
    ((net.minecraft.client.shader.Framebuffer)(((com.moon.gW)(this)).b)).a(((boolean)(true)));
    spill50_3 = this.l;
    if (!((life3_5 != null))) {
        lexicalValue50_152_0 = spill50_3;
        break lexical_join_152;
    }
    if (!((spill50_3 != null))) {
        break lexical_join_157;
    }
    lexicalValue50_152_0 = this.l;
    }
    ((java.util.function.Consumer)(lexicalValue50_152_0)).accept(((java.lang.Object)(java.lang.Boolean.valueOf(((boolean)(true))))));
    if (!((life3_5 == null))) {
        break lexical_join_196;
    }
    }
    life4_203 = new com.moon.ej(true);
    life7_206 = ((net.minecraft.client.Minecraft)(com.moon.gW.a)).P;
    spill50_4 = ((life7_206 instanceof com.moon.pj) ? 1 : 0);
    if (!((life3_5 != null))) {
        lexicalValue50_185_0 = spill50_4;
        break lexical_join_185;
    }
    if (!((spill50_4 != 0))) {
        break lexical_join_178;
    }
    life5_217 = ((com.moon.pj)(life7_206));
    ((com.moon.pj)(life5_217)).a(((com.moon.ej)(life4_203)));
    if (!((life3_5 == null))) {
        break lexical_join_192;
    }
    }
    life7_206 = ((net.minecraft.client.Minecraft)(com.moon.gW.a)).P;
    spill50_5 = life7_206;
    if (!((life3_5 != null))) {
        lexicalValue50_187_0 = spill50_5;
        break lexical_join_187;
    }
    lexicalValue50_185_0 = ((spill50_5 instanceof com.moon.pk) ? 1 : 0);
    }
    if (!((lexicalValue50_185_0 != 0))) {
        break lexical_join_192;
    }
    lexicalValue50_187_0 = life7_206;
    }
    life6_236 = ((com.moon.pk)(lexicalValue50_187_0));
    ((com.moon.pk)(life6_236)).a(((com.moon.ej)(life4_203)));
    }
    ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(life4_203)));
    }
    moom.kZ.b(((int)(1)), ((int)(0)));
    lexicalValue50_200_0 = 0;
    }
    life4_248 = lexicalValue50_200_0;
    lexical_cycle_201: while (true) {
    lexical_join_221: {
    lexical_join_216: {
    lexical_join_215: {
    if (!((life4_248 < this.e))) {
        break lexical_join_233;
    }
    spill50_6 = this;
    spill50_7 = life4_248;
    if (!((life3_5 != null))) {
        lexicalValue50_266_0 = spill50_6;
        lexicalValue50_266_1 = spill50_7;
        break lexical_join_266;
    }
    if (!((life3_5 != null))) {
        lexicalValue50_215_0 = spill50_6;
        lexicalValue50_215_1 = spill50_7;
        break lexical_join_215;
    }
    if (!((spill50_7 == 0))) {
        lexicalValue50_216_0 = spill50_6;
        break lexical_join_216;
    }
    lexicalValue50_215_0 = spill50_6;
    lexicalValue50_215_1 = ((net.minecraft.client.shader.Framebuffer)(((com.moon.gW)(this)).b)).g;
    }
    lexicalValue50_221_0 = lexicalValue50_215_0;
    lexicalValue50_221_1 = lexicalValue50_215_1;
    break lexical_join_221;
    }
    lexicalValue50_221_0 = lexicalValue50_216_0;
    lexicalValue50_221_1 = ((net.minecraft.client.shader.Framebuffer)((((com.moon.gW)(this)).c)[life4_248])).g;
    }
    ((com.moon.gW)(lexicalValue50_221_0)).a(((int)(lexicalValue50_221_1)), ((net.minecraft.client.shader.Framebuffer)((((com.moon.gW)(this)).c)[(life4_248 + 1)])), ((float)(this.f)));
    life4_248 += 1;
    if (!((life3_5 == null))) { continue lexical_cycle_201; }
    break lexical_cycle_201;
    }
    }
    life4_292 = this.e;
    lexical_cycle_236: while (true) {
    lexical_join_258: {
    lexical_join_252: {
    if (!((life4_292 > 0))) {
        break lexical_join_264;
    }
    spill50_8 = this;
    spill50_9 = ((net.minecraft.client.shader.Framebuffer)((((com.moon.gW)(this)).c)[life4_292])).g;
    if (!((life3_5 != null))) {
        lexicalValue50_266_0 = spill50_8;
        lexicalValue50_266_1 = spill50_9;
        break lexical_join_266;
    }
    if (!((life4_292 == 1))) {
        lexicalValue50_252_0 = spill50_8;
        lexicalValue50_252_1 = spill50_9;
        break lexical_join_252;
    }
    lexicalValue50_258_0 = spill50_8;
    lexicalValue50_258_1 = spill50_9;
    lexicalValue50_258_2 = this.k;
    break lexical_join_258;
    }
    lexicalValue50_258_0 = lexicalValue50_252_0;
    lexicalValue50_258_1 = lexicalValue50_252_1;
    lexicalValue50_258_2 = (((com.moon.gW)(this)).c)[(life4_292 - 1)];
    }
    ((com.moon.gW)(lexicalValue50_258_0)).b(((int)(lexicalValue50_258_1)), ((net.minecraft.client.shader.Framebuffer)(lexicalValue50_258_2)), ((float)(this.f)));
    life4_292 += -1;
    if (!((life3_5 == null))) { continue lexical_cycle_236; }
    break lexical_cycle_236;
    }
    }
    lexicalValue50_266_0 = this;
    lexicalValue50_266_1 = 0;
    }
    ((com.moon.gW)(lexicalValue50_266_0)).j = ((boolean)__sourceIntrinsic_integerToBoolean((lexicalValue50_266_1)));
    }
    life4_330 = com.moon.nS.a();
    spill50_10 = 1707;
    life5_334 = ((moom.ir)(life4_330)).a();
    spill50_11 = (5989250124135375244L ^ life1_3);
    life7_340 = ((moom.ir)(life4_330)).b();
    life9_342 = 0x0.0p0d;
    life11_344 = 0x0.0p0d;
    life13_346 = 0x0.0p0d;
    life15_348 = 0x1.0p0d;
    life17_350 = 0x1.0p0d;
    life19_352 = 0x0.0p0d;
    moom.kZ.l();
    moom.kZ.d__Void();
    moom.kZ.u();
    moom.kZ.a(((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic50_99(spill50_10, spill50_11))), ((float)(0x0.0p0f)));
    moom.kZ.a(((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic50_101(24984, (7929982551183115949L ^ life1_3)))), ((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic50_102(1063, (4004132739228017432L ^ life1_3)))), ((int)(1)), ((int)(0)));
    ((net.minecraft.client.shader.Framebuffer)(this.k)).c__Void();
    ((net.minecraft.client.shader.Framebuffer)(((net.minecraft.client.Minecraft)(com.moon.gW.a)).a__pA())).a(((boolean)(true)));
    life21_380 = net.minecraft.client.renderer.Tessellator.a();
    life22_383 = ((net.minecraft.client.renderer.Tessellator)(life21_380)).a__lw();
    ((moom.lw)(life22_383)).a(((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic50_111(9768, (3910262670811463998L ^ life1_3)))), ((moom.oD)(moom.oB.i)));
    spill50_12 = 31192;
    ((moom.lw)(((moom.lw)(((moom.lw)(life22_383)).a(((double)(life9_342)), ((double)((life11_344 + life7_340))), ((double)(0x0.0p0d))))).a(((double)(life13_346)), ((double)(life19_352))))).c__Void();
    spill50_13 = (1801991707168202486L ^ life1_3);
    ((moom.lw)(((moom.lw)(((moom.lw)(life22_383)).a(((double)((life9_342 + life5_334))), ((double)((life11_344 + life7_340))), ((double)(0x0.0p0d))))).a(((double)(life15_348)), ((double)(life19_352))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(life22_383)).a(((double)((life9_342 + life5_334))), ((double)(life11_344)), ((double)(0x0.0p0d))))).a(((double)(life15_348)), ((double)(life17_350))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(life22_383)).a(((double)(life9_342)), ((double)(life11_344)), ((double)(0x0.0p0d))))).a(((double)(life13_346)), ((double)(life17_350))))).c__Void();
    ((net.minecraft.client.renderer.Tessellator)(life21_380)).a__Void();
    moom.kZ.i(((int)(0)));
    moom.kZ.a(((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic50_128(spill50_12, spill50_13))), ((float)(0x1.99999ap-4f)));
    return;
}


public int a__Int() {
return this.h;
}


public boolean a__Boolean() {
return ((((this.j) ? 1 : 0)) != 0);
}


public com.moon.gW a(java.util.function.Consumer<java.lang.Boolean> p0) {
this.l = ((java.util.function.Consumer)(p0));
    return this;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite113_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite113_71(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite113_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite113_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite113_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite113_75(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite113_76(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite113_77(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite113_78(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite113_79(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite113_80(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite113_81(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite113_82(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite113_83(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite113_84(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite113_85(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite113_86(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_85c0a022aa6c_invokedynamic260_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_85c0a022aa6c_invokedynamic260_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_85c0a022aa6c_invokedynamic260_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_85c0a022aa6c_invokedynamic260_32(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1257_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic50_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic50_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic50_99(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic50_101(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic50_102(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic50_111(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic50_128(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e5546304256f_invokedynamic262_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e5546304256f_invokedynamic262_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e5546304256f_invokedynamic262_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e5546304256f_invokedynamic262_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e5546304256f_invokedynamic262_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e5546304256f_invokedynamic262_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e5546304256f_invokedynamic262_48(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
