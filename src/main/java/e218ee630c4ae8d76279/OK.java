package moom;


public class OK extends org.apache.logging.log4j.spi.Provider {

private static long a;

private static java.lang.String b;

private static long c;

public OK() { super((java.lang.Integer)null, (java.lang.String)null, (java.lang.Class)null, (java.lang.Class)null); }


private static void __sourceConstructorBody_de65362932ab5366(moom.OK receiver) throws Throwable {

long local1 = (moom.OK.a ^ 125122271941524L);

    moom.OK.__sourceConstructorInit_de65362932ab5366_0(((moom.OK)(receiver)), ((java.lang.Integer)(java.lang.Integer.valueOf(((int)(((int) moom.OK.c)))))), ((java.lang.String)(moom.OK.b)), ((java.lang.Object)(moom.Oj.class)), ((java.lang.Object)(moom.Og.class)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_de65362932ab5366_0(moom.OK a0, java.lang.Integer a1, java.lang.String a2, java.lang.Object a3, java.lang.Object a4) throws E;

static {
a = ((long)(((moom._a)(moom._c.a(((long)(-2313544068835273764L)), ((long)(4302056274443005840L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(176249734650575L)))));
    long local5_life6 = (moom.OK.a ^ 131397994030902L);
    javax.crypto.Cipher local7_life8;
    javax.crypto.Cipher __sourceSpill745_10 = (local7_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill745_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill745_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill745_13 = new byte[8];
    (__sourceSpill745_13)[0] = ((byte) ((int) (local5_life6 >>> 56)));
    int local8_life14 = 1;
    while ((local8_life14 < 8)) {
        (__sourceSpill745_13)[local8_life14] = ((byte) ((int) ((local5_life6 << (local8_life14 * 8)) >>> 56)));
        local8_life14 += 1;
    }
    byte[] __sourcePreallocation745_15 = __sourceSpill745_13;
    ((javax.crypto.Cipher)(__sourceSpill745_10)).init(((int)(__sourceSpill745_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill745_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation745_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill745_19 = ((java.lang.String)("å8\tYn¯\004")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill745_20 = local7_life8;
    byte[] local9_life22 = ((javax.crypto.Cipher)(__sourceSpill745_20)).doFinal(((byte[])(__sourceSpill745_19)));
    b = ((java.lang.String)(((java.lang.String)(moom.OK.a(((byte[])(local9_life22))))).intern()));
    javax.crypto.Cipher local0_life27;
    javax.crypto.Cipher __sourceSpill745_29 = (local0_life27 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill745_30 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill745_31 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill745_32 = new byte[8];
    (__sourceSpill745_32)[0] = ((byte) ((int) (local5_life6 >>> 56)));
    int local1_life33 = 1;
    while ((local1_life33 < 8)) {
        (__sourceSpill745_32)[local1_life33] = ((byte) ((int) ((local5_life6 << (local1_life33 * 8)) >>> 56)));
        local1_life33 += 1;
    }
    byte[] __sourcePreallocation745_34 = __sourceSpill745_32;
    ((javax.crypto.Cipher)(__sourceSpill745_29)).init(((int)(__sourceSpill745_30)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill745_31)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation745_34)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life37 = -4950199921716051075L;
    byte[] __sourceSpill745_38 = new byte[8];
    (__sourceSpill745_38)[0] = ((byte) ((int) (local2_life37 >>> 56)));
    (__sourceSpill745_38)[1] = ((byte) ((int) (local2_life37 >>> 48)));
    (__sourceSpill745_38)[2] = ((byte) ((int) (local2_life37 >>> 40)));
    (__sourceSpill745_38)[3] = ((byte) ((int) (local2_life37 >>> 32)));
    (__sourceSpill745_38)[4] = ((byte) ((int) (local2_life37 >>> 24)));
    (__sourceSpill745_38)[5] = ((byte) ((int) (local2_life37 >>> 16)));
    (__sourceSpill745_38)[6] = ((byte) ((int) (local2_life37 >>> 8)));
    (__sourceSpill745_38)[7] = ((byte) ((int) local2_life37));
    javax.crypto.Cipher __sourceSpill745_39 = local0_life27;
    byte[] local4_life41 = ((javax.crypto.Cipher)(__sourceSpill745_39)).doFinal(((byte[])(__sourceSpill745_38)));
    c = ((long)((((((((((((long) (local4_life41)[0]) & 255L) << 56) | ((((long) (local4_life41)[1]) & 255L) << 48)) | ((((long) (local4_life41)[2]) & 255L) << 40)) | ((((long) (local4_life41)[3]) & 255L) << 32)) | ((((long) (local4_life41)[4]) & 255L) << 24)) | ((((long) (local4_life41)[5]) & 255L) << 16)) | ((((long) (local4_life41)[6]) & 255L) << 8)) | (((long) (local4_life41)[7]) & 255L))));
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
        byte[] spill3425_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3425_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3425_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3425_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3425_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3425_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}

}
