package moom;


public class w5 extends moom.wU {

private static final long o;

private static final long p;

public w5(net.minecraft.block.Block p0) {
super(p0);
    (this).c(0);
    (this).a(true);
}


static {
o = ((long)(((moom._a)(moom._c.a(((long)(-1890962023600679622L)), ((long)(-1719126267877237368L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(156244298469038L)))));
    long local0_life6 = (moom.w5.o ^ 139873810959318L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1081_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1081_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1081_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1081_13 = new byte[8];
    (__sourceSpill1081_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1081_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1081_15 = __sourceSpill1081_13;
    ((javax.crypto.Cipher)(__sourceSpill1081_10)).init(((int)(__sourceSpill1081_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1081_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1081_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -3323445428119319349L;
    byte[] __sourceSpill1081_19 = new byte[8];
    (__sourceSpill1081_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1081_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1081_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1081_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1081_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1081_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1081_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1081_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1081_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1081_20)).doFinal(((byte[])(__sourceSpill1081_19)));
    p = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int a(int p0) {
return p0;
}


public boolean a(net.minecraft.item.ItemStack p0, net.minecraft.entity.player.EntityPlayer p1, net.minecraft.world.World p2, moom.DT p3, moom.bs p4, float p5, float p6, float p7) {
int forwardValue4343_18_0;
    int forwardValue4343_22_0;
    net.minecraft.block.Block forwardValue4343_60_0;
    net.minecraft.block.Block forwardValue4343_62_0;
    net.minecraft.block.Block forwardValue4343_62_1;
    moom.w5 forwardValue4343_155_0;
    int forwardValue4343_164_0;
    int spill4343_0;
    net.minecraft.block.Block spill4343_1;
    net.minecraft.block.Block spill4343_2;
    net.minecraft.block.Block spill4343_3;
    int spill4343_4;
    moom.w5 spill4343_5;
    boolean spill4343_6;
    boolean spill4343_7;
    long life9_3;
    int life11_5;
    net.minecraft.block.state.IBlockState life12_34;
    net.minecraft.block.Block life13_37;
    moom.DT life14_39;
    int life15_88;
    net.minecraft.block.state.IBlockState life16_105;
    moom.CA life17_114;
    forward_join_164: {
    forward_join_155: {
    forward_join_154: {
    forward_join_62: {
    forward_join_60: {
    forward_join_59: {
    forward_join_41: {
    forward_join_23: {
    forward_join_22: {
    forward_join_18: {
    forward_join_13: {
    life9_3 = (moom.w5.o ^ 56643585388867L);
    life11_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    spill4343_0 = ((net.minecraft.item.ItemStack)(p0)).b;
    if (!((life11_5 == 0))) {
        forwardValue4343_18_0 = spill4343_0;
        break forward_join_18;
    }
    if (!((spill4343_0 == 0))) {
        break forward_join_13;
    }
    return ((0) != 0);
    }
    forwardValue4343_18_0 = ((((net.minecraft.entity.player.EntityPlayer)(p1)).a(((moom.DT)(p3)), ((moom.bs)(p4)), ((net.minecraft.item.ItemStack)(p0)))) ? 1 : 0);
    }
    if (!((life11_5 == 0))) {
        forwardValue4343_22_0 = forwardValue4343_18_0;
        break forward_join_22;
    }
    if (!((forwardValue4343_18_0 == 0))) {
        break forward_join_23;
    }
    forwardValue4343_22_0 = 0;
    }
    return ((forwardValue4343_22_0) != 0);
    }
    life12_34 = ((net.minecraft.world.World)(p2)).a__fE(((moom.DT)(p3)));
    life13_37 = ((net.minecraft.block.state.IBlockState)(life12_34)).a__ch();
    life14_39 = p3;
    if (!((p4 == moom.bs.UP))) {
        break forward_join_41;
    }
    spill4343_1 = life13_37;
    spill4343_2 = this.n;
    if (!((life11_5 == 0))) {
        forwardValue4343_62_0 = spill4343_1;
        forwardValue4343_62_1 = spill4343_2;
        break forward_join_62;
    }
    if (!((spill4343_1 != spill4343_2))) {
        break forward_join_59;
    }
    }
    spill4343_3 = life13_37;
    if (!((life11_5 == 0))) {
        forwardValue4343_60_0 = spill4343_3;
        break forward_join_60;
    }
    if (!((!((net.minecraft.block.Block)(spill4343_3)).a__Boolean(((net.minecraft.world.World)(p2)), ((moom.DT)(p3)))))) {
        break forward_join_59;
    }
    life14_39 = ((moom.DT)(p3)).a(((moom.bs)(p4)));
    life12_34 = ((net.minecraft.world.World)(p2)).a__fE(((moom.DT)(life14_39)));
    life13_37 = ((net.minecraft.block.state.IBlockState)(life12_34)).a__ch();
    }
    forwardValue4343_60_0 = life13_37;
    }
    forwardValue4343_62_0 = forwardValue4343_60_0;
    forwardValue4343_62_1 = this.n;
    }
    if (!((forwardValue4343_62_0 == forwardValue4343_62_1))) {
        break forward_join_154;
    }
    life15_88 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(life12_34)).a(((net.minecraft.block.properties.IProperty)(moom.es.Q))))))).intValue();
    spill4343_4 = life15_88;
    if (!((life11_5 == 0))) {
        forwardValue4343_164_0 = spill4343_4;
        break forward_join_164;
    }
    if (!((spill4343_4 <= ((int) moom.w5.p)))) {
        break forward_join_154;
    }
    life16_105 = ((net.minecraft.block.state.IBlockState)(life12_34)).a__fE(((net.minecraft.block.properties.IProperty)(moom.es.Q)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)((life15_88 + 1)))))));
    spill4343_5 = this;
    if (!((life11_5 == 0))) {
        forwardValue4343_155_0 = spill4343_5;
        break forward_join_155;
    }
    life17_114 = ((net.minecraft.block.Block)(((moom.w5)(spill4343_5)).n)).a(((net.minecraft.world.World)(p2)), ((moom.DT)(life14_39)), ((net.minecraft.block.state.IBlockState)(life16_105)));
    if (!((life17_114 != null))) {
        break forward_join_154;
    }
    spill4343_6 = ((net.minecraft.world.World)(p2)).a__Boolean(((moom.CA)(life17_114)));
    if (!((life11_5 == 0))) {
        forwardValue4343_164_0 = ((spill4343_6) ? 1 : 0);
        break forward_join_164;
    }
    if (!(spill4343_6)) {
        break forward_join_154;
    }
    spill4343_7 = ((net.minecraft.world.World)(p2)).a(((moom.DT)(life14_39)), ((net.minecraft.block.state.IBlockState)(life16_105)), ((int)(2)));
    if (!((life11_5 == 0))) {
        forwardValue4343_164_0 = ((spill4343_7) ? 1 : 0);
        break forward_join_164;
    }
    if (!(spill4343_7)) {
        break forward_join_154;
    }
    ((net.minecraft.world.World)(p2)).a(((double)(((double) (((float) ((moom.DT)(life14_39)).a()) + 0x1.0p-1f)))), ((double)(((double) (((float) ((moom.DT)(life14_39)).b()) + 0x1.0p-1f)))), ((double)(((double) (((float) ((moom.DT)(life14_39)).c()) + 0x1.0p-1f)))), ((java.lang.String)(((moom.eJ)(((net.minecraft.block.Block)(this.n)).H)).c())), ((float)(((((moom.eJ)(((net.minecraft.block.Block)(this.n)).H)).a() + 0x1.0p0f) / 0x1.0p1f))), ((float)((((moom.eJ)(((net.minecraft.block.Block)(this.n)).H)).b() * 0x1.99999ap-1f))));
    net.minecraft.item.ItemStack __stackOp4343_44_0 = p0;
    ((net.minecraft.item.ItemStack)(__stackOp4343_44_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp4343_44_0)).b - 1)));
    return ((1) != 0);
    }
    forwardValue4343_155_0 = this;
    }
    forwardValue4343_164_0 = ((__sourceIntrinsic_e8125218b12d_call4343_48(forwardValue4343_155_0, p0, p1, p2, life14_39, p4, p5, p6, p7)) ? 1 : 0);
    }
    return ((forwardValue4343_164_0) != 0);
}


private static native <E extends Throwable> boolean __sourceIntrinsic_e8125218b12d_call4343_48(moom.w5 a0, net.minecraft.item.ItemStack a1, net.minecraft.entity.player.EntityPlayer a2, net.minecraft.world.World a3, moom.DT a4, moom.bs a5, float a6, float a7, float a8) throws E;
}
