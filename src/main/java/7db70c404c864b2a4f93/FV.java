package moom;


public class FV extends moom.FT {

private moom.FU[] a;

private int b;

private static long c;

private static long d;

private static long[] e;

private static java.lang.Long[] f;

private static java.util.Map g;

public FV(java.util.Random p0, int p1) { super(); }


private static void __sourceConstructorBody_05c1696adac5f253(moom.FV receiver, java.util.Random p0, int p1) throws Throwable {

init_join_31: {

    long local3_life2 = (moom.FV.c ^ 37733124858447L);

    moom.FV.__sourceConstructorInit_05c1696adac5f253_0(((moom.FV)(receiver)));

    java.lang.String[] __sourceSpill491_6 = moom.FI.b();

    ((moom.FV)(receiver)).b = ((int)(p1));

    ((moom.FV)(receiver)).a = ((moom.FU[])(new moom.FU[p1]));

    int local6_life8 = 0;

    java.lang.String[] local5_life9 = __sourceSpill491_6;

    init_cycle_17: while (true) {

    if (!((local6_life8 < p1))) {

        break init_join_31;

    }

    (((moom.FV)(receiver)).a)[local6_life8] = new moom.FU(p0);

    local6_life8 += 1;

    if (!((local5_life9 == null))) { continue init_cycle_17; }

    break init_cycle_17;

    }

    }

    return;

}



static {
c = ((long)(((moom._a)(moom._c.a(((long)(-7005754605222069668L)), ((long)(-8574863974378865967L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(9644298699384L)))));
    long local11_life6 = (moom.FV.c ^ 123042536786970L);
    javax.crypto.Cipher local13_life8;
    javax.crypto.Cipher __sourceSpill536_10 = (local13_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill536_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill536_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill536_13 = new byte[8];
    (__sourceSpill536_13)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local14_life14 = 1;
    while ((local14_life14 < 8)) {
        (__sourceSpill536_13)[local14_life14] = ((byte) ((int) ((local11_life6 << (local14_life14 * 8)) >>> 56)));
        local14_life14 += 1;
    }
    byte[] __sourcePreallocation536_15 = __sourceSpill536_13;
    ((javax.crypto.Cipher)(__sourceSpill536_10)).init(((int)(__sourceSpill536_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill536_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation536_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local15_life18 = 3066166904981985977L;
    byte[] __sourceSpill536_19 = new byte[8];
    (__sourceSpill536_19)[0] = ((byte) ((int) (local15_life18 >>> 56)));
    (__sourceSpill536_19)[1] = ((byte) ((int) (local15_life18 >>> 48)));
    (__sourceSpill536_19)[2] = ((byte) ((int) (local15_life18 >>> 40)));
    (__sourceSpill536_19)[3] = ((byte) ((int) (local15_life18 >>> 32)));
    (__sourceSpill536_19)[4] = ((byte) ((int) (local15_life18 >>> 24)));
    (__sourceSpill536_19)[5] = ((byte) ((int) (local15_life18 >>> 16)));
    (__sourceSpill536_19)[6] = ((byte) ((int) (local15_life18 >>> 8)));
    (__sourceSpill536_19)[7] = ((byte) ((int) local15_life18));
    javax.crypto.Cipher __sourceSpill536_20 = local13_life8;
    byte[] local17_life22 = ((javax.crypto.Cipher)(__sourceSpill536_20)).doFinal(((byte[])(__sourceSpill536_19)));
    d = ((long)((((((((((((long) (local17_life22)[0]) & 255L) << 56) | ((((long) (local17_life22)[1]) & 255L) << 48)) | ((((long) (local17_life22)[2]) & 255L) << 40)) | ((((long) (local17_life22)[3]) & 255L) << 32)) | ((((long) (local17_life22)[4]) & 255L) << 24)) | ((((long) (local17_life22)[5]) & 255L) << 16)) | ((((long) (local17_life22)[6]) & 255L) << 8)) | (((long) (local17_life22)[7]) & 255L))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life26;
    javax.crypto.Cipher __sourceSpill536_28 = (local0_life26 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill536_29 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill536_30 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill536_31 = new byte[8];
    (__sourceSpill536_31)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life32 = 1;
    while ((local1_life32 < 8)) {
        (__sourceSpill536_31)[local1_life32] = ((byte) ((int) ((local11_life6 << (local1_life32 * 8)) >>> 56)));
        local1_life32 += 1;
    }
    byte[] __sourcePreallocation536_33 = __sourceSpill536_31;
    ((javax.crypto.Cipher)(__sourceSpill536_28)).init(((int)(__sourceSpill536_29)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill536_30)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation536_33)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life36 = new long[2];
    int local3_life37 = 0;
    java.lang.String local4_life38;
    int local5_life40 = ((java.lang.String)((local4_life38 = "Xt\177\005EûU¹AV8¾Ô/"))).length();
    int local2_life41 = 0;
    do {
        java.lang.String __sourceSpill536_42 = local4_life38;
        int __sourceSpill536_43 = local2_life41;
        local2_life41 += 8;
        byte[] local7_life46 = ((java.lang.String)(((java.lang.String)(__sourceSpill536_42)).substring(((int)(__sourceSpill536_43)), ((int)(local2_life41))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill536_47 = local6_life36;
        int __sourceSpill536_48 = local3_life37;
        local3_life37 += 1;
        long local8_life49 = (((((((((((long) (local7_life46)[0]) & 255L) << 56) | ((((long) (local7_life46)[1]) & 255L) << 48)) | ((((long) (local7_life46)[2]) & 255L) << 40)) | ((((long) (local7_life46)[3]) & 255L) << 32)) | ((((long) (local7_life46)[4]) & 255L) << 24)) | ((((long) (local7_life46)[5]) & 255L) << 16)) | ((((long) (local7_life46)[6]) & 255L) << 8)) | (((long) (local7_life46)[7]) & 255L));
        byte[] __sourceSpill536_50 = new byte[8];
        (__sourceSpill536_50)[0] = ((byte) ((int) (local8_life49 >>> 56)));
        (__sourceSpill536_50)[1] = ((byte) ((int) (local8_life49 >>> 48)));
        (__sourceSpill536_50)[2] = ((byte) ((int) (local8_life49 >>> 40)));
        (__sourceSpill536_50)[3] = ((byte) ((int) (local8_life49 >>> 32)));
        (__sourceSpill536_50)[4] = ((byte) ((int) (local8_life49 >>> 24)));
        (__sourceSpill536_50)[5] = ((byte) ((int) (local8_life49 >>> 16)));
        (__sourceSpill536_50)[6] = ((byte) ((int) (local8_life49 >>> 8)));
        (__sourceSpill536_50)[7] = ((byte) ((int) local8_life49));
        javax.crypto.Cipher __sourceSpill536_51 = local0_life26;
        byte[] local10_life53 = ((javax.crypto.Cipher)(__sourceSpill536_51)).doFinal(((byte[])(__sourceSpill536_50)));
        (__sourceSpill536_47)[__sourceSpill536_48] = (((((((((((long) (local10_life53)[0]) & 255L) << 56) | ((((long) (local10_life53)[1]) & 255L) << 48)) | ((((long) (local10_life53)[2]) & 255L) << 40)) | ((((long) (local10_life53)[3]) & 255L) << 32)) | ((((long) (local10_life53)[4]) & 255L) << 24)) | ((((long) (local10_life53)[5]) & 255L) << 16)) | ((((long) (local10_life53)[6]) & 255L) << 8)) | (((long) (local10_life53)[7]) & 255L));
    } while ((!(local2_life41 >= local5_life40)));
    e = ((long[])(local6_life36));
    f = ((java.lang.Long[])(new java.lang.Long[2]));
}

private static native <E extends Throwable> void __sourceConstructorInit_05c1696adac5f253_0(moom.FV a0) throws E;

private static long a(int p0, long p1) {
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 12824);
    if (((moom.FV.f)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (moom.FV.e)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(moom.FV.g)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.FV.g)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/FV", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (moom.FV.f)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((moom.FV.f)[life3_8])).longValue();
}


private static long a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = moom.FV.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4515_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/FV"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public double[] a(double[] p0, int p1, int p2, int p3, int p4, double p5, double p6, double p7) {
long local12 = (moom.FV.c ^ 6523110777742L);
    return ((moom.FV)(this)).a(((double[])(p0)), ((int)(p1)), ((int)(((int) moom.FV.d))), ((int)(p2)), ((int)(p3)), ((int)(1)), ((int)(p4)), ((double)(p5)), ((double)(0x1.0p0d)), ((double)(p6)));
}


public double[] a(double[] p0, int p1, int p2, int p3, int p4, int p5, int p6, double p7, double p8, double p9) {
double[] lexicalValue650_20_0;
    double[] spill650_0;
    long life14_3;
    java.lang.String[] life16_5;
    double life17_29;
    int life19_31;
    double life20_42;
    double life22_49;
    double life24_56;
    long life26_59;
    long life28_62;
    double life20_67;
    double life24_72;
    long life26_80;
    long life28_88;
    double life20_93;
    double life24_98;
    lexical_join_122: {
    lexical_join_22: {
    lexical_join_20: {
    lexical_join_19: {
    life14_3 = (moom.FV.c ^ 21344199929398L);
    life16_5 = moom.FI.b();
    spill650_0 = p0;
    if (!((life16_5 != null))) {
        lexicalValue650_20_0 = spill650_0;
        break lexical_join_20;
    }
    if (!((spill650_0 == null))) {
        break lexical_join_19;
    }
    p0 = new double[((p4 * p5) * p6)];
    if (!((life16_5 == null))) {
        break lexical_join_22;
    }
    }
    lexicalValue650_20_0 = p0;
    }
    java.util.Arrays.fill(((double[])(lexicalValue650_20_0)), ((double)(0x0.0p0d)));
    }
    life17_29 = 0x1.0p0d;
    life19_31 = 0;
    lexical_cycle_26: while (true) {
    if (!((life19_31 < this.b))) {
        break lexical_join_122;
    }
    life20_42 = ((((double) p1) * life17_29) * p7);
    life22_49 = ((((double) p2) * life17_29) * p8);
    life24_56 = ((((double) p3) * life17_29) * p9);
    life26_59 = moom.Dr.a__Long(((double)(life20_42)));
    life28_62 = moom.Dr.a__Long(((double)(life24_56)));
    life20_67 = (life20_42 - ((double) life26_59));
    life24_72 = (life24_56 - ((double) life28_62));
    life26_80 = (life26_59 % __sourceIntrinsic_d95fdc7496cd_invokedynamic650_6(914, (38896181901392178L ^ life14_3)));
    life28_88 = (life28_62 % __sourceIntrinsic_d95fdc7496cd_invokedynamic650_7(4684, (2237653686072731885L ^ life14_3)));
    life20_93 = (life20_67 + ((double) life26_80));
    life24_98 = (life24_72 + ((double) life28_88));
    ((moom.FU)((this.a)[life19_31])).a(((double[])(p0)), ((double)(life20_93)), ((double)(life22_49)), ((double)(life24_98)), ((int)(p4)), ((int)(p5)), ((int)(p6)), ((double)((p7 * life17_29))), ((double)((p8 * life17_29))), ((double)((p9 * life17_29))), ((double)(life17_29)));
    life17_29 = (life17_29 / 0x1.0p1d);
    life19_31 += 1;
    if (!((life16_5 == null))) { continue lexical_cycle_26; }
    break lexical_cycle_26;
    }
    }
    return p0;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4515_0() throws E;

private static native <E extends Throwable> long __sourceIntrinsic_d95fdc7496cd_invokedynamic650_6(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_d95fdc7496cd_invokedynamic650_7(int a0, long a1) throws E;
}
