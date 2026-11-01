package moom;


public class np extends moom.mU<net.minecraft.entity.boss.EntityWither> {

private static final moom.DD C;

private static final moom.DD D;

private static final long E;

private static final long F;

public np(net.minecraft.client.renderer.entity.RenderManager p0) {
super(p0, new moom.jy(0x0.0p+0f), 0x1.0000000000000p+0f);
    (this).a(new moom.n0(this));
}


static {
E = ((long)(((moom._a)(moom._c.a(((long)(-4080551301242264254L)), ((long)(-8320593565603919767L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(204074806031496L)))));
    long local0_life6 = (moom.np.E ^ 131360086399191L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill946_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill946_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill946_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill946_13 = new byte[8];
    (__sourceSpill946_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill946_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation946_15 = __sourceSpill946_13;
    ((javax.crypto.Cipher)(__sourceSpill946_10)).init(((int)(__sourceSpill946_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill946_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation946_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 2370774384851169269L;
    byte[] __sourceSpill946_19 = new byte[8];
    (__sourceSpill946_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill946_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill946_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill946_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill946_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill946_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill946_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill946_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill946_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill946_20)).doFinal(((byte[])(__sourceSpill946_19)));
    F = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
    C = ((moom.DD)(new moom.DD("textures/entity/wither/wither_invulnerable.png")));
    D = ((moom.DD)(new moom.DD("textures/entity/wither/wither.png")));
}


public void a__sourceBridge_e7b4e99e7e(net.minecraft.entity.EntityLivingBase p0, double p1, double p2, double p3, float p4, float p5) {
((moom.np)(this)).a(((net.minecraft.entity.boss.EntityWither)(((net.minecraft.entity.boss.EntityWither)(p0)))), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
}


protected moom.DD a__sourceBridge_fb93f4301e(net.minecraft.entity.Entity p0) {
return ((moom.np)(this)).a__sourceReturn_092803be55(((net.minecraft.entity.boss.EntityWither)(((net.minecraft.entity.boss.EntityWither)(p0)))));
}


public void a__sourceBridge_01f3c9ade5(net.minecraft.entity.Entity p0, double p1, double p2, double p3, float p4, float p5) {
((moom.np)(this)).a(((net.minecraft.entity.boss.EntityWither)(((net.minecraft.entity.boss.EntityWither)(p0)))), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(net.minecraft.entity.boss.EntityWither p0, double p1, double p2, double p3, float p4, float p5) {
moom.vJ.a(((net.minecraft.entity.boss.IBossDisplayData)(p0)), ((boolean)(true)));
    __sourceExactCall_dc1b8554f2e929(this, ((net.minecraft.entity.EntityLiving)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
    return;
}


protected moom.DD a__sourceReturn_092803be55(net.minecraft.entity.boss.EntityWither p0) {
moom.DD forwardValue3789_23_0;
    long life2_3;
    int life4_6;
    forward_join_23: {
    forward_join_22: {
    forward_join_20: {
    life2_3 = (moom.np.E ^ 90989439948444L);
    life4_6 = ((net.minecraft.entity.boss.EntityWither)(p0)).s();
    if (!((life4_6 > 0))) {
        break forward_join_22;
    }
    if (!((life4_6 <= ((int) moom.np.F)))) {
        break forward_join_20;
    }
    if (!((((life4_6 / 5) % 2) != 1))) {
        break forward_join_22;
    }
    }
    forwardValue3789_23_0 = moom.np.C;
    break forward_join_23;
    }
    forwardValue3789_23_0 = moom.np.D;
    }
    return forwardValue3789_23_0;
}


protected void a__sourceReturn_038a6f3324(net.minecraft.entity.boss.EntityWither p0, float p1) {
float local3 = 0x1.0p1f;
    int local4 = ((net.minecraft.entity.boss.EntityWither)(p0)).s();
    if ((local4 > 0)) {
        local3 = (local3 - (((((float) local4) - p1) / 0x1.b8p7f) * 0x1.0p-1f));
    }
    moom.kZ.a(((float)(local3)), ((float)(local3)), ((float)(local3)));
    return;
}


public void a__sourceBridge_36abde8bbd(net.minecraft.entity.EntityLiving p0, double p1, double p2, double p3, float p4, float p5) {
((moom.np)(this)).a(((net.minecraft.entity.boss.EntityWither)(((net.minecraft.entity.boss.EntityWither)(p0)))), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((float)(p4)), ((float)(p5)));
}


protected void a__Void__sourceBridge_7f50c316df(net.minecraft.entity.EntityLivingBase p0, float p1) {
((moom.np)(this)).a__sourceReturn_038a6f3324(((net.minecraft.entity.boss.EntityWither)(((net.minecraft.entity.boss.EntityWither)(p0)))), ((float)(p1)));
}


public void a__Void(net.minecraft.entity.boss.EntityWither __bridgeParam0, float __bridgeParam1) { this.a__Void__sourceBridge_7f50c316df(((net.minecraft.entity.EntityLivingBase)(__bridgeParam0)), ((float)(__bridgeParam1))); }

public moom.DD a(net.minecraft.entity.boss.EntityWither __bridgeParam0) { return ((moom.DD)(this.a__sourceBridge_fb93f4301e(((net.minecraft.entity.Entity)(__bridgeParam0))))); }

private static native void __sourceExactCall_dc1b8554f2e929(moom.mU p0, net.minecraft.entity.EntityLiving p1, double p2, double p3, double p4, float p5, float p6);
}
