package moom;


public class kC implements net.minecraft.client.particle.IParticleFactory {

private static final long a;

private static final long b;

public kC() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(-4533962518459436648L)), ((long)(-6752090633727951815L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(146719279808769L)))));
    long local0_life6 = (moom.kC.a ^ 28416393448438L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill906_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill906_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill906_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill906_13 = new byte[8];
    (__sourceSpill906_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill906_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation906_15 = __sourceSpill906_13;
    ((javax.crypto.Cipher)(__sourceSpill906_10)).init(((int)(__sourceSpill906_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill906_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation906_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -1712604436843519350L;
    byte[] __sourceSpill906_19 = new byte[8];
    (__sourceSpill906_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill906_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill906_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill906_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill906_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill906_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill906_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill906_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill906_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill906_20)).doFinal(((byte[])(__sourceSpill906_19)));
    b = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public net.minecraft.client.particle.EntityFX a(int p0, net.minecraft.world.World p1, double p2, double p3, double p4, double p5, double p6, double p7, int[] p8) {
long local16 = (moom.kC.a ^ 2647372160453L);
    moom.sz local18 = new moom.sz(p1, p2, p3, p4, p5, p6, p7);
    ((moom.sz)(local18)).h(((int)(((int) moom.kC.b))));
    float local19 = ((((java.util.Random)(((net.minecraft.world.World)(p1)).u)).nextFloat() * 0x1.0p-1f) + 0x1.666666p-2f);
    ((moom.sz)(local18)).b(((float)(local19)), ((float)((0x0.0p0f * local19))), ((float)(local19)));
    return local18;
}

}
