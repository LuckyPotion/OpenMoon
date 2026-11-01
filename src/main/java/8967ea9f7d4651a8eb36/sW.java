package moom;


public abstract class sW extends moom.sI implements net.minecraft.entity.passive.IAnimals {

private static final long cb;

private static final long ib;

public sW(net.minecraft.world.World p0) {
super(p0);
}


static {
cb = ((long)(((moom._a)(moom._c.a(((long)(-2584168165790250404L)), ((long)(-457391846720523976L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(103976906138588L)))));
    long local0_life6 = (moom.sW.cb ^ 18407595824788L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1010_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1010_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1010_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1010_13 = new byte[8];
    (__sourceSpill1010_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1010_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1010_15 = __sourceSpill1010_13;
    ((javax.crypto.Cipher)(__sourceSpill1010_10)).init(((int)(__sourceSpill1010_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1010_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1010_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 3428386764361775845L;
    byte[] __sourceSpill1010_19 = new byte[8];
    (__sourceSpill1010_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1010_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1010_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1010_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1010_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1010_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1010_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1010_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1010_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1010_20)).doFinal(((byte[])(__sourceSpill1010_19)));
    ib = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


protected java.lang.String i__String() {
return "none";
}


protected java.lang.String c__String() {
return "none";
}


protected java.lang.String h__String() {
return "none";
}


public int l__sourceReturn_8abf5c6871() {
long local1 = (moom.sW.cb ^ 137886295017095L);
    return ((int) moom.sW.ib);
}


public void d(float p0, float p1) {
return;
}


protected boolean M() {
return ((0) != 0);
}

}
