package moom;


class rt extends moom.rd {

private static final long c;

private static final long d;

rt() {
super();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(7331353351203396408L)), ((long)(-8648024566853492400L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(147472356274243L)))));
    long local0_life6 = (moom.rt.c ^ 138511046432640L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1003_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1003_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1003_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1003_13 = new byte[8];
    (__sourceSpill1003_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1003_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1003_15 = __sourceSpill1003_13;
    ((javax.crypto.Cipher)(__sourceSpill1003_10)).init(((int)(__sourceSpill1003_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1003_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1003_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 1213302417570685372L;
    byte[] __sourceSpill1003_19 = new byte[8];
    (__sourceSpill1003_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1003_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1003_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1003_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1003_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1003_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1003_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1003_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1003_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1003_20)).doFinal(((byte[])(__sourceSpill1003_19)));
    d = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public net.minecraft.item.ItemStack b(moom.ry p0, net.minecraft.item.ItemStack p1) {
long life3_3;
    moom.bs life6_8;
    int life5_9;
    moom.rB life7_12;
    double life8_22;
    double life10_32;
    double life12_42;
    net.minecraft.world.World life14_45;
    java.util.Random life15_48;
    double life16_57;
    double life18_66;
    double life20_75;
    life3_3 = (moom.rt.c ^ 139419391225639L);
    boolean spill7297_0 = moom.v5.c__Boolean();
    life6_8 = __sourceExactCall_b9f266c58b58a2(((int)(((moom.ry)(p0)).a__Int())));
    life5_9 = ((spill7297_0) ? 1 : 0);
    life7_12 = __sourceExactCall_e9ee1d28afa18d(((moom.ry)(p0)));
    life8_22 = (((moom.rB)(life7_12)).a() + ((double) (((float) ((moom.bs)(life6_8)).c()) * 0x1.333334p-2f)));
    life10_32 = (((moom.rB)(life7_12)).b() + ((double) (((float) ((moom.bs)(life6_8)).d()) * 0x1.333334p-2f)));
    life12_42 = (((moom.rB)(life7_12)).c() + ((double) (((float) ((moom.bs)(life6_8)).e()) * 0x1.333334p-2f)));
    life14_45 = ((moom.ry)(p0)).a__Eu();
    life15_48 = ((net.minecraft.world.World)(life14_45)).u;
    life16_57 = ((((java.util.Random)(life15_48)).nextGaussian() * 0x1.999999999999ap-5d) + ((double) ((moom.bs)(life6_8)).c()));
    life18_66 = ((((java.util.Random)(life15_48)).nextGaussian() * 0x1.999999999999ap-5d) + ((double) ((moom.bs)(life6_8)).d()));
    life20_75 = ((((java.util.Random)(life15_48)).nextGaussian() * 0x1.999999999999ap-5d) + ((double) ((moom.bs)(life6_8)).e()));
    ((net.minecraft.world.World)(life14_45)).b__Boolean(((net.minecraft.entity.Entity)(new moom.tP(life14_45, life8_22, life10_32, life12_42, life16_57, life18_66, life20_75))));
    ((net.minecraft.item.ItemStack)(p1)).a(((int)(1)));
    net.minecraft.item.ItemStack spill7297_1 = p1;
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        moom.v5.b(((boolean)__sourceIntrinsic_integerToBoolean((((life5_9 != 0) ? 0 : 1)))));
    }
    return spill7297_1;
}


protected void a(moom.ry p0) {
long local2 = (moom.rt.c ^ 129010977653817L);
    ((net.minecraft.world.World)(((moom.ry)(p0)).a__Eu())).b(((int)(((int) moom.rt.d))), ((moom.DT)(((moom.ry)(p0)).a__DT())), ((int)(0)));
    return;
}


private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native moom.bs __sourceExactCall_b9f266c58b58a2(int p0);
private static native moom.rB __sourceExactCall_e9ee1d28afa18d(moom.ry p0);
}
