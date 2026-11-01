package moom;


public class yx extends net.minecraft.nbt.NBTBase {

private static final long c;

private static final long d;

public yx() {
super();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(6898901650820202552L)), ((long)(4213072931451594393L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(33015505167163L)))));
    long local0_life6 = (moom.yx.c ^ 121179128120554L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1138_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1138_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1138_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1138_13 = new byte[8];
    (__sourceSpill1138_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1138_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1138_15 = __sourceSpill1138_13;
    ((javax.crypto.Cipher)(__sourceSpill1138_10)).init(((int)(__sourceSpill1138_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1138_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1138_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 3393882535303219647L;
    byte[] __sourceSpill1138_19 = new byte[8];
    (__sourceSpill1138_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1138_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1138_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1138_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1138_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1138_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1138_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1138_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1138_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1138_20)).doFinal(((byte[])(__sourceSpill1138_19)));
    d = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public java.lang.String toString() {
return "END";
}


public byte a() {
return 0;
}


public net.minecraft.nbt.NBTBase a__yn() {
return new moom.yx();
}


void a(java.io.DataOutput p0) throws java.io.IOException {
return;
}


void a(java.io.DataInput p0, int p1, moom.yB p2) throws java.io.IOException {
long local4 = (moom.yx.c ^ 14642221783118L);
    ((moom.yB)(p2)).a(((long)(moom.yx.d)));
    return;
}

}
