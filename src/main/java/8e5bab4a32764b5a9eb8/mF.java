package moom;


public class mF extends net.minecraft.client.renderer.entity.Render<net.minecraft.entity.item.EntityFallingBlock> {

private static final long h;

private static final long i;

public mF(net.minecraft.client.renderer.entity.RenderManager p0) {
super(p0);
    this.c = 0x1.0000000000000p-1f;
}


static {
h = ((long)(((moom._a)(moom._c.a(((long)(-7285946454100347964L)), ((long)(4725526846034828133L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(35812824176542L)))));
    long local0_life6 = (moom.mF.h ^ 23996276602443L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill930_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill930_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill930_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill930_13 = new byte[8];
    (__sourceSpill930_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill930_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation930_15 = __sourceSpill930_13;
    ((javax.crypto.Cipher)(__sourceSpill930_10)).init(((int)(__sourceSpill930_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill930_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation930_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -4821590683159796769L;
    byte[] __sourceSpill930_19 = new byte[8];
    (__sourceSpill930_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill930_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill930_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill930_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill930_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill930_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill930_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill930_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill930_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill930_20)).doFinal(((byte[])(__sourceSpill930_19)));
    i = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a__sourceBridge_01f3c9ade5(net.minecraft.entity.Entity p0, double p1, double p2, double p3, float p4, float p5) {
((moom.mF)(this)).a(((net.minecraft.entity.item.EntityFallingBlock)(((net.minecraft.entity.item.EntityFallingBlock)(p0)))), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
}


protected moom.DD a__sourceBridge_fb93f4301e(net.minecraft.entity.Entity p0) {
return ((moom.mF)(this)).a(((net.minecraft.entity.item.EntityFallingBlock)(((net.minecraft.entity.item.EntityFallingBlock)(p0)))));
}


protected moom.DD a(net.minecraft.entity.item.EntityFallingBlock p0) {
return net.minecraft.client.renderer.texture.TextureMap.k;
}


public void a(net.minecraft.entity.item.EntityFallingBlock p0, double p1, double p2, double p3, float p4, float p5) {
long life10_3;
    net.minecraft.block.state.IBlockState life12_12;
    net.minecraft.block.Block life13_15;
    moom.DT life14_20;
    net.minecraft.world.World life15_23;
    net.minecraft.client.renderer.Tessellator life16_53;
    moom.lw life17_56;
    int life18_64;
    int life19_67;
    int life20_70;
    net.minecraft.client.renderer.BlockRendererDispatcher life21_90;
    net.minecraft.client.resources.model.IBakedModel life22_96;
    life10_3 = (moom.mF.h ^ 82603561699222L);
    if ((__sourceExactCall_289bceb45520c8(((net.minecraft.entity.item.EntityFallingBlock)(p0))) != null)) {
        ((moom.mF)(this)).b(((moom.DD)(net.minecraft.client.renderer.texture.TextureMap.k)));
        life12_12 = __sourceExactCall_289bceb45520c8(((net.minecraft.entity.item.EntityFallingBlock)(p0)));
        life13_15 = ((net.minecraft.block.state.IBlockState)(life12_12)).a__ch();
        life14_20 = new moom.DT(p0);
        life15_23 = ((net.minecraft.entity.item.EntityFallingBlock)(p0)).b__sourceReturn_818f27b2a7();
        if ((life12_12 != ((net.minecraft.world.World)(life15_23)).a__fE(((moom.DT)(life14_20))))) {
        if ((((net.minecraft.block.Block)(life13_15)).c__Int() != -1)) {
        if ((((net.minecraft.block.Block)(life13_15)).c__Int() == 3)) {
        moom.kZ.B();
        moom.kZ.b(((float)(((float) p1))), ((float)(((float) p2))), ((float)(((float) p3))));
        moom.kZ.f();
        life16_53 = __sourceExactCall_607dff73cf88f9();
        life17_56 = ((net.minecraft.client.renderer.Tessellator)(life16_53)).a__lw();
        __sourceExactCall_b6c6a7d43443b6(((moom.lw)(life17_56)), ((int)(((int) moom.mF.i))), ((moom.oD)(moom.oB.a)));
        life18_64 = __sourceExactCall_6ff3573bd2c314(((moom.DT)(life14_20)));
        life19_67 = ((moom.DT)(life14_20)).b();
        life20_70 = ((moom.DT)(life14_20)).c();
        ((moom.lw)(life17_56)).b(((double)(((double) (((float) (-life18_64)) - 0x1.0p-1f)))), ((double)(((double) (-life19_67)))), ((double)(((double) (((float) (-life20_70)) - 0x1.0p-1f)))));
        life21_90 = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__kP();
        life22_96 = __sourceExactCall_e15b7ea35b9256(((net.minecraft.client.renderer.BlockRendererDispatcher)(life21_90)), ((net.minecraft.block.state.IBlockState)(life12_12)), ((net.minecraft.world.IBlockAccess)(life15_23)), ((moom.DT)(null)));
        ((moom.kK)(__sourceExactCall_b5ddf2d162d207(((net.minecraft.client.renderer.BlockRendererDispatcher)(life21_90))))).a(((net.minecraft.world.IBlockAccess)(life15_23)), ((net.minecraft.client.resources.model.IBakedModel)(life22_96)), ((net.minecraft.block.state.IBlockState)(life12_12)), ((moom.DT)(life14_20)), ((moom.lw)(life17_56)), ((boolean)(false)));
        ((moom.lw)(life17_56)).b(((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)));
        ((net.minecraft.client.renderer.Tessellator)(life16_53)).a__Void();
        moom.kZ.e();
        moom.kZ.C();
        __sourceExactCall_76ed68570395ae(this, ((net.minecraft.entity.Entity)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
    }
    }
    }
    }
    return;
}




private static native net.minecraft.block.state.IBlockState __sourceExactCall_289bceb45520c8(net.minecraft.entity.item.EntityFallingBlock p0);
private static native net.minecraft.client.renderer.Tessellator __sourceExactCall_607dff73cf88f9();
private static native void __sourceExactCall_b6c6a7d43443b6(moom.lw p0, int p1, moom.oD p2);
private static native int __sourceExactCall_6ff3573bd2c314(moom.DT p0);
private static native net.minecraft.client.resources.model.IBakedModel __sourceExactCall_e15b7ea35b9256(net.minecraft.client.renderer.BlockRendererDispatcher p0, net.minecraft.block.state.IBlockState p1, net.minecraft.world.IBlockAccess p2, moom.DT p3);
private static native moom.kK __sourceExactCall_b5ddf2d162d207(net.minecraft.client.renderer.BlockRendererDispatcher p0);
private static native void __sourceExactCall_76ed68570395ae(net.minecraft.client.renderer.entity.Render p0, net.minecraft.entity.Entity p1, double p2, double p3, double p4, float p5, float p6);
}
