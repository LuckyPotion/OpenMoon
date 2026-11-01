package moom;


class ru extends moom.rd {

private final moom.rd c;

private static final long d;

private static final long f;

ru() {
super();
    this.c = new moom.rd();
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(2468565424343212502L)), ((long)(-8370420458289498911L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(106324887568800L)))));
    long local0_life6 = (moom.ru.d ^ 41767204348452L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1004_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1004_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1004_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1004_13 = new byte[8];
    (__sourceSpill1004_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1004_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1004_15 = __sourceSpill1004_13;
    ((javax.crypto.Cipher)(__sourceSpill1004_10)).init(((int)(__sourceSpill1004_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1004_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1004_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 961638297799515257L;
    byte[] __sourceSpill1004_19 = new byte[8];
    (__sourceSpill1004_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1004_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1004_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1004_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1004_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1004_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1004_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1004_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1004_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1004_20)).doFinal(((byte[])(__sourceSpill1004_19)));
    f = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public net.minecraft.item.ItemStack b(moom.ry p0, net.minecraft.item.ItemStack p1) {
int forwardValue3932_67_0;
    int forwardValue3932_78_0;
    boolean spill3932_0;
    boolean spill3932_1;
    long life3_3;
    moom.bs life6_8;
    net.minecraft.world.World life7_11;
    int life5_12;
    double life8_22;
    double life10_32;
    double life12_42;
    moom.DT life14_47;
    moom.fn life15_53;
    double life16_64;
    moom.tv life18_110;
    forward_join_87: {
    forward_join_85: {
    forward_join_79: {
    forward_join_78: {
    forward_join_67: {
    forward_join_64: {
    life3_3 = (moom.ru.d ^ 114717423084000L);
    spill3932_0 = moom.v5.b__Boolean();
    life6_8 = __sourceExactCall_b9f266c58b58a2(((int)(((moom.ry)(p0)).a__Int())));
    life7_11 = ((moom.ry)(p0)).a__Eu();
    life5_12 = ((spill3932_0) ? 1 : 0);
    life8_22 = (((moom.ry)(p0)).a() + ((double) (((float) ((moom.bs)(life6_8)).c()) * 0x1.2p0f)));
    life10_32 = (((moom.ry)(p0)).b() + ((double) (((float) ((moom.bs)(life6_8)).d()) * 0x1.2p0f)));
    life12_42 = (((moom.ry)(p0)).c() + ((double) (((float) ((moom.bs)(life6_8)).e()) * 0x1.2p0f)));
    life14_47 = ((moom.DT)(((moom.ry)(p0)).a__DT())).a(((moom.bs)(life6_8)));
    life15_53 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(life7_11)).a__fE(((moom.DT)(life14_47))))).a__ch())).a__fn();
    spill3932_1 = ((java.lang.Object)(moom.fn.h)).equals(((java.lang.Object)(life15_53)));
    if (!((life5_12 != 0))) {
        forwardValue3932_67_0 = ((spill3932_1) ? 1 : 0);
        break forward_join_67;
    }
    if (!(spill3932_1)) {
        break forward_join_64;
    }
    life16_64 = 0x1.0p0d;
    if (!((life5_12 == 0))) {
        break forward_join_87;
    }
    }
    forwardValue3932_67_0 = ((((java.lang.Object)(moom.fn.a)).equals(((java.lang.Object)(life15_53)))) ? 1 : 0);
    }
    if (!((life5_12 != 0))) {
        forwardValue3932_78_0 = forwardValue3932_67_0;
        break forward_join_78;
    }
    if (!((forwardValue3932_67_0 != 0))) {
        break forward_join_79;
    }
    forwardValue3932_78_0 = ((((java.lang.Object)(moom.fn.h)).equals(((java.lang.Object)(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(life7_11)).a__fE(((moom.DT)(((moom.DT)(life14_47)).b__DT()))))).a__ch())).a__fn())))) ? 1 : 0);
    }
    if (!((forwardValue3932_78_0 == 0))) {
        break forward_join_85;
    }
    }
    return ((moom.rd)(this.c)).a(((moom.ry)(p0)), ((net.minecraft.item.ItemStack)(p1)));
    }
    life16_64 = 0x0.0p0d;
    }
    life18_110 = new moom.tv(life7_11, life8_22, (life10_32 + life16_64), life12_42);
    ((net.minecraft.world.World)(life7_11)).b__Boolean(((net.minecraft.entity.Entity)(life18_110)));
    ((net.minecraft.item.ItemStack)(p1)).a(((int)(1)));
    return p1;
}


protected void a(moom.ry p0) {
long local2 = (moom.ru.d ^ 109732479601406L);
    ((net.minecraft.world.World)(((moom.ry)(p0)).a__Eu())).b(((int)(((int) moom.ru.f))), ((moom.DT)(((moom.ry)(p0)).a__DT())), ((int)(0)));
    return;
}


private static native moom.bs __sourceExactCall_b9f266c58b58a2(int p0);
}
