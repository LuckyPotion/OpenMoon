package moom;


public class c_ extends moom.cT {

public static final moom.fv R;

private static final long S;

private static final long T;

protected c_() {
super(moom.fn.d, moom.fm.l);
    (this).a__Void(((this.M).a__fE()).a__fE(moom.c_.R, java.lang.Boolean.FALSE));
    (this).a(net.minecraft.creativetab.CreativeTabs.c);
}


static {
S = ((long)(((moom._a)(moom._c.a(((long)(-5923532416166824862L)), ((long)(43947313240634288L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(96383275544472L)))));
    long local0_life6 = (moom.c_.S ^ 84508868600482L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill793_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill793_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill793_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill793_13 = new byte[8];
    (__sourceSpill793_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill793_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation793_15 = __sourceSpill793_13;
    ((javax.crypto.Cipher)(__sourceSpill793_10)).init(((int)(__sourceSpill793_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill793_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation793_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 7065003215469047133L;
    byte[] __sourceSpill793_19 = new byte[8];
    (__sourceSpill793_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill793_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill793_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill793_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill793_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill793_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill793_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill793_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill793_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill793_20)).doFinal(((byte[])(__sourceSpill793_19)));
    T = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
    R = ((moom.fv)(moom.fv.a(((java.lang.String)("has_record")))));
}


public int b(net.minecraft.block.state.IBlockState p0) {
int forwardValue3117_15_0;
    int forwardValue3117_17_0;
    boolean spill3117_0;
    long life2_3;
    int[] life4_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_15: {
    life2_3 = (moom.c_.S ^ 77623790070199L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3117_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.c_.R))))))).booleanValue();
    if (!((life4_5 != null))) {
        forwardValue3117_15_0 = ((spill3117_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!(spill3117_0)) {
        break forward_join_16;
    }
    forwardValue3117_15_0 = 1;
    }
    forwardValue3117_17_0 = forwardValue3117_15_0;
    break forward_join_17;
    }
    forwardValue3117_17_0 = 0;
    }
    return forwardValue3117_17_0;
}


public int b(net.minecraft.world.World p0, moom.DT p1) {
net.minecraft.item.ItemStack forwardValue3118_24_0;
    int forwardValue3118_33_0;
    int[] spill3118_0;
    int spill3118_1;
    net.minecraft.item.ItemStack spill3118_2;
    long life3_3;
    net.minecraft.tileentity.TileEntity life6_8;
    int[] life5_9;
    net.minecraft.item.ItemStack life7_21;
    forward_join_33: {
    forward_join_32: {
    forward_join_24: {
    life3_3 = (moom.c_.S ^ 67921542131274L);
    spill3118_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_8 = ((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(p1)));
    life5_9 = spill3118_0;
    spill3118_1 = ((life6_8 instanceof moom.B_) ? 1 : 0);
    if (!((life5_9 != null))) {
        forwardValue3118_33_0 = spill3118_1;
        break forward_join_33;
    }
    if (!((spill3118_1 != 0))) {
        break forward_join_32;
    }
    life7_21 = ((moom.B_)(((moom.B_)(life6_8)))).a__sourceReturn_bd21db05da();
    spill3118_2 = life7_21;
    if (!((life5_9 != null))) {
        forwardValue3118_24_0 = spill3118_2;
        break forward_join_24;
    }
    if (!((spill3118_2 != null))) {
        break forward_join_32;
    }
    forwardValue3118_24_0 = life7_21;
    }
    return ((net.minecraft.item.Item.a(((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(forwardValue3118_24_0)).a__wQ()))) + 1) - net.minecraft.item.Item.a(((net.minecraft.item.Item)(net.minecraft.init.Items.b5))));
    }
    forwardValue3118_33_0 = 0;
    }
    return forwardValue3118_33_0;
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
net.minecraft.block.state.IBlockState forwardValue3119_14_0;
    moom.fv forwardValue3119_14_1;
    int forwardValue3119_14_2;
    net.minecraft.block.state.IBlockState forwardValue3119_15_0;
    moom.fv forwardValue3119_15_1;
    net.minecraft.block.state.IBlockState forwardValue3119_16_0;
    moom.fv forwardValue3119_16_1;
    int forwardValue3119_16_2;
    net.minecraft.block.state.IBlockState spill3119_0;
    moom.fv spill3119_1;
    int spill3119_2;
    long life2_3;
    int[] life4_5;
    forward_join_16: {
    forward_join_15: {
    forward_join_14: {
    life2_3 = (moom.c_.S ^ 81557455278781L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3119_0 = ((moom.c_)(this)).a__fE();
    spill3119_1 = moom.c_.R;
    spill3119_2 = p0;
    if (!((life4_5 != null))) {
        forwardValue3119_14_0 = spill3119_0;
        forwardValue3119_14_1 = spill3119_1;
        forwardValue3119_14_2 = spill3119_2;
        break forward_join_14;
    }
    if (!((spill3119_2 > 0))) {
        forwardValue3119_15_0 = spill3119_0;
        forwardValue3119_15_1 = spill3119_1;
        break forward_join_15;
    }
    forwardValue3119_14_0 = spill3119_0;
    forwardValue3119_14_1 = spill3119_1;
    forwardValue3119_14_2 = 1;
    }
    forwardValue3119_16_0 = forwardValue3119_14_0;
    forwardValue3119_16_1 = forwardValue3119_14_1;
    forwardValue3119_16_2 = forwardValue3119_14_2;
    break forward_join_16;
    }
    forwardValue3119_16_0 = forwardValue3119_15_0;
    forwardValue3119_16_1 = forwardValue3119_15_1;
    forwardValue3119_16_2 = 0;
    }
    return ((net.minecraft.block.state.IBlockState)(forwardValue3119_16_0)).a__fE(((net.minecraft.block.properties.IProperty)(forwardValue3119_16_1)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue3119_16_2)))))));
}


public void c(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
((moom.c_)(this)).d(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    super.c(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    return;
}


public int c__Int() {
return 3;
}


private void d(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
net.minecraft.world.World forwardValue3120_12_0;
    net.minecraft.tileentity.TileEntity forwardValue3120_21_0;
    net.minecraft.world.World spill3120_0;
    net.minecraft.tileentity.TileEntity spill3120_1;
    long life4_3;
    int[] life6_5;
    net.minecraft.tileentity.TileEntity life7_20;
    moom.B_ life8_34;
    net.minecraft.item.ItemStack life9_37;
    float life10_62;
    double life11_76;
    double life13_92;
    double life15_106;
    net.minecraft.item.ItemStack life17_109;
    net.minecraft.entity.item.EntityItem life18_130;
    forward_join_119: {
    forward_join_43: {
    forward_join_21: {
    forward_join_12: {
    life4_3 = (moom.c_.S ^ 102814057379915L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3120_0 = p0;
    if (!((life6_5 != null))) {
        forwardValue3120_12_0 = spill3120_0;
        break forward_join_12;
    }
    if (!((!((net.minecraft.world.World)(spill3120_0)).G))) {
        break forward_join_119;
    }
    forwardValue3120_12_0 = p0;
    }
    life7_20 = ((net.minecraft.world.World)(forwardValue3120_12_0)).a__B9(((moom.DT)(p1)));
    spill3120_1 = life7_20;
    if (!((life6_5 != null))) {
        forwardValue3120_21_0 = spill3120_1;
        break forward_join_21;
    }
    if (!((((spill3120_1 instanceof moom.B_) ? 1 : 0) != 0))) {
        break forward_join_119;
    }
    forwardValue3120_21_0 = life7_20;
    }
    life8_34 = ((moom.B_)(forwardValue3120_21_0));
    life9_37 = ((moom.B_)(life8_34)).a__sourceReturn_bd21db05da();
    if (!((life6_5 != null))) {
        break forward_join_43;
    }
    if (!((life9_37 != null))) {
        break forward_join_119;
    }
    ((net.minecraft.world.World)(p0)).b(((int)(((int) moom.c_.T))), ((moom.DT)(p1)), ((int)(0)));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((java.lang.String)(null)));
    ((moom.B_)(life8_34)).a(((net.minecraft.item.ItemStack)(null)));
    }
    life10_62 = 0x1.666666p-1f;
    life11_76 = (((double) (((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextFloat() * life10_62)) + (((double) (0x1.0p0f - life10_62)) * 0x1.0p-1d));
    life13_92 = ((((double) (((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextFloat() * life10_62)) + (((double) (0x1.0p0f - life10_62)) * 0x1.999999999999ap-3d)) + 0x1.3333333333333p-1d);
    life15_106 = (((double) (((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextFloat() * life10_62)) + (((double) (0x1.0p0f - life10_62)) * 0x1.0p-1d));
    life17_109 = ((net.minecraft.item.ItemStack)(life9_37)).a__xW();
    life18_130 = new net.minecraft.entity.item.EntityItem(p0, (((double) ((moom.DT)(p1)).a()) + life11_76), (((double) ((moom.DT)(p1)).b()) + life13_92), (((double) ((moom.DT)(p1)).c()) + life15_106), life17_109);
    ((net.minecraft.entity.item.EntityItem)(life18_130)).w__sourceReturn_da8c82d5d4();
    ((net.minecraft.world.World)(p0)).b__Boolean(((net.minecraft.entity.Entity)(life18_130)));
    }
    return;
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.c_.R});
}


public boolean a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.player.EntityPlayer p3, moom.bs p4, float p5, float p6, float p7) {
int forwardValue3115_33_0;
    boolean spill3115_0;
    long life9_3;
    int[] life11_5;
    net.minecraft.block.state.IBlockState life3_26;
    forward_join_33: {
    forward_join_32: {
    life9_3 = (moom.c_.S ^ 4487104449021L);
    life11_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3115_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.c_.R))))))).booleanValue();
    if (!((life11_5 != null))) {
        forwardValue3115_33_0 = ((spill3115_0) ? 1 : 0);
        break forward_join_33;
    }
    if (!(spill3115_0)) {
        break forward_join_32;
    }
    ((moom.c_)(this)).d(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    life3_26 = ((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.c_.R)), ((java.lang.Comparable)(java.lang.Boolean.FALSE)));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(life3_26)), ((int)(2)));
    return ((1) != 0);
    }
    forwardValue3115_33_0 = 0;
    }
    return ((forwardValue3115_33_0) != 0);
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.item.ItemStack p3) {
net.minecraft.world.World forwardValue3116_12_0;
    int forwardValue3116_39_0;
    net.minecraft.world.World spill3116_0;
    int spill3116_1;
    long life5_3;
    int[] life7_5;
    net.minecraft.tileentity.TileEntity life8_20;
    forward_join_40: {
    forward_join_39: {
    forward_join_12: {
    life5_3 = (moom.c_.S ^ 89749411562272L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3116_0 = p0;
    if (!((life7_5 != null))) {
        forwardValue3116_12_0 = spill3116_0;
        break forward_join_12;
    }
    if (!((!((net.minecraft.world.World)(spill3116_0)).G))) {
        break forward_join_40;
    }
    forwardValue3116_12_0 = p0;
    }
    life8_20 = ((net.minecraft.world.World)(forwardValue3116_12_0)).a__B9(((moom.DT)(p1)));
    spill3116_1 = ((life8_20 instanceof moom.B_) ? 1 : 0);
    if (!((life7_5 != null))) {
        forwardValue3116_39_0 = spill3116_1;
        break forward_join_39;
    }
    if (!((spill3116_1 != 0))) {
        break forward_join_40;
    }
    ((moom.B_)(((moom.B_)(life8_20)))).a(((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(((net.minecraft.item.ItemStack)(p3)).a__wQ(), 1, ((net.minecraft.item.ItemStack)(p3)).c()))));
    forwardValue3116_39_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.c_.R)), ((java.lang.Comparable)(java.lang.Boolean.TRUE))))), ((int)(2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3116_39_0);
    }
    return;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, float p3, int p4) {
long local6 = (moom.c_.S ^ 122852763475278L);
    if ((((((net.minecraft.world.World)(p0)).G) ? 1 : 0) == 0)) {
        super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((float)(p3)), ((int)(0)));
    }
    return;
}


public net.minecraft.tileentity.TileEntity a(net.minecraft.world.World p0, int p1) {
return new moom.B_();
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean r() {
return ((1) != 0);
}


private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
