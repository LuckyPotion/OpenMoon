package moom;


class lg {

public moom.k3 a;

public int b;

private static long c;

private static long d;

private lg() { super(); }


private static void __sourceConstructorBody_e87646acba9fef10(moom.lg receiver) throws Throwable {

long local1 = (moom.lg.c ^ 25199499123439L);

    moom.lg.__sourceConstructorInit_e87646acba9fef10_0(((moom.lg)(receiver)));

    ((moom.lg)(receiver)).a = ((moom.k3)(new moom.k3(((int) moom.lg.d))));

    ((moom.lg)(receiver)).b = ((int)(0));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_e87646acba9fef10_0(moom.lg a0) throws E;

static {
c = ((long)(((moom._a)(moom._c.a(((long)(-3187514964156674472L)), ((long)(7882561490147110929L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(269601018369438L)))));
    long local0_life6 = (moom.lg.c ^ 15016335702777L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill925_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill925_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill925_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill925_13 = new byte[8];
    (__sourceSpill925_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill925_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation925_15 = __sourceSpill925_13;
    ((javax.crypto.Cipher)(__sourceSpill925_10)).init(((int)(__sourceSpill925_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill925_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation925_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -3940025809962747L;
    byte[] __sourceSpill925_19 = new byte[8];
    (__sourceSpill925_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill925_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill925_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill925_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill925_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill925_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill925_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill925_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill925_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill925_20)).doFinal(((byte[])(__sourceSpill925_19)));
    d = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}

}
