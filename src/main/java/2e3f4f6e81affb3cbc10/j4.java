package moom;


public class j4 implements net.minecraft.client.particle.IParticleFactory {

private static final long a;

private static final long b;

public j4() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(3358338583171984249L)), ((long)(3804630028361477397L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(91692114569521L)))));
    long local0_life6 = (moom.j4.a ^ 72010336769359L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill888_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill888_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill888_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill888_13 = new byte[8];
    (__sourceSpill888_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill888_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation888_15 = __sourceSpill888_13;
    ((javax.crypto.Cipher)(__sourceSpill888_10)).init(((int)(__sourceSpill888_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill888_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation888_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 332256220472289935L;
    byte[] __sourceSpill888_19 = new byte[8];
    (__sourceSpill888_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill888_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill888_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill888_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill888_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill888_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill888_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill888_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill888_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill888_20)).doFinal(((byte[])(__sourceSpill888_19)));
    b = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public net.minecraft.client.particle.EntityFX a(int p0, net.minecraft.world.World p1, double p2, double p3, double p4, double p5, double p6, double p7, int[] p8) {
long local16 = (moom.j4.a ^ 3876795688846L);
    moom.r6 local18 = new moom.r6(p1, p2, p3, p4, p5, p6, p7);
    ((net.minecraft.client.particle.EntityFX)(local18)).g(((int)(((int) moom.j4.b))));
    ((net.minecraft.client.particle.EntityFX)(local18)).b(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    return local18;
}

}
