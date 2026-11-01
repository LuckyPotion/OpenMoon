package moom;


class A extends java.io.ByteArrayOutputStream {

private int a;

private int b;

moom.Fv c;

private static long d;

private static long e;

public A(moom.Fv p0, int p1, int p2) { super(0); }


private static void __sourceConstructorBody_8c9f564c348f530b(moom.A receiver, moom.Fv p0, int p1, int p2) throws Throwable {

long local4 = (moom.A.d ^ 123037349355900L);

    ((moom.A)(receiver)).c = ((moom.Fv)(p0));

    moom.A.__sourceConstructorInit_8c9f564c348f530b_0(((moom.A)(receiver)), ((int)(((int) moom.A.e))));

    ((moom.A)(receiver)).a = ((int)(p1));

    ((moom.A)(receiver)).b = ((int)(p2));

    return;

}



static {
d = ((long)(((moom._a)(moom._c.a(((long)(-8261345753492141683L)), ((long)(7947135800836582465L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(196518634402370L)))));
    long local0_life6 = (moom.A.d ^ 105592988351097L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill465_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill465_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill465_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill465_13 = new byte[8];
    (__sourceSpill465_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill465_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation465_15 = __sourceSpill465_13;
    ((javax.crypto.Cipher)(__sourceSpill465_10)).init(((int)(__sourceSpill465_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill465_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation465_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 1556666274553161711L;
    byte[] __sourceSpill465_19 = new byte[8];
    (__sourceSpill465_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill465_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill465_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill465_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill465_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill465_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill465_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill465_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill465_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill465_20)).doFinal(((byte[])(__sourceSpill465_19)));
    e = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceConstructorInit_8c9f564c348f530b_0(moom.A a0, int a1) throws E;

public void close() throws java.io.IOException {
((moom.Fv)(this.c)).a(((int)(this.a)), ((int)(this.b)), ((byte[])(this.buf)), ((int)(this.count)));
    return;
}

}
