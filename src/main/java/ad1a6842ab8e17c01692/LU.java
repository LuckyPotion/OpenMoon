package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class LU {

private static java.lang.String a;

private static long b;

private static java.lang.String[] c;

private static java.lang.String[] d;

private static java.util.Map e;

private static long[] f;

private static java.lang.Integer[] g;

private static java.util.Map h;

public LU() {
super();
}


static {
b = ((long)(((moom._a)(moom._c.a(((long)(-6511097402942880607L)), ((long)(4474527535631388833L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(36563566551651L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.LU.b ^ 58445312005475L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill674_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill674_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill674_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill674_14 = new byte[8];
    (__sourceSpill674_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill674_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation674_16 = __sourceSpill674_14;
    ((javax.crypto.Cipher)(__sourceSpill674_11)).init(((int)(__sourceSpill674_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill674_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation674_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[12];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "-Ê/Ï¬\016Hb\004{+1£4ð@º¦\033]ÆØ\005¢é\003zÓÒªg¨.x>w\030:ÆÃ¼\033µ:oOìË@X!\\ 0)N¹\025u¿(\ráü3ÊÀÚQ¥y\003nÔ+Ó¢É\021v®b¿b6þxv\025ëWU}I àA\020Â1§#\f'Yûç\027:ü\016('ËÎÞ]?ì[\025Áì©\005ÒI]È=Ì,fÈ;Jßõ¯!\031+O-T*~È\n \001¸w#j\b\r¸ÃÂí¹\bT³<ãÒ½ßò:èÃÐ2\035kiF²(\016¯ñ\027³LYÄÄj\177 w~Kã)\bQ\177á\004\036k\005ãF\007Lñí:|>úÔ\020çî\027}$÷û©d\002,ôIPd; ÷Rë¶ß\023SÕ±e1OG\022Ð\004zs¾ûT¯¸O[YsÒ\006\030Ìxay¶À¦uÞÕ\027ÓÏ\032$Sº\026\030"))).length();
    int local16_life24 = 40;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill674_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill674_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill674_29)).doFinal(((byte[])(__sourceSpill674_28)));
        java.lang.String __sourceSpill674_34 = ((java.lang.String)(moom.LU.a(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill674_35 = local20_life19;
        int __sourceSpill674_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill674_35)[__sourceSpill674_36] = __sourceSpill674_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "8$÷ ³Æ^øGêÕEÊâÞ D\005·ê8\0334\003_E\026£«xõÐ¿Ë^Ûá»m´CýgÈÈ\032"))).length();
    local16_life24 = 16;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill674_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill674_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill674_42)).doFinal(((byte[])(__sourceSpill674_41)));
        java.lang.String __sourceSpill674_47 = ((java.lang.String)(moom.LU.a(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill674_48 = local20_life19;
        int __sourceSpill674_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill674_48)[__sourceSpill674_49] = __sourceSpill674_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    c = ((java.lang.String[])(local20_life19));
    d = ((java.lang.String[])(new java.lang.String[12]));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill674_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill674_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill674_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill674_60 = new byte[8];
    (__sourceSpill674_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill674_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation674_62 = __sourceSpill674_60;
    ((javax.crypto.Cipher)(__sourceSpill674_57)).init(((int)(__sourceSpill674_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill674_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation674_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[2];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "Wó\017s\177¥¾¿òÈ%O."))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill674_71 = local4_life67;
        int __sourceSpill674_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill674_71)).substring(((int)(__sourceSpill674_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill674_76 = local6_life65;
        int __sourceSpill674_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill674_79 = new byte[8];
        (__sourceSpill674_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill674_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill674_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill674_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill674_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill674_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill674_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill674_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill674_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill674_80)).doFinal(((byte[])(__sourceSpill674_79)));
        (__sourceSpill674_76)[__sourceSpill674_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    f = ((long[])(local6_life65));
    g = ((java.lang.Integer[])(new java.lang.Integer[2]));
    a = ((java.lang.String)(null));
}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_40ee00b95bb7c08ac6d7() throws E;
private static final class __SourceHandler_40ee00b95bb7c08ac6d7 {

public static java.lang.String f334() throws Throwable {
    java.lang.String forwardValue334_50_0;
    java.lang.String spill334_0;
    java.lang.String spill334_1;
    long life0_3;
    net.minecraft.entity.Entity[] life2_5;
    int life3_21;
    java.io.File life4_26;
    java.io.File life5_36;
    forward_join_50: {
    forward_join_49: {
    forward_join_39: {
    life0_3 = (__fieldRead334_0() ^ 18149130032804L);
    life2_5 = __call334_1();
    spill334_0 = __fieldRead334_2();
    if (!((life2_5 != null))) {
        forwardValue334_50_0 = spill334_0;
        break forward_join_50;
    }
    if (!((spill334_0 == null))) {
        break forward_join_49;
    }
    life3_21 = __integerCategory334_6(__call334_5(__call334_4(__invokedynamic334_3(26592, (788706186656666144L ^ life0_3))), 0));
    if (!((life3_21 != 0))) {
        break forward_join_39;
    }
    life4_26 = __fieldRead334_8(__call334_7());
    life5_36 = new java.io.File(life4_26, __invokedynamic334_9(25946, (9144025041485516953L ^ life0_3)));
    __fieldWrite334_13(__call334_12(__call334_11(__call334_10(life5_36))));
    }
    spill334_1 = __fieldRead334_14();
    if (!((life2_5 != null))) {
        forwardValue334_50_0 = spill334_1;
        break forward_join_50;
    }
    if (!((spill334_1 == null))) {
        break forward_join_49;
    }
    __fieldWrite334_16(__invokedynamic334_15(29158, (8558280510875124768L ^ life0_3)));
    }
    forwardValue334_50_0 = __fieldRead334_17();
    }
    return forwardValue334_50_0;
}
public static java.lang.String h334_0(java.lang.Exception p0) throws Throwable {
    throw __call3033400_0(p0);
}
public static java.lang.String h334_1(java.lang.Exception p0, long p1, net.minecraft.entity.Entity[] p2, int p3) throws Throwable {
    java.lang.String spill3033401_0;
    java.lang.String spill3033401_1;
    java.lang.String joinValue3033401_1_0;
    java.lang.Exception life4_2;
    life4_2 = p0;
    spill3033401_0 = __call3033401_1(__call3033401_0(life4_2));
    java.lang.String __stackOp3033401_4_0 = __call3033401_2(life4_2);
    java.lang.String __stackOp3033401_4_1 = __invokedynamic3033401_3(29182, (1341585460163462203L ^ p1));
    __call3033401_6(__invokedynamic3033401_5(spill3033401_0, __stackOp3033401_4_1, __stackOp3033401_4_0));
    spill3033401_1 = __fieldRead3033401_7();
    if ((p2 != null)) {
        if ((spill3033401_1 == null)) {
        __fieldWrite3033401_9(__invokedynamic3033401_8(29158, (8558280510875124768L ^ p1)));
    } else {
        
    }
        joinValue3033401_1_0 = __fieldRead3033401_10();
    } else {
        joinValue3033401_1_0 = spill3033401_1;
    }
    return joinValue3033401_1_0;
}
public static java.lang.String h334_2(java.lang.Exception p0) throws Throwable {
    throw __call3033402_0(p0);
}
public static java.lang.String h334_3(java.lang.Exception p0) throws Throwable {
    throw __call3033403_0(p0);
}
private static native long __fieldRead334_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call334_1() throws Throwable;
private static native java.lang.String __fieldRead334_2() throws Throwable;
private static native java.lang.String __invokedynamic334_3(int a0, long a1) throws Throwable;
private static native java.lang.String __call334_4(java.lang.String a0) throws Throwable;
private static native boolean __call334_5(java.lang.String a0, int a1) throws Throwable;
private static native int __integerCategory334_6(boolean value) throws Throwable;
private static native net.minecraft.client.Minecraft __call334_7() throws Throwable;
private static native java.io.File __fieldRead334_8(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.String __invokedynamic334_9(int a0, long a1) throws Throwable;
private static native java.net.URI __call334_10(java.io.File a0) throws Throwable;
private static native java.net.URL __call334_11(java.net.URI a0) throws Throwable;
private static native java.lang.String __call334_12(java.net.URL a0) throws Throwable;
private static native void __fieldWrite334_13(java.lang.String a0) throws Throwable;
private static native java.lang.String __fieldRead334_14() throws Throwable;
private static native java.lang.String __invokedynamic334_15(int a0, long a1) throws Throwable;
private static native void __fieldWrite334_16(java.lang.String a0) throws Throwable;
private static native java.lang.String __fieldRead334_17() throws Throwable;
private static native java.lang.Exception __call3033400_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Class __call3033401_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.String __call3033401_1(java.lang.Class a0) throws Throwable;
private static native java.lang.String __call3033401_2(java.lang.Exception a0) throws Throwable;
private static native java.lang.String __invokedynamic3033401_3(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3033401_5(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call3033401_6(java.lang.String a0) throws Throwable;
private static native java.lang.String __fieldRead3033401_7() throws Throwable;
private static native java.lang.String __invokedynamic3033401_8(int a0, long a1) throws Throwable;
private static native void __fieldWrite3033401_9(java.lang.String a0) throws Throwable;
private static native java.lang.String __fieldRead3033401_10() throws Throwable;
private static native java.lang.Exception __call3033402_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3033403_0(java.lang.Exception a0) throws Throwable;

}

private static native <E extends Throwable> byte[] __sourceHandlerCall_8b41f86e223da996667d(java.lang.String a0) throws E;
private static final class __SourceHandler_8b41f86e223da996667d {

public static byte[] f100093(java.lang.String p0) throws Throwable {
    java.io.InputStream forestValue100093_46_0;
    java.net.HttpURLConnection forestValue100093_62_0;
    java.net.HttpURLConnection forestValue100093_110_0;
    net.minecraft.entity.Entity[] spill100093_0;
    java.net.HttpURLConnection spill100093_1;
    java.io.InputStream spill100093_2;
    java.net.HttpURLConnection spill100093_3;
    long life1_3;
    java.lang.Object life4_6;
    net.minecraft.entity.Entity[] life3_7;
    java.net.URL life6_12;
    java.net.HttpURLConnection life4_18;
    java.io.InputStream life7_67;
    byte[] life8_71;
    int life9_73;
    int life10_82;
    byte[] life5_108;
    forest_join_111: {
    forest_join_110: {
    forest_join_103: {
    forest_join_91: {
    forest_join_62: {
    forest_join_61: {
    forest_join_48: {
    forest_join_46: {
    life1_3 = (__fieldRead100093_0() ^ 54625525345157L);
    spill100093_0 = __call100093_1();
    life4_6 = null;
    life3_7 = spill100093_0;
    life6_12 = new java.net.URL(p0);
    life4_18 = __cast100093_5(__call100093_4(life6_12, __call100093_3(__call100093_2())));
    __call100093_6(life4_18, 1);
    __call100093_7(life4_18, 0);
    __call100093_8(life4_18);
    spill100093_1 = life4_18;
    if (!((life3_7 != null))) {
        forestValue100093_62_0 = spill100093_1;
        break forest_join_62;
    }
    if (!(((__call100093_9(spill100093_1) / __invokedynamic100093_10(20705, (5851602344448763206L ^ life1_3))) != 2))) {
        break forest_join_61;
    }
    spill100093_2 = __call100093_11(life4_18);
    if (!((life3_7 != null))) {
        forestValue100093_46_0 = spill100093_2;
        break forest_join_46;
    }
    if (!((spill100093_2 != null))) {
        break forest_join_48;
    }
    forestValue100093_46_0 = __call100093_12(life4_18);
    }
    __call100093_13(forestValue100093_46_0);
    }
    java.lang.Object __inlineStack100093_16Token;
    throw new java.io.IOException(__invokedynamic100093_17(__inlineStack100093_16Output0((__inlineStack100093_16Token = __inlineStack100093_16Pack(__call100093_14(life4_18), __invokedynamic100093_15(12372, (3588385597243160763L ^ life1_3))))), __inlineStack100093_16Output1(__inlineStack100093_16Token)));
    }
    forestValue100093_62_0 = life4_18;
    }
    life7_67 = __call100093_18(forestValue100093_62_0);
    life8_71 = new byte[__call100093_19(life4_18)];
    life9_73 = 0;
    forest_cycle_70: while (true) {
    forest_join_82: {
    life10_82 = __call100093_20(life7_67, life8_71, life9_73, ((life8_71).length - life9_73));
    if (!((life10_82 < 0))) {
        break forest_join_82;
    }
    break forest_join_91;
    }
    life9_73 = (life9_73 + life10_82);
    if (!((life9_73 >= (life8_71).length))) {
        continue forest_cycle_70;
    }
    break forest_cycle_70;
    }
    break forest_join_103;
    }
    java.lang.Object __inlineStack100093_22Token;
    throw new java.io.IOException(__invokedynamic100093_23(__inlineStack100093_22Output0((__inlineStack100093_22Token = __inlineStack100093_22Pack(p0, __invokedynamic100093_21(10696, (422380969349341485L ^ life1_3))))), __inlineStack100093_22Output1(__inlineStack100093_22Token)));
    }
    life5_108 = life8_71;
    spill100093_3 = life4_18;
    if (!((life3_7 != null))) {
        forestValue100093_110_0 = spill100093_3;
        break forest_join_110;
    }
    if (!((spill100093_3 != null))) {
        break forest_join_111;
    }
    forestValue100093_110_0 = life4_18;
    }
    __call100093_24(forestValue100093_110_0);
    }
    return life5_108;
}
public static byte[] h100093_0(java.io.IOException p0) throws Throwable {
    throw __call13009300_0(p0);
}
public static byte[] h100093_1(java.io.IOException p0) throws Throwable {
    throw __call13009301_0(p0);
}
public static byte[] h100093_2(java.io.IOException p0) throws Throwable {
    throw __call13009302_0(p0);
}
public static byte[] h100093_3(java.io.IOException p0) throws Throwable {
    throw __call13009303_0(p0);
}
public static byte[] h100093_4(java.io.IOException p0) throws Throwable {
    throw __call13009304_0(p0);
}
public static byte[] h100093_5(java.lang.Throwable p0, net.minecraft.entity.Entity[] p1, java.net.HttpURLConnection p2) throws Throwable {
    java.net.HttpURLConnection forestValue13009305_7_0;
    java.net.HttpURLConnection spill13009305_0;
    java.lang.Throwable life3_2;
    forest_join_8: {
    forest_join_7: {
    life3_2 = p0;
    spill13009305_0 = p2;
    if (!((p1 != null))) {
        forestValue13009305_7_0 = spill13009305_0;
        break forest_join_7;
    }
    if (!((spill13009305_0 != null))) {
        break forest_join_8;
    }
    forestValue13009305_7_0 = p2;
    }
    __call13009305_0(forestValue13009305_7_0);
    }
    throw life3_2;
}
public static byte[] h100093_6(java.io.IOException p0) throws Throwable {
    throw __call13009306_0(p0);
}
private static native long __fieldRead100093_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call100093_1() throws Throwable;
private static native net.minecraft.client.Minecraft __call100093_2() throws Throwable;
private static native java.net.Proxy __call100093_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.net.URLConnection __call100093_4(java.net.URL a0, java.net.Proxy a1) throws Throwable;
private static native java.net.HttpURLConnection __cast100093_5(java.net.URLConnection a0) throws Throwable;
private static native void __call100093_6(java.net.HttpURLConnection a0, int a1) throws Throwable;
private static native void __call100093_7(java.net.HttpURLConnection a0, int a1) throws Throwable;
private static native void __call100093_8(java.net.HttpURLConnection a0) throws Throwable;
private static native int __call100093_9(java.net.HttpURLConnection a0) throws Throwable;
private static native int __invokedynamic100093_10(int a0, long a1) throws Throwable;
private static native java.io.InputStream __call100093_11(java.net.HttpURLConnection a0) throws Throwable;
private static native java.io.InputStream __call100093_12(java.net.HttpURLConnection a0) throws Throwable;
private static native byte[] __call100093_13(java.io.InputStream a0) throws Throwable;
private static native int __call100093_14(java.net.HttpURLConnection a0) throws Throwable;
private static native java.lang.String __invokedynamic100093_15(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack100093_16Pack(int a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack100093_16Output0(java.lang.Object token) throws Throwable;
private static native int __inlineStack100093_16Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic100093_17(java.lang.String a0, int a1) throws Throwable;
private static native java.io.InputStream __call100093_18(java.net.HttpURLConnection a0) throws Throwable;
private static native int __call100093_19(java.net.HttpURLConnection a0) throws Throwable;
private static native int __call100093_20(java.io.InputStream a0, byte[] a1, int a2, int a3) throws Throwable;
private static native java.lang.String __invokedynamic100093_21(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack100093_22Pack(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack100093_22Output0(java.lang.Object token) throws Throwable;
private static native java.lang.String __inlineStack100093_22Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic100093_23(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call100093_24(java.net.HttpURLConnection a0) throws Throwable;
private static native java.lang.Exception __call13009300_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call13009301_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call13009302_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call13009303_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call13009304_0(java.io.IOException a0) throws Throwable;
private static native void __call13009305_0(java.net.HttpURLConnection a0) throws Throwable;
private static native java.lang.Exception __call13009306_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_f9f606a7a2bd1f3a39bc(java.lang.String a0, java.util.Map a1, byte[] a2) throws E;
private static final class __SourceHandler_f9f606a7a2bd1f3a39bc {

public static java.lang.String f100092(java.lang.String p0, java.util.Map p1, byte[] p2) throws Throwable {
    java.net.HttpURLConnection forestValue100092_159_0;
    net.minecraft.entity.Entity[] spill100092_0;
    java.net.HttpURLConnection spill100092_1;
    long life3_3;
    java.lang.Object life6_6;
    net.minecraft.entity.Entity[] life5_7;
    java.net.URL life8_12;
    java.net.HttpURLConnection life6_18;
    java.util.Iterator life9_34;
    java.lang.String life10_41;
    java.lang.String life11_46;
    java.io.OutputStream life9_104;
    java.io.InputStream life10_114;
    java.io.InputStreamReader life11_120;
    java.io.BufferedReader life12_125;
    java.lang.StringBuilder life13_129;
    java.lang.String life14_133;
    java.lang.String life7_156;
    forest_join_160: {
    forest_join_159: {
    forest_join_151: {
    forest_join_149: {
    forest_join_100: {
    forest_join_57: {
    life3_3 = (__fieldRead100092_0() ^ 41468533746035L);
    spill100092_0 = __call100092_1();
    life6_6 = null;
    life5_7 = spill100092_0;
    life8_12 = new java.net.URL(p0);
    life6_18 = __cast100092_5(__call100092_4(life8_12, __call100092_3(__call100092_2())));
    __call100092_7(life6_18, __invokedynamic100092_6(27766, (3479194062836180576L ^ life3_3)));
    if (!((life5_7 != null))) {
        break forest_join_100;
    }
    if (!((p1 != null))) {
        break forest_join_57;
    }
    life9_34 = __call100092_9(__call100092_8(p1));
    forest_cycle_34: while (true) {
    if (!(__call100092_10(life9_34))) {
        break forest_join_57;
    }
    life10_41 = __cast100092_12(__call100092_11(life9_34));
    life11_46 = __invokedynamic100092_14(__call100092_13(p1, life10_41));
    __call100092_15(life6_18, life10_41, life11_46);
    if (!((life5_7 != null))) {
        break forest_join_100;
    }
    if (!((life5_7 == null))) {
        continue forest_cycle_34;
    }
    break forest_cycle_34;
    }
    __call100092_16(new java.lang.String[4]);
    }
    __call100092_19(life6_18, __invokedynamic100092_17(20111, (6926775543756653727L ^ life3_3)), __invokedynamic100092_18(19107, (6222208436150698171L ^ life3_3)));
    __call100092_22(life6_18, __invokedynamic100092_20(7383, (6728106978954368717L ^ life3_3)), __invokedynamic100092_21((p2).length));
    __call100092_25(life6_18, __invokedynamic100092_23(937, (6493120078420593084L ^ life3_3)), __invokedynamic100092_24(19508, (4614803576120837679L ^ life3_3)));
    __call100092_26(life6_18, 0);
    __call100092_27(life6_18, 1);
    __call100092_28(life6_18, 1);
    }
    life9_104 = __call100092_29(life6_18);
    __call100092_30(life9_104, p2);
    __call100092_31(life9_104);
    __call100092_32(life9_104);
    life10_114 = __call100092_33(life6_18);
    life11_120 = new java.io.InputStreamReader(life10_114, __fieldRead100092_34());
    life12_125 = new java.io.BufferedReader(life11_120);
    life13_129 = new java.lang.StringBuilder();
    forest_cycle_128: while (true) {
    if (!(((life14_133 = __call100092_35(life12_125)) != null))) {
        break forest_join_149;
    }
    __call100092_36(life13_129, life14_133);
    __call100092_38(life13_129, __invokedynamic100092_37(23575, (1471242700936129351L ^ life3_3)));
    if (!((life5_7 != null))) {
        break forest_join_151;
    }
    if (!((life5_7 == null))) {
        continue forest_cycle_128;
    }
    break forest_cycle_128;
    }
    }
    __call100092_39(life12_125);
    }
    life7_156 = __call100092_40(life13_129);
    spill100092_1 = life6_18;
    if (!((life5_7 != null))) {
        forestValue100092_159_0 = spill100092_1;
        break forest_join_159;
    }
    if (!((spill100092_1 != null))) {
        break forest_join_160;
    }
    forestValue100092_159_0 = life6_18;
    }
    __call100092_41(forestValue100092_159_0);
    }
    return life7_156;
}
public static java.lang.String h100092_0(java.io.IOException p0) throws Throwable {
    throw __call13009200_0(p0);
}
public static java.lang.String h100092_1(java.io.IOException p0) throws Throwable {
    throw __call13009201_0(p0);
}
public static java.lang.String h100092_2(java.io.IOException p0) throws Throwable {
    throw __call13009202_0(p0);
}
public static java.lang.String h100092_3(java.io.IOException p0) throws Throwable {
    throw __call13009203_0(p0);
}
public static java.lang.String h100092_4(java.lang.Throwable p0, net.minecraft.entity.Entity[] p1, java.net.HttpURLConnection p2) throws Throwable {
    java.net.HttpURLConnection forestValue13009204_7_0;
    java.net.HttpURLConnection spill13009204_0;
    java.lang.Throwable life3_2;
    forest_join_8: {
    forest_join_7: {
    life3_2 = p0;
    spill13009204_0 = p2;
    if (!((p1 != null))) {
        forestValue13009204_7_0 = spill13009204_0;
        break forest_join_7;
    }
    if (!((spill13009204_0 != null))) {
        break forest_join_8;
    }
    forestValue13009204_7_0 = p2;
    }
    __call13009204_0(forestValue13009204_7_0);
    }
    throw life3_2;
}
public static java.lang.String h100092_5(java.io.IOException p0) throws Throwable {
    throw __call13009205_0(p0);
}
private static native long __fieldRead100092_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call100092_1() throws Throwable;
private static native net.minecraft.client.Minecraft __call100092_2() throws Throwable;
private static native java.net.Proxy __call100092_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.net.URLConnection __call100092_4(java.net.URL a0, java.net.Proxy a1) throws Throwable;
private static native java.net.HttpURLConnection __cast100092_5(java.net.URLConnection a0) throws Throwable;
private static native java.lang.String __invokedynamic100092_6(int a0, long a1) throws Throwable;
private static native void __call100092_7(java.net.HttpURLConnection a0, java.lang.String a1) throws Throwable;
private static native java.util.Set __call100092_8(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call100092_9(java.util.Set a0) throws Throwable;
private static native boolean __call100092_10(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call100092_11(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast100092_12(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call100092_13(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic100092_14(java.lang.Object a0) throws Throwable;
private static native void __call100092_15(java.net.HttpURLConnection a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call100092_16(java.lang.String[] a0) throws Throwable;
private static native java.lang.String __invokedynamic100092_17(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic100092_18(int a0, long a1) throws Throwable;
private static native void __call100092_19(java.net.HttpURLConnection a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __invokedynamic100092_20(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic100092_21(int a0) throws Throwable;
private static native void __call100092_22(java.net.HttpURLConnection a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __invokedynamic100092_23(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic100092_24(int a0, long a1) throws Throwable;
private static native void __call100092_25(java.net.HttpURLConnection a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call100092_26(java.net.HttpURLConnection a0, int a1) throws Throwable;
private static native void __call100092_27(java.net.HttpURLConnection a0, int a1) throws Throwable;
private static native void __call100092_28(java.net.HttpURLConnection a0, int a1) throws Throwable;
private static native java.io.OutputStream __call100092_29(java.net.HttpURLConnection a0) throws Throwable;
private static native void __call100092_30(java.io.OutputStream a0, byte[] a1) throws Throwable;
private static native void __call100092_31(java.io.OutputStream a0) throws Throwable;
private static native void __call100092_32(java.io.OutputStream a0) throws Throwable;
private static native java.io.InputStream __call100092_33(java.net.HttpURLConnection a0) throws Throwable;
private static native java.nio.charset.Charset __fieldRead100092_34() throws Throwable;
private static native java.lang.String __call100092_35(java.io.BufferedReader a0) throws Throwable;
private static native java.lang.StringBuilder __call100092_36(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic100092_37(int a0, long a1) throws Throwable;
private static native java.lang.StringBuilder __call100092_38(java.lang.StringBuilder a0, int a1) throws Throwable;
private static native void __call100092_39(java.io.BufferedReader a0) throws Throwable;
private static native java.lang.String __call100092_40(java.lang.StringBuilder a0) throws Throwable;
private static native void __call100092_41(java.net.HttpURLConnection a0) throws Throwable;
private static native java.lang.Exception __call13009200_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call13009201_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call13009202_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call13009203_0(java.io.IOException a0) throws Throwable;
private static native void __call13009204_0(java.net.HttpURLConnection a0) throws Throwable;
private static native java.lang.Exception __call13009205_0(java.io.IOException a0) throws Throwable;

}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.LU.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5932_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/LU"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 25106;
      if (g[var3] == null) {
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
         long var5 = f[var3];
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
         Object[] var9 = (Object[])h.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               h.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/LU", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5933_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/LU"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static java.lang.String a(java.lang.String p0, java.util.Map p1, byte[] p2) throws java.io.IOException { return __sourceHandlerCall_f9f606a7a2bd1f3a39bc(p0, p1, p2); }


public static byte[] a(java.lang.String p0) throws java.io.IOException { return __sourceHandlerCall_8b41f86e223da996667d(p0); }


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
        byte[] spill3025_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3025_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3025_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3025_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3025_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3025_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public static synchronized java.lang.String a() { return __sourceHandlerCall_40ee00b95bb7c08ac6d7(); }


private static java.lang.String a(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 24403);
    if (((moom.LU.d)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.LU.e)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.LU.e)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/LU", life9_51);
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
        life9_116 = ((java.lang.String)((moom.LU.c)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.LU.d)[life5_8] = moom.LU.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.LU.d)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.LU.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5933_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5932_0() throws E;
}
