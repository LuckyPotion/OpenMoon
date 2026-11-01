package moom;


public class yB {

public static final moom.yB a;

private final long b;

private long c;

private static final long d;

private static final long e;

public yB(long p0) {
super();
    this.b = p0;
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(-6715659478944546304L)), ((long)(5122478131223913228L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(135626480933023L)))));
    long local0_life6 = (moom.yB.d ^ 32925295641500L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1121_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1121_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1121_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1121_13 = new byte[8];
    (__sourceSpill1121_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1121_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1121_15 = __sourceSpill1121_13;
    ((javax.crypto.Cipher)(__sourceSpill1121_10)).init(((int)(__sourceSpill1121_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1121_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1121_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 7042248071640170072L;
    byte[] __sourceSpill1121_19 = new byte[8];
    (__sourceSpill1121_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1121_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1121_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1121_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1121_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1121_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1121_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1121_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1121_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1121_20)).doFinal(((byte[])(__sourceSpill1121_19)));
    e = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
    a = ((moom.yB)(new moom.yC(0L)));
}


public void a(long p0) {
long life3_3;
    life3_3 = (moom.yB.d ^ 136473269533790L);
    moom.yB __stackOp4553_1_0 = this;
    ((moom.yB)(__stackOp4553_1_0)).c = ((long)((((moom.yB)(__stackOp4553_1_0)).c + (p0 / moom.yB.e))));
    if ((recovery.source.CarrierOps.lcmp(((long)(this.c)), ((long)(this.b))) > 0)) {
        throw new java.lang.RuntimeException(__sourceIntrinsic_e753b806269e_invokedynamic4553_10(this.c, this.b));
    }
    return;
}


private static java.lang.RuntimeException a(java.lang.RuntimeException p0) {
return p0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e753b806269e_invokedynamic4553_10(long a0, long a1) throws E;
}
