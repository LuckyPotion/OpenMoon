package com.moon;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class cF {

private static org.tinylog.TaggedLogger a;

private static long b;

private static java.lang.String[] c;

private static java.lang.String[] d;

private static java.util.Map e;

private static long[] f;

private static java.lang.Integer[] g;

private static java.util.Map h;

public cF() {
super();
}


static {
b = ((long)(((moom._a)(moom._c.a(((long)(-7805653530063805147L)), ((long)(5095922375868488037L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(101251374542739L)))));
    long local20_life6 = (com.moon.cF.b ^ 126985894128564L);
    e = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local11_life9;
    javax.crypto.Cipher __sourceSpill47_11 = (local11_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill47_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill47_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill47_14 = new byte[8];
    (__sourceSpill47_14)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local12_life15 = 1;
    while ((local12_life15 < 8)) {
        (__sourceSpill47_14)[local12_life15] = ((byte) ((int) ((local20_life6 << (local12_life15 * 8)) >>> 56)));
        local12_life15 += 1;
    }
    byte[] __sourcePreallocation47_16 = __sourceSpill47_14;
    ((javax.crypto.Cipher)(__sourceSpill47_11)).init(((int)(__sourceSpill47_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill47_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation47_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local18_life19 = new java.lang.String[3];
    int local16_life20 = 0;
    java.lang.String local15_life21;
    int local17_life23 = ((java.lang.String)((local15_life21 = "õæÒÂl¬\037j\037Cù­sP{®nP\003hÏ`.*Ø\024Î\031ärÜ/¬Ð×O®àX82¬ù*©²\023<Øþïã÷ý¦/v¬\025<\004^û$KSÕ>Á\000K\022ú¤!·ål=¬È\037r\035BbNK%¤f\033Ä%\032Ów&¿2dÌ\023ý¤qó*¿PÚ9-\017l¬³\030\022üKð .i¯V¦÷y.jg\035Ö?íÌ7!"))).length();
    int local14_life24 = 48;
    int local13_life25 = -1;
    while (true) {
        local13_life25 += 1;
        byte[] __sourceSpill47_28 = ((java.lang.String)(((java.lang.String)(local15_life21)).substring(((int)(local13_life25)), ((int)((local13_life25 + local14_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill47_29 = local11_life9;
        byte[] local19_life31 = ((javax.crypto.Cipher)(__sourceSpill47_29)).doFinal(((byte[])(__sourceSpill47_28)));
        java.lang.String __sourceSpill47_34 = ((java.lang.String)(com.moon.cF.a(((byte[])(local19_life31))))).intern();
        java.lang.String[] __sourceSpill47_35 = local18_life19;
        int __sourceSpill47_36 = local16_life20;
        local16_life20 += 1;
        (__sourceSpill47_35)[__sourceSpill47_36] = __sourceSpill47_34;
        if (!(((local13_life25 = (local13_life25 + local14_life24)) < local17_life23))) { break; }
        local14_life24 = ((java.lang.String)(local15_life21)).charAt(((int)(local13_life25)));
    }
    c = ((java.lang.String[])(local18_life19));
    d = ((java.lang.String[])(new java.lang.String[3]));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life42;
    javax.crypto.Cipher __sourceSpill47_44 = (local0_life42 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill47_45 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill47_46 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill47_47 = new byte[8];
    (__sourceSpill47_47)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local1_life48 = 1;
    while ((local1_life48 < 8)) {
        (__sourceSpill47_47)[local1_life48] = ((byte) ((int) ((local20_life6 << (local1_life48 * 8)) >>> 56)));
        local1_life48 += 1;
    }
    byte[] __sourcePreallocation47_49 = __sourceSpill47_47;
    ((javax.crypto.Cipher)(__sourceSpill47_44)).init(((int)(__sourceSpill47_45)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill47_46)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation47_49)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life52 = new long[2];
    int local3_life53 = 0;
    java.lang.String local4_life54;
    int local5_life56 = ((java.lang.String)((local4_life54 = "¸.\002âæø.)gplÏ"))).length();
    int local2_life57 = 0;
    do {
        java.lang.String __sourceSpill47_58 = local4_life54;
        int __sourceSpill47_59 = local2_life57;
        local2_life57 += 8;
        byte[] local7_life62 = ((java.lang.String)(((java.lang.String)(__sourceSpill47_58)).substring(((int)(__sourceSpill47_59)), ((int)(local2_life57))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill47_63 = local6_life52;
        int __sourceSpill47_64 = local3_life53;
        local3_life53 += 1;
        long local8_life65 = (((((((((((long) (local7_life62)[0]) & 255L) << 56) | ((((long) (local7_life62)[1]) & 255L) << 48)) | ((((long) (local7_life62)[2]) & 255L) << 40)) | ((((long) (local7_life62)[3]) & 255L) << 32)) | ((((long) (local7_life62)[4]) & 255L) << 24)) | ((((long) (local7_life62)[5]) & 255L) << 16)) | ((((long) (local7_life62)[6]) & 255L) << 8)) | (((long) (local7_life62)[7]) & 255L));
        byte[] __sourceSpill47_66 = new byte[8];
        (__sourceSpill47_66)[0] = ((byte) ((int) (local8_life65 >>> 56)));
        (__sourceSpill47_66)[1] = ((byte) ((int) (local8_life65 >>> 48)));
        (__sourceSpill47_66)[2] = ((byte) ((int) (local8_life65 >>> 40)));
        (__sourceSpill47_66)[3] = ((byte) ((int) (local8_life65 >>> 32)));
        (__sourceSpill47_66)[4] = ((byte) ((int) (local8_life65 >>> 24)));
        (__sourceSpill47_66)[5] = ((byte) ((int) (local8_life65 >>> 16)));
        (__sourceSpill47_66)[6] = ((byte) ((int) (local8_life65 >>> 8)));
        (__sourceSpill47_66)[7] = ((byte) ((int) local8_life65));
        javax.crypto.Cipher __sourceSpill47_67 = local0_life42;
        byte[] local10_life69 = ((javax.crypto.Cipher)(__sourceSpill47_67)).doFinal(((byte[])(__sourceSpill47_66)));
        (__sourceSpill47_63)[__sourceSpill47_64] = (((((((((((long) (local10_life69)[0]) & 255L) << 56) | ((((long) (local10_life69)[1]) & 255L) << 48)) | ((((long) (local10_life69)[2]) & 255L) << 40)) | ((((long) (local10_life69)[3]) & 255L) << 32)) | ((((long) (local10_life69)[4]) & 255L) << 24)) | ((((long) (local10_life69)[5]) & 255L) << 16)) | ((((long) (local10_life69)[6]) & 255L) << 8)) | (((long) (local10_life69)[7]) & 255L));
    } while ((!(local2_life57 >= local5_life56)));
    f = ((long[])(local6_life52));
    g = ((java.lang.Integer[])(new java.lang.Integer[2]));
    a = ((org.tinylog.TaggedLogger)(org.tinylog.Logger.tag(((java.lang.String)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite47_72(30157, (8384993979663502315L ^ local20_life6)))))));
}

private static native <E extends Throwable> com.moon.cE __sourceHandlerCall_c63e3d6b91d2bdd4140b(java.io.File a0) throws E;
private static final class __SourceHandler_c63e3d6b91d2bdd4140b {

public static com.moon.cE f44(java.io.File p0) throws Throwable {
    java.lang.String[] lexicalValue44_56_0;
    java.lang.String[] spill44_0;
    long life1_3;
    java.lang.String[] life3_5;
    com.moon.cE life4_9;
    java.lang.String life5_13;
    java.lang.String[] life6_17;
    java.lang.String[] life7_19;
    int life8_22;
    int life9_24;
    java.lang.String life10_31;
    java.lang.String[] life11_35;
    java.lang.String life12_64;
    java.lang.String life13_78;
    lexical_join_85: {
    life1_3 = (__fieldRead44_0() ^ 44400641552401L);
    life3_5 = __call44_1();
    life4_9 = new com.moon.cE();
    life5_13 = __call44_3(__call44_2(p0));
    life6_17 = __call44_4(life5_13, "\n");
    life7_19 = life6_17;
    life8_22 = (life7_19).length;
    life9_24 = 0;
    lexical_cycle_25: while (true) {
    lexical_join_56: {
    lexical_join_55: {
    if (!((life9_24 < life8_22))) {
        break lexical_join_85;
    }
    life10_31 = (life7_19)[life9_24];
    life11_35 = __call44_5(life10_31, "\t");
    spill44_0 = life11_35;
    if (!((life3_5 != null))) {
        lexicalValue44_56_0 = spill44_0;
        break lexical_join_56;
    }
    if (!(((spill44_0).length != __invokedynamic44_6(23782, (6028739817699441094L ^ life1_3))))) {
        break lexical_join_55;
    }
    __call44_9(__fieldRead44_7(), __invokedynamic44_8(7279, (2757330694246758895L ^ life1_3)));
    return null;
    }
    lexicalValue44_56_0 = life11_35;
    }
    life12_64 = __call44_10((lexicalValue44_56_0)[5], "\n", "");
    life13_78 = __call44_13(__call44_12((life11_35)[__invokedynamic44_11(2446, (3738224630528355503L ^ life1_3))], "\r", ""), "\n", "");
    __call44_15(__call44_14(life4_9), life12_64, life13_78);
    life9_24 += 1;
    if (!((life3_5 == null))) { continue lexical_cycle_25; }
    break lexical_cycle_25;
    }
    }
    return life4_9;
}
public static com.moon.cE h44_0(java.io.IOException p0) throws Throwable {
    throw __call2004400_0(p0);
}
public static com.moon.cE h44_1(java.io.IOException p0, long p1) throws Throwable {
    java.io.IOException local3 = p0;
    __call2004401_2(__fieldRead2004401_0(), local3, __invokedynamic2004401_1(21745, (5204605492488188272L ^ p1)));
    return null;
}
private static native long __fieldRead44_0() throws Throwable;
private static native java.lang.String[] __call44_1() throws Throwable;
private static native java.nio.file.Path __call44_2(java.io.File a0) throws Throwable;
private static native java.lang.String __call44_3(java.nio.file.Path a0) throws Throwable;
private static native java.lang.String[] __call44_4(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String[] __call44_5(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic44_6(int a0, long a1) throws Throwable;
private static native org.tinylog.TaggedLogger __fieldRead44_7() throws Throwable;
private static native java.lang.String __invokedynamic44_8(int a0, long a1) throws Throwable;
private static native void __call44_9(org.tinylog.TaggedLogger a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call44_10(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native int __invokedynamic44_11(int a0, long a1) throws Throwable;
private static native java.lang.String __call44_12(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __call44_13(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.util.Map __call44_14(com.moon.cE a0) throws Throwable;
private static native java.lang.Object __call44_15(java.util.Map a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.io.IOException __call2004400_0(java.io.IOException a0) throws Throwable;
private static native org.tinylog.TaggedLogger __fieldRead2004401_0() throws Throwable;
private static native java.lang.String __invokedynamic2004401_1(int a0, long a1) throws Throwable;
private static native void __call2004401_2(org.tinylog.TaggedLogger a0, java.io.IOException a1, java.lang.String a2) throws Throwable;

}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.cF.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x1E8A;
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
                throw new RuntimeException("com/moon/cF", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            cF.g[n2] = n3;
        }
        return g[n2];
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral818_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/cF"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 24107);
    if (((com.moon.cF.d)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.cF.e)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.cF.e)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/cF", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.cF.c)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.cF.d)[life5_8] = com.moon.cF.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.cF.d)[life5_8];
}


public static com.moon.cE a(java.io.File p0) { return __sourceHandlerCall_c63e3d6b91d2bdd4140b(p0); }


private static java.io.IOException a(java.io.IOException p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral821_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/cF"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.cF.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
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
        byte[] spill113_0 = p0;
        life4_9 += 1;
        life5_44 = (spill113_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill113_1 = p0;
        life4_9 += 1;
        life5_76 = (spill113_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill113_2 = p0;
        life4_9 += 1;
        life5_91 = (spill113_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite47_72(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral821_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral818_0() throws E;
}
