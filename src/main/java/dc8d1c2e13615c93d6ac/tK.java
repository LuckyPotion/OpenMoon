package moom;


public class tK extends net.minecraft.entity.Entity {

public int aE;

private net.minecraft.entity.EntityLivingBase aF;

private static long bb;

private static long cb;

public tK(net.minecraft.world.World p0) {
super(p0);
    this.e = true;
    (this).a__Void(0x1.f5c2900000000p-1f, 0x1.f5c2900000000p-1f);
}


public tK(net.minecraft.world.World p0, double p1, double p2, double p3, net.minecraft.entity.EntityLivingBase p4) { this((net.minecraft.world.World)null); }


private static void __sourceConstructorBody_03af7677f55d0b0c(moom.tK receiver, net.minecraft.world.World p0, double p1, double p2, double p3, net.minecraft.entity.EntityLivingBase p4) throws Throwable {

long local9_life1 = (moom.tK.bb ^ 97462991621981L);

    moom.tK.__sourceConstructorInit_03af7677f55d0b0c_0(((moom.tK)(receiver)), ((net.minecraft.world.World)(p0)));

    ((moom.tK)(receiver)).a__Void(((double)(p1)), ((double)(p2)), ((double)(p3)));

    float local11_life5 = ((float) ((java.lang.Math.random() * 0x1.921fb54442d18p1d) * 0x1.0p1d));

    ((moom.tK)(receiver)).t = ((double)(((double) ((-((float) java.lang.Math.sin(((double)(((double) local11_life5)))))) * 0x1.47ae14p-6f))));

    ((moom.tK)(receiver)).u = ((double)(0x1.99999ap-3d));

    ((moom.tK)(receiver)).v = ((double)(((double) ((-((float) java.lang.Math.cos(((double)(((double) local11_life5)))))) * 0x1.47ae14p-6f))));

    ((moom.tK)(receiver)).aE = ((int)(((int) moom.tK.cb)));

    ((moom.tK)(receiver)).k = ((double)(p1));

    ((moom.tK)(receiver)).l = ((double)(p2));

    ((moom.tK)(receiver)).m = ((double)(p3));

    ((moom.tK)(receiver)).aF = ((net.minecraft.entity.EntityLivingBase)(p4));

    return;

}



static {
bb = ((long)(((moom._a)(moom._c.a(((long)(7611316106545391244L)), ((long)(1446420477019181680L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(117971936871113L)))));
    long local0_life6 = (moom.tK.bb ^ 14996818620058L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1027_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1027_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1027_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1027_13 = new byte[8];
    (__sourceSpill1027_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1027_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1027_15 = __sourceSpill1027_13;
    ((javax.crypto.Cipher)(__sourceSpill1027_10)).init(((int)(__sourceSpill1027_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1027_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1027_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -1656703362468329681L;
    byte[] __sourceSpill1027_19 = new byte[8];
    (__sourceSpill1027_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1027_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1027_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1027_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1027_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1027_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1027_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1027_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1027_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1027_20)).doFinal(((byte[])(__sourceSpill1027_19)));
    cb = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceConstructorInit_03af7677f55d0b0c_0(moom.tK a0, net.minecraft.world.World a1) throws E;

public float e__Float() {
return 0x0.0p0f;
}


protected void c(net.minecraft.nbt.NBTTagCompound p0) {
this.aE = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__sourceReturn_d4c7a9581c(((java.lang.String)("Fuse")))));
    return;
}


protected void d__Void() {
return;
}


protected void d(net.minecraft.nbt.NBTTagCompound p0) {
((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Fuse")), ((byte)(((byte) this.aE))));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.entity.EntityLivingBase a() {
return this.aF;
}


private void a__Void() {
float local1 = 0x1.0p2f;
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.entity.Entity)(this)), ((double)(this.n)), ((double)((this.o + ((double) (this.H / 0x1.0p4f))))), ((double)(this.p)), ((float)(local1)), ((boolean)(true)));
    return;
}


public boolean m__Boolean() {
int forwardValue4055_12_0;
    int forwardValue4055_14_0;
    boolean spill4055_0;
    long life1_3;
    int life3_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (moom.tK.bb ^ 20325049134317L);
    life3_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    spill4055_0 = this.F;
    if (!((life3_5 == 0))) {
        forwardValue4055_12_0 = ((spill4055_0) ? 1 : 0);
        break forward_join_12;
    }
    if (!((!spill4055_0))) {
        break forward_join_13;
    }
    forwardValue4055_12_0 = 1;
    }
    forwardValue4055_14_0 = forwardValue4055_12_0;
    break forward_join_14;
    }
    forwardValue4055_14_0 = 0;
    }
    return ((forwardValue4055_14_0) != 0);
}


public void g__Void() {
int forwardValue4054_80_0;
    moom.tK forwardValue4054_92_0;
    int forwardValue4054_97_0;
    int spill4054_0;
    boolean spill4054_1;
    int spill4054_2;
    moom.tK spill4054_3;
    long life1_3;
    int life3_49;
    forward_join_115: {
    forward_join_97: {
    forward_join_95: {
    forward_join_92: {
    forward_join_80: {
    forward_join_73: {
    life1_3 = (moom.tK.bb ^ 43965281356425L);
    this.k = ((double)(this.n));
    this.l = ((double)(this.o));
    this.m = ((double)(this.p));
    moom.tK __stackOp4054_7_0 = this;
    ((moom.tK)(__stackOp4054_7_0)).u = ((double)((((moom.tK)(__stackOp4054_7_0)).u - 0x1.47ae14p-5d)));
    ((moom.tK)(this)).b__Void(((double)(this.t)), ((double)(this.u)), ((double)(this.v)));
    spill4054_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    moom.tK __stackOp4054_15_0 = this;
    ((moom.tK)(__stackOp4054_15_0)).t = ((double)((((moom.tK)(__stackOp4054_15_0)).t * 0x1.f5c29p-1d)));
    moom.tK __stackOp4054_18_0 = this;
    ((moom.tK)(__stackOp4054_18_0)).u = ((double)((((moom.tK)(__stackOp4054_18_0)).u * 0x1.f5c29p-1d)));
    moom.tK __stackOp4054_21_0 = this;
    ((moom.tK)(__stackOp4054_21_0)).v = ((double)((((moom.tK)(__stackOp4054_21_0)).v * 0x1.f5c29p-1d)));
    life3_49 = spill4054_0;
    spill4054_1 = this.A;
    if (!((life3_49 != 0))) {
        forwardValue4054_80_0 = ((spill4054_1) ? 1 : 0);
        break forward_join_80;
    }
    if (!(spill4054_1)) {
        break forward_join_73;
    }
    moom.tK __stackOp4054_26_0 = this;
    ((moom.tK)(__stackOp4054_26_0)).t = ((double)((((moom.tK)(__stackOp4054_26_0)).t * 0x1.666666p-1d)));
    moom.tK __stackOp4054_29_0 = this;
    ((moom.tK)(__stackOp4054_29_0)).v = ((double)((((moom.tK)(__stackOp4054_29_0)).v * 0x1.666666p-1d)));
    moom.tK __stackOp4054_32_0 = this;
    ((moom.tK)(__stackOp4054_32_0)).u = ((double)((((moom.tK)(__stackOp4054_32_0)).u * -0x1.0p-1d)));
    }
    moom.tK __stackOp4054_35_0 = this;
    moom.tK __stackOp4054_37_0 = __stackOp4054_35_0;
    int __stackOp4054_37_1 = ((moom.tK)(__stackOp4054_35_0)).aE;
    spill4054_2 = __stackOp4054_37_1;
    ((moom.tK)(__stackOp4054_37_0)).aE = ((int)((__stackOp4054_37_1 - 1)));
    forwardValue4054_80_0 = spill4054_2;
    }
    if (!((life3_49 != 0))) {
        forwardValue4054_97_0 = forwardValue4054_80_0;
        break forward_join_97;
    }
    if (!((forwardValue4054_80_0 <= 0))) {
        break forward_join_95;
    }
    ((moom.tK)(this)).f__Void();
    spill4054_3 = this;
    if (!((life3_49 != 0))) {
        forwardValue4054_92_0 = spill4054_3;
        break forward_join_92;
    }
    if (!((!((net.minecraft.world.World)(((moom.tK)(spill4054_3)).i)).G))) {
        break forward_join_115;
    }
    forwardValue4054_92_0 = this;
    }
    ((moom.tK)(forwardValue4054_92_0)).a__Void();
    if (!((life3_49 == 0))) {
        break forward_join_115;
    }
    }
    forwardValue4054_97_0 = ((((moom.tK)(this)).k__Boolean()) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue4054_97_0);
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.SMOKE_NORMAL)), ((double)(this.n)), ((double)((this.o + 0x1.0p-1d))), ((double)(this.p)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    }
    return;
}


protected boolean g__Boolean() {
return ((0) != 0);
}

}
