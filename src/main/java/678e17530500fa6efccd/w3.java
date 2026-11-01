package moom;


public class w3 extends moom.wU {

private static final long o;

private static final long p;

public w3(net.minecraft.block.Block p0) {
super(p0);
}


static {
o = ((long)(((moom._a)(moom._c.a(((long)(-41346922474296106L)), ((long)(-2874732971883719683L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(174578853525025L)))));
    long local0_life6 = (moom.w3.o ^ 94818455193616L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1080_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1080_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1080_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1080_13 = new byte[8];
    (__sourceSpill1080_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1080_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1080_15 = __sourceSpill1080_13;
    ((javax.crypto.Cipher)(__sourceSpill1080_10)).init(((int)(__sourceSpill1080_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1080_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1080_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -7168916890663437583L;
    byte[] __sourceSpill1080_19 = new byte[8];
    (__sourceSpill1080_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1080_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1080_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1080_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1080_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1080_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1080_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1080_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1080_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1080_20)).doFinal(((byte[])(__sourceSpill1080_19)));
    p = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public int a(int p0) {
long local2 = (moom.w3.o ^ 130345927438063L);
    return ((int) moom.w3.p);
}

}
