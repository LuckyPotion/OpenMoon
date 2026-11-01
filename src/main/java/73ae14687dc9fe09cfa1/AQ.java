package moom;


public class AQ implements moom.yK<moom.AM> {

private static final com.google.gson.Gson a;

private net.minecraft.network.ServerStatusResponse b;

private static final long c;

private static final long d;

public AQ() {
super();
}


public AQ(net.minecraft.network.ServerStatusResponse p0) {
super();
    this.b = p0;
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(-1606134150813492504L)), ((long)(-7531373294067057960L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(277632322741452L)))));
    long local0_life6 = (moom.AQ.c ^ 36594583594181L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill468_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill468_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill468_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill468_13 = new byte[8];
    (__sourceSpill468_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill468_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation468_15 = __sourceSpill468_13;
    ((javax.crypto.Cipher)(__sourceSpill468_10)).init(((int)(__sourceSpill468_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill468_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation468_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 1095949226338903867L;
    byte[] __sourceSpill468_19 = new byte[8];
    (__sourceSpill468_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill468_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill468_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill468_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill468_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill468_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill468_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill468_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill468_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill468_20)).doFinal(((byte[])(__sourceSpill468_19)));
    d = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
    a = ((com.google.gson.Gson)(((com.google.gson.GsonBuilder)(((com.google.gson.GsonBuilder)(((com.google.gson.GsonBuilder)(((com.google.gson.GsonBuilder)(((com.google.gson.GsonBuilder)(((com.google.gson.GsonBuilder)(((com.google.gson.GsonBuilder)(new com.google.gson.GsonBuilder())).registerTypeAdapter(((java.lang.reflect.Type)(net.minecraft.network.ServerStatusResponse$MinecraftProtocolVersionIdentifier.class)), ((java.lang.Object)(new moom.yO()))))).registerTypeAdapter(((java.lang.reflect.Type)(net.minecraft.network.ServerStatusResponse$PlayerCountData.class)), ((java.lang.Object)(new moom.yQ()))))).registerTypeAdapter(((java.lang.reflect.Type)(net.minecraft.network.ServerStatusResponse.class)), ((java.lang.Object)(new moom.yR()))))).registerTypeHierarchyAdapter(((java.lang.Class)(net.minecraft.util.IChatComponent.class)), ((java.lang.Object)(new net.minecraft.util.IChatComponent$Serializer()))))).registerTypeHierarchyAdapter(((java.lang.Class)(moom.CO.class)), ((java.lang.Object)(new moom.CQ()))))).registerTypeAdapterFactory(((com.google.gson.TypeAdapterFactory)(new moom.C1()))))).create()));
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
long local2 = (moom.AQ.c ^ 56263623518884L);
    java.lang.String spill3089_0 = moom.AR.b();
    ((net.minecraft.network.PacketBuffer)(p0)).a(((java.lang.String)(((com.google.gson.Gson)(moom.AQ.a)).toJson(((java.lang.Object)(this.b))))));
    java.lang.String local4 = spill3089_0;
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        moom.AR.b(((java.lang.String)("A7qfJc")));
    }
    return;
}


private static java.io.IOException a(java.io.IOException p0) {
return p0;
}


public void a__sourceBridge_691ab4d076(moom.yE p0) {
((moom.AQ)(this)).a(((moom.AM)(((moom.AM)(p0)))));
}


public net.minecraft.network.ServerStatusResponse a() {
return this.b;
}


public void a(moom.AM p0) {
((moom.AM)(p0)).a(((moom.AQ)(this)));
    return;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
long local2 = (moom.AQ.c ^ 76957611620653L);
    java.lang.String spill3090_0 = moom.AR.b();
    this.b = ((net.minecraft.network.ServerStatusResponse)(((net.minecraft.network.ServerStatusResponse)(((com.google.gson.Gson)(moom.AQ.a)).fromJson(((java.lang.String)(((net.minecraft.network.PacketBuffer)(p0)).a__String(((int)(((int) moom.AQ.d)))))), ((java.lang.Class)(net.minecraft.network.ServerStatusResponse.class)))))));
    java.lang.String local4 = spill3090_0;
    if ((local4 != null)) {
        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[2])));
    }
    return;
}



}
