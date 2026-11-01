package moom;


class lc {

public int a;

public int b;

public int c;

private static long d;

private static long e;

private lc() { super(); }


private static void __sourceConstructorBody_8d3e2d8881e73ff3(moom.lc receiver) throws Throwable {

long local1 = (moom.lc.d ^ 96325575250164L);

    moom.lc.__sourceConstructorInit_8d3e2d8881e73ff3_0(((moom.lc)(receiver)));

    ((moom.lc)(receiver)).a = ((int)(((int) moom.lc.e)));

    ((moom.lc)(receiver)).b = ((int)(0));

    ((moom.lc)(receiver)).c = ((int)(-1));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_8d3e2d8881e73ff3_0(moom.lc a0) throws E;

static {
d = ((long)(((moom._a)(moom._c.a(((long)(2145772275142108213L)), ((long)(1809193564473772041L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(212651590157996L)))));
    long local0_life6 = (moom.lc.d ^ 39796137234104L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill923_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill923_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill923_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill923_13 = new byte[8];
    (__sourceSpill923_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill923_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation923_15 = __sourceSpill923_13;
    ((javax.crypto.Cipher)(__sourceSpill923_10)).init(((int)(__sourceSpill923_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill923_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation923_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 6914016640160950394L;
    byte[] __sourceSpill923_19 = new byte[8];
    (__sourceSpill923_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill923_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill923_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill923_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill923_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill923_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill923_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill923_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill923_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill923_20)).doFinal(((byte[])(__sourceSpill923_19)));
    e = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}

}
