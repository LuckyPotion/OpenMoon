package moom;


public class yW implements moom.yK<moom.yV> {

private com.mojang.authlib.GameProfile a;

private static int[] b;

private static final long c;

private static final long d;

public yW() {
super();
}


public yW(com.mojang.authlib.GameProfile p0) {
super();
    this.a = p0;
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(3374128569221107789L)), ((long)(958948861205577160L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(241044687185876L)))));
    java.lang.Object __sourceSpill1124_6 = null;
    long local0_life7 = (moom.yW.c ^ 87047585648353L);
    moom.yW.b(((int[])(__sourceSpill1124_6)));
    javax.crypto.Cipher local2_life10;
    javax.crypto.Cipher __sourceSpill1124_12 = (local2_life10 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1124_13 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1124_14 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1124_15 = new byte[8];
    (__sourceSpill1124_15)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life16 = 1;
    while ((local3_life16 < 8)) {
        (__sourceSpill1124_15)[local3_life16] = ((byte) ((int) ((local0_life7 << (local3_life16 * 8)) >>> 56)));
        local3_life16 += 1;
    }
    byte[] __sourcePreallocation1124_17 = __sourceSpill1124_15;
    ((javax.crypto.Cipher)(__sourceSpill1124_12)).init(((int)(__sourceSpill1124_13)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1124_14)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1124_17)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life20 = 4890459467860189186L;
    byte[] __sourceSpill1124_21 = new byte[8];
    (__sourceSpill1124_21)[0] = ((byte) ((int) (local4_life20 >>> 56)));
    (__sourceSpill1124_21)[1] = ((byte) ((int) (local4_life20 >>> 48)));
    (__sourceSpill1124_21)[2] = ((byte) ((int) (local4_life20 >>> 40)));
    (__sourceSpill1124_21)[3] = ((byte) ((int) (local4_life20 >>> 32)));
    (__sourceSpill1124_21)[4] = ((byte) ((int) (local4_life20 >>> 24)));
    (__sourceSpill1124_21)[5] = ((byte) ((int) (local4_life20 >>> 16)));
    (__sourceSpill1124_21)[6] = ((byte) ((int) (local4_life20 >>> 8)));
    (__sourceSpill1124_21)[7] = ((byte) ((int) local4_life20));
    javax.crypto.Cipher __sourceSpill1124_22 = local2_life10;
    byte[] local6_life24 = ((javax.crypto.Cipher)(__sourceSpill1124_22)).doFinal(((byte[])(__sourceSpill1124_21)));
    d = ((long)((((((((((((long) (local6_life24)[0]) & 255L) << 56) | ((((long) (local6_life24)[1]) & 255L) << 48)) | ((((long) (local6_life24)[2]) & 255L) << 40)) | ((((long) (local6_life24)[3]) & 255L) << 32)) | ((((long) (local6_life24)[4]) & 255L) << 24)) | ((((long) (local6_life24)[5]) & 255L) << 16)) | ((((long) (local6_life24)[6]) & 255L) << 8)) | (((long) (local6_life24)[7]) & 255L))));
}


public static void b(int[] p0) {
b = ((int[])(p0));
    return;
}


public static int[] b() {
return moom.yW.b;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).a(((java.lang.String)(((com.mojang.authlib.GameProfile)(this.a)).getName())));
    return;
}


public com.mojang.authlib.GameProfile a() {
return this.a;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.yW)(this)).a(((moom.yV)(((moom.yV)(p0)))));
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
long local2 = (moom.yW.c ^ 85068604480374L);
    this.a = ((com.mojang.authlib.GameProfile)(new com.mojang.authlib.GameProfile(null, ((net.minecraft.network.PacketBuffer)(p0)).a__String(((int)(((int) moom.yW.d)))))));
    return;
}


public void a(moom.yV p0) {
((moom.yV)(p0)).a(((moom.yW)(this)));
    return;
}



}
