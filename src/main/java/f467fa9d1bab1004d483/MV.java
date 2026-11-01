package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class MV implements moom.Lz {

private java.util.Map<java.lang.String, java.lang.String> a;

private static final long b;

private static final java.lang.String[] c;

private static final java.lang.String[] d;

private static final java.util.Map e;

private static final long[] f;

private static final java.lang.Integer[] g;

private static final java.util.Map h;

public MV(java.util.Map<java.lang.String, java.lang.String> p0) {
super();
    this.a = null;
    this.a = p0;
}


static {
b = ((long)(((moom._a)(moom._c.a(((long)(5012232339014500069L)), ((long)(-7277028465021024987L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(229176110922180L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.MV.b ^ 94550567874811L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill697_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill697_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill697_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill697_14 = new byte[8];
    (__sourceSpill697_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill697_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation697_16 = __sourceSpill697_14;
    ((javax.crypto.Cipher)(__sourceSpill697_11)).init(((int)(__sourceSpill697_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill697_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation697_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[2];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "Òæåû¦ûg>÷\026®.ðM\000Dï\005ëe|\017]øOÀµ«wg¿(z­M}\023\\pni×\037KåØ\bd\024£\027~ìÉðz©\bÚÂ9óo½å"))).length();
    int local16_life24 = 32;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill697_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill697_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill697_29)).doFinal(((byte[])(__sourceSpill697_28)));
        java.lang.String __sourceSpill697_34 = ((java.lang.String)(moom.MV.a(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill697_35 = local20_life19;
        int __sourceSpill697_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill697_35)[__sourceSpill697_36] = __sourceSpill697_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    c = ((java.lang.String[])(local20_life19));
    d = ((java.lang.String[])(new java.lang.String[2]));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life42;
    javax.crypto.Cipher __sourceSpill697_44 = (local0_life42 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill697_45 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill697_46 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill697_47 = new byte[8];
    (__sourceSpill697_47)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life48 = 1;
    while ((local1_life48 < 8)) {
        (__sourceSpill697_47)[local1_life48] = ((byte) ((int) ((local11_life7 << (local1_life48 * 8)) >>> 56)));
        local1_life48 += 1;
    }
    byte[] __sourcePreallocation697_49 = __sourceSpill697_47;
    ((javax.crypto.Cipher)(__sourceSpill697_44)).init(((int)(__sourceSpill697_45)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill697_46)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation697_49)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life52 = new long[2];
    int local3_life53 = 0;
    java.lang.String local4_life54;
    int local5_life56 = ((java.lang.String)((local4_life54 = "à+vSÄmw/åo1?\024%"))).length();
    int local2_life57 = 0;
    do {
        java.lang.String __sourceSpill697_58 = local4_life54;
        int __sourceSpill697_59 = local2_life57;
        local2_life57 += 8;
        byte[] local7_life62 = ((java.lang.String)(((java.lang.String)(__sourceSpill697_58)).substring(((int)(__sourceSpill697_59)), ((int)(local2_life57))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill697_63 = local6_life52;
        int __sourceSpill697_64 = local3_life53;
        local3_life53 += 1;
        long local8_life65 = (((((((((((long) (local7_life62)[0]) & 255L) << 56) | ((((long) (local7_life62)[1]) & 255L) << 48)) | ((((long) (local7_life62)[2]) & 255L) << 40)) | ((((long) (local7_life62)[3]) & 255L) << 32)) | ((((long) (local7_life62)[4]) & 255L) << 24)) | ((((long) (local7_life62)[5]) & 255L) << 16)) | ((((long) (local7_life62)[6]) & 255L) << 8)) | (((long) (local7_life62)[7]) & 255L));
        byte[] __sourceSpill697_66 = new byte[8];
        (__sourceSpill697_66)[0] = ((byte) ((int) (local8_life65 >>> 56)));
        (__sourceSpill697_66)[1] = ((byte) ((int) (local8_life65 >>> 48)));
        (__sourceSpill697_66)[2] = ((byte) ((int) (local8_life65 >>> 40)));
        (__sourceSpill697_66)[3] = ((byte) ((int) (local8_life65 >>> 32)));
        (__sourceSpill697_66)[4] = ((byte) ((int) (local8_life65 >>> 24)));
        (__sourceSpill697_66)[5] = ((byte) ((int) (local8_life65 >>> 16)));
        (__sourceSpill697_66)[6] = ((byte) ((int) (local8_life65 >>> 8)));
        (__sourceSpill697_66)[7] = ((byte) ((int) local8_life65));
        javax.crypto.Cipher __sourceSpill697_67 = local0_life42;
        byte[] local10_life69 = ((javax.crypto.Cipher)(__sourceSpill697_67)).doFinal(((byte[])(__sourceSpill697_66)));
        (__sourceSpill697_63)[__sourceSpill697_64] = (((((((((((long) (local10_life69)[0]) & 255L) << 56) | ((((long) (local10_life69)[1]) & 255L) << 48)) | ((((long) (local10_life69)[2]) & 255L) << 40)) | ((((long) (local10_life69)[3]) & 255L) << 32)) | ((((long) (local10_life69)[4]) & 255L) << 24)) | ((((long) (local10_life69)[5]) & 255L) << 16)) | ((((long) (local10_life69)[6]) & 255L) << 8)) | (((long) (local10_life69)[7]) & 255L));
    } while ((!(local2_life57 >= local5_life56)));
    f = ((long[])(local6_life52));
    g = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.MV.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x6E8;
        if (g[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = f[n4];
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
                throw new RuntimeException("moom/MV", exception);
            }
            int n6 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            MV.g[n4] = n6;
        }
        return g[n4];
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral6333_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/MV"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 12033);
    if (((moom.MV.d)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.MV.e)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.MV.e)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/MV", life9_51);
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
        life9_116 = ((java.lang.String)((moom.MV.c)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.MV.d)[life5_8] = moom.MV.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.MV.d)[life5_8];
}


public moom.Lu a__Lu(java.lang.String p0) {
moom.Lq forestValue900081_39_0;
    java.lang.String forestValue900081_66_0;
    int forestValue900081_70_0;
    java.lang.String forestValue900081_92_0;
    java.lang.String forestValue900081_102_0;
    int[] spill900081_0;
    boolean spill900081_1;
    java.lang.String spill900081_2;
    java.lang.String spill900081_3;
    java.lang.String spill900081_4;
    java.lang.String spill900081_5;
    boolean spill900081_6;
    long life2_3;
    java.lang.String life5_10;
    int[] life4_11;
    java.lang.String life6_25;
    java.lang.String life6_57;
    java.lang.String life6_96;
    int life6_142;
    forest_join_132: {
    forest_join_127: {
    forest_join_102: {
    forest_join_101: {
    forest_join_70: {
    forest_join_40: {
    forest_join_39: {
    forest_join_34: {
    life2_3 = (moom.MV.b ^ 113075163417245L);
    spill900081_0 = moom.M7.b__ArrayInt();
    life5_10 = __sourceIntrinsic_872eaf79d907_invokedynamic900081_2(29561, (7525387489812821067L ^ life2_3));
    life4_11 = spill900081_0;
    spill900081_1 = ((java.lang.String)(p0)).startsWith(((java.lang.String)(life5_10)));
    if (!((life4_11 == null))) {
        forestValue900081_70_0 = ((spill900081_1) ? 1 : 0);
        break forest_join_70;
    }
    if (!(spill900081_1)) {
        break forest_join_40;
    }
    life6_25 = ((java.lang.String)(p0)).substring(((int)(((java.lang.String)(life5_10)).length())));
    if (!(((java.util.Map)(this.a)).containsKey(((java.lang.Object)(life6_25))))) {
        break forest_join_34;
    }
    forestValue900081_39_0 = new moom.Lq(moom.bT.TRUE, null);
    break forest_join_39;
    }
    forestValue900081_39_0 = new moom.Lq(moom.bT.FALSE, null);
    }
    return forestValue900081_39_0;
    }
    forest_cycle_40: while (true) {
    forest_join_66: {
    forest_join_65: {
    if (!(((java.util.Map)(this.a)).containsKey(((java.lang.Object)(p0))))) {
        break forest_join_101;
    }
    life6_57 = ((java.lang.String)(((java.util.Map)(this.a)).get(((java.lang.Object)(p0)))));
    spill900081_2 = life6_57;
    if (!((life4_11 == null))) {
        forestValue900081_102_0 = spill900081_2;
        break forest_join_102;
    }
    if (!((life4_11 == null))) {
        forestValue900081_102_0 = spill900081_2;
        break forest_join_102;
    }
    if (!((spill900081_2 != null))) {
        break forest_join_101;
    }
    spill900081_3 = life6_57;
    if (!((life4_11 == null))) {
        forestValue900081_66_0 = spill900081_3;
        break forest_join_66;
    }
    if (!(((java.lang.String)(spill900081_3)).equals(((java.lang.Object)(p0))))) {
        break forest_join_65;
    }
    if (!((life4_11 != null))) {
        break forest_join_101;
    }
    }
    forestValue900081_66_0 = life6_57;
    }
    p0 = forestValue900081_66_0;
    if (!((life4_11 != null))) {
        continue forest_cycle_40;
    }
    break forest_cycle_40;
    }
    break forest_join_101;
    }
    forest_cycle_70: while (true) {
    forest_join_96: {
    forest_join_92: {
    forest_join_91: {
    if (!((forestValue900081_70_0 != 0))) {
        break forest_join_101;
    }
    life6_96 = ((java.lang.String)(((java.util.Map)(this.a)).get(((java.lang.Object)(p0)))));
    spill900081_4 = life6_96;
    if (!((life4_11 == null))) {
        forestValue900081_102_0 = spill900081_4;
        break forest_join_102;
    }
    if (!((life4_11 == null))) {
        forestValue900081_102_0 = spill900081_4;
        break forest_join_102;
    }
    if (!((spill900081_4 != null))) {
        break forest_join_101;
    }
    spill900081_5 = life6_96;
    if (!((life4_11 == null))) {
        forestValue900081_92_0 = spill900081_5;
        break forest_join_92;
    }
    if (!(((java.lang.String)(spill900081_5)).equals(((java.lang.Object)(p0))))) {
        break forest_join_91;
    }
    if (!((life4_11 != null))) {
        break forest_join_101;
    }
    }
    forestValue900081_92_0 = life6_96;
    }
    p0 = forestValue900081_92_0;
    if (!((life4_11 != null))) {
        break forest_join_96;
    }
    break forest_join_101;
    }
    spill900081_6 = ((java.util.Map)(this.a)).containsKey(((java.lang.Object)(p0)));
    forestValue900081_70_0 = ((spill900081_6) ? 1 : 0);
    continue forest_cycle_70;
    }
    }
    forestValue900081_102_0 = p0;
    }
    life6_142 = moom.BU.a(((java.lang.String)(forestValue900081_102_0)), ((int)(__sourceIntrinsic_872eaf79d907_invokedynamic900081_24(10921, (7294849194589930610L ^ life2_3)))));
    if (!((life4_11 == null))) {
        break forest_join_127;
    }
    if (!((life6_142 == __sourceIntrinsic_872eaf79d907_invokedynamic900081_26(29802, (1995608285380876976L ^ life2_3))))) {
        break forest_join_132;
    }
    java.lang.String __stackOp900081_28_0 = p0;
    java.lang.String __stackOp900081_28_1 = __sourceIntrinsic_872eaf79d907_invokedynamic900081_27(22192, (1094424410911281539L ^ life2_3));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_872eaf79d907_invokedynamic900081_29(__stackOp900081_28_1, __stackOp900081_28_0))));
    }
    return new moom.Ll(0x0.0p0f);
    }
    return new moom.Ll(((float) life6_142));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6336_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/MV"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.MV.a(((int)(local4)), ((long)(local5)));
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
        byte[] spill3177_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3177_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3177_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3177_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3177_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3177_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6336_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_872eaf79d907_invokedynamic900081_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_872eaf79d907_invokedynamic900081_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_872eaf79d907_invokedynamic900081_26(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_872eaf79d907_invokedynamic900081_27(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_872eaf79d907_invokedynamic900081_29(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral6333_0() throws E;
}
