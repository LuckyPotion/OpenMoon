package moom;


public class pu implements net.minecraft.client.resources.model.IBakedModel {

private final int a;

private final java.util.List<moom.D2> b;

private final net.minecraft.client.resources.model.IBakedModel c;

private static final long d;

private static final long e;

public pu(java.util.List<moom.D2> p0) {
super();
    this.b = p0;
    this.a = moom.D0.a(p0);
    this.c = ((moom.D2) ((p0).get(0))).c;
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(2310590923494541300L)), ((long)(-2794647190503124984L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(39804266654701L)))));
    long local0_life6 = (moom.pu.d ^ 412317919630L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill967_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill967_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill967_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill967_13 = new byte[8];
    (__sourceSpill967_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill967_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation967_15 = __sourceSpill967_13;
    ((javax.crypto.Cipher)(__sourceSpill967_10)).init(((int)(__sourceSpill967_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill967_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation967_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -3469113473349113037L;
    byte[] __sourceSpill967_19 = new byte[8];
    (__sourceSpill967_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill967_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill967_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill967_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill967_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill967_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill967_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill967_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill967_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill967_20)).doFinal(((byte[])(__sourceSpill967_19)));
    e = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public boolean b() {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.client.resources.model.IBakedModel)(this.c)).b())) != 0);
}


public boolean c() {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.client.resources.model.IBakedModel)(this.c)).c())) != 0);
}


public java.util.List<moom.lC> a() {
return ((net.minecraft.client.resources.model.IBakedModel)(this.c)).a();
}


public net.minecraft.client.resources.model.IBakedModel a(long p0) {
long local3 = (moom.pu.d ^ 90753102132323L);
    return ((moom.D2)(((moom.D2)(moom.D0.a(((java.util.Collection)(this.b)), ((int)((java.lang.Math.abs(((int)((((int) p0) >> ((int) moom.pu.e))))) % this.a)))))))).c;
}


public moom.lP a__lP() {
return ((net.minecraft.client.resources.model.IBakedModel)(this.c)).a__lP();
}


public net.minecraft.client.renderer.texture.TextureAtlasSprite a__oh() {
return ((net.minecraft.client.resources.model.IBakedModel)(this.c)).a__oh();
}


public java.util.List<moom.lC> a(moom.bs p0) {
return ((net.minecraft.client.resources.model.IBakedModel)(this.c)).a(((moom.bs)(p0)));
}


public boolean a__Boolean() {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.client.resources.model.IBakedModel)(this.c)).a__Boolean())) != 0);
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
