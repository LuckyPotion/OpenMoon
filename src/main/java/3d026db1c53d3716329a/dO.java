package moom;


public class dO extends net.minecraft.block.Block {

private static final long Q;

private static final long R;

protected dO() {
super(moom.fn.C, moom.fm.u);
    (this).a(net.minecraft.creativetab.CreativeTabs.b);
}


static {
Q = ((long)(((moom._a)(moom._c.a(((long)(-6537363696050538573L)), ((long)(5622915134126855756L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(3474985898213L)))));
    long local0_life6 = (moom.dO.Q ^ 43096567707575L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill807_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill807_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill807_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill807_13 = new byte[8];
    (__sourceSpill807_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill807_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation807_15 = __sourceSpill807_13;
    ((javax.crypto.Cipher)(__sourceSpill807_10)).init(((int)(__sourceSpill807_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill807_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation807_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -4604611936407134353L;
    byte[] __sourceSpill807_19 = new byte[8];
    (__sourceSpill807_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill807_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill807_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill807_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill807_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill807_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill807_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill807_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill807_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill807_20)).doFinal(((byte[])(__sourceSpill807_19)));
    R = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public net.minecraft.item.Item a(net.minecraft.block.state.IBlockState p0, java.util.Random p1, int p2) {
return net.minecraft.init.Items.a5;
}


public int a(int p0, java.util.Random p1) {
long local3 = (moom.dO.Q ^ 39371390565046L);
    return java.lang.Math.min(((int)(((int) moom.dO.R))), ((int)((((moom.dO)(this)).a(((java.util.Random)(p1))) + ((java.util.Random)(p1)).nextInt(((int)((1 + p0))))))));
}


public int a(java.util.Random p0) {
return (3 + ((java.util.Random)(p0)).nextInt(((int)(5))));
}

}
