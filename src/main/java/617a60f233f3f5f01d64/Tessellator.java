package net.minecraft.client.renderer;


public class Tessellator {

private final moom.lw a;

private final moom.lz b;

private static final net.minecraft.client.renderer.Tessellator c;

private static int[] d;

public Tessellator(int p0) {
super();
    this.b = new moom.lz();
    this.a = new moom.lw(p0);
}


static {
long local6_life4 = (((moom._a)(moom._c.a(((long)(1275700532697096057L)), ((long)(-6519291849454008824L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(9007854368600L))) ^ 128562261236314L);
    if ((net.minecraft.client.renderer.Tessellator.b() == null)) {
        net.minecraft.client.renderer.Tessellator.b(((int[])(new int[3])));
    }
    javax.crypto.Cipher local1_life8;
    javax.crypto.Cipher __sourceSpill1172_10 = (local1_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1172_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1172_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1172_13 = new byte[8];
    (__sourceSpill1172_13)[0] = ((byte) ((int) (local6_life4 >>> 56)));
    int local2_life14 = 1;
    while ((local2_life14 < 8)) {
        (__sourceSpill1172_13)[local2_life14] = ((byte) ((int) ((local6_life4 << (local2_life14 * 8)) >>> 56)));
        local2_life14 += 1;
    }
    byte[] __sourcePreallocation1172_15 = __sourceSpill1172_13;
    ((javax.crypto.Cipher)(__sourceSpill1172_10)).init(((int)(__sourceSpill1172_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1172_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1172_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local3_life18 = -5798300782727895845L;
    byte[] __sourceSpill1172_19 = new byte[8];
    (__sourceSpill1172_19)[0] = ((byte) ((int) (local3_life18 >>> 56)));
    (__sourceSpill1172_19)[1] = ((byte) ((int) (local3_life18 >>> 48)));
    (__sourceSpill1172_19)[2] = ((byte) ((int) (local3_life18 >>> 40)));
    (__sourceSpill1172_19)[3] = ((byte) ((int) (local3_life18 >>> 32)));
    (__sourceSpill1172_19)[4] = ((byte) ((int) (local3_life18 >>> 24)));
    (__sourceSpill1172_19)[5] = ((byte) ((int) (local3_life18 >>> 16)));
    (__sourceSpill1172_19)[6] = ((byte) ((int) (local3_life18 >>> 8)));
    (__sourceSpill1172_19)[7] = ((byte) ((int) local3_life18));
    javax.crypto.Cipher __sourceSpill1172_20 = local1_life8;
    byte[] local5_life22 = ((javax.crypto.Cipher)(__sourceSpill1172_20)).doFinal(((byte[])(__sourceSpill1172_19)));
    long local0_life23 = (((((((((((long) (local5_life22)[0]) & 255L) << 56) | ((((long) (local5_life22)[1]) & 255L) << 48)) | ((((long) (local5_life22)[2]) & 255L) << 40)) | ((((long) (local5_life22)[3]) & 255L) << 32)) | ((((long) (local5_life22)[4]) & 255L) << 24)) | ((((long) (local5_life22)[5]) & 255L) << 16)) | ((((long) (local5_life22)[6]) & 255L) << 8)) | (((long) (local5_life22)[7]) & 255L));
    c = ((net.minecraft.client.renderer.Tessellator)(new net.minecraft.client.renderer.Tessellator(((int) local0_life23))));
}


public static int[] b() {
return net.minecraft.client.renderer.Tessellator.d;
}


public static void b(int[] p0) {
net.minecraft.client.renderer.Tessellator.d = ((int[])(p0));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static net.minecraft.client.renderer.Tessellator a() {
return net.minecraft.client.renderer.Tessellator.c;
}


public moom.lw a__lw() {
return this.a;
}


public void a__Void() {
if ((((moom.lw)(this.a)).v != null)) {
        moom.JY.a(((java.util.BitSet)(((moom.lw)(this.a)).v)));
    }
    ((moom.lw)(this.a)).e();
    ((moom.lz)(this.b)).a(((moom.lw)(this.a)));
    return;
}

}
