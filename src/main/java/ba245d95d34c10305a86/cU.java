package moom;


public class cU extends moom.cT {

public static final moom.fx R;

public static final moom.fy S;

private static final long T;

protected cU() {
super(moom.fn.d);
    float local1 = 0x1.0p-2f;
    float local2 = 0x1.0p0f;
    ((moom.cU)(this)).a(((float)((0x1.0p-1f - local1))), ((float)(0x0.0p0f)), ((float)((0x1.0p-1f - local1))), ((float)((0x1.0p-1f + local1))), ((float)(local2)), ((float)((0x1.0p-1f + local1))));
    return;
}


static {
T = ((long)(((moom._a)(moom._c.a(((long)(4235651778656781389L)), ((long)(-780516640299025164L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(234738937038322L)))));
    long local6_life6 = (moom.cU.T ^ 18819185811682L);
    javax.crypto.Cipher local1_life8;
    javax.crypto.Cipher __sourceSpill791_10 = (local1_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill791_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill791_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill791_13 = new byte[8];
    (__sourceSpill791_13)[0] = ((byte) ((int) (local6_life6 >>> 56)));
    int local2_life14 = 1;
    while ((local2_life14 < 8)) {
        (__sourceSpill791_13)[local2_life14] = ((byte) ((int) ((local6_life6 << (local2_life14 * 8)) >>> 56)));
        local2_life14 += 1;
    }
    byte[] __sourcePreallocation791_15 = __sourceSpill791_13;
    ((javax.crypto.Cipher)(__sourceSpill791_10)).init(((int)(__sourceSpill791_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill791_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation791_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local3_life18 = 1955874557793738040L;
    byte[] __sourceSpill791_19 = new byte[8];
    (__sourceSpill791_19)[0] = ((byte) ((int) (local3_life18 >>> 56)));
    (__sourceSpill791_19)[1] = ((byte) ((int) (local3_life18 >>> 48)));
    (__sourceSpill791_19)[2] = ((byte) ((int) (local3_life18 >>> 40)));
    (__sourceSpill791_19)[3] = ((byte) ((int) (local3_life18 >>> 32)));
    (__sourceSpill791_19)[4] = ((byte) ((int) (local3_life18 >>> 24)));
    (__sourceSpill791_19)[5] = ((byte) ((int) (local3_life18 >>> 16)));
    (__sourceSpill791_19)[6] = ((byte) ((int) (local3_life18 >>> 8)));
    (__sourceSpill791_19)[7] = ((byte) ((int) local3_life18));
    javax.crypto.Cipher __sourceSpill791_20 = local1_life8;
    byte[] local5_life22 = ((javax.crypto.Cipher)(__sourceSpill791_20)).doFinal(((byte[])(__sourceSpill791_19)));
    long local0_life23 = (((((((((((long) (local5_life22)[0]) & 255L) << 56) | ((((long) (local5_life22)[1]) & 255L) << 48)) | ((((long) (local5_life22)[2]) & 255L) << 40)) | ((((long) (local5_life22)[3]) & 255L) << 32)) | ((((long) (local5_life22)[4]) & 255L) << 24)) | ((((long) (local5_life22)[5]) & 255L) << 16)) | ((((long) (local5_life22)[6]) & 255L) << 8)) | (((long) (local5_life22)[7]) & 255L));
    R = ((moom.fx)(moom.fx.a(((java.lang.String)("facing")), ((com.google.common.base.Predicate)(net.minecraft.util.EnumFacing$Plane.HORIZONTAL)))));
    S = ((moom.fy)(moom.fy.a(((java.lang.String)("rotation")), ((int)(0)), ((int)(((int) local0_life23))))));
}


public boolean b__Boolean(net.minecraft.world.World p0, moom.DT p1) {
int forwardValue3092_17_0;
    int forwardValue3092_21_0;
    int forwardValue3092_23_0;
    boolean spill3092_0;
    long life3_3;
    int[] life5_5;
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    forward_join_17: {
    life3_3 = (moom.cU.T ^ 140664594441812L);
    life5_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3092_0 = ((moom.cU)(this)).c(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    if (!((life5_5 != null))) {
        forwardValue3092_17_0 = ((spill3092_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!((!spill3092_0))) {
        break forward_join_22;
    }
    forwardValue3092_17_0 = ((super.b__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue3092_21_0 = forwardValue3092_17_0;
        break forward_join_21;
    }
    if (!((forwardValue3092_17_0 != 0))) {
        break forward_join_22;
    }
    forwardValue3092_21_0 = 1;
    }
    forwardValue3092_23_0 = forwardValue3092_21_0;
    break forward_join_23;
    }
    forwardValue3092_23_0 = 0;
    }
    return ((forwardValue3092_23_0) != 0);
}


public boolean n() {
return ((1) != 0);
}


public net.minecraft.item.Item a(net.minecraft.block.state.IBlockState p0, java.util.Random p1, int p2) {
return net.minecraft.init.Items.ci;
}


public net.minecraft.item.Item a__wQ(net.minecraft.world.World p0, moom.DT p1) {
return net.minecraft.init.Items.ci;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, float p3, int p4) {
long life6_3;
    net.minecraft.tileentity.TileEntity life9_8;
    int[] life8_9;
    net.minecraft.item.ItemStack life10_21;
    net.minecraft.nbt.NBTTagCompound life11_25;
    forward_join_58: {
    forward_join_51: {
    life6_3 = (moom.cU.T ^ 96299718717573L);
    int[] spill3649_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life9_8 = ((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(p1)));
    life8_9 = spill3649_0;
    if (!((((life9_8 instanceof moom.Ca) ? 1 : 0) != 0))) { break forward_join_51; }
    life10_21 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.ci, 1, ((moom.Ca)(((moom.Ca)(life9_8)))).a__sourceReturn_8abf5c6871());
    life11_25 = new net.minecraft.nbt.NBTTagCompound();
    ((net.minecraft.tileentity.TileEntity)(life9_8)).b(((net.minecraft.nbt.NBTTagCompound)(life11_25)));
    ((net.minecraft.nbt.NBTTagCompound)(life11_25)).a__Void(((java.lang.String)("x")));
    ((net.minecraft.nbt.NBTTagCompound)(life11_25)).a__Void(((java.lang.String)("y")));
    ((net.minecraft.nbt.NBTTagCompound)(life11_25)).a__Void(((java.lang.String)("z")));
    ((net.minecraft.nbt.NBTTagCompound)(life11_25)).a__Void(((java.lang.String)("id")));
    ((net.minecraft.item.ItemStack)(life10_21)).a(((java.lang.String)("BlockEntityTag")), ((net.minecraft.nbt.NBTBase)(life11_25)));
    moom.cU.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.item.ItemStack)(life10_21)));
    if (!((life8_9 == null))) { break forward_join_58; }
    }
    super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((float)(p3)), ((int)(p4)));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(net.minecraft.world.World p0, net.minecraft.entity.player.EntityPlayer p1, moom.DT p2, net.minecraft.block.state.IBlockState p3, net.minecraft.tileentity.TileEntity p4) {
net.minecraft.tileentity.TileEntity forwardValue3091_12_0;
    net.minecraft.tileentity.TileEntity spill3091_0;
    long life6_3;
    int[] life8_5;
    moom.Ca life9_19;
    net.minecraft.item.ItemStack life10_28;
    net.minecraft.nbt.NBTTagCompound life11_32;
    forward_join_50: {
    forward_join_43: {
    forward_join_12: {
    life6_3 = (moom.cU.T ^ 36936628346349L);
    life8_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3091_0 = p4;
    if (!((life8_5 != null))) {
        forwardValue3091_12_0 = spill3091_0;
        break forward_join_12;
    }
    if (!((((spill3091_0 instanceof moom.Ca) ? 1 : 0) != 0))) {
        break forward_join_43;
    }
    forwardValue3091_12_0 = p4;
    }
    life9_19 = ((moom.Ca)(forwardValue3091_12_0));
    life10_28 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.ci, 1, ((moom.Ca)(((moom.Ca)(p4)))).a__sourceReturn_8abf5c6871());
    life11_32 = new net.minecraft.nbt.NBTTagCompound();
    moom.Ca.a(((net.minecraft.nbt.NBTTagCompound)(life11_32)), ((int)(((moom.Ca)(life9_19)).a__sourceReturn_8abf5c6871())), ((net.minecraft.nbt.NBTTagList)(((moom.Ca)(life9_19)).a__yz())));
    ((net.minecraft.item.ItemStack)(life10_28)).a(((java.lang.String)("BlockEntityTag")), ((net.minecraft.nbt.NBTBase)(life11_32)));
    moom.cU.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p2)), ((net.minecraft.item.ItemStack)(life10_28)));
    if (!((life8_5 == null))) {
        break forward_join_50;
    }
    }
    super.a(((net.minecraft.world.World)(p0)), ((net.minecraft.entity.player.EntityPlayer)(p1)), ((moom.DT)(p2)), ((net.minecraft.block.state.IBlockState)(p3)), ((net.minecraft.tileentity.TileEntity)(null)));
    }
    return;
}


public moom.CA a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
return null;
}


public moom.CA a__CA(net.minecraft.world.World p0, moom.DT p1) {
((moom.cU)(this)).a__Void(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)));
    return super.a__CA(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
}


public java.lang.String a__String() {
return net.minecraft.util.StatCollector.a(((java.lang.String)("item.banner.white.name")));
}


public net.minecraft.tileentity.TileEntity a(net.minecraft.world.World p0, int p1) {
return new moom.Ca();
}


public boolean a__Boolean(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
return ((1) != 0);
}


public boolean g() {
return ((0) != 0);
}


public boolean j() {
return ((0) != 0);
}

}
