package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class fh extends com.moon.e2<com.moon.module.impl.Tickbase> {

private net.minecraft.entity.Entity e;

private long f;

private long g;

private double h;

private boolean i;

private int j;

private int k;

private final com.moon.nW l;

private static final long m;

private static final long[] n;

private static final java.lang.Integer[] o;

private static final java.util.Map q;

private static final long[] r;

private static final java.lang.Long[] s;

private static final java.util.Map t;

public fh() {
super(com.moon.module.impl.Tickbase.class);
    this.k = 0;
    this.l = new com.moon.nW();
}


static {
m = ((long)(((moom._a)(moom._c.a(((long)(4556576557947331005L)), ((long)(-6920960411959418531L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(74209471775856L)))));
    q = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (com.moon.fh.m ^ 92229810134430L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill97_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill97_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill97_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill97_14 = new byte[8];
    (__sourceSpill97_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill97_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation97_16 = __sourceSpill97_14;
    ((javax.crypto.Cipher)(__sourceSpill97_11)).init(((int)(__sourceSpill97_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill97_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation97_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local19_life19 = new long[3];
    int local16_life20 = 0;
    java.lang.String local17_life21;
    int local18_life23 = ((java.lang.String)((local17_life21 = "áõ \001`³¬r~£ÌÃê\021¸ôñ:0"))).length();
    int local15_life24 = 0;
    do {
        java.lang.String __sourceSpill97_25 = local17_life21;
        int __sourceSpill97_26 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill97_25)).substring(((int)(__sourceSpill97_26)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill97_30 = local19_life19;
        int __sourceSpill97_31 = local16_life20;
        local16_life20 += 1;
        long local21_life32 = (((((((((((long) (local20_life29)[0]) & 255L) << 56) | ((((long) (local20_life29)[1]) & 255L) << 48)) | ((((long) (local20_life29)[2]) & 255L) << 40)) | ((((long) (local20_life29)[3]) & 255L) << 32)) | ((((long) (local20_life29)[4]) & 255L) << 24)) | ((((long) (local20_life29)[5]) & 255L) << 16)) | ((((long) (local20_life29)[6]) & 255L) << 8)) | (((long) (local20_life29)[7]) & 255L));
        byte[] __sourceSpill97_33 = new byte[8];
        (__sourceSpill97_33)[0] = ((byte) ((int) (local21_life32 >>> 56)));
        (__sourceSpill97_33)[1] = ((byte) ((int) (local21_life32 >>> 48)));
        (__sourceSpill97_33)[2] = ((byte) ((int) (local21_life32 >>> 40)));
        (__sourceSpill97_33)[3] = ((byte) ((int) (local21_life32 >>> 32)));
        (__sourceSpill97_33)[4] = ((byte) ((int) (local21_life32 >>> 24)));
        (__sourceSpill97_33)[5] = ((byte) ((int) (local21_life32 >>> 16)));
        (__sourceSpill97_33)[6] = ((byte) ((int) (local21_life32 >>> 8)));
        (__sourceSpill97_33)[7] = ((byte) ((int) local21_life32));
        javax.crypto.Cipher __sourceSpill97_34 = local13_life9;
        byte[] local23_life36 = ((javax.crypto.Cipher)(__sourceSpill97_34)).doFinal(((byte[])(__sourceSpill97_33)));
        (__sourceSpill97_30)[__sourceSpill97_31] = (((((((((((long) (local23_life36)[0]) & 255L) << 56) | ((((long) (local23_life36)[1]) & 255L) << 48)) | ((((long) (local23_life36)[2]) & 255L) << 40)) | ((((long) (local23_life36)[3]) & 255L) << 32)) | ((((long) (local23_life36)[4]) & 255L) << 24)) | ((((long) (local23_life36)[5]) & 255L) << 16)) | ((((long) (local23_life36)[6]) & 255L) << 8)) | (((long) (local23_life36)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    n = ((long[])(local19_life19));
    o = ((java.lang.Integer[])(new java.lang.Integer[3]));
    t = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life41;
    javax.crypto.Cipher __sourceSpill97_43 = (local0_life41 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill97_44 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill97_45 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill97_46 = new byte[8];
    (__sourceSpill97_46)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life47 = 1;
    while ((local1_life47 < 8)) {
        (__sourceSpill97_46)[local1_life47] = ((byte) ((int) ((local11_life7 << (local1_life47 * 8)) >>> 56)));
        local1_life47 += 1;
    }
    byte[] __sourcePreallocation97_48 = __sourceSpill97_46;
    ((javax.crypto.Cipher)(__sourceSpill97_43)).init(((int)(__sourceSpill97_44)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill97_45)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation97_48)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life51 = new long[4];
    int local3_life52 = 0;
    java.lang.String local4_life53;
    int local5_life55 = ((java.lang.String)((local4_life53 = "©±\177sÀµã£ll\"ápÇ."))).length();
    int local2_life56 = 0;
    do {
        java.lang.String __sourceSpill97_57 = local4_life53;
        int __sourceSpill97_58 = local2_life56;
        local2_life56 += 8;
        byte[] local7_life61 = ((java.lang.String)(((java.lang.String)(__sourceSpill97_57)).substring(((int)(__sourceSpill97_58)), ((int)(local2_life56))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill97_62 = local6_life51;
        int __sourceSpill97_63 = local3_life52;
        local3_life52 += 1;
        long local8_life64 = (((((((((((long) (local7_life61)[0]) & 255L) << 56) | ((((long) (local7_life61)[1]) & 255L) << 48)) | ((((long) (local7_life61)[2]) & 255L) << 40)) | ((((long) (local7_life61)[3]) & 255L) << 32)) | ((((long) (local7_life61)[4]) & 255L) << 24)) | ((((long) (local7_life61)[5]) & 255L) << 16)) | ((((long) (local7_life61)[6]) & 255L) << 8)) | (((long) (local7_life61)[7]) & 255L));
        byte[] __sourceSpill97_65 = new byte[8];
        (__sourceSpill97_65)[0] = ((byte) ((int) (local8_life64 >>> 56)));
        (__sourceSpill97_65)[1] = ((byte) ((int) (local8_life64 >>> 48)));
        (__sourceSpill97_65)[2] = ((byte) ((int) (local8_life64 >>> 40)));
        (__sourceSpill97_65)[3] = ((byte) ((int) (local8_life64 >>> 32)));
        (__sourceSpill97_65)[4] = ((byte) ((int) (local8_life64 >>> 24)));
        (__sourceSpill97_65)[5] = ((byte) ((int) (local8_life64 >>> 16)));
        (__sourceSpill97_65)[6] = ((byte) ((int) (local8_life64 >>> 8)));
        (__sourceSpill97_65)[7] = ((byte) ((int) local8_life64));
        javax.crypto.Cipher __sourceSpill97_66 = local0_life41;
        byte[] local10_life68 = ((javax.crypto.Cipher)(__sourceSpill97_66)).doFinal(((byte[])(__sourceSpill97_65)));
        (__sourceSpill97_62)[__sourceSpill97_63] = (((((((((((long) (local10_life68)[0]) & 255L) << 56) | ((((long) (local10_life68)[1]) & 255L) << 48)) | ((((long) (local10_life68)[2]) & 255L) << 40)) | ((((long) (local10_life68)[3]) & 255L) << 32)) | ((((long) (local10_life68)[4]) & 255L) << 24)) | ((((long) (local10_life68)[5]) & 255L) << 16)) | ((((long) (local10_life68)[6]) & 255L) << 8)) | (((long) (local10_life68)[7]) & 255L));
    } while ((!(local2_life56 >= local5_life55)));
    local5_life55 = ((java.lang.String)((local4_life53 = "'äÐ\013n¡àã \002T\024ß"))).length();
    local2_life56 = 0;
    do {
        java.lang.String __sourceSpill97_70 = local4_life53;
        int __sourceSpill97_71 = local2_life56;
        local2_life56 += 8;
        byte[] local7_life74 = ((java.lang.String)(((java.lang.String)(__sourceSpill97_70)).substring(((int)(__sourceSpill97_71)), ((int)(local2_life56))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill97_75 = local6_life51;
        int __sourceSpill97_76 = local3_life52;
        local3_life52 += 1;
        long local8_life77 = (((((((((((long) (local7_life74)[0]) & 255L) << 56) | ((((long) (local7_life74)[1]) & 255L) << 48)) | ((((long) (local7_life74)[2]) & 255L) << 40)) | ((((long) (local7_life74)[3]) & 255L) << 32)) | ((((long) (local7_life74)[4]) & 255L) << 24)) | ((((long) (local7_life74)[5]) & 255L) << 16)) | ((((long) (local7_life74)[6]) & 255L) << 8)) | (((long) (local7_life74)[7]) & 255L));
        byte[] __sourceSpill97_78 = new byte[8];
        (__sourceSpill97_78)[0] = ((byte) ((int) (local8_life77 >>> 56)));
        (__sourceSpill97_78)[1] = ((byte) ((int) (local8_life77 >>> 48)));
        (__sourceSpill97_78)[2] = ((byte) ((int) (local8_life77 >>> 40)));
        (__sourceSpill97_78)[3] = ((byte) ((int) (local8_life77 >>> 32)));
        (__sourceSpill97_78)[4] = ((byte) ((int) (local8_life77 >>> 24)));
        (__sourceSpill97_78)[5] = ((byte) ((int) (local8_life77 >>> 16)));
        (__sourceSpill97_78)[6] = ((byte) ((int) (local8_life77 >>> 8)));
        (__sourceSpill97_78)[7] = ((byte) ((int) local8_life77));
        javax.crypto.Cipher __sourceSpill97_79 = local0_life41;
        byte[] local10_life81 = ((javax.crypto.Cipher)(__sourceSpill97_79)).doFinal(((byte[])(__sourceSpill97_78)));
        (__sourceSpill97_75)[__sourceSpill97_76] = (((((((((((long) (local10_life81)[0]) & 255L) << 56) | ((((long) (local10_life81)[1]) & 255L) << 48)) | ((((long) (local10_life81)[2]) & 255L) << 40)) | ((((long) (local10_life81)[3]) & 255L) << 32)) | ((((long) (local10_life81)[4]) & 255L) << 24)) | ((((long) (local10_life81)[5]) & 255L) << 16)) | ((((long) (local10_life81)[6]) & 255L) << 8)) | (((long) (local10_life81)[7]) & 255L));
    } while ((!(local2_life56 >= local5_life55)));
    r = ((long[])(local6_life51));
    s = ((java.lang.Long[])(new java.lang.Long[4]));
}


public void b() {
this.f = ((long)(0L));
    this.g = ((long)(0L));
    return;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1123_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/fh"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static long b(int p0, long p1) {
int life3_8;
    byte[] life4_77;
    long life5_81;
    byte[] life7_146;
    java.lang.Long life8_150;
    java.lang.Object[] life9_155;
    javax.crypto.spec.DESKeySpec life11_188;
    javax.crypto.SecretKey life12_195;
    javax.crypto.Cipher life13_200;
    byte[] life10_212;
    long life11_290;
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 10909);
    if (((com.moon.fh.s)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (com.moon.fh.r)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(com.moon.fh.t)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.fh.t)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("com/moon/fh", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (com.moon.fh.s)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((com.moon.fh.s)[life3_8])).longValue();
}


private static long b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = com.moon.fh.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void c() {
net.minecraft.client.Minecraft forwardValue168_13_0;
    net.minecraft.client.Minecraft spill168_0;
    long life1_3;
    java.lang.String life3_5;
    forward_join_13: {
    forward_join_12: {
    life1_3 = (com.moon.fh.m ^ 31883298737354L);
    life3_5 = net.minecraft.init.Blocks.b();
    spill168_0 = com.moon.fh.a;
    if (!((life3_5 != null))) {
        forwardValue168_13_0 = spill168_0;
        break forward_join_13;
    }
    if (!((((net.minecraft.client.Minecraft)(spill168_0)).K == null))) {
        break forward_join_12;
    }
    return;
    }
    forwardValue168_13_0 = com.moon.fh.a;
    }
    ((moom.DM)(((net.minecraft.client.Minecraft)(forwardValue168_13_0)).l)).c = ((float)(0x1.0p0f));
    return;
}


public void a(com.moon.eH p0) {
net.minecraft.entity.Entity lexicalValue32_24_0;
    net.minecraft.util.MovingObjectPosition lexicalValue32_74_0;
    net.minecraft.entity.Entity lexicalValue32_80_0;
    int lexicalValue32_94_0;
    net.minecraft.util.MovingObjectPosition lexicalValue32_96_0;
    int lexicalValue32_286_0;
    int lexicalValue32_294_0;
    int lexicalValue32_344_0;
    int lexicalValue32_351_0;
    com.moon.fh lexicalValue32_362_0;
    net.minecraft.client.entity.EntityPlayerSP spill32_0;
    net.minecraft.util.MovingObjectPosition spill32_1;
    net.minecraft.entity.Entity spill32_2;
    int spill32_3;
    net.minecraft.util.MovingObjectPosition spill32_4;
    int spill32_5;
    boolean spill32_6;
    boolean spill32_7;
    boolean spill32_8;
    int spill32_9;
    com.moon.fh spill32_10;
    long life2_3;
    java.lang.String life4_5;
    com.moon.eA life5_57;
    com.moon.n4 life6_69;
    moom.DR life7_74;
    net.minecraft.util.MovingObjectPosition life8_82;
    double life9_131;
    int life11_179;
    int life12_184;
    com.moon.n7 life13_201;
    moom.DR life14_207;
    float life15_211;
    float life16_215;
    float life17_219;
    moom.DR life18_223;
    moom.CA life19_258;
    moom.DR life20_267;
    moom.DR life21_274;
    moom.DR life22_289;
    net.minecraft.util.MovingObjectPosition life23_294;
    double life24_313;
    lexical_join_370: {
    lexical_join_362: {
    lexical_join_351: {
    lexical_join_344: {
    lexical_join_342: {
    lexical_join_294: {
    lexical_join_292: {
    lexical_join_286: {
    lexical_join_284: {
    lexical_join_282: {
    lexical_join_278: {
    lexical_join_96: {
    lexical_join_94: {
    lexical_join_80: {
    lexical_join_74: {
    lexical_join_34: {
    lexical_join_26: {
    lexical_join_24: {
    lexical_join_22: {
    lexical_join_21: {
    lexical_join_18: {
    life2_3 = (com.moon.fh.m ^ 99032456337599L);
    life4_5 = net.minecraft.init.Blocks.b();
    if (!((life4_5 != null))) {
        break lexical_join_21;
    }
    if (!((((net.minecraft.client.Minecraft)(com.moon.fh.a)).K != null))) {
        break lexical_join_18;
    }
    spill32_0 = ((net.minecraft.client.Minecraft)(com.moon.fh.a)).K;
    if (!((life4_5 != null))) {
        lexicalValue32_24_0 = spill32_0;
        break lexical_join_24;
    }
    if (!((((net.minecraft.client.entity.EntityPlayerSP)(spill32_0)).S <= 1))) {
        break lexical_join_22;
    }
    }
    this.f = ((long)(0L));
    }
    return;
    }
    lexicalValue32_24_0 = this.e;
    }
    if (!((lexicalValue32_24_0 == null))) {
        break lexical_join_26;
    }
    return;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(((double) ((moom.DM)(((net.minecraft.client.Minecraft)(com.moon.fh.a)).l)).c))), ((double)(0x1.0p0d))) != 0))) {
        break lexical_join_34;
    }
    return;
    }
    life5_57 = new com.moon.eA(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fh.a)).K)).cw, ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fh.a)).K)).cx);
    ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(life5_57)));
    life6_69 = new com.moon.n4(((com.moon.eA)(life5_57)).a(), ((com.moon.eA)(life5_57)).b__sourceReturn_bc607678b6());
    life7_74 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fh.a)).K)).b(((float)(0x1.0p0f)));
    life8_82 = com.moon.nQ.a(((float)(((com.moon.n4)(life6_69)).a__Float())), ((float)(((com.moon.n4)(life6_69)).b__Float())), ((float)(0x1.4p4f)), ((float)(0x1.0p0f)));
    spill32_1 = life8_82;
    if (!((life4_5 != null))) {
        lexicalValue32_74_0 = spill32_1;
        break lexical_join_74;
    }
    if (!((spill32_1 != null))) {
        break lexical_join_370;
    }
    lexicalValue32_74_0 = life8_82;
    }
    spill32_2 = ((net.minecraft.util.MovingObjectPosition)(lexicalValue32_74_0)).e;
    if (!((life4_5 != null))) {
        lexicalValue32_80_0 = spill32_2;
        break lexical_join_80;
    }
    if (!((spill32_2 != null))) {
        break lexical_join_370;
    }
    lexicalValue32_80_0 = ((net.minecraft.util.MovingObjectPosition)(life8_82)).e;
    }
    spill32_3 = ((net.minecraft.entity.Entity)(lexicalValue32_80_0)).e__Int();
    if (!((life4_5 != null))) {
        lexicalValue32_94_0 = spill32_3;
        break lexical_join_94;
    }
    if (!((spill32_3 != __sourceIntrinsic_56a6d861a15d_invokedynamic32_33(16498, (2805667493760858164L ^ life2_3))))) {
        break lexical_join_370;
    }
    spill32_4 = life8_82;
    if (!((life4_5 != null))) {
        lexicalValue32_96_0 = spill32_4;
        break lexical_join_96;
    }
    lexicalValue32_94_0 = ((((net.minecraft.util.MovingObjectPosition)(spill32_4)).e instanceof net.minecraft.entity.item.EntityArmorStand) ? 1 : 0);
    }
    if (!((lexicalValue32_94_0 == 0))) {
        break lexical_join_370;
    }
    lexicalValue32_96_0 = life8_82;
    }
    life9_131 = ((moom.DR)(((net.minecraft.util.MovingObjectPosition)(lexicalValue32_96_0)).d)).b(((moom.DR)(life7_74)));
    spill32_5 = recovery.source.CarrierOps.dcmpl(((double)(life9_131)), ((double)(0x1.8p1d)));
    if (!((life4_5 != null))) {
        lexicalValue32_286_0 = spill32_5;
        break lexical_join_286;
    }
    if (!((spill32_5 > 0))) {
        break lexical_join_284;
    }
    spill32_6 = this.i;
    if (!((life4_5 != null))) {
        lexicalValue32_294_0 = ((spill32_6) ? 1 : 0);
        break lexical_join_294;
    }
    if (!((!spill32_6))) {
        break lexical_join_292;
    }
    spill32_7 = ((com.moon.nW)(this.l)).a(((long)(((long) ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(((com.moon.module.impl.Tickbase)(((com.moon.module.impl.Tickbase)(((com.moon.fh)(this)).a())))).b())).getValue())))).intValue()))));
    if (!((life4_5 != null))) {
        lexicalValue32_294_0 = ((spill32_7) ? 1 : 0);
        break lexical_join_294;
    }
    if (!(spill32_7)) {
        break lexical_join_292;
    }
    life11_179 = ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(((com.moon.module.impl.Tickbase)(((com.moon.module.impl.Tickbase)(((com.moon.fh)(this)).a())))).a())).getValue())))).intValue();
    this.j = ((int)(-1));
    life12_184 = 1;
    lexical_cycle_138: while (true) {
    lexical_join_276: {
    lexical_join_275: {
    if (!((life12_184 < (life11_179 + 1)))) {
        break lexical_join_278;
    }
    life13_201 = new com.moon.n7(((net.minecraft.client.Minecraft)(com.moon.fh.a)).K, ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fh.a)).K)).bk, ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fh.a)).K)).bj);
    life14_207 = ((com.moon.n7)(life13_201)).a(((int)((life12_184 - 1))));
    life15_211 = ((net.minecraft.entity.Entity)(this.e)).G;
    life16_215 = ((net.minecraft.entity.Entity)(this.e)).H;
    life17_219 = (life15_211 / 0x1.0p1f);
    life18_223 = ((net.minecraft.entity.Entity)(((net.minecraft.util.MovingObjectPosition)(life8_82)).e)).a__DR();
    life19_258 = ((moom.CA)(new moom.CA((((moom.DR)(life18_223)).a - ((double) life17_219)), ((moom.DR)(life18_223)).b, (((moom.DR)(life18_223)).c - ((double) life17_219)), (((moom.DR)(life18_223)).a + ((double) life17_219)), (((moom.DR)(life18_223)).b + ((double) life16_215)), (((moom.DR)(life18_223)).c + ((double) life17_219))))).b(((double)(0x1.999999999999ap-4d)), ((double)(0x1.999999999999ap-4d)), ((double)(0x1.999999999999ap-4d)));
    life20_267 = ((moom.DR)(life14_207)).b(((double)(0x0.0p0d)), ((double)(((double) ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fh.a)).K)).e__Float()))), ((double)(0x0.0p0d)));
    life21_274 = ((com.moon.fh)(this)).a(((float)(((com.moon.eA)(life5_57)).b__sourceReturn_bc607678b6())), ((float)(((com.moon.eA)(life5_57)).a())));
    life22_289 = ((moom.DR)(life20_267)).b(((double)((((moom.DR)(life21_274)).a * 0x1.4p4d))), ((double)((((moom.DR)(life21_274)).b * 0x1.4p4d))), ((double)((((moom.DR)(life21_274)).c * 0x1.4p4d))));
    life23_294 = ((moom.CA)(life19_258)).a(((moom.DR)(life20_267)), ((moom.DR)(life22_289)));
    if (!((life4_5 != null))) {
        break lexical_join_282;
    }
    if (!((life4_5 != null))) {
        break lexical_join_276;
    }
    if (!((life23_294 != null))) {
        break lexical_join_275;
    }
    life24_313 = com.moon.nI.a(((double)(((moom.DR)(((net.minecraft.util.MovingObjectPosition)(life23_294)).d)).b(((moom.DR)(life20_267))))), ((int)(3)));
    if (!((life4_5 != null))) {
        break lexical_join_276;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(life24_313)), ((double)(0x1.8p1d))) <= 0))) {
        break lexical_join_275;
    }
    if (!((life12_184 > 1))) {
        break lexical_join_275;
    }
    this.j = ((int)(life12_184));
    if (!((life4_5 == null))) {
        break lexical_join_278;
    }
    }
    life12_184 += 1;
    }
    if (!((life4_5 == null))) { continue lexical_cycle_138; }
    break lexical_cycle_138;
    }
    }
    this.k = ((int)(this.j));
    }
    if (!((life4_5 == null))) {
        break lexical_join_292;
    }
    }
    lexicalValue32_286_0 = ((this.i) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        lexicalValue32_294_0 = lexicalValue32_286_0;
        break lexical_join_294;
    }
    if (!((lexicalValue32_286_0 == 0))) {
        break lexical_join_292;
    }
    this.j = ((int)(-1));
    }
    lexicalValue32_294_0 = this.k;
    }
    if (!((life4_5 != null))) {
        lexicalValue32_344_0 = lexicalValue32_294_0;
        break lexical_join_344;
    }
    if (!((lexicalValue32_294_0 > 0))) {
        break lexical_join_342;
    }
    spill32_8 = ((com.moon.nW)(this.l)).a(((long)(((long) ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(((com.moon.module.impl.Tickbase)(((com.moon.module.impl.Tickbase)(((com.moon.fh)(this)).a())))).b())).getValue())))).intValue()))));
    if (!((life4_5 != null))) {
        lexicalValue32_344_0 = ((spill32_8) ? 1 : 0);
        break lexical_join_344;
    }
    if (!(spill32_8)) {
        break lexical_join_342;
    }
    ((com.moon.eH)(p0)).a(((int)(1)));
    this.i = ((boolean)(true));
    spill32_9 = this.k;
    if (!((life4_5 != null))) {
        lexicalValue32_344_0 = spill32_9;
        break lexical_join_344;
    }
    if (!((spill32_9 == 1))) {
        break lexical_join_342;
    }
    ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(new com.moon.ep())));
    ((com.moon.nW)(this.l)).a__Void();
    this.i = ((boolean)(false));
    ((com.moon.eH)(p0)).a(((double)(((double) this.j))));
    }
    lexicalValue32_344_0 = this.k;
    }
    if (!((life4_5 != null))) {
        lexicalValue32_351_0 = lexicalValue32_344_0;
        break lexical_join_351;
    }
    if (!((lexicalValue32_344_0 <= 0))) {
        break lexical_join_370;
    }
    spill32_10 = this;
    if (!((life4_5 != null))) {
        lexicalValue32_362_0 = spill32_10;
        break lexical_join_362;
    }
    lexicalValue32_351_0 = ((((com.moon.fh)(spill32_10)).i) ? 1 : 0);
    }
    if (!((lexicalValue32_351_0 != 0))) {
        break lexical_join_370;
    }
    ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(new com.moon.ep())));
    ((com.moon.nW)(this.l)).a__Void();
    lexicalValue32_362_0 = this;
    }
    ((com.moon.fh)(lexicalValue32_362_0)).i = ((boolean)(false));
    ((com.moon.eH)(p0)).a(((double)(((double) this.j))));
    }
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1127_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/fh"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.fh.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a(com.moon.event.TickEvent p0) {
long life2_3;
    life2_3 = (com.moon.fh.m ^ 134459345361715L);
    if ((((com.moon.event.TickEvent)(p0)).getPhase() == com.moon.event.TickPhase.PRE)) {
        if ((recovery.source.CarrierOps.dcmpl(((double)(((double) ((moom.DM)(((net.minecraft.client.Minecraft)(com.moon.fh.a)).l)).c))), ((double)(0x1.0p0d))) != 0)) {
        return;
    }
        com.moon.fh __stackOp166_7_0 = this;
        ((com.moon.fh)(__stackOp166_7_0)).k = ((int)((((com.moon.fh)(__stackOp166_7_0)).k - 1)));
    }
    return;
}


private moom.DR a(float p0, float p1) {
float local3 = moom.Dr.b(((float)((((-p1) * com.moon.nQ.b) - 0x1.921fb6p1f))));
    float local4 = moom.Dr.a(((float)((((-p1) * com.moon.nQ.b) - 0x1.921fb6p1f))));
    float local5 = (-moom.Dr.b(((float)(((-p0) * com.moon.nQ.b)))));
    float local6 = moom.Dr.a(((float)(((-p0) * com.moon.nQ.b))));
    return new moom.DR(((double) (local4 * local5)), ((double) local6), ((double) (local3 * local5)));
}


private long a__sourceReturn_f9912cc5c6() {
long local1 = (com.moon.fh.m ^ 17354836313456L);
    return (((long) ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(((com.moon.module.impl.Tickbase)(((com.moon.module.impl.Tickbase)(((com.moon.fh)(this)).a())))).a())).getValue())))).intValue()) * __sourceIntrinsic_d3e4e16d7952_originalDynamicSite373_7(29147, (6571635589962418462L ^ local1)));
}


private void a(moom.y6 p0) {
com.moon.fh forwardValue167_20_0;
    com.moon.fh spill167_0;
    com.moon.fh spill167_1;
    long life2_3;
    java.lang.String life4_5;
    forward_join_25: {
    forward_join_20: {
    forward_join_19: {
    life2_3 = (com.moon.fh.m ^ 1118107733510L);
    life4_5 = net.minecraft.init.Blocks.b();
    spill167_0 = this;
    if (!((life4_5 != null))) {
        forwardValue167_20_0 = spill167_0;
        break forward_join_20;
    }
    if (!((((com.moon.fh)(spill167_0)).e != null))) {
        break forward_join_19;
    }
    spill167_1 = this;
    if (!((life4_5 != null))) {
        forwardValue167_20_0 = spill167_1;
        break forward_join_20;
    }
    if (!((((net.minecraft.entity.Entity)(((com.moon.fh)(spill167_1)).e)).e__Int() != ((moom.y6)(p0)).a()))) {
        break forward_join_25;
    }
    }
    forwardValue167_20_0 = this;
    }
    ((com.moon.fh)(forwardValue167_20_0)).e = ((net.minecraft.entity.Entity)(((moom.y6)(p0)).a(((net.minecraft.world.World)(((net.minecraft.client.Minecraft)(com.moon.fh.a)).I)))));
    }
    return;
}


public void a(com.moon.event.PacketEvent p0) {
int forwardValue165_22_0;
    int forwardValue165_43_0;
    int forwardValue165_49_0;
    int forwardValue165_117_0;
    int forwardValue165_162_0;
    com.moon.fh forwardValue165_168_0;
    java.lang.String spill165_0;
    int spill165_1;
    int spill165_2;
    com.moon.fh spill165_3;
    int spill165_4;
    com.moon.fh spill165_5;
    com.moon.fh spill165_6;
    com.moon.fh spill165_7;
    int spill165_8;
    int spill165_9;
    long life2_3;
    moom.yK life6_7;
    java.lang.String life4_8;
    moom.y6 life5_19;
    long life5_72;
    long life7_87;
    int life9_181;
    forward_join_174: {
    forward_join_170: {
    forward_join_168: {
    forward_join_167: {
    forward_join_162: {
    forward_join_161: {
    forward_join_117: {
    forward_join_87: {
    forward_join_49: {
    forward_join_43: {
    forward_join_41: {
    forward_join_22: {
    forward_join_20: {
    life2_3 = (com.moon.fh.m ^ 94561546852607L);
    spill165_0 = net.minecraft.init.Blocks.b();
    life6_7 = ((com.moon.event.PacketEvent)(p0)).getPacket();
    life4_8 = spill165_0;
    spill165_1 = ((life6_7 instanceof moom.y6) ? 1 : 0);
    if (!((life4_8 != null))) {
        forwardValue165_22_0 = spill165_1;
        break forward_join_22;
    }
    if (!((spill165_1 != 0))) {
        break forward_join_20;
    }
    life5_19 = ((moom.y6)(life6_7));
    ((com.moon.fh)(this)).a(((moom.y6)(life5_19)));
    }
    forwardValue165_22_0 = ((((com.moon.event.PacketEvent)(p0)).b__sourceReturn_aae029aa0a()) ? 1 : 0);
    }
    if (!((life4_8 != null))) {
        forwardValue165_43_0 = forwardValue165_22_0;
        break forward_join_43;
    }
    if (!((forwardValue165_22_0 == 0))) {
        break forward_join_41;
    }
    spill165_2 = ((((com.moon.event.PacketEvent)(p0)).getPacket() instanceof moom.zB) ? 1 : 0);
    if (!((life4_8 != null))) {
        forwardValue165_43_0 = spill165_2;
        break forward_join_43;
    }
    if (!((spill165_2 != 0))) {
        break forward_join_41;
    }
    com.moon.fh __stackOp165_10_0 = this;
    ((com.moon.fh)(__stackOp165_10_0)).f = ((long)((((com.moon.fh)(__stackOp165_10_0)).f - __sourceIntrinsic_0d28a2dd2629_invokedynamic165_12(1859, (8094806908055577096L ^ life2_3)))));
    }
    forwardValue165_43_0 = ((((com.moon.event.PacketEvent)(p0)).b__sourceReturn_aae029aa0a()) ? 1 : 0);
    }
    if (!((life4_8 != null))) {
        forwardValue165_49_0 = forwardValue165_43_0;
        break forward_join_49;
    }
    if (!((forwardValue165_43_0 != 0))) {
        break forward_join_170;
    }
    forwardValue165_49_0 = ((((com.moon.event.PacketEvent)(p0)).getPacket() instanceof moom.y7) ? 1 : 0);
    }
    if (!((forwardValue165_49_0 != 0))) {
        break forward_join_170;
    }
    life5_72 = java.lang.System.currentTimeMillis();
    spill165_3 = this;
    if (!((life4_8 != null))) {
        forwardValue165_168_0 = spill165_3;
        break forward_join_168;
    }
    if (!((recovery.source.CarrierOps.lcmp(((long)(((com.moon.fh)(spill165_3)).g)), ((long)(0L))) != 0))) {
        break forward_join_167;
    }
    life7_87 = (life5_72 - this.g);
    spill165_4 = recovery.source.CarrierOps.lcmp(((long)(java.lang.Math.abs(((long)((life7_87 - __sourceIntrinsic_0d28a2dd2629_invokedynamic165_22(26710, (5812841136695053598L ^ life2_3)))))))), ((long)(__sourceIntrinsic_0d28a2dd2629_invokedynamic165_24(23054, (1768762711083466567L ^ life2_3)))));
    if (!((life4_8 != null))) {
        forwardValue165_117_0 = spill165_4;
        break forward_join_117;
    }
    if (!((spill165_4 <= 0))) {
        break forward_join_87;
    }
    life7_87 = __sourceIntrinsic_0d28a2dd2629_invokedynamic165_26(29147, (6571730456758457489L ^ life2_3));
    }
    com.moon.fh __stackOp165_27_0 = this;
    ((com.moon.fh)(__stackOp165_27_0)).f = ((long)((((com.moon.fh)(__stackOp165_27_0)).f + (__sourceIntrinsic_0d28a2dd2629_invokedynamic165_29(29147, (6571730456758457489L ^ life2_3)) - life7_87))));
    this.f = ((long)(java.lang.Math.max(((long)(this.f)), ((long)((-((com.moon.fh)(this)).a__sourceReturn_f9912cc5c6()))))));
    spill165_5 = this;
    if (!((life4_8 != null))) {
        forwardValue165_168_0 = spill165_5;
        break forward_join_168;
    }
    forwardValue165_117_0 = recovery.source.CarrierOps.lcmp(((long)(((com.moon.fh)(spill165_5)).f)), ((long)(__sourceIntrinsic_0d28a2dd2629_invokedynamic165_36(29147, (6571730456758457489L ^ life2_3)))));
    }
    if (!((forwardValue165_117_0 >= 0))) {
        break forward_join_167;
    }
    spill165_6 = this;
    if (!((life4_8 != null))) {
        forwardValue165_168_0 = spill165_6;
        break forward_join_168;
    }
    if (!((!((com.moon.fh)(spill165_6)).i))) {
        break forward_join_167;
    }
    spill165_7 = this;
    if (!((life4_8 != null))) {
        forwardValue165_168_0 = spill165_7;
        break forward_join_168;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(((com.moon.fh)(spill165_7)).h)), ((double)(0x0.0p0d))) == 0))) {
        break forward_join_167;
    }
    life9_181 = (((int) this.f) / __sourceIntrinsic_0d28a2dd2629_invokedynamic165_42(12406, (1251172453997430897L ^ life2_3)));
    spill165_8 = life9_181;
    if (!((life4_8 != null))) {
        forwardValue165_162_0 = spill165_8;
        break forward_join_162;
    }
    if (!((spill165_8 > 0))) {
        break forward_join_161;
    }
    spill165_9 = recovery.source.CarrierOps.lcmp(((long)((this.f - ((long) (life9_181 * __sourceIntrinsic_0d28a2dd2629_invokedynamic165_44(18592, (7567041058510942373L ^ life2_3))))))), ((long)(0L)));
    if (!((life4_8 != null))) {
        forwardValue165_162_0 = spill165_9;
        break forward_join_162;
    }
    if (!((spill165_9 > 0))) {
        break forward_join_161;
    }
    life9_181 += 1;
    }
    forwardValue165_162_0 = life9_181;
    }
    if (!((forwardValue165_162_0 > 0))) {
        break forward_join_167;
    }
    this.h = ((double)(((double) life9_181)));
    }
    forwardValue165_168_0 = this;
    }
    ((com.moon.fh)(forwardValue165_168_0)).g = ((long)(life5_72));
    }
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        break forward_join_174;
    }
    net.minecraft.init.Blocks.b(((java.lang.String)("PZsbVb")));
    }
    return;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 14288;
      if (o[var3] == null) {
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
         long var5 = n[var3];
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
            throw new RuntimeException("com/moon/fh", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         o[var3] = var15;
      }

      return o[var3];
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1123_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_56a6d861a15d_invokedynamic32_33(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1127_0() throws E;

private static native <E extends Throwable> long __sourceIntrinsic_d3e4e16d7952_originalDynamicSite373_7(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_0d28a2dd2629_invokedynamic165_12(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_0d28a2dd2629_invokedynamic165_22(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_0d28a2dd2629_invokedynamic165_24(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_0d28a2dd2629_invokedynamic165_26(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_0d28a2dd2629_invokedynamic165_29(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_0d28a2dd2629_invokedynamic165_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0d28a2dd2629_invokedynamic165_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0d28a2dd2629_invokedynamic165_44(int a0, long a1) throws E;
}
