package moom;


public class kA implements net.minecraft.client.particle.IParticleFactory {

private static final long a;

private static final long b;

public kA() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(-2806171697241371063L)), ((long)(-1389663006066203367L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(227963614413063L)))));
    long local0_life6 = (moom.kA.a ^ 111024697749076L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill905_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill905_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill905_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill905_13 = new byte[8];
    (__sourceSpill905_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill905_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation905_15 = __sourceSpill905_13;
    ((javax.crypto.Cipher)(__sourceSpill905_10)).init(((int)(__sourceSpill905_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill905_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation905_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -5528622916871353916L;
    byte[] __sourceSpill905_19 = new byte[8];
    (__sourceSpill905_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill905_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill905_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill905_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill905_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill905_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill905_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill905_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill905_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill905_20)).doFinal(((byte[])(__sourceSpill905_19)));
    b = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public net.minecraft.client.particle.EntityFX a(int p0, net.minecraft.world.World p1, double p2, double p3, double p4, double p5, double p6, double p7, int[] p8) {
long local16 = (moom.kA.a ^ 92080750155364L);
    moom.sz local18 = new moom.sz(p1, p2, p3, p4, p5, p6, p7);
    ((moom.sz)(local18)).h(((int)(((int) moom.kA.b))));
    return local18;
}

}
