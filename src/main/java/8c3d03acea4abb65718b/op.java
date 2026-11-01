package com.moon;


public class op extends com.moon.ol<com.moon.F> {

private static long d;

private static long e;

public op(com.moon.od p0) { super((com.moon.od)null, (byte)0); }


private static void __sourceConstructorBody_43d2209f60a97d2a(com.moon.op receiver, com.moon.od p0) throws Throwable {

long local2 = (com.moon.op.d ^ 24963248399377L);

    com.moon.op.__sourceConstructorInit_43d2209f60a97d2a_0(((com.moon.op)(receiver)), ((com.moon.od)(p0)), ((int)(((int) com.moon.op.e))));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_43d2209f60a97d2a_0(com.moon.op a0, com.moon.od a1, int a2) throws E;

static {
d = ((long)(((moom._a)(moom._c.a(((long)(-5521135306942137579L)), ((long)(-5211998087301268007L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(145992341172761L)))));
    long local0_life6 = (com.moon.op.d ^ 41588514000173L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill331_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill331_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill331_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill331_13 = new byte[8];
    (__sourceSpill331_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill331_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation331_15 = __sourceSpill331_13;
    ((javax.crypto.Cipher)(__sourceSpill331_10)).init(((int)(__sourceSpill331_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill331_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation331_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 1966930820983736423L;
    byte[] __sourceSpill331_19 = new byte[8];
    (__sourceSpill331_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill331_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill331_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill331_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill331_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill331_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill331_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill331_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill331_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill331_20)).doFinal(((byte[])(__sourceSpill331_19)));
    e = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public void a(java.nio.ByteBuffer p0) {
return;
}

}
