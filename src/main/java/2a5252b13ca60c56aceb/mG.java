package moom;


public class mG extends net.minecraft.client.renderer.entity.Render<net.minecraft.entity.projectile.EntityFireball> {

private final float h;

private static final long i;

private static final long j;

public mG(net.minecraft.client.renderer.entity.RenderManager p0, float p1) {
super(p0);
    this.h = p1;
}


static {
i = ((long)(((moom._a)(moom._c.a(((long)(5751901757663953516L)), ((long)(4476377533809655401L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(1234909696553L)))));
    long local0_life6 = (moom.mG.i ^ 138528502754910L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill931_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill931_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill931_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill931_13 = new byte[8];
    (__sourceSpill931_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill931_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation931_15 = __sourceSpill931_13;
    ((javax.crypto.Cipher)(__sourceSpill931_10)).init(((int)(__sourceSpill931_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill931_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation931_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -466232608085051048L;
    byte[] __sourceSpill931_19 = new byte[8];
    (__sourceSpill931_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill931_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill931_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill931_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill931_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill931_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill931_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill931_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill931_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill931_20)).doFinal(((byte[])(__sourceSpill931_19)));
    j = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


protected moom.DD a__sourceBridge_fb93f4301e(net.minecraft.entity.Entity p0) {
return ((moom.mG)(this)).a(((net.minecraft.entity.projectile.EntityFireball)(((net.minecraft.entity.projectile.EntityFireball)(p0)))));
}


public void a__sourceBridge_01f3c9ade5(net.minecraft.entity.Entity p0, double p1, double p2, double p3, float p4, float p5) {
((moom.mG)(this)).a(((net.minecraft.entity.projectile.EntityFireball)(((net.minecraft.entity.projectile.EntityFireball)(p0)))), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
}


public void a(net.minecraft.entity.projectile.EntityFireball p0, double p1, double p2, double p3, float p4, float p5) {
long local10 = (moom.mG.i ^ 49556389640480L);
    moom.kZ.B();
    __sourceExactCall_8034d62fca18bb(((moom.mG)(this)), ((net.minecraft.entity.Entity)(p0)));
    __sourceExactCall_f6b60eb6b2432b(((float)(((float) p1))), ((float)(((float) p2))), ((float)(((float) p3))));
    moom.kZ.y();
    __sourceExactCall_c87cfdff997c62(((float)(this.h)), ((float)(this.h)), ((float)(this.h)));
    net.minecraft.client.renderer.texture.TextureAtlasSprite local12 = __sourceExactCall_847d32fcab4da6(((moom.ll)(__sourceExactCall_5010e54ba3acc5(((net.minecraft.client.renderer.entity.RenderItem)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__nv()))))), ((net.minecraft.item.Item)(net.minecraft.init.Items.bA)));
    net.minecraft.client.renderer.Tessellator local13 = __sourceExactCall_607dff73cf88f9();
    moom.lw local14 = ((net.minecraft.client.renderer.Tessellator)(local13)).a__lw();
    float local15 = __sourceExactCall_7f9b11891066e8(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(local12)));
    float local16 = __sourceExactCall_3a635f0015d060(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(local12)));
    float local17 = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(local12)).c();
    float local18 = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(local12)).d();
    float local19 = 0x1.0p0f;
    float local20 = 0x1.0p-1f;
    float local21 = 0x1.0p-2f;
    __sourceExactCall_1335870edf69d2(((float)((0x1.68p7f - ((net.minecraft.client.renderer.entity.RenderManager)(this.b)).g))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    __sourceExactCall_1335870edf69d2(((float)((-((net.minecraft.client.renderer.entity.RenderManager)(this.b)).h))), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    __sourceExactCall_b6c6a7d43443b6(((moom.lw)(local14)), ((int)(((int) moom.mG.j))), ((moom.oD)(moom.oB.l)));
    ((moom.lw)(__sourceExactCall_49921e0973e9e6(((moom.lw)(__sourceExactCall_7c0370b7b41901(((moom.lw)(__sourceExactCall_217a742e4be448(((moom.lw)(local14)), ((double)(-0x1.0p-1d)), ((double)(-0x1.0p-2d)), ((double)(0x0.0p0d))))), ((double)(((double) local15))), ((double)(((double) local18)))))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f))))).c__Void();
    ((moom.lw)(__sourceExactCall_49921e0973e9e6(((moom.lw)(__sourceExactCall_7c0370b7b41901(((moom.lw)(__sourceExactCall_217a742e4be448(((moom.lw)(local14)), ((double)(0x1.0p-1d)), ((double)(-0x1.0p-2d)), ((double)(0x0.0p0d))))), ((double)(((double) local16))), ((double)(((double) local18)))))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f))))).c__Void();
    ((moom.lw)(__sourceExactCall_49921e0973e9e6(((moom.lw)(__sourceExactCall_7c0370b7b41901(((moom.lw)(__sourceExactCall_217a742e4be448(((moom.lw)(local14)), ((double)(0x1.0p-1d)), ((double)(0x1.8p-1d)), ((double)(0x0.0p0d))))), ((double)(((double) local16))), ((double)(((double) local17)))))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f))))).c__Void();
    ((moom.lw)(__sourceExactCall_49921e0973e9e6(((moom.lw)(__sourceExactCall_7c0370b7b41901(((moom.lw)(__sourceExactCall_217a742e4be448(((moom.lw)(local14)), ((double)(-0x1.0p-1d)), ((double)(0x1.8p-1d)), ((double)(0x0.0p0d))))), ((double)(((double) local15))), ((double)(((double) local17)))))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f))))).c__Void();
    ((net.minecraft.client.renderer.Tessellator)(local13)).a__Void();
    moom.kZ.z();
    moom.kZ.C();
    __sourceExactCall_76ed68570395ae(this, ((net.minecraft.entity.Entity)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
    return;
}


protected moom.DD a(net.minecraft.entity.projectile.EntityFireball p0) {
return net.minecraft.client.renderer.texture.TextureMap.k;
}




private static native boolean __sourceExactCall_8034d62fca18bb(moom.mG p0, net.minecraft.entity.Entity p1);
private static native void __sourceExactCall_f6b60eb6b2432b(float p0, float p1, float p2);
private static native void __sourceExactCall_c87cfdff997c62(float p0, float p1, float p2);
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __sourceExactCall_847d32fcab4da6(moom.ll p0, net.minecraft.item.Item p1);
private static native moom.ll __sourceExactCall_5010e54ba3acc5(net.minecraft.client.renderer.entity.RenderItem p0);
private static native net.minecraft.client.renderer.Tessellator __sourceExactCall_607dff73cf88f9();
private static native float __sourceExactCall_7f9b11891066e8(net.minecraft.client.renderer.texture.TextureAtlasSprite p0);
private static native float __sourceExactCall_3a635f0015d060(net.minecraft.client.renderer.texture.TextureAtlasSprite p0);
private static native void __sourceExactCall_1335870edf69d2(float p0, float p1, float p2, float p3);
private static native void __sourceExactCall_b6c6a7d43443b6(moom.lw p0, int p1, moom.oD p2);
private static native moom.lw __sourceExactCall_49921e0973e9e6(moom.lw p0, float p1, float p2, float p3);
private static native moom.lw __sourceExactCall_7c0370b7b41901(moom.lw p0, double p1, double p2);
private static native moom.lw __sourceExactCall_217a742e4be448(moom.lw p0, double p1, double p2, double p3);
private static native void __sourceExactCall_76ed68570395ae(net.minecraft.client.renderer.entity.Render p0, net.minecraft.entity.Entity p1, double p2, double p3, double p4, float p5, float p6);
}
