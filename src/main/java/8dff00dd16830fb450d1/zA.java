package moom;


public class zA implements moom.yK<moom.y2> {

private int a;

private net.minecraft.world.EnumDifficulty b;

private net.minecraft.world.WorldSettings$GameType c;

private net.minecraft.world.WorldType d;

private static final long e;

private static final long f;

public zA() {
super();
}


public zA(int p0, net.minecraft.world.EnumDifficulty p1, net.minecraft.world.WorldType p2, net.minecraft.world.WorldSettings$GameType p3) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p3;
    this.d = p2;
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(2116443557795091897L)), ((long)(78849741799658752L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(112962887455137L)))));
    long local0_life6 = (moom.zA.e ^ 116692715343260L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1142_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1142_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1142_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1142_13 = new byte[8];
    (__sourceSpill1142_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1142_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1142_15 = __sourceSpill1142_13;
    ((javax.crypto.Cipher)(__sourceSpill1142_10)).init(((int)(__sourceSpill1142_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1142_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1142_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -6321014590869900108L;
    byte[] __sourceSpill1142_19 = new byte[8];
    (__sourceSpill1142_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1142_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1142_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1142_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1142_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1142_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1142_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1142_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1142_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1142_20)).doFinal(((byte[])(__sourceSpill1142_19)));
    f = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).writeInt(((int)(this.a)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(((net.minecraft.world.EnumDifficulty)(this.b)).a())));
    ((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(((net.minecraft.world.WorldSettings$GameType)(this.c)).a())));
    ((net.minecraft.network.PacketBuffer)(p0)).a(((java.lang.String)(((net.minecraft.world.WorldType)(this.d)).a__String())));
    return;
}


public net.minecraft.world.WorldSettings$GameType a__bE() {
return this.c;
}


public net.minecraft.world.WorldType a__EL() {
return this.d;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.zA)(this)).a(((moom.y2)(((moom.y2)(p0)))));
}


private static java.io.IOException a(java.io.IOException p0) {
return p0;
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.zA)(this)));
    return;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
moom.zA forwardValue4592_33_0;
    int[] spill4592_0;
    moom.zA spill4592_1;
    long life2_3;
    int[] life4_14;
    forward_join_35: {
    forward_join_33: {
    life2_3 = (moom.zA.e ^ 109245450534892L);
    spill4592_0 = moom.zN.b__ArrayInt();
    this.a = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readInt()));
    this.b = ((net.minecraft.world.EnumDifficulty)(net.minecraft.world.EnumDifficulty.a(((int)(((net.minecraft.network.PacketBuffer)(p0)).readUnsignedByte())))));
    life4_14 = spill4592_0;
    this.c = ((net.minecraft.world.WorldSettings$GameType)(net.minecraft.world.WorldSettings$GameType.a(((int)(((net.minecraft.network.PacketBuffer)(p0)).readUnsignedByte())))));
    this.d = ((net.minecraft.world.WorldType)(net.minecraft.world.WorldType.a(((java.lang.String)(((net.minecraft.network.PacketBuffer)(p0)).a__String(((int)(((int) moom.zA.f)))))))));
    spill4592_1 = this;
    if (!((life4_14 == null))) {
        forwardValue4592_33_0 = spill4592_1;
        break forward_join_33;
    }
    if (!((((moom.zA)(spill4592_1)).d == null))) {
        break forward_join_35;
    }
    forwardValue4592_33_0 = this;
    }
    ((moom.zA)(forwardValue4592_33_0)).d = ((net.minecraft.world.WorldType)(net.minecraft.world.WorldType.b));
    }
    return;
}


public int a() {
return this.a;
}


public net.minecraft.world.EnumDifficulty a__bB() {
return this.b;
}



}
