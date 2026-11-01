package moom;


public class cS extends net.minecraft.block.Block {

private static final long Q;

private static final long R;

public cS(moom.fn p0, moom.fm p1) {
super(p0, p1);
}


static {
Q = ((long)(((moom._a)(moom._c.a(((long)(-7735228947534919225L)), ((long)(-4377608293356376879L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(234140648600992L)))));
    long local0_life6 = (moom.cS.Q ^ 34535411168647L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill790_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill790_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill790_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill790_13 = new byte[8];
    (__sourceSpill790_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill790_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation790_15 = __sourceSpill790_13;
    ((javax.crypto.Cipher)(__sourceSpill790_10)).init(((int)(__sourceSpill790_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill790_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation790_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -1745854536747000746L;
    byte[] __sourceSpill790_19 = new byte[8];
    (__sourceSpill790_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill790_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill790_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill790_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill790_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill790_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill790_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill790_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill790_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill790_20)).doFinal(((byte[])(__sourceSpill790_19)));
    R = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public boolean l() {
return ((1) != 0);
}


public int a(net.minecraft.world.IBlockAccess p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, moom.bs p3) {
long local5 = (moom.cS.Q ^ 42245959060434L);
    return ((int) moom.cS.R);
}

}
