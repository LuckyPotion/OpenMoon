package moom;


public class xo extends net.minecraft.item.Item {

private static long n;

private static long o;

public xo() { super(); }


private static void __sourceConstructorBody_3a23965ad60ec891(moom.xo receiver) throws Throwable {

long local1 = (moom.xo.n ^ 104667258786074L);

    moom.xo.__sourceConstructorInit_3a23965ad60ec891_0(((moom.xo)(receiver)));

    ((moom.xo)(receiver)).f = ((int)(1));

    ((moom.xo)(receiver)).c(((int)(((int) moom.xo.o))));

    ((moom.xo)(receiver)).a(((net.minecraft.creativetab.CreativeTabs)(net.minecraft.creativetab.CreativeTabs.i)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_3a23965ad60ec891_0(moom.xo a0) throws E;

static {
n = ((long)(((moom._a)(moom._c.a(((long)(2606098556287945561L)), ((long)(1148049821127260685L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(56511099974158L)))));
    long local0_life6 = (moom.xo.n ^ 79604566881459L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1115_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1115_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1115_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1115_13 = new byte[8];
    (__sourceSpill1115_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1115_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1115_15 = __sourceSpill1115_13;
    ((javax.crypto.Cipher)(__sourceSpill1115_10)).init(((int)(__sourceSpill1115_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1115_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1115_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 5883341636525447001L;
    byte[] __sourceSpill1115_19 = new byte[8];
    (__sourceSpill1115_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1115_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1115_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1115_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1115_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1115_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1115_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1115_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1115_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1115_20)).doFinal(((byte[])(__sourceSpill1115_19)));
    o = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public boolean a(net.minecraft.item.ItemStack p0, net.minecraft.entity.player.EntityPlayer p1, net.minecraft.world.World p2, moom.DT p3, moom.bs p4, float p5, float p6, float p7) {
int forwardValue4532_19_0;
    net.minecraft.world.World forwardValue4532_56_0;
    moom.DT forwardValue4532_56_1;
    boolean spill4532_0;
    boolean spill4532_1;
    net.minecraft.world.World spill4532_2;
    moom.DT spill4532_3;
    long life9_3;
    moom.DT life4_8;
    int life11_9;
    forward_join_60: {
    forward_join_56: {
    forward_join_20: {
    forward_join_19: {
    life9_3 = (moom.xo.n ^ 128537575308307L);
    spill4532_0 = net.minecraft.item.ItemStack.m();
    life4_8 = ((moom.DT)(p3)).a(((moom.bs)(p4)));
    life11_9 = ((spill4532_0) ? 1 : 0);
    spill4532_1 = ((net.minecraft.entity.player.EntityPlayer)(p1)).a(((moom.DT)(life4_8)), ((moom.bs)(p4)), ((net.minecraft.item.ItemStack)(p0)));
    if (!((life11_9 != 0))) {
        forwardValue4532_19_0 = ((spill4532_1) ? 1 : 0);
        break forward_join_19;
    }
    if (!((!spill4532_1))) {
        break forward_join_20;
    }
    forwardValue4532_19_0 = 0;
    }
    return ((forwardValue4532_19_0) != 0);
    }
    spill4532_2 = p2;
    spill4532_3 = life4_8;
    if (!((life11_9 != 0))) {
        forwardValue4532_56_0 = spill4532_2;
        forwardValue4532_56_1 = spill4532_3;
        break forward_join_56;
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(spill4532_2)).a__fE(((moom.DT)(spill4532_3))))).a__ch())).a__fn() == moom.fn.a))) {
        break forward_join_60;
    }
    ((net.minecraft.world.World)(p2)).a(((double)((((double) ((moom.DT)(life4_8)).a()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(life4_8)).b()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(life4_8)).c()) + 0x1.0p-1d))), ((java.lang.String)("fire.ignite")), ((float)(0x1.0p0f)), ((float)(((((java.util.Random)(moom.xo.e)).nextFloat() * 0x1.99999ap-2f) + 0x1.99999ap-1f))));
    forwardValue4532_56_0 = p2;
    forwardValue4532_56_1 = life4_8;
    }
    ((net.minecraft.world.World)(forwardValue4532_56_0)).a(((moom.DT)(forwardValue4532_56_1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).a__fE())));
    }
    ((net.minecraft.item.ItemStack)(p0)).a(((int)(1)), ((net.minecraft.entity.EntityLivingBase)(p1)));
    return ((1) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
