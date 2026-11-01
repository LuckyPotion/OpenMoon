package moom;


class k2 {

public moom.k3 a;

public int b;

public int c;

public int d;

public int e;

private static long f;

private static long g;

private k2() { super(); }


private static void __sourceConstructorBody_ebbad93a89a3ac1c(moom.k2 receiver) throws Throwable {

long local1 = (moom.k2.f ^ 119449807178630L);

    moom.k2.__sourceConstructorInit_ebbad93a89a3ac1c_0(((moom.k2)(receiver)));

    ((moom.k2)(receiver)).a = ((moom.k3)(new moom.k3(((int) moom.k2.g))));

    ((moom.k2)(receiver)).b = ((int)(1));

    ((moom.k2)(receiver)).c = ((int)(0));

    ((moom.k2)(receiver)).d = ((int)(1));

    ((moom.k2)(receiver)).e = ((int)(0));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_ebbad93a89a3ac1c_0(moom.k2 a0) throws E;

static {
f = ((long)(((moom._a)(moom._c.a(((long)(-3275960819591742411L)), ((long)(1609362032620211413L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(280274255161032L)))));
    long local0_life6 = (moom.k2.f ^ 53992723545658L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill901_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill901_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill901_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill901_13 = new byte[8];
    (__sourceSpill901_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill901_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation901_15 = __sourceSpill901_13;
    ((javax.crypto.Cipher)(__sourceSpill901_10)).init(((int)(__sourceSpill901_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill901_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation901_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -4810827631353917445L;
    byte[] __sourceSpill901_19 = new byte[8];
    (__sourceSpill901_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill901_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill901_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill901_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill901_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill901_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill901_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill901_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill901_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill901_20)).doFinal(((byte[])(__sourceSpill901_19)));
    g = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}

}
