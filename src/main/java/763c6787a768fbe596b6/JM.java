package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class JM {

private static com.google.common.base.Splitter a;

private static java.util.regex.Pattern b;

private static net.minecraft.entity.Entity[] c;

private static long d;

private static java.lang.String[] e;

private static java.lang.String[] f;

private static java.util.Map g;

private static long[] h;

private static java.lang.Integer[] i;

private static java.util.Map j;

public JM() {
super();
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(5286305690720738537L)), ((long)(-202688919109956456L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(99509899352669L)))));
    long local20_life6 = (moom.JM.d ^ 74851094478673L);
    net.minecraft.entity.Entity[] __sourceSpill597_8 = new net.minecraft.entity.Entity[3];
    g = ((java.util.Map)(new java.util.HashMap(13)));
    moom.JM.b(((net.minecraft.entity.Entity[])(__sourceSpill597_8)));
    javax.crypto.Cipher local11_life11;
    javax.crypto.Cipher __sourceSpill597_13 = (local11_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill597_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill597_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill597_16 = new byte[8];
    (__sourceSpill597_16)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local12_life17 = 1;
    while ((local12_life17 < 8)) {
        (__sourceSpill597_16)[local12_life17] = ((byte) ((int) ((local20_life6 << (local12_life17 * 8)) >>> 56)));
        local12_life17 += 1;
    }
    byte[] __sourcePreallocation597_18 = __sourceSpill597_16;
    ((javax.crypto.Cipher)(__sourceSpill597_13)).init(((int)(__sourceSpill597_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill597_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation597_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local18_life21 = new java.lang.String[10];
    int local16_life22 = 0;
    java.lang.String local15_life23;
    int local17_life25 = ((java.lang.String)((local15_life23 = "~mEt\001Ô;_\034\024ü°Ã<(qÅV%4å:|\025úQà¿ÓÅÝ¹Ö\007¿ýÏÖY8\006')w¶H£;RRx?;\020\001\000ªáùªl2IÒ¹I Ú\032^3Ït\005±ý­ÒÿRn\030«Òb\f\031}yAûP:s5 `üR{\022^óWC\032ZðO©Ô·±Ðõ«ÐYÚ³2&\026BëXH(õ8°0cí\003\022:;îÿë\000\021F×öC%%\033\020}Mà\024ÇÞvÿéÄé(ç,4?J2Åðér\\g\rÚIú\004Jjg¥q¬&Á\002V¦ûË\036\031Æ¢É \020_°Þª¢Nätá\b·üm\033½"))).length();
    int local14_life26 = 16;
    int local13_life27 = -1;
    while (true) {
        local13_life27 += 1;
        byte[] __sourceSpill597_30 = ((java.lang.String)(((java.lang.String)(local15_life23)).substring(((int)(local13_life27)), ((int)((local13_life27 + local14_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill597_31 = local11_life11;
        byte[] local19_life33 = ((javax.crypto.Cipher)(__sourceSpill597_31)).doFinal(((byte[])(__sourceSpill597_30)));
        java.lang.String __sourceSpill597_36 = ((java.lang.String)(moom.JM.a(((byte[])(local19_life33))))).intern();
        java.lang.String[] __sourceSpill597_37 = local18_life21;
        int __sourceSpill597_38 = local16_life22;
        local16_life22 += 1;
        (__sourceSpill597_37)[__sourceSpill597_38] = __sourceSpill597_36;
        if (!(((local13_life27 = (local13_life27 + local14_life26)) < local17_life25))) { break; }
        local14_life26 = ((java.lang.String)(local15_life23)).charAt(((int)(local13_life27)));
    }
    local17_life25 = ((java.lang.String)((local15_life23 = ")\rfÍ®X%0Oé>É\023Ôþåô®çpùðJ¥Ð­0'Úµ\030µ\003D~jù(T­[\022Åºk/BT¡k \016Íâ"))).length();
    local14_life26 = 32;
    local13_life27 = -1;
    while (true) {
        local13_life27 += 1;
        byte[] __sourceSpill597_43 = ((java.lang.String)(((java.lang.String)(local15_life23)).substring(((int)(local13_life27)), ((int)((local13_life27 + local14_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill597_44 = local11_life11;
        byte[] local19_life46 = ((javax.crypto.Cipher)(__sourceSpill597_44)).doFinal(((byte[])(__sourceSpill597_43)));
        java.lang.String __sourceSpill597_49 = ((java.lang.String)(moom.JM.a(((byte[])(local19_life46))))).intern();
        java.lang.String[] __sourceSpill597_50 = local18_life21;
        int __sourceSpill597_51 = local16_life22;
        local16_life22 += 1;
        (__sourceSpill597_50)[__sourceSpill597_51] = __sourceSpill597_49;
        if (!(((local13_life27 = (local13_life27 + local14_life26)) < local17_life25))) { break; }
        local14_life26 = ((java.lang.String)(local15_life23)).charAt(((int)(local13_life27)));
    }
    e = ((java.lang.String[])(local18_life21));
    f = ((java.lang.String[])(new java.lang.String[10]));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life57;
    javax.crypto.Cipher __sourceSpill597_59 = (local0_life57 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill597_60 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill597_61 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill597_62 = new byte[8];
    (__sourceSpill597_62)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local1_life63 = 1;
    while ((local1_life63 < 8)) {
        (__sourceSpill597_62)[local1_life63] = ((byte) ((int) ((local20_life6 << (local1_life63 * 8)) >>> 56)));
        local1_life63 += 1;
    }
    byte[] __sourcePreallocation597_64 = __sourceSpill597_62;
    ((javax.crypto.Cipher)(__sourceSpill597_59)).init(((int)(__sourceSpill597_60)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill597_61)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation597_64)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life67 = new long[2];
    int local3_life68 = 0;
    java.lang.String local4_life69;
    int local5_life71 = ((java.lang.String)((local4_life69 = "\"èÒÈt\023Â·kík?\017"))).length();
    int local2_life72 = 0;
    do {
        java.lang.String __sourceSpill597_73 = local4_life69;
        int __sourceSpill597_74 = local2_life72;
        local2_life72 += 8;
        byte[] local7_life77 = ((java.lang.String)(((java.lang.String)(__sourceSpill597_73)).substring(((int)(__sourceSpill597_74)), ((int)(local2_life72))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill597_78 = local6_life67;
        int __sourceSpill597_79 = local3_life68;
        local3_life68 += 1;
        long local8_life80 = (((((((((((long) (local7_life77)[0]) & 255L) << 56) | ((((long) (local7_life77)[1]) & 255L) << 48)) | ((((long) (local7_life77)[2]) & 255L) << 40)) | ((((long) (local7_life77)[3]) & 255L) << 32)) | ((((long) (local7_life77)[4]) & 255L) << 24)) | ((((long) (local7_life77)[5]) & 255L) << 16)) | ((((long) (local7_life77)[6]) & 255L) << 8)) | (((long) (local7_life77)[7]) & 255L));
        byte[] __sourceSpill597_81 = new byte[8];
        (__sourceSpill597_81)[0] = ((byte) ((int) (local8_life80 >>> 56)));
        (__sourceSpill597_81)[1] = ((byte) ((int) (local8_life80 >>> 48)));
        (__sourceSpill597_81)[2] = ((byte) ((int) (local8_life80 >>> 40)));
        (__sourceSpill597_81)[3] = ((byte) ((int) (local8_life80 >>> 32)));
        (__sourceSpill597_81)[4] = ((byte) ((int) (local8_life80 >>> 24)));
        (__sourceSpill597_81)[5] = ((byte) ((int) (local8_life80 >>> 16)));
        (__sourceSpill597_81)[6] = ((byte) ((int) (local8_life80 >>> 8)));
        (__sourceSpill597_81)[7] = ((byte) ((int) local8_life80));
        javax.crypto.Cipher __sourceSpill597_82 = local0_life57;
        byte[] local10_life84 = ((javax.crypto.Cipher)(__sourceSpill597_82)).doFinal(((byte[])(__sourceSpill597_81)));
        (__sourceSpill597_78)[__sourceSpill597_79] = (((((((((((long) (local10_life84)[0]) & 255L) << 56) | ((((long) (local10_life84)[1]) & 255L) << 48)) | ((((long) (local10_life84)[2]) & 255L) << 40)) | ((((long) (local10_life84)[3]) & 255L) << 32)) | ((((long) (local10_life84)[4]) & 255L) << 24)) | ((((long) (local10_life84)[5]) & 255L) << 16)) | ((((long) (local10_life84)[6]) & 255L) << 8)) | (((long) (local10_life84)[7]) & 255L));
    } while ((!(local2_life72 >= local5_life71)));
    h = ((long[])(local6_life67));
    i = ((java.lang.Integer[])(new java.lang.Integer[2]));
    a = ((com.google.common.base.Splitter)(((com.google.common.base.Splitter)(com.google.common.base.Splitter.on(((char)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite597_87(19616, (2211586194508205558L ^ local20_life6))))))).limit(((int)(2)))));
    b = ((java.util.regex.Pattern)(java.util.regex.Pattern.compile(((java.lang.String)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite597_91(10668, (133921675488725865L ^ local20_life6)))))));
}

private static native <E extends Throwable> void __sourceHandlerCall_be8ab4705e133ed069c7(java.io.InputStream a0, java.util.Map a1) throws E;
private static final class __SourceHandler_be8ab4705e133ed069c7 {

public static void f663(java.io.InputStream p0, java.util.Map p1) throws Throwable {
    int lexicalValue663_28_0;
    java.lang.String[] lexicalValue663_48_0;
    net.minecraft.entity.Entity[] spill663_0;
    boolean spill663_1;
    java.lang.String[] spill663_2;
    long life2_3;
    java.util.Iterator life5_9;
    net.minecraft.entity.Entity[] life4_10;
    java.lang.String life6_19;
    java.lang.String[] life7_46;
    java.lang.String life8_62;
    java.lang.String life9_74;
    lexical_join_70: {
    life2_3 = (__fieldRead663_0() ^ 97172615352193L);
    spill663_0 = __call663_1();
    life5_9 = __call663_4(__call663_3(p0, __fieldRead663_2()));
    life4_10 = spill663_0;
    __call663_5(p0);
    lexical_cycle_13: while (true) {
    lexical_join_68: {
    lexical_join_48: {
    lexical_join_28: {
    if (!(__call663_6(life5_9))) {
        break lexical_join_70;
    }
    life6_19 = __cast663_8(__call663_7(life5_9));
    spill663_1 = __call663_9(life6_19);
    if (!((life4_10 != null))) {
        lexicalValue663_28_0 = __integerCategory663_10(spill663_1);
        break lexical_join_28;
    }
    if (!((!spill663_1))) {
        break lexical_join_68;
    }
    lexicalValue663_28_0 = __integerCategory663_12(__call663_11(life6_19, 0));
    }
    if (!((lexicalValue663_28_0 != __invokedynamic663_13(22391, (4848626451031926512L ^ life2_3))))) {
        break lexical_join_68;
    }
    life7_46 = __cast663_18(__call663_17(__call663_15(__fieldRead663_14(), life6_19), __classLiteral663_16()));
    spill663_2 = life7_46;
    if (!((life4_10 != null))) {
        lexicalValue663_48_0 = spill663_2;
        break lexical_join_48;
    }
    if (!(((spill663_2).length == 2))) {
        break lexical_join_68;
    }
    lexicalValue663_48_0 = life7_46;
    }
    life8_62 = (lexicalValue663_48_0)[0];
    life9_74 = __call663_22(__call663_20(__fieldRead663_19(), (life7_46)[1]), __invokedynamic663_21(19976, (8501852149489114142L ^ life2_3)));
    __call663_23(p1, life8_62, life9_74);
    }
    if (!((life4_10 == null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    return;
}
public static void h663_0(java.io.IOException p0) throws Throwable {
    throw __call1066300_0(p0);
}
public static void h663_1(java.io.IOException p0) throws Throwable {
    throw __call1066301_0(p0);
}
public static void h663_2(java.io.IOException p0) throws Throwable {
    throw __call1066302_0(p0);
}
public static void h663_3(java.io.IOException p0) throws Throwable {
    throw __call1066303_0(p0);
}
private static native long __fieldRead663_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call663_1() throws Throwable;
private static native java.nio.charset.Charset __fieldRead663_2() throws Throwable;
private static native java.util.List __call663_3(java.io.InputStream a0, java.nio.charset.Charset a1) throws Throwable;
private static native java.util.Iterator __call663_4(java.util.List a0) throws Throwable;
private static native void __call663_5(java.io.InputStream a0) throws Throwable;
private static native boolean __call663_6(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call663_7(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast663_8(java.lang.Object a0) throws Throwable;
private static native boolean __call663_9(java.lang.String a0) throws Throwable;
private static native int __integerCategory663_10(boolean value) throws Throwable;
private static native char __call663_11(java.lang.String a0, int a1) throws Throwable;
private static native int __integerCategory663_12(char value) throws Throwable;
private static native int __invokedynamic663_13(int a0, long a1) throws Throwable;
private static native com.google.common.base.Splitter __fieldRead663_14() throws Throwable;
private static native java.lang.Iterable __call663_15(com.google.common.base.Splitter a0, java.lang.String a1) throws Throwable;
private static native java.lang.Object __classLiteral663_16() throws Throwable;
private static native java.lang.Object[] __call663_17(java.lang.Iterable a0, java.lang.Object a1) throws Throwable;
private static native java.lang.String[] __cast663_18(java.lang.Object[] a0) throws Throwable;
private static native java.util.regex.Pattern __fieldRead663_19() throws Throwable;
private static native java.util.regex.Matcher __call663_20(java.util.regex.Pattern a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic663_21(int a0, long a1) throws Throwable;
private static native java.lang.String __call663_22(java.util.regex.Matcher a0, java.lang.String a1) throws Throwable;
private static native java.lang.Object __call663_23(java.util.Map a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.Exception __call1066300_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1066301_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1066302_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1066303_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_c9d4f7e6acae0535bcc8(java.lang.String a0, java.lang.String a1) throws E;
private static final class __SourceHandler_c9d4f7e6acae0535bcc8 {

public static java.lang.String f664(java.lang.String p0, java.lang.String p1) throws Throwable {
    java.lang.String forwardValue664_16_0;
    java.lang.String forwardValue664_22_0;
    java.lang.String forwardValue664_24_0;
    net.minecraft.entity.Entity[] spill664_0;
    java.lang.String spill664_1;
    long life2_3;
    java.lang.String life5_9;
    net.minecraft.entity.Entity[] life4_10;
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    forward_join_16: {
    life2_3 = (__fieldRead664_0() ^ 57066105934524L);
    spill664_0 = __call664_1();
    life5_9 = __call664_2(p0, new java.lang.Object[0]);
    life4_10 = spill664_0;
    spill664_1 = life5_9;
    if (!((life4_10 != null))) {
        forwardValue664_16_0 = spill664_1;
        break forward_join_16;
    }
    if (!((spill664_1 != null))) {
        break forward_join_23;
    }
    forwardValue664_16_0 = life5_9;
    }
    if (!((life4_10 != null))) {
        forwardValue664_22_0 = forwardValue664_16_0;
        break forward_join_22;
    }
    if (!((!__call664_3(forwardValue664_16_0, p0)))) {
        break forward_join_23;
    }
    forwardValue664_22_0 = life5_9;
    }
    forwardValue664_24_0 = forwardValue664_22_0;
    break forward_join_24;
    }
    forwardValue664_24_0 = p1;
    }
    return forwardValue664_24_0;
}
public static void h664_0(moom.Oo p0) throws Throwable {
    throw __call1066400_0(p0);
}
public static void h664_1(moom.Oo p0) throws Throwable {
    throw __call1066401_0(p0);
}
public static void h664_2(moom.Oo p0) throws Throwable {
    throw __call1066402_0(p0);
}
private static native long __fieldRead664_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call664_1() throws Throwable;
private static native java.lang.String __call664_2(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native boolean __call664_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1066400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1066401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1066402_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_20bf0c47544fe8c004a9(net.minecraft.client.resources.IResourcePack a0, java.lang.String[] a1, java.util.Map a2) throws E;
private static final class __SourceHandler_20bf0c47544fe8c004a9 {

public static void f128(net.minecraft.client.resources.IResourcePack p0, java.lang.String[] p1, java.util.Map p2) throws Throwable {
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    java.lang.String[] life6_7;
    int life7_10;
    int life8_12;
    java.lang.String life9_19;
    moom.DD life10_24;
    java.io.InputStream life11_42;
    lexical_join_47: {
    life3_3 = (__fieldRead128_0() ^ 122354677347778L);
    life5_5 = __call128_1();
    life6_7 = p1;
    life7_10 = (life6_7).length;
    life8_12 = 0;
    lexical_cycle_13: while (true) {
    lexical_join_45: {
    lexical_join_44: {
    if (!((life8_12 < life7_10))) {
        break lexical_join_47;
    }
    life9_19 = (life6_7)[life8_12];
    life10_24 = new moom.DD(life9_19);
    if (!((life5_5 != null))) {
        break lexical_join_47;
    }
    if (!((life5_5 != null))) {
        break lexical_join_45;
    }
    if (!(__call128_2(p0, life10_24))) {
        break lexical_join_44;
    }
    life11_42 = __call128_3(p0, life10_24);
    if (!((life5_5 != null))) {
        break lexical_join_45;
    }
    if (!((life11_42 != null))) {
        break lexical_join_44;
    }
    __call128_4(life11_42, p2);
    }
    life8_12 += 1;
    }
    if (!((life5_5 == null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    return;
}
public static void h128_0(java.io.IOException p0) throws Throwable {
    throw __call2012800_0(p0);
}
public static void h128_1(java.io.IOException p0) throws Throwable {
    throw __call2012801_0(p0);
}
public static void h128_2(java.io.IOException p0) throws Throwable {
    throw __call2012802_0(p0);
}
public static void h128_3(java.io.IOException p0) throws Throwable {
    throw __call2012803_0(p0);
}
public static void h128_4(java.io.IOException p0) throws Throwable {
    java.io.IOException local1 = p0;
    __call2012804_0(local1);
    return;
}
private static native long __fieldRead128_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call128_1() throws Throwable;
private static native boolean __call128_2(net.minecraft.client.resources.IResourcePack a0, moom.DD a1) throws Throwable;
private static native java.io.InputStream __call128_3(net.minecraft.client.resources.IResourcePack a0, moom.DD a1) throws Throwable;
private static native void __call128_4(java.io.InputStream a0, java.util.Map a1) throws Throwable;
private static native java.lang.Exception __call2012800_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2012801_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2012802_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2012803_0(java.io.IOException a0) throws Throwable;
private static native void __call2012804_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_4348e833cb7081eb0441() throws E;
private static final class __SourceHandler_4348e833cb7081eb0441 {

public static void f665() throws Throwable {
    java.util.ArrayList lexicalValue665_53_0;
    net.minecraft.entity.Entity[] spill665_0;
    java.util.ArrayList spill665_1;
    long life0_3;
    java.util.Map life3_6;
    net.minecraft.entity.Entity[] life2_7;
    java.util.ArrayList life4_11;
    java.lang.String life5_17;
    java.lang.String life6_23;
    java.lang.String life7_29;
    java.lang.String[] life8_63;
    net.minecraft.client.resources.IResourcePack[] life9_69;
    net.minecraft.client.resources.IResourcePack[] life10_71;
    int life11_74;
    int life12_76;
    net.minecraft.client.resources.IResourcePack life13_83;
    lexical_join_85: {
    lexical_join_53: {
    lexical_join_52: {
    life0_3 = (__fieldRead665_0() ^ 129801172036043L);
    spill665_0 = __call665_1();
    life3_6 = __call665_2();
    life2_7 = spill665_0;
    life4_11 = new java.util.ArrayList();
    life5_17 = __invokedynamic665_3(10005, (5199831485316567875L ^ life0_3));
    life6_23 = __invokedynamic665_4(2930, (5876185937414012716L ^ life0_3));
    life7_29 = __invokedynamic665_5(30469, (9101966203122041692L ^ life0_3));
    spill665_1 = life4_11;
    if (!((life2_7 != null))) {
        lexicalValue665_53_0 = spill665_1;
        break lexical_join_53;
    }
    __call665_7(spill665_1, __invokedynamic665_6(life5_17, life6_23, life7_29));
    if (!((!__call665_10(__fieldRead665_9(__call665_8()), life6_23)))) {
        break lexical_join_52;
    }
    __call665_14(life4_11, __invokedynamic665_13(life5_17, __fieldRead665_12(__call665_11()), life7_29));
    }
    lexicalValue665_53_0 = life4_11;
    }
    life8_63 = __cast665_16(__call665_15(lexicalValue665_53_0, new java.lang.String[0]));
    __call665_18(__call665_17(), life8_63, life3_6);
    life9_69 = __call665_19();
    life10_71 = life9_69;
    life11_74 = (life10_71).length;
    life12_76 = 0;
    lexical_cycle_71: while (true) {
    if (!((life12_76 < life11_74))) {
        break lexical_join_85;
    }
    life13_83 = (life10_71)[life12_76];
    __call665_20(life13_83, life8_63, life3_6);
    life12_76 += 1;
    if (!((life2_7 == null))) { continue lexical_cycle_71; }
    break lexical_cycle_71;
    }
    }
    return;
}
public static void h665_0(moom.Oo p0) throws Throwable {
    throw __call1066500_0(p0);
}
public static void h665_1(moom.Oo p0) throws Throwable {
    throw __call1066501_0(p0);
}
private static native long __fieldRead665_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call665_1() throws Throwable;
private static native java.util.Map __call665_2() throws Throwable;
private static native java.lang.String __invokedynamic665_3(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic665_4(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic665_5(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic665_6(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native boolean __call665_7(java.util.ArrayList a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __call665_8() throws Throwable;
private static native java.lang.String __fieldRead665_9(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native boolean __call665_10(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __call665_11() throws Throwable;
private static native java.lang.String __fieldRead665_12(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native java.lang.String __invokedynamic665_13(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native boolean __call665_14(java.util.ArrayList a0, java.lang.String a1) throws Throwable;
private static native java.lang.Object[] __call665_15(java.util.ArrayList a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.String[] __cast665_16(java.lang.Object[] a0) throws Throwable;
private static native moom.oK __call665_17() throws Throwable;
private static native void __call665_18(moom.oK a0, java.lang.String[] a1, java.util.Map a2) throws Throwable;
private static native net.minecraft.client.resources.IResourcePack[] __call665_19() throws Throwable;
private static native void __call665_20(net.minecraft.client.resources.IResourcePack a0, java.lang.String[] a1, java.util.Map a2) throws Throwable;
private static native java.lang.Exception __call1066500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1066501_0(moom.Oo a0) throws Throwable;

}


public static java.lang.String b() {
long local0 = (moom.JM.d ^ 22308570051033L);
    return moom.oO.a(((java.lang.String)(__sourceIntrinsic_d5893d8e80ad_originalDynamicSite1182_1(21283, (4991248137710370667L ^ local0)))), ((java.lang.Object[])(new java.lang.Object[0])));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5132_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/JM"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static net.minecraft.entity.Entity[] b__Arrayr3() {
return moom.JM.c;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 32614;
      if (i[var3] == null) {
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
         long var5 = h[var3];
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
         Object[] var9 = (Object[])j.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               j.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/JM", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         i[var3] = var15;
      }

      return i[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.JM.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public static void b(net.minecraft.entity.Entity[] p0) {
c = ((net.minecraft.entity.Entity[])(p0));
    return;
}


public static java.lang.String e() {
long local0 = (moom.JM.d ^ 121690864149905L);
    return moom.oO.a(((java.lang.String)(__sourceIntrinsic_c4736ddb7dc9_originalDynamicSite1183_1(8296, (7172638749069858927L ^ local0)))), ((java.lang.Object[])(new java.lang.Object[0])));
}


public static java.lang.String c() {
long local0 = (moom.JM.d ^ 103026697077576L);
    return moom.oO.a(((java.lang.String)(__sourceIntrinsic_fe670a2392c4_originalDynamicSite1184_1(5254, (5335317051618495069L ^ local0)))), ((java.lang.Object[])(new java.lang.Object[0])));
}


public static java.lang.String d() {
long local0 = (moom.JM.d ^ 117654894467153L);
    return moom.oO.a(((java.lang.String)(__sourceIntrinsic_7781825a088d_originalDynamicSite1185_1(25002, (3811390332561957995L ^ local0)))), ((java.lang.Object[])(new java.lang.Object[0])));
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.JM.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5133_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/JM"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 23797);
    if (((moom.JM.f)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.JM.g)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.JM.g)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/JM", life9_51);
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
        life9_116 = ((java.lang.String)((moom.JM.e)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.JM.f)[life5_8] = moom.JM.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.JM.f)[life5_8];
}


public static void a(java.io.InputStream p0, java.util.Map p1) throws java.io.IOException { __sourceHandlerCall_be8ab4705e133ed069c7(p0, p1); }


private static void a(net.minecraft.client.resources.IResourcePack p0, java.lang.String[] p1, java.util.Map p2) { __sourceHandlerCall_20bf0c47544fe8c004a9(p0, p1, p2); }


public static java.lang.String a() {
long local0 = (moom.JM.d ^ 17514691799445L);
    return moom.oO.a(((java.lang.String)(__sourceIntrinsic_63ef3276e4d3_originalDynamicSite1186_1(22438, (3432762576542491567L ^ local0)))), ((java.lang.Object[])(new java.lang.Object[0])));
}


public static void a__Void() { __sourceHandlerCall_4348e833cb7081eb0441(); }


public static java.lang.String a(java.lang.String p0, java.lang.String p1) { return __sourceHandlerCall_c9d4f7e6acae0535bcc8(p0, p1); }


public static java.lang.String a(java.lang.String p0) {
return moom.oO.a(((java.lang.String)(p0)), ((java.lang.Object[])(new java.lang.Object[0])));
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
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
        byte[] spill2660_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2660_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2660_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2660_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2660_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2660_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite597_87(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite597_91(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_63ef3276e4d3_originalDynamicSite1186_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5133_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d5893d8e80ad_originalDynamicSite1182_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5132_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fe670a2392c4_originalDynamicSite1184_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7781825a088d_originalDynamicSite1185_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c4736ddb7dc9_originalDynamicSite1183_1(int a0, long a1) throws E;
}
