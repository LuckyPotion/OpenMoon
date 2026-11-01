package moom;


public abstract class KS extends moom.Km {

private static final long h;

private static final java.lang.String[] i;

private static final java.lang.String[] j;

private static final java.util.Map k;

private static final long o;

public KS(java.lang.Class p0, java.lang.String p1, float p2) {
super(p0, p1, p2);
}


static {
h = ((long)(((moom._a)(moom._c.a(((long)(-8894838390651924039L)), ((long)(5992991697822403909L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(156352187263019L)))));
    k = ((java.util.Map)(new java.util.HashMap(13)));
    long local5_life7 = (moom.KS.h ^ 111014043532339L);
    javax.crypto.Cipher local7_life9;
    javax.crypto.Cipher __sourceSpill642_11 = (local7_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill642_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill642_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill642_14 = new byte[8];
    (__sourceSpill642_14)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local8_life15 = 1;
    while ((local8_life15 < 8)) {
        (__sourceSpill642_14)[local8_life15] = ((byte) ((int) ((local5_life7 << (local8_life15 * 8)) >>> 56)));
        local8_life15 += 1;
    }
    byte[] __sourcePreallocation642_16 = __sourceSpill642_14;
    ((javax.crypto.Cipher)(__sourceSpill642_11)).init(((int)(__sourceSpill642_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill642_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation642_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local14_life19 = new java.lang.String[12];
    int local12_life20 = 0;
    java.lang.String local11_life21;
    int local13_life23 = ((java.lang.String)((local11_life21 = "\005³%ßlç¸³\005*\024\017\020êº\020Ç\023@wkäÌHá×\034á\020ìw\020^.(¿2×@ë\020\002üQ\024Õ\004\000\026#à-\024Â\021\020qµºF¡\007½»ó/s\bå\020YÂÁ'\025ÁÑed%/å ð\020,W8XãÙÜrrÓÚ\036à\016X\020æîtª²XÌ«Â\025Pö\020nÒãò\025feæ$\\íM%¬9\020}\037} 5Ý\"ë\177ûO·å`Ö"))).length();
    int local10_life24 = 16;
    int local9_life25 = -1;
    while (true) {
        local9_life25 += 1;
        byte[] __sourceSpill642_28 = ((java.lang.String)(((java.lang.String)(local11_life21)).substring(((int)(local9_life25)), ((int)((local9_life25 + local10_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill642_29 = local7_life9;
        byte[] local15_life31 = ((javax.crypto.Cipher)(__sourceSpill642_29)).doFinal(((byte[])(__sourceSpill642_28)));
        java.lang.String __sourceSpill642_34 = ((java.lang.String)(moom.KS.a(((byte[])(local15_life31))))).intern();
        java.lang.String[] __sourceSpill642_35 = local14_life19;
        int __sourceSpill642_36 = local12_life20;
        local12_life20 += 1;
        (__sourceSpill642_35)[__sourceSpill642_36] = __sourceSpill642_34;
        if (!(((local9_life25 = (local9_life25 + local10_life24)) < local13_life23))) { break; }
        local10_life24 = ((java.lang.String)(local11_life21)).charAt(((int)(local9_life25)));
    }
    local13_life23 = ((java.lang.String)((local11_life21 = "Ëíyz\001á]ªï}²/²\020eý±\tkÎV¦îqþ?µ"))).length();
    local10_life24 = 16;
    local9_life25 = -1;
    while (true) {
        local9_life25 += 1;
        byte[] __sourceSpill642_41 = ((java.lang.String)(((java.lang.String)(local11_life21)).substring(((int)(local9_life25)), ((int)((local9_life25 + local10_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill642_42 = local7_life9;
        byte[] local15_life44 = ((javax.crypto.Cipher)(__sourceSpill642_42)).doFinal(((byte[])(__sourceSpill642_41)));
        java.lang.String __sourceSpill642_47 = ((java.lang.String)(moom.KS.a(((byte[])(local15_life44))))).intern();
        java.lang.String[] __sourceSpill642_48 = local14_life19;
        int __sourceSpill642_49 = local12_life20;
        local12_life20 += 1;
        (__sourceSpill642_48)[__sourceSpill642_49] = __sourceSpill642_47;
        if (!(((local9_life25 = (local9_life25 + local10_life24)) < local13_life23))) { break; }
        local10_life24 = ((java.lang.String)(local11_life21)).charAt(((int)(local9_life25)));
    }
    i = ((java.lang.String[])(local14_life19));
    j = ((java.lang.String[])(new java.lang.String[12]));
    javax.crypto.Cipher local0_life54;
    javax.crypto.Cipher __sourceSpill642_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill642_57 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill642_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill642_59 = new byte[8];
    (__sourceSpill642_59)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local1_life60 = 1;
    while ((local1_life60 < 8)) {
        (__sourceSpill642_59)[local1_life60] = ((byte) ((int) ((local5_life7 << (local1_life60 * 8)) >>> 56)));
        local1_life60 += 1;
    }
    byte[] __sourcePreallocation642_61 = __sourceSpill642_59;
    ((javax.crypto.Cipher)(__sourceSpill642_56)).init(((int)(__sourceSpill642_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill642_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation642_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life64 = -1721175214215226524L;
    byte[] __sourceSpill642_65 = new byte[8];
    (__sourceSpill642_65)[0] = ((byte) ((int) (local2_life64 >>> 56)));
    (__sourceSpill642_65)[1] = ((byte) ((int) (local2_life64 >>> 48)));
    (__sourceSpill642_65)[2] = ((byte) ((int) (local2_life64 >>> 40)));
    (__sourceSpill642_65)[3] = ((byte) ((int) (local2_life64 >>> 32)));
    (__sourceSpill642_65)[4] = ((byte) ((int) (local2_life64 >>> 24)));
    (__sourceSpill642_65)[5] = ((byte) ((int) (local2_life64 >>> 16)));
    (__sourceSpill642_65)[6] = ((byte) ((int) (local2_life64 >>> 8)));
    (__sourceSpill642_65)[7] = ((byte) ((int) local2_life64));
    javax.crypto.Cipher __sourceSpill642_66 = local0_life54;
    byte[] local4_life68 = ((javax.crypto.Cipher)(__sourceSpill642_66)).doFinal(((byte[])(__sourceSpill642_65)));
    o = ((long)((((((((((((long) (local4_life68)[0]) & 255L) << 56) | ((((long) (local4_life68)[1]) & 255L) << 48)) | ((((long) (local4_life68)[2]) & 255L) << 40)) | ((((long) (local4_life68)[3]) & 255L) << 32)) | ((((long) (local4_life68)[4]) & 255L) << 24)) | ((((long) (local4_life68)[5]) & 255L) << 16)) | ((((long) (local4_life68)[6]) & 255L) << 8)) | (((long) (local4_life68)[7]) & 255L))));
}


public java.lang.String[] b__ArrayString() {
long local1_life1 = (moom.KS.h ^ 32388463048227L);
    java.lang.String[] __sourceSharedArray665_4 = new java.lang.String[((int) moom.KS.o)];
    __sourceSharedArray665_4[0] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite665_3(5990, (5145339843458484520L ^ local1_life1));
    __sourceSharedArray665_4[1] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite665_5(26305, (8729429468257859714L ^ local1_life1));
    __sourceSharedArray665_4[2] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite665_6(7345, (2230634202431013616L ^ local1_life1));
    __sourceSharedArray665_4[3] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite665_7(29392, (5930092310356962448L ^ local1_life1));
    __sourceSharedArray665_4[4] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite665_8(20576, (4732658522645204521L ^ local1_life1));
    __sourceSharedArray665_4[5] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite665_9(6930, (8997397272688969050L ^ local1_life1));
    return __sourceSharedArray665_4;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 32324);
    if (((moom.KS.j)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.KS.k)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.KS.k)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/KS", life9_51);
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
        life9_116 = ((java.lang.String)((moom.KS.i)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.KS.j)[life5_8] = moom.KS.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.KS.j)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.KS.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5687_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/KS"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
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
        byte[] spill2896_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2896_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2896_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2896_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2896_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2896_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public moom.jD a(moom.iQ p0, java.lang.String p1) {
moom.iQ forwardValue2481_12_0;
    int forwardValue2481_38_0;
    int forwardValue2481_51_0;
    int forwardValue2481_64_0;
    int forwardValue2481_77_0;
    int forwardValue2481_90_0;
    moom.jD forwardValue2481_95_0;
    moom.iQ spill2481_0;
    boolean spill2481_1;
    long life3_3;
    int[] life5_5;
    moom.ji life6_19;
    forward_join_95: {
    forward_join_94: {
    forward_join_90: {
    forward_join_83: {
    forward_join_77: {
    forward_join_70: {
    forward_join_64: {
    forward_join_57: {
    forward_join_51: {
    forward_join_44: {
    forward_join_38: {
    forward_join_31: {
    forward_join_18: {
    forward_join_16: {
    forward_join_12: {
    life3_3 = (moom.KS.h ^ 27585273124475L);
    life5_5 = moom.Km.b();
    spill2481_0 = p0;
    if (!((life5_5 != null))) {
        forwardValue2481_12_0 = spill2481_0;
        break forward_join_12;
    }
    if (!((((spill2481_0 instanceof moom.ji) ? 1 : 0) != 0))) {
        break forward_join_16;
    }
    forwardValue2481_12_0 = p0;
    }
    life6_19 = ((moom.ji)(forwardValue2481_12_0));
    if (!((life5_5 == null))) {
        break forward_join_18;
    }
    }
    return null;
    }
    spill2481_1 = ((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2481_4(8357, (1570597824305733298L ^ life3_3)))));
    if (!((life5_5 != null))) {
        forwardValue2481_38_0 = ((spill2481_1) ? 1 : 0);
        break forward_join_38;
    }
    if (!(spill2481_1)) {
        break forward_join_31;
    }
    forwardValue2481_95_0 = ((moom.ji)(life6_19)).i;
    break forward_join_95;
    }
    forwardValue2481_38_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2481_8(29604, (6090579132317420983L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2481_51_0 = forwardValue2481_38_0;
        break forward_join_51;
    }
    if (!((forwardValue2481_38_0 != 0))) {
        break forward_join_44;
    }
    forwardValue2481_95_0 = ((moom.ji)(life6_19)).j;
    break forward_join_95;
    }
    forwardValue2481_51_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2481_12(2047, (56797104127621610L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2481_64_0 = forwardValue2481_51_0;
        break forward_join_64;
    }
    if (!((forwardValue2481_51_0 != 0))) {
        break forward_join_57;
    }
    forwardValue2481_95_0 = ((moom.ji)(life6_19)).k;
    break forward_join_95;
    }
    forwardValue2481_64_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2481_16(32365, (4156235000132485247L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2481_77_0 = forwardValue2481_64_0;
        break forward_join_77;
    }
    if (!((forwardValue2481_64_0 != 0))) {
        break forward_join_70;
    }
    forwardValue2481_95_0 = ((moom.ji)(life6_19)).l;
    break forward_join_95;
    }
    forwardValue2481_77_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2481_20(32692, (1087064858805027232L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue2481_90_0 = forwardValue2481_77_0;
        break forward_join_90;
    }
    if (!((forwardValue2481_77_0 != 0))) {
        break forward_join_83;
    }
    forwardValue2481_95_0 = ((moom.ji)(life6_19)).m;
    break forward_join_95;
    }
    forwardValue2481_90_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_38607ace6cb3_invokedynamic2481_24(18243, (6575388114866665817L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((forwardValue2481_90_0 != 0))) {
        break forward_join_94;
    }
    forwardValue2481_95_0 = ((moom.ji)(life6_19)).n;
    break forward_join_95;
    }
    forwardValue2481_95_0 = null;
    }
    return forwardValue2481_95_0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite665_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite665_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite665_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite665_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite665_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite665_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5687_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2481_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2481_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2481_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2481_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2481_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_38607ace6cb3_invokedynamic2481_24(int a0, long a1) throws E;
}
