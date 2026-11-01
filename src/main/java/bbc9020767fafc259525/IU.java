package moom;


public class IU extends net.minecraft.world.storage.SaveHandler {

private static final long g;

private static final long i;

public IU(java.io.File p0, java.lang.String p1, boolean p2) {
super(p0, p1, p2);
}


static {
g = ((long)(((moom._a)(moom._c.a(((long)(6222983958829487293L)), ((long)(-4818299928380371248L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(213221693808448L)))));
    long local0_life6 = (moom.IU.g ^ 84151492344109L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill579_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill579_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill579_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill579_13 = new byte[8];
    (__sourceSpill579_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill579_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation579_15 = __sourceSpill579_13;
    ((javax.crypto.Cipher)(__sourceSpill579_10)).init(((int)(__sourceSpill579_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill579_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation579_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -42651137377873037L;
    byte[] __sourceSpill579_19 = new byte[8];
    (__sourceSpill579_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill579_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill579_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill579_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill579_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill579_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill579_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill579_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill579_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill579_20)).doFinal(((byte[])(__sourceSpill579_19)));
    i = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public void b() {
try {
        ((moom.IW)(moom.IW.a())).b();
    } catch (java.lang.InterruptedException caught1) {
        ((java.lang.InterruptedException)(caught1)).printStackTrace();
    }
    moom.Fw.a();
    return;
}


public void a(net.minecraft.world.storage.WorldInfo p0, net.minecraft.nbt.NBTTagCompound p1) {
long local3 = (moom.IU.g ^ 108510525406797L);
    ((net.minecraft.world.storage.WorldInfo)(p0)).d(((int)(((int) moom.IU.i))));
    super.a(((net.minecraft.world.storage.WorldInfo)(p0)), ((net.minecraft.nbt.NBTTagCompound)(p1)));
    return;
}


public net.minecraft.world.chunk.storage.IChunkLoader a(moom.EA p0) {
int forwardValue2198_30_0;
    int spill2198_0;
    int spill2198_1;
    long life2_3;
    java.io.File life5_7;
    int life4_8;
    java.io.File life6_22;
    java.io.File life6_39;
    forward_join_45: {
    forward_join_30: {
    forward_join_28: {
    life2_3 = (moom.IU.g ^ 4379131081423L);
    spill2198_0 = moom.Fs.d();
    life5_7 = ((moom.IU)(this)).a();
    life4_8 = spill2198_0;
    spill2198_1 = ((p0 instanceof moom.EC) ? 1 : 0);
    if (!((life4_8 != 0))) {
        forwardValue2198_30_0 = spill2198_1;
        break forward_join_30;
    }
    if (!((spill2198_1 != 0))) {
        break forward_join_28;
    }
    life6_22 = new java.io.File(life5_7, "DIM-1");
    ((java.io.File)(life6_22)).mkdirs();
    return new net.minecraft.world.chunk.storage.AnvilChunkLoader(life6_22);
    }
    forwardValue2198_30_0 = ((p0 instanceof moom.EB) ? 1 : 0);
    }
    if (!((forwardValue2198_30_0 != 0))) {
        break forward_join_45;
    }
    life6_39 = new java.io.File(life5_7, "DIM1");
    ((java.io.File)(life6_39)).mkdirs();
    return new net.minecraft.world.chunk.storage.AnvilChunkLoader(life6_39);
    }
    return new net.minecraft.world.chunk.storage.AnvilChunkLoader(life5_7);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
