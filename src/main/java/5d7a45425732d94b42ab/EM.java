package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class EM {

private final net.minecraft.world.biome.WorldChunkManager a;

private long b;

private final moom.Do<moom.EN> c;

private final java.util.List<moom.EN> d;

private static final long e;

private static final long[] f;

private static final java.lang.Integer[] g;

private static final java.util.Map h;

private static final long[] i;

private static final java.lang.Long[] j;

private static final java.util.Map k;

public EM(net.minecraft.world.biome.WorldChunkManager p0) {
super();
    this.c = new moom.Do();
    this.d = com.google.common.collect.Lists.newArrayList();
    this.a = p0;
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(3818588219577142345L)), ((long)(-2152553942163883075L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(167258366430971L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.EM.e ^ 88507850557413L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill521_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill521_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill521_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill521_14 = new byte[8];
    (__sourceSpill521_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill521_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation521_16 = __sourceSpill521_14;
    ((javax.crypto.Cipher)(__sourceSpill521_11)).init(((int)(__sourceSpill521_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill521_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation521_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local19_life19 = new long[2];
    int local16_life20 = 0;
    java.lang.String local17_life21;
    int local18_life23 = ((java.lang.String)((local17_life21 = "¼V¿ãÜ£48òñ½¶"))).length();
    int local15_life24 = 0;
    do {
        java.lang.String __sourceSpill521_25 = local17_life21;
        int __sourceSpill521_26 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill521_25)).substring(((int)(__sourceSpill521_26)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill521_30 = local19_life19;
        int __sourceSpill521_31 = local16_life20;
        local16_life20 += 1;
        long local21_life32 = (((((((((((long) (local20_life29)[0]) & 255L) << 56) | ((((long) (local20_life29)[1]) & 255L) << 48)) | ((((long) (local20_life29)[2]) & 255L) << 40)) | ((((long) (local20_life29)[3]) & 255L) << 32)) | ((((long) (local20_life29)[4]) & 255L) << 24)) | ((((long) (local20_life29)[5]) & 255L) << 16)) | ((((long) (local20_life29)[6]) & 255L) << 8)) | (((long) (local20_life29)[7]) & 255L));
        byte[] __sourceSpill521_33 = new byte[8];
        (__sourceSpill521_33)[0] = ((byte) ((int) (local21_life32 >>> 56)));
        (__sourceSpill521_33)[1] = ((byte) ((int) (local21_life32 >>> 48)));
        (__sourceSpill521_33)[2] = ((byte) ((int) (local21_life32 >>> 40)));
        (__sourceSpill521_33)[3] = ((byte) ((int) (local21_life32 >>> 32)));
        (__sourceSpill521_33)[4] = ((byte) ((int) (local21_life32 >>> 24)));
        (__sourceSpill521_33)[5] = ((byte) ((int) (local21_life32 >>> 16)));
        (__sourceSpill521_33)[6] = ((byte) ((int) (local21_life32 >>> 8)));
        (__sourceSpill521_33)[7] = ((byte) ((int) local21_life32));
        javax.crypto.Cipher __sourceSpill521_34 = local13_life9;
        byte[] local23_life36 = ((javax.crypto.Cipher)(__sourceSpill521_34)).doFinal(((byte[])(__sourceSpill521_33)));
        (__sourceSpill521_30)[__sourceSpill521_31] = (((((((((((long) (local23_life36)[0]) & 255L) << 56) | ((((long) (local23_life36)[1]) & 255L) << 48)) | ((((long) (local23_life36)[2]) & 255L) << 40)) | ((((long) (local23_life36)[3]) & 255L) << 32)) | ((((long) (local23_life36)[4]) & 255L) << 24)) | ((((long) (local23_life36)[5]) & 255L) << 16)) | ((((long) (local23_life36)[6]) & 255L) << 8)) | (((long) (local23_life36)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    f = ((long[])(local19_life19));
    g = ((java.lang.Integer[])(new java.lang.Integer[2]));
    k = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life41;
    javax.crypto.Cipher __sourceSpill521_43 = (local0_life41 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill521_44 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill521_45 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill521_46 = new byte[8];
    (__sourceSpill521_46)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life47 = 1;
    while ((local1_life47 < 8)) {
        (__sourceSpill521_46)[local1_life47] = ((byte) ((int) ((local11_life7 << (local1_life47 * 8)) >>> 56)));
        local1_life47 += 1;
    }
    byte[] __sourcePreallocation521_48 = __sourceSpill521_46;
    ((javax.crypto.Cipher)(__sourceSpill521_43)).init(((int)(__sourceSpill521_44)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill521_45)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation521_48)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life51 = new long[4];
    int local3_life52 = 0;
    java.lang.String local4_life53;
    int local5_life55 = ((java.lang.String)((local4_life53 = "´È>wíÙcÏ\027\032jÚ¬ïi"))).length();
    int local2_life56 = 0;
    do {
        java.lang.String __sourceSpill521_57 = local4_life53;
        int __sourceSpill521_58 = local2_life56;
        local2_life56 += 8;
        byte[] local7_life61 = ((java.lang.String)(((java.lang.String)(__sourceSpill521_57)).substring(((int)(__sourceSpill521_58)), ((int)(local2_life56))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill521_62 = local6_life51;
        int __sourceSpill521_63 = local3_life52;
        local3_life52 += 1;
        long local8_life64 = (((((((((((long) (local7_life61)[0]) & 255L) << 56) | ((((long) (local7_life61)[1]) & 255L) << 48)) | ((((long) (local7_life61)[2]) & 255L) << 40)) | ((((long) (local7_life61)[3]) & 255L) << 32)) | ((((long) (local7_life61)[4]) & 255L) << 24)) | ((((long) (local7_life61)[5]) & 255L) << 16)) | ((((long) (local7_life61)[6]) & 255L) << 8)) | (((long) (local7_life61)[7]) & 255L));
        byte[] __sourceSpill521_65 = new byte[8];
        (__sourceSpill521_65)[0] = ((byte) ((int) (local8_life64 >>> 56)));
        (__sourceSpill521_65)[1] = ((byte) ((int) (local8_life64 >>> 48)));
        (__sourceSpill521_65)[2] = ((byte) ((int) (local8_life64 >>> 40)));
        (__sourceSpill521_65)[3] = ((byte) ((int) (local8_life64 >>> 32)));
        (__sourceSpill521_65)[4] = ((byte) ((int) (local8_life64 >>> 24)));
        (__sourceSpill521_65)[5] = ((byte) ((int) (local8_life64 >>> 16)));
        (__sourceSpill521_65)[6] = ((byte) ((int) (local8_life64 >>> 8)));
        (__sourceSpill521_65)[7] = ((byte) ((int) local8_life64));
        javax.crypto.Cipher __sourceSpill521_66 = local0_life41;
        byte[] local10_life68 = ((javax.crypto.Cipher)(__sourceSpill521_66)).doFinal(((byte[])(__sourceSpill521_65)));
        (__sourceSpill521_62)[__sourceSpill521_63] = (((((((((((long) (local10_life68)[0]) & 255L) << 56) | ((((long) (local10_life68)[1]) & 255L) << 48)) | ((((long) (local10_life68)[2]) & 255L) << 40)) | ((((long) (local10_life68)[3]) & 255L) << 32)) | ((((long) (local10_life68)[4]) & 255L) << 24)) | ((((long) (local10_life68)[5]) & 255L) << 16)) | ((((long) (local10_life68)[6]) & 255L) << 8)) | (((long) (local10_life68)[7]) & 255L));
    } while ((!(local2_life56 >= local5_life55)));
    local5_life55 = ((java.lang.String)((local4_life53 = "\t^I°n!PqçAë<aõôÆ"))).length();
    local2_life56 = 0;
    do {
        java.lang.String __sourceSpill521_70 = local4_life53;
        int __sourceSpill521_71 = local2_life56;
        local2_life56 += 8;
        byte[] local7_life74 = ((java.lang.String)(((java.lang.String)(__sourceSpill521_70)).substring(((int)(__sourceSpill521_71)), ((int)(local2_life56))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill521_75 = local6_life51;
        int __sourceSpill521_76 = local3_life52;
        local3_life52 += 1;
        long local8_life77 = (((((((((((long) (local7_life74)[0]) & 255L) << 56) | ((((long) (local7_life74)[1]) & 255L) << 48)) | ((((long) (local7_life74)[2]) & 255L) << 40)) | ((((long) (local7_life74)[3]) & 255L) << 32)) | ((((long) (local7_life74)[4]) & 255L) << 24)) | ((((long) (local7_life74)[5]) & 255L) << 16)) | ((((long) (local7_life74)[6]) & 255L) << 8)) | (((long) (local7_life74)[7]) & 255L));
        byte[] __sourceSpill521_78 = new byte[8];
        (__sourceSpill521_78)[0] = ((byte) ((int) (local8_life77 >>> 56)));
        (__sourceSpill521_78)[1] = ((byte) ((int) (local8_life77 >>> 48)));
        (__sourceSpill521_78)[2] = ((byte) ((int) (local8_life77 >>> 40)));
        (__sourceSpill521_78)[3] = ((byte) ((int) (local8_life77 >>> 32)));
        (__sourceSpill521_78)[4] = ((byte) ((int) (local8_life77 >>> 24)));
        (__sourceSpill521_78)[5] = ((byte) ((int) (local8_life77 >>> 16)));
        (__sourceSpill521_78)[6] = ((byte) ((int) (local8_life77 >>> 8)));
        (__sourceSpill521_78)[7] = ((byte) ((int) local8_life77));
        javax.crypto.Cipher __sourceSpill521_79 = local0_life41;
        byte[] local10_life81 = ((javax.crypto.Cipher)(__sourceSpill521_79)).doFinal(((byte[])(__sourceSpill521_78)));
        (__sourceSpill521_75)[__sourceSpill521_76] = (((((((((((long) (local10_life81)[0]) & 255L) << 56) | ((((long) (local10_life81)[1]) & 255L) << 48)) | ((((long) (local10_life81)[2]) & 255L) << 40)) | ((((long) (local10_life81)[3]) & 255L) << 32)) | ((((long) (local10_life81)[4]) & 255L) << 24)) | ((((long) (local10_life81)[5]) & 255L) << 16)) | ((((long) (local10_life81)[6]) & 255L) << 8)) | (((long) (local10_life81)[7]) & 255L));
    } while ((!(local2_life56 >= local5_life55)));
    i = ((long[])(local6_life51));
    j = ((java.lang.Long[])(new java.lang.Long[4]));
}


private static long b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = moom.EM.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4319_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/EM"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 22763);
    if (((moom.EM.j)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (moom.EM.i)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(moom.EM.k)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.EM.k)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/EM", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (moom.EM.j)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((moom.EM.j)[life3_8])).longValue();
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4321_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/EM"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public net.minecraft.world.biome.BiomeGenBase a(int p0, int p1, net.minecraft.world.biome.BiomeGenBase p2) {
net.minecraft.world.biome.BiomeGenBase forwardValue1808_19_0;
    net.minecraft.world.biome.BiomeGenBase forwardValue1808_21_0;
    java.lang.String spill1808_0;
    net.minecraft.world.biome.BiomeGenBase spill1808_1;
    long life4_3;
    net.minecraft.world.biome.BiomeGenBase life7_12;
    java.lang.String life6_13;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    life4_3 = (moom.EM.e ^ 132051470159066L);
    spill1808_0 = net.minecraft.world.biome.WorldChunkManager.b();
    life7_12 = ((moom.EN)(this.a(((int)(p0)), ((int)(p1))))).a(((int)(p0)), ((int)(p1)));
    life6_13 = spill1808_0;
    spill1808_1 = life7_12;
    if (!((life6_13 == null))) {
        forwardValue1808_19_0 = spill1808_1;
        break forward_join_19;
    }
    if (!((spill1808_1 == null))) {
        break forward_join_20;
    }
    forwardValue1808_19_0 = p2;
    }
    forwardValue1808_21_0 = forwardValue1808_19_0;
    break forward_join_21;
    }
    forwardValue1808_21_0 = life7_12;
    }
    return forwardValue1808_21_0;
}


public moom.EN a(int p0, int p1) {
moom.EN forwardValue1807_69_0;
    java.lang.String spill1807_0;
    moom.EN spill1807_1;
    long life3_3;
    int life1_8;
    int life2_12;
    long life6_36;
    moom.EN life8_42;
    java.lang.String life5_43;
    forward_join_69: {
    forward_join_65: {
    life3_3 = (moom.EM.e ^ 97763287356509L);
    spill1807_0 = net.minecraft.world.biome.WorldChunkManager.b();
    life1_8 = (p0 >> 4);
    life2_12 = (p1 >> 4);
    life6_36 = ((((long) life1_8) & __sourceIntrinsic_a67852a65fa0_invokedynamic1807_2(29594, (1166057017403725242L ^ life3_3))) | ((((long) life2_12) & __sourceIntrinsic_a67852a65fa0_invokedynamic1807_3(29594, (1166057017403725242L ^ life3_3))) << __sourceIntrinsic_a67852a65fa0_invokedynamic1807_4(26194, (2806126860700759228L ^ life3_3))));
    life8_42 = ((moom.EN)(((moom.Do)(this.c)).a__Object(((long)(life6_36)))));
    life5_43 = spill1807_0;
    spill1807_1 = life8_42;
    if (!((life5_43 == null))) {
        forwardValue1807_69_0 = spill1807_1;
        break forward_join_69;
    }
    if (!((spill1807_1 == null))) {
        break forward_join_65;
    }
    life8_42 = new moom.EN(this, life1_8, life2_12);
    ((moom.Do)(this.c)).a(((long)(life6_36)), ((java.lang.Object)(life8_42)));
    ((java.util.List)(this.d)).add(((java.lang.Object)(life8_42)));
    }
    ((moom.EN)(life8_42)).e = ((long)(moom.Bl.a__Long()));
    forwardValue1807_69_0 = life8_42;
    }
    return forwardValue1807_69_0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.world.biome.BiomeGenBase[] a__ArrayES(int p0, int p1) {
return ((moom.EN)(this.a(((int)(p0)), ((int)(p1))))).b;
}


public void a() {
int lexicalValue587_33_0;
    int lexicalValue587_74_0;
    java.lang.String spill587_0;
    int spill587_1;
    int spill587_2;
    int spill587_3;
    int spill587_4;
    long life1_3;
    long life4_5;
    long life6_11;
    java.lang.String life3_12;
    int life8_45;
    moom.EN life9_56;
    long life10_61;
    long life12_121;
    lexical_join_106: {
    lexical_join_33: {
    lexical_join_29: {
    life1_3 = (moom.EM.e ^ 70465510448237L);
    life4_5 = moom.Bl.a__Long();
    spill587_0 = net.minecraft.world.biome.WorldChunkManager.b();
    life6_11 = (life4_5 - this.b);
    life3_12 = spill587_0;
    spill587_1 = recovery.source.CarrierOps.lcmp(((long)(life6_11)), ((long)(__sourceIntrinsic_2c8ae721fed4_invokedynamic587_4(32520, (67082850236862745L ^ life1_3)))));
    if (!((life3_12 == null))) {
        lexicalValue587_33_0 = spill587_1;
        break lexical_join_33;
    }
    if (!((spill587_1 <= 0))) {
        break lexical_join_29;
    }
    spill587_2 = recovery.source.CarrierOps.lcmp(((long)(life6_11)), ((long)(0L)));
    if (!((life3_12 == null))) {
        lexicalValue587_33_0 = spill587_2;
        break lexical_join_33;
    }
    if (!((spill587_2 < 0))) {
        break lexical_join_106;
    }
    }
    this.b = ((long)(life4_5));
    lexicalValue587_33_0 = 0;
    }
    life8_45 = lexicalValue587_33_0;
    lexical_cycle_34: while (true) {
    lexical_join_103: {
    lexical_join_74: {
    lexical_join_66: {
    if (!((life8_45 < ((java.util.List)(this.d)).size()))) {
        break lexical_join_106;
    }
    life9_56 = ((moom.EN)(((java.util.List)(this.d)).get(((int)(life8_45)))));
    life10_61 = (life4_5 - ((moom.EN)(life9_56)).e);
    spill587_3 = recovery.source.CarrierOps.lcmp(((long)(life10_61)), ((long)(__sourceIntrinsic_2c8ae721fed4_invokedynamic587_14(18307, (8423598955090192785L ^ life1_3)))));
    if (!((life3_12 == null))) {
        lexicalValue587_74_0 = spill587_3;
        break lexical_join_74;
    }
    if (!((spill587_3 <= 0))) {
        break lexical_join_66;
    }
    spill587_4 = recovery.source.CarrierOps.lcmp(((long)(life10_61)), ((long)(0L)));
    if (!((life3_12 == null))) {
        lexicalValue587_74_0 = spill587_4;
        break lexical_join_74;
    }
    if (!((spill587_4 < 0))) {
        break lexical_join_103;
    }
    }
    ((java.util.List)(this.d)).remove(((int)((life8_45--))));
    lexicalValue587_74_0 = ((moom.EN)(life9_56)).c;
    }
    life12_121 = ((((long) lexicalValue587_74_0) & __sourceIntrinsic_2c8ae721fed4_invokedynamic587_20(1151, (670895613687392876L ^ life1_3))) | ((((long) ((moom.EN)(life9_56)).d) & __sourceIntrinsic_2c8ae721fed4_invokedynamic587_22(29594, (1166065415228005770L ^ life1_3))) << __sourceIntrinsic_2c8ae721fed4_invokedynamic587_23(1511, (9062052137673695032L ^ life1_3))));
    ((moom.Do)(this.c)).b(((long)(life12_121)));
    }
    life8_45 += 1;
    if (!((life3_12 != null))) { continue lexical_cycle_34; }
    break lexical_cycle_34;
    }
    }
    return;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x2C26;
        if (g[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = f[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    h.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/EM", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            EM.g[n2] = n4;
        }
        return g[n2];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.EM.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static native <E extends Throwable> long __sourceIntrinsic_2c8ae721fed4_invokedynamic587_4(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_2c8ae721fed4_invokedynamic587_14(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_2c8ae721fed4_invokedynamic587_20(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_2c8ae721fed4_invokedynamic587_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_invokedynamic587_23(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_a67852a65fa0_invokedynamic1807_2(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_a67852a65fa0_invokedynamic1807_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a67852a65fa0_invokedynamic1807_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4321_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4319_0() throws E;
}
