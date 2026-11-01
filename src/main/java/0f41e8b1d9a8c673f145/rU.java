package moom;


public class rU extends net.minecraft.enchantment.Enchantment {

private static final long G;

private static final long H;

public rU(int p0, moom.DD p1, int p2) {
super(p0, p1, p2, net.minecraft.enchantment.EnumEnchantmentType.ARMOR_HEAD);
    (this).b("waterWorker");
}


static {
G = ((long)(((moom._a)(moom._c.a(((long)(5538863930053511044L)), ((long)(7008621294739661388L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(218362905248420L)))));
    long local0_life6 = (moom.rU.G ^ 89443892023890L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill995_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill995_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill995_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill995_13 = new byte[8];
    (__sourceSpill995_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill995_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation995_15 = __sourceSpill995_13;
    ((javax.crypto.Cipher)(__sourceSpill995_10)).init(((int)(__sourceSpill995_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill995_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation995_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -6442019510546628948L;
    byte[] __sourceSpill995_19 = new byte[8];
    (__sourceSpill995_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill995_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill995_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill995_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill995_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill995_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill995_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill995_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill995_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill995_20)).doFinal(((byte[])(__sourceSpill995_19)));
    H = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public int b(int p0) {
long local2 = (moom.rU.G ^ 116802240229216L);
    return (((moom.rU)(this)).a(((int)(p0))) + ((int) moom.rU.H));
}


public int c() {
return 1;
}


public int a(int p0) {
return 1;
}

}
