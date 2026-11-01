package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class LO {

private static java.util.Map a;

private static long b;

private static java.lang.String[] c;

private static java.lang.String[] d;

private static java.util.Map e;

private static long[] f;

private static java.lang.Integer[] g;

private static java.util.Map h;

public LO() {
super();
}


static {
b = ((long)(((moom._a)(moom._c.a(((long)(632216417365303268L)), ((long)(-559290574688338383L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(202133950017485L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.LO.b ^ 117425094374259L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill671_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill671_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill671_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill671_14 = new byte[8];
    (__sourceSpill671_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill671_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation671_16 = __sourceSpill671_14;
    ((javax.crypto.Cipher)(__sourceSpill671_11)).init(((int)(__sourceSpill671_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill671_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation671_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[20];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "\"4ûìûÎ~\fR^å\002iæ\034+&Mø\013ý+Fí{j Rz¯Ï\003(sÏ¢Zö\\:â\025Q=\031Ì7\036YP¥\030hökJ soj5¢{dÃL\t]U<.ØÞt/jm\031±!\bÀx\031`0·wEÕtèKÀ[ê³ebÿ\037ABÏáÁ¡÷ÒjËk3ÈåP\017/\\~/eôÐc\020ß\007#\030.n\017¶\002Æ¸K\007ÛK¹µ(«úÞié¹\020 uÆ^C¥]¿ _¨x«å@Ç~®ÆáZt¥\000¹3zL5KâòähtT\n*¤nb(VÓ«\003\r\020Á»\005-*ýç%ôª9ÐÙÝÊ×\f\013#£ú÷æÀ \006êQ)á\024xÙ ³Y¤z¼\013(\004Ç\0040&Å\0370CEK M³h¤ê:ª·\fÀ\021\0230bu\000à\027«n\013¿µxÝtìò\022ý\037\030é©`I\fäD±\r¢\005øÖ0Í\\U½1¾æ«\030å\017\râ·÷.Ý\177\bþ¸5Üö\026Ij'C&(\030zg\nö\017\020<R¨EôÀ\027ì5ç¨ð;\" \reî4Lá\0171µ\027èðÊ\023<>Çq6ÕÏÂ?Å¶)\020¾R_äTf)Þ\013\030¦§´ç 3Ú<%\016;¶¥ö½\0052 \n9pCojÉíÓQ\037MÉ hJ8\027I÷pLÎÄvÌp\t©\023eÒ\036\tÓ¾Nõ\fù0~\020\177:]&\020þ®°ºá¥cßZ\020Zm\024Jß?á¯LÑz\007Å\013"))).length();
    int local16_life24 = 32;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill671_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill671_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill671_29)).doFinal(((byte[])(__sourceSpill671_28)));
        java.lang.String __sourceSpill671_34 = ((java.lang.String)(moom.LO.a(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill671_35 = local20_life19;
        int __sourceSpill671_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill671_35)[__sourceSpill671_36] = __sourceSpill671_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "w_ÖÞL\022¼¢^«At\003°p;´\f\020Ò{¸XÁ$*òÐd\005Á\020`¶ÅÚ³ÕaõÌ\003%\035\037²\b"))).length();
    local16_life24 = 40;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill671_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill671_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill671_42)).doFinal(((byte[])(__sourceSpill671_41)));
        java.lang.String __sourceSpill671_47 = ((java.lang.String)(moom.LO.a(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill671_48 = local20_life19;
        int __sourceSpill671_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill671_48)[__sourceSpill671_49] = __sourceSpill671_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    c = ((java.lang.String[])(local20_life19));
    d = ((java.lang.String[])(new java.lang.String[20]));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill671_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill671_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill671_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill671_60 = new byte[8];
    (__sourceSpill671_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill671_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation671_62 = __sourceSpill671_60;
    ((javax.crypto.Cipher)(__sourceSpill671_57)).init(((int)(__sourceSpill671_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill671_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation671_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[2];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "×ÓëÞm´\032®qa°± s"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill671_71 = local4_life67;
        int __sourceSpill671_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill671_71)).substring(((int)(__sourceSpill671_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill671_76 = local6_life65;
        int __sourceSpill671_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill671_79 = new byte[8];
        (__sourceSpill671_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill671_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill671_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill671_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill671_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill671_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill671_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill671_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill671_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill671_80)).doFinal(((byte[])(__sourceSpill671_79)));
        (__sourceSpill671_76)[__sourceSpill671_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    f = ((long[])(local6_life65));
    g = ((java.lang.Integer[])(new java.lang.Integer[2]));
    a = ((java.util.Map)(new java.util.HashMap()));
}

private static native <E extends Throwable> boolean __sourceHandlerCall_f95e7daba95ffb58e2ad() throws E;
private static final class __SourceHandler_f95e7daba95ffb58e2ad {

public static boolean f796() throws Throwable {
    int lexicalValue796_25_0;
    int lexicalValue796_29_0;
    net.minecraft.entity.Entity[] spill796_0;
    boolean spill796_1;
    long life0_3;
    java.util.Iterator life3_8;
    net.minecraft.entity.Entity[] life2_9;
    moom.LQ life4_16;
    lexical_join_29: {
    lexical_join_28: {
    life0_3 = (__fieldRead796_0() ^ 80507280371623L);
    spill796_0 = __call796_1();
    life3_8 = __call796_4(__call796_3(__fieldRead796_2()));
    life2_9 = spill796_0;
    lexical_cycle_10: while (true) {
    lexical_join_26: {
    lexical_join_25: {
    if (!(__call796_5(life3_8))) {
        break lexical_join_28;
    }
    life4_16 = __cast796_7(__call796_6(life3_8));
    spill796_1 = __call796_8(life4_16);
    if (!((life2_9 != null))) {
        lexicalValue796_29_0 = __integerCategory796_9(spill796_1);
        break lexical_join_29;
    }
    if (!((life2_9 != null))) {
        lexicalValue796_25_0 = __integerCategory796_10(spill796_1);
        break lexical_join_25;
    }
    if (!(spill796_1)) {
        break lexical_join_26;
    }
    lexicalValue796_25_0 = 1;
    }
    return __integerCategory796_11(lexicalValue796_25_0);
    }
    if (!((life2_9 == null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    lexicalValue796_29_0 = 0;
    }
    return __integerCategory796_12(lexicalValue796_29_0);
}
public static void h796_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1079600_0(p0);
}
public static void h796_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1079601_0(p0);
}
private static native long __fieldRead796_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call796_1() throws Throwable;
private static native java.util.Map __fieldRead796_2() throws Throwable;
private static native java.util.Collection __call796_3(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call796_4(java.util.Collection a0) throws Throwable;
private static native boolean __call796_5(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call796_6(java.util.Iterator a0) throws Throwable;
private static native moom.LQ __cast796_7(java.lang.Object a0) throws Throwable;
private static native boolean __call796_8(moom.LQ a0) throws Throwable;
private static native int __integerCategory796_9(boolean value) throws Throwable;
private static native int __integerCategory796_10(boolean value) throws Throwable;
private static native boolean __integerCategory796_11(int value) throws Throwable;
private static native boolean __integerCategory796_12(int value) throws Throwable;
private static native java.lang.Exception __call1079600_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1079601_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_1d8b026e5f22f9e46add(java.lang.String a0, int a1, java.net.Proxy a2, moom.LQ a3) throws E;
private static final class __SourceHandler_1d8b026e5f22f9e46add {

public static void f99(java.lang.String p0, int p1, java.net.Proxy p2, moom.LQ p3) throws Throwable {
    java.lang.Object forwardValue99_24_0;
    net.minecraft.entity.Entity[] spill99_0;
    moom.LQ spill99_1;
    long life4_3;
    java.lang.String life7_8;
    moom.LQ life8_14;
    net.minecraft.entity.Entity[] life6_15;
    forward_join_25: {
    forward_join_24: {
    life4_3 = (__fieldRead99_0() ^ 99054009272740L);
    life7_8 = __call99_1(p0, p1, p2);
    spill99_0 = __call99_2();
    life8_14 = __cast99_5(__call99_4(__fieldRead99_3(), life7_8));
    life6_15 = spill99_0;
    spill99_1 = life8_14;
    if (!((life6_15 != null))) {
        forwardValue99_24_0 = spill99_1;
        break forward_join_24;
    }
    if (!((spill99_1 == p3))) {
        break forward_join_25;
    }
    forwardValue99_24_0 = __call99_7(__fieldRead99_6(), life7_8);
    }
    __discardScalar99_8(forwardValue99_24_0);
    }
    return;
}
public static void h99_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1009900_0(p0);
}
public static void h99_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1009901_0(p0);
}
private static native long __fieldRead99_0() throws Throwable;
private static native java.lang.String __call99_1(java.lang.String a0, int a1, java.net.Proxy a2) throws Throwable;
private static native net.minecraft.entity.Entity[] __call99_2() throws Throwable;
private static native java.util.Map __fieldRead99_3() throws Throwable;
private static native java.lang.Object __call99_4(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native moom.LQ __cast99_5(java.lang.Object a0) throws Throwable;
private static native java.util.Map __fieldRead99_6() throws Throwable;
private static native java.lang.Object __call99_7(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native void __discardScalar99_8(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1009900_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1009901_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> moom.LS __sourceHandlerCall_05575de0eca24a133193(java.lang.String a0, java.net.Proxy a1) throws E;
private static final class __SourceHandler_05575de0eca24a133193 {

public static moom.LS f107(java.lang.String p0, java.net.Proxy p1) throws Throwable {
    java.lang.String forwardValue107_36_0;
    int forwardValue107_52_0;
    net.minecraft.entity.Entity[] spill107_0;
    java.lang.String spill107_1;
    int spill107_2;
    java.util.LinkedHashMap spill107_3;
    java.lang.String spill107_4;
    long life2_3;
    java.net.URL life5_9;
    net.minecraft.entity.Entity[] life4_10;
    java.lang.String life6_41;
    java.lang.String life7_44;
    int life8_47;
    java.lang.String life9_66;
    java.lang.String life10_72;
    java.util.LinkedHashMap life11_76;
    byte[] life12_135;
    forward_join_53: {
    forward_join_52: {
    forward_join_36: {
    forward_join_34: {
    life2_3 = (__fieldRead107_0() ^ 13961474914398L);
    spill107_0 = __call107_1();
    life5_9 = new java.net.URL(p0);
    life4_10 = spill107_0;
    spill107_1 = __call107_2(life5_9);
    if (!((life4_10 != null))) {
        forwardValue107_36_0 = spill107_1;
        break forward_join_36;
    }
    if (!((!__call107_4(spill107_1, __invokedynamic107_3(29230, (3889525271516978184L ^ life2_3)))))) {
        break forward_join_34;
    }
    java.lang.Object __inlineStack107_6Token;
    throw new java.io.IOException(__invokedynamic107_7(__inlineStack107_6Output0((__inlineStack107_6Token = __inlineStack107_6Pack(life5_9, __invokedynamic107_5(29697, (4272000478260206120L ^ life2_3))))), __inlineStack107_6Output1(__inlineStack107_6Token)));
    }
    forwardValue107_36_0 = __call107_8(life5_9);
    }
    life6_41 = forwardValue107_36_0;
    life7_44 = __call107_9(life5_9);
    life8_47 = __call107_10(life5_9);
    spill107_2 = life8_47;
    if (!((life4_10 != null))) {
        forwardValue107_52_0 = spill107_2;
        break forward_join_52;
    }
    if (!((spill107_2 <= 0))) {
        break forward_join_53;
    }
    forwardValue107_52_0 = __invokedynamic107_11(18363, (1810390569296570967L ^ life2_3));
    }
    life8_47 = forwardValue107_52_0;
    }
    life9_66 = __invokedynamic107_12(29624, (7579345731812007314L ^ life2_3));
    life10_72 = __invokedynamic107_13(28347, (9166257940759543955L ^ life2_3));
    life11_76 = new java.util.LinkedHashMap();
    spill107_3 = life11_76;
    spill107_4 = __invokedynamic107_14(12689, (3452082816927686580L ^ life2_3));
    java.lang.String __stackOp107_18_0 = __call107_16(__invokedynamic107_15(30951, (984617917266892483L ^ life2_3)));
    java.lang.String __stackOp107_18_1 = __invokedynamic107_17(12019, (4188462000559014092L ^ life2_3));
    __call107_20(spill107_3, spill107_4, __invokedynamic107_19(__stackOp107_18_1, __stackOp107_18_0));
    __call107_22(life11_76, __invokedynamic107_21(30607, (1107790180579645873L ^ life2_3)), life7_44);
    __call107_25(life11_76, __invokedynamic107_23(8253, (2376199644898971137L ^ life2_3)), __invokedynamic107_24(7254, (8415668275585479290L ^ life2_3)));
    __call107_28(life11_76, __invokedynamic107_26(22318, (6358680600485017861L ^ life2_3)), __invokedynamic107_27(13685, (5431198491187960661L ^ life2_3)));
    life12_135 = new byte[0];
    return new moom.LS(life7_44, life8_47, p1, life9_66, life6_41, life10_72, life11_76, life12_135);
}
public static moom.LS h107_0(java.io.IOException p0) throws Throwable {
    throw __call3010700_0(p0);
}
public static moom.LS h107_1(java.io.IOException p0) throws Throwable {
    throw __call3010701_0(p0);
}
public static moom.LS h107_2(java.io.IOException p0) throws Throwable {
    throw __call3010702_0(p0);
}
private static native long __fieldRead107_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call107_1() throws Throwable;
private static native java.lang.String __call107_2(java.net.URL a0) throws Throwable;
private static native java.lang.String __invokedynamic107_3(int a0, long a1) throws Throwable;
private static native boolean __call107_4(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic107_5(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack107_6Pack(java.net.URL a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack107_6Output0(java.lang.Object token) throws Throwable;
private static native java.net.URL __inlineStack107_6Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic107_7(java.lang.String a0, java.net.URL a1) throws Throwable;
private static native java.lang.String __call107_8(java.net.URL a0) throws Throwable;
private static native java.lang.String __call107_9(java.net.URL a0) throws Throwable;
private static native int __call107_10(java.net.URL a0) throws Throwable;
private static native int __invokedynamic107_11(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic107_12(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic107_13(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic107_14(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic107_15(int a0, long a1) throws Throwable;
private static native java.lang.String __call107_16(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic107_17(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic107_19(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.Object __call107_20(java.util.LinkedHashMap a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __invokedynamic107_21(int a0, long a1) throws Throwable;
private static native java.lang.Object __call107_22(java.util.LinkedHashMap a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __invokedynamic107_23(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic107_24(int a0, long a1) throws Throwable;
private static native java.lang.Object __call107_25(java.util.LinkedHashMap a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __invokedynamic107_26(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic107_27(int a0, long a1) throws Throwable;
private static native java.lang.Object __call107_28(java.util.LinkedHashMap a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.Exception __call3010700_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3010701_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3010702_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> moom.LT __sourceHandlerCall_35cefbd923ba5d98fa6b(moom.LS a0) throws E;
private static final class __SourceHandler_35cefbd923ba5d98fa6b {

public static moom.LT f330(moom.LS p0) throws Throwable {
    int forestValue330_66_0;
    java.lang.Exception forestValue330_68_0;
    java.lang.Object forestValue330_84_0;
    moom.LT forestValue330_102_0;
    net.minecraft.entity.Entity[] spill330_0;
    java.lang.Exception spill330_1;
    int spill330_2;
    java.lang.Exception spill330_3;
    moom.LT spill330_4;
    moom.LT spill330_5;
    long life1_3;
    java.util.HashMap life4_8;
    java.lang.String life5_14;
    java.lang.String life6_20;
    moom.LP life7_25;
    net.minecraft.entity.Entity[] life3_26;
    java.util.HashMap life8_29;
    moom.LR life9_36;
    java.lang.Exception life10_50;
    moom.LT life11_90;
    forest_join_102: {
    forest_join_99: {
    forest_join_84: {
    forest_join_77: {
    forest_join_70: {
    forest_join_68: {
    forest_join_66: {
    forest_join_62: {
    life1_3 = (__fieldRead330_0() ^ 38918539449479L);
    spill330_0 = __call330_1();
    life4_8 = new java.util.HashMap();
    life5_14 = __invokedynamic330_2(32707, (5079567055850028340L ^ life1_3));
    life6_20 = __invokedynamic330_3(9826, (6640911838246659224L ^ life1_3));
    life7_25 = new moom.LP(life4_8);
    life3_26 = spill330_0;
    __monitorEnter330_4((life8_29 = life4_8));
    life9_36 = new moom.LR(p0, life7_25);
    __call330_5(life9_36);
    __call330_6(life4_8);
    life10_50 = __cast330_9(__call330_8(life4_8, __invokedynamic330_7(7507, (3367706288812449703L ^ life1_3))));
    spill330_1 = life10_50;
    if (!((life3_26 != null))) {
        forestValue330_84_0 = spill330_1;
        break forest_join_84;
    }
    if (!((spill330_1 != null))) {
        break forest_join_77;
    }
    spill330_2 = __instanceOf330_10(life10_50);
    if (!((life3_26 != null))) {
        forestValue330_66_0 = spill330_2;
        break forest_join_66;
    }
    if (!((spill330_2 != 0))) {
        break forest_join_62;
    }
    throw __cast330_11(life10_50);
    }
    spill330_3 = life10_50;
    if (!((life3_26 != null))) {
        forestValue330_68_0 = spill330_3;
        break forest_join_68;
    }
    forestValue330_66_0 = __instanceOf330_12(spill330_3);
    }
    if (!((forestValue330_66_0 != 0))) {
        break forest_join_70;
    }
    forestValue330_68_0 = life10_50;
    }
    throw __cast330_13(forestValue330_68_0);
    }
    throw new java.lang.RuntimeException(__call330_14(life10_50), life10_50);
    }
    forestValue330_84_0 = __call330_16(life4_8, __invokedynamic330_15(31537, (8260337036013746631L ^ life1_3)));
    }
    life11_90 = __cast330_17(forestValue330_84_0);
    spill330_4 = life11_90;
    if (!((life3_26 != null))) {
        forestValue330_102_0 = spill330_4;
        break forest_join_102;
    }
    if (!((spill330_4 == null))) {
        break forest_join_99;
    }
    throw new java.io.IOException(__invokedynamic330_18(6146, (2477767428905884390L ^ life1_3)));
    }
    spill330_5 = life11_90;
    __monitorExit330_19(life8_29);
    forestValue330_102_0 = spill330_5;
    }
    return forestValue330_102_0;
}
public static moom.LT h330_0(java.lang.InterruptedException p0, long p1, java.lang.Exception p2) throws Throwable {
    java.lang.InterruptedException life3_2;
    life3_2 = p0;
    throw new java.io.InterruptedIOException(__invokedynamic3033000_0(7972, (2093675257662725594L ^ p1)));
}
public static moom.LT h330_1(java.lang.InterruptedException p0) throws Throwable {
    throw __call3033001_0(p0);
}
public static moom.LT h330_2(java.lang.InterruptedException p0) throws Throwable {
    throw __call3033002_0(p0);
}
public static moom.LT h330_3(java.lang.InterruptedException p0) throws Throwable {
    throw __call3033003_0(p0);
}
public static moom.LT h330_4(java.lang.InterruptedException p0) throws Throwable {
    throw __call3033004_0(p0);
}
public static moom.LT h330_5(java.lang.InterruptedException p0) throws Throwable {
    throw __call3033005_0(p0);
}
public static moom.LT h330_6(java.lang.InterruptedException p0) throws Throwable {
    throw __call3033006_0(p0);
}
public static moom.LT h330_7(java.lang.InterruptedException p0) throws Throwable {
    throw __call3033007_0(p0);
}
public static moom.LT h330_8(java.lang.Throwable p0, java.util.HashMap p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __monitorExit3033008_0(p1);
    throw life2_2;
}
private static native long __fieldRead330_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call330_1() throws Throwable;
private static native java.lang.String __invokedynamic330_2(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic330_3(int a0, long a1) throws Throwable;
private static native void __monitorEnter330_4(java.util.HashMap a0) throws Throwable;
private static native void __call330_5(moom.LR a0) throws Throwable;
private static native void __call330_6(java.util.HashMap a0) throws Throwable;
private static native java.lang.String __invokedynamic330_7(int a0, long a1) throws Throwable;
private static native java.lang.Object __call330_8(java.util.HashMap a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __cast330_9(java.lang.Object a0) throws Throwable;
private static native int __instanceOf330_10(java.lang.Exception a0) throws Throwable;
private static native java.io.IOException __cast330_11(java.lang.Exception a0) throws Throwable;
private static native int __instanceOf330_12(java.lang.Exception a0) throws Throwable;
private static native java.lang.RuntimeException __cast330_13(java.lang.Exception a0) throws Throwable;
private static native java.lang.String __call330_14(java.lang.Exception a0) throws Throwable;
private static native java.lang.String __invokedynamic330_15(int a0, long a1) throws Throwable;
private static native java.lang.Object __call330_16(java.util.HashMap a0, java.lang.String a1) throws Throwable;
private static native moom.LT __cast330_17(java.lang.Object a0) throws Throwable;
private static native java.lang.String __invokedynamic330_18(int a0, long a1) throws Throwable;
private static native void __monitorExit330_19(java.util.HashMap a0) throws Throwable;
private static native java.lang.String __invokedynamic3033000_0(int a0, long a1) throws Throwable;
private static native java.lang.Exception __call3033001_0(java.lang.InterruptedException a0) throws Throwable;
private static native java.lang.Exception __call3033002_0(java.lang.InterruptedException a0) throws Throwable;
private static native java.lang.Exception __call3033003_0(java.lang.InterruptedException a0) throws Throwable;
private static native java.lang.Exception __call3033004_0(java.lang.InterruptedException a0) throws Throwable;
private static native java.lang.Exception __call3033005_0(java.lang.InterruptedException a0) throws Throwable;
private static native java.lang.Exception __call3033006_0(java.lang.InterruptedException a0) throws Throwable;
private static native java.lang.Exception __call3033007_0(java.lang.InterruptedException a0) throws Throwable;
private static native void __monitorExit3033008_0(java.util.HashMap a0) throws Throwable;

}

private static native <E extends Throwable> byte[] __sourceHandlerCall_8d40e32e304bcbc14d81(java.lang.String a0, java.net.Proxy a1) throws E;
private static final class __SourceHandler_8d40e32e304bcbc14d81 {

public static byte[] f31(java.lang.String p0, java.net.Proxy p1) throws Throwable {
    java.lang.String spill31_0;
    java.lang.String joinValue31_0_0;
    moom.LT spill31_1;
    moom.LT joinValue31_1_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    java.net.URL life5_23;
    java.io.InputStream life6_26;
    moom.LS life5_33;
    moom.LT life6_36;
    life2_3 = (__fieldRead31_0() ^ 6105133172978L);
    life4_5 = __call31_1();
    spill31_0 = p0;
    if ((life4_5 != null)) {
        if (__call31_3(spill31_0, __invokedynamic31_2(18190, (3609469339036211584L ^ life2_3)))) {
        life5_23 = new java.net.URL(p0);
        life6_26 = __call31_4(life5_23);
        return __call31_5(life6_26);
    }
        joinValue31_0_0 = p0;
    } else {
        joinValue31_0_0 = spill31_0;
    }
    life5_33 = __call31_6(joinValue31_0_0, p1);
    life6_36 = __call31_7(life5_33);
    spill31_1 = life6_36;
    if ((life4_5 != null)) {
        if (((__call31_8(spill31_1) / __invokedynamic31_9(26182, (8940459346317998855L ^ life2_3))) != 2)) {
        java.lang.Object __inlineStack31_12Token;
        throw new java.io.IOException(__invokedynamic31_13(__inlineStack31_12Output0((__inlineStack31_12Token = __inlineStack31_12Pack(__call31_10(life6_36), __invokedynamic31_11(4611, (1859650662629674126L ^ life2_3))))), __inlineStack31_12Output1(__inlineStack31_12Token)));
    }
        joinValue31_1_0 = life6_36;
    } else {
        joinValue31_1_0 = spill31_1;
    }
    return __call31_14(joinValue31_1_0);
}
public static byte[] h31_0(java.io.IOException p0) throws Throwable {
    throw __call3003100_0(p0);
}
public static byte[] h31_1(java.io.IOException p0) throws Throwable {
    throw __call3003101_0(p0);
}
public static byte[] h31_2(java.io.IOException p0) throws Throwable {
    throw __call3003102_0(p0);
}
private static native long __fieldRead31_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call31_1() throws Throwable;
private static native java.lang.String __invokedynamic31_2(int a0, long a1) throws Throwable;
private static native boolean __call31_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.io.InputStream __call31_4(java.net.URL a0) throws Throwable;
private static native byte[] __call31_5(java.io.InputStream a0) throws Throwable;
private static native moom.LS __call31_6(java.lang.String a0, java.net.Proxy a1) throws Throwable;
private static native moom.LT __call31_7(moom.LS a0) throws Throwable;
private static native int __call31_8(moom.LT a0) throws Throwable;
private static native int __invokedynamic31_9(int a0, long a1) throws Throwable;
private static native int __call31_10(moom.LT a0) throws Throwable;
private static native java.lang.String __invokedynamic31_11(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack31_12Pack(int a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack31_12Output0(java.lang.Object token) throws Throwable;
private static native int __inlineStack31_12Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic31_13(java.lang.String a0, int a1) throws Throwable;
private static native byte[] __call31_14(moom.LT a0) throws Throwable;
private static native java.lang.Exception __call3003100_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3003101_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3003102_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> moom.LQ __sourceHandlerCall_f54912a57c6591b9688b(java.lang.String a0, int a1, java.net.Proxy a2) throws E;
private static final class __SourceHandler_f54912a57c6591b9688b {

public static moom.LQ f799(java.lang.String p0, int p1, java.net.Proxy p2) throws Throwable {
    moom.LQ forwardValue799_33_0;
    net.minecraft.entity.Entity[] spill799_0;
    moom.LQ spill799_1;
    long life3_3;
    java.lang.String life6_9;
    moom.LQ life7_14;
    net.minecraft.entity.Entity[] life5_15;
    forward_join_33: {
    forward_join_32: {
    life3_3 = (__fieldRead799_0() ^ 125634863583198L);
    spill799_0 = __call799_1();
    life6_9 = __call799_2(p0, p1, p2);
    life7_14 = __cast799_5(__call799_4(__fieldRead799_3(), life6_9));
    life5_15 = spill799_0;
    spill799_1 = life7_14;
    if (!((life5_15 != null))) {
        forwardValue799_33_0 = spill799_1;
        break forward_join_33;
    }
    if (!((spill799_1 == null))) {
        break forward_join_32;
    }
    life7_14 = new moom.LQ(p0, p1, p2);
    __call799_7(__fieldRead799_6(), life6_9, life7_14);
    }
    forwardValue799_33_0 = life7_14;
    }
    return forwardValue799_33_0;
}
public static void h799_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1079900_0(p0);
}
private static native long __fieldRead799_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call799_1() throws Throwable;
private static native java.lang.String __call799_2(java.lang.String a0, int a1, java.net.Proxy a2) throws Throwable;
private static native java.util.Map __fieldRead799_3() throws Throwable;
private static native java.lang.Object __call799_4(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native moom.LQ __cast799_5(java.lang.Object a0) throws Throwable;
private static native java.util.Map __fieldRead799_6() throws Throwable;
private static native java.lang.Object __call799_7(java.util.Map a0, java.lang.String a1, moom.LQ a2) throws Throwable;
private static native java.lang.Exception __call1079900_0(java.lang.RuntimeException a0) throws Throwable;

}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5894_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/LO"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 4206;
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
            throw new RuntimeException("moom/LO", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.LO.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.LO.a(((int)(local4)), ((long)(local5)));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 5036);
    if (((moom.LO.d)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.LO.e)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.LO.e)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/LO", life9_51);
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
        life9_116 = ((java.lang.String)((moom.LO.c)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.LO.d)[life5_8] = moom.LO.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.LO.d)[life5_8];
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
        byte[] spill3022_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3022_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3022_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3022_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3022_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3022_2)[life4_9];
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


public static moom.LT a(moom.LS p0) throws java.io.IOException { return __sourceHandlerCall_35cefbd923ba5d98fa6b(p0); }


public static void a(java.lang.String p0, moom.LN p1) throws java.io.IOException {
moom.LO.a(((java.lang.String)(p0)), ((moom.LN)(p1)), ((java.net.Proxy)(java.net.Proxy.NO_PROXY)));
    return;
}


public static void a(java.lang.String p0, moom.LN p1, java.net.Proxy p2) throws java.io.IOException {
moom.LS local3 = moom.LO.a(((java.lang.String)(p0)), ((java.net.Proxy)(p2)));
    moom.LR local4 = new moom.LR(local3, p1);
    moom.LO.a(((moom.LR)(local4)));
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5898_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/LO"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static byte[] a(java.lang.String p0) throws java.io.IOException {
return moom.LO.a__ArrayByte(((java.lang.String)(p0)), ((java.net.Proxy)(java.net.Proxy.NO_PROXY)));
}


private static java.lang.String a(java.lang.String p0, int p1, java.net.Proxy p2) {
return __sourceIntrinsic_dea2ec952e04_originalDynamicSite1263_0(p0, p1, p2);
}


private static synchronized void a(java.lang.String p0, int p1, java.net.Proxy p2, moom.LQ p3) { __sourceHandlerCall_1d8b026e5f22f9e46add(p0, p1, p2, p3); }


private static synchronized moom.LQ a__LQ(java.lang.String p0, int p1, java.net.Proxy p2) { return __sourceHandlerCall_f54912a57c6591b9688b(p0, p1, p2); }


public static moom.LS a(java.lang.String p0, java.net.Proxy p1) throws java.io.IOException { return __sourceHandlerCall_05575de0eca24a133193(p0, p1); }


public static boolean a() { return __sourceHandlerCall_f95e7daba95ffb58e2ad(); }


public static void a(moom.LR p0) {
net.minecraft.entity.Entity[] spill921_0;
    long life1_3;
    moom.LS life4_7;
    net.minecraft.entity.Entity[] life3_8;
    moom.LQ life5_16;
    lexical_join_39: {
    life1_3 = (moom.LO.b ^ 92126511248665L);
    spill921_0 = moom.LT.b();
    life4_7 = ((moom.LR)(p0)).a__LS();
    life3_8 = spill921_0;
    life5_16 = moom.LO.a__LQ(((java.lang.String)(((moom.LS)(life4_7)).a__String())), ((int)(((moom.LS)(life4_7)).a())), ((java.net.Proxy)(((moom.LS)(life4_7)).a__Proxy())));
    lexical_cycle_17: while (true) {
    if (!((!((moom.LQ)(life5_16)).a__Boolean(((moom.LR)(p0)))))) {
        break lexical_join_39;
    }
    moom.LO.a(((java.lang.String)(((moom.LS)(life4_7)).a__String())), ((int)(((moom.LS)(life4_7)).a())), ((java.net.Proxy)(((moom.LS)(life4_7)).a__Proxy())), ((moom.LQ)(life5_16)));
    life5_16 = moom.LO.a__LQ(((java.lang.String)(((moom.LS)(life4_7)).a__String())), ((int)(((moom.LS)(life4_7)).a())), ((java.net.Proxy)(((moom.LS)(life4_7)).a__Proxy())));
    if (!((life3_8 == null))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    return;
}


public static byte[] a__ArrayByte(java.lang.String p0, java.net.Proxy p1) throws java.io.IOException { return __sourceHandlerCall_8d40e32e304bcbc14d81(p0, p1); }


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_dea2ec952e04_originalDynamicSite1263_0(java.lang.String a0, int a1, java.net.Proxy a2) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5898_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5894_0() throws E;
}
