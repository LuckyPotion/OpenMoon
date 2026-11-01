package moom;


public class xK extends net.minecraft.item.Item {

private static long n;

private static long o;

public xK() { super(); }


private static void __sourceConstructorBody_c4f03e2ef3fcd928(moom.xK receiver) throws Throwable {

long local1 = (moom.xK.n ^ 47703358352052L);

    moom.xK.__sourceConstructorInit_c4f03e2ef3fcd928_0(((moom.xK)(receiver)));

    ((moom.xK)(receiver)).b(((int)(1)));

    ((moom.xK)(receiver)).c(((int)(((int) moom.xK.o))));

    ((moom.xK)(receiver)).a(((net.minecraft.creativetab.CreativeTabs)(net.minecraft.creativetab.CreativeTabs.i)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_c4f03e2ef3fcd928_0(moom.xK a0) throws E;

static {
n = ((long)(((moom._a)(moom._c.a(((long)(-609229752120212706L)), ((long)(-7208105978718994739L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(29320569793131L)))));
    long local0_life6 = (moom.xK.n ^ 104971518296614L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1101_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1101_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1101_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1101_13 = new byte[8];
    (__sourceSpill1101_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1101_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1101_15 = __sourceSpill1101_13;
    ((javax.crypto.Cipher)(__sourceSpill1101_10)).init(((int)(__sourceSpill1101_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1101_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1101_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 3930056892598603385L;
    byte[] __sourceSpill1101_19 = new byte[8];
    (__sourceSpill1101_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1101_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1101_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1101_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1101_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1101_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1101_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1101_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1101_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1101_20)).doFinal(((byte[])(__sourceSpill1101_19)));
    o = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public float a(net.minecraft.item.ItemStack p0, net.minecraft.block.Block p1) {
net.minecraft.block.Block forwardValue4491_12_0;
    net.minecraft.block.Block forwardValue4491_18_0;
    float forwardValue4491_28_0;
    net.minecraft.block.Block spill4491_0;
    long life3_3;
    int life5_5;
    forward_join_28: {
    forward_join_27: {
    forward_join_22: {
    forward_join_18: {
    forward_join_12: {
    life3_3 = (moom.xK.n ^ 31195471043396L);
    life5_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);
    spill4491_0 = p1;
    if (!((life5_5 != 0))) {
        forwardValue4491_12_0 = spill4491_0;
        break forward_join_12;
    }
    if (!((spill4491_0 != net.minecraft.init.Blocks.G))) {
        break forward_join_27;
    }
    forwardValue4491_12_0 = p1;
    }
    if (!((life5_5 != 0))) {
        forwardValue4491_18_0 = forwardValue4491_12_0;
        break forward_join_18;
    }
    if (!((((net.minecraft.block.Block)(forwardValue4491_12_0)).a__fn() != moom.fn.j))) {
        break forward_join_27;
    }
    forwardValue4491_18_0 = p1;
    }
    if (!((forwardValue4491_18_0 == net.minecraft.init.Blocks.L))) {
        break forward_join_22;
    }
    forwardValue4491_28_0 = 0x1.4p2f;
    break forward_join_28;
    }
    forwardValue4491_28_0 = super.a(((net.minecraft.item.ItemStack)(p0)), ((net.minecraft.block.Block)(p1)));
    break forward_join_28;
    }
    forwardValue4491_28_0 = 0x1.ep3f;
    }
    return forwardValue4491_28_0;
}


public boolean a__Boolean(net.minecraft.block.Block p0) {
net.minecraft.block.Block forwardValue4493_12_0;
    net.minecraft.block.Block forwardValue4493_18_0;
    net.minecraft.block.Block forwardValue4493_18_1;
    int forwardValue4493_22_0;
    net.minecraft.block.Block spill4493_0;
    moom.d9 spill4493_1;
    long life2_3;
    int life4_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_19: {
    forward_join_18: {
    forward_join_12: {
    life2_3 = (moom.xK.n ^ 45945160769272L);
    life4_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    spill4493_0 = p0;
    if (!((life4_5 == 0))) {
        forwardValue4493_12_0 = spill4493_0;
        break forward_join_12;
    }
    if (!((spill4493_0 != net.minecraft.init.Blocks.G))) {
        break forward_join_19;
    }
    forwardValue4493_12_0 = p0;
    }
    spill4493_1 = net.minecraft.init.Blocks.af;
    if (!((life4_5 == 0))) {
        forwardValue4493_18_0 = forwardValue4493_12_0;
        forwardValue4493_18_1 = spill4493_1;
        break forward_join_18;
    }
    if (!((forwardValue4493_12_0 != spill4493_1))) {
        break forward_join_19;
    }
    forwardValue4493_18_0 = p0;
    forwardValue4493_18_1 = net.minecraft.init.Blocks.bH;
    }
    if (!((forwardValue4493_18_0 == forwardValue4493_18_1))) {
        break forward_join_21;
    }
    }
    forwardValue4493_22_0 = 1;
    break forward_join_22;
    }
    forwardValue4493_22_0 = 0;
    }
    return ((forwardValue4493_22_0) != 0);
}


public boolean a(net.minecraft.item.ItemStack p0, net.minecraft.world.World p1, net.minecraft.block.Block p2, moom.DT p3, net.minecraft.entity.EntityLivingBase p4) {
net.minecraft.block.Block forwardValue4492_18_0;
    net.minecraft.block.Block forwardValue4492_24_0;
    net.minecraft.block.Block forwardValue4492_24_1;
    net.minecraft.block.Block forwardValue4492_29_0;
    net.minecraft.block.Block forwardValue4492_29_1;
    net.minecraft.block.Block forwardValue4492_34_0;
    net.minecraft.block.Block forwardValue4492_34_1;
    net.minecraft.block.Block spill4492_0;
    moom.cI spill4492_1;
    long life6_3;
    int life8_5;
    forward_join_47: {
    forward_join_43: {
    forward_join_34: {
    forward_join_29: {
    forward_join_24: {
    forward_join_18: {
    life6_3 = (moom.xK.n ^ 58407670588589L);
    life8_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);
    if (!((life8_5 != 0))) {
        break forward_join_47;
    }
    if (!((((net.minecraft.block.Block)(p2)).a__fn() != moom.fn.j))) {
        break forward_join_43;
    }
    spill4492_0 = p2;
    if (!((life8_5 != 0))) {
        forwardValue4492_18_0 = spill4492_0;
        break forward_join_18;
    }
    if (!((spill4492_0 != net.minecraft.init.Blocks.G))) {
        break forward_join_43;
    }
    forwardValue4492_18_0 = p2;
    }
    spill4492_1 = net.minecraft.init.Blocks.H;
    if (!((life8_5 != 0))) {
        forwardValue4492_24_0 = forwardValue4492_18_0;
        forwardValue4492_24_1 = spill4492_1;
        break forward_join_24;
    }
    if (!((forwardValue4492_18_0 != spill4492_1))) {
        break forward_join_43;
    }
    forwardValue4492_24_0 = p2;
    forwardValue4492_24_1 = net.minecraft.init.Blocks.bc;
    }
    if (!((life8_5 != 0))) {
        forwardValue4492_29_0 = forwardValue4492_24_0;
        forwardValue4492_29_1 = forwardValue4492_24_1;
        break forward_join_29;
    }
    if (!((forwardValue4492_24_0 != forwardValue4492_24_1))) {
        break forward_join_43;
    }
    forwardValue4492_29_0 = p2;
    forwardValue4492_29_1 = net.minecraft.init.Blocks.bH;
    }
    if (!((life8_5 != 0))) {
        forwardValue4492_34_0 = forwardValue4492_29_0;
        forwardValue4492_34_1 = forwardValue4492_29_1;
        break forward_join_34;
    }
    if (!((forwardValue4492_29_0 != forwardValue4492_29_1))) {
        break forward_join_43;
    }
    forwardValue4492_34_0 = p2;
    forwardValue4492_34_1 = net.minecraft.init.Blocks.L;
    }
    if (!((forwardValue4492_34_0 != forwardValue4492_34_1))) {
        break forward_join_43;
    }
    return super.a(((net.minecraft.item.ItemStack)(p0)), ((net.minecraft.world.World)(p1)), ((net.minecraft.block.Block)(p2)), ((moom.DT)(p3)), ((net.minecraft.entity.EntityLivingBase)(p4)));
    }
    ((net.minecraft.item.ItemStack)(p0)).a(((int)(1)), ((net.minecraft.entity.EntityLivingBase)(p4)));
    }
    return ((1) != 0);
}

}
