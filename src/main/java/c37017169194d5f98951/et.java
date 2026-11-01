package moom;


public class et extends net.minecraft.block.Block {

private static final long Q;

private static final long R;

protected et() {
super(moom.fn.z);
    (this).a(true);
    (this).a(net.minecraft.creativetab.CreativeTabs.b);
}


static {
Q = ((long)(((moom._a)(moom._c.a(((long)(-9064786617185553957L)), ((long)(-101341629158874539L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(225059109098983L)))));
    long local0_life6 = (moom.et.Q ^ 18516923022123L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill832_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill832_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill832_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill832_13 = new byte[8];
    (__sourceSpill832_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill832_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation832_15 = __sourceSpill832_13;
    ((javax.crypto.Cipher)(__sourceSpill832_10)).init(((int)(__sourceSpill832_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill832_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation832_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 5417700806532455908L;
    byte[] __sourceSpill832_19 = new byte[8];
    (__sourceSpill832_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill832_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill832_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill832_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill832_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill832_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill832_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill832_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill832_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill832_20)).doFinal(((byte[])(__sourceSpill832_19)));
    R = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public void b(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
int forwardValue3484_26_0;
    int spill3484_0;
    long life5_3;
    int[] life7_5;
    forward_join_27: {
    forward_join_26: {
    life5_3 = (moom.et.Q ^ 26011920003238L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3484_0 = ((net.minecraft.world.World)(p0)).b(((net.minecraft.world.EnumSkyBlock)(net.minecraft.world.EnumSkyBlock.BLOCK)), ((moom.DT)(p1)));
    if (!((life7_5 != null))) {
        forwardValue3484_26_0 = spill3484_0;
        break forward_join_26;
    }
    if (!((spill3484_0 > ((int) moom.et.R)))) {
        break forward_join_27;
    }
    ((moom.et)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1))))), ((int)(0)));
    forwardValue3484_26_0 = ((((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(p1)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3484_26_0);
    }
    return;
}


public int a(java.util.Random p0) {
return 4;
}


public net.minecraft.item.Item a(net.minecraft.block.state.IBlockState p0, java.util.Random p1, int p2) {
return net.minecraft.init.Items.aD;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
