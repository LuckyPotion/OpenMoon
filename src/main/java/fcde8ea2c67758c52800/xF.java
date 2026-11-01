package moom;


public class xF extends net.minecraft.item.Item {

private static final java.util.Map<java.lang.String, moom.xF> n;

public final java.lang.String o;

private static final long p;

private static final long q;

protected xF(java.lang.String p0) {
super();
    this.o = ((java.lang.String)(p0));
    ((moom.xF)(this)).f = ((int)(1));
    ((moom.xF)(this)).a(((net.minecraft.creativetab.CreativeTabs)(net.minecraft.creativetab.CreativeTabs.f)));
    ((java.util.Map)(moom.xF.n)).put(((java.lang.Object)(__sourceIntrinsic_5ca107de5868_originalDynamicSite5152_5(p0))), ((java.lang.Object)(this)));
    return;
}


static {
p = ((long)(((moom._a)(moom._c.a(((long)(-4422873144973701801L)), ((long)(4735174968312001069L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(203985003524683L)))));
    long local0_life6 = (moom.xF.p ^ 51397859973033L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1100_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1100_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1100_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1100_13 = new byte[8];
    (__sourceSpill1100_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1100_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1100_15 = __sourceSpill1100_13;
    ((javax.crypto.Cipher)(__sourceSpill1100_10)).init(((int)(__sourceSpill1100_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1100_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1100_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 4315852600213136247L;
    byte[] __sourceSpill1100_19 = new byte[8];
    (__sourceSpill1100_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1100_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1100_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1100_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1100_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1100_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1100_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1100_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1100_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1100_20)).doFinal(((byte[])(__sourceSpill1100_19)));
    q = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
    n = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
}


public java.lang.String b__sourceReturn_0e30dfc966() {
return net.minecraft.util.StatCollector.a(((java.lang.String)(__sourceIntrinsic_d5893d8e80ad_originalDynamicSite1701_1(this.o))));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static moom.xF a(java.lang.String p0) {
return ((moom.xF)(((java.util.Map)(moom.xF.n)).get(((java.lang.Object)(p0)))));
}


public net.minecraft.item.EnumRarity a__a3(net.minecraft.item.ItemStack p0) {
return net.minecraft.item.EnumRarity.RARE;
}


public void a(net.minecraft.item.ItemStack p0, net.minecraft.entity.player.EntityPlayer p1, java.util.List<java.lang.String> p2, boolean p3) {
((java.util.List)(p2)).add(((java.lang.Object)(((moom.xF)(this)).b__sourceReturn_0e30dfc966())));
    return;
}


public boolean a(net.minecraft.item.ItemStack p0, net.minecraft.entity.player.EntityPlayer p1, net.minecraft.world.World p2, moom.DT p3, moom.bs p4, float p5, float p6, float p7) {
net.minecraft.block.state.IBlockState forwardValue4486_17_0;
    int forwardValue4486_54_0;
    int forwardValue4486_56_0;
    boolean spill4486_0;
    net.minecraft.block.state.IBlockState spill4486_1;
    boolean spill4486_2;
    boolean spill4486_3;
    long life9_3;
    net.minecraft.block.state.IBlockState life12_8;
    int life11_9;
    forward_join_56: {
    forward_join_55: {
    forward_join_54: {
    forward_join_53: {
    forward_join_17: {
    life9_3 = (moom.xF.p ^ 21274807883069L);
    spill4486_0 = net.minecraft.item.ItemStack.m();
    life12_8 = ((net.minecraft.world.World)(p2)).a__fE(((moom.DT)(p3)));
    life11_9 = ((spill4486_0) ? 1 : 0);
    spill4486_1 = life12_8;
    if (!((life11_9 != 0))) {
        forwardValue4486_17_0 = spill4486_1;
        break forward_join_17;
    }
    if (!((((net.minecraft.block.state.IBlockState)(spill4486_1)).a__ch() == net.minecraft.init.Blocks.aN))) {
        break forward_join_55;
    }
    forwardValue4486_17_0 = life12_8;
    }
    spill4486_2 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(forwardValue4486_17_0)).a(((net.minecraft.block.properties.IProperty)(moom.c_.R))))))).booleanValue();
    if (!((life11_9 != 0))) {
        forwardValue4486_56_0 = ((spill4486_2) ? 1 : 0);
        break forward_join_56;
    }
    if (!((!spill4486_2))) {
        break forward_join_55;
    }
    spill4486_3 = ((net.minecraft.world.World)(p2)).G;
    if (!((life11_9 != 0))) {
        forwardValue4486_54_0 = ((spill4486_3) ? 1 : 0);
        break forward_join_54;
    }
    if (!((!spill4486_3))) {
        break forward_join_53;
    }
    ((moom.c_)(((moom.c_)(net.minecraft.init.Blocks.aN)))).a(((net.minecraft.world.World)(p2)), ((moom.DT)(p3)), ((net.minecraft.block.state.IBlockState)(life12_8)), ((net.minecraft.item.ItemStack)(p0)));
    ((net.minecraft.world.World)(p2)).a(((net.minecraft.entity.player.EntityPlayer)(null)), ((int)(((int) moom.xF.q))), ((moom.DT)(p3)), ((int)(net.minecraft.item.Item.a(((net.minecraft.item.Item)(this))))));
    net.minecraft.item.ItemStack __stackOp4486_19_0 = p0;
    ((net.minecraft.item.ItemStack)(__stackOp4486_19_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp4486_19_0)).b - 1)));
    ((net.minecraft.entity.player.EntityPlayer)(p1)).a(((moom.BY)(net.minecraft.stats.StatList.X)));
    }
    forwardValue4486_54_0 = 1;
    }
    return ((forwardValue4486_54_0) != 0);
    }
    forwardValue4486_56_0 = 0;
    }
    return ((forwardValue4486_56_0) != 0);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_5ca107de5868_originalDynamicSite5152_5(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d5893d8e80ad_originalDynamicSite1701_1(java.lang.String a0) throws E;
}
