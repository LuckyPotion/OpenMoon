package moom;


public class zo implements moom.yK<moom.y3> {

private java.lang.String a;

private int b;

private net.minecraft.entity.player.EntityPlayer$EnumChatVisibility c;

private boolean d;

private int e;

private static final long f;

private static final long g;

public zo() {
super();
}


public zo(java.lang.String p0, int p1, net.minecraft.entity.player.EntityPlayer$EnumChatVisibility p2, boolean p3, int p4) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
    this.d = p3;
    this.e = p4;
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(-4188655111876325668L)), ((long)(-7170797984540598279L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(118544171627149L)))));
    long local0_life6 = (moom.zo.f ^ 75430362940016L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1149_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1149_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1149_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1149_13 = new byte[8];
    (__sourceSpill1149_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1149_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1149_15 = __sourceSpill1149_13;
    ((javax.crypto.Cipher)(__sourceSpill1149_10)).init(((int)(__sourceSpill1149_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1149_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1149_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -5191451576786969891L;
    byte[] __sourceSpill1149_19 = new byte[8];
    (__sourceSpill1149_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1149_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1149_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1149_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1149_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1149_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1149_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1149_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1149_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1149_20)).doFinal(((byte[])(__sourceSpill1149_19)));
    g = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).a(((java.lang.String)(this.a)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(this.b)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(((net.minecraft.entity.player.EntityPlayer$EnumChatVisibility)(this.c)).a())));
    ((net.minecraft.network.PacketBuffer)(p0)).writeBoolean(((boolean)__sourceIntrinsic_integerToBoolean((((this.d) ? 1 : 0)))));
    ((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(this.e)));
    return;
}


public boolean a__Boolean() {
return ((((this.d) ? 1 : 0)) != 0);
}


public int a() {
return this.e;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.zo)(this)).a(((moom.y3)(((moom.y3)(p0)))));
}


public java.lang.String a__String() {
return this.a;
}


public net.minecraft.entity.player.EntityPlayer$EnumChatVisibility a__aW() {
return this.c;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
long local2 = (moom.zo.f ^ 31363942056428L);
    this.a = ((java.lang.String)(((net.minecraft.network.PacketBuffer)(p0)).a__String(((int)(((int) moom.zo.g))))));
    this.b = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readByte()));
    this.c = ((net.minecraft.entity.player.EntityPlayer$EnumChatVisibility)(net.minecraft.entity.player.EntityPlayer$EnumChatVisibility.a(((int)(((net.minecraft.network.PacketBuffer)(p0)).readByte())))));
    this.d = ((boolean)(((net.minecraft.network.PacketBuffer)(p0)).readBoolean()));
    this.e = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readUnsignedByte()));
    return;
}


public void a(moom.y3 p0) {
((moom.y3)(p0)).a(((moom.zo)(this)));
    return;
}


private static native boolean __sourceIntrinsic_integerToBoolean(int value);


}
