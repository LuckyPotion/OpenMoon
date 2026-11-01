package moom;


public class yZ implements moom.yK<moom.yU> {

private java.lang.String a;

private java.security.PublicKey b;

private byte[] c;

private static final long d;

private static final long e;

public yZ() {
super();
}


public yZ(java.lang.String p0, java.security.PublicKey p1, byte[] p2) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(709618392699049232L)), ((long)(5380107446169218405L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(95582211942838L)))));
    long local0_life6 = (moom.yZ.d ^ 97861113804435L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1125_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1125_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1125_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1125_13 = new byte[8];
    (__sourceSpill1125_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1125_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1125_15 = __sourceSpill1125_13;
    ((javax.crypto.Cipher)(__sourceSpill1125_10)).init(((int)(__sourceSpill1125_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1125_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1125_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -4072129331375245690L;
    byte[] __sourceSpill1125_19 = new byte[8];
    (__sourceSpill1125_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1125_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1125_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1125_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1125_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1125_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1125_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1125_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1125_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1125_20)).doFinal(((byte[])(__sourceSpill1125_19)));
    e = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).a(((java.lang.String)(this.a)));
    ((net.minecraft.network.PacketBuffer)(p0)).a(((byte[])(((java.security.PublicKey)(this.b)).getEncoded())));
    ((net.minecraft.network.PacketBuffer)(p0)).a(((byte[])(this.c)));
    return;
}


public byte[] a__ArrayByte() {
return this.c;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.yZ)(this)).a(((moom.yU)(((moom.yU)(p0)))));
}


public java.lang.String a() {
return this.a;
}


public java.security.PublicKey a__PublicKey() {
return this.b;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
long local2 = (moom.yZ.d ^ 18075180380993L);
    this.a = ((java.lang.String)(((net.minecraft.network.PacketBuffer)(p0)).a__String(((int)(((int) moom.yZ.e))))));
    this.b = ((java.security.PublicKey)(net.minecraft.util.CryptManager.a(((byte[])(((net.minecraft.network.PacketBuffer)(p0)).a__ArrayByte())))));
    this.c = ((byte[])(((net.minecraft.network.PacketBuffer)(p0)).a__ArrayByte()));
    return;
}


public void a(moom.yU p0) {
((moom.yU)(p0)).a(((moom.yZ)(this)));
    return;
}



}
